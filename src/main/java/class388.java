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

@OriginalClass("client!wr")
public abstract class class388 extends class207 {

    @OriginalMember(owner = "client!wr", name = "cb", descriptor = "Ldm;")
    private class46 field5231 = new class46();

    @OriginalMember(owner = "client!wr", name = "Pd", descriptor = "Z")
    public boolean field5374 = true;

    @OriginalMember(owner = "client!wr", name = "Qd", descriptor = "Log;")
    public class557 field5375 = new class557();

    @OriginalMember(owner = "client!wr", name = "Yd", descriptor = "Log;")
    public class557 field5383 = new class557();

    @OriginalMember(owner = "client!wr", name = "Zd", descriptor = "Log;")
    public class557 field5384 = new class557();

    @OriginalMember(owner = "client!wr", name = "ae", descriptor = "Log;")
    public class557 field5385 = new class557();

    @OriginalMember(owner = "client!wr", name = "be", descriptor = "Log;")
    private class557 field5386 = new class557();

    @OriginalMember(owner = "client!wr", name = "ce", descriptor = "Log;")
    private class557 field5387 = new class557();

    @OriginalMember(owner = "client!wr", name = "de", descriptor = "Z")
    private boolean field5388 = false;

    @OriginalMember(owner = "client!wr", name = "se", descriptor = "I")
    public int field5403 = 0;

    @OriginalMember(owner = "client!wr", name = "ve", descriptor = "I")
    public int field5406 = 0;

