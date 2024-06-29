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

@OriginalClass("client!dw")
public class class664 extends class548 {

    @OriginalMember(owner = "client!dw", name = "nc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field8887 = new Hashtable();

    @OriginalMember(owner = "client!dw", name = "ve", descriptor = "I")
    public int field8999 = 128;

    @OriginalMember(owner = "client!dw", name = "xe", descriptor = "Lci;")
    private class538 field9001 = new class538();

    @OriginalMember(owner = "client!dw", name = "Ae", descriptor = "Ltu;")
    private class480 field9004 = new class480();

    @OriginalMember(owner = "client!dw", name = "Be", descriptor = "Ltu;")
    public class480 field9005 = new class480();

    @OriginalMember(owner = "client!dw", name = "De", descriptor = "Z")
    private boolean field9007 = false;

    @OriginalMember(owner = "client!dw", name = "Ie", descriptor = "I")
    public int field9012 = 8;

    @OriginalMember(owner = "client!dw", name = "He", descriptor = "I")
    public int field9011 = 3;

    @OriginalMember(owner = "client!dw", name = "Fe", descriptor = "Lmba;")
    private class646 field9009 = new class646();

    @OriginalMember(owner = "client!dw", name = "Ke", descriptor = "[Llt;")
    private class620[] field9014 = new class620[4];

    @OriginalMember(owner = "client!dw", name = "Me", descriptor = "[Llt;")
    private class620[] field9016 = new class620[4];

    @OriginalMember(owner = "client!dw", name = "Qe", descriptor = "[Llt;")
    private class620[] field9020 = new class620[4];

    @OriginalMember(owner = "client!dw", name = "Pe", descriptor = "I")
    private int field9019 = -1;

    @OriginalMember(owner = "client!dw", name = "Oe", descriptor = "I")
    private int field9018 = -1;

    @OriginalMember(owner = "client!dw", name = "Re", descriptor = "I")
    private int field9021 = -1;

    @OriginalMember(owner = "client!dw", name = "We", descriptor = "Lmba;")
    private class646 field9026;

    @OriginalMember(owner = "client!dw", name = "Xe", descriptor = "Lmba;")
    private class646 field9027;

    @OriginalMember(owner = "client!dw", name = "Ye", descriptor = "Lmba;")
    private class646 field9028;

    @OriginalMember(owner = "client!dw", name = "Ze", descriptor = "Lmba;")
    private class646 field9029;

    @OriginalMember(owner = "client!dw", name = "af", descriptor = "Lmba;")
    private class646 field9030;

    @OriginalMember(owner = "client!dw", name = "bf", descriptor = "Lmba;")
    private class646 field9031;

    @OriginalMember(owner = "client!dw", name = "cf", descriptor = "Lmba;")
    private class646 field9032;

    @OriginalMember(owner = "client!dw", name = "jf", descriptor = "Ltu;")
    public class480 field9038;

    @OriginalMember(owner = "client!dw", name = "nf", descriptor = "Ltu;")
    public class480 field9042;

    @OriginalMember(owner = "client!dw", name = "of", descriptor = "Ltu;")
    public class480 field9043;

    @OriginalMember(owner = "client!dw", name = "sf", descriptor = "Z")
    private boolean field9047;

    @OriginalMember(owner = "client!dw", name = "Jf", descriptor = "F")
    public float field9064;

    @OriginalMember(owner = "client!dw", name = "uf", descriptor = "I")
    public int field9049;

    @OriginalMember(owner = "client!dw", name = "ag", descriptor = "I")
    private int field9081;

    @OriginalMember(owner = "client!dw", name = "Lf", descriptor = "F")
    public float field9066;

    @OriginalMember(owner = "client!dw", name = "xg", descriptor = "[F")
    public float[] field9104;

    @OriginalMember(owner = "client!dw", name = "qf", descriptor = "I")
    public int field9045;

    @OriginalMember(owner = "client!dw", name = "gg", descriptor = "I")
    public int field9087;

    @OriginalMember(owner = "client!dw", name = "yf", descriptor = "[F")
    private float[] field9053;

    @OriginalMember(owner = "client!dw", name = "Ef", descriptor = "I")
    private int field9059;

    @OriginalMember(owner = "client!dw", name = "Xf", descriptor = "I")
    private int field9078;

    @OriginalMember(owner = "client!dw", name = "sg", descriptor = "I")
    public int field9099;

    @OriginalMember(owner = "client!dw", name = "Bf", descriptor = "I")
    private int field9056;

    @OriginalMember(owner = "client!dw", name = "cg", descriptor = "I")
    private int field9083;

    @OriginalMember(owner = "client!dw", name = "yg", descriptor = "I")
    private int field9105;

    @OriginalMember(owner = "client!dw", name = "Fg", descriptor = "I")
    public int field9112;

    @OriginalMember(owner = "client!dw", name = "Hg", descriptor = "I")
    private int field9114;

    @OriginalMember(owner = "client!dw", name = "Jg", descriptor = "F")
    private float field9116;

    @OriginalMember(owner = "client!dw", name = "dg", descriptor = "I")
    public int field9084;

    @OriginalMember(owner = "client!dw", name = "Rf", descriptor = "I")
    public int field9072;

    @OriginalMember(owner = "client!dw", name = "Vg", descriptor = "I")
    private int field9128;

    @OriginalMember(owner = "client!dw", name = "Gf", descriptor = "F")
    private float field9061;

    @OriginalMember(owner = "client!dw", name = "Xg", descriptor = "F")
    private float field9130;

    @OriginalMember(owner = "client!dw", name = "Rg", descriptor = "I")
    private int field9124;

    @OriginalMember(owner = "client!dw", name = "Wf", descriptor = "F")
    public float field9077;

    @OriginalMember(owner = "client!dw", name = "Ag", descriptor = "F")
    public float field9107;

    @OriginalMember(owner = "client!dw", name = "Vf", descriptor = "I")
    public int field9076;

    @OriginalMember(owner = "client!dw", name = "Zf", descriptor = "F")
    public float field9080;

    @OriginalMember(owner = "client!dw", name = "ah", descriptor = "F")
    private float field9133;

    @OriginalMember(owner = "client!dw", name = "zf", descriptor = "I")
    public int field9054;

    @OriginalMember(owner = "client!dw", name = "Ig", descriptor = "[F")
    private float[] field9115;

    @OriginalMember(owner = "client!dw", name = "Zg", descriptor = "[F")
    private float[] field9132;

    @OriginalMember(owner = "client!dw", name = "rg", descriptor = "[F")
    private float[] field9098;

    @OriginalMember(owner = "client!dw", name = "Sf", descriptor = "[Ltj;")
    private class687[] field9073;

    @OriginalMember(owner = "client!dw", name = "rf", descriptor = "F")
    public float field9046;

    @OriginalMember(owner = "client!dw", name = "gh", descriptor = "F")
    private float field9139;

    @OriginalMember(owner = "client!dw", name = "mh", descriptor = "F")
    public float field9145;

    @OriginalMember(owner = "client!dw", name = "dh", descriptor = "I")
    public int field9136;

    @OriginalMember(owner = "client!dw", name = "qh", descriptor = "Z")
    private boolean field9149;

    @OriginalMember(owner = "client!dw", name = "lh", descriptor = "I")
    private int field9144;

    @OriginalMember(owner = "client!dw", name = "Of", descriptor = "I")
    public int field9069;

    @OriginalMember(owner = "client!dw", name = "Kg", descriptor = "Lbga;")
    public class172 field9117;

    @OriginalMember(owner = "client!dw", name = "wh", descriptor = "[B")
    public byte[] field9155;

    @OriginalMember(owner = "client!dw", name = "yh", descriptor = "[I")
    public int[] field9157;

    @OriginalMember(owner = "client!dw", name = "Ah", descriptor = "[I")
    public int[] field9159;

    @OriginalMember(owner = "client!dw", name = "Bh", descriptor = "[I")
    public int[] field9160;

    @OriginalMember(owner = "client!dw", name = "ue", descriptor = "I")
    public int field8998;

    @OriginalMember(owner = "client!dw", name = "Wd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8974;

    @OriginalMember(owner = "client!dw", name = "fe", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8983;

    @OriginalMember(owner = "client!dw", name = "ec", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field8878;

    @OriginalMember(owner = "client!dw", name = "T", descriptor = "J")
    private long field8815;

    @OriginalMember(owner = "client!dw", name = "H", descriptor = "J")
    private long field8803;

    @OriginalMember(owner = "client!dw", name = "wf", descriptor = "Z")
    public boolean field9051;

    @OriginalMember(owner = "client!dw", name = "fg", descriptor = "I")
    public int field9086;

    @OriginalMember(owner = "client!dw", name = "nh", descriptor = "Ljava/lang/String;")
    private String field9146;

    @OriginalMember(owner = "client!dw", name = "ih", descriptor = "Z")
    public boolean field9141;

    @OriginalMember(owner = "client!dw", name = "hg", descriptor = "Z")
    private boolean field9088;

    @OriginalMember(owner = "client!dw", name = "Yg", descriptor = "Z")
    public boolean field9131;

    @OriginalMember(owner = "client!dw", name = "Cf", descriptor = "Z")
    public boolean field9057;

    @OriginalMember(owner = "client!dw", name = "oh", descriptor = "Z")
    public boolean field9147;

    @OriginalMember(owner = "client!dw", name = "pg", descriptor = "Z")
    private boolean field9096;

    @OriginalMember(owner = "client!dw", name = "fh", descriptor = "Ljava/lang/String;")
    private String field9138;

    @OriginalMember(owner = "client!dw", name = "Bg", descriptor = "Z")
    public boolean field9108;

    @OriginalMember(owner = "client!dw", name = "ph", descriptor = "Z")
    private boolean field9148;

    @OriginalMember(owner = "client!dw", name = "ze", descriptor = "Lgi;")
    private class124 field9003;

    @OriginalMember(owner = "client!dw", name = "Ce", descriptor = "Ldt;")
    public class669 field9006;

    @OriginalMember(owner = "client!dw", name = "se", descriptor = "Lvn;")
    private class428 field8996;

    @OriginalMember(owner = "client!dw", name = "te", descriptor = "Ltaa;")
    private class469 field8997;

    @OriginalMember(owner = "client!dw", name = "re", descriptor = "Leg;")
    private class319 field8995;

    @OriginalMember(owner = "client!dw", name = "ge", descriptor = "J")
    public static long field8984 = -1L;

    @OriginalMember(owner = "client!dw", name = "Hf", descriptor = "F")
    private float field9062;

    @OriginalMember(owner = "client!dw", name = "Kf", descriptor = "F")
    public float field9065;

    @OriginalMember(owner = "client!dw", name = "kg", descriptor = "F")
    public float field9091;

    @OriginalMember(owner = "client!dw", name = "qg", descriptor = "F")
    private float field9097;

    @OriginalMember(owner = "client!dw", name = "tg", descriptor = "F")
    public float field9100;

    @OriginalMember(owner = "client!dw", name = "vg", descriptor = "F")
    public float field9102;

    @OriginalMember(owner = "client!dw", name = "Ng", descriptor = "F")
    public float field9120;

    @OriginalMember(owner = "client!dw", name = "Tg", descriptor = "F")
    private float field9126;

    @OriginalMember(owner = "client!dw", name = "uh", descriptor = "F")
    public float field9153;

    @OriginalMember(owner = "client!dw", name = "x", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!dw", name = "y", descriptor = "I")
    public static int field8794;

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!dw", name = "A", descriptor = "I")
    public static int field8796;

    @OriginalMember(owner = "client!dw", name = "B", descriptor = "I")
    private int field8797;

    @OriginalMember(owner = "client!dw", name = "C", descriptor = "I")
    public static int field8798;

    @OriginalMember(owner = "client!dw", name = "D", descriptor = "I")
    public static int field8799;

    @OriginalMember(owner = "client!dw", name = "E", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!dw", name = "F", descriptor = "I")
    public static int field8801;

    @OriginalMember(owner = "client!dw", name = "G", descriptor = "I")
    public static int field8802;

    @OriginalMember(owner = "client!dw", name = "I", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!dw", name = "J", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!dw", name = "K", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!dw", name = "L", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!dw", name = "M", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!dw", name = "N", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!dw", name = "O", descriptor = "I")
    public static int field8810;

    @OriginalMember(owner = "client!dw", name = "P", descriptor = "I")
    public static int field8811;

    @OriginalMember(owner = "client!dw", name = "Q", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!dw", name = "R", descriptor = "I")
    public static int field8813;

    @OriginalMember(owner = "client!dw", name = "S", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!dw", name = "U", descriptor = "I")
    public static int field8816;

    @OriginalMember(owner = "client!dw", name = "V", descriptor = "I")
    public static int field8817;

    @OriginalMember(owner = "client!dw", name = "W", descriptor = "I")
    public static int field8818;

    @OriginalMember(owner = "client!dw", name = "X", descriptor = "I")
    public static int field8819;

    @OriginalMember(owner = "client!dw", name = "Y", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!dw", name = "Z", descriptor = "I")
    public static int field8821;

    @OriginalMember(owner = "client!dw", name = "ab", descriptor = "I")
    public static int field8822;

    @OriginalMember(owner = "client!dw", name = "bb", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!dw", name = "cb", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!dw", name = "db", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!dw", name = "eb", descriptor = "I")
    public static int field8826;

    @OriginalMember(owner = "client!dw", name = "fb", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!dw", name = "gb", descriptor = "I")
    public int field8828;

    @OriginalMember(owner = "client!dw", name = "hb", descriptor = "I")
    public static int field8829;

    @OriginalMember(owner = "client!dw", name = "ib", descriptor = "I")
    public static int field8830;

    @OriginalMember(owner = "client!dw", name = "jb", descriptor = "I")
    public static int field8831;

    @OriginalMember(owner = "client!dw", name = "kb", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!dw", name = "lb", descriptor = "I")
    public static int field8833;

    @OriginalMember(owner = "client!dw", name = "mb", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!dw", name = "nb", descriptor = "I")
    public static int field8835;

    @OriginalMember(owner = "client!dw", name = "ob", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!dw", name = "pb", descriptor = "I")
    public static int field8837;

    @OriginalMember(owner = "client!dw", name = "qb", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!dw", name = "rb", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!dw", name = "sb", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!dw", name = "tb", descriptor = "I")
    public static int field8841;

    @OriginalMember(owner = "client!dw", name = "ub", descriptor = "I")
    public static int field8842;

    @OriginalMember(owner = "client!dw", name = "vb", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!dw", name = "wb", descriptor = "I")
    public static int field8844;

    @OriginalMember(owner = "client!dw", name = "xb", descriptor = "I")
    public static int field8845;

    @OriginalMember(owner = "client!dw", name = "yb", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!dw", name = "zb", descriptor = "I")
    public static int field8847;

    @OriginalMember(owner = "client!dw", name = "Ab", descriptor = "I")
    public static int field8848;

    @OriginalMember(owner = "client!dw", name = "Bb", descriptor = "I")
    public static int field8849;

    @OriginalMember(owner = "client!dw", name = "Cb", descriptor = "I")
    public static int field8850;

    @OriginalMember(owner = "client!dw", name = "Db", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!dw", name = "Eb", descriptor = "I")
    public static int field8852;

    @OriginalMember(owner = "client!dw", name = "Fb", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!dw", name = "Gb", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!dw", name = "Hb", descriptor = "I")
    public static int field8855;

    @OriginalMember(owner = "client!dw", name = "Ib", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!dw", name = "Jb", descriptor = "I")
    public static int field8857;

    @OriginalMember(owner = "client!dw", name = "Kb", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!dw", name = "Lb", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!dw", name = "Mb", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!dw", name = "Nb", descriptor = "I")
    public static int field8861;

    @OriginalMember(owner = "client!dw", name = "Ob", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!dw", name = "Pb", descriptor = "I")
    public static int field8863;

    @OriginalMember(owner = "client!dw", name = "Qb", descriptor = "I")
    public static int field8864;

    @OriginalMember(owner = "client!dw", name = "Rb", descriptor = "I")
    private int field8865;

    @OriginalMember(owner = "client!dw", name = "Sb", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!dw", name = "Tb", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!dw", name = "Ub", descriptor = "I")
    public static int field8868;

    @OriginalMember(owner = "client!dw", name = "Vb", descriptor = "I")
    public static int field8869;

    @OriginalMember(owner = "client!dw", name = "Wb", descriptor = "I")
    public static int field8870;

    @OriginalMember(owner = "client!dw", name = "Xb", descriptor = "I")
    public static int field8871;

    @OriginalMember(owner = "client!dw", name = "Yb", descriptor = "I")
    public static int field8872;

    @OriginalMember(owner = "client!dw", name = "Zb", descriptor = "I")
    public static int field8873;

    @OriginalMember(owner = "client!dw", name = "ac", descriptor = "I")
    public static int field8874;

    @OriginalMember(owner = "client!dw", name = "bc", descriptor = "I")
    public static int field8875;

    @OriginalMember(owner = "client!dw", name = "cc", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!dw", name = "dc", descriptor = "I")
    public static int field8877;

    @OriginalMember(owner = "client!dw", name = "fc", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!dw", name = "gc", descriptor = "I")
    public static int field8880;

    @OriginalMember(owner = "client!dw", name = "hc", descriptor = "I")
    public static int field8881;

    @OriginalMember(owner = "client!dw", name = "ic", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!dw", name = "jc", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!dw", name = "kc", descriptor = "I")
    public static int field8884;

    @OriginalMember(owner = "client!dw", name = "lc", descriptor = "I")
    public static int field8885;

    @OriginalMember(owner = "client!dw", name = "mc", descriptor = "I")
    public static int field8886;

    @OriginalMember(owner = "client!dw", name = "oc", descriptor = "I")
    public static int field8888;

    @OriginalMember(owner = "client!dw", name = "pc", descriptor = "I")
    public static int field8889;

    @OriginalMember(owner = "client!dw", name = "qc", descriptor = "I")
    public static int field8890;

    @OriginalMember(owner = "client!dw", name = "rc", descriptor = "I")
    public static int field8891;

    @OriginalMember(owner = "client!dw", name = "sc", descriptor = "I")
    public static int field8892;

    @OriginalMember(owner = "client!dw", name = "tc", descriptor = "I")
    public static int field8893;

    @OriginalMember(owner = "client!dw", name = "uc", descriptor = "I")
    public static int field8894;

    @OriginalMember(owner = "client!dw", name = "vc", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!dw", name = "wc", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!dw", name = "xc", descriptor = "I")
    public static int field8897;

    @OriginalMember(owner = "client!dw", name = "yc", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!dw", name = "zc", descriptor = "I")
    public static int field8899;

    @OriginalMember(owner = "client!dw", name = "Ac", descriptor = "I")
    public static int field8900;

    @OriginalMember(owner = "client!dw", name = "Bc", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!dw", name = "Cc", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!dw", name = "Dc", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!dw", name = "Ec", descriptor = "I")
    public static int field8904;

    @OriginalMember(owner = "client!dw", name = "Fc", descriptor = "I")
    public static int field8905;

    @OriginalMember(owner = "client!dw", name = "Gc", descriptor = "I")
    public static int field8906;

    @OriginalMember(owner = "client!dw", name = "Hc", descriptor = "I")
    public static int field8907;

    @OriginalMember(owner = "client!dw", name = "Ic", descriptor = "I")
    public static int field8908;

    @OriginalMember(owner = "client!dw", name = "Jc", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!dw", name = "Kc", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!dw", name = "Lc", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!dw", name = "Mc", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!dw", name = "Nc", descriptor = "I")
    public static int field8913;

    @OriginalMember(owner = "client!dw", name = "Pc", descriptor = "I")
    public static int field8915;

    @OriginalMember(owner = "client!dw", name = "Qc", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!dw", name = "Rc", descriptor = "I")
    public static int field8917;

    @OriginalMember(owner = "client!dw", name = "Sc", descriptor = "I")
    public static int field8918;

    @OriginalMember(owner = "client!dw", name = "Uc", descriptor = "I")
    public static int field8920;

    @OriginalMember(owner = "client!dw", name = "Vc", descriptor = "I")
    public static int field8921;

    @OriginalMember(owner = "client!dw", name = "Wc", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!dw", name = "Xc", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!dw", name = "Yc", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!dw", name = "Zc", descriptor = "I")
    public static int field8925;

    @OriginalMember(owner = "client!dw", name = "ad", descriptor = "I")
    public static int field8926;

    @OriginalMember(owner = "client!dw", name = "bd", descriptor = "I")
    public static int field8927;

    @OriginalMember(owner = "client!dw", name = "cd", descriptor = "I")
    public static int field8928;

    @OriginalMember(owner = "client!dw", name = "dd", descriptor = "I")
    public static int field8929;

    @OriginalMember(owner = "client!dw", name = "ed", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!dw", name = "fd", descriptor = "I")
    public static int field8931;

    @OriginalMember(owner = "client!dw", name = "gd", descriptor = "I")
    public static int field8932;

    @OriginalMember(owner = "client!dw", name = "hd", descriptor = "I")
    public static int field8933;

    @OriginalMember(owner = "client!dw", name = "id", descriptor = "I")
    public static int field8934;

    @OriginalMember(owner = "client!dw", name = "jd", descriptor = "I")
    public static int field8935;

    @OriginalMember(owner = "client!dw", name = "kd", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!dw", name = "ld", descriptor = "I")
    public static int field8937;

    @OriginalMember(owner = "client!dw", name = "md", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!dw", name = "nd", descriptor = "I")
    public static int field8939;

    @OriginalMember(owner = "client!dw", name = "od", descriptor = "I")
    public static int field8940;

    @OriginalMember(owner = "client!dw", name = "pd", descriptor = "I")
    public static int field8941;

    @OriginalMember(owner = "client!dw", name = "qd", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!dw", name = "rd", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!dw", name = "sd", descriptor = "I")
    public static int field8944;

    @OriginalMember(owner = "client!dw", name = "td", descriptor = "I")
    public static int field8945;

    @OriginalMember(owner = "client!dw", name = "ud", descriptor = "I")
    public static int field8946;

    @OriginalMember(owner = "client!dw", name = "vd", descriptor = "I")
    public static int field8947;

    @OriginalMember(owner = "client!dw", name = "wd", descriptor = "I")
    public static int field8948;

    @OriginalMember(owner = "client!dw", name = "xd", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!dw", name = "yd", descriptor = "I")
    public static int field8950;

    @OriginalMember(owner = "client!dw", name = "zd", descriptor = "I")
    public static int field8951;

    @OriginalMember(owner = "client!dw", name = "Ad", descriptor = "I")
    public static int field8952;

    @OriginalMember(owner = "client!dw", name = "Bd", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!dw", name = "Cd", descriptor = "I")
    public static int field8954;

    @OriginalMember(owner = "client!dw", name = "Dd", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!dw", name = "Ed", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!dw", name = "Fd", descriptor = "I")
    public static int field8957;

    @OriginalMember(owner = "client!dw", name = "Gd", descriptor = "I")
    public static int field8958;

    @OriginalMember(owner = "client!dw", name = "Hd", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!dw", name = "Id", descriptor = "I")
    public static int field8960;

    @OriginalMember(owner = "client!dw", name = "Jd", descriptor = "I")
    public static int field8961;

    @OriginalMember(owner = "client!dw", name = "Kd", descriptor = "I")
    public static int field8962;

    @OriginalMember(owner = "client!dw", name = "Ld", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!dw", name = "Md", descriptor = "I")
    public static int field8964;

    @OriginalMember(owner = "client!dw", name = "Nd", descriptor = "I")
    public static int field8965;

    @OriginalMember(owner = "client!dw", name = "Od", descriptor = "I")
    public static int field8966;

    @OriginalMember(owner = "client!dw", name = "Pd", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!dw", name = "Qd", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!dw", name = "Rd", descriptor = "I")
    public static int field8969;

    @OriginalMember(owner = "client!dw", name = "Sd", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!dw", name = "Td", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!dw", name = "Ud", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!dw", name = "Vd", descriptor = "I")
    public static int field8973;

    @OriginalMember(owner = "client!dw", name = "Xd", descriptor = "I")
    public static int field8975;

    @OriginalMember(owner = "client!dw", name = "Yd", descriptor = "I")
    public static int field8976;

    @OriginalMember(owner = "client!dw", name = "Zd", descriptor = "I")
    public static int field8977;

    @OriginalMember(owner = "client!dw", name = "ae", descriptor = "I")
    public static int field8978;

    @OriginalMember(owner = "client!dw", name = "be", descriptor = "I")
    public static int field8979;

    @OriginalMember(owner = "client!dw", name = "ce", descriptor = "I")
    public static int field8980;

    @OriginalMember(owner = "client!dw", name = "de", descriptor = "I")
    public static int field8981;

    @OriginalMember(owner = "client!dw", name = "ee", descriptor = "I")
    public static int field8982;

    @OriginalMember(owner = "client!dw", name = "he", descriptor = "I")
    public static int field8985;

    @OriginalMember(owner = "client!dw", name = "ie", descriptor = "I")
    public int field8986;

    @OriginalMember(owner = "client!dw", name = "je", descriptor = "I")
    public static int field8987;

    @OriginalMember(owner = "client!dw", name = "ke", descriptor = "I")
    public static int field8988;

    @OriginalMember(owner = "client!dw", name = "le", descriptor = "I")
    public static int field8989;

    @OriginalMember(owner = "client!dw", name = "me", descriptor = "I")
    public static int field8990;

    @OriginalMember(owner = "client!dw", name = "ne", descriptor = "I")
    public static int field8991;

    @OriginalMember(owner = "client!dw", name = "oe", descriptor = "I")
    public static int field8992;

    @OriginalMember(owner = "client!dw", name = "pe", descriptor = "I")
    public static int field8993;

    @OriginalMember(owner = "client!dw", name = "qe", descriptor = "I")
    public static int field8994;

    @OriginalMember(owner = "client!dw", name = "we", descriptor = "I")
    public static int field9000;

    @OriginalMember(owner = "client!dw", name = "ye", descriptor = "I")
    public static int field9002;

    @OriginalMember(owner = "client!dw", name = "Ee", descriptor = "I")
    public int field9008;

    @OriginalMember(owner = "client!dw", name = "Te", descriptor = "I")
    private int field9023;

    @OriginalMember(owner = "client!dw", name = "Ue", descriptor = "I")
    public int field9024;

    @OriginalMember(owner = "client!dw", name = "Ve", descriptor = "I")
    public int field9025;

    @OriginalMember(owner = "client!dw", name = "gf", descriptor = "I")
    private int field9036;

    @OriginalMember(owner = "client!dw", name = "kf", descriptor = "I")
    private int field9039;

    @OriginalMember(owner = "client!dw", name = "lf", descriptor = "I")
    private int field9040;

    @OriginalMember(owner = "client!dw", name = "Pf", descriptor = "I")
    private int field9070;

    @OriginalMember(owner = "client!dw", name = "jg", descriptor = "I")
    public int field9090;

    @OriginalMember(owner = "client!dw", name = "ng", descriptor = "I")
    private int field9094;

    @OriginalMember(owner = "client!dw", name = "zg", descriptor = "I")
    private int field9106;

    @OriginalMember(owner = "client!dw", name = "Cg", descriptor = "I")
    private int field9109;

    @OriginalMember(owner = "client!dw", name = "Lg", descriptor = "I")
    public int field9118;

    @OriginalMember(owner = "client!dw", name = "Og", descriptor = "I")
    private int field9121;

    @OriginalMember(owner = "client!dw", name = "Pg", descriptor = "I")
    public int field9122;

    @OriginalMember(owner = "client!dw", name = "bh", descriptor = "I")
    public int field9134;

    @OriginalMember(owner = "client!dw", name = "eh", descriptor = "I")
    private int field9137;

    @OriginalMember(owner = "client!dw", name = "kh", descriptor = "I")
    private int field9143;

    @OriginalMember(owner = "client!dw", name = "th", descriptor = "I")
    private int field9152;

    @OriginalMember(owner = "client!dw", name = "xh", descriptor = "I")
    private int field9156;

    @OriginalMember(owner = "client!dw", name = "zh", descriptor = "I")
    private int field9158;

    @OriginalMember(owner = "client!dw", name = "hf", descriptor = "J")
    private long field9037;

    @OriginalMember(owner = "client!dw", name = "Oc", descriptor = "Ljg;")
    public static class246 field8914;

    @OriginalMember(owner = "client!dw", name = "bg", descriptor = "Lfba;")
    public class350 field9082;

    @OriginalMember(owner = "client!dw", name = "pf", descriptor = "Ldn;")
    public class378 field9044;

    @OriginalMember(owner = "client!dw", name = "tf", descriptor = "Ldn;")
    public class378 field9048;

    @OriginalMember(owner = "client!dw", name = "vf", descriptor = "Ldn;")
    public class378 field9050;

    @OriginalMember(owner = "client!dw", name = "xf", descriptor = "Ldn;")
    public class378 field9052;

    @OriginalMember(owner = "client!dw", name = "If", descriptor = "Ldn;")
    public class378 field9063;

    @OriginalMember(owner = "client!dw", name = "Nf", descriptor = "Ldn;")
    public class378 field9068;

    @OriginalMember(owner = "client!dw", name = "Yf", descriptor = "Ldn;")
    public class378 field9079;

    @OriginalMember(owner = "client!dw", name = "og", descriptor = "Ldn;")
    public class378 field9095;

    @OriginalMember(owner = "client!dw", name = "wg", descriptor = "Ldn;")
    public class378 field9103;

    @OriginalMember(owner = "client!dw", name = "rh", descriptor = "Ldn;")
    public class378 field9150;

    @OriginalMember(owner = "client!dw", name = "lg", descriptor = "Lpa;")
    private class399 field9092;

    @OriginalMember(owner = "client!dw", name = "Tf", descriptor = "Lbia;")
    private class411 field9074;

    @OriginalMember(owner = "client!dw", name = "ig", descriptor = "Lbia;")
    private class411 field9089;

    @OriginalMember(owner = "client!dw", name = "eg", descriptor = "Lss;")
    public class509 field9085;

    @OriginalMember(owner = "client!dw", name = "jh", descriptor = "Lss;")
    public class509 field9142;

    @OriginalMember(owner = "client!dw", name = "Le", descriptor = "Llt;")
    private class620 field9015;

    @OriginalMember(owner = "client!dw", name = "Ne", descriptor = "Llt;")
    private class620 field9017;

    @OriginalMember(owner = "client!dw", name = "Tc", descriptor = "Ljh;")
    public static class627 field8919;

    @OriginalMember(owner = "client!dw", name = "Je", descriptor = "Leba;")
    private class665 field9013;

    @OriginalMember(owner = "client!dw", name = "Eg", descriptor = "Leba;")
    public class665 field9111;

    @OriginalMember(owner = "client!dw", name = "mg", descriptor = "Lgv;")
    private class702 field9093;

    @OriginalMember(owner = "client!dw", name = "Se", descriptor = "Lgba;")
    private class705 field9022;

    @OriginalMember(owner = "client!dw", name = "sh", descriptor = "Lpaa;")
    private class715 field9151;

    @OriginalMember(owner = "client!dw", name = "Ge", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field9010;

    @OriginalMember(owner = "client!dw", name = "df", descriptor = "Z")
    private boolean field9033;

    @OriginalMember(owner = "client!dw", name = "ef", descriptor = "Z")
    private boolean field9034;

    @OriginalMember(owner = "client!dw", name = "ff", descriptor = "Z")
    private boolean field9035;

    @OriginalMember(owner = "client!dw", name = "mf", descriptor = "Z")
    private boolean field9041;

    @OriginalMember(owner = "client!dw", name = "Af", descriptor = "Z")
    public boolean field9055;

    @OriginalMember(owner = "client!dw", name = "Df", descriptor = "Z")
    public boolean field9058;

    @OriginalMember(owner = "client!dw", name = "Ff", descriptor = "Z")
    public boolean field9060;

    @OriginalMember(owner = "client!dw", name = "Mf", descriptor = "Z")
    private boolean field9067;

    @OriginalMember(owner = "client!dw", name = "Qf", descriptor = "Z")
    public boolean field9071;

    @OriginalMember(owner = "client!dw", name = "Uf", descriptor = "Z")
    private boolean field9075;

    @OriginalMember(owner = "client!dw", name = "ug", descriptor = "Z")
    private boolean field9101;

    @OriginalMember(owner = "client!dw", name = "Dg", descriptor = "Z")
    public boolean field9110;

    @OriginalMember(owner = "client!dw", name = "Gg", descriptor = "Z")
    public boolean field9113;

    @OriginalMember(owner = "client!dw", name = "Mg", descriptor = "Z")
    private boolean field9119;

    @OriginalMember(owner = "client!dw", name = "Qg", descriptor = "Z")
    public boolean field9123;

    @OriginalMember(owner = "client!dw", name = "Sg", descriptor = "Z")
    private boolean field9125;

    @OriginalMember(owner = "client!dw", name = "Ug", descriptor = "Z")
    public boolean field9127;

    @OriginalMember(owner = "client!dw", name = "Wg", descriptor = "Z")
    private boolean field9129;

    @OriginalMember(owner = "client!dw", name = "ch", descriptor = "Z")
    private boolean field9135;

    @OriginalMember(owner = "client!dw", name = "vh", descriptor = "Z")
    public boolean field9154;

    @OriginalMember(owner = "client!dw", name = "hh", descriptor = "[Lwu;")
    private class559[] field9140;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "(I)V")
    private final void method3670(int arg0) {
        if (arg0 != 875) {
            this.method3678(-46);
        }
        ++field8825;
        if (this.field9075 && this.field9136 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!dw", name = "I", descriptor = "()I")
    public final int method277() {
        ++field8973;
        int var1 = this.field9156;
        this.field9156 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lhe;)V")
    public final void method1391(class577 arg0) {
        this.field9151 = (class715) arg0;
        ++field8847;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "([I)V")
    public final void method1483(int[] arg0) {
        arg0[0] = this.field8828;
        ++field8939;
        arg0[1] = this.field8986;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILjaclib/memory/Buffer;ZII)Lbia;")
    public final class411 method3671(int arg0, Buffer arg1, boolean arg2, int arg3, int arg4) {
        ++field8833;
        if (arg3 != 1) {
            this.method1449(8, -20, 98, -67, -121, 126, (byte[]) null, 63, 98);
        }
        return (class411) (!this.field9088 || arg2 && !this.field9096 ? new class118(this, arg0, arg1) : new class487(this, arg0, arg1, arg4, arg2));
    }

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "(B)V")
    public final void method3672(byte arg0) {
        if (this.field9039 != 4) {
            this.method3682(arg0 + 15);
            this.method3703(true, false);
            this.method3680((byte) 106, false);
            this.method3707((byte) -123, false);
            this.method3684(false, -32);
            this.method3709((byte) -67, -2);
            this.method3737(0, 1);
            this.field9039 = 4;
        }
        ++field8824;
        if (arg0 != -101) {
            this.method1539(-101);
        }
    }

    @OriginalMember(owner = "client!dw", name = "ya", descriptor = "()V")
    public final void method346() {
        this.method3684(true, -32);
        ++field8876;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!dw", name = "p", descriptor = "()Z")
    public final boolean method1446() {
        ++field8947;
        return this.field8997 != null && (this.field8998 <= 1 || this.field9129);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
    public final void method1540(int arg0) {
        this.method3747((byte) -100);
        ++field8837;
    }

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "(B)V")
    private final void method3673(byte arg0) {
        ++field8882;
        float[] var2 = this.field9132;
        float var3 = (float) (-this.field9112 * this.field9076) / (float) this.field9072;
        if (arg0 != -3) {
            this.field9010 = null;
        }
        float var4 = (float) ((-this.field9112 + this.field8828) * this.field9076) / (float) this.field9072;
        float var5 = (float) (this.field9076 * this.field9054) / (float) this.field9087;
        float var6 = (float) ((this.field9054 - this.field8986) * this.field9076) / (float) this.field9087;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field9076 * 2.0F;
            var2[3] = 0.0F;
            var2[2] = 0.0F;
            var2[12] = 0.0F;
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[14] = this.field9097 = -((float) this.field9114 * var7) / (float) (this.field9114 - this.field9076);
            var2[6] = 0.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[0] = var7 / (var4 - var3);
            var2[11] = -1.0F;
            var2[7] = 0.0F;
            var2[4] = 0.0F;
            var2[15] = 0.0F;
            var2[10] = this.field9062 = (float) (-(this.field9114 + this.field9076)) / (float) (-this.field9076 + this.field9114);
            var2[13] = 0.0F;
            var2[1] = 0.0F;
            var2[5] = var7 / (-var6 + var5);
        } else {
            var2[12] = 0.0F;
            var2[6] = 0.0F;
            var2[3] = 0.0F;
            var2[8] = 0.0F;
            var2[14] = 0.0F;
            var2[9] = 0.0F;
            var2[10] = 1.0F;
            var2[15] = 1.0F;
            var2[0] = 1.0F;
            var2[11] = 0.0F;
            var2[13] = 0.0F;
            var2[7] = 0.0F;
            var2[5] = 1.0F;
            var2[1] = 0.0F;
            var2[4] = 0.0F;
            var2[2] = 0.0F;
        }
        this.method3742(34162);
    }

    @OriginalMember(owner = "client!dw", name = "H", descriptor = "(III[I)V")
    public final void method1424(int arg0, int arg1, int arg2, int[] arg3) {
        ++field8843;
        float var5 = (float) arg2 * this.field9038.field6673 + (float) arg0 * this.field9038.field6692 + (float) arg1 * this.field9038.field6670 + this.field9038.field6700;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field9038.field6697 + (float) arg0 * this.field9038.field6696 + (float) arg1 * this.field9038.field6704 + this.field9038.field6702) * (float) this.field9072 / var5);
            int var7 = (int) (((float) arg2 * this.field9038.field6705 + (float) arg0 * this.field9038.field6669 + (float) arg1 * this.field9038.field6689 + this.field9038.field6681) * (float) this.field9087 / var5);
            arg3[0] = (int) ((float) var6 + -this.field9120);
            arg3[2] = (int) var5;
            arg3[1] = (int) ((float) var7 - this.field9153);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class341 method1542(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field8910;
        return new class485(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "(I)V")
    private final void method3674(int arg0) {
        if (arg0 >= -36) {
            this.method3687(false, 26, (byte[]) null, -105, 79);
        }
        this.field9126 = (float) (-this.field9099 + this.field9114) - this.field9133;
        ++field8836;
        this.field9100 = -((float) this.field9136 * this.field9116) + this.field9126;
        if ((float) this.field9076 > this.field9100) {
            this.field9100 = (float) this.field9076;
        }
        OpenGL.glFogf(2915, this.field9100);
        OpenGL.glFogf(2916, this.field9126);
        class474.field6613[1] = (float) class665.method3759(65280, this.field9045) / 65280.0F;
        class474.field6613[2] = (float) class665.method3759(this.field9045, 255) / 255.0F;
        class474.field6613[0] = (float) class665.method3759(16711680, this.field9045) / 1.671168E7F;
        OpenGL.glFogfv(2918, class474.field6613, 0);
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(IIZ)V")
    public final synchronized void method3675(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field9070 = -24;
        }
        ++field8901;
        class27 var4 = new class27(arg1);
        var4.field1079 = (long) arg0;
        this.field9028.method3610(9289, var4);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method1535(Canvas arg0, int arg1, int arg2) {
        ++field8850;
        if (this.field8974 == arg0) {
            throw new RuntimeException();
        } else if (!this.field8887.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field8878.prepareSurface(arg0);
                if (var6 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field8887.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)V")
    public final void method1445(int arg0) {
        ++field8970;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIIF)Ltj;")
    public final class687 method1476(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field8863;
        return new class625(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "()Z")
    public final boolean method1472() {
        ++field8907;
        return false;
    }

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "()V")
    public final void method1513() {
        ++field8905;
    }

    @OriginalMember(owner = "client!dw", name = "da", descriptor = "(III[I)V")
    public final void method1486(int arg0, int arg1, int arg2, int[] arg3) {
        ++field8879;
        float var5 = (float) arg2 * this.field9038.field6673 + (float) arg0 * this.field9038.field6692 + (float) arg1 * this.field9038.field6670 + this.field9038.field6700;
        if (!((float) this.field9076 > var5) && !((float) this.field9114 < var5)) {
            int var6 = (int) (((float) arg2 * this.field9038.field6697 + (float) arg0 * this.field9038.field6696 + (float) arg1 * this.field9038.field6704 + this.field9038.field6702) * (float) this.field9072 / var5);
            int var7 = (int) (((float) arg2 * this.field9038.field6705 + (float) arg0 * this.field9038.field6669 + (float) arg1 * this.field9038.field6689 + this.field9038.field6681) * (float) this.field9087 / var5);
            if ((float) var6 >= this.field9120 && this.field9102 >= (float) var6 && this.field9153 <= (float) var7 && this.field9065 >= (float) var7) {
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 - this.field9120);
                arg3[1] = (int) ((float) var7 - this.field9153);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!dw", name = "o", descriptor = "()I")
    public final int method1481() {
        ++field8985;
        return 4;
    }

    @OriginalMember(owner = "client!dw", name = "q", descriptor = "()V")
    public final void method281() {
        ++field8960;
        if (this.field9148 && ~this.field8828 < -1 && this.field8986 > 0) {
            int var1 = this.field9056;
            int var2 = this.field9144;
            int var3 = this.field9081;
            int var4 = this.field9124;
            this.method1437();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3714(-32);
            this.method3703(true, false);
            this.method3680((byte) 106, false);
            this.method3707((byte) 124, false);
            this.method3684(false, -32);
            this.method3681((class559) null, 0);
            this.method3709((byte) -102, -2);
            this.method3720(-26014, 1);
            this.method3737(0, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field8828, this.field8986, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method1544(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lik;)V")
    public final void method1413(class100 arg0) {
        this.field9001.method3188(7216, this, -1, arg0);
        ++field8832;
    }

    @OriginalMember(owner = "client!dw", name = "XA", descriptor = "()I")
    public final int method1504() {
        ++field8954;
        return this.field9114;
    }

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "(I)Lifa;")
    public final class413 method3676(int arg0) {
        ++field8838;
        if (arg0 != 8) {
            return null;
        } else {
            return this.field9151 != null ? this.field9151.method1148(arg0 ^ 8) : null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "(II)I")
    public final int method3677(int arg0, int arg1) {
        if (arg1 != 3283) {
            this.field9105 = 49;
        }
        ++field8816;
        if (arg0 != 6406 && ~arg0 != -6410) {
            if (~arg0 != -6411 && arg0 != 34846 && ~arg0 != -34845) {
                if (arg0 == 6407) {
                    return 3;
                } else if (arg0 != 6408 && arg0 != 34847) {
                    if (arg0 != 34843) {
                        if (arg0 == 34842) {
                            return 8;
                        } else if (arg0 != 6402) {
                            if (arg0 == 6401) {
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

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1451(Canvas arg0) {
        this.field8983 = null;
        ++field8804;
        this.field8803 = 0L;
        if (arg0 != null && this.field8974 != arg0) {
            if (this.field8887.containsKey(arg0)) {
                Long var2 = (Long) this.field8887.get(arg0);
                this.field8803 = var2;
                this.field8983 = arg0;
            }
        } else {
            this.field8803 = this.field8815;
            this.field8983 = this.field8974;
        }
        if (this.field8983 != null && ~this.field8803 != -1L) {
            this.field8878.setSurface(this.field8803);
            this.method3689(0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dw", name = "U", descriptor = "(IIIII)V")
    public final void method1487(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8891;
        this.method3683(5121);
        this.method3737(0, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Loia;Z)Lfd;")
    public final class298 method1496(class52 arg0, boolean arg1) {
        ++field8822;
        int[] var3 = new int[arg0.field767 * arg0.field766];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field759 == null) {
            for (int var6 = 0; arg0.field766 > var6; ++var6) {
                for (int var7 = 0; ~var7 > ~arg0.field767; ++var7) {
                    int var8 = arg0.field760[255 & arg0.field763[var4++]];
                    var3[var5++] = ~var8 == -1 ? 0 : class678.method3817(var8, -16777216);
                }
            }
        } else {
            for (int var9 = 0; ~arg0.field766 < ~var9; ++var9) {
                for (int var11 = 0; arg0.field767 > var11; ++var11) {
                    var3[var5++] = class678.method3817(arg0.field760[class665.method3759(arg0.field763[var4], 255)], arg0.field759[var4] << 24);
                    ++var4;
                }
            }
        }
        class298 var10 = this.method3244(arg0.field766, var3, (byte) -103, arg0.field767, 0, arg0.field767);
        var10.method1953(arg0.field765, arg0.field761, arg0.field762, arg0.field764);
        return var10;
    }

    @OriginalMember(owner = "client!dw", name = "GA", descriptor = "(I)V")
    public final void method273(int arg0) {
        ++field8894;
        this.method3737(0, 0);
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!dw", name = "Y", descriptor = "()[I")
    public final int[] method1407() {
        ++field8990;
        return new int[] { this.field9112, this.field9054, this.field9072, this.field9087 };
    }

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "(I)V")
    private final void method3678(int arg0) {
        ++field8818;
        float var2 = (float) (-this.field9112) * this.field9061 / (float) this.field9072;
        float var3 = (float) (-this.field9054) * this.field9061 / (float) this.field9087;
        float var4 = (float) (this.field8828 - this.field9112) * this.field9061 / (float) this.field9072;
        float var5 = (float) (-this.field9054 + this.field8986) * this.field9061 / (float) this.field9087;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field9076, (double) this.field9114);
        }
        OpenGL.glMatrixMode(arg0);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IZZZ)V")
    public final void method3679(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        ++field8871;
        if (~this.field9109 != ~arg0 || !this.field9113 == this.field9047) {
            class350 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field9113 ? 0 : 3;
            if (~arg0 > -1) {
                this.method3713((byte) -112);
            } else {
                var5 = this.field9003.method775(arg0, 124);
                class239 var10 = super.field7623.method521(arg0, 111);
                if (~var10.field3579 == -1 && ~var10.field3573 == -1) {
                    this.method3713((byte) -76);
                } else {
                    int var11 = var10.field3556 ? 64 : 128;
                    int var12 = var11 * 50;
                    this.method3708(0, (float) (this.field9008 % var12 * var10.field3579) / (float) var12, 0.0F, (float) (this.field9008 % var12 * var10.field3573) / (float) var12);
                }
                if (!this.field9113) {
                    var8 = var10.field3565;
                    var9 = var10.field3561;
                    var7 = var10.field3567;
                }
                var6 = var10.field3564;
            }
            this.field8995.method2060(var8, var9, arg2, var7, arg1, -10);
            if (!this.field8995.method2064(var6, 100, var5)) {
                this.method3681(var5, 0);
                this.method3720(-26014, var6);
            }
            this.field9109 = arg0;
            this.field9047 = this.field9113;
        }
        this.field9039 &= -8;
        if (!arg3) {
            this.field9006 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "v", descriptor = "()Lih;")
    public final class744 method1495() {
        ++field8888;
        return new class480();
    }

    @OriginalMember(owner = "client!dw", name = "w", descriptor = "()Z")
    public final boolean method1441() {
        ++field8899;
        return this.field9067 && (!this.method289() || this.field9129);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(BZ)V")
    public final void method3680(byte arg0, boolean arg1) {
        if (arg0 != 106) {
            this.method346();
        }
        ++field8895;
        if (arg1 == !this.field9101) {
            this.field9101 = arg1;
            this.method3743((byte) 118);
            this.field9039 &= -8;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lwu;I)V")
    public final void method3681(class559 arg0, int arg1) {
        if (arg1 != 0) {
            this.field9015 = null;
        }
        ++field8966;
        class559 var3 = this.field9140[this.field9070];
        if (arg0 != var3) {
            if (arg0 != null) {
                if (var3 == null) {
                    OpenGL.glEnable(arg0.field7768);
                } else if (~arg0.field7768 != ~var3.field7768) {
                    OpenGL.glDisable(var3.field7768);
                    OpenGL.glEnable(arg0.field7768);
                }
                OpenGL.glBindTexture(arg0.field7768, arg0.method3286(-28451));
            } else {
                OpenGL.glDisable(var3.field7768);
            }
            this.field9140[this.field9070] = arg0;
        }
        this.field9039 &= -2;
    }

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "(I)V")
    private final void method3682(int arg0) {
        if (arg0 <= -26) {
            if (~this.field9143 != -2) {
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadIdentity();
                if (this.field8828 > 0 && ~this.field8986 < -1) {
                    OpenGL.glOrtho(0.0D, (double) this.field8828, (double) this.field8986, 0.0D, -1.0D, 1.0D);
                }
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadIdentity();
                this.field9039 &= -25;
                this.field9143 = 1;
            }
            ++field8799;
        }
    }

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "(I)V")
    private final void method3683(int arg0) {
        if (~this.field9039 != -2) {
            this.method3682(-45);
            this.method3703(true, false);
            this.method3680((byte) 106, false);
            this.method3707((byte) -111, false);
            this.method3684(false, -32);
            this.method3681((class559) null, 0);
            this.method3709((byte) -88, -2);
            this.method3720(-26014, 1);
            this.field9039 = 1;
        }
        if (arg0 != 5121) {
            this.field8998 = 54;
        }
        ++field8938;
    }

    @OriginalMember(owner = "client!dw", name = "aa", descriptor = "(IIIIII)V")
    public final void method1412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8867;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method3683(5121);
        this.method3737(0, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field9067) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field9067) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!dw", name = "A", descriptor = "(ILaa;II)V")
    public final void method1402(int arg0, class573 arg1, int arg2, int arg3) {
        ++field8862;
        class444 var5 = (class444) arg1;
        class702 var6 = var5.field6165;
        this.method3712(0);
        this.method3681(var5.field6165, 0);
        this.method3737(0, 1);
        this.method3729((byte) 95, 7681, 8448);
        this.method3718(34167, 106, 768, 0);
        float var7 = var6.field9791 / (float) var6.field9781;
        float var8 = var6.field9782 / (float) var6.field9793;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field9056) * var7, (float) (-arg3 + this.field9081) * var8);
        OpenGL.glVertex2i(this.field9056, this.field9081);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field9056) * var7, (float) (-arg3 + this.field9124) * var8);
        OpenGL.glVertex2i(this.field9056, this.field9124);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field9144) * var7, (float) (-arg3 + this.field9124) * var8);
        OpenGL.glVertex2i(this.field9144, this.field9124);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field9144) * var7, (float) (-arg3 + this.field9081) * var8);
        OpenGL.glVertex2i(this.field9144, this.field9081);
        OpenGL.glEnd();
        this.method3718(5890, 114, 768, 0);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZI)V")
    public final void method3684(boolean arg0, int arg1) {
        if (arg1 != -32) {
            this.field9063 = null;
        }
        ++field8946;
        if (this.field9034 == !arg0) {
            this.field9034 = arg0;
            this.method3698(arg1 + -74);
            this.field9039 &= -32;
        }
    }

    @OriginalMember(owner = "client!dw", name = "t", descriptor = "()V")
    public final void method278() {
        ++field8978;
        if (this.field8997 != null && this.field8997.method1323(1)) {
            this.field8996.method2652(0, this.field8997);
            this.field9003.method774((byte) -127);
        }
    }

    @OriginalMember(owner = "client!dw", name = "ra", descriptor = "(IIII)V")
    public final void method1411(int arg0, int arg1, int arg2, int arg3) {
        ++field8839;
        this.field9113 = true;
        this.field9069 = arg1;
        this.field9084 = arg2;
        this.field9049 = arg3;
        this.field9122 = arg0;
    }

    @OriginalMember(owner = "client!dw", name = "F", descriptor = "(II)V")
    public final void method264(int arg0, int arg1) {
        ++field8892;
    }

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "(II)V")
    public final synchronized void method3685(int arg0, int arg1) {
        if (arg1 > -35) {
            this.method1486(99, 106, 38, (int[]) null);
        }
        ++field8864;
        class71 var3 = new class71();
        var3.field1079 = (long) arg0;
        this.field9031.method3610(9289, var3);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method1462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field8872;
        if (arg0 != arg2 || arg1 != arg3) {
            this.method3683(5121);
            this.method3737(0, arg5);
            float var10 = (float) (-arg0) + (float) arg2;
            float var11 = (float) arg3 - (float) arg1;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            int var13 = arg8 % (arg6 + arg7);
            float var14 = var11 * var12;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var15 = var10 * var12;
            float var16 = (float) arg6 * var15;
            float var17 = (float) arg6 * var14;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (arg6 < var13) {
                var19 = (float) (arg6 + arg7 - var13) * var14;
                var18 = (float) (arg6 - -arg7 + -var13) * var15;
            } else {
                var20 = (float) (-var13 + arg6) * var15;
                var21 = (float) (-var13 + arg6) * var14;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var15;
            float var25 = (float) arg7 * var14;
            while (true) {
                if (arg0 < arg2) {
                    if (var22 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var20 + var22 > (float) arg2) {
                        var20 = (float) arg2 - var22;
                    }
                } else {
                    if (var22 < (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var20 + var22 < (float) arg2) {
                        var20 = (float) arg2 + -var22;
                    }
                }
                if (arg3 > arg1) {
                    if ((float) arg3 + 0.35F < var23) {
                        break;
                    }
                    if (var21 + var23 > (float) arg3) {
                        var21 = (float) arg3 - var23;
                    }
                } else {
                    if (var23 < (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 > var21 + var23) {
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

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "(I)V")
    private final void method3686(int arg0) {
        ++field8921;
        OpenGL.glViewport(this.field9078, this.field9083, this.field8828, this.field8986);
        if (arg0 > -72) {
            this.method1391((class577) null);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lih;)V")
    public final void method1444(class744 arg0) {
        this.field9038.method900(arg0);
        ++field8869;
        this.field9042.method900(this.field9038);
        this.field9042.method2922((byte) -112);
        this.field9043.method2927(this.field9042, 2);
        if (this.field9143 != 1) {
            this.method3716(false);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZI[BII)Lbia;")
    public final class411 method3687(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        ++field8808;
        int var6 = -54 % ((-60 - arg4) / 36);
        return (class411) (!this.field9088 || arg0 && !this.field9096 ? new class118(this, arg1, arg2, arg3) : new class487(this, arg1, arg2, arg3, arg0));
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIILpa;I)V")
    public final void method3688(int arg0, int arg1, int arg2, class399 arg3, int arg4) {
        ++field8931;
        int var6 = arg3.method2487(71);
        int var7 = arg0 * this.method3735(var6, arg4 ^ 3);
        this.method3705(arg3, (byte) 109);
        if (arg4 != 0) {
            this.method3739(-0.31725237F, -0.6673449F, -1.1149681F, 2.277013F, (byte) -33);
        }
        OpenGL.glDrawElements(arg2, arg1, var6, arg3.method2488(-6566) - -((long) var7));
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lhe;Lhe;FLhe;)Lhe;")
    public final class577 method260(class577 arg0, class577 arg1, float arg2, class577 arg3) {
        ++field8889;
        if (arg0 != null && arg1 != null && this.field9127 && this.field9108) {
            class182 var5 = null;
            class715 var6 = (class715) arg0;
            class715 var7 = (class715) arg1;
            class413 var8 = var6.method1148(0);
            class413 var9 = var7.method1148(0);
            if (var8 != null && var9 != null) {
                int var10 = var9.field5856 >= var8.field5856 ? var9.field5856 : var8.field5856;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class182) {
                    class182 var11 = (class182) arg3;
                    if (~var10 == ~var11.method1146(-11083)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class182(this, var10);
                }
                if (var5.method1145(var9, arg2, 33985, var8)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V")
    public class664(Canvas arg0, class270 arg1, int arg2) {
        super(arg1);
        new class680();
        new class130(16);
        this.field9026 = new class646();
        this.field9027 = new class646();
        this.field9028 = new class646();
        this.field9029 = new class646();
        this.field9030 = new class646();
        this.field9031 = new class646();
        this.field9032 = new class646();
        this.field9038 = new class480();
        this.field9042 = new class480();
        this.field9043 = new class480();
        this.field9047 = false;
        this.field9064 = -1.0F;
        this.field9049 = 0;
        this.field9081 = 0;
        this.field9066 = 3584.0F;
        this.field9104 = new float[4];
        this.field9045 = -1;
        this.field9087 = 512;
        this.field9053 = new float[4];
        this.field9059 = -1;
        this.field9078 = 0;
        this.field9099 = 0;
        this.field9056 = 0;
        this.field9083 = 0;
        this.field9105 = 8448;
        this.field9112 = 0;
        this.field9114 = 3584;
        this.field9116 = 1.0F;
        this.field9084 = -1;
        this.field9072 = 512;
        this.field9128 = 8448;
        this.field9061 = 1.0F;
        this.field9130 = -1.0F;
        this.field9124 = 0;
        this.field9077 = 1.0F;
        this.field9107 = 1.0F;
        this.field9076 = 50;
        this.field9080 = 1.0F;
        this.field9133 = 0.0F;
        this.field9054 = 0;
        this.field9115 = new float[4];
        this.field9132 = new float[16];
        this.field9098 = new float[4];
        this.field9073 = new class687[class528.field7324];
        this.field9046 = 3584.0F;
        this.field9139 = -1.0F;
        this.field9145 = -1.0F;
        this.field9136 = -1;
        this.field9149 = true;
        this.field9144 = 0;
        this.field9069 = -1;
        this.field9117 = new class172(8192);
        this.field9155 = new byte[16384];
        this.field9157 = new int[1];
        this.field9159 = new int[1];
        this.field9160 = new int[1];
        this.field8998 = arg2;
        this.field8983 = this.field8974 = arg0;
        if (!class715.method4015("jaclib", -1)) {
            throw new RuntimeException("");
        } else if (!class715.method4015("jaggl", -1)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field8878 = new OpenGL();
                this.field8803 = this.field8815 = this.field8878.init(arg0, 8, 8, 8, 24, 0, this.field8998);
                if (~this.field8815 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method3747((byte) -101);
                    int var4 = this.method3724(true);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field9086 = this.field9051 ? 33639 : 5121;
                        if (~this.field9146.indexOf("radeon") != 0) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class494.method2992(' ', this.field9146.replace('/', ' '), 1);
                            for (int var9 = 0; var8.length > var9; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (~var10.length() < -1) {
                                        if (~var10.charAt(0) == -121 && ~var10.length() <= -4 && class134.method849(var10.substring(1, 3), 0)) {
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
                                            if (var10.length() >= 4 && class134.method849(var10.substring(0, 4), 0)) {
                                                var5 = class341.method2169(var10.substring(0, 4), -112);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field9141 = false;
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && var5 <= 7999) {
                                    this.field9088 = false;
                                }
                                if (~var5 <= -7001 && var5 <= 9250) {
                                    this.field9131 = false;
                                }
                            }
                            this.field9057 &= this.field8878.method3327("GL_ARB_half_float_pixel");
                            this.field9147 = true;
                            this.field9096 = this.field9088;
                        }
                        if (this.field9138.indexOf("intel") != -1) {
                            this.field9108 = false;
                        }
                        this.field9148 = !this.field9138.equals("s3 graphics");
                        if (this.field9088) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class612.method3470(true, false, (byte) -79);
                        this.field9007 = true;
                        this.field9003 = new class124(this, super.field7623);
                        this.method3726(96);
                        this.field9006 = new class669(this);
                        this.field8996 = new class428(this);
                        if (this.field8996.method2655(30639)) {
                            this.field8997 = new class469(this);
                            if (!this.field8997.method2861((byte) -71)) {
                                this.field8997.method1325(9617);
                                this.field8997 = null;
                            }
                        }
                        this.field8995 = new class319(this);
                        this.method3711(0);
                        this.method3689(0);
                        this.method281();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method312();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "o", descriptor = "(I)V")
    private final void method3689(int arg0) {
        if (this.field8983 != null) {
            Dimension var2 = this.field8983.getSize();
            this.field8797 = var2.width;
            this.field8865 = var2.height;
        } else {
            this.field8797 = this.field8865 = 0;
        }
        ++field8908;
        if (this.field9015 == null) {
            this.field8986 = this.field8865;
            this.field8828 = this.field8797;
            this.method3686(-123);
        }
        this.method3714(arg0 ^ -32);
        if (arg0 != 0) {
            this.field9106 = -41;
        }
        this.method1437();
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZLlt;)V")
    public final void method3690(boolean arg0, class620 arg1) {
        ++field8991;
        if (arg0) {
            this.method3677(97, -10);
        }
        if (this.field9021 >= 0 && this.field9014[this.field9021] == arg1) {
            this.field9014[this.field9021--] = null;
            arg1.method3501(!arg0);
            if (~this.field9021 <= -1) {
                this.field9015 = this.field9014[this.field9021];
                this.field9015.method3500(false);
            } else {
                this.field9015 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dw", name = "la", descriptor = "()V")
    public final void method1437() {
        this.field9124 = this.field8986;
        this.field9056 = 0;
        ++field8951;
        this.field9144 = this.field8828;
        this.field9081 = 0;
        OpenGL.glDisable(3089);
        this.method3692(false);
    }

    @OriginalMember(owner = "client!dw", name = "x", descriptor = "()Lih;")
    public final class744 method1385() {
        ++field8840;
        return this.field9038;
    }

    @OriginalMember(owner = "client!dw", name = "p", descriptor = "(I)V")
    private final void method3691(int arg0) {
        ++field8813;
        if (arg0 == -34845) {
            if (~this.field9144 <= ~this.field9056 && ~this.field9081 >= ~this.field9124) {
                OpenGL.glScissor(this.field9078 + this.field9056, this.field9083 + this.field8986 + -this.field9124, this.field9144 - this.field9056, this.field9124 - this.field9081);
            } else {
                OpenGL.glScissor(0, 0, 0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(Z)V")
    private final void method3692(boolean arg0) {
        this.field9153 = (float) (-this.field9054 + this.field9081);
        this.field9120 = (float) (-this.field9112 + this.field9056);
        this.field9065 = (float) (this.field9124 - this.field9054);
        if (arg0) {
            this.field9004 = null;
        }
        this.field9102 = (float) (-this.field9112 + this.field9144);
        ++field8861;
    }

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "(IIIIII)Lhe;")
    public final class577 method1547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9002;
        return !this.field9127 ? null : new class455(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(JI)V")
    public final synchronized void method3693(long arg0, int arg1) {
        ++field8819;
        if (arg1 != -25658) {
            this.field9132 = null;
        }
        class71 var4 = new class71();
        var4.field1079 = arg0;
        this.field9032.method3610(9289, var4);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Llt;B)V")
    public final void method3694(class620 arg0, byte arg1) {
        ++field8967;
        if (arg1 > -77) {
            this.field9110 = false;
        }
        if (this.field9154) {
            this.method3710(-27124, arg0);
            this.method3690(false, arg0);
        } else if (this.field9019 >= 0 && this.field9020[this.field9019] == arg0) {
            this.field9020[this.field9019--] = null;
            arg0.method3502(24193);
            if (~this.field9019 <= -1) {
                this.field9017 = this.field9015 = this.field9020[this.field9019];
                this.field9017.method3504(92);
            } else {
                this.field9017 = this.field9015 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "([IIIIIZ)Lfd;")
    public final class298 method1549(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8859;
        return new class705(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Llt;I)V")
    public final void method3695(class620 arg0, int arg1) {
        if (arg1 == -17015) {
            ++field8897;
            if (this.field9154) {
                this.method3751(-74, arg0);
                this.method3733(90, arg0);
            } else if (this.field9019 >= 3) {
                throw new RuntimeException();
            } else {
                if (~this.field9019 <= -1) {
                    this.field9020[this.field9019].method3502(24193);
                }
                this.field9017 = this.field9015 = this.field9020[++this.field9019] = arg0;
                this.field9017.method3504(-67);
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I[BIZI)Lpa;")
    public final class399 method3696(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4) {
        ++field8798;
        if (arg0 != 0) {
            this.field9059 = -123;
        }
        return (class399) (!this.field9088 || arg3 && !this.field9096 ? new class633(this, arg4, arg1, arg2) : new class714(this, arg4, arg1, arg2, arg3));
    }

    @OriginalMember(owner = "client!dw", name = "q", descriptor = "(I)V")
    public final void method3697(int arg0) {
        OpenGL.glPushMatrix();
        int var2 = -88 % ((-57 - arg0) / 38);
        ++field8937;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lza;)V")
    public final void method1523(class257 arg0) {
        this.field9010 = ((class355) arg0).field5104;
        ++field8820;
        if (this.field9089 == null) {
            class172 var2 = new class172(80);
            if (this.field9051) {
                var2.method1102(-732814632, -1.0F);
                var2.method1102(-732814632, -1.0F);
                var2.method1102(-732814632, 0.0F);
                var2.method1102(-732814632, 0.0F);
                var2.method1102(-732814632, 1.0F);
                var2.method1102(-732814632, 1.0F);
                var2.method1102(-732814632, -1.0F);
                var2.method1102(-732814632, 0.0F);
                var2.method1102(-732814632, 1.0F);
                var2.method1102(-732814632, 1.0F);
                var2.method1102(-732814632, 1.0F);
                var2.method1102(-732814632, 1.0F);
                var2.method1102(-732814632, 0.0F);
                var2.method1102(-732814632, 1.0F);
                var2.method1102(-732814632, 0.0F);
                var2.method1102(-732814632, -1.0F);
                var2.method1102(-732814632, 1.0F);
                var2.method1102(-732814632, 0.0F);
                var2.method1102(-732814632, 0.0F);
                var2.method1102(-732814632, 0.0F);
            } else {
                var2.method1100(-1.0F, 10);
                var2.method1100(-1.0F, 92);
                var2.method1100(0.0F, -124);
                var2.method1100(0.0F, 86);
                var2.method1100(1.0F, -126);
                var2.method1100(1.0F, -111);
                var2.method1100(-1.0F, -117);
                var2.method1100(0.0F, -124);
                var2.method1100(1.0F, 24);
                var2.method1100(1.0F, -109);
                var2.method1100(1.0F, -109);
                var2.method1100(1.0F, -110);
                var2.method1100(0.0F, -3);
                var2.method1100(1.0F, -126);
                var2.method1100(0.0F, 103);
                var2.method1100(-1.0F, -125);
                var2.method1100(1.0F, 80);
                var2.method1100(0.0F, -126);
                var2.method1100(0.0F, -127);
                var2.method1100(0.0F, 2);
            }
            this.field9089 = this.method3687(false, 20, var2.field954, var2.field956, -98);
            this.field9085 = new class509(this.field9089, 5126, 3, 0);
            this.field9142 = new class509(this.field9089, 5126, 2, 12);
            this.field9001.method3189(this, (byte) 98);
        }
    }

    @OriginalMember(owner = "client!dw", name = "X", descriptor = "(I)V")
    public final void method1399(int arg0) {
        this.field9011 = 0;
        ++field8929;
        while (~arg0 < -2) {
            ++this.field9011;
            arg0 >>= 1;
        }
        this.field9012 = 1 << this.field9011;
    }

    @OriginalMember(owner = "client!dw", name = "K", descriptor = "([I)V")
    public final void method1454(int[] arg0) {
        arg0[0] = this.field9056;
        arg0[3] = this.field9124;
        arg0[2] = this.field9144;
        arg0[1] = this.field9081;
        ++field8952;
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(II)Lpw;")
    public final class106 method299(int arg0, int arg1) {
        ++field8806;
        return null;
    }

    @OriginalMember(owner = "client!dw", name = "M", descriptor = "()I")
    public final int method1482() {
        ++field8877;
        int var1 = this.field9158;
        this.field9158 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!dw", name = "r", descriptor = "(I)V")
    private final void method3698(int arg0) {
        if (arg0 <= -67) {
            OpenGL.glDepthMask(this.field9034 && this.field9149);
            ++field8793;
        }
    }

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "(B)V")
    private final void method3699(byte arg0) {
        ++field8868;
        int var2;
        for (var2 = 0; var2 < this.field9094; ++var2) {
            class687 var3 = this.field9073[var2];
            class584.field7970[0] = (float) var3.method3873((byte) -7);
            int var4 = var2 + 16386;
            class584.field7970[1] = (float) var3.method3867(false);
            class584.field7970[2] = (float) var3.method3870(121);
            class584.field7970[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class584.field7970, 0);
            int var5 = var3.method3868(6);
            float var6 = var3.method3871(16043) / 255.0F;
            class584.field7970[2] = (float) class665.method3759(var5, 255) * var6;
            class584.field7970[0] = (float) (class665.method3759(var5, 16742558) >> 16) * var6;
            class584.field7970[1] = var6 * (float) class665.method3759(255, var5 >> 8);
            OpenGL.glLightfv(var4, 4609, class584.field7970, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method3866((byte) -124) * var3.method3866((byte) -100)));
            OpenGL.glEnable(var4);
        }
        if (arg0 != -13) {
            this.method1514(-15, -30, -73, -126, false);
        }
        while (this.field9121 > var2) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        this.field9121 = this.field9094;
    }

    @OriginalMember(owner = "client!dw", name = "s", descriptor = "(I)V")
    public final void method3700(int arg0) {
        ++field8949;
        if (~this.field9039 != arg0) {
            this.method3721(false);
            this.method3703(true, true);
            this.method3707((byte) 15, true);
            this.method3684(true, -32);
            this.method3737(0, 1);
            this.field9039 = 8;
        }
    }

    @OriginalMember(owner = "client!dw", name = "r", descriptor = "(IIIIIII)I")
    public final int method1488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8893;
        float var8 = (float) arg2 * this.field9038.field6673 + (float) arg0 * this.field9038.field6692 + (float) arg1 * this.field9038.field6670 + this.field9038.field6700;
        float var9 = (float) arg5 * this.field9038.field6673 + (float) arg3 * this.field9038.field6692 + (float) arg4 * this.field9038.field6670 + this.field9038.field6700;
        int var10 = 0;
        if ((float) this.field9076 > var8 && var9 < (float) this.field9076) {
            var10 |= 16;
        } else if (var8 > (float) this.field9114 && (float) this.field9114 < var9) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field9038.field6697 + (float) arg0 * this.field9038.field6696 + (float) arg1 * this.field9038.field6704 + this.field9038.field6702) * (float) this.field9072 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field9038.field6697 + (float) arg3 * this.field9038.field6696 + (float) arg4 * this.field9038.field6704 + this.field9038.field6702) * (float) this.field9072 / (float) arg6);
        if (this.field9120 > (float) var11 && (float) var12 < this.field9120) {
            var10 |= 1;
        } else if (this.field9102 < (float) var11 && this.field9102 < (float) var12) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field9038.field6705 + (float) arg0 * this.field9038.field6669 + (float) arg1 * this.field9038.field6689 + this.field9038.field6681) * (float) this.field9087 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field9038.field6705 + (float) arg3 * this.field9038.field6669 + (float) arg4 * this.field9038.field6689 + this.field9038.field6681) * (float) this.field9087 / (float) arg6);
        if ((float) var13 < this.field9153 && (float) var14 < this.field9153) {
            var10 |= 4;
        } else if (this.field9065 < (float) var13 && (float) var14 > this.field9065) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!dw", name = "xa", descriptor = "(F)V")
    public final void method1457(float arg0) {
        ++field8979;
        if (this.field9091 != arg0) {
            this.field9091 = arg0;
            this.method3728((byte) -88);
        }
    }

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "()Z")
    public final boolean method1469() {
        ++field8809;
        return true;
    }

    @OriginalMember(owner = "client!dw", name = "EA", descriptor = "(IIII)V")
    public final void method1501(int arg0, int arg1, int arg2, int arg3) {
        ++field8930;
        if (!this.field9113) {
            throw new RuntimeException("");
        } else {
            this.field9049 = arg3;
            this.field9084 = arg2;
            this.field9122 = arg0;
            this.field9069 = arg1;
            if (this.field9047) {
                this.field8995.field4433.method2938(true);
                this.field8995.field4433.method2937(false);
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIB)V")
    public final synchronized void method3701(int arg0, int arg1, byte arg2) {
        if (arg2 == -30) {
            ++field8812;
            class27 var4 = new class27(arg0);
            var4.field1079 = (long) arg1;
            this.field9030.method3610(9289, var4);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZZ)V")
    public final void method3702(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.field9153 = -0.8227076F;
        }
        if (this.field9119 != arg1) {
            this.field9119 = arg1;
            this.method3743((byte) -97);
        }
        ++field8988;
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method1533(Canvas arg0, int arg1, int arg2) {
        ++field8916;
        long var4 = 0L;
        if (arg0 != null && this.field8974 != arg0) {
            if (this.field8887.containsKey(arg0)) {
                Long var6 = (Long) this.field8887.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field8815;
        }
        if (var4 == 0L) {
            throw new RuntimeException();
        } else {
            this.field8878.surfaceResized(var4);
            if (this.field8983 == arg0) {
                this.method3689(0);
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "r", descriptor = "()V")
    public final void method290() {
        OpenGL.glFinish();
        ++field8981;
    }

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "(I)V")
    public final void method1492(int arg0) {
        ++field8900;
        this.method3731(-72);
    }

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "()Lih;")
    public final class744 method1404() {
        ++field8932;
        return this.field9004;
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(ZZ)V")
    public final void method3703(boolean arg0, boolean arg1) {
        ++field8841;
        if (arg0) {
            if (this.field9075 != arg1) {
                this.field9075 = arg1;
                this.method3670(875);
                this.field9039 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "(B)V")
    private final void method3704(byte arg0) {
        OpenGL.glMatrixMode(5889);
        if (arg0 >= -105) {
            this.field8999 = 106;
        }
        ++field8853;
        OpenGL.glLoadMatrixf(this.field9132, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lpa;B)V")
    public final void method3705(class399 arg0, byte arg1) {
        int var3 = -17 / ((arg1 - 52) / 47);
        if (this.field9092 != arg0) {
            if (this.field9088) {
                OpenGL.glBindBufferARB(34963, arg0.method2485(22162));
            }
            this.field9092 = arg0;
        }
        ++field8880;
    }

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "()V")
    public final void method315() {
        this.field8996.method2650(8306);
        ++field8842;
    }

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "()Z")
    public final boolean method1490() {
        ++field8969;
        return true;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method1423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field8943;
        this.method3683(5121);
        this.method3737(0, arg12);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lpw;Llh;)Ldi;")
    public final class5 method311(class106 arg0, class208 arg1) {
        ++field8918;
        return null;
    }

    @OriginalMember(owner = "client!dw", name = "na", descriptor = "(IIII)[I")
    public final int[] method268(int arg0, int arg1, int arg2, int arg3) {
        ++field8926;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, this.field8986 - arg1 + -var6, arg2, 1, 32993, this.field9086, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IF)V")
    public final void method3706(int arg0, float arg1) {
        ++field8794;
        if (arg0 != 3) {
            this.field9030 = null;
        }
        if (this.field9061 != arg1) {
            this.field9061 = arg1;
            if (this.field9143 == 3) {
                this.method3678(5888);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(BZ)V")
    public final void method3707(byte arg0, boolean arg1) {
        int var3 = -105 / ((-63 - arg0) / 40);
        if (!this.field9035 == arg1) {
            if (arg1) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field9035 = arg1;
            this.field9039 &= -32;
        }
        ++field8936;
    }

    @OriginalMember(owner = "client!dw", name = "u", descriptor = "()V")
    public final void method302() {
        ++field8814;
        if (this.field9108) {
            if (this.field9013 != this.field9015) {
                throw new RuntimeException();
            }
            this.field9013.method3757(0, false);
            this.field9013.method3757(8, false);
            this.method3694(this.field9013, (byte) -79);
        } else {
            if (!this.field9135) {
                throw new RuntimeException("");
            }
            this.field9022.method1015(0, 0, this.field8828, this.field8986, 0, 0);
            this.field8878.setSurface(this.field8803);
        }
        this.field9022 = null;
        this.field8828 = this.field8797;
        this.field8986 = this.field8865;
        this.method3714(-32);
        this.method3686(-85);
        this.method1437();
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method1470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class573 arg6, int arg7, int arg8) {
        ++field8909;
        class444 var10 = (class444) arg6;
        class702 var11 = var10.field6165;
        this.method3712(0);
        this.method3681(var10.field6165, 0);
        this.method3737(0, arg5);
        this.method3729((byte) 95, 7681, 8448);
        this.method3718(34167, 120, 768, 0);
        float var12 = var11.field9791 / (float) var11.field9781;
        float var13 = var11.field9782 / (float) var11.field9793;
        float var14 = (float) (-arg0) + (float) arg2;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var17 = var15 * var16;
        float var18 = var14 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var18 + 0.35F, (float) arg3 + var17 + 0.35F);
        OpenGL.glEnd();
        this.method3718(5890, 118, 768, 0);
    }

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "(I)V")
    public final void method1398(int arg0) {
        ++field8958;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field8999 = arg0;
            this.field9003.method774((byte) -76);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(II[I[I)Laa;")
    public final class573 method1461(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field8800;
        return class1.method8(arg3, this, -122, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "(II)V")
    public final void method1511(int arg0, int arg1) {
        if (this.field9076 != arg0 || ~this.field9114 != ~arg1) {
            this.field9076 = arg0;
            this.field9114 = arg1;
            this.method3673((byte) -3);
            this.method3674(-88);
            if (~this.field9143 != -4) {
                if (this.field9143 == 2) {
                    this.method3704((byte) -116);
                }
            } else {
                this.method3678(5888);
            }
        }
        ++field8826;
    }

    @OriginalMember(owner = "client!dw", name = "A", descriptor = "()Z")
    public final boolean method1419() {
        ++field8924;
        return this.field8995.method2061(3, 4883);
    }

    @OriginalMember(owner = "client!dw", name = "JA", descriptor = "(IIIIII)I")
    public final int method1548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8913;
        int var7 = 0;
        float var8 = (float) arg2 * this.field9038.field6673 + (float) arg0 * this.field9038.field6692 + (float) arg1 * this.field9038.field6670 + this.field9038.field6700;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field9038.field6673 + (float) arg3 * this.field9038.field6692 + (float) arg4 * this.field9038.field6670 + this.field9038.field6700;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field9076 && var9 < (float) this.field9076) {
            var7 |= 16;
        } else if (var8 > (float) this.field9114 && var9 > (float) this.field9114) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field9038.field6697 + (float) arg0 * this.field9038.field6696 + (float) arg1 * this.field9038.field6704 + this.field9038.field6702) * (float) this.field9072 / var8);
        int var11 = (int) (((float) arg5 * this.field9038.field6697 + (float) arg3 * this.field9038.field6696 + (float) arg4 * this.field9038.field6704 + this.field9038.field6702) * (float) this.field9072 / var9);
        if (this.field9120 > (float) var10 && this.field9120 > (float) var11) {
            var7 |= 1;
        } else if (this.field9102 < (float) var10 && (float) var11 > this.field9102) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field9038.field6705 + (float) arg0 * this.field9038.field6669 + (float) arg1 * this.field9038.field6689 + this.field9038.field6681) * (float) this.field9087 / var8);
        int var13 = (int) (((float) arg5 * this.field9038.field6705 + (float) arg3 * this.field9038.field6669 + (float) arg4 * this.field9038.field6689 + this.field9038.field6681) * (float) this.field9087 / var9);
        if (this.field9153 > (float) var12 && this.field9153 > (float) var13) {
            var7 |= 4;
        } else if (this.field9065 < (float) var12 && this.field9065 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!dw", name = "L", descriptor = "(III)V")
    public final void method1474(int arg0, int arg1, int arg2) {
        ++field8881;
        if (this.field9045 != arg0 || ~this.field9136 != ~arg1 || ~this.field9099 != ~arg2) {
            this.field9045 = arg0;
            this.field9136 = arg1;
            this.field9099 = arg2;
            this.method3674(-54);
            this.method3670(875);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IFFF)V")
    private final void method3708(int arg0, float arg1, float arg2, float arg3) {
        OpenGL.glMatrixMode(5890);
        ++field8915;
        if (arg0 != 0) {
            this.method1509();
        }
        if (this.field9125) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg1, arg3, arg2);
        OpenGL.glMatrixMode(5888);
        this.field9125 = true;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(BI)V")
    public final void method3709(byte arg0, int arg1) {
        if (arg0 >= -59) {
            this.field9014 = null;
        }
        ++field8927;
        this.method3736(true, false, arg1);
    }

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "()Ler;")
    public final class299 method263() {
        ++field8906;
        int var1 = -1;
        if (~this.field9138.indexOf("nvidia") != 0) {
            var1 = 4318;
        } else if (this.field9138.indexOf("intel") == -1) {
            if (this.field9138.indexOf("ati") != -1) {
                var1 = 4098;
            }
        } else {
            var1 = 32902;
        }
        return new class299(var1, "OpenGL", this.field9152, this.field9146, 0L);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILlt;)V")
    public final void method3710(int arg0, class620 arg1) {
        ++field8830;
        if (arg0 != -27124) {
            this.field9021 = 30;
        }
        if (~this.field9018 <= -1 && this.field9016[this.field9018] == arg1) {
            this.field9016[this.field9018--] = null;
            arg1.method3503(-19510);
            if (~this.field9018 <= -1) {
                this.field9017 = this.field9016[this.field9018];
                this.field9017.method3499(arg0 + 58838);
            } else {
                this.field9017 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(IIIIII)V")
    public final void method1434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3683(5121);
        ++field8992;
        this.method3737(0, arg5);
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
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var9 + 0.35F, (float) arg3 + var8 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(IIIID)V")
    public final void method308(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field8989;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIZ)Lfd;")
    public final class298 method1514(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field8852;
        return new class705(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!dw", name = "t", descriptor = "(I)V")
    private final void method3711(int arg0) {
        this.method3709((byte) -116, -2);
        ++field8994;
        for (int var2 = this.field9134 + -1; ~var2 <= -1; --var2) {
            this.method3738((byte) -63, var2);
            this.method3681((class559) null, 0);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method3729((byte) 95, 8448, 8448);
        this.method3718(34168, 123, 770, 2);
        this.method3713((byte) -30);
        this.field9040 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field9036 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field9041 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field9033 = true;
        this.method3703(true, true);
        if (arg0 != 0) {
            this.field9045 = -128;
        }
        this.method3680((byte) 106, true);
        this.method3707((byte) -20, true);
        this.method3684(true, -32);
        this.method3714(-32);
        this.field8878.setSwapInterval(0);
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
        this.field9059 = this.field9045 = -1;
        this.method1437();
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ldi;)V")
    public final void method325(class5 arg0) {
        ++field8977;
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(Z)V")
    public final void method1545(boolean arg0) {
        ++field8795;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)I")
    public final int method1484(int arg0, int arg1) {
        ++field8898;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!dw", name = "u", descriptor = "(I)V")
    public final void method3712(int arg0) {
        ++field8856;
        if (~this.field9039 != -3) {
            this.method3682(-34);
            this.method3703(true, false);
            this.method3680((byte) 106, false);
            this.method3707((byte) -120, false);
            this.method3684(false, -32);
            this.method3709((byte) -128, -2);
            this.field9039 = 2;
        }
        if (arg0 != 0) {
            this.method3684(false, -93);
        }
    }

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "(B)V")
    private final void method3713(byte arg0) {
        ++field8948;
        if (this.field9125) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field9125 = false;
        }
        if (arg0 > -19) {
            this.field9139 = 0.16376825F;
        }
    }

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "()Z")
    public final boolean method283() {
        ++field8810;
        if (this.field8997 != null) {
            if (!this.field8997.method1323(1)) {
                if (!this.field8996.method2656(this.field8997, (byte) -67)) {
                    return false;
                }
                this.field9003.method774((byte) -75);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "()Z")
    public final boolean method1395() {
        ++field8827;
        return false;
    }

    @OriginalMember(owner = "client!dw", name = "v", descriptor = "(I)V")
    public final void method3714(int arg0) {
        if (arg0 != -32) {
            this.method3674(27);
        }
        ++field8982;
        if (~this.field9143 != -1) {
            this.field9039 &= -32;
            this.field9143 = 0;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIB)V")
    public final void method3715(int arg0, int arg1, int arg2, byte arg3) {
        ++field8963;
        OpenGL.glTexEnvi(8960, arg2 + 34184, arg0);
        if (arg3 <= -52) {
            OpenGL.glTexEnvi(8960, arg2 + 34200, arg1);
        }
    }

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "(Z)V")
    private final void method3716(boolean arg0) {
        ++field8993;
        OpenGL.glLoadIdentity();
        if (arg0) {
            this.field9144 = -22;
        }
        OpenGL.glMultMatrixf(this.field9042.method2926(-4504), 0);
        if (this.field9047) {
            this.field8995.field4433.method2938(true);
        }
        this.method3744((byte) -84);
        this.method3699((byte) -13);
    }

    @OriginalMember(owner = "client!dw", name = "w", descriptor = "(I)V")
    public static void method3717(int arg0) {
        field8914 = null;
        if (arg0 <= 33) {
            field8914 = null;
        }
        field8919 = null;
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(IIII)V")
    public final void method3718(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg3 + 34176, arg0);
        if (arg1 >= 94) {
            ++field8857;
            OpenGL.glTexEnvi(8960, arg3 + 34192, arg2);
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(BI)V")
    public final synchronized void method3719(byte arg0, int arg1) {
        ++field8855;
        if (arg0 <= 110) {
            this.field9075 = true;
        }
        class27 var3 = new class27(arg1);
        this.field9029.method3610(9289, var3);
    }

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "(II)V")
    public final void method3720(int arg0, int arg1) {
        ++field8950;
        if (~arg1 == -2) {
            this.method3729((byte) 95, 7681, 7681);
        } else if (~arg1 == -1) {
            this.method3729((byte) 95, 8448, 8448);
        } else if (~arg1 != -3) {
            if (arg1 == 3) {
                this.method3729((byte) 95, 260, 8448);
            } else if (arg1 == 4) {
                this.method3729((byte) 95, 34023, 34023);
            }
        } else {
            this.method3729((byte) 95, 34165, 7681);
        }
        if (arg0 != -26014) {
            this.method3686(-36);
        }
    }

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "(Z)V")
    private final void method3721(boolean arg0) {
        ++field8848;
        if (this.field9143 != 2) {
            this.field9143 = 2;
            this.method3704((byte) -125);
            this.method3716(false);
            this.field9039 &= -8;
        }
        if (arg0) {
            this.method1544(27, 90, -120, 26);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIZ)Lfd;")
    public final class298 method1471(int arg0, int arg1, boolean arg2) {
        ++field8928;
        return new class705(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILtu;)V")
    public final void method3722(int arg0, class480 arg1) {
        OpenGL.glPushMatrix();
        ++field8934;
        OpenGL.glMultMatrixf(arg1.method2926(-4504), arg0);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method282(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class692 {
        this.method262(arg2, arg3);
        ++field8972;
    }

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "(II)I")
    public final int method1390(int arg0, int arg1) {
        ++field8980;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "(II)Llh;")
    public final class208 method317(int arg0, int arg1) {
        ++field8971;
        return null;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(BII)V")
    public final void method3723(byte arg0, int arg1, int arg2) {
        this.field9083 = arg2;
        if (arg0 != -88) {
            this.method1513();
        }
        ++field8845;
        this.field9078 = arg1;
        this.method3686(-105);
        this.method3691(arg0 + -34757);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I[Ltj;)V")
    public final void method1532(int arg0, class687[] arg1) {
        ++field8884;
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field9073[var3] = arg1[var3];
        }
        this.field9094 = arg0;
        if (this.field9143 != 1) {
            this.method3699((byte) -13);
        }
    }

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "(Z)I")
    private final int method3724(boolean arg0) {
        ++field8962;
        int var2 = 0;
        this.field9138 = OpenGL.glGetString(7936).toLowerCase();
        this.field9146 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field9138.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field9138.indexOf("brian paul") != -1 || ~this.field9138.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class494.method2992(' ', var3.replace('.', ' '), 1);
        if (!arg0) {
            this.field9074 = null;
        }
        if (~var4.length > -3) {
            var2 |= 4;
        } else {
            try {
                int var5 = class341.method2169(var4[0], 48);
                int var6 = class341.method2169(var4[1], -120);
                this.field9152 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (~this.field9152 > -13) {
            var2 |= 2;
        }
        if (!this.field8878.method3327("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field8878.method3327("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field9134 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field9137 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field9106 = var7[0];
        if (~this.field9134 > -3 || ~this.field9137 > -3 || ~this.field9106 > -3) {
            var2 |= 16;
        }
        this.field9051 = Stream.method2614();
        this.field9135 = this.field8878.arePbuffersAvailable();
        this.field9088 = this.field8878.method3327("GL_ARB_vertex_buffer_object");
        this.field9067 = this.field8878.method3327("GL_ARB_multisample");
        this.field9123 = this.field8878.method3327("GL_ARB_vertex_program");
        this.field8878.method3327("GL_ARB_fragment_program");
        this.field9110 = this.field8878.method3327("GL_ARB_vertex_shader");
        this.field9058 = this.field8878.method3327("GL_ARB_fragment_shader");
        this.field9131 = this.field8878.method3327("GL_EXT_texture3D");
        this.field9057 = this.field8878.method3327("GL_ARB_texture_rectangle");
        this.field9127 = this.field8878.method3327("GL_ARB_texture_cube_map");
        this.field9141 = this.field8878.method3327("GL_ARB_texture_float");
        this.field9071 = false;
        this.field9108 = this.field8878.method3327("GL_EXT_framebuffer_object");
        this.field9154 = this.field8878.method3327("GL_EXT_framebuffer_blit");
        this.field9060 = this.field8878.method3327("GL_EXT_framebuffer_multisample");
        this.field9129 = this.field9154 & this.field9060;
        this.field9055 = class47.field612.startsWith("mac");
        OpenGL.glGetFloatv(2834, class474.field6613, 0);
        this.field9130 = class474.field6613[0];
        this.field9139 = class474.field6613[1];
        return ~var2 != -1 ? var2 : 0;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lss;BLss;Lss;Lss;)V")
    public final void method3725(class509 arg0, byte arg1, class509 arg2, class509 arg3, class509 arg4) {
        ++field8961;
        if (arg4 != null) {
            this.method3748(arg4.field7060, 127);
            OpenGL.glVertexPointer(arg4.field7061, arg4.field7059, this.field9074.method742(27594), this.field9074.method741((byte) -120) - -((long) arg4.field7062));
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        if (arg3 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method3748(arg3.field7060, 99);
            OpenGL.glNormalPointer(arg3.field7059, this.field9074.method742(27594), this.field9074.method741((byte) -125) + (long) arg3.field7062);
            OpenGL.glEnableClientState(32885);
        }
        if (arg0 != null) {
            this.method3748(arg0.field7060, 127);
            OpenGL.glColorPointer(arg0.field7061, arg0.field7059, this.field9074.method742(27594), this.field9074.method741((byte) -128) + (long) arg0.field7062);
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg2 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method3748(arg2.field7060, 94);
            OpenGL.glTexCoordPointer(arg2.field7061, arg2.field7059, this.field9074.method742(27594), this.field9074.method741((byte) -121) - -((long) arg2.field7062));
            OpenGL.glEnableClientState(32888);
        }
        if (arg1 <= 5) {
            this.method1449(52, 10, -104, -29, 118, -64, (byte[]) null, -110, -71);
        }
    }

    @OriginalMember(owner = "client!dw", name = "P", descriptor = "(IIIII)V")
    public final void method1427(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3683(5121);
        ++field8904;
        this.method3737(0, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!dw", name = "x", descriptor = "(I)V")
    private final void method3726(int arg0) {
        ++field8831;
        this.field9140 = new class559[this.field9134];
        this.field9082 = new class350(this, 3553, 6408, 1, 1);
        new class350(this, 3553, 6408, 1, 1);
        new class350(this, 3553, 6408, 1, 1);
        this.field9050 = new class378(this);
        this.field9048 = new class378(this);
        this.field9052 = new class378(this);
        this.field9103 = new class378(this);
        this.field9095 = new class378(this);
        this.field9068 = new class378(this);
        this.field9044 = new class378(this);
        if (arg0 < 82) {
            this.field9075 = true;
        }
        this.field9150 = new class378(this);
        this.field9079 = new class378(this);
        this.field9063 = new class378(this);
        if (this.field9108) {
            this.field9111 = new class665(this);
            new class665(this);
        }
    }

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "(B)V")
    private final void method3727(byte arg0) {
        class474.field6613[0] = this.field9107 * this.field9064;
        int var2 = 11 % ((32 - arg0) / 50);
        class474.field6613[1] = this.field9077 * this.field9064;
        class474.field6613[3] = 1.0F;
        ++field9000;
        class474.field6613[2] = this.field9080 * this.field9064;
        OpenGL.glLightfv(16384, 4609, class474.field6613, 0);
        class474.field6613[2] = -this.field9145 * this.field9080;
        class474.field6613[0] = -this.field9145 * this.field9107;
        class474.field6613[1] = -this.field9145 * this.field9077;
        class474.field6613[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class474.field6613, 0);
    }

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "(B)V")
    private final void method3728(byte arg0) {
        class474.field6613[0] = this.field9107 * this.field9091;
        class474.field6613[2] = this.field9091 * this.field9080;
        class474.field6613[1] = this.field9091 * this.field9077;
        class474.field6613[3] = 1.0F;
        if (arg0 != -88) {
            field8914 = null;
        }
        ++field8801;
        OpenGL.glLightModelfv(2899, class474.field6613, 0);
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(BII)V")
    public final void method3729(byte arg0, int arg1, int arg2) {
        if (this.field9070 != 0) {
            OpenGL.glTexEnvi(8960, 34161, arg1);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        } else {
            boolean var4 = false;
            if (this.field9128 != arg1) {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                this.field9128 = arg1;
                var4 = true;
            }
            if (this.field9105 != arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                var4 = true;
                this.field9105 = arg2;
            }
            if (var4) {
                this.field9039 &= -30;
            }
        }
        if (arg0 != 95) {
            this.method3728((byte) 42);
        }
        ++field8941;
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1510(Canvas arg0) {
        ++field8873;
        if (this.field8974 == arg0) {
            throw new RuntimeException();
        } else if (this.field8887.containsKey(arg0)) {
            Long var2 = (Long) this.field8887.get(arg0);
            this.field8878.releaseSurface(arg0, var2);
            this.field8887.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(BI)I")
    public final int method3730(byte arg0, int arg1) {
        ++field8866;
        int var3 = 4 / ((arg0 - -64) / 35);
        if (~arg1 != -2) {
            if (arg1 == 0) {
                return 8448;
            } else if (~arg1 != -3) {
                if (arg1 == 3) {
                    return 260;
                } else if (~arg1 == -5) {
                    return 34023;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                return 34165;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!dw", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method1498(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field8959;
        boolean var7 = ~this.field9059 != ~arg0;
        if (var7 || this.field9064 != arg1 || this.field9145 != arg2) {
            this.field9145 = arg2;
            this.field9064 = arg1;
            this.field9059 = arg0;
            if (var7) {
                this.field9077 = (float) (65280 & this.field9059) / 65280.0F;
                this.field9080 = (float) (255 & this.field9059) / 255.0F;
                this.field9107 = (float) (16711680 & this.field9059) / 1.671168E7F;
                this.method3728((byte) -88);
            }
            this.method3727((byte) -25);
        }
        if (this.field9115[0] != arg3 || this.field9115[1] != arg4 || this.field9115[2] != arg5) {
            this.field9115[0] = arg3;
            this.field9115[1] = arg4;
            this.field9115[2] = arg5;
            this.field9053[2] = -arg5;
            this.field9053[1] = -arg4;
            this.field9053[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field9104[1] = arg4 * var8;
            this.field9104[2] = arg5 * var8;
            this.field9104[0] = arg3 * var8;
            this.field9098[1] = -this.field9104[1];
            this.field9098[2] = -this.field9104[2];
            this.field9098[0] = -this.field9104[0];
            this.method3744((byte) -84);
            this.field9090 = (int) (arg3 * 256.0F / arg4);
            this.field9118 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lik;I)V")
    public final void method1479(class100 arg0, int arg1) {
        this.field9001.method3188(7216, this, arg1, arg0);
        ++field8944;
    }

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "()I")
    public final int method1426() {
        ++field8858;
        return this.field9076;
    }

    @OriginalMember(owner = "client!dw", name = "y", descriptor = "(I)V")
    private final void method3731(int arg0) {
        this.field8878.method3328();
        if (arg0 >= -71) {
            this.method1522(-65, 70, 32, -71, 33, 102, (class573) null, 23, -76, 124, 62, 52);
        }
        ++field8912;
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(II)V")
    public final void method262(int arg0, int arg1) throws class692 {
        try {
            this.field8878.swapBuffers();
        } catch (Exception var3) {
        }
        ++field8817;
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)V")
    public final synchronized void method310(int arg0) {
        ++field8823;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field9027.method3616((byte) 81)) {
            class27 var12 = (class27) this.field9027.method3623(0);
            class321.field4462[var2++] = (int) var12.field1079;
            this.field9025 -= var12.field347;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class321.field4462, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class321.field4462, 0);
            var2 = 0;
        }
        while (!this.field9028.method3616((byte) 104)) {
            class27 var11 = (class27) this.field9028.method3623(0);
            class321.field4462[var2++] = (int) var11.field1079;
            this.field9024 -= var11.field347;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class321.field4462, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class321.field4462, 0);
            var2 = 0;
        }
        while (!this.field9029.method3616((byte) 24)) {
            class27 var10 = (class27) this.field9029.method3623(0);
            class321.field4462[var2++] = var10.field347;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class321.field4462, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class321.field4462, 0);
            var2 = 0;
        }
        while (!this.field9030.method3616((byte) 62)) {
            class27 var9 = (class27) this.field9030.method3623(0);
            class321.field4462[var2++] = (int) var9.field1079;
            this.field9023 -= var9.field347;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class321.field4462, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class321.field4462, 0);
            boolean var4 = false;
        }
        while (!this.field9026.method3616((byte) 90)) {
            class27 var8 = (class27) this.field9026.method3623(0);
            OpenGL.glDeleteLists((int) var8.field1079, var8.field347);
        }
        while (!this.field9031.method3616((byte) 31)) {
            class71 var7 = this.field9031.method3623(0);
            OpenGL.glDeleteProgramARB((int) var7.field1079);
        }
        while (!this.field9032.method3616((byte) 103)) {
            class71 var6 = this.field9032.method3623(0);
            OpenGL.glDeleteObjectARB(var6.field1079);
        }
        while (!this.field9026.method3616((byte) 88)) {
            class27 var5 = (class27) this.field9026.method3623(0);
            OpenGL.glDeleteLists((int) var5.field1079, var5.field347);
        }
        this.field9003.method776(64);
        if (this.method1509() > 100663296 && ~class97.method664((byte) -50) < ~(this.field9037 - -60000L)) {
            System.gc();
            this.field9037 = class97.method664((byte) -50);
        }
        this.field9008 = var3;
    }

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "()Z")
    public final boolean method1387() {
        ++field8976;
        return true;
    }

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "()V")
    public final void method312() {
        for (class71 var1 = this.field9009.method3618(86); var1 != null; var1 = this.field9009.method3619(0)) {
            ((class355) var1).method2275(-1);
        }
        ++field8835;
        if (this.field8996 != null) {
            this.field8996.method2649(0);
        }
        if (this.field8878 != null) {
            this.method3731(-123);
            Enumeration var2 = this.field8887.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field8887.get(var3);
                this.field8878.releaseSurface(var3, var4);
            }
            this.field8878.release();
            this.field8878 = null;
        }
        if (this.field9007) {
            class394.method2462(22, false, true);
            this.field9007 = false;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(FIF)V")
    public final void method3732(float arg0, int arg1, float arg2) {
        ++field8902;
        this.field9133 = arg0;
        this.field9116 = arg2;
        this.method3674(-87);
        if (arg1 != 4) {
            this.method3719((byte) -62, -85);
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(ILlt;)V")
    public final void method3733(int arg0, class620 arg1) {
        ++field8903;
        if (this.field9021 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field9021 <= -1) {
                this.field9014[this.field9021].method3501(true);
            }
            if (arg0 < 70) {
                this.method3711(3);
            }
            this.field9015 = this.field9014[++this.field9021] = arg1;
            this.field9015.method3500(false);
        }
    }

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "(I)Lza;")
    public final class257 method1539(int arg0) {
        ++field8896;
        class355 var2 = new class355(arg0);
        this.field9009.method3610(9289, var2);
        return var2;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)V")
    public final void method272(boolean arg0) {
        ++field8933;
    }

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "(B)V")
    public static final void method3734(byte arg0) {
        class374.method2351(-4273);
        ++field8917;
        class453.field6283 = null;
        class416.field5889 = null;
        int var1 = 66 % ((13 - arg0) / 49);
        class385.field5532 = null;
        class731.field10162 = null;
        class601.field8136 = null;
    }

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "(II)I")
    public final int method3735(int arg0, int arg1) {
        ++field8911;
        if (~arg0 != -5122 && arg0 != 5120) {
            if (arg1 != 3) {
                this.method1532(-35, (class687[]) null);
            }
            if (~arg0 != -5124 && arg0 != 5122) {
                if (arg0 != 5125 && arg0 != 5124 && arg0 != 5126) {
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

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZZI)V")
    public final void method3736(boolean arg0, boolean arg1, int arg2) {
        this.method3679(arg2, arg0, true, true);
        if (arg1) {
            this.method3680((byte) -102, true);
        }
        ++field8860;
    }

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "(II)V")
    public final void method3737(int arg0, int arg1) {
        if (~this.field9040 != ~arg1) {
            boolean var3;
            byte var4;
            boolean var5;
            if (arg1 == 1) {
                var3 = true;
                var4 = 1;
                var5 = true;
            } else if (arg1 != 2) {
                if (arg1 == 128) {
                    var3 = true;
                    var5 = true;
                    var4 = 3;
                } else {
                    var3 = false;
                    var4 = 0;
                    var5 = true;
                }
            } else {
                var5 = true;
                var3 = false;
                var4 = 2;
            }
            if (this.field9033 != var5) {
                OpenGL.glColorMask(var5, var5, var5, true);
                this.field9033 = var5;
            }
            if (!this.field9041 != !var3) {
                if (var3) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field9041 = var3;
            }
            if (~this.field9036 != ~var4) {
                if (var4 == 1) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (~var4 == -3) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                } else if (~var4 == -4) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(774, 1);
                } else {
                    OpenGL.glDisable(3042);
                }
                this.field9036 = var4;
            }
            this.field9040 = arg1;
            this.field9039 &= -29;
        }
        ++field8957;
        if (arg0 != 0) {
            this.method1445(-40);
        }
    }

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "(BI)V")
    public final void method3738(byte arg0, int arg1) {
        if (arg0 != -63) {
            this.method3744((byte) -17);
        }
        if (~this.field9070 != ~arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field9070 = arg1;
        }
        ++field8968;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(FFFFB)V")
    public final void method3739(float arg0, float arg1, float arg2, float arg3, byte arg4) {
        class474.field6613[2] = arg0;
        class474.field6613[3] = arg1;
        ++field8925;
        int var6 = -15 % ((-6 - arg4) / 54);
        class474.field6613[0] = arg3;
        class474.field6613[1] = arg2;
        OpenGL.glTexEnvfv(8960, 8705, class474.field6613, 0);
    }

    @OriginalMember(owner = "client!dw", name = "C", descriptor = "(Z)V")
    public final void method1529(boolean arg0) {
        ++field8923;
        this.field9149 = arg0;
        this.method3698(-85);
    }

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "(B)V")
    public final void method3740(byte arg0) {
        ++field8964;
        if (this.field9039 != 16) {
            this.method3750(arg0 + -175);
            this.method3703(true, true);
            this.method3707((byte) -107, true);
            this.method3684(true, -32);
            this.method3737(arg0 ^ 48, 1);
            this.field9039 = 16;
        }
        if (arg0 != 48) {
            this.method3715(67, -68, -52, (byte) -69);
        }
    }

    @OriginalMember(owner = "client!dw", name = "HA", descriptor = "(IIII[I)V")
    public final void method1475(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field8886;
        float var6 = (float) arg2 * this.field9038.field6673 + (float) arg0 * this.field9038.field6692 + (float) arg1 * this.field9038.field6670 + this.field9038.field6700;
        if (!((float) this.field9076 > var6) && !(var6 > (float) this.field9114)) {
            int var7 = (int) (((float) arg2 * this.field9038.field6697 + (float) arg0 * this.field9038.field6696 + (float) arg1 * this.field9038.field6704 + this.field9038.field6702) * (float) this.field9072 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field9038.field6705 + (float) arg0 * this.field9038.field6669 + (float) arg1 * this.field9038.field6689 + this.field9038.field6681) * (float) this.field9087 / (float) arg3);
            if ((float) var7 >= this.field9120 && this.field9102 >= (float) var7 && (float) var8 >= this.field9153 && this.field9065 >= (float) var8) {
                arg4[0] = (int) ((float) var7 + -this.field9120);
                arg4[2] = (int) var6;
                arg4[1] = (int) ((float) var8 + -this.field9153);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "(I)V")
    public final void method1521(int arg0) {
        ++field8829;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "(IIIIII)V")
    public final void method1534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8807;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method3683(5121);
        this.method3737(0, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field9067) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field9067) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIIII)V")
    public final void method1442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field8987;
        this.method1434(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!dw", name = "E", descriptor = "()I")
    public final int method1509() {
        ++field8851;
        return this.field9025 + this.field9024 + this.field9023;
    }

    @OriginalMember(owner = "client!dw", name = "DA", descriptor = "(IIII)V")
    public final void method1421(int arg0, int arg1, int arg2, int arg3) {
        this.field9072 = arg2;
        ++field8821;
        this.field9087 = arg3;
        this.field9054 = arg1;
        this.field9112 = arg0;
        this.method3673((byte) -3);
        this.method3692(false);
        if (this.field9143 == 3) {
            this.method3678(5888);
        } else if (~this.field9143 == -3) {
            this.method3704((byte) -110);
        }
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(IIII)V")
    public final void method3741(int arg0, int arg1, int arg2, int arg3) {
        ++field8854;
        OpenGL.glDrawArrays(arg2, arg1, arg0);
        if (arg3 != 0) {
            this.method1470(-127, -62, 64, -1, -29, -46, (class573) null, -26, 83);
        }
    }

    @OriginalMember(owner = "client!dw", name = "y", descriptor = "()Z")
    public final boolean method1430() {
        ++field8805;
        return true;
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "()Z")
    public final boolean method289() {
        ++field8883;
        return this.field8997 != null && this.field8997.method1323(1);
    }

    @OriginalMember(owner = "client!dw", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method1449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field8874;
        float var10;
        float var11;
        if (this.field9093 != null && ~arg2 >= ~this.field9093.field4964 && this.field9093.field4972 >= arg3) {
            this.field9093.method2236(0, arg6, arg2, 0, false, 0, arg3, false, 6406, 0);
            var10 = (float) arg2 * this.field9093.field9791 / (float) this.field9093.field4964;
            var11 = (float) arg3 * this.field9093.field9782 / (float) this.field9093.field4972;
        } else {
            this.field9093 = class457.method2792(arg2, 6406, false, 6406, this, arg3, 113, arg6);
            this.field9093.method2230(3314, false, false);
            var11 = this.field9093.field9782;
            var10 = this.field9093.field9791;
        }
        this.method3712(0);
        this.method3681(this.field9093, 0);
        this.method3737(0, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method3752(arg5, (byte) 127);
        this.method3729((byte) 95, 34165, 34165);
        this.method3718(34166, 103, 768, 0);
        this.method3718(5890, 98, 770, 2);
        this.method3715(34166, 770, 0, (byte) -118);
        this.method3715(5890, 770, 2, (byte) -95);
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
        this.method3718(5890, 100, 768, 0);
        this.method3718(34166, 101, 770, 2);
        this.method3715(5890, 770, 0, (byte) -99);
        this.method3715(34166, 770, 2, (byte) -66);
    }

    @OriginalMember(owner = "client!dw", name = "KA", descriptor = "(IIII)V")
    public final void method1544(int arg0, int arg1, int arg2, int arg3) {
        ++field8940;
        if (~arg1 > -1) {
            arg1 = 0;
        }
        if (arg2 > this.field8828) {
            arg2 = this.field8828;
        }
        if (arg3 > this.field8986) {
            arg3 = this.field8986;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        this.field9124 = arg3;
        this.field9056 = arg0;
        this.field9144 = arg2;
        this.field9081 = arg1;
        OpenGL.glEnable(3089);
        this.method3692(false);
        this.method3691(-34845);
    }

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "(I)V")
    private final void method3742(int arg0) {
        ++field8844;
        this.field9132[10] = this.field9062;
        this.field9132[14] = this.field9097;
        this.field9046 = (float) this.field9114;
        if (arg0 != 34162) {
            this.method1426();
        }
        this.field9066 = (this.field9132[14] - (float) this.field9114) / this.field9132[10];
    }

    @OriginalMember(owner = "client!dw", name = "s", descriptor = "()Z")
    public final boolean method1389() {
        ++field8846;
        return true;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lej;[Loia;Z)Lda;")
    public final class402 method1392(class179 arg0, class52[] arg1, boolean arg2) {
        ++field8965;
        return new class628(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "(B)V")
    private final void method3743(byte arg0) {
        int var2 = -84 % ((arg0 - 26) / 59);
        ++field8885;
        if (this.field9101 && !this.field9119) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "(B)V")
    public final void method3744(byte arg0) {
        if (arg0 != -84) {
            this.field9005 = null;
        }
        ++field8802;
        OpenGL.glLightfv(16384, 4611, this.field9104, 0);
        OpenGL.glLightfv(16385, 4611, this.field9098, 0);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ltu;I)V")
    public final void method3745(class480 arg0, int arg1) {
        OpenGL.glLoadMatrixf(arg0.method2926(-4504), 0);
        ++field8811;
        if (arg1 >= -44) {
            this.field9101 = true;
        }
    }

    @OriginalMember(owner = "client!dw", name = "T", descriptor = "(IIII)V")
    public final void method1415(int arg0, int arg1, int arg2, int arg3) {
        if (this.field9081 < arg1) {
            this.field9081 = arg1;
        }
        if (this.field9124 > arg3) {
            this.field9124 = arg3;
        }
        if (~this.field9144 < ~arg2) {
            this.field9144 = arg2;
        }
        ++field8955;
        if (~this.field9056 > ~arg0) {
            this.field9056 = arg0;
        }
        OpenGL.glEnable(3089);
        this.method3692(false);
        this.method3691(-34845);
    }

    @OriginalMember(owner = "client!dw", name = "A", descriptor = "(I)V")
    public final void method3746(int arg0) {
        OpenGL.glPopMatrix();
        if (arg0 >= -127) {
            this.field9149 = true;
        }
        ++field8953;
    }

    @OriginalMember(owner = "client!dw", name = "pa", descriptor = "()V")
    public final void method1531() {
        this.field9113 = false;
        ++field8922;
    }

    @OriginalMember(owner = "client!dw", name = "o", descriptor = "(B)V")
    private final void method3747(byte arg0) {
        if (arg0 <= -62) {
            ++field8945;
            int var2 = 0;
            while (!this.field8878.method3329()) {
                if (var2++ > 5) {
                    throw new RuntimeException("");
                }
                class688.method3874(1000L, -7375);
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lbia;I)V")
    public final void method3748(class411 arg0, int arg1) {
        if (arg1 < 92) {
            this.method3722(-33, (class480) null);
        }
        if (this.field9074 != arg0) {
            if (this.field9088) {
                OpenGL.glBindBufferARB(34962, arg0.method745((byte) 91));
            }
            this.field9074 = arg0;
        }
        ++field8942;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lvo;IIII)Lka;")
    public final class284 method1463(class133 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8834;
        return new class378(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(BII)V")
    public final synchronized void method3749(byte arg0, int arg1, int arg2) {
        ++field8796;
        if (arg0 < -53) {
            class27 var4 = new class27(arg2);
            var4.field1079 = (long) arg1;
            this.field9027.method3610(9289, var4);
        }
    }

    @OriginalMember(owner = "client!dw", name = "B", descriptor = "(I)V")
    private final void method3750(int arg0) {
        int var2 = -4 % ((-37 - arg0) / 53);
        ++field8956;
        if (this.field9143 != 3) {
            this.field9143 = 3;
            this.method3678(5888);
            this.method3716(false);
            this.field9039 &= -8;
        }
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(ILlt;)V")
    public final void method3751(int arg0, class620 arg1) {
        ++field8935;
        if (~this.field9018 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field9018 <= -1) {
                this.field9016[this.field9018].method3503(-19510);
            }
            int var3 = 25 % ((2 - arg0) / 57);
            this.field9017 = this.field9016[++this.field9018] = arg1;
            this.field9017.method3499(31714);
        }
    }

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "()Z")
    public final boolean method1447() {
        ++field8870;
        return true;
    }

    @OriginalMember(owner = "client!dw", name = "za", descriptor = "(IIIII)V")
    public final void method1439(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        ++field8890;
        if (arg0 + arg2 >= this.field9056 && ~(-arg2 + arg0) >= ~this.field9144 && arg1 - -arg2 >= this.field9081 && -arg2 + arg1 <= this.field9124) {
            this.method3683(5121);
            this.method3737(0, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field9130) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if ((float) var8 <= this.field9139) {
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
                if (~var9 >= -65) {
                    var9 = 64;
                } else if (~var9 < -513) {
                    var9 = 512;
                }
                int var10 = class375.method2354(var9, (byte) 41);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class402.field5763[var11] * (float) arg2 + var6, class402.field5757[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method1522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class573 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field8849;
        if (~arg0 != ~arg2 || ~arg1 != ~arg3) {
            class444 var13 = (class444) arg6;
            class702 var14 = var13.field6165;
            this.method3712(0);
            this.method3681(var13.field6165, 0);
            this.method3737(0, arg5);
            this.method3729((byte) 95, 7681, 8448);
            this.method3718(34167, 127, 768, 0);
            float var15 = var14.field9791 / (float) var14.field9781;
            float var16 = var14.field9782 / (float) var14.field9793;
            float var17 = (float) arg2 - (float) arg0;
            float var18 = (float) arg3 - (float) arg1;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            float var20 = var17 * var19;
            int var21 = arg11 % (arg9 + arg10);
            float var22 = var18 * var19;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var23 = (float) arg9 * var20;
            float var24 = (float) arg9 * var22;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (var21 <= arg9) {
                var28 = (float) (-var21 + arg9) * var22;
                var27 = (float) (-var21 + arg9) * var20;
            } else {
                var26 = (float) (-var21 + arg10 + arg9) * var22;
                var25 = (float) (-var21 + arg10 + arg9) * var20;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var20;
            float var32 = (float) arg10 * var22;
            while (true) {
                if (arg0 >= arg2) {
                    if ((float) arg2 + 0.35F > var29) {
                        break;
                    }
                    if ((float) arg2 > var27 + var29) {
                        var27 = (float) arg2 - var29;
                    }
                } else {
                    if (var29 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if ((float) arg2 < var27 + var29) {
                        var27 = (float) arg2 - var29;
                    }
                }
                if (arg3 <= arg1) {
                    if ((float) arg3 + 0.35F > var30) {
                        break;
                    }
                    if ((float) arg3 > var28 + var30) {
                        var28 = (float) arg3 - var30;
                    }
                } else {
                    if (var30 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if (var28 + var30 > (float) arg3) {
                        var28 = (float) arg3 + -var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f((var29 - (float) arg7) * var15, ((float) (-arg8) + var30) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 - (float) arg7) * var15, (var28 + var30 + (float) (-arg8)) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                var29 += var27 + var31;
                OpenGL.glEnd();
                var30 += var28 + var32;
                var28 = var24;
                var27 = var23;
            }
            this.method3718(5890, 106, 768, 0);
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIII)V")
    public final void method284(int arg0, int arg1, int arg2, int arg3) {
        this.field8996.method2657(arg2, (byte) -102, arg3, arg0, arg1);
        ++field8875;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(FFF)V")
    public final void method306(float arg0, float arg1, float arg2) {
        class248.field3644 = arg1;
        class279.field4065 = arg2;
        ++field8920;
        client.field6238 = arg0;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IB)V")
    public final void method3752(int arg0, byte arg1) {
        class474.field6613[1] = (float) class665.method3759(arg0, 65280) / 65280.0F;
        int var3 = -95 / ((15 - arg1) / 63);
        class474.field6613[2] = (float) class665.method3759(arg0, 255) / 255.0F;
        class474.field6613[0] = (float) class665.method3759(16711680, arg0) / 1.671168E7F;
        class474.field6613[3] = (float) (arg0 >>> 24) / 255.0F;
        ++field8975;
        OpenGL.glTexEnvfv(8960, 8705, class474.field6613, 0);
    }
}
