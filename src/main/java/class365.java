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

@OriginalClass("client!fd")
public class class365 extends class38 {

    @OriginalMember(owner = "client!fd", name = "wd", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field5260 = new Hashtable();

    @OriginalMember(owner = "client!fd", name = "ce", descriptor = "I")
    public int field5292 = 128;

    @OriginalMember(owner = "client!fd", name = "he", descriptor = "Lcm;")
    private class510 field5297 = new class510();

    @OriginalMember(owner = "client!fd", name = "le", descriptor = "Ltu;")
    private class231 field5301 = new class231();

    @OriginalMember(owner = "client!fd", name = "me", descriptor = "Ltu;")
    public class231 field5302 = new class231();

    @OriginalMember(owner = "client!fd", name = "re", descriptor = "I")
    public int field5307 = 3;

    @OriginalMember(owner = "client!fd", name = "oe", descriptor = "I")
    public int field5304 = 8;

    @OriginalMember(owner = "client!fd", name = "ne", descriptor = "Z")
    private boolean field5303 = false;

    @OriginalMember(owner = "client!fd", name = "te", descriptor = "Lpk;")
    private class133 field5309 = new class133();

    @OriginalMember(owner = "client!fd", name = "ue", descriptor = "[Lcp;")
    private class508[] field5310 = new class508[4];

    @OriginalMember(owner = "client!fd", name = "xe", descriptor = "I")
    private int field5313 = -1;

    @OriginalMember(owner = "client!fd", name = "we", descriptor = "I")
    private int field5312 = -1;

    @OriginalMember(owner = "client!fd", name = "Be", descriptor = "[Lcp;")
    private class508[] field5317 = new class508[4];

    @OriginalMember(owner = "client!fd", name = "Ae", descriptor = "[Lcp;")
    private class508[] field5316 = new class508[4];

    @OriginalMember(owner = "client!fd", name = "ze", descriptor = "I")
    private int field5315 = -1;

    @OriginalMember(owner = "client!fd", name = "De", descriptor = "Lpk;")
    private class133 field5319;

    @OriginalMember(owner = "client!fd", name = "Ge", descriptor = "Lpk;")
    private class133 field5322;

    @OriginalMember(owner = "client!fd", name = "He", descriptor = "Lpk;")
    private class133 field5323;

    @OriginalMember(owner = "client!fd", name = "Ie", descriptor = "Lpk;")
    private class133 field5324;

    @OriginalMember(owner = "client!fd", name = "Je", descriptor = "Lpk;")
    private class133 field5325;

    @OriginalMember(owner = "client!fd", name = "Ke", descriptor = "Lpk;")
    private class133 field5326;

    @OriginalMember(owner = "client!fd", name = "Le", descriptor = "Lpk;")
    private class133 field5327;

    @OriginalMember(owner = "client!fd", name = "We", descriptor = "F")
    public float field5338;

    @OriginalMember(owner = "client!fd", name = "Ne", descriptor = "I")
    public int field5329;

    @OriginalMember(owner = "client!fd", name = "of", descriptor = "[F")
    private float[] field5355;

    @OriginalMember(owner = "client!fd", name = "cf", descriptor = "I")
    public int field5344;

    @OriginalMember(owner = "client!fd", name = "yf", descriptor = "I")
    private int field5365;

    @OriginalMember(owner = "client!fd", name = "Ue", descriptor = "I")
    private int field5336;

    @OriginalMember(owner = "client!fd", name = "wf", descriptor = "[Lvp;")
    private class124[] field5363;

    @OriginalMember(owner = "client!fd", name = "sf", descriptor = "I")
    public int field5359;

    @OriginalMember(owner = "client!fd", name = "Ve", descriptor = "I")
    private int field5337;

    @OriginalMember(owner = "client!fd", name = "nf", descriptor = "I")
    private int field5354;

    @OriginalMember(owner = "client!fd", name = "tf", descriptor = "I")
    public int field5360;

    @OriginalMember(owner = "client!fd", name = "Af", descriptor = "I")
    public int field5367;

    @OriginalMember(owner = "client!fd", name = "bf", descriptor = "[F")
    private float[] field5343;

    @OriginalMember(owner = "client!fd", name = "Qe", descriptor = "F")
    private float field5332;

    @OriginalMember(owner = "client!fd", name = "kg", descriptor = "I")
    private int field5403;

    @OriginalMember(owner = "client!fd", name = "mf", descriptor = "F")
    public float field5353;

    @OriginalMember(owner = "client!fd", name = "fg", descriptor = "[F")
    private float[] field5398;

    @OriginalMember(owner = "client!fd", name = "tg", descriptor = "F")
    public float field5412;

    @OriginalMember(owner = "client!fd", name = "vg", descriptor = "F")
    public float field5414;

    @OriginalMember(owner = "client!fd", name = "vf", descriptor = "I")
    public int field5362;

    @OriginalMember(owner = "client!fd", name = "Of", descriptor = "F")
    private float field5381;

    @OriginalMember(owner = "client!fd", name = "Zf", descriptor = "I")
    public int field5392;

    @OriginalMember(owner = "client!fd", name = "Ef", descriptor = "F")
    public float field5371;

    @OriginalMember(owner = "client!fd", name = "wg", descriptor = "I")
    private int field5415;

    @OriginalMember(owner = "client!fd", name = "Gg", descriptor = "[F")
    public float[] field5425;

    @OriginalMember(owner = "client!fd", name = "Qg", descriptor = "I")
    public int field5435;

    @OriginalMember(owner = "client!fd", name = "Lg", descriptor = "Z")
    private boolean field5430;

    @OriginalMember(owner = "client!fd", name = "Jg", descriptor = "I")
    public int field5428;

    @OriginalMember(owner = "client!fd", name = "ng", descriptor = "[F")
    private float[] field5406;

    @OriginalMember(owner = "client!fd", name = "og", descriptor = "F")
    private float field5407;

    @OriginalMember(owner = "client!fd", name = "Dg", descriptor = "I")
    public int field5422;

    @OriginalMember(owner = "client!fd", name = "zg", descriptor = "F")
    public float field5418;

    @OriginalMember(owner = "client!fd", name = "yg", descriptor = "I")
    public int field5417;

    @OriginalMember(owner = "client!fd", name = "Fg", descriptor = "I")
    private int field5424;

    @OriginalMember(owner = "client!fd", name = "Nf", descriptor = "F")
    public float field5380;

    @OriginalMember(owner = "client!fd", name = "Lf", descriptor = "I")
    private int field5378;

    @OriginalMember(owner = "client!fd", name = "Sg", descriptor = "I")
    private int field5437;

    @OriginalMember(owner = "client!fd", name = "Vg", descriptor = "F")
    public float field5440;

    @OriginalMember(owner = "client!fd", name = "Oe", descriptor = "I")
    private int field5330;

    @OriginalMember(owner = "client!fd", name = "Sb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5178;

    @OriginalMember(owner = "client!fd", name = "hb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5141;

    @OriginalMember(owner = "client!fd", name = "je", descriptor = "I")
    public int field5299;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field5123;

    @OriginalMember(owner = "client!fd", name = "ed", descriptor = "J")
    private long field5242;

    @OriginalMember(owner = "client!fd", name = "mc", descriptor = "J")
    private long field5198;

    @OriginalMember(owner = "client!fd", name = "Yg", descriptor = "Z")
    public boolean field5443;

    @OriginalMember(owner = "client!fd", name = "sg", descriptor = "I")
    public int field5411;

    @OriginalMember(owner = "client!fd", name = "qg", descriptor = "Ljava/lang/String;")
    private String field5409;

    @OriginalMember(owner = "client!fd", name = "Xe", descriptor = "Z")
    public boolean field5339;

    @OriginalMember(owner = "client!fd", name = "Vf", descriptor = "Z")
    private boolean field5388;

    @OriginalMember(owner = "client!fd", name = "Ng", descriptor = "Z")
    public boolean field5432;

    @OriginalMember(owner = "client!fd", name = "pg", descriptor = "Z")
    public boolean field5408;

    @OriginalMember(owner = "client!fd", name = "rg", descriptor = "Z")
    private boolean field5410;

    @OriginalMember(owner = "client!fd", name = "Qf", descriptor = "Ljava/lang/String;")
    private String field5383;

    @OriginalMember(owner = "client!fd", name = "Me", descriptor = "Z")
    public boolean field5328;

    @OriginalMember(owner = "client!fd", name = "ff", descriptor = "Z")
    private boolean field5347;

    @OriginalMember(owner = "client!fd", name = "ie", descriptor = "Lee;")
    public class476 field5298;

    @OriginalMember(owner = "client!fd", name = "se", descriptor = "Lde;")
    public class368 field5308;

    @OriginalMember(owner = "client!fd", name = "ee", descriptor = "Lwb;")
    private class216 field5294;

    @OriginalMember(owner = "client!fd", name = "ke", descriptor = "Lfh;")
    private class460 field5300;

    @OriginalMember(owner = "client!fd", name = "fe", descriptor = "Luv;")
    private class244 field5295;

    @OriginalMember(owner = "client!fd", name = "Ec", descriptor = "Lsl;")
    public static class318 field5216 = new class318(2, -1);

    @OriginalMember(owner = "client!fd", name = "xd", descriptor = "[I")
    public static int[] field5261 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!fd", name = "Jd", descriptor = "I")
    public static int field5273 = 0;

    @OriginalMember(owner = "client!fd", name = "be", descriptor = "[I")
    public static int[] field5291 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!fd", name = "gf", descriptor = "F")
    public float field5348;

    @OriginalMember(owner = "client!fd", name = "hf", descriptor = "F")
    private float field5349;

    @OriginalMember(owner = "client!fd", name = "qf", descriptor = "F")
    public float field5357;

    @OriginalMember(owner = "client!fd", name = "Ff", descriptor = "F")
    public float field5372;

    @OriginalMember(owner = "client!fd", name = "Uf", descriptor = "F")
    public float field5387;

    @OriginalMember(owner = "client!fd", name = "Wf", descriptor = "F")
    public float field5389;

    @OriginalMember(owner = "client!fd", name = "cg", descriptor = "F")
    private float field5395;

    @OriginalMember(owner = "client!fd", name = "gg", descriptor = "F")
    public float field5399;

    @OriginalMember(owner = "client!fd", name = "Pg", descriptor = "F")
    public float field5434;

    @OriginalMember(owner = "client!fd", name = "Ug", descriptor = "F")
    private float field5439;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    private int field5118;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!fd", name = "bb", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!fd", name = "cb", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!fd", name = "db", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!fd", name = "eb", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!fd", name = "fb", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!fd", name = "gb", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!fd", name = "ib", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!fd", name = "jb", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!fd", name = "kb", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!fd", name = "lb", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!fd", name = "mb", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!fd", name = "nb", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!fd", name = "ob", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!fd", name = "pb", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!fd", name = "qb", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!fd", name = "rb", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!fd", name = "sb", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!fd", name = "tb", descriptor = "I")
    public int field5153;

    @OriginalMember(owner = "client!fd", name = "ub", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!fd", name = "vb", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!fd", name = "wb", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!fd", name = "xb", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!fd", name = "yb", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!fd", name = "zb", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!fd", name = "Ab", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!fd", name = "Bb", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!fd", name = "Cb", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!fd", name = "Db", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!fd", name = "Eb", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!fd", name = "Fb", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!fd", name = "Gb", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!fd", name = "Hb", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!fd", name = "Ib", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!fd", name = "Jb", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!fd", name = "Kb", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!fd", name = "Lb", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!fd", name = "Mb", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!fd", name = "Nb", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!fd", name = "Ob", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!fd", name = "Pb", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!fd", name = "Qb", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!fd", name = "Rb", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!fd", name = "Tb", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!fd", name = "Ub", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!fd", name = "Vb", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!fd", name = "Wb", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!fd", name = "Xb", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!fd", name = "Yb", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!fd", name = "Zb", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!fd", name = "ac", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!fd", name = "bc", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!fd", name = "cc", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!fd", name = "dc", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!fd", name = "ec", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!fd", name = "fc", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!fd", name = "gc", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!fd", name = "hc", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!fd", name = "ic", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!fd", name = "jc", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!fd", name = "kc", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!fd", name = "lc", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!fd", name = "nc", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!fd", name = "oc", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!fd", name = "pc", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!fd", name = "qc", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!fd", name = "rc", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!fd", name = "sc", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!fd", name = "tc", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!fd", name = "uc", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!fd", name = "vc", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!fd", name = "wc", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!fd", name = "xc", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!fd", name = "yc", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!fd", name = "zc", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!fd", name = "Ac", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!fd", name = "Bc", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!fd", name = "Cc", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!fd", name = "Dc", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!fd", name = "Fc", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!fd", name = "Gc", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!fd", name = "Hc", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!fd", name = "Ic", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!fd", name = "Jc", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!fd", name = "Kc", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!fd", name = "Lc", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!fd", name = "Mc", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!fd", name = "Nc", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!fd", name = "Oc", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!fd", name = "Pc", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!fd", name = "Qc", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!fd", name = "Rc", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!fd", name = "Sc", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!fd", name = "Tc", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!fd", name = "Uc", descriptor = "I")
    private int field5232;

    @OriginalMember(owner = "client!fd", name = "Vc", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!fd", name = "Wc", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!fd", name = "Xc", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!fd", name = "Yc", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!fd", name = "Zc", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!fd", name = "ad", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!fd", name = "bd", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!fd", name = "cd", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!fd", name = "dd", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!fd", name = "fd", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!fd", name = "gd", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!fd", name = "hd", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!fd", name = "id", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!fd", name = "jd", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!fd", name = "kd", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!fd", name = "ld", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!fd", name = "md", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!fd", name = "nd", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!fd", name = "od", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!fd", name = "pd", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!fd", name = "qd", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!fd", name = "rd", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!fd", name = "sd", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!fd", name = "td", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!fd", name = "ud", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!fd", name = "vd", descriptor = "I")
    public int field5259;

    @OriginalMember(owner = "client!fd", name = "yd", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!fd", name = "zd", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!fd", name = "Ad", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!fd", name = "Bd", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!fd", name = "Cd", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!fd", name = "Dd", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!fd", name = "Ed", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!fd", name = "Fd", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!fd", name = "Gd", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!fd", name = "Hd", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!fd", name = "Id", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!fd", name = "Kd", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!fd", name = "Ld", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!fd", name = "Md", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!fd", name = "Nd", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!fd", name = "Od", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!fd", name = "Pd", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!fd", name = "Qd", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!fd", name = "Sd", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!fd", name = "Td", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!fd", name = "Ud", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!fd", name = "Vd", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!fd", name = "Wd", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!fd", name = "Xd", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!fd", name = "Yd", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!fd", name = "Zd", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!fd", name = "ae", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!fd", name = "de", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!fd", name = "ge", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!fd", name = "qe", descriptor = "I")
    public int field5306;

    @OriginalMember(owner = "client!fd", name = "Ce", descriptor = "I")
    public int field5318;

    @OriginalMember(owner = "client!fd", name = "Ee", descriptor = "I")
    public int field5320;

    @OriginalMember(owner = "client!fd", name = "Fe", descriptor = "I")
    private int field5321;

    @OriginalMember(owner = "client!fd", name = "Re", descriptor = "I")
    private int field5333;

    @OriginalMember(owner = "client!fd", name = "Te", descriptor = "I")
    private int field5335;

    @OriginalMember(owner = "client!fd", name = "Ye", descriptor = "I")
    public int field5340;

    @OriginalMember(owner = "client!fd", name = "Ze", descriptor = "I")
    public int field5341;

    @OriginalMember(owner = "client!fd", name = "jf", descriptor = "I")
    private int field5350;

    @OriginalMember(owner = "client!fd", name = "Gf", descriptor = "I")
    private int field5373;

    @OriginalMember(owner = "client!fd", name = "Rf", descriptor = "I")
    private int field5384;

    @OriginalMember(owner = "client!fd", name = "Sf", descriptor = "I")
    private int field5385;

    @OriginalMember(owner = "client!fd", name = "dg", descriptor = "I")
    private int field5396;

    @OriginalMember(owner = "client!fd", name = "eg", descriptor = "I")
    private int field5397;

    @OriginalMember(owner = "client!fd", name = "mg", descriptor = "I")
    public int field5405;

    @OriginalMember(owner = "client!fd", name = "Ag", descriptor = "I")
    private int field5419;

    @OriginalMember(owner = "client!fd", name = "Bg", descriptor = "I")
    public int field5420;

    @OriginalMember(owner = "client!fd", name = "Ig", descriptor = "I")
    private int field5427;

    @OriginalMember(owner = "client!fd", name = "Mg", descriptor = "I")
    private int field5431;

    @OriginalMember(owner = "client!fd", name = "Zg", descriptor = "I")
    private int field5444;

    @OriginalMember(owner = "client!fd", name = "ch", descriptor = "I")
    private int field5447;

    @OriginalMember(owner = "client!fd", name = "Wg", descriptor = "J")
    private long field5441;

    @OriginalMember(owner = "client!fd", name = "bg", descriptor = "Ltu;")
    public class231 field5394;

    @OriginalMember(owner = "client!fd", name = "hg", descriptor = "Ltu;")
    public class231 field5400;

    @OriginalMember(owner = "client!fd", name = "kf", descriptor = "Lbk;")
    private class254 field5351;

    @OriginalMember(owner = "client!fd", name = "Yf", descriptor = "Lml;")
    public class264 field5391;

    @OriginalMember(owner = "client!fd", name = "Kg", descriptor = "Lml;")
    public class264 field5429;

    @OriginalMember(owner = "client!fd", name = "dh", descriptor = "Ltm;")
    private class265 field5448;

    @OriginalMember(owner = "client!fd", name = "pf", descriptor = "Laf;")
    public class299 field5356;

    @OriginalMember(owner = "client!fd", name = "zf", descriptor = "Laf;")
    public class299 field5366;

    @OriginalMember(owner = "client!fd", name = "Cg", descriptor = "Laf;")
    public class299 field5421;

    @OriginalMember(owner = "client!fd", name = "Jf", descriptor = "Lvd;")
    private class30 field5376;

    @OriginalMember(owner = "client!fd", name = "ag", descriptor = "Lvd;")
    private class30 field5393;

    @OriginalMember(owner = "client!fd", name = "Rd", descriptor = "Lsp;")
    public static class448 field5281;

    @OriginalMember(owner = "client!fd", name = "Df", descriptor = "Lpc;")
    public class473 field5370;

    @OriginalMember(owner = "client!fd", name = "Kf", descriptor = "Lpc;")
    public class473 field5377;

    @OriginalMember(owner = "client!fd", name = "Se", descriptor = "Lip;")
    public class497 field5334;

    @OriginalMember(owner = "client!fd", name = "ef", descriptor = "Lip;")
    public class497 field5346;

    @OriginalMember(owner = "client!fd", name = "rf", descriptor = "Lip;")
    public class497 field5358;

    @OriginalMember(owner = "client!fd", name = "xf", descriptor = "Lip;")
    public class497 field5364;

    @OriginalMember(owner = "client!fd", name = "ig", descriptor = "Lip;")
    public class497 field5401;

    @OriginalMember(owner = "client!fd", name = "jg", descriptor = "Lip;")
    public class497 field5402;

    @OriginalMember(owner = "client!fd", name = "lg", descriptor = "Lip;")
    public class497 field5404;

    @OriginalMember(owner = "client!fd", name = "ug", descriptor = "Lip;")
    public class497 field5413;

    @OriginalMember(owner = "client!fd", name = "Eg", descriptor = "Lip;")
    public class497 field5423;

    @OriginalMember(owner = "client!fd", name = "Tg", descriptor = "Lip;")
    public class497 field5438;

    @OriginalMember(owner = "client!fd", name = "ve", descriptor = "Lcp;")
    private class508 field5311;

    @OriginalMember(owner = "client!fd", name = "ye", descriptor = "Lcp;")
    private class508 field5314;

    @OriginalMember(owner = "client!fd", name = "If", descriptor = "Lps;")
    private class63 field5375;

    @OriginalMember(owner = "client!fd", name = "pe", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field5305;

    @OriginalMember(owner = "client!fd", name = "Pe", descriptor = "Z")
    public boolean field5331;

    @OriginalMember(owner = "client!fd", name = "af", descriptor = "Z")
    private boolean field5342;

    @OriginalMember(owner = "client!fd", name = "df", descriptor = "Z")
    private boolean field5345;

    @OriginalMember(owner = "client!fd", name = "lf", descriptor = "Z")
    private boolean field5352;

    @OriginalMember(owner = "client!fd", name = "uf", descriptor = "Z")
    public boolean field5361;

    @OriginalMember(owner = "client!fd", name = "Bf", descriptor = "Z")
    public boolean field5368;

    @OriginalMember(owner = "client!fd", name = "Cf", descriptor = "Z")
    private boolean field5369;

    @OriginalMember(owner = "client!fd", name = "Hf", descriptor = "Z")
    private boolean field5374;

    @OriginalMember(owner = "client!fd", name = "Mf", descriptor = "Z")
    private boolean field5379;

    @OriginalMember(owner = "client!fd", name = "Pf", descriptor = "Z")
    private boolean field5382;

    @OriginalMember(owner = "client!fd", name = "Tf", descriptor = "Z")
    public boolean field5386;

    @OriginalMember(owner = "client!fd", name = "Xf", descriptor = "Z")
    private boolean field5390;

    @OriginalMember(owner = "client!fd", name = "Hg", descriptor = "Z")
    public boolean field5426;

    @OriginalMember(owner = "client!fd", name = "Og", descriptor = "Z")
    private boolean field5433;

    @OriginalMember(owner = "client!fd", name = "Rg", descriptor = "Z")
    public boolean field5436;

    @OriginalMember(owner = "client!fd", name = "Xg", descriptor = "Z")
    public boolean field5442;

    @OriginalMember(owner = "client!fd", name = "ah", descriptor = "Z")
    private boolean field5445;

    @OriginalMember(owner = "client!fd", name = "bh", descriptor = "Z")
    public boolean field5446;

    @OriginalMember(owner = "client!fd", name = "xg", descriptor = "[Lkj;")
    private class396[] field5416;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "(I)V")
    private final void method2179(int arg0) {
        ++field5203;
        int var2 = 0;
        if (arg0 <= 67) {
            this.method298();
        }
        while (!this.field5123.attach()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            class213.method1462(1000L, -5184);
        }
    }

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "(III[I)V")
    public final void method372(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5268;
        float var5 = (float) arg2 * this.field5400.field3377 + (float) arg0 * this.field5400.field3400 + (float) arg1 * this.field5400.field3392 + this.field5400.field3376;
        if (!((float) this.field5344 > var5) && !(var5 > (float) this.field5422)) {
            int var6 = (int) (((float) arg2 * this.field5400.field3402 + (float) arg0 * this.field5400.field3386 + (float) arg1 * this.field5400.field3401 + this.field5400.field3407) * (float) this.field5417 / var5);
            int var7 = (int) (((float) arg2 * this.field5400.field3381 + (float) arg0 * this.field5400.field3378 + (float) arg1 * this.field5400.field3396 + this.field5400.field3399) * (float) this.field5360 / var5);
            if ((float) var6 >= this.field5434 && this.field5372 >= (float) var6 && (float) var7 >= this.field5357 && (float) var7 <= this.field5389) {
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 - this.field5357);
                arg3[0] = (int) ((float) var6 - this.field5434);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)I")
    public final int method2180(int arg0, int arg1) {
        ++field5104;
        if (~arg0 != -5122 && arg0 != 5120) {
            if (arg1 < 125) {
                this.field5198 = 43L;
            }
            if (~arg0 != -5124 && ~arg0 != -5123) {
                if (~arg0 != -5126 && arg0 != 5124 && arg0 != 5126) {
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

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "()Z")
    public final boolean method348() {
        ++field5175;
        return true;
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "()Z")
    public final boolean method298() {
        ++field5130;
        return true;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method325(Canvas arg0) {
        ++field5131;
        if (this.field5178 == arg0) {
            throw new RuntimeException();
        } else if (this.field5260.containsKey(arg0)) {
            Long var2 = (Long) this.field5260.get(arg0);
            this.field5123.releaseSurface(arg0, var2);
            this.field5260.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(Z)V")
    public final void method2181(boolean arg0) {
        if (~this.field5444 != -1) {
            this.field5444 = 0;
            this.field5447 &= -32;
        }
        if (!arg0) {
            this.field5366 = null;
        }
        ++field5174;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
    public final void method290(boolean arg0) {
        ++field5194;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[I[I)Lma;")
    public final class10 method355(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field5102;
        return class404.method2475(arg1, arg2, arg0, this, arg3, (byte) -84);
    }

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "(I)V")
    private final void method2182(int arg0) {
        if (arg0 < 55) {
            this.field5327 = null;
        }
        ++field5293;
        if (this.field5444 != 3) {
            this.field5444 = 3;
            this.method2216(-16933);
            this.method2235(0);
            this.field5447 &= -8;
        }
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(II)V")
    public final void method2183(int arg0, int arg1) {
        if (~arg1 != -2) {
            if (arg1 == 0) {
                this.method2195(8448, 8448, true);
            } else if (arg1 == 2) {
                this.method2195(34165, 7681, true);
            } else if (~arg1 != -4) {
                if (arg1 == 4) {
                    this.method2195(34023, 34023, true);
                }
            } else {
                this.method2195(260, 8448, true);
            }
        } else {
            this.method2195(7681, 7681, true);
        }
        if (arg0 != 7681) {
            this.field5336 = 35;
        }
        ++field5191;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)V")
    public final void method2184(byte arg0, int arg1) {
        class402.field5968[0] = (float) class345.method2089(arg1, 16711680) / 1.671168E7F;
        class402.field5968[2] = (float) class345.method2089(arg1, 255) / 255.0F;
        ++field5120;
        class402.field5968[3] = (float) (arg1 >>> 24) / 255.0F;
        class402.field5968[1] = (float) class345.method2089(arg1, 65280) / 65280.0F;
        if (arg0 == -100) {
            OpenGL.glTexEnvfv(8960, 8705, class402.field5968, 0);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZILjaggl/memory/NativeBuffer;II)Lvd;")
    public final class30 method2185(boolean arg0, int arg1, NativeBuffer arg2, int arg3, int arg4) {
        ++field5165;
        if (!this.field5388 || arg0 && !this.field5410) {
            return arg1 < 116 ? null : new class252(this, arg4, arg2);
        } else {
            return new class155(this, arg4, arg2, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)V")
    public final void method315(boolean arg0) {
        ++field5127;
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(Z)V")
    private final void method2186(boolean arg0) {
        ++field5151;
        int var2 = 0;
        if (!arg0) {
            this.method292();
        }
        while (~this.field5350 < ~var2) {
            class124 var3 = this.field5363[var2];
            int var4 = var2 + 16386;
            class498.field7405[0] = (float) var3.method980(false);
            class498.field7405[1] = (float) var3.method981((byte) 27);
            class498.field7405[2] = (float) var3.method983((byte) -60);
            class498.field7405[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class498.field7405, 0);
            int var5 = var3.method982((byte) -112);
            float var6 = var3.method979(false) / 255.0F;
            class498.field7405[0] = var6 * (float) (class345.method2089(16753966, var5) >> 16);
            class498.field7405[1] = (float) (class345.method2089(65287, var5) >> 8) * var6;
            class498.field7405[2] = (float) class345.method2089(255, var5) * var6;
            OpenGL.glLightfv(var4, 4609, class498.field7405, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method984(81) * var3.method984(116)));
            OpenGL.glEnable(var4);
            ++var2;
        }
        while (var2 < this.field5333) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field5333 = this.field5350;
    }

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "(I)V")
    public final void method2187(int arg0) {
        ++field5226;
        if (this.field5447 != arg0) {
            this.method2207(true);
            this.method2201(true, 0);
            this.method2234(true, (byte) 114);
            this.method2194(arg0 + -40, true);
            this.method2241(-121, 1);
            this.method2183(arg0 + 7673, 0);
            this.field5447 = 8;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLkj;)V")
    public final void method2188(byte arg0, class396 arg1) {
        ++field5224;
        class396 var3 = this.field5416[this.field5385];
        if (arg1 != var3) {
            if (arg1 == null) {
                OpenGL.glDisable(var3.field5801);
            } else {
                if (var3 != null) {
                    if (~arg1.field5801 != ~var3.field5801) {
                        OpenGL.glDisable(var3.field5801);
                        OpenGL.glEnable(arg1.field5801);
                    }
                } else {
                    OpenGL.glEnable(arg1.field5801);
                }
                OpenGL.glBindTexture(arg1.field5801, arg1.method2426(true));
            }
            this.field5416[this.field5385] = arg1;
        }
        if (arg0 == 78) {
            this.field5447 &= -2;
        }
    }

    @OriginalMember(owner = "client!fd", name = "fa", descriptor = "(IIII)V")
    public final void method306(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < this.field5365) {
            this.field5365 = arg3;
        }
        if (this.field5354 > arg2) {
            this.field5354 = arg2;
        }
        if (this.field5437 < arg1) {
            this.field5437 = arg1;
        }
        if (~this.field5424 > ~arg0) {
            this.field5424 = arg0;
        }
        ++field5142;
        OpenGL.glEnable(3089);
        this.method2236(true);
        this.method2198((byte) -119);
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)Lu;")
    public final class53 method354(int arg0) {
        ++field5256;
        class423 var2 = new class423(arg0);
        this.field5309.method1015(false, var2);
        return var2;
    }

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "()I")
    public final int method322() {
        ++field5211;
        return 4;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)V")
    public final void method2189(boolean arg0, int arg1) {
        ++field5140;
        if (!this.field5433 != !arg0) {
            this.field5433 = arg0;
            this.method2202(0);
            this.field5447 &= -8;
        }
        int var3 = 39 / ((9 - arg1) / 44);
    }

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "(I)V")
    private final void method2190(int arg0) {
        OpenGL.glMatrixMode(5889);
        ++field5154;
        int var2 = -109 % ((65 - arg0) / 37);
        OpenGL.glLoadMatrixf(this.field5343, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)V")
    public final synchronized void method2191(int arg0, byte arg1) {
        if (arg1 != 51) {
            this.field5402 = null;
        }
        ++field5244;
        class223 var3 = new class223();
        var3.field3271 = (long) arg0;
        this.field5326.method1015(false, var3);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    private final void method2192(byte arg0) {
        if (this.field5141 == null) {
            this.field5232 = this.field5118 = 0;
        } else {
            Dimension var2 = this.field5141.getSize();
            this.field5118 = var2.height;
            this.field5232 = var2.width;
        }
        ++field5225;
        if (this.field5311 == null) {
            this.field5153 = this.field5118;
            this.field5259 = this.field5232;
            this.method2233(1);
        }
        int var3 = 70 / ((-64 - arg0) / 54);
        this.method2181(true);
        this.method339();
    }

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "(IIIIII)V")
    public final void method386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5192;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method2260((byte) -56);
        float var10 = (float) arg3 + var8;
        this.method2241(93, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5342) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5342) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
    public final synchronized void method2193(int arg0, int arg1, int arg2) {
        ++field5276;
        class389 var4 = new class389(arg1);
        if (arg0 > -44) {
            this.method334(-39, 94, -5, -127, -35, -16);
        }
        var4.field3271 = (long) arg2;
        this.field5325.method1015(false, var4);
    }

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "()Z")
    public final boolean method356() {
        ++field5213;
        return true;
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V")
    public final void method353(int arg0) {
        ++field5296;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "()Z")
    public final boolean method377() {
        ++field5288;
        return true;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)V")
    public final void method2194(int arg0, boolean arg1) {
        ++field5206;
        if (this.field5369 != arg1) {
            this.field5369 = arg1;
            this.method2259(arg0 ^ -32);
            this.field5447 &= -32;
        }
        if (arg0 != -32) {
            this.field5330 = -115;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)V")
    public final void method369(int arg0, int arg1, int arg2, int arg3) {
        ++field5220;
        this.field5294.method1480(arg0, arg2, -88, arg1, arg3);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZ)V")
    public final void method2195(int arg0, int arg1, boolean arg2) {
        if (~this.field5385 != -1) {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        } else {
            boolean var4 = false;
            if (this.field5378 != arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                this.field5378 = arg0;
                var4 = true;
            }
            if (~this.field5403 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                var4 = true;
                this.field5403 = arg1;
            }
            if (var4) {
                this.field5447 &= -30;
            }
        }
        ++field5126;
        if (!arg2) {
            this.method300();
        }
    }

    @OriginalMember(owner = "client!fd", name = "NA", descriptor = "(IIIII)V")
    public final void method329(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5117;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZFFFF)V")
    public final void method2196(boolean arg0, float arg1, float arg2, float arg3, float arg4) {
        class402.field5968[2] = arg3;
        if (!arg0) {
            this.method2229((byte) 58);
        }
        ++field5263;
        class402.field5968[1] = arg1;
        class402.field5968[3] = arg2;
        class402.field5968[0] = arg4;
        OpenGL.glTexEnvfv(8960, 8705, class402.field5968, 0);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljq;IIII)Lt;")
    public final class471 method314(class353 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5109;
        return new class497(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
    public final void method2197(byte arg0) {
        OpenGL.glLightfv(16384, 4611, this.field5425, 0);
        ++field5116;
        if (arg0 != 66) {
            this.method380(-40, 53, 123, 88);
        }
        OpenGL.glLightfv(16385, 4611, this.field5398, 0);
    }

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "()Z")
    public final boolean method323() {
        ++field5106;
        return this.field5295.method1602(3, (byte) -126);
    }

    @OriginalMember(owner = "client!fd", name = "ea", descriptor = "(Lc;)V")
    public final void method308(class122 arg0) {
        ++field5209;
        this.field5400 = (class231) arg0;
        this.field5394.method1550(this.field5400, false);
        if (~this.field5444 != -2) {
            this.method2235(0);
        }
    }

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "()V")
    public final void method396() {
        ++field5134;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method338(Canvas arg0) {
        ++field5241;
        long var2 = 0L;
        if (arg0 != null && this.field5178 != arg0) {
            if (this.field5260.containsKey(arg0)) {
                Long var4 = (Long) this.field5260.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field5242;
        }
        if (var2 == 0L) {
            throw new RuntimeException();
        } else {
            this.field5123.surfaceResized(var2);
            if (this.field5141 == arg0) {
                this.method2192((byte) -118);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)V")
    private final void method2198(byte arg0) {
        if (this.field5424 <= this.field5354 && ~this.field5437 >= ~this.field5365) {
            OpenGL.glScissor(this.field5424 + this.field5415, this.field5330 - -this.field5153 + -this.field5365, -this.field5424 + this.field5354, -this.field5437 + this.field5365);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field5233;
        if (arg0 >= -3) {
            this.field5368 = false;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method307(Canvas arg0) {
        this.field5141 = null;
        this.field5198 = 0L;
        ++field5176;
        if (arg0 != null && this.field5178 != arg0) {
            if (this.field5260.containsKey(arg0)) {
                Long var2 = (Long) this.field5260.get(arg0);
                this.field5198 = var2;
                this.field5141 = arg0;
            }
        } else {
            this.field5198 = this.field5242;
            this.field5141 = this.field5178;
        }
        if (this.field5141 != null && ~this.field5198 != -1L) {
            this.field5123.setSurface(this.field5198);
            this.method2192((byte) -119);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "()V")
    public final void method347() {
        this.field5294.method1482((byte) -14);
        ++field5162;
    }

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "(I)V")
    public final void method2199(int arg0) {
        OpenGL.glPopMatrix();
        ++field5101;
        if (arg0 != 1) {
            this.field5340 = 56;
        }
    }

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "()F")
    public final float method395() {
        ++field5105;
        return this.field5371;
    }

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "(I)V")
    private final void method2200(int arg0) {
        if (this.field5390) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field5390 = false;
        }
        ++field5129;
        if (arg0 != 0) {
            this.field5342 = true;
        }
    }

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "()Z")
    public final boolean method303() {
        ++field5196;
        if (this.field5300 != null) {
            if (!this.field5300.method810((byte) 120)) {
                if (!this.field5294.method1475(0, this.field5300)) {
                    return false;
                }
                this.field5298.method2879(4);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(ZI)V")
    public final void method2201(boolean arg0, int arg1) {
        if (!this.field5352 != !arg0) {
            this.field5352 = arg0;
            this.method2251(true);
            this.field5447 &= -32;
        }
        if (arg1 != 0) {
            this.field5337 = -29;
        }
        ++field5115;
    }

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "(I)V")
    private final void method2202(int arg0) {
        if (this.field5433 && !this.field5379) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 != 0) {
            this.method2186(false);
        }
        ++field5181;
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(II)I")
    public final int method2203(int arg0, int arg1) {
        ++field5125;
        if (arg0 != 6406 && ~arg0 != -6410) {
            if (~arg0 != -6411 && ~arg0 != -34847 && ~arg0 != -34845) {
                if (~arg0 == -6408) {
                    return 3;
                } else if (arg0 != 6408 && ~arg0 != -34848) {
                    if (~arg0 != -34844) {
                        if (~arg0 != -34843) {
                            if (arg0 != 6402) {
                                if (~arg0 == -6402) {
                                    return 1;
                                } else {
                                    if (arg1 != 2) {
                                        this.field5447 = 114;
                                    }
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
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(Z)V")
    private final void method2204(boolean arg0) {
        ++field5208;
        if (arg0) {
            this.field5123.detach();
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lcp;B)V")
    public final void method2205(class508 arg0, byte arg1) {
        ++field5121;
        if (arg1 != -101) {
            this.method2237(true, -85, -74, 117);
        }
        if (!this.field5386) {
            if (this.field5312 >= 3) {
                throw new RuntimeException();
            } else {
                if (~this.field5312 <= -1) {
                    this.field5317[this.field5312].method1694(-123);
                }
                this.field5314 = this.field5311 = this.field5317[++this.field5312] = arg0;
                this.field5314.method1697((byte) -123);
            }
        } else {
            this.method2223((byte) 79, arg0);
            this.method2239(arg0, (byte) 54);
        }
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(B)V")
    private final void method2206(byte arg0) {
        ++field5290;
        float[] var2 = this.field5343;
        float var3 = (float) (-this.field5362 * this.field5344) / (float) this.field5417;
        float var4 = (float) ((this.field5259 - this.field5362) * this.field5344) / (float) this.field5417;
        if (arg0 >= -70) {
            this.method2208(10, 30, 114, 87);
        }
        float var5 = (float) (this.field5367 * this.field5344) / (float) this.field5360;
        float var6 = (float) ((-this.field5153 + this.field5367) * this.field5344) / (float) this.field5360;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field5344 * 2.0F;
            var2[6] = 0.0F;
            var2[3] = 0.0F;
            var2[13] = 0.0F;
            var2[5] = var7 / (-var6 + var5);
            var2[4] = 0.0F;
            var2[7] = 0.0F;
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[12] = 0.0F;
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[14] = this.field5349 = -((float) this.field5422 * var7) / (float) (-this.field5344 + this.field5422);
            var2[2] = 0.0F;
            var2[15] = 0.0F;
            var2[10] = this.field5395 = (float) (-(this.field5422 - -this.field5344)) / (float) (-this.field5344 + this.field5422);
            var2[1] = 0.0F;
            var2[11] = -1.0F;
            var2[0] = var7 / (var4 - var3);
        } else {
            var2[7] = 0.0F;
            var2[13] = 0.0F;
            var2[3] = 0.0F;
            var2[5] = 1.0F;
            var2[2] = 0.0F;
            var2[9] = 0.0F;
            var2[14] = 0.0F;
            var2[4] = 0.0F;
            var2[10] = 1.0F;
            var2[15] = 1.0F;
            var2[8] = 0.0F;
            var2[1] = 0.0F;
            var2[12] = 0.0F;
            var2[0] = 1.0F;
            var2[11] = 0.0F;
            var2[6] = 0.0F;
        }
        this.method2258(0);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIII)Ltb;")
    public final class274 method334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5284;
        return !this.field5368 ? null : new class524(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "(Z)V")
    private final void method2207(boolean arg0) {
        if (~this.field5444 != -3) {
            this.field5444 = 2;
            this.method2190(-82);
            this.method2235(0);
            this.field5447 &= -8;
        }
        ++field5265;
        if (!arg0) {
            this.field5363 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method363(Rectangle[] arg0, int arg1) {
        this.method302();
        ++field5210;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIII)V")
    public final void method2208(int arg0, int arg1, int arg2, int arg3) {
        ++field5113;
        OpenGL.glDrawArrays(arg2, arg1, arg3);
        if (arg0 != 1) {
            this.method2214(70, -45, -16);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ltb;Ltb;FLtb;)Ltb;")
    public final class274 method375(class274 arg0, class274 arg1, float arg2, class274 arg3) {
        ++field5184;
        if (arg0 != null && arg1 != null && this.field5368 && this.field5328 && this.field5386) {
            class409 var5 = null;
            class265 var6 = (class265) arg0;
            class265 var7 = (class265) arg1;
            class401 var8 = var6.method1708(2);
            class401 var9 = var7.method1708(2);
            if (var8 != null && var9 != null) {
                int var10 = ~var9.field5948 > ~var8.field5948 ? var8.field5948 : var9.field5948;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class409) {
                    class409 var11 = (class409) arg3;
                    if (var10 == var11.method2508(false)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class409(this, var10);
                }
                if (var5.method2506(var9, arg2, var8, 0)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lt;Lmc;Lc;Lmi;I)V")
    public final void method324(class471 arg0, class88 arg1, class122 arg2, class341 arg3, int arg4) {
        arg0.method457(arg2, arg3, arg4);
        ++field5148;
        this.method345(arg1);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZBIZ)V")
    public final void method2209(boolean arg0, byte arg1, int arg2, boolean arg3) {
        if (this.field5427 != arg2) {
            if (arg2 < 0) {
                this.method2200(arg1 + -12);
                this.method2188((byte) 78, (class396) null);
                this.method2183(arg1 ^ 7693, 0);
                if (!this.field5331) {
                    this.field5295.method1603(-93, arg3, arg0, 0);
                }
            } else {
                class299 var5 = this.field5298.method2878(arg2, -128);
                class104 var6 = super.field425.method1780(-31305, arg2);
                if (var6.field1445 == 0 && ~var6.field1450 == -1) {
                    this.method2200(0);
                } else {
                    int var7 = !var6.field1435 ? 128 : 64;
                    int var8 = var7 * 50;
                    this.method2246((byte) -62, (float) (this.field5306 % var8 * var6.field1450) / (float) var8, (float) (this.field5306 % var8 * var6.field1445) / (float) var8, 0.0F);
                }
                if (!this.field5331) {
                    this.field5295.method1603(-113, arg3, arg0, var6.field1443);
                    this.field5295.method1604(var6.field1436, var6.field1442, false);
                    if (!this.field5295.method1601((byte) -92, var5, var6.field1441)) {
                        this.method2188((byte) 78, var5);
                        this.method2183(arg1 ^ 7693, var6.field1441);
                    }
                } else {
                    this.field5295.method1603(-105, arg3, arg0, 3);
                    this.method2188((byte) 78, var5);
                    this.method2183(7681, var6.field1441);
                }
            }
            this.field5427 = arg2;
        }
        ++field5188;
        if (arg1 != 12) {
            this.method2236(true);
        }
        this.field5447 &= -8;
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(B)V")
    private final void method2210(byte arg0) {
        class402.field5968[2] = this.field5418 * this.field5414;
        class402.field5968[0] = this.field5414 * this.field5412;
        ++field5177;
        class402.field5968[3] = 1.0F;
        class402.field5968[1] = this.field5414 * this.field5338;
        OpenGL.glLightfv(16384, 4609, class402.field5968, 0);
        class402.field5968[1] = -this.field5380 * this.field5338;
        int var2 = -8 % ((8 - arg0) / 58);
        class402.field5968[2] = -this.field5380 * this.field5418;
        class402.field5968[3] = 1.0F;
        class402.field5968[0] = -this.field5380 * this.field5412;
        OpenGL.glLightfv(16385, 4609, class402.field5968, 0);
    }

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "(IFFFFF)V")
    public final void method305(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field5250;
        boolean var7 = this.field5336 != arg0;
        if (var7 || this.field5414 != arg1 || this.field5380 != arg2) {
            this.field5380 = arg2;
            this.field5336 = arg0;
            this.field5414 = arg1;
            if (var7) {
                this.field5338 = (float) (65280 & this.field5336) / 65280.0F;
                this.field5412 = (float) (this.field5336 & 16711680) / 1.671168E7F;
                this.field5418 = (float) (255 & this.field5336) / 255.0F;
                this.method2244(true);
            }
            this.method2210((byte) -93);
        }
        if (this.field5406[0] != arg3 || this.field5406[1] != arg4 || this.field5406[2] != arg5) {
            this.field5406[2] = arg5;
            this.field5406[1] = arg4;
            this.field5406[0] = arg3;
            this.field5355[1] = -arg4;
            this.field5355[0] = -arg3;
            this.field5355[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5425[0] = arg3 * var8;
            this.field5425[2] = arg5 * var8;
            this.field5425[1] = arg4 * var8;
            this.field5398[2] = -this.field5425[2];
            this.field5398[1] = -this.field5425[1];
            this.field5398[0] = -this.field5425[0];
            this.method2197((byte) 66);
            this.field5341 = (int) (arg3 * 256.0F / arg4);
            this.field5420 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "(Z)V")
    public final void method2211(boolean arg0) {
        ++field5200;
        if (~this.field5447 != -17) {
            this.method2182(74);
            this.method2201(true, 0);
            this.method2234(true, (byte) 108);
            this.method2194(-32, true);
            this.method2241(-57, 1);
            this.method2183(7681, 0);
            this.field5447 = 16;
        }
        if (!arg0) {
            this.field5387 = 1.1431563F;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)I")
    public final int method351(int arg0, int arg1) {
        ++field5283;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public final synchronized void method301(int arg0) {
        ++field5107;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field5322.method1025((byte) -123)) {
            class389 var12 = (class389) this.field5322.method1014(4095);
            class32.field372[var3++] = (int) var12.field3271;
            this.field5320 -= var12.field5750;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class32.field372, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class32.field372, 0);
            var3 = 0;
        }
        while (!this.field5323.method1025((byte) -125)) {
            class389 var11 = (class389) this.field5323.method1014(4095);
            class32.field372[var3++] = (int) var11.field3271;
            this.field5318 -= var11.field5750;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class32.field372, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteTextures(var3, class32.field372, 0);
            var3 = 0;
        }
        while (!this.field5324.method1025((byte) -126)) {
            class389 var10 = (class389) this.field5324.method1014(4095);
            class32.field372[var3++] = var10.field5750;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class32.field372, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class32.field372, 0);
            var3 = 0;
        }
        while (!this.field5325.method1025((byte) -124)) {
            class389 var9 = (class389) this.field5325.method1014(4095);
            class32.field372[var3++] = (int) var9.field3271;
            this.field5321 -= var9.field5750;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class32.field372, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class32.field372, 0);
            boolean var4 = false;
        }
        while (!this.field5319.method1025((byte) -126)) {
            class389 var8 = (class389) this.field5319.method1014(4095);
            OpenGL.glDeleteLists((int) var8.field3271, var8.field5750);
        }
        while (!this.field5326.method1025((byte) -122)) {
            class223 var7 = this.field5326.method1014(4095);
            OpenGL.glDeleteProgramARB((int) var7.field3271);
        }
        while (!this.field5327.method1025((byte) -126)) {
            class223 var6 = this.field5327.method1014(4095);
            OpenGL.glDeleteObjectARB(var6.field3271);
        }
        while (!this.field5319.method1025((byte) -124)) {
            class389 var5 = (class389) this.field5319.method1014(4095);
            OpenGL.glDeleteLists((int) var5.field3271, var5.field5750);
        }
        this.field5298.method2874((byte) 103);
        if (this.method320() > 100663296 && class437.method2644(-52) > this.field5441 + 60000L) {
            System.gc();
            this.field5441 = class437.method2644(-104);
        }
        this.field5306 = var2;
    }

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "(I)V")
    public final void method2212(int arg0) {
        if (arg0 != 1) {
            this.method358(40, (class10) null, -106, -85);
        }
        if (~this.field5447 != -5) {
            this.method2215(arg0);
            this.method2201(false, 0);
            this.method2189(false, -119);
            this.method2234(false, (byte) 100);
            this.method2194(-32, false);
            this.method2240(false, -2);
            this.method2241(118, 1);
            this.method2183(7681, 0);
            this.field5447 = 4;
        }
        ++field5253;
    }

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "(Z)V")
    public final void method2213(boolean arg0) {
        ++field5230;
        if (~this.field5447 != -3) {
            this.method2215(1);
            this.method2201(false, 0);
            this.method2189(false, -53);
            this.method2234(false, (byte) 61);
            this.method2194(-32, false);
            this.method2240(arg0, -2);
            this.field5447 = 2;
        }
        if (arg0) {
            this.method2236(true);
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(III)V")
    public final void method2214(int arg0, int arg1, int arg2) {
        ++field5264;
        this.field5415 = arg1;
        this.field5330 = arg0;
        this.method2233(arg2);
        this.method2198((byte) -22);
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V")
    public final void method382(int arg0) {
        this.method2204(true);
        ++field5246;
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "()V")
    public final void method339() {
        this.field5354 = this.field5259;
        ++field5108;
        this.field5424 = 0;
        this.field5365 = this.field5153;
        this.field5437 = 0;
        OpenGL.glDisable(3089);
        this.method2236(true);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[[I[[IIII)Lta;")
    public final class142 method374(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5144;
        return new class240(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "(I)V")
    private final void method2215(int arg0) {
        if (this.field5444 != arg0) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field5259 > 0 && this.field5153 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field5259, (double) this.field5153, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field5444 = 1;
            this.field5447 &= -25;
        }
        ++field5201;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIILma;II)V")
    public final void method357(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8) {
        ++field5237;
        class95 var10 = (class95) arg6;
        class63 var11 = var10.field1285;
        this.method2213(false);
        this.method2188((byte) 78, var10.field1285);
        this.method2241(94, arg5);
        this.method2195(7681, 8448, true);
        this.method2228((byte) 79, 0, 768, 34167);
        float var12 = var11.field749 / (float) var11.field743;
        float var13 = var11.field746 / (float) var11.field748;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method2228((byte) 79, 0, 768, 5890);
    }

    @OriginalMember(owner = "client!fd", name = "AA", descriptor = "(IIII)V")
    public final void method295(int arg0, int arg1, int arg2, int arg3) {
        ++field5280;
        this.field5359 = arg3;
        this.field5340 = arg0;
        this.field5435 = arg2;
        this.field5337 = arg1;
        this.field5331 = true;
        this.field5295.method1603(-81, false, false, 3);
        this.field5295.field3596.method2093((byte) -41);
        this.method2242((byte) -110);
        this.method2251(true);
    }

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "()Z")
    public final boolean method321() {
        ++field5205;
        return this.field5342 && (!this.method378() || this.field5374);
    }

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "(I)V")
    private final void method2216(int arg0) {
        ++field5266;
        float var2 = (float) (-this.field5362) * this.field5381 / (float) this.field5417;
        float var3 = (float) (-this.field5367) * this.field5381 / (float) this.field5360;
        if (arg0 != -16933) {
            this.field5368 = true;
        }
        float var4 = (float) (-this.field5362 + this.field5259) * this.field5381 / (float) this.field5417;
        float var5 = (float) (-this.field5367 + this.field5153) * this.field5381 / (float) this.field5360;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field5344 + -this.field5387), (double) ((float) this.field5422 + -this.field5387));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lga;ILet;)V")
    public class365(int arg0, Canvas arg1, class277 arg2, int arg3, class419 arg4) {
        super(arg0, arg2);
        new class59();
        new class106(16);
        this.field5319 = new class133();
        this.field5322 = new class133();
        this.field5323 = new class133();
        this.field5324 = new class133();
        this.field5325 = new class133();
        this.field5326 = new class133();
        this.field5327 = new class133();
        this.field5338 = 1.0F;
        this.field5329 = 0;
        this.field5355 = new float[4];
        this.field5344 = 50;
        this.field5365 = 0;
        this.field5336 = -1;
        this.field5363 = new class124[class153.field2177];
        this.field5359 = 0;
        this.field5337 = -1;
        this.field5354 = 0;
        this.field5360 = 512;
        this.field5367 = 0;
        this.field5343 = new float[16];
        this.field5332 = 0.0F;
        this.field5403 = 8448;
        this.field5353 = 3584.0F;
        this.field5398 = new float[4];
        this.field5412 = 1.0F;
        this.field5414 = -1.0F;
        this.field5362 = 0;
        this.field5381 = 1.0F;
        this.field5392 = -1;
        this.field5371 = 3000.0F;
        this.field5415 = 0;
        this.field5425 = new float[4];
        this.field5435 = -1;
        this.field5430 = true;
        this.field5428 = -1;
        this.field5406 = new float[4];
        this.field5407 = 1.0F;
        this.field5422 = 3584;
        this.field5418 = 1.0F;
        this.field5417 = 512;
        this.field5424 = 0;
        this.field5380 = -1.0F;
        this.field5378 = 8448;
        this.field5437 = 0;
        this.field5440 = 3584.0F;
        this.field5330 = 0;
        this.field5141 = this.field5178 = arg1;
        this.field5299 = arg3;
        try {
            if (class182.field2580 == null || !class182.field2580) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class182.field2580 = Boolean.TRUE;
                } else {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (!var6.startsWith("mac")) {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method2556("jaggl.dll", false).toString());
                        } else {
                            System.load(arg4.method2556("libjaggl.jnilib", false).toString());
                        }
                    } else {
                        System.load(arg4.method2556("libjaggl.so", false).toString());
                    }
                    class182.field2580 = Boolean.TRUE;
                }
            }
            if (class182.field2580 != null && class182.field2580) {
                this.field5123 = new OpenGL();
                this.field5198 = this.field5242 = this.field5123.init(arg1, 8, 8, 8, 24, 0, this.field5299);
                if (this.field5242 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method2179(122);
                    int var7 = this.method2257(0);
                    if (var7 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field5411 = this.field5443 ? 33639 : 5121;
                        if (this.field5409.indexOf("radeon") != -1) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class92.method817((byte) 56, this.field5409.replace('/', ' '), ' ');
                            for (int var12 = 0; var11.length > var12; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (var13.length() > 0) {
                                        if (~var13.charAt(0) == -121 && var13.length() >= 3 && class242.method1599(var13.substring(1, 3), 59)) {
                                            var13 = var13.substring(1);
                                            var10 = true;
                                        }
                                        if (var13.equals("hd")) {
                                            var9 = true;
                                        } else {
                                            if (var13.startsWith("hd")) {
                                                var9 = true;
                                                var13 = var13.substring(2);
                                            }
                                            if (~var13.length() <= -5 && class242.method1599(var13.substring(0, 4), 59)) {
                                                var8 = class56.method521(var13.substring(0, 4), 10);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var9 || ~var8 > -4001) {
                                this.field5339 = false;
                            }
                            if (!var10 && !var9) {
                                if (var8 >= 7000 && var8 <= 7999) {
                                    this.field5388 = false;
                                }
                                if (var8 >= 7000 && ~var8 >= -9251) {
                                    this.field5432 = false;
                                }
                            }
                            this.field5408 &= this.field5123.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field5410 = this.field5388;
                        }
                        if (~this.field5383.indexOf("intel") != 0) {
                            this.field5328 = false;
                        }
                        this.field5347 = !this.field5383.equals("s3 graphics");
                        if (this.field5388) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class281.method1798(false, false, true);
                        this.field5303 = true;
                        this.field5298 = new class476(this, super.field425);
                        this.method2247((byte) 127);
                        this.field5308 = new class368(this);
                        this.field5294 = new class216(this);
                        if (this.field5294.method1481(0)) {
                            this.field5300 = new class460(this);
                            if (!this.field5300.method2761(true)) {
                                this.field5300.method813((byte) -71);
                                this.field5300 = null;
                            }
                        }
                        this.field5295 = new class244(this);
                        this.method2252(128);
                        this.method2192((byte) -128);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field5123.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (~(var15++) < -6) {
                                    throw new RuntimeException("");
                                }
                                class213.method1462(100L, -5184);
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
            this.method292();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lpc;ILpc;Lpc;Lpc;)V")
    public final void method2217(class473 arg0, int arg1, class473 arg2, class473 arg3, class473 arg4) {
        if (arg4 != null) {
            this.method2227(arg4.field6975, -121);
            OpenGL.glVertexPointer(arg4.field6979, arg4.field6980, this.field5393.method238(true), this.field5393.method239(12786) + (long) arg4.field6976);
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        ++field5114;
        if (arg2 != null) {
            this.method2227(arg2.field6975, -118);
            OpenGL.glNormalPointer(arg2.field6980, this.field5393.method238(true), this.field5393.method239(12786) + (long) arg2.field6976);
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg1 > 113) {
            if (arg0 != null) {
                this.method2227(arg0.field6975, -106);
                OpenGL.glColorPointer(arg0.field6979, arg0.field6980, this.field5393.method238(true), this.field5393.method239(12786) + (long) arg0.field6976);
                OpenGL.glEnableClientState(32886);
            } else {
                OpenGL.glDisableClientState(32886);
            }
            if (arg3 == null) {
                OpenGL.glDisableClientState(32888);
            } else {
                this.method2227(arg3.field6975, -126);
                OpenGL.glTexCoordPointer(arg3.field6979, arg3.field6980, this.field5393.method238(true), this.field5393.method239(12786) - -((long) arg3.field6976));
                OpenGL.glEnableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[Lvp;)V")
    public final void method291(int arg0, class124[] arg1) {
        ++field5272;
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field5363[var3] = arg1[var3];
        }
        this.field5350 = arg0;
        if (this.field5444 != 1) {
            this.method2186(true);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZLcp;)V")
    public final void method2218(boolean arg0, class508 arg1) {
        ++field5252;
        if (this.field5315 >= 0 && this.field5316[this.field5315] == arg1) {
            this.field5316[this.field5315--] = null;
            if (!arg0) {
                arg1.method1701(-53);
                if (this.field5315 >= 0) {
                    this.field5314 = this.field5316[this.field5315];
                    this.field5314.method1700((byte) 45);
                } else {
                    this.field5314 = null;
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lu;)V")
    public final void method299(class53 arg0) {
        ++field5286;
        this.field5305 = ((class423) arg0).field6246;
        if (this.field5376 == null) {
            class67 var2 = new class67(80);
            if (this.field5443) {
                var2.method655(-1.0F, (byte) 98);
                var2.method655(-1.0F, (byte) 98);
                var2.method655(0.0F, (byte) 98);
                var2.method655(0.0F, (byte) 98);
                var2.method655(1.0F, (byte) 98);
                var2.method655(1.0F, (byte) 98);
                var2.method655(-1.0F, (byte) 98);
                var2.method655(0.0F, (byte) 98);
                var2.method655(1.0F, (byte) 98);
                var2.method655(1.0F, (byte) 98);
                var2.method655(1.0F, (byte) 98);
                var2.method655(1.0F, (byte) 98);
                var2.method655(0.0F, (byte) 98);
                var2.method655(1.0F, (byte) 98);
                var2.method655(0.0F, (byte) 98);
                var2.method655(-1.0F, (byte) 98);
                var2.method655(1.0F, (byte) 98);
                var2.method655(0.0F, (byte) 98);
                var2.method655(0.0F, (byte) 98);
                var2.method655(0.0F, (byte) 98);
            } else {
                var2.method651(-1.0F, 1739667504);
                var2.method651(-1.0F, 1739667504);
                var2.method651(0.0F, 1739667504);
                var2.method651(0.0F, 1739667504);
                var2.method651(1.0F, 1739667504);
                var2.method651(1.0F, 1739667504);
                var2.method651(-1.0F, 1739667504);
                var2.method651(0.0F, 1739667504);
                var2.method651(1.0F, 1739667504);
                var2.method651(1.0F, 1739667504);
                var2.method651(1.0F, 1739667504);
                var2.method651(1.0F, 1739667504);
                var2.method651(0.0F, 1739667504);
                var2.method651(1.0F, 1739667504);
                var2.method651(0.0F, 1739667504);
                var2.method651(-1.0F, 1739667504);
                var2.method651(1.0F, 1739667504);
                var2.method651(0.0F, 1739667504);
                var2.method651(0.0F, 1739667504);
                var2.method651(0.0F, 1739667504);
            }
            this.field5376 = this.method2243(0, var2.field827, var2.field783, false, 20);
            this.field5377 = new class473(this.field5376, 5126, 3, 0);
            this.field5370 = new class473(this.field5376, 5126, 2, 12);
            this.field5297.method3039((byte) 6, this);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "()I")
    public final int method383() {
        ++field5169;
        return this.field5344;
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(II)V")
    public final void method2219(int arg0, int arg1) {
        if (arg1 > -117) {
            this.field5347 = false;
        }
        if (this.field5385 != arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field5385 = arg0;
        }
        ++field5166;
    }

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "()V")
    public final void method328() {
        this.field5331 = false;
        ++field5137;
        this.field5295.method1603(-116, false, false, 0);
        this.method2242((byte) 93);
        this.method2251(true);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(FB)V")
    public final void method2220(float arg0, byte arg1) {
        if (this.field5381 != arg0) {
            this.field5381 = arg0;
            if (this.field5444 == 3) {
                this.method2216(-16933);
            }
        }
        if (arg1 > 94) {
            ++field5146;
        }
    }

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "()Lc;")
    public final class122 method362() {
        ++field5255;
        return this.field5301;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZIZ)V")
    public final void method2221(boolean arg0, int arg1, boolean arg2) {
        ++field5172;
        this.method2209(arg2, (byte) 12, arg1, arg0);
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(III)V")
    public final synchronized void method2222(int arg0, int arg1, int arg2) {
        ++field5193;
        if (arg2 < -17) {
            class389 var4 = new class389(arg1);
            var4.field3271 = (long) arg0;
            this.field5322.method1015(false, var4);
        }
    }

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "()Z")
    public final boolean method326() {
        ++field5161;
        return false;
    }

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "()Lc;")
    public final class122 method341() {
        ++field5285;
        return new class231();
    }

    @OriginalMember(owner = "client!fd", name = "OA", descriptor = "(IIII)V")
    public final void method380(int arg0, int arg1, int arg2, int arg3) {
        ++field5157;
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (~arg3 < ~this.field5153) {
            arg3 = this.field5153;
        }
        if (~arg2 < ~this.field5259) {
            arg2 = this.field5259;
        }
        this.field5424 = arg0;
        this.field5437 = arg1;
        this.field5354 = arg2;
        this.field5365 = arg3;
        OpenGL.glEnable(3089);
        this.method2236(true);
        this.method2198((byte) -123);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLcp;)V")
    public final void method2223(byte arg0, class508 arg1) {
        ++field5103;
        if (~this.field5315 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field5315 >= 0) {
                this.field5316[this.field5315].method1701(-63);
            }
            if (arg0 == 79) {
                this.field5314 = this.field5316[++this.field5315] = arg1;
                this.field5314.method1700((byte) 45);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(ZI)V")
    public final synchronized void method2224(boolean arg0, int arg1) {
        if (arg0) {
            ++field5247;
            class389 var3 = new class389(arg1);
            this.field5324.method1015(!arg0, var3);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ltu;I)V")
    public final void method2225(class231 arg0, int arg1) {
        OpenGL.glLoadMatrixf(arg0.method1553(0), 0);
        int var3 = -126 / ((arg1 - -67) / 40);
        ++field5204;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFI)V")
    public final void method2226(float arg0, float arg1, int arg2) {
        this.field5332 = arg1;
        this.field5407 = arg0;
        ++field5227;
        if (arg2 == 27060) {
            if (!this.field5331) {
                this.method2242((byte) 70);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "()Z")
    public final boolean method300() {
        ++field5163;
        return true;
    }

    @OriginalMember(owner = "client!fd", name = "ZA", descriptor = "()I")
    public final int method342() {
        ++field5171;
        int var1 = this.field5419;
        this.field5419 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!fd", name = "da", descriptor = "([I)V")
    public final void method332(int[] arg0) {
        arg0[3] = this.field5365;
        arg0[2] = this.field5354;
        arg0[0] = this.field5424;
        arg0[1] = this.field5437;
        ++field5179;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lvd;I)V")
    public final void method2227(class30 arg0, int arg1) {
        if (arg1 >= -96) {
            this.field5438 = null;
        }
        ++field5168;
        if (this.field5393 != arg0) {
            if (this.field5388) {
                OpenGL.glBindBufferARB(34962, arg0.method237(60));
            }
            this.field5393 = arg0;
        }
    }

    @OriginalMember(owner = "client!fd", name = "xa", descriptor = "()F")
    public final float method361() {
        ++field5133;
        return this.field5387;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BIII)V")
    public final void method2228(byte arg0, int arg1, int arg2, int arg3) {
        ++field5240;
        OpenGL.glTexEnvi(8960, arg1 + 34176, arg3);
        OpenGL.glTexEnvi(8960, arg1 + 34192, arg2);
        if (arg0 != 79) {
            this.method2221(false, 66, true);
        }
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(B)Lim;")
    public final class401 method2229(byte arg0) {
        ++field5223;
        if (arg0 < 8) {
            this.field5322 = null;
        }
        return this.field5448 != null ? this.field5448.method1708(2) : null;
    }

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "(I)V")
    public static void method2230(int arg0) {
        field5281 = null;
        field5291 = null;
        if (arg0 != 1) {
            method2255(-83, 57, -113, -74);
        }
        field5216 = null;
        field5261 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ltb;)V")
    public final void method359(class274 arg0) {
        ++field5197;
        this.field5448 = (class265) arg0;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIZ)Ll;")
    public final class16 method349(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5180;
        return new class81(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILtu;)V")
    public final void method2231(int arg0, class231 arg1) {
        OpenGL.glPushMatrix();
        ++field5267;
        OpenGL.glMultMatrixf(arg1.method1553(0), arg0);
    }

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "()Z")
    public final boolean method311() {
        ++field5245;
        return true;
    }

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "()I")
    public final int method327() {
        ++field5219;
        int var1 = this.field5396;
        this.field5396 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Lcp;B)V")
    public final void method2232(class508 arg0, byte arg1) {
        ++field5270;
        if (~this.field5313 <= -1 && this.field5310[this.field5313] == arg0) {
            this.field5310[this.field5313--] = null;
            if (arg1 == -45) {
                arg0.method1706(14);
                if (this.field5313 < 0) {
                    this.field5311 = null;
                } else {
                    this.field5311 = this.field5310[this.field5313];
                    this.field5311.method1703(arg1 + -20696);
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "(I)V")
    private final void method2233(int arg0) {
        OpenGL.glViewport(this.field5415, this.field5330, this.field5259, this.field5153);
        ++field5190;
        if (arg0 != 1) {
            this.field5437 = 94;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZB)V")
    public final void method2234(boolean arg0, byte arg1) {
        ++field5110;
        if (arg1 <= 55) {
            this.field5401 = null;
        }
        if (this.field5382 == !arg0) {
            if (arg0) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field5447 &= -32;
            this.field5382 = arg0;
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "()V")
    public final void method292() {
        for (class223 var1 = this.field5309.method1018(73); var1 != null; var1 = this.field5309.method1022((byte) -112)) {
            ((class423) var1).method2591(1);
        }
        ++field5111;
        if (this.field5294 != null) {
            this.field5294.method1474(26187);
        }
        if (this.field5123 != null) {
            this.method2204(true);
            Enumeration var2 = this.field5260.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field5260.get(var3);
                this.field5123.releaseSurface(var3, var4);
            }
            this.field5123.release();
            this.field5123 = null;
        }
        if (this.field5303) {
            class176.method1236(false, 478210754, true);
            this.field5303 = false;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIII)V")
    public final void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5132;
        OpenGL.glLineWidth((float) arg5);
        this.method379(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([Lt;Lmc;Lc;[Lmi;I)V")
    public final void method376(class471[] arg0, class88 arg1, class122 arg2, class341[] arg3, int arg4) {
        this.method388(arg0, arg2, arg3, arg4);
        ++field5221;
        this.method345(arg1);
    }

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "()V")
    public final void method302() {
        ++field5158;
        try {
            this.field5123.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!fd", name = "GA", descriptor = "(IIII)V")
    public final void method352(int arg0, int arg1, int arg2, int arg3) {
        ++field5207;
        if (!this.field5331) {
            throw new RuntimeException("");
        } else {
            this.field5340 = arg0;
            this.field5435 = arg2;
            this.field5337 = arg1;
            this.field5359 = arg3;
            this.field5295.field3596.method2093((byte) -41);
            this.method2242((byte) -117);
        }
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
    public final void method340(int arg0) {
        ++field5279;
        this.method2179(68);
    }

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "(I)V")
    private final void method2235(int arg0) {
        ++field5150;
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field5400.method1553(0), arg0);
        if (this.field5331) {
            this.field5295.field3596.method2093((byte) -41);
        }
        this.method2197((byte) 66);
        this.method2186(true);
    }

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "(Z)V")
    private final void method2236(boolean arg0) {
        this.field5389 = (float) (-this.field5367 + this.field5365);
        ++field5159;
        this.field5357 = (float) (-this.field5367 + this.field5437);
        if (!arg0) {
            this.field5295 = null;
        }
        this.field5372 = (float) (-this.field5362 + this.field5354);
        this.field5434 = (float) (-this.field5362 + this.field5424);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZIII)V")
    public final void method2237(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            OpenGL.glTexEnvi(8960, arg3 + 34184, arg2);
            ++field5239;
            OpenGL.glTexEnvi(8960, arg3 + 34200, arg1);
        }
    }

    @OriginalMember(owner = "client!fd", name = "IA", descriptor = "()I")
    public final int method320() {
        ++field5277;
        return this.field5321 + this.field5318 + this.field5320;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)I")
    public final int method335(int arg0, int arg1) {
        ++field5136;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!fd", name = "ia", descriptor = "(II)V")
    public final void method346(int arg0, int arg1) {
        if (this.field5344 != arg0 || ~this.field5422 != ~arg1) {
            this.field5344 = arg0;
            this.field5422 = arg1;
            this.method2206((byte) -119);
            this.method2242((byte) 59);
            if (~this.field5444 == -4) {
                this.method2216(-16933);
            } else if (~this.field5444 == -3) {
                this.method2190(107);
            }
        }
        ++field5202;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZ[BI)Lbk;")
    public final class254 method2238(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        ++field5183;
        if (!this.field5388 || arg2 && !this.field5410) {
            if (arg0 < 96) {
                this.method352(81, 32, -65, 64);
            }
            return new class194(this, arg4, arg3, arg1);
        } else {
            return new class350(this, arg4, arg3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "()V")
    public final void method350() {
        ++field5152;
        if (this.field5347 && ~this.field5259 < -1 && this.field5153 > 0) {
            int var1 = this.field5424;
            int var2 = this.field5354;
            int var3 = this.field5437;
            int var4 = this.field5365;
            this.method339();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2181(true);
            this.method2201(false, 0);
            this.method2189(false, -108);
            this.method2234(false, (byte) 96);
            this.method2194(-32, false);
            this.method2188((byte) 78, (class396) null);
            this.method2240(false, -2);
            this.method2183(7681, 1);
            this.method2241(-86, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field5259, this.field5153, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method380(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFF)V")
    public final void method317(float arg0, float arg1, float arg2) {
        class106.field1483 = arg1;
        class20.field230 = arg0;
        ++field5212;
        class39.field453 = arg2;
    }

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "(I)V")
    public final void method387(int arg0) {
        ++field5182;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field5292 = arg0;
            this.field5298.method2879(4);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "()Z")
    public final boolean method297() {
        ++field5278;
        return true;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(Lcp;B)V")
    public final void method2239(class508 arg0, byte arg1) {
        ++field5274;
        if (this.field5313 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field5313 <= -1) {
                this.field5310[this.field5313].method1706(arg1 ^ 53);
            }
            this.field5311 = this.field5310[++this.field5313] = arg0;
            if (arg1 != 54) {
                this.field5380 = -0.41347545F;
            }
            this.field5311.method1703(-20741);
        }
    }

    @OriginalMember(owner = "client!fd", name = "YA", descriptor = "()I")
    public final int method309() {
        ++field5289;
        return this.field5422;
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(IIIIII)V")
    public final void method397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5147;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method2260((byte) 127);
        this.method2241(124, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5342) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5342) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(IIIIII)V")
    public final void method379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2260((byte) -82);
        ++field5186;
        this.method2241(103, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(ZI)V")
    public final void method2240(boolean arg0, int arg1) {
        ++field5185;
        this.method2221(true, arg1, true);
        if (arg0) {
            this.method376((class471[]) null, (class88) null, (class122) null, (class341[]) null, 23);
        }
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(II)V")
    public final void method2241(int arg0, int arg1) {
        ++field5100;
        if (this.field5397 != arg1) {
            byte var3;
            boolean var4;
            boolean var5;
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 128) {
                        var3 = 0;
                        var4 = false;
                        var5 = true;
                    } else {
                        var3 = 3;
                        var4 = true;
                        var5 = true;
                    }
                } else {
                    var4 = false;
                    var3 = 2;
                    var5 = true;
                }
            } else {
                var4 = true;
                var3 = 1;
                var5 = true;
            }
            if (this.field5345 != var5) {
                OpenGL.glColorMask(var5, var5, var5, true);
                this.field5345 = var5;
            }
            if (!var4 == this.field5445) {
                if (var4) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field5445 = var4;
            }
            if (this.field5431 != var3) {
                if (var3 == 1) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (~var3 != -3) {
                    if (~var3 != -4) {
                        OpenGL.glDisable(3042);
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                }
                this.field5431 = var3;
            }
            this.field5447 &= -29;
            this.field5397 = arg1;
        }
        int var6 = 8 % ((32 - arg0) / 60);
    }

    @OriginalMember(owner = "client!fd", name = "ca", descriptor = "(ILma;II)V")
    public final void method358(int arg0, class10 arg1, int arg2, int arg3) {
        ++field5234;
        class95 var5 = (class95) arg1;
        class63 var6 = var5.field1285;
        this.method2213(false);
        this.method2188((byte) 78, var5.field1285);
        this.method2241(-62, 1);
        this.method2195(7681, 8448, true);
        this.method2228((byte) 79, 0, 768, 34167);
        float var7 = var6.field749 / (float) var6.field743;
        float var8 = var6.field746 / (float) var6.field748;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5424) * var7, (float) (-arg3 + this.field5437) * var8);
        OpenGL.glVertex2i(this.field5424, this.field5437);
        OpenGL.glTexCoord2f((float) (this.field5424 - arg2) * var7, (float) (-arg3 + this.field5365) * var8);
        OpenGL.glVertex2i(this.field5424, this.field5365);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5354) * var7, (float) (-arg3 + this.field5365) * var8);
        OpenGL.glVertex2i(this.field5354, this.field5365);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5354) * var7, (float) (-arg3 + this.field5437) * var8);
        OpenGL.glVertex2i(this.field5354, this.field5437);
        OpenGL.glEnd();
        this.method2228((byte) 79, 0, 768, 5890);
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(B)V")
    private final void method2242(byte arg0) {
        ++field5156;
        int var2 = 7 % ((arg0 - -57) / 50);
        int var3;
        if (this.field5331) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var3 = this.field5337;
        } else {
            this.field5439 = (float) (-this.field5329 + this.field5422) + -this.field5332;
            this.field5348 = -((float) this.field5428 * this.field5407) + this.field5439;
            if ((float) this.field5344 > this.field5348) {
                this.field5348 = (float) this.field5344;
            }
            OpenGL.glFogf(2915, this.field5348);
            OpenGL.glFogf(2916, this.field5439);
            var3 = this.field5392;
        }
        class402.field5968[1] = (float) class345.method2089(var3, 65280) / 65280.0F;
        class402.field5968[0] = (float) class345.method2089(var3, 16711680) / 1.671168E7F;
        class402.field5968[2] = (float) class345.method2089(var3, 255) / 255.0F;
        OpenGL.glFogfv(2918, class402.field5968, 0);
        if (this.field5331) {
            this.field5295.field3596.method2092(126);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[BZI)Lvd;")
    public final class30 method2243(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        ++field5124;
        if (arg0 != 0) {
            return null;
        } else {
            return (class30) (!this.field5388 || arg3 && !this.field5410 ? new class252(this, arg4, arg2, arg1) : new class155(this, arg4, arg2, arg1, arg3));
        }
    }

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "(Z)V")
    private final void method2244(boolean arg0) {
        ++field5235;
        class402.field5968[2] = this.field5418 * this.field5399;
        class402.field5968[1] = this.field5399 * this.field5338;
        class402.field5968[3] = 1.0F;
        class402.field5968[0] = this.field5412 * this.field5399;
        OpenGL.glLightModelfv(2899, class402.field5968, 0);
        if (!arg0) {
            this.field5325 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "(II)I")
    public final int method2245(int arg0, int arg1) {
        ++field5287;
        if (arg0 == arg1) {
            return 7681;
        } else if (arg1 != 0) {
            if (arg1 != 2) {
                if (~arg1 != -4) {
                    if (~arg1 == -5) {
                        return 34023;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    return 260;
                }
            } else {
                return 34165;
            }
        } else {
            return 8448;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([Lt;Lc;[Lmi;I)V")
    public final void method388(class471[] arg0, class122 arg1, class341[] arg2, int arg3) {
        ++field5215;
        for (int var5 = 0; ~var5 > ~arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method457(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lgt;[Lbb;Z)Lla;")
    public final class314 method343(class316 arg0, class218[] arg1, boolean arg2) {
        ++field5138;
        return new class514(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "()V")
    public final void method289() {
        ++field5229;
        if (this.field5300 != null && this.field5300.method810((byte) 121)) {
            this.field5294.method1479(-108, this.field5300);
            this.field5298.method2879(4);
        }
    }

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "(F)V")
    public final void method293(float arg0) {
        ++field5231;
        if (this.field5399 != arg0) {
            this.field5399 = arg0;
            this.method2244(true);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method304(Canvas arg0) {
        ++field5199;
        if (this.field5178 == arg0) {
            throw new RuntimeException();
        } else if (!this.field5260.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field5123.prepareSurface(arg0);
                if (var4 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field5260.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BFFF)V")
    private final void method2246(byte arg0, float arg1, float arg2, float arg3) {
        if (arg0 != -62) {
            this.field5354 = 61;
        }
        ++field5135;
        OpenGL.glMatrixMode(5890);
        if (this.field5390) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg2, arg1, arg3);
        OpenGL.glMatrixMode(5888);
        this.field5390 = true;
    }

    @OriginalMember(owner = "client!fd", name = "UA", descriptor = "(III)V")
    public final void method368(int arg0, int arg1, int arg2) {
        if (~this.field5392 != ~arg0 || this.field5428 != arg1 || this.field5329 != arg2) {
            this.field5329 = arg2;
            this.field5392 = arg0;
            this.field5428 = arg1;
            if (!this.field5331) {
                this.method2242((byte) 45);
                this.method2251(true);
            }
        }
        ++field5251;
    }

    @OriginalMember(owner = "client!fd", name = "DA", descriptor = "(IIIIII[BII)V")
    public final void method373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field5149;
        float var10;
        float var11;
        if (this.field5375 != null && ~this.field5375.field4296 <= ~arg2 && this.field5375.field4288 >= arg3) {
            this.field5375.method1877(arg2, 0, arg6, arg3, 6406, 0, 0, 0, false, 66);
            var10 = (float) arg2 * this.field5375.field749 / (float) this.field5375.field4296;
            var11 = (float) arg3 * this.field5375.field746 / (float) this.field5375.field4288;
        } else {
            this.field5375 = class482.method2907(false, (byte) -116, arg6, this, arg2, arg3, 6406, 6406);
            this.field5375.method1882(10497, false, false);
            var11 = this.field5375.field746;
            var10 = this.field5375.field749;
        }
        this.method2213(false);
        this.method2188((byte) 78, this.field5375);
        this.method2241(117, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2184((byte) -100, arg5);
        this.method2195(34165, 34165, true);
        this.method2228((byte) 79, 0, 768, 34166);
        this.method2228((byte) 79, 2, 770, 5890);
        this.method2237(true, 770, 34166, 0);
        this.method2237(true, 770, 5890, 2);
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
        this.method2228((byte) 79, 0, 768, 5890);
        this.method2228((byte) 79, 2, 770, 34166);
        this.method2237(true, 770, 5890, 0);
        this.method2237(true, 770, 34166, 2);
    }

    @OriginalMember(owner = "client!fd", name = "MA", descriptor = "(I)V")
    public final void method360(int arg0) {
        this.field5307 = 0;
        ++field5119;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field5307;
        }
        this.field5304 = 1 << this.field5307;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIF)Lvp;")
    public final class124 method392(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field5222;
        return new class94(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!fd", name = "TA", descriptor = "(IIIII)V")
    public final void method310(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5282;
        this.method2260((byte) 125);
        this.method2241(-35, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "(B)V")
    private final void method2247(byte arg0) {
        this.field5400 = new class231();
        ++field5243;
        this.field5394 = new class231();
        this.field5416 = new class396[this.field5405];
        this.field5421 = new class299(this, 3553, 6408, 1, 1);
        this.field5366 = new class299(this, 3553, 6408, 1, 1);
        this.field5356 = new class299(this, 3553, 6408, 1, 1);
        this.field5404 = new class497(this);
        this.field5358 = new class497(this);
        this.field5423 = new class497(this);
        this.field5346 = new class497(this);
        this.field5413 = new class497(this);
        this.field5334 = new class497(this);
        this.field5401 = new class497(this);
        if (arg0 <= 94) {
            this.field5448 = null;
        }
        this.field5438 = new class497(this);
        this.field5402 = new class497(this);
        this.field5364 = new class497(this);
        if (this.field5328) {
            this.field5429 = new class264(this);
            this.field5391 = new class264(this);
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIIII)V")
    public final void method391(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2260((byte) -29);
        ++field5139;
        this.method2241(-44, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "(B)V")
    public final void method2248(byte arg0) {
        if (arg0 != 126) {
            this.field5375 = null;
        }
        ++field5218;
        OpenGL.glPushMatrix();
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZZ)V")
    public final void method2249(boolean arg0, boolean arg1) {
        if (!arg1) {
            if (!this.field5379 == arg0) {
                this.field5379 = arg0;
                this.method2202(0);
            }
            ++field5143;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIILbk;B)V")
    public final void method2250(int arg0, int arg1, int arg2, class254 arg3, byte arg4) {
        if (arg4 != -95) {
            this.method345((class88) null);
        }
        ++field5257;
        int var6 = arg3.method1360((byte) -126);
        int var7 = arg0 * this.method2180(var6, 127);
        this.method2253(-21, arg3);
        OpenGL.glDrawElements(arg2, arg1, var6, (long) var7 + arg3.method1363((byte) -122));
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(Z)V")
    public final void method390(boolean arg0) {
        this.field5430 = arg0;
        ++field5187;
        this.method2259(0);
    }

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "(Z)V")
    private final void method2251(boolean arg0) {
        ++field5112;
        if (this.field5352 && this.field5428 >= 0 | this.field5331) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (!arg0) {
            this.field5351 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "JA", descriptor = "(IIIIII)Z")
    public final boolean method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5173;
        float var7 = (float) arg2 * this.field5400.field3377 + (float) arg0 * this.field5400.field3400 + (float) arg1 * this.field5400.field3392 + this.field5400.field3376;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field5400.field3377 + (float) arg3 * this.field5400.field3400 + (float) arg4 * this.field5400.field3392 + this.field5400.field3376;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field5344 > var7) || !((float) this.field5344 > var8)) && (!(var7 > (float) this.field5422) || !(var8 > (float) this.field5422))) {
            int var9 = (int) (((float) arg2 * this.field5400.field3402 + (float) arg0 * this.field5400.field3386 + (float) arg1 * this.field5400.field3401 + this.field5400.field3407) * (float) this.field5417 / var7);
            int var10 = (int) (((float) arg5 * this.field5400.field3402 + (float) arg3 * this.field5400.field3386 + (float) arg4 * this.field5400.field3401 + this.field5400.field3407) * (float) this.field5417 / var8);
            if ((float) var9 < this.field5434 && (float) var10 < this.field5434 || this.field5372 < (float) var9 && this.field5372 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field5400.field3381 + (float) arg0 * this.field5400.field3378 + (float) arg1 * this.field5400.field3396 + this.field5400.field3399) * (float) this.field5360 / var7);
                int var12 = (int) (((float) arg5 * this.field5400.field3381 + (float) arg3 * this.field5400.field3378 + (float) arg4 * this.field5400.field3396 + this.field5400.field3399) * (float) this.field5360 / var8);
                return (!((float) var11 < this.field5357) || !(this.field5357 > (float) var12)) && (!((float) var11 > this.field5389) || !((float) var12 > this.field5389));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "(I)V")
    private final void method2252(int arg0) {
        this.method2240(false, -2);
        ++field5195;
        for (int var2 = this.field5405 + -1; var2 >= 0; --var2) {
            this.method2219(var2, -120);
            this.method2188((byte) 78, (class396) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2195(8448, 8448, true);
        this.method2228((byte) 79, 2, 770, 34168);
        this.method2200(0);
        this.field5397 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field5431 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field5445 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field5345 = true;
        this.method2201(true, 0);
        this.method2189(true, arg0 ^ 248);
        this.method2234(true, (byte) 79);
        this.method2194(-32, true);
        this.method2181(true);
        this.field5123.setSwapInterval(0);
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
        if (arg0 != 128) {
            this.field5404 = null;
        }
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field5336 = this.field5392 = -1;
        this.method339();
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILbk;)V")
    public final void method2253(int arg0, class254 arg1) {
        if (this.field5351 != arg1) {
            if (this.field5388) {
                OpenGL.glBindBufferARB(34963, arg1.method1358(-2584));
            }
            this.field5351 = arg1;
        }
        ++field5167;
        if (arg0 > -13) {
            this.method330((int[]) null, 88, 58, 83, -10);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5214;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lmc;)V")
    public final void method345(class88 arg0) {
        this.field5297.method3038((byte) -9, arg0, this);
        ++field5164;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lcp;I)V")
    public final void method2254(class508 arg0, int arg1) {
        int var3 = -38 / ((arg1 - -48) / 36);
        ++field5254;
        if (!this.field5386) {
            if (this.field5312 >= 0 && this.field5317[this.field5312] == arg0) {
                this.field5317[this.field5312--] = null;
                arg0.method1694(-123);
                if (this.field5312 >= 0) {
                    this.field5314 = this.field5311 = this.field5317[this.field5312];
                    this.field5314.method1697((byte) 84);
                } else {
                    this.field5314 = this.field5311 = null;
                }
            } else {
                throw new RuntimeException();
            }
        } else {
            this.method2218(false, arg0);
            this.method2232(arg0, (byte) -45);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([IIIII)Ll;")
    public final class16 method330(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5160;
        return new class81(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "(IIII)[I")
    public final int[] method393(int arg0, int arg1, int arg2, int arg3) {
        ++field5122;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; arg3 > var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + this.field5153 + -arg1, arg2, 1, 32993, this.field5411, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lbb;Z)Ll;")
    public final class16 method389(class218 arg0, boolean arg1) {
        ++field5271;
        int[] var3 = new int[arg0.field3140 * arg0.field3139];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field3145 == null) {
            for (int var6 = 0; ~var6 > ~arg0.field3139; ++var6) {
                for (int var7 = 0; arg0.field3140 > var7; ++var7) {
                    int var8 = arg0.field3144[arg0.field3141[var4++] & 255];
                    var3[var5++] = ~var8 == -1 ? 0 : class244.method1606(var8, -16777216);
                }
            }
        } else {
            for (int var9 = 0; ~arg0.field3139 < ~var9; ++var9) {
                for (int var11 = 0; arg0.field3140 > var11; ++var11) {
                    var3[var5++] = class244.method1606(arg0.field3145[var4] << 24, arg0.field3144[class345.method2089(255, arg0.field3141[var4])]);
                    ++var4;
                }
            }
        }
        class16 var10 = this.method330(var3, 0, arg0.field3140, arg0.field3140, arg0.field3139);
        var10.method113(arg0.field3142, arg0.field3146, arg0.field3143, arg0.field3147);
        return var10;
    }

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "()Z")
    public final boolean method318() {
        ++field5269;
        return true;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(IIII)I")
    public static final int method2255(int arg0, int arg1, int arg2, int arg3) {
        ++field5145;
        int var4 = arg3 / arg1;
        int var5 = arg1 + -1 & arg3;
        int var6 = arg2 / arg1;
        int var7 = arg2 & arg1 + -1;
        int var8 = class334.method2039(-35, var4, var6);
        int var9 = class334.method2039(-64, var4 + 1, var6);
        int var10 = class334.method2039(63, var4, var6 + 1);
        int var11 = class334.method2039(-125, var4 + 1, var6 + 1);
        int var12 = class344.method2080(var5, arg1, var8, var9, (byte) -79);
        int var13 = class344.method2080(var5, arg1, var10, var11, (byte) -79);
        if (arg0 >= -60) {
            field5261 = null;
        }
        return class344.method2080(var7, arg1, var12, var13, (byte) -79);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IJ)V")
    public final synchronized void method2256(int arg0, long arg1) {
        ++field5170;
        class223 var4 = new class223();
        var4.field3271 = arg1;
        this.field5327.method1015(false, var4);
        if (arg0 != -34844) {
            this.field5300 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "(IIII)V")
    public final void method394(int arg0, int arg1, int arg2, int arg3) {
        this.field5360 = arg3;
        this.field5367 = arg1;
        this.field5417 = arg2;
        ++field5155;
        this.field5362 = arg0;
        this.method2206((byte) -91);
        this.method2236(true);
        if (~this.field5444 == -4) {
            this.method2216(-16933);
        } else if (this.field5444 == 2) {
            this.method2190(111);
        }
    }

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "()Z")
    public final boolean method312() {
        ++field5262;
        return this.field5300 != null && (~this.field5299 >= -2 || this.field5374);
    }

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "(I)I")
    private final int method2257(int arg0) {
        ++field5236;
        int var2 = arg0;
        this.field5383 = OpenGL.glGetString(7936).toLowerCase();
        this.field5409 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field5383.indexOf("microsoft") != 0) {
            var2 = arg0 | 1;
        }
        if (this.field5383.indexOf("brian paul") != -1 || ~this.field5383.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class92.method817((byte) 5, var3.replace('.', ' '), ' ');
        if (var4.length < 2) {
            var2 |= 4;
        } else {
            try {
                int var5 = class56.method521(var4[0], 10);
                int var6 = class56.method521(var4[1], 10);
                this.field5384 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (this.field5384 < 12) {
            var2 |= 2;
        }
        if (!this.field5123.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field5123.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field5405 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field5373 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field5335 = var7[0];
        if (~this.field5405 > -3 || ~this.field5373 > -3 || this.field5335 < 2) {
            var2 |= 16;
        }
        this.field5443 = NativeStream.method2676();
        this.field5123.arePbuffersAvailable();
        this.field5388 = this.field5123.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field5342 = this.field5123.isExtensionAvailable("GL_ARB_multisample");
        this.field5361 = this.field5123.isExtensionAvailable("GL_ARB_vertex_program");
        this.field5123.isExtensionAvailable("GL_ARB_fragment_program");
        this.field5446 = this.field5123.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field5442 = this.field5123.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field5432 = this.field5123.isExtensionAvailable("GL_EXT_texture3D");
        this.field5408 = this.field5123.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field5368 = this.field5123.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field5339 = this.field5123.isExtensionAvailable("GL_ARB_texture_float");
        this.field5436 = false;
        this.field5328 = this.field5123.isExtensionAvailable("GL_EXT_framebuffer_object");
        this.field5386 = this.field5123.isExtensionAvailable("GL_EXT_framebuffer_blit");
        this.field5426 = this.field5123.isExtensionAvailable("GL_EXT_framebuffer_multisample");
        this.field5374 = this.field5426 & this.field5386;
        return var2 == 0 ? 0 : var2;
    }

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "()V")
    public final void method331() {
        ++field5238;
        this.method2194(-32, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "(I)V")
    private final void method2258(int arg0) {
        if ((float) arg0 == this.field5387) {
            this.field5343[10] = this.field5395;
            this.field5343[14] = this.field5349;
        } else {
            float var2 = this.field5371 / (this.field5387 + this.field5371);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field5349 * (1.0F - var2) / this.field5387;
            this.field5343[14] = this.field5349 * var3;
            this.field5343[10] = this.field5395 + var4;
        }
        ++field5275;
        this.field5440 = (float) this.field5422 + -this.field5387;
        this.field5353 = (this.field5343[14] - (float) this.field5422) / this.field5343[10];
    }

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "()Z")
    public final boolean method364() {
        ++field5258;
        return false;
    }

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "()Z")
    public final boolean method378() {
        ++field5189;
        return this.field5300 != null && this.field5300.method810((byte) 125);
    }

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "(I)V")
    public final void method381(int arg0) {
        ++field5248;
        this.method2241(-47, 0);
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "(I)V")
    private final void method2259(int arg0) {
        OpenGL.glDepthMask(this.field5369 && this.field5430);
        ++field5217;
        if (arg0 != 0) {
            this.field5260 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "(B)V")
    private final void method2260(byte arg0) {
        ++field5249;
        if (~this.field5447 != -2) {
            this.method2215(1);
            this.method2201(false, 0);
            this.method2189(false, 68);
            this.method2234(false, (byte) 63);
            this.method2194(-32, false);
            this.method2188((byte) 78, (class396) null);
            this.method2240(false, -2);
            this.method2183(7681, 1);
            this.field5447 = 1;
        }
        int var2 = 6 / ((arg0 - 82) / 43);
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "(FF)V")
    public final void method319(float arg0, float arg1) {
        ++field5128;
        if (this.field5371 != arg0 || this.field5387 != arg1) {
            this.field5371 = arg0;
            this.field5387 = arg1;
            this.method2258(0);
            if (~this.field5444 == -4) {
                this.method2216(-16933);
                return;
            }
            if (~this.field5444 != -3) {
                return;
            }
            this.method2190(105);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBI)V")
    public final synchronized void method2261(int arg0, byte arg1, int arg2) {
        ++field5228;
        class389 var4 = new class389(arg2);
        var4.field3271 = (long) arg0;
        if (arg1 <= 107) {
            this.field5418 = 1.509716F;
        }
        this.field5323.method1015(false, var4);
    }
}
