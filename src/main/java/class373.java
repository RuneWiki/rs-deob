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

@OriginalClass("client!wu")
public abstract class class373 extends class60 {

    @OriginalMember(owner = "client!wu", name = "ad", descriptor = "Lada;")
    private class164 field5483 = new class164();

    @OriginalMember(owner = "client!wu", name = "ee", descriptor = "Z")
    public boolean field5539 = true;

    @OriginalMember(owner = "client!wu", name = "be", descriptor = "Ljc;")
    public class441 field5536 = new class441();

    @OriginalMember(owner = "client!wu", name = "he", descriptor = "Ljc;")
    public class441 field5542 = new class441();

    @OriginalMember(owner = "client!wu", name = "ie", descriptor = "Ljc;")
    public class441 field5543 = new class441();

    @OriginalMember(owner = "client!wu", name = "ke", descriptor = "Ljc;")
    public class441 field5545 = new class441();

    @OriginalMember(owner = "client!wu", name = "me", descriptor = "Ljc;")
    private class441 field5547 = new class441();

    @OriginalMember(owner = "client!wu", name = "pe", descriptor = "Ljc;")
    private class441 field5550 = new class441();

    @OriginalMember(owner = "client!wu", name = "qe", descriptor = "I")
    public int field5551 = 3;

    @OriginalMember(owner = "client!wu", name = "Ge", descriptor = "I")
    public int field5567 = 128;

    @OriginalMember(owner = "client!wu", name = "ze", descriptor = "F")
    public float field5560 = 3584.0F;

    @OriginalMember(owner = "client!wu", name = "He", descriptor = "Z")
    public boolean field5568 = false;

    @OriginalMember(owner = "client!wu", name = "Pe", descriptor = "F")
    public float field5576 = 1.0F;

    @OriginalMember(owner = "client!wu", name = "Se", descriptor = "[Lnia;")
    private class648[] field5579 = new class648[10];

    @OriginalMember(owner = "client!wu", name = "Oe", descriptor = "F")
    public float field5575 = 1.0F;

    @OriginalMember(owner = "client!wu", name = "Ae", descriptor = "I")
    public int field5561 = 512;

    @OriginalMember(owner = "client!wu", name = "we", descriptor = "Ljg;")
    public class340 field5557 = class547.field7811;

    @OriginalMember(owner = "client!wu", name = "Ke", descriptor = "I")
    public int field5571 = 512;

    @OriginalMember(owner = "client!wu", name = "Ue", descriptor = "Z")
    private boolean field5581 = false;

    @OriginalMember(owner = "client!wu", name = "Ze", descriptor = "Z")
    private boolean field5586 = false;

    @OriginalMember(owner = "client!wu", name = "ve", descriptor = "[F")
    private float[] field5556 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!wu", name = "Re", descriptor = "Z")
    public boolean field5578 = false;

    @OriginalMember(owner = "client!wu", name = "kf", descriptor = "I")
    public int field5596 = 3584;

    @OriginalMember(owner = "client!wu", name = "hf", descriptor = "Z")
    public boolean field5594 = false;

    @OriginalMember(owner = "client!wu", name = "xe", descriptor = "I")
    public int field5558 = 0;

    @OriginalMember(owner = "client!wu", name = "ff", descriptor = "[F")
    private float[] field5592 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!wu", name = "of", descriptor = "I")
    public int field5600 = 50;

    @OriginalMember(owner = "client!wu", name = "Ie", descriptor = "Z")
    public boolean field5569 = false;

    @OriginalMember(owner = "client!wu", name = "mf", descriptor = "[F")
    public float[] field5598 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!wu", name = "uf", descriptor = "Z")
    public boolean field5606 = true;

    @OriginalMember(owner = "client!wu", name = "qf", descriptor = "F")
    public float field5602 = 1.0F;

    @OriginalMember(owner = "client!wu", name = "ye", descriptor = "I")
    private int field5559 = 0;

    @OriginalMember(owner = "client!wu", name = "wf", descriptor = "Z")
    public boolean field5608 = true;

    @OriginalMember(owner = "client!wu", name = "Xe", descriptor = "I")
    private int field5584 = 16777215;

    @OriginalMember(owner = "client!wu", name = "Le", descriptor = "I")
    public int field5572 = 0;

    @OriginalMember(owner = "client!wu", name = "Be", descriptor = "I")
    private int field5562 = 0;

    @OriginalMember(owner = "client!wu", name = "af", descriptor = "F")
    private float field5587 = 1.0F;

    @OriginalMember(owner = "client!wu", name = "Me", descriptor = "I")
    private int field5573 = -1;

    @OriginalMember(owner = "client!wu", name = "Jf", descriptor = "I")
    public int field5621 = 0;

    @OriginalMember(owner = "client!wu", name = "xf", descriptor = "I")
    private int field5609 = -1;

    @OriginalMember(owner = "client!wu", name = "rf", descriptor = "Z")
    public boolean field5603 = true;

    @OriginalMember(owner = "client!wu", name = "Te", descriptor = "I")
    public int field5580 = 0;

    @OriginalMember(owner = "client!wu", name = "Bf", descriptor = "I")
    public int field5613 = 0;

    @OriginalMember(owner = "client!wu", name = "Sf", descriptor = "I")
    public int field5630 = 0;

    @OriginalMember(owner = "client!wu", name = "lf", descriptor = "I")
    public int field5597 = 8;

    @OriginalMember(owner = "client!wu", name = "nf", descriptor = "Z")
    private boolean field5599 = false;

    @OriginalMember(owner = "client!wu", name = "If", descriptor = "I")
    public int field5620 = -1;

    @OriginalMember(owner = "client!wu", name = "Af", descriptor = "F")
    public float field5612 = -1.0F;

    @OriginalMember(owner = "client!wu", name = "Zf", descriptor = "I")
    public int field5637 = -1;

    @OriginalMember(owner = "client!wu", name = "gf", descriptor = "Lwq;")
    public class168 field5593 = class77.field1069;

    @OriginalMember(owner = "client!wu", name = "Lf", descriptor = "I")
    private int field5623 = 1;

    @OriginalMember(owner = "client!wu", name = "bf", descriptor = "I")
    public int field5588 = 0;

    @OriginalMember(owner = "client!wu", name = "Ye", descriptor = "Z")
    private boolean field5585 = false;

    @OriginalMember(owner = "client!wu", name = "Ee", descriptor = "[F")
    private float[] field5565 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!wu", name = "bg", descriptor = "F")
    public float field5639 = 1.0F;

    @OriginalMember(owner = "client!wu", name = "Kf", descriptor = "I")
    private int field5622 = -1;

    @OriginalMember(owner = "client!wu", name = "Ff", descriptor = "[F")
    public float[] field5617 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!wu", name = "jf", descriptor = "Z")
    public boolean field5595 = true;

    @OriginalMember(owner = "client!wu", name = "Nf", descriptor = "[F")
    private float[] field5625 = new float[16];

    @OriginalMember(owner = "client!wu", name = "Of", descriptor = "I")
    public int field5626 = 0;

    @OriginalMember(owner = "client!wu", name = "Wf", descriptor = "I")
    private int field5634 = 0;

    @OriginalMember(owner = "client!wu", name = "sf", descriptor = "F")
    public float field5604 = 3584.0F;

    @OriginalMember(owner = "client!wu", name = "ef", descriptor = "I")
    private int field5591 = 0;

    @OriginalMember(owner = "client!wu", name = "dg", descriptor = "[F")
    private float[] field5641 = new float[16];

    @OriginalMember(owner = "client!wu", name = "Mf", descriptor = "Z")
    private boolean field5624 = false;

    @OriginalMember(owner = "client!wu", name = "gg", descriptor = "F")
    public float field5644 = -1.0F;

    @OriginalMember(owner = "client!wu", name = "cg", descriptor = "Z")
    private boolean field5640 = false;

    @OriginalMember(owner = "client!wu", name = "Hf", descriptor = "[F")
    private float[] field5619 = new float[16];

    @OriginalMember(owner = "client!wu", name = "fg", descriptor = "[F")
    public float[] field5643 = this.field5556;

    @OriginalMember(owner = "client!wu", name = "eg", descriptor = "I")
    public int field5642 = 0;

    @OriginalMember(owner = "client!wu", name = "Cf", descriptor = "I")
    public int field5614 = 0;

    @OriginalMember(owner = "client!wu", name = "mg", descriptor = "Z")
    public boolean field5650 = true;

