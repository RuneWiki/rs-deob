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

@OriginalClass("client!ifa")
public abstract class class393 extends class165 {

    @OriginalMember(owner = "client!ifa", name = "Pb", descriptor = "Loe;")
    private class183 field5322 = new class183();

    @OriginalMember(owner = "client!ifa", name = "Td", descriptor = "Z")
    public boolean field5430 = true;

    @OriginalMember(owner = "client!ifa", name = "Ld", descriptor = "Ldd;")
    public class653 field5422 = new class653();

    @OriginalMember(owner = "client!ifa", name = "Vd", descriptor = "Ldd;")
    public class653 field5432 = new class653();

    @OriginalMember(owner = "client!ifa", name = "Wd", descriptor = "Ldd;")
    public class653 field5433 = new class653();

    @OriginalMember(owner = "client!ifa", name = "Xd", descriptor = "Ldd;")
    public class653 field5434 = new class653();

    @OriginalMember(owner = "client!ifa", name = "Yd", descriptor = "Ldd;")
    private class653 field5435 = new class653();

    @OriginalMember(owner = "client!ifa", name = "Zd", descriptor = "Ldd;")
    private class653 field5436 = new class653();

    @OriginalMember(owner = "client!ifa", name = "de", descriptor = "[F")
    public float[] field5440 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!ifa", name = "ae", descriptor = "I")
    private int field5437 = 0;

    @OriginalMember(owner = "client!ifa", name = "me", descriptor = "I")
    public int field5449 = -1;

    @OriginalMember(owner = "client!ifa", name = "ee", descriptor = "I")
    public int field5441 = 3;

    @OriginalMember(owner = "client!ifa", name = "He", descriptor = "I")
    public int field5470 = 512;

    @OriginalMember(owner = "client!ifa", name = "je", descriptor = "F")
    public float field5446 = 1.0F;

    @OriginalMember(owner = "client!ifa", name = "ye", descriptor = "Z")
    public boolean field5461 = true;

    @OriginalMember(owner = "client!ifa", name = "ce", descriptor = "I")
    public int field5439 = 0;

    @OriginalMember(owner = "client!ifa", name = "Ke", descriptor = "Z")
    public boolean field5473 = true;

    @OriginalMember(owner = "client!ifa", name = "Te", descriptor = "I")
    public int field5482 = 0;

    @OriginalMember(owner = "client!ifa", name = "ze", descriptor = "F")
    public float field5462 = -1.0F;

    @OriginalMember(owner = "client!ifa", name = "le", descriptor = "I")
    private int field5448 = 0;

    @OriginalMember(owner = "client!ifa", name = "We", descriptor = "I")
    private int field5485 = 16777215;

    @OriginalMember(owner = "client!ifa", name = "Le", descriptor = "[F")
    private float[] field5474 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ifa", name = "xe", descriptor = "Z")
    public boolean field5460 = true;

    @OriginalMember(owner = "client!ifa", name = "Je", descriptor = "I")
    public int field5472 = 0;

    @OriginalMember(owner = "client!ifa", name = "se", descriptor = "I")
    public int field5455 = 0;

    @OriginalMember(owner = "client!ifa", name = "Ce", descriptor = "I")
    private int field5465 = -1;

    @OriginalMember(owner = "client!ifa", name = "Ie", descriptor = "I")
    public int field5471 = -1;

    @OriginalMember(owner = "client!ifa", name = "bf", descriptor = "I")
    public int field5490 = 512;

    @OriginalMember(owner = "client!ifa", name = "Ae", descriptor = "Z")
    private boolean field5463 = false;

    @OriginalMember(owner = "client!ifa", name = "mf", descriptor = "Z")
    public boolean field5500 = false;

    @OriginalMember(owner = "client!ifa", name = "De", descriptor = "I")
    private int field5466 = 1;

    @OriginalMember(owner = "client!ifa", name = "rf", descriptor = "I")
    public int field5505 = 8;

    @OriginalMember(owner = "client!ifa", name = "Qe", descriptor = "Z")
    private boolean field5479 = false;

    @OriginalMember(owner = "client!ifa", name = "yf", descriptor = "F")
    public float field5512 = 1.0F;

    @OriginalMember(owner = "client!ifa", name = "tf", descriptor = "F")
    public float field5507 = -1.0F;

    @OriginalMember(owner = "client!ifa", name = "Ue", descriptor = "F")
    private float field5483 = 1.0F;

    @OriginalMember(owner = "client!ifa", name = "ef", descriptor = "Z")
    private boolean field5493 = false;

    @OriginalMember(owner = "client!ifa", name = "Ve", descriptor = "I")
    public int field5484 = 0;

    @OriginalMember(owner = "client!ifa", name = "sf", descriptor = "I")
    public int field5506 = 50;

    @OriginalMember(owner = "client!ifa", name = "kf", descriptor = "I")
    private int field5498 = -1;

    @OriginalMember(owner = "client!ifa", name = "be", descriptor = "Z")
    public boolean field5438 = false;

    @OriginalMember(owner = "client!ifa", name = "Ee", descriptor = "F")
    public float field5467 = 3584.0F;

    @OriginalMember(owner = "client!ifa", name = "Pe", descriptor = "[F")
    private float[] field5478 = new float[16];

    @OriginalMember(owner = "client!ifa", name = "Oe", descriptor = "I")
    private int field5477 = 0;

    @OriginalMember(owner = "client!ifa", name = "wf", descriptor = "I")
    public int field5510 = 0;

    @OriginalMember(owner = "client!ifa", name = "Se", descriptor = "F")
    public float field5481 = 1.0F;

    @OriginalMember(owner = "client!ifa", name = "jf", descriptor = "Z")
    private boolean field5497 = false;

    @OriginalMember(owner = "client!ifa", name = "Jf", descriptor = "Z")
    public boolean field5523 = true;

    @OriginalMember(owner = "client!ifa", name = "Hf", descriptor = "[F")
    private float[] field5521 = new float[16];

    @OriginalMember(owner = "client!ifa", name = "ie", descriptor = "[Ljfa;")
    private class262[] field5445 = new class262[10];

    @OriginalMember(owner = "client!ifa", name = "Me", descriptor = "Z")
    public boolean field5475 = false;

    @OriginalMember(owner = "client!ifa", name = "Nf", descriptor = "I")
    public int field5527 = 0;

    @OriginalMember(owner = "client!ifa", name = "Gf", descriptor = "[F")
    public float[] field5520 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ifa", name = "Of", descriptor = "Z")
    private boolean field5528 = false;

    @OriginalMember(owner = "client!ifa", name = "cf", descriptor = "F")
    public float field5491 = 1.0F;

    @OriginalMember(owner = "client!ifa", name = "xf", descriptor = "Lrf;")
    public class74 field5511 = class328.field4373;

    @OriginalMember(owner = "client!ifa", name = "Pf", descriptor = "F")
    public float field5529 = 3584.0F;

    @OriginalMember(owner = "client!ifa", name = "Rf", descriptor = "I")
    public int field5531 = 0;

    @OriginalMember(owner = "client!ifa", name = "Lf", descriptor = "[F")
    private float[] field5525 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ifa", name = "pf", descriptor = "Lgv;")
    public class72 field5503 = class112.field1436;

    @OriginalMember(owner = "client!ifa", name = "Df", descriptor = "I")
    public int field5517 = 0;

    @OriginalMember(owner = "client!ifa", name = "If", descriptor = "Z")
    public boolean field5522 = false;

    @OriginalMember(owner = "client!ifa", name = "ue", descriptor = "[F")
    private float[] field5457 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ifa", name = "Re", descriptor = "I")
    public int field5480 = 0;

    @OriginalMember(owner = "client!ifa", name = "Uf", descriptor = "[F")
    private float[] field5534 = new float[16];

    @OriginalMember(owner = "client!ifa", name = "gf", descriptor = "Z")
    private boolean field5495 = false;

    @OriginalMember(owner = "client!ifa", name = "Vf", descriptor = "I")
    public int field5535 = 3584;

    @OriginalMember(owner = "client!ifa", name = "pe", descriptor = "[F")
    public float[] field5452 = this.field5525;

    @OriginalMember(owner = "client!ifa", name = "qf", descriptor = "I")
    private int field5504 = -1;

    @OriginalMember(owner = "client!ifa", name = "Sf", descriptor = "I")
    private int field5532 = 0;

    @OriginalMember(owner = "client!ifa", name = "Wf", descriptor = "I")
    public int field5536 = 128;

    @OriginalMember(owner = "client!ifa", name = "Xf", descriptor = "Z")
    public boolean field5537 = true;

