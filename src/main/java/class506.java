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

@OriginalClass("client!kga")
public class class506 extends class165 {

    @OriginalMember(owner = "client!kga", name = "S", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field7084 = new Hashtable();

    @OriginalMember(owner = "client!kga", name = "ge", descriptor = "I")
    public int field7254 = 128;

    @OriginalMember(owner = "client!kga", name = "ce", descriptor = "Lcm;")
    private class677 field7250 = new class677();

    @OriginalMember(owner = "client!kga", name = "le", descriptor = "Lcba;")
    private class510 field7259 = new class510();

    @OriginalMember(owner = "client!kga", name = "me", descriptor = "Lcba;")
    public class510 field7260 = new class510();

    @OriginalMember(owner = "client!kga", name = "ne", descriptor = "I")
    public int field7261 = 3;

    @OriginalMember(owner = "client!kga", name = "te", descriptor = "Z")
    private boolean field7267 = false;

    @OriginalMember(owner = "client!kga", name = "se", descriptor = "I")
    public int field7266 = 8;

    @OriginalMember(owner = "client!kga", name = "re", descriptor = "Loe;")
    private class183 field7265 = new class183();

    @OriginalMember(owner = "client!kga", name = "ue", descriptor = "[Loi;")
    private class64[] field7268 = new class64[4];

    @OriginalMember(owner = "client!kga", name = "ve", descriptor = "I")
    private int field7269 = -1;

    @OriginalMember(owner = "client!kga", name = "xe", descriptor = "I")
    private int field7271 = -1;

    @OriginalMember(owner = "client!kga", name = "ye", descriptor = "I")
    private int field7272 = -1;

    @OriginalMember(owner = "client!kga", name = "Ae", descriptor = "[Loi;")
    private class64[] field7274 = new class64[4];

    @OriginalMember(owner = "client!kga", name = "De", descriptor = "[Loi;")
    private class64[] field7277 = new class64[4];

    @OriginalMember(owner = "client!kga", name = "Ee", descriptor = "Lan;")
    private class22 field7278 = new class22();

    @OriginalMember(owner = "client!kga", name = "Fe", descriptor = "Lwaa;")
    private class652 field7279 = new class652(16);

    @OriginalMember(owner = "client!kga", name = "Ie", descriptor = "Loe;")
    private class183 field7282 = new class183();

    @OriginalMember(owner = "client!kga", name = "Le", descriptor = "Loe;")
    private class183 field7285 = new class183();

    @OriginalMember(owner = "client!kga", name = "Me", descriptor = "Loe;")
    private class183 field7286 = new class183();

    @OriginalMember(owner = "client!kga", name = "Ne", descriptor = "Loe;")
    private class183 field7287 = new class183();

    @OriginalMember(owner = "client!kga", name = "Oe", descriptor = "Loe;")
    private class183 field7288 = new class183();

    @OriginalMember(owner = "client!kga", name = "Pe", descriptor = "Loe;")
    private class183 field7289 = new class183();

    @OriginalMember(owner = "client!kga", name = "Qe", descriptor = "Loe;")
    private class183 field7290 = new class183();

    @OriginalMember(owner = "client!kga", name = "Ye", descriptor = "Lcba;")
    public class510 field7298 = new class510();

    @OriginalMember(owner = "client!kga", name = "af", descriptor = "Lcba;")
    public class510 field7300 = new class510();

    @OriginalMember(owner = "client!kga", name = "bf", descriptor = "Lcba;")
    public class510 field7301 = new class510();

    @OriginalMember(owner = "client!kga", name = "gf", descriptor = "[F")
    private float[] field7306 = new float[4];

    @OriginalMember(owner = "client!kga", name = "hf", descriptor = "F")
    public float field7307 = 1.0F;

    @OriginalMember(owner = "client!kga", name = "Ef", descriptor = "I")
    public int field7329 = -1;

    @OriginalMember(owner = "client!kga", name = "rf", descriptor = "F")
    private float field7316 = -1.0F;

    @OriginalMember(owner = "client!kga", name = "Gf", descriptor = "I")
    private int field7331 = 8448;

    @OriginalMember(owner = "client!kga", name = "Bf", descriptor = "Z")
    private boolean field7326 = false;

    @OriginalMember(owner = "client!kga", name = "Sf", descriptor = "I")
    private int field7343 = 3584;

    @OriginalMember(owner = "client!kga", name = "Ff", descriptor = "F")
    public float field7330 = 1.0F;

    @OriginalMember(owner = "client!kga", name = "Mf", descriptor = "I")
    public int field7337 = 0;

    @OriginalMember(owner = "client!kga", name = "If", descriptor = "F")
    private float field7333 = 1.0F;

    @OriginalMember(owner = "client!kga", name = "fg", descriptor = "I")
    public int field7356 = 0;

    @OriginalMember(owner = "client!kga", name = "Zf", descriptor = "F")
    private float field7350 = 0.0F;

    @OriginalMember(owner = "client!kga", name = "qf", descriptor = "I")
    public int field7315 = -1;

    @OriginalMember(owner = "client!kga", name = "Af", descriptor = "F")
    public float field7325 = 3584.0F;

    @OriginalMember(owner = "client!kga", name = "wf", descriptor = "F")
    public float field7321 = -1.0F;

    @OriginalMember(owner = "client!kga", name = "Wf", descriptor = "I")
    private int field7347 = 0;

    @OriginalMember(owner = "client!kga", name = "gg", descriptor = "I")
    public int field7357 = 512;

    @OriginalMember(owner = "client!kga", name = "qg", descriptor = "[Lul;")
    private class530[] field7367 = new class530[class76.field1122];

    @OriginalMember(owner = "client!kga", name = "Lf", descriptor = "I")
    public int field7336 = 512;

    @OriginalMember(owner = "client!kga", name = "pg", descriptor = "I")
    private int field7366 = 0;

    @OriginalMember(owner = "client!kga", name = "zg", descriptor = "F")
    public float field7376 = 1.0F;

    @OriginalMember(owner = "client!kga", name = "sg", descriptor = "F")
    private float field7369 = -1.0F;

    @OriginalMember(owner = "client!kga", name = "ag", descriptor = "I")
    private int field7351 = 8448;

    @OriginalMember(owner = "client!kga", name = "Tg", descriptor = "I")
    public int field7396 = 0;

    @OriginalMember(owner = "client!kga", name = "Dg", descriptor = "I")
    public int field7380 = -1;

    @OriginalMember(owner = "client!kga", name = "Hf", descriptor = "I")
    public int field7332 = 50;

    @OriginalMember(owner = "client!kga", name = "Vg", descriptor = "I")
    private int field7398 = 0;

    @OriginalMember(owner = "client!kga", name = "jf", descriptor = "I")
    private int field7308 = 0;

    @OriginalMember(owner = "client!kga", name = "Gg", descriptor = "[F")
    private float[] field7383 = new float[4];

    @OriginalMember(owner = "client!kga", name = "Uf", descriptor = "I")
    private int field7345 = 0;

    @OriginalMember(owner = "client!kga", name = "Xg", descriptor = "Z")
    private boolean field7400 = true;

    @OriginalMember(owner = "client!kga", name = "Mg", descriptor = "F")
    public float field7389 = 3584.0F;

    @OriginalMember(owner = "client!kga", name = "Kf", descriptor = "[F")
    private float[] field7335 = new float[4];

    @OriginalMember(owner = "client!kga", name = "vg", descriptor = "I")
    public int field7372 = -1;

    @OriginalMember(owner = "client!kga", name = "Sg", descriptor = "F")
    private float field7395 = 1.0F;

    @OriginalMember(owner = "client!kga", name = "zf", descriptor = "[F")
    public float[] field7324 = new float[4];

    @OriginalMember(owner = "client!kga", name = "bh", descriptor = "F")
    public float field7404 = -1.0F;

    @OriginalMember(owner = "client!kga", name = "Og", descriptor = "I")
    public int field7391 = 0;

    @OriginalMember(owner = "client!kga", name = "Rg", descriptor = "[F")
    private float[] field7394 = new float[16];

    @OriginalMember(owner = "client!kga", name = "ih", descriptor = "I")
    private int field7411 = 0;

    @OriginalMember(owner = "client!kga", name = "dh", descriptor = "I")
    private int field7406 = -1;

    @OriginalMember(owner = "client!kga", name = "bg", descriptor = "Lkw;")
    public class226 field7352 = new class226(8192);

    @OriginalMember(owner = "client!kga", name = "jh", descriptor = "[B")
    public byte[] field7412 = new byte[16384];

    @OriginalMember(owner = "client!kga", name = "mh", descriptor = "[I")
    public int[] field7415 = new int[1];

    @OriginalMember(owner = "client!kga", name = "nh", descriptor = "[I")
    public int[] field7416 = new int[1];

    @OriginalMember(owner = "client!kga", name = "oh", descriptor = "[I")
    public int[] field7417 = new int[1];

    @OriginalMember(owner = "client!kga", name = "je", descriptor = "I")
    public int field7257;

    @OriginalMember(owner = "client!kga", name = "H", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7073;

    @OriginalMember(owner = "client!kga", name = "uc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7164;

    @OriginalMember(owner = "client!kga", name = "eb", descriptor = "Ljaggl/OpenGL;")
    public OpenGL field7096;

    @OriginalMember(owner = "client!kga", name = "Hd", descriptor = "J")
    private long field7229;

    @OriginalMember(owner = "client!kga", name = "Xb", descriptor = "J")
    private long field7141;

    @OriginalMember(owner = "client!kga", name = "cg", descriptor = "Z")
    public boolean field7353;

    @OriginalMember(owner = "client!kga", name = "lf", descriptor = "I")
    public int field7310;

    @OriginalMember(owner = "client!kga", name = "Bg", descriptor = "Ljava/lang/String;")
    private String field7378;

    @OriginalMember(owner = "client!kga", name = "Pf", descriptor = "Z")
    private boolean field7340;

    @OriginalMember(owner = "client!kga", name = "Yf", descriptor = "Z")
    public boolean field7349;

    @OriginalMember(owner = "client!kga", name = "rg", descriptor = "Z")
    public boolean field7368;

    @OriginalMember(owner = "client!kga", name = "eg", descriptor = "Z")
    public boolean field7355;

    @OriginalMember(owner = "client!kga", name = "eh", descriptor = "Z")
    public boolean field7407;

    @OriginalMember(owner = "client!kga", name = "ng", descriptor = "Z")
    private boolean field7364;

    @OriginalMember(owner = "client!kga", name = "Jf", descriptor = "Ljava/lang/String;")
    private String field7334;

    @OriginalMember(owner = "client!kga", name = "Ug", descriptor = "Z")
    public boolean field7397;

    @OriginalMember(owner = "client!kga", name = "og", descriptor = "Z")
    private boolean field7365;

    @OriginalMember(owner = "client!kga", name = "ie", descriptor = "Lid;")
    private class540 field7256;

    @OriginalMember(owner = "client!kga", name = "pe", descriptor = "Lor;")
    public class592 field7263;

    @OriginalMember(owner = "client!kga", name = "be", descriptor = "Lei;")
    private class160 field7249;

    @OriginalMember(owner = "client!kga", name = "fe", descriptor = "Lts;")
    private class496 field7253;

    @OriginalMember(owner = "client!kga", name = "he", descriptor = "Lls;")
    private class123 field7255;

    @OriginalMember(owner = "client!kga", name = "ac", descriptor = "Ljk;")
    public static class585 field7144 = new class585(63, 3);

    @OriginalMember(owner = "client!kga", name = "td", descriptor = "Liv;")
    public static class82 field7215 = new class82(4, 8);

    @OriginalMember(owner = "client!kga", name = "Sd", descriptor = "[B")
    public static byte[] field7240 = new byte[2048];

    @OriginalMember(owner = "client!kga", name = "ff", descriptor = "F")
    public float field7305;

    @OriginalMember(owner = "client!kga", name = "mf", descriptor = "F")
    public float field7311;

    @OriginalMember(owner = "client!kga", name = "vf", descriptor = "F")
    public float field7320;

    @OriginalMember(owner = "client!kga", name = "Cf", descriptor = "F")
    public float field7327;

    @OriginalMember(owner = "client!kga", name = "Qf", descriptor = "F")
    private float field7341;

    @OriginalMember(owner = "client!kga", name = "Xf", descriptor = "F")
    private float field7348;

    @OriginalMember(owner = "client!kga", name = "ug", descriptor = "F")
    private float field7371;

    @OriginalMember(owner = "client!kga", name = "Ig", descriptor = "F")
    public float field7385;

    @OriginalMember(owner = "client!kga", name = "Qg", descriptor = "F")
    public float field7393;

    @OriginalMember(owner = "client!kga", name = "p", descriptor = "I")
    public static int field7055;

    @OriginalMember(owner = "client!kga", name = "q", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!kga", name = "r", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!kga", name = "s", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!kga", name = "t", descriptor = "I")
    public int field7059;

    @OriginalMember(owner = "client!kga", name = "u", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!kga", name = "v", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!kga", name = "w", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!kga", name = "x", descriptor = "I")
    public static int field7063;

    @OriginalMember(owner = "client!kga", name = "y", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!kga", name = "z", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!kga", name = "A", descriptor = "I")
    public static int field7066;

    @OriginalMember(owner = "client!kga", name = "B", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!kga", name = "C", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!kga", name = "D", descriptor = "I")
    public static int field7069;

    @OriginalMember(owner = "client!kga", name = "E", descriptor = "I")
    public static int field7070;

    @OriginalMember(owner = "client!kga", name = "F", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!kga", name = "G", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!kga", name = "I", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!kga", name = "J", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!kga", name = "K", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!kga", name = "L", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!kga", name = "M", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!kga", name = "N", descriptor = "I")
    public static int field7079;

    @OriginalMember(owner = "client!kga", name = "O", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!kga", name = "P", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!kga", name = "Q", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!kga", name = "R", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!kga", name = "T", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!kga", name = "U", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!kga", name = "V", descriptor = "I")
    public static int field7087;

    @OriginalMember(owner = "client!kga", name = "W", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!kga", name = "X", descriptor = "I")
    public int field7089;

    @OriginalMember(owner = "client!kga", name = "Y", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!kga", name = "Z", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!kga", name = "ab", descriptor = "I")
    public static int field7092;

    @OriginalMember(owner = "client!kga", name = "bb", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!kga", name = "cb", descriptor = "I")
    public static int field7094;

    @OriginalMember(owner = "client!kga", name = "db", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!kga", name = "fb", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!kga", name = "gb", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!kga", name = "hb", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!kga", name = "ib", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!kga", name = "jb", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!kga", name = "kb", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!kga", name = "lb", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!kga", name = "mb", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!kga", name = "nb", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!kga", name = "ob", descriptor = "I")
    public static int field7106;

    @OriginalMember(owner = "client!kga", name = "pb", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!kga", name = "qb", descriptor = "I")
    public static int field7108;

    @OriginalMember(owner = "client!kga", name = "rb", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!kga", name = "sb", descriptor = "I")
    public static int field7110;

    @OriginalMember(owner = "client!kga", name = "tb", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!kga", name = "ub", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!kga", name = "vb", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!kga", name = "wb", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!kga", name = "xb", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!kga", name = "yb", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!kga", name = "zb", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!kga", name = "Ab", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!kga", name = "Bb", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!kga", name = "Cb", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!kga", name = "Db", descriptor = "I")
    public static int field7121;

    @OriginalMember(owner = "client!kga", name = "Eb", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!kga", name = "Fb", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!kga", name = "Gb", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!kga", name = "Hb", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!kga", name = "Ib", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!kga", name = "Jb", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!kga", name = "Kb", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!kga", name = "Lb", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!kga", name = "Mb", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!kga", name = "Nb", descriptor = "I")
    public static int field7131;

    @OriginalMember(owner = "client!kga", name = "Ob", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!kga", name = "Pb", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!kga", name = "Qb", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!kga", name = "Rb", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!kga", name = "Sb", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!kga", name = "Tb", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!kga", name = "Ub", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!kga", name = "Vb", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!kga", name = "Wb", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!kga", name = "Yb", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!kga", name = "Zb", descriptor = "I")
    private int field7143;

    @OriginalMember(owner = "client!kga", name = "bc", descriptor = "I")
    public static int field7145;

    @OriginalMember(owner = "client!kga", name = "cc", descriptor = "I")
    public static int field7146;

    @OriginalMember(owner = "client!kga", name = "dc", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!kga", name = "ec", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!kga", name = "fc", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!kga", name = "gc", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!kga", name = "hc", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!kga", name = "ic", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!kga", name = "jc", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!kga", name = "kc", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!kga", name = "lc", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!kga", name = "mc", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!kga", name = "nc", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!kga", name = "oc", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!kga", name = "pc", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!kga", name = "qc", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!kga", name = "rc", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!kga", name = "sc", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!kga", name = "tc", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!kga", name = "vc", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!kga", name = "wc", descriptor = "I")
    public static int field7166;

    @OriginalMember(owner = "client!kga", name = "xc", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!kga", name = "yc", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!kga", name = "zc", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!kga", name = "Ac", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!kga", name = "Bc", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!kga", name = "Cc", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!kga", name = "Dc", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!kga", name = "Ec", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!kga", name = "Fc", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!kga", name = "Gc", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!kga", name = "Hc", descriptor = "I")
    public static int field7177;

    @OriginalMember(owner = "client!kga", name = "Ic", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!kga", name = "Jc", descriptor = "I")
    private int field7179;

    @OriginalMember(owner = "client!kga", name = "Kc", descriptor = "I")
    public static int field7180;

    @OriginalMember(owner = "client!kga", name = "Lc", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!kga", name = "Mc", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!kga", name = "Nc", descriptor = "I")
    public static int field7183;

    @OriginalMember(owner = "client!kga", name = "Oc", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!kga", name = "Pc", descriptor = "I")
    public static int field7185;

    @OriginalMember(owner = "client!kga", name = "Qc", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!kga", name = "Rc", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!kga", name = "Sc", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!kga", name = "Tc", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!kga", name = "Uc", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!kga", name = "Vc", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!kga", name = "Wc", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!kga", name = "Xc", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!kga", name = "Yc", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!kga", name = "Zc", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!kga", name = "ad", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!kga", name = "bd", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!kga", name = "cd", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!kga", name = "dd", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!kga", name = "ed", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!kga", name = "fd", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!kga", name = "gd", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!kga", name = "hd", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!kga", name = "id", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!kga", name = "jd", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!kga", name = "kd", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!kga", name = "ld", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!kga", name = "md", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!kga", name = "nd", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!kga", name = "od", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!kga", name = "pd", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!kga", name = "qd", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!kga", name = "rd", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!kga", name = "sd", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!kga", name = "ud", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!kga", name = "vd", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!kga", name = "wd", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!kga", name = "xd", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!kga", name = "yd", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!kga", name = "zd", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!kga", name = "Ad", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!kga", name = "Bd", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!kga", name = "Cd", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!kga", name = "Dd", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!kga", name = "Ed", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!kga", name = "Fd", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!kga", name = "Gd", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!kga", name = "Id", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!kga", name = "Jd", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!kga", name = "Kd", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!kga", name = "Ld", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!kga", name = "Md", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!kga", name = "Nd", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!kga", name = "Od", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!kga", name = "Pd", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!kga", name = "Qd", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!kga", name = "Rd", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!kga", name = "Td", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!kga", name = "Ud", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!kga", name = "Vd", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!kga", name = "Wd", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!kga", name = "Xd", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!kga", name = "Yd", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!kga", name = "Zd", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!kga", name = "ae", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!kga", name = "de", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!kga", name = "ee", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!kga", name = "ke", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!kga", name = "qe", descriptor = "I")
    public int field7264;

    @OriginalMember(owner = "client!kga", name = "Ge", descriptor = "I")
    private int field7280;

    @OriginalMember(owner = "client!kga", name = "He", descriptor = "I")
    public int field7281;

    @OriginalMember(owner = "client!kga", name = "Je", descriptor = "I")
    private int field7283;

    @OriginalMember(owner = "client!kga", name = "Ke", descriptor = "I")
    public int field7284;

    @OriginalMember(owner = "client!kga", name = "Re", descriptor = "I")
    private int field7291;

    @OriginalMember(owner = "client!kga", name = "Xe", descriptor = "I")
    private int field7297;

    @OriginalMember(owner = "client!kga", name = "Ze", descriptor = "I")
    private int field7299;

    @OriginalMember(owner = "client!kga", name = "of", descriptor = "I")
    private int field7313;

    @OriginalMember(owner = "client!kga", name = "pf", descriptor = "I")
    private int field7314;

    @OriginalMember(owner = "client!kga", name = "tf", descriptor = "I")
    private int field7318;

    @OriginalMember(owner = "client!kga", name = "uf", descriptor = "I")
    public int field7319;

    @OriginalMember(owner = "client!kga", name = "lg", descriptor = "I")
    private int field7362;

    @OriginalMember(owner = "client!kga", name = "xg", descriptor = "I")
    private int field7374;

    @OriginalMember(owner = "client!kga", name = "Fg", descriptor = "I")
    private int field7382;

    @OriginalMember(owner = "client!kga", name = "Hg", descriptor = "I")
    private int field7384;

    @OriginalMember(owner = "client!kga", name = "Yg", descriptor = "I")
    private int field7401;

    @OriginalMember(owner = "client!kga", name = "Zg", descriptor = "I")
    public int field7402;

    @OriginalMember(owner = "client!kga", name = "ah", descriptor = "I")
    public int field7403;

    @OriginalMember(owner = "client!kga", name = "fh", descriptor = "I")
    public int field7408;

    @OriginalMember(owner = "client!kga", name = "kh", descriptor = "I")
    private int field7413;

    @OriginalMember(owner = "client!kga", name = "lh", descriptor = "I")
    private int field7414;

    @OriginalMember(owner = "client!kga", name = "Se", descriptor = "J")
    private long field7292;

    @OriginalMember(owner = "client!kga", name = "Eg", descriptor = "Luq;")
    private class145 field7381;

    @OriginalMember(owner = "client!kga", name = "Be", descriptor = "Lmb;")
    private class239 field7275;

    @OriginalMember(owner = "client!kga", name = "yf", descriptor = "Lsaa;")
    public class298 field7323;

    @OriginalMember(owner = "client!kga", name = "sf", descriptor = "Lhe;")
    private class340 field7317;

    @OriginalMember(owner = "client!kga", name = "xf", descriptor = "Lrba;")
    public class399 field7322;

    @OriginalMember(owner = "client!kga", name = "Kg", descriptor = "Lrba;")
    public class399 field7387;

    @OriginalMember(owner = "client!kga", name = "ze", descriptor = "Lci;")
    private class416 field7273;

    @OriginalMember(owner = "client!kga", name = "Vf", descriptor = "Lci;")
    public class416 field7346;

    @OriginalMember(owner = "client!kga", name = "Tf", descriptor = "Lew;")
    private class458 field7344;

    @OriginalMember(owner = "client!kga", name = "yg", descriptor = "Lew;")
    private class458 field7375;

    @OriginalMember(owner = "client!kga", name = "cf", descriptor = "Lji;")
    public class565 field7302;

    @OriginalMember(owner = "client!kga", name = "ef", descriptor = "Lji;")
    public class565 field7304;

    @OriginalMember(owner = "client!kga", name = "Nf", descriptor = "Lji;")
    public class565 field7338;

    @OriginalMember(owner = "client!kga", name = "Rf", descriptor = "Lji;")
    public class565 field7342;

    @OriginalMember(owner = "client!kga", name = "dg", descriptor = "Lji;")
    public class565 field7354;

    @OriginalMember(owner = "client!kga", name = "ig", descriptor = "Lji;")
    public class565 field7359;

    @OriginalMember(owner = "client!kga", name = "mg", descriptor = "Lji;")
    public class565 field7363;

    @OriginalMember(owner = "client!kga", name = "wg", descriptor = "Lji;")
    public class565 field7373;

    @OriginalMember(owner = "client!kga", name = "Wg", descriptor = "Lji;")
    public class565 field7399;

    @OriginalMember(owner = "client!kga", name = "ch", descriptor = "Lji;")
    public class565 field7405;

    @OriginalMember(owner = "client!kga", name = "Cg", descriptor = "Leb;")
    private class577 field7379;

    @OriginalMember(owner = "client!kga", name = "we", descriptor = "Loi;")
    private class64 field7270;

    @OriginalMember(owner = "client!kga", name = "Ce", descriptor = "Loi;")
    private class64 field7276;

    @OriginalMember(owner = "client!kga", name = "oe", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field7262;

    @OriginalMember(owner = "client!kga", name = "Te", descriptor = "Z")
    private boolean field7293;

    @OriginalMember(owner = "client!kga", name = "Ue", descriptor = "Z")
    private boolean field7294;

    @OriginalMember(owner = "client!kga", name = "Ve", descriptor = "Z")
    private boolean field7295;

    @OriginalMember(owner = "client!kga", name = "We", descriptor = "Z")
    private boolean field7296;

    @OriginalMember(owner = "client!kga", name = "df", descriptor = "Z")
    private boolean field7303;

    @OriginalMember(owner = "client!kga", name = "kf", descriptor = "Z")
    private boolean field7309;

    @OriginalMember(owner = "client!kga", name = "nf", descriptor = "Z")
    private boolean field7312;

    @OriginalMember(owner = "client!kga", name = "Df", descriptor = "Z")
    private boolean field7328;

    @OriginalMember(owner = "client!kga", name = "Of", descriptor = "Z")
    public boolean field7339;

    @OriginalMember(owner = "client!kga", name = "hg", descriptor = "Z")
    public boolean field7358;

    @OriginalMember(owner = "client!kga", name = "jg", descriptor = "Z")
    public boolean field7360;

    @OriginalMember(owner = "client!kga", name = "kg", descriptor = "Z")
    private boolean field7361;

    @OriginalMember(owner = "client!kga", name = "tg", descriptor = "Z")
    public boolean field7370;

    @OriginalMember(owner = "client!kga", name = "Ag", descriptor = "Z")
    public boolean field7377;

    @OriginalMember(owner = "client!kga", name = "Jg", descriptor = "Z")
    public boolean field7386;

    @OriginalMember(owner = "client!kga", name = "Ng", descriptor = "Z")
    public boolean field7390;

    @OriginalMember(owner = "client!kga", name = "Pg", descriptor = "Z")
    private boolean field7392;

    @OriginalMember(owner = "client!kga", name = "gh", descriptor = "Z")
    private boolean field7409;

    @OriginalMember(owner = "client!kga", name = "hh", descriptor = "Z")
    public boolean field7410;

    @OriginalMember(owner = "client!kga", name = "Lg", descriptor = "[Ljf;")
    private class197[] field7388;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIIILua;II)V", line = 5)
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class616 arg6, int arg7, int arg8) {
        ++field7106;
        class681 var10 = (class681) arg6;
        class577 var11 = var10.field9752;
        this.method2933((byte) 111);
        this.method2932(true, var10.field9752);
        this.method2996(arg5, true);
        this.method2948(7681, 8448, (byte) 18);
        this.method2968(768, 0, (byte) -82, 34167);
        float var12 = var11.field8429 / (float) var11.field8432;
        float var13 = var11.field8435 / (float) var11.field8436;
        float var14 = (float) (-arg0) + (float) arg2;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var17 = var15 * var16;
        float var18 = var14 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var18 + 0.35F, (float) arg3 + var17 + 0.35F);
        OpenGL.glEnd();
        this.method2968(768, 0, (byte) -76, 5890);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "([IIIII)Lf;", line = 46)
    public final class701 method311(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7115;
        return new class239(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "(I)Lsa;", line = 55)
    public final class187 method2930(int arg0) {
        ++field7150;
        if (arg0 <= 77) {
            this.method2956(0.717551F, (byte) 76);
        }
        return this.field7317 != null ? this.field7317.method1959(-1199488062) : null;
    }

    @OriginalMember(owner = "client!kga", name = "B", descriptor = "()V", line = 67)
    public final void method250() {
        ++field7140;
        if (this.field7397) {
            if (this.field7276 != this.field7273) {
                throw new RuntimeException();
            }
            this.field7273.method2502(0, 9136);
            this.field7273.method2502(8, 9136);
            this.method2954(this.field7273, true);
        } else {
            if (!this.field7409) {
                throw new RuntimeException("");
            }
            this.field7275.method5(0, 0, this.field7089, this.field7059, 0, 0);
            this.field7096.setSurface(this.field7141);
        }
        this.field7059 = this.field7179;
        this.field7275 = null;
        this.field7089 = this.field7143;
        this.method2973(-106);
        this.method2949((byte) -80);
        this.method249();
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(BZ)V", line = 103)
    public final void method2931(byte arg0, boolean arg1) {
        ++field7078;
        if (!this.field7293 != !arg1) {
            this.field7293 = arg1;
            this.method2991(-115);
            this.field7299 &= -32;
        }
        if (arg0 >= -93) {
            this.field7089 = -70;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZLjf;)V", line = 123)
    public final void method2932(boolean arg0, class197 arg1) {
        ++field7079;
        class197 var3 = this.field7388[this.field7314];
        if (!arg0) {
            this.method256((Canvas) null);
        }
        if (arg1 != var3) {
            if (arg1 == null) {
                OpenGL.glDisable(var3.field2380);
            } else {
                if (var3 != null) {
                    if (~arg1.field2380 != ~var3.field2380) {
                        OpenGL.glDisable(var3.field2380);
                        OpenGL.glEnable(arg1.field2380);
                    }
                } else {
                    OpenGL.glEnable(arg1.field2380);
                }
                OpenGL.glBindTexture(arg1.field2380, arg1.method1210((byte) -122));
            }
            this.field7388[this.field7314] = arg1;
        }
        this.field7299 &= -2;
    }

    @OriginalMember(owner = "client!kga", name = "oa", descriptor = "([I)V", line = 165)
    public final void method251(int[] arg0) {
        ++field7226;
        arg0[3] = this.field7345;
        arg0[1] = this.field7347;
        arg0[0] = this.field7366;
        arg0[2] = this.field7398;
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(B)V", line = 179)
    public final void method2933(byte arg0) {
        if (arg0 > 88) {
            ++field7130;
            if (this.field7299 != 2) {
                this.method2977(-1);
                this.method2943(false, (byte) -128);
                this.method2969(false, (byte) -104);
                this.method2952(false, (byte) 24);
                this.method2931((byte) -110, false);
                this.method2988(true, -2);
                this.field7299 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IILjaclib/memory/Buffer;ZZ)Lew;", line = 204)
    public final class458 method2934(int arg0, int arg1, Buffer arg2, boolean arg3, boolean arg4) {
        if (!arg4) {
            this.method2940((byte) 40);
        }
        ++field7161;
        return (class458) (!this.field7340 || arg3 && !this.field7364 ? new class273(this, arg1, arg2) : new class81(this, arg1, arg2, arg0, arg3));
    }

    @OriginalMember(owner = "client!kga", name = "AA", descriptor = "(III[I)V", line = 223)
    public final void method329(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7175;
        float var5 = (float) arg2 * this.field7298.field7442 + (float) arg0 * this.field7298.field7426 + (float) arg1 * this.field7298.field7429 + this.field7298.field7455;
        if (!(var5 < (float) this.field7332) && !(var5 > (float) this.field7343)) {
            int var6 = (int) (((float) arg2 * this.field7298.field7453 + (float) arg0 * this.field7298.field7432 + (float) arg1 * this.field7298.field7440 + this.field7298.field7441) * (float) this.field7336 / var5);
            int var7 = (int) (((float) arg2 * this.field7298.field7449 + (float) arg0 * this.field7298.field7454 + (float) arg1 * this.field7298.field7424 + this.field7298.field7434) * (float) this.field7357 / var5);
            if ((float) var6 >= this.field7385 && (float) var6 <= this.field7320 && this.field7305 <= (float) var7 && this.field7393 >= (float) var7) {
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 + -this.field7385);
                arg3[1] = (int) ((float) var7 + -this.field7305);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIII)Lcaa;", line = 254)
    public final class275 method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7104;
        return this.field7410 ? new class641(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "(I)V", line = 263)
    private final void method2935(int arg0) {
        ++field7136;
        this.field7393 = (float) (-this.field7356 + this.field7345);
        this.field7320 = (float) (-this.field7337 + this.field7398);
        this.field7305 = (float) (-this.field7356 + this.field7347);
        if (arg0 == 1) {
            this.field7385 = (float) (this.field7366 - this.field7337);
        }
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(IIIIII)V", line = 277)
    public final void method259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3002(-123);
        ++field7058;
        this.method2996(arg5, true);
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

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lcaa;Lcaa;FLcaa;)Lcaa;", line = 309)
    public final class275 method313(class275 arg0, class275 arg1, float arg2, class275 arg3) {
        ++field7129;
        if (arg0 != null && arg1 != null && this.field7410 && this.field7397) {
            class655 var5 = null;
            class340 var6 = (class340) arg0;
            class340 var7 = (class340) arg1;
            class187 var8 = var6.method1959(-1199488062);
            class187 var9 = var7.method1959(-1199488062);
            if (var8 != null && var9 != null) {
                int var10 = ~var8.field2289 >= ~var9.field2289 ? var9.field2289 : var8.field2289;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class655) {
                    class655 var11 = (class655) arg3;
                    if (var11.method3706(false) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class655(this, var10);
                }
                if (var5.method3705(arg2, var8, (byte) -54, var9)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 362)
    public final void method257(Canvas arg0) {
        ++field7072;
        if (this.field7073 == arg0) {
            throw new RuntimeException();
        } else if (!this.field7084.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field7096.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field7084.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIIIIIII)V", line = 396)
    public final void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field7216;
        this.method3002(-125);
        this.method2996(arg9, true);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIB)V", line = 415)
    public static final void method2936(int arg0, int arg1, int arg2, byte arg3) {
        ++field7214;
        if (arg3 < -65) {
            int var4 = class36.field689 + arg0;
            int var5 = arg1 - -class88.field1239;
            if (class281.field3808 != null && arg0 >= 0 && ~arg1 <= -1 && ~class473.field6604 < ~arg0 && class205.field2465 > arg1) {
                if (class221.field2851.method1747(0, class375.field5039) || ~class206.field2472.field532 == ~arg2) {
                    long var6 = (long) (var4 | var5 << 14 | arg2 << 28);
                    class507 var8 = (class507) class475.field6655.method3678(var6, -123);
                    if (var8 == null) {
                        class151.method973(arg2, arg0, arg1);
                    } else {
                        class4 var9 = (class4) var8.field7422.method1132((byte) -113);
                        if (var9 == null) {
                            class151.method973(arg2, arg0, arg1);
                        } else {
                            class523 var10 = (class523) class151.method973(arg2, arg0, arg1);
                            if (var10 != null) {
                                var10.field7673 = var10.field7685 = -1;
                            } else {
                                var10 = new class523(arg0 << 9, class155.field1899[arg2].method437(99, arg1, arg0), arg1 << 9, arg2, arg2);
                            }
                            var10.field7675 = var9.field25;
                            var10.field7681 = var9.field24;
                            label60: while (true) {
                                class4 var11 = (class4) var8.field7422.method1134(8446);
                                if (var11 == null) {
                                    break;
                                }
                                if (var10.field7675 != var11.field25) {
                                    var10.field7684 = var11.field24;
                                    var10.field7673 = var11.field25;
                                    while (true) {
                                        class4 var12 = (class4) var8.field7422.method1134(8446);
                                        if (var12 == null) {
                                            break label60;
                                        }
                                        if (~var10.field7675 != ~var12.field25 && ~var10.field7673 != ~var12.field25) {
                                            var10.field7674 = var12.field24;
                                            var10.field7685 = var12.field25;
                                        }
                                    }
                                }
                            }
                            int var13 = class589.method3416((arg0 << 9) + 256, -94, arg2, (arg1 << 9) + 256);
                            var10.field535 = (byte) arg2;
                            var10.field7672 = 0;
                            var10.field530 = arg0 << 9;
                            var10.field531 = arg1 << 9;
                            var10.field527 = var13;
                            var10.field532 = (byte) arg2;
                            if (class626.method3602(arg0, arg1, (byte) -88)) {
                                ++var10.field535;
                            }
                            class573.method3354(arg2, arg0, arg1, var13, var10);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "()I", line = 508)
    public final int method214() {
        ++field7245;
        return this.field7284 + this.field7280 + this.field7281;
    }

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "()Z", line = 517)
    public final boolean method218() {
        ++field7120;
        return this.field7253 != null && (this.field7257 <= 1 || this.field7392);
    }

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "()Z", line = 526)
    public final boolean method215() {
        ++field7227;
        return true;
    }

    @OriginalMember(owner = "client!kga", name = "U", descriptor = "()I", line = 535)
    public final int method287() {
        ++field7070;
        return this.field7343;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZLcba;)V", line = 547)
    public final void method2937(boolean arg0, class510 arg1) {
        OpenGL.glPushMatrix();
        if (!arg0) {
            ++field7124;
            OpenGL.glMultMatrixf(arg1.method3022(-70), 0);
        }
    }

    @OriginalMember(owner = "client!kga", name = "pa", descriptor = "(III)V", line = 561)
    public final void method273(int arg0, int arg1, int arg2) {
        if (~this.field7380 != ~arg0 || ~this.field7372 != ~arg1 || this.field7396 != arg2) {
            this.field7380 = arg0;
            this.field7372 = arg1;
            this.field7396 = arg2;
            this.method3010(-1);
            this.method3012(-47);
        }
        ++field7093;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIIF)Lul;", line = 582)
    public final class530 method243(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field7166;
        return new class486(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(IIII)V", line = 592)
    public final void method2938(int arg0, int arg1, int arg2, int arg3) {
        ++field7212;
        OpenGL.glTexEnvi(8960, arg3 + 34184, arg1);
        if (arg0 < -123) {
            OpenGL.glTexEnvi(8960, arg3 + 34200, arg2);
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(IIIIII)V", line = 604)
    public final void method278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7062;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        this.method3002(-124);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method2996(arg5, true);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7312) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7312) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!kga", name = "m", descriptor = "(IIIII)V", line = 638)
    public final void method310(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7235;
        this.method3002(-126);
        this.method2996(arg4, true);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kga", name = "s", descriptor = "()Lq;", line = 660)
    public final class394 method238() {
        ++field7082;
        return this.field7298;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(III)V", line = 670)
    public final synchronized void method2939(int arg0, int arg1, int arg2) {
        if (arg1 != 5126) {
            this.method265((class493) null);
        }
        ++field7180;
        class556 var4 = new class556(arg2);
        var4.field7519 = (long) arg0;
        this.field7286.method1129(var4, 262144);
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(B)V", line = 686)
    public final void method2940(byte arg0) {
        OpenGL.glLightfv(16384, 4611, this.field7324, 0);
        ++field7243;
        OpenGL.glLightfv(16385, 4611, this.field7383, 0);
        if (arg0 != 9) {
            this.method303(-71, -96, -61, 52, -65, 49);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Loi;I)V", line = 698)
    public final void method2941(class64 arg0, int arg1) {
        if (arg1 != 3) {
            this.method287();
        }
        ++field7118;
        if (this.field7269 >= 0 && this.field7277[this.field7269] == arg0) {
            this.field7277[this.field7269--] = null;
            arg0.method613((byte) 118);
            if (~this.field7269 > -1) {
                this.field7270 = null;
            } else {
                this.field7270 = this.field7277[this.field7269];
                this.field7270.method614(-96);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "()I", line = 723)
    public final int method232() {
        ++field7069;
        return 4;
    }

    @OriginalMember(owner = "client!kga", name = "p", descriptor = "()V", line = 732)
    public final void method321() {
        ++field7145;
        if (this.field7253 != null && this.field7253.method1440((byte) -112)) {
            this.field7249.method1014(-94, this.field7253);
            this.field7256.method3170(6408);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lf;Z)V", line = 748)
    public final void method241(class701 arg0, boolean arg1) {
        ++field7199;
        this.field7275 = (class239) arg0;
        if (!this.field7397) {
            if (!this.field7409) {
                throw new RuntimeException("");
            }
            class581 var3 = (class581) this.field7279.method3678((long) (this.field7275.method902() << 16 | this.field7275.method900()), -124);
            if (var3 == null) {
                var3 = new class581(this, this.field7275.method902(), this.field7275.method900());
                class581 var5;
                for (this.field7283 += var3.field8471 * 4; this.field7283 > 2097152; this.field7283 -= var5.field8471) {
                    class164 var4 = this.field7278.method349((byte) 115);
                    if (var4 == null) {
                        break;
                    }
                    var5 = (class581) var4;
                    var5.method1037(-84);
                    var5.method3045(true);
                    this.field7096.releasePbuffer(var5.method3385((byte) -124));
                }
                this.field7279.method3670((long) (this.field7275.method902() << 16 | this.field7275.method900()), var3, (byte) 127);
            }
            this.field7278.method348((byte) 80, var3);
            this.field7096.setPbuffer(var3.method3385((byte) -119));
        } else {
            if (this.field7273 == null) {
                this.field7273 = new class416(this);
            }
            if (this.field7276 == this.field7273) {
                throw new RuntimeException();
            }
            this.method2953(113, this.field7273);
            if (arg1) {
                class261 var6 = (class261) this.field7279.method3678((long) (this.field7275.method902() << 16 | this.field7275.method900()), -119);
                if (var6 == null) {
                    var6 = new class261(this, 6402, this.field7275.method902(), this.field7275.method900());
                    class261 var8;
                    for (this.field7283 += var6.field3584; this.field7283 > 2097152; this.field7283 -= var8.field3584) {
                        class164 var7 = this.field7278.method349((byte) 111);
                        if (var7 == null) {
                            break;
                        }
                        var8 = (class261) var7;
                        var8.method1037(-119);
                        var8.method3045(true);
                        var8.method1589(false);
                    }
                    this.field7279.method3670((long) (this.field7275.method902() << 16 | this.field7275.method900()), var6, (byte) 127);
                }
                this.field7278.method348((byte) 99, var6);
                this.field7273.method2498(0, var6, 8);
            }
            this.field7273.method2495(false, this.field7275.field3306, 0);
        }
        this.field7089 = arg0.method902();
        this.field7059 = arg0.method900();
        this.method2973(-92);
        this.method2949((byte) -79);
        this.method249();
    }

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "(I)V", line = 846)
    public final void method2942(int arg0) {
        if (this.field7299 != 8) {
            this.method2966(1);
            this.method2943(true, (byte) -95);
            this.method2952(true, (byte) 24);
            this.method2931((byte) -118, true);
            this.method2996(1, true);
            this.field7299 = 8;
        }
        int var2 = -89 / ((arg0 - 63) / 38);
        ++field7163;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "()Z", line = 870)
    public final boolean method269() {
        ++field7151;
        return false;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZB)V", line = 880)
    public final void method2943(boolean arg0, byte arg1) {
        ++field7198;
        if (arg1 >= -76) {
            this.field7336 = -15;
        }
        if (!arg0 == this.field7328) {
            this.field7328 = arg0;
            this.method3012(-59);
            this.field7299 &= -32;
        }
    }

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "()Lik;", line = 900)
    public final class191 method314() {
        ++field7234;
        int var1 = -1;
        if (~this.field7334.indexOf("nvidia") != 0) {
            var1 = 4318;
        } else if (this.field7334.indexOf("intel") != -1) {
            var1 = 32902;
        } else if (this.field7334.indexOf("ati") != -1) {
            var1 = 4098;
        }
        return new class191(var1, "OpenGL", this.field7362, this.field7378, 0L);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZZ)V", line = 922)
    public final void method2944(boolean arg0, boolean arg1) {
        if (!this.field7361 == arg0) {
            this.field7361 = arg0;
            this.method2950(5124);
        }
        ++field7097;
        if (!arg1) {
            this.field7313 = 120;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IZZ)V", line = 943)
    public final void method2945(int arg0, boolean arg1, boolean arg2) {
        this.method3008(arg1, arg0, arg2, (byte) -97);
        ++field7116;
    }

    @OriginalMember(owner = "client!kga", name = "k", descriptor = "(I)V", line = 952)
    private final void method2946(int arg0) {
        ++field7247;
        class188.field2300[2] = this.field7311 * this.field7307;
        class188.field2300[arg0] = 1.0F;
        class188.field2300[1] = this.field7376 * this.field7311;
        class188.field2300[0] = this.field7330 * this.field7311;
        OpenGL.glLightModelfv(2899, class188.field2300, 0);
    }

    @OriginalMember(owner = "client!kga", name = "VA", descriptor = "(IFFFFF)V", line = 966)
    public final void method236(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field7206;
        boolean var7 = this.field7406 != arg0;
        if (var7 || this.field7404 != arg1 || this.field7321 != arg2) {
            this.field7321 = arg2;
            this.field7404 = arg1;
            this.field7406 = arg0;
            if (var7) {
                this.field7376 = (float) (65280 & this.field7406) / 65280.0F;
                this.field7307 = (float) (255 & this.field7406) / 255.0F;
                this.field7330 = (float) (this.field7406 & 16711680) / 1.671168E7F;
                this.method2946(3);
            }
            this.method2964(4685);
        }
        if (this.field7335[0] != arg3 || this.field7335[1] != arg4 || this.field7335[2] != arg5) {
            this.field7335[2] = arg5;
            this.field7335[1] = arg4;
            this.field7335[0] = arg3;
            this.field7306[2] = -arg5;
            this.field7306[0] = -arg3;
            this.field7306[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field7324[1] = arg4 * var8;
            this.field7324[0] = arg3 * var8;
            this.field7324[2] = arg5 * var8;
            this.field7383[0] = -this.field7324[0];
            this.field7383[2] = -this.field7324[2];
            this.field7383[1] = -this.field7324[1];
            this.method2940((byte) 9);
            this.field7408 = (int) (arg3 * 256.0F / arg4);
            this.field7402 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(BLew;)V", line = 1017)
    public final void method2947(byte arg0, class458 arg1) {
        if (this.field7375 != arg1) {
            if (this.field7340) {
                OpenGL.glBindBufferARB(34962, arg1.method664(25779));
            }
            this.field7375 = arg1;
        }
        ++field7195;
        if (arg0 != 79) {
            this.method306(53, -62);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIB)V", line = 1036)
    public final void method2948(int arg0, int arg1, byte arg2) {
        int var4 = 65 / ((-51 - arg2) / 49);
        ++field7132;
        if (~this.field7314 == -1) {
            boolean var5 = false;
            if (~this.field7331 != ~arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                var5 = true;
                this.field7331 = arg0;
            }
            if (this.field7351 != arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                this.field7351 = arg1;
                var5 = true;
            }
            if (var5) {
                this.field7299 &= -30;
                return;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        }
    }

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "(B)V", line = 1076)
    private final void method2949(byte arg0) {
        OpenGL.glViewport(this.field7308, this.field7411, this.field7089, this.field7059);
        ++field7251;
        if (arg0 >= -42) {
            this.field7289 = null;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lkk;IIII)Lda;", line = 1092)
    public final class55 method274(class173 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7135;
        return new class565(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "([I)V", line = 1100)
    public final void method319(int[] arg0) {
        arg0[1] = this.field7059;
        ++field7173;
        arg0[0] = this.field7089;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIIII)V", line = 1113)
    public final void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7170;
        OpenGL.glLineWidth((float) arg5);
        this.method259(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(I)V", line = 1127)
    public final void method252(int arg0) {
        ++field7187;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!kga", name = "l", descriptor = "(I)V", line = 1138)
    private final void method2950(int arg0) {
        if (arg0 == 5124) {
            ++field7200;
            if (this.field7309 && !this.field7361) {
                OpenGL.glEnable(2896);
            } else {
                OpenGL.glDisable(2896);
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(Z)V", line = 1154)
    private final void method2951(boolean arg0) {
        ++field7174;
        if (this.field7374 != 3) {
            this.field7374 = 3;
            this.method2972((byte) 122);
            this.method2967(-127);
            this.field7299 &= -8;
        }
        if (arg0) {
            this.method269();
        }
    }

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "()V", line = 1173)
    public final void method283() {
        ++field7169;
        if (this.field7365 && ~this.field7089 < -1 && this.field7059 > 0) {
            int var1 = this.field7366;
            int var2 = this.field7398;
            int var3 = this.field7347;
            int var4 = this.field7345;
            this.method249();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2973(-126);
            this.method2943(false, (byte) -91);
            this.method2969(false, (byte) -104);
            this.method2952(false, (byte) 24);
            this.method2931((byte) -112, false);
            this.method2932(true, (class197) null);
            this.method2988(true, -2);
            this.method2985(1, -26973);
            this.method2996(0, true);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field7089, this.field7059, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method292(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(II)I", line = 1216)
    public final int method271(int arg0, int arg1) {
        ++field7219;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!kga", name = "ZA", descriptor = "(Z)V", line = 1230)
    public final void method309(boolean arg0) {
        ++field7152;
        this.field7400 = arg0;
        this.method2991(-110);
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(ZB)V", line = 1241)
    public final void method2952(boolean arg0, byte arg1) {
        ++field7064;
        if (arg1 == 24) {
            if (!this.field7296 != !arg0) {
                if (arg0) {
                    OpenGL.glEnable(2929);
                } else {
                    OpenGL.glDisable(2929);
                }
                this.field7296 = arg0;
                this.field7299 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILoi;)V", line = 1263)
    public final void method2953(int arg0, class64 arg1) {
        if (arg0 > 102) {
            ++field7137;
            if (this.field7390) {
                this.method2958(arg1, 2);
                this.method2986((byte) 116, arg1);
            } else if (this.field7271 >= 3) {
                throw new RuntimeException();
            } else {
                if (~this.field7271 <= -1) {
                    this.field7268[this.field7271].method612(-20842);
                }
                this.field7270 = this.field7276 = this.field7268[++this.field7271] = arg1;
                this.field7270.method609(-18710);
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Loi;Z)V", line = 1292)
    public final void method2954(class64 arg0, boolean arg1) {
        if (!arg1) {
            this.method2956(0.22410761F, (byte) -38);
        }
        ++field7258;
        if (this.field7390) {
            this.method2941(arg0, 3);
            this.method2955(arg0, -107);
        } else if (this.field7271 >= 0 && this.field7268[this.field7271] == arg0) {
            this.field7268[this.field7271--] = null;
            arg0.method612(-20842);
            if (~this.field7271 > -1) {
                this.field7270 = this.field7276 = null;
            } else {
                this.field7270 = this.field7276 = this.field7268[this.field7271];
                this.field7270.method609(-18710);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(Loi;I)V", line = 1326)
    public final void method2955(class64 arg0, int arg1) {
        ++field7242;
        if (~this.field7272 <= -1 && this.field7274[this.field7272] == arg0) {
            this.field7274[this.field7272--] = null;
            arg0.method611((byte) -45);
            if (~this.field7272 <= -1) {
                this.field7276 = this.field7274[this.field7272];
                this.field7276.method610(10583);
            } else {
                this.field7276 = null;
            }
            int var3 = 96 / ((arg1 - -46) / 44);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(FB)V", line = 1349)
    public final void method2956(float arg0, byte arg1) {
        if (this.field7395 != arg0) {
            this.field7395 = arg0;
            if (this.field7374 == 3) {
                this.method2972((byte) 125);
            }
        }
        ++field7080;
        int var3 = -76 / ((arg1 - 73) / 41);
    }

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "(B)V", line = 1369)
    private final void method2957(byte arg0) {
        this.field7388 = new class197[this.field7319];
        ++field7184;
        this.field7323 = new class298(this, 3553, 6408, 1, 1);
        if (arg0 >= -97) {
            this.field7326 = false;
        }
        new class298(this, 3553, 6408, 1, 1);
        new class298(this, 3553, 6408, 1, 1);
        this.field7338 = new class565(this);
        this.field7363 = new class565(this);
        this.field7302 = new class565(this);
        this.field7373 = new class565(this);
        this.field7405 = new class565(this);
        this.field7354 = new class565(this);
        this.field7359 = new class565(this);
        this.field7304 = new class565(this);
        this.field7342 = new class565(this);
        this.field7399 = new class565(this);
        if (this.field7397) {
            this.field7346 = new class416(this);
            new class416(this);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIII)V", line = 1407)
    public final void method254(int arg0, int arg1, int arg2, int arg3) {
        ++field7117;
        this.field7249.method1006(arg2, arg3, arg0, (byte) -120, arg1);
    }

    @OriginalMember(owner = "client!kga", name = "YA", descriptor = "(IIII)V", line = 1417)
    public final void method261(int arg0, int arg1, int arg2, int arg3) {
        ++field7211;
        if (!this.field7377) {
            throw new RuntimeException("");
        } else {
            this.field7391 = arg3;
            this.field7329 = arg2;
            this.field7315 = arg1;
            this.field7403 = arg0;
            if (this.field7326) {
                this.field7255.field1584.method1429((byte) 69);
                this.field7255.field1584.method1430((byte) -10);
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(Loi;I)V", line = 1440)
    public final void method2958(class64 arg0, int arg1) {
        ++field7159;
        if (arg1 == 2) {
            if (this.field7269 >= 3) {
                throw new RuntimeException();
            } else {
                if (~this.field7269 <= -1) {
                    this.field7277[this.field7269].method613((byte) -120);
                }
                this.field7270 = this.field7277[++this.field7269] = arg0;
                this.field7270.method614(-20);
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "(B)V", line = 1462)
    private final void method2959(byte arg0) {
        if (arg0 > -82) {
            this.method2934(92, 22, (Buffer) null, true, true);
        }
        ++field7231;
        if (this.field7398 >= this.field7366 && ~this.field7345 <= ~this.field7347) {
            OpenGL.glScissor(this.field7366 + this.field7308, this.field7411 - -this.field7059 + -this.field7345, -this.field7366 + this.field7398, this.field7345 - this.field7347);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lrba;Lrba;ILrba;Lrba;)V", line = 1477)
    public final void method2960(class399 arg0, class399 arg1, int arg2, class399 arg3, class399 arg4) {
        ++field7162;
        if (arg1 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method2947((byte) 79, arg1.field5629);
            OpenGL.glVertexPointer(arg1.field5630, arg1.field5623, this.field7375.method670(arg2 + 30863), this.field7375.method667((byte) -102) - -((long) arg1.field5633));
            OpenGL.glEnableClientState(32884);
        }
        if (arg2 != 0) {
            this.field7272 = 34;
        }
        if (arg0 != null) {
            this.method2947((byte) 79, arg0.field5629);
            OpenGL.glNormalPointer(arg0.field5623, this.field7375.method670(30863), this.field7375.method667((byte) -102) - -((long) arg0.field5633));
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg4 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method2947((byte) 79, arg4.field5629);
            OpenGL.glColorPointer(arg4.field5630, arg4.field5623, this.field7375.method670(30863), this.field7375.method667((byte) -102) - -((long) arg4.field5633));
            OpenGL.glEnableClientState(32886);
        }
        if (arg3 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method2947((byte) 79, arg3.field5629);
            OpenGL.glTexCoordPointer(arg3.field5630, arg3.field5623, this.field7375.method670(30863), this.field7375.method667((byte) -102) - -((long) arg3.field5633));
            OpenGL.glEnableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!kga", name = "m", descriptor = "(I)V", line = 1530)
    private final void method2961(int arg0) {
        ++field7147;
        int var2 = 56 % ((arg0 - -69) / 35);
        this.field7096.method3371();
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(BFFF)V", line = 1540)
    private final void method2962(byte arg0, float arg1, float arg2, float arg3) {
        OpenGL.glMatrixMode(5890);
        ++field7074;
        if (this.field7303) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg2, arg1, arg3);
        if (arg0 <= 126) {
            this.method264();
        }
        OpenGL.glMatrixMode(5888);
        this.field7303 = true;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "([BZZII)Lew;", line = 1558)
    public final class458 method2963(byte[] arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            this.field7339 = true;
        }
        ++field7190;
        return (class458) (!this.field7340 || arg1 && !this.field7364 ? new class273(this, arg3, arg0, arg4) : new class81(this, arg3, arg0, arg4, arg1));
    }

    @OriginalMember(owner = "client!kga", name = "n", descriptor = "(I)V", line = 1577)
    private final void method2964(int arg0) {
        class188.field2300[2] = this.field7404 * this.field7307;
        class188.field2300[3] = 1.0F;
        class188.field2300[0] = this.field7404 * this.field7330;
        class188.field2300[1] = this.field7404 * this.field7376;
        ++field7239;
        OpenGL.glLightfv(16384, 4609, class188.field2300, 0);
        class188.field2300[1] = -this.field7321 * this.field7376;
        class188.field2300[3] = 1.0F;
        if (arg0 != 4685) {
            this.method2961(1);
        }
        class188.field2300[2] = -this.field7321 * this.field7307;
        class188.field2300[0] = -this.field7321 * this.field7330;
        OpenGL.glLightfv(16385, 4609, class188.field2300, 0);
    }

    @OriginalMember(owner = "client!kga", name = "V", descriptor = "(IIII)V", line = 1599)
    public final void method300(int arg0, int arg1, int arg2, int arg3) {
        if (~arg3 > ~this.field7345) {
            this.field7345 = arg3;
        }
        if (this.field7366 < arg0) {
            this.field7366 = arg0;
        }
        ++field7205;
        if (~arg2 > ~this.field7398) {
            this.field7398 = arg2;
        }
        if (~arg1 < ~this.field7347) {
            this.field7347 = arg1;
        }
        OpenGL.glEnable(3089);
        this.method2935(1);
        this.method2959((byte) -114);
    }

    @OriginalMember(owner = "client!kga", name = "J", descriptor = "(IIIIII)V", line = 1626)
    public final void method248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7108;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method3002(-128);
        float var10 = (float) arg3 + var8;
        this.method2996(arg5, true);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7312) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7312) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!kga", name = "da", descriptor = "(IIII)V", line = 1658)
    public final void method292(int arg0, int arg1, int arg2, int arg3) {
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        ++field7107;
        if (this.field7059 < arg3) {
            arg3 = this.field7059;
        }
        if (~this.field7089 > ~arg2) {
            arg2 = this.field7089;
        }
        this.field7345 = arg3;
        this.field7398 = arg2;
        this.field7347 = arg1;
        this.field7366 = arg0;
        OpenGL.glEnable(3089);
        this.method2935(1);
        this.method2959((byte) -85);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Le;)V", line = 1690)
    public final void method265(class493 arg0) {
        this.field7262 = ((class678) arg0).field9727;
        ++field7165;
        if (this.field7344 == null) {
            class226 var2 = new class226(80);
            if (!this.field7353) {
                var2.method1376(-1.0F, (byte) -95);
                var2.method1376(-1.0F, (byte) -76);
                var2.method1376(0.0F, (byte) -93);
                var2.method1376(0.0F, (byte) -67);
                var2.method1376(1.0F, (byte) -102);
                var2.method1376(1.0F, (byte) -103);
                var2.method1376(-1.0F, (byte) -102);
                var2.method1376(0.0F, (byte) -110);
                var2.method1376(1.0F, (byte) -76);
                var2.method1376(1.0F, (byte) -122);
                var2.method1376(1.0F, (byte) -79);
                var2.method1376(1.0F, (byte) -103);
                var2.method1376(0.0F, (byte) -115);
                var2.method1376(1.0F, (byte) -124);
                var2.method1376(0.0F, (byte) -61);
                var2.method1376(-1.0F, (byte) -93);
                var2.method1376(1.0F, (byte) -111);
                var2.method1376(0.0F, (byte) -73);
                var2.method1376(0.0F, (byte) -124);
                var2.method1376(0.0F, (byte) -94);
            } else {
                var2.method1377(134389112, -1.0F);
                var2.method1377(134389112, -1.0F);
                var2.method1377(134389112, 0.0F);
                var2.method1377(134389112, 0.0F);
                var2.method1377(134389112, 1.0F);
                var2.method1377(134389112, 1.0F);
                var2.method1377(134389112, -1.0F);
                var2.method1377(134389112, 0.0F);
                var2.method1377(134389112, 1.0F);
                var2.method1377(134389112, 1.0F);
                var2.method1377(134389112, 1.0F);
                var2.method1377(134389112, 1.0F);
                var2.method1377(134389112, 0.0F);
                var2.method1377(134389112, 1.0F);
                var2.method1377(134389112, 0.0F);
                var2.method1377(134389112, -1.0F);
                var2.method1377(134389112, 1.0F);
                var2.method1377(134389112, 0.0F);
                var2.method1377(134389112, 0.0F);
                var2.method1377(134389112, 0.0F);
            }
            this.field7344 = this.method2963(var2.field5205, false, true, 20, var2.field5195);
            this.field7322 = new class399(this.field7344, 5126, 3, 0);
            this.field7387 = new class399(this.field7344, 5126, 2, 12);
            this.field7250.method3842((byte) -53, this);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I[Lul;)V", line = 1758)
    public final void method284(int arg0, class530[] arg1) {
        ++field7086;
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field7367[var3] = arg1[var3];
        }
        this.field7382 = arg0;
        if (this.field7374 != 1) {
            this.method2978(-1);
        }
    }

    @OriginalMember(owner = "client!kga", name = "MA", descriptor = "(III[I)V", line = 1778)
    public final void method322(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7098;
        float var5 = (float) arg2 * this.field7298.field7442 + (float) arg0 * this.field7298.field7426 + (float) arg1 * this.field7298.field7429 + this.field7298.field7455;
        if (!((float) this.field7332 > var5) && !(var5 > (float) this.field7343)) {
            int var6 = (int) (((float) arg2 * this.field7298.field7453 + (float) arg0 * this.field7298.field7432 + (float) arg1 * this.field7298.field7440 + this.field7298.field7441) * (float) this.field7336 / var5);
            arg3[0] = (int) ((float) var6 + -this.field7385);
            int var7 = (int) (((float) arg2 * this.field7298.field7449 + (float) arg0 * this.field7298.field7454 + (float) arg1 * this.field7298.field7424 + this.field7298.field7434) * (float) this.field7357 / var5);
            arg3[1] = (int) ((float) var7 - this.field7305);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!kga", name = "T", descriptor = "()I", line = 1801)
    public final int method289() {
        ++field7076;
        int var1 = this.field7413;
        this.field7413 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(BI)I", line = 1812)
    public final int method2965(byte arg0, int arg1) {
        ++field7177;
        if (arg0 != 31) {
            this.method2974((byte) -63);
        }
        if (~arg1 == -2) {
            return 7681;
        } else if (~arg1 == -1) {
            return 8448;
        } else if (arg1 != 2) {
            if (arg1 != 3) {
                if (arg1 == 4) {
                    return 34023;
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

    @OriginalMember(owner = "client!kga", name = "o", descriptor = "(I)V", line = 1843)
    private final void method2966(int arg0) {
        if (arg0 == 1) {
            if (this.field7374 != 2) {
                this.field7374 = 2;
                this.method2979(arg0 + -1);
                this.method2967(-126);
                this.field7299 &= -8;
            }
            ++field7090;
        }
    }

    @OriginalMember(owner = "client!kga", name = "p", descriptor = "(I)V", line = 1864)
    private final void method2967(int arg0) {
        OpenGL.glLoadIdentity();
        ++field7142;
        if (arg0 < -114) {
            OpenGL.glMultMatrixf(this.field7300.method3022(-122), 0);
            if (this.field7326) {
                this.field7255.field1584.method1429((byte) 118);
            }
            this.method2940((byte) 9);
            this.method2978(-1);
        }
    }

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "()V", line = 1882)
    public final void method302() {
        ++field7202;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIBI)V", line = 1890)
    public final void method2968(int arg0, int arg1, byte arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg1 + 34176, arg3);
        int var5 = 70 % ((-20 - arg2) / 49);
        ++field7168;
        OpenGL.glTexEnvi(8960, arg1 + 34192, arg0);
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(I)V", line = 1901)
    public final void method307(int arg0) {
        this.method2961(92);
        ++field7176;
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(Z)V", line = 1909)
    public final void method296(boolean arg0) {
        ++field7091;
    }

    @OriginalMember(owner = "client!kga", name = "FA", descriptor = "(ILua;II)V", line = 1920)
    public final void method245(int arg0, class616 arg1, int arg2, int arg3) {
        ++field7236;
        class681 var5 = (class681) arg1;
        class577 var6 = var5.field9752;
        this.method2933((byte) 127);
        this.method2932(true, var5.field9752);
        this.method2996(1, true);
        this.method2948(7681, 8448, (byte) 110);
        this.method2968(768, 0, (byte) -101, 34167);
        float var7 = var6.field8429 / (float) var6.field8432;
        float var8 = var6.field8435 / (float) var6.field8436;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7366) * var7, (float) (-arg3 + this.field7347) * var8);
        OpenGL.glVertex2i(this.field7366, this.field7347);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7366) * var7, (float) (-arg3 + this.field7345) * var8);
        OpenGL.glVertex2i(this.field7366, this.field7345);
        OpenGL.glTexCoord2f((float) (this.field7398 - arg2) * var7, (float) (-arg3 + this.field7345) * var8);
        OpenGL.glVertex2i(this.field7398, this.field7345);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7398) * var7, (float) (-arg3 + this.field7347) * var8);
        OpenGL.glVertex2i(this.field7398, this.field7347);
        OpenGL.glEnd();
        this.method2968(768, 0, (byte) 122, 5890);
    }

    @OriginalMember(owner = "client!kga", name = "JA", descriptor = "()V", line = 1953)
    public final void method249() {
        this.field7345 = this.field7059;
        ++field7158;
        this.field7366 = 0;
        this.field7347 = 0;
        this.field7398 = this.field7089;
        OpenGL.glDisable(3089);
        this.method2935(1);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 1968)
    public final void method240(Rectangle[] arg0, int arg1) throws class365 {
        this.method293();
        ++field7225;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lq;)V", line = 1976)
    public final void method262(class394 arg0) {
        ++field7238;
        this.field7298.method711(arg0);
        this.field7300.method711(this.field7298);
        this.field7300.method3019((byte) -100);
        this.field7301.method3023(this.field7300, 14);
        if (~this.field7374 != -2) {
            this.method2967(-115);
        }
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(ZB)V", line = 1993)
    public final void method2969(boolean arg0, byte arg1) {
        if (arg1 != -104) {
            this.method2937(false, (class510) null);
        }
        ++field7210;
        if (arg0 == !this.field7309) {
            this.field7309 = arg0;
            this.method2950(arg1 ^ -5220);
            this.field7299 &= -8;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILuq;)V", line = 2011)
    public final void method2970(int arg0, class145 arg1) {
        if (arg0 != -16059) {
            this.method317();
        }
        if (this.field7381 != arg1) {
            if (this.field7340) {
                OpenGL.glBindBufferARB(34963, arg1.method940((byte) 83));
            }
            this.field7381 = arg1;
        }
        ++field7071;
    }

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "(B)V", line = 2031)
    public final void method2971(byte arg0) {
        if (this.field7299 != 16) {
            this.method2951(false);
            this.method2943(true, (byte) -122);
            this.method2952(true, (byte) 24);
            this.method2931((byte) -103, true);
            this.method2996(1, true);
            this.field7299 = 16;
        }
        if (arg0 != -9) {
            this.field7385 = 0.31131592F;
        }
        ++field7125;
    }

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "(B)V", line = 2056)
    private final void method2972(byte arg0) {
        ++field7252;
        float var2 = (float) (-this.field7337) * this.field7395 / (float) this.field7336;
        float var3 = (float) (-this.field7356) * this.field7395 / (float) this.field7357;
        float var4 = (float) (-this.field7337 + this.field7089) * this.field7395 / (float) this.field7336;
        float var5 = (float) (this.field7059 - this.field7356) * this.field7395 / (float) this.field7357;
        if (arg0 <= 78) {
            this.field7408 = -19;
        }
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field7332, (double) this.field7343);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!kga", name = "q", descriptor = "(I)V", line = 2080)
    public final void method2973(int arg0) {
        ++field7192;
        if (arg0 >= -62) {
            this.field7302 = null;
        }
        if (~this.field7374 != -1) {
            this.field7299 &= -32;
            this.field7374 = 0;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lcaa;)V", line = 2097)
    public final void method277(class275 arg0) {
        ++field7075;
        this.field7317 = (class340) arg0;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lso;)V", line = 2105)
    public final void method228(class436 arg0) {
        ++field7172;
        this.field7250.method3845(this, -1, arg0, 2);
    }

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "(B)V", line = 2114)
    private final void method2974(byte arg0) {
        this.field7394[10] = this.field7348;
        ++field7055;
        this.field7394[14] = this.field7371;
        this.field7325 = (this.field7394[14] - (float) this.field7343) / this.field7394[10];
        int var2 = 26 % ((85 - arg0) / 37);
        this.field7389 = (float) this.field7343;
    }

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "(II)V", line = 2132)
    public final void method2975(int arg0, int arg1) {
        if (arg1 <= 68) {
            this.method2982(-69, 3);
        }
        ++field7095;
        if (this.field7314 != arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field7314 = arg0;
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(IIZ)V", line = 2149)
    public final synchronized void method2976(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field7255 = null;
        }
        ++field7092;
        class556 var4 = new class556(arg1);
        var4.field7519 = (long) arg0;
        this.field7288.method1129(var4, 262144);
    }

    @OriginalMember(owner = "client!kga", name = "r", descriptor = "(I)V", line = 2165)
    private final void method2977(int arg0) {
        if (~this.field7374 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field7089 > 0 && ~this.field7059 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field7089, (double) this.field7059, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field7299 &= -25;
            this.field7374 = 1;
        }
        if (arg0 == -1) {
            ++field7193;
        }
    }

    @OriginalMember(owner = "client!kga", name = "s", descriptor = "(I)V", line = 2190)
    private final void method2978(int arg0) {
        ++field7146;
        if (arg0 != -1) {
            this.field7351 = -75;
        }
        int var2;
        for (var2 = 0; ~this.field7382 < ~var2; ++var2) {
            class530 var3 = this.field7367[var2];
            int var4 = var2 + 16386;
            class221.field2880[0] = (float) var3.method3118(arg0 + 34038);
            class221.field2880[1] = (float) var3.method3119(class570.method3340(arg0, -3554));
            class221.field2880[2] = (float) var3.method3115(-30190);
            class221.field2880[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class221.field2880, 0);
            int var5 = var3.method3120(true);
            float var6 = var3.method3117(false) / 255.0F;
            class221.field2880[0] = var6 * (float) (class435.method2605(var5, 16723868) >> 16);
            class221.field2880[1] = (float) (class435.method2605(65288, var5) >> 8) * var6;
            class221.field2880[2] = var6 * (float) class435.method2605(255, var5);
            OpenGL.glLightfv(var4, 4609, class221.field2880, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method3122(-11184) * var3.method3122(-11184)));
            OpenGL.glEnable(var4);
        }
        while (~this.field7318 < ~var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field7318 = this.field7382;
    }

    @OriginalMember(owner = "client!kga", name = "O", descriptor = "(IIIIII)Z", line = 2235)
    public final boolean method217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7181;
        float var7 = (float) arg2 * this.field7298.field7442 + (float) arg0 * this.field7298.field7426 + (float) arg1 * this.field7298.field7429 + this.field7298.field7455;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field7298.field7442 + (float) arg3 * this.field7298.field7426 + (float) arg4 * this.field7298.field7429 + this.field7298.field7455;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field7332) || !((float) this.field7332 > var8)) && (!((float) this.field7343 < var7) || !(var8 > (float) this.field7343))) {
            int var9 = (int) (((float) arg2 * this.field7298.field7453 + (float) arg0 * this.field7298.field7432 + (float) arg1 * this.field7298.field7440 + this.field7298.field7441) * (float) this.field7336 / var7);
            int var10 = (int) (((float) arg5 * this.field7298.field7453 + (float) arg3 * this.field7298.field7432 + (float) arg4 * this.field7298.field7440 + this.field7298.field7441) * (float) this.field7336 / var8);
            if ((float) var9 < this.field7385 && (float) var10 < this.field7385 || (float) var9 > this.field7320 && (float) var10 > this.field7320) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field7298.field7449 + (float) arg0 * this.field7298.field7454 + (float) arg1 * this.field7298.field7424 + this.field7298.field7434) * (float) this.field7357 / var7);
                int var12 = (int) (((float) arg5 * this.field7298.field7449 + (float) arg3 * this.field7298.field7454 + (float) arg4 * this.field7298.field7424 + this.field7298.field7434) * (float) this.field7357 / var8);
                return (!((float) var11 < this.field7305) || !((float) var12 < this.field7305)) && (!((float) var11 > this.field7393) || !(this.field7393 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lpga;Z)Lf;", line = 2278)
    public final class701 method216(class495 arg0, boolean arg1) {
        ++field7139;
        int[] var3 = new int[arg0.field6906 * arg0.field6899];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field6902 == null) {
            for (int var6 = 0; arg0.field6906 > var6; ++var6) {
                for (int var7 = 0; ~var7 > ~arg0.field6899; ++var7) {
                    int var8 = arg0.field6905[arg0.field6907[var4++] & 255];
                    var3[var5++] = var8 != 0 ? class242.method1474(var8, -16777216) : 0;
                }
            }
        } else {
            for (int var9 = 0; arg0.field6906 > var9; ++var9) {
                for (int var11 = 0; arg0.field6899 > var11; ++var11) {
                    var3[var5++] = class242.method1474(arg0.field6905[class435.method2605(arg0.field6907[var4], 255)], arg0.field6902[var4] << 24);
                    ++var4;
                }
            }
        }
        class701 var10 = this.method311(var3, 0, arg0.field6899, arg0.field6899, arg0.field6906);
        var10.method894(arg0.field6901, arg0.field6900, arg0.field6903, arg0.field6904);
        return var10;
    }

    @OriginalMember(owner = "client!kga", name = "ya", descriptor = "()V", line = 2341)
    public final void method246() {
        ++field7131;
        this.method2931((byte) -127, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!kga", name = "t", descriptor = "(I)V", line = 2355)
    private final void method2979(int arg0) {
        ++field7087;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field7394, arg0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lgda;[Lpga;Z)Lla;", line = 2365)
    public final class419 method258(class50 arg0, class495[] arg1, boolean arg2) {
        ++field7081;
        return new class296(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(II[BZI)Luq;", line = 2377)
    public final class145 method2980(int arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        if (arg1 != 1) {
            return null;
        } else {
            ++field7188;
            return (class145) (!this.field7340 || arg3 && !this.field7364 ? new class267(this, arg0, arg2, arg4) : new class693(this, arg0, arg2, arg4, arg3));
        }
    }

    @OriginalMember(owner = "client!kga", name = "CA", descriptor = "(IIII)V", line = 2393)
    public final void method229(int arg0, int arg1, int arg2, int arg3) {
        this.field7403 = arg0;
        this.field7315 = arg1;
        this.field7377 = true;
        this.field7391 = arg3;
        ++field7232;
        this.field7329 = arg2;
    }

    @OriginalMember(owner = "client!kga", name = "u", descriptor = "(I)V", line = 2407)
    public final void method2981(int arg0) {
        ++field7094;
        if (this.field7299 != 4) {
            this.method2977(~arg0);
            this.method2943(false, (byte) -83);
            this.method2969(false, (byte) -104);
            this.method2952(false, (byte) 24);
            this.method2931((byte) -117, false);
            this.method2988(true, -2);
            this.method2996(1, true);
            this.field7299 = 4;
        }
        if (arg0 != 0) {
            this.field7296 = true;
        }
    }

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "(II)I", line = 2429)
    public final int method2982(int arg0, int arg1) {
        if (arg0 < 50) {
            this.method2981(58);
        }
        ++field7119;
        if (~arg1 != -5122 && arg1 != 5120) {
            if (~arg1 != -5124 && ~arg1 != -5123) {
                if (arg1 != 5125 && arg1 != 5124 && arg1 != 5126) {
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

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "()Z", line = 2454)
    public final boolean method299() {
        ++field7203;
        if (this.field7253 != null) {
            if (!this.field7253.method1440((byte) -112)) {
                if (!this.field7249.method1012(this.field7253, (byte) 123)) {
                    return false;
                }
                this.field7256.method3170(6408);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(FIFFF)V", line = 2479)
    public final void method2983(float arg0, int arg1, float arg2, float arg3, float arg4) {
        if (arg1 > -120) {
            this.field7412 = null;
        }
        class188.field2300[0] = arg2;
        class188.field2300[1] = arg0;
        class188.field2300[3] = arg3;
        class188.field2300[2] = arg4;
        ++field7110;
        OpenGL.glTexEnvfv(8960, 8705, class188.field2300, 0);
    }

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "(IIII)[I", line = 2494)
    public final int[] method325(int arg0, int arg1, int arg2, int arg3) {
        ++field7197;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; arg3 > var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + -var6 + this.field7059, arg2, 1, 32993, this.field7310, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!kga", name = "IA", descriptor = "(IIIIII[BII)V", line = 2516)
    public final void method324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field7241;
        float var10;
        float var11;
        if (this.field7379 != null && arg2 <= this.field7379.field4006 && arg3 <= this.field7379.field4009) {
            this.field7379.method1768(0, 0, arg3, false, true, arg2, 0, 0, arg6, 6406);
            var10 = (float) arg2 * this.field7379.field8429 / (float) this.field7379.field4006;
            var11 = (float) arg3 * this.field7379.field8435 / (float) this.field7379.field4009;
        } else {
            this.field7379 = class703.method3942(arg2, false, arg3, 6406, this, 6406, arg6, -127);
            this.field7379.method1767(false, false, 10242);
            var10 = this.field7379.field8429;
            var11 = this.field7379.field8435;
        }
        this.method2933((byte) 114);
        this.method2932(true, this.field7379);
        this.method2996(arg8, true);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2997(arg5, -89);
        this.method2948(34165, 34165, (byte) 102);
        this.method2968(768, 0, (byte) 35, 34166);
        this.method2968(770, 2, (byte) -87, 5890);
        this.method2938(-125, 34166, 770, 0);
        this.method2938(-124, 5890, 770, 2);
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
        this.method2968(768, 0, (byte) 105, 5890);
        this.method2968(770, 2, (byte) -118, 34166);
        this.method2938(-127, 5890, 770, 0);
        this.method2938(-125, 34166, 770, 2);
    }

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "(I)V", line = 2573)
    public final void method222(int arg0) {
        this.method2992(0);
        ++field7109;
    }

    @OriginalMember(owner = "client!kga", name = "k", descriptor = "()Z", line = 2582)
    public final boolean method233() {
        ++field7056;
        return true;
    }

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "(I)Le;", line = 2591)
    public final class493 method210(int arg0) {
        ++field7194;
        class678 var2 = new class678(arg0);
        this.field7265.method1129(var2, 262144);
        return var2;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(II[I[I)Lua;", line = 2602)
    public final class616 method213(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field7209;
        return class671.method3821(this, arg2, (byte) 40, arg1, arg3, arg0);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIILuq;I)V", line = 2610)
    public final void method2984(int arg0, int arg1, int arg2, class145 arg3, int arg4) {
        ++field7155;
        int var6 = arg3.method939(32726);
        int var7 = arg1 * this.method2982(58, var6);
        this.method2970(arg4 + -16571, arg3);
        OpenGL.glDrawElements(arg2, arg0, var6, arg3.method937((byte) -106) + (long) var7);
        if (arg4 != 512) {
            this.method239(0.9134763F);
        }
    }

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "(II)V", line = 2627)
    public final void method2985(int arg0, int arg1) {
        if (arg1 == -26973) {
            if (~arg0 != -2) {
                if (arg0 == 0) {
                    this.method2948(8448, 8448, (byte) 48);
                } else if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            this.method2948(34023, 34023, (byte) 94);
                        }
                    } else {
                        this.method2948(260, 8448, (byte) 10);
                    }
                } else {
                    this.method2948(34165, 7681, (byte) -123);
                }
            } else {
                this.method2948(7681, 7681, (byte) 68);
            }
            ++field7113;
        }
    }

    @OriginalMember(owner = "client!kga", name = "v", descriptor = "()[I", line = 2659)
    public final int[] method264() {
        ++field7196;
        return new int[] { this.field7337, this.field7356, this.field7336, this.field7357 };
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(BLoi;)V", line = 2675)
    public final void method2986(byte arg0, class64 arg1) {
        ++field7246;
        if (this.field7272 >= 3) {
            throw new RuntimeException();
        } else {
            if (this.field7272 >= 0) {
                this.field7274[this.field7272].method611((byte) -45);
            }
            this.field7276 = this.field7274[++this.field7272] = arg1;
            this.field7276.method610(10583);
            if (arg0 != 116) {
                this.field7261 = -79;
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "z", descriptor = "()Z", line = 2700)
    public final boolean method317() {
        ++field7154;
        return this.field7312 && (!this.method237() || this.field7392);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 2713)
    public final class37 method220(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field7223;
        return new class257(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(ZLcba;)V", line = 2725)
    public final void method2987(boolean arg0, class510 arg1) {
        if (arg0) {
            this.method2940((byte) -21);
        }
        OpenGL.glLoadMatrixf(arg1.method3022(-67), 0);
        ++field7077;
    }

    @OriginalMember(owner = "client!kga", name = "w", descriptor = "()Z", line = 2736)
    public final boolean method225() {
        ++field7112;
        return true;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZI)V", line = 2744)
    public final void method2988(boolean arg0, int arg1) {
        this.method2945(arg1, arg0, true);
        ++field7123;
    }

    @OriginalMember(owner = "client!kga", name = "va", descriptor = "(I)V", line = 2752)
    public final void method312(int arg0) {
        this.field7261 = 0;
        ++field7157;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field7261;
        }
        this.field7266 = 1 << this.field7261;
    }

    @OriginalMember(owner = "client!kga", name = "C", descriptor = "()Z", line = 2768)
    public final boolean method316() {
        ++field7201;
        return true;
    }

    @OriginalMember(owner = "client!kga", name = "A", descriptor = "()Z", line = 2777)
    public final boolean method226() {
        ++field7171;
        return true;
    }

    @OriginalMember(owner = "client!kga", name = "o", descriptor = "()Z", line = 2785)
    public final boolean method224() {
        ++field7105;
        return this.field7255.method858(3, -1666);
    }

    @OriginalMember(owner = "client!kga", name = "y", descriptor = "()V", line = 2795)
    public final void method328() {
        ++field7213;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IB)V", line = 2804)
    public final synchronized void method2989(int arg0, byte arg1) {
        if (arg1 != 97) {
            this.method3001((byte) -59);
        }
        ++field7100;
        class556 var3 = new class556(arg0);
        this.field7287.method1129(var3, arg1 + 262047);
    }

    @OriginalMember(owner = "client!kga", name = "la", descriptor = "(IIII)V", line = 2818)
    public final void method301(int arg0, int arg1, int arg2, int arg3) {
        ++field7182;
        this.field7356 = arg1;
        this.field7337 = arg0;
        this.field7357 = arg3;
        this.field7336 = arg2;
        this.method2999(12);
        this.method2935(1);
        if (this.field7374 == 3) {
            this.method2972((byte) 94);
        } else if (~this.field7374 == -3) {
            this.method2979(0);
        }
    }

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "()Z", line = 2842)
    public final boolean method211() {
        ++field7099;
        return false;
    }

    @OriginalMember(owner = "client!kga", name = "GA", descriptor = "(II)V", line = 2850)
    public final void method297(int arg0, int arg1) {
        ++field7101;
        if (~this.field7332 != ~arg0 || ~this.field7343 != ~arg1) {
            this.field7343 = arg1;
            this.field7332 = arg0;
            this.method2999(12);
            this.method3010(-1);
            if (this.field7374 != 3) {
                if (this.field7374 == 2) {
                    this.method2979(0);
                    return;
                }
            } else {
                this.method2972((byte) 95);
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "q", descriptor = "()V", line = 2876)
    public final void method293() throws class365 {
        ++field7121;
        try {
            this.field7096.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "(II)V", line = 2897)
    public final synchronized void method2990(int arg0, int arg1) {
        ++field7088;
        class513 var3 = new class513();
        var3.field7519 = (long) arg1;
        this.field7289.method1129(var3, 262144);
        if (arg0 <= 124) {
            field7215 = null;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lso;I)V", line = 2911)
    public final void method223(class436 arg0, int arg1) {
        ++field7217;
        this.field7250.method3845(this, arg1, arg0, 2);
    }

    @OriginalMember(owner = "client!kga", name = "v", descriptor = "(I)V", line = 2919)
    private final void method2991(int arg0) {
        OpenGL.glDepthMask(this.field7293 && this.field7400);
        if (arg0 < -97) {
            ++field7185;
        }
    }

    @OriginalMember(owner = "client!kga", name = "w", descriptor = "(I)V", line = 2930)
    private final void method2992(int arg0) {
        ++field7126;
        int var2 = arg0;
        while (!this.field7096.method3370()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            class151.method974((byte) -102, 1000L);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IZ)I", line = 2949)
    public final int method2993(int arg0, boolean arg1) {
        ++field7122;
        if (arg0 != 6406 && arg0 != 6409) {
            if (arg0 != 6410 && ~arg0 != -34847 && arg0 != 34844) {
                if (~arg0 != -6408) {
                    if (arg0 != 6408 && ~arg0 != -34848) {
                        if (~arg0 == -34844) {
                            return 6;
                        } else if (arg0 != 34842) {
                            if (~arg0 != -6403) {
                                if (arg0 == 6401) {
                                    return 1;
                                } else {
                                    if (arg1) {
                                        this.field7347 = 97;
                                    }
                                    throw new IllegalArgumentException("");
                                }
                            } else {
                                return 3;
                            }
                        } else {
                            return 8;
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

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2999)
    public final void method294(Canvas arg0) {
        this.field7141 = 0L;
        ++field7244;
        this.field7164 = null;
        if (arg0 != null && this.field7073 != arg0) {
            if (this.field7084.containsKey(arg0)) {
                Long var2 = (Long) this.field7084.get(arg0);
                this.field7141 = var2;
                this.field7164 = arg0;
            }
        } else {
            this.field7141 = this.field7229;
            this.field7164 = this.field7073;
        }
        if (this.field7164 != null && ~this.field7141 != -1L) {
            this.field7096.setSurface(this.field7141);
            this.method3009((byte) -47);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(IIZ)V", line = 3030)
    public final synchronized void method2994(int arg0, int arg1, boolean arg2) {
        ++field7133;
        if (arg2) {
            this.field7392 = true;
        }
        class556 var4 = new class556(arg1);
        var4.field7519 = (long) arg0;
        this.field7285.method1129(var4, 262144);
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(BI)Z", line = 3044)
    public static final boolean method2995(byte arg0, int arg1) {
        ++field7228;
        if (arg0 != 99) {
            return true;
        } else {
            return arg1 == 10 || ~arg1 == -12 || ~arg1 == -13;
        }
    }

    @OriginalMember(owner = "client!kga", name = "u", descriptor = "()Lq;", line = 3055)
    public final class394 method305() {
        ++field7061;
        return new class510();
    }

    @OriginalMember(owner = "client!kga", name = "n", descriptor = "()Lq;", line = 3063)
    public final class394 method315() {
        ++field7204;
        return this.field7259;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIZ)Lf;", line = 3073)
    public final class701 method304(int arg0, int arg1, boolean arg2) {
        ++field7220;
        return new class239(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(IZ)V", line = 3081)
    public final void method2996(int arg0, boolean arg1) {
        if (arg1) {
            ++field7066;
            if (~this.field7297 != ~arg0) {
                boolean var3;
                byte var4;
                boolean var5;
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (~arg0 == -129) {
                            var3 = true;
                            var4 = 3;
                            var5 = true;
                        } else {
                            var3 = true;
                            var4 = 0;
                            var5 = false;
                        }
                    } else {
                        var3 = true;
                        var5 = false;
                        var4 = 2;
                    }
                } else {
                    var4 = 1;
                    var3 = true;
                    var5 = true;
                }
                if (!var3 == this.field7294) {
                    OpenGL.glColorMask(var3, var3, var3, true);
                    this.field7294 = var3;
                }
                if (!this.field7295 != !var5) {
                    if (!var5) {
                        OpenGL.glDisable(3008);
                    } else {
                        OpenGL.glEnable(3008);
                    }
                    this.field7295 = var5;
                }
                if (this.field7291 != var4) {
                    if (var4 != 1) {
                        if (~var4 == -3) {
                            OpenGL.glEnable(3042);
                            OpenGL.glBlendFunc(1, 1);
                        } else if (var4 != 3) {
                            OpenGL.glDisable(3042);
                        } else {
                            OpenGL.glEnable(3042);
                            OpenGL.glBlendFunc(774, 1);
                        }
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(770, 771);
                    }
                    this.field7291 = var4;
                }
                this.field7297 = arg0;
                this.field7299 &= -29;
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "(IIIII)V", line = 3178)
    public final void method320(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7065;
        if (~arg2 > -1) {
            arg2 = -arg2;
        }
        if (this.field7366 <= arg0 + arg2 && ~this.field7398 <= ~(-arg2 + arg0) && this.field7347 <= arg1 + arg2 && ~(-arg2 + arg1) >= ~this.field7345) {
            this.method3002(-125);
            this.method2996(arg4, true);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field7316 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if ((float) var8 <= this.field7369) {
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
                int var10 = class13.method143(var9, 60);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class201.field2429[var11] * (float) arg2 + var6, class201.field2423[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "(II)V", line = 3253)
    public final void method2997(int arg0, int arg1) {
        class188.field2300[0] = (float) class435.method2605(arg0, 16711680) / 1.671168E7F;
        class188.field2300[1] = (float) class435.method2605(arg0, 65280) / 65280.0F;
        class188.field2300[2] = (float) class435.method2605(arg0, 255) / 255.0F;
        class188.field2300[3] = (float) (arg0 >>> 24) / 255.0F;
        if (arg1 <= -44) {
            ++field7224;
            OpenGL.glTexEnvfv(8960, 8705, class188.field2300, 0);
        }
    }

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "(B)I", line = 3270)
    private final int method2998(byte arg0) {
        ++field7138;
        int var2 = 0;
        this.field7334 = OpenGL.glGetString(7936).toLowerCase();
        this.field7378 = OpenGL.glGetString(7937).toLowerCase();
        if (arg0 != -62) {
            this.field7381 = null;
        }
        if (~this.field7334.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (this.field7334.indexOf("brian paul") != -1 || ~this.field7334.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class72.method637(' ', false, var3.replace('.', ' '));
        if (var4.length < 2) {
            var2 |= 4;
        } else {
            try {
                int var5 = class79.method663(10, var4[0]);
                int var6 = class79.method663(10, var4[1]);
                this.field7362 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (this.field7362 < 12) {
            var2 |= 2;
        }
        if (!this.field7096.method3369("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field7096.method3369("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field7319 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field7313 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field7384 = var7[0];
        if (this.field7319 < 2 || this.field7313 < 2 || ~this.field7384 > -3) {
            var2 |= 16;
        }
        this.field7353 = Stream.method3579();
        this.field7409 = this.field7096.arePbuffersAvailable();
        this.field7340 = this.field7096.method3369("GL_ARB_vertex_buffer_object");
        this.field7312 = this.field7096.method3369("GL_ARB_multisample");
        this.field7358 = this.field7096.method3369("GL_ARB_vertex_program");
        this.field7096.method3369("GL_ARB_fragment_program");
        this.field7386 = this.field7096.method3369("GL_ARB_vertex_shader");
        this.field7370 = this.field7096.method3369("GL_ARB_fragment_shader");
        this.field7349 = this.field7096.method3369("GL_EXT_texture3D");
        this.field7355 = this.field7096.method3369("GL_ARB_texture_rectangle");
        this.field7410 = this.field7096.method3369("GL_ARB_texture_cube_map");
        this.field7368 = this.field7096.method3369("GL_ARB_texture_float");
        this.field7360 = false;
        this.field7397 = this.field7096.method3369("GL_EXT_framebuffer_object");
        this.field7390 = this.field7096.method3369("GL_EXT_framebuffer_blit");
        this.field7339 = this.field7096.method3369("GL_EXT_framebuffer_multisample");
        this.field7392 = this.field7339 & this.field7390;
        OpenGL.glGetFloatv(2834, class188.field2300, 0);
        this.field7369 = class188.field2300[1];
        this.field7316 = class188.field2300[0];
        return var2 != 0 ? var2 : 0;
    }

    @OriginalMember(owner = "client!kga", name = "ja", descriptor = "(I)V", line = 3353)
    public final void method323(int arg0) {
        this.method2996(0, true);
        ++field7102;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "(I)V", line = 3367)
    public final void method230(int arg0) {
        ++field7221;
        if (~arg0 <= -129 && arg0 <= 1024) {
            this.field7254 = arg0;
            this.field7256.method3170(6408);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Z)V", line = 3380)
    public final void method295(boolean arg0) {
        ++field7063;
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 3388)
    public final void method275(Canvas arg0) {
        ++field7067;
        long var2 = 0L;
        if (arg0 != null && this.field7073 != arg0) {
            if (this.field7084.containsKey(arg0)) {
                Long var4 = (Long) this.field7084.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field7229;
        }
        if (var2 == 0L) {
            throw new RuntimeException();
        } else {
            this.field7096.surfaceResized(var2);
            if (this.field7164 == arg0) {
                this.method3009((byte) -47);
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "XA", descriptor = "(IIIII)V", line = 3420)
    public final void method290(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3002(-128);
        ++field7237;
        this.method2996(arg4, true);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)V", line = 3440)
    public final synchronized void method263(int arg0) {
        ++field7156;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field7285.method1130((byte) 77)) {
            class556 var12 = (class556) this.field7285.method1137(-1);
            class39.field732[var3++] = (int) var12.field7519;
            this.field7284 -= var12.field8043;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class39.field732, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class39.field732, 0);
            var3 = 0;
        }
        while (!this.field7286.method1130((byte) 103)) {
            class556 var11 = (class556) this.field7286.method1137(-1);
            class39.field732[var3++] = (int) var11.field7519;
            this.field7281 -= var11.field8043;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class39.field732, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class39.field732, 0);
            var3 = 0;
        }
        while (!this.field7287.method1130((byte) 92)) {
            class556 var10 = (class556) this.field7287.method1137(-1);
            class39.field732[var3++] = var10.field8043;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class39.field732, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class39.field732, 0);
            var3 = 0;
        }
        while (!this.field7288.method1130((byte) 90)) {
            class556 var9 = (class556) this.field7288.method1137(-1);
            class39.field732[var3++] = (int) var9.field7519;
            this.field7280 -= var9.field8043;
            if (~var3 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class39.field732, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class39.field732, 0);
            boolean var4 = false;
        }
        while (!this.field7282.method1130((byte) 65)) {
            class556 var8 = (class556) this.field7282.method1137(-1);
            OpenGL.glDeleteLists((int) var8.field7519, var8.field8043);
        }
        while (!this.field7289.method1130((byte) 100)) {
            class513 var7 = this.field7289.method1137(-1);
            OpenGL.glDeleteProgramARB((int) var7.field7519);
        }
        while (!this.field7290.method1130((byte) 73)) {
            class513 var6 = this.field7290.method1137(-1);
            OpenGL.glDeleteObjectARB(var6.field7519);
        }
        while (!this.field7282.method1130((byte) 113)) {
            class556 var5 = (class556) this.field7282.method1137(-1);
            OpenGL.glDeleteLists((int) var5.field7519, var5.field8043);
        }
        this.field7256.method3167((byte) -60);
        if (~this.method214() < -100663297 && ~(this.field7292 + 60000L) > ~class301.method1787((byte) -120)) {
            System.gc();
            this.field7292 = class301.method1787((byte) -26);
        }
        this.field7264 = var2;
    }

    @OriginalMember(owner = "client!kga", name = "x", descriptor = "(I)V", line = 3605)
    private final void method2999(int arg0) {
        ++field7218;
        float[] var2 = this.field7394;
        if (arg0 != 12) {
            this.method259(-109, 40, 22, -113, 48, -46);
        }
        float var3 = (float) (-this.field7337 * this.field7332) / (float) this.field7336;
        float var4 = (float) ((this.field7089 - this.field7337) * this.field7332) / (float) this.field7336;
        float var5 = (float) (this.field7356 * this.field7332) / (float) this.field7357;
        float var6 = (float) ((-this.field7059 + this.field7356) * this.field7332) / (float) this.field7357;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field7332 * 2.0F;
            var2[12] = 0.0F;
            var2[13] = 0.0F;
            var2[1] = 0.0F;
            var2[3] = 0.0F;
            var2[5] = var7 / (var5 - var6);
            var2[10] = this.field7348 = (float) (-(this.field7343 - -this.field7332)) / (float) (-this.field7332 + this.field7343);
            var2[0] = var7 / (var4 - var3);
            var2[14] = this.field7371 = -((float) this.field7343 * var7) / (float) (-this.field7332 + this.field7343);
            var2[6] = 0.0F;
            var2[11] = -1.0F;
            var2[7] = 0.0F;
            var2[4] = 0.0F;
            var2[15] = 0.0F;
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[2] = 0.0F;
        } else {
            var2[14] = 0.0F;
            var2[2] = 0.0F;
            var2[5] = 1.0F;
            var2[15] = 1.0F;
            var2[9] = 0.0F;
            var2[12] = 0.0F;
            var2[3] = 0.0F;
            var2[6] = 0.0F;
            var2[10] = 1.0F;
            var2[13] = 0.0F;
            var2[4] = 0.0F;
            var2[7] = 0.0F;
            var2[11] = 0.0F;
            var2[0] = 1.0F;
            var2[8] = 0.0F;
            var2[1] = 0.0F;
        }
        this.method2974((byte) 123);
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(IIII)V", line = 3667)
    public final void method3000(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 > -84) {
            this.field7365 = false;
        }
        OpenGL.glDrawArrays(arg0, arg3, arg2);
        ++field7085;
    }

    @OriginalMember(owner = "client!kga", name = "DA", descriptor = "()I", line = 3683)
    public final int method327() {
        ++field7207;
        int var1 = this.field7414;
        this.field7414 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!kga", name = "k", descriptor = "(B)V", line = 3695)
    private final void method3001(byte arg0) {
        ++field7189;
        this.method2988(true, -2);
        for (int var2 = this.field7319 + -1; var2 >= 0; --var2) {
            this.method2975(var2, 91);
            this.method2932(true, (class197) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2948(8448, 8448, (byte) -117);
        this.method2968(770, 2, (byte) -110, 34168);
        this.method3011(5888);
        this.field7297 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field7291 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field7295 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field7294 = true;
        this.method2943(true, (byte) -79);
        this.method2969(true, (byte) -104);
        this.method2952(true, (byte) 24);
        this.method2931((byte) -112, true);
        if (arg0 < 49) {
            this.method2958((class64) null, -72);
        }
        this.method2973(-89);
        this.field7096.setSwapInterval(0);
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
        this.field7406 = this.field7380 = -1;
        this.method249();
    }

    @OriginalMember(owner = "client!kga", name = "m", descriptor = "()Z", line = 3768)
    public final boolean method318() {
        ++field7127;
        return true;
    }

    @OriginalMember(owner = "client!kga", name = "L", descriptor = "()V", line = 3776)
    public final void method291() {
        ++field7153;
        this.field7377 = false;
    }

    @OriginalMember(owner = "client!kga", name = "x", descriptor = "()V", line = 3790)
    public final void method286() {
        for (class513 var1 = this.field7265.method1132((byte) -111); var1 != null; var1 = this.field7265.method1134(8446)) {
            ((class678) var1).method3850(16777215);
        }
        ++field7178;
        if (this.field7249 != null) {
            this.field7249.method1010((byte) 127);
        }
        if (this.field7096 != null) {
            this.method2961(-120);
            Enumeration var2 = this.field7084.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field7084.get(var3);
                this.field7096.releaseSurface(var3, var4);
            }
            this.field7096.release();
            this.field7096 = null;
        }
        if (this.field7267) {
            class54.method567(true, false, true);
            this.field7267 = false;
        }
    }

    @OriginalMember(owner = "client!kga", name = "y", descriptor = "(I)V", line = 3834)
    private final void method3002(int arg0) {
        if (arg0 <= -122) {
            ++field7114;
            if (~this.field7299 != -2) {
                this.method2977(-1);
                this.method2943(false, (byte) -84);
                this.method2969(false, (byte) -104);
                this.method2952(false, (byte) 24);
                this.method2931((byte) -103, false);
                this.method2932(true, (class197) null);
                this.method2988(true, -2);
                this.method2985(1, -26973);
                this.field7299 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IILqn;IIZ)V", line = 3859)
    public static final void method3003(int arg0, int arg1, class58 arg2, int arg3, int arg4, boolean arg5) {
        ++field7103;
        if (~arg2.field924 != 0 || arg2.field901 != null) {
            int var6 = 0;
            if (!arg5) {
                if (arg3 > arg2.field897) {
                    var6 += -arg2.field897 + arg3;
                } else if (arg3 < arg2.field920) {
                    var6 += -arg3 + arg2.field920;
                }
                int var7 = class221.field2851.field4134 * arg2.field900 >> 8;
                if (arg2.field905 >= arg0) {
                    if (arg0 < arg2.field923) {
                        var6 += -arg0 + arg2.field923;
                    }
                } else {
                    var6 += -arg2.field905 + arg0;
                }
                if (arg2.field910 != 0 && arg2.field910 >= var6 + -256 && ~class221.field2851.field4134 != -1 && arg2.field903 == arg4) {
                    var6 -= 256;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var8 = (-var6 + arg2.field910) * var7 / arg2.field910;
                    class206.field2472.method1284((byte) -124);
                    short var9 = 8192;
                    if (arg2.field906 == null) {
                        if (arg2.field924 >= 0) {
                            int var10 = arg2.field899 == 256 && ~arg2.field907 == -257 ? 256 : class576.method3368(arg2.field907, arg2.field899, arg5);
                            if (!arg2.field912) {
                                class319 var11 = class319.method1858(class538.field7834, arg2.field924, 0);
                                if (var11 != null) {
                                    class387 var12 = var11.method1860().method2215(class678.field9726);
                                    class360 var13 = class360.method2044(var12, var10, var8 << 6, var9);
                                    var13.method2036(-1);
                                    class399.field5624.method1802(var13);
                                    arg2.field906 = var13;
                                }
                            } else {
                                if (arg2.field918 == null) {
                                    arg2.field918 = class476.method2795(class166.field2040, arg2.field924);
                                }
                                if (arg2.field918 != null) {
                                    if (arg2.field902 == null) {
                                        arg2.field902 = arg2.field918.method2798(new int[] { 22050 });
                                    }
                                    if (arg2.field902 != null) {
                                        class360 var14 = class360.method2044(arg2.field902, var10, var8 << 6, var9);
                                        var14.method2036(-1);
                                        class399.field5624.method1802(var14);
                                        arg2.field906 = var14;
                                    }
                                }
                            }
                        }
                    } else {
                        arg2.field906.method2058(var8);
                        arg2.field906.method2023(var9);
                    }
                    if (arg2.field914 == null) {
                        if (arg2.field901 != null && ~(arg2.field915 -= arg1) >= -1) {
                            int var15 = ~arg2.field899 == -257 && arg2.field907 == 256 ? 256 : arg2.field907 + (int) (Math.random() * (double) (arg2.field899 - arg2.field907));
                            if (arg2.field922) {
                                if (arg2.field913 == null) {
                                    int var16 = (int) ((double) arg2.field901.length * Math.random());
                                    arg2.field913 = class476.method2795(class166.field2040, arg2.field901[var16]);
                                }
                                if (arg2.field913 != null) {
                                    if (arg2.field908 == null) {
                                        arg2.field908 = arg2.field913.method2798(new int[] { 22050 });
                                    }
                                    if (arg2.field908 != null) {
                                        class360 var17 = class360.method2044(arg2.field908, var15, var8 << 6, var9);
                                        var17.method2036(0);
                                        class399.field5624.method1802(var17);
                                        arg2.field914 = var17;
                                        arg2.field915 = (int) (Math.random() * (double) (-arg2.field898 + arg2.field925)) + arg2.field898;
                                        return;
                                    }
                                }
                                return;
                            }
                            int var18 = (int) ((double) arg2.field901.length * Math.random());
                            class319 var19 = class319.method1858(class538.field7834, arg2.field901[var18], 0);
                            if (var19 != null) {
                                class387 var20 = var19.method1860().method2215(class678.field9726);
                                class360 var21 = class360.method2044(var20, var15, var8 << 6, var9);
                                var21.method2036(0);
                                class399.field5624.method1802(var21);
                                arg2.field915 = (int) ((double) (-arg2.field898 + arg2.field925) * Math.random()) + arg2.field898;
                                arg2.field914 = var21;
                                return;
                            }
                        }
                    } else {
                        arg2.field914.method2058(var8);
                        arg2.field914.method2023(var9);
                        if (arg2.field914.method3047(32)) {
                            return;
                        }
                        arg2.field908 = null;
                        arg2.field913 = null;
                        arg2.field914 = null;
                    }
                } else {
                    if (arg2.field906 != null) {
                        class399.field5624.method1805(arg2.field906);
                        arg2.field902 = null;
                        arg2.field906 = null;
                        arg2.field918 = null;
                    }
                    if (arg2.field914 != null) {
                        class399.field5624.method1805(arg2.field914);
                        arg2.field913 = null;
                        arg2.field908 = null;
                        arg2.field914 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "BA", descriptor = "()I", line = 4091)
    public final int method260() {
        ++field7233;
        return this.field7332;
    }

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "(IIZ)V", line = 4099)
    public final void method3004(int arg0, int arg1, boolean arg2) {
        ++field7230;
        if (arg2) {
            this.field7411 = arg1;
            this.field7308 = arg0;
            this.method2949((byte) -127);
            this.method2959((byte) -93);
        }
    }

    @OriginalMember(owner = "client!kga", name = "r", descriptor = "()Z", line = 4113)
    public final boolean method237() {
        ++field7128;
        return this.field7253 != null && this.field7253.method1440((byte) -112);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IJ)V", line = 4122)
    public final synchronized void method3005(int arg0, long arg1) {
        if (arg0 == 0) {
            ++field7208;
            class513 var4 = new class513();
            var4.field7519 = arg1;
            this.field7290.method1129(var4, 262144);
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(II)I", line = 4136)
    public final int method306(int arg0, int arg1) {
        ++field7068;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(FIF)V", line = 4144)
    public final void method3006(float arg0, int arg1, float arg2) {
        this.field7333 = arg0;
        ++field7160;
        this.field7350 = arg2;
        int var4 = -4 / ((arg1 - -28) / 36);
        this.method3010(-1);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(FFF)V", line = 4156)
    public final void method255(float arg0, float arg1, float arg2) {
        class170.field2080 = arg0;
        class40.field755 = arg1;
        ++field7186;
        class358.field4773 = arg2;
    }

    @OriginalMember(owner = "client!kga", name = "z", descriptor = "(I)V", line = 4168)
    public final void method3007(int arg0) {
        if (arg0 != 34963) {
            this.method2996(-34, false);
        }
        OpenGL.glPushMatrix();
        ++field7057;
    }

    @OriginalMember(owner = "client!kga", name = "t", descriptor = "()Z", line = 4181)
    public final boolean method247() {
        ++field7134;
        return true;
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 4192)
    public final void method256(Canvas arg0) {
        ++field7148;
        if (this.field7073 == arg0) {
            throw new RuntimeException();
        } else if (this.field7084.containsKey(arg0)) {
            Long var2 = (Long) this.field7084.get(arg0);
            this.field7096.releaseSurface(arg0, var2);
            this.field7084.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZIZB)V", line = 4213)
    public final void method3008(boolean arg0, int arg1, boolean arg2, byte arg3) {
        if (~this.field7401 != ~arg1 || this.field7377 != this.field7326) {
            class298 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field7377 ? 3 : 0;
            if (~arg1 > -1) {
                this.method3011(5888);
            } else {
                var5 = this.field7256.method3169(3553, arg1);
                class352 var10 = super.field2023.method397(arg1, (byte) -128);
                if (~var10.field4695 == -1 && ~var10.field4699 == -1) {
                    this.method3011(arg3 ^ -5985);
                } else {
                    int var11 = var10.field4708 ? 64 : 128;
                    int var12 = var11 * 50;
                    this.method2962((byte) 127, (float) (this.field7264 % var12 * var10.field4699) / (float) var12, (float) (this.field7264 % var12 * var10.field4695) / (float) var12, 0.0F);
                }
                if (!this.field7377) {
                    var7 = var10.field4696;
                    var8 = var10.field4694;
                    var9 = var10.field4707;
                }
                var6 = var10.field4700;
            }
            this.field7255.method856(var7, arg0, var8, 30959, var9, arg2);
            if (!this.field7255.method859(true, var5, var6)) {
                this.method2932(true, var5);
                this.method2985(var6, arg3 + -26876);
            }
            this.field7326 = this.field7377;
            this.field7401 = arg1;
        }
        ++field7167;
        this.field7299 &= -8;
        if (arg3 != -97) {
            this.field7269 = 106;
        }
    }

    @OriginalMember(owner = "client!kga", name = "ra", descriptor = "(F)V", line = 4276)
    public final void method239(float arg0) {
        ++field7248;
        if (this.field7311 != arg0) {
            this.field7311 = arg0;
            this.method2946(3);
        }
    }

    @OriginalMember(owner = "client!kga", name = "l", descriptor = "(B)V", line = 4292)
    private final void method3009(byte arg0) {
        ++field7083;
        if (this.field7164 != null) {
            Dimension var2 = this.field7164.getSize();
            this.field7179 = var2.height;
            this.field7143 = var2.width;
        } else {
            this.field7143 = this.field7179 = 0;
        }
        if (this.field7276 == null) {
            this.field7089 = this.field7143;
            this.field7059 = this.field7179;
            this.method2949((byte) -81);
        }
        this.method2973(-98);
        if (arg0 != -47) {
            this.field7300 = null;
        }
        this.method249();
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIZ)Lf;", line = 4324)
    public final class701 method231(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field7111;
        return new class239(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!kga", name = "A", descriptor = "(I)V", line = 4332)
    private final void method3010(int arg0) {
        this.field7341 = (float) (-this.field7396 + this.field7343) + -this.field7350;
        ++field7222;
        this.field7327 = this.field7341 - (float) this.field7372 * this.field7333;
        if (this.field7327 < (float) this.field7332) {
            this.field7327 = (float) this.field7332;
        }
        OpenGL.glFogf(2915, this.field7327);
        OpenGL.glFogf(2916, this.field7341);
        if (arg0 == -1) {
            class188.field2300[2] = (float) class435.method2605(255, this.field7380) / 255.0F;
            class188.field2300[0] = (float) class435.method2605(this.field7380, 16711680) / 1.671168E7F;
            class188.field2300[1] = (float) class435.method2605(this.field7380, 65280) / 65280.0F;
            OpenGL.glFogfv(2918, class188.field2300, 0);
        }
    }

    @OriginalMember(owner = "client!kga", name = "B", descriptor = "(I)V", line = 4357)
    private final void method3011(int arg0) {
        ++field7191;
        if (this.field7303) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field7303 = false;
        }
        if (arg0 != 5888) {
            this.field7354 = null;
        }
    }

    @OriginalMember(owner = "client!kga", name = "C", descriptor = "(I)V", line = 4376)
    private final void method3012(int arg0) {
        if (this.field7328 && this.field7372 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 >= -25) {
            this.field7402 = 74;
        }
        ++field7149;
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;I)V", line = 4394)
    public class506(Canvas arg0, class212 arg1, int arg2) {
        super(arg1);
        this.field7257 = arg2;
        this.field7164 = this.field7073 = arg0;
        if (!class602.method3469(6298, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class602.method3469(6298, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field7096 = new OpenGL();
                this.field7141 = this.field7229 = this.field7096.init(arg0, 8, 8, 8, 24, 0, this.field7257);
                if (~this.field7229 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method2992(0);
                    int var4 = this.method2998((byte) -62);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field7310 = this.field7353 ? 33639 : 5121;
                        if (~this.field7378.indexOf("radeon") != 0) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class72.method637(' ', false, this.field7378.replace('/', ' '));
                            for (int var9 = 0; var9 < var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (~var10.charAt(0) == -121 && var10.length() >= 3 && class529.method3110((byte) -75, var10.substring(1, 3))) {
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
                                            if (var10.length() >= 4 && class529.method3110((byte) -124, var10.substring(0, 4))) {
                                                var5 = class79.method663(10, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && ~var5 >= -8000) {
                                    this.field7340 = false;
                                }
                                if (var5 >= 7000 && ~var5 >= -9251) {
                                    this.field7349 = false;
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field7368 = false;
                            }
                            this.field7355 &= this.field7096.method3369("GL_ARB_half_float_pixel");
                            this.field7407 = true;
                            this.field7364 = this.field7340;
                        }
                        if (~this.field7334.indexOf("intel") != 0) {
                            this.field7397 = false;
                        }
                        this.field7365 = !this.field7334.equals("s3 graphics");
                        if (this.field7340) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class357.method2012(false, true, (byte) -119);
                        this.field7267 = true;
                        this.field7256 = new class540(this, super.field2023);
                        this.method2957((byte) -100);
                        this.field7263 = new class592(this);
                        this.field7249 = new class160(this);
                        if (this.field7249.method1009(31)) {
                            this.field7253 = new class496(this);
                            if (!this.field7253.method2888((byte) 122)) {
                                this.field7253.method1447(true);
                                this.field7253 = null;
                            }
                        }
                        this.field7255 = new class123(this);
                        this.method3001((byte) 79);
                        this.method3009((byte) -47);
                        this.method283();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method286();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!kga", name = "l", descriptor = "()V", line = 4544)
    public final void method227() {
        ++field7183;
        this.field7249.method1008(-108);
    }

    @OriginalMember(owner = "client!kga", name = "D", descriptor = "(I)V", line = 4556)
    public final void method3013(int arg0) {
        ++field7060;
        if (arg0 != 25973) {
            this.field7096 = null;
        }
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "(Z)V", line = 4571)
    public static void method3014(boolean arg0) {
        field7240 = null;
        field7144 = null;
        if (arg0) {
            method3003(-3, 63, (class58) null, 3, 97, false);
        }
        field7215 = null;
    }
}