    @OriginalMember(owner = "client!wr", name = "De", descriptor = "[F")
    private float[] field5414 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!wr", name = "Ee", descriptor = "[F")
    private float[] field5415 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!wr", name = "le", descriptor = "F")
    public float field5396 = 3584.0F;

    @OriginalMember(owner = "client!wr", name = "Ce", descriptor = "I")
    private int field5413 = 0;

    @OriginalMember(owner = "client!wr", name = "Pe", descriptor = "I")
    private int field5426 = 0;

    @OriginalMember(owner = "client!wr", name = "Ie", descriptor = "I")
    public int field5419 = 0;

    @OriginalMember(owner = "client!wr", name = "cf", descriptor = "F")
    public float field5439 = 3584.0F;

    @OriginalMember(owner = "client!wr", name = "Ye", descriptor = "Z")
    private boolean field5435 = false;

    @OriginalMember(owner = "client!wr", name = "Ke", descriptor = "I")
    private int field5421 = -1;

    @OriginalMember(owner = "client!wr", name = "ff", descriptor = "Z")
    public boolean field5442 = false;

    @OriginalMember(owner = "client!wr", name = "Ve", descriptor = "I")
    public int field5432 = 0;

    @OriginalMember(owner = "client!wr", name = "Me", descriptor = "I")
    public int field5423 = 0;

    @OriginalMember(owner = "client!wr", name = "re", descriptor = "[F")
    public float[] field5402 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!wr", name = "ge", descriptor = "[F")
    private float[] field5391 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!wr", name = "ne", descriptor = "I")
    public int field5398 = -1;

    @OriginalMember(owner = "client!wr", name = "nf", descriptor = "I")
    public int field5449 = -1;

    @OriginalMember(owner = "client!wr", name = "Se", descriptor = "I")
    public int field5429 = 512;

    @OriginalMember(owner = "client!wr", name = "xe", descriptor = "I")
    private int field5408 = 0;

    @OriginalMember(owner = "client!wr", name = "He", descriptor = "I")
    public int field5418 = 8;

    @OriginalMember(owner = "client!wr", name = "Ne", descriptor = "Z")
    private boolean field5424 = false;

    @OriginalMember(owner = "client!wr", name = "Xe", descriptor = "I")
    public int field5434 = 50;

    @OriginalMember(owner = "client!wr", name = "We", descriptor = "I")
    private int field5433 = 0;

    @OriginalMember(owner = "client!wr", name = "je", descriptor = "I")
    public int field5394 = 3;

    @OriginalMember(owner = "client!wr", name = "ue", descriptor = "I")
    public int field5405 = 0;

    @OriginalMember(owner = "client!wr", name = "df", descriptor = "Z")
    private boolean field5440 = false;

    @OriginalMember(owner = "client!wr", name = "Fe", descriptor = "I")
    public int field5416 = 128;

    @OriginalMember(owner = "client!wr", name = "qf", descriptor = "Z")
    public boolean field5452 = false;

    @OriginalMember(owner = "client!wr", name = "Cf", descriptor = "I")
    private int field5464 = -1;

    @OriginalMember(owner = "client!wr", name = "Ue", descriptor = "Laba;")
    public class150 field5431 = class461.field6469;

    @OriginalMember(owner = "client!wr", name = "bf", descriptor = "Z")
    public boolean field5438 = false;

    @OriginalMember(owner = "client!wr", name = "zf", descriptor = "Z")
    private boolean field5461 = false;

    @OriginalMember(owner = "client!wr", name = "ee", descriptor = "Z")
    public boolean field5389 = true;

    @OriginalMember(owner = "client!wr", name = "Le", descriptor = "I")
    public int field5422 = 0;

    @OriginalMember(owner = "client!wr", name = "af", descriptor = "Llf;")
    public class200 field5437 = class528.field7406;

    @OriginalMember(owner = "client!wr", name = "Nf", descriptor = "F")
    public float field5475 = -1.0F;

    @OriginalMember(owner = "client!wr", name = "Hf", descriptor = "F")
    public float field5469 = 1.0F;

    @OriginalMember(owner = "client!wr", name = "Lf", descriptor = "I")
    public int field5473 = 0;

    @OriginalMember(owner = "client!wr", name = "yf", descriptor = "I")
    public int field5460 = -1;

    @OriginalMember(owner = "client!wr", name = "gf", descriptor = "F")
    public float field5443 = 1.0F;

    @OriginalMember(owner = "client!wr", name = "sf", descriptor = "I")
    public int field5454 = 3584;

    @OriginalMember(owner = "client!wr", name = "ze", descriptor = "I")
    public int field5410 = 0;

    @OriginalMember(owner = "client!wr", name = "tf", descriptor = "[Lcj;")
    private class595[] field5455 = new class595[10];

    @OriginalMember(owner = "client!wr", name = "ef", descriptor = "[F")
    public float[] field5441 = this.field5415;

    @OriginalMember(owner = "client!wr", name = "Sf", descriptor = "I")
    private int field5480 = 1;

    @OriginalMember(owner = "client!wr", name = "Df", descriptor = "[F")
    private float[] field5465 = new float[16];

    @OriginalMember(owner = "client!wr", name = "If", descriptor = "[F")
    public float[] field5470 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!wr", name = "Gf", descriptor = "Z")
    public boolean field5468 = true;

    @OriginalMember(owner = "client!wr", name = "Qf", descriptor = "Z")
    public boolean field5478 = true;

    @OriginalMember(owner = "client!wr", name = "xf", descriptor = "I")
    public int field5459 = 512;

    @OriginalMember(owner = "client!wr", name = "Wf", descriptor = "[F")
    private float[] field5484 = new float[16];

    @OriginalMember(owner = "client!wr", name = "Tf", descriptor = "Z")
    public boolean field5481 = true;

    @OriginalMember(owner = "client!wr", name = "wf", descriptor = "I")
    public int field5458 = 0;

    @OriginalMember(owner = "client!wr", name = "Re", descriptor = "Z")
    public boolean field5428 = true;

    @OriginalMember(owner = "client!wr", name = "Vf", descriptor = "[F")
    private float[] field5483 = new float[16];

    @OriginalMember(owner = "client!wr", name = "uf", descriptor = "F")
    public float field5456 = -1.0F;

    @OriginalMember(owner = "client!wr", name = "Jf", descriptor = "Z")
    public boolean field5471 = false;

    @OriginalMember(owner = "client!wr", name = "Yf", descriptor = "I")
    private int field5486 = 16777215;

    @OriginalMember(owner = "client!wr", name = "Xf", descriptor = "F")
    private float field5485 = 1.0F;

    @OriginalMember(owner = "client!wr", name = "Ef", descriptor = "F")
    private float field5466 = 3000.0F;

    @OriginalMember(owner = "client!wr", name = "Uf", descriptor = "F")
    public float field5482 = 1.0F;

    @OriginalMember(owner = "client!wr", name = "Rf", descriptor = "F")
    public float field5479 = 1.0F;

    @OriginalMember(owner = "client!wr", name = "rf", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5453 = new Stream();

    @OriginalMember(owner = "client!wr", name = "jg", descriptor = "Log;")
    private class557 field5497 = new class557();

    @OriginalMember(owner = "client!wr", name = "V", descriptor = "Ljava/lang/Object;")
    public Object field5224;

    @OriginalMember(owner = "client!wr", name = "gc", descriptor = "Ljava/lang/Object;")
    private Object field5287;

    @OriginalMember(owner = "client!wr", name = "M", descriptor = "Ljava/awt/Canvas;")
    public Canvas field5215;

    @OriginalMember(owner = "client!wr", name = "cc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5283;

    @OriginalMember(owner = "client!wr", name = "Oe", descriptor = "I")
    public int field5425;

    @OriginalMember(owner = "client!wr", name = "Ic", descriptor = "Lan;")
    public class21 field5315;

    @OriginalMember(owner = "client!wr", name = "Bb", descriptor = "I")
    private int field5256;

    @OriginalMember(owner = "client!wr", name = "vc", descriptor = "I")
    public int field5302;

    @OriginalMember(owner = "client!wr", name = "U", descriptor = "I")
    private int field5223;

    @OriginalMember(owner = "client!wr", name = "Yc", descriptor = "I")
    public int field5331;

    @OriginalMember(owner = "client!wr", name = "Ge", descriptor = "I")
    public int field5417;

    @OriginalMember(owner = "client!wr", name = "lf", descriptor = "Lbq;")
    private class242 field5447;

    @OriginalMember(owner = "client!wr", name = "Pc", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field5322;

    @OriginalMember(owner = "client!wr", name = "jb", descriptor = "I")
    public static int field5238 = 0;

    @OriginalMember(owner = "client!wr", name = "bb", descriptor = "Lej;")
    public static class104 field5230 = new class104(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!wr", name = "te", descriptor = "F")
    public float field5404;

    @OriginalMember(owner = "client!wr", name = "Qe", descriptor = "F")
    private float field5427;

    @OriginalMember(owner = "client!wr", name = "Te", descriptor = "F")
    private float field5430;

    @OriginalMember(owner = "client!wr", name = "jf", descriptor = "F")
    public float field5445;

    @OriginalMember(owner = "client!wr", name = "mf", descriptor = "F")
    private float field5448;

    @OriginalMember(owner = "client!wr", name = "of", descriptor = "F")
    public float field5450;

    @OriginalMember(owner = "client!wr", name = "pf", descriptor = "F")
    public float field5451;

    @OriginalMember(owner = "client!wr", name = "Mf", descriptor = "F")
    public float field5474;

    @OriginalMember(owner = "client!wr", name = "bg", descriptor = "F")
    public float field5489;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!wr", name = "D", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!wr", name = "F", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!wr", name = "G", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!wr", name = "H", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!wr", name = "I", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!wr", name = "J", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!wr", name = "K", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!wr", name = "L", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!wr", name = "N", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!wr", name = "O", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!wr", name = "P", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!wr", name = "Q", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!wr", name = "R", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!wr", name = "S", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!wr", name = "T", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!wr", name = "W", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!wr", name = "X", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!wr", name = "Y", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!wr", name = "Z", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!wr", name = "ab", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!wr", name = "db", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!wr", name = "eb", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!wr", name = "fb", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!wr", name = "gb", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!wr", name = "hb", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!wr", name = "ib", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!wr", name = "kb", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!wr", name = "lb", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!wr", name = "mb", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!wr", name = "nb", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!wr", name = "ob", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!wr", name = "pb", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!wr", name = "qb", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!wr", name = "rb", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!wr", name = "sb", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!wr", name = "tb", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!wr", name = "ub", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!wr", name = "vb", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!wr", name = "wb", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!wr", name = "xb", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!wr", name = "yb", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!wr", name = "zb", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!wr", name = "Ab", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!wr", name = "Cb", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!wr", name = "Db", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!wr", name = "Eb", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!wr", name = "Fb", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!wr", name = "Gb", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!wr", name = "Hb", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!wr", name = "Ib", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!wr", name = "Jb", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!wr", name = "Kb", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!wr", name = "Lb", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!wr", name = "Mb", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!wr", name = "Nb", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!wr", name = "Ob", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!wr", name = "Pb", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!wr", name = "Qb", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!wr", name = "Rb", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!wr", name = "Sb", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!wr", name = "Tb", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!wr", name = "Ub", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!wr", name = "Vb", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!wr", name = "Wb", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!wr", name = "Xb", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!wr", name = "Yb", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!wr", name = "Zb", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!wr", name = "ac", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!wr", name = "bc", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!wr", name = "dc", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!wr", name = "ec", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!wr", name = "fc", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!wr", name = "hc", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!wr", name = "ic", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!wr", name = "jc", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!wr", name = "kc", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!wr", name = "lc", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!wr", name = "mc", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!wr", name = "nc", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!wr", name = "oc", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!wr", name = "pc", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!wr", name = "qc", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!wr", name = "rc", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!wr", name = "sc", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!wr", name = "tc", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!wr", name = "uc", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!wr", name = "wc", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!wr", name = "xc", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!wr", name = "yc", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!wr", name = "zc", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!wr", name = "Ac", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!wr", name = "Bc", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!wr", name = "Cc", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!wr", name = "Dc", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!wr", name = "Ec", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!wr", name = "Fc", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!wr", name = "Gc", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!wr", name = "Hc", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!wr", name = "Jc", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!wr", name = "Kc", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!wr", name = "Lc", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!wr", name = "Mc", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!wr", name = "Nc", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!wr", name = "Oc", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!wr", name = "Qc", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!wr", name = "Rc", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!wr", name = "Sc", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!wr", name = "Tc", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!wr", name = "Uc", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!wr", name = "Vc", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!wr", name = "Wc", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!wr", name = "Xc", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!wr", name = "Zc", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!wr", name = "ad", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!wr", name = "bd", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!wr", name = "cd", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!wr", name = "dd", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!wr", name = "ed", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!wr", name = "fd", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!wr", name = "hd", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!wr", name = "id", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!wr", name = "jd", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!wr", name = "kd", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!wr", name = "ld", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!wr", name = "md", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!wr", name = "nd", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!wr", name = "od", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!wr", name = "pd", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!wr", name = "rd", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!wr", name = "sd", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!wr", name = "td", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!wr", name = "ud", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!wr", name = "vd", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!wr", name = "wd", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!wr", name = "xd", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!wr", name = "yd", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!wr", name = "zd", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!wr", name = "Ad", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!wr", name = "Bd", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!wr", name = "Cd", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!wr", name = "Dd", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!wr", name = "Ed", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!wr", name = "Fd", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!wr", name = "Hd", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!wr", name = "Id", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!wr", name = "Jd", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!wr", name = "Kd", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!wr", name = "Md", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!wr", name = "Nd", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!wr", name = "Od", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!wr", name = "Rd", descriptor = "I")
    public int field5376;

    @OriginalMember(owner = "client!wr", name = "Sd", descriptor = "I")
    public int field5377;

    @OriginalMember(owner = "client!wr", name = "Td", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!wr", name = "Ud", descriptor = "I")
    public int field5379;

    @OriginalMember(owner = "client!wr", name = "Vd", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!wr", name = "Wd", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!wr", name = "Xd", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!wr", name = "fe", descriptor = "I")
    public int field5390;

    @OriginalMember(owner = "client!wr", name = "he", descriptor = "I")
    public int field5392;

    @OriginalMember(owner = "client!wr", name = "ie", descriptor = "I")
    private int field5393;

    @OriginalMember(owner = "client!wr", name = "qe", descriptor = "I")
    public int field5401;

    @OriginalMember(owner = "client!wr", name = "ye", descriptor = "I")
    private int field5409;

    @OriginalMember(owner = "client!wr", name = "Je", descriptor = "I")
    public int field5420;

    @OriginalMember(owner = "client!wr", name = "vf", descriptor = "I")
    public int field5457;

    @OriginalMember(owner = "client!wr", name = "Ff", descriptor = "I")
    public int field5467;

    @OriginalMember(owner = "client!wr", name = "Kf", descriptor = "I")
    public int field5472;

    @OriginalMember(owner = "client!wr", name = "ag", descriptor = "I")
    public int field5488;

    @OriginalMember(owner = "client!wr", name = "wg", descriptor = "I")
    private int field5510;

    @OriginalMember(owner = "client!wr", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!wr", name = "hf", descriptor = "Lqo;")
    private class20 field5444;

    @OriginalMember(owner = "client!wr", name = "dg", descriptor = "Luj;")
    private class321 field5491;

    @OriginalMember(owner = "client!wr", name = "cg", descriptor = "Li;")
    public class35 field5490;

    @OriginalMember(owner = "client!wr", name = "eg", descriptor = "Li;")
    public class35 field5492;

    @OriginalMember(owner = "client!wr", name = "fg", descriptor = "Li;")
    public class35 field5493;

    @OriginalMember(owner = "client!wr", name = "hg", descriptor = "Li;")
    public class35 field5495;

    @OriginalMember(owner = "client!wr", name = "ig", descriptor = "Li;")
    public class35 field5496;

    @OriginalMember(owner = "client!wr", name = "kg", descriptor = "Li;")
    public class35 field5498;

    @OriginalMember(owner = "client!wr", name = "lg", descriptor = "Li;")
    public class35 field5499;

    @OriginalMember(owner = "client!wr", name = "ng", descriptor = "Li;")
    public class35 field5501;

    @OriginalMember(owner = "client!wr", name = "pg", descriptor = "Li;")
    public class35 field5503;

    @OriginalMember(owner = "client!wr", name = "tg", descriptor = "Li;")
    public class35 field5507;

    @OriginalMember(owner = "client!wr", name = "we", descriptor = "Lbaa;")
    public class445 field5407;

    @OriginalMember(owner = "client!wr", name = "oe", descriptor = "Liq;")
    private class521 field5399;

    @OriginalMember(owner = "client!wr", name = "qd", descriptor = "Lpaa;")
    public class534 field5349;

    @OriginalMember(owner = "client!wr", name = "gg", descriptor = "Ltq;")
    public class538 field5494;

    @OriginalMember(owner = "client!wr", name = "mg", descriptor = "Ltq;")
    public class538 field5500;

    @OriginalMember(owner = "client!wr", name = "qg", descriptor = "Ltq;")
    public class538 field5504;

    @OriginalMember(owner = "client!wr", name = "sg", descriptor = "Ltq;")
    private class538 field5506;

    @OriginalMember(owner = "client!wr", name = "ug", descriptor = "Ltq;")
    public class538 field5508;

    @OriginalMember(owner = "client!wr", name = "vg", descriptor = "Ltq;")
    private class538 field5509;

    @OriginalMember(owner = "client!wr", name = "Of", descriptor = "Lcj;")
    private class595 field5476;

    @OriginalMember(owner = "client!wr", name = "og", descriptor = "Llu;")
    private class609 field5502;

    @OriginalMember(owner = "client!wr", name = "rg", descriptor = "Llu;")
    private class609 field5505;

    @OriginalMember(owner = "client!wr", name = "Gd", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field5365;

    @OriginalMember(owner = "client!wr", name = "gd", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field5339;

    @OriginalMember(owner = "client!wr", name = "Ld", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field5370;

    @OriginalMember(owner = "client!wr", name = "ke", descriptor = "Z")
    public boolean field5395;

    @OriginalMember(owner = "client!wr", name = "me", descriptor = "Z")
    public boolean field5397;

    @OriginalMember(owner = "client!wr", name = "Ae", descriptor = "Z")
    public boolean field5411;

    @OriginalMember(owner = "client!wr", name = "kf", descriptor = "Z")
    public boolean field5446;

    @OriginalMember(owner = "client!wr", name = "Bf", descriptor = "Z")
    public boolean field5463;

    @OriginalMember(owner = "client!wr", name = "xg", descriptor = "Z")
    public boolean field5511;

    @OriginalMember(owner = "client!wr", name = "pe", descriptor = "[Lrh;")
    public class223[] field5400;

    @OriginalMember(owner = "client!wr", name = "Be", descriptor = "[Lhf;")
    public class333[] field5412;

    @OriginalMember(owner = "client!wr", name = "Ze", descriptor = "[Lhf;")
    public class333[] field5436;

    @OriginalMember(owner = "client!wr", name = "Zf", descriptor = "[Lvaa;")
    public class399[] field5487;

    @OriginalMember(owner = "client!wr", name = "Af", descriptor = "[Lbaa;")
    private class445[] field5462;

    @OriginalMember(owner = "client!wr", name = "Pf", descriptor = "[Log;")
    public class557[] field5477;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILbaa;)V")
    public final void method2267(int arg0, class445 arg1) {
        if (arg0 != 2) {
            this.field5466 = 0.3934826F;
        }
        ++field5301;
        if (this.field5462[this.field5405] != arg1) {
            this.field5462[this.field5405] = arg1;
            if (arg1 == null) {
                this.method1633(-23189);
            } else {
                arg1.method1482(-31490);
            }
            this.field5393 &= -2;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BILvf;Z)V")
    public abstract void method1590(byte arg0, int arg1, class131 arg2, boolean arg3);

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(B)V")
    private final void method2268(byte arg0) {
        int var2 = 67 % ((89 - arg0) / 37);
        ++field5255;
        this.field5502 = this.method1644((byte) 115, true);
        this.field5502.method619(12, 101, 24);
        this.field5506 = this.method1643(new class14[] { new class14(class94.field1441) }, false);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILjaclib/memory/Buffer;)Ljaclib/memory/Stream;")
    public final Stream method2269(int arg0, Buffer arg1) {
        this.field5453.method3296(arg1);
        if (arg0 <= 39) {
            this.field5509 = null;
        }
        ++field5211;
        return this.field5453;
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(B)V")
    public abstract void method1619(byte arg0);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIZBZI)V")
    private final void method2270(int arg0, int arg1, boolean arg2, byte arg3, boolean arg4, int arg5) {
        boolean var7 = arg4 & this.method1294();
        ++field5200;
        if (arg3 < 47) {
            this.method2331((byte) 122);
        }
        if (!var7 && (arg5 == 4 || arg5 == 8 || ~arg5 == -10)) {
            arg5 = 2;
            arg0 = arg5 == 4 ? 1 & arg1 : 1;
            arg1 = 0;
        }
        if (arg5 != 0 && arg2) {
            arg5 |= Integer.MIN_VALUE;
        }
        if (~this.field5426 == ~arg5) {
            if (this.field5426 != 0) {
                this.field5455[Integer.MAX_VALUE & this.field5426].method299(-1, arg2);
                if (this.field5433 != arg1 || ~this.field5408 != ~arg0) {
                    this.field5455[this.field5426 & Integer.MAX_VALUE].method303(arg0, arg1, -121);
                    this.field5433 = arg1;
                    this.field5408 = arg0;
                }
                return;
            }
        } else {
            if (this.field5426 != 0) {
                this.field5455[this.field5426 & Integer.MAX_VALUE].method298((byte) -60);
            }
            if (~arg5 == -1) {
                this.field5476 = null;
            } else {
                this.field5476 = this.field5455[arg5 & Integer.MAX_VALUE];
                this.field5476.method302(arg2, true);
                this.field5476.method299(-1, arg2);
                this.field5476.method303(arg0, arg1, -126);
            }
            this.field5426 = arg5;
            this.field5408 = arg0;
            this.field5433 = arg1;
        }
    }

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "(I)V")
    public abstract void method1621(int arg0);

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "(I)V")
    public final void method2271(int arg0) {
        ++field5294;
        if (~this.field5393 != -3) {
            this.method2282(true);
            this.method2304(-114, false);
            this.method2276(false, arg0 + 28696);
            this.method2303(false, -32);
            this.method2275(-32491, false);
            this.method2344((byte) 108, -2, false, false);
            this.field5393 = 2;
        }
        if (arg0 != -28704) {
            this.method2309(-60, -29);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II[I[I)Lpa;")
    public final class310 method1322(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field5212;
        return class585.method3430(arg3, arg0, arg1, 0, arg2, this);
    }

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "(IFFFFF)V")
    public final void method1298(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field5341;
        boolean var7 = this.field5486 != arg0;
        if (var7 || this.field5475 != arg1 || this.field5456 != arg2) {
            this.field5456 = arg2;
            this.field5486 = arg0;
            this.field5475 = arg1;
            if (var7) {
                this.field5482 = (float) (this.field5486 & 65280) / 65280.0F;
                this.field5443 = (float) (this.field5486 & 16711680) / 1.671168E7F;
                this.field5479 = (float) (this.field5486 & 255) / 255.0F;
                this.method1587((byte) 37);
            }
            this.field5322.setSunColour(this.field5443, this.field5482, this.field5479, arg1, arg2);
            this.method1600(4);
        }
        if (this.field5414[0] != arg3 || this.field5414[1] != arg4 || this.field5414[2] != arg5) {
            this.field5414[1] = arg4;
            this.field5414[0] = arg3;
            this.field5414[2] = arg5;
            this.field5391[1] = -arg4;
            this.field5391[2] = -arg5;
            this.field5391[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5470[1] = arg4 * var8;
            this.field5470[2] = arg5 * var8;
            this.field5470[0] = arg3 * var8;
            this.field5402[2] = -this.field5470[2];
            this.field5402[0] = -this.field5470[0];
            this.field5402[1] = -this.field5470[1];
            this.field5322.setSunDirection(this.field5470[0], this.field5470[1], this.field5470[2]);
            this.method1621(-15077);
            this.field5420 = (int) (arg5 * 256.0F / arg4);
            this.field5390 = (int) (arg3 * 256.0F / arg4);
        }
        this.method1597(-55);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BIIZI[II)Lwn;")
    public abstract class617 method1606(byte arg0, int arg1, int arg2, boolean arg3, int arg4, int[] arg5, int arg6);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Llu;IZ)V")
    public abstract void method1607(class609 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "(I)V")
    public abstract void method1631(int arg0);

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "(Z)I")
    public final int method2272(boolean arg0) {
        if (!arg0) {
            return 55;
        } else {
            ++field5220;
            return this.field5413;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILdk;I[FIIIZ)Lwn;")
    public abstract class617 method1612(int arg0, class435 arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "(Z)I")
    public final int method2273(boolean arg0) {
        ++field5243;
        if (!arg0) {
            this.method1341(-80, -25, -34, -124, -120, 105, 127, 104, 117, 99);
        }
        return this.field5409;
    }

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "(B)V")
    public abstract void method1616(byte arg0);

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "(I)V")
    private final void method2274(int arg0) {
        this.field5424 = false;
        if (arg0 == 3) {
            ++field5296;
            if (this.field5476 != null) {
                this.field5476.method1489(-1);
            }
            this.method1614(1);
        }
    }

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "(I)V")
    public void method1362(int arg0) {
        ++field5234;
        this.field5447.method1509(98);
        this.field5401 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "(I)V")
    public abstract void method1629(int arg0);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZ)V")
    public final void method2275(int arg0, boolean arg1) {
        if (!arg1 != !this.field5471) {
            this.field5471 = arg1;
            this.method1628((byte) -76);
            this.field5393 &= -32;
        }
        ++field5217;
        if (arg0 != -32491) {
            this.field5431 = null;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZI)V")
    public final void method2276(boolean arg0, int arg1) {
        ++field5268;
        if (this.field5438 == !arg0) {
            this.field5438 = arg0;
            this.method1640((byte) -77);
            this.field5393 &= -8;
        }
        if (arg1 != -8) {
            this.method1300(-4, -52, -83, 21, false);
        }
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(IIIIII)V")
    public final void method1349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5258;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var7 * var9;
        float var11 = var8 * var9;
        if (this.method2291(0.0F, (float) arg2 + var10, (float) arg3 + var11, (float) arg1, (byte) 121, 0.0F, (float) arg0)) {
            this.method2319(26850);
            this.method2309(arg4, -9683);
            this.method2315(class610.field8770, 0, 8);
            this.method2326(89, 0, class610.field8770);
            this.method2317(arg5, 9);
            this.method2339(30101);
            this.method1608(false, 16777215);
            this.method2321((byte) -126);
            this.method1608(true, 16777215);
            this.method2326(126, 0, class583.field8185);
            this.method2315(class583.field8185, 0, 8);
        }
    }

    @OriginalMember(owner = "client!wr", name = "ta", descriptor = "(II)V")
    public final void method1290(int arg0, int arg1) {
        ++field5288;
        if (this.field5434 != arg0 || this.field5454 != arg1) {
            this.field5454 = arg1;
            this.field5434 = arg0;
            this.method2335((byte) -101);
            this.method2314(false);
            this.method2340(-4887);
        }
    }

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "(IIIII)V")
    public final void method1292(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1349(arg0, arg1, arg0, arg1 - -arg2, arg3, arg4);
        ++field5297;
    }

    @OriginalMember(owner = "client!wr", name = "JA", descriptor = "(IIII)V")
    public final void method1314(int arg0, int arg1, int arg2, int arg3) {
        ++field5204;
        if (!this.field5446) {
            throw new RuntimeException("");
        } else {
            if (this.field5409 != arg0) {
                this.field5409 = arg0;
                if (this.field5476 != null) {
                    this.field5476.method1488((byte) 4);
                }
            }
            this.field5413 = arg3;
            this.field5449 = arg1;
            this.field5421 = arg2;
            this.method2340(-4887);
        }
    }

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "(I)V")
    public final void method2277(int arg0) {
        this.field5462 = new class445[this.field5457];
        this.field5412 = new class333[this.field5457];
        ++field5373;
        this.field5477 = new class557[this.field5457];
        this.field5487 = new class399[this.field5457];
        this.field5436 = new class333[this.field5457];
        for (int var2 = 0; var2 < this.field5457; ++var2) {
            this.field5412[var2] = class167.field2417;
            this.field5436[var2] = class167.field2417;
            this.field5487[var2] = class353.field4778;
            this.field5477[var2] = new class557();
        }
        this.field5400 = new class223[this.field5392 + -2];
        this.field5407 = this.method1650(class608.field8759, class49.field958, (byte) -26, 1, 1);
        this.method1296(new class250(262144));
        this.field5500 = this.method1643(new class14[] { new class14(new class94[] { class94.field1441, class94.field1447 }) }, false);
        this.field5494 = this.method1643(new class14[] { new class14(new class94[] { class94.field1441, class94.field1445 }) }, false);
        this.field5508 = this.method1643(new class14[] { new class14(class94.field1441), new class14(class94.field1445), new class14(class94.field1447), new class14(class94.field1443) }, false);
        this.field5504 = this.method1643(new class14[] { new class14(class94.field1441), new class14(class94.field1445), new class14(class94.field1447) }, false);
        this.field5501 = new class35(this, 0, 0, false, false);
        this.field5499 = new class35(this, 0, 0, true, true);
        this.field5495 = new class35(this, 0, 0, false, false);
        this.field5496 = new class35(this, 0, 0, true, true);
        this.field5490 = new class35(this, 0, 0, false, false);
        this.field5492 = new class35(this, 0, 0, true, true);
        this.field5498 = new class35(this, 0, 0, false, false);
        this.field5507 = new class35(this, 0, 0, true, true);
        this.field5503 = new class35(this, 0, 0, false, false);
        this.field5493 = new class35(this, 0, 0, true, true);
        this.field5444 = new class20(this);
        this.field5491 = this.method1588(true, (byte) 123);
        this.method2290(true);
        this.field5349 = new class534(this);
        this.field5455[1] = this.method1648(0, 1);
        this.field5455[2] = this.method1648(arg0 + -4, 2);
        this.field5455[arg0] = this.method1648(arg0 + -4, 4);
        this.field5455[5] = this.method1648(0, 5);
        this.field5455[6] = this.method1648(0, 6);
        this.field5455[7] = this.method1648(0, 7);
        this.field5455[3] = this.method1648(0, 3);
        this.field5455[8] = this.method1648(arg0 + -4, 8);
        this.field5455[9] = this.method1648(arg0 + -4, 9);
        if (!this.field5455[2].method297((byte) -127)) {
            this.field5455[2] = this.method1648(0, 0);
        }
        if (!this.field5455[4].method297((byte) -125)) {
            this.field5455[4] = this.field5455[2];
        }
        if (!this.field5455[8].method297((byte) -124)) {
            this.field5455[8] = this.field5455[4];
        }
        if (!this.field5455[9].method297((byte) -125)) {
            this.field5455[9] = this.field5455[8];
        }
        this.method1599(true);
        this.method1269();
    }

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "(Z)V")
    public final void method2278(boolean arg0) {
        if (~this.field5393 != -5) {
            this.method2282(true);
            this.method2304(-125, false);
            this.method2276(false, -8);
            this.method2303(false, -32);
            this.method2275(-32491, false);
            this.method2344((byte) 90, -2, false, false);
            this.method2317(1, 9);
            this.method2334(0, (byte) -117);
            this.field5393 = 4;
        }
        ++field5344;
        if (!arg0) {
            this.method1264(102, -90, -114, -75, 47, -64, (byte[]) null, 59, -89);
        }
    }

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "(I)V")
    public final void method2279(int arg0) {
        ++field5372;
        if (~this.field5393 != -9) {
            this.method2329(-8);
            this.method2304(-95, true);
            this.method2303(true, -32);
            this.method2275(-32491, true);
            this.method2317(1, 9);
            this.field5393 = 8;
        }
        if (arg0 != -20873) {
            this.field5418 = 64;
        }
    }

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "(Z)V")
    private final void method2280(boolean arg0) {
        this.field5445 = (float) (this.field5432 - this.field5406);
        ++field5221;
        this.field5489 = (float) (-this.field5473 + this.field5410);
        this.field5404 = (float) (-this.field5473 + this.field5458);
        this.field5450 = (float) (-this.field5406 + this.field5419);
        if (!arg0) {
            this.field5417 = -32;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "([IIIII)Lha;")
    public final class52 method1363(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5328;
        return new class280(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1275(Canvas arg0) {
        ++field5271;
        Object var2 = null;
        if (arg0 != null && this.field5215 != arg0) {
            if (this.field5370.containsKey(arg0)) {
                var2 = this.field5370.get(arg0);
            }
        } else {
            var2 = this.field5287;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method1642(arg0, var2, (byte) -30);
            if (this.field5283 == arg0) {
                this.method2295(-48);
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[F)[F")
    public final float[] method2281(int arg0, float[] arg1) {
        arg1[4] = this.field5441[1];
        arg1[8] = this.field5441[2];
        arg1[12] = this.field5441[3];
        ++field5358;
        arg1[0] = this.field5441[0];
        arg1[2] = this.field5441[8];
        arg1[9] = this.field5441[6];
        arg1[13] = this.field5441[7];
        arg1[1] = this.field5441[4];
        if (arg0 > -10) {
            this.field5507 = null;
        }
        arg1[5] = this.field5441[5];
        arg1[7] = this.field5441[13];
        arg1[6] = this.field5441[9];
        arg1[3] = this.field5441[12];
        arg1[14] = this.field5441[11];
        arg1[10] = this.field5441[10];
        arg1[15] = this.field5441[15];
        arg1[11] = this.field5441[14];
        return arg1;
    }

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "(B)V")
    public abstract void method1587(byte arg0);

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "(IIII)V")
    public final void method1336(int arg0, int arg1, int arg2, int arg3) {
        this.field5413 = arg3;
        this.field5421 = arg2;
        this.field5446 = true;
        this.field5409 = arg0;
        ++field5274;
        this.field5449 = arg1;
        this.method2270(0, 0, false, (byte) 115, false, 3);
        if (this.field5476 != null) {
            this.field5476.method1488((byte) 4);
        }
        this.method2340(-4887);
        this.method1616((byte) -113);
    }

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "(Z)V")
    private final void method2282(boolean arg0) {
        ++field5209;
        if (!arg0) {
            this.field5422 = -112;
        }
        if (class319.field4319 != this.field5431) {
            class150 var2 = this.field5431;
            this.field5431 = class319.field4319;
            if (var2.method984((byte) 84)) {
                this.method2274(3);
            }
            this.method2343(3734);
            this.field5441 = this.field5483;
            this.method2312(0);
            this.field5393 &= -25;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(FB)V")
    public final void method2283(float arg0, byte arg1) {
        if (arg1 == 42) {
            if (this.field5485 != arg0) {
                this.field5485 = arg0;
                this.method2314(false);
            }
            ++field5319;
        }
    }

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "(Z)V")
    public void method1599(boolean arg0) {
        this.method2310(-28270);
        if (arg0) {
            ++field5273;
        }
    }

    @OriginalMember(owner = "client!wr", name = "ba", descriptor = "()I")
    public final int method1287() {
        ++field5378;
        return this.field5510;
    }

    @OriginalMember(owner = "client!wr", name = "F", descriptor = "(IIII)V")
    public final void method1303(int arg0, int arg1, int arg2, int arg3) {
        if (~arg3 > ~this.field5458) {
            this.field5458 = arg3;
        }
        ++field5380;
        if (this.field5410 < arg1) {
            this.field5410 = arg1;
        }
        if (this.field5419 > arg2) {
            this.field5419 = arg2;
        }
        if (~this.field5432 > ~arg0) {
            this.field5432 = arg0;
        }
        if (~this.field5432 >= -1 && this.field5419 >= this.field5302 && ~this.field5410 >= -1 && this.field5331 <= this.field5458) {
            this.method1269();
        } else {
            if (!this.field5511) {
                this.field5511 = true;
                this.method1604(true);
            }
            this.method1637((byte) -118);
            this.method2280(true);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method1630(int arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "(B)V")
    private final void method2284(byte arg0) {
        if (class305.field4156 != this.field5431) {
            class150 var2 = this.field5431;
            this.field5431 = class305.field4156;
            if (!var2.method984((byte) 84)) {
                this.method2274(3);
            }
            this.method2308(-69);
            this.field5441 = this.field5484;
            this.method2312(0);
            this.field5393 &= -8;
        }
        if (arg0 != -29) {
            this.field5413 = -87;
        }
        ++field5290;
    }

    @OriginalMember(owner = "client!wr", name = "ra", descriptor = "()F")
    public final float method1271() {
        ++field5298;
        return this.field5430;
    }

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "(I)Log;")
    public final class557 method2285(int arg0) {
        ++field5361;
        if (arg0 != 2) {
            this.field5393 = 28;
        }
        return this.field5385;
    }

    @OriginalMember(owner = "client!wr", name = "P", descriptor = "()F")
    public final float method1326() {
        ++field5199;
        return this.field5466;
    }

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "(I)V")
    public final void method2286(int arg0) {
        this.field5374 = false;
        ++field5275;
        this.method2324(0);
        if (arg0 != 21838) {
            this.method2281(-5, (float[]) null);
        }
    }

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "()Z")
    public final boolean method1305() {
        ++field5318;
        return true;
    }

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "(I)V")
    private final void method2287(int arg0) {
        ++field5213;
        this.field5505 = this.method1644((byte) 115, false);
        this.field5505.method619(28, -97, 140);
        for (int var2 = arg0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field5505.method613(true, -25838);
            if (var3 != null) {
                Stream var4 = this.method2269(48, var3);
                if (!Stream.method3294()) {
                    var4.method3293(0.0F);
                    var4.method3293(0.0F);
                    var4.method3293(0.0F);
                    var4.method3293(0.0F);
                    var4.method3293(0.0F);
                    var4.method3293(0.0F);
                    var4.method3293(0.0F);
                    var4.method3293(0.0F);
                    var4.method3293(1.0F);
                    var4.method3293(0.0F);
                    var4.method3293(0.0F);
                    var4.method3293(1.0F);
                    var4.method3293(0.0F);
                    var4.method3293(1.0F);
                    var4.method3293(1.0F);
                    var4.method3293(1.0F);
                    var4.method3293(0.0F);
                    var4.method3293(1.0F);
                    var4.method3293(1.0F);
                    var4.method3293(1.0F);
                    var4.method3293(1.0F);
                    var4.method3293(1.0F);
                    var4.method3293(0.0F);
                    var4.method3293(0.0F);
                    var4.method3293(1.0F);
                    var4.method3293(0.0F);
                    var4.method3293(1.0F);
                    var4.method3293(0.0F);
                    var4.method3293(0.0F);
                    var4.method3293(0.0F);
                    var4.method3293(0.0F);
                    var4.method3293(0.0F);
                    var4.method3293(0.0F);
                    var4.method3293(0.0F);
                    var4.method3293(0.0F);
                } else {
                    var4.method3289(0.0F);
                    var4.method3289(0.0F);
                    var4.method3289(0.0F);
                    var4.method3289(0.0F);
                    var4.method3289(0.0F);
                    var4.method3289(0.0F);
                    var4.method3289(0.0F);
                    var4.method3289(0.0F);
                    var4.method3289(1.0F);
                    var4.method3289(0.0F);
                    var4.method3289(0.0F);
                    var4.method3289(1.0F);
                    var4.method3289(0.0F);
                    var4.method3289(1.0F);
                    var4.method3289(1.0F);
                    var4.method3289(1.0F);
                    var4.method3289(0.0F);
                    var4.method3289(1.0F);
                    var4.method3289(1.0F);
                    var4.method3289(1.0F);
                    var4.method3289(1.0F);
                    var4.method3289(1.0F);
                    var4.method3289(0.0F);
                    var4.method3289(0.0F);
                    var4.method3289(1.0F);
                    var4.method3289(0.0F);
                    var4.method3289(1.0F);
                    var4.method3289(0.0F);
                    var4.method3289(0.0F);
                    var4.method3289(0.0F);
                    var4.method3289(0.0F);
                    var4.method3289(0.0F);
                    var4.method3289(0.0F);
                    var4.method3289(0.0F);
                    var4.method3289(0.0F);
                }
                var4.method3288();
                if (this.field5505.method616((byte) -88)) {
                    break;
                }
            }
        }
        this.field5509 = this.method1643(new class14[] { new class14(new class94[] { class94.field1441, class94.field1447, class94.field1447 }) }, false);
    }

    @OriginalMember(owner = "client!wr", name = "za", descriptor = "(IIIIII[BII)V")
    public final void method1264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field5284;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(IZ)Luj;")
    public final class321 method2288(int arg0, boolean arg1) {
        ++field5247;
        if (arg1) {
            this.method1587((byte) 37);
        }
        if (arg0 * 2 > this.field5491.method620(-125)) {
            this.field5491.method1477(-18855, arg0);
        }
        return this.field5491;
    }

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "(B)V")
    public abstract void method1611(byte arg0);

    @OriginalMember(owner = "client!wr", name = "la", descriptor = "(FF)V")
    public final void method1333(float arg0, float arg1) {
        if (this.field5466 != arg0 || this.field5430 != arg1) {
            this.field5466 = arg0;
            this.field5430 = arg1;
            this.method2301(false);
            this.method2311((byte) -127);
            this.method2314(false);
            this.method2335((byte) -36);
        }
        ++field5342;
    }

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "()Z")
    public final boolean method1304() {
        ++field5278;
        return true;
    }

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "(I)Log;")
    public final class557 method2289(int arg0) {
        ++field5259;
        return arg0 > -6 ? null : this.field5477[this.field5405];
    }

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "(Z)V")
    public final void method2290(boolean arg0) {
        ++field5257;
        Hashtable var2 = new Hashtable();
        if (this.field5370 != null && !this.field5370.isEmpty()) {
            Enumeration var3 = this.field5370.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method1598(16, var4));
            }
        }
        this.field5370 = var2;
        this.method2287(0);
        this.method2268((byte) -20);
        if (!arg0) {
            this.method1329(-33, -73, -111, -69, 112);
        }
        this.field5444.method204(this, 17877);
    }

    @OriginalMember(owner = "client!wr", name = "IA", descriptor = "(III[I)V")
    public final void method1324(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5310;
        float var5 = this.field5383.method3177((float) arg2, (float) arg0, (byte) 120, (float) arg1);
        if (!((float) this.field5434 > var5) && !(var5 > (float) this.field5454)) {
            int var6 = (int) ((float) this.field5429 * this.field5383.method3160(16383, (float) arg0, (float) arg1, (float) arg2) / var5);
            int var7 = (int) ((float) this.field5459 * this.field5383.method3175(-47, (float) arg1, (float) arg0, (float) arg2) / var5);
            if (this.field5445 <= (float) var6 && this.field5450 >= (float) var6 && (float) var7 >= this.field5489 && this.field5404 >= (float) var7) {
                arg3[1] = (int) ((float) var7 + -this.field5489);
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 + -this.field5445);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(FFFFBFF)Z")
    private final boolean method2291(float arg0, float arg1, float arg2, float arg3, byte arg4, float arg5, float arg6) {
        ++field5241;
        Buffer var8 = this.field5502.method613(true, -25838);
        if (var8 == null) {
            return false;
        } else {
            if (arg4 < 116) {
                this.method2299(-5, (class399) null);
            }
            Stream var9 = this.method2269(96, var8);
            if (Stream.method3294()) {
                var9.method3289(arg6);
                var9.method3289(arg3);
                var9.method3289(arg0);
                var9.method3289(arg1);
                var9.method3289(arg2);
                var9.method3289(arg5);
            } else {
                var9.method3293(arg6);
                var9.method3293(arg3);
                var9.method3293(arg0);
                var9.method3293(arg1);
                var9.method3293(arg2);
                var9.method3293(arg5);
            }
            var9.method3288();
            return this.field5502.method616((byte) -77);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZB)Luj;")
    public abstract class321 method1588(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "(I)V")
    private final void method2292(int arg0) {
        ++field5248;
        this.method1611((byte) 19);
        if (arg0 != 12) {
            this.field5407 = null;
        }
        if (this.field5476 != null) {
            this.field5476.method1486(126);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIZ)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method2293(int arg0, int arg1, boolean arg2) {
        ++field5320;
        if (arg1 >= -84) {
            this.field5504 = null;
        }
        return this.field5365.method3286(arg0, arg2);
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(ZB)V")
    public final void method2294(boolean arg0, byte arg1) {
        int var3 = -77 % ((6 - arg1) / 33);
        ++field5323;
        if (!arg0 == this.field5442) {
            this.field5442 = arg0;
            this.method1640((byte) -77);
        }
    }

    @OriginalMember(owner = "client!wr", name = "D", descriptor = "()Z")
    public final boolean method1369() {
        ++field5249;
        return false;
    }

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "(IIIIII)V")
    public final void method1321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2319(26850);
        ++field5216;
        this.method2309(arg4, -9683);
        this.method2315(class610.field8770, 0, 8);
        this.method2326(123, 0, class610.field8770);
        this.method2317(arg5, 9);
        this.field5375.method3174(1.0F, (byte) 59, (float) arg2, (float) arg3);
        this.field5375.method1051(arg0, arg1, 0);
        this.method2324(0);
        this.method1608(false, 16777215);
        this.method2330((byte) 66);
        this.method1608(true, 16777215);
        this.method2326(120, 0, class583.field8185);
        this.method2315(class583.field8185, 0, 8);
    }

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "()Z")
    public final boolean method1345() {
        ++field5222;
        return true;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method1598(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)V")
    public final void method1280(int arg0) {
        ++field5276;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILdk;Lge;)Z")
    public abstract boolean method1632(int arg0, class435 arg1, class608 arg2);

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "(I)V")
    private final void method2295(int arg0) {
        ++field5201;
        int var2 = 45 / ((25 - arg0) / 62);
        if (this.field5283 == null) {
            this.field5256 = this.field5223 = 1;
        } else {
            Dimension var3 = this.field5283.getSize();
            this.field5256 = var3.width;
            this.field5223 = var3.height;
        }
        this.field5302 = this.field5256;
        this.field5331 = this.field5223;
        this.method2346(-123);
        this.method2335((byte) -50);
        this.method2314(false);
        this.method1626(9295);
        this.method2280(true);
        this.method2328(-11863);
        this.method1269();
    }

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "(I)V")
    public abstract void method1601(int arg0);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZIILdk;II[BI)Lwn;")
    public abstract class617 method1603(boolean arg0, int arg1, int arg2, class435 arg3, int arg4, int arg5, byte[] arg6, int arg7);

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "(I)V")
    public final void method1330(int arg0) {
        ++field5266;
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(II)V")
    public final void method2296(int arg0, int arg1) {
        if (this.field5405 != arg1) {
            this.field5405 = arg1;
            this.method1618(true);
        }
        ++field5368;
        if (arg0 != 0) {
            this.method1369();
        }
    }

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "(B)Log;")
    public final class557 method2297(byte arg0) {
        if (!this.field5424) {
            this.field5387.method3176(this.field5385, this.field5375);
            this.field5424 = true;
        }
        ++field5299;
        if (arg0 != 95) {
            this.method1282();
        }
        return this.field5387;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILqa;)V")
    public static final void method2298(int arg0, class207 arg1) {
        ++field5308;
        if ((class210.field2958 >= 2 || class493.field6904) && class137.field2159 == null) {
            String var2;
            if (class493.field6904 && class210.field2958 < 2) {
                var2 = class412.field5799 + class405.field5762.method739(class173.field2491, -110) + class494.field6922 + " ->";
            } else if (class304.field4149 && class316.field4245.method2691(81, 19521) && ~class210.field2958 < -3) {
                var2 = class611.method3576(23974, (class442) class448.field6352.field892.field2519.field2519);
            } else {
                class442 var3 = (class442) class448.field6352.field892.field2519;
                var2 = class611.method3576(23974, var3);
                int[] var4 = null;
                if (!class311.method1946(var3.field6298, 84)) {
                    if (~var3.field6294 == 0) {
                        if (!class35.method366(var3.field6298, (byte) 2)) {
                            if (class532.method3060(var3.field6298, 59)) {
                                Object var5 = null;
                                class364 var6;
                                if (~var3.field6298 == -1009) {
                                    var6 = class18.field227.method1201((byte) 125, (int) var3.field6297);
                                } else {
                                    var6 = class18.field227.method1201((byte) 72, (int) (var3.field6297 >>> 32 & 2147483647L));
                                }
                                if (var6.field4904 != null) {
                                    var6 = var6.method2183(true, class189.field2681);
                                }
                                if (var6 != null) {
                                    var4 = var6.field4905;
                                }
                            }
                        } else {
                            class576 var7 = (class576) class278.field3837.method1242(0, (long) ((int) var3.field6297));
                            if (var7 != null) {
                                class109 var8 = var7.field7929;
                                class593 var9 = var8.field1669;
                                if (var9.field8532 != null) {
                                    var9 = var9.method3516(class189.field2681, 122);
                                }
                                if (var9 != null) {
                                    var4 = var9.field8566;
                                }
                            }
                        }
                    } else {
                        var4 = class181.field2574.method866(var3.field6294, (byte) 79).field8892;
                    }
                } else {
                    var4 = class181.field2574.method866((int) var3.field6297, (byte) 79).field8892;
                }
                if (var4 != null) {
                    var2 = var2 + class387.method2264(true, var4);
                }
            }
            if (class210.field2958 > 2) {
                var2 = var2 + "<col=ffffff> / " + (class210.field2958 + -2) + class464.field6545.method739(class173.field2491, 124);
            }
            if (arg0 < 35) {
                field5238 = -68;
            }
            if (class23.field344 == null) {
                if (class31.field508 != null && class245.field3415 == class163.field2363) {
                    int var10 = class515.field7246.method671(class374.field5033, class128.field2064, class78.field1268 + 4, var2, 0, class362.field4859, class160.field2344, 2, 16777215, class231.field3282 + 16);
                    class481.method2802(-127, class231.field3282, class78.field1268 + 4, 16, class40.field798.method2810(var2, (byte) 124) - -var10);
                    return;
                }
            } else {
                class91 var11 = class23.field344.method814(10, arg1);
                if (var11 == null) {
                    var11 = class515.field7246;
                }
                var11.method657(class224.field3217, 92, class374.field5033, class101.field1543, class23.field344.field1769, class160.field2344, class71.field1180, class362.field4859, class23.field344.field1853, class23.field344.field1874, class128.field2064, class23.field344.field1877, class23.field344.field1807, class23.field344.field1757, var2);
                class481.method2802(-128, class224.field3217[1], class224.field3217[0], class224.field3217[3], class224.field3217[2]);
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILvaa;)V")
    public final void method2299(int arg0, class399 arg1) {
        if (arg0 > 37) {
            this.field5487[this.field5405] = arg1;
            ++field5237;
            this.method2292(12);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lio;BI)V")
    private final void method2300(class370 arg0, byte arg1, int arg2) {
        ++field5345;
        this.method1609(this.field5509, -102);
        this.method1607(this.field5505, 0, false);
        this.method1638((byte) 76, 0, arg2, arg0);
        if (arg1 > -93) {
            this.method2334(-89, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "(IIIIII)Z")
    public final boolean method1263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5352;
        float var7 = this.field5383.method3177((float) arg2, (float) arg0, (byte) 75, (float) arg1);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field5383.method3177((float) arg5, (float) arg3, (byte) 53, (float) arg4);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field5434 > var7) || !((float) this.field5434 > var8)) && (!(var7 > (float) this.field5454) || !((float) this.field5454 < var8))) {
            int var9 = (int) ((float) this.field5429 * this.field5383.method3160(16383, (float) arg0, (float) arg1, (float) arg2) / var7);
            int var10 = (int) ((float) this.field5429 * this.field5383.method3160(16383, (float) arg3, (float) arg4, (float) arg5) / var8);
            if ((float) var9 < this.field5445 && this.field5445 > (float) var10 || this.field5450 < (float) var9 && this.field5450 < (float) var10) {
                return false;
            } else {
                int var11 = (int) ((float) this.field5459 * this.field5383.method3175(111, (float) arg1, (float) arg0, (float) arg2) / var7);
                int var12 = (int) ((float) this.field5459 * this.field5383.method3175(-36, (float) arg4, (float) arg3, (float) arg5) / var8);
                return (!((float) var11 < this.field5489) || !((float) var12 < this.field5489)) && (!(this.field5404 < (float) var11) || !(this.field5404 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "()Z")
    public final boolean method1294() {
        ++field5292;
        return this.field5455[3].method297((byte) -122);
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(Z)V")
    public final void method1309(boolean arg0) {
        this.field5389 = arg0;
        ++field5356;
        this.method1628((byte) -76);
    }

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "(Z)F")
    public abstract float method1596(boolean arg0);

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "(Z)V")
    private final void method2301(boolean arg0) {
        this.field5396 = (float) this.field5454 + -this.field5430;
        ++field5251;
        if (arg0) {
            this.field5374 = false;
        }
    }

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "(B)I")
    public final int method2302(byte arg0) {
        int var2 = 59 / ((-26 - arg0) / 61);
        ++field5351;
        return this.field5405;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BLdk;Lge;)Z")
    public abstract boolean method1636(byte arg0, class435 arg1, class608 arg2);

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "()Z")
    public final boolean method1323() {
        ++field5293;
        return this.field5463;
    }

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "()Z")
    public final boolean method1353() {
        ++field5335;
        return true;
    }

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "(B)V")
    public abstract void method1637(byte arg0);

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "(Z)V")
    public abstract void method1604(boolean arg0);

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "(I)V")
    public abstract void method1626(int arg0);

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(ZI)V")
    public final void method2303(boolean arg0, int arg1) {
        if (arg0 == !this.field5452) {
            this.field5452 = arg0;
            this.method1619((byte) 60);
            this.field5393 &= -32;
        }
        ++field5253;
        if (arg1 != -32) {
            this.method1601(-52);
        }
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(IZ)V")
    public final void method2304(int arg0, boolean arg1) {
        if (arg0 <= -79) {
            if (!arg1 == this.field5395) {
                this.field5395 = arg1;
                this.method1616((byte) -98);
                this.field5393 &= -32;
            }
            ++field5334;
        }
    }

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "(I)V")
    private final void method2305(int arg0) {
        ++field5312;
        if (arg0 <= -68) {
            if (!this.field5461) {
                float[] var2 = this.field5465;
                float var3 = (float) (-this.field5406 * this.field5434) / (float) this.field5429;
                float var4 = (float) ((-this.field5406 + this.field5302) * this.field5434) / (float) this.field5429;
                float var5 = (float) (this.field5473 * this.field5434) / (float) this.field5459;
                float var6 = (float) ((-this.field5331 + this.field5473) * this.field5434) / (float) this.field5459;
                if (var3 != var4 && var5 != var6) {
                    float var7 = (float) this.field5434 * 2.0F;
                    var2[13] = 0.0F;
                    var2[7] = 0.0F;
                    var2[15] = 0.0F;
                    var2[11] = -1.0F;
                    var2[3] = 0.0F;
                    var2[0] = var7 / (var4 - var3);
                    var2[14] = this.field5427 = (float) (this.field5454 * this.field5434) / (float) (-this.field5454 + this.field5434);
                    var2[1] = 0.0F;
                    var2[9] = (var5 + var6) / (var5 - var6);
                    var2[6] = 0.0F;
                    var2[4] = 0.0F;
                    var2[2] = 0.0F;
                    var2[10] = this.field5448 = (float) this.field5454 / (float) (-this.field5454 + this.field5434);
                    var2[8] = (var3 + var4) / (var4 - var3);
                    var2[5] = var7 / (var5 - var6);
                    var2[12] = 0.0F;
                } else {
                    var2[11] = 0.0F;
                    var2[3] = 0.0F;
                    var2[5] = 1.0F;
                    var2[2] = 0.0F;
                    var2[7] = 0.0F;
                    var2[10] = 1.0F;
                    var2[9] = 0.0F;
                    var2[15] = 1.0F;
                    var2[0] = 1.0F;
                    var2[14] = 0.0F;
                    var2[4] = 0.0F;
                    var2[8] = 0.0F;
                    var2[12] = 0.0F;
                    var2[13] = 0.0F;
                    var2[6] = 0.0F;
                    var2[1] = 0.0F;
                }
                this.method2311((byte) -124);
                this.field5461 = true;
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BZ)Llu;")
    public abstract class609 method1644(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(ZB)V")
    public final void method2306(boolean arg0, byte arg1) {
        if (this.field5468 != arg0) {
            this.field5468 = arg0;
            this.method1616((byte) -122);
        }
        ++field5281;
        if (arg1 >= -72) {
            this.field5215 = null;
        }
    }

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "(B)V")
    public abstract void method1628(byte arg0);

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "()V")
    public final void method1269() {
        ++field5348;
        if (this.field5511) {
            this.field5511 = false;
            this.method1604(true);
            this.method2280(true);
        }
        this.field5410 = 0;
        this.field5458 = this.field5331;
        this.field5432 = 0;
        this.field5419 = this.field5302;
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(IZ)V")
    public final void method2307(int arg0, boolean arg1) {
        if (arg0 < 2) {
            this.field5405 = -113;
        }
        ++field5225;
        if (arg1 == !this.field5478) {
            this.field5478 = arg1;
            this.method1597(-49);
        }
    }

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "(I)V")
    private final void method2308(int arg0) {
        ++field5326;
        if (!this.field5440) {
            float[] var2 = this.field5483;
            float var3 = (float) this.field5434 + -this.field5430;
            float var4 = (float) this.field5454 - this.field5430;
            float var5 = (float) (-this.field5473) * this.field5485 / (float) this.field5459;
            float var6 = (float) (-this.field5406) * this.field5485 / (float) this.field5429;
            float var7 = (float) (-this.field5406 + this.field5302) * this.field5485 / (float) this.field5429;
            float var8 = (float) (-this.field5473 + this.field5331) * this.field5485 / (float) this.field5459;
            if (var6 != var7 && var5 != var8) {
                var2[11] = 0.0F;
                var2[4] = 0.0F;
                var2[5] = 2.0F / (-var8 + var5);
                var2[15] = 1.0F;
                var2[1] = 0.0F;
                var2[9] = 0.0F;
                var2[3] = 0.0F;
                var2[12] = -(var6 + var7) / (-var6 + var7);
                var2[10] = -2.0F / (-var3 + var4);
                var2[14] = -(var3 + var4) / (var4 - var3);
                var2[2] = 0.0F;
                var2[13] = -(var5 + var8) / (-var8 + var5);
                var2[0] = 2.0F / (-var6 + var7);
                var2[6] = 0.0F;
                var2[8] = 0.0F;
                var2[7] = 0.0F;
            } else {
                var2[7] = 0.0F;
                var2[10] = 1.0F;
                var2[3] = 0.0F;
                var2[15] = 1.0F;
                var2[0] = 1.0F;
                var2[9] = 0.0F;
                var2[14] = 0.0F;
                var2[6] = 0.0F;
                var2[12] = 0.0F;
                var2[8] = 0.0F;
                var2[11] = 0.0F;
                var2[13] = 0.0F;
                var2[4] = 0.0F;
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[5] = 1.0F;
            }
            this.method2301(false);
            this.field5440 = true;
        }
        if (arg0 >= -38) {
            this.field5256 = 77;
        }
    }

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "(II)V")
    public final void method2309(int arg0, int arg1) {
        if (this.field5467 != arg0) {
            this.field5467 = arg0;
            this.method1620((byte) -125);
        }
        ++field5309;
        if (arg1 != -9683) {
            this.method1329(-91, 107, -78, 14, 82);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lpu;[Lbt;Z)Lra;")
    public final class91 method1348(class483 arg0, class38[] arg1, boolean arg2) {
        ++field5252;
        return new class535(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "(I)V")
    private final void method2310(int arg0) {
        this.method1587((byte) 37);
        ++field5250;
        if (arg0 != -28270) {
            this.method1588(true, (byte) 107);
        }
        this.method1600(4);
        this.method1640((byte) -77);
        this.method1649(1);
        this.method1621(-15077);
        this.method1597(-101);
        this.method1610(-12617);
        this.method1619((byte) 87);
        this.method1628((byte) -76);
        this.method1616((byte) -117);
        this.method1631(-19904);
        this.method1629(10972);
        this.method1624(37);
        this.method1601(-41);
        for (int var2 = this.field5457 + -1; ~var2 <= -1; --var2) {
            this.method2296(arg0 + 28270, var2);
            this.method1592(false);
            this.method1645(0);
            this.method2325(1);
        }
        this.method1620((byte) -125);
        this.method1626(9295);
        this.method1591(18204);
        this.method1635(-12);
        this.method1614(1);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5337;
    }

    @OriginalMember(owner = "client!wr", name = "G", descriptor = "(ILpa;II)V")
    public final void method1347(int arg0, class310 arg1, int arg2, int arg3) {
        ++field5350;
        class494 var5 = (class494) arg1;
        class617 var6 = var5.field6918;
        this.method2271(-28704);
        this.method2267(2, var6);
        this.method2317(1, 9);
        this.method2313(class137.field2155, -47, class137.field2155);
        this.method2315(class610.field8770, 0, 8);
        this.method2309(arg0, -9683);
        this.field5375.method3174(0.0F, (byte) 59, (float) this.field5302, (float) this.field5331);
        this.method2324(0);
        this.field5477[0].method3174(1.0F, (byte) 59, var6.method1814(126, (float) this.field5302), var6.method1815(25485, (float) this.field5331));
        this.field5477[0].method3180(var6.method1814(125, (float) (-arg2)), 0.0F, var6.method1815(25485, (float) (-arg3)), 126);
        this.field5487[0] = class510.field7141;
        this.method2292(12);
        this.method2330((byte) 116);
        this.method2325(1);
        this.method2315(class583.field8185, 0, 8);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BIILio;)V")
    public abstract void method1638(byte arg0, int arg1, int arg2, class370 arg3);

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "(Z)V")
    public abstract void method1618(boolean arg0);

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "(B)V")
    public abstract void method1640(byte arg0);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "([Lds;Z)Ltq;")
    public abstract class538 method1643(class14[] arg0, boolean arg1);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "([Lr;Lhp;Lm;[Lkn;I)V")
    public final void method1288(class157[] arg0, class274 arg1, class163 arg2, class631[] arg3, int arg4) {
        ++field5218;
        this.method1360(arg0, arg2, arg3, arg4);
        this.method1356(arg1);
    }

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "(B)V")
    public abstract void method1620(byte arg0);

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "(B)V")
    private final void method2311(byte arg0) {
        if (arg0 <= -121) {
            ++field5205;
            if (this.field5430 != 0.0F) {
                float var2 = this.field5466 / (this.field5466 + this.field5430);
                float var3 = var2 * var2;
                float var4 = (-var2 + 1.0F) * -this.field5427 * (-var2 + 1.0F) / this.field5430;
                this.field5465[14] = this.field5427 * var3;
                this.field5465[10] = this.field5448 + var4;
            } else {
                this.field5465[14] = this.field5427;
                this.field5465[10] = this.field5448;
            }
            this.field5439 = (this.field5465[14] - (float) this.field5454) / this.field5465[10];
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lsv;)V")
    public final void method1277(class567 arg0) {
        ++field5260;
        this.field5399 = (class521) arg0;
    }

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "()Z")
    public final boolean method1310() {
        ++field5369;
        return true;
    }

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "(I)V")
    private final void method2312(int arg0) {
        this.method1591(18204);
        ++field5357;
        if (this.field5476 != null) {
            this.field5476.method1487(false);
        }
        if (arg0 != 0) {
            this.field5256 = -73;
        }
    }

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "(I)V")
    public abstract void method1633(int arg0);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lhf;ILhf;)V")
    public final void method2313(class333 arg0, int arg1, class333 arg2) {
        ++field5202;
        boolean var4 = false;
        if (this.field5436[this.field5405] != arg2) {
            this.field5436[this.field5405] = arg2;
            this.method1592(false);
            var4 = true;
        }
        if (this.field5412[this.field5405] != arg0) {
            this.field5412[this.field5405] = arg0;
            this.method1645(0);
            var4 = true;
        }
        int var5 = 117 / ((53 - arg1) / 36);
        if (var4) {
            this.field5393 &= -30;
        }
    }

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "()V")
    public void method1276() {
        if (!this.field5435) {
            for (class176 var1 = this.field5231.method456((byte) -91); var1 != null; var1 = this.field5231.method460((byte) -102)) {
                ((class250) var1).method1533(-101);
            }
            Enumeration var2 = this.field5370.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method1595(this.field5370.get(var3), var3, 9);
            }
            class278.method1792(true, false, false);
            this.field5322.release();
            this.field5435 = true;
        }
        ++field5324;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;B)V")
    public abstract void method1642(Canvas arg0, Object arg1, byte arg2);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lbt;Z)Lha;")
    public final class52 method1332(class38 arg0, boolean arg1) {
        ++field5353;
        class52 var10;
        if (~arg0.field785 != -1 && arg0.field783 != 0) {
            int[] var3 = new int[arg0.field785 * arg0.field783];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field790 == null) {
                for (int var6 = 0; arg0.field783 > var6; ++var6) {
                    for (int var7 = 0; ~var7 > ~arg0.field785; ++var7) {
                        int var8 = arg0.field784[255 & arg0.field782[var4++]];
                        var3[var5++] = var8 == 0 ? 0 : class73.method578(var8, -16777216);
                    }
                }
            } else {
                for (int var9 = 0; arg0.field783 > var9; ++var9) {
                    for (int var11 = 0; var11 < arg0.field785; ++var11) {
                        var3[var5++] = class73.method578(arg0.field790[var4] << 24, arg0.field784[class589.method3454(arg0.field782[var4], 255)]);
                        ++var4;
                    }
                }
            }
            var10 = this.method1363(var3, 0, arg0.field785, arg0.field785, arg0.field783);
        } else {
            var10 = this.method1363(new int[1], 0, 1, 1, 1);
        }
        var10.method420(arg0.field787, arg0.field786, arg0.field789, arg0.field788);
        return var10;
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "()I")
    public final int method1301() {
        ++field5313;
        return this.field5434;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "([[IIZZ)Ljg;")
    public abstract class284 method1613(int[][] arg0, int arg1, boolean arg2, boolean arg3);

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(IIII)V")
    public final void method1365(int arg0, int arg1, int arg2, int arg3) {
        this.field5429 = arg2;
        ++field5262;
        this.field5406 = arg0;
        this.field5459 = arg3;
        this.field5473 = arg1;
        this.method2314(false);
        this.method2335((byte) -82);
        this.method2328(-11863);
        this.method2280(true);
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1262(Canvas arg0) {
        ++field5244;
        if (this.field5215 == arg0) {
            throw new RuntimeException();
        } else if (this.field5370.containsKey(arg0)) {
            this.method1595(this.field5370.get(arg0), arg0, 9);
            this.field5370.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "()Z")
    public final boolean method1273() {
        ++field5246;
        return true;
    }

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "(I)V")
    public abstract void method1610(int arg0);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIII)V")
    public final void method1278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5366;
    }

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "(Z)V")
    private final void method2314(boolean arg0) {
        this.field5388 = arg0;
        ++field5207;
        if (class305.field4156 == this.field5431) {
            this.method2308(-40);
            this.method2312(0);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)I")
    public final int method1306(int arg0, int arg1) {
        ++field5264;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "(I)V")
    public abstract void method1591(int arg0);

    @OriginalMember(owner = "client!wr", name = "xa", descriptor = "()V")
    public final void method1352() {
        ++field5381;
        this.field5446 = false;
        this.method2270(0, 0, false, (byte) 53, false, 0);
        this.method2340(-4887);
        this.method1616((byte) -96);
    }

    @OriginalMember(owner = "client!wr", name = "UA", descriptor = "(IIIII)V")
    public final void method1329(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5282;
        this.method1349(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lvf;II)V")
    public final void method2315(class131 arg0, int arg1, int arg2) {
        ++field5321;
        if (arg2 == 8) {
            this.method1641(false, false, arg1, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lge;Ldk;BII)Lwn;")
    public abstract class617 method1650(class608 arg0, class435 arg1, byte arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ldk;IB[FIZ)Lwn;")
    public final class617 method2316(class435 arg0, int arg1, byte arg2, float[] arg3, int arg4, boolean arg5) {
        ++field5362;
        if (arg2 != -33) {
            this.method2343(103);
        }
        return this.method1612(0, arg0, arg4, arg3, 102, 0, arg1, arg5);
    }

    @OriginalMember(owner = "client!wr", name = "D", descriptor = "(I)V")
    public abstract void method1597(int arg0);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIILpa;II)V")
    public final void method1266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class310 arg6, int arg7, int arg8) {
        ++field5306;
    }

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "(II)V")
    public final void method2317(int arg0, int arg1) {
        if (~this.field5480 != ~arg0) {
            boolean var3;
            class200 var4;
            boolean var5;
            if (~arg0 == -2) {
                var3 = true;
                var4 = class528.field7406;
                var5 = true;
            } else if (arg0 == 2) {
                var5 = false;
                var4 = class166.field2388;
                var3 = true;
            } else if (arg0 == 128) {
                var4 = class132.field2114;
                var3 = true;
                var5 = true;
            } else {
                var5 = false;
                var3 = false;
                var4 = class582.field7987;
            }
            if (!var5 != !this.field5428) {
                this.field5428 = var5;
                this.method1601(arg1 ^ -65);
            }
            if (!this.field5481 != !var3) {
                this.field5481 = var3;
                this.method1629(10972);
            }
            if (this.field5437 != var4) {
                this.field5437 = var4;
                this.method1624(52);
            }
            this.field5393 &= -29;
            this.field5480 = arg0;
        }
        if (arg1 == 9) {
            ++field5363;
        }
    }

    @OriginalMember(owner = "client!wr", name = "E", descriptor = "(III)V")
    public final void method1334(int arg0, int arg1, int arg2) {
        ++field5261;
        if (~this.field5460 != ~arg0 || ~this.field5398 != ~arg1 || this.field5423 != arg2) {
            this.field5398 = arg1;
            this.field5460 = arg0;
            this.field5423 = arg2;
            if (this.field5446) {
                return;
            }
            this.method2340(-4887);
            this.method1616((byte) -118);
        }
    }

    @OriginalMember(owner = "client!wr", name = "E", descriptor = "(I)V")
    public final void method2318(int arg0) {
        if (arg0 != 2) {
            this.method1631(-72);
        }
        ++field5316;
        Enumeration var2 = this.field5370.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method1595(this.field5370.get(var3), var3, 9);
        }
        this.field5505.method618((byte) 86);
        this.field5502.method618((byte) 112);
        this.field5499.method357((byte) -118);
        this.field5496.method357((byte) -66);
        this.field5492.method357((byte) -100);
        this.field5507.method357((byte) -108);
        this.field5493.method357((byte) -85);
        this.field5444.method205(arg0 + 2084491402);
        this.field5491.method618((byte) 107);
    }

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "()Lm;")
    public final class163 method1318() {
        ++field5203;
        return new class557();
    }

    @OriginalMember(owner = "client!wr", name = "F", descriptor = "(I)V")
    private final void method2319(int arg0) {
        ++field5330;
        if (~this.field5393 != -2) {
            this.method2282(true);
            this.method2304(-98, false);
            this.method2276(false, -8);
            this.method2303(false, -32);
            this.method2275(-32491, false);
            this.method2344((byte) 44, -2, false, false);
            this.method2334(1, (byte) 103);
            this.method2267(arg0 ^ 26848, this.field5407);
            this.field5393 = 1;
        }
        if (arg0 != 26850) {
            this.method1275((Canvas) null);
        }
    }

    @OriginalMember(owner = "client!wr", name = "L", descriptor = "(I)V")
    public final void method1302(int arg0) {
        ++field5295;
        this.field5394 = 0;
        while (~arg0 < -2) {
            ++this.field5394;
            arg0 >>= 1;
        }
        this.field5418 = 1 << this.field5394;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IB)V")
    public final void method2320(int arg0, byte arg1) {
        this.method2309(arg1 | arg1 << 16 | arg1 << 24 | arg1 << 8, -9683);
        ++field5346;
        if (arg0 != -844778712) {
            this.method1280(101);
        }
    }

    @OriginalMember(owner = "client!wr", name = "M", descriptor = "(F)V")
    public final void method1295(float arg0) {
        ++field5291;
        if (this.field5469 != arg0) {
            this.field5469 = arg0;
            this.field5322.setAmbient(arg0);
            this.method1587((byte) 37);
            this.method1597(-84);
        }
    }

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "(B)V")
    private final void method2321(byte arg0) {
        this.method1609(this.field5506, -115);
        ++field5206;
        this.method1607(this.field5502, 0, false);
        this.method1638((byte) 76, 0, 1, class495.field6928);
        if (arg0 > -50) {
            this.field5482 = -0.4298392F;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[IIIZ)Lwn;")
    public final class617 method2322(int arg0, int[] arg1, int arg2, int arg3, boolean arg4) {
        if (arg3 != 8) {
            return null;
        } else {
            ++field5227;
            return this.method1606((byte) 84, 0, arg0, arg4, 0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "([I)V")
    public final void method1350(int[] arg0) {
        arg0[3] = this.field5458;
        arg0[0] = this.field5432;
        arg0[2] = this.field5419;
        ++field5263;
        arg0[1] = this.field5410;
    }

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "(I)Lu;")
    public final class64 method1359(int arg0) {
        ++field5285;
        class250 var2 = new class250(arg0);
        this.field5231.method463(var2, -122);
        return var2;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public final class174 method1270(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5304;
        return new class352(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "(B)[F")
    public final float[] method2323(byte arg0) {
        if (arg0 < 74) {
            return null;
        } else {
            ++field5254;
            return this.field5415;
        }
    }

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "()Lm;")
    public final class163 method1344() {
        ++field5233;
        return this.field5497;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIILdk;I[B)Luda;")
    public abstract class383 method1634(int arg0, int arg1, int arg2, class435 arg3, int arg4, byte[] arg5);

    @OriginalMember(owner = "client!wr", name = "G", descriptor = "(I)V")
    public abstract void method1600(int arg0);

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "()I")
    public final int method1313() {
        ++field5286;
        return this.field5392 + -2;
    }

    @OriginalMember(owner = "client!wr", name = "H", descriptor = "(I)V")
    private final void method2324(int arg0) {
        ++field5245;
        if (class319.field4319 == this.field5431) {
            float var2 = this.method1596(true);
            this.field5375.method3180(var2, 0.0F, var2, arg0 ^ 113);
        }
        this.field5424 = false;
        this.method1635(-123);
        if (arg0 != 0) {
            this.method1604(true);
        }
        if (this.field5476 != null) {
            this.field5476.method1485(-1);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIF)Lrh;")
    public final class223 method1320(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field5354;
        return new class451(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!wr", name = "I", descriptor = "(I)V")
    public abstract void method1614(int arg0);

    @OriginalMember(owner = "client!wr", name = "J", descriptor = "(I)V")
    public final void method2325(int arg0) {
        if (arg0 != 1) {
            this.method1609((class538) null, 31);
        }
        ++field5307;
        if (this.field5487[this.field5405] != class353.field4778) {
            this.field5487[this.field5405] = class353.field4778;
            this.field5477[this.field5405].method1045();
            this.method2292(12);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lr;Lhp;Lm;Lkn;I)V")
    public final void method1366(class157 arg0, class274 arg1, class163 arg2, class631 arg3, int arg4) {
        arg0.method154(arg2, arg3, arg4);
        ++field5333;
        this.method1356(arg1);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IILvf;)V")
    public final void method2326(int arg0, int arg1, class131 arg2) {
        ++field5367;
        if (arg0 < 79) {
            this.method2292(60);
        }
        this.method1590((byte) -89, arg1, arg2, false);
    }

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "(Z)V")
    public abstract void method1592(boolean arg0);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1260(Canvas arg0) {
        ++field5343;
        if (this.field5215 == arg0) {
            throw new RuntimeException();
        } else if (!this.field5370.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method1598(16, arg0);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field5370.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "()Z")
    public final boolean method1319() {
        ++field5305;
        return false;
    }

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "(IIIII)V")
    public final void method1312(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5232;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IILdk;ZI[B)Lwn;")
    public final class617 method2327(int arg0, int arg1, class435 arg2, boolean arg3, int arg4, byte[] arg5) {
        ++field5340;
        if (arg0 != -20920) {
            this.method2346(52);
        }
        return this.method1603(arg3, 0, arg1, arg2, 0, arg4, arg5, 0);
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ln;Lan;II)V")
    public class388(Canvas arg0, Object arg1, class17 arg2, class21 arg3, int arg4, int arg5) {
        super(arg2);
        this.field5287 = this.field5224 = arg1;
        this.field5283 = this.field5215 = arg0;
        this.field5425 = arg4;
        this.field5315 = arg3;
        Dimension var7 = arg0.getSize();
        this.field5302 = this.field5256 = var7.width;
        this.field5331 = this.field5223 = var7.height;
        this.field5417 = arg5;
        class568.method3231(122, true, false);
        this.field5447 = new class242(this, super.field2924);
        this.field5322 = new NativeInterface(super.field2924.method189(5399), this.field5417);
        for (int var8 = 0; ~super.field2924.method189(5399) < ~var8; ++var8) {
            class211 var9 = super.field2924.method190((byte) -89, var8);
            if (var9 != null) {
                this.field5322.initTextureMetrics(var8, var9.field2973, var9.field2975);
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "K", descriptor = "(I)V")
    public final void method2328(int arg0) {
        ++field5364;
        if (arg0 != -11863) {
            this.field5458 = 48;
        }
        if (class461.field6469 != this.field5431) {
            class150 var2 = this.field5431;
            this.field5431 = class461.field6469;
            if (var2.method984((byte) 84)) {
                this.method2274(3);
            }
            this.field5441 = this.field5415;
            this.field5393 &= -32;
        }
    }

    @OriginalMember(owner = "client!wr", name = "M", descriptor = "(I)V")
    public abstract void method1645(int arg0);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lvc;I)V")
    public abstract void method1647(class264 arg0, int arg1);

    @OriginalMember(owner = "client!wr", name = "N", descriptor = "(I)V")
    private final void method2329(int arg0) {
        ++field5360;
        if (class457.field6436 != this.field5431) {
            class150 var2 = this.field5431;
            this.field5431 = class457.field6436;
            if (!var2.method984((byte) 84)) {
                this.method2274(3);
            }
            this.method2305(-88);
            this.field5441 = this.field5465;
            this.method2312(0);
            this.field5393 &= -8;
        }
        if (arg0 != -8) {
            this.method2344((byte) -12, -4, false, false);
        }
    }

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "(B)V")
    public final void method2330(byte arg0) {
        this.method2300(class509.field7106, (byte) -123, 2);
        if (arg0 >= 23) {
            ++field5210;
        }
    }

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "(B)Log;")
    public final class557 method2331(byte arg0) {
        if (arg0 != -31) {
            return null;
        } else {
            ++field5270;
            return this.field5477[this.field5405];
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "([Lr;Lm;[Lkn;I)V")
    public final void method1360(class157[] arg0, class163 arg1, class631[] arg2, int arg3) {
        ++field5272;
        for (int var5 = 0; ~arg0.length < ~var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method154(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "(B)I")
    public final int method2332(byte arg0) {
        if (arg0 != 33) {
            this.method2304(-110, false);
        }
        ++field5359;
        return this.field5421;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
    public final void method1272(int arg0) {
        ++field5347;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1343(Canvas arg0) {
        ++field5355;
        this.field5283 = null;
        this.field5287 = null;
        if (arg0 != null && this.field5215 != arg0) {
            if (this.field5370.containsKey(arg0)) {
                this.field5287 = this.field5370.get(arg0);
                this.field5283 = arg0;
            }
        } else {
            this.field5287 = this.field5224;
            this.field5283 = this.field5215;
        }
        if (this.field5283 != null && this.field5287 != null) {
            this.method1630(1, this.field5283, this.field5287);
            this.method2295(121);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILog;)V")
    public final void method2333(int arg0, class557 arg1) {
        ++field5289;
        this.field5375.method1049(arg1);
        this.field5374 = false;
        if (arg0 >= -61) {
            this.field5510 = 63;
        }
        this.method2324(0);
    }

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "()Z")
    public final boolean method1346() {
        ++field5303;
        return true;
    }

    @OriginalMember(owner = "client!wr", name = "CA", descriptor = "()I")
    public final int method1282() {
        ++field5239;
        return this.field5454;
    }

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "(II)Lcj;")
    public class595 method1648(int arg0, int arg1) {
        ++field5235;
        if (arg0 != 0) {
            this.method1333(-0.35060373F, -0.23585312F);
        }
        if (~arg1 != -7) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    return ~arg1 == -8 ? new class26(this) : new class378(this);
                } else {
                    return new class644(this, this.field5349);
                }
            } else {
                return new class498(this);
            }
        } else {
            return new class34(this);
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(IB)V")
    public final void method2334(int arg0, byte arg1) {
        ++field5332;
        int var3 = 37 / ((arg1 - 3) / 57);
        if (arg0 != 1) {
            if (arg0 == 0) {
                this.method2313(class167.field2417, 101, class167.field2417);
            } else if (~arg0 != -3) {
                if (arg0 != 3) {
                    if (arg0 == 4) {
                        this.method2313(class337.field4494, 89, class337.field4494);
                        return;
                    }
                } else {
                    this.method2313(class167.field2417, 3, class205.field2890);
                }
            } else {
                this.method2313(class137.field2155, 7, class583.field8102);
            }
        } else {
            this.method2313(class137.field2155, 14, class137.field2155);
        }
    }

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "(B)V")
    private final void method2335(byte arg0) {
        this.field5461 = false;
        if (arg0 > -31) {
            this.method2282(false);
        }
        ++field5279;
        this.method2305(-126);
        if (class457.field6436 == this.field5431) {
            this.method2312(0);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lln;IIII)Lr;")
    public final class157 method1293(class317 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5329;
        return new class35(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lm;)V")
    public final void method1355(class163 arg0) {
        this.field5383 = (class557) arg0;
        ++field5236;
        this.field5385.method1049(this.field5383);
        this.field5385.method3169((byte) 119);
        this.field5386.method3159(this.field5385, -11);
        this.field5384.method3159(this.field5383, -11);
        if (this.field5431.method984((byte) 84)) {
            this.method2274(3);
        }
    }

    @OriginalMember(owner = "client!wr", name = "O", descriptor = "(I)V")
    public void method1649(int arg0) {
        ++field5277;
        this.field5472 = this.field5488;
        if (arg0 != 1) {
            this.method1648(13, 65);
        }
        this.field5488 = 0;
    }

    @OriginalMember(owner = "client!wr", name = "P", descriptor = "(I)Ljg;")
    public final class284 method2336(int arg0) {
        ++field5198;
        if (arg0 != 17812) {
            this.field5410 = 17;
        }
        return this.field5399 == null ? null : this.field5399.method478((byte) -73);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZZILvf;I)V")
    public abstract void method1641(boolean arg0, boolean arg1, int arg2, class131 arg3, int arg4);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lhp;)V")
    public final void method1356(class274 arg0) {
        ++field5327;
        this.field5444.method210(this, (byte) -50, arg0);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public abstract void method1595(Object arg0, Canvas arg1, int arg2);

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(ZI)V")
    public abstract void method1608(boolean arg0, int arg1);

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "()Z")
    public final boolean method1340() {
        ++field5219;
        return true;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZILuj;IIILio;)V")
    public abstract void method1615(boolean arg0, int arg1, class321 arg2, int arg3, int arg4, int arg5, class370 arg6);

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(IIIIII)V")
    public final void method1325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5197;
        float var7 = this.method1596(true);
        this.method2319(26850);
        this.method2309(arg4, -9683);
        this.method2315(class610.field8770, 0, 8);
        this.method2326(84, 0, class610.field8770);
        this.method2317(arg5, 9);
        this.field5375.method3174(1.0F, (byte) 59, (float) (arg2 + -1), (float) (arg3 + -1));
        this.field5375.method3180((float) arg0 - var7, 0.0F, (float) arg1 - var7, 47);
        this.method2324(0);
        this.method1608(false, 16777215);
        this.method2300(class111.field1718, (byte) -98, 4);
        this.method1608(true, 16777215);
        this.method2326(109, 0, class583.field8185);
        this.method2315(class583.field8185, 0, 8);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIZ)Lha;")
    public final class52 method1300(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5300;
        class280 var6 = new class280(this, arg2, arg3, arg4);
        var6.method494(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!wr", name = "Q", descriptor = "(I)Log;")
    public final class557 method2337(int arg0) {
        if (arg0 != -22447) {
            this.field5441 = null;
        }
        ++field5267;
        return this.field5386;
    }

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "()V")
    public final void method1337() {
        ++field5314;
        this.field5447.method1514(true);
    }

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "(B)V")
    public final void method2338(byte arg0) {
        if (~this.field5393 != -17) {
            this.method2284((byte) -29);
            this.method2304(-80, true);
            this.method2303(true, -32);
            this.method2275(-32491, true);
            this.method2317(1, 9);
            this.field5393 = 16;
        }
        ++field5317;
        if (arg0 >= -124) {
            this.field5390 = 82;
        }
    }

    @OriginalMember(owner = "client!wr", name = "R", descriptor = "(I)V")
    public abstract void method1635(int arg0);

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(Z)V")
    public final void method1364(boolean arg0) {
        ++field5371;
    }

    @OriginalMember(owner = "client!wr", name = "S", descriptor = "(I)V")
    public final void method2339(int arg0) {
        ++field5336;
        this.field5375.method1045();
        this.field5374 = true;
        if (arg0 != 30101) {
            this.method1297(-42);
        }
        this.method2324(0);
    }

    @OriginalMember(owner = "client!wr", name = "T", descriptor = "(I)V")
    private final void method2340(int arg0) {
        ++field5228;
        if (arg0 != -4887) {
            this.field5414 = null;
        }
        if (this.field5476 != null) {
            this.field5476.method1484((byte) -127);
        }
        this.method1631(-19904);
    }

    @OriginalMember(owner = "client!wr", name = "U", descriptor = "()I")
    public final int method1286() {
        ++field5214;
        return this.field5379 - (-this.field5377 + -this.field5376);
    }

    @OriginalMember(owner = "client!wr", name = "U", descriptor = "(I)V")
    public abstract void method1624(int arg0);

    @OriginalMember(owner = "client!wr", name = "N", descriptor = "(IIII)V")
    public final void method1308(int arg0, int arg1, int arg2, int arg3) {
        this.field5419 = arg2 <= this.field5302 ? arg2 : 0;
        this.field5458 = ~arg3 < ~this.field5302 ? 0 : arg3;
        this.field5432 = arg0 < 0 ? 0 : arg0;
        ++field5240;
        this.field5410 = ~arg1 <= -1 ? arg1 : 0;
        if (~this.field5432 >= -1 && this.field5302 <= this.field5419 && this.field5410 <= 0 && ~this.field5458 <= ~this.field5331) {
            this.method1269();
        } else {
            if (!this.field5511) {
                this.field5511 = true;
                this.method1604(true);
            }
            this.method1637((byte) -127);
            this.method2280(true);
        }
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)V")
    public final void method1297(int arg0) {
        ++field5265;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field5416 = arg0;
            this.field5447.method1514(true);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wr", name = "V", descriptor = "(I)V")
    public static void method2341(int arg0) {
        if (arg0 != 16) {
            field5230 = null;
        }
        field5230 = null;
    }

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "(B)Log;")
    public final class557 method2342(byte arg0) {
        ++field5229;
        int var2 = -97 / ((-28 - arg0) / 53);
        return this.field5375;
    }

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "()Z")
    public final boolean method1285() {
        ++field5208;
        return false;
    }

    @OriginalMember(owner = "client!wr", name = "W", descriptor = "(I)V")
    private final void method2343(int arg0) {
        if (!this.field5388) {
            float[] var2 = this.field5483;
            this.field5388 = true;
            if (this.field5302 != 0 && this.field5331 != 0) {
                var2[2] = 0.0F;
                var2[3] = 0.0F;
                var2[14] = 0.5F;
                var2[13] = 1.0F;
                var2[8] = 0.0F;
                var2[11] = 0.0F;
                var2[0] = 2.0F / (float) this.field5302;
                var2[1] = 0.0F;
                var2[9] = 0.0F;
                var2[7] = 0.0F;
                var2[5] = -2.0F / (float) this.field5331;
                var2[15] = 1.0F;
                var2[6] = 0.0F;
                var2[4] = 0.0F;
                var2[10] = 0.5F;
                var2[12] = -1.0F;
            } else {
                var2[10] = 1.0F;
                var2[6] = 0.0F;
                var2[2] = 0.0F;
                var2[12] = 0.0F;
                var2[1] = 0.0F;
                var2[14] = 0.0F;
                var2[3] = 0.0F;
                var2[13] = 0.0F;
                var2[5] = 1.0F;
                var2[0] = 1.0F;
                var2[8] = 0.0F;
                var2[7] = 0.0F;
                var2[15] = 1.0F;
                var2[4] = 0.0F;
                var2[11] = 0.0F;
                var2[9] = 0.0F;
            }
        }
        ++field5242;
        if (arg0 != 3734) {
            this.method1635(-103);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I[Lrh;)V")
    public final void method1311(int arg0, class223[] arg1) {
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field5400[var3] = arg1[var3];
        }
        ++field5325;
        this.field5488 = arg0;
        if (this.field5431.method984((byte) 84)) {
            this.method1649(1);
        }
    }

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "(II)V")
    public abstract void method1594(int arg0, int arg1);

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(II)I")
    public final int method1357(int arg0, int arg1) {
        ++field5311;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lu;)V")
    public final void method1296(class64 arg0) {
        ++field5226;
        this.field5365 = ((class250) arg0).field3450;
        this.field5339 = this.field5365.method3286(32768, false);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIII)Lsv;")
    public final class567 method1261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5269;
        return new class49(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BIZZ)V")
    public final void method2344(byte arg0, int arg1, boolean arg2, boolean arg3) {
        ++field5338;
        if (~this.field5464 != ~arg1) {
            if (~arg1 > -1) {
                this.method2325(1);
                this.method2267(2, (class445) null);
                this.method2334(0, (byte) -58);
                if (!this.field5446) {
                    this.method2270(0, 0, arg3, (byte) 117, arg2, 0);
                }
            } else {
                class617 var5 = this.field5447.method1510(arg1, 64);
                class211 var6 = super.field2924.method190((byte) -89, arg1);
                if (~var6.field2968 == -1 && ~var6.field2986 == -1) {
                    this.method2325(1);
                } else {
                    int var7 = !var6.field2965 ? 128 : 64;
                    int var8 = var7 * 50;
                    class557 var9 = this.method2289(-103);
                    var9.method3170(9, 0.0F, (float) (this.field5401 % var8 * var6.field2968) / (float) var8, (float) (this.field5401 % var8 * var6.field2986) / (float) var8);
                    this.method2299(117, class510.field7141);
                }
                if (!this.field5446) {
                    this.method2270(var6.field2966, var6.field2972, arg3, (byte) 87, arg2, var6.field2984);
                }
                if (this.field5476 == null) {
                    this.method2267(2, var5);
                    this.method2334(var6.field2978, (byte) -108);
                } else {
                    this.field5476.method301(var5, -1, var6.field2978);
                }
            }
            this.field5464 = arg1;
        }
        this.field5393 &= -8;
        if (arg0 < 11) {
            this.field5409 = 71;
        }
    }

    @OriginalMember(owner = "client!wr", name = "X", descriptor = "(I)V")
    public final void method2345(int arg0) {
        ++field5382;
        this.method2328(-11863);
        this.method2312(0);
        if (arg0 != 10) {
            this.field5349 = null;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ltq;I)V")
    public abstract void method1609(class538 arg0, int arg1);

    @OriginalMember(owner = "client!wr", name = "Y", descriptor = "(I)V")
    private final void method2346(int arg0) {
        this.field5388 = false;
        ++field5280;
        int var2 = -19 / ((-72 - arg0) / 39);
        if (class319.field4319 == this.field5431) {
            this.method2343(3734);
            this.method2312(0);
        }
    }
}
