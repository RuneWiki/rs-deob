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

@OriginalClass("client!kw")
public class class346 extends class543 {

    @OriginalMember(owner = "client!kw", name = "Zd", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field4941 = new Hashtable();

    @OriginalMember(owner = "client!kw", name = "xe", descriptor = "I")
    public int field4965 = 128;

    @OriginalMember(owner = "client!kw", name = "se", descriptor = "Lida;")
    private class270 field4960 = new class270();

    @OriginalMember(owner = "client!kw", name = "ye", descriptor = "Lot;")
    private class378 field4966 = new class378();

    @OriginalMember(owner = "client!kw", name = "ze", descriptor = "Lot;")
    public class378 field4967 = new class378();

    @OriginalMember(owner = "client!kw", name = "De", descriptor = "I")
    public int field4971 = 8;

    @OriginalMember(owner = "client!kw", name = "Ce", descriptor = "I")
    public int field4970 = 3;

    @OriginalMember(owner = "client!kw", name = "Be", descriptor = "Z")
    private boolean field4969 = false;

    @OriginalMember(owner = "client!kw", name = "Ae", descriptor = "Lmr;")
    private class611 field4968 = new class611();

    @OriginalMember(owner = "client!kw", name = "Le", descriptor = "[Lvaa;")
    private class107[] field4979 = new class107[4];

    @OriginalMember(owner = "client!kw", name = "Ke", descriptor = "[Lvaa;")
    private class107[] field4978 = new class107[4];

    @OriginalMember(owner = "client!kw", name = "Ie", descriptor = "I")
    private int field4976 = -1;

    @OriginalMember(owner = "client!kw", name = "Je", descriptor = "[Lvaa;")
    private class107[] field4977 = new class107[4];

    @OriginalMember(owner = "client!kw", name = "Qe", descriptor = "I")
    private int field4984 = -1;

    @OriginalMember(owner = "client!kw", name = "Ne", descriptor = "I")
    private int field4981 = -1;

    @OriginalMember(owner = "client!kw", name = "Se", descriptor = "Lmr;")
    private class611 field4986;

    @OriginalMember(owner = "client!kw", name = "Ve", descriptor = "Lmr;")
    private class611 field4989;

    @OriginalMember(owner = "client!kw", name = "We", descriptor = "Lmr;")
    private class611 field4990;

    @OriginalMember(owner = "client!kw", name = "Xe", descriptor = "Lmr;")
    private class611 field4991;

    @OriginalMember(owner = "client!kw", name = "Ye", descriptor = "Lmr;")
    private class611 field4992;

    @OriginalMember(owner = "client!kw", name = "Ze", descriptor = "Lmr;")
    private class611 field4993;

    @OriginalMember(owner = "client!kw", name = "af", descriptor = "Lmr;")
    private class611 field4994;

    @OriginalMember(owner = "client!kw", name = "ef", descriptor = "Lot;")
    public class378 field4998;

    @OriginalMember(owner = "client!kw", name = "lf", descriptor = "Lot;")
    public class378 field5004;

    @OriginalMember(owner = "client!kw", name = "mf", descriptor = "Lot;")
    public class378 field5005;

    @OriginalMember(owner = "client!kw", name = "wf", descriptor = "F")
    private float field5015;

    @OriginalMember(owner = "client!kw", name = "Xf", descriptor = "I")
    public int field5042;

    @OriginalMember(owner = "client!kw", name = "pf", descriptor = "I")
    private int field5008;

    @OriginalMember(owner = "client!kw", name = "Gf", descriptor = "Z")
    private boolean field5025;

    @OriginalMember(owner = "client!kw", name = "Kf", descriptor = "F")
    public float field5029;

    @OriginalMember(owner = "client!kw", name = "tf", descriptor = "F")
    private float field5012;

    @OriginalMember(owner = "client!kw", name = "ig", descriptor = "F")
    public float field5053;

    @OriginalMember(owner = "client!kw", name = "jg", descriptor = "I")
    private int field5054;

    @OriginalMember(owner = "client!kw", name = "Ff", descriptor = "F")
    private float field5024;

    @OriginalMember(owner = "client!kw", name = "Zf", descriptor = "[F")
    private float[] field5044;

    @OriginalMember(owner = "client!kw", name = "Pf", descriptor = "I")
    private int field5034;

    @OriginalMember(owner = "client!kw", name = "Eg", descriptor = "I")
    public int field5075;

    @OriginalMember(owner = "client!kw", name = "og", descriptor = "I")
    private int field5059;

    @OriginalMember(owner = "client!kw", name = "of", descriptor = "I")
    private int field5007;

    @OriginalMember(owner = "client!kw", name = "Ig", descriptor = "[F")
    private float[] field5079;

    @OriginalMember(owner = "client!kw", name = "rf", descriptor = "I")
    private int field5010;

    @OriginalMember(owner = "client!kw", name = "tg", descriptor = "I")
    private int field5064;

    @OriginalMember(owner = "client!kw", name = "Gg", descriptor = "F")
    public float field5077;

    @OriginalMember(owner = "client!kw", name = "Og", descriptor = "I")
    public int field5085;

    @OriginalMember(owner = "client!kw", name = "Qg", descriptor = "F")
    public float field5087;

    @OriginalMember(owner = "client!kw", name = "yf", descriptor = "I")
    public int field5017;

    @OriginalMember(owner = "client!kw", name = "Bg", descriptor = "I")
    public int field5072;

    @OriginalMember(owner = "client!kw", name = "Af", descriptor = "F")
    public float field5019;

    @OriginalMember(owner = "client!kw", name = "Jf", descriptor = "I")
    public int field5028;

    @OriginalMember(owner = "client!kw", name = "Sg", descriptor = "I")
    private int field5089;

    @OriginalMember(owner = "client!kw", name = "Cg", descriptor = "I")
    public int field5073;

    @OriginalMember(owner = "client!kw", name = "Vg", descriptor = "F")
    public float field5092;

    @OriginalMember(owner = "client!kw", name = "Yg", descriptor = "F")
    private float field5095;

    @OriginalMember(owner = "client!kw", name = "dg", descriptor = "[Lwh;")
    private class40[] field5048;

    @OriginalMember(owner = "client!kw", name = "gg", descriptor = "I")
    private int field5051;

    @OriginalMember(owner = "client!kw", name = "kh", descriptor = "F")
    private float field5107;

    @OriginalMember(owner = "client!kw", name = "wg", descriptor = "I")
    public int field5067;

    @OriginalMember(owner = "client!kw", name = "Vf", descriptor = "I")
    private int field5040;

    @OriginalMember(owner = "client!kw", name = "ph", descriptor = "[F")
    private float[] field5112;

    @OriginalMember(owner = "client!kw", name = "Yf", descriptor = "I")
    public int field5043;

    @OriginalMember(owner = "client!kw", name = "oh", descriptor = "[F")
    public float[] field5111;

    @OriginalMember(owner = "client!kw", name = "mh", descriptor = "F")
    public float field5109;

    @OriginalMember(owner = "client!kw", name = "Xg", descriptor = "I")
    public int field5094;

    @OriginalMember(owner = "client!kw", name = "Zg", descriptor = "Z")
    private boolean field5096;

    @OriginalMember(owner = "client!kw", name = "ih", descriptor = "[F")
    private float[] field5105;

    @OriginalMember(owner = "client!kw", name = "nh", descriptor = "I")
    public int field5110;

    @OriginalMember(owner = "client!kw", name = "Wg", descriptor = "Lag;")
    public class212 field5093;

    @OriginalMember(owner = "client!kw", name = "wh", descriptor = "[B")
    public byte[] field5119;

    @OriginalMember(owner = "client!kw", name = "uh", descriptor = "[I")
    public int[] field5117;

    @OriginalMember(owner = "client!kw", name = "vh", descriptor = "[I")
    public int[] field5118;

    @OriginalMember(owner = "client!kw", name = "yh", descriptor = "[I")
    public int[] field5121;

    @OriginalMember(owner = "client!kw", name = "ve", descriptor = "I")
    public int field4963;

    @OriginalMember(owner = "client!kw", name = "Ic", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4872;

    @OriginalMember(owner = "client!kw", name = "yc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4862;

    @OriginalMember(owner = "client!kw", name = "lc", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field4849;

    @OriginalMember(owner = "client!kw", name = "ic", descriptor = "J")
    private long field4846;

    @OriginalMember(owner = "client!kw", name = "lb", descriptor = "J")
    private long field4797;

    @OriginalMember(owner = "client!kw", name = "cg", descriptor = "Z")
    public boolean field5047;

    @OriginalMember(owner = "client!kw", name = "If", descriptor = "I")
    public int field5027;

    @OriginalMember(owner = "client!kw", name = "xf", descriptor = "Ljava/lang/String;")
    private String field5016;

    @OriginalMember(owner = "client!kw", name = "qh", descriptor = "Z")
    public boolean field5113;

    @OriginalMember(owner = "client!kw", name = "yg", descriptor = "Z")
    public boolean field5069;

    @OriginalMember(owner = "client!kw", name = "Rf", descriptor = "Z")
    private boolean field5036;

    @OriginalMember(owner = "client!kw", name = "Qf", descriptor = "Z")
    public boolean field5035;

    @OriginalMember(owner = "client!kw", name = "Hf", descriptor = "Z")
    public boolean field5026;

    @OriginalMember(owner = "client!kw", name = "zf", descriptor = "Z")
    private boolean field5018;

    @OriginalMember(owner = "client!kw", name = "Of", descriptor = "Ljava/lang/String;")
    private String field5033;

    @OriginalMember(owner = "client!kw", name = "nf", descriptor = "Z")
    public boolean field5006;

    @OriginalMember(owner = "client!kw", name = "Rg", descriptor = "Z")
    private boolean field5088;

    @OriginalMember(owner = "client!kw", name = "te", descriptor = "Lbv;")
    private class481 field4961;

    @OriginalMember(owner = "client!kw", name = "Ge", descriptor = "Ltp;")
    public class294 field4974;

    @OriginalMember(owner = "client!kw", name = "re", descriptor = "Lbc;")
    private class330 field4959;

    @OriginalMember(owner = "client!kw", name = "we", descriptor = "Lsf;")
    private class525 field4964;

    @OriginalMember(owner = "client!kw", name = "ue", descriptor = "Ljga;")
    private class127 field4962;

    @OriginalMember(owner = "client!kw", name = "L", descriptor = "I")
    public static int field4771 = -1;

    @OriginalMember(owner = "client!kw", name = "Od", descriptor = "J")
    public static long field4930 = 20000000L;

    @OriginalMember(owner = "client!kw", name = "yd", descriptor = "Lgr;")
    public static class530 field4914 = new class530(76, 2);

    @OriginalMember(owner = "client!kw", name = "ee", descriptor = "[I")
    public static int[] field4946 = new int[1];

    @OriginalMember(owner = "client!kw", name = "ke", descriptor = "[I")
    public static int[] field4952 = null;

    @OriginalMember(owner = "client!kw", name = "Sf", descriptor = "F")
    public float field5037;

    @OriginalMember(owner = "client!kw", name = "ag", descriptor = "F")
    public float field5045;

    @OriginalMember(owner = "client!kw", name = "sg", descriptor = "F")
    public float field5063;

    @OriginalMember(owner = "client!kw", name = "Ag", descriptor = "F")
    public float field5071;

    @OriginalMember(owner = "client!kw", name = "Jg", descriptor = "F")
    private float field5080;

    @OriginalMember(owner = "client!kw", name = "Lg", descriptor = "F")
    private float field5082;

    @OriginalMember(owner = "client!kw", name = "Ug", descriptor = "F")
    private float field5091;

    @OriginalMember(owner = "client!kw", name = "jh", descriptor = "F")
    public float field5106;

    @OriginalMember(owner = "client!kw", name = "sh", descriptor = "F")
    public float field5115;

    @OriginalMember(owner = "client!kw", name = "r", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!kw", name = "s", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!kw", name = "t", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!kw", name = "u", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!kw", name = "v", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!kw", name = "w", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!kw", name = "y", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!kw", name = "A", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!kw", name = "B", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!kw", name = "C", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!kw", name = "D", descriptor = "I")
    public int field4763;

    @OriginalMember(owner = "client!kw", name = "E", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!kw", name = "F", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!kw", name = "G", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!kw", name = "H", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!kw", name = "I", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!kw", name = "J", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!kw", name = "K", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!kw", name = "M", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!kw", name = "N", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!kw", name = "O", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!kw", name = "P", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!kw", name = "Q", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!kw", name = "R", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!kw", name = "S", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!kw", name = "T", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!kw", name = "U", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!kw", name = "V", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!kw", name = "W", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!kw", name = "X", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!kw", name = "Y", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!kw", name = "Z", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!kw", name = "ab", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!kw", name = "bb", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!kw", name = "cb", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!kw", name = "db", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!kw", name = "eb", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!kw", name = "fb", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!kw", name = "gb", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!kw", name = "hb", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!kw", name = "ib", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!kw", name = "jb", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!kw", name = "kb", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!kw", name = "mb", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!kw", name = "nb", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!kw", name = "ob", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!kw", name = "pb", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!kw", name = "qb", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!kw", name = "rb", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!kw", name = "sb", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!kw", name = "tb", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!kw", name = "ub", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!kw", name = "vb", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!kw", name = "wb", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!kw", name = "xb", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!kw", name = "yb", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!kw", name = "zb", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!kw", name = "Ab", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!kw", name = "Bb", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!kw", name = "Cb", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!kw", name = "Db", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!kw", name = "Eb", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!kw", name = "Fb", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!kw", name = "Gb", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!kw", name = "Hb", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!kw", name = "Ib", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!kw", name = "Jb", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!kw", name = "Kb", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!kw", name = "Lb", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!kw", name = "Mb", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!kw", name = "Nb", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!kw", name = "Ob", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!kw", name = "Pb", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!kw", name = "Qb", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!kw", name = "Rb", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!kw", name = "Sb", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!kw", name = "Tb", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!kw", name = "Ub", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!kw", name = "Vb", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!kw", name = "Wb", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!kw", name = "Xb", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!kw", name = "Yb", descriptor = "I")
    public int field4836;

    @OriginalMember(owner = "client!kw", name = "Zb", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!kw", name = "ac", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!kw", name = "bc", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!kw", name = "cc", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!kw", name = "dc", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!kw", name = "ec", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!kw", name = "fc", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!kw", name = "gc", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!kw", name = "hc", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!kw", name = "jc", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!kw", name = "kc", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!kw", name = "mc", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!kw", name = "nc", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!kw", name = "oc", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!kw", name = "pc", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!kw", name = "qc", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!kw", name = "rc", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!kw", name = "sc", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!kw", name = "tc", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!kw", name = "uc", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!kw", name = "vc", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!kw", name = "wc", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!kw", name = "xc", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!kw", name = "zc", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!kw", name = "Ac", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!kw", name = "Bc", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!kw", name = "Cc", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!kw", name = "Dc", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!kw", name = "Ec", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!kw", name = "Fc", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!kw", name = "Gc", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!kw", name = "Hc", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!kw", name = "Jc", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!kw", name = "Kc", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!kw", name = "Lc", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!kw", name = "Mc", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!kw", name = "Nc", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!kw", name = "Oc", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!kw", name = "Pc", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!kw", name = "Qc", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!kw", name = "Rc", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!kw", name = "Sc", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!kw", name = "Tc", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!kw", name = "Uc", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!kw", name = "Vc", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!kw", name = "Wc", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!kw", name = "Xc", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!kw", name = "Yc", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!kw", name = "Zc", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!kw", name = "ad", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!kw", name = "bd", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!kw", name = "cd", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!kw", name = "dd", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!kw", name = "ed", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!kw", name = "fd", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!kw", name = "gd", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!kw", name = "hd", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!kw", name = "id", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!kw", name = "jd", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!kw", name = "kd", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!kw", name = "ld", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!kw", name = "md", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!kw", name = "nd", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!kw", name = "od", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!kw", name = "pd", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!kw", name = "qd", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!kw", name = "rd", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!kw", name = "sd", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!kw", name = "td", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!kw", name = "ud", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!kw", name = "vd", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!kw", name = "wd", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!kw", name = "xd", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!kw", name = "zd", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!kw", name = "Ad", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!kw", name = "Bd", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!kw", name = "Cd", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!kw", name = "Dd", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!kw", name = "Ed", descriptor = "I")
    private int field4920;

    @OriginalMember(owner = "client!kw", name = "Fd", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!kw", name = "Gd", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!kw", name = "Hd", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!kw", name = "Id", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!kw", name = "Jd", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!kw", name = "Kd", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!kw", name = "Ld", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!kw", name = "Md", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!kw", name = "Nd", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!kw", name = "Pd", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!kw", name = "Qd", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!kw", name = "Rd", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!kw", name = "Sd", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!kw", name = "Td", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!kw", name = "Ud", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!kw", name = "Vd", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!kw", name = "Wd", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!kw", name = "Xd", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!kw", name = "Yd", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!kw", name = "ae", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!kw", name = "be", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!kw", name = "ce", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!kw", name = "de", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!kw", name = "fe", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!kw", name = "ge", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!kw", name = "he", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!kw", name = "ie", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!kw", name = "le", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!kw", name = "me", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!kw", name = "ne", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!kw", name = "oe", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!kw", name = "pe", descriptor = "I")
    private int field4957;

    @OriginalMember(owner = "client!kw", name = "qe", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!kw", name = "Fe", descriptor = "I")
    public int field4973;

    @OriginalMember(owner = "client!kw", name = "Re", descriptor = "I")
    public int field4985;

    @OriginalMember(owner = "client!kw", name = "Te", descriptor = "I")
    private int field4987;

    @OriginalMember(owner = "client!kw", name = "Ue", descriptor = "I")
    public int field4988;

    @OriginalMember(owner = "client!kw", name = "cf", descriptor = "I")
    private int field4996;

    @OriginalMember(owner = "client!kw", name = "ff", descriptor = "I")
    private int field4999;

    @OriginalMember(owner = "client!kw", name = "kf", descriptor = "I")
    private int field5003;

    @OriginalMember(owner = "client!kw", name = "kg", descriptor = "I")
    public int field5055;

    @OriginalMember(owner = "client!kw", name = "mg", descriptor = "I")
    private int field5057;

    @OriginalMember(owner = "client!kw", name = "ng", descriptor = "I")
    private int field5058;

    @OriginalMember(owner = "client!kw", name = "pg", descriptor = "I")
    private int field5060;

    @OriginalMember(owner = "client!kw", name = "rg", descriptor = "I")
    private int field5062;

    @OriginalMember(owner = "client!kw", name = "ug", descriptor = "I")
    public int field5065;

    @OriginalMember(owner = "client!kw", name = "zg", descriptor = "I")
    private int field5070;

    @OriginalMember(owner = "client!kw", name = "Kg", descriptor = "I")
    private int field5081;

    @OriginalMember(owner = "client!kw", name = "Mg", descriptor = "I")
    private int field5083;

    @OriginalMember(owner = "client!kw", name = "Ng", descriptor = "I")
    public int field5084;

    @OriginalMember(owner = "client!kw", name = "bh", descriptor = "I")
    private int field5098;

    @OriginalMember(owner = "client!kw", name = "fh", descriptor = "I")
    public int field5102;

    @OriginalMember(owner = "client!kw", name = "th", descriptor = "I")
    private int field5116;

    @OriginalMember(owner = "client!kw", name = "xh", descriptor = "I")
    private int field5120;

    @OriginalMember(owner = "client!kw", name = "jf", descriptor = "J")
    private long field5002;

    @OriginalMember(owner = "client!kw", name = "Me", descriptor = "Lvaa;")
    private class107 field4980;

    @OriginalMember(owner = "client!kw", name = "Pe", descriptor = "Lvaa;")
    private class107 field4983;

    @OriginalMember(owner = "client!kw", name = "Hg", descriptor = "Llo;")
    private class116 field5078;

    @OriginalMember(owner = "client!kw", name = "Ef", descriptor = "Lol;")
    public class246 field5023;

    @OriginalMember(owner = "client!kw", name = "eg", descriptor = "Llca;")
    private class52 field5049;

    @OriginalMember(owner = "client!kw", name = "ah", descriptor = "Llca;")
    private class52 field5097;

    @OriginalMember(owner = "client!kw", name = "sf", descriptor = "Lam;")
    public class55 field5011;

    @OriginalMember(owner = "client!kw", name = "Df", descriptor = "Lam;")
    public class55 field5022;

    @OriginalMember(owner = "client!kw", name = "Tf", descriptor = "Lam;")
    public class55 field5038;

    @OriginalMember(owner = "client!kw", name = "Uf", descriptor = "Lam;")
    public class55 field5039;

    @OriginalMember(owner = "client!kw", name = "lg", descriptor = "Lam;")
    public class55 field5056;

    @OriginalMember(owner = "client!kw", name = "vg", descriptor = "Lam;")
    public class55 field5066;

    @OriginalMember(owner = "client!kw", name = "Pg", descriptor = "Lam;")
    public class55 field5086;

    @OriginalMember(owner = "client!kw", name = "Tg", descriptor = "Lam;")
    public class55 field5090;

    @OriginalMember(owner = "client!kw", name = "gh", descriptor = "Lam;")
    public class55 field5103;

    @OriginalMember(owner = "client!kw", name = "lh", descriptor = "Lam;")
    public class55 field5108;

    @OriginalMember(owner = "client!kw", name = "Oe", descriptor = "Ltg;")
    private class604 field4982;

    @OriginalMember(owner = "client!kw", name = "qg", descriptor = "Ltg;")
    public class604 field5061;

    @OriginalMember(owner = "client!kw", name = "Wf", descriptor = "Ltia;")
    private class708 field5041;

    @OriginalMember(owner = "client!kw", name = "He", descriptor = "Lmf;")
    private class733 field4975;

    @OriginalMember(owner = "client!kw", name = "Bf", descriptor = "Ljaa;")
    public class745 field5020;

    @OriginalMember(owner = "client!kw", name = "ch", descriptor = "Ljaa;")
    public class745 field5099;

    @OriginalMember(owner = "client!kw", name = "hh", descriptor = "Lof;")
    private class9 field5104;

    @OriginalMember(owner = "client!kw", name = "Ee", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field4972;

    @OriginalMember(owner = "client!kw", name = "bf", descriptor = "Z")
    private boolean field4995;

    @OriginalMember(owner = "client!kw", name = "df", descriptor = "Z")
    private boolean field4997;

    @OriginalMember(owner = "client!kw", name = "gf", descriptor = "Z")
    private boolean field5000;

    @OriginalMember(owner = "client!kw", name = "hf", descriptor = "Z")
    private boolean field5001;

    @OriginalMember(owner = "client!kw", name = "qf", descriptor = "Z")
    public boolean field5009;

    @OriginalMember(owner = "client!kw", name = "uf", descriptor = "Z")
    private boolean field5013;

    @OriginalMember(owner = "client!kw", name = "vf", descriptor = "Z")
    private boolean field5014;

    @OriginalMember(owner = "client!kw", name = "Cf", descriptor = "Z")
    public boolean field5021;

    @OriginalMember(owner = "client!kw", name = "Lf", descriptor = "Z")
    public boolean field5030;

    @OriginalMember(owner = "client!kw", name = "Mf", descriptor = "Z")
    private boolean field5031;

    @OriginalMember(owner = "client!kw", name = "bg", descriptor = "Z")
    private boolean field5046;

    @OriginalMember(owner = "client!kw", name = "fg", descriptor = "Z")
    public boolean field5050;

    @OriginalMember(owner = "client!kw", name = "hg", descriptor = "Z")
    public boolean field5052;

    @OriginalMember(owner = "client!kw", name = "xg", descriptor = "Z")
    private boolean field5068;

    @OriginalMember(owner = "client!kw", name = "Dg", descriptor = "Z")
    private boolean field5074;

    @OriginalMember(owner = "client!kw", name = "Fg", descriptor = "Z")
    public boolean field5076;

    @OriginalMember(owner = "client!kw", name = "dh", descriptor = "Z")
    public boolean field5100;

    @OriginalMember(owner = "client!kw", name = "eh", descriptor = "Z")
    private boolean field5101;

    @OriginalMember(owner = "client!kw", name = "rh", descriptor = "Z")
    public boolean field5114;

    @OriginalMember(owner = "client!kw", name = "Nf", descriptor = "[Lou;")
    private class158[] field5032;

    @OriginalMember(owner = "client!kw", name = "je", descriptor = "[[I")
    public static int[][] field4951;

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "(I)V", line = 5)
    public final void method340(int arg0) {
        ++field4897;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)Lza;", line = 16)
    public final class254 method205(int arg0) {
        ++field4799;
        class166 var2 = new class166(arg0);
        this.field4968.method3559(var2, (byte) 12);
        return var2;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIZ)Ltd;", line = 27)
    public final class515 method359(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field4814;
        return new class733(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(I)V", line = 35)
    private final void method2117(int arg0) {
        if (arg0 != 6) {
            this.method2130((byte) 37);
        }
        ++field4821;
        int var2 = 0;
        while (!this.field4849.method3369()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            class363.method2283(1000L, arg0 + -24250);
        }
    }

    @OriginalMember(owner = "client!kw", name = "E", descriptor = "()I", line = 58)
    public final int method331() {
        ++field4895;
        return this.field4987 + this.field4985 + this.field4988;
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(II)V", line = 66)
    public final void method1257(int arg0, int arg1) throws class360 {
        ++field4908;
        try {
            this.field4849.swapBuffers();
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(FFF)V", line = 87)
    public final void method1246(float arg0, float arg1, float arg2) {
        class265.field3790 = arg2;
        ++field4790;
        class217.field3249 = arg1;
        class115.field1603 = arg0;
    }

    @OriginalMember(owner = "client!kw", name = "da", descriptor = "(III[I)V", line = 100)
    public final void method330(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4907;
        float var5 = (float) arg2 * this.field4998.field5499 + (float) arg0 * this.field4998.field5476 + (float) arg1 * this.field4998.field5475 + this.field4998.field5490;
        if (!((float) this.field5043 > var5) && !((float) this.field5089 < var5)) {
            int var6 = (int) (((float) arg2 * this.field4998.field5487 + (float) arg0 * this.field4998.field5464 + (float) arg1 * this.field4998.field5465 + this.field4998.field5494) * (float) this.field5067 / var5);
            int var7 = (int) (((float) arg2 * this.field4998.field5468 + (float) arg0 * this.field4998.field5466 + (float) arg1 * this.field4998.field5503 + this.field4998.field5504) * (float) this.field5042 / var5);
            if ((float) var6 >= this.field5106 && this.field5115 >= (float) var6 && this.field5045 <= (float) var7 && (float) var7 <= this.field5037) {
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 - this.field5045);
                arg3[0] = (int) ((float) var6 - this.field5106);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(JZ)V", line = 132)
    public final synchronized void method2118(long arg0, boolean arg1) {
        ++field4873;
        class430 var4 = new class430();
        var4.field6188 = arg0;
        this.field4994.method3559(var4, (byte) 12);
        if (!arg1) {
            this.method217();
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 153)
    public final void method318(Canvas arg0, int arg1, int arg2) {
        ++field4758;
        if (this.field4872 == arg0) {
            throw new RuntimeException();
        } else if (!this.field4941.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field4849.prepareSurface(arg0);
                if (~var6 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field4941.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "K", descriptor = "([I)V", line = 195)
    public final void method358(int[] arg0) {
        ++field4860;
        arg0[2] = this.field5054;
        arg0[1] = this.field5064;
        arg0[0] = this.field5040;
        arg0[3] = this.field5010;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIII)Lss;", line = 207)
    public final class506 method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4903;
        return !this.field5030 ? null : new class51(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lot;B)V", line = 216)
    public final void method2119(class378 arg0, byte arg1) {
        ++field4782;
        OpenGL.glPushMatrix();
        if (arg1 == -128) {
            OpenGL.glMultMatrixf(arg0.method2350(false), 0);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lza;)V", line = 229)
    public final void method393(class254 arg0) {
        ++field4867;
        this.field4972 = ((class166) arg0).field2360;
        if (this.field5097 == null) {
            class212 var2 = new class212(80);
            if (!this.field5047) {
                var2.method1501(-1.0F, (byte) -37);
                var2.method1501(-1.0F, (byte) -53);
                var2.method1501(0.0F, (byte) -66);
                var2.method1501(0.0F, (byte) -84);
                var2.method1501(1.0F, (byte) -78);
                var2.method1501(1.0F, (byte) -42);
                var2.method1501(-1.0F, (byte) -94);
                var2.method1501(0.0F, (byte) -62);
                var2.method1501(1.0F, (byte) -46);
                var2.method1501(1.0F, (byte) -80);
                var2.method1501(1.0F, (byte) -51);
                var2.method1501(1.0F, (byte) -37);
                var2.method1501(0.0F, (byte) -122);
                var2.method1501(1.0F, (byte) -73);
                var2.method1501(0.0F, (byte) -38);
                var2.method1501(-1.0F, (byte) -115);
                var2.method1501(1.0F, (byte) -115);
                var2.method1501(0.0F, (byte) -109);
                var2.method1501(0.0F, (byte) -80);
                var2.method1501(0.0F, (byte) -69);
            } else {
                var2.method1502(-1.0F, (byte) 104);
                var2.method1502(-1.0F, (byte) 98);
                var2.method1502(0.0F, (byte) 73);
                var2.method1502(0.0F, (byte) 87);
                var2.method1502(1.0F, (byte) 125);
                var2.method1502(1.0F, (byte) 120);
                var2.method1502(-1.0F, (byte) 85);
                var2.method1502(0.0F, (byte) 110);
                var2.method1502(1.0F, (byte) 121);
                var2.method1502(1.0F, (byte) 109);
                var2.method1502(1.0F, (byte) 121);
                var2.method1502(1.0F, (byte) 96);
                var2.method1502(0.0F, (byte) 93);
                var2.method1502(1.0F, (byte) 74);
                var2.method1502(0.0F, (byte) 84);
                var2.method1502(-1.0F, (byte) 120);
                var2.method1502(1.0F, (byte) 86);
                var2.method1502(0.0F, (byte) 100);
                var2.method1502(0.0F, (byte) 74);
                var2.method1502(0.0F, (byte) 90);
            }
            this.field5097 = this.method2178(false, var2.field6864, var2.field6800, 20, true);
            this.field5099 = new class745(this.field5097, 5126, 3, 0);
            this.field5020 = new class745(this.field5097, 5126, 2, 12);
            this.field4960.method1762(this, (byte) 64);
        }
    }

    @OriginalMember(owner = "client!kw", name = "la", descriptor = "()V", line = 294)
    public final void method328() {
        ++field4828;
        this.field5010 = this.field4763;
        this.field5054 = this.field4836;
        this.field5040 = 0;
        this.field5064 = 0;
        OpenGL.glDisable(3089);
        this.method2151(99);
    }

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "(II)V", line = 309)
    public final void method2120(int arg0, int arg1) {
        ++field4839;
        if (~arg0 != -2) {
            if (~arg0 == -1) {
                this.method2149(-11771, 8448, 8448);
            } else if (arg0 != 2) {
                if (arg0 != 3) {
                    if (~arg0 == -5) {
                        this.method2149(-11771, 34023, 34023);
                    }
                } else {
                    this.method2149(-11771, 8448, 260);
                }
            } else {
                this.method2149(-11771, 7681, 34165);
            }
        } else {
            this.method2149(-11771, 7681, 7681);
        }
        if (arg1 <= 0) {
            this.method330(124, 20, -88, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "()Z", line = 341)
    public final boolean method292() {
        ++field4751;
        return true;
    }

    @OriginalMember(owner = "client!kw", name = "T", descriptor = "(IIII)V", line = 349)
    public final void method335(int arg0, int arg1, int arg2, int arg3) {
        ++field4945;
        if (this.field5040 < arg0) {
            this.field5040 = arg0;
        }
        if (arg1 > this.field5064) {
            this.field5064 = arg1;
        }
        if (arg2 < this.field5054) {
            this.field5054 = arg2;
        }
        if (~arg3 > ~this.field5010) {
            this.field5010 = arg3;
        }
        OpenGL.glEnable(3089);
        this.method2151(75);
        this.method2177(0);
    }

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "(I)V", line = 375)
    private final void method2121(int arg0) {
        OpenGL.glDepthMask(this.field5000 && this.field5096);
        if (arg0 != 34930) {
            this.field5064 = 116;
        }
        ++field4882;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V", line = 387)
    private final void method2122(byte arg0) {
        this.method2176(-2, arg0 ^ 75);
        ++field4915;
        for (int var2 = this.field5055 + -1; ~var2 <= -1; --var2) {
            this.method2171(arg0 ^ 73, var2);
            this.method2164(6, (class158) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2149(-11771, 8448, 8448);
        if (arg0 == 61) {
            this.method2167(34168, 770, 10603, 2);
            this.method2154(true);
            this.field4999 = 1;
            OpenGL.glEnable(3042);
            OpenGL.glBlendFunc(770, 771);
            this.field5003 = 1;
            OpenGL.glEnable(3008);
            OpenGL.glAlphaFunc(516, 0.0F);
            this.field5001 = true;
            OpenGL.glColorMask(true, true, true, true);
            this.field4997 = true;
            this.method2190(true, true);
            this.method2142(true, (byte) -111);
            this.method2180((byte) -86, true);
            this.method2160(true, arg0 ^ 35);
            this.method2137(-116);
            this.field4849.setSwapInterval(0);
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
                int var5 = 16384 - -var4;
                OpenGL.glLightfv(var5, 4608, var3, 0);
                OpenGL.glLightf(var5, 4615, 0.0F);
                OpenGL.glLightf(var5, 4616, 0.0F);
            }
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
            OpenGL.glFogf(2914, 0.95F);
            OpenGL.glFogi(2917, 9729);
            OpenGL.glHint(3156, 4353);
            this.field5007 = this.field5028 = -1;
            this.method328();
        }
    }

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "(II)V", line = 461)
    public final void method2123(int arg0, int arg1) {
        ++field4850;
        class709.field9960[0] = (float) class368.method2314(arg0, 16711680) / 1.671168E7F;
        class709.field9960[1] = (float) class368.method2314(arg0, 65280) / 65280.0F;
        class709.field9960[arg1] = (float) class368.method2314(arg0, 255) / 255.0F;
        class709.field9960[3] = (float) (arg0 >>> 24) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class709.field9960, 0);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IFFF)V", line = 473)
    private final void method2124(int arg0, float arg1, float arg2, float arg3) {
        ++field4843;
        OpenGL.glMatrixMode(arg0);
        if (this.field5068) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg3, arg1, arg2);
        OpenGL.glMatrixMode(5888);
        this.field5068 = true;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "([IIIIIZ)Ltd;", line = 490)
    public final class515 method339(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field4824;
        return new class733(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZLlo;)V", line = 498)
    public final void method2125(boolean arg0, class116 arg1) {
        if (this.field5078 != arg1) {
            if (this.field5036) {
                OpenGL.glBindBufferARB(34963, arg1.method823((byte) -119));
            }
            this.field5078 = arg1;
        }
        if (arg0) {
            this.method2124(-123, -0.47739008F, -0.20425938F, 0.91199344F);
        }
        ++field4783;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lup;Lrga;)Ldv;", line = 517)
    public final class86 method1231(class239 arg0, class290 arg1) {
        ++field4901;
        return null;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIII)V", line = 525)
    public final void method229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field4809;
        this.method380(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "(II)V", line = 537)
    public final synchronized void method2126(int arg0, int arg1) {
        ++field4848;
        if (arg1 != -4) {
            this.method235(false);
        }
        class430 var3 = new class430();
        var3.field6188 = (long) arg0;
        this.field4993.method3559(var3, (byte) 12);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZ)V", line = 551)
    public final void method2127(int arg0, boolean arg1) {
        if (arg0 != 11) {
            this.method305(-76, -42, -9, 65, -118, -27);
        }
        if (!arg1 != !this.field5074) {
            this.field5074 = arg1;
            this.method2170(false);
        }
        ++field4854;
    }

    @OriginalMember(owner = "client!kw", name = "ya", descriptor = "()V", line = 569)
    public final void method1235() {
        this.method2160(true, 15);
        ++field4808;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(B)V", line = 582)
    public final void method2128(byte arg0) {
        ++field4909;
        OpenGL.glPushMatrix();
        if (arg0 < 101) {
            this.field5096 = true;
        }
    }

    @OriginalMember(owner = "client!kw", name = "P", descriptor = "(IIIII)V", line = 593)
    public final void method268(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2169(9893);
        ++field4878;
        this.method2138(27032, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kw", name = "DA", descriptor = "(IIII)V", line = 614)
    public final void method398(int arg0, int arg1, int arg2, int arg3) {
        ++field4766;
        this.field5017 = arg0;
        this.field5110 = arg1;
        this.field5067 = arg2;
        this.field5042 = arg3;
        this.method2184(0);
        this.method2151(114);
        if (~this.field5057 == -4) {
            this.method2181(-121);
        } else if (this.field5057 == 2) {
            this.method2148(127);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Leea;)V", line = 637)
    public final void method214(class458 arg0) {
        ++field4943;
        this.field4960.method1764(false, this, -1, arg0);
    }

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "()Z", line = 645)
    public final boolean method207() {
        ++field4922;
        return true;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 653)
    public final void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.method2169(9893);
        ++field4902;
        this.method2138(27032, arg12);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "()Z", line = 675)
    public final boolean method365() {
        ++field4807;
        return true;
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(IIIIII)V", line = 683)
    public final void method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4955;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        this.method2169(9893);
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method2138(27032, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5013) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5013) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(IIIID)V", line = 717)
    public final void method1249(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field4912;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Leea;I)V", line = 724)
    public final void method216(class458 arg0, int arg1) {
        ++field4794;
        this.field4960.method1764(false, this, arg1, arg0);
    }

    @OriginalMember(owner = "client!kw", name = "KA", descriptor = "(IIII)V", line = 736)
    public final void method297(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        ++field4927;
        if (~this.field4836 > ~arg2) {
            arg2 = this.field4836;
        }
        if (~arg1 > -1) {
            arg1 = 0;
        }
        if (this.field4763 < arg3) {
            arg3 = this.field4763;
        }
        this.field5054 = arg2;
        this.field5064 = arg1;
        this.field5040 = arg0;
        this.field5010 = arg3;
        OpenGL.glEnable(3089);
        this.method2151(-38);
        this.method2177(0);
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(Z)V", line = 765)
    private final void method2129(boolean arg0) {
        if (arg0) {
            this.method2141(-88);
        }
        if (this.field4862 == null) {
            this.field4920 = this.field4957 = 0;
        } else {
            Dimension var2 = this.field4862.getSize();
            this.field4920 = var2.width;
            this.field4957 = var2.height;
        }
        ++field4883;
        if (this.field4980 == null) {
            this.field4763 = this.field4957;
            this.field4836 = this.field4920;
            this.method2191((byte) -127);
        }
        this.method2137(-85);
        this.method328();
    }

    @OriginalMember(owner = "client!kw", name = "A", descriptor = "(ILaa;II)V", line = 796)
    public final void method293(int arg0, class569 arg1, int arg2, int arg3) {
        ++field4823;
        class512 var5 = (class512) arg1;
        class9 var6 = var5.field7421;
        this.method2172(99);
        this.method2164(6, var5.field7421);
        this.method2138(27032, 1);
        this.method2149(-11771, 8448, 7681);
        this.method2167(34167, 768, 10603, 0);
        float var7 = var6.field71 / (float) var6.field74;
        float var8 = var6.field72 / (float) var6.field68;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5040) * var7, (float) (this.field5064 - arg3) * var8);
        OpenGL.glVertex2i(this.field5040, this.field5064);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5040) * var7, (float) (-arg3 + this.field5010) * var8);
        OpenGL.glVertex2i(this.field5040, this.field5010);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5054) * var7, (float) (-arg3 + this.field5010) * var8);
        OpenGL.glVertex2i(this.field5054, this.field5010);
        OpenGL.glTexCoord2f((float) (this.field5054 - arg2) * var7, (float) (-arg3 + this.field5064) * var8);
        OpenGL.glVertex2i(this.field5054, this.field5064);
        OpenGL.glEnd();
        this.method2167(5890, 768, 10603, 0);
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(B)V", line = 831)
    public final void method2130(byte arg0) {
        OpenGL.glPopMatrix();
        ++field4816;
        if (arg0 != 110) {
            this.field5022 = null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lvaa;I)V", line = 844)
    public final void method2131(class107 arg0, int arg1) {
        ++field4925;
        if (~this.field4981 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field4981 >= 0) {
                this.field4979[this.field4981].method793((byte) 92);
            }
            int var3 = 43 % ((47 - arg1) / 39);
            this.field4980 = this.field4979[++this.field4981] = arg0;
            this.field4980.method792(-1752);
        }
    }

    @OriginalMember(owner = "client!kw", name = "JA", descriptor = "(IIIIII)I", line = 865)
    public final int method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4910;
        int var7 = 0;
        float var8 = (float) arg2 * this.field4998.field5499 + (float) arg0 * this.field4998.field5476 + (float) arg1 * this.field4998.field5475 + this.field4998.field5490;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field4998.field5499 + (float) arg3 * this.field4998.field5476 + (float) arg4 * this.field4998.field5475 + this.field4998.field5490;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field5043 && var9 < (float) this.field5043) {
            var7 |= 16;
        } else if (var8 > (float) this.field5089 && (float) this.field5089 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field4998.field5487 + (float) arg0 * this.field4998.field5464 + (float) arg1 * this.field4998.field5465 + this.field4998.field5494) * (float) this.field5067 / var8);
        int var11 = (int) (((float) arg5 * this.field4998.field5487 + (float) arg3 * this.field4998.field5464 + (float) arg4 * this.field4998.field5465 + this.field4998.field5494) * (float) this.field5067 / var9);
        if ((float) var10 < this.field5106 && this.field5106 > (float) var11) {
            var7 |= 1;
        } else if (this.field5115 < (float) var10 && (float) var11 > this.field5115) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field4998.field5468 + (float) arg0 * this.field4998.field5466 + (float) arg1 * this.field4998.field5503 + this.field4998.field5504) * (float) this.field5042 / var8);
        int var13 = (int) (((float) arg5 * this.field4998.field5468 + (float) arg3 * this.field4998.field5466 + (float) arg4 * this.field4998.field5503 + this.field4998.field5504) * (float) this.field5042 / var9);
        if (this.field5045 > (float) var12 && (float) var13 < this.field5045) {
            var7 |= 4;
        } else if (this.field5037 < (float) var12 && this.field5037 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(III)V", line = 916)
    public final synchronized void method2132(int arg0, int arg1, int arg2) {
        ++field4937;
        if (arg0 != 3) {
            this.method1250(12, 111, 32, 91);
        }
        class177 var4 = new class177(arg1);
        var4.field6188 = (long) arg2;
        this.field4990.method3559(var4, (byte) 12);
    }

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "(I)V", line = 930)
    public final void method2133(int arg0) {
        if (arg0 != 8343) {
            this.method2138(97, 42);
        }
        OpenGL.glLightfv(16384, 4611, this.field5111, 0);
        ++field4858;
        OpenGL.glLightfv(16385, 4611, this.field5079, 0);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIZ)Ltd;", line = 942)
    public final class515 method377(int arg0, int arg1, boolean arg2) {
        ++field4842;
        return new class733(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ljaa;Ljaa;Ljaa;Ljaa;I)V", line = 952)
    public final void method2134(class745 arg0, class745 arg1, class745 arg2, class745 arg3, int arg4) {
        if (arg4 != 32888) {
            this.field5065 = 12;
        }
        ++field4834;
        if (arg0 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method2183(arg0.field10413, -11097);
            OpenGL.glVertexPointer(arg0.field10409, arg0.field10408, this.field5049.method475(arg4 + -41633), this.field5049.method477(-125) + (long) arg0.field10410);
            OpenGL.glEnableClientState(32884);
        }
        if (arg3 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method2183(arg3.field10413, arg4 ^ -43809);
            OpenGL.glNormalPointer(arg3.field10408, this.field5049.method475(arg4 + -41633), this.field5049.method477(-20) - -((long) arg3.field10410));
            OpenGL.glEnableClientState(32885);
        }
        if (arg1 != null) {
            this.method2183(arg1.field10413, arg4 + -43985);
            OpenGL.glColorPointer(arg1.field10409, arg1.field10408, this.field5049.method475(-8745), this.field5049.method477(-120) - -((long) arg1.field10410));
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg2 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method2183(arg2.field10413, -11097);
            OpenGL.glTexCoordPointer(arg2.field10409, arg2.field10408, this.field5049.method475(-8745), this.field5049.method477(arg4 ^ 32780) - -((long) arg2.field10410));
            OpenGL.glEnableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILlo;III)V", line = 1001)
    public final void method2135(int arg0, class116 arg1, int arg2, int arg3, int arg4) {
        ++field4940;
        int var6 = arg1.method822(false);
        int var7 = arg2 * this.method2159((byte) -111, var6);
        this.method2125(false, arg1);
        int var8 = -87 / ((arg4 - 22) / 33);
        OpenGL.glDrawElements(arg0, arg3, var6, (long) var7 + arg1.method820(23579));
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V", line = 1017)
    public class346(Canvas arg0, class267 arg1, int arg2) {
        super(arg1);
        new class498();
        new class715(16);
        this.field4986 = new class611();
        this.field4989 = new class611();
        this.field4990 = new class611();
        this.field4991 = new class611();
        this.field4992 = new class611();
        this.field4993 = new class611();
        this.field4994 = new class611();
        this.field4998 = new class378();
        this.field5004 = new class378();
        this.field5005 = new class378();
        this.field5015 = 0.0F;
        this.field5042 = 512;
        this.field5008 = 0;
        this.field5025 = false;
        this.field5029 = 1.0F;
        this.field5012 = 1.0F;
        this.field5053 = 3584.0F;
        this.field5054 = 0;
        this.field5024 = -1.0F;
        this.field5044 = new float[4];
        this.field5034 = 8448;
        this.field5075 = -1;
        this.field5059 = 0;
        this.field5007 = -1;
        this.field5079 = new float[4];
        this.field5010 = 0;
        this.field5064 = 0;
        this.field5077 = 1.0F;
        this.field5085 = 0;
        this.field5087 = 3584.0F;
        this.field5017 = 0;
        this.field5072 = 0;
        this.field5019 = -1.0F;
        this.field5028 = -1;
        this.field5089 = 3584;
        this.field5073 = -1;
        this.field5092 = 1.0F;
        this.field5095 = -1.0F;
        this.field5048 = new class40[class741.field10341];
        this.field5051 = 8448;
        this.field5107 = 1.0F;
        this.field5067 = 512;
        this.field5040 = 0;
        this.field5112 = new float[4];
        this.field5043 = 50;
        this.field5111 = new float[4];
        this.field5109 = -1.0F;
        this.field5094 = -1;
        this.field5096 = true;
        this.field5105 = new float[16];
        this.field5110 = 0;
        this.field5093 = new class212(8192);
        this.field5119 = new byte[16384];
        this.field5117 = new int[1];
        this.field5118 = new int[1];
        this.field5121 = new int[1];
        this.field4963 = arg2;
        this.field4862 = this.field4872 = arg0;
        if (!class151.method1095("jaclib", 3)) {
            throw new RuntimeException("");
        } else if (!class151.method1095("jaggl", 3)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field4849 = new OpenGL();
                this.field4797 = this.field4846 = this.field4849.init(arg0, 8, 8, 8, 24, 0, this.field4963);
                if (~this.field4846 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method2117(6);
                    int var4 = this.method2156((byte) 120);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field5027 = !this.field5047 ? 5121 : 33639;
                        if (this.field5016.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class330.method2035(' ', this.field5016.replace('/', ' '), (byte) -33);
                            for (int var9 = 0; var9 < var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (var10.charAt(0) == 'x' && var10.length() >= 3 && class355.method2259(var10.substring(1, 3), (byte) 78)) {
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
                                            if (~var10.length() <= -5 && class355.method2259(var10.substring(0, 4), (byte) 48)) {
                                                var5 = class321.method1993(var10.substring(0, 4), (byte) 91);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field5113 = false;
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && ~var5 >= -9251) {
                                    this.field5069 = false;
                                }
                                if (~var5 <= -7001 && ~var5 >= -8000) {
                                    this.field5036 = false;
                                }
                            }
                            this.field5035 &= this.field4849.method3370("GL_ARB_half_float_pixel");
                            this.field5026 = true;
                            this.field5018 = this.field5036;
                        }
                        if (this.field5033.indexOf("intel") != -1) {
                            this.field5006 = false;
                        }
                        this.field5088 = !this.field5033.equals("s3 graphics");
                        if (this.field5036) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class705.method3955(false, true, -1);
                        this.field4969 = true;
                        this.field4961 = new class481(this, super.field7881);
                        this.method2153(false);
                        this.field4974 = new class294(this);
                        this.field4959 = new class330(this);
                        if (this.field4959.method2034(-7297)) {
                            this.field4964 = new class525(this);
                            if (!this.field4964.method3189((byte) -109)) {
                                this.field4964.method888(-20962);
                                this.field4964 = null;
                            }
                        }
                        this.field4962 = new class127(this);
                        this.method2122((byte) 61);
                        this.method2129(false);
                        this.method1222();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method195();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(IIII)V", line = 1167)
    public final void method2136(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(arg0, 34184 - -arg2, arg1);
        ++field4832;
        OpenGL.glTexEnvi(8960, 34200 - -arg2, arg3);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 1176)
    public final void method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class569 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field4875;
        if (arg0 != arg2 || arg1 != arg3) {
            class512 var13 = (class512) arg6;
            class9 var14 = var13.field7421;
            this.method2172(-57);
            this.method2164(6, var13.field7421);
            this.method2138(27032, arg5);
            this.method2149(-11771, 8448, 7681);
            this.method2167(34167, 768, 10603, 0);
            float var15 = var14.field71 / (float) var14.field74;
            float var16 = var14.field72 / (float) var14.field68;
            float var17 = (float) arg2 - (float) arg0;
            float var18 = (float) arg3 - (float) arg1;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            float var20 = var17 * var19;
            int var21 = arg11 % (arg9 + arg10);
            float var22 = var18 * var19;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var23 = (float) arg9 * var20;
            float var24 = (float) arg9 * var22;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (~arg9 <= ~var21) {
                var28 = (float) (arg9 - var21) * var22;
                var27 = (float) (-var21 + arg9) * var20;
            } else {
                var26 = (float) (-var21 + arg9 + arg10) * var22;
                var25 = (float) (arg9 - var21 + arg10) * var20;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var20;
            float var32 = (float) arg10 * var22;
            while (true) {
                if (arg0 < arg2) {
                    if (var29 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var27 + var29 > (float) arg2) {
                        var27 = (float) arg2 - var29;
                    }
                } else {
                    if ((float) arg2 + 0.35F > var29) {
                        break;
                    }
                    if ((float) arg2 > var27 + var29) {
                        var27 = (float) arg2 - var29;
                    }
                }
                if (arg3 > arg1) {
                    if (var30 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if (var28 + var30 > (float) arg3) {
                        var28 = (float) arg3 + -var30;
                    }
                } else {
                    if ((float) arg3 + 0.35F > var30) {
                        break;
                    }
                    if ((float) arg3 > var28 + var30) {
                        var28 = (float) arg3 + -var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f((var29 - (float) arg7) * var15, (var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 - (float) arg7) * var15, (var28 + var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                var30 += var28 + var32;
                OpenGL.glEnd();
                var29 += var27 + var31;
                var27 = var23;
                var28 = var24;
            }
            this.method2167(5890, 768, 10603, 0);
        }
    }

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "(I)V", line = 1300)
    public final void method2137(int arg0) {
        ++field4796;
        if (arg0 <= -25) {
            if (this.field5057 != 0) {
                this.field5057 = 0;
                this.field4996 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "(II)V", line = 1317)
    public final void method2138(int arg0, int arg1) {
        if (this.field4999 != arg1) {
            boolean var3;
            boolean var4;
            byte var5;
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 == 128) {
                        var3 = true;
                        var4 = true;
                        var5 = 3;
                    } else {
                        var3 = false;
                        var4 = true;
                        var5 = 0;
                    }
                } else {
                    var5 = 2;
                    var4 = true;
                    var3 = false;
                }
            } else {
                var3 = true;
                var4 = true;
                var5 = 1;
            }
            if (var4 == !this.field4997) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field4997 = var4;
            }
            if (this.field5001 == !var3) {
                if (var3) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field5001 = var3;
            }
            if (~this.field5003 != ~var5) {
                if (~var5 != -2) {
                    if (var5 != 2) {
                        if (~var5 != -4) {
                            OpenGL.glDisable(3042);
                        } else {
                            OpenGL.glEnable(3042);
                            OpenGL.glBlendFunc(774, 1);
                        }
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field5003 = var5;
            }
            this.field4996 &= -29;
            this.field4999 = arg1;
        }
        if (arg0 != 27032) {
            this.field5036 = true;
        }
        ++field4911;
    }

    @OriginalMember(owner = "client!kw", name = "Y", descriptor = "()[I", line = 1410)
    public final int[] method247() {
        ++field4905;
        return new int[] { this.field5017, this.field5110, this.field5067, this.field5042 };
    }

    @OriginalMember(owner = "client!kw", name = "Q", descriptor = "(IIIIII[BII)V", line = 1418)
    public final void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field4863;
        float var10;
        float var11;
        if (this.field5104 != null && arg2 <= this.field5104.field3595 && arg3 <= this.field5104.field3594) {
            this.field5104.method1672(arg6, 0, arg2, 6406, 0, 1622, arg3, 0, false, 0);
            var10 = (float) arg2 * this.field5104.field71 / (float) this.field5104.field3595;
            var11 = (float) arg3 * this.field5104.field72 / (float) this.field5104.field3594;
        } else {
            this.field5104 = class369.method2317(this, 34037, arg2, false, arg6, 6406, 6406, arg3);
            this.field5104.method1676(false, false, (byte) 26);
            var11 = this.field5104.field72;
            var10 = this.field5104.field71;
        }
        this.method2172(-37);
        this.method2164(6, this.field5104);
        this.method2138(27032, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2123(arg5, 2);
        this.method2149(-11771, 34165, 34165);
        this.method2167(34166, 768, 10603, 0);
        this.method2167(5890, 770, 10603, 2);
        this.method2136(8960, 34166, 0, 770);
        this.method2136(8960, 5890, 2, 770);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        OpenGL.glBegin(7);
        float var15 = (float) arg3 + var13;
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var10);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var11, var10);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var11, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method2167(5890, 768, 10603, 0);
        this.method2167(34166, 770, 10603, 2);
        this.method2136(8960, 5890, 0, 770);
        this.method2136(8960, 34166, 2, 770);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZIIZ[B)Llo;", line = 1477)
    public final class116 method2139(boolean arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        ++field4817;
        if (!arg0) {
            this.method217();
        }
        return (class116) (!this.field5036 || arg3 && !this.field5018 ? new class171(this, arg1, arg4, arg2) : new class690(this, arg1, arg4, arg2, arg3));
    }

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "(II)I", line = 1495)
    public final int method300(int arg0, int arg1) {
        ++field4956;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IFFFF)V", line = 1505)
    public final void method2140(int arg0, float arg1, float arg2, float arg3, float arg4) {
        class709.field9960[0] = arg3;
        class709.field9960[2] = arg2;
        class709.field9960[1] = arg1;
        ++field4812;
        class709.field9960[3] = arg4;
        OpenGL.glTexEnvfv(8960, 8705, class709.field9960, 0);
        if (arg0 != -1) {
            this.method2179(-68);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ldv;)V", line = 1520)
    public final void method1239(class86 arg0) {
        ++field4761;
    }

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "(I)V", line = 1528)
    private final void method2141(int arg0) {
        ++field4815;
        int var2;
        for (var2 = 0; this.field5081 > var2; ++var2) {
            class40 var3 = this.field5048[var2];
            class755.field10517[0] = (float) var3.method422((byte) -128);
            int var4 = var2 + 16386;
            class755.field10517[1] = (float) var3.method421(class639.method3689(arg0, 126));
            class755.field10517[2] = (float) var3.method427(-1);
            class755.field10517[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class755.field10517, 0);
            int var5 = var3.method420(-1);
            float var6 = var3.method429(-1) / 255.0F;
            class755.field10517[0] = var6 * (float) (class368.method2314(var5, 16754073) >> 16);
            class755.field10517[2] = (float) class368.method2314(var5, 255) * var6;
            class755.field10517[1] = (float) class368.method2314(255, var5 >> 8) * var6;
            OpenGL.glLightfv(var4, 4609, class755.field10517, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method425((byte) 78) * var3.method425((byte) 86)));
            OpenGL.glEnable(var4);
        }
        while (this.field5058 > var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        if (arg0 != 2) {
            this.field5103 = null;
        }
        this.field5058 = this.field5081;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZB)V", line = 1576)
    public final void method2142(boolean arg0, byte arg1) {
        if (!arg0 != !this.field5031) {
            this.field5031 = arg0;
            this.method2170(false);
            this.field4996 &= -8;
        }
        if (arg1 >= -100) {
            this.method335(113, 64, 60, 91);
        }
        ++field4756;
    }

    @OriginalMember(owner = "client!kw", name = "I", descriptor = "()I", line = 1593)
    public final int method1237() {
        ++field4837;
        int var1 = this.field5116;
        this.field5116 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "()V", line = 1605)
    public final void method250() {
        ++field4896;
    }

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "(I)V", line = 1612)
    private final void method2143(int arg0) {
        ++field4800;
        if (arg0 > -49) {
            this.method363(-54, -0.8696731F, -1.1951852F, 0.10454468F, 0.44437543F, 1.1372286F);
        }
        this.field4849.method3368();
    }

    @OriginalMember(owner = "client!kw", name = "na", descriptor = "(IIII)[I", line = 1623)
    public final int[] method1226(int arg0, int arg1, int arg2, int arg3) {
        ++field4881;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + this.field4763 + -arg1, arg2, 1, 32993, this.field5027, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(B)V", line = 1647)
    public static void method2144(byte arg0) {
        field4952 = null;
        field4946 = null;
        if (arg0 != 44) {
            field4914 = null;
        }
        field4914 = null;
        field4951 = null;
    }

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "()Z", line = 1661)
    public final boolean method1242() {
        ++field4754;
        return this.field4964 != null && this.field4964.method887(-128);
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(IIZ)V", line = 1670)
    public final synchronized void method2145(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method228(-82, -82, 72, 120, 20, -93);
        }
        ++field4831;
        class177 var4 = new class177(arg1);
        var4.field6188 = (long) arg0;
        this.field4992.method3559(var4, (byte) 12);
    }

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "()Z", line = 1686)
    public final boolean method412() {
        ++field4765;
        return true;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIIIII)V", line = 1694)
    public final void method222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field4887;
        if (~arg0 != ~arg2 || ~arg1 != ~arg3) {
            this.method2169(9893);
            this.method2138(27032, arg5);
            float var10 = (float) (-arg0) + (float) arg2;
            float var11 = (float) (-arg1) + (float) arg3;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            float var13 = var10 * var12;
            float var14 = var11 * var12;
            int var15 = arg8 % (arg7 - -arg6);
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
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
                var18 = (float) (arg6 + arg7 + -var15) * var13;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var13;
            float var25 = (float) arg7 * var14;
            while (true) {
                if (~arg2 < ~arg0) {
                    if ((float) arg2 + 0.35F < var22) {
                        break;
                    }
                    if (var20 + var22 > (float) arg2) {
                        var20 = (float) arg2 + -var22;
                    }
                } else {
                    if (var22 < (float) arg2 + 0.35F) {
                        break;
                    }
                    if ((float) arg2 > var20 + var22) {
                        var20 = (float) arg2 - var22;
                    }
                }
                if (~arg1 <= ~arg3) {
                    if (var23 < (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 > var21 + var23) {
                        var21 = (float) arg3 - var23;
                    }
                } else {
                    if ((float) arg3 + 0.35F < var23) {
                        break;
                    }
                    if ((float) arg3 < var21 + var23) {
                        var21 = (float) arg3 + -var23;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glVertex2f(var22, var23);
                OpenGL.glVertex2f(var20 + var22, var21 + var23);
                var22 += var20 + var24;
                OpenGL.glEnd();
                var23 += var21 + var25;
                var20 = var16;
                var21 = var17;
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "za", descriptor = "(IIIII)V", line = 1808)
    public final void method199(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        ++field4780;
        if (~this.field5040 >= ~(arg0 + arg2) && ~this.field5054 <= ~(arg0 - arg2) && arg1 - -arg2 >= this.field5064 && -arg2 + arg1 <= this.field5010) {
            this.method2169(9893);
            this.method2138(27032, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field5095) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field5024 >= (float) var8) {
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
                if (var9 > 64) {
                    if (var9 > 512) {
                        var9 = 512;
                    }
                } else {
                    var9 = 64;
                }
                int var10 = class468.method2829(121, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = 16384 - var10; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class495.field7124[var11] * (float) arg2 + var6, class495.field7123[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "(B)V", line = 1884)
    private final void method2146(byte arg0) {
        if (arg0 >= -75) {
            this.field5036 = true;
        }
        if (~this.field5057 != -3) {
            this.field5057 = 2;
            this.method2148(127);
            this.method2198((byte) -53);
            this.field4996 &= -8;
        }
        ++field4954;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(BLvaa;)V", line = 1902)
    public final void method2147(byte arg0, class107 arg1) {
        ++field4813;
        if (~this.field4981 <= -1 && this.field4979[this.field4981] == arg1) {
            if (arg0 <= -29) {
                this.field4979[this.field4981--] = null;
                arg1.method793((byte) 92);
                if (~this.field4981 > -1) {
                    this.field4980 = null;
                } else {
                    this.field4980 = this.field4979[this.field4981];
                    this.field4980.method792(-1752);
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lfu;IIII)Lka;", line = 1926)
    public final class282 method404(class637 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4924;
        return new class55(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!kw", name = "r", descriptor = "()Z", line = 1937)
    public final boolean method395() {
        ++field4884;
        return this.field4964 != null && (this.field4963 <= 1 || this.field5101);
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V", line = 1945)
    public final void method383(int arg0) {
        this.method2117(6);
        ++field4950;
    }

    @OriginalMember(owner = "client!kw", name = "p", descriptor = "(I)V", line = 1955)
    private final void method2148(int arg0) {
        ++field4789;
        int var2 = 113 / ((85 - arg0) / 41);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field5105, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(III)V", line = 1967)
    public final void method2149(int arg0, int arg1, int arg2) {
        ++field4847;
        if (arg0 != -11771) {
            this.field5107 = 1.3277068F;
        }
        if (~this.field5060 != -1) {
            OpenGL.glTexEnvi(8960, 34161, arg2);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        } else {
            boolean var4 = false;
            if (this.field5034 != arg2) {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                var4 = true;
                this.field5034 = arg2;
            }
            if (this.field5051 != arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                var4 = true;
                this.field5051 = arg1;
            }
            if (var4) {
                this.field4996 &= -30;
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "q", descriptor = "(I)Ldm;", line = 2007)
    public final class96 method2150(int arg0) {
        ++field4856;
        int var2 = 22 / ((-35 - arg0) / 63);
        return this.field5041 != null ? this.field5041.method469((byte) 127) : null;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIF)Lwh;", line = 2019)
    public final class40 method309(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field4818;
        return new class623(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kw", name = "XA", descriptor = "()I", line = 2029)
    public final int method227() {
        ++field4864;
        return this.field5089;
    }

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "()Z", line = 2037)
    public final boolean method407() {
        ++field4899;
        return true;
    }

    @OriginalMember(owner = "client!kw", name = "r", descriptor = "(I)V", line = 2045)
    private final void method2151(int arg0) {
        this.field5106 = (float) (-this.field5017 + this.field5040);
        this.field5045 = (float) (-this.field5110 + this.field5064);
        this.field5037 = (float) (-this.field5110 + this.field5010);
        int var2 = -94 % ((arg0 - 22) / 44);
        ++field4768;
        this.field5115 = (float) (-this.field5017 + this.field5054);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Z)V", line = 2058)
    public final void method274(boolean arg0) {
        ++field4871;
    }

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "(II)I", line = 2066)
    public final int method2152(int arg0, int arg1) {
        if (arg1 >= -69) {
            this.method1237();
        }
        ++field4948;
        if (~arg0 != -2) {
            if (arg0 != 0) {
                if (arg0 == 2) {
                    return 34165;
                } else if (~arg0 != -4) {
                    if (~arg0 == -5) {
                        return 34023;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    return 260;
                }
            } else {
                return 8448;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2097)
    public final void method378(Canvas arg0) {
        ++field4917;
        this.field4862 = null;
        this.field4797 = 0L;
        if (arg0 != null && this.field4872 != arg0) {
            if (this.field4941.containsKey(arg0)) {
                Long var2 = (Long) this.field4941.get(arg0);
                this.field4797 = var2;
                this.field4862 = arg0;
            }
        } else {
            this.field4797 = this.field4846;
            this.field4862 = this.field4872;
        }
        if (this.field4862 != null && this.field4797 != 0L) {
            this.field4849.setSurface(this.field4797);
            this.method2129(false);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kw", name = "L", descriptor = "(III)V", line = 2129)
    public final void method388(int arg0, int arg1, int arg2) {
        ++field4916;
        if (this.field5028 != arg0 || this.field5094 != arg1 || this.field5085 != arg2) {
            this.field5085 = arg2;
            this.field5094 = arg1;
            this.field5028 = arg0;
            this.method2158(false);
            this.method2165(512);
        }
    }

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "(Z)V", line = 2148)
    private final void method2153(boolean arg0) {
        ++field4755;
        this.field5032 = new class158[this.field5055];
        this.field5023 = new class246(this, 3553, 6408, 1, 1);
        new class246(this, 3553, 6408, 1, 1);
        new class246(this, 3553, 6408, 1, 1);
        this.field5011 = new class55(this);
        this.field5038 = new class55(this);
        this.field5086 = new class55(this);
        this.field5056 = new class55(this);
        this.field5066 = new class55(this);
        this.field5090 = new class55(this);
        this.field5108 = new class55(this);
        this.field5039 = new class55(this);
        this.field5103 = new class55(this);
        this.field5022 = new class55(this);
        if (this.field5006) {
            this.field5061 = new class604(this);
            new class604(this);
        }
        if (arg0) {
            this.method2184(9);
        }
    }

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "(Z)V", line = 2186)
    private final void method2154(boolean arg0) {
        ++field4891;
        if (this.field5068) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field5068 = false;
        }
        if (!arg0) {
            this.field5034 = 63;
        }
    }

    @OriginalMember(owner = "client!kw", name = "s", descriptor = "(I)V", line = 2205)
    private final void method2155(int arg0) {
        if (this.field5057 != 3) {
            this.field5057 = 3;
            this.method2181(-124);
            this.method2198((byte) -62);
            this.field4996 &= -8;
        }
        ++field4819;
        if (arg0 != 0) {
            this.field4998 = null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "(B)I", line = 2225)
    private final int method2156(byte arg0) {
        if (arg0 <= 42) {
            this.field5078 = null;
        }
        ++field4762;
        int var2 = 0;
        this.field5033 = OpenGL.glGetString(7936).toLowerCase();
        this.field5016 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field5033.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (this.field5033.indexOf("brian paul") != -1 || this.field5033.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class330.method2035(' ', var3.replace('.', ' '), (byte) 99);
        if (var4.length < 2) {
            var2 |= 4;
        } else {
            try {
                int var5 = class321.method1993(var4[0], (byte) 99);
                int var6 = class321.method1993(var4[1], (byte) 99);
                this.field5098 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (this.field5098 < 12) {
            var2 |= 2;
        }
        if (!this.field4849.method3370("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field4849.method3370("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field5055 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field5070 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field5083 = var7[0];
        if (this.field5055 < 2 || ~this.field5070 > -3 || ~this.field5083 > -3) {
            var2 |= 16;
        }
        this.field5047 = Stream.method2551();
        this.field5046 = this.field4849.arePbuffersAvailable();
        this.field5036 = this.field4849.method3370("GL_ARB_vertex_buffer_object");
        this.field5013 = this.field4849.method3370("GL_ARB_multisample");
        this.field5009 = this.field4849.method3370("GL_ARB_vertex_program");
        this.field4849.method3370("GL_ARB_fragment_program");
        this.field5100 = this.field4849.method3370("GL_ARB_vertex_shader");
        this.field5052 = this.field4849.method3370("GL_ARB_fragment_shader");
        this.field5069 = this.field4849.method3370("GL_EXT_texture3D");
        this.field5035 = this.field4849.method3370("GL_ARB_texture_rectangle");
        this.field5030 = this.field4849.method3370("GL_ARB_texture_cube_map");
        this.field5113 = this.field4849.method3370("GL_ARB_texture_float");
        this.field5021 = false;
        this.field5006 = this.field4849.method3370("GL_EXT_framebuffer_object");
        this.field5050 = this.field4849.method3370("GL_EXT_framebuffer_blit");
        this.field5076 = this.field4849.method3370("GL_EXT_framebuffer_multisample");
        this.field5101 = this.field5050 & this.field5076;
        OpenGL.glGetFloatv(2834, class709.field9960, 0);
        this.field5024 = class709.field9960[1];
        this.field5095 = class709.field9960[0];
        return var2 != 0 ? var2 : 0;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(BZI)V", line = 2313)
    public final void method2157(byte arg0, boolean arg1, int arg2) {
        ++field4759;
        this.method2173(-72, true, arg1, arg2);
        if (arg0 < 104) {
            this.method1253(-126, -105);
        }
    }

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "(Z)V", line = 2324)
    private final void method2158(boolean arg0) {
        this.field5091 = (float) (-this.field5085 + this.field5089) - this.field5015;
        ++field4874;
        this.field5071 = -((float) this.field5094 * this.field5107) + this.field5091;
        if ((float) this.field5043 > this.field5071) {
            this.field5071 = (float) this.field5043;
        }
        if (!arg0) {
            OpenGL.glFogf(2915, this.field5071);
            OpenGL.glFogf(2916, this.field5091);
            class709.field9960[2] = (float) class368.method2314(this.field5028, 255) / 255.0F;
            class709.field9960[0] = (float) class368.method2314(16711680, this.field5028) / 1.671168E7F;
            class709.field9960[1] = (float) class368.method2314(65280, this.field5028) / 65280.0F;
            OpenGL.glFogfv(2918, class709.field9960, 0);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(BI)I", line = 2347)
    public final int method2159(byte arg0, int arg1) {
        ++field4865;
        if (arg1 != 5121 && ~arg1 != -5121) {
            if (~arg1 != -5124 && ~arg1 != -5123) {
                if (arg0 != -111) {
                    this.method2179(-105);
                }
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

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZI)V", line = 2369)
    public final void method2160(boolean arg0, int arg1) {
        ++field4753;
        if (this.field5000 != arg0) {
            this.field5000 = arg0;
            this.method2121(34930);
            this.field4996 &= -32;
        }
        if (arg1 < 4) {
            this.field4920 = 60;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "()V", line = 2388)
    public final void method1244() {
        ++field4775;
        this.field4959.method2036((byte) 121);
    }

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "(B)V", line = 2398)
    private final void method2161(byte arg0) {
        int var2 = -33 % ((arg0 - 39) / 35);
        this.field5105[10] = this.field5080;
        this.field5105[14] = this.field5082;
        ++field4779;
        this.field5053 = (float) this.field5089;
        this.field5087 = (this.field5105[14] + (float) (-this.field5089)) / this.field5105[10];
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(IIII)V", line = 2416)
    public final void method2162(int arg0, int arg1, int arg2, int arg3) {
        ++field4776;
        if (arg0 <= 27) {
            this.method247();
        }
        OpenGL.glDrawArrays(arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "([I)V", line = 2429)
    public final void method390(int[] arg0) {
        arg0[0] = this.field4836;
        ++field4929;
        arg0[1] = this.field4763;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)Lrga;", line = 2438)
    public final class290 method1255(int arg0, int arg1) {
        ++field4852;
        return null;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 2451)
    public final void method1225(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class360 {
        this.method1257(arg2, arg3);
        ++field4939;
    }

    @OriginalMember(owner = "client!kw", name = "A", descriptor = "()Lfc;", line = 2459)
    public final class729 method1229() {
        ++field4868;
        int var1 = -1;
        if (this.field5033.indexOf("nvidia") != -1) {
            var1 = 4318;
        } else if (this.field5033.indexOf("intel") == -1) {
            if (~this.field5033.indexOf("ati") != 0) {
                var1 = 4098;
            }
        } else {
            var1 = 32902;
        }
        return new class729(var1, "OpenGL", this.field5098, this.field5016, 0L);
    }

    @OriginalMember(owner = "client!kw", name = "C", descriptor = "(Z)V", line = 2481)
    public final void method235(boolean arg0) {
        ++field4781;
        this.field5096 = arg0;
        this.method2121(34930);
    }

    @OriginalMember(owner = "client!kw", name = "EA", descriptor = "(IIII)V", line = 2495)
    public final void method206(int arg0, int arg1, int arg2, int arg3) {
        ++field4835;
        if (!this.field5114) {
            throw new RuntimeException("");
        } else {
            this.field5075 = arg1;
            this.field5073 = arg2;
            this.field5072 = arg3;
            this.field5084 = arg0;
            if (this.field5025) {
                this.field4962.field1750.method3823(true);
                this.field4962.field1750.method3824(0);
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(BFF)V", line = 2519)
    public final void method2163(byte arg0, float arg1, float arg2) {
        this.field5015 = arg1;
        ++field4949;
        if (arg0 >= 0) {
            this.method331();
        }
        this.field5107 = arg2;
        this.method2158(false);
    }

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "()I", line = 2538)
    public final int method387() {
        ++field4757;
        return this.field5043;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lss;Lss;FLss;)Lss;", line = 2549)
    public final class506 method1251(class506 arg0, class506 arg1, float arg2, class506 arg3) {
        ++field4803;
        if (arg0 != null && arg1 != null && this.field5030 && this.field5006) {
            class485 var5 = null;
            class708 var6 = (class708) arg0;
            class708 var7 = (class708) arg1;
            class96 var8 = var6.method469((byte) 126);
            class96 var9 = var7.method469((byte) -8);
            if (var8 != null && var9 != null) {
                int var10 = var8.field1391 <= var9.field1391 ? var9.field1391 : var8.field1391;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class485) {
                    class485 var11 = (class485) arg3;
                    if (var11.method2961(127) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class485(this, var10);
                }
                if (var5.method2962(var8, var9, arg2, (byte) 22)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!kw", name = "u", descriptor = "()Lsk;", line = 2598)
    public final class121 method348() {
        ++field4947;
        return new class378();
    }

    @OriginalMember(owner = "client!kw", name = "H", descriptor = "(III[I)V", line = 2607)
    public final void method402(int arg0, int arg1, int arg2, int[] arg3) {
        ++field4811;
        float var5 = (float) arg2 * this.field4998.field5499 + (float) arg0 * this.field4998.field5476 + (float) arg1 * this.field4998.field5475 + this.field4998.field5490;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field4998.field5487 + (float) arg0 * this.field4998.field5464 + (float) arg1 * this.field4998.field5465 + this.field4998.field5494) * (float) this.field5067 / var5);
            arg3[0] = (int) ((float) var6 - this.field5106);
            int var7 = (int) (((float) arg2 * this.field4998.field5468 + (float) arg0 * this.field4998.field5466 + (float) arg1 * this.field4998.field5503 + this.field4998.field5504) * (float) this.field5042 / var5);
            arg3[2] = (int) var5;
            arg3[1] = (int) ((float) var7 + -this.field5045);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILou;)V", line = 2632)
    public final void method2164(int arg0, class158 arg1) {
        ++field4933;
        class158 var3 = this.field5032[this.field5060];
        if (arg1 != var3) {
            if (arg1 == null) {
                OpenGL.glDisable(var3.field2261);
            } else {
                if (var3 != null) {
                    if (~arg1.field2261 != ~var3.field2261) {
                        OpenGL.glDisable(var3.field2261);
                        OpenGL.glEnable(arg1.field2261);
                    }
                } else {
                    OpenGL.glEnable(arg1.field2261);
                }
                OpenGL.glBindTexture(arg1.field2261, arg1.method1132(0));
            }
            this.field5032[this.field5060] = arg1;
        }
        this.field4996 &= -2;
        if (arg0 != 6) {
            this.field4968 = null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "t", descriptor = "(I)V", line = 2671)
    private final void method2165(int arg0) {
        if (this.field5014 && this.field5094 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field4786;
        if (arg0 != 512) {
            this.field4977 = null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "()Lsk;", line = 2686)
    public final class121 method304() {
        ++field4769;
        return this.field4998;
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 2697)
    public final void method239(Canvas arg0) {
        ++field4752;
        if (this.field4872 == arg0) {
            throw new RuntimeException();
        } else if (this.field4941.containsKey(arg0)) {
            Long var2 = (Long) this.field4941.get(arg0);
            this.field4849.releaseSurface(arg0, var2);
            this.field4941.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!kw", name = "X", descriptor = "(I)V", line = 2718)
    public final void method369(int arg0) {
        ++field4844;
        this.field4970 = 0;
        while (~arg0 < -2) {
            ++this.field4970;
            arg0 >>= 1;
        }
        this.field4971 = 1 << this.field4970;
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(II)I", line = 2733)
    public final int method374(int arg0, int arg1) {
        ++field4804;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I[Lwh;)V", line = 2741)
    public final void method277(int arg0, class40[] arg1) {
        ++field4870;
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field5048[var3] = arg1[var3];
        }
        this.field5081 = arg0;
        if (~this.field5057 != -2) {
            this.method2141(2);
        }
    }

    @OriginalMember(owner = "client!kw", name = "ZA", descriptor = "(IFFFFF)V", line = 2768)
    public final void method363(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field4787;
        boolean var7 = ~this.field5007 != ~arg0;
        if (var7 || this.field5109 != arg1 || this.field5019 != arg2) {
            this.field5109 = arg1;
            this.field5007 = arg0;
            this.field5019 = arg2;
            if (var7) {
                this.field5092 = (float) (16711680 & this.field5007) / 1.671168E7F;
                this.field5029 = (float) (this.field5007 & 65280) / 65280.0F;
                this.field5077 = (float) (255 & this.field5007) / 255.0F;
                this.method2185((byte) -40);
            }
            this.method2194(1);
        }
        if (this.field5044[0] != arg3 || this.field5044[1] != arg4 || this.field5044[2] != arg5) {
            this.field5044[2] = arg5;
            this.field5044[1] = arg4;
            this.field5044[0] = arg3;
            this.field5112[2] = -arg5;
            this.field5112[1] = -arg4;
            this.field5112[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5111[1] = arg4 * var8;
            this.field5111[2] = arg5 * var8;
            this.field5111[0] = arg3 * var8;
            this.field5079[2] = -this.field5111[2];
            this.field5079[1] = -this.field5111[1];
            this.field5079[0] = -this.field5111[0];
            this.method2133(8343);
            this.field5065 = (int) (arg3 * 256.0F / arg4);
            this.field5102 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(III)V", line = 2820)
    public final synchronized void method2166(int arg0, int arg1, int arg2) {
        ++field4855;
        if (arg0 != 120) {
            this.method2180((byte) -34, true);
        }
        class177 var4 = new class177(arg1);
        var4.field6188 = (long) arg2;
        this.field4989.method3559(var4, (byte) 12);
    }

    @OriginalMember(owner = "client!kw", name = "w", descriptor = "()Z", line = 2838)
    public final boolean method255() {
        ++field4820;
        return true;
    }

    @OriginalMember(owner = "client!kw", name = "ra", descriptor = "(IIII)V", line = 2847)
    public final void method209(int arg0, int arg1, int arg2, int arg3) {
        this.field5084 = arg0;
        this.field5072 = arg3;
        ++field4935;
        this.field5073 = arg2;
        this.field5075 = arg1;
        this.field5114 = true;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lqt;[Lffa;Z)Lda;", line = 2863)
    public final class400 method322(class502 arg0, class676[] arg1, boolean arg2) {
        ++field4785;
        return new class459(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(IIII)V", line = 2871)
    public final void method2167(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 10603) {
            this.method2135(-23, (class116) null, -124, -111, -77);
        }
        ++field4890;
        OpenGL.glTexEnvi(8960, arg3 + 34176, arg0);
        OpenGL.glTexEnvi(8960, arg3 + 34192, arg1);
    }

    @OriginalMember(owner = "client!kw", name = "s", descriptor = "()Lsk;", line = 2883)
    public final class121 method342() {
        ++field4822;
        return this.field4966;
    }

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "(I)V", line = 2892)
    public final void method251(int arg0) {
        ++field4923;
        this.method2143(-67);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lsk;)V", line = 2901)
    public final void method364(class121 arg0) {
        ++field4853;
        this.field4998.method841(arg0);
        this.field5004.method841(this.field4998);
        this.field5004.method2343(2);
        this.field5005.method2349(this.field5004, 0);
        if (~this.field5057 != -2) {
            this.method2198((byte) -88);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZBILjaclib/memory/Buffer;)Llca;", line = 2919)
    public final class52 method2168(int arg0, boolean arg1, byte arg2, int arg3, Buffer arg4) {
        ++field4798;
        if (arg2 <= 13) {
            this.field5111 = null;
        }
        return (class52) (!this.field5036 || arg1 && !this.field5018 ? new class65(this, arg0, arg4) : new class154(this, arg0, arg4, arg3, arg1));
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II[I[I)Laa;", line = 2936)
    public final class569 method219(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field4877;
        return class489.method2981(arg3, this, arg1, arg0, arg2, (byte) -105);
    }

    @OriginalMember(owner = "client!kw", name = "u", descriptor = "(I)V", line = 2945)
    private final void method2169(int arg0) {
        if (~this.field4996 != -2) {
            this.method2182((byte) -107);
            this.method2190(true, false);
            this.method2142(false, (byte) -127);
            this.method2180((byte) -86, false);
            this.method2160(false, 90);
            this.method2164(6, (class158) null);
            this.method2176(-2, -48);
            this.method2120(1, 90);
            this.field4996 = 1;
        }
        if (arg0 != 9893) {
            this.field4996 = 98;
        }
        ++field4829;
    }

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "(Z)V", line = 2969)
    private final void method2170(boolean arg0) {
        if (this.field5031 && !this.field5074) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field4810;
        if (arg0) {
            this.field5096 = true;
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(Z)V", line = 2987)
    public final void method1230(boolean arg0) {
        ++field4778;
    }

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "(II)V", line = 3003)
    public final void method2171(int arg0, int arg1) {
        if (this.field5060 != arg1) {
            OpenGL.glActiveTexture(33984 - -arg1);
            this.field5060 = arg1;
        }
        if (arg0 < 108) {
            this.field4997 = false;
        }
        ++field4795;
    }

    @OriginalMember(owner = "client!kw", name = "v", descriptor = "(I)V", line = 3020)
    public final void method2172(int arg0) {
        if (this.field4996 != 2) {
            this.method2182((byte) -107);
            this.method2190(true, false);
            this.method2142(false, (byte) -124);
            this.method2180((byte) -86, false);
            this.method2160(false, 51);
            this.method2176(-2, -123);
            this.field4996 = 2;
        }
        int var2 = 58 / ((38 - arg0) / 58);
        ++field4942;
    }

    @OriginalMember(owner = "client!kw", name = "U", descriptor = "(IIIII)V", line = 3040)
    public final void method357(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4880;
        this.method2169(9893);
        this.method2138(27032, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIII)V", line = 3062)
    public final void method1250(int arg0, int arg1, int arg2, int arg3) {
        ++field4830;
        this.field4959.method2027(arg1, false, arg2, arg0, arg3);
    }

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "(I)V", line = 3073)
    public final void method279(int arg0) {
        ++field4886;
        if (~arg0 <= -129 && arg0 <= 1024) {
            this.field4965 = arg0;
            this.field4961.method2933(125);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZZI)V", line = 3088)
    public final void method2173(int arg0, boolean arg1, boolean arg2, int arg3) {
        if (~this.field5062 != ~arg3 || !this.field5025 != !this.field5114) {
            class246 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field5114 ? 0 : 3;
            if (~arg3 > -1) {
                this.method2154(true);
            } else {
                var5 = this.field4961.method2934(16, arg3);
                class679 var10 = super.field7881.method962(arg3, 2904);
                if (var10.field9638 == 0 && var10.field9640 == 0) {
                    this.method2154(true);
                } else {
                    int var11 = !var10.field9636 ? 128 : 64;
                    int var12 = var11 * 50;
                    this.method2124(5890, (float) (this.field4973 % var12 * var10.field9640) / (float) var12, 0.0F, (float) (this.field4973 % var12 * var10.field9638) / (float) var12);
                }
                var6 = var10.field9649;
                if (!this.field5114) {
                    var9 = var10.field9648;
                    var7 = var10.field9646;
                    var8 = var10.field9645;
                }
            }
            this.field4962.method895(-85, var8, arg1, var9, arg2, var7);
            if (!this.field4962.method898(var5, var6, Integer.MAX_VALUE)) {
                this.method2164(6, var5);
                this.method2120(var6, 77);
            }
            this.field5062 = arg3;
            this.field5025 = this.field5114;
        }
        ++field4826;
        int var13 = -37 % ((arg0 - 54) / 38);
        this.field4996 &= -8;
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "()V", line = 3151)
    public final void method195() {
        ++field4953;
        for (class430 var1 = this.field4968.method3565(125); var1 != null; var1 = this.field4968.method3561((byte) 98)) {
            ((class166) var1).method1187((byte) 122);
        }
        if (this.field4959 != null) {
            this.field4959.method2031(false);
        }
        if (this.field4849 != null) {
            this.method2143(-59);
            Enumeration var2 = this.field4941.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field4941.get(var3);
                this.field4849.releaseSurface(var3, var4);
            }
            this.field4849.release();
            this.field4849 = null;
        }
        if (this.field4969) {
            class512.method3110(false, false, true);
            this.field4969 = false;
        }
    }

    @OriginalMember(owner = "client!kw", name = "m", descriptor = "(II)V", line = 3201)
    public final synchronized void method2174(int arg0, int arg1) {
        if (arg1 >= -32) {
            this.method2146((byte) -122);
        }
        ++field4919;
        class177 var3 = new class177(arg0);
        this.field4991.method3559(var3, (byte) 12);
    }

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "()I", line = 3218)
    public final int method270() {
        ++field4791;
        return 4;
    }

    @OriginalMember(owner = "client!kw", name = "pa", descriptor = "()V", line = 3226)
    public final void method204() {
        this.field5114 = false;
        ++field4825;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILvaa;)V", line = 3239)
    public final void method2175(int arg0, class107 arg1) {
        ++field4885;
        if (this.field4984 >= 0 && this.field4977[this.field4984] == arg1) {
            this.field4977[this.field4984--] = null;
            if (arg0 < 28) {
                this.method1255(103, 40);
            }
            arg1.method794((byte) 123);
            if (this.field4984 >= 0) {
                this.field4983 = this.field4977[this.field4984];
                this.field4983.method791(21631);
            } else {
                this.field4983 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kw", name = "v", descriptor = "()V", line = 3263)
    public final void method1232() {
        ++field4793;
        if (this.field4964 != null && this.field4964.method887(-124)) {
            this.field4959.method2037(this.field4964, 34842);
            this.field4961.method2933(-40);
        }
    }

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "(II)V", line = 3280)
    public final void method2176(int arg0, int arg1) {
        ++field4806;
        int var3 = -3 / ((arg1 - 17) / 58);
        this.method2157((byte) 107, true, arg0);
    }

    @OriginalMember(owner = "client!kw", name = "w", descriptor = "(I)V", line = 3291)
    private final void method2177(int arg0) {
        ++field4921;
        if (this.field5054 >= this.field5040 && this.field5010 >= this.field5064) {
            OpenGL.glScissor(this.field5059 + this.field5040, -this.field5010 + this.field5008 - -this.field4763, -this.field5040 + this.field5054, this.field5010 - this.field5064);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        if (arg0 != 0) {
            this.method2131((class107) null, 100);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZI[BIZ)Llca;", line = 3308)
    public final class52 method2178(boolean arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        ++field4861;
        if (!this.field5036 || arg0 && !this.field5018) {
            if (!arg4) {
                this.method2184(-108);
            }
            return new class65(this, arg3, arg2, arg1);
        } else {
            return new class154(this, arg3, arg2, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!kw", name = "p", descriptor = "()V", line = 3325)
    public final void method1224() {
        ++field4958;
        if (this.field5006) {
            if (this.field4982 != this.field4980) {
                throw new RuntimeException();
            }
            this.field4982.method3519(0, 70);
            this.field4982.method3519(8, -83);
            this.method2193(99, this.field4982);
        } else {
            if (!this.field5046) {
                throw new RuntimeException("");
            }
            this.field4975.method807(0, 0, this.field4836, this.field4763, 0, 0);
            this.field4849.setSurface(this.field4797);
        }
        this.field4975 = null;
        this.field4836 = this.field4920;
        this.field4763 = this.field4957;
        this.method2137(-53);
        this.method2191((byte) -127);
        this.method328();
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(IIIIII)V", line = 3358)
    public final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4936;
        this.method2169(9893);
        this.method2138(27032, arg5);
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) arg3 - (float) arg1;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var9 = var7 * var10;
            var8 *= var10;
        }
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var9 + 0.35F, (float) arg3 + var8 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "(I)V", line = 3391)
    public final void method2179(int arg0) {
        if (arg0 != 1) {
            this.method2167(92, 49, -75, 46);
        }
        if (this.field4996 != 8) {
            this.method2146((byte) -88);
            this.method2190(true, true);
            this.method2180((byte) -86, true);
            this.method2160(true, 113);
            this.method2138(27032, 1);
            this.field4996 = 8;
        }
        ++field4900;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(BZ)V", line = 3412)
    public final void method2180(byte arg0, boolean arg1) {
        if (arg0 == -86) {
            if (!this.field4995 == arg1) {
                if (arg1) {
                    OpenGL.glEnable(2929);
                } else {
                    OpenGL.glDisable(2929);
                }
                this.field4996 &= -32;
                this.field4995 = arg1;
            }
            ++field4788;
        }
    }

    @OriginalMember(owner = "client!kw", name = "y", descriptor = "(I)V", line = 3434)
    private final void method2181(int arg0) {
        if (arg0 >= -119) {
            this.field4990 = null;
        }
        ++field4802;
        float var2 = (float) (-this.field5017) * this.field5012 / (float) this.field5067;
        float var3 = (float) (-this.field5110) * this.field5012 / (float) this.field5042;
        float var4 = (float) (-this.field5017 + this.field4836) * this.field5012 / (float) this.field5067;
        float var5 = (float) (this.field4763 - this.field5110) * this.field5012 / (float) this.field5042;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field5043, (double) this.field5089);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "()Z", line = 3463)
    public final boolean method1234() {
        ++field4876;
        if (this.field4964 != null) {
            if (!this.field4964.method887(-127)) {
                if (!this.field4959.method2032(this.field4964, 8)) {
                    return false;
                }
                this.field4961.method2933(125);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "(B)V", line = 3488)
    private final void method2182(byte arg0) {
        if (~this.field5057 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field4836 > 0 && this.field4763 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field4836, (double) this.field4763, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field5057 = 1;
            this.field4996 &= -25;
        }
        ++field4851;
        if (arg0 != -107) {
            this.field4973 = 73;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Llca;I)V", line = 3517)
    public final void method2183(class52 arg0, int arg1) {
        if (arg1 != -11097) {
            this.method2120(-66, 75);
        }
        if (this.field5049 != arg0) {
            if (this.field5036) {
                OpenGL.glBindBufferARB(34962, arg0.method476(-95));
            }
            this.field5049 = arg0;
        }
        ++field4866;
    }

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "(I)V", line = 3537)
    private final void method2184(int arg0) {
        ++field4774;
        float[] var2 = this.field5105;
        if (arg0 != 0) {
            this.field5003 = 116;
        }
        float var3 = (float) (-this.field5017 * this.field5043) / (float) this.field5067;
        float var4 = (float) ((-this.field5017 + this.field4836) * this.field5043) / (float) this.field5067;
        float var5 = (float) (this.field5110 * this.field5043) / (float) this.field5042;
        float var6 = (float) ((this.field5110 - this.field4763) * this.field5043) / (float) this.field5042;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field5043 * 2.0F;
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[6] = 0.0F;
            var2[5] = var7 / (-var6 + var5);
            var2[2] = 0.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[14] = this.field5082 = -((float) this.field5089 * var7) / (float) (-this.field5043 + this.field5089);
            var2[4] = 0.0F;
            var2[15] = 0.0F;
            var2[13] = 0.0F;
            var2[11] = -1.0F;
            var2[10] = this.field5080 = (float) (-(this.field5089 + this.field5043)) / (float) (-this.field5043 + this.field5089);
            var2[7] = 0.0F;
            var2[1] = 0.0F;
            var2[3] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[12] = 0.0F;
        } else {
            var2[12] = 0.0F;
            var2[10] = 1.0F;
            var2[15] = 1.0F;
            var2[0] = 1.0F;
            var2[6] = 0.0F;
            var2[2] = 0.0F;
            var2[13] = 0.0F;
            var2[11] = 0.0F;
            var2[7] = 0.0F;
            var2[5] = 1.0F;
            var2[14] = 0.0F;
            var2[4] = 0.0F;
            var2[3] = 0.0F;
            var2[1] = 0.0F;
            var2[8] = 0.0F;
            var2[9] = 0.0F;
        }
        this.method2161((byte) 112);
    }

    @OriginalMember(owner = "client!kw", name = "GA", descriptor = "(I)V", line = 3600)
    public final void method1240(int arg0) {
        this.method2138(27032, 0);
        ++field4888;
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "(II)V", line = 3612)
    public final void method281(int arg0, int arg1) {
        ++field4913;
        if (~this.field5043 != ~arg0 || ~this.field5089 != ~arg1) {
            this.field5089 = arg1;
            this.field5043 = arg0;
            this.method2184(0);
            this.method2158(false);
            if (this.field5057 != 3) {
                if (this.field5057 == 2) {
                    this.method2148(126);
                    return;
                }
            } else {
                this.method2181(-120);
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "q", descriptor = "()Z", line = 3636)
    public final boolean method211() {
        ++field4773;
        return false;
    }

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "(B)V", line = 3644)
    private final void method2185(byte arg0) {
        class709.field9960[1] = this.field5063 * this.field5029;
        if (arg0 != -40) {
            this.field5051 = 58;
        }
        class709.field9960[2] = this.field5077 * this.field5063;
        class709.field9960[0] = this.field5092 * this.field5063;
        class709.field9960[3] = 1.0F;
        ++field4889;
        OpenGL.glLightModelfv(2899, class709.field9960, 0);
    }

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "(I)V", line = 3659)
    public final void method379(int arg0) {
        ++field4918;
    }

    @OriginalMember(owner = "client!kw", name = "HA", descriptor = "(IIII[I)V", line = 3671)
    public final void method375(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field4792;
        float var6 = (float) arg2 * this.field4998.field5499 + (float) arg0 * this.field4998.field5476 + (float) arg1 * this.field4998.field5475 + this.field4998.field5490;
        if (!(var6 < (float) this.field5043) && !(var6 > (float) this.field5089)) {
            int var7 = (int) (((float) arg2 * this.field4998.field5487 + (float) arg0 * this.field4998.field5464 + (float) arg1 * this.field4998.field5465 + this.field4998.field5494) * (float) this.field5067 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field4998.field5468 + (float) arg0 * this.field4998.field5466 + (float) arg1 * this.field4998.field5503 + this.field4998.field5504) * (float) this.field5042 / (float) arg3);
            if (this.field5106 <= (float) var7 && (float) var7 <= this.field5115 && this.field5045 <= (float) var8 && this.field5037 >= (float) var8) {
                arg4[0] = (int) ((float) var7 + -this.field5106);
                arg4[2] = (int) var6;
                arg4[1] = (int) ((float) var8 + -this.field5045);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lss;)V", line = 3701)
    public final void method353(class506 arg0) {
        this.field5041 = (class708) arg0;
        ++field4777;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IILfe;IIIIIIII)Z", line = 3709)
    public static final boolean method2186(int arg0, int arg1, class635 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field4944;
        int var11 = arg8;
        int var12 = arg6;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg8 - var13;
        class489.field7046[var13][var14] = 99;
        int var16 = -var14 + arg6;
        class616.field8775[var13][var14] = 0;
        if (arg4 != 1612972032) {
            field4946 = null;
        }
        byte var17 = 0;
        class216.field3240[var17] = arg8;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class563.field8152[var10001] = arg6;
        int[][] var19 = arg2.field8956;
        while (~var26 != ~var18) {
            var12 = class563.field8152[var18];
            var11 = class216.field3240[var18];
            int var20 = -var15 + var11;
            int var21 = var12 - var16;
            int var22 = var11 - arg2.field8950;
            int var23 = -arg2.field8968 + var12;
            var18 = var18 - -1 & 4095;
            if (arg7 != -4) {
                if (arg7 != -3) {
                    if (~arg7 != 1) {
                        if (~arg7 != 0) {
                            if (~arg7 != -1 && ~arg7 != -2 && arg7 != 2 && ~arg7 != -4 && arg7 != 9) {
                                if (arg2.method3647(arg10, arg0, arg1, arg7, var12, var11, 1, arg4 + -1612972153)) {
                                    class265.field3795 = var11;
                                    class501.field7283 = var12;
                                    return true;
                                }
                            } else if (arg2.method3637(arg7, arg1, var11, arg10, var12, 1, -116, arg0)) {
                                class501.field7283 = var12;
                                class265.field3795 = var11;
                                return true;
                            }
                        } else if (arg2.method3636(arg10, var11, arg1, var12, 1, true, arg9, arg5, arg3)) {
                            class265.field3795 = var11;
                            class501.field7283 = var12;
                            return true;
                        }
                    } else if (arg2.method3640(1, arg5, 1, 2, arg10, arg9, var11, var12, arg3, arg1)) {
                        class265.field3795 = var11;
                        class501.field7283 = var12;
                        return true;
                    }
                } else if (class176.method1270(arg1, arg4 + -1612972032, 1, arg9, 1, arg10, arg3, var12, var11)) {
                    class265.field3795 = var11;
                    class501.field7283 = var12;
                    return true;
                }
            } else if (~arg1 == ~var11 && arg10 == var12) {
                class501.field7283 = var12;
                class265.field3795 = var11;
                return true;
            }
            int var25 = class616.field8775[var20][var21] + 1;
            if (var20 > 0 && ~class489.field7046[var20 + -1][var21] == -1 && ~(var19[var22 + -1][var23] & 1109655552) == -1) {
                class216.field3240[var26] = var11 + -1;
                class563.field8152[var26] = var12;
                var26 = 4095 & var26 + 1;
                class489.field7046[var20 + -1][var21] = 2;
                class616.field8775[var20 - 1][var21] = var25;
            }
            if (var20 < 127 && ~class489.field7046[var20 + 1][var21] == -1 && ~(var19[var22 - -1][var23] & 1612972032) == -1) {
                class216.field3240[var26] = var11 + 1;
                class563.field8152[var26] = var12;
                var26 = var26 - -1 & 4095;
                class489.field7046[var20 + 1][var21] = 8;
                class616.field8775[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class489.field7046[var20][var21 + -1] == 0 && ~(1084489728 & var19[var22][var23 + -1]) == -1) {
                class216.field3240[var26] = var11;
                class563.field8152[var26] = var12 - 1;
                class489.field7046[var20][var21 + -1] = 1;
                var26 = 4095 & var26 - -1;
                class616.field8775[var20][var21 + -1] = var25;
            }
            if (~var21 > -128 && class489.field7046[var20][var21 + 1] == 0 && ~(var19[var22][var23 - -1] & 1210318848) == -1) {
                class216.field3240[var26] = var11;
                class563.field8152[var26] = var12 + 1;
                class489.field7046[var20][var21 + 1] = 4;
                var26 = var26 + 1 & 4095;
                class616.field8775[var20][var21 + 1] = var25;
            }
            if (~var20 < -1 && ~var21 < -1 && ~class489.field7046[var20 + -1][var21 - 1] == -1 && (1134821376 & var19[var22 + -1][var23 + -1]) == 0 && ~(var19[var22 - 1][var23] & 1109655552) == -1 && (1084489728 & var19[var22][var23 - 1]) == 0) {
                class216.field3240[var26] = var11 + -1;
                class563.field8152[var26] = var12 + -1;
                class489.field7046[var20 + -1][var21 + -1] = 3;
                var26 = var26 + 1 & 4095;
                class616.field8775[var20 + -1][var21 - 1] = var25;
            }
            if (var20 < 127 && ~var21 < -1 && class489.field7046[var20 + 1][var21 + -1] == 0 && (1625554944 & var19[var22 + 1][var23 + -1]) == 0 && ~(1612972032 & var19[var22 + 1][var23]) == -1 && ~(1084489728 & var19[var22][var23 - 1]) == -1) {
                class216.field3240[var26] = var11 + 1;
                class563.field8152[var26] = var12 + -1;
                class489.field7046[var20 + 1][var21 + -1] = 9;
                var26 = 4095 & var26 + 1;
                class616.field8775[var20 + 1][var21 + -1] = var25;
            }
            if (var20 > 0 && var21 < 127 && ~class489.field7046[var20 + -1][var21 + 1] == -1 && ~(1310982144 & var19[var22 + -1][var23 + 1]) == -1 && (1109655552 & var19[var22 + -1][var23]) == 0 && ~(1210318848 & var19[var22][var23 + 1]) == -1) {
                class216.field3240[var26] = var11 + -1;
                class563.field8152[var26] = var12 + 1;
                var26 = 4095 & var26 + 1;
                class489.field7046[var20 + -1][var21 + 1] = 6;
                class616.field8775[var20 + -1][var21 + 1] = var25;
            }
            if (~var20 > -128 && var21 < 127 && ~class489.field7046[var20 + 1][var21 + 1] == -1 && ~(2015625216 & var19[var22 + 1][var23 - -1]) == -1 && (1612972032 & var19[var22 + 1][var23]) == 0 && ~(1210318848 & var19[var22][var23 + 1]) == -1) {
                class216.field3240[var26] = var11 + 1;
                class563.field8152[var26] = var12 - -1;
                class489.field7046[var20 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 4095;
                class616.field8775[var20 - -1][var21 + 1] = var25;
            }
        }
        class265.field3795 = var11;
        class501.field7283 = var12;
        return false;
    }

    @OriginalMember(owner = "client!kw", name = "F", descriptor = "(II)V", line = 3953)
    public final void method1254(int arg0, int arg1) {
        ++field4906;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 3960)
    public final class339 method311(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field4898;
        return new class410(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "(B)V", line = 3968)
    public final void method2187(byte arg0) {
        if (~this.field4996 != -17) {
            this.method2155(0);
            this.method2190(true, true);
            this.method2180((byte) -86, true);
            this.method2160(true, 33);
            this.method2138(27032, 1);
            this.field4996 = 16;
        }
        if (arg0 > -10) {
            this.field5000 = false;
        }
        ++field4770;
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(III)V", line = 3988)
    public final void method2188(int arg0, int arg1, int arg2) {
        this.field5059 = arg0;
        this.field5008 = arg2;
        ++field4833;
        int var4 = -111 / ((80 - arg1) / 36);
        this.method2191((byte) -124);
        this.method2177(0);
    }

    @OriginalMember(owner = "client!kw", name = "r", descriptor = "(IIIIIII)I", line = 4001)
    public final int method324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4840;
        float var8 = (float) arg2 * this.field4998.field5499 + (float) arg0 * this.field4998.field5476 + (float) arg1 * this.field4998.field5475 + this.field4998.field5490;
        float var9 = (float) arg5 * this.field4998.field5499 + (float) arg3 * this.field4998.field5476 + (float) arg4 * this.field4998.field5475 + this.field4998.field5490;
        int var10 = 0;
        if ((float) this.field5043 > var8 && (float) this.field5043 > var9) {
            var10 |= 16;
        } else if (var8 > (float) this.field5089 && var9 > (float) this.field5089) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field4998.field5487 + (float) arg0 * this.field4998.field5464 + (float) arg1 * this.field4998.field5465 + this.field4998.field5494) * (float) this.field5067 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field4998.field5487 + (float) arg3 * this.field4998.field5464 + (float) arg4 * this.field4998.field5465 + this.field4998.field5494) * (float) this.field5067 / (float) arg6);
        if ((float) var11 < this.field5106 && (float) var12 < this.field5106) {
            var10 |= 1;
        } else if (this.field5115 < (float) var11 && (float) var12 > this.field5115) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field4998.field5468 + (float) arg0 * this.field4998.field5466 + (float) arg1 * this.field4998.field5503 + this.field4998.field5504) * (float) this.field5042 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field4998.field5468 + (float) arg3 * this.field4998.field5466 + (float) arg4 * this.field4998.field5503 + this.field4998.field5504) * (float) this.field5042 / (float) arg6);
        if (this.field5045 > (float) var13 && (float) var14 < this.field5045) {
            var10 |= 4;
        } else if ((float) var13 > this.field5037 && this.field5037 < (float) var14) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IF)V", line = 4047)
    public final void method2189(int arg0, float arg1) {
        if (arg0 == 1365) {
            if (this.field5012 != arg1) {
                this.field5012 = arg1;
                if (~this.field5057 == -4) {
                    this.method2181(arg0 ^ -1315);
                }
            }
            ++field4938;
        }
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(I)V", line = 4065)
    public final synchronized void method260(int arg0) {
        ++field4805;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field4989.method3555(94)) {
            class177 var12 = (class177) this.field4989.method3563(0);
            class657.field9415[var3++] = (int) var12.field6188;
            this.field4985 -= var12.field2473;
            if (~var3 == -1001) {
                OpenGL.glDeleteBuffersARB(var3, class657.field9415, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class657.field9415, 0);
            var3 = 0;
        }
        while (!this.field4990.method3555(72)) {
            class177 var11 = (class177) this.field4990.method3563(0);
            class657.field9415[var3++] = (int) var11.field6188;
            this.field4988 -= var11.field2473;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class657.field9415, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteTextures(var3, class657.field9415, 0);
            var3 = 0;
        }
        while (!this.field4991.method3555(105)) {
            class177 var10 = (class177) this.field4991.method3563(0);
            class657.field9415[var3++] = var10.field2473;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class657.field9415, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class657.field9415, 0);
            var3 = 0;
        }
        while (!this.field4992.method3555(70)) {
            class177 var9 = (class177) this.field4992.method3563(0);
            class657.field9415[var3++] = (int) var9.field6188;
            this.field4987 -= var9.field2473;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class657.field9415, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class657.field9415, 0);
            boolean var4 = false;
        }
        while (!this.field4986.method3555(89)) {
            class177 var8 = (class177) this.field4986.method3563(0);
            OpenGL.glDeleteLists((int) var8.field6188, var8.field2473);
        }
        while (!this.field4993.method3555(82)) {
            class430 var7 = this.field4993.method3563(0);
            OpenGL.glDeleteProgramARB((int) var7.field6188);
        }
        while (!this.field4994.method3555(87)) {
            class430 var6 = this.field4994.method3563(0);
            OpenGL.glDeleteObjectARB(var6.field6188);
        }
        while (!this.field4986.method3555(116)) {
            class177 var5 = (class177) this.field4986.method3563(0);
            OpenGL.glDeleteLists((int) var5.field6188, var5.field2473);
        }
        this.field4961.method2932(false);
        if (this.method331() > 100663296 && ~class465.method2818(255) < ~(this.field5002 + 60000L)) {
            System.gc();
            this.field5002 = class465.method2818(255);
        }
        this.field4973 = var2;
    }

    @OriginalMember(owner = "client!kw", name = "t", descriptor = "()Z", line = 4233)
    public final boolean method343() {
        ++field4869;
        return false;
    }

    @OriginalMember(owner = "client!kw", name = "xa", descriptor = "(F)V", line = 4244)
    public final void method271(float arg0) {
        if (this.field5063 != arg0) {
            this.field5063 = arg0;
            this.method2185((byte) -40);
        }
        ++field4772;
    }

    @OriginalMember(owner = "client!kw", name = "aa", descriptor = "(IIIIII)V", line = 4259)
    public final void method397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4764;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method2169(9893);
        float var10 = (float) arg3 + var8;
        this.method2138(27032, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5013) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5013) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "()Z", line = 4303)
    public final boolean method296() {
        ++field4859;
        return this.field4962.method896(1, 3);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZZ)V", line = 4311)
    public final void method2190(boolean arg0, boolean arg1) {
        if (this.field5014 != arg1) {
            this.field5014 = arg1;
            this.method2165(512);
            this.field4996 &= -32;
        }
        if (!arg0) {
            this.method364((class121) null);
        }
        ++field4845;
    }

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "(B)V", line = 4329)
    private final void method2191(byte arg0) {
        if (arg0 > -121) {
            this.method2163((byte) -82, -2.1435258F, -1.2029446F);
        }
        OpenGL.glViewport(this.field5059, this.field5008, this.field4836, this.field4763);
        ++field4827;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lvaa;B)V", line = 4341)
    public final void method2192(class107 arg0, byte arg1) {
        if (arg1 != 53) {
            this.method255();
        }
        ++field4904;
        if (this.field4984 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field4984 <= -1) {
                this.field4977[this.field4984].method794((byte) 123);
            }
            this.field4983 = this.field4977[++this.field4984] = arg0;
            this.field4983.method791(arg1 + 21578);
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 4363)
    public final void method314(Canvas arg0, int arg1, int arg2) {
        ++field4926;
        long var4 = 0L;
        if (arg0 != null && this.field4872 != arg0) {
            if (this.field4941.containsKey(arg0)) {
                Long var6 = (Long) this.field4941.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field4846;
        }
        if (var4 == 0L) {
            throw new RuntimeException();
        } else {
            this.field4849.surfaceResized(var4);
            if (this.field4862 == arg0) {
                this.method2129(false);
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "()V", line = 4396)
    public final void method1227() {
        ++field4932;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!kw", name = "y", descriptor = "()V", line = 4407)
    public final void method1222() {
        ++field4934;
        if (this.field5088 && ~this.field4836 < -1 && ~this.field4763 < -1) {
            int var1 = this.field5040;
            int var2 = this.field5054;
            int var3 = this.field5064;
            int var4 = this.field5010;
            this.method328();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2137(-106);
            this.method2190(true, false);
            this.method2142(false, (byte) -120);
            this.method2180((byte) -86, false);
            this.method2160(false, 8);
            this.method2164(6, (class158) null);
            this.method2176(-2, -73);
            this.method2120(1, 25);
            this.method2138(27032, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field4836, this.field4763, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method297(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIIIILaa;II)V", line = 4453)
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class569 arg6, int arg7, int arg8) {
        ++field4928;
        class512 var10 = (class512) arg6;
        class9 var11 = var10.field7421;
        this.method2172(108);
        this.method2164(6, var10.field7421);
        this.method2138(27032, arg5);
        this.method2149(-11771, 8448, 7681);
        this.method2167(34167, 768, 10603, 0);
        float var12 = var11.field71 / (float) var11.field74;
        float var13 = var11.field72 / (float) var11.field68;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var17 = var14 * var16;
        float var18 = var15 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method2167(5890, 768, 10603, 0);
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(ILvaa;)V", line = 4491)
    public final void method2193(int arg0, class107 arg1) {
        if (arg0 < 17) {
            this.method2120(-96, -12);
        }
        ++field4784;
        if (this.field5050) {
            this.method2175(90, arg1);
            this.method2147((byte) -42, arg1);
        } else if (~this.field4976 <= -1 && this.field4978[this.field4976] == arg1) {
            this.field4978[this.field4976--] = null;
            arg1.method790(66);
            if (~this.field4976 <= -1) {
                this.field4983 = this.field4980 = this.field4978[this.field4976];
                this.field4983.method795(2234);
            } else {
                this.field4983 = this.field4980 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kw", name = "M", descriptor = "()I", line = 4529)
    public final int method332() {
        ++field4838;
        int var1 = this.field5120;
        this.field5120 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!kw", name = "A", descriptor = "(I)V", line = 4542)
    private final void method2194(int arg0) {
        class709.field9960[1] = this.field5109 * this.field5029;
        class709.field9960[0] = this.field5109 * this.field5092;
        ++field4893;
        class709.field9960[2] = this.field5109 * this.field5077;
        class709.field9960[3] = 1.0F;
        OpenGL.glLightfv(16384, 4609, class709.field9960, 0);
        class709.field9960[2] = -this.field5019 * this.field5077;
        class709.field9960[0] = -this.field5019 * this.field5092;
        class709.field9960[arg0] = -this.field5019 * this.field5029;
        class709.field9960[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class709.field9960, 0);
    }

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "()Z", line = 4560)
    public final boolean method217() {
        ++field4931;
        return this.field5013 && (!this.method1242() || this.field5101);
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(II)Lup;", line = 4572)
    public final class239 method1253(int arg0, int arg1) {
        ++field4760;
        return null;
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(Lvaa;I)V", line = 4582)
    public final void method2195(class107 arg0, int arg1) {
        ++field4879;
        if (!this.field5050) {
            if (~this.field4976 <= -4) {
                throw new RuntimeException();
            }
            if (this.field4976 >= 0) {
                this.field4978[this.field4976].method790(43);
            }
            this.field4983 = this.field4980 = this.field4978[++this.field4976] = arg0;
            this.field4983.method795(2234);
        } else {
            this.method2192(arg0, (byte) 53);
            this.method2131(arg0, -27);
        }
        if (arg1 <= 41) {
            this.field4993 = null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lffa;Z)Ltd;", line = 4619)
    public final class515 method202(class676 arg0, boolean arg1) {
        ++field4801;
        int[] var3 = new int[arg0.field9618 * arg0.field9614];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field9616 == null) {
            for (int var6 = 0; var6 < arg0.field9618; ++var6) {
                for (int var7 = 0; ~arg0.field9614 < ~var7; ++var7) {
                    int var8 = arg0.field9615[255 & arg0.field9612[var4++]];
                    var3[var5++] = var8 == 0 ? 0 : class430.method2658(-16777216, var8);
                }
            }
        } else {
            for (int var9 = 0; ~var9 > ~arg0.field9618; ++var9) {
                for (int var11 = 0; ~var11 > ~arg0.field9614; ++var11) {
                    var3[var5++] = class430.method2658(arg0.field9616[var4] << 24, arg0.field9615[class368.method2314(255, arg0.field9612[var4])]);
                    ++var4;
                }
            }
        }
        class515 var10 = this.method3265(var3, arg0.field9618, arg0.field9614, arg0.field9614, 0, (byte) 50);
        var10.method783(arg0.field9613, arg0.field9610, arg0.field9617, arg0.field9611);
        return var10;
    }

    @OriginalMember(owner = "client!kw", name = "B", descriptor = "(I)V", line = 4684)
    public final void method2196(int arg0) {
        if (~this.field4996 != -5) {
            this.method2182((byte) -107);
            this.method2190(true, false);
            this.method2142(false, (byte) -105);
            this.method2180((byte) -86, false);
            this.method2160(false, 77);
            this.method2176(-2, arg0 ^ 29519);
            this.method2138(27032, 1);
            this.field4996 = 4;
        }
        if (arg0 != 29465) {
            this.field4987 = -24;
        }
        ++field4892;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lot;Z)V", line = 4707)
    public final void method2197(class378 arg0, boolean arg1) {
        ++field4767;
        OpenGL.glLoadMatrixf(arg0.method2350(arg1), 0);
        if (arg1) {
            this.field5115 = 0.9213255F;
        }
    }

    @OriginalMember(owner = "client!kw", name = "l", descriptor = "(B)V", line = 4718)
    private final void method2198(byte arg0) {
        if (arg0 >= -37) {
            this.field5100 = true;
        }
        OpenGL.glLoadIdentity();
        ++field4841;
        OpenGL.glMultMatrixf(this.field5004.method2350(false), 0);
        if (this.field5025) {
            this.field4962.field1750.method3823(true);
        }
        this.method2133(8343);
        this.method2141(2);
    }

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "(II)I", line = 4735)
    public final int method2199(int arg0, int arg1) {
        if (arg0 != 26885) {
            this.method260(69);
        }
        ++field4857;
        if (arg1 != 6406 && arg1 != 6409) {
            if (arg1 != 6410 && ~arg1 != -34847 && arg1 != 34844) {
                if (arg1 == 6407) {
                    return 3;
                } else if (arg1 != 6408 && arg1 != 34847) {
                    if (~arg1 == -34844) {
                        return 6;
                    } else if (~arg1 != -34843) {
                        if (~arg1 != -6403) {
                            if (~arg1 == -6402) {
                                return 1;
                            } else {
                                throw new IllegalArgumentException("");
                            }
                        } else {
                            return 3;
                        }
                    } else {
                        return 8;
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
}
