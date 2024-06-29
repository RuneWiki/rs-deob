import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;
import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public abstract class class651 extends class562 {

    @OriginalMember(owner = "client!qq", name = "vc", descriptor = "Lwo;")
    private class445 field9088 = new class445();

    @OriginalMember(owner = "client!qq", name = "Td", descriptor = "Z")
    public boolean field9164 = true;

    @OriginalMember(owner = "client!qq", name = "Vd", descriptor = "Lmh;")
    public class149 field9166 = new class149();

    @OriginalMember(owner = "client!qq", name = "ae", descriptor = "Lmh;")
    public class149 field9171 = new class149();

    @OriginalMember(owner = "client!qq", name = "be", descriptor = "Lmh;")
    public class149 field9172 = new class149();

    @OriginalMember(owner = "client!qq", name = "ce", descriptor = "Lmh;")
    public class149 field9173 = new class149();

    @OriginalMember(owner = "client!qq", name = "de", descriptor = "Lmh;")
    private class149 field9174 = new class149();

    @OriginalMember(owner = "client!qq", name = "ee", descriptor = "Lmh;")
    private class149 field9175 = new class149();

    @OriginalMember(owner = "client!qq", name = "re", descriptor = "I")
    private int field9188 = -1;

    @OriginalMember(owner = "client!qq", name = "ve", descriptor = "I")
    public int field9192 = 128;

    @OriginalMember(owner = "client!qq", name = "Oe", descriptor = "Z")
    public boolean field9211 = true;

    @OriginalMember(owner = "client!qq", name = "Be", descriptor = "I")
    public int field9198 = 512;

    @OriginalMember(owner = "client!qq", name = "qe", descriptor = "Z")
    private boolean field9187 = false;

    @OriginalMember(owner = "client!qq", name = "ue", descriptor = "[F")
    private float[] field9191 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!qq", name = "je", descriptor = "I")
    public int field9180 = 0;

    @OriginalMember(owner = "client!qq", name = "bf", descriptor = "I")
    public int field9224 = 3584;

    @OriginalMember(owner = "client!qq", name = "ff", descriptor = "[F")
    private float[] field9228 = new float[16];

    @OriginalMember(owner = "client!qq", name = "ie", descriptor = "F")
    public float field9179 = 3584.0F;

    @OriginalMember(owner = "client!qq", name = "Le", descriptor = "I")
    private int field9208 = -1;

    @OriginalMember(owner = "client!qq", name = "Ve", descriptor = "[F")
    private float[] field9218 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!qq", name = "lf", descriptor = "I")
    private int field9233 = 0;

    @OriginalMember(owner = "client!qq", name = "ze", descriptor = "I")
    private int field9196 = 0;

    @OriginalMember(owner = "client!qq", name = "Qe", descriptor = "Z")
    private boolean field9213 = false;

    @OriginalMember(owner = "client!qq", name = "qf", descriptor = "F")
    public float field9238 = -1.0F;

    @OriginalMember(owner = "client!qq", name = "rf", descriptor = "[F")
    public float[] field9239 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!qq", name = "mf", descriptor = "I")
    private int field9234 = 1;

    @OriginalMember(owner = "client!qq", name = "pe", descriptor = "Z")
    private boolean field9186 = false;

    @OriginalMember(owner = "client!qq", name = "sf", descriptor = "I")
    public int field9240 = 0;

    @OriginalMember(owner = "client!qq", name = "Pe", descriptor = "I")
    public int field9212 = 0;

    @OriginalMember(owner = "client!qq", name = "Xe", descriptor = "I")
    public int field9220 = 0;

    @OriginalMember(owner = "client!qq", name = "Ne", descriptor = "Z")
    private boolean field9210 = false;

    @OriginalMember(owner = "client!qq", name = "De", descriptor = "[F")
    private float[] field9200 = new float[16];

    @OriginalMember(owner = "client!qq", name = "nf", descriptor = "Luda;")
    public class549 field9235 = class24.field282;

    @OriginalMember(owner = "client!qq", name = "Se", descriptor = "I")
    public int field9215 = 50;

    @OriginalMember(owner = "client!qq", name = "cf", descriptor = "F")
    public float field9225 = 3584.0F;

    @OriginalMember(owner = "client!qq", name = "Re", descriptor = "Z")
    private boolean field9214 = false;

    @OriginalMember(owner = "client!qq", name = "Ef", descriptor = "I")
    public int field9252 = 512;

    @OriginalMember(owner = "client!qq", name = "Bf", descriptor = "I")
    private int field9249 = 0;

    @OriginalMember(owner = "client!qq", name = "af", descriptor = "F")
    public float field9223 = 1.0F;

    @OriginalMember(owner = "client!qq", name = "Gf", descriptor = "F")
    public float field9254 = 1.0F;

    @OriginalMember(owner = "client!qq", name = "Ae", descriptor = "Z")
    public boolean field9197 = false;

    @OriginalMember(owner = "client!qq", name = "If", descriptor = "I")
    public int field9256 = 0;

    @OriginalMember(owner = "client!qq", name = "ne", descriptor = "I")
    public int field9184 = 0;

    @OriginalMember(owner = "client!qq", name = "Ff", descriptor = "I")
    public int field9253 = 0;

    @OriginalMember(owner = "client!qq", name = "of", descriptor = "I")
    public int field9236 = 3;

    @OriginalMember(owner = "client!qq", name = "jf", descriptor = "Z")
    public boolean field9231 = false;

    @OriginalMember(owner = "client!qq", name = "Ge", descriptor = "Z")
    public boolean field9203 = false;

    @OriginalMember(owner = "client!qq", name = "Ye", descriptor = "Z")
    private boolean field9221 = false;

    @OriginalMember(owner = "client!qq", name = "Pf", descriptor = "F")
    public float field9263 = 1.0F;

    @OriginalMember(owner = "client!qq", name = "Mf", descriptor = "I")
    public int field9260 = -1;

    @OriginalMember(owner = "client!qq", name = "Nf", descriptor = "I")
    public int field9261 = 0;

    @OriginalMember(owner = "client!qq", name = "Lf", descriptor = "I")
    private int field9259 = -1;

    @OriginalMember(owner = "client!qq", name = "Vf", descriptor = "I")
    public int field9269 = -1;

    @OriginalMember(owner = "client!qq", name = "hf", descriptor = "[F")
    public float[] field9230 = this.field9191;

    @OriginalMember(owner = "client!qq", name = "Fe", descriptor = "Z")
    public boolean field9202 = true;

    @OriginalMember(owner = "client!qq", name = "Sf", descriptor = "[F")
    public float[] field9266 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!qq", name = "ke", descriptor = "Z")
    public boolean field9181 = true;

    @OriginalMember(owner = "client!qq", name = "Kf", descriptor = "I")
    public int field9258 = 8;

    @OriginalMember(owner = "client!qq", name = "zf", descriptor = "I")
    public int field9247 = 0;

    @OriginalMember(owner = "client!qq", name = "pf", descriptor = "F")
    private float field9237 = 1.0F;

    @OriginalMember(owner = "client!qq", name = "Cf", descriptor = "I")
    public int field9250 = 0;

    @OriginalMember(owner = "client!qq", name = "vf", descriptor = "[Lft;")
    private class555[] field9243 = new class555[10];

    @OriginalMember(owner = "client!qq", name = "Wf", descriptor = "I")
    private int field9270 = 0;

    @OriginalMember(owner = "client!qq", name = "Tf", descriptor = "[F")
    private float[] field9267 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!qq", name = "me", descriptor = "F")
    public float field9183 = 1.0F;

    @OriginalMember(owner = "client!qq", name = "Xf", descriptor = "[F")
    private float[] field9271 = new float[16];

    @OriginalMember(owner = "client!qq", name = "wf", descriptor = "F")
    public float field9244 = -1.0F;

    @OriginalMember(owner = "client!qq", name = "Rf", descriptor = "Z")
    public boolean field9265 = false;

    @OriginalMember(owner = "client!qq", name = "Zf", descriptor = "Lmt;")
    public class680 field9273 = class177.field2496;

    @OriginalMember(owner = "client!qq", name = "Uf", descriptor = "Z")
    public boolean field9268 = true;

    @OriginalMember(owner = "client!qq", name = "bg", descriptor = "Z")
    public boolean field9275 = true;

    @OriginalMember(owner = "client!qq", name = "cg", descriptor = "I")
    private int field9276 = 16777215;

    @OriginalMember(owner = "client!qq", name = "fe", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9176 = new Stream();

    @OriginalMember(owner = "client!qq", name = "dg", descriptor = "Lmh;")
    private class149 field9277 = new class149();

    @OriginalMember(owner = "client!qq", name = "jd", descriptor = "Lga;")
    public class332 field9128;

    @OriginalMember(owner = "client!qq", name = "xe", descriptor = "I")
    public int field9194;

    @OriginalMember(owner = "client!qq", name = "Xc", descriptor = "Ljava/awt/Canvas;")
    public Canvas field9116;

    @OriginalMember(owner = "client!qq", name = "Ib", descriptor = "Ljava/awt/Canvas;")
    private Canvas field9049;

    @OriginalMember(owner = "client!qq", name = "wd", descriptor = "Ljava/lang/Object;")
    public Object field9141;

    @OriginalMember(owner = "client!qq", name = "Rd", descriptor = "Ljava/lang/Object;")
    private Object field9162;

    @OriginalMember(owner = "client!qq", name = "Hb", descriptor = "I")
    private int field9048;

    @OriginalMember(owner = "client!qq", name = "Yc", descriptor = "I")
    public int field9117;

    @OriginalMember(owner = "client!qq", name = "db", descriptor = "I")
    private int field9018;

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "I")
    public int field8997;

    @OriginalMember(owner = "client!qq", name = "Of", descriptor = "I")
    public int field9262;

    @OriginalMember(owner = "client!qq", name = "df", descriptor = "Ltu;")
    private class10 field9226;

    @OriginalMember(owner = "client!qq", name = "ub", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field9035;

    @OriginalMember(owner = "client!qq", name = "Db", descriptor = "[I")
    public static int[] field9044 = new int[1000];

    @OriginalMember(owner = "client!qq", name = "qb", descriptor = "I")
    public static int field9031 = 1337;

    @OriginalMember(owner = "client!qq", name = "oc", descriptor = "[F")
    public static float[] field9081 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!qq", name = "se", descriptor = "F")
    private float field9189;

    @OriginalMember(owner = "client!qq", name = "we", descriptor = "F")
    public float field9193;

    @OriginalMember(owner = "client!qq", name = "ye", descriptor = "F")
    public float field9195;

    @OriginalMember(owner = "client!qq", name = "Je", descriptor = "F")
    private float field9206;

    @OriginalMember(owner = "client!qq", name = "tf", descriptor = "F")
    public float field9241;

    @OriginalMember(owner = "client!qq", name = "Df", descriptor = "F")
    public float field9251;

    @OriginalMember(owner = "client!qq", name = "Hf", descriptor = "F")
    public float field9255;

    @OriginalMember(owner = "client!qq", name = "ag", descriptor = "F")
    public float field9274;

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "I")
    public static int field8979;

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "I")
    public static int field8980;

    @OriginalMember(owner = "client!qq", name = "s", descriptor = "I")
    public static int field8981;

    @OriginalMember(owner = "client!qq", name = "t", descriptor = "I")
    public static int field8982;

    @OriginalMember(owner = "client!qq", name = "u", descriptor = "I")
    public static int field8983;

    @OriginalMember(owner = "client!qq", name = "v", descriptor = "I")
    public static int field8984;

    @OriginalMember(owner = "client!qq", name = "w", descriptor = "I")
    public static int field8985;

    @OriginalMember(owner = "client!qq", name = "x", descriptor = "I")
    public static int field8986;

    @OriginalMember(owner = "client!qq", name = "y", descriptor = "I")
    public static int field8987;

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "I")
    public static int field8988;

    @OriginalMember(owner = "client!qq", name = "A", descriptor = "I")
    public static int field8989;

    @OriginalMember(owner = "client!qq", name = "B", descriptor = "I")
    public static int field8990;

    @OriginalMember(owner = "client!qq", name = "C", descriptor = "I")
    public static int field8991;

    @OriginalMember(owner = "client!qq", name = "D", descriptor = "I")
    public static int field8992;

    @OriginalMember(owner = "client!qq", name = "E", descriptor = "I")
    public static int field8993;

    @OriginalMember(owner = "client!qq", name = "F", descriptor = "I")
    public static int field8994;

    @OriginalMember(owner = "client!qq", name = "G", descriptor = "I")
    public static int field8995;

    @OriginalMember(owner = "client!qq", name = "H", descriptor = "I")
    public static int field8996;

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
    public static int field8998;

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "I")
    public static int field8999;

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "I")
    public static int field9000;

    @OriginalMember(owner = "client!qq", name = "M", descriptor = "I")
    public static int field9001;

    @OriginalMember(owner = "client!qq", name = "N", descriptor = "I")
    public static int field9002;

    @OriginalMember(owner = "client!qq", name = "O", descriptor = "I")
    public static int field9003;

    @OriginalMember(owner = "client!qq", name = "P", descriptor = "I")
    public static int field9004;

    @OriginalMember(owner = "client!qq", name = "Q", descriptor = "I")
    public static int field9005;

    @OriginalMember(owner = "client!qq", name = "R", descriptor = "I")
    public static int field9006;

    @OriginalMember(owner = "client!qq", name = "S", descriptor = "I")
    public static int field9007;

    @OriginalMember(owner = "client!qq", name = "T", descriptor = "I")
    public static int field9008;

    @OriginalMember(owner = "client!qq", name = "U", descriptor = "I")
    public static int field9009;

    @OriginalMember(owner = "client!qq", name = "V", descriptor = "I")
    public static int field9010;

    @OriginalMember(owner = "client!qq", name = "W", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!qq", name = "X", descriptor = "I")
    public static int field9012;

    @OriginalMember(owner = "client!qq", name = "Y", descriptor = "I")
    public static int field9013;

    @OriginalMember(owner = "client!qq", name = "Z", descriptor = "I")
    public static int field9014;

    @OriginalMember(owner = "client!qq", name = "ab", descriptor = "I")
    public static int field9015;

    @OriginalMember(owner = "client!qq", name = "bb", descriptor = "I")
    public static int field9016;

    @OriginalMember(owner = "client!qq", name = "cb", descriptor = "I")
    public static int field9017;

    @OriginalMember(owner = "client!qq", name = "eb", descriptor = "I")
    public static int field9019;

    @OriginalMember(owner = "client!qq", name = "fb", descriptor = "I")
    public static int field9020;

    @OriginalMember(owner = "client!qq", name = "gb", descriptor = "I")
    public static int field9021;

    @OriginalMember(owner = "client!qq", name = "hb", descriptor = "I")
    public static int field9022;

    @OriginalMember(owner = "client!qq", name = "ib", descriptor = "I")
    public static int field9023;

    @OriginalMember(owner = "client!qq", name = "jb", descriptor = "I")
    public static int field9024;

    @OriginalMember(owner = "client!qq", name = "lb", descriptor = "I")
    public static int field9026;

    @OriginalMember(owner = "client!qq", name = "mb", descriptor = "I")
    public static int field9027;

    @OriginalMember(owner = "client!qq", name = "nb", descriptor = "I")
    public static int field9028;

    @OriginalMember(owner = "client!qq", name = "ob", descriptor = "I")
    public static int field9029;

    @OriginalMember(owner = "client!qq", name = "pb", descriptor = "I")
    public static int field9030;

    @OriginalMember(owner = "client!qq", name = "rb", descriptor = "I")
    public static int field9032;

    @OriginalMember(owner = "client!qq", name = "sb", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!qq", name = "tb", descriptor = "I")
    public static int field9034;

    @OriginalMember(owner = "client!qq", name = "vb", descriptor = "I")
    public static int field9036;

    @OriginalMember(owner = "client!qq", name = "wb", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!qq", name = "xb", descriptor = "I")
    public static int field9038;

    @OriginalMember(owner = "client!qq", name = "yb", descriptor = "I")
    public static int field9039;

    @OriginalMember(owner = "client!qq", name = "zb", descriptor = "I")
    public static int field9040;

    @OriginalMember(owner = "client!qq", name = "Ab", descriptor = "I")
    public static int field9041;

    @OriginalMember(owner = "client!qq", name = "Bb", descriptor = "I")
    public static int field9042;

    @OriginalMember(owner = "client!qq", name = "Cb", descriptor = "I")
    public static int field9043;

    @OriginalMember(owner = "client!qq", name = "Eb", descriptor = "I")
    public static int field9045;

    @OriginalMember(owner = "client!qq", name = "Fb", descriptor = "I")
    public static int field9046;

    @OriginalMember(owner = "client!qq", name = "Gb", descriptor = "I")
    public static int field9047;

    @OriginalMember(owner = "client!qq", name = "Jb", descriptor = "I")
    public static int field9050;

    @OriginalMember(owner = "client!qq", name = "Kb", descriptor = "I")
    public static int field9051;

    @OriginalMember(owner = "client!qq", name = "Lb", descriptor = "I")
    public static int field9052;

    @OriginalMember(owner = "client!qq", name = "Mb", descriptor = "I")
    public static int field9053;

    @OriginalMember(owner = "client!qq", name = "Nb", descriptor = "I")
    public static int field9054;

    @OriginalMember(owner = "client!qq", name = "Ob", descriptor = "I")
    public static int field9055;

    @OriginalMember(owner = "client!qq", name = "Pb", descriptor = "I")
    public static int field9056;

    @OriginalMember(owner = "client!qq", name = "Qb", descriptor = "I")
    public static int field9057;

    @OriginalMember(owner = "client!qq", name = "Rb", descriptor = "I")
    public static int field9058;

    @OriginalMember(owner = "client!qq", name = "Sb", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!qq", name = "Tb", descriptor = "I")
    public static int field9060;

    @OriginalMember(owner = "client!qq", name = "Ub", descriptor = "I")
    public static int field9061;

    @OriginalMember(owner = "client!qq", name = "Vb", descriptor = "I")
    public static int field9062;

    @OriginalMember(owner = "client!qq", name = "Wb", descriptor = "I")
    public static int field9063;

    @OriginalMember(owner = "client!qq", name = "Xb", descriptor = "I")
    public static int field9064;

    @OriginalMember(owner = "client!qq", name = "Yb", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!qq", name = "ac", descriptor = "I")
    public static int field9067;

    @OriginalMember(owner = "client!qq", name = "bc", descriptor = "I")
    public static int field9068;

    @OriginalMember(owner = "client!qq", name = "cc", descriptor = "I")
    public static int field9069;

    @OriginalMember(owner = "client!qq", name = "dc", descriptor = "I")
    public static int field9070;

    @OriginalMember(owner = "client!qq", name = "ec", descriptor = "I")
    public static int field9071;

    @OriginalMember(owner = "client!qq", name = "fc", descriptor = "I")
    public static int field9072;

    @OriginalMember(owner = "client!qq", name = "gc", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!qq", name = "hc", descriptor = "I")
    public static int field9074;

    @OriginalMember(owner = "client!qq", name = "ic", descriptor = "I")
    public static int field9075;

    @OriginalMember(owner = "client!qq", name = "jc", descriptor = "I")
    public static int field9076;

    @OriginalMember(owner = "client!qq", name = "kc", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!qq", name = "lc", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!qq", name = "mc", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!qq", name = "nc", descriptor = "I")
    public static int field9080;

    @OriginalMember(owner = "client!qq", name = "pc", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!qq", name = "qc", descriptor = "I")
    public static int field9083;

    @OriginalMember(owner = "client!qq", name = "rc", descriptor = "I")
    public static int field9084;

    @OriginalMember(owner = "client!qq", name = "sc", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!qq", name = "tc", descriptor = "I")
    public static int field9086;

    @OriginalMember(owner = "client!qq", name = "uc", descriptor = "I")
    public static int field9087;

    @OriginalMember(owner = "client!qq", name = "wc", descriptor = "I")
    public static int field9089;

    @OriginalMember(owner = "client!qq", name = "xc", descriptor = "I")
    public static int field9090;

    @OriginalMember(owner = "client!qq", name = "yc", descriptor = "I")
    public static int field9091;

    @OriginalMember(owner = "client!qq", name = "zc", descriptor = "I")
    public static int field9092;

    @OriginalMember(owner = "client!qq", name = "Ac", descriptor = "I")
    public static int field9093;

    @OriginalMember(owner = "client!qq", name = "Bc", descriptor = "I")
    public static int field9094;

    @OriginalMember(owner = "client!qq", name = "Dc", descriptor = "I")
    public static int field9096;

    @OriginalMember(owner = "client!qq", name = "Ec", descriptor = "I")
    public static int field9097;

    @OriginalMember(owner = "client!qq", name = "Fc", descriptor = "I")
    public static int field9098;

    @OriginalMember(owner = "client!qq", name = "Gc", descriptor = "I")
    public static int field9099;

    @OriginalMember(owner = "client!qq", name = "Ic", descriptor = "I")
    public static int field9101;

    @OriginalMember(owner = "client!qq", name = "Jc", descriptor = "I")
    public static int field9102;

    @OriginalMember(owner = "client!qq", name = "Kc", descriptor = "I")
    public static int field9103;

    @OriginalMember(owner = "client!qq", name = "Lc", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!qq", name = "Mc", descriptor = "I")
    public static int field9105;

    @OriginalMember(owner = "client!qq", name = "Nc", descriptor = "I")
    public static int field9106;

    @OriginalMember(owner = "client!qq", name = "Oc", descriptor = "I")
    public static int field9107;

    @OriginalMember(owner = "client!qq", name = "Pc", descriptor = "I")
    public static int field9108;

    @OriginalMember(owner = "client!qq", name = "Qc", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!qq", name = "Rc", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!qq", name = "Sc", descriptor = "I")
    public static int field9111;

    @OriginalMember(owner = "client!qq", name = "Tc", descriptor = "I")
    public static int field9112;

    @OriginalMember(owner = "client!qq", name = "Uc", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!qq", name = "Vc", descriptor = "I")
    public static int field9114;

    @OriginalMember(owner = "client!qq", name = "Wc", descriptor = "I")
    public static int field9115;

    @OriginalMember(owner = "client!qq", name = "Zc", descriptor = "I")
    public static int field9118;

    @OriginalMember(owner = "client!qq", name = "ad", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!qq", name = "bd", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!qq", name = "cd", descriptor = "I")
    public static int field9121;

    @OriginalMember(owner = "client!qq", name = "dd", descriptor = "I")
    public static int field9122;

    @OriginalMember(owner = "client!qq", name = "ed", descriptor = "I")
    public static int field9123;

    @OriginalMember(owner = "client!qq", name = "fd", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!qq", name = "gd", descriptor = "I")
    public static int field9125;

    @OriginalMember(owner = "client!qq", name = "hd", descriptor = "I")
    public static int field9126;

    @OriginalMember(owner = "client!qq", name = "id", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!qq", name = "kd", descriptor = "I")
    public static int field9129;

    @OriginalMember(owner = "client!qq", name = "ld", descriptor = "I")
    public static int field9130;

    @OriginalMember(owner = "client!qq", name = "md", descriptor = "I")
    public static int field9131;

    @OriginalMember(owner = "client!qq", name = "nd", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!qq", name = "pd", descriptor = "I")
    public static int field9134;

    @OriginalMember(owner = "client!qq", name = "qd", descriptor = "I")
    public static int field9135;

    @OriginalMember(owner = "client!qq", name = "rd", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!qq", name = "sd", descriptor = "I")
    public static int field9137;

    @OriginalMember(owner = "client!qq", name = "td", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!qq", name = "vd", descriptor = "I")
    public static int field9140;

    @OriginalMember(owner = "client!qq", name = "xd", descriptor = "I")
    public static int field9142;

    @OriginalMember(owner = "client!qq", name = "yd", descriptor = "I")
    public static int field9143;

    @OriginalMember(owner = "client!qq", name = "zd", descriptor = "I")
    public static int field9144;

    @OriginalMember(owner = "client!qq", name = "Ad", descriptor = "I")
    public static int field9145;

    @OriginalMember(owner = "client!qq", name = "Bd", descriptor = "I")
    public static int field9146;

    @OriginalMember(owner = "client!qq", name = "Cd", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!qq", name = "Dd", descriptor = "I")
    public static int field9148;

    @OriginalMember(owner = "client!qq", name = "Ed", descriptor = "I")
    public static int field9149;

    @OriginalMember(owner = "client!qq", name = "Fd", descriptor = "I")
    public static int field9150;

    @OriginalMember(owner = "client!qq", name = "Gd", descriptor = "I")
    public static int field9151;

    @OriginalMember(owner = "client!qq", name = "Hd", descriptor = "I")
    public static int field9152;

    @OriginalMember(owner = "client!qq", name = "Id", descriptor = "I")
    public static int field9153;

    @OriginalMember(owner = "client!qq", name = "Jd", descriptor = "I")
    public static int field9154;

    @OriginalMember(owner = "client!qq", name = "Kd", descriptor = "I")
    public static int field9155;

    @OriginalMember(owner = "client!qq", name = "Ld", descriptor = "I")
    public static int field9156;

    @OriginalMember(owner = "client!qq", name = "Md", descriptor = "I")
    public static int field9157;

    @OriginalMember(owner = "client!qq", name = "Nd", descriptor = "I")
    public static int field9158;

    @OriginalMember(owner = "client!qq", name = "Od", descriptor = "I")
    public static int field9159;

    @OriginalMember(owner = "client!qq", name = "Pd", descriptor = "I")
    public static int field9160;

    @OriginalMember(owner = "client!qq", name = "Qd", descriptor = "I")
    public static int field9161;

    @OriginalMember(owner = "client!qq", name = "Sd", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!qq", name = "Ud", descriptor = "I")
    public static int field9165;

    @OriginalMember(owner = "client!qq", name = "Wd", descriptor = "I")
    public int field9167;

    @OriginalMember(owner = "client!qq", name = "Xd", descriptor = "I")
    public int field9168;

    @OriginalMember(owner = "client!qq", name = "Yd", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!qq", name = "Zd", descriptor = "I")
    public int field9170;

    @OriginalMember(owner = "client!qq", name = "ge", descriptor = "I")
    public int field9177;

    @OriginalMember(owner = "client!qq", name = "le", descriptor = "I")
    public int field9182;

    @OriginalMember(owner = "client!qq", name = "Ke", descriptor = "I")
    private int field9207;

    @OriginalMember(owner = "client!qq", name = "Me", descriptor = "I")
    private int field9209;

    @OriginalMember(owner = "client!qq", name = "Ue", descriptor = "I")
    public int field9217;

    @OriginalMember(owner = "client!qq", name = "We", descriptor = "I")
    public int field9219;

    @OriginalMember(owner = "client!qq", name = "Ze", descriptor = "I")
    public int field9222;

    @OriginalMember(owner = "client!qq", name = "gf", descriptor = "I")
    public int field9229;

    @OriginalMember(owner = "client!qq", name = "xf", descriptor = "I")
    public int field9245;

    @OriginalMember(owner = "client!qq", name = "Jf", descriptor = "I")
    public int field9257;

    @OriginalMember(owner = "client!qq", name = "xg", descriptor = "I")
    private int field9297;

    @OriginalMember(owner = "client!qq", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!qq", name = "gg", descriptor = "Lum;")
    public class109 field9280;

    @OriginalMember(owner = "client!qq", name = "ig", descriptor = "Lum;")
    private class109 field9282;

    @OriginalMember(owner = "client!qq", name = "kg", descriptor = "Lum;")
    private class109 field9284;

    @OriginalMember(owner = "client!qq", name = "mg", descriptor = "Lum;")
    public class109 field9286;

    @OriginalMember(owner = "client!qq", name = "rg", descriptor = "Lum;")
    public class109 field9291;

    @OriginalMember(owner = "client!qq", name = "wg", descriptor = "Lum;")
    public class109 field9296;

    @OriginalMember(owner = "client!qq", name = "fg", descriptor = "Ldw;")
    public class123 field9279;

    @OriginalMember(owner = "client!qq", name = "hg", descriptor = "Ldw;")
    public class123 field9281;

    @OriginalMember(owner = "client!qq", name = "jg", descriptor = "Ldw;")
    public class123 field9283;

    @OriginalMember(owner = "client!qq", name = "ng", descriptor = "Ldw;")
    public class123 field9287;

    @OriginalMember(owner = "client!qq", name = "og", descriptor = "Ldw;")
    public class123 field9288;

    @OriginalMember(owner = "client!qq", name = "pg", descriptor = "Ldw;")
    public class123 field9289;

    @OriginalMember(owner = "client!qq", name = "sg", descriptor = "Ldw;")
    public class123 field9292;

    @OriginalMember(owner = "client!qq", name = "tg", descriptor = "Ldw;")
    public class123 field9293;

    @OriginalMember(owner = "client!qq", name = "ug", descriptor = "Ldw;")
    public class123 field9294;

    @OriginalMember(owner = "client!qq", name = "vg", descriptor = "Ldw;")
    public class123 field9295;

    @OriginalMember(owner = "client!qq", name = "oe", descriptor = "Lot;")
    public class222 field9185;

    @OriginalMember(owner = "client!qq", name = "Hc", descriptor = "Lga;")
    public static class332 field9100;

    @OriginalMember(owner = "client!qq", name = "Te", descriptor = "Lhm;")
    private class500 field9216;

    @OriginalMember(owner = "client!qq", name = "ef", descriptor = "Lft;")
    private class555 field9227;

    @OriginalMember(owner = "client!qq", name = "qg", descriptor = "Lkga;")
    private class556 field9290;

    @OriginalMember(owner = "client!qq", name = "eg", descriptor = "Lwr;")
    private class697 field9278;

    @OriginalMember(owner = "client!qq", name = "lg", descriptor = "Lwr;")
    private class697 field9285;

    @OriginalMember(owner = "client!qq", name = "he", descriptor = "Lik;")
    private class698 field9178;

    @OriginalMember(owner = "client!qq", name = "Zb", descriptor = "Lln;")
    public class96 field9066;

    @OriginalMember(owner = "client!qq", name = "Cc", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field9095;

    @OriginalMember(owner = "client!qq", name = "od", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field9133;

    @OriginalMember(owner = "client!qq", name = "kb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field9025;

    @OriginalMember(owner = "client!qq", name = "te", descriptor = "Z")
    public boolean field9190;

    @OriginalMember(owner = "client!qq", name = "Ee", descriptor = "Z")
    public boolean field9201;

    @OriginalMember(owner = "client!qq", name = "He", descriptor = "Z")
    public boolean field9204;

    @OriginalMember(owner = "client!qq", name = "Ie", descriptor = "Z")
    public boolean field9205;

    @OriginalMember(owner = "client!qq", name = "Af", descriptor = "Z")
    public boolean field9248;

    @OriginalMember(owner = "client!qq", name = "yg", descriptor = "Z")
    public boolean field9298;

    @OriginalMember(owner = "client!qq", name = "Yf", descriptor = "[Lmh;")
    public class149[] field9272;

    @OriginalMember(owner = "client!qq", name = "Ce", descriptor = "[Lot;")
    private class222[] field9199;

    @OriginalMember(owner = "client!qq", name = "kf", descriptor = "[Lqea;")
    public class392[] field9232;

    @OriginalMember(owner = "client!qq", name = "yf", descriptor = "[Lsj;")
    public class666[] field9246;

    @OriginalMember(owner = "client!qq", name = "uf", descriptor = "[Lfv;")
    public class690[] field9242;

    @OriginalMember(owner = "client!qq", name = "Qf", descriptor = "[Lfv;")
    public class690[] field9264;

    @OriginalMember(owner = "client!qq", name = "ud", descriptor = "[[Lwv;")
    public static class423[][] field9139;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)I")
    public final int method3609(byte arg0) {
        if (arg0 <= 31) {
            this.method1096((class144) null);
        }
        ++field9108;
        return this.field9253;
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(IIIIII)V")
    public final void method1121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9042;
        float var7 = this.method2016((byte) -111);
        this.method3621(0);
        this.method3678(-127, arg4);
        this.method3624(class137.field1869, -128, 0);
        this.method3666(0, class137.field1869, (byte) -83);
        this.method3627(83, arg5);
        this.field9166.method866((float) (arg2 + -1), (float) (arg3 + -1), 60, 1.0F);
        this.field9166.method873(11939, 0.0F, (float) arg1 - var7, (float) arg0 + -var7);
        this.method3685(-90);
        this.method2026(-30817, false);
        this.method3612(0, 4, class365.field4817);
        this.method2026(-30817, true);
        this.method3666(0, class630.field8719, (byte) -83);
        this.method3624(class630.field8719, -115, 0);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
    public abstract void method2006(Object arg0, Canvas arg1, byte arg2);

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "()I")
    public final int method1137() {
        ++field9050;
        return this.field9167 - (-this.field9170 + -this.field9168);
    }

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "(I)V")
    private final void method3610(int arg0) {
        ++field9057;
        this.method2022(0);
        this.method1992(arg0 + -6839);
        this.method1998(-82);
        this.method2045(arg0 ^ -122);
        this.method2027(false);
        this.method2035((byte) -93);
        this.method1995(false);
        this.method2013(true);
        this.method2018(1);
        this.method2031(arg0 ^ arg0);
        this.method2038((byte) 113);
        this.method1989(109);
        this.method1990(-1);
        this.method2047(90);
        for (int var2 = this.field9217 + -1; var2 >= 0; --var2) {
            this.method3635(true, var2);
            this.method2039(122);
            this.method2042(true);
            this.method3668(0);
        }
        this.method2025(Integer.MAX_VALUE);
        this.method2029((byte) 103);
        this.method2032(arg0 + -25464);
        this.method2021(1);
        this.method2017((byte) -53);
    }

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "(I)V")
    private final void method3611(int arg0) {
        this.field9213 = false;
        if (arg0 != 25736) {
            this.method1108();
        }
        ++field9129;
        if (this.field9227 != null) {
            this.field9227.method119(-124);
        }
        this.method2017((byte) -53);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIII[BLsk;)Ldea;")
    public abstract class443 method2003(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class452 arg5);

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "(I)V")
    public void method2045(int arg0) {
        this.field9182 = this.field9177;
        if (arg0 < 107) {
            this.method2050((byte) -54, (Canvas) null, (Object) null);
        }
        ++field9158;
        this.field9177 = 0;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLdn;)V")
    public abstract void method2034(byte arg0, class276 arg1);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IILjb;)V")
    private final void method3612(int arg0, int arg1, class498 arg2) {
        this.method2020(120, 0, this.field9285);
        ++field9024;
        this.method1994(this.field9284, arg0 ^ 3);
        this.method2012(arg1, 255, arg2, arg0);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLot;)V")
    public final void method3613(byte arg0, class222 arg1) {
        if (arg0 > 92) {
            ++field9063;
            if (this.field9199[this.field9253] != arg1) {
                this.field9199[this.field9253] = arg1;
                if (arg1 != null) {
                    arg1.method389(true);
                } else {
                    this.method2052((byte) 124);
                }
                this.field9207 &= -2;
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)V")
    public final void method1058(boolean arg0) {
        ++field9053;
    }

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "()Z")
    public final boolean method1112() {
        ++field9111;
        return true;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljaclib/memory/Buffer;I)Ljaclib/memory/Stream;")
    public final Stream method3614(Buffer arg0, int arg1) {
        ++field9103;
        this.field9176.method3441(arg0);
        if (arg1 != 0) {
            this.field9203 = false;
        }
        return this.field9176;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1052(Canvas arg0) {
        ++field9002;
        Object var2 = null;
        if (arg0 != null && this.field9116 != arg0) {
            if (this.field9025.containsKey(arg0)) {
                var2 = this.field9025.get(arg0);
            }
        } else {
            var2 = this.field9162;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method2006(var2, arg0, (byte) 58);
            if (this.field9049 == arg0) {
                this.method3670(-127);
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIII)V")
    public final void method1046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9054;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BZ)V")
    public final void method3615(byte arg0, boolean arg1) {
        if (arg0 > -66) {
            this.method2050((byte) -18, (Canvas) null, (Object) null);
        }
        ++field9015;
        if (!this.field9231 != !arg1) {
            this.field9231 = arg1;
            this.method1998(-84);
            this.field9207 &= -8;
        }
    }

    @OriginalMember(owner = "client!qq", name = "y", descriptor = "()Z")
    public final boolean method1094() {
        ++field9131;
        return true;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lsj;Z)V")
    public final void method3616(class666 arg0, boolean arg1) {
        if (arg1) {
            this.field9250 = -11;
        }
        this.field9246[this.field9253] = arg0;
        ++field8995;
        this.method3674(-82);
    }

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "(I)V")
    public abstract void method2018(int arg0);

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)Lmh;")
    public final class149 method3617(byte arg0) {
        if (!this.field9213) {
            this.field9175.method857(this.field9173, this.field9166);
            this.field9213 = true;
        }
        if (arg0 != -36) {
            return null;
        } else {
            ++field9156;
            return this.field9175;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)V")
    public final void method3618(int arg0, byte arg1) {
        ++field9145;
        this.method3678(-126, arg1 | arg1 << 24 | arg1 << 16 | arg1 << 8);
        int var3 = 11 / ((arg0 - -42) / 46);
    }

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "(I)V")
    public abstract void method1998(int arg0);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IILjb;I)V")
    public abstract void method2012(int arg0, int arg1, class498 arg2, int arg3);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Laga;[Ltq;Z)Lla;")
    public final class409 method1130(class658 arg0, class92[] arg1, boolean arg2) {
        ++field8982;
        return new class503(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "()Z")
    public final boolean method1074() {
        ++field9061;
        return true;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "()Z")
    public final boolean method1087() {
        ++field9075;
        return true;
    }

    @OriginalMember(owner = "client!qq", name = "O", descriptor = "(IIIIII)Z")
    public final boolean method1083(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9122;
        float var7 = this.field9171.method862((float) arg2, 16383, (float) arg0, (float) arg1);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field9171.method862((float) arg5, 16383, (float) arg3, (float) arg4);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field9215 > var7) || !(var8 < (float) this.field9215)) && (!((float) this.field9224 < var7) || !((float) this.field9224 < var8))) {
            int var9 = (int) ((float) this.field9198 * this.field9171.method861((float) arg1, -98, (float) arg2, (float) arg0) / var7);
            int var10 = (int) ((float) this.field9198 * this.field9171.method861((float) arg4, -99, (float) arg5, (float) arg3) / var8);
            if (this.field9274 > (float) var9 && this.field9274 > (float) var10 || this.field9241 < (float) var9 && this.field9241 < (float) var10) {
                return false;
            } else {
                int var11 = (int) ((float) this.field9252 * this.field9171.method852((float) arg0, (float) arg1, (float) arg2, true) / var7);
                int var12 = (int) ((float) this.field9252 * this.field9171.method852((float) arg3, (float) arg4, (float) arg5, true) / var8);
                return (!(this.field9255 > (float) var11) || !((float) var12 < this.field9255)) && (!((float) var11 > this.field9193) || !(this.field9193 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "(I)V")
    public abstract void method1990(int arg0);

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "()I")
    public final int method1133() {
        ++field9096;
        return this.field9219 + -2;
    }

    @OriginalMember(owner = "client!qq", name = "T", descriptor = "()I")
    public final int method1062() {
        ++field9132;
        return this.field9297;
    }

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(IIIII)V")
    public final void method1102(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9040;
    }

    @OriginalMember(owner = "client!qq", name = "ra", descriptor = "(F)V")
    public final void method1041(float arg0) {
        if (this.field9223 != arg0) {
            this.field9223 = arg0;
            this.field9035.setAmbient(arg0);
            this.method2022(0);
            this.method2035((byte) -93);
        }
        ++field9032;
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(IIIIII)Lit;")
    public final class513 method1138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8985;
        return new class458(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ltq;Z)Lf;")
    public final class532 method1139(class92 arg0, boolean arg1) {
        ++field9070;
        class532 var9;
        if (arg0.field1132 != 0 && ~arg0.field1128 != -1) {
            int[] var3 = new int[arg0.field1132 * arg0.field1128];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field1129 != null) {
                for (int var6 = 0; ~arg0.field1128 < ~var6; ++var6) {
                    for (int var7 = 0; ~var7 > ~arg0.field1132; ++var7) {
                        var3[var5++] = class665.method3789(arg0.field1127[class15.method97(255, arg0.field1130[var4])], arg0.field1129[var4] << 24);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; arg0.field1128 > var8; ++var8) {
                    for (int var10 = 0; arg0.field1132 > var10; ++var10) {
                        int var11 = arg0.field1127[255 & arg0.field1130[var4++]];
                        var3[var5++] = ~var11 != -1 ? class665.method3789(var11, -16777216) : 0;
                    }
                }
            }
            var9 = this.method1122(var3, 0, arg0.field1132, arg0.field1132, arg0.field1128);
        } else {
            var9 = this.method1122(new int[1], 0, 1, 1, 1);
        }
        var9.method527(arg0.field1125, arg0.field1126, arg0.field1131, arg0.field1133);
        return var9;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZ)V")
    public final void method3619(int arg0, boolean arg1) {
        ++field9045;
        if (this.field9202 == !arg1) {
            this.field9202 = arg1;
            this.method1995(false);
        }
        if (arg0 != 29370) {
            this.method3650(-53, (class149) null);
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(BZ)V")
    public final void method3620(byte arg0, boolean arg1) {
        if (this.field9181 == !arg1) {
            this.field9181 = arg1;
            this.method2031(0);
        }
        ++field9084;
        int var3 = -28 % ((-19 - arg0) / 56);
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(Z)V")
    public abstract void method2027(boolean arg0);

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "(I)V")
    private final void method3621(int arg0) {
        if (arg0 == 0) {
            ++field8979;
            if (~this.field9207 != -2) {
                this.method3661((byte) -126);
                this.method3658((byte) 120, false);
                this.method3615((byte) -123, false);
                this.method3638(arg0 ^ 100, false);
                this.method3628(false, (byte) 121);
                this.method3667(-2, false, false, 3);
                this.method3676(1, (byte) -84);
                this.method3613((byte) 95, this.field9185);
                this.field9207 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "B", descriptor = "()Z")
    public final boolean method1084() {
        ++field9089;
        return true;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II[I[I)Lua;")
    public final class596 method1128(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field9099;
        return class630.method3491(arg3, 102, arg1, arg0, this, arg2);
    }

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "(I)V")
    public abstract void method2022(int arg0);

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(Z)V")
    public abstract void method2042(boolean arg0);

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1126(Canvas arg0) {
        ++field9072;
        if (this.field9116 == arg0) {
            throw new RuntimeException();
        } else if (this.field9025.containsKey(arg0)) {
            this.method2050((byte) -12, arg0, this.field9025.get(arg0));
            this.field9025.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!qq", name = "VA", descriptor = "(IFFFFF)V")
    public final void method1060(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field9113;
        boolean var7 = ~this.field9276 != ~arg0;
        if (var7 || this.field9244 != arg1 || this.field9238 != arg2) {
            this.field9244 = arg1;
            this.field9238 = arg2;
            this.field9276 = arg0;
            if (var7) {
                this.field9254 = (float) (this.field9276 & 255) / 255.0F;
                this.field9183 = (float) (this.field9276 & 16711680) / 1.671168E7F;
                this.field9263 = (float) (this.field9276 & 65280) / 65280.0F;
                this.method2022(0);
            }
            this.field9035.setSunColour(this.field9183, this.field9263, this.field9254, arg1, arg2);
            this.method1992(-6840);
        }
        if (this.field9218[0] != arg3 || this.field9218[1] != arg4 || this.field9218[2] != arg5) {
            this.field9218[2] = arg5;
            this.field9218[0] = arg3;
            this.field9218[1] = arg4;
            this.field9267[0] = -arg3;
            this.field9267[2] = -arg5;
            this.field9267[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field9239[1] = arg4 * var8;
            this.field9239[2] = arg5 * var8;
            this.field9239[0] = arg3 * var8;
            this.field9266[0] = -this.field9239[0];
            this.field9266[1] = -this.field9239[1];
            this.field9266[2] = -this.field9239[2];
            this.field9035.setSunDirection(this.field9239[0], this.field9239[1], this.field9239[2]);
            this.method2027(false);
            this.field9257 = (int) (arg3 * 256.0F / arg4);
            this.field9222 = (int) (arg5 * 256.0F / arg4);
        }
        this.method2035((byte) -93);
    }

    @OriginalMember(owner = "client!qq", name = "pa", descriptor = "(III)V")
    public final void method1073(int arg0, int arg1, int arg2) {
        ++field9080;
        if (~this.field9269 != ~arg0 || ~this.field9260 != ~arg1 || this.field9180 != arg2) {
            this.field9269 = arg0;
            this.field9260 = arg1;
            this.field9180 = arg2;
            this.method3663((byte) -57);
            this.method2031(0);
        }
    }

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "(I)V")
    public final void method3622(int arg0) {
        this.field9166.method352();
        if (arg0 == -22561) {
            ++field9142;
            this.field9164 = true;
            this.method3659(arg0 + 45159);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZB)Lwr;")
    public abstract class697 method1996(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "([IIIII)Lf;")
    public final class532 method1122(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9114;
        return new class129(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZII)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method3623(boolean arg0, int arg1, int arg2) {
        ++field9003;
        int var4 = 46 % ((42 - arg1) / 52);
        return this.field9095.method3428(arg2, arg0);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIILua;II)V")
    public final void method1055(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class596 arg6, int arg7, int arg8) {
        ++field9067;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
    public abstract void method2041(Canvas arg0, int arg1, Object arg2);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Led;II)V")
    public final void method3624(class116 arg0, int arg1, int arg2) {
        this.method2011(arg2, arg0, 12080, false, false);
        ++field9110;
        if (arg1 > -106) {
            this.method1998(13);
        }
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(B)Lmh;")
    public final class149 method3625(byte arg0) {
        ++field9159;
        if (arg0 != 70) {
            this.method1087();
        }
        return this.field9174;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZIZLsk;[F)Lgn;")
    public final class691 method3626(int arg0, boolean arg1, int arg2, boolean arg3, class452 arg4, float[] arg5) {
        if (!arg1) {
            this.method1054();
        }
        ++field9137;
        return this.method2007(arg4, arg0, arg3, 0, 0, (byte) -125, arg2, arg5);
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(IZ)V")
    public abstract void method2026(int arg0, boolean arg1);

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)Le;")
    public final class381 method1078(int arg0) {
        ++field9152;
        class169 var2 = new class169(arg0);
        this.field9088.method2507(var2, (byte) -124);
        return var2;
    }

    @OriginalMember(owner = "client!qq", name = "s", descriptor = "()Z")
    public final boolean method1069() {
        ++field9127;
        return true;
    }

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "(IIIII)V")
    public final void method1149(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1101(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
        ++field9102;
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(II)V")
    public final void method3627(int arg0, int arg1) {
        ++field9076;
        if (arg0 <= 47) {
            this.field9263 = -0.5840615F;
        }
        if (~this.field9234 != ~arg1) {
            class680 var3;
            boolean var4;
            boolean var5;
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    var3 = class225.field2929;
                    var4 = false;
                    var5 = true;
                } else if (arg1 == 128) {
                    var3 = class409.field5392;
                    var5 = true;
                    var4 = true;
                } else {
                    var5 = false;
                    var4 = false;
                    var3 = class29.field418;
                }
            } else {
                var3 = class177.field2496;
                var5 = true;
                var4 = true;
            }
            if (!var4 != !this.field9275) {
                this.field9275 = var4;
                this.method2047(-126);
            }
            if (!this.field9211 != !var5) {
                this.field9211 = var5;
                this.method1989(103);
            }
            if (this.field9273 != var3) {
                this.field9273 = var3;
                this.method1990(-1);
            }
            this.field9234 = arg1;
            this.field9207 &= -29;
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(ZB)V")
    public final void method3628(boolean arg0, byte arg1) {
        if (!arg0 != !this.field9265) {
            this.field9265 = arg0;
            this.method2018(1);
            this.field9207 &= -32;
        }
        ++field9052;
        int var3 = -37 % ((56 - arg1) / 63);
    }

    @OriginalMember(owner = "client!qq", name = "U", descriptor = "()I")
    public final int method1108() {
        ++field9147;
        return this.field9224;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lec;)V")
    public final void method1096(class144 arg0) {
        this.field9216.method2842(this, 2, arg0, -1);
        ++field9036;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lq;)V")
    public final void method1123(class487 arg0) {
        ++field9094;
        this.field9171 = (class149) arg0;
        this.field9173.method344(this.field9171);
        this.field9173.method855((byte) -116);
        this.field9174.method859(this.field9173, -30683);
        this.field9172.method859(this.field9171, -30683);
        if (this.field9235.method3075(-1)) {
            this.method3611(25736);
        }
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(B)V")
    private final void method3629(byte arg0) {
        ++field9068;
        this.field9225 = (float) this.field9224;
        int var2 = -119 / ((arg0 - 16) / 39);
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(IZ)V")
    public final void method3630(int arg0, boolean arg1) {
        ++field9143;
        if (arg0 < 85) {
            this.field9255 = -1.6697752F;
        }
        if (!this.field9203 == arg1) {
            this.field9203 = arg1;
            this.method1998(-67);
        }
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1132(Canvas arg0) {
        ++field8994;
        if (this.field9116 == arg0) {
            throw new RuntimeException();
        } else if (!this.field9025.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method1993(arg0, 100);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field9025.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLsk;Lvea;II)Lgn;")
    public abstract class691 method2004(byte arg0, class452 arg1, class404 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "(I)V")
    public abstract void method2039(int arg0);

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "(IIIIII)V")
    public final void method1113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3621(0);
        ++field9065;
        this.method3678(-126, arg4);
        this.method3624(class137.field1869, -112, 0);
        this.method3666(0, class137.field1869, (byte) -83);
        this.method3627(82, arg5);
        this.field9166.method866((float) arg2, (float) arg3, 72, 1.0F);
        this.field9166.method356(arg0, arg1, 0);
        this.method3685(-15);
        this.method2026(-30817, false);
        this.method3649(66);
        this.method2026(-30817, true);
        this.method3666(0, class630.field8719, (byte) -83);
        this.method3624(class630.field8719, -116, 0);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B[Lqp;)Lum;")
    public abstract class109 method2015(byte arg0, class636[] arg1);

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lfa;Lga;II)V")
    public class651(Canvas arg0, Object arg1, class522 arg2, class332 arg3, int arg4, int arg5) {
        super(arg2);
        this.field9128 = arg3;
        this.field9194 = arg4;
        this.field9049 = this.field9116 = arg0;
        this.field9162 = this.field9141 = arg1;
        Dimension var7 = arg0.getSize();
        this.field9117 = this.field9048 = var7.height;
        this.field8997 = this.field9018 = var7.width;
        this.field9262 = arg5;
        class413.method2341(-97, true, false);
        if (super.field7682 != null) {
            this.field9226 = new class10(this, super.field7682);
            this.field9035 = new NativeInterface(super.field7682.method2962(101), this.field9262);
            for (int var8 = 0; ~var8 > ~super.field7682.method2962(79); ++var8) {
                class105 var9 = super.field7682.method2959(115, var8);
                if (var9 != null) {
                    this.field9035.initTextureMetrics(var8, var9.field1244, var9.field1263);
                }
            }
        } else {
            this.field9035 = new NativeInterface(0, this.field9262);
            this.field9226 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "(Z)[F")
    public final float[] method3631(boolean arg0) {
        ++field9046;
        return arg0 ? null : this.field9191;
    }

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(B)V")
    private final void method3632(byte arg0) {
        this.field9228[14] = this.field9206;
        this.field9228[10] = this.field9189;
        ++field8998;
        this.field9179 = (this.field9228[14] - (float) this.field9224) / this.field9228[10];
        int var2 = -50 / ((52 - arg0) / 45);
    }

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "(I)V")
    private final void method3633(int arg0) {
        ++field9073;
        this.method2020(111, 0, this.field9278);
        if (arg0 != 25886) {
            this.field9175 = null;
        }
        this.method1994(this.field9282, 3);
        this.method2012(1, 255, class498.field6848, 0);
    }

    @OriginalMember(owner = "client!qq", name = "ZA", descriptor = "(Z)V")
    public final void method1091(boolean arg0) {
        this.field9268 = arg0;
        ++field9119;
        this.method2018(1);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Le;)V")
    public final void method1129(class381 arg0) {
        this.field9095 = ((class169) arg0).field2418;
        ++field9148;
        this.field9133 = this.field9095.method3428(32768, false);
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(IZ)Lkga;")
    public abstract class556 method2046(int arg0, boolean arg1);

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)I")
    public final int method1053(int arg0, int arg1) {
        ++field9030;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lum;I)V")
    public abstract void method1994(class109 arg0, int arg1);

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V")
    public final void method1082(int arg0) {
        ++field9140;
    }

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "(B)V")
    private final void method3634(byte arg0) {
        ++field9115;
        this.method2032(-25465);
        if (this.field9227 != null) {
            this.field9227.method118(false);
        }
        if (arg0 != 77) {
            this.field9227 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "YA", descriptor = "(IIII)V")
    public final void method1064(int arg0, int arg1, int arg2, int arg3) {
        ++field9098;
        if (!this.field9190) {
            throw new RuntimeException("");
        } else {
            this.field9209 = arg0;
            this.field9196 = arg3;
            this.field9208 = arg1;
            this.field9188 = arg2;
            if (this.field9186) {
                this.field9243[3].method128(-6486);
                this.field9243[3].method120((byte) -126);
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZI)V")
    public final void method3635(boolean arg0, int arg1) {
        ++field9037;
        if (!arg0) {
            this.method1054();
        }
        if (~this.field9253 != ~arg1) {
            this.field9253 = arg1;
            this.method2014(0);
        }
    }

    @OriginalMember(owner = "client!qq", name = "XA", descriptor = "(IIIII)V")
    public final void method1144(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9078;
        this.method1101(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!qq", name = "FA", descriptor = "(ILua;II)V")
    public final void method1095(int arg0, class596 arg1, int arg2, int arg3) {
        ++field9071;
        class200 var5 = (class200) arg1;
        class691 var6 = var5.field2706;
        this.method3640((byte) 3);
        this.method3613((byte) 124, var6);
        this.method3627(111, 1);
        this.method3672((byte) -81, class298.field3941, class298.field3941);
        this.method3624(class137.field1869, -118, 0);
        this.method3678(-128, arg0);
        this.field9166.method866((float) this.field8997, (float) this.field9117, 92, 0.0F);
        this.method3685(-88);
        this.field9272[0].method866(var6.method843((float) this.field8997, (byte) 58), var6.method841((byte) -40, (float) this.field9117), 56, 1.0F);
        this.field9272[0].method873(11939, 0.0F, var6.method841((byte) -40, (float) (-arg3)), var6.method843((float) (-arg2), (byte) 58));
        this.field9246[0] = class213.field2816;
        this.method3674(-44);
        this.method3649(92);
        this.method3668(0);
        this.method3624(class630.field8719, -121, 0);
    }

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "(B)V")
    private final void method3636(byte arg0) {
        if (arg0 == -77) {
            if (!this.field9221) {
                float[] var2 = this.field9200;
                float var3 = (float) this.field9215;
                float var4 = (float) this.field9224;
                float var5 = (float) (-this.field9220) * this.field9237 / (float) this.field9252;
                float var6 = (float) (-this.field9261) * this.field9237 / (float) this.field9198;
                float var7 = (float) (-this.field9261 + this.field8997) * this.field9237 / (float) this.field9198;
                float var8 = (float) (-this.field9220 + this.field9117) * this.field9237 / (float) this.field9252;
                if (var6 != var7 && var5 != var8) {
                    var2[12] = (var6 + var7) / (var6 - var7);
                    var2[8] = 0.0F;
                    var2[11] = 0.0F;
                    var2[4] = 0.0F;
                    var2[7] = 0.0F;
                    var2[2] = 0.0F;
                    var2[15] = 1.0F;
                    var2[13] = (var5 + var8) / (-var5 + var8);
                    var2[14] = var3 / (-var4 + var3);
                    var2[5] = 2.0F / (var8 - var5);
                    var2[6] = 0.0F;
                    var2[0] = 2.0F / (-var6 + var7);
                    var2[9] = 0.0F;
                    var2[1] = 0.0F;
                    var2[3] = 0.0F;
                    var2[10] = 1.0F / (var3 - var4);
                } else {
                    var2[15] = 1.0F;
                    var2[4] = 0.0F;
                    var2[2] = 0.0F;
                    var2[11] = 0.0F;
                    var2[5] = 1.0F;
                    var2[3] = 0.0F;
                    var2[6] = 0.0F;
                    var2[8] = 0.0F;
                    var2[9] = 0.0F;
                    var2[1] = 0.0F;
                    var2[7] = 0.0F;
                    var2[12] = 0.0F;
                    var2[13] = 0.0F;
                    var2[14] = 0.0F;
                    var2[10] = 1.0F;
                    var2[0] = 1.0F;
                }
                this.method3629((byte) 118);
                this.field9221 = true;
            }
            ++field9144;
        }
    }

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "(B)Lmh;")
    public final class149 method3637(byte arg0) {
        ++field9104;
        int var2 = -99 / ((-64 - arg0) / 50);
        return this.field9173;
    }

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(IZ)V")
    public final void method3638(int arg0, boolean arg1) {
        if (arg1 == !this.field9197) {
            this.field9197 = arg1;
            this.method2013(true);
            this.field9207 &= -32;
        }
        ++field8991;
        if (arg0 < 28) {
            this.field9284 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "CA", descriptor = "(IIII)V")
    public final void method1072(int arg0, int arg1, int arg2, int arg3) {
        this.field9209 = arg0;
        this.field9188 = arg2;
        this.field9208 = arg1;
        this.field9196 = arg3;
        ++field9047;
        this.field9190 = true;
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(II)Lkga;")
    public final class556 method3639(int arg0, int arg1) {
        if (arg1 * 2 > this.field9290.method1755(16383)) {
            this.field9290.method1765(arg1, arg0 ^ 30907);
        }
        ++field9146;
        if (arg0 != 0) {
            this.method3659(35);
        }
        return this.field9290;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIF)Lqea;")
    public final class392 method1152(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field9077;
        return new class38(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "(B)V")
    public final void method3640(byte arg0) {
        if (this.field9207 != 2) {
            this.method3661((byte) -123);
            this.method3658((byte) 120, false);
            this.method3615((byte) -71, false);
            this.method3638(arg0 ^ 120, false);
            this.method3628(false, (byte) 120);
            this.method3667(-2, false, false, 3);
            this.field9207 = 2;
        }
        if (arg0 != 3) {
            this.method3682(-11);
        }
        ++field9120;
    }

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "(B)F")
    public abstract float method2016(byte arg0);

    @OriginalMember(owner = "client!qq", name = "V", descriptor = "(IIII)V")
    public final void method1077(int arg0, int arg1, int arg2, int arg3) {
        ++field9056;
        boolean var5 = false;
        if (~arg0 < ~this.field9212) {
            this.field9212 = arg0;
            var5 = true;
        }
        if (~this.field9256 < ~arg2) {
            this.field9256 = arg2;
            var5 = true;
        }
        if (~this.field9250 > ~arg1) {
            this.field9250 = arg1;
            var5 = true;
        }
        if (this.field9240 > arg3) {
            this.field9240 = arg3;
            var5 = true;
        }
        if (var5) {
            if (!this.field9298) {
                this.field9298 = true;
                this.method1999((byte) -44);
            }
            this.method2030((byte) -80);
            this.method3660(-1558);
        }
    }

    @OriginalMember(owner = "client!qq", name = "GA", descriptor = "(II)V")
    public final void method1090(int arg0, int arg1) {
        if (~this.field9215 != ~arg0 || ~this.field9224 != ~arg1) {
            this.field9215 = arg0;
            this.field9224 = arg1;
            this.method3641(0);
            this.method3651(71);
            this.method3663((byte) -71);
        }
        ++field9007;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lsk;IZIIBI[F)Lgn;")
    public abstract class691 method2007(class452 arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5, int arg6, float[] arg7);

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(I)V")
    public void method1063(int arg0) {
        if (this.field9226 != null) {
            this.field9226.method58(-82);
        }
        ++field9123;
        this.field9245 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!qq", name = "s", descriptor = "(I)V")
    private final void method3641(int arg0) {
        ++field9106;
        this.field9214 = false;
        if (arg0 == 0) {
            this.method3679(arg0 + -72);
            if (class687.field9702 == this.field9235) {
                this.method3634((byte) 77);
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "(I)V")
    public final void method1081(int arg0) {
        ++field9026;
    }

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "()Z")
    public final boolean method1106() {
        ++field9160;
        return this.field9204;
    }

    @OriginalMember(owner = "client!qq", name = "t", descriptor = "(I)V")
    public final void method3642(int arg0) {
        int var2 = -3 / ((arg0 - -4) / 43);
        if (class24.field282 != this.field9235) {
            class549 var3 = this.field9235;
            this.field9235 = class24.field282;
            if (var3.method3075(-1)) {
                this.method3611(25736);
            }
            this.field9230 = this.field9191;
            this.field9207 &= -32;
        }
        ++field8983;
    }

    @OriginalMember(owner = "client!qq", name = "u", descriptor = "(I)V")
    private final void method3643(int arg0) {
        this.field9210 = false;
        ++field9005;
        if (class665.field9458 == this.field9235) {
            this.method3689(true);
            this.method3634((byte) 77);
        }
        if (arg0 <= 8) {
            this.method3639(87, -13);
        }
    }

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "()V")
    public void method1142() {
        if (!this.field9187) {
            for (class45 var1 = this.field9088.method2506(68); var1 != null; var1 = this.field9088.method2505(-110)) {
                ((class169) var1).method1157(-1);
            }
            Enumeration var2 = this.field9025.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method2050((byte) -12, var3, this.field9025.get(var3));
            }
            class374.method2146(false, true, false);
            this.field9035.release();
            this.field9187 = true;
        }
        ++field8987;
    }

    @OriginalMember(owner = "client!qq", name = "oa", descriptor = "([I)V")
    public final void method1057(int[] arg0) {
        arg0[2] = this.field9256;
        ++field9006;
        arg0[1] = this.field9250;
        arg0[3] = this.field9240;
        arg0[0] = this.field9212;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIZZI)V")
    private final void method3644(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        boolean var7 = arg3 & this.method1135();
        ++field9079;
        if (!var7 && (~arg1 == -5 || arg1 == 8 || ~arg1 == -10)) {
            arg1 = 2;
            arg0 = ~arg1 != -5 ? 1 : arg5 & 1;
            arg5 = 0;
        }
        if (~arg1 != -1 && arg4) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (this.field9270 == arg1) {
            if (this.field9270 != 0) {
                this.field9243[Integer.MAX_VALUE & this.field9270].method117(arg4, -13443);
                if (~this.field9249 != ~arg5 || ~this.field9233 != ~arg0) {
                    this.field9243[this.field9270 & Integer.MAX_VALUE].method126(97, arg5, arg0);
                    this.field9249 = arg5;
                    this.field9233 = arg0;
                }
            }
        } else {
            if (this.field9270 != 0) {
                this.field9243[Integer.MAX_VALUE & this.field9270].method121((byte) 49);
            }
            if (arg1 != 0) {
                this.field9227 = this.field9243[Integer.MAX_VALUE & arg1];
                this.field9227.method124(true, arg4);
                this.field9227.method117(arg4, -13443);
                this.field9227.method126(100, arg5, arg0);
            } else {
                this.field9227 = null;
            }
            this.field9249 = arg5;
            this.field9233 = arg0;
            this.field9270 = arg1;
        }
        if (arg2 != -28404) {
            this.field9182 = 67;
        }
    }

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "(B)Ljn;")
    public final class530 method3645(byte arg0) {
        if (arg0 < 17) {
            return null;
        } else {
            ++field9163;
            return this.field9178 != null ? this.field9178.method2573((byte) -23) : null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(FFFFFBF)Z")
    private final boolean method3646(float arg0, float arg1, float arg2, float arg3, float arg4, byte arg5, float arg6) {
        int var8 = -109 / ((33 - arg5) / 41);
        ++field9034;
        Buffer var9 = this.field9278.method2566(true, (byte) 6);
        if (var9 == null) {
            return false;
        } else {
            Stream var10 = this.method3614(var9, 0);
            if (!Stream.method3445()) {
                var10.method3438(arg2);
                var10.method3438(arg4);
                var10.method3438(arg1);
                var10.method3438(arg6);
                var10.method3438(arg0);
                var10.method3438(arg3);
            } else {
                var10.method3439(arg2);
                var10.method3439(arg4);
                var10.method3439(arg1);
                var10.method3439(arg6);
                var10.method3439(arg0);
                var10.method3439(arg3);
            }
            var10.method3440();
            return this.field9278.method2564(-67);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field9130;
    }

    @OriginalMember(owner = "client!qq", name = "v", descriptor = "(I)V")
    public abstract void method2031(int arg0);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lit;)V")
    public final void method1048(class513 arg0) {
        this.field9178 = (class698) arg0;
        ++field9014;
    }

    @OriginalMember(owner = "client!qq", name = "w", descriptor = "(I)[Lnv;")
    public static final class63[] method3647(int arg0) {
        if (arg0 != 8) {
            return null;
        } else {
            ++field9149;
            return new class63[] { class624.field8641, class624.field8644, class624.field8645, class624.field8646, class624.field8647, class624.field8648, class624.field8649, class624.field8650, class624.field8651, class624.field8652, class624.field8653, class624.field8654, class624.field8655, class624.field8656 };
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "([BIIB)Ljava/lang/String;")
    public static final String method3648(byte[] arg0, int arg1, int arg2, byte arg3) {
        ++field9059;
        char[] var4 = new char[arg1];
        int var5 = 0;
        int var6 = -126 / ((-74 - arg3) / 33);
        for (int var7 = 0; ~arg1 < ~var7; ++var7) {
            int var8 = 255 & arg0[arg2 + var7];
            if (~var8 != -1) {
                if (var8 >= 128 && ~var8 > -161) {
                    char var9 = class527.field7294[var8 + -128];
                    if (~var9 == -1) {
                        var9 = '?';
                    }
                    var8 = var9;
                }
                var4[var5++] = (char) var8;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!qq", name = "x", descriptor = "(I)V")
    public final void method3649(int arg0) {
        this.method3612(0, 2, class67.field826);
        ++field8981;
        if (arg0 < 50) {
            this.field9213 = true;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILmh;)V")
    public final void method3650(int arg0, class149 arg1) {
        ++field9135;
        this.field9166.method344(arg1);
        this.field9164 = false;
        this.method3659(arg0 ^ -10451);
        if (arg0 != -28821) {
            this.field9274 = -0.14042369F;
        }
    }

    @OriginalMember(owner = "client!qq", name = "y", descriptor = "(I)V")
    private final void method3651(int arg0) {
        ++field8993;
        int var2 = -104 % ((arg0 - 27) / 33);
        this.field9221 = false;
        this.method3636((byte) -77);
        if (class492.field6794 == this.field9235) {
            this.method3634((byte) 77);
        }
    }

    @OriginalMember(owner = "client!qq", name = "AA", descriptor = "(III[I)V")
    public final void method1045(int arg0, int arg1, int arg2, int[] arg3) {
        ++field9126;
        float var5 = this.field9171.method862((float) arg2, 16383, (float) arg0, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field9220;
            var7 = this.field9261;
        } else {
            var7 = (int) ((float) this.field9198 * this.field9171.method861((float) arg1, -128, (float) arg2, (float) arg0) / var5);
            var6 = (int) ((float) this.field9252 * this.field9171.method852((float) arg0, (float) arg1, (float) arg2, true) / var5);
        }
        arg3[2] = (int) var5;
        arg3[0] = (int) ((float) var7 + -this.field9274);
        arg3[1] = (int) ((float) var6 + -this.field9255);
    }

    @OriginalMember(owner = "client!qq", name = "BA", descriptor = "()I")
    public final int method1054() {
        ++field9154;
        return this.field9215;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B[F)[F")
    public final float[] method3652(byte arg0, float[] arg1) {
        arg1[12] = this.field9230[3];
        arg1[0] = this.field9230[0];
        if (arg0 != -58) {
            return null;
        } else {
            ++field9039;
            arg1[4] = this.field9230[1];
            arg1[8] = this.field9230[2];
            arg1[9] = this.field9230[6];
            arg1[2] = this.field9230[8];
            arg1[5] = this.field9230[5];
            arg1[1] = this.field9230[4];
            arg1[13] = this.field9230[7];
            arg1[14] = this.field9230[11];
            arg1[7] = this.field9230[13];
            arg1[6] = this.field9230[9];
            arg1[10] = this.field9230[10];
            arg1[3] = this.field9230[12];
            arg1[11] = this.field9230[14];
            arg1[15] = this.field9230[15];
            return arg1;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lsk;I[BZII)Lgn;")
    public final class691 method3653(class452 arg0, int arg1, byte[] arg2, boolean arg3, int arg4, int arg5) {
        ++field9090;
        if (arg4 != -29799) {
            this.method3617((byte) 29);
        }
        return this.method2028(arg5, 0, 0, arg0, 123, arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!qq", name = "JA", descriptor = "()V")
    public final void method1044() {
        this.field9240 = this.field9117;
        this.field9212 = 0;
        this.field9256 = this.field8997;
        ++field8989;
        this.field9250 = 0;
        if (this.field9298) {
            this.field9298 = false;
            this.method1999((byte) -44);
        }
        this.method3660(-1558);
    }

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "(I)V")
    public final void method3654(int arg0) {
        this.field9199 = new class222[this.field9217];
        int var2 = -76 % ((43 - arg0) / 39);
        this.field9246 = new class666[this.field9217];
        this.field9272 = new class149[this.field9217];
        this.field9264 = new class690[this.field9217];
        ++field9101;
        this.field9242 = new class690[this.field9217];
        for (int var3 = 0; var3 < this.field9217; ++var3) {
            this.field9242[var3] = class274.field3642;
            this.field9264[var3] = class274.field3642;
            this.field9246[var3] = class118.field1507;
            this.field9272[var3] = new class149();
        }
        this.field9232 = new class392[this.field9219 - 2];
        this.field9185 = this.method2004((byte) 61, class480.field6686, class404.field5338, 1, 1);
        this.method1129(new class169(262144));
        this.field9291 = this.method2015((byte) -85, new class636[] { new class636(new class255[] { class255.field3339, class255.field3346 }) });
        this.field9286 = this.method2015((byte) -85, new class636[] { new class636(new class255[] { class255.field3339, class255.field3344 }) });
        this.field9296 = this.method2015((byte) -85, new class636[] { new class636(class255.field3339), new class636(class255.field3344), new class636(class255.field3346), new class636(class255.field3343) });
        this.field9280 = this.method2015((byte) -85, new class636[] { new class636(class255.field3339), new class636(class255.field3344), new class636(class255.field3346) });
        this.field9288 = new class123(this, 0, 0, false, false);
        this.field9295 = new class123(this, 0, 0, true, true);
        this.field9289 = new class123(this, 0, 0, false, false);
        this.field9279 = new class123(this, 0, 0, true, true);
        this.field9287 = new class123(this, 0, 0, false, false);
        this.field9283 = new class123(this, 0, 0, true, true);
        this.field9292 = new class123(this, 0, 0, false, false);
        this.field9281 = new class123(this, 0, 0, true, true);
        this.field9294 = new class123(this, 0, 0, false, false);
        this.field9293 = new class123(this, 0, 0, true, true);
        this.field9216 = new class500(this);
        this.field9290 = this.method2046(1, true);
        this.method3691(8);
        this.field9066 = new class96(this);
        this.field9243[1] = this.method2019(1, 6);
        this.field9243[2] = this.method2019(2, 6);
        this.field9243[4] = this.method2019(4, 6);
        this.field9243[5] = this.method2019(5, 6);
        this.field9243[6] = this.method2019(6, 6);
        this.field9243[7] = this.method2019(7, 6);
        this.field9243[3] = this.method2019(3, 6);
        this.field9243[8] = this.method2019(8, 6);
        this.field9243[9] = this.method2019(9, 6);
        if (!this.field9243[2].method125(-20112)) {
            this.field9243[2] = this.method2019(0, 6);
        }
        if (!this.field9243[4].method125(-20112)) {
            this.field9243[4] = this.field9243[2];
        }
        if (!this.field9243[8].method125(-20112)) {
            this.field9243[8] = this.field9243[4];
        }
        if (!this.field9243[9].method125(-20112)) {
            this.field9243[9] = this.field9243[8];
        }
        this.method2049(0);
        this.method1044();
        this.method1050();
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1143(Canvas arg0) {
        this.field9049 = null;
        this.field9162 = null;
        ++field9112;
        if (arg0 != null && this.field9116 != arg0) {
            if (this.field9025.containsKey(arg0)) {
                this.field9162 = this.field9025.get(arg0);
                this.field9049 = arg0;
            }
        } else {
            this.field9049 = this.field9116;
            this.field9162 = this.field9141;
        }
        if (this.field9049 != null && this.field9162 != null) {
            this.method2041(this.field9049, -69, this.field9162);
            this.method3670(-109);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lvea;Lsk;B)Z")
    public abstract boolean method2037(class404 arg0, class452 arg1, byte arg2);

    @OriginalMember(owner = "client!qq", name = "A", descriptor = "(I)I")
    public final int method3655(int arg0) {
        ++field9136;
        return arg0 != 1 ? 20 : this.field9196;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZIIZI)V")
    public static final void method3656(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field9091;
        class535.method3003(arg3, 0, arg0, arg4, arg2, 0, class159.field2279.length - 1);
        class646.field8931 = 0;
        class384.field5110 = null;
        if (arg1 > -34) {
            method3680((byte) 110, 50, (String) null);
        }
    }

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "(B)V")
    public abstract void method2029(byte arg0);

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(II)Lft;")
    public class555 method2019(int arg0, int arg1) {
        if (arg1 != 6) {
            return null;
        } else {
            ++field9069;
            if (arg0 != 6) {
                if (arg0 != 1) {
                    if (~arg0 != -3) {
                        return arg0 == 7 ? new class146(this) : new class101(this);
                    } else {
                        return new class155(this, this.field9066);
                    }
                } else {
                    return new class637(this);
                }
            } else {
                return new class580(this);
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "(B)I")
    public final int method3657(byte arg0) {
        ++field9029;
        int var2 = 103 % ((-28 - arg0) / 38);
        return this.field9188;
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(BZ)V")
    public final void method3658(byte arg0, boolean arg1) {
        ++field9011;
        if (arg0 < 119) {
            this.field9184 = -127;
        }
        if (!arg1 == this.field9201) {
            this.field9201 = arg1;
            this.method2031(0);
            this.field9207 &= -32;
        }
    }

    @OriginalMember(owner = "client!qq", name = "B", descriptor = "(I)V")
    private final void method3659(int arg0) {
        ++field9083;
        if (class665.field9458 == this.field9235) {
            float var2 = this.method2016((byte) 65);
            this.field9166.method873(11939, 0.0F, var2, var2);
        }
        this.field9213 = false;
        this.method2021(1);
        if (this.field9227 != null) {
            this.field9227.method122(12844);
        }
        if (arg0 != 22598) {
            this.field9168 = -8;
        }
    }

    @OriginalMember(owner = "client!qq", name = "C", descriptor = "(I)V")
    private final void method3660(int arg0) {
        this.field9255 = (float) (-this.field9220 + this.field9250);
        this.field9274 = (float) (-this.field9261 + this.field9212);
        if (arg0 != -1558) {
            this.field9116 = null;
        }
        this.field9241 = (float) (-this.field9261 + this.field9256);
        this.field9193 = (float) (-this.field9220 + this.field9240);
        ++field9027;
    }

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "(B)V")
    private final void method3661(byte arg0) {
        if (class665.field9458 != this.field9235) {
            class549 var2 = this.field9235;
            this.field9235 = class665.field9458;
            if (var2.method3075(-1)) {
                this.method3611(25736);
            }
            this.method3689(true);
            this.field9230 = this.field9271;
            this.method3634((byte) 77);
            this.field9207 &= -25;
        }
        ++field9033;
        int var3 = -44 / ((arg0 - -68) / 55);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZII[I)Lgn;")
    public final class691 method3662(int arg0, boolean arg1, int arg2, int arg3, int[] arg4) {
        ++field9058;
        if (arg3 >= -102) {
            this.method3664(true);
        }
        return this.method2044(arg4, 0, 0, arg0, arg1, -219, arg2);
    }

    @OriginalMember(owner = "client!qq", name = "D", descriptor = "(I)V")
    public abstract void method1992(int arg0);

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "(B)V")
    private final void method3663(byte arg0) {
        ++field9017;
        if (this.field9227 != null) {
            this.field9227.method120((byte) -128);
        }
        if (arg0 >= -25) {
            this.method1053(-124, 120);
        }
        this.method2038((byte) 115);
    }

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "(Z)V")
    public final void method3664(boolean arg0) {
        if (!arg0) {
            ++field9153;
            this.method3642(-73);
            this.method3634((byte) 77);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(FB)V")
    public final void method3665(float arg0, byte arg1) {
        ++field9020;
        if (this.field9237 != arg0) {
            this.field9237 = arg0;
            this.method3651(72);
        }
        int var3 = -60 % ((arg1 - -5) / 39);
    }

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "()V")
    public final void method1148() {
        ++field9043;
        this.field9190 = false;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILed;B)V")
    public final void method3666(int arg0, class116 arg1, byte arg2) {
        this.method1991(arg0, false, arg1, (byte) -84);
        if (arg2 != -83) {
            this.method1063(92);
        }
        ++field9161;
    }

    @OriginalMember(owner = "client!qq", name = "E", descriptor = "(I)V")
    public abstract void method1989(int arg0);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZZI)V")
    public final void method3667(int arg0, boolean arg1, boolean arg2, int arg3) {
        ++field9062;
        if (this.field9259 != arg0 || !this.field9186 != !this.field9190) {
            class691 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field9190 ? 3 : 0;
            if (~arg0 > -1) {
                this.method3668(0);
            } else {
                var5 = this.field9226.method54(arg0, -2);
                class105 var10 = super.field7682.method2959(arg3 ^ 97, arg0);
                if (~var10.field1258 == -1 && var10.field1248 == 0) {
                    this.method3668(0);
                } else {
                    int var11 = var10.field1260 ? 64 : 128;
                    int var12 = var11 * 50;
                    class149 var13 = this.method3682(117);
                    var13.method867((float) (this.field9245 % var12 * var10.field1248) / (float) var12, (float) (this.field9245 % var12 * var10.field1258) / (float) var12, 0.0F, 0);
                    this.method3616(class213.field2816, false);
                }
                var6 = var10.field1257;
                if (!this.field9190) {
                    var9 = var10.field1255;
                    var7 = var10.field1246;
                    var8 = var10.field1259;
                }
            }
            this.method3644(var8, var9, arg3 ^ -28401, arg1, arg2, var7);
            if (this.field9227 == null) {
                this.method3613((byte) 127, var5);
                this.method3676(var6, (byte) -84);
            } else {
                this.field9227.method127(var5, (byte) -97, var6);
            }
            this.field9259 = arg0;
            this.field9186 = this.field9190;
        }
        this.field9207 &= -8;
        if (arg3 != 3) {
            this.field9201 = true;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "([I)V")
    public final void method1127(int[] arg0) {
        arg0[0] = this.field8997;
        arg0[1] = this.field9117;
        ++field9134;
    }

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "()Z")
    public final boolean method1100() {
        ++field9004;
        return false;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIZ)Lf;")
    public final class532 method1040(int arg0, int arg1, boolean arg2) {
        ++field9138;
        return new class129(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qq", name = "F", descriptor = "(I)V")
    public final void method3668(int arg0) {
        if (arg0 != 0) {
            this.method1109(-128);
        }
        if (this.field9246[this.field9253] != class118.field1507) {
            this.field9246[this.field9253] = class118.field1507;
            this.field9272[this.field9253].method352();
            this.method3674(-84);
        }
        ++field9019;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
    public final void method1038(int arg0) {
        ++field8992;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!qq", name = "G", descriptor = "(I)Lmh;")
    public final class149 method3669(int arg0) {
        ++field9023;
        if (arg0 != -15506) {
            this.method3671((byte) 97);
        }
        return this.field9272[this.field9253];
    }

    @OriginalMember(owner = "client!qq", name = "H", descriptor = "(I)V")
    private final void method3670(int arg0) {
        if (this.field9049 != null) {
            Dimension var2 = this.field9049.getSize();
            this.field9048 = var2.height;
            this.field9018 = var2.width;
        } else {
            this.field9018 = this.field9048 = 1;
        }
        ++field9085;
        this.field8997 = this.field9018;
        this.field9117 = this.field9048;
        this.method3643(87);
        this.method3641(0);
        this.method3651(114);
        this.method2029((byte) 103);
        this.method3660(-1558);
        this.method3642(-48);
        if (arg0 > -104) {
            this.field9201 = true;
        }
        this.method1044();
    }

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "(B)V")
    private final void method3671(byte arg0) {
        if (class492.field6794 != this.field9235) {
            class549 var2 = this.field9235;
            this.field9235 = class492.field6794;
            if (!var2.method3075(arg0 ^ 89)) {
                this.method3611(25736);
            }
            this.method3636((byte) -77);
            this.field9230 = this.field9200;
            this.method3634((byte) 77);
            this.field9207 &= -8;
        }
        ++field9038;
        if (arg0 != -90) {
            this.field9095 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLfv;Lfv;)V")
    public final void method3672(byte arg0, class690 arg1, class690 arg2) {
        int var4 = 28 / ((-30 - arg0) / 37);
        ++field9169;
        boolean var5 = false;
        if (this.field9264[this.field9253] != arg2) {
            this.field9264[this.field9253] = arg2;
            this.method2039(124);
            var5 = true;
        }
        if (this.field9242[this.field9253] != arg1) {
            this.field9242[this.field9253] = arg1;
            this.method2042(true);
            var5 = true;
        }
        if (var5) {
            this.field9207 &= -30;
        }
    }

    @OriginalMember(owner = "client!qq", name = "A", descriptor = "()V")
    public final void method1125() {
        ++field9028;
        if (this.field9226 != null) {
            this.field9226.method56((byte) 76);
        }
    }

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "(Z)V")
    public abstract void method2013(boolean arg0);

    @OriginalMember(owner = "client!qq", name = "u", descriptor = "()Z")
    public final boolean method1071() {
        ++field9000;
        return true;
    }

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "(I)V")
    public static void method3673(int arg0) {
        field9139 = null;
        field9044 = null;
        if (arg0 != -27846) {
            method3656(false, 106, 16, true, 103);
        }
        field9100 = null;
        field9081 = null;
    }

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "(I)V")
    public final void method1109(int arg0) {
        ++field9151;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            if (this.field9226 != null) {
                this.field9226.method56((byte) 76);
            }
            this.field9192 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "(I)V")
    private final void method3674(int arg0) {
        ++field9064;
        if (arg0 >= -42) {
            this.field9197 = true;
        }
        this.method2001(-124);
        if (this.field9227 != null) {
            this.field9227.method129(34);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lcca;IIII)Lda;")
    public final class470 method1089(class250 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9010;
        return new class123(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "(I)Lmh;")
    public final class149 method3675(int arg0) {
        int var2 = 100 / ((-41 - arg0) / 55);
        ++field9013;
        return this.field9166;
    }

    @OriginalMember(owner = "client!qq", name = "la", descriptor = "(IIII)V")
    public final void method1088(int arg0, int arg1, int arg2, int arg3) {
        ++field9118;
        this.field9252 = arg3;
        this.field9220 = arg1;
        this.field9198 = arg2;
        this.field9261 = arg0;
        this.method3651(-118);
        this.method3641(0);
        this.method3642(-70);
        this.method3660(-1558);
    }

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "(B)V")
    public abstract void method2035(byte arg0);

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "(II)V")
    public abstract void method2000(int arg0, int arg1);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BIZ[[I)Ljn;")
    public abstract class530 method2009(byte arg0, int arg1, boolean arg2, int[][] arg3);

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(IB)V")
    public final void method3676(int arg0, byte arg1) {
        if (~arg0 != -2) {
            if (arg0 != 0) {
                if (arg0 == 2) {
                    this.method3672((byte) 20, class298.field3941, class305.field4076);
                } else if (~arg0 == -4) {
                    this.method3672((byte) 61, class274.field3642, class297.field3927);
                } else if (arg0 == 4) {
                    this.method3672((byte) -97, class100.field1201, class100.field1201);
                }
            } else {
                this.method3672((byte) -95, class274.field3642, class274.field3642);
            }
        } else {
            this.method3672((byte) 92, class298.field3941, class298.field3941);
        }
        if (arg1 != -84) {
            this.field9168 = -64;
        }
        ++field9125;
    }

    @OriginalMember(owner = "client!qq", name = "L", descriptor = "(I)V")
    public abstract void method2014(int arg0);

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "()Lq;")
    public final class487 method1075() {
        ++field9087;
        return new class149();
    }

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "(B)I")
    public final int method3677(byte arg0) {
        if (arg0 != 34) {
            this.method1125();
        }
        ++field9092;
        return this.field9208;
    }

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "()Z")
    public final boolean method1099() {
        ++field9021;
        return false;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[Lqea;)V")
    public final void method1111(int arg0, class392[] arg1) {
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field9232[var3] = arg1[var3];
        }
        ++field9121;
        this.field9177 = arg0;
        if (this.field9235.method3075(-1)) {
            this.method2045(112);
        }
    }

    @OriginalMember(owner = "client!qq", name = "M", descriptor = "(I)V")
    public abstract void method2047(int arg0);

    @OriginalMember(owner = "client!qq", name = "s", descriptor = "(B)V")
    public abstract void method2038(byte arg0);

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "(Z)V")
    public abstract void method1995(boolean arg0);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZLed;B)V")
    public abstract void method1991(int arg0, boolean arg1, class116 arg2, byte arg3);

    @OriginalMember(owner = "client!qq", name = "t", descriptor = "(B)V")
    public abstract void method2017(byte arg0);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "([IIIIZII)Lgn;")
    public abstract class691 method2044(int[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qq", name = "N", descriptor = "(I)V")
    public abstract void method2021(int arg0);

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "(II)V")
    public final void method3678(int arg0, int arg1) {
        ++field8986;
        if (arg0 > -125) {
            this.field9294 = null;
        }
        if (this.field9229 != arg1) {
            this.field9229 = arg1;
            this.method2025(Integer.MAX_VALUE);
        }
    }

    @OriginalMember(owner = "client!qq", name = "O", descriptor = "(I)V")
    private final void method3679(int arg0) {
        ++field9001;
        int var2 = 105 % ((20 - arg0) / 35);
        if (!this.field9214) {
            float[] var3 = this.field9228;
            float var4 = (float) (-this.field9261 * this.field9215) / (float) this.field9198;
            float var5 = (float) ((-this.field9261 + this.field8997) * this.field9215) / (float) this.field9198;
            float var6 = (float) (this.field9220 * this.field9215) / (float) this.field9252;
            float var7 = (float) ((this.field9220 - this.field9117) * this.field9215) / (float) this.field9252;
            if (var4 != var5 && var6 != var7) {
                float var8 = (float) this.field9215 * 2.0F;
                var3[8] = (var4 + var5) / (-var4 + var5);
                var3[3] = 0.0F;
                var3[2] = 0.0F;
                var3[10] = this.field9189 = (float) this.field9224 / (float) (-this.field9224 + this.field9215);
                var3[15] = 0.0F;
                var3[12] = 0.0F;
                var3[13] = 0.0F;
                var3[0] = var8 / (var5 - var4);
                var3[5] = var8 / (-var7 + var6);
                var3[4] = 0.0F;
                var3[1] = 0.0F;
                var3[6] = 0.0F;
                var3[11] = -1.0F;
                var3[14] = this.field9206 = (float) (this.field9224 * this.field9215) / (float) (-this.field9224 + this.field9215);
                var3[7] = 0.0F;
                var3[9] = (var6 + var7) / (var6 - var7);
            } else {
                var3[11] = 0.0F;
                var3[10] = 1.0F;
                var3[14] = 0.0F;
                var3[1] = 0.0F;
                var3[9] = 0.0F;
                var3[8] = 0.0F;
                var3[6] = 0.0F;
                var3[12] = 0.0F;
                var3[13] = 0.0F;
                var3[7] = 0.0F;
                var3[4] = 0.0F;
                var3[15] = 1.0F;
                var3[3] = 0.0F;
                var3[2] = 0.0F;
                var3[5] = 1.0F;
                var3[0] = 1.0F;
            }
            this.method3632((byte) -122);
            this.field9214 = true;
        }
    }

    @OriginalMember(owner = "client!qq", name = "P", descriptor = "(I)V")
    public abstract void method2025(int arg0);

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "()Lq;")
    public final class487 method1136() {
        ++field9055;
        return this.field9171;
    }

    @OriginalMember(owner = "client!qq", name = "va", descriptor = "(I)V")
    public final void method1049(int arg0) {
        this.field9236 = 0;
        ++field9165;
        while (arg0 > 1) {
            ++this.field9236;
            arg0 >>= 1;
        }
        this.field9258 = 1 << this.field9236;
    }

    @OriginalMember(owner = "client!qq", name = "u", descriptor = "(B)V")
    public abstract void method1999(byte arg0);

    @OriginalMember(owner = "client!qq", name = "Q", descriptor = "(I)V")
    public void method2049(int arg0) {
        if (arg0 != 0) {
            this.method2017((byte) -93);
        }
        this.method3610(-1);
        ++field9041;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BILjava/lang/String;)V")
    public static final void method3680(byte arg0, int arg1, String arg2) {
        ++field9155;
        if (~arg1 != -1) {
            class562 var3 = null;
            if (arg2 != null) {
                var3 = class562.method3128(0, -21939, class583.field7996, class329.field4418, 0, class315.field4225);
                var3.method1146(0);
                class658 var4 = class538.method3027(class360.field4778, 0, class208.field2785, 0);
                class409 var5 = var3.method1130(var4, class92.method512(class390.field5228, class360.field4778, 0), true);
                class314.method1837((byte) 62);
                class591.method3268(var4, var3, true, arg2, var5, false);
            }
            try {
                class146.field1963 = class562.method3128(class602.field8408.field4325 * 2, -21939, class583.field7996, class329.field4418, arg1, class315.field4225);
                if (arg2 != null) {
                    var3.method1146(0);
                    class658 var6 = class538.method3027(class360.field4778, 0, class208.field2785, 0);
                    class409 var7 = var3.method1130(var6, class92.method512(class390.field5228, class360.field4778, 0), true);
                    class314.method1837((byte) 62);
                    class591.method3268(var6, var3, true, arg2, var7, false);
                }
                if (class146.field1963.method1074()) {
                    boolean var8 = true;
                    try {
                        var8 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var13) {
                    }
                    class381 var9;
                    if (var8) {
                        var9 = class146.field1963.method1078(146800640);
                    } else {
                        var9 = class146.field1963.method1078(104857600);
                    }
                    class146.field1963.method1129(var9);
                }
            } catch (Throwable var14) {
                class146.field1963 = class562.method3128(0, -21939, class583.field7996, class329.field4418, 0, class315.field4225);
                arg1 = 0;
            }
            if (var3 != null) {
                try {
                    var3.method3127(true);
                } catch (Throwable var12) {
                }
            }
        } else {
            class146.field1963 = class562.method3128(class602.field8408.field4325 * 2, -21939, class583.field7996, class329.field4418, 0, class315.field4225);
            if (arg2 != null) {
                class146.field1963.method1146(0);
                class658 var10 = class538.method3027(class360.field4778, 0, class208.field2785, 0);
                class409 var11 = class146.field1963.method1130(var10, class92.method512(class390.field5228, class360.field4778, 0), true);
                class314.method1837((byte) 62);
                class591.method3268(var10, class146.field1963, true, arg2, var11, false);
            }
        }
        class618.field8566 = arg1;
        class630.method3488(0);
        class146.field1963.method1049(32);
        class546.field7466 = class146.field1963.method1075();
        class38.field510 = class146.field1963.method1075();
        class628.method3483((byte) -40);
        class146.field1963.method1058(!class602.field8408.field4298);
        if (class146.field1963.method1100()) {
            class516.method2928(class602.field8408.field4335, 0);
        }
        if (arg0 > -32) {
            field9031 = 59;
        }
        class174.method1188(99, class146.field1963, class703.field9886 >> 3, class431.field5789 >> 3);
        class382.method2189(true);
        class55.field725 = true;
        class375.field4974 = false;
        class28.field408 = null;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public abstract Object method1993(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!qq", name = "R", descriptor = "(I)V")
    public abstract void method2032(int arg0);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lec;I)V")
    public final void method1120(class144 arg0, int arg1) {
        ++field9157;
        this.field9216.method2842(this, 2, arg0, arg1);
    }

    @OriginalMember(owner = "client!qq", name = "v", descriptor = "(B)V")
    public final void method3681(byte arg0) {
        int var2 = 59 % ((arg0 - 52) / 48);
        if (this.field9207 != 16) {
            this.method3671((byte) -90);
            this.method3658((byte) 123, true);
            this.method3638(89, true);
            this.method3628(true, (byte) 120);
            this.method3627(77, 1);
            this.field9207 = 16;
        }
        ++field9086;
    }

    @OriginalMember(owner = "client!qq", name = "w", descriptor = "(B)V")
    public abstract void method2052(byte arg0);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class532 method1076(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field9124;
        class129 var6 = new class129(this, arg2, arg3, arg4);
        var6.method215(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!qq", name = "x", descriptor = "(B)V")
    public abstract void method2030(byte arg0);

    @OriginalMember(owner = "client!qq", name = "S", descriptor = "(I)Lmh;")
    public final class149 method3682(int arg0) {
        int var2 = 95 / ((arg0 - 21) / 52);
        ++field8984;
        return this.field9272[this.field9253];
    }

    @OriginalMember(owner = "client!qq", name = "v", descriptor = "()[I")
    public final int[] method1110() {
        ++field8996;
        return new int[] { this.field9261, this.field9220, this.field9198, this.field9252 };
    }

    @OriginalMember(owner = "client!qq", name = "da", descriptor = "(IIII)V")
    public final void method1042(int arg0, int arg1, int arg2, int arg3) {
        ++field9109;
        if (arg0 <= 0 && arg2 >= this.field8997 + -1 && arg1 <= 0 && ~arg3 <= ~(this.field9117 + -1)) {
            this.method1044();
        } else {
            this.field9250 = ~arg1 > -1 ? 0 : arg1;
            this.field9212 = ~arg0 <= -1 ? arg0 : 0;
            this.field9240 = arg3 > this.field8997 ? 0 : arg3;
            this.field9256 = arg2 > this.field8997 ? 0 : arg2;
            if (!this.field9298) {
                this.field9298 = true;
                this.method1999((byte) -44);
            }
            this.method2030((byte) -80);
            this.method3660(-1558);
        }
    }

    @OriginalMember(owner = "client!qq", name = "y", descriptor = "(B)V")
    public final void method3683(byte arg0) {
        ++field9093;
        if (this.field9207 != 4) {
            this.method3661((byte) -2);
            this.method3658((byte) 123, false);
            this.method3615((byte) -126, false);
            this.method3638(48, false);
            this.method3628(false, (byte) 124);
            this.method3667(-2, false, false, 3);
            this.method3627(86, 1);
            this.method3676(0, (byte) -84);
            this.field9207 = 4;
        }
        int var2 = 106 % ((arg0 - -55) / 37);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method2050(byte arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "(B)V")
    private final void method3684(byte arg0) {
        this.field9285 = this.method1996(false, (byte) 127);
        ++field9022;
        this.field9285.method2567(28, (byte) -122, 140);
        for (int var2 = 0; var2 < 4; ++var2) {
            Buffer var3 = this.field9285.method2566(true, (byte) 6);
            if (var3 != null) {
                Stream var4 = this.method3614(var3, arg0 ^ 85);
                if (Stream.method3445()) {
                    var4.method3439(0.0F);
                    var4.method3439(0.0F);
                    var4.method3439(0.0F);
                    var4.method3439(0.0F);
                    var4.method3439(0.0F);
                    var4.method3439(0.0F);
                    var4.method3439(0.0F);
                    var4.method3439(0.0F);
                    var4.method3439(1.0F);
                    var4.method3439(0.0F);
                    var4.method3439(0.0F);
                    var4.method3439(1.0F);
                    var4.method3439(0.0F);
                    var4.method3439(1.0F);
                    var4.method3439(1.0F);
                    var4.method3439(1.0F);
                    var4.method3439(0.0F);
                    var4.method3439(1.0F);
                    var4.method3439(1.0F);
                    var4.method3439(1.0F);
                    var4.method3439(1.0F);
                    var4.method3439(1.0F);
                    var4.method3439(0.0F);
                    var4.method3439(0.0F);
                    var4.method3439(1.0F);
                    var4.method3439(0.0F);
                    var4.method3439(1.0F);
                    var4.method3439(0.0F);
                    var4.method3439(0.0F);
                    var4.method3439(0.0F);
                    var4.method3439(0.0F);
                    var4.method3439(0.0F);
                    var4.method3439(0.0F);
                    var4.method3439(0.0F);
                    var4.method3439(0.0F);
                } else {
                    var4.method3438(0.0F);
                    var4.method3438(0.0F);
                    var4.method3438(0.0F);
                    var4.method3438(0.0F);
                    var4.method3438(0.0F);
                    var4.method3438(0.0F);
                    var4.method3438(0.0F);
                    var4.method3438(0.0F);
                    var4.method3438(1.0F);
                    var4.method3438(0.0F);
                    var4.method3438(0.0F);
                    var4.method3438(1.0F);
                    var4.method3438(0.0F);
                    var4.method3438(1.0F);
                    var4.method3438(1.0F);
                    var4.method3438(1.0F);
                    var4.method3438(0.0F);
                    var4.method3438(1.0F);
                    var4.method3438(1.0F);
                    var4.method3438(1.0F);
                    var4.method3438(1.0F);
                    var4.method3438(1.0F);
                    var4.method3438(0.0F);
                    var4.method3438(0.0F);
                    var4.method3438(1.0F);
                    var4.method3438(0.0F);
                    var4.method3438(1.0F);
                    var4.method3438(0.0F);
                    var4.method3438(0.0F);
                    var4.method3438(0.0F);
                    var4.method3438(0.0F);
                    var4.method3438(0.0F);
                    var4.method3438(0.0F);
                    var4.method3438(0.0F);
                    var4.method3438(0.0F);
                }
                var4.method3440();
                if (this.field9285.method2564(arg0 + -127)) {
                    break;
                }
            }
        }
        if (arg0 == 85) {
            this.field9284 = this.method2015((byte) -85, new class636[] { new class636(new class255[] { class255.field3339, class255.field3346, class255.field3346 }) });
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIILkga;IILjb;)V")
    public abstract void method2040(int arg0, int arg1, int arg2, class556 arg3, int arg4, int arg5, class498 arg6);

    @OriginalMember(owner = "client!qq", name = "MA", descriptor = "(III[I)V")
    public final void method1118(int arg0, int arg1, int arg2, int[] arg3) {
        ++field9105;
        float var5 = this.field9171.method862((float) arg2, 16383, (float) arg0, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field9220;
            var7 = this.field9261;
        } else {
            var7 = (int) ((float) this.field9198 * this.field9171.method861((float) arg1, -101, (float) arg2, (float) arg0) / var5);
            var6 = (int) ((float) this.field9252 * this.field9171.method852((float) arg0, (float) arg1, (float) arg2, true) / var5);
        }
        arg3[0] = (int) ((float) var7 - this.field9274);
        arg3[1] = (int) ((float) var6 - this.field9255);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "()Z")
    public final boolean method1135() {
        ++field9051;
        return this.field9243[3].method125(-20112);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public final class270 method1037(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field9107;
        return new class704(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qq", name = "T", descriptor = "(I)V")
    public final void method3685(int arg0) {
        this.field9164 = false;
        if (arg0 > -13) {
            this.field9173 = null;
        }
        ++field9097;
        this.method3659(22598);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IILwr;)V")
    public abstract void method2020(int arg0, int arg1, class697 arg2);

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(IIIIII)V")
    public final void method1101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8988;
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
        if (this.method3646((float) arg3 + var8, 0.0F, (float) arg0, 0.0F, (float) arg1, (byte) -81, (float) arg2 + var9)) {
            this.method3621(0);
            this.method3678(-128, arg4);
            this.method3624(class137.field1869, -110, 0);
            this.method3666(0, class137.field1869, (byte) -83);
            this.method3627(100, arg5);
            this.method3622(-22561);
            this.method2026(-30817, false);
            this.method3633(25886);
            this.method2026(-30817, true);
            this.method3666(0, class630.field8719, (byte) -83);
            this.method3624(class630.field8719, -107, 0);
        }
    }

    @OriginalMember(owner = "client!qq", name = "IA", descriptor = "(IIIIII[BII)V")
    public final void method1066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field9082;
    }

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "(Z)V")
    public final void method3686(boolean arg0) {
        if (!arg0) {
            ++field9074;
            if (~this.field9207 != -9) {
                this.method3692(false);
                this.method3658((byte) 127, true);
                this.method3638(77, true);
                this.method3628(true, (byte) -56);
                this.method3627(56, 1);
                this.field9207 = 8;
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "A", descriptor = "(B)V")
    public final void method3687(byte arg0) {
        ++field8980;
        Enumeration var2 = this.field9025.keys();
        while (var2.hasMoreElements()) {
            Canvas var4 = (Canvas) var2.nextElement();
            this.method2050((byte) -12, var4, this.field9025.get(var4));
        }
        this.field9285.method1758((byte) 115);
        this.field9278.method1758((byte) -53);
        this.field9295.method740(-1);
        int var3 = -59 % ((arg0 - 13) / 49);
        this.field9279.method740(-1);
        this.field9283.method740(-1);
        this.field9281.method740(-1);
        this.field9293.method740(-1);
        this.field9216.method2840(123);
        this.field9290.method1758((byte) 106);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lsk;Lvea;I)Z")
    public abstract boolean method2043(class452 arg0, class404 arg1, int arg2);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILed;IZZ)V")
    public abstract void method2011(int arg0, class116 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!qq", name = "U", descriptor = "(I)V")
    public abstract void method2001(int arg0);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)I")
    public final int method1080(int arg0, int arg1) {
        ++field9016;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qq", name = "B", descriptor = "(B)I")
    public final int method3688(byte arg0) {
        ++field9008;
        if (arg0 >= -27) {
            this.method3654(15);
        }
        return this.field9209;
    }

    @OriginalMember(owner = "client!qq", name = "C", descriptor = "()Z")
    public final boolean method1065() {
        ++field8999;
        return false;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIILsk;I[BZI)Lgn;")
    public abstract class691 method2028(int arg0, int arg1, int arg2, class452 arg3, int arg4, byte[] arg5, boolean arg6, int arg7);

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "(Z)V")
    private final void method3689(boolean arg0) {
        if (!arg0) {
            this.field9220 = 76;
        }
        ++field9060;
        if (!this.field9210) {
            float[] var2 = this.field9271;
            this.field9210 = true;
            if (~this.field8997 != -1 && this.field9117 != 0) {
                var2[5] = -2.0F / (float) this.field9117;
                var2[9] = 0.0F;
                var2[8] = 0.0F;
                var2[13] = 1.0F;
                var2[2] = 0.0F;
                var2[1] = 0.0F;
                var2[0] = 2.0F / (float) this.field8997;
                var2[11] = 0.0F;
                var2[15] = 1.0F;
                var2[10] = 0.5F;
                var2[12] = -1.0F;
                var2[4] = 0.0F;
                var2[6] = 0.0F;
                var2[3] = 0.0F;
                var2[7] = 0.0F;
                var2[14] = 0.5F;
            } else {
                var2[13] = 0.0F;
                var2[7] = 0.0F;
                var2[11] = 0.0F;
                var2[14] = 0.0F;
                var2[10] = 1.0F;
                var2[8] = 0.0F;
                var2[4] = 0.0F;
                var2[5] = 1.0F;
                var2[1] = 0.0F;
                var2[15] = 1.0F;
                var2[3] = 0.0F;
                var2[9] = 0.0F;
                var2[2] = 0.0F;
                var2[12] = 0.0F;
                var2[6] = 0.0F;
                var2[0] = 1.0F;
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "V", descriptor = "(I)V")
    private final void method3690(int arg0) {
        this.field9278 = this.method1996(true, (byte) 120);
        int var2 = 49 / ((46 - arg0) / 52);
        ++field9150;
        this.field9278.method2567(12, (byte) -127, 24);
        this.field9282 = this.method2015((byte) -85, new class636[] { new class636(class255.field3339) });
    }

    @OriginalMember(owner = "client!qq", name = "W", descriptor = "(I)V")
    public final void method3691(int arg0) {
        ++field9012;
        Hashtable var2 = new Hashtable();
        if (this.field9025 != null && !this.field9025.isEmpty()) {
            Enumeration var3 = this.field9025.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method1993(var4, 108));
            }
        }
        this.field9025 = var2;
        this.method3684((byte) 85);
        if (arg0 == 8) {
            this.method3690(arg0 ^ -37);
            this.field9216.method2846(this, (byte) 20);
        }
    }

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "(Z)V")
    private final void method3692(boolean arg0) {
        if (class687.field9702 != this.field9235) {
            class549 var2 = this.field9235;
            this.field9235 = class687.field9702;
            if (!var2.method3075(-1)) {
                this.method3611(25736);
            }
            this.method3679(90);
            this.field9230 = this.field9228;
            this.method3634((byte) 77);
            this.field9207 &= -8;
        }
        if (arg0) {
            this.field9088 = null;
        }
        ++field8990;
    }

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "()Lq;")
    public final class487 method1153() {
        ++field9009;
        return this.field9277;
    }
}
