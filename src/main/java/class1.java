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

@OriginalClass("client!us")
public class class1 extends class167 {

    @OriginalMember(owner = "client!us", name = "y", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field6 = new Hashtable();

    @OriginalMember(owner = "client!us", name = "ie", descriptor = "I")
    public int field198 = 128;

    @OriginalMember(owner = "client!us", name = "je", descriptor = "Llv;")
    private class413 field199 = new class413();

    @OriginalMember(owner = "client!us", name = "pe", descriptor = "Ltd;")
    private class422 field205 = new class422();

    @OriginalMember(owner = "client!us", name = "se", descriptor = "Ltd;")
    public class422 field208 = new class422();

    @OriginalMember(owner = "client!us", name = "ue", descriptor = "Z")
    private boolean field210 = false;

    @OriginalMember(owner = "client!us", name = "ve", descriptor = "I")
    public int field211 = 8;

    @OriginalMember(owner = "client!us", name = "we", descriptor = "I")
    public int field212 = 3;

    @OriginalMember(owner = "client!us", name = "te", descriptor = "Lhga;")
    private class158 field209 = new class158();

    @OriginalMember(owner = "client!us", name = "Be", descriptor = "[Lpaa;")
    private class579[] field217 = new class579[4];

    @OriginalMember(owner = "client!us", name = "Ge", descriptor = "[Lpaa;")
    private class579[] field222 = new class579[4];

    @OriginalMember(owner = "client!us", name = "He", descriptor = "I")
    private int field223 = -1;

    @OriginalMember(owner = "client!us", name = "Je", descriptor = "[Lpaa;")
    private class579[] field225 = new class579[4];

    @OriginalMember(owner = "client!us", name = "De", descriptor = "I")
    private int field219 = -1;

    @OriginalMember(owner = "client!us", name = "Ie", descriptor = "I")
    private int field224 = -1;

    @OriginalMember(owner = "client!us", name = "Ce", descriptor = "Lcba;")
    private class513 field218 = new class513();

    @OriginalMember(owner = "client!us", name = "Le", descriptor = "Lsl;")
    private class427 field227 = new class427(16);

    @OriginalMember(owner = "client!us", name = "Ne", descriptor = "Lhga;")
    private class158 field229 = new class158();

    @OriginalMember(owner = "client!us", name = "Re", descriptor = "Lhga;")
    private class158 field233 = new class158();

    @OriginalMember(owner = "client!us", name = "Se", descriptor = "Lhga;")
    private class158 field234 = new class158();

    @OriginalMember(owner = "client!us", name = "Te", descriptor = "Lhga;")
    private class158 field235 = new class158();

    @OriginalMember(owner = "client!us", name = "Ue", descriptor = "Lhga;")
    private class158 field236 = new class158();

    @OriginalMember(owner = "client!us", name = "Ve", descriptor = "Lhga;")
    private class158 field237 = new class158();

    @OriginalMember(owner = "client!us", name = "We", descriptor = "Lhga;")
    private class158 field238 = new class158();

    @OriginalMember(owner = "client!us", name = "cf", descriptor = "Ltd;")
    public class422 field244 = new class422();

    @OriginalMember(owner = "client!us", name = "gf", descriptor = "Ltd;")
    public class422 field248 = new class422();

    @OriginalMember(owner = "client!us", name = "hf", descriptor = "Ltd;")
    public class422 field249 = new class422();

    @OriginalMember(owner = "client!us", name = "Kf", descriptor = "Z")
    private boolean field277 = true;

    @OriginalMember(owner = "client!us", name = "Ef", descriptor = "F")
    private float field271 = 0.0F;

    @OriginalMember(owner = "client!us", name = "Ff", descriptor = "F")
    public float field272 = 3584.0F;

    @OriginalMember(owner = "client!us", name = "zf", descriptor = "I")
    public int field266 = 0;

    @OriginalMember(owner = "client!us", name = "Yf", descriptor = "I")
    public int field291 = 0;

    @OriginalMember(owner = "client!us", name = "pf", descriptor = "I")
    public int field256 = -1;

    @OriginalMember(owner = "client!us", name = "gg", descriptor = "[F")
    private float[] field299 = new float[4];

    @OriginalMember(owner = "client!us", name = "rg", descriptor = "I")
    public int field310 = 512;

    @OriginalMember(owner = "client!us", name = "rf", descriptor = "[F")
    private float[] field258 = new float[4];

    @OriginalMember(owner = "client!us", name = "Bf", descriptor = "[F")
    public float[] field268 = new float[4];

    @OriginalMember(owner = "client!us", name = "mg", descriptor = "Z")
    private boolean field305 = false;

    @OriginalMember(owner = "client!us", name = "bg", descriptor = "I")
    private int field294 = -1;

    @OriginalMember(owner = "client!us", name = "Gg", descriptor = "I")
    public int field325 = 0;

    @OriginalMember(owner = "client!us", name = "eg", descriptor = "F")
    private float field297 = -1.0F;

    @OriginalMember(owner = "client!us", name = "Sf", descriptor = "I")
    public int field285 = -1;

    @OriginalMember(owner = "client!us", name = "tg", descriptor = "F")
    private float field312 = 1.0F;

    @OriginalMember(owner = "client!us", name = "Xf", descriptor = "F")
    public float field290 = 1.0F;

    @OriginalMember(owner = "client!us", name = "Fg", descriptor = "I")
    public int field324 = -1;

    @OriginalMember(owner = "client!us", name = "qg", descriptor = "I")
    private int field309 = 0;

    @OriginalMember(owner = "client!us", name = "ig", descriptor = "I")
    private int field301 = 0;

    @OriginalMember(owner = "client!us", name = "Zf", descriptor = "F")
    private float field292 = 1.0F;

    @OriginalMember(owner = "client!us", name = "Ag", descriptor = "F")
    public float field319 = 1.0F;

    @OriginalMember(owner = "client!us", name = "Cg", descriptor = "F")
    public float field321 = 1.0F;

    @OriginalMember(owner = "client!us", name = "Vf", descriptor = "I")
    public int field288 = 0;

    @OriginalMember(owner = "client!us", name = "Zg", descriptor = "[F")
    private float[] field344 = new float[4];

    @OriginalMember(owner = "client!us", name = "Tg", descriptor = "F")
    public float field338 = -1.0F;

    @OriginalMember(owner = "client!us", name = "nf", descriptor = "I")
    public int field254 = -1;

    @OriginalMember(owner = "client!us", name = "Ig", descriptor = "I")
    public int field327 = 512;

    @OriginalMember(owner = "client!us", name = "xg", descriptor = "I")
    private int field316 = 0;

    @OriginalMember(owner = "client!us", name = "Ug", descriptor = "I")
    private int field339 = 8448;

    @OriginalMember(owner = "client!us", name = "Hg", descriptor = "I")
    private int field326 = 0;

    @OriginalMember(owner = "client!us", name = "hg", descriptor = "F")
    public float field300 = -1.0F;

    @OriginalMember(owner = "client!us", name = "Kg", descriptor = "I")
    private int field329 = 0;

    @OriginalMember(owner = "client!us", name = "lg", descriptor = "I")
    public int field304 = 50;

    @OriginalMember(owner = "client!us", name = "If", descriptor = "F")
    public float field275 = 3584.0F;

    @OriginalMember(owner = "client!us", name = "Jf", descriptor = "I")
    private int field276 = 8448;

    @OriginalMember(owner = "client!us", name = "pg", descriptor = "F")
    private float field308 = -1.0F;

    @OriginalMember(owner = "client!us", name = "mh", descriptor = "I")
    private int field357 = 0;

    @OriginalMember(owner = "client!us", name = "Yg", descriptor = "[F")
    private float[] field343 = new float[16];

    @OriginalMember(owner = "client!us", name = "bh", descriptor = "I")
    private int field346 = 3584;

    @OriginalMember(owner = "client!us", name = "sg", descriptor = "[Lff;")
    private class9[] field311 = new class9[class38.field1056];

    @OriginalMember(owner = "client!us", name = "Og", descriptor = "Lgt;")
    public class424 field333 = new class424(8192);

    @OriginalMember(owner = "client!us", name = "rh", descriptor = "[I")
    public int[] field362 = new int[1];

    @OriginalMember(owner = "client!us", name = "th", descriptor = "[I")
    public int[] field364 = new int[1];

    @OriginalMember(owner = "client!us", name = "ph", descriptor = "[B")
    public byte[] field360 = new byte[16384];

    @OriginalMember(owner = "client!us", name = "uh", descriptor = "[I")
    public int[] field365 = new int[1];

    @OriginalMember(owner = "client!us", name = "ge", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "client!us", name = "pd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field153;

    @OriginalMember(owner = "client!us", name = "cc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field88;

    @OriginalMember(owner = "client!us", name = "Ld", descriptor = "Ljaggl/OpenGL;")
    public OpenGL field175;

    @OriginalMember(owner = "client!us", name = "V", descriptor = "J")
    private long field29;

    @OriginalMember(owner = "client!us", name = "Jc", descriptor = "J")
    private long field121;

    @OriginalMember(owner = "client!us", name = "Af", descriptor = "Z")
    public boolean field267;

    @OriginalMember(owner = "client!us", name = "Bg", descriptor = "I")
    public int field320;

    @OriginalMember(owner = "client!us", name = "Rf", descriptor = "Ljava/lang/String;")
    private String field284;

    @OriginalMember(owner = "client!us", name = "ah", descriptor = "Z")
    public boolean field345;

    @OriginalMember(owner = "client!us", name = "uf", descriptor = "Z")
    private boolean field261;

    @OriginalMember(owner = "client!us", name = "Uf", descriptor = "Z")
    public boolean field287;

    @OriginalMember(owner = "client!us", name = "sf", descriptor = "Z")
    public boolean field259;

    @OriginalMember(owner = "client!us", name = "kf", descriptor = "Z")
    private boolean field251;

    @OriginalMember(owner = "client!us", name = "Xg", descriptor = "Z")
    public boolean field342;

    @OriginalMember(owner = "client!us", name = "yg", descriptor = "Ljava/lang/String;")
    private String field317;

    @OriginalMember(owner = "client!us", name = "Lf", descriptor = "Z")
    public boolean field278;

    @OriginalMember(owner = "client!us", name = "Ng", descriptor = "Z")
    private boolean field332;

    @OriginalMember(owner = "client!us", name = "he", descriptor = "Laca;")
    private class677 field197;

    @OriginalMember(owner = "client!us", name = "xe", descriptor = "Lwu;")
    public class343 field213;

    @OriginalMember(owner = "client!us", name = "me", descriptor = "Lce;")
    private class283 field202;

    @OriginalMember(owner = "client!us", name = "ne", descriptor = "Lou;")
    private class563 field203;

    @OriginalMember(owner = "client!us", name = "oe", descriptor = "Lmw;")
    private class459 field204;

    @OriginalMember(owner = "client!us", name = "Kd", descriptor = "Loda;")
    public static class103 field174 = new class103();

    @OriginalMember(owner = "client!us", name = "de", descriptor = "Lsb;")
    public static class266 field193 = new class266(45, 8);

    @OriginalMember(owner = "client!us", name = "lf", descriptor = "F")
    public float field252;

    @OriginalMember(owner = "client!us", name = "qf", descriptor = "F")
    public float field257;

    @OriginalMember(owner = "client!us", name = "yf", descriptor = "F")
    private float field265;

    @OriginalMember(owner = "client!us", name = "Gf", descriptor = "F")
    public float field273;

    @OriginalMember(owner = "client!us", name = "dg", descriptor = "F")
    public float field296;

    @OriginalMember(owner = "client!us", name = "jg", descriptor = "F")
    public float field302;

    @OriginalMember(owner = "client!us", name = "ng", descriptor = "F")
    public float field306;

    @OriginalMember(owner = "client!us", name = "vg", descriptor = "F")
    private float field314;

    @OriginalMember(owner = "client!us", name = "Jg", descriptor = "F")
    private float field328;

    @OriginalMember(owner = "client!us", name = "t", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!us", name = "C", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!us", name = "oc", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!us", name = "pc", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!us", name = "qc", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!us", name = "rc", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!us", name = "sc", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!us", name = "tc", descriptor = "I")
    private int field105;

    @OriginalMember(owner = "client!us", name = "uc", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!us", name = "vc", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!us", name = "wc", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!us", name = "xc", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!us", name = "D", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!us", name = "yc", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!us", name = "zc", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!us", name = "Ac", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!us", name = "Bc", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!us", name = "Cc", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!us", name = "Dc", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!us", name = "Ec", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!us", name = "Fc", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!us", name = "Gc", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!us", name = "Hc", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!us", name = "E", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!us", name = "Ic", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!us", name = "Kc", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!us", name = "Lc", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!us", name = "Mc", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!us", name = "Nc", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!us", name = "Oc", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!us", name = "Pc", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!us", name = "Qc", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!us", name = "Rc", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!us", name = "F", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!us", name = "Sc", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!us", name = "Tc", descriptor = "I")
    public int field131;

    @OriginalMember(owner = "client!us", name = "Uc", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!us", name = "Vc", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!us", name = "Wc", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!us", name = "Xc", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!us", name = "Yc", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!us", name = "Zc", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!us", name = "ad", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!us", name = "bd", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!us", name = "G", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!us", name = "cd", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!us", name = "dd", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!us", name = "ed", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!us", name = "fd", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!us", name = "gd", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!us", name = "hd", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!us", name = "id", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!us", name = "jd", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!us", name = "kd", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!us", name = "ld", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!us", name = "H", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!us", name = "md", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!us", name = "nd", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!us", name = "od", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!us", name = "qd", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!us", name = "rd", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!us", name = "sd", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!us", name = "td", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!us", name = "ud", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!us", name = "vd", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!us", name = "I", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!us", name = "wd", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!us", name = "xd", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!us", name = "yd", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!us", name = "zd", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!us", name = "Ad", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!us", name = "Bd", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!us", name = "Cd", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client!us", name = "Dd", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!us", name = "Ed", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!us", name = "Fd", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!us", name = "J", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!us", name = "Gd", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!us", name = "Hd", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!us", name = "Id", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!us", name = "Jd", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!us", name = "Md", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!us", name = "Nd", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!us", name = "Od", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!us", name = "Pd", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!us", name = "K", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!us", name = "Qd", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!us", name = "Rd", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!us", name = "Sd", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!us", name = "Td", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!us", name = "Ud", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!us", name = "Vd", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!us", name = "Wd", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!us", name = "Xd", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!us", name = "Yd", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!us", name = "Zd", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!us", name = "L", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!us", name = "ae", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!us", name = "be", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!us", name = "ce", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!us", name = "ee", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!us", name = "fe", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!us", name = "u", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "M", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!us", name = "ke", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!us", name = "le", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!us", name = "qe", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!us", name = "re", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!us", name = "N", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!us", name = "ze", descriptor = "I")
    public int field215;

    @OriginalMember(owner = "client!us", name = "O", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!us", name = "Me", descriptor = "I")
    public int field228;

    @OriginalMember(owner = "client!us", name = "P", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!us", name = "Oe", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client!us", name = "Pe", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client!us", name = "Qe", descriptor = "I")
    public int field232;

    @OriginalMember(owner = "client!us", name = "Q", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "client!us", name = "df", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client!us", name = "ef", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client!us", name = "ff", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client!us", name = "R", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!us", name = "S", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!us", name = "vf", descriptor = "I")
    private int field262;

    @OriginalMember(owner = "client!us", name = "T", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!us", name = "U", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!us", name = "fg", descriptor = "I")
    public int field298;

    @OriginalMember(owner = "client!us", name = "v", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "W", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!us", name = "kg", descriptor = "I")
    public int field303;

    @OriginalMember(owner = "client!us", name = "X", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!us", name = "zg", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "client!us", name = "Y", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!us", name = "Dg", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client!us", name = "Eg", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client!us", name = "Z", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!us", name = "Lg", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "client!us", name = "Pg", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "client!us", name = "ab", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!us", name = "Wg", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "client!us", name = "dh", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "client!us", name = "bb", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!us", name = "ih", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client!us", name = "oh", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client!us", name = "cb", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!us", name = "qh", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client!us", name = "sh", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "client!us", name = "db", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!us", name = "eb", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!us", name = "fb", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!us", name = "w", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!us", name = "gb", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!us", name = "hb", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!us", name = "ib", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!us", name = "jb", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!us", name = "kb", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!us", name = "lb", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!us", name = "mb", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!us", name = "nb", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!us", name = "ob", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!us", name = "pb", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!us", name = "x", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!us", name = "qb", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!us", name = "rb", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!us", name = "sb", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!us", name = "tb", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!us", name = "vb", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!us", name = "wb", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!us", name = "xb", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!us", name = "yb", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!us", name = "zb", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!us", name = "Ab", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!us", name = "Bb", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!us", name = "Cb", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!us", name = "Db", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!us", name = "Eb", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!us", name = "Fb", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!us", name = "Gb", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!us", name = "Hb", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!us", name = "Ib", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!us", name = "Jb", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!us", name = "z", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!us", name = "Kb", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!us", name = "Lb", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!us", name = "Mb", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!us", name = "Nb", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!us", name = "Ob", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!us", name = "Pb", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!us", name = "Qb", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!us", name = "Rb", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!us", name = "Sb", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!us", name = "Tb", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!us", name = "A", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!us", name = "Ub", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!us", name = "Vb", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!us", name = "Wb", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!us", name = "Xb", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!us", name = "Yb", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!us", name = "Zb", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!us", name = "ac", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!us", name = "bc", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!us", name = "dc", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!us", name = "B", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!us", name = "ec", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!us", name = "fc", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!us", name = "gc", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!us", name = "hc", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!us", name = "ic", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!us", name = "jc", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!us", name = "kc", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!us", name = "lc", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!us", name = "mc", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!us", name = "nc", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!us", name = "Ze", descriptor = "J")
    private long field241;

    @OriginalMember(owner = "client!us", name = "ub", descriptor = "Llf;")
    public static class217 field54;

    @OriginalMember(owner = "client!us", name = "wg", descriptor = "Ldea;")
    private class225 field315;

    @OriginalMember(owner = "client!us", name = "jf", descriptor = "Lmb;")
    public class241 field250;

    @OriginalMember(owner = "client!us", name = "xf", descriptor = "Lmb;")
    public class241 field264;

    @OriginalMember(owner = "client!us", name = "Mf", descriptor = "Lmb;")
    public class241 field279;

    @OriginalMember(owner = "client!us", name = "Nf", descriptor = "Lmb;")
    public class241 field280;

    @OriginalMember(owner = "client!us", name = "ag", descriptor = "Lmb;")
    public class241 field293;

    @OriginalMember(owner = "client!us", name = "ug", descriptor = "Lmb;")
    public class241 field313;

    @OriginalMember(owner = "client!us", name = "Qg", descriptor = "Lmb;")
    public class241 field335;

    @OriginalMember(owner = "client!us", name = "gh", descriptor = "Lmb;")
    public class241 field351;

    @OriginalMember(owner = "client!us", name = "jh", descriptor = "Lmb;")
    public class241 field354;

    @OriginalMember(owner = "client!us", name = "lh", descriptor = "Lmb;")
    public class241 field356;

    @OriginalMember(owner = "client!us", name = "of", descriptor = "Ldb;")
    public class296 field255;

    @OriginalMember(owner = "client!us", name = "Ke", descriptor = "Lrq;")
    private class323 field226;

    @OriginalMember(owner = "client!us", name = "Vg", descriptor = "Lrq;")
    public class323 field340;

    @OriginalMember(owner = "client!us", name = "Ee", descriptor = "Loh;")
    private class374 field220;

    @OriginalMember(owner = "client!us", name = "mf", descriptor = "Lrca;")
    public class423 field253;

    @OriginalMember(owner = "client!us", name = "Tf", descriptor = "Lrca;")
    public class423 field286;

    @OriginalMember(owner = "client!us", name = "Mg", descriptor = "Lgq;")
    private class478 field331;

    @OriginalMember(owner = "client!us", name = "og", descriptor = "Lel;")
    private class510 field307;

    @OriginalMember(owner = "client!us", name = "ch", descriptor = "Lel;")
    private class510 field347;

    @OriginalMember(owner = "client!us", name = "Of", descriptor = "Lcv;")
    private class529 field281;

    @OriginalMember(owner = "client!us", name = "Ae", descriptor = "Lpaa;")
    private class579 field216;

    @OriginalMember(owner = "client!us", name = "Fe", descriptor = "Lpaa;")
    private class579 field221;

    @OriginalMember(owner = "client!us", name = "ye", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field214;

    @OriginalMember(owner = "client!us", name = "Xe", descriptor = "Z")
    private boolean field239;

    @OriginalMember(owner = "client!us", name = "Ye", descriptor = "Z")
    private boolean field240;

    @OriginalMember(owner = "client!us", name = "af", descriptor = "Z")
    private boolean field242;

    @OriginalMember(owner = "client!us", name = "bf", descriptor = "Z")
    private boolean field243;

    @OriginalMember(owner = "client!us", name = "tf", descriptor = "Z")
    private boolean field260;

    @OriginalMember(owner = "client!us", name = "wf", descriptor = "Z")
    public boolean field263;

    @OriginalMember(owner = "client!us", name = "Cf", descriptor = "Z")
    private boolean field269;

    @OriginalMember(owner = "client!us", name = "Df", descriptor = "Z")
    private boolean field270;

    @OriginalMember(owner = "client!us", name = "Hf", descriptor = "Z")
    private boolean field274;

    @OriginalMember(owner = "client!us", name = "Pf", descriptor = "Z")
    private boolean field282;

    @OriginalMember(owner = "client!us", name = "Qf", descriptor = "Z")
    public boolean field283;

    @OriginalMember(owner = "client!us", name = "Wf", descriptor = "Z")
    public boolean field289;

    @OriginalMember(owner = "client!us", name = "cg", descriptor = "Z")
    private boolean field295;

    @OriginalMember(owner = "client!us", name = "Rg", descriptor = "Z")
    private boolean field336;

    @OriginalMember(owner = "client!us", name = "Sg", descriptor = "Z")
    public boolean field337;

    @OriginalMember(owner = "client!us", name = "eh", descriptor = "Z")
    public boolean field349;

    @OriginalMember(owner = "client!us", name = "fh", descriptor = "Z")
    public boolean field350;

    @OriginalMember(owner = "client!us", name = "kh", descriptor = "Z")
    public boolean field355;

    @OriginalMember(owner = "client!us", name = "nh", descriptor = "Z")
    public boolean field358;

    @OriginalMember(owner = "client!us", name = "hh", descriptor = "[Lum;")
    private class487[] field352;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BLpaa;)V")
    public final void method1(byte arg0, class579 arg1) {
        if (arg0 >= -67) {
            field194 = -50;
        }
        ++field80;
        if (this.field219 >= 0 && this.field222[this.field219] == arg1) {
            this.field222[this.field219--] = null;
            arg1.method2077(true);
            if (~this.field219 <= -1) {
                this.field216 = this.field222[this.field219];
                this.field216.method2084(127);
            } else {
                this.field216 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!us", name = "i", descriptor = "()V")
    public final void method2() {
        ++field115;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!us", name = "h", descriptor = "(I)V")
    public final void method3(int arg0) {
        if (this.field246 != 16) {
            this.method70(-125);
            this.method61(true, 101);
            this.method57(4, true);
            this.method45(true, -114);
            this.method7(1, (byte) 76);
            this.field246 = 16;
        }
        if (arg0 != 12787) {
            this.method16((byte) 6);
        }
        ++field120;
    }

    @OriginalMember(owner = "client!us", name = "J", descriptor = "(IIIIII)V")
    public final void method4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field44;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method36((byte) -125);
        this.method7(arg5, (byte) 76);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field282) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field282) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILum;)V")
    public final void method5(int arg0, class487 arg1) {
        ++field98;
        class487 var3 = this.field352[this.field341];
        if (arg1 != var3) {
            if (arg1 != null) {
                if (var3 != null) {
                    if (arg1.field6979 != var3.field6979) {
                        OpenGL.glDisable(var3.field6979);
                        OpenGL.glEnable(arg1.field6979);
                    }
                } else {
                    OpenGL.glEnable(arg1.field6979);
                }
                OpenGL.glBindTexture(arg1.field6979, arg1.method2937(124));
            } else {
                OpenGL.glDisable(var3.field6979);
            }
            this.field352[this.field341] = arg1;
        }
        this.field246 &= -2;
        if (arg0 != 3845) {
            this.method26(-58, -113, -127);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZIIZ)V")
    public final void method6(boolean arg0, int arg1, int arg2, boolean arg3) {
        ++field169;
        if (~this.field353 != ~arg1 || !this.field305 != !this.field349) {
            class296 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field349 ? 0 : 3;
            if (arg1 < 0) {
                this.method56(0);
            } else {
                var5 = this.field197.method3811(1, arg1);
                class699 var10 = super.field2768.method1500(arg1, -66);
                if (var10.field9852 == 0 && ~var10.field9834 == -1) {
                    this.method56(0);
                } else {
                    int var11 = !var10.field9836 ? 128 : 64;
                    int var12 = var11 * 50;
                    this.method153((float) (this.field215 % var12 * var10.field9834) / (float) var12, 0.0F, (float) (this.field215 % var12 * var10.field9852) / (float) var12, -125);
                }
                if (!this.field349) {
                    var9 = var10.field9829;
                    var8 = var10.field9826;
                    var7 = var10.field9849;
                }
                var6 = var10.field9835;
            }
            this.field204.method2755(var7, -57, var8, arg0, arg3, var9);
            if (!this.field204.method2754(var6, arg2 ^ -10713, var5)) {
                this.method5(3845, var5);
                this.method133(var6, (byte) -119);
            }
            this.field305 = this.field349;
            this.field353 = arg1;
        }
        if (arg2 != -10715) {
            this.field312 = 0.29551825F;
        }
        this.field246 &= -8;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IB)V")
    public final void method7(int arg0, byte arg1) {
        ++field177;
        if (arg1 != 76) {
            this.method17();
        }
        if (~this.field247 != ~arg0) {
            boolean var3;
            boolean var4;
            byte var5;
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 == -129) {
                        var3 = true;
                        var4 = true;
                        var5 = 3;
                    } else {
                        var5 = 0;
                        var3 = true;
                        var4 = false;
                    }
                } else {
                    var4 = false;
                    var5 = 2;
                    var3 = true;
                }
            } else {
                var5 = 1;
                var3 = true;
                var4 = true;
            }
            if (!var3 == this.field242) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field242 = var3;
            }
            if (this.field239 == !var4) {
                if (var4) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field239 = var4;
            }
            if (~this.field245 != ~var5) {
                if (~var5 != -2) {
                    if (~var5 != -3) {
                        if (~var5 == -4) {
                            OpenGL.glEnable(3042);
                            OpenGL.glBlendFunc(774, 1);
                        } else {
                            OpenGL.glDisable(3042);
                        }
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field245 = var5;
            }
            this.field247 = arg0;
            this.field246 &= -29;
        }
    }

    @OriginalMember(owner = "client!us", name = "i", descriptor = "(I)V")
    public final void method8(int arg0) {
        if (~this.field246 != -9) {
            this.method101(-3);
            this.method61(true, 101);
            this.method57(90, true);
            this.method45(true, -103);
            this.method7(1, (byte) 76);
            this.field246 = 8;
        }
        int var2 = -127 / ((17 - arg0) / 50);
        ++field152;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lcv;IIBI)V")
    public final void method9(class529 arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field93;
        int var6 = arg0.method262(true);
        if (arg3 != 90) {
            this.method114();
        }
        int var7 = arg1 * this.method77(var6, true);
        this.method67(arg0, false);
        OpenGL.glDrawElements(arg2, arg4, var6, arg0.method267(arg3 ^ -18637) + (long) var7);
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(IIII)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg0 + 34176, arg2);
        ++field201;
        OpenGL.glTexEnvi(8960, arg0 + arg3, arg1);
    }

    @OriginalMember(owner = "client!us", name = "GA", descriptor = "(II)V")
    public final void method11(int arg0, int arg1) {
        if (this.field304 != arg0 || ~this.field346 != ~arg1) {
            this.field346 = arg1;
            this.field304 = arg0;
            this.method83(16);
            this.method65(-92);
            if (this.field348 == 3) {
                this.method16((byte) -100);
            } else if (this.field348 == 2) {
                this.method175(false);
            }
        }
        ++field94;
    }

    @OriginalMember(owner = "client!us", name = "q", descriptor = "()Z")
    public final boolean method12() {
        ++field162;
        return this.field282 && (!this.method162() || this.field270);
    }

    @OriginalMember(owner = "client!us", name = "j", descriptor = "(I)V")
    private final void method13(int arg0) {
        if (this.field295 && !this.field274) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 == -3630) {
            ++field43;
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(IB)V")
    public final synchronized void method14(int arg0, byte arg1) {
        ++field69;
        class149 var3 = new class149(arg0);
        if (arg1 < -16) {
            this.field235.method1229(var3, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!us", name = "k", descriptor = "(I)V")
    public final void method15(int arg0) {
        ++field130;
        OpenGL.glLightfv(16384, 4611, this.field268, 0);
        OpenGL.glLightfv(16385, 4611, this.field299, 0);
        if (arg0 != -2) {
            this.field293 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(B)V")
    private final void method16(byte arg0) {
        if (arg0 < -46) {
            ++field85;
            float var2 = (float) (-this.field291) * this.field312 / (float) this.field310;
            float var3 = (float) (-this.field288) * this.field312 / (float) this.field327;
            float var4 = (float) (-this.field291 + this.field131) * this.field312 / (float) this.field310;
            float var5 = (float) (-this.field288 + this.field24) * this.field312 / (float) this.field327;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (var2 != var4 && var3 != var5) {
                OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field304, (double) this.field346);
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!us", name = "o", descriptor = "()Z")
    public final boolean method17() {
        ++field192;
        return true;
    }

    @OriginalMember(owner = "client!us", name = "l", descriptor = "(I)V")
    private final void method18(int arg0) {
        class119.field2130[0] = this.field321 * this.field296;
        class119.field2130[1] = this.field319 * this.field296;
        ++field62;
        class119.field2130[3] = 1.0F;
        if (arg0 > 15) {
            class119.field2130[2] = this.field296 * this.field290;
            OpenGL.glLightModelfv(2899, class119.field2130, 0);
        }
    }

    @OriginalMember(owner = "client!us", name = "u", descriptor = "()Lmp;")
    public final class706 method19() {
        ++field35;
        int var1 = -1;
        if (this.field317.indexOf("nvidia") == -1) {
            if (this.field317.indexOf("intel") != -1) {
                var1 = 32902;
            } else if (~this.field317.indexOf("ati") != 0) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class706(var1, "OpenGL", this.field323, this.field284, 0L);
    }

    @OriginalMember(owner = "client!us", name = "m", descriptor = "(I)V")
    public final void method20(int arg0) {
        int var2 = -62 % ((-7 - arg0) / 50);
        ++field78;
        OpenGL.glPushMatrix();
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IZI)V")
    public final void method21(int arg0, boolean arg1, int arg2) {
        if (arg0 == 2) {
            this.method6(arg1, arg2, -10715, true);
            ++field18;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IZ)V")
    public final void method22(int arg0, boolean arg1) {
        ++field12;
        class119.field2130[3] = (float) (arg0 >>> 24) / 255.0F;
        class119.field2130[0] = (float) class481.method2919(16711680, arg0) / 1.671168E7F;
        class119.field2130[1] = (float) class481.method2919(65280, arg0) / 65280.0F;
        class119.field2130[2] = (float) class481.method2919(arg0, 255) / 255.0F;
        if (!arg1) {
            OpenGL.glTexEnvfv(8960, 8705, class119.field2130, 0);
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method23(Canvas arg0) {
        ++field27;
        if (this.field153 == arg0) {
            throw new RuntimeException();
        } else if (this.field6.containsKey(arg0)) {
            Long var2 = (Long) this.field6.get(arg0);
            this.field175.releaseSurface(arg0, var2);
            this.field6.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIIILua;II)V")
    public final void method24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class619 arg6, int arg7, int arg8) {
        ++field2;
        class394 var10 = (class394) arg6;
        class225 var11 = var10.field5764;
        this.method136((byte) -44);
        this.method5(3845, var10.field5764);
        this.method7(arg5, (byte) 76);
        this.method148(8448, 7681, (byte) -119);
        this.method10(0, 768, 34167, 34192);
        float var12 = var11.field3371 / (float) var11.field3370;
        float var13 = var11.field3365 / (float) var11.field3363;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var14 * var16;
        float var18 = var15 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method10(0, 768, 5890, 34192);
    }

    @OriginalMember(owner = "client!us", name = "A", descriptor = "()Z")
    public final boolean method25() {
        ++field127;
        return true;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(III)V")
    public final synchronized void method26(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.method42(89);
        }
        ++field107;
        class149 var4 = new class149(arg2);
        var4.field6132 = (long) arg1;
        this.field234.method1229(var4, (byte) 120);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(FFF)V")
    public final void method27(float arg0, float arg1, float arg2) {
        ++field16;
        class290.field4351 = arg2;
        class90.field1651 = arg0;
        class654.field9418 = arg1;
    }

    @OriginalMember(owner = "client!us", name = "ya", descriptor = "()V")
    public final void method28() {
        ++field172;
        this.method45(true, -96);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method29(Rectangle[] arg0, int arg1) throws class105 {
        this.method63();
        ++field68;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILtd;)V")
    public final void method30(int arg0, class422 arg1) {
        OpenGL.glLoadMatrixf(arg1.method2575(false), 0);
        if (arg0 == -32754) {
            ++field52;
        }
    }

    @OriginalMember(owner = "client!us", name = "C", descriptor = "()Z")
    public final boolean method31() {
        ++field110;
        return this.field204.method2756(9, 3);
    }

    @OriginalMember(owner = "client!us", name = "f", descriptor = "(I)Le;")
    public final class495 method32(int arg0) {
        ++field37;
        class382 var2 = new class382(arg0);
        this.field209.method1229(var2, (byte) 120);
        return var2;
    }

    @OriginalMember(owner = "client!us", name = "O", descriptor = "(IIIIII)Z")
    public final boolean method33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field75;
        float var7 = (float) arg2 * this.field244.field6075 + (float) arg0 * this.field244.field6078 + (float) arg1 * this.field244.field6081 + this.field244.field6077;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field244.field6075 + (float) arg3 * this.field244.field6078 + (float) arg4 * this.field244.field6081 + this.field244.field6077;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field304 > var7) || !((float) this.field304 > var8)) && (!((float) this.field346 < var7) || !(var8 > (float) this.field346))) {
            int var9 = (int) (((float) arg2 * this.field244.field6100 + (float) arg0 * this.field244.field6101 + (float) arg1 * this.field244.field6102 + this.field244.field6099) * (float) this.field310 / var7);
            int var10 = (int) (((float) arg5 * this.field244.field6100 + (float) arg3 * this.field244.field6101 + (float) arg4 * this.field244.field6102 + this.field244.field6099) * (float) this.field310 / var8);
            if (this.field252 > (float) var9 && this.field252 > (float) var10 || (float) var9 > this.field306 && this.field306 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field244.field6083 + (float) arg0 * this.field244.field6112 + (float) arg1 * this.field244.field6079 + this.field244.field6109) * (float) this.field327 / var7);
                int var12 = (int) (((float) arg5 * this.field244.field6083 + (float) arg3 * this.field244.field6112 + (float) arg4 * this.field244.field6079 + this.field244.field6109) * (float) this.field327 / var8);
                return (!((float) var11 < this.field257) || !(this.field257 > (float) var12)) && (!((float) var11 > this.field273) || !(this.field273 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(II)I")
    public final int method34(int arg0, int arg1) {
        ++field155;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(II)I")
    public final int method35(int arg0, int arg1) {
        ++field40;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(B)V")
    private final void method36(byte arg0) {
        if (this.field246 != 1) {
            this.method167(-13966);
            this.method61(false, 101);
            this.method172(false, 4);
            this.method57(arg0 + 231, false);
            this.method45(false, -94);
            this.method5(3845, (class487) null);
            this.method161(-117, -2);
            this.method133(1, (byte) -127);
            this.field246 = 1;
        }
        ++field170;
        if (arg0 != -125) {
            this.field307 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lnda;IIII)Lda;")
    public final class55 method37(class519 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field26;
        return new class241(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IJ)V")
    public final synchronized void method38(int arg0, long arg1) {
        ++field183;
        if (arg0 != 65280) {
            this.method42(106);
        }
        class425 var4 = new class425();
        var4.field6132 = arg1;
        this.field238.method1229(var4, (byte) 120);
    }

    @OriginalMember(owner = "client!us", name = "YA", descriptor = "(IIII)V")
    public final void method39(int arg0, int arg1, int arg2, int arg3) {
        ++field41;
        if (!this.field349) {
            throw new RuntimeException("");
        } else {
            this.field285 = arg2;
            this.field256 = arg1;
            this.field266 = arg3;
            this.field298 = arg0;
            if (this.field305) {
                this.field204.field6548.method3885((byte) 126);
                this.field204.field6548.method3883((byte) -128);
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "n", descriptor = "()V")
    public final void method40() {
        for (class425 var1 = this.field209.method1224(-2); var1 != null; var1 = this.field209.method1232(-2)) {
            ((class382) var1).method2376((byte) 106);
        }
        ++field61;
        if (this.field202 != null) {
            this.field202.method1864((byte) 13);
        }
        if (this.field175 != null) {
            this.method130(6296);
            Enumeration var2 = this.field6.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field6.get(var3);
                this.field175.releaseSurface(var3, var4);
            }
            this.field175.release();
            this.field175 = null;
        }
        if (this.field210) {
            class543.method3130(true, false, 80);
            this.field210 = false;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIII)V")
    public final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field164;
        this.method36((byte) -125);
        this.method7(arg5, (byte) 76);
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

    @OriginalMember(owner = "client!us", name = "ja", descriptor = "(I)V")
    public final void method42(int arg0) {
        ++field101;
        this.method7(0, (byte) 76);
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lel;I)V")
    public final void method43(class510 arg0, int arg1) {
        if (arg1 != -26418) {
            this.method173();
        }
        if (this.field347 != arg0) {
            if (this.field261) {
                OpenGL.glBindBufferARB(34962, arg0.method1999((byte) -71));
            }
            this.field347 = arg0;
        }
        ++field20;
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method44(Canvas arg0) {
        ++field46;
        long var2 = 0L;
        if (arg0 != null && this.field153 != arg0) {
            if (this.field6.containsKey(arg0)) {
                Long var4 = (Long) this.field6.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field29;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field175.surfaceResized(var2);
            if (this.field88 == arg0) {
                this.method129(false);
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI)V")
    public final void method45(boolean arg0, int arg1) {
        if (arg0 == !this.field243) {
            this.field243 = arg0;
            this.method179(5);
            this.field246 &= -32;
        }
        if (arg1 <= -93) {
            ++field19;
        }
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method46(Canvas arg0) {
        ++field206;
        if (this.field153 == arg0) {
            throw new RuntimeException();
        } else if (!this.field6.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field175.prepareSurface(arg0);
                if (var4 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field6.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZB)V")
    public final void method47(boolean arg0, byte arg1) {
        if (arg1 == 77) {
            if (arg0 == !this.field274) {
                this.field274 = arg0;
                this.method13(-3630);
            }
            ++field150;
        }
    }

    @OriginalMember(owner = "client!us", name = "va", descriptor = "(I)V")
    public final void method48(int arg0) {
        this.field212 = 0;
        ++field178;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field212;
        }
        this.field211 = 1 << this.field212;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "([BIIZI)Lel;")
    public final class510 method49(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field56;
        if (arg4 != 11645) {
            this.field319 = -1.2154037F;
        }
        return (class510) (!this.field261 || arg3 && !this.field251 ? new class428(this, arg1, arg0, arg2) : new class305(this, arg1, arg0, arg2, arg3));
    }

    @OriginalMember(owner = "client!us", name = "h", descriptor = "(IIII)[I")
    public final int[] method50(int arg0, int arg1, int arg2, int arg3) {
        ++field21;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, this.field24 - arg1 - var6, arg2, 1, 32993, this.field320, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(ILtd;)V")
    public final void method51(int arg0, class422 arg1) {
        ++field140;
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg1.method2575(false), 0);
        if (arg0 != 3042) {
            this.method105((byte) 4);
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(Z)V")
    public final void method52(boolean arg0) {
        ++field167;
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "()Lq;")
    public final class396 method53() {
        ++field103;
        return this.field205;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "([IIIII)Lf;")
    public final class702 method54(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field125;
        return new class374(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(B)V")
    private final void method55(byte arg0) {
        if (this.field260 && this.field254 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 != 71) {
            this.method106();
        }
        ++field11;
    }

    @OriginalMember(owner = "client!us", name = "n", descriptor = "(I)V")
    private final void method56(int arg0) {
        if (arg0 == 0) {
            ++field55;
            if (this.field336) {
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5888);
                this.field336 = false;
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(IZ)V")
    public final void method57(int arg0, boolean arg1) {
        int var3 = -115 % ((-45 - arg0) / 32);
        ++field133;
        if (this.field240 != arg1) {
            if (arg1) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field240 = arg1;
            this.field246 &= -32;
        }
    }

    @OriginalMember(owner = "client!us", name = "o", descriptor = "(I)V")
    private final void method58(int arg0) {
        this.field352 = new class487[this.field303];
        ++field92;
        this.field255 = new class296(this, 3553, 6408, arg0, 1);
        new class296(this, 3553, 6408, 1, 1);
        new class296(this, 3553, 6408, 1, 1);
        this.field280 = new class241(this);
        this.field264 = new class241(this);
        this.field335 = new class241(this);
        this.field354 = new class241(this);
        this.field250 = new class241(this);
        this.field351 = new class241(this);
        this.field293 = new class241(this);
        this.field313 = new class241(this);
        this.field279 = new class241(this);
        this.field356 = new class241(this);
        if (this.field278) {
            this.field340 = new class323(this);
            new class323(this);
        }
    }

    @OriginalMember(owner = "client!us", name = "L", descriptor = "()V")
    public final void method59() {
        this.field349 = false;
        ++field77;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lpaa;B)V")
    public final void method60(class579 arg0, byte arg1) {
        int var3 = 121 % ((-14 - arg1) / 53);
        ++field190;
        if (this.field283) {
            this.method156(-23, arg0);
            this.method154(arg0, false);
        } else if (~this.field224 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field224 >= 0) {
                this.field225[this.field224].method2076(-108);
            }
            this.field216 = this.field221 = this.field225[++this.field224] = arg0;
            this.field216.method2090(29882);
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(ZI)V")
    public final void method61(boolean arg0, int arg1) {
        if (arg1 != 101) {
            this.field220 = null;
        }
        if (arg0 == !this.field260) {
            this.field260 = arg0;
            this.method55((byte) 71);
            this.field246 &= -32;
        }
        ++field90;
    }

    @OriginalMember(owner = "client!us", name = "la", descriptor = "(IIII)V")
    public final void method62(int arg0, int arg1, int arg2, int arg3) {
        this.field288 = arg1;
        this.field310 = arg2;
        this.field327 = arg3;
        this.field291 = arg0;
        ++field36;
        this.method83(16);
        this.method112(126);
        if (this.field348 == 3) {
            this.method16((byte) -79);
        } else if (this.field348 == 2) {
            this.method175(false);
        }
    }

    @OriginalMember(owner = "client!us", name = "x", descriptor = "()V")
    public final void method63() throws class105 {
        try {
            this.field175.swapBuffers();
        } catch (Exception var1) {
        }
        ++field184;
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(I)V")
    public final void method64(int arg0) {
        this.method130(6296);
        ++field4;
    }

    @OriginalMember(owner = "client!us", name = "p", descriptor = "(I)V")
    private final void method65(int arg0) {
        this.field328 = (float) (-this.field325 + this.field346) - this.field271;
        ++field1;
        this.field302 = -((float) this.field254 * this.field292) + this.field328;
        if (arg0 > -90) {
            this.field300 = 0.16814569F;
        }
        if ((float) this.field304 > this.field302) {
            this.field302 = (float) this.field304;
        }
        OpenGL.glFogf(2915, this.field302);
        OpenGL.glFogf(2916, this.field328);
        class119.field2130[2] = (float) class481.method2919(255, this.field324) / 255.0F;
        class119.field2130[1] = (float) class481.method2919(this.field324, 65280) / 65280.0F;
        class119.field2130[0] = (float) class481.method2919(16711680, this.field324) / 1.671168E7F;
        OpenGL.glFogfv(2918, class119.field2130, 0);
    }

    @OriginalMember(owner = "client!us", name = "BA", descriptor = "()I")
    public final int method66() {
        ++field156;
        return this.field304;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lcv;Z)V")
    public final void method67(class529 arg0, boolean arg1) {
        if (this.field281 != arg0) {
            if (this.field261) {
                OpenGL.glBindBufferARB(34963, arg0.method260((byte) -125));
            }
            this.field281 = arg0;
        }
        if (!arg1) {
            ++field143;
        }
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(III)V")
    public final synchronized void method68(int arg0, int arg1, int arg2) {
        ++field187;
        class149 var4 = new class149(arg1);
        var4.field6132 = (long) arg0;
        this.field233.method1229(var4, (byte) 120);
        if (arg2 != 18820) {
            this.field315 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "m", descriptor = "(IIIII)V")
    public final void method69(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field186;
        this.method36((byte) -125);
        this.method7(arg4, (byte) 76);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!us", name = "q", descriptor = "(I)V")
    private final void method70(int arg0) {
        if (this.field348 != 3) {
            this.field348 = 3;
            this.method16((byte) -59);
            this.method82(100);
            this.field246 &= -8;
        }
        ++field58;
        if (arg0 >= -123) {
            this.field203 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "([Lgfa;II)V")
    public static final void method71(class697[] arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = (arg1 + arg2) / 2;
            int var4 = arg1;
            class697 var5 = arg0[var3];
            arg0[var3] = arg0[arg2];
            arg0[arg2] = var5;
            int var6 = var5.field9808;
            for (int var7 = arg1; var7 < arg2; ++var7) {
                if (arg0[var7].field9808 < (var7 & 1) + var6) {
                    class697 var8 = arg0[var7];
                    arg0[var7] = arg0[var4];
                    arg0[var4++] = var8;
                }
            }
            arg0[arg2] = arg0[var4];
            arg0[var4] = var5;
            method71(arg0, arg1, var4 - 1);
            method71(arg0, var4 + 1, arg2);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lfi;I)V")
    public final void method72(class518 arg0, int arg1) {
        ++field86;
        this.field199.method2523(this, arg0, (byte) 20, arg1);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BZ)V")
    public static final void method73(byte arg0, boolean arg1) {
        if (arg0 == -16) {
            if (arg1) {
                if (class361.field5368 != -1) {
                    class173.method1301(class361.field5368, 0);
                }
                for (class601 var2 = (class601) class78.field1572.method2597((byte) 94); var2 != null; var2 = (class601) class78.field1572.method2594((byte) -122)) {
                    if (!var2.method2589(300)) {
                        var2 = (class601) class78.field1572.method2597((byte) -112);
                        if (var2 == null) {
                            break;
                        }
                    }
                    class101.method937((byte) -71, false, true, var2);
                }
                class361.field5368 = -1;
                class78.field1572 = new class427(8);
                class682.method3834((byte) 122);
                class361.field5368 = class444.field6382;
                class268.method1751(false, false);
                class293.method1954(0);
                class683.method3845(class361.field5368);
            }
            ++field45;
            class75.field1520 = true;
        }
    }

    @OriginalMember(owner = "client!us", name = "w", descriptor = "()Z")
    public final boolean method74() {
        ++field89;
        return true;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I[Lff;)V")
    public final void method75(int arg0, class9[] arg1) {
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field311[var3] = arg1[var3];
        }
        ++field159;
        this.field359 = arg0;
        if (~this.field348 != -2) {
            this.method79(1760986736);
        }
    }

    @OriginalMember(owner = "client!us", name = "IA", descriptor = "(IIIIII[BII)V")
    public final void method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field185;
        float var10;
        float var11;
        if (this.field315 != null && ~this.field315.field4431 <= ~arg2 && this.field315.field4441 >= arg3) {
            this.field315.method1970(-3159, 0, 0, 0, 6406, 0, arg3, arg2, false, arg6);
            var10 = (float) arg3 * this.field315.field3365 / (float) this.field315.field4441;
            var11 = (float) arg2 * this.field315.field3371 / (float) this.field315.field4431;
        } else {
            this.field315 = class680.method3824(2, arg2, 6406, false, arg3, 6406, this, arg6);
            this.field315.method1971(false, -114, false);
            var10 = this.field315.field3365;
            var11 = this.field315.field3371;
        }
        this.method136((byte) 125);
        this.method5(3845, this.field315);
        this.method7(arg8, (byte) 76);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method22(arg5, false);
        this.method148(34165, 34165, (byte) -127);
        this.method10(0, 768, 34166, 34192);
        this.method10(2, 770, 5890, 34192);
        this.method135((byte) 120, 34166, 0, 770);
        this.method135((byte) 47, 5890, 2, 770);
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
        this.method10(0, 768, 5890, 34192);
        this.method10(2, 770, 34166, 34192);
        this.method135((byte) -95, 5890, 0, 770);
        this.method135((byte) 88, 34166, 2, 770);
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(IZ)I")
    public final int method77(int arg0, boolean arg1) {
        if (!arg1) {
            this.field203 = null;
        }
        ++field118;
        if (arg0 != 5121 && arg0 != 5120) {
            if (arg0 != 5123 && ~arg0 != -5123) {
                if (~arg0 != -5126 && arg0 != 5124 && ~arg0 != -5127) {
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

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IF)V")
    public final void method78(int arg0, float arg1) {
        if (arg0 != 0) {
            this.method55((byte) -45);
        }
        ++field96;
        if (this.field312 != arg1) {
            this.field312 = arg1;
            if (this.field348 == 3) {
                this.method16((byte) -95);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "r", descriptor = "(I)V")
    private final void method79(int arg0) {
        if (arg0 == 1760986736) {
            ++field146;
            int var2;
            for (var2 = 0; var2 < this.field359; ++var2) {
                class9 var3 = this.field311[var2];
                class106.field1848[0] = (float) var3.method276(-1);
                int var4 = var2 + 16386;
                class106.field1848[1] = (float) var3.method273(false);
                class106.field1848[2] = (float) var3.method270(-110);
                class106.field1848[3] = 1.0F;
                OpenGL.glLightfv(var4, 4611, class106.field1848, 0);
                int var5 = var3.method269(true);
                float var6 = var3.method277(-1) / 255.0F;
                class106.field1848[0] = var6 * (float) class481.method2919(var5 >> 16, 255);
                class106.field1848[2] = (float) class481.method2919(var5, 255) * var6;
                class106.field1848[1] = var6 * (float) (class481.method2919(var5, 65309) >> 8);
                OpenGL.glLightfv(var4, 4609, class106.field1848, 0);
                OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method274((byte) 34) * var3.method274((byte) 34)));
                OpenGL.glEnable(var4);
            }
            while (this.field318 > var2) {
                OpenGL.glDisable(var2 + 16386);
                ++var2;
            }
            this.field318 = this.field359;
        }
    }

    @OriginalMember(owner = "client!us", name = "s", descriptor = "(I)V")
    private final void method80(int arg0) {
        if (arg0 != 0) {
            this.field361 = 74;
        }
        if (this.field329 >= this.field357 && this.field326 <= this.field301) {
            OpenGL.glScissor(this.field357 + this.field309, this.field316 + this.field24 - this.field301, -this.field357 + this.field329, -this.field326 + this.field301);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field123;
    }

    @OriginalMember(owner = "client!us", name = "ZA", descriptor = "(Z)V")
    public final void method81(boolean arg0) {
        ++field99;
        this.field277 = arg0;
        this.method179(5);
    }

    @OriginalMember(owner = "client!us", name = "t", descriptor = "(I)V")
    private final void method82(int arg0) {
        ++field128;
        OpenGL.glLoadIdentity();
        OpenGL.glMultMatrixf(this.field248.method2575(false), 0);
        if (this.field305) {
            this.field204.field6548.method3885((byte) -41);
        }
        int var2 = -29 % ((arg0 - -65) / 48);
        this.method15(-2);
        this.method79(1760986736);
    }

    @OriginalMember(owner = "client!us", name = "u", descriptor = "(I)V")
    private final void method83(int arg0) {
        ++field149;
        float[] var2 = this.field343;
        float var3 = (float) (-this.field291 * this.field304) / (float) this.field310;
        float var4 = (float) ((this.field131 - this.field291) * this.field304) / (float) this.field310;
        float var5 = (float) (this.field304 * this.field288) / (float) this.field327;
        float var6 = (float) ((-this.field24 + this.field288) * this.field304) / (float) this.field327;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field304 * 2.0F;
            var2[0] = var7 / (var4 - var3);
            var2[11] = -1.0F;
            var2[4] = 0.0F;
            var2[12] = 0.0F;
            var2[15] = 0.0F;
            var2[13] = 0.0F;
            var2[5] = var7 / (var5 - var6);
            var2[3] = 0.0F;
            var2[14] = this.field314 = -((float) this.field346 * var7) / (float) (-this.field304 + this.field346);
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[2] = 0.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[1] = 0.0F;
            var2[10] = this.field265 = (float) (-(this.field346 + this.field304)) / (float) (-this.field304 + this.field346);
            var2[7] = 0.0F;
            var2[6] = 0.0F;
        } else {
            var2[14] = 0.0F;
            var2[8] = 0.0F;
            var2[6] = 0.0F;
            var2[9] = 0.0F;
            var2[5] = 1.0F;
            var2[2] = 0.0F;
            var2[11] = 0.0F;
            var2[12] = 0.0F;
            var2[7] = 0.0F;
            var2[1] = 0.0F;
            var2[10] = 1.0F;
            var2[3] = 0.0F;
            var2[0] = 1.0F;
            var2[4] = 0.0F;
            var2[15] = 1.0F;
            var2[13] = 0.0F;
        }
        this.method115((byte) -118);
        if (arg0 != 16) {
            this.method109();
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Le;)V")
    public final void method84(class495 arg0) {
        ++field13;
        this.field214 = ((class382) arg0).field5644;
        if (this.field307 == null) {
            class424 var2 = new class424(80);
            if (!this.field267) {
                var2.method2584(0, -1.0F);
                var2.method2584(0, -1.0F);
                var2.method2584(0, 0.0F);
                var2.method2584(0, 0.0F);
                var2.method2584(0, 1.0F);
                var2.method2584(0, 1.0F);
                var2.method2584(0, -1.0F);
                var2.method2584(0, 0.0F);
                var2.method2584(0, 1.0F);
                var2.method2584(0, 1.0F);
                var2.method2584(0, 1.0F);
                var2.method2584(0, 1.0F);
                var2.method2584(0, 0.0F);
                var2.method2584(0, 1.0F);
                var2.method2584(0, 0.0F);
                var2.method2584(0, -1.0F);
                var2.method2584(0, 1.0F);
                var2.method2584(0, 0.0F);
                var2.method2584(0, 0.0F);
                var2.method2584(0, 0.0F);
            } else {
                var2.method2583(-1.0F, -87);
                var2.method2583(-1.0F, -73);
                var2.method2583(0.0F, -104);
                var2.method2583(0.0F, -123);
                var2.method2583(1.0F, -125);
                var2.method2583(1.0F, -91);
                var2.method2583(-1.0F, -110);
                var2.method2583(0.0F, -99);
                var2.method2583(1.0F, -101);
                var2.method2583(1.0F, -80);
                var2.method2583(1.0F, -82);
                var2.method2583(1.0F, -76);
                var2.method2583(0.0F, -86);
                var2.method2583(1.0F, -93);
                var2.method2583(0.0F, -75);
                var2.method2583(-1.0F, -82);
                var2.method2583(1.0F, -108);
                var2.method2583(0.0F, -111);
                var2.method2583(0.0F, -85);
                var2.method2583(0.0F, -128);
            }
            this.field307 = this.method49(var2.field1397, 20, var2.field1393, false, 11645);
            this.field286 = new class423(this.field307, 5126, 3, 0);
            this.field253 = new class423(this.field307, 5126, 2, 12);
            this.field199.method2519(this, 90);
        }
    }

    @OriginalMember(owner = "client!us", name = "e", descriptor = "(IIIII)V")
    public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        ++field181;
        if (~this.field357 >= ~(arg0 + arg2) && -arg2 + arg0 <= this.field329 && ~(arg1 + arg2) <= ~this.field326 && ~(-arg2 + arg1) >= ~this.field301) {
            this.method36((byte) -125);
            this.method7(arg4, (byte) 76);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field297 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if ((float) var8 <= this.field308) {
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
                int var10 = class264.method1730(93, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = 16384 - var10; var11 > 0; var11 -= var10) {
                    OpenGL.glVertex2f(class384.field5650[var11] * (float) arg2 + var6, class384.field5651[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "U", descriptor = "()I")
    public final int method86() {
        ++field102;
        return this.field346;
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(Z)Lmda;")
    public final class243 method87(boolean arg0) {
        ++field65;
        if (arg0) {
            return null;
        } else {
            return this.field331 != null ? this.field331.method1953(-513) : null;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field81;
        this.method36((byte) -125);
        this.method7(arg9, (byte) 76);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Ljs;Ljs;FLjs;)Ljs;")
    public final class304 method89(class304 arg0, class304 arg1, float arg2, class304 arg3) {
        ++field48;
        if (arg0 != null && arg1 != null && this.field337 && this.field278) {
            class293 var5 = null;
            class478 var6 = (class478) arg0;
            class478 var7 = (class478) arg1;
            class243 var8 = var6.method1953(-513);
            class243 var9 = var7.method1953(-513);
            if (var8 != null && var9 != null) {
                int var10 = var9.field3671 >= var8.field3671 ? var9.field3671 : var8.field3671;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class293) {
                    class293 var11 = (class293) arg3;
                    if (~var10 == ~var11.method1957(-95)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class293(this, var10);
                }
                if (var5.method1951(arg2, var8, var9, (byte) -33)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!us", name = "e", descriptor = "(B)V")
    private final void method90(byte arg0) {
        ++field129;
        if (arg0 <= 16) {
            this.method172(false, 43);
        }
        OpenGL.glViewport(this.field309, this.field316, this.field131, this.field24);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IBII)V")
    public final void method91(int arg0, byte arg1, int arg2, int arg3) {
        OpenGL.glDrawArrays(arg0, arg2, arg3);
        ++field15;
        if (arg1 > -40) {
            this.field292 = 0.28544673F;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIIII)V")
    public final void method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field165;
        this.method41(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!us", name = "AA", descriptor = "(III[I)V")
    public final void method93(int arg0, int arg1, int arg2, int[] arg3) {
        ++field113;
        float var5 = (float) arg2 * this.field244.field6075 + (float) arg0 * this.field244.field6078 + (float) arg1 * this.field244.field6081 + this.field244.field6077;
        if (!(var5 < (float) this.field304) && !((float) this.field346 < var5)) {
            int var6 = (int) (((float) arg2 * this.field244.field6100 + (float) arg0 * this.field244.field6101 + (float) arg1 * this.field244.field6102 + this.field244.field6099) * (float) this.field310 / var5);
            int var7 = (int) (((float) arg2 * this.field244.field6083 + (float) arg0 * this.field244.field6112 + (float) arg1 * this.field244.field6079 + this.field244.field6109) * (float) this.field327 / var5);
            if (this.field252 <= (float) var6 && (float) var6 <= this.field306 && (float) var7 >= this.field257 && (float) var7 <= this.field273) {
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 - this.field257);
                arg3[0] = (int) ((float) var6 + -this.field252);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!us", name = "p", descriptor = "()V")
    public final void method94() {
        ++field7;
        this.field202.method1866(111);
    }

    @OriginalMember(owner = "client!us", name = "VA", descriptor = "(IFFFFF)V")
    public final void method95(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field84;
        boolean var7 = ~this.field294 != ~arg0;
        if (var7 || this.field300 != arg1 || this.field338 != arg2) {
            this.field338 = arg2;
            this.field300 = arg1;
            this.field294 = arg0;
            if (var7) {
                this.field290 = (float) (255 & this.field294) / 255.0F;
                this.field319 = (float) (65280 & this.field294) / 65280.0F;
                this.field321 = (float) (this.field294 & 16711680) / 1.671168E7F;
                this.method18(115);
            }
            this.method105((byte) -80);
        }
        if (this.field344[0] != arg3 || this.field344[1] != arg4 || this.field344[2] != arg5) {
            this.field344[2] = arg5;
            this.field344[1] = arg4;
            this.field344[0] = arg3;
            this.field258[0] = -arg3;
            this.field258[1] = -arg4;
            this.field258[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field268[1] = arg4 * var8;
            this.field268[0] = arg3 * var8;
            this.field268[2] = arg5 * var8;
            this.field299[2] = -this.field268[2];
            this.field299[1] = -this.field268[1];
            this.field299[0] = -this.field268[0];
            this.method15(-2);
            this.field334 = (int) (arg3 * 256.0F / arg4);
            this.field330 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!us", name = "f", descriptor = "(IIIIII)Ljs;")
    public final class304 method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field135;
        return !this.field337 ? null : new class522(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(IB)V")
    public final synchronized void method97(int arg0, byte arg1) {
        if (arg1 > -106) {
            this.method39(46, 68, 91, 109);
        }
        ++field122;
        class425 var3 = new class425();
        var3.field6132 = (long) arg0;
        this.field237.method1229(var3, (byte) 120);
    }

    @OriginalMember(owner = "client!us", name = "l", descriptor = "()Z")
    public final boolean method98() {
        ++field173;
        return false;
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(II)V")
    public static final void method99(int arg0, int arg1) {
        ++field180;
        for (class425 var2 = class526.field7412.method2597((byte) 108); var2 != null; var2 = class526.field7412.method2594((byte) -122)) {
            if (~((long) arg0) == ~(65535L & var2.field6132 >> 48)) {
                var2.method2588(300);
            }
        }
        int var3 = -70 / ((-3 - arg1) / 52);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(FBF)V")
    public final void method100(float arg0, byte arg1, float arg2) {
        this.field271 = arg2;
        ++field157;
        this.field292 = arg0;
        this.method65(-95);
        if (arg1 >= -62) {
            this.field312 = -0.22772343F;
        }
    }

    @OriginalMember(owner = "client!us", name = "v", descriptor = "(I)V")
    private final void method101(int arg0) {
        ++field114;
        if (~this.field348 != arg0) {
            this.field348 = 2;
            this.method175(false);
            this.method82(-113);
            this.field246 &= -8;
        }
    }

    @OriginalMember(owner = "client!us", name = "T", descriptor = "()I")
    public final int method102() {
        ++field154;
        int var1 = this.field363;
        this.field363 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!us", name = "y", descriptor = "()V")
    public final void method103() {
        ++field91;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BI)I")
    public static final int method104(byte arg0, int arg1) {
        int var2 = 103 % ((71 - arg0) / 34);
        ++field47;
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!us", name = "f", descriptor = "(B)V")
    private final void method105(byte arg0) {
        if (arg0 >= -59) {
            this.field357 = -52;
        }
        class119.field2130[1] = this.field319 * this.field300;
        ++field163;
        class119.field2130[3] = 1.0F;
        class119.field2130[0] = this.field321 * this.field300;
        class119.field2130[2] = this.field300 * this.field290;
        OpenGL.glLightfv(16384, 4609, class119.field2130, 0);
        class119.field2130[3] = 1.0F;
        class119.field2130[0] = -this.field338 * this.field321;
        class119.field2130[2] = -this.field338 * this.field290;
        class119.field2130[1] = -this.field338 * this.field319;
        OpenGL.glLightfv(16385, 4609, class119.field2130, 0);
    }

    @OriginalMember(owner = "client!us", name = "s", descriptor = "()V")
    public final void method106() {
        ++field70;
        if (this.field332 && this.field131 > 0 && this.field24 > 0) {
            int var1 = this.field357;
            int var2 = this.field329;
            int var3 = this.field326;
            int var4 = this.field301;
            this.method107();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method128((byte) 55);
            this.method61(false, 101);
            this.method172(false, 4);
            this.method57(103, false);
            this.method45(false, -122);
            this.method5(3845, (class487) null);
            this.method161(-101, -2);
            this.method133(1, (byte) -122);
            this.method7(0, (byte) 76);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field131, this.field24, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method142(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!us", name = "JA", descriptor = "()V")
    public final void method107() {
        this.field329 = this.field131;
        this.field326 = 0;
        this.field301 = this.field24;
        this.field357 = 0;
        ++field31;
        OpenGL.glDisable(3089);
        this.method112(120);
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(IIIIII)V")
    public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field141;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        this.method36((byte) -125);
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method7(arg5, (byte) 76);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field282) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field282) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!us", name = "v", descriptor = "()[I")
    public final int[] method109() {
        ++field73;
        return new int[] { this.field291, this.field288, this.field310, this.field327 };
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(IZ)I")
    public final int method110(int arg0, boolean arg1) {
        if (!arg1) {
            return 31;
        } else {
            ++field64;
            if (~arg0 != -2) {
                if (arg0 == 0) {
                    return 8448;
                } else if (arg0 == 2) {
                    return 34165;
                } else if (~arg0 != -4) {
                    if (arg0 == 4) {
                        return 34023;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    return 260;
                }
            } else {
                return 7681;
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "g", descriptor = "()V")
    public final void method111() {
        ++field30;
        if (!this.field278) {
            if (!this.field269) {
                throw new RuntimeException("");
            }
            this.field220.method1742(0, 0, this.field131, this.field24, 0, 0);
            this.field175.setSurface(this.field121);
        } else {
            if (this.field221 != this.field226) {
                throw new RuntimeException();
            }
            this.field226.method2074(0, -57);
            this.field226.method2074(8, -85);
            this.method141(2131, this.field226);
        }
        this.field131 = this.field105;
        this.field220 = null;
        this.field24 = this.field166;
        this.method128((byte) -60);
        this.method90((byte) 44);
        this.method107();
    }

    @OriginalMember(owner = "client!us", name = "w", descriptor = "(I)V")
    private final void method112(int arg0) {
        this.field273 = (float) (-this.field288 + this.field301);
        ++field189;
        this.field306 = (float) (-this.field291 + this.field329);
        this.field252 = (float) (-this.field291 + this.field357);
        this.field257 = (float) (-this.field288 + this.field326);
        if (arg0 < 119) {
            this.field350 = false;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public final class37 method113(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field139;
        return new class350(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!us", name = "f", descriptor = "()Z")
    public final boolean method114() {
        ++field138;
        return true;
    }

    @OriginalMember(owner = "client!us", name = "g", descriptor = "(B)V")
    private final void method115(byte arg0) {
        this.field343[14] = this.field314;
        this.field343[10] = this.field265;
        ++field191;
        if (arg0 >= -16) {
            this.method60((class579) null, (byte) 101);
        }
        this.field272 = (float) this.field346;
        this.field275 = (this.field343[14] + (float) (-this.field346)) / this.field343[10];
    }

    @OriginalMember(owner = "client!us", name = "DA", descriptor = "()I")
    public final int method116() {
        ++field33;
        int var1 = this.field361;
        this.field361 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!us", name = "h", descriptor = "(B)V")
    private final void method117(byte arg0) {
        ++field171;
        int var2 = 0;
        while (!this.field175.method3324()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class185.method1354(1000L, 10);
        }
        if (arg0 != 126) {
            this.field351 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BII)V")
    public final synchronized void method118(byte arg0, int arg1, int arg2) {
        if (arg0 != -36) {
            this.method131((int[]) null);
        }
        ++field151;
        class149 var4 = new class149(arg1);
        var4.field6132 = (long) arg2;
        this.field236.method1229(var4, (byte) 120);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "([I)V")
    public final void method119(int[] arg0) {
        arg0[1] = this.field24;
        arg0[0] = this.field131;
        ++field161;
    }

    @OriginalMember(owner = "client!us", name = "FA", descriptor = "(ILua;II)V")
    public final void method120(int arg0, class619 arg1, int arg2, int arg3) {
        ++field66;
        class394 var5 = (class394) arg1;
        class225 var6 = var5.field5764;
        this.method136((byte) -100);
        this.method5(3845, var5.field5764);
        this.method7(1, (byte) 76);
        this.method148(8448, 7681, (byte) -101);
        this.method10(0, 768, 34167, 34192);
        float var7 = var6.field3371 / (float) var6.field3370;
        float var8 = var6.field3365 / (float) var6.field3363;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field357) * var7, (float) (this.field326 - arg3) * var8);
        OpenGL.glVertex2i(this.field357, this.field326);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field357) * var7, (float) (-arg3 + this.field301) * var8);
        OpenGL.glVertex2i(this.field357, this.field301);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field329) * var7, (float) (-arg3 + this.field301) * var8);
        OpenGL.glVertex2i(this.field329, this.field301);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field329) * var7, (float) (-arg3 + this.field326) * var8);
        OpenGL.glVertex2i(this.field329, this.field326);
        OpenGL.glEnd();
        this.method10(0, 768, 5890, 34192);
    }

    @OriginalMember(owner = "client!us", name = "x", descriptor = "(I)I")
    private final int method121(int arg0) {
        ++field158;
        this.field317 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field284 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field317.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (this.field317.indexOf("brian paul") != -1 || ~this.field317.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        int var3 = 6 / ((arg0 - 65) / 60);
        String var4 = OpenGL.glGetString(7938);
        String[] var5 = class394.method2433(' ', var4.replace('.', ' '), (byte) 89);
        if (~var5.length <= -3) {
            try {
                int var6 = class108.method975(var5[0], -10426);
                int var7 = class108.method975(var5[1], -10426);
                this.field323 = var6 * 10 + var7;
            } catch (NumberFormatException var9) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (this.field323 < 12) {
            var2 |= 2;
        }
        if (!this.field175.method3325("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field175.method3325("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var8 = new int[1];
        OpenGL.glGetIntegerv(34018, var8, 0);
        this.field303 = var8[0];
        OpenGL.glGetIntegerv(34929, var8, 0);
        this.field322 = var8[0];
        OpenGL.glGetIntegerv(34930, var8, 0);
        this.field262 = var8[0];
        if (~this.field303 > -3 || ~this.field322 > -3 || this.field262 < 2) {
            var2 |= 16;
        }
        this.field267 = Stream.method3580();
        this.field269 = this.field175.arePbuffersAvailable();
        this.field261 = this.field175.method3325("GL_ARB_vertex_buffer_object");
        this.field282 = this.field175.method3325("GL_ARB_multisample");
        this.field263 = this.field175.method3325("GL_ARB_vertex_program");
        this.field175.method3325("GL_ARB_fragment_program");
        this.field355 = this.field175.method3325("GL_ARB_vertex_shader");
        this.field358 = this.field175.method3325("GL_ARB_fragment_shader");
        this.field345 = this.field175.method3325("GL_EXT_texture3D");
        this.field259 = this.field175.method3325("GL_ARB_texture_rectangle");
        this.field337 = this.field175.method3325("GL_ARB_texture_cube_map");
        this.field287 = this.field175.method3325("GL_ARB_texture_float");
        this.field350 = false;
        this.field278 = this.field175.method3325("GL_EXT_framebuffer_object");
        this.field283 = this.field175.method3325("GL_EXT_framebuffer_blit");
        this.field289 = this.field175.method3325("GL_EXT_framebuffer_multisample");
        this.field270 = this.field289 & this.field283;
        OpenGL.glGetFloatv(2834, class119.field2130, 0);
        this.field297 = class119.field2130[0];
        this.field308 = class119.field2130[1];
        return ~var2 != -1 ? var2 : 0;
    }

    @OriginalMember(owner = "client!us", name = "g", descriptor = "(I)V")
    public final synchronized void method122(int arg0) {
        ++field109;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field233.method1223(-2)) {
            class149 var12 = (class149) this.field233.method1226(0);
            class691.field9756[var3++] = (int) var12.field6132;
            this.field232 -= var12.field2560;
            if (~var3 == -1001) {
                OpenGL.glDeleteBuffersARB(var3, class691.field9756, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class691.field9756, 0);
            var3 = 0;
        }
        while (!this.field234.method1223(-2)) {
            class149 var11 = (class149) this.field234.method1226(0);
            class691.field9756[var3++] = (int) var11.field6132;
            this.field228 -= var11.field2560;
            if (~var3 == -1001) {
                OpenGL.glDeleteTextures(var3, class691.field9756, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class691.field9756, 0);
            var3 = 0;
        }
        while (!this.field235.method1223(-2)) {
            class149 var10 = (class149) this.field235.method1226(0);
            class691.field9756[var3++] = var10.field2560;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class691.field9756, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class691.field9756, 0);
            var3 = 0;
        }
        while (!this.field236.method1223(-2)) {
            class149 var9 = (class149) this.field236.method1226(0);
            class691.field9756[var3++] = (int) var9.field6132;
            this.field231 -= var9.field2560;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class691.field9756, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class691.field9756, 0);
            boolean var4 = false;
        }
        while (!this.field229.method1223(-2)) {
            class149 var8 = (class149) this.field229.method1226(0);
            OpenGL.glDeleteLists((int) var8.field6132, var8.field2560);
        }
        while (!this.field237.method1223(-2)) {
            class425 var7 = this.field237.method1226(0);
            OpenGL.glDeleteProgramARB((int) var7.field6132);
        }
        while (!this.field238.method1223(-2)) {
            class425 var6 = this.field238.method1226(0);
            OpenGL.glDeleteObjectARB(var6.field6132);
        }
        while (!this.field229.method1223(-2)) {
            class149 var5 = (class149) this.field229.method1226(0);
            OpenGL.glDeleteLists((int) var5.field6132, var5.field2560);
        }
        this.field197.method3809(true);
        if (~this.method149() < -100663297 && ~class525.method3074((byte) -101) < ~(this.field241 + 60000L)) {
            System.gc();
            this.field241 = class525.method3074((byte) -101);
        }
        this.field215 = var2;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lfi;)V")
    public final void method123(class518 arg0) {
        this.field199.method2523(this, arg0, (byte) 40, -1);
        ++field134;
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(ZI)I")
    public final int method124(boolean arg0, int arg1) {
        if (!arg0) {
            this.field310 = -90;
        }
        ++field10;
        if (~arg1 != -6407 && arg1 != 6409) {
            if (~arg1 != -6411 && arg1 != 34846 && ~arg1 != -34845) {
                if (~arg1 == -6408) {
                    return 3;
                } else if (arg1 != 6408 && ~arg1 != -34848) {
                    if (~arg1 == -34844) {
                        return 6;
                    } else if (~arg1 == -34843) {
                        return 8;
                    } else if (arg1 == 6402) {
                        return 3;
                    } else if (~arg1 == -6402) {
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

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(II)V")
    public final void method125(int arg0, int arg1) {
        int var3 = -56 / ((28 - arg1) / 49);
        ++field71;
        if (this.field341 != arg0) {
            OpenGL.glActiveTexture(33984 - -arg0);
            this.field341 = arg0;
        }
    }

    @OriginalMember(owner = "client!us", name = "XA", descriptor = "(IIIII)V")
    public final void method126(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method36((byte) -125);
        ++field72;
        this.method7(arg4, (byte) 76);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!us", name = "h", descriptor = "()Z")
    public final boolean method127() {
        ++field179;
        return false;
    }

    @OriginalMember(owner = "client!us", name = "i", descriptor = "(B)V")
    public final void method128(byte arg0) {
        int var2 = -96 / (-arg0 / 35);
        ++field9;
        if (this.field348 != 0) {
            this.field348 = 0;
            this.field246 &= -32;
        }
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(Z)V")
    private final void method129(boolean arg0) {
        if (this.field88 == null) {
            this.field105 = this.field166 = 0;
        } else {
            Dimension var2 = this.field88.getSize();
            this.field105 = var2.width;
            this.field166 = var2.height;
        }
        if (arg0) {
            this.field326 = -84;
        }
        ++field144;
        if (this.field221 == null) {
            this.field24 = this.field166;
            this.field131 = this.field105;
            this.method90((byte) 51);
        }
        this.method128((byte) -74);
        this.method107();
    }

    @OriginalMember(owner = "client!us", name = "y", descriptor = "(I)V")
    private final void method130(int arg0) {
        ++field50;
        if (arg0 != 6296) {
            this.method181();
        }
        this.field175.method3326();
    }

    @OriginalMember(owner = "client!us", name = "oa", descriptor = "([I)V")
    public final void method131(int[] arg0) {
        ++field82;
        arg0[1] = this.field326;
        arg0[0] = this.field357;
        arg0[3] = this.field301;
        arg0[2] = this.field329;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lf;Z)V")
    public final void method132(class702 arg0, boolean arg1) {
        this.field220 = (class374) arg0;
        ++field137;
        if (this.field278) {
            if (this.field226 == null) {
                this.field226 = new class323(this);
            }
            if (this.field221 == this.field226) {
                throw new RuntimeException();
            }
            this.method60(this.field226, (byte) -110);
            if (arg1) {
                class540 var3 = (class540) this.field227.method2596((long) (this.field220.method1792() << 16 | this.field220.method1785()), 71);
                if (var3 == null) {
                    var3 = new class540(this, 6402, this.field220.method1792(), this.field220.method1785());
                    class540 var5;
                    for (this.field230 += var3.field7557; ~this.field230 < -2097153; this.field230 -= var5.field7557) {
                        class678 var4 = this.field218.method3028((byte) 86);
                        if (var4 == null) {
                            break;
                        }
                        var5 = (class540) var4;
                        var5.method3813(-103);
                        var5.method2588(300);
                        var5.method3115(false);
                    }
                    this.field227.method2598(var3, (long) (this.field220.method1792() << 16 | this.field220.method1785()), (byte) 8);
                }
                this.field218.method3022(var3, 0);
                this.field226.method2095((byte) -9, 8, var3);
            }
            this.field226.method2089(this.field220.field5577, (byte) 117, 0);
        } else {
            if (!this.field269) {
                throw new RuntimeException("");
            }
            class84 var6 = (class84) this.field227.method2596((long) (this.field220.method1792() << 16 | this.field220.method1785()), 56);
            if (var6 == null) {
                var6 = new class84(this, this.field220.method1792(), this.field220.method1785());
                class84 var8;
                for (this.field230 += var6.field1608 * 4; this.field230 > 2097152; this.field230 -= var8.field1608) {
                    class678 var7 = this.field218.method3028((byte) 122);
                    if (var7 == null) {
                        break;
                    }
                    var8 = (class84) var7;
                    var8.method3813(-128);
                    var8.method2588(300);
                    this.field175.releasePbuffer(var8.method848(0));
                }
                this.field227.method2598(var6, (long) (this.field220.method1792() << 16 | this.field220.method1785()), (byte) 8);
            }
            this.field218.method3022(var6, 0);
            this.field175.setPbuffer(var6.method848(0));
        }
        this.field131 = arg0.method1792();
        this.field24 = arg0.method1785();
        this.method128((byte) 85);
        this.method90((byte) 90);
        this.method107();
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;I)V")
    public class1(Canvas arg0, class214 arg1, int arg2) {
        super(arg1);
        this.field196 = arg2;
        this.field88 = this.field153 = arg0;
        if (!class251.method1681("jaclib", 334)) {
            throw new RuntimeException("");
        } else if (!class251.method1681("jaggl", 334)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field175 = new OpenGL();
                this.field121 = this.field29 = this.field175.init(arg0, 8, 8, 8, 24, 0, this.field196);
                if (~this.field29 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method117((byte) 126);
                    int var4 = this.method121(-99);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field320 = !this.field267 ? 5121 : 33639;
                        if (this.field284.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class394.method2433(' ', this.field284.replace('/', ' '), (byte) -49);
                            for (int var9 = 0; ~var8.length < ~var9; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (var10.charAt(0) == 'x' && ~var10.length() <= -4 && class323.method2083(var10.substring(1, 3), 24369)) {
                                            var7 = true;
                                            var10 = var10.substring(1);
                                        }
                                        if (var10.equals("hd")) {
                                            var6 = true;
                                        } else {
                                            if (var10.startsWith("hd")) {
                                                var10 = var10.substring(2);
                                                var6 = true;
                                            }
                                            if (var10.length() >= 4 && class323.method2083(var10.substring(0, 4), 24369)) {
                                                var5 = class108.method975(var10.substring(0, 4), -10426);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && ~var5 >= -9251) {
                                    this.field345 = false;
                                }
                                if (~var5 <= -7001 && var5 <= 7999) {
                                    this.field261 = false;
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field287 = false;
                            }
                            this.field259 &= this.field175.method3325("GL_ARB_half_float_pixel");
                            this.field251 = this.field261;
                            this.field342 = true;
                        }
                        if (this.field317.indexOf("intel") != -1) {
                            this.field278 = false;
                        }
                        this.field332 = !this.field317.equals("s3 graphics");
                        if (this.field261) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class377.method2364(false, true, -40);
                        this.field210 = true;
                        this.field197 = new class677(this, super.field2768);
                        this.method58(1);
                        this.field213 = new class343(this);
                        this.field202 = new class283(this);
                        if (this.field202.method1871((byte) -126)) {
                            this.field203 = new class563(this);
                            if (!this.field203.method3271(true)) {
                                this.field203.method2790((byte) -122);
                                this.field203 = null;
                            }
                        }
                        this.field204 = new class459(this);
                        this.method166(1);
                        this.method129(false);
                        this.method106();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method40();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(IB)V")
    public final void method133(int arg0, byte arg1) {
        ++field116;
        if (arg0 == 1) {
            this.method148(7681, 7681, (byte) -114);
        } else if (arg0 == 0) {
            this.method148(8448, 8448, (byte) -106);
        } else if (arg0 != 2) {
            if (~arg0 != -4) {
                if (arg0 == 4) {
                    this.method148(34023, 34023, (byte) -110);
                }
            } else {
                this.method148(8448, 260, (byte) -117);
            }
        } else {
            this.method148(7681, 34165, (byte) -128);
        }
        if (arg1 >= -117) {
            this.field263 = true;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
    public final void method134(int arg0) {
        this.method117((byte) 126);
        ++field79;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BIII)V")
    public final void method135(byte arg0, int arg1, int arg2, int arg3) {
        ++field67;
        int var5 = 43 / ((-32 - arg0) / 41);
        OpenGL.glTexEnvi(8960, arg2 + 34184, arg1);
        OpenGL.glTexEnvi(8960, arg2 + 34200, arg3);
    }

    @OriginalMember(owner = "client!us", name = "j", descriptor = "(B)V")
    public final void method136(byte arg0) {
        int var2 = -116 / ((63 - arg0) / 62);
        if (~this.field246 != -3) {
            this.method167(-13966);
            this.method61(false, 101);
            this.method172(false, 4);
            this.method57(-123, false);
            this.method45(false, -119);
            this.method161(84, -2);
            this.field246 = 2;
        }
        ++field74;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(FFIFF)V")
    public final void method137(float arg0, float arg1, int arg2, float arg3, float arg4) {
        class119.field2130[1] = arg3;
        class119.field2130[0] = arg0;
        class119.field2130[3] = arg1;
        ++field38;
        class119.field2130[2] = arg4;
        OpenGL.glTexEnvfv(8960, 8705, class119.field2130, arg2);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZII)V")
    public final void method138(boolean arg0, int arg1, int arg2) {
        ++field148;
        this.field316 = arg1;
        this.field309 = arg2;
        if (arg0) {
            this.field361 = 26;
        }
        this.method90((byte) 85);
        this.method80(0);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIIF)Lff;")
    public final class9 method139(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field136;
        return new class148(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIII)V")
    public final void method140(int arg0, int arg1, int arg2, int arg3) {
        this.field202.method1869(arg1, arg0, arg2, 114, arg3);
        ++field117;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILpaa;)V")
    public final void method141(int arg0, class579 arg1) {
        ++field87;
        if (arg0 != 2131) {
            this.field333 = null;
        }
        if (this.field283) {
            this.method1((byte) -76, arg1);
            this.method157(25133, arg1);
        } else if (this.field224 >= 0 && this.field225[this.field224] == arg1) {
            this.field225[this.field224--] = null;
            arg1.method2076(-78);
            if (~this.field224 > -1) {
                this.field216 = this.field221 = null;
            } else {
                this.field216 = this.field221 = this.field225[this.field224];
                this.field216.method2090(29882);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!us", name = "da", descriptor = "(IIII)V")
    public final void method142(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field131 > ~arg2) {
            arg2 = this.field131;
        }
        ++field76;
        if (~arg1 > -1) {
            arg1 = 0;
        }
        if (arg3 > this.field24) {
            arg3 = this.field24;
        }
        if (~arg0 > -1) {
            arg0 = 0;
        }
        this.field357 = arg0;
        this.field326 = arg1;
        this.field301 = arg3;
        this.field329 = arg2;
        OpenGL.glEnable(3089);
        this.method112(127);
        this.method80(0);
    }

    @OriginalMember(owner = "client!us", name = "ra", descriptor = "(F)V")
    public final void method143(float arg0) {
        ++field124;
        if (this.field296 != arg0) {
            this.field296 = arg0;
            this.method18(84);
        }
    }

    @OriginalMember(owner = "client!us", name = "V", descriptor = "(IIII)V")
    public final void method144(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field301 < ~arg3) {
            this.field301 = arg3;
        }
        if (this.field357 < arg0) {
            this.field357 = arg0;
        }
        ++field95;
        if (arg1 > this.field326) {
            this.field326 = arg1;
        }
        if (~this.field329 < ~arg2) {
            this.field329 = arg2;
        }
        OpenGL.glEnable(3089);
        this.method112(127);
        this.method80(0);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lq;)V")
    public final void method145(class396 arg0) {
        ++field28;
        this.field244.method896(arg0);
        this.field248.method896(this.field244);
        this.field248.method2569((byte) -126);
        this.field249.method2567((byte) -115, this.field248);
        if (this.field348 != 1) {
            this.method82(-119);
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)V")
    public final void method146(int arg0) {
        ++field22;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!us", name = "r", descriptor = "()Z")
    public final boolean method147() {
        ++field23;
        return true;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(IIB)V")
    public final void method148(int arg0, int arg1, byte arg2) {
        if (this.field341 != 0) {
            OpenGL.glTexEnvi(8960, 34161, arg1);
            OpenGL.glTexEnvi(8960, 34162, arg0);
        } else {
            boolean var4 = false;
            if (~this.field339 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                var4 = true;
                this.field339 = arg1;
            }
            if (~this.field276 != ~arg0) {
                OpenGL.glTexEnvi(8960, 34162, arg0);
                var4 = true;
                this.field276 = arg0;
            }
            if (var4) {
                this.field246 &= -30;
            }
        }
        ++field14;
        if (arg2 > -96) {
            method104((byte) 64, -114);
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "()I")
    public final int method149() {
        ++field59;
        return this.field231 + this.field228 + this.field232;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI[BII)Lcv;")
    public final class529 method150(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        if (arg3 < 25) {
            this.method101(77);
        }
        ++field25;
        return (class529) (!this.field261 || arg0 && !this.field251 ? new class603(this, arg1, arg2, arg4) : new class8(this, arg1, arg2, arg4, arg0));
    }

    @OriginalMember(owner = "client!us", name = "j", descriptor = "()I")
    public final int method151() {
        ++field42;
        return 4;
    }

    @OriginalMember(owner = "client!us", name = "pa", descriptor = "(III)V")
    public final void method152(int arg0, int arg1, int arg2) {
        ++field57;
        if (this.field324 != arg0 || ~this.field254 != ~arg1 || ~this.field325 != ~arg2) {
            this.field325 = arg2;
            this.field324 = arg0;
            this.field254 = arg1;
            this.method65(-113);
            this.method55((byte) 71);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(FFFI)V")
    private final void method153(float arg0, float arg1, float arg2, int arg3) {
        if (arg3 <= -108) {
            OpenGL.glMatrixMode(5890);
            ++field32;
            if (this.field336) {
                OpenGL.glLoadIdentity();
            }
            OpenGL.glTranslatef(arg2, arg0, arg1);
            OpenGL.glMatrixMode(5888);
            this.field336 = true;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lpaa;Z)V")
    public final void method154(class579 arg0, boolean arg1) {
        if (arg1) {
            this.field258 = null;
        }
        ++field126;
        if (~this.field223 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field223 <= -1) {
                this.field217[this.field223].method2085((byte) -126);
            }
            this.field221 = this.field217[++this.field223] = arg0;
            this.field221.method2082((byte) -29);
        }
    }

    @OriginalMember(owner = "client!us", name = "z", descriptor = "(I)V")
    public static void method155(int arg0) {
        field174 = null;
        int var1 = -121 / ((arg0 - 26) / 32);
        field193 = null;
        field54 = null;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(ILpaa;)V")
    public final void method156(int arg0, class579 arg1) {
        int var3 = -126 / ((arg0 - 64) / 53);
        ++field111;
        if (this.field219 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field219 <= -1) {
                this.field222[this.field219].method2077(true);
            }
            this.field216 = this.field222[++this.field219] = arg1;
            this.field216.method2084(124);
        }
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(ILpaa;)V")
    public final void method157(int arg0, class579 arg1) {
        ++field132;
        if (this.field223 >= 0 && this.field217[this.field223] == arg1) {
            this.field217[this.field223--] = null;
            if (arg0 != 25133) {
                this.field279 = null;
            }
            arg1.method2085((byte) -66);
            if (~this.field223 <= -1) {
                this.field221 = this.field217[this.field223];
                this.field221.method2082((byte) -29);
            } else {
                this.field221 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(II[I[I)Lua;")
    public final class619 method158(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field34;
        return class444.method2670(this, arg0, arg3, arg2, arg1, true);
    }

    @OriginalMember(owner = "client!us", name = "e", descriptor = "()Z")
    public final boolean method159() {
        ++field5;
        return true;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Ldaa;[Lvw;Z)Lla;")
    public final class421 method160(class11 arg0, class279[] arg1, boolean arg2) {
        ++field200;
        return new class411(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!us", name = "e", descriptor = "(II)V")
    public final void method161(int arg0, int arg1) {
        int var3 = -103 / ((arg0 - 3) / 47);
        this.method21(2, true, arg1);
        ++field106;
    }

    @OriginalMember(owner = "client!us", name = "B", descriptor = "()Z")
    public final boolean method162() {
        ++field147;
        return this.field203 != null && this.field203.method2784(3116);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)V")
    public final void method163(boolean arg0) {
        ++field51;
    }

    @OriginalMember(owner = "client!us", name = "e", descriptor = "(Z)V")
    public final void method164(boolean arg0) {
        if (arg0) {
            this.field203 = null;
        }
        OpenGL.glPopMatrix();
        ++field188;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Ljs;)V")
    public final void method165(class304 arg0) {
        this.field331 = (class478) arg0;
        ++field53;
    }

    @OriginalMember(owner = "client!us", name = "A", descriptor = "(I)V")
    private final void method166(int arg0) {
        ++field17;
        this.method161(-75, -2);
        for (int var2 = this.field303 + -1; ~var2 <= -1; --var2) {
            this.method125(var2, -45);
            this.method5(3845, (class487) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method148(8448, 8448, (byte) -121);
        this.method10(2, 770, 34168, 34192);
        this.method56(0);
        this.field247 = arg0;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field245 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field239 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field242 = true;
        this.method61(true, 101);
        this.method172(true, 4);
        this.method57(arg0 ^ 28, true);
        this.method45(true, -96);
        this.method128((byte) -107);
        this.field175.setSwapInterval(0);
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
        this.field294 = this.field324 = -1;
        this.method107();
    }

    @OriginalMember(owner = "client!us", name = "B", descriptor = "(I)V")
    private final void method167(int arg0) {
        if (arg0 != -13966) {
            this.field296 = -0.39908308F;
        }
        ++field39;
        if (this.field348 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field131 > 0 && ~this.field24 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field131, (double) this.field24, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field348 = 1;
            this.field246 &= -25;
        }
    }

    @OriginalMember(owner = "client!us", name = "k", descriptor = "()Lq;")
    public final class396 method168() {
        ++field119;
        return new class422();
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "()Lq;")
    public final class396 method169() {
        ++field112;
        return this.field244;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lvw;Z)Lf;")
    public final class702 method170(class279 arg0, boolean arg1) {
        ++field142;
        int[] var3 = new int[arg0.field4174 * arg0.field4171];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field4170 == null) {
            for (int var6 = 0; ~var6 > ~arg0.field4171; ++var6) {
                for (int var7 = 0; ~var7 > ~arg0.field4174; ++var7) {
                    int var8 = arg0.field4169[255 & arg0.field4167[var4++]];
                    var3[var5++] = ~var8 == -1 ? 0 : class2.method189(-16777216, var8);
                }
            }
        } else {
            for (int var9 = 0; ~var9 > ~arg0.field4171; ++var9) {
                for (int var11 = 0; var11 < arg0.field4174; ++var11) {
                    var3[var5++] = class2.method189(arg0.field4169[class481.method2919(arg0.field4167[var4], 255)], arg0.field4170[var4] << 24);
                    ++var4;
                }
            }
        }
        class702 var10 = this.method54(var3, 0, arg0.field4174, arg0.field4174, arg0.field4171);
        var10.method1787(arg0.field4168, arg0.field4172, arg0.field4173, arg0.field4175);
        return var10;
    }

    @OriginalMember(owner = "client!us", name = "m", descriptor = "()Z")
    public final boolean method171() {
        ++field83;
        return true;
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(ZI)V")
    public final void method172(boolean arg0, int arg1) {
        if (!this.field295 == arg0) {
            this.field295 = arg0;
            this.method13(-3630);
            this.field246 &= -8;
        }
        if (arg1 == 4) {
            ++field3;
        }
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "()Z")
    public final boolean method173() {
        ++field182;
        return this.field203 != null && (this.field196 <= 1 || this.field270);
    }

    @OriginalMember(owner = "client!us", name = "z", descriptor = "()V")
    public final void method174() {
        ++field145;
        if (this.field203 != null && this.field203.method2784(3116)) {
            this.field202.method1868(this.field203, 1);
            this.field197.method3810(0);
        }
    }

    @OriginalMember(owner = "client!us", name = "f", descriptor = "(Z)V")
    private final void method175(boolean arg0) {
        ++field8;
        if (arg0) {
            this.field247 = -69;
        }
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field343, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!us", name = "C", descriptor = "(I)V")
    public final void method176(int arg0) {
        if (this.field246 != 4) {
            this.method167(-13966);
            this.method61(false, 101);
            this.method172(false, 4);
            this.method57(74, false);
            this.method45(false, -101);
            this.method161(-112, -2);
            this.method7(1, (byte) 76);
            this.field246 = 4;
        }
        ++field168;
        if (arg0 <= 99) {
            this.field239 = true;
        }
    }

    @OriginalMember(owner = "client!us", name = "e", descriptor = "(I)V")
    public final void method177(int arg0) {
        ++field207;
        if (arg0 >= 128 && arg0 <= 1024) {
            this.field198 = arg0;
            this.field197.method3810(0);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!us", name = "MA", descriptor = "(III[I)V")
    public final void method178(int arg0, int arg1, int arg2, int[] arg3) {
        ++field63;
        float var5 = (float) arg2 * this.field244.field6075 + (float) arg0 * this.field244.field6078 + (float) arg1 * this.field244.field6081 + this.field244.field6077;
        if (!(var5 < (float) this.field304) && !(var5 > (float) this.field346)) {
            int var6 = (int) (((float) arg2 * this.field244.field6100 + (float) arg0 * this.field244.field6101 + (float) arg1 * this.field244.field6102 + this.field244.field6099) * (float) this.field310 / var5);
            int var7 = (int) (((float) arg2 * this.field244.field6083 + (float) arg0 * this.field244.field6112 + (float) arg1 * this.field244.field6079 + this.field244.field6109) * (float) this.field327 / var5);
            arg3[0] = (int) ((float) var6 - this.field252);
            arg3[1] = (int) ((float) var7 - this.field257);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!us", name = "D", descriptor = "(I)V")
    private final void method179(int arg0) {
        OpenGL.glDepthMask(this.field243 && this.field277);
        ++field100;
        if (arg0 != 5) {
            this.method3(2);
        }
    }

    @OriginalMember(owner = "client!us", name = "CA", descriptor = "(IIII)V")
    public final void method180(int arg0, int arg1, int arg2, int arg3) {
        this.field266 = arg3;
        this.field298 = arg0;
        ++field108;
        this.field349 = true;
        this.field285 = arg2;
        this.field256 = arg1;
    }

    @OriginalMember(owner = "client!us", name = "t", descriptor = "()Z")
    public final boolean method181() {
        ++field104;
        if (this.field203 != null) {
            if (!this.field203.method2784(3116)) {
                if (!this.field202.method1870(this.field203, (byte) -85)) {
                    return false;
                }
                this.field197.method3810(0);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class702 method182(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field49;
        return new class374(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IILjaclib/memory/Buffer;ZB)Lel;")
    public final class510 method183(int arg0, int arg1, Buffer arg2, boolean arg3, byte arg4) {
        ++field176;
        if (!this.field261 || arg3 && !this.field251) {
            if (arg4 > -37) {
                this.method89((class304) null, (class304) null, 0.94109964F, (class304) null);
            }
            return new class428(this, arg1, arg2);
        } else {
            return new class305(this, arg1, arg2, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lrca;Lrca;Lrca;Lrca;B)V")
    public final void method184(class423 arg0, class423 arg1, class423 arg2, class423 arg3, byte arg4) {
        ++field195;
        if (arg1 != null) {
            this.method43(arg1.field6120, -26418);
            OpenGL.glVertexPointer(arg1.field6114, arg1.field6122, this.field347.method1997(-111), this.field347.method2001((byte) -107) - -((long) arg1.field6119));
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        if (arg3 != null) {
            this.method43(arg3.field6120, -26418);
            OpenGL.glNormalPointer(arg3.field6122, this.field347.method1997(-125), this.field347.method2001((byte) -127) + (long) arg3.field6119);
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg2 != null) {
            this.method43(arg2.field6120, -26418);
            OpenGL.glColorPointer(arg2.field6114, arg2.field6122, this.field347.method1997(26), this.field347.method2001((byte) -112) - -((long) arg2.field6119));
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg0 != null) {
            this.method43(arg0.field6120, -26418);
            OpenGL.glTexCoordPointer(arg0.field6114, arg0.field6122, this.field347.method1997(-126), this.field347.method2001((byte) -118) - -((long) arg0.field6119));
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
        if (arg4 <= 38) {
            this.method55((byte) 37);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method185(Canvas arg0) {
        ++field160;
        this.field88 = null;
        this.field121 = 0L;
        if (arg0 != null && this.field153 != arg0) {
            if (this.field6.containsKey(arg0)) {
                Long var2 = (Long) this.field6.get(arg0);
                this.field121 = var2;
                this.field88 = arg0;
            }
        } else {
            this.field121 = this.field29;
            this.field88 = this.field153;
        }
        if (this.field88 != null && this.field121 != 0L) {
            this.field175.setSurface(this.field121);
            this.method129(false);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIZ)Lf;")
    public final class702 method186(int arg0, int arg1, boolean arg2) {
        ++field60;
        return new class374(this, arg0, arg1, arg2);
    }
}
