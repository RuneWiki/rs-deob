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

@OriginalClass("client!kfa")
public class class382 extends class98 {

    @OriginalMember(owner = "client!kfa", name = "Hb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field5317 = new Hashtable();

    @OriginalMember(owner = "client!kfa", name = "Xd", descriptor = "I")
    public int field5437 = 128;

    @OriginalMember(owner = "client!kfa", name = "ae", descriptor = "Lcga;")
    private class384 field5440 = new class384();

    @OriginalMember(owner = "client!kfa", name = "le", descriptor = "Lho;")
    private class286 field5451 = new class286();

    @OriginalMember(owner = "client!kfa", name = "ne", descriptor = "Lho;")
    public class286 field5453 = new class286();

    @OriginalMember(owner = "client!kfa", name = "re", descriptor = "I")
    public int field5457 = 3;

    @OriginalMember(owner = "client!kfa", name = "ue", descriptor = "Z")
    private boolean field5460 = false;

    @OriginalMember(owner = "client!kfa", name = "te", descriptor = "I")
    public int field5459 = 8;

    @OriginalMember(owner = "client!kfa", name = "oe", descriptor = "Lau;")
    private class692 field5454 = new class692();

    @OriginalMember(owner = "client!kfa", name = "Ae", descriptor = "I")
    private int field5466 = -1;

    @OriginalMember(owner = "client!kfa", name = "xe", descriptor = "[Lgj;")
    private class650[] field5463 = new class650[4];

    @OriginalMember(owner = "client!kfa", name = "ze", descriptor = "[Lgj;")
    private class650[] field5465 = new class650[4];

    @OriginalMember(owner = "client!kfa", name = "De", descriptor = "[Lgj;")
    private class650[] field5469 = new class650[4];

    @OriginalMember(owner = "client!kfa", name = "Be", descriptor = "I")
    private int field5467 = -1;

    @OriginalMember(owner = "client!kfa", name = "Fe", descriptor = "I")
    private int field5471 = -1;

    @OriginalMember(owner = "client!kfa", name = "Ee", descriptor = "Lgd;")
    private class346 field5470 = new class346();

    @OriginalMember(owner = "client!kfa", name = "Ge", descriptor = "Lmo;")
    private class482 field5472 = new class482(16);

    @OriginalMember(owner = "client!kfa", name = "Ke", descriptor = "Lau;")
    private class692 field5476 = new class692();

    @OriginalMember(owner = "client!kfa", name = "Me", descriptor = "Lau;")
    private class692 field5478 = new class692();

    @OriginalMember(owner = "client!kfa", name = "Ne", descriptor = "Lau;")
    private class692 field5479 = new class692();

    @OriginalMember(owner = "client!kfa", name = "Oe", descriptor = "Lau;")
    private class692 field5480 = new class692();

    @OriginalMember(owner = "client!kfa", name = "Pe", descriptor = "Lau;")
    private class692 field5481 = new class692();

    @OriginalMember(owner = "client!kfa", name = "Qe", descriptor = "Lau;")
    private class692 field5482 = new class692();

    @OriginalMember(owner = "client!kfa", name = "Re", descriptor = "Lau;")
    private class692 field5483 = new class692();

    @OriginalMember(owner = "client!kfa", name = "Ze", descriptor = "Lho;")
    public class286 field5491 = new class286();

    @OriginalMember(owner = "client!kfa", name = "bf", descriptor = "Lho;")
    public class286 field5493 = new class286();

    @OriginalMember(owner = "client!kfa", name = "cf", descriptor = "Lho;")
    public class286 field5494 = new class286();

    @OriginalMember(owner = "client!kfa", name = "uf", descriptor = "I")
    public int field5511 = 0;

    @OriginalMember(owner = "client!kfa", name = "Of", descriptor = "I")
    public int field5531 = 0;

    @OriginalMember(owner = "client!kfa", name = "yf", descriptor = "F")
    private float field5515 = 1.0F;

    @OriginalMember(owner = "client!kfa", name = "vf", descriptor = "[F")
    private float[] field5512 = new float[4];

    @OriginalMember(owner = "client!kfa", name = "Xf", descriptor = "I")
    public int field5540 = 50;

    @OriginalMember(owner = "client!kfa", name = "Wf", descriptor = "[Lam;")
    private class289[] field5539 = new class289[class298.field4202];

    @OriginalMember(owner = "client!kfa", name = "gg", descriptor = "F")
    public float field5549 = 3584.0F;

    @OriginalMember(owner = "client!kfa", name = "jf", descriptor = "I")
    private int field5500 = 0;

    @OriginalMember(owner = "client!kfa", name = "nf", descriptor = "F")
    public float field5504 = 1.0F;

    @OriginalMember(owner = "client!kfa", name = "lf", descriptor = "I")
    private int field5502 = 0;

    @OriginalMember(owner = "client!kfa", name = "Vf", descriptor = "Z")
    private boolean field5538 = true;

    @OriginalMember(owner = "client!kfa", name = "pf", descriptor = "I")
    private int field5506 = -1;

    @OriginalMember(owner = "client!kfa", name = "Jf", descriptor = "[F")
    private float[] field5526 = new float[16];

    @OriginalMember(owner = "client!kfa", name = "eg", descriptor = "F")
    public float field5547 = 1.0F;

    @OriginalMember(owner = "client!kfa", name = "tg", descriptor = "I")
    public int field5562 = 0;

    @OriginalMember(owner = "client!kfa", name = "xg", descriptor = "F")
    public float field5566 = -1.0F;

    @OriginalMember(owner = "client!kfa", name = "Bg", descriptor = "I")
    private int field5570 = 8448;

    @OriginalMember(owner = "client!kfa", name = "kf", descriptor = "F")
    private float field5501 = 1.0F;

    @OriginalMember(owner = "client!kfa", name = "ug", descriptor = "I")
    private int field5563 = 0;

    @OriginalMember(owner = "client!kfa", name = "dg", descriptor = "F")
    private float field5546 = -1.0F;

    @OriginalMember(owner = "client!kfa", name = "Df", descriptor = "I")
    public int field5520 = -1;

    @OriginalMember(owner = "client!kfa", name = "jg", descriptor = "I")
    public int field5552 = 512;

    @OriginalMember(owner = "client!kfa", name = "Rf", descriptor = "F")
    public float field5534 = 3584.0F;

    @OriginalMember(owner = "client!kfa", name = "Ng", descriptor = "Z")
    private boolean field5582 = false;

    @OriginalMember(owner = "client!kfa", name = "Ff", descriptor = "F")
    private float field5522 = -1.0F;

    @OriginalMember(owner = "client!kfa", name = "tf", descriptor = "I")
    public int field5510 = -1;

    @OriginalMember(owner = "client!kfa", name = "mg", descriptor = "I")
    public int field5555 = -1;

    @OriginalMember(owner = "client!kfa", name = "Og", descriptor = "I")
    public int field5583 = -1;

    @OriginalMember(owner = "client!kfa", name = "Lg", descriptor = "F")
    public float field5580 = -1.0F;

    @OriginalMember(owner = "client!kfa", name = "Qg", descriptor = "[F")
    private float[] field5585 = new float[4];

    @OriginalMember(owner = "client!kfa", name = "Tg", descriptor = "F")
    public float field5588 = 1.0F;

    @OriginalMember(owner = "client!kfa", name = "hg", descriptor = "I")
    private int field5550 = 8448;

    @OriginalMember(owner = "client!kfa", name = "Hg", descriptor = "[F")
    private float[] field5576 = new float[4];

    @OriginalMember(owner = "client!kfa", name = "bh", descriptor = "[F")
    public float[] field5596 = new float[4];

    @OriginalMember(owner = "client!kfa", name = "Hf", descriptor = "I")
    private int field5524 = 0;

    @OriginalMember(owner = "client!kfa", name = "Ug", descriptor = "I")
    private int field5589 = 0;

    @OriginalMember(owner = "client!kfa", name = "ih", descriptor = "I")
    private int field5603 = 0;

    @OriginalMember(owner = "client!kfa", name = "fh", descriptor = "F")
    private float field5600 = 0.0F;

    @OriginalMember(owner = "client!kfa", name = "hh", descriptor = "I")
    private int field5602 = 3584;

    @OriginalMember(owner = "client!kfa", name = "qg", descriptor = "I")
    public int field5559 = 0;

    @OriginalMember(owner = "client!kfa", name = "jh", descriptor = "I")
    public int field5604 = 512;

    @OriginalMember(owner = "client!kfa", name = "Uf", descriptor = "Lij;")
    public class351 field5537 = new class351(8192);

    @OriginalMember(owner = "client!kfa", name = "oh", descriptor = "[B")
    public byte[] field5609 = new byte[16384];

    @OriginalMember(owner = "client!kfa", name = "ph", descriptor = "[I")
    public int[] field5610 = new int[1];

    @OriginalMember(owner = "client!kfa", name = "nh", descriptor = "[I")
    public int[] field5608 = new int[1];

    @OriginalMember(owner = "client!kfa", name = "lh", descriptor = "[I")
    public int[] field5606 = new int[1];

    @OriginalMember(owner = "client!kfa", name = "Yc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5386;

    @OriginalMember(owner = "client!kfa", name = "fc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5341;

    @OriginalMember(owner = "client!kfa", name = "ee", descriptor = "I")
    public int field5444;

    @OriginalMember(owner = "client!kfa", name = "Nb", descriptor = "Ljaggl/OpenGL;")
    public OpenGL field5323;

    @OriginalMember(owner = "client!kfa", name = "Vc", descriptor = "J")
    private long field5383;

    @OriginalMember(owner = "client!kfa", name = "eb", descriptor = "J")
    private long field5288;

    @OriginalMember(owner = "client!kfa", name = "pg", descriptor = "Z")
    public boolean field5558;

    @OriginalMember(owner = "client!kfa", name = "sf", descriptor = "I")
    public int field5509;

    @OriginalMember(owner = "client!kfa", name = "Sg", descriptor = "Ljava/lang/String;")
    private String field5587;

    @OriginalMember(owner = "client!kfa", name = "Kf", descriptor = "Z")
    public boolean field5527;

    @OriginalMember(owner = "client!kfa", name = "Pg", descriptor = "Z")
    public boolean field5584;

    @OriginalMember(owner = "client!kfa", name = "gh", descriptor = "Z")
    private boolean field5601;

    @OriginalMember(owner = "client!kfa", name = "Lf", descriptor = "Z")
    public boolean field5528;

    @OriginalMember(owner = "client!kfa", name = "Rg", descriptor = "Z")
    public boolean field5586;

    @OriginalMember(owner = "client!kfa", name = "Kg", descriptor = "Z")
    private boolean field5579;

    @OriginalMember(owner = "client!kfa", name = "kg", descriptor = "Ljava/lang/String;")
    private String field5553;

    @OriginalMember(owner = "client!kfa", name = "Cg", descriptor = "Z")
    public boolean field5571;

    @OriginalMember(owner = "client!kfa", name = "vg", descriptor = "Z")
    private boolean field5564;

    @OriginalMember(owner = "client!kfa", name = "he", descriptor = "Ltm;")
    private class552 field5447;

    @OriginalMember(owner = "client!kfa", name = "se", descriptor = "Lun;")
    public class266 field5458;

    @OriginalMember(owner = "client!kfa", name = "ge", descriptor = "Lti;")
    private class487 field5446;

    @OriginalMember(owner = "client!kfa", name = "je", descriptor = "Lmj;")
    private class97 field5449;

    @OriginalMember(owner = "client!kfa", name = "de", descriptor = "Lwq;")
    private class492 field5443;

    @OriginalMember(owner = "client!kfa", name = "rc", descriptor = "J")
    public static long field5353 = 0L;

    @OriginalMember(owner = "client!kfa", name = "hf", descriptor = "F")
    public float field5499;

    @OriginalMember(owner = "client!kfa", name = "of", descriptor = "F")
    public float field5505;

    @OriginalMember(owner = "client!kfa", name = "xf", descriptor = "F")
    private float field5514;

    @OriginalMember(owner = "client!kfa", name = "Qf", descriptor = "F")
    public float field5533;

    @OriginalMember(owner = "client!kfa", name = "ig", descriptor = "F")
    public float field5551;

    @OriginalMember(owner = "client!kfa", name = "rg", descriptor = "F")
    private float field5560;

    @OriginalMember(owner = "client!kfa", name = "wg", descriptor = "F")
    private float field5565;

    @OriginalMember(owner = "client!kfa", name = "Dg", descriptor = "F")
    public float field5572;

    @OriginalMember(owner = "client!kfa", name = "Xg", descriptor = "F")
    public float field5592;

    @OriginalMember(owner = "client!kfa", name = "t", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!kfa", name = "u", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!kfa", name = "v", descriptor = "I")
    public int field5253;

    @OriginalMember(owner = "client!kfa", name = "w", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!kfa", name = "x", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!kfa", name = "y", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!kfa", name = "z", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!kfa", name = "A", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!kfa", name = "B", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!kfa", name = "C", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!kfa", name = "D", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!kfa", name = "E", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!kfa", name = "F", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!kfa", name = "G", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!kfa", name = "H", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!kfa", name = "I", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!kfa", name = "J", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!kfa", name = "K", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!kfa", name = "L", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!kfa", name = "M", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!kfa", name = "N", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!kfa", name = "O", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!kfa", name = "P", descriptor = "I")
    private int field5273;

    @OriginalMember(owner = "client!kfa", name = "Q", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!kfa", name = "R", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!kfa", name = "S", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!kfa", name = "T", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!kfa", name = "U", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!kfa", name = "V", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!kfa", name = "W", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!kfa", name = "X", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!kfa", name = "Y", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!kfa", name = "Z", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!kfa", name = "ab", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!kfa", name = "bb", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!kfa", name = "cb", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!kfa", name = "db", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!kfa", name = "fb", descriptor = "I")
    public int field5289;

    @OriginalMember(owner = "client!kfa", name = "gb", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!kfa", name = "hb", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!kfa", name = "ib", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!kfa", name = "jb", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!kfa", name = "kb", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!kfa", name = "lb", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!kfa", name = "mb", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!kfa", name = "nb", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!kfa", name = "ob", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!kfa", name = "pb", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!kfa", name = "qb", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!kfa", name = "rb", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!kfa", name = "sb", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!kfa", name = "tb", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!kfa", name = "ub", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!kfa", name = "vb", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!kfa", name = "wb", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!kfa", name = "xb", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!kfa", name = "yb", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!kfa", name = "zb", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!kfa", name = "Ab", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!kfa", name = "Bb", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!kfa", name = "Cb", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!kfa", name = "Db", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!kfa", name = "Eb", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!kfa", name = "Fb", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!kfa", name = "Gb", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!kfa", name = "Ib", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!kfa", name = "Jb", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!kfa", name = "Kb", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!kfa", name = "Lb", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!kfa", name = "Mb", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!kfa", name = "Ob", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!kfa", name = "Pb", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!kfa", name = "Qb", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!kfa", name = "Rb", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!kfa", name = "Sb", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!kfa", name = "Tb", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!kfa", name = "Ub", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!kfa", name = "Vb", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!kfa", name = "Wb", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!kfa", name = "Xb", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!kfa", name = "Yb", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!kfa", name = "Zb", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!kfa", name = "ac", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!kfa", name = "bc", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!kfa", name = "cc", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!kfa", name = "dc", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!kfa", name = "ec", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!kfa", name = "gc", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!kfa", name = "hc", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!kfa", name = "ic", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!kfa", name = "jc", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!kfa", name = "kc", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!kfa", name = "lc", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!kfa", name = "mc", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!kfa", name = "nc", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!kfa", name = "oc", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!kfa", name = "pc", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!kfa", name = "qc", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!kfa", name = "sc", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!kfa", name = "tc", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!kfa", name = "uc", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!kfa", name = "vc", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!kfa", name = "wc", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!kfa", name = "xc", descriptor = "I")
    private int field5359;

    @OriginalMember(owner = "client!kfa", name = "yc", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!kfa", name = "zc", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!kfa", name = "Ac", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!kfa", name = "Bc", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!kfa", name = "Cc", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!kfa", name = "Dc", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!kfa", name = "Ec", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!kfa", name = "Fc", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!kfa", name = "Gc", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!kfa", name = "Hc", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!kfa", name = "Ic", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!kfa", name = "Jc", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!kfa", name = "Kc", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!kfa", name = "Lc", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!kfa", name = "Mc", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!kfa", name = "Nc", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!kfa", name = "Oc", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!kfa", name = "Pc", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!kfa", name = "Qc", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!kfa", name = "Rc", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!kfa", name = "Sc", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!kfa", name = "Tc", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!kfa", name = "Uc", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!kfa", name = "Wc", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!kfa", name = "Xc", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!kfa", name = "Zc", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!kfa", name = "ad", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!kfa", name = "bd", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!kfa", name = "cd", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!kfa", name = "dd", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!kfa", name = "ed", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!kfa", name = "fd", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!kfa", name = "gd", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!kfa", name = "hd", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!kfa", name = "id", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!kfa", name = "jd", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!kfa", name = "kd", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!kfa", name = "ld", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!kfa", name = "md", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!kfa", name = "nd", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!kfa", name = "od", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!kfa", name = "pd", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!kfa", name = "qd", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!kfa", name = "rd", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!kfa", name = "sd", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!kfa", name = "td", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!kfa", name = "ud", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!kfa", name = "vd", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!kfa", name = "wd", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!kfa", name = "xd", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!kfa", name = "zd", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!kfa", name = "Ad", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!kfa", name = "Bd", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!kfa", name = "Cd", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!kfa", name = "Dd", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!kfa", name = "Ed", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!kfa", name = "Fd", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!kfa", name = "Gd", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!kfa", name = "Hd", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!kfa", name = "Id", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!kfa", name = "Jd", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!kfa", name = "Kd", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!kfa", name = "Ld", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!kfa", name = "Md", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!kfa", name = "Nd", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!kfa", name = "Od", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!kfa", name = "Pd", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!kfa", name = "Qd", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!kfa", name = "Rd", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!kfa", name = "Sd", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!kfa", name = "Td", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!kfa", name = "Ud", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!kfa", name = "Vd", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!kfa", name = "Wd", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!kfa", name = "Yd", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!kfa", name = "Zd", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!kfa", name = "be", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!kfa", name = "ce", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!kfa", name = "fe", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!kfa", name = "ie", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!kfa", name = "ke", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!kfa", name = "me", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!kfa", name = "qe", descriptor = "I")
    public int field5456;

    @OriginalMember(owner = "client!kfa", name = "He", descriptor = "I")
    public int field5473;

    @OriginalMember(owner = "client!kfa", name = "Ie", descriptor = "I")
    private int field5474;

    @OriginalMember(owner = "client!kfa", name = "Je", descriptor = "I")
    private int field5475;

    @OriginalMember(owner = "client!kfa", name = "Le", descriptor = "I")
    public int field5477;

    @OriginalMember(owner = "client!kfa", name = "Te", descriptor = "I")
    private int field5485;

    @OriginalMember(owner = "client!kfa", name = "Ve", descriptor = "I")
    private int field5487;

    @OriginalMember(owner = "client!kfa", name = "Ye", descriptor = "I")
    private int field5490;

    @OriginalMember(owner = "client!kfa", name = "ef", descriptor = "I")
    private int field5496;

    @OriginalMember(owner = "client!kfa", name = "ff", descriptor = "I")
    private int field5497;

    @OriginalMember(owner = "client!kfa", name = "wf", descriptor = "I")
    private int field5513;

    @OriginalMember(owner = "client!kfa", name = "Af", descriptor = "I")
    private int field5517;

    @OriginalMember(owner = "client!kfa", name = "Pf", descriptor = "I")
    private int field5532;

    @OriginalMember(owner = "client!kfa", name = "cg", descriptor = "I")
    public int field5545;

    @OriginalMember(owner = "client!kfa", name = "lg", descriptor = "I")
    private int field5554;

    @OriginalMember(owner = "client!kfa", name = "sg", descriptor = "I")
    private int field5561;

    @OriginalMember(owner = "client!kfa", name = "Ag", descriptor = "I")
    public int field5569;

    @OriginalMember(owner = "client!kfa", name = "Jg", descriptor = "I")
    public int field5578;

    @OriginalMember(owner = "client!kfa", name = "Vg", descriptor = "I")
    private int field5590;

    @OriginalMember(owner = "client!kfa", name = "Zg", descriptor = "I")
    public int field5594;

    @OriginalMember(owner = "client!kfa", name = "kh", descriptor = "I")
    private int field5605;

    @OriginalMember(owner = "client!kfa", name = "mh", descriptor = "I")
    private int field5607;

    @OriginalMember(owner = "client!kfa", name = "af", descriptor = "J")
    private long field5492;

    @OriginalMember(owner = "client!kfa", name = "Cf", descriptor = "Lbb;")
    private class196 field5519;

    @OriginalMember(owner = "client!kfa", name = "Yf", descriptor = "Lmn;")
    private class212 field5541;

    @OriginalMember(owner = "client!kfa", name = "ye", descriptor = "Lrk;")
    private class260 field5464;

    @OriginalMember(owner = "client!kfa", name = "ng", descriptor = "Luba;")
    private class298 field5556;

    @OriginalMember(owner = "client!kfa", name = "ag", descriptor = "Lnu;")
    private class411 field5543;

    @OriginalMember(owner = "client!kfa", name = "Fg", descriptor = "Lnu;")
    private class411 field5574;

    @OriginalMember(owner = "client!kfa", name = "gf", descriptor = "Lqb;")
    public class56 field5498;

    @OriginalMember(owner = "client!kfa", name = "mf", descriptor = "Lqb;")
    public class56 field5503;

    @OriginalMember(owner = "client!kfa", name = "Bf", descriptor = "Lqb;")
    public class56 field5518;

    @OriginalMember(owner = "client!kfa", name = "Ef", descriptor = "Lqb;")
    public class56 field5521;

    @OriginalMember(owner = "client!kfa", name = "Nf", descriptor = "Lqb;")
    public class56 field5530;

    @OriginalMember(owner = "client!kfa", name = "yg", descriptor = "Lqb;")
    public class56 field5567;

    @OriginalMember(owner = "client!kfa", name = "zg", descriptor = "Lqb;")
    public class56 field5568;

    @OriginalMember(owner = "client!kfa", name = "Eg", descriptor = "Lqb;")
    public class56 field5573;

    @OriginalMember(owner = "client!kfa", name = "Gg", descriptor = "Lqb;")
    public class56 field5575;

    @OriginalMember(owner = "client!kfa", name = "ch", descriptor = "Lqb;")
    public class56 field5597;

    @OriginalMember(owner = "client!kfa", name = "Gf", descriptor = "Lil;")
    public class586 field5523;

    @OriginalMember(owner = "client!kfa", name = "we", descriptor = "Lgj;")
    private class650 field5462;

    @OriginalMember(owner = "client!kfa", name = "Ce", descriptor = "Lgj;")
    private class650 field5468;

    @OriginalMember(owner = "client!kfa", name = "Tf", descriptor = "Lmba;")
    public class70 field5536;

    @OriginalMember(owner = "client!kfa", name = "bg", descriptor = "Lmba;")
    public class70 field5544;

    @OriginalMember(owner = "client!kfa", name = "ve", descriptor = "Lec;")
    private class92 field5461;

    @OriginalMember(owner = "client!kfa", name = "If", descriptor = "Lec;")
    public class92 field5525;

    @OriginalMember(owner = "client!kfa", name = "pe", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field5455;

    @OriginalMember(owner = "client!kfa", name = "Se", descriptor = "Z")
    private boolean field5484;

    @OriginalMember(owner = "client!kfa", name = "Ue", descriptor = "Z")
    private boolean field5486;

    @OriginalMember(owner = "client!kfa", name = "We", descriptor = "Z")
    private boolean field5488;

    @OriginalMember(owner = "client!kfa", name = "Xe", descriptor = "Z")
    private boolean field5489;

    @OriginalMember(owner = "client!kfa", name = "qf", descriptor = "Z")
    public boolean field5507;

    @OriginalMember(owner = "client!kfa", name = "rf", descriptor = "Z")
    public boolean field5508;

    @OriginalMember(owner = "client!kfa", name = "zf", descriptor = "Z")
    public boolean field5516;

    @OriginalMember(owner = "client!kfa", name = "Mf", descriptor = "Z")
    public boolean field5529;

    @OriginalMember(owner = "client!kfa", name = "Sf", descriptor = "Z")
    private boolean field5535;

    @OriginalMember(owner = "client!kfa", name = "Zf", descriptor = "Z")
    public boolean field5542;

    @OriginalMember(owner = "client!kfa", name = "fg", descriptor = "Z")
    private boolean field5548;

    @OriginalMember(owner = "client!kfa", name = "og", descriptor = "Z")
    private boolean field5557;

    @OriginalMember(owner = "client!kfa", name = "Ig", descriptor = "Z")
    private boolean field5577;

    @OriginalMember(owner = "client!kfa", name = "Mg", descriptor = "Z")
    private boolean field5581;

    @OriginalMember(owner = "client!kfa", name = "Wg", descriptor = "Z")
    private boolean field5591;

    @OriginalMember(owner = "client!kfa", name = "Yg", descriptor = "Z")
    public boolean field5593;

    @OriginalMember(owner = "client!kfa", name = "ah", descriptor = "Z")
    public boolean field5595;

    @OriginalMember(owner = "client!kfa", name = "dh", descriptor = "Z")
    private boolean field5598;

    @OriginalMember(owner = "client!kfa", name = "eh", descriptor = "Z")
    public boolean field5599;

    @OriginalMember(owner = "client!kfa", name = "yd", descriptor = "[I")
    public static int[] field5412;

    @OriginalMember(owner = "client!kfa", name = "df", descriptor = "[Ljo;")
    private class337[] field5495;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIZ)Lf;", line = 3)
    public final class257 method825(int arg0, int arg1, boolean arg2) {
        ++field5345;
        return new class260(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(IIII)V", line = 12)
    public final void method2258(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg3 + 34184, arg1);
        if (arg0 >= -34) {
            this.field5532 = -21;
        }
        ++field5300;
        OpenGL.glTexEnvi(8960, arg3 + 34200, arg2);
    }

    @OriginalMember(owner = "client!kfa", name = "YA", descriptor = "(IIII)V", line = 24)
    public final void method809(int arg0, int arg1, int arg2, int arg3) {
        ++field5438;
        if (!this.field5516) {
            throw new RuntimeException("");
        } else {
            this.field5569 = arg0;
            this.field5583 = arg2;
            this.field5555 = arg1;
            this.field5511 = arg3;
            if (this.field5582) {
                this.field5443.field7062.method3247((byte) -18);
                this.field5443.field7062.method3245(false);
            }
        }
    }

    @OriginalMember(owner = "client!kfa", name = "VA", descriptor = "(IFFFFF)V", line = 51)
    public final void method756(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field5270;
        boolean var7 = this.field5506 != arg0;
        if (var7 || this.field5580 != arg1 || this.field5566 != arg2) {
            this.field5580 = arg1;
            this.field5506 = arg0;
            this.field5566 = arg2;
            if (var7) {
                this.field5547 = (float) (this.field5506 & 65280) / 65280.0F;
                this.field5504 = (float) (this.field5506 & 255) / 255.0F;
                this.field5588 = (float) (this.field5506 & 16711680) / 1.671168E7F;
                this.method2313(-1);
            }
            this.method2326(2);
        }
        if (this.field5585[0] != arg3 || this.field5585[1] != arg4 || this.field5585[2] != arg5) {
            this.field5585[0] = arg3;
            this.field5585[2] = arg5;
            this.field5585[1] = arg4;
            this.field5512[1] = -arg4;
            this.field5512[2] = -arg5;
            this.field5512[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5596[0] = arg3 * var8;
            this.field5596[2] = arg5 * var8;
            this.field5596[1] = arg4 * var8;
            this.field5576[0] = -this.field5596[0];
            this.field5576[2] = -this.field5596[2];
            this.field5576[1] = -this.field5596[1];
            this.method2312(-20899);
            this.field5578 = (int) (arg3 * 256.0F / arg4);
            this.field5594 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIIIII)V", line = 100)
    public final void method743(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5257;
        OpenGL.glLineWidth((float) arg5);
        this.method782(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!kfa", name = "j", descriptor = "()V", line = 112)
    public final void method776() {
        ++field5371;
    }

    @OriginalMember(owner = "client!kfa", name = "q", descriptor = "()V", line = 123)
    public final void method87() throws class300 {
        try {
            this.field5323.swapBuffers();
        } catch (Exception var1) {
        }
        ++field5426;
    }

    @OriginalMember(owner = "client!kfa", name = "m", descriptor = "(IIIII)V", line = 140)
    public final void method817(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5424;
        this.method2319(true);
        this.method2325(arg4, (byte) 45);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kfa", name = "v", descriptor = "()[I", line = 160)
    public final int[] method826() {
        ++field5321;
        return new int[] { this.field5531, this.field5562, this.field5552, this.field5604 };
    }

    @OriginalMember(owner = "client!kfa", name = "IA", descriptor = "(IIIIII[BII)V", line = 168)
    public final void method789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field5325;
        float var10;
        float var11;
        if (this.field5519 != null && this.field5519.field8567 >= arg2 && this.field5519.field8571 >= arg3) {
            this.field5519.method3384(arg2, false, arg6, 0, 0, 0, 0, arg3, 0, 6406);
            var10 = (float) arg3 * this.field5519.field3063 / (float) this.field5519.field8571;
            var11 = (float) arg2 * this.field5519.field3060 / (float) this.field5519.field8567;
        } else {
            this.field5519 = class16.method195(6406, arg2, (byte) -27, 6406, this, arg3, false, arg6);
            this.field5519.method3379((byte) 102, false, false);
            var11 = this.field5519.field3060;
            var10 = this.field5519.field3063;
        }
        this.method2337(121);
        this.method2295((byte) -123, this.field5519);
        this.method2325(arg8, (byte) 45);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2297((byte) -128, arg5);
        this.method2328(34165, -91, 34165);
        this.method2262(34166, 0, 34176, 768);
        this.method2262(5890, 2, 34176, 770);
        this.method2258(-54, 34166, 770, 0);
        this.method2258(-54, 5890, 770, 2);
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
        this.method2262(5890, 0, 34176, 768);
        this.method2262(34166, 2, 34176, 770);
        this.method2258(-59, 5890, 770, 0);
        this.method2258(-74, 34166, 770, 2);
    }

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "(I)V", line = 225)
    public final synchronized void method147(int arg0) {
        ++field5311;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field5478.method3903(2)) {
            class83 var12 = (class83) this.field5478.method3906(0);
            class409.field5855[var2++] = (int) var12.field6265;
            this.field5473 -= var12.field1264;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class409.field5855, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteBuffersARB(var2, class409.field5855, 0);
            var2 = 0;
        }
        while (!this.field5479.method3903(2)) {
            class83 var11 = (class83) this.field5479.method3906(0);
            class409.field5855[var2++] = (int) var11.field6265;
            this.field5477 -= var11.field1264;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class409.field5855, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class409.field5855, 0);
            var2 = 0;
        }
        while (!this.field5480.method3903(2)) {
            class83 var10 = (class83) this.field5480.method3906(0);
            class409.field5855[var2++] = var10.field1264;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class409.field5855, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class409.field5855, 0);
            var2 = 0;
        }
        while (!this.field5481.method3903(2)) {
            class83 var9 = (class83) this.field5481.method3906(0);
            class409.field5855[var2++] = (int) var9.field6265;
            this.field5475 -= var9.field1264;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class409.field5855, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class409.field5855, 0);
            boolean var4 = false;
        }
        while (!this.field5476.method3903(2)) {
            class83 var8 = (class83) this.field5476.method3906(0);
            OpenGL.glDeleteLists((int) var8.field6265, var8.field1264);
        }
        while (!this.field5482.method3903(2)) {
            class435 var7 = this.field5482.method3906(0);
            OpenGL.glDeleteProgramARB((int) var7.field6265);
        }
        while (!this.field5483.method3903(2)) {
            class435 var6 = this.field5483.method3906(0);
            OpenGL.glDeleteObjectARB(var6.field6265);
        }
        while (!this.field5476.method3903(2)) {
            class83 var5 = (class83) this.field5476.method3906(0);
            OpenGL.glDeleteLists((int) var5.field6265, var5.field1264);
        }
        this.field5447.method3237(-15994);
        if (this.method775() > 100663296 && this.field5492 + 60000L < class254.method1619(true)) {
            System.gc();
            this.field5492 = class254.method1619(true);
        }
        this.field5456 = var3;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IF)V", line = 393)
    public final void method2259(int arg0, float arg1) {
        ++field5308;
        if (this.field5515 != arg1) {
            this.field5515 = arg1;
            if (this.field5532 == 3) {
                this.method2291((byte) 105);
            }
        }
        if (arg0 != 9801) {
            this.method764((int[]) null);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "y", descriptor = "()Z", line = 414)
    public final boolean method814() {
        ++field5283;
        return true;
    }

    @OriginalMember(owner = "client!kfa", name = "T", descriptor = "()I", line = 422)
    public final int method796() {
        ++field5274;
        int var1 = this.field5605;
        this.field5605 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)V", line = 434)
    private final void method2260(byte arg0) {
        ++field5396;
        float[] var2 = this.field5526;
        float var3 = (float) (-this.field5531 * this.field5540) / (float) this.field5552;
        float var4 = (float) ((-this.field5531 + this.field5253) * this.field5540) / (float) this.field5552;
        float var5 = (float) (this.field5562 * this.field5540) / (float) this.field5604;
        if (arg0 != -36) {
            this.field5440 = null;
        }
        float var6 = (float) ((this.field5562 - this.field5289) * this.field5540) / (float) this.field5604;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field5540 * 2.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[10] = this.field5560 = (float) (-(this.field5602 - -this.field5540)) / (float) (-this.field5540 + this.field5602);
            var2[15] = 0.0F;
            var2[7] = 0.0F;
            var2[6] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[13] = 0.0F;
            var2[3] = 0.0F;
            var2[2] = 0.0F;
            var2[14] = this.field5565 = -((float) this.field5602 * var7) / (float) (this.field5602 - this.field5540);
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[4] = 0.0F;
            var2[11] = -1.0F;
            var2[5] = var7 / (-var6 + var5);
            var2[12] = 0.0F;
            var2[1] = 0.0F;
        } else {
            var2[10] = 1.0F;
            var2[1] = 0.0F;
            var2[7] = 0.0F;
            var2[14] = 0.0F;
            var2[13] = 0.0F;
            var2[2] = 0.0F;
            var2[3] = 0.0F;
            var2[4] = 0.0F;
            var2[6] = 0.0F;
            var2[0] = 1.0F;
            var2[9] = 0.0F;
            var2[11] = 0.0F;
            var2[15] = 1.0F;
            var2[8] = 0.0F;
            var2[12] = 0.0F;
            var2[5] = 1.0F;
        }
        this.method2305((byte) -112);
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(B)V", line = 498)
    public final void method2261(byte arg0) {
        if (this.field5487 != 4) {
            this.method2318(arg0 + 203);
            this.method2303(false, -32);
            this.method2272(false, (byte) -9);
            this.method2282(false, true);
            this.method2275(false, 123);
            this.method2321(-1111, -2);
            this.method2325(1, (byte) 45);
            this.field5487 = 4;
        }
        if (arg0 != -77) {
            this.field5573 = null;
        }
        ++field5384;
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(IIII)V", line = 521)
    public final void method2262(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg1 + arg2, arg0);
        ++field5282;
        OpenGL.glTexEnvi(8960, arg1 + 34192, arg3);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZLgj;)V", line = 530)
    public final void method2263(boolean arg0, class650 arg1) {
        if (!arg0) {
            this.field5457 = 50;
        }
        ++field5332;
        if (!this.field5593) {
            if (this.field5471 >= 3) {
                throw new RuntimeException();
            } else {
                if (this.field5471 >= 0) {
                    this.field5469[this.field5471].method686((byte) -63);
                }
                this.field5468 = this.field5462 = this.field5469[++this.field5471] = arg1;
                this.field5468.method677(29991);
            }
        } else {
            this.method2330(-4, arg1);
            this.method2264(arg1, 32507);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "BA", descriptor = "()I", line = 562)
    public final int method820() {
        ++field5354;
        return this.field5540;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lgj;I)V", line = 571)
    public final void method2264(class650 arg0, int arg1) {
        ++field5327;
        if (this.field5467 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field5467 <= -1) {
                this.field5465[this.field5467].method678(-120);
            }
            this.field5462 = this.field5465[++this.field5467] = arg0;
            if (arg1 == 32507) {
                this.field5462.method683(-16793);
            }
        }
    }

    @OriginalMember(owner = "client!kfa", name = "CA", descriptor = "(IIII)V", line = 593)
    public final void method760(int arg0, int arg1, int arg2, int arg3) {
        this.field5516 = true;
        this.field5569 = arg0;
        this.field5511 = arg3;
        ++field5251;
        this.field5555 = arg1;
        this.field5583 = arg2;
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(IIIIII)V", line = 608)
    public final void method791(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5296;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        this.method2319(true);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method2325(arg5, (byte) 45);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5598) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5598) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "ya", descriptor = "()V", line = 643)
    public final void method138() {
        ++field5302;
        this.method2275(true, 121);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!kfa", name = "i", descriptor = "(I)V", line = 654)
    public static void method2265(int arg0) {
        field5412 = null;
        if (arg0 != 32) {
            method2281((byte) -98);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "([I)V", line = 664)
    public final void method769(int[] arg0) {
        ++field5304;
        arg0[1] = this.field5289;
        arg0[0] = this.field5253;
    }

    @OriginalMember(owner = "client!kfa", name = "j", descriptor = "(I)V", line = 679)
    private final void method2266(int arg0) {
        if (arg0 <= -66) {
            ++field5301;
            if (~this.field5532 != -4) {
                this.field5532 = 3;
                this.method2291((byte) 114);
                this.method2267((byte) -41);
                this.field5487 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!kfa", name = "m", descriptor = "()Lsr;", line = 697)
    public final class568 method77() {
        ++field5277;
        int var1 = -1;
        if (this.field5553.indexOf("nvidia") == -1) {
            if (this.field5553.indexOf("intel") == -1) {
                if (this.field5553.indexOf("ati") != -1) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class568(var1, "OpenGL", this.field5497, this.field5587, 0L);
    }

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "(I)V", line = 719)
    public final void method774(int arg0) {
        this.method2327(0);
        ++field5367;
    }

    @OriginalMember(owner = "client!kfa", name = "w", descriptor = "()Lq;", line = 729)
    public final class152 method812() {
        ++field5263;
        return new class286();
    }

    @OriginalMember(owner = "client!kfa", name = "n", descriptor = "()Z", line = 737)
    public final boolean method785() {
        ++field5402;
        return true;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 746)
    public final void method758(Canvas arg0) {
        ++field5441;
        this.field5288 = 0L;
        this.field5341 = null;
        if (arg0 != null && this.field5386 != arg0) {
            if (this.field5317.containsKey(arg0)) {
                Long var2 = (Long) this.field5317.get(arg0);
                this.field5288 = var2;
                this.field5341 = arg0;
            }
        } else {
            this.field5288 = this.field5383;
            this.field5341 = this.field5386;
        }
        if (this.field5341 != null && ~this.field5288 != -1L) {
            this.field5323.setSurface(this.field5288);
            this.method2292((byte) -124);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "()Z", line = 777)
    public final boolean method766() {
        ++field5370;
        return true;
    }

    @OriginalMember(owner = "client!kfa", name = "JA", descriptor = "()V", line = 786)
    public final void method805() {
        this.field5524 = 0;
        this.field5502 = this.field5253;
        this.field5500 = this.field5289;
        ++field5329;
        this.field5603 = 0;
        OpenGL.glDisable(3089);
        this.method2277(false);
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(B)V", line = 801)
    private final void method2267(byte arg0) {
        OpenGL.glLoadIdentity();
        ++field5401;
        OpenGL.glMultMatrixf(this.field5493.method1765(8797), 0);
        if (this.field5582) {
            this.field5443.field7062.method3247((byte) -18);
        }
        this.method2312(-20899);
        this.method2268((byte) -22);
        if (arg0 != -41) {
            this.method2314(3);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "(B)V", line = 821)
    private final void method2268(byte arg0) {
        ++field5375;
        int var2;
        for (var2 = 0; var2 < this.field5517; ++var2) {
            class289 var4 = this.field5539[var2];
            int var5 = var2 + 16386;
            class685.field9734[0] = (float) var4.method1776((byte) -116);
            class685.field9734[1] = (float) var4.method1775((byte) 83);
            class685.field9734[2] = (float) var4.method1771(true);
            class685.field9734[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class685.field9734, 0);
            int var6 = var4.method1774(108);
            float var7 = var4.method1777(-4) / 255.0F;
            class685.field9734[1] = (float) class248.method1593(var6 >> 8, 255) * var7;
            class685.field9734[0] = (float) class248.method1593(255, var6 >> 16) * var7;
            class685.field9734[2] = (float) class248.method1593(255, var6) * var7;
            OpenGL.glLightfv(var5, 4609, class685.field9734, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var4.method1772(true) * var4.method1772(true)));
            OpenGL.glEnable(var5);
        }
        int var3 = -91 % ((57 - arg0) / 63);
        while (this.field5561 > var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field5561 = this.field5517;
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 865)
    public final void method803(Canvas arg0) {
        ++field5294;
        if (this.field5386 == arg0) {
            throw new RuntimeException();
        } else if (this.field5317.containsKey(arg0)) {
            Long var2 = (Long) this.field5317.get(arg0);
            this.field5323.releaseSurface(arg0, var2);
            this.field5317.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "z", descriptor = "()Z", line = 884)
    public final boolean method816() {
        ++field5278;
        return true;
    }

    @OriginalMember(owner = "client!kfa", name = "k", descriptor = "(I)V", line = 893)
    public final void method2269(int arg0) {
        if (this.field5487 != arg0) {
            this.method2266(-82);
            this.method2303(true, arg0 + -48);
            this.method2282(true, true);
            this.method2275(true, 123);
            this.method2325(1, (byte) 45);
            this.field5487 = 16;
        }
        ++field5295;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lqg;)V", line = 912)
    public final void method737(class272 arg0) {
        this.field5440.method2344(-1, -662352532, this, arg0);
        ++field5373;
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(II)I", line = 923)
    public final int method754(int arg0, int arg1) {
        ++field5322;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!kfa", name = "l", descriptor = "()Z", line = 931)
    public final boolean method778() {
        ++field5415;
        return true;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IB)V", line = 941)
    public final void method2270(int arg0, byte arg1) {
        if (arg1 == 110) {
            ++field5287;
            if (arg0 == 1) {
                this.method2328(7681, arg1 + -2, 7681);
            } else if (arg0 == 0) {
                this.method2328(8448, 108, 8448);
            } else if (arg0 == 2) {
                this.method2328(34165, 51, 7681);
            } else if (arg0 == 3) {
                this.method2328(260, 72, 8448);
            } else if (arg0 == 4) {
                this.method2328(34023, -102, 34023);
            }
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIIIILua;II)V", line = 970)
    public final void method779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class591 arg6, int arg7, int arg8) {
        ++field5414;
        class91 var10 = (class91) arg6;
        class196 var11 = var10.field1336;
        this.method2337(124);
        this.method2295((byte) -103, var10.field1336);
        this.method2325(arg5, (byte) 45);
        this.method2328(7681, 55, 8448);
        this.method2262(34167, 0, 34176, 768);
        float var12 = var11.field3060 / (float) var11.field3056;
        float var13 = var11.field3063 / (float) var11.field3058;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var14 * var16;
        float var18 = var15 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method2262(5890, 0, 34176, 768);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILgj;)V", line = 1009)
    public final void method2271(int arg0, class650 arg1) {
        ++field5265;
        if (this.field5466 >= 0 && this.field5463[this.field5466] == arg1) {
            this.field5463[this.field5466--] = null;
            int var3 = -102 % ((arg0 - -47) / 33);
            arg1.method687(14837);
            if (this.field5466 < 0) {
                this.field5468 = null;
            } else {
                this.field5468 = this.field5463[this.field5466];
                this.field5468.method689((byte) 28);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZB)V", line = 1032)
    public final void method2272(boolean arg0, byte arg1) {
        if (arg1 == -9) {
            if (arg0 == !this.field5581) {
                this.field5581 = arg0;
                this.method2338((byte) 124);
                this.field5487 &= -8;
            }
            ++field5387;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lfda;Z)Lf;", line = 1050)
    public final class257 method772(class628 arg0, boolean arg1) {
        ++field5350;
        int[] var3 = new int[arg0.field8940 * arg0.field8936];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field8934 == null) {
            for (int var6 = 0; arg0.field8940 > var6; ++var6) {
                for (int var7 = 0; ~arg0.field8936 < ~var7; ++var7) {
                    int var8 = arg0.field8938[255 & arg0.field8939[var4++]];
                    var3[var5++] = var8 == 0 ? 0 : class460.method2676(var8, -16777216);
                }
            }
        } else {
            for (int var9 = 0; ~var9 > ~arg0.field8940; ++var9) {
                for (int var11 = 0; ~arg0.field8936 < ~var11; ++var11) {
                    var3[var5++] = class460.method2676(arg0.field8934[var4] << 24, arg0.field8938[class248.method1593(255, arg0.field8939[var4])]);
                    ++var4;
                }
            }
        }
        class257 var10 = this.method806(var3, 0, arg0.field8936, arg0.field8936, arg0.field8940);
        var10.method7(arg0.field8933, arg0.field8935, arg0.field8932, arg0.field8937);
        return var10;
    }

    @OriginalMember(owner = "client!kfa", name = "ra", descriptor = "(F)V", line = 1111)
    public final void method794(float arg0) {
        ++field5388;
        if (this.field5499 != arg0) {
            this.field5499 = arg0;
            this.method2313(-1);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "(I)Le;", line = 1128)
    public final class698 method783(int arg0) {
        ++field5313;
        class418 var2 = new class418(arg0);
        this.field5454.method3904(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!kfa", name = "ZA", descriptor = "(Z)V", line = 1139)
    public final void method770(boolean arg0) {
        ++field5427;
        this.field5538 = arg0;
        this.method2309(-7833);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)V", line = 1154)
    public final void method97(boolean arg0) {
        ++field5406;
    }

    @OriginalMember(owner = "client!kfa", name = "J", descriptor = "(IIIIII)V", line = 1164)
    public final void method824(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5292;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method2319(true);
        float var10 = (float) arg3 + var8;
        this.method2325(arg5, (byte) 45);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5598) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5598) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BLgj;)V", line = 1198)
    public final void method2273(byte arg0, class650 arg1) {
        if (arg0 >= -62) {
            this.field5478 = null;
        }
        ++field5347;
        if (~this.field5467 <= -1 && this.field5465[this.field5467] == arg1) {
            this.field5465[this.field5467--] = null;
            arg1.method678(-101);
            if (~this.field5467 > -1) {
                this.field5462 = null;
            } else {
                this.field5462 = this.field5465[this.field5467];
                this.field5462.method683(-16793);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III)V", line = 1222)
    public final synchronized void method2274(int arg0, int arg1, int arg2) {
        ++field5346;
        class83 var4 = new class83(arg2);
        var4.field6265 = (long) arg1;
        this.field5478.method3904(var4, arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!kfa", name = "C", descriptor = "()V", line = 1233)
    public final void method67() {
        ++field5416;
        if (this.field5449 != null && this.field5449.method1947(false)) {
            this.field5446.method2855((byte) -28, this.field5449);
            this.field5447.method3235((byte) 114);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZI)V", line = 1253)
    public final void method2275(boolean arg0, int arg1) {
        if (!this.field5489 != !arg0) {
            this.field5489 = arg0;
            this.method2309(-7833);
            this.field5487 &= -32;
        }
        ++field5408;
        if (arg1 < 72) {
            this.field5541 = null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "o", descriptor = "()Z", line = 1273)
    public final boolean method786() {
        ++field5264;
        return false;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILho;)V", line = 1281)
    public final void method2276(int arg0, class286 arg1) {
        OpenGL.glPushMatrix();
        ++field5393;
        OpenGL.glMultMatrixf(arg1.method1765(arg0 + 8797), arg0);
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(Z)V", line = 1293)
    private final void method2277(boolean arg0) {
        this.field5505 = (float) (-this.field5531 + this.field5502);
        if (arg0) {
            this.field5534 = 0.08197157F;
        }
        this.field5592 = (float) (this.field5524 - this.field5562);
        this.field5572 = (float) (-this.field5562 + this.field5500);
        ++field5297;
        this.field5533 = (float) (-this.field5531 + this.field5603);
    }

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "(IIIII)V", line = 1309)
    public final void method747(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~arg2 > -1) {
            arg2 = -arg2;
        }
        ++field5271;
        if (arg0 + arg2 >= this.field5603 && ~this.field5502 <= ~(-arg2 + arg0) && this.field5524 <= arg1 - -arg2 && this.field5500 >= -arg2 + arg1) {
            this.method2319(true);
            this.method2325(arg4, (byte) 45);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field5546) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field5522 >= (float) var8) {
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
                int var10 = class270.method1702(var9, (byte) 74);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = 16384 - var10; var11 > 0; var11 -= var10) {
                    OpenGL.glVertex2f(class369.field5101[var11] * (float) arg2 + var6, class369.field5108[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(II)V", line = 1385)
    public final synchronized void method2278(int arg0, int arg1) {
        ++field5407;
        class435 var3 = new class435();
        var3.field6265 = (long) arg1;
        this.field5482.method3904(var3, arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!kfa", name = "oa", descriptor = "([I)V", line = 1396)
    public final void method764(int[] arg0) {
        ++field5279;
        arg0[1] = this.field5524;
        arg0[3] = this.field5500;
        arg0[2] = this.field5502;
        arg0[0] = this.field5603;
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(IIZ)V", line = 1407)
    public final void method2279(int arg0, int arg1, boolean arg2) {
        this.field5589 = arg1;
        ++field5422;
        this.field5563 = arg0;
        this.method2300(-122);
        this.method2332(arg2);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZB)V", line = 1418)
    public final void method2280(int arg0, boolean arg1, byte arg2) {
        this.method2301(-64, arg1, true, arg0);
        if (arg2 >= -88) {
            this.field5575 = null;
        }
        ++field5252;
    }

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "(B)V", line = 1430)
    public static final void method2281(byte arg0) {
        ++field5413;
        if (class160.field2597 == 6) {
            if (arg0 >= -80) {
                field5353 = 19L;
            }
            class160.field2597 = 7;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lpa;)V", line = 1450)
    public final void method744(class587 arg0) {
        ++field5400;
        this.field5556 = (class298) arg0;
    }

    @OriginalMember(owner = "client!kfa", name = "B", descriptor = "()Z", line = 1459)
    public final boolean method95() {
        ++field5260;
        return this.field5449 != null && this.field5449.method1947(false);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZZ)V", line = 1467)
    public final void method2282(boolean arg0, boolean arg1) {
        if (!arg0 == this.field5486) {
            if (arg0) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field5486 = arg0;
            this.field5487 &= -32;
        }
        if (arg1) {
            ++field5331;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lpa;Lpa;FLpa;)Lpa;", line = 1488)
    public final class587 method83(class587 arg0, class587 arg1, float arg2, class587 arg3) {
        ++field5394;
        if (arg0 != null && arg1 != null && this.field5542 && this.field5571) {
            class230 var5 = null;
            class298 var6 = (class298) arg0;
            class298 var7 = (class298) arg1;
            class656 var8 = var6.method1505((byte) -3);
            class656 var9 = var7.method1505((byte) -124);
            if (var8 != null && var9 != null) {
                int var10 = ~var8.field9267 >= ~var9.field9267 ? var9.field9267 : var8.field9267;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class230) {
                    class230 var11 = (class230) arg3;
                    if (var11.method1504(124) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class230(this, var10);
                }
                if (var5.method1507(var9, arg2, var8, false)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lcr;IIII)Lda;", line = 1534)
    public final class397 method795(class163 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5372;
        return new class56(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B[BIZI)Lnu;", line = 1543)
    public final class411 method2283(byte arg0, byte[] arg1, int arg2, boolean arg3, int arg4) {
        ++field5285;
        if (!this.field5601 || arg3 && !this.field5579) {
            if (arg0 != 73) {
                this.method757();
            }
            return new class623(this, arg2, arg1, arg4);
        } else {
            return new class697(this, arg2, arg1, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "U", descriptor = "()I", line = 1559)
    public final int method746() {
        ++field5320;
        return this.field5602;
    }

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "(B)V", line = 1568)
    public final void method2284(byte arg0) {
        ++field5312;
        if (~this.field5532 != -1) {
            this.field5487 &= -32;
            this.field5532 = 0;
        }
        if (arg0 != -64) {
            this.field5529 = false;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "la", descriptor = "(IIII)V", line = 1585)
    public final void method819(int arg0, int arg1, int arg2, int arg3) {
        this.field5562 = arg1;
        this.field5552 = arg2;
        ++field5284;
        this.field5531 = arg0;
        this.field5604 = arg3;
        this.method2260((byte) -36);
        this.method2277(false);
        if (~this.field5532 == -4) {
            this.method2291((byte) 114);
        } else if (~this.field5532 == -3) {
            this.method2314(-115);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "(B)V", line = 1608)
    public final void method2285(byte arg0) {
        ++field5452;
        OpenGL.glPushMatrix();
        if (arg0 >= -113) {
            this.field5570 = -2;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "t", descriptor = "()Z", line = 1619)
    public final boolean method801() {
        ++field5389;
        return this.field5598 && (!this.method95() || this.field5535);
    }

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "(IIII)V", line = 1627)
    public final void method2286(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 1) {
            this.method2287((byte) 6);
        }
        ++field5364;
        OpenGL.glDrawArrays(arg1, arg3, arg2);
    }

    @OriginalMember(owner = "client!kfa", name = "MA", descriptor = "(III[I)V", line = 1640)
    public final void method787(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5333;
        float var5 = (float) arg2 * this.field5491.field4003 + (float) arg0 * this.field5491.field3996 + (float) arg1 * this.field5491.field4000 + this.field5491.field4029;
        if (!(var5 < (float) this.field5540) && !(var5 > (float) this.field5602)) {
            int var6 = (int) (((float) arg2 * this.field5491.field4015 + (float) arg0 * this.field5491.field4030 + (float) arg1 * this.field5491.field4031 + this.field5491.field4004) * (float) this.field5552 / var5);
            int var7 = (int) (((float) arg2 * this.field5491.field4011 + (float) arg0 * this.field5491.field4008 + (float) arg1 * this.field5491.field4024 + this.field5491.field4005) * (float) this.field5604 / var5);
            arg3[0] = (int) ((float) var6 - this.field5533);
            arg3[2] = (int) var5;
            arg3[1] = (int) ((float) var7 - this.field5592);
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II[I[I)Lua;", line = 1662)
    public final class591 method748(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field5398;
        return class580.method3360(this, arg2, arg1, 1, arg3, arg0);
    }

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "(B)V", line = 1670)
    private final void method2287(byte arg0) {
        this.field5495 = new class337[this.field5545];
        ++field5272;
        this.field5523 = new class586(this, 3553, 6408, 1, 1);
        new class586(this, 3553, 6408, 1, 1);
        new class586(this, 3553, 6408, 1, 1);
        this.field5498 = new class56(this);
        this.field5575 = new class56(this);
        this.field5521 = new class56(this);
        this.field5567 = new class56(this);
        this.field5530 = new class56(this);
        this.field5503 = new class56(this);
        this.field5568 = new class56(this);
        this.field5597 = new class56(this);
        this.field5518 = new class56(this);
        if (arg0 != -65) {
            this.method752(-51);
        }
        this.field5573 = new class56(this);
        if (this.field5571) {
            this.field5525 = new class92(this);
            new class92(this);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BI)I", line = 1707)
    public final int method2288(byte arg0, int arg1) {
        if (arg0 != 103) {
            this.field5557 = false;
        }
        ++field5445;
        if (~arg1 == -2) {
            return 7681;
        } else if (~arg1 != -1) {
            if (~arg1 == -3) {
                return 34165;
            } else if (~arg1 != -4) {
                if (arg1 == 4) {
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
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V", line = 1739)
    public final void method751(int arg0) {
        ++field5432;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!kfa", name = "u", descriptor = "()I", line = 1752)
    public final int method802() {
        ++field5281;
        return 4;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I[Lam;)V", line = 1760)
    public final void method823(int arg0, class289[] arg1) {
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field5539[var3] = arg1[var3];
        }
        ++field5314;
        this.field5517 = arg0;
        if (~this.field5532 != -2) {
            this.method2268((byte) -16);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(FBF)V", line = 1782)
    public final void method2289(float arg0, byte arg1, float arg2) {
        this.field5501 = arg2;
        if (arg1 <= 88) {
            this.field5488 = true;
        }
        this.field5600 = arg0;
        ++field5397;
        this.method2315((byte) 114);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(FFIF)V", line = 1795)
    private final void method2290(float arg0, float arg1, int arg2, float arg3) {
        ++field5356;
        OpenGL.glMatrixMode(5890);
        if (this.field5557) {
            OpenGL.glLoadIdentity();
        }
        int var5 = -53 / ((-35 - arg2) / 38);
        OpenGL.glTranslatef(arg3, arg1, arg0);
        OpenGL.glMatrixMode(5888);
        this.field5557 = true;
    }

    @OriginalMember(owner = "client!kfa", name = "i", descriptor = "(B)V", line = 1813)
    private final void method2291(byte arg0) {
        ++field5255;
        if (arg0 > 100) {
            float var2 = (float) (-this.field5531) * this.field5515 / (float) this.field5552;
            float var3 = (float) (-this.field5562) * this.field5515 / (float) this.field5604;
            float var4 = (float) (this.field5253 - this.field5531) * this.field5515 / (float) this.field5552;
            float var5 = (float) (-this.field5562 + this.field5289) * this.field5515 / (float) this.field5604;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (var2 != var4 && var3 != var5) {
                OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field5540, (double) this.field5602);
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 1838)
    public final class682 method768(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5369;
        return new class636(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!kfa", name = "j", descriptor = "(B)V", line = 1846)
    private final void method2292(byte arg0) {
        ++field5409;
        if (this.field5341 != null) {
            Dimension var2 = this.field5341.getSize();
            this.field5359 = var2.width;
            this.field5273 = var2.height;
        } else {
            this.field5359 = this.field5273 = 0;
        }
        if (this.field5462 == null) {
            this.field5253 = this.field5359;
            this.field5289 = this.field5273;
            this.method2300(-100);
        }
        this.method2284((byte) -64);
        if (arg0 <= -116) {
            this.method805();
        }
    }

    @OriginalMember(owner = "client!kfa", name = "l", descriptor = "(I)V", line = 1877)
    private final void method2293(int arg0) {
        this.method2321(-1111, -2);
        ++field5377;
        for (int var2 = this.field5545 + -1; ~var2 <= -1; --var2) {
            this.method2308(var2, -15115);
            this.method2295((byte) 92, (class337) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2328(8448, arg0 + 1413, 8448);
        this.method2262(34168, 2, arg0 ^ -32890, 770);
        this.method2302((byte) 60);
        this.field5485 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field5490 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field5488 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field5484 = true;
        this.method2303(true, arg0 ^ 1510);
        this.method2272(true, (byte) -9);
        this.method2282(true, true);
        if (arg0 == -1530) {
            this.method2275(true, arg0 + 1603);
            this.method2284((byte) -64);
            this.field5323.setSwapInterval(0);
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
            this.field5506 = this.field5520 = -1;
            this.method805();
        }
    }

    @OriginalMember(owner = "client!kfa", name = "A", descriptor = "()V", line = 1953)
    public final void method102() {
        ++field5299;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIZLjaclib/memory/Buffer;I)Lnu;", line = 1961)
    public final class411 method2294(int arg0, int arg1, boolean arg2, Buffer arg3, int arg4) {
        ++field5405;
        if (arg4 != 1) {
            this.field5472 = null;
        }
        return (class411) (!this.field5601 || arg2 && !this.field5579 ? new class623(this, arg0, arg3) : new class697(this, arg0, arg3, arg1, arg2));
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lqg;I)V", line = 1977)
    public final void method799(class272 arg0, int arg1) {
        this.field5440.method2344(arg1, -662352532, this, arg0);
        ++field5307;
    }

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "()Z", line = 1986)
    public final boolean method767() {
        ++field5391;
        return this.field5443.method2882(3, (byte) 70);
    }

    @OriginalMember(owner = "client!kfa", name = "V", descriptor = "(IIII)V", line = 1994)
    public final void method818(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5500 > arg3) {
            this.field5500 = arg3;
        }
        if (~arg1 < ~this.field5524) {
            this.field5524 = arg1;
        }
        ++field5344;
        if (arg2 < this.field5502) {
            this.field5502 = arg2;
        }
        if (~this.field5603 > ~arg0) {
            this.field5603 = arg0;
        }
        OpenGL.glEnable(3089);
        this.method2277(false);
        this.method2332(true);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIIII)V", line = 2019)
    public final void method782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2319(true);
        ++field5399;
        this.method2325(arg5, (byte) 45);
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

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BLjo;)V", line = 2053)
    public final void method2295(byte arg0, class337 arg1) {
        ++field5330;
        class337 var3 = this.field5495[this.field5590];
        int var4 = 112 % ((-46 - arg0) / 47);
        if (arg1 != var3) {
            if (arg1 != null) {
                if (var3 == null) {
                    OpenGL.glEnable(arg1.field4684);
                } else if (~arg1.field4684 != ~var3.field4684) {
                    OpenGL.glDisable(var3.field4684);
                    OpenGL.glEnable(arg1.field4684);
                }
                OpenGL.glBindTexture(arg1.field4684, arg1.method2007(-1));
            } else {
                OpenGL.glDisable(var3.field4684);
            }
            this.field5495[this.field5590] = arg1;
        }
        this.field5487 &= -2;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIZB[B)Lmn;", line = 2090)
    public final class212 method2296(int arg0, int arg1, boolean arg2, byte arg3, byte[] arg4) {
        if (arg3 <= 76) {
            return null;
        } else {
            ++field5276;
            return (class212) (!this.field5601 || arg2 && !this.field5579 ? new class372(this, arg1, arg4, arg0) : new class407(this, arg1, arg4, arg0, arg2));
        }
    }

    @OriginalMember(owner = "client!kfa", name = "va", descriptor = "(I)V", line = 2109)
    public final void method781(int arg0) {
        this.field5457 = 0;
        ++field5324;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field5457;
        }
        this.field5459 = 1 << this.field5457;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIIIF)Lam;", line = 2124)
    public final class289 method784(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field5298;
        return new class590(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "()Z", line = 2133)
    public final boolean method757() {
        ++field5357;
        return false;
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(BI)V", line = 2142)
    public final void method2297(byte arg0, int arg1) {
        class10.field132[0] = (float) class248.method1593(arg1, 16711680) / 1.671168E7F;
        class10.field132[1] = (float) class248.method1593(arg1, 65280) / 65280.0F;
        class10.field132[3] = (float) (arg1 >>> 24) / 255.0F;
        ++field5390;
        class10.field132[2] = (float) class248.method1593(255, arg1) / 255.0F;
        int var3 = 115 / ((arg0 - -83) / 35);
        OpenGL.glTexEnvfv(8960, 8705, class10.field132, 0);
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(IB)I", line = 2156)
    public final int method2298(int arg0, byte arg1) {
        ++field5411;
        if (arg1 >= -43) {
            this.method778();
        }
        if (~arg0 != -5122 && ~arg0 != -5121) {
            if (~arg0 != -5124 && ~arg0 != -5123) {
                if (arg0 != 5125 && arg0 != 5124 && ~arg0 != -5127) {
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

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "()Lq;", line = 2177)
    public final class152 method740() {
        ++field5355;
        return this.field5491;
    }

    @OriginalMember(owner = "client!kfa", name = "m", descriptor = "(I)I", line = 2185)
    private final int method2299(int arg0) {
        ++field5351;
        this.field5553 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field5587 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field5553.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field5553.indexOf("brian paul") != -1 || this.field5553.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class6.method26(var3.replace('.', ' '), (byte) 94, ' ');
        if (var4.length >= 2) {
            try {
                int var5 = class252.method1611(var4[0], (byte) 79);
                int var6 = class252.method1611(var4[1], (byte) 115);
                this.field5497 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (~this.field5497 > -13) {
            var2 |= 2;
        }
        if (!this.field5323.method223("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field5323.method223("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field5545 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field5554 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field5513 = var7[0];
        if (~this.field5545 > -3 || ~this.field5554 > -3 || this.field5513 < 2) {
            var2 |= 16;
        }
        this.field5558 = Stream.method2042();
        this.field5548 = this.field5323.arePbuffersAvailable();
        this.field5601 = this.field5323.method223("GL_ARB_vertex_buffer_object");
        int var8 = -84 / ((arg0 - -1) / 57);
        this.field5598 = this.field5323.method223("GL_ARB_multisample");
        this.field5508 = this.field5323.method223("GL_ARB_vertex_program");
        this.field5323.method223("GL_ARB_fragment_program");
        this.field5529 = this.field5323.method223("GL_ARB_vertex_shader");
        this.field5599 = this.field5323.method223("GL_ARB_fragment_shader");
        this.field5584 = this.field5323.method223("GL_EXT_texture3D");
        this.field5528 = this.field5323.method223("GL_ARB_texture_rectangle");
        this.field5542 = this.field5323.method223("GL_ARB_texture_cube_map");
        this.field5527 = this.field5323.method223("GL_ARB_texture_float");
        this.field5507 = false;
        this.field5571 = this.field5323.method223("GL_EXT_framebuffer_object");
        this.field5593 = this.field5323.method223("GL_EXT_framebuffer_blit");
        this.field5595 = this.field5323.method223("GL_EXT_framebuffer_multisample");
        this.field5535 = this.field5593 & this.field5595;
        OpenGL.glGetFloatv(2834, class10.field132, 0);
        this.field5546 = class10.field132[0];
        this.field5522 = class10.field132[1];
        return ~var2 != -1 ? var2 : 0;
    }

    @OriginalMember(owner = "client!kfa", name = "n", descriptor = "(I)V", line = 2268)
    private final void method2300(int arg0) {
        OpenGL.glViewport(this.field5589, this.field5563, this.field5253, this.field5289);
        ++field5342;
        if (arg0 >= -18) {
            this.method2267((byte) 21);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIII)V", line = 2281)
    public final void method108(int arg0, int arg1, int arg2, int arg3) {
        ++field5442;
        this.field5446.method2847(arg0, arg2, arg1, (byte) 34, arg3);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZZI)V", line = 2291)
    public final void method2301(int arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field5496 != arg3 || this.field5516 == !this.field5582) {
            class586 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field5516 ? 0 : 3;
            if (~arg3 > -1) {
                this.method2302((byte) -106);
            } else {
                var5 = this.field5447.method3236(arg3, 126);
                class377 var10 = super.field1459.method2359(-126, arg3);
                if (~var10.field5220 == -1 && var10.field5224 == 0) {
                    this.method2302((byte) -128);
                } else {
                    int var11 = var10.field5222 ? 64 : 128;
                    int var12 = var11 * 50;
                    this.method2290(0.0F, (float) (this.field5456 % var12 * var10.field5224) / (float) var12, -96, (float) (this.field5456 % var12 * var10.field5220) / (float) var12);
                }
                if (!this.field5516) {
                    var9 = var10.field5217;
                    var7 = var10.field5229;
                    var8 = var10.field5228;
                }
                var6 = var10.field5236;
            }
            this.field5443.method2883(false, arg2, var9, var8, var7, arg1);
            if (!this.field5443.method2884(true, var6, var5)) {
                this.method2295((byte) 61, var5);
                this.method2270(var6, (byte) 110);
            }
            this.field5496 = arg3;
            this.field5582 = this.field5516;
        }
        ++field5268;
        this.field5487 &= -8;
        if (arg0 > -25) {
            this.method2299(43);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "k", descriptor = "(B)V", line = 2356)
    private final void method2302(byte arg0) {
        if (this.field5557) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field5557 = false;
        }
        int var2 = -41 % ((arg0 - -23) / 53);
        ++field5306;
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(ZI)V", line = 2376)
    public final void method2303(boolean arg0, int arg1) {
        if (arg1 != -32) {
            this.method740();
        }
        if (this.field5591 != arg0) {
            this.field5591 = arg0;
            this.method2334((byte) -90);
            this.field5487 &= -32;
        }
        ++field5261;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BLho;)V", line = 2401)
    public final void method2304(byte arg0, class286 arg1) {
        ++field5363;
        OpenGL.glLoadMatrixf(arg1.method1765(8797), 0);
        if (arg0 >= -35) {
            this.field5510 = -92;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "l", descriptor = "(B)V", line = 2412)
    private final void method2305(byte arg0) {
        this.field5526[10] = this.field5560;
        ++field5315;
        this.field5526[14] = this.field5565;
        this.field5549 = (float) this.field5602;
        this.field5534 = (this.field5526[14] + (float) (-this.field5602)) / this.field5526[10];
        if (arg0 >= -106) {
            this.method2269(-21);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "()Z", line = 2432)
    public final boolean method739() {
        ++field5431;
        return this.field5449 != null && (~this.field5444 >= -2 || this.field5535);
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(III)V", line = 2441)
    public final synchronized void method2306(int arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            ++field5433;
            class83 var4 = new class83(arg0);
            var4.field6265 = (long) arg2;
            this.field5479.method3904(var4, 0);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Le;)V", line = 2459)
    public final void method822(class698 arg0) {
        ++field5256;
        this.field5455 = ((class418) arg0).field5947;
        if (this.field5574 == null) {
            class351 var2 = new class351(80);
            if (!this.field5558) {
                var2.method2129(false, -1.0F);
                var2.method2129(false, -1.0F);
                var2.method2129(false, 0.0F);
                var2.method2129(false, 0.0F);
                var2.method2129(false, 1.0F);
                var2.method2129(false, 1.0F);
                var2.method2129(false, -1.0F);
                var2.method2129(false, 0.0F);
                var2.method2129(false, 1.0F);
                var2.method2129(false, 1.0F);
                var2.method2129(false, 1.0F);
                var2.method2129(false, 1.0F);
                var2.method2129(false, 0.0F);
                var2.method2129(false, 1.0F);
                var2.method2129(false, 0.0F);
                var2.method2129(false, -1.0F);
                var2.method2129(false, 1.0F);
                var2.method2129(false, 0.0F);
                var2.method2129(false, 0.0F);
                var2.method2129(false, 0.0F);
            } else {
                var2.method2130(-1.0F, false);
                var2.method2130(-1.0F, false);
                var2.method2130(0.0F, false);
                var2.method2130(0.0F, false);
                var2.method2130(1.0F, false);
                var2.method2130(1.0F, false);
                var2.method2130(-1.0F, false);
                var2.method2130(0.0F, false);
                var2.method2130(1.0F, false);
                var2.method2130(1.0F, false);
                var2.method2130(1.0F, false);
                var2.method2130(1.0F, false);
                var2.method2130(0.0F, false);
                var2.method2130(1.0F, false);
                var2.method2130(0.0F, false);
                var2.method2130(-1.0F, false);
                var2.method2130(1.0F, false);
                var2.method2130(0.0F, false);
                var2.method2130(0.0F, false);
                var2.method2130(0.0F, false);
            }
            this.field5574 = this.method2283((byte) 73, var2.field6719, 20, false, var2.field6710);
            this.field5544 = new class70(this.field5574, 5126, 3, 0);
            this.field5536 = new class70(this.field5574, 5126, 2, 12);
            this.field5440.method2351((byte) 54, this);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "o", descriptor = "(I)V", line = 2526)
    public final void method2307(int arg0) {
        OpenGL.glPopMatrix();
        ++field5418;
        if (arg0 >= -27) {
            this.method760(3, -43, -14, 124);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "(II)V", line = 2537)
    public final void method2308(int arg0, int arg1) {
        if (arg1 != -15115) {
            this.method2288((byte) 11, 95);
        }
        ++field5380;
        if (this.field5590 != arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field5590 = arg0;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II)I", line = 2554)
    public final int method738(int arg0, int arg1) {
        ++field5352;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!kfa", name = "g", descriptor = "(I)V", line = 2562)
    public final void method807(int arg0) {
        this.method2339(81);
        ++field5430;
    }

    @OriginalMember(owner = "client!kfa", name = "pa", descriptor = "(III)V", line = 2574)
    public final void method763(int arg0, int arg1, int arg2) {
        ++field5365;
        if (this.field5520 != arg0 || ~this.field5510 != ~arg1 || this.field5559 != arg2) {
            this.field5510 = arg1;
            this.field5559 = arg2;
            this.field5520 = arg0;
            this.method2315((byte) 32);
            this.method2334((byte) -90);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "()I", line = 2596)
    public final int method775() {
        ++field5262;
        return this.field5477 + this.field5473 - -this.field5475;
    }

    @OriginalMember(owner = "client!kfa", name = "p", descriptor = "(I)V", line = 2605)
    private final void method2309(int arg0) {
        if (arg0 != -7833) {
            this.method786();
        }
        OpenGL.glDepthMask(this.field5489 && this.field5538);
        ++field5293;
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(IIIIII)Lpa;", line = 2621)
    public final class587 method797(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5259;
        return !this.field5542 ? null : new class283(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 2629)
    public final void method808(Canvas arg0) {
        ++field5266;
        long var2 = 0L;
        if (arg0 != null && this.field5386 != arg0) {
            if (this.field5317.containsKey(arg0)) {
                Long var4 = (Long) this.field5317.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field5383;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field5323.surfaceResized(var2);
            if (this.field5341 == arg0) {
                this.method2292((byte) -128);
            }
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lf;Z)V", line = 2662)
    public final void method68(class257 arg0, boolean arg1) {
        this.field5464 = (class260) arg0;
        ++field5382;
        if (!this.field5571) {
            if (!this.field5548) {
                throw new RuntimeException("");
            }
            class548 var3 = (class548) this.field5472.method2818(-22803, (long) (this.field5464.method12() << 16 | this.field5464.method17()));
            if (var3 == null) {
                var3 = new class548(this, this.field5464.method12(), this.field5464.method17());
                class548 var5;
                for (this.field5474 += var3.field8043 * 4; ~this.field5474 < -2097153; this.field5474 -= var5.field8043) {
                    class143 var4 = this.field5470.method2110(123);
                    if (var4 == null) {
                        break;
                    }
                    var5 = (class548) var4;
                    var5.method1113(32730);
                    var5.method2549((byte) 105);
                    this.field5323.releasePbuffer(var5.method3219((byte) 0));
                }
                this.field5472.method2816(var3, (long) (this.field5464.method12() << 16 | this.field5464.method17()), false);
            }
            this.field5470.method2108(var3, (byte) 63);
            this.field5323.setPbuffer(var3.method3219((byte) 0));
        } else {
            if (this.field5461 == null) {
                this.field5461 = new class92(this);
            }
            if (this.field5461 == this.field5462) {
                throw new RuntimeException();
            }
            this.method2263(true, this.field5461);
            if (arg1) {
                class325 var6 = (class325) this.field5472.method2818(-22803, (long) (this.field5464.method12() << 16 | this.field5464.method17()));
                if (var6 == null) {
                    var6 = new class325(this, 6402, this.field5464.method12(), this.field5464.method17());
                    class325 var8;
                    for (this.field5474 += var6.field4523; this.field5474 > 2097152; this.field5474 -= var8.field4523) {
                        class143 var7 = this.field5470.method2110(-12);
                        if (var7 == null) {
                            break;
                        }
                        var8 = (class325) var7;
                        var8.method1113(32730);
                        var8.method2549((byte) 47);
                        var8.method1940(-92);
                    }
                    this.field5472.method2816(var6, (long) (this.field5464.method12() << 16 | this.field5464.method17()), false);
                }
                this.field5470.method2108(var6, (byte) 63);
                this.field5461.method676((byte) -113, var6, 8);
            }
            this.field5461.method692((byte) -121, this.field5464.field3747, 0);
        }
        this.field5253 = arg0.method12();
        this.field5289 = arg0.method17();
        this.method2284((byte) -64);
        this.method2300(-46);
        this.method805();
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lq;)V", line = 2760)
    public final void method755(class152 arg0) {
        ++field5448;
        this.field5491.method163(arg0);
        this.field5493.method163(this.field5491);
        this.field5493.method1763(54);
        this.field5494.method1761(this.field5493, 6);
        if (this.field5532 != 1) {
            this.method2267((byte) -41);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "q", descriptor = "(I)V", line = 2777)
    private final void method2310(int arg0) {
        if (arg0 != 2) {
            this.method775();
        }
        ++field5450;
        if (~this.field5532 != -3) {
            this.field5532 = 2;
            this.method2314(-71);
            this.method2267((byte) -41);
            this.field5487 &= -8;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "(Z)V", line = 2795)
    public final void method2311(boolean arg0) {
        if (~this.field5487 != -9) {
            this.method2310(2);
            this.method2303(true, -32);
            this.method2282(true, true);
            this.method2275(true, 75);
            this.method2325(1, (byte) 45);
            this.field5487 = 8;
        }
        ++field5316;
        if (!arg0) {
            this.field5497 = 117;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "da", descriptor = "(IIII)V", line = 2815)
    public final void method771(int arg0, int arg1, int arg2, int arg3) {
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (~arg3 < ~this.field5289) {
            arg3 = this.field5289;
        }
        if (~arg1 > -1) {
            arg1 = 0;
        }
        ++field5428;
        if (this.field5253 < arg2) {
            arg2 = this.field5253;
        }
        this.field5603 = arg0;
        this.field5524 = arg1;
        this.field5502 = arg2;
        this.field5500 = arg3;
        OpenGL.glEnable(3089);
        this.method2277(false);
        this.method2332(true);
    }

    @OriginalMember(owner = "client!kfa", name = "r", descriptor = "(I)V", line = 2844)
    public final void method2312(int arg0) {
        OpenGL.glLightfv(16384, 4611, this.field5596, 0);
        ++field5291;
        OpenGL.glLightfv(16385, 4611, this.field5576, 0);
        if (arg0 != -20899) {
            this.method781(-48);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 2861)
    public final void method800(Canvas arg0) {
        ++field5318;
        if (this.field5386 == arg0) {
            throw new RuntimeException();
        } else if (!this.field5317.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field5323.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field5317.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!kfa", name = "s", descriptor = "(I)V", line = 2896)
    private final void method2313(int arg0) {
        class10.field132[0] = this.field5588 * this.field5499;
        class10.field132[1] = this.field5547 * this.field5499;
        class10.field132[2] = this.field5504 * this.field5499;
        ++field5275;
        if (arg0 != -1) {
            this.field5499 = 2.456217F;
        }
        class10.field132[3] = 1.0F;
        OpenGL.glLightModelfv(2899, class10.field132, 0);
    }

    @OriginalMember(owner = "client!kfa", name = "t", descriptor = "(I)V", line = 2915)
    private final void method2314(int arg0) {
        ++field5267;
        if (arg0 > -65) {
            this.method795((class163) null, -19, 63, -62, 6);
        }
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field5526, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!kfa", name = "r", descriptor = "()V", line = 2929)
    public final void method128() {
        ++field5326;
        if (this.field5564 && this.field5253 > 0 && ~this.field5289 < -1) {
            int var1 = this.field5603;
            int var2 = this.field5502;
            int var3 = this.field5524;
            int var4 = this.field5500;
            this.method805();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2284((byte) -64);
            this.method2303(false, -32);
            this.method2272(false, (byte) -9);
            this.method2282(false, true);
            this.method2275(false, 75);
            this.method2295((byte) -114, (class337) null);
            this.method2321(-1111, -2);
            this.method2270(1, (byte) 110);
            this.method2325(0, (byte) 45);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field5253, this.field5289, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method771(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "m", descriptor = "(B)V", line = 2973)
    private final void method2315(byte arg0) {
        ++field5419;
        this.field5514 = (float) (-this.field5559 + this.field5602) + -this.field5600;
        if (arg0 <= 1) {
            this.field5461 = null;
        }
        this.field5551 = this.field5514 - (float) this.field5510 * this.field5501;
        if ((float) this.field5540 > this.field5551) {
            this.field5551 = (float) this.field5540;
        }
        OpenGL.glFogf(2915, this.field5551);
        OpenGL.glFogf(2916, this.field5514);
        class10.field132[1] = (float) class248.method1593(65280, this.field5520) / 65280.0F;
        class10.field132[2] = (float) class248.method1593(this.field5520, 255) / 255.0F;
        class10.field132[0] = (float) class248.method1593(16711680, this.field5520) / 1.671168E7F;
        OpenGL.glFogfv(2918, class10.field132, 0);
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(ZB)V", line = 2995)
    public final void method2316(boolean arg0, byte arg1) {
        if (!this.field5577 == arg0) {
            this.field5577 = arg0;
            this.method2338((byte) 92);
        }
        if (arg1 >= -46) {
            this.method788(-2, -80, 118, -91, 41, -112);
        }
        ++field5343;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lll;[Lfda;Z)Lla;", line = 3017)
    public final class395 method804(class490 arg0, class628[] arg1, boolean arg2) {
        ++field5338;
        return new class368(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(III)V", line = 3032)
    public final synchronized void method2317(int arg0, int arg1, int arg2) {
        ++field5420;
        class83 var4 = new class83(arg1);
        var4.field6265 = (long) arg2;
        this.field5481.method3904(var4, arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!kfa", name = "ja", descriptor = "(I)V", line = 3043)
    public final void method118(int arg0) {
        this.method2325(0, (byte) 45);
        ++field5403;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!kfa", name = "u", descriptor = "(I)V", line = 3056)
    private final void method2318(int arg0) {
        if (~this.field5532 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field5253 > 0 && this.field5289 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field5253, (double) this.field5289, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field5532 = 1;
            this.field5487 &= -25;
        }
        ++field5290;
        if (arg0 < 76) {
            this.field5485 = -112;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "(Z)V", line = 3086)
    private final void method2319(boolean arg0) {
        ++field5423;
        if (~this.field5487 != -2) {
            this.method2318(102);
            this.method2303(false, -32);
            this.method2272(false, (byte) -9);
            this.method2282(false, arg0);
            this.method2275(false, 100);
            this.method2295((byte) 78, (class337) null);
            this.method2321(-1111, -2);
            this.method2270(1, (byte) 110);
            this.field5487 = 1;
        }
        if (!arg0) {
            this.field5500 = 59;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "GA", descriptor = "(II)V", line = 3110)
    public final void method765(int arg0, int arg1) {
        if (this.field5540 != arg0 || this.field5602 != arg1) {
            this.field5602 = arg1;
            this.field5540 = arg0;
            this.method2260((byte) -36);
            this.method2315((byte) 115);
            if (~this.field5532 != -4) {
                if (~this.field5532 == -3) {
                    this.method2314(-82);
                }
            } else {
                this.method2291((byte) 122);
            }
        }
        ++field5410;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZIILmn;)V", line = 3134)
    public final void method2320(int arg0, boolean arg1, int arg2, int arg3, class212 arg4) {
        ++field5269;
        int var6 = arg4.method1450((byte) 47);
        int var7 = arg2 * this.method2298(var6, (byte) -49);
        if (!arg1) {
            this.method2324(34963, arg4);
            OpenGL.glDrawElements(arg0, arg3, var6, arg4.method1448(25844) - -((long) var7));
        }
    }

    @OriginalMember(owner = "client!kfa", name = "L", descriptor = "()V", line = 3151)
    public final void method821() {
        ++field5340;
        this.field5516 = false;
    }

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "(II)V", line = 3166)
    public final void method2321(int arg0, int arg1) {
        this.method2280(arg1, true, (byte) -95);
        ++field5378;
        if (arg0 != -1111) {
            this.method776();
        }
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;I)V", line = 3179)
    public class382(Canvas arg0, class615 arg1, int arg2) {
        super(arg1);
        this.field5341 = this.field5386 = arg0;
        this.field5444 = arg2;
        if (!class331.method1968("jaclib", (byte) 46)) {
            throw new RuntimeException("");
        } else if (!class331.method1968("jaggl", (byte) 77)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field5323 = new OpenGL();
                this.field5288 = this.field5383 = this.field5323.init(arg0, 8, 8, 8, 24, 0, this.field5444);
                if (this.field5383 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method2339(117);
                    int var4 = this.method2299(-90);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field5509 = this.field5558 ? 33639 : 5121;
                        if (this.field5587.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class6.method26(this.field5587.replace('/', ' '), (byte) 59, ' ');
                            for (int var9 = 0; var8.length > var9; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (var10.charAt(0) == 'x' && ~var10.length() <= -4 && class428.method2518((byte) -30, var10.substring(1, 3))) {
                                            var7 = true;
                                            var10 = var10.substring(1);
                                        }
                                        if (var10.equals("hd")) {
                                            var6 = true;
                                        } else {
                                            if (var10.startsWith("hd")) {
                                                var10 = var10.substring(2);
                                                var6 = true;
                                            }
                                            if (~var10.length() <= -5 && class428.method2518((byte) -30, var10.substring(0, 4))) {
                                                var5 = class252.method1611(var10.substring(0, 4), (byte) 74);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field5527 = false;
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && ~var5 >= -9251) {
                                    this.field5584 = false;
                                }
                                if (~var5 <= -7001 && ~var5 >= -8000) {
                                    this.field5601 = false;
                                }
                            }
                            this.field5528 &= this.field5323.method223("GL_ARB_half_float_pixel");
                            this.field5586 = true;
                            this.field5579 = this.field5601;
                        }
                        if (this.field5553.indexOf("intel") != -1) {
                            this.field5571 = false;
                        }
                        this.field5564 = !this.field5553.equals("s3 graphics");
                        if (this.field5601) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class12.method62(true, false, (byte) -52);
                        this.field5460 = true;
                        this.field5447 = new class552(this, super.field1459);
                        this.method2287((byte) -65);
                        this.field5458 = new class266(this);
                        this.field5446 = new class487(this);
                        if (this.field5446.method2852(true)) {
                            this.field5449 = new class97(this);
                            if (!this.field5449.method733(-15884)) {
                                this.field5449.method735((byte) 78);
                                this.field5449 = null;
                            }
                        }
                        this.field5443 = new class492(this);
                        this.method2293(-1530);
                        this.method2292((byte) -123);
                        this.method128();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method105();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILnu;)V", line = 3335)
    public final void method2322(int arg0, class411 arg1) {
        int var3 = -34 / ((arg0 - -43) / 50);
        if (this.field5543 != arg1) {
            if (this.field5601) {
                OpenGL.glBindBufferARB(34962, arg1.method2454(-95));
            }
            this.field5543 = arg1;
        }
        ++field5335;
    }

    @OriginalMember(owner = "client!kfa", name = "XA", descriptor = "(IIIII)V", line = 3354)
    public final void method741(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5310;
        this.method2319(true);
        this.method2325(arg4, (byte) 45);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kfa", name = "O", descriptor = "(IIIIII)Z", line = 3374)
    public final boolean method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5358;
        float var7 = (float) arg2 * this.field5491.field4003 + (float) arg0 * this.field5491.field3996 + (float) arg1 * this.field5491.field4000 + this.field5491.field4029;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field5491.field4003 + (float) arg3 * this.field5491.field3996 + (float) arg4 * this.field5491.field4000 + this.field5491.field4029;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field5540) || !((float) this.field5540 > var8)) && (!((float) this.field5602 < var7) || !((float) this.field5602 < var8))) {
            int var9 = (int) (((float) arg2 * this.field5491.field4015 + (float) arg0 * this.field5491.field4030 + (float) arg1 * this.field5491.field4031 + this.field5491.field4004) * (float) this.field5552 / var7);
            int var10 = (int) (((float) arg5 * this.field5491.field4015 + (float) arg3 * this.field5491.field4030 + (float) arg4 * this.field5491.field4031 + this.field5491.field4004) * (float) this.field5552 / var8);
            if ((float) var9 < this.field5533 && this.field5533 > (float) var10 || this.field5505 < (float) var9 && this.field5505 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field5491.field4011 + (float) arg0 * this.field5491.field4008 + (float) arg1 * this.field5491.field4024 + this.field5491.field4005) * (float) this.field5604 / var7);
                int var12 = (int) (((float) arg5 * this.field5491.field4011 + (float) arg3 * this.field5491.field4008 + (float) arg4 * this.field5491.field4024 + this.field5491.field4005) * (float) this.field5604 / var8);
                return (!((float) var11 < this.field5592) || !((float) var12 < this.field5592)) && (!((float) var11 > this.field5572) || !((float) var12 > this.field5572));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(BI)I", line = 3412)
    public final int method2323(byte arg0, int arg1) {
        if (arg0 != -87) {
            this.method801();
        }
        ++field5339;
        if (arg1 != 6406 && arg1 != 6409) {
            if (~arg1 != -6411 && ~arg1 != -34847 && ~arg1 != -34845) {
                if (~arg1 == -6408) {
                    return 3;
                } else if (~arg1 != -6409 && ~arg1 != -34848) {
                    if (~arg1 == -34844) {
                        return 6;
                    } else if (arg1 != 34842) {
                        if (arg1 == 6402) {
                            return 3;
                        } else if (arg1 == 6401) {
                            return 1;
                        } else {
                            throw new IllegalArgumentException("");
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

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "()Z", line = 3455)
    public final boolean method742() {
        ++field5395;
        return true;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIIZ)Lf;", line = 3464)
    public final class257 method749(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5376;
        return new class260(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!kfa", name = "k", descriptor = "()Lq;", line = 3476)
    public final class152 method777() {
        ++field5328;
        return this.field5451;
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(Z)V", line = 3486)
    public final void method793(boolean arg0) {
        ++field5421;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ILmn;)V", line = 3495)
    public final void method2324(int arg0, class212 arg1) {
        if (arg0 == 34963) {
            ++field5361;
            if (this.field5541 != arg1) {
                if (this.field5601) {
                    OpenGL.glBindBufferARB(34963, arg1.method1451(false));
                }
                this.field5541 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 3516)
    public final void method93(Rectangle[] arg0, int arg1) throws class300 {
        this.method87();
        ++field5381;
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "(IB)V", line = 3525)
    public final void method2325(int arg0, byte arg1) {
        ++field5309;
        if (this.field5485 != arg0) {
            boolean var3;
            boolean var4;
            byte var5;
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 == -129) {
                        var3 = true;
                        var4 = true;
                        var5 = 3;
                    } else {
                        var4 = true;
                        var5 = 0;
                        var3 = false;
                    }
                } else {
                    var3 = false;
                    var5 = 2;
                    var4 = true;
                }
            } else {
                var3 = true;
                var5 = 1;
                var4 = true;
            }
            if (this.field5484 != var4) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field5484 = var4;
            }
            if (!this.field5488 != !var3) {
                if (!var3) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field5488 = var3;
            }
            if (this.field5490 != var5) {
                if (var5 != 1) {
                    if (var5 == 2) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    } else if (~var5 != -4) {
                        OpenGL.glDisable(3042);
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field5490 = var5;
            }
            this.field5485 = arg0;
            this.field5487 &= -29;
        }
        if (arg1 != 45) {
            this.field5577 = false;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "h", descriptor = "(IIII)[I", line = 3620)
    public final int[] method133(int arg0, int arg1, int arg2, int arg3) {
        ++field5305;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, this.field5289 - (arg1 - -var6), arg2, 1, 32993, this.field5509, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!kfa", name = "v", descriptor = "(I)V", line = 3641)
    private final void method2326(int arg0) {
        class10.field132[2] = this.field5580 * this.field5504;
        class10.field132[1] = this.field5580 * this.field5547;
        ++field5280;
        class10.field132[3] = 1.0F;
        class10.field132[0] = this.field5588 * this.field5580;
        OpenGL.glLightfv(16384, 4609, class10.field132, 0);
        class10.field132[arg0] = -this.field5566 * this.field5504;
        class10.field132[1] = -this.field5566 * this.field5547;
        class10.field132[0] = -this.field5566 * this.field5588;
        class10.field132[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class10.field132, 0);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(FFF)V", line = 3658)
    public final void method80(float arg0, float arg1, float arg2) {
        class577.field8451 = arg1;
        ++field5385;
        class289.field4059 = arg2;
        class507.field7530 = arg0;
    }

    @OriginalMember(owner = "client!kfa", name = "w", descriptor = "(I)V", line = 3670)
    private final void method2327(int arg0) {
        this.field5323.method225();
        if (arg0 != 0) {
            this.field5564 = false;
        }
        ++field5439;
    }

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "()V", line = 3682)
    public final void method137() {
        this.field5446.method2853((byte) -96);
        ++field5258;
    }

    @OriginalMember(owner = "client!kfa", name = "s", descriptor = "()Z", line = 3692)
    public final boolean method798() {
        ++field5417;
        return true;
    }

    @OriginalMember(owner = "client!kfa", name = "p", descriptor = "()V", line = 3700)
    public final void method105() {
        ++field5303;
        for (class435 var1 = this.field5454.method3905(-108); var1 != null; var1 = this.field5454.method3899(0)) {
            ((class418) var1).method2479(-12483);
        }
        if (this.field5446 != null) {
            this.field5446.method2850(1);
        }
        if (this.field5323 != null) {
            this.method2327(0);
            Enumeration var2 = this.field5317.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field5317.get(var3);
                this.field5323.releaseSurface(var3, var4);
            }
            this.field5323.release();
            this.field5323 = null;
        }
        if (this.field5460) {
            class487.method2849(34037, false, true);
            this.field5460 = false;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "(III)V", line = 3754)
    public final void method2328(int arg0, int arg1, int arg2) {
        ++field5429;
        int var4 = -123 / ((-6 - arg1) / 35);
        if (~this.field5590 != -1) {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        } else {
            boolean var5 = false;
            if (this.field5570 != arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                var5 = true;
                this.field5570 = arg0;
            }
            if (~this.field5550 != ~arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                this.field5550 = arg2;
                var5 = true;
            }
            if (var5) {
                this.field5487 &= -30;
            }
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IFFFF)V", line = 3795)
    public final void method2329(int arg0, float arg1, float arg2, float arg3, float arg4) {
        ++field5337;
        class10.field132[3] = arg4;
        class10.field132[0] = arg3;
        class10.field132[2] = arg2;
        class10.field132[1] = arg1;
        OpenGL.glTexEnvfv(8960, 8705, class10.field132, arg0);
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)V", line = 3807)
    public final void method752(int arg0) {
        ++field5404;
        if (arg0 >= 128 && arg0 <= 1024) {
            this.field5437 = arg0;
            this.field5447.method3235((byte) 89);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(ILgj;)V", line = 3820)
    public final void method2330(int arg0, class650 arg1) {
        ++field5436;
        if (arg0 >= ~this.field5466) {
            throw new RuntimeException();
        } else {
            if (~this.field5466 <= -1) {
                this.field5463[this.field5466].method687(arg0 + 14841);
            }
            this.field5468 = this.field5463[++this.field5466] = arg1;
            this.field5468.method689((byte) 28);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "(II)V", line = 3843)
    public final synchronized void method2331(int arg0, int arg1) {
        if (arg0 == -1) {
            ++field5349;
            class83 var3 = new class83(arg1);
            this.field5480.method3904(var3, 0);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "(Z)V", line = 3856)
    private final void method2332(boolean arg0) {
        if (this.field5502 >= this.field5603 && ~this.field5500 <= ~this.field5524) {
            OpenGL.glScissor(this.field5603 + this.field5589, this.field5563 + this.field5289 - this.field5500, -this.field5603 + this.field5502, this.field5500 - this.field5524);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field5348;
        if (!arg0) {
            this.field5552 = 93;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(JI)V", line = 3874)
    public final synchronized void method2333(long arg0, int arg1) {
        ++field5425;
        class435 var4 = new class435();
        if (arg1 > 53) {
            var4.field6265 = arg0;
            this.field5483.method3904(var4, 0);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "n", descriptor = "(B)V", line = 3888)
    private final void method2334(byte arg0) {
        if (arg0 != -90) {
            this.field5591 = false;
        }
        ++field5392;
        if (this.field5591 && this.field5510 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "([IIIII)Lf;", line = 3907)
    public final class257 method806(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5362;
        return new class260(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kfa", name = "i", descriptor = "()Z", line = 3915)
    public final boolean method100() {
        ++field5366;
        if (this.field5449 != null) {
            if (!this.field5449.method1947(false)) {
                if (!this.field5446.method2851(this.field5449, false)) {
                    return false;
                }
                this.field5447.method3235((byte) -112);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "DA", descriptor = "()I", line = 3942)
    public final int method144() {
        ++field5379;
        int var1 = this.field5607;
        this.field5607 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!kfa", name = "x", descriptor = "(I)Lgfa;", line = 3959)
    public final class656 method2335(int arg0) {
        ++field5374;
        if (arg0 != 0) {
            this.field5453 = null;
        }
        return this.field5556 == null ? null : this.field5556.method1505((byte) 63);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIIIIIIII)V", line = 3976)
    public final void method811(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5368;
        this.method2319(true);
        this.method2325(arg9, (byte) 45);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BLmba;Lmba;Lmba;Lmba;)V", line = 3995)
    public final void method2336(byte arg0, class70 arg1, class70 arg2, class70 arg3, class70 arg4) {
        ++field5286;
        if (arg2 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method2322(-112, arg2.field1100);
            OpenGL.glVertexPointer(arg2.field1105, arg2.field1102, this.field5543.method2455(-111), this.field5543.method2456((byte) 90) - -((long) arg2.field1101));
            OpenGL.glEnableClientState(32884);
        }
        if (arg1 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method2322(-114, arg1.field1100);
            OpenGL.glNormalPointer(arg1.field1102, this.field5543.method2455(-91), this.field5543.method2456((byte) 125) + (long) arg1.field1101);
            OpenGL.glEnableClientState(32885);
        }
        if (arg0 > -82) {
            this.method775();
        }
        if (arg3 != null) {
            this.method2322(32, arg3.field1100);
            OpenGL.glColorPointer(arg3.field1105, arg3.field1102, this.field5543.method2455(-111), this.field5543.method2456((byte) 107) - -((long) arg3.field1101));
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg4 != null) {
            this.method2322(48, arg4.field1100);
            OpenGL.glTexCoordPointer(arg4.field1105, arg4.field1102, this.field5543.method2455(-77), this.field5543.method2456((byte) 104) + (long) arg4.field1101);
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "y", descriptor = "(I)V", line = 4041)
    public final void method2337(int arg0) {
        if (this.field5487 != 2) {
            this.method2318(84);
            this.method2303(false, -32);
            this.method2272(false, (byte) -9);
            this.method2282(false, true);
            this.method2275(false, 84);
            this.method2321(-1111, -2);
            this.field5487 = 2;
        }
        ++field5360;
        if (arg0 < 115) {
            this.method2302((byte) 0);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "x", descriptor = "()V", line = 4062)
    public final void method88() {
        ++field5319;
        if (!this.field5571) {
            if (!this.field5548) {
                throw new RuntimeException("");
            }
            this.field5464.method500(0, 0, this.field5253, this.field5289, 0, 0);
            this.field5323.setSurface(this.field5288);
        } else {
            if (this.field5461 != this.field5462) {
                throw new RuntimeException();
            }
            this.field5461.method688(-117, 0);
            this.field5461.method688(-115, 8);
            this.method2340((byte) 64, this.field5461);
        }
        this.field5253 = this.field5359;
        this.field5289 = this.field5273;
        this.field5464 = null;
        this.method2284((byte) -64);
        this.method2300(-51);
        this.method805();
    }

    @OriginalMember(owner = "client!kfa", name = "FA", descriptor = "(ILua;II)V", line = 4095)
    public final void method780(int arg0, class591 arg1, int arg2, int arg3) {
        ++field5336;
        class91 var5 = (class91) arg1;
        class196 var6 = var5.field1336;
        this.method2337(123);
        this.method2295((byte) 57, var5.field1336);
        this.method2325(1, (byte) 45);
        this.method2328(7681, 60, 8448);
        this.method2262(34167, 0, 34176, 768);
        float var7 = var6.field3060 / (float) var6.field3056;
        float var8 = var6.field3063 / (float) var6.field3058;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5603) * var7, (float) (-arg3 + this.field5524) * var8);
        OpenGL.glVertex2i(this.field5603, this.field5524);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5603) * var7, (float) (-arg3 + this.field5500) * var8);
        OpenGL.glVertex2i(this.field5603, this.field5500);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5502) * var7, (float) (-arg3 + this.field5500) * var8);
        OpenGL.glVertex2i(this.field5502, this.field5500);
        OpenGL.glTexCoord2f((float) (this.field5502 - arg2) * var7, (float) (-arg3 + this.field5524) * var8);
        OpenGL.glVertex2i(this.field5502, this.field5524);
        OpenGL.glEnd();
        this.method2262(5890, 0, 34176, 768);
    }

    @OriginalMember(owner = "client!kfa", name = "o", descriptor = "(B)V", line = 4128)
    private final void method2338(byte arg0) {
        if (arg0 < 87) {
            this.method769((int[]) null);
        }
        ++field5434;
        if (this.field5581 && !this.field5577) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "AA", descriptor = "(III[I)V", line = 4144)
    public final void method810(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5254;
        float var5 = (float) arg2 * this.field5491.field4003 + (float) arg0 * this.field5491.field3996 + (float) arg1 * this.field5491.field4000 + this.field5491.field4029;
        if (!(var5 < (float) this.field5540) && !(var5 > (float) this.field5602)) {
            int var6 = (int) (((float) arg2 * this.field5491.field4015 + (float) arg0 * this.field5491.field4030 + (float) arg1 * this.field5491.field4031 + this.field5491.field4004) * (float) this.field5552 / var5);
            int var7 = (int) (((float) arg2 * this.field5491.field4011 + (float) arg0 * this.field5491.field4008 + (float) arg1 * this.field5491.field4024 + this.field5491.field4005) * (float) this.field5604 / var5);
            if (this.field5533 <= (float) var6 && this.field5505 >= (float) var6 && (float) var7 >= this.field5592 && (float) var7 <= this.field5572) {
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 + -this.field5533);
                arg3[1] = (int) ((float) var7 - this.field5592);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "z", descriptor = "(I)V", line = 4180)
    private final void method2339(int arg0) {
        ++field5334;
        if (arg0 <= 64) {
            this.field5545 = -55;
        }
        int var2 = 0;
        while (!this.field5323.method224()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class564.method3300((byte) 111, 1000L);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(BLgj;)V", line = 4210)
    public final void method2340(byte arg0, class650 arg1) {
        ++field5435;
        if (!this.field5593) {
            if (~this.field5471 > -1 || this.field5469[this.field5471] != arg1) {
                throw new RuntimeException();
            }
            this.field5469[this.field5471--] = null;
            arg1.method686((byte) 105);
            if (this.field5471 >= 0) {
                this.field5468 = this.field5462 = this.field5469[this.field5471];
                this.field5468.method677(29991);
            } else {
                this.field5468 = this.field5462 = null;
            }
        } else {
            this.method2271(39, arg1);
            this.method2273((byte) -75, arg1);
        }
        if (arg0 != 64) {
            this.method798();
        }
    }
}
