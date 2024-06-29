import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public abstract class class449 extends class66 {

    @OriginalMember(owner = "client!wg", name = "xd", descriptor = "Lifa;")
    private class450 field6185 = new class450();

    @OriginalMember(owner = "client!wg", name = "ee", descriptor = "Z")
    public boolean field6218 = true;

    @OriginalMember(owner = "client!wg", name = "fe", descriptor = "Leia;")
    public class256 field6219 = new class256();

    @OriginalMember(owner = "client!wg", name = "ie", descriptor = "Leia;")
    public class256 field6222 = new class256();

    @OriginalMember(owner = "client!wg", name = "je", descriptor = "Leia;")
    public class256 field6223 = new class256();

    @OriginalMember(owner = "client!wg", name = "ke", descriptor = "Leia;")
    public class256 field6224 = new class256();

    @OriginalMember(owner = "client!wg", name = "le", descriptor = "Leia;")
    private class256 field6225 = new class256();

    @OriginalMember(owner = "client!wg", name = "me", descriptor = "Leia;")
    private class256 field6226 = new class256();

    @OriginalMember(owner = "client!wg", name = "Oe", descriptor = "I")
    public int field6254 = 0;

    @OriginalMember(owner = "client!wg", name = "te", descriptor = "[F")
    public float[] field6233 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!wg", name = "Le", descriptor = "I")
    public int field6251 = 0;

    @OriginalMember(owner = "client!wg", name = "Ke", descriptor = "Lgp;")
    public class53 field6250 = class303.field3614;

    @OriginalMember(owner = "client!wg", name = "Pe", descriptor = "F")
    public float field6255 = 1.0F;

    @OriginalMember(owner = "client!wg", name = "Be", descriptor = "F")
    public float field6241 = -1.0F;

    @OriginalMember(owner = "client!wg", name = "Ze", descriptor = "Z")
    private boolean field6265 = false;

    @OriginalMember(owner = "client!wg", name = "ye", descriptor = "Z")
    public boolean field6238 = false;

    @OriginalMember(owner = "client!wg", name = "ve", descriptor = "I")
    private int field6235 = 16777215;

    @OriginalMember(owner = "client!wg", name = "we", descriptor = "Z")
    public boolean field6236 = true;

    @OriginalMember(owner = "client!wg", name = "Ee", descriptor = "I")
    private int field6244 = 1;

    @OriginalMember(owner = "client!wg", name = "lf", descriptor = "F")
    public float field6276 = 1.0F;

    @OriginalMember(owner = "client!wg", name = "hf", descriptor = "F")
    private float field6273 = 1.0F;

    @OriginalMember(owner = "client!wg", name = "Ne", descriptor = "I")
    public int field6253 = 8;

    @OriginalMember(owner = "client!wg", name = "ff", descriptor = "I")
    public int field6271 = 512;

    @OriginalMember(owner = "client!wg", name = "re", descriptor = "I")
    public int field6231 = -1;

    @OriginalMember(owner = "client!wg", name = "Ce", descriptor = "Z")
    private boolean field6242 = false;

    @OriginalMember(owner = "client!wg", name = "of", descriptor = "Z")
    private boolean field6279 = false;

    @OriginalMember(owner = "client!wg", name = "wf", descriptor = "I")
    private int field6287 = 0;

    @OriginalMember(owner = "client!wg", name = "xf", descriptor = "[Lbda;")
    private class532[] field6288 = new class532[10];

    @OriginalMember(owner = "client!wg", name = "bf", descriptor = "I")
    public int field6267 = 3;

    @OriginalMember(owner = "client!wg", name = "ne", descriptor = "I")
    public int field6227 = 3584;

    @OriginalMember(owner = "client!wg", name = "se", descriptor = "I")
    public int field6232 = 0;

    @OriginalMember(owner = "client!wg", name = "ue", descriptor = "I")
    public int field6234 = 0;

    @OriginalMember(owner = "client!wg", name = "Gf", descriptor = "I")
    private int field6297 = -1;

    @OriginalMember(owner = "client!wg", name = "Ff", descriptor = "I")
    public int field6296 = 0;

    @OriginalMember(owner = "client!wg", name = "Ef", descriptor = "[F")
    private float[] field6295 = new float[16];

    @OriginalMember(owner = "client!wg", name = "jf", descriptor = "[F")
    private float[] field6274 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!wg", name = "ze", descriptor = "Z")
    public boolean field6239 = false;

    @OriginalMember(owner = "client!wg", name = "sf", descriptor = "[F")
    public float[] field6283 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!wg", name = "Mf", descriptor = "Z")
    public boolean field6303 = false;

    @OriginalMember(owner = "client!wg", name = "Vf", descriptor = "Z")
    private boolean field6312 = false;

    @OriginalMember(owner = "client!wg", name = "Pf", descriptor = "Z")
    public boolean field6306 = true;

    @OriginalMember(owner = "client!wg", name = "cf", descriptor = "[F")
    public float[] field6268 = this.field6274;

    @OriginalMember(owner = "client!wg", name = "Qf", descriptor = "I")
    public int field6307 = -1;

    @OriginalMember(owner = "client!wg", name = "uf", descriptor = "[F")
    private float[] field6285 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!wg", name = "yf", descriptor = "I")
    private int field6289 = 0;

    @OriginalMember(owner = "client!wg", name = "Wf", descriptor = "I")
    private int field6313 = -1;

    @OriginalMember(owner = "client!wg", name = "pf", descriptor = "F")
    public float field6280 = -1.0F;

    @OriginalMember(owner = "client!wg", name = "Zf", descriptor = "Z")
    public boolean field6316 = true;

    @OriginalMember(owner = "client!wg", name = "De", descriptor = "[F")
    private float[] field6243 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!wg", name = "ag", descriptor = "I")
    public int field6317 = 0;

    @OriginalMember(owner = "client!wg", name = "rf", descriptor = "I")
    public int field6282 = 0;

    @OriginalMember(owner = "client!wg", name = "Ve", descriptor = "I")
    public int field6261 = 0;

    @OriginalMember(owner = "client!wg", name = "Jf", descriptor = "I")
    public int field6300 = 128;

    @OriginalMember(owner = "client!wg", name = "Me", descriptor = "Z")
    private boolean field6252 = false;

    @OriginalMember(owner = "client!wg", name = "bg", descriptor = "I")
    private int field6318 = 0;

    @OriginalMember(owner = "client!wg", name = "fg", descriptor = "I")
    public int field6322 = 50;

    @OriginalMember(owner = "client!wg", name = "Je", descriptor = "Z")
    public boolean field6249 = false;

    @OriginalMember(owner = "client!wg", name = "df", descriptor = "I")
    private int field6269 = -1;

    @OriginalMember(owner = "client!wg", name = "cg", descriptor = "I")
    private int field6319 = 0;

    @OriginalMember(owner = "client!wg", name = "Af", descriptor = "[F")
    private float[] field6291 = new float[16];

    @OriginalMember(owner = "client!wg", name = "Bf", descriptor = "Lsv;")
    public class688 field6292 = class461.field6481;

    @OriginalMember(owner = "client!wg", name = "Yf", descriptor = "F")
    public float field6315 = 3584.0F;

    @OriginalMember(owner = "client!wg", name = "gg", descriptor = "F")
    public float field6323 = 1.0F;

    @OriginalMember(owner = "client!wg", name = "qf", descriptor = "F")
    public float field6281 = 1.0F;

    @OriginalMember(owner = "client!wg", name = "Ue", descriptor = "Z")
    private boolean field6260 = false;

    @OriginalMember(owner = "client!wg", name = "kf", descriptor = "I")
    public int field6275 = 512;

    @OriginalMember(owner = "client!wg", name = "Nf", descriptor = "I")
    public int field6304 = 0;

    @OriginalMember(owner = "client!wg", name = "af", descriptor = "I")
    public int field6266 = 0;

    @OriginalMember(owner = "client!wg", name = "Of", descriptor = "Z")
    public boolean field6305 = true;

    @OriginalMember(owner = "client!wg", name = "ig", descriptor = "Z")
    public boolean field6325 = true;

    @OriginalMember(owner = "client!wg", name = "hg", descriptor = "F")
    public float field6324 = 3584.0F;

    @OriginalMember(owner = "client!wg", name = "xe", descriptor = "[F")
    private float[] field6237 = new float[16];

    @OriginalMember(owner = "client!wg", name = "dg", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6320 = new Stream();

    @OriginalMember(owner = "client!wg", name = "ug", descriptor = "Leia;")
    private class256 field6337 = new class256();

    @OriginalMember(owner = "client!wg", name = "Nd", descriptor = "Ljava/awt/Canvas;")
    public Canvas field6201;

    @OriginalMember(owner = "client!wg", name = "Fb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6089;

    @OriginalMember(owner = "client!wg", name = "Fc", descriptor = "Lbt;")
    public class48 field6141;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "Ljava/lang/Object;")
    public Object field6038;

    @OriginalMember(owner = "client!wg", name = "zc", descriptor = "Ljava/lang/Object;")
    private Object field6135;

    @OriginalMember(owner = "client!wg", name = "Qe", descriptor = "I")
    public int field6256;

    @OriginalMember(owner = "client!wg", name = "Pc", descriptor = "I")
    private int field6151;

    @OriginalMember(owner = "client!wg", name = "Mb", descriptor = "I")
    public int field6096;

    @OriginalMember(owner = "client!wg", name = "Fe", descriptor = "I")
    public int field6245;

    @OriginalMember(owner = "client!wg", name = "Vc", descriptor = "I")
    private int field6157;

    @OriginalMember(owner = "client!wg", name = "Mc", descriptor = "I")
    public int field6148;

    @OriginalMember(owner = "client!wg", name = "Lf", descriptor = "Lhg;")
    private class721 field6302;

    @OriginalMember(owner = "client!wg", name = "Kb", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field6094;

    @OriginalMember(owner = "client!wg", name = "Qb", descriptor = "I")
    public static int field6100 = 0;

    @OriginalMember(owner = "client!wg", name = "Bc", descriptor = "Lhj;")
    public static class596 field6137 = new class596(119, -1);

    @OriginalMember(owner = "client!wg", name = "Ge", descriptor = "F")
    public float field6246;

    @OriginalMember(owner = "client!wg", name = "Se", descriptor = "F")
    public float field6258;

    @OriginalMember(owner = "client!wg", name = "nf", descriptor = "F")
    public float field6278;

    @OriginalMember(owner = "client!wg", name = "tf", descriptor = "F")
    public float field6284;

    @OriginalMember(owner = "client!wg", name = "vf", descriptor = "F")
    private float field6286;

    @OriginalMember(owner = "client!wg", name = "Kf", descriptor = "F")
    public float field6301;

    @OriginalMember(owner = "client!wg", name = "eg", descriptor = "F")
    public float field6321;

    @OriginalMember(owner = "client!wg", name = "jg", descriptor = "F")
    private float field6326;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!wg", name = "bb", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!wg", name = "cb", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!wg", name = "db", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!wg", name = "eb", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!wg", name = "fb", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!wg", name = "gb", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!wg", name = "hb", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!wg", name = "ib", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!wg", name = "jb", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!wg", name = "kb", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!wg", name = "mb", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!wg", name = "nb", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!wg", name = "ob", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!wg", name = "pb", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!wg", name = "qb", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!wg", name = "rb", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!wg", name = "sb", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!wg", name = "tb", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!wg", name = "ub", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!wg", name = "vb", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!wg", name = "wb", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!wg", name = "xb", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!wg", name = "yb", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!wg", name = "zb", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!wg", name = "Ab", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!wg", name = "Bb", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!wg", name = "Cb", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!wg", name = "Db", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!wg", name = "Eb", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!wg", name = "Gb", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!wg", name = "Hb", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!wg", name = "Ib", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!wg", name = "Jb", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!wg", name = "Lb", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!wg", name = "Nb", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!wg", name = "Ob", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!wg", name = "Pb", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!wg", name = "Rb", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!wg", name = "Sb", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!wg", name = "Tb", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!wg", name = "Ub", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!wg", name = "Wb", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!wg", name = "Xb", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!wg", name = "Yb", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!wg", name = "Zb", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!wg", name = "ac", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!wg", name = "bc", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!wg", name = "cc", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!wg", name = "dc", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!wg", name = "ec", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!wg", name = "fc", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!wg", name = "gc", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!wg", name = "hc", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!wg", name = "ic", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!wg", name = "jc", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!wg", name = "kc", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!wg", name = "mc", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!wg", name = "nc", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!wg", name = "oc", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!wg", name = "pc", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!wg", name = "qc", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!wg", name = "rc", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!wg", name = "sc", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!wg", name = "tc", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!wg", name = "uc", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!wg", name = "vc", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!wg", name = "wc", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!wg", name = "xc", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!wg", name = "yc", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!wg", name = "Ac", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!wg", name = "Cc", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!wg", name = "Dc", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!wg", name = "Ec", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!wg", name = "Gc", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!wg", name = "Hc", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!wg", name = "Ic", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!wg", name = "Jc", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!wg", name = "Kc", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!wg", name = "Lc", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!wg", name = "Nc", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!wg", name = "Oc", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!wg", name = "Qc", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!wg", name = "Rc", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!wg", name = "Sc", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!wg", name = "Tc", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!wg", name = "Uc", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!wg", name = "Wc", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!wg", name = "Xc", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!wg", name = "Yc", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!wg", name = "Zc", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!wg", name = "ad", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!wg", name = "bd", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!wg", name = "cd", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!wg", name = "dd", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!wg", name = "ed", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!wg", name = "fd", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!wg", name = "gd", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!wg", name = "hd", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!wg", name = "id", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!wg", name = "jd", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!wg", name = "kd", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!wg", name = "ld", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!wg", name = "md", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!wg", name = "nd", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!wg", name = "od", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!wg", name = "pd", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!wg", name = "qd", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!wg", name = "rd", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!wg", name = "sd", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!wg", name = "td", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!wg", name = "ud", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!wg", name = "vd", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!wg", name = "wd", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!wg", name = "yd", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!wg", name = "zd", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!wg", name = "Ad", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!wg", name = "Bd", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!wg", name = "Cd", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!wg", name = "Dd", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!wg", name = "Ed", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!wg", name = "Fd", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!wg", name = "Gd", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!wg", name = "Hd", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!wg", name = "Id", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!wg", name = "Jd", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!wg", name = "Kd", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!wg", name = "Ld", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!wg", name = "Md", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!wg", name = "Od", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!wg", name = "Pd", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!wg", name = "Qd", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!wg", name = "Rd", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!wg", name = "Sd", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!wg", name = "Td", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!wg", name = "Ud", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!wg", name = "Vd", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!wg", name = "Wd", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!wg", name = "Xd", descriptor = "I")
    public int field6211;

    @OriginalMember(owner = "client!wg", name = "Yd", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!wg", name = "Zd", descriptor = "I")
    public int field6213;

    @OriginalMember(owner = "client!wg", name = "ae", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!wg", name = "be", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!wg", name = "ce", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!wg", name = "de", descriptor = "I")
    public int field6217;

    @OriginalMember(owner = "client!wg", name = "he", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!wg", name = "pe", descriptor = "I")
    public int field6229;

    @OriginalMember(owner = "client!wg", name = "qe", descriptor = "I")
    private int field6230;

    @OriginalMember(owner = "client!wg", name = "He", descriptor = "I")
    public int field6247;

    @OriginalMember(owner = "client!wg", name = "Ie", descriptor = "I")
    public int field6248;

    @OriginalMember(owner = "client!wg", name = "Te", descriptor = "I")
    public int field6259;

    @OriginalMember(owner = "client!wg", name = "We", descriptor = "I")
    public int field6262;

    @OriginalMember(owner = "client!wg", name = "Ye", descriptor = "I")
    public int field6264;

    @OriginalMember(owner = "client!wg", name = "gf", descriptor = "I")
    public int field6272;

    @OriginalMember(owner = "client!wg", name = "zf", descriptor = "I")
    private int field6290;

    @OriginalMember(owner = "client!wg", name = "kg", descriptor = "I")
    public int field6327;

    @OriginalMember(owner = "client!wg", name = "Hg", descriptor = "I")
    private int field6350;

    @OriginalMember(owner = "client!wg", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!wg", name = "tg", descriptor = "Loda;")
    private class129 field6336;

    @OriginalMember(owner = "client!wg", name = "xg", descriptor = "Loda;")
    private class129 field6340;

    @OriginalMember(owner = "client!wg", name = "Bg", descriptor = "Loda;")
    private class129 field6344;

    @OriginalMember(owner = "client!wg", name = "Xe", descriptor = "Ldka;")
    private class13 field6263;

    @OriginalMember(owner = "client!wg", name = "Vb", descriptor = "Lrfa;")
    public class213 field6105;

    @OriginalMember(owner = "client!wg", name = "Re", descriptor = "Lgaa;")
    public class315 field6257;

    @OriginalMember(owner = "client!wg", name = "mf", descriptor = "Lsc;")
    private class368 field6277;

    @OriginalMember(owner = "client!wg", name = "Eg", descriptor = "Lje;")
    private class422 field6347;

    @OriginalMember(owner = "client!wg", name = "Tf", descriptor = "Lbda;")
    private class532 field6310;

    @OriginalMember(owner = "client!wg", name = "lg", descriptor = "Lsk;")
    public class650 field6328;

    @OriginalMember(owner = "client!wg", name = "ng", descriptor = "Lsk;")
    public class650 field6330;

    @OriginalMember(owner = "client!wg", name = "rg", descriptor = "Lsk;")
    public class650 field6334;

    @OriginalMember(owner = "client!wg", name = "sg", descriptor = "Lsk;")
    public class650 field6335;

    @OriginalMember(owner = "client!wg", name = "vg", descriptor = "Lsk;")
    public class650 field6338;

    @OriginalMember(owner = "client!wg", name = "zg", descriptor = "Lsk;")
    public class650 field6342;

    @OriginalMember(owner = "client!wg", name = "Ag", descriptor = "Lsk;")
    public class650 field6343;

    @OriginalMember(owner = "client!wg", name = "Dg", descriptor = "Lsk;")
    public class650 field6346;

    @OriginalMember(owner = "client!wg", name = "Fg", descriptor = "Lsk;")
    public class650 field6348;

    @OriginalMember(owner = "client!wg", name = "Gg", descriptor = "Lsk;")
    public class650 field6349;

    @OriginalMember(owner = "client!wg", name = "mg", descriptor = "Lnca;")
    public class785 field6329;

    @OriginalMember(owner = "client!wg", name = "og", descriptor = "Lnca;")
    private class785 field6331;

    @OriginalMember(owner = "client!wg", name = "pg", descriptor = "Lnca;")
    private class785 field6332;

    @OriginalMember(owner = "client!wg", name = "qg", descriptor = "Lnca;")
    public class785 field6333;

    @OriginalMember(owner = "client!wg", name = "wg", descriptor = "Lnca;")
    public class785 field6339;

    @OriginalMember(owner = "client!wg", name = "yg", descriptor = "Lnca;")
    private class785 field6341;

    @OriginalMember(owner = "client!wg", name = "Cg", descriptor = "Lnca;")
    public class785 field6345;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field6039;

    @OriginalMember(owner = "client!wg", name = "lb", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field6069;

    @OriginalMember(owner = "client!wg", name = "lc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field6121;

    @OriginalMember(owner = "client!wg", name = "oe", descriptor = "Z")
    public boolean field6228;

    @OriginalMember(owner = "client!wg", name = "Ae", descriptor = "Z")
    public boolean field6240;

    @OriginalMember(owner = "client!wg", name = "ef", descriptor = "Z")
    public boolean field6270;

    @OriginalMember(owner = "client!wg", name = "Cf", descriptor = "Z")
    public boolean field6293;

    @OriginalMember(owner = "client!wg", name = "Rf", descriptor = "Z")
    public boolean field6308;

    @OriginalMember(owner = "client!wg", name = "Ig", descriptor = "Z")
    public boolean field6351;

    @OriginalMember(owner = "client!wg", name = "Hf", descriptor = "[Lei;")
    public class191[] field6298;

    @OriginalMember(owner = "client!wg", name = "Sf", descriptor = "[Lei;")
    public class191[] field6309;

    @OriginalMember(owner = "client!wg", name = "Df", descriptor = "[Leia;")
    public class256[] field6294;

    @OriginalMember(owner = "client!wg", name = "Xf", descriptor = "[Lgaa;")
    private class315[] field6314;

    @OriginalMember(owner = "client!wg", name = "If", descriptor = "[Lkp;")
    public class515[] field6299;

    @OriginalMember(owner = "client!wg", name = "Uf", descriptor = "[Lsi;")
    public class586[] field6311;

    @OriginalMember(owner = "client!wg", name = "ge", descriptor = "[[B")
    public static byte[][] field6220;

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "(IIIII)V", line = 3)
    public final void method597(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method592(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
        ++field6067;
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(B)V", line = 15)
    private final void method2642(byte arg0) {
        ++field6091;
        this.method43(1);
        if (arg0 != 113) {
            this.field6239 = false;
        }
        if (this.field6310 != null) {
            this.field6310.method704((byte) 121);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILgaa;)V", line = 33)
    public final void method2643(int arg0, class315 arg1) {
        ++field6080;
        if (arg0 != -2) {
            this.method610();
        }
        if (this.field6314[this.field6261] != arg1) {
            this.field6314[this.field6261] = arg1;
            if (arg1 != null) {
                arg1.method1726(-103);
            } else {
                this.method22(2);
            }
            this.field6230 &= -2;
        }
    }

    @OriginalMember(owner = "client!wg", name = "xa", descriptor = "(F)V", line = 54)
    public final void method626(float arg0) {
        if (this.field6255 != arg0) {
            this.field6255 = arg0;
            this.field6094.setAmbient(arg0);
            this.method9(-111);
            this.method74(-8);
        }
        ++field6049;
    }

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "()I", line = 69)
    public final int method616() {
        ++field6082;
        return this.field6217 + this.field6213 - -this.field6211;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZ)Ltf;", line = 78)
    public final class312 method638(int arg0, int arg1, boolean arg2) {
        ++field6133;
        return new class612(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(B)V", line = 87)
    private final void method2644(byte arg0) {
        if (arg0 >= -56) {
            this.field6234 = -47;
        }
        ++field6159;
        this.field6265 = false;
        if (this.field6310 != null) {
            this.field6310.method706((byte) -51);
        }
        this.method80((byte) 122);
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lbt;II)V", line = 102)
    public class449(Canvas arg0, Object arg1, class162 arg2, class48 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            this.field6089 = this.field6201 = arg0;
            this.field6141 = arg3;
            this.field6135 = this.field6038 = arg1;
            this.field6256 = arg4;
            Dimension var7 = arg0.getSize();
            this.field6096 = this.field6151 = var7.height;
            this.field6245 = arg5;
            this.field6148 = this.field6157 = var7.width;
            class322.method1922(false, (byte) 90, true);
            if (super.field890 != null) {
                this.field6302 = new class721(this, super.field890);
                this.field6094 = new NativeInterface(super.field890.method1134(31932), this.field6245);
                for (int var8 = 0; ~super.field890.method1134(31932) < ~var8; ++var8) {
                    class359 var9 = super.field890.method1138(var8, 68);
                    if (var9 != null) {
                        this.field6094.initTextureMetrics(var8, var9.field4462, var9.field4458);
                    }
                }
            } else {
                this.field6094 = new NativeInterface(0, this.field6245);
                this.field6302 = null;
            }
        } catch (Throwable var11) {
            var11.printStackTrace();
            this.method559((byte) 1);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V", line = 151)
    public final void method2645(int arg0) {
        if (~this.field6230 != -3) {
            this.method2690(-1428394296);
            this.method2669((byte) 108, false);
            this.method2675(false, arg0 ^ -20433);
            this.method2672(124, false);
            this.method2666(8, false);
            this.method2711(arg0 ^ -20440, false, -2, false);
            this.field6230 = 2;
        }
        ++field6029;
        if (arg0 != 20439) {
            this.field6234 = -24;
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(Z)V", line = 174)
    private final void method2646(boolean arg0) {
        ++field6052;
        this.field6242 = false;
        this.method2658((byte) -25);
        if (arg0) {
            if (class276.field3240 == this.field6292) {
                this.method2642((byte) 113);
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(II)Lbda;", line = 190)
    public class532 method16(int arg0, int arg1) {
        ++field6032;
        if (arg1 != -12567) {
            this.field6257 = null;
        }
        if (~arg0 != -7) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    return ~arg0 == -8 ? new class135(this) : new class383(this);
                } else {
                    return new class583(this, this.field6105);
                }
            } else {
                return new class172(this);
            }
        } else {
            return new class501(this);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(FI)V", line = 244)
    public final void method2647(float arg0, int arg1) {
        ++field6208;
        int var3 = 118 % ((arg1 - 27) / 60);
        if (this.field6273 != arg0) {
            this.field6273 = arg0;
            this.method2646(true);
        }
    }

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "(IIIII)V", line = 262)
    public final void method593(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method592(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
        ++field6214;
    }

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "(I)V", line = 273)
    public final void method2648(int arg0) {
        if (this.field6230 != 4) {
            this.method2690(arg0 ^ -1428416671);
            this.method2669((byte) 113, false);
            this.method2675(false, arg0 ^ -31151);
            this.method2672(124, false);
            this.method2666(arg0 ^ 31137, false);
            this.method2711(-1, false, -2, false);
            this.method2699((byte) 14, 1);
            this.method2649((byte) 126, 0);
            this.field6230 = 4;
        }
        ++field6122;
        if (arg0 != 31145) {
            this.field6240 = true;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(BI)V", line = 297)
    public final void method2649(byte arg0, int arg1) {
        if (arg1 != 1) {
            if (~arg1 == -1) {
                this.method2716(class269.field3180, 110, class269.field3180);
            } else if (arg1 != 2) {
                if (arg1 == 3) {
                    this.method2716(class269.field3180, 96, class555.field7726);
                } else if (arg1 == 4) {
                    this.method2716(class391.field5076, 125, class391.field5076);
                }
            } else {
                this.method2716(class75.field1039, 120, class8.field135);
            }
        } else {
            this.method2716(class75.field1039, arg0 ^ 46, class75.field1039);
        }
        if (arg0 == 126) {
            ++field6055;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLjaclib/memory/Buffer;)Ljaclib/memory/Stream;", line = 328)
    public final Stream method2650(byte arg0, Buffer arg1) {
        ++field6130;
        this.field6320.method3990(arg1);
        int var3 = -36 / ((arg0 - 45) / 38);
        return this.field6320;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lza;)V", line = 340)
    public final void method581(class435 arg0) {
        this.field6039 = ((class591) arg0).field8032;
        ++field6075;
        this.field6069 = this.field6039.method3977(32768, false);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 352)
    public final void method608(Canvas arg0) {
        ++field6110;
        if (this.field6201 == arg0) {
            throw new RuntimeException();
        } else if (this.field6121.containsKey(arg0)) {
            this.method73((byte) -82, arg0, this.field6121.get(arg0));
            this.field6121.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "()Z", line = 371)
    public final boolean method612() {
        ++field6177;
        return this.field6270;
    }

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "(I)V", line = 381)
    private final void method2651(int arg0) {
        ++field6152;
        this.field6279 = false;
        this.method2715((byte) -117);
        if (arg0 != 2) {
            this.field6224 = null;
        }
        if (class324.field4022 == this.field6292) {
            this.method2642((byte) 113);
        }
    }

    @OriginalMember(owner = "client!wg", name = "XA", descriptor = "()I", line = 398)
    public final int method568() {
        ++field6168;
        return this.field6227;
    }

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "()Z", line = 406)
    public final boolean method646() {
        ++field6109;
        return true;
    }

    @OriginalMember(owner = "client!wg", name = "pa", descriptor = "()V", line = 418)
    public final void method564() {
        ++field6195;
        this.field6228 = false;
    }

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "()V", line = 426)
    public final void method647() {
        if (this.field6302 != null) {
            this.field6302.method4083(-3);
        }
        ++field6136;
    }

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "(I)Leia;", line = 443)
    public final class256 method2652(int arg0) {
        if (arg0 != -17) {
            this.field6225 = null;
        }
        ++field6162;
        return this.field6219;
    }

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "([I)V", line = 458)
    public final void method566(int[] arg0) {
        arg0[2] = this.field6296;
        arg0[0] = this.field6254;
        ++field6125;
        arg0[1] = this.field6232;
        arg0[3] = this.field6266;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZ[BLpe;I)Lada;", line = 469)
    public final class175 method2653(int arg0, int arg1, boolean arg2, byte[] arg3, class636 arg4, int arg5) {
        int var7 = -12 % ((arg1 - -85) / 36);
        ++field6182;
        return this.method11(0, arg3, -102, arg0, arg2, arg4, arg5, 0);
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(II)I", line = 480)
    public final int method620(int arg0, int arg1) {
        ++field6108;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!wg", name = "HA", descriptor = "(IIII[I)V", line = 491)
    public final void method651(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field6048;
        float var6 = this.field6222.method1522((float) arg2, (float) arg1, 127, (float) arg0);
        if (!(var6 < (float) this.field6322) && !((float) this.field6227 < var6)) {
            int var7 = (int) ((float) this.field6271 * this.field6222.method1526(2, (float) arg1, (float) arg0, (float) arg2) / (float) arg3);
            int var8 = (int) ((float) this.field6275 * this.field6222.method1525(false, (float) arg0, (float) arg1, (float) arg2) / (float) arg3);
            arg4[0] = (int) ((float) var7 + -this.field6246);
            arg4[2] = (int) var6;
            arg4[1] = (int) ((float) var8 - this.field6321);
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "()Z", line = 514)
    public final boolean method561() {
        ++field6037;
        return false;
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(B)I", line = 522)
    public final int method2654(byte arg0) {
        if (arg0 >= -26) {
            return -65;
        } else {
            ++field6118;
            return this.field6313;
        }
    }

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "(I)I", line = 536)
    public final int method2655(int arg0) {
        if (arg0 < 119) {
            this.method2693((byte) 76, 42, (class686) null);
        }
        ++field6068;
        return this.field6261;
    }

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "(I)V", line = 553)
    private final void method2656(int arg0) {
        this.field6312 = false;
        ++field6209;
        if (class665.field9134 == this.field6292) {
            this.method2714(9);
            this.method2642((byte) 113);
        }
        int var2 = -93 % ((42 - arg0) / 45);
    }

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)V", line = 570)
    public final void method615(int arg0) {
        ++field6031;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lso;IIII)Lka;", line = 578)
    public final class498 method567(class496 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6199;
        return new class650(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(IIIIII)Ljia;", line = 586)
    public final class645 method611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6090;
        return new class289(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(Z)V", line = 594)
    private final void method2657(boolean arg0) {
        this.method9(-114);
        ++field6196;
        this.method72((byte) -84);
        this.method90(-78);
        this.method39(-126);
        this.method86(true);
        this.method74(-8);
        this.method38(arg0);
        this.method75((byte) -10);
        this.method33((byte) 34);
        this.method34((byte) 117);
        this.method21(-23392);
        this.method48((byte) 82);
        this.method29((byte) 47);
        this.method7(8085);
        for (int var2 = this.field6272 + -1; ~var2 <= -1; --var2) {
            this.method2691(!arg0, var2);
            this.method51(0);
            this.method14((byte) -9);
            this.method2671(89);
        }
        this.method78(1);
        this.method23(-119);
        this.method43(1);
        this.method12(15543);
        this.method80((byte) 91);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 638)
    public final void method621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class513 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field6212;
    }

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "(B)V", line = 645)
    private final void method2658(byte arg0) {
        if (arg0 == -25) {
            ++field6040;
            if (!this.field6242) {
                float[] var2 = this.field6295;
                float var3 = (float) this.field6322;
                float var4 = (float) this.field6227;
                float var5 = (float) (-this.field6317) * this.field6273 / (float) this.field6275;
                float var6 = (float) (-this.field6282) * this.field6273 / (float) this.field6271;
                float var7 = (float) (-this.field6282 + this.field6148) * this.field6273 / (float) this.field6271;
                float var8 = (float) (-this.field6317 + this.field6096) * this.field6273 / (float) this.field6275;
                if (var6 != var7 && var5 != var8) {
                    var2[4] = 0.0F;
                    var2[13] = (var5 + var8) / (var8 - var5);
                    var2[14] = var3 / (-var4 + var3);
                    var2[15] = 1.0F;
                    var2[12] = (var6 + var7) / (-var7 + var6);
                    var2[9] = 0.0F;
                    var2[10] = 1.0F / (-var4 + var3);
                    var2[5] = 2.0F / (var8 - var5);
                    var2[11] = 0.0F;
                    var2[6] = 0.0F;
                    var2[3] = 0.0F;
                    var2[0] = 2.0F / (var7 - var6);
                    var2[8] = 0.0F;
                    var2[7] = 0.0F;
                    var2[1] = 0.0F;
                    var2[2] = 0.0F;
                } else {
                    var2[8] = 0.0F;
                    var2[5] = 1.0F;
                    var2[1] = 0.0F;
                    var2[4] = 0.0F;
                    var2[14] = 0.0F;
                    var2[2] = 0.0F;
                    var2[9] = 0.0F;
                    var2[13] = 0.0F;
                    var2[15] = 1.0F;
                    var2[11] = 0.0F;
                    var2[6] = 0.0F;
                    var2[3] = 0.0F;
                    var2[12] = 0.0F;
                    var2[10] = 1.0F;
                    var2[0] = 1.0F;
                    var2[7] = 0.0F;
                }
                this.method2686(true);
                this.field6242 = true;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)Lza;", line = 715)
    public final class435 method585(int arg0) {
        ++field6045;
        class591 var2 = new class591(arg0);
        this.field6185.method2732(var2, 21939);
        return var2;
    }

    @OriginalMember(owner = "client!wg", name = "EA", descriptor = "(IIII)V", line = 729)
    public final void method555(int arg0, int arg1, int arg2, int arg3) {
        ++field6044;
        if (!this.field6228) {
            throw new RuntimeException("");
        } else {
            this.field6290 = arg0;
            this.field6287 = arg3;
            this.field6313 = arg2;
            this.field6269 = arg1;
            if (this.field6260) {
                this.field6288[3].method1371(64);
                this.field6288[3].method705(1580);
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI)V", line = 751)
    public final void method2659(boolean arg0, int arg1) {
        if (arg0 == !this.field6249) {
            this.field6249 = arg0;
            this.method90(91);
        }
        ++field6166;
        if (arg1 != 24103) {
            this.method560(-74, 114, -61, 46);
        }
    }

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "(IIIIIII)I", line = 768)
    public final int method572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6084;
        int var8 = 0;
        float var9 = (float) arg2 * this.field6222.field3009 + (float) arg0 * this.field6222.field3021 + (float) arg1 * this.field6222.field2994 + this.field6222.field3006;
        float var10 = (float) arg5 * this.field6222.field3009 + (float) arg3 * this.field6222.field3021 + (float) arg4 * this.field6222.field2994 + this.field6222.field3006;
        if ((float) this.field6322 > var9 && var10 < (float) this.field6322) {
            var8 |= 16;
        } else if ((float) this.field6227 < var9 && (float) this.field6227 < var10) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field6222.field3007 + (float) arg0 * this.field6222.field3027 + (float) arg1 * this.field6222.field3031 + this.field6222.field3028) * (float) this.field6271 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field6222.field3007 + (float) arg3 * this.field6222.field3027 + (float) arg4 * this.field6222.field3031 + this.field6222.field3028) * (float) this.field6271 / (float) arg6);
        if (this.field6246 > (float) var11 && this.field6246 > (float) var12) {
            var8 |= 1;
        } else if ((float) var11 > this.field6284 && this.field6284 < (float) var12) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field6222.field3004 + (float) arg0 * this.field6222.field3018 + (float) arg1 * this.field6222.field2991 + this.field6222.field3002) * (float) this.field6275 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field6222.field3004 + (float) arg3 * this.field6222.field3018 + (float) arg4 * this.field6222.field2991 + this.field6222.field3002) * (float) this.field6275 / (float) arg6);
        if (this.field6321 > (float) var13 && this.field6321 > (float) var14) {
            var8 |= 4;
        } else if (this.field6301 < (float) var13 && (float) var14 > this.field6301) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "(I)V", line = 814)
    public final void method571(int arg0) {
        this.field6267 = 0;
        ++field6081;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field6267;
        }
        this.field6253 = 1 << this.field6267;
    }

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "(B)I", line = 829)
    public final int method2660(byte arg0) {
        int var2 = 19 / ((arg0 - 38) / 32);
        ++field6178;
        return this.field6287;
    }

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "()Z", line = 839)
    public final boolean method629() {
        ++field6140;
        return true;
    }

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(IIIIII)V", line = 847)
    public final void method633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6046;
        float var7 = this.method55((byte) -46);
        this.method2684(-2);
        this.method2673(arg4, 125);
        this.method2694((byte) -49, 0, class555.field7718);
        this.method2703(class555.field7718, (byte) 49, 0);
        this.method2699((byte) 14, arg5);
        this.field6219.method1529((float) (arg3 - 1), 1.0F, (float) (arg2 + -1), (byte) 75);
        this.field6219.method1538((float) arg1 + -var7, 0.0F, (float) arg0 - var7, -2360);
        this.method2688(0);
        this.method41(0, false);
        this.method2693((byte) 76, 4, class161.field1985);
        this.method41(0, true);
        this.method2703(class507.field7214, (byte) -80, 0);
        this.method2694((byte) -49, 0, class507.field7214);
    }

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "(I)Leia;", line = 872)
    public final class256 method2661(int arg0) {
        ++field6145;
        if (arg0 != 13145) {
            this.field6281 = -0.685852F;
        }
        return this.field6225;
    }

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "(B)V", line = 883)
    public final void method2662(byte arg0) {
        ++field6142;
        if (arg0 != 99) {
            this.method561();
        }
        if (~this.field6230 != -17) {
            this.method2719(5);
            this.method2669((byte) 49, true);
            this.method2672(101, true);
            this.method2666(8, true);
            this.method2699((byte) 14, 1);
            this.field6230 = 16;
        }
    }

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "(B)V", line = 908)
    public final void method2663(byte arg0) {
        ++field6066;
        this.method2695(true);
        if (arg0 < 10) {
            this.field6336 = null;
        }
        this.method2642((byte) 113);
    }

    @OriginalMember(owner = "client!wg", name = "ZA", descriptor = "(IFFFFF)V", line = 920)
    public final void method578(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field6171;
        boolean var7 = this.field6235 != arg0;
        if (var7 || this.field6280 != arg1 || this.field6241 != arg2) {
            this.field6235 = arg0;
            this.field6241 = arg2;
            this.field6280 = arg1;
            if (var7) {
                this.field6281 = (float) (this.field6235 & 255) / 255.0F;
                this.field6276 = (float) (this.field6235 & 16711680) / 1.671168E7F;
                this.field6323 = (float) (this.field6235 & 65280) / 65280.0F;
                this.method9(-21);
            }
            this.field6094.setSunColour(this.field6276, this.field6323, this.field6281, arg1, arg2);
            this.method72((byte) -111);
        }
        if (this.field6285[0] != arg3 || this.field6285[1] != arg4 || this.field6285[2] != arg5) {
            this.field6285[0] = arg3;
            this.field6285[2] = arg5;
            this.field6285[1] = arg4;
            this.field6243[2] = -arg5;
            this.field6243[0] = -arg3;
            this.field6243[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field6283[1] = arg4 * var8;
            this.field6283[2] = arg5 * var8;
            this.field6283[0] = arg3 * var8;
            this.field6233[2] = -this.field6283[2];
            this.field6233[1] = -this.field6283[1];
            this.field6233[0] = -this.field6283[0];
            this.field6094.setSunDirection(this.field6283[0], this.field6283[1], this.field6283[2]);
            this.method86(true);
            this.field6327 = (int) (arg5 * 256.0F / arg4);
            this.field6248 = (int) (arg3 * 256.0F / arg4);
        }
        this.method74(-8);
    }

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "(B)V", line = 970)
    private final void method2664(byte arg0) {
        ++field6206;
        this.method8((byte) 121);
        if (arg0 >= -116) {
            this.method553(-84, -30, -72, 103, -26, -64, (byte[]) null, -6, 2);
        }
        if (this.field6310 != null) {
            this.field6310.method697(34);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZB)Ljaclib/memory/heap/NativeHeapBuffer;", line = 985)
    public final NativeHeapBuffer method2665(int arg0, boolean arg1, byte arg2) {
        ++field6153;
        return arg2 != -46 ? null : this.field6039.method3977(arg0, arg1);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lbq;[Lcr;Z)Lda;", line = 999)
    public final class67 method579(class307 arg0, class600[] arg1, boolean arg2) {
        ++field6215;
        return new class628(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 1008)
    public final class296 method557(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field6104;
        return new class385(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIILaa;II)V", line = 1018)
    public final void method619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class513 arg6, int arg7, int arg8) {
        ++field6111;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(IZ)V", line = 1026)
    public final void method2666(int arg0, boolean arg1) {
        if (this.field6238 != arg1) {
            this.field6238 = arg1;
            this.method33((byte) 34);
            this.field6230 &= -32;
        }
        ++field6103;
        if (arg0 != 8) {
            this.method572(125, 71, 35, 0, -88, 38, 88);
        }
    }

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "(I)V", line = 1046)
    private final void method2667(int arg0) {
        this.field6291[14] = this.field6326;
        ++field6216;
        this.field6291[10] = this.field6286;
        if (arg0 == 0) {
            this.field6315 = (this.field6291[14] + (float) (-this.field6227)) / this.field6291[10];
        }
    }

    @OriginalMember(owner = "client!wg", name = "la", descriptor = "()V", line = 1061)
    public final void method634() {
        this.field6296 = this.field6148;
        this.field6232 = 0;
        ++field6146;
        this.field6254 = 0;
        this.field6266 = this.field6096;
        if (this.field6351) {
            this.field6351 = false;
            this.method88((byte) -118);
        }
        this.method2723(-76);
    }

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "(B)I", line = 1079)
    public final int method2668(byte arg0) {
        if (arg0 != -78) {
            return 67;
        } else {
            ++field6129;
            return this.field6290;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIII)V", line = 1090)
    public final void method613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field6131;
        float var10 = (float) (-arg0) + (float) arg2;
        float var11 = (float) arg3 - (float) arg1;
        float var12;
        if (var10 == 0.0F && var11 == 0.0F) {
            var12 = 1.0F;
        } else {
            float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            var11 *= var13;
            var12 = var10 * var13;
        }
        this.method2684(-2);
        this.method2673(arg4, -26);
        this.method2694((byte) -49, 0, class555.field7718);
        this.method2703(class555.field7718, (byte) 42, 0);
        this.method2699((byte) 14, arg5);
        this.method2706(75);
        this.method41(0, false);
        int var14 = arg8 % (arg6 + arg7);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (arg6 >= var14) {
            var19 = (float) (-var14 + arg6) * var12;
            var20 = (float) (-var14 + arg6) * var11;
        } else {
            var17 = (float) (arg6 - -arg7 + -var14) * var12;
            var18 = (float) (arg6 + arg7 + -var14) * var11;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (arg2 > arg0) {
                if (var21 > (float) arg2) {
                    break;
                }
                if ((float) arg2 < var19 + var21) {
                    var19 = (float) arg2 + -var21;
                }
            } else {
                if ((float) arg2 > var21) {
                    break;
                }
                if (var19 + var21 < (float) arg2) {
                    var19 = (float) arg2 - var21;
                }
            }
            if (~arg1 <= ~arg3) {
                if ((float) arg3 > var22) {
                    break;
                }
                if ((float) arg3 > var20 + var22) {
                    var20 = (float) arg3 - var22;
                }
            } else {
                if ((float) arg3 < var22) {
                    break;
                }
                if (var20 + var22 > (float) arg3) {
                    var20 = (float) arg3 + -var22;
                }
            }
            if (!this.method2687(var21, 0.0F, var20 + var22, var22, (byte) -114, 0.0F, var19 + var21)) {
                return;
            }
            var22 += var20 + var24;
            var21 += var19 + var23;
            this.method2707(-120);
            var20 = var16;
            var19 = var15;
        }
        this.method41(0, true);
        this.method2703(class507.field7214, (byte) 96, 0);
        this.method2694((byte) -49, 0, class507.field7214);
    }

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "(III)V", line = 1210)
    public final void method650(int arg0, int arg1, int arg2) {
        if (this.field6307 != arg0 || ~this.field6231 != ~arg1 || ~this.field6234 != ~arg2) {
            this.field6231 = arg1;
            this.field6307 = arg0;
            this.field6234 = arg2;
            this.method2685(true);
            this.method34((byte) 117);
        }
        ++field6034;
    }

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "()Z", line = 1228)
    public final boolean method601() {
        ++field6059;
        return true;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lcr;Z)Ltf;", line = 1237)
    public final class312 method640(class600 arg0, boolean arg1) {
        ++field6079;
        class312 var10;
        if (~arg0.field8123 != -1 && arg0.field8116 != 0) {
            int[] var3 = new int[arg0.field8123 * arg0.field8116];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field8119 == null) {
                for (int var6 = 0; ~arg0.field8116 < ~var6; ++var6) {
                    for (int var7 = 0; var7 < arg0.field8123; ++var7) {
                        int var8 = arg0.field8120[arg0.field8122[var4++] & 255];
                        var3[var5++] = var8 == 0 ? 0 : class5.method105(var8, -16777216);
                    }
                }
            } else {
                for (int var9 = 0; var9 < arg0.field8116; ++var9) {
                    for (int var11 = 0; ~var11 > ~arg0.field8123; ++var11) {
                        var3[var5++] = class5.method105(arg0.field8120[class296.method1733(255, arg0.field8122[var4])], arg0.field8119[var4] << 24);
                        ++var4;
                    }
                }
            }
            var10 = this.method623(var3, arg0.field8116, 1, arg0.field8123, arg0.field8123, 0);
        } else {
            var10 = this.method623(new int[1], 1, 1, 1, 1, 0);
        }
        var10.method1632(arg0.field8118, arg0.field8124, arg0.field8121, arg0.field8117);
        return var10;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BZ)V", line = 1304)
    public final void method2669(byte arg0, boolean arg1) {
        ++field6172;
        if (arg1 == !this.field6293) {
            this.field6293 = arg1;
            this.method34((byte) 117);
            this.field6230 &= -32;
        }
        if (arg0 < 28) {
            this.field6121 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "(B)V", line = 1322)
    private final void method2670(byte arg0) {
        if (class324.field4022 != this.field6292) {
            class688 var2 = this.field6292;
            this.field6292 = class324.field4022;
            if (!var2.method3844(25596)) {
                this.method2644((byte) -113);
            }
            this.method2715((byte) -110);
            this.field6268 = this.field6291;
            this.method2642((byte) 113);
            this.field6230 &= -8;
        }
        ++field6071;
        if (arg0 <= 3) {
            this.method568();
        }
    }

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "()I", line = 1352)
    public final int method610() {
        ++field6099;
        return this.field6322;
    }

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "(I)V", line = 1363)
    public final void method2671(int arg0) {
        ++field6083;
        if (this.field6311[this.field6261] != class533.field7504) {
            this.field6311[this.field6261] = class533.field7504;
            this.field6294[this.field6261].method128();
            this.method2664((byte) -123);
        }
        if (arg0 <= 85) {
            this.field6334 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIF)Lkp;", line = 1388)
    public final class515 method573(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field6175;
        return new class65(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(IZ)V", line = 1400)
    public final void method2672(int arg0, boolean arg1) {
        if (arg0 <= 56) {
            this.method2690(0);
        }
        if (this.field6303 == !arg1) {
            this.field6303 = arg1;
            this.method75((byte) -120);
            this.field6230 &= -32;
        }
        ++field6050;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[Lkp;)V", line = 1423)
    public final void method587(int arg0, class515[] arg1) {
        ++field6030;
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field6299[var3] = arg1[var3];
        }
        this.field6262 = arg0;
        if (this.field6292.method3844(25596)) {
            this.method39(-126);
        }
    }

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "(II)V", line = 1446)
    public final void method2673(int arg0, int arg1) {
        if (~this.field6259 != ~arg0) {
            this.field6259 = arg0;
            this.method78(1);
        }
        ++field6060;
        int var3 = 68 % ((73 - arg1) / 52);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Laf;)V", line = 1466)
    public final void method582(class460 arg0) {
        this.field6277.method2148(true, arg0, -1, this);
        ++field6124;
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "()Lnh;", line = 1474)
    public final class778 method576() {
        ++field6123;
        return this.field6337;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II[I[I)Laa;", line = 1485)
    public final class513 method643(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field6036;
        return class15.method202(arg0, arg3, arg2, arg1, this, (byte) 92);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZIIZ)V", line = 1495)
    private final void method2674(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        ++field6073;
        boolean var7 = arg5 & this.method622();
        if (!var7 && (~arg0 == -5 || arg0 == 8 || arg0 == 9)) {
            arg0 = 2;
            arg1 = arg0 != 4 ? 1 : 1 & arg3;
            arg3 = 0;
        }
        if (arg0 != 0 && arg2) {
            arg0 |= Integer.MIN_VALUE;
        }
        if (this.field6289 == arg0) {
            if (this.field6289 != 0) {
                this.field6288[this.field6289 & Integer.MAX_VALUE].method707(arg2, arg4 ^ 30903);
                if (this.field6319 != arg3 || this.field6318 != arg1) {
                    this.field6288[this.field6289 & Integer.MAX_VALUE].method700(arg3, (byte) 94, arg1);
                    this.field6319 = arg3;
                    this.field6318 = arg1;
                }
            }
        } else {
            if (this.field6289 != 0) {
                this.field6288[Integer.MAX_VALUE & this.field6289].method699(false);
            }
            if (~arg0 != -1) {
                this.field6310 = this.field6288[arg0 & Integer.MAX_VALUE];
                this.field6310.method702(arg2, (byte) -10);
                this.field6310.method707(arg2, 30902);
                this.field6310.method700(arg3, (byte) 94, arg1);
            } else {
                this.field6310 = null;
            }
            this.field6318 = arg1;
            this.field6319 = arg3;
            this.field6289 = arg0;
        }
        if (arg4 != 1) {
            this.method625();
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(ZI)V", line = 1551)
    public final void method2675(boolean arg0, int arg1) {
        if (arg1 == -8) {
            ++field6114;
            if (!this.field6239 != !arg0) {
                this.field6239 = arg0;
                this.method90(105);
                this.field6230 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "()Z", line = 1569)
    public final boolean method599() {
        ++field6063;
        return true;
    }

    @OriginalMember(owner = "client!wg", name = "aa", descriptor = "(IIIIII)V", line = 1577)
    public final void method645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6149;
        this.method2684(-2);
        this.method2673(arg4, 126);
        this.method2694((byte) -49, 0, class555.field7718);
        this.method2703(class555.field7718, (byte) 30, 0);
        this.method2699((byte) 14, arg5);
        this.field6219.method1529((float) arg3, 1.0F, (float) arg2, (byte) 106);
        this.field6219.method131(arg0, arg1, 0);
        this.method2688(0);
        this.method41(0, false);
        this.method2692(2);
        this.method41(0, true);
        this.method2703(class507.field7214, (byte) -123, 0);
        this.method2694((byte) -49, 0, class507.field7214);
    }

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "(I)Lmia;", line = 1598)
    public final class69 method2676(int arg0) {
        ++field6058;
        if (arg0 != 0) {
            this.field6089 = null;
        }
        return this.field6263 != null ? this.field6263.method190(0) : null;
    }

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "(I)Leia;", line = 1609)
    public final class256 method2677(int arg0) {
        if (arg0 != 0) {
            this.method2681(-54);
        }
        ++field6064;
        if (!this.field6265) {
            this.field6226.method1539(this.field6224, this.field6219);
            this.field6265 = true;
        }
        return this.field6226;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V", line = 1628)
    public final void method586(boolean arg0) {
        ++field6054;
    }

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "(B)V", line = 1636)
    private final void method2678(byte arg0) {
        if (arg0 < -63) {
            if (class665.field9134 == this.field6292) {
                float var2 = this.method55((byte) -46);
                this.field6219.method1538(var2, 0.0F, var2, -2360);
            }
            ++field6150;
            this.field6265 = false;
            this.method12(15543);
            if (this.field6310 != null) {
                this.field6310.method698((byte) 113);
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(IZ)V", line = 1658)
    public final void method2679(int arg0, boolean arg1) {
        ++field6179;
        if (arg0 == 16383) {
            if (this.field6325 != arg1) {
                this.field6325 = arg1;
                this.method38(true);
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIZ)Ltf;", line = 1677)
    public final class312 method644(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field6043;
        class612 var6 = new class612(this, arg2, arg3, arg4);
        var6.method239(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "(I)I", line = 1689)
    public final int method2680(int arg0) {
        if (arg0 != 8) {
            this.method2679(-127, false);
        }
        ++field6189;
        return this.field6269;
    }

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "()Z", line = 1700)
    public final boolean method622() {
        ++field6101;
        return this.field6288[3].method703((byte) 127);
    }

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "(I)V", line = 1709)
    private final void method2681(int arg0) {
        if (arg0 <= -54) {
            this.field6340 = this.method57(14, true);
            ++field6074;
            this.field6340.method273(24, (byte) 125, 12);
            this.field6341 = this.method68(89, new class585[] { new class585(class504.field7122) });
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIII)V", line = 1724)
    public final void method592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6057;
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
        if (this.method2687((float) arg0, 0.0F, (float) arg3 + var8, (float) arg1, (byte) -83, 0.0F, (float) arg2 + var9)) {
            this.method2684(-2);
            this.method2673(arg4, -38);
            this.method2694((byte) -49, 0, class555.field7718);
            this.method2703(class555.field7718, (byte) 65, 0);
            this.method2699((byte) 14, arg5);
            this.method2706(102);
            this.method41(0, false);
            this.method2707(-121);
            this.method41(0, true);
            this.method2703(class507.field7214, (byte) -89, 0);
            this.method2694((byte) -49, 0, class507.field7214);
        }
    }

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "(B)[Llf;", line = 1762)
    public static final class251[] method2682(byte arg0) {
        if (arg0 < 82) {
            field6221 = 59;
        }
        ++field6086;
        return new class251[] { class66.field895, class435.field5743, class308.field3823, class535.field7537, class434.field5732, class354.field4404, class491.field6846, class198.field2358, class215.field2537, class179.field2196 };
    }

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "(B)[F", line = 1778)
    public final float[] method2683(byte arg0) {
        if (arg0 != -125) {
            return null;
        } else {
            ++field6193;
            return this.field6274;
        }
    }

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "(I)V", line = 1789)
    private final void method2684(int arg0) {
        ++field6187;
        if (~this.field6230 != arg0) {
            this.method2690(-1428394296);
            this.method2669((byte) 76, false);
            this.method2675(false, -8);
            this.method2672(83, false);
            this.method2666(8, false);
            this.method2711(arg0 ^ 1, false, -2, false);
            this.method2649((byte) 126, 1);
            this.method2643(-2, this.field6257);
            this.field6230 = 1;
        }
    }

    @OriginalMember(owner = "client!wg", name = "JA", descriptor = "(IIIIII)I", line = 1813)
    public final int method649(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6156;
        int var7 = 0;
        float var8 = (float) arg2 * this.field6222.field3009 + (float) arg0 * this.field6222.field3021 + (float) arg1 * this.field6222.field2994 + this.field6222.field3006;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field6222.field3009 + (float) arg3 * this.field6222.field3021 + (float) arg4 * this.field6222.field2994 + this.field6222.field3006;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field6322 > var8 && (float) this.field6322 > var9) {
            var7 |= 16;
        } else if (var8 > (float) this.field6227 && var9 > (float) this.field6227) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field6222.field3007 + (float) arg0 * this.field6222.field3027 + (float) arg1 * this.field6222.field3031 + this.field6222.field3028) * (float) this.field6271 / var8);
        int var11 = (int) (((float) arg5 * this.field6222.field3007 + (float) arg3 * this.field6222.field3027 + (float) arg4 * this.field6222.field3031 + this.field6222.field3028) * (float) this.field6271 / var9);
        if ((float) var10 < this.field6246 && (float) var11 < this.field6246) {
            var7 |= 1;
        } else if ((float) var10 > this.field6284 && (float) var11 > this.field6284) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field6222.field3004 + (float) arg0 * this.field6222.field3018 + (float) arg1 * this.field6222.field2991 + this.field6222.field3002) * (float) this.field6275 / var8);
        int var13 = (int) (((float) arg5 * this.field6222.field3004 + (float) arg3 * this.field6222.field3018 + (float) arg4 * this.field6222.field2991 + this.field6222.field3002) * (float) this.field6275 / var9);
        if (this.field6321 > (float) var12 && this.field6321 > (float) var13) {
            var7 |= 4;
        } else if ((float) var12 > this.field6301 && this.field6301 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(Z)V", line = 1867)
    private final void method2685(boolean arg0) {
        if (this.field6310 != null) {
            this.field6310.method705(1580);
        }
        if (arg0) {
            ++field6205;
            this.method21(-23392);
        }
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(Z)V", line = 1889)
    private final void method2686(boolean arg0) {
        ++field6181;
        this.field6324 = (float) this.field6227;
        if (!arg0) {
            this.method620(38, -6);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljia;)V", line = 1904)
    public final void method558(class645 arg0) {
        ++field6093;
        this.field6263 = (class13) arg0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(FFFFBFF)Z", line = 1912)
    private final boolean method2687(float arg0, float arg1, float arg2, float arg3, byte arg4, float arg5, float arg6) {
        ++field6102;
        Buffer var8 = this.field6340.method271(true, (byte) -8);
        if (var8 == null) {
            return false;
        } else {
            int var9 = -70 / ((-23 - arg4) / 53);
            Stream var10 = this.method2650((byte) -41, var8);
            if (Stream.method3985()) {
                var10.method3979(arg0);
                var10.method3979(arg3);
                var10.method3979(arg1);
                var10.method3979(arg6);
                var10.method3979(arg2);
                var10.method3979(arg5);
            } else {
                var10.method3981(arg0);
                var10.method3981(arg3);
                var10.method3981(arg1);
                var10.method3981(arg6);
                var10.method3981(arg2);
                var10.method3981(arg5);
            }
            var10.method3992();
            return this.field6340.method275(22022);
        }
    }

    @OriginalMember(owner = "client!wg", name = "za", descriptor = "(IIIII)V", line = 1952)
    public final void method563(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6076;
        this.method2684(-2);
        this.method2673(arg3, 125);
        this.method2694((byte) -49, 0, class555.field7718);
        this.method2703(class555.field7718, (byte) -109, 0);
        this.method2699((byte) 14, arg4);
        this.field6219.method1529((float) arg2, 1.0F, (float) arg2, (byte) 106);
        this.field6219.method131(arg0, arg1, 0);
        this.method2688(0);
        this.method41(0, false);
        this.method64(0, this.field6336, 0);
        this.method85((byte) 96, this.field6332);
        this.method19((byte) -118, class657.field9051, 0, 256);
        this.method41(0, true);
        this.method2703(class507.field7214, (byte) -128, 0);
        this.method2694((byte) -49, 0, class507.field7214);
    }

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "(I)V", line = 1976)
    public final void method2688(int arg0) {
        ++field6115;
        this.field6218 = false;
        this.method2678((byte) -79);
        if (arg0 != 0) {
            this.method38(true);
        }
    }

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "(I)V", line = 1988)
    public static void method2689(int arg0) {
        field6137 = null;
        if (arg0 < 17) {
            field6100 = -84;
        }
        field6220 = null;
    }

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "(IIIIII[BII)V", line = 2006)
    public final void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field6173;
    }

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "(I)V", line = 2013)
    private final void method2690(int arg0) {
        if (arg0 == -1428394296) {
            if (class665.field9134 != this.field6292) {
                class688 var2 = this.field6292;
                this.field6292 = class665.field9134;
                if (var2.method3844(arg0 ^ -1428419276)) {
                    this.method2644((byte) -83);
                }
                this.method2714(9);
                this.field6268 = this.field6237;
                this.method2642((byte) 113);
                this.field6230 &= -25;
            }
            ++field6070;
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(ZI)V", line = 2038)
    public final void method2691(boolean arg0, int arg1) {
        ++field6167;
        if (this.field6261 != arg1) {
            this.field6261 = arg1;
            this.method18(43);
        }
        if (arg0) {
            this.field6225 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "(I)V", line = 2056)
    public final void method2692(int arg0) {
        ++field6134;
        this.method2693((byte) -74, arg0, class657.field9051);
    }

    @OriginalMember(owner = "client!wg", name = "da", descriptor = "(III[I)V", line = 2064)
    public final void method642(int arg0, int arg1, int arg2, int[] arg3) {
        ++field6053;
        float var5 = this.field6222.method1522((float) arg2, (float) arg1, 126, (float) arg0);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field6282;
            var7 = this.field6317;
        } else {
            var6 = (int) ((float) this.field6271 * this.field6222.method1526(2, (float) arg1, (float) arg0, (float) arg2) / var5);
            var7 = (int) ((float) this.field6275 * this.field6222.method1525(false, (float) arg0, (float) arg1, (float) arg2) / var5);
        }
        arg3[0] = (int) ((float) var6 - this.field6246);
        arg3[1] = (int) ((float) var7 - this.field6321);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "()Lnh;", line = 2089)
    public final class778 method614() {
        ++field6028;
        return new class256();
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BILkja;)V", line = 2098)
    private final void method2693(byte arg0, int arg1, class686 arg2) {
        ++field6207;
        this.method64(0, this.field6344, 0);
        int var4 = -52 % ((-1 - arg0) / 39);
        this.method85((byte) 96, this.field6331);
        this.method19((byte) -108, arg2, 0, arg1);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BILmga;)V", line = 2110)
    public final void method2694(byte arg0, int arg1, class738 arg2) {
        ++field6116;
        if (arg0 == -49) {
            this.method4(arg2, false, (byte) 115, false, arg1);
        }
    }

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(Z)V", line = 2121)
    public final void method2695(boolean arg0) {
        if (!arg0) {
            this.method562();
        }
        if (class461.field6481 != this.field6292) {
            class688 var2 = this.field6292;
            this.field6292 = class461.field6481;
            if (var2.method3844(25596)) {
                this.method2644((byte) -120);
            }
            this.field6230 &= -32;
            this.field6268 = this.field6274;
        }
        ++field6147;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIII)V", line = 2148)
    public final void method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6164;
        float var8 = (float) (-arg0) + (float) arg2;
        float var9 = (float) arg3 - (float) arg1;
        float var10 = 0.0F;
        float var11 = 1.0F;
        if (var8 != 0.0F || var9 != 0.0F) {
            var11 = (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
            var10 = (float) Math.atan2((double) var9, (double) var8);
        }
        this.method2684(-2);
        this.method2673(arg4, -126);
        this.method2694((byte) -49, 0, class555.field7718);
        this.method2703(class555.field7718, (byte) -119, 0);
        this.method2699((byte) 14, arg6);
        this.field6219.method1529((float) arg5, 1.0F, var11, (byte) 114);
        this.field6219.method131(0, -arg5 / 2, 0);
        this.field6219.method126(16383 & (int) ((double) var10 * 2607.5945876176133D));
        this.field6219.method131(arg0, arg1, 0);
        this.method2688(0);
        this.method41(0, false);
        this.method2692(2);
        this.method41(0, true);
        this.method2703(class507.field7214, (byte) 58, 0);
        this.method2694((byte) -49, 0, class507.field7214);
    }

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "(III[I)V", line = 2185)
    public final void method570(int arg0, int arg1, int arg2, int[] arg3) {
        ++field6210;
        float var5 = this.field6222.method1522((float) arg2, (float) arg1, 126, (float) arg0);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field6282;
            var7 = this.field6317;
        } else {
            var6 = (int) ((float) this.field6271 * this.field6222.method1526(2, (float) arg1, (float) arg0, (float) arg2) / var5);
            var7 = (int) ((float) this.field6275 * this.field6222.method1525(false, (float) arg0, (float) arg1, (float) arg2) / var5);
        }
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var7 - this.field6321);
        arg3[0] = (int) ((float) var6 + -this.field6246);
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V", line = 2217)
    public final void method609(int arg0) {
        ++field6088;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "(I)V", line = 2234)
    public void method56(int arg0) {
        if (this.field6302 != null) {
            this.field6302.method4082((byte) -61);
        }
        ++field6119;
        this.field6229 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "(Z)V", line = 2247)
    public final void method2696(boolean arg0) {
        if (arg0) {
            this.method56(-28);
        }
        ++field6126;
        if (this.field6230 != 8) {
            this.method2670((byte) 119);
            this.method2669((byte) 81, true);
            this.method2672(127, true);
            this.method2666(8, true);
            this.method2699((byte) 14, 1);
            this.field6230 = 8;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Laf;I)V", line = 2275)
    public final void method590(class460 arg0, int arg1) {
        this.field6277.method2148(true, arg0, arg1, this);
        ++field6097;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZB)V", line = 2283)
    public final void method2697(boolean arg0, byte arg1) {
        if (!arg0) {
            this.method2673(arg1 | arg1 << 16 | arg1 << 24 | arg1 << 8, -118);
            ++field6144;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([IIIIIZ)Ltf;", line = 2300)
    public final class312 method652(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6155;
        return new class612(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(BI)Lje;", line = 2308)
    public final class422 method2698(byte arg0, int arg1) {
        ++field6085;
        if (this.field6347.method276((byte) 123) < arg1 * 2) {
            this.field6347.method2529(111, arg1);
        }
        if (arg0 > -60) {
            this.field6282 = 26;
        }
        return this.field6347;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 2322)
    public final void method627(Canvas arg0) {
        ++field6062;
        this.field6089 = null;
        this.field6135 = null;
        if (arg0 != null && this.field6201 != arg0) {
            if (this.field6121.containsKey(arg0)) {
                this.field6135 = this.field6121.get(arg0);
                this.field6089 = arg0;
            }
        } else {
            this.field6135 = this.field6038;
            this.field6089 = this.field6201;
        }
        if (this.field6089 != null && this.field6135 != null) {
            this.method58(this.field6089, this.field6135, -116);
            this.method2700((byte) -103);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "()Lnh;", line = 2354)
    public final class778 method574() {
        ++field6056;
        return this.field6222;
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(BI)V", line = 2363)
    public final void method2699(byte arg0, int arg1) {
        if (~this.field6244 != ~arg1) {
            boolean var3;
            class53 var4;
            boolean var5;
            if (arg1 != 1) {
                if (arg1 == 2) {
                    var3 = true;
                    var4 = class243.field2863;
                    var5 = false;
                } else if (~arg1 == -129) {
                    var3 = true;
                    var5 = true;
                    var4 = class120.field1531;
                } else {
                    var4 = class347.field4341;
                    var5 = false;
                    var3 = false;
                }
            } else {
                var4 = class303.field3614;
                var3 = true;
                var5 = true;
            }
            if (this.field6306 == !var5) {
                this.field6306 = var5;
                this.method7(8085);
            }
            if (this.field6305 != var3) {
                this.field6305 = var3;
                this.method48((byte) 82);
            }
            if (this.field6250 != var4) {
                this.field6250 = var4;
                this.method29((byte) -126);
            }
            this.field6230 &= -29;
            this.field6244 = arg1;
        }
        ++field6051;
        if (arg0 != 14) {
            this.field6185 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "()[I", line = 2432)
    public final int[] method569() {
        ++field6033;
        return new int[] { this.field6282, this.field6317, this.field6271, this.field6275 };
    }

    @OriginalMember(owner = "client!wg", name = "DA", descriptor = "(IIII)V", line = 2441)
    public final void method565(int arg0, int arg1, int arg2, int arg3) {
        this.field6271 = arg2;
        this.field6282 = arg0;
        this.field6317 = arg1;
        this.field6275 = arg3;
        ++field6192;
        this.method2646(true);
        this.method2651(2);
        this.method2695(true);
        this.method2723(-94);
    }

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "(ILaa;II)V", line = 2457)
    public final void method617(int arg0, class513 arg1, int arg2, int arg3) {
        ++field6117;
        class478 var5 = (class478) arg1;
        class175 var6 = var5.field6631;
        this.method2645(20439);
        this.method2643(-2, var6);
        this.method2699((byte) 14, 1);
        this.method2716(class75.field1039, 72, class75.field1039);
        this.method2694((byte) -49, 0, class555.field7718);
        this.method2673(arg0, 3);
        this.field6219.method1529((float) this.field6096, 0.0F, (float) this.field6148, (byte) 94);
        this.method2688(0);
        this.field6294[0].method1529(var6.method1200((byte) 20, (float) this.field6096), 1.0F, var6.method1196(-23865, (float) this.field6148), (byte) 125);
        this.field6294[0].method1538(var6.method1200((byte) -105, (float) (-arg3)), 0.0F, var6.method1196(-23865, (float) (-arg2)), -2360);
        this.field6311[0] = class326.field4040;
        this.method2664((byte) -125);
        this.method2692(2);
        this.method2671(99);
        this.method2694((byte) -49, 0, class507.field7214);
    }

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "(B)V", line = 2490)
    private final void method2700(byte arg0) {
        if (this.field6089 == null) {
            this.field6157 = this.field6151 = 1;
        } else {
            Dimension var2 = this.field6089.getSize();
            this.field6151 = var2.height;
            this.field6157 = var2.width;
        }
        ++field6161;
        this.field6148 = this.field6157;
        if (arg0 != -103) {
            this.method2705(-71);
        }
        this.field6096 = this.field6151;
        this.method2656(-6);
        this.method2651(2);
        this.method2646(true);
        this.method23(-89);
        this.method2723(-110);
        this.method2695(true);
        this.method634();
    }

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "(Z)V", line = 2526)
    public final void method635(boolean arg0) {
        this.field6236 = arg0;
        ++field6041;
        this.method33((byte) 34);
    }

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "(I)Leia;", line = 2542)
    public final class256 method2701(int arg0) {
        ++field6191;
        return arg0 != 128 ? null : this.field6294[this.field6261];
    }

    @OriginalMember(owner = "client!wg", name = "KA", descriptor = "(IIII)V", line = 2553)
    public final void method556(int arg0, int arg1, int arg2, int arg3) {
        ++field6077;
        if (~arg0 >= -1 && ~(this.field6148 - 1) >= ~arg2 && arg1 <= 0 && ~(this.field6096 + -1) >= ~arg3) {
            this.method634();
        } else {
            this.field6296 = ~arg2 < ~this.field6148 ? 0 : arg2;
            this.field6266 = arg3 <= this.field6148 ? arg3 : 0;
            this.field6232 = ~arg1 <= -1 ? arg1 : 0;
            this.field6254 = arg0 < 0 ? 0 : arg0;
            if (!this.field6351) {
                this.field6351 = true;
                this.method88((byte) -82);
            }
            this.method47(0);
            this.method2723(-79);
        }
    }

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "(I)V", line = 2579)
    public final void method2702(int arg0) {
        ++field6095;
        Enumeration var2 = this.field6121.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method73((byte) -80, var3, this.field6121.get(var3));
        }
        this.field6344.method274((byte) 71);
        this.field6340.method274((byte) 112);
        this.field6336.method274((byte) -97);
        if (arg0 != 4699) {
            this.field6351 = true;
        }
        this.field6335.method3670(-19);
        this.field6343.method3670(-46);
        this.field6330.method3670(-91);
        this.field6349.method3670(107);
        this.field6348.method3670(arg0 + -4755);
        this.field6277.method2150(-28179);
        this.field6347.method274((byte) 114);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lmga;BI)V", line = 2610)
    public final void method2703(class738 arg0, byte arg1, int arg2) {
        ++field6186;
        this.method91(461166232, arg2, false, arg0);
        int var4 = 90 % ((-42 - arg1) / 38);
    }

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "(I)V", line = 2625)
    public final void method2704(int arg0) {
        ++field6204;
        Hashtable var2 = new Hashtable();
        if (this.field6121 != null && !this.field6121.isEmpty()) {
            Enumeration var3 = this.field6121.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method77((byte) -86, var4));
            }
        }
        this.field6121 = var2;
        this.method2705(arg0);
        this.method2681(arg0 + -74);
        this.method2718((byte) 121);
        this.field6277.method2144(24, this);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 2655)
    public final void method595(Canvas arg0, int arg1, int arg2) {
        ++field6107;
        Object var4 = null;
        if (arg0 != null && this.field6201 != arg0) {
            if (this.field6121.containsKey(arg0)) {
                var4 = this.field6121.get(arg0);
            }
        } else {
            var4 = this.field6135;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method27(arg0, var4, 16711680);
            if (this.field6089 == arg0) {
                this.method2700((byte) -103);
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "()Z", line = 2681)
    public final boolean method604() {
        ++field6120;
        return true;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([I)V", line = 2689)
    public final void method648(int[] arg0) {
        arg0[0] = this.field6148;
        arg0[1] = this.field6096;
        ++field6180;
    }

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "(I)V", line = 2704)
    private final void method2705(int arg0) {
        this.field6344 = this.method57(14, false);
        ++field6183;
        this.field6344.method273(140, (byte) 125, 28);
        for (int var2 = arg0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field6344.method271(true, (byte) -116);
            if (var3 != null) {
                Stream var4 = this.method2650((byte) -50, var3);
                if (!Stream.method3985()) {
                    var4.method3981(0.0F);
                    var4.method3981(0.0F);
                    var4.method3981(0.0F);
                    var4.method3981(0.0F);
                    var4.method3981(0.0F);
                    var4.method3981(0.0F);
                    var4.method3981(0.0F);
                    var4.method3981(0.0F);
                    var4.method3981(1.0F);
                    var4.method3981(0.0F);
                    var4.method3981(0.0F);
                    var4.method3981(1.0F);
                    var4.method3981(0.0F);
                    var4.method3981(1.0F);
                    var4.method3981(1.0F);
                    var4.method3981(1.0F);
                    var4.method3981(0.0F);
                    var4.method3981(1.0F);
                    var4.method3981(1.0F);
                    var4.method3981(1.0F);
                    var4.method3981(1.0F);
                    var4.method3981(1.0F);
                    var4.method3981(0.0F);
                    var4.method3981(0.0F);
                    var4.method3981(1.0F);
                    var4.method3981(0.0F);
                    var4.method3981(1.0F);
                    var4.method3981(0.0F);
                    var4.method3981(0.0F);
                    var4.method3981(0.0F);
                    var4.method3981(0.0F);
                    var4.method3981(0.0F);
                    var4.method3981(0.0F);
                    var4.method3981(0.0F);
                    var4.method3981(0.0F);
                } else {
                    var4.method3979(0.0F);
                    var4.method3979(0.0F);
                    var4.method3979(0.0F);
                    var4.method3979(0.0F);
                    var4.method3979(0.0F);
                    var4.method3979(0.0F);
                    var4.method3979(0.0F);
                    var4.method3979(0.0F);
                    var4.method3979(1.0F);
                    var4.method3979(0.0F);
                    var4.method3979(0.0F);
                    var4.method3979(1.0F);
                    var4.method3979(0.0F);
                    var4.method3979(1.0F);
                    var4.method3979(1.0F);
                    var4.method3979(1.0F);
                    var4.method3979(0.0F);
                    var4.method3979(1.0F);
                    var4.method3979(1.0F);
                    var4.method3979(1.0F);
                    var4.method3979(1.0F);
                    var4.method3979(1.0F);
                    var4.method3979(0.0F);
                    var4.method3979(0.0F);
                    var4.method3979(1.0F);
                    var4.method3979(0.0F);
                    var4.method3979(1.0F);
                    var4.method3979(0.0F);
                    var4.method3979(0.0F);
                    var4.method3979(0.0F);
                    var4.method3979(0.0F);
                    var4.method3979(0.0F);
                    var4.method3979(0.0F);
                    var4.method3979(0.0F);
                    var4.method3979(0.0F);
                }
                var4.method3992();
                if (this.field6344.method275(22022)) {
                    break;
                }
            }
        }
        this.field6331 = this.method68(arg0 + 89, new class585[] { new class585(new class504[] { class504.field7122, class504.field7134, class504.field7134 }) });
    }

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "()Z", line = 2816)
    public final boolean method603() {
        ++field6174;
        return false;
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(II)I", line = 2824)
    public final int method632(int arg0, int arg1) {
        ++field6202;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "(IIII)V", line = 2832)
    public final void method607(int arg0, int arg1, int arg2, int arg3) {
        ++field6098;
        boolean var5 = false;
        if (~arg0 < ~this.field6254) {
            this.field6254 = arg0;
            var5 = true;
        }
        if (this.field6296 > arg2) {
            this.field6296 = arg2;
            var5 = true;
        }
        if (~this.field6232 > ~arg1) {
            this.field6232 = arg1;
            var5 = true;
        }
        if (this.field6266 > arg3) {
            this.field6266 = arg3;
            var5 = true;
        }
        if (var5) {
            if (!this.field6351) {
                this.field6351 = true;
                this.method88((byte) -108);
            }
            this.method47(0);
            this.method2723(-94);
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V", line = 2883)
    public final void method589(int arg0) {
        ++field6138;
        if (~arg0 <= -129 && arg0 <= 1024) {
            if (this.field6302 != null) {
                this.field6302.method4083(-3);
            }
            this.field6300 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "(I)V", line = 2904)
    public final void method2706(int arg0) {
        ++field6160;
        this.field6219.method128();
        this.field6218 = true;
        this.method2678((byte) -99);
        if (arg0 < 70) {
            field6137 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "(I)V", line = 2920)
    public void method82(int arg0) {
        ++field6143;
        this.method2657(true);
        if (arg0 != 4615) {
            this.method561();
        }
    }

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "(I)V", line = 2933)
    private final void method2707(int arg0) {
        ++field6139;
        this.method64(0, this.field6340, 0);
        this.method85((byte) 96, this.field6341);
        if (arg0 > -109) {
            field6100 = 93;
        }
        this.method19((byte) -69, class674.field9244, 0, 1);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILpe;ZI[FI)Lada;", line = 2946)
    public final class175 method2708(int arg0, class636 arg1, boolean arg2, int arg3, float[] arg4, int arg5) {
        ++field6197;
        if (arg5 <= 41) {
            this.field6347 = null;
        }
        return this.method63(arg3, arg0, arg2, 0, arg4, (byte) -121, arg1, 0);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([FB)[F", line = 2957)
    public final float[] method2709(float[] arg0, byte arg1) {
        arg0[8] = this.field6268[2];
        arg0[12] = this.field6268[3];
        ++field6065;
        arg0[0] = this.field6268[0];
        if (arg1 >= -8) {
            return null;
        } else {
            arg0[4] = this.field6268[1];
            arg0[9] = this.field6268[6];
            arg0[1] = this.field6268[4];
            arg0[13] = this.field6268[7];
            arg0[2] = this.field6268[8];
            arg0[5] = this.field6268[5];
            arg0[7] = this.field6268[13];
            arg0[6] = this.field6268[9];
            arg0[3] = this.field6268[12];
            arg0[10] = this.field6268[10];
            arg0[14] = this.field6268[11];
            arg0[15] = this.field6268[15];
            arg0[11] = this.field6268[14];
            return arg0;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lnh;)V", line = 2984)
    public final void method628(class778 arg0) {
        ++field6169;
        this.field6222 = (class256) arg0;
        this.field6224.method141(this.field6222);
        this.field6224.method1543((byte) -35);
        this.field6225.method1528((byte) -97, this.field6224);
        this.field6223.method1528((byte) -97, this.field6222);
        if (this.field6292.method3844(25596)) {
            this.method2644((byte) -80);
        }
    }

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "(I)Leia;", line = 2999)
    public final class256 method2710(int arg0) {
        if (arg0 > -37) {
            this.field6259 = -30;
        }
        ++field6042;
        return this.field6294[this.field6261];
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZIZ)V", line = 3012)
    public final void method2711(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (arg0 != -1) {
            this.method613(17, 26, -114, 12, -69, -23, 57, -125, -67);
        }
        if (~this.field6297 != ~arg2 || this.field6260 == !this.field6228) {
            class175 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field6228 ? 3 : 0;
            if (~arg2 > -1) {
                this.method2671(arg0 ^ -98);
            } else {
                var5 = this.field6302.method4084(arg2, arg0 + 22344);
                class359 var10 = super.field890.method1138(arg2, 95);
                if (~var10.field4444 == -1 && var10.field4449 == 0) {
                    this.method2671(113);
                } else {
                    int var11 = var10.field4451 ? 64 : 128;
                    int var12 = var11 * 50;
                    class256 var13 = this.method2710(arg0 ^ 49);
                    var13.method1541(0.0F, (float) (this.field6229 % var12 * var10.field4449) / (float) var12, (float) (this.field6229 % var12 * var10.field4444) / (float) var12, (byte) 92);
                    this.method2720(class326.field4040, (byte) 43);
                }
                var6 = var10.field4450;
                if (!this.field6228) {
                    var7 = var10.field4445;
                    var9 = var10.field4459;
                    var8 = var10.field4456;
                }
            }
            this.method2674(var9, var8, arg1, var7, 1, arg3);
            if (this.field6310 != null) {
                this.field6310.method701(true, var6, var5);
            } else {
                this.method2643(-2, var5);
                this.method2649((byte) 126, var6);
            }
            this.field6297 = arg2;
            this.field6260 = this.field6228;
        }
        ++field6061;
        this.field6230 &= -8;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZIII[I)Lada;", line = 3080)
    public final class175 method2712(boolean arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field6158;
        return arg3 != 0 ? null : this.method83(arg1, 0, arg2, 0, false, arg0, arg4);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 3091)
    public final void method584(int arg0) {
        ++field6154;
    }

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "()V", line = 3100)
    public void method53() {
        if (!this.field6252) {
            for (class379 var1 = this.field6185.method2725(37); var1 != null; var1 = this.field6185.method2726(-126)) {
                ((class591) var1).method3390(true);
            }
            Enumeration var2 = this.field6121.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method73((byte) 121, var3, this.field6121.get(var3));
            }
            class738.method4150(true, false, 0);
            this.field6094.release();
            this.field6252 = true;
        }
        ++field6176;
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(II)V", line = 3135)
    public final void method606(int arg0, int arg1) {
        ++field6163;
        if (this.field6322 != arg0 || ~this.field6227 != ~arg1) {
            this.field6322 = arg0;
            this.field6227 = arg1;
            this.method2651(2);
            this.method2646(true);
            this.method2685(true);
        }
    }

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "(I)Leia;", line = 3151)
    public final class256 method2713(int arg0) {
        ++field6127;
        return arg0 != -6057 ? null : this.field6224;
    }

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "(I)V", line = 3173)
    public void method39(int arg0) {
        ++field6132;
        if (arg0 >= -111) {
            this.method644(-120, 25, 118, 85, true);
        }
        this.field6247 = this.field6262;
        this.field6262 = 0;
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "()I", line = 3189)
    public final int method583() {
        ++field6113;
        return this.field6264 + -2;
    }

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "(I)V", line = 3197)
    private final void method2714(int arg0) {
        if (arg0 != 9) {
            this.field6247 = -35;
        }
        if (!this.field6312) {
            float[] var2 = this.field6237;
            this.field6312 = true;
            if (~this.field6148 != -1 && this.field6096 != 0) {
                var2[11] = 0.0F;
                var2[13] = 1.0F;
                var2[2] = 0.0F;
                var2[1] = 0.0F;
                var2[8] = 0.0F;
                var2[7] = 0.0F;
                var2[6] = 0.0F;
                var2[5] = -2.0F / (float) this.field6096;
                var2[10] = 0.5F;
                var2[3] = 0.0F;
                var2[0] = 2.0F / (float) this.field6148;
                var2[12] = -1.0F;
                var2[4] = 0.0F;
                var2[9] = 0.0F;
                var2[14] = 0.5F;
                var2[15] = 1.0F;
            } else {
                var2[7] = 0.0F;
                var2[5] = 1.0F;
                var2[14] = 0.0F;
                var2[3] = 0.0F;
                var2[11] = 0.0F;
                var2[1] = 0.0F;
                var2[9] = 0.0F;
                var2[6] = 0.0F;
                var2[0] = 1.0F;
                var2[8] = 0.0F;
                var2[13] = 0.0F;
                var2[2] = 0.0F;
                var2[10] = 1.0F;
                var2[4] = 0.0F;
                var2[12] = 0.0F;
                var2[15] = 1.0F;
            }
        }
        ++field6078;
    }

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "(B)V", line = 3256)
    private final void method2715(byte arg0) {
        if (!this.field6279) {
            float[] var2 = this.field6291;
            float var3 = (float) (-this.field6282 * this.field6322) / (float) this.field6271;
            float var4 = (float) ((this.field6148 - this.field6282) * this.field6322) / (float) this.field6271;
            float var5 = (float) (this.field6322 * this.field6317) / (float) this.field6275;
            float var6 = (float) ((-this.field6096 + this.field6317) * this.field6322) / (float) this.field6275;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field6322 * 2.0F;
                var2[0] = var7 / (-var3 + var4);
                var2[4] = 0.0F;
                var2[3] = 0.0F;
                var2[15] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[13] = 0.0F;
                var2[14] = this.field6326 = (float) (this.field6322 * this.field6227) / (float) (-this.field6227 + this.field6322);
                var2[1] = 0.0F;
                var2[12] = 0.0F;
                var2[11] = -1.0F;
                var2[6] = 0.0F;
                var2[10] = this.field6286 = (float) this.field6227 / (float) (this.field6322 - this.field6227);
                var2[7] = 0.0F;
                var2[9] = (var5 + var6) / (-var6 + var5);
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[2] = 0.0F;
            } else {
                var2[12] = 0.0F;
                var2[15] = 1.0F;
                var2[11] = 0.0F;
                var2[0] = 1.0F;
                var2[14] = 0.0F;
                var2[7] = 0.0F;
                var2[3] = 0.0F;
                var2[4] = 0.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[9] = 0.0F;
                var2[2] = 0.0F;
                var2[5] = 1.0F;
                var2[10] = 1.0F;
                var2[8] = 0.0F;
                var2[13] = 0.0F;
            }
            this.method2667(0);
            this.field6279 = true;
        }
        int var8 = 42 / ((-63 - arg0) / 46);
        ++field6092;
    }

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "()Z", line = 3327)
    public final boolean method625() {
        ++field6165;
        return true;
    }

    @OriginalMember(owner = "client!wg", name = "ra", descriptor = "(IIII)V", line = 3336)
    public final void method560(int arg0, int arg1, int arg2, int arg3) {
        this.field6228 = true;
        this.field6269 = arg1;
        this.field6313 = arg2;
        ++field6198;
        this.field6287 = arg3;
        this.field6290 = arg0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lei;ILei;)V", line = 3350)
    public final void method2716(class191 arg0, int arg1, class191 arg2) {
        ++field6200;
        boolean var4 = false;
        if (this.field6309[this.field6261] != arg2) {
            this.field6309[this.field6261] = arg2;
            this.method51(0);
            var4 = true;
        }
        if (this.field6298[this.field6261] != arg0) {
            this.field6298[this.field6261] = arg0;
            this.method14((byte) -9);
            var4 = true;
        }
        if (var4) {
            this.field6230 &= -30;
        }
        if (arg1 < 36) {
            this.field6247 = -48;
        }
    }

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "(B)V", line = 3383)
    public final void method2717(byte arg0) {
        this.field6294 = new class256[this.field6272];
        this.field6309 = new class191[this.field6272];
        this.field6314 = new class315[this.field6272];
        ++field6087;
        this.field6298 = new class191[this.field6272];
        this.field6311 = new class586[this.field6272];
        for (int var2 = 0; this.field6272 > var2; ++var2) {
            this.field6298[var2] = class269.field3180;
            this.field6309[var2] = class269.field3180;
            this.field6311[var2] = class533.field7504;
            this.field6294[var2] = new class256();
        }
        this.field6299 = new class515[this.field6264 - 2];
        this.field6257 = this.method3(class748.field10384, 1, class141.field1759, (byte) 42, 1);
        this.method581(new class591(262144));
        this.field6329 = this.method68(84, new class585[] { new class585(new class504[] { class504.field7122, class504.field7134 }) });
        this.field6345 = this.method68(95, new class585[] { new class585(new class504[] { class504.field7122, class504.field7129 }) });
        this.field6333 = this.method68(94, new class585[] { new class585(class504.field7122), new class585(class504.field7129), new class585(class504.field7134), new class585(class504.field7125) });
        this.field6339 = this.method68(90, new class585[] { new class585(class504.field7122), new class585(class504.field7129), new class585(class504.field7134) });
        this.field6338 = new class650(this, 0, 0, false, false);
        this.field6335 = new class650(this, 0, 0, true, true);
        this.field6346 = new class650(this, 0, 0, false, false);
        this.field6343 = new class650(this, 0, 0, true, true);
        this.field6334 = new class650(this, 0, 0, false, false);
        this.field6330 = new class650(this, 0, 0, true, true);
        if (arg0 >= -5) {
            this.field6273 = 0.057956904F;
        }
        this.field6328 = new class650(this, 0, 0, false, false);
        this.field6349 = new class650(this, 0, 0, true, true);
        this.field6342 = new class650(this, 0, 0, false, false);
        this.field6348 = new class650(this, 0, 0, true, true);
        this.field6277 = new class368(this);
        this.field6347 = this.method15(false, true);
        this.method2704(0);
        this.field6105 = new class213(this);
        this.field6288[1] = this.method16(1, -12567);
        this.field6288[2] = this.method16(2, -12567);
        this.field6288[4] = this.method16(4, -12567);
        this.field6288[5] = this.method16(5, -12567);
        this.field6288[6] = this.method16(6, -12567);
        this.field6288[7] = this.method16(7, -12567);
        this.field6288[3] = this.method16(3, -12567);
        this.field6288[8] = this.method16(8, -12567);
        this.field6288[9] = this.method16(9, -12567);
        if (!this.field6288[2].method703((byte) 127)) {
            this.field6288[2] = this.method16(0, -12567);
        }
        if (!this.field6288[4].method703((byte) 127)) {
            this.field6288[4] = this.field6288[2];
        }
        if (!this.field6288[8].method703((byte) 127)) {
            this.field6288[8] = this.field6288[4];
        }
        if (!this.field6288[9].method703((byte) 127)) {
            this.field6288[9] = this.field6288[8];
        }
        this.method82(4615);
        this.method634();
        this.method25();
    }

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "(B)V", line = 3459)
    private final void method2718(byte arg0) {
        ++field6047;
        this.field6336 = this.method57(14, false);
        if (arg0 < 119) {
            this.field6294 = null;
        }
        this.field6336.method273(3096, (byte) 125, 12);
        for (int var2 = 0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field6336.method271(true, (byte) 92);
            if (var3 != null) {
                Stream var4 = this.method2650((byte) 106, var3);
                var4.method3979(0.0F);
                var4.method3979(0.0F);
                var4.method3979(0.0F);
                for (int var5 = 0; var5 <= 256; ++var5) {
                    double var6 = (double) (var5 * 2) * 3.141592653589793D / 256.0D;
                    float var8 = (float) Math.cos(var6);
                    float var9 = (float) Math.sin(var6);
                    if (!Stream.method3985()) {
                        var4.method3981(var9);
                        var4.method3981(var8);
                        var4.method3981(0.0F);
                    } else {
                        var4.method3979(var9);
                        var4.method3979(var8);
                        var4.method3979(0.0F);
                    }
                }
                var4.method3992();
                if (this.field6336.method275(22022)) {
                    break;
                }
            }
        }
        this.field6332 = this.method68(104, new class585[] { new class585(class504.field7122) });
    }

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "()Z", line = 3527)
    public final boolean method639() {
        ++field6035;
        return false;
    }

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "(I)V", line = 3535)
    private final void method2719(int arg0) {
        ++field6188;
        if (class276.field3240 != this.field6292) {
            class688 var2 = this.field6292;
            this.field6292 = class276.field3240;
            if (!var2.method3844(25596)) {
                this.method2644((byte) -60);
            }
            this.method2658((byte) -25);
            this.field6268 = this.field6295;
            this.method2642((byte) 113);
            this.field6230 &= -8;
        }
        if (arg0 != 5) {
            this.method626(1.3156462F);
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 3571)
    public final void method637(Canvas arg0, int arg1, int arg2) {
        ++field6194;
        if (this.field6201 == arg0) {
            throw new RuntimeException();
        } else if (!this.field6121.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method77((byte) -75, arg0);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field6121.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)V", line = 3607)
    public final void method605(int arg0) {
        ++field6190;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lsi;B)V", line = 3616)
    public final void method2720(class586 arg0, byte arg1) {
        if (arg1 <= 39) {
            this.field6253 = 104;
        }
        ++field6128;
        this.field6311[this.field6261] = arg0;
        this.method2664((byte) -117);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Leia;I)V", line = 3630)
    public final void method2721(class256 arg0, int arg1) {
        ++field6072;
        this.field6219.method141(arg0);
        this.field6218 = false;
        this.method2678((byte) -103);
        if (arg1 != 14) {
            this.field6257 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(IZ)V", line = 3643)
    public final void method2722(int arg0, boolean arg1) {
        ++field6184;
        if (!arg1 != !this.field6316) {
            this.field6316 = arg1;
            this.method34((byte) 117);
        }
        if (arg0 != -2614) {
            this.method2690(7);
        }
    }

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "()I", line = 3661)
    public final int method562() {
        ++field6170;
        return this.field6350;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 3675)
    public final void method554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field6203;
    }

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "(I)V", line = 3682)
    private final void method2723(int arg0) {
        this.field6284 = (float) (this.field6296 - this.field6282);
        if (arg0 < -64) {
            ++field6112;
            this.field6321 = (float) (-this.field6317 + this.field6232);
            this.field6246 = (float) (-this.field6282 + this.field6254);
            this.field6301 = (float) (-this.field6317 + this.field6266);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)Loda;")
    public abstract class129 method57(int arg0, boolean arg1);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ldw;Lpe;I)Z")
    public abstract boolean method42(class748 arg0, class636 arg1, int arg2);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ldw;ILpe;BI)Lada;")
    public abstract class175 method3(class748 arg0, int arg1, class636 arg2, byte arg3, int arg4);

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "(I)V")
    public abstract void method51(int arg0);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZLmga;)V")
    public abstract void method91(int arg0, int arg1, boolean arg2, class738 arg3);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILoda;I)V")
    public abstract void method64(int arg0, class129 arg1, int arg2);

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(B)V")
    public abstract void method75(byte arg0);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLnca;)V")
    public abstract void method85(byte arg0, class785 arg1);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lmga;ZBZI)V")
    public abstract void method4(class738 arg0, boolean arg1, byte arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(B)V")
    public abstract void method88(byte arg0);

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "(I)V")
    public abstract void method47(int arg0);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
    public abstract void method58(Canvas arg0, Object arg1, int arg2);

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "(B)F")
    public abstract float method55(byte arg0);

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "(I)V")
    public abstract void method9(int arg0);

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "(I)V")
    public abstract void method22(int arg0);

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "(I)V")
    public abstract void method7(int arg0);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLkja;II)V")
    public abstract void method19(byte arg0, class686 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "(I)V")
    public abstract void method21(int arg0);

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "(I)V")
    public abstract void method12(int arg0);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[BIIZLpe;II)Lada;")
    public abstract class175 method11(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4, class636 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "(B)V")
    public abstract void method80(byte arg0);

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "(B)V")
    public abstract void method34(byte arg0);

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "(B)V")
    public abstract void method29(byte arg0);

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "(I)V")
    public abstract void method78(int arg0);

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "(B)V")
    public abstract void method48(byte arg0);

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "(I)V")
    public abstract void method74(int arg0);

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(BI)V")
    public abstract void method30(byte arg0, int arg1);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZI[FBLpe;I)Lada;")
    public abstract class175 method63(int arg0, int arg1, boolean arg2, int arg3, float[] arg4, byte arg5, class636 arg6, int arg7);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[Lpo;)Lnca;")
    public abstract class785 method68(int arg0, class585[] arg1);

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "(Z)V")
    public abstract void method38(boolean arg0);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIZZ[I)Lada;")
    public abstract class175 method83(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int[] arg6);

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "(I)V")
    public abstract void method23(int arg0);

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "(I)V")
    public abstract void method18(int arg0);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([BIIIBLpe;)Lch;")
    public abstract class489 method26(byte[] arg0, int arg1, int arg2, int arg3, byte arg4, class636 arg5);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lgha;I)V")
    public abstract void method59(class366 arg0, int arg1);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI[[II)Lmia;")
    public abstract class69 method46(boolean arg0, int arg1, int[][] arg2, int arg3);

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;I)V")
    public abstract void method27(Canvas arg0, Object arg1, int arg2);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method73(byte arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "(I)V")
    public abstract void method43(int arg0);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method77(byte arg0, Canvas arg1);

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "(B)V")
    public abstract void method8(byte arg0);

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "(I)V")
    public abstract void method90(int arg0);

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "(Z)V")
    public abstract void method86(boolean arg0);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZZ)Lje;")
    public abstract class422 method15(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "(B)V")
    public abstract void method72(byte arg0);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lje;BILkja;III)V")
    public abstract void method1(class422 arg0, byte arg1, int arg2, class686 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(IZ)V")
    public abstract void method41(int arg0, boolean arg1);

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "(B)V")
    public abstract void method14(byte arg0);

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "(B)V")
    public abstract void method33(byte arg0);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lpe;ILdw;)Z")
    public abstract boolean method62(class636 arg0, int arg1, class748 arg2);
}
