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

@OriginalClass("client!ug")
public class class395 extends class38 {

    @OriginalMember(owner = "client!ug", name = "Ed", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field5464 = new Hashtable();

    @OriginalMember(owner = "client!ug", name = "je", descriptor = "I")
    public int field5495 = 128;

    @OriginalMember(owner = "client!ug", name = "de", descriptor = "Lmi;")
    private class344 field5489 = new class344();

    @OriginalMember(owner = "client!ug", name = "ke", descriptor = "Lkm;")
    private class237 field5496 = new class237();

    @OriginalMember(owner = "client!ug", name = "le", descriptor = "Lkm;")
    public class237 field5497 = new class237();

    @OriginalMember(owner = "client!ug", name = "me", descriptor = "I")
    public int field5498 = 8;

    @OriginalMember(owner = "client!ug", name = "oe", descriptor = "Z")
    private boolean field5500 = false;

    @OriginalMember(owner = "client!ug", name = "se", descriptor = "I")
    public int field5504 = 3;

    @OriginalMember(owner = "client!ug", name = "qe", descriptor = "Lub;")
    private class18 field5502 = new class18();

    @OriginalMember(owner = "client!ug", name = "ve", descriptor = "I")
    private int field5507 = -1;

    @OriginalMember(owner = "client!ug", name = "we", descriptor = "[Lfc;")
    private class171[] field5508 = new class171[4];

    @OriginalMember(owner = "client!ug", name = "ue", descriptor = "[Lfc;")
    private class171[] field5506 = new class171[4];

    @OriginalMember(owner = "client!ug", name = "ze", descriptor = "[Lfc;")
    private class171[] field5511 = new class171[4];

    @OriginalMember(owner = "client!ug", name = "ye", descriptor = "I")
    private int field5510 = -1;

    @OriginalMember(owner = "client!ug", name = "te", descriptor = "I")
    private int field5505 = -1;

    @OriginalMember(owner = "client!ug", name = "Ce", descriptor = "Lub;")
    private class18 field5514;

    @OriginalMember(owner = "client!ug", name = "Fe", descriptor = "Lub;")
    private class18 field5517;

    @OriginalMember(owner = "client!ug", name = "Ge", descriptor = "Lub;")
    private class18 field5518;

    @OriginalMember(owner = "client!ug", name = "He", descriptor = "Lub;")
    private class18 field5519;

    @OriginalMember(owner = "client!ug", name = "Ie", descriptor = "Lub;")
    private class18 field5520;

    @OriginalMember(owner = "client!ug", name = "Je", descriptor = "Lub;")
    private class18 field5521;

    @OriginalMember(owner = "client!ug", name = "Ke", descriptor = "Lub;")
    private class18 field5522;

    @OriginalMember(owner = "client!ug", name = "Qe", descriptor = "I")
    public int field5528;

    @OriginalMember(owner = "client!ug", name = "af", descriptor = "I")
    private int field5538;

    @OriginalMember(owner = "client!ug", name = "uf", descriptor = "I")
    public int field5557;

    @OriginalMember(owner = "client!ug", name = "bf", descriptor = "I")
    public int field5539;

    @OriginalMember(owner = "client!ug", name = "Ne", descriptor = "F")
    public float field5525;

    @OriginalMember(owner = "client!ug", name = "Ve", descriptor = "[F")
    private float[] field5533;

    @OriginalMember(owner = "client!ug", name = "If", descriptor = "F")
    private float field5571;

    @OriginalMember(owner = "client!ug", name = "wf", descriptor = "I")
    public int field5559;

    @OriginalMember(owner = "client!ug", name = "Bf", descriptor = "I")
    public int field5564;

    @OriginalMember(owner = "client!ug", name = "Vf", descriptor = "I")
    public int field5584;

    @OriginalMember(owner = "client!ug", name = "Yf", descriptor = "I")
    private int field5587;

    @OriginalMember(owner = "client!ug", name = "Hf", descriptor = "F")
    public float field5570;

    @OriginalMember(owner = "client!ug", name = "Zf", descriptor = "I")
    public int field5588;

    @OriginalMember(owner = "client!ug", name = "Nf", descriptor = "Z")
    private boolean field5576;

    @OriginalMember(owner = "client!ug", name = "qg", descriptor = "I")
    public int field5605;

    @OriginalMember(owner = "client!ug", name = "Sf", descriptor = "I")
    private int field5581;

    @OriginalMember(owner = "client!ug", name = "lg", descriptor = "F")
    public float field5600;

    @OriginalMember(owner = "client!ug", name = "Of", descriptor = "I")
    private int field5577;

    @OriginalMember(owner = "client!ug", name = "Rf", descriptor = "F")
    public float field5580;

    @OriginalMember(owner = "client!ug", name = "Fg", descriptor = "I")
    public int field5620;

    @OriginalMember(owner = "client!ug", name = "xf", descriptor = "F")
    public float field5560;

    @OriginalMember(owner = "client!ug", name = "Ig", descriptor = "I")
    private int field5623;

    @OriginalMember(owner = "client!ug", name = "Eg", descriptor = "I")
    private int field5619;

    @OriginalMember(owner = "client!ug", name = "Oe", descriptor = "I")
    private int field5526;

    @OriginalMember(owner = "client!ug", name = "og", descriptor = "[Lku;")
    private class256[] field5603;

    @OriginalMember(owner = "client!ug", name = "ig", descriptor = "[F")
    private float[] field5597;

    @OriginalMember(owner = "client!ug", name = "Uf", descriptor = "I")
    private int field5583;

    @OriginalMember(owner = "client!ug", name = "zg", descriptor = "I")
    private int field5614;

    @OriginalMember(owner = "client!ug", name = "Pg", descriptor = "F")
    private float field5630;

    @OriginalMember(owner = "client!ug", name = "yg", descriptor = "I")
    public int field5613;

    @OriginalMember(owner = "client!ug", name = "Qg", descriptor = "[F")
    private float[] field5631;

    @OriginalMember(owner = "client!ug", name = "ug", descriptor = "F")
    public float field5609;

    @OriginalMember(owner = "client!ug", name = "vf", descriptor = "[F")
    private float[] field5558;

    @OriginalMember(owner = "client!ug", name = "gg", descriptor = "[F")
    public float[] field5595;

    @OriginalMember(owner = "client!ug", name = "Ug", descriptor = "F")
    private float field5635;

    @OriginalMember(owner = "client!ug", name = "lf", descriptor = "I")
    private int field5548;

    @OriginalMember(owner = "client!ug", name = "Lg", descriptor = "F")
    public float field5626;

    @OriginalMember(owner = "client!ug", name = "mg", descriptor = "I")
    public int field5601;

    @OriginalMember(owner = "client!ug", name = "Vg", descriptor = "F")
    public float field5636;

    @OriginalMember(owner = "client!ug", name = "Ye", descriptor = "Ldd;")
    public class498 field5536;

    @OriginalMember(owner = "client!ug", name = "ch", descriptor = "[I")
    public int[] field5643;

    @OriginalMember(owner = "client!ug", name = "ah", descriptor = "[I")
    public int[] field5641;

    @OriginalMember(owner = "client!ug", name = "eh", descriptor = "[B")
    public byte[] field5645;

    @OriginalMember(owner = "client!ug", name = "bh", descriptor = "[I")
    public int[] field5642;

    @OriginalMember(owner = "client!ug", name = "xb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5353;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5317;

    @OriginalMember(owner = "client!ug", name = "ce", descriptor = "I")
    public int field5488;

    @OriginalMember(owner = "client!ug", name = "bd", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field5435;

    @OriginalMember(owner = "client!ug", name = "Pc", descriptor = "J")
    private long field5423;

    @OriginalMember(owner = "client!ug", name = "jb", descriptor = "J")
    private long field5339;

    @OriginalMember(owner = "client!ug", name = "eg", descriptor = "Z")
    public boolean field5593;

    @OriginalMember(owner = "client!ug", name = "Df", descriptor = "I")
    public int field5566;

    @OriginalMember(owner = "client!ug", name = "Se", descriptor = "Ljava/lang/String;")
    private String field5530;

    @OriginalMember(owner = "client!ug", name = "ef", descriptor = "Z")
    private boolean field5542;

    @OriginalMember(owner = "client!ug", name = "Wf", descriptor = "Z")
    public boolean field5585;

    @OriginalMember(owner = "client!ug", name = "Ue", descriptor = "Z")
    public boolean field5532;

    @OriginalMember(owner = "client!ug", name = "Jg", descriptor = "Z")
    public boolean field5624;

    @OriginalMember(owner = "client!ug", name = "Tf", descriptor = "Z")
    private boolean field5582;

    @OriginalMember(owner = "client!ug", name = "ng", descriptor = "Z")
    public boolean field5602;

    @OriginalMember(owner = "client!ug", name = "Jf", descriptor = "Ljava/lang/String;")
    private String field5572;

    @OriginalMember(owner = "client!ug", name = "Re", descriptor = "Z")
    public boolean field5529;

    @OriginalMember(owner = "client!ug", name = "xg", descriptor = "Z")
    private boolean field5612;

    @OriginalMember(owner = "client!ug", name = "Xd", descriptor = "Lwj;")
    public class271 field5483;

    @OriginalMember(owner = "client!ug", name = "pe", descriptor = "Lhj;")
    public class402 field5501;

    @OriginalMember(owner = "client!ug", name = "be", descriptor = "Lth;")
    private class424 field5487;

    @OriginalMember(owner = "client!ug", name = "ge", descriptor = "Ltq;")
    private class445 field5492;

    @OriginalMember(owner = "client!ug", name = "ie", descriptor = "Lrm;")
    private class283 field5494;

    @OriginalMember(owner = "client!ug", name = "Xb", descriptor = "Z")
    public static boolean field5379 = true;

    @OriginalMember(owner = "client!ug", name = "Ad", descriptor = "[I")
    public static int[] field5460 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ug", name = "Ze", descriptor = "F")
    public float field5537;

    @OriginalMember(owner = "client!ug", name = "gf", descriptor = "F")
    public float field5544;

    @OriginalMember(owner = "client!ug", name = "jf", descriptor = "F")
    private float field5546;

    @OriginalMember(owner = "client!ug", name = "qf", descriptor = "F")
    public float field5553;

    @OriginalMember(owner = "client!ug", name = "Kf", descriptor = "F")
    public float field5573;

    @OriginalMember(owner = "client!ug", name = "Lf", descriptor = "F")
    private float field5574;

    @OriginalMember(owner = "client!ug", name = "Qf", descriptor = "F")
    private float field5579;

    @OriginalMember(owner = "client!ug", name = "pg", descriptor = "F")
    public float field5604;

    @OriginalMember(owner = "client!ug", name = "sg", descriptor = "F")
    public float field5607;

    @OriginalMember(owner = "client!ug", name = "tg", descriptor = "F")
    public float field5608;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    public static int field5313;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
    public static int field5320;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!ug", name = "X", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!ug", name = "Y", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!ug", name = "Z", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!ug", name = "ab", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!ug", name = "bb", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!ug", name = "cb", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!ug", name = "db", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!ug", name = "eb", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!ug", name = "fb", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!ug", name = "gb", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!ug", name = "hb", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!ug", name = "ib", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!ug", name = "kb", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!ug", name = "lb", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!ug", name = "mb", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!ug", name = "nb", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!ug", name = "ob", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!ug", name = "pb", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!ug", name = "qb", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!ug", name = "rb", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!ug", name = "sb", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!ug", name = "tb", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!ug", name = "ub", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!ug", name = "vb", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!ug", name = "wb", descriptor = "I")
    public int field5352;

    @OriginalMember(owner = "client!ug", name = "yb", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!ug", name = "zb", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!ug", name = "Ab", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!ug", name = "Bb", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!ug", name = "Cb", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!ug", name = "Db", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!ug", name = "Eb", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!ug", name = "Fb", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!ug", name = "Gb", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!ug", name = "Hb", descriptor = "I")
    public int field5363;

    @OriginalMember(owner = "client!ug", name = "Ib", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!ug", name = "Jb", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!ug", name = "Kb", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!ug", name = "Lb", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!ug", name = "Mb", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!ug", name = "Nb", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!ug", name = "Ob", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!ug", name = "Pb", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!ug", name = "Qb", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!ug", name = "Rb", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!ug", name = "Sb", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!ug", name = "Tb", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!ug", name = "Ub", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!ug", name = "Vb", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!ug", name = "Wb", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!ug", name = "Yb", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!ug", name = "Zb", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!ug", name = "ac", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!ug", name = "bc", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!ug", name = "cc", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!ug", name = "dc", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!ug", name = "ec", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!ug", name = "fc", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!ug", name = "gc", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!ug", name = "hc", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!ug", name = "ic", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!ug", name = "jc", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!ug", name = "kc", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!ug", name = "lc", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!ug", name = "mc", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!ug", name = "nc", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!ug", name = "oc", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!ug", name = "pc", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!ug", name = "qc", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!ug", name = "rc", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!ug", name = "sc", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!ug", name = "tc", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!ug", name = "uc", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!ug", name = "vc", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!ug", name = "wc", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!ug", name = "xc", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!ug", name = "yc", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!ug", name = "zc", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!ug", name = "Ac", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!ug", name = "Bc", descriptor = "I")
    private int field5409;

    @OriginalMember(owner = "client!ug", name = "Cc", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!ug", name = "Dc", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!ug", name = "Ec", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!ug", name = "Fc", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!ug", name = "Gc", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!ug", name = "Hc", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!ug", name = "Ic", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!ug", name = "Jc", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!ug", name = "Kc", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!ug", name = "Lc", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!ug", name = "Mc", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!ug", name = "Nc", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!ug", name = "Oc", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!ug", name = "Qc", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!ug", name = "Sc", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!ug", name = "Tc", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!ug", name = "Uc", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!ug", name = "Vc", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!ug", name = "Wc", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!ug", name = "Xc", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!ug", name = "Yc", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!ug", name = "Zc", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!ug", name = "ad", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!ug", name = "cd", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!ug", name = "dd", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!ug", name = "ed", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!ug", name = "fd", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!ug", name = "gd", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!ug", name = "hd", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!ug", name = "id", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!ug", name = "jd", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!ug", name = "kd", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!ug", name = "ld", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!ug", name = "md", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!ug", name = "nd", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!ug", name = "od", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!ug", name = "pd", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!ug", name = "qd", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!ug", name = "rd", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!ug", name = "sd", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!ug", name = "td", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!ug", name = "ud", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!ug", name = "vd", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!ug", name = "wd", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!ug", name = "xd", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!ug", name = "yd", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!ug", name = "zd", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!ug", name = "Bd", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!ug", name = "Cd", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!ug", name = "Dd", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!ug", name = "Fd", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!ug", name = "Gd", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!ug", name = "Hd", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!ug", name = "Id", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!ug", name = "Jd", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!ug", name = "Kd", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!ug", name = "Ld", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!ug", name = "Md", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!ug", name = "Nd", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!ug", name = "Od", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!ug", name = "Pd", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!ug", name = "Qd", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!ug", name = "Rd", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!ug", name = "Sd", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!ug", name = "Td", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!ug", name = "Ud", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!ug", name = "Vd", descriptor = "I")
    private int field5481;

    @OriginalMember(owner = "client!ug", name = "Wd", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!ug", name = "Yd", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!ug", name = "Zd", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!ug", name = "ae", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!ug", name = "ee", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!ug", name = "fe", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!ug", name = "he", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!ug", name = "re", descriptor = "I")
    public int field5503;

    @OriginalMember(owner = "client!ug", name = "Be", descriptor = "I")
    public int field5513;

    @OriginalMember(owner = "client!ug", name = "De", descriptor = "I")
    private int field5515;

    @OriginalMember(owner = "client!ug", name = "Ee", descriptor = "I")
    public int field5516;

    @OriginalMember(owner = "client!ug", name = "Le", descriptor = "I")
    private int field5523;

    @OriginalMember(owner = "client!ug", name = "We", descriptor = "I")
    private int field5534;

    @OriginalMember(owner = "client!ug", name = "Xe", descriptor = "I")
    public int field5535;

    @OriginalMember(owner = "client!ug", name = "mf", descriptor = "I")
    private int field5549;

    @OriginalMember(owner = "client!ug", name = "yf", descriptor = "I")
    private int field5561;

    @OriginalMember(owner = "client!ug", name = "zf", descriptor = "I")
    private int field5562;

    @OriginalMember(owner = "client!ug", name = "Mf", descriptor = "I")
    public int field5575;

    @OriginalMember(owner = "client!ug", name = "fg", descriptor = "I")
    private int field5594;

    @OriginalMember(owner = "client!ug", name = "kg", descriptor = "I")
    public int field5599;

    @OriginalMember(owner = "client!ug", name = "vg", descriptor = "I")
    private int field5610;

    @OriginalMember(owner = "client!ug", name = "Cg", descriptor = "I")
    public int field5617;

    @OriginalMember(owner = "client!ug", name = "Gg", descriptor = "I")
    private int field5621;

    @OriginalMember(owner = "client!ug", name = "Mg", descriptor = "I")
    private int field5627;

    @OriginalMember(owner = "client!ug", name = "Og", descriptor = "I")
    private int field5629;

    @OriginalMember(owner = "client!ug", name = "Rg", descriptor = "I")
    private int field5632;

    @OriginalMember(owner = "client!ug", name = "dh", descriptor = "I")
    private int field5644;

    @OriginalMember(owner = "client!ug", name = "fh", descriptor = "I")
    private int field5646;

    @OriginalMember(owner = "client!ug", name = "Wg", descriptor = "J")
    private long field5637;

    @OriginalMember(owner = "client!ug", name = "cf", descriptor = "Lhq;")
    public class109 field5540;

    @OriginalMember(owner = "client!ug", name = "hf", descriptor = "Lhq;")
    public class109 field5545;

    @OriginalMember(owner = "client!ug", name = "kf", descriptor = "Lhq;")
    public class109 field5547;

    @OriginalMember(owner = "client!ug", name = "of", descriptor = "Lhq;")
    public class109 field5551;

    @OriginalMember(owner = "client!ug", name = "tf", descriptor = "Lhq;")
    public class109 field5556;

    @OriginalMember(owner = "client!ug", name = "Af", descriptor = "Lhq;")
    public class109 field5563;

    @OriginalMember(owner = "client!ug", name = "Pf", descriptor = "Lhq;")
    public class109 field5578;

    @OriginalMember(owner = "client!ug", name = "hg", descriptor = "Lhq;")
    public class109 field5596;

    @OriginalMember(owner = "client!ug", name = "Dg", descriptor = "Lhq;")
    public class109 field5618;

    @OriginalMember(owner = "client!ug", name = "Ng", descriptor = "Lhq;")
    public class109 field5628;

    @OriginalMember(owner = "client!ug", name = "xe", descriptor = "Lfc;")
    private class171 field5509;

    @OriginalMember(owner = "client!ug", name = "Ae", descriptor = "Lfc;")
    private class171 field5512;

    @OriginalMember(owner = "client!ug", name = "ag", descriptor = "Lkm;")
    public class237 field5589;

    @OriginalMember(owner = "client!ug", name = "rg", descriptor = "Lkm;")
    public class237 field5606;

    @OriginalMember(owner = "client!ug", name = "wg", descriptor = "Lml;")
    public class265 field5611;

    @OriginalMember(owner = "client!ug", name = "Me", descriptor = "Lns;")
    public class279 field5524;

    @OriginalMember(owner = "client!ug", name = "Ag", descriptor = "Lnq;")
    private class322 field5615;

    @OriginalMember(owner = "client!ug", name = "Yg", descriptor = "Lea;")
    private class384 field5639;

    @OriginalMember(owner = "client!ug", name = "Ff", descriptor = "Lit;")
    private class458 field5568;

    @OriginalMember(owner = "client!ug", name = "sf", descriptor = "Llc;")
    private class459 field5555;

    @OriginalMember(owner = "client!ug", name = "jg", descriptor = "Llc;")
    private class459 field5598;

    @OriginalMember(owner = "client!ug", name = "df", descriptor = "Log;")
    public class460 field5541;

    @OriginalMember(owner = "client!ug", name = "dg", descriptor = "Log;")
    public class460 field5592;

    @OriginalMember(owner = "client!ug", name = "Rc", descriptor = "Lqn;")
    public static class47 field5425;

    @OriginalMember(owner = "client!ug", name = "ne", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field5499;

    @OriginalMember(owner = "client!ug", name = "Pe", descriptor = "Z")
    private boolean field5527;

    @OriginalMember(owner = "client!ug", name = "Te", descriptor = "Z")
    public boolean field5531;

    @OriginalMember(owner = "client!ug", name = "ff", descriptor = "Z")
    public boolean field5543;

    @OriginalMember(owner = "client!ug", name = "nf", descriptor = "Z")
    private boolean field5550;

    @OriginalMember(owner = "client!ug", name = "rf", descriptor = "Z")
    private boolean field5554;

    @OriginalMember(owner = "client!ug", name = "Cf", descriptor = "Z")
    public boolean field5565;

    @OriginalMember(owner = "client!ug", name = "Ef", descriptor = "Z")
    private boolean field5567;

    @OriginalMember(owner = "client!ug", name = "Gf", descriptor = "Z")
    public boolean field5569;

    @OriginalMember(owner = "client!ug", name = "Xf", descriptor = "Z")
    private boolean field5586;

    @OriginalMember(owner = "client!ug", name = "bg", descriptor = "Z")
    private boolean field5590;

    @OriginalMember(owner = "client!ug", name = "cg", descriptor = "Z")
    public boolean field5591;

    @OriginalMember(owner = "client!ug", name = "Bg", descriptor = "Z")
    public boolean field5616;

    @OriginalMember(owner = "client!ug", name = "Hg", descriptor = "Z")
    public boolean field5622;

    @OriginalMember(owner = "client!ug", name = "Kg", descriptor = "Z")
    public boolean field5625;

    @OriginalMember(owner = "client!ug", name = "Sg", descriptor = "Z")
    private boolean field5633;

    @OriginalMember(owner = "client!ug", name = "Tg", descriptor = "Z")
    private boolean field5634;

    @OriginalMember(owner = "client!ug", name = "Xg", descriptor = "Z")
    private boolean field5638;

    @OriginalMember(owner = "client!ug", name = "Zg", descriptor = "Z")
    private boolean field5640;

    @OriginalMember(owner = "client!ug", name = "pf", descriptor = "[Lsq;")
    private class119[] field5552;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lli;[Lqv;Z)Lla;")
    public final class316 method300(class297 arg0, class311[] arg1, boolean arg2) {
        ++field5447;
        return new class96(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZBII[B)Llc;")
    public final class459 method2269(boolean arg0, byte arg1, int arg2, int arg3, byte[] arg4) {
        int var6 = 66 % ((arg1 - -67) / 49);
        ++field5424;
        return (class459) (!this.field5542 || arg0 && !this.field5582 ? new class145(this, arg3, arg4, arg2) : new class527(this, arg3, arg4, arg2, arg0));
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method277(Canvas arg0) {
        ++field5369;
        if (this.field5353 == arg0) {
            throw new RuntimeException();
        } else if (this.field5464.containsKey(arg0)) {
            Long var2 = (Long) this.field5464.get(arg0);
            this.field5435.releaseSurface(arg0, var2);
            this.field5464.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(Z)V")
    private final void method2270(boolean arg0) {
        if (!arg0) {
            this.method2324((byte) -55, (class171) null);
        }
        ++field5340;
        OpenGL.glViewport(this.field5538, this.field5581, this.field5363, this.field5352);
    }

    @OriginalMember(owner = "client!ug", name = "JA", descriptor = "(IIIIII)Z")
    public final boolean method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5360;
        float var7 = (float) arg2 * this.field5606.field3012 + (float) arg0 * this.field5606.field3038 + (float) arg1 * this.field5606.field3035 + this.field5606.field3016;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field5606.field3012 + (float) arg3 * this.field5606.field3038 + (float) arg4 * this.field5606.field3035 + this.field5606.field3016;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field5559 > var7) || !((float) this.field5559 > var8)) && (!((float) this.field5528 < var7) || !((float) this.field5528 < var8))) {
            int var9 = (int) (((float) arg2 * this.field5606.field3011 + (float) arg0 * this.field5606.field3040 + (float) arg1 * this.field5606.field3022 + this.field5606.field3032) * (float) this.field5605 / var7);
            int var10 = (int) (((float) arg5 * this.field5606.field3011 + (float) arg3 * this.field5606.field3040 + (float) arg4 * this.field5606.field3022 + this.field5606.field3032) * (float) this.field5605 / var8);
            if ((float) var9 < this.field5553 && this.field5553 > (float) var10 || (float) var9 > this.field5604 && (float) var10 > this.field5604) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field5606.field3018 + (float) arg0 * this.field5606.field3037 + (float) arg1 * this.field5606.field3013 + this.field5606.field3042) * (float) this.field5557 / var7);
                int var12 = (int) (((float) arg5 * this.field5606.field3018 + (float) arg3 * this.field5606.field3037 + (float) arg4 * this.field5606.field3013 + this.field5606.field3042) * (float) this.field5557 / var8);
                return (!(this.field5607 > (float) var11) || !((float) var12 < this.field5607)) && (!((float) var11 > this.field5537) || !(this.field5537 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)V")
    public final void method2271(int arg0, int arg1, int arg2) {
        ++field5469;
        if (~this.field5549 != -1) {
            OpenGL.glTexEnvi(8960, 34161, arg1);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        } else {
            boolean var4 = false;
            if (~this.field5623 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                this.field5623 = arg1;
                var4 = true;
            }
            if (this.field5548 != arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                var4 = true;
                this.field5548 = arg2;
            }
            if (var4) {
                this.field5610 &= -30;
            }
        }
        int var5 = 24 / ((-76 - arg0) / 32);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([Lt;Lfm;Lc;[Lvs;I)V")
    public final void method310(class474[] arg0, class517 arg1, class123 arg2, class419[] arg3, int arg4) {
        this.method335(arg0, arg2, arg3, arg4);
        ++field5368;
        this.method351(arg1);
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(B)V")
    public final void method2272(byte arg0) {
        ++field5410;
        OpenGL.glPushMatrix();
        int var2 = 111 / ((arg0 - 8) / 52);
    }

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "()V")
    public final void method309() {
        ++field5331;
        for (class383 var1 = this.field5502.method153(0); var1 != null; var1 = this.field5502.method161(-38)) {
            ((class317) var1).method1867(28441);
        }
        if (this.field5487 != null) {
            this.field5487.method2494(42);
        }
        if (this.field5435 != null) {
            this.method2306((byte) -104);
            Enumeration var2 = this.field5464.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field5464.get(var3);
                this.field5435.releaseSurface(var3, var4);
            }
            this.field5435.release();
            this.field5435 = null;
        }
        if (this.field5500) {
            class466.method2811(false, true, (byte) -49);
            this.field5500 = false;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(FFFBF)V")
    public final void method2273(float arg0, float arg1, float arg2, byte arg3, float arg4) {
        if (arg3 > -63) {
            this.field5604 = 0.4107252F;
        }
        ++field5370;
        class66.field853[0] = arg0;
        class66.field853[3] = arg2;
        class66.field853[2] = arg4;
        class66.field853[1] = arg1;
        OpenGL.glTexEnvfv(8960, 8705, class66.field853, 0);
    }

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "()F")
    public final float method278() {
        ++field5471;
        return this.field5580;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(Z)V")
    public final void method346(boolean arg0) {
        ++field5405;
    }

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "(IFFFFF)V")
    public final void method328(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field5478;
        boolean var7 = this.field5619 != arg0;
        if (var7 || this.field5636 != arg1 || this.field5560 != arg2) {
            this.field5619 = arg0;
            this.field5636 = arg1;
            this.field5560 = arg2;
            if (var7) {
                this.field5609 = (float) (16711680 & this.field5619) / 1.671168E7F;
                this.field5570 = (float) (65280 & this.field5619) / 65280.0F;
                this.field5626 = (float) (255 & this.field5619) / 255.0F;
                this.method2312(10448);
            }
            this.method2292(0);
        }
        if (this.field5558[0] != arg3 || this.field5558[1] != arg4 || this.field5558[2] != arg5) {
            this.field5558[2] = arg5;
            this.field5558[1] = arg4;
            this.field5558[0] = arg3;
            this.field5533[1] = -arg4;
            this.field5533[2] = -arg5;
            this.field5533[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5595[1] = arg4 * var8;
            this.field5595[2] = arg5 * var8;
            this.field5595[0] = arg3 * var8;
            this.field5597[0] = -this.field5595[0];
            this.field5597[1] = -this.field5595[1];
            this.field5597[2] = -this.field5595[2];
            this.method2301(128);
            this.field5599 = (int) (arg3 * 256.0F / arg4);
            this.field5535 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "(IIII)V")
    public final void method355(int arg0, int arg1, int arg2, int arg3) {
        this.field5584 = arg1;
        this.field5605 = arg2;
        ++field5311;
        this.field5557 = arg3;
        this.field5539 = arg0;
        this.method2293(true);
        this.method2277(-96);
        if (~this.field5594 != -4) {
            if (this.field5594 == 2) {
                this.method2327((byte) 37);
                return;
            }
        } else {
            this.method2317((byte) -125);
        }
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(Z)V")
    private final void method2274(boolean arg0) {
        ++field5381;
        if (arg0) {
            this.method294((class87) null);
        }
        if (this.field5594 != 2) {
            this.field5594 = 2;
            this.method2327((byte) 37);
            this.method2280(25752);
            this.field5610 &= -8;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lit;Z)V")
    public final void method2275(class458 arg0, boolean arg1) {
        ++field5395;
        if (this.field5568 != arg0) {
            if (this.field5542) {
                OpenGL.glBindBufferARB(34963, arg0.method2502((byte) 46));
            }
            this.field5568 = arg0;
        }
        if (!arg1) {
            this.field5583 = -7;
        }
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(B)V")
    private final void method2276(byte arg0) {
        if (this.field5554 && this.field5543 | ~this.field5588 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 < 23) {
            this.method359(30);
        }
        ++field5399;
    }

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "(I)V")
    private final void method2277(int arg0) {
        this.field5604 = (float) (-this.field5539 + this.field5526);
        this.field5553 = (float) (-this.field5539 + this.field5614);
        this.field5607 = (float) (-this.field5584 + this.field5577);
        if (arg0 >= -85) {
            this.method2272((byte) -71);
        }
        this.field5537 = (float) (-this.field5584 + this.field5583);
        ++field5324;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIB)V")
    public final void method2278(int arg0, int arg1, byte arg2) {
        this.field5581 = arg1;
        ++field5329;
        if (arg2 != 37) {
            this.field5618 = null;
        }
        this.field5538 = arg0;
        this.method2270(true);
        this.method2309((byte) 22);
    }

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "(I)V")
    private final void method2279(int arg0) {
        ++field5408;
        if (this.field5573 != 0.0F) {
            float var2 = this.field5580 / (this.field5580 + this.field5573);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field5579 * (1.0F - var2) / this.field5573;
            this.field5631[10] = this.field5574 + var4;
            this.field5631[14] = this.field5579 * var3;
        } else {
            this.field5631[14] = this.field5579;
            this.field5631[10] = this.field5574;
        }
        if (arg0 != 5052) {
            this.method321(-66, 112, 9, -106, -99);
        }
        this.field5525 = (float) this.field5528 - this.field5573;
        this.field5600 = (this.field5631[14] - (float) this.field5528) / this.field5631[10];
    }

    @OriginalMember(owner = "client!ug", name = "X", descriptor = "(III[I)V")
    public final void method270(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5475;
        float var5 = (float) arg2 * this.field5606.field3012 + (float) arg0 * this.field5606.field3038 + (float) arg1 * this.field5606.field3035 + this.field5606.field3016;
        if (!((float) this.field5559 > var5) && !((float) this.field5528 < var5)) {
            int var6 = (int) (((float) arg2 * this.field5606.field3011 + (float) arg0 * this.field5606.field3040 + (float) arg1 * this.field5606.field3022 + this.field5606.field3032) * (float) this.field5605 / var5);
            int var7 = (int) (((float) arg2 * this.field5606.field3018 + (float) arg0 * this.field5606.field3037 + (float) arg1 * this.field5606.field3013 + this.field5606.field3042) * (float) this.field5557 / var5);
            if ((float) var6 >= this.field5553 && (float) var6 <= this.field5604 && (float) var7 >= this.field5607 && (float) var7 <= this.field5537) {
                arg3[1] = (int) ((float) var7 - this.field5607);
                arg3[0] = (int) ((float) var6 + -this.field5553);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "()Z")
    public final boolean method363() {
        ++field5299;
        return false;
    }

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "(I)V")
    private final void method2280(int arg0) {
        OpenGL.glLoadIdentity();
        ++field5446;
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field5606.method1427(125), 0);
        if (this.field5543) {
            this.field5494.field3597.method939((byte) -118);
        }
        this.method2301(128);
        this.method2335(76);
        if (arg0 != 25752) {
            this.field5544 = -0.21737932F;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIII)V")
    public final void method337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field5337;
        this.method269(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZZ)V")
    public final void method2281(boolean arg0, boolean arg1) {
        if (arg0) {
            this.field5571 = 0.9646473F;
        }
        if (this.field5567 != arg1) {
            this.field5567 = arg1;
            this.method2314(-73);
        }
        ++field5300;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)Z")
    public static final boolean method2282(byte arg0, int arg1) {
        ++field5432;
        if (arg0 != 74) {
            method2282((byte) 89, 66);
        }
        return arg1 == 6 || ~arg1 == -8 || ~arg1 == -9;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "()Z")
    public final boolean method281() {
        ++field5477;
        return true;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "()I")
    public final int method268() {
        ++field5377;
        return this.field5559;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method271(Canvas arg0) {
        ++field5334;
        if (this.field5353 == arg0) {
            throw new RuntimeException();
        } else if (!this.field5464.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field5435.prepareSurface(arg0);
                if (var4 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field5464.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "xa", descriptor = "()F")
    public final float method333() {
        ++field5350;
        return this.field5573;
    }

    @OriginalMember(owner = "client!ug", name = "ia", descriptor = "(II)V")
    public final void method274(int arg0, int arg1) {
        if (~this.field5559 != ~arg0 || this.field5528 != arg1) {
            this.field5559 = arg0;
            this.field5528 = arg1;
            this.method2293(true);
            this.method2326(true);
            if (this.field5594 != 3) {
                if (this.field5594 == 2) {
                    this.method2327((byte) 37);
                }
            } else {
                this.method2317((byte) -113);
            }
        }
        ++field5312;
    }

    @OriginalMember(owner = "client!ug", name = "YA", descriptor = "()I")
    public final int method306() {
        ++field5437;
        return this.field5528;
    }

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "()V")
    public final void method302() {
        ++field5444;
        if (this.field5492 != null && this.field5492.method1499(-1)) {
            this.field5487.method2489((byte) -88, this.field5492);
            this.field5483.method1605(6408);
        }
    }

    @OriginalMember(owner = "client!ug", name = "MA", descriptor = "(I)V")
    public final void method305(int arg0) {
        ++field5407;
        this.field5504 = 0;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field5504;
        }
        this.field5498 = 1 << this.field5504;
    }

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "()Lc;")
    public final class123 method369() {
        ++field5491;
        return this.field5496;
    }

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "()V")
    public final void method365() {
        ++field5403;
        this.method2337(true, -126);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "()Z")
    public final boolean method368() {
        ++field5383;
        return false;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILfc;)V")
    public final void method2283(int arg0, class171 arg1) {
        ++field5485;
        if (!this.field5565) {
            if (this.field5507 < 0 || this.field5506[this.field5507] != arg1) {
                throw new RuntimeException();
            }
            this.field5506[this.field5507--] = null;
            arg1.method1092(16835);
            if (~this.field5507 > -1) {
                this.field5512 = this.field5509 = null;
            } else {
                this.field5512 = this.field5509 = this.field5506[this.field5507];
                this.field5512.method1087(-25922);
            }
        } else {
            this.method2298(-50, arg1);
            this.method2339(arg1, -1);
        }
        int var3 = -38 / ((-59 - arg0) / 33);
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(Z)V")
    private final void method2284(boolean arg0) {
        ++field5452;
        if (!arg0) {
            int var2 = 0;
            while (!this.field5435.attach()) {
                if (var2++ > 5) {
                    throw new RuntimeException("");
                }
                class199.method1251(1000L, (byte) 109);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([Lt;Lc;[Lvs;I)V")
    public final void method335(class474[] arg0, class123 arg1, class419[] arg2, int arg3) {
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method415(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
        ++field5445;
    }

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "()Z")
    public final boolean method297() {
        ++field5454;
        return this.field5494.method1672(-18491, 3);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lt;Lfm;Lc;Lvs;I)V")
    public final void method366(class474 arg0, class517 arg1, class123 arg2, class419 arg3, int arg4) {
        arg0.method415(arg2, arg3, arg4);
        ++field5484;
        this.method351(arg1);
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(B)Lnn;")
    public final class288 method2285(byte arg0) {
        ++field5314;
        if (arg0 != 69) {
            method2341((byte) 75);
        }
        return this.field5639 != null ? this.field5639.method1737((byte) 105) : null;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(III)V")
    public final synchronized void method2286(int arg0, int arg1, int arg2) {
        if (arg1 != -6957) {
            this.field5519 = null;
        }
        ++field5343;
        class101 var4 = new class101(arg2);
        var4.field5043 = (long) arg0;
        this.field5517.method163(var4, 0);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZI[BI)Lit;")
    public final class458 method2287(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        ++field5308;
        if (!this.field5542 || arg1 && !this.field5582) {
            if (arg2 != 5667) {
                this.method2297(89, (byte) -14);
            }
            return new class454(this, arg0, arg3, arg4);
        } else {
            return new class427(this, arg0, arg3, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lfc;I)V")
    public final void method2288(class171 arg0, int arg1) {
        ++field5400;
        if (~this.field5510 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field5510 <= -1) {
                this.field5508[this.field5510].method1088((byte) 9);
            }
            if (arg1 == 8744) {
                this.field5512 = this.field5508[++this.field5510] = arg0;
                this.field5512.method1090((byte) -52);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(IIII)V")
    public final void method2289(int arg0, int arg1, int arg2, int arg3) {
        ++field5380;
        OpenGL.glTexEnvi(8960, arg2 + 34184, arg3);
        int var5 = -48 % ((-60 - arg1) / 34);
        OpenGL.glTexEnvi(8960, 34200 - -arg2, arg0);
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lga;ILpc;)V")
    public class395(int arg0, Canvas arg1, class278 arg2, int arg3, class476 arg4) {
        super(arg0, arg2);
        new class230();
        new class352(16);
        this.field5514 = new class18();
        this.field5517 = new class18();
        this.field5518 = new class18();
        this.field5519 = new class18();
        this.field5520 = new class18();
        this.field5521 = new class18();
        this.field5522 = new class18();
        this.field5528 = 3584;
        this.field5538 = 0;
        this.field5557 = 512;
        this.field5539 = 0;
        this.field5525 = 3584.0F;
        this.field5533 = new float[4];
        this.field5571 = 0.0F;
        this.field5559 = 50;
        this.field5564 = -1;
        this.field5584 = 0;
        this.field5587 = -1;
        this.field5570 = 1.0F;
        this.field5588 = -1;
        this.field5576 = true;
        this.field5605 = 512;
        this.field5581 = 0;
        this.field5600 = 3584.0F;
        this.field5577 = 0;
        this.field5580 = 3000.0F;
        this.field5620 = 0;
        this.field5560 = -1.0F;
        this.field5623 = 8448;
        this.field5619 = -1;
        this.field5526 = 0;
        this.field5603 = new class256[class165.field2107];
        this.field5597 = new float[4];
        this.field5583 = 0;
        this.field5614 = 0;
        this.field5630 = 1.0F;
        this.field5613 = 0;
        this.field5631 = new float[16];
        this.field5609 = 1.0F;
        this.field5558 = new float[4];
        this.field5595 = new float[4];
        this.field5635 = 1.0F;
        this.field5548 = 8448;
        this.field5626 = 1.0F;
        this.field5601 = -1;
        this.field5636 = -1.0F;
        this.field5536 = new class498(8192);
        this.field5643 = new int[1];
        this.field5641 = new int[1];
        this.field5645 = new byte[16384];
        this.field5642 = new int[1];
        this.field5317 = this.field5353 = arg1;
        this.field5488 = arg3;
        try {
            if (class78.field1020 == null || !class78.field1020) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class78.field1020 = Boolean.TRUE;
                } else {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (var6.startsWith("mac")) {
                            System.load(arg4.method2880((byte) 72, "libjaggl.jnilib").toString());
                        } else {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method2880((byte) 72, "jaggl.dll").toString());
                        }
                    } else {
                        System.load(arg4.method2880((byte) 72, "libjaggl.so").toString());
                    }
                    class78.field1020 = Boolean.TRUE;
                }
            }
            if (class78.field1020 != null && class78.field1020) {
                this.field5435 = new OpenGL();
                this.field5339 = this.field5423 = this.field5435.init(arg1, 8, 8, 8, 24, 0, this.field5488);
                if (~this.field5423 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method2284(false);
                    int var7 = this.method2345(true);
                    if (~var7 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field5566 = this.field5593 ? 33639 : 5121;
                        if (~this.field5530.indexOf("radeon") != 0) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class335.method1937(-61, this.field5530.replace('/', ' '), ' ');
                            for (int var12 = 0; var12 < var11.length; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (var13.length() > 0) {
                                        if (var13.charAt(0) == 'x' && ~var13.length() <= -4 && class341.method1963(10, var13.substring(1, 3))) {
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
                                            if (var13.length() >= 4 && class341.method1963(10, var13.substring(0, 4))) {
                                                var8 = class521.method3099(var13.substring(0, 4), 126);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var10 && !var9) {
                                if (~var8 <= -7001 && ~var8 >= -8000) {
                                    this.field5542 = false;
                                }
                                if (~var8 <= -7001 && var8 <= 9250) {
                                    this.field5585 = false;
                                }
                            }
                            if (!var9 || ~var8 > -4001) {
                                this.field5532 = false;
                            }
                            this.field5624 &= this.field5435.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field5582 = this.field5542;
                            this.field5602 = true;
                        }
                        if (this.field5572.indexOf("intel") != -1) {
                            this.field5529 = false;
                        }
                        this.field5612 = !this.field5572.equals("s3 graphics");
                        if (this.field5542) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class102.method773(false, true, 31207);
                        this.field5500 = true;
                        this.field5483 = new class271(this, super.field502);
                        this.method2319(-22);
                        this.field5501 = new class402(this);
                        this.field5487 = new class424(this);
                        if (this.field5487.method2486((byte) -103)) {
                            this.field5492 = new class445(this);
                            if (!this.field5492.method2623(28581)) {
                                this.field5492.method1489(104);
                                this.field5492 = null;
                            }
                        }
                        this.field5494 = new class283(this);
                        this.method2340((byte) 46);
                        this.method2330(true);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field5435.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (~(var15++) < -6) {
                                    throw new RuntimeException("");
                                }
                                class199.method1251(100L, (byte) 100);
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
            this.method309();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([IIIII)Ll;")
    public final class16 method299(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5433;
        return new class387(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZI)V")
    public final void method2290(boolean arg0, int arg1) {
        if (this.field5627 != arg1) {
            byte var3;
            boolean var4;
            boolean var5;
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    var3 = 2;
                    var4 = false;
                    var5 = true;
                } else if (arg1 == 128) {
                    var4 = true;
                    var5 = true;
                    var3 = 3;
                } else {
                    var4 = false;
                    var5 = true;
                    var3 = 0;
                }
            } else {
                var3 = 1;
                var4 = true;
                var5 = true;
            }
            if (this.field5590 != var5) {
                OpenGL.glColorMask(var5, var5, var5, true);
                this.field5590 = var5;
            }
            if (!this.field5638 == var4) {
                if (!var4) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field5638 = var4;
            }
            if (this.field5621 != var3) {
                if (~var3 == -2) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (var3 == 2) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                } else if (var3 == 3) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(774, 1);
                } else {
                    OpenGL.glDisable(3042);
                }
                this.field5621 = var3;
            }
            this.field5627 = arg1;
            this.field5610 &= -29;
        }
        ++field5402;
        if (!arg0) {
            this.field5558 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "ca", descriptor = "(ILma;II)V")
    public final void method324(int arg0, class10 arg1, int arg2, int arg3) {
        ++field5301;
        class195 var5 = (class195) arg1;
        class322 var6 = var5.field2521;
        this.method2318(-20334);
        this.method2322(var5.field2521, 14);
        this.method2290(true, 1);
        this.method2271(-13, 7681, 8448);
        this.method2338(34167, 0, false, 768);
        float var7 = var6.field4080 / (float) var6.field4084;
        float var8 = var6.field4082 / (float) var6.field4089;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5614) * var7, (float) (-arg3 + this.field5577) * var8);
        OpenGL.glVertex2i(this.field5614, this.field5577);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5614) * var7, (float) (this.field5583 - arg3) * var8);
        OpenGL.glVertex2i(this.field5614, this.field5583);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5526) * var7, (float) (this.field5583 - arg3) * var8);
        OpenGL.glVertex2i(this.field5526, this.field5583);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field5526) * var7, (float) (-arg3 + this.field5577) * var8);
        OpenGL.glVertex2i(this.field5526, this.field5577);
        OpenGL.glEnd();
        this.method2338(5890, 0, false, 768);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BFFF)V")
    private final void method2291(byte arg0, float arg1, float arg2, float arg3) {
        ++field5401;
        OpenGL.glMatrixMode(5890);
        if (this.field5633) {
            OpenGL.glLoadIdentity();
        }
        int var5 = 52 / ((arg0 - 53) / 63);
        OpenGL.glTranslatef(arg1, arg3, arg2);
        OpenGL.glMatrixMode(5888);
        this.field5633 = true;
    }

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "(I)V")
    private final void method2292(int arg0) {
        ++field5342;
        class66.field853[arg0] = this.field5636 * this.field5609;
        class66.field853[2] = this.field5636 * this.field5626;
        class66.field853[3] = 1.0F;
        class66.field853[1] = this.field5636 * this.field5570;
        OpenGL.glLightfv(16384, 4609, class66.field853, 0);
        class66.field853[3] = 1.0F;
        class66.field853[1] = -this.field5560 * this.field5570;
        class66.field853[0] = -this.field5560 * this.field5609;
        class66.field853[2] = -this.field5560 * this.field5626;
        OpenGL.glLightfv(16385, 4609, class66.field853, 0);
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(Z)V")
    private final void method2293(boolean arg0) {
        ++field5458;
        float[] var2 = this.field5631;
        float var3 = (float) (-this.field5539 * this.field5559) / (float) this.field5605;
        float var4 = (float) ((this.field5363 - this.field5539) * this.field5559) / (float) this.field5605;
        float var5 = (float) (this.field5584 * this.field5559) / (float) this.field5557;
        float var6 = (float) ((-this.field5352 + this.field5584) * this.field5559) / (float) this.field5557;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field5559 * 2.0F;
            var2[10] = this.field5574 = (float) (-(this.field5528 - -this.field5559)) / (float) (-this.field5559 + this.field5528);
            var2[7] = 0.0F;
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[11] = -1.0F;
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[6] = 0.0F;
            var2[1] = 0.0F;
            var2[15] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[13] = 0.0F;
            var2[4] = 0.0F;
            var2[5] = var7 / (var5 - var6);
            var2[14] = this.field5579 = -((float) this.field5528 * var7) / (float) (-this.field5559 + this.field5528);
            var2[3] = 0.0F;
            var2[12] = 0.0F;
            var2[2] = 0.0F;
        } else {
            var2[11] = 0.0F;
            var2[14] = 0.0F;
            var2[13] = 0.0F;
            var2[5] = 1.0F;
            var2[10] = 1.0F;
            var2[2] = 0.0F;
            var2[7] = 0.0F;
            var2[0] = 1.0F;
            var2[12] = 0.0F;
            var2[15] = 1.0F;
            var2[8] = 0.0F;
            var2[6] = 0.0F;
            var2[4] = 0.0F;
            var2[9] = 0.0F;
            var2[3] = 0.0F;
            var2[1] = 0.0F;
        }
        this.method2279(5052);
        if (!arg0) {
            this.method2296((byte) -65);
        }
    }

    @OriginalMember(owner = "client!ug", name = "IA", descriptor = "()I")
    public final int method286() {
        ++field5316;
        return this.field5516 + this.field5515 + this.field5513;
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(B)V")
    private final void method2294(byte arg0) {
        if (arg0 >= 13) {
            if (~this.field5594 != -4) {
                this.field5594 = 3;
                this.method2317((byte) -112);
                this.method2280(25752);
                this.field5610 &= -8;
            }
            ++field5386;
        }
    }

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "()V")
    public final void method329() {
        this.field5543 = false;
        ++field5302;
        this.field5494.method1674(false, -15272, 0, false);
        this.method2326(true);
        this.method2276((byte) 47);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Log;Log;Log;ZLog;)V")
    public final void method2295(class460 arg0, class460 arg1, class460 arg2, boolean arg3, class460 arg4) {
        ++field5470;
        if (!arg3) {
            if (arg1 != null) {
                this.method2348(arg1.field6582, 127);
                OpenGL.glVertexPointer(arg1.field6580, arg1.field6577, this.field5555.method969(8072), this.field5555.method972((byte) 37) + (long) arg1.field6578);
                OpenGL.glEnableClientState(32884);
            } else {
                OpenGL.glDisableClientState(32884);
            }
            if (arg4 != null) {
                this.method2348(arg4.field6582, -99);
                OpenGL.glNormalPointer(arg4.field6577, this.field5555.method969(8072), this.field5555.method972((byte) -127) + (long) arg4.field6578);
                OpenGL.glEnableClientState(32885);
            } else {
                OpenGL.glDisableClientState(32885);
            }
            if (arg2 == null) {
                OpenGL.glDisableClientState(32886);
            } else {
                this.method2348(arg2.field6582, 127);
                OpenGL.glColorPointer(arg2.field6580, arg2.field6577, this.field5555.method969(8072), this.field5555.method972((byte) -116) + (long) arg2.field6578);
                OpenGL.glEnableClientState(32886);
            }
            if (arg0 == null) {
                OpenGL.glDisableClientState(32888);
            } else {
                this.method2348(arg0.field6582, 124);
                OpenGL.glTexCoordPointer(arg0.field6580, arg0.field6577, this.field5555.method969(8072), this.field5555.method972((byte) -117) - -((long) arg0.field6578));
                OpenGL.glEnableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "(B)V")
    private final void method2296(byte arg0) {
        OpenGL.glDepthMask(this.field5550 && this.field5576);
        if (arg0 < -73) {
            ++field5328;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II[[I[[IIII)Lta;")
    public final class143 method344(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5480;
        return new class405(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)I")
    public final int method2297(int arg0, byte arg1) {
        ++field5457;
        if (~arg0 != -6407 && arg0 != 6409) {
            if (~arg0 != -6411 && arg0 != 34846 && arg0 != 34844) {
                if (arg0 == 6407) {
                    return 3;
                } else if (arg0 != 6408 && arg0 != 34847) {
                    if (~arg0 == -34844) {
                        return 6;
                    } else if (~arg0 != -34843) {
                        if (arg0 != 6402) {
                            if (arg0 == 6401) {
                                return 1;
                            } else if (arg1 >= -2) {
                                return -123;
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

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method342(Canvas arg0) {
        this.field5317 = null;
        this.field5339 = 0L;
        ++field5349;
        if (arg0 != null && this.field5353 != arg0) {
            if (this.field5464.containsKey(arg0)) {
                Long var2 = (Long) this.field5464.get(arg0);
                this.field5339 = var2;
                this.field5317 = arg0;
            }
        } else {
            this.field5317 = this.field5353;
            this.field5339 = this.field5423;
        }
        if (this.field5317 != null && this.field5339 != 0L) {
            this.field5435.setSurface(this.field5339);
            this.method2330(true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lkc;Lkc;FLkc;)Lkc;")
    public final class87 method273(class87 arg0, class87 arg1, float arg2, class87 arg3) {
        ++field5398;
        if (arg0 != null && arg1 != null && this.field5622 && this.field5529) {
            class296 var5 = null;
            class384 var6 = (class384) arg0;
            class384 var7 = (class384) arg1;
            class288 var8 = var6.method1737((byte) 121);
            class288 var9 = var7.method1737((byte) 101);
            if (var8 != null && var9 != null) {
                int var10 = var8.field3677 > var9.field3677 ? var8.field3677 : var9.field3677;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class296) {
                    class296 var11 = (class296) arg3;
                    if (~var11.method1742(65534) == ~var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class296(this, var10);
                }
                if (var5.method1738(33985, var9, arg2, var8)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(ILfc;)V")
    public final void method2298(int arg0, class171 arg1) {
        ++field5298;
        if (arg0 >= -1) {
            this.method2315(-8);
        }
        if (this.field5510 >= 0 && this.field5508[this.field5510] == arg1) {
            this.field5508[this.field5510--] = null;
            arg1.method1088((byte) 9);
            if (~this.field5510 <= -1) {
                this.field5512 = this.field5508[this.field5510];
                this.field5512.method1090((byte) -52);
            } else {
                this.field5512 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(BI)V")
    public final void method2299(byte arg0, int arg1) {
        if (arg0 != -57) {
            this.method2270(true);
        }
        class66.field853[1] = (float) class378.method2145(65280, arg1) / 65280.0F;
        class66.field853[0] = (float) class378.method2145(arg1, 16711680) / 1.671168E7F;
        class66.field853[3] = (float) (arg1 >>> 24) / 255.0F;
        class66.field853[2] = (float) class378.method2145(255, arg1) / 255.0F;
        ++field5354;
        OpenGL.glTexEnvfv(8960, 8705, class66.field853, 0);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBI)V")
    public final synchronized void method2300(int arg0, byte arg1, int arg2) {
        ++field5382;
        class101 var4 = new class101(arg0);
        var4.field5043 = (long) arg2;
        this.field5518.method163(var4, 0);
        if (arg1 >= -91) {
            this.method2348((class459) null, 81);
        }
    }

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "(I)V")
    public final void method2301(int arg0) {
        ++field5393;
        OpenGL.glLightfv(16384, 4611, this.field5595, 0);
        OpenGL.glLightfv(16385, 4611, this.field5597, 0);
        if (arg0 != 128) {
            this.method2284(true);
        }
    }

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "(B)V")
    private final void method2302(byte arg0) {
        if (this.field5633) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field5633 = false;
        }
        int var2 = -14 % (arg0 / 56);
        ++field5422;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(Lfc;I)V")
    public final void method2303(class171 arg0, int arg1) {
        ++field5429;
        if (arg1 == 34165) {
            if (!this.field5565) {
                if (this.field5507 >= 3) {
                    throw new RuntimeException();
                } else {
                    if (~this.field5507 <= -1) {
                        this.field5506[this.field5507].method1092(16835);
                    }
                    this.field5512 = this.field5509 = this.field5506[++this.field5507] = arg0;
                    this.field5512.method1087(-25922);
                }
            } else {
                this.method2288(arg0, arg1 ^ 42845);
                this.method2324((byte) -40, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "(B)V")
    public final void method2304(byte arg0) {
        if (this.field5610 != 16) {
            this.method2294((byte) 18);
            this.method2344(-34, true);
            this.method2311(true, (byte) 102);
            this.method2337(true, -126);
            this.method2290(true, 1);
            this.method2305(7681, 0);
            this.field5610 = 16;
        }
        ++field5412;
        int var2 = 100 / ((-3 - arg0) / 54);
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(II)V")
    public final void method2305(int arg0, int arg1) {
        if (arg0 != 7681) {
            method2341((byte) -2);
        }
        if (~arg1 != -2) {
            if (arg1 == 0) {
                this.method2271(-113, 8448, 8448);
            } else if (arg1 != 2) {
                if (arg1 == 3) {
                    this.method2271(-120, 260, 8448);
                } else if (arg1 == 4) {
                    this.method2271(51, 34023, 34023);
                }
            } else {
                this.method2271(-108, 34165, 7681);
            }
        } else {
            this.method2271(arg0 ^ 7743, 7681, 7681);
        }
        ++field5472;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIII)V")
    public final void method269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2310(103);
        ++field5303;
        this.method2290(true, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ug", name = "GA", descriptor = "(IIII)V")
    public final void method357(int arg0, int arg1, int arg2, int arg3) {
        ++field5459;
        if (!this.field5543) {
            throw new RuntimeException("");
        } else {
            this.field5617 = arg0;
            this.field5620 = arg3;
            this.field5587 = arg1;
            this.field5601 = arg2;
            this.field5494.field3597.method939((byte) -95);
            this.method2326(true);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIII)V")
    public final void method375(int arg0, int arg1, int arg2, int arg3) {
        this.field5487.method2492(arg3, (byte) 105, arg2, arg1, arg0);
        ++field5453;
    }

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "(B)V")
    private final void method2306(byte arg0) {
        this.field5435.detach();
        ++field5479;
        if (arg0 >= -48) {
            this.field5615 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II[I[I)Lma;")
    public final class10 method290(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field5476;
        return class212.method1312(arg0, arg3, arg1, this, arg2, -128);
    }

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "()Lc;")
    public final class123 method371() {
        ++field5474;
        return new class237();
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZI)V")
    public final void method2307(int arg0, boolean arg1, int arg2) {
        if (arg0 >= -19) {
            this.method2340((byte) -56);
        }
        this.method2336(true, arg1, (byte) 114, arg2);
        ++field5431;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)V")
    public final void method284(boolean arg0) {
        ++field5384;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(III)V")
    public final synchronized void method2308(int arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            this.field5557 = 21;
        }
        ++field5465;
        class101 var4 = new class101(arg0);
        var4.field5043 = (long) arg1;
        this.field5520.method163(var4, 0);
    }

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "()Z")
    public final boolean method322() {
        ++field5426;
        return true;
    }

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "(B)V")
    private final void method2309(byte arg0) {
        if (~this.field5526 <= ~this.field5614 && this.field5583 >= this.field5577) {
            OpenGL.glScissor(this.field5538 - -this.field5614, this.field5581 + this.field5352 - this.field5583, -this.field5614 + this.field5526, -this.field5577 + this.field5583);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field5417;
        if (arg0 != 22) {
            this.field5353 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "(I)V")
    private final void method2310(int arg0) {
        int var2 = -102 % ((4 - arg0) / 53);
        ++field5415;
        if (this.field5610 != 1) {
            this.method2331(110);
            this.method2344(-111, false);
            this.method2325((byte) 122, false);
            this.method2311(false, (byte) 102);
            this.method2337(false, -128);
            this.method2322((class119) null, 14);
            this.method2349((byte) -123, -2);
            this.method2305(7681, 1);
            this.field5610 = 1;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZB)V")
    public final void method2311(boolean arg0, byte arg1) {
        ++field5443;
        if (arg1 != 102) {
            this.field5619 = -39;
        }
        if (!this.field5640 != !arg0) {
            if (!arg0) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field5610 &= -32;
            this.field5640 = arg0;
        }
    }

    @OriginalMember(owner = "client!ug", name = "OA", descriptor = "(IIII)V")
    public final void method330(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5363 < arg2) {
            arg2 = this.field5363;
        }
        if (~arg3 < ~this.field5352) {
            arg3 = this.field5352;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        ++field5450;
        this.field5583 = arg3;
        this.field5577 = arg1;
        this.field5614 = arg0;
        this.field5526 = arg2;
        OpenGL.glEnable(3089);
        this.method2277(-90);
        this.method2309((byte) 22);
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "()Z")
    public final boolean method289() {
        ++field5462;
        return true;
    }

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "(I)V")
    private final void method2312(int arg0) {
        class66.field853[2] = this.field5626 * this.field5608;
        class66.field853[1] = this.field5608 * this.field5570;
        if (arg0 == 10448) {
            class66.field853[3] = 1.0F;
            class66.field853[0] = this.field5609 * this.field5608;
            ++field5391;
            OpenGL.glLightModelfv(2899, class66.field853, 0);
        }
    }

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "()I")
    public final int method314() {
        ++field5455;
        return 4;
    }

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "(IIIIII)V")
    public final void method308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5358;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method2310(-97);
        float var10 = (float) arg3 + var8;
        this.method2290(true, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5586) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5586) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method315(Canvas arg0) {
        ++field5442;
        long var2 = 0L;
        if (arg0 != null && this.field5353 != arg0) {
            if (this.field5464.containsKey(arg0)) {
                Long var4 = (Long) this.field5464.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field5423;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field5435.surfaceResized(var2);
            if (this.field5317 == arg0) {
                this.method2330(true);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(II)V")
    public final synchronized void method2313(int arg0, int arg1) {
        ++field5394;
        class101 var3 = new class101(arg1);
        this.field5519.method163(var3, arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "(I)V")
    private final void method2314(int arg0) {
        ++field5333;
        if (this.field5527 && !this.field5567) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        int var2 = 116 / ((arg0 - -25) / 47);
    }

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "(I)V")
    public final void method2315(int arg0) {
        ++field5374;
        if (this.field5610 != arg0) {
            this.method2331(arg0 + 71);
            this.method2344(-63, false);
            this.method2325((byte) 95, false);
            this.method2311(false, (byte) 102);
            this.method2337(false, arg0 + -132);
            this.method2349((byte) -114, -2);
            this.method2290(true, 1);
            this.method2305(7681, 0);
            this.field5610 = 4;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[Lku;)V")
    public final void method311(int arg0, class256[] arg1) {
        ++field5322;
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field5603[var3] = arg1[var3];
        }
        this.field5562 = arg0;
        if (~this.field5594 != -2) {
            this.method2335(75);
        }
    }

    @OriginalMember(owner = "client!ug", name = "NA", descriptor = "(IIIII)V")
    public final void method331(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5389;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BIII)V")
    public final void method2316(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = 122 / ((arg0 - -31) / 37);
        ++field5307;
        OpenGL.glDrawArrays(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "(B)V")
    private final void method2317(byte arg0) {
        ++field5427;
        float var2 = (float) (-this.field5539) * this.field5630 / (float) this.field5605;
        float var3 = (float) (-this.field5584) * this.field5630 / (float) this.field5557;
        float var4 = (float) (-this.field5539 + this.field5363) * this.field5630 / (float) this.field5605;
        if (arg0 >= -91) {
            this.method354();
        }
        float var5 = (float) (-this.field5584 + this.field5352) * this.field5630 / (float) this.field5557;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field5559 - this.field5573), (double) ((float) this.field5528 + -this.field5573));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ug", name = "AA", descriptor = "(IIII)V")
    public final void method317(int arg0, int arg1, int arg2, int arg3) {
        this.field5543 = true;
        this.field5587 = arg1;
        this.field5620 = arg3;
        this.field5601 = arg2;
        this.field5617 = arg0;
        ++field5366;
        this.field5494.method1674(false, -15272, 3, false);
        this.field5494.field3597.method939((byte) -110);
        this.method2326(true);
        this.method2276((byte) 46);
    }

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "(I)V")
    public final void method2318(int arg0) {
        if (this.field5610 != 2) {
            this.method2331(93);
            this.method2344(-102, false);
            this.method2325((byte) 117, false);
            this.method2311(false, (byte) 102);
            this.method2337(false, -126);
            this.method2349((byte) 27, -2);
            this.field5610 = 2;
        }
        ++field5385;
        if (arg0 != -20334) {
            this.field5622 = true;
        }
    }

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "(I)V")
    private final void method2319(int arg0) {
        ++field5419;
        this.field5606 = new class237();
        this.field5589 = new class237();
        this.field5552 = new class119[this.field5575];
        this.field5611 = new class265(this, 3553, 6408, 1, 1);
        new class265(this, 3553, 6408, 1, 1);
        new class265(this, 3553, 6408, 1, 1);
        if (arg0 >= -16) {
            this.method286();
        }
        this.field5618 = new class109(this);
        this.field5578 = new class109(this);
        this.field5545 = new class109(this);
        this.field5540 = new class109(this);
        this.field5628 = new class109(this);
        this.field5556 = new class109(this);
        this.field5596 = new class109(this);
        this.field5547 = new class109(this);
        this.field5551 = new class109(this);
        this.field5563 = new class109(this);
        if (this.field5529) {
            this.field5524 = new class279(this);
            new class279(this);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5371;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(JB)V")
    public final synchronized void method2320(long arg0, byte arg1) {
        ++field5493;
        if (arg1 >= -43) {
            this.method2344(-120, true);
        }
        class383 var4 = new class383();
        var4.field5043 = arg0;
        this.field5522.method163(var4, 0);
    }

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "()Z")
    public final boolean method356() {
        ++field5376;
        return this.field5586 && (!this.method304() || this.field5634);
    }

    @OriginalMember(owner = "client!ug", name = "ea", descriptor = "(Lc;)V")
    public final void method287(class123 arg0) {
        this.field5606 = (class237) arg0;
        ++field5344;
        this.field5589.method1429((byte) -100, this.field5606);
        if (~this.field5594 != -2) {
            this.method2280(25752);
        }
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(II)V")
    public final void method2321(int arg0, int arg1) {
        if (~this.field5549 != ~arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field5549 = arg0;
        }
        if (arg1 != 25322) {
            this.field5527 = false;
        }
        ++field5318;
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)Lu;")
    public final class53 method347(int arg0) {
        ++field5449;
        class317 var2 = new class317(arg0);
        this.field5502.method163(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "()I")
    public final int method298() {
        ++field5367;
        int var1 = this.field5644;
        this.field5644 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lsq;I)V")
    public final void method2322(class119 arg0, int arg1) {
        ++field5330;
        class119 var3 = this.field5552[this.field5549];
        if (arg0 != var3) {
            if (arg0 == null) {
                OpenGL.glDisable(var3.field1604);
            } else {
                if (var3 == null) {
                    OpenGL.glEnable(arg0.field1604);
                } else if (arg0.field1604 != var3.field1604) {
                    OpenGL.glDisable(var3.field1604);
                    OpenGL.glEnable(arg0.field1604);
                }
                OpenGL.glBindTexture(arg0.field1604, arg0.method858(true));
            }
            this.field5552[this.field5549] = arg0;
        }
        this.field5610 &= -2;
        if (arg1 != 14) {
            this.method294((class87) null);
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)I")
    public final int method370(int arg0, int arg1) {
        ++field5439;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(II)V")
    public final synchronized void method2323(int arg0, int arg1) {
        int var3 = -29 % ((arg1 - 45) / 47);
        ++field5347;
        class383 var4 = new class383();
        var4.field5043 = (long) arg0;
        this.field5521.method163(var4, 0);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLfc;)V")
    public final void method2324(byte arg0, class171 arg1) {
        ++field5486;
        if (this.field5505 >= 3) {
            throw new RuntimeException();
        } else {
            if (arg0 > -24) {
                this.method268();
            }
            if (this.field5505 >= 0) {
                this.field5511[this.field5505].method1089(true);
            }
            this.field5509 = this.field5511[++this.field5505] = arg1;
            this.field5509.method1091((byte) 112);
        }
    }

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "(F)V")
    public final void method282(float arg0) {
        ++field5356;
        if (this.field5608 != arg0) {
            this.field5608 = arg0;
            this.method2312(10448);
        }
    }

    @OriginalMember(owner = "client!ug", name = "ZA", descriptor = "()I")
    public final int method367() {
        ++field5482;
        int var1 = this.field5646;
        this.field5646 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BZ)V")
    public final void method2325(byte arg0, boolean arg1) {
        ++field5390;
        if (arg1 == !this.field5527) {
            this.field5527 = arg1;
            this.method2314(45);
            this.field5610 &= -8;
        }
        if (arg0 <= 93) {
            this.field5530 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "(Z)V")
    private final void method2326(boolean arg0) {
        if (!arg0) {
            this.method2328(37, (class237) null);
        }
        ++field5490;
        int var2;
        if (this.field5543) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field5587;
        } else {
            this.field5546 = (float) (-this.field5613 + this.field5528) + -this.field5571;
            this.field5544 = this.field5546 - (float) this.field5588 * this.field5635;
            if (this.field5544 < (float) this.field5559) {
                this.field5544 = (float) this.field5559;
            }
            OpenGL.glFogf(2915, this.field5544);
            OpenGL.glFogf(2916, this.field5546);
            var2 = this.field5564;
        }
        class66.field853[2] = (float) class378.method2145(var2, 255) / 255.0F;
        class66.field853[1] = (float) class378.method2145(65280, var2) / 65280.0F;
        class66.field853[0] = (float) class378.method2145(var2, 16711680) / 1.671168E7F;
        OpenGL.glFogfv(2918, class66.field853, 0);
        if (this.field5543) {
            this.field5494.field3597.method938((byte) 99);
        }
    }

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "(B)V")
    private final void method2327(byte arg0) {
        ++field5428;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field5631, 0);
        if (arg0 == 37) {
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILkm;)V")
    public final void method2328(int arg0, class237 arg1) {
        ++field5359;
        if (arg0 != -21316) {
            this.field5352 = -44;
        }
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg1.method1427(86), 0);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lmb;IIII)Lt;")
    public final class474 method361(class173 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5297;
        return new class109(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "()Z")
    public final boolean method339() {
        ++field5313;
        return true;
    }

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "(I)V")
    public final void method2329(int arg0) {
        OpenGL.glPopMatrix();
        ++field5438;
        if (arg0 != 0) {
            this.field5559 = -74;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
    public final void method280(boolean arg0) {
        ++field5411;
        this.field5576 = arg0;
        this.method2296((byte) -112);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lfm;)V")
    public final void method351(class517 arg0) {
        ++field5346;
        this.field5489.method1979(this, (byte) -53, arg0);
    }

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "()Z")
    public final boolean method362() {
        ++field5326;
        return true;
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V")
    public final synchronized void method359(int arg0) {
        ++field5397;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field5517.method162((byte) -116)) {
            class101 var12 = (class101) this.field5517.method158(-24557);
            class153.field1934[var3++] = (int) var12.field5043;
            this.field5513 -= var12.field1222;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class153.field1934, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class153.field1934, 0);
            var3 = 0;
        }
        while (!this.field5518.method162((byte) -125)) {
            class101 var11 = (class101) this.field5518.method158(-24557);
            class153.field1934[var3++] = (int) var11.field5043;
            this.field5516 -= var11.field1222;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class153.field1934, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteTextures(var3, class153.field1934, 0);
            var3 = 0;
        }
        while (!this.field5519.method162((byte) -125)) {
            class101 var10 = (class101) this.field5519.method158(-24557);
            class153.field1934[var3++] = var10.field1222;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class153.field1934, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class153.field1934, 0);
            var3 = 0;
        }
        while (!this.field5520.method162((byte) -124)) {
            class101 var9 = (class101) this.field5520.method158(-24557);
            class153.field1934[var3++] = (int) var9.field5043;
            this.field5515 -= var9.field1222;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class153.field1934, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class153.field1934, 0);
            boolean var4 = false;
        }
        while (!this.field5514.method162((byte) 7)) {
            class101 var8 = (class101) this.field5514.method158(-24557);
            OpenGL.glDeleteLists((int) var8.field5043, var8.field1222);
        }
        while (!this.field5521.method162((byte) -117)) {
            class383 var7 = this.field5521.method158(-24557);
            OpenGL.glDeleteProgramARB((int) var7.field5043);
        }
        while (!this.field5522.method162((byte) 70)) {
            class383 var6 = this.field5522.method158(-24557);
            OpenGL.glDeleteObjectARB(var6.field5043);
        }
        while (!this.field5514.method162((byte) 71)) {
            class101 var5 = (class101) this.field5514.method158(-24557);
            OpenGL.glDeleteLists((int) var5.field5043, var5.field1222);
        }
        this.field5483.method1604(111);
        if (~this.method286() < -100663297 && class504.method3034((byte) -101) > this.field5637 + 60000L) {
            System.gc();
            this.field5637 = class504.method3034((byte) -126);
        }
        this.field5503 = var2;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(FFF)V")
    public final void method348(float arg0, float arg1, float arg2) {
        ++field5416;
        class465.field6714 = arg0;
        class87.field1088 = arg1;
        class431.field6111 = arg2;
    }

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "(Z)V")
    private final void method2330(boolean arg0) {
        if (!arg0) {
            this.method2325((byte) 30, false);
        }
        ++field5473;
        if (this.field5317 != null) {
            Dimension var2 = this.field5317.getSize();
            this.field5481 = var2.width;
            this.field5409 = var2.height;
        } else {
            this.field5481 = this.field5409 = 0;
        }
        if (this.field5509 == null) {
            this.field5363 = this.field5481;
            this.field5352 = this.field5409;
            this.method2270(true);
        }
        this.method2333((byte) 72);
        this.method318();
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method319(Rectangle[] arg0, int arg1) {
        ++field5341;
        this.method288();
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "()V")
    public final void method288() {
        ++field5413;
        try {
            this.field5435.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(IIIII)V")
    public final void method301(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2310(-86);
        ++field5305;
        this.method2290(true, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "()Z")
    public final boolean method354() {
        ++field5320;
        return true;
    }

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "(I)V")
    private final void method2331(int arg0) {
        if (this.field5594 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field5363 < -1 && ~this.field5352 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field5363, (double) this.field5352, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field5610 &= -25;
            this.field5594 = 1;
        }
        ++field5378;
        if (arg0 <= 18) {
            this.method346(false);
        }
    }

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "(IIII)[I")
    public final int[] method341(int arg0, int arg1, int arg2, int arg3) {
        ++field5364;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field5352 + -var6, arg2, 1, 32993, this.field5566, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public final void method279(int arg0) {
        this.method2284(false);
        ++field5372;
    }

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "()Z")
    public final boolean method360() {
        ++field5387;
        return true;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIZ)Ll;")
    public final class16 method296(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5448;
        return new class387(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IFF)V")
    public final void method2332(int arg0, float arg1, float arg2) {
        this.field5635 = arg1;
        ++field5335;
        this.field5571 = arg2;
        if (!this.field5543) {
            this.method2326(true);
        }
        int var4 = -47 / ((-5 - arg0) / 61);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIF)Lku;")
    public final class256 method295(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field5418;
        return new class452(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "(B)V")
    public final void method2333(byte arg0) {
        if (arg0 != 72) {
            this.method2301(98);
        }
        if (this.field5594 != 0) {
            this.field5594 = 0;
            this.field5610 &= -32;
        }
        ++field5310;
    }

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "(I)V")
    public final void method2334(int arg0) {
        ++field5332;
        if (this.field5610 != 8) {
            this.method2274(false);
            this.method2344(-68, true);
            this.method2311(true, (byte) 102);
            this.method2337(true, -124);
            this.method2290(true, 1);
            this.method2305(7681, 0);
            this.field5610 = 8;
        }
        if (arg0 < 102) {
            this.method2290(true, 43);
        }
    }

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "(I)V")
    private final void method2335(int arg0) {
        ++field5362;
        int var2;
        for (var2 = 0; ~var2 > ~this.field5562; ++var2) {
            class256 var3 = this.field5603[var2];
            int var4 = var2 + 16386;
            class492.field7166[0] = (float) var3.method1539((byte) 106);
            class492.field7166[1] = (float) var3.method1536((byte) 106);
            class492.field7166[2] = (float) var3.method1537(-409134460);
            class492.field7166[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class492.field7166, 0);
            int var5 = var3.method1533(-409134460);
            float var6 = var3.method1542(77) / 255.0F;
            class492.field7166[1] = (float) class378.method2145(var5 >> 8, 255) * var6;
            class492.field7166[0] = (float) class378.method2145(var5 >> 16, 255) * var6;
            class492.field7166[2] = (float) class378.method2145(255, var5) * var6;
            OpenGL.glLightfv(var4, 4609, class492.field7166, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method1534((byte) 51) * var3.method1534((byte) -51)));
            OpenGL.glEnable(var4);
        }
        while (this.field5523 > var2) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        if (arg0 <= 68) {
            this.field5573 = -0.6342599F;
        }
        this.field5523 = this.field5562;
    }

    @OriginalMember(owner = "client!ug", name = "TA", descriptor = "(IIIII)V")
    public final void method321(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5441;
        this.method2310(59);
        this.method2290(true, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "()V")
    public final void method352() {
        ++field5355;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZZBI)V")
    public final void method2336(boolean arg0, boolean arg1, byte arg2, int arg3) {
        if (arg2 > 69) {
            ++field5309;
            if (this.field5632 != arg3) {
                if (arg3 < 0) {
                    this.method2302((byte) -100);
                    this.method2322((class119) null, 14);
                    this.method2305(7681, 0);
                    if (!this.field5543) {
                        this.field5494.method1674(arg0, -15272, 0, arg1);
                    }
                } else {
                    class265 var5 = this.field5483.method1606(arg3, 6408);
                    class139 var6 = super.field502.method1642(arg3, -28);
                    if (var6.field1791 == 0 && var6.field1789 == 0) {
                        this.method2302((byte) -92);
                    } else {
                        int var7 = var6.field1773 ? 64 : 128;
                        int var8 = var7 * 50;
                        this.method2291((byte) 117, (float) (this.field5503 % var8 * var6.field1791) / (float) var8, 0.0F, (float) (this.field5503 % var8 * var6.field1789) / (float) var8);
                    }
                    if (!this.field5543) {
                        this.field5494.method1674(arg0, -15272, var6.field1794, arg1);
                        this.field5494.method1673(var6.field1790, Integer.MAX_VALUE, var6.field1781);
                        if (!this.field5494.method1671(var6.field1786, var5, 122)) {
                            this.method2322(var5, 14);
                            this.method2305(7681, var6.field1786);
                        }
                    } else {
                        this.field5494.method1674(arg0, -15272, 3, arg1);
                        this.method2322(var5, 14);
                        this.method2305(7681, var6.field1786);
                    }
                }
                this.field5632 = arg3;
            }
            this.field5610 &= -8;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(ZI)V")
    public final void method2337(boolean arg0, int arg1) {
        if (this.field5550 == !arg0) {
            this.field5550 = arg0;
            this.method2296((byte) -118);
            this.field5610 &= -32;
        }
        if (arg1 <= -123) {
            ++field5420;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIZI)V")
    public final void method2338(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.method331(64, -83, 113, -15, -27);
        }
        ++field5336;
        OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
        OpenGL.glTexEnvi(8960, arg1 + 34192, arg3);
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(Lfc;I)V")
    public final void method2339(class171 arg0, int arg1) {
        ++field5323;
        if (~this.field5505 <= arg1 && this.field5511[this.field5505] == arg0) {
            this.field5511[this.field5505--] = null;
            arg0.method1089(true);
            if (this.field5505 < 0) {
                this.field5509 = null;
            } else {
                this.field5509 = this.field5511[this.field5505];
                this.field5509.method1091((byte) 112);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "(B)V")
    private final void method2340(byte arg0) {
        this.method2349((byte) 16, -2);
        ++field5306;
        for (int var2 = this.field5575 - 1; var2 >= 0; --var2) {
            this.method2321(var2, 25322);
            this.method2322((class119) null, arg0 + -32);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2271(-114, 8448, 8448);
        this.method2338(34168, 2, false, 770);
        this.method2302((byte) 123);
        this.field5627 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field5621 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field5638 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field5590 = true;
        this.method2344(arg0 ^ -75, true);
        this.method2325((byte) 124, true);
        this.method2311(true, (byte) 102);
        this.method2337(true, -126);
        this.method2333((byte) 72);
        this.field5435.setSwapInterval(0);
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
        int var4 = 0;
        if (arg0 == 46) {
            while (var4 < 8) {
                int var5 = 16384 - -var4;
                OpenGL.glLightfv(var5, 4608, var3, 0);
                OpenGL.glLightf(var5, 4615, 0.0F);
                OpenGL.glLightf(var5, 4616, 0.0F);
                ++var4;
            }
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
            OpenGL.glFogf(2914, 0.95F);
            OpenGL.glFogi(2917, 9729);
            OpenGL.glHint(3156, 4353);
            this.field5619 = this.field5564 = -1;
            this.method318();
        }
    }

    @OriginalMember(owner = "client!ug", name = "da", descriptor = "([I)V")
    public final void method267(int[] arg0) {
        arg0[1] = this.field5577;
        ++field5338;
        arg0[3] = this.field5583;
        arg0[0] = this.field5614;
        arg0[2] = this.field5526;
    }

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "()Z")
    public final boolean method374() {
        ++field5345;
        if (this.field5492 != null) {
            if (!this.field5492.method1499(-1)) {
                if (!this.field5487.method2487(this.field5492, -86)) {
                    return false;
                }
                this.field5483.method1605(6408);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
    public final void method332(int arg0) {
        ++field5351;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field5495 = arg0;
            this.field5483.method1605(6408);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "()Z")
    public final boolean method304() {
        ++field5430;
        return this.field5492 != null && this.field5492.method1499(-1);
    }

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "(B)V")
    public static void method2341(byte arg0) {
        field5460 = null;
        field5425 = null;
        int var1 = -22 % ((47 - arg0) / 48);
    }

    @OriginalMember(owner = "client!ug", name = "UA", descriptor = "(III)V")
    public final void method343(int arg0, int arg1, int arg2) {
        if (this.field5564 != arg0 || ~this.field5588 != ~arg1 || this.field5613 != arg2) {
            this.field5588 = arg1;
            this.field5613 = arg2;
            this.field5564 = arg0;
            if (!this.field5543) {
                this.method2326(true);
                this.method2276((byte) 98);
            }
        }
        ++field5325;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IF)V")
    public final void method2342(int arg0, float arg1) {
        ++field5404;
        if (arg0 < 61) {
            this.field5551 = null;
        }
        if (this.field5630 != arg1) {
            this.field5630 = arg1;
            if (this.field5594 == 3) {
                this.method2317((byte) -117);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(FF)V")
    public final void method338(float arg0, float arg1) {
        ++field5461;
        if (this.field5580 != arg0 || this.field5573 != arg1) {
            this.field5573 = arg1;
            this.field5580 = arg0;
            this.method2279(5052);
            if (this.field5594 == 3) {
                this.method2317((byte) -115);
                return;
            }
            if (this.field5594 != 2) {
                return;
            }
            this.method2327((byte) 37);
        }
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "()Z")
    public final boolean method293() {
        ++field5388;
        return this.field5492 != null && (this.field5488 <= 1 || this.field5634);
    }

    @OriginalMember(owner = "client!ug", name = "DA", descriptor = "(IIIIII[BII)V")
    public final void method349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field5392;
        float var10;
        float var11;
        if (this.field5615 != null && ~arg2 >= ~this.field5615.field3340 && ~this.field5615.field3339 <= ~arg3) {
            this.field5615.method1575(arg3, arg6, arg2, 6406, 0, false, 0, 0, (byte) 66, 0);
            var10 = (float) arg3 * this.field5615.field4082 / (float) this.field5615.field3339;
            var11 = (float) arg2 * this.field5615.field4080 / (float) this.field5615.field3340;
        } else {
            this.field5615 = class141.method958(arg2, -97, 6406, false, 6406, arg6, arg3, this);
            this.field5615.method1578(false, 0, false);
            var11 = this.field5615.field4080;
            var10 = this.field5615.field4082;
        }
        this.method2318(-20334);
        this.method2322(this.field5615, 14);
        this.method2290(true, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2299((byte) -57, arg5);
        this.method2271(18, 34165, 34165);
        this.method2338(34166, 0, false, 768);
        this.method2338(5890, 2, false, 770);
        this.method2289(770, 3, 0, 34166);
        this.method2289(770, -113, 2, 5890);
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
        this.method2338(5890, 0, false, 768);
        this.method2338(34166, 2, false, 770);
        this.method2289(770, -100, 0, 5890);
        this.method2289(770, -25, 2, 34166);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILit;III)V")
    public final void method2343(int arg0, class458 arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= -92) {
            field5425 = null;
        }
        ++field5406;
        int var6 = arg1.method2501((byte) -58);
        int var7 = arg2 * this.method2346((byte) 112, var6);
        this.method2275(arg1, true);
        OpenGL.glDrawElements(arg4, arg3, var6, arg1.method2503(-33) + (long) var7);
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(IZ)V")
    public final void method2344(int arg0, boolean arg1) {
        if (arg0 < -33) {
            if (arg1 == !this.field5554) {
                this.field5554 = arg1;
                this.method2276((byte) 60);
                this.field5610 &= -32;
            }
            ++field5361;
        }
    }

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "(Z)I")
    private final int method2345(boolean arg0) {
        ++field5319;
        this.field5572 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field5530 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field5572.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (~this.field5572.indexOf("brian paul") != 0 || ~this.field5572.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class335.method1937(-48, var3.replace('.', ' '), ' ');
        if (~var4.length > -3) {
            var2 |= 4;
        } else {
            try {
                int var5 = class521.method3099(var4[0], 74);
                int var6 = class521.method3099(var4[1], 87);
                this.field5629 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (~this.field5629 > -13) {
            var2 |= 2;
        }
        if (!this.field5435.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field5435.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field5575 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field5534 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field5561 = var7[0];
        if (this.field5575 < 2 || ~this.field5534 > -3 || this.field5561 < 2) {
            var2 |= 16;
        }
        if (!arg0) {
            this.method2303((class171) null, 76);
        }
        this.field5593 = NativeStream.method2601();
        this.field5435.arePbuffersAvailable();
        this.field5542 = this.field5435.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field5586 = this.field5435.isExtensionAvailable("GL_ARB_multisample");
        this.field5616 = this.field5435.isExtensionAvailable("GL_ARB_vertex_program");
        this.field5435.isExtensionAvailable("GL_ARB_fragment_program");
        this.field5625 = this.field5435.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field5531 = this.field5435.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field5585 = this.field5435.isExtensionAvailable("GL_EXT_texture3D");
        this.field5624 = this.field5435.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field5622 = this.field5435.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field5532 = this.field5435.isExtensionAvailable("GL_ARB_texture_float");
        this.field5591 = false;
        this.field5529 = this.field5435.isExtensionAvailable("GL_EXT_framebuffer_object");
        this.field5565 = this.field5435.isExtensionAvailable("GL_EXT_framebuffer_blit");
        this.field5569 = this.field5435.isExtensionAvailable("GL_EXT_framebuffer_multisample");
        this.field5634 = this.field5565 & this.field5569;
        return ~var2 == -1 ? 0 : var2;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lu;)V")
    public final void method276(class53 arg0) {
        this.field5499 = ((class317) arg0).field4046;
        ++field5321;
        if (this.field5598 == null) {
            class498 var2 = new class498(80);
            if (this.field5593) {
                var2.method3004(255, -1.0F);
                var2.method3004(255, -1.0F);
                var2.method3004(255, 0.0F);
                var2.method3004(255, 0.0F);
                var2.method3004(255, 1.0F);
                var2.method3004(255, 1.0F);
                var2.method3004(255, -1.0F);
                var2.method3004(255, 0.0F);
                var2.method3004(255, 1.0F);
                var2.method3004(255, 1.0F);
                var2.method3004(255, 1.0F);
                var2.method3004(255, 1.0F);
                var2.method3004(255, 0.0F);
                var2.method3004(255, 1.0F);
                var2.method3004(255, 0.0F);
                var2.method3004(255, -1.0F);
                var2.method3004(255, 1.0F);
                var2.method3004(255, 0.0F);
                var2.method3004(255, 0.0F);
                var2.method3004(255, 0.0F);
            } else {
                var2.method3003(-1.0F, -51);
                var2.method3003(-1.0F, -51);
                var2.method3003(0.0F, -51);
                var2.method3003(0.0F, -51);
                var2.method3003(1.0F, -51);
                var2.method3003(1.0F, -51);
                var2.method3003(-1.0F, -51);
                var2.method3003(0.0F, -51);
                var2.method3003(1.0F, -51);
                var2.method3003(1.0F, -51);
                var2.method3003(1.0F, -51);
                var2.method3003(1.0F, -51);
                var2.method3003(0.0F, -51);
                var2.method3003(1.0F, -51);
                var2.method3003(0.0F, -51);
                var2.method3003(-1.0F, -51);
                var2.method3003(1.0F, -51);
                var2.method3003(0.0F, -51);
                var2.method3003(0.0F, -51);
                var2.method3003(0.0F, -51);
            }
            this.field5598 = this.method2269(false, (byte) -2, var2.field6631, 20, var2.field6618);
            this.field5541 = new class460(this.field5598, 5126, 3, 0);
            this.field5592 = new class460(this.field5598, 5126, 2, 12);
            this.field5489.method1975(this, 4);
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public final void method285(int arg0) {
        this.method2306((byte) -112);
        ++field5373;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lqv;Z)Ll;")
    public final class16 method345(class311 arg0, boolean arg1) {
        ++field5348;
        int[] var3 = new int[arg0.field3980 * arg0.field3974];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field3977 == null) {
            for (int var6 = 0; ~var6 > ~arg0.field3980; ++var6) {
                for (int var7 = 0; arg0.field3974 > var7; ++var7) {
                    int var8 = arg0.field3981[arg0.field3979[var4++] & 255];
                    var3[var5++] = ~var8 != -1 ? class215.method1323(var8, -16777216) : 0;
                }
            }
        } else {
            for (int var9 = 0; var9 < arg0.field3980; ++var9) {
                for (int var11 = 0; ~arg0.field3974 < ~var11; ++var11) {
                    var3[var5++] = class215.method1323(arg0.field3981[class378.method2145(255, arg0.field3979[var4])], arg0.field3977[var4] << 24);
                    ++var4;
                }
            }
        }
        class16 var10 = this.method299(var3, 0, arg0.field3974, arg0.field3974, arg0.field3980);
        var10.method133(arg0.field3976, arg0.field3978, arg0.field3973, arg0.field3975);
        return var10;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(IIIIII)Lkc;")
    public final class87 method292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5451;
        return this.field5622 ? new class475(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "()V")
    public final void method272() {
        ++field5436;
        this.field5487.method2485(false);
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "()V")
    public final void method318() {
        ++field5463;
        this.field5583 = this.field5352;
        this.field5577 = 0;
        this.field5526 = this.field5363;
        this.field5614 = 0;
        OpenGL.glDisable(3089);
        this.method2277(-100);
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(BI)I")
    public final int method2346(byte arg0, int arg1) {
        int var3 = 123 % ((arg0 - 56) / 48);
        ++field5315;
        if (~arg1 != -5122 && ~arg1 != -5121) {
            if (arg1 != 5123 && ~arg1 != -5123) {
                if (~arg1 != -5126 && ~arg1 != -5125 && arg1 != 5126) {
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

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(IZ)I")
    public final int method2347(int arg0, boolean arg1) {
        ++field5421;
        if (arg0 != 1) {
            if (~arg0 != -1) {
                if (arg0 == 2) {
                    return 34165;
                } else if (arg0 == 3) {
                    return 260;
                } else if (arg0 == 4) {
                    return 34023;
                } else {
                    if (!arg1) {
                        this.field5464 = null;
                    }
                    throw new IllegalArgumentException();
                }
            } else {
                return 8448;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
    public final void method336(int arg0) {
        ++field5396;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Llc;I)V")
    public final void method2348(class459 arg0, int arg1) {
        int var3 = -111 % ((arg1 - 92) / 32);
        ++field5375;
        if (this.field5555 != arg0) {
            if (this.field5542) {
                OpenGL.glBindBufferARB(34962, arg0.method974(27847));
            }
            this.field5555 = arg0;
        }
    }

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "(I)V")
    public final void method325(int arg0) {
        ++field5466;
        this.method2290(true, 0);
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "()Z")
    public final boolean method316() {
        ++field5357;
        return true;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lkc;)V")
    public final void method294(class87 arg0) {
        ++field5467;
        this.field5639 = (class384) arg0;
    }

    @OriginalMember(owner = "client!ug", name = "fa", descriptor = "(IIII)V")
    public final void method334(int arg0, int arg1, int arg2, int arg3) {
        ++field5414;
        if (this.field5583 > arg3) {
            this.field5583 = arg3;
        }
        if (this.field5526 > arg2) {
            this.field5526 = arg2;
        }
        if (arg1 > this.field5577) {
            this.field5577 = arg1;
        }
        if (~this.field5614 > ~arg0) {
            this.field5614 = arg0;
        }
        OpenGL.glEnable(3089);
        this.method2277(-103);
        this.method2309((byte) 22);
    }

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "()V")
    public final void method313() {
        ++field5468;
        if (this.field5612 && this.field5363 > 0 && ~this.field5352 < -1) {
            int var1 = this.field5614;
            int var2 = this.field5526;
            int var3 = this.field5577;
            int var4 = this.field5583;
            this.method318();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2333((byte) 72);
            this.method2344(-58, false);
            this.method2325((byte) 124, false);
            this.method2311(false, (byte) 102);
            this.method2337(false, -125);
            this.method2322((class119) null, 14);
            this.method2349((byte) 112, -2);
            this.method2305(7681, 1);
            this.method2290(true, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field5363, this.field5352, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method330(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(BI)V")
    public final void method2349(byte arg0, int arg1) {
        ++field5434;
        int var3 = 3 / ((arg0 - -55) / 36);
        this.method2307(-66, true, arg1);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZLjaggl/memory/NativeBuffer;III)Llc;")
    public final class459 method2350(boolean arg0, NativeBuffer arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -1) {
            return null;
        } else {
            ++field5440;
            return (class459) (!this.field5542 || arg0 && !this.field5582 ? new class145(this, arg3, arg1) : new class527(this, arg3, arg1, arg4, arg0));
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(IIIIII)V")
    public final void method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5456;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method2310(-97);
        this.method2290(true, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field5586) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field5586) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)I")
    public final int method307(int arg0, int arg1) {
        ++field5304;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIILma;II)V")
    public final void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8) {
        ++field5365;
        class195 var10 = (class195) arg6;
        class322 var11 = var10.field2521;
        this.method2318(-20334);
        this.method2322(var10.field2521, 14);
        this.method2290(true, arg5);
        this.method2271(-115, 7681, 8448);
        this.method2338(34167, 0, false, 768);
        float var12 = var11.field4080 / (float) var11.field4084;
        float var13 = var11.field4082 / (float) var11.field4089;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method2338(5890, 0, false, 768);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lkm;B)V")
    public final void method2351(class237 arg0, byte arg1) {
        ++field5327;
        OpenGL.glLoadMatrixf(arg0.method1427(-125), 0);
        if (arg1 < 101) {
            this.field5629 = 90;
        }
    }
}