    @OriginalMember(owner = "client!wu", name = "De", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5564 = new Stream();

    @OriginalMember(owner = "client!wu", name = "Ig", descriptor = "Ljc;")
    private class441 field5672 = new class441();

    @OriginalMember(owner = "client!wu", name = "Tc", descriptor = "Ljava/lang/Object;")
    public Object field5476;

    @OriginalMember(owner = "client!wu", name = "Kd", descriptor = "Ljava/lang/Object;")
    private Object field5519;

    @OriginalMember(owner = "client!wu", name = "I", descriptor = "Ljava/awt/Canvas;")
    public Canvas field5361;

    @OriginalMember(owner = "client!wu", name = "ld", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5494;

    @OriginalMember(owner = "client!wu", name = "kg", descriptor = "I")
    public int field5648;

    @OriginalMember(owner = "client!wu", name = "hb", descriptor = "Lvd;")
    public class39 field5386;

    @OriginalMember(owner = "client!wu", name = "ab", descriptor = "I")
    private int field5379;

    @OriginalMember(owner = "client!wu", name = "td", descriptor = "I")
    public int field5502;

    @OriginalMember(owner = "client!wu", name = "Rf", descriptor = "I")
    public int field5629;

    @OriginalMember(owner = "client!wu", name = "G", descriptor = "I")
    private int field5359;

    @OriginalMember(owner = "client!wu", name = "Cb", descriptor = "I")
    public int field5407;

    @OriginalMember(owner = "client!wu", name = "B", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field5354;

    @OriginalMember(owner = "client!wu", name = "te", descriptor = "Leo;")
    private class297 field5554;

    @OriginalMember(owner = "client!wu", name = "lc", descriptor = "I")
    public static int field5442 = class181.method1280(1600, 82);

    @OriginalMember(owner = "client!wu", name = "Zd", descriptor = "Lqe;")
    public static class469 field5534 = new class469(61, -1);

    @OriginalMember(owner = "client!wu", name = "ge", descriptor = "[I")
    public static int[] field5541 = new int[14];

    @OriginalMember(owner = "client!wu", name = "fe", descriptor = "Lqe;")
    public static class469 field5540 = new class469(97, 6);

    @OriginalMember(owner = "client!wu", name = "le", descriptor = "[Leia;")
    public static class243[] field5546 = new class243[5];

    @OriginalMember(owner = "client!wu", name = "oe", descriptor = "[I")
    public static int[] field5549;

    @OriginalMember(owner = "client!wu", name = "ne", descriptor = "[I")
    public static int[] field5548;

    @OriginalMember(owner = "client!wu", name = "og", descriptor = "Lqg;")
    public static class464 field5652;

    @OriginalMember(owner = "client!wu", name = "Ce", descriptor = "F")
    public float field5563;

    @OriginalMember(owner = "client!wu", name = "Ve", descriptor = "F")
    private float field5582;

    @OriginalMember(owner = "client!wu", name = "Df", descriptor = "F")
    public float field5615;

    @OriginalMember(owner = "client!wu", name = "Gf", descriptor = "F")
    public float field5618;

    @OriginalMember(owner = "client!wu", name = "Pf", descriptor = "F")
    public float field5627;

    @OriginalMember(owner = "client!wu", name = "Uf", descriptor = "F")
    public float field5632;

    @OriginalMember(owner = "client!wu", name = "ag", descriptor = "F")
    public float field5638;

    @OriginalMember(owner = "client!wu", name = "ig", descriptor = "F")
    private float field5646;

    @OriginalMember(owner = "client!wu", name = "w", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!wu", name = "x", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!wu", name = "y", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!wu", name = "A", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!wu", name = "C", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!wu", name = "E", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!wu", name = "F", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!wu", name = "H", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!wu", name = "J", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!wu", name = "K", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!wu", name = "L", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!wu", name = "M", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!wu", name = "N", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!wu", name = "O", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!wu", name = "P", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!wu", name = "Q", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!wu", name = "R", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!wu", name = "S", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!wu", name = "U", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!wu", name = "V", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!wu", name = "W", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!wu", name = "X", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!wu", name = "Y", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!wu", name = "Z", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!wu", name = "bb", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!wu", name = "cb", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!wu", name = "db", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!wu", name = "eb", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!wu", name = "fb", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!wu", name = "gb", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!wu", name = "ib", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!wu", name = "jb", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!wu", name = "kb", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!wu", name = "lb", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!wu", name = "mb", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!wu", name = "nb", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!wu", name = "ob", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!wu", name = "pb", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!wu", name = "qb", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!wu", name = "rb", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!wu", name = "sb", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!wu", name = "tb", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!wu", name = "ub", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!wu", name = "vb", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!wu", name = "wb", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!wu", name = "xb", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!wu", name = "yb", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!wu", name = "zb", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!wu", name = "Ab", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!wu", name = "Bb", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!wu", name = "Db", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!wu", name = "Eb", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!wu", name = "Fb", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!wu", name = "Gb", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!wu", name = "Hb", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!wu", name = "Ib", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!wu", name = "Jb", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!wu", name = "Kb", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!wu", name = "Lb", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!wu", name = "Mb", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!wu", name = "Nb", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!wu", name = "Ob", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!wu", name = "Pb", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!wu", name = "Qb", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!wu", name = "Rb", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!wu", name = "Sb", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!wu", name = "Tb", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!wu", name = "Ub", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!wu", name = "Vb", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!wu", name = "Wb", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!wu", name = "Xb", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!wu", name = "Yb", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!wu", name = "Zb", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!wu", name = "ac", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!wu", name = "bc", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!wu", name = "cc", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!wu", name = "dc", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!wu", name = "ec", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!wu", name = "fc", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!wu", name = "gc", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!wu", name = "hc", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!wu", name = "ic", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!wu", name = "jc", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!wu", name = "kc", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!wu", name = "mc", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!wu", name = "nc", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!wu", name = "oc", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!wu", name = "pc", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!wu", name = "qc", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!wu", name = "rc", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!wu", name = "sc", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!wu", name = "tc", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!wu", name = "uc", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!wu", name = "vc", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!wu", name = "wc", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!wu", name = "xc", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!wu", name = "yc", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!wu", name = "zc", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!wu", name = "Ac", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!wu", name = "Bc", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!wu", name = "Cc", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!wu", name = "Dc", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!wu", name = "Ec", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!wu", name = "Fc", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!wu", name = "Gc", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!wu", name = "Hc", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!wu", name = "Ic", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!wu", name = "Jc", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!wu", name = "Kc", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!wu", name = "Lc", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!wu", name = "Mc", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!wu", name = "Nc", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!wu", name = "Oc", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!wu", name = "Pc", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!wu", name = "Qc", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!wu", name = "Sc", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!wu", name = "Uc", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!wu", name = "Vc", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!wu", name = "Wc", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!wu", name = "Xc", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!wu", name = "Yc", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!wu", name = "Zc", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!wu", name = "bd", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!wu", name = "cd", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!wu", name = "dd", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!wu", name = "ed", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!wu", name = "fd", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!wu", name = "gd", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!wu", name = "hd", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!wu", name = "id", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!wu", name = "jd", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!wu", name = "kd", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!wu", name = "md", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!wu", name = "nd", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!wu", name = "od", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!wu", name = "pd", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!wu", name = "qd", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!wu", name = "rd", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!wu", name = "sd", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!wu", name = "ud", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!wu", name = "vd", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!wu", name = "wd", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!wu", name = "xd", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!wu", name = "yd", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!wu", name = "zd", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!wu", name = "Ad", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!wu", name = "Bd", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!wu", name = "Cd", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!wu", name = "Dd", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!wu", name = "Ed", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!wu", name = "Fd", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!wu", name = "Gd", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!wu", name = "Hd", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!wu", name = "Jd", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!wu", name = "Ld", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!wu", name = "Md", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!wu", name = "Nd", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!wu", name = "Od", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!wu", name = "Pd", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!wu", name = "Qd", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!wu", name = "Rd", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!wu", name = "Sd", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!wu", name = "Td", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!wu", name = "Ud", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!wu", name = "Vd", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!wu", name = "Wd", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!wu", name = "Xd", descriptor = "I")
    public int field5532;

    @OriginalMember(owner = "client!wu", name = "Yd", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!wu", name = "ae", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!wu", name = "ce", descriptor = "I")
    public int field5537;

    @OriginalMember(owner = "client!wu", name = "de", descriptor = "I")
    public int field5538;

    @OriginalMember(owner = "client!wu", name = "re", descriptor = "I")
    public int field5552;

    @OriginalMember(owner = "client!wu", name = "se", descriptor = "I")
    public int field5553;

    @OriginalMember(owner = "client!wu", name = "Ne", descriptor = "I")
    private int field5574;

    @OriginalMember(owner = "client!wu", name = "Qe", descriptor = "I")
    public int field5577;

    @OriginalMember(owner = "client!wu", name = "pf", descriptor = "I")
    public int field5601;

    @OriginalMember(owner = "client!wu", name = "zf", descriptor = "I")
    public int field5611;

    @OriginalMember(owner = "client!wu", name = "Qf", descriptor = "I")
    public int field5628;

    @OriginalMember(owner = "client!wu", name = "Xf", descriptor = "I")
    public int field5635;

    @OriginalMember(owner = "client!wu", name = "jg", descriptor = "I")
    private int field5647;

    @OriginalMember(owner = "client!wu", name = "lg", descriptor = "I")
    public int field5649;

    @OriginalMember(owner = "client!wu", name = "Lg", descriptor = "I")
    private int field5675;

    @OriginalMember(owner = "client!wu", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!wu", name = "ug", descriptor = "Ljf;")
    private class216 field5658;

    @OriginalMember(owner = "client!wu", name = "hg", descriptor = "Lkea;")
    private class239 field5645;

    @OriginalMember(owner = "client!wu", name = "qg", descriptor = "Lsr;")
    public class254 field5654;

    @OriginalMember(owner = "client!wu", name = "wg", descriptor = "Lsr;")
    public class254 field5660;

    @OriginalMember(owner = "client!wu", name = "xg", descriptor = "Lsr;")
    public class254 field5661;

    @OriginalMember(owner = "client!wu", name = "Cg", descriptor = "Lsr;")
    public class254 field5666;

    @OriginalMember(owner = "client!wu", name = "Fg", descriptor = "Lsr;")
    private class254 field5669;

    @OriginalMember(owner = "client!wu", name = "Hg", descriptor = "Lsr;")
    private class254 field5671;

    @OriginalMember(owner = "client!wu", name = "Kg", descriptor = "Lsr;")
    private class254 field5674;

    @OriginalMember(owner = "client!wu", name = "ng", descriptor = "Lbv;")
    private class307 field5651;

    @OriginalMember(owner = "client!wu", name = "D", descriptor = "Lpba;")
    public class333 field5356;

    @OriginalMember(owner = "client!wu", name = "tg", descriptor = "Lll;")
    private class366 field5657;

    @OriginalMember(owner = "client!wu", name = "yg", descriptor = "Lll;")
    private class366 field5662;

    @OriginalMember(owner = "client!wu", name = "Bg", descriptor = "Lll;")
    private class366 field5665;

    @OriginalMember(owner = "client!wu", name = "je", descriptor = "Lvd;")
    public static class39 field5544;

    @OriginalMember(owner = "client!wu", name = "Tf", descriptor = "Lnia;")
    private class648 field5631;

    @OriginalMember(owner = "client!wu", name = "We", descriptor = "Lbca;")
    public class663 field5583;

    @OriginalMember(owner = "client!wu", name = "pg", descriptor = "Lic;")
    public class701 field5653;

    @OriginalMember(owner = "client!wu", name = "rg", descriptor = "Lic;")
    public class701 field5655;

    @OriginalMember(owner = "client!wu", name = "sg", descriptor = "Lic;")
    public class701 field5656;

    @OriginalMember(owner = "client!wu", name = "vg", descriptor = "Lic;")
    public class701 field5659;

    @OriginalMember(owner = "client!wu", name = "zg", descriptor = "Lic;")
    public class701 field5663;

    @OriginalMember(owner = "client!wu", name = "Ag", descriptor = "Lic;")
    public class701 field5664;

    @OriginalMember(owner = "client!wu", name = "Dg", descriptor = "Lic;")
    public class701 field5667;

    @OriginalMember(owner = "client!wu", name = "Eg", descriptor = "Lic;")
    public class701 field5668;

    @OriginalMember(owner = "client!wu", name = "Gg", descriptor = "Lic;")
    public class701 field5670;

    @OriginalMember(owner = "client!wu", name = "Jg", descriptor = "Lic;")
    public class701 field5673;

    @OriginalMember(owner = "client!wu", name = "Rc", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field5474;

    @OriginalMember(owner = "client!wu", name = "Id", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field5517;

    @OriginalMember(owner = "client!wu", name = "T", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field5372;

    @OriginalMember(owner = "client!wu", name = "Je", descriptor = "Z")
    public boolean field5570;

    @OriginalMember(owner = "client!wu", name = "tf", descriptor = "Z")
    public boolean field5605;

    @OriginalMember(owner = "client!wu", name = "vf", descriptor = "Z")
    public boolean field5607;

    @OriginalMember(owner = "client!wu", name = "yf", descriptor = "Z")
    public boolean field5610;

    @OriginalMember(owner = "client!wu", name = "Ef", descriptor = "Z")
    public boolean field5616;

    @OriginalMember(owner = "client!wu", name = "Mg", descriptor = "Z")
    public boolean field5676;

    @OriginalMember(owner = "client!wu", name = "ue", descriptor = "[Lpha;")
    public class165[] field5555;

    @OriginalMember(owner = "client!wu", name = "Vf", descriptor = "[Lpha;")
    public class165[] field5633;

    @OriginalMember(owner = "client!wu", name = "cf", descriptor = "[Lwl;")
    public class410[] field5589;

    @OriginalMember(owner = "client!wu", name = "Yf", descriptor = "[Ljc;")
    public class441[] field5636;

    @OriginalMember(owner = "client!wu", name = "Fe", descriptor = "[Lraa;")
    public class609[] field5566;

    @OriginalMember(owner = "client!wu", name = "df", descriptor = "[Lbca;")
    private class663[] field5590;

    static {
        for (int var0 = 0; ~var0 > ~field5546.length; ++var0) {
            field5546[var0] = new class243();
        }
        field5549 = new int[16384];
        field5548 = new int[16384];
        double var1 = 3.834951969714103E-4D;
        for (int var3 = 0; var3 < 16384; ++var3) {
            field5548[var3] = (int) (Math.sin((double) var3 * var1) * 16384.0D);
            field5549[var3] = (int) (Math.cos((double) var3 * var1) * 16384.0D);
        }
        field5652 = new class464("stellardawn", 1);
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(B)[F", line = 4)
    public final float[] method2290(byte arg0) {
        ++field5465;
        return arg0 != 60 ? null : this.field5556;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lwl;I)V", line = 15)
    public final void method2291(class410 arg0, int arg1) {
        ++field5490;
        int var3 = -71 % ((arg1 - -42) / 60);
        this.field5589[this.field5558] = arg0;
        this.method2335((byte) 44);
    }

    @OriginalMember(owner = "client!wu", name = "A", descriptor = "(ILaa;II)V", line = 31)
    public final void method435(int arg0, class488 arg1, int arg2, int arg3) {
        ++field5485;
        class660 var5 = (class660) arg1;
        class465 var6 = var5.field9238;
        this.method2306(-14571);
        this.method2294(var6, -2);
        this.method2405(1, 118);
        this.method2300(class499.field7099, class499.field7099, 0);
        this.method2329(0, (byte) -125, class469.field6850);
        this.method2415(arg0, 0);
        this.field5536.method2720((float) this.field5407, 0.0F, 0, (float) this.field5502);
        this.method2406(true);
        this.field5636[0].method2720(var6.method1263((byte) 109, (float) this.field5407), 1.0F, 0, var6.method1273((float) this.field5502, -116));
        this.field5636[0].method2725((byte) -125, var6.method1263((byte) 109, (float) (-arg2)), var6.method1273((float) (-arg3), -110), 0.0F);
        this.field5589[0] = class127.field1688;
        this.method2335((byte) 8);
        this.method2422(-25804);
        this.method2410(-1);
        this.method2329(0, (byte) -128, class331.field4759);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(FI)V", line = 57)
    public final void method2293(float arg0, int arg1) {
        if (arg1 > 45) {
            ++field5472;
            if (this.field5587 != arg0) {
                this.field5587 = arg0;
                this.method2401(3);
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "M", descriptor = "()I", line = 74)
    public final int method508() {
        ++field5375;
        return this.field5675;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lbca;I)V", line = 82)
    public final void method2294(class663 arg0, int arg1) {
        if (this.field5590[this.field5558] != arg0) {
            this.field5590[this.field5558] = arg0;
            if (arg0 != null) {
                arg0.method1335(193);
            } else {
                this.method2381((byte) 34);
            }
            this.field5647 &= -2;
        }
        ++field5374;
        if (arg1 != -2) {
            this.method491(116, 108);
        }
    }

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "(I)V", line = 107)
    private final void method2296(int arg0) {
        if (arg0 == 9) {
            ++field5422;
            this.field5599 = false;
            if (class529.field7544 == this.field5557) {
                this.method2307(true);
                this.method2400(false);
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(B)V", line = 127)
    public void method2297(byte arg0) {
        ++field5462;
        this.field5601 = this.field5553;
        this.field5553 = 0;
        if (arg0 > -5) {
            this.field5648 = 98;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BZ)V", line = 140)
    public final void method2298(byte arg0, boolean arg1) {
        if (arg1 == !this.field5568) {
            this.field5568 = arg1;
            this.method2421((byte) 104);
            this.field5647 &= -32;
        }
        if (arg0 != -88) {
            this.method495(86);
        }
        ++field5525;
    }

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "(I)Ljc;", line = 158)
    public final class441 method2299(int arg0) {
        ++field5390;
        if (arg0 != -25498) {
            this.field5537 = -33;
        }
        return this.field5636[this.field5558];
    }

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "()I", line = 169)
    public final int method457() {
        ++field5508;
        return this.field5600;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lpha;Lpha;I)V", line = 177)
    public final void method2300(class165 arg0, class165 arg1, int arg2) {
        ++field5499;
        boolean var4 = false;
        if (this.field5555[this.field5558] != arg1) {
            this.field5555[this.field5558] = arg1;
            var4 = true;
            this.method2320(0);
        }
        if (this.field5633[this.field5558] != arg0) {
            this.field5633[this.field5558] = arg0;
            this.method2397((byte) 86);
            var4 = true;
        }
        if (arg2 != 0) {
            this.method2397((byte) -38);
        }
        if (var4) {
            this.field5647 &= -30;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lom;)V", line = 214)
    public final void method440(class374 arg0) {
        this.field5645 = (class239) arg0;
        ++field5415;
    }

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "(B)Lpf;", line = 223)
    public final class584 method2303(byte arg0) {
        if (arg0 < 111) {
            return null;
        } else {
            ++field5473;
            return this.field5645 == null ? null : this.field5645.method1582((byte) 110);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIZ)Lpga;", line = 234)
    public final class536 method493(int arg0, int arg1, boolean arg2) {
        ++field5388;
        return new class224(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "(II)I", line = 243)
    public static final int method2304(int arg0, int arg1) {
        ++field5414;
        if (arg1 <= 62) {
            field5541 = null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "()I", line = 254)
    public final int method433() {
        ++field5429;
        return this.field5577 + -2;
    }

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "(B)V", line = 263)
    private final void method2305(byte arg0) {
        this.field5632 = (float) (-this.field5572 + this.field5642);
        this.field5618 = (float) (-this.field5572 + this.field5630);
        this.field5563 = (float) (this.field5580 - this.field5588);
        ++field5469;
        if (arg0 != 61) {
            this.field5605 = false;
        }
        this.field5615 = (float) (-this.field5588 + this.field5614);
    }

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "(I)V", line = 277)
    public final void method2306(int arg0) {
        ++field5432;
        if (this.field5647 != 2) {
            this.method2349(120);
            this.method2402(false, (byte) -124);
            this.method2336(0, false);
            this.method2298((byte) -88, false);
            this.method2394(false, (byte) 11);
            this.method2398(false, false, false, -2);
            this.field5647 = 2;
        }
        if (arg0 != -14571) {
            this.method2309(126);
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V", line = 299)
    public final void method468(int arg0) {
        ++field5475;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II[I[I)Laa;", line = 310)
    public final class488 method521(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field5401;
        return class183.method1294(arg3, arg1, arg2, this, arg0, (byte) -1);
    }

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "(Z)V", line = 318)
    private final void method2307(boolean arg0) {
        ++field5449;
        if (!this.field5599) {
            float[] var2 = this.field5641;
            this.field5599 = true;
            if (this.field5407 != 0 && ~this.field5502 != -1) {
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[2] = 0.0F;
                var2[8] = 0.0F;
                var2[11] = 0.0F;
                var2[9] = 0.0F;
                var2[14] = 0.5F;
                var2[7] = 0.0F;
                var2[0] = 2.0F / (float) this.field5407;
                var2[3] = 0.0F;
                var2[4] = 0.0F;
                var2[12] = -1.0F;
                var2[15] = 1.0F;
                var2[13] = 1.0F;
                var2[5] = -2.0F / (float) this.field5502;
                var2[10] = 0.5F;
            } else {
                var2[4] = 0.0F;
                var2[10] = 1.0F;
                var2[14] = 0.0F;
                var2[12] = 0.0F;
                var2[3] = 0.0F;
                var2[9] = 0.0F;
                var2[13] = 0.0F;
                var2[7] = 0.0F;
                var2[5] = 1.0F;
                var2[6] = 0.0F;
                var2[15] = 1.0F;
                var2[2] = 0.0F;
                var2[1] = 0.0F;
                var2[11] = 0.0F;
                var2[8] = 0.0F;
                var2[0] = 1.0F;
            }
        }
        if (!arg0) {
            this.method2302((class290[]) null, 90);
        }
    }

    @OriginalMember(owner = "client!wu", name = "U", descriptor = "(IIIII)V", line = 375)
    public final void method497(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5358;
        this.method436(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZI)V", line = 383)
    public final void method2308(boolean arg0, int arg1) {
        if (arg1 != -1) {
            this.method418((class322) null, -56, -81, 24, 85);
        }
        if (this.field5578 == !arg0) {
            this.field5578 = arg0;
            this.method2387((byte) 126);
        }
        ++field5397;
    }

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "(I)V", line = 400)
    public final void method2309(int arg0) {
        ++field5385;
        Enumeration var2 = this.field5372.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method2326(var3, (byte) 123, this.field5372.get(var3));
        }
        this.field5662.method1284(true);
        this.field5665.method1284(true);
        this.field5657.method1284(true);
        this.field5655.method3992(-2107760402);
        this.field5673.method3992(arg0 ^ 2107740244);
        this.field5659.method3992(arg0 + -2107740108);
        this.field5663.method3992(-2107760402);
        this.field5668.method3992(-2107760402);
        this.field5651.method1939(1528288940);
        this.field5658.method1284(true);
        if (arg0 != -20294) {
            this.method469();
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "([I)V", line = 432)
    public final void method479(int[] arg0) {
        arg0[1] = this.field5502;
        ++field5383;
        arg0[0] = this.field5407;
    }

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "(II)I", line = 441)
    public final int method491(int arg0, int arg1) {
        ++field5365;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!wu", name = "EA", descriptor = "(IIII)V", line = 454)
    public final void method439(int arg0, int arg1, int arg2, int arg3) {
        ++field5369;
        if (!this.field5570) {
            throw new RuntimeException("");
        } else {
            this.field5609 = arg2;
            this.field5574 = arg0;
            this.field5622 = arg1;
            this.field5562 = arg3;
            if (this.field5585) {
                this.field5579[3].method2497(false);
                this.field5579[3].method2498(true);
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "(B)V", line = 476)
    public final void method2312(byte arg0) {
        ++field5424;
        if (arg0 >= -74) {
            this.field5600 = -111;
        }
        if (this.field5647 != 4) {
            this.method2349(107);
            this.method2402(false, (byte) -125);
            this.method2336(0, false);
            this.method2298((byte) -88, false);
            this.method2394(false, (byte) -8);
            this.method2398(false, false, false, -2);
            this.method2405(1, 126);
            this.method2353((byte) -121, 0);
            this.field5647 = 4;
        }
    }

    @OriginalMember(owner = "client!wu", name = "P", descriptor = "(IIIII)V", line = 500)
    public final void method458(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5486;
        this.method436(arg0, arg1, arg0, arg1 - -arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "()Z", line = 508)
    public final boolean method453() {
        ++field5384;
        return true;
    }

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "(Z)V", line = 520)
    private final void method2313(boolean arg0) {
        ++field5484;
        this.method2377((byte) -126);
        this.method2420(10295);
        this.method2387((byte) 126);
        this.method2297((byte) -83);
        this.method2370((byte) -117);
        this.method2341(83);
        this.method2301(124);
        this.method2421((byte) 104);
        this.method2369((byte) -126);
        this.method2374((byte) 42);
        this.method2322(0);
        this.method2414(arg0);
        this.method2351(0);
        this.method2390(-84);
        for (int var2 = this.field5635 + -1; var2 >= 0; --var2) {
            this.method2375((byte) -68, var2);
            this.method2320(0);
            this.method2397((byte) 86);
            this.method2410(-1);
        }
        this.method2423((byte) 125);
        this.method2356(-1);
        this.method2413(arg0);
        this.method2292(0);
        this.method2365((byte) -118);
    }

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "(IIIIII)Lom;", line = 568)
    public final class374 method503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5516;
        return new class715(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!wu", name = "Y", descriptor = "()[I", line = 576)
    public final int[] method434() {
        ++field5511;
        return new int[] { this.field5572, this.field5588, this.field5571, this.field5561 };
    }

    @OriginalMember(owner = "client!wu", name = "da", descriptor = "(III[I)V", line = 584)
    public final void method488(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5515;
        float var5 = this.field5542.method2717((float) arg2, (float) arg0, (float) arg1, -9555);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field5572;
            var7 = this.field5588;
        } else {
            var6 = (int) ((float) this.field5571 * this.field5542.method2732((float) arg2, (float) arg0, 0, (float) arg1) / var5);
            var7 = (int) ((float) this.field5561 * this.field5542.method2730((float) arg2, (float) arg1, 0, (float) arg0) / var5);
        }
        arg3[0] = (int) ((float) var6 + -this.field5632);
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var7 + -this.field5563);
    }

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "(B)V", line = 609)
    private final void method2316(byte arg0) {
        if (!this.field5586) {
            float[] var2 = this.field5619;
            float var3 = (float) (-this.field5572 * this.field5600) / (float) this.field5571;
            float var4 = (float) ((-this.field5572 + this.field5407) * this.field5600) / (float) this.field5571;
            float var5 = (float) (this.field5600 * this.field5588) / (float) this.field5561;
            float var6 = (float) ((-this.field5502 + this.field5588) * this.field5600) / (float) this.field5561;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field5600 * 2.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[12] = 0.0F;
                var2[13] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[10] = this.field5646 = (float) this.field5596 / (float) (-this.field5596 + this.field5600);
                var2[0] = var7 / (-var3 + var4);
                var2[14] = this.field5582 = (float) (this.field5600 * this.field5596) / (float) (-this.field5596 + this.field5600);
                var2[15] = 0.0F;
                var2[4] = 0.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[7] = 0.0F;
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[11] = -1.0F;
                var2[3] = 0.0F;
                var2[2] = 0.0F;
            } else {
                var2[10] = 1.0F;
                var2[11] = 0.0F;
                var2[0] = 1.0F;
                var2[5] = 1.0F;
                var2[9] = 0.0F;
                var2[7] = 0.0F;
                var2[8] = 0.0F;
                var2[12] = 0.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[2] = 0.0F;
                var2[13] = 0.0F;
                var2[3] = 0.0F;
                var2[15] = 1.0F;
                var2[14] = 0.0F;
                var2[4] = 0.0F;
            }
            this.method2396(false);
            this.field5586 = true;
        }
        if (arg0 >= 11) {
            ++field5463;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZZ)V", line = 677)
    public final void method2317(boolean arg0, boolean arg1) {
        if (!arg1 == this.field5603) {
            this.field5603 = arg1;
            this.method2301(81);
        }
        ++field5518;
        if (arg0) {
            this.field5673 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lof;I)V", line = 693)
    public final void method505(class624 arg0, int arg1) {
        ++field5492;
        this.field5651.method1943(this, arg1, (byte) 96, arg0);
    }

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "(I)Ljc;", line = 705)
    public final class441 method2321(int arg0) {
        if (arg0 != 0) {
            this.method2317(true, true);
        }
        ++field5489;
        return this.field5547;
    }

    @OriginalMember(owner = "client!wu", name = "E", descriptor = "()I", line = 718)
    public final int method464() {
        ++field5416;
        return this.field5538 + this.field5537 + this.field5532;
    }

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "(II)I", line = 726)
    public final int method490(int arg0, int arg1) {
        ++field5381;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!wu", name = "za", descriptor = "(IIIII)V", line = 734)
    public final void method485(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5391;
        this.method2360((byte) -110);
        this.method2415(arg3, 0);
        this.method2329(0, (byte) -126, class469.field6850);
        this.method2407(0, class469.field6850, 59);
        this.method2405(arg4, 105);
        this.field5536.method2720((float) arg2, 1.0F, 0, (float) arg2);
        this.field5536.method758(arg0, arg1, 0);
        this.method2406(true);
        this.method2332(false, (byte) -53);
        this.method2389(0, (byte) -64, this.field5657);
        this.method2368(this.field5674, (byte) 81);
        this.method2408(class299.field4249, (byte) -40, 0, 256);
        this.method2332(true, (byte) -95);
        this.method2407(0, class331.field4759, 79);
        this.method2329(0, (byte) -126, class331.field4759);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIII)V", line = 759)
    public final void method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5434;
        float var8 = (float) arg2 - (float) arg0;
        float var9 = (float) arg3 - (float) arg1;
        float var10 = 0.0F;
        float var11 = 1.0F;
        if (var8 != 0.0F || var9 != 0.0F) {
            var11 = (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
            var10 = (float) Math.atan2((double) var9, (double) var8);
        }
        this.method2360((byte) -110);
        this.method2415(arg4, 0);
        this.method2329(0, (byte) -125, class469.field6850);
        this.method2407(0, class469.field6850, 100);
        this.method2405(arg6, 98);
        this.field5536.method2720(var11, 1.0F, 0, (float) arg5);
        this.field5536.method758(0, -arg5 / 2, 0);
        this.field5536.method760(16383 & (int) ((double) var10 * 2607.5945876176133D));
        this.field5536.method758(arg0, arg1, 0);
        this.method2406(true);
        this.method2332(false, (byte) -83);
        this.method2422(-25804);
        this.method2332(true, (byte) -47);
        this.method2407(0, class331.field4759, 118);
        this.method2329(0, (byte) -124, class331.field4759);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lql;)V", line = 795)
    public final void method534(class738 arg0) {
        ++field5370;
        this.field5542 = (class441) arg0;
        this.field5545.method772(this.field5542);
        this.field5545.method2738((byte) 125);
        this.field5547.method2724((byte) -59, this.field5545);
        this.field5543.method2724((byte) -59, this.field5542);
        if (this.field5557.method2165(-7874)) {
            this.method2367((byte) 113);
        }
    }

    @OriginalMember(owner = "client!wu", name = "t", descriptor = "(I)V", line = 811)
    private final void method2323(int arg0) {
        ++field5436;
        if (arg0 <= 67) {
            this.method2300((class165) null, (class165) null, 6);
        }
        this.field5560 = (float) this.field5596;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 825)
    public final void method450(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field5364;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lof;)V", line = 835)
    public final void method523(class624 arg0) {
        this.field5651.method1943(this, -1, (byte) 96, arg0);
        ++field5478;
    }

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "(II)V", line = 852)
    public final void method528(int arg0, int arg1) {
        ++field5357;
        if (this.field5600 != arg0 || this.field5596 != arg1) {
            this.field5600 = arg0;
            this.field5596 = arg1;
            this.method2380(-6574);
            this.method2401(3);
            this.method2425(4);
        }
    }

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "(B)V", line = 869)
    public final void method2327(byte arg0) {
        if (arg0 <= -27) {
            if (class547.field7811 != this.field5557) {
                class340 var2 = this.field5557;
                this.field5557 = class547.field7811;
                if (var2.method2165(-7874)) {
                    this.method2367((byte) 91);
                }
                this.field5643 = this.field5556;
                this.field5647 &= -32;
            }
            ++field5430;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BLjc;)V", line = 892)
    public final void method2328(byte arg0, class441 arg1) {
        this.field5536.method772(arg1);
        ++field5480;
        this.field5539 = false;
        if (arg0 <= 89) {
            this.method477(-31, -118, (int[][]) null, (int[][]) null, 80, -38, 97);
        }
        this.method2344(0);
    }

    @OriginalMember(owner = "client!wu", name = "xa", descriptor = "(F)V", line = 906)
    public final void method484(float arg0) {
        ++field5396;
        if (this.field5575 != arg0) {
            this.field5575 = arg0;
            this.field5354.setAmbient(arg0);
            this.method2377((byte) 43);
            this.method2341(-126);
        }
    }

    @OriginalMember(owner = "client!wu", name = "A", descriptor = "()Z", line = 923)
    public final boolean method540() {
        ++field5471;
        return true;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IBLlf;)V", line = 933)
    public final void method2329(int arg0, byte arg1, class238 arg2) {
        ++field5371;
        this.method2340(arg2, false, arg0, false, true);
        if (arg1 >= -123) {
            this.field5637 = -89;
        }
    }

    @OriginalMember(owner = "client!wu", name = "v", descriptor = "(I)V", line = 949)
    public final void method2330(int arg0) {
        ++field5505;
        this.field5589 = new class410[this.field5635];
        this.field5633 = new class165[this.field5635];
        this.field5636 = new class441[this.field5635];
        this.field5590 = new class663[this.field5635];
        this.field5555 = new class165[this.field5635];
        for (int var2 = 0; this.field5635 > var2; ++var2) {
            this.field5633[var2] = class336.field4874;
            this.field5555[var2] = class336.field4874;
            this.field5589[var2] = class110.field1536;
            this.field5636[var2] = new class441();
        }
        this.field5566 = new class609[this.field5577 + -2];
        this.field5583 = this.method2343(class256.field3677, arg0, class752.field10511, false, 1);
        this.method445(new class21(262144));
        this.field5654 = this.method2302(new class290[] { new class290(new class369[] { class369.field5301, class369.field5311 }) }, arg0 + 13991);
        this.field5661 = this.method2302(new class290[] { new class290(new class369[] { class369.field5301, class369.field5309 }) }, 13992);
        this.field5660 = this.method2302(new class290[] { new class290(class369.field5301), new class290(class369.field5309), new class290(class369.field5311), new class290(class369.field5308) }, arg0 ^ 13993);
        this.field5666 = this.method2302(new class290[] { new class290(class369.field5301), new class290(class369.field5309), new class290(class369.field5311) }, 13992);
        this.field5656 = new class701(this, 0, 0, false, false);
        this.field5655 = new class701(this, 0, 0, true, true);
        this.field5667 = new class701(this, 0, 0, false, false);
        this.field5673 = new class701(this, 0, 0, true, true);
        this.field5670 = new class701(this, 0, 0, false, false);
        this.field5659 = new class701(this, 0, 0, true, true);
        this.field5664 = new class701(this, 0, 0, false, false);
        this.field5663 = new class701(this, 0, 0, true, true);
        this.field5653 = new class701(this, 0, 0, false, false);
        this.field5668 = new class701(this, 0, 0, true, true);
        this.field5651 = new class307(this);
        this.field5658 = this.method2362(59, true);
        this.method2363(10);
        this.field5356 = new class333(this);
        this.field5579[1] = this.method2359(1, 9827);
        this.field5579[2] = this.method2359(2, arg0 + 9826);
        this.field5579[4] = this.method2359(4, 9827);
        this.field5579[5] = this.method2359(5, 9827);
        this.field5579[6] = this.method2359(6, class513.method3033(arg0, 9826));
        this.field5579[7] = this.method2359(7, 9827);
        this.field5579[3] = this.method2359(3, 9827);
        this.field5579[8] = this.method2359(8, 9827);
        this.field5579[9] = this.method2359(9, 9827);
        if (!this.field5579[2].method1449(arg0 + 13002)) {
            this.field5579[2] = this.method2359(0, class513.method3033(arg0, 9826));
        }
        if (!this.field5579[4].method1449(13003)) {
            this.field5579[4] = this.field5579[2];
        }
        if (!this.field5579[8].method1449(13003)) {
            this.field5579[8] = this.field5579[4];
        }
        if (!this.field5579[9].method1449(arg0 ^ 13002)) {
            this.field5579[9] = this.field5579[8];
        }
        this.method2412(0);
        this.method469();
        this.method472();
    }

    @OriginalMember(owner = "client!wu", name = "C", descriptor = "(Z)V", line = 1021)
    public final void method463(boolean arg0) {
        this.field5608 = arg0;
        ++field5468;
        this.method2369((byte) -126);
    }

    @OriginalMember(owner = "client!wu", name = "JA", descriptor = "(IIIIII)I", line = 1032)
    public final int method494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5413;
        int var7 = 0;
        float var8 = (float) arg2 * this.field5542.field6541 + (float) arg0 * this.field5542.field6573 + (float) arg1 * this.field5542.field6532 + this.field5542.field6526;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field5542.field6541 + (float) arg3 * this.field5542.field6573 + (float) arg4 * this.field5542.field6532 + this.field5542.field6526;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field5600 > var8 && (float) this.field5600 > var9) {
            var7 |= 16;
        } else if (var8 > (float) this.field5596 && (float) this.field5596 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field5542.field6535 + (float) arg0 * this.field5542.field6534 + (float) arg1 * this.field5542.field6530 + this.field5542.field6568) * (float) this.field5571 / var8);
        int var11 = (int) (((float) arg5 * this.field5542.field6535 + (float) arg3 * this.field5542.field6534 + (float) arg4 * this.field5542.field6530 + this.field5542.field6568) * (float) this.field5571 / var9);
        if ((float) var10 < this.field5632 && (float) var11 < this.field5632) {
            var7 |= 1;
        } else if (this.field5618 < (float) var10 && (float) var11 > this.field5618) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field5542.field6565 + (float) arg0 * this.field5542.field6540 + (float) arg1 * this.field5542.field6538 + this.field5542.field6531) * (float) this.field5561 / var8);
        int var13 = (int) (((float) arg5 * this.field5542.field6565 + (float) arg3 * this.field5542.field6540 + (float) arg4 * this.field5542.field6538 + this.field5542.field6531) * (float) this.field5561 / var9);
        if (this.field5563 > (float) var12 && this.field5563 > (float) var13) {
            var7 |= 4;
        } else if (this.field5615 < (float) var12 && (float) var13 > this.field5615) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "()Z", line = 1089)
    public final boolean method512() {
        ++field5392;
        return false;
    }

    @OriginalMember(owner = "client!wu", name = "X", descriptor = "(I)V", line = 1098)
    public final void method438(int arg0) {
        ++field5447;
        this.field5551 = 0;
        while (arg0 > 1) {
            ++this.field5551;
            arg0 >>= 1;
        }
        this.field5597 = 1 << this.field5551;
    }

    @OriginalMember(owner = "client!wu", name = "w", descriptor = "(I)I", line = 1113)
    public final int method2333(int arg0) {
        ++field5423;
        int var2 = 55 % ((arg0 - 37) / 42);
        return this.field5622;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIF)Lraa;", line = 1123)
    public final class609 method443(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field5417;
        return new class122(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!wu", name = "DA", descriptor = "(IIII)V", line = 1131)
    public final void method500(int arg0, int arg1, int arg2, int arg3) {
        this.field5588 = arg1;
        this.field5572 = arg0;
        this.field5571 = arg2;
        this.field5561 = arg3;
        ++field5448;
        this.method2401(3);
        this.method2380(-6574);
        this.method2327((byte) -69);
        this.method2305((byte) 61);
    }

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "(B)Ljc;", line = 1148)
    public final class441 method2334(byte arg0) {
        ++field5530;
        if (arg0 <= 62) {
            this.method2421((byte) -105);
        }
        return this.field5536;
    }

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "(B)V", line = 1159)
    private final void method2335(byte arg0) {
        ++field5507;
        this.method2324(-91);
        if (this.field5631 != null) {
            this.field5631.method2631(true);
        }
        if (arg0 <= 2) {
            this.field5575 = 1.5909463F;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZ)V", line = 1174)
    public final void method2336(int arg0, boolean arg1) {
        ++field5377;
        if (arg1 == !this.field5594) {
            this.field5594 = arg1;
            this.method2387((byte) 126);
            this.field5647 &= -8;
        }
        if (arg0 != 0) {
            this.method2396(true);
        }
    }

    @OriginalMember(owner = "client!wu", name = "XA", descriptor = "()I", line = 1191)
    public final int method514() {
        ++field5420;
        return this.field5596;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIILaa;II)V", line = 1199)
    public final void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class488 arg6, int arg7, int arg8) {
        ++field5512;
    }

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "(I)V", line = 1208)
    public final void method480(int arg0) {
        ++field5360;
    }

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "(I)V", line = 1215)
    public final void method486(int arg0) {
        ++field5443;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "(Z)V", line = 1226)
    private final void method2337(boolean arg0) {
        this.field5657 = this.method2384(false, 95);
        ++field5431;
        this.field5657.method1290(-108, 12, 3096);
        if (!arg0) {
            this.method2394(false, (byte) 114);
        }
        for (int var2 = 0; var2 < 4; ++var2) {
            Buffer var3 = this.field5657.method1283((byte) 44, true);
            if (var3 != null) {
                Stream var4 = this.method2392(var3, -15232);
                var4.method3863(0.0F);
                var4.method3863(0.0F);
                var4.method3863(0.0F);
                for (int var5 = 0; ~var5 >= -257; ++var5) {
                    double var6 = (double) (var5 * 2) * 3.141592653589793D / 256.0D;
                    float var8 = (float) Math.cos(var6);
                    float var9 = (float) Math.sin(var6);
                    if (Stream.method3869()) {
                        var4.method3863(var9);
                        var4.method3863(var8);
                        var4.method3863(0.0F);
                    } else {
                        var4.method3864(var9);
                        var4.method3864(var8);
                        var4.method3864(0.0F);
                    }
                }
                var4.method3872();
                if (this.field5657.method1289((byte) 74)) {
                    break;
                }
            }
        }
        this.field5674 = this.method2302(new class290[] { new class290(class369.field5301) }, 13992);
    }

    @OriginalMember(owner = "client!wu", name = "x", descriptor = "(I)Ljc;", line = 1293)
    public final class441 method2338(int arg0) {
        if (arg0 != 1) {
            this.field5599 = true;
        }
        if (!this.field5640) {
            this.field5550.method2719(this.field5545, this.field5536);
            this.field5640 = true;
        }
        ++field5496;
        return this.field5550;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ldh;IIII)Lka;", line = 1310)
    public final class473 method418(class322 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5351;
        return new class701(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "(Z)V", line = 1318)
    public static void method2339(boolean arg0) {
        field5534 = null;
        field5549 = null;
        field5541 = null;
        field5544 = null;
        field5548 = null;
        if (arg0) {
            field5652 = null;
            field5546 = null;
            field5540 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(IIZ)Ljaclib/memory/heap/NativeHeapBuffer;", line = 1338)
    public final NativeHeapBuffer method2342(int arg0, int arg1, boolean arg2) {
        if (arg1 != 4194) {
            return null;
        } else {
            ++field5350;
            return this.field5474.method3857(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "(I)V", line = 1350)
    private final void method2344(int arg0) {
        ++field5398;
        if (class529.field7544 == this.field5557) {
            float var2 = this.method2376((byte) -108);
            this.field5536.method2725((byte) -98, var2, var2, 0.0F);
        }
        this.field5640 = false;
        this.method2292(arg0);
        if (this.field5631 != null) {
            this.field5631.method2629((byte) 6);
        }
    }

    @OriginalMember(owner = "client!wu", name = "u", descriptor = "()Z", line = 1370)
    public final boolean method532() {
        ++field5425;
        return true;
    }

    @OriginalMember(owner = "client!wu", name = "y", descriptor = "()Z", line = 1378)
    public final boolean method537() {
        ++field5531;
        return true;
    }

    @OriginalMember(owner = "client!wu", name = "q", descriptor = "()Lql;", line = 1386)
    public final class738 method504() {
        ++field5495;
        return this.field5542;
    }

    @OriginalMember(owner = "client!wu", name = "A", descriptor = "(I)V", line = 1394)
    private final void method2345(int arg0) {
        this.method2389(0, (byte) -64, this.field5665);
        ++field5387;
        if (arg0 < 87) {
            this.method2358(3, false, -56, (int[]) null, -49);
        }
        this.method2368(this.field5669, (byte) 73);
        this.method2408(class291.field4160, (byte) -40, 0, 1);
    }

    @OriginalMember(owner = "client!wu", name = "v", descriptor = "()V", line = 1409)
    public final void method533() {
        ++field5367;
        if (this.field5554 != null) {
            this.field5554.method1876((byte) 116);
        }
    }

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "(B)Ljc;", line = 1435)
    public final class441 method2347(byte arg0) {
        if (arg0 >= -70) {
            this.field5658 = null;
        }
        ++field5362;
        return this.field5545;
    }

    @OriginalMember(owner = "client!wu", name = "B", descriptor = "(I)V", line = 1448)
    private final void method2349(int arg0) {
        if (arg0 <= 87) {
            this.method2308(false, -44);
        }
        ++field5504;
        if (class529.field7544 != this.field5557) {
            class340 var2 = this.field5557;
            this.field5557 = class529.field7544;
            if (var2.method2165(-7874)) {
                this.method2367((byte) 93);
            }
            this.method2307(true);
            this.field5643 = this.field5641;
            this.method2400(false);
            this.field5647 &= -25;
        }
    }

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "(B)Ljc;", line = 1477)
    public final class441 method2350(byte arg0) {
        ++field5509;
        if (arg0 != 37) {
            this.field5602 = -0.3908574F;
        }
        return this.field5636[this.field5558];
    }

    @OriginalMember(owner = "client!wu", name = "Q", descriptor = "(IIIIII[BII)V", line = 1492)
    public final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field5453;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIZ)Lpga;", line = 1499)
    public final class536 method470(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5353;
        class224 var6 = new class224(this, arg2, arg3, arg4);
        var6.method135(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIIIII)V", line = 1512)
    public final void method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field5441;
        float var10 = (float) arg2 - (float) arg0;
        float var11 = (float) (-arg1) + (float) arg3;
        float var12;
        if (var10 == 0.0F && var11 == 0.0F) {
            var12 = 1.0F;
        } else {
            float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            var12 = var10 * var13;
            var11 *= var13;
        }
        this.method2360((byte) -110);
        this.method2415(arg4, 0);
        this.method2329(0, (byte) -124, class469.field6850);
        this.method2407(0, class469.field6850, 88);
        this.method2405(arg5, 122);
        this.method2357(-31486);
        int var14 = arg8 % (arg6 + arg7);
        this.method2332(false, (byte) -122);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (arg6 < var14) {
            var18 = (float) (arg6 - var14 + arg7) * var11;
            var17 = (float) (arg6 + arg7 + -var14) * var12;
        } else {
            var19 = (float) (-var14 + arg6) * var12;
            var20 = (float) (-var14 + arg6) * var11;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (arg0 >= arg2) {
                if ((float) arg2 > var21) {
                    break;
                }
                if ((float) arg2 > var19 + var21) {
                    var19 = (float) arg2 + -var21;
                }
            } else {
                if (var21 > (float) arg2) {
                    break;
                }
                if ((float) arg2 < var19 + var21) {
                    var19 = (float) arg2 - var21;
                }
            }
            if (arg1 < arg3) {
                if (var22 > (float) arg3) {
                    break;
                }
                if (var20 + var22 > (float) arg3) {
                    var20 = (float) arg3 + -var22;
                }
            } else {
                if (var22 < (float) arg3) {
                    break;
                }
                if (var20 + var22 < (float) arg3) {
                    var20 = (float) arg3 - var22;
                }
            }
            if (!this.method2418(var22, var19 + var21, 0.0F, -99, var21, var20 + var22, 0.0F)) {
                return;
            }
            var21 += var19 + var23;
            this.method2345(90);
            var22 += var20 + var24;
            var19 = var15;
            var20 = var16;
        }
        this.method2332(true, (byte) -57);
        this.method2407(0, class331.field4759, 109);
        this.method2329(0, (byte) -126, class331.field4759);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BI)V", line = 1632)
    public final void method2353(byte arg0, int arg1) {
        ++field5535;
        if (arg0 > -64) {
            this.field5611 = -85;
        }
        if (arg1 != 1) {
            if (arg1 == 0) {
                this.method2300(class336.field4874, class336.field4874, 0);
            } else if (arg1 != 2) {
                if (~arg1 != -4) {
                    if (~arg1 == -5) {
                        this.method2300(class449.field6633, class449.field6633, 0);
                        return;
                    }
                } else {
                    this.method2300(class336.field4874, class661.field9242, 0);
                }
            } else {
                this.method2300(class499.field7099, class49.field706, 0);
            }
        } else {
            this.method2300(class499.field7099, class499.field7099, 0);
        }
    }

    @OriginalMember(owner = "client!wu", name = "T", descriptor = "(IIII)V", line = 1662)
    public final void method509(int arg0, int arg1, int arg2, int arg3) {
        ++field5419;
        boolean var5 = false;
        if (~this.field5642 > ~arg0) {
            var5 = true;
            this.field5642 = arg0;
        }
        if (this.field5630 > arg2) {
            var5 = true;
            this.field5630 = arg2;
        }
        if (~arg1 < ~this.field5580) {
            this.field5580 = arg1;
            var5 = true;
        }
        if (this.field5614 > arg3) {
            this.field5614 = arg3;
            var5 = true;
        }
        if (var5) {
            if (!this.field5676) {
                this.field5676 = true;
                this.method2373(false);
            }
            this.method2315(0);
            this.method2305((byte) 61);
        }
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lvd;II)V", line = 1712)
    public class373(Canvas arg0, Object arg1, class151 arg2, class39 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            this.field5519 = this.field5476 = arg1;
            this.field5494 = this.field5361 = arg0;
            this.field5648 = arg4;
            this.field5386 = arg3;
            Dimension var7 = arg0.getSize();
            this.field5502 = this.field5379 = var7.height;
            this.field5629 = arg5;
            this.field5407 = this.field5359 = var7.width;
            class184.method1301(false, true, -22433);
            if (super.field849 == null) {
                this.field5354 = new NativeInterface(0, this.field5629);
                this.field5554 = null;
            } else {
                this.field5554 = new class297(this, super.field849);
                this.field5354 = new NativeInterface(super.field849.method1125((byte) -126), this.field5629);
                for (int var8 = 0; var8 < super.field849.method1125((byte) -126); ++var8) {
                    class293 var9 = super.field849.method1124((byte) -113, var8);
                    if (var9 != null) {
                        this.field5354.initTextureMetrics(var8, var9.field4179, var9.field4193);
                    }
                }
            }
        } catch (Throwable var11) {
            var11.printStackTrace();
            this.method447((byte) -9);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "(B)V", line = 1763)
    private final void method2355(byte arg0) {
        ++field5366;
        this.field5662 = this.method2384(false, -71);
        this.field5662.method1290(-116, 28, 140);
        if (arg0 == 33) {
            for (int var2 = 0; ~var2 > -5; ++var2) {
                Buffer var3 = this.field5662.method1283((byte) 67, true);
                if (var3 != null) {
                    Stream var4 = this.method2392(var3, arg0 ^ -15199);
                    if (!Stream.method3869()) {
                        var4.method3864(0.0F);
                        var4.method3864(0.0F);
                        var4.method3864(0.0F);
                        var4.method3864(0.0F);
                        var4.method3864(0.0F);
                        var4.method3864(0.0F);
                        var4.method3864(0.0F);
                        var4.method3864(0.0F);
                        var4.method3864(1.0F);
                        var4.method3864(0.0F);
                        var4.method3864(0.0F);
                        var4.method3864(1.0F);
                        var4.method3864(0.0F);
                        var4.method3864(1.0F);
                        var4.method3864(1.0F);
                        var4.method3864(1.0F);
                        var4.method3864(0.0F);
                        var4.method3864(1.0F);
                        var4.method3864(1.0F);
                        var4.method3864(1.0F);
                        var4.method3864(1.0F);
                        var4.method3864(1.0F);
                        var4.method3864(0.0F);
                        var4.method3864(0.0F);
                        var4.method3864(1.0F);
                        var4.method3864(0.0F);
                        var4.method3864(1.0F);
                        var4.method3864(0.0F);
                        var4.method3864(0.0F);
                        var4.method3864(0.0F);
                        var4.method3864(0.0F);
                        var4.method3864(0.0F);
                        var4.method3864(0.0F);
                        var4.method3864(0.0F);
                        var4.method3864(0.0F);
                    } else {
                        var4.method3863(0.0F);
                        var4.method3863(0.0F);
                        var4.method3863(0.0F);
                        var4.method3863(0.0F);
                        var4.method3863(0.0F);
                        var4.method3863(0.0F);
                        var4.method3863(0.0F);
                        var4.method3863(0.0F);
                        var4.method3863(1.0F);
                        var4.method3863(0.0F);
                        var4.method3863(0.0F);
                        var4.method3863(1.0F);
                        var4.method3863(0.0F);
                        var4.method3863(1.0F);
                        var4.method3863(1.0F);
                        var4.method3863(1.0F);
                        var4.method3863(0.0F);
                        var4.method3863(1.0F);
                        var4.method3863(1.0F);
                        var4.method3863(1.0F);
                        var4.method3863(1.0F);
                        var4.method3863(1.0F);
                        var4.method3863(0.0F);
                        var4.method3863(0.0F);
                        var4.method3863(1.0F);
                        var4.method3863(0.0F);
                        var4.method3863(1.0F);
                        var4.method3863(0.0F);
                        var4.method3863(0.0F);
                        var4.method3863(0.0F);
                        var4.method3863(0.0F);
                        var4.method3863(0.0F);
                        var4.method3863(0.0F);
                        var4.method3863(0.0F);
                        var4.method3863(0.0F);
                    }
                    var4.method3872();
                    if (this.field5662.method1289((byte) 82)) {
                        break;
                    }
                }
            }
            this.field5671 = this.method2302(new class290[] { new class290(new class369[] { class369.field5301, class369.field5311, class369.field5311 }) }, 13992);
        }
    }

    @OriginalMember(owner = "client!wu", name = "E", descriptor = "(I)V", line = 1880)
    public final void method2357(int arg0) {
        if (arg0 != -31486) {
            this.method2381((byte) -53);
        }
        this.field5536.method769();
        ++field5529;
        this.field5539 = true;
        this.method2344(arg0 + 31486);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZI[II)Lch;", line = 1893)
    public final class465 method2358(int arg0, boolean arg1, int arg2, int[] arg3, int arg4) {
        int var6 = -116 % ((arg0 - -59) / 46);
        ++field5523;
        return this.method2417(0, arg1, arg2, arg4, arg3, 0, 11);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I[Lraa;)V", line = 1904)
    public final void method501(int arg0, class609[] arg1) {
        ++field5421;
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field5566[var3] = arg1[var3];
        }
        this.field5553 = arg0;
        if (this.field5557.method2165(-7874)) {
            this.method2297((byte) -25);
        }
    }

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "(II)Lnia;", line = 1925)
    public class648 method2359(int arg0, int arg1) {
        ++field5450;
        if (arg1 != 9827) {
            this.field5354 = null;
        }
        if (~arg0 != -7) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    return arg0 == 7 ? new class229(this) : new class214(this);
                } else {
                    return new class426(this, this.field5356);
                }
            } else {
                return new class559(this);
            }
        } else {
            return new class358(this);
        }
    }

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "(B)V", line = 1978)
    private final void method2360(byte arg0) {
        if (arg0 == -110) {
            ++field5373;
            if (~this.field5647 != -2) {
                this.method2349(120);
                this.method2402(false, (byte) 68);
                this.method2336(arg0 + 110, false);
                this.method2298((byte) -88, false);
                this.method2394(false, (byte) 121);
                this.method2398(false, false, false, -2);
                this.method2353((byte) -105, 1);
                this.method2294(this.field5583, -2);
                this.field5647 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "F", descriptor = "(I)I", line = 2002)
    public final int method2361(int arg0) {
        ++field5464;
        if (arg0 <= 78) {
            this.method436(50, -98, 73, 95, -39, -44);
        }
        return this.field5609;
    }

    @OriginalMember(owner = "client!wu", name = "G", descriptor = "(I)V", line = 2020)
    public final void method2363(int arg0) {
        ++field5451;
        Hashtable var2 = new Hashtable();
        if (this.field5372 != null && !this.field5372.isEmpty()) {
            Enumeration var3 = this.field5372.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method2378(68, var4));
            }
        }
        this.field5372 = var2;
        if (arg0 == 10) {
            this.method2355((byte) 33);
            this.method2364(true);
            this.method2337(true);
            this.field5651.method1934(-119, this);
        }
    }

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "(Z)V", line = 2052)
    private final void method2364(boolean arg0) {
        ++field5477;
        this.field5665 = this.method2384(arg0, -97);
        this.field5665.method1290(-110, 12, 24);
        this.field5669 = this.method2302(new class290[] { new class290(class369.field5301) }, 13992);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lza;)V", line = 2068)
    public final void method445(class415 arg0) {
        this.field5474 = ((class21) arg0).field224;
        ++field5376;
        this.field5517 = this.field5474.method3857(32768, false);
    }

    @OriginalMember(owner = "client!wu", name = "H", descriptor = "(I)V", line = 2079)
    private final void method2366(int arg0) {
        if (this.field5494 != null) {
            Dimension var2 = this.field5494.getSize();
            this.field5379 = var2.height;
            this.field5359 = var2.width;
        } else {
            this.field5359 = this.field5379 = 1;
        }
        ++field5408;
        int var3 = -9 / ((arg0 - -72) / 49);
        this.field5407 = this.field5359;
        this.field5502 = this.field5379;
        this.method2296(9);
        this.method2380(-6574);
        this.method2401(3);
        this.method2356(-1);
        this.method2305((byte) 61);
        this.method2327((byte) -42);
        this.method469();
    }

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "(B)V", line = 2113)
    private final void method2367(byte arg0) {
        if (arg0 < 74) {
            this.field5674 = null;
        }
        this.field5640 = false;
        ++field5514;
        if (this.field5631 != null) {
            this.field5631.method2628(true);
        }
        this.method2365((byte) -107);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "([IIIIIZ)Lpga;", line = 2129)
    public final class536 method429(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5412;
        return new class224(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wu", name = "ra", descriptor = "(IIII)V", line = 2141)
    public final void method529(int arg0, int arg1, int arg2, int arg3) {
        this.field5622 = arg1;
        this.field5609 = arg2;
        ++field5513;
        this.field5562 = arg3;
        this.field5570 = true;
        this.field5574 = arg0;
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)V", line = 2155)
    public final void method471(int arg0) {
        ++field5527;
    }

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "()Lql;", line = 2167)
    public final class738 method442() {
        ++field5498;
        return this.field5672;
    }

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "()Z", line = 2178)
    public final boolean method483() {
        ++field5405;
        return this.field5579[3].method1449(13003);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BB)V", line = 2187)
    public final void method2371(byte arg0, byte arg1) {
        if (arg1 != -37) {
            this.field5559 = -49;
        }
        ++field5446;
        this.method2415(arg0 << 8 | arg0 << 16 | arg0 << 24 | arg0, 0);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "([FB)[F", line = 2199)
    public final float[] method2372(float[] arg0, byte arg1) {
        if (arg1 != -70) {
            return null;
        } else {
            arg0[12] = this.field5643[3];
            ++field5533;
            arg0[4] = this.field5643[1];
            arg0[8] = this.field5643[2];
            arg0[0] = this.field5643[0];
            arg0[2] = this.field5643[8];
            arg0[13] = this.field5643[7];
            arg0[1] = this.field5643[4];
            arg0[5] = this.field5643[5];
            arg0[9] = this.field5643[6];
            arg0[6] = this.field5643[9];
            arg0[14] = this.field5643[11];
            arg0[3] = this.field5643[12];
            arg0[7] = this.field5643[13];
            arg0[10] = this.field5643[10];
            arg0[11] = this.field5643[14];
            arg0[15] = this.field5643[15];
            return arg0;
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(BI)V", line = 2229)
    public final void method2375(byte arg0, int arg1) {
        if (this.field5558 != arg1) {
            this.field5558 = arg1;
            this.method2319(10);
        }
        ++field5491;
        int var3 = -45 / ((-28 - arg0) / 39);
    }

    @OriginalMember(owner = "client!wu", name = "HA", descriptor = "(IIII[I)V", line = 2247)
    public final void method425(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field5467;
        float var6 = this.field5542.method2717((float) arg2, (float) arg0, (float) arg1, -9555);
        if (!(var6 < (float) this.field5600) && !(var6 > (float) this.field5596)) {
            int var7 = (int) ((float) this.field5571 * this.field5542.method2732((float) arg2, (float) arg0, 0, (float) arg1) / (float) arg3);
            int var8 = (int) ((float) this.field5561 * this.field5542.method2730((float) arg2, (float) arg1, 0, (float) arg0) / (float) arg3);
            arg4[0] = (int) ((float) var7 - this.field5632);
            arg4[1] = (int) ((float) var8 + -this.field5563);
            arg4[2] = (int) var6;
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 2277)
    public final void method417(Canvas arg0, int arg1, int arg2) {
        ++field5368;
        Object var4 = null;
        if (arg0 != null && this.field5361 != arg0) {
            if (this.field5372.containsKey(arg0)) {
                var4 = this.field5372.get(arg0);
            }
        } else {
            var4 = this.field5519;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method2354(var4, true, arg0);
            if (this.field5494 == arg0) {
                this.method2366(-126);
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILef;I)V", line = 2306)
    private final void method2379(int arg0, class489 arg1, int arg2) {
        int var4 = -117 % ((arg0 - -72) / 38);
        this.method2389(0, (byte) -64, this.field5662);
        ++field5454;
        this.method2368(this.field5671, (byte) 77);
        this.method2408(arg1, (byte) -40, 0, arg2);
    }

    @OriginalMember(owner = "client!wu", name = "I", descriptor = "(I)V", line = 2319)
    private final void method2380(int arg0) {
        ++field5395;
        this.field5586 = false;
        this.method2316((byte) 90);
        if (arg0 == -6574) {
            if (class10.field151 == this.field5557) {
                this.method2400(false);
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "J", descriptor = "(I)V", line = 2338)
    public final void method2382(int arg0) {
        ++field5458;
        if (arg0 == 2) {
            if (this.field5647 != 16) {
                this.method2391(arg0 ^ -6);
                this.method2402(true, (byte) -96);
                this.method2298((byte) -88, true);
                this.method2394(true, (byte) -117);
                this.method2405(1, arg0 ^ 115);
                this.field5647 = 16;
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "(Z)V", line = 2359)
    private final void method2383(boolean arg0) {
        if (!arg0) {
            field5549 = null;
        }
        if (!this.field5624) {
            float[] var2 = this.field5625;
            float var3 = (float) this.field5600;
            float var4 = (float) this.field5596;
            float var5 = (float) (-this.field5588) * this.field5587 / (float) this.field5561;
            float var6 = (float) (-this.field5572) * this.field5587 / (float) this.field5571;
            float var7 = (float) (-this.field5572 + this.field5407) * this.field5587 / (float) this.field5571;
            float var8 = (float) (-this.field5588 + this.field5502) * this.field5587 / (float) this.field5561;
            if (var6 != var7 && var5 != var8) {
                var2[11] = 0.0F;
                var2[10] = 1.0F / (var3 - var4);
                var2[4] = 0.0F;
                var2[14] = var3 / (var3 - var4);
                var2[3] = 0.0F;
                var2[1] = 0.0F;
                var2[12] = (var6 + var7) / (-var7 + var6);
                var2[8] = 0.0F;
                var2[9] = 0.0F;
                var2[7] = 0.0F;
                var2[5] = 2.0F / (var8 - var5);
                var2[2] = 0.0F;
                var2[0] = 2.0F / (var7 - var6);
                var2[13] = (var5 + var8) / (-var5 + var8);
                var2[6] = 0.0F;
                var2[15] = 1.0F;
            } else {
                var2[3] = 0.0F;
                var2[7] = 0.0F;
                var2[5] = 1.0F;
                var2[1] = 0.0F;
                var2[15] = 1.0F;
                var2[8] = 0.0F;
                var2[11] = 0.0F;
                var2[13] = 0.0F;
                var2[14] = 0.0F;
                var2[2] = 0.0F;
                var2[9] = 0.0F;
                var2[0] = 1.0F;
                var2[4] = 0.0F;
                var2[6] = 0.0F;
                var2[12] = 0.0F;
                var2[10] = 1.0F;
            }
            this.method2323(82);
            this.field5624 = true;
        }
        ++field5400;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I[FZZILpd;)Lch;", line = 2433)
    public final class465 method2385(int arg0, float[] arg1, boolean arg2, boolean arg3, int arg4, class259 arg5) {
        if (arg2) {
            this.method2359(4, -126);
        }
        ++field5487;
        return this.method2352(arg3, arg1, arg0, 2, arg5, arg4, 0, 0);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IBZ[BLpd;I)Lch;", line = 2446)
    public final class465 method2386(int arg0, byte arg1, boolean arg2, byte[] arg3, class259 arg4, int arg5) {
        if (arg1 >= -36) {
            this.method2367((byte) 108);
        }
        ++field5427;
        return this.method2310(arg2, arg5, 0, 0, -128, arg3, arg4, arg0);
    }

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "(I)Lza;", line = 2457)
    public final class415 method520(int arg0) {
        ++field5382;
        class21 var2 = new class21(arg0);
        this.field5483.method1203(var2, (byte) 116);
        return var2;
    }

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "(I)V", line = 2471)
    public final void method495(int arg0) {
        ++field5403;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            if (this.field5554 != null) {
                this.field5554.method1876((byte) 116);
            }
            this.field5567 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 2491)
    public final void method449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class488 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field5479;
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(IZ)V", line = 2499)
    public final void method2388(int arg0, boolean arg1) {
        if (this.field5606 != arg1) {
            this.field5606 = arg1;
            this.method2374((byte) 99);
        }
        if (arg0 != 1) {
            this.method2318((class238) null, 101, false, true);
        }
        ++field5404;
    }

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "()Z", line = 2516)
    public final boolean method496() {
        ++field5352;
        return false;
    }

    @OriginalMember(owner = "client!wu", name = "pa", descriptor = "()V", line = 2525)
    public final void method466() {
        ++field5482;
        this.field5570 = false;
    }

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "(IIIIIII)I", line = 2533)
    public final int method524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5466;
        int var8 = 0;
        float var9 = (float) arg2 * this.field5542.field6541 + (float) arg0 * this.field5542.field6573 + (float) arg1 * this.field5542.field6532 + this.field5542.field6526;
        float var10 = (float) arg5 * this.field5542.field6541 + (float) arg3 * this.field5542.field6573 + (float) arg4 * this.field5542.field6532 + this.field5542.field6526;
        if ((float) this.field5600 > var9 && (float) this.field5600 > var10) {
            var8 |= 16;
        } else if ((float) this.field5596 < var9 && var10 > (float) this.field5596) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field5542.field6535 + (float) arg0 * this.field5542.field6534 + (float) arg1 * this.field5542.field6530 + this.field5542.field6568) * (float) this.field5571 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field5542.field6535 + (float) arg3 * this.field5542.field6534 + (float) arg4 * this.field5542.field6530 + this.field5542.field6568) * (float) this.field5571 / (float) arg6);
        if (this.field5632 > (float) var11 && (float) var12 < this.field5632) {
            var8 |= 1;
        } else if ((float) var11 > this.field5618 && this.field5618 < (float) var12) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field5542.field6565 + (float) arg0 * this.field5542.field6540 + (float) arg1 * this.field5542.field6538 + this.field5542.field6531) * (float) this.field5561 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field5542.field6565 + (float) arg3 * this.field5542.field6540 + (float) arg4 * this.field5542.field6538 + this.field5542.field6531) * (float) this.field5561 / (float) arg6);
        if ((float) var13 < this.field5563 && (float) var14 < this.field5563) {
            var8 |= 4;
        } else if (this.field5615 < (float) var13 && (float) var14 > this.field5615) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!wu", name = "aa", descriptor = "(IIIIII)V", line = 2580)
    public final void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5406;
        this.method2360((byte) -110);
        this.method2415(arg4, 0);
        this.method2329(0, (byte) -126, class469.field6850);
        this.method2407(0, class469.field6850, 116);
        this.method2405(arg5, 111);
        this.field5536.method2720((float) arg2, 1.0F, 0, (float) arg3);
        this.field5536.method758(arg0, arg1, 0);
        this.method2406(true);
        this.method2332(false, (byte) -64);
        this.method2422(-25804);
        this.method2332(true, (byte) -50);
        this.method2407(0, class331.field4759, 83);
        this.method2329(0, (byte) -127, class331.field4759);
    }

    @OriginalMember(owner = "client!wu", name = "L", descriptor = "(I)V", line = 2603)
    private final void method2391(int arg0) {
        if (arg0 != -8) {
            this.method501(-106, (class609[]) null);
        }
        ++field5444;
        if (class559.field7999 != this.field5557) {
            class340 var2 = this.field5557;
            this.field5557 = class559.field7999;
            if (!var2.method2165(-7874)) {
                this.method2367((byte) 80);
            }
            this.method2383(true);
            this.field5643 = this.field5625;
            this.method2400(false);
            this.field5647 &= -8;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIII)V", line = 2630)
    public final void method436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5426;
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) arg3 - (float) arg1;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var8 *= var10;
            var9 = var7 * var10;
        }
        if (this.method2418((float) arg1, (float) arg2 + var9, 0.0F, -109, (float) arg0, (float) arg3 + var8, 0.0F)) {
            this.method2360((byte) -110);
            this.method2415(arg4, 0);
            this.method2329(0, (byte) -126, class469.field6850);
            this.method2407(0, class469.field6850, 48);
            this.method2405(arg5, 99);
            this.method2357(-31486);
            this.method2332(false, (byte) -49);
            this.method2345(111);
            this.method2332(true, (byte) -115);
            this.method2407(0, class331.field4759, 69);
            this.method2329(0, (byte) -124, class331.field4759);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljaclib/memory/Buffer;I)Ljaclib/memory/Stream;", line = 2669)
    public final Stream method2392(Buffer arg0, int arg1) {
        this.field5564.method3870(arg0);
        if (arg1 != -15232) {
            return null;
        } else {
            ++field5501;
            return this.field5564;
        }
    }

    @OriginalMember(owner = "client!wu", name = "ZA", descriptor = "(IFFFFF)V", line = 2681)
    public final void method460(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field5510;
        boolean var7 = this.field5584 != arg0;
        if (var7 || this.field5612 != arg1 || this.field5644 != arg2) {
            this.field5584 = arg0;
            this.field5612 = arg1;
            this.field5644 = arg2;
            if (var7) {
                this.field5576 = (float) (this.field5584 & 255) / 255.0F;
                this.field5602 = (float) (this.field5584 & 16711680) / 1.671168E7F;
                this.field5639 = (float) (this.field5584 & 65280) / 65280.0F;
                this.method2377((byte) 50);
            }
            this.field5354.setSunColour(this.field5602, this.field5639, this.field5576, arg1, arg2);
            this.method2420(10295);
        }
        if (this.field5565[0] != arg3 || this.field5565[1] != arg4 || this.field5565[2] != arg5) {
            this.field5565[1] = arg4;
            this.field5565[2] = arg5;
            this.field5565[0] = arg3;
            this.field5592[2] = -arg5;
            this.field5592[0] = -arg3;
            this.field5592[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5617[2] = arg5 * var8;
            this.field5617[0] = arg3 * var8;
            this.field5617[1] = arg4 * var8;
            this.field5598[1] = -this.field5617[1];
            this.field5598[2] = -this.field5617[2];
            this.field5598[0] = -this.field5617[0];
            this.field5354.setSunDirection(this.field5617[0], this.field5617[1], this.field5617[2]);
            this.method2370((byte) -125);
            this.field5611 = (int) (arg5 * 256.0F / arg4);
            this.field5628 = (int) (arg3 * 256.0F / arg4);
        }
        this.method2341(119);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lfg;Z)Lpga;", line = 2731)
    public final class536 method422(class129 arg0, boolean arg1) {
        ++field5497;
        class536 var10;
        if (~arg0.field1734 != -1 && ~arg0.field1739 != -1) {
            int[] var3 = new int[arg0.field1739 * arg0.field1734];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field1736 == null) {
                for (int var6 = 0; ~arg0.field1739 < ~var6; ++var6) {
                    for (int var7 = 0; arg0.field1734 > var7; ++var7) {
                        int var8 = arg0.field1732[arg0.field1738[var4++] & 255];
                        var3[var5++] = ~var8 == -1 ? 0 : class625.method3600(-16777216, var8);
                    }
                }
            } else {
                for (int var9 = 0; arg0.field1739 > var9; ++var9) {
                    for (int var11 = 0; arg0.field1734 > var11; ++var11) {
                        var3[var5++] = class625.method3600(arg0.field1732[class493.method2943(arg0.field1738[var4], 255)], arg0.field1736[var4] << 24);
                        ++var4;
                    }
                }
            }
            var10 = this.method531(arg0.field1739, arg0.field1734, var3, arg0.field1734, 0, (byte) -101);
        } else {
            var10 = this.method531(1, 1, new int[1], 1, 0, (byte) -101);
        }
        var10.method1505(arg0.field1735, arg0.field1737, arg0.field1731, arg0.field1733);
        return var10;
    }

    @OriginalMember(owner = "client!wu", name = "x", descriptor = "(B)I", line = 2799)
    public final int method2393(byte arg0) {
        if (arg0 < 68) {
            this.method429((int[]) null, -78, -111, 8, -104, true);
        }
        ++field5452;
        return this.field5574;
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(ZB)V", line = 2810)
    public final void method2394(boolean arg0, byte arg1) {
        ++field5500;
        if (this.field5569 == !arg0) {
            this.field5569 = arg0;
            this.method2369((byte) -126);
            this.field5647 &= -32;
        }
        int var3 = 93 % ((-66 - arg1) / 38);
    }

    @OriginalMember(owner = "client!wu", name = "M", descriptor = "(I)V", line = 2829)
    public final void method2395(int arg0) {
        ++field5455;
        this.method2327((byte) -63);
        if (arg0 != 18269) {
            this.method2355((byte) -54);
        }
        this.method2400(false);
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(Z)V", line = 2848)
    public final void method467(boolean arg0) {
        ++field5380;
    }

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "(Z)V", line = 2855)
    private final void method2396(boolean arg0) {
        ++field5524;
        this.field5619[14] = this.field5582;
        this.field5619[10] = this.field5646;
        if (!arg0) {
            this.field5604 = (this.field5619[14] - (float) this.field5596) / this.field5619[10];
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2870)
    public final void method446(Canvas arg0) {
        ++field5438;
        this.field5519 = null;
        this.field5494 = null;
        if (arg0 != null && this.field5361 != arg0) {
            if (this.field5372.containsKey(arg0)) {
                this.field5519 = this.field5372.get(arg0);
                this.field5494 = arg0;
            }
        } else {
            this.field5519 = this.field5476;
            this.field5494 = this.field5361;
        }
        if (this.field5494 != null && this.field5519 != null) {
            this.method2295((byte) 10, this.field5519, this.field5494);
            this.method2366(-126);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lhia;[Lfg;Z)Lda;", line = 2903)
    public final class61 method474(class66 arg0, class129[] arg1, boolean arg2) {
        ++field5389;
        return new class694(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZZZI)V", line = 2912)
    public final void method2398(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        ++field5481;
        if (!arg0) {
            if (this.field5573 != arg3 || this.field5585 != this.field5570) {
                class465 var5 = null;
                int var6 = 0;
                byte var7 = 0;
                int var8 = 0;
                int var9 = this.field5570 ? 3 : 0;
                if (~arg3 > -1) {
                    this.method2410(-1);
                } else {
                    var5 = this.field5554.method1879(-68, arg3);
                    class293 var10 = super.field849.method1124((byte) -128, arg3);
                    if (var10.field4188 == 0 && var10.field4171 == 0) {
                        this.method2410(-1);
                    } else {
                        int var11 = !var10.field4174 ? 128 : 64;
                        int var12 = var11 * 50;
                        class441 var13 = this.method2299(-25498);
                        var13.method2721((byte) -92, 0.0F, (float) (this.field5552 % var12 * var10.field4171) / (float) var12, (float) (this.field5552 % var12 * var10.field4188) / (float) var12);
                        this.method2291(class127.field1688, 105);
                    }
                    var6 = var10.field4182;
                    if (!this.field5570) {
                        var8 = var10.field4172;
                        var9 = var10.field4185;
                        var7 = var10.field4176;
                    }
                }
                this.method2409(arg1, var7, var8, (byte) -127, arg2, var9);
                if (this.field5631 == null) {
                    this.method2294(var5, -2);
                    this.method2353((byte) -86, var6);
                } else {
                    this.field5631.method1455(var5, 12885, var6);
                }
                this.field5585 = this.field5570;
                this.field5573 = arg3;
            }
            this.field5647 &= -8;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(III)Lma;", line = 2981)
    public static final class12 method2399(int arg0, int arg1, int arg2) {
        class186 var3 = class80.field1136[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2841;
    }

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "()V", line = 2989)
    public void method498() {
        if (!this.field5581) {
            for (class184 var1 = this.field5483.method1195(0); var1 != null; var1 = this.field5483.method1201(2)) {
                ((class21) var1).method112(false);
            }
            Enumeration var2 = this.field5372.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method2326(var3, (byte) 98, this.field5372.get(var3));
            }
            class441.method2739(false, true, 16383);
            this.field5354.release();
            this.field5581 = true;
        }
        ++field5410;
    }

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "(Z)V", line = 3027)
    private final void method2400(boolean arg0) {
        this.method2413(arg0);
        ++field5378;
        if (arg0) {
            this.method2423((byte) 93);
        }
        if (this.field5631 != null) {
            this.field5631.method2630(true);
        }
    }

    @OriginalMember(owner = "client!wu", name = "H", descriptor = "(III[I)V", line = 3041)
    public final void method421(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5394;
        float var5 = this.field5542.method2717((float) arg2, (float) arg0, (float) arg1, -9555);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field5588;
            var7 = this.field5572;
        } else {
            var7 = (int) ((float) this.field5571 * this.field5542.method2732((float) arg2, (float) arg0, 0, (float) arg1) / var5);
            var6 = (int) ((float) this.field5561 * this.field5542.method2730((float) arg2, (float) arg1, 0, (float) arg0) / var5);
        }
        arg3[0] = (int) ((float) var7 - this.field5632);
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var6 + -this.field5563);
    }

    @OriginalMember(owner = "client!wu", name = "N", descriptor = "(I)V", line = 3069)
    private final void method2401(int arg0) {
        ++field5526;
        this.field5624 = false;
        this.method2383(true);
        if (arg0 != 3) {
            this.method2406(false);
        }
        if (class559.field7999 == this.field5557) {
            this.method2400(false);
        }
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(ZB)V", line = 3084)
    public final void method2402(boolean arg0, byte arg1) {
        int var3 = 27 / ((arg1 - -47) / 40);
        if (this.field5607 != arg0) {
            this.field5607 = arg0;
            this.method2374((byte) 63);
            this.field5647 &= -32;
        }
        ++field5470;
    }

    @OriginalMember(owner = "client!wu", name = "O", descriptor = "(I)V", line = 3102)
    private final void method2403(int arg0) {
        if (class10.field151 != this.field5557) {
            class340 var2 = this.field5557;
            this.field5557 = class10.field151;
            if (!var2.method2165(-7874)) {
                this.method2367((byte) 78);
            }
            this.method2316((byte) 113);
            this.field5643 = this.field5619;
            this.method2400(false);
            this.field5647 &= -8;
        }
        ++field5411;
        if (arg0 != 29553) {
            this.method501(31, (class609[]) null);
        }
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(BI)Ljf;", line = 3128)
    public final class216 method2404(byte arg0, int arg1) {
        int var3 = -103 % ((arg0 - -16) / 50);
        ++field5506;
        if (this.field5658.method1292(128) < arg1 * 2) {
            this.field5658.method1458((byte) 91, arg1);
        }
        return this.field5658;
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 3142)
    public final void method510(Canvas arg0) {
        ++field5521;
        if (this.field5361 == arg0) {
            throw new RuntimeException();
        } else if (this.field5372.containsKey(arg0)) {
            this.method2326(arg0, (byte) 114, this.field5372.get(arg0));
            this.field5372.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "(II)V", line = 3161)
    public final void method2405(int arg0, int arg1) {
        ++field5355;
        if (arg1 < 97) {
            this.field5600 = 109;
        }
        if (~this.field5623 != ~arg0) {
            class168 var3;
            boolean var4;
            boolean var5;
            if (~arg0 == -2) {
                var3 = class77.field1069;
                var4 = true;
                var5 = true;
            } else if (~arg0 == -3) {
                var3 = class224.field3303;
                var5 = false;
                var4 = true;
            } else if (arg0 != 128) {
                var5 = false;
                var3 = class518.field7393;
                var4 = false;
            } else {
                var5 = true;
                var3 = class547.field7807;
                var4 = true;
            }
            if (!var5 == this.field5595) {
                this.field5595 = var5;
                this.method2390(-124);
            }
            if (!this.field5650 == var4) {
                this.field5650 = var4;
                this.method2414(false);
            }
            if (this.field5593 != var3) {
                this.field5593 = var3;
                this.method2351(0);
            }
            this.field5623 = arg0;
            this.field5647 &= -29;
        }
    }

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "()Z", line = 3229)
    public final boolean method459() {
        ++field5522;
        return false;
    }

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "(Z)V", line = 3237)
    public final void method2406(boolean arg0) {
        this.field5539 = false;
        ++field5433;
        this.method2344(0);
        if (!arg0) {
            field5548 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILlf;I)V", line = 3249)
    public final void method2407(int arg0, class238 arg1, int arg2) {
        this.method2318(arg1, arg0, true, false);
        ++field5437;
        if (arg2 < 45) {
            this.field5569 = true;
        }
    }

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "()Z", line = 3267)
    public final boolean method456() {
        ++field5488;
        return true;
    }

    @OriginalMember(owner = "client!wu", name = "s", descriptor = "()Lql;", line = 3276)
    public final class738 method515() {
        ++field5418;
        return new class441();
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZIIBZI)V", line = 3288)
    private final void method2409(boolean arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        boolean var7 = arg0 & this.method483();
        ++field5445;
        if (!var7 && (~arg5 == -5 || arg5 == 8 || ~arg5 == -10)) {
            arg5 = 2;
            arg2 = arg5 != 4 ? 1 : 1 & arg1;
            arg1 = 0;
        }
        int var8 = -80 / ((arg3 - -18) / 62);
        if (~arg5 != -1 && arg4) {
            arg5 |= Integer.MIN_VALUE;
        }
        if (~this.field5634 != ~arg5) {
            if (this.field5634 != 0) {
                this.field5579[Integer.MAX_VALUE & this.field5634].method1450(-81);
            }
            if (~arg5 == -1) {
                this.field5631 = null;
            } else {
                this.field5631 = this.field5579[arg5 & Integer.MAX_VALUE];
                this.field5631.method1451(false, arg4);
                this.field5631.method1448(arg4, 0);
                this.field5631.method1453((byte) 114, arg1, arg2);
            }
            this.field5634 = arg5;
            this.field5591 = arg2;
            this.field5559 = arg1;
        } else if (this.field5634 != 0) {
            this.field5579[this.field5634 & Integer.MAX_VALUE].method1448(arg4, 0);
            if (~this.field5559 != ~arg1 || ~this.field5591 != ~arg2) {
                this.field5579[this.field5634 & Integer.MAX_VALUE].method1453((byte) 46, arg1, arg2);
                this.field5559 = arg1;
                this.field5591 = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "P", descriptor = "(I)V", line = 3347)
    public final void method2410(int arg0) {
        ++field5349;
        if (this.field5589[this.field5558] != class110.field1536) {
            this.field5589[this.field5558] = class110.field1536;
            this.field5636[this.field5558].method769();
            this.method2335((byte) 46);
        }
        if (arg0 != -1) {
            this.method2366(101);
        }
    }

    @OriginalMember(owner = "client!wu", name = "Q", descriptor = "(I)V", line = 3364)
    public final void method2411(int arg0) {
        if (this.field5647 != 8) {
            this.method2403(29553);
            this.method2402(true, (byte) -97);
            this.method2298((byte) -88, true);
            this.method2394(true, (byte) -104);
            this.method2405(1, 122);
            this.field5647 = 8;
        }
        if (arg0 > 25) {
            ++field5439;
        }
    }

    @OriginalMember(owner = "client!wu", name = "R", descriptor = "(I)V", line = 3384)
    public void method2412(int arg0) {
        this.method2313(false);
        if (arg0 == 0) {
            ++field5456;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 3401)
    public final class280 method477(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5393;
        return new class662(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "(I)V", line = 3413)
    public void method487(int arg0) {
        ++field5435;
        if (this.field5554 != null) {
            this.field5554.method1877(25410);
        }
        this.field5552 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "(II)V", line = 3425)
    public final void method2415(int arg0, int arg1) {
        if (~this.field5649 != ~arg0) {
            this.field5649 = arg0;
            this.method2423((byte) 126);
        }
        if (arg1 != 0) {
            this.method503(-17, 22, 14, 85, 108, 22);
        }
        ++field5520;
    }

    @OriginalMember(owner = "client!wu", name = "K", descriptor = "([I)V", line = 3444)
    public final void method530(int[] arg0) {
        arg0[0] = this.field5642;
        ++field5428;
        arg0[1] = this.field5580;
        arg0[3] = this.field5614;
        arg0[2] = this.field5630;
    }

    @OriginalMember(owner = "client!wu", name = "S", descriptor = "(I)I", line = 3455)
    public final int method2416(int arg0) {
        ++field5457;
        return arg0 != 1 ? 49 : this.field5562;
    }

    @OriginalMember(owner = "client!wu", name = "KA", descriptor = "(IIII)V", line = 3466)
    public final void method476(int arg0, int arg1, int arg2, int arg3) {
        ++field5440;
        if (arg0 <= 0 && ~(this.field5407 - 1) >= ~arg2 && ~arg1 >= -1 && this.field5502 + -1 <= arg3) {
            this.method469();
        } else {
            this.field5580 = arg1 < 0 ? 0 : arg1;
            this.field5614 = ~this.field5407 <= ~arg3 ? arg3 : 0;
            this.field5642 = ~arg0 <= -1 ? arg0 : 0;
            this.field5630 = this.field5407 < arg2 ? 0 : arg2;
            if (!this.field5676) {
                this.field5676 = true;
                this.method2373(false);
            }
            this.method2315(0);
            this.method2305((byte) 61);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(FFFIFFF)Z", line = 3493)
    private final boolean method2418(float arg0, float arg1, float arg2, int arg3, float arg4, float arg5, float arg6) {
        ++field5461;
        Buffer var8 = this.field5665.method1283((byte) 61, true);
        if (var8 == null) {
            return false;
        } else {
            if (arg3 >= -49) {
                this.field5624 = true;
            }
            Stream var9 = this.method2392(var8, -15232);
            if (!Stream.method3869()) {
                var9.method3864(arg4);
                var9.method3864(arg0);
                var9.method3864(arg6);
                var9.method3864(arg1);
                var9.method3864(arg5);
                var9.method3864(arg2);
            } else {
                var9.method3863(arg4);
                var9.method3863(arg0);
                var9.method3863(arg6);
                var9.method3863(arg1);
                var9.method3863(arg5);
                var9.method3863(arg2);
            }
            var9.method3872();
            return this.field5665.method1289((byte) 98);
        }
    }

    @OriginalMember(owner = "client!wu", name = "T", descriptor = "(I)I", line = 3533)
    public final int method2419(int arg0) {
        if (arg0 <= 43) {
            return -110;
        } else {
            ++field5459;
            return this.field5558;
        }
    }

    @OriginalMember(owner = "client!wu", name = "la", descriptor = "()V", line = 3546)
    public final void method469() {
        ++field5363;
        this.field5630 = this.field5407;
        this.field5642 = 0;
        this.field5614 = this.field5502;
        this.field5580 = 0;
        if (this.field5676) {
            this.field5676 = false;
            this.method2373(false);
        }
        this.method2305((byte) 61);
    }

    @OriginalMember(owner = "client!wu", name = "V", descriptor = "(I)V", line = 3570)
    public final void method2422(int arg0) {
        this.method2379(-119, class299.field4249, 2);
        ++field5503;
        if (arg0 != -25804) {
            this.field5658 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "L", descriptor = "(III)V", line = 3581)
    public final void method526(int arg0, int arg1, int arg2) {
        if (~this.field5637 != ~arg0 || this.field5620 != arg1 || ~this.field5626 != ~arg2) {
            this.field5637 = arg0;
            this.field5620 = arg1;
            this.field5626 = arg2;
            this.method2425(4);
            this.method2374((byte) 45);
        }
        ++field5409;
    }

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "()Z", line = 3598)
    public final boolean method475() {
        ++field5399;
        return true;
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 3618)
    public final void method455(Canvas arg0, int arg1, int arg2) {
        ++field5493;
        if (this.field5361 == arg0) {
            throw new RuntimeException();
        } else if (!this.field5372.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method2378(91, arg0);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field5372.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "t", descriptor = "()Z", line = 3660)
    public final boolean method518() {
        ++field5402;
        return this.field5610;
    }

    @OriginalMember(owner = "client!wu", name = "W", descriptor = "(I)V", line = 3669)
    private final void method2425(int arg0) {
        if (arg0 == 4) {
            if (this.field5631 != null) {
                this.field5631.method2498(true);
            }
            ++field5460;
            this.method2322(arg0 + -4);
        }
    }

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "(IIIIII)V", line = 3684)
    public final void method525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5528;
        float var7 = this.method2376((byte) -108);
        this.method2360((byte) -110);
        this.method2415(arg4, 0);
        this.method2329(0, (byte) -125, class469.field6850);
        this.method2407(0, class469.field6850, 53);
        this.method2405(arg5, 106);
        this.field5536.method2720((float) (arg2 - 1), 1.0F, 0, (float) (arg3 + -1));
        this.field5536.method2725((byte) -110, (float) arg0 + -var7, (float) arg1 + -var7, 0.0F);
        this.method2406(true);
        this.method2332(false, (byte) -66);
        this.method2379(-114, class413.field6213, 4);
        this.method2332(true, (byte) -77);
        this.method2407(0, class331.field4759, 101);
        this.method2329(0, (byte) -124, class331.field4759);
    }

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "(I)V")
    public abstract void method2292(int arg0);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method2295(byte arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "(I)V")
    public abstract void method2301(int arg0);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "([Lbq;I)Lsr;")
    public abstract class254 method2302(class290[] arg0, int arg1);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZIIII[BLpd;I)Lch;")
    public abstract class465 method2310(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, class259 arg6, int arg7);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BLok;Lpd;)Z")
    public abstract boolean method2311(byte arg0, class256 arg1, class259 arg2);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "([BIIZILpd;)Lkj;")
    public abstract class568 method2314(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4, class259 arg5);

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "(I)V")
    public abstract void method2315(int arg0);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Llf;IZZ)V")
    public abstract void method2318(class238 arg0, int arg1, boolean arg2, boolean arg3);

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "(I)V")
    public abstract void method2319(int arg0);

    @OriginalMember(owner = "client!wu", name = "q", descriptor = "(I)V")
    public abstract void method2320(int arg0);

    @OriginalMember(owner = "client!wu", name = "s", descriptor = "(I)V")
    public abstract void method2322(int arg0);

    @OriginalMember(owner = "client!wu", name = "u", descriptor = "(I)V")
    public abstract void method2324(int arg0);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIILjf;ILef;)V")
    public abstract void method2325(int arg0, int arg1, int arg2, int arg3, class216 arg4, int arg5, class489 arg6);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
    public abstract void method2326(Canvas arg0, byte arg1, Object arg2);

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "(II)V")
    public abstract void method2331(int arg0, int arg1);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZB)V")
    public abstract void method2332(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Llf;ZIZZ)V")
    public abstract void method2340(class238 arg0, boolean arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!wu", name = "y", descriptor = "(I)V")
    public abstract void method2341(int arg0);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lok;ILpd;ZI)Lch;")
    public abstract class465 method2343(class256 arg0, int arg1, class259 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILok;Lpd;)Z")
    public abstract boolean method2346(int arg0, class256 arg1, class259 arg2);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BLde;)V")
    public abstract void method2348(byte arg0, class533 arg1);

    @OriginalMember(owner = "client!wu", name = "C", descriptor = "(I)V")
    public abstract void method2351(int arg0);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z[FIILpd;III)Lch;")
    public abstract class465 method2352(boolean arg0, float[] arg1, int arg2, int arg3, class259 arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/Object;ZLjava/awt/Canvas;)V")
    public abstract void method2354(Object arg0, boolean arg1, Canvas arg2);

    @OriginalMember(owner = "client!wu", name = "D", descriptor = "(I)V")
    public abstract void method2356(int arg0);

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(IZ)Ljf;")
    public abstract class216 method2362(int arg0, boolean arg1);

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "(B)V")
    public abstract void method2365(byte arg0);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lsr;B)V")
    public abstract void method2368(class254 arg0, byte arg1);

