import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;
import java.awt.Canvas;
import java.awt.Dimension;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public abstract class class387 extends class166 {

    @OriginalMember(owner = "client!hea", name = "Qb", descriptor = "Lwba;")
    private class46 field5523 = new class46();

    @OriginalMember(owner = "client!hea", name = "Md", descriptor = "Z")
    public boolean field5623 = true;

    @OriginalMember(owner = "client!hea", name = "Od", descriptor = "Lqo;")
    public class21 field5625 = new class21();

    @OriginalMember(owner = "client!hea", name = "Td", descriptor = "Lqo;")
    public class21 field5630 = new class21();

    @OriginalMember(owner = "client!hea", name = "Ud", descriptor = "Lqo;")
    public class21 field5631 = new class21();

    @OriginalMember(owner = "client!hea", name = "Vd", descriptor = "Lqo;")
    public class21 field5632 = new class21();

    @OriginalMember(owner = "client!hea", name = "Wd", descriptor = "Lqo;")
    private class21 field5633 = new class21();

    @OriginalMember(owner = "client!hea", name = "Xd", descriptor = "Lqo;")
    private class21 field5634 = new class21();

    @OriginalMember(owner = "client!hea", name = "me", descriptor = "I")
    public int field5649 = 0;

    @OriginalMember(owner = "client!hea", name = "Ce", descriptor = "[F")
    private float[] field5665 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!hea", name = "Yd", descriptor = "[F")
    public float[] field5635 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!hea", name = "ue", descriptor = "Z")
    public boolean field5657 = false;

    @OriginalMember(owner = "client!hea", name = "ve", descriptor = "F")
    public float field5658 = -1.0F;

    @OriginalMember(owner = "client!hea", name = "Se", descriptor = "Z")
    private boolean field5681 = false;

    @OriginalMember(owner = "client!hea", name = "oe", descriptor = "I")
    public int field5651 = -1;

    @OriginalMember(owner = "client!hea", name = "Ae", descriptor = "Z")
    public boolean field5663 = true;

    @OriginalMember(owner = "client!hea", name = "Be", descriptor = "Z")
    private boolean field5664 = false;

    @OriginalMember(owner = "client!hea", name = "Me", descriptor = "[Lvca;")
    private class252[] field5675 = new class252[10];

    @OriginalMember(owner = "client!hea", name = "Fe", descriptor = "I")
    public int field5668 = 128;

    @OriginalMember(owner = "client!hea", name = "se", descriptor = "I")
    public int field5655 = 8;

    @OriginalMember(owner = "client!hea", name = "Ye", descriptor = "[F")
    public float[] field5687 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!hea", name = "ef", descriptor = "I")
    public int field5693 = 0;

    @OriginalMember(owner = "client!hea", name = "Xe", descriptor = "I")
    public int field5686 = 0;

    @OriginalMember(owner = "client!hea", name = "cf", descriptor = "[F")
    private float[] field5691 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!hea", name = "Re", descriptor = "I")
    public int field5680 = 3584;

    @OriginalMember(owner = "client!hea", name = "Le", descriptor = "Z")
    private boolean field5674 = false;

    @OriginalMember(owner = "client!hea", name = "ye", descriptor = "I")
    public int field5661 = 0;

    @OriginalMember(owner = "client!hea", name = "ze", descriptor = "I")
    public int field5662 = 0;

    @OriginalMember(owner = "client!hea", name = "tf", descriptor = "I")
    private int field5707 = -1;

    @OriginalMember(owner = "client!hea", name = "Te", descriptor = "I")
    public int field5682 = 3;

    @OriginalMember(owner = "client!hea", name = "mf", descriptor = "Z")
    public boolean field5700 = true;

    @OriginalMember(owner = "client!hea", name = "Ie", descriptor = "Z")
    public boolean field5671 = true;

    @OriginalMember(owner = "client!hea", name = "je", descriptor = "Lno;")
    public class652 field5646 = class264.field4004;

    @OriginalMember(owner = "client!hea", name = "we", descriptor = "I")
    public int field5659 = 0;

    @OriginalMember(owner = "client!hea", name = "qf", descriptor = "[F")
    private float[] field5704 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!hea", name = "ce", descriptor = "Z")
    public boolean field5639 = true;

    @OriginalMember(owner = "client!hea", name = "De", descriptor = "I")
    private int field5666 = -1;

    @OriginalMember(owner = "client!hea", name = "pf", descriptor = "[F")
    private float[] field5703 = new float[16];

    @OriginalMember(owner = "client!hea", name = "Ne", descriptor = "I")
    private int field5676 = 0;

    @OriginalMember(owner = "client!hea", name = "kf", descriptor = "Z")
    private boolean field5698 = false;

    @OriginalMember(owner = "client!hea", name = "Ge", descriptor = "Z")
    public boolean field5669 = false;

    @OriginalMember(owner = "client!hea", name = "Bf", descriptor = "I")
    private int field5715 = 0;

    @OriginalMember(owner = "client!hea", name = "hf", descriptor = "I")
    public int field5696 = 0;

    @OriginalMember(owner = "client!hea", name = "ee", descriptor = "Z")
    private boolean field5641 = false;

    @OriginalMember(owner = "client!hea", name = "yf", descriptor = "I")
    private int field5712 = 1;

    @OriginalMember(owner = "client!hea", name = "Ke", descriptor = "[F")
    private float[] field5673 = new float[16];

    @OriginalMember(owner = "client!hea", name = "He", descriptor = "I")
    public int field5670 = 0;

    @OriginalMember(owner = "client!hea", name = "ae", descriptor = "[F")
    public float[] field5637 = this.field5691;

    @OriginalMember(owner = "client!hea", name = "Ef", descriptor = "I")
    public int field5718 = -1;

    @OriginalMember(owner = "client!hea", name = "be", descriptor = "I")
    public int field5638 = 512;

    @OriginalMember(owner = "client!hea", name = "Df", descriptor = "F")
    public float field5717 = 1.0F;

    @OriginalMember(owner = "client!hea", name = "If", descriptor = "I")
    public int field5722 = 0;

    @OriginalMember(owner = "client!hea", name = "ne", descriptor = "F")
    public float field5650 = 1.0F;

    @OriginalMember(owner = "client!hea", name = "Pe", descriptor = "[F")
    private float[] field5678 = new float[16];

    @OriginalMember(owner = "client!hea", name = "Oe", descriptor = "Z")
    public boolean field5677 = true;

    @OriginalMember(owner = "client!hea", name = "bf", descriptor = "F")
    public float field5690 = 1.0F;

    @OriginalMember(owner = "client!hea", name = "Jf", descriptor = "I")
    private int field5723 = 0;

    @OriginalMember(owner = "client!hea", name = "gf", descriptor = "I")
    private int field5695 = 0;

    @OriginalMember(owner = "client!hea", name = "Pf", descriptor = "F")
    public float field5729 = -1.0F;

    @OriginalMember(owner = "client!hea", name = "Of", descriptor = "Z")
    private boolean field5728 = false;

    @OriginalMember(owner = "client!hea", name = "Ff", descriptor = "F")
    public float field5719 = 1.0F;

    @OriginalMember(owner = "client!hea", name = "Nf", descriptor = "F")
    public float field5727 = 3584.0F;

    @OriginalMember(owner = "client!hea", name = "Hf", descriptor = "Z")
    public boolean field5721 = false;

    @OriginalMember(owner = "client!hea", name = "of", descriptor = "I")
    private int field5702 = -1;

    @OriginalMember(owner = "client!hea", name = "Kf", descriptor = "I")
    public int field5724 = 50;

    @OriginalMember(owner = "client!hea", name = "Uf", descriptor = "I")
    public int field5734 = 512;

    @OriginalMember(owner = "client!hea", name = "Sf", descriptor = "F")
    public float field5732 = 3584.0F;

    @OriginalMember(owner = "client!hea", name = "Ve", descriptor = "I")
    public int field5684 = 0;

    @OriginalMember(owner = "client!hea", name = "Qf", descriptor = "Z")
    public boolean field5730 = false;

    @OriginalMember(owner = "client!hea", name = "Tf", descriptor = "I")
    private int field5733 = 16777215;

    @OriginalMember(owner = "client!hea", name = "Gf", descriptor = "Lnba;")
    public class268 field5720 = class239.field3748;

    @OriginalMember(owner = "client!hea", name = "xe", descriptor = "F")
    private float field5660 = 1.0F;

    @OriginalMember(owner = "client!hea", name = "ke", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5647 = new Stream();

    @OriginalMember(owner = "client!hea", name = "og", descriptor = "Lqo;")
    private class21 field5754 = new class21();

    @OriginalMember(owner = "client!hea", name = "xb", descriptor = "Ljava/awt/Canvas;")
    public Canvas field5504;

    @OriginalMember(owner = "client!hea", name = "G", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5461;

    @OriginalMember(owner = "client!hea", name = "Lb", descriptor = "Ljava/lang/Object;")
    public Object field5518;

    @OriginalMember(owner = "client!hea", name = "R", descriptor = "Ljava/lang/Object;")
    private Object field5472;

    @OriginalMember(owner = "client!hea", name = "Ec", descriptor = "Lpu;")
    public class522 field5563;

    @OriginalMember(owner = "client!hea", name = "Zd", descriptor = "I")
    public int field5636;

    @OriginalMember(owner = "client!hea", name = "Gd", descriptor = "I")
    private int field5617;

    @OriginalMember(owner = "client!hea", name = "wc", descriptor = "I")
    public int field5555;

    @OriginalMember(owner = "client!hea", name = "oc", descriptor = "I")
    private int field5547;

    @OriginalMember(owner = "client!hea", name = "pd", descriptor = "I")
    public int field5600;

    @OriginalMember(owner = "client!hea", name = "Je", descriptor = "I")
    public int field5672;

    @OriginalMember(owner = "client!hea", name = "te", descriptor = "Lbw;")
    private class639 field5656;

    @OriginalMember(owner = "client!hea", name = "Yc", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field5583;

    @OriginalMember(owner = "client!hea", name = "de", descriptor = "F")
    public float field5640;

    @OriginalMember(owner = "client!hea", name = "he", descriptor = "F")
    public float field5644;

    @OriginalMember(owner = "client!hea", name = "ie", descriptor = "F")
    public float field5645;

    @OriginalMember(owner = "client!hea", name = "Ee", descriptor = "F")
    private float field5667;

    @OriginalMember(owner = "client!hea", name = "Ue", descriptor = "F")
    public float field5683;

    @OriginalMember(owner = "client!hea", name = "Af", descriptor = "F")
    public float field5714;

    @OriginalMember(owner = "client!hea", name = "Rf", descriptor = "F")
    private float field5731;

    @OriginalMember(owner = "client!hea", name = "Vf", descriptor = "F")
    public float field5735;

    @OriginalMember(owner = "client!hea", name = "o", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!hea", name = "p", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!hea", name = "q", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!hea", name = "r", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!hea", name = "s", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!hea", name = "t", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!hea", name = "u", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!hea", name = "v", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!hea", name = "x", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!hea", name = "y", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!hea", name = "z", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!hea", name = "A", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!hea", name = "B", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!hea", name = "C", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!hea", name = "D", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!hea", name = "E", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!hea", name = "F", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!hea", name = "H", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!hea", name = "I", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!hea", name = "J", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!hea", name = "K", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!hea", name = "L", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!hea", name = "M", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!hea", name = "N", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!hea", name = "O", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!hea", name = "P", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!hea", name = "Q", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!hea", name = "S", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!hea", name = "T", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!hea", name = "U", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!hea", name = "V", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!hea", name = "W", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!hea", name = "X", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!hea", name = "Y", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!hea", name = "Z", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!hea", name = "ab", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!hea", name = "bb", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!hea", name = "cb", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!hea", name = "db", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!hea", name = "eb", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!hea", name = "fb", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!hea", name = "gb", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!hea", name = "hb", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!hea", name = "ib", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!hea", name = "jb", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!hea", name = "kb", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!hea", name = "lb", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!hea", name = "mb", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!hea", name = "nb", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!hea", name = "ob", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!hea", name = "pb", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!hea", name = "qb", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!hea", name = "rb", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!hea", name = "sb", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!hea", name = "tb", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!hea", name = "ub", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!hea", name = "wb", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!hea", name = "yb", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!hea", name = "zb", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!hea", name = "Ab", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!hea", name = "Bb", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!hea", name = "Cb", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!hea", name = "Db", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!hea", name = "Eb", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!hea", name = "Fb", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!hea", name = "Gb", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!hea", name = "Hb", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!hea", name = "Ib", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!hea", name = "Kb", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!hea", name = "Mb", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!hea", name = "Nb", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!hea", name = "Ob", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!hea", name = "Pb", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!hea", name = "Rb", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!hea", name = "Sb", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!hea", name = "Tb", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!hea", name = "Ub", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!hea", name = "Vb", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!hea", name = "Wb", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!hea", name = "Xb", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!hea", name = "Yb", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!hea", name = "Zb", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!hea", name = "ac", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!hea", name = "bc", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!hea", name = "cc", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!hea", name = "dc", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!hea", name = "ec", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!hea", name = "fc", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!hea", name = "gc", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!hea", name = "hc", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!hea", name = "ic", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!hea", name = "jc", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!hea", name = "kc", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!hea", name = "lc", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!hea", name = "mc", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!hea", name = "nc", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!hea", name = "pc", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!hea", name = "qc", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!hea", name = "rc", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!hea", name = "sc", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!hea", name = "tc", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!hea", name = "uc", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!hea", name = "vc", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!hea", name = "xc", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!hea", name = "yc", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!hea", name = "zc", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!hea", name = "Ac", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!hea", name = "Bc", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!hea", name = "Cc", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!hea", name = "Dc", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!hea", name = "Fc", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!hea", name = "Gc", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!hea", name = "Hc", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!hea", name = "Ic", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!hea", name = "Jc", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!hea", name = "Kc", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!hea", name = "Lc", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!hea", name = "Mc", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!hea", name = "Nc", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!hea", name = "Oc", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!hea", name = "Pc", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!hea", name = "Qc", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!hea", name = "Rc", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!hea", name = "Sc", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!hea", name = "Tc", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!hea", name = "Uc", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!hea", name = "Vc", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!hea", name = "Wc", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!hea", name = "Xc", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!hea", name = "Zc", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!hea", name = "ad", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!hea", name = "bd", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!hea", name = "cd", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!hea", name = "dd", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!hea", name = "ed", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!hea", name = "fd", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!hea", name = "gd", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!hea", name = "hd", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!hea", name = "id", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!hea", name = "jd", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!hea", name = "kd", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!hea", name = "ld", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!hea", name = "md", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!hea", name = "nd", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!hea", name = "od", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!hea", name = "qd", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!hea", name = "rd", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!hea", name = "td", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!hea", name = "ud", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!hea", name = "vd", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!hea", name = "wd", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!hea", name = "xd", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!hea", name = "yd", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!hea", name = "zd", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!hea", name = "Ad", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!hea", name = "Bd", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!hea", name = "Cd", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!hea", name = "Dd", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!hea", name = "Ed", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!hea", name = "Fd", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!hea", name = "Hd", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!hea", name = "Id", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!hea", name = "Jd", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!hea", name = "Kd", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!hea", name = "Ld", descriptor = "I")
    public int field5622;

    @OriginalMember(owner = "client!hea", name = "Nd", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!hea", name = "Pd", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!hea", name = "Qd", descriptor = "I")
    public int field5627;

    @OriginalMember(owner = "client!hea", name = "Rd", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!hea", name = "Sd", descriptor = "I")
    public int field5629;

    @OriginalMember(owner = "client!hea", name = "fe", descriptor = "I")
    public int field5642;

    @OriginalMember(owner = "client!hea", name = "Ze", descriptor = "I")
    public int field5688;

    @OriginalMember(owner = "client!hea", name = "af", descriptor = "I")
    public int field5689;

    @OriginalMember(owner = "client!hea", name = "df", descriptor = "I")
    private int field5692;

    @OriginalMember(owner = "client!hea", name = "jf", descriptor = "I")
    private int field5697;

    @OriginalMember(owner = "client!hea", name = "lf", descriptor = "I")
    public int field5699;

    @OriginalMember(owner = "client!hea", name = "rf", descriptor = "I")
    public int field5705;

    @OriginalMember(owner = "client!hea", name = "vf", descriptor = "I")
    public int field5709;

    @OriginalMember(owner = "client!hea", name = "wf", descriptor = "I")
    public int field5710;

    @OriginalMember(owner = "client!hea", name = "xf", descriptor = "I")
    public int field5711;

    @OriginalMember(owner = "client!hea", name = "qg", descriptor = "I")
    private int field5756;

    @OriginalMember(owner = "client!hea", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!hea", name = "pe", descriptor = "Lrea;")
    private class190 field5652;

    @OriginalMember(owner = "client!hea", name = "w", descriptor = "Luk;")
    public class234 field5451;

    @OriginalMember(owner = "client!hea", name = "fg", descriptor = "Lrn;")
    private class241 field5745;

    @OriginalMember(owner = "client!hea", name = "ge", descriptor = "Lvca;")
    private class252 field5643;

    @OriginalMember(owner = "client!hea", name = "sf", descriptor = "Lbb;")
    public class301 field5706;

    @OriginalMember(owner = "client!hea", name = "Wf", descriptor = "Lrd;")
    public class305 field5736;

    @OriginalMember(owner = "client!hea", name = "Yf", descriptor = "Lrd;")
    private class305 field5738;

    @OriginalMember(owner = "client!hea", name = "ag", descriptor = "Lrd;")
    public class305 field5740;

    @OriginalMember(owner = "client!hea", name = "cg", descriptor = "Lrd;")
    private class305 field5742;

    @OriginalMember(owner = "client!hea", name = "dg", descriptor = "Lrd;")
    public class305 field5743;

    @OriginalMember(owner = "client!hea", name = "eg", descriptor = "Lrd;")
    public class305 field5744;

    @OriginalMember(owner = "client!hea", name = "re", descriptor = "Luda;")
    private class415 field5654;

    @OriginalMember(owner = "client!hea", name = "Xf", descriptor = "Ldm;")
    public class48 field5737;

    @OriginalMember(owner = "client!hea", name = "Zf", descriptor = "Ldm;")
    public class48 field5739;

    @OriginalMember(owner = "client!hea", name = "bg", descriptor = "Ldm;")
    public class48 field5741;

    @OriginalMember(owner = "client!hea", name = "gg", descriptor = "Ldm;")
    public class48 field5746;

    @OriginalMember(owner = "client!hea", name = "hg", descriptor = "Ldm;")
    public class48 field5747;

    @OriginalMember(owner = "client!hea", name = "ig", descriptor = "Ldm;")
    public class48 field5748;

    @OriginalMember(owner = "client!hea", name = "jg", descriptor = "Ldm;")
    public class48 field5749;

    @OriginalMember(owner = "client!hea", name = "lg", descriptor = "Ldm;")
    public class48 field5751;

    @OriginalMember(owner = "client!hea", name = "mg", descriptor = "Ldm;")
    public class48 field5752;

    @OriginalMember(owner = "client!hea", name = "pg", descriptor = "Ldm;")
    public class48 field5755;

    @OriginalMember(owner = "client!hea", name = "kg", descriptor = "Lbca;")
    private class613 field5750;

    @OriginalMember(owner = "client!hea", name = "ng", descriptor = "Lbca;")
    private class613 field5753;

    @OriginalMember(owner = "client!hea", name = "sd", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field5603;

    @OriginalMember(owner = "client!hea", name = "Jb", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field5516;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hea", name = "sg", descriptor = "Ljava/lang/Class;")
    public static Class field5758;

    @OriginalMember(owner = "client!hea", name = "vb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field5502;

    @OriginalMember(owner = "client!hea", name = "le", descriptor = "Z")
    public boolean field5648;

    @OriginalMember(owner = "client!hea", name = "qe", descriptor = "Z")
    public boolean field5653;

    @OriginalMember(owner = "client!hea", name = "ff", descriptor = "Z")
    public boolean field5694;

    @OriginalMember(owner = "client!hea", name = "nf", descriptor = "Z")
    public boolean field5701;

    @OriginalMember(owner = "client!hea", name = "zf", descriptor = "Z")
    public boolean field5713;

    @OriginalMember(owner = "client!hea", name = "rg", descriptor = "Z")
    public boolean field5757;

    @OriginalMember(owner = "client!hea", name = "Qe", descriptor = "[Lqo;")
    public class21[] field5679;

    @OriginalMember(owner = "client!hea", name = "Cf", descriptor = "[Lbb;")
    private class301[] field5716;

    @OriginalMember(owner = "client!hea", name = "Lf", descriptor = "[Lso;")
    public class433[] field5725;

    @OriginalMember(owner = "client!hea", name = "Mf", descriptor = "[Lrc;")
    public class498[] field5726;

    @OriginalMember(owner = "client!hea", name = "We", descriptor = "[Leca;")
    public class704[] field5685;

    @OriginalMember(owner = "client!hea", name = "uf", descriptor = "[Leca;")
    public class704[] field5708;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I[Lrc;)V")
    public final void method134(int arg0, class498[] arg1) {
        for (int var3 = 0; ~var3 > ~arg0; ++var3) {
            this.field5726[var3] = arg1[var3];
        }
        ++field5605;
        this.field5710 = arg0;
        if (this.field5646.method3603(0)) {
            this.method1875(false);
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILkda;II)V")
    public abstract void method1880(int arg0, class353 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(II)V")
    public final void method2308(int arg0, int arg1) {
        ++field5606;
        if (arg1 == 1) {
            this.method2339(class190.field2740, -32540, class190.field2740);
        } else if (~arg1 != -1) {
            if (~arg1 == -3) {
                this.method2339(class203.field2875, -32540, class190.field2740);
            } else if (arg1 != 3) {
                if (~arg1 == -5) {
                    this.method2339(class444.field6468, -32540, class444.field6468);
                }
            } else {
                this.method2339(class413.field6010, -32540, class153.field2209);
            }
        } else {
            this.method2339(class153.field2209, arg0 + -32539, class153.field2209);
        }
        if (arg0 != -1) {
            this.field5712 = -25;
        }
    }

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "(I)[F")
    public final float[] method2309(int arg0) {
        ++field5457;
        return arg0 != 0 ? null : this.field5691;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)V")
    public final void method2310(byte arg0) {
        if (arg0 > -94) {
            this.method2384(71);
        }
        if (this.field5697 != 16) {
            this.method2384(262144);
            this.method2345(true, -16682);
            this.method2315(-32, true);
            this.method2369((byte) 71, true);
            this.method2326(true, 1);
            this.field5697 = 16;
        }
        ++field5483;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V")
    public void method151(int arg0) {
        ++field5503;
        if (this.field5656 != null) {
            this.field5656.method3558((byte) -59);
        }
        this.field5688 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(B)V")
    public final void method2311(byte arg0) {
        ++field5484;
        if (arg0 <= -126) {
            this.method2359(class293.field4321, 2, -110);
        }
    }

    @OriginalMember(owner = "client!hea", name = "i", descriptor = "(I)V")
    private final void method2312(int arg0) {
        this.method1882(-100);
        if (arg0 != 12) {
            this.field5679 = null;
        }
        ++field5552;
        if (this.field5643 != null) {
            this.field5643.method1690(arg0 + -13);
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lq;)V")
    public final void method155(class391 arg0) {
        this.field5630 = (class21) arg0;
        ++field5578;
        this.field5632.method274(this.field5630);
        this.field5632.method268(-49);
        this.field5633.method250(101, this.field5632);
        this.field5631.method250(82, this.field5630);
        if (this.field5646.method3603(0)) {
            this.method2372(false);
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)I")
    public final int method172(int arg0, int arg1) {
        ++field5447;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Luq;[Lfg;Z)Lla;")
    public final class416 method128(class146 arg0, class113[] arg1, boolean arg2) {
        ++field5546;
        return new class611(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIII)Ljba;")
    public final class363 method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5610;
        return new class655(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!hea", name = "f", descriptor = "()Z")
    public final boolean method104() {
        ++field5575;
        return true;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZB)V")
    public final void method2313(boolean arg0, byte arg1) {
        ++field5614;
        if (this.field5677 == !arg0) {
            this.field5677 = arg0;
            this.method1872(0);
        }
        if (arg1 != -20) {
            this.method182((Canvas) null);
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(FFFFFFB)Z")
    private final boolean method2314(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, byte arg6) {
        ++field5573;
        Buffer var8 = this.field5753.method995(true, 1614);
        if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method2381(0, var8);
            if (Stream.method3483()) {
                var9.method3474(arg5);
                var9.method3474(arg2);
                var9.method3474(arg3);
                var9.method3474(arg0);
                var9.method3474(arg4);
                var9.method3474(arg1);
            } else {
                var9.method3476(arg5);
                var9.method3476(arg2);
                var9.method3476(arg3);
                var9.method3476(arg0);
                var9.method3476(arg4);
                var9.method3476(arg1);
            }
            var9.method3471();
            int var10 = -125 % ((arg6 - 6) / 38);
            return this.field5753.method992((byte) -105);
        }
    }

    @OriginalMember(owner = "client!hea", name = "z", descriptor = "()Lq;")
    public final class391 method130() {
        ++field5507;
        return this.field5754;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IZ)V")
    public final void method2315(int arg0, boolean arg1) {
        if (arg0 == -32) {
            if (!arg1 == this.field5730) {
                this.field5730 = arg1;
                this.method1908(6);
                this.field5697 &= -32;
            }
            ++field5565;
        }
    }

    @OriginalMember(owner = "client!hea", name = "q", descriptor = "()Z")
    public final boolean method167() {
        ++field5542;
        return true;
    }

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(B)V")
    private final void method2316(byte arg0) {
        ++field5594;
        this.field5753 = this.method1901(-21710, true);
        if (arg0 != 60) {
            this.method1890((byte) 69);
        }
        this.field5753.method993(24, arg0 ^ -6684, 12);
        this.field5738 = this.method1866(-100, new class399[] { new class399(class342.field5015) });
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(II)I")
    public final int method160(int arg0, int arg1) {
        ++field5534;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IZ[BILlca;IZI)Loi;")
    public abstract class65 method1878(int arg0, boolean arg1, byte[] arg2, int arg3, class597 arg4, int arg5, boolean arg6, int arg7);

    @OriginalMember(owner = "client!hea", name = "j", descriptor = "(I)I")
    public final int method2317(int arg0) {
        if (arg0 <= 67) {
            this.method1875(false);
        }
        ++field5471;
        return this.field5666;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(BZ)V")
    public final void method2318(byte arg0, boolean arg1) {
        ++field5512;
        if (this.field5721 != arg1) {
            this.field5721 = arg1;
            this.method1919((byte) -87);
            this.field5697 &= -8;
        }
        if (arg0 != -24) {
            this.field5756 = 55;
        }
    }

    @OriginalMember(owner = "client!hea", name = "IA", descriptor = "(IIIIII[BII)V")
    public final void method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field5554;
    }

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "(Z)V")
    public final void method2319(boolean arg0) {
        ++field5520;
        Hashtable var2 = new Hashtable();
        if (this.field5502 != null && !this.field5502.isEmpty()) {
            Enumeration var3 = this.field5502.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method1889(var4, 0));
            }
        }
        this.field5502 = var2;
        this.method2385(6697);
        this.method2316((byte) 60);
        this.field5652.method1282((byte) -128, this);
        if (arg0) {
            this.field5555 = 127;
        }
    }

    @OriginalMember(owner = "client!hea", name = "k", descriptor = "(I)V")
    private final void method2320(int arg0) {
        this.field5673[10] = this.field5731;
        this.field5673[arg0] = this.field5667;
        ++field5612;
        this.field5732 = (this.field5673[14] + (float) (-this.field5680)) / this.field5673[10];
    }

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "(II)V")
    public final void method2321(int arg0, int arg1) {
        if (arg1 != 24) {
            this.method180(114, -127, -74, -102, -77, 77);
        }
        ++field5587;
        if (~this.field5699 != ~arg0) {
            this.field5699 = arg0;
            this.method1861((byte) -94);
        }
    }

    @OriginalMember(owner = "client!hea", name = "l", descriptor = "(I)V")
    public abstract void method1882(int arg0);

    @OriginalMember(owner = "client!hea", name = "m", descriptor = "(I)V")
    private final void method2322(int arg0) {
        if (arg0 == 4) {
            if (!this.field5698) {
                float[] var2 = this.field5678;
                if (~this.field5600 != -1 && ~this.field5555 != -1) {
                    var2[11] = 0.0F;
                    var2[2] = 0.0F;
                    var2[5] = -2.0F / (float) this.field5555;
                    var2[15] = 1.0F;
                    var2[9] = 0.0F;
                    var2[6] = 0.0F;
                    var2[4] = 0.0F;
                    var2[10] = 0.5F;
                    var2[7] = 0.0F;
                    var2[14] = 0.5F;
                    var2[3] = 0.0F;
                    var2[0] = 2.0F / (float) this.field5600;
                    var2[8] = 0.0F;
                    var2[12] = -1.0F;
                    var2[13] = 1.0F;
                    var2[1] = 0.0F;
                } else {
                    var2[2] = 0.0F;
                    var2[10] = 1.0F;
                    var2[9] = 0.0F;
                    var2[12] = 0.0F;
                    var2[11] = 0.0F;
                    var2[6] = 0.0F;
                    var2[14] = 0.0F;
                    var2[4] = 0.0F;
                    var2[5] = 1.0F;
                    var2[8] = 0.0F;
                    var2[0] = 1.0F;
                    var2[15] = 1.0F;
                    var2[1] = 0.0F;
                    var2[3] = 0.0F;
                    var2[13] = 0.0F;
                    var2[7] = 0.0F;
                }
                this.field5698 = true;
            }
            ++field5473;
        }
    }

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "(B)V")
    public final void method2323(byte arg0) {
        this.field5708 = new class704[this.field5709];
        this.field5679 = new class21[this.field5709];
        this.field5725 = new class433[this.field5709];
        this.field5716 = new class301[this.field5709];
        ++field5463;
        this.field5685 = new class704[this.field5709];
        for (int var2 = 0; var2 < this.field5709; ++var2) {
            this.field5708[var2] = class153.field2209;
            this.field5685[var2] = class153.field2209;
            this.field5725[var2] = class84.field1384;
            this.field5679[var2] = new class21();
        }
        this.field5726 = new class498[this.field5705 + -2];
        this.field5706 = this.method1899(1, class218.field3050, class75.field1306, 1, (byte) -125);
        this.method196(new class22(262144));
        this.field5743 = this.method1866(arg0 + 22, new class399[] { new class399(new class342[] { class342.field5015, class342.field5019 }) });
        this.field5736 = this.method1866(-110, new class399[] { new class399(new class342[] { class342.field5015, class342.field5017 }) });
        this.field5740 = this.method1866(-43, new class399[] { new class399(class342.field5015), new class399(class342.field5017), new class399(class342.field5019), new class399(class342.field5016) });
        this.field5744 = this.method1866(arg0 + 22, new class399[] { new class399(class342.field5015), new class399(class342.field5017), new class399(class342.field5019) });
        this.field5747 = new class48(this, 0, 0, false, false);
        this.field5749 = new class48(this, 0, 0, true, true);
        this.field5746 = new class48(this, 0, 0, false, false);
        this.field5739 = new class48(this, 0, 0, true, true);
        this.field5737 = new class48(this, 0, 0, false, false);
        this.field5748 = new class48(this, 0, 0, true, true);
        this.field5752 = new class48(this, 0, 0, false, false);
        this.field5751 = new class48(this, 0, 0, true, true);
        this.field5741 = new class48(this, 0, 0, false, false);
        this.field5755 = new class48(this, 0, 0, true, true);
        this.field5652 = new class190(this);
        this.field5745 = this.method1863((byte) 122, true);
        this.method2319(false);
        this.field5451 = new class234(this);
        this.field5675[1] = this.method1887(0, 1);
        this.field5675[2] = this.method1887(0, 2);
        this.field5675[4] = this.method1887(0, 4);
        this.field5675[5] = this.method1887(0, 5);
        this.field5675[6] = this.method1887(0, 6);
        this.field5675[7] = this.method1887(0, 7);
        this.field5675[3] = this.method1887(0, 3);
        this.field5675[8] = this.method1887(class189.method1273(arg0, -108), 8);
        this.field5675[9] = this.method1887(0, 9);
        if (!this.field5675[2].method792(6439)) {
            this.field5675[2] = this.method1887(0, 0);
        }
        if (!this.field5675[4].method792(arg0 ^ -6477)) {
            this.field5675[4] = this.field5675[2];
        }
        if (arg0 == -108) {
            if (!this.field5675[8].method792(6439)) {
                this.field5675[8] = this.field5675[4];
            }
            if (!this.field5675[9].method792(6439)) {
                this.field5675[9] = this.field5675[8];
            }
            this.method1907((byte) -65);
            this.method152();
            this.method183();
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILkj;I)V")
    public final void method2324(int arg0, class525 arg1, int arg2) {
        ++field5499;
        if (arg2 == 1) {
            this.method1881(false, arg1, arg0, arg2 + -4017, false);
        }
    }

    @OriginalMember(owner = "client!hea", name = "BA", descriptor = "()I")
    public final int method110() {
        ++field5492;
        return this.field5724;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILrd;)V")
    public abstract void method1883(int arg0, class305 arg1);

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILr;)V")
    public static final void method2325(int arg0, class166 arg1) {
        ++field5557;
        if (arg0 > -13) {
            field5544 = 23;
        }
        if (~class111.field1685.method477(15650) != -1) {
            if (class328.field4859 == 0) {
                for (class85 var2 = (class85) class111.field1685.method472((byte) -68); var2 != null; var2 = (class85) class111.field1685.method482(11)) {
                    class41.field682.method2220(var2.field1401, var2.field1399 ? class648.field9106.field6993 : null, false, var2.field1402, var2.field1403, arg1, (byte) -106, arg1, class351.field5064, var2.field1394, var2.field1398, false);
                    var2.method3678(-1);
                }
                class158.method1100(104);
            } else {
                if (class179.field2549 == null) {
                    Canvas var3 = new Canvas();
                    var3.setSize(36, 32);
                    class179.field2549 = class166.method1156(class373.field5324, var3, class231.field3600, (byte) 20, 0, 0);
                    class287.field4279 = class179.field2549.method128(class652.method3605(0, (byte) 88, class81.field1363, class254.field3904), class113.method884(class703.field9909, class254.field3904, 0), true);
                }
                for (class85 var4 = (class85) class111.field1685.method472((byte) -99); var4 != null; var4 = (class85) class111.field1685.method482(119)) {
                    class41.field682.method2220(var4.field1401, !var4.field1399 ? null : class648.field9106.field6993, false, var4.field1402, var4.field1403, class179.field2549, (byte) -111, arg1, class287.field4279, var4.field1394, var4.field1398, false);
                    var4.method3678(-1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "n", descriptor = "(I)V")
    public abstract void method1885(int arg0);

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZI)V")
    public final void method2326(boolean arg0, int arg1) {
        ++field5582;
        if (this.field5712 != arg1) {
            boolean var3;
            class268 var4;
            boolean var5;
            if (~arg1 == -2) {
                var3 = true;
                var4 = class239.field3748;
                var5 = true;
            } else if (arg1 == 2) {
                var3 = false;
                var5 = true;
                var4 = class58.field1106;
            } else if (arg1 == 128) {
                var3 = true;
                var5 = true;
                var4 = class6.field57;
            } else {
                var4 = class460.field6578;
                var3 = false;
                var5 = false;
            }
            if (!this.field5671 != !var3) {
                this.field5671 = var3;
                this.method1917((byte) -93);
            }
            if (var5 == !this.field5663) {
                this.field5663 = var5;
                this.method1903((byte) 77);
            }
            if (this.field5720 != var4) {
                this.field5720 = var4;
                this.method1897(19171);
            }
            this.field5697 &= -29;
            this.field5712 = arg1;
        }
        if (!arg0) {
            this.method1863((byte) 73, false);
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "()Z")
    public final boolean method106() {
        ++field5445;
        return this.field5694;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lvi;)V")
    public final void method156(class499 arg0) {
        ++field5580;
        this.field5652.method1280(-1, (byte) -102, arg0, this);
    }

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "(Z)V")
    public abstract void method1911(boolean arg0);

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "(I)Le;")
    public final class492 method120(int arg0) {
        ++field5619;
        class22 var2 = new class22(arg0);
        this.field5523.method474(var2, 6);
        return var2;
    }

    @OriginalMember(owner = "client!hea", name = "da", descriptor = "(IIII)V")
    public final void method168(int arg0, int arg1, int arg2, int arg3) {
        ++field5591;
        if (arg0 <= 0 && arg2 >= this.field5600 - 1 && arg1 <= 0 && ~(this.field5555 + -1) >= ~arg3) {
            this.method152();
        } else {
            this.field5659 = ~arg2 < ~this.field5600 ? 0 : arg2;
            this.field5722 = arg3 > this.field5600 ? 0 : arg3;
            this.field5693 = arg1 >= 0 ? arg1 : 0;
            this.field5662 = arg0 < 0 ? 0 : arg0;
            if (!this.field5757) {
                this.field5757 = true;
                this.method1893((byte) -102);
            }
            this.method1916(false);
            this.method2387((byte) 82);
        }
    }

    @OriginalMember(owner = "client!hea", name = "U", descriptor = "()I")
    public final int method115() {
        ++field5556;
        return this.field5680;
    }

    @OriginalMember(owner = "client!hea", name = "f", descriptor = "(Z)Lqo;")
    public final class21 method2327(boolean arg0) {
        ++field5620;
        return !arg0 ? null : this.field5679[this.field5661];
    }

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "()Z")
    public final boolean method161() {
        ++field5592;
        return true;
    }

    @OriginalMember(owner = "client!hea", name = "V", descriptor = "(IIII)V")
    public final void method107(int arg0, int arg1, int arg2, int arg3) {
        ++field5481;
        boolean var5 = false;
        if (arg0 > this.field5662) {
            this.field5662 = arg0;
            var5 = true;
        }
        if (arg2 < this.field5659) {
            var5 = true;
            this.field5659 = arg2;
        }
        if (arg1 > this.field5693) {
            var5 = true;
            this.field5693 = arg1;
        }
        if (~this.field5722 < ~arg3) {
            var5 = true;
            this.field5722 = arg3;
        }
        if (var5) {
            if (!this.field5757) {
                this.field5757 = true;
                this.method1893((byte) -102);
            }
            this.method1916(false);
            this.method2387((byte) 82);
        }
    }

    @OriginalMember(owner = "client!hea", name = "o", descriptor = "(I)V")
    public final void method2328(int arg0) {
        if (arg0 != -19353) {
            this.method2370(-4, -5);
        }
        this.method2383(-32);
        ++field5548;
        this.method2348(30832);
    }

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "(I)V")
    public final void method113(int arg0) {
        ++field5586;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
    public abstract void method1868(Canvas arg0, int arg1, Object arg2);

    @OriginalMember(owner = "client!hea", name = "CA", descriptor = "(IIII)V")
    public final void method133(int arg0, int arg1, int arg2, int arg3) {
        this.field5666 = arg1;
        this.field5692 = arg0;
        ++field5571;
        this.field5653 = true;
        this.field5715 = arg3;
        this.field5707 = arg2;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public abstract Object method1889(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Llca;I[FBIZ)Loi;")
    public final class65 method2329(class597 arg0, int arg1, float[] arg2, byte arg3, int arg4, boolean arg5) {
        ++field5514;
        if (arg3 < 64) {
            this.field5756 = 62;
        }
        return this.method1891(arg2, arg4, arg0, 3401, arg1, arg5, 0, 0);
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lfa;Lpu;II)V")
    public class387(Canvas arg0, Object arg1, class209 arg2, class522 arg3, int arg4, int arg5) {
        super(arg2);
        this.field5461 = this.field5504 = arg0;
        this.field5472 = this.field5518 = arg1;
        this.field5563 = arg3;
        this.field5636 = arg4;
        Dimension var7 = arg0.getSize();
        this.field5555 = this.field5617 = var7.height;
        this.field5600 = this.field5547 = var7.width;
        this.field5672 = arg5;
        class489.method2838(false, true, (byte) 58);
        if (super.field2384 != null) {
            this.field5656 = new class639(this, super.field2384);
            this.field5583 = new NativeInterface(super.field2384.method1382(25737), this.field5672);
            for (int var8 = 0; ~super.field2384.method1382(25737) < ~var8; ++var8) {
                class159 var9 = super.field2384.method1386(var8, -6514);
                if (var9 != null) {
                    this.field5583.initTextureMetrics(var8, var9.field2292, var9.field2297);
                }
            }
        } else {
            this.field5583 = new NativeInterface(0, this.field5672);
            this.field5656 = null;
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZLlca;II[BI)Loi;")
    public final class65 method2330(boolean arg0, class597 arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        if (arg2 != 0) {
            return null;
        } else {
            ++field5537;
            return this.method1878(0, false, arg4, arg3, arg1, arg5, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!hea", name = "A", descriptor = "()Z")
    public final boolean method108() {
        ++field5566;
        return this.field5675[3].method792(6439);
    }

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "(B)I")
    public final int method2331(byte arg0) {
        if (arg0 < 111) {
            return 114;
        } else {
            ++field5453;
            return this.field5661;
        }
    }

    @OriginalMember(owner = "client!hea", name = "p", descriptor = "(I)V")
    public abstract void method1879(int arg0);

    @OriginalMember(owner = "client!hea", name = "q", descriptor = "(I)V")
    private final void method2332(int arg0) {
        if (this.field5697 != 1) {
            this.method2373(false);
            this.method2345(false, -16682);
            this.method2318((byte) -24, false);
            this.method2315(-32, false);
            this.method2369((byte) 71, false);
            this.method2389(false, false, -2, false);
            this.method2308(-1, 1);
            this.method2337(false, this.field5706);
            this.field5697 = 1;
        }
        int var2 = 101 % ((-31 - arg0) / 35);
        ++field5458;
    }

    @OriginalMember(owner = "client!hea", name = "n", descriptor = "()Lq;")
    public final class391 method100() {
        ++field5615;
        return new class21();
    }

    @OriginalMember(owner = "client!hea", name = "r", descriptor = "(I)V")
    public abstract void method1870(int arg0);

    @OriginalMember(owner = "client!hea", name = "FA", descriptor = "(ILua;II)V")
    public final void method169(int arg0, class617 arg1, int arg2, int arg3) {
        ++field5621;
        class602 var5 = (class602) arg1;
        class65 var6 = var5.field8508;
        this.method2386((byte) 86);
        this.method2337(false, var6);
        this.method2326(true, 1);
        this.method2339(class190.field2740, -32540, class190.field2740);
        this.method2324(0, class124.field1869, 1);
        this.method2321(arg0, 24);
        this.field5625.method242(0.0F, (float) this.field5555, (float) this.field5600, (byte) -54);
        this.method2340(false);
        this.field5679[0].method242(1.0F, var6.method666(true, (float) this.field5555), var6.method661((float) this.field5600, -106), (byte) -101);
        this.field5679[0].method265(var6.method666(true, (float) (-arg3)), 0.0F, 87, var6.method661((float) (-arg2), -106));
        this.field5725[0] = class266.field4017;
        this.method2312(12);
        this.method2311((byte) -128);
        this.method2358(-1);
        this.method2324(0, class61.field1155, 1);
    }

    @OriginalMember(owner = "client!hea", name = "o", descriptor = "()Z")
    public final boolean method148() {
        ++field5568;
        return true;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IBZ)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method2333(int arg0, byte arg1, boolean arg2) {
        ++field5477;
        if (arg1 <= 43) {
            this.method111((Canvas) null);
        }
        return this.field5603.method3468(arg0, arg2);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "([IIIII)Lf;")
    public final class702 method209(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5488;
        return new class302(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "([FILlca;IIZII)Loi;")
    public abstract class65 method1891(float[] arg0, int arg1, class597 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(FI)V")
    public final void method2334(float arg0, int arg1) {
        ++field5538;
        if (this.field5660 != arg0) {
            this.field5660 = arg0;
            this.method2361(70);
        }
        if (arg1 < 93) {
            this.field5737 = null;
        }
    }

    @OriginalMember(owner = "client!hea", name = "f", descriptor = "(I)V")
    public final void method101(int arg0) {
        ++field5588;
        if (arg0 >= 128 && arg0 <= 1024) {
            if (this.field5656 != null) {
                this.field5656.method3561(117);
            }
            this.field5668 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "(Z)I")
    public final int method2335(boolean arg0) {
        ++field5521;
        return arg0 ? 87 : this.field5715;
    }

    @OriginalMember(owner = "client!hea", name = "s", descriptor = "(I)V")
    public abstract void method1908(int arg0);

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "(Z)V")
    public abstract void method1860(boolean arg0);

    @OriginalMember(owner = "client!hea", name = "t", descriptor = "()Z")
    public final boolean method109() {
        ++field5511;
        return false;
    }

    @OriginalMember(owner = "client!hea", name = "i", descriptor = "(Z)Lqo;")
    public final class21 method2336(boolean arg0) {
        ++field5577;
        return arg0 ? null : this.field5625;
    }

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "()V")
    public final void method210() {
        ++field5510;
        if (this.field5656 != null) {
            this.field5656.method3561(94);
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lkda;IIZLrn;II)V")
    public abstract void method1874(class353 arg0, int arg1, int arg2, boolean arg3, class241 arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!hea", name = "x", descriptor = "()Z")
    public final boolean method123() {
        ++field5489;
        return true;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZLbb;)V")
    public final void method2337(boolean arg0, class301 arg1) {
        if (this.field5716[this.field5661] != arg1) {
            this.field5716[this.field5661] = arg1;
            if (arg1 == null) {
                this.method1911(false);
            } else {
                arg1.method861(-48);
            }
            this.field5697 &= -2;
        }
        ++field5505;
        if (arg0) {
            this.method125(false);
        }
    }

    @OriginalMember(owner = "client!hea", name = "s", descriptor = "()Z")
    public final boolean method166() {
        ++field5476;
        return true;
    }

    @OriginalMember(owner = "client!hea", name = "f", descriptor = "(B)V")
    public abstract void method1893(byte arg0);

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "(B)V")
    private final void method2338(byte arg0) {
        ++field5515;
        if (arg0 >= -16) {
            this.field5702 = -70;
        }
        this.field5641 = false;
        this.method2374((byte) 111);
        if (class203.field2870 == this.field5646) {
            this.method2348(30832);
        }
    }

    @OriginalMember(owner = "client!hea", name = "VA", descriptor = "(IFFFFF)V")
    public final void method185(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field5480;
        boolean var7 = ~this.field5733 != ~arg0;
        if (var7 || this.field5729 != arg1 || this.field5658 != arg2) {
            this.field5733 = arg0;
            this.field5729 = arg1;
            this.field5658 = arg2;
            if (var7) {
                this.field5650 = (float) (16711680 & this.field5733) / 1.671168E7F;
                this.field5717 = (float) (this.field5733 & 255) / 255.0F;
                this.field5690 = (float) (65280 & this.field5733) / 65280.0F;
                this.method1885(106);
            }
            this.field5583.setSunColour(this.field5650, this.field5690, this.field5717, arg1, arg2);
            this.method1870(-108);
        }
        if (this.field5704[0] != arg3 || this.field5704[1] != arg4 || this.field5704[2] != arg5) {
            this.field5704[2] = arg5;
            this.field5704[0] = arg3;
            this.field5704[1] = arg4;
            this.field5665[1] = -arg4;
            this.field5665[2] = -arg5;
            this.field5665[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5635[1] = arg4 * var8;
            this.field5635[0] = arg3 * var8;
            this.field5635[2] = arg5 * var8;
            this.field5687[1] = -this.field5635[1];
            this.field5687[0] = -this.field5635[0];
            this.field5687[2] = -this.field5635[2];
            this.field5583.setSunDirection(this.field5635[0], this.field5635[1], this.field5635[2]);
            this.method1879(-5);
            this.field5642 = (int) (arg3 * 256.0F / arg4);
            this.field5689 = (int) (arg5 * 256.0F / arg4);
        }
        this.method1873(-20019);
    }

    @OriginalMember(owner = "client!hea", name = "t", descriptor = "(I)V")
    public abstract void method1884(int arg0);

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Leca;ILeca;)V")
    public final void method2339(class704 arg0, int arg1, class704 arg2) {
        ++field5486;
        boolean var4 = false;
        if (this.field5685[this.field5661] != arg0) {
            this.field5685[this.field5661] = arg0;
            var4 = true;
            this.method1862(true);
        }
        if (arg1 == -32540) {
            if (this.field5708[this.field5661] != arg2) {
                this.field5708[this.field5661] = arg2;
                var4 = true;
                this.method1892((byte) 114);
            }
            if (var4) {
                this.field5697 &= -30;
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "m", descriptor = "()V")
    public void method158() {
        ++field5527;
        if (!this.field5728) {
            for (class665 var1 = this.field5523.method472((byte) -29); var1 != null; var1 = this.field5523.method482(124)) {
                ((class22) var1).method275(-111);
            }
            Enumeration var2 = this.field5502.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method1914((byte) -126, var3, this.field5502.get(var3));
            }
            class618.method3427(false, true, -120);
            this.field5583.release();
            this.field5728 = true;
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "([[IZIB)Lgp;")
    public abstract class45 method1906(int[][] arg0, boolean arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!hea", name = "L", descriptor = "()V")
    public final void method121() {
        ++field5626;
        this.field5653 = false;
    }

    @OriginalMember(owner = "client!hea", name = "u", descriptor = "(I)V")
    public abstract void method1910(int arg0);

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method182(Canvas arg0) {
        ++field5553;
        Object var2 = null;
        if (arg0 != null && this.field5504 != arg0) {
            if (this.field5502.containsKey(arg0)) {
                var2 = this.field5502.get(arg0);
            }
        } else {
            var2 = this.field5472;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method1864(66, arg0, var2);
            if (this.field5461 == arg0) {
                this.method2355(92);
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(II[I[I)Lua;")
    public final class617 method164(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field5607;
        return class160.method1106(arg0, this, 29778, arg2, arg1, arg3);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIIF)Lrc;")
    public final class498 method181(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field5595;
        return new class91(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!hea", name = "va", descriptor = "(I)V")
    public final void method154(int arg0) {
        this.field5682 = 0;
        ++field5628;
        while (~arg0 < -2) {
            ++this.field5682;
            arg0 >>= 1;
        }
        this.field5655 = 1 << this.field5682;
    }

    @OriginalMember(owner = "client!hea", name = "YA", descriptor = "(IIII)V")
    public final void method195(int arg0, int arg1, int arg2, int arg3) {
        ++field5579;
        if (!this.field5653) {
            throw new RuntimeException("");
        } else {
            this.field5692 = arg0;
            this.field5715 = arg3;
            this.field5707 = arg2;
            this.field5666 = arg1;
            if (this.field5674) {
                this.field5675[3].method1685(14199);
                this.field5675[3].method1691(0);
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "T", descriptor = "()I")
    public final int method200() {
        ++field5450;
        return this.field5756;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIIII)V")
    public final void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5616;
    }

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method124(Canvas arg0) {
        ++field5624;
        if (this.field5504 == arg0) {
            throw new RuntimeException();
        } else if (!this.field5502.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method1889(arg0, 0);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field5502.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "j", descriptor = "(Z)V")
    public final void method2340(boolean arg0) {
        this.field5623 = arg0;
        ++field5561;
        this.method2375(69);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method1864(int arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!hea", name = "v", descriptor = "(I)V")
    public final void method2341(int arg0) {
        ++field5536;
        if (arg0 != -29576) {
            this.field5734 = -3;
        }
        if (~this.field5697 != -9) {
            this.method2362(arg0 + 29476);
            this.method2345(true, -16682);
            this.method2315(-32, true);
            this.method2369((byte) 71, true);
            this.method2326(true, 1);
            this.field5697 = 8;
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIII[BI)V")
    public static final void method2342(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        ++field5446;
        if (~arg2 < ~arg5) {
            int var6 = arg1 + arg5;
            int var7 = -arg5 + arg2 >> 2;
            int var8 = -54 % (-arg0 / 62);
            while (true) {
                --var7;
                if (var7 < 0) {
                    int var9 = 3 & arg2 - arg5;
                    while (true) {
                        --var9;
                        if (var9 < 0) {
                            return;
                        }
                        arg4[var6++] = 1;
                    }
                }
                arg4[var6++] = 1;
                arg4[var6++] = 1;
                arg4[var6++] = 1;
                arg4[var6++] = 1;
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "ZA", descriptor = "(Z)V")
    public final void method178(boolean arg0) {
        this.field5700 = arg0;
        ++field5469;
        this.method1910(0);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Llca;Lig;Z)Z")
    public abstract boolean method1867(class597 arg0, class218 arg1, boolean arg2);

    @OriginalMember(owner = "client!hea", name = "w", descriptor = "(I)V")
    private final void method2343(int arg0) {
        this.field5727 = (float) this.field5680;
        if (arg0 != 0) {
            this.method2375(-118);
        }
        ++field5497;
    }

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "(B)V")
    public abstract void method1915(byte arg0);

    @OriginalMember(owner = "client!hea", name = "u", descriptor = "()Z")
    public final boolean method162() {
        ++field5475;
        return false;
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(ZI)V")
    public abstract void method1902(boolean arg0, int arg1);

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(IZ)V")
    public final void method2344(int arg0, boolean arg1) {
        if (this.field5639 != arg1) {
            this.field5639 = arg1;
            this.method1877(false);
        }
        if (arg0 == -10551) {
            ++field5519;
        }
    }

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(ZI)V")
    public final void method2345(boolean arg0, int arg1) {
        ++field5487;
        if (!this.field5648 != !arg0) {
            this.field5648 = arg0;
            this.method1877(false);
            this.field5697 &= -32;
        }
        if (arg1 != -16682) {
            this.field5742 = null;
        }
    }

    @OriginalMember(owner = "client!hea", name = "AA", descriptor = "(III[I)V")
    public final void method197(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5545;
        float var5 = this.field5630.method260((float) arg2, (float) arg1, (byte) -119, (float) arg0);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field5684;
            var7 = this.field5686;
        } else {
            var6 = (int) ((float) this.field5638 * this.field5630.method254((float) arg1, true, (float) arg0, (float) arg2) / var5);
            var7 = (int) ((float) this.field5734 * this.field5630.method259((float) arg1, (float) arg2, (float) arg0, true) / var5);
        }
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var7 + -this.field5714);
        arg3[0] = (int) ((float) var6 + -this.field5640);
    }

    @OriginalMember(owner = "client!hea", name = "ra", descriptor = "(F)V")
    public final void method132(float arg0) {
        if (this.field5719 != arg0) {
            this.field5719 = arg0;
            this.field5583.setAmbient(arg0);
            this.method1885(-79);
            this.method1873(-20019);
        }
        ++field5444;
    }

    @OriginalMember(owner = "client!hea", name = "x", descriptor = "(I)V")
    private final void method2346(int arg0) {
        ++field5543;
        this.method1885(96);
        this.method1870(arg0 + -2862);
        this.method1919((byte) -87);
        this.method1875(false);
        this.method1879(-115);
        this.method1873(-20019);
        this.method1872(arg0 ^ arg0);
        this.method1908(6);
        this.method1910(0);
        this.method1877(false);
        this.method1860(false);
        this.method1903((byte) 77);
        this.method1897(19171);
        this.method1917((byte) -108);
        for (int var2 = this.field5709 - 1; ~var2 <= -1; --var2) {
            this.method2351(0, var2);
            this.method1862(true);
            this.method1892((byte) 107);
            this.method2358(-1);
        }
        this.method1861((byte) -94);
        this.method1884(arg0 + -2805);
        this.method1888((byte) 39);
        this.method1915((byte) 61);
        this.method1890((byte) -104);
    }

    @OriginalMember(owner = "client!hea", name = "y", descriptor = "(I)I")
    public final int method2347(int arg0) {
        ++field5531;
        if (arg0 != 1) {
            this.field5701 = true;
        }
        return this.field5692;
    }

    @OriginalMember(owner = "client!hea", name = "z", descriptor = "(I)V")
    private final void method2348(int arg0) {
        if (arg0 == 30832) {
            this.method1888((byte) 39);
            ++field5596;
            if (this.field5643 != null) {
                this.field5643.method1689(1);
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Ljba;)V")
    public final void method116(class363 arg0) {
        this.field5654 = (class415) arg0;
        ++field5513;
    }

    @OriginalMember(owner = "client!hea", name = "i", descriptor = "()Z")
    public final boolean method216() {
        ++field5490;
        return false;
    }

    @OriginalMember(owner = "client!hea", name = "A", descriptor = "(I)Lqo;")
    public final class21 method2349(int arg0) {
        if (arg0 != -8) {
            this.method2326(false, -99);
        }
        if (!this.field5664) {
            this.field5634.method255(this.field5632, this.field5625);
            this.field5664 = true;
        }
        ++field5598;
        return this.field5634;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5455;
    }

    @OriginalMember(owner = "client!hea", name = "JA", descriptor = "()V")
    public final void method152() {
        this.field5662 = 0;
        this.field5693 = 0;
        this.field5659 = this.field5600;
        ++field5613;
        this.field5722 = this.field5555;
        if (this.field5757) {
            this.field5757 = false;
            this.method1893((byte) -102);
        }
        this.method2387((byte) 82);
    }

    @OriginalMember(owner = "client!hea", name = "i", descriptor = "(B)Lqo;")
    public final class21 method2350(byte arg0) {
        ++field5601;
        if (arg0 < 92) {
            this.method1889((Canvas) null, 121);
        }
        return this.field5679[this.field5661];
    }

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "(II)V")
    public final void method2351(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field5703 = null;
        }
        ++field5569;
        if (this.field5661 != arg1) {
            this.field5661 = arg1;
            this.method1876((byte) -26);
        }
    }

    @OriginalMember(owner = "client!hea", name = "B", descriptor = "(I)V")
    private final void method2352(int arg0) {
        if (arg0 != 0) {
            this.field5698 = false;
        }
        ++field5574;
        this.field5698 = false;
        if (class54.field1057 == this.field5646) {
            this.method2322(arg0 + 4);
            this.method2348(30832);
        }
    }

    @OriginalMember(owner = "client!hea", name = "la", descriptor = "(IIII)V")
    public final void method184(int arg0, int arg1, int arg2, int arg3) {
        this.field5638 = arg2;
        this.field5686 = arg1;
        this.field5684 = arg0;
        this.field5734 = arg3;
        ++field5508;
        this.method2361(115);
        this.method2338((byte) -114);
        this.method2383(-32);
        this.method2387((byte) 82);
    }

    @OriginalMember(owner = "client!hea", name = "j", descriptor = "()Z")
    public final boolean method129() {
        ++field5564;
        return true;
    }

    @OriginalMember(owner = "client!hea", name = "w", descriptor = "()I")
    public final int method173() {
        ++field5528;
        return this.field5705 + -2;
    }

    @OriginalMember(owner = "client!hea", name = "j", descriptor = "(B)V")
    public void method1907(byte arg0) {
        ++field5618;
        if (arg0 != -65) {
            this.method138((class113) null, true);
        }
        this.method2346(2805);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZLkj;IIZ)V")
    public abstract void method1881(boolean arg0, class525 arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!hea", name = "k", descriptor = "(Z)V")
    public abstract void method1877(boolean arg0);

    @OriginalMember(owner = "client!hea", name = "C", descriptor = "(I)V")
    public abstract void method1873(int arg0);

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method1914(byte arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!hea", name = "l", descriptor = "(Z)V")
    public void method1875(boolean arg0) {
        ++field5608;
        if (arg0) {
            this.field5688 = -9;
        }
        this.field5711 = this.field5710;
        this.field5710 = 0;
    }

    @OriginalMember(owner = "client!hea", name = "O", descriptor = "(IIIIII)Z")
    public final boolean method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5562;
        float var7 = this.field5630.method260((float) arg2, (float) arg1, (byte) -78, (float) arg0);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field5630.method260((float) arg5, (float) arg4, (byte) -68, (float) arg3);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field5724) || !((float) this.field5724 > var8)) && (!(var7 > (float) this.field5680) || !(var8 > (float) this.field5680))) {
            int var9 = (int) ((float) this.field5638 * this.field5630.method254((float) arg1, true, (float) arg0, (float) arg2) / var7);
            int var10 = (int) ((float) this.field5638 * this.field5630.method254((float) arg4, true, (float) arg3, (float) arg5) / var8);
            if ((float) var9 < this.field5640 && (float) var10 < this.field5640 || this.field5645 < (float) var9 && (float) var10 > this.field5645) {
                return false;
            } else {
                int var11 = (int) ((float) this.field5734 * this.field5630.method259((float) arg1, (float) arg2, (float) arg0, true) / var7);
                int var12 = (int) ((float) this.field5734 * this.field5630.method259((float) arg4, (float) arg5, (float) arg3, true) / var8);
                return (!((float) var11 < this.field5714) || !((float) var12 < this.field5714)) && (!((float) var11 > this.field5683) || !(this.field5683 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hea", name = "k", descriptor = "(B)V")
    public abstract void method1903(byte arg0);

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lfg;Z)Lf;")
    public final class702 method138(class113 arg0, boolean arg1) {
        ++field5593;
        class702 var9;
        if (~arg0.field1706 != -1 && arg0.field1708 != 0) {
            int[] var3 = new int[arg0.field1708 * arg0.field1706];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field1701 != null) {
                for (int var6 = 0; var6 < arg0.field1708; ++var6) {
                    for (int var7 = 0; ~arg0.field1706 < ~var7; ++var7) {
                        var3[var5++] = class486.method2826(arg0.field1702[class689.method3797(255, arg0.field1709[var4])], arg0.field1701[var4] << 24);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; arg0.field1708 > var8; ++var8) {
                    for (int var10 = 0; var10 < arg0.field1706; ++var10) {
                        int var11 = arg0.field1702[255 & arg0.field1709[var4++]];
                        var3[var5++] = ~var11 != -1 ? class486.method2826(var11, -16777216) : 0;
                    }
                }
            }
            var9 = this.method209(var3, 0, arg0.field1706, arg0.field1706, arg0.field1708);
        } else {
            var9 = this.method209(new int[1], 0, 1, 1, 1);
        }
        var9.method935(arg0.field1704, arg0.field1707, arg0.field1705, arg0.field1703);
        return var9;
    }

    @OriginalMember(owner = "client!hea", name = "m", descriptor = "(Z)V")
    public abstract void method1862(boolean arg0);

    @OriginalMember(owner = "client!hea", name = "MA", descriptor = "(III[I)V")
    public final void method214(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5551;
        float var5 = this.field5630.method260((float) arg2, (float) arg1, (byte) -64, (float) arg0);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field5686;
            var7 = this.field5684;
        } else {
            var7 = (int) ((float) this.field5638 * this.field5630.method254((float) arg1, true, (float) arg0, (float) arg2) / var5);
            var6 = (int) ((float) this.field5734 * this.field5630.method259((float) arg1, (float) arg2, (float) arg0, true) / var5);
        }
        arg3[2] = (int) var5;
        arg3[0] = (int) ((float) var7 - this.field5640);
        arg3[1] = (int) ((float) var6 + -this.field5714);
    }

    @OriginalMember(owner = "client!hea", name = "l", descriptor = "(B)V")
    public abstract void method1892(byte arg0);

    @OriginalMember(owner = "client!hea", name = "m", descriptor = "(B)V")
    public abstract void method1888(byte arg0);

    @OriginalMember(owner = "client!hea", name = "f", descriptor = "(II)Lvca;")
    public class252 method1887(int arg0, int arg1) {
        ++field5465;
        if (arg0 != 0) {
            return null;
        } else if (~arg1 != -7) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    return arg1 == 7 ? new class107(this) : new class560(this);
                } else {
                    return new class471(this, this.field5451);
                }
            } else {
                return new class97(this);
            }
        } else {
            return new class647(this);
        }
    }

    @OriginalMember(owner = "client!hea", name = "n", descriptor = "(B)V")
    public abstract void method1917(byte arg0);

    @OriginalMember(owner = "client!hea", name = "D", descriptor = "(I)Lgp;")
    public final class45 method2353(int arg0) {
        ++field5459;
        if (arg0 != 1) {
            this.field5641 = true;
        }
        return this.field5654 == null ? null : this.field5654.method2488((byte) -97);
    }

    @OriginalMember(owner = "client!hea", name = "E", descriptor = "(I)Lqo;")
    public final class21 method2354(int arg0) {
        if (arg0 != 25603) {
            this.method2336(false);
        }
        ++field5522;
        return this.field5633;
    }

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "(IIIIII)V")
    public final void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5467;
        float var7 = this.method1904(0);
        this.method2332(-72);
        this.method2321(arg4, 24);
        this.method2324(0, class124.field1869, 1);
        this.method2360(0, class124.field1869, 1);
        this.method2326(true, arg5);
        this.field5625.method242(1.0F, (float) (arg3 + -1), (float) (arg2 + -1), (byte) -123);
        this.field5625.method265((float) arg1 + -var7, 0.0F, 72, (float) arg0 - var7);
        this.method2340(false);
        this.method1902(false, 8);
        this.method2359(class240.field3751, 4, -43);
        this.method1902(true, 8);
        this.method2360(0, class61.field1155, 1);
        this.method2324(0, class61.field1155, 1);
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(BZ)Lrn;")
    public abstract class241 method1863(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(IZ)Lbca;")
    public abstract class613 method1901(int arg0, boolean arg1);

    @OriginalMember(owner = "client!hea", name = "F", descriptor = "(I)V")
    private final void method2355(int arg0) {
        ++field5604;
        if (this.field5461 == null) {
            this.field5547 = this.field5617 = 1;
        } else {
            Dimension var2 = this.field5461.getSize();
            this.field5547 = var2.width;
            this.field5617 = var2.height;
        }
        if (arg0 >= 67) {
            this.field5600 = this.field5547;
            this.field5555 = this.field5617;
            this.method2352(0);
            this.method2338((byte) -50);
            this.method2361(63);
            this.method1884(0);
            this.method2387((byte) 82);
            this.method2383(-32);
            this.method152();
        }
    }

    @OriginalMember(owner = "client!hea", name = "o", descriptor = "(B)V")
    public abstract void method1919(byte arg0);

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILso;)V")
    public final void method2356(int arg0, class433 arg1) {
        if (arg0 == 0) {
            this.field5725[this.field5661] = arg1;
            ++field5506;
            this.method2312(12);
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIZ[IIII)Loi;")
    public abstract class65 method1869(int arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!hea", name = "G", descriptor = "(I)F")
    public abstract float method1904(int arg0);

    @OriginalMember(owner = "client!hea", name = "l", descriptor = "()Lq;")
    public final class391 method153() {
        ++field5525;
        return this.field5630;
    }

    @OriginalMember(owner = "client!hea", name = "n", descriptor = "(Z)V")
    public abstract void method1916(boolean arg0);

    @OriginalMember(owner = "client!hea", name = "GA", descriptor = "(II)V")
    public final void method142(int arg0, int arg1) {
        if (this.field5724 != arg0 || ~this.field5680 != ~arg1) {
            this.field5680 = arg1;
            this.field5724 = arg0;
            this.method2338((byte) -49);
            this.method2361(39);
            this.method2388((byte) -102);
        }
        ++field5443;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class702 method136(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5590;
        class302 var6 = new class302(this, arg2, arg3, arg4);
        var6.method942(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!hea", name = "H", descriptor = "(I)V")
    public final void method2357(int arg0) {
        ++field5501;
        Enumeration var2 = this.field5502.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method1914((byte) -126, var3, this.field5502.get(var3));
        }
        this.field5750.method7(-113);
        this.field5753.method7(-100);
        this.field5749.method490(arg0);
        this.field5739.method490(arg0);
        this.field5748.method490(0);
        this.field5751.method490(0);
        this.field5755.method490(0);
        this.field5652.method1283(arg0 + 27187);
        this.field5745.method7(-113);
    }

    @OriginalMember(owner = "client!hea", name = "I", descriptor = "(I)V")
    public final void method2358(int arg0) {
        if (this.field5725[this.field5661] != class84.field1384) {
            this.field5725[this.field5661] = class84.field1384;
            this.field5679[this.field5661].method271();
            this.method2312(12);
        }
        if (arg0 != -1) {
            this.method1872(86);
        }
        ++field5509;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lkda;II)V")
    private final void method2359(class353 arg0, int arg1, int arg2) {
        this.method1865(0, -26558, this.field5750);
        ++field5560;
        this.method1883(-79, this.field5742);
        if (arg2 >= -23) {
            this.field5704 = null;
        }
        this.method1880(14, arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!hea", name = "p", descriptor = "(B)V")
    public abstract void method1890(byte arg0);

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(ILkj;I)V")
    public final void method2360(int arg0, class525 arg1, int arg2) {
        if (arg2 != 1) {
            this.field5649 = 113;
        }
        this.method1898(arg1, arg0, 14319, false);
        ++field5570;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIZ)Lf;")
    public final class702 method175(int arg0, int arg1, boolean arg2) {
        ++field5584;
        return new class302(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!hea", name = "J", descriptor = "(I)V")
    private final void method2361(int arg0) {
        ++field5468;
        this.field5681 = false;
        this.method2365(-1);
        if (class173.field2464 == this.field5646) {
            this.method2348(30832);
        }
        if (arg0 < 38) {
            this.method116((class363) null);
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILig;Llca;IB)Loi;")
    public abstract class65 method1899(int arg0, class218 arg1, class597 arg2, int arg3, byte arg4);

    @OriginalMember(owner = "client!hea", name = "K", descriptor = "(I)V")
    private final void method2362(int arg0) {
        if (arg0 > -54) {
            this.field5731 = 0.1829466F;
        }
        if (class203.field2870 != this.field5646) {
            class652 var2 = this.field5646;
            this.field5646 = class203.field2870;
            if (!var2.method3603(0)) {
                this.method2372(false);
            }
            this.method2374((byte) 111);
            this.field5637 = this.field5673;
            this.method2348(30832);
            this.field5697 &= -8;
        }
        ++field5462;
    }

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "(IIIIII)V")
    public final void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5482;
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
        if (this.method2314((float) arg2 + var9, 0.0F, (float) arg1, 0.0F, (float) arg3 + var8, (float) arg0, (byte) -76)) {
            this.method2332(-113);
            this.method2321(arg4, 24);
            this.method2324(0, class124.field1869, 1);
            this.method2360(0, class124.field1869, 1);
            this.method2326(true, arg5);
            this.method2379(-12351);
            this.method1902(false, 8);
            this.method2364((byte) 7);
            this.method1902(true, 8);
            this.method2360(0, class61.field1155, 1);
            this.method2324(0, class61.field1155, 1);
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lig;ZLlca;)Z")
    public abstract boolean method1895(class218 arg0, boolean arg1, class597 arg2);

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIZ[II)Loi;")
    public final class65 method2363(int arg0, int arg1, boolean arg2, int[] arg3, int arg4) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field5491;
            return this.method1869(arg1 ^ 83, 0, arg2, arg3, arg0, arg4, 0);
        }
    }

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "(IIIII)V")
    public final void method118(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5517;
    }

    @OriginalMember(owner = "client!hea", name = "q", descriptor = "(B)V")
    private final void method2364(byte arg0) {
        ++field5533;
        this.method1865(0, -26558, this.field5753);
        this.method1883(-67, this.field5738);
        if (arg0 == 7) {
            this.method1880(14, class502.field7110, 0, 1);
        }
    }

    @OriginalMember(owner = "client!hea", name = "L", descriptor = "(I)V")
    private final void method2365(int arg0) {
        if (arg0 != -1) {
            this.method1866(-112, (class399[]) null);
        }
        ++field5478;
        if (!this.field5681) {
            float[] var2 = this.field5703;
            float var3 = (float) this.field5724;
            float var4 = (float) this.field5680;
            float var5 = (float) (-this.field5686) * this.field5660 / (float) this.field5734;
            float var6 = (float) (-this.field5684) * this.field5660 / (float) this.field5638;
            float var7 = (float) (this.field5600 - this.field5684) * this.field5660 / (float) this.field5638;
            float var8 = (float) (-this.field5686 + this.field5555) * this.field5660 / (float) this.field5734;
            if (var6 != var7 && var5 != var8) {
                var2[13] = (var5 + var8) / (var8 - var5);
                var2[14] = var3 / (-var4 + var3);
                var2[10] = 1.0F / (var3 - var4);
                var2[2] = 0.0F;
                var2[0] = 2.0F / (var7 - var6);
                var2[7] = 0.0F;
                var2[3] = 0.0F;
                var2[11] = 0.0F;
                var2[4] = 0.0F;
                var2[12] = (var6 + var7) / (-var7 + var6);
                var2[6] = 0.0F;
                var2[15] = 1.0F;
                var2[1] = 0.0F;
                var2[8] = 0.0F;
                var2[9] = 0.0F;
                var2[5] = 2.0F / (var8 - var5);
            } else {
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[12] = 0.0F;
                var2[11] = 0.0F;
                var2[8] = 0.0F;
                var2[5] = 1.0F;
                var2[10] = 1.0F;
                var2[14] = 0.0F;
                var2[0] = 1.0F;
                var2[13] = 0.0F;
                var2[3] = 0.0F;
                var2[9] = 0.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[15] = 1.0F;
                var2[2] = 0.0F;
            }
            this.method2343(0);
            this.field5681 = true;
        }
    }

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "(ZI)V")
    public final void method2366(boolean arg0, int arg1) {
        if (!arg0 == this.field5657) {
            this.field5657 = arg0;
            this.method1919((byte) -87);
        }
        ++field5526;
        if (arg1 != 16) {
            this.field5631 = null;
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(B[F)[F")
    public final float[] method2367(byte arg0, float[] arg1) {
        arg1[0] = this.field5637[0];
        arg1[4] = this.field5637[1];
        arg1[12] = this.field5637[3];
        if (arg0 != 1) {
            this.field5722 = 38;
        }
        arg1[8] = this.field5637[2];
        ++field5529;
        arg1[9] = this.field5637[6];
        arg1[2] = this.field5637[8];
        arg1[13] = this.field5637[7];
        arg1[1] = this.field5637[4];
        arg1[5] = this.field5637[5];
        arg1[14] = this.field5637[11];
        arg1[7] = this.field5637[13];
        arg1[10] = this.field5637[10];
        arg1[6] = this.field5637[9];
        arg1[3] = this.field5637[12];
        arg1[11] = this.field5637[14];
        arg1[15] = this.field5637[15];
        return arg1;
    }

    @OriginalMember(owner = "client!hea", name = "M", descriptor = "(I)V")
    public final void method2368(int arg0) {
        if (arg0 != 1) {
            this.field5695 = -45;
        }
        if (this.field5697 != 4) {
            this.method2373(false);
            this.method2345(false, -16682);
            this.method2318((byte) -24, false);
            this.method2315(arg0 + -33, false);
            this.method2369((byte) 71, false);
            this.method2389(false, false, -2, false);
            this.method2326(true, 1);
            this.method2308(arg0 ^ -2, 0);
            this.field5697 = 4;
        }
        ++field5460;
    }

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(BZ)V")
    public final void method2369(byte arg0, boolean arg1) {
        if (arg1 == !this.field5669) {
            this.field5669 = arg1;
            this.method1910(arg0 ^ 71);
            this.field5697 &= -32;
        }
        ++field5550;
        if (arg0 != 71) {
            this.method111((Canvas) null);
        }
    }

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "(II)Lrn;")
    public final class241 method2370(int arg0, int arg1) {
        if (arg1 != -12029) {
            this.field5664 = false;
        }
        ++field5567;
        if (this.field5745.method4((byte) 1) < arg0 * 2) {
            this.field5745.method1(-13, arg0);
        }
        return this.field5745;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IILbca;)V")
    public abstract void method1865(int arg0, int arg1, class613 arg2);

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lqo;Z)V")
    public final void method2371(class21 arg0, boolean arg1) {
        if (arg1) {
            ++field5572;
            this.field5625.method274(arg0);
            this.field5623 = false;
            this.method2375(56);
        }
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "()I")
    public final int method147() {
        ++field5493;
        return this.field5629 + this.field5627 + this.field5622;
    }

    @OriginalMember(owner = "client!hea", name = "o", descriptor = "(Z)V")
    private final void method2372(boolean arg0) {
        ++field5479;
        this.field5664 = arg0;
        if (this.field5643 != null) {
            this.field5643.method1681((byte) -19);
        }
        this.method1890((byte) -74);
    }

    @OriginalMember(owner = "client!hea", name = "p", descriptor = "(Z)V")
    private final void method2373(boolean arg0) {
        if (class54.field1057 != this.field5646) {
            class652 var2 = this.field5646;
            this.field5646 = class54.field1057;
            if (var2.method3603(0)) {
                this.method2372(false);
            }
            this.method2322(4);
            this.field5637 = this.field5678;
            this.method2348(30832);
            this.field5697 &= -25;
        }
        if (arg0) {
            this.field5649 = -37;
        }
        ++field5466;
    }

    @OriginalMember(owner = "client!hea", name = "r", descriptor = "(B)V")
    private final void method2374(byte arg0) {
        if (!this.field5641) {
            float[] var2 = this.field5673;
            float var3 = (float) (-this.field5684 * this.field5724) / (float) this.field5638;
            float var4 = (float) ((-this.field5684 + this.field5600) * this.field5724) / (float) this.field5638;
            float var5 = (float) (this.field5724 * this.field5686) / (float) this.field5734;
            float var6 = (float) ((this.field5686 - this.field5555) * this.field5724) / (float) this.field5734;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field5724 * 2.0F;
                var2[4] = 0.0F;
                var2[5] = var7 / (var5 - var6);
                var2[15] = 0.0F;
                var2[0] = var7 / (-var3 + var4);
                var2[3] = 0.0F;
                var2[7] = 0.0F;
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[13] = 0.0F;
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[11] = -1.0F;
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[14] = this.field5667 = (float) (this.field5724 * this.field5680) / (float) (-this.field5680 + this.field5724);
                var2[10] = this.field5731 = (float) this.field5680 / (float) (-this.field5680 + this.field5724);
                var2[12] = 0.0F;
                var2[6] = 0.0F;
            } else {
                var2[3] = 0.0F;
                var2[2] = 0.0F;
                var2[13] = 0.0F;
                var2[4] = 0.0F;
                var2[12] = 0.0F;
                var2[15] = 1.0F;
                var2[14] = 0.0F;
                var2[10] = 1.0F;
                var2[11] = 0.0F;
                var2[8] = 0.0F;
                var2[1] = 0.0F;
                var2[7] = 0.0F;
                var2[6] = 0.0F;
                var2[0] = 1.0F;
                var2[9] = 0.0F;
                var2[5] = 1.0F;
            }
            this.method2320(14);
            this.field5641 = true;
        }
        if (arg0 == 111) {
            ++field5541;
        }
    }

    @OriginalMember(owner = "client!hea", name = "N", descriptor = "(I)V")
    private final void method2375(int arg0) {
        if (arg0 <= 18) {
            this.method2384(-60);
        }
        if (class54.field1057 == this.field5646) {
            float var2 = this.method1904(0);
            this.field5625.method265(var2, 0.0F, 72, var2);
        }
        ++field5474;
        this.field5664 = false;
        this.method1915((byte) 61);
        if (this.field5643 != null) {
            this.field5643.method1684((byte) 65);
        }
    }

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(I)V")
    public final void method135(int arg0) {
        ++field5524;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZIIZBI)V")
    private final void method2376(boolean arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5) {
        boolean var7 = arg0 & this.method108();
        if (arg4 < -12) {
            ++field5496;
            if (!var7 && (~arg2 == -5 || arg2 == 8 || arg2 == 9)) {
                arg2 = 2;
                arg1 = arg2 != 4 ? 1 : arg5 & 1;
                arg5 = 0;
            }
            if (arg2 != 0 && arg3) {
                arg2 |= Integer.MIN_VALUE;
            }
            if (~this.field5723 != ~arg2) {
                if (~this.field5723 != -1) {
                    this.field5675[Integer.MAX_VALUE & this.field5723].method788(true);
                }
                if (~arg2 == -1) {
                    this.field5643 = null;
                } else {
                    this.field5643 = this.field5675[arg2 & Integer.MAX_VALUE];
                    this.field5643.method794(arg3, -1);
                    this.field5643.method791(arg3, 1);
                    this.field5643.method796(arg1, arg5, -127);
                }
                this.field5676 = arg1;
                this.field5723 = arg2;
                this.field5695 = arg5;
            } else if (this.field5723 != 0) {
                this.field5675[this.field5723 & Integer.MAX_VALUE].method791(arg3, 1);
                if (this.field5695 != arg5 || this.field5676 != arg1) {
                    this.field5675[this.field5723 & Integer.MAX_VALUE].method796(arg1, arg5, -119);
                    this.field5695 = arg5;
                    this.field5676 = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILqs;)V")
    public abstract void method1886(int arg0, class559 arg1);

    @OriginalMember(owner = "client!hea", name = "O", descriptor = "(I)I")
    public final int method2377(int arg0) {
        ++field5589;
        int var2 = 102 / ((arg0 - 36) / 53);
        return this.field5707;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Ljava/lang/Class;ZLjava/lang/String;)Z")
    public static final boolean method2378(Class arg0, boolean arg1, String arg2) {
        ++field5581;
        Class var3 = (Class) class9.field88.get(arg2);
        if (var3 != null) {
            return var3.getClassLoader() == arg0.getClassLoader();
        } else if (!arg1) {
            return false;
        } else {
            File var4 = null;
            if (var4 == null) {
                var4 = (File) class336.field4959.get(arg2);
            }
            if (var4 != null) {
                try {
                    var4 = new File(var4.getCanonicalPath());
                    Class var5 = Class.forName("java.lang.Runtime");
                    Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    Method var8 = var5.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                    var7.invoke(var8, Boolean.TRUE);
                    var8.invoke(Runtime.getRuntime(), arg0, var4.getPath());
                    var7.invoke(var8, Boolean.FALSE);
                    class9.field88.put(arg2, arg0);
                    return true;
                } catch (NoSuchMethodException var9) {
                    System.load(var4.getPath());
                    class9.field88.put(arg2, field5758 != null ? field5758 : (field5758 = method2390("hq")));
                    return true;
                } catch (Throwable var10) {
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hea", name = "oa", descriptor = "([I)V")
    public final void method204(int[] arg0) {
        arg0[2] = this.field5659;
        arg0[3] = this.field5722;
        arg0[0] = this.field5662;
        arg0[1] = this.field5693;
        ++field5559;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method111(Canvas arg0) {
        ++field5498;
        if (this.field5504 == arg0) {
            throw new RuntimeException();
        } else if (this.field5502.containsKey(arg0)) {
            this.method1914((byte) -126, arg0, this.field5502.get(arg0));
            this.field5502.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!hea", name = "P", descriptor = "(I)V")
    public final void method2379(int arg0) {
        this.field5625.method271();
        ++field5549;
        this.field5623 = true;
        this.method2375(arg0 + 12462);
        if (arg0 != -12351) {
            this.field5676 = 76;
        }
    }

    @OriginalMember(owner = "client!hea", name = "s", descriptor = "(B)V")
    public abstract void method1876(byte arg0);

    @OriginalMember(owner = "client!hea", name = "t", descriptor = "(B)V")
    public abstract void method1861(byte arg0);

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Le;)V")
    public final void method196(class492 arg0) {
        this.field5603 = ((class22) arg0).field295;
        ++field5602;
        this.field5516 = this.field5603.method3468(32768, false);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I[BIIILlca;)Ljb;")
    public abstract class456 method1894(int arg0, byte[] arg1, int arg2, int arg3, int arg4, class597 arg5);

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "(BZ)V")
    public final void method2380(byte arg0, boolean arg1) {
        this.method2321(arg0 << 24 | arg0 << 16 | arg0 << 8 | arg0, 24);
        ++field5597;
        if (arg1) {
            this.field5504 = null;
        }
    }

    @OriginalMember(owner = "client!hea", name = "Q", descriptor = "(I)V")
    public abstract void method1897(int arg0);

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lkj;IIZ)V")
    public abstract void method1898(class525 arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILjaclib/memory/Buffer;)Ljaclib/memory/Stream;")
    public final Stream method2381(int arg0, Buffer arg1) {
        this.field5647.method3477(arg1);
        if (arg0 != 0) {
            this.method2374((byte) 94);
        }
        ++field5611;
        return this.field5647;
    }

    @OriginalMember(owner = "client!hea", name = "J", descriptor = "(IIIIII)V")
    public final void method114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2332(-125);
        ++field5452;
        this.method2321(arg4, 24);
        this.method2324(0, class124.field1869, 1);
        this.method2360(0, class124.field1869, 1);
        this.method2326(true, arg5);
        this.field5625.method242(1.0F, (float) arg3, (float) arg2, (byte) -53);
        this.field5625.method270(arg0, arg1, 0);
        this.method2340(false);
        this.method1902(false, 8);
        this.method2311((byte) -127);
        this.method1902(true, 8);
        this.method2360(0, class61.field1155, 1);
        this.method2324(0, class61.field1155, 1);
    }

    @OriginalMember(owner = "client!hea", name = "R", descriptor = "(I)Lqo;")
    public final class21 method2382(int arg0) {
        if (arg0 != 1) {
            this.method153();
        }
        ++field5530;
        return this.field5632;
    }

    @OriginalMember(owner = "client!hea", name = "S", descriptor = "(I)V")
    public abstract void method1872(int arg0);

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "(I)V")
    public final void method163(int arg0) {
        ++field5558;
    }

    @OriginalMember(owner = "client!hea", name = "T", descriptor = "(I)V")
    public final void method2383(int arg0) {
        if (class264.field4004 != this.field5646) {
            class652 var2 = this.field5646;
            this.field5646 = class264.field4004;
            if (var2.method3603(0)) {
                this.method2372(false);
            }
            this.field5697 &= -32;
            this.field5637 = this.field5691;
        }
        ++field5500;
        if (arg0 != -32) {
            this.field5685 = null;
        }
    }

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(Z)V")
    public final void method125(boolean arg0) {
        ++field5609;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Llm;IIII)Lda;")
    public final class55 method171(class461 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5599;
        return new class48(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method143(Canvas arg0) {
        this.field5472 = null;
        ++field5454;
        this.field5461 = null;
        if (arg0 != null && this.field5504 != arg0) {
            if (this.field5502.containsKey(arg0)) {
                this.field5472 = this.field5502.get(arg0);
                this.field5461 = arg0;
            }
        } else {
            this.field5461 = this.field5504;
            this.field5472 = this.field5518;
        }
        if (this.field5461 != null && this.field5472 != null) {
            this.method1868(this.field5461, -25201, this.field5472);
            this.method2355(122);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public final class37 method215(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5535;
        return new class481(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lvi;I)V")
    public final void method165(class499 arg0, int arg1) {
        ++field5576;
        this.field5652.method1280(arg1, (byte) -107, arg0, this);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIIIILua;II)V")
    public final void method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class617 arg6, int arg7, int arg8) {
        ++field5495;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "([I)V")
    public final void method208(int[] arg0) {
        arg0[0] = this.field5600;
        arg0[1] = this.field5555;
        ++field5470;
    }

    @OriginalMember(owner = "client!hea", name = "U", descriptor = "(I)V")
    private final void method2384(int arg0) {
        if (arg0 != 262144) {
            this.field5646 = null;
        }
        ++field5449;
        if (class173.field2464 != this.field5646) {
            class652 var2 = this.field5646;
            this.field5646 = class173.field2464;
            if (!var2.method3603(0)) {
                this.method2372(false);
            }
            this.method2365(-1);
            this.field5637 = this.field5703;
            this.method2348(30832);
            this.field5697 &= -8;
        }
    }

    @OriginalMember(owner = "client!hea", name = "V", descriptor = "(I)V")
    private final void method2385(int arg0) {
        this.field5750 = this.method1901(-21710, false);
        ++field5540;
        this.field5750.method993(140, -6696, 28);
        for (int var2 = 0; var2 < 4; ++var2) {
            Buffer var3 = this.field5750.method995(true, 1614);
            if (var3 != null) {
                Stream var4 = this.method2381(0, var3);
                if (!Stream.method3483()) {
                    var4.method3476(0.0F);
                    var4.method3476(0.0F);
                    var4.method3476(0.0F);
                    var4.method3476(0.0F);
                    var4.method3476(0.0F);
                    var4.method3476(0.0F);
                    var4.method3476(0.0F);
                    var4.method3476(0.0F);
                    var4.method3476(1.0F);
                    var4.method3476(0.0F);
                    var4.method3476(0.0F);
                    var4.method3476(1.0F);
                    var4.method3476(0.0F);
                    var4.method3476(1.0F);
                    var4.method3476(1.0F);
                    var4.method3476(1.0F);
                    var4.method3476(0.0F);
                    var4.method3476(1.0F);
                    var4.method3476(1.0F);
                    var4.method3476(1.0F);
                    var4.method3476(1.0F);
                    var4.method3476(1.0F);
                    var4.method3476(0.0F);
                    var4.method3476(0.0F);
                    var4.method3476(1.0F);
                    var4.method3476(0.0F);
                    var4.method3476(1.0F);
                    var4.method3476(0.0F);
                    var4.method3476(0.0F);
                    var4.method3476(0.0F);
                    var4.method3476(0.0F);
                    var4.method3476(0.0F);
                    var4.method3476(0.0F);
                    var4.method3476(0.0F);
                    var4.method3476(0.0F);
                } else {
                    var4.method3474(0.0F);
                    var4.method3474(0.0F);
                    var4.method3474(0.0F);
                    var4.method3474(0.0F);
                    var4.method3474(0.0F);
                    var4.method3474(0.0F);
                    var4.method3474(0.0F);
                    var4.method3474(0.0F);
                    var4.method3474(1.0F);
                    var4.method3474(0.0F);
                    var4.method3474(0.0F);
                    var4.method3474(1.0F);
                    var4.method3474(0.0F);
                    var4.method3474(1.0F);
                    var4.method3474(1.0F);
                    var4.method3474(1.0F);
                    var4.method3474(0.0F);
                    var4.method3474(1.0F);
                    var4.method3474(1.0F);
                    var4.method3474(1.0F);
                    var4.method3474(1.0F);
                    var4.method3474(1.0F);
                    var4.method3474(0.0F);
                    var4.method3474(0.0F);
                    var4.method3474(1.0F);
                    var4.method3474(0.0F);
                    var4.method3474(1.0F);
                    var4.method3474(0.0F);
                    var4.method3474(0.0F);
                    var4.method3474(0.0F);
                    var4.method3474(0.0F);
                    var4.method3474(0.0F);
                    var4.method3474(0.0F);
                    var4.method3474(0.0F);
                    var4.method3474(0.0F);
                }
                var4.method3471();
                if (this.field5750.method992((byte) -53)) {
                    break;
                }
            }
        }
        this.field5742 = this.method1866(-73, new class399[] { new class399(new class342[] { class342.field5015, class342.field5019, class342.field5019 }) });
        if (arg0 != 6697) {
            this.field5637 = null;
        }
    }

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "(II)V")
    public abstract void method1918(int arg0, int arg1);

    @OriginalMember(owner = "client!hea", name = "u", descriptor = "(B)V")
    public final void method2386(byte arg0) {
        if (arg0 == 86) {
            if (~this.field5697 != -3) {
                this.method2373(false);
                this.method2345(false, -16682);
                this.method2318((byte) -24, false);
                this.method2315(-32, false);
                this.method2369((byte) 71, false);
                this.method2389(false, false, -2, false);
                this.field5697 = 2;
            }
            ++field5464;
        }
    }

    @OriginalMember(owner = "client!hea", name = "v", descriptor = "(B)V")
    private final void method2387(byte arg0) {
        this.field5714 = (float) (-this.field5686 + this.field5693);
        this.field5645 = (float) (-this.field5684 + this.field5659);
        ++field5485;
        if (arg0 != 82) {
            this.method173();
        }
        this.field5683 = (float) (-this.field5686 + this.field5722);
        this.field5640 = (float) (-this.field5684 + this.field5662);
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I[Laf;)Lrd;")
    public abstract class305 method1866(int arg0, class399[] arg1);

    @OriginalMember(owner = "client!hea", name = "m", descriptor = "(IIIII)V")
    public final void method103(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method149(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
        ++field5585;
    }

    @OriginalMember(owner = "client!hea", name = "pa", descriptor = "(III)V")
    public final void method122(int arg0, int arg1, int arg2) {
        if (this.field5718 != arg0 || ~this.field5651 != ~arg1 || this.field5670 != arg2) {
            this.field5670 = arg2;
            this.field5651 = arg1;
            this.field5718 = arg0;
            this.method2388((byte) -125);
            this.method1877(false);
        }
        ++field5456;
    }

    @OriginalMember(owner = "client!hea", name = "XA", descriptor = "(IIIII)V")
    public final void method202(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5532;
        this.method149(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!hea", name = "w", descriptor = "(B)V")
    private final void method2388(byte arg0) {
        if (arg0 < -95) {
            if (this.field5643 != null) {
                this.field5643.method1691(0);
            }
            ++field5494;
            this.method1860(false);
        }
    }

    @OriginalMember(owner = "client!hea", name = "v", descriptor = "()[I")
    public final int[] method145() {
        ++field5539;
        return new int[] { this.field5684, this.field5686, this.field5638, this.field5734 };
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZZIZ)V")
    public final void method2389(boolean arg0, boolean arg1, int arg2, boolean arg3) {
        if (~this.field5702 != ~arg2 || this.field5674 != this.field5653) {
            class65 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field5653 ? 0 : 3;
            if (~arg2 > -1) {
                this.method2358(-1);
            } else {
                var5 = this.field5656.method3560((byte) 67, arg2);
                class159 var10 = super.field2384.method1386(arg2, -6514);
                if (~var10.field2298 == -1 && ~var10.field2293 == -1) {
                    this.method2358(-1);
                } else {
                    int var11 = !var10.field2304 ? 128 : 64;
                    int var12 = var11 * 50;
                    class21 var13 = this.method2327(true);
                    var13.method273(0.0F, (float) (this.field5688 % var12 * var10.field2298) / (float) var12, (byte) 120, (float) (this.field5688 % var12 * var10.field2293) / (float) var12);
                    this.method2356(0, class266.field4017);
                }
                if (!this.field5653) {
                    var9 = var10.field2300;
                    var8 = var10.field2294;
                    var7 = var10.field2291;
                }
                var6 = var10.field2284;
            }
            this.method2376(arg1, var8, var9, arg0, (byte) -23, var7);
            if (this.field5643 != null) {
                this.field5643.method790(var5, var6, -1);
            } else {
                this.method2337(false, var5);
                this.method2308(-1, var6);
            }
            this.field5702 = arg2;
            this.field5674 = this.field5653;
        }
        ++field5448;
        if (arg3) {
            this.method2331((byte) -88);
        }
        this.field5697 &= -8;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2390(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
