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

@OriginalClass("client!en")
public abstract class class478 extends class566 {

    @OriginalMember(owner = "client!en", name = "mb", descriptor = "Lae;")
    private class40 field6097 = new class40();

    @OriginalMember(owner = "client!en", name = "Od", descriptor = "Z")
    public boolean field6229 = true;

    @OriginalMember(owner = "client!en", name = "Rd", descriptor = "Lmga;")
    public class691 field6232 = new class691();

    @OriginalMember(owner = "client!en", name = "Td", descriptor = "Lmga;")
    public class691 field6234 = new class691();

    @OriginalMember(owner = "client!en", name = "Ud", descriptor = "Lmga;")
    public class691 field6235 = new class691();

    @OriginalMember(owner = "client!en", name = "Vd", descriptor = "Lmga;")
    public class691 field6236 = new class691();

    @OriginalMember(owner = "client!en", name = "Wd", descriptor = "Lmga;")
    private class691 field6237 = new class691();

    @OriginalMember(owner = "client!en", name = "Xd", descriptor = "Lmga;")
    private class691 field6238 = new class691();

    @OriginalMember(owner = "client!en", name = "ne", descriptor = "I")
    private int field6254 = 0;

    @OriginalMember(owner = "client!en", name = "Yd", descriptor = "[F")
    private float[] field6239 = new float[16];

    @OriginalMember(owner = "client!en", name = "he", descriptor = "I")
    private int field6248 = 16777215;

    @OriginalMember(owner = "client!en", name = "ve", descriptor = "I")
    public int field6262 = 128;

    @OriginalMember(owner = "client!en", name = "je", descriptor = "Z")
    private boolean field6250 = false;

    @OriginalMember(owner = "client!en", name = "qe", descriptor = "Z")
    public boolean field6257 = true;

    @OriginalMember(owner = "client!en", name = "De", descriptor = "F")
    public float field6270 = 3584.0F;

    @OriginalMember(owner = "client!en", name = "se", descriptor = "[Lcl;")
    private class74[] field6259 = new class74[10];

    @OriginalMember(owner = "client!en", name = "Le", descriptor = "F")
    private float field6278 = 1.0F;

    @OriginalMember(owner = "client!en", name = "Ae", descriptor = "I")
    public int field6267 = 3584;

    @OriginalMember(owner = "client!en", name = "me", descriptor = "Z")
    public boolean field6253 = false;

    @OriginalMember(owner = "client!en", name = "ae", descriptor = "I")
    public int field6241 = 3;

    @OriginalMember(owner = "client!en", name = "re", descriptor = "I")
    private int field6258 = 1;

    @OriginalMember(owner = "client!en", name = "Xe", descriptor = "F")
    public float field6290 = -1.0F;

    @OriginalMember(owner = "client!en", name = "Je", descriptor = "I")
    private int field6276 = -1;

    @OriginalMember(owner = "client!en", name = "Ie", descriptor = "F")
    public float field6275 = 1.0F;

    @OriginalMember(owner = "client!en", name = "Ge", descriptor = "Z")
    private boolean field6273 = false;

    @OriginalMember(owner = "client!en", name = "af", descriptor = "Z")
    public boolean field6293 = false;

    @OriginalMember(owner = "client!en", name = "ef", descriptor = "I")
    public int field6297 = 512;

    @OriginalMember(owner = "client!en", name = "mf", descriptor = "F")
    public float field6304 = -1.0F;

    @OriginalMember(owner = "client!en", name = "Ce", descriptor = "[F")
    private float[] field6269 = new float[16];

    @OriginalMember(owner = "client!en", name = "Te", descriptor = "I")
    public int field6286 = 0;

    @OriginalMember(owner = "client!en", name = "Oe", descriptor = "Z")
    public boolean field6281 = true;

    @OriginalMember(owner = "client!en", name = "cf", descriptor = "F")
    public float field6295 = 1.0F;

    @OriginalMember(owner = "client!en", name = "ee", descriptor = "I")
    private int field6245 = -1;

    @OriginalMember(owner = "client!en", name = "Ve", descriptor = "Llea;")
    public class326 field6288 = class385.field4847;

    @OriginalMember(owner = "client!en", name = "tf", descriptor = "I")
    public int field6311 = 8;

    @OriginalMember(owner = "client!en", name = "Ze", descriptor = "[F")
    private float[] field6292 = new float[16];

    @OriginalMember(owner = "client!en", name = "Qe", descriptor = "Z")
    private boolean field6283 = false;

    @OriginalMember(owner = "client!en", name = "nf", descriptor = "Z")
    public boolean field6305 = false;

    @OriginalMember(owner = "client!en", name = "lf", descriptor = "I")
    public int field6303 = -1;

