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

@OriginalClass("client!gk")
public class class463 extends class129 {

    @OriginalMember(owner = "client!gk", name = "eb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field6523 = new Hashtable();

    @OriginalMember(owner = "client!gk", name = "ge", descriptor = "I")
    public int field6681 = 128;

    @OriginalMember(owner = "client!gk", name = "he", descriptor = "Lic;")
    private class271 field6682 = new class271();

    @OriginalMember(owner = "client!gk", name = "le", descriptor = "Lsf;")
    private class452 field6686 = new class452();

    @OriginalMember(owner = "client!gk", name = "me", descriptor = "Lsf;")
    public class452 field6687 = new class452();

    @OriginalMember(owner = "client!gk", name = "oe", descriptor = "I")
    public int field6689 = 3;

    @OriginalMember(owner = "client!gk", name = "ne", descriptor = "Z")
    private boolean field6688 = false;

    @OriginalMember(owner = "client!gk", name = "se", descriptor = "I")
    public int field6693 = 8;

    @OriginalMember(owner = "client!gk", name = "re", descriptor = "Ltu;")
    private class7 field6692 = new class7();

    @OriginalMember(owner = "client!gk", name = "we", descriptor = "[Lie;")
    private class87[] field6697 = new class87[4];

    @OriginalMember(owner = "client!gk", name = "xe", descriptor = "I")
    private int field6698 = -1;

    @OriginalMember(owner = "client!gk", name = "ue", descriptor = "I")
    private int field6695 = -1;

    @OriginalMember(owner = "client!gk", name = "ye", descriptor = "[Lie;")
    private class87[] field6699 = new class87[4];

    @OriginalMember(owner = "client!gk", name = "ze", descriptor = "I")
    private int field6700 = -1;

    @OriginalMember(owner = "client!gk", name = "Be", descriptor = "[Lie;")
    private class87[] field6702 = new class87[4];

    @OriginalMember(owner = "client!gk", name = "Fe", descriptor = "Ltu;")
    private class7 field6706;

    @OriginalMember(owner = "client!gk", name = "Ge", descriptor = "Ltu;")
    private class7 field6707;

    @OriginalMember(owner = "client!gk", name = "He", descriptor = "Ltu;")
    private class7 field6708;

    @OriginalMember(owner = "client!gk", name = "Ie", descriptor = "Ltu;")
    private class7 field6709;

    @OriginalMember(owner = "client!gk", name = "Je", descriptor = "Ltu;")
    private class7 field6710;

    @OriginalMember(owner = "client!gk", name = "Ke", descriptor = "Ltu;")
    private class7 field6711;

    @OriginalMember(owner = "client!gk", name = "Le", descriptor = "Ltu;")
    private class7 field6712;

    @OriginalMember(owner = "client!gk", name = "hf", descriptor = "I")
    private int field6734;

    @OriginalMember(owner = "client!gk", name = "Te", descriptor = "I")
    public int field6720;

    @OriginalMember(owner = "client!gk", name = "cf", descriptor = "I")
    public int field6729;

    @OriginalMember(owner = "client!gk", name = "Cf", descriptor = "F")
    public float field6754;

    @OriginalMember(owner = "client!gk", name = "Ef", descriptor = "I")
    public int field6756;

    @OriginalMember(owner = "client!gk", name = "yf", descriptor = "[F")
    public float[] field6750;

    @OriginalMember(owner = "client!gk", name = "pf", descriptor = "F")
    public float field6741;

    @OriginalMember(owner = "client!gk", name = "of", descriptor = "I")
    public int field6740;

    @OriginalMember(owner = "client!gk", name = "bf", descriptor = "I")
    private int field6728;

    @OriginalMember(owner = "client!gk", name = "Yf", descriptor = "F")
    public float field6776;

    @OriginalMember(owner = "client!gk", name = "Of", descriptor = "F")
    public float field6766;

    @OriginalMember(owner = "client!gk", name = "Tf", descriptor = "F")
    private float field6771;

    @OriginalMember(owner = "client!gk", name = "fg", descriptor = "I")
    private int field6783;

    @OriginalMember(owner = "client!gk", name = "Ye", descriptor = "F")
    public float field6725;

    @OriginalMember(owner = "client!gk", name = "Qf", descriptor = "I")
    public int field6768;

    @OriginalMember(owner = "client!gk", name = "Bf", descriptor = "I")
    private int field6753;

    @OriginalMember(owner = "client!gk", name = "qg", descriptor = "[F")
    private float[] field6794;

    @OriginalMember(owner = "client!gk", name = "Xe", descriptor = "I")
    public int field6724;

    @OriginalMember(owner = "client!gk", name = "vg", descriptor = "[F")
    private float[] field6799;

    @OriginalMember(owner = "client!gk", name = "mg", descriptor = "I")
    private int field6790;

    @OriginalMember(owner = "client!gk", name = "Ag", descriptor = "I")
    private int field6804;

    @OriginalMember(owner = "client!gk", name = "Mg", descriptor = "F")
    public float field6816;

    @OriginalMember(owner = "client!gk", name = "Og", descriptor = "F")
    public float field6818;

    @OriginalMember(owner = "client!gk", name = "qf", descriptor = "I")
    public int field6742;

    @OriginalMember(owner = "client!gk", name = "Kf", descriptor = "I")
    private int field6762;

    @OriginalMember(owner = "client!gk", name = "Ve", descriptor = "F")
    private float field6722;

    @OriginalMember(owner = "client!gk", name = "Tg", descriptor = "I")
    private int field6823;

    @OriginalMember(owner = "client!gk", name = "cg", descriptor = "[F")
    private float[] field6780;

    @OriginalMember(owner = "client!gk", name = "zg", descriptor = "[F")
    private float[] field6803;

    @OriginalMember(owner = "client!gk", name = "Zf", descriptor = "F")
    private float field6777;

    @OriginalMember(owner = "client!gk", name = "dg", descriptor = "F")
    public float field6781;

    @OriginalMember(owner = "client!gk", name = "Nf", descriptor = "I")
    public int field6765;

    @OriginalMember(owner = "client!gk", name = "Rg", descriptor = "Z")
    private boolean field6821;

    @OriginalMember(owner = "client!gk", name = "Eg", descriptor = "I")
    public int field6808;

    @OriginalMember(owner = "client!gk", name = "Xg", descriptor = "[Lve;")
    private class182[] field6827;

    @OriginalMember(owner = "client!gk", name = "Zg", descriptor = "I")
    private int field6829;

    @OriginalMember(owner = "client!gk", name = "Gg", descriptor = "I")
    public int field6810;

    @OriginalMember(owner = "client!gk", name = "ah", descriptor = "I")
    public int field6830;

    @OriginalMember(owner = "client!gk", name = "We", descriptor = "I")
    private int field6723;

    @OriginalMember(owner = "client!gk", name = "Tc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6616;

    @OriginalMember(owner = "client!gk", name = "P", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6508;

    @OriginalMember(owner = "client!gk", name = "je", descriptor = "I")
    public int field6684;

    @OriginalMember(owner = "client!gk", name = "cc", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field6573;

    @OriginalMember(owner = "client!gk", name = "gb", descriptor = "J")
    private long field6525;

    @OriginalMember(owner = "client!gk", name = "qb", descriptor = "J")
    private long field6535;

    @OriginalMember(owner = "client!gk", name = "Hf", descriptor = "Z")
    public boolean field6759;

    @OriginalMember(owner = "client!gk", name = "pg", descriptor = "I")
    public int field6793;

    @OriginalMember(owner = "client!gk", name = "Pg", descriptor = "Ljava/lang/String;")
    private String field6819;

    @OriginalMember(owner = "client!gk", name = "Af", descriptor = "Z")
    public boolean field6752;

    @OriginalMember(owner = "client!gk", name = "Ff", descriptor = "Z")
    private boolean field6757;

    @OriginalMember(owner = "client!gk", name = "Bg", descriptor = "Z")
    public boolean field6805;

    @OriginalMember(owner = "client!gk", name = "dh", descriptor = "Z")
    public boolean field6833;

    @OriginalMember(owner = "client!gk", name = "Yg", descriptor = "Z")
    private boolean field6828;

    @OriginalMember(owner = "client!gk", name = "Ne", descriptor = "Ljava/lang/String;")
    private String field6714;

    @OriginalMember(owner = "client!gk", name = "Se", descriptor = "Z")
    public boolean field6719;

    @OriginalMember(owner = "client!gk", name = "Jg", descriptor = "Z")
    private boolean field6813;

    @OriginalMember(owner = "client!gk", name = "ie", descriptor = "Lch;")
    public class161 field6683;

    @OriginalMember(owner = "client!gk", name = "qe", descriptor = "Ldm;")
    public class298 field6691;

    @OriginalMember(owner = "client!gk", name = "ke", descriptor = "Ljf;")
    private class20 field6685;

    @OriginalMember(owner = "client!gk", name = "ee", descriptor = "Lrj;")
    private class487 field6679;

    @OriginalMember(owner = "client!gk", name = "fe", descriptor = "Lme;")
    private class71 field6680;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "Loi;")
    public static class169 field6487 = new class169("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!gk", name = "yd", descriptor = "J")
    public static long field6647 = 0L;

    @OriginalMember(owner = "client!gk", name = "Ed", descriptor = "[[Z")
    public static boolean[][] field6653 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!gk", name = "ef", descriptor = "F")
    public float field6731;

    @OriginalMember(owner = "client!gk", name = "ff", descriptor = "F")
    public float field6732;

    @OriginalMember(owner = "client!gk", name = "jf", descriptor = "F")
    private float field6735;

    @OriginalMember(owner = "client!gk", name = "rf", descriptor = "F")
    public float field6743;

    @OriginalMember(owner = "client!gk", name = "sf", descriptor = "F")
    public float field6744;

    @OriginalMember(owner = "client!gk", name = "wf", descriptor = "F")
    private float field6748;

    @OriginalMember(owner = "client!gk", name = "If", descriptor = "F")
    private float field6760;

    @OriginalMember(owner = "client!gk", name = "gg", descriptor = "F")
    public float field6784;

    @OriginalMember(owner = "client!gk", name = "ng", descriptor = "F")
    public float field6791;

    @OriginalMember(owner = "client!gk", name = "Wg", descriptor = "F")
    public float field6826;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!gk", name = "H", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!gk", name = "I", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!gk", name = "J", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!gk", name = "K", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!gk", name = "L", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!gk", name = "M", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!gk", name = "N", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!gk", name = "O", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!gk", name = "Q", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!gk", name = "R", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!gk", name = "S", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!gk", name = "T", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!gk", name = "U", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!gk", name = "V", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!gk", name = "W", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!gk", name = "X", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!gk", name = "Y", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!gk", name = "Z", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!gk", name = "ab", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!gk", name = "bb", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!gk", name = "cb", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!gk", name = "db", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!gk", name = "fb", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!gk", name = "hb", descriptor = "I")
    private int field6526;

    @OriginalMember(owner = "client!gk", name = "ib", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!gk", name = "jb", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!gk", name = "kb", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!gk", name = "lb", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!gk", name = "mb", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!gk", name = "nb", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!gk", name = "ob", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!gk", name = "pb", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!gk", name = "rb", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!gk", name = "sb", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!gk", name = "tb", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!gk", name = "ub", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!gk", name = "vb", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!gk", name = "wb", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!gk", name = "xb", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!gk", name = "yb", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!gk", name = "zb", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!gk", name = "Ab", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!gk", name = "Bb", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!gk", name = "Cb", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!gk", name = "Db", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!gk", name = "Eb", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!gk", name = "Fb", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!gk", name = "Gb", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!gk", name = "Hb", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!gk", name = "Ib", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!gk", name = "Jb", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!gk", name = "Kb", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!gk", name = "Lb", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!gk", name = "Mb", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!gk", name = "Nb", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!gk", name = "Ob", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!gk", name = "Pb", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!gk", name = "Qb", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!gk", name = "Rb", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!gk", name = "Sb", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!gk", name = "Tb", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!gk", name = "Ub", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!gk", name = "Vb", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!gk", name = "Wb", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!gk", name = "Yb", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!gk", name = "Zb", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!gk", name = "ac", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!gk", name = "bc", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!gk", name = "dc", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!gk", name = "ec", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!gk", name = "fc", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!gk", name = "gc", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!gk", name = "hc", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!gk", name = "ic", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!gk", name = "jc", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!gk", name = "kc", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!gk", name = "lc", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!gk", name = "mc", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!gk", name = "nc", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!gk", name = "oc", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!gk", name = "pc", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!gk", name = "qc", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!gk", name = "rc", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!gk", name = "sc", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!gk", name = "tc", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!gk", name = "uc", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!gk", name = "vc", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!gk", name = "wc", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!gk", name = "xc", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!gk", name = "yc", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!gk", name = "zc", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!gk", name = "Ac", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!gk", name = "Bc", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!gk", name = "Cc", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!gk", name = "Dc", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!gk", name = "Ec", descriptor = "I")
    private int field6601;

    @OriginalMember(owner = "client!gk", name = "Fc", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!gk", name = "Gc", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!gk", name = "Hc", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!gk", name = "Ic", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!gk", name = "Jc", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!gk", name = "Kc", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!gk", name = "Lc", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!gk", name = "Mc", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!gk", name = "Nc", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!gk", name = "Oc", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!gk", name = "Pc", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!gk", name = "Qc", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!gk", name = "Rc", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!gk", name = "Sc", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!gk", name = "Uc", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!gk", name = "Vc", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!gk", name = "Wc", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!gk", name = "Xc", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!gk", name = "Yc", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!gk", name = "Zc", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!gk", name = "ad", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!gk", name = "bd", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!gk", name = "cd", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!gk", name = "dd", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!gk", name = "ed", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!gk", name = "fd", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!gk", name = "gd", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!gk", name = "hd", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!gk", name = "id", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!gk", name = "jd", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!gk", name = "kd", descriptor = "I")
    public int field6633;

    @OriginalMember(owner = "client!gk", name = "ld", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!gk", name = "md", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!gk", name = "nd", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!gk", name = "od", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!gk", name = "pd", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!gk", name = "qd", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!gk", name = "rd", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!gk", name = "sd", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!gk", name = "td", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!gk", name = "ud", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!gk", name = "vd", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!gk", name = "wd", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!gk", name = "xd", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!gk", name = "zd", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!gk", name = "Ad", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!gk", name = "Bd", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!gk", name = "Cd", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!gk", name = "Dd", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!gk", name = "Fd", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!gk", name = "Gd", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!gk", name = "Hd", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!gk", name = "Id", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!gk", name = "Jd", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!gk", name = "Kd", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!gk", name = "Ld", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!gk", name = "Md", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!gk", name = "Nd", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!gk", name = "Od", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!gk", name = "Pd", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!gk", name = "Qd", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!gk", name = "Rd", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!gk", name = "Sd", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!gk", name = "Td", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!gk", name = "Ud", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!gk", name = "Vd", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!gk", name = "Wd", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!gk", name = "Xd", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!gk", name = "Yd", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!gk", name = "Zd", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!gk", name = "ae", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!gk", name = "be", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!gk", name = "ce", descriptor = "I")
    public int field6677;

    @OriginalMember(owner = "client!gk", name = "de", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!gk", name = "pe", descriptor = "I")
    public int field6690;

    @OriginalMember(owner = "client!gk", name = "Ce", descriptor = "I")
    public int field6703;

    @OriginalMember(owner = "client!gk", name = "De", descriptor = "I")
    public int field6704;

    @OriginalMember(owner = "client!gk", name = "Ee", descriptor = "I")
    private int field6705;

    @OriginalMember(owner = "client!gk", name = "xf", descriptor = "I")
    private int field6749;

    @OriginalMember(owner = "client!gk", name = "zf", descriptor = "I")
    private int field6751;

    @OriginalMember(owner = "client!gk", name = "Gf", descriptor = "I")
    public int field6758;

    @OriginalMember(owner = "client!gk", name = "Pf", descriptor = "I")
    private int field6767;

    @OriginalMember(owner = "client!gk", name = "Wf", descriptor = "I")
    private int field6774;

    @OriginalMember(owner = "client!gk", name = "Xf", descriptor = "I")
    private int field6775;

    @OriginalMember(owner = "client!gk", name = "bg", descriptor = "I")
    public int field6779;

    @OriginalMember(owner = "client!gk", name = "eg", descriptor = "I")
    private int field6782;

    @OriginalMember(owner = "client!gk", name = "jg", descriptor = "I")
    private int field6787;

    @OriginalMember(owner = "client!gk", name = "rg", descriptor = "I")
    private int field6795;

    @OriginalMember(owner = "client!gk", name = "sg", descriptor = "I")
    private int field6796;

    @OriginalMember(owner = "client!gk", name = "ug", descriptor = "I")
    public int field6798;

    @OriginalMember(owner = "client!gk", name = "xg", descriptor = "I")
    private int field6801;

    @OriginalMember(owner = "client!gk", name = "Hg", descriptor = "I")
    public int field6811;

    @OriginalMember(owner = "client!gk", name = "Lg", descriptor = "I")
    private int field6815;

    @OriginalMember(owner = "client!gk", name = "bh", descriptor = "I")
    private int field6831;

    @OriginalMember(owner = "client!gk", name = "ch", descriptor = "I")
    private int field6832;

    @OriginalMember(owner = "client!gk", name = "Mf", descriptor = "J")
    private long field6764;

    @OriginalMember(owner = "client!gk", name = "Sf", descriptor = "Ltp;")
    public class139 field6770;

    @OriginalMember(owner = "client!gk", name = "Ug", descriptor = "Ltp;")
    public class139 field6824;

    @OriginalMember(owner = "client!gk", name = "uf", descriptor = "Lsr;")
    public class346 field6746;

    @OriginalMember(owner = "client!gk", name = "og", descriptor = "Lsr;")
    public class346 field6792;

    @OriginalMember(owner = "client!gk", name = "Sg", descriptor = "Lsr;")
    public class346 field6822;

    @OriginalMember(owner = "client!gk", name = "Df", descriptor = "Lcw;")
    private class386 field6755;

    @OriginalMember(owner = "client!gk", name = "Ig", descriptor = "Lcm;")
    private class433 field6812;

    @OriginalMember(owner = "client!gk", name = "Me", descriptor = "Ldu;")
    public class438 field6713;

    @OriginalMember(owner = "client!gk", name = "Ue", descriptor = "Ldu;")
    public class438 field6721;

    @OriginalMember(owner = "client!gk", name = "df", descriptor = "Ldu;")
    public class438 field6730;

    @OriginalMember(owner = "client!gk", name = "lf", descriptor = "Ldu;")
    public class438 field6737;

    @OriginalMember(owner = "client!gk", name = "nf", descriptor = "Ldu;")
    public class438 field6739;

    @OriginalMember(owner = "client!gk", name = "vf", descriptor = "Ldu;")
    public class438 field6747;

    @OriginalMember(owner = "client!gk", name = "ig", descriptor = "Ldu;")
    public class438 field6786;

    @OriginalMember(owner = "client!gk", name = "kg", descriptor = "Ldu;")
    public class438 field6788;

    @OriginalMember(owner = "client!gk", name = "lg", descriptor = "Ldu;")
    public class438 field6789;

    @OriginalMember(owner = "client!gk", name = "Cg", descriptor = "Ldu;")
    public class438 field6806;

    @OriginalMember(owner = "client!gk", name = "wg", descriptor = "Lsf;")
    public class452 field6800;

    @OriginalMember(owner = "client!gk", name = "Dg", descriptor = "Lsf;")
    public class452 field6807;

    @OriginalMember(owner = "client!gk", name = "Oe", descriptor = "Ljh;")
    public class453 field6715;

    @OriginalMember(owner = "client!gk", name = "Jf", descriptor = "Ljh;")
    public class453 field6761;

    @OriginalMember(owner = "client!gk", name = "tg", descriptor = "Lgl;")
    private class486 field6797;

    @OriginalMember(owner = "client!gk", name = "Pe", descriptor = "Lhh;")
    private class500 field6716;

    @OriginalMember(owner = "client!gk", name = "ag", descriptor = "Lhh;")
    private class500 field6778;

    @OriginalMember(owner = "client!gk", name = "Xb", descriptor = "Lvg;")
    public static class55 field6568;

    @OriginalMember(owner = "client!gk", name = "ve", descriptor = "Lie;")
    private class87 field6696;

    @OriginalMember(owner = "client!gk", name = "Ae", descriptor = "Lie;")
    private class87 field6701;

    @OriginalMember(owner = "client!gk", name = "te", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field6694;

    @OriginalMember(owner = "client!gk", name = "Qe", descriptor = "Z")
    public boolean field6717;

    @OriginalMember(owner = "client!gk", name = "Re", descriptor = "Z")
    public boolean field6718;

    @OriginalMember(owner = "client!gk", name = "Ze", descriptor = "Z")
    public boolean field6726;

    @OriginalMember(owner = "client!gk", name = "gf", descriptor = "Z")
    private boolean field6733;

    @OriginalMember(owner = "client!gk", name = "kf", descriptor = "Z")
    private boolean field6736;

    @OriginalMember(owner = "client!gk", name = "mf", descriptor = "Z")
    private boolean field6738;

    @OriginalMember(owner = "client!gk", name = "tf", descriptor = "Z")
    private boolean field6745;

    @OriginalMember(owner = "client!gk", name = "Lf", descriptor = "Z")
    private boolean field6763;

    @OriginalMember(owner = "client!gk", name = "Rf", descriptor = "Z")
    private boolean field6769;

    @OriginalMember(owner = "client!gk", name = "Uf", descriptor = "Z")
    public boolean field6772;

    @OriginalMember(owner = "client!gk", name = "Vf", descriptor = "Z")
    public boolean field6773;

    @OriginalMember(owner = "client!gk", name = "hg", descriptor = "Z")
    private boolean field6785;

    @OriginalMember(owner = "client!gk", name = "yg", descriptor = "Z")
    public boolean field6802;

    @OriginalMember(owner = "client!gk", name = "Fg", descriptor = "Z")
    private boolean field6809;

    @OriginalMember(owner = "client!gk", name = "Kg", descriptor = "Z")
    private boolean field6814;

    @OriginalMember(owner = "client!gk", name = "Ng", descriptor = "Z")
    public boolean field6817;

    @OriginalMember(owner = "client!gk", name = "Qg", descriptor = "Z")
    private boolean field6820;

    @OriginalMember(owner = "client!gk", name = "Vg", descriptor = "Z")
    public boolean field6825;

    @OriginalMember(owner = "client!gk", name = "af", descriptor = "[Lrh;")
    private class31[] field6727;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V", line = 4)
    private final void method2717(byte arg0) {
        this.field6731 = (float) (-this.field6756 + this.field6723);
        this.field6744 = (float) (-this.field6768 + this.field6762);
        if (arg0 >= -59) {
            this.method822();
        }
        ++field6608;
        this.field6732 = (float) (-this.field6756 + this.field6829);
        this.field6784 = (float) (this.field6734 - this.field6768);
    }

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "(I)V", line = 21)
    private final void method2718(int arg0) {
        if (arg0 != 2912) {
            this.field6706 = null;
        }
        if (this.field6745 && ~this.field6810 <= -1 | this.field6773) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field6560;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)I", line = 38)
    public final int method880(int arg0, int arg1) {
        ++field6499;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "(I)V", line = 46)
    private final void method2719(int arg0) {
        class4.field31[1] = this.field6818 * this.field6766;
        class4.field31[0] = this.field6781 * this.field6766;
        class4.field31[2] = this.field6766 * this.field6754;
        class4.field31[3] = 1.0F;
        ++field6538;
        OpenGL.glLightfv(16384, 4609, class4.field31, 0);
        class4.field31[2] = -this.field6725 * this.field6754;
        if (arg0 == 3679) {
            class4.field31[0] = -this.field6725 * this.field6781;
            class4.field31[1] = -this.field6725 * this.field6818;
            class4.field31[3] = 1.0F;
            OpenGL.glLightfv(16385, 4609, class4.field31, 0);
        }
    }

    @OriginalMember(owner = "client!gk", name = "NA", descriptor = "(IIIIII)V", line = 68)
    public final void method861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6524;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method2727((byte) -46);
        this.method2760(arg5, 122);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field6769) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field6769) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!gk", name = "ia", descriptor = "(III[I)V", line = 101)
    public final void method855(int arg0, int arg1, int arg2, int[] arg3) {
        ++field6551;
        float var5 = (float) arg2 * this.field6807.field6294 + (float) arg0 * this.field6807.field6301 + (float) arg1 * this.field6807.field6288 + this.field6807.field6286;
        if (!((float) this.field6830 > var5) && !(var5 > (float) this.field6729)) {
            int var6 = (int) (((float) arg2 * this.field6807.field6290 + (float) arg0 * this.field6807.field6289 + (float) arg1 * this.field6807.field6306 + this.field6807.field6309) * (float) this.field6740 / var5);
            int var7 = (int) (((float) arg2 * this.field6807.field6313 + (float) arg0 * this.field6807.field6318 + (float) arg1 * this.field6807.field6316 + this.field6807.field6317) * (float) this.field6765 / var5);
            if (this.field6732 <= (float) var6 && this.field6731 >= (float) var6 && (float) var7 >= this.field6784 && (float) var7 <= this.field6744) {
                arg3[1] = (int) ((float) var7 + -this.field6784);
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 - this.field6732);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(II)V", line = 131)
    public final void method2720(int arg0, int arg1) {
        ++field6513;
        class4.field31[0] = (float) class60.method339(16711680, arg1) / 1.671168E7F;
        class4.field31[1] = (float) class60.method339(65280, arg1) / 65280.0F;
        class4.field31[3] = (float) (arg1 >>> 24) / 255.0F;
        class4.field31[2] = (float) class60.method339(arg1, 255) / 255.0F;
        if (arg0 != 20) {
            this.field6698 = -11;
        }
        OpenGL.glTexEnvfv(8960, 8705, class4.field31, 0);
    }

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "(I)V", line = 146)
    private final void method2721(int arg0) {
        int var2 = 49 % ((arg0 - -37) / 59);
        if (this.field6736) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field6736 = false;
        }
        ++field6659;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILie;)V", line = 163)
    public final void method2722(int arg0, class87 arg1) {
        ++field6657;
        if (arg0 >= ~this.field6695) {
            throw new RuntimeException();
        } else {
            if (this.field6695 >= 0) {
                this.field6697[this.field6695].method553((byte) 118);
            }
            this.field6696 = this.field6697[++this.field6695] = arg1;
            this.field6696.method548(-113);
        }
    }

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "(FF)V", line = 180)
    public final void method913(float arg0, float arg1) {
        if (this.field6816 != arg0 || this.field6743 != arg1) {
            this.field6743 = arg1;
            this.field6816 = arg0;
            this.method2790(4533);
            if (this.field6787 != 3) {
                if (this.field6787 == 2) {
                    this.method2762(5889);
                }
            } else {
                this.method2799(124);
            }
        }
        ++field6676;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V", line = 204)
    public final void method2723(int arg0, int arg1, int arg2) {
        this.field6783 = arg0;
        this.field6823 = arg1;
        ++field6496;
        this.method2785(arg2 + 29614);
        this.method2779((byte) -75);
        if (arg2 != -29614) {
            this.field6823 = -11;
        }
    }

    @OriginalMember(owner = "client!gk", name = "la", descriptor = "()F", line = 220)
    public final float method863() {
        ++field6604;
        return this.field6816;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLie;)V", line = 228)
    public final void method2724(byte arg0, class87 arg1) {
        ++field6557;
        if (arg0 != -1) {
            this.field6730 = null;
        }
        if (~this.field6700 <= -1 && this.field6702[this.field6700] == arg1) {
            this.field6702[this.field6700--] = null;
            arg1.method552(arg0 ^ 25298);
            if (this.field6700 < 0) {
                this.field6701 = null;
            } else {
                this.field6701 = this.field6702[this.field6700];
                this.field6701.method549(arg0 ^ -18501);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gk", name = "U", descriptor = "(IIIII)V", line = 255)
    public final void method904(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2727((byte) -46);
        ++field6669;
        this.method2760(arg4, 127);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lcm;B)V", line = 275)
    public final void method2725(class433 arg0, byte arg1) {
        ++field6520;
        if (arg1 >= -112) {
            this.method899(68, -66, 93, 15);
        }
        if (this.field6812 != arg0) {
            if (this.field6757) {
                OpenGL.glBindBufferARB(34963, arg0.method2065(-13703));
            }
            this.field6812 = arg0;
        }
    }

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "(Lia;)V", line = 295)
    public final void method829(class142 arg0) {
        ++field6664;
        this.field6807 = (class452) arg0;
        this.field6800.method2676(this.field6807, 8);
        if (~this.field6787 != -2) {
            this.method2763((byte) -26);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[Lve;)V", line = 313)
    public final void method906(int arg0, class182[] arg1) {
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field6827[var3] = arg1[var3];
        }
        ++field6611;
        this.field6751 = arg0;
        if (~this.field6787 != -2) {
            this.method2749((byte) 101);
        }
    }

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "(I)V", line = 336)
    public final void method2726(int arg0) {
        ++field6597;
        if (this.field6775 != arg0) {
            this.method2791(0);
            this.method2766(-32, true);
            this.method2800(8629, true);
            this.method2782(-17939, true);
            this.method2760(1, 116);
            this.method2739(0, 0);
            this.field6775 = 16;
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(B)V", line = 355)
    private final void method2727(byte arg0) {
        ++field6571;
        if (arg0 == -46) {
            if (this.field6775 != 1) {
                this.method2743(-25);
                this.method2766(arg0 + 14, false);
                this.method2797(false, (byte) -22);
                this.method2800(8629, false);
                this.method2782(arg0 + -17893, false);
                this.method2771((class31) null, arg0 ^ 16829);
                this.method2755(-2, true);
                this.method2739(1, arg0 ^ -46);
                this.field6775 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "(I)V", line = 378)
    public final void method2728(int arg0) {
        OpenGL.glLightfv(16384, 4611, this.field6750, 0);
        ++field6511;
        if (arg0 < -94) {
            OpenGL.glLightfv(16385, 4611, this.field6803, 0);
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(Z)V", line = 390)
    public final void method853(boolean arg0) {
        ++field6662;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Luu;IIII)Lc;", line = 401)
    public final class507 method888(class420 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6612;
        return new class438(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "()V", line = 409)
    public final void method893() {
        for (class508 var1 = this.field6692.method49(-126); var1 != null; var1 = this.field6692.method46((byte) 97)) {
            ((class520) var1).method3089(123);
        }
        ++field6589;
        if (this.field6685 != null) {
            this.field6685.method134(13225);
        }
        if (this.field6573 != null) {
            this.method2759(-101);
            Enumeration var2 = this.field6523.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field6523.get(var3);
                this.field6573.releaseSurface(var3, var4);
            }
            this.field6573.release();
            this.field6573 = null;
        }
        if (this.field6688) {
            class44.method284(true, true, (byte) 9);
            this.field6688 = false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "()I", line = 454)
    public final int method843() {
        ++field6605;
        return 4;
    }

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "()V", line = 463)
    public final void method911() {
        this.field6685.method136(-35);
        ++field6516;
    }

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "()F", line = 475)
    public final float method828() {
        ++field6562;
        return this.field6743;
    }

    @OriginalMember(owner = "client!gk", name = "Z", descriptor = "(IIII)V", line = 485)
    public final void method899(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field6734 > ~arg1) {
            this.field6734 = arg1;
        }
        if (this.field6762 > arg3) {
            this.field6762 = arg3;
        }
        if (~this.field6723 < ~arg2) {
            this.field6723 = arg2;
        }
        if (~arg0 < ~this.field6829) {
            this.field6829 = arg0;
        }
        ++field6666;
        OpenGL.glEnable(3089);
        this.method2717((byte) -122);
        this.method2779((byte) -75);
    }

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "(I)V", line = 511)
    private final void method2729(int arg0) {
        this.field6807 = new class452();
        ++field6572;
        this.field6800 = new class452();
        this.field6727 = new class31[this.field6779];
        if (arg0 == 30316) {
            this.field6746 = new class346(this, 3553, 6408, 1, 1);
            this.field6792 = new class346(this, 3553, 6408, 1, 1);
            this.field6822 = new class346(this, 3553, 6408, 1, 1);
            this.field6713 = new class438(this);
            this.field6786 = new class438(this);
            this.field6730 = new class438(this);
            this.field6806 = new class438(this);
            this.field6721 = new class438(this);
            this.field6739 = new class438(this);
            this.field6737 = new class438(this);
            this.field6788 = new class438(this);
            this.field6789 = new class438(this);
            this.field6747 = new class438(this);
            if (this.field6719) {
                this.field6761 = new class453(this);
                this.field6715 = new class453(this);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 544)
    public final void method852(Canvas arg0) {
        ++field6581;
        long var2 = 0L;
        if (arg0 != null && this.field6616 != arg0) {
            if (this.field6523.containsKey(arg0)) {
                Long var4 = (Long) this.field6523.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field6525;
        }
        if (var2 == 0L) {
            throw new RuntimeException();
        } else {
            this.field6573.surfaceResized(var2);
            if (this.field6508 == arg0) {
                this.method2730((byte) 104);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(B)V", line = 574)
    private final void method2730(byte arg0) {
        ++field6521;
        if (this.field6508 == null) {
            this.field6601 = this.field6526 = 0;
        } else {
            Dimension var2 = this.field6508.getSize();
            this.field6601 = var2.width;
            this.field6526 = var2.height;
        }
        if (this.field6701 == null) {
            this.field6677 = this.field6526;
            this.field6633 = this.field6601;
            this.method2785(0);
        }
        this.method2776((byte) -99);
        if (arg0 < 91) {
            this.method2744(-36, (class452) null);
        }
        this.method865();
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lm;ILhs;)V", line = 603)
    public class463(int arg0, Canvas arg1, class79 arg2, int arg3, class441 arg4) {
        super(arg0, arg2);
        new class476();
        new class357(16);
        this.field6706 = new class7();
        this.field6707 = new class7();
        this.field6708 = new class7();
        this.field6709 = new class7();
        this.field6710 = new class7();
        this.field6711 = new class7();
        this.field6712 = new class7();
        this.field6734 = 0;
        this.field6720 = -1;
        this.field6729 = 3584;
        this.field6754 = 1.0F;
        this.field6756 = 0;
        this.field6750 = new float[4];
        this.field6741 = 3584.0F;
        this.field6740 = 512;
        this.field6728 = -1;
        this.field6776 = 3584.0F;
        this.field6766 = -1.0F;
        this.field6771 = 1.0F;
        this.field6783 = 0;
        this.field6725 = -1.0F;
        this.field6768 = 0;
        this.field6753 = -1;
        this.field6794 = new float[16];
        this.field6724 = 0;
        this.field6799 = new float[4];
        this.field6790 = 8448;
        this.field6804 = 8448;
        this.field6816 = 3000.0F;
        this.field6818 = 1.0F;
        this.field6742 = -1;
        this.field6762 = 0;
        this.field6722 = 1.0F;
        this.field6823 = 0;
        this.field6780 = new float[4];
        this.field6803 = new float[4];
        this.field6777 = 0.0F;
        this.field6781 = 1.0F;
        this.field6765 = 512;
        this.field6821 = true;
        this.field6808 = 0;
        this.field6827 = new class182[class12.field197];
        this.field6829 = 0;
        this.field6810 = -1;
        this.field6830 = 50;
        this.field6723 = 0;
        this.field6508 = this.field6616 = arg1;
        this.field6684 = arg3;
        try {
            if (class219.field2816 == null || !class219.field2816) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class219.field2816 = Boolean.TRUE;
                } else {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (var6.startsWith("mac")) {
                            System.load(arg4.method2609("libjaggl.jnilib", 127).toString());
                        } else {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method2609("jaggl.dll", 126).toString());
                        }
                    } else {
                        System.load(arg4.method2609("libjaggl.so", 126).toString());
                    }
                    class219.field2816 = Boolean.TRUE;
                }
            }
            if (class219.field2816 != null && class219.field2816) {
                this.field6573 = new OpenGL();
                this.field6535 = this.field6525 = this.field6573.init(arg1, 8, 8, 8, 24, 0, this.field6684);
                if (this.field6525 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method2754(123);
                    int var7 = this.method2787(true);
                    if (~var7 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field6793 = !this.field6759 ? 5121 : 33639;
                        if (~this.field6819.indexOf("radeon") != 0) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class332.method1978((byte) -70, ' ', this.field6819.replace('/', ' '));
                            for (int var12 = 0; var11.length > var12; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (var13.length() > 0) {
                                        if (var13.charAt(0) == 'x' && ~var13.length() <= -4 && class19.method126(var13.substring(1, 3), (byte) -116)) {
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
                                            if (var13.length() >= 4 && class19.method126(var13.substring(0, 4), (byte) -118)) {
                                                var8 = class109.method716(var13.substring(0, 4), 10);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var10 && !var9) {
                                if (~var8 <= -7001 && ~var8 >= -9251) {
                                    this.field6752 = false;
                                }
                                if (~var8 <= -7001 && ~var8 >= -8000) {
                                    this.field6757 = false;
                                }
                            }
                            if (!var9 || var8 < 4000) {
                                this.field6805 = false;
                            }
                            this.field6833 &= this.field6573.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field6828 = this.field6757;
                        }
                        if (this.field6714.indexOf("intel") != -1) {
                            this.field6719 = false;
                        }
                        this.field6813 = !this.field6714.equals("s3 graphics");
                        if (this.field6757) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class212.method1357(true, -11116, true);
                        this.field6688 = true;
                        this.field6683 = new class161(this, super.field1765);
                        this.method2729(30316);
                        this.field6691 = new class298(this);
                        this.field6685 = new class20(this);
                        if (this.field6685.method132(2)) {
                            this.field6679 = new class487(this);
                            if (!this.field6679.method2914((byte) 123)) {
                                this.field6679.method796(61);
                                this.field6679 = null;
                            }
                        }
                        this.field6680 = new class71(this);
                        this.method2764((byte) 82);
                        this.method2730((byte) 102);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field6573.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (var15++ > 5) {
                                    throw new RuntimeException("");
                                }
                                method2773(100L, -13);
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
            this.method893();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "()V", line = 806)
    public final void method841() {
        if (this.field6679 != null && this.field6679.method801(false)) {
            this.field6685.method128((byte) 69, this.field6679);
            this.field6683.method1073((byte) 71);
        }
        ++field6529;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(III)V", line = 824)
    public final synchronized void method2731(int arg0, int arg1, int arg2) {
        if (arg2 != 47) {
            this.method2739(-124, -35);
        }
        ++field6541;
        class206 var4 = new class206(arg0);
        var4.field7456 = (long) arg1;
        this.field6707.method42(var4, arg2 ^ 47);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIZ)Lf;", line = 842)
    public final class404 method905(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field6665;
        return new class233(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(Z)V", line = 850)
    private final void method2732(boolean arg0) {
        ++field6509;
        if (~this.field6787 != -3) {
            this.field6787 = 2;
            this.method2762(5889);
            this.method2763((byte) -26);
            this.field6775 &= -8;
        }
        if (arg0) {
            this.method908(-36);
        }
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(Z)V", line = 872)
    private final void method2733(boolean arg0) {
        ++field6578;
        float[] var2 = this.field6794;
        float var3 = (float) (-this.field6756 * this.field6830) / (float) this.field6740;
        float var4 = (float) ((-this.field6756 + this.field6633) * this.field6830) / (float) this.field6740;
        float var5 = (float) (this.field6830 * this.field6768) / (float) this.field6765;
        float var6 = (float) ((-this.field6677 + this.field6768) * this.field6830) / (float) this.field6765;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field6830 * 2.0F;
            var2[4] = 0.0F;
            var2[1] = 0.0F;
            var2[14] = this.field6748 = -((float) this.field6729 * var7) / (float) (-this.field6830 + this.field6729);
            var2[5] = var7 / (-var6 + var5);
            var2[12] = 0.0F;
            var2[10] = this.field6760 = (float) (-(this.field6830 + this.field6729)) / (float) (this.field6729 - this.field6830);
            var2[7] = 0.0F;
            var2[0] = var7 / (var4 - var3);
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[3] = 0.0F;
            var2[2] = 0.0F;
            var2[15] = 0.0F;
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[11] = -1.0F;
            var2[6] = 0.0F;
            var2[13] = 0.0F;
        } else {
            var2[5] = 1.0F;
            var2[6] = 0.0F;
            var2[15] = 1.0F;
            var2[7] = 0.0F;
            var2[3] = 0.0F;
            var2[11] = 0.0F;
            var2[0] = 1.0F;
            var2[1] = 0.0F;
            var2[13] = 0.0F;
            var2[8] = 0.0F;
            var2[2] = 0.0F;
            var2[14] = 0.0F;
            var2[9] = 0.0F;
            var2[4] = 0.0F;
            var2[12] = 0.0F;
            var2[10] = 1.0F;
        }
        if (!arg0) {
            this.method2749((byte) 104);
        }
        this.method2790(4533);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(FIF)V", line = 935)
    public final void method2734(float arg0, int arg1, float arg2) {
        ++field6620;
        this.field6777 = arg0;
        this.field6722 = arg2;
        if (arg1 == 3008) {
            if (!this.field6773) {
                this.method2768((byte) -77);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "(I)V", line = 951)
    private final void method2735(int arg0) {
        ++field6490;
        if (arg0 <= 109) {
            this.field6799 = null;
        }
        OpenGL.glDepthMask(this.field6814 && this.field6821);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([Lc;Lia;[Laq;I)V", line = 966)
    public final void method873(class507[] arg0, class142 arg1, class530[] arg2, int arg3) {
        ++field6566;
        for (int var5 = 0; ~var5 > ~arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method520(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "(I)V", line = 984)
    private final void method2736(int arg0) {
        ++field6621;
        class4.field31[3] = 1.0F;
        class4.field31[2] = this.field6791 * this.field6754;
        class4.field31[0] = this.field6791 * this.field6781;
        class4.field31[arg0] = this.field6818 * this.field6791;
        OpenGL.glLightModelfv(2899, class4.field31, 0);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lvh;Lvh;FLvh;)Lvh;", line = 997)
    public final class191 method860(class191 arg0, class191 arg1, float arg2, class191 arg3) {
        ++field6590;
        if (arg0 != null && arg1 != null && this.field6802 && this.field6719 && this.field6717) {
            class120 var5 = null;
            class486 var6 = (class486) arg0;
            class486 var7 = (class486) arg1;
            class244 var8 = var6.method762(27901);
            class244 var9 = var7.method762(27901);
            if (var8 != null && var9 != null) {
                int var10 = var9.field3130 >= var8.field3130 ? var9.field3130 : var8.field3130;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class120) {
                    class120 var11 = (class120) arg3;
                    if (var11.method767(6825) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class120(this, var10);
                }
                if (var5.method763(arg2, var9, var8, -9293)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(II)V", line = 1043)
    public final synchronized void method2737(int arg0, int arg1) {
        if (arg0 != 34166) {
            this.field6829 = 84;
        }
        ++field6576;
        class206 var3 = new class206(arg1);
        this.field6709.method42(var3, arg0 + -34166);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ll;)V", line = 1060)
    public final void method832(class125 arg0) {
        this.field6694 = ((class520) arg0).field7685;
        ++field6593;
        if (this.field6778 == null) {
            class205 var2 = new class205(80);
            if (this.field6759) {
                var2.method1343(-1.0F, 1829123664);
                var2.method1343(-1.0F, 1829123664);
                var2.method1343(0.0F, 1829123664);
                var2.method1343(0.0F, 1829123664);
                var2.method1343(1.0F, 1829123664);
                var2.method1343(1.0F, 1829123664);
                var2.method1343(-1.0F, 1829123664);
                var2.method1343(0.0F, 1829123664);
                var2.method1343(1.0F, 1829123664);
                var2.method1343(1.0F, 1829123664);
                var2.method1343(1.0F, 1829123664);
                var2.method1343(1.0F, 1829123664);
                var2.method1343(0.0F, 1829123664);
                var2.method1343(1.0F, 1829123664);
                var2.method1343(0.0F, 1829123664);
                var2.method1343(-1.0F, 1829123664);
                var2.method1343(1.0F, 1829123664);
                var2.method1343(0.0F, 1829123664);
                var2.method1343(0.0F, 1829123664);
                var2.method1343(0.0F, 1829123664);
            } else {
                var2.method1338(-1.0F, (byte) -38);
                var2.method1338(-1.0F, (byte) -106);
                var2.method1338(0.0F, (byte) -95);
                var2.method1338(0.0F, (byte) -23);
                var2.method1338(1.0F, (byte) -20);
                var2.method1338(1.0F, (byte) -25);
                var2.method1338(-1.0F, (byte) -54);
                var2.method1338(0.0F, (byte) -82);
                var2.method1338(1.0F, (byte) -103);
                var2.method1338(1.0F, (byte) -16);
                var2.method1338(1.0F, (byte) -61);
                var2.method1338(1.0F, (byte) -81);
                var2.method1338(0.0F, (byte) -45);
                var2.method1338(1.0F, (byte) -89);
                var2.method1338(0.0F, (byte) -35);
                var2.method1338(-1.0F, (byte) -59);
                var2.method1338(1.0F, (byte) -47);
                var2.method1338(0.0F, (byte) -118);
                var2.method1338(0.0F, (byte) -21);
                var2.method1338(0.0F, (byte) -125);
            }
            this.field6778 = this.method2750(var2.field1176, var2.field1223, false, 255, 20);
            this.field6770 = new class139(this, this.field6778, 5126, 3, 0);
            this.field6824 = new class139(this, this.field6778, 5126, 2, 12);
            this.field6682.method1666(this, -82);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIZ)V", line = 1126)
    public final void method2738(int arg0, int arg1, boolean arg2) {
        this.method2792(arg0 ^ arg0, true, arg1, arg2);
        ++field6570;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "()Z", line = 1134)
    public final boolean method834() {
        ++field6606;
        return true;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIIIIII)V", line = 1144)
    public final void method837(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field6602;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIILea;II)V", line = 1153)
    public final void method869(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class113 arg6, int arg7, int arg8) {
        ++field6491;
        class116 var10 = (class116) arg6;
        class386 var11 = var10.field1629;
        this.method2780(12057);
        this.method2771(var10.field1629, -16785);
        this.method2760(arg5, 115);
        this.method2794(7681, 8448, true);
        this.method2781(34167, 0, 2479, 768);
        float var12 = var11.field5069 / (float) var11.field5070;
        float var13 = var11.field5073 / (float) var11.field5071;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (arg1 - arg8) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method2781(5890, 0, 2479, 768);
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(II)V", line = 1188)
    public final void method2739(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method2763((byte) 119);
        }
        ++field6507;
        if (~arg0 != -2) {
            if (arg0 == 0) {
                this.method2794(8448, 8448, true);
            } else if (~arg0 == -3) {
                this.method2794(34165, 7681, true);
            } else {
                if (~arg0 != -4) {
                    if (~arg0 == -5) {
                        this.method2794(34023, 34023, true);
                        return;
                    }
                } else {
                    this.method2794(260, 8448, true);
                }
            }
        } else {
            this.method2794(7681, 7681, true);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lie;B)V", line = 1218)
    public final void method2740(class87 arg0, byte arg1) {
        if (arg1 < -50) {
            ++field6674;
            if (~this.field6700 <= -4) {
                throw new RuntimeException();
            } else {
                if (this.field6700 >= 0) {
                    this.field6702[this.field6700].method552(-25299);
                }
                this.field6701 = this.field6702[++this.field6700] = arg0;
                this.field6701.method549(18500);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "()Z", line = 1240)
    public final boolean method882() {
        ++field6585;
        return true;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(II)I", line = 1250)
    public final int method885(int arg0, int arg1) {
        ++field6642;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "()Lia;", line = 1258)
    public final class142 method916() {
        ++field6613;
        return new class452();
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(FFF)V", line = 1266)
    public final void method857(float arg0, float arg1, float arg2) {
        class359.field4647 = arg0;
        class263.field3331 = arg1;
        ++field6598;
        class163.field2113 = arg2;
    }

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "()Z", line = 1282)
    public final boolean method897() {
        ++field6515;
        return false;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)V", line = 1290)
    public final void method2741(byte arg0, int arg1) {
        ++field6678;
        if (arg0 != -38) {
            this.field6765 = -40;
        }
        if (this.field6767 != arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field6767 = arg1;
        }
    }

    @OriginalMember(owner = "client!gk", name = "M", descriptor = "(I)V", line = 1308)
    public final void method900(int arg0) {
        this.method2760(0, 114);
        ++field6649;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 1320)
    public final void method877(Canvas arg0) {
        ++field6591;
        if (this.field6616 == arg0) {
            throw new RuntimeException();
        } else if (this.field6523.containsKey(arg0)) {
            Long var2 = (Long) this.field6523.get(arg0);
            this.field6573.releaseSurface(arg0, var2);
            this.field6523.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "(II)I", line = 1342)
    public final int method2742(int arg0, int arg1) {
        ++field6577;
        if (~arg1 != -5122 && arg1 != 5120) {
            if (arg0 < 21) {
                return 35;
            } else if (~arg1 != -5124 && arg1 != 5122) {
                if (arg1 != 5125 && ~arg1 != -5125 && ~arg1 != -5127) {
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

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "()V", line = 1369)
    public final void method822() {
        ++field6675;
        this.method2782(-17939, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "(I)V", line = 1381)
    private final void method2743(int arg0) {
        ++field6493;
        if (arg0 != -25) {
            this.method864(101, -94, 120, 26, 17, 106, (byte[]) null, -122, -29);
        }
        if (this.field6787 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field6633 > 0 && ~this.field6677 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field6633, (double) this.field6677, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field6787 = 1;
            this.field6775 &= -25;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILsf;)V", line = 1408)
    public final void method2744(int arg0, class452 arg1) {
        OpenGL.glLoadMatrixf(arg1.method2681((byte) 125), 0);
        if (arg0 != 2) {
            this.method2787(true);
        }
        ++field6617;
    }

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "()Z", line = 1420)
    public final boolean method903() {
        ++field6506;
        return true;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BZ)V", line = 1428)
    public final void method2745(byte arg0, boolean arg1) {
        if (arg0 != -6) {
            this.method828();
        }
        ++field6595;
        if (!arg1 == this.field6733) {
            this.field6733 = arg1;
            this.method2778(false);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(IIII)V", line = 1450)
    public final void method2746(int arg0, int arg1, int arg2, int arg3) {
        ++field6539;
        OpenGL.glDrawArrays(arg1, arg2, arg3);
        if (arg0 != 0) {
            this.field6796 = 77;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lie;I)V", line = 1464)
    public final void method2747(class87 arg0, int arg1) {
        if (arg1 != 3) {
            this.method857(-1.8114927F, 0.03106553F, -0.47769687F);
        }
        ++field6637;
        if (this.field6717) {
            this.method2722(-4, arg0);
            this.method2740(arg0, (byte) -67);
        } else if (this.field6698 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field6698 <= -1) {
                this.field6699[this.field6698].method551(-8279);
            }
            this.field6696 = this.field6701 = this.field6699[++this.field6698] = arg0;
            this.field6696.method550(98);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZF)V", line = 1491)
    public final void method2748(boolean arg0, float arg1) {
        if (this.field6771 != arg1) {
            this.field6771 = arg1;
            if (~this.field6787 == -4) {
                this.method2799(60);
            }
        }
        ++field6628;
        if (arg0) {
            this.field6756 = 32;
        }
    }

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "(I)V", line = 1511)
    public final void method908(int arg0) {
        ++field6569;
        this.method2759(-121);
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(B)V", line = 1519)
    private final void method2749(byte arg0) {
        ++field6632;
        int var2;
        for (var2 = 0; ~var2 > ~this.field6751; ++var2) {
            class182 var4 = this.field6827[var2];
            int var5 = var2 + 16386;
            class185.field2431[0] = (float) var4.method1203((byte) -76);
            class185.field2431[1] = (float) var4.method1199((byte) 3);
            class185.field2431[2] = (float) var4.method1202((byte) -90);
            class185.field2431[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class185.field2431, 0);
            int var6 = var4.method1198((byte) -98);
            float var7 = var4.method1201(6) / 255.0F;
            class185.field2431[2] = (float) class60.method339(255, var6) * var7;
            class185.field2431[0] = var7 * (float) class60.method339(255, var6 >> 16);
            class185.field2431[1] = (float) class60.method339(255, var6 >> 8) * var7;
            OpenGL.glLightfv(var5, 4609, class185.field2431, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var4.method1194(true) * var4.method1194(true)));
            OpenGL.glEnable(var5);
        }
        while (~this.field6774 < ~var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        int var3 = 13 / ((arg0 - -7) / 47);
        this.field6774 = this.field6751;
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "()I", line = 1564)
    public final int method871() {
        ++field6552;
        return this.field6830;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[BZII)Lhh;", line = 1575)
    public final class500 method2750(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        ++field6555;
        if (arg3 != 255) {
            this.field6695 = -17;
        }
        return (class500) (!this.field6757 || arg2 && !this.field6828 ? new class417(this, arg4, arg1, arg0) : new class61(this, arg4, arg1, arg0, arg2));
    }

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "(I)V", line = 1594)
    public final void method2751(int arg0) {
        if (arg0 < 80) {
            this.field6699 = null;
        }
        ++field6660;
        if (~this.field6775 != -5) {
            this.method2743(-25);
            this.method2766(-32, false);
            this.method2797(false, (byte) -22);
            this.method2800(8629, false);
            this.method2782(-17939, false);
            this.method2755(-2, true);
            this.method2760(1, 115);
            this.method2739(0, 0);
            this.field6775 = 4;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lov;[Lne;Z)Loa;", line = 1622)
    public final class167 method867(class278 arg0, class136[] arg1, boolean arg2) {
        ++field6504;
        return new class149(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gk", name = "JA", descriptor = "(II)V", line = 1632)
    public final void method894(int arg0, int arg1) {
        if (~this.field6830 != ~arg0 || this.field6729 != arg1) {
            this.field6729 = arg1;
            this.field6830 = arg0;
            this.method2733(true);
            this.method2768((byte) -77);
            if (~this.field6787 != -4) {
                if (this.field6787 == 2) {
                    this.method2762(5889);
                }
            } else {
                this.method2799(112);
            }
        }
        ++field6534;
    }

    @OriginalMember(owner = "client!gk", name = "fa", descriptor = "(IIII)V", line = 1658)
    public final void method823(int arg0, int arg1, int arg2, int arg3) {
        this.field6728 = arg1;
        this.field6773 = true;
        this.field6758 = arg0;
        this.field6742 = arg2;
        ++field6618;
        this.field6808 = arg3;
        this.field6680.method405(false, false, 3, 28092);
        this.field6680.field866.method1144(34336);
        this.method2768((byte) -77);
        this.method2718(2912);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([BIIZI)Lcm;", line = 1676)
    public final class433 method2752(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field6619;
        if (!this.field6757 || arg3 && !this.field6828) {
            if (arg1 != 1) {
                this.field6696 = null;
            }
            return new class485(this, arg2, arg0, arg4);
        } else {
            return new class351(this, arg2, arg0, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lne;Z)Lf;", line = 1695)
    public final class404 method851(class136 arg0, boolean arg1) {
        ++field6533;
        int[] var3 = new int[arg0.field1837 * arg0.field1832];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1830 != null) {
            for (int var6 = 0; ~arg0.field1832 < ~var6; ++var6) {
                for (int var7 = 0; ~var7 > ~arg0.field1837; ++var7) {
                    var3[var5++] = class31.method213(arg0.field1831[class60.method339(255, arg0.field1833[var4])], arg0.field1830[var4] << 24);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; arg0.field1832 > var8; ++var8) {
                for (int var10 = 0; ~var10 > ~arg0.field1837; ++var10) {
                    int var11 = arg0.field1831[arg0.field1833[var4++] & 255];
                    var3[var5++] = ~var11 != -1 ? class31.method213(-16777216, var11) : 0;
                }
            }
        }
        class404 var9 = this.method921(var3, 0, arg0.field1837, arg0.field1837, arg0.field1832);
        var9.method379(arg0.field1835, arg0.field1834, arg0.field1838, arg0.field1836);
        return var9;
    }

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "()Z", line = 1756)
    public final boolean method898() {
        ++field6673;
        return this.field6680.method407((byte) -119, 3);
    }

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "()Z", line = 1764)
    public final boolean method884() {
        ++field6600;
        return true;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZLjaggl/memory/NativeBuffer;ZI)Lhh;", line = 1776)
    public final class500 method2753(int arg0, boolean arg1, NativeBuffer arg2, boolean arg3, int arg4) {
        if (!arg3) {
            this.method825(true);
        }
        ++field6522;
        return (class500) (!this.field6757 || arg1 && !this.field6828 ? new class417(this, arg0, arg2) : new class61(this, arg0, arg2, arg4, arg1));
    }

    @OriginalMember(owner = "client!gk", name = "ba", descriptor = "(IIII)V", line = 1799)
    public final void method848(int arg0, int arg1, int arg2, int arg3) {
        ++field6636;
        if (!this.field6773) {
            throw new RuntimeException("");
        } else {
            this.field6758 = arg0;
            this.field6728 = arg1;
            this.field6742 = arg2;
            this.field6808 = arg3;
            this.field6680.field866.method1144(34336);
            this.method2768((byte) -77);
        }
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 1818)
    public final void method919(Canvas arg0) {
        ++field6661;
        this.field6508 = null;
        this.field6535 = 0L;
        if (arg0 != null && this.field6616 != arg0) {
            if (this.field6523.containsKey(arg0)) {
                Long var2 = (Long) this.field6523.get(arg0);
                this.field6535 = var2;
                this.field6508 = arg0;
            }
        } else {
            this.field6535 = this.field6525;
            this.field6508 = this.field6616;
        }
        if (this.field6508 != null && ~this.field6535 != -1L) {
            this.field6573.setSurface(this.field6535);
            this.method2730((byte) 102);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "(I)V", line = 1851)
    private final void method2754(int arg0) {
        ++field6668;
        int var2 = 0;
        while (!this.field6573.attach()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            method2773(1000L, -122);
        }
        if (arg0 <= 64) {
            this.method2757((class87) null, -116);
        }
    }

    @OriginalMember(owner = "client!gk", name = "SA", descriptor = "(IIIIII)Z", line = 1874)
    public final boolean method887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6625;
        float var7 = (float) arg2 * this.field6807.field6294 + (float) arg0 * this.field6807.field6301 + (float) arg1 * this.field6807.field6288 + this.field6807.field6286;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field6807.field6294 + (float) arg3 * this.field6807.field6301 + (float) arg4 * this.field6807.field6288 + this.field6807.field6286;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field6830) || !((float) this.field6830 > var8)) && (!(var7 > (float) this.field6729) || !((float) this.field6729 < var8))) {
            int var9 = (int) (((float) arg2 * this.field6807.field6290 + (float) arg0 * this.field6807.field6289 + (float) arg1 * this.field6807.field6306 + this.field6807.field6309) * (float) this.field6740 / var7);
            int var10 = (int) (((float) arg5 * this.field6807.field6290 + (float) arg3 * this.field6807.field6289 + (float) arg4 * this.field6807.field6306 + this.field6807.field6309) * (float) this.field6740 / var8);
            if ((float) var9 < this.field6732 && (float) var10 < this.field6732 || this.field6731 < (float) var9 && this.field6731 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field6807.field6313 + (float) arg0 * this.field6807.field6318 + (float) arg1 * this.field6807.field6316 + this.field6807.field6317) * (float) this.field6765 / var7);
                int var12 = (int) (((float) arg5 * this.field6807.field6313 + (float) arg3 * this.field6807.field6318 + (float) arg4 * this.field6807.field6316 + this.field6807.field6317) * (float) this.field6765 / var8);
                return (!((float) var11 < this.field6784) || !(this.field6784 > (float) var12)) && (!((float) var11 > this.field6744) || !(this.field6744 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZ)V", line = 1913)
    public final void method2755(int arg0, boolean arg1) {
        this.method2738(1, arg0, arg1);
        ++field6624;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II[[I[[IIII)Lna;", line = 1930)
    public final class251 method909(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field6584;
        return new class180(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "()Z", line = 1939)
    public final boolean method890() {
        ++field6565;
        return true;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(III)V", line = 1947)
    public final synchronized void method2756(int arg0, int arg1, int arg2) {
        ++field6648;
        if (arg2 <= 66) {
            this.field6793 = 122;
        }
        class206 var4 = new class206(arg0);
        var4.field7456 = (long) arg1;
        this.field6708.method42(var4, 0);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Lie;I)V", line = 1962)
    public final void method2757(class87 arg0, int arg1) {
        ++field6545;
        if (this.field6695 >= 0 && this.field6697[this.field6695] == arg0) {
            this.field6697[this.field6695--] = null;
            arg0.method553((byte) 63);
            if (arg1 > -49) {
                this.field6679 = null;
            }
            if (this.field6695 < 0) {
                this.field6696 = null;
            } else {
                this.field6696 = this.field6697[this.field6695];
                this.field6696.method548(-112);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "([I)V", line = 1991)
    public final void method846(int[] arg0) {
        arg0[0] = this.field6829;
        arg0[2] = this.field6723;
        ++field6627;
        arg0[3] = this.field6762;
        arg0[1] = this.field6734;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZLhh;)V", line = 2002)
    public final void method2758(boolean arg0, class500 arg1) {
        ++field6484;
        if (this.field6716 != arg1) {
            if (this.field6757) {
                OpenGL.glBindBufferARB(34962, arg1.method350((byte) -42));
            }
            this.field6716 = arg1;
        }
        if (!arg0) {
            this.method2749((byte) 19);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Liv;)V", line = 2021)
    public final void method838(class287 arg0) {
        ++field6547;
        this.field6682.method1673(this, -135, arg0);
    }

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "()Z", line = 2030)
    public final boolean method879() {
        ++field6579;
        return this.field6679 != null && this.field6679.method801(false);
    }

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "(I)V", line = 2039)
    private final void method2759(int arg0) {
        if (arg0 > -57) {
            this.method844();
        }
        this.field6573.detach();
        ++field6631;
    }

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "(II)V", line = 2050)
    public final void method2760(int arg0, int arg1) {
        if (this.field6796 != arg0) {
            boolean var3;
            boolean var4;
            byte var5;
            if (arg0 == 1) {
                var3 = true;
                var4 = true;
                var5 = 1;
            } else if (~arg0 != -3) {
                if (arg0 != 128) {
                    var4 = false;
                    var3 = true;
                    var5 = 0;
                } else {
                    var3 = true;
                    var5 = 3;
                    var4 = true;
                }
            } else {
                var3 = true;
                var4 = false;
                var5 = 2;
            }
            if (this.field6809 != var3) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field6809 = var3;
            }
            if (!var4 != !this.field6763) {
                if (var4) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field6763 = var4;
            }
            if (this.field6795 != var5) {
                if (var5 != 1) {
                    if (var5 != 2) {
                        if (var5 != 3) {
                            OpenGL.glDisable(3042);
                        } else {
                            OpenGL.glEnable(3042);
                            OpenGL.glBlendFunc(774, 1);
                        }
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field6795 = var5;
            }
            this.field6796 = arg0;
            this.field6775 &= -29;
        }
        if (arg1 >= 112) {
            ++field6527;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V", line = 2143)
    public final void method825(boolean arg0) {
        ++field6488;
        this.field6821 = arg0;
        this.method2735(125);
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 2154)
    public final void method895(Canvas arg0) {
        ++field6564;
        if (this.field6616 == arg0) {
            throw new RuntimeException();
        } else if (!this.field6523.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field6573.prepareSurface(arg0);
                if (var4 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field6523.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "da", descriptor = "(IIIII)V", line = 2191)
    public final void method875(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2727((byte) -46);
        ++field6505;
        this.method2760(arg4, 125);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "(I)V", line = 2211)
    public final void method2761(int arg0) {
        ++field6646;
        OpenGL.glPushMatrix();
        if (arg0 != -14590) {
            this.method830(-116, -38, 34, 103, 119, 7, -39);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lvh;)V", line = 2225)
    public final void method862(class191 arg0) {
        ++field6494;
        this.field6797 = (class486) arg0;
    }

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "(I)V", line = 2233)
    private final void method2762(int arg0) {
        OpenGL.glMatrixMode(arg0);
        ++field6495;
        OpenGL.glLoadMatrixf(this.field6794, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(B)V", line = 2243)
    private final void method2763(byte arg0) {
        if (arg0 != -26) {
            this.field6789 = null;
        }
        OpenGL.glLoadIdentity();
        ++field6644;
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field6807.method2681((byte) 105), 0);
        if (this.field6773) {
            this.field6680.field866.method1144(34336);
        }
        this.method2728(-118);
        this.method2749((byte) -108);
    }

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "()Z", line = 2263)
    public final boolean method886() {
        ++field6586;
        return this.field6769 && (!this.method879() || this.field6785);
    }

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "(B)V", line = 2271)
    private final void method2764(byte arg0) {
        ++field6498;
        int var2 = -8 / ((arg0 - 20) / 52);
        this.method2755(-2, true);
        for (int var3 = this.field6779 + -1; ~var3 <= -1; --var3) {
            this.method2741((byte) -38, var3);
            this.method2771((class31) null, -16785);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2794(8448, 8448, true);
        this.method2781(34168, 2, 2479, 770);
        this.method2721(32);
        this.field6796 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field6795 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field6763 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field6809 = true;
        this.method2766(-32, true);
        this.method2797(true, (byte) -22);
        this.method2800(8629, true);
        this.method2782(-17939, true);
        this.method2776((byte) -99);
        this.field6573.setSwapInterval(0);
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
        for (int var5 = 0; ~var5 > -9; ++var5) {
            int var6 = 16384 - -var5;
            OpenGL.glLightfv(var6, 4608, var4, 0);
            OpenGL.glLightf(var6, 4615, 0.0F);
            OpenGL.glLightf(var6, 4616, 0.0F);
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field6753 = this.field6720 = -1;
        this.method865();
    }

    @OriginalMember(owner = "client!gk", name = "na", descriptor = "(I)V", line = 2342)
    public final void method922(int arg0) {
        this.field6689 = 0;
        ++field6663;
        while (~arg0 < -2) {
            ++this.field6689;
            arg0 >>= 1;
        }
        this.field6693 = 1 << this.field6689;
    }

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "()Z", line = 2357)
    public final boolean method924() {
        ++field6544;
        if (this.field6679 != null) {
            if (!this.field6679.method801(false)) {
                if (!this.field6685.method131(this.field6679, 0)) {
                    return false;
                }
                this.field6683.method1073((byte) -106);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(III)V", line = 2383)
    public final synchronized void method2765(int arg0, int arg1, int arg2) {
        ++field6582;
        class206 var4 = new class206(arg1);
        var4.field7456 = (long) arg2;
        this.field6710.method42(var4, arg0);
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "()V", line = 2394)
    public final void method836() {
        ++field6574;
        if (this.field6813 && ~this.field6633 < -1 && ~this.field6677 < -1) {
            int var1 = this.field6829;
            int var2 = this.field6723;
            int var3 = this.field6734;
            int var4 = this.field6762;
            this.method865();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2776((byte) -99);
            this.method2766(-32, false);
            this.method2797(false, (byte) -22);
            this.method2800(8629, false);
            this.method2782(-17939, false);
            this.method2771((class31) null, -16785);
            this.method2755(-2, true);
            this.method2739(1, 0);
            this.method2760(0, 127);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field6633, this.field6677, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method925(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(IZ)V", line = 2441)
    public final void method2766(int arg0, boolean arg1) {
        if (arg0 != -32) {
            this.field6693 = -109;
        }
        if (this.field6745 != arg1) {
            this.field6745 = arg1;
            this.method2718(2912);
            this.field6775 &= -32;
        }
        ++field6558;
    }

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "(II)I", line = 2460)
    public final int method2767(int arg0, int arg1) {
        ++field6548;
        if (arg1 != 7681) {
            this.field6814 = true;
        }
        if (arg0 == 1) {
            return 7681;
        } else if (~arg0 == -1) {
            return 8448;
        } else if (~arg0 == -3) {
            return 34165;
        } else if (arg0 == 3) {
            return 260;
        } else if (~arg0 == -5) {
            return 34023;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "()V", line = 2490)
    public final void method892() {
        ++field6634;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lc;Liv;Lia;Laq;I)V", line = 2498)
    public final void method824(class507 arg0, class287 arg1, class142 arg2, class530 arg3, int arg4) {
        ++field6531;
        arg0.method520(arg2, arg3, arg4);
        this.method838(arg1);
    }

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "()V", line = 2507)
    public final void method856() {
        ++field6549;
        try {
            this.field6573.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!gk", name = "GA", descriptor = "(IIII)V", line = 2528)
    public final void method821(int arg0, int arg1, int arg2, int arg3) {
        this.field6756 = arg0;
        ++field6650;
        this.field6768 = arg1;
        this.field6740 = arg2;
        this.field6765 = arg3;
        this.method2733(true);
        this.method2717((byte) -60);
        if (this.field6787 == 3) {
            this.method2799(22);
        } else if (~this.field6787 == -3) {
            this.method2762(5889);
        }
    }

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "()I", line = 2550)
    public final int method872() {
        ++field6670;
        int var1 = this.field6815;
        this.field6815 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "(B)V", line = 2563)
    private final void method2768(byte arg0) {
        ++field6596;
        int var2;
        if (!this.field6773) {
            this.field6735 = (float) (this.field6729 - this.field6724) - this.field6777;
            this.field6826 = this.field6735 - (float) this.field6810 * this.field6722;
            if ((float) this.field6830 > this.field6826) {
                this.field6826 = (float) this.field6830;
            }
            OpenGL.glFogf(2915, this.field6826);
            OpenGL.glFogf(2916, this.field6735);
            var2 = this.field6720;
        } else {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field6728;
        }
        class4.field31[1] = (float) class60.method339(65280, var2) / 65280.0F;
        class4.field31[2] = (float) class60.method339(var2, 255) / 255.0F;
        class4.field31[0] = (float) class60.method339(var2, 16711680) / 1.671168E7F;
        OpenGL.glFogfv(2918, class4.field31, 0);
        if (this.field6773) {
            this.field6680.field866.method1149((byte) 0);
        }
        if (arg0 != -77) {
            this.method2737(-56, -35);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILcm;III)V", line = 2604)
    public final void method2769(int arg0, class433 arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            this.method2756(111, 91, 13);
        }
        ++field6556;
        int var6 = arg1.method2067(-14964);
        int var7 = arg0 * this.method2742(50, var6);
        this.method2725(arg1, (byte) -121);
        OpenGL.glDrawElements(arg2, arg4, var6, (long) var7 + arg1.method2066(-120));
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lie;Z)V", line = 2622)
    public final void method2770(class87 arg0, boolean arg1) {
        ++field6514;
        if (!arg1) {
            if (!this.field6717) {
                if (this.field6698 >= 0 && this.field6699[this.field6698] == arg0) {
                    this.field6699[this.field6698--] = null;
                    arg0.method551(-8279);
                    if (~this.field6698 > -1) {
                        this.field6696 = this.field6701 = null;
                    } else {
                        this.field6696 = this.field6701 = this.field6699[this.field6698];
                        this.field6696.method550(98);
                    }
                } else {
                    throw new RuntimeException();
                }
            } else {
                this.method2757(arg0, -92);
                this.method2724((byte) -1, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lrh;I)V", line = 2661)
    public final void method2771(class31 arg0, int arg1) {
        ++field6638;
        if (arg1 != -16785) {
            this.method2797(false, (byte) -9);
        }
        class31 var3 = this.field6727[this.field6767];
        if (arg0 != var3) {
            if (arg0 != null) {
                if (var3 != null) {
                    if (~arg0.field521 != ~var3.field521) {
                        OpenGL.glDisable(var3.field521);
                        OpenGL.glEnable(arg0.field521);
                    }
                } else {
                    OpenGL.glEnable(arg0.field521);
                }
                OpenGL.glBindTexture(arg0.field521, arg0.method214(14532));
            } else {
                OpenGL.glDisable(var3.field521);
            }
            this.field6727[this.field6767] = arg0;
        }
        this.field6775 &= -2;
    }

    @OriginalMember(owner = "client!gk", name = "ua", descriptor = "(F)V", line = 2700)
    public final void method901(float arg0) {
        if (this.field6791 != arg0) {
            this.field6791 = arg0;
            this.method2736(1);
        }
        ++field6537;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(CB)Z", line = 2719)
    public static final boolean method2772(char arg0, byte arg1) {
        if (arg1 != 52) {
            method2773(-40L, -87);
        }
        ++field6609;
        if ((arg0 <= 0 || arg0 >= 128) && (~arg0 > -161 || arg0 > 255)) {
            if (~arg0 != -1) {
                char[] var2 = class168.field2194;
                for (int var3 = 0; var3 < var2.length; ++var3) {
                    char var4 = var2[var3];
                    if (arg0 == var4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(JI)V", line = 2755)
    public static final void method2773(long arg0, int arg1) {
        int var3 = 8 / ((arg1 - -64) / 40);
        ++field6629;
        if (arg0 > 0L) {
            if (arg0 % 10L != 0L) {
                class5.method28(1024, arg0);
            } else {
                class5.method28(1024, arg0 + -1L);
                class5.method28(1024, 1L);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "XA", descriptor = "(IFFFFF)V", line = 2776)
    public final void method840(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field6588;
        boolean var7 = this.field6753 != arg0;
        if (var7 || this.field6766 != arg1 || this.field6725 != arg2) {
            this.field6725 = arg2;
            this.field6766 = arg1;
            this.field6753 = arg0;
            if (var7) {
                this.field6754 = (float) (255 & this.field6753) / 255.0F;
                this.field6818 = (float) (65280 & this.field6753) / 65280.0F;
                this.field6781 = (float) (16711680 & this.field6753) / 1.671168E7F;
                this.method2736(1);
            }
            this.method2719(3679);
        }
        if (this.field6780[0] != arg3 || this.field6780[1] != arg4 || this.field6780[2] != arg5) {
            this.field6780[2] = arg5;
            this.field6780[1] = arg4;
            this.field6780[0] = arg3;
            this.field6799[0] = -arg3;
            this.field6799[2] = -arg5;
            this.field6799[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field6750[1] = arg4 * var8;
            this.field6750[0] = arg3 * var8;
            this.field6750[2] = arg5 * var8;
            this.field6803[1] = -this.field6750[1];
            this.field6803[2] = -this.field6750[2];
            this.field6803[0] = -this.field6750[0];
            this.method2728(-124);
            this.field6798 = (int) (arg3 * 256.0F / arg4);
            this.field6811 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "(I)V", line = 2826)
    public static void method2774(int arg0) {
        field6487 = null;
        if (arg0 != 3) {
            field6653 = null;
        }
        field6653 = null;
        field6568 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)V", line = 2838)
    public final void method833(int arg0, int arg1, int arg2, int arg3) {
        ++field6518;
        this.field6685.method127(arg0, arg1, arg2, 1, arg3);
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(IIIIII)V", line = 2848)
    public final void method918(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6641;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method2727((byte) -46);
        this.method2760(arg5, 115);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field6769) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field6769) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(IIII)V", line = 2881)
    public final void method2775(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg2 + 34184, arg1);
        ++field6626;
        int var5 = 93 % ((arg3 - 26) / 45);
        OpenGL.glTexEnvi(8960, 34200 - -arg2, arg0);
    }

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "(B)V", line = 2892)
    public final void method2776(byte arg0) {
        if (this.field6787 != 0) {
            this.field6775 &= -32;
            this.field6787 = 0;
        }
        if (arg0 == -99) {
            ++field6587;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIII)V", line = 2913)
    public final void method830(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field6671;
        this.method891(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(FFFB)V", line = 2926)
    private final void method2777(float arg0, float arg1, float arg2, byte arg3) {
        OpenGL.glMatrixMode(5890);
        if (arg3 == 65) {
            ++field6599;
            if (this.field6736) {
                OpenGL.glLoadIdentity();
            }
            OpenGL.glTranslatef(arg2, arg1, arg0);
            OpenGL.glMatrixMode(5888);
            this.field6736 = true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "W", descriptor = "()I", line = 2944)
    public final int method876() {
        ++field6623;
        return this.field6729;
    }

    @OriginalMember(owner = "client!gk", name = "va", descriptor = "()V", line = 2952)
    public final void method865() {
        ++field6553;
        this.field6723 = this.field6633;
        this.field6762 = this.field6677;
        this.field6734 = 0;
        this.field6829 = 0;
        OpenGL.glDisable(3089);
        this.method2717((byte) -122);
    }

    @OriginalMember(owner = "client!gk", name = "S", descriptor = "()V", line = 2968)
    public final void method831() {
        this.field6773 = false;
        ++field6651;
        this.field6680.method405(false, false, 0, 28092);
        this.method2768((byte) -77);
        this.method2718(2912);
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(Z)V", line = 2982)
    private final void method2778(boolean arg0) {
        if (this.field6820 && !this.field6733) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field6583;
        if (arg0) {
            this.field6770 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "FA", descriptor = "()I", line = 2997)
    public final int method917() {
        ++field6536;
        return this.field6704 + this.field6703 + this.field6705;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 3005)
    public final void method817(Rectangle[] arg0, int arg1) {
        this.method856();
        ++field6580;
    }

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "(B)V", line = 3013)
    private final void method2779(byte arg0) {
        ++field6519;
        if (arg0 == -75) {
            if (~this.field6829 >= ~this.field6723 && ~this.field6762 <= ~this.field6734) {
                OpenGL.glScissor(this.field6829 + this.field6783, this.field6823 - (-this.field6677 + this.field6762), -this.field6829 + this.field6723, this.field6762 - this.field6734);
            } else {
                OpenGL.glScissor(0, 0, 0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([Lc;Liv;Lia;[Laq;I)V", line = 3029)
    public final void method868(class507[] arg0, class287 arg1, class142 arg2, class530[] arg3, int arg4) {
        ++field6655;
        this.method873(arg0, arg2, arg3, arg4);
        this.method838(arg1);
    }

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "(I)V", line = 3038)
    public final void method2780(int arg0) {
        if (this.field6775 != 2) {
            this.method2743(-25);
            this.method2766(-32, false);
            this.method2797(false, (byte) -22);
            this.method2800(8629, false);
            this.method2782(-17939, false);
            this.method2755(-2, true);
            this.field6775 = 2;
        }
        ++field6532;
        if (arg0 != 12057) {
            this.method824((class507) null, (class287) null, (class142) null, (class530) null, 62);
        }
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(IIII)V", line = 3062)
    public final void method2781(int arg0, int arg1, int arg2, int arg3) {
        ++field6575;
        if (arg2 != 2479) {
            this.field6701 = null;
        }
        OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
        OpenGL.glTexEnvi(8960, arg1 + 34192, arg3);
    }

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "(ILea;II)V", line = 3074)
    public final void method912(int arg0, class113 arg1, int arg2, int arg3) {
        ++field6656;
        class116 var5 = (class116) arg1;
        class386 var6 = var5.field1629;
        this.method2780(12057);
        this.method2771(var5.field1629, -16785);
        this.method2760(1, 123);
        this.method2794(7681, 8448, true);
        this.method2781(34167, 0, 2479, 768);
        float var7 = var6.field5069 / (float) var6.field5070;
        float var8 = var6.field5073 / (float) var6.field5071;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field6829) * var7, (float) (-arg3 + this.field6734) * var8);
        OpenGL.glVertex2i(this.field6829, this.field6734);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field6829) * var7, (float) (this.field6762 - arg3) * var8);
        OpenGL.glVertex2i(this.field6829, this.field6762);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field6723) * var7, (float) (-arg3 + this.field6762) * var8);
        OpenGL.glVertex2i(this.field6723, this.field6762);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field6723) * var7, (float) (-arg3 + this.field6734) * var8);
        OpenGL.glVertex2i(this.field6723, this.field6734);
        OpenGL.glEnd();
        this.method2781(5890, 0, 2479, 768);
    }

    @OriginalMember(owner = "client!gk", name = "V", descriptor = "(III)V", line = 3108)
    public final void method842(int arg0, int arg1, int arg2) {
        ++field6615;
        if (this.field6720 != arg0 || ~this.field6810 != ~arg1 || ~this.field6724 != ~arg2) {
            this.field6810 = arg1;
            this.field6720 = arg0;
            this.field6724 = arg2;
            if (this.field6773) {
                return;
            }
            this.method2768((byte) -77);
            this.method2718(2912);
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(IZ)V", line = 3132)
    public final void method2782(int arg0, boolean arg1) {
        ++field6640;
        if (arg0 != -17939) {
            this.field6690 = -25;
        }
        if (this.field6814 != arg1) {
            this.field6814 = arg1;
            this.method2735(arg0 + 18062);
            this.field6775 &= -32;
        }
    }

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "(II)Ldw;", line = 3151)
    public static final class96 method2783(int arg0, int arg1) {
        ++field6542;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    if (arg0 != 7) {
                                        if (arg0 != 8) {
                                            if (~arg0 != -10) {
                                                if (arg0 != 10) {
                                                    if (~arg0 != -12) {
                                                        if (arg0 != 12) {
                                                            if (~arg0 != -14) {
                                                                if (arg0 != 14) {
                                                                    if (arg0 != 15) {
                                                                        if (arg0 != 16) {
                                                                            if (arg0 != 17) {
                                                                                if (~arg0 != -19) {
                                                                                    if (~arg0 != -20) {
                                                                                        if (arg0 != 20) {
                                                                                            if (arg0 != 21) {
                                                                                                if (~arg0 != -23) {
                                                                                                    if (~arg0 != -24) {
                                                                                                        if (arg0 != 24) {
                                                                                                            if (arg0 != 25) {
                                                                                                                if (arg0 != 26) {
                                                                                                                    if (~arg0 != -28) {
                                                                                                                        if (arg0 != 28) {
                                                                                                                            if (~arg0 != -30) {
                                                                                                                                if (~arg0 != -31) {
                                                                                                                                    if (arg0 != 31) {
                                                                                                                                        if (arg0 != 32) {
                                                                                                                                            if (arg0 != 33) {
                                                                                                                                                if (~arg0 != -35) {
                                                                                                                                                    if (~arg0 != -36) {
                                                                                                                                                        if (arg0 != 36) {
                                                                                                                                                            if (arg0 != 37) {
                                                                                                                                                                if (~arg0 != -39) {
                                                                                                                                                                    if (~arg0 == -40) {
                                                                                                                                                                        return new class294();
                                                                                                                                                                    } else {
                                                                                                                                                                        if (arg1 != 18376) {
                                                                                                                                                                            field6568 = null;
                                                                                                                                                                        }
                                                                                                                                                                        return null;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    return new class276();
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return new class290();
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return new class257();
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return new class222();
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return new class121();
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return new class456();
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return new class297();
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return new class450();
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return new class264();
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return new class89();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return new class168();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return new class379();
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return new class130();
                                                                                                                }
                                                                                                            } else {
                                                                                                                return new class158();
                                                                                                            }
                                                                                                        } else {
                                                                                                            return new class284();
                                                                                                        }
                                                                                                    } else {
                                                                                                        return new class148();
                                                                                                    }
                                                                                                } else {
                                                                                                    return new class281();
                                                                                                }
                                                                                            } else {
                                                                                                return new class6();
                                                                                            }
                                                                                        } else {
                                                                                            return new class74();
                                                                                        }
                                                                                    } else {
                                                                                        return new class131();
                                                                                    }
                                                                                } else {
                                                                                    return new class418();
                                                                                }
                                                                            } else {
                                                                                return new class269();
                                                                            }
                                                                        } else {
                                                                            return new class439();
                                                                        }
                                                                    } else {
                                                                        return new class93();
                                                                    }
                                                                } else {
                                                                    return new class267();
                                                                }
                                                            } else {
                                                                return new class467();
                                                            }
                                                        } else {
                                                            return new class289();
                                                        }
                                                    } else {
                                                        return new class282();
                                                    }
                                                } else {
                                                    return new class69();
                                                }
                                            } else {
                                                return new class283();
                                            }
                                        } else {
                                            return new class421();
                                        }
                                    } else {
                                        return new class422();
                                    }
                                } else {
                                    return new class302();
                                }
                            } else {
                                return new class53();
                            }
                        } else {
                            return new class370();
                        }
                    } else {
                        return new class470();
                    }
                } else {
                    return new class484();
                }
            } else {
                return new class522();
            }
        } else {
            return new class443();
        }
    }

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "(II)I", line = 3474)
    public final int method2784(int arg0, int arg1) {
        if (arg0 >= -96) {
            this.method2789(-27, -54L);
        }
        ++field6594;
        if (arg1 != 6406 && arg1 != 6409) {
            if (~arg1 != -6411 && arg1 != 34846 && ~arg1 != -34845) {
                if (arg1 != 6407) {
                    if (~arg1 != -6409 && ~arg1 != -34848) {
                        if (arg1 == 34843) {
                            return 6;
                        } else if (~arg1 != -34843) {
                            if (~arg1 != -6403) {
                                if (~arg1 == -6402) {
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
                    return 3;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "(I)V", line = 3519)
    private final void method2785(int arg0) {
        ++field6614;
        if (arg0 != 0) {
            this.field6708 = null;
        }
        OpenGL.glViewport(this.field6783, this.field6823, this.field6633, this.field6677);
    }

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "()Z", line = 3536)
    public final boolean method854() {
        ++field6503;
        return this.field6679 != null && (~this.field6684 >= -2 || this.field6785);
    }

    @OriginalMember(owner = "client!gk", name = "pa", descriptor = "(IIII)V", line = 3545)
    public final void method925(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > this.field6633) {
            arg2 = this.field6633;
        }
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (~arg1 > -1) {
            arg1 = 0;
        }
        if (this.field6677 < arg3) {
            arg3 = this.field6677;
        }
        ++field6543;
        this.field6762 = arg3;
        this.field6829 = arg0;
        this.field6723 = arg2;
        this.field6734 = arg1;
        OpenGL.glEnable(3089);
        this.method2717((byte) -91);
        this.method2779((byte) -75);
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(IIIIII)V", line = 3575)
    public final void method891(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2727((byte) -46);
        ++field6550;
        this.method2760(arg5, 122);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "(I)Llm;", line = 3594)
    public final class244 method2786(int arg0) {
        ++field6510;
        if (arg0 <= 103) {
            return null;
        } else {
            return this.field6797 == null ? null : this.field6797.method762(27901);
        }
    }

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "(Z)I", line = 3607)
    private final int method2787(boolean arg0) {
        ++field6658;
        this.field6714 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field6819 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field6714.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field6714.indexOf("brian paul") != -1 || ~this.field6714.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class332.method1978((byte) -107, ' ', var3.replace('.', ' '));
        if (~var4.length <= -3) {
            try {
                int var5 = class109.method716(var4[0], 10);
                int var6 = class109.method716(var4[1], 10);
                this.field6749 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (this.field6749 < 12) {
            var2 |= 2;
        }
        if (!this.field6573.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field6573.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field6779 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field6831 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        if (!arg0) {
            this.field6700 = -78;
        }
        this.field6832 = var7[0];
        if (this.field6779 < 2 || this.field6831 < 2 || this.field6832 < 2) {
            var2 |= 16;
        }
        this.field6759 = NativeStream.method2848();
        this.field6573.arePbuffersAvailable();
        this.field6757 = this.field6573.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field6769 = this.field6573.isExtensionAvailable("GL_ARB_multisample");
        this.field6772 = this.field6573.isExtensionAvailable("GL_ARB_vertex_program");
        this.field6573.isExtensionAvailable("GL_ARB_fragment_program");
        this.field6726 = this.field6573.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field6718 = this.field6573.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field6752 = this.field6573.isExtensionAvailable("GL_EXT_texture3D");
        this.field6833 = this.field6573.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field6802 = this.field6573.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field6805 = this.field6573.isExtensionAvailable("GL_ARB_texture_float");
        this.field6817 = false;
        this.field6719 = this.field6573.isExtensionAvailable("GL_EXT_framebuffer_object");
        this.field6717 = this.field6573.isExtensionAvailable("GL_EXT_framebuffer_blit");
        this.field6825 = this.field6573.isExtensionAvailable("GL_EXT_framebuffer_multisample");
        this.field6785 = this.field6717 & this.field6825;
        return ~var2 == -1 ? 0 : var2;
    }

    @OriginalMember(owner = "client!gk", name = "IA", descriptor = "(IIII)[I", line = 3691)
    public final int[] method835(int arg0, int arg1, int arg2, int arg3) {
        ++field6610;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, this.field6677 - var6 + -arg1, arg2, 1, 32993, this.field6793, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([IIIII)Lf;", line = 3712)
    public final class404 method921(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6486;
        return new class233(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V", line = 3720)
    public final void method845(boolean arg0) {
        ++field6492;
    }

    @OriginalMember(owner = "client!gk", name = "O", descriptor = "(IIIII)V", line = 3729)
    public final void method883(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6546;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "(I)V", line = 3739)
    public final void method914(int arg0) {
        ++field6603;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIII)Lvh;", line = 3749)
    public final class191 method859(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6485;
        return this.field6802 ? new class523(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "()Z", line = 3757)
    public final boolean method915() {
        ++field6652;
        return true;
    }

    @OriginalMember(owner = "client!gk", name = "xa", descriptor = "()I", line = 3765)
    public final int method889() {
        ++field6501;
        int var1 = this.field6782;
        this.field6782 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(I)V", line = 3778)
    public final void method874(int arg0) {
        ++field6563;
        this.method2754(98);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V", line = 3786)
    public final void method820(int arg0) {
        ++field6635;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field6681 = arg0;
            this.field6683.method1073((byte) 33);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ltp;Ltp;Ltp;BLtp;)V", line = 3798)
    public final void method2788(class139 arg0, class139 arg1, class139 arg2, byte arg3, class139 arg4) {
        ++field6667;
        if (arg1 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method2758(true, arg1.field1851);
            OpenGL.glVertexPointer(arg1.field1850, arg1.field1852, this.field6716.method344(-18156), this.field6716.method349(77) - -((long) arg1.field1854));
            OpenGL.glEnableClientState(32884);
        }
        if (arg0 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method2758(true, arg0.field1851);
            OpenGL.glNormalPointer(arg0.field1852, this.field6716.method344(-18156), this.field6716.method349(40) - -((long) arg0.field1854));
            OpenGL.glEnableClientState(32885);
        }
        if (arg2 != null) {
            this.method2758(true, arg2.field1851);
            OpenGL.glColorPointer(arg2.field1850, arg2.field1852, this.field6716.method344(-18156), this.field6716.method349(122) - -((long) arg2.field1854));
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg3 != -35) {
            this.method891(28, -65, 93, -14, -46, -58);
        }
        if (arg4 != null) {
            this.method2758(true, arg4.field1851);
            OpenGL.glTexCoordPointer(arg4.field1850, arg4.field1852, this.field6716.method344(-18156), this.field6716.method349(arg3 ^ -80) - -((long) arg4.field1854));
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IJ)V", line = 3847)
    public final synchronized void method2789(int arg0, long arg1) {
        ++field6559;
        class508 var4 = new class508();
        var4.field7456 = arg1;
        this.field6712.method42(var4, arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "(I)V", line = 3858)
    private final void method2790(int arg0) {
        ++field6500;
        if (this.field6743 != 0.0F) {
            float var2 = this.field6816 / (this.field6816 + this.field6743);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field6748 * (-var2 + 1.0F) / this.field6743;
            this.field6794[10] = this.field6760 + var4;
            this.field6794[14] = this.field6748 * var3;
        } else {
            this.field6794[10] = this.field6760;
            this.field6794[14] = this.field6748;
        }
        this.field6776 = (this.field6794[14] + (float) (-this.field6729)) / this.field6794[10];
        if (arg0 != 4533) {
            this.method820(-4);
        }
        this.field6741 = (float) this.field6729 + -this.field6743;
    }

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "(I)V", line = 3894)
    private final void method2791(int arg0) {
        if (arg0 != 0) {
            field6487 = null;
        }
        ++field6567;
        if (~this.field6787 != -4) {
            this.field6787 = 3;
            this.method2799(74);
            this.method2763((byte) -26);
            this.field6775 &= -8;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZIZ)V", line = 3913)
    public final void method2792(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (arg0 != 0) {
            this.method2762(32);
        }
        if (~this.field6801 != ~arg2) {
            if (~arg2 > -1) {
                this.method2721(arg0 ^ -98);
                this.method2771((class31) null, arg0 ^ -16785);
                this.method2739(0, 0);
                if (!this.field6773) {
                    this.field6680.method405(arg1, arg3, 0, 28092);
                }
            } else {
                class346 var5 = this.field6683.method1075((byte) 26, arg2);
                class499 var6 = super.field1765.method460(arg0 ^ -26282, arg2);
                if (~var6.field7329 == -1 && ~var6.field7340 == -1) {
                    this.method2721(-96);
                } else {
                    int var7 = var6.field7331 ? 64 : 128;
                    int var8 = var7 * 50;
                    this.method2777(0.0F, (float) (this.field6690 % var8 * var6.field7340) / (float) var8, (float) (this.field6690 % var8 * var6.field7329) / (float) var8, (byte) 65);
                }
                if (this.field6773) {
                    this.field6680.method405(arg1, arg3, 3, 28092);
                    this.method2771(var5, -16785);
                    this.method2739(var6.field7341, 0);
                } else {
                    this.field6680.method405(arg1, arg3, var6.field7352, 28092);
                    this.field6680.method402(var6.field7333, (byte) 64, var6.field7351);
                    if (!this.field6680.method403(var5, (byte) 100, var6.field7341)) {
                        this.method2771(var5, -16785);
                        this.method2739(var6.field7341, arg0);
                    }
                }
            }
            this.field6801 = arg2;
        }
        ++field6489;
        this.field6775 &= -8;
    }

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "(B)V", line = 3978)
    public final void method2793(byte arg0) {
        ++field6630;
        if (this.field6775 != 8) {
            this.method2732(false);
            this.method2766(-32, true);
            this.method2800(8629, true);
            this.method2782(-17939, true);
            this.method2760(1, 117);
            this.method2739(0, 0);
            this.field6775 = 8;
        }
        if (arg0 < 21) {
            this.field6741 = 1.2759361F;
        }
    }

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "()Z", line = 4003)
    public final boolean method850() {
        ++field6530;
        return true;
    }

    @OriginalMember(owner = "client!gk", name = "aa", descriptor = "(IIIIII[BII)V", line = 4012)
    public final void method864(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field6622;
        float var10;
        float var11;
        if (this.field6755 != null && this.field6755.field4409 >= arg2 && ~arg3 >= ~this.field6755.field4416) {
            this.field6755.method2037(arg3, arg2, 6406, 0, arg6, false, 0, 0, 0, 0);
            var10 = (float) arg2 * this.field6755.field5069 / (float) this.field6755.field4409;
            var11 = (float) arg3 * this.field6755.field5073 / (float) this.field6755.field4416;
        } else {
            this.field6755 = class235.method1497(arg6, false, arg3, 6406, 6406, this, 1, arg2);
            this.field6755.method2040(false, (byte) 89, false);
            var11 = this.field6755.field5073;
            var10 = this.field6755.field5069;
        }
        this.method2780(12057);
        this.method2771(this.field6755, -16785);
        this.method2760(arg8, 113);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2720(20, arg5);
        this.method2794(34165, 34165, true);
        this.method2781(34166, 0, 2479, 768);
        this.method2781(5890, 2, 2479, 770);
        this.method2775(770, 34166, 0, 124);
        this.method2775(770, 5890, 2, -51);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        OpenGL.glBegin(7);
        float var15 = (float) arg3 + var13;
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var10);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var11, var10);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var11, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method2781(5890, 0, 2479, 768);
        this.method2781(34166, 2, 2479, 770);
        this.method2775(770, 5890, 0, -38);
        this.method2775(770, 34166, 2, -102);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(IIZ)V", line = 4071)
    public final void method2794(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            if (~this.field6767 == -1) {
                boolean var4 = false;
                if (~this.field6790 != ~arg0) {
                    OpenGL.glTexEnvi(8960, 34161, arg0);
                    this.field6790 = arg0;
                    var4 = true;
                }
                if (~this.field6804 != ~arg1) {
                    OpenGL.glTexEnvi(8960, 34162, arg1);
                    var4 = true;
                    this.field6804 = arg1;
                }
                if (var4) {
                    this.field6775 &= -30;
                }
            } else {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                OpenGL.glTexEnvi(8960, 34162, arg1);
            }
            ++field6672;
        }
    }

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "(I)V", line = 4115)
    public final void method2795(int arg0) {
        OpenGL.glPopMatrix();
        ++field6528;
        if (arg0 != -4995) {
            this.field6697 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLsf;)V", line = 4128)
    public final void method2796(byte arg0, class452 arg1) {
        if (arg0 != -102) {
            this.method2765(10, 66, 32);
        }
        OpenGL.glPushMatrix();
        ++field6497;
        OpenGL.glMultMatrixf(arg1.method2681((byte) 125), 0);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZB)V", line = 4140)
    public final void method2797(boolean arg0, byte arg1) {
        if (this.field6820 == !arg0) {
            this.field6820 = arg0;
            this.method2778(false);
            this.field6775 &= -8;
        }
        ++field6502;
        if (arg1 != -22) {
            this.method875(-28, -126, 71, -3, 95);
        }
    }

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "(II)V", line = 4157)
    public final synchronized void method2798(int arg0, int arg1) {
        ++field6561;
        class508 var3 = new class508();
        var3.field7456 = (long) arg1;
        this.field6711.method42(var3, arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II[I[I)Lea;", line = 4170)
    public final class113 method896(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field6607;
        return class436.method2566(arg1, this, arg0, arg3, (byte) 124, arg2);
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(I)Ll;", line = 4182)
    public final class125 method849(int arg0) {
        ++field6540;
        class520 var2 = new class520(arg0);
        this.field6692.method42(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "()Lia;", line = 4194)
    public final class142 method847() {
        ++field6654;
        return this.field6686;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 4207)
    public final synchronized void method818(int arg0) {
        ++field6554;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field6707.method38((byte) 63)) {
            class206 var12 = (class206) this.field6707.method52((byte) -109);
            class202.field2650[var3++] = (int) var12.field7456;
            this.field6703 -= var12.field2681;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class202.field2650, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class202.field2650, 0);
            var3 = 0;
        }
        while (!this.field6708.method38((byte) 63)) {
            class206 var11 = (class206) this.field6708.method52((byte) -114);
            class202.field2650[var3++] = (int) var11.field7456;
            this.field6704 -= var11.field2681;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class202.field2650, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class202.field2650, 0);
            var3 = 0;
        }
        while (!this.field6709.method38((byte) 63)) {
            class206 var10 = (class206) this.field6709.method52((byte) -114);
            class202.field2650[var3++] = var10.field2681;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class202.field2650, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class202.field2650, 0);
            var3 = 0;
        }
        while (!this.field6710.method38((byte) 63)) {
            class206 var9 = (class206) this.field6710.method52((byte) -114);
            class202.field2650[var3++] = (int) var9.field7456;
            this.field6705 -= var9.field2681;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class202.field2650, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class202.field2650, 0);
            boolean var4 = false;
        }
        while (!this.field6706.method38((byte) 63)) {
            class206 var8 = (class206) this.field6706.method52((byte) -97);
            OpenGL.glDeleteLists((int) var8.field7456, var8.field2681);
        }
        while (!this.field6711.method38((byte) 63)) {
            class508 var7 = this.field6711.method52((byte) -120);
            OpenGL.glDeleteProgramARB((int) var7.field7456);
        }
        while (!this.field6712.method38((byte) 63)) {
            class508 var6 = this.field6712.method52((byte) -102);
            OpenGL.glDeleteObjectARB(var6.field7456);
        }
        while (!this.field6706.method38((byte) 63)) {
            class206 var5 = (class206) this.field6706.method52((byte) -101);
            OpenGL.glDeleteLists((int) var5.field7456, var5.field2681);
        }
        this.field6683.method1076(70);
        if (~this.method917() < -100663297 && ~class173.method1134(true) < ~(this.field6764 + 60000L)) {
            System.gc();
            this.field6764 = class173.method1134(true);
        }
        this.field6690 = var2;
    }

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "(I)V", line = 4372)
    private final void method2799(int arg0) {
        ++field6592;
        float var2 = (float) (-this.field6756) * this.field6771 / (float) this.field6740;
        float var3 = (float) (-this.field6768) * this.field6771 / (float) this.field6765;
        float var4 = (float) (-this.field6756 + this.field6633) * this.field6771 / (float) this.field6740;
        float var5 = (float) (-this.field6768 + this.field6677) * this.field6771 / (float) this.field6765;
        OpenGL.glMatrixMode(5889);
        if (arg0 < 10) {
            this.field6695 = -52;
        }
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field6830 - this.field6743), (double) ((float) this.field6729 - this.field6743));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(IZ)V", line = 4401)
    public final void method2800(int arg0, boolean arg1) {
        if (arg0 == 8629) {
            if (!this.field6738 == arg1) {
                if (!arg1) {
                    OpenGL.glDisable(2929);
                } else {
                    OpenGL.glEnable(2929);
                }
                this.field6775 &= -32;
                this.field6738 = arg1;
            }
            ++field6639;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIF)Lve;", line = 4425)
    public final class182 method870(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field6645;
        return new class214(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "()Z", line = 4435)
    public final boolean method923() {
        ++field6512;
        return true;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IFFFF)V", line = 4443)
    public final void method2801(int arg0, float arg1, float arg2, float arg3, float arg4) {
        class4.field31[1] = arg3;
        class4.field31[2] = arg2;
        class4.field31[0] = arg4;
        ++field6643;
        class4.field31[3] = arg1;
        OpenGL.glTexEnvfv(8960, 8705, class4.field31, arg0);
    }

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "()Z", line = 4455)
    public final boolean method844() {
        ++field6517;
        return false;
    }
}
