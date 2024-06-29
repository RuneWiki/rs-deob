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

@OriginalClass("client!ij")
public abstract class class424 extends class60 {

    @OriginalMember(owner = "client!ij", name = "nd", descriptor = "Lfh;")
    private class653 field5535 = new class653();

    @OriginalMember(owner = "client!ij", name = "Vd", descriptor = "Z")
    public boolean field5569 = true;

    @OriginalMember(owner = "client!ij", name = "Md", descriptor = "Lgk;")
    public class477 field5560 = new class477();

    @OriginalMember(owner = "client!ij", name = "ee", descriptor = "Lgk;")
    public class477 field5578 = new class477();

    @OriginalMember(owner = "client!ij", name = "ge", descriptor = "Lgk;")
    public class477 field5580 = new class477();

    @OriginalMember(owner = "client!ij", name = "he", descriptor = "Lgk;")
    public class477 field5581 = new class477();

    @OriginalMember(owner = "client!ij", name = "ie", descriptor = "Lgk;")
    private class477 field5582 = new class477();

    @OriginalMember(owner = "client!ij", name = "je", descriptor = "Lgk;")
    private class477 field5583 = new class477();

    @OriginalMember(owner = "client!ij", name = "qe", descriptor = "[F")
    public float[] field5590 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!ij", name = "Ke", descriptor = "F")
    public float field5610 = -1.0F;

    @OriginalMember(owner = "client!ij", name = "Ee", descriptor = "F")
    private float field5604 = 1.0F;

    @OriginalMember(owner = "client!ij", name = "we", descriptor = "[F")
    public float[] field5596 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ij", name = "Ue", descriptor = "F")
    public float field5620 = 1.0F;

    @OriginalMember(owner = "client!ij", name = "Xe", descriptor = "I")
    public int field5623 = 0;

    @OriginalMember(owner = "client!ij", name = "Be", descriptor = "Leo;")
    public class300 field5601 = class287.field3605;

    @OriginalMember(owner = "client!ij", name = "Ze", descriptor = "I")
    public int field5625 = 0;

    @OriginalMember(owner = "client!ij", name = "De", descriptor = "Z")
    public boolean field5603 = false;

    @OriginalMember(owner = "client!ij", name = "bf", descriptor = "Z")
    public boolean field5627 = true;

    @OriginalMember(owner = "client!ij", name = "Qe", descriptor = "Z")
    public boolean field5616 = false;

    @OriginalMember(owner = "client!ij", name = "nf", descriptor = "Z")
    public boolean field5638 = false;

    @OriginalMember(owner = "client!ij", name = "ue", descriptor = "I")
    private int field5594 = 16777215;

    @OriginalMember(owner = "client!ij", name = "cf", descriptor = "I")
    public int field5628 = 0;

    @OriginalMember(owner = "client!ij", name = "xe", descriptor = "F")
    public float field5597 = 3584.0F;

    @OriginalMember(owner = "client!ij", name = "kf", descriptor = "[Lgda;")
    private class55[] field5635 = new class55[10];

    @OriginalMember(owner = "client!ij", name = "Ae", descriptor = "F")
    public float field5600 = 1.0F;

    @OriginalMember(owner = "client!ij", name = "ke", descriptor = "F")
    public float field5584 = 3584.0F;

    @OriginalMember(owner = "client!ij", name = "df", descriptor = "[F")
    private float[] field5629 = new float[16];

    @OriginalMember(owner = "client!ij", name = "mf", descriptor = "I")
    public int field5637 = 3;

    @OriginalMember(owner = "client!ij", name = "Te", descriptor = "I")
    private int field5619 = -1;

    @OriginalMember(owner = "client!ij", name = "Ne", descriptor = "[F")
    private float[] field5613 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ij", name = "Se", descriptor = "I")
    private int field5618 = -1;

    @OriginalMember(owner = "client!ij", name = "pf", descriptor = "I")
    private int field5640 = -1;

    @OriginalMember(owner = "client!ij", name = "Kf", descriptor = "I")
    public int field5661 = 3584;

    @OriginalMember(owner = "client!ij", name = "pe", descriptor = "I")
    public int field5589 = 50;

    @OriginalMember(owner = "client!ij", name = "Bf", descriptor = "I")
    private int field5652 = 0;

    @OriginalMember(owner = "client!ij", name = "If", descriptor = "I")
    public int field5659 = 0;

    @OriginalMember(owner = "client!ij", name = "sf", descriptor = "I")
    public int field5643 = 512;

    @OriginalMember(owner = "client!ij", name = "Pe", descriptor = "I")
    private int field5615 = 0;

    @OriginalMember(owner = "client!ij", name = "Fe", descriptor = "Z")
    private boolean field5605 = false;

    @OriginalMember(owner = "client!ij", name = "gf", descriptor = "I")
    public int field5632 = 0;

    @OriginalMember(owner = "client!ij", name = "Me", descriptor = "I")
    public int field5612 = 0;

    @OriginalMember(owner = "client!ij", name = "Hf", descriptor = "Z")
    private boolean field5658 = false;

    @OriginalMember(owner = "client!ij", name = "Lf", descriptor = "[F")
    private float[] field5662 = new float[16];

    @OriginalMember(owner = "client!ij", name = "Gf", descriptor = "Z")
    public boolean field5657 = true;

    @OriginalMember(owner = "client!ij", name = "Cf", descriptor = "I")
    public int field5653 = 0;

    @OriginalMember(owner = "client!ij", name = "Of", descriptor = "Z")
    private boolean field5665 = false;

    @OriginalMember(owner = "client!ij", name = "ze", descriptor = "I")
    public int field5599 = -1;

    @OriginalMember(owner = "client!ij", name = "Ff", descriptor = "F")
    public float field5656 = 1.0F;

    @OriginalMember(owner = "client!ij", name = "tf", descriptor = "I")
    public int field5644 = -1;

    @OriginalMember(owner = "client!ij", name = "ne", descriptor = "Z")
    public boolean field5587 = true;

    @OriginalMember(owner = "client!ij", name = "Yf", descriptor = "Z")
    public boolean field5675 = true;

    @OriginalMember(owner = "client!ij", name = "ag", descriptor = "Z")
    public boolean field5677 = true;

    @OriginalMember(owner = "client!ij", name = "Re", descriptor = "Z")
    private boolean field5617 = false;

