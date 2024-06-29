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

@OriginalClass("client!ac")
public class class541 extends class60 {

    @OriginalMember(owner = "client!ac", name = "yc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field7420 = new Hashtable();

    @OriginalMember(owner = "client!ac", name = "ue", descriptor = "I")
    public int field7520 = 128;

    @OriginalMember(owner = "client!ac", name = "ye", descriptor = "Lvq;")
    private class463 field7524 = new class463();

    @OriginalMember(owner = "client!ac", name = "Ae", descriptor = "Lgca;")
    private class253 field7526 = new class253();

    @OriginalMember(owner = "client!ac", name = "Be", descriptor = "Lgca;")
    public class253 field7527 = new class253();

    @OriginalMember(owner = "client!ac", name = "De", descriptor = "I")
    public int field7529 = 8;

    @OriginalMember(owner = "client!ac", name = "Ce", descriptor = "Z")
    private boolean field7528 = false;

    @OriginalMember(owner = "client!ac", name = "Ee", descriptor = "I")
    public int field7530 = 3;

    @OriginalMember(owner = "client!ac", name = "Fe", descriptor = "Lkba;")
    private class108 field7531 = new class108();

    @OriginalMember(owner = "client!ac", name = "Le", descriptor = "[Lhg;")
    private class691[] field7537 = new class691[4];

    @OriginalMember(owner = "client!ac", name = "Oe", descriptor = "[Lhg;")
    private class691[] field7540 = new class691[4];

    @OriginalMember(owner = "client!ac", name = "Je", descriptor = "I")
    private int field7535 = -1;

    @OriginalMember(owner = "client!ac", name = "Me", descriptor = "I")
    private int field7538 = -1;

    @OriginalMember(owner = "client!ac", name = "Qe", descriptor = "I")
    private int field7542 = -1;

    @OriginalMember(owner = "client!ac", name = "Re", descriptor = "[Lhg;")
    private class691[] field7543 = new class691[4];

    @OriginalMember(owner = "client!ac", name = "Te", descriptor = "Lkba;")
    private class108 field7545;

    @OriginalMember(owner = "client!ac", name = "Xe", descriptor = "Lkba;")
    private class108 field7549;

    @OriginalMember(owner = "client!ac", name = "Ye", descriptor = "Lkba;")
    private class108 field7550;

    @OriginalMember(owner = "client!ac", name = "Ze", descriptor = "Lkba;")
    private class108 field7551;

    @OriginalMember(owner = "client!ac", name = "af", descriptor = "Lkba;")
    private class108 field7552;

    @OriginalMember(owner = "client!ac", name = "bf", descriptor = "Lkba;")
    private class108 field7553;

    @OriginalMember(owner = "client!ac", name = "cf", descriptor = "Lkba;")
    private class108 field7554;

    @OriginalMember(owner = "client!ac", name = "hf", descriptor = "Lgca;")
    public class253 field7559;

    @OriginalMember(owner = "client!ac", name = "nf", descriptor = "Lgca;")
    public class253 field7564;

    @OriginalMember(owner = "client!ac", name = "of", descriptor = "Lgca;")
    public class253 field7565;

    @OriginalMember(owner = "client!ac", name = "Kf", descriptor = "F")
    private float field7587;

    @OriginalMember(owner = "client!ac", name = "Ef", descriptor = "I")
    private int field7581;

    @OriginalMember(owner = "client!ac", name = "ag", descriptor = "F")
    private float field7603;

    @OriginalMember(owner = "client!ac", name = "dg", descriptor = "I")
    private int field7606;

    @OriginalMember(owner = "client!ac", name = "Vf", descriptor = "I")
    private int field7598;

    @OriginalMember(owner = "client!ac", name = "qg", descriptor = "[Lcba;")
    private class551[] field7619;

    @OriginalMember(owner = "client!ac", name = "ig", descriptor = "F")
    private float field7611;

    @OriginalMember(owner = "client!ac", name = "Gf", descriptor = "[F")
    private float[] field7583;

    @OriginalMember(owner = "client!ac", name = "Xf", descriptor = "I")
    private int field7600;

    @OriginalMember(owner = "client!ac", name = "wg", descriptor = "I")
    private int field7625;

    @OriginalMember(owner = "client!ac", name = "Ag", descriptor = "[F")
    private float[] field7629;

    @OriginalMember(owner = "client!ac", name = "mg", descriptor = "I")
    public int field7615;

    @OriginalMember(owner = "client!ac", name = "ug", descriptor = "I")
    private int field7623;

    @OriginalMember(owner = "client!ac", name = "kg", descriptor = "I")
    private int field7613;

    @OriginalMember(owner = "client!ac", name = "pg", descriptor = "F")
    public float field7618;

    @OriginalMember(owner = "client!ac", name = "Fg", descriptor = "I")
    public int field7634;

    @OriginalMember(owner = "client!ac", name = "Jg", descriptor = "I")
    public int field7638;

    @OriginalMember(owner = "client!ac", name = "Rg", descriptor = "F")
    public float field7646;

    @OriginalMember(owner = "client!ac", name = "Lg", descriptor = "F")
    private float field7640;

    @OriginalMember(owner = "client!ac", name = "Pf", descriptor = "I")
    public int field7592;

    @OriginalMember(owner = "client!ac", name = "Cg", descriptor = "F")
    public float field7631;

    @OriginalMember(owner = "client!ac", name = "Wg", descriptor = "[F")
    private float[] field7651;

    @OriginalMember(owner = "client!ac", name = "eh", descriptor = "Z")
    private boolean field7659;

    @OriginalMember(owner = "client!ac", name = "Og", descriptor = "I")
    private int field7643;

    @OriginalMember(owner = "client!ac", name = "Nf", descriptor = "F")
    public float field7590;

    @OriginalMember(owner = "client!ac", name = "Ug", descriptor = "[F")
    public float[] field7649;

    @OriginalMember(owner = "client!ac", name = "lh", descriptor = "I")
    public int field7666;

    @OriginalMember(owner = "client!ac", name = "kh", descriptor = "I")
    public int field7665;

    @OriginalMember(owner = "client!ac", name = "Xg", descriptor = "I")
    public int field7652;

    @OriginalMember(owner = "client!ac", name = "cg", descriptor = "I")
    public int field7605;

    @OriginalMember(owner = "client!ac", name = "xg", descriptor = "I")
    private int field7626;

    @OriginalMember(owner = "client!ac", name = "ih", descriptor = "F")
    private float field7663;

    @OriginalMember(owner = "client!ac", name = "oh", descriptor = "F")
    public float field7669;

    @OriginalMember(owner = "client!ac", name = "Bg", descriptor = "I")
    public int field7630;

    @OriginalMember(owner = "client!ac", name = "jg", descriptor = "F")
    public float field7612;

    @OriginalMember(owner = "client!ac", name = "Pg", descriptor = "F")
    public float field7644;

    @OriginalMember(owner = "client!ac", name = "hh", descriptor = "I")
    public int field7662;

    @OriginalMember(owner = "client!ac", name = "th", descriptor = "[F")
    private float[] field7674;

    @OriginalMember(owner = "client!ac", name = "jh", descriptor = "I")
    public int field7664;

    @OriginalMember(owner = "client!ac", name = "rg", descriptor = "I")
    private int field7620;

    @OriginalMember(owner = "client!ac", name = "vh", descriptor = "Z")
    private boolean field7676;

    @OriginalMember(owner = "client!ac", name = "ch", descriptor = "Lvda;")
    public class183 field7657;

    @OriginalMember(owner = "client!ac", name = "yh", descriptor = "[I")
    public int[] field7679;

    @OriginalMember(owner = "client!ac", name = "zh", descriptor = "[B")
    public byte[] field7680;

    @OriginalMember(owner = "client!ac", name = "Ah", descriptor = "[I")
    public int[] field7681;

    @OriginalMember(owner = "client!ac", name = "Bh", descriptor = "[I")
    public int[] field7682;

    @OriginalMember(owner = "client!ac", name = "gc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7402;

    @OriginalMember(owner = "client!ac", name = "ob", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7358;

    @OriginalMember(owner = "client!ac", name = "ve", descriptor = "I")
    public int field7521;

    @OriginalMember(owner = "client!ac", name = "mb", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field7356;

    @OriginalMember(owner = "client!ac", name = "pe", descriptor = "J")
    private long field7515;

    @OriginalMember(owner = "client!ac", name = "Tb", descriptor = "J")
    private long field7389;

    @OriginalMember(owner = "client!ac", name = "fg", descriptor = "Z")
    public boolean field7608;

    @OriginalMember(owner = "client!ac", name = "Hg", descriptor = "I")
    public int field7636;

    @OriginalMember(owner = "client!ac", name = "lg", descriptor = "Ljava/lang/String;")
    private String field7614;

    @OriginalMember(owner = "client!ac", name = "Qg", descriptor = "Z")
    public boolean field7645;

    @OriginalMember(owner = "client!ac", name = "fh", descriptor = "Z")
    private boolean field7660;

    @OriginalMember(owner = "client!ac", name = "Rf", descriptor = "Z")
    public boolean field7594;

    @OriginalMember(owner = "client!ac", name = "Mf", descriptor = "Z")
    public boolean field7589;

    @OriginalMember(owner = "client!ac", name = "ph", descriptor = "Z")
    private boolean field7670;

    @OriginalMember(owner = "client!ac", name = "og", descriptor = "Z")
    public boolean field7617;

    @OriginalMember(owner = "client!ac", name = "Mg", descriptor = "Ljava/lang/String;")
    private String field7641;

    @OriginalMember(owner = "client!ac", name = "qh", descriptor = "Z")
    public boolean field7671;

    @OriginalMember(owner = "client!ac", name = "Vg", descriptor = "Z")
    private boolean field7650;

    @OriginalMember(owner = "client!ac", name = "te", descriptor = "Lvw;")
    private class307 field7519;

    @OriginalMember(owner = "client!ac", name = "He", descriptor = "Lhk;")
    public class104 field7533;

    @OriginalMember(owner = "client!ac", name = "xe", descriptor = "Lrm;")
    private class412 field7523;

    @OriginalMember(owner = "client!ac", name = "we", descriptor = "Lbw;")
    private class688 field7522;

    @OriginalMember(owner = "client!ac", name = "ze", descriptor = "Ldq;")
    private class698 field7525;

    @OriginalMember(owner = "client!ac", name = "nb", descriptor = "Lfha;")
    public static class382 field7357 = new class382(2, -1);

    @OriginalMember(owner = "client!ac", name = "qf", descriptor = "F")
    public float field7567;

    @OriginalMember(owner = "client!ac", name = "tf", descriptor = "F")
    public float field7570;

    @OriginalMember(owner = "client!ac", name = "yf", descriptor = "F")
    public float field7575;

    @OriginalMember(owner = "client!ac", name = "Ff", descriptor = "F")
    private float field7582;

    @OriginalMember(owner = "client!ac", name = "Of", descriptor = "F")
    private float field7591;

    @OriginalMember(owner = "client!ac", name = "vg", descriptor = "F")
    public float field7624;

    @OriginalMember(owner = "client!ac", name = "yg", descriptor = "F")
    private float field7627;

    @OriginalMember(owner = "client!ac", name = "Dg", descriptor = "F")
    public float field7632;

    @OriginalMember(owner = "client!ac", name = "Tg", descriptor = "F")
    public float field7648;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    private int field7315;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "I")
    public static int field7334;

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!ac", name = "W", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!ac", name = "X", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!ac", name = "Y", descriptor = "I")
    public static int field7342;

    @OriginalMember(owner = "client!ac", name = "Z", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!ac", name = "ab", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!ac", name = "bb", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!ac", name = "cb", descriptor = "I")
    public static int field7346;

    @OriginalMember(owner = "client!ac", name = "db", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!ac", name = "eb", descriptor = "I")
    public static int field7348;

    @OriginalMember(owner = "client!ac", name = "fb", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!ac", name = "gb", descriptor = "I")
    public static int field7350;

    @OriginalMember(owner = "client!ac", name = "hb", descriptor = "I")
    public static int field7351;

    @OriginalMember(owner = "client!ac", name = "ib", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!ac", name = "jb", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!ac", name = "kb", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!ac", name = "lb", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!ac", name = "pb", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!ac", name = "qb", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!ac", name = "rb", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!ac", name = "sb", descriptor = "I")
    public static int field7362;

    @OriginalMember(owner = "client!ac", name = "tb", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!ac", name = "ub", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!ac", name = "vb", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!ac", name = "wb", descriptor = "I")
    public static int field7366;

    @OriginalMember(owner = "client!ac", name = "xb", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!ac", name = "yb", descriptor = "I")
    private int field7368;

    @OriginalMember(owner = "client!ac", name = "zb", descriptor = "I")
    public static int field7369;

    @OriginalMember(owner = "client!ac", name = "Ab", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!ac", name = "Bb", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!ac", name = "Cb", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!ac", name = "Db", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!ac", name = "Eb", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!ac", name = "Fb", descriptor = "I")
    public static int field7375;

    @OriginalMember(owner = "client!ac", name = "Gb", descriptor = "I")
    public static int field7376;

    @OriginalMember(owner = "client!ac", name = "Hb", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!ac", name = "Ib", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!ac", name = "Jb", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!ac", name = "Kb", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!ac", name = "Lb", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!ac", name = "Mb", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!ac", name = "Nb", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!ac", name = "Ob", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!ac", name = "Pb", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!ac", name = "Qb", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!ac", name = "Rb", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!ac", name = "Sb", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!ac", name = "Ub", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!ac", name = "Vb", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!ac", name = "Wb", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!ac", name = "Xb", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!ac", name = "Yb", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!ac", name = "Zb", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!ac", name = "ac", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!ac", name = "bc", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!ac", name = "cc", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!ac", name = "dc", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!ac", name = "ec", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!ac", name = "fc", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!ac", name = "hc", descriptor = "I")
    public static int field7403;

    @OriginalMember(owner = "client!ac", name = "ic", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!ac", name = "jc", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!ac", name = "kc", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!ac", name = "lc", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!ac", name = "mc", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!ac", name = "nc", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!ac", name = "oc", descriptor = "I")
    public int field7410;

    @OriginalMember(owner = "client!ac", name = "pc", descriptor = "I")
    public int field7411;

    @OriginalMember(owner = "client!ac", name = "qc", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!ac", name = "rc", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!ac", name = "sc", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!ac", name = "tc", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!ac", name = "uc", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!ac", name = "vc", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!ac", name = "wc", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!ac", name = "xc", descriptor = "I")
    public static int field7419;

    @OriginalMember(owner = "client!ac", name = "zc", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!ac", name = "Ac", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!ac", name = "Bc", descriptor = "I")
    public static int field7423;

    @OriginalMember(owner = "client!ac", name = "Cc", descriptor = "I")
    public static int field7424;

    @OriginalMember(owner = "client!ac", name = "Dc", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!ac", name = "Ec", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!ac", name = "Fc", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!ac", name = "Gc", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!ac", name = "Hc", descriptor = "I")
    public static int field7429;

    @OriginalMember(owner = "client!ac", name = "Ic", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!ac", name = "Jc", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!ac", name = "Kc", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!ac", name = "Lc", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!ac", name = "Mc", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!ac", name = "Nc", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!ac", name = "Oc", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!ac", name = "Pc", descriptor = "I")
    public static int field7437;

    @OriginalMember(owner = "client!ac", name = "Qc", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!ac", name = "Rc", descriptor = "I")
    public static int field7439;

    @OriginalMember(owner = "client!ac", name = "Sc", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!ac", name = "Tc", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!ac", name = "Uc", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!ac", name = "Vc", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!ac", name = "Wc", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!ac", name = "Xc", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!ac", name = "Yc", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!ac", name = "Zc", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!ac", name = "ad", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!ac", name = "bd", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!ac", name = "cd", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!ac", name = "dd", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!ac", name = "ed", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!ac", name = "fd", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!ac", name = "gd", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!ac", name = "hd", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!ac", name = "id", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!ac", name = "jd", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!ac", name = "kd", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!ac", name = "ld", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!ac", name = "md", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!ac", name = "nd", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!ac", name = "od", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!ac", name = "pd", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!ac", name = "qd", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!ac", name = "rd", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!ac", name = "sd", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!ac", name = "td", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!ac", name = "ud", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!ac", name = "vd", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!ac", name = "wd", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!ac", name = "xd", descriptor = "I")
    public static int field7471;

    @OriginalMember(owner = "client!ac", name = "yd", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!ac", name = "zd", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!ac", name = "Ad", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!ac", name = "Bd", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!ac", name = "Cd", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!ac", name = "Dd", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!ac", name = "Ed", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!ac", name = "Fd", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!ac", name = "Gd", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!ac", name = "Hd", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!ac", name = "Id", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!ac", name = "Jd", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!ac", name = "Kd", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!ac", name = "Ld", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!ac", name = "Md", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!ac", name = "Nd", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!ac", name = "Od", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!ac", name = "Pd", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!ac", name = "Qd", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!ac", name = "Rd", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!ac", name = "Sd", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!ac", name = "Td", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!ac", name = "Ud", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!ac", name = "Vd", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!ac", name = "Wd", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!ac", name = "Xd", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!ac", name = "Yd", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!ac", name = "Zd", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!ac", name = "ae", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!ac", name = "be", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!ac", name = "ce", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!ac", name = "de", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!ac", name = "ee", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!ac", name = "fe", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!ac", name = "ge", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!ac", name = "he", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!ac", name = "ie", descriptor = "I")
    public static int field7508;

    @OriginalMember(owner = "client!ac", name = "je", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!ac", name = "ke", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!ac", name = "le", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!ac", name = "me", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!ac", name = "ne", descriptor = "I")
    public static int field7513;

    @OriginalMember(owner = "client!ac", name = "oe", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!ac", name = "qe", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!ac", name = "re", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!ac", name = "se", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!ac", name = "Ge", descriptor = "I")
    public int field7532;

    @OriginalMember(owner = "client!ac", name = "Ue", descriptor = "I")
    private int field7546;

    @OriginalMember(owner = "client!ac", name = "Ve", descriptor = "I")
    public int field7547;

    @OriginalMember(owner = "client!ac", name = "We", descriptor = "I")
    public int field7548;

    @OriginalMember(owner = "client!ac", name = "df", descriptor = "I")
    private int field7555;

    @OriginalMember(owner = "client!ac", name = "gf", descriptor = "I")
    private int field7558;

    @OriginalMember(owner = "client!ac", name = "kf", descriptor = "I")
    private int field7561;

    @OriginalMember(owner = "client!ac", name = "rf", descriptor = "I")
    private int field7568;

    @OriginalMember(owner = "client!ac", name = "wf", descriptor = "I")
    public int field7573;

    @OriginalMember(owner = "client!ac", name = "Cf", descriptor = "I")
    private int field7579;

    @OriginalMember(owner = "client!ac", name = "Lf", descriptor = "I")
    public int field7588;

    @OriginalMember(owner = "client!ac", name = "Sf", descriptor = "I")
    private int field7595;

    @OriginalMember(owner = "client!ac", name = "Tf", descriptor = "I")
    private int field7596;

    @OriginalMember(owner = "client!ac", name = "Yf", descriptor = "I")
    private int field7601;

    @OriginalMember(owner = "client!ac", name = "gg", descriptor = "I")
    public int field7609;

    @OriginalMember(owner = "client!ac", name = "sg", descriptor = "I")
    public int field7621;

    @OriginalMember(owner = "client!ac", name = "tg", descriptor = "I")
    private int field7622;

    @OriginalMember(owner = "client!ac", name = "zg", descriptor = "I")
    private int field7628;

    @OriginalMember(owner = "client!ac", name = "bh", descriptor = "I")
    private int field7656;

    @OriginalMember(owner = "client!ac", name = "wh", descriptor = "I")
    private int field7677;

    @OriginalMember(owner = "client!ac", name = "xh", descriptor = "I")
    private int field7678;

    @OriginalMember(owner = "client!ac", name = "lf", descriptor = "J")
    private long field7562;

    @OriginalMember(owner = "client!ac", name = "Pe", descriptor = "Lol;")
    private class286 field7541;

    @OriginalMember(owner = "client!ac", name = "Se", descriptor = "Lrr;")
    private class365 field7544;

    @OriginalMember(owner = "client!ac", name = "xf", descriptor = "Lrr;")
    public class365 field7574;

    @OriginalMember(owner = "client!ac", name = "pf", descriptor = "Lln;")
    public class381 field7566;

    @OriginalMember(owner = "client!ac", name = "vf", descriptor = "Lln;")
    public class381 field7572;

    @OriginalMember(owner = "client!ac", name = "Df", descriptor = "Lln;")
    public class381 field7580;

    @OriginalMember(owner = "client!ac", name = "Qf", descriptor = "Lln;")
    public class381 field7593;

    @OriginalMember(owner = "client!ac", name = "Uf", descriptor = "Lln;")
    public class381 field7597;

    @OriginalMember(owner = "client!ac", name = "bg", descriptor = "Lln;")
    public class381 field7604;

    @OriginalMember(owner = "client!ac", name = "Kg", descriptor = "Lln;")
    public class381 field7639;

    @OriginalMember(owner = "client!ac", name = "mh", descriptor = "Lln;")
    public class381 field7667;

    @OriginalMember(owner = "client!ac", name = "rh", descriptor = "Lln;")
    public class381 field7672;

    @OriginalMember(owner = "client!ac", name = "sh", descriptor = "Lln;")
    public class381 field7673;

    @OriginalMember(owner = "client!ac", name = "zf", descriptor = "Lgk;")
    public class475 field7576;

    @OriginalMember(owner = "client!ac", name = "Sg", descriptor = "Lgk;")
    public class475 field7647;

    @OriginalMember(owner = "client!ac", name = "ah", descriptor = "Liaa;")
    private class495 field7655;

    @OriginalMember(owner = "client!ac", name = "sf", descriptor = "Laaa;")
    public class616 field7569;

    @OriginalMember(owner = "client!ac", name = "Zg", descriptor = "Lgo;")
    private class627 field7654;

    @OriginalMember(owner = "client!ac", name = "Ke", descriptor = "Lhg;")
    private class691 field7536;

    @OriginalMember(owner = "client!ac", name = "Ne", descriptor = "Lhg;")
    private class691 field7539;

    @OriginalMember(owner = "client!ac", name = "Yg", descriptor = "Ldw;")
    private class718 field7653;

    @OriginalMember(owner = "client!ac", name = "If", descriptor = "Lob;")
    private class738 field7585;

    @OriginalMember(owner = "client!ac", name = "uh", descriptor = "Lob;")
    private class738 field7675;

    @OriginalMember(owner = "client!ac", name = "Ie", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field7534;

    @OriginalMember(owner = "client!ac", name = "ef", descriptor = "Z")
    private boolean field7556;

    @OriginalMember(owner = "client!ac", name = "ff", descriptor = "Z")
    private boolean field7557;

    @OriginalMember(owner = "client!ac", name = "jf", descriptor = "Z")
    private boolean field7560;

    @OriginalMember(owner = "client!ac", name = "mf", descriptor = "Z")
    private boolean field7563;

    @OriginalMember(owner = "client!ac", name = "uf", descriptor = "Z")
    private boolean field7571;

    @OriginalMember(owner = "client!ac", name = "Af", descriptor = "Z")
    public boolean field7577;

    @OriginalMember(owner = "client!ac", name = "Bf", descriptor = "Z")
    public boolean field7578;

    @OriginalMember(owner = "client!ac", name = "Hf", descriptor = "Z")
    private boolean field7584;

    @OriginalMember(owner = "client!ac", name = "Jf", descriptor = "Z")
    public boolean field7586;

    @OriginalMember(owner = "client!ac", name = "Wf", descriptor = "Z")
    private boolean field7599;

    @OriginalMember(owner = "client!ac", name = "Zf", descriptor = "Z")
    public boolean field7602;

    @OriginalMember(owner = "client!ac", name = "hg", descriptor = "Z")
    public boolean field7610;

    @OriginalMember(owner = "client!ac", name = "ng", descriptor = "Z")
    private boolean field7616;

    @OriginalMember(owner = "client!ac", name = "Eg", descriptor = "Z")
    private boolean field7633;

    @OriginalMember(owner = "client!ac", name = "Gg", descriptor = "Z")
    public boolean field7635;

    @OriginalMember(owner = "client!ac", name = "Ig", descriptor = "Z")
    public boolean field7637;

    @OriginalMember(owner = "client!ac", name = "Ng", descriptor = "Z")
    public boolean field7642;

    @OriginalMember(owner = "client!ac", name = "dh", descriptor = "Z")
    public boolean field7658;

    @OriginalMember(owner = "client!ac", name = "gh", descriptor = "Z")
    private boolean field7661;

    @OriginalMember(owner = "client!ac", name = "nh", descriptor = "Z")
    private boolean field7668;

    @OriginalMember(owner = "client!ac", name = "eg", descriptor = "[Lcu;")
    private class221[] field7607;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V", line = 3)
    private final void method2969(int arg0) {
        if (this.field7668 && !this.field7616) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field7351;
        if (arg0 != 2896) {
            this.field7613 = -77;
        }
    }

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "(I)Lhw;", line = 19)
    public final class132 method2970(int arg0) {
        if (arg0 > -121) {
            return null;
        } else {
            ++field7367;
            return this.field7654 == null ? null : this.field7654.method145((byte) 121);
        }
    }

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "()V", line = 32)
    public final void method448() {
        ++field7324;
        if (this.field7650 && this.field7411 > 0 && this.field7410 > 0) {
            int var1 = this.field7581;
            int var2 = this.field7643;
            int var3 = this.field7613;
            int var4 = this.field7625;
            this.method406();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3010(29458);
            this.method2999(false, 6914);
            this.method2994(false, false);
            this.method3024(false, false);
            this.method3018((byte) -124, false);
            this.method3006(1, (class221) null);
            this.method2977(115, -2);
            this.method3039(260, 1);
            this.method3013((byte) -55, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field7411, this.field7410, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method426(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V", line = 76)
    private final void method2971(byte arg0) {
        ++field7400;
        if (this.field7581 <= this.field7643 && ~this.field7613 >= ~this.field7625) {
            OpenGL.glScissor(this.field7626 + this.field7581, -this.field7625 + this.field7620 - -this.field7410, -this.field7581 + this.field7643, this.field7625 - this.field7613);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        int var2 = -60 % ((arg0 - 26) / 53);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V", line = 91)
    public final void method2972(byte arg0) {
        ++field7450;
        if (arg0 >= -78) {
            this.field7595 = -7;
        }
        if (~this.field7561 != -3) {
            this.method3020((byte) -60);
            this.method2999(false, 6914);
            this.method2994(false, false);
            this.method3024(false, false);
            this.method3018((byte) -123, false);
            this.method2977(-81, -2);
            this.field7561 = 2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)V", line = 115)
    public final void method369(boolean arg0) {
        ++field7383;
    }

    @OriginalMember(owner = "client!ac", name = "JA", descriptor = "(IIIIII)I", line = 124)
    public final int method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7498;
        int var7 = 0;
        float var8 = (float) arg2 * this.field7559.field3252 + (float) arg0 * this.field7559.field3281 + (float) arg1 * this.field7559.field3257 + this.field7559.field3259;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field7559.field3252 + (float) arg3 * this.field7559.field3281 + (float) arg4 * this.field7559.field3257 + this.field7559.field3259;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field7615 > var8 && var9 < (float) this.field7615) {
            var7 |= 16;
        } else if (var8 > (float) this.field7600 && (float) this.field7600 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field7559.field3264 + (float) arg0 * this.field7559.field3287 + (float) arg1 * this.field7559.field3263 + this.field7559.field3253) * (float) this.field7630 / var8);
        int var11 = (int) (((float) arg5 * this.field7559.field3264 + (float) arg3 * this.field7559.field3287 + (float) arg4 * this.field7559.field3263 + this.field7559.field3253) * (float) this.field7630 / var9);
        if ((float) var10 < this.field7632 && this.field7632 > (float) var11) {
            var7 |= 1;
        } else if ((float) var10 > this.field7575 && this.field7575 < (float) var11) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field7559.field3288 + (float) arg0 * this.field7559.field3261 + (float) arg1 * this.field7559.field3255 + this.field7559.field3278) * (float) this.field7592 / var8);
        int var13 = (int) (((float) arg5 * this.field7559.field3288 + (float) arg3 * this.field7559.field3261 + (float) arg4 * this.field7559.field3255 + this.field7559.field3278) * (float) this.field7592 / var9);
        if ((float) var12 < this.field7570 && (float) var13 < this.field7570) {
            var7 |= 4;
        } else if ((float) var12 > this.field7648 && this.field7648 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "(ILaa;II)V", line = 177)
    public final void method365(int arg0, class487 arg1, int arg2, int arg3) {
        ++field7374;
        class24 var5 = (class24) arg1;
        class495 var6 = var5.field180;
        this.method2972((byte) -90);
        this.method3006(1, var5.field180);
        this.method3013((byte) -50, 1);
        this.method3042(8448, 8960, 7681);
        this.method2983(0, 768, 108, 34167);
        float var7 = var6.field6740 / (float) var6.field6742;
        float var8 = var6.field6744 / (float) var6.field6739;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7581) * var7, (float) (this.field7613 - arg3) * var8);
        OpenGL.glVertex2i(this.field7581, this.field7613);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7581) * var7, (float) (-arg3 + this.field7625) * var8);
        OpenGL.glVertex2i(this.field7581, this.field7625);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7643) * var7, (float) (-arg3 + this.field7625) * var8);
        OpenGL.glVertex2i(this.field7643, this.field7625);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7643) * var7, (float) (this.field7613 - arg3) * var8);
        OpenGL.glVertex2i(this.field7643, this.field7613);
        OpenGL.glEnd();
        this.method2983(0, 768, -65, 5890);
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(IIIIII)Ldi;", line = 209)
    public final class128 method424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7474;
        return !this.field7602 ? null : new class32(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ldw;I)V", line = 218)
    public final void method2973(class718 arg0, int arg1) {
        ++field7319;
        if (arg1 == 2936) {
            if (this.field7653 != arg0) {
                if (this.field7660) {
                    OpenGL.glBindBufferARB(34963, arg0.method3338(-22132));
                }
                this.field7653 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "()Z", line = 237)
    public final boolean method435() {
        ++field7320;
        return false;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lpf;)V", line = 245)
    public final void method452(class583 arg0) {
        ++field7341;
        this.field7524.method2576(arg0, -114, -1, this);
    }

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "()Z", line = 254)
    public final boolean method381() {
        ++field7472;
        return true;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(II)I", line = 265)
    public final int method396(int arg0, int arg1) {
        ++field7340;
        return arg0 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "(I)V", line = 273)
    public final void method2974(int arg0) {
        if (arg0 <= 125) {
            this.field7577 = false;
        }
        ++field7494;
        OpenGL.glLightfv(16384, 4611, this.field7649, 0);
        OpenGL.glLightfv(16385, 4611, this.field7674, 0);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lhg;I)V", line = 286)
    public final void method2975(class691 arg0, int arg1) {
        ++field7392;
        if (this.field7535 >= 0 && this.field7540[this.field7535] == arg0) {
            this.field7540[this.field7535--] = null;
            if (arg1 < 16) {
                this.field7601 = -56;
            }
            arg0.method2096(-27095);
            if (~this.field7535 <= -1) {
                this.field7536 = this.field7540[this.field7535];
                this.field7536.method2086((byte) 77);
            } else {
                this.field7536 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "(I)V", line = 310)
    private final void method2976(int arg0) {
        ++field7481;
        OpenGL.glLoadIdentity();
        OpenGL.glMultMatrixf(this.field7564.method1507(arg0 + -114), 0);
        if (this.field7659) {
            this.field7525.field9815.method2072((byte) 34);
        }
        this.method2974(127);
        this.method2985(103);
        if (arg0 != 4) {
            this.method422(-81, 96, 24, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "(III[I)V", line = 327)
    public final void method451(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7466;
        float var5 = (float) arg2 * this.field7559.field3252 + (float) arg0 * this.field7559.field3281 + (float) arg1 * this.field7559.field3257 + this.field7559.field3259;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field7559.field3264 + (float) arg0 * this.field7559.field3287 + (float) arg1 * this.field7559.field3263 + this.field7559.field3253) * (float) this.field7630 / var5);
            arg3[0] = (int) ((float) var6 + -this.field7632);
            int var7 = (int) (((float) arg2 * this.field7559.field3288 + (float) arg0 * this.field7559.field3261 + (float) arg1 * this.field7559.field3255 + this.field7559.field3278) * (float) this.field7592 / var5);
            arg3[1] = (int) ((float) var7 + -this.field7570);
            arg3[2] = (int) var5;
        }
    }

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "(I)V", line = 350)
    public final void method416(int arg0) {
        ++field7339;
    }

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "(II)V", line = 357)
    public final void method2977(int arg0, int arg1) {
        ++field7422;
        this.method3051(true, -109, arg1);
        int var3 = -68 / ((13 - arg0) / 32);
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(II)V", line = 369)
    public final void method349(int arg0, int arg1) {
        ++field7330;
        if (this.field7615 != arg0 || this.field7600 != arg1) {
            this.field7600 = arg1;
            this.field7615 = arg0;
            this.method2990(true);
            this.method2995((byte) -66);
            if (~this.field7596 != -4) {
                if (this.field7596 == 2) {
                    this.method3028((byte) -125);
                    return;
                }
            } else {
                this.method3027((byte) 56);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "la", descriptor = "()V", line = 398)
    public final void method406() {
        this.field7643 = this.field7411;
        this.field7581 = 0;
        ++field7414;
        this.field7613 = 0;
        this.field7625 = this.field7410;
        OpenGL.glDisable(3089);
        this.method3049(4353);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Lhg;I)V", line = 413)
    public final void method2978(class691 arg0, int arg1) {
        ++field7417;
        if (~this.field7538 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field7538 >= arg1) {
                this.field7537[this.field7538].method2093((byte) -30);
            }
            this.field7539 = this.field7537[++this.field7538] = arg0;
            this.field7539.method2092((byte) -120);
        }
    }

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "(III)V", line = 430)
    public final void method442(int arg0, int arg1, int arg2) {
        ++field7343;
        if (~this.field7666 != ~arg0 || ~this.field7652 != ~arg1 || this.field7638 != arg2) {
            this.field7666 = arg0;
            this.field7638 = arg2;
            this.field7652 = arg1;
            this.method2995((byte) -98);
            this.method3036(109);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "()Lhba;", line = 448)
    public final class10 method357() {
        ++field7386;
        return this.field7559;
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V", line = 457)
    public final void method390(int arg0) {
        ++field7396;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field7520 = arg0;
            this.field7519.method1858((byte) 100);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "(II)V", line = 470)
    public final void method358(int arg0, int arg1) {
        ++field7415;
    }

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "(I)V", line = 478)
    private final void method2979(int arg0) {
        ++field7372;
        if (arg0 != -513) {
            this.method363(-65, -25, -101, 48, -10, -24, -25);
        }
        this.field7356.method3529();
    }

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "()V", line = 497)
    public final void method388() {
        ++field7391;
        if (!this.field7671) {
            if (!this.field7599) {
                throw new RuntimeException("");
            }
            this.field7541.method662(0, 0, this.field7411, this.field7410, 0, 0);
            this.field7356.setSurface(this.field7389);
        } else {
            if (this.field7539 != this.field7544) {
                throw new RuntimeException();
            }
            this.field7544.method2094(0, true);
            this.field7544.method2094(8, true);
            this.method3050(this.field7544, -1);
        }
        this.field7541 = null;
        this.field7410 = this.field7315;
        this.field7411 = this.field7368;
        this.method3010(29458);
        this.method2987((byte) 60);
        this.method406();
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)V", line = 533)
    public final synchronized void method2980(byte arg0, int arg1) {
        ++field7482;
        if (arg0 <= -27) {
            class629 var3 = new class629(arg1);
            this.field7551.method725(var3, -20911);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZ)Lufa;", line = 546)
    public final class680 method338(int arg0, int arg1, boolean arg2) {
        ++field7377;
        return new class286(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ac", name = "na", descriptor = "(IIII)[I", line = 554)
    public final int[] method460(int arg0, int arg1, int arg2, int arg3) {
        ++field7445;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + -var6 + this.field7410, arg2, 1, 32993, this.field7636, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "([I)V", line = 576)
    public final void method398(int[] arg0) {
        arg0[0] = this.field7581;
        arg0[3] = this.field7625;
        ++field7493;
        arg0[2] = this.field7643;
        arg0[1] = this.field7613;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)Lku;", line = 590)
    public final class379 method343(int arg0, int arg1) {
        ++field7359;
        return null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[BIZI)Ldw;", line = 600)
    public final class718 method2981(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4) {
        ++field7390;
        if (arg2 != 7) {
            this.method439();
        }
        return (class718) (!this.field7660 || arg3 && !this.field7670 ? new class604(this, arg0, arg1, arg4) : new class702(this, arg0, arg1, arg4, arg3));
    }

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "(II)I", line = 617)
    public final int method2982(int arg0, int arg1) {
        ++field7436;
        if (~arg0 != arg1 && arg0 != 5120) {
            if (~arg0 != -5124 && ~arg0 != -5123) {
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

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)V", line = 637)
    public final void method395(int arg0) {
        ++field7503;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(IIII)V", line = 649)
    public final void method2983(int arg0, int arg1, int arg2, int arg3) {
        ++field7344;
        OpenGL.glTexEnvi(8960, arg0 + 34176, arg3);
        int var5 = -104 / ((14 - arg2) / 60);
        OpenGL.glTexEnvi(8960, arg0 + 34192, arg1);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lza;)V", line = 661)
    public final void method432(class416 arg0) {
        ++field7441;
        this.field7534 = ((class247) arg0).field3211;
        if (this.field7675 == null) {
            class183 var2 = new class183(80);
            if (!this.field7608) {
                var2.method1038((byte) -52, -1.0F);
                var2.method1038((byte) -52, -1.0F);
                var2.method1038((byte) -52, 0.0F);
                var2.method1038((byte) -52, 0.0F);
                var2.method1038((byte) -52, 1.0F);
                var2.method1038((byte) -52, 1.0F);
                var2.method1038((byte) -52, -1.0F);
                var2.method1038((byte) -52, 0.0F);
                var2.method1038((byte) -52, 1.0F);
                var2.method1038((byte) -52, 1.0F);
                var2.method1038((byte) -52, 1.0F);
                var2.method1038((byte) -52, 1.0F);
                var2.method1038((byte) -52, 0.0F);
                var2.method1038((byte) -52, 1.0F);
                var2.method1038((byte) -52, 0.0F);
                var2.method1038((byte) -52, -1.0F);
                var2.method1038((byte) -52, 1.0F);
                var2.method1038((byte) -52, 0.0F);
                var2.method1038((byte) -52, 0.0F);
                var2.method1038((byte) -52, 0.0F);
            } else {
                var2.method1037((byte) 72, -1.0F);
                var2.method1037((byte) -116, -1.0F);
                var2.method1037((byte) 74, 0.0F);
                var2.method1037((byte) 81, 0.0F);
                var2.method1037((byte) 82, 1.0F);
                var2.method1037((byte) 49, 1.0F);
                var2.method1037((byte) 103, -1.0F);
                var2.method1037((byte) -113, 0.0F);
                var2.method1037((byte) 21, 1.0F);
                var2.method1037((byte) -98, 1.0F);
                var2.method1037((byte) -116, 1.0F);
                var2.method1037((byte) 4, 1.0F);
                var2.method1037((byte) 83, 0.0F);
                var2.method1037((byte) -107, 1.0F);
                var2.method1037((byte) 22, 0.0F);
                var2.method1037((byte) -106, -1.0F);
                var2.method1037((byte) -96, 1.0F);
                var2.method1037((byte) 11, 0.0F);
                var2.method1037((byte) -105, 0.0F);
                var2.method1037((byte) -120, 0.0F);
            }
            this.field7675 = this.method3021(var2.field8520, false, 20, -54, var2.field8529);
            this.field7576 = new class475(this.field7675, 5126, 3, 0);
            this.field7647 = new class475(this.field7675, 5126, 2, 12);
            this.field7524.method2582(this, 196584);
        }
    }

    @OriginalMember(owner = "client!ac", name = "aa", descriptor = "(IIIIII)V", line = 726)
    public final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7354;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method3002(-24);
        float var10 = (float) arg3 + var8;
        this.method3013((byte) -30, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7571) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7571) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "(I)V", line = 758)
    public final void method2984(int arg0) {
        ++field7375;
        OpenGL.glPushMatrix();
        if (arg0 != 34167) {
            this.method2979(77);
        }
    }

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "(I)V", line = 769)
    private final void method2985(int arg0) {
        ++field7334;
        int var2;
        for (var2 = 0; this.field7595 > var2; ++var2) {
            class551 var3 = this.field7619[var2];
            int var4 = 16386 - -var2;
            class273.field3592[0] = (float) var3.method3130(7019);
            class273.field3592[1] = (float) var3.method3137((byte) 99);
            class273.field3592[2] = (float) var3.method3136(28699);
            class273.field3592[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class273.field3592, 0);
            int var5 = var3.method3135((byte) -78);
            float var6 = var3.method3131(false) / 255.0F;
            class273.field3592[1] = var6 * (float) (class321.method1919(var5, 65311) >> 8);
            class273.field3592[2] = (float) class321.method1919(var5, 255) * var6;
            class273.field3592[0] = var6 * (float) class321.method1919(255, var5 >> 16);
            OpenGL.glLightfv(var4, 4609, class273.field3592, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method3133(-76) * var3.method3133(-105)));
            OpenGL.glEnable(var4);
        }
        if (arg0 <= 13) {
            this.field7615 = -99;
        }
        while (var2 < this.field7622) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field7622 = this.field7595;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBLjaclib/memory/Buffer;ZI)Lob;", line = 816)
    public final class738 method2986(int arg0, byte arg1, Buffer arg2, boolean arg3, int arg4) {
        ++field7335;
        if (!this.field7660 || arg3 && !this.field7670) {
            return arg1 < 49 ? null : new class259(this, arg0, arg2);
        } else {
            return new class100(this, arg0, arg2, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V", line = 833)
    private final void method2987(byte arg0) {
        int var2 = 117 % ((-47 - arg0) / 49);
        ++field7331;
        OpenGL.glViewport(this.field7626, this.field7620, this.field7411, this.field7410);
    }

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "()Z", line = 845)
    public final boolean method457() {
        ++field7491;
        return true;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V", line = 853)
    public final void method429(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class353 {
        ++field7427;
        this.method373(arg2, arg3);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIII)V", line = 861)
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field7342;
        this.method412(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!ac", name = "DA", descriptor = "(IIII)V", line = 875)
    public final void method354(int arg0, int arg1, int arg2, int arg3) {
        this.field7605 = arg1;
        this.field7630 = arg2;
        this.field7662 = arg0;
        this.field7592 = arg3;
        ++field7444;
        this.method2990(true);
        this.method3049(4353);
        if (this.field7596 == 3) {
            this.method3027((byte) 121);
        } else if (~this.field7596 == -3) {
            this.method3028((byte) -127);
        }
    }

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "(II)V", line = 897)
    public final void method2988(int arg0, int arg1) {
        ++field7421;
        if (arg1 != 847872872) {
            this.method2988(108, -11);
        }
        if (this.field7628 != arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field7628 = arg0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "()I", line = 914)
    public final int method446() {
        ++field7346;
        int var1 = this.field7677;
        this.field7677 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V", line = 925)
    public final synchronized void method2989(int arg0, int arg1, int arg2) {
        ++field7465;
        class629 var4 = new class629(arg2);
        var4.field556 = (long) arg0;
        if (arg1 <= 36) {
            this.field7535 = -29;
        }
        this.field7552.method725(var4, -20911);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lci;Lku;)Lqp;", line = 940)
    public final class657 method443(class451 arg0, class379 arg1) {
        ++field7338;
        return null;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 948)
    public final void method399(Canvas arg0) {
        ++field7348;
        if (this.field7402 == arg0) {
            throw new RuntimeException();
        } else if (this.field7420.containsKey(arg0)) {
            Long var2 = (Long) this.field7420.get(arg0);
            this.field7356.releaseSurface(arg0, var2);
            this.field7420.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(Z)V", line = 969)
    private final void method2990(boolean arg0) {
        ++field7449;
        float[] var2 = this.field7651;
        if (!arg0) {
            this.method3023(42, (class691) null);
        }
        float var3 = (float) (-this.field7662 * this.field7615) / (float) this.field7630;
        float var4 = (float) ((-this.field7662 + this.field7411) * this.field7615) / (float) this.field7630;
        float var5 = (float) (this.field7615 * this.field7605) / (float) this.field7592;
        float var6 = (float) ((-this.field7410 + this.field7605) * this.field7615) / (float) this.field7592;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field7615 * 2.0F;
            var2[5] = var7 / (var5 - var6);
            var2[14] = this.field7627 = -((float) this.field7600 * var7) / (float) (this.field7600 - this.field7615);
            var2[11] = -1.0F;
            var2[1] = 0.0F;
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[0] = var7 / (var4 - var3);
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[3] = 0.0F;
            var2[4] = 0.0F;
            var2[12] = 0.0F;
            var2[7] = 0.0F;
            var2[15] = 0.0F;
            var2[10] = this.field7582 = (float) (-(this.field7615 + this.field7600)) / (float) (this.field7600 - this.field7615);
            var2[2] = 0.0F;
            var2[6] = 0.0F;
            var2[13] = 0.0F;
        } else {
            var2[6] = 0.0F;
            var2[4] = 0.0F;
            var2[14] = 0.0F;
            var2[15] = 1.0F;
            var2[0] = 1.0F;
            var2[9] = 0.0F;
            var2[2] = 0.0F;
            var2[8] = 0.0F;
            var2[10] = 1.0F;
            var2[12] = 0.0F;
            var2[7] = 0.0F;
            var2[11] = 0.0F;
            var2[3] = 0.0F;
            var2[5] = 1.0F;
            var2[13] = 0.0F;
            var2[1] = 0.0F;
        }
        this.method3037((byte) -104);
    }

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "(IIIIIII)I", line = 1033)
    public final int method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7428;
        float var8 = (float) arg2 * this.field7559.field3252 + (float) arg0 * this.field7559.field3281 + (float) arg1 * this.field7559.field3257 + this.field7559.field3259;
        float var9 = (float) arg5 * this.field7559.field3252 + (float) arg3 * this.field7559.field3281 + (float) arg4 * this.field7559.field3257 + this.field7559.field3259;
        int var10 = 0;
        if (var8 < (float) this.field7615 && (float) this.field7615 > var9) {
            var10 |= 16;
        } else if (var8 > (float) this.field7600 && var9 > (float) this.field7600) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field7559.field3264 + (float) arg0 * this.field7559.field3287 + (float) arg1 * this.field7559.field3263 + this.field7559.field3253) * (float) this.field7630 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field7559.field3264 + (float) arg3 * this.field7559.field3287 + (float) arg4 * this.field7559.field3263 + this.field7559.field3253) * (float) this.field7630 / (float) arg6);
        if ((float) var11 < this.field7632 && this.field7632 > (float) var12) {
            var10 |= 1;
        } else if (this.field7575 < (float) var11 && (float) var12 > this.field7575) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field7559.field3288 + (float) arg0 * this.field7559.field3261 + (float) arg1 * this.field7559.field3255 + this.field7559.field3278) * (float) this.field7592 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field7559.field3288 + (float) arg3 * this.field7559.field3261 + (float) arg4 * this.field7559.field3255 + this.field7559.field3278) * (float) this.field7592 / (float) arg6);
        if (this.field7570 > (float) var13 && (float) var14 < this.field7570) {
            var10 |= 4;
        } else if ((float) var13 > this.field7648 && this.field7648 < (float) var14) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(FZF)V", line = 1080)
    public final void method2991(float arg0, boolean arg1, float arg2) {
        this.field7603 = arg0;
        this.field7587 = arg2;
        if (!arg1) {
            this.field7547 = 110;
        }
        ++field7360;
        this.method2995((byte) -91);
    }

    @OriginalMember(owner = "client!ac", name = "da", descriptor = "(III[I)V", line = 1093)
    public final void method422(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7366;
        float var5 = (float) arg2 * this.field7559.field3252 + (float) arg0 * this.field7559.field3281 + (float) arg1 * this.field7559.field3257 + this.field7559.field3259;
        if (!((float) this.field7615 > var5) && !(var5 > (float) this.field7600)) {
            int var6 = (int) (((float) arg2 * this.field7559.field3264 + (float) arg0 * this.field7559.field3287 + (float) arg1 * this.field7559.field3263 + this.field7559.field3253) * (float) this.field7630 / var5);
            int var7 = (int) (((float) arg2 * this.field7559.field3288 + (float) arg0 * this.field7559.field3261 + (float) arg1 * this.field7559.field3255 + this.field7559.field3278) * (float) this.field7592 / var5);
            if ((float) var6 >= this.field7632 && this.field7575 >= (float) var6 && this.field7570 <= (float) var7 && this.field7648 >= (float) var7) {
                arg3[0] = (int) ((float) var6 - this.field7632);
                arg3[1] = (int) ((float) var7 + -this.field7570);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Llv;IIII)Lka;", line = 1124)
    public final class472 method407(class446 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7336;
        return new class381(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([I)V", line = 1133)
    public final void method420(int[] arg0) {
        arg0[0] = this.field7411;
        ++field7459;
        arg0[1] = this.field7410;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)I", line = 1145)
    private final int method2992(byte arg0) {
        ++field7458;
        int var2 = 0;
        this.field7641 = OpenGL.glGetString(7936).toLowerCase();
        this.field7614 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field7641.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (~this.field7641.indexOf("brian paul") != 0 || this.field7641.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class490.method2753(var3.replace('.', ' '), ' ', false);
        if (~var4.length > -3) {
            var2 |= 4;
        } else {
            try {
                int var5 = class436.method2477(127, var4[0]);
                int var6 = class436.method2477(-120, var4[1]);
                this.field7601 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (this.field7601 < 12) {
            var2 |= 2;
        }
        if (!this.field7356.method3530("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field7356.method3530("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field7621 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field7579 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field7656 = var7[0];
        if (this.field7621 < 2 || this.field7579 < 2 || ~this.field7656 > -3) {
            var2 |= 16;
        }
        if (arg0 >= -114) {
            return 25;
        } else {
            this.field7608 = Stream.method3786();
            this.field7599 = this.field7356.arePbuffersAvailable();
            this.field7660 = this.field7356.method3530("GL_ARB_vertex_buffer_object");
            this.field7571 = this.field7356.method3530("GL_ARB_multisample");
            this.field7642 = this.field7356.method3530("GL_ARB_vertex_program");
            this.field7356.method3530("GL_ARB_fragment_program");
            this.field7610 = this.field7356.method3530("GL_ARB_vertex_shader");
            this.field7658 = this.field7356.method3530("GL_ARB_fragment_shader");
            this.field7645 = this.field7356.method3530("GL_EXT_texture3D");
            this.field7589 = this.field7356.method3530("GL_ARB_texture_rectangle");
            this.field7602 = this.field7356.method3530("GL_ARB_texture_cube_map");
            this.field7594 = this.field7356.method3530("GL_ARB_texture_float");
            this.field7637 = false;
            this.field7671 = this.field7356.method3530("GL_EXT_framebuffer_object");
            this.field7586 = this.field7356.method3530("GL_EXT_framebuffer_blit");
            this.field7635 = this.field7356.method3530("GL_EXT_framebuffer_multisample");
            this.field7661 = this.field7586 & this.field7635;
            this.field7578 = class37.field385.startsWith("mac");
            OpenGL.glGetFloatv(2834, class131.field1689, 0);
            this.field7611 = class131.field1689[1];
            this.field7640 = class131.field1689[0];
            return var2 != 0 ? var2 : 0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(B)V", line = 1232)
    private final void method2993(byte arg0) {
        ++field7318;
        if (this.field7358 != null) {
            Dimension var2 = this.field7358.getSize();
            this.field7315 = var2.height;
            this.field7368 = var2.width;
        } else {
            this.field7368 = this.field7315 = 0;
        }
        if (this.field7539 == null) {
            this.field7411 = this.field7368;
            this.field7410 = this.field7315;
            this.method2987((byte) 113);
        }
        this.method3010(arg0 + 29489);
        if (arg0 == -31) {
            this.method406();
        }
    }

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "(IIII)V", line = 1262)
    public final void method385(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field7625 < ~arg3) {
            this.field7625 = arg3;
        }
        ++field7327;
        if (~arg0 < ~this.field7581) {
            this.field7581 = arg0;
        }
        if (this.field7643 > arg2) {
            this.field7643 = arg2;
        }
        if (~arg1 < ~this.field7613) {
            this.field7613 = arg1;
        }
        OpenGL.glEnable(3089);
        this.method3049(4353);
        this.method2971((byte) -118);
    }

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "(IIIII)V", line = 1289)
    public final void method347(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7418;
        this.method3002(-106);
        this.method3013((byte) -82, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)Lza;", line = 1309)
    public final class416 method371(int arg0) {
        ++field7337;
        class247 var2 = new class247(arg0);
        this.field7531.method725(var2, -20911);
        return var2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZZ)V", line = 1320)
    public final void method2994(boolean arg0, boolean arg1) {
        if (arg1) {
            this.method338(38, -93, true);
        }
        if (arg0 == !this.field7668) {
            this.field7668 = arg0;
            this.method2969(2896);
            this.field7561 &= -8;
        }
        ++field7431;
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(B)V", line = 1342)
    private final void method2995(byte arg0) {
        ++field7475;
        this.field7591 = (float) (this.field7600 - this.field7638) - this.field7587;
        this.field7567 = this.field7591 - (float) this.field7652 * this.field7603;
        if (this.field7567 < (float) this.field7615) {
            this.field7567 = (float) this.field7615;
        }
        if (arg0 >= -57) {
            this.field7556 = true;
        }
        OpenGL.glFogf(2915, this.field7567);
        OpenGL.glFogf(2916, this.field7591);
        class131.field1689[0] = (float) class321.method1919(this.field7666, 16711680) / 1.671168E7F;
        class131.field1689[2] = (float) class321.method1919(255, this.field7666) / 255.0F;
        class131.field1689[1] = (float) class321.method1919(this.field7666, 65280) / 65280.0F;
        OpenGL.glFogfv(2918, class131.field1689, 0);
    }

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "(I)V", line = 1365)
    public final synchronized void method430(int arg0) {
        ++field7371;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field7549.method726(-124)) {
            class629 var12 = (class629) this.field7549.method727(6494);
            class72.field776[var2++] = (int) var12.field556;
            this.field7547 -= var12.field8775;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class72.field776, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteBuffersARB(var2, class72.field776, 0);
            var2 = 0;
        }
        while (!this.field7550.method726(-125)) {
            class629 var11 = (class629) this.field7550.method727(6494);
            class72.field776[var2++] = (int) var11.field556;
            this.field7548 -= var11.field8775;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class72.field776, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class72.field776, 0);
            var2 = 0;
        }
        while (!this.field7551.method726(-124)) {
            class629 var10 = (class629) this.field7551.method727(6494);
            class72.field776[var2++] = var10.field8775;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class72.field776, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class72.field776, 0);
            var2 = 0;
        }
        while (!this.field7552.method726(-125)) {
            class629 var9 = (class629) this.field7552.method727(6494);
            class72.field776[var2++] = (int) var9.field556;
            this.field7546 -= var9.field8775;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class72.field776, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class72.field776, 0);
            boolean var4 = false;
        }
        while (!this.field7545.method726(-126)) {
            class629 var8 = (class629) this.field7545.method727(6494);
            OpenGL.glDeleteLists((int) var8.field556, var8.field8775);
        }
        while (!this.field7553.method726(-126)) {
            class55 var7 = this.field7553.method727(6494);
            OpenGL.glDeleteProgramARB((int) var7.field556);
        }
        while (!this.field7554.method726(-126)) {
            class55 var6 = this.field7554.method727(6494);
            OpenGL.glDeleteObjectARB(var6.field556);
        }
        while (!this.field7545.method726(-125)) {
            class629 var5 = (class629) this.field7545.method727(6494);
            OpenGL.glDeleteLists((int) var5.field556, var5.field8775);
        }
        this.field7519.method1857(0);
        if (this.method415() > 100663296 && this.field7562 + 60000L < class538.method2963(-47)) {
            System.gc();
            this.field7562 = class538.method2963(-47);
        }
        this.field7532 = var3;
    }

    @OriginalMember(owner = "client!ac", name = "KA", descriptor = "(IIII)V", line = 1530)
    public final void method426(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field7411 > ~arg2) {
            arg2 = this.field7411;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg3 > this.field7410) {
            arg3 = this.field7410;
        }
        ++field7381;
        this.field7625 = arg3;
        this.field7613 = arg1;
        this.field7581 = arg0;
        this.field7643 = arg2;
        OpenGL.glEnable(3089);
        this.method3049(4353);
        this.method2971((byte) 107);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(ILji;)V", line = 1559)
    public static final void method2996(int arg0, class611 arg1) {
        ++field7437;
        int var2 = arg1.method3396(arg0 + 1689622710);
        if (arg0 == 2) {
            class1.field8 = new class175[var2];
            for (int var3 = 0; ~var2 < ~var3; ++var3) {
                class1.field8[var3] = new class175();
                class1.field8[var3].field2160 = arg1.method3396(1689622712);
                class1.field8[var3].field2161 = arg1.method3422(arg0 ^ -3);
            }
            class159.field2005 = arg1.method3396(1689622712);
            class278.field3715 = arg1.method3396(1689622712);
            class725.field10129 = arg1.method3396(arg0 ^ 1689622714);
            class318.field4284 = new class695[-class159.field2005 + class278.field3715 + 1];
            for (int var4 = 0; class725.field10129 > var4; ++var4) {
                int var5 = arg1.method3396(1689622712);
                class695 var6 = class318.field4284[var5] = new class695();
                var6.field694 = arg1.method3428((byte) -111);
                var6.field695 = arg1.method3418(-2);
                var6.field9709 = var5 - -class159.field2005;
                var6.field9706 = arg1.method3422(-1);
                var6.field9712 = arg1.method3422(-1);
            }
            class348.field4627 = arg1.method3418(arg0 ^ -4);
            class314.field4239 = true;
        }
    }

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "(I)V", line = 1608)
    private final void method2997(int arg0) {
        ++field7349;
        int var2 = 0;
        while (!this.field7356.method3531()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            class267.method1599(0, 1000L);
        }
        if (arg0 > -25) {
            this.field7619 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "ZA", descriptor = "(IFFFFF)V", line = 1633)
    public final void method380(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field7408;
        boolean var7 = ~this.field7623 != ~arg0;
        if (var7 || this.field7646 != arg1 || this.field7618 != arg2) {
            this.field7623 = arg0;
            this.field7618 = arg2;
            this.field7646 = arg1;
            if (var7) {
                this.field7669 = (float) (this.field7623 & 255) / 255.0F;
                this.field7631 = (float) (this.field7623 & 65280) / 65280.0F;
                this.field7644 = (float) (16711680 & this.field7623) / 1.671168E7F;
                this.method3003((byte) -41);
            }
            this.method3043((byte) 90);
        }
        if (this.field7583[0] != arg3 || this.field7583[1] != arg4 || this.field7583[2] != arg5) {
            this.field7583[0] = arg3;
            this.field7583[1] = arg4;
            this.field7583[2] = arg5;
            this.field7629[0] = -arg3;
            this.field7629[2] = -arg5;
            this.field7629[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field7649[2] = arg5 * var8;
            this.field7649[0] = arg3 * var8;
            this.field7649[1] = arg4 * var8;
            this.field7674[1] = -this.field7649[1];
            this.field7674[2] = -this.field7649[2];
            this.field7674[0] = -this.field7649[0];
            this.method2974(127);
            this.field7588 = (int) (arg5 * 256.0F / arg4);
            this.field7609 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!ac", name = "XA", descriptor = "()I", line = 1682)
    public final int method356() {
        ++field7504;
        return this.field7600;
    }

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "()Z", line = 1691)
    public final boolean method450() {
        ++field7353;
        return true;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZJ)V", line = 1699)
    public final synchronized void method2998(boolean arg0, long arg1) {
        if (arg0) {
            this.method339((class657) null);
        }
        ++field7508;
        class55 var4 = new class55();
        var4.field556 = arg1;
        this.field7554.method725(var4, -20911);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZI)V", line = 1716)
    public final void method2999(boolean arg0, int arg1) {
        ++field7379;
        if (arg1 != 6914) {
            this.field7622 = -103;
        }
        if (this.field7584 == !arg0) {
            this.field7584 = arg0;
            this.method3036(115);
            this.field7561 &= -32;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(FFBF)V", line = 1741)
    private final void method3000(float arg0, float arg1, byte arg2, float arg3) {
        ++field7350;
        OpenGL.glMatrixMode(5890);
        if (this.field7633) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg0, arg3, arg1);
        OpenGL.glMatrixMode(5888);
        this.field7633 = true;
        if (arg2 != 44) {
            this.field7585 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(FFFFI)V", line = 1758)
    public final void method3001(float arg0, float arg1, float arg2, float arg3, int arg4) {
        class131.field1689[1] = arg0;
        ++field7345;
        class131.field1689[3] = arg3;
        class131.field1689[2] = arg1;
        class131.field1689[0] = arg2;
        int var6 = -82 % ((64 - arg4) / 43);
        OpenGL.glTexEnvfv(8960, 8705, class131.field1689, 0);
    }

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "()I", line = 1775)
    public final int method400() {
        ++field7423;
        return this.field7615;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIILaa;IIIII)V", line = 1786)
    public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class487 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field7480;
        if (arg0 != arg2 || ~arg1 != ~arg3) {
            class24 var13 = (class24) arg6;
            class495 var14 = var13.field180;
            this.method2972((byte) -119);
            this.method3006(1, var13.field180);
            this.method3013((byte) -69, arg5);
            this.method3042(8448, 8960, 7681);
            this.method2983(0, 768, -121, 34167);
            float var15 = var14.field6740 / (float) var14.field6742;
            float var16 = var14.field6744 / (float) var14.field6739;
            float var17 = (float) (-arg0) + (float) arg2;
            float var18 = (float) arg3 - (float) arg1;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            float var20 = var17 * var19;
            float var21 = var18 * var19;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            int var22 = arg11 % (arg10 - -arg9);
            float var23 = (float) arg9 * var20;
            float var24 = (float) arg9 * var21;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (~arg9 <= ~var22) {
                var27 = (float) (-var22 + arg9) * var20;
                var28 = (float) (arg9 - var22) * var21;
            } else {
                var25 = (float) (arg9 - var22 + arg10) * var20;
                var26 = (float) (-var22 + arg10 + arg9) * var21;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var20;
            float var32 = (float) arg10 * var21;
            while (true) {
                if (arg2 <= arg0) {
                    if ((float) arg2 + 0.35F > var29) {
                        break;
                    }
                    if ((float) arg2 > var27 + var29) {
                        var27 = (float) arg2 + -var29;
                    }
                } else {
                    if (var29 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var27 + var29 > (float) arg2) {
                        var27 = (float) arg2 - var29;
                    }
                }
                if (~arg3 >= ~arg1) {
                    if ((float) arg3 + 0.35F > var30) {
                        break;
                    }
                    if (var28 + var30 < (float) arg3) {
                        var28 = (float) arg3 - var30;
                    }
                } else {
                    if ((float) arg3 + 0.35F < var30) {
                        break;
                    }
                    if ((float) arg3 < var28 + var30) {
                        var28 = (float) arg3 - var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f(((float) (-arg7) + var29) * var15, ((float) (-arg8) + var30) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 + (float) (-arg7)) * var15, (var28 + var30 + (float) (-arg8)) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                OpenGL.glEnd();
                var29 += var27 + var31;
                var30 += var28 + var32;
                var28 = var24;
                var27 = var23;
            }
            this.method2983(0, 768, 111, 5890);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lpf;I)V", line = 1910)
    public final void method397(class583 arg0, int arg1) {
        ++field7378;
        this.field7524.method2576(arg0, -104, arg1, this);
    }

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "(I)V", line = 1919)
    private final void method3002(int arg0) {
        ++field7395;
        if (arg0 > -5) {
            this.method449(-116, (class551[]) null);
        }
        if (this.field7561 != 1) {
            this.method3020((byte) -35);
            this.method2999(false, 6914);
            this.method2994(false, false);
            this.method3024(false, false);
            this.method3018((byte) -126, false);
            this.method3006(1, (class221) null);
            this.method2977(-105, -2);
            this.method3039(260, 1);
            this.field7561 = 1;
        }
    }

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "(B)V", line = 1942)
    private final void method3003(byte arg0) {
        class131.field1689[1] = this.field7631 * this.field7624;
        class131.field1689[0] = this.field7644 * this.field7624;
        class131.field1689[3] = 1.0F;
        if (arg0 != -41) {
            this.method446();
        }
        ++field7443;
        class131.field1689[2] = this.field7669 * this.field7624;
        OpenGL.glLightModelfv(2899, class131.field1689, 0);
    }

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "(I)V", line = 1957)
    public final void method3004(int arg0) {
        if (arg0 != 19330) {
            this.field7572 = null;
        }
        ++field7412;
        if (~this.field7561 != -9) {
            this.method3047(-22);
            this.method2999(true, 6914);
            this.method3024(true, false);
            this.method3018((byte) 109, true);
            this.method3013((byte) -68, 1);
            this.field7561 = 8;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ldi;Ldi;FLdi;)Ldi;", line = 1983)
    public final class128 method378(class128 arg0, class128 arg1, float arg2, class128 arg3) {
        ++field7499;
        if (arg0 != null && arg1 != null && this.field7602 && this.field7671) {
            class569 var5 = null;
            class627 var6 = (class627) arg0;
            class627 var7 = (class627) arg1;
            class132 var8 = var6.method145((byte) 122);
            class132 var9 = var7.method145((byte) 123);
            if (var8 != null && var9 != null) {
                int var10 = var8.field1696 <= var9.field1696 ? var9.field1696 : var8.field1696;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class569) {
                    class569 var11 = (class569) arg3;
                    if (~var10 == ~var11.method3199(-65534)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class569(this, var10);
                }
                if (var5.method3198((byte) -21, var8, arg2, var9)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "(I)V", line = 2028)
    public static void method3005(int arg0) {
        field7357 = null;
        if (arg0 != 0) {
            field7357 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "()Z", line = 2038)
    public final boolean method419() {
        ++field7394;
        return true;
    }

    @OriginalMember(owner = "client!ac", name = "ya", descriptor = "()V", line = 2046)
    public final void method370() {
        ++field7518;
        this.method3018((byte) -121, true);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILcu;)V", line = 2059)
    public final void method3006(int arg0, class221 arg1) {
        ++field7403;
        if (arg0 == 1) {
            class221 var3 = this.field7607[this.field7628];
            if (arg1 != var3) {
                if (arg1 != null) {
                    if (var3 == null) {
                        OpenGL.glEnable(arg1.field2849);
                    } else if (~arg1.field2849 != ~var3.field2849) {
                        OpenGL.glDisable(var3.field2849);
                        OpenGL.glEnable(arg1.field2849);
                    }
                    OpenGL.glBindTexture(arg1.field2849, arg1.method1255(true));
                } else {
                    OpenGL.glDisable(var3.field2849);
                }
                this.field7607[this.field7628] = arg1;
            }
            this.field7561 &= -2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[I[I)Laa;", line = 2100)
    public final class487 method382(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field7470;
        return class456.method2547(arg1, arg2, this, arg0, arg3, (byte) 111);
    }

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "(I)V", line = 2110)
    private final void method3007(int arg0) {
        ++field7463;
        this.method2977(102, -2);
        for (int var2 = this.field7621 + -1; var2 >= 0; --var2) {
            this.method2988(var2, arg0 + 847872904);
            this.method3006(1, (class221) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method3042(8448, 8960, 8448);
        this.method2983(2, 770, arg0 + 128, 34168);
        this.method3034(370914608);
        this.field7558 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field7555 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field7556 = true;
        OpenGL.glColorMask(true, true, true, true);
        if (arg0 == -32) {
            this.field7557 = true;
            this.method2999(true, 6914);
            this.method2994(true, false);
            this.method3024(true, false);
            this.method3018((byte) 113, true);
            this.method3010(arg0 ^ -29454);
            this.field7356.setSwapInterval(0);
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
            this.field7623 = this.field7666 = -1;
            this.method406();
        }
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V", line = 2183)
    public final void method384(int arg0) {
        ++field7365;
        this.method2979(-513);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/Canvas;II)V", line = 2191)
    public final void method340(Canvas arg0, int arg1, int arg2) {
        ++field7424;
        if (this.field7402 == arg0) {
            throw new RuntimeException();
        } else if (!this.field7420.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field7356.prepareSurface(arg0);
                if (var6 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field7420.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(IIIIII)V", line = 2227)
    public final void method412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3002(-89);
        ++field7409;
        this.method3013((byte) -88, arg5);
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
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var9 + 0.35F, (float) arg3 + var8 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "()Z", line = 2261)
    public final boolean method423() {
        ++field7426;
        if (this.field7522 != null) {
            if (!this.field7522.method3079(0)) {
                if (!this.field7523.method2373(this.field7522, -47)) {
                    return false;
                }
                this.field7519.method1858((byte) 100);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILdw;ZI)V", line = 2286)
    public final void method3008(int arg0, int arg1, class718 arg2, boolean arg3, int arg4) {
        ++field7397;
        if (arg3) {
            this.method3015(-128, 67);
        }
        int var6 = arg2.method3340(5061);
        int var7 = arg4 * this.method2982(var6, -5122);
        this.method2973(arg2, 2936);
        OpenGL.glDrawElements(arg1, arg0, var6, (long) var7 + arg2.method3339(20260));
    }

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "()I", line = 2303)
    public final int method415() {
        ++field7405;
        return this.field7548 + this.field7547 + this.field7546;
    }

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "(II)I", line = 2313)
    public final int method3009(int arg0, int arg1) {
        ++field7452;
        if (arg0 >= -73) {
            this.method455();
        }
        if (arg1 != 6406 && ~arg1 != -6410) {
            if (~arg1 != -6411 && ~arg1 != -34847 && ~arg1 != -34845) {
                if (arg1 == 6407) {
                    return 3;
                } else if (~arg1 != -6409 && arg1 != 34847) {
                    if (~arg1 == -34844) {
                        return 6;
                    } else if (~arg1 != -34843) {
                        if (~arg1 == -6403) {
                            return 3;
                        } else if (arg1 == 6401) {
                            return 1;
                        } else {
                            throw new IllegalArgumentException("");
                        }
                    } else {
                        return 8;
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

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "(I)V", line = 2356)
    public final void method3010(int arg0) {
        if (arg0 != 29458) {
            this.method3036(72);
        }
        if (this.field7596 != 0) {
            this.field7596 = 0;
            this.field7561 &= -32;
        }
        ++field7507;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lgk;Lgk;Lgk;Lgk;I)V", line = 2375)
    public final void method3011(class475 arg0, class475 arg1, class475 arg2, class475 arg3, int arg4) {
        if (arg3 != null) {
            this.method3030(arg3.field6571, 34962);
            OpenGL.glVertexPointer(arg3.field6569, arg3.field6568, this.field7585.method691(-115), this.field7585.method690(24582) - -((long) arg3.field6567));
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        ++field7509;
        if (arg4 != 0) {
            this.method358(-106, -93);
        }
        if (arg1 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method3030(arg1.field6571, 34962);
            OpenGL.glNormalPointer(arg1.field6568, this.field7585.method691(-122), this.field7585.method690(24582) - -((long) arg1.field6567));
            OpenGL.glEnableClientState(32885);
        }
        if (arg0 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method3030(arg0.field6571, 34962);
            OpenGL.glColorPointer(arg0.field6569, arg0.field6568, this.field7585.method691(49), this.field7585.method690(24582) - -((long) arg0.field6567));
            OpenGL.glEnableClientState(32886);
        }
        if (arg2 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method3030(arg2.field6571, 34962);
            OpenGL.glTexCoordPointer(arg2.field6569, arg2.field6568, this.field7585.method691(79), this.field7585.method690(24582) - -((long) arg2.field6567));
            OpenGL.glEnableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILhg;)V", line = 2421)
    public final void method3012(int arg0, class691 arg1) {
        ++field7517;
        if (this.field7538 >= arg0 && this.field7537[this.field7538] == arg1) {
            this.field7537[this.field7538--] = null;
            arg1.method2093((byte) -30);
            if (~this.field7538 <= -1) {
                this.field7539 = this.field7537[this.field7538];
                this.field7539.method2092((byte) -115);
            } else {
                this.field7539 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ac", name = "EA", descriptor = "(IIII)V", line = 2443)
    public final void method427(int arg0, int arg1, int arg2, int arg3) {
        ++field7376;
        if (!this.field7577) {
            throw new RuntimeException("");
        } else {
            this.field7664 = arg3;
            this.field7573 = arg0;
            this.field7634 = arg1;
            this.field7665 = arg2;
            if (this.field7659) {
                this.field7525.field9815.method2072((byte) 34);
                this.field7525.field9815.method2071(-16661);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIZ)Lufa;", line = 2466)
    public final class680 method414(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field7492;
        return new class286(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(BI)V", line = 2474)
    public final void method3013(byte arg0, int arg1) {
        if (arg0 > -18) {
            this.field7548 = 47;
        }
        ++field7469;
        if (this.field7558 != arg1) {
            boolean var3;
            boolean var4;
            byte var5;
            if (~arg1 == -2) {
                var3 = true;
                var4 = true;
                var5 = 1;
            } else if (arg1 == 2) {
                var4 = true;
                var3 = false;
                var5 = 2;
            } else if (arg1 == 128) {
                var3 = true;
                var4 = true;
                var5 = 3;
            } else {
                var5 = 0;
                var4 = true;
                var3 = false;
            }
            if (var4 == !this.field7557) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field7557 = var4;
            }
            if (this.field7556 != var3) {
                if (!var3) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field7556 = var3;
            }
            if (~this.field7555 != ~var5) {
                if (~var5 != -2) {
                    if (var5 == 2) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    } else if (var5 == 3) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    } else {
                        OpenGL.glDisable(3042);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field7555 = var5;
            }
            this.field7558 = arg1;
            this.field7561 &= -29;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V", line = 2566)
    public final void method373(int arg0, int arg1) throws class353 {
        try {
            this.field7356.swapBuffers();
        } catch (Exception var3) {
        }
        ++field7438;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V", line = 2584)
    public class541(Canvas arg0, class152 arg1, int arg2) {
        super(arg1);
        new class406();
        new class459(16);
        this.field7545 = new class108();
        this.field7549 = new class108();
        this.field7550 = new class108();
        this.field7551 = new class108();
        this.field7552 = new class108();
        this.field7553 = new class108();
        this.field7554 = new class108();
        this.field7559 = new class253();
        this.field7564 = new class253();
        this.field7565 = new class253();
        this.field7587 = 0.0F;
        this.field7581 = 0;
        this.field7603 = 1.0F;
        this.field7606 = 8448;
        this.field7598 = 8448;
        this.field7619 = new class551[class140.field1805];
        this.field7611 = -1.0F;
        this.field7583 = new float[4];
        this.field7600 = 3584;
        this.field7625 = 0;
        this.field7629 = new float[4];
        this.field7615 = 50;
        this.field7623 = -1;
        this.field7613 = 0;
        this.field7618 = -1.0F;
        this.field7634 = -1;
        this.field7638 = 0;
        this.field7646 = -1.0F;
        this.field7640 = -1.0F;
        this.field7592 = 512;
        this.field7631 = 1.0F;
        this.field7651 = new float[16];
        this.field7659 = false;
        this.field7643 = 0;
        this.field7590 = 3584.0F;
        this.field7649 = new float[4];
        this.field7666 = -1;
        this.field7665 = -1;
        this.field7652 = -1;
        this.field7605 = 0;
        this.field7626 = 0;
        this.field7663 = 1.0F;
        this.field7669 = 1.0F;
        this.field7630 = 512;
        this.field7612 = 3584.0F;
        this.field7644 = 1.0F;
        this.field7662 = 0;
        this.field7674 = new float[4];
        this.field7664 = 0;
        this.field7620 = 0;
        this.field7676 = true;
        this.field7657 = new class183(8192);
        this.field7679 = new int[1];
        this.field7680 = new byte[16384];
        this.field7681 = new int[1];
        this.field7682 = new int[1];
        this.field7358 = this.field7402 = arg0;
        this.field7521 = arg2;
        if (!class492.method2758("jaclib", (byte) -36)) {
            throw new RuntimeException("");
        } else if (!class492.method2758("jaggl", (byte) -36)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field7356 = new OpenGL();
                this.field7389 = this.field7515 = this.field7356.init(arg0, 8, 8, 8, 24, 0, this.field7521);
                if (~this.field7515 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method2997(-33);
                    int var4 = this.method2992((byte) -123);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field7636 = !this.field7608 ? 5121 : 33639;
                        if (~this.field7614.indexOf("radeon") != 0) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class490.method2753(this.field7614.replace('/', ' '), ' ', false);
                            for (int var9 = 0; ~var9 > ~var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (~var10.length() < -1) {
                                        if (~var10.charAt(0) == -121 && var10.length() >= 3 && class266.method1590((byte) 53, var10.substring(1, 3))) {
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
                                            if (~var10.length() <= -5 && class266.method1590((byte) 53, var10.substring(0, 4))) {
                                                var5 = class436.method2477(-94, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && var5 <= 9250) {
                                    this.field7645 = false;
                                }
                                if (var5 >= 7000 && ~var5 >= -8000) {
                                    this.field7660 = false;
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field7594 = false;
                            }
                            this.field7589 &= this.field7356.method3530("GL_ARB_half_float_pixel");
                            this.field7670 = this.field7660;
                            this.field7617 = true;
                        }
                        if (this.field7641.indexOf("intel") != -1) {
                            this.field7671 = false;
                        }
                        this.field7650 = !this.field7641.equals("s3 graphics");
                        if (this.field7660) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class278.method1660(8, false, true);
                        this.field7528 = true;
                        this.field7519 = new class307(this, super.field636);
                        this.method3046(98);
                        this.field7533 = new class104(this);
                        this.field7523 = new class412(this);
                        if (this.field7523.method2378(true)) {
                            this.field7522 = new class688(this);
                            if (!this.field7522.method3893((byte) 41)) {
                                this.field7522.method3083((byte) -83);
                                this.field7522 = null;
                            }
                        }
                        this.field7525 = new class698(this);
                        this.method3007(-32);
                        this.method2993((byte) -31);
                        this.method448();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method383();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZIIII)V", line = 2733)
    public static final void method3014(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7433;
        class659.field9193 = arg3;
        class105.field1409 = arg5;
        class422.field5907 = arg4;
        class86.field1185 = arg0;
        if (arg6 >= -91) {
            method3014(73, 45, false, -110, -71, -102, 48);
        }
        class328.field4443 = arg1;
        if (arg2 && ~class105.field1409 <= -101) {
            class684.field9518 = class422.field5907 * 512 + 256;
            class294.field3956 = class328.field4443 * 512 + 256;
            class262.field3429 = class86.method624(class61.field677, class684.field9518, class294.field3956, 24111) + -class659.field9193;
        }
        class39.field404 = -1;
        class520.field6999 = -1;
        class8.field57 = 2;
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "()Z", line = 2760)
    public final boolean method375() {
        ++field7478;
        return false;
    }

    @OriginalMember(owner = "client!ac", name = "pa", descriptor = "()V", line = 2769)
    public final void method417() {
        ++field7485;
        this.field7577 = false;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIII)V", line = 2780)
    public final void method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7425;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method3002(-68);
        this.method3013((byte) -66, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7571) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7571) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "()Leca;", line = 2813)
    public final class758 method418() {
        ++field7432;
        int var1 = -1;
        if (this.field7641.indexOf("nvidia") != -1) {
            var1 = 4318;
        } else if (~this.field7641.indexOf("intel") != 0) {
            var1 = 32902;
        } else if (this.field7641.indexOf("ati") != -1) {
            var1 = 4098;
        }
        return new class758(var1, "OpenGL", this.field7601, this.field7614, 0L);
    }

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "(II)V", line = 2834)
    public final synchronized void method3015(int arg0, int arg1) {
        ++field7323;
        class55 var3 = new class55();
        if (arg1 != 2834) {
            this.method2982(59, 97);
        }
        var3.field556 = (long) arg0;
        this.field7553.method725(var3, arg1 ^ -23229);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(III)V", line = 2849)
    public final synchronized void method3016(int arg0, int arg1, int arg2) {
        ++field7380;
        class629 var4 = new class629(arg0);
        var4.field556 = (long) arg2;
        if (arg1 != 4) {
            this.field7620 = -76;
        }
        this.field7550.method725(var4, -20911);
    }

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "()Z", line = 2870)
    public final boolean method456() {
        ++field7373;
        return this.field7571 && (!this.method377() || this.field7661);
    }

    @OriginalMember(owner = "client!ac", name = "GA", descriptor = "(I)V", line = 2878)
    public final void method402(int arg0) {
        ++field7487;
        this.method3013((byte) -80, 0);
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "(I)V", line = 2890)
    private final void method3017(int arg0) {
        ++field7479;
        if (arg0 != -30) {
            this.method2974(-70);
        }
        if (this.field7596 != 3) {
            this.field7596 = 3;
            this.method3027((byte) 78);
            this.method2976(4);
            this.field7561 &= -8;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ltw;Z)Lufa;", line = 2908)
    public final class680 method366(class204 arg0, boolean arg1) {
        ++field7460;
        int[] var3 = new int[arg0.field2421 * arg0.field2419];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field2422 != null) {
            for (int var6 = 0; arg0.field2419 > var6; ++var6) {
                for (int var7 = 0; ~arg0.field2421 < ~var7; ++var7) {
                    var3[var5++] = class344.method2020(arg0.field2417[class321.method1919(255, arg0.field2416[var4])], arg0.field2422[var4] << 24);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; var8 < arg0.field2419; ++var8) {
                for (int var10 = 0; ~var10 > ~arg0.field2421; ++var10) {
                    int var11 = arg0.field2417[arg0.field2416[var4++] & 255];
                    var3[var5++] = var11 != 0 ? class344.method2020(var11, -16777216) : 0;
                }
            }
        }
        class680 var9 = this.method351(-7962, 0, arg0.field2421, arg0.field2419, var3, arg0.field2421);
        var9.method670(arg0.field2424, arg0.field2420, arg0.field2418, arg0.field2423);
        return var9;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[Lcba;)V", line = 2970)
    public final void method449(int arg0, class551[] arg1) {
        ++field7447;
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field7619[var3] = arg1[var3];
        }
        this.field7595 = arg0;
        if (this.field7596 != 1) {
            this.method2985(114);
        }
    }

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "()I", line = 2996)
    public final int method459() {
        ++field7333;
        int var1 = this.field7678;
        this.field7678 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[[I[[IIII)Ls;", line = 3011)
    public final class281 method344(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field7439;
        return new class257(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lmv;[Ltw;Z)Lda;", line = 3019)
    public final class61 method425(class377 arg0, class204[] arg1, boolean arg2) {
        ++field7505;
        return new class730(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BZ)V", line = 3028)
    public final void method3018(byte arg0, boolean arg1) {
        if (!this.field7560 == arg1) {
            this.field7560 = arg1;
            this.method3019((byte) -75);
            this.field7561 &= -32;
        }
        int var3 = 61 % ((-83 - arg0) / 36);
        ++field7429;
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "()Z", line = 3044)
    public final boolean method376() {
        ++field7473;
        return this.field7522 != null && (this.field7521 <= 1 || this.field7661);
    }

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "(B)V", line = 3053)
    private final void method3019(byte arg0) {
        if (arg0 != -75) {
            this.field7670 = false;
        }
        OpenGL.glDepthMask(this.field7560 && this.field7676);
        ++field7413;
    }

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "()Lhba;", line = 3077)
    public final class10 method454() {
        ++field7321;
        return new class253();
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([IIIIIZ)Lufa;", line = 3092)
    public final class680 method379(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7510;
        return new class286(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "(B)V", line = 3105)
    private final void method3020(byte arg0) {
        if (arg0 < -33) {
            if (~this.field7596 != -2) {
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadIdentity();
                if (~this.field7411 < -1 && ~this.field7410 < -1) {
                    OpenGL.glOrtho(0.0D, (double) this.field7411, (double) this.field7410, 0.0D, -1.0D, 1.0D);
                }
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadIdentity();
                this.field7596 = 1;
                this.field7561 &= -25;
            }
            ++field7369;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZII[B)Lob;", line = 3132)
    public final class738 method3021(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4) {
        ++field7325;
        if (!this.field7660 || arg1 && !this.field7670) {
            return arg3 >= -46 ? null : new class259(this, arg2, arg4, arg0);
        } else {
            return new class100(this, arg2, arg4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBI)V", line = 3149)
    public final synchronized void method3022(int arg0, byte arg1, int arg2) {
        int var4 = 30 % ((arg1 - 24) / 59);
        ++field7511;
        class629 var5 = new class629(arg0);
        var5.field556 = (long) arg2;
        this.field7549.method725(var5, -20911);
    }

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "()V", line = 3162)
    public final void method458() {
        ++field7464;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "()V", line = 3171)
    public final void method383() {
        ++field7512;
        for (class55 var1 = this.field7531.method724(32); var1 != null; var1 = this.field7531.method723(117)) {
            ((class247) var1).method1481((byte) 36);
        }
        if (this.field7523 != null) {
            this.field7523.method2375((byte) -127);
        }
        if (this.field7356 != null) {
            this.method2979(-513);
            Enumeration var2 = this.field7420.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field7420.get(var3);
                this.field7356.releaseSurface(var3, var4);
            }
            this.field7356.release();
            this.field7356 = null;
        }
        if (this.field7528) {
            class360.method2067(true, 75, false);
            this.field7528 = false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(ILhg;)V", line = 3217)
    public final void method3023(int arg0, class691 arg1) {
        ++field7398;
        if (~this.field7535 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field7535 >= 0) {
                this.field7540[this.field7535].method2096(-27095);
            }
            if (arg0 >= 65) {
                this.field7536 = this.field7540[++this.field7535] = arg1;
                this.field7536.method2086((byte) 77);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "(IIIII)V", line = 3240)
    public final void method386(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3002(-67);
        ++field7490;
        this.method3013((byte) -120, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "()V", line = 3260)
    public final void method439() {
        ++field7322;
    }

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "()Z", line = 3267)
    public final boolean method392() {
        ++field7456;
        return true;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)V", line = 3275)
    public final void method345(int arg0, int arg1, int arg2, int arg3) {
        this.field7523.method2374(arg2, arg1, arg3, arg0, 0);
        ++field7419;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(ZZ)V", line = 3286)
    public final void method3024(boolean arg0, boolean arg1) {
        if (arg0 == !this.field7563) {
            if (!arg0) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field7563 = arg0;
            this.field7561 &= -32;
        }
        ++field7326;
        if (arg1) {
            this.method437(9, -63, 119, 56, 110, 39, -105, -9, -22);
        }
    }

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "(II)V", line = 3308)
    public final void method3025(int arg0, int arg1) {
        class131.field1689[3] = (float) (arg0 >>> 24) / 255.0F;
        if (arg1 > -67) {
            this.method340((Canvas) null, 84, 45);
        }
        class131.field1689[0] = (float) class321.method1919(16711680, arg0) / 1.671168E7F;
        class131.field1689[2] = (float) class321.method1919(arg0, 255) / 255.0F;
        ++field7501;
        class131.field1689[1] = (float) class321.method1919(arg0, 65280) / 65280.0F;
        OpenGL.glTexEnvfv(8960, 8705, class131.field1689, 0);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lgca;B)V", line = 3325)
    public final void method3026(class253 arg0, byte arg1) {
        OpenGL.glPushMatrix();
        ++field7434;
        OpenGL.glMultMatrixf(arg0.method1507(-117), 0);
        if (arg1 > -123) {
            this.field7549 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V", line = 3339)
    public final void method352(boolean arg0) {
        ++field7454;
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(II)Lci;", line = 3346)
    public final class451 method440(int arg0, int arg1) {
        ++field7362;
        return null;
    }

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "(B)V", line = 3355)
    private final void method3027(byte arg0) {
        ++field7384;
        if (arg0 < 15) {
            this.field7356 = null;
        }
        float var2 = (float) (-this.field7662) * this.field7663 / (float) this.field7630;
        float var3 = (float) (-this.field7605) * this.field7663 / (float) this.field7592;
        float var4 = (float) (-this.field7662 + this.field7411) * this.field7663 / (float) this.field7630;
        float var5 = (float) (-this.field7605 + this.field7410) * this.field7663 / (float) this.field7592;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field7615, (double) this.field7600);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "(B)V", line = 3381)
    private final void method3028(byte arg0) {
        ++field7486;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field7651, 0);
        OpenGL.glMatrixMode(5888);
        if (arg0 > -31) {
            this.method424(55, 77, -121, 59, -28, 57);
        }
    }

    @OriginalMember(owner = "client!ac", name = "Y", descriptor = "()[I", line = 3394)
    public final int[] method453() {
        ++field7488;
        return new int[] { this.field7662, this.field7605, this.field7630, this.field7592 };
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(IIII)V", line = 3403)
    public final void method3029(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg1 + 34184, arg3);
        ++field7399;
        OpenGL.glTexEnvi(8960, arg2 - -arg1, arg0);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ldi;)V", line = 3412)
    public final void method387(class128 arg0) {
        ++field7385;
        this.field7654 = (class627) arg0;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lob;I)V", line = 3420)
    public final void method3030(class738 arg0, int arg1) {
        if (this.field7585 != arg0) {
            if (this.field7660) {
                OpenGL.glBindBufferARB(34962, arg0.method692(-14112));
            }
            this.field7585 = arg0;
        }
        ++field7361;
        if (arg1 != 34962) {
            this.method3003((byte) -89);
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(III)V", line = 3439)
    public final void method3031(int arg0, int arg1, int arg2) {
        ++field7497;
        this.field7620 = arg0;
        int var4 = 6 % ((-10 - arg1) / 50);
        this.field7626 = arg2;
        this.method2987((byte) 55);
        this.method2971((byte) 103);
    }

    @OriginalMember(owner = "client!ac", name = "za", descriptor = "(IIIII)V", line = 3452)
    public final void method421(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7468;
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        if (~(arg0 + arg2) <= ~this.field7581 && this.field7643 >= -arg2 + arg0 && this.field7613 <= arg1 + arg2 && arg1 - arg2 <= this.field7625) {
            this.method3002(-51);
            this.method3013((byte) -23, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field7640) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field7611 >= (float) var8) {
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
                } else if (var9 > 512) {
                    var9 = 512;
                }
                int var10 = class115.method761(73, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; var11 > 0; var11 -= var10) {
                    OpenGL.glVertex2f(class1.field1[var11] * (float) arg2 + var6, class1.field6[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lqp;)V", line = 3527)
    public final void method339(class657 arg0) {
        ++field7370;
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(Z)V", line = 3534)
    public final void method3032(boolean arg0) {
        ++field7440;
        if (~this.field7561 != -5) {
            this.method3020((byte) -82);
            this.method2999(false, 6914);
            this.method2994(false, false);
            this.method3024(false, arg0);
            this.method3018((byte) 18, false);
            this.method2977(124, -2);
            this.method3013((byte) -72, 1);
            this.field7561 = 4;
        }
        if (arg0) {
            this.field7598 = -6;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(FZ)V", line = 3558)
    public final void method3033(float arg0, boolean arg1) {
        if (!arg1) {
            this.method438(112);
        }
        if (this.field7663 != arg0) {
            this.field7663 = arg0;
            if (this.field7596 == 3) {
                this.method3027((byte) 87);
            }
        }
        ++field7329;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()Z", line = 3577)
    public final boolean method346() {
        ++field7364;
        return this.field7525.method3948(3, -6634);
    }

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "(I)V", line = 3585)
    private final void method3034(int arg0) {
        if (arg0 != 370914608) {
            this.method428(96, -106, -101, 12, 0.5374041586352528D);
        }
        if (this.field7633) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field7633 = false;
        }
        ++field7442;
    }

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "(IIIIII[BII)V", line = 3609)
    public final void method444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field7317;
        float var10;
        float var11;
        if (this.field7655 != null && this.field7655.field8645 >= arg2 && arg3 <= this.field7655.field8639) {
            this.field7655.method3466(arg2, 6406, false, 0, arg6, 0, (byte) -80, 0, 0, arg3);
            var10 = (float) arg2 * this.field7655.field6740 / (float) this.field7655.field8645;
            var11 = (float) arg3 * this.field7655.field6744 / (float) this.field7655.field8639;
        } else {
            this.field7655 = class457.method2550(6406, arg3, 14764, 6406, this, false, arg6, arg2);
            this.field7655.method3471(false, 10242, false);
            var11 = this.field7655.field6744;
            var10 = this.field7655.field6740;
        }
        this.method2972((byte) -95);
        this.method3006(1, this.field7655);
        this.method3013((byte) -106, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method3025(arg5, -126);
        this.method3042(34165, 8960, 34165);
        this.method2983(0, 768, 109, 34166);
        this.method2983(2, 770, -72, 5890);
        this.method3029(770, 0, 34200, 34166);
        this.method3029(770, 2, 34200, 5890);
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
        this.method2983(0, 768, 103, 5890);
        this.method2983(2, 770, 74, 34166);
        this.method3029(770, 0, 34200, 5890);
        this.method3029(770, 2, 34200, 34166);
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "()V", line = 3675)
    public final void method362() {
        ++field7430;
        if (this.field7522 != null && this.field7522.method3079(0)) {
            this.field7523.method2370(this.field7522, -17722);
            this.field7519.method1858((byte) 100);
        }
    }

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "(II)I", line = 3693)
    public final int method3035(int arg0, int arg1) {
        if (arg1 != 596294056) {
            return -116;
        } else {
            ++field7347;
            if (~arg0 == -2) {
                return 7681;
            } else if (arg0 == 0) {
                return 8448;
            } else if (arg0 != 2) {
                if (~arg0 != -4) {
                    if (arg0 == 4) {
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
    }

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "(I)V", line = 3728)
    private final void method3036(int arg0) {
        if (this.field7584 && ~this.field7652 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field7352;
        if (arg0 <= 105) {
            this.method3009(-33, -87);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Ljava/awt/Canvas;II)V", line = 3743)
    public final void method394(Canvas arg0, int arg1, int arg2) {
        ++field7513;
        long var4 = 0L;
        if (arg0 != null && this.field7402 != arg0) {
            if (this.field7420.containsKey(arg0)) {
                Long var6 = (Long) this.field7420.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field7515;
        }
        if (var4 == 0L) {
            throw new RuntimeException();
        } else {
            this.field7356.surfaceResized(var4);
            if (this.field7358 == arg0) {
                this.method2993((byte) -31);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "(B)V", line = 3775)
    private final void method3037(byte arg0) {
        this.field7651[10] = this.field7582;
        this.field7651[14] = this.field7627;
        ++field7316;
        int var2 = -59 % ((arg0 - -47) / 53);
        this.field7612 = (this.field7651[14] + (float) (-this.field7600)) / this.field7651[10];
        this.field7590 = (float) this.field7600;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 3794)
    public static final void method3038(int arg0, byte arg1, String arg2) {
        ++field7446;
        class252 var3 = class150.method916(arg0, -76, 3);
        if (arg1 < -38) {
            var3.method1502((byte) -103);
            var3.field3248 = arg2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "()I", line = 3813)
    public final int method455() {
        ++field7484;
        return 4;
    }

    @OriginalMember(owner = "client!ac", name = "ra", descriptor = "(IIII)V", line = 3821)
    public final void method348(int arg0, int arg1, int arg2, int arg3) {
        this.field7573 = arg0;
        ++field7355;
        this.field7665 = arg2;
        this.field7577 = true;
        this.field7634 = arg1;
        this.field7664 = arg3;
    }

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "(II)V", line = 3839)
    public final void method3039(int arg0, int arg1) {
        if (~arg1 == -2) {
            this.method3042(7681, 8960, 7681);
        } else if (arg1 == 0) {
            this.method3042(8448, 8960, 8448);
        } else if (arg1 != 2) {
            if (~arg1 != -4) {
                if (arg1 == 4) {
                    this.method3042(34023, 8960, 34023);
                }
            } else {
                this.method3042(8448, 8960, 260);
            }
        } else {
            this.method3042(7681, arg0 + 8700, 34165);
        }
        ++field7448;
        if (arg0 != 260) {
            this.field7552 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(FFF)V", line = 3869)
    public final void method408(float arg0, float arg1, float arg2) {
        class534.field7250 = arg0;
        ++field7393;
        class34.field353 = arg2;
        class713.field9951 = arg1;
    }

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "()V", line = 3884)
    public final void method441() {
        this.field7523.method2371(-121);
        ++field7462;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZZB)V", line = 3895)
    public final void method3040(int arg0, boolean arg1, boolean arg2, byte arg3) {
        ++field7506;
        if (~this.field7568 != ~arg0 || !this.field7659 == this.field7577) {
            class616 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field7577 ? 0 : 3;
            if (arg0 < 0) {
                this.method3034(370914608);
            } else {
                var5 = this.field7519.method1855(arg3 + 196, arg0);
                class335 var10 = super.field636.method925(arg0, -28755);
                if (~var10.field4525 == -1 && var10.field4542 == 0) {
                    this.method3034(370914608);
                } else {
                    int var11 = !var10.field4524 ? 128 : 64;
                    int var12 = var11 * 50;
                    this.method3000((float) (this.field7532 % var12 * var10.field4525) / (float) var12, 0.0F, (byte) 44, (float) (this.field7532 % var12 * var10.field4542) / (float) var12);
                }
                var6 = var10.field4523;
                if (!this.field7577) {
                    var9 = var10.field4522;
                    var8 = var10.field4539;
                    var7 = var10.field4518;
                }
            }
            this.field7525.method3949(arg2, arg1, var8, var7, true, var9);
            if (!this.field7525.method3950(var5, false, var6)) {
                this.method3006(1, var5);
                this.method3039(260, var6);
            }
            this.field7568 = arg0;
            this.field7659 = this.field7577;
        }
        if (arg3 != -70) {
            this.method347(4, 29, -13, 16, 49);
        }
        this.field7561 &= -8;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLhg;)V", line = 3960)
    public final void method3041(boolean arg0, class691 arg1) {
        ++field7435;
        if (!arg0) {
            this.method3036(-128);
        }
        if (!this.field7586) {
            if (~this.field7542 <= -4) {
                throw new RuntimeException();
            } else {
                if (this.field7542 >= 0) {
                    this.field7543[this.field7542].method2101((byte) 69);
                }
                this.field7536 = this.field7539 = this.field7543[++this.field7542] = arg1;
                this.field7536.method2087((byte) 122);
            }
        } else {
            this.method3023(127, arg1);
            this.method2978(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(III)V", line = 3988)
    public final void method3042(int arg0, int arg1, int arg2) {
        ++field7516;
        if (this.field7628 == 0) {
            boolean var4 = false;
            if (~this.field7606 != ~arg2) {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                var4 = true;
                this.field7606 = arg2;
            }
            if (~this.field7598 != ~arg0) {
                OpenGL.glTexEnvi(8960, 34162, arg0);
                this.field7598 = arg0;
                var4 = true;
            }
            if (var4) {
                this.field7561 &= -30;
            }
        } else {
            OpenGL.glTexEnvi(8960, 34161, arg2);
            OpenGL.glTexEnvi(8960, 34162, arg0);
        }
        if (arg1 != 8960) {
            this.field7523 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "(B)V", line = 4029)
    private final void method3043(byte arg0) {
        class131.field1689[3] = 1.0F;
        class131.field1689[0] = this.field7646 * this.field7644;
        class131.field1689[1] = this.field7646 * this.field7631;
        ++field7467;
        class131.field1689[2] = this.field7669 * this.field7646;
        OpenGL.glLightfv(16384, 4609, class131.field1689, 0);
        class131.field1689[2] = -this.field7618 * this.field7669;
        class131.field1689[3] = 1.0F;
        class131.field1689[0] = -this.field7618 * this.field7644;
        class131.field1689[1] = -this.field7618 * this.field7631;
        if (arg0 <= 64) {
            this.method349(-28, 34);
        }
        OpenGL.glLightfv(16385, 4609, class131.field1689, 0);
    }

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "(B)V", line = 4049)
    public final void method3044(byte arg0) {
        ++field7382;
        if (~this.field7561 != -17) {
            this.method3017(arg0 + 5);
            this.method2999(true, 6914);
            this.method3024(true, false);
            this.method3018((byte) -123, true);
            this.method3013((byte) -33, 1);
            this.field7561 = 16;
        }
        if (arg0 != -35) {
            this.field7674 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "(I)V", line = 4073)
    public final void method431(int arg0) {
        this.method2997(-30);
        ++field7401;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIII)V", line = 4081)
    public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field7404;
        if (~arg0 != ~arg2 || ~arg1 != ~arg3) {
            this.method3002(-113);
            this.method3013((byte) -126, arg5);
            float var10 = (float) (-arg0) + (float) arg2;
            float var11 = (float) (-arg1) + (float) arg3;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            float var13 = var11 * var12;
            float var14 = var10 * var12;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            int var15 = arg8 % (arg6 + arg7);
            float var16 = (float) arg6 * var14;
            float var17 = (float) arg6 * var13;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (var15 <= arg6) {
                var21 = (float) (-var15 + arg6) * var13;
                var20 = (float) (-var15 + arg6) * var14;
            } else {
                var18 = (float) (arg6 + arg7 + -var15) * var14;
                var19 = (float) (arg6 + arg7 + -var15) * var13;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var14;
            float var25 = (float) arg7 * var13;
            while (true) {
                if (arg2 > arg0) {
                    if (var22 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if ((float) arg2 < var20 + var22) {
                        var20 = (float) arg2 + -var22;
                    }
                } else {
                    if ((float) arg2 + 0.35F > var22) {
                        break;
                    }
                    if ((float) arg2 > var20 + var22) {
                        var20 = (float) arg2 + -var22;
                    }
                }
                if (~arg3 < ~arg1) {
                    if ((float) arg3 + 0.35F < var23) {
                        break;
                    }
                    if ((float) arg3 < var21 + var23) {
                        var21 = (float) arg3 + -var23;
                    }
                } else {
                    if ((float) arg3 + 0.35F > var23) {
                        break;
                    }
                    if (var21 + var23 < (float) arg3) {
                        var21 = (float) arg3 + -var23;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glVertex2f(var22, var23);
                OpenGL.glVertex2f(var20 + var22, var21 + var23);
                OpenGL.glEnd();
                var23 += var21 + var25;
                var22 += var20 + var24;
                var20 = var16;
                var21 = var17;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "(B)V", line = 4192)
    public final void method3045(byte arg0) {
        if (arg0 != 60) {
            this.field7633 = true;
        }
        OpenGL.glPopMatrix();
        ++field7489;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(IIIID)V", line = 4204)
    public final void method428(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field7471;
    }

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "(I)V", line = 4212)
    private final void method3046(int arg0) {
        this.field7607 = new class221[this.field7621];
        ++field7332;
        this.field7569 = new class616(this, 3553, 6408, 1, 1);
        new class616(this, 3553, 6408, 1, 1);
        new class616(this, 3553, 6408, 1, 1);
        this.field7639 = new class381(this);
        this.field7604 = new class381(this);
        this.field7673 = new class381(this);
        this.field7667 = new class381(this);
        this.field7597 = new class381(this);
        this.field7580 = new class381(this);
        this.field7672 = new class381(this);
        if (arg0 <= 26) {
            this.method428(113, -33, -15, 84, -0.18123041621142552D);
        }
        this.field7572 = new class381(this);
        this.field7566 = new class381(this);
        this.field7593 = new class381(this);
        if (this.field7671) {
            this.field7574 = new class365(this);
            new class365(this);
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)I", line = 4249)
    public final int method389(int arg0, int arg1) {
        ++field7363;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "(I)V", line = 4257)
    private final void method3047(int arg0) {
        if (this.field7596 != 2) {
            this.field7596 = 2;
            this.method3028((byte) -47);
            this.method2976(4);
            this.field7561 &= -8;
        }
        ++field7406;
        if (arg0 > -3) {
            this.field7582 = 0.12732868F;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lhba;)V", line = 4278)
    public final void method367(class10 arg0) {
        ++field7387;
        this.field7559.method25(arg0);
        this.field7564.method25(this.field7559);
        this.field7564.method1505(2);
        this.field7565.method1506(this.field7564, (byte) -118);
        if (~this.field7596 != -2) {
            this.method2976(4);
        }
    }

    @OriginalMember(owner = "client!ac", name = "X", descriptor = "(I)V", line = 4299)
    public final void method438(int arg0) {
        this.field7530 = 0;
        ++field7451;
        while (~arg0 < -2) {
            ++this.field7530;
            arg0 >>= 1;
        }
        this.field7529 = 1 << this.field7530;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIF)Lcba;", line = 4316)
    public final class551 method374(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field7328;
        return new class572(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "(Z)V", line = 4325)
    public final void method350(boolean arg0) {
        this.field7676 = arg0;
        ++field7476;
        this.method3019((byte) -75);
    }

    @OriginalMember(owner = "client!ac", name = "xa", descriptor = "(F)V", line = 4336)
    public final void method434(float arg0) {
        if (this.field7624 != arg0) {
            this.field7624 = arg0;
            this.method3003((byte) -41);
        }
        ++field7455;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 4352)
    public final void method353(Canvas arg0) {
        this.field7358 = null;
        ++field7461;
        this.field7389 = 0L;
        if (arg0 != null && this.field7402 != arg0) {
            if (this.field7420.containsKey(arg0)) {
                Long var2 = (Long) this.field7420.get(arg0);
                this.field7389 = var2;
                this.field7358 = arg0;
            }
        } else {
            this.field7389 = this.field7515;
            this.field7358 = this.field7402;
        }
        if (this.field7358 != null && ~this.field7389 != -1L) {
            this.field7356.setSurface(this.field7389);
            this.method2993((byte) -31);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ac", name = "HA", descriptor = "(IIII[I)V", line = 4384)
    public final void method436(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field7502;
        float var6 = (float) arg2 * this.field7559.field3252 + (float) arg0 * this.field7559.field3281 + (float) arg1 * this.field7559.field3257 + this.field7559.field3259;
        if (!(var6 < (float) this.field7615) && !(var6 > (float) this.field7600)) {
            int var7 = (int) (((float) arg2 * this.field7559.field3264 + (float) arg0 * this.field7559.field3287 + (float) arg1 * this.field7559.field3263 + this.field7559.field3253) * (float) this.field7630 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field7559.field3288 + (float) arg0 * this.field7559.field3261 + (float) arg1 * this.field7559.field3255 + this.field7559.field3278) * (float) this.field7592 / (float) arg3);
            if ((float) var7 >= this.field7632 && this.field7575 >= (float) var7 && (float) var8 >= this.field7570 && (float) var8 <= this.field7648) {
                arg4[2] = (int) var6;
                arg4[1] = (int) ((float) var8 + -this.field7570);
                arg4[0] = (int) ((float) var7 - this.field7632);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(ZI)V", line = 4415)
    public final void method3048(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.field7619 = null;
        }
        if (arg0 == !this.field7616) {
            this.field7616 = arg0;
            this.method2969(2896);
        }
        ++field7483;
    }

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "()Z", line = 4438)
    public final boolean method404() {
        ++field7453;
        return true;
    }

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "(I)V", line = 4446)
    private final void method3049(int arg0) {
        ++field7388;
        this.field7570 = (float) (this.field7613 - this.field7605);
        this.field7632 = (float) (this.field7581 - this.field7662);
        this.field7648 = (float) (-this.field7605 + this.field7625);
        this.field7575 = (float) (-this.field7662 + this.field7643);
        if (arg0 != 4353) {
            this.field7585 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(Lhg;I)V", line = 4464)
    public final void method3050(class691 arg0, int arg1) {
        if (arg1 == -1) {
            ++field7416;
            if (!this.field7586) {
                if (~this.field7542 <= -1 && this.field7543[this.field7542] == arg0) {
                    this.field7543[this.field7542--] = null;
                    arg0.method2101((byte) 69);
                    if (~this.field7542 > -1) {
                        this.field7536 = this.field7539 = null;
                    } else {
                        this.field7536 = this.field7539 = this.field7543[this.field7542];
                        this.field7536.method2087((byte) 110);
                    }
                } else {
                    throw new RuntimeException();
                }
            } else {
                this.method2975(arg0, 88);
                this.method3012(0, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIILaa;II)V", line = 4499)
    public final void method433(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class487 arg6, int arg7, int arg8) {
        ++field7477;
        class24 var10 = (class24) arg6;
        class495 var11 = var10.field180;
        this.method2972((byte) -99);
        this.method3006(1, var10.field180);
        this.method3013((byte) -109, arg5);
        this.method3042(8448, 8960, 7681);
        this.method2983(0, 768, 90, 34167);
        float var12 = var11.field6740 / (float) var11.field6742;
        float var13 = var11.field6744 / (float) var11.field6739;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var17 = var15 * var16;
        float var18 = var14 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var18 + 0.35F, (float) arg3 + var17 + 0.35F);
        OpenGL.glEnd();
        this.method2983(0, 768, -52, 5890);
    }

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "()Lhba;", line = 4537)
    public final class10 method410() {
        ++field7500;
        return this.field7526;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZII)V", line = 4548)
    public final void method3051(boolean arg0, int arg1, int arg2) {
        if (arg1 > -61) {
            this.method438(-111);
        }
        this.method3040(arg2, true, arg0, (byte) -70);
        ++field7457;
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "()Z", line = 4560)
    public final boolean method377() {
        ++field7407;
        return this.field7522 != null && this.field7522.method3079(0);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILgca;)V", line = 4573)
    public final void method3052(int arg0, class253 arg1) {
        ++field7495;
        OpenGL.glLoadMatrixf(arg1.method1507(-108), 0);
        if (arg0 != -32076) {
            this.method391(110, 43, -54, 86, -102, -54);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIIIIIII)V", line = 4584)
    public final void method355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.method3002(-100);
        ++field7496;
        this.method3013((byte) -127, arg12);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZI)V", line = 4603)
    public final void method3053(int arg0, int arg1, boolean arg2, int arg3) {
        ++field7514;
        OpenGL.glDrawArrays(arg0, arg3, arg1);
        if (arg2) {
            this.method419();
        }
    }
}
