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

@OriginalClass("client!ur")
public class class377 extends class287 {

    @OriginalMember(owner = "client!ur", name = "sd", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field5261 = new Hashtable();

    @OriginalMember(owner = "client!ur", name = "ie", descriptor = "I")
    public int field5303 = 128;

    @OriginalMember(owner = "client!ur", name = "Sd", descriptor = "Lhd;")
    private class524 field5287 = new class524();

    @OriginalMember(owner = "client!ur", name = "le", descriptor = "Lku;")
    private class257 field5306 = new class257();

    @OriginalMember(owner = "client!ur", name = "me", descriptor = "Lku;")
    public class257 field5307 = new class257();

    @OriginalMember(owner = "client!ur", name = "ne", descriptor = "I")
    public int field5308 = 3;

    @OriginalMember(owner = "client!ur", name = "oe", descriptor = "Z")
    private boolean field5309 = false;

    @OriginalMember(owner = "client!ur", name = "qe", descriptor = "I")
    public int field5311 = 8;

    @OriginalMember(owner = "client!ur", name = "se", descriptor = "Lsr;")
    private class167 field5313 = new class167();

    @OriginalMember(owner = "client!ur", name = "ue", descriptor = "I")
    private int field5315 = -1;

    @OriginalMember(owner = "client!ur", name = "we", descriptor = "[Lju;")
    private class83[] field5317 = new class83[4];

    @OriginalMember(owner = "client!ur", name = "ve", descriptor = "I")
    private int field5316 = -1;

    @OriginalMember(owner = "client!ur", name = "xe", descriptor = "I")
    private int field5318 = -1;

    @OriginalMember(owner = "client!ur", name = "ye", descriptor = "[Lju;")
    private class83[] field5319 = new class83[4];

    @OriginalMember(owner = "client!ur", name = "Ae", descriptor = "[Lju;")
    private class83[] field5321 = new class83[4];

    @OriginalMember(owner = "client!ur", name = "Ce", descriptor = "Lsr;")
    private class167 field5323;

    @OriginalMember(owner = "client!ur", name = "Ge", descriptor = "Lsr;")
    private class167 field5327;

    @OriginalMember(owner = "client!ur", name = "He", descriptor = "Lsr;")
    private class167 field5328;

    @OriginalMember(owner = "client!ur", name = "Ie", descriptor = "Lsr;")
    private class167 field5329;

    @OriginalMember(owner = "client!ur", name = "Je", descriptor = "Lsr;")
    private class167 field5330;

    @OriginalMember(owner = "client!ur", name = "Ke", descriptor = "Lsr;")
    private class167 field5331;

    @OriginalMember(owner = "client!ur", name = "Le", descriptor = "Lsr;")
    private class167 field5332;

    @OriginalMember(owner = "client!ur", name = "bf", descriptor = "I")
    private int field5348;

    @OriginalMember(owner = "client!ur", name = "zf", descriptor = "I")
    public int field5371;

    @OriginalMember(owner = "client!ur", name = "pf", descriptor = "Z")
    private boolean field5361;

    @OriginalMember(owner = "client!ur", name = "yf", descriptor = "I")
    private int field5370;

    @OriginalMember(owner = "client!ur", name = "Pf", descriptor = "I")
    public int field5387;

    @OriginalMember(owner = "client!ur", name = "af", descriptor = "[F")
    private float[] field5347;

    @OriginalMember(owner = "client!ur", name = "Uf", descriptor = "F")
    public float field5392;

    @OriginalMember(owner = "client!ur", name = "Yf", descriptor = "[Lbn;")
    private class309[] field5396;

    @OriginalMember(owner = "client!ur", name = "wf", descriptor = "[F")
    private float[] field5368;

    @OriginalMember(owner = "client!ur", name = "ng", descriptor = "I")
    public int field5411;

    @OriginalMember(owner = "client!ur", name = "jf", descriptor = "I")
    private int field5355;

    @OriginalMember(owner = "client!ur", name = "Ef", descriptor = "I")
    public int field5376;

    @OriginalMember(owner = "client!ur", name = "vf", descriptor = "I")
    public int field5367;

    @OriginalMember(owner = "client!ur", name = "Wf", descriptor = "I")
    private int field5394;

    @OriginalMember(owner = "client!ur", name = "sg", descriptor = "I")
    private int field5416;

    @OriginalMember(owner = "client!ur", name = "df", descriptor = "F")
    private float field5350;

    @OriginalMember(owner = "client!ur", name = "Xf", descriptor = "I")
    private int field5395;

    @OriginalMember(owner = "client!ur", name = "Te", descriptor = "I")
    private int field5340;

    @OriginalMember(owner = "client!ur", name = "Ve", descriptor = "[F")
    private float[] field5342;

    @OriginalMember(owner = "client!ur", name = "Vf", descriptor = "I")
    public int field5393;

    @OriginalMember(owner = "client!ur", name = "ef", descriptor = "[F")
    private float[] field5351;

    @OriginalMember(owner = "client!ur", name = "Ye", descriptor = "[F")
    public float[] field5345;

    @OriginalMember(owner = "client!ur", name = "of", descriptor = "F")
    private float field5360;

    @OriginalMember(owner = "client!ur", name = "cg", descriptor = "I")
    public int field5400;

    @OriginalMember(owner = "client!ur", name = "uf", descriptor = "I")
    public int field5366;

    @OriginalMember(owner = "client!ur", name = "gf", descriptor = "F")
    public float field5353;

    @OriginalMember(owner = "client!ur", name = "qg", descriptor = "F")
    public float field5414;

    @OriginalMember(owner = "client!ur", name = "ig", descriptor = "I")
    private int field5406;

    @OriginalMember(owner = "client!ur", name = "lf", descriptor = "F")
    public float field5357;

    @OriginalMember(owner = "client!ur", name = "Kg", descriptor = "F")
    public float field5434;

    @OriginalMember(owner = "client!ur", name = "Vg", descriptor = "I")
    public int field5445;

    @OriginalMember(owner = "client!ur", name = "Og", descriptor = "F")
    public float field5438;

    @OriginalMember(owner = "client!ur", name = "Qg", descriptor = "I")
    public int field5440;

    @OriginalMember(owner = "client!ur", name = "Mg", descriptor = "F")
    public float field5436;

    @OriginalMember(owner = "client!ur", name = "Yg", descriptor = "F")
    public float field5448;

    @OriginalMember(owner = "client!ur", name = "Pg", descriptor = "F")
    private float field5439;

    @OriginalMember(owner = "client!ur", name = "rg", descriptor = "I")
    private int field5415;

    @OriginalMember(owner = "client!ur", name = "eg", descriptor = "I")
    private int field5402;

    @OriginalMember(owner = "client!ur", name = "Lg", descriptor = "I")
    public int field5435;

    @OriginalMember(owner = "client!ur", name = "Af", descriptor = "Luo;")
    public class408 field5372;

    @OriginalMember(owner = "client!ur", name = "bh", descriptor = "[I")
    public int[] field5451;

    @OriginalMember(owner = "client!ur", name = "eh", descriptor = "[I")
    public int[] field5454;

    @OriginalMember(owner = "client!ur", name = "gh", descriptor = "[B")
    public byte[] field5456;

    @OriginalMember(owner = "client!ur", name = "fh", descriptor = "[I")
    public int[] field5455;

    @OriginalMember(owner = "client!ur", name = "Pd", descriptor = "I")
    public int field5284;

    @OriginalMember(owner = "client!ur", name = "mb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5151;

    @OriginalMember(owner = "client!ur", name = "td", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5262;

    @OriginalMember(owner = "client!ur", name = "oc", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field5205;

    @OriginalMember(owner = "client!ur", name = "gd", descriptor = "J")
    private long field5249;

    @OriginalMember(owner = "client!ur", name = "wc", descriptor = "J")
    private long field5213;

    @OriginalMember(owner = "client!ur", name = "Ne", descriptor = "Z")
    public boolean field5334;

    @OriginalMember(owner = "client!ur", name = "Ng", descriptor = "I")
    public int field5437;

    @OriginalMember(owner = "client!ur", name = "zg", descriptor = "Ljava/lang/String;")
    private String field5423;

    @OriginalMember(owner = "client!ur", name = "Lf", descriptor = "Z")
    public boolean field5383;

    @OriginalMember(owner = "client!ur", name = "cf", descriptor = "Z")
    private boolean field5349;

    @OriginalMember(owner = "client!ur", name = "gg", descriptor = "Z")
    public boolean field5404;

    @OriginalMember(owner = "client!ur", name = "Cf", descriptor = "Z")
    public boolean field5374;

    @OriginalMember(owner = "client!ur", name = "Sf", descriptor = "Z")
    public boolean field5390;

    @OriginalMember(owner = "client!ur", name = "Xe", descriptor = "Z")
    private boolean field5344;

    @OriginalMember(owner = "client!ur", name = "Rf", descriptor = "Ljava/lang/String;")
    private String field5389;

    @OriginalMember(owner = "client!ur", name = "tg", descriptor = "Z")
    public boolean field5417;

    @OriginalMember(owner = "client!ur", name = "Se", descriptor = "Z")
    private boolean field5339;

    @OriginalMember(owner = "client!ur", name = "je", descriptor = "Lss;")
    public class298 field5304;

    @OriginalMember(owner = "client!ur", name = "te", descriptor = "Lsj;")
    public class321 field5314;

    @OriginalMember(owner = "client!ur", name = "ce", descriptor = "Lpf;")
    private class414 field5297;

    @OriginalMember(owner = "client!ur", name = "Td", descriptor = "Lhg;")
    private class490 field5288;

    @OriginalMember(owner = "client!ur", name = "Vd", descriptor = "Ltt;")
    private class62 field5290;

    @OriginalMember(owner = "client!ur", name = "Ic", descriptor = "Lao;")
    public static class191 field5225 = new class191(98, 4);

    @OriginalMember(owner = "client!ur", name = "ke", descriptor = "Lfp;")
    public static class214 field5305 = new class214(0, 0);

    @OriginalMember(owner = "client!ur", name = "Oe", descriptor = "F")
    public float field5335;

    @OriginalMember(owner = "client!ur", name = "Qe", descriptor = "F")
    public float field5337;

    @OriginalMember(owner = "client!ur", name = "qf", descriptor = "F")
    public float field5362;

    @OriginalMember(owner = "client!ur", name = "xg", descriptor = "F")
    private float field5421;

    @OriginalMember(owner = "client!ur", name = "Ag", descriptor = "F")
    private float field5424;

    @OriginalMember(owner = "client!ur", name = "Dg", descriptor = "F")
    private float field5427;

    @OriginalMember(owner = "client!ur", name = "Rg", descriptor = "F")
    public float field5441;

    @OriginalMember(owner = "client!ur", name = "Tg", descriptor = "F")
    public float field5443;

    @OriginalMember(owner = "client!ur", name = "Wg", descriptor = "F")
    public float field5446;

    @OriginalMember(owner = "client!ur", name = "Xg", descriptor = "F")
    public float field5447;

    @OriginalMember(owner = "client!ur", name = "t", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!ur", name = "u", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!ur", name = "v", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!ur", name = "w", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!ur", name = "x", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!ur", name = "y", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!ur", name = "z", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!ur", name = "A", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!ur", name = "B", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!ur", name = "C", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!ur", name = "D", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!ur", name = "E", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!ur", name = "F", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!ur", name = "G", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!ur", name = "H", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!ur", name = "I", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!ur", name = "J", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!ur", name = "K", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!ur", name = "L", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
    public int field5125;

    @OriginalMember(owner = "client!ur", name = "N", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!ur", name = "O", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!ur", name = "P", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!ur", name = "Q", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!ur", name = "R", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!ur", name = "S", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!ur", name = "T", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!ur", name = "U", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!ur", name = "V", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!ur", name = "W", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!ur", name = "X", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!ur", name = "Y", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!ur", name = "Z", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!ur", name = "ab", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!ur", name = "bb", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!ur", name = "cb", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!ur", name = "db", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!ur", name = "eb", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!ur", name = "fb", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!ur", name = "gb", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!ur", name = "hb", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!ur", name = "ib", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!ur", name = "jb", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!ur", name = "kb", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!ur", name = "lb", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!ur", name = "nb", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!ur", name = "ob", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!ur", name = "pb", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!ur", name = "qb", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!ur", name = "rb", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!ur", name = "sb", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!ur", name = "tb", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!ur", name = "ub", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!ur", name = "vb", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!ur", name = "wb", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!ur", name = "xb", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!ur", name = "yb", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!ur", name = "zb", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!ur", name = "Ab", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!ur", name = "Bb", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!ur", name = "Cb", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!ur", name = "Db", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!ur", name = "Eb", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!ur", name = "Fb", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!ur", name = "Gb", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!ur", name = "Hb", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!ur", name = "Ib", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!ur", name = "Jb", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!ur", name = "Kb", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!ur", name = "Lb", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!ur", name = "Mb", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!ur", name = "Nb", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!ur", name = "Ob", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!ur", name = "Pb", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!ur", name = "Qb", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!ur", name = "Rb", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!ur", name = "Sb", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!ur", name = "Tb", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!ur", name = "Ub", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!ur", name = "Vb", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!ur", name = "Wb", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!ur", name = "Xb", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!ur", name = "Yb", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!ur", name = "Zb", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!ur", name = "ac", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!ur", name = "bc", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!ur", name = "cc", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!ur", name = "dc", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!ur", name = "ec", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!ur", name = "fc", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!ur", name = "gc", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!ur", name = "hc", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!ur", name = "ic", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!ur", name = "jc", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!ur", name = "kc", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!ur", name = "lc", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!ur", name = "mc", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!ur", name = "nc", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!ur", name = "pc", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!ur", name = "qc", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!ur", name = "rc", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!ur", name = "sc", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!ur", name = "tc", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!ur", name = "uc", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!ur", name = "vc", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!ur", name = "xc", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!ur", name = "yc", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!ur", name = "zc", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!ur", name = "Ac", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!ur", name = "Bc", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!ur", name = "Cc", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!ur", name = "Dc", descriptor = "I")
    public int field5220;

    @OriginalMember(owner = "client!ur", name = "Ec", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!ur", name = "Fc", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!ur", name = "Gc", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!ur", name = "Hc", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!ur", name = "Jc", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!ur", name = "Kc", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!ur", name = "Lc", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!ur", name = "Mc", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!ur", name = "Nc", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!ur", name = "Oc", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!ur", name = "Pc", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!ur", name = "Qc", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!ur", name = "Rc", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!ur", name = "Sc", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!ur", name = "Tc", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!ur", name = "Uc", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!ur", name = "Vc", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!ur", name = "Wc", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!ur", name = "Xc", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!ur", name = "Yc", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!ur", name = "Zc", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!ur", name = "ad", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!ur", name = "bd", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!ur", name = "cd", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!ur", name = "dd", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!ur", name = "ed", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!ur", name = "fd", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!ur", name = "hd", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!ur", name = "id", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!ur", name = "jd", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!ur", name = "kd", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!ur", name = "ld", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!ur", name = "md", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!ur", name = "nd", descriptor = "I")
    private int field5256;

    @OriginalMember(owner = "client!ur", name = "od", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!ur", name = "pd", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!ur", name = "qd", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!ur", name = "rd", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!ur", name = "ud", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!ur", name = "vd", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!ur", name = "wd", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!ur", name = "xd", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!ur", name = "yd", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!ur", name = "zd", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!ur", name = "Ad", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!ur", name = "Bd", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!ur", name = "Cd", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!ur", name = "Dd", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!ur", name = "Ed", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!ur", name = "Fd", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!ur", name = "Gd", descriptor = "I")
    private int field5275;

    @OriginalMember(owner = "client!ur", name = "Hd", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!ur", name = "Jd", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!ur", name = "Kd", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!ur", name = "Ld", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!ur", name = "Md", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!ur", name = "Nd", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!ur", name = "Od", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!ur", name = "Qd", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!ur", name = "Rd", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!ur", name = "Ud", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!ur", name = "Wd", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!ur", name = "Xd", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!ur", name = "Yd", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!ur", name = "Zd", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!ur", name = "ae", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!ur", name = "be", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!ur", name = "de", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!ur", name = "ee", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!ur", name = "fe", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!ur", name = "ge", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!ur", name = "he", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!ur", name = "pe", descriptor = "I")
    public int field5310;

    @OriginalMember(owner = "client!ur", name = "De", descriptor = "I")
    public int field5324;

    @OriginalMember(owner = "client!ur", name = "Ee", descriptor = "I")
    private int field5325;

    @OriginalMember(owner = "client!ur", name = "Fe", descriptor = "I")
    public int field5326;

    @OriginalMember(owner = "client!ur", name = "Pe", descriptor = "I")
    private int field5336;

    @OriginalMember(owner = "client!ur", name = "We", descriptor = "I")
    public int field5343;

    @OriginalMember(owner = "client!ur", name = "mf", descriptor = "I")
    private int field5358;

    @OriginalMember(owner = "client!ur", name = "nf", descriptor = "I")
    private int field5359;

    @OriginalMember(owner = "client!ur", name = "tf", descriptor = "I")
    public int field5365;

    @OriginalMember(owner = "client!ur", name = "Df", descriptor = "I")
    private int field5375;

    @OriginalMember(owner = "client!ur", name = "Mf", descriptor = "I")
    private int field5384;

    @OriginalMember(owner = "client!ur", name = "jg", descriptor = "I")
    private int field5407;

    @OriginalMember(owner = "client!ur", name = "kg", descriptor = "I")
    private int field5408;

    @OriginalMember(owner = "client!ur", name = "mg", descriptor = "I")
    public int field5410;

    @OriginalMember(owner = "client!ur", name = "og", descriptor = "I")
    private int field5412;

    @OriginalMember(owner = "client!ur", name = "yg", descriptor = "I")
    private int field5422;

    @OriginalMember(owner = "client!ur", name = "Fg", descriptor = "I")
    private int field5429;

    @OriginalMember(owner = "client!ur", name = "Hg", descriptor = "I")
    public int field5431;

    @OriginalMember(owner = "client!ur", name = "Zg", descriptor = "I")
    private int field5449;

    @OriginalMember(owner = "client!ur", name = "ch", descriptor = "I")
    private int field5452;

    @OriginalMember(owner = "client!ur", name = "dh", descriptor = "I")
    private int field5453;

    @OriginalMember(owner = "client!ur", name = "Jg", descriptor = "J")
    private long field5433;

    @OriginalMember(owner = "client!ur", name = "fg", descriptor = "Lse;")
    private class170 field5403;

    @OriginalMember(owner = "client!ur", name = "Cg", descriptor = "Lse;")
    private class170 field5426;

    @OriginalMember(owner = "client!ur", name = "Eg", descriptor = "Lkm;")
    public class238 field5428;

    @OriginalMember(owner = "client!ur", name = "Ze", descriptor = "Lku;")
    public class257 field5346;

    @OriginalMember(owner = "client!ur", name = "Bg", descriptor = "Lku;")
    public class257 field5425;

    @OriginalMember(owner = "client!ur", name = "Bf", descriptor = "Lmq;")
    public class354 field5373;

    @OriginalMember(owner = "client!ur", name = "ug", descriptor = "Ltp;")
    public class374 field5418;

    @OriginalMember(owner = "client!ur", name = "Sg", descriptor = "Ltp;")
    public class374 field5442;

    @OriginalMember(owner = "client!ur", name = "Ff", descriptor = "Lfe;")
    private class404 field5377;

    @OriginalMember(owner = "client!ur", name = "sf", descriptor = "Lha;")
    private class43 field5364;

    @OriginalMember(owner = "client!ur", name = "Me", descriptor = "Lpg;")
    public class517 field5333;

    @OriginalMember(owner = "client!ur", name = "Ue", descriptor = "Lpg;")
    public class517 field5341;

    @OriginalMember(owner = "client!ur", name = "ff", descriptor = "Lpg;")
    public class517 field5352;

    @OriginalMember(owner = "client!ur", name = "kf", descriptor = "Lpg;")
    public class517 field5356;

    @OriginalMember(owner = "client!ur", name = "xf", descriptor = "Lpg;")
    public class517 field5369;

    @OriginalMember(owner = "client!ur", name = "Kf", descriptor = "Lpg;")
    public class517 field5382;

    @OriginalMember(owner = "client!ur", name = "Tf", descriptor = "Lpg;")
    public class517 field5391;

    @OriginalMember(owner = "client!ur", name = "bg", descriptor = "Lpg;")
    public class517 field5399;

    @OriginalMember(owner = "client!ur", name = "vg", descriptor = "Lpg;")
    public class517 field5419;

    @OriginalMember(owner = "client!ur", name = "Ug", descriptor = "Lpg;")
    public class517 field5444;

    @OriginalMember(owner = "client!ur", name = "dg", descriptor = "Lal;")
    private class67 field5401;

    @OriginalMember(owner = "client!ur", name = "ze", descriptor = "Lju;")
    private class83 field5320;

    @OriginalMember(owner = "client!ur", name = "Be", descriptor = "Lju;")
    private class83 field5322;

    @OriginalMember(owner = "client!ur", name = "re", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field5312;

    @OriginalMember(owner = "client!ur", name = "Re", descriptor = "Z")
    private boolean field5338;

    @OriginalMember(owner = "client!ur", name = "hf", descriptor = "Z")
    public boolean field5354;

    @OriginalMember(owner = "client!ur", name = "rf", descriptor = "Z")
    private boolean field5363;

    @OriginalMember(owner = "client!ur", name = "Gf", descriptor = "Z")
    public boolean field5378;

    @OriginalMember(owner = "client!ur", name = "Hf", descriptor = "Z")
    private boolean field5379;

    @OriginalMember(owner = "client!ur", name = "If", descriptor = "Z")
    private boolean field5380;

    @OriginalMember(owner = "client!ur", name = "Jf", descriptor = "Z")
    private boolean field5381;

    @OriginalMember(owner = "client!ur", name = "Nf", descriptor = "Z")
    public boolean field5385;

    @OriginalMember(owner = "client!ur", name = "Qf", descriptor = "Z")
    private boolean field5388;

    @OriginalMember(owner = "client!ur", name = "Zf", descriptor = "Z")
    public boolean field5397;

    @OriginalMember(owner = "client!ur", name = "ag", descriptor = "Z")
    public boolean field5398;

    @OriginalMember(owner = "client!ur", name = "hg", descriptor = "Z")
    private boolean field5405;

    @OriginalMember(owner = "client!ur", name = "lg", descriptor = "Z")
    public boolean field5409;

    @OriginalMember(owner = "client!ur", name = "pg", descriptor = "Z")
    public boolean field5413;

    @OriginalMember(owner = "client!ur", name = "wg", descriptor = "Z")
    private boolean field5420;

    @OriginalMember(owner = "client!ur", name = "Gg", descriptor = "Z")
    public boolean field5430;

    @OriginalMember(owner = "client!ur", name = "Ig", descriptor = "Z")
    private boolean field5432;

    @OriginalMember(owner = "client!ur", name = "ah", descriptor = "Z")
    private boolean field5450;

    @OriginalMember(owner = "client!ur", name = "Id", descriptor = "[Lo;")
    public static class24[] field5277;

    @OriginalMember(owner = "client!ur", name = "Of", descriptor = "[Lhe;")
    private class252[] field5386;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V", line = 3)
    public final void method1184(boolean arg0) {
        ++field5174;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(IIIIII)Lob;", line = 14)
    public final class521 method1230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5278;
        return !this.field5430 ? null : new class476(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ur", name = "ya", descriptor = "(I)V", line = 22)
    public final void method1130(int arg0) {
        ++field5200;
        this.field5308 = 0;
        while (~arg0 < -2) {
            ++this.field5308;
            arg0 >>= 1;
        }
        this.field5311 = 1 << this.field5308;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(B)V", line = 42)
    private final void method2226(byte arg0) {
        this.field5443 = (float) (this.field5395 - this.field5435);
        this.field5362 = (float) (-this.field5371 + this.field5406);
        ++field5124;
        if (arg0 == -64) {
            this.field5446 = (float) (-this.field5371 + this.field5340);
            this.field5441 = (float) (-this.field5435 + this.field5370);
        }
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 56)
    public final void method1161(Canvas arg0) {
        this.field5262 = null;
        ++field5142;
        this.field5213 = 0L;
        if (arg0 != null && this.field5151 != arg0) {
            if (this.field5261.containsKey(arg0)) {
                Long var2 = (Long) this.field5261.get(arg0);
                this.field5213 = var2;
                this.field5262 = arg0;
            }
        } else {
            this.field5262 = this.field5151;
            this.field5213 = this.field5249;
        }
        if (this.field5262 != null && this.field5213 != 0L) {
            this.field5205.setSurface(this.field5213);
            this.method2234(-64);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILku;)V", line = 93)
    public final void method2227(int arg0, class257 arg1) {
        OpenGL.glPushMatrix();
        ++field5238;
        if (arg0 != -2097153) {
            this.field5406 = 9;
        }
        OpenGL.glMultMatrixf(arg1.method1590(0), 0);
    }

    @OriginalMember(owner = "client!ur", name = "t", descriptor = "()Z", line = 109)
    public final boolean method1193() {
        ++field5218;
        if (this.field5288 != null) {
            if (!this.field5288.method1648((byte) 108)) {
                if (!this.field5297.method2531(this.field5288, -22160)) {
                    return false;
                }
                this.field5304.method1781((byte) -122);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILju;)V", line = 134)
    public final void method2228(int arg0, class83 arg1) {
        if (arg0 < 17) {
            this.method2271((byte) 24, (class83) null);
        }
        ++field5254;
        if (~this.field5315 <= -1 && this.field5317[this.field5315] == arg1) {
            this.field5317[this.field5315--] = null;
            arg1.method461(-8741);
            if (this.field5315 >= 0) {
                this.field5322 = this.field5317[this.field5315];
                this.field5322.method457((byte) 69);
            } else {
                this.field5322 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IBII)V", line = 159)
    public final void method2229(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -18) {
            this.field5275 = 126;
        }
        ++field5112;
        OpenGL.glTexEnvi(8960, 34176 - -arg2, arg0);
        OpenGL.glTexEnvi(8960, arg2 + 34192, arg3);
    }

    @OriginalMember(owner = "client!ur", name = "da", descriptor = "(FF)V", line = 171)
    public final void method1140(float arg0, float arg1) {
        if (this.field5414 != arg0 || this.field5447 != arg1) {
            this.field5414 = arg0;
            this.field5447 = arg1;
            this.method2256(1);
            if (~this.field5449 != -4) {
                if (~this.field5449 == -3) {
                    this.method2265(false);
                }
            } else {
                this.method2291(0);
            }
        }
        ++field5235;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)V", line = 196)
    public final void method2230(int arg0, boolean arg1) {
        ++field5139;
        if (arg0 == -13721) {
            if (!arg1 != !this.field5388) {
                this.field5388 = arg1;
                this.method2262((byte) 86);
                this.field5408 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)V", line = 214)
    public final void method1173(int arg0) {
        ++field5211;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ur", name = "va", descriptor = "()V", line = 228)
    public final void method1206() {
        this.field5406 = 0;
        this.field5370 = 0;
        this.field5340 = this.field5125;
        ++field5140;
        this.field5395 = this.field5220;
        OpenGL.glDisable(3089);
        this.method2226((byte) -64);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II[I[I)Lta;", line = 243)
    public final class144 method1215(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field5280;
        return class450.method2784(arg3, arg2, this, 4227, arg1, arg0);
    }

    @OriginalMember(owner = "client!ur", name = "ma", descriptor = "(IIIII)V", line = 251)
    public final void method1128(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2241(-3874);
        ++field5113;
        this.method2279(arg4, (byte) 25);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ur", name = "A", descriptor = "()Z", line = 271)
    public final boolean method1132() {
        ++field5160;
        return true;
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(B)V", line = 279)
    private final void method2231(byte arg0) {
        if (this.field5449 != 2) {
            this.field5449 = 2;
            this.method2265(false);
            this.method2305((byte) -101);
            this.field5408 &= -8;
        }
        ++field5208;
        int var2 = -118 / ((arg0 - 55) / 41);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIIF)Lbn;", line = 296)
    public final class309 method1231(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field5122;
        return new class513(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BII)V", line = 304)
    public final synchronized void method2232(byte arg0, int arg1, int arg2) {
        if (arg0 <= 78) {
            this.method1139(0.47504303F);
        }
        ++field5115;
        class488 var4 = new class488(arg2);
        var4.field6348 = (long) arg1;
        this.field5330.method975(0, var4);
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(B)V", line = 321)
    private final void method2233(byte arg0) {
        OpenGL.glDepthMask(this.field5363 && this.field5361);
        int var2 = 21 % ((-13 - arg0) / 46);
        ++field5281;
    }

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "(I)V", line = 332)
    private final void method2234(int arg0) {
        ++field5169;
        int var2 = 63 / ((arg0 - 17) / 52);
        if (this.field5262 == null) {
            this.field5256 = this.field5275 = 0;
        } else {
            Dimension var3 = this.field5262.getSize();
            this.field5275 = var3.height;
            this.field5256 = var3.width;
        }
        if (this.field5322 == null) {
            this.field5220 = this.field5256;
            this.field5125 = this.field5275;
            this.method2270((byte) -87);
        }
        this.method2272((byte) 125);
        this.method1206();
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZB)V", line = 360)
    public final void method2235(boolean arg0, byte arg1) {
        if (arg1 != -46) {
            this.method2231((byte) -6);
        }
        ++field5184;
        if (!this.field5432 != !arg0) {
            if (arg0) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field5432 = arg0;
            this.field5408 &= -32;
        }
    }

    @OriginalMember(owner = "client!ur", name = "s", descriptor = "(IIII)V", line = 385)
    public final void method1180(int arg0, int arg1, int arg2, int arg3) {
        ++field5182;
        this.field5354 = true;
        this.field5445 = arg3;
        this.field5365 = arg0;
        this.field5376 = arg2;
        this.field5415 = arg1;
        this.field5290.method373(false, 3, (byte) 115, false, 0, 0);
        this.field5290.field722.method1117(108);
        this.method2286((byte) 8);
        this.method2290(false);
    }

    @OriginalMember(owner = "client!ur", name = "B", descriptor = "()I", line = 404)
    public final int method1176() {
        ++field5147;
        return 4;
    }

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "()V", line = 413)
    public final void method1232() {
        ++field5177;
        this.field5354 = false;
        this.field5290.method373(false, 0, (byte) 115, false, 0, 0);
        this.method2286((byte) 8);
        this.method2290(false);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lhe;I)V", line = 429)
    public final void method2236(class252 arg0, int arg1) {
        ++field5264;
        class252 var3 = this.field5386[this.field5375];
        int var4 = 2 / ((53 - arg1) / 41);
        if (arg0 != var3) {
            if (arg0 != null) {
                if (var3 == null) {
                    OpenGL.glEnable(arg0.field3364);
                } else if (arg0.field3364 != var3.field3364) {
                    OpenGL.glDisable(var3.field3364);
                    OpenGL.glEnable(arg0.field3364);
                }
                OpenGL.glBindTexture(arg0.field3364, arg0.method1557(-2));
            } else {
                OpenGL.glDisable(var3.field3364);
            }
            this.field5386[this.field5375] = arg0;
        }
        this.field5408 &= -2;
    }

    @OriginalMember(owner = "client!ur", name = "pa", descriptor = "()I", line = 470)
    public final int method1165() {
        ++field5127;
        return this.field5326 + this.field5324 + this.field5325;
    }

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "(I)V", line = 482)
    public final void method2237(int arg0) {
        OpenGL.glPushMatrix();
        ++field5199;
        if (arg0 > -63) {
            this.field5404 = true;
        }
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(Z)V", line = 494)
    public final void method1166(boolean arg0) {
        ++field5247;
    }

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "(I)V", line = 502)
    private final void method2238(int arg0) {
        if (arg0 <= -12) {
            ++field5228;
            int var2;
            for (var2 = 0; ~this.field5422 < ~var2; ++var2) {
                class309 var3 = this.field5396[var2];
                int var4 = 16386 - -var2;
                class495.field7233[0] = (float) var3.method1840((byte) -110);
                class495.field7233[1] = (float) var3.method1841(0);
                class495.field7233[2] = (float) var3.method1842((byte) 110);
                class495.field7233[3] = 1.0F;
                OpenGL.glLightfv(var4, 4611, class495.field7233, 0);
                int var5 = var3.method1847(8);
                float var6 = var3.method1849(111) / 255.0F;
                class495.field7233[1] = (float) class95.method534(var5 >> 8, 255) * var6;
                class495.field7233[2] = (float) class95.method534(var5, 255) * var6;
                class495.field7233[0] = var6 * (float) class95.method534(255, var5 >> 16);
                OpenGL.glLightfv(var4, 4609, class495.field7233, 0);
                OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method1845((byte) -98) * var3.method1845((byte) -98)));
                OpenGL.glEnable(var4);
            }
            while (~var2 > ~this.field5358) {
                OpenGL.glDisable(16386 - -var2);
                ++var2;
            }
            this.field5358 = this.field5422;
        }
    }

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "(B)I", line = 549)
    private final int method2239(byte arg0) {
        ++field5203;
        this.field5389 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field5423 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field5389.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (~this.field5389.indexOf("brian paul") != 0 || this.field5389.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class436.method2679((byte) 120, ' ', var3.replace('.', ' '));
        if (var4.length < 2) {
            var2 |= 4;
        } else {
            try {
                int var5 = class304.method1819((byte) -123, var4[0]);
                int var6 = class304.method1819((byte) -118, var4[1]);
                this.field5336 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var2 |= 4;
            }
        }
        if (~this.field5336 > -13) {
            var2 |= 2;
        }
        if (!this.field5205.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field5205.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field5410 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field5407 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field5384 = var7[0];
        if (this.field5410 < 2 || ~this.field5407 > -3 || ~this.field5384 > -3) {
            var2 |= 16;
        }
        this.field5334 = NativeStream.method2735();
        this.field5205.arePbuffersAvailable();
        this.field5349 = this.field5205.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        int var8 = 34 % ((arg0 - -23) / 61);
        this.field5381 = this.field5205.isExtensionAvailable("GL_ARB_multisample");
        this.field5413 = this.field5205.isExtensionAvailable("GL_ARB_vertex_program");
        this.field5205.isExtensionAvailable("GL_ARB_fragment_program");
        this.field5409 = this.field5205.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field5378 = this.field5205.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field5383 = this.field5205.isExtensionAvailable("GL_EXT_texture3D");
        this.field5374 = this.field5205.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field5430 = this.field5205.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field5404 = this.field5205.isExtensionAvailable("GL_ARB_texture_float");
        this.field5397 = false;
        this.field5417 = this.field5205.isExtensionAvailable("GL_EXT_framebuffer_object");
        this.field5385 = this.field5205.isExtensionAvailable("GL_EXT_framebuffer_blit");
        this.field5398 = this.field5205.isExtensionAvailable("GL_EXT_framebuffer_multisample");
        this.field5379 = this.field5385 & this.field5398;
        return var2 == 0 ? 0 : var2;
    }

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "()V", line = 630)
    public final void method1147() {
        ++field5133;
        if (this.field5288 != null && this.field5288.method1648((byte) 68)) {
            this.field5297.method2529((byte) -9, this.field5288);
            this.field5304.method1781((byte) -112);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IFFF)V", line = 650)
    private final void method2240(int arg0, float arg1, float arg2, float arg3) {
        ++field5250;
        OpenGL.glMatrixMode(5890);
        if (this.field5450) {
            OpenGL.glLoadIdentity();
        }
        if (arg0 == -19805) {
            OpenGL.glTranslatef(arg2, arg3, arg1);
            OpenGL.glMatrixMode(5888);
            this.field5450 = true;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lob;)V", line = 668)
    public final void method1159(class521 arg0) {
        this.field5364 = (class43) arg0;
        ++field5237;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V", line = 677)
    public final synchronized void method1143(int arg0) {
        ++field5252;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field5327.method979(2)) {
            class488 var12 = (class488) this.field5327.method977((byte) -95);
            class343.field4594[var3++] = (int) var12.field6348;
            this.field5326 -= var12.field7162;
            if (~var3 == -1001) {
                OpenGL.glDeleteBuffersARB(var3, class343.field4594, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class343.field4594, 0);
            var3 = 0;
        }
        while (!this.field5328.method979(2)) {
            class488 var11 = (class488) this.field5328.method977((byte) -77);
            class343.field4594[var3++] = (int) var11.field6348;
            this.field5324 -= var11.field7162;
            if (~var3 == -1001) {
                OpenGL.glDeleteTextures(var3, class343.field4594, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteTextures(var3, class343.field4594, 0);
            var3 = 0;
        }
        while (!this.field5329.method979(2)) {
            class488 var10 = (class488) this.field5329.method977((byte) 54);
            class343.field4594[var3++] = var10.field7162;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class343.field4594, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class343.field4594, 0);
            var3 = 0;
        }
        while (!this.field5330.method979(2)) {
            class488 var9 = (class488) this.field5330.method977((byte) 93);
            class343.field4594[var3++] = (int) var9.field6348;
            this.field5325 -= var9.field7162;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class343.field4594, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class343.field4594, 0);
            boolean var4 = false;
        }
        while (!this.field5323.method979(2)) {
            class488 var8 = (class488) this.field5323.method977((byte) 66);
            OpenGL.glDeleteLists((int) var8.field6348, var8.field7162);
        }
        while (!this.field5331.method979(2)) {
            class435 var7 = this.field5331.method977((byte) 78);
            OpenGL.glDeleteProgramARB((int) var7.field6348);
        }
        while (!this.field5332.method979(2)) {
            class435 var6 = this.field5332.method977((byte) -49);
            OpenGL.glDeleteObjectARB(var6.field6348);
        }
        while (!this.field5323.method979(2)) {
            class488 var5 = (class488) this.field5323.method977((byte) 57);
            OpenGL.glDeleteLists((int) var5.field6348, var5.field7162);
        }
        this.field5304.method1782(5);
        if (this.method1165() > 100663296 && this.field5433 + 60000L < class45.method252((byte) -8)) {
            System.gc();
            this.field5433 = class45.method252((byte) -8);
        }
        this.field5310 = var2;
    }

    @OriginalMember(owner = "client!ur", name = "t", descriptor = "(I)V", line = 845)
    public final void method1145(int arg0) {
        this.method2279(0, (byte) 34);
        ++field5188;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "(I)V", line = 857)
    private final void method2241(int arg0) {
        if (arg0 != -3874) {
            this.method2243((class257) null, 7);
        }
        ++field5236;
        if (~this.field5408 != -2) {
            this.method2267((byte) 97);
            this.method2298(false, -12481);
            this.method2230(-13721, false);
            this.method2235(false, (byte) -46);
            this.method2289((byte) 116, false);
            this.method2236((class252) null, 127);
            this.method2299(-2, (byte) 112);
            this.method2260(arg0 ^ -20002, 1);
            this.field5408 = 1;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIIII)V", line = 881)
    public final void method1197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field5243;
        this.method1228(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ur", name = "r", descriptor = "()I", line = 894)
    public final int method1141() {
        ++field5295;
        return this.field5366;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IFF)V", line = 903)
    public final void method2242(int arg0, float arg1, float arg2) {
        if (arg0 != 24442) {
            this.method1169();
        }
        ++field5157;
        this.field5439 = arg2;
        this.field5360 = arg1;
        if (!this.field5354) {
            this.method2286((byte) 8);
        }
    }

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "()Z", line = 919)
    public final boolean method1235() {
        ++field5257;
        return this.field5381 && (!this.method1142() || this.field5379);
    }

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "()Z", line = 927)
    public final boolean method1168() {
        ++field5255;
        return true;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 936)
    public final void method1152(Rectangle[] arg0, int arg1) {
        ++field5159;
        this.method1208();
    }

    @OriginalMember(owner = "client!ur", name = "AA", descriptor = "()I", line = 946)
    public final int method1234() {
        ++field5269;
        return this.field5400;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lku;I)V", line = 954)
    public final void method2243(class257 arg0, int arg1) {
        ++field5289;
        if (arg1 != 12711) {
            this.field5308 = -11;
        }
        OpenGL.glLoadMatrixf(arg0.method1590(0), 0);
    }

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "()Lc;", line = 965)
    public final class124 method1183() {
        ++field5266;
        return this.field5306;
    }

    @OriginalMember(owner = "client!ur", name = "z", descriptor = "()Z", line = 975)
    public final boolean method1135() {
        ++field5152;
        return this.field5288 != null && (~this.field5284 >= -2 || this.field5379);
    }

    @OriginalMember(owner = "client!ur", name = "Y", descriptor = "()I", line = 983)
    public final int method1210() {
        ++field5300;
        int var1 = this.field5453;
        this.field5453 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lpq;IIII)Le;", line = 994)
    public final class373 method1213(class131 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5197;
        return new class517(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "(B)V", line = 1003)
    private final void method2244(byte arg0) {
        ++field5294;
        this.method2299(-2, (byte) 82);
        for (int var2 = this.field5410 + -1; ~var2 <= -1; --var2) {
            this.method2250((byte) 54, var2);
            this.method2236((class252) null, 119);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2269(8448, arg0 ^ -9063, 8448);
        this.method2229(34168, (byte) -18, 2, 770);
        this.method2254(68);
        this.field5359 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field5429 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field5338 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field5420 = true;
        this.method2298(true, -12481);
        this.method2230(arg0 ^ 13822, true);
        this.method2235(true, (byte) -46);
        this.method2289((byte) 121, true);
        this.method2272((byte) 127);
        if (arg0 != -103) {
            this.method1149();
        }
        this.field5205.setSwapInterval(0);
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
        this.field5394 = this.field5440 = -1;
        this.method1206();
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II[[I[[IIII)Lya;", line = 1077)
    public final class38 method1214(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5219;
        return new class452(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(ILju;)V", line = 1085)
    public final void method2245(int arg0, class83 arg1) {
        ++field5189;
        if (arg0 >= -59) {
            this.field5368 = null;
        }
        if (~this.field5316 <= -1 && this.field5321[this.field5316] == arg1) {
            this.field5321[this.field5316--] = null;
            arg1.method458(29845);
            if (this.field5316 >= 0) {
                this.field5320 = this.field5321[this.field5316];
                this.field5320.method460(-14568);
            } else {
                this.field5320 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(FIFFF)V", line = 1112)
    public final void method2246(float arg0, int arg1, float arg2, float arg3, float arg4) {
        class127.field1650[3] = arg4;
        ++field5222;
        class127.field1650[0] = arg2;
        if (arg1 != -13680) {
            this.field5327 = null;
        }
        class127.field1650[2] = arg0;
        class127.field1650[1] = arg3;
        OpenGL.glTexEnvfv(8960, 8705, class127.field1650, 0);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IBIILfe;)V", line = 1127)
    public final void method2247(int arg0, byte arg1, int arg2, int arg3, class404 arg4) {
        ++field5167;
        int var6 = 72 % ((-23 - arg1) / 60);
        int var7 = arg4.method1467(119);
        int var8 = arg2 * this.method2283(var7, -5125);
        this.method2281(arg4, (byte) 66);
        OpenGL.glDrawElements(arg3, arg0, var7, (long) var8 + arg4.method1465((byte) -34));
    }

    @OriginalMember(owner = "client!ur", name = "y", descriptor = "()V", line = 1143)
    public final void method1196() {
        ++field5134;
        if (this.field5339 && this.field5220 > 0 && this.field5125 > 0) {
            int var1 = this.field5370;
            int var2 = this.field5395;
            int var3 = this.field5406;
            int var4 = this.field5340;
            this.method1206();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2272((byte) 125);
            this.method2298(false, -12481);
            this.method2230(-13721, false);
            this.method2235(false, (byte) -46);
            this.method2289((byte) 123, false);
            this.method2236((class252) null, -25);
            this.method2299(-2, (byte) 74);
            this.method2260(16640, 1);
            this.method2279(0, (byte) 118);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field5220, this.field5125, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method1182(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "(I)V", line = 1188)
    public final void method2248(int arg0) {
        if (this.field5408 != arg0) {
            this.method2274((byte) 55);
            this.method2298(true, -12481);
            this.method2235(true, (byte) -46);
            this.method2289((byte) 121, true);
            this.method2279(1, (byte) 82);
            this.method2260(16640, 0);
            this.field5408 = 16;
        }
        ++field5273;
    }

    @OriginalMember(owner = "client!ur", name = "v", descriptor = "(III[I)V", line = 1207)
    public final void method1207(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5299;
        float var5 = (float) arg2 * this.field5425.field3411 + (float) arg0 * this.field5425.field3437 + (float) arg1 * this.field5425.field3410 + this.field5425.field3426;
        if (!((float) this.field5400 > var5) && !(var5 > (float) this.field5366)) {
            int var6 = (int) (((float) arg2 * this.field5425.field3424 + (float) arg0 * this.field5425.field3431 + (float) arg1 * this.field5425.field3427 + this.field5425.field3412) * (float) this.field5411 / var5);
            int var7 = (int) (((float) arg2 * this.field5425.field3414 + (float) arg0 * this.field5425.field3405 + (float) arg1 * this.field5425.field3429 + this.field5425.field3432) * (float) this.field5393 / var5);
            if ((float) var6 >= this.field5441 && this.field5443 >= (float) var6 && (float) var7 >= this.field5362 && this.field5446 >= (float) var7) {
                arg3[1] = (int) ((float) var7 + -this.field5362);
                arg3[0] = (int) ((float) var6 + -this.field5441);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ur", name = "OA", descriptor = "()I", line = 1239)
    public final int method1169() {
        ++field5242;
        int var1 = this.field5452;
        this.field5452 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1252)
    public final void method1217(Canvas arg0) {
        ++field5131;
        if (this.field5151 == arg0) {
            throw new RuntimeException();
        } else if (!this.field5261.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field5205.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field5261.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BLju;)V", line = 1287)
    public final void method2249(byte arg0, class83 arg1) {
        ++field5191;
        if (~this.field5316 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field5316 <= -1) {
                this.field5321[this.field5316].method458(29845);
            }
            if (arg0 != 63) {
                this.field5328 = null;
            }
            this.field5320 = this.field5321[++this.field5316] = arg1;
            this.field5320.method460(-14568);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI)V", line = 1307)
    public final void method2250(byte arg0, int arg1) {
        ++field5170;
        if (arg0 <= 50) {
            this.method2262((byte) -85);
        }
        if (this.field5375 != arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field5375 = arg1;
        }
    }

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "(I)V", line = 1326)
    private final void method2251(int arg0) {
        ++field5141;
        if (arg0 > -88) {
            this.field5367 = 38;
        }
        int var2 = 0;
        while (!this.field5205.attach()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            class316.method1873(1000L, false);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lob;Lob;FLob;)Lob;", line = 1349)
    public final class521 method1162(class521 arg0, class521 arg1, float arg2, class521 arg3) {
        ++field5165;
        if (arg0 != null && arg1 != null && this.field5430 && this.field5417) {
            class481 var5 = null;
            class43 var6 = (class43) arg0;
            class43 var7 = (class43) arg1;
            class139 var8 = var6.method251((byte) -127);
            class139 var9 = var7.method251((byte) -128);
            if (var8 != null && var9 != null) {
                int var10 = var8.field1855 <= var9.field1855 ? var9.field1855 : var8.field1855;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class481) {
                    class481 var11 = (class481) arg3;
                    if (~var10 == ~var11.method2940(-65534)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class481(this, var10);
                }
                if (var5.method2939((byte) 35, arg2, var8, var9)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "(B)V", line = 1400)
    public static final void method2252(byte arg0) {
        class279.field3702.method2898(false);
        ++field5271;
        class144.field1914.method2176((byte) -31);
        if (arg0 != 76) {
            field5277 = null;
        }
        class453.field6782.method1485(arg0 + -66);
        class123.field1593.method2922(arg0 ^ -55);
        class87.field1032.method1671((byte) -120);
        class237.field3158.method226(false);
        class7.field97.method2950((byte) -123);
        class71.field914.method1607(true);
        class373.field5063.method676(arg0 + 50);
        class180.field2350.method801(arg0 ^ 7618);
        class254.field3381.method1920(109);
        class465.field6927.method503(64);
        class60.field698.method991(107);
        class468.field6947.method1079(35);
        class104.field1405.method451(119);
        client.field2571.method2823((byte) 57);
        class333.field4407.method2503(-125);
        class211.field2834.method1621(31);
        class211.field2827.method1336(arg0 ^ 109);
        class505.field7341.method1573(26);
        class420.method2594(6);
        class174.method1018((byte) 68);
        class355.method2085(-74);
        if (class401.field5807 != class287.field3779) {
            for (int var1 = 0; ~class470.field6975.length < ~var1; ++var1) {
                class470.field6975[var1] = null;
            }
            class336.field4451 = 0;
        }
        class209.method1326(true);
        class397.method2453(16);
        class189.method1086(41);
        class97.method555((byte) 26);
        class268.method1634(arg0 ^ 370396640);
        class432.field6300.method3045(48);
        class343.field4596.method1158();
        class449.field6540.method323(89);
        class305.method1822(0);
        class461.field6872.method2150(-97);
        class434.field6336.method2150(arg0 + 19);
        class517.field7627.method2150(-114);
        class258.field3450.method2150(88);
        class273.field3641.method2150(arg0 ^ -54);
        class426.field6186.method2150(arg0 + 4);
        class96.field1214.method2150(arg0 ^ 41);
        class95.field1136.method2150(120);
        class282.field3733.method2150(72);
        class524.field7702.method2150(113);
        class98.field1322.method2150(-57);
        class154.field2017.method2150(104);
        class230.field3101.method2150(103);
        class98.field1309.method2150(114);
        class75.field938.method2150(120);
        class287.field3782.method2150(arg0 + -199);
        class316.field4207.method2150(116);
        class306.field4088.method2150(-52);
        class232.field3114.method2150(-55);
        class533.field7851.method2150(85);
        class117.field1533.method2150(115);
        class49.field558.method2150(-99);
        class6.field76.method2150(126);
        class413.field5904.method2150(116);
        class479.field7093.method2150(arg0 + -194);
        class374.field5075.method2150(arg0 + -181);
        class346.field4613.method2150(119);
        class48.field543.method2150(124);
        class337.field4466.method2150(-126);
        class32.field333.method2150(88);
        class68.field784.method3045(48);
        class347.field4619.method3045(arg0 ^ 124);
        class312.field4168.method3045(arg0 + -28);
        class266.field3565.method3045(48);
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(II)V", line = 1489)
    public final synchronized void method2253(int arg0, int arg1) {
        if (arg1 != -1888158920) {
            this.field5345 = null;
        }
        ++field5212;
        class435 var3 = new class435();
        var3.field6348 = (long) arg0;
        this.field5331.method975(arg1 + 1888158920, var3);
    }

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "(I)V", line = 1503)
    private final void method2254(int arg0) {
        if (arg0 <= 40) {
            this.method2269(-51, 112, 92);
        }
        if (this.field5450) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field5450 = false;
        }
        ++field5137;
    }

    @OriginalMember(owner = "client!ur", name = "v", descriptor = "()V", line = 1523)
    public final void method1208() {
        ++field5195;
        try {
            this.field5205.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "(B)V", line = 1540)
    private final void method2255(byte arg0) {
        this.field5425 = new class257();
        ++field5276;
        this.field5346 = new class257();
        this.field5386 = new class252[this.field5410];
        this.field5428 = new class238(this, 3553, 6408, 1, 1);
        new class238(this, 3553, 6408, 1, 1);
        new class238(this, 3553, 6408, 1, 1);
        if (arg0 >= -101) {
            field5305 = null;
        }
        this.field5444 = new class517(this);
        this.field5333 = new class517(this);
        this.field5341 = new class517(this);
        this.field5391 = new class517(this);
        this.field5419 = new class517(this);
        this.field5382 = new class517(this);
        this.field5352 = new class517(this);
        this.field5399 = new class517(this);
        this.field5356 = new class517(this);
        this.field5369 = new class517(this);
        if (this.field5417) {
            this.field5373 = new class354(this);
            new class354(this);
        }
    }

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "(I)V", line = 1582)
    private final void method2256(int arg0) {
        ++field5226;
        if (this.field5447 != 0.0F) {
            float var2 = this.field5414 / (this.field5447 + this.field5414);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field5421 * (-var2 + 1.0F) / this.field5447;
            this.field5342[14] = this.field5421 * var3;
            this.field5342[10] = this.field5424 + var4;
        } else {
            this.field5342[14] = this.field5421;
            this.field5342[10] = this.field5424;
        }
        if (arg0 != 1) {
            this.field5436 = 1.796463F;
        }
        this.field5392 = (float) this.field5366 + -this.field5447;
        this.field5357 = (this.field5342[14] - (float) this.field5366) / this.field5342[10];
    }

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "(II)V", line = 1616)
    public final synchronized void method2257(int arg0, int arg1) {
        if (arg0 < 0) {
            this.field5375 = 93;
        }
        ++field5298;
        class488 var3 = new class488(arg1);
        this.field5329.method975(0, var3);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(JI)V", line = 1629)
    public final synchronized void method2258(long arg0, int arg1) {
        if (arg1 <= -107) {
            ++field5138;
            class435 var4 = new class435();
            var4.field6348 = arg0;
            this.field5332.method975(0, var4);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lse;I)V", line = 1643)
    public final void method2259(class170 arg0, int arg1) {
        if (this.field5426 != arg0) {
            if (this.field5349) {
                OpenGL.glBindBufferARB(34962, arg0.method166(false));
            }
            this.field5426 = arg0;
        }
        ++field5111;
        if (arg1 != -9632) {
            this.method1214(-70, -31, (int[][]) null, (int[][]) null, 102, 22, -55);
        }
    }

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "(II)V", line = 1662)
    public final void method2260(int arg0, int arg1) {
        ++field5251;
        if (arg0 != 16640) {
            this.method1152((Rectangle[]) null, -72);
        }
        if (~arg1 != -2) {
            if (~arg1 != -1) {
                if (arg1 != 2) {
                    if (arg1 == 3) {
                        this.method2269(260, 8960, 8448);
                        return;
                    }
                    if (~arg1 == -5) {
                        this.method2269(34023, arg0 ^ 25088, 34023);
                        return;
                    }
                } else {
                    this.method2269(34165, arg0 + -7680, 7681);
                }
            } else {
                this.method2269(8448, 8960, 8448);
            }
        } else {
            this.method2269(7681, 8960, 7681);
        }
    }

    @OriginalMember(owner = "client!ur", name = "p", descriptor = "(I)V", line = 1691)
    public static void method2261(int arg0) {
        field5277 = null;
        field5225 = null;
        if (arg0 > 125) {
            field5305 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 1703)
    public final void method1205(Canvas arg0) {
        ++field5192;
        if (this.field5151 == arg0) {
            throw new RuntimeException();
        } else if (this.field5261.containsKey(arg0)) {
            Long var2 = (Long) this.field5261.get(arg0);
            this.field5205.releaseSurface(arg0, var2);
            this.field5261.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)I", line = 1721)
    public final int method1191(int arg0, int arg1) {
        ++field5244;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!ur", name = "JA", descriptor = "(F)V", line = 1732)
    public final void method1139(float arg0) {
        if (this.field5337 != arg0) {
            this.field5337 = arg0;
            this.method2275(16568);
        }
        ++field5145;
    }

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "(B)V", line = 1747)
    private final void method2262(byte arg0) {
        ++field5110;
        if (this.field5388 && !this.field5380) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 != 86) {
            this.method2233((byte) 32);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZI)V", line = 1764)
    public final void method2263(boolean arg0, int arg1) {
        if (arg1 != 1) {
            this.method2300(25);
        }
        if (arg0 == !this.field5380) {
            this.field5380 = arg0;
            this.method2262((byte) 86);
        }
        ++field5240;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lju;I)V", line = 1781)
    public final void method2264(class83 arg0, int arg1) {
        ++field5180;
        int var3 = 102 / ((arg1 - 55) / 36);
        if (this.field5385) {
            this.method2249((byte) 63, arg0);
            this.method2297(-4, arg0);
        } else if (~this.field5318 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field5318 <= -1) {
                this.field5319[this.field5318].method462(6822);
            }
            this.field5320 = this.field5322 = this.field5319[++this.field5318] = arg0;
            this.field5320.method459(125);
        }
    }

    @OriginalMember(owner = "client!ur", name = "P", descriptor = "(IIIIII)V", line = 1809)
    public final void method1153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5190;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method2241(-3874);
        this.method2279(arg5, (byte) 60);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5381) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5381) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ur", name = "x", descriptor = "()V", line = 1842)
    public final void method1188() {
        this.method2289((byte) 119, true);
        ++field5268;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lgf;[Lev;Z)Lla;", line = 1853)
    public final class316 method1201(class183 arg0, class491[] arg1, boolean arg2) {
        ++field5187;
        return new class501(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIIILta;II)V", line = 1861)
    public final void method1126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class144 arg6, int arg7, int arg8) {
        ++field5286;
        class357 var10 = (class357) arg6;
        class67 var11 = var10.field4863;
        this.method2273((byte) 89);
        this.method2236(var10.field4863, -55);
        this.method2279(arg5, (byte) 114);
        this.method2269(7681, 8960, 8448);
        this.method2229(34167, (byte) -18, 0, 768);
        float var12 = var11.field770 / (float) var11.field765;
        float var13 = var11.field769 / (float) var11.field766;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method2229(5890, (byte) -18, 0, 768);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "()Z", line = 1895)
    public final boolean method1202() {
        ++field5234;
        return true;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Leu;)V", line = 1904)
    public final void method1131(class336 arg0) {
        ++field5185;
        this.field5287.method3118(arg0, this, 25796);
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(Z)V", line = 1912)
    private final void method2265(boolean arg0) {
        ++field5162;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field5342, 0);
        OpenGL.glMatrixMode(5888);
        if (arg0) {
            this.method1185(-73, -4, -38, -125, 25);
        }
    }

    @OriginalMember(owner = "client!ur", name = "s", descriptor = "()Z", line = 1927)
    public final boolean method1199() {
        ++field5217;
        return false;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "()Z", line = 1936)
    public final boolean method1154() {
        ++field5285;
        return false;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZZ)V", line = 1944)
    public final void method2266(int arg0, boolean arg1, boolean arg2) {
        if (!arg2) {
            ++field5158;
            this.method2303(arg1, arg0, -11460, true);
        }
    }

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "(B)V", line = 1955)
    private final void method2267(byte arg0) {
        if (arg0 != 97) {
            this.field5454 = null;
        }
        ++field5253;
        if (this.field5449 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field5220 < -1 && ~this.field5125 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field5220, (double) this.field5125, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field5449 = 1;
            this.field5408 &= -25;
        }
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "()Lc;", line = 1980)
    public final class124 method1125() {
        ++field5210;
        return new class257();
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(II)V", line = 1988)
    public final void method1200(int arg0, int arg1) {
        if (this.field5400 != arg0 || ~this.field5366 != ~arg1) {
            this.field5400 = arg0;
            this.field5366 = arg1;
            this.method2280(75);
            this.method2286((byte) 8);
            if (~this.field5449 != -4) {
                if (this.field5449 == 2) {
                    this.method2265(false);
                }
            } else {
                this.method2291(0);
            }
        }
        ++field5274;
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)V", line = 2015)
    public final void method1171(int arg0) {
        ++field5209;
        this.method2288(105);
    }

    @OriginalMember(owner = "client!ur", name = "q", descriptor = "(I)Lsa;", line = 2027)
    public final class139 method2268(int arg0) {
        if (arg0 != 30323) {
            this.method2228(78, (class83) null);
        }
        ++field5175;
        return this.field5364 != null ? this.field5364.method251((byte) -127) : null;
    }

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "()Z", line = 2039)
    public final boolean method1237() {
        ++field5172;
        return true;
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;ILfq;)V", line = 2048)
    public class377(int arg0, Canvas arg1, class16 arg2, int arg3, class137 arg4) {
        super(arg0, arg2);
        new class330();
        new class50(16);
        this.field5323 = new class167();
        this.field5327 = new class167();
        this.field5328 = new class167();
        this.field5329 = new class167();
        this.field5330 = new class167();
        this.field5331 = new class167();
        this.field5332 = new class167();
        this.field5348 = 0;
        this.field5371 = 0;
        this.field5361 = true;
        this.field5370 = 0;
        this.field5387 = -1;
        this.field5347 = new float[4];
        this.field5392 = 3584.0F;
        this.field5396 = new class309[class464.field6910];
        this.field5368 = new float[4];
        this.field5411 = 512;
        this.field5355 = 8448;
        this.field5376 = -1;
        this.field5367 = 0;
        this.field5394 = -1;
        this.field5416 = 8448;
        this.field5350 = 1.0F;
        this.field5395 = 0;
        this.field5340 = 0;
        this.field5342 = new float[16];
        this.field5393 = 512;
        this.field5351 = new float[4];
        this.field5345 = new float[4];
        this.field5360 = 1.0F;
        this.field5400 = 50;
        this.field5366 = 3584;
        this.field5353 = 1.0F;
        this.field5414 = 3000.0F;
        this.field5406 = 0;
        this.field5357 = 3584.0F;
        this.field5434 = -1.0F;
        this.field5445 = 0;
        this.field5438 = 1.0F;
        this.field5440 = -1;
        this.field5436 = -1.0F;
        this.field5448 = 1.0F;
        this.field5439 = 0.0F;
        this.field5415 = -1;
        this.field5402 = 0;
        this.field5435 = 0;
        this.field5372 = new class408(8192);
        this.field5451 = new int[1];
        this.field5454 = new int[1];
        this.field5456 = new byte[16384];
        this.field5455 = new int[1];
        this.field5284 = arg3;
        this.field5262 = this.field5151 = arg1;
        try {
            if (class286.field3763 == null || !class286.field3763) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class286.field3763 = Boolean.TRUE;
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
                            System.load(arg4.method851(124, "jaggl.dll").toString());
                        } else {
                            System.load(arg4.method851(112, "libjaggl.jnilib").toString());
                        }
                    } else {
                        System.load(arg4.method851(79, "libjaggl.so").toString());
                    }
                    class286.field3763 = Boolean.TRUE;
                }
            }
            if (class286.field3763 != null && class286.field3763) {
                this.field5205 = new OpenGL();
                this.field5213 = this.field5249 = this.field5205.init(arg1, 8, 8, 8, 24, 0, this.field5284);
                if (~this.field5249 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method2251(-115);
                    int var7 = this.method2239((byte) -115);
                    if (~var7 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field5437 = this.field5334 ? 33639 : 5121;
                        if (this.field5423.indexOf("radeon") != -1) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class436.method2679((byte) 56, ' ', this.field5423.replace('/', ' '));
                            for (int var12 = 0; var11.length > var12; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (~var13.length() < -1) {
                                        if (var13.charAt(0) == 'x' && var13.length() >= 3 && class204.method1301((byte) 43, var13.substring(1, 3))) {
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
                                            if (~var13.length() <= -5 && class204.method1301((byte) 43, var13.substring(0, 4))) {
                                                var8 = class304.method1819((byte) -109, var13.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var10 && !var9) {
                                if (var8 >= 7000 && ~var8 >= -9251) {
                                    this.field5383 = false;
                                }
                                if (var8 >= 7000 && ~var8 >= -8000) {
                                    this.field5349 = false;
                                }
                            }
                            if (!var9 || var8 < 4000) {
                                this.field5404 = false;
                            }
                            this.field5374 &= this.field5205.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field5390 = true;
                            this.field5344 = this.field5349;
                        }
                        if (~this.field5389.indexOf("intel") != 0) {
                            this.field5417 = false;
                        }
                        this.field5339 = !this.field5389.equals("s3 graphics");
                        if (this.field5349) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class66.method388(false, true, 0);
                        this.field5309 = true;
                        this.field5304 = new class298(this, super.field3772);
                        this.method2255((byte) -118);
                        this.field5314 = new class321(this);
                        this.field5297 = new class414(this);
                        if (this.field5297.method2532(1)) {
                            this.field5288 = new class490(this);
                            if (!this.field5288.method2961((byte) -119)) {
                                this.field5288.method1659(-118);
                                this.field5288 = null;
                            }
                        }
                        this.field5290 = new class62(this);
                        this.method2244((byte) -103);
                        this.method2234(79);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field5205.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (~(var15++) < -6) {
                                    throw new RuntimeException("");
                                }
                                class316.method1873(100L, false);
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
            this.method1179();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(IIIIZ)Lo;", line = 2254)
    public final class24 method1216(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5153;
        return new class69(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(IIIIII)V", line = 2263)
    public final void method1228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2241(-3874);
        ++field5279;
        this.method2279(arg5, (byte) 60);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)V", line = 2280)
    public final void method2269(int arg0, int arg1, int arg2) {
        ++field5270;
        if (arg1 != 8960) {
            this.field5415 = 62;
        }
        if (this.field5375 != 0) {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        } else {
            boolean var4 = false;
            if (~this.field5416 != ~arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                var4 = true;
                this.field5416 = arg0;
            }
            if (~this.field5355 != ~arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                var4 = true;
                this.field5355 = arg2;
            }
            if (var4) {
                this.field5408 &= -30;
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "(B)V", line = 2328)
    private final void method2270(byte arg0) {
        ++field5107;
        OpenGL.glViewport(this.field5402, this.field5348, this.field5220, this.field5125);
        if (arg0 != -87) {
            this.method2291(104);
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(BLju;)V", line = 2339)
    public final void method2271(byte arg0, class83 arg1) {
        ++field5283;
        if (arg0 == 39) {
            if (this.field5385) {
                this.method2245(arg0 + -109, arg1);
                this.method2228(58, arg1);
            } else if (this.field5318 >= 0 && this.field5319[this.field5318] == arg1) {
                this.field5319[this.field5318--] = null;
                arg1.method462(6822);
                if (~this.field5318 <= -1) {
                    this.field5320 = this.field5322 = this.field5319[this.field5318];
                    this.field5320.method459(118);
                } else {
                    this.field5320 = this.field5322 = null;
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "(B)V", line = 2377)
    public final void method2272(byte arg0) {
        if (~this.field5449 != -1) {
            this.field5449 = 0;
            this.field5408 &= -32;
        }
        ++field5119;
        if (arg0 < 120) {
            this.field5379 = true;
        }
    }

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "(B)V", line = 2396)
    public final void method2273(byte arg0) {
        if (arg0 <= 44) {
            this.field5304 = null;
        }
        if (~this.field5408 != -3) {
            this.method2267((byte) 97);
            this.method2298(false, -12481);
            this.method2230(-13721, false);
            this.method2235(false, (byte) -46);
            this.method2289((byte) 123, false);
            this.method2299(-2, (byte) 72);
            this.field5408 = 2;
        }
        ++field5282;
    }

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "(I)V", line = 2420)
    public final void method1233(int arg0) {
        ++field5183;
        if (arg0 >= 128 && arg0 <= 1024) {
            this.field5303 = arg0;
            this.field5304.method1781((byte) -125);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ur", name = "aa", descriptor = "()F", line = 2438)
    public final float method1155() {
        ++field5263;
        return this.field5447;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(Z)V", line = 2450)
    public final void method1175(boolean arg0) {
        this.field5361 = arg0;
        ++field5120;
        this.method2233((byte) -94);
    }

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "()V", line = 2463)
    public final void method1158() {
        ++field5106;
    }

    @OriginalMember(owner = "client!ur", name = "T", descriptor = "()F", line = 2474)
    public final float method1223() {
        ++field5202;
        return this.field5414;
    }

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "(B)V", line = 2482)
    private final void method2274(byte arg0) {
        int var2 = 68 / ((-71 - arg0) / 39);
        if (~this.field5449 != -4) {
            this.field5449 = 3;
            this.method2291(0);
            this.method2305((byte) -101);
            this.field5408 &= -8;
        }
        ++field5259;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ln;)V", line = 2500)
    public final void method1225(class15 arg0) {
        ++field5291;
        this.field5312 = ((class402) arg0).field5821;
        if (this.field5403 == null) {
            class408 var2 = new class408(80);
            if (this.field5334) {
                var2.method2498(-123, -1.0F);
                var2.method2498(-123, -1.0F);
                var2.method2498(-123, 0.0F);
                var2.method2498(-123, 0.0F);
                var2.method2498(-123, 1.0F);
                var2.method2498(-123, 1.0F);
                var2.method2498(-123, -1.0F);
                var2.method2498(-123, 0.0F);
                var2.method2498(-123, 1.0F);
                var2.method2498(-123, 1.0F);
                var2.method2498(-123, 1.0F);
                var2.method2498(-123, 1.0F);
                var2.method2498(-123, 0.0F);
                var2.method2498(-123, 1.0F);
                var2.method2498(-123, 0.0F);
                var2.method2498(-123, -1.0F);
                var2.method2498(-123, 1.0F);
                var2.method2498(-123, 0.0F);
                var2.method2498(-123, 0.0F);
                var2.method2498(-123, 0.0F);
            } else {
                var2.method2497((byte) -53, -1.0F);
                var2.method2497((byte) -126, -1.0F);
                var2.method2497((byte) 117, 0.0F);
                var2.method2497((byte) 125, 0.0F);
                var2.method2497((byte) 127, 1.0F);
                var2.method2497((byte) 119, 1.0F);
                var2.method2497((byte) -61, -1.0F);
                var2.method2497((byte) 126, 0.0F);
                var2.method2497((byte) 127, 1.0F);
                var2.method2497((byte) 119, 1.0F);
                var2.method2497((byte) -48, 1.0F);
                var2.method2497((byte) 117, 1.0F);
                var2.method2497((byte) -123, 0.0F);
                var2.method2497((byte) -40, 1.0F);
                var2.method2497((byte) 124, 0.0F);
                var2.method2497((byte) -116, -1.0F);
                var2.method2497((byte) 119, 1.0F);
                var2.method2497((byte) 5, 0.0F);
                var2.method2497((byte) 122, 0.0F);
                var2.method2497((byte) 117, 0.0F);
            }
            this.field5403 = this.method2307(var2.field5761, 7938, var2.field5729, false, 20);
            this.field5418 = new class374(this.field5403, 5126, 3, 0);
            this.field5442 = new class374(this.field5403, 5126, 2, 12);
            this.field5287.method3121((byte) 84, this);
        }
    }

    @OriginalMember(owner = "client!ur", name = "r", descriptor = "(I)V", line = 2566)
    private final void method2275(int arg0) {
        class127.field1650[1] = this.field5353 * this.field5337;
        ++field5221;
        class127.field1650[0] = this.field5448 * this.field5337;
        class127.field1650[2] = this.field5438 * this.field5337;
        if (arg0 == 16568) {
            class127.field1650[3] = 1.0F;
            OpenGL.glLightModelfv(2899, class127.field1650, 0);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IB)V", line = 2586)
    public final void method2276(int arg0, byte arg1) {
        ++field5201;
        class127.field1650[0] = (float) class95.method534(16711680, arg0) / 1.671168E7F;
        class127.field1650[3] = (float) (arg0 >>> 24) / 255.0F;
        class127.field1650[1] = (float) class95.method534(arg0, 65280) / 65280.0F;
        class127.field1650[2] = (float) class95.method534(arg0, 255) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class127.field1650, 0);
        if (arg1 != -22) {
            this.field5432 = true;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "([IIIII)Lo;", line = 2601)
    public final class24 method1218(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5109;
        return new class69(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BIII)V", line = 2609)
    public final void method2277(byte arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg2 + 34184, arg3);
        ++field5129;
        int var5 = 42 / ((arg0 - -55) / 44);
        OpenGL.glTexEnvi(8960, arg2 + 34200, arg1);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IBI)V", line = 2620)
    public final synchronized void method2278(int arg0, byte arg1, int arg2) {
        ++field5116;
        class488 var4 = new class488(arg2);
        var4.field6348 = (long) arg0;
        this.field5327.method975(0, var4);
        int var5 = 34 / ((arg1 - 49) / 34);
    }

    @OriginalMember(owner = "client!ur", name = "q", descriptor = "()Z", line = 2633)
    public final boolean method1144() {
        ++field5193;
        return true;
    }

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "()Z", line = 2641)
    public final boolean method1129() {
        ++field5194;
        return true;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(IB)V", line = 2649)
    public final void method2279(int arg0, byte arg1) {
        if (arg1 > 8) {
            if (this.field5359 != arg0) {
                boolean var3;
                byte var4;
                boolean var5;
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (~arg0 != -129) {
                            var3 = false;
                            var4 = 0;
                            var5 = true;
                        } else {
                            var5 = true;
                            var3 = true;
                            var4 = 3;
                        }
                    } else {
                        var4 = 2;
                        var5 = true;
                        var3 = false;
                    }
                } else {
                    var4 = 1;
                    var5 = true;
                    var3 = true;
                }
                if (this.field5420 != var5) {
                    OpenGL.glColorMask(var5, var5, var5, true);
                    this.field5420 = var5;
                }
                if (!this.field5338 == var3) {
                    if (var3) {
                        OpenGL.glEnable(3008);
                    } else {
                        OpenGL.glDisable(3008);
                    }
                    this.field5338 = var3;
                }
                if (~this.field5429 != ~var4) {
                    if (var4 != 1) {
                        if (var4 == 2) {
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
                    this.field5429 = var4;
                }
                this.field5359 = arg0;
                this.field5408 &= -29;
            }
            ++field5171;
        }
    }

    @OriginalMember(owner = "client!ur", name = "MA", descriptor = "([I)V", line = 2742)
    public final void method1163(int[] arg0) {
        arg0[3] = this.field5340;
        arg0[2] = this.field5395;
        ++field5164;
        arg0[0] = this.field5370;
        arg0[1] = this.field5406;
    }

    @OriginalMember(owner = "client!ur", name = "HA", descriptor = "(IIII)V", line = 2753)
    public final void method1134(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field5395 < ~arg2) {
            this.field5395 = arg2;
        }
        ++field5230;
        if (~arg0 < ~this.field5370) {
            this.field5370 = arg0;
        }
        if (this.field5406 < arg1) {
            this.field5406 = arg1;
        }
        if (arg3 < this.field5340) {
            this.field5340 = arg3;
        }
        OpenGL.glEnable(3089);
        this.method2226((byte) -64);
        this.method2300(1);
    }

    @OriginalMember(owner = "client!ur", name = "ba", descriptor = "(IIII)V", line = 2780)
    public final void method1182(int arg0, int arg1, int arg2, int arg3) {
        if (~arg0 > -1) {
            arg0 = 0;
        }
        ++field5198;
        if (this.field5125 < arg3) {
            arg3 = this.field5125;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (this.field5220 < arg2) {
            arg2 = this.field5220;
        }
        this.field5340 = arg3;
        this.field5406 = arg1;
        this.field5395 = arg2;
        this.field5370 = arg0;
        OpenGL.glEnable(3089);
        this.method2226((byte) -64);
        this.method2300(1);
    }

    @OriginalMember(owner = "client!ur", name = "s", descriptor = "(I)V", line = 2810)
    private final void method2280(int arg0) {
        ++field5223;
        float[] var2 = this.field5342;
        float var3 = (float) (-this.field5435 * this.field5400) / (float) this.field5411;
        float var4 = (float) ((-this.field5435 + this.field5220) * this.field5400) / (float) this.field5411;
        float var5 = (float) (this.field5400 * this.field5371) / (float) this.field5393;
        float var6 = (float) ((-this.field5125 + this.field5371) * this.field5400) / (float) this.field5393;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field5400 * 2.0F;
            var2[7] = 0.0F;
            var2[11] = -1.0F;
            var2[3] = 0.0F;
            var2[2] = 0.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[1] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[4] = 0.0F;
            var2[13] = 0.0F;
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[10] = this.field5424 = (float) (-(this.field5366 - -this.field5400)) / (float) (this.field5366 - this.field5400);
            var2[15] = 0.0F;
            var2[14] = this.field5421 = -((float) this.field5366 * var7) / (float) (-this.field5400 + this.field5366);
            var2[5] = var7 / (-var6 + var5);
            var2[6] = 0.0F;
            var2[12] = 0.0F;
        } else {
            var2[9] = 0.0F;
            var2[2] = 0.0F;
            var2[4] = 0.0F;
            var2[14] = 0.0F;
            var2[11] = 0.0F;
            var2[6] = 0.0F;
            var2[15] = 1.0F;
            var2[0] = 1.0F;
            var2[13] = 0.0F;
            var2[1] = 0.0F;
            var2[10] = 1.0F;
            var2[3] = 0.0F;
            var2[8] = 0.0F;
            var2[7] = 0.0F;
            var2[12] = 0.0F;
            var2[5] = 1.0F;
        }
        this.method2256(1);
        int var8 = -87 / ((6 - arg0) / 62);
    }

    @OriginalMember(owner = "client!ur", name = "VA", descriptor = "(IIIIII)Z", line = 2871)
    public final boolean method1209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5117;
        float var7 = (float) arg2 * this.field5425.field3411 + (float) arg0 * this.field5425.field3437 + (float) arg1 * this.field5425.field3410 + this.field5425.field3426;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field5425.field3411 + (float) arg3 * this.field5425.field3437 + (float) arg4 * this.field5425.field3410 + this.field5425.field3426;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field5400) || !(var8 < (float) this.field5400)) && (!(var7 > (float) this.field5366) || !(var8 > (float) this.field5366))) {
            int var9 = (int) (((float) arg2 * this.field5425.field3424 + (float) arg0 * this.field5425.field3431 + (float) arg1 * this.field5425.field3427 + this.field5425.field3412) * (float) this.field5411 / var7);
            int var10 = (int) (((float) arg5 * this.field5425.field3424 + (float) arg3 * this.field5425.field3431 + (float) arg4 * this.field5425.field3427 + this.field5425.field3412) * (float) this.field5411 / var8);
            if ((float) var9 < this.field5441 && (float) var10 < this.field5441 || (float) var9 > this.field5443 && this.field5443 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field5425.field3414 + (float) arg0 * this.field5425.field3405 + (float) arg1 * this.field5425.field3429 + this.field5425.field3432) * (float) this.field5393 / var7);
                int var12 = (int) (((float) arg5 * this.field5425.field3414 + (float) arg3 * this.field5425.field3405 + (float) arg4 * this.field5425.field3429 + this.field5425.field3432) * (float) this.field5393 / var8);
                return (!(this.field5362 > (float) var11) || !((float) var12 < this.field5362)) && (!(this.field5446 < (float) var11) || !(this.field5446 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lfe;B)V", line = 2907)
    public final void method2281(class404 arg0, byte arg1) {
        ++field5136;
        if (this.field5377 != arg0) {
            if (this.field5349) {
                OpenGL.glBindBufferARB(34963, arg0.method1468(false));
            }
            this.field5377 = arg0;
        }
        if (arg1 != 66) {
            this.field5454 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lev;Z)Lo;", line = 2926)
    public final class24 method1236(class491 arg0, boolean arg1) {
        ++field5260;
        int[] var3 = new int[arg0.field7196 * arg0.field7191];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field7198 == null) {
            for (int var6 = 0; ~var6 > ~arg0.field7191; ++var6) {
                for (int var7 = 0; var7 < arg0.field7196; ++var7) {
                    int var8 = arg0.field7197[255 & arg0.field7192[var4++]];
                    var3[var5++] = var8 != 0 ? class219.method1381(-16777216, var8) : 0;
                }
            }
        } else {
            for (int var9 = 0; var9 < arg0.field7191; ++var9) {
                for (int var11 = 0; ~arg0.field7196 < ~var11; ++var11) {
                    var3[var5++] = class219.method1381(arg0.field7198[var4] << 24, arg0.field7197[class95.method534(arg0.field7192[var4], 255)]);
                    ++var4;
                }
            }
        }
        class24 var10 = this.method1218(var3, 0, arg0.field7196, arg0.field7196, arg0.field7191);
        var10.method147(arg0.field7195, arg0.field7199, arg0.field7193, arg0.field7194);
        return var10;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIIIIIII)V", line = 2989)
    public final void method1212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5229;
    }

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "(B)V", line = 2998)
    public final void method2282(byte arg0) {
        if (arg0 <= 15) {
            this.method1184(false);
        }
        if (this.field5408 != 8) {
            this.method2231((byte) -47);
            this.method2298(true, -12481);
            this.method2235(true, (byte) -46);
            this.method2289((byte) 118, true);
            this.method2279(1, (byte) 30);
            this.method2260(16640, 0);
            this.field5408 = 8;
        }
        ++field5168;
    }

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "(II)I", line = 3024)
    public final int method2283(int arg0, int arg1) {
        ++field5301;
        if (arg1 != -5125) {
            this.field5456 = null;
        }
        if (~arg0 != -5122 && arg0 != 5120) {
            if (~arg0 != -5124 && arg0 != 5122) {
                if (~arg0 != -5126 && ~arg0 != -5125 && arg0 != 5126) {
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

    @OriginalMember(owner = "client!ur", name = "SA", descriptor = "(Lc;)V", line = 3045)
    public final void method1227(class124 arg0) {
        ++field5144;
        this.field5425 = (class257) arg0;
        this.field5346.method1584((byte) -82, this.field5425);
        if (this.field5449 != 1) {
            this.method2305((byte) -45);
        }
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(IIII)I", line = 3059)
    public static final int method2284(int arg0, int arg1, int arg2, int arg3) {
        ++field5150;
        if (arg1 != -25669) {
            method2252((byte) -122);
        }
        if (arg2 <= 243) {
            if (~arg2 < -218) {
                arg0 >>= 3;
            } else if (~arg2 < -193) {
                arg0 >>= 2;
            } else if (arg2 > 179) {
                arg0 >>= 1;
            }
        } else {
            arg0 >>= 4;
        }
        return ((arg3 >> 2 & 63) << 10) + (arg0 >> 5 << 7) + (arg2 >> 1);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I[Lbn;)V", line = 3086)
    public final void method1146(int arg0, class309[] arg1) {
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field5396[var3] = arg1[var3];
        }
        ++field5126;
        this.field5422 = arg0;
        if (this.field5449 != 1) {
            this.method2238(-40);
        }
    }

    @OriginalMember(owner = "client!ur", name = "p", descriptor = "(B)V", line = 3107)
    public final void method2285(byte arg0) {
        if (~this.field5408 != -5) {
            this.method2267((byte) 97);
            this.method2298(false, -12481);
            this.method2230(-13721, false);
            this.method2235(false, (byte) -46);
            this.method2289((byte) 124, false);
            this.method2299(-2, (byte) 98);
            this.method2279(1, (byte) 37);
            this.method2260(16640, 0);
            this.field5408 = 4;
        }
        if (arg0 < 42) {
            this.method2285((byte) 126);
        }
        ++field5148;
    }

    @OriginalMember(owner = "client!ur", name = "q", descriptor = "(B)V", line = 3135)
    private final void method2286(byte arg0) {
        ++field5215;
        int var2;
        if (!this.field5354) {
            this.field5427 = (float) (-this.field5367 + this.field5366) + -this.field5439;
            this.field5335 = this.field5427 - (float) this.field5387 * this.field5360;
            if ((float) this.field5400 > this.field5335) {
                this.field5335 = (float) this.field5400;
            }
            OpenGL.glFogf(2915, this.field5335);
            OpenGL.glFogf(2916, this.field5427);
            var2 = this.field5440;
        } else {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field5415;
        }
        class127.field1650[2] = (float) class95.method534(255, var2) / 255.0F;
        class127.field1650[1] = (float) class95.method534(var2, 65280) / 65280.0F;
        class127.field1650[0] = (float) class95.method534(16711680, var2) / 1.671168E7F;
        OpenGL.glFogfv(2918, class127.field1650, 0);
        if (arg0 != 8) {
            this.method1206();
        }
        if (this.field5354) {
            this.field5290.field722.method1116(-126);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIBLjaggl/memory/NativeBuffer;Z)Lse;", line = 3173)
    public final class170 method2287(int arg0, int arg1, byte arg2, NativeBuffer arg3, boolean arg4) {
        if (arg2 >= -31) {
            return null;
        } else {
            ++field5114;
            return (class170) (!this.field5349 || arg4 && !this.field5344 ? new class27(this, arg1, arg3) : new class499(this, arg1, arg3, arg0, arg4));
        }
    }

    @OriginalMember(owner = "client!ur", name = "u", descriptor = "(I)V", line = 3194)
    private final void method2288(int arg0) {
        int var2 = -15 % ((39 - arg0) / 32);
        this.field5205.detach();
        ++field5227;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIII)V", line = 3205)
    public final void method1137(int arg0, int arg1, int arg2, int arg3) {
        ++field5258;
        if (!this.field5354) {
            throw new RuntimeException("");
        } else {
            this.field5415 = arg1;
            this.field5376 = arg2;
            this.field5445 = arg3;
            this.field5365 = arg0;
            this.field5290.field722.method1117(36);
            this.method2286((byte) 8);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BZ)V", line = 3226)
    public final void method2289(byte arg0, boolean arg1) {
        if (!this.field5363 == arg1) {
            this.field5363 = arg1;
            this.method2233((byte) 112);
            this.field5408 &= -32;
        }
        if (arg0 <= 113) {
            this.field5325 = -33;
        }
        ++field5108;
    }

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "(Z)V", line = 3249)
    private final void method2290(boolean arg0) {
        if (this.field5405 && ~this.field5387 <= -1 | this.field5354) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field5207;
        if (arg0) {
            this.field5297 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "v", descriptor = "(I)V", line = 3266)
    private final void method2291(int arg0) {
        ++field5123;
        float var2 = (float) (-this.field5435) * this.field5350 / (float) this.field5411;
        float var3 = (float) (-this.field5371) * this.field5350 / (float) this.field5393;
        float var4 = (float) (this.field5220 - this.field5435) * this.field5350 / (float) this.field5411;
        float var5 = (float) (-this.field5371 + this.field5125) * this.field5350 / (float) this.field5393;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (arg0 != 0) {
            this.field5455 = null;
        }
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field5400 - this.field5447), (double) ((float) this.field5366 + -this.field5447));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(IZ)I", line = 3299)
    public final int method2292(int arg0, boolean arg1) {
        ++field5186;
        if (!arg1) {
            this.field5303 = 108;
        }
        if (arg0 != 1) {
            if (~arg0 == -1) {
                return 8448;
            } else if (arg0 == 2) {
                return 34165;
            } else if (~arg0 == -4) {
                return 260;
            } else if (arg0 == 4) {
                return 34023;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ltp;Ltp;Ltp;ILtp;)V", line = 3332)
    public final void method2293(class374 arg0, class374 arg1, class374 arg2, int arg3, class374 arg4) {
        if (arg3 == 32884) {
            if (arg0 == null) {
                OpenGL.glDisableClientState(32884);
            } else {
                this.method2259(arg0.field5070, -9632);
                OpenGL.glVertexPointer(arg0.field5069, arg0.field5071, this.field5426.method164(19781), this.field5426.method163(-242) + (long) arg0.field5068);
                OpenGL.glEnableClientState(32884);
            }
            ++field5231;
            if (arg4 == null) {
                OpenGL.glDisableClientState(32885);
            } else {
                this.method2259(arg4.field5070, -9632);
                OpenGL.glNormalPointer(arg4.field5071, this.field5426.method164(19781), this.field5426.method163(-242) - -((long) arg4.field5068));
                OpenGL.glEnableClientState(32885);
            }
            if (arg2 != null) {
                this.method2259(arg2.field5070, -9632);
                OpenGL.glColorPointer(arg2.field5069, arg2.field5071, this.field5426.method164(arg3 + -13103), this.field5426.method163(-242) - -((long) arg2.field5068));
                OpenGL.glEnableClientState(32886);
            } else {
                OpenGL.glDisableClientState(32886);
            }
            if (arg1 != null) {
                this.method2259(arg1.field5070, -9632);
                OpenGL.glTexCoordPointer(arg1.field5069, arg1.field5071, this.field5426.method164(arg3 + -13103), this.field5426.method163(-242) + (long) arg1.field5068);
                OpenGL.glEnableClientState(32888);
            } else {
                OpenGL.glDisableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "ZA", descriptor = "(IIIII)V", line = 3378)
    public final void method1136(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5233;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!ur", name = "w", descriptor = "()V", line = 3388)
    public final void method1179() {
        ++field5163;
        for (class435 var1 = this.field5313.method970(12); var1 != null; var1 = this.field5313.method976((byte) 9)) {
            ((class402) var1).method2482(false);
        }
        if (this.field5297 != null) {
            this.field5297.method2530((byte) -124);
        }
        if (this.field5205 != null) {
            this.method2288(-106);
            Enumeration var2 = this.field5261.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field5261.get(var3);
                this.field5205.releaseSurface(var3, var4);
            }
            this.field5205.release();
            this.field5205 = null;
        }
        if (this.field5309) {
            class392.method2366(false, (byte) -88, true);
            this.field5309 = false;
        }
    }

    @OriginalMember(owner = "client!ur", name = "IA", descriptor = "(IIIII)V", line = 3433)
    public final void method1185(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5166;
        this.method2241(-3874);
        this.method2279(arg4, (byte) 93);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ur", name = "GA", descriptor = "(IIII)V", line = 3454)
    public final void method1221(int arg0, int arg1, int arg2, int arg3) {
        this.field5393 = arg3;
        this.field5435 = arg0;
        this.field5371 = arg1;
        this.field5411 = arg2;
        ++field5149;
        this.method2280(97);
        this.method2226((byte) -64);
        if (this.field5449 == 3) {
            this.method2291(0);
        } else if (this.field5449 == 2) {
            this.method2265(false);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IF)V", line = 3476)
    public final void method2294(int arg0, float arg1) {
        ++field5121;
        if (this.field5350 != arg1) {
            this.field5350 = arg1;
            if (~this.field5449 == -4) {
                this.method2291(0);
            }
        }
        if (arg0 != 3405) {
            this.method1163((int[]) null);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "([Le;Leu;Lc;[Lut;I)V", line = 3494)
    public final void method1156(class373[] arg0, class336 arg1, class124 arg2, class82[] arg3, int arg4) {
        this.method1170(arg0, arg2, arg3, arg4);
        ++field5302;
        this.method1131(arg1);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIB)V", line = 3506)
    public final void method2295(int arg0, int arg1, int arg2, byte arg3) {
        OpenGL.glDrawArrays(arg0, arg1, arg2);
        if (arg3 < 9) {
            this.method1213((class131) null, -124, -54, 46, 42);
        }
        ++field5241;
    }

    @OriginalMember(owner = "client!ur", name = "ra", descriptor = "(ILta;II)V", line = 3519)
    public final void method1220(int arg0, class144 arg1, int arg2, int arg3) {
        ++field5146;
        class357 var5 = (class357) arg1;
        class67 var6 = var5.field4863;
        this.method2273((byte) 84);
        this.method2236(var5.field4863, -123);
        this.method2279(1, (byte) 22);
        this.method2269(7681, 8960, 8448);
        this.method2229(34167, (byte) -18, 0, 768);
        float var7 = var6.field770 / (float) var6.field765;
        float var8 = var6.field769 / (float) var6.field766;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (this.field5370 - arg2) * var7, (float) (-arg3 + this.field5406) * var8);
        OpenGL.glVertex2i(this.field5370, this.field5406);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5370) * var7, (float) (-arg3 + this.field5340) * var8);
        OpenGL.glVertex2i(this.field5370, this.field5340);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5395) * var7, (float) (-arg3 + this.field5340) * var8);
        OpenGL.glVertex2i(this.field5395, this.field5340);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5395) * var7, (float) (-arg3 + this.field5406) * var8);
        OpenGL.glVertex2i(this.field5395, this.field5406);
        OpenGL.glEnd();
        this.method2229(5890, (byte) -18, 0, 768);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "([Le;Lc;[Lut;I)V", line = 3551)
    public final void method1170(class373[] arg0, class124 arg1, class82[] arg2, int arg3) {
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method2051(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
        ++field5130;
    }

    @OriginalMember(owner = "client!ur", name = "r", descriptor = "(B)V", line = 3570)
    public final void method2296(byte arg0) {
        ++field5118;
        OpenGL.glLightfv(16384, 4611, this.field5345, 0);
        OpenGL.glLightfv(16385, 4611, this.field5368, 0);
        int var2 = -14 / ((-38 - arg0) / 49);
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(ILju;)V", line = 3581)
    public final void method2297(int arg0, class83 arg1) {
        ++field5232;
        if (~this.field5315 <= arg0) {
            throw new RuntimeException();
        } else {
            if (~this.field5315 <= -1) {
                this.field5317[this.field5315].method461(-8741);
            }
            this.field5322 = this.field5317[++this.field5315] = arg1;
            this.field5322.method457((byte) 69);
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(ZI)V", line = 3598)
    public final void method2298(boolean arg0, int arg1) {
        ++field5245;
        if (arg1 != -12481) {
            this.method2286((byte) 94);
        }
        if (this.field5405 != arg0) {
            this.field5405 = arg0;
            this.method2290(false);
            this.field5408 &= -32;
        }
    }

    @OriginalMember(owner = "client!ur", name = "Q", descriptor = "(III)V", line = 3616)
    public final void method1167(int arg0, int arg1, int arg2) {
        if (~this.field5440 != ~arg0 || this.field5387 != arg1 || this.field5367 != arg2) {
            this.field5367 = arg2;
            this.field5387 = arg1;
            this.field5440 = arg0;
            if (!this.field5354) {
                this.method2286((byte) 8);
                this.method2290(false);
            }
        }
        ++field5178;
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(IB)V", line = 3639)
    public final void method2299(int arg0, byte arg1) {
        this.method2266(arg0, true, false);
        ++field5135;
        if (arg1 < 70) {
            this.field5333 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "w", descriptor = "(I)V", line = 3652)
    private final void method2300(int arg0) {
        if (~this.field5395 <= ~this.field5370 && ~this.field5406 >= ~this.field5340) {
            OpenGL.glScissor(this.field5402 + this.field5370, this.field5348 + this.field5125 + -this.field5340, -this.field5370 + this.field5395, -this.field5406 + this.field5340);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        if (arg0 == 1) {
            ++field5154;
        }
    }

    @OriginalMember(owner = "client!ur", name = "x", descriptor = "(I)V", line = 3668)
    public final void method2301(int arg0) {
        ++field5265;
        if (arg0 == -12885) {
            OpenGL.glPopMatrix();
        }
    }

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "(II)I", line = 3680)
    public final int method2302(int arg0, int arg1) {
        ++field5296;
        if (arg1 != 34844) {
            this.method1149();
        }
        if (~arg0 != -6407 && ~arg0 != -6410) {
            if (~arg0 != -6411 && arg0 != 34846 && arg0 != 34844) {
                if (~arg0 == -6408) {
                    return 3;
                } else if (arg0 != 6408 && arg0 != 34847) {
                    if (arg0 != 34843) {
                        if (~arg0 != -34843) {
                            if (~arg0 == -6403) {
                                return 3;
                            } else if (arg0 == 6401) {
                                return 1;
                            } else {
                                throw new IllegalArgumentException("");
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

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V", line = 3723)
    public final void method1187(int arg0) {
        this.method2251(-114);
        ++field5196;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZIIZ)V", line = 3731)
    public final void method2303(boolean arg0, int arg1, int arg2, boolean arg3) {
        ++field5155;
        if (arg2 == -11460) {
            if (~this.field5412 != ~arg1) {
                if (arg1 < 0) {
                    this.method2254(arg2 ^ -11437);
                    this.method2236((class252) null, 94);
                    this.method2260(arg2 + 28100, 0);
                    if (!this.field5354) {
                        this.field5290.method373(arg0, 0, (byte) 115, arg3, 0, 0);
                    }
                } else {
                    class238 var5 = this.field5304.method1783((byte) -113, arg1);
                    class433 var6 = super.field3772.method94(arg1, (byte) -72);
                    if (~var6.field6315 == -1 && var6.field6313 == 0) {
                        this.method2254(arg2 + 11558);
                    } else {
                        int var7 = var6.field6302 ? 64 : 128;
                        int var8 = var7 * 50;
                        this.method2240(arg2 + -8345, 0.0F, (float) (this.field5310 % var8 * var6.field6315) / (float) var8, (float) (this.field5310 % var8 * var6.field6313) / (float) var8);
                    }
                    if (this.field5354) {
                        this.method2236(var5, -107);
                        this.method2260(16640, var6.field6306);
                    } else {
                        this.field5290.method373(arg0, var6.field6320, (byte) 115, arg3, var6.field6321, var6.field6312);
                        if (!this.field5290.method370(true, var5, var6.field6306)) {
                            this.method2236(var5, 103);
                            this.method2260(arg2 ^ -28100, var6.field6306);
                        }
                    }
                }
                this.field5412 = arg1;
            }
            this.field5408 &= -8;
        }
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "()Z", line = 3795)
    public final boolean method1142() {
        ++field5292;
        return this.field5288 != null && this.field5288.method1648((byte) 72);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(III)V", line = 3803)
    public final synchronized void method2304(int arg0, int arg1, int arg2) {
        if (arg2 < 23) {
            this.field5151 = null;
        }
        ++field5128;
        class488 var4 = new class488(arg0);
        var4.field6348 = (long) arg1;
        this.field5328.method975(0, var4);
    }

    @OriginalMember(owner = "client!ur", name = "s", descriptor = "(B)V", line = 3819)
    private final void method2305(byte arg0) {
        ++field5204;
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field5425.method1590(0), 0);
        if (arg0 <= -15) {
            if (this.field5354) {
                this.field5290.field722.method1117(47);
            }
            this.method2296((byte) 82);
            this.method2238(-40);
        }
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(III)V", line = 3838)
    public final void method2306(int arg0, int arg1, int arg2) {
        this.field5402 = arg0;
        this.field5348 = arg2;
        if (arg1 != -30723) {
            this.field5432 = true;
        }
        ++field5216;
        this.method2270((byte) -87);
        this.method2300(1);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)I", line = 3852)
    public final int method1211(int arg0, int arg1) {
        ++field5248;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "([BIIZI)Lse;", line = 3861)
    public final class170 method2307(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field5239;
        if (arg1 != 7938) {
            this.method1128(99, 22, -38, 37, 97);
        }
        return (class170) (!this.field5349 || arg3 && !this.field5344 ? new class27(this, arg4, arg0, arg2) : new class499(this, arg4, arg0, arg2, arg3));
    }

    @OriginalMember(owner = "client!ur", name = "B", descriptor = "(IFFFFF)V", line = 3878)
    public final void method1181(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field5173;
        boolean var7 = this.field5394 != arg0;
        if (var7 || this.field5436 != arg1 || this.field5434 != arg2) {
            this.field5394 = arg0;
            this.field5434 = arg2;
            this.field5436 = arg1;
            if (var7) {
                this.field5448 = (float) (this.field5394 & 16711680) / 1.671168E7F;
                this.field5353 = (float) (65280 & this.field5394) / 65280.0F;
                this.field5438 = (float) (255 & this.field5394) / 255.0F;
                this.method2275(16568);
            }
            this.method2309(119);
        }
        if (this.field5351[0] != arg3 || this.field5351[1] != arg4 || this.field5351[2] != arg5) {
            this.field5351[2] = arg5;
            this.field5351[1] = arg4;
            this.field5351[0] = arg3;
            this.field5347[0] = -arg3;
            this.field5347[1] = -arg4;
            this.field5347[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5345[0] = arg3 * var8;
            this.field5345[2] = arg5 * var8;
            this.field5345[1] = arg4 * var8;
            this.field5368[0] = -this.field5345[0];
            this.field5368[1] = -this.field5345[1];
            this.field5368[2] = -this.field5345[2];
            this.method2296((byte) 102);
            this.field5431 = (int) (arg3 * 256.0F / arg4);
            this.field5343 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "(I)Ln;", line = 3927)
    public final class15 method1204(int arg0) {
        ++field5156;
        class402 var2 = new class402(arg0);
        this.field5313.method975(0, var2);
        return var2;
    }

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "()Z", line = 3940)
    public final boolean method1229() {
        ++field5267;
        return true;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZII[BI)Lfe;", line = 3948)
    public final class404 method2308(boolean arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        ++field5143;
        if (!this.field5349 || arg0 && !this.field5344) {
            if (arg4 != 12905) {
                this.method1172(-106, 93, 27, 1, -75, -75, (byte[]) null, 32, -16);
            }
            return new class230(this, arg1, arg3, arg2);
        } else {
            return new class322(this, arg1, arg3, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!ur", name = "sa", descriptor = "(IIII)[I", line = 3965)
    public final int[] method1151(int arg0, int arg1, int arg2, int arg3) {
        ++field5272;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field5125 - var6, arg2, 1, 32993, this.field5437, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "()Z", line = 3988)
    public final boolean method1149() {
        ++field5176;
        return this.field5290.method375((byte) 106, 3);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 4000)
    public final void method1195(Canvas arg0) {
        ++field5206;
        long var2 = 0L;
        if (arg0 != null && this.field5151 != arg0) {
            if (this.field5261.containsKey(arg0)) {
                Long var4 = (Long) this.field5261.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field5249;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field5205.surfaceResized(var2);
            if (this.field5262 == arg0) {
                this.method2234(-127);
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(IIIIII)V", line = 4030)
    public final void method1157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5214;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        this.method2241(-3874);
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method2279(arg5, (byte) 104);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5381) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5381) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "()Z", line = 4063)
    public final boolean method1190() {
        ++field5293;
        return true;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(IIII)V", line = 4076)
    public final void method1189(int arg0, int arg1, int arg2, int arg3) {
        this.field5297.method2528(arg1, arg3, arg0, -118, arg2);
        ++field5179;
    }

    @OriginalMember(owner = "client!ur", name = "u", descriptor = "()V", line = 4089)
    public final void method1198() {
        this.field5297.method2525(false);
        ++field5132;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(FFF)V", line = 4103)
    public final void method1177(float arg0, float arg1, float arg2) {
        ++field5181;
        class358.field4871 = arg1;
        class196.field2526 = arg2;
        class515.field7485 = arg0;
    }

    @OriginalMember(owner = "client!ur", name = "y", descriptor = "(I)V", line = 4121)
    private final void method2309(int arg0) {
        int var2 = 69 % ((arg0 - 54) / 52);
        ++field5246;
        class127.field1650[1] = this.field5436 * this.field5353;
        class127.field1650[3] = 1.0F;
        class127.field1650[0] = this.field5448 * this.field5436;
        class127.field1650[2] = this.field5438 * this.field5436;
        OpenGL.glLightfv(16384, 4609, class127.field1650, 0);
        class127.field1650[2] = -this.field5434 * this.field5438;
        class127.field1650[3] = 1.0F;
        class127.field1650[0] = -this.field5434 * this.field5448;
        class127.field1650[1] = -this.field5434 * this.field5353;
        OpenGL.glLightfv(16385, 4609, class127.field1650, 0);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Le;Leu;Lc;Lut;I)V", line = 4144)
    public final void method1203(class373 arg0, class336 arg1, class124 arg2, class82 arg3, int arg4) {
        ++field5224;
        arg0.method2051(arg2, arg3, arg4);
        this.method1131(arg1);
    }

    @OriginalMember(owner = "client!ur", name = "K", descriptor = "(IIIIII[BII)V", line = 4156)
    public final void method1172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field5161;
        float var10;
        float var11;
        if (this.field5401 != null && ~this.field5401.field3169 <= ~arg2 && this.field5401.field3164 >= arg3) {
            this.field5401.method1495(arg6, 0, 6407, 0, 0, arg3, 6406, 0, false, arg2);
            var10 = (float) arg2 * this.field5401.field770 / (float) this.field5401.field3169;
            var11 = (float) arg3 * this.field5401.field769 / (float) this.field5401.field3164;
        } else {
            this.field5401 = class384.method2336(arg3, 6406, arg2, false, 6406, this, arg6, -112);
            this.field5401.method1499(false, 0, false);
            var10 = this.field5401.field770;
            var11 = this.field5401.field769;
        }
        this.method2273((byte) 106);
        this.method2236(this.field5401, -1);
        this.method2279(arg8, (byte) 68);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2276(arg5, (byte) -22);
        this.method2269(34165, 8960, 34165);
        this.method2229(34166, (byte) -18, 0, 768);
        this.method2229(5890, (byte) -18, 2, 770);
        this.method2277((byte) 81, 770, 0, 34166);
        this.method2277((byte) -106, 770, 2, 5890);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var10);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var11, var10);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var11, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method2229(5890, (byte) -18, 0, 768);
        this.method2229(34166, (byte) -18, 2, 770);
        this.method2277((byte) -114, 770, 0, 5890);
        this.method2277((byte) 58, 770, 2, 34166);
    }
}
