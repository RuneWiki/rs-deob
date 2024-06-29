import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeHeap;
import jaggl.memory.NativeStream;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class33 extends class167 {

    @OriginalMember(owner = "client!bt", name = "mb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field463 = new Hashtable();

    @OriginalMember(owner = "client!bt", name = "ae", descriptor = "I")
    public int field607 = 128;

    @OriginalMember(owner = "client!bt", name = "ge", descriptor = "Lld;")
    private class117 field613 = new class117();

    @OriginalMember(owner = "client!bt", name = "ke", descriptor = "Lfl;")
    private class530 field617 = new class530();

    @OriginalMember(owner = "client!bt", name = "le", descriptor = "Lfl;")
    public class530 field618 = new class530();

    @OriginalMember(owner = "client!bt", name = "ne", descriptor = "Z")
    private boolean field620 = false;

    @OriginalMember(owner = "client!bt", name = "pe", descriptor = "I")
    public int field622 = 3;

    @OriginalMember(owner = "client!bt", name = "re", descriptor = "I")
    public int field624 = 8;

    @OriginalMember(owner = "client!bt", name = "oe", descriptor = "Lgw;")
    private class118 field621 = new class118();

    @OriginalMember(owner = "client!bt", name = "ve", descriptor = "I")
    private int field628 = -1;

    @OriginalMember(owner = "client!bt", name = "xe", descriptor = "I")
    private int field630 = -1;

    @OriginalMember(owner = "client!bt", name = "te", descriptor = "I")
    private int field626 = -1;

    @OriginalMember(owner = "client!bt", name = "ze", descriptor = "[Lwr;")
    private class324[] field632 = new class324[4];

    @OriginalMember(owner = "client!bt", name = "ye", descriptor = "[Lwr;")
    private class324[] field631 = new class324[4];

    @OriginalMember(owner = "client!bt", name = "Ae", descriptor = "[Lwr;")
    private class324[] field633 = new class324[4];

    @OriginalMember(owner = "client!bt", name = "Ce", descriptor = "Lgw;")
    private class118 field635;

    @OriginalMember(owner = "client!bt", name = "Fe", descriptor = "Lgw;")
    private class118 field638;

    @OriginalMember(owner = "client!bt", name = "Ge", descriptor = "Lgw;")
    private class118 field639;

    @OriginalMember(owner = "client!bt", name = "He", descriptor = "Lgw;")
    private class118 field640;

    @OriginalMember(owner = "client!bt", name = "Ie", descriptor = "Lgw;")
    private class118 field641;

    @OriginalMember(owner = "client!bt", name = "Je", descriptor = "Lgw;")
    private class118 field642;

    @OriginalMember(owner = "client!bt", name = "Ke", descriptor = "Lgw;")
    private class118 field643;

    @OriginalMember(owner = "client!bt", name = "Me", descriptor = "F")
    private float field645;

    @OriginalMember(owner = "client!bt", name = "kf", descriptor = "F")
    public float field668;

    @OriginalMember(owner = "client!bt", name = "af", descriptor = "F")
    private float field659;

    @OriginalMember(owner = "client!bt", name = "cf", descriptor = "F")
    public float field661;

    @OriginalMember(owner = "client!bt", name = "Ne", descriptor = "F")
    public float field646;

    @OriginalMember(owner = "client!bt", name = "Gf", descriptor = "F")
    public float field690;

    @OriginalMember(owner = "client!bt", name = "rf", descriptor = "[F")
    public float[] field675;

    @OriginalMember(owner = "client!bt", name = "Ff", descriptor = "[F")
    private float[] field689;

    @OriginalMember(owner = "client!bt", name = "nf", descriptor = "I")
    private int field671;

    @OriginalMember(owner = "client!bt", name = "bg", descriptor = "F")
    public float field711;

    @OriginalMember(owner = "client!bt", name = "hg", descriptor = "[F")
    private float[] field717;

    @OriginalMember(owner = "client!bt", name = "Se", descriptor = "I")
    private int field651;

    @OriginalMember(owner = "client!bt", name = "Ef", descriptor = "I")
    private int field688;

    @OriginalMember(owner = "client!bt", name = "vf", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "client!bt", name = "ng", descriptor = "I")
    private int field723;

    @OriginalMember(owner = "client!bt", name = "pf", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "client!bt", name = "Eg", descriptor = "[F")
    private float[] field740;

    @OriginalMember(owner = "client!bt", name = "Wf", descriptor = "I")
    private int field706;

    @OriginalMember(owner = "client!bt", name = "xg", descriptor = "I")
    private int field733;

    @OriginalMember(owner = "client!bt", name = "Mg", descriptor = "I")
    public int field748;

    @OriginalMember(owner = "client!bt", name = "zf", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "client!bt", name = "rg", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "client!bt", name = "Kg", descriptor = "[Lni;")
    private class369[] field746;

    @OriginalMember(owner = "client!bt", name = "Fg", descriptor = "I")
    public int field741;

    @OriginalMember(owner = "client!bt", name = "ag", descriptor = "I")
    private int field710;

    @OriginalMember(owner = "client!bt", name = "Cg", descriptor = "F")
    public float field738;

    @OriginalMember(owner = "client!bt", name = "hf", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "client!bt", name = "We", descriptor = "I")
    private int field655;

    @OriginalMember(owner = "client!bt", name = "eg", descriptor = "I")
    public int field714;

    @OriginalMember(owner = "client!bt", name = "Mf", descriptor = "F")
    private float field696;

    @OriginalMember(owner = "client!bt", name = "Ig", descriptor = "I")
    public int field744;

    @OriginalMember(owner = "client!bt", name = "Xg", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "client!bt", name = "Gg", descriptor = "I")
    private int field742;

    @OriginalMember(owner = "client!bt", name = "Pg", descriptor = "F")
    public float field751;

    @OriginalMember(owner = "client!bt", name = "Bg", descriptor = "F")
    public float field737;

    @OriginalMember(owner = "client!bt", name = "Rg", descriptor = "[F")
    private float[] field753;

    @OriginalMember(owner = "client!bt", name = "ig", descriptor = "I")
    public int field718;

    @OriginalMember(owner = "client!bt", name = "Tg", descriptor = "I")
    private int field755;

    @OriginalMember(owner = "client!bt", name = "Zg", descriptor = "Z")
    private boolean field761;

    @OriginalMember(owner = "client!bt", name = "jg", descriptor = "Low;")
    public class235 field719;

    @OriginalMember(owner = "client!bt", name = "bh", descriptor = "[B")
    public byte[] field763;

    @OriginalMember(owner = "client!bt", name = "ch", descriptor = "[I")
    public int[] field764;

    @OriginalMember(owner = "client!bt", name = "dh", descriptor = "[I")
    public int[] field765;

    @OriginalMember(owner = "client!bt", name = "eh", descriptor = "[I")
    public int[] field766;

    @OriginalMember(owner = "client!bt", name = "nb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field464;

    @OriginalMember(owner = "client!bt", name = "Ab", descriptor = "Ljava/awt/Canvas;")
    private Canvas field477;

    @OriginalMember(owner = "client!bt", name = "Zd", descriptor = "I")
    public int field606;

    @OriginalMember(owner = "client!bt", name = "hb", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field458;

    @OriginalMember(owner = "client!bt", name = "Td", descriptor = "J")
    private long field600;

    @OriginalMember(owner = "client!bt", name = "oc", descriptor = "J")
    private long field517;

    @OriginalMember(owner = "client!bt", name = "dg", descriptor = "Z")
    public boolean field713;

    @OriginalMember(owner = "client!bt", name = "Zf", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "client!bt", name = "Oe", descriptor = "Ljava/lang/String;")
    private String field647;

    @OriginalMember(owner = "client!bt", name = "Vg", descriptor = "Z")
    public boolean field757;

    @OriginalMember(owner = "client!bt", name = "of", descriptor = "Z")
    private boolean field672;

    @OriginalMember(owner = "client!bt", name = "If", descriptor = "Z")
    public boolean field692;

    @OriginalMember(owner = "client!bt", name = "gf", descriptor = "Z")
    public boolean field665;

    @OriginalMember(owner = "client!bt", name = "Xe", descriptor = "Z")
    public boolean field656;

    @OriginalMember(owner = "client!bt", name = "gg", descriptor = "Z")
    private boolean field716;

    @OriginalMember(owner = "client!bt", name = "zg", descriptor = "Ljava/lang/String;")
    private String field735;

    @OriginalMember(owner = "client!bt", name = "Wg", descriptor = "Z")
    public boolean field758;

    @OriginalMember(owner = "client!bt", name = "Bf", descriptor = "Z")
    private boolean field685;

    @OriginalMember(owner = "client!bt", name = "ce", descriptor = "Llg;")
    public class291 field609;

    @OriginalMember(owner = "client!bt", name = "me", descriptor = "Lli;")
    public class302 field619;

    @OriginalMember(owner = "client!bt", name = "be", descriptor = "Lih;")
    private class503 field608;

    @OriginalMember(owner = "client!bt", name = "he", descriptor = "Lrf;")
    private class59 field614;

    @OriginalMember(owner = "client!bt", name = "ie", descriptor = "Lsb;")
    private class196 field615;

    @OriginalMember(owner = "client!bt", name = "sf", descriptor = "F")
    public float field676;

    @OriginalMember(owner = "client!bt", name = "tf", descriptor = "F")
    public float field677;

    @OriginalMember(owner = "client!bt", name = "uf", descriptor = "F")
    private float field678;

    @OriginalMember(owner = "client!bt", name = "Df", descriptor = "F")
    private float field687;

    @OriginalMember(owner = "client!bt", name = "Jf", descriptor = "F")
    private float field693;

    @OriginalMember(owner = "client!bt", name = "Pf", descriptor = "F")
    public float field699;

    @OriginalMember(owner = "client!bt", name = "Sf", descriptor = "F")
    public float field702;

    @OriginalMember(owner = "client!bt", name = "Vf", descriptor = "F")
    public float field705;

    @OriginalMember(owner = "client!bt", name = "Yf", descriptor = "F")
    public float field708;

    @OriginalMember(owner = "client!bt", name = "kg", descriptor = "F")
    public float field720;

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!bt", name = "u", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!bt", name = "v", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!bt", name = "w", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!bt", name = "x", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!bt", name = "y", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!bt", name = "z", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!bt", name = "A", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!bt", name = "B", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!bt", name = "C", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!bt", name = "D", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!bt", name = "E", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!bt", name = "F", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!bt", name = "G", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!bt", name = "H", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!bt", name = "I", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!bt", name = "J", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!bt", name = "K", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!bt", name = "L", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!bt", name = "M", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!bt", name = "N", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!bt", name = "O", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!bt", name = "P", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!bt", name = "Q", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!bt", name = "R", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!bt", name = "S", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!bt", name = "T", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!bt", name = "U", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!bt", name = "V", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!bt", name = "W", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!bt", name = "X", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!bt", name = "Y", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!bt", name = "Z", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!bt", name = "ab", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!bt", name = "bb", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!bt", name = "cb", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!bt", name = "db", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!bt", name = "eb", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!bt", name = "fb", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!bt", name = "gb", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!bt", name = "ib", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!bt", name = "jb", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!bt", name = "kb", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!bt", name = "lb", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!bt", name = "ob", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!bt", name = "pb", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!bt", name = "qb", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!bt", name = "rb", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!bt", name = "sb", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!bt", name = "tb", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!bt", name = "ub", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!bt", name = "vb", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!bt", name = "wb", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!bt", name = "xb", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!bt", name = "yb", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!bt", name = "zb", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!bt", name = "Bb", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!bt", name = "Cb", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!bt", name = "Db", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!bt", name = "Eb", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!bt", name = "Fb", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!bt", name = "Gb", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!bt", name = "Hb", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!bt", name = "Ib", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!bt", name = "Jb", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!bt", name = "Kb", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!bt", name = "Lb", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!bt", name = "Mb", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!bt", name = "Nb", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!bt", name = "Ob", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!bt", name = "Pb", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!bt", name = "Qb", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!bt", name = "Rb", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!bt", name = "Sb", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!bt", name = "Tb", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!bt", name = "Ub", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!bt", name = "Vb", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!bt", name = "Wb", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!bt", name = "Xb", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!bt", name = "Yb", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client!bt", name = "Zb", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!bt", name = "ac", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!bt", name = "bc", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!bt", name = "cc", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!bt", name = "dc", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!bt", name = "ec", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!bt", name = "fc", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!bt", name = "gc", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!bt", name = "hc", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!bt", name = "ic", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!bt", name = "jc", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!bt", name = "kc", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!bt", name = "lc", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!bt", name = "mc", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!bt", name = "nc", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!bt", name = "pc", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!bt", name = "qc", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!bt", name = "rc", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!bt", name = "sc", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!bt", name = "tc", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!bt", name = "uc", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!bt", name = "vc", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!bt", name = "wc", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!bt", name = "xc", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!bt", name = "yc", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!bt", name = "zc", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!bt", name = "Ac", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!bt", name = "Bc", descriptor = "I")
    public int field530;

    @OriginalMember(owner = "client!bt", name = "Cc", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!bt", name = "Dc", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!bt", name = "Ec", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!bt", name = "Fc", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!bt", name = "Gc", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!bt", name = "Hc", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!bt", name = "Ic", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!bt", name = "Jc", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!bt", name = "Kc", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!bt", name = "Lc", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!bt", name = "Mc", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!bt", name = "Nc", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!bt", name = "Oc", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!bt", name = "Pc", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!bt", name = "Qc", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!bt", name = "Rc", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!bt", name = "Sc", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!bt", name = "Tc", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!bt", name = "Uc", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!bt", name = "Vc", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!bt", name = "Wc", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!bt", name = "Xc", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!bt", name = "Yc", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!bt", name = "Zc", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!bt", name = "ad", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!bt", name = "bd", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!bt", name = "cd", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!bt", name = "dd", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!bt", name = "ed", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!bt", name = "fd", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!bt", name = "gd", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!bt", name = "hd", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!bt", name = "id", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!bt", name = "jd", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!bt", name = "kd", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!bt", name = "ld", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!bt", name = "md", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!bt", name = "nd", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!bt", name = "od", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!bt", name = "pd", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!bt", name = "qd", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!bt", name = "rd", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!bt", name = "sd", descriptor = "I")
    public int field573;

    @OriginalMember(owner = "client!bt", name = "td", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!bt", name = "ud", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!bt", name = "vd", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!bt", name = "wd", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!bt", name = "xd", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!bt", name = "yd", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!bt", name = "zd", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!bt", name = "Ad", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!bt", name = "Bd", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!bt", name = "Cd", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!bt", name = "Dd", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!bt", name = "Ed", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!bt", name = "Fd", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!bt", name = "Gd", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!bt", name = "Hd", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!bt", name = "Id", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!bt", name = "Jd", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!bt", name = "Kd", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!bt", name = "Ld", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!bt", name = "Md", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!bt", name = "Nd", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!bt", name = "Od", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!bt", name = "Pd", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!bt", name = "Qd", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!bt", name = "Rd", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!bt", name = "Sd", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!bt", name = "Ud", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!bt", name = "Vd", descriptor = "I")
    private int field602;

    @OriginalMember(owner = "client!bt", name = "Wd", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!bt", name = "Xd", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!bt", name = "Yd", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!bt", name = "de", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!bt", name = "ee", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!bt", name = "fe", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!bt", name = "je", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!bt", name = "se", descriptor = "I")
    public int field625;

    @OriginalMember(owner = "client!bt", name = "Be", descriptor = "I")
    private int field634;

    @OriginalMember(owner = "client!bt", name = "De", descriptor = "I")
    public int field636;

    @OriginalMember(owner = "client!bt", name = "Ee", descriptor = "I")
    public int field637;

    @OriginalMember(owner = "client!bt", name = "Re", descriptor = "I")
    private int field650;

    @OriginalMember(owner = "client!bt", name = "ef", descriptor = "I")
    private int field663;

    @OriginalMember(owner = "client!bt", name = "qf", descriptor = "I")
    private int field674;

    @OriginalMember(owner = "client!bt", name = "Cf", descriptor = "I")
    private int field686;

    @OriginalMember(owner = "client!bt", name = "Qf", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "client!bt", name = "Uf", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "client!bt", name = "Xf", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "client!bt", name = "fg", descriptor = "I")
    private int field715;

    @OriginalMember(owner = "client!bt", name = "ug", descriptor = "I")
    private int field730;

    @OriginalMember(owner = "client!bt", name = "Lg", descriptor = "I")
    private int field747;

    @OriginalMember(owner = "client!bt", name = "Og", descriptor = "I")
    private int field750;

    @OriginalMember(owner = "client!bt", name = "Qg", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "client!bt", name = "Sg", descriptor = "I")
    private int field754;

    @OriginalMember(owner = "client!bt", name = "Ug", descriptor = "I")
    private int field756;

    @OriginalMember(owner = "client!bt", name = "Yg", descriptor = "I")
    private int field760;

    @OriginalMember(owner = "client!bt", name = "ah", descriptor = "I")
    private int field762;

    @OriginalMember(owner = "client!bt", name = "fh", descriptor = "I")
    private int field767;

    @OriginalMember(owner = "client!bt", name = "Nf", descriptor = "J")
    private long field697;

    @OriginalMember(owner = "client!bt", name = "ff", descriptor = "Ljd;")
    public class157 field664;

    @OriginalMember(owner = "client!bt", name = "Tf", descriptor = "Ljd;")
    public class157 field703;

    @OriginalMember(owner = "client!bt", name = "yf", descriptor = "Luk;")
    public class176 field682;

    @OriginalMember(owner = "client!bt", name = "Hf", descriptor = "Lus;")
    private class1 field691;

    @OriginalMember(owner = "client!bt", name = "yg", descriptor = "Lus;")
    private class1 field734;

    @OriginalMember(owner = "client!bt", name = "Hg", descriptor = "Lvn;")
    private class209 field743;

    @OriginalMember(owner = "client!bt", name = "df", descriptor = "Lhf;")
    private class277 field662;

    @OriginalMember(owner = "client!bt", name = "Ze", descriptor = "Lnn;")
    public class292 field658;

    @OriginalMember(owner = "client!bt", name = "ue", descriptor = "Lwr;")
    private class324 field627;

    @OriginalMember(owner = "client!bt", name = "we", descriptor = "Lwr;")
    private class324 field629;

    @OriginalMember(owner = "client!bt", name = "Le", descriptor = "Lvs;")
    public class426 field644;

    @OriginalMember(owner = "client!bt", name = "Ye", descriptor = "Lvs;")
    public class426 field657;

    @OriginalMember(owner = "client!bt", name = "bf", descriptor = "Lvs;")
    public class426 field660;

    @OriginalMember(owner = "client!bt", name = "wf", descriptor = "Lvs;")
    public class426 field680;

    @OriginalMember(owner = "client!bt", name = "Af", descriptor = "Lvs;")
    public class426 field684;

    @OriginalMember(owner = "client!bt", name = "Of", descriptor = "Lvs;")
    public class426 field698;

    @OriginalMember(owner = "client!bt", name = "pg", descriptor = "Lvs;")
    public class426 field725;

    @OriginalMember(owner = "client!bt", name = "wg", descriptor = "Lvs;")
    public class426 field732;

    @OriginalMember(owner = "client!bt", name = "Dg", descriptor = "Lvs;")
    public class426 field739;

    @OriginalMember(owner = "client!bt", name = "Ng", descriptor = "Lvs;")
    public class426 field749;

    @OriginalMember(owner = "client!bt", name = "Ve", descriptor = "Lfl;")
    public class530 field654;

    @OriginalMember(owner = "client!bt", name = "Ag", descriptor = "Lfl;")
    public class530 field736;

    @OriginalMember(owner = "client!bt", name = "vg", descriptor = "Lco;")
    private class78 field731;

    @OriginalMember(owner = "client!bt", name = "qe", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field623;

    @OriginalMember(owner = "client!bt", name = "Pe", descriptor = "Z")
    public boolean field648;

    @OriginalMember(owner = "client!bt", name = "Qe", descriptor = "Z")
    public boolean field649;

    @OriginalMember(owner = "client!bt", name = "Te", descriptor = "Z")
    public boolean field652;

    @OriginalMember(owner = "client!bt", name = "Ue", descriptor = "Z")
    public boolean field653;

    @OriginalMember(owner = "client!bt", name = "jf", descriptor = "Z")
    private boolean field667;

    @OriginalMember(owner = "client!bt", name = "lf", descriptor = "Z")
    private boolean field669;

    @OriginalMember(owner = "client!bt", name = "mf", descriptor = "Z")
    private boolean field670;

    @OriginalMember(owner = "client!bt", name = "xf", descriptor = "Z")
    public boolean field681;

    @OriginalMember(owner = "client!bt", name = "Kf", descriptor = "Z")
    private boolean field694;

    @OriginalMember(owner = "client!bt", name = "Lf", descriptor = "Z")
    private boolean field695;

    @OriginalMember(owner = "client!bt", name = "Rf", descriptor = "Z")
    private boolean field701;

    @OriginalMember(owner = "client!bt", name = "cg", descriptor = "Z")
    public boolean field712;

    @OriginalMember(owner = "client!bt", name = "lg", descriptor = "Z")
    public boolean field721;

    @OriginalMember(owner = "client!bt", name = "mg", descriptor = "Z")
    private boolean field722;

    @OriginalMember(owner = "client!bt", name = "og", descriptor = "Z")
    private boolean field724;

    @OriginalMember(owner = "client!bt", name = "qg", descriptor = "Z")
    private boolean field726;

    @OriginalMember(owner = "client!bt", name = "sg", descriptor = "Z")
    public boolean field728;

    @OriginalMember(owner = "client!bt", name = "Jg", descriptor = "Z")
    private boolean field745;

    @OriginalMember(owner = "client!bt", name = "tg", descriptor = "[Lei;")
    private class120[] field729;

    @OriginalMember(owner = "client!bt", name = "H", descriptor = "()V", line = 3)
    public final void method179() {
        ++field430;
        this.field742 = 0;
        this.field671 = 0;
        this.field710 = this.field530;
        this.field688 = this.field573;
        OpenGL.glDisable(3089);
        this.method309(false);
    }

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "(I)V", line = 18)
    public final void method180(int arg0) {
        if (arg0 == 515) {
            OpenGL.glPushMatrix();
            ++field475;
        }
    }

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "(I)V", line = 29)
    private final void method181(int arg0) {
        if (arg0 == -26676) {
            ++field522;
            float var2 = (float) (-this.field666) * this.field645 / (float) this.field727;
            float var3 = (float) (-this.field714) * this.field645 / (float) this.field741;
            float var4 = (float) (-this.field666 + this.field530) * this.field645 / (float) this.field727;
            float var5 = (float) (this.field573 - this.field714) * this.field645 / (float) this.field741;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (var2 != var4 && var3 != var5) {
                OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field748 + -this.field699), (double) ((float) this.field683 + -this.field699));
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!bt", name = "z", descriptor = "()Z", line = 55)
    public final boolean method182() {
        ++field571;
        return this.field615.method1325(false, 3);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BZ)V", line = 66)
    public final void method183(byte arg0, boolean arg1) {
        if (!this.field695 == arg1) {
            this.field695 = arg1;
            this.method352((byte) 44);
        }
        ++field465;
        if (arg0 > -95) {
            this.method345(60, 106, 122, 66);
        }
    }

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "()Z", line = 83)
    public final boolean method184() {
        ++field582;
        return false;
    }

    @OriginalMember(owner = "client!bt", name = "IA", descriptor = "(IIII)V", line = 91)
    public final void method185(int arg0, int arg1, int arg2, int arg3) {
        if (this.field688 > arg3) {
            this.field688 = arg3;
        }
        if (~this.field742 > ~arg0) {
            this.field742 = arg0;
        }
        if (~this.field710 < ~arg2) {
            this.field710 = arg2;
        }
        if (this.field671 < arg1) {
            this.field671 = arg1;
        }
        ++field445;
        OpenGL.glEnable(3089);
        this.method309(false);
        this.method257(0);
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)V", line = 124)
    private final void method186(byte arg0) {
        if (this.field730 != 3) {
            this.field730 = 3;
            this.method181(-26676);
            this.method341(3);
            this.field760 &= -8;
        }
        if (arg0 != -126) {
            this.method299((class200) null);
        }
        ++field479;
    }

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "()Z", line = 143)
    public final boolean method187() {
        ++field437;
        return false;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "([BIFFIFIFLgl;IIIF)V", line = 152)
    public static final void method188(byte[] arg0, int arg1, float arg2, float arg3, int arg4, float arg5, int arg6, float arg7, class434 arg8, int arg9, int arg10, int arg11, float arg12) {
        for (int var13 = arg10; var13 < arg9; ++var13) {
            class544.method3192(arg3, arg5, arg1, arg12, arg11, arg7, arg4, arg8, arg2, arg9, arg6, arg0, -13840, var13);
            arg1 += arg6 * arg11;
        }
        ++field603;
    }

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "()Z", line = 172)
    public final boolean method189() {
        ++field591;
        return true;
    }

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "(IIII)V", line = 180)
    public final void method190(int arg0, int arg1, int arg2, int arg3) {
        this.field721 = true;
        this.field700 = arg0;
        this.field755 = arg1;
        this.field759 = arg3;
        ++field481;
        this.field718 = arg2;
        this.field615.method1324(0, 2, 3, 0, false, false);
        this.field615.field2856.method50(86);
        this.method205(false);
        this.method258(0);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLwr;)V", line = 198)
    public final void method191(byte arg0, class324 arg1) {
        ++field467;
        if (arg0 < 35) {
            this.field746 = null;
        }
        if (~this.field630 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field630 >= 0) {
                this.field633[this.field630].method1879(-119);
            }
            this.field629 = this.field633[++this.field630] = arg1;
            this.field629.method1876(-1868);
        }
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)V", line = 224)
    public final void method192(int arg0) {
        this.method337((byte) -76);
        ++field442;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IZII[B)Lus;", line = 232)
    public final class1 method193(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4) {
        ++field581;
        if (arg0 != 267135248) {
            this.method279((class119) null, (class104[]) null, true);
        }
        return (class1) (!this.field672 || arg1 && !this.field716 ? new class171(this, arg2, arg4, arg3) : new class461(this, arg2, arg4, arg3, arg1));
    }

    @OriginalMember(owner = "client!bt", name = "la", descriptor = "(IFFFFF)V", line = 250)
    public final void method194(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field489;
        boolean var7 = ~this.field733 != ~arg0;
        if (var7 || this.field661 != arg1 || this.field737 != arg2) {
            this.field737 = arg2;
            this.field733 = arg0;
            this.field661 = arg1;
            if (var7) {
                this.field646 = (float) (16711680 & this.field733) / 1.671168E7F;
                this.field690 = (float) (255 & this.field733) / 255.0F;
                this.field668 = (float) (65280 & this.field733) / 65280.0F;
                this.method201(2);
            }
            this.method244((byte) -97);
        }
        if (this.field717[0] != arg3 || this.field717[1] != arg4 || this.field717[2] != arg5) {
            this.field717[2] = arg5;
            this.field717[0] = arg3;
            this.field717[1] = arg4;
            this.field753[1] = -arg4;
            this.field753[0] = -arg3;
            this.field753[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field675[1] = arg4 * var8;
            this.field675[0] = arg3 * var8;
            this.field675[2] = arg5 * var8;
            this.field689[1] = -this.field675[1];
            this.field689[2] = -this.field675[2];
            this.field689[0] = -this.field675[0];
            this.method260(-18);
            this.field704 = (int) (arg3 * 256.0F / arg4);
            this.field752 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(III)V", line = 306)
    public final void method195(int arg0, int arg1, int arg2) {
        if (arg1 > -36) {
            this.field634 = 4;
        }
        ++field565;
        this.field651 = arg2;
        this.field655 = arg0;
        this.method287((byte) 70);
        this.method257(0);
    }

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "(I)I", line = 320)
    private final int method196(int arg0) {
        ++field515;
        int var2 = 0;
        this.field735 = OpenGL.glGetString(7936).toLowerCase();
        this.field647 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field735.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (~this.field735.indexOf("brian paul") != 0 || ~this.field735.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class446.method2630(-1, var3.replace('.', ' '), ' ');
        if (var4.length < 2) {
            var2 |= 4;
        } else {
            try {
                int var5 = class292.method1880(74, var4[0]);
                int var6 = class292.method1880(66, var4[1]);
                this.field650 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (~this.field650 > -13) {
            var2 |= 2;
        }
        if (!this.field458.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field458.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field707 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field750 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        if (arg0 >= -75) {
            this.field764 = null;
        }
        this.field674 = var7[0];
        if (this.field707 < 2 || ~this.field750 > -3 || ~this.field674 > -3) {
            var2 |= 16;
        }
        this.field713 = NativeStream.method2649();
        this.field458.arePbuffersAvailable();
        this.field672 = this.field458.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field722 = this.field458.isExtensionAvailable("GL_ARB_multisample");
        this.field649 = this.field458.isExtensionAvailable("GL_ARB_vertex_program");
        this.field458.isExtensionAvailable("GL_ARB_fragment_program");
        this.field652 = this.field458.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field653 = this.field458.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field692 = this.field458.isExtensionAvailable("GL_EXT_texture3D");
        this.field665 = this.field458.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field648 = this.field458.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field757 = this.field458.isExtensionAvailable("GL_ARB_texture_float");
        this.field712 = false;
        this.field758 = this.field458.isExtensionAvailable("GL_EXT_framebuffer_object");
        this.field728 = this.field458.isExtensionAvailable("GL_EXT_framebuffer_blit");
        this.field681 = this.field458.isExtensionAvailable("GL_EXT_framebuffer_multisample");
        this.field694 = this.field681 & this.field728;
        return var2 == 0 ? 0 : var2;
    }

    @OriginalMember(owner = "client!bt", name = "na", descriptor = "()I", line = 405)
    public final int method197() {
        ++field537;
        return this.field748;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V", line = 413)
    public final void method198(int arg0) {
        ++field421;
        if (~arg0 <= -129 && arg0 <= 1024) {
            this.field607 = arg0;
            this.field609.method1863(false);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "(B)V", line = 426)
    private final void method199(byte arg0) {
        ++field541;
        if (~this.field730 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field530 > 0 && this.field573 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field530, (double) this.field573, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field760 &= -25;
            this.field730 = 1;
        }
        if (arg0 < 56) {
            this.method195(21, 123, 7);
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;ILul;)V", line = 452)
    public class33(int arg0, Canvas arg1, class16 arg2, int arg3, class411 arg4) {
        super(arg0, arg2);
        new class18();
        new class375(16);
        this.field635 = new class118();
        this.field638 = new class118();
        this.field639 = new class118();
        this.field640 = new class118();
        this.field641 = new class118();
        this.field642 = new class118();
        this.field643 = new class118();
        this.field645 = 1.0F;
        this.field668 = 1.0F;
        this.field659 = 1.0F;
        this.field661 = -1.0F;
        this.field646 = 1.0F;
        this.field690 = 1.0F;
        this.field675 = new float[4];
        this.field689 = new float[4];
        this.field671 = 0;
        this.field711 = 3584.0F;
        this.field717 = new float[4];
        this.field651 = 0;
        this.field688 = 0;
        this.field679 = 0;
        this.field723 = 8448;
        this.field673 = -1;
        this.field740 = new float[16];
        this.field706 = 8448;
        this.field733 = -1;
        this.field748 = 50;
        this.field683 = 3584;
        this.field727 = 512;
        this.field746 = new class369[class519.field7580];
        this.field741 = 512;
        this.field710 = 0;
        this.field738 = 3584.0F;
        this.field666 = 0;
        this.field655 = 0;
        this.field714 = 0;
        this.field696 = 0.0F;
        this.field744 = -1;
        this.field759 = 0;
        this.field742 = 0;
        this.field751 = 3000.0F;
        this.field737 = -1.0F;
        this.field753 = new float[4];
        this.field718 = -1;
        this.field755 = -1;
        this.field761 = true;
        this.field719 = new class235(8192);
        this.field763 = new byte[16384];
        this.field764 = new int[1];
        this.field765 = new int[1];
        this.field766 = new int[1];
        this.field477 = this.field464 = arg1;
        this.field606 = arg3;
        try {
            if (class369.field5333 == null || !class369.field5333) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class369.field5333 = Boolean.TRUE;
                } else {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (var6.startsWith("mac")) {
                            System.load(arg4.method2446("libjaggl.jnilib", 21).toString());
                        } else {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method2446("jaggl.dll", 21).toString());
                        }
                    } else {
                        System.load(arg4.method2446("libjaggl.so", 21).toString());
                    }
                    class369.field5333 = Boolean.TRUE;
                }
            }
            if (class369.field5333 != null && class369.field5333) {
                this.field458 = new OpenGL();
                this.field517 = this.field600 = this.field458.init(arg1, 8, 8, 8, 24, 0, this.field606);
                if (~this.field600 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method337((byte) -101);
                    int var7 = this.method196(-76);
                    if (~var7 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field709 = !this.field713 ? 5121 : 33639;
                        if (~this.field647.indexOf("radeon") != 0) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class446.method2630(-1, this.field647.replace('/', ' '), ' ');
                            for (int var12 = 0; ~var11.length < ~var12; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (~var13.length() < -1) {
                                        if (var13.charAt(0) == 'x' && var13.length() >= 3 && class238.method1577(var13.substring(1, 3), 10)) {
                                            var10 = true;
                                            var13 = var13.substring(1);
                                        }
                                        if (var13.equals("hd")) {
                                            var9 = true;
                                        } else {
                                            if (var13.startsWith("hd")) {
                                                var13 = var13.substring(2);
                                                var9 = true;
                                            }
                                            if (var13.length() >= 4 && class238.method1577(var13.substring(0, 4), 10)) {
                                                var8 = class292.method1880(124, var13.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var9 || var8 < 4000) {
                                this.field757 = false;
                            }
                            if (!var10 && !var9) {
                                if (var8 >= 7000 && var8 <= 7999) {
                                    this.field672 = false;
                                }
                                if (var8 >= 7000 && ~var8 >= -9251) {
                                    this.field692 = false;
                                }
                            }
                            this.field665 &= this.field458.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field656 = true;
                            this.field716 = this.field672;
                        }
                        if (this.field735.indexOf("intel") != -1) {
                            this.field758 = false;
                        }
                        this.field685 = !this.field735.equals("s3 graphics");
                        if (this.field672) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class89.method660(0, false, true);
                        this.field620 = true;
                        this.field609 = new class291(this, super.field2505);
                        this.method240(113);
                        this.field619 = new class302(this);
                        this.field608 = new class503(this);
                        if (this.field608.method2938(-114)) {
                            this.field614 = new class59(this);
                            if (!this.field614.method504((byte) 121)) {
                                this.field614.method507(false);
                                this.field614 = null;
                            }
                        }
                        this.field615 = new class196(this);
                        this.method216(2917);
                        this.method297(0);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field458.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (var15++ > 5) {
                                    throw new RuntimeException("");
                                }
                                class477.method2826(100L, 0);
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
            this.method300();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIB)V", line = 654)
    public final void method200(int arg0, int arg1, int arg2, byte arg3) {
        ++field568;
        OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
        OpenGL.glTexEnvi(8960, arg1 + 34200, arg2);
        int var5 = 78 / ((62 - arg3) / 48);
    }

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "(I)V", line = 665)
    private final void method201(int arg0) {
        class313.field4675[0] = this.field720 * this.field646;
        class313.field4675[3] = 1.0F;
        class313.field4675[1] = this.field720 * this.field668;
        class313.field4675[arg0] = this.field720 * this.field690;
        ++field611;
        OpenGL.glLightModelfv(2899, class313.field4675, 0);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(FB)V", line = 680)
    public final void method202(float arg0, byte arg1) {
        if (arg1 > -19) {
            this.field684 = null;
        }
        if (this.field645 != arg0) {
            this.field645 = arg0;
            if (this.field730 == 3) {
                this.method181(-26676);
            }
        }
        ++field509;
    }

    @OriginalMember(owner = "client!bt", name = "KA", descriptor = "(IIII)V", line = 699)
    public final void method203(int arg0, int arg1, int arg2, int arg3) {
        ++field548;
        if (!this.field721) {
            throw new RuntimeException("");
        } else {
            this.field755 = arg1;
            this.field759 = arg3;
            this.field700 = arg0;
            this.field718 = arg2;
            this.field615.field2856.method50(95);
            this.method205(false);
        }
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(II)V", line = 718)
    public final void method204(int arg0, int arg1) {
        ++field470;
        this.method298(arg0, true, (byte) 8);
        if (arg1 != 1) {
            this.field655 = -43;
        }
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "(Z)V", line = 729)
    private final void method205(boolean arg0) {
        ++field575;
        if (arg0) {
            this.method256((byte) -27, 0.1727561F, -0.5048211F);
        }
        int var2;
        if (this.field721) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field755;
        } else {
            this.field687 = (float) (-this.field679 + this.field683) - this.field696;
            this.field708 = -((float) this.field673 * this.field659) + this.field687;
            if (this.field708 < (float) this.field748) {
                this.field708 = (float) this.field748;
            }
            OpenGL.glFogf(2915, this.field708);
            OpenGL.glFogf(2916, this.field687);
            var2 = this.field744;
        }
        class313.field4675[2] = (float) class168.method1203(255, var2) / 255.0F;
        class313.field4675[1] = (float) class168.method1203(var2, 65280) / 65280.0F;
        class313.field4675[0] = (float) class168.method1203(var2, 16711680) / 1.671168E7F;
        OpenGL.glFogfv(2918, class313.field4675, 0);
        if (this.field721) {
            this.field615.field2856.method56(false);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 766)
    public final void method206(Rectangle[] arg0, int arg1) {
        ++field593;
        this.method280();
    }

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "(B)V", line = 774)
    private final void method207(byte arg0) {
        ++field440;
        float[] var2 = this.field740;
        float var3 = (float) (-this.field666 * this.field748) / (float) this.field727;
        float var4 = (float) ((-this.field666 + this.field530) * this.field748) / (float) this.field727;
        float var5 = (float) (this.field748 * this.field714) / (float) this.field741;
        float var6 = (float) ((-this.field573 + this.field714) * this.field748) / (float) this.field741;
        if (arg0 <= -44) {
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field748 * 2.0F;
                var2[1] = 0.0F;
                var2[10] = this.field678 = (float) (-(this.field748 + this.field683)) / (float) (-this.field748 + this.field683);
                var2[13] = 0.0F;
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[12] = 0.0F;
                var2[4] = 0.0F;
                var2[3] = 0.0F;
                var2[6] = 0.0F;
                var2[14] = this.field693 = -((float) this.field683 * var7) / (float) (-this.field748 + this.field683);
                var2[0] = var7 / (-var3 + var4);
                var2[7] = 0.0F;
                var2[15] = 0.0F;
                var2[11] = -1.0F;
                var2[2] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[9] = (var5 + var6) / (-var6 + var5);
            } else {
                var2[5] = 1.0F;
                var2[11] = 0.0F;
                var2[12] = 0.0F;
                var2[13] = 0.0F;
                var2[9] = 0.0F;
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[10] = 1.0F;
                var2[4] = 0.0F;
                var2[15] = 1.0F;
                var2[8] = 0.0F;
                var2[1] = 0.0F;
                var2[14] = 0.0F;
                var2[0] = 1.0F;
                var2[3] = 0.0F;
                var2[6] = 0.0F;
            }
            this.method234(-1);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZI)V", line = 837)
    public final synchronized void method208(boolean arg0, int arg1) {
        if (arg0) {
            this.method298(77, false, (byte) 5);
        }
        ++field436;
        class175 var3 = new class175(arg1);
        this.field640.method866((byte) 10, var3);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ln;)V", line = 854)
    public final void method209(class15 arg0) {
        this.field654 = (class530) arg0;
        ++field533;
        this.field736.method3146(this.field654, 768);
        if (this.field730 != 1) {
            this.method341(3);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILwr;)V", line = 870)
    public final void method210(int arg0, class324 arg1) {
        ++field583;
        if (this.field628 >= arg0) {
            throw new RuntimeException();
        } else {
            if (~this.field628 <= -1) {
                this.field632[this.field628].method1877((byte) -124);
            }
            this.field627 = this.field632[++this.field628] = arg1;
            this.field627.method1865(-22359);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIIII)V", line = 885)
    public final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field428;
        this.method242(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "()F", line = 897)
    public final float method212() {
        ++field495;
        return this.field699;
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V", line = 907)
    public final void method213(int arg0) {
        ++field431;
        this.method288((byte) -82);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lqa;Ll;B)V", line = 921)
    public static final void method214(class167 arg0, class16 arg1, byte arg2) {
        ++field589;
        if (class382.field5449 != null) {
            if (arg2 != -9) {
                method267(112, 111, -120);
            }
            if (class421.field5973 < 10) {
                if (!class382.field5452.method2046(class382.field5449.field2417, 0)) {
                    class421.field5973 = class312.field4655.method2031(class382.field5449.field2417, -4793) / 10;
                    return;
                }
                class142.method1028(22);
                class421.field5973 = 10;
            }
            if (~class421.field5973 == -11) {
                class382.field5467 = class382.field5449.field2419 >> 6 << 6;
                class382.field5469 = class382.field5449.field2408 >> 6 << 6;
                class382.field5470 = (class382.field5449.field2404 >> 6 << 6) + -class382.field5467 + 64;
                class382.field5485 = (class382.field5449.field2412 >> 6 << 6) + -class382.field5469 + 64;
                int[] var3 = new int[3];
                int var4 = -1;
                int var5 = -1;
                if (class382.field5449.method1104(class364.field5293.field6956, (class364.field5293.field6965 >> 7) + class501.field7240, var3, -1190, (class364.field5293.field6961 >> 7) + class82.field1315)) {
                    var5 = var3[2] + -class382.field5469;
                    var4 = var3[1] + -class382.field5467;
                }
                if (!class215.field3234 && ~var4 <= -1 && ~class382.field5470 < ~var4 && var5 >= 0 && var5 < class382.field5485) {
                    int var6 = var5 + ((int) (10.0D * Math.random()) - 5);
                    int var7 = var4 + ((int) (10.0D * Math.random()) - 5);
                    class388.field5514 = var6;
                    class70.field1149 = var7;
                } else if (~class544.field7984 != 0 && ~class226.field3413 != 0) {
                    class382.field5449.method1106(class544.field7984, 50, var3, class226.field3413);
                    class226.field3413 = -1;
                    class544.field7984 = -1;
                    class215.field3234 = false;
                    if (var3 != null) {
                        class70.field1149 = var3[1] - class382.field5467;
                        class388.field5514 = var3[2] + -class382.field5469;
                    }
                } else {
                    class382.field5449.method1106(16383 & class382.field5449.field2409 >> 14, 50, var3, 16383 & class382.field5449.field2409);
                    class70.field1149 = var3[1] + -class382.field5467;
                    class388.field5514 = var3[2] + -class382.field5469;
                }
                if (~class382.field5449.field2407 == -38) {
                    class382.field5457 = 3.0F;
                    class382.field5460 = 3.0F;
                } else if (~class382.field5449.field2407 != -51) {
                    if (~class382.field5449.field2407 == -76) {
                        class382.field5457 = 6.0F;
                        class382.field5460 = 6.0F;
                    } else if (~class382.field5449.field2407 != -101) {
                        if (~class382.field5449.field2407 != -201) {
                            class382.field5457 = 8.0F;
                            class382.field5460 = 8.0F;
                        } else {
                            class382.field5457 = 16.0F;
                            class382.field5460 = 16.0F;
                        }
                    } else {
                        class382.field5457 = 8.0F;
                        class382.field5460 = 8.0F;
                    }
                } else {
                    class382.field5457 = 4.0F;
                    class382.field5460 = 4.0F;
                }
                class382.field5458 = (int) class382.field5457 >> 1;
                class382.field5463 = class157.method1100(11762, class382.field5458);
                class521.method3091((byte) 70);
                class382.method2326();
                class241.field3617 = new class118();
                class382.field5464 += (int) (Math.random() * 5.0D) - 2;
                if (~class382.field5464 > 7) {
                    class382.field5464 = -8;
                }
                if (~class382.field5464 < -9) {
                    class382.field5464 = 8;
                }
                class382.field5459 += (int) (5.0D * Math.random()) - 2;
                if (class382.field5459 < -16) {
                    class382.field5459 = -16;
                }
                if (~class382.field5459 < -17) {
                    class382.field5459 = 16;
                }
                class382.method2333(arg1, class382.field5464 >> 2 << 10, class382.field5459 >> 1);
                class382.field5447.method1430(256, 1024, -28705);
                class382.field5448.method2878(-1452084664, 256, 256);
                class382.field5453.method567((byte) 46, 4096);
                class6.field36.method2151(256, arg2 + -95);
                class421.field5973 = 20;
            } else if (~class421.field5973 == -21) {
                class270.method1755(-4872, true);
                class382.method2316(arg0, class382.field5464, class382.field5459);
                class421.field5973 = 60;
                class270.method1755(-4872, true);
                class523.method3108((byte) -62);
            } else if (~class421.field5973 == -61) {
                if (class382.field5452.method2012((byte) -1, class382.field5449.field2417 + "_staticelements")) {
                    if (!class382.field5452.method2046(class382.field5449.field2417 + "_staticelements", arg2 ^ -9)) {
                        return;
                    }
                    class382.field5462 = class230.method1537(class382.field5449.field2417 + "_staticelements", class382.field5452, 115, class258.field3827);
                } else {
                    class382.field5462 = new class128(0);
                }
                class382.method2319();
                class421.field5973 = 70;
                class270.method1755(arg2 ^ 4879, true);
                class523.method3108((byte) -62);
            } else if (class421.field5973 == 70) {
                class202.field3124 = new class456(arg0, 11, true, class481.field6991);
                class421.field5973 = 73;
                class270.method1755(-4872, true);
                class523.method3108((byte) -62);
            } else if (~class421.field5973 == -74) {
                class450.field6577 = new class456(arg0, 12, true, class481.field6991);
                class421.field5973 = 76;
                class270.method1755(-4872, true);
                class523.method3108((byte) -62);
            } else if (~class421.field5973 == -77) {
                class7.field53 = new class456(arg0, 14, true, class481.field6991);
                class421.field5973 = 79;
                class270.method1755(arg2 ^ 4879, true);
                class523.method3108((byte) -62);
            } else if (~class421.field5973 == -80) {
                class121.field1898 = new class456(arg0, 17, true, class481.field6991);
                class421.field5973 = 82;
                class270.method1755(-4872, true);
                class523.method3108((byte) -62);
            } else if (class421.field5973 == 82) {
                class214.field3231 = new class456(arg0, 19, true, class481.field6991);
                class421.field5973 = 85;
                class270.method1755(arg2 ^ 4879, true);
                class523.method3108((byte) -62);
            } else if (~class421.field5973 == -86) {
                class67.field1123 = new class456(arg0, 22, true, class481.field6991);
                class421.field5973 = 88;
                class270.method1755(-4872, true);
                class523.method3108((byte) -62);
            } else if (class421.field5973 == 88) {
                class156.field2374 = new class456(arg0, 26, true, class481.field6991);
                class421.field5973 = 91;
                class270.method1755(-4872, true);
                class523.method3108((byte) -62);
            } else {
                class130.field2042 = new class456(arg0, 30, true, class481.field6991);
                class421.field5973 = 100;
                class270.method1755(arg2 + -4863, true);
                class523.method3108((byte) -62);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "M", descriptor = "(IIIIII)V", line = 1147)
    public final void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field438;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method235(-12882);
        float var10 = (float) arg3 + var8;
        this.method229(arg5, -20);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field722) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field722) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "(I)V", line = 1181)
    private final void method216(int arg0) {
        ++field447;
        this.method204(-2, 1);
        for (int var2 = this.field707 + -1; var2 >= 0; --var2) {
            this.method277(var2, (byte) 127);
            this.method285(false, (class120) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method275(8448, 8448, 124);
        this.method333(false, 34168, 770, 2);
        this.method232((byte) 38);
        this.field715 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field663 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field670 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field701 = true;
        this.method348(3, true);
        this.method230((byte) -99, true);
        this.method296((byte) -86, true);
        this.method286(arg0 ^ -2918, true);
        this.method349(20397);
        this.field458.setSwapInterval(0);
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
        OpenGL.glFogi(arg0, 9729);
        OpenGL.glHint(3156, 4353);
        this.field733 = this.field744 = -1;
        this.method179();
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(II)I", line = 1251)
    public final int method217(int arg0, int arg1) {
        ++field478;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIII)Lkv;", line = 1261)
    public final class181 method218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field536;
        return !this.field648 ? null : new class512(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "(II)I", line = 1269)
    public final int method219(int arg0, int arg1) {
        ++field455;
        if (~arg1 != -6407 && ~arg1 != -6410) {
            if (arg1 != 6410 && arg1 != 34846 && arg1 != 34844) {
                if (arg1 == 6407) {
                    return 3;
                } else if (~arg1 != -6409 && ~arg1 != -34848) {
                    if (arg1 == 34843) {
                        return 6;
                    } else if (~arg1 != -34843) {
                        if (arg1 == 6402) {
                            return 3;
                        } else if (arg1 == 6401) {
                            return 1;
                        } else {
                            if (arg0 != -34848) {
                                this.method333(true, -3, -120, 101);
                            }
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

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "()Z", line = 1316)
    public final boolean method220() {
        ++field452;
        return true;
    }

    @OriginalMember(owner = "client!bt", name = "PA", descriptor = "(FF)V", line = 1324)
    public final void method221(float arg0, float arg1) {
        if (this.field751 != arg0 || this.field699 != arg1) {
            this.field699 = arg1;
            this.field751 = arg0;
            this.method234(-1);
            if (this.field730 == 3) {
                this.method181(-26676);
            } else if (~this.field730 == -3) {
                this.method301(true);
            }
        }
        ++field558;
    }

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "(B)V", line = 1348)
    public static final void method222(byte arg0) {
        ++field588;
        int[] var1 = new int[class58.field1052.field3771];
        int var2 = 0;
        if (arg0 >= 77) {
            for (int var3 = 0; ~var3 > ~class58.field1052.field3771; ++var3) {
                class116 var5 = class58.field1052.method1646(21708, var3);
                if (~var5.field1760 <= -1 || var5.field1772 >= 0) {
                    var1[var2++] = var3;
                }
            }
            class168.field2521 = new int[var2];
            for (int var4 = 0; ~var2 < ~var4; ++var4) {
                class168.field2521[var4] = var1[var4];
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[[I[[IIII)Lo;", line = 1386)
    public final class24 method223(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field545;
        return new class417(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[I[I)Li;", line = 1394)
    public final class31 method224(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field557;
        return class152.method1078(arg2, arg1, this, arg0, arg3, 4144);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lch;IIII)Lka;", line = 1405)
    public final class336 method225(class330 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field538;
        return new class426(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I[Lni;)V", line = 1413)
    public final void method226(int arg0, class369[] arg1) {
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field746[var3] = arg1[var3];
        }
        ++field585;
        this.field686 = arg0;
        if (this.field730 != 1) {
            this.method321(-10057);
        }
    }

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "(I)V", line = 1434)
    public final void method227(int arg0) {
        ++field502;
        if (arg0 != 1) {
            this.field677 = -0.020734508F;
        }
        if (this.field760 != 8) {
            this.method290(-3);
            this.method348(3, true);
            this.method296((byte) -119, true);
            this.method286(-1, true);
            this.method229(1, -106);
            this.method249(0, -2);
            this.field760 = 8;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIIILi;II)V", line = 1457)
    public final void method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class31 arg6, int arg7, int arg8) {
        ++field519;
        class173 var10 = (class173) arg6;
        class277 var11 = var10.field2592;
        this.method278((byte) -104);
        this.method285(false, var10.field2592);
        this.method229(arg5, -73);
        this.method275(7681, 8448, 125);
        this.method333(false, 34167, 768, 0);
        float var12 = var11.field4131 / (float) var11.field4125;
        float var13 = var11.field4127 / (float) var11.field4135;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method333(false, 5890, 768, 0);
    }

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "(II)V", line = 1487)
    public final void method229(int arg0, int arg1) {
        if (~this.field715 != ~arg0) {
            boolean var3;
            boolean var4;
            byte var5;
            if (arg0 == 1) {
                var3 = true;
                var4 = true;
                var5 = 1;
            } else if (~arg0 == -3) {
                var3 = false;
                var5 = 2;
                var4 = true;
            } else if (~arg0 != -129) {
                var5 = 0;
                var4 = true;
                var3 = false;
            } else {
                var4 = true;
                var3 = true;
                var5 = 3;
            }
            if (this.field701 == !var4) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field701 = var4;
            }
            if (var3 == !this.field670) {
                if (!var3) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field670 = var3;
            }
            if (~this.field663 != ~var5) {
                if (~var5 != -2) {
                    if (~var5 != -3) {
                        if (var5 == 3) {
                            OpenGL.glEnable(3042);
                            OpenGL.glBlendFunc(774, 1);
                        } else {
                            OpenGL.glDisable(3042);
                        }
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field663 = var5;
            }
            this.field715 = arg0;
            this.field760 &= -29;
        }
        if (arg1 <= -9) {
            ++field432;
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(BZ)V", line = 1583)
    public final void method230(byte arg0, boolean arg1) {
        if (arg0 != -99) {
            this.method300();
        }
        if (!this.field745 == arg1) {
            this.field745 = arg1;
            this.method352((byte) 52);
            this.field760 &= -8;
        }
        ++field451;
    }

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "(I)V", line = 1603)
    public final synchronized void method231(int arg0) {
        ++field459;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field638.method854(33)) {
            class175 var12 = (class175) this.field638.method862(-126);
            class28.field394[var2++] = (int) var12.field863;
            this.field636 -= var12.field2612;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class28.field394, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class28.field394, 0);
            var2 = 0;
        }
        while (!this.field639.method854(33)) {
            class175 var11 = (class175) this.field639.method862(-104);
            class28.field394[var2++] = (int) var11.field863;
            this.field637 -= var11.field2612;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class28.field394, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class28.field394, 0);
            var2 = 0;
        }
        while (!this.field640.method854(33)) {
            class175 var10 = (class175) this.field640.method862(-60);
            class28.field394[var2++] = var10.field2612;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class28.field394, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class28.field394, 0);
            var2 = 0;
        }
        while (!this.field641.method854(33)) {
            class175 var9 = (class175) this.field641.method862(-76);
            class28.field394[var2++] = (int) var9.field863;
            this.field634 -= var9.field2612;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class28.field394, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class28.field394, 0);
            boolean var4 = false;
        }
        while (!this.field635.method854(33)) {
            class175 var8 = (class175) this.field635.method862(-64);
            OpenGL.glDeleteLists((int) var8.field863, var8.field2612);
        }
        while (!this.field642.method854(33)) {
            class42 var7 = this.field642.method862(-82);
            OpenGL.glDeleteProgramARB((int) var7.field863);
        }
        while (!this.field643.method854(33)) {
            class42 var6 = this.field643.method862(-124);
            OpenGL.glDeleteObjectARB(var6.field863);
        }
        while (!this.field635.method854(33)) {
            class175 var5 = (class175) this.field635.method862(-86);
            OpenGL.glDeleteLists((int) var5.field863, var5.field2612);
        }
        this.field609.method1862(5);
        if (this.method358() > 100663296 && class165.method1188((byte) 26) > this.field697 - -60000L) {
            System.gc();
            this.field697 = class165.method1188((byte) 26);
        }
        this.field625 = var3;
    }

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "(B)V", line = 1767)
    private final void method232(byte arg0) {
        ++field446;
        if (arg0 != 38) {
            this.method224(-44, 100, (int[]) null, (int[]) null);
        }
        if (this.field669) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field669 = false;
        }
    }

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "(I)V", line = 1786)
    public final void method233(int arg0) {
        this.method229(0, -127);
        ++field539;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "(I)V", line = 1798)
    private final void method234(int arg0) {
        ++field569;
        if (this.field699 == 0.0F) {
            this.field740[14] = this.field693;
            this.field740[10] = this.field678;
        } else {
            float var2 = this.field751 / (this.field751 + this.field699);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field693 * (1.0F - var2) / this.field699;
            this.field740[14] = this.field693 * var3;
            this.field740[10] = this.field678 + var4;
        }
        this.field711 = (float) this.field683 + -this.field699;
        this.field738 = (this.field740[14] - (float) this.field683) / this.field740[10];
        if (arg0 != -1) {
            this.method251(-2, 70, 108, 75);
        }
    }

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "(I)V", line = 1832)
    private final void method235(int arg0) {
        if (this.field760 != 1) {
            this.method199((byte) 78);
            this.method348(3, false);
            this.method230((byte) -99, false);
            this.method296((byte) -115, false);
            this.method286(-1, false);
            this.method285(false, (class120) null);
            this.method204(-2, arg0 ^ -12881);
            this.method249(1, arg0 + 12880);
            this.field760 = 1;
        }
        ++field433;
        if (arg0 != -12882) {
            this.method279((class119) null, (class104[]) null, true);
        }
    }

    @OriginalMember(owner = "client!bt", name = "v", descriptor = "()Z", line = 1856)
    public final boolean method236() {
        ++field577;
        if (this.field614 != null) {
            if (!this.field614.method2223(false)) {
                if (!this.field608.method2936((byte) -68, this.field614)) {
                    return false;
                }
                this.field609.method1863(false);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bt", name = "sa", descriptor = "()I", line = 1881)
    public final int method237() {
        ++field466;
        return this.field683;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lkv;Lkv;FLkv;)Lkv;", line = 1889)
    public final class181 method238(class181 arg0, class181 arg1, float arg2, class181 arg3) {
        ++field468;
        if (arg0 != null && arg1 != null && this.field648 && this.field758) {
            class231 var5 = null;
            class78 var6 = (class78) arg0;
            class78 var7 = (class78) arg1;
            class221 var8 = var6.method599(79);
            class221 var9 = var7.method599(79);
            if (var8 != null && var9 != null) {
                int var10 = ~var9.field3383 > ~var8.field3383 ? var8.field3383 : var9.field3383;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class231) {
                    class231 var11 = (class231) arg3;
                    if (var10 == var11.method1546(-65534)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class231(this, var10);
                }
                if (var5.method1543(arg2, var8, var9, (byte) -99)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIZZ)V", line = 1938)
    public final void method239(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (this.field756 != arg0) {
            if (~arg0 > -1) {
                this.method232((byte) 38);
                this.method285(false, (class120) null);
                this.method249(0, -2);
                if (!this.field721) {
                    this.field615.method1324(0, arg1 ^ -7784, 0, 0, arg3, arg2);
                }
            } else {
                class176 var5 = this.field609.method1864(109, arg0);
                class39 var6 = super.field2505.method93((byte) -107, arg0);
                if (var6.field832 == 0 && ~var6.field817 == -1) {
                    this.method232((byte) 38);
                } else {
                    int var7 = var6.field823 ? 64 : 128;
                    int var8 = var7 * 50;
                    this.method355(0.0F, 2916, (float) (this.field625 % var8 * var6.field817) / (float) var8, (float) (this.field625 % var8 * var6.field832) / (float) var8);
                }
                if (!this.field721) {
                    this.field615.method1324(var6.field821, arg1 + 7784, var6.field819, var6.field834, arg3, arg2);
                    if (!this.field615.method1326(var6.field813, (byte) -14, var5)) {
                        this.method285(false, var5);
                        this.method249(var6.field813, -2);
                    }
                } else {
                    this.method285(false, var5);
                    this.method249(var6.field813, -2);
                }
            }
            this.field756 = arg0;
        }
        ++field424;
        this.field760 &= -8;
        if (arg1 != -7782) {
            this.method221(-0.25681323F, 2.6126623F);
        }
    }

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "(I)V", line = 2000)
    private final void method240(int arg0) {
        this.field654 = new class530();
        ++field450;
        this.field736 = new class530();
        this.field729 = new class120[this.field707];
        this.field682 = new class176(this, 3553, 6408, 1, 1);
        new class176(this, 3553, 6408, 1, 1);
        new class176(this, 3553, 6408, 1, 1);
        this.field644 = new class426(this);
        this.field660 = new class426(this);
        this.field680 = new class426(this);
        int var2 = 66 / ((arg0 - -18) / 60);
        this.field698 = new class426(this);
        this.field725 = new class426(this);
        this.field749 = new class426(this);
        this.field739 = new class426(this);
        this.field684 = new class426(this);
        this.field732 = new class426(this);
        this.field657 = new class426(this);
        if (this.field758) {
            this.field658 = new class292(this);
            new class292(this);
        }
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "()V", line = 2037)
    public final void method241() {
        ++field488;
        if (this.field614 != null && this.field614.method2223(false)) {
            this.field608.method2941((byte) -104, this.field614);
            this.field609.method1863(false);
        }
    }

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "(IIIIII)V", line = 2059)
    public final void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method235(-12882);
        ++field518;
        this.method229(arg5, -60);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "(I)V", line = 2075)
    public final void method243(int arg0) {
        OpenGL.glPopMatrix();
        ++field422;
        int var2 = 81 % ((arg0 - 81) / 34);
    }

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "(B)V", line = 2088)
    private final void method244(byte arg0) {
        if (arg0 >= -46) {
            this.field668 = 0.105485916F;
        }
        ++field523;
        class313.field4675[1] = this.field668 * this.field661;
        class313.field4675[3] = 1.0F;
        class313.field4675[2] = this.field690 * this.field661;
        class313.field4675[0] = this.field661 * this.field646;
        OpenGL.glLightfv(16384, 4609, class313.field4675, 0);
        class313.field4675[0] = -this.field737 * this.field646;
        class313.field4675[2] = -this.field737 * this.field690;
        class313.field4675[1] = -this.field737 * this.field668;
        class313.field4675[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class313.field4675, 0);
    }

    @OriginalMember(owner = "client!bt", name = "A", descriptor = "()Ln;", line = 2108)
    public final class15 method245() {
        ++field448;
        return new class530();
    }

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "([I)V", line = 2116)
    public final void method246(int[] arg0) {
        arg0[2] = this.field710;
        ++field576;
        arg0[1] = this.field671;
        arg0[3] = this.field688;
        arg0[0] = this.field742;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(FFF)V", line = 2132)
    public final void method247(float arg0, float arg1, float arg2) {
        class244.field3656 = arg1;
        class218.field3318 = arg2;
        class279.field4141 = arg0;
        ++field604;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BJ)V", line = 2144)
    public final synchronized void method248(byte arg0, long arg1) {
        ++field497;
        if (arg0 != -3) {
            this.field694 = true;
        }
        class42 var4 = new class42();
        var4.field863 = arg1;
        this.field643.method866((byte) 10, var4);
    }

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "(II)V", line = 2159)
    public final void method249(int arg0, int arg1) {
        ++field462;
        if (~arg0 != arg1) {
            if (arg0 != 0) {
                if (~arg0 == -3) {
                    this.method275(34165, 7681, 120);
                    return;
                }
                if (~arg0 == -4) {
                    this.method275(260, 8448, 126);
                    return;
                }
                if (arg0 == 4) {
                    this.method275(34023, 34023, 123);
                    return;
                }
            } else {
                this.method275(8448, 8448, 124);
            }
        } else {
            this.method275(7681, 7681, 120);
        }
    }

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "()V", line = 2186)
    public final void method250() {
        ++field559;
        if (this.field685 && ~this.field530 < -1 && ~this.field573 < -1) {
            int var1 = this.field742;
            int var2 = this.field710;
            int var3 = this.field671;
            int var4 = this.field688;
            this.method179();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method349(20397);
            this.method348(3, false);
            this.method230((byte) -99, false);
            this.method296((byte) -77, false);
            this.method286(-1, false);
            this.method285(false, (class120) null);
            this.method204(-2, 1);
            this.method249(1, -2);
            this.method229(0, -80);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field530, this.field573, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method345(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIII)V", line = 2239)
    public final void method251(int arg0, int arg1, int arg2, int arg3) {
        ++field472;
        this.field608.method2933(arg1, arg3, arg2, 0, arg0);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)I", line = 2250)
    public final int method252(int arg0, int arg1) {
        ++field439;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lwg;)V", line = 2258)
    public final void method253(class300 arg0) {
        this.field613.method849(this, (byte) 62, arg0);
        ++field474;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lus;I)V", line = 2268)
    public final void method254(class1 arg0, int arg1) {
        ++field574;
        int var3 = -18 / ((arg1 - 2) / 63);
        if (this.field734 != arg0) {
            if (this.field672) {
                OpenGL.glBindBufferARB(34962, arg0.method4(-61));
            }
            this.field734 = arg0;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIZ)Laa;", line = 2286)
    public final class343 method255(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field542;
        return new class75(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BFF)V", line = 2295)
    public final void method256(byte arg0, float arg1, float arg2) {
        if (arg0 >= -12) {
            this.field697 = -26L;
        }
        this.field659 = arg1;
        this.field696 = arg2;
        ++field564;
        if (!this.field721) {
            this.method205(false);
        }
    }

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "(I)V", line = 2312)
    private final void method257(int arg0) {
        if (this.field710 >= this.field742 && this.field671 <= this.field688) {
            OpenGL.glScissor(this.field655 - -this.field742, this.field651 - (-this.field573 - -this.field688), -this.field742 + this.field710, -this.field671 + this.field688);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field480;
        if (arg0 != 0) {
            this.field655 = 90;
        }
    }

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "(I)V", line = 2327)
    private final void method258(int arg0) {
        if (this.field724 && ~this.field673 <= -1 | this.field721) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 != 0) {
            this.method302(3, -107);
        }
        ++field513;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIIIIIII)V", line = 2342)
    public final void method259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field543;
    }

    @OriginalMember(owner = "client!bt", name = "u", descriptor = "(I)V", line = 2349)
    public final void method260(int arg0) {
        ++field469;
        OpenGL.glLightfv(16384, 4611, this.field675, 0);
        OpenGL.glLightfv(16385, 4611, this.field689, 0);
        if (arg0 > -4) {
            this.field657 = null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lfl;Z)V", line = 2361)
    public final void method261(class530 arg0, boolean arg1) {
        ++field490;
        OpenGL.glLoadMatrixf(arg0.method3144((byte) -42), 0);
        if (!arg1) {
            this.method313(122, false, -59);
        }
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)Lw;", line = 2376)
    public final class200 method262(int arg0) {
        ++field534;
        class408 var2 = new class408(arg0);
        this.field621.method866((byte) 10, var2);
        return var2;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)I", line = 2387)
    public final int method263(int arg0, byte arg1) {
        ++field552;
        if (arg1 != -51) {
            this.field632 = null;
        }
        if (arg0 != 1) {
            if (~arg0 != -1) {
                if (~arg0 == -3) {
                    return 34165;
                } else if (arg0 == 3) {
                    return 260;
                } else if (arg0 == 4) {
                    return 34023;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                return 8448;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 2417)
    public final void method264(Canvas arg0) {
        this.field517 = 0L;
        ++field572;
        this.field477 = null;
        if (arg0 != null && this.field464 != arg0) {
            if (this.field463.containsKey(arg0)) {
                Long var2 = (Long) this.field463.get(arg0);
                this.field517 = var2;
                this.field477 = arg0;
            }
        } else {
            this.field477 = this.field464;
            this.field517 = this.field600;
        }
        if (this.field477 != null && ~this.field517 != -1L) {
            this.field458.setSurface(this.field517);
            this.method297(0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(Z)V", line = 2448)
    public final void method265(boolean arg0) {
        ++field419;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IBIILvn;)V", line = 2456)
    public final void method266(int arg0, byte arg1, int arg2, int arg3, class209 arg4) {
        int var6 = -120 % ((-3 - arg1) / 50);
        ++field540;
        int var7 = arg4.method408((byte) -62);
        int var8 = arg2 * this.method320(var7, 4474);
        this.method330(arg4, (byte) -115);
        OpenGL.glDrawElements(arg0, arg3, var7, (long) var8 + arg4.method414((byte) 58));
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(III)V", line = 2474)
    public static final void method267(int arg0, int arg1, int arg2) {
        class473.field6895 = -class382.field5467 + arg0;
        ++field496;
        if (arg2 >= 60) {
            class94.field1501 = -class382.field5469 + arg1;
        }
    }

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "()V", line = 2486)
    public final void method268() {
        ++field549;
        this.method286(-1, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)V", line = 2498)
    public final void method269(boolean arg0) {
        ++field500;
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 2507)
    public final void method270(Canvas arg0) {
        ++field499;
        if (this.field464 == arg0) {
            throw new RuntimeException();
        } else if (this.field463.containsKey(arg0)) {
            Long var2 = (Long) this.field463.get(arg0);
            this.field458.releaseSurface(arg0, var2);
            this.field463.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZZ[BII)Lvn;", line = 2526)
    public final class209 method271(boolean arg0, boolean arg1, byte[] arg2, int arg3, int arg4) {
        ++field598;
        if (arg0) {
            return null;
        } else {
            return (class209) (!this.field672 || arg1 && !this.field716 ? new class41(this, arg3, arg2, arg4) : new class309(this, arg3, arg2, arg4, arg1));
        }
    }

    @OriginalMember(owner = "client!bt", name = "I", descriptor = "()F", line = 2543)
    public final float method272() {
        ++field590;
        return this.field751;
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(Z)V", line = 2552)
    public final void method273(boolean arg0) {
        this.field761 = arg0;
        ++field528;
        this.method276(32884);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "([Lka;Lwg;Ln;[Lwc;I)V", line = 2563)
    public final void method274(class336[] arg0, class300 arg1, class15 arg2, class48[] arg3, int arg4) {
        ++field511;
        this.method323(arg0, arg2, arg3, arg4);
        this.method253(arg1);
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(III)V", line = 2574)
    public final void method275(int arg0, int arg1, int arg2) {
        if (arg2 < 119) {
            this.method187();
        }
        ++field562;
        if (~this.field754 != -1) {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        } else {
            boolean var4 = false;
            if (~this.field706 != ~arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                this.field706 = arg0;
                var4 = true;
            }
            if (~this.field723 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                var4 = true;
                this.field723 = arg1;
            }
            if (var4) {
                this.field760 &= -30;
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "v", descriptor = "(I)V", line = 2618)
    private final void method276(int arg0) {
        ++field505;
        if (arg0 != 32884) {
            this.field680 = null;
        }
        OpenGL.glDepthMask(this.field667 && this.field761);
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(IB)V", line = 2629)
    public final void method277(int arg0, byte arg1) {
        ++field546;
        if (arg1 <= 48) {
            this.field651 = -101;
        }
        if (this.field754 != arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field754 = arg0;
        }
    }

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "(B)V", line = 2647)
    public final void method278(byte arg0) {
        ++field553;
        if (this.field760 != 2) {
            this.method199((byte) 81);
            this.method348(3, false);
            this.method230((byte) -99, false);
            this.method296((byte) -73, false);
            this.method286(-1, false);
            this.method204(-2, 1);
            this.field760 = 2;
        }
        if (arg0 > -63) {
            this.field602 = -97;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lgg;[Lho;Z)Lba;", line = 2668)
    public final class269 method279(class119 arg0, class104[] arg1, boolean arg2) {
        ++field449;
        return new class353(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "()V", line = 2676)
    public final void method280() {
        try {
            this.field458.swapBuffers();
        } catch (Exception var1) {
        }
        ++field594;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lwr;I)V", line = 2693)
    public final void method281(class324 arg0, int arg1) {
        ++field551;
        if (this.field728) {
            this.method342(arg0, -29);
            this.method295(23709, arg0);
        } else {
            if (this.field626 < 0 || this.field631[this.field626] != arg0) {
                throw new RuntimeException();
            }
            this.field631[this.field626--] = null;
            arg0.method1870(false);
            if (this.field626 >= 0) {
                this.field629 = this.field627 = this.field631[this.field626];
                this.field629.method1872(114);
            } else {
                this.field629 = this.field627 = null;
            }
        }
        if (arg1 != -21590) {
            this.field530 = -82;
        }
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "(III)V", line = 2729)
    public final synchronized void method282(int arg0, int arg1, int arg2) {
        if (arg0 != -333) {
            this.field760 = 44;
        }
        ++field578;
        class175 var4 = new class175(arg2);
        var4.field863 = (long) arg1;
        this.field638.method866((byte) 10, var4);
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "()V", line = 2745)
    public final void method283() {
        ++field485;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "([IIIII)Laa;", line = 2752)
    public final class343 method284(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field444;
        return new class75(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZLei;)V", line = 2760)
    public final void method285(boolean arg0, class120 arg1) {
        ++field587;
        if (arg0) {
            this.field726 = true;
        }
        class120 var3 = this.field729[this.field754];
        if (arg1 != var3) {
            if (arg1 == null) {
                OpenGL.glDisable(var3.field1881);
            } else {
                if (var3 != null) {
                    if (~arg1.field1881 != ~var3.field1881) {
                        OpenGL.glDisable(var3.field1881);
                        OpenGL.glEnable(arg1.field1881);
                    }
                } else {
                    OpenGL.glEnable(arg1.field1881);
                }
                OpenGL.glBindTexture(arg1.field1881, arg1.method886((byte) -112));
            }
            this.field729[this.field754] = arg1;
        }
        this.field760 &= -2;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IZ)V", line = 2803)
    public final void method286(int arg0, boolean arg1) {
        if (!arg1 == this.field667) {
            this.field667 = arg1;
            this.method276(32884);
            this.field760 &= -32;
        }
        if (arg0 != -1) {
            this.field662 = null;
        }
        ++field561;
    }

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "(B)V", line = 2821)
    private final void method287(byte arg0) {
        OpenGL.glViewport(this.field655, this.field651, this.field530, this.field573);
        ++field560;
        int var2 = 27 / ((arg0 - -16) / 56);
    }

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "(B)V", line = 2831)
    private final void method288(byte arg0) {
        this.field458.detach();
        if (arg0 <= -22) {
            ++field527;
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(ILwr;)V", line = 2848)
    public final void method289(int arg0, class324 arg1) {
        if (arg0 == 8704) {
            ++field493;
            if (this.field728) {
                this.method191((byte) 44, arg1);
                this.method210(3, arg1);
            } else if (~this.field626 <= -4) {
                throw new RuntimeException();
            } else {
                if (~this.field626 <= -1) {
                    this.field631[this.field626].method1870(false);
                }
                this.field629 = this.field627 = this.field631[++this.field626] = arg1;
                this.field629.method1872(-106);
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "w", descriptor = "(I)V", line = 2876)
    private final void method290(int arg0) {
        if (~this.field730 != arg0) {
            this.field730 = 2;
            this.method301(true);
            this.method341(3);
            this.field760 &= -8;
        }
        ++field567;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lfl;I)V", line = 2892)
    public final void method291(class530 arg0, int arg1) {
        OpenGL.glPushMatrix();
        ++field418;
        OpenGL.glMultMatrixf(arg0.method3144((byte) -42), arg1);
    }

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "()Z", line = 2904)
    public final boolean method292() {
        ++field441;
        return this.field614 != null && this.field614.method2223(false);
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "(IIIII)V", line = 2912)
    public final void method293(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method235(-12882);
        ++field476;
        this.method229(arg4, -79);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lkv;)V", line = 2933)
    public final void method294(class181 arg0) {
        ++field510;
        this.field731 = (class78) arg0;
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(ILwr;)V", line = 2941)
    public final void method295(int arg0, class324 arg1) {
        ++field471;
        if (~this.field628 <= -1 && this.field632[this.field628] == arg1) {
            this.field632[this.field628--] = null;
            if (arg0 != 23709) {
                this.field740 = null;
            }
            arg1.method1877((byte) -114);
            if (~this.field628 > -1) {
                this.field627 = null;
            } else {
                this.field627 = this.field632[this.field628];
                this.field627.method1865(-22359);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(BZ)V", line = 2964)
    public final void method296(byte arg0, boolean arg1) {
        ++field494;
        if (arg0 <= -60) {
            if (this.field726 != arg1) {
                if (!arg1) {
                    OpenGL.glDisable(2929);
                } else {
                    OpenGL.glEnable(2929);
                }
                this.field760 &= -32;
                this.field726 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "x", descriptor = "(I)V", line = 2986)
    private final void method297(int arg0) {
        ++field456;
        if (this.field477 != null) {
            Dimension var2 = this.field477.getSize();
            this.field501 = var2.width;
            this.field602 = var2.height;
        } else {
            this.field501 = this.field602 = 0;
        }
        if (this.field627 == null) {
            this.field573 = this.field602;
            this.field530 = this.field501;
            this.method287((byte) -110);
        }
        this.method349(20397);
        this.method179();
        if (arg0 != 0) {
            this.field663 = 16;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IZB)V", line = 3018)
    public final void method298(int arg0, boolean arg1, byte arg2) {
        if (arg2 == 8) {
            ++field616;
            this.method239(arg0, -7782, arg1, true);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lw;)V", line = 3034)
    public final void method299(class200 arg0) {
        this.field623 = ((class408) arg0).field5784;
        ++field512;
        if (this.field691 == null) {
            class235 var2 = new class235(80);
            if (!this.field713) {
                var2.method1559(-127, -1.0F);
                var2.method1559(-105, -1.0F);
                var2.method1559(-99, 0.0F);
                var2.method1559(-119, 0.0F);
                var2.method1559(-118, 1.0F);
                var2.method1559(-96, 1.0F);
                var2.method1559(-112, -1.0F);
                var2.method1559(-102, 0.0F);
                var2.method1559(-98, 1.0F);
                var2.method1559(-98, 1.0F);
                var2.method1559(-113, 1.0F);
                var2.method1559(-128, 1.0F);
                var2.method1559(-104, 0.0F);
                var2.method1559(-101, 1.0F);
                var2.method1559(-128, 0.0F);
                var2.method1559(-97, -1.0F);
                var2.method1559(-107, 1.0F);
                var2.method1559(-119, 0.0F);
                var2.method1559(-102, 0.0F);
                var2.method1559(-127, 0.0F);
            } else {
                var2.method1558((byte) 117, -1.0F);
                var2.method1558((byte) 117, -1.0F);
                var2.method1558((byte) 117, 0.0F);
                var2.method1558((byte) 117, 0.0F);
                var2.method1558((byte) 117, 1.0F);
                var2.method1558((byte) 117, 1.0F);
                var2.method1558((byte) 117, -1.0F);
                var2.method1558((byte) 117, 0.0F);
                var2.method1558((byte) 117, 1.0F);
                var2.method1558((byte) 117, 1.0F);
                var2.method1558((byte) 117, 1.0F);
                var2.method1558((byte) 117, 1.0F);
                var2.method1558((byte) 117, 0.0F);
                var2.method1558((byte) 117, 1.0F);
                var2.method1558((byte) 117, 0.0F);
                var2.method1558((byte) 117, -1.0F);
                var2.method1558((byte) 117, 1.0F);
                var2.method1558((byte) 117, 0.0F);
                var2.method1558((byte) 117, 0.0F);
                var2.method1558((byte) 117, 0.0F);
            }
            this.field691 = this.method193(267135248, false, 20, var2.field7558, var2.field7545);
            this.field664 = new class157(this.field691, 5126, 3, 0);
            this.field703 = new class157(this.field691, 5126, 2, 12);
            this.field613.method844(-120, this);
        }
    }

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "()V", line = 3101)
    public final void method300() {
        for (class42 var1 = this.field621.method863(-1); var1 != null; var1 = this.field621.method865(-1)) {
            ((class408) var1).method2428((byte) 60);
        }
        ++field597;
        if (this.field608 != null) {
            this.field608.method2939(1);
        }
        if (this.field458 != null) {
            this.method288((byte) -95);
            Enumeration var2 = this.field463.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field463.get(var3);
                this.field458.releaseSurface(var3, var4);
            }
            this.field458.release();
            this.field458 = null;
        }
        if (this.field620) {
            class86.method645(false, (byte) -117, true);
            this.field620 = false;
        }
    }

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "(Z)V", line = 3145)
    private final void method301(boolean arg0) {
        ++field473;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field740, 0);
        OpenGL.glMatrixMode(5888);
        if (!arg0) {
            this.method313(24, true, 26);
        }
    }

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "(II)V", line = 3158)
    public final synchronized void method302(int arg0, int arg1) {
        ++field612;
        if (arg1 != 29919) {
            this.field704 = 41;
        }
        class42 var3 = new class42();
        var3.field863 = (long) arg0;
        this.field642.method866((byte) 10, var3);
    }

    @OriginalMember(owner = "client!bt", name = "B", descriptor = "()I", line = 3172)
    public final int method303() {
        ++field596;
        return 4;
    }

    @OriginalMember(owner = "client!bt", name = "N", descriptor = "(IIII)[I", line = 3180)
    public final int[] method304(int arg0, int arg1, int arg2, int arg3) {
        ++field526;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, this.field573 - (arg1 + var6), arg2, 1, 32993, this.field709, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "()V", line = 3201)
    public final void method305() {
        this.field721 = false;
        ++field508;
        this.field615.method1324(0, 2, 0, 0, false, false);
        this.method205(false);
        this.method258(0);
    }

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "(II)V", line = 3216)
    public final void method306(int arg0, int arg1) {
        if (~this.field748 != ~arg0 || this.field683 != arg1) {
            this.field683 = arg1;
            this.field748 = arg0;
            this.method207((byte) -85);
            this.method205(false);
            if (~this.field730 == -4) {
                this.method181(-26676);
            } else if (this.field730 == 2) {
                this.method301(true);
            }
        }
        ++field504;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;IZ)Z", line = 3243)
    public static final boolean method307(String arg0, int arg1, boolean arg2) {
        ++field580;
        if (class411.field5809 != 3) {
            class474.field6918 = new class267();
            class474.field6918.field4020 = arg1;
            class474.field6918.field4009 = arg0;
            if (class438.field6237 != class368.field5320) {
                class474.field6918.field4013 = class474.field6918.field4020 + 40000;
                class474.field6918.field4014 = class474.field6918.field4020 + 50000;
            }
            return true;
        } else {
            String var3 = "";
            if (class438.field6237 != class368.field5320) {
                var3 = ":" + (arg1 + 7000);
            }
            if (arg2) {
                return false;
            } else {
                String var4 = "";
                if (class394.field5615 != null) {
                    var4 = "/p=" + class394.field5615;
                }
                String var5 = "http://" + arg0 + var3 + "/l=" + class503.field7255 + "/a=" + class446.field6374 + var4 + "/j" + (class481.field6989 ? "1" : "0") + ",o" + (class164.field2484 ? "1" : "0") + ",a2";
                try {
                    class212.field3194.getAppletContext().showDocument(new URL(var5), "_self");
                    return true;
                } catch (Exception var6) {
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lho;Z)Laa;", line = 3285)
    public final class343 method308(class104 arg0, boolean arg1) {
        ++field506;
        int[] var3 = new int[arg0.field1594 * arg0.field1590];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1589 == null) {
            for (int var6 = 0; var6 < arg0.field1594; ++var6) {
                for (int var7 = 0; ~arg0.field1590 < ~var7; ++var7) {
                    int var8 = arg0.field1588[arg0.field1587[var4++] & 255];
                    var3[var5++] = var8 == 0 ? 0 : class442.method2600(-16777216, var8);
                }
            }
        } else {
            for (int var9 = 0; ~arg0.field1594 < ~var9; ++var9) {
                for (int var11 = 0; var11 < arg0.field1590; ++var11) {
                    var3[var5++] = class442.method2600(arg0.field1588[class168.method1203(255, arg0.field1587[var4])], arg0.field1589[var4] << 24);
                    ++var4;
                }
            }
        }
        class343 var10 = this.method284(var3, 0, arg0.field1590, arg0.field1590, arg0.field1594);
        var10.method375(arg0.field1592, arg0.field1595, arg0.field1593, arg0.field1591);
        return var10;
    }

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "(Z)V", line = 3346)
    private final void method309(boolean arg0) {
        this.field705 = (float) (-this.field666 + this.field742);
        this.field677 = (float) (-this.field714 + this.field671);
        this.field676 = (float) (-this.field714 + this.field688);
        if (arg0) {
            this.field666 = 93;
        }
        ++field427;
        this.field702 = (float) (-this.field666 + this.field710);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(FIFFF)V", line = 3361)
    public final void method310(float arg0, int arg1, float arg2, float arg3, float arg4) {
        class313.field4675[0] = arg4;
        class313.field4675[2] = arg0;
        if (arg1 <= -119) {
            class313.field4675[1] = arg3;
            class313.field4675[3] = arg2;
            ++field483;
            OpenGL.glTexEnvfv(8960, 8705, class313.field4675, 0);
        }
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 3376)
    public final void method311(Canvas arg0) {
        ++field584;
        if (this.field464 == arg0) {
            throw new RuntimeException();
        } else if (!this.field463.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field458.prepareSurface(arg0);
                if (var4 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field463.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "u", descriptor = "()Ln;", line = 3412)
    public final class15 method312() {
        ++field417;
        return this.field617;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IZI)V", line = 3420)
    public final synchronized void method313(int arg0, boolean arg1, int arg2) {
        ++field563;
        class175 var4 = new class175(arg0);
        var4.field863 = (long) arg2;
        this.field639.method866((byte) 10, var4);
        if (!arg1) {
            this.method218(67, -24, 80, -36, 88, 127);
        }
    }

    @OriginalMember(owner = "client!bt", name = "ha", descriptor = "(III)V", line = 3437)
    public final void method314(int arg0, int arg1, int arg2) {
        ++field555;
        if (this.field744 != arg0 || ~this.field673 != ~arg1 || this.field679 != arg2) {
            this.field744 = arg0;
            this.field679 = arg2;
            this.field673 = arg1;
            if (this.field721) {
                return;
            }
            this.method205(false);
            this.method258(0);
        }
    }

    @OriginalMember(owner = "client!bt", name = "y", descriptor = "(I)V", line = 3463)
    public final void method315(int arg0) {
        if (this.field760 != 4) {
            this.method199((byte) 125);
            this.method348(3, false);
            this.method230((byte) -99, false);
            this.method296((byte) -128, false);
            this.method286(-1, false);
            this.method204(-2, 1);
            this.method229(1, arg0 ^ -3048);
            this.method249(0, -2);
            this.field760 = 4;
        }
        ++field486;
        if (arg0 != 3008) {
            this.method280();
        }
    }

    @OriginalMember(owner = "client!bt", name = "x", descriptor = "()V", line = 3489)
    public final void method316() {
        this.field608.method2934(0);
        ++field429;
    }

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "(I)V", line = 3501)
    public final void method317(int arg0) {
        ++field532;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "()Z", line = 3512)
    public final boolean method318() {
        ++field592;
        return this.field722 && (!this.method292() || this.field694);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljd;Ljd;Ljd;ILjd;)V", line = 3524)
    public final void method319(class157 arg0, class157 arg1, class157 arg2, int arg3, class157 arg4) {
        ++field507;
        if (arg3 == 22146) {
            if (arg4 != null) {
                this.method254(arg4.field2398, 100);
                OpenGL.glVertexPointer(arg4.field2396, arg4.field2400, this.field734.method2(false), this.field734.method3(false) + (long) arg4.field2399);
                OpenGL.glEnableClientState(32884);
            } else {
                OpenGL.glDisableClientState(32884);
            }
            if (arg1 != null) {
                this.method254(arg1.field2398, -102);
                OpenGL.glNormalPointer(arg1.field2400, this.field734.method2(false), this.field734.method3(false) - -((long) arg1.field2399));
                OpenGL.glEnableClientState(32885);
            } else {
                OpenGL.glDisableClientState(32885);
            }
            if (arg0 == null) {
                OpenGL.glDisableClientState(32886);
            } else {
                this.method254(arg0.field2398, arg3 + -22044);
                OpenGL.glColorPointer(arg0.field2396, arg0.field2400, this.field734.method2(false), this.field734.method3(false) + (long) arg0.field2399);
                OpenGL.glEnableClientState(32886);
            }
            if (arg2 != null) {
                this.method254(arg2.field2398, 115);
                OpenGL.glTexCoordPointer(arg2.field2396, arg2.field2400, this.field734.method2(false), this.field734.method3(false) + (long) arg2.field2399);
                OpenGL.glEnableClientState(32888);
            } else {
                OpenGL.glDisableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "(II)I", line = 3570)
    public final int method320(int arg0, int arg1) {
        ++field460;
        if (~arg0 != -5122 && arg0 != 5120) {
            if (arg1 != 4474) {
                this.method233(-9);
            }
            if (arg0 != 5123 && ~arg0 != -5123) {
                if (~arg0 != -5126 && arg0 != 5124 && ~arg0 != -5127) {
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

    @OriginalMember(owner = "client!bt", name = "z", descriptor = "(I)V", line = 3595)
    private final void method321(int arg0) {
        ++field544;
        if (arg0 != -10057) {
            this.field608 = null;
        }
        int var2;
        for (var2 = 0; this.field686 > var2; ++var2) {
            class369 var3 = this.field746[var2];
            class51.field936[0] = (float) var3.method2264((byte) -43);
            int var4 = var2 + 16386;
            class51.field936[1] = (float) var3.method2262(class288.method1845(arg0, -10063));
            class51.field936[2] = (float) var3.method2261((byte) 96);
            class51.field936[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class51.field936, 0);
            int var5 = var3.method2259(-72);
            float var6 = var3.method2258((byte) 17) / 255.0F;
            class51.field936[0] = (float) (class168.method1203(var5, 16732433) >> 16) * var6;
            class51.field936[2] = var6 * (float) class168.method1203(255, var5);
            class51.field936[1] = (float) class168.method1203(var5 >> 8, 255) * var6;
            OpenGL.glLightfv(var4, 4609, class51.field936, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method2260(true) * var3.method2260(true)));
            OpenGL.glEnable(var4);
        }
        while (var2 < this.field747) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field747 = this.field686;
    }

    @OriginalMember(owner = "client!bt", name = "GA", descriptor = "(ILi;II)V", line = 3640)
    public final void method322(int arg0, class31 arg1, int arg2, int arg3) {
        ++field514;
        class173 var5 = (class173) arg1;
        class277 var6 = var5.field2592;
        this.method278((byte) -90);
        this.method285(false, var5.field2592);
        this.method229(1, -93);
        this.method275(7681, 8448, 124);
        this.method333(false, 34167, 768, 0);
        float var7 = var6.field4131 / (float) var6.field4125;
        float var8 = var6.field4127 / (float) var6.field4135;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field742) * var7, (float) (-arg3 + this.field671) * var8);
        OpenGL.glVertex2i(this.field742, this.field671);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field742) * var7, (float) (-arg3 + this.field688) * var8);
        OpenGL.glVertex2i(this.field742, this.field688);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field710) * var7, (float) (-arg3 + this.field688) * var8);
        OpenGL.glVertex2i(this.field710, this.field688);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field710) * var7, (float) (this.field671 - arg3) * var8);
        OpenGL.glVertex2i(this.field710, this.field671);
        OpenGL.glEnd();
        this.method333(false, 5890, 768, 0);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "([Lka;Ln;[Lwc;I)V", line = 3672)
    public final void method323(class336[] arg0, class15 arg1, class48[] arg2, int arg3) {
        ++field554;
        for (int var5 = 0; ~arg0.length < ~var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method1142(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "BA", descriptor = "(IIIII)V", line = 3696)
    public final void method324(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method235(-12882);
        ++field547;
        this.method229(arg4, -126);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(IIII)V", line = 3716)
    public final void method325(int arg0, int arg1, int arg2, int arg3) {
        this.field714 = arg1;
        ++field492;
        this.field741 = arg3;
        this.field666 = arg0;
        this.field727 = arg2;
        this.method207((byte) -77);
        this.method309(false);
        if (this.field730 == 3) {
            this.method181(-26676);
        } else if (this.field730 == 2) {
            this.method301(true);
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "()Z", line = 3741)
    public final boolean method326() {
        ++field423;
        return true;
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(IIIIII)V", line = 3749)
    public final void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field531;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method235(-12882);
        this.method229(arg5, -82);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field722) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field722) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!bt", name = "TA", descriptor = "(IIIIII)Z", line = 3784)
    public final boolean method328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field498;
        float var7 = (float) arg2 * this.field654.field7796 + (float) arg0 * this.field654.field7816 + (float) arg1 * this.field654.field7814 + this.field654.field7819;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field654.field7796 + (float) arg3 * this.field654.field7816 + (float) arg4 * this.field654.field7814 + this.field654.field7819;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field748) || !((float) this.field748 > var8)) && (!(var7 > (float) this.field683) || !((float) this.field683 < var8))) {
            int var9 = (int) (((float) arg2 * this.field654.field7809 + (float) arg0 * this.field654.field7822 + (float) arg1 * this.field654.field7821 + this.field654.field7806) * (float) this.field727 / var7);
            int var10 = (int) (((float) arg5 * this.field654.field7809 + (float) arg3 * this.field654.field7822 + (float) arg4 * this.field654.field7821 + this.field654.field7806) * (float) this.field727 / var8);
            if ((float) var9 < this.field705 && this.field705 > (float) var10 || this.field702 < (float) var9 && (float) var10 > this.field702) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field654.field7807 + (float) arg0 * this.field654.field7817 + (float) arg1 * this.field654.field7804 + this.field654.field7797) * (float) this.field741 / var7);
                int var12 = (int) (((float) arg5 * this.field654.field7807 + (float) arg3 * this.field654.field7817 + (float) arg4 * this.field654.field7804 + this.field654.field7797) * (float) this.field741 / var8);
                return (!((float) var11 < this.field677) || !(this.field677 > (float) var12)) && (!((float) var11 > this.field676) || !(this.field676 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "()Z", line = 3821)
    public final boolean method329() {
        ++field434;
        return true;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lvn;B)V", line = 3830)
    public final void method330(class209 arg0, byte arg1) {
        if (this.field743 != arg0) {
            if (this.field672) {
                OpenGL.glBindBufferARB(34963, arg0.method413((byte) 70));
            }
            this.field743 = arg0;
        }
        if (arg1 > -89) {
            this.field767 = 100;
        }
        ++field586;
    }

    @OriginalMember(owner = "client!bt", name = "MA", descriptor = "(F)V", line = 3851)
    public final void method331(float arg0) {
        ++field524;
        if (this.field720 != arg0) {
            this.field720 = arg0;
            this.method201(2);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lka;Lwg;Ln;Lwc;I)V", line = 3867)
    public final void method332(class336 arg0, class300 arg1, class15 arg2, class48 arg3, int arg4) {
        arg0.method1142(arg2, arg3, arg4);
        ++field595;
        this.method253(arg1);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZIII)V", line = 3879)
    public final void method333(boolean arg0, int arg1, int arg2, int arg3) {
        ++field426;
        if (arg0) {
            this.field735 = null;
        }
        OpenGL.glTexEnvi(8960, arg3 + 34176, arg1);
        OpenGL.glTexEnvi(8960, arg3 + 34192, arg2);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIIIIF)Lni;", line = 3895)
    public final class369 method334(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field525;
        return new class222(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bt", name = "ua", descriptor = "(IIIIII[BII)V", line = 3903)
    public final void method335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field435;
        float var10;
        float var11;
        if (this.field662 != null && this.field662.field2626 >= arg2 && arg3 <= this.field662.field2628) {
            this.field662.method1232(-8733, 0, arg2, 6406, 0, 0, 0, false, arg3, arg6);
            var10 = (float) arg3 * this.field662.field4127 / (float) this.field662.field2628;
            var11 = (float) arg2 * this.field662.field4131 / (float) this.field662.field2626;
        } else {
            this.field662 = class152.method1080(arg6, 121, false, arg3, this, 6406, arg2, 6406);
            this.field662.method1226(false, false, (byte) -103);
            var10 = this.field662.field4127;
            var11 = this.field662.field4131;
        }
        this.method278((byte) -80);
        this.method285(false, this.field662);
        this.method229(arg8, -17);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method356(arg5, 255);
        this.method275(34165, 34165, 126);
        this.method333(false, 34166, 768, 0);
        this.method333(false, 5890, 770, 2);
        this.method200(34166, 0, 770, (byte) 126);
        this.method200(5890, 2, 770, (byte) -89);
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
        this.method333(false, 5890, 768, 0);
        this.method333(false, 34166, 770, 2);
        this.method200(5890, 0, 770, (byte) -61);
        this.method200(34166, 2, 770, (byte) -32);
    }

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "()Z", line = 3960)
    public final boolean method336() {
        ++field503;
        return true;
    }

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "(B)V", line = 3968)
    private final void method337(byte arg0) {
        if (arg0 < -49) {
            ++field601;
            int var2 = 0;
            while (!this.field458.attach()) {
                if (~(var2++) < -6) {
                    throw new RuntimeException("");
                }
                class477.method2826(1000L, 0);
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "Z", descriptor = "()I", line = 3991)
    public final int method338() {
        ++field482;
        int var1 = this.field762;
        this.field762 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "(B)V", line = 4003)
    public final void method339(byte arg0) {
        ++field484;
        if (arg0 != -117) {
            this.field750 = 71;
        }
        if (~this.field760 != -17) {
            this.method186((byte) -126);
            this.method348(3, true);
            this.method296((byte) -81, true);
            this.method286(arg0 + 116, true);
            this.method229(1, -93);
            this.method249(0, -2);
            this.field760 = 16;
        }
    }

    @OriginalMember(owner = "client!bt", name = "y", descriptor = "()Z", line = 4024)
    public final boolean method340() {
        ++field570;
        return true;
    }

    @OriginalMember(owner = "client!bt", name = "A", descriptor = "(I)V", line = 4045)
    private final void method341(int arg0) {
        OpenGL.glLoadIdentity();
        ++field491;
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg0 == 3) {
            OpenGL.glMultMatrixf(this.field654.method3144((byte) -42), 0);
            if (this.field721) {
                this.field615.field2856.method50(104);
            }
            this.method260(-62);
            this.method321(-10057);
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(Lwr;I)V", line = 4067)
    public final void method342(class324 arg0, int arg1) {
        ++field453;
        if (arg1 != -29) {
            this.field753 = null;
        }
        if (~this.field630 <= -1 && this.field633[this.field630] == arg0) {
            this.field633[this.field630--] = null;
            arg0.method1879(arg1 ^ 37);
            if (~this.field630 <= -1) {
                this.field629 = this.field633[this.field630];
                this.field629.method1876(-1868);
            } else {
                this.field629 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(IIII)V", line = 4096)
    public final void method343(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glDrawArrays(arg1, arg0, arg3);
        ++field457;
        if (arg2 != 3) {
            this.method263(-113, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lnt;IIIII)V", line = 4111)
    public static final void method344(class152 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field2311 = 0;
        for (int var6 = 0; var6 < 4; ++var6) {
            if (arg0.field2314[var6] != null) {
                ++arg0.field2311;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field2311; ++var7) {
            long var8 = class297.field4444[arg1][arg2][arg3];
            while (var8 != 0L) {
                class130 var14 = client.field3117[(int) ((var8 & 65535L) - 1L)];
                var8 >>>= 16;
                if (arg0.field2314[var7] == var14.field2038) {
                    continue label50;
                }
            }
            long var10 = class297.field4444[arg1][arg4][arg5];
            while (var10 != 0L) {
                class130 var13 = client.field3117[(int) ((var10 & 65535L) - 1L)];
                var10 >>>= 16;
                if (arg0.field2314[var7] == var13.field2038) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field2311 - 1; ++var12) {
                arg0.field2314[var12] = arg0.field2314[var12 + 1];
            }
            --arg0.field2311;
        }
    }

    @OriginalMember(owner = "client!bt", name = "w", descriptor = "(IIII)V", line = 4165)
    public final void method345(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field573 > ~arg3) {
            arg3 = this.field573;
        }
        if (~this.field530 > ~arg2) {
            arg2 = this.field530;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (~arg0 > -1) {
            arg0 = 0;
        }
        ++field610;
        this.field710 = arg2;
        this.field688 = arg3;
        this.field671 = arg1;
        this.field742 = arg0;
        OpenGL.glEnable(3089);
        this.method309(false);
        this.method257(0);
    }

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "()Z", line = 4196)
    public final boolean method346() {
        ++field521;
        return true;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIB)V", line = 4207)
    public final synchronized void method347(int arg0, int arg1, byte arg2) {
        ++field550;
        class175 var4 = new class175(arg1);
        int var5 = 71 / ((arg2 - 3) / 32);
        var4.field863 = (long) arg0;
        this.field641.method866((byte) 10, var4);
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(IZ)V", line = 4225)
    public final void method348(int arg0, boolean arg1) {
        if (arg0 == 3) {
            ++field566;
            if (!arg1 != !this.field724) {
                this.field724 = arg1;
                this.method258(arg0 + -3);
                this.field760 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "B", descriptor = "(I)V", line = 4244)
    public final void method349(int arg0) {
        if (arg0 != 20397) {
            this.method220();
        }
        if (this.field730 != 0) {
            this.field730 = 0;
            this.field760 &= -32;
        }
        ++field443;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "()Z", line = 4263)
    public final boolean method350() {
        ++field461;
        return this.field614 != null && (~this.field606 >= -2 || this.field694);
    }

    @OriginalMember(owner = "client!bt", name = "K", descriptor = "(I)V", line = 4272)
    public final void method351(int arg0) {
        ++field454;
        this.field622 = 0;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field622;
        }
        this.field624 = 1 << this.field622;
    }

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "(B)V", line = 4287)
    private final void method352(byte arg0) {
        int var2 = 74 / ((arg0 - -32) / 49);
        if (this.field745 && !this.field695) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field535;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIZLjaggl/memory/NativeBuffer;I)Lus;", line = 4302)
    public final class1 method353(int arg0, int arg1, boolean arg2, NativeBuffer arg3, int arg4) {
        ++field579;
        if (!this.field672 || arg2 && !this.field716) {
            if (arg1 > -1) {
                this.method283();
            }
            return new class171(this, arg4, arg3);
        } else {
            return new class461(this, arg4, arg3, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!bt", name = "w", descriptor = "()Z", line = 4319)
    public final boolean method354() {
        ++field420;
        return true;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(FIFF)V", line = 4327)
    private final void method355(float arg0, int arg1, float arg2, float arg3) {
        ++field487;
        OpenGL.glMatrixMode(5890);
        if (this.field669) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg3, arg2, arg0);
        OpenGL.glMatrixMode(5888);
        if (arg1 != 2916) {
            this.method244((byte) 56);
        }
        this.field669 = true;
    }

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "(II)V", line = 4348)
    public final void method356(int arg0, int arg1) {
        class313.field4675[2] = (float) class168.method1203(arg0, arg1) / 255.0F;
        class313.field4675[1] = (float) class168.method1203(65280, arg0) / 65280.0F;
        class313.field4675[0] = (float) class168.method1203(arg0, 16711680) / 1.671168E7F;
        ++field516;
        class313.field4675[3] = (float) (arg0 >>> 24) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class313.field4675, 0);
    }

    @OriginalMember(owner = "client!bt", name = "C", descriptor = "(I)Lhp;", line = 4361)
    public final class221 method357(int arg0) {
        ++field599;
        if (arg0 >= -77) {
            return null;
        } else {
            return this.field731 != null ? this.field731.method599(79) : null;
        }
    }

    @OriginalMember(owner = "client!bt", name = "xa", descriptor = "()I", line = 4376)
    public final int method358() {
        ++field556;
        return this.field637 + this.field636 - -this.field634;
    }

    @OriginalMember(owner = "client!bt", name = "XA", descriptor = "(III[I)V", line = 4387)
    public final void method359(int arg0, int arg1, int arg2, int[] arg3) {
        ++field520;
        float var5 = (float) arg2 * this.field654.field7796 + (float) arg0 * this.field654.field7816 + (float) arg1 * this.field654.field7814 + this.field654.field7819;
        if (!(var5 < (float) this.field748) && !(var5 > (float) this.field683)) {
            int var6 = (int) (((float) arg2 * this.field654.field7809 + (float) arg0 * this.field654.field7822 + (float) arg1 * this.field654.field7821 + this.field654.field7806) * (float) this.field727 / var5);
            int var7 = (int) (((float) arg2 * this.field654.field7807 + (float) arg0 * this.field654.field7817 + (float) arg1 * this.field654.field7804 + this.field654.field7797) * (float) this.field741 / var5);
            if (this.field705 <= (float) var6 && this.field702 >= (float) var6 && this.field677 <= (float) var7 && (float) var7 <= this.field676) {
                arg3[0] = (int) ((float) var6 - this.field705);
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 - this.field677);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!bt", name = "U", descriptor = "()I", line = 4418)
    public final int method360() {
        ++field529;
        int var1 = this.field767;
        this.field767 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!bt", name = "S", descriptor = "(IIIII)V", line = 4429)
    public final void method361(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field605;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 4443)
    public final void method362(Canvas arg0) {
        ++field425;
        long var2 = 0L;
        if (arg0 != null && this.field464 != arg0) {
            if (this.field463.containsKey(arg0)) {
                Long var4 = (Long) this.field463.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field600;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field458.surfaceResized(var2);
            if (this.field477 == arg0) {
                this.method297(0);
            }
        }
    }
}
