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

@OriginalClass("client!no")
public class class658 extends class651 {

    @OriginalMember(owner = "client!no", name = "vc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field9082 = new Hashtable();

    @OriginalMember(owner = "client!no", name = "ee", descriptor = "I")
    public int field9169 = 128;

    @OriginalMember(owner = "client!no", name = "Vd", descriptor = "Lpr;")
    private class416 field9160 = new class416();

    @OriginalMember(owner = "client!no", name = "qe", descriptor = "Lhda;")
    private class701 field9181 = new class701();

    @OriginalMember(owner = "client!no", name = "re", descriptor = "Lhda;")
    public class701 field9182 = new class701();

    @OriginalMember(owner = "client!no", name = "se", descriptor = "I")
    public int field9183 = 8;

    @OriginalMember(owner = "client!no", name = "we", descriptor = "I")
    public int field9187 = 3;

    @OriginalMember(owner = "client!no", name = "te", descriptor = "Z")
    private boolean field9184 = false;

    @OriginalMember(owner = "client!no", name = "ye", descriptor = "Lgj;")
    private class593 field9189 = new class593();

    @OriginalMember(owner = "client!no", name = "Be", descriptor = "I")
    private int field9192 = -1;

    @OriginalMember(owner = "client!no", name = "ze", descriptor = "I")
    private int field9190 = -1;

    @OriginalMember(owner = "client!no", name = "Ee", descriptor = "[Lfb;")
    private class632[] field9195 = new class632[4];

    @OriginalMember(owner = "client!no", name = "Fe", descriptor = "I")
    private int field9196 = -1;

    @OriginalMember(owner = "client!no", name = "Je", descriptor = "[Lfb;")
    private class632[] field9200 = new class632[4];

    @OriginalMember(owner = "client!no", name = "He", descriptor = "[Lfb;")
    private class632[] field9198 = new class632[4];

    @OriginalMember(owner = "client!no", name = "Ce", descriptor = "Lrda;")
    private class620 field9193 = new class620();

    @OriginalMember(owner = "client!no", name = "Ke", descriptor = "Ljw;")
    private class520 field9201 = new class520(16);

    @OriginalMember(owner = "client!no", name = "Pe", descriptor = "Lgj;")
    private class593 field9206 = new class593();

    @OriginalMember(owner = "client!no", name = "Qe", descriptor = "Lgj;")
    private class593 field9207 = new class593();

    @OriginalMember(owner = "client!no", name = "Re", descriptor = "Lgj;")
    private class593 field9208 = new class593();

    @OriginalMember(owner = "client!no", name = "Se", descriptor = "Lgj;")
    private class593 field9209 = new class593();

    @OriginalMember(owner = "client!no", name = "Te", descriptor = "Lgj;")
    private class593 field9210 = new class593();

    @OriginalMember(owner = "client!no", name = "Ue", descriptor = "Lgj;")
    private class593 field9211 = new class593();

    @OriginalMember(owner = "client!no", name = "Ve", descriptor = "Lgj;")
    private class593 field9212 = new class593();

    @OriginalMember(owner = "client!no", name = "Ye", descriptor = "I")
    public int field9215 = 0;

    @OriginalMember(owner = "client!no", name = "We", descriptor = "F")
    public float field9213 = -1.0F;

    @OriginalMember(owner = "client!no", name = "Xe", descriptor = "F")
    public float field9214 = 1.0F;

    @OriginalMember(owner = "client!no", name = "jf", descriptor = "I")
    private int field9225 = 0;

    @OriginalMember(owner = "client!no", name = "wf", descriptor = "[F")
    private float[] field9238 = new float[4];

    @OriginalMember(owner = "client!no", name = "Ff", descriptor = "[F")
    private float[] field9247 = new float[4];

    @OriginalMember(owner = "client!no", name = "af", descriptor = "[F")
    private float[] field9217 = new float[16];

    @OriginalMember(owner = "client!no", name = "Df", descriptor = "F")
    public float field9245 = 3584.0F;

    @OriginalMember(owner = "client!no", name = "rf", descriptor = "I")
    public int field9233 = 0;

    @OriginalMember(owner = "client!no", name = "df", descriptor = "I")
    private int field9220 = -1;

    @OriginalMember(owner = "client!no", name = "Vf", descriptor = "Z")
    private boolean field9263 = true;

    @OriginalMember(owner = "client!no", name = "Ze", descriptor = "[F")
    public float[] field9216 = new float[4];

    @OriginalMember(owner = "client!no", name = "tf", descriptor = "F")
    public float field9235 = -1.0F;

    @OriginalMember(owner = "client!no", name = "Xf", descriptor = "F")
    public float field9265 = 3584.0F;

    @OriginalMember(owner = "client!no", name = "bg", descriptor = "I")
    private int field9269 = 0;

    @OriginalMember(owner = "client!no", name = "xf", descriptor = "F")
    public float field9239 = 1.0F;

    @OriginalMember(owner = "client!no", name = "Gg", descriptor = "I")
    public int field9300 = -1;

    @OriginalMember(owner = "client!no", name = "Rf", descriptor = "F")
    private float field9259 = 0.0F;

    @OriginalMember(owner = "client!no", name = "mf", descriptor = "F")
    private float field9228 = -1.0F;

    @OriginalMember(owner = "client!no", name = "Sf", descriptor = "I")
    private int field9260 = 0;

    @OriginalMember(owner = "client!no", name = "Mg", descriptor = "I")
    public int field9306 = 512;

    @OriginalMember(owner = "client!no", name = "Pf", descriptor = "F")
    private float field9257 = 1.0F;

    @OriginalMember(owner = "client!no", name = "Of", descriptor = "I")
    private int field9256 = 0;

    @OriginalMember(owner = "client!no", name = "Vg", descriptor = "I")
    public int field9315 = 0;

    @OriginalMember(owner = "client!no", name = "Cg", descriptor = "I")
    public int field9296 = -1;

    @OriginalMember(owner = "client!no", name = "uf", descriptor = "F")
    private float field9236 = 1.0F;

    @OriginalMember(owner = "client!no", name = "of", descriptor = "I")
    private int field9230 = 8448;

    @OriginalMember(owner = "client!no", name = "Hf", descriptor = "F")
    private float field9249 = -1.0F;

    @OriginalMember(owner = "client!no", name = "Wg", descriptor = "I")
    private int field9316 = 0;

    @OriginalMember(owner = "client!no", name = "lg", descriptor = "F")
    private float field9279 = 3000.0F;

    @OriginalMember(owner = "client!no", name = "Bg", descriptor = "I")
    public int field9295 = 512;

    @OriginalMember(owner = "client!no", name = "Zg", descriptor = "[Lpv;")
    private class65[] field9319 = new class65[class685.field9638];

    @OriginalMember(owner = "client!no", name = "Yg", descriptor = "I")
    public int field9318 = 0;

    @OriginalMember(owner = "client!no", name = "ug", descriptor = "[F")
    private float[] field9288 = new float[4];

    @OriginalMember(owner = "client!no", name = "eh", descriptor = "F")
    public float field9324 = 1.0F;

    @OriginalMember(owner = "client!no", name = "Jg", descriptor = "I")
    public int field9303 = 3584;

    @OriginalMember(owner = "client!no", name = "gh", descriptor = "I")
    public int field9326 = 50;

    @OriginalMember(owner = "client!no", name = "jh", descriptor = "I")
    private int field9329 = -1;

    @OriginalMember(owner = "client!no", name = "kh", descriptor = "I")
    private int field9330 = 0;

    @OriginalMember(owner = "client!no", name = "nh", descriptor = "I")
    private int field9333 = 8448;

    @OriginalMember(owner = "client!no", name = "mh", descriptor = "I")
    public int field9332 = -1;

    @OriginalMember(owner = "client!no", name = "kg", descriptor = "Lps;")
    public class85 field9278 = new class85(8192);

    @OriginalMember(owner = "client!no", name = "rh", descriptor = "[I")
    public int[] field9337 = new int[1];

    @OriginalMember(owner = "client!no", name = "oh", descriptor = "[I")
    public int[] field9334 = new int[1];

    @OriginalMember(owner = "client!no", name = "qh", descriptor = "[B")
    public byte[] field9336 = new byte[16384];

    @OriginalMember(owner = "client!no", name = "th", descriptor = "[I")
    public int[] field9339 = new int[1];

    @OriginalMember(owner = "client!no", name = "le", descriptor = "I")
    public int field9176;

    @OriginalMember(owner = "client!no", name = "db", descriptor = "Ljava/awt/Canvas;")
    private Canvas field9012;

    @OriginalMember(owner = "client!no", name = "rb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field9026;

    @OriginalMember(owner = "client!no", name = "ud", descriptor = "Ljaggl/OpenGL;")
    public OpenGL field9133;

    @OriginalMember(owner = "client!no", name = "nb", descriptor = "J")
    private long field9022;

    @OriginalMember(owner = "client!no", name = "x", descriptor = "J")
    private long field8980;

    @OriginalMember(owner = "client!no", name = "eg", descriptor = "Z")
    public boolean field9272;

    @OriginalMember(owner = "client!no", name = "Bf", descriptor = "I")
    public int field9243;

    @OriginalMember(owner = "client!no", name = "tg", descriptor = "Ljava/lang/String;")
    private String field9287;

    @OriginalMember(owner = "client!no", name = "Ig", descriptor = "Z")
    public boolean field9302;

    @OriginalMember(owner = "client!no", name = "Ng", descriptor = "Z")
    public boolean field9307;

    @OriginalMember(owner = "client!no", name = "ch", descriptor = "Z")
    private boolean field9322;

    @OriginalMember(owner = "client!no", name = "Qg", descriptor = "Z")
    public boolean field9310;

    @OriginalMember(owner = "client!no", name = "Ug", descriptor = "Z")
    public boolean field9314;

    @OriginalMember(owner = "client!no", name = "nf", descriptor = "Z")
    private boolean field9229;

    @OriginalMember(owner = "client!no", name = "Wf", descriptor = "Ljava/lang/String;")
    private String field9264;

    @OriginalMember(owner = "client!no", name = "qg", descriptor = "Z")
    public boolean field9284;

    @OriginalMember(owner = "client!no", name = "vg", descriptor = "Z")
    private boolean field9289;

    @OriginalMember(owner = "client!no", name = "Zd", descriptor = "Lmm;")
    private class258 field9164;

    @OriginalMember(owner = "client!no", name = "xe", descriptor = "Llaa;")
    public class109 field9188;

    @OriginalMember(owner = "client!no", name = "fe", descriptor = "Luea;")
    private class292 field9170;

    @OriginalMember(owner = "client!no", name = "ie", descriptor = "Lmc;")
    private class123 field9173;

    @OriginalMember(owner = "client!no", name = "ne", descriptor = "Lmh;")
    private class590 field9178;

    @OriginalMember(owner = "client!no", name = "Ad", descriptor = "[I")
    public static int[] field9139 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!no", name = "bf", descriptor = "F")
    private float field9218;

    @OriginalMember(owner = "client!no", name = "zf", descriptor = "F")
    private float field9241;

    @OriginalMember(owner = "client!no", name = "Cf", descriptor = "F")
    public float field9244;

    @OriginalMember(owner = "client!no", name = "Kf", descriptor = "F")
    private float field9252;

    @OriginalMember(owner = "client!no", name = "Tf", descriptor = "F")
    public float field9261;

    @OriginalMember(owner = "client!no", name = "xg", descriptor = "F")
    private float field9291;

    @OriginalMember(owner = "client!no", name = "zg", descriptor = "F")
    public float field9293;

    @OriginalMember(owner = "client!no", name = "Sg", descriptor = "F")
    public float field9312;

    @OriginalMember(owner = "client!no", name = "dh", descriptor = "F")
    public float field9323;

    @OriginalMember(owner = "client!no", name = "hh", descriptor = "F")
    public float field9327;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "I")
    public static int field8975;

    @OriginalMember(owner = "client!no", name = "t", descriptor = "I")
    public static int field8976;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "I")
    public static int field8977;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "I")
    public static int field8978;

    @OriginalMember(owner = "client!no", name = "w", descriptor = "I")
    public static int field8979;

    @OriginalMember(owner = "client!no", name = "y", descriptor = "I")
    public static int field8981;

    @OriginalMember(owner = "client!no", name = "z", descriptor = "I")
    public static int field8982;

    @OriginalMember(owner = "client!no", name = "A", descriptor = "I")
    public static int field8983;

    @OriginalMember(owner = "client!no", name = "B", descriptor = "I")
    public static int field8984;

    @OriginalMember(owner = "client!no", name = "C", descriptor = "I")
    public static int field8985;

    @OriginalMember(owner = "client!no", name = "D", descriptor = "I")
    public static int field8986;

    @OriginalMember(owner = "client!no", name = "E", descriptor = "I")
    public static int field8987;

    @OriginalMember(owner = "client!no", name = "F", descriptor = "I")
    public static int field8988;

    @OriginalMember(owner = "client!no", name = "G", descriptor = "I")
    public static int field8989;

    @OriginalMember(owner = "client!no", name = "H", descriptor = "I")
    public static int field8990;

    @OriginalMember(owner = "client!no", name = "I", descriptor = "I")
    public static int field8991;

    @OriginalMember(owner = "client!no", name = "J", descriptor = "I")
    public static int field8992;

    @OriginalMember(owner = "client!no", name = "K", descriptor = "I")
    public static int field8993;

    @OriginalMember(owner = "client!no", name = "L", descriptor = "I")
    public static int field8994;

    @OriginalMember(owner = "client!no", name = "M", descriptor = "I")
    public static int field8995;

    @OriginalMember(owner = "client!no", name = "N", descriptor = "I")
    public static int field8996;

    @OriginalMember(owner = "client!no", name = "O", descriptor = "I")
    public static int field8997;

    @OriginalMember(owner = "client!no", name = "P", descriptor = "I")
    public static int field8998;

    @OriginalMember(owner = "client!no", name = "Q", descriptor = "I")
    public static int field8999;

    @OriginalMember(owner = "client!no", name = "R", descriptor = "I")
    private int field9000;

    @OriginalMember(owner = "client!no", name = "S", descriptor = "I")
    public static int field9001;

    @OriginalMember(owner = "client!no", name = "T", descriptor = "I")
    public static int field9002;

    @OriginalMember(owner = "client!no", name = "U", descriptor = "I")
    public static int field9003;

    @OriginalMember(owner = "client!no", name = "V", descriptor = "I")
    public static int field9004;

    @OriginalMember(owner = "client!no", name = "W", descriptor = "I")
    public static int field9005;

    @OriginalMember(owner = "client!no", name = "X", descriptor = "I")
    public static int field9006;

    @OriginalMember(owner = "client!no", name = "Y", descriptor = "I")
    public static int field9007;

    @OriginalMember(owner = "client!no", name = "Z", descriptor = "I")
    public static int field9008;

    @OriginalMember(owner = "client!no", name = "ab", descriptor = "I")
    public static int field9009;

    @OriginalMember(owner = "client!no", name = "bb", descriptor = "I")
    public static int field9010;

    @OriginalMember(owner = "client!no", name = "cb", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!no", name = "eb", descriptor = "I")
    public static int field9013;

    @OriginalMember(owner = "client!no", name = "fb", descriptor = "I")
    public static int field9014;

    @OriginalMember(owner = "client!no", name = "gb", descriptor = "I")
    public static int field9015;

    @OriginalMember(owner = "client!no", name = "hb", descriptor = "I")
    public static int field9016;

    @OriginalMember(owner = "client!no", name = "ib", descriptor = "I")
    public static int field9017;

    @OriginalMember(owner = "client!no", name = "jb", descriptor = "I")
    public static int field9018;

    @OriginalMember(owner = "client!no", name = "kb", descriptor = "I")
    private int field9019;

    @OriginalMember(owner = "client!no", name = "lb", descriptor = "I")
    public static int field9020;

    @OriginalMember(owner = "client!no", name = "mb", descriptor = "I")
    public static int field9021;

    @OriginalMember(owner = "client!no", name = "ob", descriptor = "I")
    public static int field9023;

    @OriginalMember(owner = "client!no", name = "pb", descriptor = "I")
    public static int field9024;

    @OriginalMember(owner = "client!no", name = "qb", descriptor = "I")
    public static int field9025;

    @OriginalMember(owner = "client!no", name = "sb", descriptor = "I")
    public static int field9027;

    @OriginalMember(owner = "client!no", name = "tb", descriptor = "I")
    public static int field9028;

    @OriginalMember(owner = "client!no", name = "ub", descriptor = "I")
    public static int field9029;

    @OriginalMember(owner = "client!no", name = "vb", descriptor = "I")
    public static int field9030;

    @OriginalMember(owner = "client!no", name = "wb", descriptor = "I")
    public static int field9031;

    @OriginalMember(owner = "client!no", name = "xb", descriptor = "I")
    public static int field9032;

    @OriginalMember(owner = "client!no", name = "yb", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!no", name = "zb", descriptor = "I")
    public static int field9034;

    @OriginalMember(owner = "client!no", name = "Ab", descriptor = "I")
    public static int field9035;

    @OriginalMember(owner = "client!no", name = "Bb", descriptor = "I")
    public static int field9036;

    @OriginalMember(owner = "client!no", name = "Cb", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!no", name = "Db", descriptor = "I")
    public static int field9038;

    @OriginalMember(owner = "client!no", name = "Eb", descriptor = "I")
    public static int field9039;

    @OriginalMember(owner = "client!no", name = "Fb", descriptor = "I")
    public static int field9040;

    @OriginalMember(owner = "client!no", name = "Gb", descriptor = "I")
    public static int field9041;

    @OriginalMember(owner = "client!no", name = "Hb", descriptor = "I")
    public static int field9042;

    @OriginalMember(owner = "client!no", name = "Ib", descriptor = "I")
    public static int field9043;

    @OriginalMember(owner = "client!no", name = "Jb", descriptor = "I")
    public static int field9044;

    @OriginalMember(owner = "client!no", name = "Kb", descriptor = "I")
    public static int field9045;

    @OriginalMember(owner = "client!no", name = "Lb", descriptor = "I")
    public static int field9046;

    @OriginalMember(owner = "client!no", name = "Mb", descriptor = "I")
    public static int field9047;

    @OriginalMember(owner = "client!no", name = "Nb", descriptor = "I")
    public static int field9048;

    @OriginalMember(owner = "client!no", name = "Ob", descriptor = "I")
    public static int field9049;

    @OriginalMember(owner = "client!no", name = "Pb", descriptor = "I")
    public static int field9050;

    @OriginalMember(owner = "client!no", name = "Qb", descriptor = "I")
    public int field9051;

    @OriginalMember(owner = "client!no", name = "Rb", descriptor = "I")
    public static int field9052;

    @OriginalMember(owner = "client!no", name = "Sb", descriptor = "I")
    public static int field9053;

    @OriginalMember(owner = "client!no", name = "Tb", descriptor = "I")
    public static int field9054;

    @OriginalMember(owner = "client!no", name = "Ub", descriptor = "I")
    public static int field9055;

    @OriginalMember(owner = "client!no", name = "Vb", descriptor = "I")
    public static int field9056;

    @OriginalMember(owner = "client!no", name = "Wb", descriptor = "I")
    public static int field9057;

    @OriginalMember(owner = "client!no", name = "Xb", descriptor = "I")
    public static int field9058;

    @OriginalMember(owner = "client!no", name = "Yb", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!no", name = "Zb", descriptor = "I")
    public static int field9060;

    @OriginalMember(owner = "client!no", name = "ac", descriptor = "I")
    public static int field9061;

    @OriginalMember(owner = "client!no", name = "bc", descriptor = "I")
    public static int field9062;

    @OriginalMember(owner = "client!no", name = "cc", descriptor = "I")
    public static int field9063;

    @OriginalMember(owner = "client!no", name = "dc", descriptor = "I")
    public static int field9064;

    @OriginalMember(owner = "client!no", name = "ec", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!no", name = "fc", descriptor = "I")
    public static int field9066;

    @OriginalMember(owner = "client!no", name = "gc", descriptor = "I")
    public static int field9067;

    @OriginalMember(owner = "client!no", name = "hc", descriptor = "I")
    public static int field9068;

    @OriginalMember(owner = "client!no", name = "ic", descriptor = "I")
    public static int field9069;

    @OriginalMember(owner = "client!no", name = "jc", descriptor = "I")
    public static int field9070;

    @OriginalMember(owner = "client!no", name = "kc", descriptor = "I")
    public int field9071;

    @OriginalMember(owner = "client!no", name = "lc", descriptor = "I")
    public static int field9072;

    @OriginalMember(owner = "client!no", name = "mc", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!no", name = "nc", descriptor = "I")
    public static int field9074;

    @OriginalMember(owner = "client!no", name = "oc", descriptor = "I")
    public static int field9075;

    @OriginalMember(owner = "client!no", name = "pc", descriptor = "I")
    public static int field9076;

    @OriginalMember(owner = "client!no", name = "qc", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!no", name = "rc", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!no", name = "sc", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!no", name = "tc", descriptor = "I")
    public static int field9080;

    @OriginalMember(owner = "client!no", name = "uc", descriptor = "I")
    public static int field9081;

    @OriginalMember(owner = "client!no", name = "wc", descriptor = "I")
    public static int field9083;

    @OriginalMember(owner = "client!no", name = "xc", descriptor = "I")
    public static int field9084;

    @OriginalMember(owner = "client!no", name = "yc", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!no", name = "zc", descriptor = "I")
    public static int field9086;

    @OriginalMember(owner = "client!no", name = "Ac", descriptor = "I")
    public static int field9087;

    @OriginalMember(owner = "client!no", name = "Bc", descriptor = "I")
    public static int field9088;

    @OriginalMember(owner = "client!no", name = "Cc", descriptor = "I")
    public static int field9089;

    @OriginalMember(owner = "client!no", name = "Dc", descriptor = "I")
    public static int field9090;

    @OriginalMember(owner = "client!no", name = "Ec", descriptor = "I")
    public static int field9091;

    @OriginalMember(owner = "client!no", name = "Fc", descriptor = "I")
    public static int field9092;

    @OriginalMember(owner = "client!no", name = "Gc", descriptor = "I")
    public static int field9093;

    @OriginalMember(owner = "client!no", name = "Hc", descriptor = "I")
    public static int field9094;

    @OriginalMember(owner = "client!no", name = "Ic", descriptor = "I")
    public static int field9095;

    @OriginalMember(owner = "client!no", name = "Jc", descriptor = "I")
    public static int field9096;

    @OriginalMember(owner = "client!no", name = "Kc", descriptor = "I")
    public static int field9097;

    @OriginalMember(owner = "client!no", name = "Lc", descriptor = "I")
    public static int field9098;

    @OriginalMember(owner = "client!no", name = "Mc", descriptor = "I")
    public static int field9099;

    @OriginalMember(owner = "client!no", name = "Nc", descriptor = "I")
    public static int field9100;

    @OriginalMember(owner = "client!no", name = "Oc", descriptor = "I")
    public static int field9101;

    @OriginalMember(owner = "client!no", name = "Pc", descriptor = "I")
    public static int field9102;

    @OriginalMember(owner = "client!no", name = "Qc", descriptor = "I")
    public static int field9103;

    @OriginalMember(owner = "client!no", name = "Rc", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!no", name = "Sc", descriptor = "I")
    public static int field9105;

    @OriginalMember(owner = "client!no", name = "Tc", descriptor = "I")
    public static int field9106;

    @OriginalMember(owner = "client!no", name = "Uc", descriptor = "I")
    public static int field9107;

    @OriginalMember(owner = "client!no", name = "Vc", descriptor = "I")
    public static int field9108;

    @OriginalMember(owner = "client!no", name = "Wc", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!no", name = "Xc", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!no", name = "Yc", descriptor = "I")
    public static int field9111;

    @OriginalMember(owner = "client!no", name = "Zc", descriptor = "I")
    public static int field9112;

    @OriginalMember(owner = "client!no", name = "ad", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!no", name = "bd", descriptor = "I")
    public static int field9114;

    @OriginalMember(owner = "client!no", name = "cd", descriptor = "I")
    public static int field9115;

    @OriginalMember(owner = "client!no", name = "dd", descriptor = "I")
    public static int field9116;

    @OriginalMember(owner = "client!no", name = "ed", descriptor = "I")
    public static int field9117;

    @OriginalMember(owner = "client!no", name = "fd", descriptor = "I")
    public static int field9118;

    @OriginalMember(owner = "client!no", name = "gd", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!no", name = "hd", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!no", name = "id", descriptor = "I")
    public static int field9121;

    @OriginalMember(owner = "client!no", name = "jd", descriptor = "I")
    public static int field9122;

    @OriginalMember(owner = "client!no", name = "kd", descriptor = "I")
    public static int field9123;

    @OriginalMember(owner = "client!no", name = "ld", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!no", name = "md", descriptor = "I")
    public static int field9125;

    @OriginalMember(owner = "client!no", name = "nd", descriptor = "I")
    public static int field9126;

    @OriginalMember(owner = "client!no", name = "od", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!no", name = "pd", descriptor = "I")
    public static int field9128;

    @OriginalMember(owner = "client!no", name = "qd", descriptor = "I")
    public static int field9129;

    @OriginalMember(owner = "client!no", name = "rd", descriptor = "I")
    public static int field9130;

    @OriginalMember(owner = "client!no", name = "sd", descriptor = "I")
    public static int field9131;

    @OriginalMember(owner = "client!no", name = "td", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!no", name = "vd", descriptor = "I")
    public static int field9134;

    @OriginalMember(owner = "client!no", name = "wd", descriptor = "I")
    public static int field9135;

    @OriginalMember(owner = "client!no", name = "xd", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!no", name = "yd", descriptor = "I")
    public static int field9137;

    @OriginalMember(owner = "client!no", name = "zd", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!no", name = "Bd", descriptor = "I")
    public static int field9140;

    @OriginalMember(owner = "client!no", name = "Cd", descriptor = "I")
    public static int field9141;

    @OriginalMember(owner = "client!no", name = "Dd", descriptor = "I")
    public static int field9142;

    @OriginalMember(owner = "client!no", name = "Ed", descriptor = "I")
    public static int field9143;

    @OriginalMember(owner = "client!no", name = "Fd", descriptor = "I")
    public static int field9144;

    @OriginalMember(owner = "client!no", name = "Gd", descriptor = "I")
    public static int field9145;

    @OriginalMember(owner = "client!no", name = "Hd", descriptor = "I")
    public static int field9146;

    @OriginalMember(owner = "client!no", name = "Id", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!no", name = "Jd", descriptor = "I")
    public static int field9148;

    @OriginalMember(owner = "client!no", name = "Kd", descriptor = "I")
    public static int field9149;

    @OriginalMember(owner = "client!no", name = "Ld", descriptor = "I")
    public static int field9150;

    @OriginalMember(owner = "client!no", name = "Md", descriptor = "I")
    public static int field9151;

    @OriginalMember(owner = "client!no", name = "Nd", descriptor = "I")
    public static int field9152;

    @OriginalMember(owner = "client!no", name = "Od", descriptor = "I")
    public static int field9153;

    @OriginalMember(owner = "client!no", name = "Pd", descriptor = "I")
    public static int field9154;

    @OriginalMember(owner = "client!no", name = "Rd", descriptor = "I")
    public static int field9156;

    @OriginalMember(owner = "client!no", name = "Sd", descriptor = "I")
    public static int field9157;

    @OriginalMember(owner = "client!no", name = "Td", descriptor = "I")
    public static int field9158;

    @OriginalMember(owner = "client!no", name = "Ud", descriptor = "I")
    public static int field9159;

    @OriginalMember(owner = "client!no", name = "Wd", descriptor = "I")
    public static int field9161;

    @OriginalMember(owner = "client!no", name = "Xd", descriptor = "I")
    public static int field9162;

    @OriginalMember(owner = "client!no", name = "Yd", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!no", name = "ae", descriptor = "I")
    public static int field9165;

    @OriginalMember(owner = "client!no", name = "be", descriptor = "I")
    public static int field9166;

    @OriginalMember(owner = "client!no", name = "ce", descriptor = "I")
    public static int field9167;

    @OriginalMember(owner = "client!no", name = "de", descriptor = "I")
    public static int field9168;

    @OriginalMember(owner = "client!no", name = "ge", descriptor = "I")
    public static int field9171;

    @OriginalMember(owner = "client!no", name = "he", descriptor = "I")
    public static int field9172;

    @OriginalMember(owner = "client!no", name = "je", descriptor = "I")
    public static int field9174;

    @OriginalMember(owner = "client!no", name = "ke", descriptor = "I")
    public static int field9175;

    @OriginalMember(owner = "client!no", name = "me", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!no", name = "oe", descriptor = "I")
    public static int field9179;

    @OriginalMember(owner = "client!no", name = "pe", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!no", name = "ve", descriptor = "I")
    public int field9186;

    @OriginalMember(owner = "client!no", name = "Le", descriptor = "I")
    public int field9202;

    @OriginalMember(owner = "client!no", name = "Me", descriptor = "I")
    public int field9203;

    @OriginalMember(owner = "client!no", name = "Ne", descriptor = "I")
    private int field9204;

    @OriginalMember(owner = "client!no", name = "Oe", descriptor = "I")
    private int field9205;

    @OriginalMember(owner = "client!no", name = "cf", descriptor = "I")
    public int field9219;

    @OriginalMember(owner = "client!no", name = "gf", descriptor = "I")
    private int field9223;

    @OriginalMember(owner = "client!no", name = "vf", descriptor = "I")
    public int field9237;

    @OriginalMember(owner = "client!no", name = "If", descriptor = "I")
    private int field9250;

    @OriginalMember(owner = "client!no", name = "Mf", descriptor = "I")
    public int field9254;

    @OriginalMember(owner = "client!no", name = "Zf", descriptor = "I")
    private int field9267;

    @OriginalMember(owner = "client!no", name = "ag", descriptor = "I")
    private int field9268;

    @OriginalMember(owner = "client!no", name = "hg", descriptor = "I")
    private int field9275;

    @OriginalMember(owner = "client!no", name = "Ag", descriptor = "I")
    private int field9294;

    @OriginalMember(owner = "client!no", name = "Dg", descriptor = "I")
    public int field9297;

    @OriginalMember(owner = "client!no", name = "Eg", descriptor = "I")
    private int field9298;

    @OriginalMember(owner = "client!no", name = "Kg", descriptor = "I")
    private int field9304;

    @OriginalMember(owner = "client!no", name = "Pg", descriptor = "I")
    private int field9309;

    @OriginalMember(owner = "client!no", name = "ih", descriptor = "I")
    private int field9328;

    @OriginalMember(owner = "client!no", name = "lh", descriptor = "I")
    private int field9331;

    @OriginalMember(owner = "client!no", name = "ph", descriptor = "I")
    private int field9335;

    @OriginalMember(owner = "client!no", name = "sh", descriptor = "I")
    private int field9338;

    @OriginalMember(owner = "client!no", name = "cg", descriptor = "J")
    private long field9270;

    @OriginalMember(owner = "client!no", name = "Ie", descriptor = "Las;")
    private class141 field9199;

    @OriginalMember(owner = "client!no", name = "jg", descriptor = "Lgb;")
    private class202 field9277;

    @OriginalMember(owner = "client!no", name = "Hg", descriptor = "Lgb;")
    private class202 field9301;

    @OriginalMember(owner = "client!no", name = "rg", descriptor = "Lgaa;")
    public class275 field9285;

    @OriginalMember(owner = "client!no", name = "ef", descriptor = "Lmn;")
    private class340 field9221;

    @OriginalMember(owner = "client!no", name = "Qd", descriptor = "Lbi;")
    public static class449 field9155;

    @OriginalMember(owner = "client!no", name = "Nf", descriptor = "Lgda;")
    public class51 field9255;

    @OriginalMember(owner = "client!no", name = "fh", descriptor = "Lgda;")
    public class51 field9325;

    @OriginalMember(owner = "client!no", name = "ah", descriptor = "Loo;")
    private class585 field9320;

    @OriginalMember(owner = "client!no", name = "Uf", descriptor = "Lqn;")
    private class60 field9262;

    @OriginalMember(owner = "client!no", name = "Ae", descriptor = "Lfb;")
    private class632 field9191;

    @OriginalMember(owner = "client!no", name = "Ge", descriptor = "Lfb;")
    private class632 field9197;

    @OriginalMember(owner = "client!no", name = "hf", descriptor = "Lev;")
    public class649 field9224;

    @OriginalMember(owner = "client!no", name = "lf", descriptor = "Lev;")
    public class649 field9227;

    @OriginalMember(owner = "client!no", name = "qf", descriptor = "Lev;")
    public class649 field9232;

    @OriginalMember(owner = "client!no", name = "yf", descriptor = "Lev;")
    public class649 field9240;

    @OriginalMember(owner = "client!no", name = "Gf", descriptor = "Lev;")
    public class649 field9248;

    @OriginalMember(owner = "client!no", name = "Lf", descriptor = "Lev;")
    public class649 field9253;

    @OriginalMember(owner = "client!no", name = "yg", descriptor = "Lev;")
    public class649 field9292;

    @OriginalMember(owner = "client!no", name = "Lg", descriptor = "Lev;")
    public class649 field9305;

    @OriginalMember(owner = "client!no", name = "Rg", descriptor = "Lev;")
    public class649 field9311;

    @OriginalMember(owner = "client!no", name = "bh", descriptor = "Lev;")
    public class649 field9321;

    @OriginalMember(owner = "client!no", name = "kf", descriptor = "Lhda;")
    public class701 field9226;

    @OriginalMember(owner = "client!no", name = "ig", descriptor = "Lhda;")
    public class701 field9276;

    @OriginalMember(owner = "client!no", name = "De", descriptor = "Lvga;")
    private class79 field9194;

    @OriginalMember(owner = "client!no", name = "mg", descriptor = "Lvga;")
    public class79 field9280;

    @OriginalMember(owner = "client!no", name = "ue", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field9185;

    @OriginalMember(owner = "client!no", name = "ff", descriptor = "Z")
    public boolean field9222;

    @OriginalMember(owner = "client!no", name = "pf", descriptor = "Z")
    private boolean field9231;

    @OriginalMember(owner = "client!no", name = "sf", descriptor = "Z")
    private boolean field9234;

    @OriginalMember(owner = "client!no", name = "Af", descriptor = "Z")
    public boolean field9242;

    @OriginalMember(owner = "client!no", name = "Ef", descriptor = "Z")
    private boolean field9246;

    @OriginalMember(owner = "client!no", name = "Jf", descriptor = "Z")
    public boolean field9251;

    @OriginalMember(owner = "client!no", name = "Qf", descriptor = "Z")
    private boolean field9258;

    @OriginalMember(owner = "client!no", name = "Yf", descriptor = "Z")
    private boolean field9266;

    @OriginalMember(owner = "client!no", name = "dg", descriptor = "Z")
    public boolean field9271;

    @OriginalMember(owner = "client!no", name = "fg", descriptor = "Z")
    public boolean field9273;

    @OriginalMember(owner = "client!no", name = "gg", descriptor = "Z")
    private boolean field9274;

    @OriginalMember(owner = "client!no", name = "ng", descriptor = "Z")
    public boolean field9281;

    @OriginalMember(owner = "client!no", name = "og", descriptor = "Z")
    private boolean field9282;

    @OriginalMember(owner = "client!no", name = "pg", descriptor = "Z")
    private boolean field9283;

    @OriginalMember(owner = "client!no", name = "sg", descriptor = "Z")
    private boolean field9286;

    @OriginalMember(owner = "client!no", name = "wg", descriptor = "Z")
    private boolean field9290;

    @OriginalMember(owner = "client!no", name = "Og", descriptor = "Z")
    private boolean field9308;

    @OriginalMember(owner = "client!no", name = "Tg", descriptor = "Z")
    public boolean field9313;

    @OriginalMember(owner = "client!no", name = "Xg", descriptor = "Z")
    public boolean field9317;

    @OriginalMember(owner = "client!no", name = "Fg", descriptor = "[Lhf;")
    private class367[] field9299;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "()V")
    public final void method107() {
        ++field8986;
        if (this.field9284) {
            if (this.field9194 != this.field9197) {
                throw new RuntimeException();
            }
            this.field9194.method620(1, 0);
            this.field9194.method620(1, 8);
            this.method3658(-119, this.field9194);
        } else {
            if (!this.field9290) {
                throw new RuntimeException("");
            }
            this.field9199.method273(0, 0, this.field9071, this.field9051, 0, 0);
            this.field9133.setSurface(this.field8980);
        }
        this.field9071 = this.field9000;
        this.field9051 = this.field9019;
        this.field9199 = null;
        this.method3613((byte) -109);
        this.method3674(2);
        this.method435();
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(I)V")
    private final void method3601(int arg0) {
        ++field9021;
        if (this.field9298 != 1) {
            this.method3662(32272);
            this.method3619(false, arg0 ^ -138);
            this.method3653(false, 1000);
            this.method3632((byte) -74, false);
            this.method3680(-112, false);
            this.method3630((class367) null, -2);
            this.method3679(-77, -2);
            this.method3603((byte) -34, 1);
            this.field9298 = 1;
        }
        if (arg0 != 6001) {
            this.method3634((class701) null, (byte) 31);
        }
    }

    @OriginalMember(owner = "client!no", name = "g", descriptor = "(I)V")
    public final void method409(int arg0) {
        ++field9053;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(III)V")
    public final synchronized void method3602(int arg0, int arg1, int arg2) {
        if (arg0 != -25440) {
            this.method3624(-52);
        }
        ++field9043;
        class704 var4 = new class704(arg1);
        var4.field6724 = (long) arg2;
        this.field9207.method3265(var4, (byte) -80);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BI)V")
    public final void method3603(byte arg0, int arg1) {
        if (arg0 != -34) {
            this.method426(-62, 111, -61, -9, false);
        }
        if (~arg1 == -2) {
            this.method3644(7681, 23560, 7681);
        } else if (~arg1 != -1) {
            if (arg1 != 2) {
                if (arg1 == 3) {
                    this.method3644(8448, 23560, 260);
                } else if (~arg1 == -5) {
                    this.method3644(34023, 23560, 34023);
                }
            } else {
                this.method3644(7681, 23560, 34165);
            }
        } else {
            this.method3644(8448, 23560, 8448);
        }
        ++field9047;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lfb;I)V")
    public final void method3604(class632 arg0, int arg1) {
        ++field9098;
        if (this.field9196 >= 3) {
            throw new RuntimeException();
        } else {
            if (arg1 != -2034463408) {
                this.method3672(111, 115, -51, -7);
            }
            if (~this.field9196 <= -1) {
                this.field9195[this.field9196].method629(24676);
            }
            this.field9191 = this.field9195[++this.field9196] = arg0;
            this.field9191.method626(arg1 + 2034463935);
        }
    }

    @OriginalMember(owner = "client!no", name = "ka", descriptor = "(FF)V")
    public final void method385(float arg0, float arg1) {
        ++field9126;
        if (this.field9279 != arg0 || this.field9241 != arg1) {
            this.field9279 = arg0;
            this.field9241 = arg1;
            this.method3675((byte) 95);
            if (~this.field9304 != -4) {
                if (~this.field9304 == -3) {
                    this.method3650(0);
                    return;
                }
            } else {
                this.method3616(-12195);
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method86(Rectangle[] arg0, int arg1) throws class26 {
        this.method97();
        ++field9038;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILqn;IIB)V")
    public final void method3605(int arg0, class60 arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 6) {
            this.field9301 = null;
        }
        ++field9005;
        int var6 = arg1.method493(false);
        int var7 = arg0 * this.method3627(false, var6);
        this.method3611(arg1, 34);
        OpenGL.glDrawElements(arg3, arg2, var6, (long) var7 + arg1.method492(-96));
    }

    @OriginalMember(owner = "client!no", name = "j", descriptor = "(I)V")
    private final void method3606(int arg0) {
        if (arg0 != 128) {
            method3665(true);
        }
        if (this.field9231) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field9231 = false;
        }
        ++field9069;
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(Z)V")
    private final void method3607(boolean arg0) {
        ++field9010;
        int var2;
        if (this.field9313) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field9329;
        } else {
            this.field9291 = (float) (-this.field9215 + this.field9303) - this.field9259;
            this.field9244 = -((float) this.field9332 * this.field9236) + this.field9291;
            if (this.field9244 < (float) this.field9326) {
                this.field9244 = (float) this.field9326;
            }
            OpenGL.glFogf(2915, this.field9244);
            OpenGL.glFogf(2916, this.field9291);
            var2 = this.field9296;
        }
        class254.field3525[0] = (float) class571.method3139(var2, 16711680) / 1.671168E7F;
        class254.field3525[2] = (float) class571.method3139(255, var2) / 255.0F;
        class254.field3525[1] = (float) class571.method3139(65280, var2) / 65280.0F;
        if (arg0) {
            OpenGL.glFogfv(2918, class254.field3525, 0);
            if (this.field9313) {
                this.field9178.field7812.method1741(34336);
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "y", descriptor = "()Z")
    public final boolean method428() {
        ++field9062;
        return true;
    }

    @OriginalMember(owner = "client!no", name = "B", descriptor = "()Z")
    public final boolean method424() {
        ++field8995;
        return false;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I[Lpv;)V")
    public final void method400(int arg0, class65[] arg1) {
        ++field9066;
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field9319[var3] = arg1[var3];
        }
        this.field9331 = arg0;
        if (this.field9304 != 1) {
            this.method3635(5890);
        }
    }

    @OriginalMember(owner = "client!no", name = "t", descriptor = "()V")
    public final void method30() {
        if (this.field9173 != null && this.field9173.method2284((byte) 96)) {
            this.field9170.method1794(this.field9173, (byte) -128);
            this.field9164.method1583((byte) 69);
        }
        ++field9039;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIZ)Lxa;")
    public final class468 method426(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field8994;
        return new class141(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lq;)V")
    public final void method405(class397 arg0) {
        this.field9276 = (class701) arg0;
        ++field9108;
        this.field9226.method3878(this.field9276, -115);
        if (this.field9304 != 1) {
            this.method3645(34167);
        }
    }

    @OriginalMember(owner = "client!no", name = "g", descriptor = "()Z")
    public final boolean method404() {
        ++field9147;
        return true;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZIIILjaclib/memory/Buffer;)Lgb;")
    public final class202 method3608(boolean arg0, int arg1, int arg2, int arg3, Buffer arg4) {
        if (arg1 != 1) {
            return null;
        } else {
            ++field8993;
            return (class202) (!this.field9322 || arg0 && !this.field9229 ? new class350(this, arg3, arg4) : new class559(this, arg3, arg4, arg2, arg0));
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BIII)V")
    public final void method3609(byte arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg2 + 34176, arg3);
        ++field9060;
        if (arg0 == 27) {
            OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
    public final void method378(int arg0) {
        ++field9106;
        this.method3668((byte) 82);
    }

    @OriginalMember(owner = "client!no", name = "ca", descriptor = "(IIII)V")
    public final void method421(int arg0, int arg1, int arg2, int arg3) {
        if (~arg0 > -1) {
            arg0 = 0;
        }
        ++field9014;
        if (~this.field9071 > ~arg2) {
            arg2 = this.field9071;
        }
        if (~this.field9051 > ~arg3) {
            arg3 = this.field9051;
        }
        if (~arg1 > -1) {
            arg1 = 0;
        }
        this.field9330 = arg1;
        this.field9256 = arg0;
        this.field9269 = arg2;
        this.field9316 = arg3;
        OpenGL.glEnable(3089);
        this.method3652(-90);
        this.method3684(-1);
    }

    @OriginalMember(owner = "client!no", name = "u", descriptor = "()I")
    public final int method454() {
        ++field9002;
        return 4;
    }

    @OriginalMember(owner = "client!no", name = "q", descriptor = "()Z")
    public final boolean method458() {
        ++field9087;
        return true;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "()Z")
    public final boolean method390() {
        ++field9092;
        return this.field9178.method3243((byte) 91, 3);
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "()V")
    public final void method444() {
        ++field9031;
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "(Z)I")
    private final int method3610(boolean arg0) {
        ++field9028;
        int var2 = 0;
        this.field9264 = OpenGL.glGetString(7936).toLowerCase();
        this.field9287 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field9264.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (this.field9264.indexOf("brian paul") != -1 || ~this.field9264.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class572.method3141(var3.replace('.', ' '), ' ', (byte) 12);
        if (~var4.length > -3) {
            var2 |= 4;
        } else {
            try {
                int var5 = class664.method3730(var4[0], 127);
                int var6 = class664.method3730(var4[1], 123);
                this.field9294 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (this.field9294 < 12) {
            var2 |= 2;
        }
        if (!this.field9133.method3207("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field9133.method3207("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field9237 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field9267 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field9275 = var7[0];
        if (this.field9237 < 2 || this.field9267 < 2 || ~this.field9275 > -3) {
            var2 |= 16;
        }
        this.field9272 = Stream.method3473();
        this.field9290 = this.field9133.arePbuffersAvailable();
        this.field9322 = this.field9133.method3207("GL_ARB_vertex_buffer_object");
        this.field9286 = this.field9133.method3207("GL_ARB_multisample");
        this.field9251 = this.field9133.method3207("GL_ARB_vertex_program");
        this.field9133.method3207("GL_ARB_fragment_program");
        this.field9281 = this.field9133.method3207("GL_ARB_vertex_shader");
        this.field9242 = this.field9133.method3207("GL_ARB_fragment_shader");
        this.field9307 = this.field9133.method3207("GL_EXT_texture3D");
        this.field9310 = this.field9133.method3207("GL_ARB_texture_rectangle");
        this.field9222 = this.field9133.method3207("GL_ARB_texture_cube_map");
        this.field9302 = this.field9133.method3207("GL_ARB_texture_float");
        this.field9273 = arg0;
        this.field9284 = this.field9133.method3207("GL_EXT_framebuffer_object");
        this.field9271 = this.field9133.method3207("GL_EXT_framebuffer_blit");
        this.field9317 = this.field9133.method3207("GL_EXT_framebuffer_multisample");
        this.field9258 = this.field9271 & this.field9317;
        OpenGL.glGetFloatv(2834, class254.field3525, 0);
        this.field9228 = class254.field3525[0];
        this.field9249 = class254.field3525[1];
        return var2 == 0 ? 0 : var2;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lqn;I)V")
    public final void method3611(class60 arg0, int arg1) {
        ++field9135;
        if (this.field9262 != arg0) {
            if (this.field9322) {
                OpenGL.glBindBufferARB(34963, arg0.method491((byte) -121));
            }
            this.field9262 = arg0;
        }
        if (arg1 < 33) {
            this.field9246 = true;
        }
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "(IIIII)V")
    public final void method379(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3601(6001);
        ++field9174;
        this.method3646(-2, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lpga;Z)Lxa;")
    public final class468 method440(class500 arg0, boolean arg1) {
        ++field9151;
        int[] var3 = new int[arg0.field6700 * arg0.field6698];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field6696 == null) {
            for (int var6 = 0; ~arg0.field6700 < ~var6; ++var6) {
                for (int var7 = 0; ~var7 > ~arg0.field6698; ++var7) {
                    int var8 = arg0.field6702[arg0.field6697[var4++] & 255];
                    var3[var5++] = var8 == 0 ? 0 : class220.method1393(-16777216, var8);
                }
            }
        } else {
            for (int var9 = 0; ~var9 > ~arg0.field6700; ++var9) {
                for (int var11 = 0; ~arg0.field6698 < ~var11; ++var11) {
                    var3[var5++] = class220.method1393(arg0.field6696[var4] << 24, arg0.field6702[class571.method3139(255, arg0.field6697[var4])]);
                    ++var4;
                }
            }
        }
        class468 var10 = this.method374(var3, 0, arg0.field6698, arg0.field6698, arg0.field6700);
        var10.method1029(arg0.field6695, arg0.field6699, arg0.field6694, arg0.field6701);
        return var10;
    }

    @OriginalMember(owner = "client!no", name = "k", descriptor = "(I)V")
    private final void method3612(int arg0) {
        ++field9088;
        if (this.field9026 == null) {
            this.field9000 = this.field9019 = 0;
        } else {
            Dimension var2 = this.field9026.getSize();
            this.field9000 = var2.width;
            this.field9019 = var2.height;
        }
        if (this.field9197 == null) {
            this.field9071 = this.field9000;
            this.field9051 = this.field9019;
            this.method3674(2);
        }
        if (arg0 != 22488) {
            this.method29();
        }
        this.method3613((byte) 125);
        this.method435();
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(B)V")
    public final void method3613(byte arg0) {
        ++field9013;
        if (this.field9304 != 0) {
            this.field9304 = 0;
            this.field9298 &= -32;
        }
        int var2 = -81 % ((arg0 - 73) / 47);
    }

    @OriginalMember(owner = "client!no", name = "LA", descriptor = "(IIII)V")
    public final void method445(int arg0, int arg1, int arg2, int arg3) {
        ++field9125;
        if (!this.field9313) {
            throw new RuntimeException("");
        } else {
            this.field9300 = arg2;
            this.field9297 = arg0;
            this.field9315 = arg3;
            this.field9329 = arg1;
            this.field9178.field7812.method1742(-104);
            this.method3607(true);
        }
    }

    @OriginalMember(owner = "client!no", name = "l", descriptor = "(I)V")
    public final void method3614(int arg0) {
        ++field9030;
        if (this.field9298 != 2) {
            this.method3662(arg0 + 42825);
            this.method3619(false, -6137);
            this.method3653(false, arg0 ^ -10961);
            this.method3632((byte) -123, false);
            this.method3680(-123, false);
            this.method3679(-98, -2);
            this.field9298 = 2;
        }
        if (arg0 != -10553) {
            this.method455();
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIZI)V")
    public final void method3615(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.field9299 = null;
        }
        ++field9148;
        OpenGL.glDrawArrays(arg0, arg1, arg3);
    }

    @OriginalMember(owner = "client!no", name = "FA", descriptor = "(IIIIII)Z")
    public final boolean method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9112;
        float var7 = (float) arg2 * this.field9276.field9883 + (float) arg0 * this.field9276.field9856 + (float) arg1 * this.field9276.field9858 + this.field9276.field9868;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field9276.field9883 + (float) arg3 * this.field9276.field9856 + (float) arg4 * this.field9276.field9858 + this.field9276.field9868;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field9326 > var7) || !((float) this.field9326 > var8)) && (!(var7 > (float) this.field9303) || !((float) this.field9303 < var8))) {
            int var9 = (int) (((float) arg2 * this.field9276.field9860 + (float) arg0 * this.field9276.field9878 + (float) arg1 * this.field9276.field9881 + this.field9276.field9874) * (float) this.field9295 / var7);
            int var10 = (int) (((float) arg5 * this.field9276.field9860 + (float) arg3 * this.field9276.field9878 + (float) arg4 * this.field9276.field9881 + this.field9276.field9874) * (float) this.field9295 / var8);
            if ((float) var9 < this.field9327 && (float) var10 < this.field9327 || (float) var9 > this.field9261 && (float) var10 > this.field9261) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field9276.field9861 + (float) arg0 * this.field9276.field9887 + (float) arg1 * this.field9276.field9884 + this.field9276.field9863) * (float) this.field9306 / var7);
                int var12 = (int) (((float) arg5 * this.field9276.field9861 + (float) arg3 * this.field9276.field9887 + (float) arg4 * this.field9276.field9884 + this.field9276.field9863) * (float) this.field9306 / var8);
                return (!((float) var11 < this.field9312) || !((float) var12 < this.field9312)) && (!((float) var11 > this.field9323) || !((float) var12 > this.field9323));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!no", name = "m", descriptor = "(I)V")
    private final void method3616(int arg0) {
        ++field9052;
        if (arg0 == -12195) {
            float var2 = (float) (-this.field9233) * this.field9257 / (float) this.field9295;
            float var3 = (float) (-this.field9318) * this.field9257 / (float) this.field9306;
            float var4 = (float) (this.field9071 - this.field9233) * this.field9257 / (float) this.field9295;
            float var5 = (float) (-this.field9318 + this.field9051) * this.field9257 / (float) this.field9306;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (var2 != var4 && var3 != var5) {
                OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field9326 - this.field9241), (double) ((float) this.field9303 + -this.field9241));
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!no", name = "X", descriptor = "(III)V")
    public final void method422(int arg0, int arg1, int arg2) {
        ++field9121;
        if (~this.field9296 != ~arg0 || this.field9332 != arg1 || ~this.field9215 != ~arg2) {
            this.field9215 = arg2;
            this.field9332 = arg1;
            this.field9296 = arg0;
            if (this.field9313) {
                return;
            }
            this.method3607(true);
            this.method3636(true);
        }
    }

    @OriginalMember(owner = "client!no", name = "h", descriptor = "(IIIII)V")
    public final void method436(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        ++field9041;
        if (~this.field9256 >= ~(arg0 + arg2) && -arg2 + arg0 <= this.field9269 && ~(arg1 + arg2) <= ~this.field9330 && this.field9316 >= arg1 - arg2) {
            this.method3601(6001);
            this.method3646(-2, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field9228) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field9249 >= (float) var8) {
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
                } else if (~var9 < -513) {
                    var9 = 512;
                }
                int var10 = class132.method996(var9, -102);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; var11 > 0; var11 -= var10) {
                    OpenGL.glVertex2f(class326.field4506[var11] * (float) arg2 + var6, class326.field4507[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Ldn;Ldn;FLdn;)Ldn;")
    public final class483 method49(class483 arg0, class483 arg1, float arg2, class483 arg3) {
        ++field9023;
        if (arg0 != null && arg1 != null && this.field9222 && this.field9284) {
            class124 var5 = null;
            class585 var6 = (class585) arg0;
            class585 var7 = (class585) arg1;
            class592 var8 = var6.method963(1);
            class592 var9 = var7.method963(1);
            if (var8 != null && var9 != null) {
                int var10 = ~var8.field7825 < ~var9.field7825 ? var8.field7825 : var9.field7825;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class124) {
                    class124 var11 = (class124) arg3;
                    if (~var10 == ~var11.method962(-81)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class124(this, var10);
                }
                if (var5.method961(var9, false, arg2, var8)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(Lfb;I)V")
    public final void method3617(class632 arg0, int arg1) {
        ++field9046;
        if (~this.field9192 <= arg1 && this.field9200[this.field9192] == arg0) {
            this.field9200[this.field9192--] = null;
            arg0.method628(-24836);
            if (~this.field9192 <= -1) {
                this.field9197 = this.field9200[this.field9192];
                this.field9197.method627(111);
            } else {
                this.field9197 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILhda;)V")
    public final void method3618(int arg0, class701 arg1) {
        ++field9114;
        int var3 = 24 / ((-20 - arg0) / 54);
        OpenGL.glLoadMatrixf(arg1.method3875(true), 0);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(II[I[I)Lfa;")
    public final class217 method413(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field9058;
        return class29.method247(arg2, (byte) -1, arg0, arg1, this, arg3);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZI)V")
    public final void method3619(boolean arg0, int arg1) {
        ++field9154;
        if (!this.field9234 == arg0) {
            this.field9234 = arg0;
            this.method3636(true);
            this.field9298 &= -32;
        }
        if (arg1 != -6137) {
            this.method3649(-77);
        }
    }

    @OriginalMember(owner = "client!no", name = "JA", descriptor = "(I)V")
    public final void method377(int arg0) {
        ++field9027;
        this.field9187 = 0;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field9187;
        }
        this.field9183 = 1 << this.field9187;
    }

    @OriginalMember(owner = "client!no", name = "n", descriptor = "(I)V")
    private final void method3620(int arg0) {
        this.field9276 = new class701();
        ++field9079;
        this.field9226 = new class701();
        this.field9299 = new class367[this.field9237];
        this.field9285 = new class275(this, 3553, 6408, 1, 1);
        new class275(this, 3553, 6408, arg0, 1);
        new class275(this, 3553, 6408, 1, 1);
        this.field9305 = new class649(this);
        this.field9232 = new class649(this);
        this.field9311 = new class649(this);
        this.field9321 = new class649(this);
        this.field9248 = new class649(this);
        this.field9292 = new class649(this);
        this.field9240 = new class649(this);
        this.field9227 = new class649(this);
        this.field9224 = new class649(this);
        this.field9253 = new class649(this);
        if (this.field9284) {
            this.field9280 = new class79(this);
            new class79(this);
        }
    }

    @OriginalMember(owner = "client!no", name = "o", descriptor = "(I)V")
    private final void method3621(int arg0) {
        if (arg0 == 2896) {
            ++field9018;
            if (this.field9282 && !this.field9283) {
                OpenGL.glEnable(2896);
            } else {
                OpenGL.glDisable(2896);
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method375(Canvas arg0) {
        ++field9128;
        if (this.field9012 == arg0) {
            throw new RuntimeException();
        } else if (!this.field9082.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field9133.prepareSurface(arg0);
                if (var4 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field9082.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIII)V")
    public final void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field9001;
        this.method384(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(II)I")
    public final int method460(int arg0, int arg1) {
        ++field9113;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZIIZ)V")
    public final void method3622(boolean arg0, int arg1, int arg2, boolean arg3) {
        ++field8998;
        if (~this.field9223 != ~arg2) {
            if (~arg2 > -1) {
                this.method3606(128);
                this.method3630((class367) null, -2);
                this.method3603((byte) -34, 0);
                if (!this.field9313) {
                    this.field9178.method3239(0, arg3, arg0, 0, 0, true);
                }
            } else {
                class275 var5 = this.field9164.method1584(arg2, 118);
                class364 var6 = super.field8808.method2760(arg2, 21351);
                if (var6.field4919 == 0 && var6.field4932 == 0) {
                    this.method3606(128);
                } else {
                    int var7 = var6.field4933 ? 64 : 128;
                    int var8 = var7 * 50;
                    this.method3677(0.0F, (byte) -92, (float) (this.field9186 % var8 * var6.field4932) / (float) var8, (float) (this.field9186 % var8 * var6.field4919) / (float) var8);
                }
                if (!this.field9313) {
                    this.field9178.method3239(var6.field4928, arg3, arg0, var6.field4918, var6.field4937, true);
                    if (!this.field9178.method3242(-128, var5, var6.field4935)) {
                        this.method3630(var5, -2);
                        this.method3603((byte) -34, var6.field4935);
                    }
                } else {
                    this.method3630(var5, -2);
                    this.method3603((byte) -34, var6.field4935);
                }
            }
            this.field9223 = arg2;
        }
        if (arg1 < 28) {
            this.method3636(true);
        }
        this.field9298 &= -8;
    }

    @OriginalMember(owner = "client!no", name = "r", descriptor = "()Z")
    public final boolean method380() {
        ++field9064;
        return true;
    }

    @OriginalMember(owner = "client!no", name = "f", descriptor = "(Z)V")
    public final void method3623(boolean arg0) {
        ++field8999;
        if (!arg0) {
            this.method3624(40);
        }
        if (this.field9298 != 4) {
            this.method3662(32272);
            this.method3619(false, -6137);
            this.method3653(false, 1000);
            this.method3632((byte) 96, false);
            this.method3680(-107, false);
            this.method3679(-34, -2);
            this.method3646(-2, 1);
            this.field9298 = 4;
        }
    }

    @OriginalMember(owner = "client!no", name = "p", descriptor = "(I)V")
    private final void method3624(int arg0) {
        if (arg0 != 4) {
            this.method400(30, (class65[]) null);
        }
        ++field9172;
        float[] var2 = this.field9217;
        float var3 = (float) (-this.field9233 * this.field9326) / (float) this.field9295;
        float var4 = (float) ((-this.field9233 + this.field9071) * this.field9326) / (float) this.field9295;
        float var5 = (float) (this.field9326 * this.field9318) / (float) this.field9306;
        float var6 = (float) ((this.field9318 - this.field9051) * this.field9326) / (float) this.field9306;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field9326 * 2.0F;
            var2[3] = 0.0F;
            var2[12] = 0.0F;
            var2[6] = 0.0F;
            var2[13] = 0.0F;
            var2[5] = var7 / (var5 - var6);
            var2[4] = 0.0F;
            var2[7] = 0.0F;
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[2] = 0.0F;
            var2[10] = this.field9218 = (float) (-(this.field9303 - -this.field9326)) / (float) (this.field9303 - this.field9326);
            var2[11] = -1.0F;
            var2[14] = this.field9252 = -((float) this.field9303 * var7) / (float) (this.field9303 - this.field9326);
            var2[1] = 0.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[15] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
        } else {
            var2[9] = 0.0F;
            var2[5] = 1.0F;
            var2[2] = 0.0F;
            var2[6] = 0.0F;
            var2[1] = 0.0F;
            var2[15] = 1.0F;
            var2[14] = 0.0F;
            var2[8] = 0.0F;
            var2[12] = 0.0F;
            var2[11] = 0.0F;
            var2[3] = 0.0F;
            var2[4] = 0.0F;
            var2[13] = 0.0F;
            var2[0] = 1.0F;
            var2[10] = 1.0F;
            var2[7] = 0.0F;
        }
        this.method3675((byte) 84);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z[BIII)Lqn;")
    public final class60 method3625(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        ++field8991;
        if (arg2 != -7206) {
            this.field9252 = 1.7832952F;
        }
        return (class60) (!this.field9322 || arg0 && !this.field9229 ? new class692(this, arg4, arg1, arg3) : new class708(this, arg4, arg1, arg3, arg0));
    }

    @OriginalMember(owner = "client!no", name = "ha", descriptor = "(F)V")
    public final void method442(float arg0) {
        if (this.field9293 != arg0) {
            this.field9293 = arg0;
            this.method3671((byte) 117);
        }
        ++field9180;
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "()Z")
    public final boolean method456() {
        ++field9040;
        return this.field9286 && (!this.method96() || this.field9258);
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(II)V")
    public final synchronized void method3626(int arg0, int arg1) {
        ++field9120;
        if (arg0 == -1) {
            class704 var3 = new class704(arg1);
            this.field9209.method3265(var3, (byte) -64);
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(ZI)I")
    public final int method3627(boolean arg0, int arg1) {
        ++field9007;
        if (arg0) {
            return 92;
        } else if (~arg1 != -5122 && arg1 != 5120) {
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

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method370(Canvas arg0) {
        this.field8980 = 0L;
        this.field9026 = null;
        ++field8976;
        if (arg0 != null && this.field9012 != arg0) {
            if (this.field9082.containsKey(arg0)) {
                Long var2 = (Long) this.field9082.get(arg0);
                this.field8980 = var2;
                this.field9026 = arg0;
            }
        } else {
            this.field9026 = this.field9012;
            this.field8980 = this.field9022;
        }
        if (this.field9026 != null && ~this.field8980 != -1L) {
            this.field9133.setSurface(this.field8980);
            this.method3612(22488);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!no", name = "E", descriptor = "()Z")
    public final boolean method96() {
        ++field9078;
        return this.field9173 != null && this.field9173.method2284((byte) 90);
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(II)V")
    public final void method3628(int arg0, int arg1) {
        class254.field3525[2] = (float) class571.method3139(arg1, 255) / 255.0F;
        class254.field3525[3] = (float) (arg1 >>> 24) / 255.0F;
        if (arg0 == -3672) {
            ++field9059;
            class254.field3525[0] = (float) class571.method3139(16711680, arg1) / 1.671168E7F;
            class254.field3525[1] = (float) class571.method3139(65280, arg1) / 65280.0F;
            OpenGL.glTexEnvfv(8960, 8705, class254.field3525, 0);
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(BI)V")
    public final void method3629(byte arg0, int arg1) {
        if (~this.field9309 != ~arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field9309 = arg1;
        }
        ++field8985;
        int var3 = 78 % ((-36 - arg0) / 58);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lhf;I)V")
    public final void method3630(class367 arg0, int arg1) {
        ++field9095;
        class367 var3 = this.field9299[this.field9309];
        if (arg0 != var3) {
            if (arg0 != null) {
                if (var3 != null) {
                    if (arg0.field4968 != var3.field4968) {
                        OpenGL.glDisable(var3.field4968);
                        OpenGL.glEnable(arg0.field4968);
                    }
                } else {
                    OpenGL.glEnable(arg0.field4968);
                }
                OpenGL.glBindTexture(arg0.field4968, arg0.method2166(-7912));
            } else {
                OpenGL.glDisable(var3.field4968);
            }
            this.field9299[this.field9309] = arg0;
        }
        this.field9298 &= arg1;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILfb;)V")
    public final void method3631(int arg0, class632 arg1) {
        ++field9032;
        if (this.field9192 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field9192 <= -1) {
                this.field9200[this.field9192].method628(-24836);
            }
            if (arg0 == 25704) {
                this.field9197 = this.field9200[++this.field9192] = arg1;
                this.field9197.method627(93);
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "A", descriptor = "()V")
    public final void method97() throws class26 {
        try {
            this.field9133.swapBuffers();
        } catch (Exception var1) {
        }
        ++field8978;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BZ)V")
    public final void method3632(byte arg0, boolean arg1) {
        if (!this.field9308 != !arg1) {
            if (!arg1) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field9308 = arg1;
            this.field9298 &= -32;
        }
        ++field9144;
        int var3 = 17 % ((7 - arg0) / 45);
    }

    @OriginalMember(owner = "client!no", name = "q", descriptor = "(I)Ljk;")
    public final class592 method3633(int arg0) {
        if (arg0 <= 25) {
            this.field9234 = false;
        }
        ++field9122;
        return this.field9320 == null ? null : this.field9320.method963(1);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lhda;B)V")
    public final void method3634(class701 arg0, byte arg1) {
        ++field9171;
        int var3 = -83 / ((arg1 - -36) / 53);
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg0.method3875(true), 0);
    }

    @OriginalMember(owner = "client!no", name = "r", descriptor = "(I)V")
    private final void method3635(int arg0) {
        ++field9123;
        int var2 = 0;
        if (arg0 == 5890) {
            while (~this.field9331 < ~var2) {
                class65 var3 = this.field9319[var2];
                int var4 = var2 + 16386;
                class668.field9487[0] = (float) var3.method515((byte) 118);
                class668.field9487[1] = (float) var3.method516(-18736);
                class668.field9487[2] = (float) var3.method518((byte) 60);
                class668.field9487[3] = 1.0F;
                OpenGL.glLightfv(var4, 4611, class668.field9487, 0);
                int var5 = var3.method514(arg0 + -5811);
                float var6 = var3.method519(true) / 255.0F;
                class668.field9487[2] = (float) class571.method3139(var5, 255) * var6;
                class668.field9487[1] = var6 * (float) (class571.method3139(65329, var5) >> 8);
                class668.field9487[0] = var6 * (float) (class571.method3139(var5, 16718860) >> 16);
                OpenGL.glLightfv(var4, 4609, class668.field9487, 0);
                OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method522(-63) * var3.method522(arg0 + -5773)));
                OpenGL.glEnable(var4);
                ++var2;
            }
            while (~var2 > ~this.field9328) {
                OpenGL.glDisable(var2 + 16386);
                ++var2;
            }
            this.field9328 = this.field9331;
        }
    }

    @OriginalMember(owner = "client!no", name = "U", descriptor = "()I")
    public final int method464() {
        ++field9162;
        return this.field9326;
    }

    @OriginalMember(owner = "client!no", name = "g", descriptor = "(Z)V")
    private final void method3636(boolean arg0) {
        if (this.field9234 && ~this.field9332 <= -1 | this.field9313) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field9090;
        if (!arg0) {
            this.field9329 = -61;
        }
    }

    @OriginalMember(owner = "client!no", name = "ma", descriptor = "(IIIIII[BII)V")
    public final void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field9110;
        float var10;
        float var11;
        if (this.field9221 != null && this.field9221.field3859 >= arg2 && ~this.field9221.field3856 <= ~arg3) {
            this.field9221.method1670((byte) 12, 0, 0, 0, 6406, arg2, arg6, arg3, false, 0);
            var10 = (float) arg2 * this.field9221.field4695 / (float) this.field9221.field3859;
            var11 = (float) arg3 * this.field9221.field4701 / (float) this.field9221.field3856;
        } else {
            this.field9221 = class595.method3281((byte) 82, 6406, 6406, arg3, false, arg2, this, arg6);
            this.field9221.method1664(false, false, (byte) 18);
            var11 = this.field9221.field4701;
            var10 = this.field9221.field4695;
        }
        this.method3614(-10553);
        this.method3630(this.field9221, -2);
        this.method3646(-2, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method3628(-3672, arg5);
        this.method3644(34165, 23560, 34165);
        this.method3609((byte) 27, 768, 0, 34166);
        this.method3609((byte) 27, 770, 2, 5890);
        this.method3672(770, 0, 34166, -6491);
        this.method3672(770, 2, 5890, -6491);
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
        this.method3609((byte) 27, 768, 0, 5890);
        this.method3609((byte) 27, 770, 2, 34166);
        this.method3672(770, 0, 5890, -6491);
        this.method3672(770, 2, 34166, -6491);
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(ZI)V")
    public final void method3637(boolean arg0, int arg1) {
        if (arg0 == !this.field9283) {
            this.field9283 = arg0;
            this.method3621(2896);
        }
        if (arg1 >= -53) {
            this.field9203 = -62;
        }
        ++field9061;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(FFB)V")
    public final void method3638(float arg0, float arg1, byte arg2) {
        ++field9158;
        int var4 = 80 / ((69 - arg2) / 53);
        this.field9236 = arg1;
        this.field9259 = arg0;
        if (!this.field9313) {
            this.method3607(true);
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(ILfb;)V")
    public final void method3639(int arg0, class632 arg1) {
        ++field9130;
        if (arg0 != 7) {
            this.field9298 = -87;
        }
        if (this.field9271) {
            this.method3604(arg1, -2034463408);
            this.method3631(25704, arg1);
        } else if (this.field9190 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field9190 <= -1) {
                this.field9198[this.field9190].method617((byte) -122);
            }
            this.field9191 = this.field9197 = this.field9198[++this.field9190] = arg1;
            this.field9191.method616(-27858);
        }
    }

    @OriginalMember(owner = "client!no", name = "C", descriptor = "()Z")
    public final boolean method431() {
        ++field9111;
        return this.field9173 != null && (~this.field9176 >= -2 || this.field9258);
    }

    @OriginalMember(owner = "client!no", name = "L", descriptor = "(ILfa;II)V")
    public final void method397(int arg0, class217 arg1, int arg2, int arg3) {
        ++field9055;
        class311 var5 = (class311) arg1;
        class340 var6 = var5.field4283;
        this.method3614(-10553);
        this.method3630(var5.field4283, -2);
        this.method3646(-2, 1);
        this.method3644(8448, 23560, 7681);
        this.method3609((byte) 27, 768, 0, 34167);
        float var7 = var6.field4695 / (float) var6.field4693;
        float var8 = var6.field4701 / (float) var6.field4698;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field9256) * var7, (float) (-arg3 + this.field9330) * var8);
        OpenGL.glVertex2i(this.field9256, this.field9330);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field9256) * var7, (float) (this.field9316 - arg3) * var8);
        OpenGL.glVertex2i(this.field9256, this.field9316);
        OpenGL.glTexCoord2f((float) (this.field9269 - arg2) * var7, (float) (-arg3 + this.field9316) * var8);
        OpenGL.glVertex2i(this.field9269, this.field9316);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field9269) * var7, (float) (-arg3 + this.field9330) * var8);
        OpenGL.glVertex2i(this.field9269, this.field9330);
        OpenGL.glEnd();
        this.method3609((byte) 27, 768, 0, 5890);
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(BI)V")
    public final synchronized void method3640(byte arg0, int arg1) {
        if (arg0 > 75) {
            ++field9025;
            class504 var3 = new class504();
            var3.field6724 = (long) arg1;
            this.field9211.method3265(var3, (byte) -67);
        }
    }

    @OriginalMember(owner = "client!no", name = "m", descriptor = "(IIII)V")
    public final void method373(int arg0, int arg1, int arg2, int arg3) {
        ++field9029;
        this.field9233 = arg0;
        this.field9306 = arg3;
        this.field9318 = arg1;
        this.field9295 = arg2;
        this.method3624(4);
        this.method3652(-92);
        if (~this.field9304 == -4) {
            this.method3616(-12195);
        } else if (~this.field9304 == -3) {
            this.method3650(0);
        }
    }

    @OriginalMember(owner = "client!no", name = "p", descriptor = "()Z")
    public final boolean method416() {
        ++field8979;
        return true;
    }

    @OriginalMember(owner = "client!no", name = "D", descriptor = "()Z")
    public final boolean method388() {
        ++field9068;
        return true;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I[BZII)Lgb;")
    public final class202 method3641(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        ++field9177;
        if (arg3 != 5225) {
            return null;
        } else {
            return (class202) (!this.field9322 || arg2 && !this.field9229 ? new class350(this, arg0, arg1, arg4) : new class559(this, arg0, arg1, arg4, arg2));
        }
    }

    @OriginalMember(owner = "client!no", name = "D", descriptor = "(I)V")
    public final void method87(int arg0) {
        ++field9073;
        this.method3646(-2, 0);
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!no", name = "f", descriptor = "()Lq;")
    public final class397 method466() {
        ++field8981;
        return new class701();
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(III)V")
    public final synchronized void method3642(int arg0, int arg1, int arg2) {
        ++field9056;
        class704 var4 = new class704(arg1);
        var4.field6724 = (long) arg0;
        this.field9208.method3265(var4, (byte) -102);
        if (arg2 != 516) {
            this.method3669(78);
        }
    }

    @OriginalMember(owner = "client!no", name = "k", descriptor = "()V")
    public final void method414() {
        ++field9003;
        this.field9313 = false;
        this.field9178.method3239(0, false, false, 0, 0, true);
        this.method3607(true);
        this.method3636(true);
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(B)V")
    private final void method3643(byte arg0) {
        if (arg0 != -124) {
            this.method3669(52);
        }
        ++field9163;
        int var2 = 0;
        while (!this.field9133.method3208()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class486.method2722(0, 1000L);
        }
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(III)V")
    public final void method3644(int arg0, int arg1, int arg2) {
        ++field9146;
        if (~this.field9309 == -1) {
            boolean var4 = false;
            if (~this.field9333 != ~arg2) {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                var4 = true;
                this.field9333 = arg2;
            }
            if (this.field9230 != arg0) {
                OpenGL.glTexEnvi(8960, 34162, arg0);
                this.field9230 = arg0;
                var4 = true;
            }
            if (var4) {
                this.field9298 &= -30;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg2);
            OpenGL.glTexEnvi(8960, 34162, arg0);
        }
        if (arg1 != 23560) {
            this.field9220 = 37;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "([IIIII)Lxa;")
    public final class468 method374(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9153;
        return new class141(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method420(Canvas arg0) {
        ++field9080;
        if (this.field9012 == arg0) {
            throw new RuntimeException();
        } else if (this.field9082.containsKey(arg0)) {
            Long var2 = (Long) this.field9082.get(arg0);
            this.field9133.releaseSurface(arg0, var2);
            this.field9082.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!no", name = "s", descriptor = "(I)V")
    private final void method3645(int arg0) {
        if (arg0 != 34167) {
            this.field9202 = 27;
        }
        OpenGL.glLoadIdentity();
        ++field8992;
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field9276.method3875(true), 0);
        if (this.field9313) {
            this.field9178.field7812.method1742(-67);
        }
        this.method3651((byte) -122);
        this.method3635(arg0 + -28277);
    }

    @OriginalMember(owner = "client!no", name = "YA", descriptor = "(IFFFFF)V")
    public final void method371(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field9099;
        boolean var7 = this.field9220 != arg0;
        if (var7 || this.field9213 != arg1 || this.field9235 != arg2) {
            this.field9235 = arg2;
            this.field9213 = arg1;
            this.field9220 = arg0;
            if (var7) {
                this.field9239 = (float) (this.field9220 & 16711680) / 1.671168E7F;
                this.field9214 = (float) (this.field9220 & 65280) / 65280.0F;
                this.field9324 = (float) (this.field9220 & 255) / 255.0F;
                this.method3671((byte) 117);
            }
            this.method3649(111);
        }
        if (this.field9238[0] != arg3 || this.field9238[1] != arg4 || this.field9238[2] != arg5) {
            this.field9238[2] = arg5;
            this.field9238[0] = arg3;
            this.field9238[1] = arg4;
            this.field9247[1] = -arg4;
            this.field9247[0] = -arg3;
            this.field9247[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field9216[0] = arg3 * var8;
            this.field9216[2] = arg5 * var8;
            this.field9216[1] = arg4 * var8;
            this.field9288[0] = -this.field9216[0];
            this.field9288[2] = -this.field9216[2];
            this.field9288[1] = -this.field9216[1];
            this.method3651((byte) -114);
            this.field9254 = (int) (arg3 * 256.0F / arg4);
            this.field9219 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "(II)V")
    public final void method3646(int arg0, int arg1) {
        ++field9045;
        if (this.field9268 != arg1) {
            boolean var3;
            boolean var4;
            byte var5;
            if (~arg1 == -2) {
                var3 = true;
                var4 = true;
                var5 = 1;
            } else if (~arg1 == -3) {
                var5 = 2;
                var4 = false;
                var3 = true;
            } else if (arg1 != 128) {
                var3 = true;
                var5 = 0;
                var4 = false;
            } else {
                var3 = true;
                var4 = true;
                var5 = 3;
            }
            if (!var3 != !this.field9274) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field9274 = var3;
            }
            if (this.field9266 != var4) {
                if (var4) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field9266 = var4;
            }
            if (~this.field9250 != ~var5) {
                if (~var5 == -2) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (var5 == 2) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                } else if (~var5 != -4) {
                    OpenGL.glDisable(3042);
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(774, 1);
                }
                this.field9250 = var5;
            }
            this.field9298 &= -29;
            this.field9268 = arg1;
        }
        if (arg0 != -2) {
            this.field9249 = 1.079339F;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(FFF)V")
    public final void method70(float arg0, float arg1, float arg2) {
        ++field8987;
        class288.field4071 = arg2;
        class575.field7605 = arg0;
        class223.field3140 = arg1;
    }

    @OriginalMember(owner = "client!no", name = "F", descriptor = "()V")
    public final void method435() {
        ++field9008;
        this.field9256 = 0;
        this.field9316 = this.field9051;
        this.field9269 = this.field9071;
        this.field9330 = 0;
        OpenGL.glDisable(3089);
        this.method3652(-100);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lc;)V")
    public final void method465(class174 arg0) {
        ++field9159;
        this.field9160.method2382((byte) 116, this, arg0);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIF)Lpv;")
    public final class65 method427(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field9150;
        return new class347(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method447(Canvas arg0) {
        ++field9089;
        long var2 = 0L;
        if (arg0 != null && this.field9012 != arg0) {
            if (this.field9082.containsKey(arg0)) {
                Long var4 = (Long) this.field9082.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field9022;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field9133.surfaceResized(var2);
            if (this.field9026 == arg0) {
                this.method3612(22488);
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "v", descriptor = "()I")
    public final int method403() {
        ++field9097;
        return this.field9204 + this.field9203 + this.field9202;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lpf;IIII)Lba;")
    public final class358 method443(class545 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9129;
        return new class649(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(Li;)V")
    public final void method439(class37 arg0) {
        ++field9115;
        this.field9185 = ((class186) arg0).field2777;
        if (this.field9277 == null) {
            class85 var2 = new class85(80);
            if (this.field9272) {
                var2.method693(-1.0F, 69);
                var2.method693(-1.0F, 68);
                var2.method693(0.0F, 111);
                var2.method693(0.0F, 92);
                var2.method693(1.0F, 82);
                var2.method693(1.0F, 63);
                var2.method693(-1.0F, 74);
                var2.method693(0.0F, 33);
                var2.method693(1.0F, 69);
                var2.method693(1.0F, 36);
                var2.method693(1.0F, 30);
                var2.method693(1.0F, 84);
                var2.method693(0.0F, 82);
                var2.method693(1.0F, 68);
                var2.method693(0.0F, 40);
                var2.method693(-1.0F, 62);
                var2.method693(1.0F, 58);
                var2.method693(0.0F, 124);
                var2.method693(0.0F, 124);
                var2.method693(0.0F, 41);
            } else {
                var2.method692(-88, -1.0F);
                var2.method692(-95, -1.0F);
                var2.method692(-99, 0.0F);
                var2.method692(113, 0.0F);
                var2.method692(107, 1.0F);
                var2.method692(-44, 1.0F);
                var2.method692(124, -1.0F);
                var2.method692(-57, 0.0F);
                var2.method692(-42, 1.0F);
                var2.method692(123, 1.0F);
                var2.method692(-81, 1.0F);
                var2.method692(115, 1.0F);
                var2.method692(-103, 0.0F);
                var2.method692(120, 1.0F);
                var2.method692(-91, 0.0F);
                var2.method692(-37, -1.0F);
                var2.method692(-74, 1.0F);
                var2.method692(-123, 0.0F);
                var2.method692(105, 0.0F);
                var2.method692(-67, 0.0F);
            }
            this.field9277 = this.method3641(20, var2.field4600, false, 5225, var2.field4619);
            this.field9255 = new class51(this.field9277, 5126, 3, 0);
            this.field9325 = new class51(this.field9277, 5126, 2, 12);
            this.field9160.method2380(this, 5121);
        }
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "(I)V")
    public final synchronized void method52(int arg0) {
        ++field8996;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field9207.method3254((byte) 32)) {
            class704 var12 = (class704) this.field9207.method3262(-127);
            class454.field6191[var2++] = (int) var12.field6724;
            this.field9203 -= var12.field9905;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class454.field6191, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class454.field6191, 0);
            var2 = 0;
        }
        while (!this.field9208.method3254((byte) 32)) {
            class704 var11 = (class704) this.field9208.method3262(-119);
            class454.field6191[var2++] = (int) var11.field6724;
            this.field9202 -= var11.field9905;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class454.field6191, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class454.field6191, 0);
            var2 = 0;
        }
        while (!this.field9209.method3254((byte) 32)) {
            class704 var10 = (class704) this.field9209.method3262(-114);
            class454.field6191[var2++] = var10.field9905;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class454.field6191, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class454.field6191, 0);
            var2 = 0;
        }
        while (!this.field9210.method3254((byte) 32)) {
            class704 var9 = (class704) this.field9210.method3262(-118);
            class454.field6191[var2++] = (int) var9.field6724;
            this.field9204 -= var9.field9905;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class454.field6191, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class454.field6191, 0);
            boolean var4 = false;
        }
        while (!this.field9206.method3254((byte) 32)) {
            class704 var8 = (class704) this.field9206.method3262(-122);
            OpenGL.glDeleteLists((int) var8.field6724, var8.field9905);
        }
        while (!this.field9211.method3254((byte) 32)) {
            class504 var7 = this.field9211.method3262(-122);
            OpenGL.glDeleteProgramARB((int) var7.field6724);
        }
        while (!this.field9212.method3254((byte) 32)) {
            class504 var6 = this.field9212.method3262(-120);
            OpenGL.glDeleteObjectARB(var6.field6724);
        }
        while (!this.field9206.method3254((byte) 32)) {
            class704 var5 = (class704) this.field9206.method3262(-119);
            OpenGL.glDeleteLists((int) var5.field6724, var5.field9905);
        }
        this.field9164.method1580(true);
        if (~this.method403() < -100663297 && ~class681.method3802(-23600) < ~(this.field9270 - -60000L)) {
            System.gc();
            this.field9270 = class681.method3802(-23600);
        }
        this.field9186 = var3;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(JZ)V")
    public final synchronized void method3647(long arg0, boolean arg1) {
        ++field8989;
        if (arg1) {
            class504 var4 = new class504();
            var4.field6724 = arg0;
            this.field9212.method3265(var4, (byte) -96);
        }
    }

    @OriginalMember(owner = "client!no", name = "x", descriptor = "()Lffa;")
    public final class173 method55() {
        ++field8975;
        int var1 = -1;
        if (this.field9264.indexOf("nvidia") == -1) {
            if (~this.field9264.indexOf("intel") == 0) {
                if (this.field9264.indexOf("ati") != -1) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class173(var1, "OpenGL", this.field9294, this.field9287, 0L);
    }

    @OriginalMember(owner = "client!no", name = "ya", descriptor = "(IIIII)V")
    public final void method446(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3601(6001);
        ++field9036;
        this.method3646(-2, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lfb;B)V")
    public final void method3648(class632 arg0, byte arg1) {
        int var3 = 39 / ((66 - arg1) / 53);
        ++field9016;
        if (this.field9196 >= 0 && this.field9195[this.field9196] == arg0) {
            this.field9195[this.field9196--] = null;
            arg0.method629(24676);
            if (~this.field9196 > -1) {
                this.field9191 = null;
            } else {
                this.field9191 = this.field9195[this.field9196];
                this.field9191.method626(527);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "([Lba;Lq;[Lot;I)V")
    public final void method418(class358[] arg0, class397 arg1, class552[] arg2, int arg3) {
        ++field8984;
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method1947(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(Z)V")
    public final void method33(boolean arg0) {
        ++field9175;
    }

    @OriginalMember(owner = "client!no", name = "h", descriptor = "()V")
    public final void method100() {
        ++field9141;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!no", name = "SA", descriptor = "()I")
    public final int method104() {
        ++field8982;
        int var1 = this.field9335;
        this.field9335 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!no", name = "t", descriptor = "(I)V")
    private final void method3649(int arg0) {
        class254.field3525[0] = this.field9239 * this.field9213;
        ++field9091;
        class254.field3525[2] = this.field9324 * this.field9213;
        class254.field3525[1] = this.field9214 * this.field9213;
        class254.field3525[3] = 1.0F;
        if (arg0 <= 75) {
            this.field9317 = true;
        }
        OpenGL.glLightfv(16384, 4609, class254.field3525, 0);
        class254.field3525[3] = 1.0F;
        class254.field3525[1] = -this.field9235 * this.field9214;
        class254.field3525[2] = -this.field9235 * this.field9324;
        class254.field3525[0] = -this.field9235 * this.field9239;
        OpenGL.glLightfv(16385, 4609, class254.field3525, 0);
    }

    @OriginalMember(owner = "client!no", name = "z", descriptor = "()Lq;")
    public final class397 method455() {
        ++field9105;
        return this.field9181;
    }

    @OriginalMember(owner = "client!no", name = "o", descriptor = "()Z")
    public final boolean method93() {
        ++field9035;
        if (this.field9173 != null) {
            if (!this.field9173.method2284((byte) 81)) {
                if (!this.field9170.method1802(false, this.field9173)) {
                    return false;
                }
                this.field9164.method1583((byte) 69);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!no", name = "IA", descriptor = "()I")
    public final int method411() {
        ++field9094;
        return this.field9303;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lba;Lc;Lq;Lot;I)V")
    public final void method392(class358 arg0, class174 arg1, class397 arg2, class552 arg3, int arg4) {
        ++field9085;
        arg0.method1947(arg2, arg3, arg4);
        this.method465(arg1);
    }

    @OriginalMember(owner = "client!no", name = "u", descriptor = "(I)V")
    private final void method3650(int arg0) {
        OpenGL.glMatrixMode(5889);
        ++field9083;
        OpenGL.glLoadMatrixf(this.field9217, arg0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(B)V")
    public final void method3651(byte arg0) {
        OpenGL.glLightfv(16384, 4611, this.field9216, 0);
        if (arg0 >= -73) {
            this.method421(-60, -115, -68, -66);
        }
        ++field9166;
        OpenGL.glLightfv(16385, 4611, this.field9288, 0);
    }

    @OriginalMember(owner = "client!no", name = "C", descriptor = "(IIIIII)V")
    public final void method415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9103;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method3601(6001);
        this.method3646(-2, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field9286) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field9286) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!no", name = "i", descriptor = "(I)V")
    public final void method457(int arg0) {
        ++field9042;
        if (~arg0 <= -129 && arg0 <= 1024) {
            this.field9169 = arg0;
            this.field9164.method1583((byte) 69);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!no", name = "v", descriptor = "(I)V")
    private final void method3652(int arg0) {
        this.field9327 = (float) (-this.field9233 + this.field9256);
        ++field9152;
        this.field9323 = (float) (-this.field9318 + this.field9316);
        if (arg0 <= -88) {
            this.field9312 = (float) (-this.field9318 + this.field9330);
            this.field9261 = (float) (-this.field9233 + this.field9269);
        }
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(ZI)V")
    public final void method3653(boolean arg0, int arg1) {
        ++field9009;
        if (arg1 != 1000) {
            this.field9254 = 100;
        }
        if (this.field9282 != arg0) {
            this.field9282 = arg0;
            this.method3621(2896);
            this.field9298 &= -8;
        }
    }

    @OriginalMember(owner = "client!no", name = "w", descriptor = "(I)V")
    private final void method3654(int arg0) {
        if (arg0 != 3) {
            this.method387(-102, 111, -99, -35);
        }
        if (~this.field9304 != -4) {
            this.field9304 = 3;
            this.method3616(-12195);
            this.method3645(34167);
            this.field9298 &= -8;
        }
        ++field9161;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lxa;Z)V")
    public final void method80(class468 arg0, boolean arg1) {
        this.field9199 = (class141) arg0;
        ++field9140;
        if (!this.field9284) {
            if (!this.field9290) {
                throw new RuntimeException("");
            }
            class98 var3 = (class98) this.field9201.method2918((long) (this.field9199.method1035() << 16 | this.field9199.method1028()), (byte) 125);
            if (var3 == null) {
                var3 = new class98(this, this.field9199.method1035(), this.field9199.method1028());
                class98 var5;
                for (this.field9205 += var3.field1481 * 4; ~this.field9205 < -2097153; this.field9205 -= var5.field1481) {
                    class11 var4 = this.field9193.method3400((byte) -64);
                    if (var4 == null) {
                        break;
                    }
                    var5 = (class98) var4;
                    var5.method131(126);
                    var5.method2797(-107);
                    this.field9133.releasePbuffer(var5.method755(17));
                }
                this.field9201.method2911((long) (this.field9199.method1035() << 16 | this.field9199.method1028()), var3, (byte) -28);
            }
            this.field9193.method3391(var3, false);
            this.field9133.setPbuffer(var3.method755(17));
        } else {
            if (this.field9194 == null) {
                this.field9194 = new class79(this);
            }
            if (this.field9194 == this.field9197) {
                throw new RuntimeException();
            }
            this.method3639(7, this.field9194);
            if (arg1) {
                class101 var6 = (class101) this.field9201.method2918((long) (this.field9199.method1035() << 16 | this.field9199.method1028()), (byte) -128);
                if (var6 == null) {
                    var6 = new class101(this, 6402, this.field9199.method1035(), this.field9199.method1028());
                    class101 var8;
                    for (this.field9205 += var6.field1513; ~this.field9205 < -2097153; this.field9205 -= var8.field1513) {
                        class11 var7 = this.field9193.method3400((byte) 123);
                        if (var7 == null) {
                            break;
                        }
                        var8 = (class101) var7;
                        var8.method131(122);
                        var8.method2797(101);
                        var8.method770(-10660793);
                    }
                    this.field9201.method2911((long) (this.field9199.method1035() << 16 | this.field9199.method1028()), var6, (byte) -28);
                }
                this.field9193.method3391(var6, false);
                this.field9194.method612(103, var6, 8);
            }
            this.field9194.method621(this.field9199.field2277, 87, 0);
        }
        this.field9071 = arg0.method1035();
        this.field9051 = arg0.method1028();
        this.method3613((byte) -125);
        this.method3674(2);
        this.method435();
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(FI)V")
    public final void method3655(float arg0, int arg1) {
        if (this.field9257 != arg0) {
            this.field9257 = arg0;
            if (~this.field9304 == -4) {
                this.method3616(-12195);
            }
        }
        if (arg1 <= 46) {
            this.method424();
        }
        ++field9074;
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "()V")
    public final void method76() {
        ++field9017;
        if (this.field9289 && this.field9071 > 0 && this.field9051 > 0) {
            int var1 = this.field9256;
            int var2 = this.field9269;
            int var3 = this.field9330;
            int var4 = this.field9316;
            this.method435();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3613((byte) 123);
            this.method3619(false, -6137);
            this.method3653(false, 1000);
            this.method3632((byte) -68, false);
            this.method3680(-107, false);
            this.method3630((class367) null, -2);
            this.method3679(-58, -2);
            this.method3603((byte) -34, 1);
            this.method3646(-2, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field9071, this.field9051, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method421(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IZI)V")
    public final void method3656(int arg0, boolean arg1, int arg2) {
        if (arg2 != 20961) {
            this.field9252 = -1.1769305F;
        }
        ++field9156;
        this.method3622(arg1, 87, arg0, true);
    }

    @OriginalMember(owner = "client!no", name = "l", descriptor = "()Z")
    public final boolean method430() {
        ++field9048;
        return false;
    }

    @OriginalMember(owner = "client!no", name = "f", descriptor = "(II)I")
    public final int method3657(int arg0, int arg1) {
        if (arg0 > -66) {
            return -82;
        } else {
            ++field9102;
            if (arg1 == 1) {
                return 7681;
            } else if (~arg1 == -1) {
                return 8448;
            } else if (~arg1 == -3) {
                return 34165;
            } else if (arg1 == 3) {
                return 260;
            } else if (arg1 == 4) {
                return 34023;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "i", descriptor = "()Z")
    public final boolean method452() {
        ++field9004;
        return true;
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(ILfb;)V")
    public final void method3658(int arg0, class632 arg1) {
        ++field9081;
        if (arg0 < -117) {
            if (!this.field9271) {
                if (~this.field9190 <= -1 && this.field9198[this.field9190] == arg1) {
                    this.field9198[this.field9190--] = null;
                    arg1.method617((byte) -121);
                    if (~this.field9190 <= -1) {
                        this.field9191 = this.field9197 = this.field9198[this.field9190];
                        this.field9191.method616(-27858);
                    } else {
                        this.field9191 = this.field9197 = null;
                    }
                } else {
                    throw new RuntimeException();
                }
            } else {
                this.method3648(arg1, (byte) -6);
                this.method3617(arg1, -1);
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "(B)V")
    private final void method3659(byte arg0) {
        ++field9118;
        if (~this.field9304 != -3) {
            this.field9304 = 2;
            this.method3650(0);
            this.method3645(34167);
            this.field9298 &= -8;
        }
        if (arg0 > -118) {
            this.method30();
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method3601(6001);
        ++field9049;
        this.method3646(-2, arg9);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!no", name = "f", descriptor = "(I)Li;")
    public final class37 method406(int arg0) {
        ++field9149;
        class186 var2 = new class186(arg0);
        this.field9189.method3265(var2, (byte) -98);
        return var2;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIILfa;II)V")
    public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class217 arg6, int arg7, int arg8) {
        ++field9134;
        class311 var10 = (class311) arg6;
        class340 var11 = var10.field4283;
        this.method3614(-10553);
        this.method3630(var10.field4283, -2);
        this.method3646(-2, arg5);
        this.method3644(8448, 23560, 7681);
        this.method3609((byte) 27, 768, 0, 34167);
        float var12 = var11.field4695 / (float) var11.field4693;
        float var13 = var11.field4701 / (float) var11.field4698;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var17 = var14 * var16;
        float var18 = var15 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (arg1 - arg8) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method3609((byte) 27, 768, 0, 5890);
    }

    @OriginalMember(owner = "client!no", name = "f", descriptor = "(B)V")
    public final void method3660(byte arg0) {
        if (arg0 != 42) {
            this.field9259 = 1.1171085F;
        }
        ++field9132;
        if (~this.field9298 != -9) {
            this.method3659((byte) -120);
            this.method3619(true, -6137);
            this.method3632((byte) -85, true);
            this.method3680(arg0 ^ -86, true);
            this.method3646(-2, 1);
            this.field9298 = 8;
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;I)V")
    public class658(Canvas arg0, class498 arg1, int arg2) {
        super(arg1);
        this.field9176 = arg2;
        this.field9026 = this.field9012 = arg0;
        if (!class275.method1669(0, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class275.method1669(0, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field9133 = new OpenGL();
                this.field8980 = this.field9022 = this.field9133.init(arg0, 8, 8, 8, 24, 0, this.field9176);
                if (~this.field9022 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method3643((byte) -124);
                    int var4 = this.method3610(false);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field9243 = this.field9272 ? 33639 : 5121;
                        if (this.field9287.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class572.method3141(this.field9287.replace('/', ' '), ' ', (byte) 12);
                            for (int var9 = 0; var8.length > var9; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (~var10.length() < -1) {
                                        if (var10.charAt(0) == 'x' && ~var10.length() <= -4 && class420.method2406(16036, var10.substring(1, 3))) {
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
                                            if (var10.length() >= 4 && class420.method2406(16036, var10.substring(0, 4))) {
                                                var5 = class664.method3730(var10.substring(0, 4), 122);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var16) {
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field9302 = false;
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && var5 <= 9250) {
                                    this.field9307 = false;
                                }
                                if (var5 >= 7000 && var5 <= 7999) {
                                    this.field9322 = false;
                                }
                            }
                            this.field9310 &= this.field9133.method3207("GL_ARB_half_float_pixel");
                            this.field9314 = true;
                            this.field9229 = this.field9322;
                        }
                        if (this.field9264.indexOf("intel") != -1) {
                            this.field9284 = false;
                        }
                        this.field9289 = !this.field9264.equals("s3 graphics");
                        if (this.field9322) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var14) {
                                throw new RuntimeException("");
                            }
                        }
                        class312.method1865(false, true, (byte) -128);
                        this.field9184 = true;
                        this.field9164 = new class258(this, super.field8808);
                        this.method3620(1);
                        this.field9188 = new class109(this);
                        this.field9170 = new class292(this);
                        if (this.field9170.method1804((byte) 117)) {
                            this.field9173 = new class123(this);
                            if (!this.field9173.method951(-79)) {
                                this.field9173.method957(-93);
                                this.field9173 = null;
                            }
                        }
                        this.field9178 = new class590(this);
                        this.method3669(74);
                        this.method3612(22488);
                        OpenGL.glClear(16640);
                        int var12 = 0;
                        while (true) {
                            try {
                                this.field9133.swapBuffers();
                                break;
                            } catch (Exception var15) {
                                if (var12++ > 5) {
                                    throw new RuntimeException("");
                                }
                                class486.method2722(0, 100L);
                            }
                        }
                        OpenGL.glClear(16384);
                    }
                }
            } catch (Throwable var17) {
                var17.printStackTrace();
                this.method56();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(IIIIII)Ldn;")
    public final class483 method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9124;
        return !this.field9222 ? null : new class438(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Ldn;)V")
    public final void method432(class483 arg0) {
        ++field9109;
        this.field9320 = (class585) arg0;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lgda;Lgda;Lgda;Lgda;I)V")
    public final void method3661(class51 arg0, class51 arg1, class51 arg2, class51 arg3, int arg4) {
        int var6 = -47 / ((15 - arg4) / 50);
        ++field9157;
        if (arg1 != null) {
            this.method3666(1, arg1.field710);
            OpenGL.glVertexPointer(arg1.field709, arg1.field714, this.field9301.method1325(32559), this.field9301.method1324(29632) - -((long) arg1.field711));
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        if (arg2 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method3666(1, arg2.field710);
            OpenGL.glNormalPointer(arg2.field714, this.field9301.method1325(32559), this.field9301.method1324(29632) - -((long) arg2.field711));
            OpenGL.glEnableClientState(32885);
        }
        if (arg0 != null) {
            this.method3666(1, arg0.field710);
            OpenGL.glColorPointer(arg0.field709, arg0.field714, this.field9301.method1325(32559), this.field9301.method1324(29632) - -((long) arg0.field711));
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg3 != null) {
            this.method3666(1, arg3.field710);
            OpenGL.glTexCoordPointer(arg3.field709, arg3.field714, this.field9301.method1325(32559), this.field9301.method1324(29632) - -((long) arg3.field711));
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V")
    public final void method382(boolean arg0) {
        ++field9143;
    }

    @OriginalMember(owner = "client!no", name = "x", descriptor = "(I)V")
    private final void method3662(int arg0) {
        if (arg0 != 32272) {
            this.method49((class483) null, (class483) null, 0.03676102F, (class483) null);
        }
        ++field9050;
        if (this.field9304 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field9071 < -1 && ~this.field9051 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field9071, (double) this.field9051, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field9298 &= -25;
            this.field9304 = 1;
        }
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(III)V")
    public final void method3663(int arg0, int arg1, int arg2) {
        this.field9260 = arg0;
        this.field9225 = arg2;
        if (arg1 == 32888) {
            ++field9101;
            this.method3674(2);
            this.method3684(-1);
        }
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "(III)Z")
    public static final boolean method3664(int arg0, int arg1, int arg2) {
        ++field9084;
        if (arg1 >= -85) {
            field9107 = 25;
        }
        return (arg2 & 384) != 0;
    }

    @OriginalMember(owner = "client!no", name = "sa", descriptor = "(II)V")
    public final void method450(int arg0, int arg1) {
        if (~this.field9326 != ~arg0 || this.field9303 != arg1) {
            this.field9303 = arg1;
            this.field9326 = arg0;
            this.method3624(4);
            this.method3607(true);
            if (this.field9304 != 3) {
                if (this.field9304 == 2) {
                    this.method3650(0);
                }
            } else {
                this.method3616(-12195);
            }
        }
        ++field9096;
    }

    @OriginalMember(owner = "client!no", name = "h", descriptor = "(Z)V")
    public static void method3665(boolean arg0) {
        field9155 = null;
        field9139 = null;
        if (!arg0) {
            method3665(false);
        }
    }

    @OriginalMember(owner = "client!no", name = "AA", descriptor = "(IIII)V")
    public final void method387(int arg0, int arg1, int arg2, int arg3) {
        this.field9300 = arg2;
        this.field9297 = arg0;
        this.field9329 = arg1;
        this.field9313 = true;
        this.field9315 = arg3;
        ++field8977;
        this.field9178.method3239(0, false, false, 0, 3, true);
        this.field9178.field7812.method1742(-64);
        this.method3607(true);
        this.method3636(true);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILgb;)V")
    public final void method3666(int arg0, class202 arg1) {
        ++field9020;
        if (arg0 != 1) {
            this.field9324 = 0.42221713F;
        }
        if (this.field9301 != arg1) {
            if (this.field9322) {
                OpenGL.glBindBufferARB(34962, arg1.method1323(-28332));
            }
            this.field9301 = arg1;
        }
    }

    @OriginalMember(owner = "client!no", name = "s", descriptor = "()F")
    public final float method3667() {
        ++field9179;
        return this.field9241;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lkga;[Lpga;Z)Lta;")
    public final class200 method389(class511 arg0, class500[] arg1, boolean arg2) {
        ++field9077;
        return new class523(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!no", name = "g", descriptor = "(B)V")
    private final void method3668(byte arg0) {
        if (arg0 < 74) {
            this.method422(17, 71, 87);
        }
        this.field9133.method3206();
        ++field9033;
    }

    @OriginalMember(owner = "client!no", name = "y", descriptor = "(I)V")
    private final void method3669(int arg0) {
        this.method3679(-103, -2);
        ++field9136;
        for (int var2 = this.field9237 + -1; var2 >= 0; --var2) {
            this.method3629((byte) 22, var2);
            this.method3630((class367) null, -2);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method3644(8448, 23560, 8448);
        this.method3609((byte) 27, 770, 2, 34168);
        this.method3606(128);
        this.field9268 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field9250 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        int var3 = -81 % ((arg0 - 9) / 37);
        this.field9266 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field9274 = true;
        this.method3619(true, -6137);
        this.method3653(true, 1000);
        this.method3632((byte) -46, true);
        this.method3680(-126, true);
        this.method3613((byte) 22);
        this.field9133.setSwapInterval(0);
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
        this.field9220 = this.field9296 = -1;
        this.method435();
    }

    @OriginalMember(owner = "client!no", name = "G", descriptor = "()F")
    public final float method3670() {
        ++field9117;
        return this.field9279;
    }

    @OriginalMember(owner = "client!no", name = "h", descriptor = "(B)V")
    private final void method3671(byte arg0) {
        ++field9127;
        class254.field3525[3] = 1.0F;
        class254.field3525[2] = this.field9324 * this.field9293;
        class254.field3525[0] = this.field9293 * this.field9239;
        class254.field3525[1] = this.field9293 * this.field9214;
        if (arg0 != 117) {
            this.field9178 = null;
        }
        OpenGL.glLightModelfv(2899, class254.field3525, 0);
    }

    @OriginalMember(owner = "client!no", name = "A", descriptor = "([I)V")
    public final void method433(int[] arg0) {
        arg0[0] = this.field9256;
        arg0[1] = this.field9330;
        arg0[2] = this.field9269;
        ++field9011;
        arg0[3] = this.field9316;
    }

    @OriginalMember(owner = "client!no", name = "w", descriptor = "()Z")
    public final boolean method396() {
        ++field9072;
        return true;
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(IIII)V")
    public final void method3672(int arg0, int arg1, int arg2, int arg3) {
        ++field9015;
        OpenGL.glTexEnvi(8960, arg1 + 34184, arg2);
        OpenGL.glTexEnvi(8960, arg1 + 34200, arg0);
        if (arg3 != -6491) {
            this.field9209 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "z", descriptor = "(I)V")
    public final void method3673(int arg0) {
        OpenGL.glPushMatrix();
        ++field9145;
        if (arg0 != 260) {
            this.field9232 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "A", descriptor = "(I)V")
    private final void method3674(int arg0) {
        if (arg0 != 2) {
            this.field9273 = true;
        }
        ++field9104;
        OpenGL.glViewport(this.field9225, this.field9260, this.field9071, this.field9051);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIII)V")
    public final void method51(int arg0, int arg1, int arg2, int arg3) {
        this.field9170.method1803(arg0, arg1, arg2, (byte) 33, arg3);
        ++field8988;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIZ)Lxa;")
    public final class468 method398(int arg0, int arg1, boolean arg2) {
        ++field8990;
        return new class141(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!no", name = "i", descriptor = "(B)V")
    private final void method3675(byte arg0) {
        if (this.field9241 != 0.0F) {
            float var2 = this.field9279 / (this.field9279 + this.field9241);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field9252 * (-var2 + 1.0F) / this.field9241;
            this.field9217[10] = this.field9218 + var4;
            this.field9217[14] = this.field9252 * var3;
        } else {
            this.field9217[14] = this.field9252;
            this.field9217[10] = this.field9218;
        }
        ++field9138;
        this.field9245 = (this.field9217[14] - (float) this.field9303) / this.field9217[10];
        this.field9265 = (float) this.field9303 + -this.field9241;
        if (arg0 < 76) {
            this.method457(-68);
        }
    }

    @OriginalMember(owner = "client!no", name = "B", descriptor = "(I)V")
    public final void method3676(int arg0) {
        if (this.field9298 != 16) {
            this.method3654(3);
            this.method3619(true, -6137);
            this.method3632((byte) 54, true);
            this.method3680(-115, true);
            this.method3646(-2, 1);
            this.field9298 = 16;
        }
        ++field9167;
        int var2 = -3 % ((87 - arg0) / 36);
    }

    @OriginalMember(owner = "client!no", name = "Q", descriptor = "(IIII)V")
    public final void method459(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field9256 > ~arg0) {
            this.field9256 = arg0;
        }
        if (~this.field9269 < ~arg2) {
            this.field9269 = arg2;
        }
        if (~this.field9316 < ~arg3) {
            this.field9316 = arg3;
        }
        ++field9070;
        if (~this.field9330 > ~arg1) {
            this.field9330 = arg1;
        }
        OpenGL.glEnable(3089);
        this.method3652(-121);
        this.method3684(-1);
    }

    @OriginalMember(owner = "client!no", name = "m", descriptor = "()V")
    public final void method56() {
        ++field9024;
        for (class504 var1 = this.field9189.method3257(-7); var1 != null; var1 = this.field9189.method3263((byte) -79)) {
            ((class186) var1).method1228(-3);
        }
        if (this.field9170 != null) {
            this.field9170.method1800((byte) 106);
        }
        if (this.field9133 != null) {
            this.method3668((byte) 93);
            Enumeration var2 = this.field9082.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field9082.get(var3);
                this.field9133.releaseSurface(var3, var4);
            }
            this.field9133.release();
            this.field9133 = null;
        }
        if (this.field9184) {
            class340.method2063(0, false, true);
            this.field9184 = false;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(FBFF)V")
    private final void method3677(float arg0, byte arg1, float arg2, float arg3) {
        OpenGL.glMatrixMode(5890);
        if (arg1 > -89) {
            this.method3632((byte) 122, false);
        }
        ++field9100;
        if (this.field9231) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg3, arg2, arg0);
        OpenGL.glMatrixMode(5888);
        this.field9231 = true;
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(I)V")
    public final void method425(int arg0) {
        this.method3643((byte) -124);
        ++field9044;
    }

    @OriginalMember(owner = "client!no", name = "na", descriptor = "(III[I)V")
    public final void method438(int arg0, int arg1, int arg2, int[] arg3) {
        ++field9034;
        float var5 = (float) arg2 * this.field9276.field9883 + (float) arg0 * this.field9276.field9856 + (float) arg1 * this.field9276.field9858 + this.field9276.field9868;
        if (!((float) this.field9326 > var5) && !(var5 > (float) this.field9303)) {
            int var6 = (int) (((float) arg2 * this.field9276.field9860 + (float) arg0 * this.field9276.field9878 + (float) arg1 * this.field9276.field9881 + this.field9276.field9874) * (float) this.field9295 / var5);
            int var7 = (int) (((float) arg2 * this.field9276.field9861 + (float) arg0 * this.field9276.field9887 + (float) arg1 * this.field9276.field9884 + this.field9276.field9863) * (float) this.field9306 / var5);
            if (this.field9327 <= (float) var6 && this.field9261 >= (float) var6 && this.field9312 <= (float) var7 && (float) var7 <= this.field9323) {
                arg3[0] = (int) ((float) var6 + -this.field9327);
                arg3[1] = (int) ((float) var7 + -this.field9312);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!no", name = "C", descriptor = "(I)V")
    private final void method3678(int arg0) {
        if (arg0 != 128) {
            this.method379(-47, -106, 39, -85, -72);
        }
        ++field9116;
        OpenGL.glDepthMask(this.field9246 && this.field9263);
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(IIIIII)V")
    public final void method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9131;
        this.method3601(6001);
        this.method3646(-2, arg5);
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var7 * var9;
        float var11 = var8 * var9;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var10 + 0.35F, (float) arg3 + var11 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!no", name = "aa", descriptor = "()I")
    public final int method412() {
        ++field9037;
        int var1 = this.field9338;
        this.field9338 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!no", name = "g", descriptor = "(II)V")
    public final void method3679(int arg0, int arg1) {
        ++field9054;
        if (arg0 >= -28) {
            this.method3627(true, 15);
        }
        this.method3656(arg1, true, 20961);
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(II)I")
    public final int method376(int arg0, int arg1) {
        ++field9119;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IZ)V")
    public final void method3680(int arg0, boolean arg1) {
        if (arg0 > -93) {
            this.method3611((class60) null, 121);
        }
        ++field9137;
        if (!arg1 != !this.field9246) {
            this.field9246 = arg1;
            this.method3678(128);
            this.field9298 &= -32;
        }
    }

    @OriginalMember(owner = "client!no", name = "E", descriptor = "(I)V")
    public final void method3681(int arg0) {
        if (arg0 == 34166) {
            ++field9086;
            OpenGL.glPopMatrix();
        }
    }

    @OriginalMember(owner = "client!no", name = "j", descriptor = "()V")
    public final void method38() {
        ++field9076;
        this.method3680(-117, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!no", name = "h", descriptor = "(II)I")
    public final int method3682(int arg0, int arg1) {
        ++field8997;
        if (arg1 < 87) {
            this.field9199 = null;
        }
        if (arg0 != 6406 && ~arg0 != -6410) {
            if (arg0 != 6410 && ~arg0 != -34847 && ~arg0 != -34845) {
                if (arg0 == 6407) {
                    return 3;
                } else if (arg0 != 6408 && arg0 != 34847) {
                    if (arg0 == 34843) {
                        return 6;
                    } else if (~arg0 == -34843) {
                        return 8;
                    } else if (arg0 == 6402) {
                        return 3;
                    } else if (arg0 == 6401) {
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

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public final class139 method402(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field9065;
        return new class262(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!no", name = "KA", descriptor = "(IIII)[I")
    public final int[] method106(int arg0, int arg1, int arg2, int arg3) {
        ++field9168;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + -var6 + this.field9051, arg2, 1, 32993, this.field9243, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "([Lba;Lc;Lq;[Lot;I)V")
    public final void method429(class358[] arg0, class174 arg1, class397 arg2, class552[] arg3, int arg4) {
        ++field9067;
        this.method418(arg0, arg2, arg3, arg4);
        this.method465(arg1);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BII)V")
    public final synchronized void method3683(byte arg0, int arg1, int arg2) {
        if (arg0 != 106) {
            this.field9332 = -99;
        }
        ++field9142;
        class704 var4 = new class704(arg1);
        var4.field6724 = (long) arg2;
        this.field9210.method3265(var4, (byte) -124);
    }

    @OriginalMember(owner = "client!no", name = "n", descriptor = "()V")
    public final void method29() {
        ++field9165;
        this.field9170.method1796((byte) 109);
    }

    @OriginalMember(owner = "client!no", name = "F", descriptor = "(I)V")
    private final void method3684(int arg0) {
        ++field8983;
        if (arg0 != -1) {
            this.method104();
        }
        if (~this.field9256 >= ~this.field9269 && this.field9316 >= this.field9330) {
            OpenGL.glScissor(this.field9256 + this.field9225, this.field9260 + this.field9051 + -this.field9316, this.field9269 - this.field9256, -this.field9330 + this.field9316);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(FFIFF)V")
    public final void method3685(float arg0, float arg1, int arg2, float arg3, float arg4) {
        class254.field3525[3] = arg0;
        class254.field3525[2] = arg1;
        ++field9075;
        class254.field3525[0] = arg3;
        class254.field3525[arg2] = arg4;
        OpenGL.glTexEnvfv(8960, 8705, class254.field3525, 0);
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(Z)V")
    public final void method407(boolean arg0) {
        this.field9263 = arg0;
        ++field9057;
        this.method3678(128);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIII)V")
    public final void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9006;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        this.method3601(6001);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method3646(-2, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field9286) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field9286) {
            OpenGL.glEnable(32925);
        }
    }
}
