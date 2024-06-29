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

@OriginalClass("client!ih")
public class class503 extends class290 {

    @OriginalMember(owner = "client!ih", name = "db", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field7140 = new Hashtable();

    @OriginalMember(owner = "client!ih", name = "ce", descriptor = "I")
    public int field7295 = 128;

    @OriginalMember(owner = "client!ih", name = "ie", descriptor = "Llo;")
    private class539 field7301 = new class539();

    @OriginalMember(owner = "client!ih", name = "ne", descriptor = "Lhf;")
    private class275 field7306 = new class275();

    @OriginalMember(owner = "client!ih", name = "oe", descriptor = "Lhf;")
    public class275 field7307 = new class275();

    @OriginalMember(owner = "client!ih", name = "se", descriptor = "I")
    public int field7311 = 3;

    @OriginalMember(owner = "client!ih", name = "xe", descriptor = "Z")
    private boolean field7316 = false;

    @OriginalMember(owner = "client!ih", name = "ve", descriptor = "I")
    public int field7314 = 8;

    @OriginalMember(owner = "client!ih", name = "re", descriptor = "Lam;")
    private class455 field7310 = new class455();

    @OriginalMember(owner = "client!ih", name = "Be", descriptor = "I")
    private int field7320 = -1;

    @OriginalMember(owner = "client!ih", name = "ze", descriptor = "I")
    private int field7318 = -1;

    @OriginalMember(owner = "client!ih", name = "Ee", descriptor = "[Lub;")
    private class18[] field7323 = new class18[4];

    @OriginalMember(owner = "client!ih", name = "Ce", descriptor = "I")
    private int field7321 = -1;

    @OriginalMember(owner = "client!ih", name = "Ae", descriptor = "[Lub;")
    private class18[] field7319 = new class18[4];

    @OriginalMember(owner = "client!ih", name = "Fe", descriptor = "[Lub;")
    private class18[] field7324 = new class18[4];

    @OriginalMember(owner = "client!ih", name = "Ge", descriptor = "Lam;")
    private class455 field7325;

    @OriginalMember(owner = "client!ih", name = "Ke", descriptor = "Lam;")
    private class455 field7329;

    @OriginalMember(owner = "client!ih", name = "Le", descriptor = "Lam;")
    private class455 field7330;

    @OriginalMember(owner = "client!ih", name = "Me", descriptor = "Lam;")
    private class455 field7331;

    @OriginalMember(owner = "client!ih", name = "Ne", descriptor = "Lam;")
    private class455 field7332;

    @OriginalMember(owner = "client!ih", name = "Oe", descriptor = "Lam;")
    private class455 field7333;

    @OriginalMember(owner = "client!ih", name = "Pe", descriptor = "Lam;")
    private class455 field7334;

    @OriginalMember(owner = "client!ih", name = "df", descriptor = "I")
    private int field7348;

    @OriginalMember(owner = "client!ih", name = "zf", descriptor = "I")
    public int field7369;

    @OriginalMember(owner = "client!ih", name = "Bf", descriptor = "[F")
    private float[] field7371;

    @OriginalMember(owner = "client!ih", name = "pf", descriptor = "I")
    public int field7359;

    @OriginalMember(owner = "client!ih", name = "Ff", descriptor = "[Lls;")
    private class95[] field7375;

    @OriginalMember(owner = "client!ih", name = "jf", descriptor = "F")
    public float field7353;

    @OriginalMember(owner = "client!ih", name = "Gf", descriptor = "F")
    public float field7376;

    @OriginalMember(owner = "client!ih", name = "ag", descriptor = "I")
    public int field7396;

    @OriginalMember(owner = "client!ih", name = "ff", descriptor = "I")
    private int field7350;

    @OriginalMember(owner = "client!ih", name = "Sf", descriptor = "I")
    private int field7388;

    @OriginalMember(owner = "client!ih", name = "Wf", descriptor = "F")
    private float field7392;

    @OriginalMember(owner = "client!ih", name = "lg", descriptor = "I")
    private int field7407;

    @OriginalMember(owner = "client!ih", name = "eg", descriptor = "I")
    public int field7400;

    @OriginalMember(owner = "client!ih", name = "Mf", descriptor = "I")
    public int field7382;

    @OriginalMember(owner = "client!ih", name = "og", descriptor = "I")
    public int field7410;

    @OriginalMember(owner = "client!ih", name = "Xe", descriptor = "I")
    private int field7342;

    @OriginalMember(owner = "client!ih", name = "gg", descriptor = "I")
    private int field7402;

    @OriginalMember(owner = "client!ih", name = "lf", descriptor = "I")
    public int field7355;

    @OriginalMember(owner = "client!ih", name = "hg", descriptor = "I")
    public int field7403;

    @OriginalMember(owner = "client!ih", name = "xg", descriptor = "I")
    private int field7419;

    @OriginalMember(owner = "client!ih", name = "If", descriptor = "F")
    private float field7378;

    @OriginalMember(owner = "client!ih", name = "zg", descriptor = "I")
    public int field7421;

    @OriginalMember(owner = "client!ih", name = "tg", descriptor = "F")
    public float field7415;

    @OriginalMember(owner = "client!ih", name = "Mg", descriptor = "I")
    public int field7434;

    @OriginalMember(owner = "client!ih", name = "Bg", descriptor = "I")
    private int field7423;

    @OriginalMember(owner = "client!ih", name = "Re", descriptor = "I")
    private int field7336;

    @OriginalMember(owner = "client!ih", name = "Tg", descriptor = "[F")
    private float[] field7441;

    @OriginalMember(owner = "client!ih", name = "Pg", descriptor = "F")
    public float field7437;

    @OriginalMember(owner = "client!ih", name = "yg", descriptor = "[F")
    private float[] field7420;

    @OriginalMember(owner = "client!ih", name = "Zf", descriptor = "F")
    public float field7395;

    @OriginalMember(owner = "client!ih", name = "We", descriptor = "F")
    public float field7341;

    @OriginalMember(owner = "client!ih", name = "Ef", descriptor = "[F")
    public float[] field7374;

    @OriginalMember(owner = "client!ih", name = "ah", descriptor = "F")
    public float field7448;

    @OriginalMember(owner = "client!ih", name = "Xg", descriptor = "I")
    public int field7445;

    @OriginalMember(owner = "client!ih", name = "Jf", descriptor = "F")
    private float field7379;

    @OriginalMember(owner = "client!ih", name = "sg", descriptor = "F")
    public float field7414;

    @OriginalMember(owner = "client!ih", name = "pg", descriptor = "Z")
    private boolean field7411;

    @OriginalMember(owner = "client!ih", name = "Sg", descriptor = "I")
    private int field7440;

    @OriginalMember(owner = "client!ih", name = "ch", descriptor = "[F")
    private float[] field7450;

    @OriginalMember(owner = "client!ih", name = "dh", descriptor = "Lhi;")
    public class141 field7451;

    @OriginalMember(owner = "client!ih", name = "fh", descriptor = "[I")
    public int[] field7453;

    @OriginalMember(owner = "client!ih", name = "jh", descriptor = "[B")
    public byte[] field7457;

    @OriginalMember(owner = "client!ih", name = "ih", descriptor = "[I")
    public int[] field7456;

    @OriginalMember(owner = "client!ih", name = "kh", descriptor = "[I")
    public int[] field7458;

    @OriginalMember(owner = "client!ih", name = "Zd", descriptor = "I")
    public int field7292;

    @OriginalMember(owner = "client!ih", name = "qd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7257;

    @OriginalMember(owner = "client!ih", name = "Lc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7226;

    @OriginalMember(owner = "client!ih", name = "fd", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field7246;

    @OriginalMember(owner = "client!ih", name = "ab", descriptor = "J")
    private long field7137;

    @OriginalMember(owner = "client!ih", name = "Gd", descriptor = "J")
    private long field7273;

    @OriginalMember(owner = "client!ih", name = "Ve", descriptor = "Z")
    public boolean field7340;

    @OriginalMember(owner = "client!ih", name = "Ug", descriptor = "I")
    public int field7442;

    @OriginalMember(owner = "client!ih", name = "Af", descriptor = "Ljava/lang/String;")
    private String field7370;

    @OriginalMember(owner = "client!ih", name = "Se", descriptor = "Z")
    public boolean field7337;

    @OriginalMember(owner = "client!ih", name = "Xf", descriptor = "Z")
    public boolean field7393;

    @OriginalMember(owner = "client!ih", name = "Ue", descriptor = "Z")
    private boolean field7339;

    @OriginalMember(owner = "client!ih", name = "Gg", descriptor = "Z")
    public boolean field7428;

    @OriginalMember(owner = "client!ih", name = "Lg", descriptor = "Z")
    private boolean field7433;

    @OriginalMember(owner = "client!ih", name = "rf", descriptor = "Z")
    public boolean field7361;

    @OriginalMember(owner = "client!ih", name = "bh", descriptor = "Ljava/lang/String;")
    private String field7449;

    @OriginalMember(owner = "client!ih", name = "Kg", descriptor = "Z")
    public boolean field7432;

    @OriginalMember(owner = "client!ih", name = "Cg", descriptor = "Z")
    private boolean field7424;

    @OriginalMember(owner = "client!ih", name = "Yd", descriptor = "Lkj;")
    public class405 field7291;

    @OriginalMember(owner = "client!ih", name = "we", descriptor = "Lgp;")
    public class36 field7315;

    @OriginalMember(owner = "client!ih", name = "ke", descriptor = "Laa;")
    private class341 field7303;

    @OriginalMember(owner = "client!ih", name = "fe", descriptor = "Ljc;")
    private class308 field7298;

    @OriginalMember(owner = "client!ih", name = "de", descriptor = "Lrh;")
    private class177 field7296;

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "[S")
    public static short[] field7124 = new short[256];

    @OriginalMember(owner = "client!ih", name = "nc", descriptor = "[[Z")
    public static boolean[][] field7202 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!ih", name = "Gc", descriptor = "[I")
    public static int[] field7221 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!ih", name = "ld", descriptor = "I")
    public static int field7252 = 0;

    @OriginalMember(owner = "client!ih", name = "be", descriptor = "Lam;")
    public static class455 field7294 = new class455();

    @OriginalMember(owner = "client!ih", name = "le", descriptor = "Z")
    public static boolean field7304 = false;

    @OriginalMember(owner = "client!ih", name = "pe", descriptor = "Lkn;")
    public static class530 field7308 = new class530("yellow:", "gelb:", "jaune:", "amarelo:");

    @OriginalMember(owner = "client!ih", name = "qe", descriptor = "Leh;")
    public static class246 field7309 = new class246(38, 9);

    @OriginalMember(owner = "client!ih", name = "Ze", descriptor = "F")
    public float field7344;

    @OriginalMember(owner = "client!ih", name = "mf", descriptor = "F")
    public float field7356;

    @OriginalMember(owner = "client!ih", name = "xf", descriptor = "F")
    public float field7367;

    @OriginalMember(owner = "client!ih", name = "Cf", descriptor = "F")
    public float field7372;

    @OriginalMember(owner = "client!ih", name = "Hf", descriptor = "F")
    public float field7377;

    @OriginalMember(owner = "client!ih", name = "dg", descriptor = "F")
    public float field7399;

    @OriginalMember(owner = "client!ih", name = "jg", descriptor = "F")
    public float field7405;

    @OriginalMember(owner = "client!ih", name = "vg", descriptor = "F")
    private float field7417;

    @OriginalMember(owner = "client!ih", name = "Vg", descriptor = "F")
    private float field7443;

    @OriginalMember(owner = "client!ih", name = "Wg", descriptor = "F")
    private float field7444;

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "I")
    public static int field7106;

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "I")
    public static int field7108;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
    public static int field7110;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "I")
    public static int field7121;

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "I")
    public static int field7131;

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!ih", name = "Z", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!ih", name = "bb", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!ih", name = "cb", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!ih", name = "eb", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!ih", name = "fb", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!ih", name = "gb", descriptor = "I")
    public static int field7143;

    @OriginalMember(owner = "client!ih", name = "hb", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!ih", name = "ib", descriptor = "I")
    public static int field7145;

    @OriginalMember(owner = "client!ih", name = "jb", descriptor = "I")
    public static int field7146;

    @OriginalMember(owner = "client!ih", name = "kb", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!ih", name = "lb", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!ih", name = "mb", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!ih", name = "nb", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!ih", name = "ob", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!ih", name = "pb", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!ih", name = "qb", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!ih", name = "rb", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!ih", name = "sb", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!ih", name = "tb", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!ih", name = "ub", descriptor = "I")
    public static int field7157;

    @OriginalMember(owner = "client!ih", name = "vb", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!ih", name = "wb", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!ih", name = "xb", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!ih", name = "yb", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!ih", name = "zb", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!ih", name = "Ab", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!ih", name = "Bb", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!ih", name = "Cb", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!ih", name = "Db", descriptor = "I")
    public static int field7166;

    @OriginalMember(owner = "client!ih", name = "Eb", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!ih", name = "Fb", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!ih", name = "Gb", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!ih", name = "Hb", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!ih", name = "Ib", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!ih", name = "Jb", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!ih", name = "Kb", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!ih", name = "Lb", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!ih", name = "Mb", descriptor = "I")
    private int field7175;

    @OriginalMember(owner = "client!ih", name = "Nb", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!ih", name = "Ob", descriptor = "I")
    public static int field7177;

    @OriginalMember(owner = "client!ih", name = "Pb", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!ih", name = "Qb", descriptor = "I")
    public static int field7179;

    @OriginalMember(owner = "client!ih", name = "Rb", descriptor = "I")
    public static int field7180;

    @OriginalMember(owner = "client!ih", name = "Sb", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!ih", name = "Tb", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!ih", name = "Ub", descriptor = "I")
    private int field7183;

    @OriginalMember(owner = "client!ih", name = "Vb", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!ih", name = "Wb", descriptor = "I")
    public static int field7185;

    @OriginalMember(owner = "client!ih", name = "Xb", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!ih", name = "Yb", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!ih", name = "Zb", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!ih", name = "ac", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!ih", name = "bc", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!ih", name = "cc", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!ih", name = "dc", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!ih", name = "ec", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!ih", name = "fc", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!ih", name = "gc", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!ih", name = "hc", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!ih", name = "ic", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!ih", name = "jc", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!ih", name = "kc", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!ih", name = "lc", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!ih", name = "mc", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!ih", name = "oc", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!ih", name = "pc", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!ih", name = "qc", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!ih", name = "rc", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!ih", name = "sc", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!ih", name = "tc", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!ih", name = "uc", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!ih", name = "vc", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!ih", name = "wc", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!ih", name = "xc", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!ih", name = "yc", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!ih", name = "zc", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!ih", name = "Ac", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!ih", name = "Bc", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!ih", name = "Cc", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!ih", name = "Dc", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!ih", name = "Ec", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!ih", name = "Fc", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!ih", name = "Hc", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!ih", name = "Ic", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!ih", name = "Jc", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!ih", name = "Kc", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!ih", name = "Mc", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!ih", name = "Nc", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!ih", name = "Oc", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!ih", name = "Pc", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!ih", name = "Qc", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!ih", name = "Rc", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!ih", name = "Sc", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!ih", name = "Tc", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!ih", name = "Uc", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!ih", name = "Vc", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!ih", name = "Wc", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!ih", name = "Xc", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!ih", name = "Yc", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!ih", name = "Zc", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!ih", name = "ad", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!ih", name = "bd", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!ih", name = "cd", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!ih", name = "dd", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!ih", name = "ed", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!ih", name = "gd", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!ih", name = "hd", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!ih", name = "id", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!ih", name = "jd", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!ih", name = "kd", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!ih", name = "md", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!ih", name = "nd", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!ih", name = "od", descriptor = "I")
    public int field7255;

    @OriginalMember(owner = "client!ih", name = "pd", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!ih", name = "rd", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!ih", name = "sd", descriptor = "I")
    public int field7259;

    @OriginalMember(owner = "client!ih", name = "td", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!ih", name = "ud", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!ih", name = "vd", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!ih", name = "wd", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!ih", name = "xd", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!ih", name = "yd", descriptor = "I")
    public static int field7265;

    @OriginalMember(owner = "client!ih", name = "zd", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!ih", name = "Ad", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!ih", name = "Bd", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!ih", name = "Cd", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!ih", name = "Dd", descriptor = "I")
    public static int field7270;

    @OriginalMember(owner = "client!ih", name = "Ed", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!ih", name = "Fd", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!ih", name = "Hd", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!ih", name = "Id", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!ih", name = "Jd", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!ih", name = "Kd", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!ih", name = "Ld", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!ih", name = "Md", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!ih", name = "Nd", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!ih", name = "Od", descriptor = "I")
    public static int field7281;

    @OriginalMember(owner = "client!ih", name = "Pd", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!ih", name = "Qd", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!ih", name = "Rd", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!ih", name = "Sd", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!ih", name = "Td", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!ih", name = "Ud", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!ih", name = "Vd", descriptor = "I")
    public static int field7288;

    @OriginalMember(owner = "client!ih", name = "Wd", descriptor = "I")
    public static int field7289;

    @OriginalMember(owner = "client!ih", name = "Xd", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!ih", name = "ae", descriptor = "I")
    public static int field7293;

    @OriginalMember(owner = "client!ih", name = "ee", descriptor = "I")
    public static int field7297;

    @OriginalMember(owner = "client!ih", name = "ge", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!ih", name = "he", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!ih", name = "je", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!ih", name = "me", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!ih", name = "ue", descriptor = "I")
    public int field7313;

    @OriginalMember(owner = "client!ih", name = "He", descriptor = "I")
    public int field7326;

    @OriginalMember(owner = "client!ih", name = "Ie", descriptor = "I")
    public int field7327;

    @OriginalMember(owner = "client!ih", name = "Je", descriptor = "I")
    private int field7328;

    @OriginalMember(owner = "client!ih", name = "Ye", descriptor = "I")
    private int field7343;

    @OriginalMember(owner = "client!ih", name = "af", descriptor = "I")
    private int field7345;

    @OriginalMember(owner = "client!ih", name = "ef", descriptor = "I")
    public int field7349;

    @OriginalMember(owner = "client!ih", name = "kf", descriptor = "I")
    public int field7354;

    @OriginalMember(owner = "client!ih", name = "nf", descriptor = "I")
    private int field7357;

    @OriginalMember(owner = "client!ih", name = "of", descriptor = "I")
    private int field7358;

    @OriginalMember(owner = "client!ih", name = "Yf", descriptor = "I")
    private int field7394;

    @OriginalMember(owner = "client!ih", name = "cg", descriptor = "I")
    public int field7398;

    @OriginalMember(owner = "client!ih", name = "ng", descriptor = "I")
    public int field7409;

    @OriginalMember(owner = "client!ih", name = "qg", descriptor = "I")
    private int field7412;

    @OriginalMember(owner = "client!ih", name = "rg", descriptor = "I")
    private int field7413;

    @OriginalMember(owner = "client!ih", name = "Fg", descriptor = "I")
    private int field7427;

    @OriginalMember(owner = "client!ih", name = "Hg", descriptor = "I")
    private int field7429;

    @OriginalMember(owner = "client!ih", name = "Ng", descriptor = "I")
    private int field7435;

    @OriginalMember(owner = "client!ih", name = "Yg", descriptor = "I")
    private int field7446;

    @OriginalMember(owner = "client!ih", name = "gh", descriptor = "I")
    private int field7454;

    @OriginalMember(owner = "client!ih", name = "hh", descriptor = "I")
    private int field7455;

    @OriginalMember(owner = "client!ih", name = "Of", descriptor = "J")
    private long field7384;

    @OriginalMember(owner = "client!ih", name = "Ig", descriptor = "Lwh;")
    private class102 field7430;

    @OriginalMember(owner = "client!ih", name = "uf", descriptor = "Lik;")
    private class142 field7364;

    @OriginalMember(owner = "client!ih", name = "Lf", descriptor = "Lgb;")
    public class146 field7381;

    @OriginalMember(owner = "client!ih", name = "cf", descriptor = "Ltg;")
    private class157 field7347;

    @OriginalMember(owner = "client!ih", name = "Df", descriptor = "Ltg;")
    private class157 field7373;

    @OriginalMember(owner = "client!ih", name = "ye", descriptor = "Lub;")
    private class18 field7317;

    @OriginalMember(owner = "client!ih", name = "De", descriptor = "Lub;")
    private class18 field7322;

    @OriginalMember(owner = "client!ih", name = "Qe", descriptor = "Lrr;")
    public class247 field7335;

    @OriginalMember(owner = "client!ih", name = "sf", descriptor = "Lrr;")
    public class247 field7362;

    @OriginalMember(owner = "client!ih", name = "bg", descriptor = "Lrr;")
    public class247 field7397;

    @OriginalMember(owner = "client!ih", name = "kg", descriptor = "Lrr;")
    public class247 field7406;

    @OriginalMember(owner = "client!ih", name = "wg", descriptor = "Lrr;")
    public class247 field7418;

    @OriginalMember(owner = "client!ih", name = "Ag", descriptor = "Lrr;")
    public class247 field7422;

    @OriginalMember(owner = "client!ih", name = "Dg", descriptor = "Lrr;")
    public class247 field7425;

    @OriginalMember(owner = "client!ih", name = "Jg", descriptor = "Lrr;")
    public class247 field7431;

    @OriginalMember(owner = "client!ih", name = "Zg", descriptor = "Lrr;")
    public class247 field7447;

    @OriginalMember(owner = "client!ih", name = "eh", descriptor = "Lrr;")
    public class247 field7452;

    @OriginalMember(owner = "client!ih", name = "qf", descriptor = "Lhf;")
    public class275 field7360;

    @OriginalMember(owner = "client!ih", name = "Uf", descriptor = "Lhf;")
    public class275 field7390;

    @OriginalMember(owner = "client!ih", name = "Vf", descriptor = "Ldp;")
    private class3 field7391;

    @OriginalMember(owner = "client!ih", name = "ug", descriptor = "Lgu;")
    public class417 field7416;

    @OriginalMember(owner = "client!ih", name = "hf", descriptor = "Lff;")
    public class9 field7352;

    @OriginalMember(owner = "client!ih", name = "Qf", descriptor = "Lff;")
    public class9 field7386;

    @OriginalMember(owner = "client!ih", name = "te", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field7312;

    @OriginalMember(owner = "client!ih", name = "Te", descriptor = "Z")
    private boolean field7338;

    @OriginalMember(owner = "client!ih", name = "bf", descriptor = "Z")
    public boolean field7346;

    @OriginalMember(owner = "client!ih", name = "gf", descriptor = "Z")
    public boolean field7351;

    @OriginalMember(owner = "client!ih", name = "tf", descriptor = "Z")
    public boolean field7363;

    @OriginalMember(owner = "client!ih", name = "vf", descriptor = "Z")
    private boolean field7365;

    @OriginalMember(owner = "client!ih", name = "wf", descriptor = "Z")
    public boolean field7366;

    @OriginalMember(owner = "client!ih", name = "yf", descriptor = "Z")
    private boolean field7368;

    @OriginalMember(owner = "client!ih", name = "Kf", descriptor = "Z")
    private boolean field7380;

    @OriginalMember(owner = "client!ih", name = "Nf", descriptor = "Z")
    private boolean field7383;

    @OriginalMember(owner = "client!ih", name = "Pf", descriptor = "Z")
    public boolean field7385;

    @OriginalMember(owner = "client!ih", name = "Rf", descriptor = "Z")
    private boolean field7387;

    @OriginalMember(owner = "client!ih", name = "Tf", descriptor = "Z")
    private boolean field7389;

    @OriginalMember(owner = "client!ih", name = "fg", descriptor = "Z")
    private boolean field7401;

    @OriginalMember(owner = "client!ih", name = "mg", descriptor = "Z")
    public boolean field7408;

    @OriginalMember(owner = "client!ih", name = "Eg", descriptor = "Z")
    private boolean field7426;

    @OriginalMember(owner = "client!ih", name = "Og", descriptor = "Z")
    public boolean field7436;

    @OriginalMember(owner = "client!ih", name = "Qg", descriptor = "Z")
    public boolean field7438;

    @OriginalMember(owner = "client!ih", name = "Rg", descriptor = "Z")
    private boolean field7439;

    @OriginalMember(owner = "client!ih", name = "ig", descriptor = "[Lsv;")
    private class478[] field7404;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "()Z")
    public final boolean method363() {
        ++field7210;
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(IIII)V")
    public final void method2916(int arg0, int arg1, int arg2, int arg3) {
        ++field7186;
        OpenGL.glDrawArrays(arg3, arg0, arg1);
        if (arg2 != 916736984) {
            this.field7226 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)V")
    public final synchronized void method2917(byte arg0, int arg1) {
        ++field7235;
        class254 var3 = new class254(arg1);
        if (arg0 == -46) {
            this.field7331.method2657(8492, var3);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Le;Lsj;Lc;Lwp;I)V")
    public final void method345(class377 arg0, class324 arg1, class125 arg2, class122 arg3, int arg4) {
        ++field7116;
        arg0.method1566(arg2, arg3, arg4);
        this.method359(arg1);
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "()V")
    public final void method303() {
        ++field7150;
        if (this.field7424 && ~this.field7255 < -1 && ~this.field7259 < -1) {
            int var1 = this.field7419;
            int var2 = this.field7423;
            int var3 = this.field7440;
            int var4 = this.field7348;
            this.method295();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2945(-99);
            this.method2977(-68, false);
            this.method2962(1, false);
            this.method2926(false, (byte) -89);
            this.method2933(false, false);
            this.method2968((class478) null, -118);
            this.method2995(-2, (byte) -127);
            this.method2999(1, 113);
            this.method2967(0, 101);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field7255, this.field7259, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method301(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!ih", name = "VA", descriptor = "(IIIIII)Z")
    public final boolean method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7132;
        float var7 = (float) arg2 * this.field7360.field4069 + (float) arg0 * this.field7360.field4079 + (float) arg1 * this.field7360.field4061 + this.field7360.field4091;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field7360.field4069 + (float) arg3 * this.field7360.field4079 + (float) arg4 * this.field7360.field4061 + this.field7360.field4091;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field7434) || !((float) this.field7434 > var8)) && (!(var7 > (float) this.field7355) || !((float) this.field7355 < var8))) {
            int var9 = (int) (((float) arg2 * this.field7360.field4084 + (float) arg0 * this.field7360.field4062 + (float) arg1 * this.field7360.field4068 + this.field7360.field4059) * (float) this.field7410 / var7);
            int var10 = (int) (((float) arg5 * this.field7360.field4084 + (float) arg3 * this.field7360.field4062 + (float) arg4 * this.field7360.field4068 + this.field7360.field4059) * (float) this.field7410 / var8);
            if ((float) var9 < this.field7356 && (float) var10 < this.field7356 || this.field7377 < (float) var9 && (float) var10 > this.field7377) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field7360.field4088 + (float) arg0 * this.field7360.field4082 + (float) arg1 * this.field7360.field4078 + this.field7360.field4077) * (float) this.field7400 / var7);
                int var12 = (int) (((float) arg5 * this.field7360.field4088 + (float) arg3 * this.field7360.field4082 + (float) arg4 * this.field7360.field4078 + this.field7360.field4077) * (float) this.field7400 / var8);
                return (!((float) var11 < this.field7399) || !((float) var12 < this.field7399)) && (!((float) var11 > this.field7367) || !(this.field7367 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    private final void method2918(byte arg0) {
        ++field7180;
        if (~this.field7343 != -4) {
            this.field7343 = 3;
            this.method2980(false);
            this.method2952(0);
            this.field7427 &= -8;
        }
        int var2 = -89 % ((arg0 - -14) / 57);
    }

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "()I")
    public final int method357() {
        ++field7234;
        return this.field7355;
    }

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "(I)V")
    public final void method2919(int arg0) {
        OpenGL.glPushMatrix();
        if (arg0 < 45) {
            this.method2945(-125);
        }
        ++field7275;
    }

    @OriginalMember(owner = "client!ih", name = "va", descriptor = "()V")
    public final void method295() {
        this.field7440 = 0;
        ++field7277;
        this.field7348 = this.field7259;
        this.field7423 = this.field7255;
        this.field7419 = 0;
        OpenGL.glDisable(3089);
        this.method2964(4);
    }

    @OriginalMember(owner = "client!ih", name = "pa", descriptor = "()I")
    public final int method304() {
        ++field7113;
        return this.field7327 + this.field7326 + this.field7328;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIZ)Lo;")
    public final class24 method307(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field7196;
        return new class484(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V")
    private final void method2920(byte arg0) {
        ++field7107;
        if (arg0 != -85) {
            this.field7387 = true;
        }
        if (this.field7387 && !this.field7389) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)V")
    public final synchronized void method2921(int arg0, int arg1) {
        ++field7208;
        class498 var3 = new class498();
        var3.field7060 = (long) arg1;
        this.field7333.method2657(8492, var3);
        if (arg0 >= -87) {
            this.method354();
        }
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(II)I")
    public final int method2922(int arg0, int arg1) {
        ++field7103;
        if (arg0 != 6406 && ~arg0 != -6410) {
            if (~arg0 != -6411 && arg0 != 34846 && ~arg0 != -34845) {
                if (arg0 != 6407) {
                    if (~arg0 != -6409 && ~arg0 != -34848) {
                        if (~arg0 != -34844) {
                            if (arg0 != 34842) {
                                if (arg0 == 6402) {
                                    return 3;
                                } else if (arg0 == 6401) {
                                    return 1;
                                } else {
                                    if (arg1 != 1319) {
                                        this.method353(35);
                                    }
                                    throw new IllegalArgumentException("");
                                }
                            } else {
                                return 8;
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

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZII[B)Ltg;")
    public final class157 method2923(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4) {
        ++field7250;
        if (!this.field7339 || arg1 && !this.field7433) {
            if (arg2 != 0) {
                this.field7428 = true;
            }
            return new class257(this, arg0, arg4, arg3);
        } else {
            return new class56(this, arg0, arg4, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZB)V")
    public final void method2924(int arg0, boolean arg1, byte arg2) {
        ++field7135;
        this.method2948(arg1, true, arg0, true);
        if (arg2 >= -71) {
            this.field7361 = false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
    private final void method2925(byte arg0) {
        ++field7122;
        OpenGL.glViewport(this.field7342, this.field7402, this.field7255, this.field7259);
        int var2 = -43 % ((5 - arg0) / 42);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZB)V")
    public final void method2926(boolean arg0, byte arg1) {
        int var3 = -104 / ((arg1 - -12) / 62);
        ++field7111;
        if (this.field7426 != arg0) {
            if (arg0) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field7427 &= -32;
            this.field7426 = arg0;
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(B)V")
    private final void method2927(byte arg0) {
        ++field7305;
        float[] var2 = this.field7371;
        float var3 = (float) (-this.field7396 * this.field7434) / (float) this.field7410;
        if (arg0 < -50) {
            float var4 = (float) ((this.field7255 - this.field7396) * this.field7434) / (float) this.field7410;
            float var5 = (float) (this.field7434 * this.field7359) / (float) this.field7400;
            float var6 = (float) ((this.field7359 - this.field7259) * this.field7434) / (float) this.field7400;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field7434 * 2.0F;
                var2[13] = 0.0F;
                var2[0] = var7 / (-var3 + var4);
                var2[10] = this.field7443 = (float) (-(this.field7434 + this.field7355)) / (float) (-this.field7434 + this.field7355);
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[7] = 0.0F;
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[12] = 0.0F;
                var2[1] = 0.0F;
                var2[3] = 0.0F;
                var2[2] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[4] = 0.0F;
                var2[14] = this.field7417 = -((float) this.field7355 * var7) / (float) (-this.field7434 + this.field7355);
                var2[11] = -1.0F;
                var2[15] = 0.0F;
                var2[6] = 0.0F;
            } else {
                var2[3] = 0.0F;
                var2[12] = 0.0F;
                var2[0] = 1.0F;
                var2[6] = 0.0F;
                var2[5] = 1.0F;
                var2[9] = 0.0F;
                var2[11] = 0.0F;
                var2[4] = 0.0F;
                var2[10] = 1.0F;
                var2[1] = 0.0F;
                var2[13] = 0.0F;
                var2[15] = 1.0F;
                var2[2] = 0.0F;
                var2[8] = 0.0F;
                var2[7] = 0.0F;
                var2[14] = 0.0F;
            }
            this.method2951(-20);
        }
    }

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "()V")
    public final void method377() {
        ++field7266;
        try {
            this.field7246.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lub;B)V")
    public final void method2928(class18 arg0, byte arg1) {
        ++field7158;
        if (arg1 < -22) {
            if (!this.field7363) {
                if (~this.field7321 <= -4) {
                    throw new RuntimeException();
                } else {
                    if (~this.field7321 <= -1) {
                        this.field7324[this.field7321].method94((byte) -128);
                    }
                    this.field7317 = this.field7322 = this.field7324[++this.field7321] = arg0;
                    this.field7317.method95(-104);
                }
            } else {
                this.method2970(-257, arg0);
                this.method2966(30, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IF)V")
    public final void method2929(int arg0, float arg1) {
        if (arg0 <= 36) {
            this.method2978(true, (class18) null);
        }
        ++field7156;
        if (this.field7378 != arg1) {
            this.field7378 = arg1;
            if (this.field7343 == 3) {
                this.method2980(false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "()I")
    public final int method371() {
        ++field7211;
        return 4;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([IIIII)Lo;")
    public final class24 method344(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7289;
        return new class484(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ih", name = "ba", descriptor = "(IIII)V")
    public final void method301(int arg0, int arg1, int arg2, int arg3) {
        if (~arg1 > -1) {
            arg1 = 0;
        }
        ++field7261;
        if (~this.field7255 > ~arg2) {
            arg2 = this.field7255;
        }
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (arg3 > this.field7259) {
            arg3 = this.field7259;
        }
        this.field7348 = arg3;
        this.field7423 = arg2;
        this.field7440 = arg1;
        this.field7419 = arg0;
        OpenGL.glEnable(3089);
        this.method2964(4);
        this.method2949(true);
    }

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "()V")
    public final void method320() {
        this.field7438 = false;
        ++field7191;
        this.field7296.method1106(false, false, 0, 0, 0, -128);
        this.method2996(9354);
        this.method2959(true);
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(B)V")
    public final void method2930(byte arg0) {
        ++field7206;
        if (arg0 <= -38) {
            if (this.field7427 != 2) {
                this.method2992(0);
                this.method2977(-109, false);
                this.method2962(1, false);
                this.method2926(false, (byte) 105);
                this.method2933(false, false);
                this.method2995(-2, (byte) 44);
                this.field7427 = 2;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[[I[[IIII)Lya;")
    public final class38 method314(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field7173;
        return new class1(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "()Z")
    public final boolean method317() {
        ++field7218;
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "()Z")
    public final boolean method362() {
        ++field7172;
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "()I")
    public final int method378() {
        ++field7181;
        int var1 = this.field7455;
        this.field7455 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ih", name = "AA", descriptor = "()I")
    public final int method309() {
        ++field7270;
        return this.field7434;
    }

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "()Z")
    public final boolean method360() {
        ++field7258;
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "MA", descriptor = "([I)V")
    public final void method343(int[] arg0) {
        arg0[3] = this.field7348;
        arg0[0] = this.field7419;
        arg0[2] = this.field7423;
        ++field7193;
        arg0[1] = this.field7440;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLub;)V")
    public final void method2931(boolean arg0, class18 arg1) {
        if (arg0) {
            this.field7348 = -43;
        }
        ++field7241;
        if (!this.field7363) {
            if (this.field7321 >= 0 && this.field7324[this.field7321] == arg1) {
                this.field7324[this.field7321--] = null;
                arg1.method94((byte) -128);
                if (~this.field7321 <= -1) {
                    this.field7317 = this.field7322 = this.field7324[this.field7321];
                    this.field7317.method95(-95);
                } else {
                    this.field7317 = this.field7322 = null;
                }
            } else {
                throw new RuntimeException();
            }
        } else {
            this.method2978(!arg0, arg1);
            this.method2936(arg1, (byte) 116);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBI)V")
    public final synchronized void method2932(int arg0, byte arg1, int arg2) {
        if (arg1 >= 88) {
            ++field7299;
            class254 var4 = new class254(arg2);
            var4.field7060 = (long) arg0;
            this.field7330.method2657(8492, var4);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZZ)V")
    public final void method2933(boolean arg0, boolean arg1) {
        if (arg1) {
            this.field7378 = -1.3546721F;
        }
        ++field7133;
        if (arg0 == !this.field7380) {
            this.field7380 = arg0;
            this.method2974(70);
            this.field7427 &= -32;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
    public final void method389(int arg0) {
        ++field7224;
        this.method2943(1);
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(II)V")
    public final void method348(int arg0, int arg1) {
        ++field7300;
        if (this.field7434 != arg0 || this.field7355 != arg1) {
            this.field7434 = arg0;
            this.field7355 = arg1;
            this.method2927((byte) -111);
            this.method2996(9354);
            if (~this.field7343 == -4) {
                this.method2980(false);
                return;
            }
            if (~this.field7343 != -3) {
                return;
            }
            this.method2958(-20);
        }
    }

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "()Z")
    public final boolean method323() {
        ++field7136;
        return this.field7383 && (!this.method327() || this.field7439);
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(II)I")
    public final int method2934(int arg0, int arg1) {
        ++field7271;
        if (arg1 != 5121 && arg1 != 5120) {
            if (~arg1 != -5124 && arg1 != 5122) {
                int var3 = -91 / ((-34 - arg0) / 40);
                if (~arg1 != -5126 && ~arg1 != -5125 && arg1 != 5126) {
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

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BII)V")
    public final void method2935(byte arg0, int arg1, int arg2) {
        ++field7164;
        if (~this.field7394 == -1) {
            boolean var4 = false;
            if (this.field7407 != arg2) {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                this.field7407 = arg2;
                var4 = true;
            }
            if (~this.field7388 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                var4 = true;
                this.field7388 = arg1;
            }
            if (var4) {
                this.field7427 &= -30;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg2);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        }
        if (arg0 != 87) {
            this.method300(78, (class145) null, -119, -77);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIILta;II)V")
    public final void method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class145 arg6, int arg7, int arg8) {
        ++field7212;
        class198 var10 = (class198) arg6;
        class102 var11 = var10.field2811;
        this.method2930((byte) -80);
        this.method2968(var10.field2811, -100);
        this.method2967(arg5, 127);
        this.method2935((byte) 87, 8448, 7681);
        this.method2969(0, 4611, 34167, 768);
        float var12 = var11.field1354 / (float) var11.field1350;
        float var13 = var11.field1351 / (float) var11.field1349;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method2969(0, 4611, 5890, 768);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(Lub;B)V")
    public final void method2936(class18 arg0, byte arg1) {
        ++field7253;
        if (arg1 <= 96) {
            this.field7433 = true;
        }
        if (~this.field7318 <= -1 && this.field7323[this.field7318] == arg0) {
            this.field7323[this.field7318--] = null;
            arg0.method93(-6068);
            if (~this.field7318 <= -1) {
                this.field7322 = this.field7323[this.field7318];
                this.field7322.method97(14638);
            } else {
                this.field7322 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lik;Z)V")
    public final void method2937(class142 arg0, boolean arg1) {
        if (this.field7364 != arg0) {
            if (this.field7339) {
                OpenGL.glBindBufferARB(34963, arg0.method456(arg1));
            }
            this.field7364 = arg0;
        }
        ++field7228;
        if (arg1) {
            this.method2975((byte[]) null, true, -108, 113, 77);
        }
    }

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "()Z")
    public final boolean method284() {
        ++field7276;
        return false;
    }

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "()Z")
    public final boolean method322() {
        ++field7177;
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "(I)V")
    public final void method2938(int arg0) {
        if (arg0 != 0) {
            this.field7458 = null;
        }
        ++field7119;
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lff;Lff;ILff;Lff;)V")
    public final void method2939(class9 arg0, class9 arg1, int arg2, class9 arg3, class9 arg4) {
        if (arg4 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method2961(arg4.field133, true);
            OpenGL.glVertexPointer(arg4.field134, arg4.field136, this.field7347.method468(true), this.field7347.method463(-17751) - -((long) arg4.field137));
            OpenGL.glEnableClientState(32884);
        }
        ++field7129;
        if (arg2 != 16063) {
            this.field7353 = 0.8326749F;
        }
        if (arg1 != null) {
            this.method2961(arg1.field133, true);
            OpenGL.glNormalPointer(arg1.field136, this.field7347.method468(true), this.field7347.method463(-17751) - -((long) arg1.field137));
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg3 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method2961(arg3.field133, true);
            OpenGL.glColorPointer(arg3.field134, arg3.field136, this.field7347.method468(true), this.field7347.method463(-17751) + (long) arg3.field137);
            OpenGL.glEnableClientState(32886);
        }
        if (arg0 != null) {
            this.method2961(arg0.field133, true);
            OpenGL.glTexCoordPointer(arg0.field134, arg0.field136, this.field7347.method468(true), this.field7347.method463(-17751) + (long) arg0.field137);
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)V")
    public final void method2940(int arg0, byte arg1) {
        if (this.field7394 != arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field7394 = arg0;
        }
        ++field7247;
        if (arg1 < 83) {
            this.method2916(-97, -20, -33, 6);
        }
    }

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "(I)V")
    private final void method2941(int arg0) {
        this.method2995(-2, (byte) -124);
        ++field7248;
        for (int var2 = this.field7354 + -1; ~var2 <= -1; --var2) {
            this.method2940(var2, (byte) 117);
            this.method2968((class478) null, -62);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        if (arg0 >= -45) {
            this.field7455 = -66;
        }
        this.method2935((byte) 87, 8448, 8448);
        this.method2969(2, 4611, 34168, 770);
        this.method2991(-999);
        this.field7429 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field7435 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field7368 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field7338 = true;
        this.method2977(-48, true);
        this.method2962(1, true);
        this.method2926(true, (byte) -86);
        this.method2933(true, false);
        this.method2945(-113);
        this.field7246.setSwapInterval(0);
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
        this.field7336 = this.field7369 = -1;
        this.method295();
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IBI)V")
    public final void method2942(int arg0, byte arg1, int arg2) {
        ++field7231;
        this.field7342 = arg0;
        this.field7402 = arg2;
        this.method2925((byte) -120);
        int var4 = -33 / ((75 - arg1) / 47);
        this.method2949(true);
    }

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "(I)V")
    private final void method2943(int arg0) {
        if (arg0 == 1) {
            ++field7165;
            this.field7246.detach();
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[Lls;)V")
    public final void method352(int arg0, class95[] arg1) {
        ++field7199;
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field7375[var3] = arg1[var3];
        }
        this.field7358 = arg0;
        if (this.field7343 != 1) {
            this.method2971(88);
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIIIII)V")
    public final void method288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7138;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        this.method2944(-70);
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method2967(arg5, 125);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7383) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7383) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "(I)V")
    private final void method2944(int arg0) {
        if (arg0 >= -25) {
            this.method343((int[]) null);
        }
        ++field7184;
        if (~this.field7427 != -2) {
            this.method2992(0);
            this.method2977(-65, false);
            this.method2962(1, false);
            this.method2926(false, (byte) -81);
            this.method2933(false, false);
            this.method2968((class478) null, -114);
            this.method2995(-2, (byte) -128);
            this.method2999(1, 61);
            this.field7427 = 1;
        }
    }

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "(I)V")
    public final void method2945(int arg0) {
        if (~this.field7343 != -1) {
            this.field7427 &= -32;
            this.field7343 = 0;
        }
        if (arg0 < -79) {
            ++field7154;
        }
    }

    @OriginalMember(owner = "client!ih", name = "IA", descriptor = "(IIIII)V")
    public final void method376(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7139;
        this.method2944(-38);
        this.method2967(arg4, 122);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "(I)V")
    public final void method347(int arg0) {
        ++field7159;
        this.method2967(0, 96);
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZJ)V")
    public final synchronized void method2946(boolean arg0, long arg1) {
        if (!arg0) {
            this.method354();
        }
        ++field7274;
        class498 var4 = new class498();
        var4.field7060 = arg1;
        this.field7334.method2657(8492, var4);
    }

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "(III[I)V")
    public final void method305(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7278;
        float var5 = (float) arg2 * this.field7360.field4069 + (float) arg0 * this.field7360.field4079 + (float) arg1 * this.field7360.field4061 + this.field7360.field4091;
        if (!(var5 < (float) this.field7434) && !(var5 > (float) this.field7355)) {
            int var6 = (int) (((float) arg2 * this.field7360.field4084 + (float) arg0 * this.field7360.field4062 + (float) arg1 * this.field7360.field4068 + this.field7360.field4059) * (float) this.field7410 / var5);
            int var7 = (int) (((float) arg2 * this.field7360.field4088 + (float) arg0 * this.field7360.field4082 + (float) arg1 * this.field7360.field4078 + this.field7360.field4077) * (float) this.field7400 / var5);
            if (this.field7356 <= (float) var6 && (float) var6 <= this.field7377 && this.field7399 <= (float) var7 && this.field7367 >= (float) var7) {
                arg3[0] = (int) ((float) var6 + -this.field7356);
                arg3[1] = (int) ((float) var7 - this.field7399);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([Le;Lc;[Lwp;I)V")
    public final void method298(class377[] arg0, class125 arg1, class122[] arg2, int arg3) {
        ++field7286;
        for (int var5 = 0; ~arg0.length < ~var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method1566(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(III)V")
    public final synchronized void method2947(int arg0, int arg1, int arg2) {
        if (arg0 <= 32) {
            this.field7226 = null;
        }
        ++field7287;
        class254 var4 = new class254(arg2);
        var4.field7060 = (long) arg1;
        this.field7329.method2657(8492, var4);
    }

    @OriginalMember(owner = "client!ih", name = "ra", descriptor = "(ILta;II)V")
    public final void method300(int arg0, class145 arg1, int arg2, int arg3) {
        ++field7168;
        class198 var5 = (class198) arg1;
        class102 var6 = var5.field2811;
        this.method2930((byte) -120);
        this.method2968(var5.field2811, -49);
        this.method2967(1, 95);
        this.method2935((byte) 87, 8448, 7681);
        this.method2969(0, 4611, 34167, 768);
        float var7 = var6.field1354 / (float) var6.field1350;
        float var8 = var6.field1351 / (float) var6.field1349;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7419) * var7, (float) (-arg3 + this.field7440) * var8);
        OpenGL.glVertex2i(this.field7419, this.field7440);
        OpenGL.glTexCoord2f((float) (this.field7419 - arg2) * var7, (float) (-arg3 + this.field7348) * var8);
        OpenGL.glVertex2i(this.field7419, this.field7348);
        OpenGL.glTexCoord2f((float) (this.field7423 - arg2) * var7, (float) (-arg3 + this.field7348) * var8);
        OpenGL.glVertex2i(this.field7423, this.field7348);
        OpenGL.glTexCoord2f((float) (this.field7423 - arg2) * var7, (float) (this.field7440 - arg3) * var8);
        OpenGL.glVertex2i(this.field7423, this.field7440);
        OpenGL.glEnd();
        this.method2969(0, 4611, 5890, 768);
    }

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "()V")
    public final void method374() {
        ++field7131;
        this.field7303.method2029(1);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZZIZ)V")
    public final void method2948(boolean arg0, boolean arg1, int arg2, boolean arg3) {
        ++field7142;
        if (!arg1) {
            this.method2979(20);
        }
        if (this.field7413 != arg2) {
            if (~arg2 > -1) {
                this.method2991(-999);
                this.method2968((class478) null, -112);
                this.method2999(0, 110);
                if (!this.field7438) {
                    this.field7296.method1106(arg0, arg3, 0, 0, 0, -74);
                }
            } else {
                class417 var5 = this.field7291.method2404(-82, arg2);
                class222 var6 = super.field4246.method83(arg2, 98);
                if (~var6.field3192 == -1 && ~var6.field3207 == -1) {
                    this.method2991(-999);
                } else {
                    int var7 = var6.field3186 ? 64 : 128;
                    int var8 = var7 * 50;
                    this.method2960(-108, (float) (this.field7313 % var8 * var6.field3207) / (float) var8, (float) (this.field7313 % var8 * var6.field3192) / (float) var8, 0.0F);
                }
                if (this.field7438) {
                    this.method2968(var5, -125);
                    this.method2999(var6.field3203, 112);
                } else {
                    this.field7296.method1106(arg0, arg3, var6.field3195, var6.field3197, var6.field3208, -85);
                    if (!this.field7296.method1104((byte) 34, var6.field3203, var5)) {
                        this.method2968(var5, -67);
                        this.method2999(var6.field3203, 73);
                    }
                }
            }
            this.field7413 = arg2;
        }
        this.field7427 &= -8;
    }

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "(IIIIII[BII)V")
    public final void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field7262;
        float var10;
        float var11;
        if (this.field7430 != null && this.field7430.field5869 >= arg2 && ~this.field7430.field5873 <= ~arg3) {
            this.field7430.method2470(0, arg3, false, 0, false, arg6, 0, 6406, arg2, 0);
            var10 = (float) arg3 * this.field7430.field1351 / (float) this.field7430.field5873;
            var11 = (float) arg2 * this.field7430.field1354 / (float) this.field7430.field5869;
        } else {
            this.field7430 = class418.method2477(this, arg2, 6406, arg3, false, false, 6406, arg6);
            this.field7430.method2467(19, false, false);
            var10 = this.field7430.field1351;
            var11 = this.field7430.field1354;
        }
        this.method2930((byte) -90);
        this.method2968(this.field7430, -118);
        this.method2967(arg8, 80);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2997(arg5, (byte) -107);
        this.method2935((byte) 87, 34165, 34165);
        this.method2969(0, 4611, 34166, 768);
        this.method2969(2, 4611, 5890, 770);
        this.method2956(770, 34166, 0, (byte) 55);
        this.method2956(770, 5890, 2, (byte) 55);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var11);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var10, var11);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var10, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method2969(0, 4611, 5890, 768);
        this.method2969(2, 4611, 34166, 770);
        this.method2956(770, 5890, 0, (byte) 55);
        this.method2956(770, 34166, 2, (byte) 55);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(Z)V")
    public final void method297(boolean arg0) {
        this.field7411 = arg0;
        ++field7105;
        this.method2974(87);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([Le;Lsj;Lc;[Lwp;I)V")
    public final void method310(class377[] arg0, class324 arg1, class125 arg2, class122[] arg3, int arg4) {
        ++field7203;
        this.method298(arg0, arg2, arg3, arg4);
        this.method359(arg1);
    }

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "(III)V")
    public final void method318(int arg0, int arg1, int arg2) {
        if (~this.field7369 != ~arg0 || ~this.field7445 != ~arg1 || ~this.field7421 != ~arg2) {
            this.field7421 = arg2;
            this.field7445 = arg1;
            this.field7369 = arg0;
            if (!this.field7438) {
                this.method2996(9354);
                this.method2959(true);
            }
        }
        ++field7280;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(Z)V")
    private final void method2949(boolean arg0) {
        if (arg0) {
            if (~this.field7419 >= ~this.field7423 && this.field7348 >= this.field7440) {
                OpenGL.glScissor(this.field7419 + this.field7342, this.field7402 - -this.field7259 + -this.field7348, -this.field7419 + this.field7423, -this.field7440 + this.field7348);
            } else {
                OpenGL.glScissor(0, 0, 0, 0);
            }
            ++field7118;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)V")
    public final void method2950(int arg0, boolean arg1) {
        ++field7195;
        if (arg0 == 1) {
            if (!arg1 != !this.field7389) {
                this.field7389 = arg1;
                this.method2920((byte) -85);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "(I)V")
    private final void method2951(int arg0) {
        if (this.field7372 != 0.0F) {
            float var2 = this.field7395 / (this.field7395 + this.field7372);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field7417 * (1.0F - var2) / this.field7372;
            this.field7371[14] = this.field7417 * var3;
            this.field7371[10] = this.field7443 + var4;
        } else {
            this.field7371[14] = this.field7417;
            this.field7371[10] = this.field7443;
        }
        ++field7174;
        this.field7353 = (this.field7371[14] + (float) (-this.field7355)) / this.field7371[10];
        this.field7376 = (float) this.field7355 - this.field7372;
        int var5 = 126 % ((-72 - arg0) / 47);
    }

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "(I)V")
    private final void method2952(int arg0) {
        ++field7220;
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field7360.method1725(120), arg0);
        if (this.field7438) {
            this.field7296.field2537.method978(3);
        }
        this.method2981(true);
        this.method2971(123);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lhf;B)V")
    public final void method2953(class275 arg0, byte arg1) {
        int var3 = 84 % ((arg1 - 81) / 32);
        ++field7284;
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg0.method1725(-107), 0);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)I")
    public final int method302(int arg0, int arg1) {
        ++field7149;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lud;)V")
    public final void method311(class27 arg0) {
        this.field7391 = (class3) arg0;
        ++field7130;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ldd;Z)Lo;")
    public final class24 method312(class506 arg0, boolean arg1) {
        ++field7269;
        int[] var3 = new int[arg0.field7495 * arg0.field7489];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field7493 == null) {
            for (int var6 = 0; ~var6 > ~arg0.field7489; ++var6) {
                for (int var7 = 0; ~arg0.field7495 < ~var7; ++var7) {
                    int var8 = arg0.field7496[arg0.field7490[var4++] & 255];
                    var3[var5++] = var8 == 0 ? 0 : class170.method1067(var8, -16777216);
                }
            }
        } else {
            for (int var9 = 0; var9 < arg0.field7489; ++var9) {
                for (int var11 = 0; var11 < arg0.field7495; ++var11) {
                    var3[var5++] = class170.method1067(arg0.field7493[var4] << 24, arg0.field7496[class239.method1507(255, arg0.field7490[var4])]);
                    ++var4;
                }
            }
        }
        class24 var10 = this.method344(var3, 0, arg0.field7495, arg0.field7495, arg0.field7489);
        var10.method152(arg0.field7497, arg0.field7492, arg0.field7491, arg0.field7494);
        return var10;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(FFFFI)V")
    public final void method2954(float arg0, float arg1, float arg2, float arg3, int arg4) {
        class403.field5705[3] = arg2;
        class403.field5705[0] = arg0;
        class403.field5705[2] = arg3;
        class403.field5705[arg4] = arg1;
        ++field7232;
        OpenGL.glTexEnvfv(8960, 8705, class403.field5705, 0);
    }

    @OriginalMember(owner = "client!ih", name = "HA", descriptor = "(IIII)V")
    public final void method346(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < this.field7348) {
            this.field7348 = arg3;
        }
        ++field7233;
        if (~this.field7423 < ~arg2) {
            this.field7423 = arg2;
        }
        if (~arg1 < ~this.field7440) {
            this.field7440 = arg1;
        }
        if (arg0 > this.field7419) {
            this.field7419 = arg0;
        }
        OpenGL.glEnable(3089);
        this.method2964(4);
        this.method2949(true);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIF)Lls;")
    public final class95 method380(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field7216;
        return new class261(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "(I)V")
    public final void method2955(int arg0) {
        if (~this.field7427 != -17) {
            this.method2918((byte) 111);
            this.method2977(-126, true);
            this.method2926(true, (byte) -93);
            this.method2933(true, false);
            this.method2967(1, arg0 + 87);
            this.method2999(0, arg0 ^ 109);
            this.field7427 = 16;
        }
        if (arg0 == 16) {
            ++field7239;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIB)V")
    public final void method2956(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 55) {
            this.field7444 = -1.7809669F;
        }
        ++field7128;
        OpenGL.glTexEnvi(8960, 34184 - -arg2, arg1);
        OpenGL.glTexEnvi(8960, arg2 + 34200, arg0);
    }

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "(I)V")
    private final void method2957(int arg0) {
        ++field7161;
        if (arg0 >= 71) {
            if (~this.field7343 != -3) {
                this.field7343 = 2;
                this.method2958(-108);
                this.method2952(0);
                this.field7427 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "(I)V")
    private final void method2958(int arg0) {
        OpenGL.glMatrixMode(5889);
        if (arg0 >= -6) {
            this.method354();
        }
        ++field7143;
        OpenGL.glLoadMatrixf(this.field7371, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "()F")
    public final float method386() {
        ++field7134;
        return this.field7395;
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
    public final void method306(int arg0) {
        ++field7251;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(Z)V")
    private final void method2959(boolean arg0) {
        if (this.field7401 && this.field7438 | this.field7445 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0) {
            ++field7167;
        }
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "()Z")
    public final boolean method364() {
        ++field7207;
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IFFF)V")
    private final void method2960(int arg0, float arg1, float arg2, float arg3) {
        OpenGL.glMatrixMode(5890);
        ++field7263;
        if (this.field7365) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg2, arg1, arg3);
        if (arg0 >= -24) {
            this.method2996(49);
        }
        OpenGL.glMatrixMode(5888);
        this.field7365 = true;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ltg;Z)V")
    public final void method2961(class157 arg0, boolean arg1) {
        ++field7126;
        if (this.field7347 != arg0) {
            if (this.field7339) {
                OpenGL.glBindBufferARB(34962, arg0.method465(10278));
            }
            this.field7347 = arg0;
        }
        if (!arg1) {
            this.field7449 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IZ)V")
    public final void method2962(int arg0, boolean arg1) {
        if (this.field7387 != arg1) {
            this.field7387 = arg1;
            this.method2920((byte) -85);
            this.field7427 &= -8;
        }
        if (arg0 == 1) {
            ++field7256;
        }
    }

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "(I)V")
    private final void method2963(int arg0) {
        ++field7123;
        if (arg0 != 0) {
            this.method317();
        }
        if (this.field7226 != null) {
            Dimension var2 = this.field7226.getSize();
            this.field7175 = var2.width;
            this.field7183 = var2.height;
        } else {
            this.field7175 = this.field7183 = 0;
        }
        if (this.field7322 == null) {
            this.field7259 = this.field7183;
            this.field7255 = this.field7175;
            this.method2925((byte) 111);
        }
        this.method2945(-88);
        this.method295();
    }

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "()V")
    public final void method354() {
        ++field7125;
    }

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "(I)V")
    private final void method2964(int arg0) {
        ++field7160;
        this.field7367 = (float) (-this.field7359 + this.field7348);
        this.field7399 = (float) (-this.field7359 + this.field7440);
        this.field7377 = (float) (-this.field7396 + this.field7423);
        this.field7356 = (float) (this.field7419 - this.field7396);
        if (arg0 != 4) {
            this.method2941(25);
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(BI)V")
    public static final void method2965(byte arg0, int arg1) {
        if (class280.field4141 == null || ~class280.field4141.length > ~arg1) {
            class280.field4141 = new int[arg1];
        }
        ++field7185;
        if (arg0 != -10) {
            field7304 = true;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILub;)V")
    public final void method2966(int arg0, class18 arg1) {
        ++field7209;
        if (~this.field7318 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field7318 <= -1) {
                this.field7323[this.field7318].method93(-6068);
            }
            int var3 = 33 % ((arg0 - -55) / 42);
            this.field7322 = this.field7323[++this.field7318] = arg1;
            this.field7322.method97(14638);
        }
    }

    @OriginalMember(owner = "client!ih", name = "JA", descriptor = "(F)V")
    public final void method299(float arg0) {
        ++field7152;
        if (this.field7344 != arg0) {
            this.field7344 = arg0;
            this.method2990((byte) -95);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method373(Rectangle[] arg0, int arg1) {
        this.method377();
        ++field7121;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method370(Canvas arg0) {
        ++field7187;
        if (this.field7257 == arg0) {
            throw new RuntimeException();
        } else if (this.field7140.containsKey(arg0)) {
            Long var2 = (Long) this.field7140.get(arg0);
            this.field7246.releaseSurface(arg0, var2);
            this.field7140.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIII)V")
    public final void method366(int arg0, int arg1, int arg2, int arg3) {
        this.field7303.method2026(0, arg2, arg0, arg1, arg3);
        ++field7176;
    }

    @OriginalMember(owner = "client!ih", name = "GA", descriptor = "(IIII)V")
    public final void method390(int arg0, int arg1, int arg2, int arg3) {
        this.field7396 = arg0;
        ++field7238;
        this.field7359 = arg1;
        this.field7400 = arg3;
        this.field7410 = arg2;
        this.method2927((byte) -123);
        this.method2964(4);
        if (~this.field7343 == -4) {
            this.method2980(false);
        } else if (this.field7343 == 2) {
            this.method2958(-22);
        }
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(II)V")
    public final void method2967(int arg0, int arg1) {
        if (arg1 < 70) {
            this.method2998(-123, -111, (class142) null, 107, 24);
        }
        ++field7204;
        if (~this.field7429 != ~arg0) {
            boolean var3;
            boolean var4;
            byte var5;
            if (arg0 == 1) {
                var3 = true;
                var4 = true;
                var5 = 1;
            } else if (arg0 == 2) {
                var3 = false;
                var4 = true;
                var5 = 2;
            } else if (~arg0 != -129) {
                var4 = true;
                var5 = 0;
                var3 = false;
            } else {
                var3 = true;
                var4 = true;
                var5 = 3;
            }
            if (this.field7338 == !var4) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field7338 = var4;
            }
            if (this.field7368 != var3) {
                if (!var3) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field7368 = var3;
            }
            if (this.field7435 != var5) {
                if (var5 != 1) {
                    if (~var5 != -3) {
                        if (~var5 != -4) {
                            OpenGL.glDisable(3042);
                        } else {
                            OpenGL.glEnable(3042);
                            OpenGL.glBlendFunc(774, 1);
                        }
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field7435 = var5;
            }
            this.field7427 &= -29;
            this.field7429 = arg0;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II[I[I)Lta;")
    public final class145 method332(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field7178;
        return class197.method1245((byte) -35, arg2, arg3, arg1, this, arg0);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lsv;I)V")
    public final void method2968(class478 arg0, int arg1) {
        ++field7288;
        if (arg1 <= -36) {
            class478 var3 = this.field7404[this.field7394];
            if (arg0 != var3) {
                if (arg0 == null) {
                    OpenGL.glDisable(var3.field6667);
                } else {
                    if (var3 == null) {
                        OpenGL.glEnable(arg0.field6667);
                    } else if (~arg0.field6667 != ~var3.field6667) {
                        OpenGL.glDisable(var3.field6667);
                        OpenGL.glEnable(arg0.field6667);
                    }
                    OpenGL.glBindTexture(arg0.field6667, arg0.method2760(91));
                }
                this.field7404[this.field7394] = arg0;
            }
            this.field7427 &= -2;
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(IIII)V")
    public final void method2969(int arg0, int arg1, int arg2, int arg3) {
        ++field7240;
        if (arg1 != 4611) {
            this.field7341 = -0.9895136F;
        }
        OpenGL.glTexEnvi(8960, 34176 - -arg0, arg2);
        OpenGL.glTexEnvi(8960, arg0 + 34192, arg3);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(ILub;)V")
    public final void method2970(int arg0, class18 arg1) {
        ++field7192;
        if (arg0 != -257) {
            this.method376(-34, 112, -78, -66, -59);
        }
        if (this.field7320 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field7320 <= -1) {
                this.field7319[this.field7320].method92((byte) -40);
            }
            this.field7317 = this.field7319[++this.field7320] = arg1;
            this.field7317.method96((byte) -82);
        }
    }

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "(I)V")
    private final void method2971(int arg0) {
        if (arg0 <= 69) {
            this.field7319 = null;
        }
        ++field7272;
        int var2;
        for (var2 = 0; this.field7358 > var2; ++var2) {
            class95 var3 = this.field7375[var2];
            int var4 = 16386 - -var2;
            class150.field1998[0] = (float) var3.method672((byte) -41);
            class150.field1998[1] = (float) var3.method669((byte) 115);
            class150.field1998[2] = (float) var3.method673(10518);
            class150.field1998[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class150.field1998, 0);
            int var5 = var3.method671(0);
            float var6 = var3.method676(false) / 255.0F;
            class150.field1998[0] = (float) (class239.method1507(var5, 16721807) >> 16) * var6;
            class150.field1998[1] = (float) class239.method1507(var5 >> 8, 255) * var6;
            class150.field1998[2] = var6 * (float) class239.method1507(var5, 255);
            OpenGL.glLightfv(var4, 4609, class150.field1998, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method675((byte) 66) * var3.method675((byte) 27)));
            OpenGL.glEnable(var4);
        }
        while (var2 < this.field7412) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        this.field7412 = this.field7358;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(III)V")
    public final synchronized void method2972(int arg0, int arg1, int arg2) {
        ++field7190;
        class254 var4 = new class254(arg0);
        var4.field7060 = (long) arg1;
        if (arg2 <= 2) {
            this.method2973(81, (class275) null);
        }
        this.field7332.method2657(8492, var4);
    }

    @OriginalMember(owner = "client!ih", name = "ya", descriptor = "(I)V")
    public final void method286(int arg0) {
        ++field7222;
        this.field7311 = 0;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field7311;
        }
        this.field7314 = 1 << this.field7311;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILhf;)V")
    public final void method2973(int arg0, class275 arg1) {
        ++field7227;
        OpenGL.glLoadMatrixf(arg1.method1725(96), 0);
        int var3 = 119 / ((arg0 - 59) / 46);
    }

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "(I)V")
    private final void method2974(int arg0) {
        if (arg0 <= 53) {
            this.method336(23, 44, -32, -117, -103, -23, 80, -126, -105, 37);
        }
        OpenGL.glDepthMask(this.field7380 && this.field7411);
        ++field7114;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([BZIII)Lik;")
    public final class142 method2975(byte[] arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field7120;
        if (arg3 != 0) {
            this.method386();
        }
        return (class142) (!this.field7339 || arg1 && !this.field7433 ? new class213(this, arg2, arg0, arg4) : new class54(this, arg2, arg0, arg4, arg1));
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZLoi;ZII)V")
    public static final void method2976(int arg0, boolean arg1, class53 arg2, boolean arg3, int arg4, int arg5) {
        class15.field189 = 1;
        class464.field6495 = arg5;
        ++field7147;
        class463.field6473 = 10000;
        class123.field1680 = arg4;
        class234.field3410 = arg2;
        class346.field5017 = arg3;
        if (arg1) {
            class102.field1358 = arg0;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(FFF)V")
    public final void method294(float arg0, float arg1, float arg2) {
        class107.field1436 = arg1;
        class207.field3001 = arg0;
        class137.field1803 = arg2;
        ++field7188;
    }

    @OriginalMember(owner = "client!ih", name = "ZA", descriptor = "(IIIII)V")
    public final void method328(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7104;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "(IIII)V")
    public final void method355(int arg0, int arg1, int arg2, int arg3) {
        this.field7438 = true;
        this.field7350 = arg1;
        ++field7169;
        this.field7403 = arg2;
        this.field7409 = arg0;
        this.field7382 = arg3;
        this.field7296.method1106(false, false, 0, 3, 0, -104);
        this.field7296.field2537.method978(3);
        this.method2996(9354);
        this.method2959(true);
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(IZ)V")
    public final void method2977(int arg0, boolean arg1) {
        if (this.field7401 != arg1) {
            this.field7401 = arg1;
            this.method2959(true);
            this.field7427 &= -32;
        }
        ++field7264;
        if (arg0 > -26) {
            this.field7360 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(ZLub;)V")
    public final void method2978(boolean arg0, class18 arg1) {
        ++field7285;
        if (~this.field7320 <= -1 && this.field7319[this.field7320] == arg1) {
            if (!arg0) {
                this.method2938(-91);
            }
            this.field7319[this.field7320--] = null;
            arg1.method92((byte) -40);
            if (this.field7320 < 0) {
                this.field7317 = null;
            } else {
                this.field7317 = this.field7319[this.field7320];
                this.field7317.method96((byte) -82);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field7290;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "()V")
    public final void method342() {
        ++field7110;
        for (class498 var1 = this.field7310.method2655(15152); var1 != null; var1 = this.field7310.method2660((byte) 67)) {
            ((class380) var1).method2210(19);
        }
        if (this.field7303 != null) {
            this.field7303.method2035((byte) 113);
        }
        if (this.field7246 != null) {
            this.method2943(1);
            Enumeration var2 = this.field7140.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field7140.get(var3);
                this.field7246.releaseSurface(var3, var4);
            }
            this.field7246.release();
            this.field7246 = null;
        }
        if (this.field7316) {
            class311.method1887(true, false, 0);
            this.field7316 = false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lud;Lud;FLud;)Lud;")
    public final class27 method351(class27 arg0, class27 arg1, float arg2, class27 arg3) {
        ++field7236;
        if (arg0 != null && arg1 != null && this.field7408 && this.field7432) {
            class147 var5 = null;
            class3 var6 = (class3) arg0;
            class3 var7 = (class3) arg1;
            class55 var8 = var6.method26(9907);
            class55 var9 = var7.method26(9907);
            if (var8 != null && var9 != null) {
                int var10 = ~var9.field695 <= ~var8.field695 ? var9.field695 : var8.field695;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class147) {
                    class147 var11 = (class147) arg3;
                    if (~var10 == ~var11.method922(115)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class147(this, var10);
                }
                if (var5.method920(var8, var9, arg2, -12163)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "(I)V")
    public final void method2979(int arg0) {
        if (arg0 == -11597) {
            if (~this.field7427 != -5) {
                this.method2992(0);
                this.method2977(arg0 ^ 11575, false);
                this.method2962(1, false);
                this.method2926(false, (byte) -127);
                this.method2933(false, false);
                this.method2995(-2, (byte) 26);
                this.method2967(1, 88);
                this.method2999(0, 86);
                this.field7427 = 4;
            }
            ++field7283;
        }
    }

    @OriginalMember(owner = "client!ih", name = "ma", descriptor = "(IIIII)V")
    public final void method387(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2944(-97);
        ++field7170;
        this.method2967(arg4, 115);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ih", name = "sa", descriptor = "(IIII)[I")
    public final int[] method321(int arg0, int arg1, int arg2, int arg3) {
        ++field7254;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + this.field7259 + -arg1, arg2, 1, 32993, this.field7442, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(Z)V")
    private final void method2980(boolean arg0) {
        ++field7148;
        float var2 = (float) (-this.field7396) * this.field7378 / (float) this.field7410;
        float var3 = (float) (-this.field7359) * this.field7378 / (float) this.field7400;
        if (!arg0) {
            float var4 = (float) (-this.field7396 + this.field7255) * this.field7378 / (float) this.field7410;
            float var5 = (float) (-this.field7359 + this.field7259) * this.field7378 / (float) this.field7400;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (var2 != var4 && var3 != var5) {
                OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field7434 - this.field7372), (double) ((float) this.field7355 + -this.field7372));
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "()Lc;")
    public final class125 method368() {
        ++field7146;
        return this.field7306;
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(Z)V")
    public final void method2981(boolean arg0) {
        if (arg0) {
            ++field7223;
            OpenGL.glLightfv(16384, 4611, this.field7374, 0);
            OpenGL.glLightfv(16385, 4611, this.field7450, 0);
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(Z)V")
    public final void method349(boolean arg0) {
        ++field7155;
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(B)Law;")
    public final class55 method2982(byte arg0) {
        if (arg0 != 65) {
            return null;
        } else {
            ++field7213;
            return this.field7391 != null ? this.field7391.method26(arg0 ^ 9970) : null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lul;[Ldd;Z)Lla;")
    public final class319 method313(class411 arg0, class506[] arg1, boolean arg2) {
        ++field7249;
        return new class65(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "(I)Ln;")
    public final class15 method379(int arg0) {
        ++field7189;
        class380 var2 = new class380(arg0);
        this.field7310.method2657(8492, var2);
        return var2;
    }

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "(I)V")
    private final void method2983(int arg0) {
        class403.field5705[1] = this.field7448 * this.field7415;
        class403.field5705[0] = this.field7448 * this.field7437;
        class403.field5705[2] = this.field7448 * this.field7341;
        class403.field5705[3] = 1.0F;
        ++field7282;
        OpenGL.glLightfv(16384, 4609, class403.field5705, 0);
        class403.field5705[1] = -this.field7414 * this.field7415;
        class403.field5705[0] = -this.field7414 * this.field7437;
        class403.field5705[3] = 1.0F;
        class403.field5705[2] = -this.field7414 * this.field7341;
        if (arg0 <= -29) {
            OpenGL.glLightfv(16385, 4609, class403.field5705, 0);
        }
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(B)V")
    private final void method2984(byte arg0) {
        ++field7108;
        this.field7360 = new class275();
        this.field7390 = new class275();
        this.field7404 = new class478[this.field7354];
        this.field7416 = new class417(this, 3553, 6408, 1, 1);
        new class417(this, 3553, 6408, 1, 1);
        new class417(this, 3553, 6408, 1, 1);
        this.field7422 = new class247(this);
        this.field7431 = new class247(this);
        this.field7418 = new class247(this);
        this.field7362 = new class247(this);
        this.field7335 = new class247(this);
        this.field7397 = new class247(this);
        int var2 = 82 / ((69 - arg0) / 56);
        this.field7452 = new class247(this);
        this.field7447 = new class247(this);
        this.field7406 = new class247(this);
        this.field7425 = new class247(this);
        if (this.field7432) {
            this.field7381 = new class146(this);
            new class146(this);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljaggl/memory/NativeBuffer;IZII)Ltg;")
    public final class157 method2985(NativeBuffer arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field7243;
        if (arg1 < 71) {
            this.field7322 = null;
        }
        return (class157) (!this.field7339 || arg2 && !this.field7433 ? new class257(this, arg3, arg0) : new class56(this, arg3, arg0, arg4, arg2));
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method289(Canvas arg0) {
        ++field7242;
        long var2 = 0L;
        if (arg0 != null && this.field7257 != arg0) {
            if (this.field7140.containsKey(arg0)) {
                Long var4 = (Long) this.field7140.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field7137;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field7246.surfaceResized(var2);
            if (this.field7226 == arg0) {
                this.method2963(0);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "()Z")
    public final boolean method339() {
        ++field7229;
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "()Z")
    public final boolean method372() {
        ++field7163;
        if (this.field7298 != null) {
            if (!this.field7298.method403(1)) {
                if (!this.field7303.method2033(0, this.field7298)) {
                    return false;
                }
                this.field7291.method2403((byte) 93);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "()Lc;")
    public final class125 method358() {
        ++field7194;
        return new class275();
    }

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "(IFFFFF)V")
    public final void method361(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field7179;
        boolean var7 = ~this.field7336 != ~arg0;
        if (var7 || this.field7448 != arg1 || this.field7414 != arg2) {
            this.field7336 = arg0;
            this.field7414 = arg2;
            this.field7448 = arg1;
            if (var7) {
                this.field7437 = (float) (this.field7336 & 16711680) / 1.671168E7F;
                this.field7415 = (float) (65280 & this.field7336) / 65280.0F;
                this.field7341 = (float) (255 & this.field7336) / 255.0F;
                this.method2990((byte) -103);
            }
            this.method2983(-86);
        }
        if (this.field7441[0] != arg3 || this.field7441[1] != arg4 || this.field7441[2] != arg5) {
            this.field7441[2] = arg5;
            this.field7441[0] = arg3;
            this.field7441[1] = arg4;
            this.field7420[2] = -arg5;
            this.field7420[1] = -arg4;
            this.field7420[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field7374[0] = arg3 * var8;
            this.field7374[2] = arg5 * var8;
            this.field7374[1] = arg4 * var8;
            this.field7450[0] = -this.field7374[0];
            this.field7450[2] = -this.field7374[2];
            this.field7450[1] = -this.field7374[1];
            this.method2981(true);
            this.field7349 = (int) (arg5 * 256.0F / arg4);
            this.field7398 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "()V")
    public final void method341() {
        this.method2933(true, false);
        ++field7109;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V")
    public final void method385(boolean arg0) {
        ++field7157;
    }

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "(I)V")
    public final void method2986(int arg0) {
        ++field7115;
        if (this.field7427 != 8) {
            this.method2957(78);
            this.method2977(-52, true);
            this.method2926(true, (byte) -107);
            this.method2933(true, false);
            this.method2967(1, 83);
            this.method2999(0, 73);
            this.field7427 = 8;
        }
        int var2 = 68 / ((-53 - arg0) / 33);
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method334(Canvas arg0) {
        ++field7106;
        if (this.field7257 == arg0) {
            throw new RuntimeException();
        } else if (!this.field7140.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field7246.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field7140.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "SA", descriptor = "(Lc;)V")
    public final void method367(class125 arg0) {
        this.field7360 = (class275) arg0;
        ++field7297;
        this.field7390.method1733((byte) 106, this.field7360);
        if (this.field7343 != 1) {
            this.method2952(0);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)V")
    public final void method333(int arg0, int arg1, int arg2, int arg3) {
        ++field7145;
        if (!this.field7438) {
            throw new RuntimeException("");
        } else {
            this.field7403 = arg2;
            this.field7350 = arg1;
            this.field7382 = arg3;
            this.field7409 = arg0;
            this.field7296.field2537.method978(3);
            this.method2996(9354);
        }
    }

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "(I)I")
    private final int method2987(int arg0) {
        ++field7279;
        this.field7449 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field7370 = OpenGL.glGetString(arg0).toLowerCase();
        if (this.field7449.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field7449.indexOf("brian paul") != -1 || ~this.field7449.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class177.method1103(' ', var3.replace('.', ' '), 0);
        if (var4.length < 2) {
            var2 |= 4;
        } else {
            try {
                int var5 = class387.method2244(var4[0], 10);
                int var6 = class387.method2244(var4[1], arg0 + -7927);
                this.field7357 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (this.field7357 < 12) {
            var2 |= 2;
        }
        if (!this.field7246.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field7246.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field7354 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field7446 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field7345 = var7[0];
        if (this.field7354 < 2 || ~this.field7446 > -3 || this.field7345 < 2) {
            var2 |= 16;
        }
        this.field7340 = NativeStream.method2616();
        this.field7246.arePbuffersAvailable();
        this.field7339 = this.field7246.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field7383 = this.field7246.isExtensionAvailable("GL_ARB_multisample");
        this.field7351 = this.field7246.isExtensionAvailable("GL_ARB_vertex_program");
        this.field7246.isExtensionAvailable("GL_ARB_fragment_program");
        this.field7366 = this.field7246.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field7346 = this.field7246.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field7393 = this.field7246.isExtensionAvailable("GL_EXT_texture3D");
        this.field7428 = this.field7246.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field7408 = this.field7246.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field7337 = this.field7246.isExtensionAvailable("GL_ARB_texture_float");
        this.field7436 = false;
        this.field7432 = this.field7246.isExtensionAvailable("GL_EXT_framebuffer_object");
        this.field7363 = this.field7246.isExtensionAvailable("GL_EXT_framebuffer_blit");
        this.field7385 = this.field7246.isExtensionAvailable("GL_EXT_framebuffer_multisample");
        this.field7439 = this.field7385 & this.field7363;
        return ~var2 != -1 ? var2 : 0;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lsj;)V")
    public final void method359(class324 arg0) {
        ++field7230;
        this.field7301.method3171(arg0, 362631032, this);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BFF)V")
    public final void method2988(byte arg0, float arg1, float arg2) {
        if (arg0 < -102) {
            ++field7237;
            this.field7392 = arg2;
            this.field7379 = arg1;
            if (!this.field7438) {
                this.method2996(9354);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "(I)V")
    private final void method2989(int arg0) {
        ++field7217;
        int var2 = arg0;
        while (!this.field7246.attach()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class52.method411(1000L, (byte) 114);
        }
    }

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "()Z")
    public final boolean method369() {
        ++field7182;
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "(B)V")
    private final void method2990(byte arg0) {
        if (arg0 >= -74) {
            this.field7338 = true;
        }
        class403.field5705[0] = this.field7437 * this.field7344;
        class403.field5705[2] = this.field7344 * this.field7341;
        ++field7293;
        class403.field5705[1] = this.field7415 * this.field7344;
        class403.field5705[3] = 1.0F;
        OpenGL.glLightModelfv(2899, class403.field5705, 0);
    }

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "()Z")
    public final boolean method308() {
        ++field7112;
        return this.field7296.method1105(3, (byte) 1);
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(IIIIII)Lud;")
    public final class27 method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7244;
        return !this.field7408 ? null : new class292(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "(I)V")
    private final void method2991(int arg0) {
        ++field7200;
        if (this.field7365) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field7365 = false;
        }
        if (arg0 != -999) {
            this.field7361 = false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "()Z")
    public final boolean method327() {
        ++field7205;
        return this.field7298 != null && this.field7298.method403(1);
    }

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "(I)V")
    private final void method2992(int arg0) {
        if (arg0 != 0) {
            this.method2945(-24);
        }
        if (~this.field7343 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field7255 > 0 && this.field7259 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field7255, (double) this.field7259, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field7343 = 1;
            this.field7427 &= -25;
        }
        ++field7153;
    }

    @OriginalMember(owner = "client!ih", name = "OA", descriptor = "()I")
    public final int method392() {
        ++field7127;
        int var1 = this.field7454;
        this.field7454 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "()V")
    public final void method292() {
        if (this.field7298 != null && this.field7298.method403(1)) {
            this.field7303.method2027(this.field7298, -16642);
            this.field7291.method2403((byte) 93);
        }
        ++field7171;
    }

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "(B)V")
    public static void method2993(byte arg0) {
        field7308 = null;
        field7221 = null;
        field7124 = null;
        if (arg0 < 89) {
            field7304 = true;
        }
        field7294 = null;
        field7309 = null;
        field7202 = null;
    }

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "(IIIIII)V")
    public final void method325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7245;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method2944(-26);
        float var10 = (float) arg3 + var8;
        this.method2967(arg5, 90);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7383) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7383) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(IIIIII)V")
    public final void method340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7144;
        this.method2944(-128);
        this.method2967(arg5, 85);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method285(Canvas arg0) {
        ++field7201;
        this.field7226 = null;
        this.field7273 = 0L;
        if (arg0 != null && this.field7257 != arg0) {
            if (this.field7140.containsKey(arg0)) {
                Long var2 = (Long) this.field7140.get(arg0);
                this.field7273 = var2;
                this.field7226 = arg0;
            }
        } else {
            this.field7273 = this.field7137;
            this.field7226 = this.field7257;
        }
        if (this.field7226 != null && ~this.field7273 != -1L) {
            this.field7246.setSurface(this.field7273);
            this.method2963(0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(BI)I")
    public final int method2994(byte arg0, int arg1) {
        ++field7225;
        if (arg0 > -87) {
            this.method364();
        }
        if (arg1 == 1) {
            return 7681;
        } else if (~arg1 != -1) {
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

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ln;)V")
    public final void method356(class15 arg0) {
        this.field7312 = ((class380) arg0).field5368;
        ++field7265;
        if (this.field7373 == null) {
            class141 var2 = new class141(80);
            if (this.field7340) {
                var2.method886(0, -1.0F);
                var2.method886(0, -1.0F);
                var2.method886(0, 0.0F);
                var2.method886(0, 0.0F);
                var2.method886(0, 1.0F);
                var2.method886(0, 1.0F);
                var2.method886(0, -1.0F);
                var2.method886(0, 0.0F);
                var2.method886(0, 1.0F);
                var2.method886(0, 1.0F);
                var2.method886(0, 1.0F);
                var2.method886(0, 1.0F);
                var2.method886(0, 0.0F);
                var2.method886(0, 1.0F);
                var2.method886(0, 0.0F);
                var2.method886(0, -1.0F);
                var2.method886(0, 1.0F);
                var2.method886(0, 0.0F);
                var2.method886(0, 0.0F);
                var2.method886(0, 0.0F);
            } else {
                var2.method882(-1491643256, -1.0F);
                var2.method882(-1491643256, -1.0F);
                var2.method882(-1491643256, 0.0F);
                var2.method882(-1491643256, 0.0F);
                var2.method882(-1491643256, 1.0F);
                var2.method882(-1491643256, 1.0F);
                var2.method882(-1491643256, -1.0F);
                var2.method882(-1491643256, 0.0F);
                var2.method882(-1491643256, 1.0F);
                var2.method882(-1491643256, 1.0F);
                var2.method882(-1491643256, 1.0F);
                var2.method882(-1491643256, 1.0F);
                var2.method882(-1491643256, 0.0F);
                var2.method882(-1491643256, 1.0F);
                var2.method882(-1491643256, 0.0F);
                var2.method882(-1491643256, -1.0F);
                var2.method882(-1491643256, 1.0F);
                var2.method882(-1491643256, 0.0F);
                var2.method882(-1491643256, 0.0F);
                var2.method882(-1491643256, 0.0F);
            }
            this.field7373 = this.method2923(20, false, 0, var2.field5665, var2.field5663);
            this.field7386 = new class9(this.field7373, 5126, 3, 0);
            this.field7352 = new class9(this.field7373, 5126, 2, 12);
            this.field7301.method3167(-69, this);
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IB)V")
    public final void method2995(int arg0, byte arg1) {
        this.method2924(arg0, true, (byte) -127);
        int var3 = 104 / ((-63 - arg1) / 57);
        ++field7166;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V")
    public final void method353(int arg0) {
        ++field7197;
        if (arg0 >= 128 && arg0 <= 1024) {
            this.field7295 = arg0;
            this.field7291.method2403((byte) 93);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ih", name = "aa", descriptor = "()F")
    public final float method388() {
        ++field7219;
        return this.field7372;
    }

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "(I)V")
    private final void method2996(int arg0) {
        ++field7151;
        if (arg0 != 9354) {
            this.method372();
        }
        int var2;
        if (!this.field7438) {
            this.field7444 = (float) (-this.field7421 + this.field7355) - this.field7379;
            this.field7405 = this.field7444 - (float) this.field7445 * this.field7392;
            if (this.field7405 < (float) this.field7434) {
                this.field7405 = (float) this.field7434;
            }
            OpenGL.glFogf(2915, this.field7405);
            OpenGL.glFogf(2916, this.field7444);
            var2 = this.field7369;
        } else {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field7350;
        }
        class403.field5705[2] = (float) class239.method1507(var2, 255) / 255.0F;
        class403.field5705[1] = (float) class239.method1507(65280, var2) / 65280.0F;
        class403.field5705[0] = (float) class239.method1507(16711680, var2) / 1.671168E7F;
        OpenGL.glFogfv(2918, class403.field5705, 0);
        if (this.field7438) {
            this.field7296.field2537.method977((byte) -62);
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(IB)V")
    public final void method2997(int arg0, byte arg1) {
        class403.field5705[0] = (float) class239.method1507(arg0, 16711680) / 1.671168E7F;
        ++field7260;
        class403.field5705[3] = (float) (arg0 >>> 24) / 255.0F;
        int var3 = 24 / ((47 - arg1) / 37);
        class403.field5705[2] = (float) class239.method1507(arg0, 255) / 255.0F;
        class403.field5705[1] = (float) class239.method1507(arg0, 65280) / 65280.0F;
        OpenGL.glTexEnvfv(8960, 8705, class403.field5705, 0);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIII)V")
    public final void method331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7141;
        OpenGL.glLineWidth((float) arg5);
        this.method340(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "()Z")
    public final boolean method326() {
        ++field7117;
        return false;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)I")
    public final int method324(int arg0, int arg1) {
        ++field7268;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(ILjava/awt/Canvas;Ll;ILnt;)V")
    public class503(int arg0, Canvas arg1, class16 arg2, int arg3, class151 arg4) {
        super(arg0, arg2);
        new class358();
        new class406(16);
        this.field7325 = new class455();
        this.field7329 = new class455();
        this.field7330 = new class455();
        this.field7331 = new class455();
        this.field7332 = new class455();
        this.field7333 = new class455();
        this.field7334 = new class455();
        this.field7348 = 0;
        this.field7369 = -1;
        this.field7371 = new float[16];
        this.field7359 = 0;
        this.field7375 = new class95[class342.field4971];
        this.field7353 = 3584.0F;
        this.field7376 = 3584.0F;
        this.field7396 = 0;
        this.field7350 = -1;
        this.field7388 = 8448;
        this.field7392 = 1.0F;
        this.field7407 = 8448;
        this.field7400 = 512;
        this.field7382 = 0;
        this.field7410 = 512;
        this.field7342 = 0;
        this.field7402 = 0;
        this.field7355 = 3584;
        this.field7403 = -1;
        this.field7419 = 0;
        this.field7378 = 1.0F;
        this.field7421 = 0;
        this.field7415 = 1.0F;
        this.field7434 = 50;
        this.field7423 = 0;
        this.field7336 = -1;
        this.field7441 = new float[4];
        this.field7437 = 1.0F;
        this.field7420 = new float[4];
        this.field7395 = 3000.0F;
        this.field7341 = 1.0F;
        this.field7374 = new float[4];
        this.field7448 = -1.0F;
        this.field7445 = -1;
        this.field7379 = 0.0F;
        this.field7414 = -1.0F;
        this.field7411 = true;
        this.field7440 = 0;
        this.field7450 = new float[4];
        this.field7451 = new class141(8192);
        this.field7453 = new int[1];
        this.field7457 = new byte[16384];
        this.field7456 = new int[1];
        this.field7458 = new int[1];
        this.field7292 = arg3;
        this.field7226 = this.field7257 = arg1;
        try {
            if (class28.field338 == null || !class28.field338) {
                if (arg4 != null) {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (!var6.startsWith("mac")) {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method972(false, "jaggl.dll").toString());
                        } else {
                            System.load(arg4.method972(false, "libjaggl.jnilib").toString());
                        }
                    } else {
                        System.load(arg4.method972(false, "libjaggl.so").toString());
                    }
                    class28.field338 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class28.field338 = Boolean.TRUE;
                }
            }
            if (class28.field338 != null && class28.field338) {
                this.field7246 = new OpenGL();
                this.field7273 = this.field7137 = this.field7246.init(arg1, 8, 8, 8, 24, 0, this.field7292);
                if (~this.field7137 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method2989(0);
                    int var7 = this.method2987(7937);
                    if (var7 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field7442 = this.field7340 ? 33639 : 5121;
                        if (~this.field7370.indexOf("radeon") != 0) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class177.method1103(' ', this.field7370.replace('/', ' '), 0);
                            for (int var12 = 0; var12 < var11.length; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (~var13.length() < -1) {
                                        if (var13.charAt(0) == 'x' && var13.length() >= 3 && class165.method1047(var13.substring(1, 3), 146800640)) {
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
                                            if (~var13.length() <= -5 && class165.method1047(var13.substring(0, 4), 146800640)) {
                                                var8 = class387.method2244(var13.substring(0, 4), 10);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var9 || var8 < 4000) {
                                this.field7337 = false;
                            }
                            if (!var10 && !var9) {
                                if (var8 >= 7000 && ~var8 >= -9251) {
                                    this.field7393 = false;
                                }
                                if (~var8 <= -7001 && var8 <= 7999) {
                                    this.field7339 = false;
                                }
                            }
                            this.field7428 &= this.field7246.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field7433 = this.field7339;
                            this.field7361 = true;
                        }
                        if (this.field7449.indexOf("intel") != -1) {
                            this.field7432 = false;
                        }
                        this.field7424 = !this.field7449.equals("s3 graphics");
                        if (this.field7339) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        class108.method737(true, false, (byte) 126);
                        this.field7316 = true;
                        this.field7291 = new class405(this, super.field4246);
                        this.method2984((byte) 127);
                        this.field7315 = new class36(this);
                        this.field7303 = new class341(this);
                        if (this.field7303.method2032(false)) {
                            this.field7298 = new class308(this);
                            if (!this.field7298.method1867(116)) {
                                this.field7298.method402((byte) 72);
                                this.field7298 = null;
                            }
                        }
                        this.field7296 = new class177(this);
                        this.method2941(-124);
                        this.method2963(0);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field7246.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (var15++ > 5) {
                                    throw new RuntimeException("");
                                }
                                class52.method411(100L, (byte) 122);
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
            this.method342();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public final synchronized void method335(int arg0) {
        ++field7281;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field7329.method2661(-123)) {
            class254 var12 = (class254) this.field7329.method2654(-1);
            class479.field6676[var2++] = (int) var12.field7060;
            this.field7327 -= var12.field3757;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class479.field6676, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class479.field6676, 0);
            var2 = 0;
        }
        while (!this.field7330.method2661(-123)) {
            class254 var11 = (class254) this.field7330.method2654(-1);
            class479.field6676[var2++] = (int) var11.field7060;
            this.field7326 -= var11.field3757;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class479.field6676, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class479.field6676, 0);
            var2 = 0;
        }
        while (!this.field7331.method2661(-120)) {
            class254 var10 = (class254) this.field7331.method2654(-1);
            class479.field6676[var2++] = var10.field3757;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class479.field6676, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class479.field6676, 0);
            var2 = 0;
        }
        while (!this.field7332.method2661(-123)) {
            class254 var9 = (class254) this.field7332.method2654(-1);
            class479.field6676[var2++] = (int) var9.field7060;
            this.field7328 -= var9.field3757;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class479.field6676, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class479.field6676, 0);
            boolean var4 = false;
        }
        while (!this.field7325.method2661(-124)) {
            class254 var8 = (class254) this.field7325.method2654(-1);
            OpenGL.glDeleteLists((int) var8.field7060, var8.field3757);
        }
        while (!this.field7333.method2661(-118)) {
            class498 var7 = this.field7333.method2654(-1);
            OpenGL.glDeleteProgramARB((int) var7.field7060);
        }
        while (!this.field7334.method2661(-115)) {
            class498 var6 = this.field7334.method2654(-1);
            OpenGL.glDeleteObjectARB(var6.field7060);
        }
        while (!this.field7325.method2661(-124)) {
            class254 var5 = (class254) this.field7325.method2654(-1);
            OpenGL.glDeleteLists((int) var5.field7060, var5.field3757);
        }
        this.field7291.method2402(15082);
        if (this.method304() > 100663296 && class465.method2699((byte) 14) > this.field7384 + 60000L) {
            System.gc();
            this.field7384 = class465.method2699((byte) 14);
        }
        this.field7313 = var3;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lld;IIII)Le;")
    public final class377 method293(class117 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7302;
        return new class247(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "()Z")
    public final boolean method337() {
        ++field7214;
        return this.field7298 != null && (this.field7292 <= 1 || this.field7439);
    }

    @OriginalMember(owner = "client!ih", name = "da", descriptor = "(FF)V")
    public final void method365(float arg0, float arg1) {
        ++field7215;
        if (this.field7395 != arg0 || this.field7372 != arg1) {
            this.field7395 = arg0;
            this.field7372 = arg1;
            this.method2951(44);
            if (~this.field7343 == -4) {
                this.method2980(false);
                return;
            }
            if (~this.field7343 != -3) {
                return;
            }
            this.method2958(-92);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILik;II)V")
    public final void method2998(int arg0, int arg1, class142 arg2, int arg3, int arg4) {
        ++field7162;
        int var6 = arg2.method455(-31267);
        int var7 = arg0 * this.method2934(-109, var6);
        this.method2937(arg2, false);
        if (arg3 >= 66) {
            OpenGL.glDrawElements(arg1, arg4, var6, arg2.method452((byte) 104) - -((long) var7));
        }
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)V")
    public final void method375(int arg0) {
        ++field7267;
        this.method2989(0);
    }

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "(II)V")
    public final void method2999(int arg0, int arg1) {
        if (arg1 < 60) {
            this.method2948(true, false, -70, false);
        }
        ++field7198;
        if (~arg0 == -2) {
            this.method2935((byte) 87, 7681, 7681);
        } else if (~arg0 != -1) {
            if (arg0 == 2) {
                this.method2935((byte) 87, 7681, 34165);
            } else {
                if (~arg0 != -4) {
                    if (arg0 == 4) {
                        this.method2935((byte) 87, 34023, 34023);
                        return;
                    }
                } else {
                    this.method2935((byte) 87, 8448, 260);
                }
            }
        } else {
            this.method2935((byte) 87, 8448, 8448);
        }
    }
}
