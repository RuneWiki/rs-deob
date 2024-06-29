import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeHeap;
import jaggl.memory.NativeStream;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class487 extends class134 {

    @OriginalMember(owner = "client!rl", name = "ee", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field7305 = new Hashtable();

    @OriginalMember(owner = "client!rl", name = "je", descriptor = "I")
    public int field7310 = 128;

    @OriginalMember(owner = "client!rl", name = "ge", descriptor = "Lbl;")
    private class442 field7307 = new class442();

    @OriginalMember(owner = "client!rl", name = "ne", descriptor = "Lml;")
    private class252 field7314 = new class252();

    @OriginalMember(owner = "client!rl", name = "oe", descriptor = "Lml;")
    public class252 field7315 = new class252();

    @OriginalMember(owner = "client!rl", name = "se", descriptor = "I")
    public int field7319 = 3;

    @OriginalMember(owner = "client!rl", name = "qe", descriptor = "Z")
    private boolean field7317 = false;

    @OriginalMember(owner = "client!rl", name = "ve", descriptor = "I")
    public int field7322 = 8;

    @OriginalMember(owner = "client!rl", name = "ue", descriptor = "Lum;")
    private class347 field7321 = new class347();

    @OriginalMember(owner = "client!rl", name = "ye", descriptor = "I")
    private int field7325 = -1;

    @OriginalMember(owner = "client!rl", name = "Be", descriptor = "I")
    private int field7328 = -1;

    @OriginalMember(owner = "client!rl", name = "xe", descriptor = "[Lht;")
    private class393[] field7324 = new class393[4];

    @OriginalMember(owner = "client!rl", name = "Ae", descriptor = "[Lht;")
    private class393[] field7327 = new class393[4];

    @OriginalMember(owner = "client!rl", name = "Ce", descriptor = "I")
    private int field7329 = -1;

    @OriginalMember(owner = "client!rl", name = "ze", descriptor = "[Lht;")
    private class393[] field7326 = new class393[4];

    @OriginalMember(owner = "client!rl", name = "Ge", descriptor = "Lum;")
    private class347 field7333;

    @OriginalMember(owner = "client!rl", name = "Ie", descriptor = "Lum;")
    private class347 field7335;

    @OriginalMember(owner = "client!rl", name = "Je", descriptor = "Lum;")
    private class347 field7336;

    @OriginalMember(owner = "client!rl", name = "Ke", descriptor = "Lum;")
    private class347 field7337;

    @OriginalMember(owner = "client!rl", name = "Le", descriptor = "Lum;")
    private class347 field7338;

    @OriginalMember(owner = "client!rl", name = "Me", descriptor = "Lum;")
    private class347 field7339;

    @OriginalMember(owner = "client!rl", name = "Ne", descriptor = "Lum;")
    private class347 field7340;

    @OriginalMember(owner = "client!rl", name = "Re", descriptor = "F")
    public float field7344;

    @OriginalMember(owner = "client!rl", name = "bf", descriptor = "Z")
    private boolean field7354;

    @OriginalMember(owner = "client!rl", name = "xf", descriptor = "I")
    public int field7375;

    @OriginalMember(owner = "client!rl", name = "If", descriptor = "I")
    public int field7386;

    @OriginalMember(owner = "client!rl", name = "Se", descriptor = "I")
    public int field7345;

    @OriginalMember(owner = "client!rl", name = "Ye", descriptor = "I")
    private int field7351;

    @OriginalMember(owner = "client!rl", name = "qf", descriptor = "I")
    private int field7368;

    @OriginalMember(owner = "client!rl", name = "ef", descriptor = "F")
    public float field7357;

    @OriginalMember(owner = "client!rl", name = "Tf", descriptor = "I")
    private int field7397;

    @OriginalMember(owner = "client!rl", name = "af", descriptor = "[Ldq;")
    private class472[] field7353;

    @OriginalMember(owner = "client!rl", name = "Uf", descriptor = "F")
    public float field7398;

    @OriginalMember(owner = "client!rl", name = "hg", descriptor = "I")
    public int field7411;

    @OriginalMember(owner = "client!rl", name = "lg", descriptor = "F")
    private float field7415;

    @OriginalMember(owner = "client!rl", name = "ug", descriptor = "F")
    public float field7424;

    @OriginalMember(owner = "client!rl", name = "ig", descriptor = "I")
    private int field7412;

    @OriginalMember(owner = "client!rl", name = "Sf", descriptor = "F")
    public float field7396;

    @OriginalMember(owner = "client!rl", name = "fg", descriptor = "F")
    public float field7409;

    @OriginalMember(owner = "client!rl", name = "mf", descriptor = "I")
    private int field7364;

    @OriginalMember(owner = "client!rl", name = "Hf", descriptor = "I")
    private int field7385;

    @OriginalMember(owner = "client!rl", name = "Mf", descriptor = "I")
    public int field7390;

    @OriginalMember(owner = "client!rl", name = "vf", descriptor = "F")
    public float field7373;

    @OriginalMember(owner = "client!rl", name = "Ig", descriptor = "I")
    public int field7438;

    @OriginalMember(owner = "client!rl", name = "ng", descriptor = "[F")
    private float[] field7417;

    @OriginalMember(owner = "client!rl", name = "Lg", descriptor = "I")
    public int field7441;

    @OriginalMember(owner = "client!rl", name = "Df", descriptor = "F")
    private float field7381;

    @OriginalMember(owner = "client!rl", name = "Qe", descriptor = "I")
    private int field7343;

    @OriginalMember(owner = "client!rl", name = "Vf", descriptor = "[F")
    private float[] field7399;

    @OriginalMember(owner = "client!rl", name = "Ag", descriptor = "I")
    public int field7430;

    @OriginalMember(owner = "client!rl", name = "Tg", descriptor = "I")
    public int field7449;

    @OriginalMember(owner = "client!rl", name = "Yf", descriptor = "I")
    public int field7402;

    @OriginalMember(owner = "client!rl", name = "jg", descriptor = "I")
    private int field7413;

    @OriginalMember(owner = "client!rl", name = "Ug", descriptor = "[F")
    private float[] field7450;

    @OriginalMember(owner = "client!rl", name = "Pe", descriptor = "I")
    public int field7342;

    @OriginalMember(owner = "client!rl", name = "Cg", descriptor = "[F")
    private float[] field7432;

    @OriginalMember(owner = "client!rl", name = "nf", descriptor = "I")
    private int field7365;

    @OriginalMember(owner = "client!rl", name = "Gg", descriptor = "F")
    public float field7436;

    @OriginalMember(owner = "client!rl", name = "Sg", descriptor = "I")
    private int field7448;

    @OriginalMember(owner = "client!rl", name = "Qf", descriptor = "[F")
    public float[] field7394;

    @OriginalMember(owner = "client!rl", name = "eh", descriptor = "F")
    private float field7460;

    @OriginalMember(owner = "client!rl", name = "Jb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7180;

    @OriginalMember(owner = "client!rl", name = "nc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7210;

    @OriginalMember(owner = "client!rl", name = "he", descriptor = "I")
    public int field7308;

    @OriginalMember(owner = "client!rl", name = "xb", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field7168;

    @OriginalMember(owner = "client!rl", name = "Kd", descriptor = "J")
    private long field7285;

    @OriginalMember(owner = "client!rl", name = "de", descriptor = "J")
    private long field7304;

    @OriginalMember(owner = "client!rl", name = "Xe", descriptor = "Z")
    public boolean field7350;

    @OriginalMember(owner = "client!rl", name = "Zf", descriptor = "I")
    public int field7403;

    @OriginalMember(owner = "client!rl", name = "pg", descriptor = "Ljava/lang/String;")
    private String field7419;

    @OriginalMember(owner = "client!rl", name = "kf", descriptor = "Z")
    public boolean field7362;

    @OriginalMember(owner = "client!rl", name = "ah", descriptor = "Z")
    public boolean field7456;

    @OriginalMember(owner = "client!rl", name = "dg", descriptor = "Z")
    private boolean field7407;

    @OriginalMember(owner = "client!rl", name = "dh", descriptor = "Z")
    public boolean field7459;

    @OriginalMember(owner = "client!rl", name = "Hg", descriptor = "Z")
    private boolean field7437;

    @OriginalMember(owner = "client!rl", name = "zg", descriptor = "Ljava/lang/String;")
    private String field7429;

    @OriginalMember(owner = "client!rl", name = "Ve", descriptor = "Z")
    public boolean field7348;

    @OriginalMember(owner = "client!rl", name = "cg", descriptor = "Z")
    private boolean field7406;

    @OriginalMember(owner = "client!rl", name = "ke", descriptor = "Leu;")
    public class319 field7311;

    @OriginalMember(owner = "client!rl", name = "te", descriptor = "Lwa;")
    public class417 field7320;

    @OriginalMember(owner = "client!rl", name = "me", descriptor = "Lji;")
    private class416 field7313;

    @OriginalMember(owner = "client!rl", name = "le", descriptor = "Lqq;")
    private class317 field7312;

    @OriginalMember(owner = "client!rl", name = "ie", descriptor = "Lmj;")
    private class447 field7309;

    @OriginalMember(owner = "client!rl", name = "Jd", descriptor = "[Ljava/lang/String;")
    public static String[] field7284 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!rl", name = "Wd", descriptor = "I")
    public static int field7297 = 0;

    @OriginalMember(owner = "client!rl", name = "md", descriptor = "F")
    public static float field7261;

    @OriginalMember(owner = "client!rl", name = "df", descriptor = "F")
    public float field7356;

    @OriginalMember(owner = "client!rl", name = "hf", descriptor = "F")
    public float field7360;

    @OriginalMember(owner = "client!rl", name = "rf", descriptor = "F")
    private float field7369;

    @OriginalMember(owner = "client!rl", name = "Lf", descriptor = "F")
    public float field7389;

    @OriginalMember(owner = "client!rl", name = "kg", descriptor = "F")
    public float field7414;

    @OriginalMember(owner = "client!rl", name = "qg", descriptor = "F")
    private float field7420;

    @OriginalMember(owner = "client!rl", name = "rg", descriptor = "F")
    private float field7421;

    @OriginalMember(owner = "client!rl", name = "Eg", descriptor = "F")
    public float field7434;

    @OriginalMember(owner = "client!rl", name = "Fg", descriptor = "F")
    public float field7435;

    @OriginalMember(owner = "client!rl", name = "Pg", descriptor = "F")
    public float field7445;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "I")
    public static int field7121;

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "I")
    public static int field7131;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!rl", name = "U", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!rl", name = "V", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!rl", name = "W", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!rl", name = "X", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!rl", name = "Y", descriptor = "I")
    public static int field7143;

    @OriginalMember(owner = "client!rl", name = "Z", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!rl", name = "ab", descriptor = "I")
    public static int field7145;

    @OriginalMember(owner = "client!rl", name = "bb", descriptor = "I")
    public static int field7146;

    @OriginalMember(owner = "client!rl", name = "cb", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!rl", name = "db", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!rl", name = "eb", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!rl", name = "fb", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!rl", name = "gb", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!rl", name = "hb", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!rl", name = "ib", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!rl", name = "jb", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!rl", name = "kb", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!rl", name = "lb", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!rl", name = "mb", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!rl", name = "nb", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!rl", name = "ob", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!rl", name = "pb", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!rl", name = "qb", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!rl", name = "rb", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!rl", name = "sb", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!rl", name = "tb", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!rl", name = "ub", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!rl", name = "vb", descriptor = "I")
    public static int field7166;

    @OriginalMember(owner = "client!rl", name = "wb", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!rl", name = "yb", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!rl", name = "zb", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!rl", name = "Ab", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!rl", name = "Bb", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!rl", name = "Cb", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!rl", name = "Db", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!rl", name = "Eb", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!rl", name = "Fb", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!rl", name = "Gb", descriptor = "I")
    public static int field7177;

    @OriginalMember(owner = "client!rl", name = "Hb", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!rl", name = "Ib", descriptor = "I")
    public static int field7179;

    @OriginalMember(owner = "client!rl", name = "Kb", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!rl", name = "Lb", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!rl", name = "Mb", descriptor = "I")
    public static int field7183;

    @OriginalMember(owner = "client!rl", name = "Nb", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!rl", name = "Ob", descriptor = "I")
    public static int field7185;

    @OriginalMember(owner = "client!rl", name = "Pb", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!rl", name = "Qb", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!rl", name = "Rb", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!rl", name = "Sb", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!rl", name = "Tb", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!rl", name = "Ub", descriptor = "I")
    public int field7191;

    @OriginalMember(owner = "client!rl", name = "Vb", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!rl", name = "Wb", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!rl", name = "Xb", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!rl", name = "Yb", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!rl", name = "Zb", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!rl", name = "ac", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!rl", name = "bc", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!rl", name = "cc", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!rl", name = "dc", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!rl", name = "ec", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!rl", name = "fc", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!rl", name = "gc", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!rl", name = "hc", descriptor = "I")
    public int field7204;

    @OriginalMember(owner = "client!rl", name = "ic", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!rl", name = "jc", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!rl", name = "kc", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!rl", name = "lc", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!rl", name = "mc", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!rl", name = "oc", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!rl", name = "pc", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!rl", name = "qc", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!rl", name = "rc", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!rl", name = "sc", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!rl", name = "tc", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!rl", name = "uc", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!rl", name = "vc", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!rl", name = "wc", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!rl", name = "xc", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!rl", name = "yc", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!rl", name = "zc", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!rl", name = "Ac", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!rl", name = "Bc", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!rl", name = "Cc", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!rl", name = "Dc", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!rl", name = "Ec", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!rl", name = "Fc", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!rl", name = "Gc", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!rl", name = "Hc", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!rl", name = "Ic", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!rl", name = "Jc", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!rl", name = "Kc", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!rl", name = "Lc", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!rl", name = "Mc", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!rl", name = "Nc", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!rl", name = "Oc", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!rl", name = "Pc", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!rl", name = "Qc", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!rl", name = "Rc", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!rl", name = "Sc", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!rl", name = "Tc", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!rl", name = "Uc", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!rl", name = "Vc", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!rl", name = "Wc", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!rl", name = "Xc", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!rl", name = "Yc", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!rl", name = "Zc", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!rl", name = "ad", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!rl", name = "bd", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!rl", name = "cd", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!rl", name = "dd", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!rl", name = "ed", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!rl", name = "fd", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!rl", name = "gd", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!rl", name = "hd", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!rl", name = "id", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!rl", name = "jd", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!rl", name = "kd", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!rl", name = "ld", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!rl", name = "nd", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!rl", name = "od", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!rl", name = "pd", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!rl", name = "qd", descriptor = "I")
    public static int field7265;

    @OriginalMember(owner = "client!rl", name = "rd", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!rl", name = "sd", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!rl", name = "td", descriptor = "I")
    private int field7268;

    @OriginalMember(owner = "client!rl", name = "ud", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!rl", name = "vd", descriptor = "I")
    public static int field7270;

    @OriginalMember(owner = "client!rl", name = "wd", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!rl", name = "xd", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!rl", name = "yd", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!rl", name = "zd", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!rl", name = "Ad", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!rl", name = "Bd", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!rl", name = "Cd", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!rl", name = "Dd", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!rl", name = "Ed", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!rl", name = "Fd", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!rl", name = "Gd", descriptor = "I")
    public static int field7281;

    @OriginalMember(owner = "client!rl", name = "Hd", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!rl", name = "Id", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!rl", name = "Ld", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!rl", name = "Md", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!rl", name = "Nd", descriptor = "I")
    public static int field7288;

    @OriginalMember(owner = "client!rl", name = "Od", descriptor = "I")
    public static int field7289;

    @OriginalMember(owner = "client!rl", name = "Pd", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!rl", name = "Qd", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!rl", name = "Rd", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!rl", name = "Sd", descriptor = "I")
    public static int field7293;

    @OriginalMember(owner = "client!rl", name = "Td", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!rl", name = "Ud", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!rl", name = "Vd", descriptor = "I")
    private int field7296;

    @OriginalMember(owner = "client!rl", name = "Xd", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!rl", name = "Yd", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!rl", name = "Zd", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!rl", name = "ae", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!rl", name = "be", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!rl", name = "ce", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!rl", name = "fe", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!rl", name = "pe", descriptor = "I")
    public int field7316;

    @OriginalMember(owner = "client!rl", name = "Ee", descriptor = "I")
    private int field7331;

    @OriginalMember(owner = "client!rl", name = "Fe", descriptor = "I")
    public int field7332;

    @OriginalMember(owner = "client!rl", name = "He", descriptor = "I")
    public int field7334;

    @OriginalMember(owner = "client!rl", name = "gf", descriptor = "I")
    public int field7359;

    @OriginalMember(owner = "client!rl", name = "lf", descriptor = "I")
    private int field7363;

    @OriginalMember(owner = "client!rl", name = "pf", descriptor = "I")
    private int field7367;

    @OriginalMember(owner = "client!rl", name = "uf", descriptor = "I")
    private int field7372;

    @OriginalMember(owner = "client!rl", name = "Ef", descriptor = "I")
    private int field7382;

    @OriginalMember(owner = "client!rl", name = "Jf", descriptor = "I")
    public int field7387;

    @OriginalMember(owner = "client!rl", name = "Pf", descriptor = "I")
    private int field7393;

    @OriginalMember(owner = "client!rl", name = "Rf", descriptor = "I")
    private int field7395;

    @OriginalMember(owner = "client!rl", name = "Wf", descriptor = "I")
    private int field7400;

    @OriginalMember(owner = "client!rl", name = "ag", descriptor = "I")
    private int field7404;

    @OriginalMember(owner = "client!rl", name = "og", descriptor = "I")
    private int field7418;

    @OriginalMember(owner = "client!rl", name = "sg", descriptor = "I")
    public int field7422;

    @OriginalMember(owner = "client!rl", name = "Jg", descriptor = "I")
    private int field7439;

    @OriginalMember(owner = "client!rl", name = "Kg", descriptor = "I")
    private int field7440;

    @OriginalMember(owner = "client!rl", name = "Og", descriptor = "I")
    public int field7444;

    @OriginalMember(owner = "client!rl", name = "Vg", descriptor = "I")
    private int field7451;

    @OriginalMember(owner = "client!rl", name = "Zg", descriptor = "I")
    private int field7455;

    @OriginalMember(owner = "client!rl", name = "Mg", descriptor = "J")
    private long field7442;

    @OriginalMember(owner = "client!rl", name = "wf", descriptor = "Loc;")
    private class129 field7374;

    @OriginalMember(owner = "client!rl", name = "jf", descriptor = "Luc;")
    public class23 field7361;

    @OriginalMember(owner = "client!rl", name = "zf", descriptor = "Luc;")
    public class23 field7377;

    @OriginalMember(owner = "client!rl", name = "Bf", descriptor = "Luc;")
    public class23 field7379;

    @OriginalMember(owner = "client!rl", name = "Gf", descriptor = "Luc;")
    public class23 field7384;

    @OriginalMember(owner = "client!rl", name = "Of", descriptor = "Luc;")
    public class23 field7392;

    @OriginalMember(owner = "client!rl", name = "mg", descriptor = "Luc;")
    public class23 field7416;

    @OriginalMember(owner = "client!rl", name = "wg", descriptor = "Luc;")
    public class23 field7426;

    @OriginalMember(owner = "client!rl", name = "Ng", descriptor = "Luc;")
    public class23 field7443;

    @OriginalMember(owner = "client!rl", name = "Qg", descriptor = "Luc;")
    public class23 field7446;

    @OriginalMember(owner = "client!rl", name = "fh", descriptor = "Luc;")
    public class23 field7461;

    @OriginalMember(owner = "client!rl", name = "Nf", descriptor = "Lml;")
    public class252 field7391;

    @OriginalMember(owner = "client!rl", name = "Wg", descriptor = "Lml;")
    public class252 field7452;

    @OriginalMember(owner = "client!rl", name = "Af", descriptor = "Llp;")
    private class255 field7378;

    @OriginalMember(owner = "client!rl", name = "Ue", descriptor = "Lud;")
    public class26 field7347;

    @OriginalMember(owner = "client!rl", name = "We", descriptor = "Lud;")
    public class26 field7349;

    @OriginalMember(owner = "client!rl", name = "ff", descriptor = "Lud;")
    public class26 field7358;

    @OriginalMember(owner = "client!rl", name = "bg", descriptor = "Lfr;")
    private class271 field7405;

    @OriginalMember(owner = "client!rl", name = "cf", descriptor = "Lbh;")
    public class27 field7355;

    @OriginalMember(owner = "client!rl", name = "ch", descriptor = "Lbh;")
    public class27 field7458;

    @OriginalMember(owner = "client!rl", name = "Te", descriptor = "Lpr;")
    public class295 field7346;

    @OriginalMember(owner = "client!rl", name = "yg", descriptor = "Lpr;")
    public class295 field7428;

    @OriginalMember(owner = "client!rl", name = "we", descriptor = "Lht;")
    private class393 field7323;

    @OriginalMember(owner = "client!rl", name = "De", descriptor = "Lht;")
    private class393 field7330;

    @OriginalMember(owner = "client!rl", name = "Ze", descriptor = "Lms;")
    private class511 field7352;

    @OriginalMember(owner = "client!rl", name = "Cf", descriptor = "Lms;")
    private class511 field7380;

    @OriginalMember(owner = "client!rl", name = "re", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field7318;

    @OriginalMember(owner = "client!rl", name = "Oe", descriptor = "Z")
    private boolean field7341;

    @OriginalMember(owner = "client!rl", name = "of", descriptor = "Z")
    public boolean field7366;

    @OriginalMember(owner = "client!rl", name = "tf", descriptor = "Z")
    public boolean field7371;

    @OriginalMember(owner = "client!rl", name = "yf", descriptor = "Z")
    private boolean field7376;

    @OriginalMember(owner = "client!rl", name = "Ff", descriptor = "Z")
    public boolean field7383;

    @OriginalMember(owner = "client!rl", name = "Kf", descriptor = "Z")
    private boolean field7388;

    @OriginalMember(owner = "client!rl", name = "Xf", descriptor = "Z")
    public boolean field7401;

    @OriginalMember(owner = "client!rl", name = "eg", descriptor = "Z")
    private boolean field7408;

    @OriginalMember(owner = "client!rl", name = "gg", descriptor = "Z")
    public boolean field7410;

    @OriginalMember(owner = "client!rl", name = "tg", descriptor = "Z")
    private boolean field7423;

    @OriginalMember(owner = "client!rl", name = "vg", descriptor = "Z")
    private boolean field7425;

    @OriginalMember(owner = "client!rl", name = "xg", descriptor = "Z")
    private boolean field7427;

    @OriginalMember(owner = "client!rl", name = "Bg", descriptor = "Z")
    private boolean field7431;

    @OriginalMember(owner = "client!rl", name = "Dg", descriptor = "Z")
    private boolean field7433;

    @OriginalMember(owner = "client!rl", name = "Rg", descriptor = "Z")
    public boolean field7447;

    @OriginalMember(owner = "client!rl", name = "Xg", descriptor = "Z")
    public boolean field7453;

    @OriginalMember(owner = "client!rl", name = "Yg", descriptor = "Z")
    public boolean field7454;

    @OriginalMember(owner = "client!rl", name = "bh", descriptor = "Z")
    private boolean field7457;

    @OriginalMember(owner = "client!rl", name = "sf", descriptor = "[Ltu;")
    private class221[] field7370;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIII)[I")
    public final int[] method758(int arg0, int arg1, int arg2, int arg3) {
        ++field7146;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field7191 - var6, arg2, 1, 32993, this.field7403, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "()Z")
    public final boolean method765() {
        ++field7255;
        if (this.field7312 != null) {
            if (!this.field7312.method2973((byte) -85)) {
                if (!this.field7313.method2477(this.field7312, (byte) 114)) {
                    return false;
                }
                this.field7311.method1923(0);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)V")
    public final void method2849(int arg0, byte arg1) {
        if (this.field7372 != arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field7372 = arg0;
        }
        ++field7302;
        if (arg1 != -109) {
            this.method795();
        }
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(IIIII)V")
    public final void method825(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7169;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(FI)V")
    public final void method2850(float arg0, int arg1) {
        ++field7275;
        if (this.field7460 != arg0) {
            this.field7460 = arg0;
            if (~this.field7418 == -4) {
                this.method2926((byte) -49);
            }
        }
        if (arg1 != -4) {
            this.field7332 = 127;
        }
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(IIII)V")
    public final void method810(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > this.field7204) {
            arg2 = this.field7204;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        ++field7159;
        if (~arg1 > -1) {
            arg1 = 0;
        }
        if (~arg3 < ~this.field7191) {
            arg3 = this.field7191;
        }
        this.field7368 = arg0;
        this.field7365 = arg2;
        this.field7448 = arg3;
        this.field7343 = arg1;
        OpenGL.glEnable(3089);
        this.method2856((byte) 25);
        this.method2931(8960);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZII)V")
    public final synchronized void method2851(boolean arg0, int arg1, int arg2) {
        ++field7236;
        class304 var4 = new class304(arg1);
        var4.field1177 = (long) arg2;
        this.field7335.method2086((byte) -123, var4);
        if (!arg0) {
            this.field7334 = -50;
        }
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(II)V")
    public final void method2852(int arg0, int arg1) {
        ++field7160;
        if (~this.field7451 != ~arg1) {
            boolean var3;
            byte var4;
            boolean var5;
            if (~arg1 == -2) {
                var3 = true;
                var4 = 1;
                var5 = true;
            } else if (arg1 != 2) {
                if (~arg1 == -129) {
                    var3 = true;
                    var4 = 3;
                    var5 = true;
                } else {
                    var5 = true;
                    var4 = 0;
                    var3 = false;
                }
            } else {
                var3 = false;
                var4 = 2;
                var5 = true;
            }
            if (var5 == !this.field7457) {
                OpenGL.glColorMask(var5, var5, var5, true);
                this.field7457 = var5;
            }
            if (!this.field7431 != !var3) {
                if (var3) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field7431 = var3;
            }
            if (this.field7363 != var4) {
                if (var4 != 1) {
                    if (var4 == 2) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    } else if (~var4 != -4) {
                        OpenGL.glDisable(3042);
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field7363 = var4;
            }
            this.field7367 &= -29;
            this.field7451 = arg1;
        }
        if (arg0 != 0) {
            this.field7377 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(FFIFF)V")
    public final void method2853(float arg0, float arg1, int arg2, float arg3, float arg4) {
        ++field7144;
        class478.field6882[2] = arg0;
        int var6 = -109 / ((-49 - arg2) / 40);
        class478.field6882[1] = arg1;
        class478.field6882[3] = arg3;
        class478.field6882[0] = arg4;
        OpenGL.glTexEnvfv(8960, 8705, class478.field6882, 0);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIII)V")
    public final void method738(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7286;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method2911(false);
        this.method2852(0, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7388) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7388) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "()V")
    public final void method807() {
        ++field7186;
        for (class86 var1 = this.field7321.method2096(-21400); var1 != null; var1 = this.field7321.method2084((byte) 19)) {
            ((class9) var1).method69(123);
        }
        if (this.field7313 != null) {
            this.field7313.method2472(109);
        }
        if (this.field7168 != null) {
            this.method2888((byte) -68);
            Enumeration var2 = this.field7305.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field7305.get(var3);
                this.field7168.releaseSurface(var3, var4);
            }
            this.field7168.release();
            this.field7168 = null;
        }
        if (this.field7317) {
            class30.method239(true, true, (byte) 47);
            this.field7317 = false;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IFFFFF)V")
    public final void method799(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field7162;
        boolean var7 = ~this.field7351 != ~arg0;
        if (var7 || this.field7424 != arg1 || this.field7398 != arg2) {
            this.field7398 = arg2;
            this.field7424 = arg1;
            this.field7351 = arg0;
            if (var7) {
                this.field7436 = (float) (this.field7351 & 255) / 255.0F;
                this.field7409 = (float) (65280 & this.field7351) / 65280.0F;
                this.field7396 = (float) (this.field7351 & 16711680) / 1.671168E7F;
                this.method2869((byte) -62);
            }
            this.method2882((byte) 104);
        }
        if (this.field7399[0] != arg3 || this.field7399[1] != arg4 || this.field7399[2] != arg5) {
            this.field7399[0] = arg3;
            this.field7399[2] = arg5;
            this.field7399[1] = arg4;
            this.field7450[1] = -arg4;
            this.field7450[2] = -arg5;
            this.field7450[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field7394[0] = arg3 * var8;
            this.field7394[2] = arg5 * var8;
            this.field7394[1] = arg4 * var8;
            this.field7417[0] = -this.field7394[0];
            this.field7417[1] = -this.field7394[1];
            this.field7417[2] = -this.field7394[2];
            this.method2871((byte) 94);
            this.field7359 = (int) (arg5 * 256.0F / arg4);
            this.field7444 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "()Z")
    public final boolean method822() {
        ++field7171;
        return this.field7312 != null && this.field7312.method2973((byte) -85);
    }

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "(I)V")
    private final void method2854(int arg0) {
        int var2 = -53 / ((arg0 - 76) / 45);
        if (this.field7433 && this.field7371 | ~this.field7441 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field7123;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lps;ILqn;)V")
    public class487(int arg0, Canvas arg1, class59 arg2, int arg3, class44 arg4) {
        super(arg0, arg2);
        new class389();
        new class384(16);
        this.field7333 = new class347();
        this.field7335 = new class347();
        this.field7336 = new class347();
        this.field7337 = new class347();
        this.field7338 = new class347();
        this.field7339 = new class347();
        this.field7340 = new class347();
        this.field7344 = 3584.0F;
        this.field7354 = true;
        this.field7375 = 0;
        this.field7386 = 512;
        this.field7345 = 0;
        this.field7351 = -1;
        this.field7368 = 0;
        this.field7357 = 3584.0F;
        this.field7397 = 0;
        this.field7353 = new class472[class497.field7567];
        this.field7398 = -1.0F;
        this.field7411 = 0;
        this.field7415 = 1.0F;
        this.field7424 = -1.0F;
        this.field7412 = 8448;
        this.field7396 = 1.0F;
        this.field7409 = 1.0F;
        this.field7364 = 8448;
        this.field7385 = 0;
        this.field7390 = -1;
        this.field7373 = 3000.0F;
        this.field7438 = -1;
        this.field7417 = new float[4];
        this.field7441 = -1;
        this.field7381 = 0.0F;
        this.field7343 = 0;
        this.field7399 = new float[4];
        this.field7430 = 50;
        this.field7449 = 3584;
        this.field7402 = 0;
        this.field7413 = -1;
        this.field7450 = new float[4];
        this.field7342 = 512;
        this.field7432 = new float[16];
        this.field7365 = 0;
        this.field7436 = 1.0F;
        this.field7448 = 0;
        this.field7394 = new float[4];
        this.field7460 = 1.0F;
        this.field7210 = this.field7180 = arg1;
        this.field7308 = arg3;
        try {
            if (class28.field489 == null || !class28.field489) {
                if (arg4 == null) {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class28.field489 = Boolean.TRUE;
                } else {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (var6.startsWith("mac")) {
                            System.load(arg4.method345(0, "libjaggl.jnilib").toString());
                        } else {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method345(0, "jaggl.dll").toString());
                        }
                    } else {
                        System.load(arg4.method345(0, "libjaggl.so").toString());
                    }
                    class28.field489 = Boolean.TRUE;
                }
            }
            if (class28.field489 != null && class28.field489) {
                this.field7168 = new OpenGL();
                this.field7304 = this.field7285 = this.field7168.init(arg1, 8, 8, 8, 24, 0, this.field7308);
                if (~this.field7285 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method2903(8054);
                    int var7 = this.method2857((byte) -98);
                    if (var7 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field7403 = !this.field7350 ? 5121 : 33639;
                        if (~this.field7419.indexOf("radeon") != 0) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class452.method2628(this.field7419.replace('/', ' '), 0, ' ');
                            for (int var12 = 0; var12 < var11.length; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (var13.length() > 0) {
                                        if (var13.charAt(0) == 'x' && var13.length() >= 3 && class216.method1332((byte) 107, var13.substring(1, 3))) {
                                            var13 = var13.substring(1);
                                            var10 = true;
                                        }
                                        if (var13.equals("hd")) {
                                            var9 = true;
                                        } else {
                                            if (var13.startsWith("hd")) {
                                                var13 = var13.substring(2);
                                                var9 = true;
                                            }
                                            if (~var13.length() <= -5 && class216.method1332((byte) 107, var13.substring(0, 4))) {
                                                var8 = class103.method622(var13.substring(0, 4), 0);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var9 || var8 < 4000) {
                                this.field7362 = false;
                            }
                            if (!var10 && !var9) {
                                if (var8 >= 7000 && ~var8 >= -9251) {
                                    this.field7456 = false;
                                }
                                if (~var8 <= -7001 && var8 <= 7999) {
                                    this.field7407 = false;
                                }
                            }
                            this.field7459 &= this.field7168.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field7437 = this.field7407;
                        }
                        if (~this.field7429.indexOf("intel") != 0) {
                            this.field7348 = false;
                        }
                        this.field7406 = !this.field7429.equals("s3 graphics");
                        if (this.field7407) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class33.method277(true, 67, true);
                        this.field7317 = true;
                        this.field7311 = new class319(this, super.field1695);
                        this.method2881(10);
                        this.field7320 = new class417(this);
                        this.field7313 = new class416(this);
                        if (this.field7313.method2476(-1437)) {
                            this.field7312 = new class317(this);
                            if (!this.field7312.method1910(34842)) {
                                this.field7312.method1911(0);
                                this.field7312 = null;
                            }
                        }
                        this.field7309 = new class447(this);
                        this.method2930(4);
                        this.method2897(-95);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field7168.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (~(var15++) < -6) {
                                    throw new RuntimeException("");
                                }
                                class322.method1935(true, 100L);
                            }
                        }
                        OpenGL.glClear(16384);
                    }
                }
            } else {
                throw new RuntimeException("");
            }
        } catch (Throwable var20) {
            var20.printStackTrace();
            this.method807();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBII)V")
    public final void method2855(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 50) {
            this.field7413 = 39;
        }
        OpenGL.glTexEnvi(8960, 34176 - -arg0, arg2);
        ++field7258;
        OpenGL.glTexEnvi(8960, 34192 - -arg0, arg3);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
    private final void method2856(byte arg0) {
        ++field7206;
        this.field7389 = (float) (-this.field7402 + this.field7368);
        if (arg0 != 25) {
            this.field7341 = true;
        }
        this.field7356 = (float) (-this.field7375 + this.field7343);
        this.field7445 = (float) (-this.field7402 + this.field7365);
        this.field7435 = (float) (-this.field7375 + this.field7448);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method734(Canvas arg0) {
        ++field7223;
        this.field7210 = null;
        this.field7304 = 0L;
        if (arg0 != null && this.field7180 != arg0) {
            if (this.field7305.containsKey(arg0)) {
                Long var2 = (Long) this.field7305.get(arg0);
                this.field7304 = var2;
                this.field7210 = arg0;
            }
        } else {
            this.field7304 = this.field7285;
            this.field7210 = this.field7180;
        }
        if (this.field7210 != null && ~this.field7304 != -1L) {
            this.field7168.setSurface(this.field7304);
            this.method2897(-88);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)I")
    private final int method2857(byte arg0) {
        ++field7280;
        this.field7429 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field7419 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field7429.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field7429.indexOf("brian paul") != -1 || this.field7429.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class452.method2628(var3.replace('.', ' '), 0, ' ');
        if (var4.length < 2) {
            var2 |= 4;
        } else {
            try {
                int var5 = class103.method622(var4[0], 0);
                int var6 = class103.method622(var4[1], 0);
                this.field7382 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (~this.field7382 > -13) {
            var2 |= 2;
        }
        if (!this.field7168.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field7168.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field7387 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field7404 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field7440 = var7[0];
        if (~this.field7387 > -3 || ~this.field7404 > -3 || this.field7440 < 2) {
            var2 |= 16;
        }
        this.field7350 = NativeStream.method2511();
        this.field7168.arePbuffersAvailable();
        if (arg0 >= -59) {
            this.method2897(-118);
        }
        this.field7407 = this.field7168.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field7388 = this.field7168.isExtensionAvailable("GL_ARB_multisample");
        this.field7447 = this.field7168.isExtensionAvailable("GL_ARB_vertex_program");
        this.field7168.isExtensionAvailable("GL_ARB_fragment_program");
        this.field7383 = this.field7168.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field7366 = this.field7168.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field7456 = this.field7168.isExtensionAvailable("GL_EXT_texture3D");
        this.field7459 = this.field7168.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field7453 = this.field7168.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field7362 = this.field7168.isExtensionAvailable("GL_ARB_texture_float");
        this.field7454 = false;
        this.field7348 = this.field7168.isExtensionAvailable("GL_EXT_framebuffer_object");
        this.field7410 = this.field7168.isExtensionAvailable("GL_EXT_framebuffer_blit");
        this.field7401 = this.field7168.isExtensionAvailable("GL_EXT_framebuffer_multisample");
        this.field7376 = this.field7401 & this.field7410;
        return ~var2 == -1 ? 0 : var2;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIF)Ldq;")
    public final class472 method747(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field7147;
        return new class258(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(IIII)V")
    public final void method808(int arg0, int arg1, int arg2, int arg3) {
        this.field7411 = arg3;
        ++field7136;
        this.field7413 = arg1;
        this.field7422 = arg0;
        this.field7438 = arg2;
        this.field7371 = true;
        this.field7309.method2611(0, false, false, 3);
        this.field7309.field6524.method1037((byte) -121);
        this.method2913((byte) 19);
        this.method2854(126);
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method818(Canvas arg0) {
        ++field7190;
        long var2 = 0L;
        if (arg0 != null && this.field7180 != arg0) {
            if (this.field7305.containsKey(arg0)) {
                Long var4 = (Long) this.field7305.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field7285;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field7168.surfaceResized(var2);
            if (this.field7210 == arg0) {
                this.method2897(-74);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)V")
    public final void method762(boolean arg0) {
        ++field7154;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lfl;IIII)Lva;")
    public final class327 method737(class499 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7196;
        return new class23(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(FIF)V")
    public final void method2858(float arg0, int arg1, float arg2) {
        ++field7276;
        this.field7415 = arg2;
        this.field7381 = arg0;
        if (!this.field7371) {
            this.method2913((byte) 118);
        }
        if (arg1 != 47) {
            this.method2876(125, -74, -111, 53);
        }
    }

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "(I)V")
    public final void method2859(int arg0) {
        ++field7142;
        if (arg0 != 0) {
            this.method2883((class221) null, -82);
        }
        OpenGL.glPushMatrix();
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([IIIII)Lqg;")
    public final class307 method784(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7188;
        return new class305(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "(I)V")
    private final void method2860(int arg0) {
        OpenGL.glLoadIdentity();
        ++field7161;
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field7391.method1579((byte) -53), 0);
        if (this.field7371) {
            this.field7309.field6524.method1037((byte) -117);
        }
        this.method2871((byte) 125);
        this.method2921((byte) -121);
        if (arg0 != 24336) {
            this.field7386 = -9;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lbh;ILbh;Lbh;Lbh;)V")
    public final void method2861(class27 arg0, int arg1, class27 arg2, class27 arg3, class27 arg4) {
        if (arg2 != null) {
            this.method2893((byte) 103, arg2.field442);
            OpenGL.glVertexPointer(arg2.field439, arg2.field441, this.field7352.method2182(-20232), this.field7352.method2183(28914) + (long) arg2.field440);
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        ++field7173;
        if (arg3 != null) {
            this.method2893((byte) 103, arg3.field442);
            OpenGL.glNormalPointer(arg3.field441, this.field7352.method2182(-20232), this.field7352.method2183(arg1 ^ 21327) + (long) arg3.field440);
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg1 != 9149) {
            this.method799(27, -0.9995191F, -0.87588495F, 0.23038274F, 0.8409824F, -1.8996971F);
        }
        if (arg0 != null) {
            this.method2893((byte) 103, arg0.field442);
            OpenGL.glColorPointer(arg0.field439, arg0.field441, this.field7352.method2182(-20232), this.field7352.method2183(28914) + (long) arg0.field440);
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg4 != null) {
            this.method2893((byte) 103, arg4.field442);
            OpenGL.glTexCoordPointer(arg4.field439, arg4.field441, this.field7352.method2182(arg1 ^ -27835), this.field7352.method2183(arg1 + 19765) - -((long) arg4.field440));
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(IIII)V")
    public final void method769(int arg0, int arg1, int arg2, int arg3) {
        this.field7402 = arg0;
        this.field7375 = arg1;
        ++field7195;
        this.field7386 = arg3;
        this.field7342 = arg2;
        this.method2923(4);
        this.method2856((byte) 25);
        if (~this.field7418 != -4) {
            if (~this.field7418 == -3) {
                this.method2863(-5099);
                return;
            }
        } else {
            this.method2926((byte) -49);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZILjaggl/memory/NativeBuffer;I)Lms;")
    public final class511 method2862(int arg0, boolean arg1, int arg2, NativeBuffer arg3, int arg4) {
        ++field7262;
        if (arg2 != 3) {
            this.method2855(-89, (byte) 21, -97, -96);
        }
        return (class511) (!this.field7407 || arg1 && !this.field7437 ? new class431(this, arg4, arg3) : new class360(this, arg4, arg3, arg0, arg1));
    }

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "(I)V")
    private final void method2863(int arg0) {
        OpenGL.glMatrixMode(5889);
        ++field7215;
        OpenGL.glLoadMatrixf(this.field7432, 0);
        OpenGL.glMatrixMode(5888);
        if (arg0 != -5099) {
            this.method836();
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(IIIIII)V")
    public final void method770(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7145;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method2911(false);
        this.method2852(0, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7388) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7388) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(II)I")
    public final int method828(int arg0, int arg1) {
        ++field7240;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(IIIII)V")
    public final void method793(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7245;
        this.method2911(false);
        this.method2852(0, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZZ)V")
    public final void method2864(boolean arg0, boolean arg1) {
        ++field7234;
        if (!arg0 == this.field7408) {
            this.field7408 = arg0;
            this.method2918(-97);
        }
        if (!arg1) {
            this.field7384 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "()Z")
    public final boolean method751() {
        ++field7263;
        return true;
    }

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "()Z")
    public final boolean method815() {
        ++field7131;
        return this.field7312 != null && (this.field7308 <= 1 || this.field7376);
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(II)V")
    public final void method2865(int arg0, int arg1) {
        ++field7249;
        class478.field6882[3] = (float) (arg0 >>> 24) / 255.0F;
        class478.field6882[0] = (float) class500.method3013(16711680, arg0) / 1.671168E7F;
        if (arg1 <= -89) {
            class478.field6882[2] = (float) class500.method3013(255, arg0) / 255.0F;
            class478.field6882[1] = (float) class500.method3013(65280, arg0) / 65280.0F;
            OpenGL.glTexEnvfv(8960, 8705, class478.field6882, 0);
        }
    }

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "()F")
    public final float method781() {
        ++field7281;
        return this.field7434;
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)V")
    public final void method2866(byte arg0) {
        if (arg0 > -60) {
            this.field7168 = null;
        }
        ++field7241;
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "()V")
    public final void method832() {
        ++field7266;
        if (this.field7406 && ~this.field7204 < -1 && this.field7191 > 0) {
            int var1 = this.field7368;
            int var2 = this.field7365;
            int var3 = this.field7343;
            int var4 = this.field7448;
            this.method836();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2901(-104);
            this.method2880(false, -68);
            this.method2884(false, (byte) -83);
            this.method2868(false, 107);
            this.method2908(false, (byte) 115);
            this.method2883((class221) null, -97);
            this.method2867(0, -2);
            this.method2914(126, 1);
            this.method2852(0, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field7204, this.field7191, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method810(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(II)V")
    public final void method2867(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field7418 = -63;
        }
        ++field7140;
        this.method2920(arg1, true, true);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZI)V")
    public final void method2868(boolean arg0, int arg1) {
        if (this.field7341 != arg0) {
            if (!arg0) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field7341 = arg0;
            this.field7367 &= -32;
        }
        ++field7130;
        if (arg1 <= 104) {
            this.field7411 = 72;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lgs;)V")
    public final void method837(class33 arg0) {
        ++field7273;
        this.field7391 = (class252) arg0;
        this.field7452.method1577(this.field7391, 1);
        if (~this.field7418 != -2) {
            this.method2860(24336);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)V")
    public final void method775(int arg0, int arg1, int arg2) {
        ++field7230;
        if (~this.field7390 != ~arg0 || this.field7441 != arg1 || this.field7345 != arg2) {
            this.field7441 = arg1;
            this.field7390 = arg0;
            this.field7345 = arg2;
            if (this.field7371) {
                return;
            }
            this.method2913((byte) -94);
            this.method2854(-64);
        }
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)V")
    private final void method2869(byte arg0) {
        class478.field6882[3] = 1.0F;
        if (arg0 < -37) {
            class478.field6882[2] = this.field7436 * this.field7414;
            class478.field6882[1] = this.field7414 * this.field7409;
            ++field7242;
            class478.field6882[0] = this.field7414 * this.field7396;
            OpenGL.glLightModelfv(2899, class478.field6882, 0);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZJ)V")
    public final synchronized void method2870(boolean arg0, long arg1) {
        if (arg0) {
            ++field7172;
            class86 var4 = new class86();
            var4.field1177 = arg1;
            this.field7340.method2086((byte) -126, var4);
        }
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(B)V")
    public final void method2871(byte arg0) {
        ++field7290;
        OpenGL.glLightfv(16384, 4611, this.field7394, 0);
        if (arg0 >= 84) {
            OpenGL.glLightfv(16385, 4611, this.field7417, 0);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILht;)V")
    public final void method2872(int arg0, class393 arg1) {
        ++field7246;
        if (arg0 <= 124) {
            this.field7459 = false;
        }
        if (this.field7410) {
            this.method2907(255, arg1);
            this.method2889(arg1, 10);
        } else if (~this.field7329 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field7329 >= 0) {
                this.field7326[this.field7329].method1794(17692);
            }
            this.field7330 = this.field7323 = this.field7326[++this.field7329] = arg1;
            this.field7330.method1791((byte) -90);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method760(Rectangle[] arg0, int arg1) {
        this.method743();
        ++field7289;
    }

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "()Z")
    public final boolean method797() {
        ++field7269;
        return true;
    }

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "()Lgs;")
    public final class33 method823() {
        ++field7287;
        return new class252();
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field7274;
        float var10;
        float var11;
        if (this.field7374 != null && arg2 <= this.field7374.field435 && ~arg3 >= ~this.field7374.field433) {
            this.field7374.method227(false, arg3, -3608, 0, arg2, 0, 0, 6406, arg6, 0);
            var10 = (float) arg3 * this.field7374.field1647 / (float) this.field7374.field433;
            var11 = (float) arg2 * this.field7374.field1645 / (float) this.field7374.field435;
        } else {
            this.field7374 = class379.method2293(this, arg6, false, arg3, 6406, 6406, false, arg2);
            this.field7374.method228(false, false, 0);
            var11 = this.field7374.field1645;
            var10 = this.field7374.field1647;
        }
        this.method2925(877);
        this.method2883(this.field7374, -121);
        this.method2852(0, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2865(arg5, -96);
        this.method2919(34165, 34165, false);
        this.method2855(0, (byte) 50, 34166, 768);
        this.method2855(2, (byte) 50, 5890, 770);
        this.method2876(-397556104, 0, 770, 34166);
        this.method2876(-397556104, 2, 770, 5890);
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
        this.method2855(0, (byte) 50, 5890, 768);
        this.method2855(2, (byte) 50, 34166, 770);
        this.method2876(-397556104, 0, 770, 5890);
        this.method2876(-397556104, 2, 770, 34166);
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(IIII)V")
    public final void method789(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field7365 < ~arg2) {
            this.field7365 = arg2;
        }
        if (~arg0 < ~this.field7368) {
            this.field7368 = arg0;
        }
        ++field7260;
        if (~this.field7343 > ~arg1) {
            this.field7343 = arg1;
        }
        if (~arg3 > ~this.field7448) {
            this.field7448 = arg3;
        }
        OpenGL.glEnable(3089);
        this.method2856((byte) 25);
        this.method2931(8960);
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "()Z")
    public final boolean method744() {
        ++field7134;
        return this.field7309.method2610((byte) 25, 3);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZZI)V")
    public final void method2873(int arg0, boolean arg1, boolean arg2, int arg3) {
        ++field7278;
        if (this.field7439 != arg0) {
            if (arg0 < 0) {
                this.method2890((byte) 99);
                this.method2883((class221) null, -119);
                this.method2914(124, 0);
                if (!this.field7371) {
                    this.field7309.method2611(0, arg2, arg1, 0);
                }
            } else {
                class26 var5 = this.field7311.method1922(arg0, true);
                class118 var6 = super.field1695.method432(arg0, true);
                if (var6.field1534 == 0 && ~var6.field1528 == -1) {
                    this.method2890((byte) 123);
                } else {
                    int var7 = !var6.field1524 ? 128 : 64;
                    int var8 = var7 * 50;
                    this.method2886((float) (this.field7316 % var8 * var6.field1534) / (float) var8, (byte) -8, 0.0F, (float) (this.field7316 % var8 * var6.field1528) / (float) var8);
                }
                if (this.field7371) {
                    this.field7309.method2611(0, arg2, arg1, 3);
                    this.method2883(var5, -94);
                    this.method2914(126, var6.field1525);
                } else {
                    this.field7309.method2611(0, arg2, arg1, var6.field1540);
                    this.field7309.method2613(var6.field1538, 8, var6.field1530);
                    if (!this.field7309.method2615(var6.field1525, var5, (byte) -91)) {
                        this.method2883(var5, 91);
                        this.method2914(125, var6.field1525);
                    }
                }
            }
            this.field7439 = arg0;
        }
        if (arg3 != -1) {
            this.method761();
        }
        this.field7367 &= -8;
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "()V")
    public final void method739() {
        ++field7252;
    }

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "(II)V")
    public final synchronized void method2874(int arg0, int arg1) {
        if (arg0 > -41) {
            this.field7433 = true;
        }
        ++field7178;
        class86 var3 = new class86();
        var3.field1177 = (long) arg1;
        this.field7339.method2086((byte) -117, var3);
    }

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "()F")
    public final float method790() {
        ++field7239;
        return this.field7373;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Llp;I)V")
    public final void method2875(class255 arg0, int arg1) {
        if (this.field7378 != arg0) {
            if (this.field7407) {
                OpenGL.glBindBufferARB(34963, arg0.method892(-9037));
            }
            this.field7378 = arg0;
        }
        ++field7135;
        if (arg1 > -22) {
            this.field7430 = -83;
        }
    }

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "()Z")
    public final boolean method816() {
        ++field7133;
        return true;
    }

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "()I")
    public final int method838() {
        ++field7128;
        int var1 = this.field7395;
        this.field7395 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "(IIII)V")
    public final void method2876(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg1 + 34184, arg3);
        ++field7167;
        OpenGL.glTexEnvi(8960, arg1 + 34200, arg2);
        if (arg0 != -397556104) {
            this.field7431 = true;
        }
    }

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "()Z")
    public final boolean method749() {
        ++field7220;
        return true;
    }

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "()I")
    public final int method788() {
        ++field7211;
        int var1 = this.field7400;
        this.field7400 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "(II)I")
    public final int method2877(int arg0, int arg1) {
        ++field7116;
        if (~arg1 != -5122 && ~arg1 != -5121) {
            if (arg1 != 5123 && arg1 != 5122) {
                if (~arg1 != -5126 && arg1 != 5124 && arg1 != 5126) {
                    if (arg0 != 0) {
                        return 37;
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

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lht;I)V")
    public final void method2878(class393 arg0, int arg1) {
        ++field7295;
        if (~this.field7328 <= -1 && this.field7327[this.field7328] == arg0) {
            this.field7327[this.field7328--] = null;
            if (arg1 > -22) {
                this.method782(-1, -110, 31, -19, 52, 41, -38);
            }
            arg0.method1786((byte) -107);
            if (~this.field7328 > -1) {
                this.field7323 = null;
            } else {
                this.field7323 = this.field7327[this.field7328];
                this.field7323.method1788((byte) 28);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(B)V")
    public final void method2879(byte arg0) {
        ++field7163;
        int var2 = 41 % ((66 - arg0) / 35);
        if (this.field7367 != 4) {
            this.method2904(34162);
            this.method2880(false, -73);
            this.method2884(false, (byte) 126);
            this.method2868(false, 126);
            this.method2908(false, (byte) 110);
            this.method2867(0, -2);
            this.method2852(0, 1);
            this.method2914(125, 0);
            this.field7367 = 4;
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(ZI)V")
    public final void method2880(boolean arg0, int arg1) {
        ++field7293;
        if (arg1 > -65) {
            this.field7356 = -0.03538589F;
        }
        if (this.field7433 != arg0) {
            this.field7433 = arg0;
            this.method2854(127);
            this.field7367 &= -32;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(FF)V")
    public final void method821(float arg0, float arg1) {
        ++field7228;
        if (this.field7373 != arg0 || this.field7434 != arg1) {
            this.field7373 = arg0;
            this.field7434 = arg1;
            this.method2928((byte) 118);
            if (this.field7418 != 3) {
                if (~this.field7418 == -3) {
                    this.method2863(-5099);
                    return;
                }
            } else {
                this.method2926((byte) -49);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "(I)V")
    private final void method2881(int arg0) {
        ++field7283;
        this.field7391 = new class252();
        this.field7452 = new class252();
        if (arg0 == 10) {
            this.field7370 = new class221[this.field7387];
            this.field7347 = new class26(this, 3553, 6408, 1, 1);
            this.field7349 = new class26(this, 3553, 6408, 1, 1);
            this.field7358 = new class26(this, 3553, 6408, 1, 1);
            this.field7379 = new class23(this);
            this.field7384 = new class23(this);
            this.field7416 = new class23(this);
            this.field7446 = new class23(this);
            this.field7361 = new class23(this);
            this.field7461 = new class23(this);
            this.field7377 = new class23(this);
            this.field7392 = new class23(this);
            this.field7443 = new class23(this);
            this.field7426 = new class23(this);
            if (this.field7348) {
                this.field7428 = new class295(this);
                this.field7346 = new class295(this);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "()V")
    public final void method776() {
        ++field7175;
        this.field7313.method2475(33985);
    }

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "(B)V")
    private final void method2882(byte arg0) {
        if (arg0 == 104) {
            ++field7200;
            class478.field6882[1] = this.field7424 * this.field7409;
            class478.field6882[2] = this.field7436 * this.field7424;
            class478.field6882[0] = this.field7424 * this.field7396;
            class478.field6882[3] = 1.0F;
            OpenGL.glLightfv(16384, 4609, class478.field6882, 0);
            class478.field6882[3] = 1.0F;
            class478.field6882[2] = -this.field7398 * this.field7436;
            class478.field6882[1] = -this.field7398 * this.field7409;
            class478.field6882[0] = -this.field7398 * this.field7396;
            OpenGL.glLightfv(16385, 4609, class478.field6882, 0);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ltu;I)V")
    public final void method2883(class221 arg0, int arg1) {
        ++field7227;
        class221 var3 = this.field7370[this.field7372];
        if (arg0 != var3) {
            if (arg0 != null) {
                if (var3 != null) {
                    if (arg0.field3116 != var3.field3116) {
                        OpenGL.glDisable(var3.field3116);
                        OpenGL.glEnable(arg0.field3116);
                    }
                } else {
                    OpenGL.glEnable(arg0.field3116);
                }
                OpenGL.glBindTexture(arg0.field3116, arg0.method1362((byte) 16));
            } else {
                OpenGL.glDisable(var3.field3116);
            }
            this.field7370[this.field7372] = arg0;
        }
        int var4 = -6 % ((arg1 - -40) / 53);
        this.field7367 &= -2;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZB)V")
    public final void method2884(boolean arg0, byte arg1) {
        int var3 = 7 / ((-7 - arg1) / 54);
        if (!arg0 == this.field7425) {
            this.field7425 = arg0;
            this.method2918(98);
            this.field7367 &= -8;
        }
        ++field7203;
    }

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "(I)Lgh;")
    public final class368 method2885(int arg0) {
        int var2 = 104 % ((-1 - arg0) / 42);
        ++field7121;
        return this.field7405 == null ? null : this.field7405.method1586(1);
    }

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "(I)V")
    public final void method839(int arg0) {
        this.method2888((byte) -68);
        ++field7165;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(FBFF)V")
    private final void method2886(float arg0, byte arg1, float arg2, float arg3) {
        ++field7217;
        OpenGL.glMatrixMode(5890);
        if (this.field7423) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg0, arg3, arg2);
        OpenGL.glMatrixMode(5888);
        int var5 = -99 % ((-50 - arg1) / 42);
        this.field7423 = true;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lml;I)V")
    public final void method2887(class252 arg0, int arg1) {
        ++field7226;
        if (arg1 < 97) {
            this.method2907(102, (class393) null);
        }
        OpenGL.glLoadMatrixf(arg0.method1579((byte) -53), 0);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIZ)Lqg;")
    public final class307 method780(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field7248;
        return new class305(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "()V")
    public final void method836() {
        this.field7343 = 0;
        this.field7365 = this.field7204;
        this.field7368 = 0;
        ++field7264;
        this.field7448 = this.field7191;
        OpenGL.glDisable(3089);
        this.method2856((byte) 25);
    }

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "(B)V")
    private final void method2888(byte arg0) {
        this.field7168.detach();
        if (arg0 != -68) {
            this.method2910(-33, true, (byte[]) null, -33, -30);
        }
        ++field7127;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Lht;I)V")
    public final void method2889(class393 arg0, int arg1) {
        if (arg1 != 10) {
            this.method2885(-92);
        }
        ++field7270;
        if (~this.field7328 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field7328 <= -1) {
                this.field7327[this.field7328].method1786((byte) -107);
            }
            this.field7323 = this.field7327[++this.field7328] = arg0;
            this.field7323.method1788((byte) 28);
        }
    }

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "(B)V")
    private final void method2890(byte arg0) {
        ++field7137;
        if (this.field7423) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field7423 = false;
        }
        if (arg0 < 32) {
            this.field7404 = -33;
        }
    }

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "(I)V")
    public final void method2891(int arg0) {
        if (this.field7367 != arg0) {
            this.method2895(-89);
            this.method2880(true, arg0 + -97);
            this.method2868(true, 122);
            this.method2908(true, (byte) 125);
            this.method2852(0, 1);
            this.method2914(126, 0);
            this.field7367 = 8;
        }
        ++field7129;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(F)V")
    public final void method791(float arg0) {
        ++field7150;
        if (this.field7414 != arg0) {
            this.field7414 = arg0;
            this.method2869((byte) -65);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II[I[I)Lfs;")
    public final class372 method763(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field7119;
        return class223.method1377(arg0, arg2, this, arg1, (byte) -60, arg3);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "()Z")
    public final boolean method736() {
        ++field7138;
        return true;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(III)V")
    public final synchronized void method2892(int arg0, int arg1, int arg2) {
        ++field7257;
        class304 var4 = new class304(arg2);
        if (arg1 > -122) {
            this.method836();
        }
        var4.field1177 = (long) arg0;
        this.field7336.method2086((byte) -119, var4);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lbv;)V")
    public final void method800(class191 arg0) {
        this.field7307.method2586(this, 0, arg0);
        ++field7244;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLms;)V")
    public final void method2893(byte arg0, class511 arg1) {
        if (arg0 == 103) {
            if (this.field7352 != arg1) {
                if (this.field7407) {
                    OpenGL.glBindBufferARB(34962, arg1.method2186((byte) 74));
                }
                this.field7352 = arg1;
            }
            ++field7212;
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(Lht;I)V")
    public final void method2894(class393 arg0, int arg1) {
        if (arg1 == 16711680) {
            ++field7202;
            if (this.field7325 >= 0 && this.field7324[this.field7325] == arg0) {
                this.field7324[this.field7325--] = null;
                arg0.method1792(31577);
                if (this.field7325 < 0) {
                    this.field7330 = null;
                } else {
                    this.field7330 = this.field7324[this.field7325];
                    this.field7330.method1781(arg1 + -16726032);
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "(I)V")
    private final void method2895(int arg0) {
        if (arg0 < -53) {
            ++field7265;
            if (~this.field7418 != -3) {
                this.field7418 = 2;
                this.method2863(-5099);
                this.method2860(24336);
                this.field7367 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "(I)V")
    private final void method2896(int arg0) {
        ++field7214;
        if (this.field7418 != 3) {
            this.field7418 = 3;
            this.method2926((byte) -49);
            this.method2860(arg0 ^ -24344);
            this.field7367 &= -8;
        }
        if (arg0 != -8) {
            this.field7442 = -45L;
        }
    }

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "(I)V")
    private final void method2897(int arg0) {
        ++field7194;
        if (arg0 < -73) {
            if (this.field7210 == null) {
                this.field7268 = this.field7296 = 0;
            } else {
                Dimension var2 = this.field7210.getSize();
                this.field7268 = var2.width;
                this.field7296 = var2.height;
            }
            if (this.field7323 == null) {
                this.field7191 = this.field7296;
                this.field7204 = this.field7268;
                this.method2916((byte) -62);
            }
            this.method2901(-100);
            this.method836();
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Loi;)V")
    public final void method783(class49 arg0) {
        this.field7405 = (class271) arg0;
        ++field7149;
    }

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "(I)V")
    public final synchronized void method833(int arg0) {
        ++field7259;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field7335.method2090(0)) {
            class304 var12 = (class304) this.field7335.method2093(-10805);
            class282.field4029[var2++] = (int) var12.field1177;
            this.field7332 -= var12.field4412;
            if (~var2 == -1001) {
                OpenGL.glDeleteBuffersARB(var2, class282.field4029, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteBuffersARB(var2, class282.field4029, 0);
            var2 = 0;
        }
        while (!this.field7336.method2090(0)) {
            class304 var11 = (class304) this.field7336.method2093(-10805);
            class282.field4029[var2++] = (int) var11.field1177;
            this.field7334 -= var11.field4412;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class282.field4029, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class282.field4029, 0);
            var2 = 0;
        }
        while (!this.field7337.method2090(0)) {
            class304 var10 = (class304) this.field7337.method2093(-10805);
            class282.field4029[var2++] = var10.field4412;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class282.field4029, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class282.field4029, 0);
            var2 = 0;
        }
        while (!this.field7338.method2090(0)) {
            class304 var9 = (class304) this.field7338.method2093(-10805);
            class282.field4029[var2++] = (int) var9.field1177;
            this.field7331 -= var9.field4412;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class282.field4029, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class282.field4029, 0);
            boolean var4 = false;
        }
        while (!this.field7333.method2090(0)) {
            class304 var8 = (class304) this.field7333.method2093(-10805);
            OpenGL.glDeleteLists((int) var8.field1177, var8.field4412);
        }
        while (!this.field7339.method2090(0)) {
            class86 var7 = this.field7339.method2093(-10805);
            OpenGL.glDeleteProgramARB((int) var7.field1177);
        }
        while (!this.field7340.method2090(0)) {
            class86 var6 = this.field7340.method2093(-10805);
            OpenGL.glDeleteObjectARB(var6.field1177);
        }
        while (!this.field7333.method2090(0)) {
            class304 var5 = (class304) this.field7333.method2093(-10805);
            OpenGL.glDeleteLists((int) var5.field1177, var5.field4412);
        }
        this.field7311.method1925(2);
        if (~this.method750() < -100663297 && ~(this.field7442 + 60000L) > ~class109.method653(false)) {
            System.gc();
            this.field7442 = class109.method653(false);
        }
        this.field7316 = var3;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(IBII)V")
    public final void method2898(int arg0, byte arg1, int arg2, int arg3) {
        OpenGL.glDrawArrays(arg2, arg0, arg3);
        ++field7115;
        if (arg1 != -52) {
            this.field7204 = 14;
        }
    }

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "()Lgs;")
    public final class33 method830() {
        ++field7238;
        return this.field7314;
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(IIIIII)Z")
    public final boolean method820(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7231;
        float var7 = (float) arg2 * this.field7391.field3644 + (float) arg0 * this.field7391.field3650 + (float) arg1 * this.field7391.field3625 + this.field7391.field3618;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field7391.field3644 + (float) arg3 * this.field7391.field3650 + (float) arg4 * this.field7391.field3625 + this.field7391.field3618;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field7430) || !(var8 < (float) this.field7430)) && (!((float) this.field7449 < var7) || !((float) this.field7449 < var8))) {
            int var9 = (int) (((float) arg2 * this.field7391.field3617 + (float) arg0 * this.field7391.field3615 + (float) arg1 * this.field7391.field3629 + this.field7391.field3643) * (float) this.field7342 / var7);
            int var10 = (int) (((float) arg5 * this.field7391.field3617 + (float) arg3 * this.field7391.field3615 + (float) arg4 * this.field7391.field3629 + this.field7391.field3643) * (float) this.field7342 / var8);
            if (this.field7389 > (float) var9 && (float) var10 < this.field7389 || this.field7445 < (float) var9 && this.field7445 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field7391.field3638 + (float) arg0 * this.field7391.field3628 + (float) arg1 * this.field7391.field3640 + this.field7391.field3623) * (float) this.field7386 / var7);
                int var12 = (int) (((float) arg5 * this.field7391.field3638 + (float) arg3 * this.field7391.field3628 + (float) arg4 * this.field7391.field3640 + this.field7391.field3623) * (float) this.field7386 / var8);
                return (!(this.field7356 > (float) var11) || !((float) var12 < this.field7356)) && (!(this.field7435 < (float) var11) || !(this.field7435 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([Lva;Lgs;[Lla;I)V")
    public final void method812(class327[] arg0, class33 arg1, class299[] arg2, int arg3) {
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method191(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
        ++field7216;
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(IIIIII)V")
    public final void method803(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2911(false);
        ++field7139;
        this.method2852(0, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "(B)V")
    public static void method2899(byte arg0) {
        field7284 = null;
        if (arg0 <= 24) {
            field7284 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "()Z")
    public final boolean method831() {
        ++field7205;
        return true;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBZI[B)Lms;")
    public final class511 method2900(int arg0, byte arg1, boolean arg2, int arg3, byte[] arg4) {
        ++field7219;
        if (arg1 < 40) {
            this.field7396 = -0.97059226F;
        }
        return (class511) (!this.field7407 || arg2 && !this.field7437 ? new class431(this, arg0, arg4, arg3) : new class360(this, arg0, arg4, arg3, arg2));
    }

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "(I)V")
    public final void method2901(int arg0) {
        ++field7151;
        if (arg0 > -94) {
            this.method818((Canvas) null);
        }
        if (~this.field7418 != -1) {
            this.field7367 &= -32;
            this.field7418 = 0;
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V")
    public final void method786(int arg0) {
        ++field7122;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "(II)V")
    public final synchronized void method2902(int arg0, int arg1) {
        ++field7221;
        class304 var3 = new class304(arg1);
        this.field7337.method2086((byte) -124, var3);
        if (arg0 != -1778) {
            this.field7429 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "(I)V")
    private final void method2903(int arg0) {
        ++field7184;
        int var2 = 0;
        while (!this.field7168.attach()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            class322.method1935(true, 1000L);
        }
        if (arg0 != 8054) {
            this.method2857((byte) -75);
        }
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)V")
    public final void method798(int arg0) {
        ++field7207;
        this.field7319 = 0;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field7319;
        }
        this.field7322 = 1 << this.field7319;
    }

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "(I)V")
    private final void method2904(int arg0) {
        if (arg0 != 34162) {
            this.field7375 = 10;
        }
        ++field7277;
        if (this.field7418 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field7204 < -1 && ~this.field7191 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field7204, (double) this.field7191, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field7418 = 1;
            this.field7367 &= -25;
        }
    }

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "(II)I")
    public final int method2905(int arg0, int arg1) {
        ++field7237;
        if (~arg1 != -6407 && ~arg1 != -6410) {
            if (arg1 != 6410 && arg1 != 34846 && arg1 != 34844) {
                if (~arg1 == -6408) {
                    return 3;
                } else if (~arg1 != -6409 && ~arg1 != -34848) {
                    if (~arg1 == -34844) {
                        return 6;
                    } else if (arg1 == 34842) {
                        return 8;
                    } else if (arg1 != 6402) {
                        if (~arg1 == -6402) {
                            return 1;
                        } else {
                            if (arg0 != 8) {
                                this.method783((class49) null);
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

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V")
    public final void method792(int arg0) {
        ++field7233;
        if (arg0 >= 128 && arg0 <= 1024) {
            this.field7310 = arg0;
            this.field7311.method1923(0);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "()V")
    public final void method743() {
        ++field7247;
        try {
            this.field7168.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(III)V")
    public final void method2906(int arg0, int arg1, int arg2) {
        int var4 = 72 % ((-51 - arg0) / 53);
        ++field7155;
        this.field7397 = arg2;
        this.field7385 = arg1;
        this.method2916((byte) -62);
        this.method2931(8960);
    }

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "()Z")
    public final boolean method795() {
        ++field7117;
        return false;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lqd;)V")
    public final void method794(class297 arg0) {
        ++field7208;
        this.field7318 = ((class9) arg0).field144;
        if (this.field7380 == null) {
            class269 var2 = new class269(80);
            if (!this.field7350) {
                var2.method1647(-1.0F, true);
                var2.method1647(-1.0F, true);
                var2.method1647(0.0F, true);
                var2.method1647(0.0F, true);
                var2.method1647(1.0F, true);
                var2.method1647(1.0F, true);
                var2.method1647(-1.0F, true);
                var2.method1647(0.0F, true);
                var2.method1647(1.0F, true);
                var2.method1647(1.0F, true);
                var2.method1647(1.0F, true);
                var2.method1647(1.0F, true);
                var2.method1647(0.0F, true);
                var2.method1647(1.0F, true);
                var2.method1647(0.0F, true);
                var2.method1647(-1.0F, true);
                var2.method1647(1.0F, true);
                var2.method1647(0.0F, true);
                var2.method1647(0.0F, true);
                var2.method1647(0.0F, true);
            } else {
                var2.method1646(-1.0F, -136782152);
                var2.method1646(-1.0F, -136782152);
                var2.method1646(0.0F, -136782152);
                var2.method1646(0.0F, -136782152);
                var2.method1646(1.0F, -136782152);
                var2.method1646(1.0F, -136782152);
                var2.method1646(-1.0F, -136782152);
                var2.method1646(0.0F, -136782152);
                var2.method1646(1.0F, -136782152);
                var2.method1646(1.0F, -136782152);
                var2.method1646(1.0F, -136782152);
                var2.method1646(1.0F, -136782152);
                var2.method1646(0.0F, -136782152);
                var2.method1646(1.0F, -136782152);
                var2.method1646(0.0F, -136782152);
                var2.method1646(-1.0F, -136782152);
                var2.method1646(1.0F, -136782152);
                var2.method1646(0.0F, -136782152);
                var2.method1646(0.0F, -136782152);
                var2.method1646(0.0F, -136782152);
            }
            this.field7380 = this.method2900(20, (byte) 49, false, var2.field2018, var2.field2041);
            this.field7355 = new class27(this, this.field7380, 5126, 3, 0);
            this.field7458 = new class27(this, this.field7380, 5126, 2, 12);
            this.field7307.method2587((byte) -43, this);
        }
    }

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "()V")
    public final void method756() {
        ++field7282;
        this.method2908(true, (byte) 47);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(ILht;)V")
    public final void method2907(int arg0, class393 arg1) {
        ++field7166;
        if (arg0 != 255) {
            this.field7369 = 0.9787517F;
        }
        if (this.field7325 >= 3) {
            throw new RuntimeException();
        } else {
            if (this.field7325 >= 0) {
                this.field7324[this.field7325].method1792(arg0 ^ 31654);
            }
            this.field7330 = this.field7324[++this.field7325] = arg1;
            this.field7330.method1781(arg0 + -14607);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([Lva;Lbv;Lgs;[Lla;I)V")
    public final void method745(class327[] arg0, class191 arg1, class33 arg2, class299[] arg3, int arg4) {
        this.method812(arg0, arg2, arg3, arg4);
        ++field7209;
        this.method800(arg1);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lmo;[Lpi;Z)Lhr;")
    public final class348 method802(class507 arg0, class328[] arg1, boolean arg2) {
        ++field7250;
        return new class60(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lpi;Z)Lqg;")
    public final class307 method804(class328 arg0, boolean arg1) {
        ++field7181;
        int[] var3 = new int[arg0.field4780 * arg0.field4776];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field4781 != null) {
            for (int var6 = 0; var6 < arg0.field4780; ++var6) {
                for (int var7 = 0; arg0.field4776 > var7; ++var7) {
                    var3[var5++] = class51.method379(arg0.field4782[class500.method3013(255, arg0.field4778[var4])], arg0.field4781[var4] << 24);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; ~var8 > ~arg0.field4780; ++var8) {
                for (int var10 = 0; var10 < arg0.field4776; ++var10) {
                    int var11 = arg0.field4782[255 & arg0.field4778[var4++]];
                    var3[var5++] = var11 == 0 ? 0 : class51.method379(-16777216, var11);
                }
            }
        }
        class307 var9 = this.method784(var3, 0, arg0.field4776, arg0.field4776, arg0.field4780);
        var9.method91(arg0.field4779, arg0.field4784, arg0.field4777, arg0.field4783);
        return var9;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(ZB)V")
    public final void method2908(boolean arg0, byte arg1) {
        ++field7114;
        if (this.field7427 != arg0) {
            this.field7427 = arg0;
            this.method2924(91);
            this.field7367 &= -32;
        }
        if (arg1 < 35) {
            this.field7327 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "(B)V")
    public static final void method2909(byte arg0) {
        if (arg0 == 53) {
            ++field7213;
            class368.field5527.method38((byte) -66);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III[I)V")
    public final void method796(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7279;
        float var5 = (float) arg2 * this.field7391.field3644 + (float) arg0 * this.field7391.field3650 + (float) arg1 * this.field7391.field3625 + this.field7391.field3618;
        if (!((float) this.field7430 > var5) && !(var5 > (float) this.field7449)) {
            int var6 = (int) (((float) arg2 * this.field7391.field3617 + (float) arg0 * this.field7391.field3615 + (float) arg1 * this.field7391.field3629 + this.field7391.field3643) * (float) this.field7342 / var5);
            int var7 = (int) (((float) arg2 * this.field7391.field3638 + (float) arg0 * this.field7391.field3628 + (float) arg1 * this.field7391.field3640 + this.field7391.field3623) * (float) this.field7386 / var5);
            if (this.field7389 <= (float) var6 && (float) var6 <= this.field7445 && this.field7356 <= (float) var7 && (float) var7 <= this.field7435) {
                arg3[1] = (int) ((float) var7 - this.field7356);
                arg3[0] = (int) ((float) var6 - this.field7389);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ[BII)Llp;")
    public final class255 method2910(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4) {
        if (arg4 != 768) {
            this.method779(58, -24, -113, -33);
        }
        ++field7291;
        return (class255) (!this.field7407 || arg1 && !this.field7437 ? new class142(this, arg0, arg2, arg3) : new class398(this, arg0, arg2, arg3, arg1));
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(Z)V")
    private final void method2911(boolean arg0) {
        if (arg0) {
            this.field7381 = -0.91035354F;
        }
        ++field7185;
        if (~this.field7367 != -2) {
            this.method2904(34162);
            this.method2880(false, -125);
            this.method2884(false, (byte) -101);
            this.method2868(false, 119);
            this.method2908(false, (byte) 126);
            this.method2883((class221) null, 113);
            this.method2867(0, -2);
            this.method2914(126, 1);
            this.field7367 = 1;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Lqd;")
    public final class297 method735(int arg0) {
        ++field7124;
        class9 var2 = new class9(arg0);
        this.field7321.method2086((byte) -117, var2);
        return var2;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(FFF)V")
    public final void method764(float arg0, float arg1, float arg2) {
        ++field7253;
        class39.field607 = arg2;
        class87.field1198 = arg1;
        class325.field4745 = arg0;
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(Z)V")
    public final void method773(boolean arg0) {
        ++field7174;
        this.field7354 = arg0;
        this.method2924(109);
    }

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "(B)V")
    public final void method2912(byte arg0) {
        if (this.field7367 != 16) {
            this.method2896(-8);
            this.method2880(true, -74);
            this.method2868(true, 111);
            this.method2908(true, (byte) 68);
            this.method2852(0, 1);
            this.method2914(127, 0);
            this.field7367 = 16;
        }
        ++field7225;
        int var2 = -111 % ((-6 - arg0) / 36);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)I")
    public final int method819(int arg0, int arg1) {
        ++field7187;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II[[I[[IIII)Log;")
    public final class441 method753(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field7201;
        return new class136(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "(B)V")
    private final void method2913(byte arg0) {
        ++field7298;
        int var2 = 54 % ((-33 - arg0) / 43);
        int var3;
        if (!this.field7371) {
            this.field7369 = (float) (-this.field7345 + this.field7449) - this.field7381;
            this.field7360 = this.field7369 - (float) this.field7441 * this.field7415;
            if ((float) this.field7430 > this.field7360) {
                this.field7360 = (float) this.field7430;
            }
            OpenGL.glFogf(2915, this.field7360);
            OpenGL.glFogf(2916, this.field7369);
            var3 = this.field7390;
        } else {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var3 = this.field7413;
        }
        class478.field6882[0] = (float) class500.method3013(var3, 16711680) / 1.671168E7F;
        class478.field6882[2] = (float) class500.method3013(var3, 255) / 255.0F;
        class478.field6882[1] = (float) class500.method3013(65280, var3) / 65280.0F;
        OpenGL.glFogfv(2918, class478.field6882, 0);
        if (this.field7371) {
            this.field7309.field6524.method1039(-768);
        }
    }

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "()I")
    public final int method757() {
        ++field7272;
        return this.field7430;
    }

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "(IIII)V")
    public final void method826(int arg0, int arg1, int arg2, int arg3) {
        ++field7183;
        if (!this.field7371) {
            throw new RuntimeException("");
        } else {
            this.field7413 = arg1;
            this.field7438 = arg2;
            this.field7411 = arg3;
            this.field7422 = arg0;
            this.field7309.field6524.method1037((byte) -119);
            this.method2913((byte) -127);
        }
    }

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "(II)V")
    public final void method2914(int arg0, int arg1) {
        if (arg0 <= 123) {
            this.method2868(true, 82);
        }
        if (arg1 == 1) {
            this.method2919(7681, 7681, false);
        } else if (~arg1 != -1) {
            if (arg1 != 2) {
                if (arg1 == 3) {
                    this.method2919(8448, 260, false);
                } else if (arg1 == 4) {
                    this.method2919(34023, 34023, false);
                }
            } else {
                this.method2919(7681, 34165, false);
            }
        } else {
            this.method2919(8448, 8448, false);
        }
        ++field7256;
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(III)V")
    public final synchronized void method2915(int arg0, int arg1, int arg2) {
        ++field7118;
        int var4 = -70 % ((arg0 - -27) / 57);
        class304 var5 = new class304(arg2);
        var5.field1177 = (long) arg1;
        this.field7338.method2086((byte) -121, var5);
    }

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "()V")
    public final void method768() {
        ++field7218;
        this.field7371 = false;
        this.field7309.method2611(0, false, false, 0);
        this.method2913((byte) -124);
        this.method2854(-59);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIII)V")
    public final void method782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field7306;
        this.method803(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "(B)V")
    private final void method2916(byte arg0) {
        OpenGL.glViewport(this.field7397, this.field7385, this.field7204, this.field7191);
        ++field7254;
        if (arg0 != -62) {
            this.method755(22, -4, 103, 67, 23, -24, (byte[]) null, 121, -118);
        }
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(I)V")
    public final void method811(int arg0) {
        this.method2852(0, 0);
        ++field7199;
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILml;)V")
    public final void method2917(int arg0, class252 arg1) {
        OpenGL.glPushMatrix();
        if (arg0 == 2320) {
            ++field7198;
            OpenGL.glMultMatrixf(arg1.method1579((byte) -53), 0);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "()V")
    public final void method732() {
        if (this.field7312 != null && this.field7312.method2973((byte) -85)) {
            this.field7313.method2471(18780, this.field7312);
            this.field7311.method1923(0);
        }
        ++field7164;
    }

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "(I)V")
    private final void method2918(int arg0) {
        if (this.field7425 && !this.field7408) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field7193;
        int var2 = 9 / ((6 - arg0) / 63);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZ)V")
    public final void method2919(int arg0, int arg1, boolean arg2) {
        if (this.field7372 == 0) {
            boolean var4 = false;
            if (~this.field7364 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                this.field7364 = arg1;
                var4 = true;
            }
            if (this.field7412 != arg0) {
                OpenGL.glTexEnvi(8960, 34162, arg0);
                var4 = true;
                this.field7412 = arg0;
            }
            if (var4) {
                this.field7367 &= -30;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg1);
            OpenGL.glTexEnvi(8960, 34162, arg0);
        }
        ++field7153;
        if (arg2) {
            this.method750();
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([I)V")
    public final void method785(int[] arg0) {
        arg0[2] = this.field7365;
        arg0[1] = this.field7343;
        arg0[3] = this.field7448;
        arg0[0] = this.field7368;
        ++field7158;
    }

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "()Z")
    public final boolean method761() {
        ++field7182;
        return true;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Loi;Loi;FLoi;)Loi;")
    public final class49 method817(class49 arg0, class49 arg1, float arg2, class49 arg3) {
        ++field7232;
        if (arg0 != null && arg1 != null && this.field7453 && this.field7348 && this.field7410) {
            class253 var5 = null;
            class271 var6 = (class271) arg0;
            class271 var7 = (class271) arg1;
            class368 var8 = var6.method1586(1);
            class368 var9 = var7.method1586(1);
            if (var8 != null && var9 != null) {
                int var10 = ~var8.field5528 >= ~var9.field5528 ? var9.field5528 : var8.field5528;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class253) {
                    class253 var11 = (class253) arg3;
                    if (var10 == var11.method1585(-72)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class253(this, var10);
                }
                if (var5.method1584(1, var9, var8, arg2)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V")
    public final void method814(int arg0, int arg1) {
        ++field7251;
        if (this.field7430 != arg0 || ~this.field7449 != ~arg1) {
            this.field7430 = arg0;
            this.field7449 = arg1;
            this.method2923(4);
            this.method2913((byte) -125);
            if (~this.field7418 != -4) {
                if (~this.field7418 == -3) {
                    this.method2863(-5099);
                    return;
                }
            } else {
                this.method2926((byte) -49);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "()I")
    public final int method750() {
        ++field7224;
        return this.field7334 + this.field7332 + this.field7331;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILfs;II)V")
    public final void method771(int arg0, class372 arg1, int arg2, int arg3) {
        ++field7243;
        class357 var5 = (class357) arg1;
        class129 var6 = var5.field5299;
        this.method2925(877);
        this.method2883(var5.field5299, 97);
        this.method2852(0, 1);
        this.method2919(8448, 7681, false);
        this.method2855(0, (byte) 50, 34167, 768);
        float var7 = var6.field1645 / (float) var6.field1641;
        float var8 = var6.field1647 / (float) var6.field1643;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (this.field7368 - arg2) * var7, (float) (-arg3 + this.field7343) * var8);
        OpenGL.glVertex2i(this.field7368, this.field7343);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7368) * var7, (float) (this.field7448 - arg3) * var8);
        OpenGL.glVertex2i(this.field7368, this.field7448);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7365) * var7, (float) (-arg3 + this.field7448) * var8);
        OpenGL.glVertex2i(this.field7365, this.field7448);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7365) * var7, (float) (-arg3 + this.field7343) * var8);
        OpenGL.glVertex2i(this.field7365, this.field7343);
        OpenGL.glEnd();
        this.method2855(0, (byte) 50, 5890, 768);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIILfs;II)V")
    public final void method834(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class372 arg6, int arg7, int arg8) {
        ++field7143;
        class357 var10 = (class357) arg6;
        class129 var11 = var10.field5299;
        this.method2925(877);
        this.method2883(var10.field5299, 55);
        this.method2852(0, arg5);
        this.method2919(8448, 7681, false);
        this.method2855(0, (byte) 50, 34167, 768);
        float var12 = var11.field1645 / (float) var11.field1641;
        float var13 = var11.field1647 / (float) var11.field1643;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method2855(0, (byte) 50, 5890, 768);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZZ)V")
    public final void method2920(int arg0, boolean arg1, boolean arg2) {
        ++field7294;
        this.method2873(arg0, arg1, arg2, -1);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method746(Canvas arg0) {
        ++field7148;
        if (this.field7180 == arg0) {
            throw new RuntimeException();
        } else if (!this.field7305.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field7168.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field7305.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "(B)V")
    private final void method2921(byte arg0) {
        ++field7120;
        int var2 = 0;
        int var3 = -69 / ((arg0 - 25) / 45);
        while (~this.field7455 < ~var2) {
            class472 var4 = this.field7353[var2];
            int var5 = var2 + 16386;
            class206.field2861[0] = (float) var4.method2759(117);
            class206.field2861[1] = (float) var4.method2760(-48);
            class206.field2861[2] = (float) var4.method2761(0);
            class206.field2861[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class206.field2861, 0);
            int var6 = var4.method2765(0);
            float var7 = var4.method2758(-33) / 255.0F;
            class206.field2861[0] = var7 * (float) (class500.method3013(var6, 16776372) >> 16);
            class206.field2861[2] = var7 * (float) class500.method3013(var6, 255);
            class206.field2861[1] = var7 * (float) class500.method3013(var6 >> 8, 255);
            OpenGL.glLightfv(var5, 4609, class206.field2861, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var4.method2764(false) * var4.method2764(false)));
            OpenGL.glEnable(var5);
            ++var2;
        }
        while (~this.field7393 < ~var2) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        this.field7393 = this.field7455;
    }

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "()I")
    public final int method752() {
        ++field7229;
        return this.field7449;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[Ldq;)V")
    public final void method766(int arg0, class472[] arg1) {
        ++field7303;
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field7353[var3] = arg1[var3];
        }
        this.field7455 = arg0;
        if (this.field7418 != 1) {
            this.method2921((byte) -99);
        }
    }

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "(II)I")
    public final int method2922(int arg0, int arg1) {
        if (arg1 < 95) {
            return 37;
        } else {
            ++field7267;
            if (~arg0 != -2) {
                if (~arg0 == -1) {
                    return 8448;
                } else if (~arg0 == -3) {
                    return 34165;
                } else if (arg0 == 3) {
                    return 260;
                } else if (arg0 == 4) {
                    return 34023;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                return 7681;
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "()Z")
    public final boolean method774() {
        ++field7179;
        return true;
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "()Z")
    public final boolean method742() {
        ++field7152;
        return false;
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(IIII)V")
    public final void method779(int arg0, int arg1, int arg2, int arg3) {
        this.field7313.method2469(-125, arg0, arg3, arg1, arg2);
        ++field7301;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIII)V")
    public final void method740(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7222;
        this.method2911(false);
        this.method2852(0, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method827(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field7197;
    }

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "(I)V")
    private final void method2923(int arg0) {
        ++field7189;
        float[] var2 = this.field7432;
        float var3 = (float) (-this.field7402 * this.field7430) / (float) this.field7342;
        if (arg0 != 4) {
            this.field7334 = -93;
        }
        float var4 = (float) ((-this.field7402 + this.field7204) * this.field7430) / (float) this.field7342;
        float var5 = (float) (this.field7430 * this.field7375) / (float) this.field7386;
        float var6 = (float) ((-this.field7191 + this.field7375) * this.field7430) / (float) this.field7386;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field7430 * 2.0F;
            var2[10] = this.field7421 = (float) (-(this.field7449 + this.field7430)) / (float) (this.field7449 - this.field7430);
            var2[2] = 0.0F;
            var2[1] = 0.0F;
            var2[5] = var7 / (-var6 + var5);
            var2[13] = 0.0F;
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[14] = this.field7420 = -((float) this.field7449 * var7) / (float) (-this.field7430 + this.field7449);
            var2[11] = -1.0F;
            var2[3] = 0.0F;
            var2[7] = 0.0F;
            var2[0] = var7 / (var4 - var3);
            var2[4] = 0.0F;
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[6] = 0.0F;
            var2[15] = 0.0F;
            var2[12] = 0.0F;
        } else {
            var2[14] = 0.0F;
            var2[11] = 0.0F;
            var2[13] = 0.0F;
            var2[15] = 1.0F;
            var2[8] = 0.0F;
            var2[9] = 0.0F;
            var2[3] = 0.0F;
            var2[10] = 1.0F;
            var2[2] = 0.0F;
            var2[7] = 0.0F;
            var2[12] = 0.0F;
            var2[5] = 1.0F;
            var2[1] = 0.0F;
            var2[4] = 0.0F;
            var2[0] = 1.0F;
            var2[6] = 0.0F;
        }
        this.method2928((byte) 118);
    }

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "(I)V")
    private final void method2924(int arg0) {
        ++field7299;
        OpenGL.glDepthMask(this.field7427 && this.field7354);
        if (arg0 < 64) {
            this.field7331 = 49;
        }
    }

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "(I)V")
    public final void method2925(int arg0) {
        if (this.field7367 != 2) {
            this.method2904(34162);
            this.method2880(false, -98);
            this.method2884(false, (byte) -109);
            this.method2868(false, 127);
            this.method2908(false, (byte) 124);
            this.method2867(0, -2);
            this.field7367 = 2;
        }
        if (arg0 != 877) {
            this.method2865(59, -98);
        }
        ++field7125;
    }

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "()Z")
    public final boolean method840() {
        ++field7177;
        return this.field7388 && (!this.method822() || this.field7376);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lva;Lbv;Lgs;Lla;I)V")
    public final void method787(class327 arg0, class191 arg1, class33 arg2, class299 arg3, int arg4) {
        ++field7176;
        arg0.method191(arg2, arg3, arg4);
        this.method800(arg1);
    }

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "(I)V")
    public final void method813(int arg0) {
        this.method2903(8054);
        ++field7141;
    }

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "(B)V")
    private final void method2926(byte arg0) {
        ++field7157;
        float var2 = (float) (-this.field7402) * this.field7460 / (float) this.field7342;
        float var3 = (float) (-this.field7375) * this.field7460 / (float) this.field7386;
        float var4 = (float) (-this.field7402 + this.field7204) * this.field7460 / (float) this.field7342;
        float var5 = (float) (-this.field7375 + this.field7191) * this.field7460 / (float) this.field7386;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field7430 - this.field7434), (double) ((float) this.field7449 + -this.field7434));
        }
        if (arg0 != -49) {
            this.method736();
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(ILht;)V")
    public final void method2927(int arg0, class393 arg1) {
        ++field7192;
        if (!this.field7410) {
            if (~this.field7329 > -1 || this.field7326[this.field7329] != arg1) {
                throw new RuntimeException();
            }
            this.field7326[this.field7329--] = null;
            arg1.method1794(arg0 + 2771);
            if (~this.field7329 > -1) {
                this.field7330 = this.field7323 = null;
            } else {
                this.field7330 = this.field7323 = this.field7326[this.field7329];
                this.field7330.method1791((byte) -90);
            }
        } else {
            this.method2894(arg1, arg0 ^ 16726601);
            this.method2878(arg1, -99);
        }
        if (arg0 != 14921) {
            this.field7406 = true;
        }
    }

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "(B)V")
    private final void method2928(byte arg0) {
        if (this.field7434 != 0.0F) {
            float var2 = this.field7373 / (this.field7434 + this.field7373);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field7420 * (1.0F - var2) / this.field7434;
            this.field7432[14] = this.field7420 * var3;
            this.field7432[10] = this.field7421 + var4;
        } else {
            this.field7432[10] = this.field7421;
            this.field7432[14] = this.field7420;
        }
        ++field7132;
        if (arg0 != 118) {
            this.method2870(true, 86L);
        }
        this.field7344 = (float) this.field7449 + -this.field7434;
        this.field7357 = (this.field7432[14] - (float) this.field7449) / this.field7432[10];
    }

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "()I")
    public final int method778() {
        ++field7271;
        return 4;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIILlp;I)V")
    public final void method2929(int arg0, int arg1, int arg2, class255 arg3, int arg4) {
        ++field7156;
        int var6 = arg3.method893(14889);
        int var7 = arg2 * this.method2877(arg0 + arg0, var6);
        this.method2875(arg3, -29);
        OpenGL.glDrawElements(arg4, arg1, var6, arg3.method896(arg0 ^ 28) + (long) var7);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V")
    public final void method733(boolean arg0) {
        ++field7292;
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(IIIIII)Loi;")
    public final class49 method829(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7300;
        return !this.field7453 ? null : new class422(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "(I)V")
    private final void method2930(int arg0) {
        ++field7288;
        this.method2867(0, -2);
        for (int var2 = this.field7387 + -1; var2 >= 0; --var2) {
            this.method2849(var2, (byte) -109);
            this.method2883((class221) null, 46);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2919(8448, 8448, false);
        this.method2855(2, (byte) 50, 34168, 770);
        this.method2890((byte) 89);
        this.field7451 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field7363 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field7431 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field7457 = true;
        this.method2880(true, arg0 ^ -81);
        this.method2884(true, (byte) -82);
        this.method2868(true, arg0 + 115);
        this.method2908(true, (byte) 105);
        this.method2901(arg0 + -106);
        this.field7168.setSwapInterval(0);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        if (arg0 != 4) {
            this.field7361 = null;
        }
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] var3 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var4 = 0; var4 < 8; ++var4) {
            int var5 = 16384 - -var4;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field7351 = this.field7390 = -1;
        this.method836();
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method772(Canvas arg0) {
        ++field7235;
        if (this.field7180 == arg0) {
            throw new RuntimeException();
        } else if (this.field7305.containsKey(arg0)) {
            Long var2 = (Long) this.field7305.get(arg0);
            this.field7168.releaseSurface(arg0, var2);
            this.field7305.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "(I)V")
    private final void method2931(int arg0) {
        if (arg0 == 8960) {
            if (~this.field7365 <= ~this.field7368 && ~this.field7448 <= ~this.field7343) {
                OpenGL.glScissor(this.field7397 + this.field7368, this.field7385 - (-this.field7191 - -this.field7448), -this.field7368 + this.field7365, -this.field7343 + this.field7448);
            } else {
                OpenGL.glScissor(0, 0, 0, 0);
            }
            ++field7170;
        }
    }
}
