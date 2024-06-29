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

@OriginalClass("client!lea")
public class class573 extends class475 {

    @OriginalMember(owner = "client!lea", name = "xb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field7976 = new Hashtable();

    @OriginalMember(owner = "client!lea", name = "je", descriptor = "I")
    public int field8118 = 128;

    @OriginalMember(owner = "client!lea", name = "pe", descriptor = "Lnh;")
    private class553 field8124 = new class553();

    @OriginalMember(owner = "client!lea", name = "ve", descriptor = "Liq;")
    private class229 field8130 = new class229();

    @OriginalMember(owner = "client!lea", name = "we", descriptor = "Liq;")
    public class229 field8131 = new class229();

    @OriginalMember(owner = "client!lea", name = "Ce", descriptor = "I")
    public int field8137 = 8;

    @OriginalMember(owner = "client!lea", name = "De", descriptor = "Z")
    private boolean field8138 = false;

    @OriginalMember(owner = "client!lea", name = "ze", descriptor = "I")
    public int field8134 = 3;

    @OriginalMember(owner = "client!lea", name = "xe", descriptor = "Low;")
    private class665 field8132 = new class665();

    @OriginalMember(owner = "client!lea", name = "Ge", descriptor = "[Luba;")
    private class331[] field8141 = new class331[4];

    @OriginalMember(owner = "client!lea", name = "Ie", descriptor = "[Luba;")
    private class331[] field8143 = new class331[4];

    @OriginalMember(owner = "client!lea", name = "Fe", descriptor = "I")
    private int field8140 = -1;

    @OriginalMember(owner = "client!lea", name = "Ke", descriptor = "I")
    private int field8145 = -1;

    @OriginalMember(owner = "client!lea", name = "Me", descriptor = "[Luba;")
    private class331[] field8147 = new class331[4];

    @OriginalMember(owner = "client!lea", name = "Ne", descriptor = "I")
    private int field8148 = -1;

    @OriginalMember(owner = "client!lea", name = "Qe", descriptor = "Low;")
    private class665 field8151;

    @OriginalMember(owner = "client!lea", name = "Se", descriptor = "Low;")
    private class665 field8153;

    @OriginalMember(owner = "client!lea", name = "Te", descriptor = "Low;")
    private class665 field8154;

    @OriginalMember(owner = "client!lea", name = "Ue", descriptor = "Low;")
    private class665 field8155;

    @OriginalMember(owner = "client!lea", name = "Ve", descriptor = "Low;")
    private class665 field8156;

    @OriginalMember(owner = "client!lea", name = "We", descriptor = "Low;")
    private class665 field8157;

    @OriginalMember(owner = "client!lea", name = "Xe", descriptor = "Low;")
    private class665 field8158;

    @OriginalMember(owner = "client!lea", name = "df", descriptor = "Liq;")
    public class229 field8164;

    @OriginalMember(owner = "client!lea", name = "hf", descriptor = "Liq;")
    public class229 field8168;

    @OriginalMember(owner = "client!lea", name = "jf", descriptor = "Liq;")
    public class229 field8169;

    @OriginalMember(owner = "client!lea", name = "Cf", descriptor = "F")
    private float field8188;

    @OriginalMember(owner = "client!lea", name = "Hf", descriptor = "F")
    public float field8193;

    @OriginalMember(owner = "client!lea", name = "rf", descriptor = "I")
    public int field8177;

    @OriginalMember(owner = "client!lea", name = "uf", descriptor = "I")
    private int field8180;

    @OriginalMember(owner = "client!lea", name = "Bf", descriptor = "I")
    private int field8187;

    @OriginalMember(owner = "client!lea", name = "Ff", descriptor = "I")
    private int field8191;

    @OriginalMember(owner = "client!lea", name = "cg", descriptor = "I")
    public int field8214;

    @OriginalMember(owner = "client!lea", name = "bg", descriptor = "Z")
    private boolean field8213;

    @OriginalMember(owner = "client!lea", name = "Gf", descriptor = "I")
    private int field8192;

    @OriginalMember(owner = "client!lea", name = "zg", descriptor = "I")
    public int field8237;

    @OriginalMember(owner = "client!lea", name = "sf", descriptor = "F")
    public float field8178;

    @OriginalMember(owner = "client!lea", name = "Dg", descriptor = "F")
    private float field8241;

    @OriginalMember(owner = "client!lea", name = "Hg", descriptor = "I")
    private int field8245;

    @OriginalMember(owner = "client!lea", name = "Qf", descriptor = "F")
    public float field8202;

    @OriginalMember(owner = "client!lea", name = "Nf", descriptor = "I")
    public int field8199;

    @OriginalMember(owner = "client!lea", name = "Ng", descriptor = "I")
    public int field8251;

    @OriginalMember(owner = "client!lea", name = "Ig", descriptor = "[F")
    private float[] field8246;

    @OriginalMember(owner = "client!lea", name = "Ug", descriptor = "[F")
    private float[] field8258;

    @OriginalMember(owner = "client!lea", name = "xg", descriptor = "F")
    private float field8235;

    @OriginalMember(owner = "client!lea", name = "Pg", descriptor = "Z")
    private boolean field8253;

    @OriginalMember(owner = "client!lea", name = "nf", descriptor = "F")
    public float field8173;

    @OriginalMember(owner = "client!lea", name = "Yg", descriptor = "F")
    public float field8262;

    @OriginalMember(owner = "client!lea", name = "ug", descriptor = "F")
    private float field8232;

    @OriginalMember(owner = "client!lea", name = "vf", descriptor = "I")
    public int field8181;

    @OriginalMember(owner = "client!lea", name = "bh", descriptor = "F")
    public float field8265;

    @OriginalMember(owner = "client!lea", name = "fg", descriptor = "I")
    public int field8217;

    @OriginalMember(owner = "client!lea", name = "zf", descriptor = "I")
    private int field8185;

    @OriginalMember(owner = "client!lea", name = "vg", descriptor = "I")
    private int field8233;

    @OriginalMember(owner = "client!lea", name = "gh", descriptor = "I")
    private int field8270;

    @OriginalMember(owner = "client!lea", name = "Og", descriptor = "I")
    public int field8252;

    @OriginalMember(owner = "client!lea", name = "Sf", descriptor = "I")
    public int field8204;

    @OriginalMember(owner = "client!lea", name = "nh", descriptor = "F")
    private float field8277;

    @OriginalMember(owner = "client!lea", name = "Zg", descriptor = "[F")
    private float[] field8263;

    @OriginalMember(owner = "client!lea", name = "hh", descriptor = "I")
    private int field8271;

    @OriginalMember(owner = "client!lea", name = "oh", descriptor = "[F")
    public float[] field8278;

    @OriginalMember(owner = "client!lea", name = "og", descriptor = "I")
    public int field8226;

    @OriginalMember(owner = "client!lea", name = "Tg", descriptor = "I")
    public int field8257;

    @OriginalMember(owner = "client!lea", name = "kh", descriptor = "I")
    private int field8274;

    @OriginalMember(owner = "client!lea", name = "mg", descriptor = "[F")
    private float[] field8224;

    @OriginalMember(owner = "client!lea", name = "jh", descriptor = "F")
    public float field8273;

    @OriginalMember(owner = "client!lea", name = "Eg", descriptor = "[Lmfa;")
    private class217[] field8242;

    @OriginalMember(owner = "client!lea", name = "Ag", descriptor = "Lbca;")
    public class501 field8238;

    @OriginalMember(owner = "client!lea", name = "rh", descriptor = "[B")
    public byte[] field8281;

    @OriginalMember(owner = "client!lea", name = "uh", descriptor = "[I")
    public int[] field8284;

    @OriginalMember(owner = "client!lea", name = "th", descriptor = "[I")
    public int[] field8283;

    @OriginalMember(owner = "client!lea", name = "wh", descriptor = "[I")
    public int[] field8286;

    @OriginalMember(owner = "client!lea", name = "te", descriptor = "I")
    public int field8128;

    @OriginalMember(owner = "client!lea", name = "Rc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8048;

    @OriginalMember(owner = "client!lea", name = "Ud", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8103;

    @OriginalMember(owner = "client!lea", name = "Ed", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field8087;

    @OriginalMember(owner = "client!lea", name = "qb", descriptor = "J")
    private long field7969;

    @OriginalMember(owner = "client!lea", name = "wd", descriptor = "J")
    private long field8079;

    @OriginalMember(owner = "client!lea", name = "tg", descriptor = "Z")
    public boolean field8231;

    @OriginalMember(owner = "client!lea", name = "wg", descriptor = "I")
    public int field8234;

    @OriginalMember(owner = "client!lea", name = "Mg", descriptor = "Ljava/lang/String;")
    private String field8250;

    @OriginalMember(owner = "client!lea", name = "xf", descriptor = "Z")
    public boolean field8183;

    @OriginalMember(owner = "client!lea", name = "wf", descriptor = "Z")
    public boolean field8182;

    @OriginalMember(owner = "client!lea", name = "rg", descriptor = "Z")
    private boolean field8229;

    @OriginalMember(owner = "client!lea", name = "ig", descriptor = "Z")
    public boolean field8220;

    @OriginalMember(owner = "client!lea", name = "ag", descriptor = "Z")
    public boolean field8212;

    @OriginalMember(owner = "client!lea", name = "mh", descriptor = "Z")
    private boolean field8276;

    @OriginalMember(owner = "client!lea", name = "ah", descriptor = "Ljava/lang/String;")
    private String field8264;

    @OriginalMember(owner = "client!lea", name = "Vf", descriptor = "Z")
    public boolean field8207;

    @OriginalMember(owner = "client!lea", name = "Of", descriptor = "Z")
    private boolean field8200;

    @OriginalMember(owner = "client!lea", name = "oe", descriptor = "Loha;")
    private class561 field8123;

    @OriginalMember(owner = "client!lea", name = "Be", descriptor = "Lim;")
    public class436 field8136;

    @OriginalMember(owner = "client!lea", name = "he", descriptor = "Lqc;")
    private class212 field8116;

    @OriginalMember(owner = "client!lea", name = "ke", descriptor = "Lvc;")
    private class151 field8119;

    @OriginalMember(owner = "client!lea", name = "me", descriptor = "Lrr;")
    private class411 field8121;

    @OriginalMember(owner = "client!lea", name = "Hd", descriptor = "[[I")
    public static int[][] field8090 = new int[6][];

    @OriginalMember(owner = "client!lea", name = "Sd", descriptor = "Lsv;")
    public static class570 field8101 = new class570(14, -1);

    @OriginalMember(owner = "client!lea", name = "ue", descriptor = "Lin;")
    public static class380 field8129 = new class380(132, 4);

    @OriginalMember(owner = "client!lea", name = "Mf", descriptor = "F")
    private float field8198;

    @OriginalMember(owner = "client!lea", name = "Xf", descriptor = "F")
    public float field8209;

    @OriginalMember(owner = "client!lea", name = "Zf", descriptor = "F")
    private float field8211;

    @OriginalMember(owner = "client!lea", name = "Fg", descriptor = "F")
    public float field8243;

    @OriginalMember(owner = "client!lea", name = "Jg", descriptor = "F")
    public float field8247;

    @OriginalMember(owner = "client!lea", name = "Sg", descriptor = "F")
    public float field8256;

    @OriginalMember(owner = "client!lea", name = "dh", descriptor = "F")
    public float field8267;

    @OriginalMember(owner = "client!lea", name = "eh", descriptor = "F")
    public float field8268;

    @OriginalMember(owner = "client!lea", name = "ih", descriptor = "F")
    private float field8272;

    @OriginalMember(owner = "client!lea", name = "r", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!lea", name = "s", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!lea", name = "t", descriptor = "I")
    public static int field7920;

    @OriginalMember(owner = "client!lea", name = "u", descriptor = "I")
    public static int field7921;

    @OriginalMember(owner = "client!lea", name = "v", descriptor = "I")
    public static int field7922;

    @OriginalMember(owner = "client!lea", name = "w", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!lea", name = "x", descriptor = "I")
    public static int field7924;

    @OriginalMember(owner = "client!lea", name = "y", descriptor = "I")
    public static int field7925;

    @OriginalMember(owner = "client!lea", name = "z", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!lea", name = "A", descriptor = "I")
    public static int field7927;

    @OriginalMember(owner = "client!lea", name = "B", descriptor = "I")
    public static int field7928;

    @OriginalMember(owner = "client!lea", name = "C", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!lea", name = "D", descriptor = "I")
    public static int field7930;

    @OriginalMember(owner = "client!lea", name = "E", descriptor = "I")
    public static int field7931;

    @OriginalMember(owner = "client!lea", name = "F", descriptor = "I")
    public static int field7932;

    @OriginalMember(owner = "client!lea", name = "G", descriptor = "I")
    public static int field7933;

    @OriginalMember(owner = "client!lea", name = "H", descriptor = "I")
    public static int field7934;

    @OriginalMember(owner = "client!lea", name = "I", descriptor = "I")
    public static int field7935;

    @OriginalMember(owner = "client!lea", name = "J", descriptor = "I")
    public static int field7936;

    @OriginalMember(owner = "client!lea", name = "K", descriptor = "I")
    public static int field7937;

    @OriginalMember(owner = "client!lea", name = "L", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!lea", name = "M", descriptor = "I")
    public static int field7939;

    @OriginalMember(owner = "client!lea", name = "N", descriptor = "I")
    public static int field7940;

    @OriginalMember(owner = "client!lea", name = "O", descriptor = "I")
    public static int field7941;

    @OriginalMember(owner = "client!lea", name = "P", descriptor = "I")
    public static int field7942;

    @OriginalMember(owner = "client!lea", name = "Q", descriptor = "I")
    public static int field7943;

    @OriginalMember(owner = "client!lea", name = "R", descriptor = "I")
    public static int field7944;

    @OriginalMember(owner = "client!lea", name = "S", descriptor = "I")
    public static int field7945;

    @OriginalMember(owner = "client!lea", name = "T", descriptor = "I")
    public static int field7946;

    @OriginalMember(owner = "client!lea", name = "U", descriptor = "I")
    public static int field7947;

    @OriginalMember(owner = "client!lea", name = "V", descriptor = "I")
    public static int field7948;

    @OriginalMember(owner = "client!lea", name = "W", descriptor = "I")
    public static int field7949;

    @OriginalMember(owner = "client!lea", name = "X", descriptor = "I")
    public static int field7950;

    @OriginalMember(owner = "client!lea", name = "Y", descriptor = "I")
    public static int field7951;

    @OriginalMember(owner = "client!lea", name = "Z", descriptor = "I")
    public static int field7952;

    @OriginalMember(owner = "client!lea", name = "ab", descriptor = "I")
    public static int field7953;

    @OriginalMember(owner = "client!lea", name = "bb", descriptor = "I")
    public static int field7954;

    @OriginalMember(owner = "client!lea", name = "cb", descriptor = "I")
    public static int field7955;

    @OriginalMember(owner = "client!lea", name = "db", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!lea", name = "eb", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!lea", name = "fb", descriptor = "I")
    public static int field7958;

    @OriginalMember(owner = "client!lea", name = "gb", descriptor = "I")
    public static int field7959;

    @OriginalMember(owner = "client!lea", name = "hb", descriptor = "I")
    public static int field7960;

    @OriginalMember(owner = "client!lea", name = "ib", descriptor = "I")
    public static int field7961;

    @OriginalMember(owner = "client!lea", name = "jb", descriptor = "I")
    public static int field7962;

    @OriginalMember(owner = "client!lea", name = "kb", descriptor = "I")
    public static int field7963;

    @OriginalMember(owner = "client!lea", name = "lb", descriptor = "I")
    public static int field7964;

    @OriginalMember(owner = "client!lea", name = "mb", descriptor = "I")
    public static int field7965;

    @OriginalMember(owner = "client!lea", name = "nb", descriptor = "I")
    public static int field7966;

    @OriginalMember(owner = "client!lea", name = "ob", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!lea", name = "pb", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!lea", name = "rb", descriptor = "I")
    public static int field7970;

    @OriginalMember(owner = "client!lea", name = "sb", descriptor = "I")
    public static int field7971;

    @OriginalMember(owner = "client!lea", name = "tb", descriptor = "I")
    public static int field7972;

    @OriginalMember(owner = "client!lea", name = "ub", descriptor = "I")
    public static int field7973;

    @OriginalMember(owner = "client!lea", name = "vb", descriptor = "I")
    public static int field7974;

    @OriginalMember(owner = "client!lea", name = "wb", descriptor = "I")
    public static int field7975;

    @OriginalMember(owner = "client!lea", name = "yb", descriptor = "I")
    public static int field7977;

    @OriginalMember(owner = "client!lea", name = "zb", descriptor = "I")
    public static int field7978;

    @OriginalMember(owner = "client!lea", name = "Ab", descriptor = "I")
    public static int field7979;

    @OriginalMember(owner = "client!lea", name = "Bb", descriptor = "I")
    public static int field7980;

    @OriginalMember(owner = "client!lea", name = "Cb", descriptor = "I")
    public static int field7981;

    @OriginalMember(owner = "client!lea", name = "Db", descriptor = "I")
    public static int field7982;

    @OriginalMember(owner = "client!lea", name = "Eb", descriptor = "I")
    public static int field7983;

    @OriginalMember(owner = "client!lea", name = "Fb", descriptor = "I")
    public static int field7984;

    @OriginalMember(owner = "client!lea", name = "Gb", descriptor = "I")
    public static int field7985;

    @OriginalMember(owner = "client!lea", name = "Hb", descriptor = "I")
    private int field7986;

    @OriginalMember(owner = "client!lea", name = "Ib", descriptor = "I")
    public static int field7987;

    @OriginalMember(owner = "client!lea", name = "Jb", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!lea", name = "Kb", descriptor = "I")
    public static int field7989;

    @OriginalMember(owner = "client!lea", name = "Lb", descriptor = "I")
    public int field7990;

    @OriginalMember(owner = "client!lea", name = "Mb", descriptor = "I")
    public static int field7991;

    @OriginalMember(owner = "client!lea", name = "Nb", descriptor = "I")
    public static int field7992;

    @OriginalMember(owner = "client!lea", name = "Ob", descriptor = "I")
    public static int field7993;

    @OriginalMember(owner = "client!lea", name = "Pb", descriptor = "I")
    public static int field7994;

    @OriginalMember(owner = "client!lea", name = "Qb", descriptor = "I")
    public static int field7995;

    @OriginalMember(owner = "client!lea", name = "Rb", descriptor = "I")
    public static int field7996;

    @OriginalMember(owner = "client!lea", name = "Sb", descriptor = "I")
    public static int field7997;

    @OriginalMember(owner = "client!lea", name = "Tb", descriptor = "I")
    public static int field7998;

    @OriginalMember(owner = "client!lea", name = "Ub", descriptor = "I")
    public static int field7999;

    @OriginalMember(owner = "client!lea", name = "Vb", descriptor = "I")
    public static int field8000;

    @OriginalMember(owner = "client!lea", name = "Wb", descriptor = "I")
    public static int field8001;

    @OriginalMember(owner = "client!lea", name = "Xb", descriptor = "I")
    public static int field8002;

    @OriginalMember(owner = "client!lea", name = "Yb", descriptor = "I")
    public static int field8003;

    @OriginalMember(owner = "client!lea", name = "Zb", descriptor = "I")
    public static int field8004;

    @OriginalMember(owner = "client!lea", name = "ac", descriptor = "I")
    public static int field8005;

    @OriginalMember(owner = "client!lea", name = "bc", descriptor = "I")
    public static int field8006;

    @OriginalMember(owner = "client!lea", name = "cc", descriptor = "I")
    public static int field8007;

    @OriginalMember(owner = "client!lea", name = "dc", descriptor = "I")
    public static int field8008;

    @OriginalMember(owner = "client!lea", name = "ec", descriptor = "I")
    public static int field8009;

    @OriginalMember(owner = "client!lea", name = "fc", descriptor = "I")
    public static int field8010;

    @OriginalMember(owner = "client!lea", name = "gc", descriptor = "I")
    public static int field8011;

    @OriginalMember(owner = "client!lea", name = "hc", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!lea", name = "ic", descriptor = "I")
    public static int field8013;

    @OriginalMember(owner = "client!lea", name = "jc", descriptor = "I")
    public static int field8014;

    @OriginalMember(owner = "client!lea", name = "kc", descriptor = "I")
    public int field8015;

    @OriginalMember(owner = "client!lea", name = "lc", descriptor = "I")
    public static int field8016;

    @OriginalMember(owner = "client!lea", name = "mc", descriptor = "I")
    public static int field8017;

    @OriginalMember(owner = "client!lea", name = "nc", descriptor = "I")
    public static int field8018;

    @OriginalMember(owner = "client!lea", name = "oc", descriptor = "I")
    public static int field8019;

    @OriginalMember(owner = "client!lea", name = "pc", descriptor = "I")
    public static int field8020;

    @OriginalMember(owner = "client!lea", name = "qc", descriptor = "I")
    public static int field8021;

    @OriginalMember(owner = "client!lea", name = "rc", descriptor = "I")
    public static int field8022;

    @OriginalMember(owner = "client!lea", name = "sc", descriptor = "I")
    public static int field8023;

    @OriginalMember(owner = "client!lea", name = "tc", descriptor = "I")
    public static int field8024;

    @OriginalMember(owner = "client!lea", name = "uc", descriptor = "I")
    public static int field8025;

    @OriginalMember(owner = "client!lea", name = "vc", descriptor = "I")
    private int field8026;

    @OriginalMember(owner = "client!lea", name = "wc", descriptor = "I")
    public static int field8027;

    @OriginalMember(owner = "client!lea", name = "xc", descriptor = "I")
    public static int field8028;

    @OriginalMember(owner = "client!lea", name = "yc", descriptor = "I")
    public static int field8029;

    @OriginalMember(owner = "client!lea", name = "zc", descriptor = "I")
    public static int field8030;

    @OriginalMember(owner = "client!lea", name = "Ac", descriptor = "I")
    public static int field8031;

    @OriginalMember(owner = "client!lea", name = "Bc", descriptor = "I")
    public static int field8032;

    @OriginalMember(owner = "client!lea", name = "Cc", descriptor = "I")
    public static int field8033;

    @OriginalMember(owner = "client!lea", name = "Dc", descriptor = "I")
    public static int field8034;

    @OriginalMember(owner = "client!lea", name = "Ec", descriptor = "I")
    public static int field8035;

    @OriginalMember(owner = "client!lea", name = "Fc", descriptor = "I")
    public static int field8036;

    @OriginalMember(owner = "client!lea", name = "Gc", descriptor = "I")
    public static int field8037;

    @OriginalMember(owner = "client!lea", name = "Hc", descriptor = "I")
    public static int field8038;

    @OriginalMember(owner = "client!lea", name = "Ic", descriptor = "I")
    public static int field8039;

    @OriginalMember(owner = "client!lea", name = "Jc", descriptor = "I")
    public static int field8040;

    @OriginalMember(owner = "client!lea", name = "Kc", descriptor = "I")
    public static int field8041;

    @OriginalMember(owner = "client!lea", name = "Lc", descriptor = "I")
    public static int field8042;

    @OriginalMember(owner = "client!lea", name = "Mc", descriptor = "I")
    public static int field8043;

    @OriginalMember(owner = "client!lea", name = "Nc", descriptor = "I")
    public static int field8044;

    @OriginalMember(owner = "client!lea", name = "Oc", descriptor = "I")
    public static int field8045;

    @OriginalMember(owner = "client!lea", name = "Pc", descriptor = "I")
    public static int field8046;

    @OriginalMember(owner = "client!lea", name = "Qc", descriptor = "I")
    public static int field8047;

    @OriginalMember(owner = "client!lea", name = "Sc", descriptor = "I")
    public static int field8049;

    @OriginalMember(owner = "client!lea", name = "Tc", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!lea", name = "Uc", descriptor = "I")
    public static int field8051;

    @OriginalMember(owner = "client!lea", name = "Vc", descriptor = "I")
    public static int field8052;

    @OriginalMember(owner = "client!lea", name = "Wc", descriptor = "I")
    public static int field8053;

    @OriginalMember(owner = "client!lea", name = "Xc", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!lea", name = "Yc", descriptor = "I")
    public static int field8055;

    @OriginalMember(owner = "client!lea", name = "Zc", descriptor = "I")
    public static int field8056;

    @OriginalMember(owner = "client!lea", name = "ad", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!lea", name = "bd", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!lea", name = "cd", descriptor = "I")
    public static int field8059;

    @OriginalMember(owner = "client!lea", name = "dd", descriptor = "I")
    public static int field8060;

    @OriginalMember(owner = "client!lea", name = "ed", descriptor = "I")
    public static int field8061;

    @OriginalMember(owner = "client!lea", name = "fd", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!lea", name = "gd", descriptor = "I")
    public static int field8063;

    @OriginalMember(owner = "client!lea", name = "hd", descriptor = "I")
    public static int field8064;

    @OriginalMember(owner = "client!lea", name = "id", descriptor = "I")
    public static int field8065;

    @OriginalMember(owner = "client!lea", name = "jd", descriptor = "I")
    public static int field8066;

    @OriginalMember(owner = "client!lea", name = "kd", descriptor = "I")
    public static int field8067;

    @OriginalMember(owner = "client!lea", name = "ld", descriptor = "I")
    public static int field8068;

    @OriginalMember(owner = "client!lea", name = "md", descriptor = "I")
    public static int field8069;

    @OriginalMember(owner = "client!lea", name = "nd", descriptor = "I")
    public static int field8070;

    @OriginalMember(owner = "client!lea", name = "od", descriptor = "I")
    public static int field8071;

    @OriginalMember(owner = "client!lea", name = "pd", descriptor = "I")
    public static int field8072;

    @OriginalMember(owner = "client!lea", name = "qd", descriptor = "I")
    public static int field8073;

    @OriginalMember(owner = "client!lea", name = "rd", descriptor = "I")
    public static int field8074;

    @OriginalMember(owner = "client!lea", name = "sd", descriptor = "I")
    public static int field8075;

    @OriginalMember(owner = "client!lea", name = "td", descriptor = "I")
    public static int field8076;

    @OriginalMember(owner = "client!lea", name = "ud", descriptor = "I")
    public static int field8077;

    @OriginalMember(owner = "client!lea", name = "vd", descriptor = "I")
    public static int field8078;

    @OriginalMember(owner = "client!lea", name = "xd", descriptor = "I")
    public static int field8080;

    @OriginalMember(owner = "client!lea", name = "yd", descriptor = "I")
    public static int field8081;

    @OriginalMember(owner = "client!lea", name = "zd", descriptor = "I")
    public static int field8082;

    @OriginalMember(owner = "client!lea", name = "Ad", descriptor = "I")
    public static int field8083;

    @OriginalMember(owner = "client!lea", name = "Bd", descriptor = "I")
    public static int field8084;

    @OriginalMember(owner = "client!lea", name = "Cd", descriptor = "I")
    public static int field8085;

    @OriginalMember(owner = "client!lea", name = "Dd", descriptor = "I")
    public static int field8086;

    @OriginalMember(owner = "client!lea", name = "Fd", descriptor = "I")
    public static int field8088;

    @OriginalMember(owner = "client!lea", name = "Gd", descriptor = "I")
    public static int field8089;

    @OriginalMember(owner = "client!lea", name = "Id", descriptor = "I")
    public static int field8091;

    @OriginalMember(owner = "client!lea", name = "Jd", descriptor = "I")
    public static int field8092;

    @OriginalMember(owner = "client!lea", name = "Kd", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!lea", name = "Ld", descriptor = "I")
    public static int field8094;

    @OriginalMember(owner = "client!lea", name = "Md", descriptor = "I")
    public static int field8095;

    @OriginalMember(owner = "client!lea", name = "Nd", descriptor = "I")
    public static int field8096;

    @OriginalMember(owner = "client!lea", name = "Od", descriptor = "I")
    public static int field8097;

    @OriginalMember(owner = "client!lea", name = "Pd", descriptor = "I")
    public static int field8098;

    @OriginalMember(owner = "client!lea", name = "Qd", descriptor = "I")
    public static int field8099;

    @OriginalMember(owner = "client!lea", name = "Rd", descriptor = "I")
    public static int field8100;

    @OriginalMember(owner = "client!lea", name = "Td", descriptor = "I")
    public static int field8102;

    @OriginalMember(owner = "client!lea", name = "Vd", descriptor = "I")
    public static int field8104;

    @OriginalMember(owner = "client!lea", name = "Wd", descriptor = "I")
    public static int field8105;

    @OriginalMember(owner = "client!lea", name = "Xd", descriptor = "I")
    public static int field8106;

    @OriginalMember(owner = "client!lea", name = "Yd", descriptor = "I")
    public static int field8107;

    @OriginalMember(owner = "client!lea", name = "Zd", descriptor = "I")
    public static int field8108;

    @OriginalMember(owner = "client!lea", name = "ae", descriptor = "I")
    public static int field8109;

    @OriginalMember(owner = "client!lea", name = "be", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!lea", name = "ce", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!lea", name = "de", descriptor = "I")
    public static int field8112;

    @OriginalMember(owner = "client!lea", name = "ee", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!lea", name = "fe", descriptor = "I")
    public static int field8114;

    @OriginalMember(owner = "client!lea", name = "ge", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!lea", name = "ie", descriptor = "I")
    public static int field8117;

    @OriginalMember(owner = "client!lea", name = "le", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!lea", name = "ne", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!lea", name = "qe", descriptor = "I")
    public static int field8125;

    @OriginalMember(owner = "client!lea", name = "re", descriptor = "I")
    public static int field8126;

    @OriginalMember(owner = "client!lea", name = "se", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!lea", name = "ye", descriptor = "I")
    public int field8133;

    @OriginalMember(owner = "client!lea", name = "Oe", descriptor = "I")
    public int field8149;

    @OriginalMember(owner = "client!lea", name = "Pe", descriptor = "I")
    private int field8150;

    @OriginalMember(owner = "client!lea", name = "Re", descriptor = "I")
    public int field8152;

    @OriginalMember(owner = "client!lea", name = "Ze", descriptor = "I")
    private int field8160;

    @OriginalMember(owner = "client!lea", name = "bf", descriptor = "I")
    private int field8162;

    @OriginalMember(owner = "client!lea", name = "cf", descriptor = "I")
    private int field8163;

    @OriginalMember(owner = "client!lea", name = "lf", descriptor = "I")
    public int field8171;

    @OriginalMember(owner = "client!lea", name = "Ef", descriptor = "I")
    private int field8190;

    @OriginalMember(owner = "client!lea", name = "Kf", descriptor = "I")
    private int field8196;

    @OriginalMember(owner = "client!lea", name = "Tf", descriptor = "I")
    public int field8205;

    @OriginalMember(owner = "client!lea", name = "eg", descriptor = "I")
    public int field8216;

    @OriginalMember(owner = "client!lea", name = "jg", descriptor = "I")
    public int field8221;

    @OriginalMember(owner = "client!lea", name = "ng", descriptor = "I")
    private int field8225;

    @OriginalMember(owner = "client!lea", name = "sg", descriptor = "I")
    private int field8230;

    @OriginalMember(owner = "client!lea", name = "Lg", descriptor = "I")
    private int field8249;

    @OriginalMember(owner = "client!lea", name = "Vg", descriptor = "I")
    private int field8259;

    @OriginalMember(owner = "client!lea", name = "ch", descriptor = "I")
    private int field8266;

    @OriginalMember(owner = "client!lea", name = "fh", descriptor = "I")
    private int field8269;

    @OriginalMember(owner = "client!lea", name = "sh", descriptor = "I")
    private int field8282;

    @OriginalMember(owner = "client!lea", name = "vh", descriptor = "I")
    private int field8285;

    @OriginalMember(owner = "client!lea", name = "Ye", descriptor = "J")
    private long field8159;

    @OriginalMember(owner = "client!lea", name = "kf", descriptor = "Lpc;")
    public class282 field8170;

    @OriginalMember(owner = "client!lea", name = "tf", descriptor = "Lpc;")
    public class282 field8179;

    @OriginalMember(owner = "client!lea", name = "Pf", descriptor = "Luk;")
    private class296 field8201;

    @OriginalMember(owner = "client!lea", name = "He", descriptor = "Lqg;")
    private class303 field8142;

    @OriginalMember(owner = "client!lea", name = "hg", descriptor = "Lcq;")
    private class305 field8219;

    @OriginalMember(owner = "client!lea", name = "kg", descriptor = "Lcq;")
    private class305 field8222;

    @OriginalMember(owner = "client!lea", name = "Je", descriptor = "Luba;")
    private class331 field8144;

    @OriginalMember(owner = "client!lea", name = "Le", descriptor = "Luba;")
    private class331 field8146;

    @OriginalMember(owner = "client!lea", name = "lg", descriptor = "Lwi;")
    public class504 field8223;

    @OriginalMember(owner = "client!lea", name = "Yf", descriptor = "Lab;")
    private class650 field8210;

    @OriginalMember(owner = "client!lea", name = "of", descriptor = "Lqb;")
    public class68 field8174;

    @OriginalMember(owner = "client!lea", name = "Jf", descriptor = "Lqb;")
    public class68 field8195;

    @OriginalMember(owner = "client!lea", name = "Lf", descriptor = "Lqb;")
    public class68 field8197;

    @OriginalMember(owner = "client!lea", name = "pg", descriptor = "Lqb;")
    public class68 field8227;

    @OriginalMember(owner = "client!lea", name = "yg", descriptor = "Lqb;")
    public class68 field8236;

    @OriginalMember(owner = "client!lea", name = "Kg", descriptor = "Lqb;")
    public class68 field8248;

    @OriginalMember(owner = "client!lea", name = "Rg", descriptor = "Lqb;")
    public class68 field8255;

    @OriginalMember(owner = "client!lea", name = "Xg", descriptor = "Lqb;")
    public class68 field8261;

    @OriginalMember(owner = "client!lea", name = "lh", descriptor = "Lqb;")
    public class68 field8275;

    @OriginalMember(owner = "client!lea", name = "qh", descriptor = "Lqb;")
    public class68 field8280;

    @OriginalMember(owner = "client!lea", name = "dg", descriptor = "Ltj;")
    private class690 field8215;

    @OriginalMember(owner = "client!lea", name = "Ee", descriptor = "Lbq;")
    private class727 field8139;

    @OriginalMember(owner = "client!lea", name = "Gg", descriptor = "Lbq;")
    public class727 field8244;

    @OriginalMember(owner = "client!lea", name = "Ae", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field8135;

    @OriginalMember(owner = "client!lea", name = "af", descriptor = "Z")
    private boolean field8161;

    @OriginalMember(owner = "client!lea", name = "ef", descriptor = "Z")
    private boolean field8165;

    @OriginalMember(owner = "client!lea", name = "ff", descriptor = "Z")
    private boolean field8166;

    @OriginalMember(owner = "client!lea", name = "gf", descriptor = "Z")
    private boolean field8167;

    @OriginalMember(owner = "client!lea", name = "mf", descriptor = "Z")
    public boolean field8172;

    @OriginalMember(owner = "client!lea", name = "pf", descriptor = "Z")
    public boolean field8175;

    @OriginalMember(owner = "client!lea", name = "qf", descriptor = "Z")
    public boolean field8176;

    @OriginalMember(owner = "client!lea", name = "yf", descriptor = "Z")
    private boolean field8184;

    @OriginalMember(owner = "client!lea", name = "Af", descriptor = "Z")
    public boolean field8186;

    @OriginalMember(owner = "client!lea", name = "Df", descriptor = "Z")
    public boolean field8189;

    @OriginalMember(owner = "client!lea", name = "If", descriptor = "Z")
    public boolean field8194;

    @OriginalMember(owner = "client!lea", name = "Rf", descriptor = "Z")
    public boolean field8203;

    @OriginalMember(owner = "client!lea", name = "Uf", descriptor = "Z")
    private boolean field8206;

    @OriginalMember(owner = "client!lea", name = "Wf", descriptor = "Z")
    private boolean field8208;

    @OriginalMember(owner = "client!lea", name = "qg", descriptor = "Z")
    private boolean field8228;

    @OriginalMember(owner = "client!lea", name = "Bg", descriptor = "Z")
    private boolean field8239;

    @OriginalMember(owner = "client!lea", name = "Cg", descriptor = "Z")
    public boolean field8240;

    @OriginalMember(owner = "client!lea", name = "Qg", descriptor = "Z")
    private boolean field8254;

    @OriginalMember(owner = "client!lea", name = "Wg", descriptor = "Z")
    private boolean field8260;

    @OriginalMember(owner = "client!lea", name = "ph", descriptor = "Z")
    public boolean field8279;

    @OriginalMember(owner = "client!lea", name = "gg", descriptor = "[Lfga;")
    private class377[] field8218;

    @OriginalMember(owner = "client!lea", name = "za", descriptor = "(IIIII)V")
    public final void method502(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8106;
        if (~arg2 > -1) {
            arg2 = -arg2;
        }
        if (arg0 + arg2 >= this.field8233 && -arg2 + arg0 <= this.field8192 && arg1 + arg2 >= this.field8274 && ~(-arg2 + arg1) >= ~this.field8270) {
            this.method3324(1);
            this.method3308((byte) 76, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field8232) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field8277 >= (float) var8) {
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
                } else if (var9 > 512) {
                    var9 = 512;
                }
                int var10 = class515.method3025(var9, 592877665);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = 16384 - var10; var11 > 0; var11 -= var10) {
                    OpenGL.glVertex2f(class483.field6637[var11] * (float) arg2 + var6, class483.field6629[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lgka;)V")
    public final void method455(class667 arg0) {
        this.field8124.method3188(arg0, this, -1, (byte) -116);
        ++field8024;
    }

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "(I)V")
    private final void method3305(int arg0) {
        ++field7931;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field8246, 0);
        if (arg0 != 770) {
            this.field8282 = -79;
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(B)V")
    private final void method3306(byte arg0) {
        ++field8076;
        if (this.field8230 != 3) {
            this.field8230 = 3;
            this.method3341(false);
            this.method3330(112);
            this.field8160 &= -8;
        }
        if (arg0 <= 48) {
            this.field8275 = null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Luba;I)V")
    public final void method3307(class331 arg0, int arg1) {
        ++field7964;
        if (this.field8240) {
            this.method3327(arg0, false);
            this.method3318(arg0, -31027);
        } else {
            if (~this.field8148 <= -4) {
                throw new RuntimeException();
            }
            if (this.field8148 >= 0) {
                this.field8143[this.field8148].method2020(arg1 ^ 30942);
            }
            this.field8146 = this.field8144 = this.field8143[++this.field8148] = arg0;
            this.field8146.method2023(arg1 + -63460);
        }
        if (arg1 != 30909) {
            this.field8026 = -94;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(BI)V")
    public final void method3308(byte arg0, int arg1) {
        if (arg0 != 76) {
            this.method521(45, 125, 125, -1, -39);
        }
        if (~this.field8163 != ~arg1) {
            byte var3;
            boolean var4;
            boolean var5;
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -129) {
                        var3 = 0;
                        var4 = false;
                        var5 = true;
                    } else {
                        var3 = 3;
                        var4 = true;
                        var5 = true;
                    }
                } else {
                    var3 = 2;
                    var4 = false;
                    var5 = true;
                }
            } else {
                var4 = true;
                var3 = 1;
                var5 = true;
            }
            if (!var5 != !this.field8161) {
                OpenGL.glColorMask(var5, var5, var5, true);
                this.field8161 = var5;
            }
            if (this.field8165 != var4) {
                if (!var4) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field8165 = var4;
            }
            if (~this.field8162 != ~var3) {
                if (var3 != 1) {
                    if (~var3 == -3) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    } else if (var3 != 3) {
                        OpenGL.glDisable(3042);
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field8162 = var3;
            }
            this.field8163 = arg1;
            this.field8160 &= -29;
        }
        ++field8063;
    }

    @OriginalMember(owner = "client!lea", name = "na", descriptor = "(IIII)[I")
    public final int[] method82(int arg0, int arg1, int arg2, int arg3) {
        ++field8004;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, this.field8015 - (arg1 + var6), arg2, 1, 32993, this.field8234, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field7926;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = -arg3 + arg5;
        int var12 = arg7 - arg3;
        int var13 = arg5 * arg5;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 - -var17;
        int var24 = var14 - (var21 + -1) * var18;
        int var25 = (-var22 + 1) * var15 + var19;
        int var26 = -((var22 + -1) * var20) + var16;
        if (arg6 > -122) {
            field8101 = null;
        }
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 + -3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg7 + -1) * var27;
        int var37 = var30;
        int var38 = (var12 + -1) * var29;
        int[] var39 = class74.field1144[arg2];
        class379.method2284(arg4 - arg5, -var11 + arg4, var39, arg0, 2);
        class379.method2284(arg4 - var11, arg4 + var11, var39, arg1, 2);
        class379.method2284(arg4 + var11, arg4 - -arg5, var39, arg0, 2);
        while (var9 > 0) {
            boolean var40 = ~var12 <= ~var9;
            if (var40) {
                if (~var25 > -1) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        ++var10;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var37 += var30;
                    ++var10;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var29;
                var38 -= var29;
            }
            if (~var23 > -1) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    ++var8;
                    var31 += var28;
                    var35 += var28;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                ++var8;
                var35 += var28;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var32 -= var27;
            --var9;
            int var41 = -var9 + arg2;
            int var42 = arg2 + var9;
            int var43 = arg4 + var8;
            int var44 = -var8 + arg4;
            if (!var40) {
                class379.method2284(var44, var43, class74.field1144[var41], arg0, 2);
                class379.method2284(var44, var43, class74.field1144[var42], arg0, 2);
            } else {
                int var45 = arg4 + var10;
                int var46 = arg4 - var10;
                class379.method2284(var44, var46, class74.field1144[var41], arg0, 2);
                class379.method2284(var46, var45, class74.field1144[var41], arg1, 2);
                class379.method2284(var45, var43, class74.field1144[var41], arg0, 2);
                class379.method2284(var44, var46, class74.field1144[var42], arg0, 2);
                class379.method2284(var46, var45, class74.field1144[var42], arg1, 2);
                class379.method2284(var45, var43, class74.field1144[var42], arg0, 2);
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "ra", descriptor = "(IIII)V")
    public final void method476(int arg0, int arg1, int arg2, int arg3) {
        this.field8226 = arg3;
        this.field8252 = arg2;
        ++field8022;
        this.field8199 = arg1;
        this.field8171 = arg0;
        this.field8194 = true;
    }

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "(B)V")
    public final void method3310(byte arg0) {
        int var2 = -40 % ((-20 - arg0) / 54);
        ++field8052;
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!lea", name = "pa", descriptor = "()V")
    public final void method515() {
        this.field8194 = false;
        ++field7984;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Liq;I)V")
    public final void method3311(class229 arg0, int arg1) {
        OpenGL.glPushMatrix();
        ++field8127;
        OpenGL.glMultMatrixf(arg0.method1572(-40), arg1);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lgka;I)V")
    public final void method429(class667 arg0, int arg1) {
        ++field8038;
        this.field8124.method3188(arg0, this, arg1, (byte) -116);
    }

    @OriginalMember(owner = "client!lea", name = "A", descriptor = "()V")
    public final void method138() {
        ++field8072;
        if (this.field8200 && ~this.field7990 < -1 && this.field8015 > 0) {
            int var1 = this.field8233;
            int var2 = this.field8192;
            int var3 = this.field8274;
            int var4 = this.field8270;
            this.method512();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3340((byte) 10);
            this.method3326((byte) -120, false);
            this.method3385(false, -8);
            this.method3387(false, 119);
            this.method3377(-32, false);
            this.method3384((class377) null, (byte) 106);
            this.method3364(0, -2);
            this.method3375(1, (byte) 102);
            this.method3308((byte) 76, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field7990, this.field8015, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method488(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!lea", name = "k", descriptor = "(I)V")
    private final void method3312(int arg0) {
        this.field8246[10] = this.field8211;
        ++field7952;
        this.field8246[14] = this.field8272;
        this.field8262 = (float) this.field8180;
        this.field8178 = (this.field8246[14] - (float) this.field8180) / this.field8246[10];
        int var2 = -18 % ((arg0 - 60) / 36);
    }

    @OriginalMember(owner = "client!lea", name = "E", descriptor = "()I")
    public final int method474() {
        ++field8010;
        return this.field8152 - -this.field8149 + this.field8150;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IZ)V")
    public final void method3313(int arg0, boolean arg1) {
        if (arg0 == 2912) {
            ++field8099;
            if (arg1 == !this.field8239) {
                this.field8239 = arg1;
                this.method3368(-12967518);
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "I", descriptor = "()I")
    public final int method60() {
        ++field7936;
        int var1 = this.field8285;
        this.field8285 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!lea", name = "y", descriptor = "()Z")
    public final boolean method421() {
        ++field8009;
        return this.field8119 != null && (~this.field8128 >= -2 || this.field8228);
    }

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "(Z)V")
    public final void method3314(boolean arg0) {
        if (~this.field8160 != -9) {
            this.method3325(-28603);
            this.method3326((byte) -90, true);
            this.method3387(true, 85);
            this.method3377(-32, true);
            this.method3308((byte) 76, 1);
            this.field8160 = 8;
        }
        if (!arg0) {
            ++field7992;
        }
    }

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "()Ldm;")
    public final class765 method457() {
        ++field8041;
        return this.field8130;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ldm;)V")
    public final void method498(class765 arg0) {
        this.field8164.method1552(arg0);
        ++field7919;
        this.field8168.method1552(this.field8164);
        this.field8168.method1550(73);
        this.field8169.method1565(true, this.field8168);
        if (~this.field8230 != -2) {
            this.method3330(117);
        }
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "()Z")
    public final boolean method83() {
        ++field8008;
        if (this.field8119 != null) {
            if (!this.field8119.method2192(-23116)) {
                if (!this.field8116.method1468(71, this.field8119)) {
                    return false;
                }
                this.field8123.method3264(5);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lea", name = "g", descriptor = "(II)I")
    public final int method3315(int arg0, int arg1) {
        ++field8057;
        if (arg0 != 6406 && arg0 != 6409) {
            if (~arg0 != -6411 && arg0 != 34846 && arg0 != 34844) {
                if (arg0 != 6407) {
                    if (arg0 != 6408 && arg0 != 34847) {
                        if (~arg0 != -34844) {
                            if (arg0 == 34842) {
                                return 8;
                            } else if (arg0 != 6402) {
                                if (~arg0 == -6402) {
                                    return 1;
                                } else {
                                    if (arg1 != 30626) {
                                        this.method497(-56, -83);
                                    }
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
                    return 3;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!lea", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field8065;
        float var10;
        float var11;
        if (this.field8201 != null && arg2 <= this.field8201.field6926 && ~this.field8201.field6927 <= ~arg3) {
            this.field8201.method2950(arg3, (byte) 41, 6406, false, 0, arg6, 0, 0, 0, arg2);
            var10 = (float) arg2 * this.field8201.field4299 / (float) this.field8201.field6926;
            var11 = (float) arg3 * this.field8201.field4303 / (float) this.field8201.field6927;
        } else {
            this.field8201 = class119.method1047(this, false, arg2, 6406, 32515, arg3, 6406, arg6);
            this.field8201.method2952(false, false, false);
            var10 = this.field8201.field4299;
            var11 = this.field8201.field4303;
        }
        this.method3320(26936);
        this.method3384(this.field8201, (byte) 86);
        this.method3308((byte) 76, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method3343(arg5, 20710);
        this.method3359(34165, 34165, true);
        this.method3351(768, 0, 34166, (byte) -85);
        this.method3351(770, 2, 5890, (byte) -85);
        this.method3374(0, 770, 34166, -110);
        this.method3374(2, 770, 5890, 39);
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
        this.method3351(768, 0, 5890, (byte) -85);
        this.method3351(770, 2, 34166, (byte) -85);
        this.method3374(0, 770, 5890, -99);
        this.method3374(2, 770, 34166, -86);
    }

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "()V")
    public final void method115() {
        ++field8095;
        if (this.field8207) {
            if (this.field8139 != this.field8144) {
                throw new RuntimeException();
            }
            this.field8139.method4036(1, 0);
            this.field8139.method4036(1, 8);
            this.method3372((byte) -94, this.field8139);
        } else {
            if (!this.field8260) {
                throw new RuntimeException("");
            }
            this.field8142.method276(0, 0, this.field7990, this.field8015, 0, 0);
            this.field8087.setSurface(this.field8079);
        }
        this.field8142 = null;
        this.field7990 = this.field7986;
        this.field8015 = this.field8026;
        this.method3340((byte) 10);
        this.method3381((byte) -119);
        this.method512();
    }

    @OriginalMember(owner = "client!lea", name = "h", descriptor = "(II)V")
    public final synchronized void method3316(int arg0, int arg1) {
        ++field8126;
        class725 var3 = new class725(arg1);
        if (arg0 == 8448) {
            this.field8155.method3728((byte) 110, var3);
        }
    }

    @OriginalMember(owner = "client!lea", name = "f", descriptor = "()Lev;")
    public final class165 method108() {
        ++field7993;
        int var1 = -1;
        if (~this.field8264.indexOf("nvidia") != 0) {
            var1 = 4318;
        } else if (this.field8264.indexOf("intel") == -1) {
            if (~this.field8264.indexOf("ati") != 0) {
                var1 = 4098;
            }
        } else {
            var1 = 32902;
        }
        return new class165(var1, "OpenGL", this.field8269, this.field8250, 0L);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "([I)V")
    public final void method467(int[] arg0) {
        arg0[1] = this.field8015;
        ++field8017;
        arg0[0] = this.field7990;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(II)V")
    public final void method109(int arg0, int arg1) throws class684 {
        ++field7963;
        try {
            this.field8087.swapBuffers();
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Luba;Z)V")
    public final void method3317(class331 arg0, boolean arg1) {
        if (!arg1) {
            ++field8105;
            if (this.field8145 >= 0 && this.field8147[this.field8145] == arg0) {
                this.field8147[this.field8145--] = null;
                arg0.method2021(8690);
                if (~this.field8145 <= -1) {
                    this.field8146 = this.field8147[this.field8145];
                    this.field8146.method2022(-27546);
                } else {
                    this.field8146 = null;
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(Luba;I)V")
    public final void method3318(class331 arg0, int arg1) {
        ++field7921;
        if (~this.field8140 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field8140 <= -1) {
                this.field8141[this.field8140].method2024(true);
            }
            this.field8144 = this.field8141[++this.field8140] = arg0;
            this.field8144.method2019(false);
            if (arg1 != -31027) {
                this.field8214 = -47;
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(FZ)V")
    public final void method3319(float arg0, boolean arg1) {
        if (this.field8188 != arg0) {
            this.field8188 = arg0;
            if (this.field8230 == 3) {
                this.method3341(!arg1);
            }
        }
        ++field7965;
        if (!arg1) {
            this.method487((class418) null, false);
        }
    }

    @OriginalMember(owner = "client!lea", name = "DA", descriptor = "(IIII)V")
    public final void method449(int arg0, int arg1, int arg2, int arg3) {
        ++field7979;
        this.field8204 = arg3;
        this.field8237 = arg2;
        this.field8177 = arg1;
        this.field8217 = arg0;
        this.method3356(3042);
        this.method3367((byte) -122);
        if (~this.field8230 == -4) {
            this.method3341(false);
        } else if (this.field8230 == 2) {
            this.method3305(770);
        }
    }

    @OriginalMember(owner = "client!lea", name = "w", descriptor = "()Z")
    public final boolean method500() {
        ++field8007;
        return true;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, int arg7, int arg8) {
        ++field8096;
        class410 var10 = (class410) arg6;
        class296 var11 = var10.field5613;
        this.method3320(26936);
        this.method3384(var10.field5613, (byte) 101);
        this.method3308((byte) 76, arg5);
        this.method3359(7681, 8448, true);
        this.method3351(768, 0, 34167, (byte) -85);
        float var12 = var11.field4299 / (float) var11.field4301;
        float var13 = var11.field4303 / (float) var11.field4305;
        float var14 = (float) (-arg0) + (float) arg2;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var15 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var18 = var14 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var18 + 0.35F, (float) arg3 + var17 + 0.35F);
        OpenGL.glEnd();
        this.method3351(768, 0, 5890, (byte) -85);
    }

    @OriginalMember(owner = "client!lea", name = "l", descriptor = "(I)V")
    public final void method3320(int arg0) {
        if (arg0 != 26936) {
            this.method3361(-2.1886137F, 1.2233528F, -1.9111382F, (byte) -75, 0.970886F);
        }
        if (~this.field8160 != -3) {
            this.method3347((byte) 126);
            this.method3326((byte) -101, false);
            this.method3385(false, -8);
            this.method3387(false, 76);
            this.method3377(-32, false);
            this.method3364(arg0 + -26936, -2);
            this.field8160 = 2;
        }
        ++field8074;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIF)Lmfa;")
    public final class217 method427(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field8081;
        return new class152(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!lea", name = "i", descriptor = "(II)V")
    public final void method3321(int arg0, int arg1) {
        ++field8006;
        if (arg1 != -19587) {
            this.field8196 = -49;
        }
        if (this.field8190 != arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field8190 = arg0;
        }
    }

    @OriginalMember(owner = "client!lea", name = "g", descriptor = "(I)V")
    public final synchronized void method74(int arg0) {
        ++field8083;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field8153.method3723((byte) 101)) {
            class725 var12 = (class725) this.field8153.method3726(12691);
            class67.field992[var2++] = (int) var12.field10592;
            this.field8152 -= var12.field10098;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class67.field992, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteBuffersARB(var2, class67.field992, 0);
            var2 = 0;
        }
        while (!this.field8154.method3723((byte) 91)) {
            class725 var11 = (class725) this.field8154.method3726(12691);
            class67.field992[var2++] = (int) var11.field10592;
            this.field8149 -= var11.field10098;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class67.field992, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class67.field992, 0);
            var2 = 0;
        }
        while (!this.field8155.method3723((byte) 120)) {
            class725 var10 = (class725) this.field8155.method3726(12691);
            class67.field992[var2++] = var10.field10098;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class67.field992, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class67.field992, 0);
            var2 = 0;
        }
        while (!this.field8156.method3723((byte) 81)) {
            class725 var9 = (class725) this.field8156.method3726(12691);
            class67.field992[var2++] = (int) var9.field10592;
            this.field8150 -= var9.field10098;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class67.field992, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class67.field992, 0);
            boolean var4 = false;
        }
        while (!this.field8151.method3723((byte) 111)) {
            class725 var8 = (class725) this.field8151.method3726(12691);
            OpenGL.glDeleteLists((int) var8.field10592, var8.field10098);
        }
        while (!this.field8157.method3723((byte) 95)) {
            class766 var7 = this.field8157.method3726(12691);
            OpenGL.glDeleteProgramARB((int) var7.field10592);
        }
        while (!this.field8158.method3723((byte) 85)) {
            class766 var6 = this.field8158.method3726(12691);
            OpenGL.glDeleteObjectARB(var6.field10592);
        }
        while (!this.field8151.method3723((byte) 110)) {
            class725 var5 = (class725) this.field8151.method3726(12691);
            OpenGL.glDeleteLists((int) var5.field10592, var5.field10098);
        }
        this.field8123.method3267(5);
        if (~this.method474() < -100663297 && ~class337.method2062(false) < ~(this.field8159 + 60000L)) {
            System.gc();
            this.field8159 = class337.method2062(false);
        }
        this.field8133 = var3;
    }

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "(B)V")
    public static void method3322(byte arg0) {
        field8129 = null;
        if (arg0 != -33) {
            method3322((byte) -6);
        }
        field8090 = null;
        field8101 = null;
    }

    @OriginalMember(owner = "client!lea", name = "U", descriptor = "(IIIII)V")
    public final void method521(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7950;
        this.method3324(1);
        this.method3308((byte) 76, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!lea", name = "A", descriptor = "(ILaa;II)V")
    public final void method464(int arg0, class88 arg1, int arg2, int arg3) {
        ++field7970;
        class410 var5 = (class410) arg1;
        class296 var6 = var5.field5613;
        this.method3320(26936);
        this.method3384(var5.field5613, (byte) 93);
        this.method3308((byte) 76, 1);
        this.method3359(7681, 8448, true);
        this.method3351(768, 0, 34167, (byte) -85);
        float var7 = var6.field4299 / (float) var6.field4301;
        float var8 = var6.field4303 / (float) var6.field4305;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (this.field8233 - arg2) * var7, (float) (-arg3 + this.field8274) * var8);
        OpenGL.glVertex2i(this.field8233, this.field8274);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field8233) * var7, (float) (-arg3 + this.field8270) * var8);
        OpenGL.glVertex2i(this.field8233, this.field8270);
        OpenGL.glTexCoord2f((float) (this.field8192 - arg2) * var7, (float) (-arg3 + this.field8270) * var8);
        OpenGL.glVertex2i(this.field8192, this.field8270);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field8192) * var7, (float) (-arg3 + this.field8274) * var8);
        OpenGL.glVertex2i(this.field8192, this.field8274);
        OpenGL.glEnd();
        this.method3351(768, 0, 5890, (byte) -85);
    }

    @OriginalMember(owner = "client!lea", name = "q", descriptor = "()Z")
    public final boolean method443() {
        ++field7962;
        return true;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(FFF)V")
    public final void method57(float arg0, float arg1, float arg2) {
        class640.field9017 = arg0;
        class654.field9254 = arg2;
        class167.field2540 = arg1;
        ++field8068;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ltj;I)V")
    public final void method3323(class690 arg0, int arg1) {
        if (arg1 == 0) {
            ++field7935;
            if (this.field8215 != arg0) {
                if (this.field8229) {
                    OpenGL.glBindBufferARB(34963, arg0.method2599(18850));
                }
                this.field8215 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "m", descriptor = "(I)V")
    private final void method3324(int arg0) {
        ++field8111;
        if (~this.field8160 != -2) {
            this.method3347((byte) 86);
            this.method3326((byte) -92, false);
            this.method3385(false, -8);
            this.method3387(false, 84);
            this.method3377(-32, false);
            this.method3384((class377) null, (byte) 94);
            this.method3364(arg0 + -1, -2);
            this.method3375(1, (byte) 102);
            this.field8160 = 1;
        }
        if (arg0 != 1) {
            this.method3366(false);
        }
    }

    @OriginalMember(owner = "client!lea", name = "n", descriptor = "(I)V")
    private final void method3325(int arg0) {
        ++field7997;
        if (this.field8230 != 2) {
            this.field8230 = 2;
            this.method3305(770);
            this.method3330(arg0 + 28681);
            this.field8160 &= -8;
        }
        if (arg0 != -28603) {
            this.method488(78, -123, -25, -46);
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(BZ)V")
    public final void method3326(byte arg0, boolean arg1) {
        if (!arg1 == this.field8184) {
            this.field8184 = arg1;
            this.method3329(-96);
            this.field8160 &= -32;
        }
        ++field8037;
        if (arg0 >= -81) {
            this.method503(-36, -112, -97, 1, false);
        }
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(Luba;Z)V")
    public final void method3327(class331 arg0, boolean arg1) {
        ++field7923;
        if (this.field8145 >= 3) {
            throw new RuntimeException();
        } else {
            if (this.field8145 >= 0) {
                this.field8147[this.field8145].method2021(8690);
            }
            this.field8146 = this.field8147[++this.field8145] = arg0;
            this.field8146.method2022(-27546);
            if (arg1) {
                this.field8264 = null;
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "j", descriptor = "()Z")
    public final boolean method435() {
        ++field7991;
        return this.field8121.method2421((byte) -104, 3);
    }

    @OriginalMember(owner = "client!lea", name = "i", descriptor = "()I")
    public final int method462() {
        ++field8120;
        return this.field8214;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(JB)V")
    public final synchronized void method3328(long arg0, byte arg1) {
        ++field8043;
        class766 var4 = new class766();
        int var5 = -63 % ((arg1 - -65) / 51);
        var4.field10592 = arg0;
        this.field8158.method3728((byte) 100, var4);
    }

    @OriginalMember(owner = "client!lea", name = "o", descriptor = "(I)V")
    private final void method3329(int arg0) {
        ++field8067;
        if (this.field8184 && this.field8251 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 >= -79) {
            this.field8159 = 38L;
        }
    }

    @OriginalMember(owner = "client!lea", name = "p", descriptor = "(I)V")
    private final void method3330(int arg0) {
        ++field8021;
        OpenGL.glLoadIdentity();
        OpenGL.glMultMatrixf(this.field8168.method1572(79), 0);
        if (this.field8253) {
            this.field8121.field5625.method3441(true);
        }
        if (arg0 >= 51) {
            this.method3383(4611);
            this.method3352(1);
        }
    }

    @OriginalMember(owner = "client!lea", name = "P", descriptor = "(IIIII)V")
    public final void method468(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7980;
        this.method3324(1);
        this.method3308((byte) 76, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIZ)Lmq;")
    public final class85 method503(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field8107;
        return new class303(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "(B)Loh;")
    public final class653 method3331(byte arg0) {
        int var2 = -74 % ((-37 - arg0) / 55);
        ++field8005;
        return this.field8210 == null ? null : this.field8210.method677(0);
    }

    @OriginalMember(owner = "client!lea", name = "q", descriptor = "(I)V")
    private final void method3332(int arg0) {
        class123.field2084[1] = this.field8202 * this.field8173;
        class123.field2084[0] = this.field8273 * this.field8173;
        class123.field2084[3] = 1.0F;
        ++field8028;
        class123.field2084[2] = this.field8193 * this.field8173;
        OpenGL.glLightfv(16384, 4609, class123.field2084, arg0);
        class123.field2084[3] = 1.0F;
        class123.field2084[2] = -this.field8265 * this.field8193;
        class123.field2084[0] = -this.field8265 * this.field8273;
        class123.field2084[1] = -this.field8265 * this.field8202;
        OpenGL.glLightfv(16385, 4609, class123.field2084, 0);
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(IIIID)V")
    public final void method79(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field8047;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "([BZBII)Ltj;")
    public final class690 method3333(byte[] arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        int var6 = -16 % ((arg2 - -84) / 32);
        ++field8088;
        return (class690) (!this.field8229 || arg1 && !this.field8276 ? new class700(this, arg3, arg0, arg4) : new class435(this, arg3, arg0, arg4, arg1));
    }

    @OriginalMember(owner = "client!lea", name = "r", descriptor = "(I)V")
    private final void method3334(int arg0) {
        this.method3364(0, -2);
        ++field7940;
        for (int var2 = this.field8216 + -1; var2 >= 0; --var2) {
            this.method3321(var2, -19587);
            this.method3384((class377) null, (byte) 84);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method3359(8448, 8448, true);
        this.method3351(770, 2, 34168, (byte) -85);
        this.method3363(-9251);
        this.field8163 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field8162 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field8165 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field8161 = true;
        this.method3326((byte) -82, true);
        this.method3385(true, -8);
        this.method3387(true, 98);
        this.method3377(-32, true);
        this.method3340((byte) 10);
        if (arg0 < -94) {
            this.field8087.setSwapInterval(0);
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
            this.field8185 = this.field8257 = -1;
            this.method512();
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIII)V")
    public final void method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field8077;
        this.method453(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "([IIIIIZ)Lmq;")
    public final class85 method460(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8020;
        return new class303(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lea", name = "j", descriptor = "(II)I")
    public final int method3335(int arg0, int arg1) {
        int var3 = -28 % ((arg1 - 72) / 53);
        ++field8104;
        if (~arg0 != -5122 && ~arg0 != -5121) {
            if (arg0 != 5123 && ~arg0 != -5123) {
                if (~arg0 != -5126 && arg0 != 5124 && arg0 != 5126) {
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

    @OriginalMember(owner = "client!lea", name = "EA", descriptor = "(IIII)V")
    public final void method440(int arg0, int arg1, int arg2, int arg3) {
        ++field7954;
        if (!this.field8194) {
            throw new RuntimeException("");
        } else {
            this.field8171 = arg0;
            this.field8226 = arg3;
            this.field8252 = arg2;
            this.field8199 = arg1;
            if (this.field8253) {
                this.field8121.field5625.method3441(true);
                this.field8121.field5625.method3440(1);
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "([BIIBZ)Lcq;")
    public final class305 method3336(byte[] arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        if (arg3 <= 60) {
            this.field8171 = 2;
        }
        ++field7967;
        return (class305) (!this.field8229 || arg4 && !this.field8276 ? new class311(this, arg1, arg0, arg2) : new class184(this, arg1, arg0, arg2, arg4));
    }

    @OriginalMember(owner = "client!lea", name = "M", descriptor = "()I")
    public final int method473() {
        ++field8012;
        int var1 = this.field8282;
        this.field8282 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!lea", name = "n", descriptor = "()Ldm;")
    public final class765 method489() {
        ++field7973;
        return this.field8164;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field7959;
        this.method3324(1);
        this.method3308((byte) 76, arg12);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!lea", name = "s", descriptor = "(I)V")
    private final void method3337(int arg0) {
        this.field8218 = new class377[this.field8216];
        ++field8091;
        this.field8223 = new class504(this, 3553, 6408, 1, 1);
        new class504(this, 3553, 6408, 1, 1);
        new class504(this, 3553, 6408, 1, 1);
        int var2 = -74 % ((63 - arg0) / 57);
        this.field8255 = new class68(this);
        this.field8197 = new class68(this);
        this.field8280 = new class68(this);
        this.field8248 = new class68(this);
        this.field8236 = new class68(this);
        this.field8195 = new class68(this);
        this.field8261 = new class68(this);
        this.field8275 = new class68(this);
        this.field8227 = new class68(this);
        this.field8174 = new class68(this);
        if (this.field8207) {
            this.field8244 = new class727(this);
            new class727(this);
        }
    }

    @OriginalMember(owner = "client!lea", name = "Y", descriptor = "()[I")
    public final int[] method459() {
        ++field8044;
        return new int[] { this.field8217, this.field8177, this.field8237, this.field8204 };
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IBIII)V")
    public static final void method3338(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 == -94) {
            ++field7989;
            int var5 = class167.field2539;
            if (~var5 != -1) {
                if (var5 != 1) {
                    if (~var5 == -3) {
                        if (~arg0 < ~class646.field9177) {
                            class646.field9177 = arg0;
                        }
                        if (~arg4 > ~class133.field2230) {
                            class133.field2230 = arg4;
                        }
                        if (~class293.field4288 < ~arg2) {
                            class293.field4288 = arg2;
                        }
                        if (~arg3 < ~class339.field4814) {
                            class339.field4814 = arg3;
                        }
                    }
                } else {
                    class133.field2230 = arg4;
                    class339.field4814 = arg3;
                    class293.field4288 = arg2;
                    class646.field9177 = arg0;
                    class167.field2539 = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIILtj;I)V")
    public final void method3339(int arg0, int arg1, int arg2, class690 arg3, int arg4) {
        ++field8115;
        int var6 = arg3.method2597((byte) -79);
        int var7 = arg2 * this.method3335(var6, 127);
        this.method3323(arg3, 0);
        OpenGL.glDrawElements(arg4, arg1, var6, arg3.method2596(10385) - -((long) var7));
        if (arg0 >= -102) {
            this.field8276 = false;
        }
    }

    @OriginalMember(owner = "client!lea", name = "f", descriptor = "(II)V")
    public final void method484(int arg0, int arg1) {
        ++field7934;
        if (this.field8214 != arg0 || this.field8180 != arg1) {
            this.field8180 = arg1;
            this.field8214 = arg0;
            this.method3356(3042);
            this.method3369(16013);
            if (this.field8230 != 3) {
                if (this.field8230 == 2) {
                    this.method3305(770);
                    return;
                }
            } else {
                this.method3341(false);
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "f", descriptor = "(B)V")
    public final void method3340(byte arg0) {
        if (this.field8230 != 0) {
            this.field8230 = 0;
            this.field8160 &= -32;
        }
        ++field7932;
        if (arg0 != 10) {
            this.method3357(-4);
        }
    }

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "(Z)V")
    private final void method3341(boolean arg0) {
        ++field8054;
        if (!arg0) {
            float var2 = (float) (-this.field8217) * this.field8188 / (float) this.field8237;
            float var3 = (float) (-this.field8177) * this.field8188 / (float) this.field8204;
            float var4 = (float) (-this.field8217 + this.field7990) * this.field8188 / (float) this.field8237;
            float var5 = (float) (this.field8015 - this.field8177) * this.field8188 / (float) this.field8204;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (var2 != var4 && var3 != var5) {
                OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field8214, (double) this.field8180);
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lvr;Lvr;FLvr;)Lvr;")
    public final class458 method94(class458 arg0, class458 arg1, float arg2, class458 arg3) {
        ++field7998;
        if (arg0 != null && arg1 != null && this.field8176 && this.field8207) {
            class237 var5 = null;
            class650 var6 = (class650) arg0;
            class650 var7 = (class650) arg1;
            class653 var8 = var6.method677(0);
            class653 var9 = var7.method677(0);
            if (var8 != null && var9 != null) {
                int var10 = ~var9.field9240 > ~var8.field9240 ? var8.field9240 : var9.field9240;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class237) {
                    class237 var11 = (class237) arg3;
                    if (var10 == var11.method1603(false)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class237(this, var10);
                }
                if (var5.method1600(var8, var9, 1, arg2)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lvr;)V")
    public final void method458(class458 arg0) {
        ++field8070;
        this.field8210 = (class650) arg0;
    }

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "(IIII)V")
    public final void method3342(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 91) {
            this.field8205 = 60;
        }
        ++field8125;
        OpenGL.glDrawArrays(arg0, arg2, arg3);
    }

    @OriginalMember(owner = "client!lea", name = "k", descriptor = "(II)V")
    public final void method3343(int arg0, int arg1) {
        class123.field2084[0] = (float) class194.method1380(arg0, 16711680) / 1.671168E7F;
        ++field8035;
        class123.field2084[2] = (float) class194.method1380(255, arg0) / 255.0F;
        class123.field2084[1] = (float) class194.method1380(65280, arg0) / 65280.0F;
        if (arg1 != 20710) {
            this.field8164 = null;
        }
        class123.field2084[3] = (float) (arg0 >>> 24) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class123.field2084, 0);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIZ)Lmq;")
    public final class85 method423(int arg0, int arg1, boolean arg2) {
        ++field8029;
        return new class303(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lpc;Lpc;Lpc;Lpc;B)V")
    public final void method3344(class282 arg0, class282 arg1, class282 arg2, class282 arg3, byte arg4) {
        if (arg1 != null) {
            this.method3379(arg1.field4148, (byte) -15);
            OpenGL.glVertexPointer(arg1.field4150, arg1.field4151, this.field8222.method1335(6729), this.field8222.method1333((byte) 18) + (long) arg1.field4146);
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        ++field8013;
        if (arg0 != null) {
            this.method3379(arg0.field4148, (byte) -15);
            OpenGL.glNormalPointer(arg0.field4151, this.field8222.method1335(6729), this.field8222.method1333((byte) 37) - -((long) arg0.field4146));
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg2 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method3379(arg2.field4148, (byte) -15);
            OpenGL.glColorPointer(arg2.field4150, arg2.field4151, this.field8222.method1335(6729), this.field8222.method1333((byte) 31) - -((long) arg2.field4146));
            OpenGL.glEnableClientState(32886);
        }
        if (arg3 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method3379(arg3.field4148, (byte) -15);
            OpenGL.glTexCoordPointer(arg3.field4150, arg3.field4151, this.field8222.method1335(6729), this.field8222.method1333((byte) 46) - -((long) arg3.field4146));
            OpenGL.glEnableClientState(32888);
        }
        if (arg4 <= 95) {
            this.method487((class418) null, true);
        }
    }

    @OriginalMember(owner = "client!lea", name = "t", descriptor = "()V")
    public final void method87() {
        if (this.field8119 != null && this.field8119.method2192(-23116)) {
            this.field8116.method1467((byte) -75, this.field8119);
            this.field8123.method3264(5);
        }
        ++field8071;
    }

    @OriginalMember(owner = "client!lea", name = "GA", descriptor = "(I)V")
    public final void method97(int arg0) {
        ++field8097;
        this.method3308((byte) 76, 0);
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!lea", name = "m", descriptor = "()Z")
    public final boolean method446() {
        ++field7975;
        return true;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIB)V")
    public final void method3345(int arg0, int arg1, byte arg2) {
        this.field8187 = arg0;
        this.field8271 = arg1;
        ++field7996;
        if (arg2 != 83) {
            this.method463();
        }
        this.method3381((byte) 14);
        this.method3354(-12210);
    }

    @OriginalMember(owner = "client!lea", name = "t", descriptor = "(I)V")
    public final void method3346(int arg0) {
        ++field8058;
        if (arg0 != 0) {
            this.method3358(71, (class229) null);
        }
        OpenGL.glPushMatrix();
    }

    @OriginalMember(owner = "client!lea", name = "p", descriptor = "()V")
    public final void method119() {
        this.field8116.method1461((byte) -111);
        ++field7947;
    }

    @OriginalMember(owner = "client!lea", name = "L", descriptor = "(III)V")
    public final void method511(int arg0, int arg1, int arg2) {
        if (~this.field8257 != ~arg0 || ~this.field8251 != ~arg1 || this.field8181 != arg2) {
            this.field8181 = arg2;
            this.field8251 = arg1;
            this.field8257 = arg0;
            this.method3369(16013);
            this.method3329(-126);
        }
        ++field8122;
    }

    @OriginalMember(owner = "client!lea", name = "h", descriptor = "(I)V")
    public final void method470(int arg0) {
        ++field8085;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field8118 = arg0;
            this.field8123.method3264(5);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "(I)V")
    public final void method461(int arg0) {
        ++field8027;
    }

    @OriginalMember(owner = "client!lea", name = "g", descriptor = "(B)V")
    private final void method3347(byte arg0) {
        ++field8060;
        if (this.field8230 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field7990 < -1 && this.field8015 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field7990, (double) this.field8015, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field8230 = 1;
            this.field8160 &= -25;
        }
        int var2 = -61 % ((35 - arg0) / 39);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I[Lmfa;)V")
    public final void method504(int arg0, class217[] arg1) {
        ++field8064;
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field8242[var3] = arg1[var3];
        }
        this.field8225 = arg0;
        if (this.field8230 != 1) {
            this.method3352(1);
        }
    }

    @OriginalMember(owner = "client!lea", name = "aa", descriptor = "(IIIIII)V")
    public final void method436(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8001;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method3324(1);
        this.method3308((byte) 76, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field8206) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field8206) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(II[I[I)Laa;")
    public final class88 method431(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field8003;
        return class743.method4106((byte) -1, arg3, arg1, arg2, this, arg0);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IB)I")
    public final int method3348(int arg0, byte arg1) {
        ++field7925;
        if (~arg0 == -2) {
            return 7681;
        } else if (~arg0 == -1) {
            return 8448;
        } else if (~arg0 != -3) {
            if (arg0 != 3) {
                if (arg0 == 4) {
                    return 34023;
                } else if (arg1 <= 76) {
                    return 6;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                return 260;
            }
        } else {
            return 34165;
        }
    }

    @OriginalMember(owner = "client!lea", name = "h", descriptor = "()Z")
    public final boolean method99() {
        ++field8075;
        return this.field8119 != null && this.field8119.method2192(-23116);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method492(Canvas arg0) {
        ++field7961;
        if (this.field8048 == arg0) {
            throw new RuntimeException();
        } else if (this.field7976.containsKey(arg0)) {
            Long var2 = (Long) this.field7976.get(arg0);
            this.field8087.releaseSurface(arg0, var2);
            this.field7976.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IBI)V")
    public final synchronized void method3349(int arg0, byte arg1, int arg2) {
        ++field8002;
        class725 var4 = new class725(arg0);
        if (arg1 >= -33) {
            this.method3307((class331) null, -87);
        }
        var4.field10592 = (long) arg2;
        this.field8154.method3728((byte) 127, var4);
    }

    @OriginalMember(owner = "client!lea", name = "r", descriptor = "()Z")
    public final boolean method477() {
        ++field8113;
        return true;
    }

    @OriginalMember(owner = "client!lea", name = "u", descriptor = "(I)V")
    private final void method3350(int arg0) {
        class123.field2084[1] = this.field8243 * this.field8202;
        if (arg0 == 29175) {
            ++field8080;
            class123.field2084[0] = this.field8273 * this.field8243;
            class123.field2084[2] = this.field8243 * this.field8193;
            class123.field2084[3] = 1.0F;
            OpenGL.glLightModelfv(2899, class123.field2084, 0);
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIB)V")
    public final void method3351(int arg0, int arg1, int arg2, byte arg3) {
        OpenGL.glTexEnvi(8960, arg1 + 34176, arg2);
        ++field7939;
        OpenGL.glTexEnvi(8960, arg1 + 34192, arg0);
        if (arg3 != -85) {
            this.method121();
        }
    }

    @OriginalMember(owner = "client!lea", name = "T", descriptor = "(IIII)V")
    public final void method518(int arg0, int arg1, int arg2, int arg3) {
        if (this.field8270 > arg3) {
            this.field8270 = arg3;
        }
        if (arg0 > this.field8233) {
            this.field8233 = arg0;
        }
        if (~this.field8192 < ~arg2) {
            this.field8192 = arg2;
        }
        ++field7988;
        if (~arg1 < ~this.field8274) {
            this.field8274 = arg1;
        }
        OpenGL.glEnable(3089);
        this.method3367((byte) -88);
        this.method3354(-12210);
    }

    @OriginalMember(owner = "client!lea", name = "v", descriptor = "(I)V")
    private final void method3352(int arg0) {
        ++field7955;
        int var2;
        for (var2 = 0; this.field8225 > var2; ++var2) {
            class217 var3 = this.field8242[var2];
            class565.field7880[0] = (float) var3.method1495(false);
            int var4 = 16386 - -var2;
            class565.field7880[1] = (float) var3.method1494(false);
            class565.field7880[2] = (float) var3.method1490((byte) -126);
            class565.field7880[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class565.field7880, 0);
            int var5 = var3.method1489((byte) -128);
            float var6 = var3.method1488(false) / 255.0F;
            class565.field7880[1] = var6 * (float) class194.method1380(255, var5 >> 8);
            class565.field7880[2] = var6 * (float) class194.method1380(var5, 255);
            class565.field7880[0] = var6 * (float) class194.method1380(var5 >> 16, 255);
            OpenGL.glLightfv(var4, 4609, class565.field7880, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method1491(0) * var3.method1491(0)));
            OpenGL.glEnable(var4);
        }
        while (~this.field8249 < ~var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        if (arg0 != 1) {
            this.field8270 = -46;
        }
        this.field8249 = this.field8225;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(BLuba;)V")
    public final void method3353(byte arg0, class331 arg1) {
        if (arg0 != -70) {
            this.method517(-30, -0.3791323F, 0.7165936F, 0.6417054F, -1.9823067F, 1.2155815F);
        }
        ++field8025;
        if (this.field8140 >= 0 && this.field8141[this.field8140] == arg1) {
            this.field8141[this.field8140--] = null;
            arg1.method2024(true);
            if (this.field8140 < 0) {
                this.field8144 = null;
            } else {
                this.field8144 = this.field8141[this.field8140];
                this.field8144.method2019(false);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(II)I")
    public final int method497(int arg0, int arg1) {
        ++field8042;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!lea", name = "w", descriptor = "(I)V")
    private final void method3354(int arg0) {
        ++field8089;
        if (arg0 == -12210) {
            if (~this.field8192 <= ~this.field8233 && this.field8274 <= this.field8270) {
                OpenGL.glScissor(this.field8271 + this.field8233, -this.field8270 + this.field8015 + this.field8187, -this.field8233 + this.field8192, -this.field8274 + this.field8270);
            } else {
                OpenGL.glScissor(0, 0, 0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(FFI)V")
    public final void method3355(float arg0, float arg1, int arg2) {
        ++field7944;
        this.field8235 = arg0;
        if (arg2 != -1) {
            this.method3319(1.1431808F, false);
        }
        this.field8241 = arg1;
        this.method3369(arg2 + 16014);
    }

    @OriginalMember(owner = "client!lea", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method517(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field7999;
        boolean var7 = this.field8185 != arg0;
        if (var7 || this.field8173 != arg1 || this.field8265 != arg2) {
            this.field8265 = arg2;
            this.field8185 = arg0;
            this.field8173 = arg1;
            if (var7) {
                this.field8193 = (float) (255 & this.field8185) / 255.0F;
                this.field8202 = (float) (65280 & this.field8185) / 65280.0F;
                this.field8273 = (float) (this.field8185 & 16711680) / 1.671168E7F;
                this.method3350(29175);
            }
            this.method3332(0);
        }
        if (this.field8224[0] != arg3 || this.field8224[1] != arg4 || this.field8224[2] != arg5) {
            this.field8224[2] = arg5;
            this.field8224[1] = arg4;
            this.field8224[0] = arg3;
            this.field8258[2] = -arg5;
            this.field8258[1] = -arg4;
            this.field8258[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field8278[0] = arg3 * var8;
            this.field8278[1] = arg4 * var8;
            this.field8278[2] = arg5 * var8;
            this.field8263[0] = -this.field8278[0];
            this.field8263[1] = -this.field8278[1];
            this.field8263[2] = -this.field8278[2];
            this.method3383(4611);
            this.field8205 = (int) (arg5 * 256.0F / arg4);
            this.field8221 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)V")
    public final void method430(int arg0) {
        this.method3357(6993);
        ++field7968;
    }

    @OriginalMember(owner = "client!lea", name = "X", descriptor = "(I)V")
    public final void method509(int arg0) {
        ++field8108;
        this.field8134 = 0;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field8134;
        }
        this.field8137 = 1 << this.field8134;
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(IIIIII)V")
    public final void method453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3324(1);
        ++field7928;
        this.method3308((byte) 76, arg5);
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) (-arg1) + (float) arg3;
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

    @OriginalMember(owner = "client!lea", name = "x", descriptor = "(I)V")
    private final void method3356(int arg0) {
        if (arg0 != 3042) {
            this.field8232 = -0.6139422F;
        }
        ++field7983;
        float[] var2 = this.field8246;
        float var3 = (float) (-this.field8217 * this.field8214) / (float) this.field8237;
        float var4 = (float) ((-this.field8217 + this.field7990) * this.field8214) / (float) this.field8237;
        float var5 = (float) (this.field8214 * this.field8177) / (float) this.field8204;
        float var6 = (float) ((this.field8177 - this.field8015) * this.field8214) / (float) this.field8204;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field8214 * 2.0F;
            var2[7] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[10] = this.field8211 = (float) (-(this.field8214 + this.field8180)) / (float) (this.field8180 - this.field8214);
            var2[2] = 0.0F;
            var2[6] = 0.0F;
            var2[15] = 0.0F;
            var2[1] = 0.0F;
            var2[5] = var7 / (var5 - var6);
            var2[3] = 0.0F;
            var2[14] = this.field8272 = -((float) this.field8180 * var7) / (float) (-this.field8214 + this.field8180);
            var2[13] = 0.0F;
            var2[11] = -1.0F;
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[12] = 0.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[4] = 0.0F;
        } else {
            var2[2] = 0.0F;
            var2[7] = 0.0F;
            var2[11] = 0.0F;
            var2[3] = 0.0F;
            var2[15] = 1.0F;
            var2[9] = 0.0F;
            var2[12] = 0.0F;
            var2[14] = 0.0F;
            var2[8] = 0.0F;
            var2[1] = 0.0F;
            var2[5] = 1.0F;
            var2[13] = 0.0F;
            var2[4] = 0.0F;
            var2[10] = 1.0F;
            var2[6] = 0.0F;
            var2[0] = 1.0F;
        }
        this.method3312(-77);
    }

    @OriginalMember(owner = "client!lea", name = "F", descriptor = "(II)V")
    public final void method75(int arg0, int arg1) {
        ++field7981;
    }

    @OriginalMember(owner = "client!lea", name = "y", descriptor = "(I)V")
    private final void method3357(int arg0) {
        if (arg0 != 6993) {
            this.field8256 = -0.040490683F;
        }
        ++field8110;
        int var2 = 0;
        while (!this.field8087.method234()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class579.method3405(1000L, 10);
        }
    }

    @OriginalMember(owner = "client!lea", name = "f", descriptor = "(IIIIII)Lvr;")
    public final class458 method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8031;
        return this.field8176 ? new class71(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!lea", name = "KA", descriptor = "(IIII)V")
    public final void method488(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (this.field7990 < arg2) {
            arg2 = this.field7990;
        }
        ++field7960;
        if (~arg1 > -1) {
            arg1 = 0;
        }
        if (~this.field8015 > ~arg3) {
            arg3 = this.field8015;
        }
        this.field8192 = arg2;
        this.field8233 = arg0;
        this.field8270 = arg3;
        this.field8274 = arg1;
        OpenGL.glEnable(3089);
        this.method3367((byte) -48);
        this.method3354(-12210);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lrt;[Lde;Z)Lda;")
    public final class443 method491(class470 arg0, class418[] arg1, boolean arg2) {
        ++field8094;
        return new class257(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!lea", name = "la", descriptor = "()V")
    public final void method512() {
        ++field7978;
        this.field8192 = this.field7990;
        this.field8274 = 0;
        this.field8270 = this.field8015;
        this.field8233 = 0;
        OpenGL.glDisable(3089);
        this.method3367((byte) -38);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILiq;)V")
    public final void method3358(int arg0, class229 arg1) {
        ++field8066;
        OpenGL.glLoadMatrixf(arg1.method1572(arg0 ^ -92), arg0);
    }

    @OriginalMember(owner = "client!lea", name = "da", descriptor = "(III[I)V")
    public final void method485(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7948;
        float var5 = (float) arg2 * this.field8164.field3360 + (float) arg0 * this.field8164.field3363 + (float) arg1 * this.field8164.field3333 + this.field8164.field3325;
        if (!(var5 < (float) this.field8214) && !((float) this.field8180 < var5)) {
            int var6 = (int) (((float) arg2 * this.field8164.field3349 + (float) arg0 * this.field8164.field3346 + (float) arg1 * this.field8164.field3335 + this.field8164.field3327) * (float) this.field8237 / var5);
            int var7 = (int) (((float) arg2 * this.field8164.field3352 + (float) arg0 * this.field8164.field3359 + (float) arg1 * this.field8164.field3340 + this.field8164.field3365) * (float) this.field8204 / var5);
            if ((float) var6 >= this.field8256 && (float) var6 <= this.field8267 && (float) var7 >= this.field8247 && (float) var7 <= this.field8268) {
                arg3[1] = (int) ((float) var7 - this.field8247);
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 + -this.field8256);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "(II)Ljk;")
    public final class788 method88(int arg0, int arg1) {
        ++field8019;
        return null;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Llf;Ljk;)Lrs;")
    public final class730 method53(class567 arg0, class788 arg1) {
        ++field8036;
        return null;
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(IIZ)V")
    public final void method3359(int arg0, int arg1, boolean arg2) {
        if (~this.field8190 != -1) {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        } else {
            boolean var4 = false;
            if (this.field8191 != arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                this.field8191 = arg0;
                var4 = true;
            }
            if (~this.field8245 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                this.field8245 = arg1;
                var4 = true;
            }
            if (var4) {
                this.field8160 &= -30;
            }
        }
        if (!arg2) {
            this.field8272 = -0.77161807F;
        }
        ++field7972;
    }

    @OriginalMember(owner = "client!lea", name = "xa", descriptor = "(F)V")
    public final void method516(float arg0) {
        if (this.field8243 != arg0) {
            this.field8243 = arg0;
            this.method3350(29175);
        }
        ++field7985;
    }

    @OriginalMember(owner = "client!lea", name = "z", descriptor = "(I)V")
    public final void method3360(int arg0) {
        ++field7987;
        if (arg0 != 22131) {
            this.method3369(77);
        }
        if (~this.field8160 != -17) {
            this.method3306((byte) 97);
            this.method3326((byte) -110, true);
            this.method3387(true, 72);
            this.method3377(-32, true);
            this.method3308((byte) 76, 1);
            this.field8160 = 16;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(FFFBF)V")
    public final void method3361(float arg0, float arg1, float arg2, byte arg3, float arg4) {
        class123.field2084[3] = arg2;
        if (arg3 >= -18) {
            this.method57(-0.06335429F, -1.21328F, 0.06614989F);
        }
        ++field8051;
        class123.field2084[0] = arg0;
        class123.field2084[2] = arg4;
        class123.field2084[1] = arg1;
        OpenGL.glTexEnvfv(8960, 8705, class123.field2084, 0);
    }

    @OriginalMember(owner = "client!lea", name = "x", descriptor = "()Z")
    public final boolean method454() {
        ++field8114;
        return false;
    }

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "(Z)V")
    public final void method466(boolean arg0) {
        ++field7946;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(III)V")
    public final synchronized void method3362(int arg0, int arg1, int arg2) {
        ++field8032;
        class725 var4 = new class725(arg2);
        var4.field10592 = (long) arg0;
        if (arg1 <= 118) {
            this.field8210 = null;
        }
        this.field8156.method3728((byte) 126, var4);
    }

    @OriginalMember(owner = "client!lea", name = "A", descriptor = "(I)V")
    private final void method3363(int arg0) {
        ++field7933;
        if (arg0 != -9251) {
            this.field8221 = -65;
        }
        if (this.field8254) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field8254 = false;
        }
    }

    @OriginalMember(owner = "client!lea", name = "l", descriptor = "(II)V")
    public final void method3364(int arg0, int arg1) {
        this.method3386(true, arg1, (byte) -65);
        ++field8073;
        if (arg0 != 0) {
            this.field8123 = null;
        }
    }

    @OriginalMember(owner = "client!lea", name = "B", descriptor = "(I)I")
    private final int method3365(int arg0) {
        ++field8033;
        this.field8264 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field8250 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field8264.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (this.field8264.indexOf("brian paul") != -1 || this.field8264.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class544.method3151((byte) 70, ' ', var3.replace('.', ' '));
        if (var4.length >= 2) {
            try {
                int var5 = class185.method1340(var4[0], (byte) 47);
                int var6 = class185.method1340(var4[1], (byte) 87);
                this.field8269 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (~this.field8269 > -13) {
            var2 |= 2;
        }
        if (!this.field8087.method235("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field8087.method235("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field8216 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field8266 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field8259 = var7[0];
        if (~this.field8216 > -3 || this.field8266 < 2 || this.field8259 < 2) {
            var2 |= 16;
        }
        this.field8231 = Stream.method2263();
        this.field8260 = this.field8087.arePbuffersAvailable();
        this.field8229 = this.field8087.method235("GL_ARB_vertex_buffer_object");
        this.field8206 = this.field8087.method235("GL_ARB_multisample");
        this.field8279 = this.field8087.method235("GL_ARB_vertex_program");
        this.field8087.method235("GL_ARB_fragment_program");
        if (arg0 != 5851) {
            this.field8271 = 79;
        }
        this.field8172 = this.field8087.method235("GL_ARB_vertex_shader");
        this.field8175 = this.field8087.method235("GL_ARB_fragment_shader");
        this.field8182 = this.field8087.method235("GL_EXT_texture3D");
        this.field8220 = this.field8087.method235("GL_ARB_texture_rectangle");
        this.field8176 = this.field8087.method235("GL_ARB_texture_cube_map");
        this.field8183 = this.field8087.method235("GL_ARB_texture_float");
        this.field8186 = false;
        this.field8207 = this.field8087.method235("GL_EXT_framebuffer_object");
        this.field8240 = this.field8087.method235("GL_EXT_framebuffer_blit");
        this.field8189 = this.field8087.method235("GL_EXT_framebuffer_multisample");
        this.field8228 = this.field8189 & this.field8240;
        this.field8203 = class247.field3556.startsWith("mac");
        OpenGL.glGetFloatv(2834, class123.field2084, 0);
        this.field8277 = class123.field2084[1];
        this.field8232 = class123.field2084[0];
        return var2 == 0 ? 0 : var2;
    }

    @OriginalMember(owner = "client!lea", name = "XA", descriptor = "()I")
    public final int method445() {
        ++field8046;
        return this.field8180;
    }

    @OriginalMember(owner = "client!lea", name = "f", descriptor = "(Z)V")
    private final void method3366(boolean arg0) {
        if (arg0) {
            this.method3305(-45);
        }
        ++field8059;
        OpenGL.glDepthMask(this.field8166 && this.field8213);
    }

    @OriginalMember(owner = "client!lea", name = "K", descriptor = "([I)V")
    public final void method422(int[] arg0) {
        ++field8086;
        arg0[0] = this.field8233;
        arg0[1] = this.field8274;
        arg0[2] = this.field8192;
        arg0[3] = this.field8270;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method86(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class684 {
        ++field8082;
        this.method109(arg2, arg3);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class419 method508(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field8117;
        return new class195(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lrs;)V")
    public final void method120(class730 arg0) {
        ++field8098;
    }

    @OriginalMember(owner = "client!lea", name = "u", descriptor = "()Z")
    public final boolean method475() {
        ++field8112;
        return true;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field7929;
        if (~arg0 != ~arg2 || arg1 != arg3) {
            this.method3324(1);
            this.method3308((byte) 76, arg5);
            float var10 = (float) arg2 - (float) arg0;
            float var11 = (float) (-arg1) + (float) arg3;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var13 = var10 * var12;
            float var14 = var11 * var12;
            int var15 = arg8 % (arg6 + arg7);
            float var16 = (float) arg6 * var13;
            float var17 = (float) arg6 * var14;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (~arg6 > ~var15) {
                var18 = (float) (arg6 + arg7 + -var15) * var13;
                var19 = (float) (-var15 + arg6 - -arg7) * var14;
            } else {
                var21 = (float) (arg6 - var15) * var14;
                var20 = (float) (arg6 - var15) * var13;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var13;
            float var25 = (float) arg7 * var14;
            while (true) {
                if (arg2 <= arg0) {
                    if (var22 < (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var20 + var22 < (float) arg2) {
                        var20 = (float) arg2 - var22;
                    }
                } else {
                    if (var22 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if ((float) arg2 < var20 + var22) {
                        var20 = (float) arg2 + -var22;
                    }
                }
                if (arg3 > arg1) {
                    if ((float) arg3 + 0.35F < var23) {
                        break;
                    }
                    if ((float) arg3 < var21 + var23) {
                        var21 = (float) arg3 - var23;
                    }
                } else {
                    if ((float) arg3 + 0.35F > var23) {
                        break;
                    }
                    if (var21 + var23 < (float) arg3) {
                        var21 = (float) arg3 - var23;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glVertex2f(var22, var23);
                OpenGL.glVertex2f(var20 + var22, var21 + var23);
                var22 += var20 + var24;
                var23 += var21 + var25;
                OpenGL.glEnd();
                var20 = var16;
                var21 = var17;
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "h", descriptor = "(B)V")
    private final void method3367(byte arg0) {
        if (arg0 >= -20) {
            this.method3353((byte) -109, (class331) null);
        }
        this.field8267 = (float) (-this.field8217 + this.field8192);
        ++field7945;
        this.field8268 = (float) (this.field8270 - this.field8177);
        this.field8256 = (float) (-this.field8217 + this.field8233);
        this.field8247 = (float) (-this.field8177 + this.field8274);
    }

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "(II)I")
    public final int method426(int arg0, int arg1) {
        ++field7974;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!lea", name = "C", descriptor = "(I)V")
    private final void method3368(int arg0) {
        if (this.field8208 && !this.field8239) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 != -12967518) {
            this.field8204 = 81;
        }
        ++field8018;
    }

    @OriginalMember(owner = "client!lea", name = "D", descriptor = "(I)V")
    private final void method3369(int arg0) {
        this.field8198 = (float) (-this.field8181 + this.field8180) + -this.field8235;
        ++field7938;
        this.field8209 = this.field8198 - (float) this.field8251 * this.field8241;
        if (this.field8209 < (float) this.field8214) {
            this.field8209 = (float) this.field8214;
        }
        OpenGL.glFogf(2915, this.field8209);
        if (arg0 != 16013) {
            this.field8191 = 18;
        }
        OpenGL.glFogf(2916, this.field8198);
        class123.field2084[1] = (float) class194.method1380(65280, this.field8257) / 65280.0F;
        class123.field2084[2] = (float) class194.method1380(this.field8257, 255) / 255.0F;
        class123.field2084[0] = (float) class194.method1380(this.field8257, 16711680) / 1.671168E7F;
        OpenGL.glFogfv(2918, class123.field2084, 0);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljaclib/memory/Buffer;IBIZ)Lcq;")
    public final class305 method3370(Buffer arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        if (arg2 != -77) {
            field8101 = null;
        }
        ++field7958;
        return (class305) (!this.field8229 || arg4 && !this.field8276 ? new class311(this, arg1, arg0) : new class184(this, arg1, arg0, arg3, arg4));
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method437(Canvas arg0, int arg1, int arg2) {
        ++field8045;
        if (this.field8048 == arg0) {
            throw new RuntimeException();
        } else if (!this.field7976.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field8087.prepareSurface(arg0);
                if (~var6 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field7976.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "l", descriptor = "()I")
    public final int method472() {
        ++field8056;
        return 4;
    }

    @OriginalMember(owner = "client!lea", name = "z", descriptor = "()Ldm;")
    public final class765 method463() {
        ++field8109;
        return new class229();
    }

    @OriginalMember(owner = "client!lea", name = "E", descriptor = "(I)V")
    public final void method3371(int arg0) {
        if (arg0 != 6) {
            this.field8015 = 52;
        }
        ++field7956;
        if (~this.field8160 != -5) {
            this.method3347((byte) 117);
            this.method3326((byte) -112, false);
            this.method3385(false, -8);
            this.method3387(false, 104);
            this.method3377(-32, false);
            this.method3364(0, -2);
            this.method3308((byte) 76, 1);
            this.field8160 = 4;
        }
    }

    @OriginalMember(owner = "client!lea", name = "f", descriptor = "(I)Lza;")
    public final class731 method496(int arg0) {
        ++field8030;
        class778 var2 = new class778(arg0);
        this.field8132.method3728((byte) 122, var2);
        return var2;
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(BLuba;)V")
    public final void method3372(byte arg0, class331 arg1) {
        if (arg0 == -94) {
            ++field8092;
            if (this.field8240) {
                this.method3317(arg1, false);
                this.method3353((byte) -70, arg1);
            } else if (this.field8148 >= 0 && this.field8143[this.field8148] == arg1) {
                this.field8143[this.field8148--] = null;
                arg1.method2020(48);
                if (~this.field8148 > -1) {
                    this.field8146 = this.field8144 = null;
                } else {
                    this.field8146 = this.field8144 = this.field8143[this.field8148];
                    this.field8146.method2023(arg0 ^ 32635);
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "(I)V")
    public final void method499(int arg0) {
        ++field7924;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(IIB)V")
    public final synchronized void method3373(int arg0, int arg1, byte arg2) {
        ++field7930;
        class725 var4 = new class725(arg0);
        if (arg2 > -83) {
            this.method474();
        }
        var4.field10592 = (long) arg1;
        this.field8153.method3728((byte) 118, var4);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method501(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field7951;
        if (~arg0 != ~arg2 || arg1 != arg3) {
            class410 var13 = (class410) arg6;
            class296 var14 = var13.field5613;
            this.method3320(26936);
            this.method3384(var13.field5613, (byte) 61);
            this.method3308((byte) 76, arg5);
            this.method3359(7681, 8448, true);
            this.method3351(768, 0, 34167, (byte) -85);
            float var15 = var14.field4299 / (float) var14.field4301;
            float var16 = var14.field4303 / (float) var14.field4305;
            float var17 = (float) (-arg0) + (float) arg2;
            float var18 = (float) arg3 - (float) arg1;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            int var20 = arg11 % (arg10 - -arg9);
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var21 = var17 * var19;
            float var22 = var18 * var19;
            float var23 = (float) arg9 * var21;
            float var24 = (float) arg9 * var22;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (~arg9 <= ~var20) {
                var28 = (float) (arg9 - var20) * var22;
                var27 = (float) (-var20 + arg9) * var21;
            } else {
                var25 = (float) (arg9 + arg10 + -var20) * var21;
                var26 = (float) (-var20 + arg9 + arg10) * var22;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var21;
            float var32 = (float) arg10 * var22;
            while (true) {
                if (~arg0 > ~arg2) {
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
                    if (var27 + var29 < (float) arg2) {
                        var27 = (float) arg2 + -var29;
                    }
                }
                if (arg1 < arg3) {
                    if ((float) arg3 + 0.35F < var30) {
                        break;
                    }
                    if (var28 + var30 > (float) arg3) {
                        var28 = (float) arg3 + -var30;
                    }
                } else {
                    if ((float) arg3 + 0.35F > var30) {
                        break;
                    }
                    if ((float) arg3 > var28 + var30) {
                        var28 = (float) arg3 - var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f(((float) (-arg7) + var29) * var15, (var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 - (float) arg7) * var15, (var28 + var30 + (float) (-arg8)) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                var30 += var28 + var32;
                var29 += var27 + var31;
                OpenGL.glEnd();
                var28 = var24;
                var27 = var23;
            }
            this.method3351(768, 0, 5890, (byte) -85);
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lde;Z)Lmq;")
    public final class85 method487(class418 arg0, boolean arg1) {
        ++field7977;
        int[] var3 = new int[arg0.field5796 * arg0.field5792];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field5798 == null) {
            for (int var6 = 0; ~var6 > ~arg0.field5792; ++var6) {
                for (int var7 = 0; ~arg0.field5796 < ~var7; ++var7) {
                    int var8 = arg0.field5795[arg0.field5793[var4++] & 255];
                    var3[var5++] = var8 == 0 ? 0 : class694.method3895(var8, -16777216);
                }
            }
        } else {
            for (int var9 = 0; ~var9 > ~arg0.field5792; ++var9) {
                for (int var11 = 0; ~var11 > ~arg0.field5796; ++var11) {
                    var3[var5++] = class694.method3895(arg0.field5798[var4] << 24, arg0.field5795[class194.method1380(255, arg0.field5793[var4])]);
                    ++var4;
                }
            }
        }
        class85 var10 = this.method2773(1, arg0.field5796, var3, 0, arg0.field5792, arg0.field5796);
        var10.method2(arg0.field5794, arg0.field5799, arg0.field5797, arg0.field5800);
        return var10;
    }

    @OriginalMember(owner = "client!lea", name = "k", descriptor = "()V")
    public final void method121() {
        ++field7942;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "(IIII)V")
    public final void method3374(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg0 + 34184, arg2);
        ++field7922;
        int var5 = 108 % ((-11 - arg3) / 38);
        OpenGL.glTexEnvi(8960, 34200 - -arg0, arg1);
    }

    @OriginalMember(owner = "client!lea", name = "H", descriptor = "(III[I)V")
    public final void method482(int arg0, int arg1, int arg2, int[] arg3) {
        ++field8011;
        float var5 = (float) arg2 * this.field8164.field3360 + (float) arg0 * this.field8164.field3363 + (float) arg1 * this.field8164.field3333 + this.field8164.field3325;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field8164.field3349 + (float) arg0 * this.field8164.field3346 + (float) arg1 * this.field8164.field3335 + this.field8164.field3327) * (float) this.field8237 / var5);
            arg3[0] = (int) ((float) var6 + -this.field8256);
            int var7 = (int) (((float) arg2 * this.field8164.field3352 + (float) arg0 * this.field8164.field3359 + (float) arg1 * this.field8164.field3340 + this.field8164.field3365) * (float) this.field8204 / var5);
            arg3[1] = (int) ((float) var7 + -this.field8247);
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lza;)V")
    public final void method425(class731 arg0) {
        this.field8135 = ((class778) arg0).field10682;
        ++field7966;
        if (this.field8219 == null) {
            class501 var2 = new class501(80);
            if (this.field8231) {
                var2.method2926((byte) 91, -1.0F);
                var2.method2926((byte) 65, -1.0F);
                var2.method2926((byte) 71, 0.0F);
                var2.method2926((byte) 59, 0.0F);
                var2.method2926((byte) 97, 1.0F);
                var2.method2926((byte) 105, 1.0F);
                var2.method2926((byte) 120, -1.0F);
                var2.method2926((byte) 72, 0.0F);
                var2.method2926((byte) 85, 1.0F);
                var2.method2926((byte) 90, 1.0F);
                var2.method2926((byte) 65, 1.0F);
                var2.method2926((byte) 112, 1.0F);
                var2.method2926((byte) 56, 0.0F);
                var2.method2926((byte) 70, 1.0F);
                var2.method2926((byte) 78, 0.0F);
                var2.method2926((byte) 88, -1.0F);
                var2.method2926((byte) 84, 1.0F);
                var2.method2926((byte) 93, 0.0F);
                var2.method2926((byte) 113, 0.0F);
                var2.method2926((byte) 67, 0.0F);
            } else {
                var2.method2925(-1.0F, true);
                var2.method2925(-1.0F, true);
                var2.method2925(0.0F, true);
                var2.method2925(0.0F, true);
                var2.method2925(1.0F, true);
                var2.method2925(1.0F, true);
                var2.method2925(-1.0F, true);
                var2.method2925(0.0F, true);
                var2.method2925(1.0F, true);
                var2.method2925(1.0F, true);
                var2.method2925(1.0F, true);
                var2.method2925(1.0F, true);
                var2.method2925(0.0F, true);
                var2.method2925(1.0F, true);
                var2.method2925(0.0F, true);
                var2.method2925(-1.0F, true);
                var2.method2925(1.0F, true);
                var2.method2925(0.0F, true);
                var2.method2925(0.0F, true);
                var2.method2925(0.0F, true);
            }
            this.field8219 = this.method3336(var2.field6002, 20, var2.field5983, (byte) 90, false);
            this.field8170 = new class282(this.field8219, 5126, 3, 0);
            this.field8179 = new class282(this.field8219, 5126, 2, 12);
            this.field8124.method3193(this, 5126);
        }
    }

    @OriginalMember(owner = "client!lea", name = "o", descriptor = "()Z")
    public final boolean method424() {
        ++field7937;
        return false;
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(IB)V")
    public final void method3375(int arg0, byte arg1) {
        ++field7971;
        if (arg0 != 1) {
            if (arg0 != 0) {
                if (arg0 == 2) {
                    this.method3359(34165, 7681, true);
                } else if (arg0 != 3) {
                    if (~arg0 == -5) {
                        this.method3359(34023, 34023, true);
                    }
                } else {
                    this.method3359(260, 8448, true);
                }
            } else {
                this.method3359(8448, 8448, true);
            }
        } else {
            this.method3359(7681, 7681, true);
        }
        if (arg1 != 102) {
            this.field8251 = 83;
        }
    }

    @OriginalMember(owner = "client!lea", name = "r", descriptor = "(IIIIIII)I")
    public final int method471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8061;
        float var8 = (float) arg2 * this.field8164.field3360 + (float) arg0 * this.field8164.field3363 + (float) arg1 * this.field8164.field3333 + this.field8164.field3325;
        float var9 = (float) arg5 * this.field8164.field3360 + (float) arg3 * this.field8164.field3363 + (float) arg4 * this.field8164.field3333 + this.field8164.field3325;
        int var10 = 0;
        if ((float) this.field8214 > var8 && (float) this.field8214 > var9) {
            var10 |= 16;
        } else if ((float) this.field8180 < var8 && (float) this.field8180 < var9) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field8164.field3349 + (float) arg0 * this.field8164.field3346 + (float) arg1 * this.field8164.field3335 + this.field8164.field3327) * (float) this.field8237 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field8164.field3349 + (float) arg3 * this.field8164.field3346 + (float) arg4 * this.field8164.field3335 + this.field8164.field3327) * (float) this.field8237 / (float) arg6);
        if ((float) var11 < this.field8256 && this.field8256 > (float) var12) {
            var10 |= 1;
        } else if (this.field8267 < (float) var11 && (float) var12 > this.field8267) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field8164.field3352 + (float) arg0 * this.field8164.field3359 + (float) arg1 * this.field8164.field3340 + this.field8164.field3365) * (float) this.field8204 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field8164.field3352 + (float) arg3 * this.field8164.field3359 + (float) arg4 * this.field8164.field3340 + this.field8164.field3365) * (float) this.field8204 / (float) arg6);
        if (this.field8247 > (float) var13 && this.field8247 > (float) var14) {
            var10 |= 4;
        } else if ((float) var13 > this.field8268 && (float) var14 > this.field8268) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!lea", name = "m", descriptor = "(II)V")
    public final synchronized void method3376(int arg0, int arg1) {
        ++field8084;
        class766 var3 = new class766();
        if (arg0 == -2137) {
            var3.field10592 = (long) arg1;
            this.field8157.method3728((byte) 117, var3);
        }
    }

    @OriginalMember(owner = "client!lea", name = "JA", descriptor = "(IIIIII)I")
    public final int method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8078;
        int var7 = 0;
        float var8 = (float) arg2 * this.field8164.field3360 + (float) arg0 * this.field8164.field3363 + (float) arg1 * this.field8164.field3333 + this.field8164.field3325;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field8164.field3360 + (float) arg3 * this.field8164.field3363 + (float) arg4 * this.field8164.field3333 + this.field8164.field3325;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field8214 > var8 && var9 < (float) this.field8214) {
            var7 |= 16;
        } else if ((float) this.field8180 < var8 && (float) this.field8180 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field8164.field3349 + (float) arg0 * this.field8164.field3346 + (float) arg1 * this.field8164.field3335 + this.field8164.field3327) * (float) this.field8237 / var8);
        int var11 = (int) (((float) arg5 * this.field8164.field3349 + (float) arg3 * this.field8164.field3346 + (float) arg4 * this.field8164.field3335 + this.field8164.field3327) * (float) this.field8237 / var9);
        if ((float) var10 < this.field8256 && this.field8256 > (float) var11) {
            var7 |= 1;
        } else if (this.field8267 < (float) var10 && this.field8267 < (float) var11) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field8164.field3352 + (float) arg0 * this.field8164.field3359 + (float) arg1 * this.field8164.field3340 + this.field8164.field3365) * (float) this.field8204 / var8);
        int var13 = (int) (((float) arg5 * this.field8164.field3352 + (float) arg3 * this.field8164.field3359 + (float) arg4 * this.field8164.field3340 + this.field8164.field3365) * (float) this.field8204 / var9);
        if (this.field8247 > (float) var12 && (float) var13 < this.field8247) {
            var7 |= 4;
        } else if ((float) var12 > this.field8268 && (float) var13 > this.field8268) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)V")
    public final void method456(int arg0) {
        ++field8034;
        this.method3388(-15371);
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method428(Canvas arg0) {
        this.field8079 = 0L;
        ++field7994;
        this.field8103 = null;
        if (arg0 != null && this.field8048 != arg0) {
            if (this.field7976.containsKey(arg0)) {
                Long var2 = (Long) this.field7976.get(arg0);
                this.field8079 = var2;
                this.field8103 = arg0;
            }
        } else {
            this.field8079 = this.field7969;
            this.field8103 = this.field8048;
        }
        if (this.field8103 != null && this.field8079 != 0L) {
            this.field8087.setSurface(this.field8079);
            this.method3382(false);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!lea", name = "ya", descriptor = "()V")
    public final void method91() {
        this.method3377(-32, true);
        ++field8069;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(IZ)V")
    public final void method3377(int arg0, boolean arg1) {
        if (arg1 == !this.field8166) {
            this.field8166 = arg1;
            this.method3366(false);
            this.field8160 &= -32;
        }
        if (arg0 != -32) {
            this.field8026 = -72;
        }
        ++field7995;
    }

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "()Z")
    public final boolean method479() {
        ++field8049;
        return true;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZZII)V")
    public final void method3378(boolean arg0, boolean arg1, int arg2, int arg3) {
        if (this.field8196 != arg2 || !this.field8194 == this.field8253) {
            class504 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field8194 ? 0 : 3;
            if (~arg2 > -1) {
                this.method3363(-9251);
            } else {
                var5 = this.field8123.method3270(arg2, (byte) 112);
                class719 var10 = super.field6447.method847(arg2, -99);
                if (var10.field10028 == 0 && var10.field10038 == 0) {
                    this.method3363(-9251);
                } else {
                    int var11 = var10.field10044 ? 64 : 128;
                    int var12 = var11 * 50;
                    this.method3380((float) (this.field8133 % var12 * var10.field10038) / (float) var12, (float) (this.field8133 % var12 * var10.field10028) / (float) var12, 29020, 0.0F);
                }
                if (!this.field8194) {
                    var7 = var10.field10036;
                    var9 = var10.field10031;
                    var8 = var10.field10040;
                }
                var6 = var10.field10039;
            }
            this.field8121.method2417(var7, var9, arg1, var8, 76, arg0);
            if (!this.field8121.method2418(arg3 + -37, var5, var6)) {
                this.method3384(var5, (byte) 113);
                this.method3375(var6, (byte) 102);
            }
            this.field8253 = this.field8194;
            this.field8196 = arg2;
        }
        if (arg3 != 128) {
            this.method3337(123);
        }
        ++field7957;
        this.field8160 &= -8;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "()V")
    public final void method490() {
        ++field8102;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIII)V")
    public final void method127(int arg0, int arg1, int arg2, int arg3) {
        this.field8116.method1462(arg3, arg0, arg1, -128, arg2);
        ++field7927;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Z)V")
    public final void method137(boolean arg0) {
        ++field7953;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lcq;B)V")
    public final void method3379(class305 arg0, byte arg1) {
        if (this.field8222 != arg0) {
            if (this.field8229) {
                OpenGL.glBindBufferARB(34962, arg0.method1330(22302));
            }
            this.field8222 = arg0;
        }
        if (arg1 == -15) {
            ++field8100;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(FFIF)V")
    private final void method3380(float arg0, float arg1, int arg2, float arg3) {
        ++field8016;
        OpenGL.glMatrixMode(5890);
        if (this.field8254) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg1, arg0, arg3);
        OpenGL.glMatrixMode(5888);
        this.field8254 = true;
        if (arg2 != 29020) {
            this.method462();
        }
    }

    @OriginalMember(owner = "client!lea", name = "i", descriptor = "(B)V")
    private final void method3381(byte arg0) {
        ++field8050;
        int var2 = -121 % ((arg0 - 68) / 34);
        OpenGL.glViewport(this.field8271, this.field8187, this.field7990, this.field8015);
    }

    @OriginalMember(owner = "client!lea", name = "g", descriptor = "(Z)V")
    private final void method3382(boolean arg0) {
        ++field8039;
        if (this.field8103 != null) {
            Dimension var2 = this.field8103.getSize();
            this.field7986 = var2.width;
            this.field8026 = var2.height;
        } else {
            this.field7986 = this.field8026 = 0;
        }
        if (this.field8144 == null) {
            this.field8015 = this.field8026;
            this.field7990 = this.field7986;
            this.method3381((byte) 103);
        }
        if (!arg0) {
            this.method3340((byte) 10);
            this.method512();
        }
    }

    @OriginalMember(owner = "client!lea", name = "F", descriptor = "(I)V")
    public final void method3383(int arg0) {
        ++field8062;
        OpenGL.glLightfv(16384, arg0, this.field8278, 0);
        OpenGL.glLightfv(16385, 4611, this.field8263, 0);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method432(Canvas arg0, int arg1, int arg2) {
        ++field7941;
        long var4 = 0L;
        if (arg0 != null && this.field8048 != arg0) {
            if (this.field7976.containsKey(arg0)) {
                Long var6 = (Long) this.field7976.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field7969;
        }
        if (~var4 == -1L) {
            throw new RuntimeException();
        } else {
            this.field8087.surfaceResized(var4);
            if (this.field8103 == arg0) {
                this.method3382(false);
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "v", descriptor = "()Z")
    public final boolean method433() {
        ++field7949;
        return this.field8206 && (!this.method99() || this.field8228);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lfga;B)V")
    public final void method3384(class377 arg0, byte arg1) {
        ++field8093;
        if (arg1 < 48) {
            this.field8250 = null;
        }
        class377 var3 = this.field8218[this.field8190];
        if (arg0 != var3) {
            if (arg0 == null) {
                OpenGL.glDisable(var3.field5298);
            } else {
                if (var3 != null) {
                    if (~arg0.field5298 != ~var3.field5298) {
                        OpenGL.glDisable(var3.field5298);
                        OpenGL.glEnable(arg0.field5298);
                    }
                } else {
                    OpenGL.glEnable(arg0.field5298);
                }
                OpenGL.glBindTexture(arg0.field5298, arg0.method2270(-111));
            }
            this.field8218[this.field8190] = arg0;
        }
        this.field8160 &= -2;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZI)V")
    public final void method3385(boolean arg0, int arg1) {
        ++field7920;
        if (arg1 != -8) {
            this.method505(-71, -99, -74, -46, 57, -105, (class88) null, 38, -27);
        }
        if (this.field8208 != arg0) {
            this.field8208 = arg0;
            this.method3368(arg1 ^ 12967514);
            this.field8160 &= -8;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lida;IIII)Lka;")
    public final class233 method514(class678 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7982;
        return new class68(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!lea", name = "s", descriptor = "()V")
    public final void method142() {
        ++field8000;
        for (class766 var1 = this.field8132.method3731((byte) -75); var1 != null; var1 = this.field8132.method3729((byte) 3)) {
            ((class778) var1).method4279(1886443298);
        }
        if (this.field8116 != null) {
            this.field8116.method1459(false);
        }
        if (this.field8087 != null) {
            this.method3388(-15371);
            Enumeration var2 = this.field7976.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field7976.get(var3);
                this.field8087.releaseSurface(var3, var4);
            }
            this.field8087.release();
            this.field8087 = null;
        }
        if (this.field8138) {
            class511.method2982(0, true, false);
            this.field8138 = false;
        }
    }

    @OriginalMember(owner = "client!lea", name = "e", descriptor = "(IIIIII)V")
    public final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8023;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        this.method3324(1);
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method3308((byte) 76, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field8206) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field8206) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!lea", name = "HA", descriptor = "(IIII[I)V")
    public final void method483(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field8014;
        float var6 = (float) arg2 * this.field8164.field3360 + (float) arg0 * this.field8164.field3363 + (float) arg1 * this.field8164.field3333 + this.field8164.field3325;
        if (!(var6 < (float) this.field8214) && !(var6 > (float) this.field8180)) {
            int var7 = (int) (((float) arg2 * this.field8164.field3349 + (float) arg0 * this.field8164.field3346 + (float) arg1 * this.field8164.field3335 + this.field8164.field3327) * (float) this.field8237 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field8164.field3352 + (float) arg0 * this.field8164.field3359 + (float) arg1 * this.field8164.field3340 + this.field8164.field3365) * (float) this.field8204 / (float) arg3);
            if ((float) var7 >= this.field8256 && (float) var7 <= this.field8267 && (float) var8 >= this.field8247 && (float) var8 <= this.field8268) {
                arg4[2] = (int) var6;
                arg4[1] = (int) ((float) var8 + -this.field8247);
                arg4[0] = (int) ((float) var7 + -this.field8256);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZIB)V")
    public final void method3386(boolean arg0, int arg1, byte arg2) {
        ++field7918;
        this.method3378(true, arg0, arg1, arg2 ^ -193);
        if (arg2 != -65) {
            this.method3351(14, 124, -107, (byte) -59);
        }
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(ZI)V")
    public final void method3387(boolean arg0, int arg1) {
        if (arg1 >= 57) {
            if (!arg0 != !this.field8167) {
                if (!arg0) {
                    OpenGL.glDisable(2929);
                } else {
                    OpenGL.glEnable(2929);
                }
                this.field8160 &= -32;
                this.field8167 = arg0;
            }
            ++field8053;
        }
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V")
    public class573(Canvas arg0, class103 arg1, int arg2) {
        super(arg1);
        new class30();
        new class769(16);
        this.field8151 = new class665();
        this.field8153 = new class665();
        this.field8154 = new class665();
        this.field8155 = new class665();
        this.field8156 = new class665();
        this.field8157 = new class665();
        this.field8158 = new class665();
        this.field8164 = new class229();
        this.field8168 = new class229();
        this.field8169 = new class229();
        this.field8188 = 1.0F;
        this.field8193 = 1.0F;
        this.field8177 = 0;
        this.field8180 = 3584;
        this.field8187 = 0;
        this.field8191 = 8448;
        this.field8214 = 50;
        this.field8213 = true;
        this.field8192 = 0;
        this.field8237 = 512;
        this.field8178 = 3584.0F;
        this.field8241 = 1.0F;
        this.field8245 = 8448;
        this.field8202 = 1.0F;
        this.field8199 = -1;
        this.field8251 = -1;
        this.field8246 = new float[16];
        this.field8258 = new float[4];
        this.field8235 = 0.0F;
        this.field8253 = false;
        this.field8173 = -1.0F;
        this.field8262 = 3584.0F;
        this.field8232 = -1.0F;
        this.field8181 = 0;
        this.field8265 = -1.0F;
        this.field8217 = 0;
        this.field8185 = -1;
        this.field8233 = 0;
        this.field8270 = 0;
        this.field8252 = -1;
        this.field8204 = 512;
        this.field8277 = -1.0F;
        this.field8263 = new float[4];
        this.field8271 = 0;
        this.field8278 = new float[4];
        this.field8226 = 0;
        this.field8257 = -1;
        this.field8274 = 0;
        this.field8224 = new float[4];
        this.field8273 = 1.0F;
        this.field8242 = new class217[class279.field4027];
        this.field8238 = new class501(8192);
        this.field8281 = new byte[16384];
        this.field8284 = new int[1];
        this.field8283 = new int[1];
        this.field8286 = new int[1];
        this.field8128 = arg2;
        this.field8103 = this.field8048 = arg0;
        if (!class27.method224(119, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class27.method224(108, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field8087 = new OpenGL();
                this.field8079 = this.field7969 = this.field8087.init(arg0, 8, 8, 8, 24, 0, this.field8128);
                if (~this.field7969 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method3357(6993);
                    int var4 = this.method3365(5851);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field8234 = !this.field8231 ? 5121 : 33639;
                        if (~this.field8250.indexOf("radeon") != 0) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class544.method3151((byte) -120, ' ', this.field8250.replace('/', ' '));
                            for (int var9 = 0; ~var9 > ~var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (var10.charAt(0) == 'x' && var10.length() >= 3 && class256.method1685(var10.substring(1, 3), (byte) -105)) {
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
                                            if (~var10.length() <= -5 && class256.method1685(var10.substring(0, 4), (byte) -105)) {
                                                var5 = class185.method1340(var10.substring(0, 4), (byte) 113);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field8183 = false;
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && ~var5 >= -9251) {
                                    this.field8182 = false;
                                }
                                if (var5 >= 7000 && ~var5 >= -8000) {
                                    this.field8229 = false;
                                }
                            }
                            this.field8220 &= this.field8087.method235("GL_ARB_half_float_pixel");
                            this.field8212 = true;
                            this.field8276 = this.field8229;
                        }
                        if (~this.field8264.indexOf("intel") != 0) {
                            this.field8207 = false;
                        }
                        this.field8200 = !this.field8264.equals("s3 graphics");
                        if (this.field8229) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class588.method3450(false, (byte) -6, true);
                        this.field8138 = true;
                        this.field8123 = new class561(this, super.field6447);
                        this.method3337(123);
                        this.field8136 = new class436(this);
                        this.field8116 = new class212(this);
                        if (this.field8116.method1464(10299)) {
                            this.field8119 = new class151(this);
                            if (!this.field8119.method1193(5)) {
                                this.field8119.method1183(false);
                                this.field8119 = null;
                            }
                        }
                        this.field8121 = new class411(this);
                        this.method3334(-98);
                        this.method3382(false);
                        this.method138();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method142();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "G", descriptor = "(I)V")
    private final void method3388(int arg0) {
        if (arg0 != -15371) {
            this.method435();
        }
        this.field8087.method233();
        ++field8055;
    }

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "(II)Llf;")
    public final class567 method76(int arg0, int arg1) {
        ++field7943;
        return null;
    }

    @OriginalMember(owner = "client!lea", name = "C", descriptor = "(Z)V")
    public final void method513(boolean arg0) {
        this.field8213 = arg0;
        ++field8040;
        this.method3366(false);
    }
}
