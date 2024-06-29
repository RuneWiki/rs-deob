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

@OriginalClass("client!wga")
public abstract class class745 extends class59 {

    @OriginalMember(owner = "client!wga", name = "nb", descriptor = "Luh;")
    private class168 field10041 = new class168();

    @OriginalMember(owner = "client!wga", name = "Zd", descriptor = "Z")
    public boolean field10183 = true;

    @OriginalMember(owner = "client!wga", name = "ee", descriptor = "Lhaa;")
    public class81 field10188 = new class81();

    @OriginalMember(owner = "client!wga", name = "ke", descriptor = "Lhaa;")
    public class81 field10194 = new class81();

    @OriginalMember(owner = "client!wga", name = "me", descriptor = "Lhaa;")
    public class81 field10196 = new class81();

    @OriginalMember(owner = "client!wga", name = "ne", descriptor = "Lhaa;")
    public class81 field10197 = new class81();

    @OriginalMember(owner = "client!wga", name = "oe", descriptor = "Lhaa;")
    private class81 field10198 = new class81();

    @OriginalMember(owner = "client!wga", name = "pe", descriptor = "Lhaa;")
    private class81 field10199 = new class81();

    @OriginalMember(owner = "client!wga", name = "xe", descriptor = "F")
    public float field10207 = 1.0F;

    @OriginalMember(owner = "client!wga", name = "De", descriptor = "I")
    private int field10213 = -1;

    @OriginalMember(owner = "client!wga", name = "te", descriptor = "F")
    public float field10203 = 3584.0F;

    @OriginalMember(owner = "client!wga", name = "ze", descriptor = "I")
    public int field10209 = 50;

    @OriginalMember(owner = "client!wga", name = "ye", descriptor = "I")
    public int field10208 = 0;

    @OriginalMember(owner = "client!wga", name = "re", descriptor = "F")
    public float field10201 = 1.0F;

    @OriginalMember(owner = "client!wga", name = "Qe", descriptor = "Z")
    private boolean field10226 = false;

    @OriginalMember(owner = "client!wga", name = "Ae", descriptor = "I")
    public int field10210 = 0;

    @OriginalMember(owner = "client!wga", name = "Je", descriptor = "I")
    public int field10219 = 0;

    @OriginalMember(owner = "client!wga", name = "hf", descriptor = "I")
    public int field10243 = 512;

    @OriginalMember(owner = "client!wga", name = "We", descriptor = "Z")
    public boolean field10232 = false;

    @OriginalMember(owner = "client!wga", name = "Me", descriptor = "I")
    private int field10222 = 0;

    @OriginalMember(owner = "client!wga", name = "ve", descriptor = "I")
    public int field10205 = -1;

    @OriginalMember(owner = "client!wga", name = "Ze", descriptor = "Z")
    private boolean field10235 = false;

    @OriginalMember(owner = "client!wga", name = "Ue", descriptor = "Z")
    public boolean field10230 = true;

    @OriginalMember(owner = "client!wga", name = "df", descriptor = "I")
    public int field10239 = 8;

