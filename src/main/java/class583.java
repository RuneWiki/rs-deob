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

@OriginalClass("client!gi")
public class class583 extends class207 {

    @OriginalMember(owner = "client!gi", name = "yc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field8101 = new Hashtable();

    @OriginalMember(owner = "client!gi", name = "je", descriptor = "I")
    public int field8190 = 128;

    @OriginalMember(owner = "client!gi", name = "ge", descriptor = "Llc;")
    private class556 field8187 = new class556();

    @OriginalMember(owner = "client!gi", name = "pe", descriptor = "Len;")
    private class266 field8196 = new class266();

    @OriginalMember(owner = "client!gi", name = "qe", descriptor = "Len;")
    public class266 field8197 = new class266();

    @OriginalMember(owner = "client!gi", name = "te", descriptor = "I")
    public int field8200 = 8;

    @OriginalMember(owner = "client!gi", name = "re", descriptor = "I")
    public int field8198 = 3;

    @OriginalMember(owner = "client!gi", name = "ue", descriptor = "Z")
    private boolean field8201 = false;

    @OriginalMember(owner = "client!gi", name = "xe", descriptor = "Ldm;")
    private class46 field8204 = new class46();

    @OriginalMember(owner = "client!gi", name = "Be", descriptor = "[Lct;")
    private class125[] field8208 = new class125[4];

    @OriginalMember(owner = "client!gi", name = "Ee", descriptor = "[Lct;")
    private class125[] field8211 = new class125[4];

    @OriginalMember(owner = "client!gi", name = "ze", descriptor = "I")
    private int field8206 = -1;

    @OriginalMember(owner = "client!gi", name = "Fe", descriptor = "I")
    private int field8212 = -1;

    @OriginalMember(owner = "client!gi", name = "Ce", descriptor = "I")
    private int field8209 = -1;

    @OriginalMember(owner = "client!gi", name = "De", descriptor = "[Lct;")
    private class125[] field8210 = new class125[4];

    @OriginalMember(owner = "client!gi", name = "He", descriptor = "Ldm;")
    private class46 field8214;

    @OriginalMember(owner = "client!gi", name = "Ke", descriptor = "Ldm;")
    private class46 field8217;

    @OriginalMember(owner = "client!gi", name = "Le", descriptor = "Ldm;")
    private class46 field8218;

    @OriginalMember(owner = "client!gi", name = "Me", descriptor = "Ldm;")
    private class46 field8219;

    @OriginalMember(owner = "client!gi", name = "Ne", descriptor = "Ldm;")
    private class46 field8220;

    @OriginalMember(owner = "client!gi", name = "Oe", descriptor = "Ldm;")
    private class46 field8221;

    @OriginalMember(owner = "client!gi", name = "Pe", descriptor = "Ldm;")
    private class46 field8222;

    @OriginalMember(owner = "client!gi", name = "bf", descriptor = "I")
    private int field8234;

    @OriginalMember(owner = "client!gi", name = "xf", descriptor = "I")
    public int field8255;

    @OriginalMember(owner = "client!gi", name = "Ze", descriptor = "I")
    public int field8232;

    @OriginalMember(owner = "client!gi", name = "of", descriptor = "I")
    private int field8246;

    @OriginalMember(owner = "client!gi", name = "sf", descriptor = "Z")
    private boolean field8250;

    @OriginalMember(owner = "client!gi", name = "Jf", descriptor = "F")
    public float field8267;

    @OriginalMember(owner = "client!gi", name = "Se", descriptor = "F")
    private float field8225;

    @OriginalMember(owner = "client!gi", name = "Yf", descriptor = "F")
    private float field8282;

    @OriginalMember(owner = "client!gi", name = "ef", descriptor = "I")
    private int field8237;

    @OriginalMember(owner = "client!gi", name = "Cf", descriptor = "[Lrh;")
    private class223[] field8260;

    @OriginalMember(owner = "client!gi", name = "Qf", descriptor = "F")
    public float field8274;

    @OriginalMember(owner = "client!gi", name = "lf", descriptor = "I")
    public int field8243;

    @OriginalMember(owner = "client!gi", name = "cg", descriptor = "I")
    public int field8286;

    @OriginalMember(owner = "client!gi", name = "pg", descriptor = "I")
    public int field8299;

    @OriginalMember(owner = "client!gi", name = "df", descriptor = "I")
    private int field8236;

    @OriginalMember(owner = "client!gi", name = "tg", descriptor = "I")
    private int field8303;

    @OriginalMember(owner = "client!gi", name = "pf", descriptor = "F")
    public float field8247;

    @OriginalMember(owner = "client!gi", name = "Rf", descriptor = "I")
    private int field8275;

    @OriginalMember(owner = "client!gi", name = "zf", descriptor = "I")
    private int field8257;

    @OriginalMember(owner = "client!gi", name = "yg", descriptor = "F")
    public float field8308;

    @OriginalMember(owner = "client!gi", name = "Nf", descriptor = "F")
    private float field8271;

    @OriginalMember(owner = "client!gi", name = "Lf", descriptor = "F")
    private float field8269;

    @OriginalMember(owner = "client!gi", name = "Ag", descriptor = "F")
    public float field8310;

    @OriginalMember(owner = "client!gi", name = "Tf", descriptor = "I")
    private int field8277;

    @OriginalMember(owner = "client!gi", name = "xg", descriptor = "[F")
    private float[] field8307;

    @OriginalMember(owner = "client!gi", name = "Cg", descriptor = "[F")
    private float[] field8312;

    @OriginalMember(owner = "client!gi", name = "Rg", descriptor = "F")
    private float field8327;

    @OriginalMember(owner = "client!gi", name = "Te", descriptor = "I")
    public int field8226;

    @OriginalMember(owner = "client!gi", name = "zg", descriptor = "F")
    public float field8309;

    @OriginalMember(owner = "client!gi", name = "ag", descriptor = "I")
    private int field8284;

    @OriginalMember(owner = "client!gi", name = "mf", descriptor = "I")
    private int field8244;

    @OriginalMember(owner = "client!gi", name = "Og", descriptor = "F")
    public float field8324;

    @OriginalMember(owner = "client!gi", name = "Hg", descriptor = "I")
    public int field8317;

    @OriginalMember(owner = "client!gi", name = "Yg", descriptor = "I")
    public int field8334;

    @OriginalMember(owner = "client!gi", name = "Jg", descriptor = "[F")
    private float[] field8319;

    @OriginalMember(owner = "client!gi", name = "Ng", descriptor = "I")
    public int field8323;

    @OriginalMember(owner = "client!gi", name = "Tg", descriptor = "[F")
    public float[] field8329;

    @OriginalMember(owner = "client!gi", name = "eh", descriptor = "F")
    public float field8340;

    @OriginalMember(owner = "client!gi", name = "Ug", descriptor = "I")
    public int field8330;

    @OriginalMember(owner = "client!gi", name = "dh", descriptor = "[F")
    private float[] field8339;

    @OriginalMember(owner = "client!gi", name = "ah", descriptor = "I")
    public int field8336;

    @OriginalMember(owner = "client!gi", name = "eg", descriptor = "Lmh;")
    public class541 field8288;

    @OriginalMember(owner = "client!gi", name = "jh", descriptor = "[I")
    public int[] field8345;

    @OriginalMember(owner = "client!gi", name = "ih", descriptor = "[I")
    public int[] field8344;

    @OriginalMember(owner = "client!gi", name = "kh", descriptor = "[B")
    public byte[] field8346;

    @OriginalMember(owner = "client!gi", name = "lh", descriptor = "[I")
    public int[] field8347;

    @OriginalMember(owner = "client!gi", name = "Id", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8163;

    @OriginalMember(owner = "client!gi", name = "fc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8082;

    @OriginalMember(owner = "client!gi", name = "ne", descriptor = "I")
    public int field8194;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field8005;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "J")
    private long field7997;

    @OriginalMember(owner = "client!gi", name = "jc", descriptor = "J")
    private long field8086;

    @OriginalMember(owner = "client!gi", name = "wf", descriptor = "Z")
    public boolean field8254;

    @OriginalMember(owner = "client!gi", name = "Vf", descriptor = "I")
    public int field8279;

    @OriginalMember(owner = "client!gi", name = "Zg", descriptor = "Ljava/lang/String;")
    private String field8335;

    @OriginalMember(owner = "client!gi", name = "bg", descriptor = "Z")
    public boolean field8285;

    @OriginalMember(owner = "client!gi", name = "We", descriptor = "Z")
    public boolean field8229;

    @OriginalMember(owner = "client!gi", name = "lg", descriptor = "Z")
    private boolean field8295;

    @OriginalMember(owner = "client!gi", name = "vf", descriptor = "Z")
    public boolean field8253;

    @OriginalMember(owner = "client!gi", name = "qf", descriptor = "Z")
    public boolean field8248;

    @OriginalMember(owner = "client!gi", name = "qg", descriptor = "Z")
    private boolean field8300;

    @OriginalMember(owner = "client!gi", name = "Mg", descriptor = "Ljava/lang/String;")
    private String field8322;

    @OriginalMember(owner = "client!gi", name = "wg", descriptor = "Z")
    public boolean field8306;

    @OriginalMember(owner = "client!gi", name = "tf", descriptor = "Z")
    private boolean field8251;

    @OriginalMember(owner = "client!gi", name = "ie", descriptor = "Lme;")
    private class166 field8189;

    @OriginalMember(owner = "client!gi", name = "se", descriptor = "Lpba;")
    public class277 field8199;

    @OriginalMember(owner = "client!gi", name = "le", descriptor = "Lcf;")
    private class519 field8192;

    @OriginalMember(owner = "client!gi", name = "he", descriptor = "Luaa;")
    private class98 field8188;

    @OriginalMember(owner = "client!gi", name = "oe", descriptor = "Los;")
    private class375 field8195;

    @OriginalMember(owner = "client!gi", name = "cc", descriptor = "I")
    public static int field8079 = 0;

    @OriginalMember(owner = "client!gi", name = "zc", descriptor = "Lhf;")
    public static class333 field8102 = new class333();

    @OriginalMember(owner = "client!gi", name = "ee", descriptor = "Lvf;")
    public static class131 field8185 = new class131();

    @OriginalMember(owner = "client!gi", name = "cf", descriptor = "F")
    private float field8235;

    @OriginalMember(owner = "client!gi", name = "nf", descriptor = "F")
    public float field8245;

    @OriginalMember(owner = "client!gi", name = "Gf", descriptor = "F")
    public float field8264;

    @OriginalMember(owner = "client!gi", name = "Kf", descriptor = "F")
    public float field8268;

    @OriginalMember(owner = "client!gi", name = "Mf", descriptor = "F")
    public float field8270;

    @OriginalMember(owner = "client!gi", name = "Xf", descriptor = "F")
    public float field8281;

    @OriginalMember(owner = "client!gi", name = "gg", descriptor = "F")
    private float field8290;

    @OriginalMember(owner = "client!gi", name = "vg", descriptor = "F")
    private float field8305;

    @OriginalMember(owner = "client!gi", name = "Qg", descriptor = "F")
    public float field8326;

    @OriginalMember(owner = "client!gi", name = "gh", descriptor = "F")
    public float field8342;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public static int field7993;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field7994;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public static int field7995;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    public static int field7996;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "I")
    public static int field7998;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public static int field7999;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public static int field8000;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    public static int field8001;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    private int field8002;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public static int field8003;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field8004;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
    public static int field8006;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
    public static int field8007;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
    public static int field8008;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
    public static int field8009;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
    public static int field8010;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
    public static int field8011;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    public static int field8013;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
    public static int field8014;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    public static int field8015;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
    public static int field8016;

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public static int field8017;

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "I")
    public static int field8018;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    public static int field8019;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
    public static int field8020;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "I")
    public static int field8021;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
    public static int field8022;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "I")
    public static int field8023;

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "I")
    public static int field8024;

    @OriginalMember(owner = "client!gi", name = "ab", descriptor = "I")
    public static int field8025;

    @OriginalMember(owner = "client!gi", name = "bb", descriptor = "I")
    public static int field8026;

    @OriginalMember(owner = "client!gi", name = "cb", descriptor = "I")
    public int field8027;

    @OriginalMember(owner = "client!gi", name = "db", descriptor = "I")
    public static int field8028;

    @OriginalMember(owner = "client!gi", name = "eb", descriptor = "I")
    public static int field8029;

    @OriginalMember(owner = "client!gi", name = "fb", descriptor = "I")
    public static int field8030;

    @OriginalMember(owner = "client!gi", name = "gb", descriptor = "I")
    public static int field8031;

    @OriginalMember(owner = "client!gi", name = "hb", descriptor = "I")
    public static int field8032;

    @OriginalMember(owner = "client!gi", name = "ib", descriptor = "I")
    public static int field8033;

    @OriginalMember(owner = "client!gi", name = "jb", descriptor = "I")
    public static int field8034;

    @OriginalMember(owner = "client!gi", name = "kb", descriptor = "I")
    public static int field8035;

    @OriginalMember(owner = "client!gi", name = "lb", descriptor = "I")
    public static int field8036;

    @OriginalMember(owner = "client!gi", name = "mb", descriptor = "I")
    public static int field8037;

    @OriginalMember(owner = "client!gi", name = "nb", descriptor = "I")
    public static int field8038;

    @OriginalMember(owner = "client!gi", name = "ob", descriptor = "I")
    public static int field8039;

    @OriginalMember(owner = "client!gi", name = "pb", descriptor = "I")
    public static int field8040;

    @OriginalMember(owner = "client!gi", name = "qb", descriptor = "I")
    public static int field8041;

    @OriginalMember(owner = "client!gi", name = "rb", descriptor = "I")
    public static int field8042;

    @OriginalMember(owner = "client!gi", name = "sb", descriptor = "I")
    public static int field8043;

    @OriginalMember(owner = "client!gi", name = "tb", descriptor = "I")
    public static int field8044;

    @OriginalMember(owner = "client!gi", name = "ub", descriptor = "I")
    public static int field8045;

    @OriginalMember(owner = "client!gi", name = "vb", descriptor = "I")
    public static int field8046;

    @OriginalMember(owner = "client!gi", name = "wb", descriptor = "I")
    public static int field8047;

    @OriginalMember(owner = "client!gi", name = "xb", descriptor = "I")
    public static int field8048;

    @OriginalMember(owner = "client!gi", name = "yb", descriptor = "I")
    public static int field8049;

    @OriginalMember(owner = "client!gi", name = "zb", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!gi", name = "Ab", descriptor = "I")
    public static int field8051;

    @OriginalMember(owner = "client!gi", name = "Bb", descriptor = "I")
    public static int field8052;

    @OriginalMember(owner = "client!gi", name = "Cb", descriptor = "I")
    public static int field8053;

    @OriginalMember(owner = "client!gi", name = "Db", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!gi", name = "Eb", descriptor = "I")
    public static int field8055;

    @OriginalMember(owner = "client!gi", name = "Fb", descriptor = "I")
    public static int field8056;

    @OriginalMember(owner = "client!gi", name = "Gb", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!gi", name = "Hb", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!gi", name = "Ib", descriptor = "I")
    public static int field8059;

    @OriginalMember(owner = "client!gi", name = "Jb", descriptor = "I")
    public static int field8060;

    @OriginalMember(owner = "client!gi", name = "Kb", descriptor = "I")
    public static int field8061;

    @OriginalMember(owner = "client!gi", name = "Lb", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!gi", name = "Mb", descriptor = "I")
    public static int field8063;

    @OriginalMember(owner = "client!gi", name = "Nb", descriptor = "I")
    public static int field8064;

    @OriginalMember(owner = "client!gi", name = "Ob", descriptor = "I")
    public static int field8065;

    @OriginalMember(owner = "client!gi", name = "Pb", descriptor = "I")
    public static int field8066;

    @OriginalMember(owner = "client!gi", name = "Qb", descriptor = "I")
    public static int field8067;

    @OriginalMember(owner = "client!gi", name = "Rb", descriptor = "I")
    public static int field8068;

    @OriginalMember(owner = "client!gi", name = "Sb", descriptor = "I")
    public static int field8069;

    @OriginalMember(owner = "client!gi", name = "Tb", descriptor = "I")
    public static int field8070;

    @OriginalMember(owner = "client!gi", name = "Ub", descriptor = "I")
    public static int field8071;

    @OriginalMember(owner = "client!gi", name = "Vb", descriptor = "I")
    public static int field8072;

    @OriginalMember(owner = "client!gi", name = "Wb", descriptor = "I")
    public static int field8073;

    @OriginalMember(owner = "client!gi", name = "Xb", descriptor = "I")
    public static int field8074;

    @OriginalMember(owner = "client!gi", name = "Yb", descriptor = "I")
    public static int field8075;

    @OriginalMember(owner = "client!gi", name = "Zb", descriptor = "I")
    public static int field8076;

    @OriginalMember(owner = "client!gi", name = "ac", descriptor = "I")
    public static int field8077;

    @OriginalMember(owner = "client!gi", name = "bc", descriptor = "I")
    public static int field8078;

    @OriginalMember(owner = "client!gi", name = "dc", descriptor = "I")
    public static int field8080;

    @OriginalMember(owner = "client!gi", name = "ec", descriptor = "I")
    public static int field8081;

    @OriginalMember(owner = "client!gi", name = "gc", descriptor = "I")
    public static int field8083;

    @OriginalMember(owner = "client!gi", name = "hc", descriptor = "I")
    public static int field8084;

    @OriginalMember(owner = "client!gi", name = "ic", descriptor = "I")
    public static int field8085;

    @OriginalMember(owner = "client!gi", name = "kc", descriptor = "I")
    public static int field8087;

    @OriginalMember(owner = "client!gi", name = "lc", descriptor = "I")
    public static int field8088;

    @OriginalMember(owner = "client!gi", name = "mc", descriptor = "I")
    public static int field8089;

    @OriginalMember(owner = "client!gi", name = "nc", descriptor = "I")
    public static int field8090;

    @OriginalMember(owner = "client!gi", name = "oc", descriptor = "I")
    public static int field8091;

    @OriginalMember(owner = "client!gi", name = "pc", descriptor = "I")
    public static int field8092;

    @OriginalMember(owner = "client!gi", name = "qc", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!gi", name = "rc", descriptor = "I")
    public static int field8094;

    @OriginalMember(owner = "client!gi", name = "sc", descriptor = "I")
    public static int field8095;

    @OriginalMember(owner = "client!gi", name = "tc", descriptor = "I")
    public static int field8096;

    @OriginalMember(owner = "client!gi", name = "uc", descriptor = "I")
    public static int field8097;

    @OriginalMember(owner = "client!gi", name = "vc", descriptor = "I")
    public static int field8098;

    @OriginalMember(owner = "client!gi", name = "wc", descriptor = "I")
    public static int field8099;

    @OriginalMember(owner = "client!gi", name = "xc", descriptor = "I")
    public static int field8100;

    @OriginalMember(owner = "client!gi", name = "Ac", descriptor = "I")
    public static int field8103;

    @OriginalMember(owner = "client!gi", name = "Bc", descriptor = "I")
    public static int field8104;

    @OriginalMember(owner = "client!gi", name = "Cc", descriptor = "I")
    public static int field8105;

    @OriginalMember(owner = "client!gi", name = "Dc", descriptor = "I")
    public static int field8106;

    @OriginalMember(owner = "client!gi", name = "Ec", descriptor = "I")
    public static int field8107;

    @OriginalMember(owner = "client!gi", name = "Fc", descriptor = "I")
    public static int field8108;

    @OriginalMember(owner = "client!gi", name = "Gc", descriptor = "I")
    public static int field8109;

    @OriginalMember(owner = "client!gi", name = "Hc", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!gi", name = "Ic", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!gi", name = "Jc", descriptor = "I")
    public static int field8112;

    @OriginalMember(owner = "client!gi", name = "Kc", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!gi", name = "Lc", descriptor = "I")
    public static int field8114;

    @OriginalMember(owner = "client!gi", name = "Mc", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!gi", name = "Nc", descriptor = "I")
    public static int field8116;

    @OriginalMember(owner = "client!gi", name = "Oc", descriptor = "I")
    public static int field8117;

    @OriginalMember(owner = "client!gi", name = "Pc", descriptor = "I")
    public static int field8118;

    @OriginalMember(owner = "client!gi", name = "Qc", descriptor = "I")
    public static int field8119;

    @OriginalMember(owner = "client!gi", name = "Rc", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!gi", name = "Sc", descriptor = "I")
    public static int field8121;

    @OriginalMember(owner = "client!gi", name = "Tc", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!gi", name = "Uc", descriptor = "I")
    public static int field8123;

    @OriginalMember(owner = "client!gi", name = "Vc", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!gi", name = "Wc", descriptor = "I")
    public static int field8125;

    @OriginalMember(owner = "client!gi", name = "Xc", descriptor = "I")
    public static int field8126;

    @OriginalMember(owner = "client!gi", name = "Yc", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!gi", name = "Zc", descriptor = "I")
    public static int field8128;

    @OriginalMember(owner = "client!gi", name = "ad", descriptor = "I")
    public static int field8129;

    @OriginalMember(owner = "client!gi", name = "bd", descriptor = "I")
    public static int field8130;

    @OriginalMember(owner = "client!gi", name = "cd", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!gi", name = "dd", descriptor = "I")
    public static int field8132;

    @OriginalMember(owner = "client!gi", name = "ed", descriptor = "I")
    public static int field8133;

    @OriginalMember(owner = "client!gi", name = "fd", descriptor = "I")
    public static int field8134;

    @OriginalMember(owner = "client!gi", name = "gd", descriptor = "I")
    public static int field8135;

    @OriginalMember(owner = "client!gi", name = "hd", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!gi", name = "id", descriptor = "I")
    public static int field8137;

    @OriginalMember(owner = "client!gi", name = "jd", descriptor = "I")
    public static int field8138;

    @OriginalMember(owner = "client!gi", name = "kd", descriptor = "I")
    public static int field8139;

    @OriginalMember(owner = "client!gi", name = "ld", descriptor = "I")
    public static int field8140;

    @OriginalMember(owner = "client!gi", name = "md", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!gi", name = "nd", descriptor = "I")
    public static int field8142;

    @OriginalMember(owner = "client!gi", name = "od", descriptor = "I")
    public static int field8143;

    @OriginalMember(owner = "client!gi", name = "pd", descriptor = "I")
    public static int field8144;

    @OriginalMember(owner = "client!gi", name = "qd", descriptor = "I")
    public static int field8145;

    @OriginalMember(owner = "client!gi", name = "rd", descriptor = "I")
    public static int field8146;

    @OriginalMember(owner = "client!gi", name = "sd", descriptor = "I")
    public static int field8147;

    @OriginalMember(owner = "client!gi", name = "td", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!gi", name = "ud", descriptor = "I")
    public static int field8149;

    @OriginalMember(owner = "client!gi", name = "vd", descriptor = "I")
    public static int field8150;

    @OriginalMember(owner = "client!gi", name = "wd", descriptor = "I")
    public static int field8151;

    @OriginalMember(owner = "client!gi", name = "xd", descriptor = "I")
    public static int field8152;

    @OriginalMember(owner = "client!gi", name = "yd", descriptor = "I")
    public static int field8153;

    @OriginalMember(owner = "client!gi", name = "zd", descriptor = "I")
    public static int field8154;

    @OriginalMember(owner = "client!gi", name = "Ad", descriptor = "I")
    public static int field8155;

    @OriginalMember(owner = "client!gi", name = "Bd", descriptor = "I")
    public static int field8156;

    @OriginalMember(owner = "client!gi", name = "Cd", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!gi", name = "Dd", descriptor = "I")
    public static int field8158;

    @OriginalMember(owner = "client!gi", name = "Ed", descriptor = "I")
    public static int field8159;

    @OriginalMember(owner = "client!gi", name = "Fd", descriptor = "I")
    private int field8160;

    @OriginalMember(owner = "client!gi", name = "Gd", descriptor = "I")
    public static int field8161;

    @OriginalMember(owner = "client!gi", name = "Hd", descriptor = "I")
    public static int field8162;

    @OriginalMember(owner = "client!gi", name = "Jd", descriptor = "I")
    public static int field8164;

    @OriginalMember(owner = "client!gi", name = "Kd", descriptor = "I")
    public static int field8165;

    @OriginalMember(owner = "client!gi", name = "Ld", descriptor = "I")
    public static int field8166;

    @OriginalMember(owner = "client!gi", name = "Md", descriptor = "I")
    public static int field8167;

    @OriginalMember(owner = "client!gi", name = "Nd", descriptor = "I")
    public static int field8168;

    @OriginalMember(owner = "client!gi", name = "Od", descriptor = "I")
    public static int field8169;

    @OriginalMember(owner = "client!gi", name = "Pd", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!gi", name = "Qd", descriptor = "I")
    public static int field8171;

    @OriginalMember(owner = "client!gi", name = "Rd", descriptor = "I")
    public static int field8172;

    @OriginalMember(owner = "client!gi", name = "Sd", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!gi", name = "Td", descriptor = "I")
    public static int field8174;

    @OriginalMember(owner = "client!gi", name = "Ud", descriptor = "I")
    public static int field8175;

    @OriginalMember(owner = "client!gi", name = "Vd", descriptor = "I")
    public static int field8176;

    @OriginalMember(owner = "client!gi", name = "Wd", descriptor = "I")
    public static int field8177;

    @OriginalMember(owner = "client!gi", name = "Xd", descriptor = "I")
    public static int field8178;

    @OriginalMember(owner = "client!gi", name = "Yd", descriptor = "I")
    public static int field8179;

    @OriginalMember(owner = "client!gi", name = "Zd", descriptor = "I")
    public static int field8180;

    @OriginalMember(owner = "client!gi", name = "ae", descriptor = "I")
    public static int field8181;

    @OriginalMember(owner = "client!gi", name = "be", descriptor = "I")
    public static int field8182;

    @OriginalMember(owner = "client!gi", name = "ce", descriptor = "I")
    public static int field8183;

    @OriginalMember(owner = "client!gi", name = "de", descriptor = "I")
    public int field8184;

    @OriginalMember(owner = "client!gi", name = "fe", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!gi", name = "ke", descriptor = "I")
    public static int field8191;

    @OriginalMember(owner = "client!gi", name = "me", descriptor = "I")
    public static int field8193;

    @OriginalMember(owner = "client!gi", name = "ve", descriptor = "I")
    public int field8202;

    @OriginalMember(owner = "client!gi", name = "Ge", descriptor = "I")
    private int field8213;

    @OriginalMember(owner = "client!gi", name = "Ie", descriptor = "I")
    public int field8215;

    @OriginalMember(owner = "client!gi", name = "Je", descriptor = "I")
    public int field8216;

    @OriginalMember(owner = "client!gi", name = "Ue", descriptor = "I")
    private int field8227;

    @OriginalMember(owner = "client!gi", name = "Ve", descriptor = "I")
    public int field8228;

    @OriginalMember(owner = "client!gi", name = "ff", descriptor = "I")
    private int field8238;

    @OriginalMember(owner = "client!gi", name = "hf", descriptor = "I")
    private int field8240;

    @OriginalMember(owner = "client!gi", name = "yf", descriptor = "I")
    public int field8256;

    @OriginalMember(owner = "client!gi", name = "Af", descriptor = "I")
    public int field8258;

    @OriginalMember(owner = "client!gi", name = "Df", descriptor = "I")
    private int field8261;

    @OriginalMember(owner = "client!gi", name = "Of", descriptor = "I")
    private int field8272;

    @OriginalMember(owner = "client!gi", name = "Pf", descriptor = "I")
    private int field8273;

    @OriginalMember(owner = "client!gi", name = "Zf", descriptor = "I")
    private int field8283;

    @OriginalMember(owner = "client!gi", name = "kg", descriptor = "I")
    private int field8294;

    @OriginalMember(owner = "client!gi", name = "sg", descriptor = "I")
    private int field8302;

    @OriginalMember(owner = "client!gi", name = "Fg", descriptor = "I")
    public int field8315;

    @OriginalMember(owner = "client!gi", name = "Gg", descriptor = "I")
    private int field8316;

    @OriginalMember(owner = "client!gi", name = "Xg", descriptor = "I")
    private int field8333;

    @OriginalMember(owner = "client!gi", name = "hh", descriptor = "I")
    private int field8343;

    @OriginalMember(owner = "client!gi", name = "mh", descriptor = "I")
    private int field8348;

    @OriginalMember(owner = "client!gi", name = "Wg", descriptor = "J")
    private long field8332;

    @OriginalMember(owner = "client!gi", name = "ye", descriptor = "Lct;")
    private class125 field8205;

    @OriginalMember(owner = "client!gi", name = "Ae", descriptor = "Lct;")
    private class125 field8207;

    @OriginalMember(owner = "client!gi", name = "jg", descriptor = "Lgw;")
    private class146 field8293;

    @OriginalMember(owner = "client!gi", name = "Eg", descriptor = "Len;")
    public class266 field8314;

    @OriginalMember(owner = "client!gi", name = "Lg", descriptor = "Len;")
    public class266 field8321;

    @OriginalMember(owner = "client!gi", name = "jf", descriptor = "Les;")
    private class320 field8241;

    @OriginalMember(owner = "client!gi", name = "If", descriptor = "Lah;")
    private class322 field8266;

    @OriginalMember(owner = "client!gi", name = "Sf", descriptor = "Lqd;")
    private class381 field8276;

    @OriginalMember(owner = "client!gi", name = "Kg", descriptor = "Lqd;")
    private class381 field8320;

    @OriginalMember(owner = "client!gi", name = "fh", descriptor = "Laea;")
    public class45 field8341;

    @OriginalMember(owner = "client!gi", name = "uf", descriptor = "Ldd;")
    public class603 field8252;

    @OriginalMember(owner = "client!gi", name = "ch", descriptor = "Ldd;")
    public class603 field8338;

    @OriginalMember(owner = "client!gi", name = "Qe", descriptor = "Lww;")
    public class624 field8223;

    @OriginalMember(owner = "client!gi", name = "Ye", descriptor = "Lww;")
    public class624 field8231;

    @OriginalMember(owner = "client!gi", name = "Ff", descriptor = "Lww;")
    public class624 field8263;

    @OriginalMember(owner = "client!gi", name = "fg", descriptor = "Lww;")
    public class624 field8289;

    @OriginalMember(owner = "client!gi", name = "ig", descriptor = "Lww;")
    public class624 field8292;

    @OriginalMember(owner = "client!gi", name = "og", descriptor = "Lww;")
    public class624 field8298;

    @OriginalMember(owner = "client!gi", name = "ug", descriptor = "Lww;")
    public class624 field8304;

    @OriginalMember(owner = "client!gi", name = "Bg", descriptor = "Lww;")
    public class624 field8311;

    @OriginalMember(owner = "client!gi", name = "Ig", descriptor = "Lww;")
    public class624 field8318;

    @OriginalMember(owner = "client!gi", name = "Vg", descriptor = "Lww;")
    public class624 field8331;

    @OriginalMember(owner = "client!gi", name = "mg", descriptor = "Lob;")
    public class629 field8296;

    @OriginalMember(owner = "client!gi", name = "we", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field8203;

    @OriginalMember(owner = "client!gi", name = "Re", descriptor = "Z")
    private boolean field8224;

    @OriginalMember(owner = "client!gi", name = "Xe", descriptor = "Z")
    private boolean field8230;

    @OriginalMember(owner = "client!gi", name = "af", descriptor = "Z")
    public boolean field8233;

    @OriginalMember(owner = "client!gi", name = "gf", descriptor = "Z")
    private boolean field8239;

    @OriginalMember(owner = "client!gi", name = "kf", descriptor = "Z")
    private boolean field8242;

    @OriginalMember(owner = "client!gi", name = "rf", descriptor = "Z")
    public boolean field8249;

    @OriginalMember(owner = "client!gi", name = "Bf", descriptor = "Z")
    private boolean field8259;

    @OriginalMember(owner = "client!gi", name = "Ef", descriptor = "Z")
    public boolean field8262;

    @OriginalMember(owner = "client!gi", name = "Hf", descriptor = "Z")
    private boolean field8265;

    @OriginalMember(owner = "client!gi", name = "Uf", descriptor = "Z")
    private boolean field8278;

    @OriginalMember(owner = "client!gi", name = "Wf", descriptor = "Z")
    public boolean field8280;

    @OriginalMember(owner = "client!gi", name = "dg", descriptor = "Z")
    public boolean field8287;

    @OriginalMember(owner = "client!gi", name = "hg", descriptor = "Z")
    private boolean field8291;

    @OriginalMember(owner = "client!gi", name = "ng", descriptor = "Z")
    public boolean field8297;

    @OriginalMember(owner = "client!gi", name = "rg", descriptor = "Z")
    public boolean field8301;

    @OriginalMember(owner = "client!gi", name = "Dg", descriptor = "Z")
    private boolean field8313;

    @OriginalMember(owner = "client!gi", name = "Pg", descriptor = "Z")
    public boolean field8325;

    @OriginalMember(owner = "client!gi", name = "Sg", descriptor = "Z")
    private boolean field8328;

    @OriginalMember(owner = "client!gi", name = "bh", descriptor = "[Lmw;")
    private class418[] field8337;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)Lu;")
    public final class64 method1359(int arg0) {
        ++field8120;
        class456 var2 = new class456(arg0);
        this.field8204.method463(var2, -101);
        return var2;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBI)V")
    public final void method3328(int arg0, byte arg1, int arg2) {
        ++field8075;
        this.field8234 = arg0;
        this.field8246 = arg2;
        int var4 = 116 / ((arg1 - -32) / 54);
        this.method3379((byte) -40);
        this.method3346(-10121);
    }

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "(I)V")
    public final void method3329(int arg0) {
        ++field8035;
        if (arg0 == 8) {
            if (~this.field8283 != -9) {
                this.method3337(-8);
                this.method3402(true, true);
                this.method3375(true, true);
                this.method3331(true, arg0 ^ -25115);
                this.method3348(1, (byte) 2);
                this.field8283 = 8;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "(IIIII)V")
    public final void method1312(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8026;
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        if (~(arg0 + arg2) <= ~this.field8275 && -arg2 + arg0 <= this.field8284 && ~this.field8236 >= ~(arg1 + arg2) && ~(-arg2 + arg1) >= ~this.field8303) {
            this.method3353(16384);
            this.method3348(arg4, (byte) 105);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field8269) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field8327 >= (float) var8) {
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
                if (~var9 < -65) {
                    if (var9 > 512) {
                        var9 = 512;
                    }
                } else {
                    var9 = 64;
                }
                int var10 = class327.method2020(-1594581311, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; var11 > 0; var11 -= var10) {
                    OpenGL.glVertex2f(class622.field8990[var11] * (float) arg2 + var6, class622.field8988[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)I")
    public final int method1306(int arg0, int arg1) {
        ++field8074;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZB)V")
    public final void method3330(boolean arg0, byte arg1) {
        ++field8077;
        if (arg0 == !this.field8328) {
            this.field8328 = arg0;
            this.method3369(-1550);
            this.field8283 &= -8;
        }
        if (arg1 != 36) {
            this.method3358(126, (class418) null);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lr;Lhp;Lm;Lkn;I)V")
    public final void method1366(class157 arg0, class274 arg1, class163 arg2, class631 arg3, int arg4) {
        ++field7994;
        arg0.method154(arg2, arg3, arg4);
        this.method1356(arg1);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1327(Rectangle[] arg0, int arg1) throws class589 {
        ++field8129;
        this.method1307();
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZI)V")
    public final void method3331(boolean arg0, int arg1) {
        if (arg1 == -25107) {
            if (this.field8259 != arg0) {
                this.field8259 = arg0;
                this.method3390(false);
                this.field8283 &= -32;
            }
            ++field8108;
        }
    }

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "()Lm;")
    public final class163 method1318() {
        ++field8115;
        return new class266();
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I[Lrh;)V")
    public final void method1311(int arg0, class223[] arg1) {
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field8260[var3] = arg1[var3];
        }
        ++field8124;
        this.field8261 = arg0;
        if (this.field8294 != 1) {
            this.method3381((byte) -104);
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)V")
    private final void method3332(byte arg0) {
        if (arg0 != 121) {
            this.method1266(-101, -76, -35, -21, 38, -44, (class310) null, 30, 11);
        }
        ++field8109;
        if (this.field8264 == 0.0F) {
            this.field8319[10] = this.field8235;
            this.field8319[14] = this.field8305;
        } else {
            float var2 = this.field8324 / (this.field8324 + this.field8264);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field8305 * (-var2 + 1.0F) / this.field8264;
            this.field8319[10] = this.field8235 + var4;
            this.field8319[14] = this.field8305 * var3;
        }
        this.field8247 = (float) this.field8323 - this.field8264;
        this.field8308 = (this.field8319[14] - (float) this.field8323) / this.field8319[10];
    }

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "(IIII)V")
    public final void method1336(int arg0, int arg1, int arg2, int arg3) {
        this.field8244 = arg1;
        this.field8262 = true;
        this.field8315 = arg0;
        this.field8255 = arg2;
        this.field8232 = arg3;
        ++field8013;
        this.field8195.method2224(false, 0, 63, 3, 0, false);
        this.field8195.field5052.method2905(23697);
        this.method3361((byte) -53);
        this.method3397((byte) 12);
    }

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "(I)V")
    private final void method3333(int arg0) {
        ++field8001;
        if (this.field8239) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field8239 = false;
        }
        if (arg0 != 8458) {
            this.method3382(47, (class125) null);
        }
    }

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "(I)V")
    public final void method3334(int arg0) {
        if (arg0 != 20354) {
            this.field8300 = true;
        }
        ++field8000;
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "()Z")
    public final boolean method1346() {
        ++field8039;
        return true;
    }

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "()V")
    public final void method1299() {
        ++field8178;
        if (this.field8251 && ~this.field8184 < -1 && ~this.field8027 < -1) {
            int var1 = this.field8275;
            int var2 = this.field8284;
            int var3 = this.field8236;
            int var4 = this.field8303;
            this.method1269();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3377(-948554512);
            this.method3402(true, false);
            this.method3330(false, (byte) 36);
            this.method3375(true, false);
            this.method3331(false, -25107);
            this.method3358(32886, (class418) null);
            this.method3408(-2, (byte) 64);
            this.method3396((byte) -63, 1);
            this.method3348(0, (byte) 55);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field8184, this.field8027, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method1308(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public final class174 method1270(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field8176;
        return new class627(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lm;)V")
    public final void method1355(class163 arg0) {
        this.field8321 = (class266) arg0;
        ++field8003;
        this.field8314.method1745(false, this.field8321);
        if (this.field8294 != 1) {
            this.method3373(0);
        }
    }

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "(I)V")
    public final void method1302(int arg0) {
        ++field8040;
        this.field8198 = 0;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field8198;
        }
        this.field8200 = 1 << this.field8198;
    }

    @OriginalMember(owner = "client!gi", name = "ba", descriptor = "()I")
    public final int method1287() {
        ++field8024;
        int var1 = this.field8343;
        this.field8343 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(IBI)V")
    public final synchronized void method3335(int arg0, byte arg1, int arg2) {
        ++field8014;
        if (arg1 != 78) {
            this.method1305();
        }
        class10 var4 = new class10(arg2);
        var4.field2524 = (long) arg0;
        this.field8218.method463(var4, -122);
    }

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "()V")
    public final void method1342() {
        ++field8017;
        this.field8192.method2989((byte) -109);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)V")
    public final synchronized void method3336(int arg0, int arg1, int arg2) {
        ++field8105;
        class10 var4 = new class10(arg1);
        var4.field2524 = (long) arg0;
        if (arg2 < 75) {
            this.method1269();
        }
        this.field8220.method463(var4, -107);
    }

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "(I)V")
    private final void method3337(int arg0) {
        if (this.field8294 != 2) {
            this.field8294 = 2;
            this.method3376((byte) 69);
            this.method3373(arg0 + 8);
            this.field8283 &= -8;
        }
        if (arg0 != -8) {
            this.method1303(43, 112, 74, -98);
        }
        ++field8159;
    }

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "()Z")
    public final boolean method1305() {
        ++field8022;
        return true;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BIZ)V")
    public final void method3338(byte arg0, int arg1, boolean arg2) {
        int var4 = -34 / ((75 - arg0) / 37);
        ++field8058;
        this.method3378(arg2, arg1, true, (byte) 2);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([BZ)Ljava/lang/String;")
    public static final String method3339(byte[] arg0, boolean arg1) {
        ++field8064;
        if (!arg1) {
            method3345(18, (byte) 57);
        }
        int var2 = arg0.length;
        char[] var3 = new char[var2];
        int var4 = 0;
        for (int var5 = 0; var2 > var5; ++var5) {
            int var6 = arg0[var5] & 255;
            if (var6 >= 128) {
                if (~var6 > -195) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
                }
                if (~var6 <= -225) {
                    if (var6 < 240) {
                        if (var2 <= var5 + 2) {
                            throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                        }
                        ++var5;
                        int var7 = 255 & arg0[var5];
                        if (var7 >= 128 && var7 <= 191) {
                            ++var5;
                            int var8 = 255 & arg0[var5];
                            if (~var8 <= -129 && ~var8 >= -192) {
                                var3[var4++] = (char) class73.method578(class73.method578(class589.method3454(-8256, var7 << 6), class589.method3454(var6, -225) << 12), class589.method3454(var8, -129));
                                continue;
                            }
                            throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                        }
                        throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                    }
                    if (~var6 <= -245) {
                        throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var6);
                    }
                    throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                } else {
                    if (var2 <= var5 + 1) {
                        throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                    }
                    ++var5;
                    int var9 = 255 & arg0[var5];
                    if (var9 < 128 || var9 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var3[var4++] = (char) class73.method578(class589.method3454(var9, -129), class589.method3454(-12352, var6 << 6));
                }
            } else {
                var3[var4++] = (char) var6;
            }
        }
        return new String(var3, 0, var4);
    }

    @OriginalMember(owner = "client!gi", name = "la", descriptor = "(FF)V")
    public final void method1333(float arg0, float arg1) {
        ++field8171;
        if (this.field8324 != arg0 || this.field8264 != arg1) {
            this.field8264 = arg1;
            this.field8324 = arg0;
            this.method3332((byte) 121);
            if (~this.field8294 == -4) {
                this.method3387((byte) 127);
                return;
            }
            if (~this.field8294 != -3) {
                return;
            }
            this.method3376((byte) 102);
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(IIII)V")
    public final void method3340(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg1 + 34184, arg2);
        ++field8049;
        if (arg3 != 1) {
            this.method1288((class157[]) null, (class274) null, (class163) null, (class631[]) null, 36);
        }
        OpenGL.glTexEnvi(8960, arg1 + 34200, arg0);
    }

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "()I")
    public final int method1286() {
        ++field8193;
        return this.field8216 + this.field8213 + this.field8215;
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)V")
    private final void method3341(byte arg0) {
        if (arg0 != 120) {
            this.method3410((byte) 18, (class125) null);
        }
        ++field8004;
        class291.field4002[2] = this.field8310 * this.field8274;
        class291.field4002[0] = this.field8310 * this.field8309;
        class291.field4002[3] = 1.0F;
        class291.field4002[1] = this.field8340 * this.field8310;
        OpenGL.glLightfv(16384, 4609, class291.field4002, 0);
        class291.field4002[0] = -this.field8267 * this.field8309;
        class291.field4002[1] = -this.field8267 * this.field8340;
        class291.field4002[2] = -this.field8267 * this.field8274;
        class291.field4002[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class291.field4002, 0);
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "([I)V")
    public final void method1350(int[] arg0) {
        arg0[1] = this.field8236;
        arg0[3] = this.field8303;
        arg0[0] = this.field8275;
        arg0[2] = this.field8284;
        ++field8036;
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "()V")
    public final void method1276() {
        ++field8080;
        for (class176 var1 = this.field8204.method456((byte) -127); var1 != null; var1 = this.field8204.method460((byte) 42)) {
            ((class456) var1).method2669(89);
        }
        if (this.field8192 != null) {
            this.field8192.method2998((byte) -71);
        }
        if (this.field8005 != null) {
            this.method3354((byte) 41);
            Enumeration var2 = this.field8101.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field8101.get(var3);
                this.field8005.releaseSurface(var3, var4);
            }
            this.field8005.release();
            this.field8005 = null;
        }
        if (this.field8201) {
            class278.method1792(true, false, false);
            this.field8201 = false;
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(IIII)V")
    public final void method3342(int arg0, int arg1, int arg2, int arg3) {
        ++field8169;
        OpenGL.glDrawArrays(arg3, arg0, arg1);
        if (arg2 != 20986) {
            this.method1350((int[]) null);
        }
    }

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "(I)V")
    private final void method3343(int arg0) {
        if (this.field8294 != 3) {
            this.field8294 = 3;
            this.method3387((byte) 127);
            this.method3373(0);
            this.field8283 &= -8;
        }
        if (arg0 != -8) {
            this.field8234 = -73;
        }
        ++field8066;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lu;)V")
    public final void method1296(class64 arg0) {
        ++field8134;
        this.field8203 = ((class456) arg0).field6424;
        if (this.field8276 == null) {
            class541 var2 = new class541(80);
            if (this.field8254) {
                var2.method3100(-1.0F, -794787512);
                var2.method3100(-1.0F, -794787512);
                var2.method3100(0.0F, -794787512);
                var2.method3100(0.0F, -794787512);
                var2.method3100(1.0F, -794787512);
                var2.method3100(1.0F, -794787512);
                var2.method3100(-1.0F, -794787512);
                var2.method3100(0.0F, -794787512);
                var2.method3100(1.0F, -794787512);
                var2.method3100(1.0F, -794787512);
                var2.method3100(1.0F, -794787512);
                var2.method3100(1.0F, -794787512);
                var2.method3100(0.0F, -794787512);
                var2.method3100(1.0F, -794787512);
                var2.method3100(0.0F, -794787512);
                var2.method3100(-1.0F, -794787512);
                var2.method3100(1.0F, -794787512);
                var2.method3100(0.0F, -794787512);
                var2.method3100(0.0F, -794787512);
                var2.method3100(0.0F, -794787512);
            } else {
                var2.method3101((byte) 76, -1.0F);
                var2.method3101((byte) 75, -1.0F);
                var2.method3101((byte) 56, 0.0F);
                var2.method3101((byte) 58, 0.0F);
                var2.method3101((byte) 96, 1.0F);
                var2.method3101((byte) 56, 1.0F);
                var2.method3101((byte) 91, -1.0F);
                var2.method3101((byte) 116, 0.0F);
                var2.method3101((byte) 54, 1.0F);
                var2.method3101((byte) 78, 1.0F);
                var2.method3101((byte) 70, 1.0F);
                var2.method3101((byte) 95, 1.0F);
                var2.method3101((byte) 106, 0.0F);
                var2.method3101((byte) 55, 1.0F);
                var2.method3101((byte) 57, 0.0F);
                var2.method3101((byte) 77, -1.0F);
                var2.method3101((byte) 93, 1.0F);
                var2.method3101((byte) 110, 0.0F);
                var2.method3101((byte) 127, 0.0F);
                var2.method3101((byte) 90, 0.0F);
            }
            this.field8276 = this.method3400(20, -104, false, var2.field165, var2.field138);
            this.field8252 = new class603(this.field8276, 5126, 3, 0);
            this.field8338 = new class603(this.field8276, 5126, 2, 12);
            this.field8187.method3156(this, true);
        }
    }

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "()Z")
    public final boolean method1319() {
        ++field8061;
        return this.field8188 != null && (this.field8194 <= 1 || this.field8313);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lbt;Z)Lha;")
    public final class52 method1332(class38 arg0, boolean arg1) {
        ++field8165;
        int[] var3 = new int[arg0.field785 * arg0.field783];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field790 == null) {
            for (int var6 = 0; ~arg0.field783 < ~var6; ++var6) {
                for (int var7 = 0; ~var7 > ~arg0.field785; ++var7) {
                    int var8 = arg0.field784[255 & arg0.field782[var4++]];
                    var3[var5++] = var8 == 0 ? 0 : class73.method578(var8, -16777216);
                }
            }
        } else {
            for (int var9 = 0; ~arg0.field783 < ~var9; ++var9) {
                for (int var11 = 0; ~arg0.field785 < ~var11; ++var11) {
                    var3[var5++] = class73.method578(arg0.field784[class589.method3454(255, arg0.field782[var4])], arg0.field790[var4] << 24);
                    ++var4;
                }
            }
        }
        class52 var10 = this.method1363(var3, 0, arg0.field785, arg0.field785, arg0.field783);
        var10.method420(arg0.field787, arg0.field786, arg0.field789, arg0.field788);
        return var10;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
    public final void method1272(int arg0) {
        ++field8137;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "(III)V")
    public final void method1334(int arg0, int arg1, int arg2) {
        ++field8136;
        if (this.field8336 != arg0 || ~this.field8286 != ~arg1 || ~this.field8317 != ~arg2) {
            this.field8286 = arg1;
            this.field8336 = arg0;
            this.field8317 = arg2;
            if (this.field8262) {
                return;
            }
            this.method3361((byte) -73);
            this.method3397((byte) 12);
        }
    }

    @OriginalMember(owner = "client!gi", name = "ta", descriptor = "(II)V")
    public final void method1290(int arg0, int arg1) {
        if (this.field8334 != arg0 || ~this.field8323 != ~arg1) {
            this.field8334 = arg0;
            this.field8323 = arg1;
            this.method3357(7);
            this.method3361((byte) -90);
            if (this.field8294 == 3) {
                this.method3387((byte) 127);
            } else if (~this.field8294 == -3) {
                this.method3376((byte) 107);
            }
        }
        ++field8037;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;I)V")
    public class583(Canvas arg0, class17 arg1, int arg2) {
        super(arg1);
        new class366();
        new class205(16);
        this.field8214 = new class46();
        this.field8217 = new class46();
        this.field8218 = new class46();
        this.field8219 = new class46();
        this.field8220 = new class46();
        this.field8221 = new class46();
        this.field8222 = new class46();
        this.field8234 = 0;
        this.field8255 = -1;
        this.field8232 = 0;
        this.field8246 = 0;
        this.field8250 = true;
        this.field8267 = -1.0F;
        this.field8225 = 1.0F;
        this.field8282 = 0.0F;
        this.field8237 = 8448;
        this.field8260 = new class223[class443.field6307];
        this.field8274 = 1.0F;
        this.field8243 = 512;
        this.field8286 = -1;
        this.field8299 = 0;
        this.field8236 = 0;
        this.field8303 = 0;
        this.field8247 = 3584.0F;
        this.field8275 = 0;
        this.field8257 = 8448;
        this.field8308 = 3584.0F;
        this.field8271 = 1.0F;
        this.field8269 = -1.0F;
        this.field8310 = -1.0F;
        this.field8277 = -1;
        this.field8307 = new float[4];
        this.field8312 = new float[4];
        this.field8327 = -1.0F;
        this.field8226 = 0;
        this.field8309 = 1.0F;
        this.field8284 = 0;
        this.field8244 = -1;
        this.field8324 = 3000.0F;
        this.field8317 = 0;
        this.field8334 = 50;
        this.field8319 = new float[16];
        this.field8323 = 3584;
        this.field8329 = new float[4];
        this.field8340 = 1.0F;
        this.field8330 = 512;
        this.field8339 = new float[4];
        this.field8336 = -1;
        this.field8288 = new class541(8192);
        this.field8345 = new int[1];
        this.field8344 = new int[1];
        this.field8346 = new byte[16384];
        this.field8347 = new int[1];
        this.field8082 = this.field8163 = arg0;
        this.field8194 = arg2;
        if (!class336.method2038(false, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class336.method2038(false, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field8005 = new OpenGL();
                this.field8086 = this.field7997 = this.field8005.init(arg0, 8, 8, 8, 24, 0, this.field8194);
                if (this.field7997 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method3370(1759054200);
                    int var4 = this.method3371(true);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field8279 = this.field8254 ? 33639 : 5121;
                        if (~this.field8335.indexOf("radeon") != 0) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class294.method1884(1, this.field8335.replace('/', ' '), ' ');
                            for (int var9 = 0; var9 < var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (~var10.length() < -1) {
                                        if (~var10.charAt(0) == -121 && var10.length() >= 3 && class510.method2945(var10.substring(1, 3), (byte) 115)) {
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
                                            if (~var10.length() <= -5 && class510.method2945(var10.substring(0, 4), (byte) 119)) {
                                                var5 = class547.method3122(var10.substring(0, 4), 113);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var16) {
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field8285 = false;
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && ~var5 >= -9251) {
                                    this.field8229 = false;
                                }
                                if (var5 >= 7000 && ~var5 >= -8000) {
                                    this.field8295 = false;
                                }
                            }
                            this.field8253 &= this.field8005.method3073("GL_ARB_half_float_pixel");
                            this.field8248 = true;
                            this.field8300 = this.field8295;
                        }
                        if (~this.field8322.indexOf("intel") != 0) {
                            this.field8306 = false;
                        }
                        this.field8251 = !this.field8322.equals("s3 graphics");
                        if (this.field8295) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var14) {
                                throw new RuntimeException("");
                            }
                        }
                        class568.method3231(-87, true, false);
                        this.field8201 = true;
                        this.field8189 = new class166(this, super.field2924);
                        this.method3399((byte) 83);
                        this.field8199 = new class277(this);
                        this.field8192 = new class519(this);
                        if (this.field8192.method2990(0)) {
                            this.field8188 = new class98(this);
                            if (!this.field8188.method697(-26304)) {
                                this.field8188.method696(27659);
                                this.field8188 = null;
                            }
                        }
                        this.field8195 = new class375(this);
                        this.method3372(3008);
                        this.method3359((byte) -86);
                        OpenGL.glClear(16640);
                        int var12 = 0;
                        while (true) {
                            try {
                                this.field8005.swapBuffers();
                                break;
                            } catch (Exception var15) {
                                if (~(var12++) < -6) {
                                    throw new RuntimeException("");
                                }
                                class21.method220(0, 100L);
                            }
                        }
                        OpenGL.glClear(16384);
                    }
                }
            } catch (Throwable var17) {
                var17.printStackTrace();
                this.method1276();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIZ)Lha;")
    public final class52 method1300(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field8121;
        return new class510(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(II)I")
    public final int method3344(int arg0, int arg1) {
        ++field8030;
        if (arg0 != 4) {
            this.field8252 = null;
        }
        if (arg1 != 5121 && arg1 != 5120) {
            if (~arg1 != -5124 && arg1 != 5122) {
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

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(IIIIII)V")
    public final void method1349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3353(16384);
        ++field8034;
        this.method3348(arg5, (byte) 126);
        float var7 = (float) arg2 - (float) arg0;
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

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)Ltl;")
    public static final class531 method3345(int arg0, byte arg1) {
        ++field7999;
        class531[] var2 = class626.method3653(false);
        for (int var3 = 0; var3 < var2.length; ++var3) {
            class531 var4 = var2[var3];
            if (~var4.field7444 == ~arg0) {
                return var4;
            }
        }
        if (arg1 != 70) {
            method3339((byte[]) null, true);
        }
        return null;
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(IIIII)V")
    public final void method1292(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3353(16384);
        ++field8018;
        this.method3348(arg4, (byte) 4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "(I)V")
    public final synchronized void method1362(int arg0) {
        ++field8172;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field8217.method466((byte) 87)) {
            class10 var12 = (class10) this.field8217.method459(3553);
            class37.field776[var2++] = (int) var12.field2524;
            this.field8215 -= var12.field106;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class37.field776, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class37.field776, 0);
            var2 = 0;
        }
        while (!this.field8218.method466((byte) 87)) {
            class10 var11 = (class10) this.field8218.method459(3553);
            class37.field776[var2++] = (int) var11.field2524;
            this.field8216 -= var11.field106;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class37.field776, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class37.field776, 0);
            var2 = 0;
        }
        while (!this.field8219.method466((byte) 87)) {
            class10 var10 = (class10) this.field8219.method459(3553);
            class37.field776[var2++] = var10.field106;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class37.field776, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class37.field776, 0);
            var2 = 0;
        }
        while (!this.field8220.method466((byte) 87)) {
            class10 var9 = (class10) this.field8220.method459(3553);
            class37.field776[var2++] = (int) var9.field2524;
            this.field8213 -= var9.field106;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class37.field776, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class37.field776, 0);
            boolean var4 = false;
        }
        while (!this.field8214.method466((byte) 87)) {
            class10 var8 = (class10) this.field8214.method459(3553);
            OpenGL.glDeleteLists((int) var8.field2524, var8.field106);
        }
        while (!this.field8221.method466((byte) 87)) {
            class176 var7 = this.field8221.method459(3553);
            OpenGL.glDeleteProgramARB((int) var7.field2524);
        }
        while (!this.field8222.method466((byte) 87)) {
            class176 var6 = this.field8222.method459(3553);
            OpenGL.glDeleteObjectARB(var6.field2524);
        }
        while (!this.field8214.method466((byte) 87)) {
            class10 var5 = (class10) this.field8214.method459(3553);
            OpenGL.glDeleteLists((int) var5.field2524, var5.field106);
        }
        this.field8189.method1065((byte) 101);
        if (~this.method1286() < -100663297 && class488.method2835(30160) > this.field8332 + 60000L) {
            System.gc();
            this.field8332 = class488.method2835(30160);
        }
        this.field8202 = var3;
    }

    @OriginalMember(owner = "client!gi", name = "ra", descriptor = "()F")
    public final float method1271() {
        ++field8011;
        return this.field8264;
    }

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "()Z")
    public final boolean method1294() {
        ++field8059;
        return this.field8195.method2223(15938, 3);
    }

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "(IIII)[I")
    public final int[] method1361(int arg0, int arg1, int arg2, int arg3) {
        ++field8041;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field8027 + -var6, arg2, 1, 32993, this.field8279, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "(I)V")
    private final void method3346(int arg0) {
        if (arg0 == -10121) {
            ++field8099;
            if (this.field8275 <= this.field8284 && this.field8236 <= this.field8303) {
                OpenGL.glScissor(this.field8275 + this.field8234, -this.field8303 + this.field8246 + this.field8027, -this.field8275 + this.field8284, -this.field8236 + this.field8303);
            } else {
                OpenGL.glScissor(0, 0, 0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([Lr;Lhp;Lm;[Lkn;I)V")
    public final void method1288(class157[] arg0, class274 arg1, class163 arg2, class631[] arg3, int arg4) {
        ++field8131;
        this.method1360(arg0, arg2, arg3, arg4);
        this.method1356(arg1);
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(B)V")
    public final void method3347(byte arg0) {
        ++field8162;
        if (arg0 > 17) {
            if (~this.field8283 != -17) {
                this.method3343(-8);
                this.method3402(true, true);
                this.method3375(true, true);
                this.method3331(true, -25107);
                this.method3348(1, (byte) 92);
                this.field8283 = 16;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "()Z")
    public final boolean method1338() {
        ++field8012;
        if (this.field8188 != null) {
            if (!this.field8188.method1059(1)) {
                if (!this.field8192.method2992(this.field8188, -2)) {
                    return false;
                }
                this.field8189.method1063(64);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(IB)V")
    public final void method3348(int arg0, byte arg1) {
        if (this.field8302 != arg0) {
            byte var3;
            boolean var4;
            boolean var5;
            if (~arg0 == -2) {
                var3 = 1;
                var4 = true;
                var5 = true;
            } else if (arg0 == 2) {
                var4 = true;
                var3 = 2;
                var5 = false;
            } else if (arg0 != 128) {
                var5 = false;
                var4 = true;
                var3 = 0;
            } else {
                var3 = 3;
                var4 = true;
                var5 = true;
            }
            if (var4 == !this.field8278) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field8278 = var4;
            }
            if (!var5 != !this.field8265) {
                if (!var5) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field8265 = var5;
            }
            if (this.field8227 != var3) {
                if (var3 == 1) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (var3 == 2) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                } else if (var3 == 3) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(774, 1);
                } else {
                    OpenGL.glDisable(3042);
                }
                this.field8227 = var3;
            }
            this.field8302 = arg0;
            this.field8283 &= -29;
        }
        ++field8173;
        if (arg1 <= 1) {
            this.method1319();
        }
    }

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "()Z")
    public final boolean method1328() {
        ++field8157;
        return this.field8188 != null && this.field8188.method1059(1);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lah;I)V")
    public final void method3349(class322 arg0, int arg1) {
        ++field8139;
        if (arg1 != 34963) {
            this.field8241 = null;
        }
        if (this.field8266 != arg0) {
            if (this.field8295) {
                OpenGL.glBindBufferARB(34963, arg0.method1995(-16846));
            }
            this.field8266 = arg0;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field8135;
        this.method3353(16384);
        this.method3348(arg9, (byte) 52);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "()Z")
    public final boolean method1369() {
        ++field8043;
        return false;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILct;)V")
    public final void method3350(int arg0, class125 arg1) {
        ++field8191;
        if (arg0 != -2438) {
            this.method1267();
        }
        if (!this.field8233) {
            if (this.field8212 >= 3) {
                throw new RuntimeException();
            } else {
                if (~this.field8212 <= -1) {
                    this.field8210[this.field8212].method443((byte) -114);
                }
                this.field8207 = this.field8205 = this.field8210[++this.field8212] = arg1;
                this.field8207.method445(-14263);
            }
        } else {
            this.method3355(arg1, 3);
            this.method3382(arg0 + 2535, arg1);
        }
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(II)V")
    public final synchronized void method3351(int arg0, int arg1) {
        ++field8128;
        class176 var3 = new class176();
        var3.field2524 = (long) arg1;
        this.field8221.method463(var3, -96);
        if (arg0 < 91) {
            this.field8195 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lpu;[Lbt;Z)Lra;")
    public final class91 method1348(class483 arg0, class38[] arg1, boolean arg2) {
        ++field8096;
        return new class588(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZFFF)V")
    private final void method3352(boolean arg0, float arg1, float arg2, float arg3) {
        ++field8175;
        OpenGL.glMatrixMode(5890);
        if (this.field8239) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg2, arg3, arg1);
        OpenGL.glMatrixMode(5888);
        this.field8239 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "(I)V")
    private final void method3353(int arg0) {
        if (this.field8283 != 1) {
            this.method3401(6406);
            this.method3402(true, false);
            this.method3330(false, (byte) 36);
            this.method3375(true, false);
            this.method3331(false, -25107);
            this.method3358(32886, (class418) null);
            this.method3408(-2, (byte) 58);
            this.method3396((byte) 107, 1);
            this.field8283 = 1;
        }
        if (arg0 != 16384) {
            this.method3372(56);
        }
        ++field8114;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([IIIII)Lha;")
    public final class52 method1363(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8146;
        return new class510(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gi", name = "YA", descriptor = "()I")
    public final int method1339() {
        ++field8123;
        int var1 = this.field8348;
        this.field8348 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(B)V")
    private final void method3354(byte arg0) {
        int var2 = -92 % ((arg0 - -12) / 38);
        this.field8005.method3072();
        ++field8032;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIII)Lsv;")
    public final class567 method1261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8125;
        return this.field8287 ? new class2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "()V")
    public final void method1337() {
        ++field8052;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lct;I)V")
    public final void method3355(class125 arg0, int arg1) {
        ++field8154;
        if (this.field8206 >= arg1) {
            throw new RuntimeException();
        } else {
            if (~this.field8206 <= -1) {
                this.field8211[this.field8206].method438(true);
            }
            this.field8207 = this.field8211[++this.field8206] = arg0;
            this.field8207.method451((byte) -124);
        }
    }

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "(I)V")
    private final void method3356(int arg0) {
        class291.field4002[0] = this.field8309 * this.field8245;
        if (arg0 == 6694) {
            class291.field4002[2] = this.field8274 * this.field8245;
            class291.field4002[1] = this.field8340 * this.field8245;
            class291.field4002[3] = 1.0F;
            ++field8152;
            OpenGL.glLightModelfv(2899, class291.field4002, 0);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(FFF)V")
    public final void method1279(float arg0, float arg1, float arg2) {
        class58.field1048 = arg2;
        class604.field8709 = arg1;
        ++field8057;
        class323.field4361 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "(I)V")
    private final void method3357(int arg0) {
        ++field8140;
        if (arg0 != 7) {
            this.field8246 = -128;
        }
        float[] var2 = this.field8319;
        float var3 = (float) (-this.field8299 * this.field8334) / (float) this.field8243;
        float var4 = (float) ((-this.field8299 + this.field8184) * this.field8334) / (float) this.field8243;
        float var5 = (float) (this.field8334 * this.field8226) / (float) this.field8330;
        float var6 = (float) ((-this.field8027 + this.field8226) * this.field8334) / (float) this.field8330;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field8334 * 2.0F;
            var2[1] = 0.0F;
            var2[4] = 0.0F;
            var2[7] = 0.0F;
            var2[12] = 0.0F;
            var2[2] = 0.0F;
            var2[6] = 0.0F;
            var2[3] = 0.0F;
            var2[14] = this.field8305 = -((float) this.field8323 * var7) / (float) (-this.field8334 + this.field8323);
            var2[10] = this.field8235 = (float) (-(this.field8334 + this.field8323)) / (float) (this.field8323 - this.field8334);
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[0] = var7 / (var4 - var3);
            var2[13] = 0.0F;
            var2[11] = -1.0F;
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[5] = var7 / (var5 - var6);
            var2[15] = 0.0F;
        } else {
            var2[2] = 0.0F;
            var2[11] = 0.0F;
            var2[0] = 1.0F;
            var2[8] = 0.0F;
            var2[14] = 0.0F;
            var2[12] = 0.0F;
            var2[9] = 0.0F;
            var2[4] = 0.0F;
            var2[15] = 1.0F;
            var2[13] = 0.0F;
            var2[10] = 1.0F;
            var2[1] = 0.0F;
            var2[6] = 0.0F;
            var2[7] = 0.0F;
            var2[5] = 1.0F;
            var2[3] = 0.0F;
        }
        this.method3332((byte) 121);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILmw;)V")
    public final void method3358(int arg0, class418 arg1) {
        ++field8071;
        if (arg0 != 32886) {
            this.method3349((class322) null, -50);
        }
        class418 var3 = this.field8337[this.field8333];
        if (arg1 != var3) {
            if (arg1 != null) {
                if (var3 != null) {
                    if (~arg1.field5882 != ~var3.field5882) {
                        OpenGL.glDisable(var3.field5882);
                        OpenGL.glEnable(arg1.field5882);
                    }
                } else {
                    OpenGL.glEnable(arg1.field5882);
                }
                OpenGL.glBindTexture(arg1.field5882, arg1.method2508((byte) 20));
            } else {
                OpenGL.glDisable(var3.field5882);
            }
            this.field8337[this.field8333] = arg1;
        }
        this.field8283 &= -2;
    }

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "()V")
    public final void method1269() {
        this.field8275 = 0;
        this.field8303 = this.field8027;
        this.field8284 = this.field8184;
        this.field8236 = 0;
        ++field8150;
        OpenGL.glDisable(3089);
        this.method3405((byte) -106);
    }

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "(B)V")
    private final void method3359(byte arg0) {
        ++field8091;
        if (this.field8082 == null) {
            this.field8160 = this.field8002 = 0;
        } else {
            Dimension var2 = this.field8082.getSize();
            this.field8160 = var2.width;
            this.field8002 = var2.height;
        }
        if (this.field8205 == null) {
            this.field8027 = this.field8002;
            this.field8184 = this.field8160;
            this.method3379((byte) -40);
        }
        this.method3377(-948554512);
        int var3 = 16 % ((arg0 - 75) / 48);
        this.method1269();
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(FFFBF)V")
    public final void method3360(float arg0, float arg1, float arg2, byte arg3, float arg4) {
        class291.field4002[1] = arg0;
        class291.field4002[3] = arg2;
        class291.field4002[2] = arg4;
        ++field8042;
        class291.field4002[0] = arg1;
        int var6 = 60 / (arg3 / 44);
        OpenGL.glTexEnvfv(8960, 8705, class291.field4002, 0);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1260(Canvas arg0) {
        ++field8164;
        if (this.field8163 == arg0) {
            throw new RuntimeException();
        } else if (!this.field8101.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field8005.prepareSurface(arg0);
                if (var4 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field8101.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "()Z")
    public final boolean method1304() {
        ++field8170;
        return true;
    }

    @OriginalMember(owner = "client!gi", name = "za", descriptor = "(IIIIII[BII)V")
    public final void method1264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field8147;
        float var10;
        float var11;
        if (this.field8241 != null && arg2 <= this.field8241.field9202 && arg3 <= this.field8241.field9198) {
            this.field8241.method3665(0, arg2, 6406, false, false, 0, arg6, arg3, 0, 0);
            var10 = (float) arg3 * this.field8241.field4331 / (float) this.field8241.field9198;
            var11 = (float) arg2 * this.field8241.field4329 / (float) this.field8241.field9202;
        } else {
            this.field8241 = class46.method454(6406, arg6, false, this, (byte) 126, 6406, arg2, arg3);
            this.field8241.method3666(126, false, false);
            var11 = this.field8241.field4329;
            var10 = this.field8241.field4331;
        }
        this.method3386(16654);
        this.method3358(32886, this.field8241);
        this.method3348(arg8, (byte) 127);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method3362(arg5, 12432);
        this.method3389(false, 34165, 34165);
        this.method3407(0, 768, -116, 34166);
        this.method3407(2, 770, -128, 5890);
        this.method3340(770, 0, 34166, 1);
        this.method3340(770, 2, 5890, 1);
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
        this.method3407(0, 768, -121, 5890);
        this.method3407(2, 770, -120, 34166);
        this.method3340(770, 0, 5890, 1);
        this.method3340(770, 2, 34166, 1);
    }

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "()Lla;")
    public final class384 method1317() {
        ++field8038;
        int var1 = -1;
        if (this.field8322.indexOf("nvidia") == -1) {
            if (this.field8322.indexOf("intel") == -1) {
                if (~this.field8322.indexOf("ati") != 0) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class384(var1, "OpenGL", this.field8240, this.field8335, 0L);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1262(Canvas arg0) {
        ++field8180;
        if (this.field8163 == arg0) {
            throw new RuntimeException();
        } else if (this.field8101.containsKey(arg0)) {
            Long var2 = (Long) this.field8101.get(arg0);
            this.field8005.releaseSurface(arg0, var2);
            this.field8101.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "()F")
    public final float method1326() {
        ++field8161;
        return this.field8324;
    }

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "(B)V")
    private final void method3361(byte arg0) {
        ++field8067;
        int var2 = 31 / ((arg0 - 4) / 57);
        int var3;
        if (this.field8262) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var3 = this.field8244;
        } else {
            this.field8290 = (float) (-this.field8317 + this.field8323) - this.field8282;
            this.field8281 = -((float) this.field8286 * this.field8225) + this.field8290;
            if ((float) this.field8334 > this.field8281) {
                this.field8281 = (float) this.field8334;
            }
            OpenGL.glFogf(2915, this.field8281);
            OpenGL.glFogf(2916, this.field8290);
            var3 = this.field8336;
        }
        class291.field4002[0] = (float) class589.method3454(var3, 16711680) / 1.671168E7F;
        class291.field4002[2] = (float) class589.method3454(var3, 255) / 255.0F;
        class291.field4002[1] = (float) class589.method3454(65280, var3) / 65280.0F;
        OpenGL.glFogfv(2918, class291.field4002, 0);
        if (this.field8262) {
            this.field8195.field5052.method2904(-1280);
        }
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(II)V")
    public final void method3362(int arg0, int arg1) {
        class291.field4002[2] = (float) class589.method3454(255, arg0) / 255.0F;
        ++field8145;
        class291.field4002[3] = (float) (arg0 >>> 24) / 255.0F;
        if (arg1 != 12432) {
            this.field8280 = false;
        }
        class291.field4002[0] = (float) class589.method3454(16711680, arg0) / 1.671168E7F;
        class291.field4002[1] = (float) class589.method3454(65280, arg0) / 65280.0F;
        OpenGL.glTexEnvfv(8960, 8705, class291.field4002, 0);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IJ)V")
    public final synchronized void method3363(int arg0, long arg1) {
        if (arg0 >= -7) {
            this.field8325 = false;
        }
        ++field8084;
        class176 var4 = new class176();
        var4.field2524 = arg1;
        this.field8222.method463(var4, -110);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BII)V")
    public final synchronized void method3364(byte arg0, int arg1, int arg2) {
        ++field8076;
        class10 var4 = new class10(arg2);
        var4.field2524 = (long) arg1;
        this.field8217.method463(var4, -103);
        if (arg0 != 32) {
            this.method1289();
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(FI)V")
    public final void method3365(float arg0, int arg1) {
        if (this.field8271 != arg0) {
            this.field8271 = arg0;
            if (~this.field8294 == -4) {
                this.method3387((byte) 127);
            }
        }
        int var3 = 18 / ((47 - arg1) / 49);
        ++field8007;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lah;IIII)V")
    public final void method3366(class322 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8089;
        int var6 = arg0.method1996(-17760);
        int var7 = arg4 * this.method3344(4, var6);
        if (arg2 != -22887) {
            this.method3374((byte) 83);
        }
        this.method3349(arg0, 34963);
        OpenGL.glDrawElements(arg3, arg1, var6, (long) var7 + arg0.method1997(-14011));
    }

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "(IFFFFF)V")
    public final void method1298(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field8047;
        boolean var7 = ~this.field8277 != ~arg0;
        if (var7 || this.field8310 != arg1 || this.field8267 != arg2) {
            this.field8277 = arg0;
            this.field8310 = arg1;
            this.field8267 = arg2;
            if (var7) {
                this.field8309 = (float) (this.field8277 & 16711680) / 1.671168E7F;
                this.field8340 = (float) (65280 & this.field8277) / 65280.0F;
                this.field8274 = (float) (255 & this.field8277) / 255.0F;
                this.method3356(6694);
            }
            this.method3341((byte) 120);
        }
        if (this.field8339[0] != arg3 || this.field8339[1] != arg4 || this.field8339[2] != arg5) {
            this.field8339[0] = arg3;
            this.field8339[2] = arg5;
            this.field8339[1] = arg4;
            this.field8307[1] = -arg4;
            this.field8307[2] = -arg5;
            this.field8307[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field8329[2] = arg5 * var8;
            this.field8329[0] = arg3 * var8;
            this.field8329[1] = arg4 * var8;
            this.field8312[1] = -this.field8329[1];
            this.field8312[2] = -this.field8329[2];
            this.field8312[0] = -this.field8329[0];
            this.method3374((byte) -126);
            this.field8228 = (int) (arg5 * 256.0F / arg4);
            this.field8256 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
    public final void method1280(int arg0) {
        this.method3370(1759054200);
        ++field8085;
    }

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "(II)I")
    public final int method3367(int arg0, int arg1) {
        ++field8177;
        if (arg1 != 6406 && ~arg1 != -6410) {
            if (arg1 != 6410 && ~arg1 != -34847 && ~arg1 != -34845) {
                if (~arg1 == -6408) {
                    return 3;
                } else if (arg1 != 6408 && arg1 != 34847) {
                    if (arg1 == 34843) {
                        return 6;
                    } else if (~arg1 == -34843) {
                        return 8;
                    } else if (arg1 != 6402) {
                        if (arg1 == 6401) {
                            return 1;
                        } else {
                            if (arg0 != 3553) {
                                this.method3356(42);
                            }
                            throw new IllegalArgumentException("");
                        }
                    } else {
                        return 3;
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

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "()Z")
    public final boolean method1323() {
        ++field8083;
        return this.field8242 && (!this.method1328() || this.field8313);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lsv;Lsv;FLsv;)Lsv;")
    public final class567 method1281(class567 arg0, class567 arg1, float arg2, class567 arg3) {
        ++field8119;
        if (arg0 != null && arg1 != null && this.field8287 && this.field8306) {
            class365 var5 = null;
            class146 var6 = (class146) arg0;
            class146 var7 = (class146) arg1;
            class403 var8 = var6.method11(-41);
            class403 var9 = var7.method11(127);
            if (var8 != null && var9 != null) {
                int var10 = ~var9.field5733 <= ~var8.field5733 ? var9.field5733 : var8.field5733;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class365) {
                    class365 var11 = (class365) arg3;
                    if (var11.method2190(113) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class365(this, var10);
                }
                if (var5.method2192(var9, (byte) 87, arg2, var8)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "(I)V")
    public static void method3368(int arg0) {
        if (arg0 == 0) {
            field8185 = null;
            field8102 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "(I)V")
    private final void method3369(int arg0) {
        ++field8072;
        if (arg0 != -1550) {
            this.field8257 = -1;
        }
        if (this.field8328 && !this.field8291) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "()V")
    public final void method1267() {
        ++field8095;
        if (this.field8188 != null && this.field8188.method1059(1)) {
            this.field8192.method2996(this.field8188, 80);
            this.field8189.method1063(64);
        }
    }

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "(I)V")
    private final void method3370(int arg0) {
        ++field8133;
        if (arg0 != 1759054200) {
            this.method1363((int[]) null, -93, -48, 28, -41);
        }
        int var2 = 0;
        while (!this.field8005.method3071()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class21.method220(0, 1000L);
        }
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(Z)I")
    private final int method3371(boolean arg0) {
        ++field8106;
        this.field8322 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field8335 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field8322.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field8322.indexOf("brian paul") != -1 || this.field8322.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class294.method1884(1, var3.replace('.', ' '), ' ');
        if (var4.length < 2) {
            var2 |= 4;
        } else {
            try {
                int var5 = class547.method3122(var4[0], -127);
                int var6 = class547.method3122(var4[1], -126);
                this.field8240 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (this.field8240 < 12) {
            var2 |= 2;
        }
        if (!this.field8005.method3073("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field8005.method3073("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field8258 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field8273 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field8316 = var7[0];
        if (~this.field8258 > -3 || ~this.field8273 > -3 || ~this.field8316 > -3) {
            var2 |= 16;
        }
        this.field8254 = Stream.method3294();
        this.field8005.arePbuffersAvailable();
        this.field8295 = this.field8005.method3073("GL_ARB_vertex_buffer_object");
        this.field8242 = this.field8005.method3073("GL_ARB_multisample");
        this.field8301 = this.field8005.method3073("GL_ARB_vertex_program");
        if (!arg0) {
            this.field8209 = 61;
        }
        this.field8005.method3073("GL_ARB_fragment_program");
        this.field8280 = this.field8005.method3073("GL_ARB_vertex_shader");
        this.field8297 = this.field8005.method3073("GL_ARB_fragment_shader");
        this.field8229 = this.field8005.method3073("GL_EXT_texture3D");
        this.field8253 = this.field8005.method3073("GL_ARB_texture_rectangle");
        this.field8287 = this.field8005.method3073("GL_ARB_texture_cube_map");
        this.field8285 = this.field8005.method3073("GL_ARB_texture_float");
        this.field8249 = false;
        this.field8306 = this.field8005.method3073("GL_EXT_framebuffer_object");
        this.field8233 = this.field8005.method3073("GL_EXT_framebuffer_blit");
        this.field8325 = this.field8005.method3073("GL_EXT_framebuffer_multisample");
        this.field8313 = this.field8325 & this.field8233;
        OpenGL.glGetFloatv(2834, class291.field4002, 0);
        this.field8269 = class291.field4002[0];
        this.field8327 = class291.field4002[1];
        return var2 == 0 ? 0 : var2;
    }

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "(I)V")
    private final void method3372(int arg0) {
        this.method3408(-2, (byte) 86);
        ++field8144;
        for (int var2 = this.field8258 + -1; ~var2 <= -1; --var2) {
            this.method3398(arg0 ^ -3056, var2);
            this.method3358(32886, (class418) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method3389(false, 8448, 8448);
        this.method3407(2, 770, arg0 + -3126, 34168);
        this.method3333(8458);
        this.field8302 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field8227 = 1;
        OpenGL.glEnable(arg0);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field8265 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field8278 = true;
        this.method3402(true, true);
        this.method3330(true, (byte) 36);
        this.method3375(true, true);
        this.method3331(true, arg0 + -28115);
        this.method3377(-948554512);
        this.field8005.setSwapInterval(0);
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
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field8277 = this.field8336 = -1;
        this.method1269();
    }

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "(I)V")
    private final void method3373(int arg0) {
        OpenGL.glLoadIdentity();
        ++field8174;
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field8321.method1746((byte) 66), arg0);
        if (this.field8262) {
            this.field8195.field5052.method2905(23697);
        }
        this.method3374((byte) -86);
        this.method3381((byte) -120);
    }

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "()V")
    public final void method1289() {
        OpenGL.glFinish();
        ++field8019;
    }

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "()Z")
    public final boolean method1340() {
        ++field8081;
        return true;
    }

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "(B)V")
    public final void method3374(byte arg0) {
        OpenGL.glLightfv(16384, 4611, this.field8329, 0);
        ++field8046;
        if (arg0 > -18) {
            this.method1333(-1.0645763F, 2.0175483F);
        }
        OpenGL.glLightfv(16385, 4611, this.field8312, 0);
    }

    @OriginalMember(owner = "client!gi", name = "UA", descriptor = "(IIIII)V")
    public final void method1329(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3353(16384);
        ++field8166;
        this.method3348(arg4, (byte) 96);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)V")
    public final void method1268(int arg0, int arg1, int arg2, int arg3) {
        ++field8088;
        this.field8192.method2991(arg2, 6408, arg0, arg1, arg3);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZZ)V")
    public final void method3375(boolean arg0, boolean arg1) {
        ++field8073;
        if (arg1 == !this.field8224) {
            if (arg1) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field8224 = arg1;
            this.field8283 &= -32;
        }
        if (!arg0) {
            this.field8286 = 95;
        }
    }

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "(B)V")
    private final void method3376(byte arg0) {
        ++field8055;
        if (arg0 >= 45) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(this.field8319, 0);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "(IIII)V")
    public final void method1303(int arg0, int arg1, int arg2, int arg3) {
        if (~arg0 < ~this.field8275) {
            this.field8275 = arg0;
        }
        if (this.field8284 > arg2) {
            this.field8284 = arg2;
        }
        if (arg3 < this.field8303) {
            this.field8303 = arg3;
        }
        ++field8153;
        if (arg1 > this.field8236) {
            this.field8236 = arg1;
        }
        OpenGL.glEnable(3089);
        this.method3405((byte) -43);
        this.method3346(-10121);
    }

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "(I)V")
    public final void method3377(int arg0) {
        if (arg0 != -948554512) {
            this.field8192 = null;
        }
        ++field8015;
        if (~this.field8294 != -1) {
            this.field8283 &= -32;
            this.field8294 = 0;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZIZB)V")
    public final void method3378(boolean arg0, int arg1, boolean arg2, byte arg3) {
        if (~this.field8238 != ~arg1) {
            if (~arg1 > -1) {
                this.method3333(8458);
                this.method3358(arg3 + 32884, (class418) null);
                this.method3396((byte) 124, 0);
                if (!this.field8262) {
                    this.field8195.method2224(arg2, 0, 60, 0, 0, arg0);
                }
            } else {
                class629 var5 = this.field8189.method1067(arg1, (byte) 121);
                class211 var6 = super.field2924.method190((byte) -89, arg1);
                if (~var6.field2968 == -1 && var6.field2986 == 0) {
                    this.method3333(8458);
                } else {
                    int var7 = !var6.field2965 ? 128 : 64;
                    int var8 = var7 * 50;
                    this.method3352(true, 0.0F, (float) (this.field8202 % var8 * var6.field2968) / (float) var8, (float) (this.field8202 % var8 * var6.field2986) / (float) var8);
                }
                if (this.field8262) {
                    this.method3358(arg3 + 32884, var5);
                    this.method3396((byte) -117, var6.field2978);
                } else {
                    this.field8195.method2224(arg2, var6.field2966, 60, var6.field2984, var6.field2972, arg0);
                    if (!this.field8195.method2222(arg3 + -9586, var5, var6.field2978)) {
                        this.method3358(32886, var5);
                        this.method3396((byte) -43, var6.field2978);
                    }
                }
            }
            this.field8238 = arg1;
        }
        ++field8104;
        this.field8283 &= -8;
        if (arg3 != 2) {
            this.method3369(-28);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II[I[I)Lpa;")
    public final class310 method1322(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field8056;
        return class269.method1753(arg2, -1, arg3, arg1, this, arg0);
    }

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "(IIII)V")
    public final void method1308(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field8184 > ~arg2) {
            arg2 = this.field8184;
        }
        ++field8149;
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (~this.field8027 > ~arg3) {
            arg3 = this.field8027;
        }
        this.field8275 = arg0;
        this.field8303 = arg3;
        this.field8236 = arg1;
        this.field8284 = arg2;
        OpenGL.glEnable(3089);
        this.method3405((byte) -128);
        this.method3346(-10121);
    }

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "(B)V")
    private final void method3379(byte arg0) {
        ++field8021;
        if (arg0 == -40) {
            OpenGL.glViewport(this.field8234, this.field8246, this.field8184, this.field8027);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ldd;Ldd;Ldd;ILdd;)V")
    public final void method3380(class603 arg0, class603 arg1, class603 arg2, int arg3, class603 arg4) {
        ++field8045;
        if (arg3 != 15097) {
            this.field8347 = null;
        }
        if (arg2 != null) {
            this.method3406(true, arg2.field8705);
            OpenGL.glVertexPointer(arg2.field8704, arg2.field8706, this.field8320.method2015(arg3 + -4027), this.field8320.method2016(true) + (long) arg2.field8702);
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        if (arg1 != null) {
            this.method3406(true, arg1.field8705);
            OpenGL.glNormalPointer(arg1.field8706, this.field8320.method2015(arg3 + -4027), this.field8320.method2016(true) + (long) arg1.field8702);
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg0 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method3406(true, arg0.field8705);
            OpenGL.glColorPointer(arg0.field8704, arg0.field8706, this.field8320.method2015(11070), this.field8320.method2016(true) + (long) arg0.field8702);
            OpenGL.glEnableClientState(32886);
        }
        if (arg4 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method3406(true, arg4.field8705);
            OpenGL.glTexCoordPointer(arg4.field8704, arg4.field8706, this.field8320.method2015(11070), this.field8320.method2016(true) + (long) arg4.field8702);
            OpenGL.glEnableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "(IIIIII)Z")
    public final boolean method1263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8031;
        float var7 = (float) arg2 * this.field8321.field3717 + (float) arg0 * this.field8321.field3727 + (float) arg1 * this.field8321.field3730 + this.field8321.field3720;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field8321.field3717 + (float) arg3 * this.field8321.field3727 + (float) arg4 * this.field8321.field3730 + this.field8321.field3720;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field8334) || !(var8 < (float) this.field8334)) && (!((float) this.field8323 < var7) || !((float) this.field8323 < var8))) {
            int var9 = (int) (((float) arg2 * this.field8321.field3731 + (float) arg0 * this.field8321.field3711 + (float) arg1 * this.field8321.field3712 + this.field8321.field3703) * (float) this.field8243 / var7);
            int var10 = (int) (((float) arg5 * this.field8321.field3731 + (float) arg3 * this.field8321.field3711 + (float) arg4 * this.field8321.field3712 + this.field8321.field3703) * (float) this.field8243 / var8);
            if ((float) var9 < this.field8268 && this.field8268 > (float) var10 || (float) var9 > this.field8326 && (float) var10 > this.field8326) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field8321.field3706 + (float) arg0 * this.field8321.field3715 + (float) arg1 * this.field8321.field3705 + this.field8321.field3724) * (float) this.field8330 / var7);
                int var12 = (int) (((float) arg5 * this.field8321.field3706 + (float) arg3 * this.field8321.field3715 + (float) arg4 * this.field8321.field3705 + this.field8321.field3724) * (float) this.field8330 / var8);
                return (!(this.field8270 > (float) var11) || !((float) var12 < this.field8270)) && (!(this.field8342 < (float) var11) || !(this.field8342 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gi", name = "CA", descriptor = "()I")
    public final int method1282() {
        ++field8138;
        return this.field8323;
    }

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "(B)V")
    private final void method3381(byte arg0) {
        ++field8158;
        int var2;
        for (var2 = 0; var2 < this.field8261; ++var2) {
            class223 var3 = this.field8260[var2];
            class412.field5796[0] = (float) var3.method1434(7);
            int var4 = var2 + 16386;
            class412.field5796[1] = (float) var3.method1431(123);
            class412.field5796[2] = (float) var3.method1429(4330);
            class412.field5796[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class412.field5796, 0);
            int var5 = var3.method1430(true);
            float var6 = var3.method1435(0) / 255.0F;
            class412.field5796[2] = (float) class589.method3454(var5, 255) * var6;
            class412.field5796[1] = var6 * (float) class589.method3454(255, var5 >> 8);
            class412.field5796[0] = (float) class589.method3454(var5 >> 16, 255) * var6;
            OpenGL.glLightfv(var4, 4609, class412.field5796, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method1433(4294) * var3.method1433(4294)));
            OpenGL.glEnable(var4);
        }
        while (~var2 > ~this.field8272) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        if (arg0 <= -98) {
            this.field8272 = this.field8261;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(ILct;)V")
    public final void method3382(int arg0, class125 arg1) {
        ++field8103;
        if (this.field8209 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field8209 <= -1) {
                this.field8208[this.field8209].method437(-19911);
            }
            int var3 = 125 / ((12 - arg0) / 41);
            this.field8205 = this.field8208[++this.field8209] = arg1;
            this.field8205.method434((byte) 116);
        }
    }

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "(ILpa;II)V")
    public final void method1347(int arg0, class310 arg1, int arg2, int arg3) {
        ++field7993;
        class401 var5 = (class401) arg1;
        class320 var6 = var5.field5716;
        this.method3386(16654);
        this.method3358(32886, var5.field5716);
        this.method3348(1, (byte) 58);
        this.method3389(false, 7681, 8448);
        this.method3407(0, 768, -125, 34167);
        float var7 = var6.field4329 / (float) var6.field4333;
        float var8 = var6.field4331 / (float) var6.field4336;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (this.field8275 - arg2) * var7, (float) (-arg3 + this.field8236) * var8);
        OpenGL.glVertex2i(this.field8275, this.field8236);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field8275) * var7, (float) (-arg3 + this.field8303) * var8);
        OpenGL.glVertex2i(this.field8275, this.field8303);
        OpenGL.glTexCoord2f((float) (this.field8284 - arg2) * var7, (float) (-arg3 + this.field8303) * var8);
        OpenGL.glVertex2i(this.field8284, this.field8303);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field8284) * var7, (float) (-arg3 + this.field8236) * var8);
        OpenGL.glVertex2i(this.field8284, this.field8236);
        OpenGL.glEnd();
        this.method3407(0, 768, -127, 5890);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIII)V")
    public final void method1278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field8118;
        this.method1349(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "()Z")
    public final boolean method1345() {
        ++field7998;
        return true;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZIILjaclib/memory/Buffer;)Lqd;")
    public final class381 method3383(int arg0, boolean arg1, int arg2, int arg3, Buffer arg4) {
        ++field8155;
        if (arg2 != 19821) {
            this.method1318();
        }
        return (class381) (!this.field8295 || arg1 && !this.field8300 ? new class405(this, arg0, arg4) : new class326(this, arg0, arg4, arg3, arg1));
    }

    @OriginalMember(owner = "client!gi", name = "xa", descriptor = "()V")
    public final void method1352() {
        this.field8262 = false;
        ++field8063;
        this.field8195.method2224(false, 0, 79, 0, 0, false);
        this.method3361((byte) -76);
        this.method3397((byte) 12);
    }

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "(B)V")
    public final void method3384(byte arg0) {
        OpenGL.glPushMatrix();
        int var2 = -97 / ((-92 - arg0) / 33);
        ++field8068;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Len;I)V")
    public final void method3385(class266 arg0, int arg1) {
        ++field8016;
        OpenGL.glPushMatrix();
        int var3 = -33 % ((35 - arg1) / 61);
        OpenGL.glMultMatrixf(arg0.method1746((byte) 62), 0);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lln;IIII)Lr;")
    public final class157 method1293(class317 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8006;
        return new class624(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
    public final void method1283(boolean arg0) {
        ++field8100;
    }

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "(I)V")
    public final void method1274(int arg0) {
        ++field8028;
        this.method3348(0, (byte) 19);
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "(I)V")
    public final void method3386(int arg0) {
        if (arg0 != 16654) {
            this.field8301 = true;
        }
        ++field8186;
        if (this.field8283 != 2) {
            this.method3401(6406);
            this.method3402(true, false);
            this.method3330(false, (byte) 36);
            this.method3375(true, false);
            this.method3331(false, arg0 ^ -8989);
            this.method3408(-2, (byte) 79);
            this.field8283 = 2;
        }
    }

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "()V")
    public final void method1307() throws class589 {
        ++field8167;
        try {
            this.field8005.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "(B)V")
    private final void method3387(byte arg0) {
        ++field8097;
        float var2 = (float) (-this.field8299) * this.field8271 / (float) this.field8243;
        if (arg0 != 127) {
            this.field8343 = -103;
        }
        float var3 = (float) (-this.field8226) * this.field8271 / (float) this.field8330;
        float var4 = (float) (-this.field8299 + this.field8184) * this.field8271 / (float) this.field8243;
        float var5 = (float) (this.field8027 - this.field8226) * this.field8271 / (float) this.field8330;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field8334 - this.field8264), (double) ((float) this.field8323 - this.field8264));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIILpa;II)V")
    public final void method1266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class310 arg6, int arg7, int arg8) {
        ++field8183;
        class401 var10 = (class401) arg6;
        class320 var11 = var10.field5716;
        this.method3386(16654);
        this.method3358(32886, var10.field5716);
        this.method3348(arg5, (byte) 31);
        this.method3389(false, 7681, 8448);
        this.method3407(0, 768, -116, 34167);
        float var12 = var11.field4329 / (float) var11.field4333;
        float var13 = var11.field4331 / (float) var11.field4336;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var14 * var16;
        float var18 = var15 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (arg1 - arg8) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method3407(0, 768, -127, 5890);
    }

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "()Z")
    public final boolean method1310() {
        ++field8113;
        return true;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lct;B)V")
    public final void method3388(class125 arg0, byte arg1) {
        ++field8062;
        if (this.field8209 >= 0 && this.field8208[this.field8209] == arg0) {
            if (arg1 <= 15) {
                this.field8283 = 97;
            }
            this.field8208[this.field8209--] = null;
            arg0.method437(-19911);
            if (~this.field8209 <= -1) {
                this.field8205 = this.field8208[this.field8209];
                this.field8205.method434((byte) 109);
            } else {
                this.field8205 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(IIIIII)V")
    public final void method1325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8023;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        this.method3353(16384);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method3348(arg5, (byte) 62);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field8242) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field8242) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "()Lm;")
    public final class163 method1344() {
        ++field8142;
        return this.field8196;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZII)V")
    public final void method3389(boolean arg0, int arg1, int arg2) {
        ++field8051;
        if (arg0) {
            this.method3351(-38, 109);
        }
        if (this.field8333 == 0) {
            boolean var4 = false;
            if (this.field8237 != arg1) {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                var4 = true;
                this.field8237 = arg1;
            }
            if (this.field8257 != arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                this.field8257 = arg2;
                var4 = true;
            }
            if (var4) {
                this.field8283 &= -30;
                return;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg1);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        }
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(Z)V")
    private final void method3390(boolean arg0) {
        OpenGL.glDepthMask(this.field8259 && this.field8250);
        if (arg0) {
            this.method3338((byte) -126, -78, true);
        }
        ++field8029;
    }

    @OriginalMember(owner = "client!gi", name = "IA", descriptor = "(III[I)V")
    public final void method1324(int arg0, int arg1, int arg2, int[] arg3) {
        ++field8156;
        float var5 = (float) arg2 * this.field8321.field3717 + (float) arg0 * this.field8321.field3727 + (float) arg1 * this.field8321.field3730 + this.field8321.field3720;
        if (!((float) this.field8334 > var5) && !(var5 > (float) this.field8323)) {
            int var6 = (int) (((float) arg2 * this.field8321.field3731 + (float) arg0 * this.field8321.field3711 + (float) arg1 * this.field8321.field3712 + this.field8321.field3703) * (float) this.field8243 / var5);
            int var7 = (int) (((float) arg2 * this.field8321.field3706 + (float) arg0 * this.field8321.field3715 + (float) arg1 * this.field8321.field3705 + this.field8321.field3724) * (float) this.field8330 / var5);
            if (this.field8268 <= (float) var6 && (float) var6 <= this.field8326 && (float) var7 >= this.field8270 && this.field8342 >= (float) var7) {
                arg3[1] = (int) ((float) var7 + -this.field8270);
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 + -this.field8268);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1343(Canvas arg0) {
        this.field8086 = 0L;
        ++field8054;
        this.field8082 = null;
        if (arg0 != null && this.field8163 != arg0) {
            if (this.field8101.containsKey(arg0)) {
                Long var2 = (Long) this.field8101.get(arg0);
                this.field8086 = var2;
                this.field8082 = arg0;
            }
        } else {
            this.field8086 = this.field7997;
            this.field8082 = this.field8163;
        }
        if (this.field8082 != null && ~this.field8086 != -1L) {
            this.field8005.setSurface(this.field8086);
            this.method3359((byte) -125);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIF)Lrh;")
    public final class223 method1320(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field8110;
        return new class495(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIZ[BI)Lah;")
    public final class322 method3391(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        ++field8069;
        if (arg0 != 7681) {
            this.field8251 = false;
        }
        return (class322) (!this.field8295 || arg2 && !this.field8300 ? new class363(this, arg4, arg3, arg1) : new class610(this, arg4, arg3, arg1, arg2));
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLen;)V")
    public final void method3392(boolean arg0, class266 arg1) {
        ++field8151;
        if (!arg0) {
            this.field8188 = null;
        }
        OpenGL.glLoadMatrixf(arg1.method1746((byte) 107), 0);
    }

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "(B)V")
    public final void method3393(byte arg0) {
        if (~this.field8283 != -5) {
            this.method3401(6406);
            this.method3402(true, false);
            this.method3330(false, (byte) 36);
            this.method3375(true, false);
            this.method3331(false, -25107);
            this.method3408(-2, (byte) 74);
            this.method3348(1, (byte) 52);
            this.field8283 = 4;
        }
        ++field8053;
        if (arg0 != 47) {
            this.field8294 = -23;
        }
    }

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "(II)I")
    public final int method3394(int arg0, int arg1) {
        ++field8020;
        if (arg0 != -5) {
            this.field8268 = 0.8977216F;
        }
        if (arg1 == 1) {
            return 7681;
        } else if (arg1 != 0) {
            if (~arg1 == -3) {
                return 34165;
            } else if (~arg1 == -4) {
                return 260;
            } else if (~arg1 == -5) {
                return 34023;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            return 8448;
        }
    }

    @OriginalMember(owner = "client!gi", name = "JA", descriptor = "(IIII)V")
    public final void method1314(int arg0, int arg1, int arg2, int arg3) {
        ++field8093;
        if (!this.field8262) {
            throw new RuntimeException("");
        } else {
            this.field8315 = arg0;
            this.field8244 = arg1;
            this.field8232 = arg3;
            this.field8255 = arg2;
            this.field8195.field5052.method2905(23697);
            this.method3361((byte) 106);
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1275(Canvas arg0) {
        ++field8090;
        long var2 = 0L;
        if (arg0 != null && this.field8163 != arg0) {
            if (this.field8101.containsKey(arg0)) {
                Long var4 = (Long) this.field8101.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field7997;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field8005.surfaceResized(var2);
            if (this.field8082 == arg0) {
                this.method3359((byte) 124);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lhp;)V")
    public final void method1356(class274 arg0) {
        ++field8126;
        this.field8187.method3157(0, arg0, this);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Lct;I)V")
    public final void method3395(class125 arg0, int arg1) {
        ++field8182;
        if (!this.field8233) {
            if (~this.field8212 > -1 || this.field8210[this.field8212] != arg0) {
                throw new RuntimeException();
            }
            this.field8210[this.field8212--] = null;
            arg0.method443((byte) -118);
            if (this.field8212 >= 0) {
                this.field8207 = this.field8205 = this.field8210[this.field8212];
                this.field8207.method445(-14263);
            } else {
                this.field8207 = this.field8205 = null;
            }
        } else {
            this.method3410((byte) 62, arg0);
            this.method3388(arg0, (byte) 93);
        }
        if (arg1 != 14032) {
            this.field8296 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)V")
    public final void method3396(byte arg0, int arg1) {
        ++field8065;
        int var3 = 47 / ((73 - arg0) / 33);
        if (arg1 == 1) {
            this.method3389(false, 7681, 7681);
        } else if (arg1 == 0) {
            this.method3389(false, 8448, 8448);
        } else {
            if (~arg1 != -3) {
                if (arg1 == 3) {
                    this.method3389(false, 260, 8448);
                    return;
                }
                if (~arg1 == -5) {
                    this.method3389(false, 34023, 34023);
                    return;
                }
            } else {
                this.method3389(false, 34165, 7681);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "(B)V")
    private final void method3397(byte arg0) {
        if (arg0 != 12) {
            this.field8341 = null;
        }
        ++field8087;
        if (this.field8230 && this.field8262 | ~this.field8286 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "()Z")
    public final boolean method1285() {
        ++field8060;
        return false;
    }

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "()Z")
    public final boolean method1353() {
        ++field7995;
        return true;
    }

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "()I")
    public final int method1313() {
        ++field8111;
        return 4;
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V")
    public final void method1297(int arg0) {
        ++field8168;
        if (arg0 >= 128 && arg0 <= 1024) {
            this.field8190 = arg0;
            this.field8189.method1063(64);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V")
    public final void method1309(boolean arg0) {
        this.field8250 = arg0;
        ++field8122;
        this.method3390(false);
    }

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "(II)V")
    public final void method3398(int arg0, int arg1) {
        if (arg0 < -30) {
            if (~this.field8333 != ~arg1) {
                OpenGL.glActiveTexture(33984 - -arg1);
                this.field8333 = arg1;
            }
            ++field8127;
        }
    }

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "(B)V")
    private final void method3399(byte arg0) {
        ++field8148;
        if (arg0 > 73) {
            this.field8321 = new class266();
            this.field8314 = new class266();
            this.field8337 = new class418[this.field8258];
            this.field8296 = new class629(this, 3553, 6408, 1, 1);
            new class629(this, 3553, 6408, 1, 1);
            new class629(this, 3553, 6408, 1, 1);
            this.field8263 = new class624(this);
            this.field8311 = new class624(this);
            this.field8292 = new class624(this);
            this.field8304 = new class624(this);
            this.field8331 = new class624(this);
            this.field8231 = new class624(this);
            this.field8223 = new class624(this);
            this.field8318 = new class624(this);
            this.field8298 = new class624(this);
            this.field8289 = new class624(this);
            if (this.field8306) {
                this.field8341 = new class45(this);
                new class45(this);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIZI[B)Lqd;")
    public final class381 method3400(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        if (arg1 >= -65) {
            return null;
        } else {
            ++field8094;
            return (class381) (!this.field8295 || arg2 && !this.field8300 ? new class405(this, arg0, arg4, arg3) : new class326(this, arg0, arg4, arg3, arg2));
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "()V")
    public final void method1265() {
        ++field8010;
        this.method3331(true, -25107);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "(I)V")
    private final void method3401(int arg0) {
        if (this.field8294 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field8184 < -1 && ~this.field8027 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field8184, (double) this.field8027, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field8283 &= -25;
            this.field8294 = 1;
        }
        ++field8050;
        if (arg0 != 6406) {
            this.method3408(110, (byte) -87);
        }
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(IIIIII)V")
    public final void method1321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8181;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method3353(16384);
        this.method3348(arg5, (byte) 113);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field8242) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field8242) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
    public final void method1330(int arg0) {
        ++field8048;
        this.method3354((byte) -114);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(ZZ)V")
    public final void method3402(boolean arg0, boolean arg1) {
        if (arg0) {
            ++field8107;
            if (!this.field8230 == arg1) {
                this.field8230 = arg1;
                this.method3397((byte) 12);
                this.field8283 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lsv;)V")
    public final void method1277(class567 arg0) {
        this.field8293 = (class146) arg0;
        ++field8025;
    }

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "(F)V")
    public final void method1295(float arg0) {
        ++field8143;
        if (this.field8245 != arg0) {
            this.field8245 = arg0;
            this.method3356(6694);
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(Z)V")
    public final void method1364(boolean arg0) {
        ++field8116;
    }

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "(II)V")
    public final synchronized void method3403(int arg0, int arg1) {
        ++field8117;
        if (arg0 != 1) {
            method3339((byte[]) null, true);
        }
        class10 var3 = new class10(arg1);
        this.field8219.method463(var3, arg0 + -123);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(FIF)V")
    public final void method3404(float arg0, int arg1, float arg2) {
        ++field8033;
        this.field8282 = arg2;
        this.field8225 = arg0;
        if (!this.field8262) {
            this.method3361((byte) -99);
        }
        if (arg1 != -23549) {
            this.method1338();
        }
    }

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "(B)V")
    private final void method3405(byte arg0) {
        ++field8141;
        if (arg0 < -23) {
            this.field8342 = (float) (-this.field8226 + this.field8303);
            this.field8270 = (float) (this.field8236 - this.field8226);
            this.field8326 = (float) (this.field8284 - this.field8299);
            this.field8268 = (float) (-this.field8299 + this.field8275);
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "()I")
    public final int method1301() {
        ++field8008;
        return this.field8334;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLqd;)V")
    public final void method3406(boolean arg0, class381 arg1) {
        if (!arg0) {
            this.field8346 = null;
        }
        ++field8078;
        if (this.field8320 != arg1) {
            if (this.field8295) {
                OpenGL.glBindBufferARB(34962, arg1.method2017(18322));
            }
            this.field8320 = arg1;
        }
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(IIII)V")
    public final void method3407(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, 34176 - -arg0, arg3);
        ++field7996;
        if (arg2 >= -115) {
            this.field8199 = null;
        }
        OpenGL.glTexEnvi(8960, 34192 - -arg0, arg1);
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(IB)V")
    public final void method3408(int arg0, byte arg1) {
        if (arg1 <= 26) {
            this.method3371(true);
        }
        ++field8009;
        this.method3338((byte) -1, arg0, true);
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(II)I")
    public final int method1357(int arg0, int arg1) {
        ++field8092;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "()Z")
    public final boolean method1273() {
        ++field8098;
        return true;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(IIII)V")
    public final void method1365(int arg0, int arg1, int arg2, int arg3) {
        this.field8243 = arg2;
        this.field8226 = arg1;
        ++field8179;
        this.field8299 = arg0;
        this.field8330 = arg3;
        this.method3357(7);
        this.method3405((byte) -65);
        if (this.field8294 != 3) {
            if (~this.field8294 == -3) {
                this.method3376((byte) 59);
                return;
            }
        } else {
            this.method3387((byte) 127);
        }
    }

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "(I)Lnm;")
    public final class403 method3409(int arg0) {
        ++field8112;
        if (arg0 != 0) {
            this.method1260((Canvas) null);
        }
        return this.field8293 != null ? this.field8293.method11(123) : null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([Lr;Lm;[Lkn;I)V")
    public final void method1360(class157[] arg0, class163 arg1, class631[] arg2, int arg3) {
        for (int var5 = 0; ~arg0.length < ~var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method154(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
        ++field8130;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLct;)V")
    public final void method3410(byte arg0, class125 arg1) {
        ++field8070;
        if (this.field8206 >= 0 && this.field8211[this.field8206] == arg1) {
            if (arg0 != 62) {
                this.field8297 = true;
            }
            this.field8211[this.field8206--] = null;
            arg1.method438(true);
            if (~this.field8206 <= -1) {
                this.field8207 = this.field8211[this.field8206];
                this.field8207.method451((byte) -119);
            } else {
                this.field8207 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(ZZ)V")
    public final void method3411(boolean arg0, boolean arg1) {
        ++field8132;
        if (!this.field8291 == arg1) {
            this.field8291 = arg1;
            this.method3369(-1550);
        }
        if (arg0) {
            this.field8284 = -116;
        }
    }
}