    @OriginalMember(owner = "client!wu", name = "q", descriptor = "(B)V")
    public abstract void method2369(byte arg0);

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "(B)V")
    public abstract void method2370(byte arg0);

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "(Z)V")
    public abstract void method2373(boolean arg0);

    @OriginalMember(owner = "client!wu", name = "s", descriptor = "(B)V")
    public abstract void method2374(byte arg0);

    @OriginalMember(owner = "client!wu", name = "t", descriptor = "(B)F")
    public abstract float method2376(byte arg0);

    @OriginalMember(owner = "client!wu", name = "u", descriptor = "(B)V")
    public abstract void method2377(byte arg0);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method2378(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!wu", name = "v", descriptor = "(B)V")
    public abstract void method2381(byte arg0);

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(ZI)Lll;")
    public abstract class366 method2384(boolean arg0, int arg1);

    @OriginalMember(owner = "client!wu", name = "w", descriptor = "(B)V")
    public abstract void method2387(byte arg0);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IBLll;)V")
    public abstract void method2389(int arg0, byte arg1, class366 arg2);

    @OriginalMember(owner = "client!wu", name = "K", descriptor = "(I)V")
    public abstract void method2390(int arg0);

    @OriginalMember(owner = "client!wu", name = "y", descriptor = "(B)V")
    public abstract void method2397(byte arg0);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lef;BII)V")
    public abstract void method2408(class489 arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "(Z)V")
    public abstract void method2413(boolean arg0);

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "(Z)V")
    public abstract void method2414(boolean arg0);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZII[III)Lch;")
    public abstract class465 method2417(int arg0, boolean arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!wu", name = "U", descriptor = "(I)V")
    public abstract void method2420(int arg0);

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "(B)V")
    public abstract void method2421(byte arg0);

    @OriginalMember(owner = "client!wu", name = "A", descriptor = "(B)V")
    public abstract void method2423(byte arg0);

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "([[IIZZ)Lpf;")
    public abstract class584 method2424(int[][] arg0, int arg1, boolean arg2, boolean arg3);
}
