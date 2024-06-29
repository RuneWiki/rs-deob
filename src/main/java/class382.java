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

@OriginalClass("client!nv")
public abstract class class382 extends class166 {

    @OriginalMember(owner = "client!nv", name = "I", descriptor = "Lgca;")
    private class227 field5114 = new class227();

    @OriginalMember(owner = "client!nv", name = "Qd", descriptor = "Z")
    public boolean field5278 = true;

    @OriginalMember(owner = "client!nv", name = "Sd", descriptor = "Lcaa;")
    public class274 field5280 = new class274();

    @OriginalMember(owner = "client!nv", name = "Ud", descriptor = "Lcaa;")
    public class274 field5282 = new class274();

    @OriginalMember(owner = "client!nv", name = "Vd", descriptor = "Lcaa;")
    public class274 field5283 = new class274();

    @OriginalMember(owner = "client!nv", name = "Wd", descriptor = "Lcaa;")
    public class274 field5284 = new class274();

    @OriginalMember(owner = "client!nv", name = "Xd", descriptor = "Lcaa;")
    private class274 field5285 = new class274();

    @OriginalMember(owner = "client!nv", name = "Yd", descriptor = "Lcaa;")
    private class274 field5286 = new class274();

    @OriginalMember(owner = "client!nv", name = "ie", descriptor = "I")
    private int field5296 = 0;

    @OriginalMember(owner = "client!nv", name = "ge", descriptor = "Z")
    private boolean field5294 = false;

    @OriginalMember(owner = "client!nv", name = "ue", descriptor = "I")
    public int field5308 = -1;

    @OriginalMember(owner = "client!nv", name = "Ee", descriptor = "I")
    public int field5318 = 0;

    @OriginalMember(owner = "client!nv", name = "ee", descriptor = "[F")
    private float[] field5292 = new float[16];

    @OriginalMember(owner = "client!nv", name = "qe", descriptor = "Z")
    public boolean field5304 = false;

    @OriginalMember(owner = "client!nv", name = "Ce", descriptor = "I")
    private int field5316 = -1;

    @OriginalMember(owner = "client!nv", name = "fe", descriptor = "I")
    private int field5293 = 0;

    @OriginalMember(owner = "client!nv", name = "se", descriptor = "I")
    private int field5306 = 1;

    @OriginalMember(owner = "client!nv", name = "we", descriptor = "Z")
    public boolean field5310 = false;

    @OriginalMember(owner = "client!nv", name = "Ge", descriptor = "F")
    public float field5320 = 1.0F;

    @OriginalMember(owner = "client!nv", name = "Be", descriptor = "Z")
    public boolean field5315 = false;

    @OriginalMember(owner = "client!nv", name = "he", descriptor = "Z")
    public boolean field5295 = false;

    @OriginalMember(owner = "client!nv", name = "ne", descriptor = "[F")
    private float[] field5301 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!nv", name = "ke", descriptor = "Z")
    private boolean field5298 = false;

    @OriginalMember(owner = "client!nv", name = "Se", descriptor = "F")
    public float field5332 = 1.0F;

    @OriginalMember(owner = "client!nv", name = "kf", descriptor = "[F")
    public float[] field5349 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!nv", name = "Ie", descriptor = "I")
    public int field5322 = 0;

    @OriginalMember(owner = "client!nv", name = "Te", descriptor = "F")
    public float field5333 = 3584.0F;

    @OriginalMember(owner = "client!nv", name = "Qe", descriptor = "I")
    private int field5330 = -1;

    @OriginalMember(owner = "client!nv", name = "hf", descriptor = "I")
    public int field5347 = 3584;

    @OriginalMember(owner = "client!nv", name = "tf", descriptor = "F")
    public float field5358 = 1.0F;

    @OriginalMember(owner = "client!nv", name = "Fe", descriptor = "Z")
    private boolean field5319 = false;

    @OriginalMember(owner = "client!nv", name = "vf", descriptor = "I")
    public int field5360 = 0;

    @OriginalMember(owner = "client!nv", name = "Ae", descriptor = "[F")
    public float[] field5314 = this.field5301;

    @OriginalMember(owner = "client!nv", name = "Re", descriptor = "I")
    public int field5331 = 0;

    @OriginalMember(owner = "client!nv", name = "of", descriptor = "F")
    public float field5353 = -1.0F;

    @OriginalMember(owner = "client!nv", name = "ve", descriptor = "I")
    public int field5309 = -1;

    @OriginalMember(owner = "client!nv", name = "qf", descriptor = "Z")
    public boolean field5355 = true;

    @OriginalMember(owner = "client!nv", name = "Le", descriptor = "I")
    public int field5325 = 0;

    @OriginalMember(owner = "client!nv", name = "Ne", descriptor = "Ltp;")
    public class494 field5327 = class532.field7194;

    @OriginalMember(owner = "client!nv", name = "uf", descriptor = "F")
    private float field5359 = 1.0F;

    @OriginalMember(owner = "client!nv", name = "lf", descriptor = "Laba;")
    public class159 field5350 = class571.field8103;

    @OriginalMember(owner = "client!nv", name = "Pe", descriptor = "Z")
    private boolean field5329 = false;

