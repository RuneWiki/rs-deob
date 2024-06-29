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

@OriginalClass("client!ad")
public class class362 extends class605 {

    @OriginalMember(owner = "client!ad", name = "rc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field5247 = new Hashtable();

    @OriginalMember(owner = "client!ad", name = "ae", descriptor = "I")
    public int field5334 = 128;

    @OriginalMember(owner = "client!ad", name = "Nd", descriptor = "Lhu;")
    private class113 field5321 = new class113();

    @OriginalMember(owner = "client!ad", name = "me", descriptor = "Lws;")
    private class302 field5346 = new class302();

    @OriginalMember(owner = "client!ad", name = "ne", descriptor = "Lws;")
    public class302 field5347 = new class302();

    @OriginalMember(owner = "client!ad", name = "oe", descriptor = "I")
    public int field5348 = 3;

    @OriginalMember(owner = "client!ad", name = "pe", descriptor = "I")
    public int field5349 = 8;

    @OriginalMember(owner = "client!ad", name = "ue", descriptor = "Z")
    private boolean field5354 = false;

    @OriginalMember(owner = "client!ad", name = "qe", descriptor = "Leea;")
    private class114 field5350 = new class114();

    @OriginalMember(owner = "client!ad", name = "xe", descriptor = "[Lim;")
    private class497[] field5357 = new class497[4];

    @OriginalMember(owner = "client!ad", name = "ze", descriptor = "I")
    private int field5359 = -1;

    @OriginalMember(owner = "client!ad", name = "Be", descriptor = "I")
    private int field5361 = -1;

    @OriginalMember(owner = "client!ad", name = "Ae", descriptor = "[Lim;")
    private class497[] field5360 = new class497[4];

    @OriginalMember(owner = "client!ad", name = "ve", descriptor = "I")
    private int field5355 = -1;

    @OriginalMember(owner = "client!ad", name = "we", descriptor = "[Lim;")
    private class497[] field5356 = new class497[4];

    @OriginalMember(owner = "client!ad", name = "Ee", descriptor = "Leea;")
    private class114 field5364;

    @OriginalMember(owner = "client!ad", name = "He", descriptor = "Leea;")
    private class114 field5367;

    @OriginalMember(owner = "client!ad", name = "Ie", descriptor = "Leea;")
    private class114 field5368;

    @OriginalMember(owner = "client!ad", name = "Je", descriptor = "Leea;")
    private class114 field5369;

    @OriginalMember(owner = "client!ad", name = "Ke", descriptor = "Leea;")
    private class114 field5370;

    @OriginalMember(owner = "client!ad", name = "Le", descriptor = "Leea;")
    private class114 field5371;

    @OriginalMember(owner = "client!ad", name = "Me", descriptor = "Leea;")
    private class114 field5372;

    @OriginalMember(owner = "client!ad", name = "Re", descriptor = "I")
    public int field5377;

    @OriginalMember(owner = "client!ad", name = "ef", descriptor = "F")
    private float field5390;

    @OriginalMember(owner = "client!ad", name = "Ne", descriptor = "I")
    public int field5373;

    @OriginalMember(owner = "client!ad", name = "kf", descriptor = "I")
    public int field5395;

    @OriginalMember(owner = "client!ad", name = "Df", descriptor = "[F")
    private float[] field5414;

    @OriginalMember(owner = "client!ad", name = "Lf", descriptor = "[F")
    private float[] field5422;

    @OriginalMember(owner = "client!ad", name = "Bf", descriptor = "F")
    private float field5412;

    @OriginalMember(owner = "client!ad", name = "Qf", descriptor = "I")
    private int field5427;

    @OriginalMember(owner = "client!ad", name = "df", descriptor = "[F")
    private float[] field5389;

    @OriginalMember(owner = "client!ad", name = "zf", descriptor = "F")
    private float field5410;

    @OriginalMember(owner = "client!ad", name = "xf", descriptor = "I")
    private int field5408;

    @OriginalMember(owner = "client!ad", name = "Te", descriptor = "I")
    public int field5379;

    @OriginalMember(owner = "client!ad", name = "og", descriptor = "I")
    public int field5451;

    @OriginalMember(owner = "client!ad", name = "kg", descriptor = "F")
    private float field5447;

    @OriginalMember(owner = "client!ad", name = "sg", descriptor = "I")
    public int field5455;

    @OriginalMember(owner = "client!ad", name = "tg", descriptor = "I")
    public int field5456;

    @OriginalMember(owner = "client!ad", name = "Pf", descriptor = "[F")
    private float[] field5426;

    @OriginalMember(owner = "client!ad", name = "Zf", descriptor = "Z")
    private boolean field5436;

    @OriginalMember(owner = "client!ad", name = "Dg", descriptor = "I")
    public int field5466;

    @OriginalMember(owner = "client!ad", name = "of", descriptor = "I")
    private int field5399;

    @OriginalMember(owner = "client!ad", name = "bg", descriptor = "I")
    private int field5438;

    @OriginalMember(owner = "client!ad", name = "Jf", descriptor = "F")
    public float field5420;

    @OriginalMember(owner = "client!ad", name = "Jg", descriptor = "I")
    private int field5472;

    @OriginalMember(owner = "client!ad", name = "Hg", descriptor = "I")
    private int field5470;

    @OriginalMember(owner = "client!ad", name = "cg", descriptor = "I")
    private int field5439;

    @OriginalMember(owner = "client!ad", name = "fg", descriptor = "F")
    private float field5442;

    @OriginalMember(owner = "client!ad", name = "Nf", descriptor = "I")
    public int field5424;

    @OriginalMember(owner = "client!ad", name = "Ue", descriptor = "F")
    public float field5380;

    @OriginalMember(owner = "client!ad", name = "Pg", descriptor = "I")
    public int field5478;

    @OriginalMember(owner = "client!ad", name = "Lg", descriptor = "I")
    private int field5474;

    @OriginalMember(owner = "client!ad", name = "Rg", descriptor = "F")
    private float field5480;

    @OriginalMember(owner = "client!ad", name = "ug", descriptor = "[Loj;")
    private class321[] field5457;

    @OriginalMember(owner = "client!ad", name = "hg", descriptor = "F")
    public float field5444;

    @OriginalMember(owner = "client!ad", name = "Mg", descriptor = "F")
    public float field5475;

    @OriginalMember(owner = "client!ad", name = "Cg", descriptor = "F")
    public float field5465;

    @OriginalMember(owner = "client!ad", name = "Yg", descriptor = "F")
    public float field5487;

    @OriginalMember(owner = "client!ad", name = "vg", descriptor = "I")
    private int field5458;

    @OriginalMember(owner = "client!ad", name = "xg", descriptor = "F")
    public float field5460;

    @OriginalMember(owner = "client!ad", name = "Gg", descriptor = "I")
    public int field5469;

    @OriginalMember(owner = "client!ad", name = "bf", descriptor = "[F")
    public float[] field5387;

    @OriginalMember(owner = "client!ad", name = "Vg", descriptor = "I")
    private int field5484;

    @OriginalMember(owner = "client!ad", name = "gf", descriptor = "Lvw;")
    public class257 field5392;

    @OriginalMember(owner = "client!ad", name = "eh", descriptor = "[I")
    public int[] field5493;

    @OriginalMember(owner = "client!ad", name = "fh", descriptor = "[I")
    public int[] field5494;

    @OriginalMember(owner = "client!ad", name = "gh", descriptor = "[B")
    public byte[] field5495;

    @OriginalMember(owner = "client!ad", name = "hh", descriptor = "[I")
    public int[] field5496;

    @OriginalMember(owner = "client!ad", name = "fb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5183;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5159;

    @OriginalMember(owner = "client!ad", name = "Xd", descriptor = "I")
    public int field5331;

    @OriginalMember(owner = "client!ad", name = "zb", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field5203;

    @OriginalMember(owner = "client!ad", name = "Mb", descriptor = "J")
    private long field5216;

    @OriginalMember(owner = "client!ad", name = "hb", descriptor = "J")
    private long field5185;

    @OriginalMember(owner = "client!ad", name = "Fg", descriptor = "Z")
    public boolean field5468;

    @OriginalMember(owner = "client!ad", name = "Ug", descriptor = "I")
    public int field5483;

    @OriginalMember(owner = "client!ad", name = "jg", descriptor = "Ljava/lang/String;")
    private String field5446;

    @OriginalMember(owner = "client!ad", name = "pg", descriptor = "Z")
    public boolean field5452;

    @OriginalMember(owner = "client!ad", name = "eg", descriptor = "Z")
    public boolean field5441;

    @OriginalMember(owner = "client!ad", name = "mf", descriptor = "Z")
    private boolean field5397;

    @OriginalMember(owner = "client!ad", name = "Kg", descriptor = "Z")
    public boolean field5473;

    @OriginalMember(owner = "client!ad", name = "We", descriptor = "Z")
    private boolean field5382;

    @OriginalMember(owner = "client!ad", name = "Kf", descriptor = "Z")
    public boolean field5421;

    @OriginalMember(owner = "client!ad", name = "Xg", descriptor = "Ljava/lang/String;")
    private String field5486;

    @OriginalMember(owner = "client!ad", name = "Sg", descriptor = "Z")
    public boolean field5481;

    @OriginalMember(owner = "client!ad", name = "yf", descriptor = "Z")
    private boolean field5409;

    @OriginalMember(owner = "client!ad", name = "ce", descriptor = "Llb;")
    private class471 field5336;

    @OriginalMember(owner = "client!ad", name = "se", descriptor = "Lug;")
    public class489 field5352;

    @OriginalMember(owner = "client!ad", name = "fe", descriptor = "Lhn;")
    private class625 field5339;

    @OriginalMember(owner = "client!ad", name = "Id", descriptor = "Lhr;")
    private class455 field5316;

    @OriginalMember(owner = "client!ad", name = "Ud", descriptor = "Low;")
    private class292 field5328;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "[I")
    public static int[] field5141 = new int[1024];

    @OriginalMember(owner = "client!ad", name = "lb", descriptor = "I")
    public static int field5189 = 64;

    @OriginalMember(owner = "client!ad", name = "jc", descriptor = "[Ljava/lang/String;")
    public static String[] field5239 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!ad", name = "vd", descriptor = "Z")
    public static boolean field5303 = false;

    @OriginalMember(owner = "client!ad", name = "eb", descriptor = "Lea;")
    public static class474 field5182 = new class474((String) null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 200.", (String) null, (String) null);

    @OriginalMember(owner = "client!ad", name = "af", descriptor = "F")
    public float field5386;

    @OriginalMember(owner = "client!ad", name = "lf", descriptor = "F")
    public float field5396;

    @OriginalMember(owner = "client!ad", name = "tf", descriptor = "F")
    private float field5404;

    @OriginalMember(owner = "client!ad", name = "If", descriptor = "F")
    public float field5419;

    @OriginalMember(owner = "client!ad", name = "Rf", descriptor = "F")
    private float field5428;

    @OriginalMember(owner = "client!ad", name = "ag", descriptor = "F")
    private float field5437;

    @OriginalMember(owner = "client!ad", name = "rg", descriptor = "F")
    public float field5454;

    @OriginalMember(owner = "client!ad", name = "Bg", descriptor = "F")
    private float field5464;

    @OriginalMember(owner = "client!ad", name = "Ig", descriptor = "F")
    public float field5471;

    @OriginalMember(owner = "client!ad", name = "dh", descriptor = "F")
    public float field5492;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!ad", name = "db", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!ad", name = "gb", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!ad", name = "ib", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!ad", name = "jb", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!ad", name = "kb", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!ad", name = "mb", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!ad", name = "nb", descriptor = "I")
    private int field5191;

    @OriginalMember(owner = "client!ad", name = "ob", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!ad", name = "pb", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!ad", name = "qb", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!ad", name = "rb", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!ad", name = "sb", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!ad", name = "tb", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!ad", name = "ub", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!ad", name = "vb", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!ad", name = "wb", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!ad", name = "xb", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!ad", name = "yb", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!ad", name = "Ab", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!ad", name = "Bb", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!ad", name = "Cb", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!ad", name = "Db", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!ad", name = "Eb", descriptor = "I")
    private int field5208;

    @OriginalMember(owner = "client!ad", name = "Fb", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!ad", name = "Gb", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!ad", name = "Hb", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!ad", name = "Ib", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!ad", name = "Jb", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!ad", name = "Kb", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!ad", name = "Lb", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!ad", name = "Nb", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!ad", name = "Ob", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!ad", name = "Pb", descriptor = "I")
    public int field5219;

    @OriginalMember(owner = "client!ad", name = "Qb", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!ad", name = "Rb", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!ad", name = "Sb", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!ad", name = "Tb", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!ad", name = "Ub", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!ad", name = "Vb", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!ad", name = "Wb", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!ad", name = "Xb", descriptor = "I")
    public int field5227;

    @OriginalMember(owner = "client!ad", name = "Yb", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!ad", name = "Zb", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!ad", name = "ac", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!ad", name = "bc", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!ad", name = "cc", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!ad", name = "dc", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!ad", name = "ec", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!ad", name = "fc", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!ad", name = "gc", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!ad", name = "hc", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!ad", name = "ic", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!ad", name = "kc", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!ad", name = "lc", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!ad", name = "mc", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!ad", name = "nc", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!ad", name = "oc", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!ad", name = "pc", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!ad", name = "qc", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!ad", name = "sc", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!ad", name = "tc", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!ad", name = "uc", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!ad", name = "vc", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!ad", name = "wc", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!ad", name = "xc", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!ad", name = "yc", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!ad", name = "zc", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!ad", name = "Ac", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!ad", name = "Bc", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!ad", name = "Cc", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!ad", name = "Dc", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!ad", name = "Ec", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!ad", name = "Fc", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!ad", name = "Gc", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!ad", name = "Hc", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!ad", name = "Ic", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!ad", name = "Jc", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!ad", name = "Kc", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!ad", name = "Lc", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!ad", name = "Mc", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!ad", name = "Nc", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!ad", name = "Oc", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!ad", name = "Pc", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!ad", name = "Qc", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!ad", name = "Rc", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!ad", name = "Sc", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!ad", name = "Tc", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!ad", name = "Uc", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!ad", name = "Vc", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!ad", name = "Wc", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!ad", name = "Xc", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!ad", name = "Yc", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!ad", name = "Zc", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!ad", name = "ad", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!ad", name = "bd", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!ad", name = "cd", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!ad", name = "dd", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!ad", name = "ed", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!ad", name = "fd", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!ad", name = "gd", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!ad", name = "hd", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!ad", name = "id", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!ad", name = "jd", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!ad", name = "kd", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!ad", name = "ld", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!ad", name = "md", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!ad", name = "nd", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!ad", name = "od", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!ad", name = "pd", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!ad", name = "qd", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!ad", name = "rd", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!ad", name = "sd", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!ad", name = "td", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!ad", name = "ud", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!ad", name = "wd", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!ad", name = "xd", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!ad", name = "yd", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!ad", name = "zd", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!ad", name = "Ad", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!ad", name = "Bd", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!ad", name = "Cd", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!ad", name = "Dd", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!ad", name = "Ed", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!ad", name = "Fd", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!ad", name = "Gd", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!ad", name = "Hd", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!ad", name = "Jd", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!ad", name = "Kd", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!ad", name = "Ld", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!ad", name = "Md", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!ad", name = "Od", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!ad", name = "Pd", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!ad", name = "Qd", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!ad", name = "Rd", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!ad", name = "Sd", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!ad", name = "Td", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!ad", name = "Vd", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!ad", name = "Wd", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!ad", name = "Yd", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!ad", name = "Zd", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!ad", name = "be", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!ad", name = "de", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!ad", name = "ee", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!ad", name = "ge", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!ad", name = "he", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!ad", name = "ie", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!ad", name = "je", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!ad", name = "ke", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!ad", name = "le", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!ad", name = "re", descriptor = "I")
    public int field5351;

    @OriginalMember(owner = "client!ad", name = "De", descriptor = "I")
    public int field5363;

    @OriginalMember(owner = "client!ad", name = "Fe", descriptor = "I")
    public int field5365;

    @OriginalMember(owner = "client!ad", name = "Ge", descriptor = "I")
    private int field5366;

    @OriginalMember(owner = "client!ad", name = "Oe", descriptor = "I")
    private int field5374;

    @OriginalMember(owner = "client!ad", name = "Ve", descriptor = "I")
    private int field5381;

    @OriginalMember(owner = "client!ad", name = "Ye", descriptor = "I")
    private int field5384;

    @OriginalMember(owner = "client!ad", name = "cf", descriptor = "I")
    private int field5388;

    @OriginalMember(owner = "client!ad", name = "Af", descriptor = "I")
    private int field5411;

    @OriginalMember(owner = "client!ad", name = "Ff", descriptor = "I")
    private int field5416;

    @OriginalMember(owner = "client!ad", name = "Hf", descriptor = "I")
    public int field5418;

    @OriginalMember(owner = "client!ad", name = "Mf", descriptor = "I")
    private int field5423;

    @OriginalMember(owner = "client!ad", name = "Sf", descriptor = "I")
    private int field5429;

    @OriginalMember(owner = "client!ad", name = "ig", descriptor = "I")
    private int field5445;

    @OriginalMember(owner = "client!ad", name = "mg", descriptor = "I")
    public int field5449;

    @OriginalMember(owner = "client!ad", name = "zg", descriptor = "I")
    private int field5462;

    @OriginalMember(owner = "client!ad", name = "Ng", descriptor = "I")
    public int field5476;

    @OriginalMember(owner = "client!ad", name = "Tg", descriptor = "I")
    public int field5482;

    @OriginalMember(owner = "client!ad", name = "Zg", descriptor = "I")
    private int field5488;

    @OriginalMember(owner = "client!ad", name = "ih", descriptor = "I")
    private int field5497;

    @OriginalMember(owner = "client!ad", name = "jh", descriptor = "I")
    private int field5498;

    @OriginalMember(owner = "client!ad", name = "wf", descriptor = "J")
    private long field5407;

    @OriginalMember(owner = "client!ad", name = "bh", descriptor = "Lec;")
    private class200 field5490;

    @OriginalMember(owner = "client!ad", name = "Qe", descriptor = "Lgca;")
    public class212 field5376;

    @OriginalMember(owner = "client!ad", name = "hf", descriptor = "Lgca;")
    public class212 field5393;

    @OriginalMember(owner = "client!ad", name = "jf", descriptor = "Lgca;")
    public class212 field5394;

    @OriginalMember(owner = "client!ad", name = "uf", descriptor = "Lgca;")
    public class212 field5405;

    @OriginalMember(owner = "client!ad", name = "Ef", descriptor = "Lgca;")
    public class212 field5415;

    @OriginalMember(owner = "client!ad", name = "Uf", descriptor = "Lgca;")
    public class212 field5431;

    @OriginalMember(owner = "client!ad", name = "Xf", descriptor = "Lgca;")
    public class212 field5434;

    @OriginalMember(owner = "client!ad", name = "dg", descriptor = "Lgca;")
    public class212 field5440;

    @OriginalMember(owner = "client!ad", name = "ng", descriptor = "Lgca;")
    public class212 field5450;

    @OriginalMember(owner = "client!ad", name = "ch", descriptor = "Lgca;")
    public class212 field5491;

    @OriginalMember(owner = "client!ad", name = "Yf", descriptor = "Lcs;")
    public class289 field5435;

    @OriginalMember(owner = "client!ad", name = "Tf", descriptor = "Lws;")
    public class302 field5430;

    @OriginalMember(owner = "client!ad", name = "qg", descriptor = "Lws;")
    public class302 field5453;

    @OriginalMember(owner = "client!ad", name = "qf", descriptor = "Lah;")
    private class325 field5401;

    @OriginalMember(owner = "client!ad", name = "Se", descriptor = "Lgr;")
    public class371 field5378;

    @OriginalMember(owner = "client!ad", name = "lg", descriptor = "Lgr;")
    public class371 field5448;

    @OriginalMember(owner = "client!ad", name = "ye", descriptor = "Lim;")
    private class497 field5358;

    @OriginalMember(owner = "client!ad", name = "Ce", descriptor = "Lim;")
    private class497 field5362;

    @OriginalMember(owner = "client!ad", name = "nf", descriptor = "Ljaa;")
    public class535 field5398;

    @OriginalMember(owner = "client!ad", name = "yg", descriptor = "Lbo;")
    private class632 field5461;

    @OriginalMember(owner = "client!ad", name = "Wg", descriptor = "Lbo;")
    private class632 field5485;

    @OriginalMember(owner = "client!ad", name = "ah", descriptor = "Lil;")
    private class7 field5489;

    @OriginalMember(owner = "client!ad", name = "te", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field5353;

    @OriginalMember(owner = "client!ad", name = "Pe", descriptor = "Z")
    public boolean field5375;

    @OriginalMember(owner = "client!ad", name = "Xe", descriptor = "Z")
    public boolean field5383;

    @OriginalMember(owner = "client!ad", name = "Ze", descriptor = "Z")
    public boolean field5385;

    @OriginalMember(owner = "client!ad", name = "ff", descriptor = "Z")
    public boolean field5391;

    @OriginalMember(owner = "client!ad", name = "pf", descriptor = "Z")
    private boolean field5400;

    @OriginalMember(owner = "client!ad", name = "rf", descriptor = "Z")
    private boolean field5402;

    @OriginalMember(owner = "client!ad", name = "sf", descriptor = "Z")
    private boolean field5403;

    @OriginalMember(owner = "client!ad", name = "vf", descriptor = "Z")
    private boolean field5406;

    @OriginalMember(owner = "client!ad", name = "Gf", descriptor = "Z")
    private boolean field5417;

    @OriginalMember(owner = "client!ad", name = "Of", descriptor = "Z")
    public boolean field5425;

    @OriginalMember(owner = "client!ad", name = "Vf", descriptor = "Z")
    private boolean field5432;

    @OriginalMember(owner = "client!ad", name = "Wf", descriptor = "Z")
    public boolean field5433;

    @OriginalMember(owner = "client!ad", name = "gg", descriptor = "Z")
    private boolean field5443;

    @OriginalMember(owner = "client!ad", name = "wg", descriptor = "Z")
    public boolean field5459;

    @OriginalMember(owner = "client!ad", name = "Ag", descriptor = "Z")
    private boolean field5463;

    @OriginalMember(owner = "client!ad", name = "Eg", descriptor = "Z")
    public boolean field5467;

    @OriginalMember(owner = "client!ad", name = "Og", descriptor = "Z")
    private boolean field5477;

    @OriginalMember(owner = "client!ad", name = "Qg", descriptor = "Z")
    private boolean field5479;

    @OriginalMember(owner = "client!ad", name = "Cf", descriptor = "[Lpm;")
    private class507[] field5413;

    @OriginalMember(owner = "client!ad", name = "ma", descriptor = "(IIIIII[BII)V", line = 4)
    public final void method401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field5200;
        float var10;
        float var11;
        if (this.field5401 != null && arg2 <= this.field5401.field3994 && ~arg3 >= ~this.field5401.field3988) {
            this.field5401.method1872(arg3, 0, arg2, 0, arg6, 0, 0, false, 30491, 6406);
            var10 = (float) arg2 * this.field5401.field4691 / (float) this.field5401.field3994;
            var11 = (float) arg3 * this.field5401.field4687 / (float) this.field5401.field3988;
        } else {
            this.field5401 = class108.method677(this, arg6, 6406, 6406, arg2, 19124, arg3, false);
            this.field5401.method1867(false, 2203, false);
            var11 = this.field5401.field4687;
            var10 = this.field5401.field4691;
        }
        this.method2323(true);
        this.method2295(-74, this.field5401);
        this.method2327(arg8, (byte) 11);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2300((byte) 123, arg5);
        this.method2320(34165, 34165, 0);
        this.method2291(34166, 0, 768, (byte) -35);
        this.method2291(5890, 2, 770, (byte) -35);
        this.method2333(770, 34166, 0, (byte) 65);
        this.method2333(770, 5890, 2, (byte) 63);
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
        this.method2291(5890, 0, 768, (byte) -35);
        this.method2291(34166, 2, 770, (byte) -35);
        this.method2333(770, 5890, 0, (byte) 65);
        this.method2333(770, 34166, 2, (byte) 80);
    }

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "()I", line = 61)
    public final int method305() {
        ++field5307;
        return this.field5455;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V", line = 76)
    private final void method2250(int arg0) {
        ++field5232;
        this.method2286(-2, (byte) -93);
        for (int var2 = this.field5418 + -1; var2 >= 0; --var2) {
            this.method2269((byte) 20, var2);
            this.method2295(arg0 + -1089, (class507) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2320(8448, 8448, arg0 ^ 1028);
        this.method2291(34168, 2, 770, (byte) -35);
        this.method2318(true);
        this.field5445 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field5462 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field5400 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field5403 = true;
        this.method2278(true, -32);
        this.method2326(arg0 ^ -1254362692, true);
        this.method2260(2144, true);
        this.method2285(-32, true);
        this.method2284((byte) 85);
        this.field5203.setSwapInterval(0);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(arg0, 5634);
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
        OpenGL.glHint(3156, 4353);
        this.field5470 = this.field5466 = -1;
        this.method404();
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZIZ)V", line = 148)
    public final void method2251(boolean arg0, int arg1, boolean arg2) {
        if (arg0) {
            this.method346(23, 87, -93, 59, -6, -1.7418743F);
        }
        ++field5275;
        this.method2252((byte) 38, arg2, true, arg1);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BZZI)V", line = 159)
    public final void method2252(byte arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field5423 != arg3) {
            if (arg3 < 0) {
                this.method2318(true);
                this.method2295(-51, (class507) null);
                this.method2288(0, 7681);
                if (!this.field5385) {
                    this.field5328.method1886(0, arg2, 0, arg1, 0, 11683);
                }
            } else {
                class289 var5 = this.field5336.method2883((byte) 121, arg3);
                class614 var6 = super.field8852.method438(81, arg3);
                if (~var6.field8927 == -1 && var6.field8933 == 0) {
                    this.method2318(true);
                } else {
                    int var7 = var6.field8944 ? 64 : 128;
                    int var8 = var7 * 50;
                    this.method2254(5890, (float) (this.field5351 % var8 * var6.field8927) / (float) var8, (float) (this.field5351 % var8 * var6.field8933) / (float) var8, 0.0F);
                }
                if (this.field5385) {
                    this.method2295(-104, var5);
                    this.method2288(var6.field8930, 7681);
                } else {
                    this.field5328.method1886(var6.field8929, arg2, var6.field8935, arg1, var6.field8925, 11683);
                    if (!this.field5328.method1887(false, var6.field8930, var5)) {
                        this.method2295(-66, var5);
                        this.method2288(var6.field8930, 7681);
                    }
                }
            }
            this.field5423 = arg3;
        }
        ++field5313;
        int var9 = -49 / ((arg0 - -15) / 48);
        this.field5429 &= -8;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(Z)V", line = 224)
    public final void method2253(boolean arg0) {
        if (arg0) {
            this.method297();
        }
        if (~this.field5429 != -9) {
            this.method2301(-6266);
            this.method2278(true, -32);
            this.method2260(2144, true);
            this.method2285(-32, true);
            this.method2327(1, (byte) -123);
            this.field5429 = 8;
        }
        ++field5235;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IFFF)V", line = 245)
    private final void method2254(int arg0, float arg1, float arg2, float arg3) {
        ++field5206;
        OpenGL.glMatrixMode(arg0);
        if (this.field5479) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg1, arg2, arg3);
        OpenGL.glMatrixMode(5888);
        this.field5479 = true;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lgr;BLgr;Lgr;Lgr;)V", line = 263)
    public final void method2255(class371 arg0, byte arg1, class371 arg2, class371 arg3, class371 arg4) {
        ++field5144;
        if (arg0 != null) {
            this.method2279(arg0.field5680, arg1 ^ -24533);
            OpenGL.glVertexPointer(arg0.field5679, arg0.field5677, this.field5485.method448(-18785), this.field5485.method450((byte) -115) - -((long) arg0.field5683));
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        if (arg2 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method2279(arg2.field5680, arg1 + -24533);
            OpenGL.glNormalPointer(arg2.field5677, this.field5485.method448(arg1 ^ -18789), this.field5485.method450((byte) -113) - -((long) arg2.field5683));
            OpenGL.glEnableClientState(32885);
        }
        if (arg3 != null) {
            this.method2279(arg3.field5680, -24529);
            OpenGL.glColorPointer(arg3.field5679, arg3.field5677, this.field5485.method448(arg1 ^ -18789), this.field5485.method450((byte) -113) - -((long) arg3.field5683));
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg4 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method2279(arg4.field5680, -24529);
            OpenGL.glTexCoordPointer(arg4.field5679, arg4.field5677, this.field5485.method448(-18785), this.field5485.method450((byte) -54) - -((long) arg4.field5683));
            OpenGL.glEnableClientState(32888);
        }
        if (arg1 != 4) {
            this.field5348 = 114;
        }
    }

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "()F", line = 310)
    public final float method2256() {
        ++field5237;
        return this.field5447;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 320)
    private final void method2257(byte arg0) {
        if (arg0 < -62) {
            ++field5230;
            int var2 = 0;
            while (!this.field5203.method3148()) {
                if (~(var2++) < -6) {
                    throw new RuntimeException("");
                }
                class646.method3696(1, 1000L);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lil;B)V", line = 343)
    public final void method2258(class7 arg0, byte arg1) {
        if (this.field5489 != arg0) {
            if (this.field5397) {
                OpenGL.glBindBufferARB(34963, arg0.method36(-16829));
            }
            this.field5489 = arg0;
        }
        ++field5193;
        if (arg1 < 14) {
            this.field5371 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "(IIII)V", line = 362)
    public final void method309(int arg0, int arg1, int arg2, int arg3) {
        this.field5478 = arg3;
        ++field5196;
        this.field5469 = arg0;
        this.field5373 = arg2;
        this.field5456 = arg1;
        this.method2313((byte) 66);
        this.method2273(7039);
        if (~this.field5488 == -4) {
            this.method2276(5888);
        } else if (this.field5488 == 2) {
            this.method2302((byte) -114);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([Lba;Lq;[Lsda;I)V", line = 388)
    public final void method385(class327[] arg0, class364 arg1, class219[] arg2, int arg3) {
        ++field5205;
        for (int var5 = 0; ~arg0.length < ~var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method1380(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 406)
    public final void method347(Canvas arg0) {
        ++field5147;
        long var2 = 0L;
        if (arg0 != null && this.field5183 != arg0) {
            if (this.field5247.containsKey(arg0)) {
                Long var4 = (Long) this.field5247.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field5216;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field5203.surfaceResized(var2);
            if (this.field5159 == arg0) {
                this.method2268((byte) 78);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BII)V", line = 440)
    public final void method2259(byte arg0, int arg1, int arg2) {
        this.field5484 = arg1;
        if (arg0 > -42) {
            this.field5458 = -126;
        }
        this.field5439 = arg2;
        ++field5284;
        this.method2293(-28896);
        this.method2289((byte) -50);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)V", line = 457)
    public final void method2260(int arg0, boolean arg1) {
        if (arg0 != 2144) {
            this.field5348 = 71;
        }
        if (this.field5477 == !arg1) {
            if (!arg1) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field5429 &= -32;
            this.field5477 = arg1;
        }
        ++field5251;
    }

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "()V", line = 478)
    public final void method373() {
        ++field5243;
        this.field5385 = false;
        this.field5328.method1886(0, false, 0, false, 0, 11683);
        this.method2282(0);
        this.method2271(0);
    }

    @OriginalMember(owner = "client!ad", name = "JA", descriptor = "(I)V", line = 493)
    public final void method406(int arg0) {
        this.field5348 = 0;
        ++field5325;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field5348;
        }
        this.field5349 = 1 << this.field5348;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZLim;)V", line = 510)
    public final void method2261(boolean arg0, class497 arg1) {
        ++field5224;
        if (this.field5425) {
            this.method2332(arg1, (byte) -63);
            this.method2330(8705, arg1);
        } else {
            if (this.field5359 < 0 || this.field5356[this.field5359] != arg1) {
                throw new RuntimeException();
            }
            this.field5356[this.field5359--] = null;
            arg1.method2981(18770);
            if (~this.field5359 > -1) {
                this.field5362 = this.field5358 = null;
            } else {
                this.field5362 = this.field5358 = this.field5356[this.field5359];
                this.field5362.method2982((byte) 115);
            }
        }
        if (arg0) {
            this.method348(72);
        }
    }

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "(I)V", line = 545)
    public final void method2262(int arg0) {
        OpenGL.glPopMatrix();
        if (arg0 != 100663296) {
            this.field5412 = -2.0586793F;
        }
        ++field5324;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I[Loj;)V", line = 557)
    public final void method340(int arg0, class321[] arg1) {
        ++field5211;
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field5457[var3] = arg1[var3];
        }
        this.field5374 = arg0;
        if (~this.field5488 != -2) {
            this.method2264(-51);
        }
    }

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "()V", line = 583)
    public final void method349() {
        ++field5302;
        this.method2285(-32, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIBLil;)V", line = 594)
    public final void method2263(int arg0, int arg1, int arg2, byte arg3, class7 arg4) {
        ++field5149;
        int var6 = -5 % ((2 - arg3) / 47);
        int var7 = arg4.method39(-109);
        int var8 = arg0 * this.method2310(-99, var7);
        this.method2258(arg4, (byte) 104);
        OpenGL.glDrawElements(arg2, arg1, var7, arg4.method37(false) - -((long) var8));
    }

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "(I)V", line = 610)
    private final void method2264(int arg0) {
        if (arg0 >= -39) {
            this.method295(-102, 29, -4, 99, -86, 23);
        }
        ++field5209;
        int var2;
        for (var2 = 0; var2 < this.field5374; ++var2) {
            class321 var3 = this.field5457[var2];
            int var4 = var2 + 16386;
            class96.field1138[0] = (float) var3.method2093((byte) 111);
            class96.field1138[1] = (float) var3.method2097((byte) -120);
            class96.field1138[2] = (float) var3.method2095(true);
            class96.field1138[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class96.field1138, 0);
            int var5 = var3.method2098((byte) 89);
            float var6 = var3.method2091(-918913433) / 255.0F;
            class96.field1138[0] = (float) (class643.method3659(var5, 16730847) >> 16) * var6;
            class96.field1138[1] = (float) class643.method3659(255, var5 >> 8) * var6;
            class96.field1138[2] = var6 * (float) class643.method3659(var5, 255);
            OpenGL.glLightfv(var4, 4609, class96.field1138, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method2094(0) * var3.method2094(0)));
            OpenGL.glEnable(var4);
        }
        while (~this.field5381 < ~var2) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        this.field5381 = this.field5374;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V", line = 655)
    public final void method2265(byte arg0) {
        if (arg0 == 86) {
            ++field5171;
            if (~this.field5429 != -17) {
                this.method2335(arg0 + -90);
                this.method2278(true, -32);
                this.method2260(2144, true);
                this.method2285(-32, true);
                this.method2327(1, (byte) 91);
                this.field5429 = 16;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II[I[I)Lfa;", line = 675)
    public final class199 method301(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field5163;
        return class525.method3094(arg2, arg1, this, arg3, -126, arg0);
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(IIIIII)V", line = 687)
    public final void method299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5280;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method2309(37);
        this.method2327(arg5, (byte) 106);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5443) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5443) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lim;Z)V", line = 724)
    public final void method2266(class497 arg0, boolean arg1) {
        ++field5198;
        if (this.field5425) {
            this.method2303(true, arg0);
            this.method2331(arg0, 14562);
        } else {
            if (~this.field5359 <= -4) {
                throw new RuntimeException();
            }
            if (this.field5359 >= 0) {
                this.field5356[this.field5359].method2981(18770);
            }
            this.field5362 = this.field5358 = this.field5356[++this.field5359] = arg0;
            this.field5362.method2982((byte) 117);
        }
        if (!arg1) {
            this.field5476 = -81;
        }
    }

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "()F", line = 757)
    public final float method2267() {
        ++field5330;
        return this.field5404;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V", line = 766)
    private final void method2268(byte arg0) {
        ++field5240;
        if (this.field5159 != null) {
            Dimension var2 = this.field5159.getSize();
            this.field5208 = var2.height;
            this.field5191 = var2.width;
        } else {
            this.field5191 = this.field5208 = 0;
        }
        if (this.field5358 == null) {
            this.field5227 = this.field5191;
            this.field5219 = this.field5208;
            this.method2293(-28896);
        }
        this.method2284((byte) 85);
        if (arg0 <= 2) {
            this.field5457 = null;
        }
        this.method404();
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(IIIII)V", line = 796)
    public final void method306(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5155;
        this.method2309(92);
        this.method2327(arg4, (byte) -121);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "()V", line = 816)
    public final void method404() {
        this.field5472 = 0;
        ++field5187;
        this.field5399 = 0;
        this.field5458 = this.field5219;
        this.field5474 = this.field5227;
        OpenGL.glDisable(3089);
        this.method2273(7039);
    }

    @OriginalMember(owner = "client!ad", name = "ya", descriptor = "(IIIII)V", line = 834)
    public final void method384(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2309(11);
        ++field5319;
        this.method2327(arg4, (byte) 85);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V", line = 854)
    public final void method2269(byte arg0, int arg1) {
        ++field5260;
        if (~this.field5384 != ~arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field5384 = arg1;
        }
        int var3 = -13 % ((arg0 - -50) / 44);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II[[I[[IIII)Ld;", line = 871)
    public final class132 method304(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5268;
        return new class506(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lbe;)V", line = 882)
    public final void method396(class33 arg0) {
        ++field5179;
        this.field5321.method702(arg0, -81, this);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([BIIBZ)Lil;", line = 890)
    public final class7 method2270(byte[] arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        if (arg3 != 9) {
            return null;
        } else {
            ++field5151;
            return (class7) (!this.field5397 || arg4 && !this.field5382 ? new class300(this, arg2, arg0, arg1) : new class355(this, arg2, arg0, arg1, arg4));
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lba;Lbe;Lq;Lsda;I)V", line = 909)
    public final void method307(class327 arg0, class33 arg1, class364 arg2, class219 arg3, int arg4) {
        ++field5146;
        arg0.method1380(arg2, arg3, arg4);
        this.method396(arg1);
    }

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "(I)V", line = 921)
    private final void method2271(int arg0) {
        if (arg0 != 0) {
            this.method2311(94);
        }
        if (this.field5432 && ~this.field5424 <= -1 | this.field5385) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field5272;
    }

    @OriginalMember(owner = "client!ad", name = "YA", descriptor = "(IFFFFF)V", line = 937)
    public final void method310(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field5293;
        boolean var7 = this.field5470 != arg0;
        if (var7 || this.field5487 != arg1 || this.field5465 != arg2) {
            this.field5470 = arg0;
            this.field5487 = arg1;
            this.field5465 = arg2;
            if (var7) {
                this.field5380 = (float) (this.field5470 & 16711680) / 1.671168E7F;
                this.field5420 = (float) (65280 & this.field5470) / 65280.0F;
                this.field5444 = (float) (this.field5470 & 255) / 255.0F;
                this.method2306(120);
            }
            this.method2296(0);
        }
        if (this.field5389[0] != arg3 || this.field5389[1] != arg4 || this.field5389[2] != arg5) {
            this.field5389[2] = arg5;
            this.field5389[1] = arg4;
            this.field5389[0] = arg3;
            this.field5422[2] = -arg5;
            this.field5422[1] = -arg4;
            this.field5422[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5387[1] = arg4 * var8;
            this.field5387[0] = arg3 * var8;
            this.field5387[2] = arg5 * var8;
            this.field5414[2] = -this.field5387[2];
            this.field5414[0] = -this.field5387[0];
            this.field5414[1] = -this.field5387[1];
            this.method2321((byte) 112);
            this.field5449 = (int) (arg3 * 256.0F / arg4);
            this.field5482 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)I", line = 988)
    public final int method293(int arg0, int arg1) {
        ++field5188;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "()V", line = 997)
    public final void method350() {
        this.field5339.method3586((byte) 48);
        ++field5338;
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(Z)V", line = 1008)
    private final void method2272(boolean arg0) {
        ++field5170;
        if (arg0) {
            this.field5468 = true;
        }
        OpenGL.glDepthMask(this.field5417 && this.field5436);
    }

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "(I)V", line = 1019)
    private final void method2273(int arg0) {
        this.field5419 = (float) (-this.field5469 + this.field5399);
        if (arg0 != 7039) {
            this.method2284((byte) 0);
        }
        this.field5454 = (float) (this.field5458 - this.field5456);
        ++field5258;
        this.field5492 = (float) (-this.field5456 + this.field5472);
        this.field5396 = (float) (-this.field5469 + this.field5474);
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "()Z", line = 1034)
    public final boolean method297() {
        ++field5295;
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V", line = 1043)
    public static final void method2274(byte arg0) {
        if (arg0 != 5) {
            field5239 = null;
        }
        ++field5238;
        class194.field2581.method528(-519011192);
    }

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "(I)V", line = 1054)
    public final void method2275(int arg0) {
        OpenGL.glPushMatrix();
        ++field5286;
        if (arg0 != -31202) {
            this.method320(86, 84, -90, 35, 56, 34);
        }
    }

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "()Lnl;", line = 1067)
    public final class479 method330() {
        ++field5315;
        int var1 = -1;
        if (this.field5486.indexOf("nvidia") == -1) {
            if (this.field5486.indexOf("intel") == -1) {
                if (this.field5486.indexOf("ati") != -1) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class479(var1, "OpenGL", this.field5416, this.field5446, 0L);
    }

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "(I)V", line = 1089)
    private final void method2276(int arg0) {
        ++field5152;
        float var2 = (float) (-this.field5469) * this.field5480 / (float) this.field5373;
        float var3 = (float) (-this.field5456) * this.field5480 / (float) this.field5478;
        float var4 = (float) (-this.field5469 + this.field5227) * this.field5480 / (float) this.field5373;
        float var5 = (float) (-this.field5456 + this.field5219) * this.field5480 / (float) this.field5478;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field5455 - this.field5404), (double) ((float) this.field5377 + -this.field5404));
        }
        OpenGL.glMatrixMode(arg0);
    }

    @OriginalMember(owner = "client!ad", name = "aa", descriptor = "()I", line = 1112)
    public final int method374() {
        ++field5195;
        int var1 = this.field5497;
        this.field5497 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIIIII)V", line = 1123)
    public final void method294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5212;
        this.method2309(54);
        this.method2327(arg9, (byte) -128);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIII)V", line = 1143)
    public final void method332(int arg0, int arg1, int arg2, int arg3) {
        ++field5169;
        this.field5339.method3583(arg1, arg2, arg3, arg0, true);
    }

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "(I)V", line = 1153)
    public static void method2277(int arg0) {
        field5182 = null;
        int var1 = 85 % ((-28 - arg0) / 53);
        field5239 = null;
        field5141 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)V", line = 1164)
    public final void method2278(boolean arg0, int arg1) {
        if (arg1 != -32) {
            this.field5436 = false;
        }
        ++field5145;
        if (this.field5432 == !arg0) {
            this.field5432 = arg0;
            this.method2271(0);
            this.field5429 &= -32;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V", line = 1181)
    public final void method378(boolean arg0) {
        ++field5322;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIILfa;II)V", line = 1188)
    public final void method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class199 arg6, int arg7, int arg8) {
        ++field5276;
        class34 var10 = (class34) arg6;
        class325 var11 = var10.field388;
        this.method2323(true);
        this.method2295(-118, var10.field388);
        this.method2327(arg5, (byte) 76);
        this.method2320(8448, 7681, 0);
        this.method2291(34167, 0, 768, (byte) -35);
        float var12 = var11.field4691 / (float) var11.field4685;
        float var13 = var11.field4687 / (float) var11.field4692;
        float var14 = (float) (-arg0) + (float) arg2;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var17 = var14 * var16;
        float var18 = var15 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method2291(5890, 0, 768, (byte) -35);
    }

    @OriginalMember(owner = "client!ad", name = "sa", descriptor = "(II)V", line = 1228)
    public final void method393(int arg0, int arg1) {
        if (~this.field5455 != ~arg0 || this.field5377 != arg1) {
            this.field5455 = arg0;
            this.field5377 = arg1;
            this.method2313((byte) -98);
            this.method2282(0);
            if (~this.field5488 != -4) {
                if (~this.field5488 == -3) {
                    this.method2302((byte) -114);
                }
            } else {
                this.method2276(5888);
            }
        }
        ++field5341;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lbo;I)V", line = 1253)
    public final void method2279(class632 arg0, int arg1) {
        if (this.field5485 != arg0) {
            if (this.field5397) {
                OpenGL.glBindBufferARB(34962, arg0.method452(-127));
            }
            this.field5485 = arg0;
        }
        if (arg1 != -24529) {
            this.field5483 = -92;
        }
        ++field5215;
    }

    @OriginalMember(owner = "client!ad", name = "AA", descriptor = "(IIII)V", line = 1271)
    public final void method365(int arg0, int arg1, int arg2, int arg3) {
        this.field5385 = true;
        this.field5451 = arg2;
        this.field5476 = arg0;
        this.field5408 = arg1;
        this.field5379 = arg3;
        ++field5300;
        this.field5328.method1886(0, false, 3, false, 0, 11683);
        this.field5328.field4046.method793((byte) -81);
        this.method2282(0);
        this.method2271(0);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(FFZ)V", line = 1290)
    public final void method2280(float arg0, float arg1, boolean arg2) {
        ++field5296;
        this.field5390 = arg1;
        this.field5410 = arg0;
        if (!this.field5385) {
            this.method2282(0);
        }
        if (arg2) {
            this.field5336 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IIII)V", line = 1306)
    public final void method2281(int arg0, int arg1, int arg2, int arg3) {
        ++field5326;
        if (arg3 == -34845) {
            OpenGL.glDrawArrays(arg0, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "(I)V", line = 1320)
    private final void method2282(int arg0) {
        ++field5320;
        int var2;
        if (this.field5385) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field5408;
        } else {
            this.field5464 = (float) (-this.field5395 + this.field5377) + -this.field5390;
            this.field5471 = this.field5464 - (float) this.field5424 * this.field5410;
            if (this.field5471 < (float) this.field5455) {
                this.field5471 = (float) this.field5455;
            }
            OpenGL.glFogf(2915, this.field5471);
            OpenGL.glFogf(2916, this.field5464);
            var2 = this.field5466;
        }
        class599.field8752[1] = (float) class643.method3659(var2, 65280) / 65280.0F;
        class599.field8752[2] = (float) class643.method3659(var2, 255) / 255.0F;
        class599.field8752[0] = (float) class643.method3659(var2, 16711680) / 1.671168E7F;
        OpenGL.glFogfv(2918, class599.field8752, arg0);
        if (this.field5385) {
            this.field5328.field4046.method790(-19765);
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(II)I", line = 1356)
    public final int method2283(int arg0, int arg1) {
        if (arg0 != 3) {
            this.method2265((byte) 52);
        }
        ++field5248;
        if (arg1 != 6406 && ~arg1 != -6410) {
            if (arg1 != 6410 && arg1 != 34846 && ~arg1 != -34845) {
                if (arg1 != 6407) {
                    if (~arg1 != -6409 && arg1 != 34847) {
                        if (~arg1 != -34844) {
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
                    return 3;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V", line = 1399)
    public final void method380(int arg0) {
        ++field5190;
        if (~arg0 <= -129 && arg0 <= 1024) {
            this.field5334 = arg0;
            this.field5336.method2884(76);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "()V", line = 1412)
    public final void method338() throws class27 {
        try {
            this.field5203.swapBuffers();
        } catch (Exception var1) {
        }
        ++field5249;
    }

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "(I)V", line = 1429)
    public final void method344(int arg0) {
        ++field5267;
        this.method2327(0, (byte) 99);
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ldw;)V", line = 1441)
    public final void method392(class622 arg0) {
        this.field5490 = (class200) arg0;
        ++field5311;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "()V", line = 1450)
    public final void method362() {
        OpenGL.glFinish();
        ++field5213;
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(B)V", line = 1458)
    public final void method2284(byte arg0) {
        ++field5166;
        if (arg0 == 85) {
            if (this.field5488 != 0) {
                this.field5429 &= -32;
                this.field5488 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IZ)V", line = 1477)
    public final void method2285(int arg0, boolean arg1) {
        ++field5308;
        if (!this.field5417 != !arg1) {
            this.field5417 = arg1;
            this.method2272(false);
            this.field5429 &= -32;
        }
        if (arg0 != -32) {
            this.method382((class364) null);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIII)Ldw;", line = 1496)
    public final class622 method308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5323;
        return this.field5391 ? new class357(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)V", line = 1505)
    public final void method2286(int arg0, byte arg1) {
        ++field5228;
        this.method2251(false, arg0, true);
        if (arg1 > -15) {
            this.field5383 = false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "(IIIII)V", line = 1516)
    public final void method327(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        ++field5167;
        if (~(arg0 + arg2) <= ~this.field5399 && ~(-arg2 + arg0) >= ~this.field5474 && this.field5472 <= arg1 + arg2 && ~this.field5458 <= ~(-arg2 + arg1)) {
            this.method2309(37);
            this.method2327(arg4, (byte) -128);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field5442 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if ((float) var8 <= this.field5412) {
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
                } else if (var9 > 512) {
                    var9 = 512;
                }
                int var10 = class309.method2052(true, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = 16384 - var10; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class561.field7995[var11] * (float) arg2 + var6, class561.field7989[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "()Z", line = 1593)
    public final boolean method334() {
        ++field5269;
        return false;
    }

    @OriginalMember(owner = "client!ad", name = "na", descriptor = "(III[I)V", line = 1601)
    public final void method364(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5204;
        float var5 = (float) arg2 * this.field5453.field4449 + (float) arg0 * this.field5453.field4451 + (float) arg1 * this.field5453.field4448 + this.field5453.field4440;
        if (!((float) this.field5455 > var5) && !((float) this.field5377 < var5)) {
            int var6 = (int) (((float) arg2 * this.field5453.field4462 + (float) arg0 * this.field5453.field4441 + (float) arg1 * this.field5453.field4444 + this.field5453.field4452) * (float) this.field5373 / var5);
            int var7 = (int) (((float) arg2 * this.field5453.field4450 + (float) arg0 * this.field5453.field4434 + (float) arg1 * this.field5453.field4458 + this.field5453.field4439) * (float) this.field5478 / var5);
            if (this.field5419 <= (float) var6 && (float) var6 <= this.field5396 && (float) var7 >= this.field5492 && this.field5454 >= (float) var7) {
                arg3[0] = (int) ((float) var6 - this.field5419);
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 + -this.field5492);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lrt;I)Luba;", line = 1632)
    public static final class367 method2287(class194 arg0, int arg1) {
        if (arg1 != 2919) {
            field5141 = null;
        }
        ++field5255;
        return new class367(arg0.method1233(65280), arg0.method1233(arg1 ^ 62567), arg0.method1233(65280), arg0.method1233(65280), arg0.method1233(arg1 ^ 62567), arg0.method1233(65280), arg0.method1233(65280), arg0.method1233(65280), arg0.method1180(-832631516), arg0.method1177(255));
    }

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "()Z", line = 1643)
    public final boolean method335() {
        ++field5285;
        if (this.field5316 != null) {
            if (!this.field5316.method850(0)) {
                if (!this.field5339.method3588(-94, this.field5316)) {
                    return false;
                }
                this.field5336.method2884(86);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "(ILfa;II)V", line = 1668)
    public final void method312(int arg0, class199 arg1, int arg2, int arg3) {
        ++field5225;
        class34 var5 = (class34) arg1;
        class325 var6 = var5.field388;
        this.method2323(true);
        this.method2295(-106, var5.field388);
        this.method2327(1, (byte) -125);
        this.method2320(8448, 7681, 0);
        this.method2291(34167, 0, 768, (byte) -35);
        float var7 = var6.field4691 / (float) var6.field4685;
        float var8 = var6.field4687 / (float) var6.field4692;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5399) * var7, (float) (-arg3 + this.field5472) * var8);
        OpenGL.glVertex2i(this.field5399, this.field5472);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5399) * var7, (float) (-arg3 + this.field5458) * var8);
        OpenGL.glVertex2i(this.field5399, this.field5458);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5474) * var7, (float) (-arg3 + this.field5458) * var8);
        OpenGL.glVertex2i(this.field5474, this.field5458);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5474) * var7, (float) (-arg3 + this.field5472) * var8);
        OpenGL.glVertex2i(this.field5474, this.field5472);
        OpenGL.glEnd();
        this.method2291(5890, 0, 768, (byte) -35);
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(II)V", line = 1701)
    public final void method2288(int arg0, int arg1) {
        ++field5287;
        if (arg0 != 1) {
            if (arg0 != 0) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.method2320(8448, 260, 0);
                    } else if (~arg0 == -5) {
                        this.method2320(34023, 34023, 0);
                    }
                } else {
                    this.method2320(7681, 34165, 0);
                }
            } else {
                this.method2320(8448, 8448, arg1 ^ 7681);
            }
        } else {
            this.method2320(7681, 7681, 0);
        }
        if (arg1 != 7681) {
            this.field5459 = false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "(IIIIII)V", line = 1731)
    public final void method394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5283;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method2309(34);
        this.method2327(arg5, (byte) -126);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5443) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5443) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(B)V", line = 1767)
    private final void method2289(byte arg0) {
        if (arg0 > -20) {
            this.field5392 = null;
        }
        if (this.field5474 >= this.field5399 && ~this.field5458 <= ~this.field5472) {
            OpenGL.glScissor(this.field5439 + this.field5399, -this.field5458 + this.field5484 - -this.field5219, -this.field5399 + this.field5474, -this.field5472 + this.field5458);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field5294;
    }

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "()V", line = 1783)
    public final void method354() {
        ++field5186;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1797)
    public final void method357(Canvas arg0) {
        ++field5318;
        if (this.field5183 == arg0) {
            throw new RuntimeException();
        } else if (this.field5247.containsKey(arg0)) {
            Long var2 = (Long) this.field5247.get(arg0);
            this.field5203.releaseSurface(arg0, var2);
            this.field5247.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "(I)V", line = 1818)
    public final void method2290(int arg0) {
        if (arg0 != 7551) {
            this.field5494 = null;
        }
        if (~this.field5429 != -5) {
            this.method2319(94);
            this.method2278(false, arg0 ^ -7521);
            this.method2326(-1254361672, false);
            this.method2260(2144, false);
            this.method2285(-32, false);
            this.method2286(-2, (byte) -57);
            this.method2327(1, (byte) 83);
            this.field5429 = 4;
        }
        ++field5291;
    }

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "(IIII)V", line = 1840)
    public final void method333(int arg0, int arg1, int arg2, int arg3) {
        ++field5301;
        if (this.field5474 > arg2) {
            this.field5474 = arg2;
        }
        if (~this.field5472 > ~arg1) {
            this.field5472 = arg1;
        }
        if (~this.field5399 > ~arg0) {
            this.field5399 = arg0;
        }
        if (this.field5458 > arg3) {
            this.field5458 = arg3;
        }
        OpenGL.glEnable(3089);
        this.method2273(7039);
        this.method2289((byte) -75);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIB)V", line = 1867)
    public final void method2291(int arg0, int arg1, int arg2, byte arg3) {
        OpenGL.glTexEnvi(8960, 34176 - -arg1, arg0);
        ++field5217;
        OpenGL.glTexEnvi(8960, arg1 + 34192, arg2);
        if (arg3 != -35) {
            this.field5357 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "()Lq;", line = 1879)
    public final class364 method342() {
        ++field5317;
        return this.field5346;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lq;)V", line = 1888)
    public final void method382(class364 arg0) {
        ++field5177;
        this.field5453 = (class302) arg0;
        this.field5430.method2005((byte) -31, this.field5453);
        if (~this.field5488 != -2) {
            this.method2305((byte) -29);
        }
    }

    @OriginalMember(owner = "client!ad", name = "IA", descriptor = "()I", line = 1902)
    public final int method369() {
        ++field5246;
        return this.field5377;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "()Z", line = 1912)
    public final boolean method363() {
        ++field5222;
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lcq;[Laf;Z)Lta;", line = 1922)
    public final class181 method329(class402 arg0, class372[] arg1, boolean arg2) {
        ++field5254;
        return new class267(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1930)
    public final void method361(Canvas arg0) {
        this.field5159 = null;
        this.field5185 = 0L;
        ++field5143;
        if (arg0 != null && this.field5183 != arg0) {
            if (this.field5247.containsKey(arg0)) {
                Long var2 = (Long) this.field5247.get(arg0);
                this.field5185 = var2;
                this.field5159 = arg0;
            }
        } else {
            this.field5159 = this.field5183;
            this.field5185 = this.field5216;
        }
        if (this.field5159 != null && ~this.field5185 != -1L) {
            this.field5203.setSurface(this.field5185);
            this.method2268((byte) 45);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(FFF)V", line = 1961)
    public final void method387(float arg0, float arg1, float arg2) {
        class122.field1525 = arg0;
        ++field5262;
        class213.field2946 = arg2;
        class227.field3189 = arg1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BJ)V", line = 1973)
    public final synchronized void method2292(byte arg0, long arg1) {
        ++field5306;
        class324 var4 = new class324();
        var4.field4676 = arg1;
        this.field5372.method706(var4, true);
        if (arg0 != 14) {
            this.field5458 = -62;
        }
    }

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "(I)V", line = 1987)
    private final void method2293(int arg0) {
        OpenGL.glViewport(this.field5439, this.field5484, this.field5227, this.field5219);
        ++field5236;
        if (arg0 != -28896) {
            this.method325();
        }
    }

    @OriginalMember(owner = "client!ad", name = "ca", descriptor = "(IIII)V", line = 1999)
    public final void method368(int arg0, int arg1, int arg2, int arg3) {
        if (~arg1 > -1) {
            arg1 = 0;
        }
        ++field5298;
        if (~arg2 < ~this.field5227) {
            arg2 = this.field5227;
        }
        if (~this.field5219 > ~arg3) {
            arg3 = this.field5219;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        this.field5472 = arg1;
        this.field5474 = arg2;
        this.field5458 = arg3;
        this.field5399 = arg0;
        OpenGL.glEnable(3089);
        this.method2273(7039);
        this.method2289((byte) -66);
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(Z)V", line = 2027)
    private final void method2294(boolean arg0) {
        ++field5148;
        if (arg0) {
            this.method341();
        }
        this.field5203.method3147();
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILpm;)V", line = 2039)
    public final void method2295(int arg0, class507 arg1) {
        ++field5312;
        if (arg0 > -47) {
            this.method2331((class497) null, 30);
        }
        class507 var3 = this.field5413[this.field5384];
        if (arg1 != var3) {
            if (arg1 != null) {
                if (var3 == null) {
                    OpenGL.glEnable(arg1.field7373);
                } else if (~arg1.field7373 != ~var3.field7373) {
                    OpenGL.glDisable(var3.field7373);
                    OpenGL.glEnable(arg1.field7373);
                }
                OpenGL.glBindTexture(arg1.field7373, arg1.method3017(0));
            } else {
                OpenGL.glDisable(var3.field7373);
            }
            this.field5413[this.field5384] = arg1;
        }
        this.field5429 &= -2;
    }

    @OriginalMember(owner = "client!ad", name = "LA", descriptor = "(IIII)V", line = 2078)
    public final void method319(int arg0, int arg1, int arg2, int arg3) {
        ++field5174;
        if (!this.field5385) {
            throw new RuntimeException("");
        } else {
            this.field5476 = arg0;
            this.field5451 = arg2;
            this.field5379 = arg3;
            this.field5408 = arg1;
            this.field5328.field4046.method793((byte) -108);
            this.method2282(0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "(I)V", line = 2104)
    private final void method2296(int arg0) {
        class599.field8752[arg0] = this.field5487 * this.field5380;
        class599.field8752[3] = 1.0F;
        class599.field8752[2] = this.field5487 * this.field5444;
        ++field5175;
        class599.field8752[1] = this.field5487 * this.field5420;
        OpenGL.glLightfv(16384, 4609, class599.field8752, 0);
        class599.field8752[2] = -this.field5465 * this.field5444;
        class599.field8752[3] = 1.0F;
        class599.field8752[0] = -this.field5465 * this.field5380;
        class599.field8752[1] = -this.field5465 * this.field5420;
        OpenGL.glLightfv(16385, 4609, class599.field8752, 0);
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(B)V", line = 2126)
    private final void method2297(byte arg0) {
        if (this.field5404 == 0.0F) {
            this.field5426[10] = this.field5428;
            this.field5426[14] = this.field5437;
        } else {
            float var2 = this.field5447 / (this.field5447 + this.field5404);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field5437 * (1.0F - var2) / this.field5404;
            this.field5426[10] = this.field5428 + var4;
            this.field5426[14] = this.field5437 * var3;
        }
        ++field5214;
        if (arg0 < 40) {
            this.field5417 = false;
        }
        this.field5460 = (float) this.field5377 - this.field5404;
        this.field5475 = (this.field5426[14] + (float) (-this.field5377)) / this.field5426[10];
    }

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "(III)V", line = 2160)
    public final void method352(int arg0, int arg1, int arg2) {
        ++field5210;
        if (this.field5466 != arg0 || this.field5424 != arg1 || ~this.field5395 != ~arg2) {
            this.field5395 = arg2;
            this.field5424 = arg1;
            this.field5466 = arg0;
            if (this.field5385) {
                return;
            }
            this.method2282(0);
            this.method2271(0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "KA", descriptor = "(IIII)[I", line = 2184)
    public final int[] method405(int arg0, int arg1, int arg2, int arg3) {
        ++field5253;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; arg3 > var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, this.field5219 - arg1 + -var6, arg2, 1, 32993, this.field5483, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Laf;Z)Lxa;", line = 2207)
    public final class433 method388(class372 arg0, boolean arg1) {
        ++field5278;
        int[] var3 = new int[arg0.field5692 * arg0.field5688];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field5684 == null) {
            for (int var6 = 0; var6 < arg0.field5692; ++var6) {
                for (int var7 = 0; arg0.field5688 > var7; ++var7) {
                    int var8 = arg0.field5691[arg0.field5685[var4++] & 255];
                    var3[var5++] = var8 != 0 ? class283.method1834(-16777216, var8) : 0;
                }
            }
        } else {
            for (int var9 = 0; arg0.field5692 > var9; ++var9) {
                for (int var11 = 0; var11 < arg0.field5688; ++var11) {
                    var3[var5++] = class283.method1834(arg0.field5684[var4] << 24, arg0.field5691[class643.method3659(arg0.field5685[var4], 255)]);
                    ++var4;
                }
            }
        }
        class433 var10 = this.method343(var3, 0, arg0.field5688, arg0.field5688, arg0.field5692);
        var10.method1580(arg0.field5686, arg0.field5687, arg0.field5690, arg0.field5689);
        return var10;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V", line = 2269)
    public final void method345(int arg0) {
        this.method2257((byte) -96);
        ++field5157;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "()Lq;", line = 2277)
    public final class364 method337() {
        ++field5305;
        return new class302();
    }

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "()V", line = 2285)
    public final void method367() {
        for (class324 var1 = this.field5350.method719(false); var1 != null; var1 = this.field5350.method716(14)) {
            ((class523) var1).method3089(-1966801983);
        }
        ++field5173;
        if (this.field5339 != null) {
            this.field5339.method3579(1);
        }
        if (this.field5203 != null) {
            this.method2294(false);
            Enumeration var2 = this.field5247.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field5247.get(var3);
                this.field5203.releaseSurface(var3, var4);
            }
            this.field5203.release();
            this.field5203 = null;
        }
        if (this.field5354) {
            class98.method614(1, true, false);
            this.field5354 = false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "()Z", line = 2330)
    public final boolean method325() {
        ++field5241;
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "()Z", line = 2341)
    public final boolean method331() {
        ++field5252;
        return this.field5316 != null && (this.field5331 <= 1 || this.field5463);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZILjaclib/memory/Buffer;ZI)Lbo;", line = 2349)
    public final class632 method2298(boolean arg0, int arg1, Buffer arg2, boolean arg3, int arg4) {
        ++field5333;
        if (!arg0) {
            this.field5478 = -118;
        }
        return (class632) (!this.field5397 || arg3 && !this.field5382 ? new class380(this, arg4, arg2) : new class65(this, arg4, arg2, arg1, arg3));
    }

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "(I)V", line = 2366)
    private final void method2299(int arg0) {
        ++field5310;
        if (this.field5402 && !this.field5406) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 != 3843) {
            this.method301(-16, -80, (int[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIZ)Lxa;", line = 2382)
    public final class433 method389(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5257;
        return new class453(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "()Z", line = 2391)
    public final boolean method370() {
        ++field5165;
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([IIIII)Lxa;", line = 2399)
    public final class433 method343(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5261;
        return new class453(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V", line = 2408)
    public final void method323(boolean arg0) {
        this.field5436 = arg0;
        ++field5164;
        this.method2272(false);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([Lba;Lbe;Lq;[Lsda;I)V", line = 2421)
    public final void method328(class327[] arg0, class33 arg1, class364 arg2, class219[] arg3, int arg4) {
        this.method385(arg0, arg2, arg3, arg4);
        ++field5345;
        this.method396(arg1);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIII)V", line = 2432)
    public final void method351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field5245;
        this.method320(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 2445)
    public final synchronized void method400(int arg0) {
        ++field5335;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field5367.method715(true)) {
            class388 var12 = (class388) this.field5367.method714(true);
            class655.field9483[var3++] = (int) var12.field4676;
            this.field5363 -= var12.field5965;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class655.field9483, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class655.field9483, 0);
            var3 = 0;
        }
        while (!this.field5368.method715(true)) {
            class388 var11 = (class388) this.field5368.method714(true);
            class655.field9483[var3++] = (int) var11.field4676;
            this.field5365 -= var11.field5965;
            if (~var3 == -1001) {
                OpenGL.glDeleteTextures(var3, class655.field9483, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class655.field9483, 0);
            var3 = 0;
        }
        while (!this.field5369.method715(true)) {
            class388 var10 = (class388) this.field5369.method714(true);
            class655.field9483[var3++] = var10.field5965;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class655.field9483, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class655.field9483, 0);
            var3 = 0;
        }
        while (!this.field5370.method715(true)) {
            class388 var9 = (class388) this.field5370.method714(true);
            class655.field9483[var3++] = (int) var9.field4676;
            this.field5366 -= var9.field5965;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class655.field9483, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class655.field9483, 0);
            boolean var4 = false;
        }
        while (!this.field5364.method715(true)) {
            class388 var8 = (class388) this.field5364.method714(true);
            OpenGL.glDeleteLists((int) var8.field4676, var8.field5965);
        }
        while (!this.field5371.method715(true)) {
            class324 var7 = this.field5371.method714(true);
            OpenGL.glDeleteProgramARB((int) var7.field4676);
        }
        while (!this.field5372.method715(true)) {
            class324 var6 = this.field5372.method714(true);
            OpenGL.glDeleteObjectARB(var6.field4676);
        }
        while (!this.field5364.method715(true)) {
            class388 var5 = (class388) this.field5364.method714(true);
            OpenGL.glDeleteLists((int) var5.field4676, var5.field5965);
        }
        this.field5336.method2879(-120);
        if (this.method381() > 100663296 && class84.method550((byte) -119) > this.field5407 + 60000L) {
            System.gc();
            this.field5407 = class84.method550((byte) -104);
        }
        this.field5351 = var2;
    }

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "()I", line = 2613)
    public final int method324() {
        ++field5160;
        return 4;
    }

    @OriginalMember(owner = "client!ad", name = "SA", descriptor = "()I", line = 2622)
    public final int method375() {
        ++field5168;
        int var1 = this.field5498;
        this.field5498 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(BI)V", line = 2637)
    public final void method2300(byte arg0, int arg1) {
        class599.field8752[2] = (float) class643.method3659(arg1, 255) / 255.0F;
        class599.field8752[1] = (float) class643.method3659(arg1, 65280) / 65280.0F;
        class599.field8752[3] = (float) (arg1 >>> 24) / 255.0F;
        class599.field8752[0] = (float) class643.method3659(arg1, 16711680) / 1.671168E7F;
        ++field5184;
        int var3 = -18 % ((62 - arg0) / 59);
        OpenGL.glTexEnvfv(8960, 8705, class599.field8752, 0);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IIIIII)V", line = 2651)
    public final void method320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5158;
        this.method2309(17);
        this.method2327(arg5, (byte) -122);
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) arg3 - (float) arg1;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var7 * var9;
        float var11 = var8 * var9;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var10 + 0.35F, (float) arg3 + var11 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "(I)V", line = 2675)
    private final void method2301(int arg0) {
        if (this.field5488 != 2) {
            this.field5488 = 2;
            this.method2302((byte) -114);
            this.method2305((byte) -29);
            this.field5429 &= -8;
        }
        if (arg0 != -6266) {
            this.method2330(-56, (class497) null);
        }
        ++field5270;
    }

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "(B)V", line = 2694)
    private final void method2302(byte arg0) {
        OpenGL.glMatrixMode(5889);
        ++field5207;
        OpenGL.glLoadMatrixf(this.field5426, 0);
        OpenGL.glMatrixMode(5888);
        if (arg0 != -114) {
            this.field5460 = 1.0051947F;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(ZLim;)V", line = 2707)
    public final void method2303(boolean arg0, class497 arg1) {
        ++field5281;
        if (~this.field5355 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field5355 >= 0) {
                this.field5360[this.field5355].method2983(-128);
            }
            this.field5362 = this.field5360[++this.field5355] = arg1;
            if (arg0) {
                this.field5362.method2984(124);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(FI)V", line = 2726)
    public final void method2304(float arg0, int arg1) {
        if (arg1 != -2) {
            this.field5366 = -53;
        }
        ++field5292;
        if (this.field5480 != arg0) {
            this.field5480 = arg0;
            if (~this.field5488 == -4) {
                this.method2276(5888);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "(B)V", line = 2745)
    private final void method2305(byte arg0) {
        if (arg0 == -29) {
            OpenGL.glLoadIdentity();
            ++field5343;
            OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMultMatrixf(this.field5453.method2013(40), 0);
            if (this.field5385) {
                this.field5328.field4046.method793((byte) -60);
            }
            this.method2321((byte) 97);
            this.method2264(-119);
        }
    }

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "()Z", line = 2764)
    public final boolean method356() {
        ++field5327;
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "(I)V", line = 2772)
    private final void method2306(int arg0) {
        int var2 = 43 / ((arg0 - 55) / 63);
        ++field5344;
        class599.field8752[1] = this.field5420 * this.field5386;
        class599.field8752[0] = this.field5386 * this.field5380;
        class599.field8752[3] = 1.0F;
        class599.field8752[2] = this.field5444 * this.field5386;
        OpenGL.glLightModelfv(2899, class599.field8752, 0);
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(II)V", line = 2789)
    public final synchronized void method2307(int arg0, int arg1) {
        ++field5233;
        class388 var3 = new class388(arg1);
        this.field5369.method706(var3, true);
        if (arg0 != -17602) {
            this.field5394 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BZ)V", line = 2804)
    public final void method2308(byte arg0, boolean arg1) {
        if (arg0 != -46) {
            this.method380(-105);
        }
        ++field5153;
        if (!arg1 != !this.field5406) {
            this.field5406 = arg1;
            this.method2299(3843);
        }
    }

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "()Z", line = 2820)
    public final boolean method390() {
        ++field5192;
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "(I)V", line = 2828)
    private final void method2309(int arg0) {
        ++field5242;
        if (this.field5429 != 1) {
            this.method2319(51);
            this.method2278(false, -32);
            this.method2326(-1254361672, false);
            this.method2260(2144, false);
            this.method2285(-32, false);
            this.method2295(-68, (class507) null);
            this.method2286(-2, (byte) -126);
            this.method2288(1, 7681);
            this.field5429 = 1;
        }
        if (arg0 <= 1) {
            this.method2283(-2, -36);
        }
    }

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "()Z", line = 2857)
    public final boolean method399() {
        ++field5226;
        return false;
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(II)I", line = 2870)
    public final int method2310(int arg0, int arg1) {
        ++field5337;
        if (~arg1 != -5122 && arg1 != 5120) {
            if (~arg1 != -5124 && ~arg1 != -5123) {
                if (arg1 != 5125 && ~arg1 != -5125 && arg1 != 5126) {
                    if (arg0 > -96) {
                        this.field5439 = -120;
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

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ldw;Ldw;FLdw;)Ldw;", line = 2892)
    public final class622 method371(class622 arg0, class622 arg1, float arg2, class622 arg3) {
        ++field5199;
        if (arg0 != null && arg1 != null && this.field5391 && this.field5481) {
            class225 var5 = null;
            class200 var6 = (class200) arg0;
            class200 var7 = (class200) arg1;
            class158 var8 = var6.method1269(false);
            class158 var9 = var7.method1269(false);
            if (var8 != null && var9 != null) {
                int var10 = var9.field1952 < var8.field1952 ? var8.field1952 : var9.field1952;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class225) {
                    class225 var11 = (class225) arg3;
                    if (~var10 == ~var11.method1471(65535)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class225(this, var10);
                }
                if (var5.method1470(var9, arg2, 0, var8)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "(I)V", line = 2941)
    private final void method2311(int arg0) {
        ++field5256;
        this.field5453 = new class302();
        this.field5430 = new class302();
        this.field5413 = new class507[this.field5418];
        this.field5435 = new class289(this, 3553, 6408, 1, 1);
        new class289(this, 3553, 6408, 1, 1);
        new class289(this, 3553, 6408, 1, 1);
        this.field5415 = new class212(this);
        this.field5405 = new class212(this);
        this.field5440 = new class212(this);
        this.field5491 = new class212(this);
        this.field5431 = new class212(this);
        this.field5450 = new class212(this);
        if (arg0 != -3506) {
            this.field5439 = -93;
        }
        this.field5434 = new class212(this);
        this.field5393 = new class212(this);
        this.field5394 = new class212(this);
        this.field5376 = new class212(this);
        if (this.field5481) {
            this.field5398 = new class535(this);
            new class535(this);
        }
    }

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "(I)I", line = 2981)
    private final int method2312(int arg0) {
        ++field5332;
        this.field5486 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field5446 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field5486.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (this.field5486.indexOf("brian paul") != -1 || this.field5486.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class293.method1890(' ', (byte) -1, var3.replace('.', ' '));
        if (var4.length < 2) {
            var2 |= 4;
        } else {
            try {
                int var5 = class575.method3340((byte) -47, var4[0]);
                int var6 = class575.method3340((byte) 46, var4[1]);
                this.field5416 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (this.field5416 < 12) {
            var2 |= 2;
        }
        if (!this.field5203.method3149("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field5203.method3149("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, arg0);
        this.field5418 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field5388 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field5411 = var7[0];
        if (this.field5418 < 2 || this.field5388 < 2 || ~this.field5411 > -3) {
            var2 |= 16;
        }
        this.field5468 = Stream.method3423();
        this.field5203.arePbuffersAvailable();
        this.field5397 = this.field5203.method3149("GL_ARB_vertex_buffer_object");
        this.field5443 = this.field5203.method3149("GL_ARB_multisample");
        this.field5467 = this.field5203.method3149("GL_ARB_vertex_program");
        this.field5203.method3149("GL_ARB_fragment_program");
        this.field5383 = this.field5203.method3149("GL_ARB_vertex_shader");
        this.field5459 = this.field5203.method3149("GL_ARB_fragment_shader");
        this.field5441 = this.field5203.method3149("GL_EXT_texture3D");
        this.field5473 = this.field5203.method3149("GL_ARB_texture_rectangle");
        this.field5391 = this.field5203.method3149("GL_ARB_texture_cube_map");
        this.field5452 = this.field5203.method3149("GL_ARB_texture_float");
        this.field5433 = false;
        this.field5481 = this.field5203.method3149("GL_EXT_framebuffer_object");
        this.field5425 = this.field5203.method3149("GL_EXT_framebuffer_blit");
        this.field5375 = this.field5203.method3149("GL_EXT_framebuffer_multisample");
        this.field5463 = this.field5375 & this.field5425;
        OpenGL.glGetFloatv(2834, class599.field8752, 0);
        this.field5412 = class599.field8752[1];
        this.field5442 = class599.field8752[0];
        return var2 == 0 ? 0 : var2;
    }

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "(B)V", line = 3067)
    private final void method2313(byte arg0) {
        ++field5142;
        float[] var2 = this.field5426;
        int var3 = 13 / ((arg0 - -3) / 63);
        float var4 = (float) (-this.field5469 * this.field5455) / (float) this.field5373;
        float var5 = (float) ((-this.field5469 + this.field5227) * this.field5455) / (float) this.field5373;
        float var6 = (float) (this.field5456 * this.field5455) / (float) this.field5478;
        float var7 = (float) ((this.field5456 - this.field5219) * this.field5455) / (float) this.field5478;
        if (var4 != var5 && var6 != var7) {
            float var8 = (float) this.field5455 * 2.0F;
            var2[15] = 0.0F;
            var2[0] = var8 / (-var4 + var5);
            var2[10] = this.field5428 = (float) (-(this.field5455 + this.field5377)) / (float) (-this.field5455 + this.field5377);
            var2[7] = 0.0F;
            var2[9] = (var6 + var7) / (var6 - var7);
            var2[12] = 0.0F;
            var2[1] = 0.0F;
            var2[3] = 0.0F;
            var2[5] = var8 / (var6 - var7);
            var2[6] = 0.0F;
            var2[2] = 0.0F;
            var2[4] = 0.0F;
            var2[11] = -1.0F;
            var2[14] = this.field5437 = -((float) this.field5377 * var8) / (float) (-this.field5455 + this.field5377);
            var2[8] = (var4 + var5) / (var5 - var4);
            var2[13] = 0.0F;
        } else {
            var2[2] = 0.0F;
            var2[9] = 0.0F;
            var2[10] = 1.0F;
            var2[8] = 0.0F;
            var2[3] = 0.0F;
            var2[4] = 0.0F;
            var2[5] = 1.0F;
            var2[13] = 0.0F;
            var2[15] = 1.0F;
            var2[1] = 0.0F;
            var2[11] = 0.0F;
            var2[0] = 1.0F;
            var2[6] = 0.0F;
            var2[12] = 0.0F;
            var2[7] = 0.0F;
            var2[14] = 0.0F;
        }
        this.method2297((byte) 123);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIB)V", line = 3128)
    public final synchronized void method2314(int arg0, int arg1, byte arg2) {
        ++field5277;
        class388 var4 = new class388(arg0);
        var4.field4676 = (long) arg1;
        int var5 = -52 % ((arg2 - -69) / 40);
        this.field5367.method706(var4, true);
    }

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "()Z", line = 3142)
    public final boolean method322() {
        ++field5197;
        return this.field5328.method1888(3, 101);
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 3150)
    public final void method298(Canvas arg0) {
        ++field5264;
        if (this.field5183 == arg0) {
            throw new RuntimeException();
        } else if (!this.field5247.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field5203.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field5247.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(IIIII)V", line = 3190)
    public static final void method2315(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class468.field6960.field2610 = 0;
        ++field5309;
        if (arg4 > 50) {
            class468.field6960.method1205((byte) -69, class129.field1608.field9114);
            class468.field6960.method1205((byte) -69, arg0);
            class468.field6960.method1205((byte) -69, arg3);
            class468.field6960.method1229(arg2, 30364);
            class468.field6960.method1229(arg1, 30364);
            class572.field8266 = 0;
            class360.field5099 = 1;
            class489.field7134 = 0;
            class523.field7601 = -3;
        }
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V", line = 3213)
    public final void method296(int arg0) {
        ++field5234;
        this.method2294(false);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)I", line = 3229)
    public final int method300(int arg0, int arg1) {
        ++field5297;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(BI)I", line = 3237)
    public final int method2316(byte arg0, int arg1) {
        if (arg0 != -56) {
            this.field5446 = null;
        }
        ++field5201;
        if (arg1 != 1) {
            if (arg1 == 0) {
                return 8448;
            } else if (arg1 != 2) {
                if (~arg1 == -4) {
                    return 260;
                } else if (~arg1 == -5) {
                    return 34023;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                return 34165;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZZI[B)Lbo;", line = 3268)
    public final class632 method2317(int arg0, boolean arg1, boolean arg2, int arg3, byte[] arg4) {
        if (!arg1) {
            this.field5466 = 30;
        }
        ++field5265;
        return (class632) (!this.field5397 || arg2 && !this.field5382 ? new class380(this, arg0, arg4, arg3) : new class65(this, arg0, arg4, arg3, arg2));
    }

    @OriginalMember(owner = "client!ad", name = "ha", descriptor = "(F)V", line = 3284)
    public final void method315(float arg0) {
        if (this.field5386 != arg0) {
            this.field5386 = arg0;
            this.method2306(123);
        }
        ++field5274;
    }

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "(I)V", line = 3306)
    public final void method348(int arg0) {
        ++field5273;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(Z)V", line = 3318)
    private final void method2318(boolean arg0) {
        if (!arg0) {
            this.method2332((class497) null, (byte) -108);
        }
        if (this.field5479) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field5479 = false;
        }
        ++field5263;
    }

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "()Z", line = 3339)
    public final boolean method395() {
        ++field5289;
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "ka", descriptor = "(FF)V", line = 3347)
    public final void method302(float arg0, float arg1) {
        ++field5150;
        if (this.field5447 != arg0 || this.field5404 != arg1) {
            this.field5447 = arg0;
            this.field5404 = arg1;
            this.method2297((byte) 81);
            if (this.field5488 != 3) {
                if (this.field5488 == 2) {
                    this.method2302((byte) -114);
                    return;
                }
            } else {
                this.method2276(5888);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "()I", line = 3375)
    public final int method381() {
        ++field5299;
        return this.field5363 - -this.field5365 + this.field5366;
    }

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "()Z", line = 3384)
    public final boolean method359() {
        ++field5340;
        return this.field5316 != null && this.field5316.method850(0);
    }

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "(I)V", line = 3392)
    private final void method2319(int arg0) {
        if (arg0 < 43) {
            this.method2261(false, (class497) null);
        }
        if (~this.field5488 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field5227 > 0 && this.field5219 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field5227, (double) this.field5219, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field5429 &= -25;
            this.field5488 = 1;
        }
        ++field5244;
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "()V", line = 3418)
    public final void method317() {
        ++field5282;
        if (this.field5409 && this.field5227 > 0 && this.field5219 > 0) {
            int var1 = this.field5399;
            int var2 = this.field5474;
            int var3 = this.field5472;
            int var4 = this.field5458;
            this.method404();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2284((byte) 85);
            this.method2278(false, -32);
            this.method2326(-1254361672, false);
            this.method2260(2144, false);
            this.method2285(-32, false);
            this.method2295(-67, (class507) null);
            this.method2286(-2, (byte) -24);
            this.method2288(1, 7681);
            this.method2327(0, (byte) 62);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field5227, this.field5219, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method368(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V", line = 3462)
    public final void method2320(int arg0, int arg1, int arg2) {
        ++field5221;
        if (this.field5384 == arg2) {
            boolean var4 = false;
            if (this.field5427 != arg1) {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                this.field5427 = arg1;
                var4 = true;
            }
            if (this.field5438 != arg0) {
                OpenGL.glTexEnvi(8960, 34162, arg0);
                this.field5438 = arg0;
                var4 = true;
            }
            if (var4) {
                this.field5429 &= -30;
                return;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg1);
            OpenGL.glTexEnvi(8960, 34162, arg0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Li;)V", line = 3501)
    public final void method314(class35 arg0) {
        ++field5156;
        this.field5353 = ((class523) arg0).field7600;
        if (this.field5461 == null) {
            class257 var2 = new class257(80);
            if (this.field5468) {
                var2.method1716(-1.0F, -116);
                var2.method1716(-1.0F, -98);
                var2.method1716(0.0F, -93);
                var2.method1716(0.0F, -74);
                var2.method1716(1.0F, -113);
                var2.method1716(1.0F, -78);
                var2.method1716(-1.0F, -119);
                var2.method1716(0.0F, -76);
                var2.method1716(1.0F, -84);
                var2.method1716(1.0F, -93);
                var2.method1716(1.0F, -101);
                var2.method1716(1.0F, -88);
                var2.method1716(0.0F, -101);
                var2.method1716(1.0F, -80);
                var2.method1716(0.0F, -83);
                var2.method1716(-1.0F, -81);
                var2.method1716(1.0F, -115);
                var2.method1716(0.0F, -92);
                var2.method1716(0.0F, -121);
                var2.method1716(0.0F, -118);
            } else {
                var2.method1715(-1.0F, (byte) -6);
                var2.method1715(-1.0F, (byte) -6);
                var2.method1715(0.0F, (byte) -6);
                var2.method1715(0.0F, (byte) -6);
                var2.method1715(1.0F, (byte) -6);
                var2.method1715(1.0F, (byte) -6);
                var2.method1715(-1.0F, (byte) -6);
                var2.method1715(0.0F, (byte) -6);
                var2.method1715(1.0F, (byte) -6);
                var2.method1715(1.0F, (byte) -6);
                var2.method1715(1.0F, (byte) -6);
                var2.method1715(1.0F, (byte) -6);
                var2.method1715(0.0F, (byte) -6);
                var2.method1715(1.0F, (byte) -6);
                var2.method1715(0.0F, (byte) -6);
                var2.method1715(-1.0F, (byte) -6);
                var2.method1715(1.0F, (byte) -6);
                var2.method1715(0.0F, (byte) -6);
                var2.method1715(0.0F, (byte) -6);
                var2.method1715(0.0F, (byte) -6);
            }
            this.field5461 = this.method2317(20, true, false, var2.field2610, var2.field2622);
            this.field5378 = new class371(this.field5461, 5126, 3, 0);
            this.field5448 = new class371(this.field5461, 5126, 2, 12);
            this.field5321.method703((byte) 105, this);
        }
    }

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "(B)V", line = 3566)
    public final void method2321(byte arg0) {
        OpenGL.glLightfv(16384, 4611, this.field5387, 0);
        if (arg0 > 88) {
            ++field5181;
            OpenGL.glLightfv(16385, 4611, this.field5414, 0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BFFFF)V", line = 3593)
    public final void method2322(byte arg0, float arg1, float arg2, float arg3, float arg4) {
        class599.field8752[0] = arg1;
        ++field5250;
        class599.field8752[1] = arg4;
        if (arg0 > -34) {
            this.field5393 = null;
        }
        class599.field8752[3] = arg3;
        class599.field8752[2] = arg2;
        OpenGL.glTexEnvfv(8960, 8705, class599.field8752, 0);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIF)Loj;", line = 3609)
    public final class321 method346(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field5329;
        return new class533(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)Li;", line = 3618)
    public final class35 method355(int arg0) {
        ++field5178;
        class523 var2 = new class523(arg0);
        this.field5350.method706(var2, true);
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "(Z)V", line = 3631)
    public final void method2323(boolean arg0) {
        ++field5162;
        if (this.field5429 != 2) {
            this.method2319(60);
            this.method2278(false, -32);
            this.method2326(-1254361672, false);
            this.method2260(2144, false);
            this.method2285(-32, false);
            this.method2286(-2, (byte) -46);
            this.field5429 = 2;
        }
        if (!arg0) {
            this.field5382 = true;
        }
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(II)V", line = 3653)
    public final synchronized void method2324(int arg0, int arg1) {
        ++field5223;
        if (arg0 != 2) {
            this.field5360 = null;
        }
        class324 var3 = new class324();
        var3.field4676 = (long) arg1;
        this.field5371.method706(var3, true);
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "()Z", line = 3668)
    public final boolean method341() {
        ++field5231;
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(Z)V", line = 3676)
    public final void method402(boolean arg0) {
        ++field5172;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(III)V", line = 3685)
    public final synchronized void method2325(int arg0, int arg1, int arg2) {
        if (arg0 == 32) {
            ++field5314;
            class388 var4 = new class388(arg1);
            var4.field4676 = (long) arg2;
            this.field5370.method706(var4, true);
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(IZ)V", line = 3705)
    public final void method2326(int arg0, boolean arg1) {
        if (arg0 != -1254361672) {
            this.field5349 = -50;
        }
        ++field5218;
        if (!arg1 != !this.field5402) {
            this.field5402 = arg1;
            this.method2299(3843);
            this.field5429 &= -8;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;I)V", line = 3933)
    public class362(Canvas arg0, class462 arg1, int arg2) {
        super(arg1);
        new class248();
        new class80(16);
        this.field5364 = new class114();
        this.field5367 = new class114();
        this.field5368 = new class114();
        this.field5369 = new class114();
        this.field5370 = new class114();
        this.field5371 = new class114();
        this.field5372 = new class114();
        this.field5377 = 3584;
        this.field5390 = 0.0F;
        this.field5373 = 512;
        this.field5395 = 0;
        this.field5414 = new float[4];
        this.field5422 = new float[4];
        this.field5412 = -1.0F;
        this.field5427 = 8448;
        this.field5389 = new float[4];
        this.field5410 = 1.0F;
        this.field5408 = -1;
        this.field5379 = 0;
        this.field5451 = -1;
        this.field5447 = 3000.0F;
        this.field5455 = 50;
        this.field5456 = 0;
        this.field5426 = new float[16];
        this.field5436 = true;
        this.field5466 = -1;
        this.field5399 = 0;
        this.field5438 = 8448;
        this.field5420 = 1.0F;
        this.field5472 = 0;
        this.field5470 = -1;
        this.field5439 = 0;
        this.field5442 = -1.0F;
        this.field5424 = -1;
        this.field5380 = 1.0F;
        this.field5478 = 512;
        this.field5474 = 0;
        this.field5480 = 1.0F;
        this.field5457 = new class321[class198.field2678];
        this.field5444 = 1.0F;
        this.field5475 = 3584.0F;
        this.field5465 = -1.0F;
        this.field5487 = -1.0F;
        this.field5458 = 0;
        this.field5460 = 3584.0F;
        this.field5469 = 0;
        this.field5387 = new float[4];
        this.field5484 = 0;
        this.field5392 = new class257(8192);
        this.field5493 = new int[1];
        this.field5494 = new int[1];
        this.field5495 = new byte[16384];
        this.field5496 = new int[1];
        this.field5159 = this.field5183 = arg0;
        this.field5331 = arg2;
        if (!class636.method3630(92, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class636.method3630(114, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field5203 = new OpenGL();
                this.field5185 = this.field5216 = this.field5203.init(arg0, 8, 8, 8, 24, 0, this.field5331);
                if (this.field5216 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method2257((byte) -87);
                    int var4 = this.method2312(0);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field5483 = !this.field5468 ? 5121 : 33639;
                        if (this.field5446.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class293.method1890(' ', (byte) -1, this.field5446.replace('/', ' '));
                            for (int var9 = 0; var8.length > var9; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (var10.charAt(0) == 'x' && ~var10.length() <= -4 && class162.method942(23050, var10.substring(1, 3))) {
                                            var10 = var10.substring(1);
                                            var7 = true;
                                        }
                                        if (var10.equals("hd")) {
                                            var6 = true;
                                        } else {
                                            if (var10.startsWith("hd")) {
                                                var6 = true;
                                                var10 = var10.substring(2);
                                            }
                                            if (~var10.length() <= -5 && class162.method942(23050, var10.substring(0, 4))) {
                                                var5 = class575.method3340((byte) 78, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var16) {
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field5452 = false;
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && ~var5 >= -9251) {
                                    this.field5441 = false;
                                }
                                if (~var5 <= -7001 && var5 <= 7999) {
                                    this.field5397 = false;
                                }
                            }
                            this.field5473 &= this.field5203.method3149("GL_ARB_half_float_pixel");
                            this.field5382 = this.field5397;
                            this.field5421 = true;
                        }
                        if (~this.field5486.indexOf("intel") != 0) {
                            this.field5481 = false;
                        }
                        this.field5409 = !this.field5486.equals("s3 graphics");
                        if (this.field5397) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var14) {
                                throw new RuntimeException("");
                            }
                        }
                        class27.method157(true, false, (byte) 2);
                        this.field5354 = true;
                        this.field5336 = new class471(this, super.field8852);
                        this.method2311(-3506);
                        this.field5352 = new class489(this);
                        this.field5339 = new class625(this);
                        if (this.field5339.method3589(19532)) {
                            this.field5316 = new class455(this);
                            if (!this.field5316.method2812((byte) -62)) {
                                this.field5316.method845((byte) -85);
                                this.field5316 = null;
                            }
                        }
                        this.field5328 = new class292(this);
                        this.method2250(1028);
                        this.method2268((byte) 127);
                        OpenGL.glClear(16640);
                        int var12 = 0;
                        while (true) {
                            try {
                                this.field5203.swapBuffers();
                                break;
                            } catch (Exception var15) {
                                if (var12++ > 5) {
                                    throw new RuntimeException("");
                                }
                                class646.method3696(1, 100L);
                            }
                        }
                        OpenGL.glClear(16384);
                    }
                }
            } catch (Throwable var17) {
                var17.printStackTrace();
                this.method367();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "()Z", line = 3729)
    public final boolean method398() {
        ++field5266;
        return this.field5443 && (!this.method359() || this.field5463);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IB)V", line = 3739)
    public final void method2327(int arg0, byte arg1) {
        if (~this.field5445 != ~arg0) {
            boolean var3;
            byte var4;
            boolean var5;
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 == -129) {
                        var3 = true;
                        var4 = 3;
                        var5 = true;
                    } else {
                        var5 = false;
                        var3 = true;
                        var4 = 0;
                    }
                } else {
                    var5 = false;
                    var4 = 2;
                    var3 = true;
                }
            } else {
                var3 = true;
                var5 = true;
                var4 = 1;
            }
            if (!this.field5403 == var3) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field5403 = var3;
            }
            if (!var5 == this.field5400) {
                if (!var5) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field5400 = var5;
            }
            if (~this.field5462 != ~var4) {
                if (var4 == 1) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (~var4 != -3) {
                    if (~var4 == -4) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    } else {
                        OpenGL.glDisable(3042);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                }
                this.field5462 = var4;
            }
            this.field5445 = arg0;
            this.field5429 &= -29;
        }
        ++field5202;
        int var6 = 54 % ((arg1 - -75) / 45);
    }

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "([I)V", line = 3831)
    public final void method403(int[] arg0) {
        ++field5279;
        arg0[1] = this.field5472;
        arg0[2] = this.field5474;
        arg0[0] = this.field5399;
        arg0[3] = this.field5458;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "()V", line = 3843)
    public final void method379() {
        if (this.field5316 != null && this.field5316.method850(0)) {
            this.field5339.method3580(this.field5316, (byte) -99);
            this.field5336.method2884(91);
        }
        ++field5220;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILws;)V", line = 3861)
    public final void method2328(int arg0, class302 arg1) {
        OpenGL.glPushMatrix();
        ++field5180;
        OpenGL.glMultMatrixf(arg1.method2013(32), 0);
        int var3 = -21 / ((-16 - arg0) / 58);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lws;I)V", line = 3873)
    public final void method2329(class302 arg0, int arg1) {
        ++field5154;
        OpenGL.glLoadMatrixf(arg0.method2013(117), 0);
        if (arg1 <= 2) {
            this.method301(-125, 2, (int[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!ad", name = "FA", descriptor = "(IIIIII)Z", line = 3889)
    public final boolean method295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5288;
        float var7 = (float) arg2 * this.field5453.field4449 + (float) arg0 * this.field5453.field4451 + (float) arg1 * this.field5453.field4448 + this.field5453.field4440;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field5453.field4449 + (float) arg3 * this.field5453.field4451 + (float) arg4 * this.field5453.field4448 + this.field5453.field4440;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field5455 > var7) || !((float) this.field5455 > var8)) && (!((float) this.field5377 < var7) || !((float) this.field5377 < var8))) {
            int var9 = (int) (((float) arg2 * this.field5453.field4462 + (float) arg0 * this.field5453.field4441 + (float) arg1 * this.field5453.field4444 + this.field5453.field4452) * (float) this.field5373 / var7);
            int var10 = (int) (((float) arg5 * this.field5453.field4462 + (float) arg3 * this.field5453.field4441 + (float) arg4 * this.field5453.field4444 + this.field5453.field4452) * (float) this.field5373 / var8);
            if (this.field5419 > (float) var9 && this.field5419 > (float) var10 || this.field5396 < (float) var9 && (float) var10 > this.field5396) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field5453.field4450 + (float) arg0 * this.field5453.field4434 + (float) arg1 * this.field5453.field4458 + this.field5453.field4439) * (float) this.field5478 / var7);
                int var12 = (int) (((float) arg5 * this.field5453.field4450 + (float) arg3 * this.field5453.field4434 + (float) arg4 * this.field5453.field4458 + this.field5453.field4439) * (float) this.field5478 / var8);
                return (!((float) var11 < this.field5492) || !(this.field5492 > (float) var12)) && (!((float) var11 > this.field5454) || !(this.field5454 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILim;)V", line = 4100)
    public final void method2330(int arg0, class497 arg1) {
        ++field5342;
        if (~this.field5361 <= -1 && this.field5357[this.field5361] == arg1) {
            this.field5357[this.field5361--] = null;
            if (arg0 != 8705) {
                this.method345(-111);
            }
            arg1.method2979(-10361);
            if (this.field5361 < 0) {
                this.field5358 = null;
            } else {
                this.field5358 = this.field5357[this.field5361];
                this.field5358.method2980(-5879);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lim;I)V", line = 4124)
    public final void method2331(class497 arg0, int arg1) {
        ++field5290;
        if (~this.field5361 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field5361 <= -1) {
                this.field5357[this.field5361].method2979(arg1 ^ -4251);
            }
            this.field5358 = this.field5357[++this.field5361] = arg0;
            this.field5358.method2980(-5879);
            if (arg1 != 14562) {
                this.field5159 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 4144)
    public final void method383(Rectangle[] arg0, int arg1) throws class27 {
        ++field5271;
        this.method338();
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lim;B)V", line = 4156)
    public final void method2332(class497 arg0, byte arg1) {
        ++field5259;
        if (arg1 == -63) {
            if (this.field5355 >= 0 && this.field5360[this.field5355] == arg0) {
                this.field5360[this.field5355--] = null;
                arg0.method2983(-128);
                if (~this.field5355 <= -1) {
                    this.field5362 = this.field5360[this.field5355];
                    this.field5362.method2984(arg1 ^ -117);
                } else {
                    this.field5362 = null;
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IIIB)V", line = 4179)
    public final void method2333(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 48) {
            this.field5385 = false;
        }
        OpenGL.glTexEnvi(8960, arg2 + 34184, arg1);
        ++field5176;
        OpenGL.glTexEnvi(8960, arg2 + 34200, arg0);
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(III)V", line = 4192)
    public final synchronized void method2334(int arg0, int arg1, int arg2) {
        ++field5161;
        class388 var4 = new class388(arg2);
        int var5 = 102 % ((67 - arg0) / 43);
        var4.field4676 = (long) arg1;
        this.field5368.method706(var4, true);
    }

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "(I)V", line = 4214)
    private final void method2335(int arg0) {
        ++field5304;
        if (~this.field5488 != arg0) {
            this.field5488 = 3;
            this.method2276(5888);
            this.method2305((byte) -29);
            this.field5429 &= -8;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lor;IIII)Lba;", line = 4229)
    public final class327 method326(class557 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5229;
        return new class212(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "(I)Lvda;", line = 4238)
    public final class158 method2336(int arg0) {
        ++field5194;
        if (arg0 != 11011) {
            this.method2272(true);
        }
        return this.field5490 != null ? this.field5490.method1269(false) : null;
    }
}
