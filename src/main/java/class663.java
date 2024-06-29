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

@OriginalClass("client!rda")
public class class663 extends class59 {

    @OriginalMember(owner = "client!rda", name = "Y", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field8766 = new Hashtable();

    @OriginalMember(owner = "client!rda", name = "pe", descriptor = "I")
    public int field8939 = 128;

    @OriginalMember(owner = "client!rda", name = "ue", descriptor = "Lfn;")
    private class140 field8944 = new class140();

    @OriginalMember(owner = "client!rda", name = "ve", descriptor = "Lria;")
    private class288 field8945 = new class288();

    @OriginalMember(owner = "client!rda", name = "we", descriptor = "Lria;")
    public class288 field8946 = new class288();

    @OriginalMember(owner = "client!rda", name = "xe", descriptor = "I")
    public int field8947 = 3;

    @OriginalMember(owner = "client!rda", name = "Be", descriptor = "Z")
    private boolean field8951 = false;

    @OriginalMember(owner = "client!rda", name = "Ce", descriptor = "I")
    public int field8952 = 8;

    @OriginalMember(owner = "client!rda", name = "De", descriptor = "Lro;")
    private class2 field8953 = new class2();

    @OriginalMember(owner = "client!rda", name = "Ee", descriptor = "[Lua;")
    private class666[] field8954 = new class666[4];

    @OriginalMember(owner = "client!rda", name = "He", descriptor = "[Lua;")
    private class666[] field8957 = new class666[4];

    @OriginalMember(owner = "client!rda", name = "Ie", descriptor = "I")
    private int field8958 = -1;

    @OriginalMember(owner = "client!rda", name = "Me", descriptor = "I")
    private int field8962 = -1;

    @OriginalMember(owner = "client!rda", name = "Je", descriptor = "[Lua;")
    private class666[] field8959 = new class666[4];

    @OriginalMember(owner = "client!rda", name = "Ne", descriptor = "I")
    private int field8963 = -1;

    @OriginalMember(owner = "client!rda", name = "Pe", descriptor = "Lro;")
    private class2 field8965;

    @OriginalMember(owner = "client!rda", name = "Se", descriptor = "Lro;")
    private class2 field8968;

    @OriginalMember(owner = "client!rda", name = "Te", descriptor = "Lro;")
    private class2 field8969;

    @OriginalMember(owner = "client!rda", name = "Ue", descriptor = "Lro;")
    private class2 field8970;

    @OriginalMember(owner = "client!rda", name = "Ve", descriptor = "Lro;")
    private class2 field8971;

    @OriginalMember(owner = "client!rda", name = "We", descriptor = "Lro;")
    private class2 field8972;

    @OriginalMember(owner = "client!rda", name = "Xe", descriptor = "Lro;")
    private class2 field8973;

    @OriginalMember(owner = "client!rda", name = "ff", descriptor = "Lria;")
    public class288 field8981;

    @OriginalMember(owner = "client!rda", name = "hf", descriptor = "Lria;")
    public class288 field8983;

    @OriginalMember(owner = "client!rda", name = "jf", descriptor = "Lria;")
    public class288 field8984;

    @OriginalMember(owner = "client!rda", name = "mf", descriptor = "[F")
    public float[] field8987;

    @OriginalMember(owner = "client!rda", name = "pf", descriptor = "I")
    private int field8990;

    @OriginalMember(owner = "client!rda", name = "zf", descriptor = "I")
    private int field9000;

    @OriginalMember(owner = "client!rda", name = "Cf", descriptor = "I")
    public int field9003;

    @OriginalMember(owner = "client!rda", name = "bg", descriptor = "I")
    public int field9028;

    @OriginalMember(owner = "client!rda", name = "Lf", descriptor = "I")
    public int field9012;

    @OriginalMember(owner = "client!rda", name = "Sf", descriptor = "I")
    private int field9019;

    @OriginalMember(owner = "client!rda", name = "Hf", descriptor = "[F")
    private float[] field9008;

    @OriginalMember(owner = "client!rda", name = "uf", descriptor = "F")
    public float field8995;

    @OriginalMember(owner = "client!rda", name = "gg", descriptor = "F")
    public float field9033;

    @OriginalMember(owner = "client!rda", name = "Pf", descriptor = "F")
    public float field9016;

    @OriginalMember(owner = "client!rda", name = "cg", descriptor = "I")
    public int field9029;

    @OriginalMember(owner = "client!rda", name = "rf", descriptor = "F")
    private float field8992;

    @OriginalMember(owner = "client!rda", name = "eg", descriptor = "I")
    public int field9031;

    @OriginalMember(owner = "client!rda", name = "vg", descriptor = "F")
    private float field9048;

    @OriginalMember(owner = "client!rda", name = "og", descriptor = "I")
    private int field9041;

    @OriginalMember(owner = "client!rda", name = "Vf", descriptor = "Z")
    private boolean field9022;

    @OriginalMember(owner = "client!rda", name = "mg", descriptor = "I")
    public int field9039;

    @OriginalMember(owner = "client!rda", name = "Mf", descriptor = "I")
    public int field9013;

    @OriginalMember(owner = "client!rda", name = "Gf", descriptor = "I")
    private int field9007;

    @OriginalMember(owner = "client!rda", name = "nf", descriptor = "[F")
    private float[] field8988;

    @OriginalMember(owner = "client!rda", name = "tg", descriptor = "I")
    public int field9046;

    @OriginalMember(owner = "client!rda", name = "Ng", descriptor = "I")
    private int field9066;

    @OriginalMember(owner = "client!rda", name = "Qg", descriptor = "[Ltn;")
    private class87[] field9069;

    @OriginalMember(owner = "client!rda", name = "of", descriptor = "F")
    public float field8989;

    @OriginalMember(owner = "client!rda", name = "Ug", descriptor = "F")
    private float field9073;

    @OriginalMember(owner = "client!rda", name = "Pg", descriptor = "F")
    public float field9068;

    @OriginalMember(owner = "client!rda", name = "Cg", descriptor = "I")
    private int field9055;

    @OriginalMember(owner = "client!rda", name = "Tg", descriptor = "I")
    private int field9072;

    @OriginalMember(owner = "client!rda", name = "Ef", descriptor = "I")
    public int field9005;

    @OriginalMember(owner = "client!rda", name = "ch", descriptor = "F")
    private float field9081;

    @OriginalMember(owner = "client!rda", name = "dh", descriptor = "I")
    public int field9082;

    @OriginalMember(owner = "client!rda", name = "ng", descriptor = "I")
    private int field9040;

    @OriginalMember(owner = "client!rda", name = "hh", descriptor = "[F")
    private float[] field9086;

    @OriginalMember(owner = "client!rda", name = "pg", descriptor = "F")
    public float field9042;

    @OriginalMember(owner = "client!rda", name = "Xg", descriptor = "Z")
    private boolean field9076;

    @OriginalMember(owner = "client!rda", name = "bh", descriptor = "I")
    private int field9080;

    @OriginalMember(owner = "client!rda", name = "Rg", descriptor = "I")
    public int field9070;

    @OriginalMember(owner = "client!rda", name = "oh", descriptor = "F")
    public float field9093;

    @OriginalMember(owner = "client!rda", name = "yg", descriptor = "F")
    private float field9051;

    @OriginalMember(owner = "client!rda", name = "ph", descriptor = "[F")
    private float[] field9094;

    @OriginalMember(owner = "client!rda", name = "tf", descriptor = "Luf;")
    public class451 field8994;

    @OriginalMember(owner = "client!rda", name = "rh", descriptor = "[I")
    public int[] field9096;

    @OriginalMember(owner = "client!rda", name = "uh", descriptor = "[I")
    public int[] field9099;

    @OriginalMember(owner = "client!rda", name = "sh", descriptor = "[I")
    public int[] field9097;

    @OriginalMember(owner = "client!rda", name = "vh", descriptor = "[B")
    public byte[] field9100;

    @OriginalMember(owner = "client!rda", name = "ce", descriptor = "I")
    public int field8926;

    @OriginalMember(owner = "client!rda", name = "R", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8759;

    @OriginalMember(owner = "client!rda", name = "Cd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8900;

    @OriginalMember(owner = "client!rda", name = "kd", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field8882;

    @OriginalMember(owner = "client!rda", name = "G", descriptor = "J")
    private long field8748;

    @OriginalMember(owner = "client!rda", name = "Cb", descriptor = "J")
    private long field8796;

    @OriginalMember(owner = "client!rda", name = "Uf", descriptor = "Z")
    public boolean field9021;

    @OriginalMember(owner = "client!rda", name = "eh", descriptor = "I")
    public int field9083;

    @OriginalMember(owner = "client!rda", name = "Ig", descriptor = "Ljava/lang/String;")
    private String field9061;

    @OriginalMember(owner = "client!rda", name = "Dg", descriptor = "Z")
    public boolean field9056;

    @OriginalMember(owner = "client!rda", name = "qf", descriptor = "Z")
    private boolean field8991;

    @OriginalMember(owner = "client!rda", name = "Gg", descriptor = "Z")
    public boolean field9059;

    @OriginalMember(owner = "client!rda", name = "lf", descriptor = "Z")
    public boolean field8986;

    @OriginalMember(owner = "client!rda", name = "mh", descriptor = "Z")
    private boolean field9091;

    @OriginalMember(owner = "client!rda", name = "Zf", descriptor = "Z")
    public boolean field9026;

    @OriginalMember(owner = "client!rda", name = "sg", descriptor = "Ljava/lang/String;")
    private String field9045;

    @OriginalMember(owner = "client!rda", name = "kf", descriptor = "Z")
    public boolean field8985;

    @OriginalMember(owner = "client!rda", name = "nh", descriptor = "Z")
    private boolean field9092;

    @OriginalMember(owner = "client!rda", name = "se", descriptor = "Lvl;")
    private class12 field8942;

    @OriginalMember(owner = "client!rda", name = "Ae", descriptor = "Lwv;")
    public class34 field8950;

    @OriginalMember(owner = "client!rda", name = "Ud", descriptor = "Lvaa;")
    private class472 field8918;

    @OriginalMember(owner = "client!rda", name = "be", descriptor = "Lsd;")
    private class95 field8925;

    @OriginalMember(owner = "client!rda", name = "Yd", descriptor = "Lwf;")
    private class137 field8922;

    @OriginalMember(owner = "client!rda", name = "Hc", descriptor = "I")
    public static int field8853 = -1;

    @OriginalMember(owner = "client!rda", name = "sf", descriptor = "F")
    public float field8993;

    @OriginalMember(owner = "client!rda", name = "Df", descriptor = "F")
    private float field9004;

    @OriginalMember(owner = "client!rda", name = "Qf", descriptor = "F")
    public float field9017;

    @OriginalMember(owner = "client!rda", name = "ag", descriptor = "F")
    public float field9027;

    @OriginalMember(owner = "client!rda", name = "wg", descriptor = "F")
    public float field9049;

    @OriginalMember(owner = "client!rda", name = "xg", descriptor = "F")
    private float field9050;

    @OriginalMember(owner = "client!rda", name = "Fg", descriptor = "F")
    private float field9058;

    @OriginalMember(owner = "client!rda", name = "Mg", descriptor = "F")
    public float field9065;

    @OriginalMember(owner = "client!rda", name = "kh", descriptor = "F")
    public float field9089;

    @OriginalMember(owner = "client!rda", name = "u", descriptor = "I")
    public static int field8736;

    @OriginalMember(owner = "client!rda", name = "v", descriptor = "I")
    public static int field8737;

    @OriginalMember(owner = "client!rda", name = "w", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!rda", name = "x", descriptor = "I")
    public static int field8739;

    @OriginalMember(owner = "client!rda", name = "y", descriptor = "I")
    public static int field8740;

    @OriginalMember(owner = "client!rda", name = "z", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!rda", name = "A", descriptor = "I")
    public static int field8742;

    @OriginalMember(owner = "client!rda", name = "B", descriptor = "I")
    public static int field8743;

    @OriginalMember(owner = "client!rda", name = "C", descriptor = "I")
    public static int field8744;

    @OriginalMember(owner = "client!rda", name = "D", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!rda", name = "E", descriptor = "I")
    public int field8746;

    @OriginalMember(owner = "client!rda", name = "F", descriptor = "I")
    public static int field8747;

    @OriginalMember(owner = "client!rda", name = "H", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!rda", name = "I", descriptor = "I")
    private int field8750;

    @OriginalMember(owner = "client!rda", name = "J", descriptor = "I")
    public static int field8751;

    @OriginalMember(owner = "client!rda", name = "K", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!rda", name = "L", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!rda", name = "M", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!rda", name = "N", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!rda", name = "O", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!rda", name = "P", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!rda", name = "Q", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!rda", name = "S", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!rda", name = "T", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!rda", name = "U", descriptor = "I")
    public static int field8762;

    @OriginalMember(owner = "client!rda", name = "V", descriptor = "I")
    public static int field8763;

    @OriginalMember(owner = "client!rda", name = "W", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!rda", name = "X", descriptor = "I")
    public static int field8765;

    @OriginalMember(owner = "client!rda", name = "Z", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!rda", name = "ab", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!rda", name = "bb", descriptor = "I")
    public static int field8769;

    @OriginalMember(owner = "client!rda", name = "cb", descriptor = "I")
    public static int field8770;

    @OriginalMember(owner = "client!rda", name = "db", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!rda", name = "eb", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!rda", name = "fb", descriptor = "I")
    public static int field8773;

    @OriginalMember(owner = "client!rda", name = "gb", descriptor = "I")
    public static int field8774;

    @OriginalMember(owner = "client!rda", name = "hb", descriptor = "I")
    public static int field8775;

    @OriginalMember(owner = "client!rda", name = "ib", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!rda", name = "jb", descriptor = "I")
    public static int field8777;

    @OriginalMember(owner = "client!rda", name = "kb", descriptor = "I")
    public static int field8778;

    @OriginalMember(owner = "client!rda", name = "lb", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!rda", name = "mb", descriptor = "I")
    public static int field8780;

    @OriginalMember(owner = "client!rda", name = "nb", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!rda", name = "ob", descriptor = "I")
    public static int field8782;

    @OriginalMember(owner = "client!rda", name = "pb", descriptor = "I")
    public static int field8783;

    @OriginalMember(owner = "client!rda", name = "qb", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!rda", name = "rb", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!rda", name = "sb", descriptor = "I")
    public static int field8786;

    @OriginalMember(owner = "client!rda", name = "tb", descriptor = "I")
    public static int field8787;

    @OriginalMember(owner = "client!rda", name = "ub", descriptor = "I")
    public static int field8788;

    @OriginalMember(owner = "client!rda", name = "vb", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!rda", name = "wb", descriptor = "I")
    public static int field8790;

    @OriginalMember(owner = "client!rda", name = "xb", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!rda", name = "yb", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!rda", name = "zb", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!rda", name = "Ab", descriptor = "I")
    public static int field8794;

    @OriginalMember(owner = "client!rda", name = "Bb", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!rda", name = "Db", descriptor = "I")
    public static int field8797;

    @OriginalMember(owner = "client!rda", name = "Eb", descriptor = "I")
    public static int field8798;

    @OriginalMember(owner = "client!rda", name = "Fb", descriptor = "I")
    public static int field8799;

    @OriginalMember(owner = "client!rda", name = "Gb", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!rda", name = "Hb", descriptor = "I")
    public static int field8801;

    @OriginalMember(owner = "client!rda", name = "Ib", descriptor = "I")
    public static int field8802;

    @OriginalMember(owner = "client!rda", name = "Jb", descriptor = "I")
    public static int field8803;

    @OriginalMember(owner = "client!rda", name = "Kb", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!rda", name = "Lb", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!rda", name = "Mb", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!rda", name = "Nb", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!rda", name = "Ob", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!rda", name = "Pb", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!rda", name = "Qb", descriptor = "I")
    public static int field8810;

    @OriginalMember(owner = "client!rda", name = "Rb", descriptor = "I")
    public static int field8811;

    @OriginalMember(owner = "client!rda", name = "Sb", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!rda", name = "Tb", descriptor = "I")
    public static int field8813;

    @OriginalMember(owner = "client!rda", name = "Ub", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!rda", name = "Vb", descriptor = "I")
    public static int field8815;

    @OriginalMember(owner = "client!rda", name = "Wb", descriptor = "I")
    public static int field8816;

    @OriginalMember(owner = "client!rda", name = "Xb", descriptor = "I")
    public static int field8817;

    @OriginalMember(owner = "client!rda", name = "Yb", descriptor = "I")
    public static int field8818;

    @OriginalMember(owner = "client!rda", name = "Zb", descriptor = "I")
    public static int field8819;

    @OriginalMember(owner = "client!rda", name = "ac", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!rda", name = "bc", descriptor = "I")
    public static int field8821;

    @OriginalMember(owner = "client!rda", name = "cc", descriptor = "I")
    public static int field8822;

    @OriginalMember(owner = "client!rda", name = "dc", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!rda", name = "ec", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!rda", name = "fc", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!rda", name = "gc", descriptor = "I")
    public static int field8826;

    @OriginalMember(owner = "client!rda", name = "hc", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!rda", name = "ic", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!rda", name = "jc", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!rda", name = "kc", descriptor = "I")
    public static int field8830;

    @OriginalMember(owner = "client!rda", name = "lc", descriptor = "I")
    public static int field8831;

    @OriginalMember(owner = "client!rda", name = "mc", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!rda", name = "nc", descriptor = "I")
    public static int field8833;

    @OriginalMember(owner = "client!rda", name = "oc", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!rda", name = "pc", descriptor = "I")
    public static int field8835;

    @OriginalMember(owner = "client!rda", name = "qc", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!rda", name = "rc", descriptor = "I")
    public static int field8837;

    @OriginalMember(owner = "client!rda", name = "sc", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!rda", name = "tc", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!rda", name = "uc", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!rda", name = "vc", descriptor = "I")
    public static int field8841;

    @OriginalMember(owner = "client!rda", name = "wc", descriptor = "I")
    private int field8842;

    @OriginalMember(owner = "client!rda", name = "xc", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!rda", name = "yc", descriptor = "I")
    public static int field8844;

    @OriginalMember(owner = "client!rda", name = "zc", descriptor = "I")
    public int field8845;

    @OriginalMember(owner = "client!rda", name = "Ac", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!rda", name = "Bc", descriptor = "I")
    public static int field8847;

    @OriginalMember(owner = "client!rda", name = "Cc", descriptor = "I")
    public static int field8848;

    @OriginalMember(owner = "client!rda", name = "Dc", descriptor = "I")
    public static int field8849;

    @OriginalMember(owner = "client!rda", name = "Ec", descriptor = "I")
    public static int field8850;

    @OriginalMember(owner = "client!rda", name = "Fc", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!rda", name = "Gc", descriptor = "I")
    public static int field8852;

    @OriginalMember(owner = "client!rda", name = "Ic", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!rda", name = "Jc", descriptor = "I")
    public static int field8855;

    @OriginalMember(owner = "client!rda", name = "Kc", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!rda", name = "Lc", descriptor = "I")
    public static int field8857;

    @OriginalMember(owner = "client!rda", name = "Mc", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!rda", name = "Nc", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!rda", name = "Oc", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!rda", name = "Pc", descriptor = "I")
    public static int field8861;

    @OriginalMember(owner = "client!rda", name = "Qc", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!rda", name = "Rc", descriptor = "I")
    public static int field8863;

    @OriginalMember(owner = "client!rda", name = "Sc", descriptor = "I")
    public static int field8864;

    @OriginalMember(owner = "client!rda", name = "Tc", descriptor = "I")
    public static int field8865;

    @OriginalMember(owner = "client!rda", name = "Uc", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!rda", name = "Vc", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!rda", name = "Wc", descriptor = "I")
    public static int field8868;

    @OriginalMember(owner = "client!rda", name = "Xc", descriptor = "I")
    public static int field8869;

    @OriginalMember(owner = "client!rda", name = "Yc", descriptor = "I")
    public static int field8870;

    @OriginalMember(owner = "client!rda", name = "Zc", descriptor = "I")
    public static int field8871;

    @OriginalMember(owner = "client!rda", name = "ad", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!rda", name = "bd", descriptor = "I")
    public static int field8873;

    @OriginalMember(owner = "client!rda", name = "cd", descriptor = "I")
    public static int field8874;

    @OriginalMember(owner = "client!rda", name = "dd", descriptor = "I")
    public static int field8875;

    @OriginalMember(owner = "client!rda", name = "ed", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!rda", name = "fd", descriptor = "I")
    public static int field8877;

    @OriginalMember(owner = "client!rda", name = "gd", descriptor = "I")
    public static int field8878;

    @OriginalMember(owner = "client!rda", name = "hd", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!rda", name = "id", descriptor = "I")
    public static int field8880;

    @OriginalMember(owner = "client!rda", name = "jd", descriptor = "I")
    public static int field8881;

    @OriginalMember(owner = "client!rda", name = "ld", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!rda", name = "md", descriptor = "I")
    public static int field8884;

    @OriginalMember(owner = "client!rda", name = "nd", descriptor = "I")
    public static int field8885;

    @OriginalMember(owner = "client!rda", name = "od", descriptor = "I")
    public static int field8886;

    @OriginalMember(owner = "client!rda", name = "pd", descriptor = "I")
    public static int field8887;

    @OriginalMember(owner = "client!rda", name = "qd", descriptor = "I")
    public static int field8888;

    @OriginalMember(owner = "client!rda", name = "rd", descriptor = "I")
    public static int field8889;

    @OriginalMember(owner = "client!rda", name = "sd", descriptor = "I")
    public static int field8890;

    @OriginalMember(owner = "client!rda", name = "td", descriptor = "I")
    public static int field8891;

    @OriginalMember(owner = "client!rda", name = "ud", descriptor = "I")
    public static int field8892;

    @OriginalMember(owner = "client!rda", name = "vd", descriptor = "I")
    public static int field8893;

    @OriginalMember(owner = "client!rda", name = "wd", descriptor = "I")
    public static int field8894;

    @OriginalMember(owner = "client!rda", name = "xd", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!rda", name = "yd", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!rda", name = "zd", descriptor = "I")
    public static int field8897;

    @OriginalMember(owner = "client!rda", name = "Ad", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!rda", name = "Bd", descriptor = "I")
    public static int field8899;

    @OriginalMember(owner = "client!rda", name = "Dd", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!rda", name = "Ed", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!rda", name = "Fd", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!rda", name = "Gd", descriptor = "I")
    public static int field8904;

    @OriginalMember(owner = "client!rda", name = "Hd", descriptor = "I")
    public static int field8905;

    @OriginalMember(owner = "client!rda", name = "Id", descriptor = "I")
    public static int field8906;

    @OriginalMember(owner = "client!rda", name = "Jd", descriptor = "I")
    public static int field8907;

    @OriginalMember(owner = "client!rda", name = "Kd", descriptor = "I")
    public static int field8908;

    @OriginalMember(owner = "client!rda", name = "Ld", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!rda", name = "Md", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!rda", name = "Nd", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!rda", name = "Od", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!rda", name = "Pd", descriptor = "I")
    public static int field8913;

    @OriginalMember(owner = "client!rda", name = "Qd", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!rda", name = "Rd", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!rda", name = "Sd", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!rda", name = "Td", descriptor = "I")
    public static int field8917;

    @OriginalMember(owner = "client!rda", name = "Vd", descriptor = "I")
    public static int field8919;

    @OriginalMember(owner = "client!rda", name = "Wd", descriptor = "I")
    public static int field8920;

    @OriginalMember(owner = "client!rda", name = "Xd", descriptor = "I")
    public static int field8921;

    @OriginalMember(owner = "client!rda", name = "Zd", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!rda", name = "ae", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!rda", name = "de", descriptor = "I")
    public static int field8927;

    @OriginalMember(owner = "client!rda", name = "ee", descriptor = "I")
    public static int field8928;

    @OriginalMember(owner = "client!rda", name = "fe", descriptor = "I")
    public static int field8929;

    @OriginalMember(owner = "client!rda", name = "ge", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!rda", name = "he", descriptor = "I")
    public static int field8931;

    @OriginalMember(owner = "client!rda", name = "ie", descriptor = "I")
    public static int field8932;

    @OriginalMember(owner = "client!rda", name = "je", descriptor = "I")
    public static int field8933;

    @OriginalMember(owner = "client!rda", name = "ke", descriptor = "I")
    public static int field8934;

    @OriginalMember(owner = "client!rda", name = "le", descriptor = "I")
    public static int field8935;

    @OriginalMember(owner = "client!rda", name = "me", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!rda", name = "ne", descriptor = "I")
    public static int field8937;

    @OriginalMember(owner = "client!rda", name = "oe", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!rda", name = "qe", descriptor = "I")
    public static int field8940;

    @OriginalMember(owner = "client!rda", name = "re", descriptor = "I")
    public static int field8941;

    @OriginalMember(owner = "client!rda", name = "te", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!rda", name = "ze", descriptor = "I")
    public int field8949;

    @OriginalMember(owner = "client!rda", name = "Oe", descriptor = "I")
    public int field8964;

    @OriginalMember(owner = "client!rda", name = "Qe", descriptor = "I")
    private int field8966;

    @OriginalMember(owner = "client!rda", name = "Re", descriptor = "I")
    public int field8967;

    @OriginalMember(owner = "client!rda", name = "Ye", descriptor = "I")
    private int field8974;

    @OriginalMember(owner = "client!rda", name = "Ze", descriptor = "I")
    private int field8975;

    @OriginalMember(owner = "client!rda", name = "af", descriptor = "I")
    private int field8976;

    @OriginalMember(owner = "client!rda", name = "vf", descriptor = "I")
    private int field8996;

    @OriginalMember(owner = "client!rda", name = "yf", descriptor = "I")
    private int field8999;

    @OriginalMember(owner = "client!rda", name = "If", descriptor = "I")
    private int field9009;

    @OriginalMember(owner = "client!rda", name = "Kf", descriptor = "I")
    public int field9011;

    @OriginalMember(owner = "client!rda", name = "Of", descriptor = "I")
    private int field9015;

    @OriginalMember(owner = "client!rda", name = "dg", descriptor = "I")
    private int field9030;

    @OriginalMember(owner = "client!rda", name = "kg", descriptor = "I")
    public int field9037;

    @OriginalMember(owner = "client!rda", name = "zg", descriptor = "I")
    private int field9052;

    @OriginalMember(owner = "client!rda", name = "Sg", descriptor = "I")
    public int field9071;

    @OriginalMember(owner = "client!rda", name = "Yg", descriptor = "I")
    private int field9077;

    @OriginalMember(owner = "client!rda", name = "fh", descriptor = "I")
    public int field9084;

    @OriginalMember(owner = "client!rda", name = "lh", descriptor = "I")
    private int field9090;

    @OriginalMember(owner = "client!rda", name = "th", descriptor = "I")
    private int field9098;

    @OriginalMember(owner = "client!rda", name = "wh", descriptor = "I")
    private int field9101;

    @OriginalMember(owner = "client!rda", name = "cf", descriptor = "J")
    private long field8978;

    @OriginalMember(owner = "client!rda", name = "jg", descriptor = "Las;")
    private class154 field9036;

    @OriginalMember(owner = "client!rda", name = "Jf", descriptor = "Lcs;")
    private class345 field9010;

    @OriginalMember(owner = "client!rda", name = "Wg", descriptor = "Lcs;")
    private class345 field9075;

    @OriginalMember(owner = "client!rda", name = "ig", descriptor = "Lqd;")
    private class452 field9035;

    @OriginalMember(owner = "client!rda", name = "ug", descriptor = "Lim;")
    public class572 field9047;

    @OriginalMember(owner = "client!rda", name = "Og", descriptor = "Lim;")
    public class572 field9067;

    @OriginalMember(owner = "client!rda", name = "Fe", descriptor = "Lua;")
    private class666 field8955;

    @OriginalMember(owner = "client!rda", name = "Ge", descriptor = "Lua;")
    private class666 field8956;

    @OriginalMember(owner = "client!rda", name = "Ke", descriptor = "Lip;")
    private class708 field8960;

    @OriginalMember(owner = "client!rda", name = "Hg", descriptor = "Lega;")
    private class712 field9060;

    @OriginalMember(owner = "client!rda", name = "xf", descriptor = "Lnk;")
    public class718 field8998;

    @OriginalMember(owner = "client!rda", name = "Nf", descriptor = "Lnk;")
    public class718 field9014;

    @OriginalMember(owner = "client!rda", name = "Wf", descriptor = "Lnk;")
    public class718 field9023;

    @OriginalMember(owner = "client!rda", name = "Yf", descriptor = "Lnk;")
    public class718 field9025;

    @OriginalMember(owner = "client!rda", name = "hg", descriptor = "Lnk;")
    public class718 field9034;

    @OriginalMember(owner = "client!rda", name = "qg", descriptor = "Lnk;")
    public class718 field9043;

    @OriginalMember(owner = "client!rda", name = "Ag", descriptor = "Lnk;")
    public class718 field9053;

    @OriginalMember(owner = "client!rda", name = "Bg", descriptor = "Lnk;")
    public class718 field9054;

    @OriginalMember(owner = "client!rda", name = "Eg", descriptor = "Lnk;")
    public class718 field9057;

    @OriginalMember(owner = "client!rda", name = "qh", descriptor = "Lnk;")
    public class718 field9095;

    @OriginalMember(owner = "client!rda", name = "lg", descriptor = "Lsia;")
    public class737 field9038;

    @OriginalMember(owner = "client!rda", name = "Le", descriptor = "Lnh;")
    private class749 field8961;

    @OriginalMember(owner = "client!rda", name = "rg", descriptor = "Lnh;")
    public class749 field9044;

    @OriginalMember(owner = "client!rda", name = "ye", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field8948;

    @OriginalMember(owner = "client!rda", name = "bf", descriptor = "Z")
    private boolean field8977;

    @OriginalMember(owner = "client!rda", name = "df", descriptor = "Z")
    private boolean field8979;

    @OriginalMember(owner = "client!rda", name = "ef", descriptor = "Z")
    private boolean field8980;

    @OriginalMember(owner = "client!rda", name = "gf", descriptor = "Z")
    private boolean field8982;

    @OriginalMember(owner = "client!rda", name = "Af", descriptor = "Z")
    public boolean field9001;

    @OriginalMember(owner = "client!rda", name = "Bf", descriptor = "Z")
    private boolean field9002;

    @OriginalMember(owner = "client!rda", name = "Ff", descriptor = "Z")
    private boolean field9006;

    @OriginalMember(owner = "client!rda", name = "Rf", descriptor = "Z")
    public boolean field9018;

    @OriginalMember(owner = "client!rda", name = "Tf", descriptor = "Z")
    public boolean field9020;

    @OriginalMember(owner = "client!rda", name = "Xf", descriptor = "Z")
    private boolean field9024;

    @OriginalMember(owner = "client!rda", name = "fg", descriptor = "Z")
    public boolean field9032;

    @OriginalMember(owner = "client!rda", name = "Jg", descriptor = "Z")
    public boolean field9062;

    @OriginalMember(owner = "client!rda", name = "Kg", descriptor = "Z")
    public boolean field9063;

    @OriginalMember(owner = "client!rda", name = "Lg", descriptor = "Z")
    public boolean field9064;

    @OriginalMember(owner = "client!rda", name = "Vg", descriptor = "Z")
    private boolean field9074;

    @OriginalMember(owner = "client!rda", name = "Zg", descriptor = "Z")
    private boolean field9078;

    @OriginalMember(owner = "client!rda", name = "ah", descriptor = "Z")
    public boolean field9079;

    @OriginalMember(owner = "client!rda", name = "gh", descriptor = "Z")
    public boolean field9085;

    @OriginalMember(owner = "client!rda", name = "ih", descriptor = "Z")
    private boolean field9087;

    @OriginalMember(owner = "client!rda", name = "jh", descriptor = "Z")
    private boolean field9088;

    @OriginalMember(owner = "client!rda", name = "wf", descriptor = "[Liga;")
    private class460[] field8997;

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 3)
    public final void method507(Canvas arg0) {
        ++field8885;
        if (this.field8759 == arg0) {
            throw new RuntimeException();
        } else if (this.field8766.containsKey(arg0)) {
            Long var2 = (Long) this.field8766.get(arg0);
            this.field8882.releaseSurface(arg0, var2);
            this.field8766.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!rda", name = "JA", descriptor = "(IIIIII)I", line = 22)
    public final int method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8809;
        int var7 = 0;
        float var8 = (float) arg2 * this.field8981.field4101 + (float) arg0 * this.field8981.field4083 + (float) arg1 * this.field8981.field4099 + this.field8981.field4105;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field8981.field4101 + (float) arg3 * this.field8981.field4083 + (float) arg4 * this.field8981.field4099 + this.field8981.field4105;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field9046 > var8 && var9 < (float) this.field9046) {
            var7 |= 16;
        } else if (var8 > (float) this.field9007 && var9 > (float) this.field9007) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field8981.field4093 + (float) arg0 * this.field8981.field4102 + (float) arg1 * this.field8981.field4092 + this.field8981.field4088) * (float) this.field9013 / var8);
        int var11 = (int) (((float) arg5 * this.field8981.field4093 + (float) arg3 * this.field8981.field4102 + (float) arg4 * this.field8981.field4092 + this.field8981.field4088) * (float) this.field9013 / var9);
        if (this.field9065 > (float) var10 && this.field9065 > (float) var11) {
            var7 |= 1;
        } else if ((float) var10 > this.field8993 && (float) var11 > this.field8993) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field8981.field4094 + (float) arg0 * this.field8981.field4069 + (float) arg1 * this.field8981.field4080 + this.field8981.field4078) * (float) this.field9012 / var8);
        int var13 = (int) (((float) arg5 * this.field8981.field4094 + (float) arg3 * this.field8981.field4069 + (float) arg4 * this.field8981.field4080 + this.field8981.field4078) * (float) this.field9012 / var9);
        if ((float) var12 < this.field9089 && (float) var13 < this.field9089) {
            var7 |= 4;
        } else if ((float) var12 > this.field9049 && (float) var13 > this.field9049) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(I)V", line = 77)
    private final void method3589(int arg0) {
        this.field9089 = (float) (-this.field9082 + this.field9066);
        this.field9065 = (float) (this.field8990 - this.field9039);
        ++field8819;
        this.field8993 = (float) (-this.field9039 + this.field9055);
        int var2 = -75 / ((-73 - arg0) / 35);
        this.field9049 = (float) (-this.field9082 + this.field9080);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "()Z", line = 90)
    public final boolean method390() {
        ++field8789;
        return this.field8925 != null && (this.field8926 <= 1 || this.field9074);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ltea;)V", line = 99)
    public final void method440(class241 arg0) {
        this.field9060 = (class712) arg0;
        ++field8832;
    }

    @OriginalMember(owner = "client!rda", name = "F", descriptor = "(II)V", line = 107)
    public final void method406(int arg0, int arg1) {
        ++field8760;
    }

    @OriginalMember(owner = "client!rda", name = "ra", descriptor = "(IIII)V", line = 114)
    public final void method490(int arg0, int arg1, int arg2, int arg3) {
        this.field9063 = true;
        this.field9029 = arg3;
        this.field9005 = arg1;
        this.field9003 = arg2;
        ++field8927;
        this.field9071 = arg0;
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(Z)V", line = 129)
    public final void method3590(boolean arg0) {
        if (!arg0) {
            this.field8842 = 84;
        }
        ++field8892;
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(III)V", line = 141)
    public final synchronized void method3591(int arg0, int arg1, int arg2) {
        ++field8854;
        class651 var4 = new class651(arg1);
        if (arg0 != -24474) {
            this.method417(115, -108);
        }
        var4.field8680 = (long) arg2;
        this.field8971.method11(var4, -105);
    }

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "(I)V", line = 156)
    public final synchronized void method501(int arg0) {
        ++field8930;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field8968.method17(false)) {
            class651 var12 = (class651) this.field8968.method10(false);
            class565.field7441[var2++] = (int) var12.field8680;
            this.field8964 -= var12.field8636;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class565.field7441, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteBuffersARB(var2, class565.field7441, 0);
            var2 = 0;
        }
        while (!this.field8969.method17(false)) {
            class651 var11 = (class651) this.field8969.method10(false);
            class565.field7441[var2++] = (int) var11.field8680;
            this.field8967 -= var11.field8636;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class565.field7441, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class565.field7441, 0);
            var2 = 0;
        }
        while (!this.field8970.method17(false)) {
            class651 var10 = (class651) this.field8970.method10(false);
            class565.field7441[var2++] = var10.field8636;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class565.field7441, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class565.field7441, 0);
            var2 = 0;
        }
        while (!this.field8971.method17(false)) {
            class651 var9 = (class651) this.field8971.method10(false);
            class565.field7441[var2++] = (int) var9.field8680;
            this.field8966 -= var9.field8636;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class565.field7441, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class565.field7441, 0);
            boolean var4 = false;
        }
        while (!this.field8965.method17(false)) {
            class651 var8 = (class651) this.field8965.method10(false);
            OpenGL.glDeleteLists((int) var8.field8680, var8.field8636);
        }
        while (!this.field8972.method17(false)) {
            class656 var7 = this.field8972.method10(false);
            OpenGL.glDeleteProgramARB((int) var7.field8680);
        }
        while (!this.field8973.method17(false)) {
            class656 var6 = this.field8973.method10(false);
            OpenGL.glDeleteObjectARB(var6.field8680);
        }
        while (!this.field8965.method17(false)) {
            class651 var5 = (class651) this.field8965.method10(false);
            OpenGL.glDeleteLists((int) var5.field8680, var5.field8636);
        }
        this.field8942.method107(-128);
        if (~this.method488() < -100663297 && ~(this.field8978 + 60000L) > ~class375.method2193(116)) {
            System.gc();
            this.field8978 = class375.method2193(116);
        }
        this.field8949 = var3;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILcs;)V", line = 324)
    public final void method3592(int arg0, class345 arg1) {
        if (arg0 == -4593) {
            if (this.field9010 != arg1) {
                if (this.field8991) {
                    OpenGL.glBindBufferARB(34962, arg1.method2064((byte) -31));
                }
                this.field9010 = arg1;
            }
            ++field8745;
        }
    }

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "(I)V", line = 343)
    public final void method441(int arg0) {
        ++field8859;
        this.method3665(1136122328);
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(IIIIII)V", line = 352)
    public final void method455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8910;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method3622(1);
        this.method3635(0, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field9088) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field9088) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!rda", name = "H", descriptor = "(III[I)V", line = 387)
    public final void method494(int arg0, int arg1, int arg2, int[] arg3) {
        ++field8850;
        float var5 = (float) arg2 * this.field8981.field4101 + (float) arg0 * this.field8981.field4083 + (float) arg1 * this.field8981.field4099 + this.field8981.field4105;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field8981.field4093 + (float) arg0 * this.field8981.field4102 + (float) arg1 * this.field8981.field4092 + this.field8981.field4088) * (float) this.field9013 / var5);
            arg3[0] = (int) ((float) var6 - this.field9065);
            int var7 = (int) (((float) arg2 * this.field8981.field4094 + (float) arg0 * this.field8981.field4069 + (float) arg1 * this.field8981.field4080 + this.field8981.field4078) * (float) this.field9012 / var5);
            arg3[1] = (int) ((float) var7 - this.field9089);
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Luj;I)V", line = 409)
    public final void method407(class388 arg0, int arg1) {
        this.field8944.method1077(arg0, true, this, arg1);
        ++field8768;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILim;Lim;Lim;Lim;)V", line = 417)
    public final void method3593(int arg0, class572 arg1, class572 arg2, class572 arg3, class572 arg4) {
        if (arg2 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method3592(arg0 ^ -37255, arg2.field7506);
            OpenGL.glVertexPointer(arg2.field7512, arg2.field7510, this.field9010.method2065(26249), this.field9010.method2066(9889) + (long) arg2.field7508);
            OpenGL.glEnableClientState(32884);
        }
        ++field8773;
        if (arg3 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method3592(-4593, arg3.field7506);
            OpenGL.glNormalPointer(arg3.field7510, this.field9010.method2065(26249), this.field9010.method2066(9889) + (long) arg3.field7508);
            OpenGL.glEnableClientState(32885);
        }
        if (arg0 != 32886) {
            this.method414();
        }
        if (arg4 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method3592(arg0 + -37479, arg4.field7506);
            OpenGL.glColorPointer(arg4.field7512, arg4.field7510, this.field9010.method2065(26249), this.field9010.method2066(9889) - -((long) arg4.field7508));
            OpenGL.glEnableClientState(32886);
        }
        if (arg1 != null) {
            this.method3592(-4593, arg1.field7506);
            OpenGL.glTexCoordPointer(arg1.field7512, arg1.field7510, this.field9010.method2065(arg0 ^ 59135), this.field9010.method2066(arg0 ^ 42711) - -((long) arg1.field7508));
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "(I)V", line = 467)
    public final void method3594(int arg0) {
        if (arg0 != 17776) {
            this.field9051 = -0.7511074F;
        }
        if (~this.field8976 != -5) {
            this.method3602(0);
            this.method3649(2286, false);
            this.method3628(false, arg0 ^ -17690);
            this.method3663(false, 0);
            this.method3620(35, false);
            this.method3632(-2, (byte) 126);
            this.method3635(0, 1);
            this.field8976 = 4;
        }
        ++field8921;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lria;I)V", line = 492)
    public final void method3595(class288 arg0, int arg1) {
        if (arg1 != 28727) {
            this.method473(-63, 83, 63, -123);
        }
        ++field8929;
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg0.method1786((byte) -119), 0);
    }

    @OriginalMember(owner = "client!rda", name = "q", descriptor = "()Z", line = 504)
    public final boolean method459() {
        ++field8810;
        return this.field8925 != null && this.field8925.method1133(818);
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(II)Lmj;", line = 514)
    public final class655 method417(int arg0, int arg1) {
        ++field8908;
        return null;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(JZ)V", line = 523)
    public final synchronized void method3596(long arg0, boolean arg1) {
        if (arg1) {
            ++field8906;
            class656 var4 = new class656();
            var4.field8680 = arg0;
            this.field8973.method11(var4, -90);
        }
    }

    @OriginalMember(owner = "client!rda", name = "s", descriptor = "()Z", line = 537)
    public final boolean method468() {
        ++field8805;
        return true;
    }

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "(II)V", line = 549)
    public final void method465(int arg0, int arg1) throws class149 {
        try {
            this.field8882.swapBuffers();
        } catch (Exception var3) {
        }
        ++field8797;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IB)V", line = 569)
    public final synchronized void method3597(int arg0, byte arg1) {
        ++field8769;
        class656 var3 = new class656();
        var3.field8680 = (long) arg0;
        this.field8972.method11(var3, -103);
        if (arg1 != -51) {
            this.method3648(-94, -5);
        }
    }

    @OriginalMember(owner = "client!rda", name = "aa", descriptor = "(IIIIII)V", line = 588)
    public final void method504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8737;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method3622(1);
        this.method3635(0, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field9088) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field9088) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lria;B)V", line = 624)
    public final void method3598(class288 arg0, byte arg1) {
        ++field8848;
        if (arg1 != 70) {
            this.method480(29, -98, 105, 89, 48);
        }
        OpenGL.glLoadMatrixf(arg0.method1786((byte) -110), 0);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIII)V", line = 636)
    public final void method482(int arg0, int arg1, int arg2, int arg3) {
        this.field8918.method2656(arg3, arg0, arg1, 26185, arg2);
        ++field8804;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIBI)V", line = 649)
    public final void method3599(int arg0, int arg1, byte arg2, int arg3) {
        ++field8778;
        OpenGL.glTexEnvi(8960, 34184 - -arg0, arg3);
        OpenGL.glTexEnvi(8960, arg0 + 34200, arg1);
        if (arg2 != 37) {
            this.field8968 = null;
        }
    }

    @OriginalMember(owner = "client!rda", name = "n", descriptor = "()Z", line = 663)
    public final boolean method449() {
        ++field8857;
        return this.field8922.method1063(3, 12686);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIIII)V", line = 671)
    public final void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field8794;
        this.method412(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BII)V", line = 683)
    public final void method3600(byte arg0, int arg1, int arg2) {
        ++field8874;
        if (arg0 != -32) {
            this.field9078 = false;
        }
        this.field9019 = arg1;
        this.field9041 = arg2;
        this.method3650((byte) 14);
        this.method3638((byte) -122);
    }

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "(II)V", line = 697)
    public final void method491(int arg0, int arg1) {
        ++field8837;
        if (this.field9046 != arg0 || ~this.field9007 != ~arg1) {
            this.field9046 = arg0;
            this.field9007 = arg1;
            this.method3645(true);
            this.method3609(98);
            if (~this.field9052 != -4) {
                if (this.field9052 == 2) {
                    this.method3664((byte) 118);
                    return;
                }
            } else {
                this.method3629(5889);
            }
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(FIF)V", line = 723)
    public final void method3601(float arg0, int arg1, float arg2) {
        ++field8793;
        this.field9081 = arg0;
        this.field9051 = arg2;
        this.method3609(arg1 ^ -1026034321);
        if (arg1 != -1026034392) {
            this.field9081 = 0.8359454F;
        }
    }

    @OriginalMember(owner = "client!rda", name = "l", descriptor = "(I)V", line = 737)
    private final void method3602(int arg0) {
        if (this.field9052 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field8845 < -1 && ~this.field8746 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field8845, (double) this.field8746, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field9052 = 1;
            this.field8976 &= -25;
        }
        if (arg0 != 0) {
            this.field9089 = -0.7177214F;
        }
        ++field8876;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "([I)V", line = 761)
    public final void method510(int[] arg0) {
        arg0[0] = this.field8845;
        ++field8758;
        arg0[1] = this.field8746;
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(B)V", line = 770)
    private final void method3603(byte arg0) {
        ++field8783;
        this.field8997 = new class460[this.field9037];
        this.field9038 = new class737(this, 3553, 6408, 1, 1);
        new class737(this, 3553, 6408, 1, 1);
        new class737(this, 3553, 6408, 1, 1);
        this.field9025 = new class718(this);
        this.field9053 = new class718(this);
        this.field9043 = new class718(this);
        this.field9014 = new class718(this);
        this.field9054 = new class718(this);
        this.field8998 = new class718(this);
        this.field9034 = new class718(this);
        this.field9095 = new class718(this);
        this.field9057 = new class718(this);
        this.field9023 = new class718(this);
        if (this.field8985) {
            this.field9044 = new class749(this);
            new class749(this);
        }
        int var2 = -91 % ((30 - arg0) / 55);
    }

    @OriginalMember(owner = "client!rda", name = "m", descriptor = "(I)V", line = 805)
    public final void method3604(int arg0) {
        if (arg0 > -79) {
            this.field9060 = null;
        }
        ++field8873;
        if (this.field8976 != 16) {
            this.method3640(-106);
            this.method3649(2286, true);
            this.method3663(true, 0);
            this.method3620(41, true);
            this.method3635(0, 1);
            this.field8976 = 16;
        }
    }

    @OriginalMember(owner = "client!rda", name = "l", descriptor = "()Z", line = 827)
    public final boolean method442() {
        ++field8943;
        return true;
    }

    @OriginalMember(owner = "client!rda", name = "n", descriptor = "(I)V", line = 838)
    public final void method3605(int arg0) {
        OpenGL.glLightfv(16384, 4611, this.field8987, arg0);
        ++field8754;
        OpenGL.glLightfv(16385, 4611, this.field9094, 0);
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(Z)V", line = 847)
    private final void method3606(boolean arg0) {
        if (!arg0) {
            if (this.field9024) {
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5888);
                this.field9024 = false;
            }
            ++field8902;
        }
    }

    @OriginalMember(owner = "client!rda", name = "Q", descriptor = "(IIIIII[BII)V", line = 868)
    public final void method430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field8790;
        float var10;
        float var11;
        if (this.field9035 != null && ~this.field9035.field10195 <= ~arg2 && ~arg3 >= ~this.field9035.field10191) {
            this.field9035.method4118(arg6, 6406, 0, 0, 0, 0, false, arg3, -88, arg2);
            var10 = (float) arg3 * this.field9035.field6181 / (float) this.field9035.field10191;
            var11 = (float) arg2 * this.field9035.field6183 / (float) this.field9035.field10195;
        } else {
            this.field9035 = class519.method2882(false, arg6, this, 6406, 6406, arg3, arg2, -102);
            this.field9035.method4116((byte) -60, false, false);
            var11 = this.field9035.field6183;
            var10 = this.field9035.field6181;
        }
        this.method3614(105);
        this.method3639(-2, this.field9035);
        this.method3635(0, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method3651(-82, arg5);
        this.method3608(9, 34165, 34165);
        this.method3661(768, 34166, 0, (byte) 4);
        this.method3661(770, 5890, 2, (byte) 4);
        this.method3599(0, 770, (byte) 37, 34166);
        this.method3599(2, 770, (byte) 37, 5890);
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
        this.method3661(768, 5890, 0, (byte) 4);
        this.method3661(770, 34166, 2, (byte) 4);
        this.method3599(0, 770, (byte) 37, 5890);
        this.method3599(2, 770, (byte) 37, 34166);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lur;IIII)Lka;", line = 926)
    public final class475 method401(class538 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8872;
        return new class718(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(B)V", line = 934)
    private final void method3607(byte arg0) {
        if (this.field9087 && ~this.field9070 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field8788;
        if (arg0 <= 15) {
            this.method3619((byte) -16, 87, true, -97, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(III)V", line = 949)
    public final void method3608(int arg0, int arg1, int arg2) {
        int var4 = 36 / ((arg0 - 70) / 48);
        ++field8795;
        if (~this.field9090 == -1) {
            boolean var5 = false;
            if (~this.field9072 != ~arg2) {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                var5 = true;
                this.field9072 = arg2;
            }
            if (~this.field9040 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                this.field9040 = arg1;
                var5 = true;
            }
            if (var5) {
                this.field8976 &= -30;
                return;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg2);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        }
    }

    @OriginalMember(owner = "client!rda", name = "na", descriptor = "(IIII)[I", line = 992)
    public final int[] method473(int arg0, int arg1, int arg2, int arg3) {
        ++field8787;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, this.field8746 - arg1 + -var6, arg2, 1, 32993, this.field9083, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!rda", name = "o", descriptor = "(I)V", line = 1013)
    private final void method3609(int arg0) {
        ++field8836;
        this.field9050 = (float) (-this.field9031 + this.field9007) - this.field9051;
        this.field9017 = -((float) this.field9070 * this.field9081) + this.field9050;
        if (arg0 < 46) {
            this.method396();
        }
        if (this.field9017 < (float) this.field9046) {
            this.field9017 = (float) this.field9046;
        }
        OpenGL.glFogf(2915, this.field9017);
        OpenGL.glFogf(2916, this.field9050);
        class8.field156[1] = (float) class48.method346(65280, this.field9028) / 65280.0F;
        class8.field156[0] = (float) class48.method346(16711680, this.field9028) / 1.671168E7F;
        class8.field156[2] = (float) class48.method346(255, this.field9028) / 255.0F;
        OpenGL.glFogfv(2918, class8.field156, 0);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIZ)Lhu;", line = 1034)
    public final class133 method418(int arg0, int arg1, boolean arg2) {
        ++field8924;
        return new class708(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "(I)V", line = 1042)
    public final void method492(int arg0) {
        ++field8813;
    }

    @OriginalMember(owner = "client!rda", name = "w", descriptor = "()V", line = 1049)
    public final void method500() {
        ++field8798;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!rda", name = "la", descriptor = "()V", line = 1057)
    public final void method435() {
        ++field8833;
        this.field8990 = 0;
        this.field9080 = this.field8746;
        this.field9055 = this.field8845;
        this.field9066 = 0;
        OpenGL.glDisable(3089);
        this.method3589(-10);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lua;I)V", line = 1072)
    public final void method3610(class666 arg0, int arg1) {
        ++field8896;
        if (this.field8962 >= 0 && this.field8954[this.field8962] == arg0) {
            this.field8954[this.field8962--] = null;
            arg0.method3674(119);
            int var3 = 37 / ((10 - arg1) / 60);
            if (~this.field8962 > -1) {
                this.field8955 = null;
            } else {
                this.field8955 = this.field8954[this.field8962];
                this.field8955.method3676((byte) -67);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rda", name = "p", descriptor = "(I)V", line = 1094)
    private final void method3611(int arg0) {
        OpenGL.glDepthMask(this.field8982 && this.field9076);
        if (arg0 == 0) {
            ++field8871;
        }
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(B)V", line = 1105)
    private final void method3612(byte arg0) {
        ++field8815;
        if (arg0 != -97) {
            this.method3626(-66, 68, 84, 74);
        }
        if (this.field8900 == null) {
            this.field8842 = this.field8750 = 0;
        } else {
            Dimension var2 = this.field8900.getSize();
            this.field8842 = var2.width;
            this.field8750 = var2.height;
        }
        if (this.field8956 == null) {
            this.field8746 = this.field8750;
            this.field8845 = this.field8842;
            this.method3650((byte) 14);
        }
        this.method3634((byte) -34);
        this.method435();
    }

    @OriginalMember(owner = "client!rda", name = "q", descriptor = "(I)V", line = 1134)
    public final void method3613(int arg0) {
        if (~this.field8976 != -9) {
            this.method3621(arg0 + 3);
            this.method3649(2286, true);
            this.method3663(true, arg0 + 1);
            this.method3620(45, true);
            this.method3635(~arg0, 1);
            this.field8976 = 8;
        }
        ++field8866;
        if (arg0 != -1) {
            this.method436();
        }
    }

    @OriginalMember(owner = "client!rda", name = "I", descriptor = "()I", line = 1156)
    public final int method396() {
        ++field8887;
        int var1 = this.field9101;
        this.field9101 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!rda", name = "r", descriptor = "(I)V", line = 1167)
    public final void method3614(int arg0) {
        if (arg0 < 101) {
            this.field8986 = false;
        }
        ++field8800;
        if (~this.field8976 != -3) {
            this.method3602(0);
            this.method3649(2286, false);
            this.method3628(false, -118);
            this.method3663(false, 0);
            this.method3620(91, false);
            this.method3632(-2, (byte) 108);
            this.field8976 = 2;
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(Lua;I)V", line = 1190)
    public final void method3615(class666 arg0, int arg1) {
        ++field8817;
        if (arg1 != 14908) {
            this.field9024 = true;
        }
        if (this.field8963 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field8963 <= -1) {
                this.field8957[this.field8963].method3673(-19346);
            }
            this.field8956 = this.field8957[++this.field8963] = arg0;
            this.field8956.method3675(true);
        }
    }

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "(I)V", line = 1209)
    public final void method497(int arg0) {
        ++field8824;
        this.method3653(0);
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(III)V", line = 1217)
    public final synchronized void method3616(int arg0, int arg1, int arg2) {
        if (arg1 != -5) {
            this.field8926 = -95;
        }
        ++field8881;
        class651 var4 = new class651(arg2);
        var4.field8680 = (long) arg0;
        this.field8968.method11(var4, -118);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(FZ)V", line = 1231)
    public final void method3617(float arg0, boolean arg1) {
        ++field8856;
        if (this.field8992 != arg0) {
            this.field8992 = arg0;
            if (this.field9052 == 3) {
                this.method3629(5889);
            }
        }
        if (arg1) {
            this.field9021 = false;
        }
    }

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "(Z)V", line = 1251)
    private final void method3618(boolean arg0) {
        ++field8811;
        class8.field156[3] = 1.0F;
        class8.field156[0] = this.field9033 * this.field8989;
        class8.field156[2] = this.field9042 * this.field8989;
        class8.field156[1] = this.field9016 * this.field8989;
        if (arg0) {
            OpenGL.glLightfv(16384, 4609, class8.field156, 0);
            class8.field156[2] = -this.field8995 * this.field9042;
            class8.field156[1] = -this.field8995 * this.field9016;
            class8.field156[0] = -this.field8995 * this.field9033;
            class8.field156[3] = 1.0F;
            OpenGL.glLightfv(16385, 4609, class8.field156, 0);
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BIZI[B)Lcs;", line = 1271)
    public final class345 method3619(byte arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        int var6 = -57 % ((arg0 - 37) / 51);
        ++field8770;
        return (class345) (!this.field8991 || arg2 && !this.field9091 ? new class553(this, arg3, arg4, arg1) : new class374(this, arg3, arg4, arg1, arg2));
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IZ)V", line = 1288)
    public final void method3620(int arg0, boolean arg1) {
        if (arg0 >= 25) {
            if (!this.field8982 != !arg1) {
                this.field8982 = arg1;
                this.method3611(0);
                this.field8976 &= -32;
            }
            ++field8919;
        }
    }

    @OriginalMember(owner = "client!rda", name = "s", descriptor = "(I)V", line = 1305)
    private final void method3621(int arg0) {
        ++field8869;
        if (~this.field9052 != -3) {
            this.field9052 = 2;
            this.method3664((byte) 91);
            this.method3669(0);
            this.field8976 &= -8;
        }
        if (arg0 != 2) {
            this.field9044 = null;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1324)
    public final void method472(Canvas arg0) {
        this.field8796 = 0L;
        ++field8912;
        this.field8900 = null;
        if (arg0 != null && this.field8759 != arg0) {
            if (this.field8766.containsKey(arg0)) {
                Long var2 = (Long) this.field8766.get(arg0);
                this.field8796 = var2;
                this.field8900 = arg0;
            }
        } else {
            this.field8900 = this.field8759;
            this.field8796 = this.field8748;
        }
        if (this.field8900 != null && this.field8796 != 0L) {
            this.field8882.setSurface(this.field8796);
            this.method3612((byte) -97);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rda", name = "XA", descriptor = "()I", line = 1356)
    public final int method402() {
        ++field8841;
        return this.field9007;
    }

    @OriginalMember(owner = "client!rda", name = "t", descriptor = "(I)V", line = 1367)
    private final void method3622(int arg0) {
        ++field8812;
        if (arg0 != 1) {
            this.field8992 = 0.36495084F;
        }
        if (~this.field8976 != -2) {
            this.method3602(0);
            this.method3649(arg0 ^ 2287, false);
            this.method3628(false, -120);
            this.method3663(false, 0);
            this.method3620(86, false);
            this.method3639(-2, (class460) null);
            this.method3632(-2, (byte) 97);
            this.method3631((byte) 113, 1);
            this.field8976 = 1;
        }
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(Lua;I)V", line = 1390)
    public final void method3623(class666 arg0, int arg1) {
        ++field8911;
        if (arg1 != 0) {
            this.method493(false);
        }
        if (!this.field9001) {
            if (this.field8958 >= 3) {
                throw new RuntimeException();
            } else {
                if (~this.field8958 <= -1) {
                    this.field8959[this.field8958].method3677(true);
                }
                this.field8955 = this.field8956 = this.field8959[++this.field8958] = arg0;
                this.field8955.method3672(-1358);
            }
        } else {
            this.method3656(arg0, 120);
            this.method3615(arg0, 14908);
        }
    }

    @OriginalMember(owner = "client!rda", name = "M", descriptor = "()I", line = 1419)
    public final int method448() {
        ++field8801;
        int var1 = this.field9098;
        this.field9098 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "(II)V", line = 1430)
    public final synchronized void method3624(int arg0, int arg1) {
        ++field8936;
        if (arg1 != -15493) {
            this.field9089 = -0.11671008F;
        }
        class651 var3 = new class651(arg0);
        this.field8970.method11(var3, -93);
    }

    @OriginalMember(owner = "client!rda", name = "u", descriptor = "(I)Ljc;", line = 1444)
    public final class444 method3625(int arg0) {
        if (arg0 != 1) {
            this.field9023 = null;
        }
        ++field8782;
        return this.field9060 == null ? null : this.field9060.method1922(true);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(FFF)V", line = 1457)
    public final void method403(float arg0, float arg1, float arg2) {
        class326.field4658 = arg1;
        class559.field7360 = arg2;
        ++field8890;
        class442.field6097 = arg0;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIIIIII)V", line = 1469)
    public final void method499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field8867;
        if (~arg0 != ~arg2 || arg1 != arg3) {
            this.method3622(1);
            this.method3635(0, arg5);
            float var10 = (float) arg2 - (float) arg0;
            float var11 = (float) arg3 - (float) arg1;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            float var13 = var10 * var12;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            int var14 = arg8 % (arg6 + arg7);
            float var15 = var11 * var12;
            float var16 = (float) arg6 * var13;
            float var17 = (float) arg6 * var15;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (~var14 < ~arg6) {
                var19 = (float) (arg6 - -arg7 + -var14) * var15;
                var18 = (float) (arg6 - -arg7 + -var14) * var13;
            } else {
                var20 = (float) (-var14 + arg6) * var13;
                var21 = (float) (-var14 + arg6) * var15;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var13;
            float var25 = (float) arg7 * var15;
            while (true) {
                if (arg0 >= arg2) {
                    if ((float) arg2 + 0.35F > var22) {
                        break;
                    }
                    if ((float) arg2 > var20 + var22) {
                        var20 = (float) arg2 + -var22;
                    }
                } else {
                    if ((float) arg2 + 0.35F < var22) {
                        break;
                    }
                    if (var20 + var22 > (float) arg2) {
                        var20 = (float) arg2 - var22;
                    }
                }
                if (arg3 > arg1) {
                    if (var23 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if (var21 + var23 > (float) arg3) {
                        var21 = (float) arg3 + -var23;
                    }
                } else {
                    if (var23 < (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 > var21 + var23) {
                        var21 = (float) arg3 + -var23;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glVertex2f(var22, var23);
                OpenGL.glVertex2f(var20 + var22, var21 + var23);
                OpenGL.glEnd();
                var23 += var21 + var25;
                var22 += var20 + var24;
                var20 = var16;
                var21 = var17;
            }
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(IIII)V", line = 1575)
    public final void method3626(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 24873) {
            this.field9045 = null;
        }
        ++field8899;
        OpenGL.glDrawArrays(arg0, arg3, arg2);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIIF)Ltn;", line = 1588)
    public final class87 method413(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field8891;
        return new class711(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(Z)V", line = 1599)
    public final void method496(boolean arg0) {
        ++field8762;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IB[BIZ)Las;", line = 1608)
    public final class154 method3627(int arg0, byte arg1, byte[] arg2, int arg3, boolean arg4) {
        ++field8820;
        if (!this.field8991 || arg4 && !this.field9091) {
            if (arg1 != -85) {
                this.field9091 = true;
            }
            return new class190(this, arg0, arg2, arg3);
        } else {
            return new class89(this, arg0, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!rda", name = "v", descriptor = "()Z", line = 1625)
    public final boolean method485() {
        ++field8756;
        return false;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZI)V", line = 1634)
    public final void method3628(boolean arg0, int arg1) {
        if (arg1 <= -96) {
            ++field8829;
            if (!arg0 != !this.field9006) {
                this.field9006 = arg0;
                this.method3662((byte) 125);
                this.field8976 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!rda", name = "K", descriptor = "([I)V", line = 1652)
    public final void method393(int[] arg0) {
        arg0[0] = this.field8990;
        arg0[1] = this.field9066;
        arg0[3] = this.field9080;
        ++field8889;
        arg0[2] = this.field9055;
    }

    @OriginalMember(owner = "client!rda", name = "da", descriptor = "(III[I)V", line = 1664)
    public final void method471(int arg0, int arg1, int arg2, int[] arg3) {
        ++field8920;
        float var5 = (float) arg2 * this.field8981.field4101 + (float) arg0 * this.field8981.field4083 + (float) arg1 * this.field8981.field4099 + this.field8981.field4105;
        if (!((float) this.field9046 > var5) && !(var5 > (float) this.field9007)) {
            int var6 = (int) (((float) arg2 * this.field8981.field4093 + (float) arg0 * this.field8981.field4102 + (float) arg1 * this.field8981.field4092 + this.field8981.field4088) * (float) this.field9013 / var5);
            int var7 = (int) (((float) arg2 * this.field8981.field4094 + (float) arg0 * this.field8981.field4069 + (float) arg1 * this.field8981.field4080 + this.field8981.field4078) * (float) this.field9012 / var5);
            if (this.field9065 <= (float) var6 && this.field8993 >= (float) var6 && this.field9089 <= (float) var7 && (float) var7 <= this.field9049) {
                arg3[1] = (int) ((float) var7 + -this.field9089);
                arg3[0] = (int) ((float) var6 + -this.field9065);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!rda", name = "v", descriptor = "(I)V", line = 1696)
    private final void method3629(int arg0) {
        ++field8838;
        float var2 = (float) (-this.field9039) * this.field8992 / (float) this.field9013;
        float var3 = (float) (-this.field9082) * this.field8992 / (float) this.field9012;
        float var4 = (float) (-this.field9039 + this.field8845) * this.field8992 / (float) this.field9013;
        float var5 = (float) (this.field8746 - this.field9082) * this.field8992 / (float) this.field9012;
        OpenGL.glMatrixMode(arg0);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field9046, (double) this.field9007);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(ZI)V", line = 1721)
    public final void method3630(boolean arg0, int arg1) {
        if (this.field9090 != arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field9090 = arg1;
        }
        if (!arg0) {
            this.method3661(-21, -9, -89, (byte) -106);
        }
        ++field8928;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lmj;Lbba;)Lnc;", line = 1738)
    public final class23 method463(class655 arg0, class115 arg1) {
        ++field8822;
        return null;
    }

    @OriginalMember(owner = "client!rda", name = "x", descriptor = "()V", line = 1747)
    public final void method503() {
        ++field8777;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BI)V", line = 1755)
    public final void method3631(byte arg0, int arg1) {
        if (~arg1 != -2) {
            if (~arg1 != -1) {
                if (~arg1 != -3) {
                    if (arg1 == 3) {
                        this.method3608(122, 8448, 260);
                    } else if (~arg1 == -5) {
                        this.method3608(118, 34023, 34023);
                    }
                } else {
                    this.method3608(121, 7681, 34165);
                }
            } else {
                this.method3608(121, 8448, 8448);
            }
        } else {
            this.method3608(127, 7681, 7681);
        }
        if (arg0 < 111) {
            this.method3655(false, 85, 39, (Buffer) null, -13);
        }
        ++field8767;
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(IIIID)V", line = 1787)
    public final void method483(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field8834;
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V", line = 1796)
    public class663(Canvas arg0, class152 arg1, int arg2) {
        super(arg1);
        new class721();
        new class360(16);
        this.field8965 = new class2();
        this.field8968 = new class2();
        this.field8969 = new class2();
        this.field8970 = new class2();
        this.field8971 = new class2();
        this.field8972 = new class2();
        this.field8973 = new class2();
        this.field8981 = new class288();
        this.field8983 = new class288();
        this.field8984 = new class288();
        this.field8987 = new float[4];
        this.field8990 = 0;
        this.field9000 = -1;
        this.field9003 = -1;
        this.field9028 = -1;
        this.field9012 = 512;
        this.field9019 = 0;
        this.field9008 = new float[4];
        this.field8995 = -1.0F;
        this.field9033 = 1.0F;
        this.field9016 = 1.0F;
        this.field9029 = 0;
        this.field8992 = 1.0F;
        this.field9031 = 0;
        this.field9048 = -1.0F;
        this.field9041 = 0;
        this.field9022 = false;
        this.field9039 = 0;
        this.field9013 = 512;
        this.field9007 = 3584;
        this.field8988 = new float[4];
        this.field9046 = 50;
        this.field9066 = 0;
        this.field9069 = new class87[class729.field10110];
        this.field8989 = -1.0F;
        this.field9073 = -1.0F;
        this.field9068 = 3584.0F;
        this.field9055 = 0;
        this.field9072 = 8448;
        this.field9005 = -1;
        this.field9081 = 1.0F;
        this.field9082 = 0;
        this.field9040 = 8448;
        this.field9086 = new float[16];
        this.field9042 = 1.0F;
        this.field9076 = true;
        this.field9080 = 0;
        this.field9070 = -1;
        this.field9093 = 3584.0F;
        this.field9051 = 0.0F;
        this.field9094 = new float[4];
        this.field8994 = new class451(8192);
        this.field9096 = new int[1];
        this.field9099 = new int[1];
        this.field9097 = new int[1];
        this.field9100 = new byte[16384];
        this.field8926 = arg2;
        this.field8900 = this.field8759 = arg0;
        if (!class702.method3952(-103, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class702.method3952(-112, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field8882 = new OpenGL();
                this.field8796 = this.field8748 = this.field8882.init(arg0, 8, 8, 8, 24, 0, this.field8926);
                if (this.field8748 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method3653(0);
                    int var4 = this.method3644(false);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field9083 = !this.field9021 ? 5121 : 33639;
                        if (~this.field9061.indexOf("radeon") != 0) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class323.method1958(122, this.field9061.replace('/', ' '), ' ');
                            for (int var9 = 0; ~var8.length < ~var9; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (~var10.length() < -1) {
                                        if (~var10.charAt(0) == -121 && var10.length() >= 3 && class259.method1574(var10.substring(1, 3), 10)) {
                                            var7 = true;
                                            var10 = var10.substring(1);
                                        }
                                        if (var10.equals("hd")) {
                                            var6 = true;
                                        } else {
                                            if (var10.startsWith("hd")) {
                                                var6 = true;
                                                var10 = var10.substring(2);
                                            }
                                            if (~var10.length() <= -5 && class259.method1574(var10.substring(0, 4), 10)) {
                                                var5 = class397.method2337((byte) -127, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field9056 = false;
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && ~var5 >= -8000) {
                                    this.field8991 = false;
                                }
                                if (~var5 <= -7001 && var5 <= 9250) {
                                    this.field9059 = false;
                                }
                            }
                            this.field8986 &= this.field8882.method3438("GL_ARB_half_float_pixel");
                            this.field9091 = this.field8991;
                            this.field9026 = true;
                        }
                        if (~this.field9045.indexOf("intel") != 0) {
                            this.field8985 = false;
                        }
                        this.field9092 = !this.field9045.equals("s3 graphics");
                        if (this.field8991) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class60.method519(false, true, true);
                        this.field8951 = true;
                        this.field8942 = new class12(this, super.field717);
                        this.method3603((byte) 113);
                        this.field8950 = new class34(this);
                        this.field8918 = new class472(this);
                        if (this.field8918.method2661((byte) -127)) {
                            this.field8925 = new class95(this);
                            if (!this.field8925.method719(0)) {
                                this.field8925.method717(false);
                                this.field8925 = null;
                            }
                        }
                        this.field8922 = new class137(this);
                        this.method3636(false);
                        this.method3612((byte) -97);
                        this.method431();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method458();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(IB)V", line = 1947)
    public final void method3632(int arg0, byte arg1) {
        this.method3657(arg0, true, 37922160);
        ++field8835;
        int var3 = -18 / ((15 - arg1) / 55);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILua;)V", line = 1959)
    public final void method3633(int arg0, class666 arg1) {
        ++field8860;
        if (~this.field8963 <= -1 && this.field8957[this.field8963] == arg1) {
            this.field8957[this.field8963--] = null;
            arg1.method3673(-19346);
            if (this.field8963 < 0) {
                this.field8956 = null;
            } else {
                this.field8956 = this.field8957[this.field8963];
                this.field8956.method3675(true);
            }
            if (arg0 != 20133) {
                this.field8981 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)V", line = 1983)
    public final void method437(int arg0) {
        ++field8855;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rda", name = "pa", descriptor = "()V", line = 1994)
    public final void method478() {
        ++field8907;
        this.field9063 = false;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIII)V", line = 2007)
    public final void method412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8923;
        this.method3622(1);
        this.method3635(0, arg5);
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
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var9 + 0.35F, (float) arg3 + var8 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!rda", name = "L", descriptor = "(III)V", line = 2040)
    public final void method476(int arg0, int arg1, int arg2) {
        ++field8763;
        if (this.field9028 != arg0 || ~this.field9070 != ~arg1 || ~this.field9031 != ~arg2) {
            this.field9028 = arg0;
            this.field9031 = arg2;
            this.field9070 = arg1;
            this.method3609(71);
            this.method3607((byte) 91);
        }
    }

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "()Z", line = 2061)
    public final boolean method436() {
        ++field8803;
        return false;
    }

    @OriginalMember(owner = "client!rda", name = "A", descriptor = "()Z", line = 2071)
    public final boolean method512() {
        ++field8883;
        return this.field9088 && (!this.method459() || this.field9074);
    }

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "()V", line = 2079)
    public final void method431() {
        ++field8875;
        if (this.field9092 && ~this.field8845 < -1 && ~this.field8746 < -1) {
            int var1 = this.field8990;
            int var2 = this.field9055;
            int var3 = this.field9066;
            int var4 = this.field9080;
            this.method435();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3634((byte) -67);
            this.method3649(2286, false);
            this.method3628(false, -98);
            this.method3663(false, 0);
            this.method3620(45, false);
            this.method3639(-2, (class460) null);
            this.method3632(-2, (byte) -96);
            this.method3631((byte) 118, 1);
            this.method3635(0, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field8845, this.field8746, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method419(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "(B)V", line = 2127)
    public final void method3634(byte arg0) {
        if (this.field9052 != 0) {
            this.field9052 = 0;
            this.field8976 &= -32;
        }
        ++field8868;
        if (arg0 >= -9) {
            this.method439();
        }
    }

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "(II)V", line = 2144)
    public final void method3635(int arg0, int arg1) {
        ++field8903;
        if (arg0 != 0) {
            this.field8748 = -97L;
        }
        if (this.field8974 != arg1) {
            boolean var3;
            boolean var4;
            byte var5;
            if (~arg1 == -2) {
                var3 = true;
                var4 = true;
                var5 = 1;
            } else if (arg1 == 2) {
                var5 = 2;
                var3 = false;
                var4 = true;
            } else if (arg1 == 128) {
                var4 = true;
                var5 = 3;
                var3 = true;
            } else {
                var4 = true;
                var5 = 0;
                var3 = false;
            }
            if (!this.field8979 != !var4) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field8979 = var4;
            }
            if (var3 == !this.field8977) {
                if (!var3) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field8977 = var3;
            }
            if (~this.field8975 != ~var5) {
                if (var5 == 1) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (var5 != 2) {
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
                this.field8975 = var5;
            }
            this.field8976 &= -29;
            this.field8974 = arg1;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lza;)V", line = 2236)
    public final void method457(class418 arg0) {
        this.field8948 = ((class561) arg0).field7367;
        ++field8935;
        if (this.field9075 == null) {
            class451 var2 = new class451(80);
            if (!this.field9021) {
                var2.method2573(4440, -1.0F);
                var2.method2573(4440, -1.0F);
                var2.method2573(4440, 0.0F);
                var2.method2573(4440, 0.0F);
                var2.method2573(4440, 1.0F);
                var2.method2573(4440, 1.0F);
                var2.method2573(4440, -1.0F);
                var2.method2573(4440, 0.0F);
                var2.method2573(4440, 1.0F);
                var2.method2573(4440, 1.0F);
                var2.method2573(4440, 1.0F);
                var2.method2573(4440, 1.0F);
                var2.method2573(4440, 0.0F);
                var2.method2573(4440, 1.0F);
                var2.method2573(4440, 0.0F);
                var2.method2573(4440, -1.0F);
                var2.method2573(4440, 1.0F);
                var2.method2573(4440, 0.0F);
                var2.method2573(4440, 0.0F);
                var2.method2573(4440, 0.0F);
            } else {
                var2.method2574(103, -1.0F);
                var2.method2574(124, -1.0F);
                var2.method2574(109, 0.0F);
                var2.method2574(103, 0.0F);
                var2.method2574(62, 1.0F);
                var2.method2574(127, 1.0F);
                var2.method2574(106, -1.0F);
                var2.method2574(47, 0.0F);
                var2.method2574(43, 1.0F);
                var2.method2574(67, 1.0F);
                var2.method2574(114, 1.0F);
                var2.method2574(111, 1.0F);
                var2.method2574(83, 0.0F);
                var2.method2574(55, 1.0F);
                var2.method2574(91, 0.0F);
                var2.method2574(123, -1.0F);
                var2.method2574(54, 1.0F);
                var2.method2574(48, 0.0F);
                var2.method2574(29, 0.0F);
                var2.method2574(61, 0.0F);
            }
            this.field9075 = this.method3619((byte) 92, var2.field9419, false, 20, var2.field9399);
            this.field9047 = new class572(this.field9075, 5126, 3, 0);
            this.field9067 = new class572(this.field9075, 5126, 2, 12);
            this.field8944.method1074(this, 111);
        }
    }

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "(Z)V", line = 2304)
    private final void method3636(boolean arg0) {
        this.method3632(-2, (byte) -96);
        ++field8884;
        for (int var2 = this.field9037 + -1; var2 >= 0; --var2) {
            this.method3630(true, var2);
            this.method3639(-2, (class460) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method3608(-58, 8448, 8448);
        this.method3661(770, 34168, 2, (byte) 4);
        this.method3606(arg0);
        this.field8974 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field8975 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field8977 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field8979 = true;
        this.method3649(2286, true);
        this.method3628(true, -109);
        this.method3663(true, 0);
        this.method3620(125, true);
        this.method3634((byte) -99);
        this.field8882.setSwapInterval(0);
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
        this.field9000 = this.field9028 = -1;
        this.method435();
    }

    @OriginalMember(owner = "client!rda", name = "t", descriptor = "()Lofa;", line = 2377)
    public final class333 method474() {
        ++field8895;
        return this.field8981;
    }

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "()Z", line = 2387)
    public final boolean method426() {
        ++field8851;
        return true;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(I[Ltn;)V", line = 2397)
    public final void method460(int arg0, class87[] arg1) {
        ++field8743;
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field9069[var3] = arg1[var3];
        }
        this.field8996 = arg0;
        if (~this.field9052 != -2) {
            this.method3658((byte) -99);
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Luj;)V", line = 2418)
    public final void method508(class388 arg0) {
        ++field8880;
        this.field8944.method1077(arg0, true, this, -1);
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(Lua;I)V", line = 2427)
    public final void method3637(class666 arg0, int arg1) {
        int var3 = -101 % ((-43 - arg1) / 44);
        ++field8751;
        if (!this.field9001) {
            if (this.field8958 >= 0 && this.field8959[this.field8958] == arg0) {
                this.field8959[this.field8958--] = null;
                arg0.method3677(true);
                if (this.field8958 < 0) {
                    this.field8955 = this.field8956 = null;
                } else {
                    this.field8955 = this.field8956 = this.field8959[this.field8958];
                    this.field8955.method3672(-1358);
                }
            } else {
                throw new RuntimeException();
            }
        } else {
            this.method3610(arg0, 115);
            this.method3633(20133, arg0);
        }
    }

    @OriginalMember(owner = "client!rda", name = "u", descriptor = "()V", line = 2461)
    public final void method475() {
        ++field8878;
        if (this.field8925 != null && this.field8925.method1133(818)) {
            this.field8918.method2663(true, this.field8925);
            this.field8942.method103((byte) -122);
        }
    }

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "(B)V", line = 2477)
    private final void method3638(byte arg0) {
        if (arg0 > -93) {
            this.method433(32, -34, -80, 88);
        }
        if (~this.field8990 >= ~this.field9055 && ~this.field9080 <= ~this.field9066) {
            OpenGL.glScissor(this.field9019 + this.field8990, this.field9041 + this.field8746 + -this.field9080, this.field9055 - this.field8990, this.field9080 - this.field9066);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field8865;
    }

    @OriginalMember(owner = "client!rda", name = "i", descriptor = "()I", line = 2496)
    public final int method424() {
        ++field8893;
        return this.field9046;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lofa;)V", line = 2505)
    public final void method481(class333 arg0) {
        ++field8839;
        this.field8981.method1712(arg0);
        this.field8983.method1712(this.field8981);
        this.field8983.method1784(-123);
        this.field8984.method1783((byte) 33, this.field8983);
        if (this.field9052 != 1) {
            this.method3669(0);
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljn;Z)Lhu;", line = 2522)
    public final class133 method415(class720 arg0, boolean arg1) {
        ++field8844;
        int[] var3 = new int[arg0.field10029 * arg0.field10028];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field10030 == null) {
            for (int var6 = 0; arg0.field10029 > var6; ++var6) {
                for (int var7 = 0; arg0.field10028 > var7; ++var7) {
                    int var8 = arg0.field10027[arg0.field10023[var4++] & 255];
                    var3[var5++] = ~var8 != -1 ? class446.method2556(var8, -16777216) : 0;
                }
            }
        } else {
            for (int var9 = 0; arg0.field10029 > var9; ++var9) {
                for (int var11 = 0; ~var11 > ~arg0.field10028; ++var11) {
                    var3[var5++] = class446.method2556(arg0.field10027[class48.method346(255, arg0.field10023[var4])], arg0.field10030[var4] << 24);
                    ++var4;
                }
            }
        }
        class133 var10 = this.method450(arg0.field10029, (byte) 99, arg0.field10028, var3, 0, arg0.field10028);
        var10.method1032(arg0.field10024, arg0.field10031, arg0.field10026, arg0.field10025);
        return var10;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 2585)
    public final void method395(Canvas arg0, int arg1, int arg2) {
        ++field8828;
        if (this.field8759 == arg0) {
            throw new RuntimeException();
        } else if (!this.field8766.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field8882.prepareSurface(arg0);
                if (~var6 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field8766.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIIILaa;II)V", line = 2622)
    public final void method411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class490 arg6, int arg7, int arg8) {
        ++field8739;
        class495 var10 = (class495) arg6;
        class452 var11 = var10.field6674;
        this.method3614(114);
        this.method3639(-2, var10.field6674);
        this.method3635(0, arg5);
        this.method3608(-27, 8448, 7681);
        this.method3661(768, 34167, 0, (byte) 4);
        float var12 = var11.field6183 / (float) var11.field6178;
        float var13 = var11.field6181 / (float) var11.field6180;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var14 * var16;
        float var18 = var15 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method3661(768, 5890, 0, (byte) 4);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILiga;)V", line = 2660)
    public final void method3639(int arg0, class460 arg1) {
        ++field8757;
        class460 var3 = this.field8997[this.field9090];
        if (arg1 != var3) {
            if (arg1 != null) {
                if (var3 != null) {
                    if (arg1.field6282 != var3.field6282) {
                        OpenGL.glDisable(var3.field6282);
                        OpenGL.glEnable(arg1.field6282);
                    }
                } else {
                    OpenGL.glEnable(arg1.field6282);
                }
                OpenGL.glBindTexture(arg1.field6282, arg1.method2610(6598));
            } else {
                OpenGL.glDisable(var3.field6282);
            }
            this.field8997[this.field9090] = arg1;
        }
        this.field8976 &= arg0;
    }

    @OriginalMember(owner = "client!rda", name = "E", descriptor = "()I", line = 2696)
    public final int method488() {
        ++field8747;
        return this.field8967 + this.field8964 - -this.field8966;
    }

    @OriginalMember(owner = "client!rda", name = "w", descriptor = "(I)V", line = 2704)
    private final void method3640(int arg0) {
        if (this.field9052 != 3) {
            this.field9052 = 3;
            this.method3629(5889);
            this.method3669(0);
            this.field8976 &= -8;
        }
        ++field8870;
        if (arg0 > -90) {
            this.method452(-115, -45, (int[][]) null, (int[][]) null, 37, -36, -60);
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(FFFB)V", line = 2726)
    private final void method3641(float arg0, float arg1, float arg2, byte arg3) {
        ++field8740;
        OpenGL.glMatrixMode(5890);
        if (this.field9024) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg0, arg1, arg2);
        OpenGL.glMatrixMode(5888);
        if (arg3 >= -26) {
            this.method454();
        }
        this.field9024 = true;
    }

    @OriginalMember(owner = "client!rda", name = "za", descriptor = "(IIIII)V", line = 2749)
    public final void method416(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8818;
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        if (~(arg0 - -arg2) <= ~this.field8990 && ~(-arg2 + arg0) >= ~this.field9055 && this.field9066 <= arg1 + arg2 && ~(arg1 - arg2) >= ~this.field9080) {
            this.method3622(1);
            this.method3635(0, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field9048) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field9073 >= (float) var8) {
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
                    if (~var9 < -513) {
                        var9 = 512;
                    }
                } else {
                    var9 = 64;
                }
                int var10 = class658.method3571(27690, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; var11 > 0; var11 -= var10) {
                    OpenGL.glVertex2f(class260.field3624[var11] * (float) arg2 + var6, class260.field3625[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(ZI)I", line = 2822)
    public final int method3642(boolean arg0, int arg1) {
        ++field8863;
        if (arg1 == 1) {
            return 7681;
        } else if (arg1 == 0) {
            return 8448;
        } else if (arg1 != 2) {
            if (arg1 == 3) {
                return 260;
            } else if (~arg1 == -5) {
                return 34023;
            } else {
                if (arg0) {
                    this.field9060 = null;
                }
                throw new IllegalArgumentException();
            }
        } else {
            return 34165;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)V", line = 2858)
    public final void method456(boolean arg0) {
        ++field8771;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZIIZ)V", line = 2868)
    public final void method3643(boolean arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 != 0) {
            this.method474();
        }
        if (~this.field9009 != ~arg2 || this.field9022 == !this.field9063) {
            class737 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field9063 ? 3 : 0;
            if (~arg2 > -1) {
                this.method3606(false);
            } else {
                var5 = this.field8942.method105(68, arg2);
                class758 var10 = super.field717.method91(arg2, (byte) 126);
                if (var10.field10555 == 0 && var10.field10554 == 0) {
                    this.method3606(false);
                } else {
                    int var11 = !var10.field10548 ? 128 : 64;
                    int var12 = var11 * 50;
                    this.method3641((float) (this.field8949 % var12 * var10.field10555) / (float) var12, (float) (this.field8949 % var12 * var10.field10554) / (float) var12, 0.0F, (byte) -40);
                }
                var6 = var10.field10545;
                if (!this.field9063) {
                    var7 = var10.field10558;
                    var9 = var10.field10536;
                    var8 = var10.field10557;
                }
            }
            this.field8922.method1065(var7, var8, var9, arg3, arg0, 0);
            if (!this.field8922.method1066(var5, (byte) -59, var6)) {
                this.method3639(arg1 + -2, var5);
                this.method3631((byte) 119, var6);
            }
            this.field9022 = this.field9063;
            this.field9009 = arg2;
        }
        ++field8785;
        this.field8976 &= -8;
    }

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "(Z)I", line = 2937)
    private final int method3644(boolean arg0) {
        ++field8877;
        this.field9045 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field9061 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field9045.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (~this.field9045.indexOf("brian paul") != 0 || this.field9045.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class323.method1958(115, var3.replace('.', ' '), ' ');
        if (~var4.length <= -3) {
            try {
                int var5 = class397.method2337((byte) -115, var4[0]);
                int var6 = class397.method2337((byte) -121, var4[1]);
                this.field9015 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (this.field9015 < 12) {
            var2 |= 2;
        }
        if (!this.field8882.method3438("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field8882.method3438("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field9037 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field8999 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field9030 = var7[0];
        if (this.field9037 < 2 || ~this.field8999 > -3 || ~this.field9030 > -3) {
            var2 |= 16;
        }
        this.field9021 = Stream.method3739();
        this.field9002 = this.field8882.arePbuffersAvailable();
        this.field8991 = this.field8882.method3438("GL_ARB_vertex_buffer_object");
        this.field9088 = this.field8882.method3438("GL_ARB_multisample");
        this.field9020 = this.field8882.method3438("GL_ARB_vertex_program");
        this.field8882.method3438("GL_ARB_fragment_program");
        this.field9085 = this.field8882.method3438("GL_ARB_vertex_shader");
        this.field9079 = this.field8882.method3438("GL_ARB_fragment_shader");
        this.field9059 = this.field8882.method3438("GL_EXT_texture3D");
        this.field8986 = this.field8882.method3438("GL_ARB_texture_rectangle");
        this.field9032 = this.field8882.method3438("GL_ARB_texture_cube_map");
        this.field9056 = this.field8882.method3438("GL_ARB_texture_float");
        this.field9062 = arg0;
        this.field8985 = this.field8882.method3438("GL_EXT_framebuffer_object");
        this.field9001 = this.field8882.method3438("GL_EXT_framebuffer_blit");
        this.field9064 = this.field8882.method3438("GL_EXT_framebuffer_multisample");
        this.field9074 = this.field9001 & this.field9064;
        this.field9018 = class721.field10047.startsWith("mac");
        OpenGL.glGetFloatv(2834, class8.field156, 0);
        this.field9073 = class8.field156[1];
        this.field9048 = class8.field156[0];
        return ~var2 != -1 ? var2 : 0;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)Lza;", line = 3022)
    public final class418 method408(int arg0) {
        ++field8774;
        class561 var2 = new class561(arg0);
        this.field8953.method11(var2, -109);
        return var2;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 3035)
    public final class282 method452(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field8807;
        return new class304(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "(Z)V", line = 3047)
    private final void method3645(boolean arg0) {
        ++field8808;
        float[] var2 = this.field9086;
        float var3 = (float) (-this.field9039 * this.field9046) / (float) this.field9013;
        float var4 = (float) ((this.field8845 - this.field9039) * this.field9046) / (float) this.field9013;
        float var5 = (float) (this.field9082 * this.field9046) / (float) this.field9012;
        float var6 = (float) ((-this.field8746 + this.field9082) * this.field9046) / (float) this.field9012;
        if (!arg0) {
            this.field9079 = false;
        }
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field9046 * 2.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[12] = 0.0F;
            var2[14] = this.field9058 = -((float) this.field9007 * var7) / (float) (-this.field9046 + this.field9007);
            var2[15] = 0.0F;
            var2[13] = 0.0F;
            var2[2] = 0.0F;
            var2[10] = this.field9004 = (float) (-(this.field9046 + this.field9007)) / (float) (-this.field9046 + this.field9007);
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[7] = 0.0F;
            var2[1] = 0.0F;
            var2[3] = 0.0F;
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[5] = var7 / (var5 - var6);
            var2[11] = -1.0F;
            var2[4] = 0.0F;
            var2[6] = 0.0F;
        } else {
            var2[10] = 1.0F;
            var2[5] = 1.0F;
            var2[9] = 0.0F;
            var2[7] = 0.0F;
            var2[13] = 0.0F;
            var2[1] = 0.0F;
            var2[3] = 0.0F;
            var2[12] = 0.0F;
            var2[4] = 0.0F;
            var2[15] = 1.0F;
            var2[6] = 0.0F;
            var2[2] = 0.0F;
            var2[11] = 0.0F;
            var2[8] = 0.0F;
            var2[14] = 0.0F;
            var2[0] = 1.0F;
        }
        this.method3667((byte) 106);
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(II)I", line = 3111)
    public final int method405(int arg0, int arg1) {
        ++field8909;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 3119)
    public final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class490 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field8827;
        if (~arg0 != ~arg2 || arg1 != arg3) {
            class495 var13 = (class495) arg6;
            class452 var14 = var13.field6674;
            this.method3614(121);
            this.method3639(-2, var13.field6674);
            this.method3635(0, arg5);
            this.method3608(12, 8448, 7681);
            this.method3661(768, 34167, 0, (byte) 4);
            float var15 = var14.field6183 / (float) var14.field6178;
            float var16 = var14.field6181 / (float) var14.field6180;
            float var17 = (float) (-arg0) + (float) arg2;
            float var18 = (float) arg3 - (float) arg1;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            float var20 = var17 * var19;
            float var21 = var18 * var19;
            int var22 = arg11 % (arg9 + arg10);
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var23 = (float) arg9 * var20;
            float var24 = (float) arg9 * var21;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (~arg9 <= ~var22) {
                var27 = (float) (arg9 - var22) * var20;
                var28 = (float) (-var22 + arg9) * var21;
            } else {
                var26 = (float) (-var22 + arg9 + arg10) * var21;
                var25 = (float) (arg9 - var22 + arg10) * var20;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var20;
            float var32 = (float) arg10 * var21;
            while (true) {
                if (~arg2 < ~arg0) {
                    if ((float) arg2 + 0.35F < var29) {
                        break;
                    }
                    if (var27 + var29 > (float) arg2) {
                        var27 = (float) arg2 + -var29;
                    }
                } else {
                    if (var29 < (float) arg2 + 0.35F) {
                        break;
                    }
                    if ((float) arg2 > var27 + var29) {
                        var27 = (float) arg2 + -var29;
                    }
                }
                if (arg3 <= arg1) {
                    if (var30 < (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 > var28 + var30) {
                        var28 = (float) arg3 - var30;
                    }
                } else {
                    if ((float) arg3 + 0.35F < var30) {
                        break;
                    }
                    if ((float) arg3 < var28 + var30) {
                        var28 = (float) arg3 - var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f((var29 - (float) arg7) * var15, ((float) (-arg8) + var30) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 - (float) arg7) * var15, (var28 + var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                OpenGL.glEnd();
                var30 += var28 + var32;
                var29 += var27 + var31;
                var28 = var24;
                var27 = var23;
            }
            this.method3661(768, 5890, 0, (byte) 4);
        }
    }

    @OriginalMember(owner = "client!rda", name = "p", descriptor = "()V", line = 3242)
    public final void method458() {
        for (class656 var1 = this.field8953.method21(2); var1 != null; var1 = this.field8953.method9(-127)) {
            ((class561) var1).method3110(false);
        }
        ++field8742;
        if (this.field8918 != null) {
            this.field8918.method2665(235);
        }
        if (this.field8882 != null) {
            this.method3665(1136122328);
            Enumeration var2 = this.field8766.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field8766.get(var3);
                this.field8882.releaseSurface(var3, var4);
            }
            this.field8882.release();
            this.field8882 = null;
        }
        if (this.field8951) {
            class60.method530(false, true, (byte) 119);
            this.field8951 = false;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIZ)Lhu;", line = 3289)
    public final class133 method409(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field8864;
        return new class708(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!rda", name = "r", descriptor = "(IIIIIII)I", line = 3298)
    public final int method400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8781;
        float var8 = (float) arg2 * this.field8981.field4101 + (float) arg0 * this.field8981.field4083 + (float) arg1 * this.field8981.field4099 + this.field8981.field4105;
        float var9 = (float) arg5 * this.field8981.field4101 + (float) arg3 * this.field8981.field4083 + (float) arg4 * this.field8981.field4099 + this.field8981.field4105;
        int var10 = 0;
        if (var8 < (float) this.field9046 && (float) this.field9046 > var9) {
            var10 |= 16;
        } else if (var8 > (float) this.field9007 && (float) this.field9007 < var9) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field8981.field4093 + (float) arg0 * this.field8981.field4102 + (float) arg1 * this.field8981.field4092 + this.field8981.field4088) * (float) this.field9013 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field8981.field4093 + (float) arg3 * this.field8981.field4102 + (float) arg4 * this.field8981.field4092 + this.field8981.field4088) * (float) this.field9013 / (float) arg6);
        if (this.field9065 > (float) var11 && this.field9065 > (float) var12) {
            var10 |= 1;
        } else if ((float) var11 > this.field8993 && this.field8993 < (float) var12) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field8981.field4094 + (float) arg0 * this.field8981.field4069 + (float) arg1 * this.field8981.field4080 + this.field8981.field4078) * (float) this.field9012 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field8981.field4094 + (float) arg3 * this.field8981.field4069 + (float) arg4 * this.field8981.field4080 + this.field8981.field4078) * (float) this.field9012 / (float) arg6);
        if (this.field9089 > (float) var13 && this.field9089 > (float) var14) {
            var10 |= 4;
        } else if ((float) var13 > this.field9049 && this.field9049 < (float) var14) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(III)V", line = 3349)
    public final synchronized void method3646(int arg0, int arg1, int arg2) {
        ++field8913;
        class651 var4 = new class651(arg2);
        var4.field8680 = (long) arg0;
        if (arg1 == 0) {
            this.field8969.method11(var4, -97);
        }
    }

    @OriginalMember(owner = "client!rda", name = "r", descriptor = "()I", line = 3363)
    public final int method466() {
        ++field8898;
        return 4;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ltea;Ltea;FLtea;)Ltea;", line = 3374)
    public final class241 method429(class241 arg0, class241 arg1, float arg2, class241 arg3) {
        ++field8738;
        if (arg0 != null && arg1 != null && this.field9032 && this.field8985) {
            class571 var5 = null;
            class712 var6 = (class712) arg0;
            class712 var7 = (class712) arg1;
            class444 var8 = var6.method1922(true);
            class444 var9 = var7.method1922(true);
            if (var8 != null && var9 != null) {
                int var10 = ~var8.field6108 < ~var9.field6108 ? var8.field6108 : var9.field6108;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class571) {
                    class571 var11 = (class571) arg3;
                    if (var11.method3145(32395) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class571(this, var10);
                }
                if (var5.method3146(var9, var8, (byte) 95, arg2)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)V", line = 3420)
    public final void method420(int arg0) {
        ++field8901;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field8939 = arg0;
            this.field8942.method103((byte) -127);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Las;IBII)V", line = 3433)
    public final void method3647(class154 arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field8894;
        if (arg2 > -77) {
            this.field9040 = 92;
        }
        int var6 = arg0.method682((byte) 23);
        int var7 = arg1 * this.method3666(-73, var6);
        this.method3654((byte) 82, arg0);
        OpenGL.glDrawElements(arg3, arg4, var6, arg0.method679(-4468) + (long) var7);
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "()Z", line = 3453)
    public final boolean method414() {
        ++field8799;
        return true;
    }

    @OriginalMember(owner = "client!rda", name = "EA", descriptor = "(IIII)V", line = 3464)
    public final void method502(int arg0, int arg1, int arg2, int arg3) {
        ++field8933;
        if (!this.field9063) {
            throw new RuntimeException("");
        } else {
            this.field9029 = arg3;
            this.field9005 = arg1;
            this.field9003 = arg2;
            this.field9071 = arg0;
            if (this.field9022) {
                this.field8922.field2180.method2237((byte) -115);
                this.field8922.field2180.method2235((byte) -104);
            }
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(II)Lbba;", line = 3487)
    public final class115 method394(int arg0, int arg1) {
        ++field8741;
        return null;
    }

    @OriginalMember(owner = "client!rda", name = "GA", descriptor = "(I)V", line = 3495)
    public final void method392(int arg0) {
        ++field8862;
        this.method3635(0, 0);
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!rda", name = "i", descriptor = "(II)I", line = 3511)
    public final int method3648(int arg0, int arg1) {
        if (arg1 != 6407) {
            this.method3628(false, 4);
        }
        ++field8847;
        if (~arg0 != -6407 && arg0 != 6409) {
            if (~arg0 != -6411 && arg0 != 34846 && ~arg0 != -34845) {
                if (arg0 == 6407) {
                    return 3;
                } else if (~arg0 != -6409 && ~arg0 != -34848) {
                    if (arg0 != 34843) {
                        if (arg0 == 34842) {
                            return 8;
                        } else if (~arg0 != -6403) {
                            if (~arg0 == -6402) {
                                return 1;
                            } else {
                                throw new IllegalArgumentException("");
                            }
                        } else {
                            return 3;
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

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(IZ)V", line = 3553)
    public final void method3649(int arg0, boolean arg1) {
        if (arg1 == !this.field9087) {
            this.field9087 = arg1;
            this.method3607((byte) 41);
            this.field8976 &= -32;
        }
        ++field8888;
        if (arg0 != 2286) {
            this.method3655(true, -124, -3, (Buffer) null, -123);
        }
    }

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "(B)V", line = 3571)
    private final void method3650(byte arg0) {
        if (arg0 == 14) {
            ++field8932;
            OpenGL.glViewport(this.field9019, this.field9041, this.field8845, this.field8746);
        }
    }

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "(II)V", line = 3582)
    public final void method3651(int arg0, int arg1) {
        class8.field156[0] = (float) class48.method346(arg1, 16711680) / 1.671168E7F;
        class8.field156[2] = (float) class48.method346(arg1, 255) / 255.0F;
        class8.field156[3] = (float) (arg1 >>> 24) / 255.0F;
        if (arg0 < -33) {
            ++field8765;
            class8.field156[1] = (float) class48.method346(65280, arg1) / 65280.0F;
            OpenGL.glTexEnvfv(8960, 8705, class8.field156, 0);
        }
    }

    @OriginalMember(owner = "client!rda", name = "C", descriptor = "(Z)V", line = 3598)
    public final void method493(boolean arg0) {
        this.field9076 = arg0;
        ++field8784;
        this.method3611(0);
    }

    @OriginalMember(owner = "client!rda", name = "DA", descriptor = "(IIII)V", line = 3609)
    public final void method445(int arg0, int arg1, int arg2, int arg3) {
        this.field9012 = arg3;
        this.field9082 = arg1;
        this.field9039 = arg0;
        this.field9013 = arg2;
        ++field8772;
        this.method3645(true);
        this.method3589(108);
        if (~this.field9052 != -4) {
            if (this.field9052 == 2) {
                this.method3664((byte) 106);
                return;
            }
        } else {
            this.method3629(5889);
        }
    }

    @OriginalMember(owner = "client!rda", name = "z", descriptor = "()V", line = 3632)
    public final void method511() {
        ++field8931;
        if (this.field8985) {
            if (this.field8961 != this.field8956) {
                throw new RuntimeException();
            }
            this.field8961.method4200(1, 0);
            this.field8961.method4200(1, 8);
            this.method3637(this.field8961, -101);
        } else {
            if (!this.field9002) {
                throw new RuntimeException("");
            }
            this.field8960.method1051(0, 0, this.field8845, this.field8746, 0, 0);
            this.field8882.setSurface(this.field8796);
        }
        this.field8845 = this.field8842;
        this.field8960 = null;
        this.field8746 = this.field8750;
        this.method3634((byte) -123);
        this.method3650((byte) 14);
        this.method435();
    }

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "()Lofa;", line = 3665)
    public final class333 method421() {
        ++field8736;
        return new class288();
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(IZ)V", line = 3676)
    public final void method3652(int arg0, boolean arg1) {
        ++field8917;
        if (!arg1 != !this.field9078) {
            this.field9078 = arg1;
            this.method3662((byte) 125);
        }
        int var3 = 26 / ((arg0 - -22) / 48);
    }

    @OriginalMember(owner = "client!rda", name = "T", descriptor = "(IIII)V", line = 3696)
    public final void method433(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9055 > arg2) {
            this.field9055 = arg2;
        }
        ++field8806;
        if (arg0 > this.field8990) {
            this.field8990 = arg0;
        }
        if (~arg3 > ~this.field9080) {
            this.field9080 = arg3;
        }
        if (~this.field9066 > ~arg1) {
            this.field9066 = arg1;
        }
        OpenGL.glEnable(3089);
        this.method3589(-125);
        this.method3638((byte) -101);
    }

    @OriginalMember(owner = "client!rda", name = "x", descriptor = "(I)V", line = 3732)
    private final void method3653(int arg0) {
        ++field8861;
        int var2 = arg0;
        while (!this.field8882.method3439()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class226.method1447((byte) -124, 1000L);
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BLas;)V", line = 3752)
    public final void method3654(byte arg0, class154 arg1) {
        ++field8802;
        if (this.field9036 != arg1) {
            if (this.field8991) {
                OpenGL.glBindBufferARB(34963, arg1.method683(false));
            }
            this.field9036 = arg1;
        }
        if (arg0 != 82) {
            this.method496(false);
        }
    }

    @OriginalMember(owner = "client!rda", name = "X", descriptor = "(I)V", line = 3772)
    public final void method479(int arg0) {
        ++field8792;
        this.field8947 = 0;
        while (arg0 > 1) {
            ++this.field8947;
            arg0 >>= 1;
        }
        this.field8952 = 1 << this.field8947;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ZIILjaclib/memory/Buffer;I)Lcs;", line = 3787)
    public final class345 method3655(boolean arg0, int arg1, int arg2, Buffer arg3, int arg4) {
        ++field8941;
        if (!this.field8991 || arg0 && !this.field9091) {
            if (arg2 > -32) {
                this.method397();
            }
            return new class553(this, arg1, arg3);
        } else {
            return new class374(this, arg1, arg3, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "(Lua;I)V", line = 3804)
    public final void method3656(class666 arg0, int arg1) {
        ++field8830;
        if (this.field8962 >= 3) {
            throw new RuntimeException();
        } else {
            if (this.field8962 >= 0) {
                this.field8954[this.field8962].method3674(127);
            }
            this.field8955 = this.field8954[++this.field8962] = arg0;
            if (arg1 > 115) {
                this.field8955.method3676((byte) -67);
            }
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lrc;[Ljn;Z)Lda;", line = 3824)
    public final class60 method425(class539 arg0, class720[] arg1, boolean arg2) {
        ++field8780;
        return new class728(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rda", name = "ya", descriptor = "()V", line = 3835)
    public final void method454() {
        this.method3620(106, true);
        ++field8916;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IZI)V", line = 3847)
    public final void method3657(int arg0, boolean arg1, int arg2) {
        ++field8814;
        this.method3643(true, 0, arg0, arg1);
        if (arg2 != 37922160) {
            this.method432(94, (class490) null, 39, 37);
        }
    }

    @OriginalMember(owner = "client!rda", name = "y", descriptor = "()Z", line = 3859)
    public final boolean method505() {
        ++field8938;
        if (this.field8925 != null) {
            if (!this.field8925.method1133(818)) {
                if (!this.field8918.method2664((byte) 72, this.field8925)) {
                    return false;
                }
                this.field8942.method103((byte) -124);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "(B)V", line = 3886)
    private final void method3658(byte arg0) {
        ++field8858;
        int var2;
        for (var2 = 0; this.field8996 > var2; ++var2) {
            class87 var3 = this.field9069[var2];
            class526.field6977[0] = (float) var3.method665(123);
            int var4 = var2 + 16386;
            class526.field6977[1] = (float) var3.method669(class712.method4000(arg0, 22061));
            class526.field6977[2] = (float) var3.method670((byte) -125);
            class526.field6977[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class526.field6977, 0);
            int var5 = var3.method671(false);
            float var6 = var3.method666((byte) 110) / 255.0F;
            class526.field6977[0] = (float) class48.method346(var5 >> 16, 255) * var6;
            class526.field6977[1] = var6 * (float) (class48.method346(var5, 65424) >> 8);
            class526.field6977[2] = (float) class48.method346(255, var5) * var6;
            OpenGL.glLightfv(var4, 4609, class526.field6977, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method673(-79) * var3.method673(-36)));
            OpenGL.glEnable(var4);
        }
        while (~var2 > ~this.field9077) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        if (arg0 != -99) {
            this.field9027 = -0.7426886F;
        }
        this.field9077 = this.field8996;
    }

    @OriginalMember(owner = "client!rda", name = "A", descriptor = "(ILaa;II)V", line = 3931)
    public final void method432(int arg0, class490 arg1, int arg2, int arg3) {
        ++field8761;
        class495 var5 = (class495) arg1;
        class452 var6 = var5.field6674;
        this.method3614(121);
        this.method3639(-2, var5.field6674);
        this.method3635(0, 1);
        this.method3608(-65, 8448, 7681);
        this.method3661(768, 34167, 0, (byte) 4);
        float var7 = var6.field6183 / (float) var6.field6178;
        float var8 = var6.field6181 / (float) var6.field6180;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field8990) * var7, (float) (-arg3 + this.field9066) * var8);
        OpenGL.glVertex2i(this.field8990, this.field9066);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field8990) * var7, (float) (this.field9080 - arg3) * var8);
        OpenGL.glVertex2i(this.field8990, this.field9080);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field9055) * var7, (float) (-arg3 + this.field9080) * var8);
        OpenGL.glVertex2i(this.field9055, this.field9080);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field9055) * var7, (float) (-arg3 + this.field9066) * var8);
        OpenGL.glVertex2i(this.field9055, this.field9066);
        OpenGL.glEnd();
        this.method3661(768, 5890, 0, (byte) 4);
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 3964)
    public final void method484(Canvas arg0, int arg1, int arg2) {
        ++field8823;
        long var4 = 0L;
        if (arg0 != null && this.field8759 != arg0) {
            if (this.field8766.containsKey(arg0)) {
                Long var6 = (Long) this.field8766.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field8748;
        }
        if (var4 == 0L) {
            throw new RuntimeException();
        } else {
            this.field8882.surfaceResized(var4);
            if (this.field8900 == arg0) {
                this.method3612((byte) -97);
            }
        }
    }

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "()V", line = 3997)
    public final void method439() {
        this.field8918.method2658(-67);
        ++field8744;
    }

    @OriginalMember(owner = "client!rda", name = "y", descriptor = "(I)V", line = 4010)
    private final void method3659(int arg0) {
        class8.field156[1] = this.field9027 * this.field9016;
        if (arg0 <= 28) {
            this.method459();
        }
        class8.field156[0] = this.field9033 * this.field9027;
        class8.field156[3] = 1.0F;
        ++field8786;
        class8.field156[2] = this.field9042 * this.field9027;
        OpenGL.glLightModelfv(2899, class8.field156, 0);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 4028)
    public final void method446(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class149 {
        this.method465(arg2, arg3);
        ++field8775;
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "()Lkea;", line = 4038)
    public final class240 method397() {
        ++field8846;
        int var1 = -1;
        if (~this.field9045.indexOf("nvidia") == 0) {
            if (this.field9045.indexOf("intel") == -1) {
                if (this.field9045.indexOf("ati") != -1) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class240(var1, "OpenGL", this.field9015, this.field9061, 0L);
    }

    @OriginalMember(owner = "client!rda", name = "HA", descriptor = "(IIII[I)V", line = 4060)
    public final void method398(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field8821;
        float var6 = (float) arg2 * this.field8981.field4101 + (float) arg0 * this.field8981.field4083 + (float) arg1 * this.field8981.field4099 + this.field8981.field4105;
        if (!(var6 < (float) this.field9046) && !(var6 > (float) this.field9007)) {
            int var7 = (int) (((float) arg2 * this.field8981.field4093 + (float) arg0 * this.field8981.field4102 + (float) arg1 * this.field8981.field4092 + this.field8981.field4088) * (float) this.field9013 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field8981.field4094 + (float) arg0 * this.field8981.field4069 + (float) arg1 * this.field8981.field4080 + this.field8981.field4078) * (float) this.field9012 / (float) arg3);
            if ((float) var7 >= this.field9065 && this.field8993 >= (float) var7 && (float) var8 >= this.field9089 && (float) var8 <= this.field9049) {
                arg4[1] = (int) ((float) var8 + -this.field9089);
                arg4[2] = (int) var6;
                arg4[0] = (int) ((float) var7 + -this.field9065);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!rda", name = "KA", descriptor = "(IIII)V", line = 4091)
    public final void method419(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        ++field8752;
        if (this.field8845 < arg2) {
            arg2 = this.field8845;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg3 > this.field8746) {
            arg3 = this.field8746;
        }
        this.field8990 = arg0;
        this.field9055 = arg2;
        this.field9066 = arg1;
        this.field9080 = arg3;
        OpenGL.glEnable(3089);
        this.method3589(59);
        this.method3638((byte) -116);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IFFFF)V", line = 4121)
    public final void method3660(int arg0, float arg1, float arg2, float arg3, float arg4) {
        class8.field156[3] = arg4;
        class8.field156[0] = arg2;
        ++field8904;
        class8.field156[1] = arg3;
        class8.field156[2] = arg1;
        if (arg0 != -14217) {
            this.field9051 = -1.6126654F;
        }
        OpenGL.glTexEnvfv(8960, 8705, class8.field156, 0);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIB)V", line = 4136)
    public final void method3661(int arg0, int arg1, int arg2, byte arg3) {
        ++field8937;
        if (arg3 != 4) {
            this.method409(-24, 112, 108, -74, true);
        }
        OpenGL.glTexEnvi(8960, arg2 + 34176, arg1);
        OpenGL.glTexEnvi(8960, 34192 - -arg2, arg0);
    }

    @OriginalMember(owner = "client!rda", name = "m", descriptor = "()Z", line = 4148)
    public final boolean method443() {
        ++field8915;
        return true;
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(II)I", line = 4157)
    public final int method410(int arg0, int arg1) {
        ++field8816;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 4165)
    public final void method462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.method3622(1);
        ++field8852;
        this.method3635(0, arg12);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!rda", name = "Y", descriptor = "()[I", line = 4184)
    public final int[] method469() {
        ++field8886;
        return new int[] { this.field9039, this.field9082, this.field9013, this.field9012 };
    }

    @OriginalMember(owner = "client!rda", name = "U", descriptor = "(IIIII)V", line = 4195)
    public final void method480(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8791;
        this.method3622(1);
        this.method3635(0, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!rda", name = "o", descriptor = "()Lofa;", line = 4223)
    public final class333 method451() {
        ++field8843;
        return this.field8945;
    }

    @OriginalMember(owner = "client!rda", name = "ZA", descriptor = "(IFFFFF)V", line = 4232)
    public final void method423(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field8840;
        boolean var7 = ~this.field9000 != ~arg0;
        if (var7 || this.field8989 != arg1 || this.field8995 != arg2) {
            this.field8989 = arg1;
            this.field9000 = arg0;
            this.field8995 = arg2;
            if (var7) {
                this.field9016 = (float) (this.field9000 & 65280) / 65280.0F;
                this.field9033 = (float) (16711680 & this.field9000) / 1.671168E7F;
                this.field9042 = (float) (255 & this.field9000) / 255.0F;
                this.method3659(57);
            }
            this.method3618(true);
        }
        if (this.field9008[0] != arg3 || this.field9008[1] != arg4 || this.field9008[2] != arg5) {
            this.field9008[1] = arg4;
            this.field9008[2] = arg5;
            this.field9008[0] = arg3;
            this.field8988[2] = -arg5;
            this.field8988[1] = -arg4;
            this.field8988[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field8987[0] = arg3 * var8;
            this.field8987[1] = arg4 * var8;
            this.field8987[2] = arg5 * var8;
            this.field9094[2] = -this.field8987[2];
            this.field9094[0] = -this.field8987[0];
            this.field9094[1] = -this.field8987[1];
            this.method3605(0);
            this.field9011 = (int) (arg3 * 256.0F / arg4);
            this.field9084 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!rda", name = "P", descriptor = "(IIIII)V", line = 4287)
    public final void method428(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3622(1);
        ++field8764;
        this.method3635(0, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!rda", name = "i", descriptor = "(B)V", line = 4309)
    private final void method3662(byte arg0) {
        if (this.field9006 && !this.field9078) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field8905;
        if (arg0 != 125) {
            this.method393((int[]) null);
        }
    }

    @OriginalMember(owner = "client!rda", name = "xa", descriptor = "(F)V", line = 4325)
    public final void method486(float arg0) {
        if (this.field9027 != arg0) {
            this.field9027 = arg0;
            this.method3659(87);
        }
        ++field8914;
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "()Z", line = 4343)
    public final boolean method391() {
        ++field8825;
        return true;
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(ZI)V", line = 4352)
    public final void method3663(boolean arg0, int arg1) {
        ++field8831;
        if (arg1 != 0) {
            this.field9044 = null;
        }
        if (!this.field8980 != !arg0) {
            if (arg0) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field8976 &= -32;
            this.field8980 = arg0;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(II[I[I)Laa;", line = 4374)
    public final class490 method506(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field8849;
        return class733.method4103(this, arg3, arg0, arg1, arg2, 1179648);
    }

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "(B)V", line = 4383)
    private final void method3664(byte arg0) {
        if (arg0 < 88) {
            this.method3653(42);
        }
        OpenGL.glMatrixMode(5889);
        ++field8776;
        OpenGL.glLoadMatrixf(this.field9086, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lnc;)V", line = 4397)
    public final void method444(class23 arg0) {
        ++field8897;
    }

    @OriginalMember(owner = "client!rda", name = "z", descriptor = "(I)V", line = 4407)
    private final void method3665(int arg0) {
        this.field8882.method3437();
        if (arg0 == 1136122328) {
            ++field8879;
        }
    }

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "(II)I", line = 4418)
    public final int method3666(int arg0, int arg1) {
        ++field8779;
        if (~arg1 != -5122 && arg1 != 5120) {
            if (~arg1 != -5124 && arg1 != 5122) {
                if (arg0 > -44) {
                    return -43;
                } else if (arg1 != 5125 && arg1 != 5124 && arg1 != 5126) {
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

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "(B)V", line = 4440)
    private final void method3667(byte arg0) {
        this.field9086[14] = this.field9058;
        ++field8749;
        this.field9086[10] = this.field9004;
        if (arg0 <= 79) {
            this.field9093 = 1.4745909F;
        }
        this.field9093 = (float) this.field9007;
        this.field9068 = (this.field9086[14] - (float) this.field9007) / this.field9086[10];
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "([IIIIIZ)Lhu;", line = 4458)
    public final class133 method495(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8940;
        return new class708(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rda", name = "A", descriptor = "(I)V", line = 4468)
    public final void method3668(int arg0) {
        OpenGL.glPushMatrix();
        ++field8934;
        if (arg0 != 0) {
            this.method492(-105);
        }
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(IIIIII)Ltea;", line = 4482)
    public final class241 method477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8826;
        return !this.field9032 ? null : new class314(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!rda", name = "B", descriptor = "(I)V", line = 4500)
    private final void method3669(int arg0) {
        ++field8753;
        OpenGL.glLoadIdentity();
        OpenGL.glMultMatrixf(this.field8983.method1786((byte) -82), 0);
        if (this.field9022) {
            this.field8922.field2180.method2237((byte) -118);
        }
        this.method3605(arg0);
        this.method3658((byte) -99);
    }
}