    @OriginalMember(owner = "client!en", name = "yf", descriptor = "[F")
    private float[] field6316 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!en", name = "ye", descriptor = "[F")
    private float[] field6265 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!en", name = "vf", descriptor = "[F")
    private float[] field6313 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!en", name = "wf", descriptor = "Z")
    public boolean field6314 = true;

    @OriginalMember(owner = "client!en", name = "Gf", descriptor = "I")
    public int field6324 = -1;

    @OriginalMember(owner = "client!en", name = "pf", descriptor = "I")
    public int field6307 = 0;

    @OriginalMember(owner = "client!en", name = "Cf", descriptor = "F")
    public float field6320 = 3584.0F;

    @OriginalMember(owner = "client!en", name = "He", descriptor = "Z")
    public boolean field6274 = false;

    @OriginalMember(owner = "client!en", name = "kf", descriptor = "I")
    public int field6302 = 0;

    @OriginalMember(owner = "client!en", name = "gf", descriptor = "[F")
    public float[] field6299 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!en", name = "Se", descriptor = "I")
    public int field6285 = 0;

    @OriginalMember(owner = "client!en", name = "Re", descriptor = "Z")
    private boolean field6284 = false;

    @OriginalMember(owner = "client!en", name = "of", descriptor = "I")
    public int field6306 = 0;

    @OriginalMember(owner = "client!en", name = "Af", descriptor = "I")
    public int field6318 = 50;

    @OriginalMember(owner = "client!en", name = "ke", descriptor = "F")
    public float field6251 = 1.0F;

    @OriginalMember(owner = "client!en", name = "Df", descriptor = "I")
    private int field6321 = -1;

    @OriginalMember(owner = "client!en", name = "Hf", descriptor = "I")
    private int field6325 = 0;

    @OriginalMember(owner = "client!en", name = "Ff", descriptor = "I")
    public int field6323 = 0;

    @OriginalMember(owner = "client!en", name = "ze", descriptor = "I")
    public int field6266 = 0;

    @OriginalMember(owner = "client!en", name = "Lf", descriptor = "I")
    private int field6329 = 0;

    @OriginalMember(owner = "client!en", name = "Zd", descriptor = "I")
    public int field6240 = 512;

    @OriginalMember(owner = "client!en", name = "Qf", descriptor = "Z")
    private boolean field6334 = false;

    @OriginalMember(owner = "client!en", name = "Nf", descriptor = "F")
    public float field6331 = 1.0F;

    @OriginalMember(owner = "client!en", name = "Ef", descriptor = "Z")
    public boolean field6322 = true;

    @OriginalMember(owner = "client!en", name = "Of", descriptor = "[F")
    public float[] field6332 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!en", name = "Mf", descriptor = "Lsfa;")
    public class291 field6330 = class167.field2193;

    @OriginalMember(owner = "client!en", name = "zf", descriptor = "[F")
    public float[] field6317 = this.field6316;

    @OriginalMember(owner = "client!en", name = "Rf", descriptor = "I")
    public int field6335 = 0;

    @OriginalMember(owner = "client!en", name = "Ue", descriptor = "I")
    private int field6287 = 0;

    @OriginalMember(owner = "client!en", name = "qf", descriptor = "I")
    public int field6308 = 0;

    @OriginalMember(owner = "client!en", name = "Pf", descriptor = "I")
    public int field6333 = 0;

    @OriginalMember(owner = "client!en", name = "Uf", descriptor = "Z")
    public boolean field6338 = true;

    @OriginalMember(owner = "client!en", name = "Vf", descriptor = "Z")
    private boolean field6339 = false;

    @OriginalMember(owner = "client!en", name = "Bf", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6319 = new Stream();

    @OriginalMember(owner = "client!en", name = "cg", descriptor = "Lmga;")
    private class691 field6346 = new class691();

    @OriginalMember(owner = "client!en", name = "q", descriptor = "Ljava/lang/Object;")
    public Object field6049;

    @OriginalMember(owner = "client!en", name = "N", descriptor = "Ljava/lang/Object;")
    private Object field6072;

    @OriginalMember(owner = "client!en", name = "nd", descriptor = "Lpl;")
    public class612 field6202;

    @OriginalMember(owner = "client!en", name = "te", descriptor = "I")
    public int field6260;

    @OriginalMember(owner = "client!en", name = "A", descriptor = "Ljava/awt/Canvas;")
    public Canvas field6059;

    @OriginalMember(owner = "client!en", name = "ab", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6085;

    @OriginalMember(owner = "client!en", name = "If", descriptor = "I")
    public int field6326;

    @OriginalMember(owner = "client!en", name = "pc", descriptor = "I")
    private int field6152;

    @OriginalMember(owner = "client!en", name = "R", descriptor = "I")
    public int field6076;

    @OriginalMember(owner = "client!en", name = "gd", descriptor = "I")
    private int field6195;

    @OriginalMember(owner = "client!en", name = "sb", descriptor = "I")
    public int field6103;

    @OriginalMember(owner = "client!en", name = "Rb", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field6128;

    @OriginalMember(owner = "client!en", name = "de", descriptor = "Lsda;")
    private class7 field6244;

    @OriginalMember(owner = "client!en", name = "Sc", descriptor = "I")
    public static int field6181 = 1407;

    @OriginalMember(owner = "client!en", name = "ce", descriptor = "F")
    public float field6243;

    @OriginalMember(owner = "client!en", name = "le", descriptor = "F")
    public float field6252;

    @OriginalMember(owner = "client!en", name = "Ee", descriptor = "F")
    public float field6271;

    @OriginalMember(owner = "client!en", name = "Ne", descriptor = "F")
    public float field6280;

    @OriginalMember(owner = "client!en", name = "Ye", descriptor = "F")
    public float field6291;

    @OriginalMember(owner = "client!en", name = "bf", descriptor = "F")
    public float field6294;

    @OriginalMember(owner = "client!en", name = "sf", descriptor = "F")
    private float field6310;

    @OriginalMember(owner = "client!en", name = "Kf", descriptor = "F")
    private float field6328;

    @OriginalMember(owner = "client!en", name = "o", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!en", name = "p", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!en", name = "r", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!en", name = "s", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!en", name = "t", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!en", name = "u", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!en", name = "v", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!en", name = "w", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!en", name = "x", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!en", name = "y", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!en", name = "z", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!en", name = "B", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!en", name = "C", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!en", name = "D", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!en", name = "E", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!en", name = "G", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!en", name = "H", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!en", name = "I", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!en", name = "J", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!en", name = "K", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!en", name = "L", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!en", name = "M", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!en", name = "O", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!en", name = "P", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!en", name = "Q", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!en", name = "T", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!en", name = "U", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!en", name = "V", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!en", name = "W", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!en", name = "X", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!en", name = "Y", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!en", name = "Z", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!en", name = "bb", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!en", name = "cb", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!en", name = "db", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!en", name = "eb", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!en", name = "fb", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!en", name = "gb", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!en", name = "hb", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!en", name = "ib", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!en", name = "jb", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!en", name = "kb", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!en", name = "lb", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!en", name = "nb", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!en", name = "ob", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!en", name = "pb", descriptor = "I")
    public static int field6100;

    @OriginalMember(owner = "client!en", name = "rb", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!en", name = "tb", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!en", name = "ub", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!en", name = "vb", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!en", name = "wb", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!en", name = "xb", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!en", name = "yb", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!en", name = "zb", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!en", name = "Ab", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!en", name = "Bb", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!en", name = "Cb", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!en", name = "Db", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!en", name = "Eb", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!en", name = "Fb", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!en", name = "Gb", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!en", name = "Hb", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!en", name = "Ib", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!en", name = "Jb", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!en", name = "Kb", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!en", name = "Lb", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!en", name = "Mb", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!en", name = "Nb", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!en", name = "Ob", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!en", name = "Pb", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!en", name = "Qb", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!en", name = "Sb", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!en", name = "Tb", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!en", name = "Ub", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!en", name = "Vb", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!en", name = "Wb", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!en", name = "Xb", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!en", name = "Yb", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!en", name = "Zb", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!en", name = "ac", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!en", name = "bc", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!en", name = "cc", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!en", name = "dc", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!en", name = "ec", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!en", name = "fc", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!en", name = "gc", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!en", name = "hc", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!en", name = "ic", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!en", name = "jc", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!en", name = "kc", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!en", name = "lc", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!en", name = "mc", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!en", name = "nc", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!en", name = "oc", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!en", name = "qc", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!en", name = "rc", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!en", name = "sc", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!en", name = "tc", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!en", name = "uc", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!en", name = "vc", descriptor = "I")
    public static int field6158;

    @OriginalMember(owner = "client!en", name = "wc", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!en", name = "xc", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!en", name = "yc", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!en", name = "zc", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!en", name = "Ac", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!en", name = "Bc", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!en", name = "Cc", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!en", name = "Dc", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!en", name = "Ec", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!en", name = "Fc", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!en", name = "Gc", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!en", name = "Hc", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!en", name = "Ic", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!en", name = "Jc", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!en", name = "Kc", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!en", name = "Mc", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!en", name = "Nc", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!en", name = "Oc", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!en", name = "Pc", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!en", name = "Qc", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!en", name = "Rc", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!en", name = "Tc", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!en", name = "Uc", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!en", name = "Vc", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!en", name = "Wc", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!en", name = "Xc", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!en", name = "Yc", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!en", name = "Zc", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!en", name = "ad", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!en", name = "bd", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!en", name = "cd", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!en", name = "dd", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!en", name = "ed", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!en", name = "fd", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!en", name = "hd", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!en", name = "id", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!en", name = "jd", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!en", name = "kd", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!en", name = "ld", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!en", name = "md", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!en", name = "od", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!en", name = "pd", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!en", name = "qd", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!en", name = "rd", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!en", name = "sd", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!en", name = "td", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!en", name = "ud", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!en", name = "vd", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!en", name = "wd", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!en", name = "xd", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!en", name = "yd", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!en", name = "zd", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!en", name = "Ad", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!en", name = "Bd", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!en", name = "Cd", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!en", name = "Dd", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!en", name = "Ed", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!en", name = "Fd", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!en", name = "Gd", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!en", name = "Hd", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!en", name = "Id", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!en", name = "Kd", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!en", name = "Ld", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!en", name = "Md", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!en", name = "Nd", descriptor = "I")
    public int field6228;

    @OriginalMember(owner = "client!en", name = "Pd", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!en", name = "Qd", descriptor = "I")
    public int field6231;

    @OriginalMember(owner = "client!en", name = "Sd", descriptor = "I")
    public int field6233;

    @OriginalMember(owner = "client!en", name = "we", descriptor = "I")
    public int field6263;

    @OriginalMember(owner = "client!en", name = "Be", descriptor = "I")
    private int field6268;

    @OriginalMember(owner = "client!en", name = "Me", descriptor = "I")
    public int field6279;

    @OriginalMember(owner = "client!en", name = "Pe", descriptor = "I")
    public int field6282;

    @OriginalMember(owner = "client!en", name = "df", descriptor = "I")
    public int field6296;

    @OriginalMember(owner = "client!en", name = "ff", descriptor = "I")
    public int field6298;

    @OriginalMember(owner = "client!en", name = "hf", descriptor = "I")
    public int field6300;

    @OriginalMember(owner = "client!en", name = "jf", descriptor = "I")
    public int field6301;

    @OriginalMember(owner = "client!en", name = "rf", descriptor = "I")
    private int field6309;

    @OriginalMember(owner = "client!en", name = "uf", descriptor = "I")
    public int field6312;

    @OriginalMember(owner = "client!en", name = "rg", descriptor = "I")
    private int field6361;

    @OriginalMember(owner = "client!en", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!en", name = "Lc", descriptor = "Lbd;")
    public class190 field6174;

    @OriginalMember(owner = "client!en", name = "ie", descriptor = "Ltfa;")
    private class290 field6249;

    @OriginalMember(owner = "client!en", name = "Xf", descriptor = "Lja;")
    public class306 field6341;

    @OriginalMember(owner = "client!en", name = "Zf", descriptor = "Lja;")
    public class306 field6343;

    @OriginalMember(owner = "client!en", name = "ag", descriptor = "Lja;")
    public class306 field6344;

    @OriginalMember(owner = "client!en", name = "dg", descriptor = "Lja;")
    public class306 field6347;

    @OriginalMember(owner = "client!en", name = "fg", descriptor = "Lja;")
    public class306 field6349;

    @OriginalMember(owner = "client!en", name = "gg", descriptor = "Lja;")
    public class306 field6350;

    @OriginalMember(owner = "client!en", name = "jg", descriptor = "Lja;")
    public class306 field6353;

    @OriginalMember(owner = "client!en", name = "lg", descriptor = "Lja;")
    public class306 field6355;

    @OriginalMember(owner = "client!en", name = "ng", descriptor = "Lja;")
    public class306 field6357;

    @OriginalMember(owner = "client!en", name = "og", descriptor = "Lja;")
    public class306 field6358;

    @OriginalMember(owner = "client!en", name = "be", descriptor = "Lj;")
    private class352 field6242;

    @OriginalMember(owner = "client!en", name = "bg", descriptor = "Lnba;")
    private class401 field6345;

    @OriginalMember(owner = "client!en", name = "eg", descriptor = "Lnba;")
    private class401 field6348;

    @OriginalMember(owner = "client!en", name = "fe", descriptor = "Lhfa;")
    public class466 field6246;

    @OriginalMember(owner = "client!en", name = "hg", descriptor = "Lhh;")
    private class666 field6351;

    @OriginalMember(owner = "client!en", name = "Ke", descriptor = "Lcl;")
    private class74 field6277;

    @OriginalMember(owner = "client!en", name = "Wf", descriptor = "Lmq;")
    public class81 field6340;

    @OriginalMember(owner = "client!en", name = "Yf", descriptor = "Lmq;")
    public class81 field6342;

    @OriginalMember(owner = "client!en", name = "ig", descriptor = "Lmq;")
    public class81 field6352;

    @OriginalMember(owner = "client!en", name = "kg", descriptor = "Lmq;")
    public class81 field6354;

    @OriginalMember(owner = "client!en", name = "mg", descriptor = "Lmq;")
    private class81 field6356;

    @OriginalMember(owner = "client!en", name = "pg", descriptor = "Lmq;")
    private class81 field6359;

    @OriginalMember(owner = "client!en", name = "F", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field6064;

    @OriginalMember(owner = "client!en", name = "Jd", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field6224;

    @OriginalMember(owner = "client!en", name = "qb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field6101;

    @OriginalMember(owner = "client!en", name = "ge", descriptor = "Z")
    public boolean field6247;

    @OriginalMember(owner = "client!en", name = "pe", descriptor = "Z")
    public boolean field6256;

    @OriginalMember(owner = "client!en", name = "Fe", descriptor = "Z")
    public boolean field6272;

    @OriginalMember(owner = "client!en", name = "We", descriptor = "Z")
    public boolean field6289;

    @OriginalMember(owner = "client!en", name = "Jf", descriptor = "Z")
    public boolean field6327;

    @OriginalMember(owner = "client!en", name = "qg", descriptor = "Z")
    public boolean field6360;

    @OriginalMember(owner = "client!en", name = "Sf", descriptor = "[Lki;")
    public class320[] field6336;

    @OriginalMember(owner = "client!en", name = "Tf", descriptor = "[Lgga;")
    public class332[] field6337;

    @OriginalMember(owner = "client!en", name = "oe", descriptor = "[Lnw;")
    public class347[] field6255;

    @OriginalMember(owner = "client!en", name = "xe", descriptor = "[Lnw;")
    public class347[] field6264;

    @OriginalMember(owner = "client!en", name = "ue", descriptor = "[Lhfa;")
    private class466[] field6261;

    @OriginalMember(owner = "client!en", name = "S", descriptor = "[Lf;")
    public static class536[] field6077;

    @OriginalMember(owner = "client!en", name = "xf", descriptor = "[Lmga;")
    public class691[] field6315;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([IIIII)Lf;", line = 4)
    public final class536 method1025(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6138;
        return new class22(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!en", name = "i", descriptor = "(I)V", line = 16)
    public static void method2522(int arg0) {
        field6077 = null;
        if (arg0 != 0) {
            method2522(93);
        }
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "()Z", line = 31)
    public final boolean method985() {
        ++field6069;
        return this.field6272;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(IIIIIII)V", line = 39)
    public static final void method2523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6159;
        int var7 = 8 / ((-78 - arg5) / 41);
        if (-arg1 + arg4 >= class263.field3294 && class314.field4052 >= arg1 + arg4 && ~class289.field3595 >= ~(-arg1 + arg2) && ~(arg1 + arg2) >= ~class159.field2063) {
            class440.method2342(arg0, true, arg4, arg3, arg2, arg6, arg1);
        } else {
            class483.method2625(-24142, arg2, arg4, arg1, arg3, arg0, arg6);
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V", line = 55)
    public final void method1041(int arg0) {
        ++field6135;
        if (~arg0 <= -129 && arg0 <= 1024) {
            if (this.field6244 != null) {
                this.field6244.method59(0);
            }
            this.field6262 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!en", name = "VA", descriptor = "(IFFFFF)V", line = 72)
    public final void method994(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field6055;
        boolean var7 = ~this.field6248 != ~arg0;
        if (var7 || this.field6290 != arg1 || this.field6304 != arg2) {
            this.field6304 = arg2;
            this.field6248 = arg0;
            this.field6290 = arg1;
            if (var7) {
                this.field6251 = (float) (this.field6248 & 16711680) / 1.671168E7F;
                this.field6275 = (float) (255 & this.field6248) / 255.0F;
                this.field6295 = (float) (65280 & this.field6248) / 65280.0F;
                this.method1681(0);
            }
            this.field6128.setSunColour(this.field6251, this.field6295, this.field6275, arg1, arg2);
            this.method1722(-25688);
        }
        if (this.field6313[0] != arg3 || this.field6313[1] != arg4 || this.field6313[2] != arg5) {
            this.field6313[0] = arg3;
            this.field6313[1] = arg4;
            this.field6313[2] = arg5;
            this.field6265[0] = -arg3;
            this.field6265[1] = -arg4;
            this.field6265[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field6332[1] = arg4 * var8;
            this.field6332[0] = arg3 * var8;
            this.field6332[2] = arg5 * var8;
            this.field6299[0] = -this.field6332[0];
            this.field6299[1] = -this.field6332[1];
            this.field6299[2] = -this.field6332[2];
            this.field6128.setSunDirection(this.field6332[0], this.field6332[1], this.field6332[2]);
            this.method1693(false);
            this.field6301 = (int) (arg3 * 256.0F / arg4);
            this.field6282 = (int) (arg5 * 256.0F / arg4);
        }
        this.method1724(5);
    }

    @OriginalMember(owner = "client!en", name = "m", descriptor = "()Z", line = 123)
    public final boolean method1026() {
        ++field6071;
        return false;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILki;)V", line = 132)
    public final void method2524(int arg0, class320 arg1) {
        ++field6102;
        this.field6336[this.field6286] = arg1;
        this.method2538(114);
        if (arg0 < 100) {
            this.field6324 = 9;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BB)V", line = 145)
    public final void method2525(byte arg0, byte arg1) {
        ++field6112;
        this.method2597((byte) 48, arg1 | arg1 << 8 | arg1 << 24 | arg1 << 16);
        if (arg0 <= 75) {
            this.field6326 = -58;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Le;)V", line = 156)
    public final void method1091(class385 arg0) {
        ++field6063;
        this.field6064 = ((class425) arg0).field5341;
        this.field6224 = this.field6064.method3414(32768, false);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIZZ)V", line = 167)
    public final void method2526(int arg0, int arg1, boolean arg2, boolean arg3) {
        ++field6124;
        if (arg0 != 0) {
            this.method2567(true, 71);
        }
        if (this.field6276 != arg1 || !this.field6273 == this.field6289) {
            class459 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field6289 ? 0 : 3;
            if (~arg1 > -1) {
                this.method2554((byte) -70);
            } else {
                var5 = this.field6244.method57(arg1, -23049);
                class13 var10 = super.field7898.method2486(arg1, (byte) 86);
                if (~var10.field239 == -1 && ~var10.field228 == -1) {
                    this.method2554((byte) -70);
                } else {
                    int var11 = !var10.field241 ? 128 : 64;
                    int var12 = var11 * 50;
                    class691 var13 = this.method2562(100);
                    var13.method3895((float) (this.field6279 % var12 * var10.field228) / (float) var12, (byte) 36, 0.0F, (float) (this.field6279 % var12 * var10.field239) / (float) var12);
                    this.method2524(106, class587.field8253);
                }
                var6 = var10.field226;
                if (!this.field6289) {
                    var7 = var10.field248;
                    var9 = var10.field234;
                    var8 = var10.field240;
                }
            }
            this.method2568(var8, var7, arg3, (byte) 127, arg2, var9);
            if (this.field6277 != null) {
                this.field6277.method341(var6, 114, var5);
            } else {
                this.method2596(var5, 0);
                this.method2595(var6, 0);
            }
            this.field6276 = arg1;
            this.field6273 = this.field6289;
        }
        this.field6309 &= -8;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V", line = 236)
    public final void method2527(byte arg0) {
        if (class167.field2193 != this.field6330) {
            class291 var2 = this.field6330;
            this.field6330 = class167.field2193;
            if (var2.method1638(3)) {
                this.method2593(false);
            }
            this.field6309 &= -32;
            this.field6317 = this.field6316;
        }
        if (arg0 == 84) {
            ++field6104;
        }
    }

    @OriginalMember(owner = "client!en", name = "FA", descriptor = "(ILua;II)V", line = 258)
    public final void method1012(int arg0, class600 arg1, int arg2, int arg3) {
        ++field6056;
        class405 var5 = (class405) arg1;
        class459 var6 = var5.field5072;
        this.method2540((byte) 16);
        this.method2596(var6, 0);
        this.method2553((byte) 28, 1);
        this.method2550(class538.field7226, true, class538.field7226);
        this.method2602(0, 1, class700.field9903);
        this.method2597((byte) 48, arg0);
        this.field6232.method3893((float) this.field6076, 18543, (float) this.field6103, 0.0F);
        this.method2588(-52);
        this.field6315[0].method3893(var6.method522(false, (float) this.field6076), 18543, var6.method518((float) this.field6103, (byte) -59), 1.0F);
        this.field6315[0].method3885(var6.method522(false, (float) (-arg2)), 0.0F, var6.method518((float) (-arg3), (byte) -59), (byte) -125);
        this.field6336[0] = class587.field8253;
        this.method2538(114);
        this.method2549(9);
        this.method2554((byte) -70);
        this.method2602(0, 1, class5.field119);
    }

    @OriginalMember(owner = "client!en", name = "m", descriptor = "(I)V", line = 284)
    private final void method2528(int arg0) {
        ++field6149;
        if (this.field6309 != arg0) {
            this.method2601(false);
            this.method2587(false, -117);
            this.method2535(false, 49);
            this.method2571((byte) 121, false);
            this.method2594(false, (byte) -25);
            this.method2526(arg0 + -1, -2, false, false);
            this.method2595(1, arg0 ^ 1);
            this.method2596(this.field6246, 0);
            this.field6309 = 1;
        }
    }

    @OriginalMember(owner = "client!en", name = "XA", descriptor = "(IIIII)V", line = 308)
    public final void method1084(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6081;
        this.method1065(arg0, arg1, arg0 - -arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZB)V", line = 316)
    public final void method2529(boolean arg0, byte arg1) {
        if (!this.field6257 == arg0) {
            this.field6257 = arg0;
            this.method1723(arg1 + 142);
        }
        if (arg1 != -99) {
            this.field6252 = 1.1504375F;
        }
        ++field6058;
    }

    @OriginalMember(owner = "client!en", name = "J", descriptor = "(IIIIII)V", line = 333)
    public final void method1090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2528(1);
        ++field6122;
        this.method2597((byte) 48, arg4);
        this.method2602(0, 1, class700.field9903);
        this.method2561(0, class700.field9903, -18836);
        this.method2553((byte) 28, arg5);
        this.field6232.method3893((float) arg2, 18543, (float) arg3, 1.0F);
        this.field6232.method903(arg0, arg1, 0);
        this.method2588(117);
        this.method1682(false, (byte) -110);
        this.method2549(9);
        this.method1682(true, (byte) -128);
        this.method2561(0, class5.field119, -18836);
        this.method2602(0, 1, class5.field119);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIIIIII)V", line = 353)
    public final void method1044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field6201;
    }

    @OriginalMember(owner = "client!en", name = "v", descriptor = "()[I", line = 362)
    public final int[] method1016() {
        ++field6099;
        return new int[] { this.field6323, this.field6266, this.field6240, this.field6297 };
    }

    @OriginalMember(owner = "client!en", name = "n", descriptor = "(I)V", line = 375)
    private final void method2530(int arg0) {
        ++field6091;
        this.field6250 = false;
        if (class375.field4728 == this.field6330) {
            this.method2547((byte) 107);
            this.method2586((byte) -18);
        }
        if (arg0 != 0) {
            this.field6315 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(Z)I", line = 394)
    public final int method2531(boolean arg0) {
        ++field6180;
        return !arg0 ? 67 : this.field6268;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I[FLec;ZII)Lls;", line = 410)
    public final class459 method2532(int arg0, float[] arg1, class146 arg2, boolean arg3, int arg4, int arg5) {
        ++field6150;
        return arg5 != 0 ? null : this.method1698(arg1, arg4, 0, 10, arg3, arg0, 0, arg2);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lsa;[Laga;Z)Lla;", line = 421)
    public final class413 method989(class595 arg0, class661[] arg1, boolean arg2) {
        ++field6143;
        return new class421(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILlt;I)V", line = 430)
    private final void method2533(int arg0, class273 arg1, int arg2) {
        ++field6157;
        this.method1695((byte) -16, this.field6348, arg2);
        this.method1709(true, this.field6356);
        this.method1715(arg1, 0, arg0, 28463);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 441)
    public final class272 method1008(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field6148;
        return new class260(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!en", name = "p", descriptor = "(I)V", line = 449)
    private final void method2534(int arg0) {
        ++field6154;
        this.field6283 = false;
        this.method2552(arg0);
        if (class657.field9285 == this.field6330) {
            this.method2586((byte) -18);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIII)V", line = 462)
    public final void method1021(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6087;
    }

    @OriginalMember(owner = "client!en", name = "CA", descriptor = "(IIII)V", line = 469)
    public final void method1000(int arg0, int arg1, int arg2, int arg3) {
        this.field6325 = arg3;
        this.field6245 = arg2;
        ++field6171;
        this.field6321 = arg1;
        this.field6289 = true;
        this.field6268 = arg0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZI)V", line = 481)
    public final void method2535(boolean arg0, int arg1) {
        if (arg1 < 44) {
            this.method1671((byte) 88);
        }
        if (!this.field6253 == arg0) {
            this.field6253 = arg0;
            this.method1707(-67);
            this.field6309 &= -8;
        }
        ++field6162;
    }

    @OriginalMember(owner = "client!en", name = "la", descriptor = "(IIII)V", line = 499)
    public final void method1048(int arg0, int arg1, int arg2, int arg3) {
        this.field6297 = arg3;
        ++field6107;
        this.field6266 = arg1;
        this.field6323 = arg0;
        this.field6240 = arg2;
        this.method2534(0);
        this.method2541((byte) -120);
        this.method2527((byte) 84);
        this.method2545(true);
    }

    @OriginalMember(owner = "client!en", name = "q", descriptor = "(I)V", line = 515)
    private final void method2536(int arg0) {
        ++field6172;
        this.field6348 = this.method1716(false, false);
        this.field6348.method324(arg0 + -89, 28, 140);
        for (int var2 = arg0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field6348.method325(true, 32726);
            if (var3 != null) {
                Stream var4 = this.method2573(var3, arg0 ^ 107);
                if (!Stream.method3420()) {
                    var4.method3427(0.0F);
                    var4.method3427(0.0F);
                    var4.method3427(0.0F);
                    var4.method3427(0.0F);
                    var4.method3427(0.0F);
                    var4.method3427(0.0F);
                    var4.method3427(0.0F);
                    var4.method3427(0.0F);
                    var4.method3427(1.0F);
                    var4.method3427(0.0F);
                    var4.method3427(0.0F);
                    var4.method3427(1.0F);
                    var4.method3427(0.0F);
                    var4.method3427(1.0F);
                    var4.method3427(1.0F);
                    var4.method3427(1.0F);
                    var4.method3427(0.0F);
                    var4.method3427(1.0F);
                    var4.method3427(1.0F);
                    var4.method3427(1.0F);
                    var4.method3427(1.0F);
                    var4.method3427(1.0F);
                    var4.method3427(0.0F);
                    var4.method3427(0.0F);
                    var4.method3427(1.0F);
                    var4.method3427(0.0F);
                    var4.method3427(1.0F);
                    var4.method3427(0.0F);
                    var4.method3427(0.0F);
                    var4.method3427(0.0F);
                    var4.method3427(0.0F);
                    var4.method3427(0.0F);
                    var4.method3427(0.0F);
                    var4.method3427(0.0F);
                    var4.method3427(0.0F);
                } else {
                    var4.method3418(0.0F);
                    var4.method3418(0.0F);
                    var4.method3418(0.0F);
                    var4.method3418(0.0F);
                    var4.method3418(0.0F);
                    var4.method3418(0.0F);
                    var4.method3418(0.0F);
                    var4.method3418(0.0F);
                    var4.method3418(1.0F);
                    var4.method3418(0.0F);
                    var4.method3418(0.0F);
                    var4.method3418(1.0F);
                    var4.method3418(0.0F);
                    var4.method3418(1.0F);
                    var4.method3418(1.0F);
                    var4.method3418(1.0F);
                    var4.method3418(0.0F);
                    var4.method3418(1.0F);
                    var4.method3418(1.0F);
                    var4.method3418(1.0F);
                    var4.method3418(1.0F);
                    var4.method3418(1.0F);
                    var4.method3418(0.0F);
                    var4.method3418(0.0F);
                    var4.method3418(1.0F);
                    var4.method3418(0.0F);
                    var4.method3418(1.0F);
                    var4.method3418(0.0F);
                    var4.method3418(0.0F);
                    var4.method3418(0.0F);
                    var4.method3418(0.0F);
                    var4.method3418(0.0F);
                    var4.method3418(0.0F);
                    var4.method3418(0.0F);
                    var4.method3418(0.0F);
                }
                var4.method3424();
                if (this.field6348.method322(arg0 + 21)) {
                    break;
                }
            }
        }
        this.field6356 = this.method1730(new class563[] { new class563(new class638[] { class638.field8940, class638.field8949, class638.field8949 }) }, true);
    }

    @OriginalMember(owner = "client!en", name = "l", descriptor = "()Z", line = 629)
    public final boolean method996() {
        ++field6129;
        return true;
    }

    @OriginalMember(owner = "client!en", name = "r", descriptor = "(I)V", line = 641)
    private final void method2537(int arg0) {
        ++field6062;
        int var2 = -118 % ((arg0 - -49) / 36);
        if (this.field6277 != null) {
            this.field6277.method348(26185);
        }
        this.method1670(-105);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)I", line = 656)
    public final int method1018(int arg0, int arg1) {
        ++field6137;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIII)V", line = 664)
    public final void method1065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6136;
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var9 = var7 * var10;
            var8 *= var10;
        }
        if (this.method2555(0.0F, (float) arg0, (float) arg1, -31334, 0.0F, (float) arg2 + var9, (float) arg3 + var8)) {
            this.method2528(1);
            this.method2597((byte) 48, arg4);
            this.method2602(0, 1, class700.field9903);
            this.method2561(0, class700.field9903, -18836);
            this.method2553((byte) 28, arg5);
            this.method2551((byte) 28);
            this.method1682(false, (byte) -89);
            this.method2563(32619);
            this.method1682(true, (byte) -118);
            this.method2561(0, class5.field119, -18836);
            this.method2602(0, 1, class5.field119);
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)Le;", line = 703)
    public final class385 method1015(int arg0) {
        ++field6169;
        class425 var2 = new class425(arg0);
        this.field6097.method239(var2, (byte) 93);
        return var2;
    }

    @OriginalMember(owner = "client!en", name = "t", descriptor = "(I)V", line = 716)
    private final void method2538(int arg0) {
        if (arg0 == 114) {
            ++field6106;
            this.method1697((byte) -109);
            if (this.field6277 != null) {
                this.field6277.method338((byte) -47);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(IIIII)V", line = 739)
    public final void method1022(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6214;
    }

    @OriginalMember(owner = "client!en", name = "w", descriptor = "(I)V", line = 746)
    public final void method2539(int arg0) {
        ++field6192;
        if (arg0 == 0) {
            this.method2527((byte) 84);
            this.method2586((byte) -18);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljt;)V", line = 759)
    public final void method980(class533 arg0) {
        ++field6203;
        this.field6242 = (class352) arg0;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(B)V", line = 768)
    public final void method2540(byte arg0) {
        if (this.field6309 != 2) {
            this.method2601(false);
            this.method2587(false, -102);
            this.method2535(false, 122);
            this.method2571((byte) 125, false);
            this.method2594(false, (byte) -25);
            this.method2526(0, -2, false, false);
            this.field6309 = 2;
        }
        ++field6199;
        if (arg0 <= 6) {
            this.field6240 = 43;
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "()I", line = 792)
    public final int method997() {
        ++field6185;
        return this.field6296 + -2;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIF)Lgga;", line = 800)
    public final class332 method1035(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field6074;
        return new class476(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!en", name = "JA", descriptor = "()V", line = 809)
    public final void method1017() {
        this.field6333 = this.field6076;
        this.field6335 = 0;
        ++field6161;
        this.field6302 = 0;
        this.field6306 = this.field6103;
        if (this.field6360) {
            this.field6360 = false;
            this.method1684(111);
        }
        this.method2545(true);
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(B)V", line = 828)
    private final void method2541(byte arg0) {
        this.field6334 = false;
        ++field6110;
        this.method2599((byte) -122);
        if (arg0 <= -35) {
            if (class574.field7999 == this.field6330) {
                this.method2586((byte) -18);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIILua;II)V", line = 851)
    public final void method1007(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class600 arg6, int arg7, int arg8) {
        ++field6158;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IBZ)Ljaclib/memory/heap/NativeHeapBuffer;", line = 859)
    public final NativeHeapBuffer method2542(int arg0, byte arg1, boolean arg2) {
        if (arg1 < 54) {
            this.method2588(38);
        }
        ++field6198;
        return this.field6064.method3414(arg0, arg2);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II[I[I)Lua;", line = 870)
    public final class600 method1080(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field6089;
        return class253.method1479(arg1, arg3, this, arg2, arg0, (byte) 37);
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(Z)I", line = 884)
    public final int method2543(boolean arg0) {
        if (!arg0) {
            this.method1086((Canvas) null);
        }
        ++field6131;
        return this.field6321;
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "(B)V", line = 895)
    private final void method2544(byte arg0) {
        ++field6146;
        if (arg0 != -124) {
            this.field6343 = null;
        }
        this.field6269[14] = this.field6310;
        this.field6269[10] = this.field6328;
        this.field6270 = (this.field6269[14] + (float) (-this.field6267)) / this.field6269[10];
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(Z)V", line = 911)
    private final void method2545(boolean arg0) {
        ++field6051;
        this.field6280 = (float) (-this.field6266 + this.field6335);
        this.field6271 = (float) (-this.field6323 + this.field6333);
        this.field6291 = (float) (-this.field6323 + this.field6302);
        this.field6252 = (float) (-this.field6266 + this.field6306);
        if (!arg0) {
            this.method2596((class466) null, -95);
        }
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "(Z)Lmga;", line = 929)
    public final class691 method2546(boolean arg0) {
        if (!arg0) {
            this.method1005(true);
        }
        ++field6060;
        return this.field6315[this.field6286];
    }

    @OriginalMember(owner = "client!en", name = "C", descriptor = "()Lq;", line = 940)
    public final class491 method1087() {
        ++field6221;
        return new class691();
    }

    @OriginalMember(owner = "client!en", name = "MA", descriptor = "(III[I)V", line = 949)
    public final void method991(int arg0, int arg1, int arg2, int[] arg3) {
        ++field6116;
        float var5 = this.field6234.method3890((float) arg1, 105, (float) arg2, (float) arg0);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field6266;
            var7 = this.field6323;
        } else {
            var7 = (int) ((float) this.field6240 * this.field6234.method3907(114, (float) arg1, (float) arg0, (float) arg2) / var5);
            var6 = (int) ((float) this.field6297 * this.field6234.method3888((float) arg0, (float) arg1, (float) arg2, 116) / var5);
        }
        arg3[0] = (int) ((float) var7 + -this.field6291);
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var6 + -this.field6280);
    }

    @OriginalMember(owner = "client!en", name = "g", descriptor = "(B)V", line = 974)
    private final void method2547(byte arg0) {
        if (arg0 != 107) {
            this.field6281 = false;
        }
        if (!this.field6250) {
            float[] var2 = this.field6239;
            this.field6250 = true;
            if (~this.field6076 != -1 && ~this.field6103 != -1) {
                var2[7] = 0.0F;
                var2[12] = -1.0F;
                var2[3] = 0.0F;
                var2[14] = 0.5F;
                var2[6] = 0.0F;
                var2[13] = 1.0F;
                var2[1] = 0.0F;
                var2[15] = 1.0F;
                var2[11] = 0.0F;
                var2[2] = 0.0F;
                var2[8] = 0.0F;
                var2[5] = -2.0F / (float) this.field6103;
                var2[0] = 2.0F / (float) this.field6076;
                var2[9] = 0.0F;
                var2[10] = 0.5F;
                var2[4] = 0.0F;
            } else {
                var2[9] = 0.0F;
                var2[11] = 0.0F;
                var2[0] = 1.0F;
                var2[12] = 0.0F;
                var2[4] = 0.0F;
                var2[3] = 0.0F;
                var2[1] = 0.0F;
                var2[13] = 0.0F;
                var2[14] = 0.0F;
                var2[10] = 1.0F;
                var2[15] = 1.0F;
                var2[2] = 0.0F;
                var2[8] = 0.0F;
                var2[7] = 0.0F;
                var2[5] = 1.0F;
                var2[6] = 0.0F;
            }
        }
        ++field6190;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(II)Lhh;", line = 1032)
    public final class666 method2548(int arg0, int arg1) {
        if (~this.field6351.method330((byte) 77) > ~(arg1 * 2)) {
            this.field6351.method619(27209, arg1);
        }
        int var3 = -63 / ((arg0 - -58) / 36);
        ++field6178;
        return this.field6351;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Leg;IIII)Lda;", line = 1047)
    public final class474 method1019(class47 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6191;
        return new class306(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Laga;Z)Lf;", line = 1055)
    public final class536 method1072(class661 arg0, boolean arg1) {
        ++field6141;
        class536 var10;
        if (~arg0.field9351 != -1 && arg0.field9353 != 0) {
            int[] var3 = new int[arg0.field9353 * arg0.field9351];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field9355 == null) {
                for (int var6 = 0; var6 < arg0.field9353; ++var6) {
                    for (int var7 = 0; var7 < arg0.field9351; ++var7) {
                        int var8 = arg0.field9358[arg0.field9352[var4++] & 255];
                        var3[var5++] = var8 != 0 ? class444.method2376(var8, -16777216) : 0;
                    }
                }
            } else {
                for (int var9 = 0; ~var9 > ~arg0.field9353; ++var9) {
                    for (int var11 = 0; ~var11 > ~arg0.field9351; ++var11) {
                        var3[var5++] = class444.method2376(arg0.field9358[class695.method3921(arg0.field9352[var4], 255)], arg0.field9355[var4] << 24);
                        ++var4;
                    }
                }
            }
            var10 = this.method1025(var3, 0, arg0.field9351, arg0.field9351, arg0.field9353);
        } else {
            var10 = this.method1025(new int[1], 0, 1, 1, 1);
        }
        var10.method161(arg0.field9354, arg0.field9356, arg0.field9350, arg0.field9357);
        return var10;
    }

    @OriginalMember(owner = "client!en", name = "ZA", descriptor = "(Z)V", line = 1122)
    public final void method1034(boolean arg0) {
        ++field6205;
        this.field6314 = arg0;
        this.method1691(1);
    }

    @OriginalMember(owner = "client!en", name = "n", descriptor = "()Z", line = 1131)
    public final boolean method975() {
        ++field6189;
        return true;
    }

    @OriginalMember(owner = "client!en", name = "T", descriptor = "()I", line = 1142)
    public final int method1036() {
        ++field6114;
        return this.field6361;
    }

    @OriginalMember(owner = "client!en", name = "y", descriptor = "(I)V", line = 1150)
    public final void method2549(int arg0) {
        if (arg0 != 9) {
            this.field6324 = -2;
        }
        this.method2533(2, class26.field394, 0);
        ++field6197;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lnw;ZLnw;)V", line = 1164)
    public final void method2550(class347 arg0, boolean arg1, class347 arg2) {
        ++field6073;
        if (!arg1) {
            this.field6338 = false;
        }
        boolean var4 = false;
        if (this.field6255[this.field6286] != arg0) {
            this.field6255[this.field6286] = arg0;
            var4 = true;
            this.method1727(-2);
        }
        if (this.field6264[this.field6286] != arg2) {
            this.field6264[this.field6286] = arg2;
            this.method1721(2);
            var4 = true;
        }
        if (var4) {
            this.field6309 &= -30;
        }
    }

    @OriginalMember(owner = "client!en", name = "YA", descriptor = "(IIII)V", line = 1199)
    public final void method984(int arg0, int arg1, int arg2, int arg3) {
        ++field6168;
        if (!this.field6289) {
            throw new RuntimeException("");
        } else {
            this.field6268 = arg0;
            this.field6321 = arg1;
            this.field6325 = arg3;
            this.field6245 = arg2;
            if (this.field6273) {
                this.field6259[3].method443(-16573);
                this.field6259[3].method348(26185);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 1224)
    public final void method1020(Canvas arg0) {
        ++field6130;
        if (this.field6059 == arg0) {
            throw new RuntimeException();
        } else if (this.field6101.containsKey(arg0)) {
            this.method1711((byte) 121, arg0, this.field6101.get(arg0));
            this.field6101.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!en", name = "i", descriptor = "(B)V", line = 1244)
    public final void method2551(byte arg0) {
        this.field6232.method918();
        ++field6182;
        if (arg0 > 1) {
            this.field6229 = true;
            this.method2591(14);
        }
    }

    @OriginalMember(owner = "client!en", name = "z", descriptor = "(I)V", line = 1257)
    private final void method2552(int arg0) {
        ++field6211;
        if (!this.field6283) {
            float[] var2 = this.field6292;
            float var3 = (float) this.field6318;
            float var4 = (float) this.field6267;
            float var5 = (float) (-this.field6266) * this.field6278 / (float) this.field6297;
            float var6 = (float) (-this.field6323) * this.field6278 / (float) this.field6240;
            float var7 = (float) (-this.field6323 + this.field6076) * this.field6278 / (float) this.field6240;
            float var8 = (float) (this.field6103 - this.field6266) * this.field6278 / (float) this.field6297;
            if (var6 != var7 && var5 != var8) {
                var2[7] = 0.0F;
                var2[3] = 0.0F;
                var2[10] = 1.0F / (-var4 + var3);
                var2[5] = 2.0F / (var8 - var5);
                var2[11] = 0.0F;
                var2[8] = 0.0F;
                var2[9] = 0.0F;
                var2[4] = 0.0F;
                var2[2] = 0.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[15] = 1.0F;
                var2[0] = 2.0F / (var7 - var6);
                var2[14] = var3 / (-var4 + var3);
                var2[12] = (var6 + var7) / (var6 - var7);
                var2[13] = (var5 + var8) / (var8 - var5);
            } else {
                var2[12] = 0.0F;
                var2[7] = 0.0F;
                var2[8] = 0.0F;
                var2[5] = 1.0F;
                var2[0] = 1.0F;
                var2[2] = 0.0F;
                var2[15] = 1.0F;
                var2[10] = 1.0F;
                var2[3] = 0.0F;
                var2[14] = 0.0F;
                var2[13] = 0.0F;
                var2[4] = 0.0F;
                var2[9] = 0.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[11] = 0.0F;
            }
            this.method2565((byte) 124);
            this.field6283 = true;
        }
        if (arg0 != 0) {
            this.method1002(48, 122, 49, -116, 27);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BI)V", line = 1328)
    public final void method2553(byte arg0, int arg1) {
        if (~this.field6258 != ~arg1) {
            class326 var3;
            boolean var4;
            boolean var5;
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 128) {
                        var3 = class394.field4955;
                        var4 = false;
                        var5 = false;
                    } else {
                        var3 = class473.field6004;
                        var4 = true;
                        var5 = true;
                    }
                } else {
                    var4 = true;
                    var3 = class451.field5774;
                    var5 = false;
                }
            } else {
                var4 = true;
                var3 = class385.field4847;
                var5 = true;
            }
            if (!var5 != !this.field6322) {
                this.field6322 = var5;
                this.method1717(-101);
            }
            if (!this.field6338 == var4) {
                this.field6338 = var4;
                this.method1692(false);
            }
            if (this.field6288 != var3) {
                this.field6288 = var3;
                this.method1685(true);
            }
            this.field6258 = arg1;
            this.field6309 &= -29;
        }
        if (arg0 == 28) {
            ++field6092;
        }
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "()Z", line = 1395)
    public final boolean method1047() {
        ++field6184;
        return this.field6259[3].method346(-16777216);
    }

    @OriginalMember(owner = "client!en", name = "j", descriptor = "(B)V", line = 1408)
    public final void method2554(byte arg0) {
        if (arg0 != -70) {
            this.field6235 = null;
        }
        if (this.field6336[this.field6286] != class366.field4651) {
            this.field6336[this.field6286] = class366.field4651;
            this.field6315[this.field6286].method918();
            this.method2538(114);
        }
        ++field6067;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(FFFIFFF)Z", line = 1425)
    private final boolean method2555(float arg0, float arg1, float arg2, int arg3, float arg4, float arg5, float arg6) {
        ++field6121;
        if (arg3 != -31334) {
            this.field6345 = null;
        }
        Buffer var8 = this.field6345.method325(true, arg3 ^ -1460);
        if (var8 == null) {
            return false;
        } else {
            Stream var9 = this.method2573(var8, arg3 ^ -31252);
            if (Stream.method3420()) {
                var9.method3418(arg1);
                var9.method3418(arg2);
                var9.method3418(arg0);
                var9.method3418(arg5);
                var9.method3418(arg6);
                var9.method3418(arg4);
            } else {
                var9.method3427(arg1);
                var9.method3427(arg2);
                var9.method3427(arg0);
                var9.method3427(arg5);
                var9.method3427(arg6);
                var9.method3427(arg4);
            }
            var9.method3424();
            return this.field6345.method322(13);
        }
    }

    @OriginalMember(owner = "client!en", name = "C", descriptor = "(I)[F", line = 1464)
    public final float[] method2556(int arg0) {
        ++field6134;
        if (arg0 != 0) {
            this.field6291 = -0.34390706F;
        }
        return this.field6316;
    }

    @OriginalMember(owner = "client!en", name = "k", descriptor = "(B)V", line = 1477)
    private final void method2557(byte arg0) {
        ++field6200;
        if (arg0 != 125) {
            this.method2588(-90);
        }
        this.field6345 = this.method1716(false, true);
        this.field6345.method324(-117, 12, 24);
        this.field6359 = this.method1730(new class563[] { new class563(class638.field8940) }, true);
    }

    @OriginalMember(owner = "client!en", name = "pa", descriptor = "(III)V", line = 1494)
    public final void method1075(int arg0, int arg1, int arg2) {
        if (~this.field6303 != ~arg0 || this.field6324 != arg1 || this.field6308 != arg2) {
            this.field6303 = arg0;
            this.field6324 = arg1;
            this.field6308 = arg2;
            this.method2537(-121);
            this.method1723(117);
        }
        ++field6094;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I[F)[F", line = 1510)
    public final float[] method2558(int arg0, float[] arg1) {
        arg1[4] = this.field6317[1];
        if (arg0 < 62) {
            return null;
        } else {
            ++field6126;
            arg1[0] = this.field6317[0];
            arg1[12] = this.field6317[3];
            arg1[8] = this.field6317[2];
            arg1[2] = this.field6317[8];
            arg1[13] = this.field6317[7];
            arg1[1] = this.field6317[4];
            arg1[9] = this.field6317[6];
            arg1[5] = this.field6317[5];
            arg1[6] = this.field6317[9];
            arg1[3] = this.field6317[12];
            arg1[7] = this.field6317[13];
            arg1[10] = this.field6317[10];
            arg1[14] = this.field6317[11];
            arg1[11] = this.field6317[14];
            arg1[15] = this.field6317[15];
            return arg1;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([I)V", line = 1539)
    public final void method1030(int[] arg0) {
        arg0[1] = this.field6103;
        arg0[0] = this.field6076;
        ++field6111;
    }

    @OriginalMember(owner = "client!en", name = "l", descriptor = "(B)Lmga;", line = 1548)
    public final class691 method2559(byte arg0) {
        ++field6075;
        return arg0 != 88 ? null : this.field6236;
    }

    @OriginalMember(owner = "client!en", name = "m", descriptor = "(B)V", line = 1559)
    public final void method2560(byte arg0) {
        ++field6217;
        if (arg0 > 126) {
            Hashtable var2 = new Hashtable();
            if (this.field6101 != null && !this.field6101.isEmpty()) {
                Enumeration var3 = this.field6101.keys();
                while (var3.hasMoreElements()) {
                    Canvas var4 = (Canvas) var3.nextElement();
                    var2.put(var4, this.method1706(var4, 19449));
                }
            }
            this.field6101 = var2;
            this.method2536(0);
            this.method2557((byte) 125);
            this.field6249.method1631((byte) 77, this);
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "()I", line = 1591)
    public final int method1057() {
        ++field6173;
        return this.field6231 + this.field6228 - -this.field6233;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lir;)V", line = 1602)
    public final void method993(class27 arg0) {
        ++field6213;
        this.field6249.method1632(-1, 0, this, arg0);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILgb;I)V", line = 1614)
    public final void method2561(int arg0, class162 arg1, int arg2) {
        ++field6151;
        if (arg2 == -18836) {
            this.method1674(false, arg0, arg1, false);
        }
    }

    @OriginalMember(owner = "client!en", name = "E", descriptor = "(I)Lmga;", line = 1627)
    public final class691 method2562(int arg0) {
        if (arg0 <= 82) {
            this.field6356 = null;
        }
        ++field6127;
        return this.field6315[this.field6286];
    }

    @OriginalMember(owner = "client!en", name = "O", descriptor = "(IIIIII)Z", line = 1638)
    public final boolean method982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6222;
        float var7 = this.field6234.method3890((float) arg1, 93, (float) arg2, (float) arg0);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field6234.method3890((float) arg4, -111, (float) arg5, (float) arg3);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field6318 > var7) || !(var8 < (float) this.field6318)) && (!(var7 > (float) this.field6267) || !((float) this.field6267 < var8))) {
            int var9 = (int) ((float) this.field6240 * this.field6234.method3907(92, (float) arg1, (float) arg0, (float) arg2) / var7);
            int var10 = (int) ((float) this.field6240 * this.field6234.method3907(56, (float) arg4, (float) arg3, (float) arg5) / var8);
            if ((float) var9 < this.field6291 && (float) var10 < this.field6291 || (float) var9 > this.field6271 && this.field6271 < (float) var10) {
                return false;
            } else {
                int var11 = (int) ((float) this.field6297 * this.field6234.method3888((float) arg0, (float) arg1, (float) arg2, 100) / var7);
                int var12 = (int) ((float) this.field6297 * this.field6234.method3888((float) arg3, (float) arg4, (float) arg5, 111) / var8);
                return (!((float) var11 < this.field6280) || !(this.field6280 > (float) var12)) && (!(this.field6252 < (float) var11) || !((float) var12 > this.field6252));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!en", name = "t", descriptor = "()Lq;", line = 1679)
    public final class491 method1033() {
        ++field6113;
        return this.field6234;
    }

    @OriginalMember(owner = "client!en", name = "va", descriptor = "(I)V", line = 1690)
    public final void method1029(int arg0) {
        ++field6209;
        this.field6241 = 0;
        while (arg0 > 1) {
            ++this.field6241;
            arg0 >>= 1;
        }
        this.field6311 = 1 << this.field6241;
    }

    @OriginalMember(owner = "client!en", name = "G", descriptor = "(I)V", line = 1705)
    private final void method2563(int arg0) {
        this.method1695((byte) -16, this.field6345, 0);
        ++field6065;
        if (arg0 == 32619) {
            this.method1709(true, this.field6359);
            this.method1715(class632.field8875, 0, 1, 28463);
        }
    }

    @OriginalMember(owner = "client!en", name = "o", descriptor = "(B)V", line = 1718)
    private final void method2564(byte arg0) {
        this.method1681(0);
        ++field6187;
        this.method1722(-25688);
        this.method1707(-30);
        this.method1683(1);
        this.method1693(false);
        if (arg0 > 0) {
            this.field6275 = -2.828104F;
        }
        this.method1724(5);
        this.method1689(1);
        this.method1686(0);
        this.method1691(1);
        this.method1723(82);
        this.method1670(-104);
        this.method1692(false);
        this.method1685(true);
        this.method1717(-107);
        for (int var2 = this.field6298 + -1; ~var2 <= -1; --var2) {
            this.method2589(0, var2);
            this.method1727(-2);
            this.method1721(2);
            this.method2554((byte) -70);
        }
        this.method1729(0);
        this.method1671((byte) 116);
        this.method1728(-86);
        this.method1731((byte) 86);
        this.method1679((byte) -128);
    }

    @OriginalMember(owner = "client!en", name = "da", descriptor = "(IIII)V", line = 1764)
    public final void method1083(int arg0, int arg1, int arg2, int arg3) {
        ++field6147;
        if (arg0 <= 0 && arg2 >= this.field6076 + -1 && ~arg1 >= -1 && ~(this.field6103 + -1) >= ~arg3) {
            this.method1017();
        } else {
            this.field6302 = arg0 >= 0 ? arg0 : 0;
            this.field6335 = ~arg1 <= -1 ? arg1 : 0;
            this.field6306 = ~arg3 < ~this.field6076 ? 0 : arg3;
            this.field6333 = ~this.field6076 > ~arg2 ? 0 : arg2;
            if (!this.field6360) {
                this.field6360 = true;
                this.method1684(110);
            }
            this.method1675(-1);
            this.method2545(true);
        }
    }

    @OriginalMember(owner = "client!en", name = "p", descriptor = "(B)V", line = 1791)
    private final void method2565(byte arg0) {
        if (arg0 == 124) {
            this.field6320 = (float) this.field6267;
            ++field6210;
        }
    }

    @OriginalMember(owner = "client!en", name = "BA", descriptor = "()I", line = 1804)
    public final int method974() {
        ++field6227;
        return this.field6318;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I[Lgga;)V", line = 1813)
    public final void method1024(int arg0, class332[] arg1) {
        ++field6206;
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field6337[var3] = arg1[var3];
        }
        this.field6312 = arg0;
        if (this.field6330.method1638(3)) {
            this.method1683(1);
        }
    }

    @OriginalMember(owner = "client!en", name = "IA", descriptor = "(IIIIII[BII)V", line = 1833)
    public final void method1074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field6139;
    }

    @OriginalMember(owner = "client!en", name = "H", descriptor = "(I)V", line = 1840)
    public final void method2566(int arg0) {
        if (arg0 != -20791) {
            this.field6254 = 32;
        }
        ++field6166;
        Enumeration var2 = this.field6101.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method1711((byte) 121, var3, this.field6101.get(var3));
        }
        this.field6348.method323(-21271);
        this.field6345.method323(-21271);
        this.field6347.method1752((byte) 34);
        this.field6358.method1752((byte) 34);
        this.field6355.method1752((byte) 34);
        this.field6341.method1752((byte) 34);
        this.field6357.method1752((byte) 34);
        this.field6249.method1635(true);
        this.field6351.method323(arg0 ^ 544);
    }

    @OriginalMember(owner = "client!en", name = "A", descriptor = "()V", line = 1871)
    public void method1069() {
        ++field6160;
        if (!this.field6284) {
            for (class329 var1 = this.field6097.method237(90); var1 != null; var1 = this.field6097.method245((byte) 62)) {
                ((class425) var1).method2254(-15184);
            }
            Enumeration var2 = this.field6101.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method1711((byte) 121, var3, this.field6101.get(var3));
            }
            class326.method1865(false, false, true);
            this.field6128.release();
            this.field6284 = true;
        }
    }

    @OriginalMember(owner = "client!en", name = "V", descriptor = "(IIII)V", line = 1905)
    public final void method1070(int arg0, int arg1, int arg2, int arg3) {
        ++field6204;
        boolean var5 = false;
        if (~arg0 < ~this.field6302) {
            var5 = true;
            this.field6302 = arg0;
        }
        if (~this.field6333 < ~arg2) {
            this.field6333 = arg2;
            var5 = true;
        }
        if (~this.field6335 > ~arg1) {
            var5 = true;
            this.field6335 = arg1;
        }
        if (~this.field6306 < ~arg3) {
            var5 = true;
            this.field6306 = arg3;
        }
        if (var5) {
            if (!this.field6360) {
                this.field6360 = true;
                this.method1684(80);
            }
            this.method1675(125);
            this.method2545(true);
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(II)I", line = 1956)
    public final int method998(int arg0, int arg1) {
        ++field6223;
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!en", name = "B", descriptor = "()Z", line = 1966)
    public final boolean method1076() {
        ++field6109;
        return true;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(ZI)V", line = 1975)
    public final void method2567(boolean arg0, int arg1) {
        if (arg1 == -27379) {
            ++field6144;
            if (!arg0 != !this.field6305) {
                this.field6305 = arg0;
                this.method1707(-122);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "g", descriptor = "()Z", line = 1991)
    public final boolean method1027() {
        ++field6186;
        return true;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIZBZI)V", line = 1999)
    private final void method2568(int arg0, int arg1, boolean arg2, byte arg3, boolean arg4, int arg5) {
        ++field6133;
        boolean var7 = arg2 & this.method1047();
        if (!var7 && (arg5 == 4 || arg5 == 8 || arg5 == 9)) {
            arg5 = 2;
            arg0 = arg5 != 4 ? 1 : 1 & arg1;
            arg1 = 0;
        }
        if (~arg5 != -1 && arg4) {
            arg5 |= Integer.MIN_VALUE;
        }
        if (this.field6287 == arg5) {
            if (this.field6287 != 0) {
                this.field6259[Integer.MAX_VALUE & this.field6287].method339(true, arg4);
                if (~this.field6254 != ~arg1 || this.field6329 != arg0) {
                    this.field6259[Integer.MAX_VALUE & this.field6287].method340(arg1, arg0, (byte) 65);
                    this.field6329 = arg0;
                    this.field6254 = arg1;
                }
            }
        } else {
            if (this.field6287 != 0) {
                this.field6259[Integer.MAX_VALUE & this.field6287].method343(-19092);
            }
            if (~arg5 == -1) {
                this.field6277 = null;
            } else {
                this.field6277 = this.field6259[arg5 & Integer.MAX_VALUE];
                this.field6277.method347(92, arg4);
                this.field6277.method339(true, arg4);
                this.field6277.method340(arg1, arg0, (byte) 65);
            }
            this.field6254 = arg1;
            this.field6287 = arg5;
            this.field6329 = arg0;
        }
        int var8 = 68 % ((arg3 - 76) / 33);
    }

    @OriginalMember(owner = "client!en", name = "J", descriptor = "(I)V", line = 2058)
    public final void method2569(int arg0) {
        if (this.field6309 != arg0) {
            this.method2575(119);
            this.method2587(true, -106);
            this.method2571((byte) 119, true);
            this.method2594(true, (byte) -25);
            this.method2553((byte) 28, 1);
            this.field6309 = 8;
        }
        ++field6176;
    }

    @OriginalMember(owner = "client!en", name = "oa", descriptor = "([I)V", line = 2078)
    public final void method1060(int[] arg0) {
        arg0[3] = this.field6306;
        ++field6193;
        arg0[2] = this.field6333;
        arg0[0] = this.field6302;
        arg0[1] = this.field6335;
    }

    @OriginalMember(owner = "client!en", name = "U", descriptor = "()I", line = 2089)
    public final int method1055() {
        ++field6100;
        return this.field6267;
    }

    @OriginalMember(owner = "client!en", name = "m", descriptor = "(IIIII)V", line = 2097)
    public final void method1002(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6115;
        this.method1065(arg0, arg1, arg0, arg1 - -arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!en", name = "AA", descriptor = "(III[I)V", line = 2106)
    public final void method1046(int arg0, int arg1, int arg2, int[] arg3) {
        ++field6048;
        float var5 = this.field6234.method3890((float) arg1, -93, (float) arg2, (float) arg0);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field6266;
            var7 = this.field6323;
        } else {
            var7 = (int) ((float) this.field6240 * this.field6234.method3907(63, (float) arg1, (float) arg0, (float) arg2) / var5);
            var6 = (int) ((float) this.field6297 * this.field6234.method3888((float) arg0, (float) arg1, (float) arg2, 62) / var5);
        }
        arg3[0] = (int) ((float) var7 - this.field6291);
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var6 - this.field6280);
    }

    @OriginalMember(owner = "client!en", name = "L", descriptor = "()V", line = 2131)
    public final void method1039() {
        this.field6289 = false;
        ++field6215;
    }

    @OriginalMember(owner = "client!en", name = "L", descriptor = "(I)I", line = 2140)
    public final int method2570(int arg0) {
        ++field6066;
        if (arg0 > -14) {
            this.field6250 = true;
        }
        return this.field6286;
    }

    @OriginalMember(owner = "client!en", name = "M", descriptor = "(I)V", line = 2151)
    public void method1683(int arg0) {
        this.field6263 = this.field6312;
        if (arg0 != 1) {
            this.method2583(true);
        }
        ++field6086;
        this.field6312 = 0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BZ)V", line = 2164)
    public final void method2571(byte arg0, boolean arg1) {
        if (arg0 < 118) {
            this.field6302 = 92;
        }
        ++field6208;
        if (arg1 == !this.field6274) {
            this.field6274 = arg1;
            this.method1686(0);
            this.field6309 &= -32;
        }
    }

    @OriginalMember(owner = "client!en", name = "N", descriptor = "(I)V", line = 2182)
    public final void method2572(int arg0) {
        if (arg0 != 128) {
            this.field6299 = null;
        }
        ++field6163;
        if (~this.field6309 != -17) {
            this.method2577((byte) -41);
            this.method2587(true, -107);
            this.method2571((byte) 125, true);
            this.method2594(true, (byte) -25);
            this.method2553((byte) 28, 1);
            this.field6309 = 16;
        }
    }

    @OriginalMember(owner = "client!en", name = "ra", descriptor = "(F)V", line = 2209)
    public final void method1054(float arg0) {
        ++field6220;
        if (this.field6331 != arg0) {
            this.field6331 = arg0;
            this.field6128.setAmbient(arg0);
            this.method1681(0);
            this.method1724(5);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljaclib/memory/Buffer;I)Ljaclib/memory/Stream;", line = 2225)
    public final Stream method2573(Buffer arg0, int arg1) {
        if (arg1 <= 94) {
            return null;
        } else {
            this.field6319.method3428(arg0);
            ++field6179;
            return this.field6319;
        }
    }

    @OriginalMember(owner = "client!en", name = "r", descriptor = "()Z", line = 2238)
    public final boolean method1049() {
        ++field6140;
        return false;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(ZB)V", line = 2248)
    public final void method2574(boolean arg0, byte arg1) {
        ++field6164;
        int var3 = -31 / ((-72 - arg1) / 53);
        if (!arg0 != !this.field6281) {
            this.field6281 = arg0;
            this.method1689(1);
        }
    }

    @OriginalMember(owner = "client!en", name = "O", descriptor = "(I)V", line = 2263)
    private final void method2575(int arg0) {
        if (class574.field7999 != this.field6330) {
            class291 var2 = this.field6330;
            this.field6330 = class574.field7999;
            if (!var2.method1638(3)) {
                this.method2593(false);
            }
            this.method2599((byte) -118);
            this.field6317 = this.field6269;
            this.method2586((byte) -18);
            this.field6309 &= -8;
        }
        ++field6090;
        if (arg0 < 15) {
            this.method1046(120, 18, 42, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIZ)Lf;", line = 2290)
    public final class536 method1053(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field6050;
        class22 var6 = new class22(this, arg2, arg3, arg4);
        var6.method156(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(IIIIII)Ljt;", line = 2301)
    public final class533 method990(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6084;
        return new class310(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IZI[IB)Lls;", line = 2316)
    public final class459 method2576(int arg0, boolean arg1, int arg2, int[] arg3, byte arg4) {
        ++field6212;
        if (arg4 < 64) {
            this.method1080(-26, -47, (int[]) null, (int[]) null);
        }
        return this.method1673(arg3, 3, arg1, 0, 0, arg0, arg2);
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "(I)V", line = 2328)
    public final void method1040(int arg0) {
        ++field6105;
    }

    @OriginalMember(owner = "client!en", name = "q", descriptor = "(B)V", line = 2335)
    private final void method2577(byte arg0) {
        ++field6117;
        if (arg0 >= -36) {
            this.field6357 = null;
        }
        if (class657.field9285 != this.field6330) {
            class291 var2 = this.field6330;
            this.field6330 = class657.field9285;
            if (!var2.method1638(3)) {
                this.method2593(false);
            }
            this.method2552(0);
            this.field6317 = this.field6292;
            this.method2586((byte) -18);
            this.field6309 &= -8;
        }
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 2363)
    public final void method1073(Canvas arg0) {
        ++field6226;
        if (this.field6059 == arg0) {
            throw new RuntimeException();
        } else if (!this.field6101.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method1706(arg0, 19449);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field6101.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "h", descriptor = "(Z)V", line = 2401)
    private final void method2578(boolean arg0) {
        if (this.field6085 == null) {
            this.field6152 = this.field6195 = 1;
        } else {
            Dimension var2 = this.field6085.getSize();
            this.field6195 = var2.height;
            this.field6152 = var2.width;
        }
        ++field6132;
        this.field6103 = this.field6195;
        this.field6076 = this.field6152;
        this.method2530(0);
        this.method2541((byte) -103);
        this.method2534(0);
        if (!arg0) {
            this.field6305 = false;
        }
        this.method1671((byte) 116);
        this.method2545(arg0);
        this.method2527((byte) 84);
        this.method1017();
    }

    @OriginalMember(owner = "client!en", name = "Q", descriptor = "(I)Lmga;", line = 2436)
    public final class691 method2579(int arg0) {
        ++field6175;
        if (arg0 != 3) {
            this.method2531(false);
        }
        if (!this.field6339) {
            this.field6238.method3898(this.field6236, this.field6232);
            this.field6339 = true;
        }
        return this.field6238;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)V", line = 2461)
    public final void method1005(boolean arg0) {
        ++field6078;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(FB)V", line = 2470)
    public final void method2580(float arg0, byte arg1) {
        if (this.field6278 != arg0) {
            this.field6278 = arg0;
            this.method2534(0);
        }
        ++field6057;
        if (arg1 >= -47) {
            this.field6325 = 116;
        }
    }

    @OriginalMember(owner = "client!en", name = "R", descriptor = "(I)Loq;", line = 2486)
    public final class660 method2581(int arg0) {
        ++field6165;
        if (arg0 != 2) {
            return null;
        } else {
            return this.field6242 != null ? this.field6242.method1794(false) : null;
        }
    }

    @OriginalMember(owner = "client!en", name = "p", descriptor = "()Lq;", line = 2499)
    public final class491 method995() {
        ++field6170;
        return this.field6346;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(I)V", line = 2511)
    public final void method973(int arg0) {
        ++field6156;
    }

    @OriginalMember(owner = "client!en", name = "S", descriptor = "(I)I", line = 2518)
    public final int method2582(int arg0) {
        ++field6079;
        if (arg0 != -30561) {
            this.method2566(-110);
        }
        return this.field6325;
    }

    @OriginalMember(owner = "client!en", name = "j", descriptor = "(Z)V", line = 2530)
    public final void method2583(boolean arg0) {
        if (this.field6309 != 4) {
            this.method2601(!arg0);
            this.method2587(false, -105);
            this.method2535(false, 127);
            this.method2571((byte) 124, false);
            this.method2594(false, (byte) -25);
            this.method2526(0, -2, false, false);
            this.method2553((byte) 28, 1);
            this.method2595(0, 0);
            this.field6309 = 4;
        }
        ++field6153;
        if (!arg0) {
            this.method1069();
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 2555)
    public void method1051(int arg0) {
        ++field6093;
        if (this.field6244 != null) {
            this.field6244.method56(98);
        }
        this.field6279 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILmga;)V", line = 2567)
    public final void method2584(int arg0, class691 arg1) {
        this.field6232.method919(arg1);
        if (arg0 != -16926) {
            this.method2578(false);
        }
        ++field6082;
        this.field6229 = false;
        this.method2591(14);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 2581)
    public final void method1068(Canvas arg0) {
        ++field6123;
        Object var2 = null;
        if (arg0 != null && this.field6059 != arg0) {
            if (this.field6101.containsKey(arg0)) {
                var2 = this.field6101.get(arg0);
            }
        } else {
            var2 = this.field6072;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method1690(7, var2, arg0);
            if (this.field6085 == arg0) {
                this.method2578(true);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "s", descriptor = "(B)V", line = 2610)
    public final void method2585(byte arg0) {
        this.field6261 = new class466[this.field6298];
        this.field6255 = new class347[this.field6298];
        this.field6315 = new class691[this.field6298];
        ++field6088;
        this.field6336 = new class320[this.field6298];
        if (arg0 >= -41) {
            this.field6260 = 111;
        }
        this.field6264 = new class347[this.field6298];
        for (int var2 = 0; var2 < this.field6298; ++var2) {
            this.field6264[var2] = class112.field1466;
            this.field6255[var2] = class112.field1466;
            this.field6336[var2] = class366.field4651;
            this.field6315[var2] = new class691();
        }
        this.field6337 = new class332[this.field6296 + -2];
        this.field6246 = this.method1713(1, class590.field8288, 1, 1, class117.field1509);
        this.method1091(new class425(262144));
        this.field6342 = this.method1730(new class563[] { new class563(new class638[] { class638.field8940, class638.field8949 }) }, true);
        this.field6354 = this.method1730(new class563[] { new class563(new class638[] { class638.field8940, class638.field8947 }) }, true);
        this.field6352 = this.method1730(new class563[] { new class563(class638.field8940), new class563(class638.field8947), new class563(class638.field8949), new class563(class638.field8946) }, true);
        this.field6340 = this.method1730(new class563[] { new class563(class638.field8940), new class563(class638.field8947), new class563(class638.field8949) }, true);
        this.field6350 = new class306(this, 0, 0, false, false);
        this.field6347 = new class306(this, 0, 0, true, true);
        this.field6349 = new class306(this, 0, 0, false, false);
        this.field6358 = new class306(this, 0, 0, true, true);
        this.field6353 = new class306(this, 0, 0, false, false);
        this.field6355 = new class306(this, 0, 0, true, true);
        this.field6344 = new class306(this, 0, 0, false, false);
        this.field6341 = new class306(this, 0, 0, true, true);
        this.field6343 = new class306(this, 0, 0, false, false);
        this.field6357 = new class306(this, 0, 0, true, true);
        this.field6249 = new class290(this);
        this.field6351 = this.method1680(true, 16);
        this.method2560((byte) 127);
        this.field6174 = new class190(this);
        this.field6259[1] = this.method1725((byte) -128, 1);
        this.field6259[2] = this.method1725((byte) -127, 2);
        this.field6259[4] = this.method1725((byte) -128, 4);
        this.field6259[5] = this.method1725((byte) -128, 5);
        this.field6259[6] = this.method1725((byte) -128, 6);
        this.field6259[7] = this.method1725((byte) -127, 7);
        this.field6259[3] = this.method1725((byte) -127, 3);
        this.field6259[8] = this.method1725((byte) -128, 8);
        this.field6259[9] = this.method1725((byte) -128, 9);
        if (!this.field6259[2].method346(-16777216)) {
            this.field6259[2] = this.method1725((byte) -127, 0);
        }
        if (!this.field6259[4].method346(-16777216)) {
            this.field6259[4] = this.field6259[2];
        }
        if (!this.field6259[8].method346(-16777216)) {
            this.field6259[8] = this.field6259[4];
        }
        if (!this.field6259[9].method346(-16777216)) {
            this.field6259[9] = this.field6259[8];
        }
        this.method1701((byte) 20);
        this.method1017();
        this.method1052();
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIZ)Lf;", line = 2685)
    public final class536 method1071(int arg0, int arg1, boolean arg2) {
        ++field6068;
        return new class22(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lq;)V", line = 2696)
    public final void method1058(class491 arg0) {
        ++field6118;
        this.field6234 = (class691) arg0;
        this.field6236.method919(this.field6234);
        this.field6236.method3902(0);
        this.field6237.method3900(2, this.field6236);
        this.field6235.method3900(2, this.field6234);
        if (this.field6330.method1638(3)) {
            this.method2593(false);
        }
    }

    @OriginalMember(owner = "client!en", name = "t", descriptor = "(B)V", line = 2713)
    private final void method2586(byte arg0) {
        ++field6053;
        this.method1728(108);
        if (this.field6277 != null) {
            this.field6277.method345(17);
        }
        if (arg0 != -18) {
            this.method2590(-58);
        }
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(ZI)V", line = 2731)
    public final void method2587(boolean arg0, int arg1) {
        if (arg1 < -99) {
            if (!arg0 != !this.field6256) {
                this.field6256 = arg0;
                this.method1723(119);
                this.field6309 &= -32;
            }
            ++field6125;
        }
    }

    @OriginalMember(owner = "client!en", name = "T", descriptor = "(I)V", line = 2748)
    public final void method2588(int arg0) {
        int var2 = 14 / ((51 - arg0) / 57);
        this.field6229 = false;
        ++field6188;
        this.method2591(14);
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "()Z", line = 2759)
    public final boolean method1067() {
        ++field6120;
        return true;
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(II)V", line = 2779)
    public final void method2589(int arg0, int arg1) {
        if (arg0 == 0) {
            if (this.field6286 != arg1) {
                this.field6286 = arg1;
                this.method1718((byte) -108);
            }
            ++field6207;
        }
    }

    @OriginalMember(owner = "client!en", name = "U", descriptor = "(I)I", line = 2805)
    public final int method2590(int arg0) {
        if (arg0 != 9) {
            this.method1055();
        }
        ++field6225;
        return this.field6245;
    }

    @OriginalMember(owner = "client!en", name = "V", descriptor = "(I)V", line = 2817)
    private final void method2591(int arg0) {
        ++field6080;
        if (arg0 != 14) {
            this.method1727(-90);
        }
        if (class375.field4728 == this.field6330) {
            float var2 = this.method1688((byte) -49);
            this.field6232.method3885(var2, 0.0F, var2, (byte) 103);
        }
        this.field6339 = false;
        this.method1731((byte) 86);
        if (this.field6277 != null) {
            this.field6277.method344((byte) -127);
        }
    }

    @OriginalMember(owner = "client!en", name = "g", descriptor = "(I)V", line = 2845)
    public final void method1063(int arg0) {
        ++field6230;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(BI)Lcl;", line = 2855)
    public class74 method1725(byte arg0, int arg1) {
        ++field6052;
        if (arg0 >= -126) {
            this.method1706((Canvas) null, 70);
        }
        if (~arg1 != -7) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    return ~arg1 == -8 ? new class184(this) : new class557(this);
                } else {
                    return new class534(this, this.field6174);
                }
            } else {
                return new class228(this);
            }
        } else {
            return new class327(this);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2907)
    public final void method1086(Canvas arg0) {
        this.field6072 = null;
        ++field6177;
        this.field6085 = null;
        if (arg0 != null && this.field6059 != arg0) {
            if (this.field6101.containsKey(arg0)) {
                this.field6072 = this.field6101.get(arg0);
                this.field6085 = arg0;
            }
        } else {
            this.field6072 = this.field6049;
            this.field6085 = this.field6059;
        }
        if (this.field6085 != null && this.field6072 != null) {
            this.method1672(this.field6072, (byte) -111, this.field6085);
            this.method2578(true);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!en", name = "o", descriptor = "()Z", line = 2937)
    public final boolean method1011() {
        ++field6054;
        return true;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(IIIIII)V", line = 2947)
    public final void method978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6119;
        float var7 = this.method1688((byte) -96);
        this.method2528(1);
        this.method2597((byte) 48, arg4);
        this.method2602(0, 1, class700.field9903);
        this.method2561(0, class700.field9903, -18836);
        this.method2553((byte) 28, arg5);
        this.field6232.method3893((float) (arg2 + -1), 18543, (float) (arg3 + -1), 1.0F);
        this.field6232.method3885((float) arg0 + -var7, 0.0F, (float) arg1 + -var7, (byte) 57);
        this.method2588(123);
        this.method1682(false, (byte) -107);
        this.method2533(4, class584.field8167, 0);
        this.method1682(true, (byte) -71);
        this.method2561(0, class5.field119, -18836);
        this.method2602(0, 1, class5.field119);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([BIILec;ZB)Lls;", line = 2973)
    public final class459 method2592(byte[] arg0, int arg1, int arg2, class146 arg3, boolean arg4, byte arg5) {
        if (arg5 != 73) {
            this.method1049();
        }
        ++field6047;
        return this.method1714(arg0, arg3, arg2, 0, arg4, false, 0, arg1);
    }

    @OriginalMember(owner = "client!en", name = "l", descriptor = "(Z)V", line = 2984)
    private final void method2593(boolean arg0) {
        ++field6061;
        this.field6339 = arg0;
        if (this.field6277 != null) {
            this.field6277.method342(arg0);
        }
        this.method1679((byte) -125);
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(ZB)V", line = 2997)
    public final void method2594(boolean arg0, byte arg1) {
        if (this.field6293 != arg0) {
            this.field6293 = arg0;
            this.method1691(1);
            this.field6309 &= -32;
        }
        if (arg1 != -25) {
            this.field6285 = 41;
        }
        ++field6219;
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "(II)V", line = 3017)
    public final void method2595(int arg0, int arg1) {
        ++field6096;
        if (arg1 != 0) {
            this.field6285 = -80;
        }
        if (~arg0 != -2) {
            if (arg0 == 0) {
                this.method2550(class112.field1466, true, class112.field1466);
                return;
            }
            if (~arg0 == -3) {
                this.method2550(class542.field7243, true, class538.field7226);
                return;
            }
            if (arg0 == 3) {
                this.method2550(class88.field1235, true, class112.field1466);
                return;
            }
            if (arg0 == 4) {
                this.method2550(class224.field2806, true, class224.field2806);
                return;
            }
        } else {
            this.method2550(class538.field7226, true, class538.field7226);
        }
    }

    @OriginalMember(owner = "client!en", name = "u", descriptor = "(B)V", line = 3047)
    public void method1701(byte arg0) {
        ++field6196;
        if (arg0 != 20) {
            this.method1068((Canvas) null);
        }
        this.method2564((byte) -24);
    }

    @OriginalMember(owner = "client!en", name = "x", descriptor = "()Z", line = 3061)
    public final boolean method1023() {
        ++field6167;
        return true;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lhfa;I)V", line = 3076)
    public final void method2596(class466 arg0, int arg1) {
        if (this.field6261[this.field6286] != arg0) {
            this.field6261[this.field6286] = arg0;
            if (arg0 == null) {
                this.method1726(0);
            } else {
                arg0.method527(9258);
            }
            this.field6309 &= -2;
        }
        ++field6070;
        if (arg1 != 0) {
            this.field6336 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(BI)V", line = 3099)
    public final void method2597(byte arg0, int arg1) {
        if (~this.field6300 != ~arg1) {
            this.field6300 = arg1;
            this.method1729(0);
        }
        if (arg0 != 48) {
            this.field6323 = -53;
        }
        ++field6083;
    }

    @OriginalMember(owner = "client!en", name = "GA", descriptor = "(II)V", line = 3115)
    public final void method1062(int arg0, int arg1) {
        ++field6145;
        if (~this.field6318 != ~arg0 || ~this.field6267 != ~arg1) {
            this.field6318 = arg0;
            this.field6267 = arg1;
            this.method2541((byte) -117);
            this.method2534(0);
            this.method2537(-102);
        }
    }

    @OriginalMember(owner = "client!en", name = "Y", descriptor = "(I)Lmga;", line = 3135)
    public final class691 method2598(int arg0) {
        if (arg0 != 12083) {
            this.method1062(-2, -12);
        }
        ++field6098;
        return this.field6232;
    }

    @OriginalMember(owner = "client!en", name = "h", descriptor = "()Z", line = 3146)
    public final boolean method1085() {
        ++field6142;
        return false;
    }

    @OriginalMember(owner = "client!en", name = "w", descriptor = "(B)V", line = 3154)
    private final void method2599(byte arg0) {
        if (arg0 <= -117) {
            if (!this.field6334) {
                float[] var2 = this.field6269;
                float var3 = (float) (-this.field6323 * this.field6318) / (float) this.field6240;
                float var4 = (float) ((-this.field6323 + this.field6076) * this.field6318) / (float) this.field6240;
                float var5 = (float) (this.field6318 * this.field6266) / (float) this.field6297;
                float var6 = (float) ((-this.field6103 + this.field6266) * this.field6318) / (float) this.field6297;
                if (var3 != var4 && var5 != var6) {
                    float var7 = (float) this.field6318 * 2.0F;
                    var2[5] = var7 / (var5 - var6);
                    var2[12] = 0.0F;
                    var2[2] = 0.0F;
                    var2[14] = this.field6310 = (float) (this.field6318 * this.field6267) / (float) (this.field6318 - this.field6267);
                    var2[4] = 0.0F;
                    var2[13] = 0.0F;
                    var2[6] = 0.0F;
                    var2[15] = 0.0F;
                    var2[11] = -1.0F;
                    var2[10] = this.field6328 = (float) this.field6267 / (float) (-this.field6267 + this.field6318);
                    var2[9] = (var5 + var6) / (-var6 + var5);
                    var2[3] = 0.0F;
                    var2[0] = var7 / (-var3 + var4);
                    var2[8] = (var3 + var4) / (var4 - var3);
                    var2[1] = 0.0F;
                    var2[7] = 0.0F;
                } else {
                    var2[4] = 0.0F;
                    var2[13] = 0.0F;
                    var2[1] = 0.0F;
                    var2[7] = 0.0F;
                    var2[15] = 1.0F;
                    var2[6] = 0.0F;
                    var2[9] = 0.0F;
                    var2[14] = 0.0F;
                    var2[11] = 0.0F;
                    var2[3] = 0.0F;
                    var2[12] = 0.0F;
                    var2[2] = 0.0F;
                    var2[10] = 1.0F;
                    var2[5] = 1.0F;
                    var2[8] = 0.0F;
                    var2[0] = 1.0F;
                }
                this.method2544((byte) -124);
                this.field6334 = true;
            }
            ++field6218;
        }
    }

    @OriginalMember(owner = "client!en", name = "Z", descriptor = "(I)Lmga;", line = 3221)
    public final class691 method2600(int arg0) {
        ++field6194;
        if (arg0 != -9813) {
            this.method1716(false, false);
        }
        return this.field6237;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lir;I)V", line = 3235)
    public final void method999(class27 arg0, int arg1) {
        ++field6108;
        this.field6249.method1632(arg1, 0, this, arg0);
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lfa;Lpl;II)V", line = 3248)
    public class478(Canvas arg0, Object arg1, class526 arg2, class612 arg3, int arg4, int arg5) {
        super(arg2);
        this.field6072 = this.field6049 = arg1;
        this.field6202 = arg3;
        this.field6260 = arg4;
        this.field6085 = this.field6059 = arg0;
        Dimension var7 = arg0.getSize();
        this.field6326 = arg5;
        this.field6076 = this.field6152 = var7.width;
        this.field6103 = this.field6195 = var7.height;
        class48.method305(false, true, (byte) 88);
        if (super.field7898 == null) {
            this.field6128 = new NativeInterface(0, this.field6326);
            this.field6244 = null;
        } else {
            this.field6244 = new class7(this, super.field7898);
            this.field6128 = new NativeInterface(super.field7898.method2485(-16330), this.field6326);
            for (int var8 = 0; super.field7898.method2485(-16330) > var8; ++var8) {
                class13 var9 = super.field7898.method2486(var8, (byte) 86);
                if (var9 != null) {
                    this.field6128.initTextureMetrics(var8, var9.field242, var9.field231);
                }
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "m", descriptor = "(Z)V", line = 3293)
    private final void method2601(boolean arg0) {
        if (arg0) {
            this.field6244 = null;
        }
        ++field6216;
        if (class375.field4728 != this.field6330) {
            class291 var2 = this.field6330;
            this.field6330 = class375.field4728;
            if (var2.method1638(3)) {
                this.method2593(false);
            }
            this.method2547((byte) 107);
            this.field6317 = this.field6239;
            this.method2586((byte) -18);
            this.field6309 &= -25;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IILgb;)V", line = 3318)
    public final void method2602(int arg0, int arg1, class162 arg2) {
        this.method1676(false, arg2, arg0, false, (byte) -109);
        if (arg1 == 1) {
            ++field6155;
        }
    }

    @OriginalMember(owner = "client!en", name = "w", descriptor = "()V", line = 3345)
    public final void method1003() {
        ++field6095;
        if (this.field6244 != null) {
            this.field6244.method59(0);
        }
    }

    @OriginalMember(owner = "client!en", name = "j", descriptor = "(I)V")
    public abstract void method1721(int arg0);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([FIIIZIILec;)Lls;")
    public abstract class459 method1698(float[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, class146 arg7);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZILgb;Z)V")
    public abstract void method1674(boolean arg0, int arg1, class162 arg2, boolean arg3);

    @OriginalMember(owner = "client!en", name = "k", descriptor = "(I)V")
    public abstract void method1691(int arg0);

    @OriginalMember(owner = "client!en", name = "l", descriptor = "(I)V")
    public abstract void method1729(int arg0);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZLmq;)V")
    public abstract void method1709(boolean arg0, class81 arg1);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZZI[[I)Loq;")
    public abstract class660 method1696(boolean arg0, boolean arg1, int arg2, int[][] arg3);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILlt;IIIILhh;)V")
    public abstract void method1700(int arg0, class273 arg1, int arg2, int arg3, int arg4, int arg5, class666 arg6);

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V")
    public abstract void method1731(byte arg0);

    @OriginalMember(owner = "client!en", name = "o", descriptor = "(I)V")
    public abstract void method1675(int arg0);

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(B)V")
    public abstract void method1718(byte arg0);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I[BIILec;I)Lfl;")
    public abstract class187 method1732(int arg0, byte[] arg1, int arg2, int arg3, class146 arg4, int arg5);

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(ZI)Lhh;")
    public abstract class666 method1680(boolean arg0, int arg1);

    @OriginalMember(owner = "client!en", name = "s", descriptor = "(I)V")
    public abstract void method1681(int arg0);

    @OriginalMember(owner = "client!en", name = "u", descriptor = "(I)V")
    public abstract void method1689(int arg0);

    @OriginalMember(owner = "client!en", name = "v", descriptor = "(I)V")
    public abstract void method1724(int arg0);

    @OriginalMember(owner = "client!en", name = "x", descriptor = "(I)V")
    public abstract void method1727(int arg0);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([IIZIIII)Lls;")
    public abstract class459 method1673(int[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILbt;Lec;)Z")
    public abstract boolean method1687(int arg0, class117 arg1, class146 arg2);

    @OriginalMember(owner = "client!en", name = "h", descriptor = "(B)V")
    public abstract void method1671(byte arg0);

    @OriginalMember(owner = "client!en", name = "A", descriptor = "(I)V")
    public abstract void method1723(int arg0);

    @OriginalMember(owner = "client!en", name = "B", descriptor = "(I)V")
    public abstract void method1670(int arg0);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method1711(byte arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lec;Lbt;I)Z")
    public abstract boolean method1712(class146 arg0, class117 arg1, int arg2);

    @OriginalMember(owner = "client!en", name = "n", descriptor = "(B)V")
    public abstract void method1697(byte arg0);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([BLec;IIZZII)Lls;")
    public abstract class459 method1714(byte[] arg0, class146 arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method1690(int arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!en", name = "D", descriptor = "(I)V")
    public abstract void method1722(int arg0);

    @OriginalMember(owner = "client!en", name = "F", descriptor = "(I)V")
    public abstract void method1684(int arg0);

    @OriginalMember(owner = "client!en", name = "g", descriptor = "(Z)V")
    public abstract void method1692(boolean arg0);

    @OriginalMember(owner = "client!en", name = "I", descriptor = "(I)V")
    public abstract void method1686(int arg0);

    @OriginalMember(owner = "client!en", name = "K", descriptor = "(I)V")
    public abstract void method1726(int arg0);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZZ)Lnba;")
    public abstract class401 method1716(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!en", name = "P", descriptor = "(I)V")
    public abstract void method1728(int arg0);

    @OriginalMember(owner = "client!en", name = "i", descriptor = "(Z)V")
    public abstract void method1693(boolean arg0);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILec;IILbt;)Lls;")
    public abstract class459 method1713(int arg0, class146 arg1, int arg2, int arg3, class117 arg4);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Llt;III)V")
    public abstract void method1715(class273 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!en", name = "r", descriptor = "(B)F")
    public abstract float method1688(byte arg0);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([Leda;Z)Lmq;")
    public abstract class81 method1730(class563[] arg0, boolean arg1);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lrca;I)V")
    public abstract void method1677(class34 arg0, int arg1);

    @OriginalMember(owner = "client!en", name = "k", descriptor = "(Z)V")
    public abstract void method1685(boolean arg0);

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(II)V")
    public abstract void method1705(int arg0, int arg1);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
    public abstract void method1672(Object arg0, byte arg1, Canvas arg2);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public abstract Object method1706(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BLnba;I)V")
    public abstract void method1695(byte arg0, class401 arg1, int arg2);

    @OriginalMember(owner = "client!en", name = "W", descriptor = "(I)V")
    public abstract void method1707(int arg0);

    @OriginalMember(owner = "client!en", name = "X", descriptor = "(I)V")
    public abstract void method1717(int arg0);

    @OriginalMember(owner = "client!en", name = "v", descriptor = "(B)V")
    public abstract void method1679(byte arg0);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZLgb;IZB)V")
    public abstract void method1676(boolean arg0, class162 arg1, int arg2, boolean arg3, byte arg4);

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(ZB)V")
    public abstract void method1682(boolean arg0, byte arg1);
}