    @OriginalMember(owner = "client!ifa", name = "Tf", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5533 = new Stream();

    @OriginalMember(owner = "client!ifa", name = "mg", descriptor = "Ldd;")
    private class653 field5552 = new class653();

    @OriginalMember(owner = "client!ifa", name = "Nb", descriptor = "Ljn;")
    public class668 field5320;

    @OriginalMember(owner = "client!ifa", name = "J", descriptor = "Ljava/awt/Canvas;")
    public Canvas field5264;

    @OriginalMember(owner = "client!ifa", name = "Eb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5311;

    @OriginalMember(owner = "client!ifa", name = "Ef", descriptor = "I")
    public int field5518;

    @OriginalMember(owner = "client!ifa", name = "vb", descriptor = "Ljava/lang/Object;")
    public Object field5302;

    @OriginalMember(owner = "client!ifa", name = "Vc", descriptor = "Ljava/lang/Object;")
    private Object field5380;

    @OriginalMember(owner = "client!ifa", name = "vd", descriptor = "I")
    private int field5406;

    @OriginalMember(owner = "client!ifa", name = "kb", descriptor = "I")
    public int field5291;

    @OriginalMember(owner = "client!ifa", name = "Ac", descriptor = "I")
    private int field5359;

    @OriginalMember(owner = "client!ifa", name = "wd", descriptor = "I")
    public int field5407;

    @OriginalMember(owner = "client!ifa", name = "ge", descriptor = "I")
    public int field5443;

    @OriginalMember(owner = "client!ifa", name = "Q", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field5271;

    @OriginalMember(owner = "client!ifa", name = "zf", descriptor = "Lbj;")
    private class220 field5513;

    @OriginalMember(owner = "client!ifa", name = "Cb", descriptor = "F")
    public static float field5309 = 1024.0F;

    @OriginalMember(owner = "client!ifa", name = "oe", descriptor = "F")
    public float field5451;

    @OriginalMember(owner = "client!ifa", name = "re", descriptor = "F")
    private float field5454;

    @OriginalMember(owner = "client!ifa", name = "we", descriptor = "F")
    private float field5459;

    @OriginalMember(owner = "client!ifa", name = "Be", descriptor = "F")
    public float field5464;

    @OriginalMember(owner = "client!ifa", name = "Fe", descriptor = "F")
    public float field5468;

    @OriginalMember(owner = "client!ifa", name = "Ze", descriptor = "F")
    public float field5488;

    @OriginalMember(owner = "client!ifa", name = "df", descriptor = "F")
    public float field5492;

    @OriginalMember(owner = "client!ifa", name = "Af", descriptor = "F")
    public float field5514;

    @OriginalMember(owner = "client!ifa", name = "p", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!ifa", name = "q", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!ifa", name = "r", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!ifa", name = "s", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!ifa", name = "t", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!ifa", name = "u", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!ifa", name = "v", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!ifa", name = "w", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!ifa", name = "x", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!ifa", name = "y", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!ifa", name = "z", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!ifa", name = "A", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!ifa", name = "B", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!ifa", name = "C", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!ifa", name = "D", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!ifa", name = "E", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!ifa", name = "F", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!ifa", name = "G", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!ifa", name = "H", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!ifa", name = "I", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!ifa", name = "K", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!ifa", name = "L", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!ifa", name = "M", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!ifa", name = "N", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!ifa", name = "O", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!ifa", name = "P", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!ifa", name = "R", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!ifa", name = "S", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!ifa", name = "T", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!ifa", name = "U", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!ifa", name = "V", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!ifa", name = "W", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!ifa", name = "Y", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!ifa", name = "Z", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!ifa", name = "ab", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!ifa", name = "bb", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!ifa", name = "cb", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!ifa", name = "db", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!ifa", name = "eb", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!ifa", name = "fb", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!ifa", name = "hb", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!ifa", name = "ib", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!ifa", name = "jb", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!ifa", name = "lb", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!ifa", name = "mb", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!ifa", name = "nb", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!ifa", name = "ob", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!ifa", name = "pb", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!ifa", name = "qb", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!ifa", name = "rb", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!ifa", name = "sb", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!ifa", name = "tb", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!ifa", name = "ub", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!ifa", name = "wb", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!ifa", name = "xb", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!ifa", name = "yb", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!ifa", name = "zb", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!ifa", name = "Ab", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!ifa", name = "Bb", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!ifa", name = "Db", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!ifa", name = "Fb", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!ifa", name = "Gb", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!ifa", name = "Hb", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!ifa", name = "Ib", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!ifa", name = "Jb", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!ifa", name = "Kb", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!ifa", name = "Lb", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!ifa", name = "Mb", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!ifa", name = "Qb", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!ifa", name = "Rb", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!ifa", name = "Sb", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!ifa", name = "Tb", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!ifa", name = "Ub", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!ifa", name = "Vb", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!ifa", name = "Wb", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!ifa", name = "Xb", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!ifa", name = "Yb", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!ifa", name = "Zb", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!ifa", name = "ac", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!ifa", name = "bc", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!ifa", name = "dc", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!ifa", name = "ec", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!ifa", name = "fc", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!ifa", name = "gc", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!ifa", name = "hc", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!ifa", name = "ic", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!ifa", name = "jc", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!ifa", name = "kc", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!ifa", name = "lc", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!ifa", name = "mc", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!ifa", name = "nc", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!ifa", name = "oc", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!ifa", name = "pc", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!ifa", name = "qc", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!ifa", name = "rc", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!ifa", name = "sc", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!ifa", name = "tc", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!ifa", name = "uc", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!ifa", name = "vc", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!ifa", name = "wc", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!ifa", name = "xc", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!ifa", name = "yc", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!ifa", name = "zc", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!ifa", name = "Bc", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!ifa", name = "Cc", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!ifa", name = "Dc", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!ifa", name = "Ec", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!ifa", name = "Fc", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!ifa", name = "Gc", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!ifa", name = "Hc", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!ifa", name = "Ic", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!ifa", name = "Jc", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!ifa", name = "Kc", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!ifa", name = "Lc", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!ifa", name = "Mc", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!ifa", name = "Nc", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!ifa", name = "Oc", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!ifa", name = "Pc", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!ifa", name = "Qc", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!ifa", name = "Rc", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!ifa", name = "Sc", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!ifa", name = "Tc", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!ifa", name = "Uc", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!ifa", name = "Wc", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!ifa", name = "Xc", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!ifa", name = "Yc", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!ifa", name = "Zc", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!ifa", name = "ad", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!ifa", name = "bd", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!ifa", name = "cd", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!ifa", name = "dd", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!ifa", name = "ed", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!ifa", name = "fd", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!ifa", name = "gd", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!ifa", name = "hd", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!ifa", name = "id", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!ifa", name = "jd", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!ifa", name = "kd", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!ifa", name = "ld", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!ifa", name = "md", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!ifa", name = "nd", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!ifa", name = "od", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!ifa", name = "pd", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!ifa", name = "qd", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!ifa", name = "rd", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!ifa", name = "sd", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!ifa", name = "td", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!ifa", name = "ud", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!ifa", name = "xd", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!ifa", name = "yd", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!ifa", name = "zd", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!ifa", name = "Ad", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!ifa", name = "Bd", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!ifa", name = "Cd", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!ifa", name = "Dd", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!ifa", name = "Ed", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!ifa", name = "Fd", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!ifa", name = "Gd", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!ifa", name = "Hd", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!ifa", name = "Id", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!ifa", name = "Jd", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!ifa", name = "Kd", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!ifa", name = "Md", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!ifa", name = "Nd", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!ifa", name = "Od", descriptor = "I")
    public int field5425;

    @OriginalMember(owner = "client!ifa", name = "Pd", descriptor = "I")
    public int field5426;

    @OriginalMember(owner = "client!ifa", name = "Qd", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!ifa", name = "Rd", descriptor = "I")
    public int field5428;

    @OriginalMember(owner = "client!ifa", name = "Sd", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!ifa", name = "Ud", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!ifa", name = "he", descriptor = "I")
    public int field5444;

    @OriginalMember(owner = "client!ifa", name = "ve", descriptor = "I")
    public int field5458;

    @OriginalMember(owner = "client!ifa", name = "Ge", descriptor = "I")
    public int field5469;

    @OriginalMember(owner = "client!ifa", name = "Ye", descriptor = "I")
    public int field5487;

    @OriginalMember(owner = "client!ifa", name = "af", descriptor = "I")
    public int field5489;

    @OriginalMember(owner = "client!ifa", name = "ff", descriptor = "I")
    public int field5494;

    @OriginalMember(owner = "client!ifa", name = "lf", descriptor = "I")
    public int field5499;

    @OriginalMember(owner = "client!ifa", name = "nf", descriptor = "I")
    private int field5501;

    @OriginalMember(owner = "client!ifa", name = "Bf", descriptor = "I")
    private int field5515;

    @OriginalMember(owner = "client!ifa", name = "Cf", descriptor = "I")
    public int field5516;

    @OriginalMember(owner = "client!ifa", name = "sg", descriptor = "I")
    private int field5558;

    @OriginalMember(owner = "client!ifa", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!ifa", name = "ng", descriptor = "Lcda;")
    private class154 field5553;

    @OriginalMember(owner = "client!ifa", name = "Kf", descriptor = "Ljfa;")
    private class262 field5524;

    @OriginalMember(owner = "client!ifa", name = "cc", descriptor = "Lvt;")
    public class276 field5335;

    @OriginalMember(owner = "client!ifa", name = "fe", descriptor = "Ljba;")
    private class366 field5442;

    @OriginalMember(owner = "client!ifa", name = "dg", descriptor = "Lel;")
    private class508 field5543;

    @OriginalMember(owner = "client!ifa", name = "fg", descriptor = "Lel;")
    private class508 field5545;

    @OriginalMember(owner = "client!ifa", name = "ag", descriptor = "Lfj;")
    private class607 field5540;

    @OriginalMember(owner = "client!ifa", name = "gg", descriptor = "Lfj;")
    public class607 field5546;

    @OriginalMember(owner = "client!ifa", name = "ig", descriptor = "Lfj;")
    public class607 field5548;

    @OriginalMember(owner = "client!ifa", name = "jg", descriptor = "Lfj;")
    public class607 field5549;

    @OriginalMember(owner = "client!ifa", name = "kg", descriptor = "Lfj;")
    public class607 field5550;

    @OriginalMember(owner = "client!ifa", name = "pg", descriptor = "Lfj;")
    private class607 field5555;

    @OriginalMember(owner = "client!ifa", name = "of", descriptor = "Loa;")
    public class644 field5502;

    @OriginalMember(owner = "client!ifa", name = "Ne", descriptor = "Lge;")
    private class658 field5476;

    @OriginalMember(owner = "client!ifa", name = "Yf", descriptor = "Lnk;")
    public class666 field5538;

    @OriginalMember(owner = "client!ifa", name = "Zf", descriptor = "Lnk;")
    public class666 field5539;

    @OriginalMember(owner = "client!ifa", name = "bg", descriptor = "Lnk;")
    public class666 field5541;

    @OriginalMember(owner = "client!ifa", name = "cg", descriptor = "Lnk;")
    public class666 field5542;

    @OriginalMember(owner = "client!ifa", name = "eg", descriptor = "Lnk;")
    public class666 field5544;

    @OriginalMember(owner = "client!ifa", name = "hg", descriptor = "Lnk;")
    public class666 field5547;

    @OriginalMember(owner = "client!ifa", name = "lg", descriptor = "Lnk;")
    public class666 field5551;

    @OriginalMember(owner = "client!ifa", name = "og", descriptor = "Lnk;")
    public class666 field5554;

    @OriginalMember(owner = "client!ifa", name = "qg", descriptor = "Lnk;")
    public class666 field5556;

    @OriginalMember(owner = "client!ifa", name = "rg", descriptor = "Lnk;")
    public class666 field5557;

    @OriginalMember(owner = "client!ifa", name = "gb", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field5287;

    @OriginalMember(owner = "client!ifa", name = "X", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field5278;

    @OriginalMember(owner = "client!ifa", name = "Ob", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field5321;

    @OriginalMember(owner = "client!ifa", name = "qe", descriptor = "Z")
    public boolean field5453;

    @OriginalMember(owner = "client!ifa", name = "Xe", descriptor = "Z")
    public boolean field5486;

    @OriginalMember(owner = "client!ifa", name = "hf", descriptor = "Z")
    public boolean field5496;

    @OriginalMember(owner = "client!ifa", name = "vf", descriptor = "Z")
    public boolean field5509;

    @OriginalMember(owner = "client!ifa", name = "Mf", descriptor = "Z")
    public boolean field5526;

    @OriginalMember(owner = "client!ifa", name = "tg", descriptor = "Z")
    public boolean field5559;

    @OriginalMember(owner = "client!ifa", name = "te", descriptor = "[Lgga;")
    public class265[] field5456;

    @OriginalMember(owner = "client!ifa", name = "uf", descriptor = "[Lgga;")
    public class265[] field5508;

    @OriginalMember(owner = "client!ifa", name = "ke", descriptor = "[Lvg;")
    public class49[] field5447;

    @OriginalMember(owner = "client!ifa", name = "Qf", descriptor = "[Lul;")
    public class530[] field5530;

    @OriginalMember(owner = "client!ifa", name = "Ff", descriptor = "[Loa;")
    private class644[] field5519;

    @OriginalMember(owner = "client!ifa", name = "ne", descriptor = "[Ldd;")
    public class653[] field5450;

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(B)V", line = 3)
    private final void method2300(byte arg0) {
        if (arg0 != 83) {
            this.method320(106, -102, 113, -33, 100);
        }
        this.method497((byte) -71);
        ++field5381;
        if (this.field5524 != null) {
            this.field5524.method594(3);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILuf;I)V", line = 21)
    public final void method2301(int arg0, class414 arg1, int arg2) {
        if (arg2 == 2) {
            ++field5348;
            this.method512(false, arg0, 9494, arg1, false);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "h", descriptor = "(I)V", line = 32)
    public final void method2302(int arg0) {
        if (arg0 != 7) {
            this.method474((byte) 38);
        }
        if (class112.field1436 != this.field5503) {
            class72 var2 = this.field5503;
            this.field5503 = class112.field1436;
            if (var2.method638((byte) -110)) {
                this.method2344(arg0 ^ -109);
            }
            this.field5452 = this.field5525;
            this.field5515 &= -32;
        }
        ++field5357;
    }

    @OriginalMember(owner = "client!ifa", name = "XA", descriptor = "(IIIII)V", line = 56)
    public final void method290(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method259(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
        ++field5376;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BLgga;Lgga;)V", line = 66)
    public final void method2303(byte arg0, class265 arg1, class265 arg2) {
        ++field5418;
        boolean var4 = false;
        if (this.field5456[this.field5484] != arg2) {
            this.field5456[this.field5484] = arg2;
            this.method466((byte) 122);
            var4 = true;
        }
        if (this.field5508[this.field5484] != arg1) {
            this.field5508[this.field5484] = arg1;
            var4 = true;
            this.method506(85);
        }
        if (var4) {
            this.field5515 &= -30;
        }
        int var5 = -2 / ((-28 - arg0) / 45);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BZ)V", line = 99)
    public final void method2304(byte arg0, boolean arg1) {
        ++field5368;
        if (!this.field5522 == arg1) {
            this.field5522 = arg1;
            this.method476(true);
            this.field5515 &= -8;
        }
        if (arg0 != -30) {
            this.method260();
        }
    }

    @OriginalMember(owner = "client!ifa", name = "i", descriptor = "(I)V", line = 123)
    public final void method2305(int arg0) {
        if (arg0 == 20921) {
            ++field5268;
            if (this.field5447[this.field5484] != class281.field3811) {
                this.field5447[this.field5484] = class281.field3811;
                this.field5450[this.field5484].method710();
                this.method2342((byte) -103);
            }
        }
    }

    @OriginalMember(owner = "client!ifa", name = "L", descriptor = "()V", line = 140)
    public final void method291() {
        this.field5496 = false;
        ++field5409;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZ)V", line = 150)
    public final void method2306(int arg0, boolean arg1) {
        if (!this.field5475 != !arg1) {
            this.field5475 = arg1;
            this.method472(-1);
            this.field5515 &= -32;
        }
        if (arg0 != 4345) {
            this.field5433 = null;
        }
        ++field5337;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZ[III)Lco;", line = 169)
    public final class103 method2307(int arg0, boolean arg1, int[] arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            this.field5479 = false;
        }
        ++field5345;
        return this.method525(arg2, 1, 0, arg0, 0, arg1, arg3);
    }

    @OriginalMember(owner = "client!ifa", name = "va", descriptor = "(I)V", line = 180)
    public final void method312(int arg0) {
        this.field5441 = 0;
        ++field5411;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field5441;
        }
        this.field5505 = 1 << this.field5441;
    }

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "(Z)V", line = 195)
    public final void method2308(boolean arg0) {
        if (!arg0) {
            this.method233();
        }
        if (~this.field5515 != -17) {
            this.method2340(-8);
            this.method2321(-32, true);
            this.method2320(true, -32);
            this.method2306(4345, true);
            this.method2353(1, (byte) -127);
            this.field5515 = 16;
        }
        ++field5417;
    }

    @OriginalMember(owner = "client!ifa", name = "j", descriptor = "(I)V", line = 216)
    private final void method2309(int arg0) {
        if (this.field5524 != null) {
            this.field5524.method593(52);
        }
        if (arg0 != -7285) {
            this.field5407 = -22;
        }
        ++field5252;
        this.method495((byte) 51);
    }

    @OriginalMember(owner = "client!ifa", name = "V", descriptor = "(IIII)V", line = 232)
    public final void method300(int arg0, int arg1, int arg2, int arg3) {
        ++field5342;
        boolean var5 = false;
        if (this.field5527 < arg0) {
            var5 = true;
            this.field5527 = arg0;
        }
        if (~this.field5439 < ~arg2) {
            this.field5439 = arg2;
            var5 = true;
        }
        if (~this.field5517 > ~arg1) {
            var5 = true;
            this.field5517 = arg1;
        }
        if (this.field5510 > arg3) {
            this.field5510 = arg3;
            var5 = true;
        }
        if (var5) {
            if (!this.field5559) {
                this.field5559 = true;
                this.method467(true);
            }
            this.method505(false);
            this.method2341(1);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "u", descriptor = "()Lq;", line = 283)
    public final class394 method305() {
        ++field5315;
        return new class653();
    }

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "(Z)V", line = 291)
    private final void method2310(boolean arg0) {
        this.method485(50);
        ++field5325;
        this.method494(8);
        this.method476(arg0);
        this.method474((byte) 50);
        this.method499((byte) 79);
        this.method526(4939);
        this.method517((byte) -49);
        this.method519(-124);
        this.method472(-1);
        this.method478((byte) 67);
        this.method495((byte) 51);
        this.method489(2);
        this.method509(-84);
        this.method520((byte) 102);
        for (int var2 = this.field5499 + -1; ~var2 <= -1; --var2) {
            this.method2318(var2, -30954);
            this.method466((byte) 122);
            this.method506(73);
            this.method2305(20921);
        }
        this.method513(false);
        this.method521(121);
        this.method497((byte) -43);
        this.method469((byte) -40);
        this.method473(arg0);
    }

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "(I)V", line = 331)
    public final void method230(int arg0) {
        ++field5341;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            if (this.field5513 != null) {
                this.field5513.method1329((byte) 115);
            }
            this.field5536 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lgda;[Lpga;Z)Lla;", line = 346)
    public final class419 method258(class50 arg0, class495[] arg1, boolean arg2) {
        ++field5350;
        return new class223(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Le;)V", line = 354)
    public final void method265(class493 arg0) {
        ++field5378;
        this.field5287 = ((class66) arg0).field1029;
        this.field5278 = this.field5287.method3569(32768, false);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIIII)V", line = 365)
    public final void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5304;
    }

    @OriginalMember(owner = "client!ifa", name = "g", descriptor = "(I)V", line = 372)
    public final void method222(int arg0) {
        ++field5284;
    }

    @OriginalMember(owner = "client!ifa", name = "da", descriptor = "(IIII)V", line = 379)
    public final void method292(int arg0, int arg1, int arg2, int arg3) {
        ++field5384;
        if (arg0 <= 0 && ~arg2 <= ~(this.field5407 - 1) && ~arg1 >= -1 && ~arg3 <= ~(this.field5291 + -1)) {
            this.method249();
        } else {
            this.field5517 = ~arg1 > -1 ? 0 : arg1;
            this.field5510 = arg3 > this.field5407 ? 0 : arg3;
            this.field5527 = arg0 >= 0 ? arg0 : 0;
            this.field5439 = this.field5407 >= arg2 ? arg2 : 0;
            if (!this.field5559) {
                this.field5559 = true;
                this.method467(true);
            }
            this.method505(false);
            this.method2341(1);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "z", descriptor = "()Z", line = 410)
    public final boolean method317() {
        ++field5403;
        return this.field5509;
    }

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "(B)Ldd;", line = 418)
    public final class653 method2311(byte arg0) {
        if (arg0 > -95) {
            this.field5458 = 103;
        }
        ++field5270;
        return this.field5450[this.field5484];
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(IZ)V", line = 429)
    public final void method2312(int arg0, boolean arg1) {
        ++field5265;
        if (arg0 != 3) {
            this.field5380 = null;
        }
        if (!arg1 != !this.field5537) {
            this.field5537 = arg1;
            this.method517((byte) -49);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILqf;Z)V", line = 445)
    private final void method2313(int arg0, class632 arg1, boolean arg2) {
        if (arg2) {
            this.method493(0, 0, this.field5543);
            ++field5260;
            this.method480(this.field5555, 86);
            this.method508(0, arg0, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIZ)Lf;", line = 462)
    public final class701 method304(int arg0, int arg1, boolean arg2) {
        ++field5299;
        return new class703(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "(I)V", line = 471)
    public final void method252(int arg0) {
        ++field5301;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ifa", name = "k", descriptor = "(I)V", line = 481)
    private final void method2314(int arg0) {
        ++field5366;
        if (arg0 == 0) {
            if (class207.field2532 != this.field5503) {
                class72 var2 = this.field5503;
                this.field5503 = class207.field2532;
                if (!var2.method638((byte) -122)) {
                    this.method2344(arg0 ^ -83);
                }
                this.method2367(true);
                this.field5452 = this.field5478;
                this.method2300((byte) 83);
                this.field5515 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "()Z", line = 513)
    public final boolean method215() {
        ++field5326;
        return true;
    }

    @OriginalMember(owner = "client!ifa", name = "U", descriptor = "()I", line = 521)
    public final int method287() {
        ++field5336;
        return this.field5535;
    }

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "(B)V", line = 544)
    public final void method2315(byte arg0) {
        ++field5395;
        int var2 = 29 / ((-24 - arg0) / 33);
        this.method2313(2, class290.field3934, true);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIZ)Lf;", line = 554)
    public final class701 method231(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5276;
        class703 var6 = new class703(this, arg2, arg3, arg4);
        var6.method5(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V", line = 572)
    public void method263(int arg0) {
        if (this.field5513 != null) {
            this.field5513.method1330(121);
        }
        ++field5318;
        this.field5487 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "()Z", line = 583)
    public final boolean method211() {
        ++field5307;
        return false;
    }

    @OriginalMember(owner = "client!ifa", name = "JA", descriptor = "()V", line = 592)
    public final void method249() {
        ++field5255;
        this.field5527 = 0;
        this.field5510 = this.field5291;
        this.field5439 = this.field5407;
        this.field5517 = 0;
        if (this.field5559) {
            this.field5559 = false;
            this.method467(true);
        }
        this.method2341(1);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BLoa;)V", line = 616)
    public final void method2316(byte arg0, class644 arg1) {
        if (this.field5519[this.field5484] != arg1) {
            this.field5519[this.field5484] = arg1;
            if (arg1 != null) {
                arg1.method1701(2669);
            } else {
                this.method468(13);
            }
            this.field5515 &= -2;
        }
        if (arg0 <= 86) {
            this.method287();
        }
        ++field5259;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIIILua;II)V", line = 638)
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class616 arg6, int arg7, int arg8) {
        ++field5401;
    }

    @OriginalMember(owner = "client!ifa", name = "i", descriptor = "(B)V", line = 648)
    private final void method2317(byte arg0) {
        if (arg0 == 106) {
            ++field5392;
            this.field5463 = false;
            if (class322.field4244 == this.field5503) {
                this.method2335(17179);
                this.method2300((byte) 83);
            }
        }
    }

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "(II)V", line = 666)
    public final void method2318(int arg0, int arg1) {
        if (~this.field5484 != ~arg0) {
            this.field5484 = arg0;
            this.method502(true);
        }
        if (arg1 != -30954) {
            this.method2368(-10);
        }
        ++field5258;
    }

    @OriginalMember(owner = "client!ifa", name = "BA", descriptor = "()I", line = 682)
    public final int method260() {
        ++field5419;
        return this.field5506;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BLvg;)V", line = 691)
    public final void method2319(byte arg0, class49 arg1) {
        if (arg0 <= 71) {
            this.method2367(false);
        }
        this.field5447[this.field5484] = arg1;
        ++field5388;
        this.method2342((byte) -122);
    }

    @OriginalMember(owner = "client!ifa", name = "MA", descriptor = "(III[I)V", line = 703)
    public final void method322(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5379;
        float var5 = this.field5432.method3689(false, (float) arg2, (float) arg0, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field5482;
            var7 = this.field5531;
        } else {
            var7 = (int) ((float) this.field5490 * this.field5432.method3702((float) arg1, (float) arg2, (float) arg0, (byte) -17) / var5);
            var6 = (int) ((float) this.field5470 * this.field5432.method3691((float) arg0, (float) arg2, (byte) -54, (float) arg1) / var5);
        }
        arg3[1] = (int) ((float) var6 + -this.field5451);
        arg3[2] = (int) var5;
        arg3[0] = (int) ((float) var7 - this.field5492);
    }

    @OriginalMember(owner = "client!ifa", name = "GA", descriptor = "(II)V", line = 729)
    public final void method297(int arg0, int arg1) {
        ++field5317;
        if (this.field5506 != arg0 || ~this.field5535 != ~arg1) {
            this.field5506 = arg0;
            this.field5535 = arg1;
            this.method2346((byte) 44);
            this.method2347(0);
            this.method2309(-7285);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(ZI)V", line = 747)
    public final void method2320(boolean arg0, int arg1) {
        if (arg1 != -32) {
            this.method492((class75) null, -41, (class279) null);
        }
        ++field5410;
        if (!this.field5500 != !arg0) {
            this.field5500 = arg0;
            this.method519(arg1 ^ 96);
            this.field5515 &= -32;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 765)
    public final class37 method220(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5333;
        return new class206(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "(IZ)V", line = 775)
    public final void method2321(int arg0, boolean arg1) {
        if (arg0 != -32) {
            this.field5459 = 1.6817881F;
        }
        ++field5313;
        if (!this.field5453 == arg1) {
            this.field5453 = arg1;
            this.method478((byte) 67);
            this.field5515 &= -32;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "([IIIII)Lf;", line = 792)
    public final class701 method311(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5273;
        return new class703(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIZZ)V", line = 805)
    public final void method2322(int arg0, int arg1, boolean arg2, boolean arg3) {
        ++field5251;
        if (~this.field5504 != ~arg1 || !this.field5497 != !this.field5496) {
            class103 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field5496 ? 3 : 0;
            if (~arg1 > -1) {
                this.method2305(20921);
            } else {
                var5 = this.field5513.method1333((byte) -50, arg1);
                class352 var10 = super.field2023.method397(arg1, (byte) 100);
                if (var10.field4695 == 0 && ~var10.field4699 == -1) {
                    this.method2305(20921);
                } else {
                    int var11 = var10.field4708 ? 64 : 128;
                    int var12 = var11 * 50;
                    class653 var13 = this.method2373((byte) -109);
                    var13.method3685((float) (this.field5487 % var12 * var10.field4695) / (float) var12, 0.0F, (byte) -69, (float) (this.field5487 % var12 * var10.field4699) / (float) var12);
                    this.method2319((byte) 93, class148.field1809);
                }
                var6 = var10.field4700;
                if (!this.field5496) {
                    var8 = var10.field4694;
                    var9 = var10.field4707;
                    var7 = var10.field4696;
                }
            }
            this.method2381(arg3, (byte) -105, var9, arg2, var7, var8);
            if (this.field5524 == null) {
                this.method2316((byte) 123, var5);
                this.method2362(var6, false);
            } else {
                this.field5524.method371(var6, var5, (byte) 119);
            }
            this.field5504 = arg1;
            this.field5497 = this.field5496;
        }
        this.field5515 &= -8;
        if (arg0 >= -41) {
            this.method211();
        }
    }

    @OriginalMember(owner = "client!ifa", name = "l", descriptor = "(I)V", line = 874)
    public final void method2323(int arg0) {
        ++field5344;
        this.field5422.method710();
        if (arg0 <= 87) {
            this.field5406 = 50;
        }
        this.field5430 = true;
        this.method2330(8);
    }

    @OriginalMember(owner = "client!ifa", name = "k", descriptor = "(B)V", line = 888)
    public final void method2324(byte arg0) {
        if (this.field5515 != 4) {
            this.method2339((byte) -75);
            this.method2321(-32, false);
            this.method2304((byte) -30, false);
            this.method2320(false, -32);
            this.method2306(4345, false);
            this.method2322(-110, -2, false, false);
            this.method2353(1, (byte) -121);
            this.method2362(0, false);
            this.field5515 = 4;
        }
        if (arg0 >= 48) {
            ++field5351;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(I)V", line = 916)
    public final void method307(int arg0) {
        ++field5327;
    }

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "(Z)V", line = 925)
    public final void method2325(boolean arg0) {
        this.field5430 = arg0;
        ++field5290;
        this.method2330(8);
    }

    @OriginalMember(owner = "client!ifa", name = "l", descriptor = "(B)[F", line = 934)
    public final float[] method2326(byte arg0) {
        ++field5399;
        if (arg0 != -61) {
            this.method2351(-34);
        }
        return this.field5525;
    }

    @OriginalMember(owner = "client!ifa", name = "m", descriptor = "(B)V", line = 951)
    public final void method2327(byte arg0) {
        ++field5404;
        if (this.field5515 != 8) {
            this.method2314(0);
            this.method2321(-32, true);
            this.method2320(true, -32);
            this.method2306(4345, true);
            this.method2353(1, (byte) -123);
            this.field5515 = 8;
        }
        if (arg0 > -80) {
            this.field5426 = -31;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "(IZ)V", line = 972)
    public final void method2328(int arg0, boolean arg1) {
        if (this.field5460 == !arg1) {
            this.field5460 = arg1;
            this.method478((byte) 67);
        }
        int var3 = 85 % ((arg0 - 20) / 48);
        ++field5340;
    }

    @OriginalMember(owner = "client!ifa", name = "T", descriptor = "()I", line = 989)
    public final int method289() {
        ++field5390;
        return this.field5558;
    }

    @OriginalMember(owner = "client!ifa", name = "s", descriptor = "()Lq;", line = 1001)
    public final class394 method238() {
        ++field5364;
        return this.field5432;
    }

    @OriginalMember(owner = "client!ifa", name = "m", descriptor = "(I)Ldd;", line = 1013)
    public final class653 method2329(int arg0) {
        if (arg0 != 32639) {
            this.field5467 = -2.167151F;
        }
        ++field5349;
        return this.field5422;
    }

    @OriginalMember(owner = "client!ifa", name = "VA", descriptor = "(IFFFFF)V", line = 1024)
    public final void method236(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field5358;
        boolean var7 = this.field5485 != arg0;
        if (var7 || this.field5507 != arg1 || this.field5462 != arg2) {
            this.field5485 = arg0;
            this.field5462 = arg2;
            this.field5507 = arg1;
            if (var7) {
                this.field5512 = (float) (65280 & this.field5485) / 65280.0F;
                this.field5481 = (float) (this.field5485 & 255) / 255.0F;
                this.field5446 = (float) (16711680 & this.field5485) / 1.671168E7F;
                this.method485(77);
            }
            this.field5271.setSunColour(this.field5446, this.field5512, this.field5481, arg1, arg2);
            this.method494(8);
        }
        if (this.field5457[0] != arg3 || this.field5457[1] != arg4 || this.field5457[2] != arg5) {
            this.field5457[2] = arg5;
            this.field5457[1] = arg4;
            this.field5457[0] = arg3;
            this.field5474[1] = -arg4;
            this.field5474[0] = -arg3;
            this.field5474[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5520[2] = arg5 * var8;
            this.field5520[1] = arg4 * var8;
            this.field5520[0] = arg3 * var8;
            this.field5440[0] = -this.field5520[0];
            this.field5440[1] = -this.field5520[1];
            this.field5440[2] = -this.field5520[2];
            this.field5271.setSunDirection(this.field5520[0], this.field5520[1], this.field5520[2]);
            this.method499((byte) -103);
            this.field5444 = (int) (arg5 * 256.0F / arg4);
            this.field5458 = (int) (arg3 * 256.0F / arg4);
        }
        this.method526(4939);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lcaa;)V", line = 1084)
    public final void method277(class275 arg0) {
        this.field5476 = (class658) arg0;
        ++field5362;
    }

    @OriginalMember(owner = "client!ifa", name = "n", descriptor = "(I)V", line = 1098)
    private final void method2330(int arg0) {
        ++field5245;
        if (class322.field4244 == this.field5503) {
            float var2 = this.method514(1);
            this.field5422.method3695((byte) 117, 0.0F, var2, var2);
        }
        this.field5493 = false;
        this.method469((byte) -40);
        if (this.field5524 != null) {
            this.field5524.method597(16383);
        }
        if (arg0 != 8) {
            this.field5485 = 35;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "(II)I", line = 1122)
    public final int method271(int arg0, int arg1) {
        ++field5303;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!ifa", name = "O", descriptor = "(IIIIII)Z", line = 1133)
    public final boolean method217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5292;
        float var7 = this.field5432.method3689(false, (float) arg2, (float) arg0, (float) arg1);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field5432.method3689(false, (float) arg5, (float) arg3, (float) arg4);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field5506) || !((float) this.field5506 > var8)) && (!((float) this.field5535 < var7) || !((float) this.field5535 < var8))) {
            int var9 = (int) ((float) this.field5490 * this.field5432.method3702((float) arg1, (float) arg2, (float) arg0, (byte) -17) / var7);
            int var10 = (int) ((float) this.field5490 * this.field5432.method3702((float) arg4, (float) arg5, (float) arg3, (byte) -17) / var8);
            if (this.field5492 > (float) var9 && this.field5492 > (float) var10 || this.field5514 < (float) var9 && this.field5514 < (float) var10) {
                return false;
            } else {
                int var11 = (int) ((float) this.field5470 * this.field5432.method3691((float) arg0, (float) arg2, (byte) -106, (float) arg1) / var7);
                int var12 = (int) ((float) this.field5470 * this.field5432.method3691((float) arg3, (float) arg5, (byte) -84, (float) arg4) / var8);
                return (!(this.field5451 > (float) var11) || !(this.field5451 > (float) var12)) && (!((float) var11 > this.field5464) || !((float) var12 > this.field5464));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "(ZI)V", line = 1171)
    public final void method2331(boolean arg0, int arg1) {
        if (arg0) {
            ++field5308;
            if (this.field5469 != arg1) {
                this.field5469 = arg1;
                this.method513(false);
            }
        }
    }

    @OriginalMember(owner = "client!ifa", name = "IA", descriptor = "(IIIIII[BII)V", line = 1190)
    public final void method324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field5275;
    }

    @OriginalMember(owner = "client!ifa", name = "m", descriptor = "(IIIII)V", line = 1198)
    public final void method310(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method259(arg0, arg1, arg0, arg1 - -arg2, arg3, arg4);
        ++field5244;
    }

    @OriginalMember(owner = "client!ifa", name = "o", descriptor = "(I)I", line = 1208)
    public final int method2332(int arg0) {
        ++field5328;
        if (arg0 != 0) {
            this.method2380(-84);
        }
        return this.field5498;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(II[I[I)Lua;", line = 1219)
    public final class616 method213(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field5280;
        return class333.method1930(-19406, this, arg2, arg0, arg1, arg3);
    }

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 1227)
    public final void method257(Canvas arg0) {
        ++field5402;
        if (this.field5264 == arg0) {
            throw new RuntimeException();
        } else if (!this.field5321.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method522(85, arg0);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field5321.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ifa", name = "o", descriptor = "(B)V", line = 1266)
    private final void method2333(byte arg0) {
        ++field5363;
        this.method493(0, 0, this.field5545);
        if (arg0 != 51) {
            this.field5522 = true;
        }
        this.method480(this.field5540, -96);
        this.method508(0, 1, 0, class589.field8536);
    }

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "(II)Ljfa;", line = 1280)
    public class262 method479(int arg0, int arg1) {
        ++field5282;
        if (arg1 != 1) {
            return null;
        } else if (arg0 != 6) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    return ~arg0 == -8 ? new class353(this) : new class683(this);
                } else {
                    return new class329(this, this.field5335);
                }
            } else {
                return new class400(this);
            }
        } else {
            return new class26(this);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "p", descriptor = "(B)V", line = 1331)
    public final void method2334(byte arg0) {
        ++field5431;
        Hashtable var2 = new Hashtable();
        if (this.field5321 != null && !this.field5321.isEmpty()) {
            Enumeration var3 = this.field5321.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method522(94, var4));
            }
        }
        if (arg0 < 73) {
            this.field5311 = null;
        }
        this.field5321 = var2;
        this.method2369(105);
        this.method2356(21200);
        this.field5442.method2118(this, (byte) 16);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lpga;Z)Lf;", line = 1362)
    public final class701 method216(class495 arg0, boolean arg1) {
        ++field5329;
        class701 var10;
        if (~arg0.field6899 != -1 && arg0.field6906 != 0) {
            int[] var3 = new int[arg0.field6906 * arg0.field6899];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field6902 == null) {
                for (int var6 = 0; var6 < arg0.field6906; ++var6) {
                    for (int var7 = 0; ~arg0.field6899 < ~var7; ++var7) {
                        int var8 = arg0.field6905[arg0.field6907[var4++] & 255];
                        var3[var5++] = var8 == 0 ? 0 : class242.method1474(var8, -16777216);
                    }
                }
            } else {
                for (int var9 = 0; var9 < arg0.field6906; ++var9) {
                    for (int var11 = 0; ~var11 > ~arg0.field6899; ++var11) {
                        var3[var5++] = class242.method1474(arg0.field6905[class435.method2605(arg0.field6907[var4], 255)], arg0.field6902[var4] << 24);
                        ++var4;
                    }
                }
            }
            var10 = this.method311(var3, 0, arg0.field6899, arg0.field6899, arg0.field6906);
        } else {
            var10 = this.method311(new int[1], 0, 1, 1, 1);
        }
        var10.method894(arg0.field6901, arg0.field6900, arg0.field6903, arg0.field6904);
        return var10;
    }

    @OriginalMember(owner = "client!ifa", name = "p", descriptor = "(I)V", line = 1430)
    private final void method2335(int arg0) {
        if (!this.field5463) {
            float[] var2 = this.field5534;
            this.field5463 = true;
            if (~this.field5407 != -1 && this.field5291 != 0) {
                var2[14] = 0.5F;
                var2[10] = 0.5F;
                var2[1] = 0.0F;
                var2[9] = 0.0F;
                var2[3] = 0.0F;
                var2[0] = 2.0F / (float) this.field5407;
                var2[6] = 0.0F;
                var2[13] = 1.0F;
                var2[11] = 0.0F;
                var2[4] = 0.0F;
                var2[2] = 0.0F;
                var2[5] = -2.0F / (float) this.field5291;
                var2[15] = 1.0F;
                var2[7] = 0.0F;
                var2[12] = -1.0F;
                var2[8] = 0.0F;
            } else {
                var2[15] = 1.0F;
                var2[6] = 0.0F;
                var2[2] = 0.0F;
                var2[10] = 1.0F;
                var2[3] = 0.0F;
                var2[14] = 0.0F;
                var2[11] = 0.0F;
                var2[13] = 0.0F;
                var2[7] = 0.0F;
                var2[5] = 1.0F;
                var2[9] = 0.0F;
                var2[1] = 0.0F;
                var2[0] = 1.0F;
                var2[4] = 0.0F;
                var2[12] = 0.0F;
                var2[8] = 0.0F;
            }
        }
        ++field5314;
        if (arg0 != 17179) {
            this.method511((class75) null, 127, -69, 83, (float[]) null, -103, -67, true);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "q", descriptor = "(I)V", line = 1488)
    public final void method2336(int arg0) {
        this.field5456 = new class265[this.field5499];
        this.field5447 = new class49[this.field5499];
        ++field5400;
        this.field5450 = new class653[this.field5499];
        this.field5508 = new class265[this.field5499];
        this.field5519 = new class644[this.field5499];
        for (int var2 = 0; var2 < this.field5499; ++var2) {
            this.field5508[var2] = class652.field9230;
            this.field5456[var2] = class652.field9230;
            this.field5447[var2] = class281.field3811;
            this.field5450[var2] = new class653();
        }
        this.field5530 = new class530[this.field5516 + -2];
        this.field5502 = this.method496(1, class391.field5229, (byte) -83, 1, class279.field3793);
        this.method265(new class66(262144));
        this.field5548 = this.method504((byte) 24, new class253[] { new class253(new class397[] { class397.field5604, class397.field5614 }) });
        this.field5549 = this.method504((byte) 90, new class253[] { new class253(new class397[] { class397.field5604, class397.field5612 }) });
        this.field5550 = this.method504((byte) 46, new class253[] { new class253(class397.field5604), new class253(class397.field5612), new class253(class397.field5614), new class253(class397.field5611) });
        this.field5546 = this.method504((byte) 31, new class253[] { new class253(class397.field5604), new class253(class397.field5612), new class253(class397.field5614) });
        this.field5547 = new class666(this, 0, 0, false, false);
        this.field5541 = new class666(this, 0, 0, true, true);
        this.field5539 = new class666(this, 0, 0, false, false);
        this.field5554 = new class666(this, 0, 0, true, true);
        this.field5542 = new class666(this, 0, 0, false, false);
        this.field5557 = new class666(this, 0, 0, true, true);
        this.field5556 = new class666(this, 0, 0, false, false);
        this.field5544 = new class666(this, 0, 0, true, true);
        this.field5538 = new class666(this, 0, 0, false, false);
        this.field5551 = new class666(this, 0, 0, true, true);
        this.field5442 = new class366(this);
        this.field5553 = this.method475(true, arg0 + -30980);
        this.method2334((byte) 76);
        this.field5335 = new class276(this);
        this.field5445[1] = this.method479(1, 1);
        this.field5445[2] = this.method479(2, 1);
        this.field5445[4] = this.method479(4, class570.method3340(arg0, 7));
        this.field5445[5] = this.method479(5, arg0 + -5);
        this.field5445[6] = this.method479(arg0, arg0 + -5);
        this.field5445[7] = this.method479(7, 1);
        this.field5445[3] = this.method479(3, 1);
        this.field5445[8] = this.method479(8, 1);
        this.field5445[9] = this.method479(9, 1);
        if (!this.field5445[2].method375(-18095)) {
            this.field5445[2] = this.method479(0, arg0 + -5);
        }
        if (!this.field5445[4].method375(arg0 + -18101)) {
            this.field5445[4] = this.field5445[2];
        }
        if (!this.field5445[8].method375(arg0 + -18101)) {
            this.field5445[8] = this.field5445[4];
        }
        if (!this.field5445[9].method375(arg0 + -18101)) {
            this.field5445[9] = this.field5445[8];
        }
        this.method527(10);
        this.method249();
        this.method283();
    }

    @OriginalMember(owner = "client!ifa", name = "YA", descriptor = "(IIII)V", line = 1562)
    public final void method261(int arg0, int arg1, int arg2, int arg3) {
        ++field5356;
        if (!this.field5496) {
            throw new RuntimeException("");
        } else {
            this.field5501 = arg0;
            this.field5465 = arg1;
            this.field5477 = arg3;
            this.field5498 = arg2;
            if (this.field5497) {
                this.field5445[3].method882(-123);
                this.field5445[3].method593(-121);
            }
        }
    }

    @OriginalMember(owner = "client!ifa", name = "h", descriptor = "(Z)V", line = 1584)
    public final void method2337(boolean arg0) {
        if (arg0) {
            this.method492((class75) null, 80, (class279) null);
        }
        if (~this.field5515 != -3) {
            this.method2339((byte) -75);
            this.method2321(-32, false);
            this.method2304((byte) -30, false);
            this.method2320(false, -32);
            this.method2306(4345, false);
            this.method2322(-127, -2, false, false);
            this.field5515 = 2;
        }
        ++field5319;
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "()I", line = 1606)
    public final int method214() {
        ++field5429;
        return this.field5425 - -this.field5426 + this.field5428;
    }

    @OriginalMember(owner = "client!ifa", name = "r", descriptor = "(I)V", line = 1614)
    private final void method2338(int arg0) {
        ++field5343;
        if (arg0 == 15) {
            if (!this.field5479) {
                float[] var2 = this.field5521;
                float var3 = (float) this.field5506;
                float var4 = (float) this.field5535;
                float var5 = (float) (-this.field5482) * this.field5483 / (float) this.field5470;
                float var6 = (float) (-this.field5531) * this.field5483 / (float) this.field5490;
                float var7 = (float) (-this.field5531 + this.field5407) * this.field5483 / (float) this.field5490;
                float var8 = (float) (-this.field5482 + this.field5291) * this.field5483 / (float) this.field5470;
                if (var6 != var7 && var5 != var8) {
                    var2[6] = 0.0F;
                    var2[13] = (var5 + var8) / (-var5 + var8);
                    var2[7] = 0.0F;
                    var2[3] = 0.0F;
                    var2[0] = 2.0F / (-var6 + var7);
                    var2[14] = var3 / (-var4 + var3);
                    var2[15] = 1.0F;
                    var2[12] = (var6 + var7) / (var6 - var7);
                    var2[4] = 0.0F;
                    var2[11] = 0.0F;
                    var2[2] = 0.0F;
                    var2[1] = 0.0F;
                    var2[9] = 0.0F;
                    var2[5] = 2.0F / (var8 - var5);
                    var2[10] = 1.0F / (-var4 + var3);
                    var2[8] = 0.0F;
                } else {
                    var2[15] = 1.0F;
                    var2[4] = 0.0F;
                    var2[7] = 0.0F;
                    var2[6] = 0.0F;
                    var2[14] = 0.0F;
                    var2[8] = 0.0F;
                    var2[12] = 0.0F;
                    var2[1] = 0.0F;
                    var2[3] = 0.0F;
                    var2[5] = 1.0F;
                    var2[2] = 0.0F;
                    var2[0] = 1.0F;
                    var2[13] = 0.0F;
                    var2[10] = 1.0F;
                    var2[11] = 0.0F;
                    var2[9] = 0.0F;
                }
                this.method2371((byte) -63);
                this.field5479 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ifa", name = "q", descriptor = "(B)V", line = 1689)
    private final void method2339(byte arg0) {
        ++field5385;
        if (class322.field4244 != this.field5503) {
            class72 var2 = this.field5503;
            this.field5503 = class322.field4244;
            if (var2.method638((byte) -117)) {
                this.method2344(-54);
            }
            this.method2335(arg0 + 17254);
            this.field5452 = this.field5534;
            this.method2300((byte) 83);
            this.field5515 &= -25;
        }
        if (arg0 != -75) {
            this.method2372((byte) -52);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "AA", descriptor = "(III[I)V", line = 1716)
    public final void method329(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5296;
        float var5 = this.field5432.method3689(false, (float) arg2, (float) arg0, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field5531;
            var7 = this.field5482;
        } else {
            var6 = (int) ((float) this.field5490 * this.field5432.method3702((float) arg1, (float) arg2, (float) arg0, (byte) -17) / var5);
            var7 = (int) ((float) this.field5470 * this.field5432.method3691((float) arg0, (float) arg2, (byte) -65, (float) arg1) / var5);
        }
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var7 - this.field5451);
        arg3[0] = (int) ((float) var6 - this.field5492);
    }

    @OriginalMember(owner = "client!ifa", name = "x", descriptor = "()V", line = 1741)
    public void method286() {
        ++field5295;
        if (!this.field5495) {
            for (class513 var1 = this.field5322.method1132((byte) 59); var1 != null; var1 = this.field5322.method1134(8446)) {
                ((class66) var1).method619(-101);
            }
            Enumeration var2 = this.field5321.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method483(true, this.field5321.get(var3), var3);
            }
            class54.method567(true, false, true);
            this.field5271.release();
            this.field5495 = true;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "t", descriptor = "(I)V", line = 1776)
    private final void method2340(int arg0) {
        ++field5334;
        if (class475.field6651 != this.field5503) {
            class72 var2 = this.field5503;
            this.field5503 = class475.field6651;
            if (!var2.method638((byte) -109)) {
                this.method2344(arg0 + -100);
            }
            this.method2338(15);
            this.field5452 = this.field5521;
            this.method2300((byte) 83);
            this.field5515 &= -8;
        }
        if (arg0 != -8) {
            this.field5456 = null;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "J", descriptor = "(IIIIII)V", line = 1801)
    public final void method248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2345(true);
        ++field5355;
        this.method2331(true, arg4);
        this.method2301(0, class308.field4083, 2);
        this.method2348(0, 6655, class308.field4083);
        this.method2353(arg5, (byte) -123);
        this.field5422.method3683((byte) -126, (float) arg3, 1.0F, (float) arg2);
        this.field5422.method723(arg0, arg1, 0);
        this.method2325(false);
        this.method486(3, false);
        this.method2315((byte) -73);
        this.method486(3, true);
        this.method2348(0, 6655, class519.field7612);
        this.method2301(0, class519.field7612, 2);
    }

    @OriginalMember(owner = "client!ifa", name = "v", descriptor = "(I)V", line = 1825)
    private final void method2341(int arg0) {
        this.field5514 = (float) (this.field5439 - this.field5531);
        this.field5492 = (float) (-this.field5531 + this.field5527);
        if (arg0 == 1) {
            this.field5464 = (float) (this.field5510 - this.field5482);
            this.field5451 = (float) (-this.field5482 + this.field5517);
            ++field5413;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "la", descriptor = "(IIII)V", line = 1840)
    public final void method301(int arg0, int arg1, int arg2, int arg3) {
        this.field5531 = arg0;
        this.field5470 = arg3;
        this.field5490 = arg2;
        this.field5482 = arg1;
        ++field5281;
        this.method2347(0);
        this.method2346((byte) 44);
        this.method2302(7);
        this.method2341(1);
    }

    @OriginalMember(owner = "client!ifa", name = "r", descriptor = "(B)V", line = 1856)
    private final void method2342(byte arg0) {
        this.method524((byte) -89);
        ++field5386;
        int var2 = 61 / ((30 - arg0) / 54);
        if (this.field5524 != null) {
            this.field5524.method596((byte) 36);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "n", descriptor = "()Lq;", line = 1870)
    public final class394 method315() {
        ++field5279;
        return this.field5552;
    }

    @OriginalMember(owner = "client!ifa", name = "w", descriptor = "(I)Ldd;", line = 1879)
    public final class653 method2343(int arg0) {
        ++field5424;
        if (arg0 != 12328) {
            this.method290(61, -33, -123, 46, -88);
        }
        return this.field5434;
    }

    @OriginalMember(owner = "client!ifa", name = "x", descriptor = "(I)V", line = 1891)
    private final void method2344(int arg0) {
        if (arg0 >= -34) {
            this.field5552 = null;
        }
        ++field5293;
        this.field5493 = false;
        if (this.field5524 != null) {
            this.field5524.method595((byte) 47);
        }
        this.method473(true);
    }

    @OriginalMember(owner = "client!ifa", name = "j", descriptor = "(Z)V", line = 1907)
    private final void method2345(boolean arg0) {
        if (arg0) {
            ++field5420;
            if (this.field5515 != 1) {
                this.method2339((byte) -75);
                this.method2321(-32, false);
                this.method2304((byte) -30, false);
                this.method2320(false, -32);
                this.method2306(4345, false);
                this.method2322(-121, -2, false, false);
                this.method2362(1, false);
                this.method2316((byte) 113, this.field5502);
                this.field5515 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!ifa", name = "s", descriptor = "(B)V", line = 1932)
    private final void method2346(byte arg0) {
        if (arg0 == 44) {
            this.field5528 = false;
            ++field5289;
            this.method2367(true);
            if (class207.field2532 == this.field5503) {
                this.method2300((byte) 83);
            }
        }
    }

    @OriginalMember(owner = "client!ifa", name = "A", descriptor = "(I)V", line = 1949)
    private final void method2347(int arg0) {
        this.field5479 = false;
        ++field5262;
        if (arg0 != 0) {
            this.field5467 = -0.58856696F;
        }
        this.method2338(arg0 + 15);
        if (class475.field6651 == this.field5503) {
            this.method2300((byte) 83);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IILuf;)V", line = 1968)
    public final void method2348(int arg0, int arg1, class414 arg2) {
        if (arg1 == 6655) {
            this.method482(arg0, true, arg2, false);
            ++field5382;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "t", descriptor = "(B)Ldd;", line = 1981)
    public final class653 method2349(byte arg0) {
        int var2 = -33 % ((63 - arg0) / 51);
        ++field5261;
        return this.field5435;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Z)V", line = 1991)
    public final void method295(boolean arg0) {
        ++field5338;
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lfa;Ljn;II)V", line = 1999)
    public class393(Canvas arg0, Object arg1, class212 arg2, class668 arg3, int arg4, int arg5) {
        super(arg2);
        this.field5320 = arg3;
        this.field5311 = this.field5264 = arg0;
        this.field5518 = arg4;
        this.field5380 = this.field5302 = arg1;
        Dimension var7 = arg0.getSize();
        this.field5291 = this.field5406 = var7.height;
        this.field5407 = this.field5359 = var7.width;
        this.field5443 = arg5;
        class357.method2012(false, true, (byte) 88);
        if (super.field2023 == null) {
            this.field5271 = new NativeInterface(0, this.field5443);
            this.field5513 = null;
        } else {
            this.field5513 = new class220(this, super.field2023);
            this.field5271 = new NativeInterface(super.field2023.method401(false), this.field5443);
            for (int var8 = 0; var8 < super.field2023.method401(false); ++var8) {
                class352 var9 = super.field2023.method397(var8, (byte) -128);
                if (var9 != null) {
                    this.field5271.initTextureMetrics(var8, var9.field4703, var9.field4704);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Ljaclib/memory/Buffer;Z)Ljaclib/memory/Stream;", line = 2043)
    public final Stream method2350(Buffer arg0, boolean arg1) {
        if (!arg1) {
            this.method2379(-3);
        }
        this.field5533.method3585(arg0);
        ++field5266;
        return this.field5533;
    }

    @OriginalMember(owner = "client!ifa", name = "B", descriptor = "(I)V", line = 2055)
    public final void method2351(int arg0) {
        ++field5398;
        this.method2302(7);
        if (arg0 == 0) {
            this.method2300((byte) 83);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "(ZI)Z", line = 2072)
    public static final boolean method2352(boolean arg0, int arg1) {
        if (arg0) {
            method2364(-107, (byte) 15);
        }
        ++field5371;
        return arg1 == 3 || arg1 == 7 || ~arg1 == -11;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lq;)V", line = 2085)
    public final void method262(class394 arg0) {
        ++field5352;
        this.field5432 = (class653) arg0;
        this.field5434.method711(this.field5432);
        this.field5434.method3682(true);
        this.field5435.method3696(this.field5434, 0);
        this.field5433.method3696(this.field5432, 0);
        if (this.field5503.method638((byte) -97)) {
            this.method2344(-115);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "o", descriptor = "()Z", line = 2107)
    public final boolean method224() {
        ++field5408;
        return this.field5445[3].method375(-18095);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IB)V", line = 2115)
    public final void method2353(int arg0, byte arg1) {
        if (arg1 <= -116) {
            if (~this.field5466 != ~arg0) {
                boolean var3;
                boolean var4;
                class74 var5;
                if (arg0 != 1) {
                    if (~arg0 == -3) {
                        var3 = false;
                        var4 = true;
                        var5 = class56.field892;
                    } else if (arg0 == 128) {
                        var3 = true;
                        var4 = true;
                        var5 = class115.field1497;
                    } else {
                        var4 = false;
                        var5 = class39.field728;
                        var3 = false;
                    }
                } else {
                    var3 = true;
                    var4 = true;
                    var5 = class328.field4373;
                }
                if (this.field5473 == !var3) {
                    this.field5473 = var3;
                    this.method520((byte) 97);
                }
                if (this.field5523 == !var4) {
                    this.field5523 = var4;
                    this.method489(2);
                }
                if (this.field5511 != var5) {
                    this.field5511 = var5;
                    this.method509(-122);
                }
                this.field5466 = arg0;
                this.field5515 &= -29;
            }
            ++field5397;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "v", descriptor = "(B)Ldd;", line = 2185)
    public final class653 method2354(byte arg0) {
        if (!this.field5493) {
            this.field5436.method3684(this.field5434, this.field5422);
            this.field5493 = true;
        }
        int var2 = 45 / ((arg0 - -20) / 47);
        ++field5339;
        return this.field5436;
    }

    @OriginalMember(owner = "client!ifa", name = "E", descriptor = "(I)V", line = 2203)
    private final void method2355(int arg0) {
        ++field5369;
        this.field5478[10] = this.field5459;
        this.field5478[14] = this.field5454;
        this.field5467 = (this.field5478[arg0] - (float) this.field5535) / this.field5478[10];
    }

    @OriginalMember(owner = "client!ifa", name = "oa", descriptor = "([I)V", line = 2220)
    public final void method251(int[] arg0) {
        arg0[0] = this.field5527;
        arg0[3] = this.field5510;
        arg0[2] = this.field5439;
        arg0[1] = this.field5517;
        ++field5374;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIIIIIII)V", line = 2232)
    public final void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5375;
    }

    @OriginalMember(owner = "client!ifa", name = "F", descriptor = "(I)V", line = 2240)
    private final void method2356(int arg0) {
        ++field5323;
        this.field5545 = this.method516((byte) 119, true);
        if (arg0 != 21200) {
            this.field5438 = true;
        }
        this.field5545.method742(12, 24, true);
        this.field5540 = this.method504((byte) 125, new class253[] { new class253(class397.field5604) });
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIIF)Lul;", line = 2255)
    public final class530 method243(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field5394;
        return new class186(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "(II)Lcda;", line = 2264)
    public final class154 method2357(int arg0, int arg1) {
        ++field5346;
        if (this.field5553.method16(arg1 + 34960) < arg0 * arg1) {
            this.field5553.method13(arg0, -6482);
        }
        return this.field5553;
    }

    @OriginalMember(owner = "client!ifa", name = "FA", descriptor = "(ILua;II)V", line = 2275)
    public final void method245(int arg0, class616 arg1, int arg2, int arg3) {
        ++field5383;
        class482 var5 = (class482) arg1;
        class103 var6 = var5.field6738;
        this.method2337(false);
        this.method2316((byte) 127, var6);
        this.method2353(1, (byte) -122);
        this.method2303((byte) 58, class231.field3011, class231.field3011);
        this.method2301(0, class308.field4083, 2);
        this.method2331(true, arg0);
        this.field5422.method3683((byte) -104, (float) this.field5291, 0.0F, (float) this.field5407);
        this.method2325(false);
        this.field5450[0].method3683((byte) -65, var6.method761((float) this.field5291, -22297), 1.0F, var6.method758(12943, (float) this.field5407));
        this.field5450[0].method3695((byte) 80, 0.0F, var6.method758(12943, (float) (-arg2)), var6.method761((float) (-arg3), -22297));
        this.field5447[0] = class148.field1809;
        this.method2342((byte) 121);
        this.method2315((byte) -94);
        this.method2305(20921);
        this.method2301(0, class519.field7612, 2);
    }

    @OriginalMember(owner = "client!ifa", name = "G", descriptor = "(I)I", line = 2306)
    public final int method2358(int arg0) {
        ++field5353;
        return arg0 != -22872 ? 22 : this.field5501;
    }

    @OriginalMember(owner = "client!ifa", name = "C", descriptor = "()Z", line = 2317)
    public final boolean method316() {
        ++field5267;
        return true;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lr;BLn;)V", line = 2329)
    public static final void method2359(class165 arg0, byte arg1, class17 arg2) {
        ++field5285;
        boolean var3 = class65.field1021.method189(arg2.field364 ? class206.field2472.field8824 : null, arg2.field361, arg0, arg2.field324 | -16777216, arg2.field486, arg2.field357, -54, arg2.field412) == null;
        if (var3) {
            class420.field5949.method1129(new class511(arg2.field412, arg2.field361, arg2.field486, arg2.field324 | -16777216, arg2.field357, arg2.field364), 262144);
            class314.method1836(arg2, false);
        }
        if (arg1 >= -65) {
            method2360((byte) -31, (class691) null, 0, 46);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BLpn;II)J", line = 2356)
    public static final long method2360(byte arg0, class691 arg1, int arg2, int arg3) {
        ++field5332;
        long var4 = 4194304L;
        int var6 = 20 / ((-45 - arg0) / 36);
        long var7 = Long.MIN_VALUE;
        class232 var9 = class37.field703.method807(0, arg1.method1072(4378));
        long var10 = (long) (arg1.method1070(-24359) << 14 | arg3 | arg2 << 7 | arg1.method1067((byte) 68) << 20 | 1073741824);
        if (~var9.field3029 == -1) {
            var10 |= var7;
        }
        if (~var9.field3025 == -2) {
            var10 |= var4;
        }
        return var10 | (long) arg1.method1072(4378) << 32;
    }

    @OriginalMember(owner = "client!ifa", name = "x", descriptor = "(B)V", line = 2383)
    public final void method2361(byte arg0) {
        int var2 = 98 % ((arg0 - 3) / 55);
        ++field5423;
        Enumeration var3 = this.field5321.keys();
        while (var3.hasMoreElements()) {
            Canvas var4 = (Canvas) var3.nextElement();
            this.method483(true, this.field5321.get(var4), var4);
        }
        this.field5543.method11((byte) -17);
        this.field5545.method11((byte) 17);
        this.field5541.method3767((byte) 110);
        this.field5554.method3767((byte) 96);
        this.field5557.method3767((byte) 105);
        this.field5544.method3767((byte) 114);
        this.field5551.method3767((byte) 110);
        this.field5442.method2120(0);
        this.field5553.method11((byte) -124);
    }

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "(IZ)V", line = 2413)
    public final void method2362(int arg0, boolean arg1) {
        ++field5414;
        if (arg1) {
            this.field5518 = 60;
        }
        if (arg0 == 1) {
            this.method2303((byte) -84, class231.field3011, class231.field3011);
        } else if (~arg0 != -1) {
            if (~arg0 == -3) {
                this.method2303((byte) -112, class231.field3011, class442.field6300);
            } else {
                if (~arg0 != -4) {
                    if (arg0 == 4) {
                        this.method2303((byte) -93, class603.field8698, class603.field8698);
                        return;
                    }
                } else {
                    this.method2303((byte) -118, class652.field9230, class698.field9875);
                }
            }
        } else {
            this.method2303((byte) -78, class652.field9230, class652.field9230);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "t", descriptor = "()Z", line = 2442)
    public final boolean method247() {
        ++field5377;
        return true;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "([I)V", line = 2450)
    public final void method319(int[] arg0) {
        arg0[0] = this.field5407;
        arg0[1] = this.field5291;
        ++field5305;
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(IIIIII)V", line = 2459)
    public final void method278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5256;
        float var7 = this.method514(1);
        this.method2345(true);
        this.method2331(true, arg4);
        this.method2301(0, class308.field4083, 2);
        this.method2348(0, 6655, class308.field4083);
        this.method2353(arg5, (byte) -123);
        this.field5422.method3683((byte) -56, (float) (arg3 + -1), 1.0F, (float) (arg2 + -1));
        this.field5422.method3695((byte) 101, 0.0F, (float) arg0 + -var7, (float) arg1 + -var7);
        this.method2325(false);
        this.method486(3, false);
        this.method2313(4, class208.field2539, true);
        this.method486(3, true);
        this.method2348(0, 6655, class519.field7612);
        this.method2301(0, class519.field7612, 2);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZ[BILfca;B)Lco;", line = 2487)
    public final class103 method2363(int arg0, boolean arg1, byte[] arg2, int arg3, class75 arg4, byte arg5) {
        int var7 = -77 % ((-41 - arg5) / 46);
        ++field5361;
        return this.method477(arg1, arg0, 0, arg4, arg2, arg3, true, 0);
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(IB)V", line = 2497)
    public static final void method2364(int arg0, byte arg1) {
        if (arg1 <= 85) {
            method2359((class165) null, (byte) 16, (class17) null);
        }
        ++field5274;
        class233 var2 = class7.method44(arg0, 10, -1);
        var2.method1423(0);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lkk;IIII)Lda;", line = 2513)
    public final class55 method274(class173 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5312;
        return new class666(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ifa", name = "J", descriptor = "(I)V", line = 2523)
    public void method527(int arg0) {
        this.method2310(true);
        if (arg0 != 10) {
            this.method220(43, 56, (int[][]) null, (int[][]) null, 19, -41, -126);
        }
        ++field5247;
    }

    @OriginalMember(owner = "client!ifa", name = "ZA", descriptor = "(Z)V", line = 2537)
    public final void method309(boolean arg0) {
        this.field5461 = arg0;
        ++field5263;
        this.method472(-1);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Ldd;B)V", line = 2546)
    public final void method2365(class653 arg0, byte arg1) {
        this.field5422.method711(arg0);
        ++field5367;
        if (arg1 != -45) {
            this.field5448 = 14;
        }
        this.field5430 = false;
        this.method2330(8);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "([FZ)[F", line = 2559)
    public final float[] method2366(float[] arg0, boolean arg1) {
        ++field5249;
        arg0[12] = this.field5452[3];
        arg0[0] = this.field5452[0];
        if (!arg1) {
            this.method506(-60);
        }
        arg0[8] = this.field5452[2];
        arg0[4] = this.field5452[1];
        arg0[9] = this.field5452[6];
        arg0[5] = this.field5452[5];
        arg0[1] = this.field5452[4];
        arg0[2] = this.field5452[8];
        arg0[13] = this.field5452[7];
        arg0[3] = this.field5452[12];
        arg0[7] = this.field5452[13];
        arg0[10] = this.field5452[10];
        arg0[6] = this.field5452[9];
        arg0[14] = this.field5452[11];
        arg0[11] = this.field5452[14];
        arg0[15] = this.field5452[15];
        return arg0;
    }

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "(I)Le;", line = 2586)
    public final class493 method210(int arg0) {
        ++field5391;
        class66 var2 = new class66(arg0);
        this.field5322.method1129(var2, 262144);
        return var2;
    }

    @OriginalMember(owner = "client!ifa", name = "l", descriptor = "(Z)V", line = 2599)
    private final void method2367(boolean arg0) {
        if (arg0) {
            if (!this.field5528) {
                float[] var2 = this.field5478;
                float var3 = (float) (-this.field5531 * this.field5506) / (float) this.field5490;
                float var4 = (float) ((-this.field5531 + this.field5407) * this.field5506) / (float) this.field5490;
                float var5 = (float) (this.field5506 * this.field5482) / (float) this.field5470;
                float var6 = (float) ((-this.field5291 + this.field5482) * this.field5506) / (float) this.field5470;
                if (var3 != var4 && var5 != var6) {
                    float var7 = (float) this.field5506 * 2.0F;
                    var2[11] = -1.0F;
                    var2[13] = 0.0F;
                    var2[12] = 0.0F;
                    var2[10] = this.field5459 = (float) this.field5535 / (float) (-this.field5535 + this.field5506);
                    var2[4] = 0.0F;
                    var2[1] = 0.0F;
                    var2[9] = (var5 + var6) / (var5 - var6);
                    var2[8] = (var3 + var4) / (-var3 + var4);
                    var2[5] = var7 / (-var6 + var5);
                    var2[3] = 0.0F;
                    var2[7] = 0.0F;
                    var2[15] = 0.0F;
                    var2[14] = this.field5454 = (float) (this.field5535 * this.field5506) / (float) (this.field5506 - this.field5535);
                    var2[6] = 0.0F;
                    var2[2] = 0.0F;
                    var2[0] = var7 / (-var3 + var4);
                } else {
                    var2[5] = 1.0F;
                    var2[0] = 1.0F;
                    var2[10] = 1.0F;
                    var2[11] = 0.0F;
                    var2[6] = 0.0F;
                    var2[12] = 0.0F;
                    var2[14] = 0.0F;
                    var2[2] = 0.0F;
                    var2[13] = 0.0F;
                    var2[15] = 1.0F;
                    var2[9] = 0.0F;
                    var2[1] = 0.0F;
                    var2[4] = 0.0F;
                    var2[7] = 0.0F;
                    var2[8] = 0.0F;
                    var2[3] = 0.0F;
                }
                this.method2355(14);
                this.field5528 = true;
            }
            ++field5272;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "K", descriptor = "(I)V", line = 2666)
    private final void method2368(int arg0) {
        if (this.field5311 != null) {
            Dimension var2 = this.field5311.getSize();
            this.field5359 = var2.width;
            this.field5406 = var2.height;
        } else {
            this.field5359 = this.field5406 = 1;
        }
        ++field5396;
        this.field5291 = this.field5406;
        this.field5407 = this.field5359;
        this.method2317((byte) 106);
        this.method2346((byte) 44);
        this.method2347(0);
        this.method521(35);
        this.method2341(1);
        this.method2302(arg0 ^ -8);
        if (arg0 != -1) {
            this.method487(-80, (Canvas) null, (Object) null);
        }
        this.method249();
    }

    @OriginalMember(owner = "client!ifa", name = "ra", descriptor = "(F)V", line = 2701)
    public final void method239(float arg0) {
        ++field5248;
        if (this.field5491 != arg0) {
            this.field5491 = arg0;
            this.field5271.setAmbient(arg0);
            this.method485(40);
            this.method526(4939);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(II)I", line = 2718)
    public final int method306(int arg0, int arg1) {
        ++field5331;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "()Z", line = 2726)
    public final boolean method269() {
        ++field5310;
        return false;
    }

    @OriginalMember(owner = "client!ifa", name = "L", descriptor = "(I)V", line = 2737)
    private final void method2369(int arg0) {
        if (arg0 < 99) {
            this.field5438 = false;
        }
        this.field5543 = this.method516((byte) 114, false);
        ++field5297;
        this.field5543.method742(28, 140, true);
        for (int var2 = 0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field5543.method741(true, false);
            if (var3 != null) {
                Stream var4 = this.method2350(var3, true);
                if (!Stream.method3579()) {
                    var4.method3577(0.0F);
                    var4.method3577(0.0F);
                    var4.method3577(0.0F);
                    var4.method3577(0.0F);
                    var4.method3577(0.0F);
                    var4.method3577(0.0F);
                    var4.method3577(0.0F);
                    var4.method3577(0.0F);
                    var4.method3577(1.0F);
                    var4.method3577(0.0F);
                    var4.method3577(0.0F);
                    var4.method3577(1.0F);
                    var4.method3577(0.0F);
                    var4.method3577(1.0F);
                    var4.method3577(1.0F);
                    var4.method3577(1.0F);
                    var4.method3577(0.0F);
                    var4.method3577(1.0F);
                    var4.method3577(1.0F);
                    var4.method3577(1.0F);
                    var4.method3577(1.0F);
                    var4.method3577(1.0F);
                    var4.method3577(0.0F);
                    var4.method3577(0.0F);
                    var4.method3577(1.0F);
                    var4.method3577(0.0F);
                    var4.method3577(1.0F);
                    var4.method3577(0.0F);
                    var4.method3577(0.0F);
                    var4.method3577(0.0F);
                    var4.method3577(0.0F);
                    var4.method3577(0.0F);
                    var4.method3577(0.0F);
                    var4.method3577(0.0F);
                    var4.method3577(0.0F);
                } else {
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(1.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(1.0F);
                    var4.method3584(0.0F);
                    var4.method3584(1.0F);
                    var4.method3584(1.0F);
                    var4.method3584(1.0F);
                    var4.method3584(0.0F);
                    var4.method3584(1.0F);
                    var4.method3584(1.0F);
                    var4.method3584(1.0F);
                    var4.method3584(1.0F);
                    var4.method3584(1.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(1.0F);
                    var4.method3584(0.0F);
                    var4.method3584(1.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                }
                var4.method3578();
                if (this.field5543.method740(121)) {
                    break;
                }
            }
        }
        this.field5555 = this.method504((byte) 100, new class253[] { new class253(new class397[] { class397.field5604, class397.field5614, class397.field5614 }) });
    }

    @OriginalMember(owner = "client!ifa", name = "g", descriptor = "()V", line = 2850)
    public final void method302() {
        ++field5254;
        if (this.field5513 != null) {
            this.field5513.method1329((byte) 127);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "pa", descriptor = "(III)V", line = 2863)
    public final void method273(int arg0, int arg1, int arg2) {
        ++field5421;
        if (this.field5471 != arg0 || ~this.field5449 != ~arg1 || ~this.field5480 != ~arg2) {
            this.field5471 = arg0;
            this.field5449 = arg1;
            this.field5480 = arg2;
            this.method2309(-7285);
            this.method478((byte) 67);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "(ZI)V", line = 2879)
    public final void method2370(boolean arg0, int arg1) {
        ++field5412;
        if (!this.field5438 == arg0) {
            this.field5438 = arg0;
            this.method476(true);
        }
        if (arg1 > -23) {
            this.method329(118, 67, 105, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "()Z", line = 2897)
    public final boolean method218() {
        ++field5324;
        return false;
    }

    @OriginalMember(owner = "client!ifa", name = "y", descriptor = "(B)V", line = 2905)
    private final void method2371(byte arg0) {
        this.field5529 = (float) this.field5535;
        if (arg0 > -22) {
            this.field5448 = -115;
        }
        ++field5257;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lso;)V", line = 2919)
    public final void method228(class436 arg0) {
        this.field5442.method2116(2097680684, -1, this, arg0);
        ++field5306;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lso;I)V", line = 2928)
    public final void method223(class436 arg0, int arg1) {
        ++field5286;
        this.field5442.method2116(2097680684, arg1, this, arg0);
    }

    @OriginalMember(owner = "client!ifa", name = "z", descriptor = "(B)Lgi;", line = 2936)
    public final class629 method2372(byte arg0) {
        if (arg0 < 96) {
            this.field5497 = true;
        }
        ++field5415;
        return this.field5476 != null ? this.field5476.method3464(-120) : null;
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 2947)
    public final void method275(Canvas arg0) {
        ++field5389;
        Object var2 = null;
        if (arg0 != null && this.field5264 != arg0) {
            if (this.field5321.containsKey(arg0)) {
                var2 = this.field5321.get(arg0);
            }
        } else {
            var2 = this.field5380;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method487(8, arg0, var2);
            if (this.field5311 == arg0) {
                this.method2368(-1);
            }
        }
    }

    @OriginalMember(owner = "client!ifa", name = "A", descriptor = "(B)Ldd;", line = 2973)
    public final class653 method2373(byte arg0) {
        ++field5393;
        if (arg0 > -58) {
            this.field5467 = 1.4058646F;
        }
        return this.field5450[this.field5484];
    }

    @OriginalMember(owner = "client!ifa", name = "B", descriptor = "(B)V", line = 2984)
    public void method474(byte arg0) {
        this.field5494 = this.field5489;
        ++field5294;
        this.field5489 = 0;
        if (arg0 != 50) {
            this.field5520 = null;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(FFZFFFF)Z", line = 3000)
    private final boolean method2374(float arg0, float arg1, boolean arg2, float arg3, float arg4, float arg5, float arg6) {
        if (arg2) {
            this.method291();
        }
        ++field5354;
        Buffer var8 = this.field5545.method741(true, arg2);
        if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method2350(var8, true);
            if (!Stream.method3579()) {
                var9.method3577(arg5);
                var9.method3577(arg4);
                var9.method3577(arg6);
                var9.method3577(arg0);
                var9.method3577(arg3);
                var9.method3577(arg1);
            } else {
                var9.method3584(arg5);
                var9.method3584(arg4);
                var9.method3584(arg6);
                var9.method3584(arg0);
                var9.method3584(arg3);
                var9.method3584(arg1);
            }
            var9.method3578();
            return this.field5545.method740(106);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "(IIIII)V", line = 3042)
    public final void method320(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5288;
    }

    @OriginalMember(owner = "client!ifa", name = "m", descriptor = "()Z", line = 3051)
    public final boolean method318() {
        ++field5373;
        return true;
    }

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 3059)
    public final void method256(Canvas arg0) {
        ++field5427;
        if (this.field5264 == arg0) {
            throw new RuntimeException();
        } else if (this.field5321.containsKey(arg0)) {
            this.method483(true, this.field5321.get(arg0), arg0);
            this.field5321.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "O", descriptor = "(I)I", line = 3082)
    public final int method2375(int arg0) {
        int var2 = 91 % ((1 - arg0) / 51);
        ++field5387;
        return this.field5477;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZZ)Ljaclib/memory/heap/NativeHeapBuffer;", line = 3093)
    public final NativeHeapBuffer method2376(int arg0, boolean arg1, boolean arg2) {
        if (!arg2) {
            return null;
        } else {
            ++field5370;
            return this.field5287.method3569(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "(IIIIII)V", line = 3105)
    public final void method259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5365;
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
        if (this.method2374((float) arg2 + var9, 0.0F, false, (float) arg3 + var8, (float) arg1, (float) arg0, 0.0F)) {
            this.method2345(true);
            this.method2331(true, arg4);
            this.method2301(0, class308.field4083, 2);
            this.method2348(0, 6655, class308.field4083);
            this.method2353(arg5, (byte) -125);
            this.method2323(123);
            this.method486(3, false);
            this.method2333((byte) 51);
            this.method486(3, true);
            this.method2348(0, 6655, class519.field7612);
            this.method2301(0, class519.field7612, 2);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 3142)
    public final void method294(Canvas arg0) {
        this.field5311 = null;
        this.field5380 = null;
        ++field5298;
        if (arg0 != null && this.field5264 != arg0) {
            if (this.field5321.containsKey(arg0)) {
                this.field5380 = this.field5321.get(arg0);
                this.field5311 = arg0;
            }
        } else {
            this.field5311 = this.field5264;
            this.field5380 = this.field5302;
        }
        if (this.field5311 != null && this.field5380 != null) {
            this.method515(14, this.field5311, this.field5380);
            this.method2368(-1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I[FZZLfca;I)Lco;", line = 3179)
    public final class103 method2377(int arg0, float[] arg1, boolean arg2, boolean arg3, class75 arg4, int arg5) {
        ++field5277;
        if (!arg2) {
            this.field5509 = true;
        }
        return this.method511(arg4, 0, arg0, arg5, arg1, 0, 0, arg3);
    }

    @OriginalMember(owner = "client!ifa", name = "k", descriptor = "()Z", line = 3190)
    public final boolean method233() {
        ++field5246;
        return true;
    }

    @OriginalMember(owner = "client!ifa", name = "w", descriptor = "()Z", line = 3199)
    public final boolean method225() {
        ++field5253;
        return true;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIII)Lcaa;", line = 3207)
    public final class275 method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5405;
        return new class600(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I[Lul;)V", line = 3216)
    public final void method284(int arg0, class530[] arg1) {
        ++field5250;
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field5530[var3] = arg1[var3];
        }
        this.field5489 = arg0;
        if (this.field5503.method638((byte) -107)) {
            this.method474((byte) 50);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BB)V", line = 3240)
    public final void method2378(byte arg0, byte arg1) {
        if (arg1 != -123) {
            this.method502(false);
        }
        this.method2331(true, arg0 | arg0 << 8 | arg0 << 16 | arg0 << 24);
        ++field5347;
    }

    @OriginalMember(owner = "client!ifa", name = "CA", descriptor = "(IIII)V", line = 3253)
    public final void method229(int arg0, int arg1, int arg2, int arg3) {
        this.field5496 = true;
        ++field5372;
        this.field5501 = arg0;
        this.field5465 = arg1;
        this.field5498 = arg2;
        this.field5477 = arg3;
    }

    @OriginalMember(owner = "client!ifa", name = "Q", descriptor = "(I)I", line = 3266)
    public final int method2379(int arg0) {
        if (arg0 < 84) {
            this.field5510 = -6;
        }
        ++field5316;
        return this.field5484;
    }

    @OriginalMember(owner = "client!ifa", name = "R", descriptor = "(I)I", line = 3278)
    public final int method2380(int arg0) {
        ++field5283;
        return arg0 > -6 ? -28 : this.field5465;
    }

    @OriginalMember(owner = "client!ifa", name = "v", descriptor = "()[I", line = 3289)
    public final int[] method264() {
        ++field5300;
        return new int[] { this.field5531, this.field5482, this.field5490, this.field5470 };
    }

    @OriginalMember(owner = "client!ifa", name = "A", descriptor = "()Z", line = 3308)
    public final boolean method226() {
        ++field5269;
        return true;
    }

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "()I", line = 3319)
    public final int method232() {
        ++field5330;
        return this.field5516 + -2;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZBIZII)V", line = 3330)
    private final void method2381(boolean arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field5360;
        boolean var7 = arg3 & this.method224();
        if (!var7 && (arg2 == 4 || ~arg2 == -9 || ~arg2 == -10)) {
            arg2 = 2;
            arg5 = arg2 != 4 ? 1 : arg4 & 1;
            arg4 = 0;
        }
        if (arg1 >= -97) {
            this.field5448 = -25;
        }
        if (~arg2 != -1 && arg0) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field5437 != arg2) {
            if (this.field5437 != 0) {
                this.field5445[this.field5437 & Integer.MAX_VALUE].method374(112);
            }
            if (~arg2 != -1) {
                this.field5524 = this.field5445[Integer.MAX_VALUE & arg2];
                this.field5524.method377(86, arg0);
                this.field5524.method372(arg0, 0);
                this.field5524.method373(arg4, true, arg5);
            } else {
                this.field5524 = null;
            }
            this.field5437 = arg2;
            this.field5532 = arg5;
            this.field5448 = arg4;
        } else if (~this.field5437 != -1) {
            this.field5445[Integer.MAX_VALUE & this.field5437].method372(arg0, 0);
            if (this.field5448 != arg4 || ~this.field5532 != ~arg5) {
                this.field5445[this.field5437 & Integer.MAX_VALUE].method373(arg4, true, arg5);
                this.field5532 = arg5;
                this.field5448 = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IF)V", line = 3388)
    public final void method2382(int arg0, float arg1) {
        ++field5416;
        if (arg0 == 29065) {
            if (this.field5483 != arg1) {
                this.field5483 = arg1;
                this.method2347(0);
            }
        }
    }

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "(B)V")
    public abstract void method499(byte arg0);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZI)Lcda;")
    public abstract class154 method475(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "(Z)V")
    public abstract void method505(boolean arg0);

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "(B)V")
    public abstract void method497(byte arg0);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZIILuf;Z)V")
    public abstract void method512(boolean arg0, int arg1, int arg2, class414 arg3, boolean arg4);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "([IIIIIZI)Lco;")
    public abstract class103 method525(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!ifa", name = "g", descriptor = "(B)V")
    public abstract void method469(byte arg0);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIILqf;)V")
    public abstract void method508(int arg0, int arg1, int arg2, class632 arg3);

    @OriginalMember(owner = "client!ifa", name = "h", descriptor = "(B)V")
    public abstract void method478(byte arg0);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method515(int arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!ifa", name = "j", descriptor = "(B)V")
    public abstract void method520(byte arg0);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZLuf;Z)V")
    public abstract void method482(int arg0, boolean arg1, class414 arg2, boolean arg3);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lfca;ILbv;)Z")
    public abstract boolean method492(class75 arg0, int arg1, class279 arg2);

    @OriginalMember(owner = "client!ifa", name = "g", descriptor = "(Z)V")
    public abstract void method476(boolean arg0);

    @OriginalMember(owner = "client!ifa", name = "n", descriptor = "(B)V")
    public abstract void method517(byte arg0);

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(BZ)Lel;")
    public abstract class508 method516(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method522(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "(IZ)V")
    public abstract void method486(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ifa", name = "i", descriptor = "(Z)V")
    public abstract void method513(boolean arg0);

    @OriginalMember(owner = "client!ifa", name = "s", descriptor = "(I)V")
    public abstract void method521(int arg0);

    @OriginalMember(owner = "client!ifa", name = "u", descriptor = "(I)V")
    public abstract void method494(int arg0);

    @OriginalMember(owner = "client!ifa", name = "y", descriptor = "(I)V")
    public abstract void method472(int arg0);

    @OriginalMember(owner = "client!ifa", name = "z", descriptor = "(I)V")
    public abstract void method506(int arg0);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lfca;ZLbv;)Z")
    public abstract boolean method481(class75 arg0, boolean arg1, class279 arg2);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B[Lmm;)Lfj;")
    public abstract class607 method504(byte arg0, class253[] arg1);

    @OriginalMember(owner = "client!ifa", name = "u", descriptor = "(B)V")
    public abstract void method466(byte arg0);

    @OriginalMember(owner = "client!ifa", name = "C", descriptor = "(I)V")
    public abstract void method489(int arg0);

    @OriginalMember(owner = "client!ifa", name = "D", descriptor = "(I)V")
    public abstract void method485(int arg0);

    @OriginalMember(owner = "client!ifa", name = "w", descriptor = "(B)V")
    public abstract void method495(byte arg0);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZLjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method483(boolean arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method487(int arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!ifa", name = "g", descriptor = "(II)V")
    public abstract void method498(int arg0, int arg1);

    @OriginalMember(owner = "client!ifa", name = "H", descriptor = "(I)F")
    public abstract float method514(int arg0);

    @OriginalMember(owner = "client!ifa", name = "I", descriptor = "(I)V")
    public abstract void method509(int arg0);

    @OriginalMember(owner = "client!ifa", name = "k", descriptor = "(Z)V")
    public abstract void method473(boolean arg0);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lfca;III[FIIZ)Lco;")
    public abstract class103 method511(class75 arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lcr;I)V")
    public abstract void method471(class531 arg0, int arg1);

    @OriginalMember(owner = "client!ifa", name = "M", descriptor = "(I)V")
    public abstract void method526(int arg0);

    @OriginalMember(owner = "client!ifa", name = "N", descriptor = "(I)V")
    public abstract void method519(int arg0);

    @OriginalMember(owner = "client!ifa", name = "C", descriptor = "(B)V")
    public abstract void method524(byte arg0);

    @OriginalMember(owner = "client!ifa", name = "m", descriptor = "(Z)V")
    public abstract void method467(boolean arg0);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IILel;)V")
    public abstract void method493(int arg0, int arg1, class508 arg2);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILqf;IIILcda;B)V")
    public abstract void method528(int arg0, class632 arg1, int arg2, int arg3, int arg4, class154 arg5, byte arg6);

    @OriginalMember(owner = "client!ifa", name = "P", descriptor = "(I)V")
    public abstract void method468(int arg0);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZ[[II)Lgi;")
    public abstract class629 method470(int arg0, boolean arg1, int[][] arg2, int arg3);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "([BILfca;III)Lck;")
    public abstract class593 method500(byte[] arg0, int arg1, class75 arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILfca;BILbv;)Lco;")
    public abstract class103 method496(int arg0, class75 arg1, byte arg2, int arg3, class279 arg4);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZIILfca;[BIZI)Lco;")
    public abstract class103 method477(boolean arg0, int arg1, int arg2, class75 arg3, byte[] arg4, int arg5, boolean arg6, int arg7);

    @OriginalMember(owner = "client!ifa", name = "n", descriptor = "(Z)V")
    public abstract void method502(boolean arg0);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lfj;I)V")
    public abstract void method480(class607 arg0, int arg1);
}
