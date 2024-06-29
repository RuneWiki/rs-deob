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

@OriginalClass("client!od")
public class class349 extends class162 {

    @OriginalMember(owner = "client!od", name = "ge", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field5216 = new Hashtable();

    @OriginalMember(owner = "client!od", name = "he", descriptor = "I")
    public int field5217 = 128;

    @OriginalMember(owner = "client!od", name = "ie", descriptor = "Lbb;")
    private class217 field5218 = new class217();

    @OriginalMember(owner = "client!od", name = "oe", descriptor = "Ldj;")
    private class227 field5224 = new class227();

    @OriginalMember(owner = "client!od", name = "pe", descriptor = "Ldj;")
    public class227 field5225 = new class227();

    @OriginalMember(owner = "client!od", name = "qe", descriptor = "Z")
    private boolean field5226 = false;

    @OriginalMember(owner = "client!od", name = "te", descriptor = "I")
    public int field5229 = 8;

    @OriginalMember(owner = "client!od", name = "ve", descriptor = "I")
    public int field5231 = 3;

    @OriginalMember(owner = "client!od", name = "we", descriptor = "Lvp;")
    private class123 field5232 = new class123();

    @OriginalMember(owner = "client!od", name = "Be", descriptor = "I")
    private int field5237 = -1;

    @OriginalMember(owner = "client!od", name = "Ae", descriptor = "[Lig;")
    private class160[] field5236 = new class160[4];

    @OriginalMember(owner = "client!od", name = "xe", descriptor = "I")
    private int field5233 = -1;

    @OriginalMember(owner = "client!od", name = "ye", descriptor = "[Lig;")
    private class160[] field5234 = new class160[4];

    @OriginalMember(owner = "client!od", name = "Ce", descriptor = "[Lig;")
    private class160[] field5238 = new class160[4];

    @OriginalMember(owner = "client!od", name = "De", descriptor = "I")
    private int field5239 = -1;

    @OriginalMember(owner = "client!od", name = "Ge", descriptor = "Lvp;")
    private class123 field5242;

    @OriginalMember(owner = "client!od", name = "Je", descriptor = "Lvp;")
    private class123 field5245;

    @OriginalMember(owner = "client!od", name = "Ke", descriptor = "Lvp;")
    private class123 field5246;

    @OriginalMember(owner = "client!od", name = "Le", descriptor = "Lvp;")
    private class123 field5247;

    @OriginalMember(owner = "client!od", name = "Me", descriptor = "Lvp;")
    private class123 field5248;

    @OriginalMember(owner = "client!od", name = "Ne", descriptor = "Lvp;")
    private class123 field5249;

    @OriginalMember(owner = "client!od", name = "Oe", descriptor = "Lvp;")
    private class123 field5250;

    @OriginalMember(owner = "client!od", name = "Qe", descriptor = "I")
    private int field5252;

    @OriginalMember(owner = "client!od", name = "Ye", descriptor = "I")
    public int field5260;

    @OriginalMember(owner = "client!od", name = "vf", descriptor = "[F")
    private float[] field5282;

    @OriginalMember(owner = "client!od", name = "Xe", descriptor = "I")
    public int field5259;

    @OriginalMember(owner = "client!od", name = "ef", descriptor = "F")
    public float field5266;

    @OriginalMember(owner = "client!od", name = "tf", descriptor = "I")
    private int field5280;

    @OriginalMember(owner = "client!od", name = "Hf", descriptor = "F")
    public float field5294;

    @OriginalMember(owner = "client!od", name = "Pe", descriptor = "[F")
    private float[] field5251;

    @OriginalMember(owner = "client!od", name = "Of", descriptor = "I")
    public int field5301;

    @OriginalMember(owner = "client!od", name = "of", descriptor = "I")
    public int field5275;

    @OriginalMember(owner = "client!od", name = "yf", descriptor = "I")
    private int field5285;

    @OriginalMember(owner = "client!od", name = "pf", descriptor = "F")
    public float field5276;

    @OriginalMember(owner = "client!od", name = "Gf", descriptor = "[F")
    private float[] field5293;

    @OriginalMember(owner = "client!od", name = "qf", descriptor = "Z")
    private boolean field5277;

    @OriginalMember(owner = "client!od", name = "sg", descriptor = "I")
    public int field5331;

    @OriginalMember(owner = "client!od", name = "Cg", descriptor = "[F")
    public float[] field5341;

    @OriginalMember(owner = "client!od", name = "Pf", descriptor = "I")
    private int field5302;

    @OriginalMember(owner = "client!od", name = "Hg", descriptor = "I")
    private int field5346;

    @OriginalMember(owner = "client!od", name = "ng", descriptor = "[Lkt;")
    private class107[] field5326;

    @OriginalMember(owner = "client!od", name = "ff", descriptor = "F")
    private float field5267;

    @OriginalMember(owner = "client!od", name = "xg", descriptor = "I")
    public int field5336;

    @OriginalMember(owner = "client!od", name = "kg", descriptor = "I")
    public int field5323;

    @OriginalMember(owner = "client!od", name = "Ng", descriptor = "I")
    private int field5352;

    @OriginalMember(owner = "client!od", name = "zg", descriptor = "F")
    private float field5338;

    @OriginalMember(owner = "client!od", name = "Ze", descriptor = "[F")
    private float[] field5261;

    @OriginalMember(owner = "client!od", name = "Lg", descriptor = "I")
    public int field5350;

    @OriginalMember(owner = "client!od", name = "Wf", descriptor = "I")
    private int field5309;

    @OriginalMember(owner = "client!od", name = "qg", descriptor = "F")
    public float field5329;

    @OriginalMember(owner = "client!od", name = "vg", descriptor = "I")
    private int field5334;

    @OriginalMember(owner = "client!od", name = "dh", descriptor = "F")
    public float field5368;

    @OriginalMember(owner = "client!od", name = "Xg", descriptor = "F")
    public float field5362;

    @OriginalMember(owner = "client!od", name = "Yg", descriptor = "F")
    public float field5363;

    @OriginalMember(owner = "client!od", name = "ch", descriptor = "I")
    public int field5367;

    @OriginalMember(owner = "client!od", name = "yg", descriptor = "F")
    public float field5337;

    @OriginalMember(owner = "client!od", name = "Ig", descriptor = "I")
    public int field5347;

    @OriginalMember(owner = "client!od", name = "Eg", descriptor = "I")
    public int field5343;

    @OriginalMember(owner = "client!od", name = "Zg", descriptor = "F")
    private float field5364;

    @OriginalMember(owner = "client!od", name = "Qg", descriptor = "I")
    private int field5355;

    @OriginalMember(owner = "client!od", name = "Mf", descriptor = "I")
    private int field5299;

    @OriginalMember(owner = "client!od", name = "me", descriptor = "I")
    public int field5222;

    @OriginalMember(owner = "client!od", name = "jd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5167;

    @OriginalMember(owner = "client!od", name = "Dd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5187;

    @OriginalMember(owner = "client!od", name = "Yc", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field5156;

    @OriginalMember(owner = "client!od", name = "id", descriptor = "J")
    private long field5166;

    @OriginalMember(owner = "client!od", name = "Uc", descriptor = "J")
    private long field5152;

    @OriginalMember(owner = "client!od", name = "ag", descriptor = "Z")
    public boolean field5313;

    @OriginalMember(owner = "client!od", name = "Bg", descriptor = "I")
    public int field5340;

    @OriginalMember(owner = "client!od", name = "Df", descriptor = "Ljava/lang/String;")
    private String field5290;

    @OriginalMember(owner = "client!od", name = "bf", descriptor = "Z")
    public boolean field5263;

    @OriginalMember(owner = "client!od", name = "fh", descriptor = "Z")
    private boolean field5370;

    @OriginalMember(owner = "client!od", name = "Vf", descriptor = "Z")
    public boolean field5308;

    @OriginalMember(owner = "client!od", name = "Tg", descriptor = "Z")
    public boolean field5358;

    @OriginalMember(owner = "client!od", name = "Qf", descriptor = "Z")
    private boolean field5303;

    @OriginalMember(owner = "client!od", name = "Fg", descriptor = "Ljava/lang/String;")
    private String field5344;

    @OriginalMember(owner = "client!od", name = "fg", descriptor = "Z")
    public boolean field5318;

    @OriginalMember(owner = "client!od", name = "Pg", descriptor = "Z")
    private boolean field5354;

    @OriginalMember(owner = "client!od", name = "ke", descriptor = "Lot;")
    public class415 field5220;

    @OriginalMember(owner = "client!od", name = "re", descriptor = "Lms;")
    public class530 field5227;

    @OriginalMember(owner = "client!od", name = "le", descriptor = "Lov;")
    private class122 field5221;

    @OriginalMember(owner = "client!od", name = "ne", descriptor = "Lcr;")
    private class403 field5223;

    @OriginalMember(owner = "client!od", name = "je", descriptor = "Liu;")
    private class406 field5219;

    @OriginalMember(owner = "client!od", name = "ob", descriptor = "[I")
    public static int[] field5068 = new int[13];

    @OriginalMember(owner = "client!od", name = "pb", descriptor = "I")
    public static int field5069 = 50;

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "[I")
    public static int[] field5054 = new int[field5069];

    @OriginalMember(owner = "client!od", name = "Fc", descriptor = "[I")
    public static int[] field5137 = new int[field5069];

    @OriginalMember(owner = "client!od", name = "qb", descriptor = "[I")
    public static int[] field5070 = new int[field5069];

    @OriginalMember(owner = "client!od", name = "eb", descriptor = "[I")
    public static int[] field5058 = new int[field5069];

    @OriginalMember(owner = "client!od", name = "Tb", descriptor = "[Ljava/lang/String;")
    public static String[] field5099 = new String[field5069];

    @OriginalMember(owner = "client!od", name = "uc", descriptor = "[I")
    public static int[] field5126 = new int[field5069];

    @OriginalMember(owner = "client!od", name = "Db", descriptor = "I")
    public static int field5083 = 1338;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "[I")
    public static int[] field5024 = new int[field5069];

    @OriginalMember(owner = "client!od", name = "Re", descriptor = "F")
    private float field5253;

    @OriginalMember(owner = "client!od", name = "nf", descriptor = "F")
    public float field5274;

    @OriginalMember(owner = "client!od", name = "Uf", descriptor = "F")
    public float field5307;

    @OriginalMember(owner = "client!od", name = "ig", descriptor = "F")
    public float field5321;

    @OriginalMember(owner = "client!od", name = "ug", descriptor = "F")
    public float field5333;

    @OriginalMember(owner = "client!od", name = "Ag", descriptor = "F")
    private float field5339;

    @OriginalMember(owner = "client!od", name = "Gg", descriptor = "F")
    public float field5345;

    @OriginalMember(owner = "client!od", name = "Mg", descriptor = "F")
    public float field5351;

    @OriginalMember(owner = "client!od", name = "Vg", descriptor = "F")
    public float field5360;

    @OriginalMember(owner = "client!od", name = "ah", descriptor = "F")
    private float field5365;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "I")
    private int field5042;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!od", name = "db", descriptor = "I")
    public int field5057;

    @OriginalMember(owner = "client!od", name = "fb", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!od", name = "gb", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!od", name = "hb", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!od", name = "ib", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!od", name = "jb", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!od", name = "kb", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!od", name = "lb", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!od", name = "mb", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!od", name = "nb", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!od", name = "rb", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!od", name = "sb", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!od", name = "tb", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!od", name = "ub", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!od", name = "vb", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!od", name = "wb", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!od", name = "xb", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!od", name = "yb", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!od", name = "zb", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!od", name = "Ab", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!od", name = "Bb", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!od", name = "Cb", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!od", name = "Eb", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!od", name = "Fb", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!od", name = "Gb", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!od", name = "Hb", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!od", name = "Ib", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!od", name = "Jb", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!od", name = "Kb", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!od", name = "Lb", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!od", name = "Mb", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!od", name = "Nb", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!od", name = "Ob", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!od", name = "Pb", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!od", name = "Qb", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!od", name = "Rb", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!od", name = "Sb", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!od", name = "Ub", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!od", name = "Vb", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!od", name = "Wb", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!od", name = "Xb", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!od", name = "Yb", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!od", name = "Zb", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!od", name = "ac", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!od", name = "bc", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!od", name = "cc", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!od", name = "dc", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!od", name = "ec", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!od", name = "fc", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!od", name = "gc", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!od", name = "hc", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!od", name = "ic", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!od", name = "jc", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!od", name = "kc", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!od", name = "lc", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!od", name = "mc", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!od", name = "nc", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!od", name = "oc", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!od", name = "pc", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!od", name = "qc", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!od", name = "rc", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!od", name = "sc", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!od", name = "tc", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!od", name = "vc", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!od", name = "wc", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!od", name = "xc", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!od", name = "yc", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!od", name = "zc", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!od", name = "Ac", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!od", name = "Bc", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!od", name = "Cc", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!od", name = "Dc", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!od", name = "Ec", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!od", name = "Gc", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!od", name = "Hc", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!od", name = "Ic", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!od", name = "Jc", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!od", name = "Kc", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!od", name = "Lc", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!od", name = "Mc", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!od", name = "Nc", descriptor = "I")
    private int field5145;

    @OriginalMember(owner = "client!od", name = "Oc", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!od", name = "Pc", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!od", name = "Qc", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!od", name = "Rc", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!od", name = "Sc", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!od", name = "Tc", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!od", name = "Vc", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!od", name = "Wc", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!od", name = "Xc", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!od", name = "Zc", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!od", name = "ad", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!od", name = "bd", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!od", name = "cd", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!od", name = "dd", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!od", name = "ed", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!od", name = "fd", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!od", name = "gd", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!od", name = "hd", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!od", name = "kd", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!od", name = "ld", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!od", name = "md", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!od", name = "nd", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!od", name = "od", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!od", name = "pd", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!od", name = "qd", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!od", name = "rd", descriptor = "I")
    public int field5175;

    @OriginalMember(owner = "client!od", name = "sd", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!od", name = "td", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!od", name = "ud", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!od", name = "vd", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!od", name = "wd", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!od", name = "xd", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!od", name = "yd", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!od", name = "zd", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!od", name = "Ad", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!od", name = "Bd", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!od", name = "Cd", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!od", name = "Ed", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!od", name = "Fd", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!od", name = "Gd", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!od", name = "Hd", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!od", name = "Id", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!od", name = "Jd", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!od", name = "Kd", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!od", name = "Ld", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!od", name = "Md", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!od", name = "Nd", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!od", name = "Od", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!od", name = "Pd", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!od", name = "Qd", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!od", name = "Rd", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!od", name = "Sd", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!od", name = "Td", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!od", name = "Ud", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!od", name = "Vd", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!od", name = "Wd", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!od", name = "Xd", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!od", name = "Yd", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!od", name = "Zd", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!od", name = "ae", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!od", name = "be", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!od", name = "ce", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!od", name = "de", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!od", name = "ee", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!od", name = "fe", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!od", name = "se", descriptor = "I")
    public int field5228;

    @OriginalMember(owner = "client!od", name = "Fe", descriptor = "I")
    public int field5241;

    @OriginalMember(owner = "client!od", name = "He", descriptor = "I")
    private int field5243;

    @OriginalMember(owner = "client!od", name = "Ie", descriptor = "I")
    public int field5244;

    @OriginalMember(owner = "client!od", name = "Ve", descriptor = "I")
    private int field5257;

    @OriginalMember(owner = "client!od", name = "df", descriptor = "I")
    private int field5265;

    @OriginalMember(owner = "client!od", name = "kf", descriptor = "I")
    private int field5271;

    @OriginalMember(owner = "client!od", name = "lf", descriptor = "I")
    public int field5272;

    @OriginalMember(owner = "client!od", name = "xf", descriptor = "I")
    private int field5284;

    @OriginalMember(owner = "client!od", name = "zf", descriptor = "I")
    private int field5286;

    @OriginalMember(owner = "client!od", name = "Ff", descriptor = "I")
    public int field5292;

    @OriginalMember(owner = "client!od", name = "If", descriptor = "I")
    private int field5295;

    @OriginalMember(owner = "client!od", name = "Nf", descriptor = "I")
    public int field5300;

    @OriginalMember(owner = "client!od", name = "Sf", descriptor = "I")
    private int field5305;

    @OriginalMember(owner = "client!od", name = "Xf", descriptor = "I")
    private int field5310;

    @OriginalMember(owner = "client!od", name = "Zf", descriptor = "I")
    private int field5312;

    @OriginalMember(owner = "client!od", name = "jg", descriptor = "I")
    public int field5322;

    @OriginalMember(owner = "client!od", name = "og", descriptor = "I")
    private int field5327;

    @OriginalMember(owner = "client!od", name = "Og", descriptor = "I")
    private int field5353;

    @OriginalMember(owner = "client!od", name = "Wg", descriptor = "I")
    private int field5361;

    @OriginalMember(owner = "client!od", name = "gh", descriptor = "I")
    private int field5371;

    @OriginalMember(owner = "client!od", name = "hf", descriptor = "J")
    private long field5269;

    @OriginalMember(owner = "client!od", name = "ze", descriptor = "Lig;")
    private class160 field5235;

    @OriginalMember(owner = "client!od", name = "Ee", descriptor = "Lig;")
    private class160 field5240;

    @OriginalMember(owner = "client!od", name = "Kg", descriptor = "Lhs;")
    private class213 field5349;

    @OriginalMember(owner = "client!od", name = "cf", descriptor = "Lnc;")
    private class21 field5264;

    @OriginalMember(owner = "client!od", name = "Lf", descriptor = "Lnc;")
    private class21 field5298;

    @OriginalMember(owner = "client!od", name = "hg", descriptor = "Ldj;")
    public class227 field5320;

    @OriginalMember(owner = "client!od", name = "wg", descriptor = "Ldj;")
    public class227 field5335;

    @OriginalMember(owner = "client!od", name = "Jf", descriptor = "Lah;")
    public class260 field5296;

    @OriginalMember(owner = "client!od", name = "Kf", descriptor = "Lah;")
    public class260 field5297;

    @OriginalMember(owner = "client!od", name = "gg", descriptor = "Lah;")
    public class260 field5319;

    @OriginalMember(owner = "client!od", name = "Ug", descriptor = "Lwe;")
    private class279 field5359;

    @OriginalMember(owner = "client!od", name = "Te", descriptor = "Lvj;")
    public class304 field5255;

    @OriginalMember(owner = "client!od", name = "af", descriptor = "Lvj;")
    public class304 field5262;

    @OriginalMember(owner = "client!od", name = "gf", descriptor = "Lvj;")
    public class304 field5268;

    @OriginalMember(owner = "client!od", name = "rf", descriptor = "Lvj;")
    public class304 field5278;

    @OriginalMember(owner = "client!od", name = "Ef", descriptor = "Lvj;")
    public class304 field5291;

    @OriginalMember(owner = "client!od", name = "Tf", descriptor = "Lvj;")
    public class304 field5306;

    @OriginalMember(owner = "client!od", name = "Yf", descriptor = "Lvj;")
    public class304 field5311;

    @OriginalMember(owner = "client!od", name = "bg", descriptor = "Lvj;")
    public class304 field5314;

    @OriginalMember(owner = "client!od", name = "eg", descriptor = "Lvj;")
    public class304 field5317;

    @OriginalMember(owner = "client!od", name = "pg", descriptor = "Lvj;")
    public class304 field5328;

    @OriginalMember(owner = "client!od", name = "jf", descriptor = "Lbg;")
    public class323 field5270;

    @OriginalMember(owner = "client!od", name = "uf", descriptor = "Lbg;")
    public class323 field5281;

    @OriginalMember(owner = "client!od", name = "Ue", descriptor = "Lap;")
    private class332 field5256;

    @OriginalMember(owner = "client!od", name = "tg", descriptor = "Lfv;")
    public class77 field5332;

    @OriginalMember(owner = "client!od", name = "eh", descriptor = "Lfv;")
    public class77 field5369;

    @OriginalMember(owner = "client!od", name = "ue", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field5230;

    @OriginalMember(owner = "client!od", name = "We", descriptor = "Z")
    private boolean field5258;

    @OriginalMember(owner = "client!od", name = "mf", descriptor = "Z")
    private boolean field5273;

    @OriginalMember(owner = "client!od", name = "sf", descriptor = "Z")
    public boolean field5279;

    @OriginalMember(owner = "client!od", name = "wf", descriptor = "Z")
    public boolean field5283;

    @OriginalMember(owner = "client!od", name = "Af", descriptor = "Z")
    private boolean field5287;

    @OriginalMember(owner = "client!od", name = "Bf", descriptor = "Z")
    private boolean field5288;

    @OriginalMember(owner = "client!od", name = "Cf", descriptor = "Z")
    public boolean field5289;

    @OriginalMember(owner = "client!od", name = "Rf", descriptor = "Z")
    private boolean field5304;

    @OriginalMember(owner = "client!od", name = "cg", descriptor = "Z")
    public boolean field5315;

    @OriginalMember(owner = "client!od", name = "dg", descriptor = "Z")
    public boolean field5316;

    @OriginalMember(owner = "client!od", name = "lg", descriptor = "Z")
    private boolean field5324;

    @OriginalMember(owner = "client!od", name = "mg", descriptor = "Z")
    private boolean field5325;

    @OriginalMember(owner = "client!od", name = "rg", descriptor = "Z")
    public boolean field5330;

    @OriginalMember(owner = "client!od", name = "Dg", descriptor = "Z")
    private boolean field5342;

    @OriginalMember(owner = "client!od", name = "Jg", descriptor = "Z")
    public boolean field5348;

    @OriginalMember(owner = "client!od", name = "Rg", descriptor = "Z")
    private boolean field5356;

    @OriginalMember(owner = "client!od", name = "Sg", descriptor = "Z")
    private boolean field5357;

    @OriginalMember(owner = "client!od", name = "bh", descriptor = "Z")
    public boolean field5366;

    @OriginalMember(owner = "client!od", name = "Se", descriptor = "[Ljk;")
    private class446[] field5254;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lc;Lpo;Lia;Lvk;I)V", line = 3)
    public final void method1055(class121 arg0, class389 arg1, class414 arg2, class247 arg3, int arg4) {
        arg0.method720(arg2, arg3, arg4);
        ++field5131;
        this.method1095(arg1);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLap;)V", line = 13)
    public final void method2119(byte arg0, class332 arg1) {
        ++field5174;
        if (this.field5256 != arg1) {
            if (this.field5370) {
                OpenGL.glBindBufferARB(34963, arg1.method878((byte) 24));
            }
            this.field5256 = arg1;
        }
        if (arg0 != -64) {
            this.field5287 = false;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)V", line = 31)
    public final void method2120(boolean arg0, int arg1) {
        if (this.field5342 == !arg0) {
            this.field5342 = arg0;
            this.method2182(false);
        }
        ++field5096;
        if (arg1 != 8705) {
            this.field5260 = -30;
        }
    }

    @OriginalMember(owner = "client!od", name = "FA", descriptor = "()I", line = 49)
    public final int method1114() {
        ++field5055;
        return this.field5244 + this.field5241 + this.field5243;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([Lc;Lia;[Lvk;I)V", line = 58)
    public final void method1031(class121[] arg0, class414 arg1, class247[] arg2, int arg3) {
        for (int var5 = 0; ~var5 > ~arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method720(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
        ++field5084;
    }

    @OriginalMember(owner = "client!od", name = "va", descriptor = "()V", line = 76)
    public final void method1112() {
        ++field5202;
        this.field5299 = 0;
        this.field5285 = this.field5175;
        this.field5355 = this.field5057;
        this.field5346 = 0;
        OpenGL.glDisable(3089);
        this.method2139((byte) -128);
    }

    @OriginalMember(owner = "client!od", name = "l", descriptor = "()Z", line = 91)
    public final boolean method1075() {
        ++field5031;
        return true;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(FIFF)V", line = 100)
    private final void method2121(float arg0, int arg1, float arg2, float arg3) {
        ++field5082;
        OpenGL.glMatrixMode(5890);
        if (this.field5357) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg2, arg3, arg0);
        OpenGL.glMatrixMode(5888);
        int var5 = -59 % ((arg1 - -28) / 49);
        this.field5357 = true;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(Z)V", line = 117)
    private final void method2122(boolean arg0) {
        ++field5121;
        if (!arg0) {
            int var2 = 0;
            while (!this.field5156.attach()) {
                if (var2++ > 5) {
                    throw new RuntimeException("");
                }
                class246.method1659((byte) 117, 1000L);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "C", descriptor = "()Lia;", line = 142)
    public final class414 method1126() {
        ++field5093;
        return new class227();
    }

    @OriginalMember(owner = "client!od", name = "m", descriptor = "(Lia;)V", line = 150)
    public final void method1082(class414 arg0) {
        ++field5168;
        this.field5320 = (class227) arg0;
        this.field5335.method1553(72, this.field5320);
        if (~this.field5310 != -2) {
            this.method2183((byte) -128);
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V", line = 164)
    private final void method2123(byte arg0) {
        if (arg0 != -86) {
            this.method1081((class275) null, (class408[]) null, true);
        }
        if (~this.field5355 <= ~this.field5299 && this.field5285 >= this.field5346) {
            OpenGL.glScissor(this.field5334 - -this.field5299, -this.field5285 + this.field5175 + this.field5352, this.field5355 - this.field5299, -this.field5346 + this.field5285);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field5049;
    }

    @OriginalMember(owner = "client!od", name = "XA", descriptor = "(IFFFFF)V", line = 184)
    public final void method1049(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field5020;
        boolean var7 = ~this.field5302 != ~arg0;
        if (var7 || this.field5266 != arg1 || this.field5276 != arg2) {
            this.field5302 = arg0;
            this.field5276 = arg2;
            this.field5266 = arg1;
            if (var7) {
                this.field5294 = (float) (255 & this.field5302) / 255.0F;
                this.field5337 = (float) (65280 & this.field5302) / 65280.0F;
                this.field5362 = (float) (16711680 & this.field5302) / 1.671168E7F;
                this.method2140((byte) -83);
            }
            this.method2144(-2);
        }
        if (this.field5282[0] != arg3 || this.field5282[1] != arg4 || this.field5282[2] != arg5) {
            this.field5282[1] = arg4;
            this.field5282[2] = arg5;
            this.field5282[0] = arg3;
            this.field5293[0] = -arg3;
            this.field5293[1] = -arg4;
            this.field5293[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5341[0] = arg3 * var8;
            this.field5341[2] = arg5 * var8;
            this.field5341[1] = arg4 * var8;
            this.field5261[1] = -this.field5341[1];
            this.field5261[2] = -this.field5341[2];
            this.field5261[0] = -this.field5341[0];
            this.method2187(-9463);
            this.field5322 = (int) (arg5 * 256.0F / arg4);
            this.field5300 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(IIIIII)V", line = 233)
    public final void method1104(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5182;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        this.method2146((byte) 124);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method2162(arg5, 1);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5325) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5325) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLig;)V", line = 267)
    public final void method2124(boolean arg0, class160 arg1) {
        if (arg0) {
            ++field5139;
            if (~this.field5239 <= -1 && this.field5238[this.field5239] == arg1) {
                this.field5238[this.field5239--] = null;
                arg1.method441(9921);
                if (this.field5239 >= 0) {
                    this.field5240 = this.field5238[this.field5239];
                    this.field5240.method447(-4087);
                } else {
                    this.field5240 = null;
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V", line = 293)
    public static void method2125(byte arg0) {
        field5058 = null;
        field5024 = null;
        field5099 = null;
        field5070 = null;
        field5126 = null;
        if (arg0 < 17) {
            method2125((byte) -29);
        }
        field5054 = null;
        field5137 = null;
        field5068 = null;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(B)V", line = 310)
    private final void method2126(byte arg0) {
        ++field5090;
        float[] var2 = this.field5251;
        if (arg0 != 74) {
            this.field5264 = null;
        }
        float var3 = (float) (-this.field5347 * this.field5275) / (float) this.field5260;
        float var4 = (float) ((-this.field5347 + this.field5057) * this.field5275) / (float) this.field5260;
        float var5 = (float) (this.field5331 * this.field5275) / (float) this.field5301;
        float var6 = (float) ((-this.field5175 + this.field5331) * this.field5275) / (float) this.field5301;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field5275 * 2.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[7] = 0.0F;
            var2[0] = var7 / (var4 - var3);
            var2[1] = 0.0F;
            var2[13] = 0.0F;
            var2[4] = 0.0F;
            var2[11] = -1.0F;
            var2[3] = 0.0F;
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[14] = this.field5365 = -((float) this.field5343 * var7) / (float) (-this.field5275 + this.field5343);
            var2[15] = 0.0F;
            var2[6] = 0.0F;
            var2[2] = 0.0F;
            var2[5] = var7 / (var5 - var6);
            var2[10] = this.field5339 = (float) (-(this.field5343 + this.field5275)) / (float) (-this.field5275 + this.field5343);
            var2[12] = 0.0F;
        } else {
            var2[8] = 0.0F;
            var2[11] = 0.0F;
            var2[10] = 1.0F;
            var2[15] = 1.0F;
            var2[7] = 0.0F;
            var2[3] = 0.0F;
            var2[4] = 0.0F;
            var2[12] = 0.0F;
            var2[5] = 1.0F;
            var2[1] = 0.0F;
            var2[6] = 0.0F;
            var2[0] = 1.0F;
            var2[13] = 0.0F;
            var2[9] = 0.0F;
            var2[2] = 0.0F;
            var2[14] = 0.0F;
        }
        this.method2179(-73);
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(Z)V", line = 372)
    public final void method1110(boolean arg0) {
        ++field5120;
        this.field5277 = arg0;
        this.method2164((byte) -96);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZ[BI)Lap;", line = 384)
    public final class332 method2127(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        if (arg4 != 87360) {
            this.method2127(-108, -25, true, (byte[]) null, 72);
        }
        ++field5196;
        return (class332) (!this.field5370 || arg2 && !this.field5303 ? new class131(this, arg1, arg3, arg0) : new class386(this, arg1, arg3, arg0, arg2));
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V", line = 403)
    public final synchronized void method2128(int arg0, int arg1, int arg2) {
        ++field5075;
        if (arg2 == 8) {
            class427 var4 = new class427(arg1);
            var4.field4736 = (long) arg0;
            this.field5245.method809(var4, false);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)V", line = 417)
    public final void method1033(int arg0, int arg1, int arg2, int arg3) {
        ++field5056;
        this.field5221.method804(arg1, -28946, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([Lc;Lpo;Lia;[Lvk;I)V", line = 427)
    public final void method1038(class121[] arg0, class389 arg1, class414 arg2, class247[] arg3, int arg4) {
        ++field5158;
        this.method1031(arg0, arg2, arg3, arg4);
        this.method1095(arg1);
    }

    @OriginalMember(owner = "client!od", name = "da", descriptor = "(IIIII)V", line = 436)
    public final void method1023(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5160;
        this.method2146((byte) 118);
        this.method2162(arg4, 1);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 457)
    public final void method1071(Canvas arg0) {
        ++field5108;
        if (this.field5167 == arg0) {
            throw new RuntimeException();
        } else if (!this.field5216.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field5156.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field5216.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(II)I", line = 495)
    public final int method2129(int arg0, int arg1) {
        if (arg1 > -92) {
            this.field5313 = false;
        }
        ++field5210;
        if (~arg0 != -6407 && ~arg0 != -6410) {
            if (~arg0 != -6411 && ~arg0 != -34847 && ~arg0 != -34845) {
                if (arg0 != 6407) {
                    if (arg0 != 6408 && arg0 != 34847) {
                        if (~arg0 == -34844) {
                            return 6;
                        } else if (~arg0 == -34843) {
                            return 8;
                        } else if (~arg0 != -6403) {
                            if (~arg0 == -6402) {
                                return 1;
                            } else {
                                throw new IllegalArgumentException("");
                            }
                        } else {
                            return 3;
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

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([IIIII)Lf;", line = 539)
    public final class529 method1078(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5110;
        return new class375(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)V", line = 547)
    public final void method2130(int arg0, boolean arg1) {
        if (arg0 <= 18) {
            this.field5234 = null;
        }
        ++field5146;
        if (this.field5324 != arg1) {
            this.field5324 = arg1;
            this.method2182(false);
            this.field5286 &= -8;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(III)V", line = 565)
    public final void method2131(int arg0, int arg1, int arg2) {
        if (this.field5361 != 0) {
            OpenGL.glTexEnvi(8960, 34161, arg2);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        } else {
            boolean var4 = false;
            if (this.field5280 != arg2) {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                this.field5280 = arg2;
                var4 = true;
            }
            if (~this.field5252 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                this.field5252 = arg1;
                var4 = true;
            }
            if (var4) {
                this.field5286 &= -30;
            }
        }
        ++field5135;
        if (arg0 != 34162) {
            this.field5313 = false;
        }
    }

    @OriginalMember(owner = "client!od", name = "SA", descriptor = "(IIIIII)Z", line = 611)
    public final boolean method1105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5151;
        float var7 = (float) arg2 * this.field5320.field3338 + (float) arg0 * this.field5320.field3329 + (float) arg1 * this.field5320.field3352 + this.field5320.field3344;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field5320.field3338 + (float) arg3 * this.field5320.field3329 + (float) arg4 * this.field5320.field3352 + this.field5320.field3344;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field5275 > var7) || !(var8 < (float) this.field5275)) && (!((float) this.field5343 < var7) || !(var8 > (float) this.field5343))) {
            int var9 = (int) (((float) arg2 * this.field5320.field3349 + (float) arg0 * this.field5320.field3347 + (float) arg1 * this.field5320.field3334 + this.field5320.field3341) * (float) this.field5260 / var7);
            int var10 = (int) (((float) arg5 * this.field5320.field3349 + (float) arg3 * this.field5320.field3347 + (float) arg4 * this.field5320.field3334 + this.field5320.field3341) * (float) this.field5260 / var8);
            if ((float) var9 < this.field5360 && (float) var10 < this.field5360 || this.field5351 < (float) var9 && (float) var10 > this.field5351) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field5320.field3335 + (float) arg0 * this.field5320.field3346 + (float) arg1 * this.field5320.field3355 + this.field5320.field3348) * (float) this.field5301 / var7);
                int var12 = (int) (((float) arg5 * this.field5320.field3335 + (float) arg3 * this.field5320.field3346 + (float) arg4 * this.field5320.field3355 + this.field5320.field3348) * (float) this.field5301 / var8);
                return (!(this.field5321 > (float) var11) || !((float) var12 < this.field5321)) && (!(this.field5345 < (float) var11) || !(this.field5345 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!od", name = "s", descriptor = "()Z", line = 650)
    public final boolean method1097() {
        ++field5018;
        return true;
    }

    @OriginalMember(owner = "client!od", name = "la", descriptor = "()F", line = 658)
    public final float method1026() {
        ++field5173;
        return this.field5368;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZLjaggl/memory/NativeBuffer;II)Lnc;", line = 670)
    public final class21 method2132(int arg0, boolean arg1, NativeBuffer arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            this.method1059(-108, -39, 87, -44, 83, 107, (byte[]) null, 109, 39);
        }
        ++field5211;
        return (class21) (!this.field5370 || arg1 && !this.field5303 ? new class46(this, arg4, arg2) : new class523(this, arg4, arg2, arg0, arg1));
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)V", line = 687)
    public final void method1047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field5153;
        this.method1113(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lig;I)V", line = 701)
    public final void method2133(class160 arg0, int arg1) {
        if (arg1 >= -82) {
            this.field5317 = null;
        }
        ++field5181;
        if (!this.field5283) {
            if (this.field5233 >= 0 && this.field5236[this.field5233] == arg0) {
                this.field5236[this.field5233--] = null;
                arg0.method438(13860);
                if (~this.field5233 > -1) {
                    this.field5240 = this.field5235 = null;
                } else {
                    this.field5240 = this.field5235 = this.field5236[this.field5233];
                    this.field5240.method439(26300);
                }
            } else {
                throw new RuntimeException();
            }
        } else {
            this.method2124(true, arg0);
            this.method2134(arg0, false);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lig;Z)V", line = 738)
    public final void method2134(class160 arg0, boolean arg1) {
        if (arg1) {
            this.method1102(-32, -38);
        }
        ++field5102;
        if (this.field5237 >= 0 && this.field5234[this.field5237] == arg0) {
            this.field5234[this.field5237--] = null;
            arg0.method452(-15001);
            if (this.field5237 >= 0) {
                this.field5235 = this.field5234[this.field5237];
                this.field5235.method450((byte) -68);
            } else {
                this.field5235 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(IIII)V", line = 764)
    public final void method2135(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
        ++field5123;
        OpenGL.glTexEnvi(8960, 34200 - -arg0, arg3);
        if (arg2 > -57) {
            this.method1111(-1.3790245F);
        }
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "()I", line = 776)
    public final int method1099() {
        ++field5150;
        int var1 = this.field5353;
        this.field5353 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIILap;B)V", line = 788)
    public final void method2136(int arg0, int arg1, int arg2, class332 arg3, byte arg4) {
        ++field5128;
        int var6 = arg3.method880(15868);
        int var7 = arg2 * this.method2141(var6, 2);
        this.method2119((byte) -64, arg3);
        OpenGL.glDrawElements(arg1, arg0, var6, arg3.method879(126) - -((long) var7));
        int var8 = -53 / ((13 - arg4) / 32);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Lig;I)V", line = 807)
    public final void method2137(class160 arg0, int arg1) {
        ++field5109;
        if (this.field5283) {
            this.method2180(arg0, (byte) -102);
            this.method2169(arg0, (byte) -99);
        } else {
            if (this.field5233 >= 3) {
                throw new RuntimeException();
            }
            if (this.field5233 >= 0) {
                this.field5236[this.field5233].method438(arg1 + 21766);
            }
            this.field5240 = this.field5235 = this.field5236[++this.field5233] = arg0;
            this.field5240.method439(arg1 + 34206);
        }
        if (arg1 != -7906) {
            this.field5283 = true;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I[Lkt;)V", line = 836)
    public final void method1068(int arg0, class107[] arg1) {
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field5326[var3] = arg1[var3];
        }
        ++field5060;
        this.field5327 = arg0;
        if (~this.field5310 != -2) {
            this.method2153(-27858);
        }
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(II)V", line = 859)
    public final synchronized void method2138(int arg0, int arg1) {
        int var3 = -111 % ((arg1 - -47) / 52);
        ++field5032;
        class337 var4 = new class337();
        var4.field4736 = (long) arg0;
        this.field5249.method809(var4, false);
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(B)V", line = 874)
    private final void method2139(byte arg0) {
        this.field5321 = (float) (this.field5346 - this.field5331);
        this.field5351 = (float) (-this.field5347 + this.field5355);
        ++field5161;
        this.field5360 = (float) (-this.field5347 + this.field5299);
        int var2 = -51 % ((-37 - arg0) / 61);
        this.field5345 = (float) (-this.field5331 + this.field5285);
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(B)V", line = 895)
    private final void method2140(byte arg0) {
        class331.field4691[0] = this.field5362 * this.field5307;
        ++field5062;
        class331.field4691[2] = this.field5307 * this.field5294;
        class331.field4691[1] = this.field5337 * this.field5307;
        class331.field4691[3] = 1.0F;
        OpenGL.glLightModelfv(2899, class331.field4691, 0);
        if (arg0 != -83) {
            this.field5313 = true;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIF)Lkt;", line = 910)
    public final class107 method1084(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field5027;
        return new class456(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(IIIIII)V", line = 921)
    public final void method1113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2146((byte) 123);
        ++field5059;
        this.method2162(arg5, 1);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(IIIIII)Ltl;", line = 939)
    public final class436 method1065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5183;
        return this.field5348 ? new class445(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!od", name = "w", descriptor = "()F", line = 947)
    public final float method1020() {
        ++field5134;
        return this.field5333;
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(II)I", line = 955)
    public final int method2141(int arg0, int arg1) {
        ++field5107;
        if (arg1 != 2) {
            return -127;
        } else if (arg0 != 5121 && ~arg0 != -5121) {
            if (~arg0 != -5124 && arg0 != 5122) {
                if (~arg0 != -5126 && ~arg0 != -5125 && ~arg0 != -5127) {
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

    @OriginalMember(owner = "client!od", name = "h", descriptor = "(I)V", line = 977)
    public final void method2142(int arg0) {
        if (this.field5286 != 8) {
            this.method2190((byte) -24);
            this.method2165(-127, true);
            this.method2168(126, true);
            this.method2177(arg0 ^ -3680, true);
            this.method2162(1, 1);
            this.method2186(0, arg0 ^ 83);
            this.field5286 = 8;
        }
        if (arg0 != -2) {
            this.field5277 = true;
        }
        ++field5212;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BII)V", line = 1000)
    public final synchronized void method2143(byte arg0, int arg1, int arg2) {
        if (arg0 != 127) {
            this.field5301 = -94;
        }
        ++field5162;
        class427 var4 = new class427(arg2);
        var4.field4736 = (long) arg1;
        this.field5248.method809(var4, false);
    }

    @OriginalMember(owner = "client!od", name = "V", descriptor = "(III)V", line = 1014)
    public final void method1052(int arg0, int arg1, int arg2) {
        if (~this.field5350 != ~arg0 || ~this.field5323 != ~arg1 || ~this.field5367 != ~arg2) {
            this.field5367 = arg2;
            this.field5350 = arg0;
            this.field5323 = arg1;
            if (!this.field5289) {
                this.method2167(-105);
                this.method2184(61);
            }
        }
        ++field5127;
    }

    @OriginalMember(owner = "client!od", name = "i", descriptor = "(I)V", line = 1043)
    private final void method2144(int arg0) {
        class331.field4691[0] = this.field5362 * this.field5266;
        class331.field4691[1] = this.field5337 * this.field5266;
        class331.field4691[3] = 1.0F;
        if (arg0 != -2) {
            this.method1030((class408) null, false);
        }
        ++field5144;
        class331.field4691[2] = this.field5294 * this.field5266;
        OpenGL.glLightfv(16384, 4609, class331.field4691, 0);
        class331.field4691[1] = -this.field5276 * this.field5337;
        class331.field4691[0] = -this.field5276 * this.field5362;
        class331.field4691[2] = -this.field5276 * this.field5294;
        class331.field4691[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class331.field4691, 0);
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V", line = 1064)
    public final void method1043(int arg0) {
        ++field5019;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!od", name = "j", descriptor = "(I)V", line = 1077)
    private final void method2145(int arg0) {
        if (arg0 > -8) {
            this.method1094();
        }
        ++field5064;
        OpenGL.glViewport(this.field5334, this.field5352, this.field5057, this.field5175);
    }

    @OriginalMember(owner = "client!od", name = "U", descriptor = "(IIIII)V", line = 1089)
    public final void method1092(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5048;
        this.method2146((byte) 126);
        this.method2162(arg4, 1);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(B)V", line = 1110)
    private final void method2146(byte arg0) {
        if (this.field5286 != 1) {
            this.method2188(14888);
            this.method2165(-105, false);
            this.method2130(87, false);
            this.method2168(72, false);
            this.method2177(3678, false);
            this.method2200((class446) null, (byte) 119);
            this.method2161(87, -2);
            this.method2186(1, 75);
            this.field5286 = 1;
        }
        if (arg0 > 114) {
            ++field5025;
        }
    }

    @OriginalMember(owner = "client!od", name = "h", descriptor = "(B)V", line = 1137)
    private final void method2147(byte arg0) {
        if (this.field5187 == null) {
            this.field5042 = this.field5145 = 0;
        } else {
            Dimension var2 = this.field5187.getSize();
            this.field5145 = var2.height;
            this.field5042 = var2.width;
        }
        ++field5097;
        if (this.field5235 == null) {
            this.field5057 = this.field5042;
            this.field5175 = this.field5145;
            this.method2145(-80);
        }
        this.method2152(115);
        if (arg0 != -100) {
            this.method1032();
        }
        this.method1112();
    }

    @OriginalMember(owner = "client!od", name = "m", descriptor = "()Z", line = 1166)
    public final boolean method1079() {
        ++field5071;
        return false;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ll;)V", line = 1175)
    public final void method1117(class16 arg0) {
        this.field5230 = ((class155) arg0).field2287;
        ++field5022;
        if (this.field5298 == null) {
            class25 var2 = new class25(80);
            if (this.field5313) {
                var2.method157(-1.0F, 71);
                var2.method157(-1.0F, 56);
                var2.method157(0.0F, 127);
                var2.method157(0.0F, -87);
                var2.method157(1.0F, -87);
                var2.method157(1.0F, -95);
                var2.method157(-1.0F, -84);
                var2.method157(0.0F, -102);
                var2.method157(1.0F, 112);
                var2.method157(1.0F, -105);
                var2.method157(1.0F, 109);
                var2.method157(1.0F, -66);
                var2.method157(0.0F, -122);
                var2.method157(1.0F, 122);
                var2.method157(0.0F, -106);
                var2.method157(-1.0F, -83);
                var2.method157(1.0F, -111);
                var2.method157(0.0F, 47);
                var2.method157(0.0F, -72);
                var2.method157(0.0F, 55);
            } else {
                var2.method159(-1.0F, (byte) -37);
                var2.method159(-1.0F, (byte) -37);
                var2.method159(0.0F, (byte) -37);
                var2.method159(0.0F, (byte) -37);
                var2.method159(1.0F, (byte) -37);
                var2.method159(1.0F, (byte) -37);
                var2.method159(-1.0F, (byte) -37);
                var2.method159(0.0F, (byte) -37);
                var2.method159(1.0F, (byte) -37);
                var2.method159(1.0F, (byte) -37);
                var2.method159(1.0F, (byte) -37);
                var2.method159(1.0F, (byte) -37);
                var2.method159(0.0F, (byte) -37);
                var2.method159(1.0F, (byte) -37);
                var2.method159(0.0F, (byte) -37);
                var2.method159(-1.0F, (byte) -37);
                var2.method159(1.0F, (byte) -37);
                var2.method159(0.0F, (byte) -37);
                var2.method159(0.0F, (byte) -37);
                var2.method159(0.0F, (byte) -37);
            }
            this.field5298 = this.method2166((byte) -97, 20, var2.field3037, false, var2.field3036);
            this.field5270 = new class323(this.field5298, 5126, 3, 0);
            this.field5281 = new class323(this.field5298, 5126, 2, 12);
            this.field5218.method1508(this, (byte) 93);
        }
    }

    @OriginalMember(owner = "client!od", name = "ba", descriptor = "(IIII)V", line = 1242)
    public final void method1021(int arg0, int arg1, int arg2, int arg3) {
        ++field5089;
        if (!this.field5289) {
            throw new RuntimeException("");
        } else {
            this.field5309 = arg1;
            this.field5272 = arg0;
            this.field5259 = arg3;
            this.field5336 = arg2;
            this.field5219.field6125.method2488(true);
            this.method2167(-53);
        }
    }

    @OriginalMember(owner = "client!od", name = "n", descriptor = "()Z", line = 1261)
    public final boolean method1088() {
        ++field5193;
        return this.field5325 && (!this.method1025() || this.field5356);
    }

    @OriginalMember(owner = "client!od", name = "i", descriptor = "(B)V", line = 1275)
    public final void method2148(byte arg0) {
        if (arg0 != -33) {
            this.field5217 = 2;
        }
        if (~this.field5286 != -5) {
            this.method2188(14888);
            this.method2165(arg0 ^ 117, false);
            this.method2130(75, false);
            this.method2168(55, false);
            this.method2177(3678, false);
            this.method2161(arg0 ^ -122, -2);
            this.method2162(1, 1);
            this.method2186(0, 101);
            this.field5286 = 4;
        }
        ++field5122;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II[I[I)Lea;", line = 1300)
    public final class381 method1093(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field5066;
        return class81.method482(arg2, arg0, arg3, (byte) 120, this, arg1);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V", line = 1308)
    public final void method1053(boolean arg0) {
        ++field5209;
    }

    @OriginalMember(owner = "client!od", name = "IA", descriptor = "(IIII)[I", line = 1317)
    public final int[] method1063(int arg0, int arg1, int arg2, int arg3) {
        ++field5208;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field5175 + -var6, arg2, 1, 32993, this.field5340, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ldj;I)V", line = 1339)
    public final void method2149(class227 arg0, int arg1) {
        int var3 = 4 % ((arg1 - -30) / 51);
        OpenGL.glPushMatrix();
        ++field5044;
        OpenGL.glMultMatrixf(arg0.method1550((byte) 86), 0);
    }

    @OriginalMember(owner = "client!od", name = "M", descriptor = "(I)V", line = 1351)
    public final void method1044(int arg0) {
        ++field5169;
        this.method2162(0, 1);
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!od", name = "k", descriptor = "(I)V", line = 1363)
    private final void method2150(int arg0) {
        ++field5200;
        if (arg0 != 358) {
            this.method2152(35);
        }
        if (~this.field5310 != -4) {
            this.field5310 = 3;
            this.method2195(false);
            this.method2183((byte) -128);
            this.field5286 &= -8;
        }
    }

    @OriginalMember(owner = "client!od", name = "j", descriptor = "(ILea;II)V", line = 1382)
    public final void method1034(int arg0, class381 arg1, int arg2, int arg3) {
        ++field5100;
        class439 var5 = (class439) arg1;
        class279 var6 = var5.field6565;
        this.method2181((byte) -67);
        this.method2200(var5.field6565, (byte) 112);
        this.method2162(1, 1);
        this.method2131(34162, 8448, 7681);
        this.method2156(34167, 768, 2969, 0);
        float var7 = var6.field4017 / (float) var6.field4021;
        float var8 = var6.field4026 / (float) var6.field4020;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5299) * var7, (float) (-arg3 + this.field5346) * var8);
        OpenGL.glVertex2i(this.field5299, this.field5346);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5299) * var7, (float) (this.field5285 - arg3) * var8);
        OpenGL.glVertex2i(this.field5299, this.field5285);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5355) * var7, (float) (-arg3 + this.field5285) * var8);
        OpenGL.glVertex2i(this.field5355, this.field5285);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5355) * var7, (float) (-arg3 + this.field5346) * var8);
        OpenGL.glVertex2i(this.field5355, this.field5346);
        OpenGL.glEnd();
        this.method2156(5890, 768, 2969, 0);
    }

    @OriginalMember(owner = "client!od", name = "p", descriptor = "()Z", line = 1414)
    public final boolean method1091() {
        ++field5203;
        return true;
    }

    @OriginalMember(owner = "client!od", name = "fa", descriptor = "(IIII)V", line = 1422)
    public final void method1120(int arg0, int arg1, int arg2, int arg3) {
        this.field5259 = arg3;
        this.field5289 = true;
        ++field5171;
        this.field5336 = arg2;
        this.field5272 = arg0;
        this.field5309 = arg1;
        this.field5219.method2440(false, 3, 122, false);
        this.field5219.field6125.method2488(true);
        this.method2167(-46);
        this.method2184(-79);
    }

    @OriginalMember(owner = "client!od", name = "j", descriptor = "(B)Lrc;", line = 1442)
    public final class374 method2151(byte arg0) {
        int var2 = -8 % ((-7 - arg0) / 32);
        ++field5051;
        return this.field5349 != null ? this.field5349.method1489((byte) -44) : null;
    }

    @OriginalMember(owner = "client!od", name = "v", descriptor = "()Z", line = 1452)
    public final boolean method1109() {
        ++field5047;
        if (this.field5223 != null) {
            if (!this.field5223.method2031(-3155)) {
                if (!this.field5221.method800((byte) -73, this.field5223)) {
                    return false;
                }
                this.field5220.method2497(-113);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!od", name = "na", descriptor = "(I)V", line = 1477)
    public final void method1022(int arg0) {
        this.field5231 = 0;
        ++field5065;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field5231;
        }
        this.field5229 = 1 << this.field5231;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lm;ILji;)V", line = 1494)
    public class349(int arg0, Canvas arg1, class126 arg2, int arg3, class432 arg4) {
        super(arg0, arg2);
        new class88();
        new class433(16);
        this.field5242 = new class123();
        this.field5245 = new class123();
        this.field5246 = new class123();
        this.field5247 = new class123();
        this.field5248 = new class123();
        this.field5249 = new class123();
        this.field5250 = new class123();
        this.field5252 = 8448;
        this.field5260 = 512;
        this.field5282 = new float[4];
        this.field5259 = 0;
        this.field5266 = -1.0F;
        this.field5280 = 8448;
        this.field5294 = 1.0F;
        this.field5251 = new float[16];
        this.field5301 = 512;
        this.field5275 = 50;
        this.field5285 = 0;
        this.field5276 = -1.0F;
        this.field5293 = new float[4];
        this.field5277 = true;
        this.field5331 = 0;
        this.field5341 = new float[4];
        this.field5302 = -1;
        this.field5346 = 0;
        this.field5326 = new class107[class463.field6865];
        this.field5267 = 1.0F;
        this.field5336 = -1;
        this.field5323 = -1;
        this.field5352 = 0;
        this.field5338 = 0.0F;
        this.field5261 = new float[4];
        this.field5350 = -1;
        this.field5309 = -1;
        this.field5329 = 3584.0F;
        this.field5334 = 0;
        this.field5368 = 3000.0F;
        this.field5362 = 1.0F;
        this.field5363 = 3584.0F;
        this.field5367 = 0;
        this.field5337 = 1.0F;
        this.field5347 = 0;
        this.field5343 = 3584;
        this.field5364 = 1.0F;
        this.field5355 = 0;
        this.field5299 = 0;
        this.field5222 = arg3;
        this.field5187 = this.field5167 = arg1;
        try {
            if (class248.field3644 == null || !class248.field3644) {
                if (arg4 != null) {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (!var6.startsWith("mac")) {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method2577((byte) 127, "jaggl.dll").toString());
                        } else {
                            System.load(arg4.method2577((byte) 117, "libjaggl.jnilib").toString());
                        }
                    } else {
                        System.load(arg4.method2577((byte) 126, "libjaggl.so").toString());
                    }
                    class248.field3644 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class248.field3644 = Boolean.TRUE;
                }
            }
            if (class248.field3644 != null && class248.field3644) {
                this.field5156 = new OpenGL();
                this.field5152 = this.field5166 = this.field5156.init(arg1, 8, 8, 8, 24, 0, this.field5222);
                if (~this.field5166 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method2122(false);
                    int var7 = this.method2159(67);
                    if (var7 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field5340 = !this.field5313 ? 5121 : 33639;
                        if (~this.field5290.indexOf("radeon") != 0) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class93.method541(this.field5290.replace('/', ' '), ' ', 1);
                            for (int var12 = 0; var12 < var11.length; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (var13.length() > 0) {
                                        if (var13.charAt(0) == 'x' && ~var13.length() <= -4 && class48.method302((byte) -122, var13.substring(1, 3))) {
                                            var13 = var13.substring(1);
                                            var10 = true;
                                        }
                                        if (var13.equals("hd")) {
                                            var9 = true;
                                        } else {
                                            if (var13.startsWith("hd")) {
                                                var13 = var13.substring(2);
                                                var9 = true;
                                            }
                                            if (~var13.length() <= -5 && class48.method302((byte) -17, var13.substring(0, 4))) {
                                                var8 = class92.method532(var13.substring(0, 4), 10);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var9 || var8 < 4000) {
                                this.field5263 = false;
                            }
                            if (!var10 && !var9) {
                                if (var8 >= 7000 && var8 <= 7999) {
                                    this.field5370 = false;
                                }
                                if (~var8 <= -7001 && var8 <= 9250) {
                                    this.field5308 = false;
                                }
                            }
                            this.field5358 &= this.field5156.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field5303 = this.field5370;
                        }
                        if (~this.field5344.indexOf("intel") != 0) {
                            this.field5318 = false;
                        }
                        this.field5354 = !this.field5344.equals("s3 graphics");
                        if (this.field5370) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class493.method2956(127, false, true);
                        this.field5226 = true;
                        this.field5220 = new class415(this, super.field2379);
                        this.method2185(1);
                        this.field5227 = new class530(this);
                        this.field5221 = new class122(this);
                        if (this.field5221.method803(true)) {
                            this.field5223 = new class403(this);
                            if (!this.field5223.method2427(-95)) {
                                this.field5223.method2034(-84);
                                this.field5223 = null;
                            }
                        }
                        this.field5219 = new class406(this);
                        this.method2199(8704);
                        this.method2147((byte) -100);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field5156.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (var15++ > 5) {
                                    throw new RuntimeException("");
                                }
                                class246.method1659((byte) 117, 100L);
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
            this.method1094();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!od", name = "l", descriptor = "(I)V", line = 1695)
    public final void method2152(int arg0) {
        if (arg0 >= 9) {
            ++field5063;
            if (~this.field5310 != -1) {
                this.field5310 = 0;
                this.field5286 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lpo;)V", line = 1713)
    public final void method1095(class389 arg0) {
        ++field5192;
        this.field5218.method1509((byte) -25, arg0, this);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II[[I[[IIII)Lna;", line = 1722)
    public final class35 method1061(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5021;
        return new class220(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "()V", line = 1730)
    public final void method1024() {
        ++field5098;
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "()V", line = 1738)
    public final void method1032() {
        ++field5147;
        this.field5221.method806(1);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V", line = 1749)
    public final synchronized void method1035(int arg0) {
        ++field5140;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field5245.method823((byte) 55)) {
            class427 var12 = (class427) this.field5245.method815(-119);
            class239.field3519[var3++] = (int) var12.field4736;
            this.field5244 -= var12.field6402;
            if (~var3 == -1001) {
                OpenGL.glDeleteBuffersARB(var3, class239.field3519, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class239.field3519, 0);
            var3 = 0;
        }
        while (!this.field5246.method823((byte) 64)) {
            class427 var11 = (class427) this.field5246.method815(-126);
            class239.field3519[var3++] = (int) var11.field4736;
            this.field5241 -= var11.field6402;
            if (~var3 == -1001) {
                OpenGL.glDeleteTextures(var3, class239.field3519, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class239.field3519, 0);
            var3 = 0;
        }
        while (!this.field5247.method823((byte) 52)) {
            class427 var10 = (class427) this.field5247.method815(-126);
            class239.field3519[var3++] = var10.field6402;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class239.field3519, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class239.field3519, 0);
            var3 = 0;
        }
        while (!this.field5248.method823((byte) 87)) {
            class427 var9 = (class427) this.field5248.method815(-128);
            class239.field3519[var3++] = (int) var9.field4736;
            this.field5243 -= var9.field6402;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class239.field3519, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class239.field3519, 0);
            boolean var4 = false;
        }
        while (!this.field5242.method823((byte) 96)) {
            class427 var8 = (class427) this.field5242.method815(-124);
            OpenGL.glDeleteLists((int) var8.field4736, var8.field6402);
        }
        while (!this.field5249.method823((byte) 56)) {
            class337 var7 = this.field5249.method815(-126);
            OpenGL.glDeleteProgramARB((int) var7.field4736);
        }
        while (!this.field5250.method823((byte) 29)) {
            class337 var6 = this.field5250.method815(-128);
            OpenGL.glDeleteObjectARB(var6.field4736);
        }
        while (!this.field5242.method823((byte) 54)) {
            class427 var5 = (class427) this.field5242.method815(-124);
            OpenGL.glDeleteLists((int) var5.field4736, var5.field6402);
        }
        this.field5220.method2492(1);
        if (~this.method1114() < -100663297 && ~class256.method1708((byte) 118) < ~(this.field5269 + 60000L)) {
            System.gc();
            this.field5269 = class256.method1708((byte) 118);
        }
        this.field5228 = var2;
    }

    @OriginalMember(owner = "client!od", name = "m", descriptor = "(I)V", line = 1917)
    private final void method2153(int arg0) {
        ++field5074;
        int var2;
        for (var2 = 0; ~var2 > ~this.field5327; ++var2) {
            class107 var3 = this.field5326[var2];
            int var4 = var2 + 16386;
            class9.field122[0] = (float) var3.method654((byte) 31);
            class9.field122[1] = (float) var3.method663(0);
            class9.field122[2] = (float) var3.method656(128);
            class9.field122[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class9.field122, 0);
            int var5 = var3.method660(28825);
            float var6 = var3.method658(0) / 255.0F;
            class9.field122[1] = (float) class286.method1847(255, var5 >> 8) * var6;
            class9.field122[2] = var6 * (float) class286.method1847(var5, 255);
            class9.field122[0] = var6 * (float) (class286.method1847(var5, 16717245) >> 16);
            OpenGL.glLightfv(var4, 4609, class9.field122, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method661((byte) -125) * var3.method661((byte) -103)));
            OpenGL.glEnable(var4);
        }
        while (var2 < this.field5371) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        if (arg0 != -27858) {
            this.field5303 = false;
        }
        this.field5371 = this.field5327;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(IIII)V", line = 1962)
    public final void method2154(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= -83) {
            this.field5316 = false;
        }
        ++field5091;
        OpenGL.glDrawArrays(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(II)V", line = 1977)
    public final void method2155(int arg0, int arg1) {
        class331.field4691[1] = (float) class286.method1847(65280, arg0) / 65280.0F;
        ++field5142;
        class331.field4691[0] = (float) class286.method1847(16711680, arg0) / 1.671168E7F;
        class331.field4691[2] = (float) class286.method1847(255, arg0) / 255.0F;
        class331.field4691[3] = (float) (arg0 >>> 24) / 255.0F;
        if (arg1 <= 34) {
            this.field5259 = -124;
        }
        OpenGL.glTexEnvfv(8960, 8705, class331.field4691, 0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)Ll;", line = 1992)
    public final class16 method1028(int arg0) {
        ++field5076;
        class155 var2 = new class155(arg0);
        this.field5232.method809(var2, false);
        return var2;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "()I", line = 2003)
    public final int method1076() {
        ++field5124;
        return this.field5275;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(IIII)V", line = 2013)
    public final void method2156(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg3 + 34176, arg0);
        ++field5030;
        OpenGL.glTexEnvi(8960, arg3 + 34192, arg1);
        if (arg2 != 2969) {
            this.field5152 = 1L;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)V", line = 2027)
    public final void method1070(boolean arg0) {
        ++field5201;
    }

    @OriginalMember(owner = "client!od", name = "k", descriptor = "(B)V", line = 2034)
    private final void method2157(byte arg0) {
        int var2 = -63 % ((arg0 - 60) / 59);
        ++field5086;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field5251, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!od", name = "n", descriptor = "(I)V", line = 2046)
    private final void method2158(int arg0) {
        if (arg0 >= -91) {
            this.method2187(25);
        }
        ++field5095;
        this.field5156.detach();
    }

    @OriginalMember(owner = "client!od", name = "o", descriptor = "(I)I", line = 2057)
    private final int method2159(int arg0) {
        ++field5072;
        this.field5344 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field5290 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field5344.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (~this.field5344.indexOf("brian paul") != 0 || ~this.field5344.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class93.method541(var3.replace('.', ' '), ' ', 1);
        if (var4.length >= 2) {
            try {
                int var5 = class92.method532(var4[0], 10);
                int var6 = class92.method532(var4[1], 10);
                this.field5265 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (this.field5265 < 12) {
            var2 |= 2;
        }
        if (!this.field5156.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field5156.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        int var8 = 48 % ((2 - arg0) / 47);
        this.field5292 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field5312 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field5305 = var7[0];
        if (this.field5292 < 2 || this.field5312 < 2 || this.field5305 < 2) {
            var2 |= 16;
        }
        this.field5313 = NativeStream.method2643();
        this.field5156.arePbuffersAvailable();
        this.field5370 = this.field5156.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field5325 = this.field5156.isExtensionAvailable("GL_ARB_multisample");
        this.field5279 = this.field5156.isExtensionAvailable("GL_ARB_vertex_program");
        this.field5156.isExtensionAvailable("GL_ARB_fragment_program");
        this.field5315 = this.field5156.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field5330 = this.field5156.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field5308 = this.field5156.isExtensionAvailable("GL_EXT_texture3D");
        this.field5358 = this.field5156.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field5348 = this.field5156.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field5263 = this.field5156.isExtensionAvailable("GL_ARB_texture_float");
        this.field5316 = false;
        this.field5318 = this.field5156.isExtensionAvailable("GL_EXT_framebuffer_object");
        this.field5283 = this.field5156.isExtensionAvailable("GL_EXT_framebuffer_blit");
        this.field5366 = this.field5156.isExtensionAvailable("GL_EXT_framebuffer_multisample");
        this.field5356 = this.field5366 & this.field5283;
        return ~var2 == -1 ? 0 : var2;
    }

    @OriginalMember(owner = "client!od", name = "xa", descriptor = "()I", line = 2144)
    public final int method1057() {
        ++field5119;
        int var1 = this.field5271;
        this.field5271 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2157)
    public final void method1042(Canvas arg0) {
        ++field5078;
        long var2 = 0L;
        if (arg0 != null && this.field5167 != arg0) {
            if (this.field5216.containsKey(arg0)) {
                Long var4 = (Long) this.field5216.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field5166;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field5156.surfaceResized(var2);
            if (this.field5187 == arg0) {
                this.method2147((byte) -100);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "S", descriptor = "()V", line = 2188)
    public final void method1116() {
        this.field5289 = false;
        ++field5041;
        this.field5219.method2440(false, 0, 120, false);
        this.method2167(-82);
        this.method2184(-89);
    }

    @OriginalMember(owner = "client!od", name = "B", descriptor = "()Z", line = 2203)
    public final boolean method1125() {
        ++field5215;
        return this.field5223 != null && (~this.field5222 >= -2 || this.field5356);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZZ)V", line = 2212)
    public final void method2160(int arg0, int arg1, boolean arg2, boolean arg3) {
        ++field5085;
        if (this.field5284 != arg1) {
            if (~arg1 > -1) {
                this.method2174(true);
                this.method2200((class446) null, (byte) 120);
                this.method2186(0, 36);
                if (!this.field5289) {
                    this.field5219.method2440(arg3, 0, 117, arg2);
                }
            } else {
                class260 var5 = this.field5220.method2494(-1, arg1);
                class321 var6 = super.field2379.method838(true, arg1);
                if (~var6.field4583 == -1 && ~var6.field4581 == -1) {
                    this.method2174(true);
                } else {
                    int var7 = var6.field4590 ? 64 : 128;
                    int var8 = var7 * 50;
                    this.method2121(0.0F, 116, (float) (this.field5228 % var8 * var6.field4583) / (float) var8, (float) (this.field5228 % var8 * var6.field4581) / (float) var8);
                }
                if (this.field5289) {
                    this.field5219.method2440(arg3, 3, 108, arg2);
                    this.method2200(var5, (byte) 127);
                    this.method2186(var6.field4592, arg0 ^ 1127);
                } else {
                    this.field5219.method2440(arg3, var6.field4585, 111, arg2);
                    this.field5219.method2439(var6.field4587, var6.field4601, 127);
                    if (!this.field5219.method2443(var6.field4592, var5, (byte) -90)) {
                        this.method2200(var5, (byte) 115);
                        this.method2186(var6.field4592, arg0 ^ -1124);
                    }
                }
            }
            this.field5284 = arg1;
        }
        this.field5286 &= -8;
        if (arg0 != 1029) {
            this.field5351 = -0.68771267F;
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 2276)
    public final void method1085(Canvas arg0) {
        ++field5035;
        if (this.field5167 == arg0) {
            throw new RuntimeException();
        } else if (this.field5216.containsKey(arg0)) {
            Long var2 = (Long) this.field5216.get(arg0);
            this.field5156.releaseSurface(arg0, var2);
            this.field5216.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!od", name = "NA", descriptor = "(IIIIII)V", line = 2297)
    public final void method1036(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5094;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method2146((byte) 122);
        float var10 = (float) arg3 + var8;
        this.method2162(arg5, 1);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5325) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5325) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!od", name = "h", descriptor = "(II)V", line = 2330)
    public final void method2161(int arg0, int arg1) {
        ++field5029;
        this.method2172(arg1, 99, true);
        if (arg0 <= 80) {
            this.method2189(80);
        }
    }

    @OriginalMember(owner = "client!od", name = "i", descriptor = "(II)V", line = 2341)
    public final void method2162(int arg0, int arg1) {
        ++field5045;
        if (~this.field5295 != ~arg0) {
            boolean var3;
            byte var4;
            boolean var5;
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -129) {
                        var3 = false;
                        var4 = 0;
                        var5 = true;
                    } else {
                        var5 = true;
                        var4 = 3;
                        var3 = true;
                    }
                } else {
                    var4 = 2;
                    var5 = true;
                    var3 = false;
                }
            } else {
                var5 = true;
                var4 = 1;
                var3 = true;
            }
            if (this.field5287 == !var5) {
                OpenGL.glColorMask(var5, var5, var5, true);
                this.field5287 = var5;
            }
            if (!this.field5304 == var3) {
                if (var3) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field5304 = var3;
            }
            if (~this.field5257 != ~var4) {
                if (~var4 != -2) {
                    if (~var4 == -3) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    } else if (var4 == 3) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    } else {
                        OpenGL.glDisable(3042);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field5257 = var4;
            }
            this.field5295 = arg0;
            this.field5286 &= -29;
        }
        if (arg1 != 1) {
            this.method1118((class521) null, 50, 18, 106, -122);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(FBF)V", line = 2434)
    public final void method2163(float arg0, byte arg1, float arg2) {
        this.field5267 = arg0;
        this.field5338 = arg2;
        if (arg1 != -101) {
            this.field5288 = true;
        }
        ++field5111;
        if (!this.field5289) {
            this.method2167(-116);
        }
    }

    @OriginalMember(owner = "client!od", name = "l", descriptor = "(B)V", line = 2449)
    private final void method2164(byte arg0) {
        int var2 = 91 % ((arg0 - 50) / 52);
        OpenGL.glDepthMask(this.field5258 && this.field5277);
        ++field5039;
    }

    @OriginalMember(owner = "client!od", name = "j", descriptor = "()I", line = 2463)
    public final int method1056() {
        ++field5115;
        return 4;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V", line = 2471)
    public final void method1100(int arg0) {
        this.method2158(-120);
        ++field5184;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(IZ)V", line = 2482)
    public final void method2165(int arg0, boolean arg1) {
        ++field5088;
        if (!this.field5273 != !arg1) {
            this.field5273 = arg1;
            this.method2184(74);
            this.field5286 &= -32;
        }
        if (arg0 >= -43) {
            this.method1074(-17, -83, 115, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!od", name = "y", descriptor = "()Z", line = 2502)
    public final boolean method1119() {
        ++field5023;
        return true;
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "()Z", line = 2510)
    public final boolean method1037() {
        ++field5133;
        return true;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIZ)Lf;", line = 2519)
    public final class529 method1067(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5038;
        return new class375(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V", line = 2527)
    public final void method1103(int arg0) {
        this.method2122(false);
        ++field5190;
    }

    @OriginalMember(owner = "client!od", name = "aa", descriptor = "(IIIIII[BII)V", line = 2535)
    public final void method1059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field5026;
        float var10;
        float var11;
        if (this.field5359 != null && this.field5359.field3828 >= arg2 && ~this.field5359.field3831 <= ~arg3) {
            this.field5359.method1723(0, arg6, arg3, arg2, 6406, (byte) -99, 0, 0, 0, false);
            var10 = (float) arg3 * this.field5359.field4026 / (float) this.field5359.field3831;
            var11 = (float) arg2 * this.field5359.field4017 / (float) this.field5359.field3828;
        } else {
            this.field5359 = class479.method2853(false, this, arg3, (byte) 40, arg2, 6406, 6406, arg6);
            this.field5359.method1730(false, 10497, false);
            var10 = this.field5359.field4026;
            var11 = this.field5359.field4017;
        }
        this.method2181((byte) -110);
        this.method2200(this.field5359, (byte) 121);
        this.method2162(arg8, 1);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2155(arg5, 81);
        this.method2131(34162, 34165, 34165);
        this.method2156(34166, 768, 2969, 0);
        this.method2156(5890, 770, 2969, 2);
        this.method2135(0, 34166, -73, 770);
        this.method2135(2, 5890, -95, 770);
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
        this.method2156(5890, 768, 2969, 0);
        this.method2156(34166, 770, 2969, 2);
        this.method2135(0, 5890, -80, 770);
        this.method2135(2, 34166, -124, 770);
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(I)V", line = 2592)
    public final void method1123(int arg0) {
        ++field5186;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field5217 = arg0;
            this.field5220.method2497(-112);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!od", name = "u", descriptor = "([I)V", line = 2605)
    public final void method1062(int[] arg0) {
        arg0[1] = this.field5346;
        arg0[2] = this.field5355;
        ++field5114;
        arg0[0] = this.field5299;
        arg0[3] = this.field5285;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BIIZ[B)Lnc;", line = 2618)
    public final class21 method2166(byte arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        ++field5116;
        if (arg0 >= -13) {
            return null;
        } else {
            return (class21) (!this.field5370 || arg3 && !this.field5303 ? new class46(this, arg1, arg4, arg2) : new class523(this, arg1, arg4, arg2, arg3));
        }
    }

    @OriginalMember(owner = "client!od", name = "p", descriptor = "(I)V", line = 2634)
    private final void method2167(int arg0) {
        if (arg0 >= -22) {
            this.method1121();
        }
        ++field5157;
        int var2;
        if (!this.field5289) {
            this.field5253 = (float) (-this.field5367 + this.field5343) - this.field5338;
            this.field5274 = this.field5253 - (float) this.field5323 * this.field5267;
            if (this.field5274 < (float) this.field5275) {
                this.field5274 = (float) this.field5275;
            }
            OpenGL.glFogf(2915, this.field5274);
            OpenGL.glFogf(2916, this.field5253);
            var2 = this.field5350;
        } else {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field5309;
        }
        class331.field4691[2] = (float) class286.method1847(255, var2) / 255.0F;
        class331.field4691[1] = (float) class286.method1847(var2, 65280) / 65280.0F;
        class331.field4691[0] = (float) class286.method1847(var2, 16711680) / 1.671168E7F;
        OpenGL.glFogfv(2918, class331.field4691, 0);
        if (this.field5289) {
            this.field5219.field6125.method2483((byte) 112);
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(IZ)V", line = 2670)
    public final void method2168(int arg0, boolean arg1) {
        if (arg0 > 51) {
            if (!arg1 == this.field5288) {
                if (arg1) {
                    OpenGL.glEnable(2929);
                } else {
                    OpenGL.glDisable(2929);
                }
                this.field5286 &= -32;
                this.field5288 = arg1;
            }
            ++field5081;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lig;B)V", line = 2694)
    public final void method2169(class160 arg0, byte arg1) {
        ++field5191;
        if (this.field5237 >= 3) {
            throw new RuntimeException();
        } else {
            if (this.field5237 >= 0) {
                this.field5234[this.field5237].method452(-15001);
            }
            this.field5235 = this.field5234[++this.field5237] = arg0;
            if (arg1 >= -17) {
                this.method1099();
            }
            this.field5235.method450((byte) -83);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(FIFFF)V", line = 2714)
    public final void method2170(float arg0, int arg1, float arg2, float arg3, float arg4) {
        ++field5177;
        class331.field4691[3] = arg4;
        class331.field4691[arg1] = arg2;
        class331.field4691[2] = arg0;
        class331.field4691[1] = arg3;
        OpenGL.glTexEnvfv(8960, 8705, class331.field4691, 0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BJ)V", line = 2729)
    public final synchronized void method2171(byte arg0, long arg1) {
        ++field5179;
        class337 var4 = new class337();
        if (arg0 == 57) {
            var4.field4736 = arg1;
            this.field5250.method809(var4, false);
        }
    }

    @OriginalMember(owner = "client!od", name = "x", descriptor = "()Lia;", line = 2750)
    public final class414 method1115() {
        ++field5149;
        return this.field5224;
    }

    @OriginalMember(owner = "client!od", name = "O", descriptor = "(IIIII)V", line = 2758)
    public final void method1048(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5148;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZ)V", line = 2769)
    public final void method2172(int arg0, int arg1, boolean arg2) {
        if (arg1 < 52) {
            this.field5167 = null;
        }
        this.method2160(1029, arg0, true, arg2);
        ++field5053;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLbg;Lbg;Lbg;Lbg;)V", line = 2781)
    public final void method2173(byte arg0, class323 arg1, class323 arg2, class323 arg3, class323 arg4) {
        ++field5189;
        if (arg4 != null) {
            this.method2197(11861, arg4.field4626);
            OpenGL.glVertexPointer(arg4.field4621, arg4.field4624, this.field5264.method140(-128), this.field5264.method138(true) - -((long) arg4.field4620));
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        if (arg3 != null) {
            this.method2197(11861, arg3.field4626);
            OpenGL.glNormalPointer(arg3.field4624, this.field5264.method140(-67), this.field5264.method138(true) - -((long) arg3.field4620));
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg0 > 89) {
            if (arg2 == null) {
                OpenGL.glDisableClientState(32886);
            } else {
                this.method2197(11861, arg2.field4626);
                OpenGL.glColorPointer(arg2.field4621, arg2.field4624, this.field5264.method140(-127), this.field5264.method138(true) + (long) arg2.field4620);
                OpenGL.glEnableClientState(32886);
            }
            if (arg1 == null) {
                OpenGL.glDisableClientState(32888);
            } else {
                this.method2197(11861, arg1.field4626);
                OpenGL.glTexCoordPointer(arg1.field4621, arg1.field4624, this.field5264.method140(-52), this.field5264.method138(true) - -((long) arg1.field4620));
                OpenGL.glEnableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "JA", descriptor = "(II)V", line = 2827)
    public final void method1102(int arg0, int arg1) {
        ++field5213;
        if (this.field5275 != arg0 || this.field5343 != arg1) {
            this.field5343 = arg1;
            this.field5275 = arg0;
            this.method2126((byte) 74);
            this.method2167(-84);
            if (this.field5310 == 3) {
                this.method2195(false);
                return;
            }
            if (this.field5310 != 2) {
                return;
            }
            this.method2157((byte) 122);
        }
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(Z)V", line = 2854)
    private final void method2174(boolean arg0) {
        ++field5117;
        if (this.field5357) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field5357 = false;
        }
        if (!arg0) {
            this.field5290 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIIIII)V", line = 2872)
    public final void method1101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5204;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(FB)V", line = 2880)
    public final void method2175(float arg0, byte arg1) {
        if (arg1 <= -55) {
            if (this.field5364 != arg0) {
                this.field5364 = arg0;
                if (~this.field5310 == -4) {
                    this.method2195(false);
                }
            }
            ++field5028;
        }
    }

    @OriginalMember(owner = "client!od", name = "j", descriptor = "(II)V", line = 2900)
    public final void method2176(int arg0, int arg1) {
        if (this.field5361 != arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field5361 = arg0;
        }
        ++field5198;
        if (arg1 < 28) {
            this.method2195(false);
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(IZ)V", line = 2918)
    public final void method2177(int arg0, boolean arg1) {
        ++field5106;
        if (!this.field5258 == arg1) {
            this.field5258 = arg1;
            this.method2164((byte) 115);
            this.field5286 &= -32;
        }
        if (arg0 != 3678) {
            this.method2144(80);
        }
    }

    @OriginalMember(owner = "client!od", name = "q", descriptor = "(I)V", line = 2936)
    public final void method2178(int arg0) {
        if (arg0 != 1765) {
            this.field5352 = -4;
        }
        ++field5195;
        if (this.field5286 != 16) {
            this.method2150(358);
            this.method2165(-53, true);
            this.method2168(52, true);
            this.method2177(3678, true);
            this.method2162(1, 1);
            this.method2186(0, -73);
            this.field5286 = 16;
        }
    }

    @OriginalMember(owner = "client!od", name = "r", descriptor = "(I)V", line = 2960)
    private final void method2179(int arg0) {
        if (this.field5333 == 0.0F) {
            this.field5251[10] = this.field5339;
            this.field5251[14] = this.field5365;
        } else {
            float var2 = this.field5368 / (this.field5368 + this.field5333);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field5365 * (-var2 + 1.0F) / this.field5333;
            this.field5251[14] = this.field5365 * var3;
            this.field5251[10] = this.field5339 + var4;
        }
        ++field5136;
        this.field5363 = (float) this.field5343 - this.field5333;
        int var5 = 95 % ((arg0 - 66) / 54);
        this.field5329 = (this.field5251[14] + (float) (-this.field5343)) / this.field5251[10];
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Lig;B)V", line = 2992)
    public final void method2180(class160 arg0, byte arg1) {
        ++field5206;
        if (~this.field5239 <= -4) {
            throw new RuntimeException();
        } else {
            int var3 = -51 / ((arg1 - -62) / 40);
            if (~this.field5239 <= -1) {
                this.field5238[this.field5239].method441(9921);
            }
            this.field5240 = this.field5238[++this.field5239] = arg0;
            this.field5240.method447(-4087);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ltl;)V", line = 3012)
    public final void method1083(class436 arg0) {
        this.field5349 = (class213) arg0;
        ++field5050;
    }

    @OriginalMember(owner = "client!od", name = "m", descriptor = "(B)V", line = 3021)
    public final void method2181(byte arg0) {
        ++field5172;
        if (this.field5286 != 2) {
            this.method2188(14888);
            this.method2165(-111, false);
            this.method2130(82, false);
            this.method2168(114, false);
            this.method2177(3678, false);
            this.method2161(98, -2);
            this.field5286 = 2;
        }
        if (arg0 >= -62) {
            this.method1031((class121[]) null, (class414) null, (class247[]) null, 60);
        }
    }

    @OriginalMember(owner = "client!od", name = "q", descriptor = "()V", line = 3042)
    public final void method1094() {
        for (class337 var1 = this.field5232.method816(106); var1 != null; var1 = this.field5232.method812(96)) {
            ((class155) var1).method999(-9034);
        }
        ++field5194;
        if (this.field5221 != null) {
            this.field5221.method802((byte) -118);
        }
        if (this.field5156 != null) {
            this.method2158(-104);
            Enumeration var2 = this.field5216.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field5216.get(var3);
                this.field5156.releaseSurface(var3, var4);
            }
            this.field5156.release();
            this.field5156 = null;
        }
        if (this.field5226) {
            class318.method1985((byte) 120, false, true);
            this.field5226 = false;
        }
    }

    @OriginalMember(owner = "client!od", name = "W", descriptor = "()I", line = 3087)
    public final int method1060() {
        ++field5113;
        return this.field5343;
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(Z)V", line = 3096)
    private final void method2182(boolean arg0) {
        ++field5040;
        if (this.field5324 && !this.field5342) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0) {
            this.field5239 = -109;
        }
    }

    @OriginalMember(owner = "client!od", name = "n", descriptor = "(B)V", line = 3117)
    private final void method2183(byte arg0) {
        ++field5079;
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg0 > -125) {
            this.field5282 = null;
        }
        OpenGL.glMultMatrixf(this.field5320.method1550((byte) 119), 0);
        if (this.field5289) {
            this.field5219.field6125.method2488(true);
        }
        this.method2187(-9463);
        this.method2153(-27858);
    }

    @OriginalMember(owner = "client!od", name = "s", descriptor = "(I)V", line = 3142)
    private final void method2184(int arg0) {
        ++field5036;
        if (this.field5273 && this.field5323 >= 0 | this.field5289) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        int var2 = 60 / ((-2 - arg0) / 63);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ltl;Ltl;FLtl;)Ltl;", line = 3161)
    public final class436 method1086(class436 arg0, class436 arg1, float arg2, class436 arg3) {
        ++field5164;
        if (arg0 != null && arg1 != null && this.field5348 && this.field5318 && this.field5283) {
            class365 var5 = null;
            class213 var6 = (class213) arg0;
            class213 var7 = (class213) arg1;
            class374 var8 = var6.method1489((byte) 127);
            class374 var9 = var7.method1489((byte) 125);
            if (var8 != null && var9 != null) {
                int var10 = var9.field5694 >= var8.field5694 ? var9.field5694 : var8.field5694;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class365) {
                    class365 var11 = (class365) arg3;
                    if (~var11.method2270(-110) == ~var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class365(this, var10);
                }
                if (var5.method2268(arg2, -21875, var8, var9)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIILea;II)V", line = 3208)
    public final void method1058(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8) {
        ++field5159;
        class439 var10 = (class439) arg6;
        class279 var11 = var10.field6565;
        this.method2181((byte) -80);
        this.method2200(var10.field6565, (byte) 117);
        this.method2162(arg5, 1);
        this.method2131(34162, 8448, 7681);
        this.method2156(34167, 768, 2969, 0);
        float var12 = var11.field4017 / (float) var11.field4021;
        float var13 = var11.field4026 / (float) var11.field4020;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method2156(5890, 768, 2969, 0);
    }

    @OriginalMember(owner = "client!od", name = "t", descriptor = "(I)V", line = 3238)
    private final void method2185(int arg0) {
        ++field5155;
        this.field5320 = new class227();
        this.field5335 = new class227();
        this.field5254 = new class446[this.field5292];
        this.field5296 = new class260(this, 3553, 6408, 1, arg0);
        this.field5297 = new class260(this, 3553, 6408, 1, 1);
        this.field5319 = new class260(this, 3553, 6408, 1, 1);
        this.field5317 = new class304(this);
        this.field5314 = new class304(this);
        this.field5328 = new class304(this);
        this.field5255 = new class304(this);
        this.field5268 = new class304(this);
        this.field5278 = new class304(this);
        this.field5291 = new class304(this);
        this.field5306 = new class304(this);
        this.field5262 = new class304(this);
        this.field5311 = new class304(this);
        if (this.field5318) {
            this.field5369 = new class77(this);
            this.field5332 = new class77(this);
        }
    }

    @OriginalMember(owner = "client!od", name = "k", descriptor = "(II)V", line = 3275)
    public final void method2186(int arg0, int arg1) {
        int var3 = -9 % ((arg1 - -12) / 33);
        ++field5033;
        if (~arg0 == -2) {
            this.method2131(34162, 7681, 7681);
        } else if (arg0 == 0) {
            this.method2131(34162, 8448, 8448);
        } else if (arg0 == 2) {
            this.method2131(34162, 7681, 34165);
        } else {
            if (~arg0 != -4) {
                if (~arg0 == -5) {
                    this.method2131(34162, 34023, 34023);
                    return;
                }
            } else {
                this.method2131(34162, 8448, 260);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "u", descriptor = "(I)V", line = 3307)
    public final void method2187(int arg0) {
        if (arg0 != -9463) {
            this.method1040(0.33510655F, -0.51391006F, 1.1176294F);
        }
        OpenGL.glLightfv(16384, 4611, this.field5341, 0);
        ++field5185;
        OpenGL.glLightfv(16385, 4611, this.field5261, 0);
    }

    @OriginalMember(owner = "client!od", name = "v", descriptor = "(I)V", line = 3320)
    private final void method2188(int arg0) {
        if (arg0 == 14888) {
            if (~this.field5310 != -2) {
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadIdentity();
                if (this.field5057 > 0 && ~this.field5175 < -1) {
                    OpenGL.glOrtho(0.0D, (double) this.field5057, (double) this.field5175, 0.0D, -1.0D, 1.0D);
                }
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadIdentity();
                this.field5310 = 1;
                this.field5286 &= -25;
            }
            ++field5176;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lgu;Z)Lf;", line = 3345)
    public final class529 method1030(class408 arg0, boolean arg1) {
        ++field5199;
        int[] var3 = new int[arg0.field6151 * arg0.field6147];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field6149 != null) {
            for (int var6 = 0; ~arg0.field6151 < ~var6; ++var6) {
                for (int var7 = 0; ~arg0.field6147 < ~var7; ++var7) {
                    var3[var5++] = class18.method119(arg0.field6152[class286.method1847(255, arg0.field6146[var4])], arg0.field6149[var4] << 24);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; var8 < arg0.field6151; ++var8) {
                for (int var10 = 0; ~arg0.field6147 < ~var10; ++var10) {
                    int var11 = arg0.field6152[255 & arg0.field6146[var4++]];
                    var3[var5++] = var11 == 0 ? 0 : class18.method119(var11, -16777216);
                }
            }
        }
        class529 var9 = this.method1078(var3, 0, arg0.field6147, arg0.field6147, arg0.field6151);
        var9.method96(arg0.field6148, arg0.field6144, arg0.field6150, arg0.field6145);
        return var9;
    }

    @OriginalMember(owner = "client!od", name = "w", descriptor = "(I)V", line = 3409)
    public final void method2189(int arg0) {
        ++field5170;
        OpenGL.glPopMatrix();
        if (arg0 != 1) {
            this.field5356 = false;
        }
    }

    @OriginalMember(owner = "client!od", name = "o", descriptor = "(B)V", line = 3422)
    private final void method2190(byte arg0) {
        if (arg0 >= -9) {
            this.method1043(27);
        }
        if (~this.field5310 != -3) {
            this.field5310 = 2;
            this.method2157((byte) 121);
            this.method2183((byte) -127);
            this.field5286 &= -8;
        }
        ++field5141;
    }

    @OriginalMember(owner = "client!od", name = "h", descriptor = "()V", line = 3442)
    public final void method1041() {
        if (this.field5223 != null && this.field5223.method2031(-3155)) {
            this.field5221.method807((byte) -57, this.field5223);
            this.field5220.method2497(-118);
        }
        ++field5188;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()V", line = 3460)
    public final void method1019() {
        ++field5067;
        try {
            this.field5156.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 3481)
    public final void method1080(Rectangle[] arg0, int arg1) {
        this.method1019();
        ++field5118;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I", line = 3492)
    public final int method1051(int arg0, int arg1) {
        ++field5130;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(IIZ)V", line = 3503)
    public final synchronized void method2191(int arg0, int arg1, boolean arg2) {
        ++field5073;
        class427 var4 = new class427(arg0);
        var4.field4736 = (long) arg1;
        this.field5246.method809(var4, arg2);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)V", line = 3515)
    public final synchronized void method2192(byte arg0, int arg1) {
        if (arg0 > -103) {
            this.method1030((class408) null, false);
        }
        ++field5205;
        class427 var3 = new class427(arg1);
        this.field5247.method809(var3, false);
    }

    @OriginalMember(owner = "client!od", name = "o", descriptor = "()V", line = 3534)
    public final void method1089() {
        ++field5092;
        this.method2177(3678, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!od", name = "l", descriptor = "(II)I", line = 3546)
    public final int method2193(int arg0, int arg1) {
        ++field5129;
        if (arg1 != 260) {
            this.method2132(0, true, (NativeBuffer) null, 38, -62);
        }
        if (~arg0 == -2) {
            return 7681;
        } else if (arg0 == 0) {
            return 8448;
        } else if (arg0 != 2) {
            if (arg0 == 3) {
                return 260;
            } else if (~arg0 == -5) {
                return 34023;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            return 34165;
        }
    }

    @OriginalMember(owner = "client!od", name = "t", descriptor = "()Z", line = 3577)
    public final boolean method1106() {
        ++field5034;
        return false;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Ldj;I)V", line = 3589)
    public final void method2194(class227 arg0, int arg1) {
        ++field5080;
        OpenGL.glLoadMatrixf(arg0.method1550((byte) 108), 0);
        if (arg1 != -21066) {
            this.method1022(-86);
        }
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(Z)V", line = 3601)
    private final void method2195(boolean arg0) {
        ++field5132;
        float var2 = (float) (-this.field5347) * this.field5364 / (float) this.field5260;
        float var3 = (float) (-this.field5331) * this.field5364 / (float) this.field5301;
        float var4 = (float) (-this.field5347 + this.field5057) * this.field5364 / (float) this.field5260;
        if (arg0) {
            this.method2153(124);
        }
        float var5 = (float) (-this.field5331 + this.field5175) * this.field5364 / (float) this.field5301;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field5275 - this.field5333), (double) ((float) this.field5343 - this.field5333));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!od", name = "x", descriptor = "(I)V", line = 3627)
    public final void method2196(int arg0) {
        ++field5105;
        OpenGL.glPushMatrix();
        if (arg0 != 15) {
            this.field5240 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lje;[Lgu;Z)Loa;", line = 3639)
    public final class489 method1081(class275 arg0, class408[] arg1, boolean arg2) {
        ++field5207;
        return new class309(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!od", name = "z", descriptor = "()Z", line = 3647)
    public final boolean method1121() {
        ++field5046;
        return true;
    }

    @OriginalMember(owner = "client!od", name = "k", descriptor = "()Z", line = 3655)
    public final boolean method1073() {
        ++field5178;
        return true;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(II)I", line = 3669)
    public final int method1122(int arg0, int arg1) {
        ++field5138;
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!od", name = "i", descriptor = "()V", line = 3680)
    public final void method1054() {
        ++field5077;
        if (this.field5354 && ~this.field5057 < -1 && ~this.field5175 < -1) {
            int var1 = this.field5299;
            int var2 = this.field5355;
            int var3 = this.field5346;
            int var4 = this.field5285;
            this.method1112();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2152(95);
            this.method2165(-66, false);
            this.method2130(45, false);
            this.method2168(103, false);
            this.method2177(3678, false);
            this.method2200((class446) null, (byte) 122);
            this.method2161(102, -2);
            this.method2186(1, -81);
            this.method2162(0, 1);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field5057, this.field5175, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method1098(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!od", name = "o", descriptor = "(FF)V", line = 3728)
    public final void method1039(float arg0, float arg1) {
        ++field5037;
        if (this.field5368 != arg0 || this.field5333 != arg1) {
            this.field5333 = arg1;
            this.field5368 = arg0;
            this.method2179(125);
            if (~this.field5310 == -4) {
                this.method2195(false);
                return;
            }
            if (this.field5310 != 2) {
                return;
            }
            this.method2157((byte) -48);
        }
    }

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "(IIII)V", line = 3753)
    public final void method1069(int arg0, int arg1, int arg2, int arg3) {
        if (~arg0 < ~this.field5299) {
            this.field5299 = arg0;
        }
        if (arg2 < this.field5355) {
            this.field5355 = arg2;
        }
        if (arg3 < this.field5285) {
            this.field5285 = arg3;
        }
        if (arg1 > this.field5346) {
            this.field5346 = arg1;
        }
        ++field5180;
        OpenGL.glEnable(3089);
        this.method2139((byte) 123);
        this.method2123((byte) -86);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(FFF)V", line = 3780)
    public final void method1040(float arg0, float arg1, float arg2) {
        class121.field1827 = arg1;
        class137.field2072 = arg0;
        ++field5052;
        class504.field7389 = arg2;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lqc;IIII)Lc;", line = 3793)
    public final class121 method1118(class521 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5125;
        return new class304(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "()Z", line = 3803)
    public final boolean method1025() {
        ++field5165;
        return this.field5223 != null && this.field5223.method2031(-3155);
    }

    @OriginalMember(owner = "client!od", name = "ia", descriptor = "(III[I)V", line = 3812)
    public final void method1074(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5104;
        float var5 = (float) arg2 * this.field5320.field3338 + (float) arg0 * this.field5320.field3329 + (float) arg1 * this.field5320.field3352 + this.field5320.field3344;
        if (!(var5 < (float) this.field5275) && !(var5 > (float) this.field5343)) {
            int var6 = (int) (((float) arg2 * this.field5320.field3349 + (float) arg0 * this.field5320.field3347 + (float) arg1 * this.field5320.field3334 + this.field5320.field3341) * (float) this.field5260 / var5);
            int var7 = (int) (((float) arg2 * this.field5320.field3335 + (float) arg0 * this.field5320.field3346 + (float) arg1 * this.field5320.field3355 + this.field5320.field3348) * (float) this.field5301 / var5);
            if ((float) var6 >= this.field5360 && (float) var6 <= this.field5351 && (float) var7 >= this.field5321 && this.field5345 >= (float) var7) {
                arg3[1] = (int) ((float) var7 - this.field5321);
                arg3[0] = (int) ((float) var6 - this.field5360);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!od", name = "ua", descriptor = "(F)V", line = 3846)
    public final void method1111(float arg0) {
        ++field5101;
        if (this.field5307 != arg0) {
            this.field5307 = arg0;
            this.method2140((byte) -83);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILnc;)V", line = 3864)
    public final void method2197(int arg0, class21 arg1) {
        ++field5061;
        if (arg0 == 11861) {
            if (this.field5264 != arg1) {
                if (this.field5370) {
                    OpenGL.glBindBufferARB(34962, arg1.method137((byte) 52));
                }
                this.field5264 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "pa", descriptor = "(IIII)V", line = 3883)
    public final void method1098(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5175 < arg3) {
            arg3 = this.field5175;
        }
        if (this.field5057 < arg2) {
            arg2 = this.field5057;
        }
        ++field5163;
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (~arg1 > -1) {
            arg1 = 0;
        }
        this.field5355 = arg2;
        this.field5346 = arg1;
        this.field5285 = arg3;
        this.field5299 = arg0;
        OpenGL.glEnable(3089);
        this.method2139((byte) 44);
        this.method2123((byte) -86);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(BII)V", line = 3913)
    public final void method2198(byte arg0, int arg1, int arg2) {
        this.field5334 = arg1;
        ++field5087;
        this.field5352 = arg2;
        this.method2145(-91);
        if (arg0 <= 32) {
            this.method2150(0);
        }
        this.method2123((byte) -86);
    }

    @OriginalMember(owner = "client!od", name = "u", descriptor = "()Z", line = 3927)
    public final boolean method1107() {
        ++field5043;
        return this.field5219.method2441((byte) -54, 3);
    }

    @OriginalMember(owner = "client!od", name = "GA", descriptor = "(IIII)V", line = 3937)
    public final void method1050(int arg0, int arg1, int arg2, int arg3) {
        this.field5331 = arg1;
        ++field5103;
        this.field5260 = arg2;
        this.field5301 = arg3;
        this.field5347 = arg0;
        this.method2126((byte) 74);
        this.method2139((byte) 70);
        if (~this.field5310 != -4) {
            if (~this.field5310 == -3) {
                this.method2157((byte) 119);
                return;
            }
        } else {
            this.method2195(false);
        }
    }

    @OriginalMember(owner = "client!od", name = "y", descriptor = "(I)V", line = 3971)
    private final void method2199(int arg0) {
        ++field5197;
        this.method2161(88, -2);
        for (int var2 = this.field5292 + -1; var2 >= 0; --var2) {
            this.method2176(var2, arg0 ^ 8786);
            this.method2200((class446) null, (byte) 125);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2131(arg0 + 25458, 8448, 8448);
        this.method2156(34168, 770, 2969, 2);
        this.method2174(true);
        if (arg0 == 8704) {
            this.field5295 = 1;
            OpenGL.glEnable(3042);
            OpenGL.glBlendFunc(770, 771);
            this.field5257 = 1;
            OpenGL.glEnable(3008);
            OpenGL.glAlphaFunc(516, 0.0F);
            this.field5304 = true;
            OpenGL.glColorMask(true, true, true, true);
            this.field5287 = true;
            this.method2165(-108, true);
            this.method2130(82, true);
            this.method2168(81, true);
            this.method2177(arg0 ^ 11358, true);
            this.method2152(arg0 ^ 8814);
            this.field5156.setSwapInterval(0);
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
            this.field5302 = this.field5350 = -1;
            this.method1112();
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljk;B)V", line = 4044)
    public final void method2200(class446 arg0, byte arg1) {
        ++field5214;
        if (arg1 >= 111) {
            class446 var3 = this.field5254[this.field5361];
            if (arg0 != var3) {
                if (arg0 != null) {
                    if (var3 != null) {
                        if (arg0.field6633 != var3.field6633) {
                            OpenGL.glDisable(var3.field6633);
                            OpenGL.glEnable(arg0.field6633);
                        }
                    } else {
                        OpenGL.glEnable(arg0.field6633);
                    }
                    OpenGL.glBindTexture(arg0.field6633, arg0.method2677(-17229));
                } else {
                    OpenGL.glDisable(var3.field6633);
                }
                this.field5254[this.field5361] = arg0;
            }
            this.field5286 &= -2;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 4086)
    public final void method1066(Canvas arg0) {
        this.field5187 = null;
        ++field5112;
        this.field5152 = 0L;
        if (arg0 != null && this.field5167 != arg0) {
            if (this.field5216.containsKey(arg0)) {
                Long var2 = (Long) this.field5216.get(arg0);
                this.field5152 = var2;
                this.field5187 = arg0;
            }
        } else {
            this.field5152 = this.field5166;
            this.field5187 = this.field5167;
        }
        if (this.field5187 != null && this.field5152 != 0L) {
            this.field5156.setSurface(this.field5152);
            this.method2147((byte) -100);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!od", name = "r", descriptor = "()Z", line = 4118)
    public final boolean method1096() {
        ++field5154;
        return true;
    }
}
