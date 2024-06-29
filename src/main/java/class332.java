import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public abstract class class332 extends class167 {

    @OriginalMember(owner = "client!rr", name = "ec", descriptor = "Lor;")
    private class594 field5225 = new class594();

    @OriginalMember(owner = "client!rr", name = "Sd", descriptor = "Z")
    public boolean field5317 = true;

    @OriginalMember(owner = "client!rr", name = "Rd", descriptor = "Lur;")
    public class498 field5316 = new class498();

    @OriginalMember(owner = "client!rr", name = "Vd", descriptor = "Lur;")
    public class498 field5320 = new class498();

    @OriginalMember(owner = "client!rr", name = "Wd", descriptor = "Lur;")
    public class498 field5321 = new class498();

    @OriginalMember(owner = "client!rr", name = "Xd", descriptor = "Lur;")
    public class498 field5322 = new class498();

    @OriginalMember(owner = "client!rr", name = "Yd", descriptor = "Lur;")
    private class498 field5323 = new class498();

    @OriginalMember(owner = "client!rr", name = "Zd", descriptor = "Lur;")
    private class498 field5324 = new class498();

    @OriginalMember(owner = "client!rr", name = "be", descriptor = "F")
    public float field5326 = 1.0F;

    @OriginalMember(owner = "client!rr", name = "ge", descriptor = "Z")
    public boolean field5331 = false;

    @OriginalMember(owner = "client!rr", name = "qe", descriptor = "I")
    public int field5341 = 0;

    @OriginalMember(owner = "client!rr", name = "ke", descriptor = "[F")
    private float[] field5335 = new float[16];

    @OriginalMember(owner = "client!rr", name = "Je", descriptor = "F")
    public float field5360 = 3584.0F;

    @OriginalMember(owner = "client!rr", name = "Qe", descriptor = "I")
    public int field5367 = 512;

    @OriginalMember(owner = "client!rr", name = "te", descriptor = "F")
    public float field5344 = 1.0F;

    @OriginalMember(owner = "client!rr", name = "Re", descriptor = "[Lia;")
    private class546[] field5368 = new class546[10];

    @OriginalMember(owner = "client!rr", name = "le", descriptor = "I")
    private int field5336 = 16777215;

    @OriginalMember(owner = "client!rr", name = "ee", descriptor = "I")
    public int field5329 = 0;

    @OriginalMember(owner = "client!rr", name = "he", descriptor = "F")
    public float field5332 = 3584.0F;

    @OriginalMember(owner = "client!rr", name = "Ee", descriptor = "[F")
    private float[] field5355 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!rr", name = "ue", descriptor = "I")
    public int field5345 = 0;

    @OriginalMember(owner = "client!rr", name = "pe", descriptor = "I")
    public int field5340 = -1;

    @OriginalMember(owner = "client!rr", name = "ne", descriptor = "Z")
    private boolean field5338 = false;

    @OriginalMember(owner = "client!rr", name = "fe", descriptor = "I")
    public int field5330 = 0;

    @OriginalMember(owner = "client!rr", name = "hf", descriptor = "[F")
    private float[] field5384 = new float[16];

    @OriginalMember(owner = "client!rr", name = "Ne", descriptor = "Lwr;")
    public class423 field5364 = class494.field7216;

    @OriginalMember(owner = "client!rr", name = "Me", descriptor = "[F")
    private float[] field5363 = new float[16];

    @OriginalMember(owner = "client!rr", name = "rf", descriptor = "I")
    public int field5393 = 50;

    @OriginalMember(owner = "client!rr", name = "bf", descriptor = "I")
    public int field5378 = 512;

    @OriginalMember(owner = "client!rr", name = "se", descriptor = "I")
    public int field5343 = 0;

    @OriginalMember(owner = "client!rr", name = "cf", descriptor = "Lnaa;")
    public class64 field5379 = class102.field1688;

    @OriginalMember(owner = "client!rr", name = "Ue", descriptor = "[F")
    private float[] field5371 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!rr", name = "ye", descriptor = "I")
    public int field5349 = 0;

    @OriginalMember(owner = "client!rr", name = "uf", descriptor = "I")
    private int field5396 = 0;

    @OriginalMember(owner = "client!rr", name = "Gf", descriptor = "F")
    public float field5408 = -1.0F;

    @OriginalMember(owner = "client!rr", name = "De", descriptor = "I")
    public int field5354 = 128;

    @OriginalMember(owner = "client!rr", name = "Se", descriptor = "F")
    public float field5369 = -1.0F;

    @OriginalMember(owner = "client!rr", name = "gf", descriptor = "F")
    public float field5383 = 1.0F;

    @OriginalMember(owner = "client!rr", name = "vf", descriptor = "I")
    public int field5397 = 3584;

    @OriginalMember(owner = "client!rr", name = "nf", descriptor = "[F")
    private float[] field5389 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!rr", name = "Af", descriptor = "Z")
    public boolean field5402 = false;

    @OriginalMember(owner = "client!rr", name = "Ye", descriptor = "Z")
    private boolean field5375 = false;

    @OriginalMember(owner = "client!rr", name = "Pe", descriptor = "[F")
    public float[] field5366 = this.field5355;

    @OriginalMember(owner = "client!rr", name = "kf", descriptor = "Z")
    public boolean field5386 = true;

    @OriginalMember(owner = "client!rr", name = "Kf", descriptor = "I")
    public int field5412 = 0;

    @OriginalMember(owner = "client!rr", name = "Oe", descriptor = "Z")
    private boolean field5365 = false;

    @OriginalMember(owner = "client!rr", name = "we", descriptor = "I")
    private int field5347 = 0;

    @OriginalMember(owner = "client!rr", name = "qf", descriptor = "Z")
    public boolean field5392 = true;

    @OriginalMember(owner = "client!rr", name = "Ce", descriptor = "I")
    public int field5353 = 0;

    @OriginalMember(owner = "client!rr", name = "Nf", descriptor = "I")
    public int field5415 = 0;

    @OriginalMember(owner = "client!rr", name = "zf", descriptor = "Z")
    public boolean field5401 = true;

    @OriginalMember(owner = "client!rr", name = "re", descriptor = "I")
    private int field5342 = 0;

    @OriginalMember(owner = "client!rr", name = "Rf", descriptor = "I")
    private int field5419 = -1;

    @OriginalMember(owner = "client!rr", name = "jf", descriptor = "Z")
    private boolean field5385 = false;

    @OriginalMember(owner = "client!rr", name = "Mf", descriptor = "I")
    public int field5414 = 8;

    @OriginalMember(owner = "client!rr", name = "yf", descriptor = "I")
    public int field5400 = 3;

    @OriginalMember(owner = "client!rr", name = "je", descriptor = "Z")
    public boolean field5334 = false;

    @OriginalMember(owner = "client!rr", name = "Ff", descriptor = "I")
    private int field5407 = -1;

    @OriginalMember(owner = "client!rr", name = "Ae", descriptor = "F")
    public float field5351 = 1.0F;

    @OriginalMember(owner = "client!rr", name = "sf", descriptor = "Z")
    public boolean field5394 = true;

    @OriginalMember(owner = "client!rr", name = "de", descriptor = "Z")
    public boolean field5328 = true;

    @OriginalMember(owner = "client!rr", name = "mf", descriptor = "F")
    private float field5388 = 1.0F;

    @OriginalMember(owner = "client!rr", name = "Pf", descriptor = "I")
    private int field5417 = 0;

    @OriginalMember(owner = "client!rr", name = "Sf", descriptor = "I")
    private int field5420 = 1;

    @OriginalMember(owner = "client!rr", name = "Uf", descriptor = "I")
    public int field5422 = 0;

    @OriginalMember(owner = "client!rr", name = "Jf", descriptor = "I")
    public int field5411 = -1;

    @OriginalMember(owner = "client!rr", name = "Le", descriptor = "Z")
    private boolean field5362 = false;

    @OriginalMember(owner = "client!rr", name = "Ve", descriptor = "I")
    private int field5372 = -1;

    @OriginalMember(owner = "client!rr", name = "Vf", descriptor = "[F")
    public float[] field5423 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!rr", name = "wf", descriptor = "Z")
    public boolean field5398 = false;

    @OriginalMember(owner = "client!rr", name = "xf", descriptor = "[F")
    public float[] field5399 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!rr", name = "Xf", descriptor = "Z")
    private boolean field5425 = false;

    @OriginalMember(owner = "client!rr", name = "of", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5390 = new Stream();

    @OriginalMember(owner = "client!rr", name = "Yf", descriptor = "Lur;")
    private class498 field5426 = new class498();

    @OriginalMember(owner = "client!rr", name = "ve", descriptor = "I")
    public int field5346;

    @OriginalMember(owner = "client!rr", name = "dc", descriptor = "Ljava/lang/Object;")
    public Object field5224;

    @OriginalMember(owner = "client!rr", name = "ed", descriptor = "Ljava/lang/Object;")
    private Object field5277;

    @OriginalMember(owner = "client!rr", name = "Nc", descriptor = "Ljava/awt/Canvas;")
    public Canvas field5260;

    @OriginalMember(owner = "client!rr", name = "Pc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5262;

    @OriginalMember(owner = "client!rr", name = "kb", descriptor = "Lri;")
    public class97 field5179;

    @OriginalMember(owner = "client!rr", name = "P", descriptor = "I")
    private int field5158;

    @OriginalMember(owner = "client!rr", name = "Gd", descriptor = "I")
    public int field5305;

    @OriginalMember(owner = "client!rr", name = "He", descriptor = "I")
    public int field5358;

    @OriginalMember(owner = "client!rr", name = "oc", descriptor = "I")
    private int field5235;

    @OriginalMember(owner = "client!rr", name = "Ab", descriptor = "I")
    public int field5195;

    @OriginalMember(owner = "client!rr", name = "Pb", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field5210;

    @OriginalMember(owner = "client!rr", name = "Ze", descriptor = "Lhr;")
    private class486 field5376;

    @OriginalMember(owner = "client!rr", name = "xe", descriptor = "F")
    public float field5348;

    @OriginalMember(owner = "client!rr", name = "We", descriptor = "F")
    public float field5373;

    @OriginalMember(owner = "client!rr", name = "Xe", descriptor = "F")
    private float field5374;

    @OriginalMember(owner = "client!rr", name = "df", descriptor = "F")
    public float field5380;

    @OriginalMember(owner = "client!rr", name = "ef", descriptor = "F")
    public float field5381;

    @OriginalMember(owner = "client!rr", name = "ff", descriptor = "F")
    public float field5382;

    @OriginalMember(owner = "client!rr", name = "pf", descriptor = "F")
    public float field5391;

    @OriginalMember(owner = "client!rr", name = "Bf", descriptor = "F")
    private float field5403;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!rr", name = "A", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!rr", name = "C", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!rr", name = "D", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!rr", name = "E", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!rr", name = "F", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!rr", name = "G", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!rr", name = "H", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!rr", name = "I", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!rr", name = "J", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!rr", name = "K", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!rr", name = "L", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!rr", name = "M", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!rr", name = "N", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!rr", name = "O", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!rr", name = "Q", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!rr", name = "R", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!rr", name = "S", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!rr", name = "T", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!rr", name = "U", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!rr", name = "V", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!rr", name = "W", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!rr", name = "X", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!rr", name = "Y", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!rr", name = "Z", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!rr", name = "ab", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!rr", name = "bb", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!rr", name = "cb", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!rr", name = "db", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!rr", name = "eb", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!rr", name = "fb", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!rr", name = "gb", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!rr", name = "hb", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!rr", name = "ib", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!rr", name = "jb", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!rr", name = "lb", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!rr", name = "mb", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!rr", name = "nb", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!rr", name = "ob", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!rr", name = "pb", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!rr", name = "qb", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!rr", name = "rb", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!rr", name = "sb", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!rr", name = "tb", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!rr", name = "ub", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!rr", name = "vb", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!rr", name = "wb", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!rr", name = "xb", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!rr", name = "yb", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!rr", name = "zb", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!rr", name = "Bb", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!rr", name = "Cb", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!rr", name = "Db", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!rr", name = "Eb", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!rr", name = "Fb", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!rr", name = "Gb", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!rr", name = "Hb", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!rr", name = "Jb", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!rr", name = "Kb", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!rr", name = "Lb", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!rr", name = "Nb", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!rr", name = "Ob", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!rr", name = "Qb", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!rr", name = "Rb", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!rr", name = "Sb", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!rr", name = "Tb", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!rr", name = "Ub", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!rr", name = "Vb", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!rr", name = "Wb", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!rr", name = "Xb", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!rr", name = "Yb", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!rr", name = "Zb", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!rr", name = "ac", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!rr", name = "bc", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!rr", name = "cc", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!rr", name = "fc", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!rr", name = "gc", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!rr", name = "hc", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!rr", name = "ic", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!rr", name = "jc", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!rr", name = "kc", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!rr", name = "lc", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!rr", name = "mc", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!rr", name = "nc", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!rr", name = "pc", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!rr", name = "qc", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!rr", name = "rc", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!rr", name = "sc", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!rr", name = "tc", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!rr", name = "uc", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!rr", name = "vc", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!rr", name = "wc", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!rr", name = "xc", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!rr", name = "yc", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!rr", name = "zc", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!rr", name = "Ac", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!rr", name = "Bc", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!rr", name = "Cc", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!rr", name = "Dc", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!rr", name = "Ec", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!rr", name = "Fc", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!rr", name = "Gc", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!rr", name = "Hc", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!rr", name = "Ic", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!rr", name = "Jc", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!rr", name = "Kc", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!rr", name = "Lc", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!rr", name = "Mc", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!rr", name = "Oc", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!rr", name = "Qc", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!rr", name = "Rc", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!rr", name = "Sc", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!rr", name = "Tc", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!rr", name = "Uc", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!rr", name = "Vc", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!rr", name = "Wc", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!rr", name = "Xc", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!rr", name = "Yc", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!rr", name = "Zc", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!rr", name = "ad", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!rr", name = "bd", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!rr", name = "cd", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!rr", name = "dd", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!rr", name = "fd", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!rr", name = "gd", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!rr", name = "id", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!rr", name = "jd", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!rr", name = "kd", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!rr", name = "ld", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!rr", name = "md", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!rr", name = "nd", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!rr", name = "od", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!rr", name = "pd", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!rr", name = "qd", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!rr", name = "rd", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!rr", name = "sd", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!rr", name = "td", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!rr", name = "ud", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!rr", name = "vd", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!rr", name = "wd", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!rr", name = "xd", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!rr", name = "yd", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!rr", name = "zd", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!rr", name = "Ad", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!rr", name = "Bd", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!rr", name = "Cd", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!rr", name = "Ed", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!rr", name = "Fd", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!rr", name = "Hd", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!rr", name = "Id", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!rr", name = "Jd", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!rr", name = "Kd", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!rr", name = "Ld", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!rr", name = "Md", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!rr", name = "Nd", descriptor = "I")
    public int field5312;

    @OriginalMember(owner = "client!rr", name = "Od", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!rr", name = "Pd", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!rr", name = "Qd", descriptor = "I")
    public int field5315;

    @OriginalMember(owner = "client!rr", name = "Td", descriptor = "I")
    public int field5318;

    @OriginalMember(owner = "client!rr", name = "Ud", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!rr", name = "ce", descriptor = "I")
    public int field5327;

    @OriginalMember(owner = "client!rr", name = "me", descriptor = "I")
    public int field5337;

    @OriginalMember(owner = "client!rr", name = "Be", descriptor = "I")
    public int field5352;

    @OriginalMember(owner = "client!rr", name = "Fe", descriptor = "I")
    public int field5356;

    @OriginalMember(owner = "client!rr", name = "Ie", descriptor = "I")
    public int field5359;

    @OriginalMember(owner = "client!rr", name = "lf", descriptor = "I")
    public int field5387;

    @OriginalMember(owner = "client!rr", name = "Cf", descriptor = "I")
    private int field5404;

    @OriginalMember(owner = "client!rr", name = "Lf", descriptor = "I")
    public int field5413;

    @OriginalMember(owner = "client!rr", name = "Tf", descriptor = "I")
    private int field5421;

    @OriginalMember(owner = "client!rr", name = "Wf", descriptor = "I")
    public int field5424;

    @OriginalMember(owner = "client!rr", name = "sg", descriptor = "I")
    private int field5446;

    @OriginalMember(owner = "client!rr", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!rr", name = "Qf", descriptor = "Lwq;")
    public class152 field5418;

    @OriginalMember(owner = "client!rr", name = "cg", descriptor = "Lcfa;")
    public class153 field5430;

    @OriginalMember(owner = "client!rr", name = "dg", descriptor = "Lcfa;")
    public class153 field5431;

    @OriginalMember(owner = "client!rr", name = "fg", descriptor = "Lcfa;")
    public class153 field5433;

    @OriginalMember(owner = "client!rr", name = "gg", descriptor = "Lcfa;")
    public class153 field5434;

    @OriginalMember(owner = "client!rr", name = "hg", descriptor = "Lcfa;")
    public class153 field5435;

    @OriginalMember(owner = "client!rr", name = "lg", descriptor = "Lcfa;")
    public class153 field5439;

    @OriginalMember(owner = "client!rr", name = "mg", descriptor = "Lcfa;")
    public class153 field5440;

    @OriginalMember(owner = "client!rr", name = "og", descriptor = "Lcfa;")
    public class153 field5442;

    @OriginalMember(owner = "client!rr", name = "qg", descriptor = "Lcfa;")
    public class153 field5444;

    @OriginalMember(owner = "client!rr", name = "rg", descriptor = "Lcfa;")
    public class153 field5445;

    @OriginalMember(owner = "client!rr", name = "Mb", descriptor = "Ltj;")
    public class181 field5207;

    @OriginalMember(owner = "client!rr", name = "ae", descriptor = "Lcba;")
    private class511 field5325;

    @OriginalMember(owner = "client!rr", name = "af", descriptor = "Lia;")
    private class546 field5377;

    @OriginalMember(owner = "client!rr", name = "Ke", descriptor = "Lot;")
    private class547 field5361;

    @OriginalMember(owner = "client!rr", name = "bg", descriptor = "Log;")
    private class601 field5429;

    @OriginalMember(owner = "client!rr", name = "ig", descriptor = "Log;")
    private class601 field5436;

    @OriginalMember(owner = "client!rr", name = "Zf", descriptor = "Lqf;")
    public class633 field5427;

    @OriginalMember(owner = "client!rr", name = "ag", descriptor = "Lqf;")
    public class633 field5428;

    @OriginalMember(owner = "client!rr", name = "eg", descriptor = "Lqf;")
    public class633 field5432;

    @OriginalMember(owner = "client!rr", name = "jg", descriptor = "Lqf;")
    public class633 field5437;

    @OriginalMember(owner = "client!rr", name = "kg", descriptor = "Lqf;")
    private class633 field5438;

    @OriginalMember(owner = "client!rr", name = "pg", descriptor = "Lqf;")
    private class633 field5443;

    @OriginalMember(owner = "client!rr", name = "ng", descriptor = "Lbo;")
    private class679 field5441;

    @OriginalMember(owner = "client!rr", name = "hd", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field5280;

    @OriginalMember(owner = "client!rr", name = "Dd", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field5302;

    @OriginalMember(owner = "client!rr", name = "Ib", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field5203;

    @OriginalMember(owner = "client!rr", name = "ze", descriptor = "Z")
    public boolean field5350;

    @OriginalMember(owner = "client!rr", name = "Df", descriptor = "Z")
    public boolean field5405;

    @OriginalMember(owner = "client!rr", name = "Hf", descriptor = "Z")
    public boolean field5409;

    @OriginalMember(owner = "client!rr", name = "If", descriptor = "Z")
    public boolean field5410;

    @OriginalMember(owner = "client!rr", name = "Of", descriptor = "Z")
    public boolean field5416;

    @OriginalMember(owner = "client!rr", name = "tg", descriptor = "Z")
    public boolean field5447;

    @OriginalMember(owner = "client!rr", name = "tf", descriptor = "[Lwq;")
    private class152[] field5395;

    @OriginalMember(owner = "client!rr", name = "oe", descriptor = "[Lqaa;")
    public class26[] field5339;

    @OriginalMember(owner = "client!rr", name = "Ge", descriptor = "[Lqaa;")
    public class26[] field5357;

    @OriginalMember(owner = "client!rr", name = "ie", descriptor = "[Lur;")
    public class498[] field5333;

    @OriginalMember(owner = "client!rr", name = "Te", descriptor = "[Lcf;")
    public class561[] field5370;

    @OriginalMember(owner = "client!rr", name = "Ef", descriptor = "[Lcp;")
    public class674[] field5406;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIIII)V", line = 3)
    public final void method280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5278;
    }

    @OriginalMember(owner = "client!rr", name = "U", descriptor = "()I", line = 12)
    public final int method315() {
        ++field5180;
        return this.field5397;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V", line = 30)
    private final void method2222(byte arg0) {
        ++field5219;
        if (arg0 <= 106) {
            this.method153(45);
        }
        if (class335.field5475 != this.field5379) {
            class64 var2 = this.field5379;
            this.field5379 = class335.field5475;
            if (!var2.method697((byte) -104)) {
                this.method2237(-102);
            }
            this.method2297(-16516);
            this.field5366 = this.field5363;
            this.method2289((byte) 53);
            this.field5404 &= -8;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)I", line = 58)
    public final int method286(int arg0, int arg1) {
        ++field5133;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "()Z", line = 66)
    public final boolean method288() {
        ++field5265;
        return true;
    }

    @OriginalMember(owner = "client!rr", name = "ra", descriptor = "(F)V", line = 82)
    public final void method342(float arg0) {
        if (this.field5344 != arg0) {
            this.field5344 = arg0;
            this.field5210.setAmbient(arg0);
            this.method124(false);
            this.method172((byte) 51);
        }
        ++field5208;
    }

    @OriginalMember(owner = "client!rr", name = "C", descriptor = "()Z", line = 98)
    public final boolean method326() {
        ++field5159;
        return this.field5368[3].method787((byte) -109);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([IIIII)Lf;", line = 108)
    public final class702 method306(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5266;
        return new class121(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(Z)V", line = 116)
    private final void method2223(boolean arg0) {
        this.field5382 = (float) (-this.field5422 + this.field5349);
        this.field5381 = (float) (-this.field5422 + this.field5341);
        if (!arg0) {
            this.method2227(-101);
        }
        this.field5373 = (float) (this.field5330 - this.field5353);
        ++field5153;
        this.field5348 = (float) (-this.field5353 + this.field5343);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BZ)V", line = 134)
    public final void method2224(byte arg0, boolean arg1) {
        ++field5134;
        if (arg0 == -18) {
            if (!this.field5402 != !arg1) {
                this.field5402 = arg1;
                this.method166((byte) 75);
                this.field5404 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "(I)V", line = 153)
    public final void method2225(int arg0) {
        if (arg0 < 30) {
            this.method2278((byte) -85);
        }
        ++field5254;
        if (~this.field5404 != -5) {
            this.method2230(1450);
            this.method2288((byte) 89, false);
            this.method2238(false, -39);
            this.method2295(false, 128);
            this.method2224((byte) -18, false);
            this.method2242(false, -14500, -2, false);
            this.method2259(-33, 1);
            this.method2280(2, 0);
            this.field5404 = 4;
        }
    }

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "(I)V", line = 176)
    public final void method2226(int arg0) {
        ++field5304;
        this.field5316.method504();
        this.field5317 = true;
        this.method2245(-94);
        if (arg0 != 7554) {
            this.method2229(-0.5246526F, -99, -0.69892037F, 0.44810092F, -0.35018933F, -1.235736F, -0.06600811F);
        }
    }

    @OriginalMember(owner = "client!rr", name = "XA", descriptor = "(IIIII)V", line = 190)
    public final void method279(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5233;
        this.method345(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "(I)V", line = 198)
    private final void method2227(int arg0) {
        if (class432.field6571 != this.field5379) {
            class64 var2 = this.field5379;
            this.field5379 = class432.field6571;
            if (!var2.method697((byte) -62)) {
                this.method2237(24);
            }
            this.method2232(false);
            this.field5366 = this.field5384;
            this.method2289((byte) 53);
            this.field5404 &= -8;
        }
        if (arg0 == -8) {
            ++field5197;
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)V", line = 225)
    private final void method2228(byte arg0) {
        this.field5363[10] = this.field5403;
        this.field5363[14] = this.field5374;
        ++field5284;
        if (arg0 > -42) {
            this.method2251(-121, (class656) null, (byte) 88);
        }
        this.field5360 = (this.field5363[14] - (float) this.field5397) / this.field5363[10];
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II[I[I)Lua;", line = 245)
    public final class617 method317(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field5194;
        return class650.method3753(arg0, arg3, true, this, arg1, arg2);
    }

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "()[I", line = 253)
    public final int[] method353() {
        ++field5154;
        return new int[] { this.field5353, this.field5422, this.field5367, this.field5378 };
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(FIFFFFF)Z", line = 261)
    private final boolean method2229(float arg0, int arg1, float arg2, float arg3, float arg4, float arg5, float arg6) {
        ++field5218;
        if (arg1 != 4) {
            return false;
        } else {
            Buffer var8 = this.field5429.method1726(true, true);
            if (var8 == null) {
                return false;
            } else {
                Stream var9 = this.method2286(var8, (byte) -66);
                if (!Stream.method3620()) {
                    var9.method3630(arg2);
                    var9.method3630(arg3);
                    var9.method3630(arg5);
                    var9.method3630(arg0);
                    var9.method3630(arg4);
                    var9.method3630(arg6);
                } else {
                    var9.method3621(arg2);
                    var9.method3621(arg3);
                    var9.method3621(arg5);
                    var9.method3621(arg0);
                    var9.method3621(arg4);
                    var9.method3621(arg6);
                }
                var9.method3626();
                return this.field5429.method1722(-23181);
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V", line = 302)
    public final void method336(int arg0) {
        ++field5138;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lfa;Lri;II)V", line = 314)
    public class332(Canvas arg0, Object arg1, class214 arg2, class97 arg3, int arg4, int arg5) {
        super(arg2);
        this.field5346 = arg4;
        this.field5277 = this.field5224 = arg1;
        this.field5262 = this.field5260 = arg0;
        this.field5179 = arg3;
        Dimension var7 = arg0.getSize();
        this.field5305 = this.field5158 = var7.width;
        this.field5358 = arg5;
        this.field5195 = this.field5235 = var7.height;
        class597.method3480(true, false, (byte) 15);
        if (super.field2812 == null) {
            this.field5210 = new NativeInterface(0, this.field5358);
            this.field5376 = null;
        } else {
            this.field5376 = new class486(this, super.field2812);
            this.field5210 = new NativeInterface(super.field2812.method1612(109), this.field5358);
            for (int var8 = 0; var8 < super.field2812.method1612(-80); ++var8) {
                class258 var9 = super.field2812.method1610(18904, var8);
                if (var9 != null) {
                    this.field5210.initTextureMetrics(var8, var9.field4131, var9.field4126);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "(I)V", line = 360)
    private final void method2230(int arg0) {
        if (arg0 == 1450) {
            if (class693.field9706 != this.field5379) {
                class64 var2 = this.field5379;
                this.field5379 = class693.field9706;
                if (var2.method697((byte) -13)) {
                    this.method2237(arg0 + -1355);
                }
                this.method2302(false);
                this.field5366 = this.field5335;
                this.method2289((byte) 53);
                this.field5404 &= -25;
            }
            ++field5135;
        }
    }

    @OriginalMember(owner = "client!rr", name = "da", descriptor = "(IIII)V", line = 385)
    public final void method352(int arg0, int arg1, int arg2, int arg3) {
        ++field5301;
        if (~arg0 >= -1 && arg2 >= this.field5305 + -1 && ~arg1 >= -1 && ~(this.field5195 + -1) >= ~arg3) {
            this.method281();
        } else {
            this.field5330 = ~arg0 > -1 ? 0 : arg0;
            this.field5341 = arg3 <= this.field5305 ? arg3 : 0;
            this.field5343 = arg2 <= this.field5305 ? arg2 : 0;
            this.field5349 = ~arg1 <= -1 ? arg1 : 0;
            if (!this.field5447) {
                this.field5447 = true;
                this.method175(-13617);
            }
            this.method140(45);
            this.method2223(true);
        }
    }

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "()Z", line = 414)
    public final boolean method355() {
        ++field5220;
        return true;
    }

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "(Z)V", line = 423)
    public final void method2231(boolean arg0) {
        if (!arg0) {
            this.field5326 = -0.94173366F;
        }
        ++field5293;
        if (this.field5404 != 16) {
            this.method2227(-8);
            this.method2288((byte) -96, true);
            this.method2295(true, 128);
            this.method2224((byte) -18, true);
            this.method2259(-81, 1);
            this.field5404 = 16;
        }
    }

    @OriginalMember(owner = "client!rr", name = "CA", descriptor = "(IIII)V", line = 443)
    public final void method332(int arg0, int arg1, int arg2, int arg3) {
        this.field5419 = arg2;
        this.field5350 = true;
        this.field5372 = arg1;
        this.field5396 = arg3;
        ++field5188;
        this.field5421 = arg0;
    }

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "(Z)V", line = 455)
    private final void method2232(boolean arg0) {
        if (arg0) {
            this.method185((class466) null, -29, false, false, (byte) -90);
        }
        ++field5226;
        if (!this.field5362) {
            float[] var2 = this.field5384;
            float var3 = (float) this.field5393;
            float var4 = (float) this.field5397;
            float var5 = (float) (-this.field5422) * this.field5388 / (float) this.field5378;
            float var6 = (float) (-this.field5353) * this.field5388 / (float) this.field5367;
            float var7 = (float) (-this.field5353 + this.field5305) * this.field5388 / (float) this.field5367;
            float var8 = (float) (-this.field5422 + this.field5195) * this.field5388 / (float) this.field5378;
            if (var6 != var7 && var5 != var8) {
                var2[4] = 0.0F;
                var2[8] = 0.0F;
                var2[9] = 0.0F;
                var2[13] = (var5 + var8) / (-var5 + var8);
                var2[3] = 0.0F;
                var2[15] = 1.0F;
                var2[11] = 0.0F;
                var2[7] = 0.0F;
                var2[2] = 0.0F;
                var2[12] = (var6 + var7) / (var6 - var7);
                var2[14] = var3 / (-var4 + var3);
                var2[0] = 2.0F / (-var6 + var7);
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[5] = 2.0F / (var8 - var5);
                var2[10] = 1.0F / (-var4 + var3);
            } else {
                var2[10] = 1.0F;
                var2[5] = 1.0F;
                var2[4] = 0.0F;
                var2[7] = 0.0F;
                var2[14] = 0.0F;
                var2[3] = 0.0F;
                var2[11] = 0.0F;
                var2[2] = 0.0F;
                var2[6] = 0.0F;
                var2[13] = 0.0F;
                var2[12] = 0.0F;
                var2[9] = 0.0F;
                var2[8] = 0.0F;
                var2[15] = 1.0F;
                var2[1] = 0.0F;
                var2[0] = 1.0F;
            }
            this.method2276(0);
            this.field5362 = true;
        }
    }

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "(I)Lur;", line = 526)
    public final class498 method2233(int arg0) {
        ++field5152;
        if (arg0 != -1) {
            this.method137(32, (class633) null);
        }
        return this.field5323;
    }

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "(I)Lur;", line = 538)
    public final class498 method2234(int arg0) {
        if (arg0 != 6) {
            return null;
        } else {
            ++field5202;
            return this.field5333[this.field5412];
        }
    }

    @OriginalMember(owner = "client!rr", name = "GA", descriptor = "(II)V", line = 549)
    public final void method284(int arg0, int arg1) {
        ++field5160;
        if (~this.field5393 != ~arg0 || ~this.field5397 != ~arg1) {
            this.field5397 = arg1;
            this.field5393 = arg0;
            this.method2301((byte) -105);
            this.method2266(-121);
            this.method2260((byte) -101);
        }
    }

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "(IIIII)V", line = 566)
    public final void method356(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5296;
        this.method345(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "(IIIII)V", line = 576)
    public final void method329(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5299;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BI)V", line = 587)
    public final void method2235(byte arg0, int arg1) {
        this.method2290(10359, arg0 | arg0 << 8 | arg0 << 24 | arg0 << 16);
        if (arg1 != 3) {
            this.method2256(-98);
        }
        ++field5253;
    }

    @OriginalMember(owner = "client!rr", name = "JA", descriptor = "()V", line = 598)
    public final void method281() {
        ++field5261;
        this.field5330 = 0;
        this.field5349 = 0;
        this.field5341 = this.field5195;
        this.field5343 = this.field5305;
        if (this.field5447) {
            this.field5447 = false;
            this.method175(-13617);
        }
        this.method2223(true);
    }

    @OriginalMember(owner = "client!rr", name = "V", descriptor = "(IIII)V", line = 616)
    public final void method271(int arg0, int arg1, int arg2, int arg3) {
        ++field5187;
        boolean var5 = false;
        if (arg0 > this.field5330) {
            var5 = true;
            this.field5330 = arg0;
        }
        if (this.field5343 > arg2) {
            var5 = true;
            this.field5343 = arg2;
        }
        if (~this.field5349 > ~arg1) {
            var5 = true;
            this.field5349 = arg1;
        }
        if (~this.field5341 < ~arg3) {
            var5 = true;
            this.field5341 = arg3;
        }
        if (var5) {
            if (!this.field5447) {
                this.field5447 = true;
                this.method175(-13617);
            }
            this.method140(101);
            this.method2223(true);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BZIZII)V", line = 666)
    private final void method2236(byte arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        boolean var7 = arg3 & this.method326();
        if (arg0 != 10) {
            this.method2273((byte) 88, true);
        }
        ++field5161;
        if (!var7 && (~arg2 == -5 || ~arg2 == -9 || ~arg2 == -10)) {
            arg2 = 2;
            arg5 = ~arg2 != -5 ? 1 : arg4 & 1;
            arg4 = 0;
        }
        if (~arg2 != -1 && arg1) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field5347 != arg2) {
            if (~this.field5347 != -1) {
                this.field5368[Integer.MAX_VALUE & this.field5347].method783(255);
            }
            if (~arg2 != -1) {
                this.field5377 = this.field5368[Integer.MAX_VALUE & arg2];
                this.field5377.method788(arg1, arg0 + -10);
                this.field5377.method793(arg0 ^ -81, arg1);
                this.field5377.method785(8, arg4, arg5);
            } else {
                this.field5377 = null;
            }
            this.field5347 = arg2;
            this.field5342 = arg5;
            this.field5417 = arg4;
        } else if (this.field5347 != 0) {
            this.field5368[Integer.MAX_VALUE & this.field5347].method793(-113, arg1);
            if (this.field5417 != arg4 || ~this.field5342 != ~arg5) {
                this.field5368[Integer.MAX_VALUE & this.field5347].method785(8, arg4, arg5);
                this.field5417 = arg4;
                this.field5342 = arg5;
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "(I)V", line = 723)
    private final void method2237(int arg0) {
        this.field5425 = false;
        ++field5311;
        if (this.field5377 != null) {
            this.field5377.method786(89);
        }
        this.method116(-111);
        int var2 = -118 / ((arg0 - -34) / 44);
    }

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "()V", line = 738)
    public final void method308() {
        ++field5183;
        if (this.field5376 != null) {
            this.field5376.method2981((byte) 79);
        }
    }

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "()Z", line = 751)
    public final boolean method305() {
        ++field5165;
        return true;
    }

    @OriginalMember(owner = "client!rr", name = "IA", descriptor = "(IIIIII[BII)V", line = 761)
    public final void method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field5181;
    }

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "()V", line = 768)
    public void method132() {
        if (!this.field5375) {
            for (class66 var1 = this.field5225.method3465((byte) 119); var1 != null; var1 = this.field5225.method3469(0)) {
                ((class658) var1).method3781((byte) 101);
            }
            Enumeration var2 = this.field5203.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method133((byte) 121, var3, this.field5203.get(var3));
            }
            class655.method3770(true, false, 0);
            this.field5210.release();
            this.field5375 = true;
        }
        ++field5241;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lq;)V", line = 805)
    public final void method346(class393 arg0) {
        this.field5320 = (class498) arg0;
        ++field5212;
        this.field5322.method512(this.field5320);
        this.field5322.method3027(116);
        this.field5323.method3029((byte) -25, this.field5322);
        this.field5321.method3029((byte) -25, this.field5320);
        if (this.field5379.method697((byte) -17)) {
            this.method2237(-117);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZI)V", line = 822)
    public final void method2238(boolean arg0, int arg1) {
        if (arg1 >= -26) {
            this.field5447 = false;
        }
        if (!this.field5398 == arg0) {
            this.field5398 = arg0;
            this.method156(116);
            this.field5404 &= -8;
        }
        ++field5142;
    }

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "(I)V", line = 845)
    public final void method2239(int arg0) {
        ++field5259;
        Enumeration var2 = this.field5203.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method133((byte) 114, var3, this.field5203.get(var3));
        }
        this.field5436.method431(-5517);
        if (arg0 == -25976) {
            this.field5429.method431(arg0 + 20459);
            this.field5433.method1257(-31012);
            this.field5439.method1257(-31012);
            this.field5435.method1257(-31012);
            this.field5444.method1257(-31012);
            this.field5431.method1257(-31012);
            this.field5361.method3303(arg0 + 25976);
            this.field5441.method431(-5517);
        }
    }

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "(B)V", line = 877)
    public final void method2240(byte arg0) {
        if (arg0 >= 118) {
            ++field5196;
            if (class102.field1688 != this.field5379) {
                class64 var2 = this.field5379;
                this.field5379 = class102.field1688;
                if (var2.method697((byte) -92)) {
                    this.method2237(-79);
                }
                this.field5404 &= -32;
                this.field5366 = this.field5355;
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([BIZLos;II)Lmca;", line = 903)
    public final class29 method2241(byte[] arg0, int arg1, boolean arg2, class408 arg3, int arg4, int arg5) {
        ++field5193;
        if (arg1 >= -125) {
            this.method310(53, (class617) null, -67, 53);
        }
        return this.method115(arg4, arg2, 0, arg5, arg3, arg0, 0, 2);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZIIZ)V", line = 917)
    public final void method2242(boolean arg0, int arg1, int arg2, boolean arg3) {
        ++field5192;
        if (~this.field5407 != ~arg2 || !this.field5350 != !this.field5365) {
            class29 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field5350 ? 0 : 3;
            if (arg2 < 0) {
                this.method2263((byte) 120);
            } else {
                var5 = this.field5376.method2979(8893, arg2);
                class258 var10 = super.field2812.method1610(arg1 ^ -29052, arg2);
                if (var10.field4123 == 0 && ~var10.field4116 == -1) {
                    this.method2263((byte) 106);
                } else {
                    int var11 = var10.field4137 ? 64 : 128;
                    int var12 = var11 * 50;
                    class498 var13 = this.method2282((byte) 124);
                    var13.method3026(0.0F, (float) (this.field5327 % var12 * var10.field4116) / (float) var12, 17547, (float) (this.field5327 % var12 * var10.field4123) / (float) var12);
                    this.method2291(class386.field5995, 24813);
                }
                if (!this.field5350) {
                    var8 = var10.field4138;
                    var7 = var10.field4130;
                    var9 = var10.field4134;
                }
                var6 = var10.field4140;
            }
            this.method2236((byte) 10, arg3, var9, arg0, var7, var8);
            if (this.field5377 == null) {
                this.method2271(var5, 5180);
                this.method2280(2, var6);
            } else {
                this.field5377.method794(var6, false, var5);
            }
            this.field5365 = this.field5350;
            this.field5407 = arg2;
        }
        if (arg1 != -14500) {
            this.field5262 = null;
        }
        this.field5404 &= -8;
    }

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "()Z", line = 986)
    public final boolean method289() {
        ++field5139;
        return true;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([IIZIB)Lmca;", line = 996)
    public final class29 method2243(int[] arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        if (arg4 != -20) {
            this.method2260((byte) -119);
        }
        ++field5295;
        return this.method142(arg0, arg4 + -46, arg2, arg3, 0, 0, arg1);
    }

    @OriginalMember(owner = "client!rr", name = "O", descriptor = "(IIIIII)Z", line = 1007)
    public final boolean method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5151;
        float var7 = this.field5320.method3035((float) arg2, (float) arg1, 16383, (float) arg0);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field5320.method3035((float) arg5, (float) arg4, 16383, (float) arg3);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field5393) || !(var8 < (float) this.field5393)) && (!(var7 > (float) this.field5397) || !((float) this.field5397 < var8))) {
            int var9 = (int) ((float) this.field5367 * this.field5320.method3039((float) arg1, (float) arg2, (float) arg0, (byte) 11) / var7);
            int var10 = (int) ((float) this.field5367 * this.field5320.method3039((float) arg4, (float) arg5, (float) arg3, (byte) 75) / var8);
            if ((float) var9 < this.field5373 && (float) var10 < this.field5373 || this.field5348 < (float) var9 && this.field5348 < (float) var10) {
                return false;
            } else {
                int var11 = (int) ((float) this.field5378 * this.field5320.method3044((float) arg1, (float) arg2, (byte) 122, (float) arg0) / var7);
                int var12 = (int) ((float) this.field5378 * this.field5320.method3044((float) arg4, (float) arg5, (byte) 83, (float) arg3) / var8);
                return (!(this.field5382 > (float) var11) || !((float) var12 < this.field5382)) && (!((float) var11 > this.field5381) || !((float) var12 > this.field5381));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1046)
    public final void method291(Canvas arg0) {
        ++field5238;
        Object var2 = null;
        if (arg0 != null && this.field5260 != arg0) {
            if (this.field5203.containsKey(arg0)) {
                var2 = this.field5203.get(arg0);
            }
        } else {
            var2 = this.field5277;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method138(var2, arg0, (byte) 127);
            if (this.field5262 == arg0) {
                this.method2264((byte) -116);
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([I)V", line = 1071)
    public final void method268(int[] arg0) {
        arg0[0] = this.field5305;
        ++field5270;
        arg0[1] = this.field5195;
    }

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "(I)V", line = 1085)
    public void method169(int arg0) {
        ++field5291;
        this.method2256(0);
        if (arg0 >= -13) {
            this.method109(false);
        }
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(II)V", line = 1098)
    public final void method2244(int arg0, int arg1) {
        if (this.field5412 != arg0) {
            this.field5412 = arg0;
            this.method149((byte) -19);
        }
        ++field5289;
        if (arg1 >= -59) {
            this.field5396 = -120;
        }
    }

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "()Lq;", line = 1121)
    public final class393 method339() {
        ++field5206;
        return this.field5426;
    }

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "(I)V", line = 1130)
    private final void method2245(int arg0) {
        if (class693.field9706 == this.field5379) {
            float var2 = this.method162(true);
            this.field5316.method3024(var2, 26428, 0.0F, var2);
        }
        ++field5211;
        this.field5425 = false;
        if (arg0 >= -87) {
            this.field5431 = null;
        }
        this.method102((byte) 98);
        if (this.field5377 != null) {
            this.field5377.method789(123);
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(II)I", line = 1153)
    public final int method323(int arg0, int arg1) {
        ++field5268;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIZ)Lf;", line = 1161)
    public final class702 method282(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5146;
        class121 var6 = new class121(this, arg2, arg3, arg4);
        var6.method1081(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "(I)I", line = 1174)
    public final int method2246(int arg0) {
        ++field5215;
        if (arg0 != 0) {
            this.field5442 = null;
        }
        return this.field5396;
    }

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "(I)V", line = 1189)
    public void method154(int arg0) {
        ++field5170;
        this.field5413 = this.field5356;
        if (arg0 > -71) {
            this.field5325 = null;
        }
        this.field5356 = 0;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(IIIIIII)Z", line = 1201)
    public static final boolean method2247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5201;
        if (arg4 != -13766) {
            method2283(-21, (class167) null, 64, (class428) null, -88, 92, (class55) null, 94, (byte) -83, 74, -63, -24, -78, -59);
        }
        int var7 = arg1 + arg2;
        int var8 = arg5 + arg6;
        int var9 = arg0 + arg3;
        if (!class705.method3975(var8, var8, arg2, var9, (byte) -127, arg2, var9, arg3, var7, var8)) {
            return false;
        } else if (!class705.method3975(var8, var8, arg2, var9, (byte) -125, var7, arg3, arg3, var7, var8)) {
            return false;
        } else {
            if (class220.field3583 <= arg2) {
                if (!class705.method3975(var8, var8, var7, var9, (byte) -127, var7, arg3, var9, var7, arg5)) {
                    return false;
                }
                if (!class705.method3975(arg5, var8, var7, arg3, (byte) -127, var7, arg3, var9, var7, arg5)) {
                    return false;
                }
            } else {
                if (!class705.method3975(var8, var8, arg2, var9, (byte) -125, arg2, arg3, var9, arg2, arg5)) {
                    return false;
                }
                if (!class705.method3975(arg5, var8, arg2, arg3, (byte) -125, arg2, arg3, var9, arg2, arg5)) {
                    return false;
                }
            }
            if (class2.field13 > arg3) {
                if (!class705.method3975(var8, var8, arg2, arg3, (byte) -127, arg2, arg3, arg3, var7, arg5)) {
                    return false;
                }
                if (!class705.method3975(arg5, var8, arg2, arg3, (byte) -126, var7, arg3, arg3, var7, arg5)) {
                    return false;
                }
            } else {
                if (!class705.method3975(var8, var8, arg2, var9, (byte) -128, arg2, var9, var9, var7, arg5)) {
                    return false;
                }
                if (!class705.method3975(arg5, var8, arg2, var9, (byte) -128, var7, var9, var9, var7, arg5)) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIZ)Lf;", line = 1275)
    public final class702 method350(int arg0, int arg1, boolean arg2) {
        ++field5232;
        return new class121(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "(I)V", line = 1283)
    public final void method2248(int arg0) {
        ++field5283;
        this.method2240((byte) 121);
        if (arg0 != 25416) {
            this.field5420 = 0;
        }
        this.method2289((byte) 53);
    }

    @OriginalMember(owner = "client!rr", name = "A", descriptor = "(I)Lpfa;", line = 1299)
    public final class270 method2249(int arg0) {
        ++field5300;
        if (arg0 >= -59) {
            this.method162(true);
        }
        return this.field5325 == null ? null : this.field5325.method525(true);
    }

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "(I)V", line = 1315)
    public final void method293(int arg0) {
        ++field5279;
    }

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "(I)V", line = 1322)
    public final void method2250(int arg0) {
        this.method2251(2, class654.field9145, (byte) 65);
        if (arg0 <= 16) {
            this.method2231(true);
        }
        ++field5136;
    }

    @OriginalMember(owner = "client!rr", name = "FA", descriptor = "(ILua;II)V", line = 1334)
    public final void method310(int arg0, class617 arg1, int arg2, int arg3) {
        ++field5156;
        class213 var5 = (class213) arg1;
        class29 var6 = var5.field3535;
        this.method2274(2929);
        this.method2271(var6, 5180);
        this.method2259(-93, 1);
        this.method2275(class406.field6268, 105, class406.field6268);
        this.method2287((byte) -105, 0, class471.field6974);
        this.method2290(10359, arg0);
        this.field5316.method3034((float) this.field5305, (float) this.field5195, true, 0.0F);
        this.method2270(-86);
        this.field5333[0].method3034(var6.method365(-127, (float) this.field5305), var6.method373((float) this.field5195, (byte) -73), true, 1.0F);
        this.field5333[0].method3024(var6.method365(-108, (float) (-arg2)), 26428, 0.0F, var6.method373((float) (-arg3), (byte) -90));
        this.field5370[0] = class386.field5995;
        this.method2255(-23);
        this.method2250(47);
        this.method2263((byte) 127);
        this.method2287((byte) -102, 0, class622.field8779);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILpw;B)V", line = 1362)
    private final void method2251(int arg0, class656 arg1, byte arg2) {
        if (arg2 <= 58) {
            this.field5384 = null;
        }
        this.method178(this.field5436, 0, -120);
        ++field5209;
        this.method137(-68, this.field5438);
        this.method111(arg0, 0, (byte) 13, arg1);
    }

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "(Z)V", line = 1376)
    private final void method2252(boolean arg0) {
        this.method178(this.field5429, 0, -108);
        if (arg0) {
            ++field5200;
            this.method137(-121, this.field5443);
            this.method111(1, 0, (byte) 13, class193.field3198);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 1391)
    public final class37 method275(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5306;
        return new class203(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "(Z)V", line = 1403)
    private final void method2253(boolean arg0) {
        if (!arg0) {
            ++field5184;
            this.field5429 = this.method174(true, 68);
            this.field5429.method1725((byte) 89, 24, 12);
            this.field5443 = this.method105((byte) 104, new class108[] { new class108(class369.field5774) });
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(FIIIIIIZI)[[I", line = 1422)
    public static final int[][] method2254(float arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        ++field5256;
        int[][] var9 = new int[arg8][arg5];
        class331 var10 = new class331();
        var10.field5124 = arg1;
        var10.field5127 = (int) ((float) arg6 * arg0);
        var10.field5130 = arg7;
        var10.field5112 = arg4;
        var10.field5123 = arg3;
        var10.method3((byte) -15);
        class556.method3323(arg8, 0, arg5);
        for (int var11 = 0; ~var11 > ~arg8; ++var11) {
            var10.method2221(88, var9[var11], var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!rr", name = "D", descriptor = "(I)V", line = 1450)
    private final void method2255(int arg0) {
        this.method112(0);
        ++field5314;
        if (arg0 <= -16) {
            if (this.field5377 != null) {
                this.field5377.method784((byte) -103);
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "E", descriptor = "(I)V", line = 1466)
    private final void method2256(int arg0) {
        this.method124(false);
        ++field5140;
        this.method180(91);
        this.method156(121);
        this.method154(-98);
        this.method184(4);
        this.method172((byte) -90);
        this.method145((byte) -35);
        this.method177(arg0 + -29670);
        this.method166((byte) 74);
        this.method123((byte) 87);
        this.method147(-24255);
        this.method157((byte) -127);
        this.method128((byte) 36);
        this.method126(arg0 ^ 30688);
        for (int var2 = this.field5359 + -1; ~var2 <= -1; --var2) {
            this.method2244(var2, -121);
            this.method152(arg0 ^ 110);
            this.method183(7);
            this.method2263((byte) 107);
        }
        this.method130(true);
        this.method109(false);
        this.method153(20021);
        if (arg0 == 0) {
            this.method102((byte) 110);
            this.method116(-93);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([FI)[F", line = 1512)
    public final float[] method2257(float[] arg0, int arg1) {
        arg0[4] = this.field5366[1];
        ++field5310;
        arg0[0] = this.field5366[0];
        arg0[8] = this.field5366[2];
        arg0[12] = this.field5366[3];
        arg0[1] = this.field5366[4];
        arg0[5] = this.field5366[5];
        arg0[2] = this.field5366[8];
        arg0[9] = this.field5366[6];
        arg0[13] = this.field5366[7];
        arg0[7] = this.field5366[13];
        arg0[3] = this.field5366[12];
        arg0[10] = this.field5366[10];
        arg0[6] = this.field5366[9];
        arg0[14] = this.field5366[11];
        arg0[15] = this.field5366[15];
        if (arg1 != 16711680) {
            this.field5158 = -16;
        }
        arg0[11] = this.field5366[14];
        return arg0;
    }

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "()Z", line = 1540)
    public final boolean method324() {
        ++field5221;
        return this.field5410;
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(II)Lia;", line = 1551)
    public class546 method161(int arg0, int arg1) {
        if (arg1 != 5299) {
            return null;
        } else {
            ++field5242;
            if (arg0 != 6) {
                if (arg0 != 1) {
                    if (arg0 != 2) {
                        return ~arg0 == -8 ? new class157(this) : new class494(this);
                    } else {
                        return new class497(this, this.field5207);
                    }
                } else {
                    return new class273(this);
                }
            } else {
                return new class532(this);
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "()Z", line = 1602)
    public final boolean method266() {
        ++field5276;
        return false;
    }

    @OriginalMember(owner = "client!rr", name = "F", descriptor = "(I)V", line = 1610)
    private final void method2258(int arg0) {
        if (~this.field5404 != -2) {
            this.method2230(1450);
            this.method2288((byte) -112, false);
            this.method2238(false, -111);
            this.method2295(false, 128);
            this.method2224((byte) -18, false);
            this.method2242(false, -14500, -2, false);
            this.method2280(2, 1);
            this.method2271(this.field5418, 5180);
            this.field5404 = 1;
        }
        if (arg0 > -23) {
            this.field5447 = false;
        }
        ++field5149;
    }

    @OriginalMember(owner = "client!rr", name = "la", descriptor = "(IIII)V", line = 1635)
    public final void method318(int arg0, int arg1, int arg2, int arg3) {
        this.field5367 = arg2;
        this.field5353 = arg0;
        this.field5378 = arg3;
        this.field5422 = arg1;
        ++field5264;
        this.method2266(-125);
        this.method2301((byte) -105);
        this.method2240((byte) 127);
        this.method2223(true);
    }

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "(I)V", line = 1653)
    public final void method341(int arg0) {
        ++field5162;
    }

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "(II)V", line = 1660)
    public final void method2259(int arg0, int arg1) {
        ++field5147;
        if (this.field5420 != arg1) {
            class423 var3;
            boolean var4;
            boolean var5;
            if (~arg1 == -2) {
                var3 = class494.field7216;
                var4 = true;
                var5 = true;
            } else if (arg1 == 2) {
                var4 = true;
                var5 = false;
                var3 = class694.field9728;
            } else if (arg1 != 128) {
                var4 = false;
                var5 = false;
                var3 = class558.field8063;
            } else {
                var4 = true;
                var5 = true;
                var3 = class252.field4024;
            }
            if (this.field5328 == !var5) {
                this.field5328 = var5;
                this.method126(30688);
            }
            if (!var4 != !this.field5401) {
                this.field5401 = var4;
                this.method157((byte) -117);
            }
            if (this.field5364 != var3) {
                this.field5364 = var3;
                this.method128((byte) 36);
            }
            this.field5420 = arg1;
            this.field5404 &= -29;
        }
        if (arg0 > -19) {
            this.method2288((byte) 75, false);
        }
    }

    @OriginalMember(owner = "client!rr", name = "MA", descriptor = "(III[I)V", line = 1729)
    public final void method330(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5174;
        float var5 = this.field5320.method3035((float) arg2, (float) arg1, 16383, (float) arg0);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field5422;
            var7 = this.field5353;
        } else {
            var7 = (int) ((float) this.field5367 * this.field5320.method3039((float) arg1, (float) arg2, (float) arg0, (byte) 82) / var5);
            var6 = (int) ((float) this.field5378 * this.field5320.method3044((float) arg1, (float) arg2, (byte) 89, (float) arg0) / var5);
        }
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var6 + -this.field5382);
        arg3[0] = (int) ((float) var7 + -this.field5373);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIIF)Lcp;", line = 1754)
    public final class674 method325(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field5290;
        return new class9(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "(B)V", line = 1765)
    private final void method2260(byte arg0) {
        ++field5178;
        if (this.field5377 != null) {
            this.field5377.method795(15759);
        }
        if (arg0 <= -88) {
            this.method147(-24255);
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(BZ)V", line = 1779)
    public final void method2261(byte arg0, boolean arg1) {
        ++field5275;
        if (arg0 <= -52) {
            if (this.field5386 != arg1) {
                this.field5386 = arg1;
                this.method145((byte) -35);
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(BI)Lbo;", line = 1797)
    public final class679 method2262(byte arg0, int arg1) {
        ++field5248;
        if (~(arg1 * 2) < ~this.field5441.method429(34962)) {
            this.field5441.method424((byte) -85, arg1);
        }
        if (arg0 > -107) {
            this.field5331 = false;
        }
        return this.field5441;
    }

    @OriginalMember(owner = "client!rr", name = "BA", descriptor = "()I", line = 1812)
    public final int method322() {
        ++field5173;
        return this.field5393;
    }

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "(B)V", line = 1821)
    public final void method2263(byte arg0) {
        if (arg0 > 105) {
            if (this.field5370[this.field5412] != class260.field4242) {
                this.field5370[this.field5412] = class260.field4242;
                this.field5333[this.field5412].method504();
                this.method2255(-35);
            }
            ++field5285;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIII)V", line = 1839)
    public final void method344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5281;
        float var7 = this.method162(true);
        this.method2258(-117);
        this.method2290(10359, arg4);
        this.method2287((byte) -86, 0, class471.field6974);
        this.method2304(class471.field6974, 0, -111);
        this.method2259(-128, arg5);
        this.field5316.method3034((float) (arg2 - 1), (float) (arg3 + -1), true, 1.0F);
        this.field5316.method3024((float) arg0 + -var7, 26428, 0.0F, (float) arg1 + -var7);
        this.method2270(-18);
        this.method106(8077, false);
        this.method2251(4, class286.field4548, (byte) 59);
        this.method106(8077, true);
        this.method2304(class622.field8779, 0, -112);
        this.method2287((byte) -104, 0, class622.field8779);
    }

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "(B)V", line = 1861)
    private final void method2264(byte arg0) {
        if (arg0 > -114) {
            this.field5390 = null;
        }
        ++field5255;
        if (this.field5262 != null) {
            Dimension var2 = this.field5262.getSize();
            this.field5235 = var2.height;
            this.field5158 = var2.width;
        } else {
            this.field5158 = this.field5235 = 1;
        }
        this.field5305 = this.field5158;
        this.field5195 = this.field5235;
        this.method2293(-28626);
        this.method2301((byte) -105);
        this.method2266(-126);
        this.method109(false);
        this.method2223(true);
        this.method2240((byte) 123);
        this.method281();
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIZ)I", line = 1896)
    public static final int method2265(int arg0, int arg1, int arg2, boolean arg3) {
        ++field5236;
        if (arg1 == arg2) {
            return arg2;
        } else {
            int var4 = 128 - arg0;
            int var5 = (arg2 & 127) * var4 - -((127 & arg1) * arg0) >> 7;
            if (!arg3) {
                method2254(-0.8246057F, -115, 68, 71, 55, 29, 77, false, -96);
            }
            int var6 = (896 & arg2) * var4 - -((arg1 & 896) * arg0) >> 7;
            int var7 = (64512 & arg1) * arg0 + (arg2 & 64512) * var4 >> 7;
            return var7 & 64512 | var6 & 896 | 127 & var5;
        }
    }

    @OriginalMember(owner = "client!rr", name = "I", descriptor = "(I)V", line = 1920)
    private final void method2266(int arg0) {
        ++field5282;
        this.field5362 = false;
        this.method2232(false);
        if (arg0 > -112) {
            this.method162(false);
        }
        if (class432.field6571 == this.field5379) {
            this.method2289((byte) 53);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZILos;I[FZ)Lmca;", line = 1937)
    public final class29 method2267(boolean arg0, int arg1, class408 arg2, int arg3, float[] arg4, boolean arg5) {
        ++field5189;
        if (!arg5) {
            this.field5392 = false;
        }
        return this.method129(arg1, arg4, arg3, 0, 0, 96, arg2, arg0);
    }

    @OriginalMember(owner = "client!rr", name = "J", descriptor = "(I)I", line = 1950)
    public final int method2268(int arg0) {
        if (arg0 != -257) {
            return 79;
        } else {
            ++field5177;
            return this.field5372;
        }
    }

    @OriginalMember(owner = "client!rr", name = "K", descriptor = "(I)V", line = 1961)
    public final void method2269(int arg0) {
        this.field5357 = new class26[this.field5359];
        this.field5370 = new class561[this.field5359];
        this.field5395 = new class152[this.field5359];
        ++field5143;
        this.field5333 = new class498[this.field5359];
        this.field5339 = new class26[this.field5359];
        for (int var2 = 0; ~this.field5359 < ~var2; ++var2) {
            this.field5339[var2] = class646.field9074;
            this.field5357[var2] = class646.field9074;
            this.field5370[var2] = class260.field4242;
            this.field5333[var2] = new class498();
        }
        this.field5406 = new class674[this.field5387 - 2];
        this.field5418 = this.method125(1, 1, class134.field2197, arg0 + -24130, class86.field1055);
        this.method277(new class658(262144));
        this.field5432 = this.method105((byte) 69, new class108[] { new class108(new class369[] { class369.field5774, class369.field5778 }) });
        this.field5437 = this.method105((byte) 70, new class108[] { new class108(new class369[] { class369.field5774, class369.field5776 }) });
        this.field5427 = this.method105((byte) 84, new class108[] { new class108(class369.field5774), new class108(class369.field5776), new class108(class369.field5778), new class108(class369.field5775) });
        this.field5428 = this.method105((byte) 87, new class108[] { new class108(class369.field5774), new class108(class369.field5776), new class108(class369.field5778) });
        this.field5440 = new class153(this, 0, 0, false, false);
        this.field5433 = new class153(this, 0, 0, true, true);
        this.field5445 = new class153(this, 0, 0, false, false);
        this.field5439 = new class153(this, 0, 0, true, true);
        this.field5434 = new class153(this, 0, 0, false, false);
        this.field5435 = new class153(this, 0, 0, true, true);
        this.field5430 = new class153(this, 0, 0, false, false);
        this.field5444 = new class153(this, 0, 0, true, true);
        this.field5442 = new class153(this, 0, 0, false, false);
        this.field5431 = new class153(this, 0, 0, true, true);
        this.field5361 = new class547(this);
        this.field5441 = this.method113(true, 126);
        this.method2294(arg0 ^ -24261);
        this.field5207 = new class181(this);
        this.field5368[1] = this.method161(1, 5299);
        this.field5368[2] = this.method161(2, 5299);
        this.field5368[4] = this.method161(4, class357.method2397(arg0, 18968));
        this.field5368[5] = this.method161(5, class357.method2397(arg0, 18968));
        this.field5368[6] = this.method161(6, class357.method2397(arg0, 18968));
        this.field5368[7] = this.method161(7, 5299);
        this.field5368[3] = this.method161(3, 5299);
        this.field5368[8] = this.method161(8, 5299);
        this.field5368[9] = this.method161(9, 5299);
        if (!this.field5368[2].method787((byte) -109)) {
            this.field5368[2] = this.method161(0, class357.method2397(arg0, 18968));
        }
        if (!this.field5368[4].method787((byte) -109)) {
            this.field5368[4] = this.field5368[2];
        }
        if (!this.field5368[8].method787((byte) -109)) {
            this.field5368[8] = this.field5368[4];
        }
        if (arg0 != 24235) {
            this.method353();
        }
        if (!this.field5368[9].method787((byte) -109)) {
            this.field5368[9] = this.field5368[8];
        }
        this.method169(-113);
        this.method281();
        this.method143();
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)V", line = 2036)
    public final void method301(int arg0) {
        ++field5205;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            if (this.field5376 != null) {
                this.field5376.method2981((byte) 79);
            }
            this.field5354 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rr", name = "L", descriptor = "(I)V", line = 2050)
    public final void method2270(int arg0) {
        ++field5250;
        this.field5317 = false;
        this.method2245(-96);
        if (arg0 > -8) {
            this.field5362 = true;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lwq;I)V", line = 2063)
    public final void method2271(class152 arg0, int arg1) {
        if (this.field5395[this.field5412] != arg0) {
            this.field5395[this.field5412] = arg0;
            if (arg0 != null) {
                arg0.method247(-4112);
            } else {
                this.method159(-121);
            }
            this.field5404 &= -2;
        }
        if (arg1 == 5180) {
            ++field5230;
        }
    }

    @OriginalMember(owner = "client!rr", name = "M", descriptor = "(I)I", line = 2085)
    public final int method2272(int arg0) {
        if (arg0 != 2) {
            return -1;
        } else {
            ++field5231;
            return this.field5421;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIIIIIII)V", line = 2101)
    public final void method299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5237;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(BZ)V", line = 2108)
    public final void method2273(byte arg0, boolean arg1) {
        int var3 = -68 % ((-49 - arg0) / 36);
        if (this.field5334 != arg1) {
            this.field5334 = arg1;
            this.method156(125);
        }
        ++field5273;
    }

    @OriginalMember(owner = "client!rr", name = "O", descriptor = "(I)V", line = 2124)
    public final void method2274(int arg0) {
        if (~this.field5404 != -3) {
            this.method2230(arg0 + -1479);
            this.method2288((byte) -128, false);
            this.method2238(false, arg0 ^ -2892);
            this.method2295(false, 128);
            this.method2224((byte) -18, false);
            this.method2242(false, -14500, -2, false);
            this.field5404 = 2;
        }
        ++field5307;
        if (arg0 != 2929) {
            this.method113(true, 54);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lqaa;ILqaa;)V", line = 2149)
    public final void method2275(class26 arg0, int arg1, class26 arg2) {
        ++field5240;
        boolean var4 = false;
        int var5 = 19 / ((45 - arg1) / 34);
        if (this.field5357[this.field5412] != arg2) {
            this.field5357[this.field5412] = arg2;
            var4 = true;
            this.method152(79);
        }
        if (this.field5339[this.field5412] != arg0) {
            this.field5339[this.field5412] = arg0;
            var4 = true;
            this.method183(7);
        }
        if (var4) {
            this.field5404 &= -30;
        }
    }

    @OriginalMember(owner = "client!rr", name = "YA", descriptor = "(IIII)V", line = 2180)
    public final void method309(int arg0, int arg1, int arg2, int arg3) {
        ++field5251;
        if (!this.field5350) {
            throw new RuntimeException("");
        } else {
            this.field5419 = arg2;
            this.field5396 = arg3;
            this.field5421 = arg0;
            this.field5372 = arg1;
            if (this.field5365) {
                this.field5368[3].method791(-1);
                this.field5368[3].method795(15759);
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "Q", descriptor = "(I)V", line = 2203)
    private final void method2276(int arg0) {
        if (arg0 != 0) {
            this.field5387 = -26;
        }
        ++field5204;
        this.field5332 = (float) this.field5397;
    }

    @OriginalMember(owner = "client!rr", name = "R", descriptor = "(I)I", line = 2216)
    public final int method2277(int arg0) {
        if (arg0 != 30751) {
            this.method2234(43);
        }
        ++field5167;
        return this.field5412;
    }

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "(B)V", line = 2228)
    public final void method2278(byte arg0) {
        if (arg0 > -104) {
            this.method344(124, 107, -5, 58, -112, -54);
        }
        ++field5249;
        if (~this.field5404 != -9) {
            this.method2222((byte) 111);
            this.method2288((byte) 16, true);
            this.method2295(true, 128);
            this.method2224((byte) -18, true);
            this.method2259(-31, 1);
            this.field5404 = 8;
        }
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 2248)
    public final void method298(Canvas arg0) {
        this.field5262 = null;
        this.field5277 = null;
        ++field5214;
        if (arg0 != null && this.field5260 != arg0) {
            if (this.field5203.containsKey(arg0)) {
                this.field5277 = this.field5203.get(arg0);
                this.field5262 = arg0;
            }
        } else {
            this.field5262 = this.field5260;
            this.field5277 = this.field5224;
        }
        if (this.field5262 != null && this.field5277 != null) {
            this.method150(this.field5262, (byte) -85, this.field5277);
            this.method2264((byte) -117);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IF)V", line = 2286)
    public final void method2279(int arg0, float arg1) {
        if (arg0 == -17208) {
            ++field5227;
            if (this.field5388 != arg1) {
                this.field5388 = arg1;
                this.method2266(-118);
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "(II)V", line = 2302)
    public final void method2280(int arg0, int arg1) {
        ++field5272;
        if (~arg1 != -2) {
            if (~arg1 != -1) {
                if (arg1 == 2) {
                    this.method2275(class406.field6268, 95, class51.field681);
                } else if (arg1 != 3) {
                    if (arg1 == 4) {
                        this.method2275(class636.field8947, 90, class636.field8947);
                    }
                } else {
                    this.method2275(class646.field9074, 8, class471.field6979);
                }
            } else {
                this.method2275(class646.field9074, arg0 + -99, class646.field9074);
            }
        } else {
            this.method2275(class406.field6268, 97, class406.field6268);
        }
        if (arg0 != 2) {
            this.method314();
        }
    }

    @OriginalMember(owner = "client!rr", name = "ZA", descriptor = "(Z)V", line = 2332)
    public final void method334(boolean arg0) {
        this.field5394 = arg0;
        ++field5198;
        this.method166((byte) -91);
    }

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "()Z", line = 2343)
    public final boolean method307() {
        ++field5216;
        return true;
    }

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "(Z)I", line = 2351)
    public final int method2281(boolean arg0) {
        if (arg0) {
            return 24;
        } else {
            ++field5169;
            return this.field5419;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ltt;I)V", line = 2368)
    public final void method320(class79 arg0, int arg1) {
        ++field5175;
        this.field5361.method3302(arg0, 25030, this, arg1);
    }

    @OriginalMember(owner = "client!rr", name = "J", descriptor = "(IIIIII)V", line = 2378)
    public final void method335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2258(-112);
        ++field5287;
        this.method2290(10359, arg4);
        this.method2287((byte) -120, 0, class471.field6974);
        this.method2304(class471.field6974, 0, -122);
        this.method2259(-36, arg5);
        this.field5316.method3034((float) arg2, (float) arg3, true, 1.0F);
        this.field5316.method505(arg0, arg1, 0);
        this.method2270(-122);
        this.method106(8077, false);
        this.method2250(120);
        this.method106(8077, true);
        this.method2304(class622.field8779, 0, -119);
        this.method2287((byte) -84, 0, class622.field8779);
    }

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "(B)Lur;", line = 2399)
    public final class498 method2282(byte arg0) {
        int var2 = 5 % ((78 - arg0) / 37);
        ++field5294;
        return this.field5333[this.field5412];
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I[Lcp;)V", line = 2409)
    public final void method327(int arg0, class674[] arg1) {
        ++field5258;
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field5406[var3] = arg1[var3];
        }
        this.field5356 = arg0;
        if (this.field5379.method697((byte) -51)) {
            this.method154(-114);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)V", line = 2428)
    public final void method300(boolean arg0) {
        ++field5145;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V", line = 2440)
    public void method155(int arg0) {
        ++field5246;
        if (this.field5376 != null) {
            this.field5376.method2982(false);
        }
        this.field5327 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ldd;)V", line = 2451)
    public final void method264(class654 arg0) {
        this.field5325 = (class511) arg0;
        ++field5217;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILr;ILqg;IILda;IBIIIII)Lda;", line = 2460)
    public static final class55 method2283(int arg0, class167 arg1, int arg2, class428 arg3, int arg4, int arg5, class55 arg6, int arg7, byte arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        ++field5247;
        if (arg6 == null) {
            return null;
        } else {
            int var14 = 2055;
            if (arg3 != null) {
                int var15 = var14 | arg3.method2712((byte) 24, -1, false, arg10);
                var14 = var15 & -513;
            }
            long var16 = ((long) arg7 << 48) + ((long) arg0 << 32) + (long) ((arg2 << 24) + (arg12 << 16) + arg4);
            class49 var18 = class376.field5862;
            class55 var19;
            synchronized (class376.field5862) {
                var19 = (class55) class376.field5862.method560(false, var16);
            }
            if (arg8 >= -116) {
                return null;
            } else {
                if (var19 == null || ~arg1.method323(var19.method651(), var14) != -1) {
                    if (var19 != null) {
                        var14 = arg1.method286(var14, var19.method651());
                    }
                    byte var20;
                    if (~arg4 == -2) {
                        var20 = 9;
                    } else if (arg4 != 2) {
                        if (arg4 != 3) {
                            if (~arg4 != -5) {
                                var20 = 21;
                            } else {
                                var20 = 18;
                            }
                        } else {
                            var20 = 15;
                        }
                    } else {
                        var20 = 12;
                    }
                    byte var21 = 3;
                    int[] var22 = new int[] { 64, 96, 128 };
                    class534 var23 = new class534(var20 * var21 + 1, var20 * var21 * 2 + -var20, 0);
                    int var24 = var23.method3231(0, -57, 0, 0);
                    int[][] var25 = new int[var21][var20];
                    for (int var26 = 0; var26 < var21; ++var26) {
                        int var27 = var22[var26];
                        int var28 = var22[var26];
                        for (int var29 = 0; var29 < var20; ++var29) {
                            int var30 = (var29 << 14) / var20;
                            int var31 = class567.field8139[var30] * var27 >> 14;
                            int var32 = class567.field8138[var30] * var28 >> 14;
                            var25[var26][var29] = var23.method3231(var31, -97, 0, var32);
                        }
                    }
                    for (int var33 = 0; var33 < var21; ++var33) {
                        int var34 = (var33 * 256 - -128) / var21;
                        int var35 = -var34 + 256;
                        byte var36 = (byte) (arg2 * var34 + arg12 * var35 >> 8);
                        short var37 = (short) ((32512 & (arg0 & 127) * var35 + (arg7 & 127) * var34) + ((arg0 & 896) * var35 + (arg7 & 896) * var34 & 229376) + (16515072 & (arg0 & 64512) * var35 + (64512 & arg7) * var34) >> 8);
                        for (int var38 = 0; ~var38 > ~var20; ++var38) {
                            if (~var33 != -1) {
                                var23.method3236((byte) -1, (short) -1, (byte) 1, var37, var25[var33 + -1][(var38 + 1) % var20], var25[var33 + -1][var38], var36, 12712, var25[var33][(var38 + 1) % var20]);
                                var23.method3236((byte) -1, (short) -1, (byte) 1, var37, var25[var33][(var38 + 1) % var20], var25[var33 + -1][var38], var36, 12712, var25[var33][var38]);
                            } else {
                                var23.method3236((byte) -1, (short) -1, (byte) 1, var37, var25[0][(var38 + 1) % var20], var24, var36, 12712, var25[0][var38]);
                            }
                        }
                    }
                    var19 = arg1.method287(var23, var14, class611.field8696, 64, 768);
                    class49 var39 = class376.field5862;
                    synchronized (class376.field5862) {
                        class376.field5862.method559(var19, var16, 0);
                    }
                }
                int var40 = arg6.method645();
                int var41 = arg6.method622();
                int var42 = arg6.method611();
                int var43 = arg6.method642();
                class675 var44 = null;
                if (arg3 != null) {
                    int var45 = arg3.field6521[arg10];
                    var44 = class636.field8942.method2870(var45 >> 16, 28133);
                    arg10 = var45 & 65535;
                }
                class55 var46;
                if (var44 != null) {
                    var46 = var19.method609((byte) 3, var14, true);
                    var46.method600(-var40 + var41 >> 1, 128, -var42 + var43 >> 1);
                    var46.method639(var40 + var41 >> 1, 0, var42 + var43 >> 1);
                    var46.method615(arg10, var44, -30515);
                } else {
                    var46 = var19.method609((byte) 3, var14, true);
                    var46.method600(-var40 + var41 >> 1, 128, -var42 + var43 >> 1);
                    var46.method639(var40 + var41 >> 1, 0, var42 + var43 >> 1);
                }
                if (~arg9 != -1) {
                    var46.method644(arg9);
                }
                if (~arg5 != -1) {
                    var46.method610(arg5);
                }
                if (~arg11 != -1) {
                    var46.method639(0, arg11, 0);
                }
                return var46;
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ltt;)V", line = 2632)
    public final void method354(class79 arg0) {
        ++field5222;
        this.field5361.method3302(arg0, 25030, this, -1);
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)Le;", line = 2640)
    public final class493 method290(int arg0) {
        ++field5157;
        class658 var2 = new class658(arg0);
        this.field5225.method3463((byte) -87, var2);
        return var2;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZII)Ljaclib/memory/heap/NativeHeapBuffer;", line = 2655)
    public final NativeHeapBuffer method2284(boolean arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field5351 = 0.40096352F;
        }
        ++field5309;
        return this.field5280.method3617(arg1, arg0);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lufa;[Lwt;Z)Lla;", line = 2666)
    public final class418 method347(class632 arg0, class284[] arg1, boolean arg2) {
        ++field5176;
        return new class482(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "()Z", line = 2674)
    public final boolean method262() {
        ++field5292;
        return true;
    }

    @OriginalMember(owner = "client!rr", name = "T", descriptor = "(I)[F", line = 2684)
    public final float[] method2285(int arg0) {
        ++field5308;
        if (arg0 >= -102) {
            this.field5413 = 17;
        }
        return this.field5355;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Le;)V", line = 2701)
    public final void method277(class493 arg0) {
        this.field5280 = ((class658) arg0).field9169;
        ++field5244;
        this.field5302 = this.field5280.method3617(32768, false);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljaclib/memory/Buffer;B)Ljaclib/memory/Stream;", line = 2713)
    public final Stream method2286(Buffer arg0, byte arg1) {
        this.field5390.method3624(arg0);
        ++field5191;
        return arg1 > -49 ? null : this.field5390;
    }

    @OriginalMember(owner = "client!rr", name = "pa", descriptor = "(III)V", line = 2726)
    public final void method313(int arg0, int arg1, int arg2) {
        ++field5313;
        if (this.field5411 != arg0 || this.field5340 != arg1 || ~this.field5329 != ~arg2) {
            this.field5340 = arg1;
            this.field5411 = arg0;
            this.field5329 = arg2;
            this.method2260((byte) -116);
            this.method123((byte) 87);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BILko;)V", line = 2744)
    public final void method2287(byte arg0, int arg1, class466 arg2) {
        if (arg0 > -69) {
            this.field5442 = null;
        }
        this.method185(arg2, arg1, false, false, (byte) 106);
        ++field5319;
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(BZ)V", line = 2759)
    public final void method2288(byte arg0, boolean arg1) {
        int var3 = 94 % ((-37 - arg0) / 52);
        if (this.field5405 != arg1) {
            this.field5405 = arg1;
            this.method123((byte) 87);
            this.field5404 &= -32;
        }
        ++field5150;
    }

    @OriginalMember(owner = "client!rr", name = "oa", descriptor = "([I)V", line = 2776)
    public final void method343(int[] arg0) {
        arg0[0] = this.field5330;
        arg0[1] = this.field5349;
        arg0[2] = this.field5343;
        ++field5172;
        arg0[3] = this.field5341;
    }

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "(B)V", line = 2790)
    private final void method2289(byte arg0) {
        ++field5171;
        this.method153(20021);
        if (this.field5377 != null) {
            this.field5377.method790(-32535);
        }
        if (arg0 != 53) {
            this.method2230(11);
        }
    }

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "(II)V", line = 2806)
    public final void method2290(int arg0, int arg1) {
        if (arg0 != 10359) {
            this.field5305 = 110;
        }
        if (~this.field5337 != ~arg1) {
            this.field5337 = arg1;
            this.method130(true);
        }
        ++field5155;
    }

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "()Z", line = 2824)
    public final boolean method294() {
        ++field5164;
        return false;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lcf;I)V", line = 2832)
    public final void method2291(class561 arg0, int arg1) {
        if (arg1 != 24813) {
            this.method347((class632) null, (class284[]) null, true);
        }
        this.field5370[this.field5412] = arg0;
        ++field5257;
        this.method2255(-115);
    }

    @OriginalMember(owner = "client!rr", name = "va", descriptor = "(I)V", line = 2844)
    public final void method328(int arg0) {
        ++field5274;
        this.field5400 = 0;
        while (~arg0 < -2) {
            ++this.field5400;
            arg0 >>= 1;
        }
        this.field5414 = 1 << this.field5400;
    }

    @OriginalMember(owner = "client!rr", name = "T", descriptor = "()I", line = 2860)
    public final int method340() {
        ++field5190;
        return this.field5446;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lur;I)V", line = 2871)
    public final void method2292(class498 arg0, int arg1) {
        int var3 = 11 / ((arg1 - 56) / 46);
        this.field5316.method512(arg0);
        ++field5234;
        this.field5317 = false;
        this.method2245(-98);
    }

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "()Z", line = 2884)
    public final boolean method319() {
        ++field5163;
        return false;
    }

    @OriginalMember(owner = "client!rr", name = "V", descriptor = "(I)V", line = 2893)
    private final void method2293(int arg0) {
        ++field5141;
        this.field5338 = false;
        if (class693.field9706 == this.field5379) {
            this.method2302(false);
            this.method2289((byte) 53);
        }
        if (arg0 != -28626) {
            this.field5339 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "W", descriptor = "(I)V", line = 2911)
    public final void method2294(int arg0) {
        ++field5137;
        Hashtable var2 = new Hashtable();
        if (this.field5203 != null && !this.field5203.isEmpty()) {
            Enumeration var3 = this.field5203.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method167(116, var4));
            }
        }
        this.field5203 = var2;
        int var5 = -83 % ((56 - arg0) / 36);
        this.method2299((byte) 49);
        this.method2253(false);
        this.field5361.method3307(true, this);
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(ZI)V", line = 2947)
    public final void method2295(boolean arg0, int arg1) {
        ++field5239;
        if (this.field5331 == !arg0) {
            this.field5331 = arg0;
            this.method177(-29670);
            this.field5404 &= -32;
        }
        if (arg1 != 128) {
            this.method112(31);
        }
    }

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "()I", line = 2965)
    public final int method267() {
        ++field5267;
        return this.field5387 - 2;
    }

    @OriginalMember(owner = "client!rr", name = "X", descriptor = "(I)Lur;", line = 2974)
    public final class498 method2296(int arg0) {
        if (arg0 != 0) {
            this.method300(true);
        }
        ++field5168;
        return this.field5316;
    }

    @OriginalMember(owner = "client!rr", name = "Y", descriptor = "(I)V", line = 2985)
    private final void method2297(int arg0) {
        if (arg0 != -16516) {
            this.field5405 = false;
        }
        if (!this.field5385) {
            float[] var2 = this.field5363;
            float var3 = (float) (-this.field5353 * this.field5393) / (float) this.field5367;
            float var4 = (float) ((-this.field5353 + this.field5305) * this.field5393) / (float) this.field5367;
            float var5 = (float) (this.field5422 * this.field5393) / (float) this.field5378;
            float var6 = (float) ((this.field5422 - this.field5195) * this.field5393) / (float) this.field5378;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field5393 * 2.0F;
                var2[7] = 0.0F;
                var2[13] = 0.0F;
                var2[1] = 0.0F;
                var2[4] = 0.0F;
                var2[15] = 0.0F;
                var2[12] = 0.0F;
                var2[14] = this.field5374 = (float) (this.field5397 * this.field5393) / (float) (-this.field5397 + this.field5393);
                var2[6] = 0.0F;
                var2[3] = 0.0F;
                var2[11] = -1.0F;
                var2[2] = 0.0F;
                var2[0] = var7 / (var4 - var3);
                var2[10] = this.field5403 = (float) this.field5397 / (float) (-this.field5397 + this.field5393);
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[5] = var7 / (var5 - var6);
                var2[8] = (var3 + var4) / (var4 - var3);
            } else {
                var2[9] = 0.0F;
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[13] = 0.0F;
                var2[10] = 1.0F;
                var2[15] = 1.0F;
                var2[8] = 0.0F;
                var2[6] = 0.0F;
                var2[5] = 1.0F;
                var2[11] = 0.0F;
                var2[3] = 0.0F;
                var2[14] = 0.0F;
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[0] = 1.0F;
                var2[12] = 0.0F;
            }
            this.method2228((byte) -55);
            this.field5385 = true;
        }
        ++field5229;
    }

    @OriginalMember(owner = "client!rr", name = "Z", descriptor = "(I)Lur;", line = 3059)
    public final class498 method2298(int arg0) {
        int var2 = 45 / ((-42 - arg0) / 50);
        ++field5245;
        return this.field5322;
    }

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "()Lq;", line = 3071)
    public final class393 method259() {
        ++field5213;
        return this.field5320;
    }

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "(B)V", line = 3079)
    private final void method2299(byte arg0) {
        ++field5243;
        this.field5436 = this.method174(false, arg0 + 11);
        this.field5436.method1725((byte) -127, 140, 28);
        for (int var2 = 0; var2 < 4; ++var2) {
            Buffer var3 = this.field5436.method1726(true, true);
            if (var3 != null) {
                Stream var4 = this.method2286(var3, (byte) -126);
                if (Stream.method3620()) {
                    var4.method3621(0.0F);
                    var4.method3621(0.0F);
                    var4.method3621(0.0F);
                    var4.method3621(0.0F);
                    var4.method3621(0.0F);
                    var4.method3621(0.0F);
                    var4.method3621(0.0F);
                    var4.method3621(0.0F);
                    var4.method3621(1.0F);
                    var4.method3621(0.0F);
                    var4.method3621(0.0F);
                    var4.method3621(1.0F);
                    var4.method3621(0.0F);
                    var4.method3621(1.0F);
                    var4.method3621(1.0F);
                    var4.method3621(1.0F);
                    var4.method3621(0.0F);
                    var4.method3621(1.0F);
                    var4.method3621(1.0F);
                    var4.method3621(1.0F);
                    var4.method3621(1.0F);
                    var4.method3621(1.0F);
                    var4.method3621(0.0F);
                    var4.method3621(0.0F);
                    var4.method3621(1.0F);
                    var4.method3621(0.0F);
                    var4.method3621(1.0F);
                    var4.method3621(0.0F);
                    var4.method3621(0.0F);
                    var4.method3621(0.0F);
                    var4.method3621(0.0F);
                    var4.method3621(0.0F);
                    var4.method3621(0.0F);
                    var4.method3621(0.0F);
                    var4.method3621(0.0F);
                } else {
                    var4.method3630(0.0F);
                    var4.method3630(0.0F);
                    var4.method3630(0.0F);
                    var4.method3630(0.0F);
                    var4.method3630(0.0F);
                    var4.method3630(0.0F);
                    var4.method3630(0.0F);
                    var4.method3630(0.0F);
                    var4.method3630(1.0F);
                    var4.method3630(0.0F);
                    var4.method3630(0.0F);
                    var4.method3630(1.0F);
                    var4.method3630(0.0F);
                    var4.method3630(1.0F);
                    var4.method3630(1.0F);
                    var4.method3630(1.0F);
                    var4.method3630(0.0F);
                    var4.method3630(1.0F);
                    var4.method3630(1.0F);
                    var4.method3630(1.0F);
                    var4.method3630(1.0F);
                    var4.method3630(1.0F);
                    var4.method3630(0.0F);
                    var4.method3630(0.0F);
                    var4.method3630(1.0F);
                    var4.method3630(0.0F);
                    var4.method3630(1.0F);
                    var4.method3630(0.0F);
                    var4.method3630(0.0F);
                    var4.method3630(0.0F);
                    var4.method3630(0.0F);
                    var4.method3630(0.0F);
                    var4.method3630(0.0F);
                    var4.method3630(0.0F);
                    var4.method3630(0.0F);
                }
                var4.method3626();
                if (this.field5436.method1722(-23181)) {
                    break;
                }
            }
        }
        this.field5438 = this.method105((byte) 119, new class108[] { new class108(new class369[] { class369.field5774, class369.field5778, class369.field5778 }) });
        if (arg0 != 49) {
            this.field5373 = -0.4968681F;
        }
    }

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "(BZ)V", line = 3197)
    public final void method2300(byte arg0, boolean arg1) {
        if (!arg1 == this.field5392) {
            this.field5392 = arg1;
            this.method123((byte) 87);
        }
        ++field5223;
        if (arg0 >= -127) {
            this.field5335 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lwt;Z)Lf;", line = 3214)
    public final class702 method265(class284 arg0, boolean arg1) {
        ++field5228;
        class702 var10;
        if (~arg0.field4535 != -1 && arg0.field4537 != 0) {
            int[] var3 = new int[arg0.field4537 * arg0.field4535];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field4539 == null) {
                for (int var6 = 0; ~arg0.field4537 < ~var6; ++var6) {
                    for (int var7 = 0; arg0.field4535 > var7; ++var7) {
                        int var8 = arg0.field4538[255 & arg0.field4532[var4++]];
                        var3[var5++] = ~var8 == -1 ? 0 : class81.method769(-16777216, var8);
                    }
                }
            } else {
                for (int var9 = 0; ~arg0.field4537 < ~var9; ++var9) {
                    for (int var11 = 0; arg0.field4535 > var11; ++var11) {
                        var3[var5++] = class81.method769(arg0.field4538[class453.method2846(arg0.field4532[var4], 255)], arg0.field4539[var4] << 24);
                        ++var4;
                    }
                }
            }
            var10 = this.method306(var3, 0, arg0.field4535, arg0.field4535, arg0.field4537);
        } else {
            var10 = this.method306(new int[1], 0, 1, 1, 1);
        }
        var10.method1085(arg0.field4533, arg0.field4540, arg0.field4534, arg0.field4536);
        return var10;
    }

    @OriginalMember(owner = "client!rr", name = "L", descriptor = "()V", line = 3285)
    public final void method314() {
        ++field5288;
        this.field5350 = false;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 3293)
    public final void method304(Canvas arg0) {
        ++field5298;
        if (this.field5260 == arg0) {
            throw new RuntimeException();
        } else if (this.field5203.containsKey(arg0)) {
            this.method133((byte) 127, arg0, this.field5203.get(arg0));
            this.field5203.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIIILua;II)V", line = 3312)
    public final void method316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class617 arg6, int arg7, int arg8) {
        ++field5303;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(IIIIII)V", line = 3319)
    public final void method345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5199;
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var9 = var7 * var10;
            var8 *= var10;
        }
        if (this.method2229((float) arg2 + var9, 4, (float) arg0, (float) arg1, (float) arg3 + var8, 0.0F, 0.0F)) {
            this.method2258(-55);
            this.method2290(10359, arg4);
            this.method2287((byte) -99, 0, class471.field6974);
            this.method2304(class471.field6974, 0, -118);
            this.method2259(-59, arg5);
            this.method2226(7554);
            this.method106(8077, false);
            this.method2252(true);
            this.method106(8077, true);
            this.method2304(class622.field8779, 0, -121);
            this.method2287((byte) -98, 0, class622.field8779);
        }
    }

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "(B)V", line = 3356)
    private final void method2301(byte arg0) {
        this.field5385 = false;
        ++field5263;
        this.method2297(-16516);
        if (arg0 != -105) {
            this.field5333 = null;
        }
        if (class335.field5475 == this.field5379) {
            this.method2289((byte) 53);
        }
    }

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "(Z)V", line = 3372)
    private final void method2302(boolean arg0) {
        ++field5186;
        if (arg0) {
            this.method186((class408) null, (class134) null, (byte) 34);
        }
        if (!this.field5338) {
            float[] var2 = this.field5335;
            this.field5338 = true;
            if (~this.field5305 != -1 && this.field5195 != 0) {
                var2[11] = 0.0F;
                var2[15] = 1.0F;
                var2[0] = 2.0F / (float) this.field5305;
                var2[10] = 0.5F;
                var2[13] = 1.0F;
                var2[5] = -2.0F / (float) this.field5195;
                var2[2] = 0.0F;
                var2[14] = 0.5F;
                var2[1] = 0.0F;
                var2[7] = 0.0F;
                var2[3] = 0.0F;
                var2[9] = 0.0F;
                var2[6] = 0.0F;
                var2[4] = 0.0F;
                var2[8] = 0.0F;
                var2[12] = -1.0F;
            } else {
                var2[13] = 0.0F;
                var2[12] = 0.0F;
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[3] = 0.0F;
                var2[9] = 0.0F;
                var2[14] = 0.0F;
                var2[10] = 1.0F;
                var2[2] = 0.0F;
                var2[0] = 1.0F;
                var2[6] = 0.0F;
                var2[11] = 0.0F;
                var2[8] = 0.0F;
                var2[1] = 0.0F;
                var2[15] = 1.0F;
                var2[5] = 1.0F;
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "VA", descriptor = "(IFFFFF)V", line = 3429)
    public final void method296(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field5269;
        boolean var7 = ~this.field5336 != ~arg0;
        if (var7 || this.field5369 != arg1 || this.field5408 != arg2) {
            this.field5369 = arg1;
            this.field5336 = arg0;
            this.field5408 = arg2;
            if (var7) {
                this.field5383 = (float) (this.field5336 & 65280) / 65280.0F;
                this.field5326 = (float) (16711680 & this.field5336) / 1.671168E7F;
                this.field5351 = (float) (255 & this.field5336) / 255.0F;
                this.method124(false);
            }
            this.field5210.setSunColour(this.field5326, this.field5383, this.field5351, arg1, arg2);
            this.method180(91);
        }
        if (this.field5389[0] != arg3 || this.field5389[1] != arg4 || this.field5389[2] != arg5) {
            this.field5389[1] = arg4;
            this.field5389[0] = arg3;
            this.field5389[2] = arg5;
            this.field5371[1] = -arg4;
            this.field5371[2] = -arg5;
            this.field5371[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5423[1] = arg4 * var8;
            this.field5423[0] = arg3 * var8;
            this.field5423[2] = arg5 * var8;
            this.field5399[0] = -this.field5423[0];
            this.field5399[1] = -this.field5423[1];
            this.field5399[2] = -this.field5423[2];
            this.field5210.setSunDirection(this.field5423[0], this.field5423[1], this.field5423[2]);
            this.method184(4);
            this.field5352 = (int) (arg5 * 256.0F / arg4);
            this.field5424 = (int) (arg3 * 256.0F / arg4);
        }
        this.method172((byte) 67);
    }

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "()Lq;", line = 3482)
    public final class393 method272() {
        ++field5144;
        return new class498();
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "()I", line = 3495)
    public final int method338() {
        ++field5286;
        return this.field5318 - -this.field5315 + this.field5312;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Luo;IIII)Lda;", line = 3503)
    public final class55 method287(class534 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5148;
        return new class153(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "(B)Lur;", line = 3513)
    public final class498 method2303(byte arg0) {
        ++field5166;
        if (arg0 <= 38) {
            this.field5195 = -66;
        }
        if (!this.field5425) {
            this.field5324.method3036(this.field5322, this.field5316);
            this.field5425 = true;
        }
        return this.field5324;
    }

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "()Z", line = 3531)
    public final boolean method261() {
        ++field5271;
        return true;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(IIIIII)Ldd;", line = 3539)
    public final class654 method348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5185;
        return new class42(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!rr", name = "AA", descriptor = "(III[I)V", line = 3550)
    public final void method292(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5182;
        float var5 = this.field5320.method3035((float) arg2, (float) arg1, 16383, (float) arg0);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field5422;
            var7 = this.field5353;
        } else {
            var7 = (int) ((float) this.field5367 * this.field5320.method3039((float) arg1, (float) arg2, (float) arg0, (byte) 82) / var5);
            var6 = (int) ((float) this.field5378 * this.field5320.method3044((float) arg1, (float) arg2, (byte) 74, (float) arg0) / var5);
        }
        arg3[2] = (int) var5;
        arg3[0] = (int) ((float) var7 - this.field5373);
        arg3[1] = (int) ((float) var6 - this.field5382);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 3578)
    public final void method297(Canvas arg0) {
        ++field5252;
        if (this.field5260 == arg0) {
            throw new RuntimeException();
        } else if (!this.field5203.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method167(120, arg0);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field5203.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lko;II)V", line = 3631)
    public final void method2304(class466 arg0, int arg1, int arg2) {
        if (arg2 >= -110) {
            this.field5397 = -107;
        }
        ++field5297;
        this.method117(arg0, false, arg1, 0);
    }

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "(I)V")
    public abstract void method152(int arg0);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
    public abstract void method138(Object arg0, Canvas arg1, byte arg2);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZZ[[II)Lpfa;")
    public abstract class270 method171(boolean arg0, boolean arg1, int[][] arg2, int arg3);

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "(I)V")
    public abstract void method147(int arg0);

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(Z)V")
    public abstract void method124(boolean arg0);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIBLpw;)V")
    public abstract void method111(int arg0, int arg1, byte arg2, class656 arg3);

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)V")
    public abstract void method102(byte arg0);

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "(I)V")
    public abstract void method112(int arg0);

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(B)V")
    public abstract void method166(byte arg0);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZLqs;)V")
    public abstract void method163(boolean arg0, class560 arg1);

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "(I)V")
    public abstract void method153(int arg0);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I[FIIIILos;Z)Lmca;")
    public abstract class29 method129(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, class408 arg6, boolean arg7);

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "(B)V")
    public abstract void method172(byte arg0);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILmg;ILos;)Lmca;")
    public abstract class29 method125(int arg0, int arg1, class134 arg2, int arg3, class408 arg4);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lmg;Los;I)Z")
    public abstract boolean method164(class134 arg0, class408 arg1, int arg2);

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "(B)V")
    public abstract void method145(byte arg0);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lko;IZZB)V")
    public abstract void method185(class466 arg0, int arg1, boolean arg2, boolean arg3, byte arg4);

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "(Z)F")
    public abstract float method162(boolean arg0);

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "(I)V")
    public abstract void method180(int arg0);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lko;ZII)V")
    public abstract void method117(class466 arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rr", name = "C", descriptor = "(I)V")
    public abstract void method126(int arg0);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZIILos;[BII)Lmca;")
    public abstract class29 method115(int arg0, boolean arg1, int arg2, int arg3, class408 arg4, byte[] arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
    public abstract void method150(Canvas arg0, byte arg1, Object arg2);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Log;II)V")
    public abstract void method178(class601 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rr", name = "G", descriptor = "(I)V")
    public abstract void method184(int arg0);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B[Lej;)Lqf;")
    public abstract class633 method105(byte arg0, class108[] arg1);

    @OriginalMember(owner = "client!rr", name = "H", descriptor = "(I)V")
    public abstract void method183(int arg0);

    @OriginalMember(owner = "client!rr", name = "N", descriptor = "(I)V")
    public abstract void method159(int arg0);

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(ZI)Log;")
    public abstract class601 method174(boolean arg0, int arg1);

    @OriginalMember(owner = "client!rr", name = "P", descriptor = "(I)V")
    public abstract void method116(int arg0);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method167(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!rr", name = "S", descriptor = "(I)V")
    public abstract void method140(int arg0);

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "(B)V")
    public abstract void method157(byte arg0);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Los;Lmg;B)Z")
    public abstract boolean method186(class408 arg0, class134 arg1, byte arg2);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILqf;)V")
    public abstract void method137(int arg0, class633 arg1);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILos;I[BII)Lqw;")
    public abstract class69 method118(int arg0, class408 arg1, int arg2, byte[] arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "(B)V")
    public abstract void method123(byte arg0);

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "(Z)V")
    public abstract void method130(boolean arg0);

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(ZI)Lbo;")
    public abstract class679 method113(boolean arg0, int arg1);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZ)V")
    public abstract void method106(int arg0, boolean arg1);

    @OriginalMember(owner = "client!rr", name = "U", descriptor = "(I)V")
    public abstract void method156(int arg0);

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "(B)V")
    public abstract void method149(byte arg0);

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "(B)V")
    public abstract void method128(byte arg0);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lpw;ILbo;IIII)V")
    public abstract void method120(class656 arg0, int arg1, class679 arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "(II)V")
    public abstract void method173(int arg0, int arg1);

    @OriginalMember(owner = "client!rr", name = "ab", descriptor = "(I)V")
    public abstract void method175(int arg0);

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "(Z)V")
    public abstract void method109(boolean arg0);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([IIZIIII)Lmca;")
    public abstract class29 method142(int[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method133(byte arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!rr", name = "bb", descriptor = "(I)V")
    public abstract void method177(int arg0);
}
