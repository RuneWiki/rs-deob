import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public abstract class class428 extends class206 {

    @OriginalMember(owner = "client!bda", name = "J", descriptor = "Lui;")
    private class193 field5522 = new class193();

    @OriginalMember(owner = "client!bda", name = "Vd", descriptor = "Z")
    public boolean field5690 = true;

    @OriginalMember(owner = "client!bda", name = "Sd", descriptor = "Lsg;")
    public class335 field5687 = new class335();

    @OriginalMember(owner = "client!bda", name = "Xd", descriptor = "Lsg;")
    public class335 field5692 = new class335();

    @OriginalMember(owner = "client!bda", name = "Yd", descriptor = "Lsg;")
    public class335 field5693 = new class335();

    @OriginalMember(owner = "client!bda", name = "Zd", descriptor = "Lsg;")
    public class335 field5694 = new class335();

    @OriginalMember(owner = "client!bda", name = "ae", descriptor = "Lsg;")
    private class335 field5695 = new class335();

    @OriginalMember(owner = "client!bda", name = "be", descriptor = "Lsg;")
    private class335 field5696 = new class335();

    @OriginalMember(owner = "client!bda", name = "me", descriptor = "I")
    public int field5707 = 0;

    @OriginalMember(owner = "client!bda", name = "re", descriptor = "I")
    private int field5712 = 0;

    @OriginalMember(owner = "client!bda", name = "we", descriptor = "I")
    public int field5717 = 0;

    @OriginalMember(owner = "client!bda", name = "ne", descriptor = "I")
    public int field5708 = -1;

    @OriginalMember(owner = "client!bda", name = "se", descriptor = "I")
    public int field5713 = 8;

    @OriginalMember(owner = "client!bda", name = "ge", descriptor = "I")
    public int field5701 = 3584;

    @OriginalMember(owner = "client!bda", name = "ce", descriptor = "I")
    public int field5697 = -1;

    @OriginalMember(owner = "client!bda", name = "Fe", descriptor = "Z")
    private boolean field5726 = false;

    @OriginalMember(owner = "client!bda", name = "Re", descriptor = "I")
    private int field5738 = 16777215;

    @OriginalMember(owner = "client!bda", name = "De", descriptor = "I")
    public int field5724 = 512;

    @OriginalMember(owner = "client!bda", name = "ie", descriptor = "I")
    private int field5703 = 0;

    @OriginalMember(owner = "client!bda", name = "le", descriptor = "Z")
    public boolean field5706 = false;

    @OriginalMember(owner = "client!bda", name = "Ce", descriptor = "Z")
    public boolean field5723 = true;

    @OriginalMember(owner = "client!bda", name = "ef", descriptor = "I")
    public int field5751 = -1;

    @OriginalMember(owner = "client!bda", name = "Ee", descriptor = "I")
    public int field5725 = 0;

    @OriginalMember(owner = "client!bda", name = "ff", descriptor = "[F")
    private float[] field5752 = new float[16];

    @OriginalMember(owner = "client!bda", name = "He", descriptor = "Lih;")
    public class597 field5728 = class191.field2301;

    @OriginalMember(owner = "client!bda", name = "Ye", descriptor = "[F")
    public float[] field5745 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!bda", name = "jf", descriptor = "I")
    private int field5755 = -1;

    @OriginalMember(owner = "client!bda", name = "ve", descriptor = "Z")
    private boolean field5716 = false;

    @OriginalMember(owner = "client!bda", name = "Ie", descriptor = "F")
    public float field5729 = 1.0F;

    @OriginalMember(owner = "client!bda", name = "Oe", descriptor = "I")
    public int field5735 = 0;

    @OriginalMember(owner = "client!bda", name = "ee", descriptor = "I")
    public int field5699 = 3;

    @OriginalMember(owner = "client!bda", name = "ze", descriptor = "Z")
    public boolean field5720 = false;

    @OriginalMember(owner = "client!bda", name = "tf", descriptor = "I")
    private int field5765 = 0;

    @OriginalMember(owner = "client!bda", name = "af", descriptor = "F")
    public float field5747 = 1.0F;

    @OriginalMember(owner = "client!bda", name = "Df", descriptor = "F")
    private float field5775 = 1.0F;

    @OriginalMember(owner = "client!bda", name = "Le", descriptor = "I")
    private int field5732 = -1;

    @OriginalMember(owner = "client!bda", name = "kf", descriptor = "[F")
    private float[] field5756 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!bda", name = "vf", descriptor = "[F")
    private float[] field5767 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!bda", name = "cf", descriptor = "Z")
    private boolean field5749 = false;

    @OriginalMember(owner = "client!bda", name = "Je", descriptor = "Z")
    public boolean field5730 = true;

    @OriginalMember(owner = "client!bda", name = "Ze", descriptor = "F")
    public float field5746 = -1.0F;

    @OriginalMember(owner = "client!bda", name = "qf", descriptor = "I")
    public int field5762 = 0;

    @OriginalMember(owner = "client!bda", name = "Cf", descriptor = "F")
    public float field5774 = 1.0F;

    @OriginalMember(owner = "client!bda", name = "ye", descriptor = "F")
    public float field5719 = 3584.0F;

    @OriginalMember(owner = "client!bda", name = "Af", descriptor = "I")
    public int field5772 = 128;

    @OriginalMember(owner = "client!bda", name = "Mf", descriptor = "F")
    private float field5784 = 3000.0F;

    @OriginalMember(owner = "client!bda", name = "df", descriptor = "I")
    public int field5750 = 0;

    @OriginalMember(owner = "client!bda", name = "pf", descriptor = "I")
    public int field5761 = 0;

    @OriginalMember(owner = "client!bda", name = "Ae", descriptor = "Z")
    public boolean field5721 = true;

    @OriginalMember(owner = "client!bda", name = "xe", descriptor = "Z")
    public boolean field5718 = true;

    @OriginalMember(owner = "client!bda", name = "Nf", descriptor = "Z")
    private boolean field5785 = false;

    @OriginalMember(owner = "client!bda", name = "lf", descriptor = "I")
    public int field5757 = 0;

    @OriginalMember(owner = "client!bda", name = "oe", descriptor = "Lug;")
    public class480 field5709 = class328.field4273;

    @OriginalMember(owner = "client!bda", name = "If", descriptor = "[F")
    private float[] field5780 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!bda", name = "Ff", descriptor = "[F")
    private float[] field5777 = new float[16];

    @OriginalMember(owner = "client!bda", name = "Jf", descriptor = "I")
    public int field5781 = 0;

    @OriginalMember(owner = "client!bda", name = "xf", descriptor = "[F")
    public float[] field5769 = this.field5767;

    @OriginalMember(owner = "client!bda", name = "Kf", descriptor = "I")
    public int field5782 = 50;

    @OriginalMember(owner = "client!bda", name = "Of", descriptor = "[F")
    public float[] field5786 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!bda", name = "rf", descriptor = "Z")
    public boolean field5763 = false;

    @OriginalMember(owner = "client!bda", name = "Tf", descriptor = "Z")
    public boolean field5791 = false;

    @OriginalMember(owner = "client!bda", name = "gf", descriptor = "[F")
    private float[] field5753 = new float[16];

    @OriginalMember(owner = "client!bda", name = "Qf", descriptor = "Z")
    public boolean field5788 = true;

    @OriginalMember(owner = "client!bda", name = "Sf", descriptor = "F")
    public float field5790 = 1.0F;

    @OriginalMember(owner = "client!bda", name = "he", descriptor = "F")
    public float field5702 = -1.0F;

    @OriginalMember(owner = "client!bda", name = "Uf", descriptor = "F")
    public float field5792 = 3584.0F;

    @OriginalMember(owner = "client!bda", name = "Lf", descriptor = "Z")
    private boolean field5783 = false;

    @OriginalMember(owner = "client!bda", name = "Yf", descriptor = "I")
    public int field5796 = 0;

    @OriginalMember(owner = "client!bda", name = "Ef", descriptor = "[Llj;")
    private class521[] field5776 = new class521[10];

    @OriginalMember(owner = "client!bda", name = "qe", descriptor = "I")
    private int field5711 = 1;

    @OriginalMember(owner = "client!bda", name = "Xf", descriptor = "I")
    public int field5795 = 512;

    @OriginalMember(owner = "client!bda", name = "ag", descriptor = "I")
    private int field5798 = 0;

    @OriginalMember(owner = "client!bda", name = "Bf", descriptor = "Ljaclib/memory/Stream;")
    private Stream field5773 = new Stream();

    @OriginalMember(owner = "client!bda", name = "ng", descriptor = "Lsg;")
    private class335 field5811 = new class335();

    @OriginalMember(owner = "client!bda", name = "vc", descriptor = "Ljava/awt/Canvas;")
    public Canvas field5612;

    @OriginalMember(owner = "client!bda", name = "eb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5543;

    @OriginalMember(owner = "client!bda", name = "Be", descriptor = "I")
    public int field5722;

    @OriginalMember(owner = "client!bda", name = "W", descriptor = "Ljava/lang/Object;")
    public Object field5535;

    @OriginalMember(owner = "client!bda", name = "I", descriptor = "Ljava/lang/Object;")
    private Object field5521;

    @OriginalMember(owner = "client!bda", name = "Vb", descriptor = "Ldn;")
    public class438 field5586;

    @OriginalMember(owner = "client!bda", name = "Pc", descriptor = "I")
    private int field5632;

    @OriginalMember(owner = "client!bda", name = "z", descriptor = "I")
    public int field5512;

    @OriginalMember(owner = "client!bda", name = "uf", descriptor = "I")
    public int field5766;

    @OriginalMember(owner = "client!bda", name = "x", descriptor = "I")
    private int field5510;

    @OriginalMember(owner = "client!bda", name = "zb", descriptor = "I")
    public int field5564;

    @OriginalMember(owner = "client!bda", name = "nf", descriptor = "Lfaa;")
    private class134 field5759;

    @OriginalMember(owner = "client!bda", name = "t", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field5506;

    @OriginalMember(owner = "client!bda", name = "T", descriptor = "I")
    public static int field5532 = 2;

    @OriginalMember(owner = "client!bda", name = "yb", descriptor = "Lrg;")
    public static class548 field5563 = new class548(66, 3);

    @OriginalMember(owner = "client!bda", name = "de", descriptor = "F")
    public float field5698;

    @OriginalMember(owner = "client!bda", name = "fe", descriptor = "F")
    private float field5700;

    @OriginalMember(owner = "client!bda", name = "je", descriptor = "F")
    public float field5704;

    @OriginalMember(owner = "client!bda", name = "pe", descriptor = "F")
    public float field5710;

    @OriginalMember(owner = "client!bda", name = "te", descriptor = "F")
    public float field5714;

    @OriginalMember(owner = "client!bda", name = "ue", descriptor = "F")
    private float field5715;

    @OriginalMember(owner = "client!bda", name = "We", descriptor = "F")
    private float field5743;

    @OriginalMember(owner = "client!bda", name = "bf", descriptor = "F")
    public float field5748;

    @OriginalMember(owner = "client!bda", name = "Zf", descriptor = "F")
    public float field5797;

    @OriginalMember(owner = "client!bda", name = "q", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!bda", name = "r", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!bda", name = "s", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!bda", name = "u", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!bda", name = "v", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!bda", name = "w", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!bda", name = "y", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!bda", name = "A", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!bda", name = "B", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!bda", name = "C", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!bda", name = "D", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!bda", name = "E", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!bda", name = "F", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!bda", name = "G", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!bda", name = "H", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!bda", name = "K", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!bda", name = "L", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!bda", name = "M", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!bda", name = "N", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!bda", name = "O", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!bda", name = "P", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!bda", name = "Q", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!bda", name = "R", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!bda", name = "S", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!bda", name = "U", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!bda", name = "V", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!bda", name = "X", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!bda", name = "Y", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!bda", name = "Z", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!bda", name = "ab", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!bda", name = "bb", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!bda", name = "cb", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!bda", name = "db", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!bda", name = "fb", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!bda", name = "gb", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!bda", name = "hb", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!bda", name = "ib", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!bda", name = "jb", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!bda", name = "kb", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!bda", name = "lb", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!bda", name = "mb", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!bda", name = "nb", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!bda", name = "ob", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!bda", name = "pb", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!bda", name = "qb", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!bda", name = "rb", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!bda", name = "sb", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!bda", name = "ub", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!bda", name = "vb", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!bda", name = "wb", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!bda", name = "Ab", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!bda", name = "Cb", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!bda", name = "Db", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!bda", name = "Eb", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!bda", name = "Fb", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!bda", name = "Gb", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!bda", name = "Hb", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!bda", name = "Ib", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!bda", name = "Jb", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!bda", name = "Kb", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!bda", name = "Lb", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!bda", name = "Mb", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!bda", name = "Nb", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!bda", name = "Ob", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!bda", name = "Pb", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!bda", name = "Qb", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!bda", name = "Rb", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!bda", name = "Sb", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!bda", name = "Tb", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!bda", name = "Ub", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!bda", name = "Wb", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!bda", name = "Xb", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!bda", name = "Yb", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!bda", name = "Zb", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!bda", name = "ac", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!bda", name = "bc", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!bda", name = "cc", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!bda", name = "dc", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!bda", name = "ec", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!bda", name = "fc", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!bda", name = "gc", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!bda", name = "hc", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!bda", name = "ic", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!bda", name = "jc", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!bda", name = "kc", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!bda", name = "lc", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!bda", name = "mc", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!bda", name = "nc", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!bda", name = "oc", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!bda", name = "pc", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!bda", name = "qc", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!bda", name = "rc", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!bda", name = "sc", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!bda", name = "tc", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!bda", name = "uc", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!bda", name = "wc", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!bda", name = "xc", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!bda", name = "yc", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!bda", name = "zc", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!bda", name = "Ac", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!bda", name = "Bc", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!bda", name = "Cc", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!bda", name = "Dc", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!bda", name = "Ec", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!bda", name = "Fc", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!bda", name = "Gc", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!bda", name = "Hc", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!bda", name = "Ic", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!bda", name = "Jc", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!bda", name = "Kc", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!bda", name = "Lc", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!bda", name = "Mc", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!bda", name = "Nc", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!bda", name = "Oc", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!bda", name = "Qc", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!bda", name = "Rc", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!bda", name = "Sc", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!bda", name = "Tc", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!bda", name = "Uc", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!bda", name = "Vc", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!bda", name = "Wc", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!bda", name = "Xc", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!bda", name = "Yc", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!bda", name = "Zc", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!bda", name = "ad", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!bda", name = "bd", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!bda", name = "cd", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!bda", name = "dd", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!bda", name = "ed", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!bda", name = "fd", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!bda", name = "gd", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!bda", name = "hd", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!bda", name = "id", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!bda", name = "jd", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!bda", name = "kd", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!bda", name = "ld", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!bda", name = "md", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!bda", name = "nd", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!bda", name = "od", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!bda", name = "pd", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!bda", name = "qd", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!bda", name = "rd", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!bda", name = "sd", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!bda", name = "td", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!bda", name = "ud", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!bda", name = "vd", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!bda", name = "wd", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!bda", name = "xd", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!bda", name = "yd", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!bda", name = "zd", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!bda", name = "Ad", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!bda", name = "Bd", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!bda", name = "Cd", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!bda", name = "Dd", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!bda", name = "Ed", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!bda", name = "Fd", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!bda", name = "Gd", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!bda", name = "Hd", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!bda", name = "Jd", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!bda", name = "Kd", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!bda", name = "Ld", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!bda", name = "Md", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!bda", name = "Nd", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!bda", name = "Od", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!bda", name = "Pd", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!bda", name = "Qd", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!bda", name = "Rd", descriptor = "I")
    public int field5686;

    @OriginalMember(owner = "client!bda", name = "Td", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!bda", name = "Ud", descriptor = "I")
    public int field5689;

    @OriginalMember(owner = "client!bda", name = "Wd", descriptor = "I")
    public int field5691;

    @OriginalMember(owner = "client!bda", name = "Ge", descriptor = "I")
    public int field5727;

    @OriginalMember(owner = "client!bda", name = "Ke", descriptor = "I")
    private int field5731;

    @OriginalMember(owner = "client!bda", name = "Me", descriptor = "I")
    public int field5733;

    @OriginalMember(owner = "client!bda", name = "Ne", descriptor = "I")
    public int field5734;

    @OriginalMember(owner = "client!bda", name = "Ue", descriptor = "I")
    public int field5741;

    @OriginalMember(owner = "client!bda", name = "of", descriptor = "I")
    public int field5760;

    @OriginalMember(owner = "client!bda", name = "wf", descriptor = "I")
    public int field5768;

    @OriginalMember(owner = "client!bda", name = "Gf", descriptor = "I")
    public int field5778;

    @OriginalMember(owner = "client!bda", name = "Hf", descriptor = "I")
    public int field5779;

    @OriginalMember(owner = "client!bda", name = "Vf", descriptor = "I")
    private int field5793;

    @OriginalMember(owner = "client!bda", name = "vg", descriptor = "I")
    private int field5819;

    @OriginalMember(owner = "client!bda", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!bda", name = "eg", descriptor = "Lvr;")
    public class116 field5802;

    @OriginalMember(owner = "client!bda", name = "hg", descriptor = "Lvr;")
    public class116 field5805;

    @OriginalMember(owner = "client!bda", name = "ig", descriptor = "Lvr;")
    private class116 field5806;

    @OriginalMember(owner = "client!bda", name = "og", descriptor = "Lvr;")
    private class116 field5812;

    @OriginalMember(owner = "client!bda", name = "rg", descriptor = "Lvr;")
    public class116 field5815;

    @OriginalMember(owner = "client!bda", name = "ug", descriptor = "Lvr;")
    public class116 field5818;

    @OriginalMember(owner = "client!bda", name = "kg", descriptor = "Lrq;")
    private class293 field5808;

    @OriginalMember(owner = "client!bda", name = "qg", descriptor = "Lrq;")
    private class293 field5814;

    @OriginalMember(owner = "client!bda", name = "fg", descriptor = "Liaa;")
    private class419 field5803;

    @OriginalMember(owner = "client!bda", name = "Wf", descriptor = "Lhv;")
    public class440 field5794;

    @OriginalMember(owner = "client!bda", name = "xb", descriptor = "Llba;")
    public class468 field5562;

    @OriginalMember(owner = "client!bda", name = "Qe", descriptor = "Llj;")
    private class521 field5737;

    @OriginalMember(owner = "client!bda", name = "Pe", descriptor = "Lfl;")
    private class628 field5736;

    @OriginalMember(owner = "client!bda", name = "Xe", descriptor = "Lkr;")
    private class634 field5744;

    @OriginalMember(owner = "client!bda", name = "bg", descriptor = "Lrw;")
    public class643 field5799;

    @OriginalMember(owner = "client!bda", name = "cg", descriptor = "Lrw;")
    public class643 field5800;

    @OriginalMember(owner = "client!bda", name = "dg", descriptor = "Lrw;")
    public class643 field5801;

    @OriginalMember(owner = "client!bda", name = "gg", descriptor = "Lrw;")
    public class643 field5804;

    @OriginalMember(owner = "client!bda", name = "jg", descriptor = "Lrw;")
    public class643 field5807;

    @OriginalMember(owner = "client!bda", name = "lg", descriptor = "Lrw;")
    public class643 field5809;

    @OriginalMember(owner = "client!bda", name = "mg", descriptor = "Lrw;")
    public class643 field5810;

    @OriginalMember(owner = "client!bda", name = "pg", descriptor = "Lrw;")
    public class643 field5813;

    @OriginalMember(owner = "client!bda", name = "sg", descriptor = "Lrw;")
    public class643 field5816;

    @OriginalMember(owner = "client!bda", name = "tg", descriptor = "Lrw;")
    public class643 field5817;

    @OriginalMember(owner = "client!bda", name = "tb", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field5558;

    @OriginalMember(owner = "client!bda", name = "Id", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field5677;

    @OriginalMember(owner = "client!bda", name = "Bb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field5566;

    @OriginalMember(owner = "client!bda", name = "ke", descriptor = "Z")
    public boolean field5705;

    @OriginalMember(owner = "client!bda", name = "Se", descriptor = "Z")
    public boolean field5739;

    @OriginalMember(owner = "client!bda", name = "hf", descriptor = "Z")
    public boolean field5754;

    @OriginalMember(owner = "client!bda", name = "zf", descriptor = "Z")
    public boolean field5771;

    @OriginalMember(owner = "client!bda", name = "Pf", descriptor = "Z")
    public boolean field5787;

    @OriginalMember(owner = "client!bda", name = "wg", descriptor = "Z")
    public boolean field5820;

    @OriginalMember(owner = "client!bda", name = "Rf", descriptor = "[Lsg;")
    public class335[] field5789;

    @OriginalMember(owner = "client!bda", name = "mf", descriptor = "[Lhv;")
    private class440[] field5758;

    @OriginalMember(owner = "client!bda", name = "Te", descriptor = "[Lcba;")
    public class469[] field5740;

    @OriginalMember(owner = "client!bda", name = "yf", descriptor = "[Lft;")
    public class4[] field5770;

    @OriginalMember(owner = "client!bda", name = "Ve", descriptor = "[Lraa;")
    public class520[] field5742;

    @OriginalMember(owner = "client!bda", name = "sf", descriptor = "[Lraa;")
    public class520[] field5764;

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "(Z)Lsg;", line = 6)
    public final class335 method2404(boolean arg0) {
        ++field5651;
        if (!this.field5785) {
            this.field5696.method1874(this.field5694, this.field5687);
            this.field5785 = true;
        }
        if (arg0) {
            this.field5806 = null;
        }
        return this.field5696;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIIIIIIII)V", line = 24)
    public final void method264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5638;
    }

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 31)
    public final void method1187(Canvas arg0) {
        ++field5565;
        if (this.field5612 == arg0) {
            throw new RuntimeException();
        } else if (!this.field5566.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method1818(arg0, 104);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field5566.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "()Z", line = 69)
    public final boolean method1108() {
        ++field5682;
        return true;
    }

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "(IIIII)V", line = 77)
    public final void method1110(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5669;
        this.method1168(arg0, arg1, arg0, arg1 - -arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(II)V", line = 88)
    public final void method2405(int arg0, int arg1) {
        if (~this.field5711 != ~arg0) {
            class480 var3;
            boolean var4;
            boolean var5;
            if (arg0 != 1) {
                if (arg0 == 2) {
                    var3 = class528.field7391;
                    var4 = false;
                    var5 = true;
                } else if (~arg0 == -129) {
                    var4 = true;
                    var5 = true;
                    var3 = class308.field3931;
                } else {
                    var4 = false;
                    var3 = class598.field8662;
                    var5 = false;
                }
            } else {
                var3 = class328.field4273;
                var4 = true;
                var5 = true;
            }
            if (!this.field5718 != !var4) {
                this.field5718 = var4;
                this.method1812(16168);
            }
            if (this.field5730 != var5) {
                this.field5730 = var5;
                this.method1830(-75);
            }
            if (this.field5709 != var3) {
                this.field5709 = var3;
                this.method1793(1);
            }
            this.field5731 &= -29;
            this.field5711 = arg0;
        }
        ++field5533;
        if (arg1 != -18001) {
            this.method1106(-0.28116342F, -0.31970716F);
        }
    }

    @OriginalMember(owner = "client!bda", name = "h", descriptor = "(I)V", line = 156)
    private final void method2406(int arg0) {
        this.field5785 = false;
        if (arg0 != 0) {
            this.method2467(-110);
        }
        ++field5547;
        if (this.field5737 != null) {
            this.field5737.method633((byte) -44);
        }
        this.method1797((byte) 76);
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 180)
    public final void method274(Canvas arg0) {
        this.field5521 = null;
        this.field5543 = null;
        ++field5688;
        if (arg0 != null && this.field5612 != arg0) {
            if (this.field5566.containsKey(arg0)) {
                this.field5521 = this.field5566.get(arg0);
                this.field5543 = arg0;
            }
        } else {
            this.field5521 = this.field5535;
            this.field5543 = this.field5612;
        }
        if (this.field5543 != null && this.field5521 != null) {
            this.method1816(this.field5521, (byte) -40, this.field5543);
            this.method2423((byte) -109);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bda", name = "CA", descriptor = "()I", line = 212)
    public final int method1129() {
        ++field5673;
        return this.field5701;
    }

    @OriginalMember(owner = "client!bda", name = "IA", descriptor = "(III[I)V", line = 222)
    public final void method1112(int arg0, int arg1, int arg2, int[] arg3) {
        ++field5613;
        float var5 = this.field5692.method1871((float) arg2, (float) arg0, (float) arg1, -1);
        if (!(var5 < (float) this.field5782) && !(var5 > (float) this.field5701)) {
            int var6 = (int) ((float) this.field5795 * this.field5692.method1880((float) arg2, (float) arg1, 0, (float) arg0) / var5);
            int var7 = (int) ((float) this.field5724 * this.field5692.method1877((float) arg1, (float) arg0, (float) arg2, (byte) 117) / var5);
            if (this.field5797 <= (float) var6 && (float) var6 <= this.field5748 && (float) var7 >= this.field5710 && this.field5704 >= (float) var7) {
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 - this.field5797);
                arg3[1] = (int) ((float) var7 + -this.field5710);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lr;Lka;Lm;Lcf;I)V", line = 254)
    public final void method1177(class157 arg0, class400 arg1, class163 arg2, class517 arg3, int arg4) {
        ++field5616;
        arg0.method69(arg2, arg3, arg4);
        this.method1140(arg1);
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(Z)V", line = 263)
    public final void method1181(boolean arg0) {
        this.field5723 = arg0;
        ++field5548;
        this.method1815((byte) 115);
    }

    @OriginalMember(owner = "client!bda", name = "z", descriptor = "()Z", line = 273)
    public final boolean method1173() {
        ++field5631;
        return true;
    }

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "(Z)V", line = 281)
    private final void method2407(boolean arg0) {
        this.method1811((byte) 6);
        ++field5580;
        if (!arg0) {
            this.field5757 = -43;
        }
        if (this.field5737 != null) {
            this.field5737.method447(15);
        }
    }

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "(Z)V", line = 297)
    private final void method2408(boolean arg0) {
        ++field5511;
        if (this.field5731 != 1) {
            this.method2486(-25);
            this.method2424(0, false);
            this.method2452(false, (byte) -94);
            this.method2441(false, 128);
            this.method2478((byte) 104, false);
            this.method2439(-2, false, false, (byte) 127);
            this.method2437(1, -3);
            this.method2459(64, this.field5794);
            this.field5731 = 1;
        }
        if (!arg0) {
            this.field5753 = null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "UA", descriptor = "(IIIII)V", line = 321)
    public final void method1130(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5603;
        this.method1168(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!bda", name = "D", descriptor = "()Z", line = 331)
    public final boolean method1194() {
        ++field5649;
        return false;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Ldp;Z)Lha;", line = 341)
    public final class52 method1101(class3 arg0, boolean arg1) {
        ++field5680;
        class52 var9;
        if (~arg0.field15 != -1 && ~arg0.field14 != -1) {
            int[] var3 = new int[arg0.field15 * arg0.field14];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field9 != null) {
                for (int var6 = 0; ~arg0.field14 < ~var6; ++var6) {
                    for (int var7 = 0; ~arg0.field15 < ~var7; ++var7) {
                        var3[var5++] = class42.method223(arg0.field9[var4] << 24, arg0.field13[class288.method1624(255, arg0.field11[var4])]);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; ~var8 > ~arg0.field14; ++var8) {
                    for (int var10 = 0; arg0.field15 > var10; ++var10) {
                        int var11 = arg0.field13[255 & arg0.field11[var4++]];
                        var3[var5++] = var11 != 0 ? class42.method223(var11, -16777216) : 0;
                    }
                }
            }
            var9 = this.method1114(var3, 0, arg0.field15, arg0.field15, arg0.field14);
        } else {
            var9 = this.method1114(new int[1], 0, 1, 1, 1);
        }
        var9.method297(arg0.field12, arg0.field10, arg0.field17, arg0.field16);
        return var9;
    }

    @OriginalMember(owner = "client!bda", name = "k", descriptor = "(I)V", line = 408)
    public void method1809(int arg0) {
        ++field5585;
        this.method2449(arg0 + 12427);
        if (arg0 != 0) {
            this.field5543 = null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(IIIIII)V", line = 424)
    public final void method1168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5614;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var8 * var9;
        float var11 = var7 * var9;
        if (this.method2442((float) arg2 + var11, (float) arg3 + var10, (float) arg1, -127, 0.0F, (float) arg0, 0.0F)) {
            this.method2408(true);
            this.method2434(-11, arg4);
            this.method2435(0, 70, class264.field3445);
            this.method2465(class264.field3445, -14787, 0);
            this.method2405(arg5, -18001);
            this.method2433(22880);
            this.method1834(false, 21492);
            this.method2475(14);
            this.method1834(true, 21492);
            this.method2465(class289.field3751, -14787, 0);
            this.method2435(0, 30, class289.field3751);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lka;)V", line = 454)
    public final void method1140(class400 arg0) {
        ++field5634;
        this.field5744.method3646(arg0, false, this);
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ln;Ldn;II)V", line = 468)
    public class428(Canvas arg0, Object arg1, class17 arg2, class438 arg3, int arg4, int arg5) {
        super(arg2);
        this.field5543 = this.field5612 = arg0;
        this.field5722 = arg4;
        this.field5521 = this.field5535 = arg1;
        this.field5586 = arg3;
        Dimension var7 = arg0.getSize();
        this.field5512 = this.field5632 = var7.width;
        this.field5766 = arg5;
        this.field5564 = this.field5510 = var7.height;
        class355.method1997(false, (byte) -45, true);
        this.field5759 = new class134(this, super.field2481);
        this.field5506 = new NativeInterface(super.field2481.method115(23666), this.field5766);
        for (int var8 = 0; super.field2481.method115(23666) > var8; ++var8) {
            class217 var9 = super.field2481.method119(-106, var8);
            if (var9 != null) {
                this.field5506.initTextureMetrics(var8, var9.field2656, var9.field2644);
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(B)V", line = 505)
    public final void method2409(byte arg0) {
        ++field5618;
        if (arg0 != 103) {
            this.field5708 = -123;
        }
        Enumeration var2 = this.field5566.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method1814(this.field5566.get(var3), var3, -128);
        }
        this.field5808.method443(23678);
        this.field5814.method443(23678);
        this.field5813.method3705((byte) 126);
        this.field5799.method3705((byte) 97);
        this.field5801.method3705((byte) 101);
        this.field5816.method3705((byte) 115);
        this.field5800.method3705((byte) 120);
        this.field5744.method3642(64);
        this.field5803.method443(23678);
    }

    @OriginalMember(owner = "client!bda", name = "l", descriptor = "(I)V", line = 535)
    private final void method2410(int arg0) {
        if (arg0 != -8) {
            this.method1825(24);
        }
        if (class104.field1269 != this.field5728) {
            class597 var2 = this.field5728;
            this.field5728 = class104.field1269;
            if (!var2.method3455((byte) 77)) {
                this.method2406(0);
            }
            this.method2421(false);
            this.field5769 = this.field5752;
            this.method2482(arg0 + -109);
            this.field5731 &= -8;
        }
        ++field5550;
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)V", line = 560)
    public final void method278(int arg0) {
        ++field5622;
    }

    @OriginalMember(owner = "client!bda", name = "m", descriptor = "(I)V", line = 568)
    public final void method2411(int arg0) {
        if (this.field5731 != 8) {
            this.method2440(0);
            this.method2424(0, true);
            this.method2441(true, 128);
            this.method2478((byte) -66, true);
            this.method2405(1, -18001);
            this.field5731 = 8;
        }
        int var2 = -38 % ((-19 - arg0) / 62);
        ++field5665;
    }

    @OriginalMember(owner = "client!bda", name = "n", descriptor = "(I)V", line = 588)
    private final void method2412(int arg0) {
        ++field5593;
        if (arg0 == 0) {
            if (!this.field5716) {
                float[] var2 = this.field5753;
                this.field5716 = true;
                if (~this.field5512 != -1 && ~this.field5564 != -1) {
                    var2[4] = 0.0F;
                    var2[2] = 0.0F;
                    var2[3] = 0.0F;
                    var2[13] = 1.0F;
                    var2[0] = 2.0F / (float) this.field5512;
                    var2[9] = 0.0F;
                    var2[5] = -2.0F / (float) this.field5564;
                    var2[1] = 0.0F;
                    var2[15] = 1.0F;
                    var2[8] = 0.0F;
                    var2[12] = -1.0F;
                    var2[10] = 0.5F;
                    var2[7] = 0.0F;
                    var2[14] = 0.5F;
                    var2[11] = 0.0F;
                    var2[6] = 0.0F;
                } else {
                    var2[4] = 0.0F;
                    var2[0] = 1.0F;
                    var2[15] = 1.0F;
                    var2[12] = 0.0F;
                    var2[10] = 1.0F;
                    var2[1] = 0.0F;
                    var2[7] = 0.0F;
                    var2[6] = 0.0F;
                    var2[9] = 0.0F;
                    var2[8] = 0.0F;
                    var2[11] = 0.0F;
                    var2[13] = 0.0F;
                    var2[14] = 0.0F;
                    var2[3] = 0.0F;
                    var2[2] = 0.0F;
                    var2[5] = 1.0F;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "(B)V", line = 648)
    private final void method2413(byte arg0) {
        this.field5783 = false;
        ++field5546;
        this.method2414(arg0 ^ 9);
        if (arg0 != 7) {
            this.method1802((class393) null, 69, false, 88);
        }
        if (class537.field7555 == this.field5728) {
            this.method2482(-114);
        }
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 664)
    public final void method1149(Canvas arg0) {
        ++field5604;
        if (this.field5612 == arg0) {
            throw new RuntimeException();
        } else if (this.field5566.containsKey(arg0)) {
            this.method1814(this.field5566.get(arg0), arg0, -111);
            this.field5566.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lfc;[Ldp;Z)Lra;", line = 682)
    public final class90 method1153(class216 arg0, class3[] arg1, boolean arg2) {
        ++field5672;
        return new class331(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bda", name = "za", descriptor = "(IIIIII[BII)V", line = 690)
    public final void method1125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field5536;
    }

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "(I)V", line = 697)
    public final void method1163(int arg0) {
        ++field5595;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field5772 = arg0;
            this.field5759.method750(true);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bda", name = "o", descriptor = "(I)V", line = 711)
    private final void method2414(int arg0) {
        if (arg0 != 14) {
            this.field5802 = null;
        }
        ++field5683;
        if (!this.field5783) {
            float[] var2 = this.field5777;
            float var3 = (float) (-this.field5735 * this.field5782) / (float) this.field5795;
            float var4 = (float) ((-this.field5735 + this.field5512) * this.field5782) / (float) this.field5795;
            float var5 = (float) (this.field5782 * this.field5781) / (float) this.field5724;
            float var6 = (float) ((this.field5781 - this.field5564) * this.field5782) / (float) this.field5724;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field5782 * 2.0F;
                var2[3] = 0.0F;
                var2[2] = 0.0F;
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[10] = this.field5715 = (float) this.field5701 / (float) (-this.field5701 + this.field5782);
                var2[12] = 0.0F;
                var2[4] = 0.0F;
                var2[13] = 0.0F;
                var2[7] = 0.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[15] = 0.0F;
                var2[14] = this.field5700 = (float) (this.field5782 * this.field5701) / (float) (this.field5782 - this.field5701);
                var2[11] = -1.0F;
                var2[6] = 0.0F;
                var2[5] = var7 / (var5 - var6);
                var2[0] = var7 / (-var3 + var4);
                var2[1] = 0.0F;
            } else {
                var2[6] = 0.0F;
                var2[1] = 0.0F;
                var2[9] = 0.0F;
                var2[12] = 0.0F;
                var2[7] = 0.0F;
                var2[5] = 1.0F;
                var2[4] = 0.0F;
                var2[3] = 0.0F;
                var2[0] = 1.0F;
                var2[10] = 1.0F;
                var2[8] = 0.0F;
                var2[11] = 0.0F;
                var2[15] = 1.0F;
                var2[13] = 0.0F;
                var2[2] = 0.0F;
                var2[14] = 0.0F;
            }
            this.method2484(-1);
            this.field5783 = true;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(BB)V", line = 778)
    public final void method2415(byte arg0, byte arg1) {
        this.method2434(-116, arg0 << 24 | arg0 << 16 | arg0 << 8 | arg0);
        ++field5602;
        if (arg1 != 117) {
            this.method2427((byte) -103);
        }
    }

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "(B)V", line = 790)
    public final void method2416(byte arg0) {
        if (this.field5731 != 2) {
            this.method2486(-25);
            this.method2424(0, false);
            this.method2452(false, (byte) -94);
            this.method2441(false, 128);
            this.method2478((byte) -60, false);
            this.method2439(-2, false, false, (byte) 120);
            this.field5731 = 2;
        }
        ++field5557;
        int var2 = -5 % ((arg0 - -7) / 53);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lmv;)V", line = 821)
    public final void method1189(class313 arg0) {
        ++field5646;
        this.field5736 = (class628) arg0;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)I", line = 830)
    public final int method1128(int arg0, int arg1) {
        ++field5642;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(BILvi;I)V", line = 838)
    public static final void method2417(byte arg0, int arg1, class459 arg2, int arg3) {
        if (arg2.field6465 == arg1 && arg1 != -1) {
            class502 var4 = class393.field5190.method770(arg1, -72);
            int var5 = var4.field6940;
            if (~var5 == -2) {
                arg2.field6477 = 0;
                arg2.field6449 = arg3;
                arg2.field6422 = 0;
                arg2.field6390 = 0;
                arg2.field6409 = 1;
                class614.method3532(arg2.field8660, var4, true, arg2.field8652, arg2.field6390, false, arg2.field8661);
            }
            if (var5 == 2) {
                arg2.field6422 = 0;
            }
        } else if (arg1 == -1 || ~arg2.field6465 == 0 || ~class393.field5190.method770(arg1, arg0 + -126).field6948 <= ~class393.field5190.method770(arg2.field6465, -126).field6948) {
            arg2.field6390 = 0;
            arg2.field6477 = 0;
            arg2.field6409 = 1;
            arg2.field6449 = arg3;
            arg2.field6489 = arg2.field6486;
            arg2.field6422 = 0;
            arg2.field6465 = arg1;
            if (~arg2.field6465 != 0) {
                class614.method3532(arg2.field8660, class393.field5190.method770(arg2.field6465, -85), true, arg2.field8652, arg2.field6390, false, arg2.field8661);
            }
        }
        if (arg0 != 51) {
            field5532 = 98;
        }
        ++field5568;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lm;)V", line = 900)
    public final void method1160(class163 arg0) {
        ++field5635;
        this.field5692 = (class335) arg0;
        this.field5694.method676(this.field5692);
        this.field5694.method1882((byte) 68);
        this.field5695.method1890(false, this.field5694);
        this.field5693.method1890(false, this.field5692);
        if (this.field5728.method3455((byte) 77)) {
            this.method2406(0);
        }
    }

    @OriginalMember(owner = "client!bda", name = "g", descriptor = "(B)V", line = 916)
    private final void method2418(byte arg0) {
        this.field5716 = false;
        if (arg0 == -58) {
            ++field5538;
            if (class104.field1269 == this.field5728) {
                this.method2421(false);
                this.method2482(arg0 + -27);
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIIII)Lmv;", line = 933)
    public final class313 method1136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5582;
        return new class532(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bda", name = "q", descriptor = "(I)V", line = 941)
    private final void method2419(int arg0) {
        if (arg0 == 2) {
            ++field5678;
            this.field5716 = false;
            if (class318.field4056 == this.field5728) {
                this.method2412(0);
                this.method2482(-75);
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "E", descriptor = "(III)V", line = 958)
    public final void method1120(int arg0, int arg1, int arg2) {
        if (this.field5751 != arg0 || ~this.field5697 != ~arg1 || this.field5796 != arg2) {
            this.field5697 = arg1;
            this.field5751 = arg0;
            this.field5796 = arg2;
            if (!this.field5705) {
                this.method2480((byte) -19);
                this.method1788(7);
            }
        }
        ++field5679;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(II[I[I)Lpa;", line = 980)
    public final class309 method1148(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field5518;
        return class195.method1061(arg1, arg3, arg2, this, arg0, 119);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "([IIIII)Lha;", line = 993)
    public final class52 method1114(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5617;
        return new class358(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZI)V", line = 1003)
    public final void method2420(boolean arg0, int arg1) {
        if (!arg0 != !this.field5788) {
            this.field5788 = arg0;
            this.method1788(7);
        }
        if (arg1 == 11) {
            ++field5619;
        }
    }

    @OriginalMember(owner = "client!bda", name = "g", descriptor = "(Z)V", line = 1019)
    private final void method2421(boolean arg0) {
        if (arg0) {
            this.field5713 = -85;
        }
        if (!this.field5726) {
            float[] var2 = this.field5753;
            float var3 = (float) this.field5782 - this.field5743;
            float var4 = (float) this.field5701 - this.field5743;
            float var5 = (float) (-this.field5781) * this.field5775 / (float) this.field5724;
            float var6 = (float) (-this.field5735) * this.field5775 / (float) this.field5795;
            float var7 = (float) (-this.field5735 + this.field5512) * this.field5775 / (float) this.field5795;
            float var8 = (float) (-this.field5781 + this.field5564) * this.field5775 / (float) this.field5724;
            if (var6 != var7 && var5 != var8) {
                var2[5] = 2.0F / (var5 - var8);
                var2[4] = 0.0F;
                var2[10] = -2.0F / (-var3 + var4);
                var2[15] = 1.0F;
                var2[1] = 0.0F;
                var2[9] = 0.0F;
                var2[3] = 0.0F;
                var2[13] = -(var5 + var8) / (-var8 + var5);
                var2[14] = -(var3 + var4) / (-var3 + var4);
                var2[0] = 2.0F / (var7 - var6);
                var2[12] = -(var6 + var7) / (-var6 + var7);
                var2[11] = 0.0F;
                var2[6] = 0.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[8] = 0.0F;
            } else {
                var2[5] = 1.0F;
                var2[14] = 0.0F;
                var2[0] = 1.0F;
                var2[7] = 0.0F;
                var2[9] = 0.0F;
                var2[3] = 0.0F;
                var2[11] = 0.0F;
                var2[10] = 1.0F;
                var2[2] = 0.0F;
                var2[12] = 0.0F;
                var2[1] = 0.0F;
                var2[15] = 1.0F;
                var2[8] = 0.0F;
                var2[4] = 0.0F;
                var2[6] = 0.0F;
                var2[13] = 0.0F;
            }
            this.method2445(-13620);
            this.field5726 = true;
        }
        ++field5639;
    }

    @OriginalMember(owner = "client!bda", name = "r", descriptor = "()Z", line = 1090)
    public final boolean method1144() {
        ++field5653;
        return this.field5787;
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(BI)Llj;", line = 1098)
    public class521 method1843(byte arg0, int arg1) {
        ++field5621;
        int var3 = 73 % ((64 - arg0) / 45);
        if (arg1 != 6) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    return arg1 == 7 ? new class136(this) : new class298(this);
                } else {
                    return new class78(this, this.field5562);
                }
            } else {
                return new class474(this);
            }
        } else {
            return new class444(this);
        }
    }

    @OriginalMember(owner = "client!bda", name = "s", descriptor = "(I)[F", line = 1152)
    public final float[] method2422(int arg0) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field5656;
            return this.field5767;
        }
    }

    @OriginalMember(owner = "client!bda", name = "h", descriptor = "(B)V", line = 1165)
    private final void method2423(byte arg0) {
        if (this.field5543 != null) {
            Dimension var2 = this.field5543.getSize();
            this.field5510 = var2.height;
            this.field5632 = var2.width;
        } else {
            this.field5632 = this.field5510 = 1;
        }
        ++field5584;
        this.field5564 = this.field5510;
        this.field5512 = this.field5632;
        this.method2419(2);
        this.method2413((byte) 7);
        this.method2418((byte) -58);
        this.method1831((byte) 101);
        this.method2458(0);
        this.method2483(9588);
        if (arg0 > -3) {
            this.method2432(true);
        }
        this.method1182();
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(IZ)V", line = 1201)
    public final void method2424(int arg0, boolean arg1) {
        if (this.field5771 == !arg1) {
            this.field5771 = arg1;
            this.method1788(7);
            this.field5731 &= -32;
        }
        ++field5513;
        if (arg0 != 0) {
            this.field5744 = null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "(II)Liaa;", line = 1219)
    public final class419 method2425(int arg0, int arg1) {
        ++field5561;
        if (this.field5803.method441(16304) < arg0 * 2) {
            this.field5803.method644(arg1 + 22460, arg0);
        }
        if (arg1 != -22571) {
            this.method2476((byte) -118);
        }
        return this.field5803;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Ljaclib/memory/Buffer;B)Ljaclib/memory/Stream;", line = 1236)
    public final Stream method2426(Buffer arg0, byte arg1) {
        if (arg1 != 11) {
            this.field5819 = -102;
        }
        ++field5534;
        this.field5773.method3346(arg0);
        return this.field5773;
    }

    @OriginalMember(owner = "client!bda", name = "i", descriptor = "(B)V", line = 1248)
    public final void method2427(byte arg0) {
        this.method2463(-12157, 2, class257.field3308);
        if (arg0 > 0) {
            this.field5612 = null;
        }
        ++field5530;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "()Z", line = 1262)
    public final boolean method1100() {
        ++field5596;
        return true;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lcu;Z)V", line = 1271)
    public static final void method2428(class185 arg0, boolean arg1) {
        ++field5670;
        if (class88.field1080 == arg0) {
            int var2 = class532.field7483.method2129(-108);
            int var3 = ((246 & var2) >> 4) + class473.field6633 * 2;
            int var4 = (var2 & 15) + class348.field4478 * 2;
            boolean var5 = class532.field7483.method2129(-126) != 0;
            int var6 = var3 + class532.field7483.method2124(127);
            int var7 = var4 + class532.field7483.method2124(-119);
            int var8 = class532.field7483.method2089(true);
            int var9 = class532.field7483.method2089(true);
            int var10 = class532.field7483.method2136(false);
            byte var11 = class532.field7483.method2124(-18);
            int var12 = class532.field7483.method2129(-95) * 4;
            int var13 = class532.field7483.method2136(false);
            int var14 = class532.field7483.method2136(arg1);
            int var15 = class532.field7483.method2129(-121);
            if (~var15 == -256) {
                var15 = -1;
            }
            int var16 = class532.field7483.method2136(arg1);
            if (var3 >= 0 && ~var4 <= -1 && class106.field1289 * 2 > var3 && class106.field1289 * 2 > var4 && var6 >= 0 && ~var7 <= -1 && var6 < class422.field5452 * 2 && ~var7 > ~(class422.field5452 * 2) && var10 != 65535) {
                int var17 = var4 * 64;
                int var18 = var7 * 64;
                int var19 = var6 * 64;
                int var20 = var3 * 64;
                int var21 = var16 << 0;
                int var22 = var11 << 0;
                int var23 = var12 << 0;
                if (~var8 != -1) {
                    class463 var24 = null;
                    int var27;
                    if (var8 < 0) {
                        int var25 = -var8 + -1;
                        int var26 = var25 & 2047;
                        var27 = (31090 & var25) >> 11;
                        if (~class82.field1003 != ~var26) {
                            var24 = class459.field6329[var26];
                        } else {
                            var24 = class103.field1265;
                        }
                    } else {
                        int var28 = var8 + -1;
                        int var29 = var28 & 2047;
                        var27 = (var28 & 31579) >> 11;
                        class415 var30 = (class415) class309.field3938.method2645((long) var29, (byte) -115);
                        if (var30 != null) {
                            var24 = var30.field5390;
                        }
                    }
                    if (var24 != null) {
                        class352 var31 = var24.method2704(0);
                        if (var31.field4583 != null && var31.field4583[var27] != null) {
                            int var32 = var31.field4583[var27][0];
                            int var33 = var31.field4583[var27][2];
                            int var34 = var24.field6412.method962(-91);
                            int var35 = class442.field6100[var34];
                            int var36 = class442.field6101[var34];
                            int var37 = var33 * var35 - -(var32 * var36) >> 15;
                            int var38 = var33 * var36 + -(var32 * var35) >> 15;
                            var17 += var38;
                            var22 -= var31.field4583[var27][1];
                            var20 += var37;
                        }
                    }
                }
                class57 var40 = new class57(var10, class217.field2663, var20, var17, var22, class335.field4358 + var13, class335.field4358 + var14, var15, var21, var9, var23, var5);
                var40.method329(var18, class426.method2400(-1, var18, var19, class217.field2663) + -var23, -117, var19, class335.field4358 + var13);
                class209.field2545.method1040(new class16(var40), -126);
            }
        } else if (class493.field6879 == arg0) {
            class532.field7483.method2129(-123);
            int var41 = class532.field7483.method2129(-107);
            int var42 = (7 & var41 >> 4) + class473.field6633;
            int var43 = (7 & var41) + class348.field4478;
            int var44 = class532.field7483.method2136(false);
            int var45 = class532.field7483.method2129(-125);
            int var46 = class532.field7483.method2128(true);
            String var47 = class532.field7483.method2133(arg1);
            class189.method1029(var42, var45, var43, var46, class217.field2663, var47, 0, var44);
        } else if (class195.field2366 == arg0) {
            int var48 = class532.field7483.method2129(-88);
            int var49 = ((246 & var48) >> 4) + class473.field6633 * 2;
            int var50 = (15 & var48) + class348.field4478 * 2;
            boolean var51 = ~class532.field7483.method2129(-124) != -1;
            int var52 = class532.field7483.method2124(5) + var49;
            int var53 = var50 + class532.field7483.method2124(24);
            int var54 = class532.field7483.method2089(true);
            int var55 = class532.field7483.method2136(arg1);
            int var56 = class532.field7483.method2129(-63) * 4;
            int var57 = class532.field7483.method2129(-90) * 4;
            int var58 = class532.field7483.method2136(false);
            int var59 = class532.field7483.method2136(false);
            int var60 = class532.field7483.method2129(-96);
            if (~var60 == -256) {
                var60 = -1;
            }
            int var61 = class532.field7483.method2136(false);
            if (var49 >= 0 && var50 >= 0 && var49 < class106.field1289 * 2 && ~(class106.field1289 * 2) < ~var50 && ~var52 <= -1 && ~var53 <= -1 && ~(class422.field5452 * 2) < ~var52 && ~(class422.field5452 * 2) < ~var53 && var55 != 65535) {
                int var62 = var53 * 64;
                int var63 = var57 << 0;
                int var64 = var61 << 0;
                int var65 = var50 * 64;
                int var66 = var52 * 64;
                int var67 = var56 << 0;
                int var68 = var49 * 64;
                class57 var69 = new class57(var55, class217.field2663, var68, var65, var67, class335.field4358 + var58, class335.field4358 + var59, var60, var64, var54, var63, var51);
                var69.method329(var62, class426.method2400(-1, var62, var66, class217.field2663) + -var63, 58, var66, class335.field4358 + var58);
                class209.field2545.method1040(new class16(var69), -91);
            }
        } else if (class551.field8117 == arg0) {
            int var70 = class532.field7483.method2129(-115);
            int var71 = (7 & var70) + class348.field4478;
            int var72 = class119.field1504 + var71;
            int var73 = (var70 >> 4 & 7) + class473.field6633;
            int var74 = class632.field9113 + var73;
            int var75 = class532.field7483.method2136(false);
            int var76 = class532.field7483.method2136(false);
            int var77 = class532.field7483.method2136(false);
            if (class150.field1787 != null) {
                class36 var78 = (class36) class150.field1787.method2645((long) (class217.field2663 << 28 | var72 << 14 | var74), (byte) -115);
                if (var78 != null) {
                    for (class197 var79 = (class197) var78.field280.method1050((byte) 73); var79 != null; var79 = (class197) var78.field280.method1047(-7962)) {
                        if (~(32767 & var75) == ~var79.field2386 && ~var79.field2384 == ~var76) {
                            var79.method3187(true);
                            var79.field2384 = var77;
                            class173.method969(28, var74, var72, class217.field2663, var79);
                            break;
                        }
                    }
                    if (var73 >= 0 && ~var71 <= -1 && ~var73 > ~class106.field1289 && ~class422.field5452 < ~var71) {
                        class343.method1910(var71, -10724, var73, class217.field2663);
                    }
                }
            }
        } else if (class89.field1097 == arg0) {
            int var80 = class532.field7483.method2136(false);
            int var81 = class532.field7483.method2129(-107);
            class16.field126.method1759(arg1, var80).method2547(var81, (byte) -78);
        } else if (class430.field5838 == arg0) {
            int var82 = class532.field7483.method2109(-17379);
            int var83 = class348.field4478 - -(7 & var82);
            int var84 = var83 - -class119.field1504;
            int var85 = class473.field6633 - -(var82 >> 4 & 7);
            int var86 = var85 - -class632.field9113;
            int var87 = class532.field7483.method2114(33);
            class36 var88 = (class36) class150.field1787.method2645((long) (var84 << 14 | class217.field2663 << 28 | var86), (byte) -123);
            if (var88 != null) {
                for (class197 var89 = (class197) var88.field280.method1050((byte) 73); var89 != null; var89 = (class197) var88.field280.method1047(-7962)) {
                    if ((32767 & var87) == var89.field2386) {
                        var89.method3187(true);
                        break;
                    }
                }
                if (var88.field280.method1043(true)) {
                    var88.method3187(true);
                }
                if (var85 >= 0 && var83 >= 0 && var85 < class106.field1289 && var83 < class422.field5452) {
                    class343.method1910(var83, -10724, var85, class217.field2663);
                }
            }
        } else if (class587.field8513 == arg0) {
            int var90 = class532.field7483.method2091(255);
            int var91 = var90 >> 2;
            int var92 = 3 & var90;
            int var93 = class532.field7483.method2103((byte) 74);
            byte var94 = class532.field7483.method2124(21);
            int var95 = class532.field7483.method2103((byte) 74);
            int var96 = class532.field7483.method2138(255);
            int var97 = class532.field7483.method2103((byte) 74);
            byte var98 = class532.field7483.method2143((byte) -128);
            byte var99 = class532.field7483.method2110(0);
            byte var100 = class532.field7483.method2143((byte) -118);
            int var101 = class532.field7483.method2084((byte) -41);
            int var102 = (var101 >> 4 & 7) + class473.field6633;
            int var103 = (7 & var101) + class348.field4478;
            if (!class210.field2560.method271()) {
                class308.method1708(var94, var98, var100, var103, class217.field2663, var93, var91, 93, var97, var96, var95, var102, var99, var92);
            }
        } else if (class267.field3484 == arg0) {
            int var104 = class532.field7483.method2144((byte) 127);
            int var105 = class532.field7483.method2144((byte) 123);
            int var106 = class532.field7483.method2114(40);
            int var107 = class532.field7483.method2091(255);
            int var108 = (7 & var107) + class348.field4478;
            int var109 = class119.field1504 + var108;
            int var110 = (7 & var107 >> 4) + class473.field6633;
            int var111 = class632.field9113 + var110;
            if (class82.field1003 != var104) {
                boolean var112 = ~var110 <= -1 && ~var108 <= -1 && ~class106.field1289 < ~var110 && ~class422.field5452 < ~var108;
                if (var112 || class283.method1601(200, class593.field8620)) {
                    class173.method969(62, var111, var109, class217.field2663, new class197(var105, var106));
                    if (var112) {
                        class343.method1910(var108, -10724, var110, class217.field2663);
                    }
                }
            }
        } else if (class172.field2095 == arg0) {
            int var113 = class532.field7483.method2129(-77);
            boolean var114 = ~(128 & var113) != -1;
            int var115 = ((58 & var113) >> 3) + class473.field6633;
            int var116 = (var113 & 7) + class348.field4478;
            int var117 = class532.field7483.method2124(-122) + var115;
            int var118 = class532.field7483.method2124(-127) + var116;
            int var119 = class532.field7483.method2089(true);
            int var120 = class532.field7483.method2136(false);
            int var121 = 4 * class532.field7483.method2129(-99);
            int var122 = 4 * class532.field7483.method2129(-78);
            int var123 = class532.field7483.method2136(false);
            int var124 = class532.field7483.method2136(arg1);
            int var125 = class532.field7483.method2129(-116);
            if (~var125 == -256) {
                var125 = -1;
            }
            int var126 = class532.field7483.method2136(arg1);
            if (~var115 <= -1 && var116 >= 0 && ~var115 > ~class106.field1289 && ~class422.field5452 < ~var116 && var117 >= 0 && var118 >= 0 && class106.field1289 > var117 && ~class422.field5452 < ~var118 && var120 != 65535) {
                int var127 = var126 << 0;
                int var128 = var122 << 0;
                int var129 = var115 * 128 + 64;
                int var130 = var116 * 128 + 64;
                int var131 = var121 << 0;
                int var132 = var118 * 128 - -64;
                int var133 = var117 * 128 + 64;
                class57 var134 = new class57(var120, class217.field2663, var129, var130, var131, class335.field4358 + var123, class335.field4358 + var124, var125, var127, var119, var128, var114);
                var134.method329(var132, -var128 + class426.method2400(-1, var132, var133, class217.field2663), 96, var133, var123 - -class335.field4358);
                class209.field2545.method1040(new class16(var134), -105);
            }
        } else if (class512.field7237 == arg0) {
            int var135 = class532.field7483.method2129(-108);
            int var136 = (var135 >> 4 & 7) + class473.field6633;
            int var137 = (7 & var135) + class348.field4478;
            int var138 = class532.field7483.method2136(false);
            if (var138 == 65535) {
                var138 = -1;
            }
            int var139 = class532.field7483.method2129(-111);
            int var140 = (var139 & 246) >> 4;
            int var141 = 7 & var139;
            int var142 = class532.field7483.method2129(-121);
            int var143 = class532.field7483.method2129(-64);
            if (var136 >= 0 && var137 >= 0 && ~class106.field1289 < ~var136 && class422.field5452 > var137) {
                int var144 = var140 + 1;
                if (class103.field1265.field6483[0] >= -var144 + var136 && ~(var136 + var144) <= ~class103.field1265.field6483[0] && ~class103.field1265.field6491[0] <= ~(var137 - var144) && ~class103.field1265.field6491[0] >= ~(var137 + var144)) {
                    class560.method3272(var143, 0, var142, var141, (class217.field2663 << 24) + (var136 << 16) + (var137 << 8) + var140, var138);
                }
            }
        } else if (class493.field6878 == arg0) {
            int var145 = class532.field7483.method2129(-110);
            int var146 = ((var145 & 121) >> 4) + class473.field6633;
            int var147 = (7 & var145) + class348.field4478;
            int var148 = class532.field7483.method2136(false);
            int var149 = class532.field7483.method2129(-106);
            int var150 = class532.field7483.method2136(false);
            int var151 = class532.field7483.method2129(-72);
            if (~var146 <= -1 && ~var147 <= -1 && ~class106.field1289 < ~var146 && var147 < class422.field5452) {
                int var152 = var146 * 128 + 64;
                int var153 = var147 * 128 + 64;
                int var154 = class217.field2663;
                if (~var154 > -4 && class150.method821(var147, var146, 0)) {
                    ++var154;
                }
                class510 var155 = new class510(var148, var150, class335.field4358, class217.field2663, var154, var152, class426.method2400(-1, var153, var152, class217.field2663) - var149, var153, var146, var146, var147, var147, var151);
                class389.field5136.method1040(new class633(var155), -105);
            }
        } else if (class313.field3995 == arg0) {
            int var156 = class532.field7483.method2109(-17379);
            int var157 = (7 & var156 >> 4) + class473.field6633;
            int var158 = (var156 & 7) + class348.field4478;
            int var159 = class532.field7483.method2084((byte) -41);
            int var160 = var159 >> 2;
            int var161 = 3 & var159;
            int var162 = class605.field8736[var160];
            int var163 = class532.field7483.method2136(false);
            if (~var163 == -65536) {
                var163 = -1;
            }
            class644.method3718(var161, var158, -125, var157, var162, var160, class217.field2663, var163);
        } else if (class566.field8317 == arg0) {
            int var164 = class532.field7483.method2103((byte) 74);
            int var165 = class532.field7483.method2129(-88);
            int var166 = var165 >> 2;
            int var167 = 3 & var165;
            int var168 = class605.field8736[var166];
            int var169 = class532.field7483.method2129(-66);
            int var170 = ((var169 & 114) >> 4) + class473.field6633;
            int var171 = class348.field4478 - -(var169 & 7);
            if (class283.method1601(200, class593.field8620) || ~var170 <= -1 && var171 >= 0 && ~class106.field1289 < ~var170 && class422.field5452 > var171) {
                class366.method2046(var167, var166, -1, var164, var170, var168, var171, class217.field2663, -43, 0);
            }
        } else if (class64.field631 == arg0) {
            int var172 = class532.field7483.method2084((byte) -41);
            int var173 = ((var172 & 117) >> 4) + class473.field6633;
            int var174 = (var172 & 7) + class348.field4478;
            int var175 = class532.field7483.method2129(-127);
            int var176 = var175 >> 2;
            int var177 = var175 & 3;
            int var178 = class605.field8736[var176];
            if (class283.method1601(200, class593.field8620) || var173 >= 0 && var174 >= 0 && class106.field1289 > var173 && ~var174 > ~class422.field5452) {
                class366.method2046(var177, var176, -1, -1, var173, var178, var174, class217.field2663, -58, 0);
            }
        } else if (class329.field4297 != arg0) {
            class443.method2597((Throwable) null, "T3 - " + arg0, (byte) 105);
            class542.method3152(arg1, -14485);
        } else {
            int var179 = class532.field7483.method2114(114);
            int var180 = class532.field7483.method2144((byte) 127);
            int var181 = class532.field7483.method2084((byte) -41);
            int var182 = (7 & var181) + class348.field4478;
            int var183 = class119.field1504 + var182;
            int var184 = ((var181 & 125) >> 4) + class473.field6633;
            int var185 = class632.field9113 + var184;
            boolean var186 = ~var184 <= -1 && var182 >= 0 && var184 < class106.field1289 && var182 < class422.field5452;
            if (var186 || class283.method1601(200, class593.field8620)) {
                class173.method969(88, var185, var183, class217.field2663, new class197(var179, var180));
                if (var186) {
                    class343.method1910(var182, -10724, var184, class217.field2663);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "()Z", line = 1920)
    public final boolean method1104() {
        ++field5503;
        return true;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIIIILpa;II)V", line = 1930)
    public final void method1178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class309 arg6, int arg7, int arg8) {
        ++field5520;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lraa;Lraa;I)V", line = 1939)
    public final void method2429(class520 arg0, class520 arg1, int arg2) {
        ++field5668;
        boolean var4 = false;
        if (arg2 < 13) {
            this.field5782 = 40;
        }
        if (this.field5764[this.field5750] != arg1) {
            this.field5764[this.field5750] = arg1;
            this.method1838(-1);
            var4 = true;
        }
        if (this.field5742[this.field5750] != arg0) {
            this.field5742[this.field5750] = arg0;
            var4 = true;
            this.method1806((byte) -107);
        }
        if (var4) {
            this.field5731 &= -30;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I[IIIZ)Leea;", line = 1972)
    public final class112 method2430(int arg0, int[] arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 > -112) {
            this.method1788(108);
        }
        ++field5605;
        return this.method1794(0, arg4, arg2, arg1, 0, arg3, 0);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(II[[I[[IIII)Lsa;", line = 1984)
    public final class174 method265(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5685;
        return new class325(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(BLft;)V", line = 1993)
    public final void method2431(byte arg0, class4 arg1) {
        ++field5664;
        this.field5770[this.field5750] = arg1;
        this.method2407(true);
        if (arg0 >= -63) {
            this.method2441(false, 68);
        }
    }

    @OriginalMember(owner = "client!bda", name = "m", descriptor = "(IFFFFF)V", line = 2005)
    public final void method1188(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field5601;
        boolean var7 = this.field5738 != arg0;
        if (var7 || this.field5746 != arg1 || this.field5702 != arg2) {
            this.field5738 = arg0;
            this.field5746 = arg1;
            this.field5702 = arg2;
            if (var7) {
                this.field5747 = (float) (this.field5738 & 16711680) / 1.671168E7F;
                this.field5790 = (float) (65280 & this.field5738) / 65280.0F;
                this.field5729 = (float) (this.field5738 & 255) / 255.0F;
                this.method1807(0);
            }
            this.field5506.setSunColour(this.field5747, this.field5790, this.field5729, arg1, arg2);
            this.method1824(28526);
        }
        if (this.field5756[0] != arg3 || this.field5756[1] != arg4 || this.field5756[2] != arg5) {
            this.field5756[2] = arg5;
            this.field5756[1] = arg4;
            this.field5756[0] = arg3;
            this.field5780[1] = -arg4;
            this.field5780[0] = -arg3;
            this.field5780[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field5745[2] = arg5 * var8;
            this.field5745[1] = arg4 * var8;
            this.field5745[0] = arg3 * var8;
            this.field5786[2] = -this.field5745[2];
            this.field5786[1] = -this.field5745[1];
            this.field5786[0] = -this.field5745[0];
            this.field5506.setSunDirection(this.field5745[0], this.field5745[1], this.field5745[2]);
            this.method1841(-93);
            this.field5727 = (int) (arg3 * 256.0F / arg4);
            this.field5760 = (int) (arg5 * 256.0F / arg4);
        }
        this.method1828((byte) -123);
    }

    @OriginalMember(owner = "client!bda", name = "h", descriptor = "(Z)V", line = 2061)
    public final void method2432(boolean arg0) {
        ++field5523;
        Hashtable var2 = new Hashtable();
        if (this.field5566 != null && !this.field5566.isEmpty()) {
            Enumeration var3 = this.field5566.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method1818(var4, 125));
            }
        }
        this.field5566 = var2;
        this.method2468(arg0);
        this.method2467(12);
        this.field5744.method3647(this, arg0);
    }

    @OriginalMember(owner = "client!bda", name = "u", descriptor = "(I)V", line = 2092)
    public final void method2433(int arg0) {
        this.field5687.method656();
        if (arg0 == 22880) {
            ++field5625;
            this.field5690 = true;
            this.method2455(false);
        }
    }

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "(II)V", line = 2106)
    public final void method2434(int arg0, int arg1) {
        ++field5615;
        if (this.field5734 != arg1) {
            this.field5734 = arg1;
            this.method1832(52);
        }
        int var3 = -35 % ((67 - arg0) / 43);
    }

    @OriginalMember(owner = "client!bda", name = "k", descriptor = "()Z", line = 2125)
    public final boolean method271() {
        ++field5577;
        return true;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "([Lr;Lka;Lm;[Lcf;I)V", line = 2134)
    public final void method270(class157[] arg0, class400 arg1, class163 arg2, class517[] arg3, int arg4) {
        ++field5588;
        this.method273(arg0, arg2, arg3, arg4);
        this.method1140(arg1);
    }

    @OriginalMember(owner = "client!bda", name = "o", descriptor = "()V", line = 2147)
    public final void method1137() {
        this.field5759.method750(true);
        ++field5515;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IILbg;)V", line = 2157)
    public final void method2435(int arg0, int arg1, class393 arg2) {
        if (arg1 >= 20) {
            this.method1798(false, false, arg0, 6, arg2);
            ++field5663;
        }
    }

    @OriginalMember(owner = "client!bda", name = "v", descriptor = "(I)V", line = 2168)
    public final void method2436(int arg0) {
        if (arg0 >= -73) {
            this.field5689 = 116;
        }
        ++field5609;
        if (~this.field5731 != -17) {
            this.method2410(-8);
            this.method2424(0, true);
            this.method2441(true, 128);
            this.method2478((byte) 82, true);
            this.method2405(1, -18001);
            this.field5731 = 16;
        }
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)V", line = 2189)
    public final void method272(int arg0) {
        ++field5575;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "(II)V", line = 2203)
    public final void method2437(int arg0, int arg1) {
        if (arg0 != 1) {
            if (~arg0 != -1) {
                if (~arg0 == -3) {
                    this.method2429(class2.field7, class529.field7403, arg1 + 20);
                } else if (arg0 == 3) {
                    this.method2429(class564.field8287, class402.field5281, 47);
                } else if (arg0 == 4) {
                    this.method2429(class66.field643, class66.field643, arg1 + 74);
                }
            } else {
                this.method2429(class564.field8287, class564.field8287, arg1 ^ -98);
            }
        } else {
            this.method2429(class2.field7, class2.field7, 110);
        }
        ++field5519;
        if (arg1 != -3) {
            this.field5709 = null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "n", descriptor = "()V", line = 2233)
    public final void method1182() {
        ++field5648;
        if (this.field5820) {
            this.field5820 = false;
            this.method1836(-1);
            this.method2458(0);
        }
        this.field5761 = 0;
        this.field5762 = this.field5564;
        this.field5725 = 0;
        this.field5707 = this.field5512;
    }

    @OriginalMember(owner = "client!bda", name = "i", descriptor = "(Z)V", line = 2252)
    public static final void method2438(boolean arg0) {
        ++field5576;
        class35.method200(10, 2);
        class434.method2510((byte) -2);
        if (arg0) {
            System.gc();
        }
    }

    @OriginalMember(owner = "client!bda", name = "t", descriptor = "()Z", line = 2265)
    public final boolean method1155() {
        ++field5667;
        return true;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IZZB)V", line = 2274)
    public final void method2439(int arg0, boolean arg1, boolean arg2, byte arg3) {
        if (arg3 < 113) {
            this.method1806((byte) -122);
        }
        if (this.field5732 != arg0) {
            if (~arg0 > -1) {
                this.method2447(true);
                this.method2459(81, (class440) null);
                this.method2437(0, -3);
                if (!this.field5705) {
                    this.method2462(arg2, 0, 0, 0, 0, arg1);
                }
            } else {
                class112 var5 = this.field5759.method749((byte) 46, arg0);
                class217 var6 = super.field2481.method119(-120, arg0);
                if (var6.field2651 == 0 && var6.field2660 == 0) {
                    this.method2447(true);
                } else {
                    int var7 = var6.field2642 ? 64 : 128;
                    int var8 = var7 * 50;
                    class335 var9 = this.method2479((byte) 102);
                    var9.method1886((float) (this.field5779 % var8 * var6.field2660) / (float) var8, (float) (this.field5779 % var8 * var6.field2651) / (float) var8, 0.0F, (byte) 96);
                    this.method2431((byte) -115, class187.field2256);
                }
                if (!this.field5705) {
                    this.method2462(arg2, var6.field2657, 0, var6.field2648, var6.field2643, arg1);
                }
                if (this.field5737 != null) {
                    this.field5737.method446(var6.field2658, var5, 26440);
                } else {
                    this.method2459(65, var5);
                    this.method2437(var6.field2658, -3);
                }
            }
            this.field5732 = arg0;
        }
        ++field5569;
        this.field5731 &= -8;
    }

    @OriginalMember(owner = "client!bda", name = "w", descriptor = "(I)V", line = 2343)
    private final void method2440(int arg0) {
        ++field5528;
        if (arg0 == 0) {
            if (class537.field7555 != this.field5728) {
                class597 var2 = this.field5728;
                this.field5728 = class537.field7555;
                if (!var2.method3455((byte) 77)) {
                    this.method2406(arg0);
                }
                this.method2414(arg0 ^ 14);
                this.field5769 = this.field5777;
                this.method2482(38);
                this.field5731 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "B", descriptor = "()Z", line = 2368)
    public final boolean method1190() {
        ++field5654;
        return this.field5776[3].method452(58);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lei;IIII)Lr;", line = 2376)
    public final class157 method277(class152 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5571;
        return new class643(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(ZI)V", line = 2385)
    public final void method2441(boolean arg0, int arg1) {
        if (arg1 != 128) {
            this.field5697 = 81;
        }
        if (arg0 == !this.field5706) {
            this.field5706 = arg0;
            this.method1804((byte) -8);
            this.field5731 &= -32;
        }
        ++field5526;
    }

    @OriginalMember(owner = "client!bda", name = "g", descriptor = "(I)Lu;", line = 2402)
    public final class64 method1191(int arg0) {
        ++field5594;
        class396 var2 = new class396(arg0);
        this.field5522.method1040(var2, -115);
        return var2;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(FFFIFFF)Z", line = 2417)
    private final boolean method2442(float arg0, float arg1, float arg2, int arg3, float arg4, float arg5, float arg6) {
        if (arg3 > -89) {
            return false;
        } else {
            ++field5545;
            Buffer var8 = this.field5814.method440(-101, true);
            if (var8 == null) {
                return false;
            } else {
                Stream var9 = this.method2426(var8, (byte) 11);
                if (Stream.method3340()) {
                    var9.method3348(arg5);
                    var9.method3348(arg2);
                    var9.method3348(arg6);
                    var9.method3348(arg0);
                    var9.method3348(arg1);
                    var9.method3348(arg4);
                } else {
                    var9.method3344(arg5);
                    var9.method3344(arg2);
                    var9.method3344(arg6);
                    var9.method3344(arg0);
                    var9.method3344(arg1);
                    var9.method3344(arg4);
                }
                var9.method3342();
                return this.field5814.method442(76);
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "L", descriptor = "(I)V", line = 2457)
    public final void method1121(int arg0) {
        this.field5699 = 0;
        ++field5657;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field5699;
        }
        this.field5713 = 1 << this.field5699;
    }

    @OriginalMember(owner = "client!bda", name = "y", descriptor = "(I)V", line = 2474)
    public final void method2443(int arg0) {
        ++field5652;
        if (this.field5731 != arg0) {
            this.method2486(-25);
            this.method2424(arg0 + -4, false);
            this.method2452(false, (byte) -94);
            this.method2441(false, 128);
            this.method2478((byte) -55, false);
            this.method2439(-2, false, false, (byte) 114);
            this.method2405(1, -18001);
            this.method2437(0, -3);
            this.field5731 = 4;
        }
    }

    @OriginalMember(owner = "client!bda", name = "z", descriptor = "(I)I", line = 2494)
    public final int method2444(int arg0) {
        ++field5684;
        if (arg0 != 30505) {
            this.field5792 = 1.5006821F;
        }
        return this.field5750;
    }

    @OriginalMember(owner = "client!bda", name = "A", descriptor = "(I)V", line = 2506)
    private final void method2445(int arg0) {
        if (arg0 != -13620) {
            this.field5789 = null;
        }
        this.field5719 = (float) this.field5701 + -this.field5743;
        ++field5599;
    }

    @OriginalMember(owner = "client!bda", name = "B", descriptor = "(I)V", line = 2520)
    public static void method2446(int arg0) {
        if (arg0 == -10594) {
            field5563 = null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "j", descriptor = "(Z)V", line = 2531)
    public final void method2447(boolean arg0) {
        if (arg0) {
            ++field5592;
            if (this.field5770[this.field5750] != class514.field7260) {
                this.field5770[this.field5750] = class514.field7260;
                this.field5789[this.field5750].method656();
                this.method2407(true);
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "P", descriptor = "()F", line = 2548)
    public final float method1167() {
        ++field5623;
        return this.field5784;
    }

    @OriginalMember(owner = "client!bda", name = "N", descriptor = "(IIII)V", line = 2563)
    public final void method1107(int arg0, int arg1, int arg2, int arg3) {
        this.field5761 = ~arg0 > -1 ? 0 : arg0;
        ++field5529;
        this.field5762 = ~this.field5512 <= ~arg3 ? arg3 : 0;
        this.field5725 = arg1 >= 0 ? arg1 : 0;
        this.field5707 = ~this.field5512 <= ~arg2 ? arg2 : 0;
        if (~this.field5761 >= -1 && this.field5512 <= this.field5707 && this.field5725 <= 0 && this.field5762 >= this.field5564) {
            this.method1182();
        } else {
            if (!this.field5820) {
                this.field5820 = true;
                this.method1836(-1);
            }
            this.method1821(-20);
            this.method2458(0);
        }
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(ZI)V", line = 2590)
    public final void method2448(boolean arg0, int arg1) {
        ++field5597;
        if (this.field5721 != arg0) {
            this.field5721 = arg0;
            this.method1828((byte) 86);
        }
        if (arg1 != -11051) {
            this.method1837((class116) null, 103);
        }
    }

    @OriginalMember(owner = "client!bda", name = "D", descriptor = "(I)V", line = 2607)
    private final void method2449(int arg0) {
        this.method1807(0);
        if (arg0 != 12427) {
            this.method1133(97, -38, 92, 77, 26, 117);
        }
        ++field5662;
        this.method1824(arg0 ^ 24549);
        this.method1803(arg0 + -12427);
        this.method1786(31090);
        this.method1841(109);
        this.method1828((byte) 125);
        this.method1825(arg0 ^ 12426);
        this.method1804((byte) -8);
        this.method1815((byte) 109);
        this.method1788(7);
        this.method1796(false);
        this.method1830(arg0 ^ 12494);
        this.method1793(1);
        this.method1812(arg0 + 3741);
        for (int var2 = this.field5768 - 1; var2 >= 0; --var2) {
            this.method2472(true, var2);
            this.method1838(-1);
            this.method1806((byte) -100);
            this.method2447(true);
        }
        this.method1832(46);
        this.method1831((byte) 101);
        this.method1820(arg0 ^ 12497);
        this.method1835(-37);
        this.method1797((byte) 76);
    }

    @OriginalMember(owner = "client!bda", name = "E", descriptor = "(I)Lsg;", line = 2651)
    public final class335 method2450(int arg0) {
        ++field5643;
        if (arg0 != 1) {
            this.method2422(-37);
        }
        return this.field5694;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZIZ)Ljaclib/memory/heap/NativeHeapBuffer;", line = 2662)
    public final NativeHeapBuffer method2451(boolean arg0, int arg1, boolean arg2) {
        ++field5637;
        if (!arg2) {
            this.method1820(118);
        }
        return this.field5558.method3336(arg1, arg0);
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(ZB)V", line = 2676)
    public final void method2452(boolean arg0, byte arg1) {
        if (arg1 != -94) {
            this.method2436(-104);
        }
        ++field5674;
        if (this.field5763 == !arg0) {
            this.field5763 = arg0;
            this.method1803(0);
            this.field5731 &= -8;
        }
    }

    @OriginalMember(owner = "client!bda", name = "u", descriptor = "()V", line = 2694)
    public void method1158() {
        ++field5591;
        if (!this.field5749) {
            for (class544 var1 = this.field5522.method1050((byte) 73); var1 != null; var1 = this.field5522.method1047(-7962)) {
                ((class396) var1).method2281((byte) 4);
            }
            Enumeration var2 = this.field5566.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method1814(this.field5566.get(var3), var3, -114);
            }
            class475.method2774(true, false, -1);
            this.field5506.release();
            this.field5749 = true;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILsg;)V", line = 2728)
    public final void method2453(int arg0, class335 arg1) {
        ++field5544;
        if (arg0 != 15) {
            this.field5562 = null;
        }
        this.field5687.method676(arg1);
        this.field5690 = false;
        this.method2455(false);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILg;Z[FII)Leea;", line = 2742)
    public final class112 method2454(int arg0, class135 arg1, boolean arg2, float[] arg3, int arg4, int arg5) {
        if (arg0 != 1) {
            this.method1137();
        }
        ++field5626;
        return this.method1819(arg3, 0, arg5, arg2, 0, arg4, arg1, (byte) -108);
    }

    @OriginalMember(owner = "client!bda", name = "h", descriptor = "()I", line = 2753)
    public final int method1122() {
        ++field5514;
        return this.field5778 + -2;
    }

    @OriginalMember(owner = "client!bda", name = "k", descriptor = "(Z)V", line = 2766)
    private final void method2455(boolean arg0) {
        ++field5537;
        if (class318.field4056 == this.field5728) {
            float var2 = this.method1844(-10259);
            this.field5687.method1881((byte) 3, var2, 0.0F, var2);
        }
        this.field5785 = arg0;
        this.method1835(-54);
        if (this.field5737 != null) {
            this.field5737.method635(true);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I[Lcba;)V", line = 2786)
    public final void method1193(int arg0, class469[] arg1) {
        ++field5650;
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field5740[var3] = arg1[var3];
        }
        this.field5733 = arg0;
        if (this.field5728.method3455((byte) 77)) {
            this.method1786(31090);
        }
    }

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "([I)V", line = 2804)
    public final void method1183(int[] arg0) {
        arg0[2] = this.field5707;
        ++field5608;
        arg0[3] = this.field5762;
        arg0[1] = this.field5725;
        arg0[0] = this.field5761;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(BZ)V", line = 2815)
    public final void method2456(byte arg0, boolean arg1) {
        if (arg0 < 90) {
            this.field5778 = 13;
        }
        ++field5574;
        if (!arg1 != !this.field5720) {
            this.field5720 = arg1;
            this.method1803(0);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIIIII)V", line = 2834)
    public final void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5554;
    }

    @OriginalMember(owner = "client!bda", name = "l", descriptor = "(B)V", line = 2841)
    public final void method2457(byte arg0) {
        ++field5589;
        this.field5690 = false;
        int var2 = -33 % ((arg0 - 50) / 45);
        this.method2455(false);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lu;)V", line = 2859)
    public final void method1176(class64 arg0) {
        ++field5590;
        this.field5558 = ((class396) arg0).field5225;
        this.field5677 = this.field5558.method3336(32768, false);
    }

    @OriginalMember(owner = "client!bda", name = "G", descriptor = "(I)V", line = 2870)
    public void method1786(int arg0) {
        this.field5741 = this.field5733;
        ++field5507;
        this.field5733 = 0;
        if (arg0 != 31090) {
            this.method1804((byte) 53);
        }
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(IIII)V", line = 2883)
    public final void method1179(int arg0, int arg1, int arg2, int arg3) {
        ++field5505;
        this.field5781 = arg1;
        this.field5795 = arg2;
        this.field5724 = arg3;
        this.field5735 = arg0;
        this.method2418((byte) -58);
        this.method2413((byte) 7);
        this.method2483(9588);
        this.method2458(0);
    }

    @OriginalMember(owner = "client!bda", name = "A", descriptor = "()Z", line = 2898)
    public final boolean method1174() {
        ++field5541;
        return false;
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(IIIIZ)Lha;", line = 2906)
    public final class52 method1161(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5527;
        class358 var6 = new class358(this, arg2, arg3, arg4);
        var6.method4(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "(IIIIII)V", line = 2919)
    public final void method1133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2408(true);
        ++field5504;
        this.method2434(-70, arg4);
        this.method2435(0, 73, class264.field3445);
        this.method2465(class264.field3445, -14787, 0);
        this.method2405(arg5, -18001);
        this.field5687.method1878((float) arg3, (byte) -57, 1.0F, (float) arg2);
        this.field5687.method655(arg0, arg1, 0);
        this.method2455(false);
        this.method1834(false, 21492);
        this.method2427((byte) -127);
        this.method1834(true, 21492);
        this.method2465(class289.field3751, -14787, 0);
        this.method2435(0, 34, class289.field3751);
    }

    @OriginalMember(owner = "client!bda", name = "F", descriptor = "(IIII)V", line = 2943)
    public final void method1119(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < this.field5707) {
            this.field5707 = arg2;
        }
        if (arg1 > this.field5725) {
            this.field5725 = arg1;
        }
        ++field5607;
        if (~arg3 > ~this.field5762) {
            this.field5762 = arg3;
        }
        if (~this.field5761 > ~arg0) {
            this.field5761 = arg0;
        }
        if (~this.field5761 >= -1 && this.field5512 <= this.field5707 && ~this.field5725 >= -1 && ~this.field5762 <= ~this.field5564) {
            this.method1182();
        } else {
            if (!this.field5820) {
                this.field5820 = true;
                this.method1836(-1);
            }
            this.method1821(-35);
            this.method2458(0);
        }
    }

    @OriginalMember(owner = "client!bda", name = "K", descriptor = "(I)V", line = 2986)
    private final void method2458(int arg0) {
        ++field5531;
        if (arg0 != 0) {
            this.method1137();
        }
        this.field5797 = (float) (this.field5761 - this.field5735);
        this.field5704 = (float) (-this.field5781 + this.field5762);
        this.field5748 = (float) (-this.field5735 + this.field5707);
        this.field5710 = (float) (-this.field5781 + this.field5725);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILhv;)V", line = 3006)
    public final void method2459(int arg0, class440 arg1) {
        if (this.field5758[this.field5750] != arg1) {
            this.field5758[this.field5750] = arg1;
            if (arg1 == null) {
                this.method1808(0);
            } else {
                arg1.method1274((byte) 57);
            }
            this.field5731 &= -2;
        }
        if (arg0 >= 59) {
            ++field5573;
        }
    }

    @OriginalMember(owner = "client!bda", name = "p", descriptor = "()Z", line = 3028)
    public final boolean method1141() {
        ++field5671;
        return true;
    }

    @OriginalMember(owner = "client!bda", name = "m", descriptor = "()Z", line = 3043)
    public final boolean method1135() {
        ++field5666;
        return true;
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(II)I", line = 3051)
    public final int method1145(int arg0, int arg1) {
        ++field5640;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!bda", name = "G", descriptor = "(ILpa;II)V", line = 3060)
    public final void method1180(int arg0, class309 arg1, int arg2, int arg3) {
        ++field5633;
        class204 var5 = (class204) arg1;
        class112 var6 = var5.field2441;
        this.method2416((byte) -109);
        this.method2459(80, var6);
        this.method2405(1, -18001);
        this.method2429(class2.field7, class2.field7, 111);
        this.method2435(0, 62, class264.field3445);
        this.method2434(120, arg0);
        this.field5687.method1878((float) this.field5564, (byte) -108, 0.0F, (float) this.field5512);
        this.method2455(false);
        this.field5789[0].method1878(var6.method646((float) this.field5564, false), (byte) -99, 1.0F, var6.method652((byte) -127, (float) this.field5512));
        this.field5789[0].method1881((byte) 3, var6.method652((byte) -128, (float) (-arg2)), 0.0F, var6.method646((float) (-arg3), false));
        this.field5770[0] = class187.field2256;
        this.method2407(true);
        this.method2427((byte) -83);
        this.method2447(true);
        this.method2435(0, 42, class289.field3751);
    }

    @OriginalMember(owner = "client!bda", name = "P", descriptor = "(I)I", line = 3088)
    public final int method2460(int arg0) {
        ++field5553;
        if (arg0 >= -34) {
            this.field5764 = null;
        }
        return this.field5755;
    }

    @OriginalMember(owner = "client!bda", name = "M", descriptor = "(F)V", line = 3103)
    public final void method1165(float arg0) {
        ++field5559;
        if (this.field5774 != arg0) {
            this.field5774 = arg0;
            this.field5506.setAmbient(arg0);
            this.method1807(0);
            this.method1828((byte) -54);
        }
    }

    @OriginalMember(owner = "client!bda", name = "n", descriptor = "(B)V", line = 3120)
    public final void method2461(byte arg0) {
        ++field5661;
        this.method2483(9588);
        this.method2482(-126);
        int var2 = -14 % ((41 - arg0) / 52);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZIIIIZ)V", line = 3134)
    private final void method2462(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = arg5 & this.method1190();
        ++field5645;
        if (!var7 && (arg1 == 4 || arg1 == 8 || ~arg1 == -10)) {
            arg1 = 2;
            arg4 = ~arg1 == -5 ? 1 & arg3 : 1;
            arg3 = 0;
        }
        if (~arg1 != -1 && arg0) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (arg2 == 0) {
            if (this.field5798 != arg1) {
                if (this.field5798 != 0) {
                    this.field5776[this.field5798 & Integer.MAX_VALUE].method448(false);
                }
                if (arg1 == 0) {
                    this.field5737 = null;
                } else {
                    this.field5737 = this.field5776[Integer.MAX_VALUE & arg1];
                    this.field5737.method454((byte) 21, arg0);
                    this.field5737.method449(arg2 ^ 256, arg0);
                    this.field5737.method455(0, arg3, arg4);
                }
                this.field5765 = arg3;
                this.field5712 = arg4;
                this.field5798 = arg1;
            } else if (this.field5798 != 0) {
                this.field5776[Integer.MAX_VALUE & this.field5798].method449(256, arg0);
                if (~this.field5765 != ~arg3 || ~this.field5712 != ~arg4) {
                    this.field5776[this.field5798 & Integer.MAX_VALUE].method455(0, arg3, arg4);
                    this.field5765 = arg3;
                    this.field5712 = arg4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IILsc;)V", line = 3190)
    private final void method2463(int arg0, int arg1, class290 arg2) {
        if (arg0 != -12157) {
            this.method2469(false);
        }
        ++field5555;
        this.method1837(this.field5812, 9);
        this.method1792(this.field5808, 0, (byte) 89);
        this.method1791(arg2, arg1, 2, 0);
    }

    @OriginalMember(owner = "client!bda", name = "B", descriptor = "(IIIIII)Z", line = 3204)
    public final boolean method1102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5556;
        float var7 = this.field5692.method1871((float) arg2, (float) arg0, (float) arg1, -1);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field5692.method1871((float) arg5, (float) arg3, (float) arg4, -1);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field5782 > var7) || !((float) this.field5782 > var8)) && (!((float) this.field5701 < var7) || !((float) this.field5701 < var8))) {
            int var9 = (int) ((float) this.field5795 * this.field5692.method1880((float) arg2, (float) arg1, 0, (float) arg0) / var7);
            int var10 = (int) ((float) this.field5795 * this.field5692.method1880((float) arg5, (float) arg4, 0, (float) arg3) / var8);
            if ((float) var9 < this.field5797 && (float) var10 < this.field5797 || this.field5748 < (float) var9 && (float) var10 > this.field5748) {
                return false;
            } else {
                int var11 = (int) ((float) this.field5724 * this.field5692.method1877((float) arg1, (float) arg0, (float) arg2, (byte) -78) / var7);
                int var12 = (int) ((float) this.field5724 * this.field5692.method1877((float) arg4, (float) arg3, (float) arg5, (byte) -118) / var8);
                return (!(this.field5710 > (float) var11) || !(this.field5710 > (float) var12)) && (!(this.field5704 < (float) var11) || !((float) var12 > this.field5704));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bda", name = "ra", descriptor = "()F", line = 3247)
    public final float method1186() {
        ++field5578;
        return this.field5743;
    }

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "(I)V", line = 3255)
    public final void method275(int arg0) {
        ++field5525;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "([FB)[F", line = 3262)
    public final float[] method2464(float[] arg0, byte arg1) {
        arg0[8] = this.field5769[2];
        arg0[0] = this.field5769[0];
        arg0[4] = this.field5769[1];
        arg0[12] = this.field5769[3];
        ++field5542;
        arg0[13] = this.field5769[7];
        arg0[5] = this.field5769[5];
        arg0[9] = this.field5769[6];
        arg0[1] = this.field5769[4];
        arg0[2] = this.field5769[8];
        arg0[3] = this.field5769[12];
        arg0[14] = this.field5769[11];
        arg0[6] = this.field5769[9];
        arg0[10] = this.field5769[10];
        arg0[7] = this.field5769[13];
        arg0[11] = this.field5769[14];
        arg0[15] = this.field5769[15];
        int var3 = -17 % ((62 - arg1) / 63);
        return arg0;
    }

    @OriginalMember(owner = "client!bda", name = "j", descriptor = "()Lm;", line = 3291)
    public final class163 method1126() {
        ++field5611;
        return this.field5811;
    }

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "()Z", line = 3300)
    public final boolean method1105() {
        ++field5570;
        return false;
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(IIIIII)V", line = 3310)
    public final void method1142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5628;
        float var7 = this.method1844(-10259);
        this.method2408(true);
        this.method2434(-14, arg4);
        this.method2435(0, 73, class264.field3445);
        this.method2465(class264.field3445, -14787, 0);
        this.method2405(arg5, -18001);
        this.field5687.method1878((float) (arg3 - 1), (byte) -52, 1.0F, (float) (arg2 + -1));
        this.field5687.method1881((byte) 3, (float) arg0 - var7, 0.0F, (float) arg1 + -var7);
        this.method2455(false);
        this.method1834(false, 21492);
        this.method2463(-12157, 4, class480.field6743);
        this.method1834(true, 21492);
        this.method2465(class289.field3751, -14787, 0);
        this.method2435(0, 86, class289.field3751);
    }

    @OriginalMember(owner = "client!bda", name = "q", descriptor = "(IIII)V", line = 3333)
    public final void method1164(int arg0, int arg1, int arg2, int arg3) {
        this.field5703 = arg3;
        this.field5793 = arg0;
        this.field5705 = true;
        this.field5755 = arg2;
        ++field5610;
        this.field5708 = arg1;
        this.method2462(false, 3, 0, 0, 0, false);
        if (this.field5737 != null) {
            this.field5737.method2833(125);
        }
        this.method2480((byte) -19);
        this.method1788(7);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "([Lr;Lm;[Lcf;I)V", line = 3354)
    public final void method273(class157[] arg0, class163 arg1, class517[] arg2, int arg3) {
        ++field5579;
        for (int var5 = 0; ~arg0.length < ~var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method69(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lbg;II)V", line = 3376)
    public final void method2465(class393 arg0, int arg1, int arg2) {
        this.method1802(arg0, 0, false, arg2);
        ++field5587;
        if (arg1 != -14787) {
            this.method1797((byte) 20);
        }
    }

    @OriginalMember(owner = "client!bda", name = "Q", descriptor = "(I)Lsg;", line = 3387)
    public final class335 method2466(int arg0) {
        ++field5675;
        return arg0 != 0 ? null : this.field5789[this.field5750];
    }

    @OriginalMember(owner = "client!bda", name = "R", descriptor = "(I)V", line = 3398)
    private final void method2467(int arg0) {
        ++field5524;
        this.field5814 = this.method1823(arg0 + 105, true);
        this.field5814.method444(false, 24, arg0);
        this.field5806 = this.method1833(new class297[] { new class297(class44.field361) }, 0);
    }

    @OriginalMember(owner = "client!bda", name = "m", descriptor = "(Z)V", line = 3411)
    private final void method2468(boolean arg0) {
        this.field5808 = this.method1823(117, arg0);
        ++field5636;
        this.field5808.method444(arg0, 140, 28);
        for (int var2 = 0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field5808.method440(-113, true);
            if (var3 != null) {
                Stream var4 = this.method2426(var3, (byte) 11);
                if (Stream.method3340()) {
                    var4.method3348(0.0F);
                    var4.method3348(0.0F);
                    var4.method3348(0.0F);
                    var4.method3348(0.0F);
                    var4.method3348(0.0F);
                    var4.method3348(0.0F);
                    var4.method3348(0.0F);
                    var4.method3348(0.0F);
                    var4.method3348(1.0F);
                    var4.method3348(0.0F);
                    var4.method3348(0.0F);
                    var4.method3348(1.0F);
                    var4.method3348(0.0F);
                    var4.method3348(1.0F);
                    var4.method3348(1.0F);
                    var4.method3348(1.0F);
                    var4.method3348(0.0F);
                    var4.method3348(1.0F);
                    var4.method3348(1.0F);
                    var4.method3348(1.0F);
                    var4.method3348(1.0F);
                    var4.method3348(1.0F);
                    var4.method3348(0.0F);
                    var4.method3348(0.0F);
                    var4.method3348(1.0F);
                    var4.method3348(0.0F);
                    var4.method3348(1.0F);
                    var4.method3348(0.0F);
                    var4.method3348(0.0F);
                    var4.method3348(0.0F);
                    var4.method3348(0.0F);
                    var4.method3348(0.0F);
                    var4.method3348(0.0F);
                    var4.method3348(0.0F);
                    var4.method3348(0.0F);
                } else {
                    var4.method3344(0.0F);
                    var4.method3344(0.0F);
                    var4.method3344(0.0F);
                    var4.method3344(0.0F);
                    var4.method3344(0.0F);
                    var4.method3344(0.0F);
                    var4.method3344(0.0F);
                    var4.method3344(0.0F);
                    var4.method3344(1.0F);
                    var4.method3344(0.0F);
                    var4.method3344(0.0F);
                    var4.method3344(1.0F);
                    var4.method3344(0.0F);
                    var4.method3344(1.0F);
                    var4.method3344(1.0F);
                    var4.method3344(1.0F);
                    var4.method3344(0.0F);
                    var4.method3344(1.0F);
                    var4.method3344(1.0F);
                    var4.method3344(1.0F);
                    var4.method3344(1.0F);
                    var4.method3344(1.0F);
                    var4.method3344(0.0F);
                    var4.method3344(0.0F);
                    var4.method3344(1.0F);
                    var4.method3344(0.0F);
                    var4.method3344(1.0F);
                    var4.method3344(0.0F);
                    var4.method3344(0.0F);
                    var4.method3344(0.0F);
                    var4.method3344(0.0F);
                    var4.method3344(0.0F);
                    var4.method3344(0.0F);
                    var4.method3344(0.0F);
                    var4.method3344(0.0F);
                }
                var4.method3342();
                if (this.field5808.method442(78)) {
                    break;
                }
            }
        }
        this.field5812 = this.method1833(new class297[] { new class297(new class44[] { class44.field361, class44.field367, class44.field367 }) }, 0);
    }

    @OriginalMember(owner = "client!bda", name = "s", descriptor = "()Lm;", line = 3526)
    public final class163 method1150() {
        ++field5583;
        return new class335();
    }

    @OriginalMember(owner = "client!bda", name = "n", descriptor = "(Z)I", line = 3534)
    public final int method2469(boolean arg0) {
        if (arg0) {
            this.field5730 = true;
        }
        ++field5620;
        return this.field5703;
    }

    @OriginalMember(owner = "client!bda", name = "o", descriptor = "(B)Lsg;", line = 3547)
    public final class335 method2470(byte arg0) {
        ++field5627;
        if (arg0 != -89) {
            this.method2468(true);
        }
        return this.field5695;
    }

    @OriginalMember(owner = "client!bda", name = "p", descriptor = "(B)Lsg;", line = 3559)
    public final class335 method2471(byte arg0) {
        if (arg0 < 114) {
            this.field5543 = null;
        }
        ++field5660;
        return this.field5687;
    }

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "(ZI)V", line = 3572)
    public final void method2472(boolean arg0, int arg1) {
        if (!arg0) {
            this.method1841(-53);
        }
        if (~this.field5750 != ~arg1) {
            this.field5750 = arg1;
            this.method1829(16);
        }
        ++field5572;
    }

    @OriginalMember(owner = "client!bda", name = "xa", descriptor = "()V", line = 3589)
    public final void method1146() {
        this.field5705 = false;
        ++field5676;
        this.method2462(false, 0, 0, 0, 0, false);
        this.method2480((byte) -19);
        this.method1788(7);
    }

    @OriginalMember(owner = "client!bda", name = "U", descriptor = "(I)V", line = 3600)
    public final void method2473(int arg0) {
        this.field5758 = new class440[this.field5768];
        this.field5789 = new class335[this.field5768];
        ++field5508;
        this.field5764 = new class520[this.field5768];
        this.field5770 = new class4[this.field5768];
        int var2 = -90 / ((41 - arg0) / 55);
        this.field5742 = new class520[this.field5768];
        for (int var3 = 0; ~this.field5768 < ~var3; ++var3) {
            this.field5742[var3] = class564.field8287;
            this.field5764[var3] = class564.field8287;
            this.field5770[var3] = class514.field7260;
            this.field5789[var3] = new class335();
        }
        this.field5740 = new class469[this.field5778 + -2];
        this.field5794 = this.method1839(1, 1, class10.field80, true, class160.field1932);
        this.method1176(new class396(262144));
        this.field5805 = this.method1833(new class297[] { new class297(new class44[] { class44.field361, class44.field367 }) }, 0);
        this.field5802 = this.method1833(new class297[] { new class297(new class44[] { class44.field361, class44.field365 }) }, 0);
        this.field5818 = this.method1833(new class297[] { new class297(class44.field361), new class297(class44.field365), new class297(class44.field367), new class297(class44.field364) }, 0);
        this.field5815 = this.method1833(new class297[] { new class297(class44.field361), new class297(class44.field365), new class297(class44.field367) }, 0);
        this.field5809 = new class643(this, 0, 0, false, false);
        this.field5813 = new class643(this, 0, 0, true, true);
        this.field5807 = new class643(this, 0, 0, false, false);
        this.field5799 = new class643(this, 0, 0, true, true);
        this.field5810 = new class643(this, 0, 0, false, false);
        this.field5801 = new class643(this, 0, 0, true, true);
        this.field5817 = new class643(this, 0, 0, false, false);
        this.field5816 = new class643(this, 0, 0, true, true);
        this.field5804 = new class643(this, 0, 0, false, false);
        this.field5800 = new class643(this, 0, 0, true, true);
        this.field5744 = new class634(this);
        this.field5803 = this.method1795(true, (byte) -99);
        this.method2432(false);
        this.field5562 = new class468(this);
        this.field5776[1] = this.method1843((byte) 117, 1);
        this.field5776[2] = this.method1843((byte) 10, 2);
        this.field5776[4] = this.method1843((byte) 122, 4);
        this.field5776[5] = this.method1843((byte) 116, 5);
        this.field5776[6] = this.method1843((byte) 109, 6);
        this.field5776[7] = this.method1843((byte) -76, 7);
        this.field5776[3] = this.method1843((byte) 126, 3);
        this.field5776[8] = this.method1843((byte) -119, 8);
        this.field5776[9] = this.method1843((byte) 9, 9);
        if (!this.field5776[2].method452(79)) {
            this.field5776[2] = this.method1843((byte) -95, 0);
        }
        if (!this.field5776[4].method452(105)) {
            this.field5776[4] = this.field5776[2];
        }
        if (!this.field5776[8].method452(92)) {
            this.field5776[8] = this.field5776[4];
        }
        if (!this.field5776[9].method452(117)) {
            this.field5776[9] = this.field5776[8];
        }
        this.method1809(0);
        this.method1182();
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(BF)V", line = 3676)
    public final void method2474(byte arg0, float arg1) {
        if (arg0 == 116) {
            ++field5606;
            if (this.field5775 != arg1) {
                this.field5775 = arg1;
                this.method2418((byte) -58);
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "A", descriptor = "(IIIII)V", line = 3696)
    public final void method1124(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5624;
    }

    @OriginalMember(owner = "client!bda", name = "W", descriptor = "(I)V", line = 3707)
    private final void method2475(int arg0) {
        ++field5641;
        this.method1837(this.field5806, arg0 ^ 7);
        this.method1792(this.field5814, 0, (byte) 89);
        this.method1791(class420.field5440, 1, 2, 0);
        if (arg0 != 14) {
            method2438(true);
        }
    }

    @OriginalMember(owner = "client!bda", name = "q", descriptor = "(B)I", line = 3720)
    public final int method2476(byte arg0) {
        ++field5629;
        if (arg0 < 11) {
            this.method1112(16, -102, 123, (int[]) null);
        }
        return this.field5793;
    }

    @OriginalMember(owner = "client!bda", name = "ba", descriptor = "()I", line = 3732)
    public final int method1147() {
        ++field5681;
        return this.field5819;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Z)V", line = 3740)
    public final void method1116(boolean arg0) {
        ++field5581;
    }

    @OriginalMember(owner = "client!bda", name = "ta", descriptor = "(II)V", line = 3747)
    public final void method1184(int arg0, int arg1) {
        ++field5658;
        if (this.field5782 != arg0 || ~this.field5701 != ~arg1) {
            this.field5701 = arg1;
            this.field5782 = arg0;
            this.method2413((byte) 7);
            this.method2418((byte) -58);
            this.method2480((byte) -19);
        }
    }

    @OriginalMember(owner = "client!bda", name = "JA", descriptor = "(IIII)V", line = 3772)
    public final void method1159(int arg0, int arg1, int arg2, int arg3) {
        ++field5630;
        if (!this.field5705) {
            throw new RuntimeException("");
        } else {
            if (this.field5793 != arg0) {
                this.field5793 = arg0;
                if (this.field5737 != null) {
                    this.field5737.method2833(127);
                }
            }
            this.field5755 = arg2;
            this.field5703 = arg3;
            this.field5708 = arg1;
            this.method2480((byte) -19);
        }
    }

    @OriginalMember(owner = "client!bda", name = "U", descriptor = "()I", line = 3795)
    public final int method1127() {
        ++field5540;
        return this.field5689 - (-this.field5686 - this.field5691);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I[BIZLg;I)Leea;", line = 3805)
    public final class112 method2477(int arg0, byte[] arg1, int arg2, boolean arg3, class135 arg4, int arg5) {
        ++field5516;
        if (arg2 != 0) {
            this.field5698 = 0.59036505F;
        }
        return this.method1827(arg0, 0, arg1, arg3, arg5, arg4, -114, 0);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIIIF)Lcba;", line = 3816)
    public final class469 method1134(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field5509;
        return new class87(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(BZ)V", line = 3824)
    public final void method2478(byte arg0, boolean arg1) {
        if (!arg1 != !this.field5791) {
            this.field5791 = arg1;
            this.method1815((byte) 126);
            this.field5731 &= -32;
        }
        int var3 = -98 / (arg0 / 33);
        ++field5655;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 3840)
    public final void method268(Canvas arg0) {
        ++field5551;
        Object var2 = null;
        if (arg0 != null && this.field5612 != arg0) {
            if (this.field5566.containsKey(arg0)) {
                var2 = this.field5566.get(arg0);
            }
        } else {
            var2 = this.field5521;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method1813(113, var2, arg0);
            if (this.field5543 == arg0) {
                this.method2423((byte) -63);
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "la", descriptor = "(FF)V", line = 3868)
    public final void method1106(float arg0, float arg1) {
        ++field5560;
        if (this.field5784 != arg0 || this.field5743 != arg1) {
            this.field5784 = arg0;
            this.field5743 = arg1;
            this.method2445(-13620);
            this.method2484(-1);
            this.method2418((byte) -58);
            this.method2413((byte) 7);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V", line = 3889)
    public void method1138(int arg0) {
        this.field5759.method753(-128);
        ++field5644;
        this.field5779 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "()I", line = 3898)
    public final int method1175() {
        ++field5567;
        return this.field5782;
    }

    @OriginalMember(owner = "client!bda", name = "r", descriptor = "(B)Lsg;", line = 3912)
    public final class335 method2479(byte arg0) {
        ++field5552;
        int var2 = 68 % ((44 - arg0) / 40);
        return this.field5789[this.field5750];
    }

    @OriginalMember(owner = "client!bda", name = "s", descriptor = "(B)V", line = 3923)
    private final void method2480(byte arg0) {
        ++field5539;
        if (this.field5737 != null) {
            this.field5737.method636(256);
        }
        this.method1796(false);
        if (arg0 != -19) {
            this.field5725 = 96;
        }
    }

    @OriginalMember(owner = "client!bda", name = "Y", descriptor = "(I)Llm;", line = 3950)
    public final class423 method2481(int arg0) {
        ++field5600;
        if (arg0 != 31107) {
            this.method2415((byte) -119, (byte) 114);
        }
        return this.field5736 == null ? null : this.field5736.method3044(arg0 ^ -31213);
    }

    @OriginalMember(owner = "client!bda", name = "ab", descriptor = "(I)V", line = 3961)
    private final void method2482(int arg0) {
        this.method1820(118);
        ++field5517;
        int var2 = -110 % ((-25 - arg0) / 47);
        if (this.field5737 != null) {
            this.field5737.method634(72);
        }
    }

    @OriginalMember(owner = "client!bda", name = "bb", descriptor = "(I)V", line = 3977)
    public final void method2483(int arg0) {
        ++field5659;
        if (class191.field2301 != this.field5728) {
            class597 var2 = this.field5728;
            this.field5728 = class191.field2301;
            if (var2.method3455((byte) 77)) {
                this.method2406(0);
            }
            this.field5731 &= -32;
            this.field5769 = this.field5767;
        }
        if (arg0 != 9588) {
            this.field5766 = 76;
        }
    }

    @OriginalMember(owner = "client!bda", name = "db", descriptor = "(I)V", line = 4007)
    private final void method2484(int arg0) {
        if (arg0 != -1) {
            this.field5737 = null;
        }
        ++field5549;
        if (this.field5743 == 0.0F) {
            this.field5777[14] = this.field5700;
            this.field5777[10] = this.field5715;
        } else {
            float var2 = this.field5784 / (this.field5784 + this.field5743);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field5700 * (1.0F - var2) / this.field5743;
            this.field5777[10] = this.field5715 + var4;
            this.field5777[14] = this.field5700 * var3;
        }
        this.field5792 = (this.field5777[14] + (float) (-this.field5701)) / this.field5777[10];
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lpq;Ljava/lang/Object;I)V", line = 4037)
    public static final void method2485(class165 arg0, Object arg1, int arg2) {
        ++field5647;
        if (arg0.field2009 != null) {
            int var3 = -25 % ((arg2 - 27) / 42);
            for (int var4 = 0; ~var4 > -51 && arg0.field2009.peekEvent() != null; ++var4) {
                class462.method2688(1L, (byte) 110);
            }
            if (arg1 != null) {
                arg0.field2009.postEvent(new ActionEvent(arg1, 1001, "dummy"));
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "eb", descriptor = "(I)V", line = 4060)
    private final void method2486(int arg0) {
        if (class318.field4056 != this.field5728) {
            class597 var2 = this.field5728;
            this.field5728 = class318.field4056;
            if (var2.method3455((byte) 77)) {
                this.method2406(0);
            }
            this.method2412(0);
            this.field5769 = this.field5753;
            this.method2482(60);
            this.field5731 &= -25;
        }
        if (arg0 == -25) {
            ++field5598;
        }
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(B)V")
    public abstract void method1811(byte arg0);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZB)Liaa;")
    public abstract class419 method1795(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!bda", name = "i", descriptor = "(I)V")
    public abstract void method1830(int arg0);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(BI)V")
    public abstract void method1810(byte arg0, int arg1);

    @OriginalMember(owner = "client!bda", name = "j", descriptor = "(I)V")
    public abstract void method1832(int arg0);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public abstract Object method1818(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(BLg;Lvp;)Z")
    public abstract boolean method1845(byte arg0, class135 arg1, class160 arg2);

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "(B)V")
    public abstract void method1831(byte arg0);

    @OriginalMember(owner = "client!bda", name = "p", descriptor = "(I)V")
    public abstract void method1788(int arg0);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(BLbk;)V")
    public abstract void method1826(byte arg0, class314 arg1);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IZ)Lrq;")
    public abstract class293 method1823(int arg0, boolean arg1);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lrq;IB)V")
    public abstract void method1792(class293 arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!bda", name = "r", descriptor = "(I)V")
    public abstract void method1825(int arg0);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;I)V")
    public abstract void method1814(Object arg0, Canvas arg1, int arg2);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "([Ljp;I)Lvr;")
    public abstract class116 method1833(class297[] arg0, int arg1);

    @OriginalMember(owner = "client!bda", name = "t", descriptor = "(I)V")
    public abstract void method1808(int arg0);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lvr;I)V")
    public abstract void method1837(class116 arg0, int arg1);

    @OriginalMember(owner = "client!bda", name = "j", descriptor = "(B)V")
    public abstract void method1806(byte arg0);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method1813(int arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!bda", name = "x", descriptor = "(I)V")
    public abstract void method1820(int arg0);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIILsc;Liaa;II)V")
    public abstract void method1801(int arg0, int arg1, int arg2, class290 arg3, class419 arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!bda", name = "C", descriptor = "(I)V")
    public abstract void method1836(int arg0);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IILg;ZLvp;)Leea;")
    public abstract class112 method1839(int arg0, int arg1, class135 arg2, boolean arg3, class160 arg4);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lbg;IZI)V")
    public abstract void method1802(class393 arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!bda", name = "k", descriptor = "(B)V")
    public abstract void method1797(byte arg0);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lg;III[BZ)Law;")
    public abstract class65 method1790(class135 arg0, int arg1, int arg2, int arg3, byte[] arg4, boolean arg5);

    @OriginalMember(owner = "client!bda", name = "F", descriptor = "(I)V")
    public abstract void method1812(int arg0);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILvp;Lg;)Z")
    public abstract boolean method1805(int arg0, class160 arg1, class135 arg2);

    @OriginalMember(owner = "client!bda", name = "m", descriptor = "(B)V")
    public abstract void method1804(byte arg0);

    @OriginalMember(owner = "client!bda", name = "l", descriptor = "(Z)V")
    public abstract void method1796(boolean arg0);

    @OriginalMember(owner = "client!bda", name = "I", descriptor = "(I)V")
    public abstract void method1841(int arg0);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
    public abstract void method1816(Object arg0, byte arg1, Canvas arg2);

    @OriginalMember(owner = "client!bda", name = "J", descriptor = "(I)F")
    public abstract float method1844(int arg0);

    @OriginalMember(owner = "client!bda", name = "M", descriptor = "(I)V")
    public abstract void method1829(int arg0);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "([FIIZIILg;B)Leea;")
    public abstract class112 method1819(float[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class135 arg6, byte arg7);

    @OriginalMember(owner = "client!bda", name = "N", descriptor = "(I)V")
    public abstract void method1835(int arg0);

    @OriginalMember(owner = "client!bda", name = "O", descriptor = "(I)V")
    public abstract void method1807(int arg0);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lsc;III)V")
    public abstract void method1791(class290 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IZI[IIII)Leea;")
    public abstract class112 method1794(int arg0, boolean arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "(ZI)V")
    public abstract void method1834(boolean arg0, int arg1);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZI[[IZ)Llm;")
    public abstract class423 method1789(boolean arg0, int arg1, int[][] arg2, boolean arg3);

    @OriginalMember(owner = "client!bda", name = "S", descriptor = "(I)V")
    public abstract void method1838(int arg0);

    @OriginalMember(owner = "client!bda", name = "T", descriptor = "(I)V")
    public abstract void method1803(int arg0);

    @OriginalMember(owner = "client!bda", name = "V", descriptor = "(I)V")
    public abstract void method1793(int arg0);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(II[BZILg;II)Leea;")
    public abstract class112 method1827(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4, class135 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!bda", name = "X", descriptor = "(I)V")
    public abstract void method1824(int arg0);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZZIILbg;)V")
    public abstract void method1798(boolean arg0, boolean arg1, int arg2, int arg3, class393 arg4);

    @OriginalMember(owner = "client!bda", name = "t", descriptor = "(B)V")
    public abstract void method1828(byte arg0);

    @OriginalMember(owner = "client!bda", name = "cb", descriptor = "(I)V")
    public abstract void method1821(int arg0);

    @OriginalMember(owner = "client!bda", name = "u", descriptor = "(B)V")
    public abstract void method1815(byte arg0);
}