    @OriginalMember(owner = "client!wga", name = "Ge", descriptor = "[F")
    public float[] field10216 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!wga", name = "vf", descriptor = "[F")
    private float[] field10256 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!wga", name = "Pe", descriptor = "[F")
    private float[] field10225 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!wga", name = "jf", descriptor = "I")
    public int field10244 = 0;

    @OriginalMember(owner = "client!wga", name = "Kf", descriptor = "[F")
    private float[] field10271 = new float[16];

    @OriginalMember(owner = "client!wga", name = "Oe", descriptor = "Z")
    public boolean field10224 = true;

    @OriginalMember(owner = "client!wga", name = "Ne", descriptor = "I")
    public int field10223 = 0;

    @OriginalMember(owner = "client!wga", name = "Ye", descriptor = "[F")
    private float[] field10234 = new float[16];

    @OriginalMember(owner = "client!wga", name = "Ie", descriptor = "I")
    private int field10218 = -1;

    @OriginalMember(owner = "client!wga", name = "cf", descriptor = "Z")
    public boolean field10238 = true;

    @OriginalMember(owner = "client!wga", name = "ff", descriptor = "Z")
    private boolean field10241 = false;

    @OriginalMember(owner = "client!wga", name = "Jf", descriptor = "I")
    private int field10270 = 0;

    @OriginalMember(owner = "client!wga", name = "Gf", descriptor = "Z")
    private boolean field10267 = false;

    @OriginalMember(owner = "client!wga", name = "xf", descriptor = "I")
    public int field10258 = -1;

    @OriginalMember(owner = "client!wga", name = "Hf", descriptor = "I")
    public int field10268 = 3584;

    @OriginalMember(owner = "client!wga", name = "Le", descriptor = "I")
    public int field10221 = 3;

    @OriginalMember(owner = "client!wga", name = "sf", descriptor = "[Lfj;")
    private class657[] field10253 = new class657[10];

    @OriginalMember(owner = "client!wga", name = "Df", descriptor = "I")
    public int field10264 = 128;

    @OriginalMember(owner = "client!wga", name = "nf", descriptor = "I")
    public int field10248 = 512;

    @OriginalMember(owner = "client!wga", name = "Rf", descriptor = "Z")
    public boolean field10278 = false;

    @OriginalMember(owner = "client!wga", name = "tf", descriptor = "[F")
    private float[] field10254 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!wga", name = "Wf", descriptor = "F")
    public float field10283 = 3584.0F;

    @OriginalMember(owner = "client!wga", name = "uf", descriptor = "Z")
    public boolean field10255 = true;

    @OriginalMember(owner = "client!wga", name = "Qf", descriptor = "Lpn;")
    public class742 field10277 = class235.field3412;

    @OriginalMember(owner = "client!wga", name = "Bf", descriptor = "Z")
    public boolean field10262 = true;

    @OriginalMember(owner = "client!wga", name = "Be", descriptor = "Z")
    private boolean field10211 = false;

    @OriginalMember(owner = "client!wga", name = "Sf", descriptor = "I")
    public int field10279 = 0;

    @OriginalMember(owner = "client!wga", name = "yf", descriptor = "Z")
    public boolean field10259 = false;

    @OriginalMember(owner = "client!wga", name = "Ff", descriptor = "[F")
    private float[] field10266 = new float[16];

    @OriginalMember(owner = "client!wga", name = "dg", descriptor = "Z")
    private boolean field10290 = false;

    @OriginalMember(owner = "client!wga", name = "Of", descriptor = "I")
    private int field10275 = 0;

    @OriginalMember(owner = "client!wga", name = "Ke", descriptor = "I")
    public int field10220 = 0;

    @OriginalMember(owner = "client!wga", name = "Cf", descriptor = "Z")
    public boolean field10263 = false;

    @OriginalMember(owner = "client!wga", name = "If", descriptor = "F")
    private float field10269 = 1.0F;

    @OriginalMember(owner = "client!wga", name = "of", descriptor = "[F")
    public float[] field10249 = this.field10225;

    @OriginalMember(owner = "client!wga", name = "Uf", descriptor = "I")
    private int field10281 = 1;

    @OriginalMember(owner = "client!wga", name = "gg", descriptor = "I")
    private int field10293 = -1;

    @OriginalMember(owner = "client!wga", name = "cg", descriptor = "I")
    public int field10289 = 0;

    @OriginalMember(owner = "client!wga", name = "eg", descriptor = "I")
    private int field10291 = 0;

    @OriginalMember(owner = "client!wga", name = "Vf", descriptor = "F")
    public float field10282 = 1.0F;

    @OriginalMember(owner = "client!wga", name = "bg", descriptor = "F")
    public float field10288 = -1.0F;

    @OriginalMember(owner = "client!wga", name = "Xf", descriptor = "[F")
    public float[] field10284 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!wga", name = "ig", descriptor = "I")
    public int field10295 = 0;

    @OriginalMember(owner = "client!wga", name = "lg", descriptor = "Lqv;")
    public class447 field10298 = class293.field4101;

    @OriginalMember(owner = "client!wga", name = "hg", descriptor = "F")
    public float field10294 = 1.0F;

    @OriginalMember(owner = "client!wga", name = "ng", descriptor = "F")
    public float field10300 = -1.0F;

    @OriginalMember(owner = "client!wga", name = "Zf", descriptor = "I")
    private int field10286 = 16777215;

    @OriginalMember(owner = "client!wga", name = "kg", descriptor = "I")
    public int field10297 = 0;

    @OriginalMember(owner = "client!wga", name = "se", descriptor = "Ljaclib/memory/Stream;")
    private Stream field10202 = new Stream();

    @OriginalMember(owner = "client!wga", name = "xg", descriptor = "Lhaa;")
    private class81 field10310 = new class81();

    @OriginalMember(owner = "client!wga", name = "Ve", descriptor = "I")
    public int field10231;

    @OriginalMember(owner = "client!wga", name = "vd", descriptor = "Lin;")
    public class91 field10153;

    @OriginalMember(owner = "client!wga", name = "lb", descriptor = "Ljava/awt/Canvas;")
    public Canvas field10039;

    @OriginalMember(owner = "client!wga", name = "W", descriptor = "Ljava/awt/Canvas;")
    private Canvas field10024;

    @OriginalMember(owner = "client!wga", name = "fb", descriptor = "Ljava/lang/Object;")
    public Object field10033;

    @OriginalMember(owner = "client!wga", name = "cd", descriptor = "Ljava/lang/Object;")
    private Object field10134;

    @OriginalMember(owner = "client!wga", name = "vc", descriptor = "I")
    private int field10101;

    @OriginalMember(owner = "client!wga", name = "Wb", descriptor = "I")
    public int field10076;

    @OriginalMember(owner = "client!wga", name = "Sb", descriptor = "I")
    private int field10072;

    @OriginalMember(owner = "client!wga", name = "rb", descriptor = "I")
    public int field10045;

    @OriginalMember(owner = "client!wga", name = "fg", descriptor = "I")
    public int field10292;

    @OriginalMember(owner = "client!wga", name = "kb", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field10038;

    @OriginalMember(owner = "client!wga", name = "qf", descriptor = "Lfw;")
    private class56 field10251;

    @OriginalMember(owner = "client!wga", name = "bd", descriptor = "[Ljava/lang/String;")
    public static String[] field10133 = new String[5];

    @OriginalMember(owner = "client!wga", name = "Bd", descriptor = "I")
    public static int field10159 = 0;

    @OriginalMember(owner = "client!wga", name = "Jc", descriptor = "I")
    public static int field10115 = -1;

    @OriginalMember(owner = "client!wga", name = "He", descriptor = "F")
    public float field10217;

    @OriginalMember(owner = "client!wga", name = "Te", descriptor = "F")
    public float field10229;

    @OriginalMember(owner = "client!wga", name = "ef", descriptor = "F")
    public float field10240;

    @OriginalMember(owner = "client!wga", name = "gf", descriptor = "F")
    private float field10242;

    @OriginalMember(owner = "client!wga", name = "Lf", descriptor = "F")
    public float field10272;

    @OriginalMember(owner = "client!wga", name = "Tf", descriptor = "F")
    private float field10280;

    @OriginalMember(owner = "client!wga", name = "ag", descriptor = "F")
    public float field10287;

    @OriginalMember(owner = "client!wga", name = "mg", descriptor = "F")
    public float field10299;

    @OriginalMember(owner = "client!wga", name = "y", descriptor = "I")
    public static int field10000;

    @OriginalMember(owner = "client!wga", name = "z", descriptor = "I")
    public static int field10001;

    @OriginalMember(owner = "client!wga", name = "A", descriptor = "I")
    public static int field10002;

    @OriginalMember(owner = "client!wga", name = "B", descriptor = "I")
    public static int field10003;

    @OriginalMember(owner = "client!wga", name = "C", descriptor = "I")
    public static int field10004;

    @OriginalMember(owner = "client!wga", name = "D", descriptor = "I")
    public static int field10005;

    @OriginalMember(owner = "client!wga", name = "F", descriptor = "I")
    public static int field10007;

    @OriginalMember(owner = "client!wga", name = "G", descriptor = "I")
    public static int field10008;

    @OriginalMember(owner = "client!wga", name = "H", descriptor = "I")
    public static int field10009;

    @OriginalMember(owner = "client!wga", name = "I", descriptor = "I")
    public static int field10010;

    @OriginalMember(owner = "client!wga", name = "J", descriptor = "I")
    public static int field10011;

    @OriginalMember(owner = "client!wga", name = "K", descriptor = "I")
    public static int field10012;

    @OriginalMember(owner = "client!wga", name = "L", descriptor = "I")
    public static int field10013;

    @OriginalMember(owner = "client!wga", name = "M", descriptor = "I")
    public static int field10014;

    @OriginalMember(owner = "client!wga", name = "N", descriptor = "I")
    public static int field10015;

    @OriginalMember(owner = "client!wga", name = "O", descriptor = "I")
    public static int field10016;

    @OriginalMember(owner = "client!wga", name = "P", descriptor = "I")
    public static int field10017;

    @OriginalMember(owner = "client!wga", name = "Q", descriptor = "I")
    public static int field10018;

    @OriginalMember(owner = "client!wga", name = "R", descriptor = "I")
    public static int field10019;

    @OriginalMember(owner = "client!wga", name = "S", descriptor = "I")
    public static int field10020;

    @OriginalMember(owner = "client!wga", name = "T", descriptor = "I")
    public static int field10021;

    @OriginalMember(owner = "client!wga", name = "U", descriptor = "I")
    public static int field10022;

    @OriginalMember(owner = "client!wga", name = "V", descriptor = "I")
    public static int field10023;

    @OriginalMember(owner = "client!wga", name = "X", descriptor = "I")
    public static int field10025;

    @OriginalMember(owner = "client!wga", name = "Y", descriptor = "I")
    public static int field10026;

    @OriginalMember(owner = "client!wga", name = "Z", descriptor = "I")
    public static int field10027;

    @OriginalMember(owner = "client!wga", name = "ab", descriptor = "I")
    public static int field10028;

    @OriginalMember(owner = "client!wga", name = "bb", descriptor = "I")
    public static int field10029;

    @OriginalMember(owner = "client!wga", name = "cb", descriptor = "I")
    public static int field10030;

    @OriginalMember(owner = "client!wga", name = "db", descriptor = "I")
    public static int field10031;

    @OriginalMember(owner = "client!wga", name = "eb", descriptor = "I")
    public static int field10032;

    @OriginalMember(owner = "client!wga", name = "gb", descriptor = "I")
    public static int field10034;

    @OriginalMember(owner = "client!wga", name = "hb", descriptor = "I")
    public static int field10035;

    @OriginalMember(owner = "client!wga", name = "ib", descriptor = "I")
    public static int field10036;

    @OriginalMember(owner = "client!wga", name = "jb", descriptor = "I")
    public static int field10037;

    @OriginalMember(owner = "client!wga", name = "mb", descriptor = "I")
    public static int field10040;

    @OriginalMember(owner = "client!wga", name = "ob", descriptor = "I")
    public static int field10042;

    @OriginalMember(owner = "client!wga", name = "pb", descriptor = "I")
    public static int field10043;

    @OriginalMember(owner = "client!wga", name = "qb", descriptor = "I")
    public static int field10044;

    @OriginalMember(owner = "client!wga", name = "sb", descriptor = "I")
    public static int field10046;

    @OriginalMember(owner = "client!wga", name = "tb", descriptor = "I")
    public static int field10047;

    @OriginalMember(owner = "client!wga", name = "ub", descriptor = "I")
    public static int field10048;

    @OriginalMember(owner = "client!wga", name = "vb", descriptor = "I")
    public static int field10049;

    @OriginalMember(owner = "client!wga", name = "wb", descriptor = "I")
    public static int field10050;

    @OriginalMember(owner = "client!wga", name = "yb", descriptor = "I")
    public static int field10052;

    @OriginalMember(owner = "client!wga", name = "zb", descriptor = "I")
    public static int field10053;

    @OriginalMember(owner = "client!wga", name = "Ab", descriptor = "I")
    public static int field10054;

    @OriginalMember(owner = "client!wga", name = "Bb", descriptor = "I")
    public static int field10055;

    @OriginalMember(owner = "client!wga", name = "Cb", descriptor = "I")
    public static int field10056;

    @OriginalMember(owner = "client!wga", name = "Db", descriptor = "I")
    public static int field10057;

    @OriginalMember(owner = "client!wga", name = "Eb", descriptor = "I")
    public static int field10058;

    @OriginalMember(owner = "client!wga", name = "Fb", descriptor = "I")
    public static int field10059;

    @OriginalMember(owner = "client!wga", name = "Gb", descriptor = "I")
    public static int field10060;

    @OriginalMember(owner = "client!wga", name = "Hb", descriptor = "I")
    public static int field10061;

    @OriginalMember(owner = "client!wga", name = "Ib", descriptor = "I")
    public static int field10062;

    @OriginalMember(owner = "client!wga", name = "Jb", descriptor = "I")
    public static int field10063;

    @OriginalMember(owner = "client!wga", name = "Kb", descriptor = "I")
    public static int field10064;

    @OriginalMember(owner = "client!wga", name = "Lb", descriptor = "I")
    public static int field10065;

    @OriginalMember(owner = "client!wga", name = "Mb", descriptor = "I")
    public static int field10066;

    @OriginalMember(owner = "client!wga", name = "Nb", descriptor = "I")
    public static int field10067;

    @OriginalMember(owner = "client!wga", name = "Ob", descriptor = "I")
    public static int field10068;

    @OriginalMember(owner = "client!wga", name = "Pb", descriptor = "I")
    public static int field10069;

    @OriginalMember(owner = "client!wga", name = "Qb", descriptor = "I")
    public static int field10070;

    @OriginalMember(owner = "client!wga", name = "Rb", descriptor = "I")
    public static int field10071;

    @OriginalMember(owner = "client!wga", name = "Tb", descriptor = "I")
    public static int field10073;

    @OriginalMember(owner = "client!wga", name = "Ub", descriptor = "I")
    public static int field10074;

    @OriginalMember(owner = "client!wga", name = "Vb", descriptor = "I")
    public static int field10075;

    @OriginalMember(owner = "client!wga", name = "Xb", descriptor = "I")
    public static int field10077;

    @OriginalMember(owner = "client!wga", name = "Yb", descriptor = "I")
    public static int field10078;

    @OriginalMember(owner = "client!wga", name = "Zb", descriptor = "I")
    public static int field10079;

    @OriginalMember(owner = "client!wga", name = "ac", descriptor = "I")
    public static int field10080;

    @OriginalMember(owner = "client!wga", name = "bc", descriptor = "I")
    public static int field10081;

    @OriginalMember(owner = "client!wga", name = "cc", descriptor = "I")
    public static int field10082;

    @OriginalMember(owner = "client!wga", name = "dc", descriptor = "I")
    public static int field10083;

    @OriginalMember(owner = "client!wga", name = "ec", descriptor = "I")
    public static int field10084;

    @OriginalMember(owner = "client!wga", name = "fc", descriptor = "I")
    public static int field10085;

    @OriginalMember(owner = "client!wga", name = "gc", descriptor = "I")
    public static int field10086;

    @OriginalMember(owner = "client!wga", name = "hc", descriptor = "I")
    public static int field10087;

    @OriginalMember(owner = "client!wga", name = "jc", descriptor = "I")
    public static int field10089;

    @OriginalMember(owner = "client!wga", name = "kc", descriptor = "I")
    public static int field10090;

    @OriginalMember(owner = "client!wga", name = "lc", descriptor = "I")
    public static int field10091;

    @OriginalMember(owner = "client!wga", name = "mc", descriptor = "I")
    public static int field10092;

    @OriginalMember(owner = "client!wga", name = "nc", descriptor = "I")
    public static int field10093;

    @OriginalMember(owner = "client!wga", name = "oc", descriptor = "I")
    public static int field10094;

    @OriginalMember(owner = "client!wga", name = "pc", descriptor = "I")
    public static int field10095;

    @OriginalMember(owner = "client!wga", name = "qc", descriptor = "I")
    public static int field10096;

    @OriginalMember(owner = "client!wga", name = "rc", descriptor = "I")
    public static int field10097;

    @OriginalMember(owner = "client!wga", name = "sc", descriptor = "I")
    public static int field10098;

    @OriginalMember(owner = "client!wga", name = "tc", descriptor = "I")
    public static int field10099;

    @OriginalMember(owner = "client!wga", name = "uc", descriptor = "I")
    public static int field10100;

    @OriginalMember(owner = "client!wga", name = "wc", descriptor = "I")
    public static int field10102;

    @OriginalMember(owner = "client!wga", name = "xc", descriptor = "I")
    public static int field10103;

    @OriginalMember(owner = "client!wga", name = "yc", descriptor = "I")
    public static int field10104;

    @OriginalMember(owner = "client!wga", name = "zc", descriptor = "I")
    public static int field10105;

    @OriginalMember(owner = "client!wga", name = "Ac", descriptor = "I")
    public static int field10106;

    @OriginalMember(owner = "client!wga", name = "Bc", descriptor = "I")
    public static int field10107;

    @OriginalMember(owner = "client!wga", name = "Cc", descriptor = "I")
    public static int field10108;

    @OriginalMember(owner = "client!wga", name = "Dc", descriptor = "I")
    public static int field10109;

    @OriginalMember(owner = "client!wga", name = "Ec", descriptor = "I")
    public static int field10110;

    @OriginalMember(owner = "client!wga", name = "Fc", descriptor = "I")
    public static int field10111;

    @OriginalMember(owner = "client!wga", name = "Gc", descriptor = "I")
    public static int field10112;

    @OriginalMember(owner = "client!wga", name = "Hc", descriptor = "I")
    public static int field10113;

    @OriginalMember(owner = "client!wga", name = "Ic", descriptor = "I")
    public static int field10114;

    @OriginalMember(owner = "client!wga", name = "Kc", descriptor = "I")
    public static int field10116;

    @OriginalMember(owner = "client!wga", name = "Lc", descriptor = "I")
    public static int field10117;

    @OriginalMember(owner = "client!wga", name = "Mc", descriptor = "I")
    public static int field10118;

    @OriginalMember(owner = "client!wga", name = "Nc", descriptor = "I")
    public static int field10119;

    @OriginalMember(owner = "client!wga", name = "Oc", descriptor = "I")
    public static int field10120;

    @OriginalMember(owner = "client!wga", name = "Pc", descriptor = "I")
    public static int field10121;

    @OriginalMember(owner = "client!wga", name = "Qc", descriptor = "I")
    public static int field10122;

    @OriginalMember(owner = "client!wga", name = "Rc", descriptor = "I")
    public static int field10123;

    @OriginalMember(owner = "client!wga", name = "Sc", descriptor = "I")
    public static int field10124;

    @OriginalMember(owner = "client!wga", name = "Tc", descriptor = "I")
    public static int field10125;

    @OriginalMember(owner = "client!wga", name = "Uc", descriptor = "I")
    public static int field10126;

    @OriginalMember(owner = "client!wga", name = "Vc", descriptor = "I")
    public static int field10127;

    @OriginalMember(owner = "client!wga", name = "Xc", descriptor = "I")
    public static int field10129;

    @OriginalMember(owner = "client!wga", name = "Yc", descriptor = "I")
    public static int field10130;

    @OriginalMember(owner = "client!wga", name = "Zc", descriptor = "I")
    public static int field10131;

    @OriginalMember(owner = "client!wga", name = "ad", descriptor = "I")
    public static int field10132;

    @OriginalMember(owner = "client!wga", name = "dd", descriptor = "I")
    public static int field10135;

    @OriginalMember(owner = "client!wga", name = "ed", descriptor = "I")
    public static int field10136;

    @OriginalMember(owner = "client!wga", name = "fd", descriptor = "I")
    public static int field10137;

    @OriginalMember(owner = "client!wga", name = "gd", descriptor = "I")
    public static int field10138;

    @OriginalMember(owner = "client!wga", name = "hd", descriptor = "I")
    public static int field10139;

    @OriginalMember(owner = "client!wga", name = "id", descriptor = "I")
    public static int field10140;

    @OriginalMember(owner = "client!wga", name = "jd", descriptor = "I")
    public static int field10141;

    @OriginalMember(owner = "client!wga", name = "kd", descriptor = "I")
    public static int field10142;

    @OriginalMember(owner = "client!wga", name = "ld", descriptor = "I")
    public static int field10143;

    @OriginalMember(owner = "client!wga", name = "md", descriptor = "I")
    public static int field10144;

    @OriginalMember(owner = "client!wga", name = "nd", descriptor = "I")
    public static int field10145;

    @OriginalMember(owner = "client!wga", name = "od", descriptor = "I")
    public static int field10146;

    @OriginalMember(owner = "client!wga", name = "pd", descriptor = "I")
    public static int field10147;

    @OriginalMember(owner = "client!wga", name = "qd", descriptor = "I")
    public static int field10148;

    @OriginalMember(owner = "client!wga", name = "rd", descriptor = "I")
    public static int field10149;

    @OriginalMember(owner = "client!wga", name = "sd", descriptor = "I")
    public static int field10150;

    @OriginalMember(owner = "client!wga", name = "td", descriptor = "I")
    public static int field10151;

    @OriginalMember(owner = "client!wga", name = "ud", descriptor = "I")
    public static int field10152;

    @OriginalMember(owner = "client!wga", name = "wd", descriptor = "I")
    public static int field10154;

    @OriginalMember(owner = "client!wga", name = "xd", descriptor = "I")
    public static int field10155;

    @OriginalMember(owner = "client!wga", name = "yd", descriptor = "I")
    public static int field10156;

    @OriginalMember(owner = "client!wga", name = "zd", descriptor = "I")
    public static int field10157;

    @OriginalMember(owner = "client!wga", name = "Ad", descriptor = "I")
    public static int field10158;

    @OriginalMember(owner = "client!wga", name = "Cd", descriptor = "I")
    public static int field10160;

    @OriginalMember(owner = "client!wga", name = "Dd", descriptor = "I")
    public static int field10161;

    @OriginalMember(owner = "client!wga", name = "Ed", descriptor = "I")
    public static int field10162;

    @OriginalMember(owner = "client!wga", name = "Fd", descriptor = "I")
    public static int field10163;

    @OriginalMember(owner = "client!wga", name = "Gd", descriptor = "I")
    public static int field10164;

    @OriginalMember(owner = "client!wga", name = "Hd", descriptor = "I")
    public static int field10165;

    @OriginalMember(owner = "client!wga", name = "Id", descriptor = "I")
    public static int field10166;

    @OriginalMember(owner = "client!wga", name = "Jd", descriptor = "I")
    public static int field10167;

    @OriginalMember(owner = "client!wga", name = "Kd", descriptor = "I")
    public static int field10168;

    @OriginalMember(owner = "client!wga", name = "Ld", descriptor = "I")
    public static int field10169;

    @OriginalMember(owner = "client!wga", name = "Md", descriptor = "I")
    public static int field10170;

    @OriginalMember(owner = "client!wga", name = "Nd", descriptor = "I")
    public static int field10171;

    @OriginalMember(owner = "client!wga", name = "Od", descriptor = "I")
    public static int field10172;

    @OriginalMember(owner = "client!wga", name = "Pd", descriptor = "I")
    public static int field10173;

    @OriginalMember(owner = "client!wga", name = "Qd", descriptor = "I")
    public static int field10174;

    @OriginalMember(owner = "client!wga", name = "Rd", descriptor = "I")
    public static int field10175;

    @OriginalMember(owner = "client!wga", name = "Sd", descriptor = "I")
    public int field10176;

    @OriginalMember(owner = "client!wga", name = "Td", descriptor = "I")
    public int field10177;

    @OriginalMember(owner = "client!wga", name = "Ud", descriptor = "I")
    public static int field10178;

    @OriginalMember(owner = "client!wga", name = "Vd", descriptor = "I")
    public static int field10179;

    @OriginalMember(owner = "client!wga", name = "Wd", descriptor = "I")
    public static int field10180;

    @OriginalMember(owner = "client!wga", name = "Xd", descriptor = "I")
    public static int field10181;

    @OriginalMember(owner = "client!wga", name = "Yd", descriptor = "I")
    public static int field10182;

    @OriginalMember(owner = "client!wga", name = "ae", descriptor = "I")
    public static int field10184;

    @OriginalMember(owner = "client!wga", name = "be", descriptor = "I")
    public static int field10185;

    @OriginalMember(owner = "client!wga", name = "ce", descriptor = "I")
    public static int field10186;

    @OriginalMember(owner = "client!wga", name = "de", descriptor = "I")
    public static int field10187;

    @OriginalMember(owner = "client!wga", name = "fe", descriptor = "I")
    public static int field10189;

    @OriginalMember(owner = "client!wga", name = "ge", descriptor = "I")
    public static int field10190;

    @OriginalMember(owner = "client!wga", name = "he", descriptor = "I")
    public static int field10191;

    @OriginalMember(owner = "client!wga", name = "ie", descriptor = "I")
    public static int field10192;

    @OriginalMember(owner = "client!wga", name = "je", descriptor = "I")
    public int field10193;

    @OriginalMember(owner = "client!wga", name = "le", descriptor = "I")
    public static int field10195;

    @OriginalMember(owner = "client!wga", name = "ue", descriptor = "I")
    public int field10204;

    @OriginalMember(owner = "client!wga", name = "Ee", descriptor = "I")
    private int field10214;

    @OriginalMember(owner = "client!wga", name = "Se", descriptor = "I")
    public int field10228;

    @OriginalMember(owner = "client!wga", name = "Xe", descriptor = "I")
    public int field10233;

    @OriginalMember(owner = "client!wga", name = "af", descriptor = "I")
    public int field10236;

    @OriginalMember(owner = "client!wga", name = "mf", descriptor = "I")
    public int field10247;

    @OriginalMember(owner = "client!wga", name = "rf", descriptor = "I")
    public int field10252;

    @OriginalMember(owner = "client!wga", name = "zf", descriptor = "I")
    public int field10260;

    @OriginalMember(owner = "client!wga", name = "Ef", descriptor = "I")
    public int field10265;

    @OriginalMember(owner = "client!wga", name = "Pf", descriptor = "I")
    private int field10276;

    @OriginalMember(owner = "client!wga", name = "Lg", descriptor = "I")
    private int field10324;

    @OriginalMember(owner = "client!wga", name = "x", descriptor = "I")
    public static int field9999;

    @OriginalMember(owner = "client!wga", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!wga", name = "wg", descriptor = "Luq;")
    private class163 field10309;

    @OriginalMember(owner = "client!wga", name = "Yf", descriptor = "Lvc;")
    private class319 field10285;

    @OriginalMember(owner = "client!wga", name = "ug", descriptor = "Ltc;")
    private class353 field10307;

    @OriginalMember(owner = "client!wga", name = "Cg", descriptor = "Ltc;")
    private class353 field10315;

    @OriginalMember(owner = "client!wga", name = "Eg", descriptor = "Ltc;")
    private class353 field10317;

    @OriginalMember(owner = "client!wga", name = "Af", descriptor = "Ldu;")
    public class357 field10261;

    @OriginalMember(owner = "client!wga", name = "rg", descriptor = "Lnp;")
    private class491 field10304;

    @OriginalMember(owner = "client!wga", name = "sg", descriptor = "Lnp;")
    public class491 field10305;

    @OriginalMember(owner = "client!wga", name = "yg", descriptor = "Lnp;")
    private class491 field10311;

    @OriginalMember(owner = "client!wga", name = "Dg", descriptor = "Lnp;")
    public class491 field10316;

    @OriginalMember(owner = "client!wga", name = "Fg", descriptor = "Lnp;")
    public class491 field10318;

    @OriginalMember(owner = "client!wga", name = "Gg", descriptor = "Lnp;")
    private class491 field10319;

    @OriginalMember(owner = "client!wga", name = "Jg", descriptor = "Lnp;")
    public class491 field10322;

    @OriginalMember(owner = "client!wga", name = "pf", descriptor = "Lve;")
    private class504 field10250;

    @OriginalMember(owner = "client!wga", name = "xb", descriptor = "Lur;")
    public class537 field10051;

    @OriginalMember(owner = "client!wga", name = "wf", descriptor = "Lfj;")
    private class657 field10257;

    @OriginalMember(owner = "client!wga", name = "og", descriptor = "Lnca;")
    public class750 field10301;

    @OriginalMember(owner = "client!wga", name = "pg", descriptor = "Lnca;")
    public class750 field10302;

    @OriginalMember(owner = "client!wga", name = "qg", descriptor = "Lnca;")
    public class750 field10303;

    @OriginalMember(owner = "client!wga", name = "tg", descriptor = "Lnca;")
    public class750 field10306;

    @OriginalMember(owner = "client!wga", name = "vg", descriptor = "Lnca;")
    public class750 field10308;

    @OriginalMember(owner = "client!wga", name = "zg", descriptor = "Lnca;")
    public class750 field10312;

    @OriginalMember(owner = "client!wga", name = "Ag", descriptor = "Lnca;")
    public class750 field10313;

    @OriginalMember(owner = "client!wga", name = "Bg", descriptor = "Lnca;")
    public class750 field10314;

    @OriginalMember(owner = "client!wga", name = "Hg", descriptor = "Lnca;")
    public class750 field10320;

    @OriginalMember(owner = "client!wga", name = "Ig", descriptor = "Lnca;")
    public class750 field10321;

    @OriginalMember(owner = "client!wga", name = "E", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field10006;

    @OriginalMember(owner = "client!wga", name = "ic", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field10088;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wga", name = "Mg", descriptor = "Ljava/lang/Class;")
    public static Class field10325;

    @OriginalMember(owner = "client!wga", name = "Wc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field10128;

    @OriginalMember(owner = "client!wga", name = "Fe", descriptor = "Z")
    public boolean field10215;

    @OriginalMember(owner = "client!wga", name = "bf", descriptor = "Z")
    public boolean field10237;

    @OriginalMember(owner = "client!wga", name = "Mf", descriptor = "Z")
    public boolean field10273;

    @OriginalMember(owner = "client!wga", name = "Nf", descriptor = "Z")
    public boolean field10274;

    @OriginalMember(owner = "client!wga", name = "jg", descriptor = "Z")
    public boolean field10296;

    @OriginalMember(owner = "client!wga", name = "Kg", descriptor = "Z")
    public boolean field10323;

    @OriginalMember(owner = "client!wga", name = "Re", descriptor = "[Ltr;")
    public class296[] field10227;

    @OriginalMember(owner = "client!wga", name = "Ce", descriptor = "[Ldu;")
    private class357[] field10212;

    @OriginalMember(owner = "client!wga", name = "lf", descriptor = "[Lab;")
    public class669[] field10246;

    @OriginalMember(owner = "client!wga", name = "qe", descriptor = "[Lsia;")
    public class732[] field10200;

    @OriginalMember(owner = "client!wga", name = "we", descriptor = "[Lsia;")
    public class732[] field10206;

    @OriginalMember(owner = "client!wga", name = "kf", descriptor = "[Lhaa;")
    public class81[] field10245;

    @OriginalMember(owner = "client!wga", name = "da", descriptor = "(III[I)V")
    public final void method299(int arg0, int arg1, int arg2, int[] arg3) {
        ++field10080;
        float var5 = this.field10194.method776((byte) -105, (float) arg0, (float) arg2, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field10244;
            var7 = this.field10208;
        } else {
            var7 = (int) ((float) this.field10243 * this.field10194.method767((float) arg2, (float) arg1, (byte) 45, (float) arg0) / var5);
            var6 = (int) ((float) this.field10248 * this.field10194.method759((byte) 108, (float) arg0, (float) arg2, (float) arg1) / var5);
        }
        arg3[2] = (int) var5;
        arg3[0] = (int) ((float) var7 - this.field10240);
        arg3[1] = (int) ((float) var6 - this.field10217);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lza;)V")
    public final void method270(class415 arg0) {
        ++field10119;
        this.field10006 = ((class221) arg0).field3179;
        this.field10088 = this.field10006.method3777(32768, false);
    }

    @OriginalMember(owner = "client!wga", name = "JA", descriptor = "(IIIIII)I")
    public final int method309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field10185;
        int var7 = 0;
        float var8 = (float) arg2 * this.field10194.field1456 + (float) arg0 * this.field10194.field1476 + (float) arg1 * this.field10194.field1431 + this.field10194.field1464;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field10194.field1456 + (float) arg3 * this.field10194.field1476 + (float) arg4 * this.field10194.field1431 + this.field10194.field1464;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field10209 > var8 && (float) this.field10209 > var9) {
            var7 |= 16;
        } else if (var8 > (float) this.field10268 && (float) this.field10268 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field10194.field1444 + (float) arg0 * this.field10194.field1451 + (float) arg1 * this.field10194.field1440 + this.field10194.field1469) * (float) this.field10243 / var8);
        int var11 = (int) (((float) arg5 * this.field10194.field1444 + (float) arg3 * this.field10194.field1451 + (float) arg4 * this.field10194.field1440 + this.field10194.field1469) * (float) this.field10243 / var9);
        if ((float) var10 < this.field10240 && (float) var11 < this.field10240) {
            var7 |= 1;
        } else if (this.field10272 < (float) var10 && (float) var11 > this.field10272) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field10194.field1472 + (float) arg0 * this.field10194.field1448 + (float) arg1 * this.field10194.field1462 + this.field10194.field1450) * (float) this.field10248 / var8);
        int var13 = (int) (((float) arg5 * this.field10194.field1472 + (float) arg3 * this.field10194.field1448 + (float) arg4 * this.field10194.field1462 + this.field10194.field1450) * (float) this.field10248 / var9);
        if (this.field10217 > (float) var12 && (float) var13 < this.field10217) {
            var7 |= 4;
        } else if ((float) var12 > this.field10299 && (float) var13 > this.field10299) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I[Ljl;)Lnp;")
    public abstract class491 method2243(int arg0, class273[] arg1);

    @OriginalMember(owner = "client!wga", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method218(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field10026;
        boolean var7 = ~this.field10286 != ~arg0;
        if (var7 || this.field10288 != arg1 || this.field10300 != arg2) {
            this.field10286 = arg0;
            this.field10288 = arg1;
            this.field10300 = arg2;
            if (var7) {
                this.field10201 = (float) (this.field10286 & 65280) / 65280.0F;
                this.field10294 = (float) (16711680 & this.field10286) / 1.671168E7F;
                this.field10282 = (float) (255 & this.field10286) / 255.0F;
                this.method2256(0);
            }
            this.field10038.setSunColour(this.field10294, this.field10201, this.field10282, arg1, arg2);
            this.method2270(true);
        }
        if (this.field10256[0] != arg3 || this.field10256[1] != arg4 || this.field10256[2] != arg5) {
            this.field10256[2] = arg5;
            this.field10256[1] = arg4;
            this.field10256[0] = arg3;
            this.field10254[2] = -arg5;
            this.field10254[0] = -arg3;
            this.field10254[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field10284[1] = arg4 * var8;
            this.field10284[2] = arg5 * var8;
            this.field10284[0] = arg3 * var8;
            this.field10216[1] = -this.field10284[1];
            this.field10216[2] = -this.field10284[2];
            this.field10216[0] = -this.field10284[0];
            this.field10038.setSunDirection(this.field10284[0], this.field10284[1], this.field10284[2]);
            this.method2295(0);
            this.field10247 = (int) (arg3 * 256.0F / arg4);
            this.field10228 = (int) (arg5 * 256.0F / arg4);
        }
        this.method2255((byte) 101);
    }

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "(Z)V")
    public abstract void method2250(boolean arg0);

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZZIB)V")
    public final void method4073(boolean arg0, boolean arg1, int arg2, byte arg3) {
        if (arg3 >= 27) {
            ++field10195;
            if (~this.field10218 != ~arg2 || !this.field10267 == this.field10274) {
                class200 var5 = null;
                int var6 = 0;
                byte var7 = 0;
                int var8 = 0;
                int var9 = this.field10274 ? 3 : 0;
                if (arg2 < 0) {
                    this.method4116(-8629);
                } else {
                    var5 = this.field10251.method610((byte) -97, arg2);
                    class739 var10 = super.field1170.method1180(arg2, -6662);
                    if (var10.field9940 == 0 && var10.field9953 == 0) {
                        this.method4116(-8629);
                    } else {
                        int var11 = !var10.field9941 ? 128 : 64;
                        int var12 = var11 * 50;
                        class81 var13 = this.method4077(false);
                        var13.method751((float) (this.field10260 % var12 * var10.field9953) / (float) var12, true, 0.0F, (float) (this.field10260 % var12 * var10.field9940) / (float) var12);
                        this.method4099(-32, class620.field8440);
                    }
                    var6 = var10.field9945;
                    if (!this.field10274) {
                        var7 = var10.field9944;
                        var9 = var10.field9955;
                        var8 = var10.field9948;
                    }
                }
                this.method4113(var7, arg1, arg0, var9, var8, -103);
                if (this.field10257 != null) {
                    this.field10257.method736(var6, var5, -16776);
                } else {
                    this.method4097((byte) -86, var5);
                    this.method4144(true, var6);
                }
                this.field10267 = this.field10274;
                this.field10218 = arg2;
            }
            this.field10214 &= -8;
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILhaa;)V")
    public final void method4074(int arg0, class81 arg1) {
        ++field10143;
        if (arg0 != 0) {
            this.field10176 = -6;
        }
        this.field10188.method778(arg1);
        this.field10183 = false;
        this.method4088(1);
    }

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "(B)V")
    private final void method4075(byte arg0) {
        this.field10317 = this.method2300(true, 16711680);
        int var2 = -85 / ((41 - arg0) / 54);
        ++field10062;
        this.field10317.method879(24, (byte) 125, 12);
        this.field10319 = this.method2243(0, new class273[] { new class273(class11.field149) });
    }

    @OriginalMember(owner = "client!wga", name = "h", descriptor = "(II)V")
    public final void method4076(int arg0, int arg1) {
        if (arg0 <= 53) {
            this.method4115(-0.15425435F, 84, -0.11598543F, 0.9862154F, -1.0921319F, -1.1620088F, -1.5202727F);
        }
        if (this.field10281 != arg1) {
            boolean var3;
            class742 var4;
            boolean var5;
            if (arg1 == 1) {
                var3 = true;
                var4 = class235.field3412;
                var5 = true;
            } else if (~arg1 != -3) {
                if (~arg1 == -129) {
                    var3 = true;
                    var4 = class418.field6055;
                    var5 = true;
                } else {
                    var5 = false;
                    var4 = class399.field5888;
                    var3 = false;
                }
            } else {
                var4 = class239.field3494;
                var5 = true;
                var3 = false;
            }
            if (this.field10255 != var3) {
                this.field10255 = var3;
                this.method2296((byte) 100);
            }
            if (!var5 == this.field10230) {
                this.field10230 = var5;
                this.method2285(4);
            }
            if (this.field10277 != var4) {
                this.field10277 = var4;
                this.method2299(0);
            }
            this.field10214 &= -29;
            this.field10281 = arg1;
        }
        ++field10052;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(II[I[I)Laa;")
    public final class487 method268(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field10071;
        return class228.method1600(arg1, this, arg2, (byte) -42, arg3, arg0);
    }

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "(Z)V")
    public abstract void method2244(boolean arg0);

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "(B)V")
    public abstract void method2265(byte arg0);

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "(Z)Lhaa;")
    public final class81 method4077(boolean arg0) {
        ++field10118;
        if (arg0) {
            this.method4128(true);
        }
        return this.field10245[this.field10289];
    }

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "(I)V")
    public final void method4078(int arg0) {
        ++field10005;
        this.method4148((byte) -125);
        this.method4146(true);
        if (arg0 != -4845) {
            this.method2301(false);
        }
    }

    @OriginalMember(owner = "client!wga", name = "i", descriptor = "(II)Luq;")
    public final class163 method4079(int arg0, int arg1) {
        if (~(arg1 * 2) < ~this.field10309.method877(false)) {
            this.field10309.method1240(15959, arg1);
        }
        if (arg0 <= 23) {
            return null;
        } else {
            ++field10089;
            return this.field10309;
        }
    }

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "(B)V")
    public void method2277(byte arg0) {
        int var2 = 23 / ((-39 - arg0) / 62);
        this.field10236 = this.field10265;
        ++field10120;
        this.field10265 = 0;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method4080(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field10047;
        if (~arg3 <= -1 && arg0 >= 0 && class376.field5325 + -1 > arg3 && ~(class175.field2711 + -1) < ~arg0) {
            if (class649.field8928 == null) {
                return;
            }
            if (arg7 == 0) {
                class258 var8 = (class258) class28.method398(arg6, arg3, arg0);
                class258 var9 = (class258) class549.method3163(arg6, arg3, arg0);
                if (var8 != null && arg2 != 2) {
                    if (var8 instanceof class127) {
                        ((class127) var8).field2157.method2015(262144, arg1);
                    } else {
                        class754.method4205(arg3, 89, arg7, arg1, var8.method589(-76), arg2, arg0, arg4, arg6);
                    }
                }
                if (var9 != null) {
                    if (var9 instanceof class127) {
                        ((class127) var9).field2157.method2015(262144, arg1);
                    } else {
                        class754.method4205(arg3, 92, arg7, arg1, var9.method589(-71), arg2, arg0, arg4, arg6);
                    }
                }
            } else if (~arg7 != -2) {
                if (~arg7 != -3) {
                    if (~arg7 == -4) {
                        class258 var10 = (class258) class12.method112(arg6, arg3, arg0);
                        if (var10 != null) {
                            if (var10 instanceof class328) {
                                ((class328) var10).field4562.method2015(262144, arg1);
                            } else {
                                class754.method4205(arg3, 28, arg7, arg1, var10.method589(-123), arg2, arg0, arg4, arg6);
                            }
                        }
                    }
                } else {
                    class258 var11 = (class258) class562.method3228(arg6, arg3, arg0, field10325 != null ? field10325 : (field10325 = method4159("se")));
                    if (var11 != null) {
                        if (arg2 == 11) {
                            arg2 = 10;
                        }
                        if (!(var11 instanceof class143)) {
                            class754.method4205(arg3, 43, arg7, arg1, var11.method589(-107), arg2, arg0, arg4, arg6);
                        } else {
                            ((class143) var11).field2362.method2015(262144, arg1);
                        }
                    }
                }
            } else {
                class258 var12 = (class258) class466.method2743(arg6, arg3, arg0);
                if (var12 != null) {
                    if (var12 instanceof class705) {
                        ((class705) var12).field9550.method2015(262144, arg1);
                    } else {
                        int var13 = var12.method589(-83);
                        if (arg2 != 4 && ~arg2 != -6) {
                            if (~arg2 != -7) {
                                if (arg2 == 7) {
                                    class754.method4205(arg3, 50, arg7, arg1, var13, 4, arg0, (3 & arg4 + 2) + 4, arg6);
                                } else if (arg2 == 8) {
                                    class754.method4205(arg3, 116, arg7, arg1, var13, 4, arg0, arg4 + 4, arg6);
                                    class754.method4205(arg3, 91, arg7, arg1, var13, 4, arg0, (3 & arg4 - -2) + 4, arg6);
                                }
                            } else {
                                class754.method4205(arg3, 22, arg7, arg1, var13, 4, arg0, arg4 + 4, arg6);
                            }
                        } else {
                            class754.method4205(arg3, 86, arg7, arg1, var13, 4, arg0, arg4, arg6);
                        }
                    }
                }
            }
        }
        if (arg5 < 98) {
            method4151(-100);
        }
    }

    @OriginalMember(owner = "client!wga", name = "w", descriptor = "()Z")
    public final boolean method361() {
        ++field10018;
        return this.field10296;
    }

    @OriginalMember(owner = "client!wga", name = "z", descriptor = "()Z")
    public final boolean method364() {
        ++field10017;
        return false;
    }

    @OriginalMember(owner = "client!wga", name = "j", descriptor = "(I)V")
    public final void method4081(int arg0) {
        if (~this.field10214 != -9) {
            this.method4124(-8);
            this.method4090(true, true);
            this.method4120(true, (byte) 111);
            this.method4156(arg0 ^ -24, true);
            this.method4076(69, 1);
            this.field10214 = 8;
        }
        ++field10121;
        if (arg0 != 8) {
            this.method2247((byte) 20);
        }
    }

    @OriginalMember(owner = "client!wga", name = "h", descriptor = "()V")
    public void method251() {
        ++field10179;
        if (!this.field10290) {
            for (class362 var1 = this.field10041.method1269(4); var1 != null; var1 = this.field10041.method1264((byte) 102)) {
                ((class221) var1).method1574(-9503);
            }
            Enumeration var2 = this.field10128.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method2293(var3, 1, this.field10128.get(var3));
            }
            class365.method2326(true, -125, false);
            this.field10038.release();
            this.field10290 = true;
        }
    }

    @OriginalMember(owner = "client!wga", name = "HA", descriptor = "(IIII[I)V")
    public final void method195(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field10093;
        float var6 = this.field10194.method776((byte) -105, (float) arg0, (float) arg2, (float) arg1);
        if (!((float) this.field10209 > var6) && !((float) this.field10268 < var6)) {
            int var7 = (int) ((float) this.field10243 * this.field10194.method767((float) arg2, (float) arg1, (byte) 45, (float) arg0) / (float) arg3);
            int var8 = (int) ((float) this.field10248 * this.field10194.method759((byte) 67, (float) arg0, (float) arg2, (float) arg1) / (float) arg3);
            arg4[2] = (int) var6;
            arg4[1] = (int) ((float) var8 + -this.field10217);
            arg4[0] = (int) ((float) var7 + -this.field10240);
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!wga", name = "n", descriptor = "()Z")
    public final boolean method247() {
        ++field10013;
        return true;
    }

    @OriginalMember(owner = "client!wga", name = "f", descriptor = "(B)I")
    public final int method4082(byte arg0) {
        if (arg0 != -70) {
            this.method261(-1);
        }
        ++field10164;
        return this.field10291;
    }

    @OriginalMember(owner = "client!wga", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field10114;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lbca;)V")
    public final void method210(class661 arg0) {
        this.field10194 = (class81) arg0;
        ++field10037;
        this.field10197.method778(this.field10194);
        this.field10197.method777((byte) 64);
        this.field10198.method773(-25519, this.field10197);
        this.field10196.method773(-25519, this.field10194);
        if (this.field10298.method2676(-112)) {
            this.method4136((byte) 107);
        }
    }

    @OriginalMember(owner = "client!wga", name = "g", descriptor = "(B)V")
    public abstract void method2267(byte arg0);

    @OriginalMember(owner = "client!wga", name = "f", descriptor = "(Z)V")
    private final void method4083(boolean arg0) {
        this.field10307 = this.method2300(arg0, 16711680);
        ++field10099;
        this.field10307.method879(140, (byte) 123, 28);
        for (int var2 = 0; var2 < 4; ++var2) {
            Buffer var3 = this.field10307.method880(true, 26775);
            if (var3 != null) {
                Stream var4 = this.method4122(var3, 9179);
                if (!Stream.method3789()) {
                    var4.method3792(0.0F);
                    var4.method3792(0.0F);
                    var4.method3792(0.0F);
                    var4.method3792(0.0F);
                    var4.method3792(0.0F);
                    var4.method3792(0.0F);
                    var4.method3792(0.0F);
                    var4.method3792(0.0F);
                    var4.method3792(1.0F);
                    var4.method3792(0.0F);
                    var4.method3792(0.0F);
                    var4.method3792(1.0F);
                    var4.method3792(0.0F);
                    var4.method3792(1.0F);
                    var4.method3792(1.0F);
                    var4.method3792(1.0F);
                    var4.method3792(0.0F);
                    var4.method3792(1.0F);
                    var4.method3792(1.0F);
                    var4.method3792(1.0F);
                    var4.method3792(1.0F);
                    var4.method3792(1.0F);
                    var4.method3792(0.0F);
                    var4.method3792(0.0F);
                    var4.method3792(1.0F);
                    var4.method3792(0.0F);
                    var4.method3792(1.0F);
                    var4.method3792(0.0F);
                    var4.method3792(0.0F);
                    var4.method3792(0.0F);
                    var4.method3792(0.0F);
                    var4.method3792(0.0F);
                    var4.method3792(0.0F);
                    var4.method3792(0.0F);
                    var4.method3792(0.0F);
                } else {
                    var4.method3780(0.0F);
                    var4.method3780(0.0F);
                    var4.method3780(0.0F);
                    var4.method3780(0.0F);
                    var4.method3780(0.0F);
                    var4.method3780(0.0F);
                    var4.method3780(0.0F);
                    var4.method3780(0.0F);
                    var4.method3780(1.0F);
                    var4.method3780(0.0F);
                    var4.method3780(0.0F);
                    var4.method3780(1.0F);
                    var4.method3780(0.0F);
                    var4.method3780(1.0F);
                    var4.method3780(1.0F);
                    var4.method3780(1.0F);
                    var4.method3780(0.0F);
                    var4.method3780(1.0F);
                    var4.method3780(1.0F);
                    var4.method3780(1.0F);
                    var4.method3780(1.0F);
                    var4.method3780(1.0F);
                    var4.method3780(0.0F);
                    var4.method3780(0.0F);
                    var4.method3780(1.0F);
                    var4.method3780(0.0F);
                    var4.method3780(1.0F);
                    var4.method3780(0.0F);
                    var4.method3780(0.0F);
                    var4.method3780(0.0F);
                    var4.method3780(0.0F);
                    var4.method3780(0.0F);
                    var4.method3780(0.0F);
                    var4.method3780(0.0F);
                    var4.method3780(0.0F);
                }
                var4.method3784();
                if (this.field10307.method882(6331)) {
                    break;
                }
            }
        }
        this.field10311 = this.method2243(0, new class273[] { new class273(new class11[] { class11.field149, class11.field154, class11.field154 }) });
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lkf;IBZ)V")
    public abstract void method2288(class255 arg0, int arg1, byte arg2, boolean arg3);

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I[IZBIII)Lwfa;")
    public abstract class200 method2284(int arg0, int[] arg1, boolean arg2, byte arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V")
    public final void method352(int arg0) {
        ++field10077;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!wga", name = "h", descriptor = "(B)V")
    private final void method4084(byte arg0) {
        if (arg0 != 19) {
            this.method311(31, -7, false);
        }
        this.field10211 = false;
        ++field10008;
        this.method4131((byte) 122);
        if (class27.field744 == this.field10298) {
            this.method4146(true);
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IB)Lfj;")
    public class657 method2283(int arg0, byte arg1) {
        if (arg1 > -57) {
            this.method4076(22, -65);
        }
        ++field10083;
        if (arg0 != 6) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    return ~arg0 == -8 ? new class171(this) : new class101(this);
                } else {
                    return new class79(this, this.field10051);
                }
            } else {
                return new class376(this);
            }
        } else {
            return new class240(this);
        }
    }

    @OriginalMember(owner = "client!wga", name = "i", descriptor = "(B)I")
    public final int method4085(byte arg0) {
        ++field10108;
        if (arg0 != -58) {
            this.method4077(true);
        }
        return this.field10293;
    }

    @OriginalMember(owner = "client!wga", name = "k", descriptor = "(I)Lnj;")
    public final class247 method4086(int arg0) {
        if (arg0 != -16777216) {
            this.field10214 = 109;
        }
        ++field10048;
        return this.field10285 != null ? this.field10285.method1792(true) : null;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "([FI)[F")
    public final float[] method4087(float[] arg0, int arg1) {
        arg0[0] = this.field10249[0];
        arg0[4] = this.field10249[1];
        arg0[12] = this.field10249[3];
        if (arg1 > -77) {
            this.method2267((byte) 43);
        }
        ++field10167;
        arg0[8] = this.field10249[2];
        arg0[9] = this.field10249[6];
        arg0[13] = this.field10249[7];
        arg0[2] = this.field10249[8];
        arg0[1] = this.field10249[4];
        arg0[5] = this.field10249[5];
        arg0[10] = this.field10249[10];
        arg0[14] = this.field10249[11];
        arg0[3] = this.field10249[12];
        arg0[6] = this.field10249[9];
        arg0[7] = this.field10249[13];
        arg0[15] = this.field10249[15];
        arg0[11] = this.field10249[14];
        return arg0;
    }

    @OriginalMember(owner = "client!wga", name = "l", descriptor = "(I)V")
    private final void method4088(int arg0) {
        if (class474.field6625 == this.field10298) {
            float var2 = this.method2301(false);
            this.field10188.method757(var2, false, 0.0F, var2);
        }
        ++field10137;
        this.field10235 = false;
        this.method2247((byte) -48);
        if (arg0 == 1) {
            if (this.field10257 != null) {
                this.field10257.method1313((byte) 12);
            }
        }
    }

    @OriginalMember(owner = "client!wga", name = "g", descriptor = "(Z)[F")
    public final float[] method4089(boolean arg0) {
        if (!arg0) {
            this.method4104(-25);
        }
        ++field10106;
        return this.field10225;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZZ)V")
    public final void method4090(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.field10271 = null;
        }
        if (this.field10237 == !arg1) {
            this.field10237 = arg1;
            this.method2267((byte) -84);
            this.field10214 &= -32;
        }
        ++field10081;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIZ[I)Lwfa;")
    public final class200 method4091(int arg0, int arg1, int arg2, boolean arg3, int[] arg4) {
        if (arg2 != -15137) {
            this.field10240 = -0.13315333F;
        }
        ++field10079;
        return this.method2284(arg1, arg4, arg3, (byte) 107, 0, 0, arg0);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IZ)Luq;")
    public abstract class163 method2290(int arg0, boolean arg1);

    @OriginalMember(owner = "client!wga", name = "j", descriptor = "(B)V")
    public abstract void method2242(byte arg0);

    @OriginalMember(owner = "client!wga", name = "h", descriptor = "(Z)V")
    public abstract void method2270(boolean arg0);

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIII[BLwq;IZ)Lwfa;")
    public abstract class200 method2258(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class169 arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!wga", name = "X", descriptor = "(I)V")
    public final void method267(int arg0) {
        ++field10034;
        this.field10221 = 0;
        while (~arg0 < -2) {
            ++this.field10221;
            arg0 >>= 1;
        }
        this.field10239 = 1 << this.field10221;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method2278(int arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!wga", name = "aa", descriptor = "(IIIIII)V")
    public final void method217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method4128(false);
        ++field10131;
        this.method4123(-28186, arg4);
        this.method4096((byte) 47, 0, class4.field31);
        this.method4117(0, true, class4.field31);
        this.method4076(113, arg5);
        this.field10188.method775(1.0F, (float) arg3, (float) arg2, (byte) -22);
        this.field10188.method752(arg0, arg1, 0);
        this.method4138(0);
        this.method2261((byte) 67, false);
        this.method4149(-70);
        this.method2261((byte) 83, true);
        this.method4117(0, true, class755.field10544);
        this.method4096((byte) 47, 0, class755.field10544);
    }

    @OriginalMember(owner = "client!wga", name = "k", descriptor = "(B)V")
    private final void method4092(byte arg0) {
        if (class474.field6625 != this.field10298) {
            class447 var2 = this.field10298;
            this.field10298 = class474.field6625;
            if (var2.method2676(-48)) {
                this.method4136((byte) -121);
            }
            this.method4142(20794);
            this.field10249 = this.field10234;
            this.method4146(true);
            this.field10214 &= -25;
        }
        ++field10021;
        if (arg0 < 12) {
            field10133 = null;
        }
    }

    @OriginalMember(owner = "client!wga", name = "l", descriptor = "(B)V")
    private final void method4093(byte arg0) {
        ++field10042;
        this.field10226 = false;
        int var2 = -77 / ((arg0 - 78) / 48);
        this.method4158((byte) -58);
        if (class378.field5514 == this.field10298) {
            this.method4146(true);
        }
    }

    @OriginalMember(owner = "client!wga", name = "m", descriptor = "(I)V")
    private final void method4094(int arg0) {
        if (arg0 != 0) {
            this.field10216 = null;
        }
        if (class378.field5514 != this.field10298) {
            class447 var2 = this.field10298;
            this.field10298 = class378.field5514;
            if (!var2.method2676(-45)) {
                this.method4136((byte) 94);
            }
            this.method4158((byte) -113);
            this.field10249 = this.field10271;
            this.method4146(true);
            this.field10214 &= -8;
        }
        ++field10113;
    }

    @OriginalMember(owner = "client!wga", name = "n", descriptor = "(I)Lhaa;")
    public final class81 method4095(int arg0) {
        ++field10145;
        if (arg0 != 5) {
            this.method4120(false, (byte) 95);
        }
        return this.field10245[this.field10289];
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(BILkf;)V")
    public final void method4096(byte arg0, int arg1, class255 arg2) {
        if (arg0 != 47) {
            this.field10201 = -0.68323714F;
        }
        ++field10150;
        this.method2248(false, false, arg1, arg2, false);
    }

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "(IIIIII)V")
    public final void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field10029;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) arg3 - (float) arg1;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var8 *= var10;
            var9 = var7 * var10;
        }
        if (this.method4115((float) arg1, 0, (float) arg2 + var9, 0.0F, (float) arg3 + var8, 0.0F, (float) arg0)) {
            this.method4128(false);
            this.method4123(-28186, arg4);
            this.method4096((byte) 47, 0, class4.field31);
            this.method4117(0, true, class4.field31);
            this.method4076(112, arg5);
            this.method4153(5);
            this.method2261((byte) 45, false);
            this.method4132(true);
            this.method2261((byte) 48, true);
            this.method4117(0, true, class755.field10544);
            this.method4096((byte) 47, 0, class755.field10544);
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(BLdu;)V")
    public final void method4097(byte arg0, class357 arg1) {
        if (this.field10212[this.field10289] != arg1) {
            this.field10212[this.field10289] = arg1;
            if (arg1 != null) {
                arg1.method374((byte) -30);
            } else {
                this.method2265((byte) -107);
            }
            this.field10214 &= -2;
        }
        int var3 = 96 / ((arg0 - 20) / 42);
        ++field10015;
    }

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "()Lbca;")
    public final class661 method320() {
        ++field10059;
        return this.field10194;
    }

    @OriginalMember(owner = "client!wga", name = "A", descriptor = "(ILaa;II)V")
    public final void method271(int arg0, class487 arg1, int arg2, int arg3) {
        ++field10054;
        class393 var5 = (class393) arg1;
        class200 var6 = var5.field5773;
        this.method4105(81);
        this.method4097((byte) -47, var6);
        this.method4076(99, 1);
        this.method4112(class720.field9793, 114, class720.field9793);
        this.method4096((byte) 47, 0, class4.field31);
        this.method4123(-28186, arg0);
        this.field10188.method775(0.0F, (float) this.field10076, (float) this.field10045, (byte) -52);
        this.method4138(0);
        this.field10245[0].method775(1.0F, var6.method1002((byte) -46, (float) this.field10076), var6.method1004((float) this.field10045, 109), (byte) -37);
        this.field10245[0].method757(var6.method1002((byte) -52, (float) (-arg3)), false, 0.0F, var6.method1004((float) (-arg2), 94));
        this.field10227[0] = class620.field8440;
        this.method4130((byte) 127);
        this.method4149(-127);
        this.method4116(-8629);
        this.method4096((byte) 47, 0, class755.field10544);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lbh;IIII)Lka;")
    public final class472 method174(class37 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field10130;
        return new class750(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method280(Canvas arg0, int arg1, int arg2) {
        ++field10139;
        Object var4 = null;
        if (arg0 != null && this.field10039 != arg0) {
            if (this.field10128.containsKey(arg0)) {
                var4 = this.field10128.get(arg0);
            }
        } else {
            var4 = this.field10134;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method2278(12727, arg0, var4);
            if (this.field10024 == arg0) {
                this.method4140(false);
            }
        }
    }

    @OriginalMember(owner = "client!wga", name = "o", descriptor = "(I)V")
    public abstract void method2272(int arg0);

    @OriginalMember(owner = "client!wga", name = "t", descriptor = "()Z")
    public final boolean method272() {
        ++field10016;
        return false;
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(IZ)V")
    public final void method4098(int arg0, boolean arg1) {
        ++field10117;
        if (arg1 == !this.field10262) {
            this.field10262 = arg1;
            this.method2267((byte) -43);
        }
        if (arg0 != 9) {
            this.field10254 = null;
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILtr;)V")
    public final void method4099(int arg0, class296 arg1) {
        ++field10171;
        if (arg0 != -32) {
            this.field10256 = null;
        }
        this.field10227[this.field10289] = arg1;
        this.method4130((byte) 111);
    }

    @OriginalMember(owner = "client!wga", name = "u", descriptor = "()Z")
    public final boolean method238() {
        ++field10105;
        return true;
    }

    @OriginalMember(owner = "client!wga", name = "m", descriptor = "(B)Lhaa;")
    public final class81 method4100(byte arg0) {
        ++field10097;
        int var2 = 97 / ((arg0 - 35) / 63);
        return this.field10198;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lwq;II[FZIII)Lwfa;")
    public abstract class200 method2282(class169 arg0, int arg1, int arg2, float[] arg3, boolean arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!wga", name = "n", descriptor = "(B)V")
    private final void method4101(byte arg0) {
        ++field10158;
        if (this.field10257 != null) {
            this.field10257.method1312(-16252);
        }
        this.method2272(25644);
        if (arg0 <= 56) {
            this.field10290 = false;
        }
    }

    @OriginalMember(owner = "client!wga", name = "o", descriptor = "(B)V")
    public final void method4102(byte arg0) {
        int var2 = -76 % ((arg0 - 44) / 41);
        ++field10165;
        if (this.field10214 != 16) {
            this.method4094(0);
            this.method4090(true, true);
            this.method4120(true, (byte) 125);
            this.method4156(-32, true);
            this.method4076(123, 1);
            this.field10214 = 16;
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIZ)Lmi;")
    public final class496 method311(int arg0, int arg1, boolean arg2) {
        ++field10154;
        return new class232(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wga", name = "i", descriptor = "(Z)F")
    public abstract float method2301(boolean arg0);

    @OriginalMember(owner = "client!wga", name = "p", descriptor = "(I)V")
    public abstract void method2287(int arg0);

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lhj;II)V")
    private final void method4103(class569 arg0, int arg1, int arg2) {
        this.method2263(-96, this.field10307, 0);
        ++field10181;
        this.method2289(arg2 ^ arg2, this.field10311);
        this.method2280(arg1, 0, arg0, true);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IBILbaa;Lwq;)Lwfa;")
    public abstract class200 method2297(int arg0, byte arg1, int arg2, class523 arg3, class169 arg4);

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILnp;)V")
    public abstract void method2289(int arg0, class491 arg1);

    @OriginalMember(owner = "client!wga", name = "q", descriptor = "(I)I")
    public final int method4104(int arg0) {
        int var2 = -95 / ((arg0 - 7) / 57);
        ++field10031;
        return this.field10213;
    }

    @OriginalMember(owner = "client!wga", name = "K", descriptor = "([I)V")
    public final void method206(int[] arg0) {
        arg0[0] = this.field10220;
        ++field10175;
        arg0[3] = this.field10210;
        arg0[2] = this.field10297;
        arg0[1] = this.field10279;
    }

    @OriginalMember(owner = "client!wga", name = "r", descriptor = "(I)V")
    public final void method4105(int arg0) {
        int var2 = 51 / ((40 - arg0) / 34);
        if (~this.field10214 != -3) {
            this.method4092((byte) 76);
            this.method4090(true, false);
            this.method4107(false, true);
            this.method4120(false, (byte) 102);
            this.method4156(-32, false);
            this.method4073(false, false, -2, (byte) 43);
            this.field10214 = 2;
        }
        ++field10044;
    }

    @OriginalMember(owner = "client!wga", name = "y", descriptor = "()Lbca;")
    public final class661 method322() {
        ++field10191;
        return this.field10310;
    }

    @OriginalMember(owner = "client!wga", name = "C", descriptor = "(Z)V")
    public final void method306(boolean arg0) {
        this.field10238 = arg0;
        ++field10103;
        this.method2242((byte) -116);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZI)V")
    public final void method4106(boolean arg0, int arg1) {
        if (arg1 < 20) {
            this.method295((class266) null, -88);
        }
        if (arg0 == !this.field10224) {
            this.field10224 = arg0;
            this.method2244(true);
        }
        ++field10067;
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(ZZ)V")
    public final void method4107(boolean arg0, boolean arg1) {
        ++field10124;
        if (!this.field10259 != !arg0) {
            this.field10259 = arg0;
            this.method2273(-24);
            this.field10214 &= -8;
        }
        if (!arg1) {
            this.field10209 = 22;
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class487 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field10028;
    }

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "()Z")
    public final boolean method327() {
        ++field10187;
        return this.field10253[3].method731(-78);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(FI)V")
    public final void method4108(float arg0, int arg1) {
        ++field10138;
        if (this.field10269 != arg0) {
            this.field10269 = arg0;
            this.method4093((byte) 30);
        }
        int var3 = 72 % ((-8 - arg1) / 36);
    }

    @OriginalMember(owner = "client!wga", name = "j", descriptor = "(Z)V")
    public abstract void method2291(boolean arg0);

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(BZI)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method4109(byte arg0, boolean arg1, int arg2) {
        int var4 = -44 % ((-27 - arg0) / 52);
        ++field10030;
        return this.field10006.method3777(arg2, arg1);
    }

    @OriginalMember(owner = "client!wga", name = "s", descriptor = "(I)V")
    public static void method4110(int arg0) {
        field10133 = null;
        if (arg0 <= 99) {
            field10159 = -72;
        }
    }

    @OriginalMember(owner = "client!wga", name = "E", descriptor = "()I")
    public final int method339() {
        ++field10065;
        return this.field10193 + this.field10176 + this.field10177;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lbf;I)V")
    public abstract void method2260(class536 arg0, int arg1);

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IILwq;ZI[B)Lir;")
    public abstract class26 method2253(int arg0, int arg1, class169 arg2, boolean arg3, int arg4, byte[] arg5);

    @OriginalMember(owner = "client!wga", name = "KA", descriptor = "(IIII)V")
    public final void method303(int arg0, int arg1, int arg2, int arg3) {
        ++field10086;
        if (~arg0 >= -1 && ~(this.field10045 + -1) >= ~arg2 && arg1 <= 0 && this.field10076 - 1 <= arg3) {
            this.method305();
        } else {
            this.field10279 = ~arg1 <= -1 ? arg1 : 0;
            this.field10220 = ~arg0 > -1 ? 0 : arg0;
            this.field10210 = ~arg3 >= ~this.field10045 ? arg3 : 0;
            this.field10297 = arg2 > this.field10045 ? 0 : arg2;
            if (!this.field10323) {
                this.field10323 = true;
                this.method2274(1);
            }
            this.method2298(6259);
            this.method4129(-70);
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class281 method262(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field10125;
        return new class146(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "([BI)[B")
    public static final byte[] method4111(byte[] arg0, int arg1) {
        ++field10129;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class363.method2319(arg0, arg1, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "(I)V")
    public final void method221(int arg0) {
        ++field10022;
    }

    @OriginalMember(owner = "client!wga", name = "f", descriptor = "(I)V")
    public final void method312(int arg0) {
        ++field10116;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lsia;ILsia;)V")
    public final void method4112(class732 arg0, int arg1, class732 arg2) {
        ++field10073;
        boolean var4 = false;
        if (this.field10200[this.field10289] != arg2) {
            this.field10200[this.field10289] = arg2;
            this.method2264(10);
            var4 = true;
        }
        if (arg1 <= 97) {
            this.method2298(89);
        }
        if (this.field10206[this.field10289] != arg0) {
            this.field10206[this.field10289] = arg0;
            var4 = true;
            this.method2252(-100);
        }
        if (var4) {
            this.field10214 &= -30;
        }
    }

    @OriginalMember(owner = "client!wga", name = "h", descriptor = "(I)V")
    public final void method227(int arg0) {
        ++field10109;
        if (arg0 >= 128 && arg0 <= 1024) {
            if (this.field10251 != null) {
                this.field10251.method608(7271);
            }
            this.field10264 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IZZIII)V")
    private final void method4113(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg5 >= -26) {
            this.field10318 = null;
        }
        ++field10046;
        boolean var7 = arg2 & this.method327();
        if (!var7 && (arg3 == 4 || arg3 == 8 || ~arg3 == -10)) {
            arg3 = 2;
            arg4 = ~arg3 == -5 ? arg0 & 1 : 1;
            arg0 = 0;
        }
        if (~arg3 != -1 && arg1) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (this.field10270 != arg3) {
            if (this.field10270 != 0) {
                this.field10253[Integer.MAX_VALUE & this.field10270].method728((byte) 87);
            }
            if (~arg3 != -1) {
                this.field10257 = this.field10253[Integer.MAX_VALUE & arg3];
                this.field10257.method735(15192, arg1);
                this.field10257.method734(arg1, (byte) -103);
                this.field10257.method730(10756, arg0, arg4);
            } else {
                this.field10257 = null;
            }
            this.field10270 = arg3;
            this.field10275 = arg0;
            this.field10222 = arg4;
        } else if (this.field10270 != 0) {
            this.field10253[Integer.MAX_VALUE & this.field10270].method734(arg1, (byte) -103);
            if (~this.field10275 != ~arg0 || this.field10222 != arg4) {
                this.field10253[this.field10270 & Integer.MAX_VALUE].method730(10756, arg0, arg4);
                this.field10222 = arg4;
                this.field10275 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!wga", name = "za", descriptor = "(IIIII)V")
    public final void method248(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field10140;
        this.method4128(false);
        this.method4123(-28186, arg3);
        this.method4096((byte) 47, 0, class4.field31);
        this.method4117(0, true, class4.field31);
        this.method4076(83, arg4);
        this.field10188.method775(1.0F, (float) arg2, (float) arg2, (byte) -75);
        this.field10188.method752(arg0, arg1, 0);
        this.method4138(0);
        this.method2261((byte) 75, false);
        this.method2263(23, this.field10315, 0);
        this.method2289(0, this.field10304);
        this.method2280(256, 0, class187.field2805, true);
        this.method2261((byte) 41, true);
        this.method4117(0, true, class755.field10544);
        this.method4096((byte) 47, 0, class755.field10544);
    }

    @OriginalMember(owner = "client!wga", name = "i", descriptor = "()I")
    public final int method323() {
        ++field10135;
        return this.field10209;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method2268(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!wga", name = "la", descriptor = "()V")
    public final void method305() {
        this.field10297 = this.field10045;
        this.field10210 = this.field10076;
        ++field10151;
        this.field10279 = 0;
        this.field10220 = 0;
        if (this.field10323) {
            this.field10323 = false;
            this.method2274(1);
        }
        this.method4129(-95);
    }

    @OriginalMember(owner = "client!wga", name = "p", descriptor = "(B)I")
    public final int method4114(byte arg0) {
        if (arg0 != -126) {
            return -10;
        } else {
            ++field10087;
            return this.field10289;
        }
    }

    @OriginalMember(owner = "client!wga", name = "f", descriptor = "(II)V")
    public final void method349(int arg0, int arg1) {
        ++field10090;
        if (~this.field10209 != ~arg0 || ~this.field10268 != ~arg1) {
            this.field10268 = arg1;
            this.field10209 = arg0;
            this.method4084((byte) 19);
            this.method4093((byte) 127);
            this.method4101((byte) 57);
        }
    }

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "(IIIIII)Lwh;")
    public final class149 method253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field10007;
        return new class271(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(FIFFFFF)Z")
    private final boolean method4115(float arg0, int arg1, float arg2, float arg3, float arg4, float arg5, float arg6) {
        if (arg1 != 0) {
            return true;
        } else {
            ++field10180;
            Buffer var8 = this.field10317.method880(true, 26775);
            if (var8 == null) {
                return false;
            } else {
                Stream var9 = this.method4122(var8, 9179);
                if (Stream.method3789()) {
                    var9.method3780(arg6);
                    var9.method3780(arg0);
                    var9.method3780(arg3);
                    var9.method3780(arg2);
                    var9.method3780(arg4);
                    var9.method3780(arg5);
                } else {
                    var9.method3792(arg6);
                    var9.method3792(arg0);
                    var9.method3792(arg3);
                    var9.method3792(arg2);
                    var9.method3792(arg4);
                    var9.method3792(arg5);
                }
                var9.method3784();
                return this.field10317.method882(arg1 ^ 6331);
            }
        }
    }

    @OriginalMember(owner = "client!wga", name = "t", descriptor = "(I)V")
    public final void method4116(int arg0) {
        if (this.field10227[this.field10289] != class161.field2578) {
            this.field10227[this.field10289] = class161.field2578;
            this.field10245[this.field10289].method745();
            this.method4130((byte) 95);
        }
        if (arg0 == -8629) {
            ++field10011;
        }
    }

    @OriginalMember(owner = "client!wga", name = "ra", descriptor = "(IIII)V")
    public final void method277(int arg0, int arg1, int arg2, int arg3) {
        this.field10293 = arg2;
        this.field10291 = arg3;
        this.field10213 = arg1;
        ++field10178;
        this.field10274 = true;
        this.field10276 = arg0;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lbaa;Lwq;B)Z")
    public abstract boolean method2249(class523 arg0, class169 arg1, byte arg2);

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Ljava/lang/Object;BLjava/awt/Canvas;)V")
    public abstract void method2246(Object arg0, byte arg1, Canvas arg2);

    @OriginalMember(owner = "client!wga", name = "q", descriptor = "(B)V")
    public void method2266(byte arg0) {
        if (arg0 < 45) {
            this.field10288 = -0.73899394F;
        }
        ++field10096;
        this.method4139((byte) 103);
    }

    @OriginalMember(owner = "client!wga", name = "u", descriptor = "(I)V")
    public abstract void method2273(int arg0);

    @OriginalMember(owner = "client!wga", name = "xa", descriptor = "(F)V")
    public final void method228(float arg0) {
        if (this.field10207 != arg0) {
            this.field10207 = arg0;
            this.field10038.setAmbient(arg0);
            this.method2256(0);
            this.method2255((byte) 101);
        }
        ++field10094;
    }

    @OriginalMember(owner = "client!wga", name = "r", descriptor = "(B)V")
    public abstract void method2255(byte arg0);

    @OriginalMember(owner = "client!wga", name = "k", descriptor = "()Z")
    public final boolean method199() {
        ++field10027;
        return true;
    }

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "(I)V")
    public final void method249(int arg0) {
        ++field10068;
    }

    @OriginalMember(owner = "client!wga", name = "f", descriptor = "()Z")
    public final boolean method193() {
        ++field10168;
        return true;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field10146;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IZLkf;)V")
    public final void method4117(int arg0, boolean arg1, class255 arg2) {
        this.method2288(arg2, arg0, (byte) 80, false);
        ++field10155;
        if (!arg1) {
            this.method259((Canvas) null, -42, 69);
        }
    }

    @OriginalMember(owner = "client!wga", name = "v", descriptor = "(I)V")
    public static final void method4118(int arg0) {
        class488.field6758.method999(0);
        if (arg0 >= -58) {
            method4080(43, 63, -121, -1, 72, 77, -11, 22);
        }
        ++field10132;
    }

    @OriginalMember(owner = "client!wga", name = "T", descriptor = "(IIII)V")
    public final void method279(int arg0, int arg1, int arg2, int arg3) {
        ++field10157;
        boolean var5 = false;
        if (this.field10220 < arg0) {
            var5 = true;
            this.field10220 = arg0;
        }
        if (~arg2 > ~this.field10297) {
            this.field10297 = arg2;
            var5 = true;
        }
        if (~arg1 < ~this.field10279) {
            var5 = true;
            this.field10279 = arg1;
        }
        if (~arg3 > ~this.field10210) {
            this.field10210 = arg3;
            var5 = true;
        }
        if (var5) {
            if (!this.field10323) {
                this.field10323 = true;
                this.method2274(1);
            }
            this.method2298(6259);
            this.method4129(-128);
        }
    }

    @OriginalMember(owner = "client!wga", name = "s", descriptor = "(B)Lhaa;")
    public final class81 method4119(byte arg0) {
        int var2 = 62 / ((arg0 - -58) / 33);
        ++field10055;
        return this.field10197;
    }

    @OriginalMember(owner = "client!wga", name = "w", descriptor = "(I)V")
    public abstract void method2298(int arg0);

    @OriginalMember(owner = "client!wga", name = "r", descriptor = "()Z")
    public final boolean method263() {
        ++field10170;
        return true;
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(ZI)Ltc;")
    public abstract class353 method2300(boolean arg0, int arg1);

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZB)V")
    public final void method4120(boolean arg0, byte arg1) {
        if (arg1 <= 10) {
            this.field10088 = null;
        }
        if (arg0 == !this.field10278) {
            this.field10278 = arg0;
            this.method2287(3);
            this.field10214 &= -32;
        }
        ++field10186;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "([FIILwq;IZ)Lwfa;")
    public final class200 method4121(float[] arg0, int arg1, int arg2, class169 arg3, int arg4, boolean arg5) {
        int var7 = 97 / ((arg4 - -38) / 57);
        ++field10166;
        return this.method2282(arg3, arg1, 0, arg0, arg5, 0, 2, arg2);
    }

    @OriginalMember(owner = "client!wga", name = "x", descriptor = "(I)V")
    public abstract void method2295(int arg0);

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Ljaclib/memory/Buffer;I)Ljaclib/memory/Stream;")
    public final Stream method4122(Buffer arg0, int arg1) {
        ++field10162;
        this.field10202.method3782(arg0);
        if (arg1 != 9179) {
            this.field10207 = -1.2765714F;
        }
        return this.field10202;
    }

    @OriginalMember(owner = "client!wga", name = "EA", descriptor = "(IIII)V")
    public final void method196(int arg0, int arg1, int arg2, int arg3) {
        ++field10023;
        if (!this.field10274) {
            throw new RuntimeException("");
        } else {
            this.field10293 = arg2;
            this.field10276 = arg0;
            this.field10291 = arg3;
            this.field10213 = arg1;
            if (this.field10267) {
                this.field10253[3].method3636(102);
                this.field10253[3].method1312(-16252);
            }
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "([I)V")
    public final void method269(int[] arg0) {
        arg0[1] = this.field10076;
        arg0[0] = this.field10045;
        ++field10190;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lwh;)V")
    public final void method177(class149 arg0) {
        this.field10285 = (class319) arg0;
        ++field10064;
    }

    @OriginalMember(owner = "client!wga", name = "j", descriptor = "(II)V")
    public final void method4123(int arg0, int arg1) {
        if (~this.field10233 != ~arg1) {
            this.field10233 = arg1;
            this.method2294(-120);
        }
        if (arg0 != -28186) {
            this.field10300 = 0.24125333F;
        }
        ++field10112;
    }

    @OriginalMember(owner = "client!wga", name = "L", descriptor = "(III)V")
    public final void method172(int arg0, int arg1, int arg2) {
        ++field10192;
        if (~this.field10258 != ~arg0 || this.field10205 != arg1 || ~this.field10219 != ~arg2) {
            this.field10258 = arg0;
            this.field10219 = arg2;
            this.field10205 = arg1;
            this.method4101((byte) 119);
            this.method2267((byte) -72);
        }
    }

    @OriginalMember(owner = "client!wga", name = "y", descriptor = "(I)V")
    private final void method4124(int arg0) {
        ++field10149;
        if (arg0 != -8) {
            this.method193();
        }
        if (class27.field744 != this.field10298) {
            class447 var2 = this.field10298;
            this.field10298 = class27.field744;
            if (!var2.method2676(-90)) {
                this.method4136((byte) 60);
            }
            this.method4131((byte) 118);
            this.field10249 = this.field10266;
            this.method4146(true);
            this.field10214 &= -8;
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lwda;B)V")
    public static final void method4125(class639 arg0, byte arg1) {
        ++field10142;
        class472.field6610 = arg0;
        if (arg1 != 13) {
            method4111((byte[]) null, -3);
        }
    }

    @OriginalMember(owner = "client!wga", name = "k", descriptor = "(II)V")
    public final void method4126(int arg0, int arg1) {
        if (this.field10289 != arg0) {
            this.field10289 = arg0;
            this.method2291(false);
        }
        if (arg1 != -4382) {
            this.field10220 = 67;
        }
        ++field10075;
    }

    @OriginalMember(owner = "client!wga", name = "z", descriptor = "(I)V")
    public abstract void method2292(int arg0);

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Z)V")
    public final void method330(boolean arg0) {
        ++field10182;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IILhj;Z)V")
    public abstract void method2280(int arg0, int arg1, class569 arg2, boolean arg3);

    @OriginalMember(owner = "client!wga", name = "DA", descriptor = "(IIII)V")
    public final void method179(int arg0, int arg1, int arg2, int arg3) {
        this.field10244 = arg1;
        this.field10248 = arg3;
        ++field10123;
        this.field10208 = arg0;
        this.field10243 = arg2;
        this.method4093((byte) 127);
        this.method4084((byte) 19);
        this.method4148((byte) -118);
        this.method4129(-82);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "([[IZII)Lnj;")
    public abstract class247 method2281(int[][] arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wga", name = "t", descriptor = "(B)V")
    public abstract void method2247(byte arg0);

    @OriginalMember(owner = "client!wga", name = "u", descriptor = "(B)V")
    public final void method4127(byte arg0) {
        ++field10060;
        if (arg0 != -42) {
            this.method281((int[]) null, -98, 55, 15, 73, false);
        }
        Hashtable var2 = new Hashtable();
        if (this.field10128 != null && !this.field10128.isEmpty()) {
            Enumeration var3 = this.field10128.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method2268(-1, var4));
            }
        }
        this.field10128 = var2;
        this.method4083(false);
        this.method4075((byte) -87);
        this.method4137((byte) -107);
        this.field10250.method2962((byte) 124, this);
    }

    @OriginalMember(owner = "client!wga", name = "k", descriptor = "(Z)V")
    private final void method4128(boolean arg0) {
        if (~this.field10214 != -2) {
            this.method4092((byte) 24);
            this.method4090(true, false);
            this.method4107(false, true);
            this.method4120(false, (byte) 55);
            this.method4156(-32, false);
            this.method4073(false, false, -2, (byte) 112);
            this.method4144(!arg0, 1);
            this.method4097((byte) -47, this.field10261);
            this.field10214 = 1;
        }
        if (arg0) {
            this.method196(-102, -47, -121, -51);
        }
        ++field10095;
    }

    @OriginalMember(owner = "client!wga", name = "r", descriptor = "(IIIIIII)I")
    public final int method333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field10074;
        int var8 = 0;
        float var9 = (float) arg2 * this.field10194.field1456 + (float) arg0 * this.field10194.field1476 + (float) arg1 * this.field10194.field1431 + this.field10194.field1464;
        float var10 = (float) arg5 * this.field10194.field1456 + (float) arg3 * this.field10194.field1476 + (float) arg4 * this.field10194.field1431 + this.field10194.field1464;
        if ((float) this.field10209 > var9 && var10 < (float) this.field10209) {
            var8 |= 16;
        } else if ((float) this.field10268 < var9 && (float) this.field10268 < var10) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field10194.field1444 + (float) arg0 * this.field10194.field1451 + (float) arg1 * this.field10194.field1440 + this.field10194.field1469) * (float) this.field10243 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field10194.field1444 + (float) arg3 * this.field10194.field1451 + (float) arg4 * this.field10194.field1440 + this.field10194.field1469) * (float) this.field10243 / (float) arg6);
        if (this.field10240 > (float) var11 && (float) var12 < this.field10240) {
            var8 |= 1;
        } else if (this.field10272 < (float) var11 && (float) var12 > this.field10272) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field10194.field1472 + (float) arg0 * this.field10194.field1448 + (float) arg1 * this.field10194.field1462 + this.field10194.field1450) * (float) this.field10248 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field10194.field1472 + (float) arg3 * this.field10194.field1448 + (float) arg4 * this.field10194.field1462 + this.field10194.field1450) * (float) this.field10248 / (float) arg6);
        if ((float) var13 < this.field10217 && this.field10217 > (float) var14) {
            var8 |= 4;
        } else if (this.field10299 < (float) var13 && this.field10299 < (float) var14) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!wga", name = "A", descriptor = "(I)V")
    private final void method4129(int arg0) {
        ++field10000;
        if (arg0 > -50) {
            field10115 = 12;
        }
        this.field10217 = (float) (this.field10279 - this.field10244);
        this.field10240 = (float) (-this.field10208 + this.field10220);
        this.field10299 = (float) (-this.field10244 + this.field10210);
        this.field10272 = (float) (-this.field10208 + this.field10297);
    }

    @OriginalMember(owner = "client!wga", name = "v", descriptor = "(B)V")
    private final void method4130(byte arg0) {
        this.method2262(1);
        if (arg0 < 80) {
            this.field10041 = null;
        }
        ++field10161;
        if (this.field10257 != null) {
            this.field10257.method733(10425);
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method259(Canvas arg0, int arg1, int arg2) {
        ++field10069;
        if (this.field10039 == arg0) {
            throw new RuntimeException();
        } else if (!this.field10128.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method2268(-1, arg0);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field10128.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wga", name = "x", descriptor = "()I")
    public final int method318() {
        ++field10049;
        return this.field10252 + -2;
    }

    @OriginalMember(owner = "client!wga", name = "w", descriptor = "(B)V")
    private final void method4131(byte arg0) {
        if (arg0 < 81) {
            this.method2290(-113, false);
        }
        if (!this.field10211) {
            float[] var2 = this.field10266;
            float var3 = (float) (-this.field10208 * this.field10209) / (float) this.field10243;
            float var4 = (float) ((-this.field10208 + this.field10045) * this.field10209) / (float) this.field10243;
            float var5 = (float) (this.field10244 * this.field10209) / (float) this.field10248;
            float var6 = (float) ((-this.field10076 + this.field10244) * this.field10209) / (float) this.field10248;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field10209 * 2.0F;
                var2[13] = 0.0F;
                var2[3] = 0.0F;
                var2[2] = 0.0F;
                var2[11] = -1.0F;
                var2[7] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[1] = 0.0F;
                var2[12] = 0.0F;
                var2[14] = this.field10242 = (float) (this.field10268 * this.field10209) / (float) (this.field10209 - this.field10268);
                var2[0] = var7 / (-var3 + var4);
                var2[15] = 0.0F;
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[10] = this.field10280 = (float) this.field10268 / (float) (-this.field10268 + this.field10209);
                var2[4] = 0.0F;
                var2[6] = 0.0F;
            } else {
                var2[12] = 0.0F;
                var2[0] = 1.0F;
                var2[13] = 0.0F;
                var2[4] = 0.0F;
                var2[3] = 0.0F;
                var2[10] = 1.0F;
                var2[15] = 1.0F;
                var2[9] = 0.0F;
                var2[14] = 0.0F;
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[11] = 0.0F;
                var2[6] = 0.0F;
                var2[7] = 0.0F;
                var2[8] = 0.0F;
                var2[5] = 1.0F;
            }
            this.method4135(-1568);
            this.field10211 = true;
        }
        ++field10057;
    }

    @OriginalMember(owner = "client!wga", name = "l", descriptor = "(Z)V")
    private final void method4132(boolean arg0) {
        ++field10003;
        this.method2263(-128, this.field10317, 0);
        this.method2289(0, this.field10319);
        this.method2280(1, 0, class198.field2902, arg0);
    }

    @OriginalMember(owner = "client!wga", name = "Y", descriptor = "()[I")
    public final int[] method188() {
        ++field10001;
        return new int[] { this.field10208, this.field10244, this.field10243, this.field10248 };
    }

    @OriginalMember(owner = "client!wga", name = "x", descriptor = "(B)V")
    private final void method4133(byte arg0) {
        if (arg0 < 2) {
            this.method4158((byte) 23);
        }
        ++field10184;
        this.field10203 = (float) this.field10268;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIIII)V")
    public final void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field10056;
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(IIIIZ)Lmi;")
    public final class496 method231(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field10107;
        class232 var6 = new class232(this, arg2, arg3, arg4);
        var6.method1193(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(BI)V")
    public final void method4134(byte arg0, int arg1) {
        this.method4123(-28186, arg0 | arg0 << 8 | arg0 << 16 | arg0 << 24);
        ++field10110;
        if (arg1 > -103) {
            this.method4119((byte) 51);
        }
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(BI)V")
    public abstract void method2259(byte arg0, int arg1);

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lmda;I)V")
    public final void method295(class266 arg0, int arg1) {
        this.field10250.method2963(this, arg0, arg1, 0);
        ++field10082;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lrh;Z)Lmi;")
    public final class496 method356(class267 arg0, boolean arg1) {
        ++field10092;
        class496 var10;
        if (~arg0.field3784 != -1 && arg0.field3778 != 0) {
            int[] var3 = new int[arg0.field3784 * arg0.field3778];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field3777 == null) {
                for (int var6 = 0; ~arg0.field3778 < ~var6; ++var6) {
                    for (int var7 = 0; var7 < arg0.field3784; ++var7) {
                        int var8 = arg0.field3779[255 & arg0.field3781[var4++]];
                        var3[var5++] = var8 != 0 ? class418.method2577(var8, -16777216) : 0;
                    }
                }
            } else {
                for (int var9 = 0; var9 < arg0.field3778; ++var9) {
                    for (int var11 = 0; arg0.field3784 > var11; ++var11) {
                        var3[var5++] = class418.method2577(arg0.field3779[class263.method1762(arg0.field3781[var4], 255)], arg0.field3777[var4] << 24);
                        ++var4;
                    }
                }
            }
            var10 = this.method621(arg0.field3784, var3, (byte) 94, 0, arg0.field3784, arg0.field3778);
        } else {
            var10 = this.method621(1, new int[1], (byte) 94, 0, 1, 1);
        }
        var10.method1615(arg0.field3785, arg0.field3782, arg0.field3780, arg0.field3783);
        return var10;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class487 arg6, int arg7, int arg8) {
        ++field10032;
    }

    @OriginalMember(owner = "client!wga", name = "l", descriptor = "()V")
    public final void method307() {
        ++field10002;
        if (this.field10251 != null) {
            this.field10251.method608(7271);
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Ljava/awt/Canvas;ILjava/lang/Object;)V")
    public abstract void method2293(Canvas arg0, int arg1, Object arg2);

    @OriginalMember(owner = "client!wga", name = "j", descriptor = "()Lbca;")
    public final class661 method290() {
        ++field10174;
        return new class81();
    }

    @OriginalMember(owner = "client!wga", name = "B", descriptor = "(I)V")
    private final void method4135(int arg0) {
        this.field10266[14] = this.field10242;
        ++field10136;
        if (arg0 == -1568) {
            this.field10266[10] = this.field10280;
            this.field10283 = (this.field10266[14] - (float) this.field10268) / this.field10266[10];
        }
    }

    @OriginalMember(owner = "client!wga", name = "y", descriptor = "(B)V")
    private final void method4136(byte arg0) {
        int var2 = -106 / ((-8 - arg0) / 33);
        ++field10172;
        this.field10235 = false;
        if (this.field10257 != null) {
            this.field10257.method1315(false);
        }
        this.method2292(12);
    }

    @OriginalMember(owner = "client!wga", name = "z", descriptor = "(B)V")
    private final void method4137(byte arg0) {
        ++field10036;
        this.field10315 = this.method2300(false, 16711680);
        if (arg0 <= -97) {
            this.field10315.method879(3096, (byte) 126, 12);
            for (int var2 = 0; var2 < 4; ++var2) {
                Buffer var3 = this.field10315.method880(true, 26775);
                if (var3 != null) {
                    Stream var4 = this.method4122(var3, 9179);
                    var4.method3780(0.0F);
                    var4.method3780(0.0F);
                    var4.method3780(0.0F);
                    for (int var5 = 0; var5 <= 256; ++var5) {
                        double var6 = (double) (var5 * 2) * 3.141592653589793D / 256.0D;
                        float var8 = (float) Math.cos(var6);
                        float var9 = (float) Math.sin(var6);
                        if (!Stream.method3789()) {
                            var4.method3792(var9);
                            var4.method3792(var8);
                            var4.method3792(0.0F);
                        } else {
                            var4.method3780(var9);
                            var4.method3780(var8);
                            var4.method3780(0.0F);
                        }
                    }
                    var4.method3784();
                    if (this.field10315.method882(6331)) {
                        break;
                    }
                }
            }
            this.field10304 = this.method2243(0, new class273[] { new class273(class11.field149) });
        }
    }

    @OriginalMember(owner = "client!wga", name = "C", descriptor = "(I)V")
    public final void method4138(int arg0) {
        this.field10183 = false;
        ++field10078;
        this.method4088(1);
        if (arg0 != 0) {
            this.field10256 = null;
        }
    }

    @OriginalMember(owner = "client!wga", name = "A", descriptor = "(B)V")
    private final void method4139(byte arg0) {
        ++field10189;
        this.method2256(0);
        this.method2270(true);
        this.method2273(106);
        this.method2277((byte) 53);
        if (arg0 != 103) {
            this.method2290(-124, true);
        }
        this.method2295(0);
        this.method2255((byte) 101);
        this.method2244(true);
        this.method2287(arg0 + -100);
        this.method2242((byte) -116);
        this.method2267((byte) -117);
        this.method2272(25644);
        this.method2285(4);
        this.method2299(0);
        this.method2296((byte) 100);
        for (int var2 = this.field10204 + -1; ~var2 <= -1; --var2) {
            this.method4126(var2, arg0 ^ -4475);
            this.method2264(arg0 ^ 109);
            this.method2252(-101);
            this.method4116(arg0 + -8732);
        }
        this.method2294(-127);
        this.method2275((byte) -33);
        this.method2250(true);
        this.method2247((byte) -102);
        this.method2292(12);
    }

    @OriginalMember(owner = "client!wga", name = "m", descriptor = "(Z)V")
    private final void method4140(boolean arg0) {
        if (this.field10024 == null) {
            this.field10072 = this.field10101 = 1;
        } else {
            Dimension var2 = this.field10024.getSize();
            this.field10101 = var2.height;
            this.field10072 = var2.width;
        }
        if (arg0) {
            this.field10128 = null;
        }
        ++field10147;
        this.field10076 = this.field10101;
        this.field10045 = this.field10072;
        this.method4141(1);
        this.method4084((byte) 19);
        this.method4093((byte) 126);
        this.method2275((byte) -33);
        this.method4129(-71);
        this.method4148((byte) -126);
        this.method305();
    }

    @OriginalMember(owner = "client!wga", name = "D", descriptor = "(I)V")
    private final void method4141(int arg0) {
        ++field10019;
        if (arg0 != 1) {
            this.field10202 = null;
        }
        this.field10241 = false;
        if (class474.field6625 == this.field10298) {
            this.method4142(arg0 + 20793);
            this.method4146(true);
        }
    }

    @OriginalMember(owner = "client!wga", name = "P", descriptor = "(IIIII)V")
    public final void method338(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field10127;
        this.method234(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!wga", name = "E", descriptor = "(I)V")
    private final void method4142(int arg0) {
        if (arg0 == 20794) {
            if (!this.field10241) {
                float[] var2 = this.field10234;
                if (~this.field10045 != -1 && this.field10076 != 0) {
                    var2[9] = 0.0F;
                    var2[12] = -1.0F;
                    var2[2] = 0.0F;
                    var2[0] = 2.0F / (float) this.field10045;
                    var2[4] = 0.0F;
                    var2[15] = 1.0F;
                    var2[13] = 1.0F;
                    var2[6] = 0.0F;
                    var2[3] = 0.0F;
                    var2[10] = 0.5F;
                    var2[8] = 0.0F;
                    var2[1] = 0.0F;
                    var2[14] = 0.5F;
                    var2[7] = 0.0F;
                    var2[5] = -2.0F / (float) this.field10076;
                    var2[11] = 0.0F;
                } else {
                    var2[3] = 0.0F;
                    var2[12] = 0.0F;
                    var2[6] = 0.0F;
                    var2[9] = 0.0F;
                    var2[11] = 0.0F;
                    var2[15] = 1.0F;
                    var2[1] = 0.0F;
                    var2[8] = 0.0F;
                    var2[2] = 0.0F;
                    var2[14] = 0.0F;
                    var2[5] = 1.0F;
                    var2[13] = 0.0F;
                    var2[7] = 0.0F;
                    var2[10] = 1.0F;
                    var2[4] = 0.0F;
                    var2[0] = 1.0F;
                }
                this.field10241 = true;
            }
            ++field10084;
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method341(Canvas arg0) {
        this.field10134 = null;
        ++field10050;
        this.field10024 = null;
        if (arg0 != null && this.field10039 != arg0) {
            if (this.field10128.containsKey(arg0)) {
                this.field10134 = this.field10128.get(arg0);
                this.field10024 = arg0;
            }
        } else {
            this.field10134 = this.field10033;
            this.field10024 = this.field10039;
        }
        if (this.field10024 != null && this.field10134 != null) {
            this.method2246(this.field10134, (byte) 99, this.field10024);
            this.method4140(false);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wga", name = "F", descriptor = "(I)V")
    public abstract void method2264(int arg0);

    @OriginalMember(owner = "client!wga", name = "G", descriptor = "(I)V")
    public abstract void method2274(int arg0);

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(I)V")
    public void method233(int arg0) {
        if (this.field10251 != null) {
            this.field10251.method609(-16130);
        }
        ++field10173;
        this.field10260 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field10160;
        float var10 = (float) arg2 - (float) arg0;
        float var11 = (float) arg3 - (float) arg1;
        float var12;
        if (var10 == 0.0F && var11 == 0.0F) {
            var12 = 1.0F;
        } else {
            float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            var12 = var10 * var13;
            var11 *= var13;
        }
        this.method4128(false);
        this.method4123(-28186, arg4);
        this.method4096((byte) 47, 0, class4.field31);
        this.method4117(0, true, class4.field31);
        this.method4076(94, arg5);
        this.method4153(5);
        this.method2261((byte) 86, false);
        int var14 = arg8 % (arg6 + arg7);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (arg6 >= var14) {
            var20 = (float) (-var14 + arg6) * var11;
            var19 = (float) (-var14 + arg6) * var12;
        } else {
            var18 = (float) (arg6 - -arg7 + -var14) * var11;
            var17 = (float) (arg6 + arg7 - var14) * var12;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (~arg0 > ~arg2) {
                if (var21 > (float) arg2) {
                    break;
                }
                if ((float) arg2 < var19 + var21) {
                    var19 = (float) arg2 - var21;
                }
            } else {
                if (var21 < (float) arg2) {
                    break;
                }
                if ((float) arg2 > var19 + var21) {
                    var19 = (float) arg2 - var21;
                }
            }
            if (arg1 < arg3) {
                if ((float) arg3 < var22) {
                    break;
                }
                if (var20 + var22 > (float) arg3) {
                    var20 = (float) arg3 - var22;
                }
            } else {
                if (var22 < (float) arg3) {
                    break;
                }
                if (var20 + var22 < (float) arg3) {
                    var20 = (float) arg3 - var22;
                }
            }
            if (!this.method4115(var22, 0, var19 + var21, 0.0F, var20 + var22, 0.0F, var21)) {
                return;
            }
            this.method4132(true);
            var22 += var20 + var24;
            var21 += var19 + var23;
            var19 = var15;
            var20 = var16;
        }
        this.method2261((byte) 88, true);
        this.method4117(0, true, class755.field10544);
        this.method4096((byte) 47, 0, class755.field10544);
    }

    @OriginalMember(owner = "client!wga", name = "pa", descriptor = "()V")
    public final void method332() {
        ++field10061;
        this.field10274 = false;
    }

    @OriginalMember(owner = "client!wga", name = "n", descriptor = "(Z)V")
    public final void method4143(boolean arg0) {
        if (arg0) {
            this.method285();
        }
        ++field10025;
        Enumeration var2 = this.field10128.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method2293(var3, 1, this.field10128.get(var3));
        }
        this.field10307.method878(23315);
        this.field10317.method878(23315);
        this.field10315.method878(23315);
        this.field10312.method4186(-23755);
        this.field10308.method4186(-23755);
        this.field10301.method4186(-23755);
        this.field10313.method4186(-23755);
        this.field10303.method4186(-23755);
        this.field10250.method2967(-122);
        this.field10309.method878(23315);
    }

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "(ZI)V")
    public final void method4144(boolean arg0, int arg1) {
        if (arg1 != 1) {
            if (~arg1 != -1) {
                if (~arg1 == -3) {
                    this.method4112(class720.field9793, 117, class295.field4131);
                } else if (arg1 == 3) {
                    this.method4112(class534.field7355, 111, class72.field1302);
                } else if (~arg1 == -5) {
                    this.method4112(class54.field1103, 126, class54.field1103);
                }
            } else {
                this.method4112(class534.field7355, 120, class534.field7355);
            }
        } else {
            this.method4112(class720.field9793, 127, class720.field9793);
        }
        ++field10148;
        if (!arg0) {
            this.field10266 = null;
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZZILkf;Z)V")
    public abstract void method2248(boolean arg0, boolean arg1, int arg2, class255 arg3, boolean arg4);

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILtc;I)V")
    public abstract void method2263(int arg0, class353 arg1, int arg2);

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(BZ)V")
    public abstract void method2261(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!wga", name = "U", descriptor = "(IIIII)V")
    public final void method226(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method234(arg0, arg1, arg0 - -arg2, arg1, arg3, arg4);
        ++field10040;
    }

    @OriginalMember(owner = "client!wga", name = "o", descriptor = "(Z)V")
    public final void method4145(boolean arg0) {
        if (this.field10214 != 4) {
            this.method4092((byte) 49);
            this.method4090(true, false);
            this.method4107(false, arg0);
            this.method4120(false, (byte) 108);
            this.method4156(-32, false);
            this.method4073(false, false, -2, (byte) 35);
            this.method4076(120, 1);
            this.method4144(true, 0);
            this.field10214 = 4;
        }
        if (!arg0) {
            this.field10314 = null;
        }
        ++field10100;
    }

    @OriginalMember(owner = "client!wga", name = "H", descriptor = "(I)V")
    public abstract void method2256(int arg0);

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method245(Canvas arg0) {
        ++field10020;
        if (this.field10039 == arg0) {
            throw new RuntimeException();
        } else if (this.field10128.containsKey(arg0)) {
            this.method2293(arg0, 1, this.field10128.get(arg0));
            this.field10128.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "([IIIIIZ)Lmi;")
    public final class496 method281(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field10058;
        return new class232(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wga", name = "p", descriptor = "(Z)V")
    private final void method4146(boolean arg0) {
        this.method2250(arg0);
        ++field10063;
        if (this.field10257 != null) {
            this.field10257.method1314(-14775);
        }
    }

    @OriginalMember(owner = "client!wga", name = "B", descriptor = "(B)V")
    public final void method4147(byte arg0) {
        this.field10245 = new class81[this.field10204];
        this.field10212 = new class357[this.field10204];
        this.field10200 = new class732[this.field10204];
        this.field10206 = new class732[this.field10204];
        this.field10227 = new class296[this.field10204];
        ++field10004;
        for (int var2 = 0; ~var2 > ~this.field10204; ++var2) {
            this.field10206[var2] = class534.field7355;
            this.field10200[var2] = class534.field7355;
            this.field10227[var2] = class161.field2578;
            this.field10245[var2] = new class81();
        }
        this.field10246 = new class669[this.field10252 + -2];
        this.field10261 = this.method2297(1, (byte) -84, 1, class523.field7249, class746.field10332);
        this.method270(new class221(262144));
        this.field10318 = this.method2243(0, new class273[] { new class273(new class11[] { class11.field149, class11.field154 }) });
        this.field10316 = this.method2243(arg0 ^ 26, new class273[] { new class273(new class11[] { class11.field149, class11.field152 }) });
        this.field10322 = this.method2243(0, new class273[] { new class273(class11.field149), new class273(class11.field152), new class273(class11.field154), new class273(class11.field151) });
        this.field10305 = this.method2243(0, new class273[] { new class273(class11.field149), new class273(class11.field152), new class273(class11.field154) });
        this.field10320 = new class750(this, 0, 0, false, false);
        this.field10312 = new class750(this, 0, 0, true, true);
        this.field10306 = new class750(this, 0, 0, false, false);
        this.field10308 = new class750(this, 0, 0, true, true);
        this.field10314 = new class750(this, 0, 0, false, false);
        this.field10301 = new class750(this, 0, 0, true, true);
        this.field10302 = new class750(this, 0, 0, false, false);
        this.field10313 = new class750(this, 0, 0, true, true);
        this.field10321 = new class750(this, 0, 0, false, false);
        this.field10303 = new class750(this, 0, 0, true, true);
        this.field10250 = new class504(this);
        this.field10309 = this.method2290(-28633, true);
        this.method4127((byte) -42);
        this.field10051 = new class537(this);
        this.field10253[1] = this.method2283(1, (byte) -103);
        this.field10253[2] = this.method2283(2, (byte) -65);
        this.field10253[4] = this.method2283(4, (byte) -73);
        this.field10253[5] = this.method2283(5, (byte) -101);
        if (arg0 != 26) {
            this.field10318 = null;
        }
        this.field10253[6] = this.method2283(6, (byte) -60);
        this.field10253[7] = this.method2283(7, (byte) -100);
        this.field10253[3] = this.method2283(3, (byte) -63);
        this.field10253[8] = this.method2283(8, (byte) -60);
        this.field10253[9] = this.method2283(9, (byte) -78);
        if (!this.field10253[2].method731(-58)) {
            this.field10253[2] = this.method2283(0, (byte) -74);
        }
        if (!this.field10253[4].method731(-74)) {
            this.field10253[4] = this.field10253[2];
        }
        if (!this.field10253[8].method731(-116)) {
            this.field10253[8] = this.field10253[4];
        }
        if (!this.field10253[9].method731(-104)) {
            this.field10253[9] = this.field10253[8];
        }
        this.method2266((byte) 52);
        this.method305();
        this.method252();
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(ZLwq;Lbaa;)Z")
    public abstract boolean method2279(boolean arg0, class169 arg1, class523 arg2);

    @OriginalMember(owner = "client!wga", name = "C", descriptor = "(B)V")
    public final void method4148(byte arg0) {
        if (class293.field4101 != this.field10298) {
            class447 var2 = this.field10298;
            this.field10298 = class293.field4101;
            if (var2.method2676(-116)) {
                this.method4136((byte) -100);
            }
            this.field10214 &= -32;
            this.field10249 = this.field10225;
        }
        ++field10091;
        if (arg0 > -106) {
            this.field10260 = 6;
        }
    }

    @OriginalMember(owner = "client!wga", name = "H", descriptor = "(III[I)V")
    public final void method289(int arg0, int arg1, int arg2, int[] arg3) {
        ++field10126;
        float var5 = this.field10194.method776((byte) -105, (float) arg0, (float) arg2, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field10244;
            var7 = this.field10208;
        } else {
            var7 = (int) ((float) this.field10243 * this.field10194.method767((float) arg2, (float) arg1, (byte) 45, (float) arg0) / var5);
            var6 = (int) ((float) this.field10248 * this.field10194.method759((byte) 64, (float) arg0, (float) arg2, (float) arg1) / var5);
        }
        arg3[1] = (int) ((float) var6 - this.field10217);
        arg3[0] = (int) ((float) var7 - this.field10240);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!wga", name = "I", descriptor = "(I)V")
    public final void method4149(int arg0) {
        ++field10070;
        if (arg0 >= -34) {
            this.field10285 = null;
        }
        this.method4103(class187.field2805, 2, 8);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIII)V")
    public final void method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field10085;
        float var7 = this.method2301(false);
        this.method4128(false);
        this.method4123(-28186, arg4);
        this.method4096((byte) 47, 0, class4.field31);
        this.method4117(0, true, class4.field31);
        this.method4076(89, arg5);
        this.field10188.method775(1.0F, (float) (arg3 + -1), (float) (arg2 - 1), (byte) -33);
        this.field10188.method757((float) arg1 + -var7, false, 0.0F, (float) arg0 - var7);
        this.method4138(0);
        this.method2261((byte) 98, false);
        this.method4103(class662.field9052, 4, 8);
        this.method2261((byte) 104, true);
        this.method4117(0, true, class755.field10544);
        this.method4096((byte) 47, 0, class755.field10544);
    }

    @OriginalMember(owner = "client!wga", name = "J", descriptor = "(I)Lhaa;")
    public final class81 method4150(int arg0) {
        if (arg0 > -69) {
            return null;
        } else {
            ++field10169;
            return this.field10188;
        }
    }

    @OriginalMember(owner = "client!wga", name = "K", descriptor = "(I)V")
    public abstract void method2252(int arg0);

    @OriginalMember(owner = "client!wga", name = "XA", descriptor = "()I")
    public final int method186() {
        ++field10012;
        return this.field10268;
    }

    @OriginalMember(owner = "client!wga", name = "g", descriptor = "(II)I")
    public final int method219(int arg0, int arg1) {
        ++field10144;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!wga", name = "L", descriptor = "(I)V")
    public static final void method4151(int arg0) {
        ++field10104;
        if (class168.field2643 != null) {
            for (int var1 = 0; ~class168.field2643.length < ~var1; ++var1) {
                for (int var2 = 0; ~var2 > ~class168.field2643[var1].length; ++var2) {
                    class168.field2643[var1][var2] = class497.field6955;
                }
            }
        }
        if (arg0 != 0) {
            method4110(-90);
        }
    }

    @OriginalMember(owner = "client!wga", name = "D", descriptor = "(B)V")
    public abstract void method2275(byte arg0);

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lhj;ILuq;IIII)V")
    public abstract void method2276(class569 arg0, int arg1, class163 arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "(II)I")
    public final int method343(int arg0, int arg1) {
        ++field10111;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!wga", name = "E", descriptor = "(B)V")
    public abstract void method2296(byte arg0);

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Loea;[Lrh;Z)Lda;")
    public final class60 method216(class597 arg0, class267[] arg1, boolean arg2) {
        ++field10066;
        return new class743(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I[Lab;)V")
    public final void method329(int arg0, class669[] arg1) {
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field10246[var3] = arg1[var3];
        }
        ++field10102;
        this.field10265 = arg0;
        if (this.field10298.method2676(-94)) {
            this.method2277((byte) 51);
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "()Z")
    public final boolean method204() {
        ++field10152;
        return false;
    }

    @OriginalMember(owner = "client!wga", name = "i", descriptor = "(I)Lza;")
    public final class415 method261(int arg0) {
        ++field10163;
        class221 var2 = new class221(arg0);
        this.field10041.method1273(var2, -20180);
        return var2;
    }

    @OriginalMember(owner = "client!wga", name = "M", descriptor = "()I")
    public final int method285() {
        ++field9999;
        return this.field10324;
    }

    @OriginalMember(owner = "client!wga", name = "M", descriptor = "(I)V")
    public abstract void method2262(int arg0);

    @OriginalMember(owner = "client!wga", name = "N", descriptor = "(I)I")
    public final int method4152(int arg0) {
        int var2 = -33 / ((55 - arg0) / 36);
        ++field10035;
        return this.field10276;
    }

    @OriginalMember(owner = "client!wga", name = "O", descriptor = "(I)V")
    public final void method4153(int arg0) {
        if (arg0 != 5) {
            field10159 = -47;
        }
        ++field10122;
        this.field10188.method745();
        this.field10183 = true;
        this.method4088(1);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIIF)Lab;")
    public final class669 method183(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field10009;
        return new class580(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "(ZI)V")
    public final void method4154(boolean arg0, int arg1) {
        if (arg1 != -31953) {
            this.field10199 = null;
        }
        ++field10014;
        if (arg0 == !this.field10263) {
            this.field10263 = arg0;
            this.method2273(-90);
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "([BILwq;IZI)Lwfa;")
    public final class200 method4155(byte[] arg0, int arg1, class169 arg2, int arg3, boolean arg4, int arg5) {
        if (arg3 != 2) {
            return null;
        } else {
            ++field10043;
            return this.method2258(arg5, 0, arg1, 0, arg0, arg2, arg3 ^ 34, arg4);
        }
    }

    @OriginalMember(owner = "client!wga", name = "P", descriptor = "(I)V")
    public abstract void method2294(int arg0);

    @OriginalMember(owner = "client!wga", name = "s", descriptor = "()Z")
    public final boolean method310() {
        ++field10053;
        return true;
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lin;II)V")
    public class745(Canvas arg0, Object arg1, class152 arg2, class91 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            this.field10231 = arg4;
            this.field10153 = arg3;
            this.field10024 = this.field10039 = arg0;
            this.field10134 = this.field10033 = arg1;
            Dimension var7 = arg0.getSize();
            this.field10076 = this.field10101 = var7.height;
            this.field10045 = this.field10072 = var7.width;
            this.field10292 = arg5;
            class78.method721(false, true, (byte) -127);
            if (super.field1170 == null) {
                this.field10038 = new NativeInterface(0, this.field10292);
                this.field10251 = null;
            } else {
                this.field10251 = new class56(this, super.field1170);
                this.field10038 = new NativeInterface(super.field1170.method1179(true), this.field10292);
                for (int var8 = 0; super.field1170.method1179(true) > var8; ++var8) {
                    class739 var9 = super.field1170.method1180(var8, -6662);
                    if (var9 != null) {
                        this.field10038.initTextureMetrics(var8, var9.field9943, var9.field9958);
                    }
                }
            }
        } catch (Throwable var11) {
            var11.printStackTrace();
            this.method614((byte) -58);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "(IZ)V")
    public final void method4156(int arg0, boolean arg1) {
        if (arg0 != -32) {
            this.field10199 = null;
        }
        ++field10141;
        if (!arg1 == this.field10232) {
            this.field10232 = arg1;
            this.method2242((byte) -116);
            this.field10214 &= -32;
        }
    }

    @OriginalMember(owner = "client!wga", name = "Q", descriptor = "(I)V")
    public abstract void method2285(int arg0);

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lmda;)V")
    public final void method208(class266 arg0) {
        this.field10250.method2963(this, arg0, -1, 0);
        ++field10098;
    }

    @OriginalMember(owner = "client!wga", name = "R", descriptor = "(I)Lhaa;")
    public final class81 method4157(int arg0) {
        if (!this.field10235) {
            this.field10199.method765(this.field10197, this.field10188);
            this.field10235 = true;
        }
        ++field10156;
        if (arg0 != -22036) {
            this.field10218 = 66;
        }
        return this.field10199;
    }

    @OriginalMember(owner = "client!wga", name = "F", descriptor = "(B)V")
    private final void method4158(byte arg0) {
        ++field10010;
        if (!this.field10226) {
            float[] var2 = this.field10271;
            float var3 = (float) this.field10209;
            float var4 = (float) this.field10268;
            float var5 = (float) (-this.field10244) * this.field10269 / (float) this.field10248;
            float var6 = (float) (-this.field10208) * this.field10269 / (float) this.field10243;
            float var7 = (float) (-this.field10208 + this.field10045) * this.field10269 / (float) this.field10243;
            float var8 = (float) (-this.field10244 + this.field10076) * this.field10269 / (float) this.field10248;
            if (var6 != var7 && var5 != var8) {
                var2[0] = 2.0F / (var7 - var6);
                var2[12] = (var6 + var7) / (var6 - var7);
                var2[6] = 0.0F;
                var2[3] = 0.0F;
                var2[11] = 0.0F;
                var2[8] = 0.0F;
                var2[14] = var3 / (var3 - var4);
                var2[1] = 0.0F;
                var2[4] = 0.0F;
                var2[2] = 0.0F;
                var2[9] = 0.0F;
                var2[13] = (var5 + var8) / (var8 - var5);
                var2[10] = 1.0F / (-var4 + var3);
                var2[5] = 2.0F / (var8 - var5);
                var2[7] = 0.0F;
                var2[15] = 1.0F;
            } else {
                var2[11] = 0.0F;
                var2[8] = 0.0F;
                var2[7] = 0.0F;
                var2[10] = 1.0F;
                var2[15] = 1.0F;
                var2[9] = 0.0F;
                var2[0] = 1.0F;
                var2[1] = 0.0F;
                var2[13] = 0.0F;
                var2[4] = 0.0F;
                var2[6] = 0.0F;
                var2[12] = 0.0F;
                var2[5] = 1.0F;
                var2[2] = 0.0F;
                var2[14] = 0.0F;
                var2[3] = 0.0F;
            }
            this.method4133((byte) 29);
            this.field10226 = true;
        }
        if (arg0 >= -37) {
            this.method352(74);
        }
    }

    @OriginalMember(owner = "client!wga", name = "S", descriptor = "(I)V")
    public abstract void method2299(int arg0);

    // $FF: synthetic method
    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4159(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
