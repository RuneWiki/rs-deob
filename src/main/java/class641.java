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

@OriginalClass("client!pea")
public class class641 extends class689 {

    @OriginalMember(owner = "client!pea", name = "Dd", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field8897 = new Hashtable();

    @OriginalMember(owner = "client!pea", name = "oe", descriptor = "I")
    public int field8934 = 128;

    @OriginalMember(owner = "client!pea", name = "le", descriptor = "Lds;")
    private class506 field8931 = new class506();

    @OriginalMember(owner = "client!pea", name = "qe", descriptor = "Lgb;")
    private class367 field8936 = new class367();

    @OriginalMember(owner = "client!pea", name = "re", descriptor = "Lgb;")
    public class367 field8937 = new class367();

    @OriginalMember(owner = "client!pea", name = "se", descriptor = "Z")
    private boolean field8938 = false;

    @OriginalMember(owner = "client!pea", name = "ue", descriptor = "I")
    public int field8940 = 8;

    @OriginalMember(owner = "client!pea", name = "te", descriptor = "I")
    public int field8939 = 3;

    @OriginalMember(owner = "client!pea", name = "ve", descriptor = "Lrh;")
    private class59 field8941 = new class59();

    @OriginalMember(owner = "client!pea", name = "De", descriptor = "I")
    private int field8949 = -1;

    @OriginalMember(owner = "client!pea", name = "Fe", descriptor = "I")
    private int field8951 = -1;

    @OriginalMember(owner = "client!pea", name = "Ee", descriptor = "[Lrk;")
    private class57[] field8950 = new class57[4];

    @OriginalMember(owner = "client!pea", name = "Ae", descriptor = "[Lrk;")
    private class57[] field8946 = new class57[4];

    @OriginalMember(owner = "client!pea", name = "Ce", descriptor = "[Lrk;")
    private class57[] field8948 = new class57[4];

    @OriginalMember(owner = "client!pea", name = "Ge", descriptor = "I")
    private int field8952 = -1;

    @OriginalMember(owner = "client!pea", name = "He", descriptor = "Lrh;")
    private class59 field8953;

    @OriginalMember(owner = "client!pea", name = "Le", descriptor = "Lrh;")
    private class59 field8957;

    @OriginalMember(owner = "client!pea", name = "Me", descriptor = "Lrh;")
    private class59 field8958;

    @OriginalMember(owner = "client!pea", name = "Ne", descriptor = "Lrh;")
    private class59 field8959;

    @OriginalMember(owner = "client!pea", name = "Oe", descriptor = "Lrh;")
    private class59 field8960;

    @OriginalMember(owner = "client!pea", name = "Pe", descriptor = "Lrh;")
    private class59 field8961;

    @OriginalMember(owner = "client!pea", name = "Qe", descriptor = "Lrh;")
    private class59 field8962;

    @OriginalMember(owner = "client!pea", name = "bf", descriptor = "I")
    private int field8973;

    @OriginalMember(owner = "client!pea", name = "ff", descriptor = "I")
    public int field8977;

    @OriginalMember(owner = "client!pea", name = "yf", descriptor = "F")
    private float field8995;

    @OriginalMember(owner = "client!pea", name = "df", descriptor = "F")
    public float field8975;

    @OriginalMember(owner = "client!pea", name = "kf", descriptor = "F")
    public float field8981;

    @OriginalMember(owner = "client!pea", name = "zf", descriptor = "F")
    public float field8996;

    @OriginalMember(owner = "client!pea", name = "Ve", descriptor = "I")
    private int field8967;

    @OriginalMember(owner = "client!pea", name = "sf", descriptor = "[F")
    public float[] field8989;

    @OriginalMember(owner = "client!pea", name = "uf", descriptor = "I")
    public int field8991;

    @OriginalMember(owner = "client!pea", name = "qg", descriptor = "[F")
    private float[] field9039;

    @OriginalMember(owner = "client!pea", name = "Xf", descriptor = "F")
    private float field9020;

    @OriginalMember(owner = "client!pea", name = "jg", descriptor = "I")
    private int field9032;

    @OriginalMember(owner = "client!pea", name = "Wf", descriptor = "F")
    private float field9019;

    @OriginalMember(owner = "client!pea", name = "Ye", descriptor = "[Lhj;")
    private class329[] field8970;

    @OriginalMember(owner = "client!pea", name = "Df", descriptor = "F")
    public float field9000;

    @OriginalMember(owner = "client!pea", name = "xf", descriptor = "I")
    public int field8994;

    @OriginalMember(owner = "client!pea", name = "gg", descriptor = "I")
    public int field9029;

    @OriginalMember(owner = "client!pea", name = "cf", descriptor = "I")
    public int field8974;

    @OriginalMember(owner = "client!pea", name = "wg", descriptor = "F")
    private float field9045;

    @OriginalMember(owner = "client!pea", name = "Cg", descriptor = "I")
    public int field9051;

    @OriginalMember(owner = "client!pea", name = "Rf", descriptor = "I")
    private int field9014;

    @OriginalMember(owner = "client!pea", name = "Eg", descriptor = "F")
    private float field9053;

    @OriginalMember(owner = "client!pea", name = "hg", descriptor = "I")
    private int field9030;

    @OriginalMember(owner = "client!pea", name = "Qg", descriptor = "[F")
    private float[] field9065;

    @OriginalMember(owner = "client!pea", name = "Ue", descriptor = "I")
    private int field8966;

    @OriginalMember(owner = "client!pea", name = "og", descriptor = "I")
    public int field9037;

    @OriginalMember(owner = "client!pea", name = "Ef", descriptor = "I")
    public int field9001;

    @OriginalMember(owner = "client!pea", name = "zg", descriptor = "F")
    public float field9048;

    @OriginalMember(owner = "client!pea", name = "Tg", descriptor = "I")
    private int field9068;

    @OriginalMember(owner = "client!pea", name = "Mg", descriptor = "F")
    public float field9061;

    @OriginalMember(owner = "client!pea", name = "ah", descriptor = "I")
    private int field9075;

    @OriginalMember(owner = "client!pea", name = "Dg", descriptor = "F")
    public float field9052;

    @OriginalMember(owner = "client!pea", name = "mg", descriptor = "[F")
    private float[] field9035;

    @OriginalMember(owner = "client!pea", name = "Vg", descriptor = "I")
    public int field9070;

    @OriginalMember(owner = "client!pea", name = "Fg", descriptor = "F")
    private float field9054;

    @OriginalMember(owner = "client!pea", name = "Ug", descriptor = "[F")
    private float[] field9069;

    @OriginalMember(owner = "client!pea", name = "Zg", descriptor = "I")
    private int field9074;

    @OriginalMember(owner = "client!pea", name = "Ng", descriptor = "I")
    private int field9062;

    @OriginalMember(owner = "client!pea", name = "fh", descriptor = "I")
    public int field9080;

    @OriginalMember(owner = "client!pea", name = "gh", descriptor = "I")
    public int field9081;

    @OriginalMember(owner = "client!pea", name = "hh", descriptor = "Z")
    private boolean field9082;

    @OriginalMember(owner = "client!pea", name = "dh", descriptor = "Lkj;")
    public class457 field9078;

    @OriginalMember(owner = "client!pea", name = "kh", descriptor = "[B")
    public byte[] field9085;

    @OriginalMember(owner = "client!pea", name = "lh", descriptor = "[I")
    public int[] field9086;

    @OriginalMember(owner = "client!pea", name = "mh", descriptor = "[I")
    public int[] field9087;

    @OriginalMember(owner = "client!pea", name = "nh", descriptor = "[I")
    public int[] field9088;

    @OriginalMember(owner = "client!pea", name = "fd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8873;

    @OriginalMember(owner = "client!pea", name = "E", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8742;

    @OriginalMember(owner = "client!pea", name = "je", descriptor = "I")
    public int field8929;

    @OriginalMember(owner = "client!pea", name = "Wc", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field8864;

    @OriginalMember(owner = "client!pea", name = "Wb", descriptor = "J")
    private long field8812;

    @OriginalMember(owner = "client!pea", name = "Ld", descriptor = "J")
    private long field8905;

    @OriginalMember(owner = "client!pea", name = "We", descriptor = "Z")
    public boolean field8968;

    @OriginalMember(owner = "client!pea", name = "Af", descriptor = "I")
    public int field8997;

    @OriginalMember(owner = "client!pea", name = "bh", descriptor = "Ljava/lang/String;")
    private String field9076;

    @OriginalMember(owner = "client!pea", name = "cg", descriptor = "Z")
    public boolean field9025;

    @OriginalMember(owner = "client!pea", name = "Kf", descriptor = "Z")
    private boolean field9007;

    @OriginalMember(owner = "client!pea", name = "Zf", descriptor = "Z")
    public boolean field9022;

    @OriginalMember(owner = "client!pea", name = "wf", descriptor = "Z")
    public boolean field8993;

    @OriginalMember(owner = "client!pea", name = "Nf", descriptor = "Z")
    private boolean field9010;

    @OriginalMember(owner = "client!pea", name = "vg", descriptor = "Z")
    public boolean field9044;

    @OriginalMember(owner = "client!pea", name = "If", descriptor = "Ljava/lang/String;")
    private String field9005;

    @OriginalMember(owner = "client!pea", name = "Qf", descriptor = "Z")
    public boolean field9013;

    @OriginalMember(owner = "client!pea", name = "bg", descriptor = "Z")
    private boolean field9024;

    @OriginalMember(owner = "client!pea", name = "pe", descriptor = "Llg;")
    private class659 field8935;

    @OriginalMember(owner = "client!pea", name = "we", descriptor = "Lco;")
    public class546 field8942;

    @OriginalMember(owner = "client!pea", name = "ke", descriptor = "Lto;")
    private class442 field8930;

    @OriginalMember(owner = "client!pea", name = "ie", descriptor = "Lmu;")
    private class107 field8928;

    @OriginalMember(owner = "client!pea", name = "me", descriptor = "Ltm;")
    private class96 field8932;

    @OriginalMember(owner = "client!pea", name = "Jb", descriptor = "[I")
    public static int[] field8799 = new int[1];

    @OriginalMember(owner = "client!pea", name = "Uc", descriptor = "S")
    public static short field8862 = 1;

    @OriginalMember(owner = "client!pea", name = "cc", descriptor = "I")
    public static int field8818 = 0;

    @OriginalMember(owner = "client!pea", name = "V", descriptor = "F")
    public static float field8759;

    @OriginalMember(owner = "client!pea", name = "mf", descriptor = "F")
    private float field8983;

    @OriginalMember(owner = "client!pea", name = "Ff", descriptor = "F")
    public float field9002;

    @OriginalMember(owner = "client!pea", name = "Hf", descriptor = "F")
    public float field9004;

    @OriginalMember(owner = "client!pea", name = "Sf", descriptor = "F")
    private float field9015;

    @OriginalMember(owner = "client!pea", name = "Yf", descriptor = "F")
    public float field9021;

    @OriginalMember(owner = "client!pea", name = "tg", descriptor = "F")
    private float field9042;

    @OriginalMember(owner = "client!pea", name = "yg", descriptor = "F")
    private float field9047;

    @OriginalMember(owner = "client!pea", name = "Ig", descriptor = "F")
    public float field9057;

    @OriginalMember(owner = "client!pea", name = "Sg", descriptor = "F")
    public float field9067;

    @OriginalMember(owner = "client!pea", name = "Xg", descriptor = "F")
    public float field9072;

    @OriginalMember(owner = "client!pea", name = "u", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!pea", name = "v", descriptor = "I")
    public static int field8733;

    @OriginalMember(owner = "client!pea", name = "w", descriptor = "I")
    public static int field8734;

    @OriginalMember(owner = "client!pea", name = "x", descriptor = "I")
    public static int field8735;

    @OriginalMember(owner = "client!pea", name = "y", descriptor = "I")
    public static int field8736;

    @OriginalMember(owner = "client!pea", name = "z", descriptor = "I")
    public static int field8737;

    @OriginalMember(owner = "client!pea", name = "A", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!pea", name = "B", descriptor = "I")
    public static int field8739;

    @OriginalMember(owner = "client!pea", name = "C", descriptor = "I")
    public static int field8740;

    @OriginalMember(owner = "client!pea", name = "D", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!pea", name = "F", descriptor = "I")
    public static int field8743;

    @OriginalMember(owner = "client!pea", name = "G", descriptor = "I")
    public static int field8744;

    @OriginalMember(owner = "client!pea", name = "H", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!pea", name = "I", descriptor = "I")
    public static int field8746;

    @OriginalMember(owner = "client!pea", name = "J", descriptor = "I")
    private int field8747;

    @OriginalMember(owner = "client!pea", name = "K", descriptor = "I")
    public static int field8748;

    @OriginalMember(owner = "client!pea", name = "L", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!pea", name = "M", descriptor = "I")
    public static int field8750;

    @OriginalMember(owner = "client!pea", name = "N", descriptor = "I")
    public static int field8751;

    @OriginalMember(owner = "client!pea", name = "O", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!pea", name = "P", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!pea", name = "Q", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!pea", name = "R", descriptor = "I")
    private int field8755;

    @OriginalMember(owner = "client!pea", name = "S", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!pea", name = "T", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!pea", name = "U", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!pea", name = "W", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!pea", name = "X", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!pea", name = "Y", descriptor = "I")
    public static int field8762;

    @OriginalMember(owner = "client!pea", name = "Z", descriptor = "I")
    public static int field8763;

    @OriginalMember(owner = "client!pea", name = "ab", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!pea", name = "bb", descriptor = "I")
    public static int field8765;

    @OriginalMember(owner = "client!pea", name = "cb", descriptor = "I")
    public static int field8766;

    @OriginalMember(owner = "client!pea", name = "db", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!pea", name = "eb", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!pea", name = "fb", descriptor = "I")
    public static int field8769;

    @OriginalMember(owner = "client!pea", name = "gb", descriptor = "I")
    public static int field8770;

    @OriginalMember(owner = "client!pea", name = "hb", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!pea", name = "ib", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!pea", name = "jb", descriptor = "I")
    public static int field8773;

    @OriginalMember(owner = "client!pea", name = "kb", descriptor = "I")
    public static int field8774;

    @OriginalMember(owner = "client!pea", name = "lb", descriptor = "I")
    public static int field8775;

    @OriginalMember(owner = "client!pea", name = "mb", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!pea", name = "nb", descriptor = "I")
    public static int field8777;

    @OriginalMember(owner = "client!pea", name = "ob", descriptor = "I")
    public static int field8778;

    @OriginalMember(owner = "client!pea", name = "pb", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!pea", name = "qb", descriptor = "I")
    public static int field8780;

    @OriginalMember(owner = "client!pea", name = "rb", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!pea", name = "sb", descriptor = "I")
    public static int field8782;

    @OriginalMember(owner = "client!pea", name = "tb", descriptor = "I")
    public static int field8783;

    @OriginalMember(owner = "client!pea", name = "ub", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!pea", name = "vb", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!pea", name = "wb", descriptor = "I")
    public static int field8786;

    @OriginalMember(owner = "client!pea", name = "xb", descriptor = "I")
    public static int field8787;

    @OriginalMember(owner = "client!pea", name = "yb", descriptor = "I")
    public static int field8788;

    @OriginalMember(owner = "client!pea", name = "zb", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!pea", name = "Ab", descriptor = "I")
    public static int field8790;

    @OriginalMember(owner = "client!pea", name = "Bb", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!pea", name = "Cb", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!pea", name = "Db", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!pea", name = "Eb", descriptor = "I")
    public static int field8794;

    @OriginalMember(owner = "client!pea", name = "Fb", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!pea", name = "Gb", descriptor = "I")
    public static int field8796;

    @OriginalMember(owner = "client!pea", name = "Hb", descriptor = "I")
    public static int field8797;

    @OriginalMember(owner = "client!pea", name = "Ib", descriptor = "I")
    public static int field8798;

    @OriginalMember(owner = "client!pea", name = "Kb", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!pea", name = "Lb", descriptor = "I")
    public static int field8801;

    @OriginalMember(owner = "client!pea", name = "Mb", descriptor = "I")
    public static int field8802;

    @OriginalMember(owner = "client!pea", name = "Nb", descriptor = "I")
    public static int field8803;

    @OriginalMember(owner = "client!pea", name = "Ob", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!pea", name = "Pb", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!pea", name = "Qb", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!pea", name = "Rb", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!pea", name = "Sb", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!pea", name = "Tb", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!pea", name = "Ub", descriptor = "I")
    public static int field8810;

    @OriginalMember(owner = "client!pea", name = "Vb", descriptor = "I")
    public static int field8811;

    @OriginalMember(owner = "client!pea", name = "Xb", descriptor = "I")
    public static int field8813;

    @OriginalMember(owner = "client!pea", name = "Yb", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!pea", name = "Zb", descriptor = "I")
    public static int field8815;

    @OriginalMember(owner = "client!pea", name = "ac", descriptor = "I")
    public static int field8816;

    @OriginalMember(owner = "client!pea", name = "bc", descriptor = "I")
    public static int field8817;

    @OriginalMember(owner = "client!pea", name = "dc", descriptor = "I")
    public static int field8819;

    @OriginalMember(owner = "client!pea", name = "ec", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!pea", name = "fc", descriptor = "I")
    public static int field8821;

    @OriginalMember(owner = "client!pea", name = "gc", descriptor = "I")
    public static int field8822;

    @OriginalMember(owner = "client!pea", name = "hc", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!pea", name = "ic", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!pea", name = "jc", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!pea", name = "kc", descriptor = "I")
    public static int field8826;

    @OriginalMember(owner = "client!pea", name = "lc", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!pea", name = "mc", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!pea", name = "nc", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!pea", name = "oc", descriptor = "I")
    public static int field8830;

    @OriginalMember(owner = "client!pea", name = "pc", descriptor = "I")
    public static int field8831;

    @OriginalMember(owner = "client!pea", name = "qc", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!pea", name = "rc", descriptor = "I")
    public static int field8833;

    @OriginalMember(owner = "client!pea", name = "sc", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!pea", name = "tc", descriptor = "I")
    public static int field8835;

    @OriginalMember(owner = "client!pea", name = "uc", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!pea", name = "vc", descriptor = "I")
    public static int field8837;

    @OriginalMember(owner = "client!pea", name = "wc", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!pea", name = "xc", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!pea", name = "yc", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!pea", name = "zc", descriptor = "I")
    public static int field8841;

    @OriginalMember(owner = "client!pea", name = "Ac", descriptor = "I")
    public static int field8842;

    @OriginalMember(owner = "client!pea", name = "Bc", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!pea", name = "Cc", descriptor = "I")
    public static int field8844;

    @OriginalMember(owner = "client!pea", name = "Dc", descriptor = "I")
    public static int field8845;

    @OriginalMember(owner = "client!pea", name = "Ec", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!pea", name = "Fc", descriptor = "I")
    public static int field8847;

    @OriginalMember(owner = "client!pea", name = "Gc", descriptor = "I")
    public static int field8848;

    @OriginalMember(owner = "client!pea", name = "Hc", descriptor = "I")
    public static int field8849;

    @OriginalMember(owner = "client!pea", name = "Ic", descriptor = "I")
    public static int field8850;

    @OriginalMember(owner = "client!pea", name = "Jc", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!pea", name = "Kc", descriptor = "I")
    public static int field8852;

    @OriginalMember(owner = "client!pea", name = "Lc", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!pea", name = "Mc", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!pea", name = "Nc", descriptor = "I")
    public static int field8855;

    @OriginalMember(owner = "client!pea", name = "Oc", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!pea", name = "Pc", descriptor = "I")
    public static int field8857;

    @OriginalMember(owner = "client!pea", name = "Qc", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!pea", name = "Rc", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!pea", name = "Sc", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!pea", name = "Tc", descriptor = "I")
    public static int field8861;

    @OriginalMember(owner = "client!pea", name = "Vc", descriptor = "I")
    public static int field8863;

    @OriginalMember(owner = "client!pea", name = "Xc", descriptor = "I")
    public static int field8865;

    @OriginalMember(owner = "client!pea", name = "Yc", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!pea", name = "Zc", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!pea", name = "ad", descriptor = "I")
    public static int field8868;

    @OriginalMember(owner = "client!pea", name = "bd", descriptor = "I")
    public static int field8869;

    @OriginalMember(owner = "client!pea", name = "cd", descriptor = "I")
    public static int field8870;

    @OriginalMember(owner = "client!pea", name = "dd", descriptor = "I")
    public static int field8871;

    @OriginalMember(owner = "client!pea", name = "ed", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!pea", name = "gd", descriptor = "I")
    public static int field8874;

    @OriginalMember(owner = "client!pea", name = "hd", descriptor = "I")
    public static int field8875;

    @OriginalMember(owner = "client!pea", name = "id", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!pea", name = "jd", descriptor = "I")
    public static int field8877;

    @OriginalMember(owner = "client!pea", name = "kd", descriptor = "I")
    public static int field8878;

    @OriginalMember(owner = "client!pea", name = "ld", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!pea", name = "md", descriptor = "I")
    public static int field8880;

    @OriginalMember(owner = "client!pea", name = "nd", descriptor = "I")
    public static int field8881;

    @OriginalMember(owner = "client!pea", name = "od", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!pea", name = "pd", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!pea", name = "qd", descriptor = "I")
    public static int field8884;

    @OriginalMember(owner = "client!pea", name = "rd", descriptor = "I")
    public static int field8885;

    @OriginalMember(owner = "client!pea", name = "sd", descriptor = "I")
    public static int field8886;

    @OriginalMember(owner = "client!pea", name = "td", descriptor = "I")
    public static int field8887;

    @OriginalMember(owner = "client!pea", name = "ud", descriptor = "I")
    public int field8888;

    @OriginalMember(owner = "client!pea", name = "vd", descriptor = "I")
    public static int field8889;

    @OriginalMember(owner = "client!pea", name = "wd", descriptor = "I")
    public static int field8890;

    @OriginalMember(owner = "client!pea", name = "xd", descriptor = "I")
    public static int field8891;

    @OriginalMember(owner = "client!pea", name = "yd", descriptor = "I")
    public static int field8892;

    @OriginalMember(owner = "client!pea", name = "zd", descriptor = "I")
    public static int field8893;

    @OriginalMember(owner = "client!pea", name = "Ad", descriptor = "I")
    public static int field8894;

    @OriginalMember(owner = "client!pea", name = "Bd", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!pea", name = "Cd", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!pea", name = "Ed", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!pea", name = "Fd", descriptor = "I")
    public static int field8899;

    @OriginalMember(owner = "client!pea", name = "Gd", descriptor = "I")
    public static int field8900;

    @OriginalMember(owner = "client!pea", name = "Hd", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!pea", name = "Id", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!pea", name = "Jd", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!pea", name = "Md", descriptor = "I")
    public static int field8906;

    @OriginalMember(owner = "client!pea", name = "Nd", descriptor = "I")
    public static int field8907;

    @OriginalMember(owner = "client!pea", name = "Od", descriptor = "I")
    public static int field8908;

    @OriginalMember(owner = "client!pea", name = "Pd", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!pea", name = "Qd", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!pea", name = "Rd", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!pea", name = "Sd", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!pea", name = "Td", descriptor = "I")
    public static int field8913;

    @OriginalMember(owner = "client!pea", name = "Ud", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!pea", name = "Vd", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!pea", name = "Wd", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!pea", name = "Xd", descriptor = "I")
    public static int field8917;

    @OriginalMember(owner = "client!pea", name = "Yd", descriptor = "I")
    public static int field8918;

    @OriginalMember(owner = "client!pea", name = "Zd", descriptor = "I")
    public static int field8919;

    @OriginalMember(owner = "client!pea", name = "ae", descriptor = "I")
    public int field8920;

    @OriginalMember(owner = "client!pea", name = "be", descriptor = "I")
    public static int field8921;

    @OriginalMember(owner = "client!pea", name = "ce", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!pea", name = "de", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!pea", name = "ee", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!pea", name = "fe", descriptor = "I")
    public static int field8925;

    @OriginalMember(owner = "client!pea", name = "ge", descriptor = "I")
    public static int field8926;

    @OriginalMember(owner = "client!pea", name = "he", descriptor = "I")
    public static int field8927;

    @OriginalMember(owner = "client!pea", name = "ne", descriptor = "I")
    public static int field8933;

    @OriginalMember(owner = "client!pea", name = "xe", descriptor = "I")
    public int field8943;

    @OriginalMember(owner = "client!pea", name = "Ie", descriptor = "I")
    public int field8954;

    @OriginalMember(owner = "client!pea", name = "Je", descriptor = "I")
    public int field8955;

    @OriginalMember(owner = "client!pea", name = "Ke", descriptor = "I")
    private int field8956;

    @OriginalMember(owner = "client!pea", name = "Re", descriptor = "I")
    private int field8963;

    @OriginalMember(owner = "client!pea", name = "Ze", descriptor = "I")
    public int field8971;

    @OriginalMember(owner = "client!pea", name = "hf", descriptor = "I")
    public int field8979;

    @OriginalMember(owner = "client!pea", name = "nf", descriptor = "I")
    private int field8984;

    @OriginalMember(owner = "client!pea", name = "of", descriptor = "I")
    private int field8985;

    @OriginalMember(owner = "client!pea", name = "tf", descriptor = "I")
    private int field8990;

    @OriginalMember(owner = "client!pea", name = "Bf", descriptor = "I")
    private int field8998;

    @OriginalMember(owner = "client!pea", name = "Jf", descriptor = "I")
    private int field9006;

    @OriginalMember(owner = "client!pea", name = "Mf", descriptor = "I")
    private int field9009;

    @OriginalMember(owner = "client!pea", name = "Pf", descriptor = "I")
    private int field9012;

    @OriginalMember(owner = "client!pea", name = "Tf", descriptor = "I")
    public int field9016;

    @OriginalMember(owner = "client!pea", name = "fg", descriptor = "I")
    private int field9028;

    @OriginalMember(owner = "client!pea", name = "ug", descriptor = "I")
    public int field9043;

    @OriginalMember(owner = "client!pea", name = "Pg", descriptor = "I")
    private int field9064;

    @OriginalMember(owner = "client!pea", name = "Rg", descriptor = "I")
    private int field9066;

    @OriginalMember(owner = "client!pea", name = "ih", descriptor = "I")
    private int field9083;

    @OriginalMember(owner = "client!pea", name = "jh", descriptor = "I")
    private int field9084;

    @OriginalMember(owner = "client!pea", name = "ag", descriptor = "J")
    private long field9023;

    @OriginalMember(owner = "client!pea", name = "Gf", descriptor = "Luf;")
    public class120 field9003;

    @OriginalMember(owner = "client!pea", name = "Kg", descriptor = "Lcm;")
    public class158 field9059;

    @OriginalMember(owner = "client!pea", name = "Og", descriptor = "Lcm;")
    public class158 field9063;

    @OriginalMember(owner = "client!pea", name = "xg", descriptor = "Lrm;")
    private class359 field9046;

    @OriginalMember(owner = "client!pea", name = "jf", descriptor = "Lgb;")
    public class367 field8980;

    @OriginalMember(owner = "client!pea", name = "Of", descriptor = "Lgb;")
    public class367 field9011;

    @OriginalMember(owner = "client!pea", name = "lg", descriptor = "Lqw;")
    public class379 field9034;

    @OriginalMember(owner = "client!pea", name = "pf", descriptor = "Lav;")
    private class437 field8986;

    @OriginalMember(owner = "client!pea", name = "eg", descriptor = "Lav;")
    private class437 field9027;

    @OriginalMember(owner = "client!pea", name = "Yg", descriptor = "Lmm;")
    private class459 field9073;

    @OriginalMember(owner = "client!pea", name = "lf", descriptor = "Leca;")
    public class514 field8982;

    @OriginalMember(owner = "client!pea", name = "vf", descriptor = "Leca;")
    public class514 field8992;

    @OriginalMember(owner = "client!pea", name = "Lf", descriptor = "Leca;")
    public class514 field9008;

    @OriginalMember(owner = "client!pea", name = "Uf", descriptor = "Leca;")
    public class514 field9017;

    @OriginalMember(owner = "client!pea", name = "pg", descriptor = "Leca;")
    public class514 field9038;

    @OriginalMember(owner = "client!pea", name = "Ag", descriptor = "Leca;")
    public class514 field9049;

    @OriginalMember(owner = "client!pea", name = "Gg", descriptor = "Leca;")
    public class514 field9055;

    @OriginalMember(owner = "client!pea", name = "Hg", descriptor = "Leca;")
    public class514 field9056;

    @OriginalMember(owner = "client!pea", name = "Jg", descriptor = "Leca;")
    public class514 field9058;

    @OriginalMember(owner = "client!pea", name = "eh", descriptor = "Leca;")
    public class514 field9079;

    @OriginalMember(owner = "client!pea", name = "ze", descriptor = "Lrk;")
    private class57 field8945;

    @OriginalMember(owner = "client!pea", name = "Be", descriptor = "Lrk;")
    private class57 field8947;

    @OriginalMember(owner = "client!pea", name = "Kd", descriptor = "Lil;")
    public static class598 field8904;

    @OriginalMember(owner = "client!pea", name = "ef", descriptor = "Lkw;")
    private class690 field8976;

    @OriginalMember(owner = "client!pea", name = "ye", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field8944;

    @OriginalMember(owner = "client!pea", name = "Se", descriptor = "Z")
    public boolean field8964;

    @OriginalMember(owner = "client!pea", name = "Te", descriptor = "Z")
    public boolean field8965;

    @OriginalMember(owner = "client!pea", name = "Xe", descriptor = "Z")
    private boolean field8969;

    @OriginalMember(owner = "client!pea", name = "af", descriptor = "Z")
    private boolean field8972;

    @OriginalMember(owner = "client!pea", name = "gf", descriptor = "Z")
    public boolean field8978;

    @OriginalMember(owner = "client!pea", name = "qf", descriptor = "Z")
    public boolean field8987;

    @OriginalMember(owner = "client!pea", name = "rf", descriptor = "Z")
    private boolean field8988;

    @OriginalMember(owner = "client!pea", name = "Cf", descriptor = "Z")
    private boolean field8999;

    @OriginalMember(owner = "client!pea", name = "Vf", descriptor = "Z")
    private boolean field9018;

    @OriginalMember(owner = "client!pea", name = "ig", descriptor = "Z")
    private boolean field9031;

    @OriginalMember(owner = "client!pea", name = "kg", descriptor = "Z")
    public boolean field9033;

    @OriginalMember(owner = "client!pea", name = "ng", descriptor = "Z")
    private boolean field9036;

    @OriginalMember(owner = "client!pea", name = "rg", descriptor = "Z")
    private boolean field9040;

    @OriginalMember(owner = "client!pea", name = "sg", descriptor = "Z")
    public boolean field9041;

    @OriginalMember(owner = "client!pea", name = "Bg", descriptor = "Z")
    private boolean field9050;

    @OriginalMember(owner = "client!pea", name = "Lg", descriptor = "Z")
    private boolean field9060;

    @OriginalMember(owner = "client!pea", name = "Wg", descriptor = "Z")
    public boolean field9071;

    @OriginalMember(owner = "client!pea", name = "ch", descriptor = "Z")
    public boolean field9077;

    @OriginalMember(owner = "client!pea", name = "dg", descriptor = "[Lwq;")
    private class254[] field9026;

    @OriginalMember(owner = "client!pea", name = "JA", descriptor = "(I)V")
    public final void method1905(int arg0) {
        this.field8939 = 0;
        ++field8822;
        while (~arg0 < -2) {
            ++this.field8939;
            arg0 >>= 1;
        }
        this.field8940 = 1 << this.field8939;
    }

    @OriginalMember(owner = "client!pea", name = "g", descriptor = "(I)V")
    public final void method1793(int arg0) {
        ++field8798;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "(I)V")
    private final void method3484(int arg0) {
        this.field8864.method3349();
        if (arg0 != -1) {
            this.method1953();
        }
        ++field8813;
    }

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "()Z")
    public final boolean method1989() {
        ++field8869;
        return false;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(BZ)V")
    public final void method3485(byte arg0, boolean arg1) {
        ++field8753;
        int var3 = 21 % ((arg0 - -35) / 54);
        if (!arg1 != !this.field8999) {
            if (arg1) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field8999 = arg1;
            this.field9028 &= -32;
        }
    }

    @OriginalMember(owner = "client!pea", name = "h", descriptor = "(I)V")
    public final void method3486(int arg0) {
        if (arg0 != -1834564280) {
            this.method3530(-65, -28);
        }
        ++field8750;
        OpenGL.glPushMatrix();
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V")
    private final void method3487(byte arg0) {
        if (~this.field8984 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field8888 < -1 && this.field8920 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field8888, (double) this.field8920, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field9028 &= -25;
            this.field8984 = 1;
        }
        int var2 = 100 % ((arg0 - 18) / 63);
        ++field8785;
    }

    @OriginalMember(owner = "client!pea", name = "x", descriptor = "()Z")
    public final boolean method1945() {
        ++field8921;
        return true;
    }

    @OriginalMember(owner = "client!pea", name = "p", descriptor = "()V")
    public final void method829() {
        ++field8788;
        this.field8930.method2543(0);
    }

    @OriginalMember(owner = "client!pea", name = "l", descriptor = "()Lru;")
    public final class276 method794() {
        ++field8857;
        int var1 = -1;
        if (this.field9005.indexOf("nvidia") == -1) {
            if (this.field9005.indexOf("intel") != -1) {
                var1 = 32902;
            } else if (this.field9005.indexOf("ati") != -1) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class276(var1, "OpenGL", this.field8998, this.field9076, 0L);
    }

    @OriginalMember(owner = "client!pea", name = "AA", descriptor = "(IIII)V")
    public final void method1878(int arg0, int arg1, int arg2, int arg3) {
        this.field8978 = true;
        this.field9074 = arg1;
        this.field9081 = arg2;
        this.field9029 = arg3;
        this.field9043 = arg0;
        ++field8754;
        this.field8932.method531(false, 0, true, 0, 3, false);
        this.field8932.field1190.method3321(121);
        this.method3561(false);
        this.method3509(-127);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IB)V")
    public final void method3488(int arg0, byte arg1) {
        if (this.field8985 != arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field8985 = arg0;
        }
        ++field8762;
        if (arg1 != 23) {
            this.method3537(-125L, 49);
        }
    }

    @OriginalMember(owner = "client!pea", name = "na", descriptor = "(III[I)V")
    public final void method1891(int arg0, int arg1, int arg2, int[] arg3) {
        ++field8841;
        float var5 = (float) arg2 * this.field9011.field5267 + (float) arg0 * this.field9011.field5270 + (float) arg1 * this.field9011.field5258 + this.field9011.field5279;
        if (!((float) this.field9051 > var5) && !(var5 > (float) this.field8977)) {
            int var6 = (int) (((float) arg2 * this.field9011.field5262 + (float) arg0 * this.field9011.field5286 + (float) arg1 * this.field9011.field5276 + this.field9011.field5269) * (float) this.field9001 / var5);
            int var7 = (int) (((float) arg2 * this.field9011.field5266 + (float) arg0 * this.field9011.field5291 + (float) arg1 * this.field9011.field5264 + this.field9011.field5259) * (float) this.field9037 / var5);
            if ((float) var6 >= this.field9072 && (float) var6 <= this.field9067 && this.field9002 <= (float) var7 && (float) var7 <= this.field9021) {
                arg3[1] = (int) ((float) var7 - this.field9002);
                arg3[0] = (int) ((float) var6 + -this.field9072);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!pea", name = "i", descriptor = "(I)V")
    private final void method3489(int arg0) {
        if (this.field9015 == 0.0F) {
            this.field9039[14] = this.field8983;
            this.field9039[10] = this.field9042;
        } else {
            float var2 = this.field8995 / (this.field9015 + this.field8995);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field8983 * (-var2 + 1.0F) / this.field9015;
            this.field9039[14] = this.field8983 * var3;
            this.field9039[10] = this.field9042 + var4;
        }
        ++field8842;
        this.field8981 = (this.field9039[14] + (float) (-this.field8977)) / this.field9039[10];
        if (arg0 != -24684) {
            this.method3509(-44);
        }
        this.field8996 = (float) this.field8977 - this.field9015;
    }

    @OriginalMember(owner = "client!pea", name = "A", descriptor = "([I)V")
    public final void method1910(int[] arg0) {
        arg0[3] = this.field9032;
        arg0[0] = this.field9068;
        arg0[1] = this.field9030;
        arg0[2] = this.field8967;
        ++field8894;
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(B)V")
    private final void method3490(byte arg0) {
        OpenGL.glDepthMask(this.field8988 && this.field9082);
        ++field8886;
        if (arg0 != 74) {
            this.field9006 = -5;
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(II)I")
    public final int method1987(int arg0, int arg1) {
        ++field8743;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!pea", name = "C", descriptor = "(IIIIII)V")
    public final void method1926(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8740;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method3568(1345026800);
        float var10 = (float) arg3 + var8;
        this.method3547(arg5, true);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field9036) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field9036) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIZ)V")
    public final synchronized void method3491(int arg0, int arg1, boolean arg2) {
        ++field8899;
        class360 var4 = new class360(arg0);
        var4.field272 = (long) arg1;
        if (arg2) {
            this.method1792(-51, 37, -89, -57, 98, 60, -45, -39, -88, 86);
        }
        this.field8960.method378(var4, 31316);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lrk;B)V")
    public final void method3492(class57 arg0, byte arg1) {
        ++field8823;
        if (this.field8951 >= 0 && this.field8948[this.field8951] == arg0) {
            this.field8948[this.field8951--] = null;
            if (arg1 < -46) {
                arg0.method354(-9874);
                if (~this.field8951 > -1) {
                    this.field8945 = null;
                } else {
                    this.field8945 = this.field8948[this.field8951];
                    this.field8945.method357(-8166);
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "()Z")
    public final boolean method1942() {
        ++field8892;
        return false;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(ILav;)V")
    public final void method3493(int arg0, class437 arg1) {
        ++field8903;
        if (this.field8986 != arg1) {
            if (this.field9007) {
                OpenGL.glBindBufferARB(34962, arg1.method2514(-111));
            }
            this.field8986 = arg1;
        }
        if (arg0 < 89) {
            this.field8984 = -9;
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Z[BIII)Lav;")
    public final class437 method3494(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        ++field8757;
        if (!this.field9007 || arg0 && !this.field9010) {
            return arg3 != 4609 ? null : new class522(this, arg2, arg1, arg4);
        } else {
            return new class569(this, arg2, arg1, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIII)V")
    public final void method2010(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3568(1345026800);
        ++field8756;
        this.method3547(arg5, true);
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) arg3 - (float) arg1;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var7 * var9;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var11 = var8 * var9;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var10 + 0.35F, (float) arg3 + var11 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Laq;)V")
    public final void method1952(class108 arg0) {
        this.field8976 = (class690) arg0;
        ++field8884;
    }

    @OriginalMember(owner = "client!pea", name = "h", descriptor = "()Z")
    public final boolean method1930() {
        ++field8738;
        return true;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZZ)V")
    public final void method3495(boolean arg0, boolean arg1) {
        ++field8746;
        if (arg1 == !this.field9050) {
            this.field9050 = arg1;
            this.method3540(2896);
        }
        if (arg0) {
            this.method3499(6, -14, -69);
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(FI)V")
    public final void method3496(float arg0, int arg1) {
        if (arg1 < 21) {
            this.method1901();
        }
        ++field8902;
        if (this.field9054 != arg0) {
            this.field9054 = arg0;
            if (this.field8984 == 3) {
                this.method3518(true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIILrm;)V")
    public final void method3497(int arg0, int arg1, int arg2, int arg3, class359 arg4) {
        ++field8843;
        int var6 = arg4.method1114((byte) -81);
        int var7 = arg3 * this.method3526(-5122, var6);
        int var8 = -55 % ((-68 - arg0) / 32);
        this.method3536((byte) 126, arg4);
        OpenGL.glDrawElements(arg2, arg1, var6, arg4.method1111(9677) - -((long) var7));
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZ[BII)Lrm;")
    public final class359 method3498(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4) {
        ++field8764;
        if (arg4 != -23702) {
            this.field9061 = 0.4226706F;
        }
        return (class359) (!this.field9007 || arg1 && !this.field9010 ? new class167(this, arg3, arg2, arg0) : new class584(this, arg3, arg2, arg0, arg1));
    }

    @OriginalMember(owner = "client!pea", name = "SA", descriptor = "()I")
    public final int method791() {
        ++field8849;
        int var1 = this.field9084;
        this.field9084 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(III)V")
    public final void method3499(int arg0, int arg1, int arg2) {
        if (this.field8985 != 0) {
            OpenGL.glTexEnvi(8960, 34161, arg2);
            OpenGL.glTexEnvi(8960, 34162, arg0);
        } else {
            boolean var4 = false;
            if (this.field9014 != arg2) {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                var4 = true;
                this.field9014 = arg2;
            }
            if (this.field8973 != arg0) {
                OpenGL.glTexEnvi(8960, 34162, arg0);
                var4 = true;
                this.field8973 = arg0;
            }
            if (var4) {
                this.field9028 &= -30;
            }
        }
        if (arg1 == 34161) {
            ++field8918;
        }
    }

    @OriginalMember(owner = "client!pea", name = "j", descriptor = "(I)V")
    private final void method3500(int arg0) {
        ++field8777;
        if (this.field8742 == null) {
            this.field8755 = this.field8747 = 0;
        } else {
            Dimension var2 = this.field8742.getSize();
            this.field8747 = var2.height;
            this.field8755 = var2.width;
        }
        if (this.field8947 == null) {
            this.field8920 = this.field8747;
            this.field8888 = this.field8755;
            this.method3550((byte) 119);
        }
        this.method3566((byte) -53);
        if (arg0 != 2) {
            this.field8873 = null;
        }
        this.method1984();
    }

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "(II)V")
    public final synchronized void method3501(int arg0, int arg1) {
        if (arg1 > -35) {
            this.method1983(42);
        }
        ++field8839;
        class28 var3 = new class28();
        var3.field272 = (long) arg0;
        this.field8961.method378(var3, 31316);
    }

    @OriginalMember(owner = "client!pea", name = "k", descriptor = "(I)V")
    public final void method3502(int arg0) {
        OpenGL.glPopMatrix();
        ++field8889;
        if (arg0 != 452832144) {
            this.field9087 = null;
        }
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(Li;)V")
    public final void method1877(class173 arg0) {
        ++field8919;
        this.field8944 = ((class210) arg0).field2752;
        if (this.field9027 == null) {
            class457 var2 = new class457(80);
            if (!this.field8968) {
                var2.method2586(-26561, -1.0F);
                var2.method2586(-26561, -1.0F);
                var2.method2586(-26561, 0.0F);
                var2.method2586(-26561, 0.0F);
                var2.method2586(-26561, 1.0F);
                var2.method2586(-26561, 1.0F);
                var2.method2586(-26561, -1.0F);
                var2.method2586(-26561, 0.0F);
                var2.method2586(-26561, 1.0F);
                var2.method2586(-26561, 1.0F);
                var2.method2586(-26561, 1.0F);
                var2.method2586(-26561, 1.0F);
                var2.method2586(-26561, 0.0F);
                var2.method2586(-26561, 1.0F);
                var2.method2586(-26561, 0.0F);
                var2.method2586(-26561, -1.0F);
                var2.method2586(-26561, 1.0F);
                var2.method2586(-26561, 0.0F);
                var2.method2586(-26561, 0.0F);
                var2.method2586(-26561, 0.0F);
            } else {
                var2.method2587(-1.0F, -11186);
                var2.method2587(-1.0F, -11186);
                var2.method2587(0.0F, -11186);
                var2.method2587(0.0F, -11186);
                var2.method2587(1.0F, -11186);
                var2.method2587(1.0F, -11186);
                var2.method2587(-1.0F, -11186);
                var2.method2587(0.0F, -11186);
                var2.method2587(1.0F, -11186);
                var2.method2587(1.0F, -11186);
                var2.method2587(1.0F, -11186);
                var2.method2587(1.0F, -11186);
                var2.method2587(0.0F, -11186);
                var2.method2587(1.0F, -11186);
                var2.method2587(0.0F, -11186);
                var2.method2587(-1.0F, -11186);
                var2.method2587(1.0F, -11186);
                var2.method2587(0.0F, -11186);
                var2.method2587(0.0F, -11186);
                var2.method2587(0.0F, -11186);
            }
            this.field9027 = this.method3494(false, var2.field1712, 20, 4609, var2.field1745);
            this.field9059 = new class158(this.field9027, 5126, 3, 0);
            this.field9063 = new class158(this.field9027, 5126, 2, 12);
            this.field8931.method2864(-1025, this);
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Laq;Laq;FLaq;)Laq;")
    public final class108 method796(class108 arg0, class108 arg1, float arg2, class108 arg3) {
        ++field8736;
        if (arg0 != null && arg1 != null && this.field8964 && this.field9013) {
            class333 var5 = null;
            class690 var6 = (class690) arg0;
            class690 var7 = (class690) arg1;
            class322 var8 = var6.method1328(65);
            class322 var9 = var7.method1328(117);
            if (var8 != null && var9 != null) {
                int var10 = ~var8.field4716 >= ~var9.field4716 ? var9.field4716 : var8.field4716;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class333) {
                    class333 var11 = (class333) arg3;
                    if (~var10 == ~var11.method2130((byte) 22)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class333(this, var10);
                }
                if (var5.method2128(var8, 65, var9, arg2)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!pea", name = "l", descriptor = "(I)V")
    public static void method3503(int arg0) {
        field8799 = null;
        field8904 = null;
        if (arg0 < 60) {
            method3534(true, 16, 105, -18, -125, true, (class159) null);
        }
    }

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "(B)V")
    private final void method3504(byte arg0) {
        if (arg0 > -64) {
            this.method791();
        }
        ++field8844;
        int var2;
        for (var2 = 0; ~var2 > ~this.field9009; ++var2) {
            class329 var3 = this.field8970[var2];
            int var4 = var2 + 16386;
            class315.field4552[0] = (float) var3.method2112(0);
            class315.field4552[1] = (float) var3.method2115((byte) -63);
            class315.field4552[2] = (float) var3.method2114((byte) -123);
            class315.field4552[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class315.field4552, 0);
            int var5 = var3.method2109(14463);
            float var6 = var3.method2113((byte) 91) / 255.0F;
            class315.field4552[2] = var6 * (float) class230.method1424(255, var5);
            class315.field4552[1] = (float) class230.method1424(255, var5 >> 8) * var6;
            class315.field4552[0] = var6 * (float) (class230.method1424(var5, 16759334) >> 16);
            OpenGL.glLightfv(var4, 4609, class315.field4552, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method2110(true) * var3.method2110(true)));
            OpenGL.glEnable(var4);
        }
        while (~var2 > ~this.field9006) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field9006 = this.field9009;
    }

    @OriginalMember(owner = "client!pea", name = "ka", descriptor = "(FF)V")
    public final void method1957(float arg0, float arg1) {
        ++field8733;
        if (this.field8995 != arg0 || this.field9015 != arg1) {
            this.field8995 = arg0;
            this.field9015 = arg1;
            this.method3489(-24684);
            if (this.field8984 != 3) {
                if (this.field8984 == 2) {
                    this.method3549((byte) 115);
                    return;
                }
            } else {
                this.method3518(true);
            }
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZ)V")
    public final void method3505(int arg0, boolean arg1) {
        ++field8906;
        if (arg1 == !this.field8988) {
            this.field8988 = arg1;
            this.method3490((byte) 74);
            this.field9028 &= -32;
        }
        if (arg0 != -783) {
            this.field9070 = 24;
        }
    }

    @OriginalMember(owner = "client!pea", name = "m", descriptor = "(I)V")
    private final void method3506(int arg0) {
        this.field9021 = (float) (-this.field9080 + this.field9032);
        this.field9067 = (float) (this.field8967 - this.field9070);
        this.field9002 = (float) (-this.field9080 + this.field9030);
        this.field9072 = (float) (-this.field9070 + this.field9068);
        ++field8833;
        if (arg0 <= 66) {
            this.field8939 = -113;
        }
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(IIII)V")
    public final void method3507(int arg0, int arg1, int arg2, int arg3) {
        ++field8773;
        OpenGL.glDrawArrays(arg3, arg0, arg1);
        if (arg2 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(BLgb;)V")
    public final void method3508(byte arg0, class367 arg1) {
        int var3 = 75 % ((arg0 - 86) / 39);
        OpenGL.glPushMatrix();
        ++field8776;
        OpenGL.glMultMatrixf(arg1.method2257((byte) -110), 0);
    }

    @OriginalMember(owner = "client!pea", name = "IA", descriptor = "()I")
    public final int method1924() {
        ++field8878;
        return this.field8977;
    }

    @OriginalMember(owner = "client!pea", name = "ca", descriptor = "(IIII)V")
    public final void method1908(int arg0, int arg1, int arg2, int arg3) {
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (this.field8920 < arg3) {
            arg3 = this.field8920;
        }
        if (~arg2 < ~this.field8888) {
            arg2 = this.field8888;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        ++field8850;
        this.field8967 = arg2;
        this.field9032 = arg3;
        this.field9030 = arg1;
        this.field9068 = arg0;
        OpenGL.glEnable(3089);
        this.method3506(113);
        this.method3512((byte) -5);
    }

    @OriginalMember(owner = "client!pea", name = "n", descriptor = "(I)V")
    private final void method3509(int arg0) {
        ++field8820;
        if (arg0 >= -123) {
            this.field8971 = -94;
        }
        if (this.field9040 && this.field8978 | ~this.field8991 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!pea", name = "u", descriptor = "()Z")
    public final boolean method811() {
        ++field8781;
        return this.field8928 != null && this.field8928.method2273((byte) -127);
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(IB)V")
    public final synchronized void method3510(int arg0, byte arg1) {
        ++field8881;
        if (arg1 != -122) {
            this.field8920 = 77;
        }
        class360 var3 = new class360(arg0);
        this.field8959.method378(var3, 31316);
    }

    @OriginalMember(owner = "client!pea", name = "A", descriptor = "()V")
    public final void method839() {
        ++field8761;
        if (this.field9024 && ~this.field8888 < -1 && this.field8920 > 0) {
            int var1 = this.field9068;
            int var2 = this.field8967;
            int var3 = this.field9030;
            int var4 = this.field9032;
            this.method1984();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3566((byte) -73);
            this.method3569(false, -32);
            this.method3520((byte) -115, false);
            this.method3485((byte) -92, false);
            this.method3505(-783, false);
            this.method3553((byte) -92, (class254) null);
            this.method3530(-2, -98);
            this.method3524(1, 14);
            this.method3547(0, true);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field8888, this.field8920, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method1908(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I[Lhj;)V")
    public final void method2016(int arg0, class329[] arg1) {
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field8970[var3] = arg1[var3];
        }
        ++field8744;
        this.field9009 = arg0;
        if (~this.field8984 != -2) {
            this.method3504((byte) -95);
        }
    }

    @OriginalMember(owner = "client!pea", name = "LA", descriptor = "(IIII)V")
    public final void method1888(int arg0, int arg1, int arg2, int arg3) {
        ++field8807;
        if (!this.field8978) {
            throw new RuntimeException("");
        } else {
            this.field9043 = arg0;
            this.field9081 = arg2;
            this.field9029 = arg3;
            this.field9074 = arg1;
            this.field8932.field1190.method3321(126);
            this.method3561(false);
        }
    }

    @OriginalMember(owner = "client!pea", name = "g", descriptor = "()Z")
    public final boolean method1899() {
        ++field8863;
        return true;
    }

    @OriginalMember(owner = "client!pea", name = "o", descriptor = "(I)V")
    private final void method3511(int arg0) {
        ++field8846;
        if (arg0 >= 107) {
            float[] var2 = this.field9039;
            float var3 = (float) (-this.field9070 * this.field9051) / (float) this.field9001;
            float var4 = (float) ((-this.field9070 + this.field8888) * this.field9051) / (float) this.field9001;
            float var5 = (float) (this.field9080 * this.field9051) / (float) this.field9037;
            float var6 = (float) ((-this.field8920 + this.field9080) * this.field9051) / (float) this.field9037;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field9051 * 2.0F;
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[7] = 0.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[6] = 0.0F;
                var2[15] = 0.0F;
                var2[13] = 0.0F;
                var2[12] = 0.0F;
                var2[14] = this.field8983 = -((float) this.field8977 * var7) / (float) (-this.field9051 + this.field8977);
                var2[4] = 0.0F;
                var2[10] = this.field9042 = (float) (-(this.field9051 + this.field8977)) / (float) (this.field8977 - this.field9051);
                var2[11] = -1.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[3] = 0.0F;
                var2[2] = 0.0F;
                var2[1] = 0.0F;
                var2[0] = var7 / (var4 - var3);
            } else {
                var2[4] = 0.0F;
                var2[1] = 0.0F;
                var2[12] = 0.0F;
                var2[3] = 0.0F;
                var2[14] = 0.0F;
                var2[8] = 0.0F;
                var2[10] = 1.0F;
                var2[5] = 1.0F;
                var2[7] = 0.0F;
                var2[6] = 0.0F;
                var2[11] = 0.0F;
                var2[0] = 1.0F;
                var2[2] = 0.0F;
                var2[15] = 1.0F;
                var2[13] = 0.0F;
                var2[9] = 0.0F;
            }
            this.method3489(-24684);
        }
    }

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "(B)V")
    private final void method3512(byte arg0) {
        if (arg0 != -5) {
            this.field8932 = null;
        }
        if (~this.field9068 >= ~this.field8967 && this.field9032 >= this.field9030) {
            OpenGL.glScissor(this.field9062 - -this.field9068, -this.field9032 + this.field8920 + this.field9075, -this.field9068 + this.field8967, this.field9032 - this.field9030);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field8768;
    }

    @OriginalMember(owner = "client!pea", name = "z", descriptor = "()Lq;")
    public final class111 method1922() {
        ++field8858;
        return new class367();
    }

    @OriginalMember(owner = "client!pea", name = "m", descriptor = "(IIII)V")
    public final void method1875(int arg0, int arg1, int arg2, int arg3) {
        this.field9080 = arg1;
        ++field8845;
        this.field9001 = arg2;
        this.field9037 = arg3;
        this.field9070 = arg0;
        this.method3511(121);
        this.method3506(74);
        if (this.field8984 != 3) {
            if (this.field8984 == 2) {
                this.method3549((byte) 58);
                return;
            }
        } else {
            this.method3518(true);
        }
    }

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "(II)I")
    public final int method3513(int arg0, int arg1) {
        ++field8901;
        if (~arg1 == -2) {
            return 7681;
        } else if (~arg1 == -1) {
            return 8448;
        } else if (~arg1 != -3) {
            if (arg1 == 3) {
                return 260;
            } else if (~arg1 == -5) {
                return 34023;
            } else if (arg0 >= -124) {
                return -82;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            return 34165;
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1792(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field8771;
        this.method3568(1345026800);
        this.method3547(arg9, true);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!pea", name = "j", descriptor = "()Z")
    public final boolean method1992() {
        ++field8887;
        return true;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lba;Lob;Lq;Lqn;I)V")
    public final void method1892(class629 arg0, class309 arg1, class111 arg2, class455 arg3, int arg4) {
        arg0.method665(arg2, arg3, arg4);
        ++field8872;
        this.method1961(arg1);
    }

    @OriginalMember(owner = "client!pea", name = "D", descriptor = "()Z")
    public final boolean method1901() {
        ++field8821;
        return this.field8932.method535(3, 8);
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "()V")
    public final void method821() {
        ++field8819;
        this.method3505(-783, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!pea", name = "s", descriptor = "()F")
    public final float method3514() {
        ++field8908;
        return this.field9015;
    }

    @OriginalMember(owner = "client!pea", name = "YA", descriptor = "(IFFFFF)V")
    public final void method1991(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field8855;
        boolean var7 = this.field8966 != arg0;
        if (var7 || this.field9000 != arg1 || this.field9048 != arg2) {
            this.field9048 = arg2;
            this.field9000 = arg1;
            this.field8966 = arg0;
            if (var7) {
                this.field9052 = (float) (16711680 & this.field8966) / 1.671168E7F;
                this.field9061 = (float) (this.field8966 & 255) / 255.0F;
                this.field8975 = (float) (this.field8966 & 65280) / 65280.0F;
                this.method3548((byte) -53);
            }
            this.method3535(true);
        }
        if (this.field9065[0] != arg3 || this.field9065[1] != arg4 || this.field9065[2] != arg5) {
            this.field9065[1] = arg4;
            this.field9065[2] = arg5;
            this.field9065[0] = arg3;
            this.field9069[1] = -arg4;
            this.field9069[2] = -arg5;
            this.field9069[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field8989[1] = arg4 * var8;
            this.field8989[0] = arg3 * var8;
            this.field8989[2] = arg5 * var8;
            this.field9035[1] = -this.field8989[1];
            this.field9035[0] = -this.field8989[0];
            this.field9035[2] = -this.field8989[2];
            this.method3544(-20051);
            this.field9016 = (int) (arg3 * 256.0F / arg4);
            this.field8971 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(FIFFF)V")
    public final void method3515(float arg0, int arg1, float arg2, float arg3, float arg4) {
        if (arg1 == -976) {
            class393.field5630[2] = arg2;
            class393.field5630[1] = arg0;
            ++field8806;
            class393.field5630[3] = arg3;
            class393.field5630[0] = arg4;
            OpenGL.glTexEnvfv(8960, 8705, class393.field5630, 0);
        }
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(II)I")
    public final int method2007(int arg0, int arg1) {
        ++field8787;
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!pea", name = "w", descriptor = "()Z")
    public final boolean method1791() {
        ++field8783;
        return true;
    }

    @OriginalMember(owner = "client!pea", name = "C", descriptor = "()V")
    public final void method1929() {
        ++field8933;
    }

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "(I)V")
    public final void method1797(int arg0) {
        ++field8749;
        this.method3531((byte) 52);
    }

    @OriginalMember(owner = "client!pea", name = "f", descriptor = "(Z)I")
    private final int method3516(boolean arg0) {
        ++field8868;
        this.field9005 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field9076 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field9005.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (this.field9005.indexOf("brian paul") != -1 || ~this.field9005.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class105.method562(var3.replace('.', ' '), ' ', arg0);
        if (~var4.length <= -3) {
            try {
                int var5 = class433.method2495(var4[0], 0);
                int var6 = class433.method2495(var4[1], 0);
                this.field8998 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (this.field8998 < 12) {
            var2 |= 2;
        }
        if (!this.field8864.method3348("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field8864.method3348("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field8979 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field9064 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field9066 = var7[0];
        if (~this.field8979 > -3 || ~this.field9064 > -3 || this.field9066 < 2) {
            var2 |= 16;
        }
        this.field8968 = Stream.method1519();
        this.field8864.arePbuffersAvailable();
        this.field9007 = this.field8864.method3348("GL_ARB_vertex_buffer_object");
        this.field9036 = this.field8864.method3348("GL_ARB_multisample");
        this.field8987 = this.field8864.method3348("GL_ARB_vertex_program");
        this.field8864.method3348("GL_ARB_fragment_program");
        this.field9041 = this.field8864.method3348("GL_ARB_vertex_shader");
        this.field9071 = this.field8864.method3348("GL_ARB_fragment_shader");
        this.field9025 = this.field8864.method3348("GL_EXT_texture3D");
        this.field8993 = this.field8864.method3348("GL_ARB_texture_rectangle");
        this.field8964 = this.field8864.method3348("GL_ARB_texture_cube_map");
        this.field9022 = this.field8864.method3348("GL_ARB_texture_float");
        this.field8965 = false;
        this.field9013 = this.field8864.method3348("GL_EXT_framebuffer_object");
        this.field9033 = this.field8864.method3348("GL_EXT_framebuffer_blit");
        this.field9077 = this.field8864.method3348("GL_EXT_framebuffer_multisample");
        this.field9031 = this.field9077 & this.field9033;
        OpenGL.glGetFloatv(2834, class393.field5630, 0);
        this.field9045 = class393.field5630[0];
        this.field9053 = class393.field5630[1];
        return var2 != 0 ? var2 : 0;
    }

    @OriginalMember(owner = "client!pea", name = "i", descriptor = "()V")
    public final void method801() {
        if (this.field8928 != null && this.field8928.method2273((byte) -126)) {
            this.field8930.method2544(this.field8928, false);
            this.field8935.method3647((byte) 102);
        }
        ++field8865;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(FFF)V")
    public final void method851(float arg0, float arg1, float arg2) {
        class173.field2159 = arg2;
        ++field8875;
        class6.field55 = arg0;
        class299.field4000 = arg1;
    }

    @OriginalMember(owner = "client!pea", name = "m", descriptor = "()V")
    public final void method843() {
        for (class28 var1 = this.field8941.method374((byte) 49); var1 != null; var1 = this.field8941.method372(-20740)) {
            ((class210) var1).method1313(61);
        }
        ++field8922;
        if (this.field8930 != null) {
            this.field8930.method2546(33985);
        }
        if (this.field8864 != null) {
            this.method3484(-1);
            Enumeration var2 = this.field8897.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field8897.get(var3);
                this.field8864.releaseSurface(var3, var4);
            }
            this.field8864.release();
            this.field8864 = null;
        }
        if (this.field8938) {
            class238.method1469(-3, false, true);
            this.field8938 = false;
        }
    }

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "()I")
    public final int method1962() {
        ++field8909;
        return 4;
    }

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "()V")
    public final void method827() {
        OpenGL.glFinish();
        ++field8745;
    }

    @OriginalMember(owner = "client!pea", name = "p", descriptor = "(I)V")
    private final void method3517(int arg0) {
        ++field8854;
        int var2 = 101 % ((-60 - arg0) / 58);
        if (~this.field8984 != -3) {
            this.field8984 = 2;
            this.method3549((byte) -119);
            this.method3551(true);
            this.field9028 &= -8;
        }
    }

    @OriginalMember(owner = "client!pea", name = "g", descriptor = "(Z)V")
    private final void method3518(boolean arg0) {
        ++field8794;
        float var2 = (float) (-this.field9070) * this.field9054 / (float) this.field9001;
        float var3 = (float) (-this.field9080) * this.field9054 / (float) this.field9037;
        float var4 = (float) (-this.field9070 + this.field8888) * this.field9054 / (float) this.field9001;
        if (!arg0) {
            this.method1973();
        }
        float var5 = (float) (-this.field9080 + this.field8920) * this.field9054 / (float) this.field9037;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field9051 - this.field9015), (double) ((float) this.field8977 + -this.field9015));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!pea", name = "f", descriptor = "(II)V")
    public final void method3519(int arg0, int arg1) {
        ++field8779;
        class393.field5630[2] = (float) class230.method1424(255, arg0) / 255.0F;
        class393.field5630[3] = (float) (arg0 >>> 24) / 255.0F;
        if (arg1 != -11148) {
            this.method1970(26, -42, -98, 117);
        }
        class393.field5630[1] = (float) class230.method1424(arg0, 65280) / 65280.0F;
        class393.field5630[0] = (float) class230.method1424(16711680, arg0) / 1.671168E7F;
        OpenGL.glTexEnvfv(8960, 8705, class393.field5630, 0);
    }

    @OriginalMember(owner = "client!pea", name = "U", descriptor = "()I")
    public final int method1990() {
        ++field8772;
        return this.field9051;
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(BZ)V")
    public final void method3520(byte arg0, boolean arg1) {
        int var3 = -121 % ((arg0 - -61) / 54);
        ++field8784;
        if (this.field8969 != arg1) {
            this.field8969 = arg1;
            this.method3540(2896);
            this.field9028 &= -8;
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZZI)V")
    public final void method3521(int arg0, boolean arg1, boolean arg2, int arg3) {
        ++field8811;
        int var5 = -29 % ((arg0 - 52) / 55);
        if (~this.field9012 != ~arg3) {
            if (~arg3 > -1) {
                this.method3542(-27663);
                this.method3553((byte) 91, (class254) null);
                this.method3524(0, 14);
                if (!this.field8978) {
                    this.field8932.method531(arg2, 0, true, 0, 0, arg1);
                }
            } else {
                class379 var6 = this.field8935.method3648(arg3, 6602);
                class568 var7 = super.field9731.method1728(-112, arg3);
                if (~var7.field7855 == -1 && var7.field7859 == 0) {
                    this.method3542(-27663);
                } else {
                    int var8 = var7.field7853 ? 64 : 128;
                    int var9 = var8 * 50;
                    this.method3554((byte) 29, (float) (this.field8943 % var9 * var7.field7855) / (float) var9, 0.0F, (float) (this.field8943 % var9 * var7.field7859) / (float) var9);
                }
                if (this.field8978) {
                    this.method3553((byte) -120, var6);
                    this.method3524(var7.field7862, 14);
                } else {
                    this.field8932.method531(arg2, var7.field7866, true, var7.field7856, var7.field7870, arg1);
                    if (!this.field8932.method532(var7.field7862, var6, 20)) {
                        this.method3553((byte) -90, var6);
                        this.method3524(var7.field7862, 14);
                    }
                }
            }
            this.field9012 = arg3;
        }
        this.field9028 &= -8;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lrk;I)V")
    public final void method3522(class57 arg0, int arg1) {
        ++field8741;
        if (this.field9033) {
            this.method3492(arg0, (byte) -128);
            this.method3529(arg0, (byte) -117);
        } else {
            if (this.field8949 < 0 || this.field8946[this.field8949] != arg0) {
                throw new RuntimeException();
            }
            this.field8946[this.field8949--] = null;
            arg0.method356((byte) -32);
            if (this.field8949 < 0) {
                this.field8945 = this.field8947 = null;
            } else {
                this.field8945 = this.field8947 = this.field8946[this.field8949];
                this.field8945.method355((byte) 59);
            }
        }
        if (arg1 > -3) {
            this.field8942 = null;
        }
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(III)V")
    public final void method3523(int arg0, int arg1, int arg2) {
        this.field9075 = arg2;
        ++field8748;
        this.field9062 = arg0;
        int var4 = -112 % ((arg1 - 53) / 55);
        this.method3550((byte) 116);
        this.method3512((byte) -5);
    }

    @OriginalMember(owner = "client!pea", name = "ya", descriptor = "(IIIII)V")
    public final void method1876(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3568(1345026800);
        ++field8797;
        this.method3547(arg4, true);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!pea", name = "g", descriptor = "(II)V")
    public final void method3524(int arg0, int arg1) {
        if (arg1 != 14) {
            this.method1903();
        }
        ++field8856;
        if (~arg0 == -2) {
            this.method3499(7681, 34161, 7681);
        } else if (arg0 != 0) {
            if (arg0 != 2) {
                if (~arg0 == -4) {
                    this.method3499(8448, 34161, 260);
                    return;
                }
                if (~arg0 == -5) {
                    this.method3499(34023, arg1 + 34147, 34023);
                    return;
                }
            } else {
                this.method3499(7681, 34161, 34165);
            }
        } else {
            this.method3499(8448, 34161, 8448);
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIZ)V")
    public final void method3525(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            OpenGL.glTexEnvi(8960, 34176 - -arg2, arg1);
            ++field8816;
            OpenGL.glTexEnvi(8960, arg2 + 34192, arg0);
        }
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;I)V")
    public class641(Canvas arg0, class479 arg1, int arg2) {
        super(arg1);
        new class487();
        new class436(16);
        this.field8953 = new class59();
        this.field8957 = new class59();
        this.field8958 = new class59();
        this.field8959 = new class59();
        this.field8960 = new class59();
        this.field8961 = new class59();
        this.field8962 = new class59();
        this.field8973 = 8448;
        this.field8977 = 3584;
        this.field8995 = 3000.0F;
        this.field8975 = 1.0F;
        this.field8981 = 3584.0F;
        this.field8996 = 3584.0F;
        this.field8967 = 0;
        this.field8989 = new float[4];
        this.field8991 = -1;
        this.field9039 = new float[16];
        this.field9020 = 0.0F;
        this.field9032 = 0;
        this.field9019 = 1.0F;
        this.field8970 = new class329[class168.field2097];
        this.field9000 = -1.0F;
        this.field8994 = -1;
        this.field9029 = 0;
        this.field8974 = 0;
        this.field9045 = -1.0F;
        this.field9051 = 50;
        this.field9014 = 8448;
        this.field9053 = -1.0F;
        this.field9030 = 0;
        this.field9065 = new float[4];
        this.field8966 = -1;
        this.field9037 = 512;
        this.field9001 = 512;
        this.field9048 = -1.0F;
        this.field9068 = 0;
        this.field9061 = 1.0F;
        this.field9075 = 0;
        this.field9052 = 1.0F;
        this.field9035 = new float[4];
        this.field9070 = 0;
        this.field9054 = 1.0F;
        this.field9069 = new float[4];
        this.field9074 = -1;
        this.field9062 = 0;
        this.field9080 = 0;
        this.field9081 = -1;
        this.field9082 = true;
        this.field9078 = new class457(8192);
        this.field9085 = new byte[16384];
        this.field9086 = new int[1];
        this.field9087 = new int[1];
        this.field9088 = new int[1];
        this.field8742 = this.field8873 = arg0;
        this.field8929 = arg2;
        if (!class552.method3093("jaclib", 0)) {
            throw new RuntimeException("");
        } else if (!class552.method3093("jaggl", 0)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field8864 = new OpenGL();
                this.field8905 = this.field8812 = this.field8864.init(arg0, 8, 8, 8, 24, 0, this.field8929);
                if (this.field8812 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method3531((byte) 52);
                    int var4 = this.method3516(true);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field8997 = this.field8968 ? 33639 : 5121;
                        if (~this.field9076.indexOf("radeon") != 0) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class105.method562(this.field9076.replace('/', ' '), ' ', true);
                            for (int var9 = 0; ~var9 > ~var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (var10.charAt(0) == 'x' && ~var10.length() <= -4 && class224.method1371(var10.substring(1, 3), (byte) 94)) {
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
                                            if (var10.length() >= 4 && class224.method1371(var10.substring(0, 4), (byte) 120)) {
                                                var5 = class433.method2495(var10.substring(0, 4), 0);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var16) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && ~var5 >= -9251) {
                                    this.field9025 = false;
                                }
                                if (var5 >= 7000 && var5 <= 7999) {
                                    this.field9007 = false;
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field9022 = false;
                            }
                            this.field8993 &= this.field8864.method3348("GL_ARB_half_float_pixel");
                            this.field9010 = this.field9007;
                            this.field9044 = true;
                        }
                        if (~this.field9005.indexOf("intel") != 0) {
                            this.field9013 = false;
                        }
                        this.field9024 = !this.field9005.equals("s3 graphics");
                        if (this.field9007) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var14) {
                                throw new RuntimeException("");
                            }
                        }
                        class397.method2352(true, -120, false);
                        this.field8938 = true;
                        this.field8935 = new class659(this, super.field9731);
                        this.method3559(-11268);
                        this.field8942 = new class546(this);
                        this.field8930 = new class442(this);
                        if (this.field8930.method2541(-18359)) {
                            this.field8928 = new class107(this);
                            if (!this.field8928.method571(0)) {
                                this.field8928.method574((byte) 87);
                                this.field8928 = null;
                            }
                        }
                        this.field8932 = new class96(this);
                        this.method3558(-1673);
                        this.method3500(2);
                        OpenGL.glClear(16640);
                        int var12 = 0;
                        while (true) {
                            try {
                                this.field8864.swapBuffers();
                                break;
                            } catch (Exception var15) {
                                if (~(var12++) < -6) {
                                    throw new RuntimeException("");
                                }
                                class660.method3668(-1, 100L);
                            }
                        }
                        OpenGL.glClear(16384);
                    }
                }
            } catch (Throwable var17) {
                var17.printStackTrace();
                this.method843();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!pea", name = "D", descriptor = "(I)V")
    public final void method806(int arg0) {
        this.method3547(0, true);
        ++field8891;
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lme;Z)Lxa;")
    public final class424 method1951(class366 arg0, boolean arg1) {
        ++field8852;
        int[] var3 = new int[arg0.field5253 * arg0.field5252];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field5255 != null) {
            for (int var6 = 0; arg0.field5253 > var6; ++var6) {
                for (int var7 = 0; arg0.field5252 > var7; ++var7) {
                    var3[var5++] = class288.method1722(arg0.field5255[var4] << 24, arg0.field5248[class230.method1424(arg0.field5256[var4], 255)]);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; var8 < arg0.field5253; ++var8) {
                for (int var10 = 0; ~arg0.field5252 < ~var10; ++var10) {
                    int var11 = arg0.field5248[arg0.field5256[var4++] & 255];
                    var3[var5++] = var11 == 0 ? 0 : class288.method1722(var11, -16777216);
                }
            }
        }
        class424 var9 = this.method1894(var3, 0, arg0.field5252, arg0.field5252, arg0.field5253);
        var9.method1155(arg0.field5250, arg0.field5251, arg0.field5254, arg0.field5249);
        return var9;
    }

    @OriginalMember(owner = "client!pea", name = "h", descriptor = "(II)I")
    public final int method3526(int arg0, int arg1) {
        ++field8907;
        if (~arg1 != arg0 && ~arg1 != -5121) {
            if (arg1 != 5123 && arg1 != 5122) {
                if (arg1 != 5125 && ~arg1 != -5125 && arg1 != 5126) {
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

    @OriginalMember(owner = "client!pea", name = "q", descriptor = "()Z")
    public final boolean method1903() {
        ++field8800;
        return true;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lq;)V")
    public final void method1887(class111 arg0) {
        ++field8885;
        this.field9011 = (class367) arg0;
        this.field8980.method2259(true, this.field9011);
        if (this.field8984 != 1) {
            this.method3551(true);
        }
    }

    @OriginalMember(owner = "client!pea", name = "h", descriptor = "(Z)V")
    public final void method3527(boolean arg0) {
        if (~this.field9028 != -17) {
            this.method3556(-4);
            this.method3569(true, -32);
            this.method3485((byte) 83, true);
            this.method3505(-783, true);
            this.method3547(1, true);
            this.field9028 = 16;
        }
        if (!arg0) {
            ++field8803;
        }
    }

    @OriginalMember(owner = "client!pea", name = "L", descriptor = "(ILfa;II)V")
    public final void method1956(int arg0, class185 arg1, int arg2, int arg3) {
        ++field8835;
        class200 var5 = (class200) arg1;
        class459 var6 = var5.field2628;
        this.method3564(14528);
        this.method3553((byte) -124, var5.field2628);
        this.method3547(1, true);
        this.method3499(8448, 34161, 7681);
        this.method3525(768, 34167, 0, true);
        float var7 = var6.field6240 / (float) var6.field6239;
        float var8 = var6.field6242 / (float) var6.field6241;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field9068) * var7, (float) (-arg3 + this.field9030) * var8);
        OpenGL.glVertex2i(this.field9068, this.field9030);
        OpenGL.glTexCoord2f((float) (this.field9068 - arg2) * var7, (float) (this.field9032 - arg3) * var8);
        OpenGL.glVertex2i(this.field9068, this.field9032);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field8967) * var7, (float) (-arg3 + this.field9032) * var8);
        OpenGL.glVertex2i(this.field8967, this.field9032);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field8967) * var7, (float) (-arg3 + this.field9030) * var8);
        OpenGL.glVertex2i(this.field8967, this.field9030);
        OpenGL.glEnd();
        this.method3525(768, 5890, 0, true);
    }

    @OriginalMember(owner = "client!pea", name = "q", descriptor = "(I)Lcn;")
    public final class322 method3528(int arg0) {
        if (arg0 > -101) {
            return null;
        } else {
            ++field8917;
            return this.field8976 != null ? this.field8976.method1328(-98) : null;
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)V")
    public final void method1983(int arg0) {
        ++field8837;
        if (~arg0 <= -129 && arg0 <= 1024) {
            this.field8934 = arg0;
            this.field8935.method3647((byte) 102);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(Lrk;B)V")
    public final void method3529(class57 arg0, byte arg1) {
        ++field8769;
        if (~this.field8952 <= -1 && this.field8950[this.field8952] == arg0) {
            if (arg1 >= -110) {
                this.field9082 = false;
            }
            this.field8950[this.field8952--] = null;
            arg0.method359(-2010);
            if (this.field8952 >= 0) {
                this.field8947 = this.field8950[this.field8952];
                this.field8947.method358(15414);
            } else {
                this.field8947 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pea", name = "f", descriptor = "()Lq;")
    public final class111 method1972() {
        ++field8758;
        return this.field8936;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIII)V")
    public final void method834(int arg0, int arg1, int arg2, int arg3) {
        this.field8930.method2539(arg1, 115, arg3, arg2, arg0);
        ++field8789;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIIF)Lhj;")
    public final class329 method1940(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field8836;
        return new class288(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!pea", name = "i", descriptor = "(II)V")
    public final void method3530(int arg0, int arg1) {
        this.method3532(true, arg0, 1);
        int var3 = 94 % ((arg1 - -18) / 58);
        ++field8877;
    }

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "(B)V")
    private final void method3531(byte arg0) {
        if (arg0 != 52) {
            this.method3531((byte) 62);
        }
        ++field8825;
        int var2 = 0;
        while (!this.field8864.method3347()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class660.method3668(arg0 + -53, 1000L);
        }
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1907(Canvas arg0) {
        ++field8861;
        if (this.field8873 == arg0) {
            throw new RuntimeException();
        } else if (!this.field8897.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field8864.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field8897.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "([Lba;Lob;Lq;[Lqn;I)V")
    public final void method1796(class629[] arg0, class309 arg1, class111 arg2, class455[] arg3, int arg4) {
        ++field8815;
        this.method1799(arg0, arg2, arg3, arg4);
        this.method1961(arg1);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lrf;IIII)Lba;")
    public final class629 method1784(class238 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8760;
        return new class514(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZII)V")
    public final void method3532(boolean arg0, int arg1, int arg2) {
        ++field8923;
        if (arg2 != 1) {
            this.field8935 = null;
        }
        this.method3521(108, arg0, true, arg1);
    }

    @OriginalMember(owner = "client!pea", name = "f", descriptor = "(B)V")
    public final void method3533(byte arg0) {
        if (~this.field9028 != -9) {
            this.method3517(73);
            this.method3569(true, -32);
            this.method3485((byte) 109, true);
            this.method3505(-783, true);
            this.method3547(1, true);
            this.field9028 = 8;
        }
        ++field8860;
        if (arg0 < 64) {
            this.field9085 = null;
        }
    }

    @OriginalMember(owner = "client!pea", name = "Q", descriptor = "(IIII)V")
    public final void method1970(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9068 < arg0) {
            this.field9068 = arg0;
        }
        if (~arg2 > ~this.field8967) {
            this.field8967 = arg2;
        }
        ++field8879;
        if (~arg3 > ~this.field9032) {
            this.field9032 = arg3;
        }
        if (this.field9030 < arg1) {
            this.field9030 = arg1;
        }
        OpenGL.glEnable(3089);
        this.method3506(107);
        this.method3512((byte) -5);
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(Z)V")
    public final void method1897(boolean arg0) {
        ++field8867;
    }

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "(IIIIII)V")
    public final void method1975(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8801;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        this.method3568(1345026800);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method3547(arg5, true);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field9036) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field9036) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZIIIIZLpq;)V")
    public static final void method3534(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class159 arg6) {
        ++field8830;
        class159.field1987 = arg5;
        class333.field4865 = arg2;
        class369.field5301 = 1;
        class265.field3643 = arg3;
        if (arg0) {
            method3534(true, 96, -74, 100, -19, true, (class159) null);
        }
        class168.field2093 = arg6;
        class208.field2732 = arg1;
        class490.field6609 = class648.field9178.method311((byte) -122) / arg4;
        if (class490.field6609 < 1) {
            class490.field6609 = 1;
        }
    }

    @OriginalMember(owner = "client!pea", name = "sa", descriptor = "(II)V")
    public final void method1885(int arg0, int arg1) {
        ++field8737;
        if (~this.field9051 != ~arg0 || this.field8977 != arg1) {
            this.field9051 = arg0;
            this.field8977 = arg1;
            this.method3511(114);
            this.method3561(false);
            if (~this.field8984 != -4) {
                if (this.field8984 == 2) {
                    this.method3549((byte) 109);
                    return;
                }
            } else {
                this.method3518(true);
            }
        }
    }

    @OriginalMember(owner = "client!pea", name = "i", descriptor = "(Z)V")
    private final void method3535(boolean arg0) {
        class393.field5630[1] = this.field9000 * this.field8975;
        class393.field5630[2] = this.field9061 * this.field9000;
        ++field8912;
        class393.field5630[3] = 1.0F;
        class393.field5630[0] = this.field9052 * this.field9000;
        OpenGL.glLightfv(16384, 4609, class393.field5630, 0);
        if (!arg0) {
            this.method1901();
        }
        class393.field5630[0] = -this.field9048 * this.field9052;
        class393.field5630[1] = -this.field9048 * this.field8975;
        class393.field5630[3] = 1.0F;
        class393.field5630[2] = -this.field9048 * this.field9061;
        OpenGL.glLightfv(16385, 4609, class393.field5630, 0);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(BLrm;)V")
    public final void method3536(byte arg0, class359 arg1) {
        if (this.field9046 != arg1) {
            if (this.field9007) {
                OpenGL.glBindBufferARB(34963, arg1.method1110((byte) -128));
            }
            this.field9046 = arg1;
        }
        if (arg0 >= 99) {
            ++field8840;
        }
    }

    @OriginalMember(owner = "client!pea", name = "f", descriptor = "(I)Li;")
    public final class173 method1918(int arg0) {
        ++field8780;
        class210 var2 = new class210(arg0);
        this.field8941.method378(var2, 31316);
        return var2;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(JI)V")
    public final synchronized void method3537(long arg0, int arg1) {
        if (arg1 != -31441) {
            this.method1987(54, -31);
        }
        ++field8913;
        class28 var4 = new class28();
        var4.field272 = arg0;
        this.field8962.method378(var4, 31316);
    }

    @OriginalMember(owner = "client!pea", name = "r", descriptor = "(I)V")
    public static final void method3538(int arg0) {
        if (arg0 != 28970) {
            method3538(-101);
        }
        ++field8910;
        if (class9.field103 != null) {
            class34.field332.method2225(arg0 + 513);
            class275.method1673();
            class578.method3254(true);
            class270.method1656((byte) 89);
            class546.method3072((byte) 124);
            class492.method2770(2);
            if (class397.field5668 != null) {
                class397.field5668.method994(arg0 + -28970);
            }
            class311.method1872(18294);
            class308.method1848(true);
            class511.method2888((byte) 67);
            class79.method452(-112);
            class227.method1389(arg0 ^ 29034, false);
            for (int var1 = 0; ~var1 > -2049; ++var1) {
                class519 var5 = class292.field3912[var1];
                if (var5 != null) {
                    var5.field525 = null;
                    for (int var6 = 0; var6 < var5.field522.length; ++var6) {
                        var5.field522[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class327.field4786; ++var2) {
                class676 var3 = class42.field541[var2].field8702;
                if (var3 != null) {
                    for (int var4 = 0; ~var4 > ~var3.field522.length; ++var4) {
                        var3.field522[var4] = null;
                    }
                }
            }
            class108.field1302 = null;
            class488.field6582 = null;
            class9.field103.method3813(false);
            class9.field103 = null;
        }
    }

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1790(Canvas arg0) {
        ++field8926;
        long var2 = 0L;
        if (arg0 != null && this.field8873 != arg0) {
            if (this.field8897.containsKey(arg0)) {
                Long var4 = (Long) this.field8897.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field8812;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field8864.surfaceResized(var2);
            if (this.field8742 == arg0) {
                this.method3500(2);
            }
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lrk;Z)V")
    public final void method3539(class57 arg0, boolean arg1) {
        ++field8890;
        if (this.field8952 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field8952 <= -1) {
                this.field8950[this.field8952].method359(-2010);
            }
            this.field8947 = this.field8950[++this.field8952] = arg0;
            this.field8947.method358(15414);
            if (arg1) {
                this.method3558(123);
            }
        }
    }

    @OriginalMember(owner = "client!pea", name = "s", descriptor = "(I)V")
    private final void method3540(int arg0) {
        if (this.field8969 && !this.field9050) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field8752;
        if (arg0 != 2896) {
            method3538(59);
        }
    }

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "(Lrk;B)V")
    public final void method3541(class57 arg0, byte arg1) {
        ++field8828;
        if (arg1 == -13) {
            if (!this.field9033) {
                if (this.field8949 >= 3) {
                    throw new RuntimeException();
                } else {
                    if (this.field8949 >= 0) {
                        this.field8946[this.field8949].method356((byte) -53);
                    }
                    this.field8945 = this.field8947 = this.field8946[++this.field8949] = arg0;
                    this.field8945.method355((byte) 59);
                }
            } else {
                this.method3560(arg0, -123);
                this.method3539(arg0, false);
            }
        }
    }

    @OriginalMember(owner = "client!pea", name = "t", descriptor = "(I)V")
    private final void method3542(int arg0) {
        if (this.field9060) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field9060 = false;
        }
        if (arg0 != -27663) {
            this.method3513(-55, -29);
        }
        ++field8876;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZI)V")
    public final synchronized void method3543(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method1950();
        }
        ++field8834;
        class360 var4 = new class360(arg0);
        var4.field272 = (long) arg2;
        this.field8957.method378(var4, 31316);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lob;)V")
    public final void method1961(class309 arg0) {
        this.field8931.method2859(arg0, this, (byte) -22);
        ++field8804;
    }

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "(IIIIII)Laq;")
    public final class108 method1954(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8810;
        return this.field8964 ? new class214(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!pea", name = "u", descriptor = "(I)V")
    public final void method3544(int arg0) {
        ++field8880;
        OpenGL.glLightfv(16384, 4611, this.field8989, 0);
        OpenGL.glLightfv(16385, 4611, this.field9035, 0);
        if (arg0 != -20051) {
            this.method3565(82, 0.07189784F, -2.3451352F);
        }
    }

    @OriginalMember(owner = "client!pea", name = "ma", descriptor = "(IIIIII[BII)V")
    public final void method2006(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field8791;
        float var10;
        float var11;
        if (this.field9073 != null && arg2 <= this.field9073.field5437 && this.field9073.field5430 >= arg3) {
            this.field9073.method2295(0, arg3, arg2, arg6, 0, 0, 6406, 0, true, false);
            var10 = (float) arg3 * this.field9073.field6242 / (float) this.field9073.field5430;
            var11 = (float) arg2 * this.field9073.field6240 / (float) this.field9073.field5437;
        } else {
            this.field9073 = class319.method2070(6406, arg2, false, 6406, arg3, this, -2709, arg6);
            this.field9073.method2299(-128, false, false);
            var10 = this.field9073.field6242;
            var11 = this.field9073.field6240;
        }
        this.method3564(14528);
        this.method3553((byte) 42, this.field9073);
        this.method3547(arg8, true);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method3519(arg5, -11148);
        this.method3499(34165, 34161, 34165);
        this.method3525(768, 34166, 0, true);
        this.method3525(770, 5890, 2, true);
        this.method3557(8960, 770, 0, 34166);
        this.method3557(8960, 770, 2, 5890);
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
        this.method3525(768, 5890, 0, true);
        this.method3525(770, 34166, 2, true);
        this.method3557(8960, 770, 0, 5890);
        this.method3557(8960, 770, 2, 34166);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(II[I[I)Lfa;")
    public final class185 method1982(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field8900;
        return class21.method118((byte) -128, arg2, this, arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Ljaclib/memory/Buffer;IZZI)Lav;")
    public final class437 method3545(Buffer arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        if (arg2) {
            this.method3544(40);
        }
        ++field8871;
        return (class437) (!this.field9007 || arg3 && !this.field9010 ? new class522(this, arg4, arg0) : new class569(this, arg4, arg0, arg1, arg3));
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1786(Canvas arg0) {
        this.field8742 = null;
        this.field8905 = 0L;
        ++field8847;
        if (arg0 != null && this.field8873 != arg0) {
            if (this.field8897.containsKey(arg0)) {
                Long var2 = (Long) this.field8897.get(arg0);
                this.field8905 = var2;
                this.field8742 = arg0;
            }
        } else {
            this.field8905 = this.field8812;
            this.field8742 = this.field8873;
        }
        if (this.field8742 != null && ~this.field8905 != -1L) {
            this.field8864.setSurface(this.field8905);
            this.method3500(2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pea", name = "g", descriptor = "(B)V")
    public final void method3546(byte arg0) {
        if (this.field9028 != 4) {
            this.method3487((byte) 94);
            this.method3569(false, -32);
            this.method3520((byte) 81, false);
            this.method3485((byte) -102, false);
            this.method3505(-783, false);
            this.method3530(-2, 71);
            this.method3547(1, true);
            this.field9028 = 4;
        }
        ++field8802;
        if (arg0 > -57) {
            this.field8963 = 21;
        }
    }

    @OriginalMember(owner = "client!pea", name = "FA", descriptor = "(IIIIII)Z")
    public final boolean method1932(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8924;
        float var7 = (float) arg2 * this.field9011.field5267 + (float) arg0 * this.field9011.field5270 + (float) arg1 * this.field9011.field5258 + this.field9011.field5279;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field9011.field5267 + (float) arg3 * this.field9011.field5270 + (float) arg4 * this.field9011.field5258 + this.field9011.field5279;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field9051) || !(var8 < (float) this.field9051)) && (!(var7 > (float) this.field8977) || !(var8 > (float) this.field8977))) {
            int var9 = (int) (((float) arg2 * this.field9011.field5262 + (float) arg0 * this.field9011.field5286 + (float) arg1 * this.field9011.field5276 + this.field9011.field5269) * (float) this.field9001 / var7);
            int var10 = (int) (((float) arg5 * this.field9011.field5262 + (float) arg3 * this.field9011.field5286 + (float) arg4 * this.field9011.field5276 + this.field9011.field5269) * (float) this.field9001 / var8);
            if (this.field9072 > (float) var9 && (float) var10 < this.field9072 || this.field9067 < (float) var9 && (float) var10 > this.field9067) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field9011.field5266 + (float) arg0 * this.field9011.field5291 + (float) arg1 * this.field9011.field5264 + this.field9011.field5259) * (float) this.field9037 / var7);
                int var12 = (int) (((float) arg5 * this.field9011.field5266 + (float) arg3 * this.field9011.field5291 + (float) arg4 * this.field9011.field5264 + this.field9011.field5259) * (float) this.field9037 / var8);
                return (!((float) var11 < this.field9002) || !(this.field9002 > (float) var12)) && (!((float) var11 > this.field9021) || !(this.field9021 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method803(Rectangle[] arg0, int arg1) throws class352 {
        ++field8832;
        this.method805();
    }

    @OriginalMember(owner = "client!pea", name = "F", descriptor = "()V")
    public final void method1984() {
        ++field8824;
        this.field9030 = 0;
        this.field9068 = 0;
        this.field9032 = this.field8920;
        this.field8967 = this.field8888;
        OpenGL.glDisable(3089);
        this.method3506(101);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIIII)V")
    public final void method1800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8916;
        OpenGL.glLineWidth((float) arg5);
        this.method2010(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!pea", name = "aa", descriptor = "()I")
    public final int method1889() {
        ++field8732;
        int var1 = this.field9083;
        this.field9083 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(IZ)V")
    public final void method3547(int arg0, boolean arg1) {
        ++field8848;
        if (~this.field8963 != ~arg0) {
            boolean var3;
            boolean var4;
            byte var5;
            if (~arg0 == -2) {
                var3 = true;
                var4 = true;
                var5 = 1;
            } else if (~arg0 == -3) {
                var5 = 2;
                var4 = true;
                var3 = false;
            } else if (arg0 == 128) {
                var4 = true;
                var3 = true;
                var5 = 3;
            } else {
                var5 = 0;
                var3 = false;
                var4 = true;
            }
            if (!var4 == this.field8972) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field8972 = var4;
            }
            if (!this.field9018 == var3) {
                if (var3) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field9018 = var3;
            }
            if (~this.field8990 != ~var5) {
                if (~var5 != -2) {
                    if (var5 == 2) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    } else if (var5 == 3) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    } else {
                        OpenGL.glDisable(3042);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field8990 = var5;
            }
            this.field9028 &= -29;
            this.field8963 = arg0;
        }
        if (!arg1) {
            this.method2000(30, 52, 74, 86, 108, -77, (class185) null, -30, 103);
        }
    }

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "(I)V")
    public final synchronized void method785(int arg0) {
        ++field8895;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field8957.method379(-1)) {
            class360 var12 = (class360) this.field8957.method368(55);
            class56.field783[var3++] = (int) var12.field272;
            this.field8954 -= var12.field5197;
            if (~var3 == -1001) {
                OpenGL.glDeleteBuffersARB(var3, class56.field783, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class56.field783, 0);
            var3 = 0;
        }
        while (!this.field8958.method379(-1)) {
            class360 var11 = (class360) this.field8958.method368(92);
            class56.field783[var3++] = (int) var11.field272;
            this.field8955 -= var11.field5197;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class56.field783, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class56.field783, 0);
            var3 = 0;
        }
        while (!this.field8959.method379(-1)) {
            class360 var10 = (class360) this.field8959.method368(84);
            class56.field783[var3++] = var10.field5197;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class56.field783, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class56.field783, 0);
            var3 = 0;
        }
        while (!this.field8960.method379(-1)) {
            class360 var9 = (class360) this.field8960.method368(100);
            class56.field783[var3++] = (int) var9.field272;
            this.field8956 -= var9.field5197;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class56.field783, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class56.field783, 0);
            boolean var4 = false;
        }
        while (!this.field8953.method379(-1)) {
            class360 var8 = (class360) this.field8953.method368(119);
            OpenGL.glDeleteLists((int) var8.field272, var8.field5197);
        }
        while (!this.field8961.method379(-1)) {
            class28 var7 = this.field8961.method368(79);
            OpenGL.glDeleteProgramARB((int) var7.field272);
        }
        while (!this.field8962.method379(-1)) {
            class28 var6 = this.field8962.method368(114);
            OpenGL.glDeleteObjectARB(var6.field272);
        }
        while (!this.field8953.method379(-1)) {
            class360 var5 = (class360) this.field8953.method368(88);
            OpenGL.glDeleteLists((int) var5.field272, var5.field5197);
        }
        this.field8935.method3650(127);
        if (~this.method1950() < -100663297 && ~class669.method3713(0) < ~(this.field9023 + 60000L)) {
            System.gc();
            this.field9023 = class669.method3713(0);
        }
        this.field8943 = var2;
    }

    @OriginalMember(owner = "client!pea", name = "B", descriptor = "()Z")
    public final boolean method1988() {
        ++field8775;
        return true;
    }

    @OriginalMember(owner = "client!pea", name = "h", descriptor = "(B)V")
    private final void method3548(byte arg0) {
        if (arg0 == -53) {
            class393.field5630[0] = this.field9052 * this.field9004;
            class393.field5630[2] = this.field9061 * this.field9004;
            class393.field5630[3] = 1.0F;
            class393.field5630[1] = this.field9004 * this.field8975;
            ++field8898;
            OpenGL.glLightModelfv(2899, class393.field5630, 0);
        }
    }

    @OriginalMember(owner = "client!pea", name = "i", descriptor = "(B)V")
    private final void method3549(byte arg0) {
        OpenGL.glMatrixMode(5889);
        int var2 = -33 % ((arg0 - -58) / 51);
        ++field8831;
        OpenGL.glLoadMatrixf(this.field9039, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!pea", name = "v", descriptor = "()I")
    public final int method1950() {
        ++field8808;
        return this.field8955 + this.field8954 + this.field8956;
    }

    @OriginalMember(owner = "client!pea", name = "d", descriptor = "(Z)V")
    public final void method1798(boolean arg0) {
        ++field8893;
        this.field9082 = arg0;
        this.method3490((byte) 74);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIIILfa;II)V")
    public final void method2000(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class185 arg6, int arg7, int arg8) {
        ++field8859;
        class200 var10 = (class200) arg6;
        class459 var11 = var10.field2628;
        this.method3564(14528);
        this.method3553((byte) -101, var10.field2628);
        this.method3547(arg5, true);
        this.method3499(8448, 34161, 7681);
        this.method3525(768, 34167, 0, true);
        float var12 = var11.field6240 / (float) var11.field6239;
        float var13 = var11.field6242 / (float) var11.field6241;
        float var14 = (float) (-arg0) + (float) arg2;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var14 * var16;
        float var18 = var15 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method3525(768, 5890, 0, true);
    }

    @OriginalMember(owner = "client!pea", name = "h", descriptor = "(IIIII)V")
    public final void method2008(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        ++field8774;
        if (this.field9068 <= arg0 + arg2 && this.field8967 >= arg0 - arg2 && this.field9030 <= arg1 + arg2 && this.field9032 >= -arg2 + arg1) {
            this.method3568(1345026800);
            this.method3547(arg4, true);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field9045 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if ((float) var8 <= this.field9053) {
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
                int var10 = class20.method114(var9, (byte) 109);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class144.field1837[var11] * (float) arg2 + var6, class144.field1838[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!pea", name = "X", descriptor = "(III)V")
    public final void method2001(int arg0, int arg1, int arg2) {
        if (~this.field8994 != ~arg0 || this.field8991 != arg1 || ~this.field8974 != ~arg2) {
            this.field8974 = arg2;
            this.field8991 = arg1;
            this.field8994 = arg0;
            if (!this.field8978) {
                this.method3561(false);
                this.method3509(-126);
            }
        }
        ++field8927;
    }

    @OriginalMember(owner = "client!pea", name = "j", descriptor = "(B)V")
    private final void method3550(byte arg0) {
        ++field8763;
        OpenGL.glViewport(this.field9062, this.field9075, this.field8888, this.field8920);
        if (arg0 <= 80) {
            this.field9081 = 13;
        }
    }

    @OriginalMember(owner = "client!pea", name = "j", descriptor = "(Z)V")
    private final void method3551(boolean arg0) {
        OpenGL.glLoadIdentity();
        ++field8827;
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field9011.method2257((byte) -72), 0);
        if (this.field8978) {
            this.field8932.field1190.method3321(122);
        }
        this.method3544(-20051);
        this.method3504((byte) -106);
        if (!arg0) {
            this.field9030 = 46;
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "([Lba;Lq;[Lqn;I)V")
    public final void method1799(class629[] arg0, class111 arg1, class455[] arg2, int arg3) {
        ++field8826;
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method665(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lgb;B)V")
    public final void method3552(class367 arg0, byte arg1) {
        if (arg1 > -90) {
            this.field9021 = 1.206608F;
        }
        ++field8896;
        OpenGL.glLoadMatrixf(arg0.method2257((byte) 105), 0);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(BLwq;)V")
    public final void method3553(byte arg0, class254 arg1) {
        ++field8874;
        class254 var3 = this.field9026[this.field8985];
        if (arg1 != var3) {
            if (arg1 == null) {
                OpenGL.glDisable(var3.field3500);
            } else {
                if (var3 != null) {
                    if (~arg1.field3500 != ~var3.field3500) {
                        OpenGL.glDisable(var3.field3500);
                        OpenGL.glEnable(arg1.field3500);
                    }
                } else {
                    OpenGL.glEnable(arg1.field3500);
                }
                OpenGL.glBindTexture(arg1.field3500, arg1.method1587(113));
            }
            this.field9026[this.field8985] = arg1;
        }
        int var4 = 108 % ((-37 - arg0) / 51);
        this.field9028 &= -2;
    }

    @OriginalMember(owner = "client!pea", name = "o", descriptor = "()V")
    public final void method805() throws class352 {
        try {
            this.field8864.swapBuffers();
        } catch (Exception var1) {
        }
        ++field8925;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(BFFF)V")
    private final void method3554(byte arg0, float arg1, float arg2, float arg3) {
        OpenGL.glMatrixMode(5890);
        ++field8793;
        if (this.field9060) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg1, arg3, arg2);
        if (arg0 != 29) {
            this.field9027 = null;
        }
        OpenGL.glMatrixMode(5888);
        this.field9060 = true;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lil;[Lme;Z)Lta;")
    public final class301 method2020(class598 arg0, class366[] arg1, boolean arg2) {
        ++field8751;
        return new class605(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "([IIIII)Lxa;")
    public final class424 method1894(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8734;
        return new class343(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pea", name = "k", descriptor = "()V")
    public final void method1953() {
        ++field8870;
        this.field8978 = false;
        this.field8932.method531(false, 0, true, 0, 0, false);
        this.method3561(false);
        this.method3509(-128);
    }

    @OriginalMember(owner = "client!pea", name = "j", descriptor = "(II)I")
    public final int method3555(int arg0, int arg1) {
        ++field8882;
        if (arg0 != 7745) {
            this.field9000 = -1.4182204F;
        }
        if (~arg1 != -6407 && ~arg1 != -6410) {
            if (arg1 != 6410 && arg1 != 34846 && arg1 != 34844) {
                if (arg1 == 6407) {
                    return 3;
                } else if (arg1 != 6408 && ~arg1 != -34848) {
                    if (~arg1 == -34844) {
                        return 6;
                    } else if (arg1 == 34842) {
                        return 8;
                    } else if (~arg1 == -6403) {
                        return 3;
                    } else if (arg1 == 6401) {
                        return 1;
                    } else {
                        throw new IllegalArgumentException("");
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

    @OriginalMember(owner = "client!pea", name = "y", descriptor = "()Z")
    public final boolean method1973() {
        ++field8915;
        return this.field8928 != null && (~this.field8929 >= -2 || this.field9031);
    }

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "(IIIII)V")
    public final void method1879(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8866;
        this.method3568(1345026800);
        this.method3547(arg4, true);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!pea", name = "v", descriptor = "(I)V")
    private final void method3556(int arg0) {
        if (~this.field8984 != arg0) {
            this.field8984 = 3;
            this.method3518(true);
            this.method3551(true);
            this.field9028 &= -8;
        }
        ++field8814;
    }

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "(IIII)V")
    public final void method3557(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(arg0, arg2 + 34184, arg3);
        ++field8770;
        OpenGL.glTexEnvi(8960, 34200 - -arg2, arg1);
    }

    @OriginalMember(owner = "client!pea", name = "e", descriptor = "(Z)V")
    public final void method778(boolean arg0) {
        ++field8805;
    }

    @OriginalMember(owner = "client!pea", name = "KA", descriptor = "(IIII)[I")
    public final int[] method797(int arg0, int arg1, int arg2, int arg3) {
        ++field8735;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + this.field8920 - arg1, arg2, 1, 32993, this.field8997, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pea", name = "n", descriptor = "()Z")
    public final boolean method1976() {
        ++field8809;
        return true;
    }

    @OriginalMember(owner = "client!pea", name = "ha", descriptor = "(F)V")
    public final void method1986(float arg0) {
        if (this.field9004 != arg0) {
            this.field9004 = arg0;
            this.method3548((byte) -53);
        }
        ++field8792;
    }

    @OriginalMember(owner = "client!pea", name = "w", descriptor = "(I)V")
    private final void method3558(int arg0) {
        this.method3530(-2, -103);
        ++field8790;
        for (int var2 = this.field8979 + -1; var2 >= 0; --var2) {
            this.method3488(var2, (byte) 23);
            this.method3553((byte) 103, (class254) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method3499(8448, arg0 + 35834, 8448);
        this.method3525(770, 34168, 2, true);
        this.method3542(-27663);
        this.field8963 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field8990 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field9018 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field8972 = true;
        this.method3569(true, -32);
        this.method3520((byte) -120, true);
        this.method3485((byte) 117, true);
        this.method3505(arg0 ^ 1414, true);
        this.method3566((byte) -95);
        this.field8864.setSwapInterval(0);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        if (arg0 != -1673) {
            this.field8964 = true;
        }
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
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field8966 = this.field8994 = -1;
        this.method1984();
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public final class176 method1787(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field8778;
        return new class517(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!pea", name = "x", descriptor = "(I)V")
    private final void method3559(int arg0) {
        this.field9011 = new class367();
        ++field8796;
        this.field8980 = new class367();
        this.field9026 = new class254[this.field8979];
        this.field9034 = new class379(this, 3553, 6408, 1, 1);
        new class379(this, 3553, 6408, 1, 1);
        new class379(this, 3553, 6408, 1, 1);
        this.field9038 = new class514(this);
        this.field9008 = new class514(this);
        this.field9049 = new class514(this);
        this.field9058 = new class514(this);
        if (arg0 != -11268) {
            this.method1784((class238) null, 75, -100, 58, 101);
        }
        this.field9079 = new class514(this);
        this.field9056 = new class514(this);
        this.field8982 = new class514(this);
        this.field9017 = new class514(this);
        this.field9055 = new class514(this);
        this.field8992 = new class514(this);
        if (this.field9013) {
            this.field9003 = new class120(this);
            new class120(this);
        }
    }

    @OriginalMember(owner = "client!pea", name = "r", descriptor = "()Z")
    public final boolean method1933() {
        ++field8914;
        return this.field9036 && (!this.method811() || this.field9031);
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(Lrk;I)V")
    public final void method3560(class57 arg0, int arg1) {
        ++field8795;
        if (this.field8951 >= 3) {
            throw new RuntimeException();
        } else if (arg1 < -85) {
            if (~this.field8951 <= -1) {
                this.field8948[this.field8951].method354(-9874);
            }
            this.field8945 = this.field8948[++this.field8951] = arg0;
            this.field8945.method357(-8166);
        }
    }

    @OriginalMember(owner = "client!pea", name = "k", descriptor = "(Z)V")
    private final void method3561(boolean arg0) {
        ++field8838;
        int var2;
        if (!this.field8978) {
            this.field9047 = (float) (-this.field8974 + this.field8977) + -this.field9020;
            this.field9057 = this.field9047 - (float) this.field8991 * this.field9019;
            if (this.field9057 < (float) this.field9051) {
                this.field9057 = (float) this.field9051;
            }
            OpenGL.glFogf(2915, this.field9057);
            OpenGL.glFogf(2916, this.field9047);
            var2 = this.field8994;
        } else {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field9074;
        }
        class393.field5630[1] = (float) class230.method1424(var2, 65280) / 65280.0F;
        class393.field5630[0] = (float) class230.method1424(16711680, var2) / 1.671168E7F;
        class393.field5630[2] = (float) class230.method1424(255, var2) / 255.0F;
        OpenGL.glFogfv(2918, class393.field5630, 0);
        if (!arg0) {
            if (this.field8978) {
                this.field8932.field1190.method3319(0);
            }
        }
    }

    @OriginalMember(owner = "client!pea", name = "E", descriptor = "()F")
    public final float method3562() {
        ++field8767;
        return this.field8995;
    }

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "(III)V")
    public final synchronized void method3563(int arg0, int arg1, int arg2) {
        ++field8765;
        if (arg1 != 1) {
            this.field8954 = -12;
        }
        class360 var4 = new class360(arg0);
        var4.field272 = (long) arg2;
        this.field8958.method378(var4, 31316);
    }

    @OriginalMember(owner = "client!pea", name = "y", descriptor = "(I)V")
    public final void method3564(int arg0) {
        if (arg0 != 14528) {
            this.field8966 = 106;
        }
        ++field8817;
        if (~this.field9028 != -3) {
            this.method3487((byte) 82);
            this.method3569(false, -32);
            this.method3520((byte) -115, false);
            this.method3485((byte) -128, false);
            this.method3505(-783, false);
            this.method3530(-2, 117);
            this.field9028 = 2;
        }
    }

    @OriginalMember(owner = "client!pea", name = "t", descriptor = "()Z")
    public final boolean method842() {
        ++field8739;
        if (this.field8928 != null) {
            if (!this.field8928.method2273((byte) -127)) {
                if (!this.field8930.method2542(this.field8928, (byte) 40)) {
                    return false;
                }
                this.field8935.method3647((byte) 102);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IFF)V")
    public final void method3565(int arg0, float arg1, float arg2) {
        if (arg0 < 52) {
            this.field8945 = null;
        }
        this.field9020 = arg1;
        this.field9019 = arg2;
        ++field8782;
        if (!this.field8978) {
            this.method3561(false);
        }
    }

    @OriginalMember(owner = "client!pea", name = "k", descriptor = "(B)V")
    public final void method3566(byte arg0) {
        if (arg0 >= -10) {
            this.field9058 = null;
        }
        ++field8911;
        if (~this.field8984 != -1) {
            this.field8984 = 0;
            this.field9028 &= -32;
        }
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(I)V")
    public final void method1794(int arg0) {
        this.method3484(-1);
        ++field8766;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(IIIIZ)Lxa;")
    public final class424 method1939(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field8786;
        return new class343(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(Lcm;ILcm;Lcm;Lcm;)V")
    public final void method3567(class158 arg0, int arg1, class158 arg2, class158 arg3, class158 arg4) {
        ++field8883;
        if (arg3 != null) {
            this.method3493(arg1 ^ 92, arg3.field1981);
            OpenGL.glVertexPointer(arg3.field1982, arg3.field1983, this.field8986.method2516(-18831), this.field8986.method2515((byte) -112) - -((long) arg3.field1979));
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        if (arg0 != null) {
            this.method3493(107, arg0.field1981);
            OpenGL.glNormalPointer(arg0.field1983, this.field8986.method2516(arg1 + -18831), this.field8986.method2515((byte) -100) - -((long) arg0.field1979));
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg4 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method3493(120, arg4.field1981);
            OpenGL.glColorPointer(arg4.field1982, arg4.field1983, this.field8986.method2516(arg1 ^ -18831), this.field8986.method2515((byte) -84) + (long) arg4.field1979);
            OpenGL.glEnableClientState(32886);
        }
        if (arg2 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method3493(90, arg2.field1981);
            OpenGL.glTexCoordPointer(arg2.field1982, arg2.field1983, this.field8986.method2516(-18831), this.field8986.method2515((byte) -92) - -((long) arg2.field1979));
            OpenGL.glEnableClientState(32888);
        }
        if (arg1 != 0) {
            this.field8992 = null;
        }
    }

    @OriginalMember(owner = "client!pea", name = "z", descriptor = "(I)V")
    private final void method3568(int arg0) {
        ++field8829;
        if (arg0 == 1345026800) {
            if (this.field9028 != 1) {
                this.method3487((byte) -99);
                this.method3569(false, -32);
                this.method3520((byte) -122, false);
                this.method3485((byte) 57, false);
                this.method3505(-783, false);
                this.method3553((byte) 99, (class254) null);
                this.method3530(-2, arg0 + -1345026695);
                this.method3524(1, 14);
                this.field9028 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!pea", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1938(Canvas arg0) {
        ++field8853;
        if (this.field8873 == arg0) {
            throw new RuntimeException();
        } else if (this.field8897.containsKey(arg0)) {
            Long var2 = (Long) this.field8897.get(arg0);
            this.field8864.releaseSurface(arg0, var2);
            this.field8897.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZI)V")
    public final void method3569(boolean arg0, int arg1) {
        if (arg1 != -32) {
            this.field8976 = null;
        }
        if (this.field9040 != arg0) {
            this.field9040 = arg0;
            this.method3509(-124);
            this.field9028 &= -32;
        }
        ++field8851;
    }
}