    @OriginalMember(owner = "client!ij", name = "Ve", descriptor = "[F")
    private float[] field5621 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ij", name = "bg", descriptor = "[F")
    private float[] field5678 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!ij", name = "zf", descriptor = "F")
    public float field5650 = 1.0F;

    @OriginalMember(owner = "client!ij", name = "Rf", descriptor = "I")
    private int field5668 = 1;

    @OriginalMember(owner = "client!ij", name = "ef", descriptor = "Lbda;")
    public class508 field5630 = class514.field7213;

    @OriginalMember(owner = "client!ij", name = "Pf", descriptor = "I")
    public int field5666 = 512;

    @OriginalMember(owner = "client!ij", name = "Uf", descriptor = "I")
    private int field5671 = 0;

    @OriginalMember(owner = "client!ij", name = "Sf", descriptor = "F")
    public float field5669 = -1.0F;

    @OriginalMember(owner = "client!ij", name = "Jf", descriptor = "I")
    public int field5660 = 0;

    @OriginalMember(owner = "client!ij", name = "Xf", descriptor = "I")
    public int field5674 = 0;

    @OriginalMember(owner = "client!ij", name = "eg", descriptor = "Z")
    private boolean field5681 = false;

    @OriginalMember(owner = "client!ij", name = "Mf", descriptor = "I")
    public int field5663 = 8;

    @OriginalMember(owner = "client!ij", name = "af", descriptor = "Z")
    private boolean field5626 = false;

    @OriginalMember(owner = "client!ij", name = "uf", descriptor = "I")
    public int field5645 = 128;

    @OriginalMember(owner = "client!ij", name = "Je", descriptor = "[F")
    public float[] field5609 = this.field5621;

    @OriginalMember(owner = "client!ij", name = "se", descriptor = "I")
    private int field5592 = 0;

    @OriginalMember(owner = "client!ij", name = "Qf", descriptor = "[F")
    private float[] field5667 = new float[16];

    @OriginalMember(owner = "client!ij", name = "le", descriptor = "Z")
    public boolean field5585 = false;

    @OriginalMember(owner = "client!ij", name = "hg", descriptor = "I")
    public int field5684 = 0;

    @OriginalMember(owner = "client!ij", name = "Ye", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5624 = new Stream();

    @OriginalMember(owner = "client!ij", name = "Bg", descriptor = "Lgk;")
    private class477 field5704 = new class477();

    @OriginalMember(owner = "client!ij", name = "zd", descriptor = "Ljava/lang/Object;")
    public Object field5547;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "Ljava/lang/Object;")
    private Object field5401;

    @OriginalMember(owner = "client!ij", name = "Hb", descriptor = "Lnd;")
    public class547 field5451;

    @OriginalMember(owner = "client!ij", name = "Sc", descriptor = "Ljava/awt/Canvas;")
    public Canvas field5514;

    @OriginalMember(owner = "client!ij", name = "jc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5479;

    @OriginalMember(owner = "client!ij", name = "dg", descriptor = "I")
    public int field5680;

    @OriginalMember(owner = "client!ij", name = "fg", descriptor = "I")
    public int field5682;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    private int field5386;

    @OriginalMember(owner = "client!ij", name = "Bb", descriptor = "I")
    public int field5445;

    @OriginalMember(owner = "client!ij", name = "wb", descriptor = "I")
    private int field5440;

    @OriginalMember(owner = "client!ij", name = "yc", descriptor = "I")
    public int field5494;

    @OriginalMember(owner = "client!ij", name = "Le", descriptor = "Laba;")
    private class178 field5611;

    @OriginalMember(owner = "client!ij", name = "bb", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field5419;

    @OriginalMember(owner = "client!ij", name = "te", descriptor = "F")
    private float field5593;

    @OriginalMember(owner = "client!ij", name = "ve", descriptor = "F")
    public float field5595;

    @OriginalMember(owner = "client!ij", name = "ye", descriptor = "F")
    public float field5598;

    @OriginalMember(owner = "client!ij", name = "Ce", descriptor = "F")
    public float field5602;

    @OriginalMember(owner = "client!ij", name = "He", descriptor = "F")
    public float field5607;

    @OriginalMember(owner = "client!ij", name = "Oe", descriptor = "F")
    public float field5614;

    @OriginalMember(owner = "client!ij", name = "qf", descriptor = "F")
    private float field5641;

    @OriginalMember(owner = "client!ij", name = "wf", descriptor = "F")
    public float field5647;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!ij", name = "V", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!ij", name = "Y", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!ij", name = "Z", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!ij", name = "ab", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!ij", name = "cb", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!ij", name = "db", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!ij", name = "eb", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!ij", name = "fb", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!ij", name = "gb", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!ij", name = "hb", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!ij", name = "ib", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!ij", name = "jb", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!ij", name = "kb", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!ij", name = "lb", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!ij", name = "mb", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!ij", name = "nb", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!ij", name = "ob", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!ij", name = "pb", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!ij", name = "qb", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!ij", name = "rb", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!ij", name = "sb", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!ij", name = "tb", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!ij", name = "ub", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!ij", name = "vb", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!ij", name = "xb", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!ij", name = "yb", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!ij", name = "zb", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!ij", name = "Ab", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!ij", name = "Cb", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!ij", name = "Db", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!ij", name = "Fb", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!ij", name = "Gb", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!ij", name = "Ib", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!ij", name = "Jb", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!ij", name = "Kb", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!ij", name = "Lb", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!ij", name = "Mb", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!ij", name = "Nb", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!ij", name = "Ob", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!ij", name = "Pb", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!ij", name = "Qb", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!ij", name = "Rb", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!ij", name = "Sb", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!ij", name = "Tb", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!ij", name = "Ub", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!ij", name = "Vb", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!ij", name = "Wb", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!ij", name = "Xb", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!ij", name = "Yb", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!ij", name = "Zb", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!ij", name = "ac", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!ij", name = "bc", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!ij", name = "cc", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!ij", name = "dc", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!ij", name = "ec", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!ij", name = "fc", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!ij", name = "gc", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!ij", name = "hc", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!ij", name = "ic", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!ij", name = "kc", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!ij", name = "lc", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!ij", name = "mc", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!ij", name = "nc", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!ij", name = "oc", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!ij", name = "pc", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!ij", name = "qc", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!ij", name = "rc", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!ij", name = "sc", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!ij", name = "tc", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!ij", name = "uc", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!ij", name = "vc", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!ij", name = "wc", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!ij", name = "xc", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!ij", name = "zc", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!ij", name = "Ac", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!ij", name = "Bc", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!ij", name = "Cc", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!ij", name = "Dc", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!ij", name = "Ec", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!ij", name = "Fc", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!ij", name = "Hc", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!ij", name = "Ic", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!ij", name = "Jc", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!ij", name = "Kc", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!ij", name = "Lc", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!ij", name = "Mc", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!ij", name = "Nc", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!ij", name = "Oc", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!ij", name = "Pc", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!ij", name = "Qc", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!ij", name = "Rc", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!ij", name = "Tc", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!ij", name = "Uc", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!ij", name = "Vc", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!ij", name = "Wc", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!ij", name = "Xc", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!ij", name = "Yc", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!ij", name = "Zc", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!ij", name = "ad", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!ij", name = "bd", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!ij", name = "cd", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!ij", name = "dd", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!ij", name = "ed", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!ij", name = "fd", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!ij", name = "gd", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!ij", name = "hd", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!ij", name = "id", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!ij", name = "jd", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!ij", name = "kd", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!ij", name = "ld", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!ij", name = "md", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!ij", name = "od", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!ij", name = "pd", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!ij", name = "qd", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!ij", name = "rd", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!ij", name = "sd", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!ij", name = "td", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!ij", name = "ud", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!ij", name = "vd", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!ij", name = "wd", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!ij", name = "xd", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!ij", name = "yd", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!ij", name = "Ad", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!ij", name = "Bd", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!ij", name = "Cd", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!ij", name = "Dd", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!ij", name = "Ed", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!ij", name = "Fd", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!ij", name = "Hd", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!ij", name = "Id", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!ij", name = "Jd", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!ij", name = "Kd", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!ij", name = "Ld", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!ij", name = "Nd", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!ij", name = "Od", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!ij", name = "Pd", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!ij", name = "Qd", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!ij", name = "Rd", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!ij", name = "Sd", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!ij", name = "Td", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!ij", name = "Ud", descriptor = "I")
    public int field5568;

    @OriginalMember(owner = "client!ij", name = "Wd", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!ij", name = "Xd", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!ij", name = "Yd", descriptor = "I")
    public int field5572;

    @OriginalMember(owner = "client!ij", name = "Zd", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!ij", name = "ae", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!ij", name = "be", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!ij", name = "ce", descriptor = "I")
    public int field5576;

    @OriginalMember(owner = "client!ij", name = "de", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!ij", name = "fe", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!ij", name = "me", descriptor = "I")
    public int field5586;

    @OriginalMember(owner = "client!ij", name = "We", descriptor = "I")
    public int field5622;

    @OriginalMember(owner = "client!ij", name = "hf", descriptor = "I")
    public int field5633;

    @OriginalMember(owner = "client!ij", name = "lf", descriptor = "I")
    public int field5636;

    @OriginalMember(owner = "client!ij", name = "of", descriptor = "I")
    private int field5639;

    @OriginalMember(owner = "client!ij", name = "rf", descriptor = "I")
    public int field5642;

    @OriginalMember(owner = "client!ij", name = "Tf", descriptor = "I")
    public int field5670;

    @OriginalMember(owner = "client!ij", name = "Zf", descriptor = "I")
    public int field5676;

    @OriginalMember(owner = "client!ij", name = "cg", descriptor = "I")
    public int field5679;

    @OriginalMember(owner = "client!ij", name = "gg", descriptor = "I")
    private int field5683;

    @OriginalMember(owner = "client!ij", name = "Eg", descriptor = "I")
    private int field5707;

    @OriginalMember(owner = "client!ij", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!ij", name = "ig", descriptor = "Lri;")
    public class114 field5685;

    @OriginalMember(owner = "client!ij", name = "jg", descriptor = "Lri;")
    private class114 field5686;

    @OriginalMember(owner = "client!ij", name = "kg", descriptor = "Lri;")
    private class114 field5687;

    @OriginalMember(owner = "client!ij", name = "og", descriptor = "Lri;")
    public class114 field5691;

    @OriginalMember(owner = "client!ij", name = "pg", descriptor = "Lri;")
    public class114 field5692;

    @OriginalMember(owner = "client!ij", name = "zg", descriptor = "Lri;")
    private class114 field5702;

    @OriginalMember(owner = "client!ij", name = "Dg", descriptor = "Lri;")
    public class114 field5706;

    @OriginalMember(owner = "client!ij", name = "Vf", descriptor = "Lfaa;")
    private class157 field5672;

    @OriginalMember(owner = "client!ij", name = "Ge", descriptor = "Lrk;")
    private class33 field5606;

    @OriginalMember(owner = "client!ij", name = "Cg", descriptor = "Liaa;")
    private class497 field5705;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "Ltp;")
    public static class536 field5399;

    @OriginalMember(owner = "client!ij", name = "mg", descriptor = "Lnda;")
    public class559 field5689;

    @OriginalMember(owner = "client!ij", name = "ng", descriptor = "Lnda;")
    public class559 field5690;

    @OriginalMember(owner = "client!ij", name = "qg", descriptor = "Lnda;")
    public class559 field5693;

    @OriginalMember(owner = "client!ij", name = "sg", descriptor = "Lnda;")
    public class559 field5695;

    @OriginalMember(owner = "client!ij", name = "tg", descriptor = "Lnda;")
    public class559 field5696;

    @OriginalMember(owner = "client!ij", name = "ug", descriptor = "Lnda;")
    public class559 field5697;

    @OriginalMember(owner = "client!ij", name = "vg", descriptor = "Lnda;")
    public class559 field5698;

    @OriginalMember(owner = "client!ij", name = "xg", descriptor = "Lnda;")
    public class559 field5700;

    @OriginalMember(owner = "client!ij", name = "yg", descriptor = "Lnda;")
    public class559 field5701;

    @OriginalMember(owner = "client!ij", name = "Ag", descriptor = "Lnda;")
    public class559 field5703;

    @OriginalMember(owner = "client!ij", name = "Af", descriptor = "Lgda;")
    private class55 field5651;

    @OriginalMember(owner = "client!ij", name = "xf", descriptor = "Lfe;")
    public class572 field5648;

    @OriginalMember(owner = "client!ij", name = "lg", descriptor = "Lia;")
    private class591 field5688;

    @OriginalMember(owner = "client!ij", name = "rg", descriptor = "Lia;")
    private class591 field5694;

    @OriginalMember(owner = "client!ij", name = "wg", descriptor = "Lia;")
    private class591 field5699;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "Ltn;")
    public class88 field5407;

    @OriginalMember(owner = "client!ij", name = "Gd", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field5554;

    @OriginalMember(owner = "client!ij", name = "Eb", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field5448;

    @OriginalMember(owner = "client!ij", name = "Gc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field5502;

    @OriginalMember(owner = "client!ij", name = "oe", descriptor = "Z")
    public boolean field5588;

    @OriginalMember(owner = "client!ij", name = "re", descriptor = "Z")
    public boolean field5591;

    @OriginalMember(owner = "client!ij", name = "Ie", descriptor = "Z")
    public boolean field5608;

    @OriginalMember(owner = "client!ij", name = "ff", descriptor = "Z")
    public boolean field5631;

    @OriginalMember(owner = "client!ij", name = "vf", descriptor = "Z")
    public boolean field5646;

    @OriginalMember(owner = "client!ij", name = "Fg", descriptor = "Z")
    public boolean field5708;

    @OriginalMember(owner = "client!ij", name = "Ef", descriptor = "[Llaa;")
    public class123[] field5655;

    @OriginalMember(owner = "client!ij", name = "yf", descriptor = "[Lpfa;")
    public class299[] field5649;

    @OriginalMember(owner = "client!ij", name = "Df", descriptor = "[Lpfa;")
    public class299[] field5654;

    @OriginalMember(owner = "client!ij", name = "jf", descriptor = "[Len;")
    public class322[] field5634;

    @OriginalMember(owner = "client!ij", name = "Wf", descriptor = "[Lgk;")
    public class477[] field5673;

    @OriginalMember(owner = "client!ij", name = "Nf", descriptor = "[Lfe;")
    private class572[] field5664;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "(I)Lgk;", line = 7)
    public final class477 method2357(int arg0) {
        if (arg0 != 30513) {
            this.field5596 = null;
        }
        ++field5540;
        return this.field5582;
    }

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "(I)V", line = 20)
    private final void method2358(int arg0) {
        if (arg0 != 1) {
            this.field5604 = -0.018015087F;
        }
        if (!this.field5665) {
            float[] var2 = this.field5629;
            float var3 = (float) this.field5589;
            float var4 = (float) this.field5661;
            float var5 = (float) (-this.field5632) * this.field5604 / (float) this.field5643;
            float var6 = (float) (-this.field5684) * this.field5604 / (float) this.field5666;
            float var7 = (float) (-this.field5684 + this.field5445) * this.field5604 / (float) this.field5666;
            float var8 = (float) (-this.field5632 + this.field5494) * this.field5604 / (float) this.field5643;
            if (var6 != var7 && var5 != var8) {
                var2[5] = 2.0F / (var8 - var5);
                var2[3] = 0.0F;
                var2[8] = 0.0F;
                var2[4] = 0.0F;
                var2[14] = var3 / (-var4 + var3);
                var2[7] = 0.0F;
                var2[9] = 0.0F;
                var2[0] = 2.0F / (-var6 + var7);
                var2[15] = 1.0F;
                var2[13] = (var5 + var8) / (-var5 + var8);
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[10] = 1.0F / (var3 - var4);
                var2[6] = 0.0F;
                var2[12] = (var6 + var7) / (-var7 + var6);
                var2[11] = 0.0F;
            } else {
                var2[6] = 0.0F;
                var2[15] = 1.0F;
                var2[12] = 0.0F;
                var2[14] = 0.0F;
                var2[11] = 0.0F;
                var2[13] = 0.0F;
                var2[2] = 0.0F;
                var2[1] = 0.0F;
                var2[5] = 1.0F;
                var2[9] = 0.0F;
                var2[10] = 1.0F;
                var2[3] = 0.0F;
                var2[8] = 0.0F;
                var2[4] = 0.0F;
                var2[0] = 1.0F;
                var2[7] = 0.0F;
            }
            this.method2434(true);
            this.field5665 = true;
        }
        ++field5513;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZI)Ljaclib/memory/heap/NativeHeapBuffer;", line = 90)
    public final NativeHeapBuffer method2359(int arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            this.field5535 = null;
        }
        ++field5443;
        return this.field5554.method3781(arg0, arg1);
    }

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "(I)V", line = 104)
    private final void method2360(int arg0) {
        ++field5463;
        if (!this.field5626) {
            float[] var2 = this.field5662;
            this.field5626 = true;
            if (this.field5445 != 0 && this.field5494 != 0) {
                var2[14] = 0.5F;
                var2[1] = 0.0F;
                var2[9] = 0.0F;
                var2[4] = 0.0F;
                var2[15] = 1.0F;
                var2[7] = 0.0F;
                var2[11] = 0.0F;
                var2[12] = -1.0F;
                var2[0] = 2.0F / (float) this.field5445;
                var2[6] = 0.0F;
                var2[3] = 0.0F;
                var2[5] = -2.0F / (float) this.field5494;
                var2[13] = 1.0F;
                var2[2] = 0.0F;
                var2[8] = 0.0F;
                var2[10] = 0.5F;
            } else {
                var2[4] = 0.0F;
                var2[10] = 1.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[1] = 0.0F;
                var2[8] = 0.0F;
                var2[11] = 0.0F;
                var2[3] = 0.0F;
                var2[15] = 1.0F;
                var2[0] = 1.0F;
                var2[5] = 1.0F;
                var2[9] = 0.0F;
                var2[12] = 0.0F;
                var2[13] = 0.0F;
                var2[6] = 0.0F;
                var2[14] = 0.0F;
            }
        }
        if (arg0 != 6) {
            this.method484(-6, -78);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 162)
    public final void method495(Canvas arg0, int arg1, int arg2) {
        ++field5422;
        Object var4 = null;
        if (arg0 != null && this.field5514 != arg0) {
            if (this.field5502.containsKey(arg0)) {
                var4 = this.field5502.get(arg0);
            }
        } else {
            var4 = this.field5401;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method2009((byte) -30, arg0, var4);
            if (this.field5479 == arg0) {
                this.method2416(true);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "(IIIIIII)I", line = 189)
    public final int method501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5500;
        int var8 = 0;
        float var9 = (float) arg2 * this.field5578.field6495 + (float) arg0 * this.field5578.field6482 + (float) arg1 * this.field5578.field6481 + this.field5578.field6502;
        float var10 = (float) arg5 * this.field5578.field6495 + (float) arg3 * this.field5578.field6482 + (float) arg4 * this.field5578.field6481 + this.field5578.field6502;
        if (var9 < (float) this.field5589 && var10 < (float) this.field5589) {
            var8 |= 16;
        } else if (var9 > (float) this.field5661 && (float) this.field5661 < var10) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field5578.field6464 + (float) arg0 * this.field5578.field6457 + (float) arg1 * this.field5578.field6488 + this.field5578.field6486) * (float) this.field5666 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field5578.field6464 + (float) arg3 * this.field5578.field6457 + (float) arg4 * this.field5578.field6488 + this.field5578.field6486) * (float) this.field5666 / (float) arg6);
        if (this.field5595 > (float) var11 && (float) var12 < this.field5595) {
            var8 |= 1;
        } else if (this.field5614 < (float) var11 && this.field5614 < (float) var12) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field5578.field6470 + (float) arg0 * this.field5578.field6473 + (float) arg1 * this.field5578.field6491 + this.field5578.field6460) * (float) this.field5643 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field5578.field6470 + (float) arg3 * this.field5578.field6473 + (float) arg4 * this.field5578.field6491 + this.field5578.field6460) * (float) this.field5643 / (float) arg6);
        if ((float) var13 < this.field5647 && (float) var14 < this.field5647) {
            var8 |= 4;
        } else if ((float) var13 > this.field5602 && (float) var14 > this.field5602) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "(I)V", line = 234)
    private final void method2361(int arg0) {
        this.method2041(0, this.field5688, (byte) 73);
        ++field5410;
        int var2 = -70 % ((arg0 - -54) / 43);
        this.method2033(17069, this.field5687);
        this.method2004(class551.field7702, 1, 0, -127);
    }

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "()Z", line = 247)
    public final boolean method513() {
        ++field5400;
        return true;
    }

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "(I)V", line = 255)
    private final void method2362(int arg0) {
        if (arg0 != 0) {
            this.field5560 = null;
        }
        ++field5411;
        if (this.field5651 != null) {
            this.field5651.method403((byte) 119);
        }
        this.method1997((byte) 36);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lsl;B)Lgq;", line = 269)
    public static final class517 method2363(class461 arg0, byte arg1) {
        ++field5482;
        int var2 = arg0.method2566(-2);
        class91 var3 = class94.method762(arg1 + -60)[arg0.method2600((byte) -124)];
        class599 var4 = class680.method3832(-17399)[arg0.method2600((byte) -126)];
        int var5 = arg0.method2577(2);
        int var6 = arg0.method2577(2);
        if (arg1 != 61) {
            method2363((class461) null, (byte) 26);
        }
        return new class517(var2, var3, var4, var5, var6);
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)Lgk;", line = 290)
    public final class477 method2364(byte arg0) {
        ++field5573;
        if (arg0 != -127) {
            this.method2388((byte) 83, false);
        }
        return this.field5673[this.field5653];
    }

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "(I)V", line = 301)
    private final void method2365(int arg0) {
        this.field5614 = (float) (this.field5674 - this.field5684);
        this.field5595 = (float) (-this.field5684 + this.field5625);
        this.field5602 = (float) (-this.field5632 + this.field5628);
        ++field5506;
        int var2 = 13 / ((arg0 - 35) / 62);
        this.field5647 = (float) (-this.field5632 + this.field5612);
    }

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "(I)V", line = 315)
    private final void method2366(int arg0) {
        ++field5570;
        if (class589.field8249 != this.field5601) {
            class300 var2 = this.field5601;
            this.field5601 = class589.field8249;
            if (var2.method1795(-1)) {
                this.method2439(-3057);
            }
            this.method2360(6);
            this.field5609 = this.field5662;
            this.method2402((byte) -60);
            this.field5639 &= -25;
        }
        if (arg0 != 14833) {
            this.method2358(39);
        }
    }

    @OriginalMember(owner = "client!ij", name = "xa", descriptor = "(F)V", line = 340)
    public final void method511(float arg0) {
        ++field5544;
        if (this.field5650 != arg0) {
            this.field5650 = arg0;
            this.field5419.setAmbient(arg0);
            this.method1986((byte) 127);
            this.method1988((byte) 109);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZI)V", line = 355)
    public final void method2367(boolean arg0, int arg1) {
        ++field5536;
        if (arg1 != -32) {
            method2427((String[]) null, (short[]) null, -122);
        }
        if (!arg0 != !this.field5588) {
            this.field5588 = arg0;
            this.method2040((byte) -7);
            this.field5639 &= -32;
        }
    }

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "([I)V", line = 374)
    public final void method483(int[] arg0) {
        arg0[0] = this.field5625;
        arg0[3] = this.field5628;
        ++field5483;
        arg0[2] = this.field5674;
        arg0[1] = this.field5612;
    }

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "()Z", line = 386)
    public final boolean method519() {
        ++field5481;
        return this.field5608;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZI[B)I", line = 395)
    public static final int method2368(boolean arg0, int arg1, byte[] arg2) {
        if (!arg0) {
            method2427((String[]) null, (short[]) null, 43);
        }
        ++field5384;
        return class394.method2218(arg2, 0, !arg0, arg1);
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)V", line = 406)
    public void method2017(byte arg0) {
        ++field5511;
        if (arg0 != 36) {
            this.field5620 = 1.4090028F;
        }
        this.field5676 = this.field5622;
        this.field5622 = 0;
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(Z)[F", line = 418)
    public final float[] method2369(boolean arg0) {
        if (arg0) {
            this.method2425((byte) -95);
        }
        ++field5498;
        return this.field5621;
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(B)Lnn;", line = 432)
    public final class418 method2370(byte arg0) {
        if (arg0 <= 11) {
            this.field5641 = 1.8689685F;
        }
        ++field5442;
        return this.field5606 != null ? this.field5606.method220((byte) 67) : null;
    }

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "(IIIII)V", line = 443)
    public final void method477(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5469;
        this.method438(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(B)V", line = 453)
    private final void method2371(byte arg0) {
        this.field5667[10] = this.field5641;
        this.field5667[14] = this.field5593;
        ++field5541;
        if (arg0 > -40) {
            this.field5401 = null;
        }
        this.field5597 = (this.field5667[14] + (float) (-this.field5661)) / this.field5667[10];
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II[I[I)Laa;", line = 470)
    public final class489 method487(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field5449;
        return class193.method1286(arg3, arg1, this, arg0, 0, arg2);
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(Z)Lgk;", line = 481)
    public final class477 method2372(boolean arg0) {
        ++field5427;
        return !arg0 ? null : this.field5560;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)V", line = 492)
    public final void method2373(int arg0, boolean arg1) {
        ++field5409;
        if (arg0 != 14) {
            this.field5606 = null;
        }
        if (!this.field5585 == arg1) {
            this.field5585 = arg1;
            this.method1991(false);
            this.field5639 &= -32;
        }
    }

    @OriginalMember(owner = "client!ij", name = "JA", descriptor = "(IIIIII)I", line = 513)
    public final int method529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5434;
        int var7 = 0;
        float var8 = (float) arg2 * this.field5578.field6495 + (float) arg0 * this.field5578.field6482 + (float) arg1 * this.field5578.field6481 + this.field5578.field6502;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field5578.field6495 + (float) arg3 * this.field5578.field6482 + (float) arg4 * this.field5578.field6481 + this.field5578.field6502;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field5589 > var8 && var9 < (float) this.field5589) {
            var7 |= 16;
        } else if ((float) this.field5661 < var8 && var9 > (float) this.field5661) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field5578.field6464 + (float) arg0 * this.field5578.field6457 + (float) arg1 * this.field5578.field6488 + this.field5578.field6486) * (float) this.field5666 / var8);
        int var11 = (int) (((float) arg5 * this.field5578.field6464 + (float) arg3 * this.field5578.field6457 + (float) arg4 * this.field5578.field6488 + this.field5578.field6486) * (float) this.field5666 / var9);
        if ((float) var10 < this.field5595 && this.field5595 > (float) var11) {
            var7 |= 1;
        } else if (this.field5614 < (float) var10 && this.field5614 < (float) var11) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field5578.field6470 + (float) arg0 * this.field5578.field6473 + (float) arg1 * this.field5578.field6491 + this.field5578.field6460) * (float) this.field5643 / var8);
        int var13 = (int) (((float) arg5 * this.field5578.field6470 + (float) arg3 * this.field5578.field6473 + (float) arg4 * this.field5578.field6491 + this.field5578.field6460) * (float) this.field5643 / var9);
        if (this.field5647 > (float) var12 && (float) var13 < this.field5647) {
            var7 |= 4;
        } else if (this.field5602 < (float) var12 && this.field5602 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lza;)V", line = 565)
    public final void method536(class416 arg0) {
        ++field5557;
        this.field5554 = ((class699) arg0).field9727;
        this.field5448 = this.field5554.method3781(32768, false);
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(B)V", line = 581)
    private final void method2374(byte arg0) {
        ++field5488;
        this.field5626 = false;
        if (class589.field8249 == this.field5601) {
            this.method2360(arg0 + 72);
            this.method2402((byte) -60);
        }
        if (arg0 != -66) {
            this.field5642 = -98;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIZIIZ)V", line = 599)
    private final void method2375(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = arg5 & this.method482();
        ++field5527;
        if (!var7 && (~arg1 == -5 || arg1 == 8 || ~arg1 == -10)) {
            arg1 = 2;
            arg0 = arg1 == 4 ? arg4 & 1 : 1;
            arg4 = 0;
        }
        int var8 = -33 / ((-73 - arg3) / 39);
        if (arg1 != 0 && arg2) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (~this.field5671 == ~arg1) {
            if (this.field5671 != 0) {
                this.field5635[Integer.MAX_VALUE & this.field5671].method197(arg2, (byte) -127);
                if (~this.field5592 != ~arg4 || ~this.field5652 != ~arg0) {
                    this.field5635[this.field5671 & Integer.MAX_VALUE].method199(arg4, arg0, true);
                    this.field5592 = arg4;
                    this.field5652 = arg0;
                }
                return;
            }
        } else {
            if (~this.field5671 != -1) {
                this.field5635[this.field5671 & Integer.MAX_VALUE].method201(true);
            }
            if (arg1 == 0) {
                this.field5651 = null;
            } else {
                this.field5651 = this.field5635[arg1 & Integer.MAX_VALUE];
                this.field5651.method196(5, arg2);
                this.field5651.method197(arg2, (byte) -126);
                this.field5651.method199(arg4, arg0, true);
            }
            this.field5592 = arg4;
            this.field5652 = arg0;
            this.field5671 = arg1;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([BLet;IIZI)Lwk;", line = 656)
    public final class145 method2376(byte[] arg0, class596 arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field5486;
        int var7 = 107 / ((arg5 - 28) / 54);
        return this.method2013(arg3, 0, 0, arg2, 0, arg4, arg1, arg0);
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(II)V", line = 671)
    public final void method468(int arg0, int arg1) {
        ++field5531;
        if (~this.field5589 != ~arg0 || this.field5661 != arg1) {
            this.field5589 = arg0;
            this.field5661 = arg1;
            this.method2414(428410648);
            this.method2403((byte) -128);
            this.method2362(0);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 696)
    public final class282 method539(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5487;
        return new class395(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "(I)V", line = 706)
    public final void method2377(int arg0) {
        this.field5673 = new class477[this.field5586];
        ++field5558;
        this.field5649 = new class299[this.field5586];
        this.field5654 = new class299[this.field5586];
        this.field5634 = new class322[this.field5586];
        this.field5664 = new class572[this.field5586];
        for (int var2 = 0; var2 < this.field5586; ++var2) {
            this.field5654[var2] = class405.field5120;
            this.field5649[var2] = class405.field5120;
            this.field5634[var2] = class470.field6301;
            this.field5673[var2] = new class477();
        }
        this.field5655 = new class123[this.field5636 + -2];
        this.field5648 = this.method2012(class285.field3589, 1, 1, (byte) -105, class269.field3396);
        this.method536(new class699(262144));
        this.field5685 = this.method2001(16018, new class655[] { new class655(new class307[] { class307.field4043, class307.field4051 }) });
        this.field5706 = this.method2001(16018, new class655[] { new class655(new class307[] { class307.field4043, class307.field4049 }) });
        this.field5691 = this.method2001(arg0 ^ 25361, new class655[] { new class655(class307.field4043), new class655(class307.field4049), new class655(class307.field4051), new class655(class307.field4048) });
        this.field5692 = this.method2001(16018, new class655[] { new class655(class307.field4043), new class655(class307.field4049), new class655(class307.field4051) });
        this.field5697 = new class559(this, 0, 0, false, false);
        this.field5690 = new class559(this, 0, 0, true, true);
        this.field5689 = new class559(this, 0, 0, false, false);
        this.field5693 = new class559(this, 0, 0, true, true);
        this.field5703 = new class559(this, 0, 0, false, false);
        this.field5696 = new class559(this, 0, 0, true, true);
        this.field5698 = new class559(this, 0, 0, false, false);
        this.field5701 = new class559(this, 0, 0, true, true);
        this.field5695 = new class559(this, 0, 0, false, false);
        this.field5700 = new class559(this, 0, 0, true, true);
        this.field5672 = new class157(this);
        if (arg0 == 23939) {
            this.field5705 = this.method1995(true, (byte) -96);
            this.method2398((byte) -80);
            this.field5407 = new class88(this);
            this.field5635[1] = this.method1983((byte) 78, 1);
            this.field5635[2] = this.method1983((byte) 95, 2);
            this.field5635[4] = this.method1983((byte) -120, 4);
            this.field5635[5] = this.method1983((byte) 74, 5);
            this.field5635[6] = this.method1983((byte) 91, 6);
            this.field5635[7] = this.method1983((byte) 98, 7);
            this.field5635[3] = this.method1983((byte) -44, 3);
            this.field5635[8] = this.method1983((byte) -109, 8);
            this.field5635[9] = this.method1983((byte) -55, 9);
            if (!this.field5635[2].method202(1)) {
                this.field5635[2] = this.method1983((byte) -72, 0);
            }
            if (!this.field5635[4].method202(1)) {
                this.field5635[4] = this.field5635[2];
            }
            if (!this.field5635[8].method202(1)) {
                this.field5635[8] = this.field5635[4];
            }
            if (!this.field5635[9].method202(1)) {
                this.field5635[9] = this.field5635[8];
            }
            this.method2028(arg0 ^ -24050);
            this.method446();
            this.method479();
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILjv;I)V", line = 782)
    private final void method2378(int arg0, class81 arg1, int arg2) {
        this.method2041(0, this.field5694, (byte) 73);
        ++field5394;
        this.method2033(17069, this.field5686);
        this.method2004(arg1, arg2, 0, -126);
        if (arg0 >= -78) {
            this.field5445 = 79;
        }
    }

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(II)V", line = 795)
    public final void method2379(int arg0, int arg1) {
        ++field5438;
        if (arg1 == -15829) {
            if (~arg0 != -2) {
                if (~arg0 == -1) {
                    this.method2397(class405.field5120, class405.field5120, (byte) -126);
                } else if (~arg0 == -3) {
                    this.method2397(class740.field10325, class476.field6418, (byte) -105);
                } else {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            this.method2397(class257.field3259, class257.field3259, (byte) 104);
                            return;
                        }
                    } else {
                        this.method2397(class155.field2108, class405.field5120, (byte) 26);
                    }
                }
            } else {
                this.method2397(class476.field6418, class476.field6418, (byte) -73);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "(I)V", line = 824)
    private final void method2380(int arg0) {
        this.method1998(1);
        ++field5492;
        if (arg0 != 0) {
            this.method2415(-80);
        }
        if (this.field5651 != null) {
            this.field5651.method406(arg0 ^ 1);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BZ)V", line = 842)
    public final void method2381(byte arg0, boolean arg1) {
        if (arg0 != -103) {
            this.method546();
        }
        if (this.field5675 != arg1) {
            this.field5675 = arg1;
            this.method2040((byte) -7);
        }
        ++field5468;
    }

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "(Z)V", line = 868)
    public final void method504(boolean arg0) {
        ++field5480;
        this.field5677 = arg0;
        this.method1996(0);
    }

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "(II)V", line = 877)
    public final void method2382(int arg0, int arg1) {
        ++field5418;
        if (this.field5679 != arg0) {
            this.field5679 = arg0;
            this.method2031(false);
        }
        if (arg1 != -4068) {
            this.field5632 = -101;
        }
    }

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "(B)Lgk;", line = 895)
    public final class477 method2383(byte arg0) {
        ++field5458;
        return arg0 < 47 ? null : this.field5581;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 907)
    public final void method518(Canvas arg0, int arg1, int arg2) {
        ++field5484;
        if (this.field5514 == arg0) {
            throw new RuntimeException();
        } else if (!this.field5502.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method2011(0, arg0);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field5502.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[Llaa;)V", line = 947)
    public final void method456(int arg0, class123[] arg1) {
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field5655[var3] = arg1[var3];
        }
        ++field5556;
        this.field5622 = arg0;
        if (this.field5601.method1795(-1)) {
            this.method2017((byte) 36);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILen;)V", line = 969)
    public final void method2384(int arg0, class322 arg1) {
        this.field5634[this.field5653] = arg1;
        ++field5462;
        this.method2380(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(IZ)V", line = 978)
    public final void method2385(int arg0, boolean arg1) {
        if (this.field5603 != arg1) {
            this.field5603 = arg1;
            this.method1996(0);
            this.field5639 &= -32;
        }
        ++field5520;
        int var3 = 28 / ((42 - arg0) / 58);
    }

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "(I)I", line = 997)
    public final int method2386(int arg0) {
        if (arg0 != 4) {
            return -88;
        } else {
            ++field5543;
            return this.field5653;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(FIFFFFF)Z", line = 1010)
    private final boolean method2387(float arg0, int arg1, float arg2, float arg3, float arg4, float arg5, float arg6) {
        ++field5537;
        if (arg1 != -28952) {
            this.method2020((Object) null, (Canvas) null, true);
        }
        Buffer var8 = this.field5688.method295(true, arg1 ^ 3074);
        if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method2409((byte) 103, var8);
            if (Stream.method3798()) {
                var9.method3796(arg2);
                var9.method3796(arg5);
                var9.method3796(arg0);
                var9.method3796(arg6);
                var9.method3796(arg3);
                var9.method3796(arg4);
            } else {
                var9.method3794(arg2);
                var9.method3794(arg5);
                var9.method3794(arg0);
                var9.method3794(arg6);
                var9.method3794(arg3);
                var9.method3794(arg4);
            }
            var9.method3793();
            return this.field5688.method299(2581);
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(BZ)V", line = 1049)
    public final void method2388(byte arg0, boolean arg1) {
        int var3 = -17 / ((-79 - arg0) / 47);
        if (!this.field5657 != !arg1) {
            this.field5657 = arg1;
            this.method2032(85);
        }
        ++field5508;
    }

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "(I)I", line = 1067)
    public final int method2389(int arg0) {
        if (arg0 < 7) {
            this.method529(-8, -13, 78, -39, 69, 22);
        }
        ++field5412;
        return this.field5683;
    }

    @OriginalMember(owner = "client!ij", name = "ra", descriptor = "(IIII)V", line = 1078)
    public final void method503(int arg0, int arg1, int arg2, int arg3) {
        ++field5441;
        this.field5618 = arg2;
        this.field5631 = true;
        this.field5683 = arg0;
        this.field5619 = arg1;
        this.field5615 = arg3;
    }

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "(I)V", line = 1092)
    public final void method2390(int arg0) {
        if (~this.field5639 != -9) {
            this.method2413(arg0 + -9414);
            this.method2367(true, arg0 + -9438);
            this.method2373(arg0 ^ 9392, true);
            this.method2385(112, true);
            this.method2440(1, (byte) -56);
            this.field5639 = 8;
        }
        if (arg0 != 9406) {
            this.method2369(false);
        }
        ++field5504;
    }

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "(I)V", line = 1112)
    private final void method2391(int arg0) {
        ++field5571;
        if (class589.field8249 == this.field5601) {
            float var2 = this.method2019((byte) -118);
            this.field5560.method2732(0.0F, 14751, var2, var2);
        }
        this.field5681 = false;
        this.method1990((byte) -98);
        if (this.field5651 != null) {
            this.field5651.method402(arg0 + -3);
        }
        if (arg0 != 0) {
            this.method1987(-103);
        }
    }

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "(III[I)V", line = 1140)
    public final void method553(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5552;
        float var5 = this.field5578.method2742((float) arg2, (float) arg1, (byte) 46, (float) arg0);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field5632;
            var7 = this.field5684;
        } else {
            var7 = (int) ((float) this.field5666 * this.field5578.method2749((float) arg1, (float) arg0, (float) arg2, (byte) 36) / var5);
            var6 = (int) ((float) this.field5643 * this.field5578.method2737((float) arg2, (float) arg1, (float) arg0, 91) / var5);
        }
        arg3[2] = (int) var5;
        arg3[0] = (int) ((float) var7 + -this.field5595);
        arg3[1] = (int) ((float) var6 - this.field5647);
    }

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "()Z", line = 1165)
    public final boolean method517() {
        ++field5403;
        return true;
    }

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "()Z", line = 1173)
    public final boolean method498() {
        ++field5453;
        return false;
    }

    @OriginalMember(owner = "client!ij", name = "EA", descriptor = "(IIII)V", line = 1181)
    public final void method453(int arg0, int arg1, int arg2, int arg3) {
        ++field5542;
        if (!this.field5631) {
            throw new RuntimeException("");
        } else {
            this.field5615 = arg3;
            this.field5618 = arg2;
            this.field5619 = arg1;
            this.field5683 = arg0;
            if (this.field5617) {
                this.field5635[3].method405(7289);
                this.field5635[3].method403((byte) 119);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "(I)V", line = 1204)
    public void method2028(int arg0) {
        int var2 = 23 / ((-74 - arg0) / 39);
        ++field5512;
        this.method2408(1);
    }

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "(I)V", line = 1218)
    public final void method2392(int arg0) {
        if (arg0 <= 51) {
            this.method518((Canvas) null, 50, 47);
        }
        if (this.field5639 != 2) {
            this.method2366(14833);
            this.method2367(false, -32);
            this.method2438(true, false);
            this.method2373(14, false);
            this.method2385(111, false);
            this.method2410(false, false, (byte) 87, -2);
            this.field5639 = 2;
        }
        ++field5436;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIII)V", line = 1242)
    public final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5490;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var9 = var7 * var10;
            var8 *= var10;
        }
        if (this.method2387(0.0F, -28952, (float) arg0, (float) arg3 + var8, 0.0F, (float) arg1, (float) arg2 + var9)) {
            this.method2435(1);
            this.method2382(arg4, -4068);
            this.method2394(class21.field383, (byte) 64, 0);
            this.method2422(class21.field383, 0, (byte) -10);
            this.method2440(arg5, (byte) -61);
            this.method2400(0);
            this.method1982(false, -97);
            this.method2361(-103);
            this.method1982(true, -115);
            this.method2422(class447.field5937, 0, (byte) -10);
            this.method2394(class447.field5937, (byte) 78, 0);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)V", line = 1279)
    public final void method2393(int arg0, byte arg1) {
        int var3 = 37 % ((-43 - arg1) / 48);
        if (~this.field5653 != ~arg0) {
            this.field5653 = arg0;
            this.method1992(3688);
        }
        ++field5515;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lfl;I)V", line = 1298)
    public final void method545(class741 arg0, int arg1) {
        this.field5672.method1102(this, arg1, arg0, (byte) -22);
        ++field5392;
    }

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "()Lpda;", line = 1307)
    public final class631 method502() {
        ++field5397;
        return new class477();
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lbp;BI)V", line = 1316)
    public final void method2394(class389 arg0, byte arg1, int arg2) {
        this.method2036((byte) 111, false, false, arg0, arg2);
        ++field5473;
        if (arg1 <= 58) {
            this.method2418(-37);
        }
    }

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "(III)V", line = 1327)
    public final void method457(int arg0, int arg1, int arg2) {
        if (this.field5644 != arg0 || this.field5599 != arg1 || ~this.field5659 != ~arg2) {
            this.field5659 = arg2;
            this.field5644 = arg0;
            this.field5599 = arg1;
            this.method2362(0);
            this.method2040((byte) -7);
        }
        ++field5460;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lfl;)V", line = 1344)
    public final void method455(class741 arg0) {
        this.field5672.method1102(this, -1, arg0, (byte) -22);
        ++field5461;
    }

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "(B)V", line = 1353)
    public static void method2395(byte arg0) {
        if (arg0 != 40) {
            method2395((byte) -78);
        }
        field5399 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILfe;)V", line = 1365)
    public final void method2396(int arg0, class572 arg1) {
        if (arg0 != 22357) {
            this.method2399((float[]) null, -110, -79, -11, (class596) null, true);
        }
        ++field5423;
        if (this.field5664[this.field5653] != arg1) {
            this.field5664[this.field5653] = arg1;
            if (arg1 == null) {
                this.method2026(arg0 + -22372);
            } else {
                arg1.method703((byte) 113);
            }
            this.field5639 &= -2;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lpfa;Lpfa;B)V", line = 1390)
    public final void method2397(class299 arg0, class299 arg1, byte arg2) {
        ++field5470;
        boolean var4 = false;
        int var5 = 126 % ((arg2 - -26) / 42);
        if (this.field5649[this.field5653] != arg0) {
            this.field5649[this.field5653] = arg0;
            this.method2029(111);
            var4 = true;
        }
        if (this.field5654[this.field5653] != arg1) {
            this.field5654[this.field5653] = arg1;
            this.method2035(7003);
            var4 = true;
        }
        if (var4) {
            this.field5639 &= -30;
        }
    }

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "(B)V", line = 1422)
    public final void method2398(byte arg0) {
        ++field5452;
        Hashtable var2 = new Hashtable();
        if (this.field5502 != null && !this.field5502.isEmpty()) {
            Enumeration var3 = this.field5502.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method2011(0, var4));
            }
        }
        this.field5502 = var2;
        this.method2424(true);
        if (arg0 >= -60) {
            this.field5692 = null;
        }
        this.method2415(Integer.MAX_VALUE);
        this.method2404((byte) 83);
        this.field5672.method1101(-32, this);
    }

    @OriginalMember(owner = "client!ij", name = "aa", descriptor = "(IIIIII)V", line = 1455)
    public final void method528(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2435(1);
        ++field5555;
        this.method2382(arg4, -4068);
        this.method2394(class21.field383, (byte) 64, 0);
        this.method2422(class21.field383, 0, (byte) -10);
        this.method2440(arg5, (byte) -32);
        this.field5560.method2747(-16363, (float) arg2, (float) arg3, 1.0F);
        this.field5560.method600(arg0, arg1, 0);
        this.method2430(1);
        this.method1982(false, -114);
        this.method2437(2);
        this.method1982(true, -83);
        this.method2422(class447.field5937, 0, (byte) -10);
        this.method2394(class447.field5937, (byte) 75, 0);
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "()I", line = 1475)
    public final int method436() {
        ++field5396;
        return this.field5636 + -2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lhb;Z)Liea;", line = 1486)
    public final class481 method508(class728 arg0, boolean arg1) {
        ++field5430;
        class481 var10;
        if (arg0.field10135 != 0 && ~arg0.field10132 != -1) {
            int[] var3 = new int[arg0.field10135 * arg0.field10132];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field10133 == null) {
                for (int var6 = 0; arg0.field10132 > var6; ++var6) {
                    for (int var7 = 0; ~var7 > ~arg0.field10135; ++var7) {
                        int var8 = arg0.field10131[255 & arg0.field10134[var4++]];
                        var3[var5++] = var8 == 0 ? 0 : class683.method3840(-16777216, var8);
                    }
                }
            } else {
                for (int var9 = 0; ~arg0.field10132 < ~var9; ++var9) {
                    for (int var11 = 0; arg0.field10135 > var11; ++var11) {
                        var3[var5++] = class683.method3840(arg0.field10133[var4] << 24, arg0.field10131[class702.method3949(255, arg0.field10134[var4])]);
                        ++var4;
                    }
                }
            }
            var10 = this.method435(arg0.field10135, 0, arg0.field10132, 125, var3, arg0.field10135);
        } else {
            var10 = this.method435(1, 0, 1, -125, new int[1], 1);
        }
        var10.method147(arg0.field10129, arg0.field10128, arg0.field10136, arg0.field10130);
        return var10;
    }

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "(ILaa;II)V", line = 1557)
    public final void method450(int arg0, class489 arg1, int arg2, int arg3) {
        ++field5414;
        class96 var5 = (class96) arg1;
        class145 var6 = var5.field1335;
        this.method2392(96);
        this.method2396(22357, var6);
        this.method2440(1, (byte) -99);
        this.method2397(class476.field6418, class476.field6418, (byte) 31);
        this.method2394(class21.field383, (byte) 111, 0);
        this.method2382(arg0, -4068);
        this.field5560.method2747(-16363, (float) this.field5445, (float) this.field5494, 0.0F);
        this.method2430(1);
        this.field5673[0].method2747(-16363, var6.method814(20275, (float) this.field5445), var6.method808((float) this.field5494, 9347), 1.0F);
        this.field5673[0].method2732(0.0F, 14751, var6.method814(20275, (float) (-arg2)), var6.method808((float) (-arg3), 9347));
        this.field5634[0] = class1.field2;
        this.method2380(0);
        this.method2437(2);
        this.method2418(11032);
        this.method2394(class447.field5937, (byte) 75, 0);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([FIIILet;Z)Lwk;", line = 1587)
    public final class145 method2399(float[] arg0, int arg1, int arg2, int arg3, class596 arg4, boolean arg5) {
        if (arg3 != 0) {
            this.method2401(2);
        }
        ++field5510;
        return this.method2038(arg1, arg2, arg4, arg5, 0, arg0, 0, true);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([IIIIIZ)Liea;", line = 1605)
    public final class481 method535(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field5579;
        return new class22(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 1613)
    public final void method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field5518;
    }

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "(I)V", line = 1624)
    public final void method2400(int arg0) {
        this.field5560.method595();
        ++field5393;
        this.field5569 = true;
        this.method2391(arg0 + arg0);
    }

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "(I)I", line = 1639)
    public final int method2401(int arg0) {
        ++field5450;
        if (arg0 != 10426) {
            this.field5599 = 75;
        }
        return this.field5615;
    }

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "(B)V", line = 1651)
    private final void method2402(byte arg0) {
        this.method2037((byte) -99);
        ++field5546;
        if (arg0 == -60) {
            if (this.field5651 != null) {
                this.field5651.method404(57);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1678)
    public final void method533(Canvas arg0) {
        ++field5389;
        if (this.field5514 == arg0) {
            throw new RuntimeException();
        } else if (this.field5502.containsKey(arg0)) {
            this.method2020(this.field5502.get(arg0), arg0, false);
            this.field5502.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "(B)V", line = 1700)
    private final void method2403(byte arg0) {
        this.field5665 = false;
        if (arg0 >= -127) {
            this.field5591 = true;
        }
        ++field5551;
        this.method2358(1);
        if (class175.field2446 == this.field5601) {
            this.method2402((byte) -60);
        }
    }

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "(B)V", line = 1717)
    private final void method2404(byte arg0) {
        ++field5474;
        this.field5699 = this.method2042(false, false);
        this.field5699.method296(12, 3096, 20442);
        int var2 = 37 % ((arg0 - -36) / 42);
        for (int var3 = 0; ~var3 > -5; ++var3) {
            Buffer var4 = this.field5699.method295(true, -32022);
            if (var4 != null) {
                Stream var5 = this.method2409((byte) 86, var4);
                var5.method3796(0.0F);
                var5.method3796(0.0F);
                var5.method3796(0.0F);
                for (int var6 = 0; var6 <= 256; ++var6) {
                    double var7 = (double) (var6 * 2) * 3.141592653589793D / 256.0D;
                    float var9 = (float) Math.cos(var7);
                    float var10 = (float) Math.sin(var7);
                    if (!Stream.method3798()) {
                        var5.method3794(var10);
                        var5.method3794(var9);
                        var5.method3794(0.0F);
                    } else {
                        var5.method3796(var10);
                        var5.method3796(var9);
                        var5.method3796(0.0F);
                    }
                }
                var5.method3793();
                if (this.field5699.method299(2581)) {
                    break;
                }
            }
        }
        this.field5702 = this.method2001(16018, new class655[] { new class655(class307.field4043) });
    }

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "(I)V", line = 1787)
    private final void method2405(int arg0) {
        ++field5561;
        if (!this.field5605) {
            float[] var2 = this.field5667;
            float var3 = (float) (-this.field5684 * this.field5589) / (float) this.field5666;
            float var4 = (float) ((-this.field5684 + this.field5445) * this.field5589) / (float) this.field5666;
            float var5 = (float) (this.field5632 * this.field5589) / (float) this.field5643;
            float var6 = (float) ((this.field5632 - this.field5494) * this.field5589) / (float) this.field5643;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field5589 * 2.0F;
                var2[2] = 0.0F;
                var2[0] = var7 / (-var3 + var4);
                var2[6] = 0.0F;
                var2[12] = 0.0F;
                var2[14] = this.field5593 = (float) (this.field5661 * this.field5589) / (float) (-this.field5661 + this.field5589);
                var2[13] = 0.0F;
                var2[1] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[10] = this.field5641 = (float) this.field5661 / (float) (-this.field5661 + this.field5589);
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[3] = 0.0F;
                var2[11] = -1.0F;
                var2[15] = 0.0F;
            } else {
                var2[15] = 1.0F;
                var2[1] = 0.0F;
                var2[3] = 0.0F;
                var2[7] = 0.0F;
                var2[12] = 0.0F;
                var2[9] = 0.0F;
                var2[4] = 0.0F;
                var2[10] = 1.0F;
                var2[6] = 0.0F;
                var2[11] = 0.0F;
                var2[8] = 0.0F;
                var2[2] = 0.0F;
                var2[0] = 1.0F;
                var2[14] = 0.0F;
                var2[13] = 0.0F;
                var2[5] = 1.0F;
            }
            this.method2371((byte) -64);
            this.field5605 = true;
        }
        if (arg0 != 2) {
            this.field5687 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V", line = 1855)
    public final void method452(int arg0) {
        ++field5553;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(Z)Lgk;", line = 1867)
    public final class477 method2406(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            ++field5577;
            return this.field5673[this.field5653];
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ[III)Lwk;", line = 1879)
    public final class145 method2407(int arg0, boolean arg1, int[] arg2, int arg3, int arg4) {
        ++field5467;
        return arg0 < 65 ? null : this.method2010(arg1, arg2, 0, (byte) 0, arg4, arg3, 0);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lpda;)V", line = 1891)
    public final void method505(class631 arg0) {
        this.field5578 = (class477) arg0;
        ++field5567;
        this.field5581.method604(this.field5578);
        this.field5581.method2736((byte) -81);
        this.field5582.method2741(this.field5581, 2);
        this.field5580.method2741(this.field5578, 2);
        if (this.field5601.method1795(-1)) {
            this.method2439(-3057);
        }
    }

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "()I", line = 1907)
    public final int method537() {
        ++field5402;
        return this.field5576 + this.field5572 + this.field5568;
    }

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "(I)V", line = 1915)
    private final void method2408(int arg0) {
        ++field5426;
        this.method1986((byte) 127);
        this.method2024((byte) 85);
        this.method2039(-6109);
        this.method2017((byte) 36);
        this.method2002(1);
        this.method1988((byte) 91);
        this.method2032(77);
        this.method1991(false);
        this.method1996(0);
        this.method2040((byte) -7);
        this.method1997((byte) 36);
        this.method2003(-8);
        this.method2008(0);
        this.method2027((byte) -55);
        for (int var2 = this.field5586 - arg0; ~var2 <= -1; --var2) {
            this.method2393(var2, (byte) -128);
            this.method2029(113);
            this.method2035(arg0 + 7002);
            this.method2418(11032);
        }
        this.method2031(false);
        this.method2022(arg0 ^ 4797);
        this.method2037((byte) 122);
        this.method1990((byte) -98);
        this.method1987(3);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLjaclib/memory/Buffer;)Ljaclib/memory/Stream;", line = 1957)
    public final Stream method2409(byte arg0, Buffer arg1) {
        this.field5624.method3787(arg1);
        ++field5505;
        return arg0 < 75 ? null : this.field5624;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Llga;IIII)Lka;", line = 1970)
    public final class474 method540(class714 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5391;
        return new class559(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "()Z", line = 1980)
    public final boolean method526() {
        ++field5501;
        return true;
    }

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "(IIIII)V", line = 1990)
    public final void method491(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5464;
        this.method438(arg0, arg1, arg0 - -arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZZBI)V", line = 1999)
    public final void method2410(boolean arg0, boolean arg1, byte arg2, int arg3) {
        ++field5437;
        if (~this.field5640 != ~arg3 || this.field5617 == !this.field5631) {
            class145 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field5631 ? 0 : 3;
            if (arg3 < 0) {
                this.method2418(11032);
            } else {
                var5 = this.field5611.method1217(arg3, 64);
                class537 var10 = super.field830.method1072(arg3, true);
                if (var10.field7441 == 0 && ~var10.field7444 == -1) {
                    this.method2418(11032);
                } else {
                    int var11 = !var10.field7460 ? 128 : 64;
                    int var12 = var11 * 50;
                    class477 var13 = this.method2364((byte) -127);
                    var13.method2750((float) (this.field5633 % var12 * var10.field7441) / (float) var12, (float) (this.field5633 % var12 * var10.field7444) / (float) var12, 0.0F, (byte) -61);
                    this.method2384(2, class1.field2);
                }
                if (!this.field5631) {
                    var9 = var10.field7443;
                    var8 = var10.field7439;
                    var7 = var10.field7449;
                }
                var6 = var10.field7458;
            }
            this.method2375(var8, var9, arg1, 109, var7, arg0);
            if (this.field5651 == null) {
                this.method2396(22357, var5);
                this.method2379(var6, -15829);
            } else {
                this.field5651.method200(var6, 75, var5);
            }
            this.field5617 = this.field5631;
            this.field5640 = arg3;
        }
        if (arg2 == 87) {
            this.field5639 &= -8;
        }
    }

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "(I)I", line = 2066)
    public final int method2411(int arg0) {
        if (arg0 != 26860) {
            this.field5514 = null;
        }
        ++field5503;
        return this.field5618;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(FB)V", line = 2078)
    public final void method2412(float arg0, byte arg1) {
        if (arg1 < 59) {
            this.method2430(-64);
        }
        if (this.field5604 != arg0) {
            this.field5604 = arg0;
            this.method2403((byte) -128);
        }
        ++field5465;
    }

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "(I)V", line = 2098)
    public final void method510(int arg0) {
        this.field5637 = 0;
        ++field5528;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field5637;
        }
        this.field5663 = 1 << this.field5637;
    }

    @OriginalMember(owner = "client!ij", name = "Y", descriptor = "()[I", line = 2115)
    public final int[] method509() {
        ++field5548;
        return new int[] { this.field5684, this.field5632, this.field5666, this.field5643 };
    }

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "()Z", line = 2123)
    public final boolean method482() {
        ++field5509;
        return this.field5635[3].method202(1);
    }

    @OriginalMember(owner = "client!ij", name = "ZA", descriptor = "(IFFFFF)V", line = 2131)
    public final void method548(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field5404;
        boolean var7 = this.field5594 != arg0;
        if (var7 || this.field5610 != arg1 || this.field5669 != arg2) {
            this.field5594 = arg0;
            this.field5610 = arg1;
            this.field5669 = arg2;
            if (var7) {
                this.field5656 = (float) (this.field5594 & 65280) / 65280.0F;
                this.field5600 = (float) (255 & this.field5594) / 255.0F;
                this.field5620 = (float) (16711680 & this.field5594) / 1.671168E7F;
                this.method1986((byte) 127);
            }
            this.field5419.setSunColour(this.field5620, this.field5656, this.field5600, arg1, arg2);
            this.method2024((byte) 85);
        }
        if (this.field5678[0] != arg3 || this.field5678[1] != arg4 || this.field5678[2] != arg5) {
            this.field5678[2] = arg5;
            this.field5678[1] = arg4;
            this.field5678[0] = arg3;
            this.field5613[0] = -arg3;
            this.field5613[2] = -arg5;
            this.field5613[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5596[1] = arg4 * var8;
            this.field5596[2] = arg5 * var8;
            this.field5596[0] = arg3 * var8;
            this.field5590[2] = -this.field5596[2];
            this.field5590[0] = -this.field5596[0];
            this.field5590[1] = -this.field5596[1];
            this.field5419.setSunDirection(this.field5596[0], this.field5596[1], this.field5596[2]);
            this.method2002(1);
            this.field5670 = (int) (arg3 * 256.0F / arg4);
            this.field5642 = (int) (arg5 * 256.0F / arg4);
        }
        this.method1988((byte) 93);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIZ)Liea;", line = 2183)
    public final class481 method527(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5435;
        class22 var6 = new class22(this, arg2, arg3, arg4);
        var6.method154(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!ij", name = "KA", descriptor = "(IIII)V", line = 2197)
    public final void method534(int arg0, int arg1, int arg2, int arg3) {
        ++field5456;
        if (~arg0 >= -1 && arg2 >= this.field5445 + -1 && ~arg1 >= -1 && arg3 >= this.field5494 + -1) {
            this.method446();
        } else {
            this.field5674 = ~arg2 < ~this.field5445 ? 0 : arg2;
            this.field5612 = ~arg1 > -1 ? 0 : arg1;
            this.field5628 = this.field5445 >= arg3 ? arg3 : 0;
            this.field5625 = ~arg0 > -1 ? 0 : arg0;
            if (!this.field5708) {
                this.field5708 = true;
                this.method1989(-123);
            }
            this.method2015((byte) -94);
            this.method2365(97);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIILaa;II)V", line = 2223)
    public final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class489 arg6, int arg7, int arg8) {
        ++field5454;
    }

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "(I)V", line = 2230)
    private final void method2413(int arg0) {
        ++field5534;
        if (arg0 != -8) {
            this.method537();
        }
        if (class461.field6145 != this.field5601) {
            class300 var2 = this.field5601;
            this.field5601 = class461.field6145;
            if (!var2.method1795(-1)) {
                this.method2439(-3057);
            }
            this.method2405(2);
            this.field5609 = this.field5667;
            this.method2402((byte) -60);
            this.field5639 &= -8;
        }
    }

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "()Z", line = 2255)
    public final boolean method549() {
        ++field5416;
        return false;
    }

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "(I)V", line = 2265)
    private final void method2414(int arg0) {
        ++field5525;
        this.field5605 = false;
        if (arg0 == 428410648) {
            this.method2405(arg0 + -428410646);
            if (class461.field6145 == this.field5601) {
                this.method2402((byte) -60);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "HA", descriptor = "(IIII[I)V", line = 2282)
    public final void method530(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field5529;
        float var6 = this.field5578.method2742((float) arg2, (float) arg1, (byte) 46, (float) arg0);
        if (!(var6 < (float) this.field5589) && !((float) this.field5661 < var6)) {
            int var7 = (int) ((float) this.field5666 * this.field5578.method2749((float) arg1, (float) arg0, (float) arg2, (byte) 41) / (float) arg3);
            int var8 = (int) ((float) this.field5643 * this.field5578.method2737((float) arg2, (float) arg1, (float) arg0, 80) / (float) arg3);
            arg4[0] = (int) ((float) var7 - this.field5595);
            arg4[2] = (int) var6;
            arg4[1] = (int) ((float) var8 + -this.field5647);
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "(I)V", line = 2304)
    private final void method2415(int arg0) {
        ++field5563;
        if (arg0 != Integer.MAX_VALUE) {
            this.method2028(-60);
        }
        this.field5688 = this.method2042(true, false);
        this.field5688.method296(12, 24, arg0 ^ 2147463205);
        this.field5687 = this.method2001(16018, new class655[] { new class655(class307.field4043) });
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIF)Llaa;", line = 2320)
    public final class123 method471(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field5455;
        return new class171(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "(I)V", line = 2328)
    public final void method506(int arg0) {
        ++field5485;
    }

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "(Z)V", line = 2338)
    private final void method2416(boolean arg0) {
        ++field5466;
        if (this.field5479 != null) {
            Dimension var2 = this.field5479.getSize();
            this.field5386 = var2.width;
            this.field5440 = var2.height;
        } else {
            this.field5386 = this.field5440 = 1;
        }
        if (arg0) {
            this.field5445 = this.field5386;
            this.field5494 = this.field5440;
            this.method2374((byte) -66);
            this.method2414(428410648);
            this.method2403((byte) -128);
            this.method2022(4796);
            this.method2365(114);
            this.method2441((byte) 75);
            this.method446();
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(IB)V", line = 2373)
    public final void method2417(int arg0, byte arg1) {
        this.method2382(arg1 | arg1 << 8 | arg1 << 16 | arg1 << 24, -4068);
        ++field5495;
        int var3 = -23 % ((arg0 - 46) / 60);
    }

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "(I)V", line = 2383)
    public final void method2418(int arg0) {
        if (this.field5634[this.field5653] != class470.field6301) {
            this.field5634[this.field5653] = class470.field6301;
            this.field5673[this.field5653].method595();
            this.method2380(arg0 + -11032);
        }
        if (arg0 == 11032) {
            ++field5550;
        }
    }

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "(I)V", line = 2407)
    private final void method2419(int arg0) {
        if (arg0 != -8) {
            this.field5617 = false;
        }
        ++field5491;
        if (class175.field2446 != this.field5601) {
            class300 var2 = this.field5601;
            this.field5601 = class175.field2446;
            if (!var2.method1795(-1)) {
                this.method2439(-3057);
            }
            this.method2358(1);
            this.field5609 = this.field5629;
            this.method2402((byte) -60);
            this.field5639 &= -8;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljl;[Lhb;Z)Lda;", line = 2431)
    public final class61 method500(class274 arg0, class728[] arg1, boolean arg2) {
        ++field5408;
        return new class399(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lgk;B)V", line = 2440)
    public final void method2420(class477 arg0, byte arg1) {
        ++field5444;
        this.field5560.method604(arg0);
        if (arg1 != 22) {
            this.field5616 = true;
        }
        this.field5569 = false;
        this.method2391(arg1 + -22);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 2453)
    public final void method433(int arg0) {
        ++field5398;
    }

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "(I)V", line = 2462)
    public final void method2421(int arg0) {
        ++field5507;
        if (~this.field5639 != -5) {
            this.method2366(14833);
            this.method2367(false, -32);
            this.method2438(true, false);
            this.method2373(14, false);
            this.method2385(104, false);
            this.method2410(false, false, (byte) 87, -2);
            this.method2440(1, (byte) -57);
            this.method2379(0, -15829);
            this.field5639 = 4;
        }
        if (arg0 > -124) {
            this.method2401(42);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIIII)V", line = 2489)
    public final void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field5385;
        float var10 = (float) arg2 - (float) arg0;
        float var11 = (float) arg3 - (float) arg1;
        float var12;
        if (var10 == 0.0F && var11 == 0.0F) {
            var12 = 1.0F;
        } else {
            float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            var11 *= var13;
            var12 = var10 * var13;
        }
        this.method2435(1);
        this.method2382(arg4, -4068);
        this.method2394(class21.field383, (byte) 59, 0);
        this.method2422(class21.field383, 0, (byte) -10);
        this.method2440(arg5, (byte) -55);
        this.method2400(0);
        this.method1982(false, -126);
        int var14 = arg8 % (arg6 + arg7);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (arg6 >= var14) {
            var20 = (float) (-var14 + arg6) * var11;
            var19 = (float) (arg6 - var14) * var12;
        } else {
            var17 = (float) (-var14 + arg7 + arg6) * var12;
            var18 = (float) (-var14 + arg7 + arg6) * var11;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (~arg0 <= ~arg2) {
                if (var21 < (float) arg2) {
                    break;
                }
                if ((float) arg2 > var19 + var21) {
                    var19 = (float) arg2 - var21;
                }
            } else {
                if (var21 > (float) arg2) {
                    break;
                }
                if ((float) arg2 < var19 + var21) {
                    var19 = (float) arg2 + -var21;
                }
            }
            if (arg1 < arg3) {
                if ((float) arg3 < var22) {
                    break;
                }
                if ((float) arg3 < var20 + var22) {
                    var20 = (float) arg3 + -var22;
                }
            } else {
                if (var22 < (float) arg3) {
                    break;
                }
                if ((float) arg3 > var20 + var22) {
                    var20 = (float) arg3 - var22;
                }
            }
            if (!this.method2387(0.0F, -28952, var21, var20 + var22, 0.0F, var22, var19 + var21)) {
                return;
            }
            var21 += var19 + var23;
            this.method2361(107);
            var22 += var20 + var24;
            var20 = var16;
            var19 = var15;
        }
        this.method1982(true, -82);
        this.method2422(class447.field5937, 0, (byte) -10);
        this.method2394(class447.field5937, (byte) 64, 0);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIII)V", line = 2608)
    public final void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5447;
        float var8 = (float) arg2 - (float) arg0;
        float var9 = (float) (-arg1) + (float) arg3;
        float var10 = 0.0F;
        float var11 = 1.0F;
        if (var8 != 0.0F || var9 != 0.0F) {
            var11 = (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
            var10 = (float) Math.atan2((double) var9, (double) var8);
        }
        this.method2435(1);
        this.method2382(arg4, -4068);
        this.method2394(class21.field383, (byte) 78, 0);
        this.method2422(class21.field383, 0, (byte) -10);
        this.method2440(arg6, (byte) -84);
        this.field5560.method2747(-16363, var11, (float) arg5, 1.0F);
        this.field5560.method600(0, -arg5 / 2, 0);
        this.field5560.method608((int) ((double) var10 * 2607.5945876176133D) & 16383);
        this.field5560.method600(arg0, arg1, 0);
        this.method2430(1);
        this.method1982(false, -123);
        this.method2437(2);
        this.method1982(true, -118);
        this.method2422(class447.field5937, 0, (byte) -10);
        this.method2394(class447.field5937, (byte) 77, 0);
    }

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "()I", line = 2645)
    public final int method470() {
        ++field5575;
        return this.field5707;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)Lgda;", line = 2655)
    public class55 method1983(byte arg0, int arg1) {
        ++field5390;
        int var3 = 84 % ((36 - arg0) / 34);
        if (arg1 != 6) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    return arg1 == 7 ? new class248(this) : new class683(this);
                } else {
                    return new class634(this, this.field5407);
                }
            } else {
                return new class208(this);
            }
        } else {
            return new class751(this);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lbp;IB)V", line = 2705)
    public final void method2422(class389 arg0, int arg1, byte arg2) {
        this.method1999(124, arg1, arg0, false);
        if (arg2 == -10) {
            ++field5519;
        }
    }

    @OriginalMember(owner = "client!ij", name = "DA", descriptor = "(IIII)V", line = 2718)
    public final void method437(int arg0, int arg1, int arg2, int arg3) {
        this.field5643 = arg3;
        this.field5684 = arg0;
        this.field5632 = arg1;
        ++field5415;
        this.field5666 = arg2;
        this.method2403((byte) -128);
        this.method2414(428410648);
        this.method2441((byte) 75);
        this.method2365(102);
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lnd;II)V", line = 2735)
    public class424(Canvas arg0, Object arg1, class153 arg2, class547 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            this.field5401 = this.field5547 = arg1;
            this.field5451 = arg3;
            this.field5479 = this.field5514 = arg0;
            this.field5680 = arg4;
            Dimension var7 = arg0.getSize();
            this.field5682 = arg5;
            this.field5445 = this.field5386 = var7.width;
            this.field5494 = this.field5440 = var7.height;
            class273.method1613(true, false, 10);
            if (super.field830 != null) {
                this.field5611 = new class178(this, super.field830);
                this.field5419 = new NativeInterface(super.field830.method1070(88), this.field5682);
                for (int var8 = 0; var8 < super.field830.method1070(127); ++var8) {
                    class537 var9 = super.field830.method1072(var8, true);
                    if (var9 != null) {
                        this.field5419.initTextureMetrics(var8, var9.field7438, var9.field7437);
                    }
                }
            } else {
                this.field5419 = new NativeInterface(0, this.field5682);
                this.field5611 = null;
            }
        } catch (Throwable var11) {
            var11.printStackTrace();
            this.method478((byte) 88);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(ZI)V", line = 2785)
    public final void method2423(boolean arg0, int arg1) {
        if (arg0 == !this.field5638) {
            this.field5638 = arg0;
            this.method2039(-6109);
        }
        ++field5417;
        if (arg1 > -33) {
            this.field5597 = 0.5934575F;
        }
    }

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "(Z)V", line = 2806)
    private final void method2424(boolean arg0) {
        this.field5694 = this.method2042(false, !arg0);
        ++field5439;
        if (!arg0) {
            this.field5680 = -72;
        }
        this.field5694.method296(28, 140, 20442);
        for (int var2 = 0; var2 < 4; ++var2) {
            Buffer var3 = this.field5694.method295(true, -32022);
            if (var3 != null) {
                Stream var4 = this.method2409((byte) 103, var3);
                if (Stream.method3798()) {
                    var4.method3796(0.0F);
                    var4.method3796(0.0F);
                    var4.method3796(0.0F);
                    var4.method3796(0.0F);
                    var4.method3796(0.0F);
                    var4.method3796(0.0F);
                    var4.method3796(0.0F);
                    var4.method3796(0.0F);
                    var4.method3796(1.0F);
                    var4.method3796(0.0F);
                    var4.method3796(0.0F);
                    var4.method3796(1.0F);
                    var4.method3796(0.0F);
                    var4.method3796(1.0F);
                    var4.method3796(1.0F);
                    var4.method3796(1.0F);
                    var4.method3796(0.0F);
                    var4.method3796(1.0F);
                    var4.method3796(1.0F);
                    var4.method3796(1.0F);
                    var4.method3796(1.0F);
                    var4.method3796(1.0F);
                    var4.method3796(0.0F);
                    var4.method3796(0.0F);
                    var4.method3796(1.0F);
                    var4.method3796(0.0F);
                    var4.method3796(1.0F);
                    var4.method3796(0.0F);
                    var4.method3796(0.0F);
                    var4.method3796(0.0F);
                    var4.method3796(0.0F);
                    var4.method3796(0.0F);
                    var4.method3796(0.0F);
                    var4.method3796(0.0F);
                    var4.method3796(0.0F);
                } else {
                    var4.method3794(0.0F);
                    var4.method3794(0.0F);
                    var4.method3794(0.0F);
                    var4.method3794(0.0F);
                    var4.method3794(0.0F);
                    var4.method3794(0.0F);
                    var4.method3794(0.0F);
                    var4.method3794(0.0F);
                    var4.method3794(1.0F);
                    var4.method3794(0.0F);
                    var4.method3794(0.0F);
                    var4.method3794(1.0F);
                    var4.method3794(0.0F);
                    var4.method3794(1.0F);
                    var4.method3794(1.0F);
                    var4.method3794(1.0F);
                    var4.method3794(0.0F);
                    var4.method3794(1.0F);
                    var4.method3794(1.0F);
                    var4.method3794(1.0F);
                    var4.method3794(1.0F);
                    var4.method3794(1.0F);
                    var4.method3794(0.0F);
                    var4.method3794(0.0F);
                    var4.method3794(1.0F);
                    var4.method3794(0.0F);
                    var4.method3794(1.0F);
                    var4.method3794(0.0F);
                    var4.method3794(0.0F);
                    var4.method3794(0.0F);
                    var4.method3794(0.0F);
                    var4.method3794(0.0F);
                    var4.method3794(0.0F);
                    var4.method3794(0.0F);
                    var4.method3794(0.0F);
                }
                var4.method3793();
                if (this.field5694.method299(2581)) {
                    break;
                }
            }
        }
        this.field5686 = this.method2001(16018, new class655[] { new class655(new class307[] { class307.field4043, class307.field4051, class307.field4051 }) });
    }

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "(B)I", line = 2921)
    public final int method2425(byte arg0) {
        if (arg0 <= 86) {
            this.field5613 = null;
        }
        ++field5539;
        return this.field5619;
    }

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "(IIIIII[BII)V", line = 2932)
    public final void method443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field5428;
    }

    @OriginalMember(owner = "client!ij", name = "da", descriptor = "(III[I)V", line = 2940)
    public final void method543(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5383;
        float var5 = this.field5578.method2742((float) arg2, (float) arg1, (byte) 46, (float) arg0);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field5632;
            var7 = this.field5684;
        } else {
            var7 = (int) ((float) this.field5666 * this.field5578.method2749((float) arg1, (float) arg0, (float) arg2, (byte) 79) / var5);
            var6 = (int) ((float) this.field5643 * this.field5578.method2737((float) arg2, (float) arg1, (float) arg0, 99) / var5);
        }
        arg3[0] = (int) ((float) var7 + -this.field5595);
        arg3[1] = (int) ((float) var6 + -this.field5647);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "()Z", line = 2965)
    public final boolean method467() {
        ++field5517;
        return true;
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "()V", line = 2973)
    public void method459() {
        ++field5472;
        if (!this.field5658) {
            for (class168 var1 = this.field5535.method3672(-1); var1 != null; var1 = this.field5535.method3662(-1)) {
                ((class699) var1).method3931((byte) 70);
            }
            Enumeration var2 = this.field5502.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method2020(this.field5502.get(var3), var3, false);
            }
            class23.method163(false, true, (byte) 89);
            this.field5419.release();
            this.field5658 = true;
        }
    }

    @OriginalMember(owner = "client!ij", name = "la", descriptor = "()V", line = 3008)
    public final void method446() {
        this.field5612 = 0;
        this.field5674 = this.field5445;
        this.field5628 = this.field5494;
        ++field5533;
        this.field5625 = 0;
        if (this.field5708) {
            this.field5708 = false;
            this.method1989(-110);
        }
        this.method2365(124);
    }

    @OriginalMember(owner = "client!ij", name = "V", descriptor = "(I)V", line = 3026)
    public final void method2426(int arg0) {
        if (arg0 == 2) {
            ++field5521;
            this.method2441((byte) 75);
            this.method2402((byte) -60);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIZ)Liea;", line = 3039)
    public final class481 method551(int arg0, int arg1, boolean arg2) {
        ++field5471;
        return new class22(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ij", name = "pa", descriptor = "()V", line = 3056)
    public final void method515() {
        ++field5523;
        this.field5631 = false;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([Ljava/lang/String;[SI)V", line = 3064)
    public static final void method2427(String[] arg0, short[] arg1, int arg2) {
        ++field5478;
        class530.method3050(arg2, arg1, arg0, 81, arg0.length + -1);
    }

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "()V", line = 3072)
    public final void method547() {
        ++field5530;
        if (this.field5611 != null) {
            this.field5611.method1219((byte) 93);
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(IIIIII)V", line = 3084)
    public final void method460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5522;
        float var7 = this.method2019((byte) -122);
        this.method2435(1);
        this.method2382(arg4, -4068);
        this.method2394(class21.field383, (byte) 68, 0);
        this.method2422(class21.field383, 0, (byte) -10);
        this.method2440(arg5, (byte) -38);
        this.field5560.method2747(-16363, (float) (arg2 - 1), (float) (arg3 - 1), 1.0F);
        this.field5560.method2732(0.0F, 14751, (float) arg0 + -var7, (float) arg1 - var7);
        this.method2430(1);
        this.method1982(false, -91);
        this.method2378(-112, class232.field3051, 4);
        this.method1982(true, -92);
        this.method2422(class447.field5937, 0, (byte) -10);
        this.method2394(class447.field5937, (byte) 100, 0);
    }

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "(II)Liaa;", line = 3110)
    public final class497 method2428(int arg0, int arg1) {
        ++field5413;
        if (this.field5705.method297(2) < arg0 * arg1) {
            this.field5705.method1008(arg1, 23833);
        }
        return this.field5705;
    }

    @OriginalMember(owner = "client!ij", name = "Y", descriptor = "(I)Lgk;", line = 3124)
    public final class477 method2429(int arg0) {
        ++field5564;
        if (!this.field5681) {
            this.field5583.method2744(this.field5581, this.field5560);
            this.field5681 = true;
        }
        return arg0 != 11 ? null : this.field5583;
    }

    @OriginalMember(owner = "client!ij", name = "Z", descriptor = "(I)V", line = 3142)
    public final void method2430(int arg0) {
        if (arg0 != 1) {
            this.method461(83);
        }
        this.field5569 = false;
        ++field5459;
        this.method2391(0);
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(IIIIII)Lmda;", line = 3154)
    public final class267 method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5476;
        return new class198(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V", line = 3162)
    public final void method449(boolean arg0) {
        ++field5526;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 3172)
    public final void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class489 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field5406;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)I", line = 3181)
    public final int method484(int arg0, int arg1) {
        ++field5489;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "(I)Lza;", line = 3189)
    public final class416 method541(int arg0) {
        ++field5395;
        class699 var2 = new class699(arg0);
        this.field5535.method3671(var2, false);
        return var2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "()Z", line = 3202)
    public final boolean method431() {
        ++field5387;
        return true;
    }

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "(Z)V", line = 3211)
    public static final void method2431(boolean arg0) {
        ++field5524;
        class522.method3031(1603);
        class705.field9777 = 0;
        class609.field8448.field6193 = 0;
        class494.field6994 = null;
        class440.field5868 = 0;
        class154.field2099 = null;
        class661.field9200 = 0;
        class255.field3248 = null;
        class546.field7608 = null;
        class730.method4071(0);
        class541.method3102(-35);
        for (int var1 = 0; var1 < 2048; ++var1) {
            class5.field49[var1] = null;
        }
        class380.field4847 = null;
        for (int var2 = 0; var2 < class54.field752; ++var2) {
            class733 var4 = class638.field8801[var2].field8280;
            if (var4 != null) {
                var4.field221 = -1;
            }
        }
        class594.method3366((byte) 98);
        class35.field560 = -1;
        class746.field10437 = -1;
        class650.field9023 = 1;
        if (!arg0) {
            field5399 = null;
        }
        class571.method3275(27461, 10);
        for (int var3 = 0; var3 < 100; ++var3) {
            class559.field7782[var3] = true;
        }
        class294.method1765(26954);
        class176.field2459 = null;
        class643.field8911 = 0L;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V", line = 3269)
    public void method448(int arg0) {
        ++field5424;
        if (this.field5611 != null) {
            this.field5611.method1220(22570);
        }
        this.field5633 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!ij", name = "za", descriptor = "(IIIII)V", line = 3280)
    public final void method458(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2435(1);
        ++field5532;
        this.method2382(arg3, -4068);
        this.method2394(class21.field383, (byte) 85, 0);
        this.method2422(class21.field383, 0, (byte) -10);
        this.method2440(arg4, (byte) -61);
        this.field5560.method2747(-16363, (float) arg2, (float) arg2, 1.0F);
        this.field5560.method600(arg0, arg1, 0);
        this.method2430(1);
        this.method1982(false, -58);
        this.method2041(0, this.field5699, (byte) 73);
        this.method2033(17069, this.field5702);
        this.method2004(class426.field5714, 256, 0, -126);
        this.method1982(true, -90);
        this.method2422(class447.field5937, 0, (byte) -10);
        this.method2394(class447.field5937, (byte) 81, 0);
    }

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "(IIII)V", line = 3302)
    public final void method525(int arg0, int arg1, int arg2, int arg3) {
        ++field5562;
        boolean var5 = false;
        if (~arg0 < ~this.field5625) {
            var5 = true;
            this.field5625 = arg0;
        }
        if (~arg2 > ~this.field5674) {
            var5 = true;
            this.field5674 = arg2;
        }
        if (~this.field5612 > ~arg1) {
            var5 = true;
            this.field5612 = arg1;
        }
        if (~this.field5628 < ~arg3) {
            var5 = true;
            this.field5628 = arg3;
        }
        if (var5) {
            if (!this.field5708) {
                this.field5708 = true;
                this.method1989(-121);
            }
            this.method2015((byte) -106);
            this.method2365(125);
        }
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V", line = 3351)
    public final void method461(int arg0) {
        ++field5388;
    }

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "()Z", line = 3369)
    public final boolean method474() {
        ++field5421;
        return true;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[F)[F", line = 3379)
    public final float[] method2432(int arg0, float[] arg1) {
        ++field5425;
        arg1[0] = this.field5609[0];
        arg1[4] = this.field5609[1];
        arg1[12] = this.field5609[3];
        arg1[8] = this.field5609[2];
        arg1[9] = this.field5609[6];
        arg1[1] = this.field5609[4];
        if (arg0 != -23481) {
            method2395((byte) 75);
        }
        arg1[5] = this.field5609[5];
        arg1[2] = this.field5609[8];
        arg1[13] = this.field5609[7];
        arg1[7] = this.field5609[13];
        arg1[6] = this.field5609[9];
        arg1[10] = this.field5609[10];
        arg1[14] = this.field5609[11];
        arg1[3] = this.field5609[12];
        arg1[15] = this.field5609[15];
        arg1[11] = this.field5609[14];
        return arg1;
    }

    @OriginalMember(owner = "client!ij", name = "ab", descriptor = "(I)V", line = 3406)
    public final void method2433(int arg0) {
        ++field5420;
        if (~this.field5639 != -17) {
            this.method2419(-8);
            this.method2367(true, arg0 + 12186);
            this.method2373(14, true);
            this.method2385(-40, true);
            this.method2440(1, (byte) -64);
            this.field5639 = 16;
        }
        if (arg0 != -12218) {
            this.field5675 = true;
        }
    }

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "()Lpda;", line = 3427)
    public final class631 method531() {
        ++field5432;
        return this.field5704;
    }

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "(Z)V", line = 3436)
    private final void method2434(boolean arg0) {
        this.field5584 = (float) this.field5661;
        ++field5497;
        if (!arg0) {
            this.method2392(51);
        }
    }

    @OriginalMember(owner = "client!ij", name = "bb", descriptor = "(I)V", line = 3449)
    private final void method2435(int arg0) {
        if (arg0 != 1) {
            this.field5667 = null;
        }
        ++field5516;
        if (~this.field5639 != -2) {
            this.method2366(14833);
            this.method2367(false, -32);
            this.method2438(true, false);
            this.method2373(14, false);
            this.method2385(arg0 ^ -96, false);
            this.method2410(false, false, (byte) 87, -2);
            this.method2379(1, -15829);
            this.method2396(22357, this.field5648);
            this.field5639 = 1;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lmda;)V", line = 3482)
    public final void method496(class267 arg0) {
        ++field5574;
        this.field5606 = (class33) arg0;
    }

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "()I", line = 3491)
    public final int method451() {
        ++field5566;
        return this.field5589;
    }

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "(B)V", line = 3500)
    public final void method2436(byte arg0) {
        ++field5457;
        Enumeration var2 = this.field5502.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method2020(this.field5502.get(var3), var3, false);
        }
        this.field5694.method294((byte) 44);
        this.field5688.method294((byte) 44);
        this.field5699.method294((byte) 44);
        this.field5690.method3226(true);
        this.field5693.method3226(true);
        this.field5696.method3226(true);
        this.field5701.method3226(true);
        this.field5700.method3226(true);
        if (arg0 >= -71) {
            this.field5644 = 94;
        }
        this.field5672.method1095(false);
        this.field5705.method294((byte) 44);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 3531)
    public final void method486(Canvas arg0) {
        ++field5475;
        this.field5479 = null;
        this.field5401 = null;
        if (arg0 != null && this.field5514 != arg0) {
            if (this.field5502.containsKey(arg0)) {
                this.field5401 = this.field5502.get(arg0);
                this.field5479 = arg0;
            }
        } else {
            this.field5479 = this.field5514;
            this.field5401 = this.field5547;
        }
        if (this.field5479 != null && this.field5401 != null) {
            this.method2007(this.field5479, this.field5401, 17789);
            this.method2416(true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ij", name = "cb", descriptor = "(I)V", line = 3566)
    public final void method2437(int arg0) {
        ++field5538;
        this.method2378(arg0 + -122, class426.field5714, arg0);
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(ZZ)V", line = 3574)
    public final void method2438(boolean arg0, boolean arg1) {
        ++field5545;
        if (arg0) {
            if (!this.field5616 == arg1) {
                this.field5616 = arg1;
                this.method2039(-6109);
                this.field5639 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "()Lpda;", line = 3592)
    public final class631 method480() {
        ++field5559;
        return this.field5578;
    }

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "()Z", line = 3602)
    public final boolean method490() {
        ++field5446;
        return false;
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(II)I", line = 3615)
    public final int method542(int arg0, int arg1) {
        ++field5549;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!ij", name = "db", descriptor = "(I)V", line = 3623)
    private final void method2439(int arg0) {
        this.field5681 = false;
        if (arg0 != -3057) {
            this.method500((class274) null, (class728[]) null, true);
        }
        ++field5429;
        if (this.field5651 != null) {
            this.field5651.method407(98);
        }
        this.method1987(3);
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)V", line = 3647)
    public final void method473(int arg0) {
        ++field5405;
        if (~arg0 <= -129 && arg0 <= 1024) {
            if (this.field5611 != null) {
                this.field5611.method1219((byte) 58);
            }
            this.field5645 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([I)V", line = 3663)
    public final void method454(int[] arg0) {
        ++field5431;
        arg0[0] = this.field5445;
        arg0[1] = this.field5494;
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(IB)V", line = 3673)
    public final void method2440(int arg0, byte arg1) {
        ++field5433;
        if (arg1 >= -27) {
            this.field5658 = false;
        }
        if (~this.field5668 != ~arg0) {
            boolean var3;
            class508 var4;
            boolean var5;
            if (arg0 != 1) {
                if (arg0 == 2) {
                    var3 = false;
                    var4 = class301.field3943;
                    var5 = true;
                } else if (arg0 == 128) {
                    var4 = class665.field9357;
                    var3 = true;
                    var5 = true;
                } else {
                    var5 = false;
                    var4 = class347.field4460;
                    var3 = false;
                }
            } else {
                var4 = class514.field7213;
                var3 = true;
                var5 = true;
            }
            if (this.field5627 != var3) {
                this.field5627 = var3;
                this.method2027((byte) 40);
            }
            if (var5 == !this.field5587) {
                this.field5587 = var5;
                this.method2003(-8);
            }
            if (this.field5630 != var4) {
                this.field5630 = var4;
                this.method2008(0);
            }
            this.field5639 &= -29;
            this.field5668 = arg0;
        }
    }

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "(B)V", line = 3743)
    public final void method2441(byte arg0) {
        if (class287.field3605 != this.field5601) {
            class300 var2 = this.field5601;
            this.field5601 = class287.field3605;
            if (var2.method1795(-1)) {
                this.method2439(arg0 ^ -3004);
            }
            this.field5609 = this.field5621;
            this.field5639 &= -32;
        }
        if (arg0 != 75) {
            this.field5615 = 105;
        }
        ++field5499;
    }

    @OriginalMember(owner = "client!ij", name = "XA", descriptor = "()I", line = 3767)
    public final int method546() {
        ++field5565;
        return this.field5661;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIZLet;[B)Lwk;")
    public abstract class145 method2013(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class596 arg6, byte[] arg7);

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V")
    public abstract void method1992(int arg0);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
    public abstract void method2020(Object arg0, Canvas arg1, boolean arg2);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILjv;Liaa;ZII)V")
    public abstract void method2030(int arg0, int arg1, class81 arg2, class497 arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILbp;Z)V")
    public abstract void method1999(int arg0, int arg1, class389 arg2, boolean arg3);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILia;B)V")
    public abstract void method2041(int arg0, class591 arg1, byte arg2);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Let;Lwha;Z)Z")
    public abstract boolean method1993(class596 arg0, class285 arg1, boolean arg2);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z[IIBIII)Lwk;")
    public abstract class145 method2010(boolean arg0, int[] arg1, int arg2, byte arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZZ)Lia;")
    public abstract class591 method2042(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(B)V")
    public abstract void method2015(byte arg0);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lmg;I)V")
    public abstract void method2014(class151 arg0, int arg1);

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "(I)V")
    public abstract void method1989(int arg0);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILet;ZI[FIZ)Lwk;")
    public abstract class145 method2038(int arg0, int arg1, class596 arg2, boolean arg3, int arg4, float[] arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "(I)V")
    public abstract void method2003(int arg0);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljv;III)V")
    public abstract void method2004(class81 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "(B)V")
    public abstract void method2027(byte arg0);

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "(B)V")
    public abstract void method2040(byte arg0);

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "(I)V")
    public abstract void method2039(int arg0);

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "(I)V")
    public abstract void method2035(int arg0);

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "(B)V")
    public abstract void method1990(byte arg0);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[BIILet;I)Laga;")
    public abstract class668 method2000(int arg0, byte[] arg1, int arg2, int arg3, class596 arg4, int arg5);

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "(I)V")
    public abstract void method2008(int arg0);

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "(I)V")
    public abstract void method2029(int arg0);

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "(B)V")
    public abstract void method2037(byte arg0);

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "(I)V")
    public abstract void method1996(int arg0);

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "(B)V")
    public abstract void method1986(byte arg0);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILri;)V")
    public abstract void method2033(int arg0, class114 arg1);

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "(I)V")
    public abstract void method2032(int arg0);

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(ZI)V")
    public abstract void method1982(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method2009(byte arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "(I)V")
    public abstract void method1998(int arg0);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
    public abstract void method2007(Canvas arg0, Object arg1, int arg2);

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "(B)V")
    public abstract void method2024(byte arg0);

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(Z)V")
    public abstract void method1991(boolean arg0);

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(Z)V")
    public abstract void method2031(boolean arg0);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lwha;IIBLet;)Lwk;")
    public abstract class145 method2012(class285 arg0, int arg1, int arg2, byte arg3, class596 arg4);

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "(I)V")
    public abstract void method2026(int arg0);

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "(B)V")
    public abstract void method1997(byte arg0);

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "(B)V")
    public abstract void method1988(byte arg0);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BZZLbp;I)V")
    public abstract void method2036(byte arg0, boolean arg1, boolean arg2, class389 arg3, int arg4);

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "(I)V")
    public abstract void method2002(int arg0);

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "(I)V")
    public abstract void method2022(int arg0);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZB)Liaa;")
    public abstract class497 method1995(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[Lfk;)Lri;")
    public abstract class114 method2001(int arg0, class655[] arg1);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Let;BLwha;)Z")
    public abstract boolean method1985(class596 arg0, byte arg1, class285 arg2);

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(BI)V")
    public abstract void method2006(byte arg0, int arg1);

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "(B)F")
    public abstract float method2019(byte arg0);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method2011(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZI[[I)Lnn;")
    public abstract class418 method2034(int arg0, boolean arg1, int arg2, int[][] arg3);

    @OriginalMember(owner = "client!ij", name = "eb", descriptor = "(I)V")
    public abstract void method1987(int arg0);
}
