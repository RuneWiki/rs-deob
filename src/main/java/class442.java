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

@OriginalClass("client!bl")
public class class442 extends class318 {

    @OriginalMember(owner = "client!bl", name = "pb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field6532 = new Hashtable();

    @OriginalMember(owner = "client!bl", name = "Rd", descriptor = "I")
    public int field6664 = 128;

    @OriginalMember(owner = "client!bl", name = "Xd", descriptor = "Lln;")
    private class246 field6670 = new class246();

    @OriginalMember(owner = "client!bl", name = "he", descriptor = "Lna;")
    private class34 field6680 = new class34();

    @OriginalMember(owner = "client!bl", name = "le", descriptor = "Lna;")
    public class34 field6684 = new class34();

    @OriginalMember(owner = "client!bl", name = "me", descriptor = "I")
    public int field6685 = 8;

    @OriginalMember(owner = "client!bl", name = "ne", descriptor = "I")
    public int field6686 = 3;

    @OriginalMember(owner = "client!bl", name = "qe", descriptor = "Z")
    private boolean field6689 = false;

    @OriginalMember(owner = "client!bl", name = "pe", descriptor = "Lft;")
    private class4 field6688 = new class4();

    @OriginalMember(owner = "client!bl", name = "ue", descriptor = "I")
    private int field6693 = -1;

    @OriginalMember(owner = "client!bl", name = "te", descriptor = "I")
    private int field6692 = -1;

    @OriginalMember(owner = "client!bl", name = "ve", descriptor = "[Lop;")
    private class118[] field6694 = new class118[4];

    @OriginalMember(owner = "client!bl", name = "xe", descriptor = "[Lop;")
    private class118[] field6696 = new class118[4];

    @OriginalMember(owner = "client!bl", name = "we", descriptor = "[Lop;")
    private class118[] field6695 = new class118[4];

    @OriginalMember(owner = "client!bl", name = "ye", descriptor = "I")
    private int field6697 = -1;

    @OriginalMember(owner = "client!bl", name = "Be", descriptor = "Lft;")
    private class4 field6700;

    @OriginalMember(owner = "client!bl", name = "Fe", descriptor = "Lft;")
    private class4 field6704;

    @OriginalMember(owner = "client!bl", name = "Ge", descriptor = "Lft;")
    private class4 field6705;

    @OriginalMember(owner = "client!bl", name = "He", descriptor = "Lft;")
    private class4 field6706;

    @OriginalMember(owner = "client!bl", name = "Ie", descriptor = "Lft;")
    private class4 field6707;

    @OriginalMember(owner = "client!bl", name = "Je", descriptor = "Lft;")
    private class4 field6708;

    @OriginalMember(owner = "client!bl", name = "Ke", descriptor = "Lft;")
    private class4 field6709;

    @OriginalMember(owner = "client!bl", name = "Le", descriptor = "I")
    private int field6710;

    @OriginalMember(owner = "client!bl", name = "Xe", descriptor = "[F")
    private float[] field6722;

    @OriginalMember(owner = "client!bl", name = "ff", descriptor = "I")
    private int field6730;

    @OriginalMember(owner = "client!bl", name = "Te", descriptor = "Z")
    private boolean field6718;

    @OriginalMember(owner = "client!bl", name = "of", descriptor = "I")
    public int field6738;

    @OriginalMember(owner = "client!bl", name = "Ef", descriptor = "I")
    public int field6754;

    @OriginalMember(owner = "client!bl", name = "Rf", descriptor = "F")
    private float field6767;

    @OriginalMember(owner = "client!bl", name = "If", descriptor = "F")
    public float field6758;

    @OriginalMember(owner = "client!bl", name = "Ye", descriptor = "F")
    private float field6723;

    @OriginalMember(owner = "client!bl", name = "ef", descriptor = "I")
    private int field6729;

    @OriginalMember(owner = "client!bl", name = "jg", descriptor = "I")
    public int field6785;

    @OriginalMember(owner = "client!bl", name = "We", descriptor = "F")
    public float field6721;

    @OriginalMember(owner = "client!bl", name = "cg", descriptor = "[F")
    private float[] field6778;

    @OriginalMember(owner = "client!bl", name = "kf", descriptor = "I")
    private int field6734;

    @OriginalMember(owner = "client!bl", name = "lf", descriptor = "I")
    private int field6735;

    @OriginalMember(owner = "client!bl", name = "fg", descriptor = "I")
    private int field6781;

    @OriginalMember(owner = "client!bl", name = "Qe", descriptor = "F")
    public float field6715;

    @OriginalMember(owner = "client!bl", name = "rg", descriptor = "[F")
    private float[] field6793;

    @OriginalMember(owner = "client!bl", name = "Df", descriptor = "[F")
    private float[] field6753;

    @OriginalMember(owner = "client!bl", name = "Kf", descriptor = "F")
    public float field6760;

    @OriginalMember(owner = "client!bl", name = "gg", descriptor = "F")
    public float field6782;

    @OriginalMember(owner = "client!bl", name = "xg", descriptor = "I")
    public int field6799;

    @OriginalMember(owner = "client!bl", name = "ug", descriptor = "I")
    public int field6796;

    @OriginalMember(owner = "client!bl", name = "Sf", descriptor = "F")
    public float field6768;

    @OriginalMember(owner = "client!bl", name = "Jf", descriptor = "I")
    private int field6759;

    @OriginalMember(owner = "client!bl", name = "yg", descriptor = "I")
    public int field6800;

    @OriginalMember(owner = "client!bl", name = "vg", descriptor = "F")
    private float field6797;

    @OriginalMember(owner = "client!bl", name = "wg", descriptor = "[F")
    public float[] field6798;

    @OriginalMember(owner = "client!bl", name = "qf", descriptor = "I")
    private int field6740;

    @OriginalMember(owner = "client!bl", name = "Lg", descriptor = "I")
    private int field6813;

    @OriginalMember(owner = "client!bl", name = "Pg", descriptor = "I")
    public int field6817;

    @OriginalMember(owner = "client!bl", name = "nf", descriptor = "I")
    private int field6737;

    @OriginalMember(owner = "client!bl", name = "Xf", descriptor = "[Lki;")
    private class480[] field6773;

    @OriginalMember(owner = "client!bl", name = "Og", descriptor = "F")
    public float field6816;

    @OriginalMember(owner = "client!bl", name = "Kg", descriptor = "I")
    public int field6812;

    @OriginalMember(owner = "client!bl", name = "Jg", descriptor = "F")
    public float field6811;

    @OriginalMember(owner = "client!bl", name = "ch", descriptor = "I")
    public int field6830;

    @OriginalMember(owner = "client!bl", name = "ah", descriptor = "I")
    public int field6828;

    @OriginalMember(owner = "client!bl", name = "Vg", descriptor = "I")
    public int field6823;

    @OriginalMember(owner = "client!bl", name = "W", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6513;

    @OriginalMember(owner = "client!bl", name = "Ab", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6543;

    @OriginalMember(owner = "client!bl", name = "Sd", descriptor = "I")
    public int field6665;

    @OriginalMember(owner = "client!bl", name = "Vc", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field6616;

    @OriginalMember(owner = "client!bl", name = "Lb", descriptor = "J")
    private long field6554;

    @OriginalMember(owner = "client!bl", name = "Sb", descriptor = "J")
    private long field6561;

    @OriginalMember(owner = "client!bl", name = "vf", descriptor = "Z")
    public boolean field6745;

    @OriginalMember(owner = "client!bl", name = "Fg", descriptor = "I")
    public int field6807;

    @OriginalMember(owner = "client!bl", name = "Af", descriptor = "Ljava/lang/String;")
    private String field6750;

    @OriginalMember(owner = "client!bl", name = "Yf", descriptor = "Z")
    private boolean field6774;

    @OriginalMember(owner = "client!bl", name = "Hg", descriptor = "Z")
    public boolean field6809;

    @OriginalMember(owner = "client!bl", name = "Ng", descriptor = "Z")
    public boolean field6815;

    @OriginalMember(owner = "client!bl", name = "Oe", descriptor = "Z")
    public boolean field6713;

    @OriginalMember(owner = "client!bl", name = "qg", descriptor = "Z")
    private boolean field6792;

    @OriginalMember(owner = "client!bl", name = "Pf", descriptor = "Ljava/lang/String;")
    private String field6765;

    @OriginalMember(owner = "client!bl", name = "Ag", descriptor = "Z")
    public boolean field6802;

    @OriginalMember(owner = "client!bl", name = "Wf", descriptor = "Z")
    private boolean field6772;

    @OriginalMember(owner = "client!bl", name = "ae", descriptor = "Lbm;")
    public class70 field6673;

    @OriginalMember(owner = "client!bl", name = "oe", descriptor = "Lbj;")
    public class153 field6687;

    @OriginalMember(owner = "client!bl", name = "Yd", descriptor = "Lto;")
    private class8 field6671;

    @OriginalMember(owner = "client!bl", name = "Kd", descriptor = "Llk;")
    private class398 field6657;

    @OriginalMember(owner = "client!bl", name = "Zd", descriptor = "Lwp;")
    private class114 field6672;

    @OriginalMember(owner = "client!bl", name = "Id", descriptor = "Lsk;")
    public static class423 field6655 = new class423("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!bl", name = "ie", descriptor = "Lsk;")
    public static class423 field6681 = new class423("K", "T", "K", "K");

    @OriginalMember(owner = "client!bl", name = "je", descriptor = "J")
    public static volatile long field6682 = 0L;

    @OriginalMember(owner = "client!bl", name = "bf", descriptor = "F")
    private float field6726;

    @OriginalMember(owner = "client!bl", name = "mf", descriptor = "F")
    public float field6736;

    @OriginalMember(owner = "client!bl", name = "wf", descriptor = "F")
    public float field6746;

    @OriginalMember(owner = "client!bl", name = "Gf", descriptor = "F")
    public float field6756;

    @OriginalMember(owner = "client!bl", name = "Hf", descriptor = "F")
    public float field6757;

    @OriginalMember(owner = "client!bl", name = "Nf", descriptor = "F")
    private float field6763;

    @OriginalMember(owner = "client!bl", name = "pg", descriptor = "F")
    public float field6791;

    @OriginalMember(owner = "client!bl", name = "Eg", descriptor = "F")
    private float field6806;

    @OriginalMember(owner = "client!bl", name = "Gg", descriptor = "F")
    public float field6808;

    @OriginalMember(owner = "client!bl", name = "Ig", descriptor = "F")
    public float field6810;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    public static int field6483;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "I")
    public int field6497;

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!bl", name = "O", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "I")
    private int field6508;

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!bl", name = "U", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!bl", name = "X", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!bl", name = "Y", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!bl", name = "Z", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!bl", name = "ab", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!bl", name = "bb", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!bl", name = "cb", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!bl", name = "db", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!bl", name = "eb", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!bl", name = "fb", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!bl", name = "gb", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!bl", name = "hb", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!bl", name = "ib", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!bl", name = "jb", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!bl", name = "kb", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!bl", name = "lb", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!bl", name = "mb", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!bl", name = "nb", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!bl", name = "ob", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!bl", name = "qb", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!bl", name = "rb", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!bl", name = "sb", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!bl", name = "tb", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!bl", name = "ub", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!bl", name = "vb", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!bl", name = "wb", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!bl", name = "xb", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!bl", name = "yb", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!bl", name = "zb", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!bl", name = "Bb", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!bl", name = "Cb", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!bl", name = "Db", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!bl", name = "Eb", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!bl", name = "Fb", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!bl", name = "Gb", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!bl", name = "Hb", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!bl", name = "Ib", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!bl", name = "Jb", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!bl", name = "Kb", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!bl", name = "Mb", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!bl", name = "Nb", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!bl", name = "Ob", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!bl", name = "Pb", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!bl", name = "Qb", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!bl", name = "Rb", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!bl", name = "Tb", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!bl", name = "Ub", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!bl", name = "Vb", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!bl", name = "Wb", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!bl", name = "Xb", descriptor = "I")
    private int field6566;

    @OriginalMember(owner = "client!bl", name = "Yb", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!bl", name = "Zb", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!bl", name = "ac", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!bl", name = "bc", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!bl", name = "cc", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!bl", name = "dc", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!bl", name = "ec", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!bl", name = "fc", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!bl", name = "gc", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!bl", name = "hc", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!bl", name = "ic", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!bl", name = "jc", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!bl", name = "kc", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!bl", name = "lc", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!bl", name = "mc", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!bl", name = "nc", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!bl", name = "oc", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!bl", name = "pc", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!bl", name = "qc", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!bl", name = "rc", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!bl", name = "sc", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!bl", name = "tc", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!bl", name = "uc", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!bl", name = "vc", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!bl", name = "wc", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!bl", name = "xc", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!bl", name = "yc", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!bl", name = "zc", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!bl", name = "Ac", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!bl", name = "Bc", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!bl", name = "Cc", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!bl", name = "Dc", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!bl", name = "Ec", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!bl", name = "Fc", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!bl", name = "Gc", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!bl", name = "Hc", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!bl", name = "Ic", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!bl", name = "Jc", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!bl", name = "Kc", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!bl", name = "Lc", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!bl", name = "Mc", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!bl", name = "Nc", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!bl", name = "Oc", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!bl", name = "Pc", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!bl", name = "Qc", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!bl", name = "Rc", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!bl", name = "Sc", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!bl", name = "Tc", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!bl", name = "Uc", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!bl", name = "Wc", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!bl", name = "Xc", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!bl", name = "Yc", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!bl", name = "Zc", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!bl", name = "ad", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!bl", name = "bd", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!bl", name = "cd", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!bl", name = "dd", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!bl", name = "ed", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!bl", name = "fd", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!bl", name = "gd", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!bl", name = "hd", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!bl", name = "id", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!bl", name = "jd", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!bl", name = "kd", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!bl", name = "ld", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!bl", name = "md", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!bl", name = "nd", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!bl", name = "od", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!bl", name = "pd", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!bl", name = "qd", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!bl", name = "rd", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!bl", name = "sd", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!bl", name = "td", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!bl", name = "ud", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!bl", name = "vd", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!bl", name = "wd", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!bl", name = "xd", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!bl", name = "yd", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!bl", name = "zd", descriptor = "I")
    public static int field6646;

    @OriginalMember(owner = "client!bl", name = "Ad", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!bl", name = "Bd", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!bl", name = "Cd", descriptor = "I")
    public int field6649;

    @OriginalMember(owner = "client!bl", name = "Dd", descriptor = "I")
    public static int field6650;

    @OriginalMember(owner = "client!bl", name = "Ed", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!bl", name = "Fd", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!bl", name = "Gd", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!bl", name = "Hd", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!bl", name = "Jd", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!bl", name = "Ld", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!bl", name = "Md", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!bl", name = "Nd", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!bl", name = "Od", descriptor = "I")
    public static int field6661;

    @OriginalMember(owner = "client!bl", name = "Pd", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!bl", name = "Qd", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!bl", name = "Td", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!bl", name = "Ud", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!bl", name = "Vd", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!bl", name = "Wd", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!bl", name = "be", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!bl", name = "ce", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!bl", name = "de", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!bl", name = "ee", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!bl", name = "fe", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!bl", name = "se", descriptor = "I")
    public int field6691;

    @OriginalMember(owner = "client!bl", name = "Ce", descriptor = "I")
    private int field6701;

    @OriginalMember(owner = "client!bl", name = "De", descriptor = "I")
    public int field6702;

    @OriginalMember(owner = "client!bl", name = "Ee", descriptor = "I")
    public int field6703;

    @OriginalMember(owner = "client!bl", name = "Me", descriptor = "I")
    private int field6711;

    @OriginalMember(owner = "client!bl", name = "Re", descriptor = "I")
    private int field6716;

    @OriginalMember(owner = "client!bl", name = "uf", descriptor = "I")
    private int field6744;

    @OriginalMember(owner = "client!bl", name = "yf", descriptor = "I")
    public int field6748;

    @OriginalMember(owner = "client!bl", name = "zf", descriptor = "I")
    private int field6749;

    @OriginalMember(owner = "client!bl", name = "Lf", descriptor = "I")
    public int field6761;

    @OriginalMember(owner = "client!bl", name = "Mf", descriptor = "I")
    public int field6762;

    @OriginalMember(owner = "client!bl", name = "Tf", descriptor = "I")
    private int field6769;

    @OriginalMember(owner = "client!bl", name = "Vf", descriptor = "I")
    private int field6771;

    @OriginalMember(owner = "client!bl", name = "ag", descriptor = "I")
    private int field6776;

    @OriginalMember(owner = "client!bl", name = "hg", descriptor = "I")
    private int field6783;

    @OriginalMember(owner = "client!bl", name = "kg", descriptor = "I")
    private int field6786;

    @OriginalMember(owner = "client!bl", name = "ng", descriptor = "I")
    private int field6789;

    @OriginalMember(owner = "client!bl", name = "og", descriptor = "I")
    public int field6790;

    @OriginalMember(owner = "client!bl", name = "sg", descriptor = "I")
    private int field6794;

    @OriginalMember(owner = "client!bl", name = "Mg", descriptor = "I")
    private int field6814;

    @OriginalMember(owner = "client!bl", name = "Yg", descriptor = "I")
    private int field6826;

    @OriginalMember(owner = "client!bl", name = "Xg", descriptor = "J")
    private long field6825;

    @OriginalMember(owner = "client!bl", name = "ze", descriptor = "Lop;")
    private class118 field6698;

    @OriginalMember(owner = "client!bl", name = "Ae", descriptor = "Lop;")
    private class118 field6699;

    @OriginalMember(owner = "client!bl", name = "Ug", descriptor = "Leo;")
    private class186 field6822;

    @OriginalMember(owner = "client!bl", name = "bh", descriptor = "Leo;")
    private class186 field6829;

    @OriginalMember(owner = "client!bl", name = "Wg", descriptor = "Ljs;")
    private class208 field6824;

    @OriginalMember(owner = "client!bl", name = "df", descriptor = "Lsg;")
    public class262 field6728;

    @OriginalMember(owner = "client!bl", name = "gf", descriptor = "Lsg;")
    public class262 field6731;

    @OriginalMember(owner = "client!bl", name = "Cf", descriptor = "Lsg;")
    public class262 field6752;

    @OriginalMember(owner = "client!bl", name = "eg", descriptor = "Lna;")
    public class34 field6780;

    @OriginalMember(owner = "client!bl", name = "Sg", descriptor = "Lna;")
    public class34 field6820;

    @OriginalMember(owner = "client!bl", name = "xf", descriptor = "Lot;")
    public class400 field6747;

    @OriginalMember(owner = "client!bl", name = "mg", descriptor = "Lot;")
    public class400 field6788;

    @OriginalMember(owner = "client!bl", name = "Qg", descriptor = "Lph;")
    private class438 field6818;

    @OriginalMember(owner = "client!bl", name = "Pe", descriptor = "Lri;")
    public class69 field6714;

    @OriginalMember(owner = "client!bl", name = "jf", descriptor = "Lri;")
    public class69 field6733;

    @OriginalMember(owner = "client!bl", name = "Of", descriptor = "Lri;")
    public class69 field6764;

    @OriginalMember(owner = "client!bl", name = "Qf", descriptor = "Lri;")
    public class69 field6766;

    @OriginalMember(owner = "client!bl", name = "Zf", descriptor = "Lri;")
    public class69 field6775;

    @OriginalMember(owner = "client!bl", name = "bg", descriptor = "Lri;")
    public class69 field6777;

    @OriginalMember(owner = "client!bl", name = "ig", descriptor = "Lri;")
    public class69 field6784;

    @OriginalMember(owner = "client!bl", name = "zg", descriptor = "Lri;")
    public class69 field6801;

    @OriginalMember(owner = "client!bl", name = "Cg", descriptor = "Lri;")
    public class69 field6804;

    @OriginalMember(owner = "client!bl", name = "Tg", descriptor = "Lri;")
    public class69 field6821;

    @OriginalMember(owner = "client!bl", name = "Ne", descriptor = "Lju;")
    private class77 field6712;

    @OriginalMember(owner = "client!bl", name = "sf", descriptor = "Lmg;")
    public class96 field6742;

    @OriginalMember(owner = "client!bl", name = "Uf", descriptor = "Lmg;")
    public class96 field6770;

    @OriginalMember(owner = "client!bl", name = "re", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field6690;

    @OriginalMember(owner = "client!bl", name = "Se", descriptor = "Z")
    public boolean field6717;

    @OriginalMember(owner = "client!bl", name = "Ue", descriptor = "Z")
    private boolean field6719;

    @OriginalMember(owner = "client!bl", name = "Ve", descriptor = "Z")
    public boolean field6720;

    @OriginalMember(owner = "client!bl", name = "Ze", descriptor = "Z")
    private boolean field6724;

    @OriginalMember(owner = "client!bl", name = "af", descriptor = "Z")
    private boolean field6725;

    @OriginalMember(owner = "client!bl", name = "cf", descriptor = "Z")
    public boolean field6727;

    @OriginalMember(owner = "client!bl", name = "hf", descriptor = "Z")
    public boolean field6732;

    @OriginalMember(owner = "client!bl", name = "pf", descriptor = "Z")
    private boolean field6739;

    @OriginalMember(owner = "client!bl", name = "rf", descriptor = "Z")
    public boolean field6741;

    @OriginalMember(owner = "client!bl", name = "tf", descriptor = "Z")
    private boolean field6743;

    @OriginalMember(owner = "client!bl", name = "Bf", descriptor = "Z")
    public boolean field6751;

    @OriginalMember(owner = "client!bl", name = "Ff", descriptor = "Z")
    private boolean field6755;

    @OriginalMember(owner = "client!bl", name = "dg", descriptor = "Z")
    public boolean field6779;

    @OriginalMember(owner = "client!bl", name = "lg", descriptor = "Z")
    private boolean field6787;

    @OriginalMember(owner = "client!bl", name = "Bg", descriptor = "Z")
    private boolean field6803;

    @OriginalMember(owner = "client!bl", name = "Dg", descriptor = "Z")
    private boolean field6805;

    @OriginalMember(owner = "client!bl", name = "Rg", descriptor = "Z")
    public boolean field6819;

    @OriginalMember(owner = "client!bl", name = "Zg", descriptor = "Z")
    private boolean field6827;

    @OriginalMember(owner = "client!bl", name = "ge", descriptor = "[Lig;")
    public static class154[] field6679;

    @OriginalMember(owner = "client!bl", name = "tg", descriptor = "[Lce;")
    private class194[] field6795;

    @OriginalMember(owner = "client!bl", name = "ke", descriptor = "[Lhu;")
    public static class81[] field6683;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BIII)V")
    public final void method2575(byte arg0, int arg1, int arg2, int arg3) {
        ++field6656;
        if (arg0 <= -59) {
            OpenGL.glTexEnvi(8960, arg3 + 34184, arg1);
            OpenGL.glTexEnvi(8960, arg3 + 34200, arg2);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIF)Lki;")
    public final class480 method1894(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field6488;
        return new class139(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "()Z")
    public final boolean method1949() {
        ++field6493;
        return this.field6657 != null && (this.field6665 <= 1 || this.field6827);
    }

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "()I")
    public final int method1986() {
        ++field6522;
        return 4;
    }

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "()V")
    public final void method1990() {
        ++field6526;
        for (class179 var1 = this.field6688.method8((byte) -98); var1 != null; var1 = this.field6688.method17((byte) -92)) {
            ((class225) var1).method1362(107);
        }
        if (this.field6671 != null) {
            this.field6671.method45(1);
        }
        if (this.field6616 != null) {
            this.method2647(-31446);
            Enumeration var2 = this.field6532.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field6532.get(var3);
                this.field6616.releaseSurface(var3, var4);
            }
            this.field6616.release();
            this.field6616 = null;
        }
        if (this.field6689) {
            class277.method1685(true, true, true);
            this.field6689 = false;
        }
    }

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "(I)V")
    public final void method2576(int arg0) {
        ++field6489;
        if (arg0 == 24997) {
            if (this.field6783 != 8) {
                this.method2581((byte) -65);
                this.method2609(true, true);
                this.method2602(false, true);
                this.method2598(arg0 ^ 5751, true);
                this.method2640(27575, 1);
                this.method2610(0, 0);
                this.field6783 = 8;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "(Z)V")
    private final void method2577(boolean arg0) {
        ++field6545;
        this.method2650((byte) -98, -2);
        for (int var2 = this.field6762 + -1; ~var2 <= -1; --var2) {
            this.method2582((byte) 20, var2);
            this.method2586((class194) null, false);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2624((byte) 107, 8448, 8448);
        this.method2597(34168, (byte) -48, 770, 2);
        this.method2642(1);
        this.field6789 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field6711 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field6739 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field6719 = true;
        this.method2609(arg0, true);
        this.method2600((byte) 103, true);
        this.method2602(false, true);
        this.method2598(30674, arg0);
        this.method2588((byte) 74);
        this.field6616.setSwapInterval(0);
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
        for (int var4 = 0; ~var4 > -9; ++var4) {
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
        this.field6729 = this.field6817 = -1;
        this.method1966();
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "()I")
    public final int method1897() {
        ++field6648;
        int var1 = this.field6776;
        this.field6776 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II[[I[[IIII)Lfo;")
    public final class343 method1919(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field6608;
        return new class55(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIILbe;II)V")
    public final void method1896(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class28 arg6, int arg7, int arg8) {
        ++field6521;
        class475 var10 = (class475) arg6;
        class208 var11 = var10.field7249;
        this.method2580((byte) 77);
        this.method2586(var10.field7249, false);
        this.method2640(27575, arg5);
        this.method2624((byte) 107, 8448, 7681);
        this.method2597(34167, (byte) -65, 768, 0);
        float var12 = var11.field3252 / (float) var11.field3255;
        float var13 = var11.field3254 / (float) var11.field3258;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method2597(5890, (byte) -95, 768, 0);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public final void method1902(int arg0) {
        this.method2621((byte) 123);
        ++field6518;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Llf;Llf;FLlf;)Llf;")
    public final class151 method1985(class151 arg0, class151 arg1, float arg2, class151 arg3) {
        ++field6556;
        if (arg0 != null && arg1 != null && this.field6819 && this.field6802 && this.field6732) {
            class498 var5 = null;
            class77 var6 = (class77) arg0;
            class77 var7 = (class77) arg1;
            class304 var8 = var6.method423(37);
            class304 var9 = var7.method423(37);
            if (var8 != null && var9 != null) {
                int var10 = ~var8.field4618 < ~var9.field4618 ? var8.field4618 : var9.field4618;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class498) {
                    class498 var11 = (class498) arg3;
                    if (var10 == var11.method2997(8)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class498(this, var10);
                }
                if (var5.method2992(var8, (byte) 98, var9, arg2)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "()V")
    public final void method1945() {
        ++field6484;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(II)I")
    public final int method1951(int arg0, int arg1) {
        ++field6662;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "(I)V")
    private final void method2578(int arg0) {
        if (arg0 > -108) {
            this.method1957((Rectangle[]) null, -71);
        }
        if (this.field6783 != 1) {
            this.method2654((byte) -91);
            this.method2609(true, false);
            this.method2600((byte) 109, false);
            this.method2602(false, false);
            this.method2598(30674, false);
            this.method2586((class194) null, false);
            this.method2650((byte) -115, -2);
            this.method2610(0, 1);
            this.field6783 = 1;
        }
        ++field6612;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method1939(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field6677;
        float var10;
        float var11;
        if (this.field6824 != null && ~arg2 >= ~this.field6824.field3970 && arg3 <= this.field6824.field3968) {
            this.field6824.method1591(0, 0, true, 0, 6406, arg6, arg2, arg3, false, 0);
            var10 = (float) arg2 * this.field6824.field3252 / (float) this.field6824.field3970;
            var11 = (float) arg3 * this.field6824.field3254 / (float) this.field6824.field3968;
        } else {
            this.field6824 = class67.method456(arg3, 6406, arg2, 6406, (byte) 95, this, false, arg6);
            this.field6824.method1593(false, false, 0);
            var11 = this.field6824.field3254;
            var10 = this.field6824.field3252;
        }
        this.method2580((byte) 77);
        this.method2586(this.field6824, false);
        this.method2640(27575, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2605(126, arg5);
        this.method2624((byte) 107, 34165, 34165);
        this.method2597(34166, (byte) -117, 768, 0);
        this.method2597(5890, (byte) -106, 770, 2);
        this.method2575((byte) -109, 34166, 770, 0);
        this.method2575((byte) -103, 5890, 770, 2);
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
        this.method2597(5890, (byte) -96, 768, 0);
        this.method2597(34166, (byte) -44, 770, 2);
        this.method2575((byte) -87, 5890, 770, 0);
        this.method2575((byte) -109, 34166, 770, 2);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
    public final void method1907(int arg0) {
        this.field6686 = 0;
        ++field6647;
        while (arg0 > 1) {
            ++this.field6686;
            arg0 >>= 1;
        }
        this.field6685 = 1 << this.field6686;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V")
    public final void method1947(int arg0, int arg1, int arg2) {
        if (this.field6817 != arg0 || this.field6812 != arg1 || this.field6785 != arg2) {
            this.field6817 = arg0;
            this.field6812 = arg1;
            this.field6785 = arg2;
            if (!this.field6779) {
                this.method2627(false);
                this.method2584((byte) 94);
            }
        }
        ++field6577;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIZ)Lig;")
    public final class154 method1930(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field6646;
        return new class199(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "()Z")
    public final boolean method1969() {
        ++field6654;
        return true;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(JB)V")
    public final synchronized void method2579(long arg0, byte arg1) {
        ++field6562;
        if (arg1 <= 93) {
            this.method1923(22, -117, 50, -113, -76, -51);
        }
        class179 var4 = new class179();
        var4.field2798 = arg0;
        this.field6709.method4(1, var4);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public final void method2580(byte arg0) {
        if (this.field6783 != 2) {
            this.method2654((byte) 117);
            this.method2609(true, false);
            this.method2600((byte) 4, false);
            this.method2602(false, false);
            this.method2598(30674, false);
            this.method2650((byte) -112, -2);
            this.field6783 = 2;
        }
        if (arg0 == 77) {
            ++field6624;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V")
    private final void method2581(byte arg0) {
        ++field6569;
        if (arg0 > -64) {
            this.method1962();
        }
        if (this.field6786 != 2) {
            this.field6786 = 2;
            this.method2656(25658);
            this.method2644(65280);
            this.field6783 &= -8;
        }
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)Lpt;")
    public final class353 method1928(int arg0) {
        ++field6524;
        class225 var2 = new class225(arg0);
        this.field6688.method4(1, var2);
        return var2;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)V")
    public final void method2582(byte arg0, int arg1) {
        if (this.field6814 != arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field6814 = arg1;
        }
        int var3 = -1 / ((arg0 - 80) / 33);
        ++field6514;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lfd;Z)Lig;")
    public final class154 method1952(class351 arg0, boolean arg1) {
        ++field6564;
        int[] var3 = new int[arg0.field5168 * arg0.field5166];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field5174 != null) {
            for (int var6 = 0; ~arg0.field5168 < ~var6; ++var6) {
                for (int var7 = 0; var7 < arg0.field5166; ++var7) {
                    var3[var5++] = class318.method1973(arg0.field5169[class330.method2050(255, arg0.field5173[var4])], arg0.field5174[var4] << 24);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; arg0.field5168 > var8; ++var8) {
                for (int var10 = 0; ~arg0.field5166 < ~var10; ++var10) {
                    int var11 = arg0.field5169[255 & arg0.field5173[var4++]];
                    var3[var5++] = ~var11 == -1 ? 0 : class318.method1973(-16777216, var11);
                }
            }
        }
        class154 var9 = this.method1924(var3, 0, arg0.field5166, arg0.field5166, arg0.field5168);
        var9.method992(arg0.field5170, arg0.field5171, arg0.field5172, arg0.field5167);
        return var9;
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(II)I")
    public final int method2583(int arg0, int arg1) {
        int var3 = -62 / ((arg1 - -3) / 43);
        ++field6491;
        if (arg0 != 6406 && ~arg0 != -6410) {
            if (~arg0 != -6411 && ~arg0 != -34847 && ~arg0 != -34845) {
                if (~arg0 != -6408) {
                    if (~arg0 != -6409 && ~arg0 != -34848) {
                        if (arg0 != 34843) {
                            if (~arg0 == -34843) {
                                return 8;
                            } else if (arg0 == 6402) {
                                return 3;
                            } else if (arg0 == 6401) {
                                return 1;
                            } else {
                                throw new IllegalArgumentException("");
                            }
                        } else {
                            return 6;
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

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(IIII)V")
    public final void method1940(int arg0, int arg1, int arg2, int arg3) {
        this.field6761 = arg0;
        ++field6659;
        this.field6779 = true;
        this.field6823 = arg2;
        this.field6796 = arg3;
        this.field6730 = arg1;
        this.field6672.method814(false, false, false, 3);
        this.field6672.field1928.method674(-100);
        this.method2627(false);
        this.method2584((byte) 94);
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(IIIII)V")
    public final void method1980(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6602;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)V")
    private final void method2584(byte arg0) {
        ++field6634;
        if (arg0 == 94) {
            if (this.field6803 && this.field6812 >= 0 | this.field6779) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIII)V")
    public final void method1972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field6597;
        this.method1991(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "()I")
    public final int method1955() {
        ++field6583;
        return this.field6800;
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(B)V")
    private final void method2585(byte arg0) {
        class96.field1738[0] = this.field6811 * this.field6756;
        ++field6546;
        if (arg0 >= -82) {
            this.method2652(-93, (byte) -59, 90, 80);
        }
        class96.field1738[2] = this.field6768 * this.field6756;
        class96.field1738[1] = this.field6756 * this.field6715;
        class96.field1738[3] = 1.0F;
        OpenGL.glLightModelfv(2899, class96.field1738, 0);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1901(Canvas arg0) {
        ++field6603;
        long var2 = 0L;
        if (arg0 != null && this.field6513 != arg0) {
            if (this.field6532.containsKey(arg0)) {
                Long var4 = (Long) this.field6532.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field6554;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field6616.surfaceResized(var2);
            if (this.field6543 == arg0) {
                this.method2594(true);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lce;Z)V")
    public final void method2586(class194 arg0, boolean arg1) {
        ++field6620;
        class194 var3 = this.field6795[this.field6814];
        if (arg1) {
            this.method2631(27, 76, true);
        }
        if (arg0 != var3) {
            if (arg0 != null) {
                if (var3 == null) {
                    OpenGL.glEnable(arg0.field3066);
                } else if (arg0.field3066 != var3.field3066) {
                    OpenGL.glDisable(var3.field3066);
                    OpenGL.glEnable(arg0.field3066);
                }
                OpenGL.glBindTexture(arg0.field3066, arg0.method1211(-96));
            } else {
                OpenGL.glDisable(var3.field3066);
            }
            this.field6795[this.field6814] = arg0;
        }
        this.field6783 &= -2;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lph;I)V")
    public final void method2587(class438 arg0, int arg1) {
        if (arg1 != 1) {
            this.method1982(36, -109, 119, -3);
        }
        if (this.field6818 != arg0) {
            if (this.field6774) {
                OpenGL.glBindBufferARB(34963, arg0.method350(12399));
            }
            this.field6818 = arg0;
        }
        ++field6531;
    }

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "()Z")
    public final boolean method1911() {
        ++field6663;
        if (this.field6657 != null) {
            if (!this.field6657.method683(127)) {
                if (!this.field6671.method50(this.field6657, -124)) {
                    return false;
                }
                this.field6673.method515(-1);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(B)V")
    public final void method2588(byte arg0) {
        if (~this.field6786 != -1) {
            this.field6783 &= -32;
            this.field6786 = 0;
        }
        ++field6581;
        if (arg0 <= 35) {
            this.field6689 = false;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BII)V")
    public final synchronized void method2589(byte arg0, int arg1, int arg2) {
        ++field6540;
        class361 var4 = new class361(arg1);
        var4.field2798 = (long) arg2;
        if (arg0 >= 91) {
            this.field6705.method4(1, var4);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZFF)V")
    public final void method2590(boolean arg0, float arg1, float arg2) {
        this.field6797 = arg2;
        ++field6544;
        this.field6723 = arg1;
        if (arg0) {
            if (!this.field6779) {
                this.method2627(false);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLop;)V")
    public final void method2591(byte arg0, class118 arg1) {
        ++field6500;
        if (arg0 != 51) {
            this.method2611(112);
        }
        if (this.field6732) {
            this.method2619(arg1, arg0 + 25036);
            this.method2595(true, arg1);
        } else if (~this.field6693 <= -1 && this.field6695[this.field6693] == arg1) {
            this.field6695[this.field6693--] = null;
            arg1.method735(3015);
            if (~this.field6693 <= -1) {
                this.field6698 = this.field6699 = this.field6695[this.field6693];
                this.field6698.method736(1354);
            } else {
                this.field6698 = this.field6699 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lop;I)V")
    public final void method2592(class118 arg0, int arg1) {
        ++field6511;
        if (~this.field6697 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field6697 <= -1) {
                this.field6694[this.field6697].method723((byte) -110);
            }
            this.field6698 = this.field6694[++this.field6697] = arg0;
            this.field6698.method726(-27445);
            if (arg1 < 25) {
                this.field6532 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "()I")
    public final int method1960() {
        ++field6590;
        return this.field6703 - -this.field6701 + this.field6702;
    }

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "()F")
    public final float method1968() {
        ++field6547;
        return this.field6808;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZIILph;)V")
    public final void method2593(int arg0, boolean arg1, int arg2, int arg3, class438 arg4) {
        ++field6580;
        int var6 = arg4.method351(false);
        int var7 = arg2 * this.method2649(-3767, var6);
        this.method2587(arg4, 1);
        OpenGL.glDrawElements(arg0, arg3, var6, arg4.method352(108) - -((long) var7));
        if (!arg1) {
            this.field6809 = true;
        }
    }

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "(Z)V")
    private final void method2594(boolean arg0) {
        ++field6509;
        if (this.field6543 != null) {
            Dimension var2 = this.field6543.getSize();
            this.field6508 = var2.height;
            this.field6566 = var2.width;
        } else {
            this.field6566 = this.field6508 = 0;
        }
        if (this.field6699 == null) {
            this.field6497 = this.field6508;
            this.field6649 = this.field6566;
            this.method2616((byte) -79);
        }
        this.method2588((byte) 88);
        this.method1966();
        if (!arg0) {
            method2608(8, 59, (Canvas) null, (class11) null);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZLop;)V")
    public final void method2595(boolean arg0, class118 arg1) {
        ++field6587;
        if (~this.field6692 <= -1 && this.field6696[this.field6692] == arg1) {
            this.field6696[this.field6692--] = null;
            arg1.method725(-98);
            if (~this.field6692 > -1) {
                this.field6699 = null;
            } else {
                this.field6699 = this.field6696[this.field6692];
                this.field6699.method720(-126);
            }
            if (!arg0) {
                this.method2588((byte) 4);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)V")
    public final synchronized void method1956(int arg0) {
        ++field6600;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field6704.method14(0)) {
            class361 var12 = (class361) this.field6704.method7(false);
            class341.field5096[var2++] = (int) var12.field2798;
            this.field6703 -= var12.field5334;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class341.field5096, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class341.field5096, 0);
            var2 = 0;
        }
        while (!this.field6705.method14(0)) {
            class361 var11 = (class361) this.field6705.method7(false);
            class341.field5096[var2++] = (int) var11.field2798;
            this.field6702 -= var11.field5334;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class341.field5096, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class341.field5096, 0);
            var2 = 0;
        }
        while (!this.field6706.method14(0)) {
            class361 var10 = (class361) this.field6706.method7(false);
            class341.field5096[var2++] = var10.field5334;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class341.field5096, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class341.field5096, 0);
            var2 = 0;
        }
        while (!this.field6707.method14(0)) {
            class361 var9 = (class361) this.field6707.method7(false);
            class341.field5096[var2++] = (int) var9.field2798;
            this.field6701 -= var9.field5334;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class341.field5096, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class341.field5096, 0);
            boolean var4 = false;
        }
        while (!this.field6700.method14(0)) {
            class361 var8 = (class361) this.field6700.method7(false);
            OpenGL.glDeleteLists((int) var8.field2798, var8.field5334);
        }
        while (!this.field6708.method14(0)) {
            class179 var7 = this.field6708.method7(false);
            OpenGL.glDeleteProgramARB((int) var7.field2798);
        }
        while (!this.field6709.method14(0)) {
            class179 var6 = this.field6709.method7(false);
            OpenGL.glDeleteObjectARB(var6.field2798);
        }
        while (!this.field6700.method14(0)) {
            class361 var5 = (class361) this.field6700.method7(false);
            OpenGL.glDeleteLists((int) var5.field2798, var5.field5334);
        }
        this.field6673.method514(77);
        if (~this.method1960() < -100663297 && class344.method2111((byte) -37) > this.field6825 + 60000L) {
            System.gc();
            this.field6825 = class344.method2111((byte) -95);
        }
        this.field6691 = var3;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(Lop;I)V")
    public final void method2596(class118 arg0, int arg1) {
        ++field6632;
        if (~this.field6692 <= arg1) {
            throw new RuntimeException();
        } else {
            if (this.field6692 >= 0) {
                this.field6696[this.field6692].method725(-125);
            }
            this.field6699 = this.field6696[++this.field6692] = arg0;
            this.field6699.method720(-128);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IBII)V")
    public final void method2597(int arg0, byte arg1, int arg2, int arg3) {
        ++field6629;
        OpenGL.glTexEnvi(8960, arg3 + 34176, arg0);
        int var5 = 69 % ((arg1 - 37) / 44);
        OpenGL.glTexEnvi(8960, arg3 + 34192, arg2);
    }

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "()Lql;")
    public final class496 method1925() {
        ++field6589;
        return new class34();
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZ)V")
    public final void method2598(int arg0, boolean arg1) {
        if (!this.field6755 == arg1) {
            this.field6755 = arg1;
            this.method2653((byte) 125);
            this.field6783 &= -32;
        }
        if (arg0 == 30674) {
            ++field6539;
        }
    }

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "(B)V")
    private final void method2599(byte arg0) {
        ++field6485;
        float var2 = (float) (-this.field6828) * this.field6767 / (float) this.field6830;
        float var3 = (float) (-this.field6754) * this.field6767 / (float) this.field6738;
        float var4 = (float) (this.field6649 - this.field6828) * this.field6767 / (float) this.field6830;
        float var5 = (float) (-this.field6754 + this.field6497) * this.field6767 / (float) this.field6738;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field6800 - this.field6808), (double) ((float) this.field6799 - this.field6808));
        }
        OpenGL.glMatrixMode(5888);
        int var6 = -127 / ((36 - arg0) / 40);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
    public final void method1892(boolean arg0) {
        ++field6480;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BZ)V")
    public final void method2600(byte arg0, boolean arg1) {
        if (!arg1 != !this.field6725) {
            this.field6725 = arg1;
            this.method2651((byte) 93);
            this.field6783 &= -8;
        }
        ++field6676;
        int var3 = -8 / ((54 - arg0) / 38);
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1937(Canvas arg0) {
        this.field6561 = 0L;
        ++field6529;
        this.field6543 = null;
        if (arg0 != null && this.field6513 != arg0) {
            if (this.field6532.containsKey(arg0)) {
                Long var2 = (Long) this.field6532.get(arg0);
                this.field6561 = var2;
                this.field6543 = arg0;
            }
        } else {
            this.field6561 = this.field6554;
            this.field6543 = this.field6513;
        }
        if (this.field6543 != null && this.field6561 != 0L) {
            this.field6616.setSurface(this.field6561);
            this.method2594(true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IFFFFF)V")
    public final void method1941(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field6638;
        boolean var7 = ~this.field6729 != ~arg0;
        if (var7 || this.field6758 != arg1 || this.field6721 != arg2) {
            this.field6758 = arg1;
            this.field6721 = arg2;
            this.field6729 = arg0;
            if (var7) {
                this.field6811 = (float) (16711680 & this.field6729) / 1.671168E7F;
                this.field6768 = (float) (255 & this.field6729) / 255.0F;
                this.field6715 = (float) (65280 & this.field6729) / 65280.0F;
                this.method2585((byte) -88);
            }
            this.method2639(true);
        }
        if (this.field6793[0] != arg3 || this.field6793[1] != arg4 || this.field6793[2] != arg5) {
            this.field6793[1] = arg4;
            this.field6793[2] = arg5;
            this.field6793[0] = arg3;
            this.field6778[0] = -arg3;
            this.field6778[1] = -arg4;
            this.field6778[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field6798[1] = arg4 * var8;
            this.field6798[0] = arg3 * var8;
            this.field6798[2] = arg5 * var8;
            this.field6753[1] = -this.field6798[1];
            this.field6753[0] = -this.field6798[0];
            this.field6753[2] = -this.field6798[2];
            this.method2603(29960);
            this.field6748 = (int) (arg5 * 256.0F / arg4);
            this.field6790 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZIIB[B)Lph;")
    public final class438 method2601(boolean arg0, int arg1, int arg2, byte arg3, byte[] arg4) {
        if (arg3 != 54) {
            return null;
        } else {
            ++field6565;
            return (class438) (!this.field6774 || arg0 && !this.field6792 ? new class49(this, arg2, arg4, arg1) : new class499(this, arg2, arg4, arg1, arg0));
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(FFF)V")
    public final void method1933(float arg0, float arg1, float arg2) {
        ++field6618;
        class55.field843 = arg1;
        class22.field279 = arg0;
        class339.field5068 = arg2;
    }

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "()Z")
    public final boolean method1967() {
        ++field6609;
        return true;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lvl;ILhf;)V")
    public class442(int arg0, Canvas arg1, class11 arg2, int arg3, class260 arg4) {
        super(arg0, arg2);
        new class375();
        new class407(16);
        this.field6700 = new class4();
        this.field6704 = new class4();
        this.field6705 = new class4();
        this.field6706 = new class4();
        this.field6707 = new class4();
        this.field6708 = new class4();
        this.field6709 = new class4();
        this.field6710 = 0;
        this.field6722 = new float[16];
        this.field6730 = -1;
        this.field6718 = true;
        this.field6738 = 512;
        this.field6754 = 0;
        this.field6767 = 1.0F;
        this.field6758 = -1.0F;
        this.field6723 = 0.0F;
        this.field6729 = -1;
        this.field6785 = 0;
        this.field6721 = -1.0F;
        this.field6778 = new float[4];
        this.field6734 = 0;
        this.field6735 = 0;
        this.field6781 = 0;
        this.field6715 = 1.0F;
        this.field6793 = new float[4];
        this.field6753 = new float[4];
        this.field6760 = 3584.0F;
        this.field6782 = 3000.0F;
        this.field6799 = 3584;
        this.field6796 = 0;
        this.field6768 = 1.0F;
        this.field6759 = 0;
        this.field6800 = 50;
        this.field6797 = 1.0F;
        this.field6798 = new float[4];
        this.field6740 = 8448;
        this.field6813 = 8448;
        this.field6817 = -1;
        this.field6737 = 0;
        this.field6773 = new class480[class318.field4790];
        this.field6816 = 3584.0F;
        this.field6812 = -1;
        this.field6811 = 1.0F;
        this.field6830 = 512;
        this.field6828 = 0;
        this.field6823 = -1;
        this.field6543 = this.field6513 = arg1;
        this.field6665 = arg3;
        try {
            if (class321.field4835 == null || !class321.field4835) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class321.field4835 = Boolean.TRUE;
                } else {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (var6.startsWith("mac")) {
                            System.load(arg4.method1581((byte) 121, "libjaggl.jnilib").toString());
                        } else {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method1581((byte) 121, "jaggl.dll").toString());
                        }
                    } else {
                        System.load(arg4.method1581((byte) 121, "libjaggl.so").toString());
                    }
                    class321.field4835 = Boolean.TRUE;
                }
            }
            if (class321.field4835 != null && class321.field4835) {
                this.field6616 = new OpenGL();
                this.field6561 = this.field6554 = this.field6616.init(arg1, 8, 8, 8, 24, 0, this.field6665);
                if (this.field6554 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method2621((byte) 123);
                    int var7 = this.method2648(1);
                    if (~var7 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field6807 = this.field6745 ? 33639 : 5121;
                        if (~this.field6750.indexOf("radeon") != 0) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class499.method3003(' ', 1, this.field6750.replace('/', ' '));
                            for (int var12 = 0; ~var11.length < ~var12; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (~var13.length() < -1) {
                                        if (var13.charAt(0) == 'x' && var13.length() >= 3 && class174.method1090((byte) -123, var13.substring(1, 3))) {
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
                                            if (~var13.length() <= -5 && class174.method1090((byte) -116, var13.substring(0, 4))) {
                                                var8 = class218.method1335(var13.substring(0, 4), 10);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var10 && !var9) {
                                if (~var8 <= -7001 && var8 <= 7999) {
                                    this.field6774 = false;
                                }
                                if (~var8 <= -7001 && ~var8 >= -9251) {
                                    this.field6809 = false;
                                }
                            }
                            if (!var9 || ~var8 > -4001) {
                                this.field6815 = false;
                            }
                            this.field6713 &= this.field6616.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field6792 = this.field6774;
                        }
                        if (this.field6765.indexOf("intel") != -1) {
                            this.field6802 = false;
                        }
                        this.field6772 = !this.field6765.equals("s3 graphics");
                        if (this.field6774) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class239.method1433(32, true, true);
                        this.field6689 = true;
                        this.field6673 = new class70(this, super.field4784);
                        this.method2604((byte) -18);
                        this.field6687 = new class153(this);
                        this.field6671 = new class8(this);
                        if (this.field6671.method44((byte) 124)) {
                            this.field6657 = new class398(this);
                            if (!this.field6657.method2361(256)) {
                                this.field6657.method679(-90);
                                this.field6657 = null;
                            }
                        }
                        this.field6672 = new class114(this);
                        this.method2577(true);
                        this.method2594(true);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field6616.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (var15++ > 5) {
                                    throw new RuntimeException("");
                                }
                                class414.method2437(100L, (byte) -122);
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
            this.method1990();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "(I)V")
    public final void method1965(int arg0) {
        this.method2640(27575, 0);
        ++field6607;
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "()Z")
    public final boolean method1975() {
        ++field6579;
        return this.field6657 != null && this.field6657.method683(126);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(IIIIII)V")
    public final void method1918(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6570;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        this.method2578(-127);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method2640(27575, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field6724) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field6724) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1957(Rectangle[] arg0, int arg1) {
        ++field6483;
        this.method1915();
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZZ)V")
    public final void method2602(boolean arg0, boolean arg1) {
        if (!arg1 != !this.field6805) {
            if (!arg1) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field6783 &= -32;
            this.field6805 = arg1;
        }
        ++field6635;
        if (arg0) {
            this.method2642(66);
        }
    }

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "(I)V")
    public final void method2603(int arg0) {
        ++field6502;
        if (arg0 != 29960) {
            this.method1945();
        }
        OpenGL.glLightfv(16384, 4611, this.field6798, 0);
        OpenGL.glLightfv(16385, 4611, this.field6753, 0);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "()I")
    public final int method1890() {
        ++field6598;
        return this.field6799;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "([Lcd;Lql;[Lni;I)V")
    public final void method1978(class198[] arg0, class496 arg1, class346[] arg2, int arg3) {
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method461(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
        ++field6517;
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(IIIIII)Z")
    public final boolean method1923(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6555;
        float var7 = (float) arg2 * this.field6780.field467 + (float) arg0 * this.field6780.field477 + (float) arg1 * this.field6780.field472 + this.field6780.field456;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field6780.field467 + (float) arg3 * this.field6780.field477 + (float) arg4 * this.field6780.field472 + this.field6780.field456;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field6800 > var7) || !((float) this.field6800 > var8)) && (!(var7 > (float) this.field6799) || !((float) this.field6799 < var8))) {
            int var9 = (int) (((float) arg2 * this.field6780.field479 + (float) arg0 * this.field6780.field488 + (float) arg1 * this.field6780.field471 + this.field6780.field459) * (float) this.field6830 / var7);
            int var10 = (int) (((float) arg5 * this.field6780.field479 + (float) arg3 * this.field6780.field488 + (float) arg4 * this.field6780.field471 + this.field6780.field459) * (float) this.field6830 / var8);
            if (this.field6791 > (float) var9 && this.field6791 > (float) var10 || this.field6736 < (float) var9 && (float) var10 > this.field6736) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field6780.field476 + (float) arg0 * this.field6780.field475 + (float) arg1 * this.field6780.field478 + this.field6780.field473) * (float) this.field6738 / var7);
                int var12 = (int) (((float) arg5 * this.field6780.field476 + (float) arg3 * this.field6780.field475 + (float) arg4 * this.field6780.field478 + this.field6780.field473) * (float) this.field6738 / var8);
                return (!(this.field6810 > (float) var11) || !((float) var12 < this.field6810)) && (!((float) var11 > this.field6757) || !((float) var12 > this.field6757));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "()Z")
    public final boolean method1934() {
        ++field6641;
        return true;
    }

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "(B)V")
    private final void method2604(byte arg0) {
        ++field6588;
        this.field6780 = new class34();
        this.field6820 = new class34();
        this.field6795 = new class194[this.field6762];
        this.field6728 = new class262(this, 3553, 6408, 1, 1);
        this.field6731 = new class262(this, 3553, 6408, 1, 1);
        this.field6752 = new class262(this, 3553, 6408, 1, 1);
        this.field6733 = new class69(this);
        this.field6766 = new class69(this);
        this.field6784 = new class69(this);
        this.field6777 = new class69(this);
        this.field6714 = new class69(this);
        this.field6801 = new class69(this);
        if (arg0 != -18) {
            this.field6713 = true;
        }
        this.field6821 = new class69(this);
        this.field6804 = new class69(this);
        this.field6764 = new class69(this);
        this.field6775 = new class69(this);
        if (this.field6802) {
            this.field6742 = new class96(this);
            this.field6770 = new class96(this);
        }
    }

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "()Z")
    public final boolean method1942() {
        ++field6652;
        return this.field6672.method816((byte) 48, 3);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(IIII)V")
    public final void method1931(int arg0, int arg1, int arg2, int arg3) {
        this.field6830 = arg2;
        this.field6828 = arg0;
        ++field6617;
        this.field6754 = arg1;
        this.field6738 = arg3;
        this.method2615(-17411);
        this.method2607((byte) -33);
        if (this.field6786 != 3) {
            if (this.field6786 == 2) {
                this.method2656(25658);
                return;
            }
        } else {
            this.method2599((byte) 101);
        }
    }

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "(II)V")
    public final void method2605(int arg0, int arg1) {
        ++field6613;
        if (arg0 >= 124) {
            class96.field1738[3] = (float) (arg1 >>> 24) / 255.0F;
            class96.field1738[0] = (float) class330.method2050(16711680, arg1) / 1.671168E7F;
            class96.field1738[2] = (float) class330.method2050(arg1, 255) / 255.0F;
            class96.field1738[1] = (float) class330.method2050(arg1, 65280) / 65280.0F;
            OpenGL.glTexEnvfv(8960, 8705, class96.field1738, 0);
        }
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "()Z")
    public final boolean method1903() {
        ++field6636;
        return this.field6724 && (!this.method1975() || this.field6827);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lwr;IIII)Lcd;")
    public final class198 method1908(class303 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6568;
        return new class69(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "(IIIIII)V")
    public final void method1991(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6611;
        this.method2578(-113);
        this.method2640(27575, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "(I)Lsl;")
    public final class304 method2606(int arg0) {
        ++field6582;
        if (arg0 != 0) {
            this.field6699 = null;
        }
        return this.field6712 == null ? null : this.field6712.method423(37);
    }

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "(B)V")
    private final void method2607(byte arg0) {
        this.field6757 = (float) (-this.field6754 + this.field6710);
        if (arg0 != -33) {
            this.method1947(27, -77, -120);
        }
        this.field6736 = (float) (-this.field6828 + this.field6734);
        this.field6791 = (float) (-this.field6828 + this.field6735);
        ++field6558;
        this.field6810 = (float) (this.field6759 - this.field6754);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1904(Canvas arg0) {
        ++field6560;
        if (this.field6513 == arg0) {
            throw new RuntimeException();
        } else if (!this.field6532.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field6616.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field6532.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)I")
    public final int method1944(int arg0, int arg1) {
        ++field6610;
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILjava/awt/Canvas;Lvl;)Lqq;")
    public static final class318 method2608(int arg0, int arg1, Canvas arg2, class11 arg3) {
        ++field6519;
        if (arg0 != -7758) {
            field6681 = null;
        }
        return new class509(arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILbe;II)V")
    public final void method1994(int arg0, class28 arg1, int arg2, int arg3) {
        ++field6503;
        class475 var5 = (class475) arg1;
        class208 var6 = var5.field7249;
        this.method2580((byte) 77);
        this.method2586(var5.field7249, false);
        this.method2640(27575, 1);
        this.method2624((byte) 107, 8448, 7681);
        this.method2597(34167, (byte) -89, 768, 0);
        float var7 = var6.field3252 / (float) var6.field3255;
        float var8 = var6.field3254 / (float) var6.field3258;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field6735) * var7, (float) (-arg3 + this.field6759) * var8);
        OpenGL.glVertex2i(this.field6735, this.field6759);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field6735) * var7, (float) (-arg3 + this.field6710) * var8);
        OpenGL.glVertex2i(this.field6735, this.field6710);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field6734) * var7, (float) (-arg3 + this.field6710) * var8);
        OpenGL.glVertex2i(this.field6734, this.field6710);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field6734) * var7, (float) (-arg3 + this.field6759) * var8);
        OpenGL.glVertex2i(this.field6734, this.field6759);
        OpenGL.glEnd();
        this.method2597(5890, (byte) 98, 768, 0);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(ZZ)V")
    public final void method2609(boolean arg0, boolean arg1) {
        if (!arg1 == this.field6803) {
            this.field6803 = arg1;
            this.method2584((byte) 94);
            this.field6783 &= -32;
        }
        ++field6584;
        if (!arg0) {
            method2635((byte) -96, (class2) null);
        }
    }

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "(II)V")
    public final void method2610(int arg0, int arg1) {
        ++field6585;
        if (arg0 == 0) {
            if (~arg1 == -2) {
                this.method2624((byte) 107, 7681, 7681);
            } else if (~arg1 != -1) {
                if (arg1 == 2) {
                    this.method2624((byte) 107, 7681, 34165);
                } else {
                    if (arg1 != 3) {
                        if (arg1 == 4) {
                            this.method2624((byte) 107, 34023, 34023);
                            return;
                        }
                    } else {
                        this.method2624((byte) 107, 8448, 260);
                    }
                }
            } else {
                this.method2624((byte) 107, 8448, 8448);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "()Z")
    public final boolean method1926() {
        ++field6571;
        return false;
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1970(Canvas arg0) {
        ++field6644;
        if (this.field6513 == arg0) {
            throw new RuntimeException();
        } else if (this.field6532.containsKey(arg0)) {
            Long var2 = (Long) this.field6532.get(arg0);
            this.field6616.releaseSurface(arg0, var2);
            this.field6532.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "(I)V")
    public final void method2611(int arg0) {
        OpenGL.glPushMatrix();
        ++field6637;
        if (arg0 < 122) {
            this.field6800 = -56;
        }
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(IIIII)V")
    public final void method1963(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6650;
        this.method2578(-111);
        this.method2640(27575, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILop;)V")
    public final void method2612(int arg0, class118 arg1) {
        ++field6595;
        if (arg0 <= -26) {
            if (this.field6732) {
                this.method2592(arg1, 116);
                this.method2596(arg1, -4);
            } else if (~this.field6693 <= -4) {
                throw new RuntimeException();
            } else {
                if (this.field6693 >= 0) {
                    this.field6695[this.field6693].method735(3015);
                }
                this.field6698 = this.field6699 = this.field6695[++this.field6693] = arg1;
                this.field6698.method736(1354);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "([IIIII)Lig;")
    public final class154 method1924(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6537;
        return new class199(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "()I")
    public final int method1929() {
        ++field6515;
        int var1 = this.field6744;
        this.field6744 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILna;)V")
    public final void method2613(int arg0, class34 arg1) {
        OpenGL.glLoadMatrixf(arg1.method193(0), 0);
        ++field6627;
        if (arg0 != 1) {
            this.field6743 = true;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "([BIIZI)Leo;")
    public final class186 method2614(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field6572;
        if (!this.field6774 || arg3 && !this.field6792) {
            if (arg4 != -1) {
                this.field6816 = 0.9067043F;
            }
            return new class409(this, arg2, arg0, arg1);
        } else {
            return new class450(this, arg2, arg0, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "()Z")
    public final boolean method1962() {
        ++field6625;
        return true;
    }

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "(I)V")
    private final void method2615(int arg0) {
        ++field6675;
        float[] var2 = this.field6722;
        if (arg0 != -17411) {
            this.method1919(0, 3, (int[][]) null, (int[][]) null, 45, -97, 45);
        }
        float var3 = (float) (-this.field6828 * this.field6800) / (float) this.field6830;
        float var4 = (float) ((-this.field6828 + this.field6649) * this.field6800) / (float) this.field6830;
        float var5 = (float) (this.field6800 * this.field6754) / (float) this.field6738;
        float var6 = (float) ((-this.field6497 + this.field6754) * this.field6800) / (float) this.field6738;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field6800 * 2.0F;
            var2[4] = 0.0F;
            var2[10] = this.field6763 = (float) (-(this.field6800 + this.field6799)) / (float) (-this.field6800 + this.field6799);
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[15] = 0.0F;
            var2[7] = 0.0F;
            var2[5] = var7 / (-var6 + var5);
            var2[3] = 0.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[0] = var7 / (-var3 + var4);
            var2[14] = this.field6806 = -((float) this.field6799 * var7) / (float) (-this.field6800 + this.field6799);
            var2[12] = 0.0F;
            var2[1] = 0.0F;
            var2[2] = 0.0F;
            var2[13] = 0.0F;
            var2[6] = 0.0F;
            var2[11] = -1.0F;
        } else {
            var2[5] = 1.0F;
            var2[13] = 0.0F;
            var2[1] = 0.0F;
            var2[15] = 1.0F;
            var2[2] = 0.0F;
            var2[7] = 0.0F;
            var2[14] = 0.0F;
            var2[0] = 1.0F;
            var2[10] = 1.0F;
            var2[3] = 0.0F;
            var2[4] = 0.0F;
            var2[8] = 0.0F;
            var2[6] = 0.0F;
            var2[11] = 0.0F;
            var2[12] = 0.0F;
            var2[9] = 0.0F;
        }
        this.method2657(116);
    }

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "()V")
    public final void method1958() {
        ++field6645;
        this.field6779 = false;
        this.field6672.method814(false, false, false, 0);
        this.method2627(false);
        this.method2584((byte) 94);
    }

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "(I)V")
    public final void method1979(int arg0) {
        ++field6496;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "(B)V")
    private final void method2616(byte arg0) {
        OpenGL.glViewport(this.field6781, this.field6737, this.field6649, this.field6497);
        if (arg0 < -73) {
            ++field6551;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(Z)V")
    public final void method1895(boolean arg0) {
        ++field6542;
        this.field6718 = arg0;
        this.method2653((byte) 125);
    }

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "(IIII)V")
    public final void method1982(int arg0, int arg1, int arg2, int arg3) {
        ++field6576;
        if (~this.field6649 > ~arg2) {
            arg2 = this.field6649;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg3 > this.field6497) {
            arg3 = this.field6497;
        }
        this.field6735 = arg0;
        this.field6734 = arg2;
        this.field6759 = arg1;
        this.field6710 = arg3;
        OpenGL.glEnable(3089);
        this.method2607((byte) -33);
        this.method2623(false);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(III)V")
    public final synchronized void method2617(int arg0, int arg1, int arg2) {
        ++field6516;
        class361 var4 = new class361(arg1);
        var4.field2798 = (long) arg0;
        if (arg2 != 0) {
            this.method1975();
        }
        this.field6704.method4(1, var4);
    }

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "()V")
    public final void method1966() {
        this.field6759 = 0;
        this.field6734 = this.field6649;
        this.field6710 = this.field6497;
        this.field6735 = 0;
        ++field6538;
        OpenGL.glDisable(3089);
        this.method2607((byte) -33);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZLeo;)V")
    public final void method2618(boolean arg0, class186 arg1) {
        if (!arg0) {
            ++field6510;
            if (this.field6829 != arg1) {
                if (this.field6774) {
                    OpenGL.glBindBufferARB(34962, arg1.method1155(true));
                }
                this.field6829 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(Lop;I)V")
    public final void method2619(class118 arg0, int arg1) {
        ++field6599;
        if (this.field6697 >= 0 && this.field6694[this.field6697] == arg0) {
            if (arg1 != 25087) {
                this.method2607((byte) 61);
            }
            this.field6694[this.field6697--] = null;
            arg0.method723((byte) -104);
            if (~this.field6697 > -1) {
                this.field6698 = null;
            } else {
                this.field6698 = this.field6694[this.field6697];
                this.field6698.method726(-27445);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(FIFF)V")
    private final void method2620(float arg0, int arg1, float arg2, float arg3) {
        OpenGL.glMatrixMode(5890);
        if (arg1 != -2116) {
            this.method1953();
        }
        ++field6586;
        if (this.field6787) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg0, arg3, arg2);
        OpenGL.glMatrixMode(5888);
        this.field6787 = true;
    }

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "(B)V")
    private final void method2621(byte arg0) {
        if (arg0 == 123) {
            ++field6678;
            int var2 = 0;
            while (!this.field6616.attach()) {
                if (var2++ > 5) {
                    throw new RuntimeException("");
                }
                class414.method2437(1000L, (byte) -122);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "(B)V")
    public final void method2622(byte arg0) {
        if (arg0 == 34) {
            ++field6633;
            if (this.field6783 != 16) {
                this.method2630(false);
                this.method2609(true, true);
                this.method2602(false, true);
                this.method2598(30674, true);
                this.method2640(27575, 1);
                this.method2610(0, 0);
                this.field6783 = 16;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "(IIII)V")
    public final void method1987(int arg0, int arg1, int arg2, int arg3) {
        this.field6671.method49(false, arg2, arg0, arg1, arg3);
        ++field6606;
    }

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "(Z)V")
    private final void method2623(boolean arg0) {
        ++field6592;
        if (this.field6734 >= this.field6735 && ~this.field6710 <= ~this.field6759) {
            OpenGL.glScissor(this.field6781 + this.field6735, this.field6737 - -this.field6497 + -this.field6710, this.field6734 - this.field6735, -this.field6759 + this.field6710);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        if (arg0) {
            this.field6769 = 114;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(BII)V")
    public final void method2624(byte arg0, int arg1, int arg2) {
        if (arg0 != 107) {
            this.method2645(-109);
        }
        if (this.field6814 != 0) {
            OpenGL.glTexEnvi(8960, 34161, arg2);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        } else {
            boolean var4 = false;
            if (this.field6740 != arg2) {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                var4 = true;
                this.field6740 = arg2;
            }
            if (this.field6813 != arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                this.field6813 = arg1;
                var4 = true;
            }
            if (var4) {
                this.field6783 &= -30;
            }
        }
        ++field6525;
    }

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "(II)I")
    public final int method2625(int arg0, int arg1) {
        ++field6501;
        if (~arg1 != -2) {
            if (arg1 != 0) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            return 34023;
                        } else {
                            if (arg0 < 101) {
                                this.field6680 = null;
                            }
                            throw new IllegalArgumentException();
                        }
                    } else {
                        return 260;
                    }
                } else {
                    return 34165;
                }
            } else {
                return 8448;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(IIII)V")
    public final void method1948(int arg0, int arg1, int arg2, int arg3) {
        if (~arg1 < ~this.field6759) {
            this.field6759 = arg1;
        }
        ++field6604;
        if (~arg0 < ~this.field6735) {
            this.field6735 = arg0;
        }
        if (this.field6734 > arg2) {
            this.field6734 = arg2;
        }
        if (this.field6710 > arg3) {
            this.field6710 = arg3;
        }
        OpenGL.glEnable(3089);
        this.method2607((byte) -33);
        this.method2623(false);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lii;)V")
    public final void method1900(class372 arg0) {
        ++field6512;
        this.field6670.method1487((byte) -60, arg0, this);
    }

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "()Z")
    public final boolean method1981() {
        ++field6639;
        return true;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILjaggl/memory/NativeBuffer;ZII)Leo;")
    public final class186 method2626(int arg0, NativeBuffer arg1, boolean arg2, int arg3, int arg4) {
        ++field6482;
        if (!this.field6774 || arg2 && !this.field6792) {
            if (arg0 > -92) {
                this.field6751 = true;
            }
            return new class409(this, arg4, arg1);
        } else {
            return new class450(this, arg4, arg1, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "(Z)V")
    private final void method2627(boolean arg0) {
        if (arg0) {
            this.method1993(-0.50439656F, 0.04348393F);
        }
        ++field6661;
        int var2;
        if (!this.field6779) {
            this.field6726 = (float) (this.field6799 - this.field6785) + -this.field6723;
            this.field6746 = this.field6726 - (float) this.field6812 * this.field6797;
            if (this.field6746 < (float) this.field6800) {
                this.field6746 = (float) this.field6800;
            }
            OpenGL.glFogf(2915, this.field6746);
            OpenGL.glFogf(2916, this.field6726);
            var2 = this.field6817;
        } else {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field6730;
        }
        class96.field1738[1] = (float) class330.method2050(65280, var2) / 65280.0F;
        class96.field1738[2] = (float) class330.method2050(255, var2) / 255.0F;
        class96.field1738[0] = (float) class330.method2050(16711680, var2) / 1.671168E7F;
        OpenGL.glFogfv(2918, class96.field1738, 0);
        if (this.field6779) {
            this.field6672.field1928.method676((byte) -97);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(FI)V")
    public final void method2628(float arg0, int arg1) {
        if (this.field6767 != arg0) {
            this.field6767 = arg0;
            if (~this.field6786 == -4) {
                this.method2599((byte) -75);
            }
        }
        if (arg1 != -8600) {
            this.method2594(true);
        }
        ++field6642;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "([I)V")
    public final void method1936(int[] arg0) {
        arg0[2] = this.field6734;
        ++field6504;
        arg0[1] = this.field6759;
        arg0[3] = this.field6710;
        arg0[0] = this.field6735;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lod;ILqq;ILgf;I)Z")
    public static final boolean method2629(class334 arg0, int arg1, class318 arg2, int arg3, class173 arg4, int arg5) {
        ++field6548;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg5 != 28531) {
            return false;
        } else {
            if (arg4.field2670 != null) {
                var7 = (-class492.field7486 + arg0.field4980 + arg4.field2675) * (-class492.field7483 + class492.field7501) / (class492.field7498 - class492.field7486) + class492.field7483;
                var6 = (-class492.field7486 + arg0.field4980 + arg4.field2667) * (-class492.field7483 + class492.field7501) / (class492.field7498 - class492.field7486) + class492.field7483;
                var9 = -((class492.field7496 - class492.field7495) * (-class492.field7504 + arg4.field2679 + arg0.field4989) / (-class492.field7504 + class492.field7484)) + class492.field7496;
                var8 = class492.field7496 - (class492.field7496 - class492.field7495) * (arg0.field4989 - class492.field7504 + arg4.field2697) / (-class492.field7504 + class492.field7484);
            }
            class154 var10 = null;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            if (~arg4.field2689 != 0) {
                if (arg0.field4984 && arg4.field2671 != -1) {
                    var10 = arg4.method1083(arg2, true, 1477);
                } else {
                    var10 = arg4.method1083(arg2, false, 1477);
                }
                if (var10 != null) {
                    var11 = arg0.field4983 + -(var10.method988() - -1 >> 1);
                    if (~var11 > ~var6) {
                        var6 = var11;
                    }
                    var12 = arg0.field4983 - -(var10.method988() - -1 >> 1);
                    var13 = arg0.field4993 - (1 + var10.method989() >> 1);
                    if (~var12 < ~var7) {
                        var7 = var12;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    var14 = arg0.field4993 + (var10.method989() - -1 >> 1);
                    if (~var9 > ~var14) {
                        var9 = var14;
                    }
                }
            }
            class235 var15 = null;
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            int var19 = 0;
            int var20 = 0;
            int var21 = 0;
            int var22 = 0;
            if (arg4.field2702 != null) {
                var15 = class177.method1113(arg4.field2701, 111);
                if (var15 != null) {
                    var16 = class121.field2015.method2355(class481.field7349, (byte) 108, (int[]) null, arg4.field2702, (class154[]) null);
                    int var23 = arg0.field4993;
                    if (var10 != null) {
                        var17 = var23 - ((var10.method989() >> 1) - -(var15.method1417() * var16));
                    } else {
                        var17 = var23 - var16 * var15.method1413() / 2;
                    }
                    for (int var24 = 0; ~var16 < ~var24; ++var24) {
                        String var25 = class481.field7349[var24];
                        if (var24 < var16 - 1) {
                            var25 = var25.substring(0, -4 + var25.length());
                        }
                        int var26 = var15.method1415(var25);
                        if (~var18 > ~var26) {
                            var18 = var26;
                        }
                    }
                    var19 = -(var18 / 2) + arg0.field4983 + arg1;
                    var20 = arg0.field4983 - -(var18 / 2) + arg1;
                    if (~var6 < ~var19) {
                        var6 = var19;
                    }
                    if (~var20 < ~var7) {
                        var7 = var20;
                    }
                    var21 = arg3 + var17;
                    var22 = var17 - (-(var16 * var15.method1417()) + -arg3);
                    if (var21 < var8) {
                        var8 = var21;
                    }
                    if (var9 < var22) {
                        var9 = var22;
                    }
                }
            }
            if (~class492.field7483 >= ~var7 && class492.field7501 >= var6 && class492.field7495 <= var9 && class492.field7496 >= var8) {
                if (arg4.field2670 != null) {
                    int[] var27 = new int[arg4.field2670.length];
                    for (int var28 = 0; ~var28 > ~(var27.length / 2); ++var28) {
                        int var30 = arg4.field2670[var28 * 2] + arg0.field4980;
                        int var31 = arg4.field2670[var28 * 2 - -1] + arg0.field4989;
                        var27[var28 * 2] = (class492.field7501 - class492.field7483) * (-class492.field7486 + var30) / (-class492.field7486 + class492.field7498) + class492.field7483;
                        var27[var28 * 2 - -1] = -((-class492.field7504 + var31) * (-class492.field7495 + class492.field7496) / (-class492.field7504 + class492.field7484)) + class492.field7496;
                    }
                    class5.method21(arg2, var27, arg4.field2680);
                    for (int var29 = 0; var29 < var27.length / 2 - 1; ++var29) {
                        arg2.method1935(var27[var29 * 2 + 1], var27[var29 * 2 + 2], 1, var27[(var29 - -1) * 2 - -1], arg4.field2668, var27[var29 * 2]);
                    }
                    arg2.method1935(var27[var27.length + -1], var27[0], 1, var27[1], arg4.field2668, var27[var27.length + -2]);
                }
                if (var10 != null) {
                    if (~class273.field4150 < -1 && (class28.field358 != -1 && ~class28.field358 == ~arg0.field4985 || class462.field7107 != -1 && class462.field7107 == arg4.field2684)) {
                        int var32;
                        if (class102.field1822 > 50) {
                            var32 = 200 - class102.field1822 * 2;
                        } else {
                            var32 = class102.field1822 * 2;
                        }
                        int var33 = 16776960 | var32 << 24;
                        arg2.method1938((byte) -77, arg0.field4983, 7 + var10.method1001() / 2, var33, arg0.field4993);
                        arg2.method1938((byte) -77, arg0.field4983, var10.method1001() / 2 + 5, var33, arg0.field4993);
                        arg2.method1938((byte) -77, arg0.field4983, var10.method1001() / 2 + 3, var33, arg0.field4993);
                        arg2.method1938((byte) -77, arg0.field4983, var10.method1001() / 2 + 1, var33, arg0.field4993);
                        arg2.method1938((byte) -77, arg0.field4983, var10.method1001() / 2, var33, arg0.field4993);
                    }
                    var10.method994(arg0.field4983 + -(var10.method988() >> 1), arg0.field4993 + -(var10.method989() >> 1));
                }
                if (arg4.field2702 != null && var15 != null) {
                    class227.method1370(var17, arg0, var16, var18, arg2, var15, arg4, true);
                }
                if (arg4.field2689 != -1 || arg4.field2702 != null) {
                    class25 var34 = new class25(arg0);
                    var34.field336 = var11;
                    var34.field330 = var19;
                    var34.field333 = var21;
                    var34.field329 = var13;
                    var34.field337 = var20;
                    var34.field322 = var22;
                    var34.field324 = var14;
                    var34.field334 = var12;
                    class177.field2772.method4(1, var34);
                }
                return false;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "([Lcd;Lii;Lql;[Lni;I)V")
    public final void method1913(class198[] arg0, class372 arg1, class496 arg2, class346[] arg3, int arg4) {
        ++field6578;
        this.method1978(arg0, arg2, arg3, arg4);
        this.method1900(arg1);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lcd;Lii;Lql;Lni;I)V")
    public final void method1983(class198 arg0, class372 arg1, class496 arg2, class346 arg3, int arg4) {
        arg0.method461(arg2, arg3, arg4);
        ++field6666;
        this.method1900(arg1);
    }

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "(Z)V")
    private final void method2630(boolean arg0) {
        if (this.field6786 != 3) {
            this.field6786 = 3;
            this.method2599((byte) -115);
            this.method2644(65280);
            this.field6783 &= -8;
        }
        if (arg0) {
            this.field6816 = -1.4808784F;
        }
        ++field6563;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIZ)V")
    public final synchronized void method2631(int arg0, int arg1, boolean arg2) {
        ++field6481;
        class361 var4 = new class361(arg1);
        if (!arg2) {
            var4.field2798 = (long) arg0;
            this.field6707.method4(1, var4);
        }
    }

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "(II)V")
    public final synchronized void method2632(int arg0, int arg1) {
        ++field6615;
        class179 var3 = new class179();
        if (arg0 <= 73) {
            this.method1899(-6, 70, -37, 61);
        }
        var3.field2798 = (long) arg1;
        this.field6708.method4(1, var3);
    }

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "(I)V")
    public final void method2633(int arg0) {
        if (this.field6783 != 4) {
            this.method2654((byte) 71);
            this.method2609(true, false);
            this.method2600((byte) -108, false);
            this.method2602(false, false);
            this.method2598(30674, false);
            this.method2650((byte) -74, -2);
            this.method2640(27575, 1);
            this.method2610(0, 0);
            this.field6783 = 4;
        }
        int var2 = 22 / ((arg0 - 55) / 50);
        ++field6530;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "()Z")
    public final boolean method1893() {
        ++field6492;
        return true;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lna;I)V")
    public final void method2634(class34 arg0, int arg1) {
        ++field6498;
        if (arg1 <= 126) {
            this.method2614((byte[]) null, 124, -61, true, 60);
        }
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg0.method193(0), 0);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLro;)Ljava/lang/String;")
    public static final String method2635(byte arg0, class2 arg1) {
        if (arg0 != 92) {
            return null;
        } else {
            ++field6536;
            return arg1.field16 != null && ~arg1.field16.length() < -1 ? arg1.field9 + class467.field7159.method2473(class406.field5898, -128) + arg1.field16 : arg1.field9;
        }
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(IIII)V")
    public final void method1977(int arg0, int arg1, int arg2, int arg3) {
        ++field6651;
        if (!this.field6779) {
            throw new RuntimeException("");
        } else {
            this.field6796 = arg3;
            this.field6730 = arg1;
            this.field6823 = arg2;
            this.field6761 = arg0;
            this.field6672.field1928.method674(92);
            this.method2627(false);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I[Lki;)V")
    public final void method1916(int arg0, class480[] arg1) {
        for (int var3 = 0; ~var3 > ~arg0; ++var3) {
            this.field6773[var3] = arg1[var3];
        }
        ++field6520;
        this.field6716 = arg0;
        if (this.field6786 != 1) {
            this.method2659((byte) 105);
        }
    }

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "()V")
    public final void method1915() {
        try {
            this.field6616.swapBuffers();
        } catch (Exception var1) {
        }
        ++field6550;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(FIFFF)V")
    public final void method2636(float arg0, int arg1, float arg2, float arg3, float arg4) {
        class96.field1738[3] = arg4;
        class96.field1738[2] = arg2;
        class96.field1738[1] = arg0;
        int var6 = 47 / ((arg1 - 47) / 47);
        class96.field1738[0] = arg3;
        ++field6557;
        OpenGL.glTexEnvfv(8960, 8705, class96.field1738, 0);
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)V")
    public final void method1910(int arg0) {
        this.method2647(-31446);
        ++field6619;
    }

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "()V")
    public final void method1964() {
        this.method2598(30674, true);
        ++field6553;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)V")
    public final void method1912(int arg0) {
        ++field6535;
        if (arg0 >= 128 && arg0 <= 1024) {
            this.field6664 = arg0;
            this.field6673.method515(-1);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V")
    public final void method1891(int arg0, int arg1) {
        ++field6623;
        if (this.field6800 != arg0 || ~this.field6799 != ~arg1) {
            this.field6799 = arg1;
            this.field6800 = arg0;
            this.method2615(-17411);
            this.method2627(false);
            if (~this.field6786 == -4) {
                this.method2599((byte) 125);
                return;
            }
            if (this.field6786 != 2) {
                return;
            }
            this.method2656(25658);
        }
    }

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "(IIIIII)V")
    public final void method1971(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6506;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method2578(-121);
        this.method2640(27575, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field6724) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field6724) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lpm;[Lfd;Z)Lwn;")
    public final class488 method1888(class396 arg0, class351[] arg1, boolean arg2) {
        ++field6674;
        return new class89(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lpt;)V")
    public final void method1961(class353 arg0) {
        ++field6549;
        this.field6690 = ((class225) arg0).field3458;
        if (this.field6822 == null) {
            class315 var2 = new class315(80);
            if (this.field6745) {
                var2.method1878((byte) -112, -1.0F);
                var2.method1878((byte) -106, -1.0F);
                var2.method1878((byte) 127, 0.0F);
                var2.method1878((byte) 33, 0.0F);
                var2.method1878((byte) -116, 1.0F);
                var2.method1878((byte) 61, 1.0F);
                var2.method1878((byte) 65, -1.0F);
                var2.method1878((byte) -107, 0.0F);
                var2.method1878((byte) -85, 1.0F);
                var2.method1878((byte) 79, 1.0F);
                var2.method1878((byte) -107, 1.0F);
                var2.method1878((byte) -106, 1.0F);
                var2.method1878((byte) -122, 0.0F);
                var2.method1878((byte) -123, 1.0F);
                var2.method1878((byte) 99, 0.0F);
                var2.method1878((byte) 119, -1.0F);
                var2.method1878((byte) -100, 1.0F);
                var2.method1878((byte) 27, 0.0F);
                var2.method1878((byte) 108, 0.0F);
                var2.method1878((byte) -109, 0.0F);
            } else {
                var2.method1881((byte) -40, -1.0F);
                var2.method1881((byte) -40, -1.0F);
                var2.method1881((byte) -40, 0.0F);
                var2.method1881((byte) -40, 0.0F);
                var2.method1881((byte) -40, 1.0F);
                var2.method1881((byte) -40, 1.0F);
                var2.method1881((byte) -40, -1.0F);
                var2.method1881((byte) -40, 0.0F);
                var2.method1881((byte) -40, 1.0F);
                var2.method1881((byte) -40, 1.0F);
                var2.method1881((byte) -40, 1.0F);
                var2.method1881((byte) -40, 1.0F);
                var2.method1881((byte) -40, 0.0F);
                var2.method1881((byte) -40, 1.0F);
                var2.method1881((byte) -40, 0.0F);
                var2.method1881((byte) -40, -1.0F);
                var2.method1881((byte) -40, 1.0F);
                var2.method1881((byte) -40, 0.0F);
                var2.method1881((byte) -40, 0.0F);
                var2.method1881((byte) -40, 0.0F);
            }
            this.field6822 = this.method2614(var2.field536, var2.field585, 20, false, -1);
            this.field6788 = new class400(this, this.field6822, 5126, 3, 0);
            this.field6747 = new class400(this, this.field6822, 5126, 2, 12);
            this.field6670.method1484(this, (byte) -47);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZIZI)V")
    public final void method2637(boolean arg0, int arg1, boolean arg2, int arg3) {
        ++field6505;
        if (~this.field6769 != ~arg3) {
            if (~arg3 > -1) {
                this.method2642(1);
                this.method2586((class194) null, false);
                this.method2610(0, 0);
                if (!this.field6779) {
                    this.field6672.method814(false, arg0, arg2, 0);
                }
            } else {
                class262 var5 = this.field6673.method513(arg3, 0);
                class48 var6 = super.field4784.method59(arg3, 21645);
                if (var6.field740 == 0 && var6.field744 == 0) {
                    this.method2642(1);
                } else {
                    int var7 = var6.field735 ? 64 : 128;
                    int var8 = var7 * 50;
                    this.method2620((float) (this.field6691 % var8 * var6.field740) / (float) var8, -2116, 0.0F, (float) (this.field6691 % var8 * var6.field744) / (float) var8);
                }
                if (!this.field6779) {
                    this.field6672.method814(false, arg0, arg2, var6.field728);
                    this.field6672.method813(2, var6.field742, var6.field732);
                    if (!this.field6672.method819(var6.field738, 105, var5)) {
                        this.method2586(var5, false);
                        this.method2610(0, var6.field738);
                    }
                } else {
                    this.field6672.method814(false, arg0, arg2, 3);
                    this.method2586(var5, false);
                    this.method2610(arg1 ^ -15340, var6.field738);
                }
            }
            this.field6769 = arg3;
        }
        if (arg1 == -15340) {
            this.field6783 &= -8;
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(IIIII)V")
    public final void method1959(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2578(-125);
        ++field6490;
        this.method2640(27575, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(BII)V")
    public final void method2638(byte arg0, int arg1, int arg2) {
        ++field6534;
        this.field6781 = arg1;
        this.field6737 = arg2;
        if (arg0 > 60) {
            this.method2616((byte) -109);
            this.method2623(false);
        }
    }

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "(Z)V")
    private final void method2639(boolean arg0) {
        class96.field1738[3] = 1.0F;
        class96.field1738[2] = this.field6768 * this.field6758;
        ++field6533;
        class96.field1738[1] = this.field6758 * this.field6715;
        class96.field1738[0] = this.field6811 * this.field6758;
        OpenGL.glLightfv(16384, 4609, class96.field1738, 0);
        class96.field1738[3] = 1.0F;
        class96.field1738[1] = -this.field6721 * this.field6715;
        class96.field1738[0] = -this.field6721 * this.field6811;
        class96.field1738[2] = -this.field6721 * this.field6768;
        if (!arg0) {
            this.field6824 = null;
        }
        OpenGL.glLightfv(16385, 4609, class96.field1738, 0);
    }

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "(II)V")
    public final void method2640(int arg0, int arg1) {
        if (this.field6789 != arg1) {
            byte var3;
            boolean var4;
            boolean var5;
            if (arg1 != 1) {
                if (arg1 == 2) {
                    var3 = 2;
                    var4 = true;
                    var5 = false;
                } else if (arg1 != 128) {
                    var4 = true;
                    var5 = false;
                    var3 = 0;
                } else {
                    var4 = true;
                    var5 = true;
                    var3 = 3;
                }
            } else {
                var5 = true;
                var4 = true;
                var3 = 1;
            }
            if (this.field6719 != var4) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field6719 = var4;
            }
            if (!this.field6739 == var5) {
                if (var5) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field6739 = var5;
            }
            if (~this.field6711 != ~var3) {
                if (~var3 != -2) {
                    if (var3 != 2) {
                        if (~var3 == -4) {
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
                this.field6711 = var3;
            }
            this.field6789 = arg1;
            this.field6783 &= -29;
        }
        if (arg0 == 27575) {
            ++field6630;
        }
    }

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "(II)V")
    public final synchronized void method2641(int arg0, int arg1) {
        ++field6631;
        if (arg0 == -15966) {
            class361 var3 = new class361(arg1);
            this.field6706.method4(1, var3);
        }
    }

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "(I)V")
    private final void method2642(int arg0) {
        ++field6596;
        if (arg0 == 1) {
            if (this.field6787) {
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5888);
                this.field6787 = false;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZIB)V")
    public final void method2643(boolean arg0, int arg1, byte arg2) {
        this.method2637(true, -15340, arg0, arg1);
        ++field6594;
        if (arg2 > -88) {
            this.field6689 = false;
        }
    }

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "(I)V")
    private final void method2644(int arg0) {
        OpenGL.glLoadIdentity();
        ++field6552;
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field6780.method193(0), 0);
        if (this.field6779) {
            this.field6672.field1928.method674(-25);
        }
        this.method2603(29960);
        this.method2659((byte) 80);
        if (arg0 != 65280) {
            this.method2630(false);
        }
    }

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "()V")
    public final void method1992() {
        if (this.field6657 != null && this.field6657.method683(127)) {
            this.field6671.method43((byte) -101, this.field6657);
            this.field6673.method515(-1);
        }
        ++field6593;
    }

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "(I)V")
    public final void method2645(int arg0) {
        ++field6527;
        if (arg0 != 4353) {
            this.method1956(-30);
        }
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIII)Llf;")
    public final class151 method1898(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6667;
        return !this.field6819 ? null : new class60(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(III[I)V")
    public final void method1932(int arg0, int arg1, int arg2, int[] arg3) {
        ++field6495;
        float var5 = (float) arg2 * this.field6780.field467 + (float) arg0 * this.field6780.field477 + (float) arg1 * this.field6780.field472 + this.field6780.field456;
        if (!(var5 < (float) this.field6800) && !(var5 > (float) this.field6799)) {
            int var6 = (int) (((float) arg2 * this.field6780.field479 + (float) arg0 * this.field6780.field488 + (float) arg1 * this.field6780.field471 + this.field6780.field459) * (float) this.field6830 / var5);
            int var7 = (int) (((float) arg2 * this.field6780.field476 + (float) arg0 * this.field6780.field475 + (float) arg1 * this.field6780.field478 + this.field6780.field473) * (float) this.field6738 / var5);
            if (this.field6791 <= (float) var6 && this.field6736 >= (float) var6 && this.field6810 <= (float) var7 && (float) var7 <= this.field6757) {
                arg3[1] = (int) ((float) var7 - this.field6810);
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 + -this.field6791);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(Z)V")
    public final void method1917(boolean arg0) {
        ++field6499;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field6626;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lot;Lot;ILot;Lot;)V")
    public final void method2646(class400 arg0, class400 arg1, int arg2, class400 arg3, class400 arg4) {
        if (arg4 != null) {
            this.method2618(false, arg4.field5831);
            OpenGL.glVertexPointer(arg4.field5833, arg4.field5824, this.field6829.method1154((byte) 22), this.field6829.method1156(14522) + (long) arg4.field5828);
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        ++field6486;
        if (arg2 == -19887) {
            if (arg0 != null) {
                this.method2618(false, arg0.field5831);
                OpenGL.glNormalPointer(arg0.field5824, this.field6829.method1154((byte) 22), this.field6829.method1156(arg2 + 34409) - -((long) arg0.field5828));
                OpenGL.glEnableClientState(32885);
            } else {
                OpenGL.glDisableClientState(32885);
            }
            if (arg3 == null) {
                OpenGL.glDisableClientState(32886);
            } else {
                this.method2618(false, arg3.field5831);
                OpenGL.glColorPointer(arg3.field5833, arg3.field5824, this.field6829.method1154((byte) 22), this.field6829.method1156(14522) - -((long) arg3.field5828));
                OpenGL.glEnableClientState(32886);
            }
            if (arg1 != null) {
                this.method2618(false, arg1.field5831);
                OpenGL.glTexCoordPointer(arg1.field5833, arg1.field5824, this.field6829.method1154((byte) 22), this.field6829.method1156(arg2 + 34409) - -((long) arg1.field5828));
                OpenGL.glEnableClientState(32888);
            } else {
                OpenGL.glDisableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "(I)V")
    private final void method2647(int arg0) {
        if (arg0 != -31446) {
            this.field6818 = null;
        }
        this.field6616.detach();
        ++field6614;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lql;)V")
    public final void method1921(class496 arg0) {
        this.field6780 = (class34) arg0;
        ++field6669;
        this.field6820.method189(this.field6780, -30919);
        if (this.field6786 != 1) {
            this.method2644(65280);
        }
    }

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "(I)I")
    private final int method2648(int arg0) {
        ++field6621;
        int var2 = 0;
        this.field6765 = OpenGL.glGetString(7936).toLowerCase();
        this.field6750 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field6765.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field6765.indexOf("brian paul") != -1 || this.field6765.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class499.method3003(' ', arg0, var3.replace('.', ' '));
        if (~var4.length <= -3) {
            try {
                int var5 = class218.method1335(var4[0], 10);
                int var6 = class218.method1335(var4[1], 10);
                this.field6794 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (this.field6794 < 12) {
            var2 |= 2;
        }
        if (!this.field6616.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field6616.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field6762 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field6771 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field6749 = var7[0];
        if (~this.field6762 > -3 || ~this.field6771 > -3 || this.field6749 < 2) {
            var2 |= 16;
        }
        this.field6745 = NativeStream.method2483();
        this.field6616.arePbuffersAvailable();
        this.field6774 = this.field6616.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field6724 = this.field6616.isExtensionAvailable("GL_ARB_multisample");
        this.field6717 = this.field6616.isExtensionAvailable("GL_ARB_vertex_program");
        this.field6616.isExtensionAvailable("GL_ARB_fragment_program");
        this.field6741 = this.field6616.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field6720 = this.field6616.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field6809 = this.field6616.isExtensionAvailable("GL_EXT_texture3D");
        this.field6713 = this.field6616.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field6819 = this.field6616.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field6815 = this.field6616.isExtensionAvailable("GL_ARB_texture_float");
        this.field6727 = false;
        this.field6802 = this.field6616.isExtensionAvailable("GL_EXT_framebuffer_object");
        this.field6732 = this.field6616.isExtensionAvailable("GL_EXT_framebuffer_blit");
        this.field6751 = this.field6616.isExtensionAvailable("GL_EXT_framebuffer_multisample");
        this.field6827 = this.field6732 & this.field6751;
        return var2 != 0 ? var2 : 0;
    }

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "(II)I")
    public final int method2649(int arg0, int arg1) {
        if (arg0 != -3767) {
            this.field6796 = -44;
        }
        ++field6628;
        if (arg1 != 5121 && arg1 != 5120) {
            if (arg1 != 5123 && arg1 != 5122) {
                if (~arg1 != -5126 && arg1 != 5124 && arg1 != 5126) {
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

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "()V")
    public final void method1909() {
        ++field6574;
        if (this.field6772 && this.field6649 > 0 && this.field6497 > 0) {
            int var1 = this.field6735;
            int var2 = this.field6734;
            int var3 = this.field6759;
            int var4 = this.field6710;
            this.method1966();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2588((byte) 60);
            this.method2609(true, false);
            this.method2600((byte) 117, false);
            this.method2602(false, false);
            this.method2598(30674, false);
            this.method2586((class194) null, false);
            this.method2650((byte) -101, -2);
            this.method2610(0, 1);
            this.method2640(27575, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field6649, this.field6497, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method1982(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(BI)V")
    public final void method2650(byte arg0, int arg1) {
        this.method2643(true, arg1, (byte) -126);
        ++field6660;
        if (arg0 > -70) {
            this.method2641(-114, -44);
        }
    }

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "(B)V")
    private final void method2651(byte arg0) {
        if (arg0 > 54) {
            if (this.field6725 && !this.field6743) {
                OpenGL.glEnable(2896);
            } else {
                OpenGL.glDisable(2896);
            }
            ++field6640;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(FF)V")
    public final void method1993(float arg0, float arg1) {
        ++field6487;
        if (this.field6782 != arg0 || this.field6808 != arg1) {
            this.field6782 = arg0;
            this.field6808 = arg1;
            this.method2657(117);
            if (~this.field6786 != -4) {
                if (this.field6786 == 2) {
                    this.method2656(25658);
                    return;
                }
            } else {
                this.method2599((byte) 91);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "()Z")
    public final boolean method1953() {
        ++field6559;
        return true;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(IBII)V")
    public final void method2652(int arg0, byte arg1, int arg2, int arg3) {
        ++field6575;
        OpenGL.glDrawArrays(arg0, arg3, arg2);
        if (arg1 >= -55) {
            this.method1940(51, -62, -35, 0);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Llf;)V")
    public final void method1914(class151 arg0) {
        ++field6507;
        this.field6712 = (class77) arg0;
    }

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "()Z")
    public final boolean method1988() {
        ++field6643;
        return true;
    }

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "(B)V")
    private final void method2653(byte arg0) {
        OpenGL.glDepthMask(this.field6755 && this.field6718);
        if (arg0 == 125) {
            ++field6494;
        }
    }

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "(B)V")
    private final void method2654(byte arg0) {
        ++field6605;
        if (~this.field6786 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field6649 < -1 && ~this.field6497 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field6649, (double) this.field6497, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field6786 = 1;
            this.field6783 &= -25;
        }
        int var2 = 118 / (arg0 / 58);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(IZ)V")
    public final void method2655(int arg0, boolean arg1) {
        if (arg0 != -1001) {
            this.method1934();
        }
        if (this.field6743 == !arg1) {
            this.field6743 = arg1;
            this.method2651((byte) 106);
        }
        ++field6567;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(F)V")
    public final void method1995(float arg0) {
        ++field6622;
        if (this.field6756 != arg0) {
            this.field6756 = arg0;
            this.method2585((byte) -97);
        }
    }

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "()F")
    public final float method1984() {
        ++field6591;
        return this.field6782;
    }

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "()Lql;")
    public final class496 method1976() {
        ++field6658;
        return this.field6680;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)[I")
    public final int[] method1899(int arg0, int arg1, int arg2, int arg3) {
        ++field6653;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; arg3 > var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, this.field6497 - arg1 + -var6, arg2, 1, 32993, this.field6807, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II[I[I)Lbe;")
    public final class28 method1927(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field6668;
        return class87.method614(0, this, arg0, arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "(I)V")
    private final void method2656(int arg0) {
        OpenGL.glMatrixMode(5889);
        if (arg0 != 25658) {
            this.field6672 = null;
        }
        ++field6573;
        OpenGL.glLoadMatrixf(this.field6722, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "(I)V")
    private final void method2657(int arg0) {
        ++field6528;
        if (this.field6808 != 0.0F) {
            float var2 = this.field6782 / (this.field6808 + this.field6782);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field6806 * (-var2 + 1.0F) / this.field6808;
            this.field6722[10] = this.field6763 + var4;
            this.field6722[14] = this.field6806 * var3;
        } else {
            this.field6722[10] = this.field6763;
            this.field6722[14] = this.field6806;
        }
        int var5 = 36 / ((arg0 - 56) / 46);
        this.field6816 = (float) this.field6799 - this.field6808;
        this.field6760 = (this.field6722[14] - (float) this.field6799) / this.field6722[10];
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "()Z")
    public final boolean method1905() {
        ++field6541;
        return false;
    }

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "()V")
    public final void method1954() {
        ++field6523;
        this.field6671.method47(-4223);
    }

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "(I)V")
    public static void method2658(int arg0) {
        field6681 = null;
        field6679 = null;
        if (arg0 == 0) {
            field6683 = null;
            field6655 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "(B)V")
    private final void method2659(byte arg0) {
        ++field6601;
        int var2;
        for (var2 = 0; this.field6716 > var2; ++var2) {
            class480 var3 = this.field6773[var2];
            int var4 = var2 + 16386;
            class22.field278[0] = (float) var3.method2895(0);
            class22.field278[1] = (float) var3.method2901(-24962);
            class22.field278[2] = (float) var3.method2900((byte) -31);
            class22.field278[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class22.field278, 0);
            int var5 = var3.method2902((byte) -46);
            float var6 = var3.method2897(0) / 255.0F;
            class22.field278[0] = var6 * (float) class330.method2050(var5 >> 16, 255);
            class22.field278[2] = var6 * (float) class330.method2050(255, var5);
            class22.field278[1] = var6 * (float) class330.method2050(255, var5 >> 8);
            OpenGL.glLightfv(var4, 4609, class22.field278, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method2894((byte) -126) * var3.method2894((byte) -125)));
            OpenGL.glEnable(var4);
        }
        if (arg0 <= 63) {
            this.field6776 = -119;
        }
        while (this.field6826 > var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field6826 = this.field6716;
    }
}
