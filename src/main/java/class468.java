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

@OriginalClass("client!os")
public class class468 extends class167 {

    @OriginalMember(owner = "client!os", name = "s", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field6756 = new Hashtable();

    @OriginalMember(owner = "client!os", name = "fe", descriptor = "I")
    public int field6951 = 128;

    @OriginalMember(owner = "client!os", name = "ee", descriptor = "Ldn;")
    private class260 field6950 = new class260();

    @OriginalMember(owner = "client!os", name = "ke", descriptor = "Lol;")
    private class252 field6956 = new class252();

    @OriginalMember(owner = "client!os", name = "le", descriptor = "Lol;")
    public class252 field6957 = new class252();

    @OriginalMember(owner = "client!os", name = "ne", descriptor = "I")
    public int field6959 = 3;

    @OriginalMember(owner = "client!os", name = "me", descriptor = "I")
    public int field6958 = 8;

    @OriginalMember(owner = "client!os", name = "qe", descriptor = "Z")
    private boolean field6962 = false;

    @OriginalMember(owner = "client!os", name = "re", descriptor = "Lrk;")
    private class419 field6963 = new class419();

    @OriginalMember(owner = "client!os", name = "te", descriptor = "[Lru;")
    private class457[] field6965 = new class457[4];

    @OriginalMember(owner = "client!os", name = "we", descriptor = "I")
    private int field6968 = -1;

    @OriginalMember(owner = "client!os", name = "ye", descriptor = "[Lru;")
    private class457[] field6970 = new class457[4];

    @OriginalMember(owner = "client!os", name = "ue", descriptor = "I")
    private int field6966 = -1;

    @OriginalMember(owner = "client!os", name = "ve", descriptor = "I")
    private int field6967 = -1;

    @OriginalMember(owner = "client!os", name = "Ae", descriptor = "[Lru;")
    private class457[] field6972 = new class457[4];

    @OriginalMember(owner = "client!os", name = "Be", descriptor = "Lrk;")
    private class419 field6973;

    @OriginalMember(owner = "client!os", name = "Fe", descriptor = "Lrk;")
    private class419 field6977;

    @OriginalMember(owner = "client!os", name = "Ge", descriptor = "Lrk;")
    private class419 field6978;

    @OriginalMember(owner = "client!os", name = "He", descriptor = "Lrk;")
    private class419 field6979;

    @OriginalMember(owner = "client!os", name = "Ie", descriptor = "Lrk;")
    private class419 field6980;

    @OriginalMember(owner = "client!os", name = "Je", descriptor = "Lrk;")
    private class419 field6981;

    @OriginalMember(owner = "client!os", name = "Ke", descriptor = "Lrk;")
    private class419 field6982;

    @OriginalMember(owner = "client!os", name = "Se", descriptor = "F")
    public float field6990;

    @OriginalMember(owner = "client!os", name = "Te", descriptor = "I")
    private int field6991;

    @OriginalMember(owner = "client!os", name = "nf", descriptor = "I")
    public int field7010;

    @OriginalMember(owner = "client!os", name = "jf", descriptor = "F")
    public float field7006;

    @OriginalMember(owner = "client!os", name = "of", descriptor = "I")
    private int field7011;

    @OriginalMember(owner = "client!os", name = "Hf", descriptor = "I")
    private int field7030;

    @OriginalMember(owner = "client!os", name = "Df", descriptor = "I")
    public int field7026;

    @OriginalMember(owner = "client!os", name = "af", descriptor = "F")
    public float field6998;

    @OriginalMember(owner = "client!os", name = "Sf", descriptor = "I")
    public int field7041;

    @OriginalMember(owner = "client!os", name = "Ef", descriptor = "I")
    public int field7027;

    @OriginalMember(owner = "client!os", name = "Xf", descriptor = "F")
    public float field7046;

    @OriginalMember(owner = "client!os", name = "Rf", descriptor = "I")
    public int field7040;

    @OriginalMember(owner = "client!os", name = "Ye", descriptor = "I")
    private int field6996;

    @OriginalMember(owner = "client!os", name = "Re", descriptor = "I")
    public int field6989;

    @OriginalMember(owner = "client!os", name = "xf", descriptor = "[F")
    private float[] field7020;

    @OriginalMember(owner = "client!os", name = "Vf", descriptor = "I")
    private int field7044;

    @OriginalMember(owner = "client!os", name = "Le", descriptor = "I")
    private int field6983;

    @OriginalMember(owner = "client!os", name = "rg", descriptor = "I")
    public int field7066;

    @OriginalMember(owner = "client!os", name = "ug", descriptor = "F")
    public float field7069;

    @OriginalMember(owner = "client!os", name = "xg", descriptor = "F")
    private float field7072;

    @OriginalMember(owner = "client!os", name = "og", descriptor = "F")
    public float field7063;

    @OriginalMember(owner = "client!os", name = "dg", descriptor = "[F")
    private float[] field7052;

    @OriginalMember(owner = "client!os", name = "Wf", descriptor = "F")
    public float field7045;

    @OriginalMember(owner = "client!os", name = "Lf", descriptor = "I")
    private int field7034;

    @OriginalMember(owner = "client!os", name = "tg", descriptor = "[Lat;")
    private class535[] field7068;

    @OriginalMember(owner = "client!os", name = "Af", descriptor = "F")
    private float field7023;

    @OriginalMember(owner = "client!os", name = "Gf", descriptor = "I")
    private int field7029;

    @OriginalMember(owner = "client!os", name = "Nf", descriptor = "[F")
    public float[] field7036;

    @OriginalMember(owner = "client!os", name = "Pf", descriptor = "I")
    public int field7038;

    @OriginalMember(owner = "client!os", name = "vf", descriptor = "[F")
    private float[] field7018;

    @OriginalMember(owner = "client!os", name = "qf", descriptor = "I")
    public int field7013;

    @OriginalMember(owner = "client!os", name = "Og", descriptor = "Z")
    private boolean field7089;

    @OriginalMember(owner = "client!os", name = "bg", descriptor = "I")
    private int field7050;

    @OriginalMember(owner = "client!os", name = "ff", descriptor = "[F")
    private float[] field7003;

    @OriginalMember(owner = "client!os", name = "df", descriptor = "F")
    public float field7001;

    @OriginalMember(owner = "client!os", name = "ig", descriptor = "I")
    private int field7057;

    @OriginalMember(owner = "client!os", name = "mf", descriptor = "F")
    private float field7009;

    @OriginalMember(owner = "client!os", name = "Yf", descriptor = "F")
    private float field7047;

    @OriginalMember(owner = "client!os", name = "Lg", descriptor = "I")
    public int field7086;

    @OriginalMember(owner = "client!os", name = "Of", descriptor = "F")
    private float field7037;

    @OriginalMember(owner = "client!os", name = "Yg", descriptor = "I")
    public int field7099;

    @OriginalMember(owner = "client!os", name = "hf", descriptor = "Lke;")
    public class444 field7005;

    @OriginalMember(owner = "client!os", name = "dh", descriptor = "[I")
    public int[] field7104;

    @OriginalMember(owner = "client!os", name = "ch", descriptor = "[B")
    public byte[] field7103;

    @OriginalMember(owner = "client!os", name = "eh", descriptor = "[I")
    public int[] field7105;

    @OriginalMember(owner = "client!os", name = "hh", descriptor = "[I")
    public int[] field7108;

    @OriginalMember(owner = "client!os", name = "Pb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6831;

    @OriginalMember(owner = "client!os", name = "Rc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6885;

    @OriginalMember(owner = "client!os", name = "de", descriptor = "I")
    public int field6949;

    @OriginalMember(owner = "client!os", name = "Pc", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field6883;

    @OriginalMember(owner = "client!os", name = "Vb", descriptor = "J")
    private long field6837;

    @OriginalMember(owner = "client!os", name = "db", descriptor = "J")
    private long field6793;

    @OriginalMember(owner = "client!os", name = "gf", descriptor = "Z")
    public boolean field7004;

    @OriginalMember(owner = "client!os", name = "wf", descriptor = "I")
    public int field7019;

    @OriginalMember(owner = "client!os", name = "Qf", descriptor = "Ljava/lang/String;")
    private String field7039;

    @OriginalMember(owner = "client!os", name = "sg", descriptor = "Z")
    public boolean field7067;

    @OriginalMember(owner = "client!os", name = "Cf", descriptor = "Z")
    public boolean field7025;

    @OriginalMember(owner = "client!os", name = "vg", descriptor = "Z")
    private boolean field7070;

    @OriginalMember(owner = "client!os", name = "Ug", descriptor = "Z")
    public boolean field7095;

    @OriginalMember(owner = "client!os", name = "Eg", descriptor = "Z")
    public boolean field7079;

    @OriginalMember(owner = "client!os", name = "pf", descriptor = "Z")
    private boolean field7012;

    @OriginalMember(owner = "client!os", name = "qg", descriptor = "Ljava/lang/String;")
    private String field7065;

    @OriginalMember(owner = "client!os", name = "Ve", descriptor = "Z")
    public boolean field6993;

    @OriginalMember(owner = "client!os", name = "sf", descriptor = "Z")
    private boolean field7015;

    @OriginalMember(owner = "client!os", name = "Vd", descriptor = "Ler;")
    private class6 field6941;

    @OriginalMember(owner = "client!os", name = "oe", descriptor = "Lwda;")
    public class235 field6960;

    @OriginalMember(owner = "client!os", name = "Yd", descriptor = "Llg;")
    private class32 field6944;

    @OriginalMember(owner = "client!os", name = "he", descriptor = "Laaa;")
    private class99 field6953;

    @OriginalMember(owner = "client!os", name = "Xd", descriptor = "Lwr;")
    private class641 field6943;

    @OriginalMember(owner = "client!os", name = "Mb", descriptor = "Lqp;")
    public static class586 field6828 = new class586(105, 0);

    @OriginalMember(owner = "client!os", name = "je", descriptor = "[I")
    public static int[] field6955 = new int[1];

    @OriginalMember(owner = "client!os", name = "Ne", descriptor = "F")
    public float field6985;

    @OriginalMember(owner = "client!os", name = "Pe", descriptor = "F")
    public float field6987;

    @OriginalMember(owner = "client!os", name = "Ze", descriptor = "F")
    public float field6997;

    @OriginalMember(owner = "client!os", name = "cf", descriptor = "F")
    public float field7000;

    @OriginalMember(owner = "client!os", name = "ef", descriptor = "F")
    public float field7002;

    @OriginalMember(owner = "client!os", name = "Bf", descriptor = "F")
    private float field7024;

    @OriginalMember(owner = "client!os", name = "cg", descriptor = "F")
    private float field7051;

    @OriginalMember(owner = "client!os", name = "lg", descriptor = "F")
    public float field7060;

    @OriginalMember(owner = "client!os", name = "mg", descriptor = "F")
    public float field7061;

    @OriginalMember(owner = "client!os", name = "Ag", descriptor = "F")
    private float field7075;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!os", name = "t", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!os", name = "u", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!os", name = "v", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!os", name = "x", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!os", name = "y", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!os", name = "z", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!os", name = "A", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!os", name = "B", descriptor = "I")
    private int field6765;

    @OriginalMember(owner = "client!os", name = "C", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!os", name = "D", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!os", name = "E", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!os", name = "F", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!os", name = "G", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!os", name = "H", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!os", name = "I", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!os", name = "J", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!os", name = "K", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!os", name = "L", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!os", name = "M", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!os", name = "N", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!os", name = "O", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!os", name = "P", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!os", name = "Q", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!os", name = "R", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!os", name = "S", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!os", name = "T", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!os", name = "U", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!os", name = "V", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!os", name = "W", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!os", name = "X", descriptor = "I")
    private int field6787;

    @OriginalMember(owner = "client!os", name = "Y", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!os", name = "Z", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!os", name = "ab", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!os", name = "bb", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!os", name = "cb", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!os", name = "eb", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!os", name = "fb", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!os", name = "gb", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!os", name = "hb", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!os", name = "ib", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!os", name = "jb", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!os", name = "kb", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!os", name = "lb", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!os", name = "mb", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!os", name = "nb", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!os", name = "ob", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!os", name = "pb", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!os", name = "qb", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!os", name = "rb", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!os", name = "sb", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!os", name = "tb", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!os", name = "ub", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!os", name = "vb", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!os", name = "xb", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!os", name = "yb", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!os", name = "zb", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!os", name = "Ab", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!os", name = "Bb", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!os", name = "Cb", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!os", name = "Db", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!os", name = "Eb", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!os", name = "Fb", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!os", name = "Gb", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!os", name = "Hb", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!os", name = "Ib", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!os", name = "Jb", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!os", name = "Kb", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!os", name = "Lb", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!os", name = "Nb", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!os", name = "Ob", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!os", name = "Qb", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!os", name = "Rb", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!os", name = "Sb", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!os", name = "Tb", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!os", name = "Ub", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!os", name = "Wb", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!os", name = "Xb", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!os", name = "Yb", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!os", name = "Zb", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!os", name = "ac", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!os", name = "bc", descriptor = "I")
    public static int field6843;

    @OriginalMember(owner = "client!os", name = "cc", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!os", name = "dc", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!os", name = "ec", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!os", name = "fc", descriptor = "I")
    public static int field6847;

    @OriginalMember(owner = "client!os", name = "gc", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!os", name = "hc", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!os", name = "ic", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!os", name = "jc", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!os", name = "kc", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!os", name = "lc", descriptor = "I")
    public static int field6853;

    @OriginalMember(owner = "client!os", name = "mc", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!os", name = "nc", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!os", name = "oc", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!os", name = "pc", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!os", name = "qc", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!os", name = "rc", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!os", name = "sc", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!os", name = "tc", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!os", name = "uc", descriptor = "I")
    public static int field6862;

    @OriginalMember(owner = "client!os", name = "vc", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!os", name = "wc", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!os", name = "xc", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!os", name = "zc", descriptor = "I")
    public static int field6867;

    @OriginalMember(owner = "client!os", name = "Ac", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!os", name = "Bc", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!os", name = "Cc", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!os", name = "Dc", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!os", name = "Ec", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!os", name = "Fc", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!os", name = "Gc", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!os", name = "Hc", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!os", name = "Ic", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!os", name = "Jc", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!os", name = "Kc", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!os", name = "Lc", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!os", name = "Mc", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!os", name = "Nc", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!os", name = "Oc", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!os", name = "Qc", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!os", name = "Sc", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!os", name = "Tc", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!os", name = "Uc", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!os", name = "Vc", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!os", name = "Wc", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!os", name = "Xc", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!os", name = "Yc", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!os", name = "Zc", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!os", name = "ad", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!os", name = "bd", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!os", name = "cd", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!os", name = "dd", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!os", name = "ed", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!os", name = "fd", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!os", name = "gd", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!os", name = "hd", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!os", name = "id", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!os", name = "jd", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!os", name = "kd", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!os", name = "ld", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!os", name = "md", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!os", name = "nd", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!os", name = "od", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!os", name = "pd", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!os", name = "qd", descriptor = "I")
    public static int field6910;

    @OriginalMember(owner = "client!os", name = "rd", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!os", name = "sd", descriptor = "I")
    public int field6912;

    @OriginalMember(owner = "client!os", name = "td", descriptor = "I")
    public static int field6913;

    @OriginalMember(owner = "client!os", name = "ud", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!os", name = "vd", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!os", name = "wd", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!os", name = "xd", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!os", name = "yd", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!os", name = "zd", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!os", name = "Ad", descriptor = "I")
    public static int field6920;

    @OriginalMember(owner = "client!os", name = "Bd", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!os", name = "Cd", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!os", name = "Dd", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!os", name = "Fd", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!os", name = "Gd", descriptor = "I")
    public static int field6926;

    @OriginalMember(owner = "client!os", name = "Hd", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!os", name = "Id", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!os", name = "Jd", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!os", name = "Kd", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!os", name = "Ld", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!os", name = "Md", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!os", name = "Nd", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!os", name = "Od", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!os", name = "Pd", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!os", name = "Qd", descriptor = "I")
    public int field6936;

    @OriginalMember(owner = "client!os", name = "Rd", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!os", name = "Sd", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!os", name = "Td", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!os", name = "Ud", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!os", name = "Wd", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!os", name = "Zd", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!os", name = "ae", descriptor = "I")
    public static int field6946;

    @OriginalMember(owner = "client!os", name = "be", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!os", name = "ce", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!os", name = "ge", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!os", name = "ie", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!os", name = "pe", descriptor = "I")
    public int field6961;

    @OriginalMember(owner = "client!os", name = "Ce", descriptor = "I")
    public int field6974;

    @OriginalMember(owner = "client!os", name = "De", descriptor = "I")
    public int field6975;

    @OriginalMember(owner = "client!os", name = "Ee", descriptor = "I")
    private int field6976;

    @OriginalMember(owner = "client!os", name = "Oe", descriptor = "I")
    private int field6986;

    @OriginalMember(owner = "client!os", name = "Ue", descriptor = "I")
    private int field6992;

    @OriginalMember(owner = "client!os", name = "We", descriptor = "I")
    private int field6994;

    @OriginalMember(owner = "client!os", name = "kf", descriptor = "I")
    private int field7007;

    @OriginalMember(owner = "client!os", name = "Ff", descriptor = "I")
    public int field7028;

    @OriginalMember(owner = "client!os", name = "Jf", descriptor = "I")
    private int field7032;

    @OriginalMember(owner = "client!os", name = "Kf", descriptor = "I")
    public int field7033;

    @OriginalMember(owner = "client!os", name = "Mf", descriptor = "I")
    public int field7035;

    @OriginalMember(owner = "client!os", name = "Fg", descriptor = "I")
    private int field7080;

    @OriginalMember(owner = "client!os", name = "Hg", descriptor = "I")
    private int field7082;

    @OriginalMember(owner = "client!os", name = "Ig", descriptor = "I")
    private int field7083;

    @OriginalMember(owner = "client!os", name = "Kg", descriptor = "I")
    private int field7085;

    @OriginalMember(owner = "client!os", name = "Ng", descriptor = "I")
    private int field7088;

    @OriginalMember(owner = "client!os", name = "Pg", descriptor = "I")
    public int field7090;

    @OriginalMember(owner = "client!os", name = "Zg", descriptor = "I")
    private int field7100;

    @OriginalMember(owner = "client!os", name = "fh", descriptor = "I")
    private int field7106;

    @OriginalMember(owner = "client!os", name = "gh", descriptor = "I")
    private int field7107;

    @OriginalMember(owner = "client!os", name = "Qe", descriptor = "J")
    private long field6988;

    @OriginalMember(owner = "client!os", name = "pg", descriptor = "Ldl;")
    private class112 field7064;

    @OriginalMember(owner = "client!os", name = "fg", descriptor = "Laf;")
    public class156 field7054;

    @OriginalMember(owner = "client!os", name = "ng", descriptor = "Laf;")
    public class156 field7062;

    @OriginalMember(owner = "client!os", name = "jg", descriptor = "Lot;")
    public class210 field7058;

    @OriginalMember(owner = "client!os", name = "yg", descriptor = "Lol;")
    public class252 field7073;

    @OriginalMember(owner = "client!os", name = "Gg", descriptor = "Lol;")
    public class252 field7081;

    @OriginalMember(owner = "client!os", name = "rf", descriptor = "Lgg;")
    private class273 field7014;

    @OriginalMember(owner = "client!os", name = "Xe", descriptor = "Lvb;")
    public class292 field6995;

    @OriginalMember(owner = "client!os", name = "gg", descriptor = "Leea;")
    private class407 field7055;

    @OriginalMember(owner = "client!os", name = "xe", descriptor = "Lru;")
    private class457 field6969;

    @OriginalMember(owner = "client!os", name = "ze", descriptor = "Lru;")
    private class457 field6971;

    @OriginalMember(owner = "client!os", name = "yc", descriptor = "Ln;")
    public static class472 field6866;

    @OriginalMember(owner = "client!os", name = "Ed", descriptor = "Lua;")
    public static class548 field6924;

    @OriginalMember(owner = "client!os", name = "Me", descriptor = "Ljv;")
    public class584 field6984;

    @OriginalMember(owner = "client!os", name = "bf", descriptor = "Ljv;")
    public class584 field6999;

    @OriginalMember(owner = "client!os", name = "lf", descriptor = "Ljv;")
    public class584 field7008;

    @OriginalMember(owner = "client!os", name = "yf", descriptor = "Ljv;")
    public class584 field7021;

    @OriginalMember(owner = "client!os", name = "Tf", descriptor = "Ljv;")
    public class584 field7042;

    @OriginalMember(owner = "client!os", name = "Zf", descriptor = "Ljv;")
    public class584 field7048;

    @OriginalMember(owner = "client!os", name = "ag", descriptor = "Ljv;")
    public class584 field7049;

    @OriginalMember(owner = "client!os", name = "kg", descriptor = "Ljv;")
    public class584 field7059;

    @OriginalMember(owner = "client!os", name = "Sg", descriptor = "Ljv;")
    public class584 field7093;

    @OriginalMember(owner = "client!os", name = "Tg", descriptor = "Ljv;")
    public class584 field7094;

    @OriginalMember(owner = "client!os", name = "eg", descriptor = "Llq;")
    private class9 field7053;

    @OriginalMember(owner = "client!os", name = "Jg", descriptor = "Llq;")
    private class9 field7084;

    @OriginalMember(owner = "client!os", name = "se", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field6964;

    @OriginalMember(owner = "client!os", name = "tf", descriptor = "Z")
    private boolean field7016;

    @OriginalMember(owner = "client!os", name = "uf", descriptor = "Z")
    private boolean field7017;

    @OriginalMember(owner = "client!os", name = "zf", descriptor = "Z")
    public boolean field7022;

    @OriginalMember(owner = "client!os", name = "If", descriptor = "Z")
    private boolean field7031;

    @OriginalMember(owner = "client!os", name = "Uf", descriptor = "Z")
    private boolean field7043;

    @OriginalMember(owner = "client!os", name = "hg", descriptor = "Z")
    private boolean field7056;

    @OriginalMember(owner = "client!os", name = "wg", descriptor = "Z")
    private boolean field7071;

    @OriginalMember(owner = "client!os", name = "zg", descriptor = "Z")
    private boolean field7074;

    @OriginalMember(owner = "client!os", name = "Bg", descriptor = "Z")
    public boolean field7076;

    @OriginalMember(owner = "client!os", name = "Cg", descriptor = "Z")
    public boolean field7077;

    @OriginalMember(owner = "client!os", name = "Mg", descriptor = "Z")
    public boolean field7087;

    @OriginalMember(owner = "client!os", name = "Qg", descriptor = "Z")
    public boolean field7091;

    @OriginalMember(owner = "client!os", name = "Rg", descriptor = "Z")
    public boolean field7092;

    @OriginalMember(owner = "client!os", name = "Vg", descriptor = "Z")
    private boolean field7096;

    @OriginalMember(owner = "client!os", name = "Wg", descriptor = "Z")
    private boolean field7097;

    @OriginalMember(owner = "client!os", name = "Xg", descriptor = "Z")
    public boolean field7098;

    @OriginalMember(owner = "client!os", name = "ah", descriptor = "Z")
    private boolean field7101;

    @OriginalMember(owner = "client!os", name = "bh", descriptor = "Z")
    public boolean field7102;

    @OriginalMember(owner = "client!os", name = "Dg", descriptor = "[Lbaa;")
    private class541[] field7078;

    @OriginalMember(owner = "client!os", name = "wb", descriptor = "[[Ljda;")
    public static class278[][] field6812;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(B)I")
    private final int method2770(byte arg0) {
        ++field6937;
        this.field7065 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field7039 = OpenGL.glGetString(7937).toLowerCase();
        if (arg0 <= 3) {
            return -90;
        } else {
            if (this.field7065.indexOf("microsoft") != -1) {
                var2 |= 1;
            }
            if (this.field7065.indexOf("brian paul") != -1 || ~this.field7065.indexOf("mesa") != 0) {
                var2 |= 1;
            }
            String var3 = OpenGL.glGetString(7938);
            String[] var4 = class317.method1994(8, ' ', var3.replace('.', ' '));
            if (var4.length < 2) {
                var2 |= 4;
            } else {
                try {
                    int var5 = class233.method1518(var4[0], (byte) -123);
                    int var6 = class233.method1518(var4[1], (byte) -128);
                    this.field6994 = var5 * 10 + var6;
                } catch (NumberFormatException var8) {
                    var2 |= 4;
                }
            }
            if (this.field6994 < 12) {
                var2 |= 2;
            }
            if (!this.field6883.method3388("GL_ARB_multitexture")) {
                var2 |= 8;
            }
            if (!this.field6883.method3388("GL_ARB_texture_env_combine")) {
                var2 |= 32;
            }
            int[] var7 = new int[1];
            OpenGL.glGetIntegerv(34018, var7, 0);
            this.field7035 = var7[0];
            OpenGL.glGetIntegerv(34929, var7, 0);
            this.field7032 = var7[0];
            OpenGL.glGetIntegerv(34930, var7, 0);
            this.field7085 = var7[0];
            if (this.field7035 < 2 || ~this.field7032 > -3 || this.field7085 < 2) {
                var2 |= 16;
            }
            this.field7004 = Stream.method3328();
            this.field6883.arePbuffersAvailable();
            this.field7070 = this.field6883.method3388("GL_ARB_vertex_buffer_object");
            this.field7101 = this.field6883.method3388("GL_ARB_multisample");
            this.field7092 = this.field6883.method3388("GL_ARB_vertex_program");
            this.field6883.method3388("GL_ARB_fragment_program");
            this.field7091 = this.field6883.method3388("GL_ARB_vertex_shader");
            this.field7077 = this.field6883.method3388("GL_ARB_fragment_shader");
            this.field7025 = this.field6883.method3388("GL_EXT_texture3D");
            this.field7095 = this.field6883.method3388("GL_ARB_texture_rectangle");
            this.field7076 = this.field6883.method3388("GL_ARB_texture_cube_map");
            this.field7067 = this.field6883.method3388("GL_ARB_texture_float");
            this.field7022 = false;
            this.field6993 = this.field6883.method3388("GL_EXT_framebuffer_object");
            this.field7102 = this.field6883.method3388("GL_EXT_framebuffer_blit");
            this.field7087 = this.field6883.method3388("GL_EXT_framebuffer_multisample");
            this.field7031 = this.field7087 & this.field7102;
            OpenGL.glGetFloatv(2834, class133.field1756, 0);
            this.field7072 = class133.field1756[1];
            this.field7009 = class133.field1756[0];
            return ~var2 != -1 ? var2 : 0;
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
    public final void method1043(int arg0) {
        ++field6911;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field6951 = arg0;
            this.field6941.method27(false);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public final class543 method965(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field6844;
        return new class366(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!os", name = "h", descriptor = "(I)V")
    private final void method2771(int arg0) {
        ++field6795;
        int var2;
        for (var2 = 0; ~var2 > ~this.field7100; ++var2) {
            class535 var3 = this.field7068[var2];
            int var4 = 16386 - -var2;
            class646.field9382[0] = (float) var3.method3151(-36);
            class646.field9382[1] = (float) var3.method3150(2);
            class646.field9382[2] = (float) var3.method3143(-106);
            class646.field9382[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class646.field9382, 0);
            int var5 = var3.method3148((byte) -81);
            float var6 = var3.method3145(2) / 255.0F;
            class646.field9382[2] = var6 * (float) class637.method3693(255, var5);
            class646.field9382[0] = (float) (class637.method3693(16747672, var5) >> 16) * var6;
            class646.field9382[1] = (float) (class637.method3693(65466, var5) >> 8) * var6;
            OpenGL.glLightfv(var4, 4609, class646.field9382, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method3146(0) * var3.method3146(0)));
            OpenGL.glEnable(var4);
        }
        if (arg0 != 5890) {
            this.method2790(0.45639995F, -0.69715816F, 73);
        }
        while (this.field7080 > var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field7080 = this.field7100;
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "()I")
    public final int method1018() {
        ++field6821;
        return this.field7099;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIBI)V")
    public final void method2772(int arg0, int arg1, byte arg2, int arg3) {
        ++field6919;
        OpenGL.glTexEnvi(8960, arg3 + 34184, arg0);
        OpenGL.glTexEnvi(8960, arg3 + 34200, arg1);
        int var5 = 109 % ((arg2 - -20) / 53);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIILpa;II)V")
    public final void method996(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class594 arg6, int arg7, int arg8) {
        ++field6915;
        class1 var10 = (class1) arg6;
        class273 var11 = var10.field2;
        this.method2814(false);
        this.method2811(var10.field2, -2);
        this.method2796((byte) -80, arg5);
        this.method2852(7681, (byte) 16, 8448);
        this.method2801(false, 34167, 0, 768);
        float var12 = var11.field4042 / (float) var11.field4035;
        float var13 = var11.field4036 / (float) var11.field4043;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var14 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var18 = var15 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method2801(false, 5890, 0, 768);
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;I)V")
    public class468(Canvas arg0, class472 arg1, int arg2) {
        super(arg1);
        new class384();
        new class205(16);
        this.field6973 = new class419();
        this.field6977 = new class419();
        this.field6978 = new class419();
        this.field6979 = new class419();
        this.field6980 = new class419();
        this.field6981 = new class419();
        this.field6982 = new class419();
        this.field6990 = 3000.0F;
        this.field6991 = 0;
        this.field7010 = 0;
        this.field7006 = 3584.0F;
        this.field7011 = 0;
        this.field7030 = 8448;
        this.field7026 = 0;
        this.field6998 = 3584.0F;
        this.field7041 = -1;
        this.field7027 = -1;
        this.field7046 = -1.0F;
        this.field7040 = 0;
        this.field6996 = 0;
        this.field6989 = 512;
        this.field7020 = new float[16];
        this.field7044 = 0;
        this.field6983 = 0;
        this.field7066 = 512;
        this.field7069 = 1.0F;
        this.field7072 = -1.0F;
        this.field7063 = 1.0F;
        this.field7052 = new float[4];
        this.field7045 = -1.0F;
        this.field7034 = 8448;
        this.field7068 = new class535[class274.field4045];
        this.field7023 = 0.0F;
        this.field7029 = 0;
        this.field7036 = new float[4];
        this.field7038 = 3584;
        this.field7018 = new float[4];
        this.field7013 = 0;
        this.field7089 = true;
        this.field7050 = -1;
        this.field7003 = new float[4];
        this.field7001 = 1.0F;
        this.field7057 = -1;
        this.field7009 = -1.0F;
        this.field7047 = 1.0F;
        this.field7086 = -1;
        this.field7037 = 1.0F;
        this.field7099 = 50;
        this.field7005 = new class444(8192);
        this.field7104 = new int[1];
        this.field7103 = new byte[16384];
        this.field7105 = new int[1];
        this.field7108 = new int[1];
        this.field6885 = this.field6831 = arg0;
        this.field6949 = arg2;
        if (!class53.method271((byte) -107, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class53.method271((byte) -108, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field6883 = new OpenGL();
                this.field6793 = this.field6837 = this.field6883.init(arg0, 8, 8, 8, 24, 0, this.field6949);
                if (this.field6837 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method2831(-31492);
                    int var4 = this.method2770((byte) 127);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field7019 = this.field7004 ? 33639 : 5121;
                        if (this.field7039.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class317.method1994(8, ' ', this.field7039.replace('/', ' '));
                            for (int var9 = 0; var9 < var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (var10.charAt(0) == 'x' && var10.length() >= 3 && class258.method1628(true, var10.substring(1, 3))) {
                                            var10 = var10.substring(1);
                                            var7 = true;
                                        }
                                        if (var10.equals("hd")) {
                                            var6 = true;
                                        } else {
                                            if (var10.startsWith("hd")) {
                                                var6 = true;
                                                var10 = var10.substring(2);
                                            }
                                            if (var10.length() >= 4 && class258.method1628(true, var10.substring(0, 4))) {
                                                var5 = class233.method1518(var10.substring(0, 4), (byte) -125);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var16) {
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field7067 = false;
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && ~var5 >= -9251) {
                                    this.field7025 = false;
                                }
                                if (var5 >= 7000 && ~var5 >= -8000) {
                                    this.field7070 = false;
                                }
                            }
                            this.field7095 &= this.field6883.method3388("GL_ARB_half_float_pixel");
                            this.field7079 = true;
                            this.field7012 = this.field7070;
                        }
                        if (this.field7065.indexOf("intel") != -1) {
                            this.field6993 = false;
                        }
                        this.field7015 = !this.field7065.equals("s3 graphics");
                        if (this.field7070) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var14) {
                                throw new RuntimeException("");
                            }
                        }
                        class587.method3427(false, false, true);
                        this.field6962 = true;
                        this.field6941 = new class6(this, super.field2262);
                        this.method2776(true);
                        this.field6960 = new class235(this);
                        this.field6944 = new class32(this);
                        if (this.field6944.method150(34836)) {
                            this.field6953 = new class99(this);
                            if (!this.field6953.method584(0)) {
                                this.field6953.method585((byte) -126);
                                this.field6953 = null;
                            }
                        }
                        this.field6943 = new class641(this);
                        this.method2806((byte) 117);
                        this.method2779((byte) -58);
                        OpenGL.glClear(16640);
                        int var12 = 0;
                        while (true) {
                            try {
                                this.field6883.swapBuffers();
                                break;
                            } catch (Exception var15) {
                                if (~(var12++) < -6) {
                                    throw new RuntimeException("");
                                }
                                class428.method2624(1, 100L);
                            }
                        }
                        OpenGL.glClear(16384);
                    }
                }
            } catch (Throwable var17) {
                var17.printStackTrace();
                this.method298();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "e", descriptor = "(IIIII)V")
    public final void method966(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2786(-2);
        ++field6891;
        this.method2796((byte) -80, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!os", name = "i", descriptor = "(I)V")
    private final void method2773(int arg0) {
        ++field6871;
        if (this.field7096) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field7096 = false;
        }
        int var2 = -78 / ((-76 - arg0) / 41);
    }

    @OriginalMember(owner = "client!os", name = "t", descriptor = "()V")
    public final void method298() {
        ++field6907;
        for (class496 var1 = this.field6963.method2496((byte) -124); var1 != null; var1 = this.field6963.method2494(28)) {
            ((class16) var1).method72(true);
        }
        if (this.field6944 != null) {
            this.field6944.method144(-57);
        }
        if (this.field6883 != null) {
            this.method2851((byte) -15);
            Enumeration var2 = this.field6756.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field6756.get(var3);
                this.field6883.releaseSurface(var3, var4);
            }
            this.field6883.release();
            this.field6883 = null;
        }
        if (this.field6962) {
            class621.method3596(0, false, true);
            this.field6962 = false;
        }
    }

    @OriginalMember(owner = "client!os", name = "f", descriptor = "()V")
    public final void method1017() {
        ++field6766;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Llh;Llh;FLlh;)Llh;")
    public final class125 method332(class125 arg0, class125 arg1, float arg2, class125 arg3) {
        ++field6948;
        if (arg0 != null && arg1 != null && this.field7076 && this.field6993) {
            class565 var5 = null;
            class112 var6 = (class112) arg0;
            class112 var7 = (class112) arg1;
            class227 var8 = var6.method665((byte) -125);
            class227 var9 = var7.method665((byte) -126);
            if (var8 != null && var9 != null) {
                int var10 = ~var9.field3336 > ~var8.field3336 ? var8.field3336 : var9.field3336;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class565) {
                    class565 var11 = (class565) arg3;
                    if (var10 == var11.method3305(7)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class565(this, var10);
                }
                if (var5.method3304(arg2, var9, true, var8)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!os", name = "IA", descriptor = "(III[I)V")
    public final void method1037(int arg0, int arg1, int arg2, int[] arg3) {
        ++field6916;
        float var5 = (float) arg2 * this.field7073.field3672 + (float) arg0 * this.field7073.field3671 + (float) arg1 * this.field7073.field3685 + this.field7073.field3678;
        if (!((float) this.field7099 > var5) && !((float) this.field7038 < var5)) {
            int var6 = (int) (((float) arg2 * this.field7073.field3676 + (float) arg0 * this.field7073.field3669 + (float) arg1 * this.field7073.field3658 + this.field7073.field3664) * (float) this.field7066 / var5);
            int var7 = (int) (((float) arg2 * this.field7073.field3662 + (float) arg0 * this.field7073.field3656 + (float) arg1 * this.field7073.field3681 + this.field7073.field3684) * (float) this.field6989 / var5);
            if (this.field7002 <= (float) var6 && (float) var6 <= this.field6985 && this.field6997 <= (float) var7 && this.field7060 >= (float) var7) {
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 + -this.field7002);
                arg3[1] = (int) ((float) var7 - this.field6997);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "()Lrr;")
    public final class374 method287() {
        ++field6934;
        int var1 = -1;
        if (~this.field7065.indexOf("nvidia") == 0) {
            if (this.field7065.indexOf("intel") == -1) {
                if (~this.field7065.indexOf("ati") != 0) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class374(var1, "OpenGL", this.field6994, this.field7039, 0L);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZIZZ)V")
    public final void method2774(boolean arg0, int arg1, boolean arg2, boolean arg3) {
        if (~this.field7088 != ~arg1) {
            if (~arg1 > -1) {
                this.method2773(-127);
                this.method2811((class541) null, -2);
                this.method2791(0, (byte) 127);
                if (!this.field7098) {
                    this.field6943.method3713(0, arg0, 0, -93, 0, arg3);
                }
            } else {
                class210 var5 = this.field6941.method29(16711680, arg1);
                class83 var6 = super.field2262.method1762(arg1, (byte) 45);
                if (var6.field980 == 0 && ~var6.field965 == -1) {
                    this.method2773(-127);
                } else {
                    int var7 = var6.field964 ? 64 : 128;
                    int var8 = var7 * 50;
                    this.method2808((float) (this.field6961 % var8 * var6.field965) / (float) var8, 0.0F, (float) (this.field6961 % var8 * var6.field980) / (float) var8, (byte) -126);
                }
                if (!this.field7098) {
                    this.field6943.method3713(var6.field978, arg0, var6.field973, -85, var6.field968, arg3);
                    if (!this.field6943.method3711(var5, var6.field970, (byte) 54)) {
                        this.method2811(var5, -2);
                        this.method2791(var6.field970, (byte) 126);
                    }
                } else {
                    this.method2811(var5, -2);
                    this.method2791(var6.field970, (byte) 127);
                }
            }
            this.field7088 = arg1;
        }
        ++field6896;
        if (arg2) {
            field6955 = null;
        }
        this.field6986 &= -8;
    }

    @OriginalMember(owner = "client!os", name = "j", descriptor = "()V")
    public final void method313() {
        OpenGL.glFinish();
        ++field6880;
    }

    @OriginalMember(owner = "client!os", name = "L", descriptor = "(I)V")
    public final void method972(int arg0) {
        ++field6906;
        this.field6959 = 0;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field6959;
        }
        this.field6958 = 1 << this.field6959;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)I")
    public final int method978(int arg0, int arg1) {
        ++field6900;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lru;B)V")
    public final void method2775(class457 arg0, byte arg1) {
        ++field6875;
        if (~this.field6968 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field6968 >= 0) {
                this.field6970[this.field6968].method1803(true);
            }
            if (arg1 != -9) {
                this.field7076 = true;
            }
            this.field6969 = this.field6970[++this.field6968] = arg0;
            this.field6969.method1808((byte) 84);
        }
    }

    @OriginalMember(owner = "client!os", name = "ba", descriptor = "()I")
    public final int method1024() {
        ++field6854;
        int var1 = this.field7107;
        this.field7107 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!os", name = "xa", descriptor = "()V")
    public final void method1034() {
        ++field6884;
        this.field7098 = false;
        this.field6943.method3713(0, false, 0, -94, 0, false);
        this.method2824(4617);
        this.method2802((byte) -27);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIII)Llh;")
    public final class125 method1033(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6818;
        return !this.field7076 ? null : new class522(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(Z)V")
    private final void method2776(boolean arg0) {
        ++field6846;
        this.field7073 = new class252();
        this.field7081 = new class252();
        this.field7078 = new class541[this.field7035];
        this.field7058 = new class210(this, 3553, 6408, 1, 1);
        new class210(this, 3553, 6408, 1, 1);
        new class210(this, 3553, 6408, 1, 1);
        this.field7093 = new class584(this);
        this.field7042 = new class584(this);
        if (arg0) {
            this.field7048 = new class584(this);
            this.field7049 = new class584(this);
            this.field6984 = new class584(this);
            this.field7094 = new class584(this);
            this.field7021 = new class584(this);
            this.field7059 = new class584(this);
            this.field6999 = new class584(this);
            this.field7008 = new class584(this);
            if (this.field6993) {
                this.field6995 = new class292(this);
                new class292(this);
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "u", descriptor = "()V")
    public final void method322() {
        this.method2800(true, -32);
        ++field6849;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(IIII)V")
    public final void method1016(int arg0, int arg1, int arg2, int arg3) {
        this.field7026 = arg1;
        ++field6778;
        this.field7066 = arg2;
        this.field6989 = arg3;
        this.field7013 = arg0;
        this.method2799((byte) -23);
        this.method2797(true);
        if (this.field7007 != 3) {
            if (this.field7007 == 2) {
                this.method2822((byte) 39);
                return;
            }
        } else {
            this.method2832(-32093);
        }
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method964(Canvas arg0) {
        this.field6885 = null;
        ++field6781;
        this.field6793 = 0L;
        if (arg0 != null && this.field6831 != arg0) {
            if (this.field6756.containsKey(arg0)) {
                Long var2 = (Long) this.field6756.get(arg0);
                this.field6793 = var2;
                this.field6885 = arg0;
            }
        } else {
            this.field6793 = this.field6837;
            this.field6885 = this.field6831;
        }
        if (this.field6885 != null && this.field6793 != 0L) {
            this.field6883.setSurface(this.field6793);
            this.method2779((byte) -49);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZI)I")
    public final int method2777(boolean arg0, int arg1) {
        ++field6952;
        if (~arg1 != -6407 && ~arg1 != -6410) {
            if (~arg1 != -6411 && ~arg1 != -34847 && arg1 != 34844) {
                if (arg1 == 6407) {
                    return 3;
                } else if (arg1 != 6408 && arg1 != 34847) {
                    if (arg1 != 34843) {
                        if (~arg1 == -34843) {
                            return 8;
                        } else if (arg1 == 6402) {
                            return 3;
                        } else if (~arg1 == -6402) {
                            return 1;
                        } else if (!arg0) {
                            return -99;
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
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(II)V")
    public final void method2778(int arg0, int arg1) {
        if (arg1 == 0) {
            this.method2807(-75, arg0, true);
            ++field6867;
        }
    }

    @OriginalMember(owner = "client!os", name = "B", descriptor = "(IIIIII)Z")
    public final boolean method1027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6929;
        float var7 = (float) arg2 * this.field7073.field3672 + (float) arg0 * this.field7073.field3671 + (float) arg1 * this.field7073.field3685 + this.field7073.field3678;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field7073.field3672 + (float) arg3 * this.field7073.field3671 + (float) arg4 * this.field7073.field3685 + this.field7073.field3678;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field7099) || !((float) this.field7099 > var8)) && (!(var7 > (float) this.field7038) || !((float) this.field7038 < var8))) {
            int var9 = (int) (((float) arg2 * this.field7073.field3676 + (float) arg0 * this.field7073.field3669 + (float) arg1 * this.field7073.field3658 + this.field7073.field3664) * (float) this.field7066 / var7);
            int var10 = (int) (((float) arg5 * this.field7073.field3676 + (float) arg3 * this.field7073.field3669 + (float) arg4 * this.field7073.field3658 + this.field7073.field3664) * (float) this.field7066 / var8);
            if (this.field7002 > (float) var9 && (float) var10 < this.field7002 || (float) var9 > this.field6985 && this.field6985 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field7073.field3662 + (float) arg0 * this.field7073.field3656 + (float) arg1 * this.field7073.field3681 + this.field7073.field3684) * (float) this.field6989 / var7);
                int var12 = (int) (((float) arg5 * this.field7073.field3662 + (float) arg3 * this.field7073.field3656 + (float) arg4 * this.field7073.field3681 + this.field7073.field3684) * (float) this.field6989 / var8);
                return (!((float) var11 < this.field6997) || !((float) var12 < this.field6997)) && (!(this.field7060 < (float) var11) || !((float) var12 > this.field7060));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(B)V")
    private final void method2779(byte arg0) {
        ++field6819;
        if (this.field6885 == null) {
            this.field6765 = this.field6787 = 0;
        } else {
            Dimension var2 = this.field6885.getSize();
            this.field6765 = var2.width;
            this.field6787 = var2.height;
        }
        if (arg0 >= -10) {
            this.method1011(85, 85, 127, -94, 31, -35, (byte[]) null, 101, -89);
        }
        if (this.field6971 == null) {
            this.field6912 = this.field6765;
            this.field6936 = this.field6787;
            this.method2818(15);
        }
        this.method2833((byte) 111);
        this.method985();
    }

    @OriginalMember(owner = "client!os", name = "j", descriptor = "(I)V")
    private final void method2780(int arg0) {
        if (this.field7061 != 0.0F) {
            float var2 = this.field6990 / (this.field7061 + this.field6990);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field7075 * (1.0F - var2) / this.field7061;
            this.field7020[10] = this.field7024 + var4;
            this.field7020[14] = this.field7075 * var3;
        } else {
            this.field7020[14] = this.field7075;
            this.field7020[10] = this.field7024;
        }
        ++field6920;
        int var5 = 99 / ((arg0 - 42) / 54);
        this.field7006 = (this.field7020[14] + (float) (-this.field7038)) / this.field7020[10];
        this.field6998 = (float) this.field7038 + -this.field7061;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I[BIZI)Llq;")
    public final class9 method2781(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4) {
        int var6 = 63 / ((arg4 - -62) / 35);
        ++field6930;
        return (class9) (!this.field7070 || arg3 && !this.field7012 ? new class296(this, arg2, arg1, arg0) : new class123(this, arg2, arg1, arg0, arg3));
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(II)I")
    public final int method2782(int arg0, int arg1) {
        ++field6834;
        if (~arg0 != -2) {
            if (~arg0 == -1) {
                return 8448;
            } else if (arg0 != 2) {
                if (~arg0 == -4) {
                    return 260;
                } else if (~arg0 == -5) {
                    return 34023;
                } else {
                    int var3 = -87 / ((arg1 - 46) / 62);
                    throw new IllegalArgumentException();
                }
            } else {
                return 34165;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!os", name = "e", descriptor = "(II)I")
    public final int method2783(int arg0, int arg1) {
        ++field6770;
        if (arg1 != 5121 && ~arg1 != -5121) {
            if (~arg1 != -5124 && ~arg1 != -5123) {
                if (arg0 != -9) {
                    this.method286();
                }
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

    @OriginalMember(owner = "client!os", name = "f", descriptor = "(II)V")
    public final synchronized void method2784(int arg0, int arg1) {
        if (arg0 != -27622) {
            this.method984();
        }
        ++field6791;
        class496 var3 = new class496();
        var3.field7465 = (long) arg1;
        this.field6981.method2492(var3, (byte) 106);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZLru;)V")
    public final void method2785(boolean arg0, class457 arg1) {
        ++field6814;
        if (~this.field6967 <= -1 && this.field6972[this.field6967] == arg1) {
            this.field6972[this.field6967--] = null;
            arg1.method1822((byte) -75);
            if (!arg0) {
                this.method2782(60, -112);
            }
            if (~this.field6967 <= -1) {
                this.field6971 = this.field6972[this.field6967];
                this.field6971.method1812((byte) 127);
            } else {
                this.field6971 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!os", name = "k", descriptor = "(I)V")
    private final void method2786(int arg0) {
        ++field6863;
        if (this.field6986 != 1) {
            this.method2844(-60);
            this.method2787(false, (byte) -83);
            this.method2828(5126, false);
            this.method2836(2929, false);
            this.method2800(false, -32);
            this.method2811((class541) null, -2);
            this.method2778(-2, arg0 ^ -2);
            this.method2791(1, (byte) 122);
            this.field6986 = 1;
        }
        if (arg0 != -2) {
            this.method2829((class252) null, -9);
        }
    }

    @OriginalMember(owner = "client!os", name = "N", descriptor = "(IIII)V")
    public final void method1022(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg3 > this.field6936) {
            arg3 = this.field6936;
        }
        if (~arg1 > -1) {
            arg1 = 0;
        }
        if (~this.field6912 > ~arg2) {
            arg2 = this.field6912;
        }
        ++field6754;
        this.field7029 = arg0;
        this.field6983 = arg3;
        this.field7044 = arg1;
        this.field7011 = arg2;
        OpenGL.glEnable(3089);
        this.method2797(true);
        this.method2827((byte) 127);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZB)V")
    public final void method2787(boolean arg0, byte arg1) {
        int var3 = 19 % ((-36 - arg1) / 38);
        if (!this.field7074 != !arg0) {
            this.field7074 = arg0;
            this.method2802((byte) -27);
            this.field6986 &= -32;
        }
        ++field6894;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BLru;)V")
    public final void method2788(byte arg0, class457 arg1) {
        ++field6798;
        if (arg0 != -118) {
            this.field6969 = null;
        }
        if (this.field7102) {
            this.method2798(arg1, 0);
            this.method2785(true, arg1);
        } else if (this.field6966 >= 0 && this.field6965[this.field6966] == arg1) {
            this.field6965[this.field6966--] = null;
            arg1.method1813(-15450);
            if (~this.field6966 > -1) {
                this.field6969 = this.field6971 = null;
            } else {
                this.field6969 = this.field6971 = this.field6965[this.field6966];
                this.field6969.method1821(-16741);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!os", name = "za", descriptor = "(IIIIII[BII)V")
    public final void method1011(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field6931;
        float var10;
        float var11;
        if (this.field7014 != null && ~this.field7014.field3100 <= ~arg2 && ~arg3 >= ~this.field7014.field3099) {
            this.field7014.method1366(0, arg2, false, arg6, 0, true, 6406, arg3, 0, 0);
            var10 = (float) arg3 * this.field7014.field4036 / (float) this.field7014.field3099;
            var11 = (float) arg2 * this.field7014.field4042 / (float) this.field7014.field3100;
        } else {
            this.field7014 = class622.method3630(arg6, 6406, false, -127, arg3, 6406, this, arg2);
            this.field7014.method1359(10497, false, false);
            var11 = this.field7014.field4042;
            var10 = this.field7014.field4036;
        }
        this.method2814(false);
        this.method2811(this.field7014, -2);
        this.method2796((byte) -80, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2843(-1, arg5);
        this.method2852(34165, (byte) 5, 34165);
        this.method2801(false, 34166, 0, 768);
        this.method2801(false, 5890, 2, 770);
        this.method2772(34166, 770, (byte) -107, 0);
        this.method2772(5890, 770, (byte) 121, 2);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        OpenGL.glBegin(7);
        float var15 = (float) arg3 + var13;
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var11);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var10, var11);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var10, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method2801(false, 5890, 0, 768);
        this.method2801(false, 34166, 2, 770);
        this.method2772(5890, 770, (byte) -124, 0);
        this.method2772(34166, 770, (byte) 68, 2);
    }

    @OriginalMember(owner = "client!os", name = "B", descriptor = "()V")
    public final void method341() {
        ++field6811;
        if (this.field6953 != null && this.field6953.method3049((byte) -123)) {
            this.field6944.method143(this.field6953, (byte) 127);
            this.field6941.method27(false);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILru;)V")
    public final void method2789(int arg0, class457 arg1) {
        if (arg0 != 0) {
            this.method2841(-87);
        }
        ++field6833;
        if (!this.field7102) {
            if (~this.field6966 <= -4) {
                throw new RuntimeException();
            } else {
                if (this.field6966 >= 0) {
                    this.field6965[this.field6966].method1813(-15450);
                }
                this.field6969 = this.field6971 = this.field6965[++this.field6966] = arg1;
                this.field6969.method1821(-16741);
            }
        } else {
            this.method2775(arg1, (byte) -9);
            this.method2793((byte) -3, arg1);
        }
    }

    @OriginalMember(owner = "client!os", name = "M", descriptor = "(F)V")
    public final void method987(float arg0) {
        ++field6895;
        if (this.field7000 != arg0) {
            this.field7000 = arg0;
            this.method2813(false);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(FFI)V")
    public final void method2790(float arg0, float arg1, int arg2) {
        this.field7023 = arg0;
        if (arg2 != 11327) {
            this.method1005((class520) null, (class510) null, (class105) null, (class525) null, -44);
        }
        ++field6904;
        this.field7037 = arg1;
        if (!this.field7098) {
            this.method2824(4617);
        }
    }

    @OriginalMember(owner = "client!os", name = "C", descriptor = "()Z")
    public final boolean method986() {
        ++field6868;
        return true;
    }

    @OriginalMember(owner = "client!os", name = "F", descriptor = "(IIII)V")
    public final void method993(int arg0, int arg1, int arg2, int arg3) {
        if (this.field7044 < arg1) {
            this.field7044 = arg1;
        }
        if (this.field6983 > arg3) {
            this.field6983 = arg3;
        }
        if (~this.field7011 < ~arg2) {
            this.field7011 = arg2;
        }
        ++field6889;
        if (this.field7029 < arg0) {
            this.field7029 = arg0;
        }
        OpenGL.glEnable(3089);
        this.method2797(true);
        this.method2827((byte) 114);
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "()Z")
    public final boolean method988() {
        ++field6826;
        return true;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IB)V")
    public final void method2791(int arg0, byte arg1) {
        ++field6752;
        if (~arg0 != -2) {
            if (arg0 != 0) {
                if (~arg0 == -3) {
                    this.method2852(34165, (byte) 45, 7681);
                } else if (arg0 == 3) {
                    this.method2852(260, (byte) 65, 8448);
                } else if (~arg0 == -5) {
                    this.method2852(34023, (byte) 62, 34023);
                }
            } else {
                this.method2852(8448, (byte) 23, 8448);
            }
        } else {
            this.method2852(7681, (byte) 78, 7681);
        }
        int var3 = -108 % ((27 - arg1) / 60);
    }

    @OriginalMember(owner = "client!os", name = "m", descriptor = "(IFFFFF)V")
    public final void method1008(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field6873;
        boolean var7 = this.field7050 != arg0;
        if (var7 || this.field7045 != arg1 || this.field7046 != arg2) {
            this.field7046 = arg2;
            this.field7050 = arg0;
            this.field7045 = arg1;
            if (var7) {
                this.field7069 = (float) (this.field7050 & 255) / 255.0F;
                this.field7063 = (float) (this.field7050 & 16711680) / 1.671168E7F;
                this.field7001 = (float) (65280 & this.field7050) / 65280.0F;
                this.method2813(false);
            }
            this.method2841(16384);
        }
        if (this.field7003[0] != arg3 || this.field7003[1] != arg4 || this.field7003[2] != arg5) {
            this.field7003[1] = arg4;
            this.field7003[2] = arg5;
            this.field7003[0] = arg3;
            this.field7052[1] = -arg4;
            this.field7052[0] = -arg3;
            this.field7052[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field7036[0] = arg3 * var8;
            this.field7036[1] = arg4 * var8;
            this.field7036[2] = arg5 * var8;
            this.field7018[1] = -this.field7036[1];
            this.field7018[0] = -this.field7036[0];
            this.field7018[2] = -this.field7036[2];
            this.method2809(-8482);
            this.field7090 = (int) (arg5 * 256.0F / arg4);
            this.field7033 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(FZ)V")
    public final void method2792(float arg0, boolean arg1) {
        if (!arg1) {
            this.method2830(60, (Buffer) null, 46, -26, true);
        }
        ++field6902;
        if (this.field7047 != arg0) {
            this.field7047 = arg0;
            if (~this.field7007 == -4) {
                this.method2832(-32093);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "Z", descriptor = "(I)V")
    public final void method321(int arg0) {
        this.method2796((byte) -80, 0);
        ++field6923;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIII)V")
    public final void method997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field6918;
        this.method983(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(BLru;)V")
    public final void method2793(byte arg0, class457 arg1) {
        if (arg0 != -3) {
            this.field6978 = null;
        }
        ++field6800;
        if (this.field6967 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field6967 <= -1) {
                this.field6972[this.field6967].method1822((byte) -75);
            }
            this.field6971 = this.field6972[++this.field6967] = arg1;
            this.field6971.method1812((byte) 32);
        }
    }

    @OriginalMember(owner = "client!os", name = "l", descriptor = "(I)V")
    public final void method2794(int arg0) {
        ++field6935;
        if (this.field6986 != arg0) {
            this.method2849(arg0 ^ 19);
            this.method2787(true, (byte) -118);
            this.method2836(2929, true);
            this.method2800(true, arg0 ^ -16);
            this.method2796((byte) -80, 1);
            this.field6986 = 16;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BII)V")
    public final synchronized void method2795(byte arg0, int arg1, int arg2) {
        ++field6783;
        class269 var4 = new class269(arg2);
        var4.field7465 = (long) arg1;
        this.field6978.method2492(var4, (byte) -103);
        int var5 = 115 / ((-10 - arg0) / 45);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lu;)V")
    public final void method971(class425 arg0) {
        this.field6964 = ((class16) arg0).field145;
        ++field6813;
        if (this.field7084 == null) {
            class444 var2 = new class444(80);
            if (this.field7004) {
                var2.method2697(-11, -1.0F);
                var2.method2697(-11, -1.0F);
                var2.method2697(-11, 0.0F);
                var2.method2697(-11, 0.0F);
                var2.method2697(-11, 1.0F);
                var2.method2697(-11, 1.0F);
                var2.method2697(-11, -1.0F);
                var2.method2697(-11, 0.0F);
                var2.method2697(-11, 1.0F);
                var2.method2697(-11, 1.0F);
                var2.method2697(-11, 1.0F);
                var2.method2697(-11, 1.0F);
                var2.method2697(-11, 0.0F);
                var2.method2697(-11, 1.0F);
                var2.method2697(-11, 0.0F);
                var2.method2697(-11, -1.0F);
                var2.method2697(-11, 1.0F);
                var2.method2697(-11, 0.0F);
                var2.method2697(-11, 0.0F);
                var2.method2697(-11, 0.0F);
            } else {
                var2.method2700(-1.0F, -353481768);
                var2.method2700(-1.0F, -353481768);
                var2.method2700(0.0F, -353481768);
                var2.method2700(0.0F, -353481768);
                var2.method2700(1.0F, -353481768);
                var2.method2700(1.0F, -353481768);
                var2.method2700(-1.0F, -353481768);
                var2.method2700(0.0F, -353481768);
                var2.method2700(1.0F, -353481768);
                var2.method2700(1.0F, -353481768);
                var2.method2700(1.0F, -353481768);
                var2.method2700(1.0F, -353481768);
                var2.method2700(0.0F, -353481768);
                var2.method2700(1.0F, -353481768);
                var2.method2700(0.0F, -353481768);
                var2.method2700(-1.0F, -353481768);
                var2.method2700(1.0F, -353481768);
                var2.method2700(0.0F, -353481768);
                var2.method2700(0.0F, -353481768);
                var2.method2700(0.0F, -353481768);
            }
            this.field7084 = this.method2781(var2.field6221, var2.field6162, 20, false, -115);
            this.field7054 = new class156(this.field7084, 5126, 3, 0);
            this.field7062 = new class156(this.field7084, 5126, 2, 12);
            this.field6950.method1647(3, this);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lr;Loaa;Lm;Lgr;I)V")
    public final void method1005(class520 arg0, class510 arg1, class105 arg2, class525 arg3, int arg4) {
        arg0.method1965(arg2, arg3, arg4);
        ++field6926;
        this.method989(arg1);
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1023(Canvas arg0) {
        ++field6887;
        long var2 = 0L;
        if (arg0 != null && this.field6831 != arg0) {
            if (this.field6756.containsKey(arg0)) {
                Long var4 = (Long) this.field6756.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field6837;
        }
        if (var2 == 0L) {
            throw new RuntimeException();
        } else {
            this.field6883.surfaceResized(var2);
            if (this.field6885 == arg0) {
                this.method2779((byte) -128);
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "D", descriptor = "()Z")
    public final boolean method1006() {
        ++field6888;
        return true;
    }

    @OriginalMember(owner = "client!os", name = "s", descriptor = "()Z")
    public final boolean method1031() {
        ++field6927;
        return this.field7101 && (!this.method345() || this.field7031);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lm;)V")
    public final void method999(class105 arg0) {
        this.field7073 = (class252) arg0;
        ++field6903;
        this.field7081.method1596(this.field7073, 2);
        if (this.field7007 != 1) {
            this.method2812((byte) -58);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BI)V")
    public final void method2796(byte arg0, int arg1) {
        if (~this.field7083 != ~arg1) {
            boolean var3;
            byte var4;
            boolean var5;
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -129) {
                        var3 = true;
                        var4 = 0;
                        var5 = false;
                    } else {
                        var5 = true;
                        var3 = true;
                        var4 = 3;
                    }
                } else {
                    var3 = true;
                    var4 = 2;
                    var5 = false;
                }
            } else {
                var3 = true;
                var5 = true;
                var4 = 1;
            }
            if (this.field7043 != var3) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field7043 = var3;
            }
            if (this.field7097 == !var5) {
                if (!var5) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field7097 = var5;
            }
            if (this.field7082 != var4) {
                if (~var4 != -2) {
                    if (var4 == 2) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    } else if (~var4 != -4) {
                        OpenGL.glDisable(3042);
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field7082 = var4;
            }
            this.field7083 = arg1;
            this.field6986 &= -29;
        }
        ++field6757;
        if (arg0 != -80) {
            this.field6950 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIF)Lat;")
    public final class535 method995(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field6836;
        return new class380(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1000(Canvas arg0) {
        ++field6794;
        if (this.field6831 == arg0) {
            throw new RuntimeException();
        } else if (this.field6756.containsKey(arg0)) {
            Long var2 = (Long) this.field6756.get(arg0);
            this.field6883.releaseSurface(arg0, var2);
            this.field6756.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(Z)V")
    public final void method992(boolean arg0) {
        this.field7089 = arg0;
        ++field6786;
        this.method2815(7720);
    }

    @OriginalMember(owner = "client!os", name = "e", descriptor = "(Z)V")
    private final void method2797(boolean arg0) {
        this.field7002 = (float) (-this.field7013 + this.field7029);
        this.field7060 = (float) (-this.field7026 + this.field6983);
        this.field6985 = (float) (-this.field7013 + this.field7011);
        if (!arg0) {
            this.field6944 = null;
        }
        this.field6997 = (float) (-this.field7026 + this.field7044);
        ++field6796;
    }

    @OriginalMember(owner = "client!os", name = "f", descriptor = "(I)V")
    public final void method981(int arg0) {
        this.method2831(-31492);
        ++field6760;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method968(Canvas arg0) {
        ++field6858;
        if (this.field6831 == arg0) {
            throw new RuntimeException();
        } else if (!this.field6756.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field6883.prepareSurface(arg0);
                if (var4 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field6756.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field6898;
        this.method2786(-2);
        this.method2796((byte) -80, arg9);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!os", name = "l", descriptor = "()Lm;")
    public final class105 method1020() {
        ++field6859;
        return new class252();
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lru;I)V")
    public final void method2798(class457 arg0, int arg1) {
        ++field6784;
        if (~this.field6968 <= -1 && this.field6970[this.field6968] == arg0) {
            this.field6970[this.field6968--] = null;
            arg0.method1803(true);
            if (this.field6968 >= arg1) {
                this.field6969 = this.field6970[this.field6968];
                this.field6969.method1808((byte) 120);
            } else {
                this.field6969 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(B)V")
    private final void method2799(byte arg0) {
        ++field6771;
        float[] var2 = this.field7020;
        if (arg0 != -23) {
            field6866 = null;
        }
        float var3 = (float) (-this.field7013 * this.field7099) / (float) this.field7066;
        float var4 = (float) ((this.field6912 - this.field7013) * this.field7099) / (float) this.field7066;
        float var5 = (float) (this.field7099 * this.field7026) / (float) this.field6989;
        float var6 = (float) ((-this.field6936 + this.field7026) * this.field7099) / (float) this.field6989;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field7099 * 2.0F;
            var2[11] = -1.0F;
            var2[13] = 0.0F;
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[6] = 0.0F;
            var2[14] = this.field7075 = -((float) this.field7038 * var7) / (float) (-this.field7099 + this.field7038);
            var2[0] = var7 / (var4 - var3);
            var2[15] = 0.0F;
            var2[7] = 0.0F;
            var2[10] = this.field7024 = (float) (-(this.field7038 - -this.field7099)) / (float) (-this.field7099 + this.field7038);
            var2[5] = var7 / (var5 - var6);
            var2[1] = 0.0F;
            var2[12] = 0.0F;
            var2[2] = 0.0F;
            var2[4] = 0.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[3] = 0.0F;
        } else {
            var2[11] = 0.0F;
            var2[12] = 0.0F;
            var2[3] = 0.0F;
            var2[2] = 0.0F;
            var2[7] = 0.0F;
            var2[5] = 1.0F;
            var2[4] = 0.0F;
            var2[10] = 1.0F;
            var2[0] = 1.0F;
            var2[9] = 0.0F;
            var2[14] = 0.0F;
            var2[8] = 0.0F;
            var2[13] = 0.0F;
            var2[15] = 1.0F;
            var2[6] = 0.0F;
            var2[1] = 0.0F;
        }
        this.method2780(97);
    }

    @OriginalMember(owner = "client!os", name = "o", descriptor = "()Z")
    public final boolean method955() {
        ++field6933;
        return false;
    }

    @OriginalMember(owner = "client!os", name = "P", descriptor = "()F")
    public final float method957() {
        ++field6799;
        return this.field6990;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(ZI)V")
    public final void method2800(boolean arg0, int arg1) {
        if (arg1 != -32) {
            this.method2809(118);
        }
        ++field6862;
        if (this.field7071 != arg0) {
            this.field7071 = arg0;
            this.method2815(7720);
            this.field6986 &= -32;
        }
    }

    @OriginalMember(owner = "client!os", name = "G", descriptor = "(ILpa;II)V")
    public final void method956(int arg0, class594 arg1, int arg2, int arg3) {
        ++field6827;
        class1 var5 = (class1) arg1;
        class273 var6 = var5.field2;
        this.method2814(false);
        this.method2811(var5.field2, -2);
        this.method2796((byte) -80, 1);
        this.method2852(7681, (byte) 55, 8448);
        this.method2801(false, 34167, 0, 768);
        float var7 = var6.field4042 / (float) var6.field4035;
        float var8 = var6.field4036 / (float) var6.field4043;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7029) * var7, (float) (this.field7044 - arg3) * var8);
        OpenGL.glVertex2i(this.field7029, this.field7044);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7029) * var7, (float) (this.field6983 - arg3) * var8);
        OpenGL.glVertex2i(this.field7029, this.field6983);
        OpenGL.glTexCoord2f((float) (this.field7011 - arg2) * var7, (float) (-arg3 + this.field6983) * var8);
        OpenGL.glVertex2i(this.field7011, this.field6983);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7011) * var7, (float) (-arg3 + this.field7044) * var8);
        OpenGL.glVertex2i(this.field7011, this.field7044);
        OpenGL.glEnd();
        this.method2801(false, 5890, 0, 768);
    }

    @OriginalMember(owner = "client!os", name = "k", descriptor = "()V")
    public final void method288() throws class477 {
        try {
            this.field6883.swapBuffers();
        } catch (Exception var1) {
        }
        ++field6869;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZIII)V")
    public final void method2801(boolean arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg2 + 34176, arg1);
        ++field6954;
        if (arg0) {
            this.method1011(102, 76, -116, 36, -74, 83, (byte[]) null, -98, 111);
        }
        OpenGL.glTexEnvi(8960, arg2 + 34192, arg3);
    }

    @OriginalMember(owner = "client!os", name = "x", descriptor = "()Z")
    public final boolean method1007() {
        ++field6847;
        return true;
    }

    @OriginalMember(owner = "client!os", name = "e", descriptor = "(B)V")
    private final void method2802(byte arg0) {
        ++field6901;
        if (arg0 == -27) {
            if (this.field7074 && this.field7098 | this.field7086 >= 0) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "q", descriptor = "()Z")
    public final boolean method345() {
        ++field6788;
        return this.field6953 != null && this.field6953.method3049((byte) -98);
    }

    @OriginalMember(owner = "client!os", name = "ra", descriptor = "()F")
    public final float method1041() {
        ++field6764;
        return this.field7061;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ldd;[Lqr;Z)Lra;")
    public final class262 method998(class166 arg0, class610[] arg1, boolean arg2) {
        ++field6932;
        return new class303(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!os", name = "f", descriptor = "(B)V")
    private final void method2803(byte arg0) {
        ++field6753;
        if (this.field7017 && !this.field7056) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        int var2 = -105 / ((-8 - arg0) / 63);
    }

    @OriginalMember(owner = "client!os", name = "f", descriptor = "(IIIIII)V")
    public final void method980(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6807;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method2786(-2);
        this.method2796((byte) -80, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7101) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7101) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!os", name = "g", descriptor = "(B)V")
    public final void method2804(byte arg0) {
        if (~this.field6986 != -9) {
            this.method2817(false);
            this.method2787(true, (byte) -118);
            this.method2836(2929, true);
            this.method2800(true, -32);
            this.method2796((byte) -80, 1);
            this.field6986 = 8;
        }
        ++field6805;
        if (arg0 <= 111) {
            this.field6966 = 45;
        }
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(ZI)V")
    public final void method2805(boolean arg0, int arg1) {
        if (arg1 > -74) {
            this.method327(103, 24, -56, 46);
        }
        ++field6774;
        if (!arg0 == this.field7056) {
            this.field7056 = arg0;
            this.method2803((byte) 125);
        }
    }

    @OriginalMember(owner = "client!os", name = "h", descriptor = "(B)V")
    private final void method2806(byte arg0) {
        this.method2778(-2, 0);
        ++field6841;
        for (int var2 = this.field7035 + -1; var2 >= 0; --var2) {
            this.method2842(var2, (byte) 42);
            this.method2811((class541) null, -2);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2852(8448, (byte) 73, 8448);
        this.method2801(false, 34168, 2, 770);
        this.method2773(-125);
        this.field7083 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field7082 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field7097 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field7043 = true;
        this.method2787(true, (byte) 39);
        this.method2828(5126, true);
        this.method2836(2929, true);
        this.method2800(true, -32);
        this.method2833((byte) 117);
        this.field6883.setSwapInterval(0);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        int var3 = 3 / ((-3 - arg0) / 41);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] var4 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var5 = 0; ~var5 > -9; ++var5) {
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
        this.field7050 = this.field7027 = -1;
        this.method985();
    }

    @OriginalMember(owner = "client!os", name = "n", descriptor = "()V")
    public final void method985() {
        this.field7044 = 0;
        this.field6983 = this.field6936;
        this.field7029 = 0;
        ++field6938;
        this.field7011 = this.field6912;
        OpenGL.glDisable(3089);
        this.method2797(true);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIZ)V")
    public final void method2807(int arg0, int arg1, boolean arg2) {
        ++field6942;
        if (arg0 > -58) {
            this.field7040 = 54;
        }
        this.method2774(true, arg1, false, arg2);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(FFFB)V")
    private final void method2808(float arg0, float arg1, float arg2, byte arg3) {
        OpenGL.glMatrixMode(5890);
        ++field6758;
        if (this.field7096) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg2, arg0, arg1);
        if (arg3 < -125) {
            OpenGL.glMatrixMode(5888);
            this.field7096 = true;
        }
    }

    @OriginalMember(owner = "client!os", name = "z", descriptor = "()Z")
    public final boolean method973() {
        ++field6879;
        return this.field6943.method3712((byte) 108, 3);
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(IIIIII)V")
    public final void method1032(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6772;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        this.method2786(-2);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method2796((byte) -80, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7101) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7101) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method354(Rectangle[] arg0, int arg1) throws class477 {
        ++field6910;
        this.method288();
    }

    @OriginalMember(owner = "client!os", name = "YA", descriptor = "()I")
    public final int method311() {
        ++field6917;
        int var1 = this.field7106;
        this.field7106 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!os", name = "m", descriptor = "(I)V")
    public final void method2809(int arg0) {
        ++field6921;
        if (arg0 == -8482) {
            OpenGL.glLightfv(16384, 4611, this.field7036, 0);
            OpenGL.glLightfv(16385, 4611, this.field7018, 0);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILeea;)V")
    public final void method2810(int arg0, class407 arg1) {
        if (arg0 != -29071) {
            this.method2799((byte) -12);
        }
        if (this.field7055 != arg1) {
            if (this.field7070) {
                OpenGL.glBindBufferARB(34963, arg1.method57((byte) 123));
            }
            this.field7055 = arg1;
        }
        ++field6815;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lqr;Z)Lha;")
    public final class116 method961(class610 arg0, boolean arg1) {
        ++field6797;
        int[] var3 = new int[arg0.field8975 * arg0.field8972];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field8970 == null) {
            for (int var6 = 0; ~arg0.field8972 < ~var6; ++var6) {
                for (int var7 = 0; var7 < arg0.field8975; ++var7) {
                    int var8 = arg0.field8974[255 & arg0.field8976[var4++]];
                    var3[var5++] = ~var8 != -1 ? class313.method1926(-16777216, var8) : 0;
                }
            }
        } else {
            for (int var9 = 0; ~var9 > ~arg0.field8972; ++var9) {
                for (int var11 = 0; arg0.field8975 > var11; ++var11) {
                    var3[var5++] = class313.method1926(arg0.field8974[class637.method3693(255, arg0.field8976[var4])], arg0.field8970[var4] << 24);
                    ++var4;
                }
            }
        }
        class116 var10 = this.method982(var3, 0, arg0.field8975, arg0.field8975, arg0.field8972);
        var10.method720(arg0.field8971, arg0.field8973, arg0.field8968, arg0.field8969);
        return var10;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lbaa;I)V")
    public final void method2811(class541 arg0, int arg1) {
        ++field6845;
        class541 var3 = this.field7078[this.field6992];
        if (arg0 != var3) {
            if (arg0 == null) {
                OpenGL.glDisable(var3.field8096);
            } else {
                if (var3 == null) {
                    OpenGL.glEnable(arg0.field8096);
                } else if (~arg0.field8096 != ~var3.field8096) {
                    OpenGL.glDisable(var3.field8096);
                    OpenGL.glEnable(arg0.field8096);
                }
                OpenGL.glBindTexture(arg0.field8096, arg0.method3176(arg1 ^ -6881));
            }
            this.field7078[this.field6992] = arg0;
        }
        this.field6986 &= arg1;
    }

    @OriginalMember(owner = "client!os", name = "r", descriptor = "()I")
    public final int method994() {
        ++field6860;
        return 4;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(Z)V")
    public final void method953(boolean arg0) {
        ++field6890;
    }

    @OriginalMember(owner = "client!os", name = "i", descriptor = "(B)V")
    private final void method2812(byte arg0) {
        ++field6780;
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg0 >= -35) {
            this.method976();
        }
        OpenGL.glMultMatrixf(this.field7073.method1594(106), 0);
        if (this.field7098) {
            this.field6943.field9313.method444(95);
        }
        this.method2809(-8482);
        this.method2771(5890);
    }

    @OriginalMember(owner = "client!os", name = "f", descriptor = "(Z)V")
    private final void method2813(boolean arg0) {
        class133.field1756[0] = this.field7063 * this.field7000;
        if (arg0) {
            this.field7021 = null;
        }
        class133.field1756[3] = 1.0F;
        ++field6809;
        class133.field1756[1] = this.field7001 * this.field7000;
        class133.field1756[2] = this.field7069 * this.field7000;
        OpenGL.glLightModelfv(2899, class133.field1756, 0);
    }

    @OriginalMember(owner = "client!os", name = "e", descriptor = "()Lm;")
    public final class105 method1038() {
        ++field6779;
        return this.field6956;
    }

    @OriginalMember(owner = "client!os", name = "g", descriptor = "(Z)V")
    public final void method2814(boolean arg0) {
        ++field6855;
        if (!arg0) {
            if (~this.field6986 != -3) {
                this.method2844(-57);
                this.method2787(false, (byte) -121);
                this.method2828(5126, false);
                this.method2836(2929, false);
                this.method2800(false, -32);
                this.method2778(-2, 0);
                this.field6986 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "n", descriptor = "(I)V")
    private final void method2815(int arg0) {
        if (arg0 == 7720) {
            ++field6801;
            OpenGL.glDepthMask(this.field7071 && this.field7089);
        }
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(IIIIII)V")
    public final void method983(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6877;
        this.method2786(-2);
        this.method2796((byte) -80, arg5);
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var8 * var9;
        float var11 = var7 * var9;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var11 + 0.35F, (float) arg3 + var10 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!os", name = "j", descriptor = "(B)V")
    public final void method2816(byte arg0) {
        OpenGL.glPushMatrix();
        if (arg0 != 31) {
            this.field6976 = 57;
        }
        ++field6857;
    }

    @OriginalMember(owner = "client!os", name = "h", descriptor = "(Z)V")
    private final void method2817(boolean arg0) {
        ++field6909;
        if (!arg0) {
            if (this.field7007 != 2) {
                this.field7007 = 2;
                this.method2822((byte) 28);
                this.method2812((byte) -57);
                this.field6986 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "o", descriptor = "(I)V")
    private final void method2818(int arg0) {
        int var2 = -51 % ((-57 - arg0) / 41);
        OpenGL.glViewport(this.field6996, this.field6991, this.field6912, this.field6936);
        ++field6802;
    }

    @OriginalMember(owner = "client!os", name = "q", descriptor = "(IIII)V")
    public final void method1019(int arg0, int arg1, int arg2, int arg3) {
        this.field7028 = arg0;
        this.field7040 = arg3;
        this.field7041 = arg2;
        ++field6881;
        this.field7057 = arg1;
        this.field7098 = true;
        this.field6943.method3713(0, false, 0, -120, 3, false);
        this.field6943.field9313.method444(81);
        this.method2824(4617);
        this.method2802((byte) -27);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "([Lr;Loaa;Lm;[Lgr;I)V")
    public final void method958(class520[] arg0, class510 arg1, class105 arg2, class525[] arg3, int arg4) {
        this.method967(arg0, arg2, arg3, arg4);
        ++field6804;
        this.method989(arg1);
    }

    @OriginalMember(owner = "client!os", name = "k", descriptor = "(B)Lbo;")
    public final class227 method2819(byte arg0) {
        ++field6822;
        if (arg0 != -12) {
            this.method1028(-73, -41, (int[]) null, (int[]) null);
        }
        return this.field7064 == null ? null : this.field7064.method665((byte) -127);
    }

    @OriginalMember(owner = "client!os", name = "l", descriptor = "(B)V")
    public final void method2820(byte arg0) {
        if (arg0 < 87) {
            this.method970(41);
        }
        ++field6872;
        if (this.field6986 != 4) {
            this.method2844(-79);
            this.method2787(false, (byte) -98);
            this.method2828(5126, false);
            this.method2836(2929, false);
            this.method2800(false, -32);
            this.method2778(-2, 0);
            this.method2796((byte) -80, 1);
            this.field6986 = 4;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
    public final synchronized void method351(int arg0) {
        ++field6848;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field6977.method2488((byte) 127)) {
            class269 var12 = (class269) this.field6977.method2498((byte) 38);
            class51.field604[var3++] = (int) var12.field7465;
            this.field6975 -= var12.field3986;
            if (~var3 == -1001) {
                OpenGL.glDeleteBuffersARB(var3, class51.field604, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class51.field604, 0);
            var3 = 0;
        }
        while (!this.field6978.method2488((byte) 111)) {
            class269 var11 = (class269) this.field6978.method2498((byte) 101);
            class51.field604[var3++] = (int) var11.field7465;
            this.field6974 -= var11.field3986;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class51.field604, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteTextures(var3, class51.field604, 0);
            var3 = 0;
        }
        while (!this.field6979.method2488((byte) 126)) {
            class269 var10 = (class269) this.field6979.method2498((byte) 65);
            class51.field604[var3++] = var10.field3986;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class51.field604, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class51.field604, 0);
            var3 = 0;
        }
        while (!this.field6980.method2488((byte) 123)) {
            class269 var9 = (class269) this.field6980.method2498((byte) 79);
            class51.field604[var3++] = (int) var9.field7465;
            this.field6976 -= var9.field3986;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class51.field604, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class51.field604, 0);
            boolean var4 = false;
        }
        while (!this.field6973.method2488((byte) 126)) {
            class269 var8 = (class269) this.field6973.method2498((byte) 40);
            OpenGL.glDeleteLists((int) var8.field7465, var8.field3986);
        }
        while (!this.field6981.method2488((byte) 109)) {
            class496 var7 = this.field6981.method2498((byte) 96);
            OpenGL.glDeleteProgramARB((int) var7.field7465);
        }
        while (!this.field6982.method2488((byte) 115)) {
            class496 var6 = this.field6982.method2498((byte) 44);
            OpenGL.glDeleteObjectARB(var6.field7465);
        }
        while (!this.field6973.method2488((byte) 100)) {
            class269 var5 = (class269) this.field6973.method2498((byte) 104);
            OpenGL.glDeleteLists((int) var5.field7465, var5.field3986);
        }
        this.field6941.method25(-1);
        if (~this.method1029() < -100663297 && ~(this.field6988 - -60000L) > ~class450.method2719((byte) -88)) {
            System.gc();
            this.field6988 = class450.method2719((byte) 120);
        }
        this.field6961 = var2;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIB)V")
    public final synchronized void method2821(int arg0, int arg1, byte arg2) {
        ++field6853;
        class269 var4 = new class269(arg1);
        var4.field7465 = (long) arg0;
        int var5 = -49 / ((arg2 - 46) / 62);
        this.field6977.method2492(var4, (byte) -123);
    }

    @OriginalMember(owner = "client!os", name = "m", descriptor = "(B)V")
    private final void method2822(byte arg0) {
        OpenGL.glMatrixMode(5889);
        ++field6789;
        OpenGL.glLoadMatrixf(this.field7020, 0);
        if (arg0 < 12) {
            this.method2827((byte) -40);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Llq;Z)V")
    public final void method2823(class9 arg0, boolean arg1) {
        if (!arg1) {
            ++field6925;
            if (this.field7053 != arg0) {
                if (this.field7070) {
                    OpenGL.glBindBufferARB(34962, arg0.method45(3497));
                }
                this.field7053 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Llh;)V")
    public final void method962(class125 arg0) {
        ++field6913;
        this.field7064 = (class112) arg0;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIII)V")
    public final void method280(int arg0, int arg1, int arg2, int arg3) {
        this.field6944.method149(arg0, arg2, 120, arg1, arg3);
        ++field6768;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIZ)Lha;")
    public final class116 method1040(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field6773;
        return new class377(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!os", name = "U", descriptor = "()I")
    public final int method1029() {
        ++field6777;
        return this.field6976 + this.field6975 - -this.field6974;
    }

    @OriginalMember(owner = "client!os", name = "p", descriptor = "(I)V")
    private final void method2824(int arg0) {
        ++field6852;
        int var2;
        if (this.field7098) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field7057;
        } else {
            this.field7051 = (float) (-this.field7010 + this.field7038) + -this.field7023;
            this.field6987 = this.field7051 - (float) this.field7086 * this.field7037;
            if ((float) this.field7099 > this.field6987) {
                this.field6987 = (float) this.field7099;
            }
            OpenGL.glFogf(2915, this.field6987);
            OpenGL.glFogf(2916, this.field7051);
            var2 = this.field7027;
        }
        class133.field1756[0] = (float) class637.method3693(var2, 16711680) / 1.671168E7F;
        if (arg0 == 4617) {
            class133.field1756[1] = (float) class637.method3693(var2, 65280) / 65280.0F;
            class133.field1756[2] = (float) class637.method3693(var2, 255) / 255.0F;
            OpenGL.glFogfv(2918, class133.field1756, 0);
            if (this.field7098) {
                this.field6943.field9313.method447((byte) -113);
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BI[BZI)Leea;")
    public final class407 method2825(byte arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        if (arg0 < 107) {
            return null;
        } else {
            ++field6905;
            return (class407) (!this.field7070 || arg3 && !this.field7012 ? new class11(this, arg4, arg2, arg1) : new class92(this, arg4, arg2, arg1, arg3));
        }
    }

    @OriginalMember(owner = "client!os", name = "h", descriptor = "()Z")
    public final boolean method278() {
        ++field6759;
        if (this.field6953 != null) {
            if (!this.field6953.method3049((byte) 36)) {
                if (!this.field6944.method147(this.field6953, false)) {
                    return false;
                }
                this.field6941.method27(false);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!os", name = "i", descriptor = "(Z)V")
    public final void method2826(boolean arg0) {
        ++field6790;
        if (arg0) {
            OpenGL.glPopMatrix();
        }
    }

    @OriginalMember(owner = "client!os", name = "JA", descriptor = "(IIII)V")
    public final void method979(int arg0, int arg1, int arg2, int arg3) {
        ++field6878;
        if (!this.field7098) {
            throw new RuntimeException("");
        } else {
            this.field7057 = arg1;
            this.field7040 = arg3;
            this.field7028 = arg0;
            this.field7041 = arg2;
            this.field6943.field9313.method444(103);
            this.method2824(4617);
        }
    }

    @OriginalMember(owner = "client!os", name = "n", descriptor = "(B)V")
    private final void method2827(byte arg0) {
        if (~this.field7011 <= ~this.field7029 && this.field6983 >= this.field7044) {
            OpenGL.glScissor(this.field7029 + this.field6996, this.field6991 + this.field6936 + -this.field6983, -this.field7029 + this.field7011, this.field6983 - this.field7044);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field6820;
        if (arg0 <= 82) {
            this.method2789(-4, (class457) null);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IZ)V")
    public final void method2828(int arg0, boolean arg1) {
        if (arg0 != 5126) {
            this.method1034();
        }
        if (this.field7017 == !arg1) {
            this.field7017 = arg1;
            this.method2803((byte) -121);
            this.field6986 &= -8;
        }
        ++field6946;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lol;I)V")
    public final void method2829(class252 arg0, int arg1) {
        ++field6939;
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg0.method1594(109), arg1);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILjaclib/memory/Buffer;IIZ)Llq;")
    public final class9 method2830(int arg0, Buffer arg1, int arg2, int arg3, boolean arg4) {
        ++field6842;
        if (!this.field7070 || arg4 && !this.field7012) {
            if (arg3 != -313244496) {
                this.method2800(true, 0);
            }
            return new class296(this, arg0, arg1);
        } else {
            return new class123(this, arg0, arg1, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!os", name = "q", descriptor = "(I)V")
    private final void method2831(int arg0) {
        if (arg0 != -31492) {
            this.method1025((int[]) null);
        }
        ++field6825;
        int var2 = 0;
        while (!this.field6883.method3389()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            class428.method2624(1, 1000L);
        }
    }

    @OriginalMember(owner = "client!os", name = "y", descriptor = "()Z")
    public final boolean method977() {
        ++field6830;
        return true;
    }

    @OriginalMember(owner = "client!os", name = "e", descriptor = "(I)Lu;")
    public final class425 method1013(int arg0) {
        ++field6876;
        class16 var2 = new class16(arg0);
        this.field6963.method2492(var2, (byte) -95);
        return var2;
    }

    @OriginalMember(owner = "client!os", name = "g", descriptor = "()Z")
    public final boolean method1012() {
        ++field6803;
        return true;
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "([I)V")
    public final void method1025(int[] arg0) {
        arg0[1] = this.field7044;
        arg0[3] = this.field6983;
        arg0[0] = this.field7029;
        ++field6856;
        arg0[2] = this.field7011;
    }

    @OriginalMember(owner = "client!os", name = "ta", descriptor = "(II)V")
    public final void method1021(int arg0, int arg1) {
        ++field6945;
        if (this.field7099 != arg0 || this.field7038 != arg1) {
            this.field7038 = arg1;
            this.field7099 = arg0;
            this.method2799((byte) -23);
            this.method2824(4617);
            if (this.field7007 == 3) {
                this.method2832(-32093);
                return;
            }
            if (this.field7007 != 2) {
                return;
            }
            this.method2822((byte) 65);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lbt;IIII)Lr;")
    public final class520 method954(class114 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6829;
        return new class584(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!os", name = "i", descriptor = "()Z")
    public final boolean method984() {
        ++field6861;
        return this.field6953 != null && (this.field6949 <= 1 || this.field7031);
    }

    @OriginalMember(owner = "client!os", name = "r", descriptor = "(I)V")
    private final void method2832(int arg0) {
        ++field6755;
        float var2 = (float) (-this.field7013) * this.field7047 / (float) this.field7066;
        float var3 = (float) (-this.field7026) * this.field7047 / (float) this.field6989;
        float var4 = (float) (-this.field7013 + this.field6912) * this.field7047 / (float) this.field7066;
        float var5 = (float) (this.field6936 - this.field7026) * this.field7047 / (float) this.field6989;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (arg0 != -32093) {
            this.field7048 = null;
        }
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field7099 + -this.field7061), (double) ((float) this.field7038 + -this.field7061));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!os", name = "CA", descriptor = "()I")
    public final int method960() {
        ++field6928;
        return this.field7038;
    }

    @OriginalMember(owner = "client!os", name = "o", descriptor = "(B)V")
    public final void method2833(byte arg0) {
        if (this.field7007 != 0) {
            this.field6986 &= -32;
            this.field7007 = 0;
        }
        if (arg0 > 109) {
            ++field6835;
        }
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(IIII)V")
    public final void method2834(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 52 % ((arg3 - -8) / 52);
        ++field6762;
        OpenGL.glDrawArrays(arg0, arg2, arg1);
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(BI)V")
    public final synchronized void method2835(byte arg0, int arg1) {
        ++field6806;
        class269 var3 = new class269(arg1);
        this.field6979.method2492(var3, (byte) 124);
        if (arg0 < 86) {
            this.field7063 = -0.63792163F;
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(IZ)V")
    public final void method2836(int arg0, boolean arg1) {
        ++field6782;
        if (!arg1 == this.field7016) {
            if (arg1) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field6986 &= -32;
            this.field7016 = arg1;
        }
        if (arg0 != 2929) {
            this.field7021 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "([Lr;Lm;[Lgr;I)V")
    public final void method967(class520[] arg0, class105 arg1, class525[] arg2, int arg3) {
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method1965(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
        ++field6816;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(FFFIF)V")
    public final void method2837(float arg0, float arg1, float arg2, int arg3, float arg4) {
        class133.field1756[0] = arg0;
        class133.field1756[2] = arg4;
        if (arg3 == -15078) {
            ++field6832;
            class133.field1756[3] = arg2;
            class133.field1756[1] = arg1;
            OpenGL.glTexEnvfv(8960, 8705, class133.field1756, 0);
        }
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "()Z")
    public final boolean method1030() {
        ++field6864;
        return true;
    }

    @OriginalMember(owner = "client!os", name = "p", descriptor = "(B)V")
    public static void method2838(byte arg0) {
        if (arg0 == 79) {
            field6828 = null;
            field6812 = null;
            field6924 = null;
            field6955 = null;
            field6866 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
    public static final void method2839(boolean arg0, String arg1, boolean arg2) {
        ++field6947;
        class549.field8190.field8794 = 1;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; ~class216.field3204.field8460 < ~var6; ++var6) {
            class414 var9 = class216.field3204.method3357(var6, (byte) -59);
            if ((!arg0 || var9.field5916) && var9.field5928 == -1 && var9.field5929 == -1 && ~var9.field5888 == -1 && ~var9.field5900.toLowerCase().indexOf(var3) != 0) {
                if (var5 >= 250) {
                    class642.field9327 = null;
                    class538.field7974 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; ~var5 < ~var11; ++var11) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class642.field9327 = var4;
        class538.field7974 = var5;
        class481.field7298 = 0;
        String[] var7 = new String[class538.field7974];
        for (int var8 = 0; class538.field7974 > var8; ++var8) {
            var7[var8] = class216.field3204.method3357(var4[var8], (byte) -112).field5900;
        }
        class494.method2989(var7, (byte) -55, class642.field9327);
        if (!arg2) {
            method2838((byte) -100);
        }
        class549.field8190.method3488(false);
        class549.field8190.field8794 = 2;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(JI)V")
    public final synchronized void method2840(long arg0, int arg1) {
        ++field6850;
        class496 var4 = new class496();
        var4.field7465 = arg0;
        this.field6982.method2492(var4, (byte) -115);
        if (arg1 < 8) {
            this.field7068 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "s", descriptor = "(I)V")
    private final void method2841(int arg0) {
        class133.field1756[2] = this.field7069 * this.field7045;
        class133.field1756[0] = this.field7063 * this.field7045;
        class133.field1756[3] = 1.0F;
        ++field6886;
        class133.field1756[1] = this.field7045 * this.field7001;
        OpenGL.glLightfv(arg0, 4609, class133.field1756, 0);
        class133.field1756[2] = -this.field7046 * this.field7069;
        class133.field1756[1] = -this.field7046 * this.field7001;
        class133.field1756[3] = 1.0F;
        class133.field1756[0] = -this.field7046 * this.field7063;
        OpenGL.glLightfv(16385, 4609, class133.field1756, 0);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V")
    public final void method307(boolean arg0) {
        ++field6775;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(IB)V")
    public final void method2842(int arg0, byte arg1) {
        if (~this.field6992 != ~arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field6992 = arg0;
        }
        ++field6851;
        if (arg1 != 42) {
            this.method2844(-127);
        }
    }

    @OriginalMember(owner = "client!os", name = "g", descriptor = "(II)V")
    public final void method2843(int arg0, int arg1) {
        ++field6767;
        class133.field1756[1] = (float) class637.method3693(arg1, 65280) / 65280.0F;
        if (arg0 == -1) {
            class133.field1756[2] = (float) class637.method3693(arg1, 255) / 255.0F;
            class133.field1756[0] = (float) class637.method3693(arg1, 16711680) / 1.671168E7F;
            class133.field1756[3] = (float) (arg1 >>> 24) / 255.0F;
            OpenGL.glTexEnvfv(8960, 8705, class133.field1756, 0);
        }
    }

    @OriginalMember(owner = "client!os", name = "m", descriptor = "()Z")
    public final boolean method976() {
        ++field6824;
        return true;
    }

    @OriginalMember(owner = "client!os", name = "UA", descriptor = "(IIIII)V")
    public final void method1015(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2786(-2);
        ++field6838;
        this.method2796((byte) -80, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!os", name = "E", descriptor = "(III)V")
    public final void method974(int arg0, int arg1, int arg2) {
        if (this.field7027 != arg0 || this.field7086 != arg1 || this.field7010 != arg2) {
            this.field7086 = arg1;
            this.field7027 = arg0;
            this.field7010 = arg2;
            if (!this.field7098) {
                this.method2824(4617);
                this.method2802((byte) -27);
            }
        }
        ++field6810;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(FFF)V")
    public final void method347(float arg0, float arg1, float arg2) {
        class580.field8540 = arg1;
        class298.field4355 = arg0;
        class56.field688 = arg2;
        ++field6763;
    }

    @OriginalMember(owner = "client!os", name = "la", descriptor = "(FF)V")
    public final void method1009(float arg0, float arg1) {
        ++field6776;
        if (this.field6990 != arg0 || this.field7061 != arg1) {
            this.field7061 = arg1;
            this.field6990 = arg0;
            this.method2780(-121);
            if (this.field7007 != 3) {
                if (this.field7007 == 2) {
                    this.method2822((byte) 18);
                    return;
                }
            } else {
                this.method2832(-32093);
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "A", descriptor = "()Z")
    public final boolean method1002() {
        ++field6892;
        return false;
    }

    @OriginalMember(owner = "client!os", name = "t", descriptor = "(I)V")
    private final void method2844(int arg0) {
        ++field6843;
        if (arg0 > -51) {
            this.method313();
        }
        if (~this.field7007 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field6912 > 0 && this.field6936 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field6912, (double) this.field6936, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field6986 &= -25;
            this.field7007 = 1;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lol;Z)V")
    public final void method2845(class252 arg0, boolean arg1) {
        OpenGL.glLoadMatrixf(arg0.method1594(-77), 0);
        if (!arg1) {
            this.method2818(93);
        }
        ++field6897;
    }

    @OriginalMember(owner = "client!os", name = "v", descriptor = "(IIII)[I")
    public final int[] method327(int arg0, int arg1, int arg2, int arg3) {
        ++field6870;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + this.field6936 + -arg1, arg2, 1, 32993, this.field7019, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Laf;Laf;Laf;ILaf;)V")
    public final void method2846(class156 arg0, class156 arg1, class156 arg2, int arg3, class156 arg4) {
        if (arg0 != null) {
            this.method2823(arg0.field1995, false);
            OpenGL.glVertexPointer(arg0.field2000, arg0.field1999, this.field7053.method47(true), this.field7053.method46(-22678) + (long) arg0.field1991);
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        if (arg3 == 32888) {
            ++field6874;
            if (arg4 != null) {
                this.method2823(arg4.field1995, false);
                OpenGL.glNormalPointer(arg4.field1999, this.field7053.method47(true), this.field7053.method46(-22678) - -((long) arg4.field1991));
                OpenGL.glEnableClientState(32885);
            } else {
                OpenGL.glDisableClientState(32885);
            }
            if (arg1 != null) {
                this.method2823(arg1.field1995, false);
                OpenGL.glColorPointer(arg1.field2000, arg1.field1999, this.field7053.method47(true), this.field7053.method46(-22678) + (long) arg1.field1991);
                OpenGL.glEnableClientState(32886);
            } else {
                OpenGL.glDisableClientState(32886);
            }
            if (arg2 == null) {
                OpenGL.glDisableClientState(32888);
            } else {
                this.method2823(arg2.field1995, false);
                OpenGL.glTexCoordPointer(arg2.field2000, arg2.field1999, this.field7053.method47(true), this.field7053.method46(-22678) + (long) arg2.field1991);
                OpenGL.glEnableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILeea;III)V")
    public final void method2847(int arg0, class407 arg1, int arg2, int arg3, int arg4) {
        ++field6899;
        int var6 = arg1.method50((byte) 102);
        int var7 = arg4 * this.method2783(-9, var6);
        this.method2810(-29071, arg1);
        if (arg0 < -60) {
            OpenGL.glDrawElements(arg2, arg3, var6, arg1.method54(true) + (long) var7);
        }
    }

    @OriginalMember(owner = "client!os", name = "g", descriptor = "(I)V")
    public final void method1044(int arg0) {
        ++field6893;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V")
    public final synchronized void method2848(int arg0, int arg1, int arg2) {
        ++field6922;
        if (arg2 >= -63) {
            this.method2824(-100);
        }
        class269 var4 = new class269(arg1);
        var4.field7465 = (long) arg0;
        this.field6980.method2492(var4, (byte) -98);
    }

    @OriginalMember(owner = "client!os", name = "u", descriptor = "(I)V")
    private final void method2849(int arg0) {
        ++field6839;
        if (~this.field7007 != -4) {
            this.field7007 = 3;
            this.method2832(-32093);
            this.method2812((byte) -55);
            this.field6986 &= -8;
        }
        if (arg0 != 3) {
            this.field6956 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(III)V")
    public final void method2850(int arg0, int arg1, int arg2) {
        this.field6996 = arg2;
        if (arg1 == -169876144) {
            this.field6991 = arg0;
            ++field6817;
            this.method2818(106);
            this.method2827((byte) 107);
        }
    }

    @OriginalMember(owner = "client!os", name = "q", descriptor = "(B)V")
    private final void method2851(byte arg0) {
        this.field6883.method3387();
        ++field6785;
        int var2 = -55 / ((34 - arg0) / 47);
    }

    @OriginalMember(owner = "client!os", name = "v", descriptor = "()V")
    public final void method286() {
        ++field6865;
        if (this.field7015 && this.field6912 > 0 && this.field6936 > 0) {
            int var1 = this.field7029;
            int var2 = this.field7011;
            int var3 = this.field7044;
            int var4 = this.field6983;
            this.method985();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2833((byte) 117);
            this.method2787(false, (byte) 118);
            this.method2828(5126, false);
            this.method2836(2929, false);
            this.method2800(false, -32);
            this.method2811((class541) null, -2);
            this.method2778(-2, 0);
            this.method2791(1, (byte) 120);
            this.method2796((byte) -80, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field6912, this.field6936, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method1022(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IBI)V")
    public final void method2852(int arg0, byte arg1, int arg2) {
        if (arg1 >= 3) {
            ++field6769;
            if (this.field6992 != 0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                OpenGL.glTexEnvi(8960, 34162, arg2);
            } else {
                boolean var4 = false;
                if (~this.field7034 != ~arg0) {
                    OpenGL.glTexEnvi(8960, 34161, arg0);
                    this.field7034 = arg0;
                    var4 = true;
                }
                if (this.field7030 != arg2) {
                    OpenGL.glTexEnvi(8960, 34162, arg2);
                    var4 = true;
                    this.field7030 = arg2;
                }
                if (var4) {
                    this.field6986 &= -30;
                }
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "([IIIII)Lha;")
    public final class116 method982(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6792;
        return new class377(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I[Lat;)V")
    public final void method1045(int arg0, class535[] arg1) {
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field7068[var3] = arg1[var3];
        }
        ++field6761;
        this.field7100 = arg0;
        if (this.field7007 != 1) {
            this.method2771(5890);
        }
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(I)V")
    public final void method970(int arg0) {
        ++field6914;
        this.method2851((byte) 117);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II[I[I)Lpa;")
    public final class594 method1028(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field6823;
        return class636.method3691((byte) 78, arg1, arg2, arg3, this, arg0);
    }

    @OriginalMember(owner = "client!os", name = "A", descriptor = "(IIIII)V")
    public final void method1003(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6908;
        if (~arg2 > -1) {
            arg2 = -arg2;
        }
        if (~(arg0 + arg2) <= ~this.field7029 && this.field7011 >= -arg2 + arg0 && this.field7044 <= arg1 + arg2 && ~this.field6983 <= ~(-arg2 + arg1)) {
            this.method2786(-2);
            this.method2796((byte) -80, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field7009 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field7072 >= (float) var8) {
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
                int var10 = class239.method1537(-24644, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; var11 > 0; var11 -= var10) {
                    OpenGL.glVertex2f(class280.field4164[var11] * (float) arg2 + var6, class280.field4165[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(II)I")
    public final int method1026(int arg0, int arg1) {
        ++field6808;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!os", name = "p", descriptor = "()V")
    public final void method303() {
        this.field6944.method142(true);
        ++field6882;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Loaa;)V")
    public final void method989(class510 arg0) {
        ++field6840;
        this.field6950.method1646(arg0, (byte) -50, this);
    }
}