    @OriginalMember(owner = "client!nv", name = "Ef", descriptor = "[F")
    public float[] field5369 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!nv", name = "Ff", descriptor = "[Lcc;")
    private class681[] field5370 = new class681[10];

    @OriginalMember(owner = "client!nv", name = "rf", descriptor = "Z")
    public boolean field5356 = true;

    @OriginalMember(owner = "client!nv", name = "pf", descriptor = "Z")
    public boolean field5354 = true;

    @OriginalMember(owner = "client!nv", name = "Af", descriptor = "I")
    public int field5365 = 0;

    @OriginalMember(owner = "client!nv", name = "Gf", descriptor = "I")
    private int field5371 = 0;

    @OriginalMember(owner = "client!nv", name = "me", descriptor = "I")
    public int field5300 = 3;

    @OriginalMember(owner = "client!nv", name = "zf", descriptor = "I")
    public int field5364 = 0;

    @OriginalMember(owner = "client!nv", name = "cf", descriptor = "I")
    private int field5342 = 0;

    @OriginalMember(owner = "client!nv", name = "Me", descriptor = "[F")
    private float[] field5326 = new float[16];

    @OriginalMember(owner = "client!nv", name = "Lf", descriptor = "I")
    public int field5376 = 0;

    @OriginalMember(owner = "client!nv", name = "Ke", descriptor = "F")
    public float field5324 = 1.0F;

    @OriginalMember(owner = "client!nv", name = "Kf", descriptor = "F")
    public float field5375 = 3584.0F;

    @OriginalMember(owner = "client!nv", name = "wf", descriptor = "I")
    public int field5361 = 0;

    @OriginalMember(owner = "client!nv", name = "Of", descriptor = "I")
    public int field5379 = 128;

    @OriginalMember(owner = "client!nv", name = "df", descriptor = "I")
    public int field5343 = 8;

    @OriginalMember(owner = "client!nv", name = "He", descriptor = "I")
    private int field5321 = -1;

    @OriginalMember(owner = "client!nv", name = "yf", descriptor = "[F")
    private float[] field5363 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!nv", name = "ye", descriptor = "Z")
    public boolean field5312 = true;

    @OriginalMember(owner = "client!nv", name = "Cf", descriptor = "I")
    public int field5367 = 50;

    @OriginalMember(owner = "client!nv", name = "Qf", descriptor = "I")
    public int field5381 = 0;

    @OriginalMember(owner = "client!nv", name = "Bf", descriptor = "I")
    public int field5366 = 512;

    @OriginalMember(owner = "client!nv", name = "xe", descriptor = "I")
    public int field5311 = 512;

    @OriginalMember(owner = "client!nv", name = "Nf", descriptor = "[F")
    private float[] field5378 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!nv", name = "gf", descriptor = "[F")
    private float[] field5346 = new float[16];

    @OriginalMember(owner = "client!nv", name = "Tf", descriptor = "I")
    private int field5384 = 16777215;

    @OriginalMember(owner = "client!nv", name = "Uf", descriptor = "F")
    public float field5385 = -1.0F;

    @OriginalMember(owner = "client!nv", name = "Vf", descriptor = "Z")
    private boolean field5386 = false;

    @OriginalMember(owner = "client!nv", name = "Jf", descriptor = "Z")
    public boolean field5374 = true;

    @OriginalMember(owner = "client!nv", name = "Wf", descriptor = "Z")
    private boolean field5387 = false;

    @OriginalMember(owner = "client!nv", name = "Xe", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5337 = new Stream();

    @OriginalMember(owner = "client!nv", name = "pg", descriptor = "Lcaa;")
    private class274 field5406 = new class274();

    @OriginalMember(owner = "client!nv", name = "Ue", descriptor = "I")
    public int field5334;

    @OriginalMember(owner = "client!nv", name = "tc", descriptor = "Lsea;")
    public class648 field5203;

    @OriginalMember(owner = "client!nv", name = "hd", descriptor = "Ljava/lang/Object;")
    public Object field5243;

    @OriginalMember(owner = "client!nv", name = "Hc", descriptor = "Ljava/lang/Object;")
    private Object field5217;

    @OriginalMember(owner = "client!nv", name = "Fb", descriptor = "Ljava/awt/Canvas;")
    public Canvas field5163;

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5097;

    @OriginalMember(owner = "client!nv", name = "Od", descriptor = "I")
    private int field5276;

    @OriginalMember(owner = "client!nv", name = "yc", descriptor = "I")
    public int field5208;

    @OriginalMember(owner = "client!nv", name = "yd", descriptor = "I")
    private int field5260;

    @OriginalMember(owner = "client!nv", name = "Hb", descriptor = "I")
    public int field5165;

    @OriginalMember(owner = "client!nv", name = "ze", descriptor = "I")
    public int field5313;

    @OriginalMember(owner = "client!nv", name = "Ve", descriptor = "Ltr;")
    private class265 field5335;

    @OriginalMember(owner = "client!nv", name = "bc", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field5185;

    @OriginalMember(owner = "client!nv", name = "fd", descriptor = "F")
    public static float field5241;

    @OriginalMember(owner = "client!nv", name = "je", descriptor = "F")
    public float field5297;

    @OriginalMember(owner = "client!nv", name = "pe", descriptor = "F")
    public float field5303;

    @OriginalMember(owner = "client!nv", name = "De", descriptor = "F")
    public float field5317;

    @OriginalMember(owner = "client!nv", name = "We", descriptor = "F")
    public float field5336;

    @OriginalMember(owner = "client!nv", name = "bf", descriptor = "F")
    private float field5341;

    @OriginalMember(owner = "client!nv", name = "jf", descriptor = "F")
    private float field5348;

    @OriginalMember(owner = "client!nv", name = "Mf", descriptor = "F")
    public float field5377;

    @OriginalMember(owner = "client!nv", name = "Rf", descriptor = "F")
    public float field5382;

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!nv", name = "y", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!nv", name = "A", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!nv", name = "B", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!nv", name = "C", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!nv", name = "D", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!nv", name = "E", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!nv", name = "F", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!nv", name = "G", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!nv", name = "H", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!nv", name = "J", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!nv", name = "K", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!nv", name = "L", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!nv", name = "M", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!nv", name = "N", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!nv", name = "O", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!nv", name = "P", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!nv", name = "Q", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!nv", name = "R", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!nv", name = "S", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!nv", name = "T", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!nv", name = "U", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!nv", name = "V", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!nv", name = "W", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!nv", name = "X", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!nv", name = "Y", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!nv", name = "Z", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!nv", name = "ab", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!nv", name = "bb", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!nv", name = "cb", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!nv", name = "db", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!nv", name = "eb", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!nv", name = "fb", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!nv", name = "gb", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!nv", name = "hb", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!nv", name = "ib", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!nv", name = "jb", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!nv", name = "kb", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!nv", name = "lb", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!nv", name = "mb", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!nv", name = "nb", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!nv", name = "ob", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!nv", name = "pb", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!nv", name = "qb", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!nv", name = "rb", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!nv", name = "sb", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!nv", name = "tb", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!nv", name = "ub", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!nv", name = "vb", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!nv", name = "wb", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!nv", name = "xb", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!nv", name = "yb", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!nv", name = "zb", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!nv", name = "Ab", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!nv", name = "Cb", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!nv", name = "Eb", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!nv", name = "Gb", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!nv", name = "Ib", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!nv", name = "Jb", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!nv", name = "Kb", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!nv", name = "Lb", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!nv", name = "Mb", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!nv", name = "Nb", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!nv", name = "Ob", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!nv", name = "Pb", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!nv", name = "Qb", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!nv", name = "Rb", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!nv", name = "Sb", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!nv", name = "Tb", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!nv", name = "Vb", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!nv", name = "Wb", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!nv", name = "Xb", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!nv", name = "Yb", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!nv", name = "Zb", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!nv", name = "ac", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!nv", name = "cc", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!nv", name = "dc", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!nv", name = "ec", descriptor = "I")
    public static int field5188;

    @OriginalMember(owner = "client!nv", name = "fc", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!nv", name = "gc", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!nv", name = "hc", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!nv", name = "ic", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!nv", name = "jc", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!nv", name = "kc", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!nv", name = "lc", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!nv", name = "mc", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!nv", name = "nc", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!nv", name = "oc", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!nv", name = "pc", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!nv", name = "qc", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!nv", name = "rc", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!nv", name = "sc", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!nv", name = "uc", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!nv", name = "vc", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!nv", name = "wc", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!nv", name = "xc", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!nv", name = "zc", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!nv", name = "Ac", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!nv", name = "Bc", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!nv", name = "Cc", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!nv", name = "Dc", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!nv", name = "Ec", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!nv", name = "Fc", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!nv", name = "Gc", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!nv", name = "Ic", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!nv", name = "Jc", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!nv", name = "Kc", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!nv", name = "Lc", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!nv", name = "Mc", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!nv", name = "Nc", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!nv", name = "Oc", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!nv", name = "Pc", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!nv", name = "Qc", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!nv", name = "Rc", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!nv", name = "Sc", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!nv", name = "Tc", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!nv", name = "Uc", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!nv", name = "Vc", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!nv", name = "Wc", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!nv", name = "Xc", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!nv", name = "Yc", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!nv", name = "Zc", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!nv", name = "ad", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!nv", name = "bd", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!nv", name = "cd", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!nv", name = "dd", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!nv", name = "ed", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!nv", name = "gd", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!nv", name = "id", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!nv", name = "jd", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!nv", name = "kd", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!nv", name = "ld", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!nv", name = "nd", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!nv", name = "od", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!nv", name = "pd", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!nv", name = "qd", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!nv", name = "rd", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!nv", name = "sd", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!nv", name = "td", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!nv", name = "ud", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!nv", name = "vd", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!nv", name = "wd", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!nv", name = "xd", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!nv", name = "zd", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!nv", name = "Ad", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!nv", name = "Bd", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!nv", name = "Cd", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!nv", name = "Dd", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!nv", name = "Fd", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!nv", name = "Gd", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!nv", name = "Hd", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!nv", name = "Id", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!nv", name = "Jd", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!nv", name = "Kd", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!nv", name = "Ld", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!nv", name = "Md", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!nv", name = "Nd", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!nv", name = "Pd", descriptor = "I")
    public int field5277;

    @OriginalMember(owner = "client!nv", name = "Rd", descriptor = "I")
    public int field5279;

    @OriginalMember(owner = "client!nv", name = "Td", descriptor = "I")
    public int field5281;

    @OriginalMember(owner = "client!nv", name = "be", descriptor = "I")
    private int field5289;

    @OriginalMember(owner = "client!nv", name = "ce", descriptor = "I")
    public int field5290;

    @OriginalMember(owner = "client!nv", name = "te", descriptor = "I")
    public int field5307;

    @OriginalMember(owner = "client!nv", name = "Oe", descriptor = "I")
    public int field5328;

    @OriginalMember(owner = "client!nv", name = "Ye", descriptor = "I")
    public int field5338;

    @OriginalMember(owner = "client!nv", name = "Ze", descriptor = "I")
    public int field5339;

    @OriginalMember(owner = "client!nv", name = "ff", descriptor = "I")
    public int field5345;

    @OriginalMember(owner = "client!nv", name = "nf", descriptor = "I")
    public int field5352;

    @OriginalMember(owner = "client!nv", name = "xf", descriptor = "I")
    public int field5362;

    @OriginalMember(owner = "client!nv", name = "If", descriptor = "I")
    private int field5373;

    @OriginalMember(owner = "client!nv", name = "rg", descriptor = "I")
    private int field5408;

    @OriginalMember(owner = "client!nv", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!nv", name = "re", descriptor = "Lrga;")
    public class218 field5305;

    @OriginalMember(owner = "client!nv", name = "ef", descriptor = "Lsb;")
    private class263 field5344;

    @OriginalMember(owner = "client!nv", name = "Yf", descriptor = "Lvc;")
    private class288 field5389;

    @OriginalMember(owner = "client!nv", name = "hg", descriptor = "Lvc;")
    private class288 field5398;

    @OriginalMember(owner = "client!nv", name = "mf", descriptor = "Ltc;")
    private class321 field5351;

    @OriginalMember(owner = "client!nv", name = "Ed", descriptor = "Lst;")
    public class398 field5266;

    @OriginalMember(owner = "client!nv", name = "bg", descriptor = "Ljea;")
    private class415 field5392;

    @OriginalMember(owner = "client!nv", name = "Xf", descriptor = "Lsi;")
    public class520 field5388;

    @OriginalMember(owner = "client!nv", name = "Zf", descriptor = "Lsi;")
    private class520 field5390;

    @OriginalMember(owner = "client!nv", name = "ag", descriptor = "Lsi;")
    public class520 field5391;

    @OriginalMember(owner = "client!nv", name = "fg", descriptor = "Lsi;")
    private class520 field5396;

    @OriginalMember(owner = "client!nv", name = "mg", descriptor = "Lsi;")
    public class520 field5403;

    @OriginalMember(owner = "client!nv", name = "ng", descriptor = "Lsi;")
    public class520 field5404;

    @OriginalMember(owner = "client!nv", name = "cg", descriptor = "Lpea;")
    public class676 field5393;

    @OriginalMember(owner = "client!nv", name = "dg", descriptor = "Lpea;")
    public class676 field5394;

    @OriginalMember(owner = "client!nv", name = "eg", descriptor = "Lpea;")
    public class676 field5395;

    @OriginalMember(owner = "client!nv", name = "gg", descriptor = "Lpea;")
    public class676 field5397;

    @OriginalMember(owner = "client!nv", name = "ig", descriptor = "Lpea;")
    public class676 field5399;

    @OriginalMember(owner = "client!nv", name = "jg", descriptor = "Lpea;")
    public class676 field5400;

    @OriginalMember(owner = "client!nv", name = "kg", descriptor = "Lpea;")
    public class676 field5401;

    @OriginalMember(owner = "client!nv", name = "lg", descriptor = "Lpea;")
    public class676 field5402;

    @OriginalMember(owner = "client!nv", name = "og", descriptor = "Lpea;")
    public class676 field5405;

    @OriginalMember(owner = "client!nv", name = "qg", descriptor = "Lpea;")
    public class676 field5407;

    @OriginalMember(owner = "client!nv", name = "sf", descriptor = "Lcc;")
    private class681 field5357;

    @OriginalMember(owner = "client!nv", name = "Db", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field5161;

    @OriginalMember(owner = "client!nv", name = "Bb", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field5159;

    @OriginalMember(owner = "client!nv", name = "Ub", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field5178;

    @OriginalMember(owner = "client!nv", name = "de", descriptor = "Z")
    public boolean field5291;

    @OriginalMember(owner = "client!nv", name = "oe", descriptor = "Z")
    public boolean field5302;

    @OriginalMember(owner = "client!nv", name = "af", descriptor = "Z")
    public boolean field5340;

    @OriginalMember(owner = "client!nv", name = "Hf", descriptor = "Z")
    public boolean field5372;

    @OriginalMember(owner = "client!nv", name = "Pf", descriptor = "Z")
    public boolean field5380;

    @OriginalMember(owner = "client!nv", name = "sg", descriptor = "Z")
    public boolean field5409;

    @OriginalMember(owner = "client!nv", name = "Zd", descriptor = "[Ltw;")
    public class186[] field5287;

    @OriginalMember(owner = "client!nv", name = "le", descriptor = "[Lrga;")
    private class218[] field5299;

    @OriginalMember(owner = "client!nv", name = "ae", descriptor = "[Lcaa;")
    public class274[] field5288;

    @OriginalMember(owner = "client!nv", name = "Df", descriptor = "[Ltb;")
    public class365[] field5368;

    @OriginalMember(owner = "client!nv", name = "Je", descriptor = "[Lgi;")
    public class631[] field5323;

    @OriginalMember(owner = "client!nv", name = "Sf", descriptor = "[Lgi;")
    public class631[] field5383;

    @OriginalMember(owner = "client!nv", name = "md", descriptor = "[Lf;")
    public static class702[] field5248;

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "(I)V")
    private final void method2194(int arg0) {
        ++field5240;
        if (!this.field5386) {
            float[] var2 = this.field5292;
            float var3 = (float) this.field5367;
            float var4 = (float) this.field5347;
            float var5 = (float) (-this.field5364) * this.field5359 / (float) this.field5311;
            float var6 = (float) (-this.field5365) * this.field5359 / (float) this.field5366;
            float var7 = (float) (-this.field5365 + this.field5208) * this.field5359 / (float) this.field5366;
            float var8 = (float) (-this.field5364 + this.field5165) * this.field5359 / (float) this.field5311;
            if (var6 != var7 && var5 != var8) {
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[9] = 0.0F;
                var2[6] = 0.0F;
                var2[12] = (var6 + var7) / (-var7 + var6);
                var2[10] = 1.0F / (var3 - var4);
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[5] = 2.0F / (-var5 + var8);
                var2[8] = 0.0F;
                var2[3] = 0.0F;
                var2[14] = var3 / (-var4 + var3);
                var2[13] = (var5 + var8) / (-var5 + var8);
                var2[15] = 1.0F;
                var2[11] = 0.0F;
                var2[0] = 2.0F / (-var6 + var7);
            } else {
                var2[15] = 1.0F;
                var2[13] = 0.0F;
                var2[5] = 1.0F;
                var2[11] = 0.0F;
                var2[7] = 0.0F;
                var2[8] = 0.0F;
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[10] = 1.0F;
                var2[12] = 0.0F;
                var2[0] = 1.0F;
                var2[4] = 0.0F;
                var2[9] = 0.0F;
                var2[6] = 0.0F;
                var2[3] = 0.0F;
                var2[14] = 0.0F;
            }
            this.method2229((byte) 127);
            this.field5386 = true;
        }
        if (arg0 != -20852) {
            this.method126(-76, 73, 38, -127, 88, 105, (byte[]) null, 40, -112);
        }
    }

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "(I)V")
    public abstract void method1066(int arg0);

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "(I)V")
    private final void method2195(int arg0) {
        this.method1023(52);
        ++field5133;
        if (arg0 > -67) {
            this.field5333 = 0.47325757F;
        }
        if (this.field5357 != null) {
            this.field5357.method749(89);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BB)V")
    public final void method2196(byte arg0, byte arg1) {
        this.method2233(false, arg1 | arg1 << 16 | arg1 << 24 | arg1 << 8);
        ++field5139;
        if (arg0 < 115) {
            this.field5350 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "(I)V")
    public abstract void method1026(int arg0);

    @OriginalMember(owner = "client!nv", name = "pa", descriptor = "(III)V")
    public final void method131(int arg0, int arg1, int arg2) {
        ++field5149;
        if (~this.field5309 != ~arg0 || ~this.field5308 != ~arg1 || ~this.field5360 != ~arg2) {
            this.field5360 = arg2;
            this.field5309 = arg0;
            this.field5308 = arg1;
            this.method2257(3);
            this.method1037(-127);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "([IIIII)Lf;")
    public final class702 method175(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5111;
        return new class479(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
    public abstract void method1022(byte arg0);

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(IIIII)V")
    public final void method181(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5126;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)Lhea;")
    public final class388 method2197(byte arg0) {
        if (arg0 >= -39) {
            this.field5289 = 80;
        }
        ++field5269;
        return this.field5351 != null ? this.field5351.method1926((byte) 87) : null;
    }

    @OriginalMember(owner = "client!nv", name = "O", descriptor = "(IIIIII)Z")
    public final boolean method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5151;
        float var7 = this.field5282.method1700((float) arg1, (float) arg2, -122, (float) arg0);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field5282.method1700((float) arg4, (float) arg5, -95, (float) arg3);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field5367 > var7) || !((float) this.field5367 > var8)) && (!(var7 > (float) this.field5347) || !((float) this.field5347 < var8))) {
            int var9 = (int) ((float) this.field5366 * this.field5282.method1713(false, (float) arg0, (float) arg1, (float) arg2) / var7);
            int var10 = (int) ((float) this.field5366 * this.field5282.method1713(false, (float) arg3, (float) arg4, (float) arg5) / var8);
            if ((float) var9 < this.field5297 && this.field5297 > (float) var10 || this.field5303 < (float) var9 && this.field5303 < (float) var10) {
                return false;
            } else {
                int var11 = (int) ((float) this.field5311 * this.field5282.method1707((float) arg0, (float) arg1, (float) arg2, -29789) / var7);
                int var12 = (int) ((float) this.field5311 * this.field5282.method1707((float) arg3, (float) arg4, (float) arg5, -29789) / var8);
                return (!(this.field5382 > (float) var11) || !(this.field5382 > (float) var12)) && (!(this.field5317 < (float) var11) || !(this.field5317 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
    public abstract void method1043(Object arg0, Canvas arg1, byte arg2);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lpn;IZIZ[F)Lcm;")
    public final class679 method2198(class692 arg0, int arg1, boolean arg2, int arg3, boolean arg4, float[] arg5) {
        ++field5199;
        if (!arg4) {
            this.method105(1.1371963F);
        }
        return this.method1058(arg1, arg2, arg3, arg5, 9, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I[Ltw;)V")
    public final void method183(int arg0, class186[] arg1) {
        ++field5189;
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field5287[var3] = arg1[var3];
        }
        this.field5345 = arg0;
        if (this.field5327.method2788((byte) 95)) {
            this.method1047(-87);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lgi;ILgi;)V")
    public final void method2199(class631 arg0, int arg1, class631 arg2) {
        ++field5150;
        boolean var4 = false;
        if (this.field5323[this.field5325] != arg0) {
            this.field5323[this.field5325] = arg0;
            this.method1060(arg1 + 10221);
            var4 = true;
        }
        if (arg1 != 9797) {
            this.method169();
        }
        if (this.field5383[this.field5325] != arg2) {
            this.field5383[this.field5325] = arg2;
            var4 = true;
            this.method1026(116);
        }
        if (var4) {
            this.field5289 &= -30;
        }
    }

    @OriginalMember(owner = "client!nv", name = "B", descriptor = "()Z")
    public final boolean method88() {
        ++field5225;
        return this.field5370[3].method751(true);
    }

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "(I)V")
    private final void method2200(int arg0) {
        ++field5213;
        if (arg0 != 1) {
            this.method127();
        }
        this.field5387 = false;
        if (class380.field5082 == this.field5327) {
            this.method2210(-30850);
            this.method2195(arg0 ^ -82);
        }
    }

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "(I)V")
    public abstract void method1027(int arg0);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BI)V")
    public final void method2201(byte arg0, int arg1) {
        if (~this.field5325 != ~arg1) {
            this.field5325 = arg1;
            this.method1066(16777215);
        }
        ++field5253;
        int var3 = -123 / ((77 - arg0) / 39);
    }

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "(I)V")
    public abstract void method1060(int arg0);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljg;Lpn;I)Z")
    public abstract boolean method1054(class309 arg0, class692 arg1, int arg2);

    @OriginalMember(owner = "client!nv", name = "da", descriptor = "(IIII)V")
    public final void method200(int arg0, int arg1, int arg2, int arg3) {
        ++field5162;
        if (~arg0 >= -1 && this.field5208 - 1 <= arg2 && ~arg1 >= -1 && ~(this.field5165 + -1) >= ~arg3) {
            this.method193();
        } else {
            this.field5331 = ~arg2 < ~this.field5208 ? 0 : arg2;
            this.field5322 = arg1 >= 0 ? arg1 : 0;
            this.field5318 = ~this.field5208 > ~arg3 ? 0 : arg3;
            this.field5381 = arg0 < 0 ? 0 : arg0;
            if (!this.field5409) {
                this.field5409 = true;
                this.method1036((byte) -119);
            }
            this.method1075((byte) 117);
            this.method2258(-7172);
        }
    }

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(I)V")
    public void method194(int arg0) {
        if (this.field5335 != null) {
            this.field5335.method1615(24223);
        }
        ++field5234;
        this.field5307 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "()V")
    public void method136() {
        if (!this.field5329) {
            for (class401 var1 = this.field5114.method1436(28964); var1 != null; var1 = this.field5114.method1443((byte) 6)) {
                ((class703) var1).method3939(0);
            }
            Enumeration var2 = this.field5178.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method1043(this.field5178.get(var3), var3, (byte) 58);
            }
            class5.method14((byte) -121, false, true);
            this.field5185.release();
            this.field5329 = true;
        }
        ++field5224;
    }

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "(I)V")
    public final void method173(int arg0) {
        ++field5110;
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(Z)V")
    public final void method2202(boolean arg0) {
        ++field5215;
        this.method2266(class412.field5846, -42, 2);
        if (!arg0) {
            this.field5304 = true;
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(B)V")
    private final void method2203(byte arg0) {
        ++field5229;
        if (this.field5097 == null) {
            this.field5276 = this.field5260 = 1;
        } else {
            Dimension var2 = this.field5097.getSize();
            this.field5260 = var2.height;
            this.field5276 = var2.width;
        }
        this.field5208 = this.field5276;
        this.field5165 = this.field5260;
        this.method2200(1);
        this.method2213(9);
        this.method2243(-2);
        this.method1024((byte) 64);
        this.method2258(arg0 + -7147);
        if (arg0 != -25) {
            this.method1079(97, (class93) null, -30, 5);
        }
        this.method2228(false);
        this.method193();
    }

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "(I)V")
    public final void method2204(int arg0) {
        this.field5299 = new class218[this.field5352];
        this.field5383 = new class631[this.field5352];
        this.field5323 = new class631[this.field5352];
        ++field5250;
        this.field5288 = new class274[this.field5352];
        this.field5368 = new class365[this.field5352];
        if (arg0 >= -24) {
            this.method1060(101);
        }
        for (int var2 = 0; ~var2 > ~this.field5352; ++var2) {
            this.field5383[var2] = class334.field4505;
            this.field5323[var2] = class334.field4505;
            this.field5368[var2] = class635.field8783;
            this.field5288[var2] = new class274();
        }
        this.field5287 = new class186[this.field5338 + -2];
        this.field5305 = this.method1025((byte) 59, class129.field1851, 1, class309.field4271, 1);
        this.method111(new class703(262144));
        this.field5403 = this.method1033(new class553[] { new class553(new class103[] { class103.field1441, class103.field1447 }) }, (byte) -127);
        this.field5388 = this.method1033(new class553[] { new class553(new class103[] { class103.field1441, class103.field1445 }) }, (byte) -127);
        this.field5404 = this.method1033(new class553[] { new class553(class103.field1441), new class553(class103.field1445), new class553(class103.field1447), new class553(class103.field1442) }, (byte) -127);
        this.field5391 = this.method1033(new class553[] { new class553(class103.field1441), new class553(class103.field1445), new class553(class103.field1447) }, (byte) -127);
        this.field5393 = new class676(this, 0, 0, false, false);
        this.field5402 = new class676(this, 0, 0, true, true);
        this.field5394 = new class676(this, 0, 0, false, false);
        this.field5401 = new class676(this, 0, 0, true, true);
        this.field5399 = new class676(this, 0, 0, false, false);
        this.field5405 = new class676(this, 0, 0, true, true);
        this.field5397 = new class676(this, 0, 0, false, false);
        this.field5407 = new class676(this, 0, 0, true, true);
        this.field5400 = new class676(this, 0, 0, false, false);
        this.field5395 = new class676(this, 0, 0, true, true);
        this.field5344 = new class263(this);
        this.field5392 = this.method1062(true, 18554);
        this.method2211(true);
        this.field5266 = new class398(this);
        this.field5370[1] = this.method1041(128, 1);
        this.field5370[2] = this.method1041(128, 2);
        this.field5370[4] = this.method1041(128, 4);
        this.field5370[5] = this.method1041(128, 5);
        this.field5370[6] = this.method1041(128, 6);
        this.field5370[7] = this.method1041(128, 7);
        this.field5370[3] = this.method1041(128, 3);
        this.field5370[8] = this.method1041(128, 8);
        this.field5370[9] = this.method1041(128, 9);
        if (!this.field5370[2].method751(true)) {
            this.field5370[2] = this.method1041(128, 0);
        }
        if (!this.field5370[4].method751(true)) {
            this.field5370[4] = this.field5370[2];
        }
        if (!this.field5370[8].method751(true)) {
            this.field5370[8] = this.field5370[4];
        }
        if (!this.field5370[9].method751(true)) {
            this.field5370[9] = this.field5370[8];
        }
        this.method1055(1024);
        this.method193();
        this.method125();
    }

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "(I)V")
    private final void method2205(int arg0) {
        if (arg0 > 29) {
            if (!this.field5294) {
                float[] var2 = this.field5346;
                float var3 = (float) (-this.field5365 * this.field5367) / (float) this.field5366;
                float var4 = (float) ((-this.field5365 + this.field5208) * this.field5367) / (float) this.field5366;
                float var5 = (float) (this.field5367 * this.field5364) / (float) this.field5311;
                float var6 = (float) ((-this.field5165 + this.field5364) * this.field5367) / (float) this.field5311;
                if (var3 != var4 && var5 != var6) {
                    float var7 = (float) this.field5367 * 2.0F;
                    var2[1] = 0.0F;
                    var2[9] = (var5 + var6) / (-var6 + var5);
                    var2[14] = this.field5348 = (float) (this.field5367 * this.field5347) / (float) (this.field5367 - this.field5347);
                    var2[5] = var7 / (var5 - var6);
                    var2[13] = 0.0F;
                    var2[4] = 0.0F;
                    var2[3] = 0.0F;
                    var2[2] = 0.0F;
                    var2[12] = 0.0F;
                    var2[8] = (var3 + var4) / (-var3 + var4);
                    var2[15] = 0.0F;
                    var2[7] = 0.0F;
                    var2[0] = var7 / (var4 - var3);
                    var2[10] = this.field5341 = (float) this.field5347 / (float) (-this.field5347 + this.field5367);
                    var2[6] = 0.0F;
                    var2[11] = -1.0F;
                } else {
                    var2[6] = 0.0F;
                    var2[7] = 0.0F;
                    var2[1] = 0.0F;
                    var2[3] = 0.0F;
                    var2[4] = 0.0F;
                    var2[10] = 1.0F;
                    var2[8] = 0.0F;
                    var2[5] = 1.0F;
                    var2[15] = 1.0F;
                    var2[9] = 0.0F;
                    var2[13] = 0.0F;
                    var2[11] = 0.0F;
                    var2[14] = 0.0F;
                    var2[12] = 0.0F;
                    var2[0] = 1.0F;
                    var2[2] = 0.0F;
                }
                this.method2268(false);
                this.field5294 = true;
            }
            ++field5227;
        }
    }

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "()Z")
    public final boolean method130() {
        ++field5196;
        return this.field5302;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ldk;I)V")
    public final void method167(class472 arg0, int arg1) {
        ++field5153;
        this.field5344.method1605(arg1, arg0, -123, this);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z[IIII)Lcm;")
    public final class679 method2206(boolean arg0, int[] arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -12482) {
            this.method111((class493) null);
        }
        ++field5238;
        return this.method1063(arg0, arg1, arg3, 0, 0, arg2, arg4 ^ -12481);
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(Ljg;Lpn;I)Z")
    public abstract boolean method1070(class309 arg0, class692 arg1, int arg2);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILcaa;)V")
    public final void method2207(int arg0, class274 arg1) {
        if (arg0 == 128) {
            this.field5280.method675(arg1);
            ++field5193;
            this.field5278 = false;
            this.method2260(false);
        }
    }

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "(I)V")
    private final void method2208(int arg0) {
        ++field5100;
        int var2 = 73 % ((55 - arg0) / 34);
        this.method1057(30624);
        if (this.field5357 != null) {
            this.field5357.method745((byte) 104);
        }
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(B)V")
    public final void method2209(byte arg0) {
        ++field5145;
        if (~this.field5289 != -5) {
            this.method2226(-25);
            this.method2267(false, 2);
            this.method2250(-8, false);
            this.method2247(false, (byte) 116);
            this.method2254(false, (byte) -114);
            this.method2249(false, false, -2, 0);
            this.method2230(1, -37);
            this.method2246(0, 26770);
            this.field5289 = 4;
        }
        if (arg0 < 110) {
            this.field5342 = -63;
        }
    }

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "(I)V")
    private final void method2210(int arg0) {
        ++field5156;
        if (!this.field5387) {
            float[] var2 = this.field5326;
            this.field5387 = true;
            if (~this.field5208 != -1 && ~this.field5165 != -1) {
                var2[8] = 0.0F;
                var2[12] = -1.0F;
                var2[1] = 0.0F;
                var2[3] = 0.0F;
                var2[0] = 2.0F / (float) this.field5208;
                var2[15] = 1.0F;
                var2[9] = 0.0F;
                var2[4] = 0.0F;
                var2[13] = 1.0F;
                var2[5] = -2.0F / (float) this.field5165;
                var2[14] = 0.5F;
                var2[10] = 0.5F;
                var2[11] = 0.0F;
                var2[6] = 0.0F;
                var2[7] = 0.0F;
                var2[2] = 0.0F;
            } else {
                var2[10] = 1.0F;
                var2[2] = 0.0F;
                var2[14] = 0.0F;
                var2[8] = 0.0F;
                var2[9] = 0.0F;
                var2[3] = 0.0F;
                var2[12] = 0.0F;
                var2[6] = 0.0F;
                var2[11] = 0.0F;
                var2[4] = 0.0F;
                var2[5] = 1.0F;
                var2[1] = 0.0F;
                var2[0] = 1.0F;
                var2[13] = 0.0F;
                var2[7] = 0.0F;
                var2[15] = 1.0F;
            }
        }
        if (arg0 != -30850) {
            this.field5308 = -80;
        }
    }

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "(I)V")
    public abstract void method1072(int arg0);

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(Z)V")
    public final void method2211(boolean arg0) {
        if (!arg0) {
            this.method161(125, -72, 104, -74);
        }
        ++field5216;
        Hashtable var2 = new Hashtable();
        if (this.field5178 != null && !this.field5178.isEmpty()) {
            Enumeration var3 = this.field5178.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method1073(var4, 124));
            }
        }
        this.field5178 = var2;
        this.method2256(110);
        this.method2251(0);
        this.field5344.method1601(-64, this);
    }

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "(I)V")
    public abstract void method1030(int arg0);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZB)V")
    public final void method2212(boolean arg0, byte arg1) {
        if (this.field5374 != arg0) {
            this.field5374 = arg0;
            this.method1053(0);
        }
        ++field5226;
        if (arg1 != -72) {
            this.field5337 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "(I)V")
    private final void method2213(int arg0) {
        this.field5294 = false;
        ++field5246;
        this.method2205(arg0 + 41);
        if (class202.field2857 == this.field5327) {
            this.method2195(-105);
        }
        if (arg0 != 9) {
            this.field5307 = 103;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLpn;ILjg;I)Lcm;")
    public abstract class679 method1025(byte arg0, class692 arg1, int arg2, class309 arg3, int arg4);

    @OriginalMember(owner = "client!nv", name = "XA", descriptor = "(IIIII)V")
    public final void method118(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method113(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
        ++field5181;
    }

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(B)V")
    public abstract void method1075(byte arg0);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Le;)V")
    public final void method111(class493 arg0) {
        this.field5161 = ((class703) arg0).field9951;
        ++field5214;
        this.field5159 = this.field5161.method3474(32768, false);
    }

    @OriginalMember(owner = "client!nv", name = "IA", descriptor = "(IIIIII[BII)V")
    public final void method126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field5256;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLou;)V")
    public abstract void method1042(boolean arg0, class562 arg1);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public final class37 method195(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5237;
        return new class214(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "(I)Lcaa;")
    public final class274 method2214(int arg0) {
        ++field5249;
        if (arg0 > -89) {
            this.method2234(104);
        }
        return this.field5284;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public abstract Object method1073(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "(I)V")
    public void method1055(int arg0) {
        if (arg0 == 1024) {
            this.method2253((byte) -65);
            ++field5268;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZII)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method2215(boolean arg0, int arg1, int arg2) {
        ++field5244;
        if (arg2 != 0) {
            this.method1044(true, (byte) -9);
        }
        return this.field5161.method3474(arg1, arg0);
    }

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "(I)Le;")
    public final class493 method185(int arg0) {
        ++field5113;
        class703 var2 = new class703(arg0);
        this.field5114.method1441(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!nv", name = "y", descriptor = "(I)I")
    public final int method2216(int arg0) {
        if (arg0 != 128) {
            this.method2267(true, 61);
        }
        ++field5200;
        return this.field5325;
    }

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "(I)Lcaa;")
    public final class274 method2217(int arg0) {
        if (arg0 != 1) {
            this.field5276 = -26;
        }
        ++field5258;
        return this.field5288[this.field5325];
    }

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "(B)I")
    public final int method2218(byte arg0) {
        ++field5186;
        return arg0 != 104 ? -10 : this.field5373;
    }

    @OriginalMember(owner = "client!nv", name = "va", descriptor = "(I)V")
    public final void method139(int arg0) {
        ++field5231;
        this.field5300 = 0;
        while (~arg0 < -2) {
            ++this.field5300;
            arg0 >>= 1;
        }
        this.field5343 = 1 << this.field5300;
    }

    @OriginalMember(owner = "client!nv", name = "A", descriptor = "(I)V")
    public final void method2219(int arg0) {
        this.field5278 = false;
        if (arg0 == 0) {
            ++field5119;
            this.method2260(false);
        }
    }

    @OriginalMember(owner = "client!nv", name = "B", descriptor = "(I)V")
    public abstract void method1040(int arg0);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/lang/Object;ILjava/awt/Canvas;)V")
    public abstract void method1071(Object arg0, int arg1, Canvas arg2);

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "(B)V")
    public abstract void method1036(byte arg0);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZ)V")
    public final void method2220(int arg0, boolean arg1) {
        ++field5118;
        if (this.field5295 != arg1) {
            this.field5295 = arg1;
            this.method1049((byte) 27);
        }
        if (arg0 != 14) {
            this.field5333 = 0.09261852F;
        }
    }

    @OriginalMember(owner = "client!nv", name = "V", descriptor = "(IIII)V")
    public final void method123(int arg0, int arg1, int arg2, int arg3) {
        ++field5245;
        boolean var5 = false;
        if (~this.field5381 > ~arg0) {
            var5 = true;
            this.field5381 = arg0;
        }
        if (~arg2 > ~this.field5331) {
            this.field5331 = arg2;
            var5 = true;
        }
        if (this.field5322 < arg1) {
            this.field5322 = arg1;
            var5 = true;
        }
        if (~arg3 > ~this.field5318) {
            this.field5318 = arg3;
            var5 = true;
        }
        if (var5) {
            if (!this.field5409) {
                this.field5409 = true;
                this.method1036((byte) -124);
            }
            this.method1075((byte) 82);
            this.method2258(-7172);
        }
    }

    @OriginalMember(owner = "client!nv", name = "GA", descriptor = "(II)V")
    public final void method182(int arg0, int arg1) {
        if (this.field5367 != arg0 || this.field5347 != arg1) {
            this.field5347 = arg1;
            this.field5367 = arg0;
            this.method2213(9);
            this.method2243(-2);
            this.method2257(3);
        }
        ++field5236;
    }

    @OriginalMember(owner = "client!nv", name = "ra", descriptor = "(F)V")
    public final void method105(float arg0) {
        ++field5235;
        if (this.field5320 != arg0) {
            this.field5320 = arg0;
            this.field5185.setAmbient(arg0);
            this.method1032(1);
            this.method1076(10);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class702 method156(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5105;
        class479 var6 = new class479(this, arg2, arg3, arg4);
        var6.method936(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!nv", name = "C", descriptor = "(I)V")
    private final void method2221(int arg0) {
        ++field5259;
        if (this.field5289 != 1) {
            this.method2226(-25);
            this.method2267(false, 2);
            this.method2250(-8, false);
            this.method2247(false, (byte) 53);
            this.method2254(false, (byte) -119);
            this.method2249(false, false, -2, 0);
            this.method2246(1, 26770);
            this.method2241(this.field5305, (byte) 44);
            this.field5289 = 1;
        }
        if (arg0 != 17443) {
            this.field5344 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZI)V")
    public abstract void method1077(boolean arg0, int arg1);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(FFFFFFI)Z")
    private final boolean method2222(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6) {
        ++field5136;
        Buffer var8 = this.field5398.method1769(true, -16);
        if (var8 == null) {
            return false;
        } else if (arg6 != 0) {
            return true;
        } else {
            Stream var9 = this.method2238(var8, -128);
            if (!Stream.method3484()) {
                var9.method3478(arg1);
                var9.method3478(arg0);
                var9.method3478(arg3);
                var9.method3478(arg2);
                var9.method3478(arg5);
                var9.method3478(arg4);
            } else {
                var9.method3486(arg1);
                var9.method3486(arg0);
                var9.method3486(arg3);
                var9.method3486(arg2);
                var9.method3486(arg5);
                var9.method3486(arg4);
            }
            var9.method3477();
            return this.field5398.method1771(104);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILhw;B)V")
    public final void method2223(int arg0, class115 arg1, byte arg2) {
        ++field5272;
        this.method1051(arg1, arg0, -104, false);
        if (arg2 >= -1) {
            this.field5332 = 0.930761F;
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "()I")
    public final int method169() {
        ++field5135;
        return this.field5279 + this.field5277 + this.field5281;
    }

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "(B)Lcaa;")
    public final class274 method2224(byte arg0) {
        ++field5232;
        if (arg0 != 99) {
            this.method2208(-82);
        }
        return this.field5280;
    }

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(Z)I")
    public final int method2225(boolean arg0) {
        ++field5170;
        if (arg0) {
            this.field5288 = null;
        }
        return this.field5330;
    }

    @OriginalMember(owner = "client!nv", name = "D", descriptor = "(I)V")
    public abstract void method1023(int arg0);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)I")
    public final int method114(int arg0, int arg1) {
        ++field5210;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "()Z")
    public final boolean method201() {
        ++field5120;
        return true;
    }

    @OriginalMember(owner = "client!nv", name = "E", descriptor = "(I)V")
    private final void method2226(int arg0) {
        ++field5201;
        if (arg0 == -25) {
            if (class380.field5082 != this.field5327) {
                class494 var2 = this.field5327;
                this.field5327 = class380.field5082;
                if (var2.method2788((byte) 95)) {
                    this.method2269(0);
                }
                this.method2210(arg0 ^ 30873);
                this.field5314 = this.field5326;
                this.method2195(-96);
                this.field5289 &= -25;
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLpn;IZII[BI)Lcm;")
    public abstract class679 method1059(byte arg0, class692 arg1, int arg2, boolean arg3, int arg4, int arg5, byte[] arg6, int arg7);

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "()Z")
    public final boolean method127() {
        ++field5140;
        return true;
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lfa;Lsea;II)V")
    public class382(Canvas arg0, Object arg1, class212 arg2, class648 arg3, int arg4, int arg5) {
        super(arg2);
        this.field5334 = arg4;
        this.field5203 = arg3;
        this.field5217 = this.field5243 = arg1;
        this.field5097 = this.field5163 = arg0;
        Dimension var7 = arg0.getSize();
        this.field5208 = this.field5276 = var7.width;
        this.field5165 = this.field5260 = var7.height;
        this.field5313 = arg5;
        class581.method3314(true, false, 112);
        if (super.field2418 != null) {
            this.field5335 = new class265(this, super.field2418);
            this.field5185 = new NativeInterface(super.field2418.method1368(-26565), this.field5313);
            for (int var8 = 0; ~var8 > ~super.field2418.method1368(-26565); ++var8) {
                class686 var9 = super.field2418.method1365(-17951, var8);
                if (var9 != null) {
                    this.field5185.initTextureMetrics(var8, var9.field9791, var9.field9783);
                }
            }
        } else {
            this.field5185 = new NativeInterface(0, this.field5313);
            this.field5335 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ltb;B)V")
    public final void method2227(class365 arg0, byte arg1) {
        if (arg1 <= -94) {
            this.field5368[this.field5325] = arg0;
            ++field5144;
            this.method2208(-75);
        }
    }

    @OriginalMember(owner = "client!nv", name = "BA", descriptor = "()I")
    public final int method133() {
        ++field5220;
        return this.field5367;
    }

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "(B)V")
    public abstract void method1049(byte arg0);

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "(Z)V")
    public final void method2228(boolean arg0) {
        if (!arg0) {
            ++field5197;
            if (class532.field7194 != this.field5327) {
                class494 var2 = this.field5327;
                this.field5327 = class532.field7194;
                if (var2.method2788((byte) 95)) {
                    this.method2269(0);
                }
                this.field5314 = this.field5301;
                this.field5289 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "(B)V")
    private final void method2229(byte arg0) {
        this.field5375 = (float) this.field5347;
        if (arg0 <= 22) {
            this.method2261(92);
        }
        ++field5121;
    }

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "()V")
    public final void method135() {
        if (this.field5335 != null) {
            this.field5335.method1616(true);
        }
        ++field5211;
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(II)V")
    public final void method2230(int arg0, int arg1) {
        if (arg1 >= -3) {
            this.method187(95);
        }
        ++field5264;
        if (~this.field5306 != ~arg0) {
            boolean var3;
            class159 var4;
            boolean var5;
            if (arg0 == 1) {
                var3 = true;
                var4 = class571.field8103;
                var5 = true;
            } else if (~arg0 != -3) {
                if (arg0 != 128) {
                    var4 = class44.field539;
                    var3 = false;
                    var5 = false;
                } else {
                    var3 = true;
                    var4 = class4.field32;
                    var5 = true;
                }
            } else {
                var3 = true;
                var4 = class416.field5864;
                var5 = false;
            }
            if (this.field5354 != var5) {
                this.field5354 = var5;
                this.method1027(-75);
            }
            if (!var3 != !this.field5356) {
                this.field5356 = var3;
                this.method1064((byte) -117);
            }
            if (this.field5350 != var4) {
                this.field5350 = var4;
                this.method1039((byte) -26);
            }
            this.field5306 = arg0;
            this.field5289 &= -29;
        }
    }

    @OriginalMember(owner = "client!nv", name = "F", descriptor = "(I)V")
    public static void method2231(int arg0) {
        if (arg0 != 256) {
            field5241 = 1.125942F;
        }
        field5248 = null;
    }

    @OriginalMember(owner = "client!nv", name = "G", descriptor = "(I)V")
    public abstract void method1053(int arg0);

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "(B)V")
    private final void method2232(byte arg0) {
        ++field5254;
        this.method1021(this.field5398, (byte) 122, 0);
        this.method1050(0, this.field5396);
        this.method1079(0, class372.field5013, 1, 10);
        if (arg0 > -92) {
            this.method2237(-122);
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(ZI)V")
    public final void method2233(boolean arg0, int arg1) {
        ++field5117;
        if (!arg0) {
            if (this.field5362 != arg1) {
                this.field5362 = arg1;
                this.method1022((byte) -119);
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "y", descriptor = "()Z")
    public final boolean method178() {
        ++field5104;
        return false;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lqga;Z)Lf;")
    public final class702 method146(class168 arg0, boolean arg1) {
        ++field5137;
        class702 var9;
        if (arg0.field2445 != 0 && ~arg0.field2449 != -1) {
            int[] var3 = new int[arg0.field2449 * arg0.field2445];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field2447 != null) {
                for (int var6 = 0; ~arg0.field2449 < ~var6; ++var6) {
                    for (int var7 = 0; var7 < arg0.field2445; ++var7) {
                        var3[var5++] = class647.method3617(arg0.field2447[var4] << 24, arg0.field2442[class136.method950(255, arg0.field2450[var4])]);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; var8 < arg0.field2449; ++var8) {
                    for (int var10 = 0; ~arg0.field2445 < ~var10; ++var10) {
                        int var11 = arg0.field2442[arg0.field2450[var4++] & 255];
                        var3[var5++] = var11 != 0 ? class647.method3617(var11, -16777216) : 0;
                    }
                }
            }
            var9 = this.method175(var3, 0, arg0.field2445, arg0.field2445, arg0.field2449);
        } else {
            var9 = this.method175(new int[1], 0, 1, 1, 1);
        }
        var9.method1663(arg0.field2446, arg0.field2448, arg0.field2443, arg0.field2444);
        return var9;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lvn;[Lqga;Z)Lla;")
    public final class417 method129(class283 arg0, class168[] arg1, boolean arg2) {
        ++field5219;
        return new class312(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ldk;)V")
    public final void method163(class472 arg0) {
        this.field5344.method1605(-1, arg0, -114, this);
        ++field5273;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZI[FIIILpn;)Lcm;")
    public abstract class679 method1058(int arg0, boolean arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, class692 arg7);

    @OriginalMember(owner = "client!nv", name = "YA", descriptor = "(IIII)V")
    public final void method153(int arg0, int arg1, int arg2, int arg3) {
        ++field5148;
        if (!this.field5380) {
            throw new RuntimeException("");
        } else {
            this.field5321 = arg1;
            this.field5373 = arg0;
            this.field5342 = arg3;
            this.field5330 = arg2;
            if (this.field5298) {
                this.field5370[3].method743(556);
                this.field5370[3].method748(20060);
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "H", descriptor = "(I)V")
    public abstract void method1045(int arg0);

    @OriginalMember(owner = "client!nv", name = "la", descriptor = "(IIII)V")
    public final void method161(int arg0, int arg1, int arg2, int arg3) {
        this.field5365 = arg0;
        ++field5209;
        this.field5366 = arg2;
        this.field5364 = arg1;
        this.field5311 = arg3;
        this.method2243(-2);
        this.method2213(9);
        this.method2228(false);
        this.method2258(-7172);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5160;
    }

    @OriginalMember(owner = "client!nv", name = "I", descriptor = "(I)V")
    public final void method2234(int arg0) {
        ++field5157;
        if (arg0 <= -68) {
            if (this.field5368[this.field5325] != class635.field8783) {
                this.field5368[this.field5325] = class635.field8783;
                this.field5288[this.field5325].method679();
                this.method2208(-80);
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
    public abstract void method1031(Canvas arg0, byte arg1, Object arg2);

    @OriginalMember(owner = "client!nv", name = "J", descriptor = "(I)Lcaa;")
    public final class274 method2235(int arg0) {
        if (arg0 != 2) {
            this.field5407 = null;
        }
        ++field5147;
        return this.field5288[this.field5325];
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lpn;[BBIZI)Lcm;")
    public final class679 method2236(class692 arg0, byte[] arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        if (arg2 < 83) {
            return null;
        } else {
            ++field5221;
            return this.method1059((byte) 2, arg0, arg5, arg4, arg3, 0, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!nv", name = "MA", descriptor = "(III[I)V")
    public final void method154(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5152;
        float var5 = this.field5282.method1700((float) arg1, (float) arg2, -77, (float) arg0);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field5365;
            var7 = this.field5364;
        } else {
            var6 = (int) ((float) this.field5366 * this.field5282.method1713(false, (float) arg0, (float) arg1, (float) arg2) / var5);
            var7 = (int) ((float) this.field5311 * this.field5282.method1707((float) arg0, (float) arg1, (float) arg2, -29789) / var5);
        }
        arg3[1] = (int) ((float) var7 + -this.field5382);
        arg3[0] = (int) ((float) var6 - this.field5297);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!nv", name = "AA", descriptor = "(III[I)V")
    public final void method155(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5101;
        float var5 = this.field5282.method1700((float) arg1, (float) arg2, -112, (float) arg0);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field5365;
            var7 = this.field5364;
        } else {
            var6 = (int) ((float) this.field5366 * this.field5282.method1713(false, (float) arg0, (float) arg1, (float) arg2) / var5);
            var7 = (int) ((float) this.field5311 * this.field5282.method1707((float) arg0, (float) arg1, (float) arg2, -29789) / var5);
        }
        arg3[0] = (int) ((float) var6 + -this.field5297);
        arg3[1] = (int) ((float) var7 - this.field5382);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!nv", name = "K", descriptor = "(I)I")
    public final int method2237(int arg0) {
        if (arg0 <= 41) {
            return 87;
        } else {
            ++field5222;
            return this.field5342;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljaclib/memory/Buffer;I)Ljaclib/memory/Stream;")
    public final Stream method2238(Buffer arg0, int arg1) {
        this.field5337.method3488(arg0);
        ++field5206;
        return arg1 > -124 ? null : this.field5337;
    }

    @OriginalMember(owner = "client!nv", name = "L", descriptor = "()V")
    public final void method143() {
        this.field5380 = false;
        ++field5212;
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(II)Lcc;")
    public class681 method1041(int arg0, int arg1) {
        ++field5190;
        if (arg0 != 128) {
            this.field5310 = false;
        }
        if (arg1 != 6) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    return arg1 == 7 ? new class281(this) : new class276(this);
                } else {
                    return new class151(this, this.field5266);
                }
            } else {
                return new class169(this);
            }
        } else {
            return new class180(this);
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(ZI)Lvc;")
    public abstract class288 method1038(boolean arg0, int arg1);

    @OriginalMember(owner = "client!nv", name = "L", descriptor = "(I)I")
    public final int method2239(int arg0) {
        if (arg0 != 1441) {
            this.method2218((byte) -103);
        }
        ++field5174;
        return this.field5321;
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(IIIIII)V")
    public final void method113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5131;
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
        if (this.method2222((float) arg1, (float) arg0, (float) arg2 + var9, 0.0F, 0.0F, (float) arg3 + var8, 0)) {
            this.method2221(17443);
            this.method2233(false, arg4);
            this.method2264(9, class452.field6221, 0);
            this.method2223(0, class452.field6221, (byte) -82);
            this.method2230(arg5, -85);
            this.method2255(false);
            this.method1044(false, (byte) 35);
            this.method2232((byte) -118);
            this.method1044(true, (byte) 19);
            this.method2223(0, class262.field3553, (byte) -116);
            this.method2264(9, class262.field3553, 0);
        }
    }

    @OriginalMember(owner = "client!nv", name = "A", descriptor = "()Lq;")
    public final class392 method166() {
        ++field5176;
        return this.field5406;
    }

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "(Z)V")
    public abstract void method1069(boolean arg0);

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "()Z")
    public final boolean method109() {
        ++field5134;
        return false;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lq;)V")
    public final void method93(class392 arg0) {
        this.field5282 = (class274) arg0;
        ++field5252;
        this.field5284.method675(this.field5282);
        this.field5284.method1706(true);
        this.field5285.method1715((byte) -36, this.field5284);
        this.field5283.method1715((byte) -36, this.field5282);
        if (this.field5327.method2788((byte) 95)) {
            this.method2269(0);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "([FI)[F")
    public final float[] method2240(float[] arg0, int arg1) {
        arg0[4] = this.field5314[1];
        arg0[12] = this.field5314[3];
        arg0[0] = this.field5314[0];
        arg0[8] = this.field5314[2];
        ++field5195;
        arg0[9] = this.field5314[6];
        arg0[2] = this.field5314[arg1];
        arg0[5] = this.field5314[5];
        arg0[1] = this.field5314[4];
        arg0[13] = this.field5314[7];
        arg0[3] = this.field5314[12];
        arg0[14] = this.field5314[11];
        arg0[6] = this.field5314[9];
        arg0[10] = this.field5314[10];
        arg0[7] = this.field5314[13];
        arg0[11] = this.field5314[14];
        arg0[15] = this.field5314[15];
        return arg0;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lrga;B)V")
    public final void method2241(class218 arg0, byte arg1) {
        if (arg1 == 44) {
            ++field5261;
            if (this.field5299[this.field5325] != arg0) {
                this.field5299[this.field5325] = arg0;
                if (arg0 != null) {
                    arg0.method1271(false);
                } else {
                    this.method1045(-1);
                }
                this.field5289 &= -2;
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "M", descriptor = "(I)V")
    public final void method2242(int arg0) {
        ++field5103;
        if (arg0 != 29066) {
            this.field5360 = 9;
        }
        Enumeration var2 = this.field5178.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method1043(this.field5178.get(var3), var3, (byte) 108);
        }
        this.field5389.method1122(-1620);
        this.field5398.method1122(-1620);
        this.field5402.method3836((byte) 121);
        this.field5401.method3836((byte) 119);
        this.field5405.method3836((byte) 102);
        this.field5407.method3836((byte) 104);
        this.field5395.method3836((byte) 103);
        this.field5344.method1602(arg0 ^ -29175);
        this.field5392.method1122(-1620);
    }

    @OriginalMember(owner = "client!nv", name = "J", descriptor = "(IIIIII)V")
    public final void method110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5204;
        this.method2221(17443);
        this.method2233(false, arg4);
        this.method2264(9, class452.field6221, 0);
        this.method2223(0, class452.field6221, (byte) -61);
        this.method2230(arg5, -83);
        this.field5280.method1703((float) arg2, (float) arg3, 1.0F, 6);
        this.field5280.method687(arg0, arg1, 0);
        this.method2219(0);
        this.method1044(false, (byte) 65);
        this.method2202(true);
        this.method1044(true, (byte) 72);
        this.method2223(0, class262.field3553, (byte) -14);
        this.method2264(9, class262.field3553, 0);
    }

    @OriginalMember(owner = "client!nv", name = "N", descriptor = "(I)V")
    public abstract void method1076(int arg0);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lhw;IIZ)V")
    public abstract void method1051(class115 arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z[[III)Lhea;")
    public abstract class388 method1028(boolean arg0, int[][] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nv", name = "O", descriptor = "(I)V")
    private final void method2243(int arg0) {
        if (arg0 != -2) {
            this.field5359 = 0.38768047F;
        }
        this.field5386 = false;
        ++field5233;
        this.method2194(arg0 ^ 20850);
        if (class329.field4456 == this.field5327) {
            this.method2195(-86);
        }
    }

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "(B)V")
    public final void method2244(byte arg0) {
        this.method2228(false);
        int var2 = 70 % ((-72 - arg0) / 45);
        ++field5230;
        this.method2195(-110);
    }

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "()Z")
    public final boolean method107() {
        ++field5172;
        return true;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "([Lth;B)Lsi;")
    public abstract class520 method1033(class553[] arg0, byte arg1);

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "()Z")
    public final boolean method132() {
        ++field5184;
        return true;
    }

    @OriginalMember(owner = "client!nv", name = "P", descriptor = "(I)V")
    public final void method2245(int arg0) {
        ++field5205;
        if (arg0 < 90) {
            this.method127();
        }
        if (~this.field5289 != -9) {
            this.method2252(-100);
            this.method2267(true, 2);
            this.method2247(true, (byte) 99);
            this.method2254(true, (byte) -67);
            this.method2230(1, -76);
            this.field5289 = 8;
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(ZB)V")
    public abstract void method1044(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lwn;)V")
    public final void method128(class674 arg0) {
        ++field5187;
        this.field5351 = (class321) arg0;
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)V")
    public final void method191(int arg0) {
        ++field5182;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILsi;)V")
    public abstract void method1050(int arg0, class520 arg1);

    @OriginalMember(owner = "client!nv", name = "Q", descriptor = "(I)V")
    public abstract void method1037(int arg0);

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(II)V")
    public final void method2246(int arg0, int arg1) {
        ++field5274;
        if (arg0 == 1) {
            this.method2199(class276.field3814, 9797, class276.field3814);
        } else if (arg0 == 0) {
            this.method2199(class334.field4505, 9797, class334.field4505);
        } else if (arg0 == 2) {
            this.method2199(class127.field1821, 9797, class276.field3814);
        } else if (~arg0 != -4) {
            if (arg0 == 4) {
                this.method2199(class412.field5840, arg1 ^ 20183, class412.field5840);
            }
        } else {
            this.method2199(class335.field4510, 9797, class334.field4505);
        }
        if (arg1 != 26770) {
            this.field5293 = 32;
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(ZB)V")
    public final void method2247(boolean arg0, byte arg1) {
        ++field5247;
        if (!this.field5310 == arg0) {
            this.field5310 = arg0;
            this.method1072(87);
            this.field5289 &= -32;
        }
        if (arg1 < 51) {
            this.method2249(false, false, -64, 18);
        }
    }

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "(B)V")
    public abstract void method1039(byte arg0);

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(II)I")
    public final int method134(int arg0, int arg1) {
        ++field5192;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!nv", name = "R", descriptor = "(I)[F")
    public final float[] method2248(int arg0) {
        if (arg0 >= -76) {
            return null;
        } else {
            ++field5146;
            return this.field5301;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIII)V")
    public final void method141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5123;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Leg;IIIILjea;B)V")
    public abstract void method1065(class93 arg0, int arg1, int arg2, int arg3, int arg4, class415 arg5, byte arg6);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZZII)V")
    public final void method2249(boolean arg0, boolean arg1, int arg2, int arg3) {
        if (this.field5316 != arg2 || this.field5298 == !this.field5380) {
            class679 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field5380 ? 3 : 0;
            if (arg2 < 0) {
                this.method2234(arg3 + -121);
            } else {
                var5 = this.field5335.method1614(97, arg2);
                class686 var10 = super.field2418.method1365(arg3 ^ -17951, arg2);
                if (var10.field9785 == 0 && ~var10.field9787 == -1) {
                    this.method2234(-125);
                } else {
                    int var11 = var10.field9795 ? 64 : 128;
                    int var12 = var11 * 50;
                    class274 var13 = this.method2235(2);
                    var13.method1710(1, (float) (this.field5307 % var12 * var10.field9787) / (float) var12, 0.0F, (float) (this.field5307 % var12 * var10.field9785) / (float) var12);
                    this.method2227(class41.field482, (byte) -126);
                }
                var6 = var10.field9798;
                if (!this.field5380) {
                    var9 = var10.field9797;
                    var8 = var10.field9790;
                    var7 = var10.field9788;
                }
            }
            this.method2271(arg0, var7, var9, arg3 + 49, var8, arg1);
            if (this.field5357 == null) {
                this.method2241(var5, (byte) 44);
                this.method2246(var6, 26770);
            } else {
                this.field5357.method744(var6, var5, arg3 ^ -3);
            }
            this.field5298 = this.field5380;
            this.field5316 = arg2;
        }
        ++field5183;
        this.field5289 &= -8;
        if (arg3 != 0) {
            this.method130();
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)V")
    public final void method99(boolean arg0) {
        ++field5239;
    }

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "()Z")
    public final boolean method189() {
        ++field5130;
        return false;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "()I")
    public final int method203() {
        ++field5108;
        return this.field5338 + -2;
    }

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "()Z")
    public final boolean method87() {
        ++field5168;
        return true;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(IZ)V")
    public final void method2250(int arg0, boolean arg1) {
        if (arg0 == -8) {
            if (arg1 == !this.field5315) {
                this.field5315 = arg1;
                this.method1049((byte) 27);
                this.field5289 &= -8;
            }
            ++field5143;
        }
    }

    @OriginalMember(owner = "client!nv", name = "S", descriptor = "(I)V")
    private final void method2251(int arg0) {
        this.field5398 = this.method1038(true, 80);
        if (arg0 != 0) {
            this.field5355 = false;
        }
        ++field5166;
        this.field5398.method1768(24, -26595, 12);
        this.field5396 = this.method1033(new class553[] { new class553(class103.field1441) }, (byte) -127);
    }

    @OriginalMember(owner = "client!nv", name = "T", descriptor = "(I)V")
    private final void method2252(int arg0) {
        ++field5263;
        if (class202.field2857 != this.field5327) {
            class494 var2 = this.field5327;
            this.field5327 = class202.field2857;
            if (!var2.method2788((byte) 95)) {
                this.method2269(0);
            }
            this.method2205(127);
            this.field5314 = this.field5346;
            this.method2195(-115);
            this.field5289 &= -8;
        }
        if (arg0 >= -23) {
            this.field5291 = true;
        }
    }

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "(B)V")
    private final void method2253(byte arg0) {
        this.method1032(1);
        ++field5115;
        this.method1078(arg0 + -16704);
        this.method1049((byte) 27);
        this.method1047(-127);
        this.method1035(10);
        this.method1076(arg0 + 75);
        this.method1053(arg0 + 65);
        this.method1072(69);
        this.method1069(false);
        this.method1037(arg0 ^ 60);
        this.method1030(arg0 + 18978);
        this.method1064((byte) -69);
        this.method1039((byte) -26);
        this.method1027(-81);
        for (int var2 = this.field5352 + -1; ~var2 <= -1; --var2) {
            this.method2201((byte) -73, var2);
            this.method1060(20018);
            this.method1026(100);
            this.method2234(-105);
        }
        if (arg0 != -65) {
            this.field5324 = 0.5311668F;
        }
        this.method1022((byte) -125);
        this.method1024((byte) 64);
        this.method1023(42);
        this.method1040(arg0 + -1048);
        this.method1074((byte) 101);
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(ZB)V")
    public final void method2254(boolean arg0, byte arg1) {
        if (this.field5304 != arg0) {
            this.field5304 = arg0;
            this.method1069(false);
            this.field5289 &= -32;
        }
        if (arg1 >= -63) {
            this.method174((int[]) null);
        }
        ++field5207;
    }

    @OriginalMember(owner = "client!nv", name = "ZA", descriptor = "(Z)V")
    public final void method202(boolean arg0) {
        this.field5312 = arg0;
        ++field5242;
        this.method1069(false);
    }

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "()Z")
    public final boolean method94() {
        ++field5116;
        return true;
    }

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "(B)V")
    public abstract void method1064(byte arg0);

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method152(Canvas arg0) {
        ++field5141;
        if (this.field5163 == arg0) {
            throw new RuntimeException();
        } else if (this.field5178.containsKey(arg0)) {
            this.method1043(this.field5178.get(arg0), arg0, (byte) 82);
            this.field5178.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!nv", name = "U", descriptor = "(I)V")
    public abstract void method1035(int arg0);

    @OriginalMember(owner = "client!nv", name = "V", descriptor = "(I)V")
    public abstract void method1032(int arg0);

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "(Z)V")
    public final void method2255(boolean arg0) {
        this.field5280.method679();
        ++field5255;
        this.field5278 = true;
        this.method2260(arg0);
    }

    @OriginalMember(owner = "client!nv", name = "W", descriptor = "(I)V")
    public abstract void method1078(int arg0);

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "()Z")
    public final boolean method116() {
        ++field5109;
        return true;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZIZLhw;I)V")
    public abstract void method1052(boolean arg0, int arg1, boolean arg2, class115 arg3, int arg4);

    @OriginalMember(owner = "client!nv", name = "VA", descriptor = "(IFFFFF)V")
    public final void method117(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field5112;
        boolean var7 = ~this.field5384 != ~arg0;
        if (var7 || this.field5353 != arg1 || this.field5385 != arg2) {
            this.field5353 = arg1;
            this.field5384 = arg0;
            this.field5385 = arg2;
            if (var7) {
                this.field5332 = (float) (16711680 & this.field5384) / 1.671168E7F;
                this.field5324 = (float) (this.field5384 & 255) / 255.0F;
                this.field5358 = (float) (65280 & this.field5384) / 65280.0F;
                this.method1032(1);
            }
            this.field5185.setSunColour(this.field5332, this.field5358, this.field5324, arg1, arg2);
            this.method1078(-16769);
        }
        if (this.field5363[0] != arg3 || this.field5363[1] != arg4 || this.field5363[2] != arg5) {
            this.field5363[0] = arg3;
            this.field5363[1] = arg4;
            this.field5363[2] = arg5;
            this.field5378[1] = -arg4;
            this.field5378[0] = -arg3;
            this.field5378[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5349[0] = arg3 * var8;
            this.field5349[1] = arg4 * var8;
            this.field5349[2] = arg5 * var8;
            this.field5369[1] = -this.field5349[1];
            this.field5369[0] = -this.field5349[0];
            this.field5369[2] = -this.field5349[2];
            this.field5185.setSunDirection(this.field5349[0], this.field5349[1], this.field5349[2]);
            this.method1035(10);
            this.field5328 = (int) (arg3 * 256.0F / arg4);
            this.field5339 = (int) (arg5 * 256.0F / arg4);
        }
        this.method1076(10);
    }

    @OriginalMember(owner = "client!nv", name = "X", descriptor = "(I)F")
    public abstract float method1056(int arg0);

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(IIIIII)Lwn;")
    public final class674 method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5099;
        return new class462(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!nv", name = "Y", descriptor = "(I)V")
    private final void method2256(int arg0) {
        this.field5389 = this.method1038(false, -107);
        ++field5191;
        this.field5389.method1768(140, -26595, 28);
        int var2 = 24 % ((52 - arg0) / 57);
        for (int var3 = 0; var3 < 4; ++var3) {
            Buffer var4 = this.field5389.method1769(true, -48);
            if (var4 != null) {
                Stream var5 = this.method2238(var4, -127);
                if (!Stream.method3484()) {
                    var5.method3478(0.0F);
                    var5.method3478(0.0F);
                    var5.method3478(0.0F);
                    var5.method3478(0.0F);
                    var5.method3478(0.0F);
                    var5.method3478(0.0F);
                    var5.method3478(0.0F);
                    var5.method3478(0.0F);
                    var5.method3478(1.0F);
                    var5.method3478(0.0F);
                    var5.method3478(0.0F);
                    var5.method3478(1.0F);
                    var5.method3478(0.0F);
                    var5.method3478(1.0F);
                    var5.method3478(1.0F);
                    var5.method3478(1.0F);
                    var5.method3478(0.0F);
                    var5.method3478(1.0F);
                    var5.method3478(1.0F);
                    var5.method3478(1.0F);
                    var5.method3478(1.0F);
                    var5.method3478(1.0F);
                    var5.method3478(0.0F);
                    var5.method3478(0.0F);
                    var5.method3478(1.0F);
                    var5.method3478(0.0F);
                    var5.method3478(1.0F);
                    var5.method3478(0.0F);
                    var5.method3478(0.0F);
                    var5.method3478(0.0F);
                    var5.method3478(0.0F);
                    var5.method3478(0.0F);
                    var5.method3478(0.0F);
                    var5.method3478(0.0F);
                    var5.method3478(0.0F);
                } else {
                    var5.method3486(0.0F);
                    var5.method3486(0.0F);
                    var5.method3486(0.0F);
                    var5.method3486(0.0F);
                    var5.method3486(0.0F);
                    var5.method3486(0.0F);
                    var5.method3486(0.0F);
                    var5.method3486(0.0F);
                    var5.method3486(1.0F);
                    var5.method3486(0.0F);
                    var5.method3486(0.0F);
                    var5.method3486(1.0F);
                    var5.method3486(0.0F);
                    var5.method3486(1.0F);
                    var5.method3486(1.0F);
                    var5.method3486(1.0F);
                    var5.method3486(0.0F);
                    var5.method3486(1.0F);
                    var5.method3486(1.0F);
                    var5.method3486(1.0F);
                    var5.method3486(1.0F);
                    var5.method3486(1.0F);
                    var5.method3486(0.0F);
                    var5.method3486(0.0F);
                    var5.method3486(1.0F);
                    var5.method3486(0.0F);
                    var5.method3486(1.0F);
                    var5.method3486(0.0F);
                    var5.method3486(0.0F);
                    var5.method3486(0.0F);
                    var5.method3486(0.0F);
                    var5.method3486(0.0F);
                    var5.method3486(0.0F);
                    var5.method3486(0.0F);
                    var5.method3486(0.0F);
                }
                var5.method3477();
                if (this.field5389.method1771(109)) {
                    break;
                }
            }
        }
        this.field5390 = this.method1033(new class553[] { new class553(new class103[] { class103.field1441, class103.field1447, class103.field1447 }) }, (byte) -127);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIF)Ltw;")
    public final class186 method108(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field5169;
        return new class426(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II[I[I)Lua;")
    public final class618 method180(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field5167;
        return class549.method3084(arg2, 17998, this, arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!nv", name = "CA", descriptor = "(IIII)V")
    public final void method137(int arg0, int arg1, int arg2, int arg3) {
        ++field5228;
        this.field5380 = true;
        this.field5321 = arg1;
        this.field5373 = arg0;
        this.field5330 = arg2;
        this.field5342 = arg3;
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method197(Canvas arg0) {
        ++field5138;
        Object var2 = null;
        if (arg0 != null && this.field5163 != arg0) {
            if (this.field5178.containsKey(arg0)) {
                var2 = this.field5178.get(arg0);
            }
        } else {
            var2 = this.field5217;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method1071(var2, 11, arg0);
            if (this.field5097 == arg0) {
                this.method2203((byte) -25);
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIILua;II)V")
    public final void method199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class618 arg6, int arg7, int arg8) {
        ++field5202;
    }

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "(B)V")
    public abstract void method1024(byte arg0);

    @OriginalMember(owner = "client!nv", name = "U", descriptor = "()I")
    public final int method142() {
        ++field5173;
        return this.field5347;
    }

    @OriginalMember(owner = "client!nv", name = "Z", descriptor = "(I)V")
    public abstract void method1057(int arg0);

    @OriginalMember(owner = "client!nv", name = "T", descriptor = "()I")
    public final int method97() {
        ++field5177;
        return this.field5408;
    }

    @OriginalMember(owner = "client!nv", name = "ab", descriptor = "(I)V")
    private final void method2257(int arg0) {
        if (arg0 != 3) {
            this.method2262(29);
        }
        if (this.field5357 != null) {
            this.field5357.method748(arg0 + 20057);
        }
        ++field5223;
        this.method1030(18913);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lvc;BI)V")
    public abstract void method1021(class288 arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIZ)Lf;")
    public final class702 method170(int arg0, int arg1, boolean arg2) {
        ++field5251;
        return new class479(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILeg;II)V")
    public abstract void method1079(int arg0, class93 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method86(Canvas arg0) {
        this.field5217 = null;
        this.field5097 = null;
        ++field5164;
        if (arg0 != null && this.field5163 != arg0) {
            if (this.field5178.containsKey(arg0)) {
                this.field5217 = this.field5178.get(arg0);
                this.field5097 = arg0;
            }
        } else {
            this.field5097 = this.field5163;
            this.field5217 = this.field5243;
        }
        if (this.field5097 != null && this.field5217 != null) {
            this.method1031(this.field5097, (byte) 36, this.field5217);
            this.method2203((byte) -25);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method204(Canvas arg0) {
        ++field5271;
        if (this.field5163 == arg0) {
            throw new RuntimeException();
        } else if (!this.field5178.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method1073(arg0, 112);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field5178.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nv", name = "bb", descriptor = "(I)V")
    private final void method2258(int arg0) {
        this.field5382 = (float) (-this.field5364 + this.field5322);
        if (arg0 == -7172) {
            this.field5303 = (float) (-this.field5365 + this.field5331);
            ++field5265;
            this.field5317 = (float) (this.field5318 - this.field5364);
            this.field5297 = (float) (-this.field5365 + this.field5381);
        }
    }

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "(B)V")
    public abstract void method1074(byte arg0);

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "(I)V")
    public final void method187(int arg0) {
        ++field5179;
        if (~arg0 <= -129 && arg0 <= 1024) {
            if (this.field5335 != null) {
                this.field5335.method1616(true);
            }
            this.field5379 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nv", name = "cb", descriptor = "(I)V")
    public final void method2259(int arg0) {
        ++field5194;
        if (~this.field5289 != arg0) {
            this.method2262(-8);
            this.method2267(true, 2);
            this.method2247(true, (byte) 100);
            this.method2254(true, (byte) -121);
            this.method2230(1, -34);
            this.field5289 = 16;
        }
    }

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "(Z)V")
    private final void method2260(boolean arg0) {
        ++field5125;
        if (class380.field5082 == this.field5327) {
            float var2 = this.method1056(0);
            this.field5280.method1716(var2, (byte) -7, 0.0F, var2);
        }
        this.field5319 = arg0;
        this.method1040(-1113);
        if (this.field5357 != null) {
            this.field5357.method750((byte) -8);
        }
    }

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "()Lq;")
    public final class392 method168() {
        ++field5154;
        return new class274();
    }

    @OriginalMember(owner = "client!nv", name = "db", descriptor = "(I)Lcaa;")
    public final class274 method2261(int arg0) {
        if (arg0 != 1024) {
            return null;
        } else {
            ++field5262;
            return this.field5285;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lnba;IIII)Lda;")
    public final class55 method106(class270 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5267;
        return new class676(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!nv", name = "oa", descriptor = "([I)V")
    public final void method174(int[] arg0) {
        arg0[3] = this.field5318;
        arg0[0] = this.field5381;
        arg0[1] = this.field5322;
        arg0[2] = this.field5331;
        ++field5218;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II[BILpn;I)Ltea;")
    public abstract class217 method1061(int arg0, int arg1, byte[] arg2, int arg3, class692 arg4, int arg5);

    @OriginalMember(owner = "client!nv", name = "eb", descriptor = "(I)V")
    private final void method2262(int arg0) {
        if (arg0 != -8) {
            this.method2254(true, (byte) 65);
        }
        ++field5158;
        if (class329.field4456 != this.field5327) {
            class494 var2 = this.field5327;
            this.field5327 = class329.field4456;
            if (!var2.method2788((byte) 95)) {
                this.method2269(0);
            }
            this.method2194(-20852);
            this.field5314 = this.field5292;
            this.method2195(-97);
            this.field5289 &= -8;
        }
    }

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "(II)Ljea;")
    public final class415 method2263(int arg0, int arg1) {
        if (~(arg0 * arg1) < ~this.field5392.method905(true)) {
            this.field5392.method1116(arg0, -10);
        }
        ++field5180;
        return this.field5392;
    }

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "()[I")
    public final int[] method124() {
        ++field5102;
        return new int[] { this.field5365, this.field5364, this.field5366, this.field5311 };
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILhw;I)V")
    public final void method2264(int arg0, class115 arg1, int arg2) {
        if (arg0 == 9) {
            this.method1052(false, arg2, false, arg1, 109);
            ++field5098;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(FI)V")
    public final void method2265(float arg0, int arg1) {
        if (arg1 != 12) {
            this.method1049((byte) -88);
        }
        if (this.field5359 != arg0) {
            this.field5359 = arg0;
            this.method2243(-2);
        }
        ++field5129;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Leg;II)V")
    private final void method2266(class93 arg0, int arg1, int arg2) {
        ++field5171;
        this.method1021(this.field5389, (byte) 118, 0);
        if (arg1 > -7) {
            this.field5322 = -124;
        }
        this.method1050(0, this.field5390);
        this.method1079(0, arg0, arg2, 10);
    }

    @OriginalMember(owner = "client!nv", name = "JA", descriptor = "()V")
    public final void method193() {
        ++field5175;
        this.field5322 = 0;
        this.field5381 = 0;
        this.field5318 = this.field5165;
        this.field5331 = this.field5208;
        if (this.field5409) {
            this.field5409 = false;
            this.method1036((byte) -125);
        }
        this.method2258(-7172);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "([I)V")
    public final void method158(int[] arg0) {
        arg0[0] = this.field5208;
        arg0[1] = this.field5165;
        ++field5275;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIII)V")
    public final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5142;
        float var7 = this.method1056(0);
        this.method2221(17443);
        this.method2233(false, arg4);
        this.method2264(9, class452.field6221, 0);
        this.method2223(0, class452.field6221, (byte) -48);
        this.method2230(arg5, -68);
        this.field5280.method1703((float) (arg2 - 1), (float) (arg3 + -1), 1.0F, 6);
        this.field5280.method1716((float) arg1 - var7, (byte) -7, 0.0F, (float) arg0 - var7);
        this.method2219(0);
        this.method1044(false, (byte) 95);
        this.method2266(class628.field8698, -74, 4);
        this.method1044(true, (byte) 89);
        this.method2223(0, class262.field3553, (byte) -42);
        this.method2264(9, class262.field3553, 0);
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(ZI)V")
    public final void method2267(boolean arg0, int arg1) {
        if (arg1 != 2) {
            this.method107();
        }
        ++field5122;
        if (arg0 == !this.field5291) {
            this.field5291 = arg0;
            this.method1037(-128);
            this.field5289 &= -32;
        }
    }

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "(Z)V")
    private final void method2268(boolean arg0) {
        ++field5270;
        this.field5346[10] = this.field5341;
        this.field5346[14] = this.field5348;
        this.field5333 = (this.field5346[14] + (float) (-this.field5347)) / this.field5346[10];
        if (arg0) {
            this.method141(-75, -35, 18, 108, 12, -7, -102);
        }
    }

    @OriginalMember(owner = "client!nv", name = "FA", descriptor = "(ILua;II)V")
    public final void method112(int arg0, class618 arg1, int arg2, int arg3) {
        ++field5188;
        class525 var5 = (class525) arg1;
        class679 var6 = var5.field7121;
        this.method2272(0);
        this.method2241(var6, (byte) 44);
        this.method2230(1, -66);
        this.method2199(class276.field3814, 9797, class276.field3814);
        this.method2264(9, class452.field6221, 0);
        this.method2233(false, arg0);
        this.field5280.method1703((float) this.field5208, (float) this.field5165, 0.0F, 6);
        this.method2219(0);
        this.field5288[0].method1703(var6.method2135((byte) -84, (float) this.field5208), var6.method2138((byte) 123, (float) this.field5165), 1.0F, 6);
        this.field5288[0].method1716(var6.method2138((byte) 123, (float) (-arg3)), (byte) -7, 0.0F, var6.method2135((byte) -84, (float) (-arg2)));
        this.field5368[0] = class41.field482;
        this.method2208(127);
        this.method2202(true);
        this.method2234(-95);
        this.method2264(9, class262.field3553, 0);
    }

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(ZI)Ljea;")
    public abstract class415 method1062(boolean arg0, int arg1);

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)V")
    public final void method159(int arg0) {
        ++field5257;
    }

    @OriginalMember(owner = "client!nv", name = "fb", descriptor = "(I)V")
    private final void method2269(int arg0) {
        ++field5128;
        this.field5319 = false;
        if (this.field5357 != null) {
            this.field5357.method747(3914);
        }
        if (arg0 != 0) {
            this.method1077(false, -32);
        }
        this.method1074((byte) 101);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZZ)V")
    public final void method2270(boolean arg0, boolean arg1) {
        ++field5198;
        if (!arg1 == this.field5355) {
            this.field5355 = arg1;
            this.method1037(-126);
        }
        if (!arg0) {
            this.field5323 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZIIIIZ)V")
    private final void method2271(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = arg5 & this.method88();
        int var8 = -63 % ((arg3 - 8) / 41);
        ++field5127;
        if (!var7 && (arg2 == 4 || arg2 == 8 || ~arg2 == -10)) {
            arg2 = 2;
            arg4 = arg2 == 4 ? 1 & arg1 : 1;
            arg1 = 0;
        }
        if (~arg2 != -1 && arg0) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (~this.field5293 == ~arg2) {
            if (~this.field5293 != -1) {
                this.field5370[this.field5293 & Integer.MAX_VALUE].method739(arg0, 7);
                if (~this.field5371 != ~arg1 || this.field5296 != arg4) {
                    this.field5370[Integer.MAX_VALUE & this.field5293].method742(arg4, arg1, (byte) -94);
                    this.field5371 = arg1;
                    this.field5296 = arg4;
                }
                return;
            }
        } else {
            if (this.field5293 != 0) {
                this.field5370[this.field5293 & Integer.MAX_VALUE].method740(-3);
            }
            if (~arg2 != -1) {
                this.field5357 = this.field5370[arg2 & Integer.MAX_VALUE];
                this.field5357.method741(arg0, 3);
                this.field5357.method739(arg0, 7);
                this.field5357.method742(arg4, arg1, (byte) 0);
            } else {
                this.field5357 = null;
            }
            this.field5296 = arg4;
            this.field5371 = arg1;
            this.field5293 = arg2;
        }
    }

    @OriginalMember(owner = "client!nv", name = "gb", descriptor = "(I)V")
    public final void method2272(int arg0) {
        ++field5155;
        if (~this.field5289 != -3) {
            this.method2226(-25);
            this.method2267(false, 2);
            this.method2250(-8, false);
            this.method2247(false, (byte) 63);
            this.method2254(false, (byte) -114);
            this.method2249(false, false, -2, 0);
            this.field5289 = 2;
        }
        if (arg0 != 0) {
            this.method106((class270) null, -106, 5, 86, -9);
        }
    }

    @OriginalMember(owner = "client!nv", name = "hb", descriptor = "(I)V")
    public void method1047(int arg0) {
        ++field5132;
        this.field5290 = this.field5345;
        this.field5345 = 0;
        if (arg0 > -81) {
            this.method1072(67);
        }
    }

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "(IIIII)V")
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method113(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
        ++field5106;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z[IIIIII)Lcm;")
    public abstract class679 method1063(boolean arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!nv", name = "ib", descriptor = "(I)Lcaa;")
    public final class274 method2273(int arg0) {
        if (!this.field5319) {
            this.field5286.method1705(this.field5284, this.field5280);
            this.field5319 = true;
        }
        if (arg0 != 4) {
            this.field5217 = null;
        }
        ++field5107;
        return this.field5286;
    }

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "()Lq;")
    public final class392 method144() {
        ++field5124;
        return this.field5282;
    }
}
