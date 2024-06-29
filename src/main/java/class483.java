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

@OriginalClass("client!bi")
public class class483 extends class60 {

    @OriginalMember(owner = "client!bi", name = "ob", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field6613 = new Hashtable();

    @OriginalMember(owner = "client!bi", name = "pe", descriptor = "I")
    public int field6770 = 128;

    @OriginalMember(owner = "client!bi", name = "qe", descriptor = "Lob;")
    private class740 field6771 = new class740();

    @OriginalMember(owner = "client!bi", name = "re", descriptor = "Lqn;")
    private class65 field6772 = new class65();

    @OriginalMember(owner = "client!bi", name = "se", descriptor = "Lqn;")
    public class65 field6773 = new class65();

    @OriginalMember(owner = "client!bi", name = "te", descriptor = "I")
    public int field6774 = 8;

    @OriginalMember(owner = "client!bi", name = "ve", descriptor = "Z")
    private boolean field6776 = false;

    @OriginalMember(owner = "client!bi", name = "ue", descriptor = "I")
    public int field6775 = 3;

    @OriginalMember(owner = "client!bi", name = "ye", descriptor = "Lfh;")
    private class653 field6779 = new class653();

    @OriginalMember(owner = "client!bi", name = "De", descriptor = "I")
    private int field6784 = -1;

    @OriginalMember(owner = "client!bi", name = "Ae", descriptor = "I")
    private int field6781 = -1;

    @OriginalMember(owner = "client!bi", name = "Ee", descriptor = "I")
    private int field6785 = -1;

    @OriginalMember(owner = "client!bi", name = "Ie", descriptor = "[Ljm;")
    private class691[] field6789 = new class691[4];

    @OriginalMember(owner = "client!bi", name = "He", descriptor = "[Ljm;")
    private class691[] field6788 = new class691[4];

    @OriginalMember(owner = "client!bi", name = "Je", descriptor = "[Ljm;")
    private class691[] field6790 = new class691[4];

    @OriginalMember(owner = "client!bi", name = "Ke", descriptor = "Lfh;")
    private class653 field6791;

    @OriginalMember(owner = "client!bi", name = "Oe", descriptor = "Lfh;")
    private class653 field6795;

    @OriginalMember(owner = "client!bi", name = "Pe", descriptor = "Lfh;")
    private class653 field6796;

    @OriginalMember(owner = "client!bi", name = "Qe", descriptor = "Lfh;")
    private class653 field6797;

    @OriginalMember(owner = "client!bi", name = "Re", descriptor = "Lfh;")
    private class653 field6798;

    @OriginalMember(owner = "client!bi", name = "Se", descriptor = "Lfh;")
    private class653 field6799;

    @OriginalMember(owner = "client!bi", name = "Te", descriptor = "Lfh;")
    private class653 field6800;

    @OriginalMember(owner = "client!bi", name = "Ze", descriptor = "Lqn;")
    public class65 field6806;

    @OriginalMember(owner = "client!bi", name = "df", descriptor = "Lqn;")
    public class65 field6810;

    @OriginalMember(owner = "client!bi", name = "ef", descriptor = "Lqn;")
    public class65 field6811;

    @OriginalMember(owner = "client!bi", name = "of", descriptor = "I")
    public int field6820;

    @OriginalMember(owner = "client!bi", name = "xf", descriptor = "[F")
    private float[] field6829;

    @OriginalMember(owner = "client!bi", name = "Ef", descriptor = "F")
    private float field6836;

    @OriginalMember(owner = "client!bi", name = "kf", descriptor = "F")
    public float field6816;

    @OriginalMember(owner = "client!bi", name = "ff", descriptor = "I")
    public int field6812;

    @OriginalMember(owner = "client!bi", name = "Sf", descriptor = "I")
    private int field6850;

    @OriginalMember(owner = "client!bi", name = "ag", descriptor = "I")
    public int field6858;

    @OriginalMember(owner = "client!bi", name = "Xf", descriptor = "I")
    public int field6855;

    @OriginalMember(owner = "client!bi", name = "Of", descriptor = "I")
    public int field6846;

    @OriginalMember(owner = "client!bi", name = "fg", descriptor = "I")
    private int field6863;

    @OriginalMember(owner = "client!bi", name = "Vf", descriptor = "F")
    public float field6853;

    @OriginalMember(owner = "client!bi", name = "ug", descriptor = "Z")
    private boolean field6878;

    @OriginalMember(owner = "client!bi", name = "ng", descriptor = "[F")
    public float[] field6871;

    @OriginalMember(owner = "client!bi", name = "qg", descriptor = "[Llaa;")
    private class123[] field6874;

    @OriginalMember(owner = "client!bi", name = "pf", descriptor = "[F")
    private float[] field6821;

    @OriginalMember(owner = "client!bi", name = "bg", descriptor = "F")
    private float field6859;

    @OriginalMember(owner = "client!bi", name = "If", descriptor = "I")
    private int field6840;

    @OriginalMember(owner = "client!bi", name = "Zf", descriptor = "I")
    public int field6857;

    @OriginalMember(owner = "client!bi", name = "jg", descriptor = "I")
    private int field6867;

    @OriginalMember(owner = "client!bi", name = "Qf", descriptor = "F")
    public float field6848;

    @OriginalMember(owner = "client!bi", name = "Bg", descriptor = "I")
    private int field6885;

    @OriginalMember(owner = "client!bi", name = "Ig", descriptor = "F")
    public float field6892;

    @OriginalMember(owner = "client!bi", name = "Lg", descriptor = "I")
    private int field6895;

    @OriginalMember(owner = "client!bi", name = "Kg", descriptor = "I")
    private int field6894;

    @OriginalMember(owner = "client!bi", name = "tg", descriptor = "I")
    public int field6877;

    @OriginalMember(owner = "client!bi", name = "xg", descriptor = "F")
    private float field6881;

    @OriginalMember(owner = "client!bi", name = "og", descriptor = "I")
    private int field6872;

    @OriginalMember(owner = "client!bi", name = "hf", descriptor = "I")
    public int field6814;

    @OriginalMember(owner = "client!bi", name = "Pg", descriptor = "F")
    public float field6899;

    @OriginalMember(owner = "client!bi", name = "uf", descriptor = "F")
    private float field6826;

    @OriginalMember(owner = "client!bi", name = "jf", descriptor = "Z")
    private boolean field6815;

    @OriginalMember(owner = "client!bi", name = "gg", descriptor = "I")
    public int field6864;

    @OriginalMember(owner = "client!bi", name = "zg", descriptor = "I")
    private int field6883;

    @OriginalMember(owner = "client!bi", name = "Fg", descriptor = "[F")
    private float[] field6889;

    @OriginalMember(owner = "client!bi", name = "wf", descriptor = "I")
    private int field6828;

    @OriginalMember(owner = "client!bi", name = "Wg", descriptor = "F")
    private float field6906;

    @OriginalMember(owner = "client!bi", name = "jh", descriptor = "F")
    public float field6919;

    @OriginalMember(owner = "client!bi", name = "hh", descriptor = "I")
    public int field6917;

    @OriginalMember(owner = "client!bi", name = "lh", descriptor = "I")
    public int field6921;

    @OriginalMember(owner = "client!bi", name = "ih", descriptor = "[F")
    private float[] field6918;

    @OriginalMember(owner = "client!bi", name = "kh", descriptor = "F")
    public float field6920;

    @OriginalMember(owner = "client!bi", name = "Nf", descriptor = "Lfm;")
    public class736 field6845;

    @OriginalMember(owner = "client!bi", name = "nh", descriptor = "[I")
    public int[] field6923;

    @OriginalMember(owner = "client!bi", name = "rh", descriptor = "[I")
    public int[] field6927;

    @OriginalMember(owner = "client!bi", name = "sh", descriptor = "[B")
    public byte[] field6928;

    @OriginalMember(owner = "client!bi", name = "ph", descriptor = "[I")
    public int[] field6925;

    @OriginalMember(owner = "client!bi", name = "oe", descriptor = "I")
    public int field6769;

    @OriginalMember(owner = "client!bi", name = "Nc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6690;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6583;

    @OriginalMember(owner = "client!bi", name = "jc", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field6660;

    @OriginalMember(owner = "client!bi", name = "lc", descriptor = "J")
    private long field6662;

    @OriginalMember(owner = "client!bi", name = "fe", descriptor = "J")
    private long field6760;

    @OriginalMember(owner = "client!bi", name = "Tg", descriptor = "Z")
    public boolean field6903;

    @OriginalMember(owner = "client!bi", name = "Ff", descriptor = "I")
    public int field6837;

    @OriginalMember(owner = "client!bi", name = "Mf", descriptor = "Ljava/lang/String;")
    private String field6844;

    @OriginalMember(owner = "client!bi", name = "Rg", descriptor = "Z")
    public boolean field6901;

    @OriginalMember(owner = "client!bi", name = "cg", descriptor = "Z")
    private boolean field6860;

    @OriginalMember(owner = "client!bi", name = "Tf", descriptor = "Z")
    public boolean field6851;

    @OriginalMember(owner = "client!bi", name = "wg", descriptor = "Z")
    public boolean field6880;

    @OriginalMember(owner = "client!bi", name = "Af", descriptor = "Z")
    public boolean field6832;

    @OriginalMember(owner = "client!bi", name = "Jg", descriptor = "Z")
    private boolean field6893;

    @OriginalMember(owner = "client!bi", name = "vg", descriptor = "Ljava/lang/String;")
    private String field6879;

    @OriginalMember(owner = "client!bi", name = "dg", descriptor = "Z")
    public boolean field6861;

    @OriginalMember(owner = "client!bi", name = "bh", descriptor = "Z")
    private boolean field6911;

    @OriginalMember(owner = "client!bi", name = "je", descriptor = "Lag;")
    private class685 field6764;

    @OriginalMember(owner = "client!bi", name = "we", descriptor = "Ljo;")
    public class338 field6777;

    @OriginalMember(owner = "client!bi", name = "le", descriptor = "Lkba;")
    private class108 field6766;

    @OriginalMember(owner = "client!bi", name = "ke", descriptor = "Lqaa;")
    private class27 field6765;

    @OriginalMember(owner = "client!bi", name = "ie", descriptor = "Ldca;")
    private class179 field6763;

    @OriginalMember(owner = "client!bi", name = "sf", descriptor = "F")
    public float field6824;

    @OriginalMember(owner = "client!bi", name = "Df", descriptor = "F")
    public float field6835;

    @OriginalMember(owner = "client!bi", name = "Gf", descriptor = "F")
    public float field6838;

    @OriginalMember(owner = "client!bi", name = "Lf", descriptor = "F")
    private float field6843;

    @OriginalMember(owner = "client!bi", name = "mg", descriptor = "F")
    private float field6870;

    @OriginalMember(owner = "client!bi", name = "Vg", descriptor = "F")
    public float field6905;

    @OriginalMember(owner = "client!bi", name = "Xg", descriptor = "F")
    public float field6907;

    @OriginalMember(owner = "client!bi", name = "gh", descriptor = "F")
    public float field6916;

    @OriginalMember(owner = "client!bi", name = "mh", descriptor = "F")
    private float field6922;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!bi", name = "Z", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!bi", name = "ab", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!bi", name = "bb", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!bi", name = "cb", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!bi", name = "db", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!bi", name = "eb", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!bi", name = "fb", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!bi", name = "gb", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!bi", name = "hb", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!bi", name = "ib", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!bi", name = "jb", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!bi", name = "kb", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!bi", name = "lb", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!bi", name = "mb", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!bi", name = "nb", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!bi", name = "pb", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!bi", name = "qb", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!bi", name = "rb", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!bi", name = "sb", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!bi", name = "tb", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!bi", name = "ub", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!bi", name = "vb", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!bi", name = "wb", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!bi", name = "xb", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!bi", name = "yb", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!bi", name = "zb", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!bi", name = "Ab", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!bi", name = "Bb", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!bi", name = "Cb", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!bi", name = "Db", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!bi", name = "Eb", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!bi", name = "Fb", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!bi", name = "Gb", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!bi", name = "Hb", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!bi", name = "Ib", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!bi", name = "Jb", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!bi", name = "Kb", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!bi", name = "Lb", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!bi", name = "Mb", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!bi", name = "Nb", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!bi", name = "Ob", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!bi", name = "Pb", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!bi", name = "Qb", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!bi", name = "Rb", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!bi", name = "Sb", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!bi", name = "Tb", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!bi", name = "Ub", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!bi", name = "Vb", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!bi", name = "Wb", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!bi", name = "Xb", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!bi", name = "Yb", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!bi", name = "Zb", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!bi", name = "ac", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!bi", name = "bc", descriptor = "I")
    private int field6652;

    @OriginalMember(owner = "client!bi", name = "cc", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!bi", name = "dc", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!bi", name = "ec", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!bi", name = "fc", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!bi", name = "gc", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!bi", name = "hc", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!bi", name = "ic", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!bi", name = "kc", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!bi", name = "mc", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!bi", name = "nc", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!bi", name = "oc", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!bi", name = "pc", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!bi", name = "qc", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!bi", name = "rc", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!bi", name = "sc", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!bi", name = "tc", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!bi", name = "uc", descriptor = "I")
    public int field6671;

    @OriginalMember(owner = "client!bi", name = "vc", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!bi", name = "wc", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!bi", name = "xc", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!bi", name = "yc", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!bi", name = "zc", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!bi", name = "Ac", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!bi", name = "Bc", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!bi", name = "Cc", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!bi", name = "Dc", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!bi", name = "Ec", descriptor = "I")
    public int field6681;

    @OriginalMember(owner = "client!bi", name = "Fc", descriptor = "I")
    public static int field6682;

    @OriginalMember(owner = "client!bi", name = "Gc", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!bi", name = "Hc", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!bi", name = "Ic", descriptor = "I")
    public static int field6685;

    @OriginalMember(owner = "client!bi", name = "Jc", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!bi", name = "Kc", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!bi", name = "Lc", descriptor = "I")
    public static int field6688;

    @OriginalMember(owner = "client!bi", name = "Mc", descriptor = "I")
    public static int field6689;

    @OriginalMember(owner = "client!bi", name = "Oc", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!bi", name = "Pc", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!bi", name = "Qc", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!bi", name = "Rc", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!bi", name = "Sc", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!bi", name = "Tc", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!bi", name = "Uc", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!bi", name = "Vc", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!bi", name = "Wc", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!bi", name = "Xc", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!bi", name = "Yc", descriptor = "I")
    public static int field6701;

    @OriginalMember(owner = "client!bi", name = "Zc", descriptor = "I")
    public static int field6702;

    @OriginalMember(owner = "client!bi", name = "ad", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!bi", name = "bd", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!bi", name = "cd", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!bi", name = "dd", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!bi", name = "ed", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!bi", name = "fd", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!bi", name = "gd", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!bi", name = "hd", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!bi", name = "id", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!bi", name = "jd", descriptor = "I")
    public static int field6712;

    @OriginalMember(owner = "client!bi", name = "kd", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!bi", name = "ld", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!bi", name = "md", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!bi", name = "nd", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!bi", name = "od", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!bi", name = "pd", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!bi", name = "qd", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!bi", name = "rd", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!bi", name = "sd", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!bi", name = "td", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!bi", name = "ud", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!bi", name = "vd", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!bi", name = "wd", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!bi", name = "xd", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!bi", name = "yd", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!bi", name = "zd", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!bi", name = "Ad", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!bi", name = "Bd", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!bi", name = "Cd", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!bi", name = "Dd", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!bi", name = "Ed", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!bi", name = "Fd", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!bi", name = "Gd", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!bi", name = "Hd", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!bi", name = "Id", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!bi", name = "Jd", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!bi", name = "Kd", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!bi", name = "Ld", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!bi", name = "Md", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!bi", name = "Nd", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!bi", name = "Od", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!bi", name = "Pd", descriptor = "I")
    private int field6744;

    @OriginalMember(owner = "client!bi", name = "Qd", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!bi", name = "Rd", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!bi", name = "Sd", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!bi", name = "Td", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!bi", name = "Ud", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!bi", name = "Vd", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!bi", name = "Wd", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!bi", name = "Xd", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!bi", name = "Yd", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!bi", name = "Zd", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!bi", name = "ae", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!bi", name = "be", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!bi", name = "ce", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!bi", name = "de", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!bi", name = "ee", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!bi", name = "ge", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!bi", name = "he", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!bi", name = "me", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!bi", name = "ne", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!bi", name = "ze", descriptor = "I")
    public int field6780;

    @OriginalMember(owner = "client!bi", name = "Le", descriptor = "I")
    public int field6792;

    @OriginalMember(owner = "client!bi", name = "Me", descriptor = "I")
    private int field6793;

    @OriginalMember(owner = "client!bi", name = "Ne", descriptor = "I")
    public int field6794;

    @OriginalMember(owner = "client!bi", name = "Ye", descriptor = "I")
    private int field6805;

    @OriginalMember(owner = "client!bi", name = "af", descriptor = "I")
    private int field6807;

    @OriginalMember(owner = "client!bi", name = "cf", descriptor = "I")
    private int field6809;

    @OriginalMember(owner = "client!bi", name = "gf", descriptor = "I")
    private int field6813;

    @OriginalMember(owner = "client!bi", name = "Bf", descriptor = "I")
    private int field6833;

    @OriginalMember(owner = "client!bi", name = "Cf", descriptor = "I")
    public int field6834;

    @OriginalMember(owner = "client!bi", name = "Jf", descriptor = "I")
    private int field6841;

    @OriginalMember(owner = "client!bi", name = "Pf", descriptor = "I")
    private int field6847;

    @OriginalMember(owner = "client!bi", name = "Yf", descriptor = "I")
    private int field6856;

    @OriginalMember(owner = "client!bi", name = "ig", descriptor = "I")
    private int field6866;

    @OriginalMember(owner = "client!bi", name = "sg", descriptor = "I")
    private int field6876;

    @OriginalMember(owner = "client!bi", name = "Cg", descriptor = "I")
    public int field6886;

    @OriginalMember(owner = "client!bi", name = "Gg", descriptor = "I")
    public int field6890;

    @OriginalMember(owner = "client!bi", name = "Sg", descriptor = "I")
    private int field6902;

    @OriginalMember(owner = "client!bi", name = "Zg", descriptor = "I")
    public int field6909;

    @OriginalMember(owner = "client!bi", name = "oh", descriptor = "I")
    private int field6924;

    @OriginalMember(owner = "client!bi", name = "qh", descriptor = "I")
    private int field6926;

    @OriginalMember(owner = "client!bi", name = "Ue", descriptor = "J")
    private long field6801;

    @OriginalMember(owner = "client!bi", name = "mf", descriptor = "Lju;")
    private class128 field6818;

    @OriginalMember(owner = "client!bi", name = "Rf", descriptor = "Lju;")
    private class128 field6849;

    @OriginalMember(owner = "client!bi", name = "Ug", descriptor = "Lg;")
    private class158 field6904;

    @OriginalMember(owner = "client!bi", name = "pg", descriptor = "Lbq;")
    public class293 field6873;

    @OriginalMember(owner = "client!bi", name = "kg", descriptor = "Lcb;")
    private class523 field6868;

    @OriginalMember(owner = "client!bi", name = "zf", descriptor = "Lbaa;")
    private class525 field6831;

    @OriginalMember(owner = "client!bi", name = "qf", descriptor = "Luo;")
    public class578 field6822;

    @OriginalMember(owner = "client!bi", name = "Wf", descriptor = "Luo;")
    public class578 field6854;

    @OriginalMember(owner = "client!bi", name = "Be", descriptor = "Lre;")
    private class603 field6782;

    @OriginalMember(owner = "client!bi", name = "Ce", descriptor = "Lmj;")
    private class656 field6783;

    @OriginalMember(owner = "client!bi", name = "Kf", descriptor = "Lmj;")
    public class656 field6842;

    @OriginalMember(owner = "client!bi", name = "lf", descriptor = "Llw;")
    public class662 field6817;

    @OriginalMember(owner = "client!bi", name = "Hf", descriptor = "Llw;")
    public class662 field6839;

    @OriginalMember(owner = "client!bi", name = "hg", descriptor = "Llw;")
    public class662 field6865;

    @OriginalMember(owner = "client!bi", name = "lg", descriptor = "Llw;")
    public class662 field6869;

    @OriginalMember(owner = "client!bi", name = "Dg", descriptor = "Llw;")
    public class662 field6887;

    @OriginalMember(owner = "client!bi", name = "Hg", descriptor = "Llw;")
    public class662 field6891;

    @OriginalMember(owner = "client!bi", name = "Ng", descriptor = "Llw;")
    public class662 field6897;

    @OriginalMember(owner = "client!bi", name = "Qg", descriptor = "Llw;")
    public class662 field6900;

    @OriginalMember(owner = "client!bi", name = "ch", descriptor = "Llw;")
    public class662 field6912;

    @OriginalMember(owner = "client!bi", name = "dh", descriptor = "Llw;")
    public class662 field6913;

    @OriginalMember(owner = "client!bi", name = "Fe", descriptor = "Ljm;")
    private class691 field6786;

    @OriginalMember(owner = "client!bi", name = "Ge", descriptor = "Ljm;")
    private class691 field6787;

    @OriginalMember(owner = "client!bi", name = "xe", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field6778;

    @OriginalMember(owner = "client!bi", name = "Ve", descriptor = "Z")
    private boolean field6802;

    @OriginalMember(owner = "client!bi", name = "We", descriptor = "Z")
    private boolean field6803;

    @OriginalMember(owner = "client!bi", name = "Xe", descriptor = "Z")
    private boolean field6804;

    @OriginalMember(owner = "client!bi", name = "bf", descriptor = "Z")
    private boolean field6808;

    @OriginalMember(owner = "client!bi", name = "nf", descriptor = "Z")
    public boolean field6819;

    @OriginalMember(owner = "client!bi", name = "rf", descriptor = "Z")
    private boolean field6823;

    @OriginalMember(owner = "client!bi", name = "tf", descriptor = "Z")
    public boolean field6825;

    @OriginalMember(owner = "client!bi", name = "vf", descriptor = "Z")
    public boolean field6827;

    @OriginalMember(owner = "client!bi", name = "yf", descriptor = "Z")
    private boolean field6830;

    @OriginalMember(owner = "client!bi", name = "Uf", descriptor = "Z")
    private boolean field6852;

    @OriginalMember(owner = "client!bi", name = "eg", descriptor = "Z")
    private boolean field6862;

    @OriginalMember(owner = "client!bi", name = "rg", descriptor = "Z")
    public boolean field6875;

    @OriginalMember(owner = "client!bi", name = "Ag", descriptor = "Z")
    private boolean field6884;

    @OriginalMember(owner = "client!bi", name = "Eg", descriptor = "Z")
    public boolean field6888;

    @OriginalMember(owner = "client!bi", name = "Mg", descriptor = "Z")
    private boolean field6896;

    @OriginalMember(owner = "client!bi", name = "Og", descriptor = "Z")
    private boolean field6898;

    @OriginalMember(owner = "client!bi", name = "Yg", descriptor = "Z")
    public boolean field6908;

    @OriginalMember(owner = "client!bi", name = "ah", descriptor = "Z")
    public boolean field6910;

    @OriginalMember(owner = "client!bi", name = "eh", descriptor = "Z")
    public boolean field6914;

    @OriginalMember(owner = "client!bi", name = "fh", descriptor = "Z")
    public boolean field6915;

    @OriginalMember(owner = "client!bi", name = "yg", descriptor = "[Lcj;")
    private class695[] field6882;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZ[BI)Lg;")
    public final class158 method2774(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        ++field6576;
        if (!this.field6860 || arg2 && !this.field6893) {
            if (arg0 > -7) {
                this.method540((class714) null, -111, 10, -97, -35);
            }
            return new class256(this, arg4, arg3, arg1);
        } else {
            return new class678(this, arg4, arg3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBII)V")
    public final void method2775(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -88) {
            this.field6805 = 56;
        }
        ++field6611;
        OpenGL.glTexEnvi(8960, 34176 - -arg3, arg0);
        OpenGL.glTexEnvi(8960, arg3 + 34192, arg2);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)V")
    public final void method2776(int arg0, boolean arg1) {
        if (arg0 != 1) {
            this.field6792 = -72;
        }
        ++field6759;
        if (!arg1 == this.field6830) {
            this.field6830 = arg1;
            this.method2829((byte) -63);
            this.field6809 &= -8;
        }
    }

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(II)V")
    public final void method2777(int arg0, int arg1) {
        if (arg1 != 1) {
            this.field6907 = -0.56719893F;
        }
        ++field6565;
        this.method2812(arg0, false, true);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([IIIIIZ)Liea;")
    public final class481 method535(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6585;
        return new class603(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "()V")
    public final void method522() {
        this.field6766.method867(0);
        ++field6688;
    }

    @OriginalMember(owner = "client!bi", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method548(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field6689;
        boolean var7 = ~this.field6828 != ~arg0;
        if (var7 || this.field6919 != arg1 || this.field6848 != arg2) {
            this.field6828 = arg0;
            this.field6848 = arg2;
            this.field6919 = arg1;
            if (var7) {
                this.field6892 = (float) (this.field6828 & 16711680) / 1.671168E7F;
                this.field6899 = (float) (65280 & this.field6828) / 65280.0F;
                this.field6816 = (float) (this.field6828 & 255) / 255.0F;
                this.method2840((byte) 91);
            }
            this.method2827((byte) 112);
        }
        if (this.field6821[0] != arg3 || this.field6821[1] != arg4 || this.field6821[2] != arg5) {
            this.field6821[2] = arg5;
            this.field6821[0] = arg3;
            this.field6821[1] = arg4;
            this.field6829[2] = -arg5;
            this.field6829[0] = -arg3;
            this.field6829[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field6871[1] = arg4 * var8;
            this.field6871[0] = arg3 * var8;
            this.field6871[2] = arg5 * var8;
            this.field6918[2] = -this.field6871[2];
            this.field6918[1] = -this.field6871[1];
            this.field6918[0] = -this.field6871[0];
            this.method2853(-20561);
            this.field6886 = (int) (arg3 * 256.0F / arg4);
            this.field6834 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "()[I")
    public final int[] method509() {
        ++field6612;
        return new int[] { this.field6921, this.field6877, this.field6820, this.field6857 };
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(IIZ)V")
    public final synchronized void method2778(int arg0, int arg1, boolean arg2) {
        ++field6584;
        class393 var4 = new class393(arg1);
        var4.field2333 = (long) arg0;
        this.field6798.method3671(var4, false);
        if (!arg2) {
            this.method463(-0.6450036F, -0.43986756F, -0.013198544F);
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
    private final void method2779(int arg0) {
        this.method2777(-2, 1);
        ++field6564;
        for (int var2 = this.field6890 + -1; var2 >= 0; --var2) {
            this.method2847(var2, false);
            this.method2850(-66, (class695) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2799(-27874, 8448, 8448);
        this.method2775(34168, (byte) -88, 770, 2);
        this.method2806(8960);
        this.field6805 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field6807 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field6804 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field6803 = true;
        int var3 = -83 / ((arg0 - 70) / 43);
        this.method2789(true, 16160);
        this.method2776(1, true);
        this.method2801(-1, true);
        this.method2816((byte) -21, true);
        this.method2785(-1);
        this.field6660.setSwapInterval(0);
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
        float[] var4 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var5 = 0; var5 < 8; ++var5) {
            int var6 = var5 + 16384;
            OpenGL.glLightfv(var6, 4608, var4, 0);
            OpenGL.glLightf(var6, 4615, 0.0F);
            OpenGL.glLightf(var6, 4616, 0.0F);
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field6828 = this.field6864 = -1;
        this.method446();
    }

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "()Z")
    public final boolean method474() {
        ++field6724;
        return true;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZZ)V")
    public final void method2780(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (this.field6866 != arg0 || this.field6915 != this.field6815) {
            class293 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field6915 ? 3 : 0;
            if (arg0 < 0) {
                this.method2806(8960);
            } else {
                var5 = this.field6764.method3853(arg0, -118);
                class537 var10 = super.field830.method1072(arg0, true);
                if (~var10.field7441 == -1 && ~var10.field7444 == -1) {
                    this.method2806(8960);
                } else {
                    int var11 = var10.field7460 ? 64 : 128;
                    int var12 = var11 * 50;
                    this.method2807((float) (this.field6780 % var12 * var10.field7444) / (float) var12, 0.0F, false, (float) (this.field6780 % var12 * var10.field7441) / (float) var12);
                }
                var6 = var10.field7458;
                if (!this.field6915) {
                    var7 = var10.field7449;
                    var8 = var10.field7439;
                    var9 = var10.field7443;
                }
            }
            this.field6763.method1224(var9, arg2, var7, (byte) 41, arg3, var8);
            if (!this.field6763.method1225((byte) 82, var5, var6)) {
                this.method2850(102, var5);
                this.method2800(var6, 125);
            }
            this.field6866 = arg0;
            this.field6815 = this.field6915;
        }
        if (arg1 >= 126) {
            ++field6747;
            this.field6809 &= -8;
        }
    }

    @OriginalMember(owner = "client!bi", name = "EA", descriptor = "(IIII)V")
    public final void method453(int arg0, int arg1, int arg2, int arg3) {
        ++field6654;
        if (!this.field6915) {
            throw new RuntimeException("");
        } else {
            this.field6846 = arg2;
            this.field6909 = arg0;
            this.field6917 = arg1;
            this.field6812 = arg3;
            if (this.field6815) {
                this.field6763.field2511.method1177(true);
                this.field6763.field2511.method1179(true);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZI)V")
    public final void method2781(boolean arg0, int arg1) {
        if (arg1 == -925) {
            ++field6653;
            if (!arg0 == this.field6884) {
                this.field6884 = arg0;
                this.method2829((byte) -73);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
    private final void method2782(byte arg0) {
        ++field6668;
        if (~this.field6847 != -3) {
            this.field6847 = 2;
            this.method2796((byte) 77);
            this.method2830(-2);
            this.field6809 &= -8;
        }
        if (arg0 > -112) {
            this.field6812 = -94;
        }
    }

    @OriginalMember(owner = "client!bi", name = "DA", descriptor = "(IIII)V")
    public final void method437(int arg0, int arg1, int arg2, int arg3) {
        this.field6857 = arg3;
        ++field6704;
        this.field6877 = arg1;
        this.field6921 = arg0;
        this.field6820 = arg2;
        this.method2835((byte) 36);
        this.method2803(0);
        if (~this.field6847 == -4) {
            this.method2811((byte) 95);
        } else if (~this.field6847 == -3) {
            this.method2796((byte) 77);
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "()Z")
    public final boolean method442() {
        ++field6676;
        return this.field6765 != null && this.field6765.method1517(-19346);
    }

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "(III)V")
    public final void method457(int arg0, int arg1, int arg2) {
        ++field6599;
        if (~this.field6864 != ~arg0 || ~this.field6814 != ~arg1 || ~this.field6858 != ~arg2) {
            this.field6864 = arg0;
            this.field6858 = arg2;
            this.field6814 = arg1;
            this.method2845(650342096);
            this.method2793((byte) 1);
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)V")
    private final void method2783(byte arg0) {
        if (arg0 == 79) {
            if (this.field6847 != 1) {
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadIdentity();
                if (~this.field6681 < -1 && ~this.field6671 < -1) {
                    OpenGL.glOrtho(0.0D, (double) this.field6681, (double) this.field6671, 0.0D, -1.0D, 1.0D);
                }
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadIdentity();
                this.field6847 = 1;
                this.field6809 &= -25;
            }
            ++field6740;
        }
    }

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "(I)V")
    public final void method2784(int arg0) {
        ++field6675;
        if (~this.field6809 != arg0) {
            this.method2782((byte) -120);
            this.method2789(true, 16160);
            this.method2801(-1, true);
            this.method2816((byte) -18, true);
            this.method2844(118, 1);
            this.field6809 = 8;
        }
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(I)V")
    public final void method461(int arg0) {
        ++field6702;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIZ)Liea;")
    public final class481 method527(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field6580;
        return new class603(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class282 method539(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field6682;
        return new class707(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "(I)V")
    public final void method2785(int arg0) {
        if (~this.field6847 != arg0) {
            this.field6847 = 0;
            this.field6809 &= -32;
        }
        ++field6714;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIII)V")
    public final void method472(int arg0, int arg1, int arg2, int arg3) {
        ++field6711;
        this.field6766.method865(arg2, arg0, (byte) 90, arg3, arg1);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)I")
    public final int method484(int arg0, int arg1) {
        ++field6574;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "()Lnia;")
    public final class647 method499() {
        ++field6726;
        int var1 = -1;
        if (this.field6879.indexOf("nvidia") == -1) {
            if (this.field6879.indexOf("intel") == -1) {
                if (this.field6879.indexOf("ati") != -1) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class647(var1, "OpenGL", this.field6813, this.field6844, 0L);
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(II)Lhca;")
    public final class492 method523(int arg0, int arg1) {
        ++field6601;
        return null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
    public final synchronized void method2786(int arg0, int arg1, int arg2) {
        ++field6598;
        class393 var4 = new class393(arg0);
        var4.field2333 = (long) arg2;
        if (arg1 > 40) {
            this.field6796.method3671(var4, false);
        }
    }

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "(I)I")
    private final int method2787(int arg0) {
        ++field6725;
        int var2 = 0;
        this.field6879 = OpenGL.glGetString(7936).toLowerCase();
        this.field6844 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field6879.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field6879.indexOf("brian paul") != -1 || this.field6879.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class249.method1538(' ', 0, var3.replace('.', ' '));
        if (var4.length >= 2) {
            try {
                int var5 = class160.method1124(var4[0], 116);
                int var6 = class160.method1124(var4[1], 112);
                this.field6813 = var5 * 10 - -var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (this.field6813 < 12) {
            var2 |= 2;
        }
        if (!this.field6660.method3509("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field6660.method3509("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field6890 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field6856 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field6841 = var7[0];
        if (this.field6890 < 2 || this.field6856 < 2 || ~this.field6841 > -3) {
            var2 |= 16;
        }
        this.field6903 = Stream.method3798();
        this.field6898 = this.field6660.arePbuffersAvailable();
        this.field6860 = this.field6660.method3509("GL_ARB_vertex_buffer_object");
        this.field6862 = this.field6660.method3509("GL_ARB_multisample");
        this.field6827 = this.field6660.method3509("GL_ARB_vertex_program");
        this.field6660.method3509("GL_ARB_fragment_program");
        this.field6819 = this.field6660.method3509("GL_ARB_vertex_shader");
        this.field6888 = this.field6660.method3509("GL_ARB_fragment_shader");
        this.field6851 = this.field6660.method3509("GL_EXT_texture3D");
        this.field6880 = this.field6660.method3509("GL_ARB_texture_rectangle");
        this.field6914 = this.field6660.method3509("GL_ARB_texture_cube_map");
        this.field6901 = this.field6660.method3509("GL_ARB_texture_float");
        this.field6875 = false;
        this.field6861 = this.field6660.method3509("GL_EXT_framebuffer_object");
        this.field6910 = this.field6660.method3509("GL_EXT_framebuffer_blit");
        this.field6908 = this.field6660.method3509("GL_EXT_framebuffer_multisample");
        this.field6896 = this.field6908 & this.field6910;
        this.field6825 = class540.field7475.startsWith("mac");
        OpenGL.glGetFloatv(2834, class275.field3459, 0);
        this.field6906 = class275.field3459[arg0];
        this.field6826 = class275.field3459[1];
        return var2 == 0 ? 0 : var2;
    }

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "()Z")
    public final boolean method498() {
        ++field6728;
        return false;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Llga;IIII)Lka;")
    public final class474 method540(class714 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6644;
        return new class662(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(IIIIII)V")
    public final void method460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6609;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method2841(false);
        this.method2844(106, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field6862) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field6862) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "()I")
    public final int method451() {
        ++field6588;
        return this.field6855;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZI)V")
    public final void method2788(int arg0, int arg1, boolean arg2, int arg3) {
        ++field6577;
        OpenGL.glTexEnvi(8960, arg3 + 34184, arg1);
        if (!arg2) {
            OpenGL.glTexEnvi(8960, arg3 + 34200, arg0);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(ZI)V")
    public final void method2789(boolean arg0, int arg1) {
        ++field6608;
        if (this.field6852 != arg0) {
            this.field6852 = arg0;
            this.method2793((byte) 1);
            this.field6809 &= -32;
        }
        if (arg1 != 16160) {
            this.method2839(73);
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(IIIIII)Lmda;")
    public final class267 method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6703;
        return this.field6914 ? new class58(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lmda;Lmda;FLmda;)Lmda;")
    public final class267 method485(class267 arg0, class267 arg1, float arg2, class267 arg3) {
        ++field6579;
        if (arg0 != null && arg1 != null && this.field6914 && this.field6861) {
            class106 var5 = null;
            class523 var6 = (class523) arg0;
            class523 var7 = (class523) arg1;
            class193 var8 = var6.method420(22);
            class193 var9 = var7.method420(22);
            if (var8 != null && var9 != null) {
                int var10 = var8.field2643 > var9.field2643 ? var8.field2643 : var9.field2643;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class106) {
                    class106 var11 = (class106) arg3;
                    if (~var10 == ~var11.method857(96)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class106(this, var10);
                }
                if (var5.method860(var8, (byte) 119, var9, arg2)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class489 arg6, int arg7, int arg8) {
        ++field6606;
        class622 var10 = (class622) arg6;
        class525 var11 = var10.field8565;
        this.method2804((byte) 23);
        this.method2850(113, var10.field8565);
        this.method2844(116, arg5);
        this.method2799(-27874, 7681, 8448);
        this.method2775(34167, (byte) -88, 768, 0);
        float var12 = var11.field7335 / (float) var11.field7334;
        float var13 = var11.field7330 / (float) var11.field7336;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var15 * var16;
        float var18 = var14 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var18 + 0.35F, (float) arg3 + var17 + 0.35F);
        OpenGL.glEnd();
        this.method2775(5890, (byte) -88, 768, 0);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZFF)V")
    public final void method2790(boolean arg0, float arg1, float arg2) {
        ++field6628;
        if (arg0) {
            this.method2815((byte) -112, (class691) null);
        }
        this.field6836 = arg1;
        this.field6859 = arg2;
        this.method2845(650342096);
    }

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "(I)V")
    private final void method2791(int arg0) {
        this.field6660.method3511();
        if (arg0 == -5122) {
            ++field6701;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([I)V")
    public final void method454(int[] arg0) {
        ++field6758;
        arg0[1] = this.field6671;
        arg0[0] = this.field6681;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)V")
    public final synchronized void method2792(int arg0, byte arg1) {
        ++field6635;
        class393 var3 = new class393(arg0);
        if (arg1 >= 29) {
            this.field6797.method3671(var3, false);
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(B)V")
    private final void method2793(byte arg0) {
        if (this.field6852 && this.field6814 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field6603;
        if (arg0 != 1) {
            this.method2821((byte) 101, (class578) null, (class578) null, (class578) null, (class578) null);
        }
    }

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "(I)V")
    private final void method2794(int arg0) {
        ++field6752;
        if (arg0 != 1) {
            this.field6816 = -0.049744304F;
        }
        OpenGL.glViewport(this.field6863, this.field6894, this.field6681, this.field6671);
    }

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "(I)V")
    private final void method2795(int arg0) {
        ++field6569;
        this.field6882 = new class695[this.field6890];
        this.field6873 = new class293(this, 3553, 6408, 1, 1);
        new class293(this, 3553, 6408, 1, 1);
        new class293(this, 3553, 6408, 1, 1);
        this.field6912 = new class662(this);
        this.field6839 = new class662(this);
        this.field6887 = new class662(this);
        if (arg0 != 2) {
            this.field6861 = true;
        }
        this.field6817 = new class662(this);
        this.field6891 = new class662(this);
        this.field6897 = new class662(this);
        this.field6869 = new class662(this);
        this.field6913 = new class662(this);
        this.field6865 = new class662(this);
        this.field6900 = new class662(this);
        if (this.field6861) {
            this.field6842 = new class656(this);
            new class656(this);
        }
    }

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "(IIII)V")
    public final void method525(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field6872 > ~arg0) {
            this.field6872 = arg0;
        }
        if (~arg2 > ~this.field6885) {
            this.field6885 = arg2;
        }
        if (~this.field6895 > ~arg1) {
            this.field6895 = arg1;
        }
        if (~this.field6850 < ~arg3) {
            this.field6850 = arg3;
        }
        ++field6573;
        OpenGL.glEnable(3089);
        this.method2803(0);
        this.method2802(26781);
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(B)V")
    private final void method2796(byte arg0) {
        OpenGL.glMatrixMode(5889);
        ++field6658;
        if (arg0 != 77) {
            this.field6823 = true;
        }
        OpenGL.glLoadMatrixf(this.field6889, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!bi", name = "xa", descriptor = "(F)V")
    public final void method511(float arg0) {
        if (this.field6835 != arg0) {
            this.field6835 = arg0;
            this.method2840((byte) 91);
        }
        ++field6582;
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(B)V")
    public final void method2797(byte arg0) {
        ++field6735;
        if (arg0 != -27) {
            this.method470();
        }
        if (~this.field6809 != -17) {
            this.method2809(-4);
            this.method2789(true, 16160);
            this.method2801(-1, true);
            this.method2816((byte) -126, true);
            this.method2844(112, 1);
            this.field6809 = 16;
        }
    }

    @OriginalMember(owner = "client!bi", name = "da", descriptor = "(III[I)V")
    public final void method543(int arg0, int arg1, int arg2, int[] arg3) {
        ++field6639;
        float var5 = (float) arg2 * this.field6806.field913 + (float) arg0 * this.field6806.field905 + (float) arg1 * this.field6806.field935 + this.field6806.field927;
        if (!(var5 < (float) this.field6855) && !((float) this.field6840 < var5)) {
            int var6 = (int) (((float) arg2 * this.field6806.field916 + (float) arg0 * this.field6806.field915 + (float) arg1 * this.field6806.field936 + this.field6806.field914) * (float) this.field6820 / var5);
            int var7 = (int) (((float) arg2 * this.field6806.field906 + (float) arg0 * this.field6806.field937 + (float) arg1 * this.field6806.field925 + this.field6806.field921) * (float) this.field6857 / var5);
            if ((float) var6 >= this.field6907 && (float) var6 <= this.field6905 && this.field6824 <= (float) var7 && (float) var7 <= this.field6916) {
                arg3[0] = (int) ((float) var6 - this.field6907);
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 + -this.field6824);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "(IIIII)V")
    public final void method477(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2841(false);
        ++field6693;
        this.method2844(114, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(Z)V")
    public final void method2798(boolean arg0) {
        if (this.field6809 != 4) {
            this.method2783((byte) 79);
            this.method2789(false, 16160);
            this.method2776(1, false);
            this.method2801(-1, false);
            this.method2816((byte) -16, false);
            this.method2777(-2, 1);
            this.method2844(126, 1);
            this.field6809 = 4;
        }
        ++field6746;
        if (!arg0) {
            this.method2829((byte) -18);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "()Z")
    public final boolean method431() {
        ++field6624;
        return true;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)V")
    public final void method2799(int arg0, int arg1, int arg2) {
        ++field6666;
        if (arg0 != -27874) {
            this.field6848 = -0.5648444F;
        }
        if (~this.field6902 == -1) {
            boolean var4 = false;
            if (~this.field6883 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                this.field6883 = arg1;
                var4 = true;
            }
            if (this.field6867 != arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                this.field6867 = arg2;
                var4 = true;
            }
            if (var4) {
                this.field6809 &= -30;
                return;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg1);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        }
    }

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "(I)V")
    public final void method506(int arg0) {
        ++field6597;
        this.method2823((byte) 68);
    }

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "(II)V")
    public final void method2800(int arg0, int arg1) {
        int var3 = 118 % ((arg1 - 79) / 44);
        ++field6578;
        if (~arg0 == -2) {
            this.method2799(-27874, 7681, 7681);
        } else if (arg0 == 0) {
            this.method2799(-27874, 8448, 8448);
        } else {
            if (~arg0 != -3) {
                if (arg0 == 3) {
                    this.method2799(-27874, 260, 8448);
                    return;
                }
                if (arg0 == 4) {
                    this.method2799(-27874, 34023, 34023);
                    return;
                }
            } else {
                this.method2799(-27874, 34165, 7681);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(IZ)V")
    public final void method2801(int arg0, boolean arg1) {
        if (arg0 == -1) {
            ++field6710;
            if (this.field6808 != arg1) {
                if (!arg1) {
                    OpenGL.glDisable(2929);
                } else {
                    OpenGL.glEnable(2929);
                }
                this.field6809 &= -32;
                this.field6808 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(II)V")
    public final void method497(int arg0, int arg1) throws class230 {
        try {
            this.field6660.swapBuffers();
        } catch (Exception var3) {
        }
        ++field6615;
    }

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "(I)V")
    private final void method2802(int arg0) {
        ++field6643;
        if (~this.field6885 <= ~this.field6872 && this.field6895 <= this.field6850) {
            OpenGL.glScissor(this.field6872 + this.field6863, -this.field6850 + this.field6894 + this.field6671, this.field6885 - this.field6872, -this.field6895 + this.field6850);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        if (arg0 != 26781) {
            this.method502();
        }
    }

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "(IIIII)V")
    public final void method491(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2841(false);
        ++field6642;
        this.method2844(127, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "(I)V")
    private final void method2803(int arg0) {
        this.field6905 = (float) (-this.field6921 + this.field6885);
        this.field6916 = (float) (this.field6850 - this.field6877);
        this.field6907 = (float) (-this.field6921 + this.field6872);
        this.field6824 = (float) (-this.field6877 + this.field6895);
        if (arg0 != 0) {
            this.method528(57, -93, 65, 118, -12, -32);
        }
        ++field6706;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "()I")
    public final int method436() {
        ++field6736;
        return 4;
    }

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "()Z")
    public final boolean method526() {
        ++field6607;
        return true;
    }

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(B)V")
    public final void method2804(byte arg0) {
        ++field6594;
        if (~this.field6809 != -3) {
            this.method2783((byte) 79);
            this.method2789(false, arg0 ^ 16183);
            this.method2776(1, false);
            this.method2801(-1, false);
            this.method2816((byte) -90, false);
            this.method2777(-2, 1);
            this.field6809 = 2;
        }
        if (arg0 != 23) {
            this.field6744 = -47;
        }
    }

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "()V")
    public final void method469() {
        OpenGL.glFinish();
        ++field6640;
    }

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "()Z")
    public final boolean method490() {
        ++field6648;
        return this.field6765 != null && (this.field6769 <= 1 || this.field6896);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method518(Canvas arg0, int arg1, int arg2) {
        ++field6753;
        if (this.field6690 == arg0) {
            throw new RuntimeException();
        } else if (!this.field6613.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field6660.prepareSurface(arg0);
                if (var6 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field6613.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "([I)V")
    public final void method483(int[] arg0) {
        ++field6700;
        arg0[0] = this.field6872;
        arg0[1] = this.field6895;
        arg0[2] = this.field6885;
        arg0[3] = this.field6850;
    }

    @OriginalMember(owner = "client!bi", name = "la", descriptor = "()V")
    public final void method446() {
        this.field6895 = 0;
        this.field6872 = 0;
        this.field6885 = this.field6681;
        this.field6850 = this.field6671;
        ++field6667;
        OpenGL.glDisable(3089);
        this.method2803(0);
    }

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "(B)V")
    private final void method2805(byte arg0) {
        ++field6713;
        if (this.field6583 != null) {
            Dimension var2 = this.field6583.getSize();
            this.field6652 = var2.width;
            this.field6744 = var2.height;
        } else {
            this.field6652 = this.field6744 = 0;
        }
        if (this.field6786 == null) {
            this.field6681 = this.field6652;
            this.field6671 = this.field6744;
            this.method2794(1);
        }
        this.method2785(-1);
        this.method446();
        int var3 = 36 / ((arg0 - -65) / 35);
    }

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field6729;
        float var10;
        float var11;
        if (this.field6831 != null && this.field6831.field3856 >= arg2 && this.field6831.field3862 >= arg3) {
            this.field6831.method1763(0, false, arg6, 0, 0, 0, arg3, (byte) 78, arg2, 6406);
            var10 = (float) arg2 * this.field6831.field7335 / (float) this.field6831.field3856;
            var11 = (float) arg3 * this.field6831.field7330 / (float) this.field6831.field3862;
        } else {
            this.field6831 = class367.method2120(382, arg6, arg3, this, 6406, 6406, arg2, false);
            this.field6831.method1756(false, false, 6);
            var11 = this.field6831.field7330;
            var10 = this.field6831.field7335;
        }
        this.method2804((byte) 23);
        this.method2850(123, this.field6831);
        this.method2844(126, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2822(16711680, arg5);
        this.method2799(-27874, 34165, 34165);
        this.method2775(34166, (byte) -88, 768, 0);
        this.method2775(5890, (byte) -88, 770, 2);
        this.method2788(770, 34166, false, 0);
        this.method2788(770, 5890, false, 2);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var10);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var11, var10);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var11, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method2775(5890, (byte) -88, 768, 0);
        this.method2775(34166, (byte) -88, 770, 2);
        this.method2788(770, 5890, false, 0);
        this.method2788(770, 34166, false, 2);
    }

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "(I)V")
    private final void method2806(int arg0) {
        ++field6695;
        if (this.field6823) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field6823 = false;
        }
        if (arg0 != 8960) {
            this.field6897 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(FFZF)V")
    private final void method2807(float arg0, float arg1, boolean arg2, float arg3) {
        ++field6651;
        OpenGL.glMatrixMode(5890);
        if (this.field6823) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg3, arg0, arg1);
        OpenGL.glMatrixMode(5888);
        if (!arg2) {
            this.field6823 = true;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
    public final void method449(boolean arg0) {
        ++field6664;
    }

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "()Z")
    public final boolean method519() {
        ++field6732;
        return this.field6862 && (!this.method442() || this.field6896);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method486(Canvas arg0) {
        this.field6760 = 0L;
        this.field6583 = null;
        ++field6619;
        if (arg0 != null && this.field6690 != arg0) {
            if (this.field6613.containsKey(arg0)) {
                Long var2 = (Long) this.field6613.get(arg0);
                this.field6760 = var2;
                this.field6583 = arg0;
            }
        } else {
            this.field6583 = this.field6690;
            this.field6760 = this.field6662;
        }
        if (this.field6583 != null && this.field6760 != 0L) {
            this.field6660.setSurface(this.field6760);
            this.method2805((byte) 87);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(FB)V")
    public final void method2808(float arg0, byte arg1) {
        if (this.field6881 != arg0) {
            this.field6881 = arg0;
            if (~this.field6847 == -4) {
                this.method2811((byte) 100);
            }
        }
        if (arg1 != 9) {
            this.field6903 = true;
        }
        ++field6592;
    }

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "(I)V")
    private final void method2809(int arg0) {
        if (~this.field6847 != arg0) {
            this.field6847 = 3;
            this.method2811((byte) 47);
            this.method2830(-2);
            this.field6809 &= -8;
        }
        ++field6705;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjaclib/memory/Buffer;ZIZ)Lju;")
    public final class128 method2810(int arg0, Buffer arg1, boolean arg2, int arg3, boolean arg4) {
        if (arg2) {
            this.field6787 = null;
        }
        ++field6678;
        return (class128) (!this.field6860 || arg4 && !this.field6893 ? new class551(this, arg0, arg1) : new class379(this, arg0, arg1, arg3, arg4));
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "()V")
    public final void method459() {
        for (class168 var1 = this.field6779.method3672(-1); var1 != null; var1 = this.field6779.method3662(-1)) {
            ((class367) var1).method2121((byte) 126);
        }
        ++field6730;
        if (this.field6766 != null) {
            this.field6766.method862(1);
        }
        if (this.field6660 != null) {
            this.method2791(-5122);
            Enumeration var2 = this.field6613.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field6613.get(var3);
                this.field6660.releaseSurface(var3, var4);
            }
            this.field6660.release();
            this.field6660 = null;
        }
        if (this.field6776) {
            class23.method163(false, true, (byte) 127);
            this.field6776 = false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "za", descriptor = "(IIIII)V")
    public final void method458(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        ++field6768;
        if (~(arg0 + arg2) <= ~this.field6872 && -arg2 + arg0 <= this.field6885 && arg1 + arg2 >= this.field6895 && arg1 - arg2 <= this.field6850) {
            this.method2841(false);
            this.method2844(123, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field6906) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field6826 >= (float) var8) {
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
                if (var9 <= 64) {
                    var9 = 64;
                } else if (var9 > 512) {
                    var9 = 512;
                }
                int var10 = class113.method890(var9, 2094889633);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = 16384 - var10; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class303.field3964[var11] * (float) arg2 + var6, class303.field3966[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "()V")
    public final void method466() {
        if (this.field6765 != null && this.field6765.method1517(-19346)) {
            this.field6766.method870(this.field6765, 0);
            this.field6764.method3846((byte) 111);
        }
        ++field6699;
    }

    @OriginalMember(owner = "client!bi", name = "GA", descriptor = "(I)V")
    public final void method462(int arg0) {
        ++field6748;
        this.method2844(124, 0);
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "(B)V")
    private final void method2811(byte arg0) {
        ++field6572;
        float var2 = (float) (-this.field6921) * this.field6881 / (float) this.field6820;
        float var3 = (float) (-this.field6877) * this.field6881 / (float) this.field6857;
        float var4 = (float) (-this.field6921 + this.field6681) * this.field6881 / (float) this.field6820;
        if (arg0 <= 11) {
            this.field6794 = 35;
        }
        float var5 = (float) (this.field6671 - this.field6877) * this.field6881 / (float) this.field6857;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field6855, (double) this.field6840);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZZ)V")
    public final void method2812(int arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            this.field6815 = true;
        }
        ++field6679;
        this.method2780(arg0, 127, true, arg2);
    }

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "()Z")
    public final boolean method467() {
        ++field6687;
        return true;
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(II)I")
    public final int method542(int arg0, int arg1) {
        ++field6589;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "(B)Lkk;")
    public final class193 method2813(byte arg0) {
        ++field6697;
        if (arg0 <= 85) {
            this.field6809 = 29;
        }
        return this.field6868 == null ? null : this.field6868.method420(22);
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(II)V")
    public final void method468(int arg0, int arg1) {
        ++field6623;
        if (this.field6855 != arg0 || this.field6840 != arg1) {
            this.field6840 = arg1;
            this.field6855 = arg0;
            this.method2835((byte) 36);
            this.method2845(650342096);
            if (this.field6847 != 3) {
                if (~this.field6847 == -3) {
                    this.method2796((byte) 77);
                    return;
                }
            } else {
                this.method2811((byte) 35);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "()V")
    public final void method547() {
        ++field6626;
    }

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "()Z")
    public final boolean method476() {
        ++field6638;
        if (this.field6765 != null) {
            if (!this.field6765.method1517(-19346)) {
                if (!this.field6766.method863(-25479, this.field6765)) {
                    return false;
                }
                this.field6764.method3846((byte) -78);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)V")
    public final void method473(int arg0) {
        ++field6617;
        if (arg0 >= 128 && arg0 <= 1024) {
            this.field6770 = arg0;
            this.field6764.method3846((byte) 91);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[BZII)Lju;")
    public final class128 method2814(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        ++field6669;
        if (!this.field6860 || arg2 && !this.field6893) {
            if (arg0 <= 51) {
                this.field6690 = null;
            }
            return new class551(this, arg4, arg1, arg3);
        } else {
            return new class379(this, arg4, arg1, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V")
    public final void method452(int arg0) {
        ++field6647;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLjm;)V")
    public final void method2815(byte arg0, class691 arg1) {
        ++field6614;
        if (!this.field6910) {
            if (this.field6784 >= 3) {
                throw new RuntimeException();
            }
            if (this.field6784 >= 0) {
                this.field6790[this.field6784].method3690(28419);
            }
            this.field6787 = this.field6786 = this.field6790[++this.field6784] = arg1;
            this.field6787.method3686(true);
        } else {
            this.method2833(arg1, -23569);
            this.method2849(1, arg1);
        }
        if (arg0 <= 6) {
            this.field6785 = -69;
        }
    }

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "()Z")
    public final boolean method517() {
        ++field6756;
        return true;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BZ)V")
    public final void method2816(byte arg0, boolean arg1) {
        ++field6733;
        if (this.field6802 != arg1) {
            this.field6802 = arg1;
            this.method2820(-2);
            this.field6809 &= -32;
        }
        if (arg0 >= -4) {
            this.field6777 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "(II)I")
    public final int method2817(int arg0, int arg1) {
        ++field6633;
        if (~arg1 == -2) {
            return 7681;
        } else if (arg1 != 0) {
            if (arg1 == 2) {
                return 34165;
            } else if (arg1 == 3) {
                return 260;
            } else if (~arg1 == -5) {
                return 34023;
            } else {
                if (arg0 != 23013) {
                    this.field6869 = null;
                }
                throw new IllegalArgumentException();
            }
        } else {
            return 8448;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BJ)V")
    public final synchronized void method2818(byte arg0, long arg1) {
        ++field6625;
        class168 var4 = new class168();
        var4.field2333 = arg1;
        if (arg0 != -106) {
            this.field6900 = null;
        }
        this.field6800.method3671(var4, false);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lnl;)V")
    public final void method550(class554 arg0) {
        ++field6610;
    }

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "()V")
    public final void method479() {
        ++field6727;
        if (this.field6911 && ~this.field6681 < -1 && ~this.field6671 < -1) {
            int var1 = this.field6872;
            int var2 = this.field6885;
            int var3 = this.field6895;
            int var4 = this.field6850;
            this.method446();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2785(-1);
            this.method2789(false, 16160);
            this.method2776(1, false);
            this.method2801(-1, false);
            this.method2816((byte) -23, false);
            this.method2850(-46, (class695) null);
            this.method2777(-2, 1);
            this.method2800(1, -80);
            this.method2844(106, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field6681, this.field6671, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method534(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "(I)V")
    public final void method2819(int arg0) {
        ++field6595;
        OpenGL.glPushMatrix();
        int var2 = -112 % ((arg0 - 14) / 59);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field6674;
        this.method2841(false);
        this.method2844(106, arg12);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "(I)V")
    private final void method2820(int arg0) {
        if (arg0 != -2) {
            this.field6760 = -44L;
        }
        ++field6672;
        OpenGL.glDepthMask(this.field6802 && this.field6878);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lfl;)V")
    public final void method455(class741 arg0) {
        this.field6771.method4124(this, -1, 24, arg0);
        ++field6567;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method495(Canvas arg0, int arg1, int arg2) {
        ++field6602;
        long var4 = 0L;
        if (arg0 != null && this.field6690 != arg0) {
            if (this.field6613.containsKey(arg0)) {
                Long var6 = (Long) this.field6613.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field6662;
        }
        if (~var4 == -1L) {
            throw new RuntimeException();
        } else {
            this.field6660.surfaceResized(var4);
            if (this.field6583 == arg0) {
                this.method2805((byte) -127);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lfl;I)V")
    public final void method545(class741 arg0, int arg1) {
        ++field6646;
        this.field6771.method4124(this, arg1, 24, arg0);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLuo;Luo;Luo;Luo;)V")
    public final void method2821(byte arg0, class578 arg1, class578 arg2, class578 arg3, class578 arg4) {
        ++field6616;
        if (arg2 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method2852((byte) 48, arg2.field8106);
            OpenGL.glVertexPointer(arg2.field8104, arg2.field8105, this.field6818.method959(112), this.field6818.method961(false) - -((long) arg2.field8102));
            OpenGL.glEnableClientState(32884);
        }
        if (arg1 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method2852((byte) 48, arg1.field8106);
            OpenGL.glNormalPointer(arg1.field8105, this.field6818.method959(115), this.field6818.method961(false) + (long) arg1.field8102);
            OpenGL.glEnableClientState(32885);
        }
        if (arg3 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method2852((byte) 48, arg3.field8106);
            OpenGL.glColorPointer(arg3.field8104, arg3.field8105, this.field6818.method959(113), this.field6818.method961(false) + (long) arg3.field8102);
            OpenGL.glEnableClientState(32886);
        }
        if (arg4 != null) {
            this.method2852((byte) 48, arg4.field8106);
            OpenGL.glTexCoordPointer(arg4.field8104, arg4.field8105, this.field6818.method959(arg0 + 172), this.field6818.method961(false) - -((long) arg4.field8102));
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
        if (arg0 != -48) {
            this.field6786 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "(II)V")
    public final void method2822(int arg0, int arg1) {
        class275.field3459[1] = (float) class702.method3949(65280, arg1) / 65280.0F;
        class275.field3459[3] = (float) (arg1 >>> 24) / 255.0F;
        class275.field3459[0] = (float) class702.method3949(arg1, arg0) / 1.671168E7F;
        class275.field3459[2] = (float) class702.method3949(arg1, 255) / 255.0F;
        ++field6749;
        OpenGL.glTexEnvfv(8960, 8705, class275.field3459, 0);
    }

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "(I)V")
    public final void method510(int arg0) {
        this.field6775 = 0;
        ++field6605;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field6775;
        }
        this.field6774 = 1 << this.field6775;
    }

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "(B)V")
    private final void method2823(byte arg0) {
        ++field6631;
        int var2 = 0;
        int var3 = -121 % ((arg0 - 11) / 46);
        while (!this.field6660.method3510()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            class149.method1052(1000L, true);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lqn;I)V")
    public final void method2824(class65 arg0, int arg1) {
        if (arg1 < 103) {
            this.method476();
        }
        OpenGL.glLoadMatrixf(arg0.method605(110), 0);
        ++field6743;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIF)Llaa;")
    public final class123 method471(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field6650;
        return new class661(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BFFFF)V")
    public final void method2825(byte arg0, float arg1, float arg2, float arg3, float arg4) {
        int var6 = 74 / ((-27 - arg0) / 54);
        class275.field3459[2] = arg4;
        class275.field3459[3] = arg2;
        ++field6655;
        class275.field3459[0] = arg3;
        class275.field3459[1] = arg1;
        OpenGL.glTexEnvfv(8960, 8705, class275.field3459, 0);
    }

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "(III[I)V")
    public final void method553(int arg0, int arg1, int arg2, int[] arg3) {
        ++field6742;
        float var5 = (float) arg2 * this.field6806.field913 + (float) arg0 * this.field6806.field905 + (float) arg1 * this.field6806.field935 + this.field6806.field927;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field6806.field916 + (float) arg0 * this.field6806.field915 + (float) arg1 * this.field6806.field936 + this.field6806.field914) * (float) this.field6820 / var5);
            arg3[0] = (int) ((float) var6 - this.field6907);
            int var7 = (int) (((float) arg2 * this.field6806.field906 + (float) arg0 * this.field6806.field937 + (float) arg1 * this.field6806.field925 + this.field6806.field921) * (float) this.field6857 / var5);
            arg3[2] = (int) var5;
            arg3[1] = (int) ((float) var7 + -this.field6824);
        }
    }

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "()I")
    public final int method440() {
        ++field6590;
        int var1 = this.field6924;
        this.field6924 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(FFF)V")
    public final void method463(float arg0, float arg1, float arg2) {
        class386.field4929 = arg1;
        ++field6659;
        class705.field9774 = arg0;
        class639.field8838 = arg2;
    }

    @OriginalMember(owner = "client!bi", name = "XA", descriptor = "()I")
    public final int method546() {
        ++field6745;
        return this.field6840;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZLqn;)V")
    public final void method2826(boolean arg0, class65 arg1) {
        if (arg0) {
            this.method2830(-108);
        }
        ++field6718;
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg1.method605(82), 0);
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V")
    public class483(Canvas arg0, class153 arg1, int arg2) {
        super(arg1);
        new class16();
        new class165(16);
        this.field6791 = new class653();
        this.field6795 = new class653();
        this.field6796 = new class653();
        this.field6797 = new class653();
        this.field6798 = new class653();
        this.field6799 = new class653();
        this.field6800 = new class653();
        this.field6806 = new class65();
        this.field6810 = new class65();
        this.field6811 = new class65();
        this.field6820 = 512;
        this.field6829 = new float[4];
        this.field6836 = 1.0F;
        this.field6816 = 1.0F;
        this.field6812 = 0;
        this.field6850 = 0;
        this.field6858 = 0;
        this.field6855 = 50;
        this.field6846 = -1;
        this.field6863 = 0;
        this.field6853 = 3584.0F;
        this.field6878 = true;
        this.field6871 = new float[4];
        this.field6874 = new class123[class39.field601];
        this.field6821 = new float[4];
        this.field6859 = 0.0F;
        this.field6840 = 3584;
        this.field6857 = 512;
        this.field6867 = 8448;
        this.field6848 = -1.0F;
        this.field6885 = 0;
        this.field6892 = 1.0F;
        this.field6895 = 0;
        this.field6894 = 0;
        this.field6877 = 0;
        this.field6881 = 1.0F;
        this.field6872 = 0;
        this.field6814 = -1;
        this.field6899 = 1.0F;
        this.field6826 = -1.0F;
        this.field6815 = false;
        this.field6864 = -1;
        this.field6883 = 8448;
        this.field6889 = new float[16];
        this.field6828 = -1;
        this.field6906 = -1.0F;
        this.field6919 = -1.0F;
        this.field6917 = -1;
        this.field6921 = 0;
        this.field6918 = new float[4];
        this.field6920 = 3584.0F;
        this.field6845 = new class736(8192);
        this.field6923 = new int[1];
        this.field6927 = new int[1];
        this.field6928 = new byte[16384];
        this.field6925 = new int[1];
        this.field6769 = arg2;
        this.field6583 = this.field6690 = arg0;
        if (!class633.method3549("jaclib", 99)) {
            throw new RuntimeException("");
        } else if (!class633.method3549("jaggl", 99)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field6660 = new OpenGL();
                this.field6760 = this.field6662 = this.field6660.init(arg0, 8, 8, 8, 24, 0, this.field6769);
                if (this.field6662 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method2823((byte) -89);
                    int var4 = this.method2787(0);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field6837 = this.field6903 ? 33639 : 5121;
                        if (~this.field6844.indexOf("radeon") != 0) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class249.method1538(' ', 0, this.field6844.replace('/', ' '));
                            for (int var9 = 0; var8.length > var9; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (~var10.length() < -1) {
                                        if (~var10.charAt(0) == -121 && var10.length() >= 3 && class396.method2231(var10.substring(1, 3), (byte) 110)) {
                                            var10 = var10.substring(1);
                                            var7 = true;
                                        }
                                        if (var10.equals("hd")) {
                                            var6 = true;
                                        } else {
                                            if (var10.startsWith("hd")) {
                                                var10 = var10.substring(2);
                                                var6 = true;
                                            }
                                            if (var10.length() >= 4 && class396.method2231(var10.substring(0, 4), (byte) 91)) {
                                                var5 = class160.method1124(var10.substring(0, 4), 118);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field6901 = false;
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && ~var5 >= -8000) {
                                    this.field6860 = false;
                                }
                                if (var5 >= 7000 && ~var5 >= -9251) {
                                    this.field6851 = false;
                                }
                            }
                            this.field6880 &= this.field6660.method3509("GL_ARB_half_float_pixel");
                            this.field6832 = true;
                            this.field6893 = this.field6860;
                        }
                        if (~this.field6879.indexOf("intel") != 0) {
                            this.field6861 = false;
                        }
                        this.field6911 = !this.field6879.equals("s3 graphics");
                        if (this.field6860) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class273.method1613(true, false, 10);
                        this.field6776 = true;
                        this.field6764 = new class685(this, super.field830);
                        this.method2795(2);
                        this.field6777 = new class338(this);
                        this.field6766 = new class108(this);
                        if (this.field6766.method869(1)) {
                            this.field6765 = new class27(this);
                            if (!this.field6765.method185(-128)) {
                                this.field6765.method186(-12047);
                                this.field6765 = null;
                            }
                        }
                        this.field6763 = new class179(this);
                        this.method2779(113);
                        this.method2805((byte) 91);
                        this.method479();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method459();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "(B)V")
    private final void method2827(byte arg0) {
        class275.field3459[1] = this.field6919 * this.field6899;
        ++field6621;
        class275.field3459[3] = 1.0F;
        class275.field3459[2] = this.field6919 * this.field6816;
        class275.field3459[0] = this.field6919 * this.field6892;
        OpenGL.glLightfv(16384, 4609, class275.field3459, 0);
        if (arg0 == 112) {
            class275.field3459[0] = -this.field6848 * this.field6892;
            class275.field3459[2] = -this.field6848 * this.field6816;
            class275.field3459[3] = 1.0F;
            class275.field3459[1] = -this.field6848 * this.field6899;
            OpenGL.glLightfv(16385, 4609, class275.field3459, 0);
        }
    }

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "(II)V")
    public final void method493(int arg0, int arg1) {
        ++field6692;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljm;I)V")
    public final void method2828(class691 arg0, int arg1) {
        if (arg1 != -8) {
            this.field6803 = false;
        }
        ++field6751;
        if (this.field6781 >= 0 && this.field6789[this.field6781] == arg0) {
            this.field6789[this.field6781--] = null;
            arg0.method3689((byte) 0);
            if (~this.field6781 > -1) {
                this.field6786 = null;
            } else {
                this.field6786 = this.field6789[this.field6781];
                this.field6786.method3697((byte) -102);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bi", name = "aa", descriptor = "(IIIIII)V")
    public final void method528(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6754;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method2841(false);
        float var10 = (float) arg3 + var8;
        this.method2844(111, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field6862) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field6862) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "(B)V")
    private final void method2829(byte arg0) {
        ++field6737;
        if (this.field6830 && !this.field6884) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 >= -45) {
            this.method2814(119, (byte[]) null, true, 105, -82);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lza;)V")
    public final void method536(class416 arg0) {
        this.field6778 = ((class367) arg0).field4731;
        ++field6636;
        if (this.field6849 == null) {
            class736 var2 = new class736(80);
            if (!this.field6903) {
                var2.method4104(1482486504, -1.0F);
                var2.method4104(1482486504, -1.0F);
                var2.method4104(1482486504, 0.0F);
                var2.method4104(1482486504, 0.0F);
                var2.method4104(1482486504, 1.0F);
                var2.method4104(1482486504, 1.0F);
                var2.method4104(1482486504, -1.0F);
                var2.method4104(1482486504, 0.0F);
                var2.method4104(1482486504, 1.0F);
                var2.method4104(1482486504, 1.0F);
                var2.method4104(1482486504, 1.0F);
                var2.method4104(1482486504, 1.0F);
                var2.method4104(1482486504, 0.0F);
                var2.method4104(1482486504, 1.0F);
                var2.method4104(1482486504, 0.0F);
                var2.method4104(1482486504, -1.0F);
                var2.method4104(1482486504, 1.0F);
                var2.method4104(1482486504, 0.0F);
                var2.method4104(1482486504, 0.0F);
                var2.method4104(1482486504, 0.0F);
            } else {
                var2.method4102(-1.0F, (byte) -56);
                var2.method4102(-1.0F, (byte) -56);
                var2.method4102(0.0F, (byte) -56);
                var2.method4102(0.0F, (byte) -56);
                var2.method4102(1.0F, (byte) -56);
                var2.method4102(1.0F, (byte) -56);
                var2.method4102(-1.0F, (byte) -56);
                var2.method4102(0.0F, (byte) -56);
                var2.method4102(1.0F, (byte) -56);
                var2.method4102(1.0F, (byte) -56);
                var2.method4102(1.0F, (byte) -56);
                var2.method4102(1.0F, (byte) -56);
                var2.method4102(0.0F, (byte) -56);
                var2.method4102(1.0F, (byte) -56);
                var2.method4102(0.0F, (byte) -56);
                var2.method4102(-1.0F, (byte) -56);
                var2.method4102(1.0F, (byte) -56);
                var2.method4102(0.0F, (byte) -56);
                var2.method4102(0.0F, (byte) -56);
                var2.method4102(0.0F, (byte) -56);
            }
            this.field6849 = this.method2814(68, var2.field6180, false, var2.field6193, 20);
            this.field6822 = new class578(this.field6849, 5126, 3, 0);
            this.field6854 = new class578(this.field6849, 5126, 2, 12);
            this.field6771.method4126(this, -14561);
        }
    }

    @OriginalMember(owner = "client!bi", name = "JA", descriptor = "(IIIIII)I")
    public final int method529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6698;
        int var7 = 0;
        float var8 = (float) arg2 * this.field6806.field913 + (float) arg0 * this.field6806.field905 + (float) arg1 * this.field6806.field935 + this.field6806.field927;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field6806.field913 + (float) arg3 * this.field6806.field905 + (float) arg4 * this.field6806.field935 + this.field6806.field927;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field6855 > var8 && var9 < (float) this.field6855) {
            var7 |= 16;
        } else if (var8 > (float) this.field6840 && (float) this.field6840 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field6806.field916 + (float) arg0 * this.field6806.field915 + (float) arg1 * this.field6806.field936 + this.field6806.field914) * (float) this.field6820 / var8);
        int var11 = (int) (((float) arg5 * this.field6806.field916 + (float) arg3 * this.field6806.field915 + (float) arg4 * this.field6806.field936 + this.field6806.field914) * (float) this.field6820 / var9);
        if ((float) var10 < this.field6907 && this.field6907 > (float) var11) {
            var7 |= 1;
        } else if ((float) var10 > this.field6905 && (float) var11 > this.field6905) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field6806.field906 + (float) arg0 * this.field6806.field937 + (float) arg1 * this.field6806.field925 + this.field6806.field921) * (float) this.field6857 / var8);
        int var13 = (int) (((float) arg5 * this.field6806.field906 + (float) arg3 * this.field6806.field937 + (float) arg4 * this.field6806.field925 + this.field6806.field921) * (float) this.field6857 / var9);
        if ((float) var12 < this.field6824 && (float) var13 < this.field6824) {
            var7 |= 4;
        } else if (this.field6916 < (float) var12 && this.field6916 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "(I)V")
    private final void method2830(int arg0) {
        if (arg0 == -2) {
            OpenGL.glLoadIdentity();
            ++field6665;
            OpenGL.glMultMatrixf(this.field6810.method605(-113), 0);
            if (this.field6815) {
                this.field6763.field2511.method1177(true);
            }
            this.method2853(-20561);
            this.method2846(768);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljl;[Lhb;Z)Lda;")
    public final class61 method500(class274 arg0, class728[] arg1, boolean arg2) {
        ++field6570;
        return new class279(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "()I")
    public final int method537() {
        ++field6731;
        return this.field6794 + this.field6792 + this.field6793;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIII)V")
    public final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6683;
        this.method2841(false);
        this.method2844(112, arg5);
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) arg3 - (float) arg1;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var8 *= var10;
            var9 = var7 * var10;
        }
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var9 + 0.35F, (float) arg3 + var8 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "()I")
    public final int method470() {
        ++field6581;
        int var1 = this.field6926;
        this.field6926 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "()Lpda;")
    public final class631 method480() {
        ++field6586;
        return this.field6806;
    }

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "(II)V")
    public final synchronized void method2831(int arg0, int arg1) {
        ++field6568;
        class168 var3 = new class168();
        var3.field2333 = (long) arg1;
        this.field6799.method3671(var3, false);
        if (arg0 <= 105) {
            this.field6918 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(III)V")
    public final synchronized void method2832(int arg0, int arg1, int arg2) {
        if (arg2 <= 38) {
            this.field6801 = -43L;
        }
        ++field6657;
        class393 var4 = new class393(arg1);
        var4.field2333 = (long) arg0;
        this.field6795.method3671(var4, false);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lhb;Z)Liea;")
    public final class481 method508(class728 arg0, boolean arg1) {
        ++field6677;
        int[] var3 = new int[arg0.field10135 * arg0.field10132];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field10133 == null) {
            for (int var6 = 0; arg0.field10132 > var6; ++var6) {
                for (int var7 = 0; ~arg0.field10135 < ~var7; ++var7) {
                    int var8 = arg0.field10131[255 & arg0.field10134[var4++]];
                    var3[var5++] = ~var8 == -1 ? 0 : class683.method3840(var8, -16777216);
                }
            }
        } else {
            for (int var9 = 0; ~arg0.field10132 < ~var9; ++var9) {
                for (int var11 = 0; ~var11 > ~arg0.field10135; ++var11) {
                    var3[var5++] = class683.method3840(arg0.field10133[var4] << 24, arg0.field10131[class702.method3949(arg0.field10134[var4], 255)]);
                    ++var4;
                }
            }
        }
        class481 var10 = this.method435(arg0.field10135, 0, arg0.field10132, 117, var3, arg0.field10135);
        var10.method147(arg0.field10129, arg0.field10128, arg0.field10136, arg0.field10130);
        return var10;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Ljm;I)V")
    public final void method2833(class691 arg0, int arg1) {
        ++field6739;
        if (~this.field6785 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field6785 <= -1) {
                this.field6788[this.field6785].method3691(17);
            }
            this.field6787 = this.field6788[++this.field6785] = arg0;
            this.field6787.method3692(-39);
            if (arg1 != -23569) {
                this.field6855 = -37;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "(I)Lza;")
    public final class416 method541(int arg0) {
        ++field6707;
        class367 var2 = new class367(arg0);
        this.field6779.method3671(var2, false);
        return var2;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lg;Z)V")
    public final void method2834(class158 arg0, boolean arg1) {
        ++field6761;
        if (arg1) {
            if (this.field6904 != arg0) {
                if (this.field6860) {
                    OpenGL.glBindBufferARB(34963, arg0.method1106((byte) -79));
                }
                this.field6904 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lhca;Llda;)Lnl;")
    public final class554 method464(class492 arg0, class488 arg1) {
        ++field6629;
        return null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lmda;)V")
    public final void method496(class267 arg0) {
        this.field6868 = (class523) arg0;
        ++field6762;
    }

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "(B)V")
    private final void method2835(byte arg0) {
        ++field6620;
        if (arg0 == 36) {
            float[] var2 = this.field6889;
            float var3 = (float) (-this.field6921 * this.field6855) / (float) this.field6820;
            float var4 = (float) ((-this.field6921 + this.field6681) * this.field6855) / (float) this.field6820;
            float var5 = (float) (this.field6877 * this.field6855) / (float) this.field6857;
            float var6 = (float) ((-this.field6671 + this.field6877) * this.field6855) / (float) this.field6857;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field6855 * 2.0F;
                var2[13] = 0.0F;
                var2[6] = 0.0F;
                var2[14] = this.field6870 = -((float) this.field6840 * var7) / (float) (this.field6840 - this.field6855);
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[11] = -1.0F;
                var2[3] = 0.0F;
                var2[1] = 0.0F;
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[2] = 0.0F;
                var2[0] = var7 / (-var3 + var4);
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[12] = 0.0F;
                var2[10] = this.field6843 = (float) (-(this.field6840 - -this.field6855)) / (float) (-this.field6855 + this.field6840);
                var2[5] = var7 / (-var6 + var5);
                var2[15] = 0.0F;
            } else {
                var2[3] = 0.0F;
                var2[0] = 1.0F;
                var2[15] = 1.0F;
                var2[9] = 0.0F;
                var2[5] = 1.0F;
                var2[10] = 1.0F;
                var2[7] = 0.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[14] = 0.0F;
                var2[2] = 0.0F;
                var2[8] = 0.0F;
                var2[13] = 0.0F;
                var2[11] = 0.0F;
                var2[12] = 0.0F;
                var2[4] = 0.0F;
            }
            this.method2842(true);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjm;)V")
    public final void method2836(int arg0, class691 arg1) {
        ++field6708;
        if (~this.field6785 <= -1 && this.field6788[this.field6785] == arg1) {
            this.field6788[this.field6785--] = null;
            if (arg0 == 4615) {
                arg1.method3691(-103);
                if (this.field6785 < 0) {
                    this.field6787 = null;
                } else {
                    this.field6787 = this.field6788[this.field6785];
                    this.field6787.method3692(83);
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bi", name = "pa", descriptor = "()V")
    public final void method515() {
        this.field6915 = false;
        ++field6686;
    }

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "(II)I")
    public final int method2837(int arg0, int arg1) {
        if (arg1 != -1) {
            this.method2849(36, (class691) null);
        }
        ++field6593;
        if (arg0 != 6406 && ~arg0 != -6410) {
            if (~arg0 != -6411 && arg0 != 34846 && ~arg0 != -34845) {
                if (arg0 == 6407) {
                    return 3;
                } else if (~arg0 != -6409 && arg0 != 34847) {
                    if (~arg0 == -34844) {
                        return 6;
                    } else if (~arg0 != -34843) {
                        if (~arg0 != -6403) {
                            if (~arg0 == -6402) {
                                return 1;
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

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
    public final synchronized void method448(int arg0) {
        ++field6618;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field6795.method3667((byte) -45)) {
            class393 var12 = (class393) this.field6795.method3665(23290);
            class263.field3320[var3++] = (int) var12.field2333;
            this.field6792 -= var12.field4992;
            if (~var3 == -1001) {
                OpenGL.glDeleteBuffersARB(var3, class263.field3320, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class263.field3320, 0);
            var3 = 0;
        }
        while (!this.field6796.method3667((byte) -45)) {
            class393 var11 = (class393) this.field6796.method3665(23290);
            class263.field3320[var3++] = (int) var11.field2333;
            this.field6794 -= var11.field4992;
            if (~var3 == -1001) {
                OpenGL.glDeleteTextures(var3, class263.field3320, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteTextures(var3, class263.field3320, 0);
            var3 = 0;
        }
        while (!this.field6797.method3667((byte) -45)) {
            class393 var10 = (class393) this.field6797.method3665(23290);
            class263.field3320[var3++] = var10.field4992;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class263.field3320, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class263.field3320, 0);
            var3 = 0;
        }
        while (!this.field6798.method3667((byte) -45)) {
            class393 var9 = (class393) this.field6798.method3665(23290);
            class263.field3320[var3++] = (int) var9.field2333;
            this.field6793 -= var9.field4992;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class263.field3320, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class263.field3320, 0);
            boolean var4 = false;
        }
        while (!this.field6791.method3667((byte) -45)) {
            class393 var8 = (class393) this.field6791.method3665(23290);
            OpenGL.glDeleteLists((int) var8.field2333, var8.field4992);
        }
        while (!this.field6799.method3667((byte) -45)) {
            class168 var7 = this.field6799.method3665(23290);
            OpenGL.glDeleteProgramARB((int) var7.field2333);
        }
        while (!this.field6800.method3667((byte) -45)) {
            class168 var6 = this.field6800.method3665(23290);
            OpenGL.glDeleteObjectARB(var6.field2333);
        }
        while (!this.field6791.method3667((byte) -45)) {
            class393 var5 = (class393) this.field6791.method3665(23290);
            OpenGL.glDeleteLists((int) var5.field2333, var5.field4992);
        }
        this.field6764.method3852(5);
        if (this.method537() > 100663296 && this.field6801 + 60000L < class446.method2525(500)) {
            System.gc();
            this.field6801 = class446.method2525(500);
        }
        this.field6780 = var2;
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(III)V")
    public final void method2838(int arg0, int arg1, int arg2) {
        this.field6863 = arg2;
        this.field6894 = arg1;
        int var4 = 41 % ((26 - arg0) / 39);
        ++field6750;
        this.method2794(1);
        this.method2802(26781);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field6596;
        if (~arg0 != ~arg2 || ~arg1 != ~arg3) {
            this.method2841(false);
            this.method2844(119, arg5);
            float var10 = (float) arg2 - (float) arg0;
            float var11 = (float) arg3 - (float) arg1;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            int var13 = arg8 % (arg6 + arg7);
            float var14 = var10 * var12;
            float var15 = var11 * var12;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var16 = (float) arg6 * var14;
            float var17 = (float) arg6 * var15;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (arg6 >= var13) {
                var20 = (float) (-var13 + arg6) * var14;
                var21 = (float) (-var13 + arg6) * var15;
            } else {
                var18 = (float) (arg7 - var13 + arg6) * var14;
                var19 = (float) (arg6 + arg7 + -var13) * var15;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var14;
            float var25 = (float) arg7 * var15;
            while (true) {
                if (arg0 < arg2) {
                    if (var22 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var20 + var22 > (float) arg2) {
                        var20 = (float) arg2 - var22;
                    }
                } else {
                    if ((float) arg2 + 0.35F > var22) {
                        break;
                    }
                    if (var20 + var22 < (float) arg2) {
                        var20 = (float) arg2 + -var22;
                    }
                }
                if (arg1 < arg3) {
                    if ((float) arg3 + 0.35F < var23) {
                        break;
                    }
                    if ((float) arg3 < var21 + var23) {
                        var21 = (float) arg3 + -var23;
                    }
                } else {
                    if (var23 < (float) arg3 + 0.35F) {
                        break;
                    }
                    if (var21 + var23 < (float) arg3) {
                        var21 = (float) arg3 - var23;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glVertex2f(var22, var23);
                OpenGL.glVertex2f(var20 + var22, var21 + var23);
                var23 += var21 + var25;
                OpenGL.glEnd();
                var22 += var20 + var24;
                var21 = var17;
                var20 = var16;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "(I)V")
    public final void method2839(int arg0) {
        OpenGL.glPopMatrix();
        ++field6694;
        if (arg0 != -20411) {
            this.field6872 = -28;
        }
    }

    @OriginalMember(owner = "client!bi", name = "HA", descriptor = "(IIII[I)V")
    public final void method530(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field6691;
        float var6 = (float) arg2 * this.field6806.field913 + (float) arg0 * this.field6806.field905 + (float) arg1 * this.field6806.field935 + this.field6806.field927;
        if (!((float) this.field6855 > var6) && !(var6 > (float) this.field6840)) {
            int var7 = (int) (((float) arg2 * this.field6806.field916 + (float) arg0 * this.field6806.field915 + (float) arg1 * this.field6806.field936 + this.field6806.field914) * (float) this.field6820 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field6806.field906 + (float) arg0 * this.field6806.field937 + (float) arg1 * this.field6806.field925 + this.field6806.field921) * (float) this.field6857 / (float) arg3);
            if (this.field6907 <= (float) var7 && this.field6905 >= (float) var7 && this.field6824 <= (float) var8 && this.field6916 >= (float) var8) {
                arg4[2] = (int) var6;
                arg4[0] = (int) ((float) var7 - this.field6907);
                arg4[1] = (int) ((float) var8 + -this.field6824);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class489 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field6741;
        if (arg0 != arg2 || arg1 != arg3) {
            class622 var13 = (class622) arg6;
            class525 var14 = var13.field8565;
            this.method2804((byte) 23);
            this.method2850(99, var13.field8565);
            this.method2844(110, arg5);
            this.method2799(-27874, 7681, 8448);
            this.method2775(34167, (byte) -88, 768, 0);
            float var15 = var14.field7335 / (float) var14.field7334;
            float var16 = var14.field7330 / (float) var14.field7336;
            float var17 = (float) (-arg0) + (float) arg2;
            float var18 = (float) arg3 - (float) arg1;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            int var20 = arg11 % (arg9 + arg10);
            float var21 = var18 * var19;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var22 = var17 * var19;
            float var23 = (float) arg9 * var22;
            float var24 = (float) arg9 * var21;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (var20 > arg9) {
                var25 = (float) (-var20 + arg10 + arg9) * var22;
                var26 = (float) (arg10 - var20 + arg9) * var21;
            } else {
                var27 = (float) (arg9 - var20) * var22;
                var28 = (float) (arg9 - var20) * var21;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var22;
            float var32 = (float) arg10 * var21;
            while (true) {
                if (arg0 < arg2) {
                    if (var29 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if ((float) arg2 < var27 + var29) {
                        var27 = (float) arg2 - var29;
                    }
                } else {
                    if ((float) arg2 + 0.35F > var29) {
                        break;
                    }
                    if ((float) arg2 > var27 + var29) {
                        var27 = (float) arg2 - var29;
                    }
                }
                if (~arg1 <= ~arg3) {
                    if (var30 < (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 > var28 + var30) {
                        var28 = (float) arg3 - var30;
                    }
                } else {
                    if (var30 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 < var28 + var30) {
                        var28 = (float) arg3 - var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f(((float) (-arg7) + var29) * var15, (var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 + (float) (-arg7)) * var15, (var28 + var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                OpenGL.glEnd();
                var29 += var27 + var31;
                var30 += var28 + var32;
                var27 = var23;
                var28 = var24;
            }
            this.method2775(5890, (byte) -88, 768, 0);
        }
    }

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "(B)V")
    private final void method2840(byte arg0) {
        if (arg0 != 91) {
            this.method535((int[]) null, 65, -82, -10, 51, true);
        }
        class275.field3459[0] = this.field6892 * this.field6835;
        class275.field3459[1] = this.field6899 * this.field6835;
        class275.field3459[2] = this.field6835 * this.field6816;
        class275.field3459[3] = 1.0F;
        ++field6712;
        OpenGL.glLightModelfv(2899, class275.field3459, 0);
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(Z)V")
    private final void method2841(boolean arg0) {
        if (~this.field6809 != -2) {
            this.method2783((byte) 79);
            this.method2789(false, 16160);
            this.method2776(1, false);
            this.method2801(-1, false);
            this.method2816((byte) -114, false);
            this.method2850(-70, (class695) null);
            this.method2777(-2, 1);
            this.method2800(1, -50);
            this.field6809 = 1;
        }
        if (arg0) {
            this.method505((class631) null);
        }
        ++field6719;
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(Z)V")
    private final void method2842(boolean arg0) {
        this.field6889[10] = this.field6843;
        ++field6591;
        this.field6889[14] = this.field6870;
        this.field6853 = (float) this.field6840;
        this.field6920 = (this.field6889[14] + (float) (-this.field6840)) / this.field6889[10];
        if (!arg0) {
            this.method2847(101, false);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public final void method433(int arg0) {
        ++field6661;
        this.method2791(-5122);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIBI)V")
    public final void method2843(int arg0, int arg1, byte arg2, int arg3) {
        ++field6656;
        OpenGL.glDrawArrays(arg1, arg3, arg0);
        if (arg2 != -66) {
            this.method2785(-106);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)Llda;")
    public final class488 method481(int arg0, int arg1) {
        ++field6634;
        return null;
    }

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "()Z")
    public final boolean method482() {
        ++field6680;
        return this.field6763.method1226(3, 0);
    }

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "(II)V")
    public final void method2844(int arg0, int arg1) {
        ++field6649;
        if (this.field6805 != arg1) {
            byte var3;
            boolean var4;
            boolean var5;
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    var3 = 2;
                    var4 = true;
                    var5 = false;
                } else if (~arg1 != -129) {
                    var5 = false;
                    var3 = 0;
                    var4 = true;
                } else {
                    var5 = true;
                    var3 = 3;
                    var4 = true;
                }
            } else {
                var5 = true;
                var3 = 1;
                var4 = true;
            }
            if (!var4 != !this.field6803) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field6803 = var4;
            }
            if (!var5 != !this.field6804) {
                if (var5) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field6804 = var5;
            }
            if (~this.field6807 != ~var3) {
                if (~var3 != -2) {
                    if (var3 == 2) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    } else if (~var3 != -4) {
                        OpenGL.glDisable(3042);
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field6807 = var3;
            }
            this.field6809 &= -29;
            this.field6805 = arg1;
        }
        if (arg0 < 105) {
            this.method443(83, 109, 116, 15, -79, 7, (byte[]) null, -110, -126);
        }
    }

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "(I)V")
    private final void method2845(int arg0) {
        this.field6922 = (float) (-this.field6858 + this.field6840) + -this.field6859;
        ++field6630;
        this.field6838 = this.field6922 - (float) this.field6814 * this.field6836;
        if (arg0 == 650342096) {
            if ((float) this.field6855 > this.field6838) {
                this.field6838 = (float) this.field6855;
            }
            OpenGL.glFogf(2915, this.field6838);
            OpenGL.glFogf(2916, this.field6922);
            class275.field3459[1] = (float) class702.method3949(65280, this.field6864) / 65280.0F;
            class275.field3459[2] = (float) class702.method3949(255, this.field6864) / 255.0F;
            class275.field3459[0] = (float) class702.method3949(16711680, this.field6864) / 1.671168E7F;
            OpenGL.glFogfv(2918, class275.field3459, 0);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method533(Canvas arg0) {
        ++field6684;
        if (this.field6690 == arg0) {
            throw new RuntimeException();
        } else if (this.field6613.containsKey(arg0)) {
            Long var2 = (Long) this.field6613.get(arg0);
            this.field6660.releaseSurface(arg0, var2);
            this.field6613.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(IIIID)V")
    public final void method524(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field6720;
    }

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "(IIIIIII)I")
    public final int method501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6722;
        float var8 = (float) arg2 * this.field6806.field913 + (float) arg0 * this.field6806.field905 + (float) arg1 * this.field6806.field935 + this.field6806.field927;
        float var9 = (float) arg5 * this.field6806.field913 + (float) arg3 * this.field6806.field905 + (float) arg4 * this.field6806.field935 + this.field6806.field927;
        int var10 = 0;
        if ((float) this.field6855 > var8 && (float) this.field6855 > var9) {
            var10 |= 16;
        } else if (var8 > (float) this.field6840 && (float) this.field6840 < var9) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field6806.field916 + (float) arg0 * this.field6806.field915 + (float) arg1 * this.field6806.field936 + this.field6806.field914) * (float) this.field6820 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field6806.field916 + (float) arg3 * this.field6806.field915 + (float) arg4 * this.field6806.field936 + this.field6806.field914) * (float) this.field6820 / (float) arg6);
        if ((float) var11 < this.field6907 && (float) var12 < this.field6907) {
            var10 |= 1;
        } else if ((float) var11 > this.field6905 && this.field6905 < (float) var12) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field6806.field906 + (float) arg0 * this.field6806.field937 + (float) arg1 * this.field6806.field925 + this.field6806.field921) * (float) this.field6857 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field6806.field906 + (float) arg3 * this.field6806.field937 + (float) arg4 * this.field6806.field925 + this.field6806.field921) * (float) this.field6857 / (float) arg6);
        if ((float) var13 < this.field6824 && (float) var14 < this.field6824) {
            var10 |= 4;
        } else if (this.field6916 < (float) var13 && (float) var14 > this.field6916) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZ)Liea;")
    public final class481 method551(int arg0, int arg1, boolean arg2) {
        ++field6632;
        return new class603(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method432(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class230 {
        ++field6738;
        this.method497(arg2, arg3);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIII)V")
    public final void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6673;
        OpenGL.glLineWidth((float) arg5);
        this.method438(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "(I)V")
    private final void method2846(int arg0) {
        ++field6566;
        int var2 = 0;
        if (arg0 != 768) {
            this.method2844(30, -73);
        }
        while (this.field6876 > var2) {
            class123 var3 = this.field6874[var2];
            class681.field9503[0] = (float) var3.method932(class386.method2198(arg0, -17330));
            int var4 = var2 + 16386;
            class681.field9503[1] = (float) var3.method937(68);
            class681.field9503[2] = (float) var3.method938(class386.method2198(arg0, 768));
            class681.field9503[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class681.field9503, 0);
            int var5 = var3.method934((byte) -99);
            float var6 = var3.method939(-11214) / 255.0F;
            class681.field9503[1] = var6 * (float) class702.method3949(var5 >> 8, 255);
            class681.field9503[2] = (float) class702.method3949(var5, 255) * var6;
            class681.field9503[0] = (float) (class702.method3949(16746115, var5) >> 16) * var6;
            OpenGL.glLightfv(var4, 4609, class681.field9503, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method935(0) * var3.method935(arg0 + -768)));
            OpenGL.glEnable(var4);
            ++var2;
        }
        while (this.field6833 > var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field6833 = this.field6876;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(IZ)V")
    public final void method2847(int arg0, boolean arg1) {
        if (this.field6902 != arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field6902 = arg0;
        }
        ++field6717;
        if (arg1) {
            this.field6813 = -36;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II[I[I)Laa;")
    public final class489 method487(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field6627;
        return class677.method3821(arg3, arg2, arg1, this, true, arg0);
    }

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "(ILaa;II)V")
    public final void method450(int arg0, class489 arg1, int arg2, int arg3) {
        ++field6604;
        class622 var5 = (class622) arg1;
        class525 var6 = var5.field8565;
        this.method2804((byte) 23);
        this.method2850(-119, var5.field8565);
        this.method2844(107, 1);
        this.method2799(-27874, 7681, 8448);
        this.method2775(34167, (byte) -88, 768, 0);
        float var7 = var6.field7335 / (float) var6.field7334;
        float var8 = var6.field7330 / (float) var6.field7336;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field6872) * var7, (float) (-arg3 + this.field6895) * var8);
        OpenGL.glVertex2i(this.field6872, this.field6895);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field6872) * var7, (float) (-arg3 + this.field6850) * var8);
        OpenGL.glVertex2i(this.field6872, this.field6850);
        OpenGL.glTexCoord2f((float) (this.field6885 - arg2) * var7, (float) (-arg3 + this.field6850) * var8);
        OpenGL.glVertex2i(this.field6885, this.field6850);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field6885) * var7, (float) (this.field6895 - arg3) * var8);
        OpenGL.glVertex2i(this.field6885, this.field6895);
        OpenGL.glEnd();
        this.method2775(5890, (byte) -88, 768, 0);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(IB)I")
    public final int method2848(int arg0, byte arg1) {
        if (arg1 != -27) {
            this.method2785(92);
        }
        ++field6663;
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

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "(Z)V")
    public final void method504(boolean arg0) {
        ++field6734;
        this.field6878 = arg0;
        this.method2820(-2);
    }

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "()Z")
    public final boolean method549() {
        ++field6757;
        return false;
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "()V")
    public final void method444() {
        ++field6685;
        if (!this.field6861) {
            if (!this.field6898) {
                throw new RuntimeException("");
            }
            this.field6782.method154(0, 0, this.field6681, this.field6671, 0, 0);
            this.field6660.setSurface(this.field6760);
        } else {
            if (this.field6786 != this.field6783) {
                throw new RuntimeException();
            }
            this.field6783.method3688(-75, 0);
            this.field6783.method3688(89, 8);
            this.method2851(-128, this.field6783);
        }
        this.field6782 = null;
        this.field6681 = this.field6652;
        this.field6671 = this.field6744;
        this.method2785(-1);
        this.method2794(1);
        this.method446();
    }

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "()Lpda;")
    public final class631 method531() {
        ++field6637;
        return this.field6772;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(ILjm;)V")
    public final void method2849(int arg0, class691 arg1) {
        ++field6709;
        if (arg0 != 1) {
            this.method444();
        }
        if (this.field6781 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field6781 <= -1) {
                this.field6789[this.field6781].method3689((byte) 0);
            }
            this.field6786 = this.field6789[++this.field6781] = arg1;
            this.field6786.method3697((byte) -102);
        }
    }

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "()Lpda;")
    public final class631 method502() {
        ++field6716;
        return new class65();
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)V")
    public final void method507(boolean arg0) {
        ++field6571;
    }

    @OriginalMember(owner = "client!bi", name = "na", descriptor = "(IIII)[I")
    public final int[] method465(int arg0, int arg1, int arg2, int arg3) {
        ++field6721;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, this.field6671 - (arg1 - -var6), arg2, 1, 32993, this.field6837, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "()Z")
    public final boolean method513() {
        ++field6587;
        return true;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILcj;)V")
    public final void method2850(int arg0, class695 arg1) {
        ++field6600;
        class695 var3 = this.field6882[this.field6902];
        if (arg1 != var3) {
            if (arg1 != null) {
                if (var3 == null) {
                    OpenGL.glEnable(arg1.field9659);
                } else if (arg1.field9659 != var3.field9659) {
                    OpenGL.glDisable(var3.field9659);
                    OpenGL.glEnable(arg1.field9659);
                }
                OpenGL.glBindTexture(arg1.field9659, arg1.method3899(4));
            } else {
                OpenGL.glDisable(var3.field9659);
            }
            this.field6882[this.field6902] = arg1;
        }
        this.field6809 &= -2;
        int var4 = 49 % ((20 - arg0) / 43);
    }

    @OriginalMember(owner = "client!bi", name = "ra", descriptor = "(IIII)V")
    public final void method503(int arg0, int arg1, int arg2, int arg3) {
        ++field6696;
        this.field6915 = true;
        this.field6846 = arg2;
        this.field6812 = arg3;
        this.field6909 = arg0;
        this.field6917 = arg1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[Llaa;)V")
    public final void method456(int arg0, class123[] arg1) {
        ++field6641;
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field6874[var3] = arg1[var3];
        }
        this.field6876 = arg0;
        if (~this.field6847 != -2) {
            this.method2846(768);
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(ILjm;)V")
    public final void method2851(int arg0, class691 arg1) {
        ++field6723;
        int var3 = 53 / ((arg0 - -69) / 48);
        if (!this.field6910) {
            if (this.field6784 >= 0 && this.field6790[this.field6784] == arg1) {
                this.field6790[this.field6784--] = null;
                arg1.method3690(28419);
                if (~this.field6784 <= -1) {
                    this.field6787 = this.field6786 = this.field6790[this.field6784];
                    this.field6787.method3686(true);
                } else {
                    this.field6787 = this.field6786 = null;
                }
            } else {
                throw new RuntimeException();
            }
        } else {
            this.method2836(4615, arg1);
            this.method2828(arg1, -8);
        }
    }

    @OriginalMember(owner = "client!bi", name = "KA", descriptor = "(IIII)V")
    public final void method534(int arg0, int arg1, int arg2, int arg3) {
        ++field6575;
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (~arg2 < ~this.field6681) {
            arg2 = this.field6681;
        }
        if (arg3 > this.field6671) {
            arg3 = this.field6671;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        this.field6850 = arg3;
        this.field6872 = arg0;
        this.field6895 = arg1;
        this.field6885 = arg2;
        OpenGL.glEnable(3089);
        this.method2803(0);
        this.method2802(26781);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLju;)V")
    public final void method2852(byte arg0, class128 arg1) {
        if (arg0 != 48) {
            this.field6792 = -33;
        }
        ++field6767;
        if (this.field6818 != arg1) {
            if (this.field6860) {
                OpenGL.glBindBufferARB(34962, arg1.method960(-21047));
            }
            this.field6818 = arg1;
        }
    }

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "(I)V")
    public final void method2853(int arg0) {
        ++field6622;
        if (arg0 != -20561) {
            this.field6690 = null;
        }
        OpenGL.glLightfv(16384, 4611, this.field6871, 0);
        OpenGL.glLightfv(16385, 4611, this.field6918, 0);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIILg;B)V")
    public final void method2854(int arg0, int arg1, int arg2, class158 arg3, byte arg4) {
        ++field6645;
        int var6 = arg3.method1104(-112);
        int var7 = arg1 * this.method2848(var6, (byte) -27);
        this.method2834(arg3, true);
        OpenGL.glDrawElements(arg0, arg2, var6, (long) var7 + arg3.method1105((byte) -122));
        if (arg4 > -45) {
            this.field6849 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "ya", descriptor = "()V")
    public final void method512() {
        ++field6715;
        this.method2816((byte) -96, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lpda;)V")
    public final void method505(class631 arg0) {
        this.field6806.method604(arg0);
        ++field6755;
        this.field6810.method604(this.field6806);
        this.field6810.method612(true);
        this.field6811.method602(16383, this.field6810);
        if (this.field6847 != 1) {
            this.method2830(-2);
        }
    }
}
