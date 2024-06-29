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

@OriginalClass("client!qj")
public class class548 extends class566 {

    @OriginalMember(owner = "client!qj", name = "Bb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field7339 = new Hashtable();

    @OriginalMember(owner = "client!qj", name = "Wd", descriptor = "I")
    public int field7464 = 128;

    @OriginalMember(owner = "client!qj", name = "Gd", descriptor = "Lsu;")
    private class154 field7448 = new class154();

    @OriginalMember(owner = "client!qj", name = "ge", descriptor = "Ldb;")
    private class159 field7474 = new class159();

    @OriginalMember(owner = "client!qj", name = "he", descriptor = "Ldb;")
    public class159 field7475 = new class159();

    @OriginalMember(owner = "client!qj", name = "le", descriptor = "I")
    public int field7479 = 3;

    @OriginalMember(owner = "client!qj", name = "me", descriptor = "I")
    public int field7480 = 8;

    @OriginalMember(owner = "client!qj", name = "oe", descriptor = "Z")
    private boolean field7482 = false;

    @OriginalMember(owner = "client!qj", name = "ke", descriptor = "Lae;")
    private class40 field7478 = new class40();

    @OriginalMember(owner = "client!qj", name = "te", descriptor = "[Ljh;")
    private class607[] field7487 = new class607[4];

    @OriginalMember(owner = "client!qj", name = "se", descriptor = "I")
    private int field7486 = -1;

    @OriginalMember(owner = "client!qj", name = "ue", descriptor = "I")
    private int field7488 = -1;

    @OriginalMember(owner = "client!qj", name = "we", descriptor = "[Ljh;")
    private class607[] field7490 = new class607[4];

    @OriginalMember(owner = "client!qj", name = "xe", descriptor = "[Ljh;")
    private class607[] field7491 = new class607[4];

    @OriginalMember(owner = "client!qj", name = "ye", descriptor = "I")
    private int field7492 = -1;

    @OriginalMember(owner = "client!qj", name = "re", descriptor = "Lje;")
    private class265 field7485 = new class265();

    @OriginalMember(owner = "client!qj", name = "Ae", descriptor = "Lil;")
    private class68 field7494 = new class68(16);

    @OriginalMember(owner = "client!qj", name = "Be", descriptor = "Lae;")
    private class40 field7495 = new class40();

    @OriginalMember(owner = "client!qj", name = "Ge", descriptor = "Lae;")
    private class40 field7500 = new class40();

    @OriginalMember(owner = "client!qj", name = "He", descriptor = "Lae;")
    private class40 field7501 = new class40();

    @OriginalMember(owner = "client!qj", name = "Ie", descriptor = "Lae;")
    private class40 field7502 = new class40();

    @OriginalMember(owner = "client!qj", name = "Je", descriptor = "Lae;")
    private class40 field7503 = new class40();

    @OriginalMember(owner = "client!qj", name = "Ke", descriptor = "Lae;")
    private class40 field7504 = new class40();

    @OriginalMember(owner = "client!qj", name = "Le", descriptor = "Lae;")
    private class40 field7505 = new class40();

    @OriginalMember(owner = "client!qj", name = "Ne", descriptor = "Ldb;")
    public class159 field7507 = new class159();

    @OriginalMember(owner = "client!qj", name = "Ve", descriptor = "Ldb;")
    public class159 field7515 = new class159();

    @OriginalMember(owner = "client!qj", name = "We", descriptor = "Ldb;")
    public class159 field7516 = new class159();

    @OriginalMember(owner = "client!qj", name = "nf", descriptor = "I")
    public int field7532 = -1;

    @OriginalMember(owner = "client!qj", name = "af", descriptor = "F")
    public float field7520 = 3584.0F;

    @OriginalMember(owner = "client!qj", name = "lf", descriptor = "F")
    public float field7530 = -1.0F;

    @OriginalMember(owner = "client!qj", name = "bf", descriptor = "I")
    public int field7521 = -1;

    @OriginalMember(owner = "client!qj", name = "yf", descriptor = "I")
    public int field7543 = 0;

    @OriginalMember(owner = "client!qj", name = "Tf", descriptor = "I")
    private int field7564 = 0;

    @OriginalMember(owner = "client!qj", name = "Mf", descriptor = "Z")
    private boolean field7557 = false;

    @OriginalMember(owner = "client!qj", name = "rf", descriptor = "F")
    private float field7536 = 1.0F;

    @OriginalMember(owner = "client!qj", name = "qf", descriptor = "I")
    private int field7535 = 0;

    @OriginalMember(owner = "client!qj", name = "hg", descriptor = "I")
    private int field7578 = -1;

    @OriginalMember(owner = "client!qj", name = "If", descriptor = "F")
    public float field7553 = -1.0F;

    @OriginalMember(owner = "client!qj", name = "jf", descriptor = "[F")
    private float[] field7528 = new float[4];

    @OriginalMember(owner = "client!qj", name = "Ze", descriptor = "I")
    private int field7519 = 3584;

    @OriginalMember(owner = "client!qj", name = "gf", descriptor = "I")
    private int field7526 = 0;

    @OriginalMember(owner = "client!qj", name = "pf", descriptor = "F")
    public float field7534 = 1.0F;

    @OriginalMember(owner = "client!qj", name = "rg", descriptor = "I")
    private int field7588 = 8448;

    @OriginalMember(owner = "client!qj", name = "cg", descriptor = "[F")
    private float[] field7573 = new float[4];

    @OriginalMember(owner = "client!qj", name = "cf", descriptor = "I")
    public int field7522 = 0;

    @OriginalMember(owner = "client!qj", name = "wf", descriptor = "F")
    public float field7541 = 1.0F;

    @OriginalMember(owner = "client!qj", name = "Jf", descriptor = "I")
    public int field7554 = 50;

    @OriginalMember(owner = "client!qj", name = "ug", descriptor = "F")
    private float field7591 = -1.0F;

    @OriginalMember(owner = "client!qj", name = "Ug", descriptor = "I")
    private int field7617 = 0;

    @OriginalMember(owner = "client!qj", name = "eg", descriptor = "I")
    public int field7575 = 512;

    @OriginalMember(owner = "client!qj", name = "Lg", descriptor = "[F")
    private float[] field7608 = new float[16];

    @OriginalMember(owner = "client!qj", name = "Xe", descriptor = "F")
    private float field7517 = 0.0F;

    @OriginalMember(owner = "client!qj", name = "bg", descriptor = "I")
    public int field7572 = 512;

    @OriginalMember(owner = "client!qj", name = "Vg", descriptor = "F")
    private float field7618 = 1.0F;

    @OriginalMember(owner = "client!qj", name = "ag", descriptor = "I")
    public int field7571 = 0;

    @OriginalMember(owner = "client!qj", name = "Gg", descriptor = "F")
    public float field7603 = 3584.0F;

    @OriginalMember(owner = "client!qj", name = "Hg", descriptor = "F")
    private float field7604 = -1.0F;

    @OriginalMember(owner = "client!qj", name = "Yg", descriptor = "Z")
    private boolean field7621 = true;

    @OriginalMember(owner = "client!qj", name = "sg", descriptor = "I")
    public int field7589 = -1;

    @OriginalMember(owner = "client!qj", name = "Xg", descriptor = "F")
    public float field7620 = 1.0F;

    @OriginalMember(owner = "client!qj", name = "Sg", descriptor = "I")
    private int field7615 = 8448;

    @OriginalMember(owner = "client!qj", name = "Rg", descriptor = "[Lgga;")
    private class332[] field7614 = new class332[class270.field3422];

    @OriginalMember(owner = "client!qj", name = "kg", descriptor = "I")
    public int field7581 = 0;

    @OriginalMember(owner = "client!qj", name = "yg", descriptor = "I")
    private int field7595 = 0;

    @OriginalMember(owner = "client!qj", name = "Ng", descriptor = "[F")
    public float[] field7610 = new float[4];

    @OriginalMember(owner = "client!qj", name = "ah", descriptor = "I")
    public int field7623 = -1;

    @OriginalMember(owner = "client!qj", name = "ch", descriptor = "I")
    private int field7625 = 0;

    @OriginalMember(owner = "client!qj", name = "Wg", descriptor = "[F")
    private float[] field7619 = new float[4];

    @OriginalMember(owner = "client!qj", name = "Zf", descriptor = "Lfw;")
    public class458 field7570 = new class458(8192);

    @OriginalMember(owner = "client!qj", name = "fh", descriptor = "[B")
    public byte[] field7628 = new byte[16384];

    @OriginalMember(owner = "client!qj", name = "hh", descriptor = "[I")
    public int[] field7630 = new int[1];

    @OriginalMember(owner = "client!qj", name = "ih", descriptor = "[I")
    public int[] field7631 = new int[1];

    @OriginalMember(owner = "client!qj", name = "jh", descriptor = "[I")
    public int[] field7632 = new int[1];

    @OriginalMember(owner = "client!qj", name = "Sc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7408;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7281;

    @OriginalMember(owner = "client!qj", name = "Ed", descriptor = "I")
    public int field7446;

    @OriginalMember(owner = "client!qj", name = "ud", descriptor = "Ljaggl/OpenGL;")
    public OpenGL field7436;

    @OriginalMember(owner = "client!qj", name = "Lb", descriptor = "J")
    private long field7349;

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "J")
    private long field7289;

    @OriginalMember(owner = "client!qj", name = "ig", descriptor = "Z")
    public boolean field7579;

    @OriginalMember(owner = "client!qj", name = "Zg", descriptor = "I")
    public int field7622;

    @OriginalMember(owner = "client!qj", name = "Uf", descriptor = "Ljava/lang/String;")
    private String field7565;

    @OriginalMember(owner = "client!qj", name = "zg", descriptor = "Z")
    public boolean field7596;

    @OriginalMember(owner = "client!qj", name = "Bg", descriptor = "Z")
    public boolean field7598;

    @OriginalMember(owner = "client!qj", name = "Cg", descriptor = "Z")
    private boolean field7599;

    @OriginalMember(owner = "client!qj", name = "vf", descriptor = "Z")
    public boolean field7540;

    @OriginalMember(owner = "client!qj", name = "mg", descriptor = "Z")
    private boolean field7583;

    @OriginalMember(owner = "client!qj", name = "hf", descriptor = "Z")
    public boolean field7527;

    @OriginalMember(owner = "client!qj", name = "Pg", descriptor = "Ljava/lang/String;")
    private String field7612;

    @OriginalMember(owner = "client!qj", name = "wg", descriptor = "Z")
    public boolean field7593;

    @OriginalMember(owner = "client!qj", name = "Ag", descriptor = "Z")
    private boolean field7597;

    @OriginalMember(owner = "client!qj", name = "Id", descriptor = "Ltaa;")
    private class294 field7450;

    @OriginalMember(owner = "client!qj", name = "ie", descriptor = "Lgk;")
    public class619 field7476;

    @OriginalMember(owner = "client!qj", name = "Jd", descriptor = "Ldk;")
    private class551 field7451;

    @OriginalMember(owner = "client!qj", name = "Yd", descriptor = "Lbf;")
    private class245 field7466;

    @OriginalMember(owner = "client!qj", name = "Td", descriptor = "Lkfa;")
    private class584 field7461;

    @OriginalMember(owner = "client!qj", name = "Yc", descriptor = "F")
    public static float field7414;

    @OriginalMember(owner = "client!qj", name = "ff", descriptor = "F")
    public float field7525;

    @OriginalMember(owner = "client!qj", name = "Af", descriptor = "F")
    private float field7545;

    @OriginalMember(owner = "client!qj", name = "Bf", descriptor = "F")
    private float field7546;

    @OriginalMember(owner = "client!qj", name = "Ff", descriptor = "F")
    private float field7550;

    @OriginalMember(owner = "client!qj", name = "Pf", descriptor = "F")
    public float field7560;

    @OriginalMember(owner = "client!qj", name = "Xf", descriptor = "F")
    public float field7568;

    @OriginalMember(owner = "client!qj", name = "lg", descriptor = "F")
    public float field7582;

    @OriginalMember(owner = "client!qj", name = "ng", descriptor = "F")
    public float field7584;

    @OriginalMember(owner = "client!qj", name = "dh", descriptor = "F")
    public float field7626;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "I")
    private int field7288;

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "I")
    public static int field7293;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "I")
    public static int field7297;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!qj", name = "W", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!qj", name = "X", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!qj", name = "Y", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!qj", name = "Z", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!qj", name = "ab", descriptor = "I")
    public static int field7312;

    @OriginalMember(owner = "client!qj", name = "bb", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!qj", name = "cb", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!qj", name = "db", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!qj", name = "eb", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!qj", name = "fb", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!qj", name = "gb", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!qj", name = "hb", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!qj", name = "ib", descriptor = "I")
    public int field7320;

    @OriginalMember(owner = "client!qj", name = "jb", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!qj", name = "kb", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!qj", name = "lb", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!qj", name = "mb", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!qj", name = "nb", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!qj", name = "ob", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!qj", name = "pb", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!qj", name = "qb", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!qj", name = "rb", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!qj", name = "sb", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!qj", name = "tb", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!qj", name = "ub", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!qj", name = "vb", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!qj", name = "wb", descriptor = "I")
    public static int field7334;

    @OriginalMember(owner = "client!qj", name = "xb", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!qj", name = "yb", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!qj", name = "zb", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!qj", name = "Ab", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!qj", name = "Cb", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!qj", name = "Db", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!qj", name = "Eb", descriptor = "I")
    public static int field7342;

    @OriginalMember(owner = "client!qj", name = "Fb", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!qj", name = "Gb", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!qj", name = "Hb", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!qj", name = "Ib", descriptor = "I")
    public static int field7346;

    @OriginalMember(owner = "client!qj", name = "Jb", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!qj", name = "Kb", descriptor = "I")
    public static int field7348;

    @OriginalMember(owner = "client!qj", name = "Mb", descriptor = "I")
    public static int field7350;

    @OriginalMember(owner = "client!qj", name = "Nb", descriptor = "I")
    public static int field7351;

    @OriginalMember(owner = "client!qj", name = "Ob", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!qj", name = "Pb", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!qj", name = "Qb", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!qj", name = "Rb", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!qj", name = "Sb", descriptor = "I")
    public static int field7356;

    @OriginalMember(owner = "client!qj", name = "Tb", descriptor = "I")
    public static int field7357;

    @OriginalMember(owner = "client!qj", name = "Ub", descriptor = "I")
    public static int field7358;

    @OriginalMember(owner = "client!qj", name = "Vb", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!qj", name = "Wb", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!qj", name = "Xb", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!qj", name = "Yb", descriptor = "I")
    public static int field7362;

    @OriginalMember(owner = "client!qj", name = "Zb", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!qj", name = "ac", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!qj", name = "bc", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!qj", name = "cc", descriptor = "I")
    public static int field7366;

    @OriginalMember(owner = "client!qj", name = "dc", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!qj", name = "ec", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!qj", name = "fc", descriptor = "I")
    public static int field7369;

    @OriginalMember(owner = "client!qj", name = "gc", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!qj", name = "hc", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!qj", name = "ic", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!qj", name = "jc", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!qj", name = "kc", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!qj", name = "lc", descriptor = "I")
    public static int field7375;

    @OriginalMember(owner = "client!qj", name = "mc", descriptor = "I")
    public static int field7376;

    @OriginalMember(owner = "client!qj", name = "nc", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!qj", name = "oc", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!qj", name = "pc", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!qj", name = "qc", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!qj", name = "rc", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!qj", name = "sc", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!qj", name = "tc", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!qj", name = "uc", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!qj", name = "vc", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!qj", name = "wc", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!qj", name = "xc", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!qj", name = "yc", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!qj", name = "zc", descriptor = "I")
    public static int field7389;

    @OriginalMember(owner = "client!qj", name = "Ac", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!qj", name = "Bc", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!qj", name = "Cc", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!qj", name = "Dc", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!qj", name = "Ec", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!qj", name = "Fc", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!qj", name = "Gc", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!qj", name = "Hc", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!qj", name = "Ic", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!qj", name = "Jc", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!qj", name = "Kc", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!qj", name = "Lc", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!qj", name = "Mc", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!qj", name = "Nc", descriptor = "I")
    public static int field7403;

    @OriginalMember(owner = "client!qj", name = "Oc", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!qj", name = "Pc", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!qj", name = "Qc", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!qj", name = "Rc", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!qj", name = "Tc", descriptor = "I")
    private int field7409;

    @OriginalMember(owner = "client!qj", name = "Uc", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!qj", name = "Vc", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!qj", name = "Wc", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!qj", name = "Xc", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!qj", name = "Zc", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!qj", name = "ad", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!qj", name = "bd", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!qj", name = "cd", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!qj", name = "dd", descriptor = "I")
    public static int field7419;

    @OriginalMember(owner = "client!qj", name = "ed", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!qj", name = "fd", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!qj", name = "gd", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!qj", name = "hd", descriptor = "I")
    public static int field7423;

    @OriginalMember(owner = "client!qj", name = "id", descriptor = "I")
    public static int field7424;

    @OriginalMember(owner = "client!qj", name = "jd", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!qj", name = "kd", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!qj", name = "ld", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!qj", name = "md", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!qj", name = "nd", descriptor = "I")
    public static int field7429;

    @OriginalMember(owner = "client!qj", name = "od", descriptor = "I")
    public int field7430;

    @OriginalMember(owner = "client!qj", name = "pd", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!qj", name = "qd", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!qj", name = "rd", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!qj", name = "sd", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!qj", name = "td", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!qj", name = "vd", descriptor = "I")
    public static int field7437;

    @OriginalMember(owner = "client!qj", name = "wd", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!qj", name = "xd", descriptor = "I")
    public static int field7439;

    @OriginalMember(owner = "client!qj", name = "yd", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!qj", name = "zd", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!qj", name = "Ad", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!qj", name = "Bd", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!qj", name = "Cd", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!qj", name = "Dd", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!qj", name = "Fd", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!qj", name = "Hd", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!qj", name = "Kd", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!qj", name = "Ld", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!qj", name = "Md", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!qj", name = "Nd", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!qj", name = "Od", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!qj", name = "Pd", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!qj", name = "Qd", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!qj", name = "Rd", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!qj", name = "Sd", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!qj", name = "Ud", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!qj", name = "Vd", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!qj", name = "Xd", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!qj", name = "Zd", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!qj", name = "ae", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!qj", name = "be", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!qj", name = "ce", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!qj", name = "de", descriptor = "I")
    public static int field7471;

    @OriginalMember(owner = "client!qj", name = "ee", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!qj", name = "fe", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!qj", name = "je", descriptor = "I")
    public int field7477;

    @OriginalMember(owner = "client!qj", name = "Ce", descriptor = "I")
    private int field7496;

    @OriginalMember(owner = "client!qj", name = "De", descriptor = "I")
    public int field7497;

    @OriginalMember(owner = "client!qj", name = "Ee", descriptor = "I")
    public int field7498;

    @OriginalMember(owner = "client!qj", name = "Fe", descriptor = "I")
    private int field7499;

    @OriginalMember(owner = "client!qj", name = "Me", descriptor = "I")
    private int field7506;

    @OriginalMember(owner = "client!qj", name = "Oe", descriptor = "I")
    private int field7508;

    @OriginalMember(owner = "client!qj", name = "Se", descriptor = "I")
    private int field7512;

    @OriginalMember(owner = "client!qj", name = "Ye", descriptor = "I")
    private int field7518;

    @OriginalMember(owner = "client!qj", name = "kf", descriptor = "I")
    private int field7529;

    @OriginalMember(owner = "client!qj", name = "sf", descriptor = "I")
    private int field7537;

    @OriginalMember(owner = "client!qj", name = "Cf", descriptor = "I")
    private int field7547;

    @OriginalMember(owner = "client!qj", name = "Ef", descriptor = "I")
    private int field7549;

    @OriginalMember(owner = "client!qj", name = "Nf", descriptor = "I")
    public int field7558;

    @OriginalMember(owner = "client!qj", name = "Qf", descriptor = "I")
    public int field7561;

    @OriginalMember(owner = "client!qj", name = "Sf", descriptor = "I")
    private int field7563;

    @OriginalMember(owner = "client!qj", name = "Eg", descriptor = "I")
    public int field7601;

    @OriginalMember(owner = "client!qj", name = "Fg", descriptor = "I")
    public int field7602;

    @OriginalMember(owner = "client!qj", name = "Ig", descriptor = "I")
    private int field7605;

    @OriginalMember(owner = "client!qj", name = "bh", descriptor = "I")
    private int field7624;

    @OriginalMember(owner = "client!qj", name = "eh", descriptor = "I")
    private int field7627;

    @OriginalMember(owner = "client!qj", name = "gh", descriptor = "I")
    private int field7629;

    @OriginalMember(owner = "client!qj", name = "Te", descriptor = "J")
    private long field7513;

    @OriginalMember(owner = "client!qj", name = "Og", descriptor = "Ldw;")
    private class125 field7611;

    @OriginalMember(owner = "client!qj", name = "ve", descriptor = "Lqk;")
    private class12 field7489;

    @OriginalMember(owner = "client!qj", name = "tf", descriptor = "Lqk;")
    public class12 field7538;

    @OriginalMember(owner = "client!qj", name = "Yf", descriptor = "Lpm;")
    public class133 field7569;

    @OriginalMember(owner = "client!qj", name = "df", descriptor = "Lvaa;")
    public class263 field7523;

    @OriginalMember(owner = "client!qj", name = "uf", descriptor = "Lvaa;")
    public class263 field7539;

    @OriginalMember(owner = "client!qj", name = "Gf", descriptor = "Lvaa;")
    public class263 field7551;

    @OriginalMember(owner = "client!qj", name = "Of", descriptor = "Lvaa;")
    public class263 field7559;

    @OriginalMember(owner = "client!qj", name = "Rf", descriptor = "Lvaa;")
    public class263 field7562;

    @OriginalMember(owner = "client!qj", name = "Wf", descriptor = "Lvaa;")
    public class263 field7567;

    @OriginalMember(owner = "client!qj", name = "og", descriptor = "Lvaa;")
    public class263 field7585;

    @OriginalMember(owner = "client!qj", name = "Dg", descriptor = "Lvaa;")
    public class263 field7600;

    @OriginalMember(owner = "client!qj", name = "Jg", descriptor = "Lvaa;")
    public class263 field7606;

    @OriginalMember(owner = "client!qj", name = "Tg", descriptor = "Lvaa;")
    public class263 field7616;

    @OriginalMember(owner = "client!qj", name = "gg", descriptor = "Lbm;")
    private class297 field7577;

    @OriginalMember(owner = "client!qj", name = "mf", descriptor = "Lgv;")
    public class325 field7531;

    @OriginalMember(owner = "client!qj", name = "fg", descriptor = "Lgv;")
    public class325 field7576;

    @OriginalMember(owner = "client!qj", name = "qe", descriptor = "Leca;")
    private class417 field7484;

    @OriginalMember(owner = "client!qj", name = "jg", descriptor = "Lar;")
    private class4 field7580;

    @OriginalMember(owner = "client!qj", name = "Df", descriptor = "Lnl;")
    private class585 field7548;

    @OriginalMember(owner = "client!qj", name = "Qg", descriptor = "Lnl;")
    private class585 field7613;

    @OriginalMember(owner = "client!qj", name = "pe", descriptor = "Ljh;")
    private class607 field7483;

    @OriginalMember(owner = "client!qj", name = "ze", descriptor = "Ljh;")
    private class607 field7493;

    @OriginalMember(owner = "client!qj", name = "ne", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field7481;

    @OriginalMember(owner = "client!qj", name = "Pe", descriptor = "Z")
    private boolean field7509;

    @OriginalMember(owner = "client!qj", name = "Qe", descriptor = "Z")
    private boolean field7510;

    @OriginalMember(owner = "client!qj", name = "Re", descriptor = "Z")
    private boolean field7511;

    @OriginalMember(owner = "client!qj", name = "Ue", descriptor = "Z")
    private boolean field7514;

    @OriginalMember(owner = "client!qj", name = "ef", descriptor = "Z")
    public boolean field7524;

    @OriginalMember(owner = "client!qj", name = "of", descriptor = "Z")
    private boolean field7533;

    @OriginalMember(owner = "client!qj", name = "xf", descriptor = "Z")
    public boolean field7542;

    @OriginalMember(owner = "client!qj", name = "zf", descriptor = "Z")
    public boolean field7544;

    @OriginalMember(owner = "client!qj", name = "Hf", descriptor = "Z")
    public boolean field7552;

    @OriginalMember(owner = "client!qj", name = "Kf", descriptor = "Z")
    private boolean field7555;

    @OriginalMember(owner = "client!qj", name = "Lf", descriptor = "Z")
    public boolean field7556;

    @OriginalMember(owner = "client!qj", name = "Vf", descriptor = "Z")
    private boolean field7566;

    @OriginalMember(owner = "client!qj", name = "dg", descriptor = "Z")
    private boolean field7574;

    @OriginalMember(owner = "client!qj", name = "pg", descriptor = "Z")
    public boolean field7586;

    @OriginalMember(owner = "client!qj", name = "tg", descriptor = "Z")
    private boolean field7590;

    @OriginalMember(owner = "client!qj", name = "vg", descriptor = "Z")
    public boolean field7592;

    @OriginalMember(owner = "client!qj", name = "xg", descriptor = "Z")
    private boolean field7594;

    @OriginalMember(owner = "client!qj", name = "Kg", descriptor = "Z")
    public boolean field7607;

    @OriginalMember(owner = "client!qj", name = "Mg", descriptor = "Z")
    private boolean field7609;

    @OriginalMember(owner = "client!qj", name = "qg", descriptor = "[Lrg;")
    private class615[] field7587;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)V")
    public final synchronized void method2946(int arg0, byte arg1) {
        ++field7468;
        class329 var3 = new class329();
        var3.field4199 = (long) arg0;
        if (arg1 >= 97) {
            this.field7504.method239(var3, (byte) 93);
        }
    }

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "(I)V")
    private final void method2947(int arg0) {
        if (arg0 != 16711680) {
            this.method1054(1.8107573F);
        }
        ++field7420;
        if (~this.field7549 != -4) {
            this.field7549 = 3;
            this.method2957(5888);
            this.method3019((byte) 29);
            this.field7508 &= -8;
        }
    }

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "(IIIII)V")
    public final void method1002(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7393;
        this.method2992(-88);
        this.method3017((byte) 97, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(II)I")
    public final int method2948(int arg0, int arg1) {
        if (arg1 != 260) {
            return -100;
        } else {
            ++field7290;
            if (arg0 == 1) {
                return 7681;
            } else if (arg0 != 0) {
                if (~arg0 == -3) {
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
                return 8448;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIII)V")
    public final void method1078(int arg0, int arg1, int arg2, int arg3) {
        ++field7473;
        this.field7451.method3047(-42, arg1, arg3, arg2, arg0);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZZ)V")
    public final void method2949(int arg0, boolean arg1, boolean arg2) {
        this.method2979(arg0, 126, arg1, arg2);
        ++field7295;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Laga;Z)Lf;")
    public final class536 method1072(class661 arg0, boolean arg1) {
        ++field7445;
        int[] var3 = new int[arg0.field9353 * arg0.field9351];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field9355 != null) {
            for (int var6 = 0; arg0.field9353 > var6; ++var6) {
                for (int var7 = 0; ~arg0.field9351 < ~var7; ++var7) {
                    var3[var5++] = class444.method2376(arg0.field9355[var4] << 24, arg0.field9358[class695.method3921(255, arg0.field9352[var4])]);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; ~arg0.field9353 < ~var8; ++var8) {
                for (int var10 = 0; arg0.field9351 > var10; ++var10) {
                    int var11 = arg0.field9358[arg0.field9352[var4++] & 255];
                    var3[var5++] = ~var11 == -1 ? 0 : class444.method2376(-16777216, var11);
                }
            }
        }
        class536 var9 = this.method1025(var3, 0, arg0.field9351, arg0.field9351, arg0.field9353);
        var9.method161(arg0.field9354, arg0.field9356, arg0.field9350, arg0.field9357);
        return var9;
    }

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "(I)V")
    public final void method2950(int arg0) {
        ++field7415;
        if (~this.field7508 != -17) {
            this.method2947(16711680);
            this.method2971(true, (byte) -114);
            this.method3007(65, true);
            this.method2953(true, 122);
            this.method3017((byte) 56, 1);
            this.field7508 = 16;
        }
        if (arg0 != 379) {
            this.method1031();
        }
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)V")
    public final void method1040(int arg0) {
        ++field7406;
        this.method2959(118);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljh;B)V")
    public final void method2951(class607 arg0, byte arg1) {
        ++field7278;
        if (~this.field7492 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field7492 >= 0) {
                this.field7491[this.field7492].method104(16401);
            }
            if (arg1 != -20) {
                this.method1082();
            }
            this.field7493 = this.field7491[++this.field7492] = arg0;
            this.field7493.method101((byte) 104);
        }
    }

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "()Loa;")
    public final class226 method1001() {
        ++field7328;
        int var1 = -1;
        if (this.field7612.indexOf("nvidia") == -1) {
            if (~this.field7612.indexOf("intel") == 0) {
                if (~this.field7612.indexOf("ati") != 0) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class226(var1, "OpenGL", this.field7547, this.field7565, 0L);
    }

    @OriginalMember(owner = "client!qj", name = "da", descriptor = "(IIII)V")
    public final void method1083(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 0) {
            arg1 = 0;
        }
        ++field7305;
        if (arg3 > this.field7320) {
            arg3 = this.field7320;
        }
        if (~arg2 < ~this.field7430) {
            arg2 = this.field7430;
        }
        if (~arg0 > -1) {
            arg0 = 0;
        }
        this.field7617 = arg0;
        this.field7625 = arg3;
        this.field7535 = arg1;
        this.field7595 = arg2;
        OpenGL.glEnable(3089);
        this.method2980(0);
        this.method2954((byte) 42);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(Ljh;B)V")
    public final void method2952(class607 arg0, byte arg1) {
        ++field7293;
        if (this.field7488 >= 3) {
            throw new RuntimeException();
        } else {
            if (this.field7488 >= 0) {
                this.field7487[this.field7488].method90(arg1 + 20865);
            }
            this.field7483 = this.field7487[++this.field7488] = arg0;
            if (arg1 != 101) {
                this.field7527 = true;
            }
            this.field7483.method98(-128);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lir;I)V")
    public final void method999(class27 arg0, int arg1) {
        ++field7358;
        this.field7448.method882(false, arg0, this, arg1);
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "()Z")
    public final boolean method985() {
        ++field7365;
        return this.field7609 && (!this.method1006() || this.field7566);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZI)V")
    public final void method2953(boolean arg0, int arg1) {
        if (!this.field7514 == arg0) {
            this.field7514 = arg0;
            this.method3009((byte) 100);
            this.field7508 &= -32;
        }
        ++field7277;
        int var3 = 2 % ((arg1 - 56) / 61);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    private final void method2954(byte arg0) {
        int var2 = -46 % ((-26 - arg0) / 36);
        ++field7377;
        if (this.field7595 >= this.field7617 && ~this.field7535 >= ~this.field7625) {
            OpenGL.glScissor(this.field7617 + this.field7526, -this.field7625 + this.field7320 + this.field7564, this.field7595 - this.field7617, -this.field7535 + this.field7625);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lf;Z)V")
    public final void method976(class536 arg0, boolean arg1) {
        ++field7342;
        this.field7484 = (class417) arg0;
        if (!this.field7593) {
            if (!this.field7574) {
                throw new RuntimeException("");
            }
            class659 var3 = (class659) this.field7494.method399(-32748, (long) (this.field7484.method167() << 16 | this.field7484.method162()));
            if (var3 == null) {
                var3 = new class659(this, this.field7484.method167(), this.field7484.method162());
                class659 var5;
                for (this.field7499 += var3.field9346 * 4; this.field7499 > 2097152; this.field7499 -= var5.field9346) {
                    class508 var4 = this.field7485.method1544((byte) 127);
                    if (var4 == null) {
                        break;
                    }
                    var5 = (class659) var4;
                    var5.method2744((byte) -62);
                    var5.method1871(-60);
                    this.field7436.releasePbuffer(var5.method3711((byte) -114));
                }
                this.field7494.method402(var3, (byte) -62, (long) (this.field7484.method167() << 16 | this.field7484.method162()));
            }
            this.field7485.method1542((byte) -121, var3);
            this.field7436.setPbuffer(var3.method3711((byte) -103));
        } else {
            if (this.field7489 == null) {
                this.field7489 = new class12(this);
            }
            if (this.field7483 == this.field7489) {
                throw new RuntimeException();
            }
            this.method3026(255, this.field7489);
            if (arg1) {
                class400 var6 = (class400) this.field7494.method399(-32748, (long) (this.field7484.method167() << 16 | this.field7484.method162()));
                if (var6 == null) {
                    var6 = new class400(this, 6402, this.field7484.method167(), this.field7484.method162());
                    class400 var8;
                    for (this.field7499 += var6.field5022; ~this.field7499 < -2097153; this.field7499 -= var8.field5022) {
                        class508 var7 = this.field7485.method1544((byte) 127);
                        if (var7 == null) {
                            break;
                        }
                        var8 = (class400) var7;
                        var8.method2744((byte) -86);
                        var8.method1871(-79);
                        var8.method2133((byte) 126);
                    }
                    this.field7494.method402(var6, (byte) -106, (long) (this.field7484.method167() << 16 | this.field7484.method162()));
                }
                this.field7485.method1542((byte) -126, var6);
                this.field7489.method99(8, var6, -2693);
            }
            this.field7489.method103(this.field7484.field5238, (byte) 1, 0);
        }
        this.field7430 = arg0.method167();
        this.field7320 = arg0.method162();
        this.method3016(-13);
        this.method2996((byte) 16);
        this.method1017();
    }

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "(I)V")
    private final void method2955(int arg0) {
        if (arg0 != 13842) {
            this.method1086((Canvas) null);
        }
        if (this.field7555) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field7555 = false;
        }
        ++field7405;
    }

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "(I)V")
    private final void method2956(int arg0) {
        ++field7326;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field7608, 0);
        if (arg0 != 692534472) {
            this.field7622 = 23;
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "()Z")
    public final boolean method975() {
        ++field7331;
        return true;
    }

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "(IIII)[I")
    public final int[] method1037(int arg0, int arg1, int arg2, int arg3) {
        ++field7387;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + -var6 + this.field7320, arg2, 1, 32993, this.field7622, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method2992(-2);
        ++field7424;
        this.method3017((byte) 83, arg9);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "(I)V")
    private final void method2957(int arg0) {
        ++field7324;
        float var2 = (float) (-this.field7581) * this.field7618 / (float) this.field7572;
        float var3 = (float) (-this.field7571) * this.field7618 / (float) this.field7575;
        float var4 = (float) (this.field7430 - this.field7581) * this.field7618 / (float) this.field7572;
        float var5 = (float) (-this.field7571 + this.field7320) * this.field7618 / (float) this.field7575;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field7554, (double) this.field7519);
        }
        OpenGL.glMatrixMode(arg0);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V")
    private final void method2958(byte arg0) {
        ++field7354;
        class4.field115[1] = this.field7620 * this.field7568;
        class4.field115[0] = this.field7568 * this.field7541;
        class4.field115[2] = this.field7568 * this.field7534;
        class4.field115[3] = 1.0F;
        if (arg0 != 42) {
            this.method2955(65);
        }
        OpenGL.glLightModelfv(2899, class4.field115, 0);
    }

    @OriginalMember(owner = "client!qj", name = "ra", descriptor = "(F)V")
    public final void method1054(float arg0) {
        if (this.field7568 != arg0) {
            this.field7568 = arg0;
            this.method2958((byte) 42);
        }
        ++field7327;
    }

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "(I)V")
    private final void method2959(int arg0) {
        ++field7384;
        if (arg0 <= 49) {
            this.field7594 = false;
        }
        int var2 = 0;
        while (!this.field7436.method3547()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class419.method2233(-28448, 1000L);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public final class272 method1008(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field7279;
        return new class445(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "(IIII)V")
    public final void method1070(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field7617 > ~arg0) {
            this.field7617 = arg0;
        }
        if (this.field7625 > arg3) {
            this.field7625 = arg3;
        }
        if (~arg1 < ~this.field7535) {
            this.field7535 = arg1;
        }
        ++field7383;
        if (~this.field7595 < ~arg2) {
            this.field7595 = arg2;
        }
        OpenGL.glEnable(3089);
        this.method2980(0);
        this.method2954((byte) -113);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lrg;I)V")
    public final void method2960(class615 arg0, int arg1) {
        ++field7333;
        class615 var3 = this.field7587[this.field7563];
        if (arg0 != var3) {
            if (arg0 != null) {
                if (var3 == null) {
                    OpenGL.glEnable(arg0.field8638);
                } else if (arg0.field8638 != var3.field8638) {
                    OpenGL.glDisable(var3.field8638);
                    OpenGL.glEnable(arg0.field8638);
                }
                OpenGL.glBindTexture(arg0.field8638, arg0.method3389(true));
            } else {
                OpenGL.glDisable(var3.field8638);
            }
            this.field7587[this.field7563] = arg0;
        }
        this.field7508 &= arg1;
    }

    @OriginalMember(owner = "client!qj", name = "IA", descriptor = "(IIIIII[BII)V")
    public final void method1074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field7291;
        float var10;
        float var11;
        if (this.field7580 != null && ~this.field7580.field1728 <= ~arg2 && ~this.field7580.field1740 <= ~arg3) {
            this.field7580.method768(0, 6406, 0, 0, false, arg3, 3314, 0, arg6, arg2);
            var10 = (float) arg2 * this.field7580.field111 / (float) this.field7580.field1728;
            var11 = (float) arg3 * this.field7580.field109 / (float) this.field7580.field1740;
        } else {
            this.field7580 = class581.method3206(arg3, false, this, 123, arg6, arg2, 6406, 6406);
            this.field7580.method774(false, (byte) -37, false);
            var10 = this.field7580.field111;
            var11 = this.field7580.field109;
        }
        this.method3022((byte) 3);
        this.method2960(this.field7580, -2);
        this.method3017((byte) 43, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2972(-29455, arg5);
        this.method2983(34165, -465309136, 34165);
        this.method2966(0, 768, 768, 34166);
        this.method2966(2, 770, 768, 5890);
        this.method3015(34166, 770, 0, true);
        this.method3015(5890, 770, 2, true);
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
        this.method2966(0, 768, 768, 5890);
        this.method2966(2, 770, 768, 34166);
        this.method3015(5890, 770, 0, true);
        this.method3015(34166, 770, 2, true);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "()V")
    public final void method1089() {
        if (this.field7466 != null && this.field7466.method1835(-16056)) {
            this.field7451.method3041((byte) -44, this.field7466);
            this.field7450.method1648(6408);
        }
        ++field7459;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(FFF)V")
    public final void method1014(float arg0, float arg1, float arg2) {
        class280.field3512 = arg1;
        ++field7421;
        class323.field4158 = arg2;
        class270.field3411 = arg0;
    }

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "()Z")
    public final boolean method1049() {
        ++field7440;
        return this.field7466 != null && (~this.field7446 >= -2 || this.field7566);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(IB)V")
    public final void method2961(int arg0, byte arg1) {
        ++field7353;
        if (arg1 <= -13) {
            this.method2949(arg0, true, true);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljt;Ljt;FLjt;)Ljt;")
    public final class533 method1064(class533 arg0, class533 arg1, float arg2, class533 arg3) {
        ++field7389;
        if (arg0 != null && arg1 != null && this.field7556 && this.field7593) {
            class82 var5 = null;
            class297 var6 = (class297) arg0;
            class297 var7 = (class297) arg1;
            class33 var8 = var6.method266((byte) 37);
            class33 var9 = var7.method266((byte) 37);
            if (var8 != null && var9 != null) {
                int var10 = ~var8.field463 < ~var9.field463 ? var8.field463 : var9.field463;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class82) {
                    class82 var11 = (class82) arg3;
                    if (~var11.method472(30576) == ~var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class82(this, var10);
                }
                if (var5.method473(true, var9, var8, arg2)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "()I")
    public final int method1055() {
        ++field7359;
        return this.field7519;
    }

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "()V")
    public final void method1069() {
        for (class329 var1 = this.field7478.method237(114); var1 != null; var1 = this.field7478.method245((byte) 52)) {
            ((class85) var1).method486((byte) -104);
        }
        ++field7382;
        if (this.field7451 != null) {
            this.field7451.method3039(0);
        }
        if (this.field7436 != null) {
            this.method2970((byte) 17);
            Enumeration var2 = this.field7339.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field7339.get(var3);
                this.field7436.releaseSurface(var3, var4);
            }
            this.field7436.release();
            this.field7436 = null;
        }
        if (this.field7482) {
            class326.method1865(false, false, true);
            this.field7482 = false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "(I)V")
    public final void method2962(int arg0) {
        if (arg0 != 13211) {
            this.method2987(-53);
        }
        OpenGL.glLightfv(16384, 4611, this.field7610, 0);
        ++field7357;
        OpenGL.glLightfv(16385, 4611, this.field7528, 0);
    }

    @OriginalMember(owner = "client!qj", name = "CA", descriptor = "(IIII)V")
    public final void method1000(int arg0, int arg1, int arg2, int arg3) {
        this.field7589 = arg2;
        ++field7323;
        this.field7623 = arg1;
        this.field7543 = arg3;
        this.field7552 = true;
        this.field7558 = arg0;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
    public final void method1041(int arg0) {
        ++field7372;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field7464 = arg0;
            this.field7450.method1648(6408);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(II)I")
    public final int method2963(int arg0, int arg1) {
        ++field7452;
        if (arg0 != -6402) {
            this.field7604 = -1.641317F;
        }
        if (arg1 != 6406 && ~arg1 != -6410) {
            if (~arg1 != -6411 && ~arg1 != -34847 && arg1 != 34844) {
                if (arg1 != 6407) {
                    if (~arg1 != -6409 && arg1 != 34847) {
                        if (arg1 == 34843) {
                            return 6;
                        } else if (arg1 == 34842) {
                            return 8;
                        } else if (arg1 != 6402) {
                            if (~arg1 == -6402) {
                                return 1;
                            } else {
                                throw new IllegalArgumentException("");
                            }
                        } else {
                            return 3;
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

    @OriginalMember(owner = "client!qj", name = "pa", descriptor = "(III)V")
    public final void method1075(int arg0, int arg1, int arg2) {
        if (~this.field7532 != ~arg0 || ~this.field7521 != ~arg1 || this.field7522 != arg2) {
            this.field7532 = arg0;
            this.field7522 = arg2;
            this.field7521 = arg1;
            this.method3011(true);
            this.method3002(32411);
        }
        ++field7472;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLpl;II)Lsa;")
    public static final class595 method2964(byte arg0, class612 arg1, int arg2, int arg3) {
        if (arg0 != 11) {
            method2964((byte) 44, (class612) null, -80, 51);
        }
        ++field7395;
        byte[] var4 = arg1.method3365(arg2, arg0 ^ 45, arg3);
        return var4 == null ? null : new class595(var4);
    }

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "()Lq;")
    public final class491 method1087() {
        ++field7407;
        return new class159();
    }

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "(I)Lwaa;")
    public final class33 method2965(int arg0) {
        if (arg0 != 8960) {
            this.method3016(-87);
        }
        ++field7304;
        return this.field7577 == null ? null : this.field7577.method266((byte) 37);
    }

    @OriginalMember(owner = "client!qj", name = "ZA", descriptor = "(Z)V")
    public final void method1034(boolean arg0) {
        ++field7313;
        this.field7621 = arg0;
        this.method3009((byte) -107);
    }

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "()I")
    public final int method1036() {
        ++field7398;
        int var1 = this.field7627;
        this.field7627 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class536 method1053(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field7318;
        return new class417(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1086(Canvas arg0) {
        ++field7351;
        this.field7289 = 0L;
        this.field7281 = null;
        if (arg0 != null && this.field7408 != arg0) {
            if (this.field7339.containsKey(arg0)) {
                Long var2 = (Long) this.field7339.get(arg0);
                this.field7289 = var2;
                this.field7281 = arg0;
            }
        } else {
            this.field7289 = this.field7349;
            this.field7281 = this.field7408;
        }
        if (this.field7281 != null && this.field7289 != 0L) {
            this.field7436.setSurface(this.field7289);
            this.method2998(1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;I)V")
    public class548(Canvas arg0, class526 arg1, int arg2) {
        super(arg1);
        this.field7281 = this.field7408 = arg0;
        this.field7446 = arg2;
        if (!class496.method2671("jaclib", -103)) {
            throw new RuntimeException("");
        } else if (!class496.method2671("jaggl", -69)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field7436 = new OpenGL();
                this.field7289 = this.field7349 = this.field7436.init(arg0, 8, 8, 8, 24, 0, this.field7446);
                if (~this.field7349 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method2959(76);
                    int var4 = this.method3013(10505);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field7622 = this.field7579 ? 33639 : 5121;
                        if (this.field7565.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class475.method2512(-91, this.field7565.replace('/', ' '), ' ');
                            for (int var9 = 0; ~var9 > ~var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (~var10.charAt(0) == -121 && var10.length() >= 3 && class537.method2912((byte) 124, var10.substring(1, 3))) {
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
                                            if (~var10.length() <= -5 && class537.method2912((byte) 104, var10.substring(0, 4))) {
                                                var5 = class557.method3065(128, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field7596 = false;
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && var5 <= 9250) {
                                    this.field7598 = false;
                                }
                                if (var5 >= 7000 && ~var5 >= -8000) {
                                    this.field7599 = false;
                                }
                            }
                            this.field7540 &= this.field7436.method3548("GL_ARB_half_float_pixel");
                            this.field7583 = this.field7599;
                            this.field7527 = true;
                        }
                        if (this.field7612.indexOf("intel") != -1) {
                            this.field7593 = false;
                        }
                        this.field7597 = !this.field7612.equals("s3 graphics");
                        if (this.field7599) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class48.method305(false, true, (byte) 88);
                        this.field7482 = true;
                        this.field7450 = new class294(this, super.field7898);
                        this.method2993(1);
                        this.field7476 = new class619(this);
                        this.field7451 = new class551(this);
                        if (this.field7451.method3049(79)) {
                            this.field7466 = new class245(this);
                            if (!this.field7466.method1456(-11982)) {
                                this.field7466.method1455(35632);
                                this.field7466 = null;
                            }
                        }
                        this.field7461 = new class584(this);
                        this.method3003((byte) -128);
                        this.method2998(1);
                        this.method1052();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method1069();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1068(Canvas arg0) {
        ++field7439;
        long var2 = 0L;
        if (arg0 != null && this.field7408 != arg0) {
            if (this.field7339.containsKey(arg0)) {
                Long var4 = (Long) this.field7339.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field7349;
        }
        if (var2 == 0L) {
            throw new RuntimeException();
        } else {
            this.field7436.surfaceResized(var2);
            if (this.field7281 == arg0) {
                this.method2998(1);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(IIIII)V")
    public final void method1022(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7463;
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        if (~(arg0 + arg2) <= ~this.field7617 && ~(arg0 - arg2) >= ~this.field7595 && arg1 - -arg2 >= this.field7535 && -arg2 + arg1 <= this.field7625) {
            this.method2992(-106);
            this.method3017((byte) 78, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field7591 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if ((float) var8 <= this.field7604) {
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
                    if (~var9 < -513) {
                        var9 = 512;
                    }
                } else {
                    var9 = 64;
                }
                int var10 = class257.method1497((byte) 114, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = 16384 - var10; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class447.field5740[var11] * (float) arg2 + var6, class447.field5738[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(IIII)V")
    public final void method2966(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg0 + 34176, arg3);
        if (arg2 != 768) {
            this.method1036();
        }
        ++field7378;
        OpenGL.glTexEnvi(8960, arg0 + 34192, arg1);
    }

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "()V")
    public final void method1082() {
        ++field7336;
        if (!this.field7593) {
            if (!this.field7574) {
                throw new RuntimeException("");
            }
            this.field7484.method156(0, 0, this.field7430, this.field7320, 0, 0);
            this.field7436.setSurface(this.field7289);
        } else {
            if (this.field7483 != this.field7489) {
                throw new RuntimeException();
            }
            this.field7489.method89(0, 1);
            this.field7489.method89(8, 1);
            this.method2981(-69, this.field7489);
        }
        this.field7484 = null;
        this.field7430 = this.field7409;
        this.field7320 = this.field7288;
        this.method3016(-13);
        this.method2996((byte) 16);
        this.method1017();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(FFIF)V")
    private final void method2967(float arg0, float arg1, int arg2, float arg3) {
        ++field7403;
        OpenGL.glMatrixMode(5890);
        if (this.field7555) {
            OpenGL.glLoadIdentity();
        }
        if (arg2 != 1) {
            this.method1054(-0.015320938F);
        }
        OpenGL.glTranslatef(arg1, arg3, arg0);
        OpenGL.glMatrixMode(5888);
        this.field7555 = true;
    }

    @OriginalMember(owner = "client!qj", name = "MA", descriptor = "(III[I)V")
    public final void method991(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7404;
        float var5 = (float) arg2 * this.field7507.field2086 + (float) arg0 * this.field7507.field2070 + (float) arg1 * this.field7507.field2058 + this.field7507.field2064;
        if (!((float) this.field7554 > var5) && !((float) this.field7519 < var5)) {
            int var6 = (int) (((float) arg2 * this.field7507.field2072 + (float) arg0 * this.field7507.field2075 + (float) arg1 * this.field7507.field2080 + this.field7507.field2084) * (float) this.field7572 / var5);
            int var7 = (int) (((float) arg2 * this.field7507.field2062 + (float) arg0 * this.field7507.field2066 + (float) arg1 * this.field7507.field2065 + this.field7507.field2071) * (float) this.field7575 / var5);
            arg3[0] = (int) ((float) var6 - this.field7626);
            arg3[1] = (int) ((float) var7 + -this.field7582);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I[Lgga;)V")
    public final void method1024(int arg0, class332[] arg1) {
        ++field7429;
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field7614[var3] = arg1[var3];
        }
        this.field7537 = arg0;
        if (this.field7549 != 1) {
            this.method2994((byte) -68);
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)V")
    private final void method2968(byte arg0) {
        if (this.field7594 && !this.field7590) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field7340;
        if (arg0 <= 39) {
            this.method2957(87);
        }
    }

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "(IIIIII)V")
    public final void method1090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7449;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method2992(-108);
        this.method3017((byte) 91, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7609) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7609) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljt;)V")
    public final void method980(class533 arg0) {
        this.field7577 = (class297) arg0;
        ++field7347;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Le;)V")
    public final void method1091(class385 arg0) {
        ++field7402;
        this.field7481 = ((class85) arg0).field1191;
        if (this.field7613 == null) {
            class458 var2 = new class458(80);
            if (!this.field7579) {
                var2.method2447((byte) -71, -1.0F);
                var2.method2447((byte) -71, -1.0F);
                var2.method2447((byte) -71, 0.0F);
                var2.method2447((byte) -71, 0.0F);
                var2.method2447((byte) -71, 1.0F);
                var2.method2447((byte) -71, 1.0F);
                var2.method2447((byte) -71, -1.0F);
                var2.method2447((byte) -71, 0.0F);
                var2.method2447((byte) -71, 1.0F);
                var2.method2447((byte) -71, 1.0F);
                var2.method2447((byte) -71, 1.0F);
                var2.method2447((byte) -71, 1.0F);
                var2.method2447((byte) -71, 0.0F);
                var2.method2447((byte) -71, 1.0F);
                var2.method2447((byte) -71, 0.0F);
                var2.method2447((byte) -71, -1.0F);
                var2.method2447((byte) -71, 1.0F);
                var2.method2447((byte) -71, 0.0F);
                var2.method2447((byte) -71, 0.0F);
                var2.method2447((byte) -71, 0.0F);
            } else {
                var2.method2449(-1.0F, 55);
                var2.method2449(-1.0F, 93);
                var2.method2449(0.0F, 111);
                var2.method2449(0.0F, -124);
                var2.method2449(1.0F, 84);
                var2.method2449(1.0F, 116);
                var2.method2449(-1.0F, 96);
                var2.method2449(0.0F, 88);
                var2.method2449(1.0F, 108);
                var2.method2449(1.0F, 127);
                var2.method2449(1.0F, 63);
                var2.method2449(1.0F, -68);
                var2.method2449(0.0F, -79);
                var2.method2449(1.0F, 53);
                var2.method2449(0.0F, 71);
                var2.method2449(-1.0F, -67);
                var2.method2449(1.0F, -54);
                var2.method2449(0.0F, -101);
                var2.method2449(0.0F, -85);
                var2.method2449(0.0F, 106);
            }
            this.field7613 = this.method3024(var2.field8804, var2.field8812, false, 20, -84);
            this.field7576 = new class325(this.field7613, 5126, 3, 0);
            this.field7531 = new class325(this.field7613, 5126, 2, 12);
            this.field7448.method881((byte) 110, this);
        }
    }

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "()Z")
    public final boolean method1023() {
        ++field7314;
        return true;
    }

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "()Z")
    public final boolean method1027() {
        ++field7287;
        return true;
    }

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "()Z")
    public final boolean method1085() {
        ++field7375;
        return false;
    }

    @OriginalMember(owner = "client!qj", name = "BA", descriptor = "()I")
    public final int method974() {
        ++field7392;
        return this.field7554;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IFF)V")
    public final void method2969(int arg0, float arg1, float arg2) {
        if (arg0 != 1) {
            this.method1072((class661) null, false);
        }
        this.field7517 = arg2;
        this.field7536 = arg1;
        ++field7356;
        this.method3011(true);
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "()Z")
    public final boolean method1047() {
        ++field7298;
        return this.field7461.method3216(-9, 3);
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(IIIIII)V")
    public final void method978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7283;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        this.method2992(-99);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method3017((byte) 108, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7609) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7609) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)V")
    private final void method2970(byte arg0) {
        if (arg0 != 17) {
            this.field7564 = 38;
        }
        this.field7436.method3549();
        ++field7285;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZB)V")
    public final void method2971(boolean arg0, byte arg1) {
        if (arg1 < -113) {
            if (this.field7533 != arg0) {
                this.field7533 = arg0;
                this.method3002(32411);
                this.field7508 &= -32;
            }
            ++field7275;
        }
    }

    @OriginalMember(owner = "client!qj", name = "YA", descriptor = "(IIII)V")
    public final void method984(int arg0, int arg1, int arg2, int arg3) {
        ++field7442;
        if (!this.field7552) {
            throw new RuntimeException("");
        } else {
            this.field7543 = arg3;
            this.field7589 = arg2;
            this.field7558 = arg0;
            this.field7623 = arg1;
            if (this.field7557) {
                this.field7461.field8164.method928((byte) 108);
                this.field7461.field8164.method931(-82);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "()I")
    public final int method1057() {
        ++field7350;
        return this.field7497 + this.field7496 + this.field7498;
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(II)V")
    public final void method2972(int arg0, int arg1) {
        if (arg0 != -29455) {
            this.method1091((class385) null);
        }
        class4.field115[0] = (float) class695.method3921(16711680, arg1) / 1.671168E7F;
        ++field7397;
        class4.field115[3] = (float) (arg1 >>> 24) / 255.0F;
        class4.field115[2] = (float) class695.method3921(arg1, 255) / 255.0F;
        class4.field115[1] = (float) class695.method3921(65280, arg1) / 65280.0F;
        OpenGL.glTexEnvfv(8960, 8705, class4.field115, 0);
    }

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "()V")
    public final void method1052() {
        ++field7332;
        if (this.field7597 && this.field7430 > 0 && ~this.field7320 < -1) {
            int var1 = this.field7617;
            int var2 = this.field7595;
            int var3 = this.field7535;
            int var4 = this.field7625;
            this.method1017();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3016(-13);
            this.method2971(false, (byte) -114);
            this.method3010((byte) 105, false);
            this.method3007(119, false);
            this.method2953(false, 122);
            this.method2960((class615) null, -2);
            this.method2961(-2, (byte) -60);
            this.method3005(false, 1);
            this.method3017((byte) 101, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field7430, this.field7320, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method1083(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "(I)V")
    private final void method2973(int arg0) {
        ++field7428;
        this.field7608[10] = this.field7550;
        this.field7608[14] = this.field7546;
        this.field7520 = (this.field7608[14] + (float) (-this.field7519)) / this.field7608[10];
        this.field7603 = (float) this.field7519;
        if (arg0 != -16543) {
            this.field7632 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "(I)V")
    public final void method2974(int arg0) {
        ++field7425;
        if (arg0 != 0) {
            this.field7599 = true;
        }
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZILjaclib/memory/Buffer;I)Lnl;")
    public final class585 method2975(int arg0, boolean arg1, int arg2, Buffer arg3, int arg4) {
        ++field7390;
        if (!this.field7599 || arg1 && !this.field7583) {
            if (arg4 != 3) {
                this.field7490 = null;
            }
            return new class225(this, arg0, arg3);
        } else {
            return new class141(this, arg0, arg3, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(JI)V")
    public final synchronized void method2976(long arg0, int arg1) {
        ++field7319;
        class329 var4 = new class329();
        var4.field4199 = arg0;
        this.field7505.method239(var4, (byte) 93);
        if (arg1 < 18) {
            this.field7613 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BF)V")
    public final void method2977(byte arg0, float arg1) {
        if (this.field7618 != arg1) {
            this.field7618 = arg1;
            if (this.field7549 == 3) {
                this.method2957(5888);
            }
        }
        if (arg0 == 95) {
            ++field7423;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIILua;II)V")
    public final void method1007(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class600 arg6, int arg7, int arg8) {
        ++field7329;
        class268 var10 = (class268) arg6;
        class4 var11 = var10.field3385;
        this.method3022((byte) 3);
        this.method2960(var10.field3385, -2);
        this.method3017((byte) 63, arg5);
        this.method2983(7681, -465309136, 8448);
        this.method2966(0, 768, 768, 34167);
        float var12 = var11.field111 / (float) var11.field116;
        float var13 = var11.field109 / (float) var11.field110;
        float var14 = (float) (-arg0) + (float) arg2;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var15 * var16;
        float var18 = var14 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var18 + 0.35F, (float) arg3 + var17 + 0.35F);
        OpenGL.glEnd();
        this.method2966(0, 768, 768, 5890);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIILdw;I)V")
    public final void method2978(int arg0, int arg1, int arg2, class125 arg3, int arg4) {
        ++field7443;
        int var6 = arg3.method663((byte) -17);
        if (arg4 != 255) {
            this.field7541 = 0.2851723F;
        }
        int var7 = arg1 * this.method3006((byte) 105, var6);
        this.method3018(-98, arg3);
        OpenGL.glDrawElements(arg2, arg0, var6, (long) var7 + arg3.method662(13456));
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIZZ)V")
    public final void method2979(int arg0, int arg1, boolean arg2, boolean arg3) {
        ++field7376;
        if (this.field7624 != arg0 || this.field7557 != this.field7552) {
            class133 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field7552 ? 3 : 0;
            if (~arg0 > -1) {
                this.method2955(13842);
            } else {
                var5 = this.field7450.method1650(arg0, 256);
                class13 var10 = super.field7898.method2486(arg0, (byte) 86);
                if (var10.field239 == 0 && ~var10.field228 == -1) {
                    this.method2955(13842);
                } else {
                    int var11 = !var10.field241 ? 128 : 64;
                    int var12 = var11 * 50;
                    this.method2967(0.0F, (float) (this.field7477 % var12 * var10.field239) / (float) var12, 1, (float) (this.field7477 % var12 * var10.field228) / (float) var12);
                }
                var6 = var10.field226;
                if (!this.field7552) {
                    var7 = var10.field248;
                    var8 = var10.field240;
                    var9 = var10.field234;
                }
            }
            this.field7461.method3217(arg3, arg2, -128, var7, var8, var9);
            if (!this.field7461.method3214(-27079, var5, var6)) {
                this.method2960(var5, -2);
                this.method3005(false, var6);
            }
            this.field7624 = arg0;
            this.field7557 = this.field7552;
        }
        this.field7508 &= -8;
        if (arg1 <= 21) {
            this.field7631 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "(I)V")
    private final void method2980(int arg0) {
        this.field7584 = (float) (-this.field7581 + this.field7595);
        this.field7560 = (float) (-this.field7571 + this.field7625);
        if (arg0 != 0) {
            this.field7541 = 0.2703641F;
        }
        this.field7582 = (float) (-this.field7571 + this.field7535);
        this.field7626 = (float) (-this.field7581 + this.field7617);
        ++field7317;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjh;)V")
    public final void method2981(int arg0, class607 arg1) {
        ++field7344;
        if (this.field7542) {
            this.method3021(arg1, (byte) -107);
            this.method2986(arg1, -102);
        } else {
            if (this.field7486 < 0 || this.field7490[this.field7486] != arg1) {
                throw new RuntimeException();
            }
            this.field7490[this.field7486--] = null;
            arg1.method97(-9828);
            if (this.field7486 < 0) {
                this.field7493 = this.field7483 = null;
            } else {
                this.field7493 = this.field7483 = this.field7490[this.field7486];
                this.field7493.method92(-5908);
            }
        }
        int var3 = -124 / ((-9 - arg0) / 60);
    }

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "()Z")
    public final boolean method1011() {
        ++field7309;
        return true;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(FFFIF)V")
    public final void method2982(float arg0, float arg1, float arg2, int arg3, float arg4) {
        class4.field115[3] = arg2;
        class4.field115[0] = arg1;
        if (arg3 != -23119) {
            this.method1031();
        }
        ++field7386;
        class4.field115[2] = arg0;
        class4.field115[1] = arg4;
        OpenGL.glTexEnvfv(8960, 8705, class4.field115, 0);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)V")
    public final void method2983(int arg0, int arg1, int arg2) {
        ++field7381;
        if (arg1 != -465309136) {
            this.method1004();
        }
        if (~this.field7563 != -1) {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        } else {
            boolean var4 = false;
            if (this.field7615 != arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                var4 = true;
                this.field7615 = arg0;
            }
            if (~this.field7588 != ~arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                this.field7588 = arg2;
                var4 = true;
            }
            if (var4) {
                this.field7508 &= -30;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "()V")
    public final void method1004() {
        ++field7394;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)I")
    public final int method998(int arg0, int arg1) {
        ++field7282;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI[BZI)Ldw;")
    public final class125 method2984(byte arg0, int arg1, byte[] arg2, boolean arg3, int arg4) {
        ++field7469;
        if (arg0 >= -57) {
            return null;
        } else {
            return (class125) (!this.field7599 || arg3 && !this.field7583 ? new class442(this, arg4, arg2, arg1) : new class653(this, arg4, arg2, arg1, arg3));
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)I")
    public final int method1018(int arg0, int arg1) {
        ++field7438;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "()Lq;")
    public final class491 method1033() {
        ++field7419;
        return this.field7507;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lgv;BLgv;Lgv;Lgv;)V")
    public final void method2985(class325 arg0, byte arg1, class325 arg2, class325 arg3, class325 arg4) {
        if (arg0 != null) {
            this.method3000((byte) -128, arg0.field4174);
            OpenGL.glVertexPointer(arg0.field4179, arg0.field4173, this.field7548.method824(30991), this.field7548.method825((byte) 102) + (long) arg0.field4178);
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        ++field7302;
        if (arg4 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method3000((byte) -120, arg4.field4174);
            OpenGL.glNormalPointer(arg4.field4173, this.field7548.method824(30991), this.field7548.method825((byte) -126) + (long) arg4.field4178);
            OpenGL.glEnableClientState(32885);
        }
        if (arg2 != null) {
            this.method3000((byte) -126, arg2.field4174);
            OpenGL.glColorPointer(arg2.field4179, arg2.field4173, this.field7548.method824(30991), this.field7548.method825((byte) -103) - -((long) arg2.field4178));
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg1 > 10) {
            if (arg3 != null) {
                this.method3000((byte) -128, arg3.field4174);
                OpenGL.glTexCoordPointer(arg3.field4179, arg3.field4173, this.field7548.method824(30991), this.field7548.method825((byte) 63) + (long) arg3.field4178);
                OpenGL.glEnableClientState(32888);
            } else {
                OpenGL.glDisableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([I)V")
    public final void method1030(int[] arg0) {
        arg0[1] = this.field7320;
        arg0[0] = this.field7430;
        ++field7284;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lq;)V")
    public final void method1058(class491 arg0) {
        this.field7507.method919(arg0);
        ++field7307;
        this.field7515.method919(this.field7507);
        this.field7515.method913(false);
        this.field7516.method921(this.field7515, (byte) -77);
        if (~this.field7549 != -2) {
            this.method3019((byte) 29);
        }
    }

    @OriginalMember(owner = "client!qj", name = "ya", descriptor = "()V")
    public final void method1031() {
        ++field7316;
        this.method2953(true, -12);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "()Z")
    public final boolean method1026() {
        ++field7460;
        return false;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIII)V")
    public final void method1065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7363;
        this.method2992(5);
        this.method3017((byte) 54, arg5);
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
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var9 + 0.35F, (float) arg3 + var8 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!qj", name = "la", descriptor = "(IIII)V")
    public final void method1048(int arg0, int arg1, int arg2, int arg3) {
        this.field7575 = arg3;
        this.field7581 = arg0;
        this.field7571 = arg1;
        this.field7572 = arg2;
        ++field7312;
        this.method3025((byte) 108);
        this.method2980(0);
        if (~this.field7549 == -4) {
            this.method2957(5888);
        } else if (~this.field7549 == -3) {
            this.method2956(692534472);
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)Le;")
    public final class385 method1015(int arg0) {
        ++field7370;
        class85 var2 = new class85(arg0);
        this.field7478.method239(var2, (byte) 93);
        return var2;
    }

    @OriginalMember(owner = "client!qj", name = "VA", descriptor = "(IFFFFF)V")
    public final void method994(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field7380;
        boolean var7 = ~this.field7578 != ~arg0;
        if (var7 || this.field7530 != arg1 || this.field7553 != arg2) {
            this.field7578 = arg0;
            this.field7530 = arg1;
            this.field7553 = arg2;
            if (var7) {
                this.field7620 = (float) (65280 & this.field7578) / 65280.0F;
                this.field7534 = (float) (this.field7578 & 255) / 255.0F;
                this.field7541 = (float) (this.field7578 & 16711680) / 1.671168E7F;
                this.method2958((byte) 42);
            }
            this.method2999(-56);
        }
        if (this.field7573[0] != arg3 || this.field7573[1] != arg4 || this.field7573[2] != arg5) {
            this.field7573[1] = arg4;
            this.field7573[0] = arg3;
            this.field7573[2] = arg5;
            this.field7619[0] = -arg3;
            this.field7619[2] = -arg5;
            this.field7619[1] = -arg4;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field7610[2] = arg5 * var8;
            this.field7610[1] = arg4 * var8;
            this.field7610[0] = arg3 * var8;
            this.field7528[1] = -this.field7610[1];
            this.field7528[2] = -this.field7610[2];
            this.field7528[0] = -this.field7610[0];
            this.method2962(13211);
            this.field7601 = (int) (arg3 * 256.0F / arg4);
            this.field7602 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljh;I)V")
    public final void method2986(class607 arg0, int arg1) {
        if (arg1 > -52) {
            this.field7607 = true;
        }
        ++field7296;
        if (this.field7488 >= 0 && this.field7487[this.field7488] == arg0) {
            this.field7487[this.field7488--] = null;
            arg0.method90(20966);
            if (this.field7488 >= 0) {
                this.field7483 = this.field7487[this.field7488];
                this.field7483.method98(-128);
            } else {
                this.field7483 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "(I)V")
    private final void method2987(int arg0) {
        ++field7286;
        if (~this.field7549 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field7430 > 0 && this.field7320 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field7430, (double) this.field7320, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field7549 = 1;
            this.field7508 &= -25;
        }
        if (arg0 != 16032) {
            this.method989((class595) null, (class661[]) null, false);
        }
    }

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "(I)V")
    public final void method2988(int arg0) {
        ++field7366;
        if (this.field7508 != 8) {
            this.method3014((byte) -45);
            this.method2971(true, (byte) -125);
            this.method3007(94, true);
            this.method2953(true, -92);
            this.method3017((byte) 35, 1);
            this.field7508 = 8;
        }
        int var2 = -24 / ((arg0 - -22) / 58);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(Z)V")
    public final void method1005(boolean arg0) {
        ++field7337;
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(B)V")
    public final void method2989(byte arg0) {
        if (arg0 <= 16) {
            this.method1073((Canvas) null);
        }
        OpenGL.glPushMatrix();
        ++field7362;
    }

    @OriginalMember(owner = "client!qj", name = "JA", descriptor = "()V")
    public final void method1017() {
        this.field7617 = 0;
        this.field7595 = this.field7430;
        this.field7625 = this.field7320;
        ++field7369;
        this.field7535 = 0;
        OpenGL.glDisable(3089);
        this.method2980(0);
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)V")
    public final void method973(int arg0) {
        ++field7341;
        this.method2970((byte) 17);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(III)V")
    public final synchronized void method2990(int arg0, int arg1, int arg2) {
        ++field7280;
        class262 var4 = new class262(arg2);
        if (arg0 != 8448) {
            this.method1036();
        }
        var4.field4199 = (long) arg1;
        this.field7500.method239(var4, (byte) 93);
    }

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "()Lq;")
    public final class491 method995() {
        ++field7368;
        return this.field7474;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(ZI)V")
    public final synchronized void method2991(boolean arg0, int arg1) {
        ++field7401;
        class262 var3 = new class262(arg1);
        if (!arg0) {
            this.field7502.method239(var3, (byte) 93);
        }
    }

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "(I)V")
    private final void method2992(int arg0) {
        ++field7400;
        int var2 = -106 / ((-46 - arg0) / 36);
        if (this.field7508 != 1) {
            this.method2987(16032);
            this.method2971(false, (byte) -123);
            this.method3010((byte) 101, false);
            this.method3007(-68, false);
            this.method2953(false, -79);
            this.method2960((class615) null, -2);
            this.method2961(-2, (byte) -101);
            this.method3005(false, 1);
            this.field7508 = 1;
        }
    }

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "(I)V")
    private final void method2993(int arg0) {
        ++field7346;
        this.field7587 = new class615[this.field7561];
        this.field7569 = new class133(this, 3553, 6408, arg0, 1);
        new class133(this, 3553, 6408, 1, 1);
        new class133(this, 3553, 6408, 1, 1);
        this.field7600 = new class263(this);
        this.field7562 = new class263(this);
        this.field7559 = new class263(this);
        this.field7585 = new class263(this);
        this.field7523 = new class263(this);
        this.field7539 = new class263(this);
        this.field7606 = new class263(this);
        this.field7616 = new class263(this);
        this.field7551 = new class263(this);
        this.field7567 = new class263(this);
        if (this.field7593) {
            this.field7538 = new class12(this);
            new class12(this);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([IIIII)Lf;")
    public final class536 method1025(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7374;
        return new class417(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(B)V")
    private final void method2994(byte arg0) {
        ++field7471;
        int var2 = 0;
        int var3 = 28 % ((arg0 - 83) / 34);
        while (this.field7537 > var2) {
            class332 var4 = this.field7614[var2];
            class389.field4914[0] = (float) var4.method1886(true);
            int var5 = var2 + 16386;
            class389.field4914[1] = (float) var4.method1888(-42);
            class389.field4914[2] = (float) var4.method1885((byte) 119);
            class389.field4914[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, class389.field4914, 0);
            int var6 = var4.method1881(96);
            float var7 = var4.method1882(100) / 255.0F;
            class389.field4914[1] = (float) class695.method3921(255, var6 >> 8) * var7;
            class389.field4914[2] = var7 * (float) class695.method3921(255, var6);
            class389.field4914[0] = var7 * (float) (class695.method3921(var6, 16730675) >> 16);
            OpenGL.glLightfv(var5, 4609, class389.field4914, 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float) (var4.method1883((byte) -82) * var4.method1883((byte) 104)));
            OpenGL.glEnable(var5);
            ++var2;
        }
        while (~this.field7518 < ~var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field7518 = this.field7537;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "()I")
    public final int method997() {
        ++field7447;
        return 4;
    }

    @OriginalMember(owner = "client!qj", name = "AA", descriptor = "(III[I)V")
    public final void method1046(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7335;
        float var5 = (float) arg2 * this.field7507.field2086 + (float) arg0 * this.field7507.field2070 + (float) arg1 * this.field7507.field2058 + this.field7507.field2064;
        if (!((float) this.field7554 > var5) && !(var5 > (float) this.field7519)) {
            int var6 = (int) (((float) arg2 * this.field7507.field2072 + (float) arg0 * this.field7507.field2075 + (float) arg1 * this.field7507.field2080 + this.field7507.field2084) * (float) this.field7572 / var5);
            int var7 = (int) (((float) arg2 * this.field7507.field2062 + (float) arg0 * this.field7507.field2066 + (float) arg1 * this.field7507.field2065 + this.field7507.field2071) * (float) this.field7575 / var5);
            if (this.field7626 <= (float) var6 && (float) var6 <= this.field7584 && this.field7582 <= (float) var7 && this.field7560 >= (float) var7) {
                arg3[1] = (int) ((float) var7 - this.field7582);
                arg3[0] = (int) ((float) var6 + -this.field7626);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!qj", name = "oa", descriptor = "([I)V")
    public final void method1060(int[] arg0) {
        arg0[2] = this.field7595;
        arg0[0] = this.field7617;
        arg0[3] = this.field7625;
        ++field7437;
        arg0[1] = this.field7535;
    }

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "(B)V")
    public final void method2995(byte arg0) {
        ++field7361;
        if (~this.field7508 != -5) {
            this.method2987(16032);
            this.method2971(false, (byte) -128);
            this.method3010((byte) 109, false);
            this.method3007(-109, false);
            this.method2953(false, -46);
            this.method2961(-2, (byte) -16);
            this.method3017((byte) 107, 1);
            this.field7508 = 4;
        }
        if (arg0 > -88) {
            this.method1073((Canvas) null);
        }
    }

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "(B)V")
    private final void method2996(byte arg0) {
        OpenGL.glViewport(this.field7526, this.field7564, this.field7430, this.field7320);
        if (arg0 != 16) {
            this.field7615 = -45;
        }
        ++field7299;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ldb;I)V")
    public final void method2997(class159 arg0, int arg1) {
        ++field7454;
        OpenGL.glLoadMatrixf(arg0.method909(true), arg1);
    }

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "(I)V")
    private final void method2998(int arg0) {
        if (this.field7281 == null) {
            this.field7409 = this.field7288 = 0;
        } else {
            Dimension var2 = this.field7281.getSize();
            this.field7409 = var2.width;
            this.field7288 = var2.height;
        }
        ++field7310;
        if (this.field7483 == null) {
            this.field7320 = this.field7288;
            this.field7430 = this.field7409;
            this.method2996((byte) 16);
        }
        this.method3016(-13);
        this.method1017();
        if (arg0 != 1) {
            this.field7480 = 57;
        }
    }

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "(I)V")
    private final void method2999(int arg0) {
        class4.field115[1] = this.field7620 * this.field7530;
        int var2 = -87 / ((arg0 - 35) / 41);
        class4.field115[2] = this.field7534 * this.field7530;
        class4.field115[0] = this.field7541 * this.field7530;
        ++field7371;
        class4.field115[3] = 1.0F;
        OpenGL.glLightfv(16384, 4609, class4.field115, 0);
        class4.field115[3] = 1.0F;
        class4.field115[2] = -this.field7553 * this.field7534;
        class4.field115[0] = -this.field7553 * this.field7541;
        class4.field115[1] = -this.field7553 * this.field7620;
        OpenGL.glLightfv(16385, 4609, class4.field115, 0);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLnl;)V")
    public final void method3000(byte arg0, class585 arg1) {
        ++field7311;
        if (this.field7548 != arg1) {
            if (this.field7599) {
                OpenGL.glBindBufferARB(34962, arg1.method828(13003));
            }
            this.field7548 = arg1;
        }
        if (arg0 > -112) {
            this.method3021((class607) null, (byte) 75);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BII)V")
    public final void method3001(byte arg0, int arg1, int arg2) {
        this.field7526 = arg2;
        ++field7416;
        if (arg0 < 70) {
            this.field7563 = -33;
        }
        this.field7564 = arg1;
        this.method2996((byte) 16);
        this.method2954((byte) -71);
    }

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "(I)V")
    private final void method3002(int arg0) {
        ++field7410;
        if (this.field7533 && this.field7521 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 != 32411) {
            this.field7581 = 115;
        }
    }

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "(B)V")
    private final void method3003(byte arg0) {
        ++field7432;
        this.method2961(-2, (byte) -128);
        for (int var2 = this.field7561 + -1; var2 >= 0; --var2) {
            this.method3027(var2, true);
            this.method2960((class615) null, -2);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method2983(8448, -465309136, 8448);
        this.method2966(2, 770, 768, 34168);
        this.method2955(13842);
        this.field7506 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field7512 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field7511 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field7510 = true;
        this.method2971(true, (byte) -116);
        this.method3010((byte) 108, true);
        this.method3007(-86, true);
        this.method2953(true, 117);
        this.method3016(-13);
        this.field7436.setSwapInterval(0);
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
            int var6 = var4 + 16384;
            OpenGL.glLightfv(var6, 4608, var3, 0);
            OpenGL.glLightf(var6, 4615, 0.0F);
            OpenGL.glLightf(var6, 4616, 0.0F);
        }
        int var5 = 19 / ((-60 - arg0) / 62);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field7578 = this.field7532 = -1;
        this.method1017();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BIII)V")
    public final void method3004(byte arg0, int arg1, int arg2, int arg3) {
        ++field7457;
        OpenGL.glDrawArrays(arg2, arg3, arg1);
        int var5 = -86 % ((-79 - arg0) / 36);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lsa;[Laga;Z)Lla;")
    public final class413 method989(class595 arg0, class661[] arg1, boolean arg2) {
        ++field7306;
        return new class485(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(ZI)V")
    public final void method3005(boolean arg0, int arg1) {
        ++field7300;
        if (!arg0) {
            if (arg1 != 1) {
                if (arg1 == 0) {
                    this.method2983(8448, -465309136, 8448);
                } else if (arg1 == 2) {
                    this.method2983(34165, -465309136, 7681);
                } else {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            this.method2983(34023, -465309136, 34023);
                            return;
                        }
                    } else {
                        this.method2983(260, -465309136, 8448);
                    }
                }
            } else {
                this.method2983(7681, -465309136, 7681);
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1073(Canvas arg0) {
        ++field7338;
        if (this.field7408 == arg0) {
            throw new RuntimeException();
        } else if (!this.field7339.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field7436.prepareSurface(arg0);
                if (var4 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field7339.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "()V")
    public final void method1039() {
        this.field7552 = false;
        ++field7458;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public final synchronized void method1051(int arg0) {
        ++field7352;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field7500.method246(true)) {
            class262 var12 = (class262) this.field7500.method244(true);
            class447.field5741[var3++] = (int) var12.field4199;
            this.field7497 -= var12.field3229;
            if (~var3 == -1001) {
                OpenGL.glDeleteBuffersARB(var3, class447.field5741, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class447.field5741, 0);
            var3 = 0;
        }
        while (!this.field7501.method246(true)) {
            class262 var11 = (class262) this.field7501.method244(true);
            class447.field5741[var3++] = (int) var11.field4199;
            this.field7498 -= var11.field3229;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class447.field5741, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class447.field5741, 0);
            var3 = 0;
        }
        while (!this.field7502.method246(true)) {
            class262 var10 = (class262) this.field7502.method244(true);
            class447.field5741[var3++] = var10.field3229;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class447.field5741, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class447.field5741, 0);
            var3 = 0;
        }
        while (!this.field7503.method246(true)) {
            class262 var9 = (class262) this.field7503.method244(true);
            class447.field5741[var3++] = (int) var9.field4199;
            this.field7496 -= var9.field3229;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class447.field5741, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class447.field5741, 0);
            boolean var4 = false;
        }
        while (!this.field7495.method246(true)) {
            class262 var8 = (class262) this.field7495.method244(true);
            OpenGL.glDeleteLists((int) var8.field4199, var8.field3229);
        }
        while (!this.field7504.method246(true)) {
            class329 var7 = this.field7504.method244(true);
            OpenGL.glDeleteProgramARB((int) var7.field4199);
        }
        while (!this.field7505.method246(true)) {
            class329 var6 = this.field7505.method244(true);
            OpenGL.glDeleteObjectARB(var6.field4199);
        }
        while (!this.field7495.method246(true)) {
            class262 var5 = (class262) this.field7495.method244(true);
            OpenGL.glDeleteLists((int) var5.field4199, var5.field3229);
        }
        this.field7450.method1647(118);
        if (~this.method1057() < -100663297 && ~(this.field7513 + 60000L) > ~class571.method3150(124)) {
            System.gc();
            this.field7513 = class571.method3150(90);
        }
        this.field7477 = var2;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)I")
    public final int method3006(byte arg0, int arg1) {
        int var3 = 29 % ((arg0 - 13) / 55);
        ++field7462;
        if (~arg1 != -5122 && ~arg1 != -5121) {
            if (arg1 != 5123 && arg1 != 5122) {
                if (arg1 != 5125 && arg1 != 5124 && ~arg1 != -5127) {
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

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)V")
    public final void method3007(int arg0, boolean arg1) {
        int var3 = -3 / ((arg0 - -5) / 62);
        ++field7413;
        if (!this.field7509 != !arg1) {
            if (arg1) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field7508 &= -32;
            this.field7509 = arg1;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lir;)V")
    public final void method993(class27 arg0) {
        ++field7470;
        this.field7448.method882(false, arg0, this, -1);
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(III)V")
    public final synchronized void method3008(int arg0, int arg1, int arg2) {
        ++field7301;
        class262 var4 = new class262(arg0);
        if (arg1 != 20024) {
            this.method2976(22L, -116);
        }
        var4.field4199 = (long) arg2;
        this.field7501.method239(var4, (byte) 93);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
    public final void method1038(boolean arg0) {
        ++field7411;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method987(Rectangle[] arg0, int arg1) throws class180 {
        ++field7364;
        this.method988();
    }

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "()Z")
    public final boolean method996() {
        ++field7373;
        return true;
    }

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "()V")
    public final void method1003() {
        ++field7334;
    }

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "()Z")
    public final boolean method1032() {
        ++field7360;
        if (this.field7466 != null) {
            if (!this.field7466.method1835(-16056)) {
                if (!this.field7451.method3040(-105, this.field7466)) {
                    return false;
                }
                this.field7450.method1648(6408);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "(B)V")
    private final void method3009(byte arg0) {
        ++field7330;
        OpenGL.glDepthMask(this.field7514 && this.field7621);
        int var2 = -85 / ((arg0 - -32) / 56);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIF)Lgga;")
    public final class332 method1035(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field7388;
        return new class583(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "()V")
    public final void method988() throws class180 {
        ++field7294;
        try {
            this.field7436.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BZ)V")
    public final void method3010(byte arg0, boolean arg1) {
        ++field7431;
        if (arg0 <= 99) {
            this.field7524 = true;
        }
        if (!arg1 == this.field7594) {
            this.field7594 = arg1;
            this.method2968((byte) 70);
            this.field7508 &= -8;
        }
    }

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "()[I")
    public final int[] method1016() {
        ++field7422;
        return new int[] { this.field7581, this.field7571, this.field7572, this.field7575 };
    }

    @OriginalMember(owner = "client!qj", name = "DA", descriptor = "()I")
    public final int method1045() {
        ++field7355;
        int var1 = this.field7629;
        this.field7629 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1020(Canvas arg0) {
        ++field7435;
        if (this.field7408 == arg0) {
            throw new RuntimeException();
        } else if (this.field7339.containsKey(arg0)) {
            Long var2 = (Long) this.field7339.get(arg0);
            this.field7436.releaseSurface(arg0, var2);
            this.field7339.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(Z)V")
    private final void method3011(boolean arg0) {
        ++field7276;
        if (!arg0) {
            this.field7563 = 67;
        }
        this.field7545 = (float) (-this.field7522 + this.field7519) + -this.field7517;
        this.field7525 = -((float) this.field7521 * this.field7536) + this.field7545;
        if ((float) this.field7554 > this.field7525) {
            this.field7525 = (float) this.field7554;
        }
        OpenGL.glFogf(2915, this.field7525);
        OpenGL.glFogf(2916, this.field7545);
        class4.field115[2] = (float) class695.method3921(255, this.field7532) / 255.0F;
        class4.field115[1] = (float) class695.method3921(this.field7532, 65280) / 65280.0F;
        class4.field115[0] = (float) class695.method3921(this.field7532, 16711680) / 1.671168E7F;
        OpenGL.glFogfv(2918, class4.field115, 0);
    }

    @OriginalMember(owner = "client!qj", name = "FA", descriptor = "(ILua;II)V")
    public final void method1012(int arg0, class600 arg1, int arg2, int arg3) {
        ++field7367;
        class268 var5 = (class268) arg1;
        class4 var6 = var5.field3385;
        this.method3022((byte) 3);
        this.method2960(var5.field3385, -2);
        this.method3017((byte) 55, 1);
        this.method2983(7681, -465309136, 8448);
        this.method2966(0, 768, 768, 34167);
        float var7 = var6.field111 / (float) var6.field116;
        float var8 = var6.field109 / (float) var6.field110;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7617) * var7, (float) (this.field7535 - arg3) * var8);
        OpenGL.glVertex2i(this.field7617, this.field7535);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7617) * var7, (float) (-arg3 + this.field7625) * var8);
        OpenGL.glVertex2i(this.field7617, this.field7625);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7595) * var7, (float) (-arg3 + this.field7625) * var8);
        OpenGL.glVertex2i(this.field7595, this.field7625);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7595) * var7, (float) (this.field7535 - arg3) * var8);
        OpenGL.glVertex2i(this.field7595, this.field7535);
        OpenGL.glEnd();
        this.method2966(0, 768, 768, 5890);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(Ldb;I)V")
    public final void method3012(class159 arg0, int arg1) {
        int var3 = -55 % ((-65 - arg1) / 56);
        OpenGL.glPushMatrix();
        ++field7467;
        OpenGL.glMultMatrixf(arg0.method909(true), 0);
    }

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "()V")
    public final void method983() {
        this.field7451.method3046((byte) -38);
        ++field7418;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Leg;IIII)Lda;")
    public final class474 method1019(class47 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7325;
        return new class263(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!qj", name = "XA", descriptor = "(IIIII)V")
    public final void method1084(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7455;
        this.method2992(44);
        this.method3017((byte) 48, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "()Z")
    public final boolean method1076() {
        ++field7426;
        return true;
    }

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "(I)I")
    private final int method3013(int arg0) {
        ++field7453;
        int var2 = 0;
        this.field7612 = OpenGL.glGetString(7936).toLowerCase();
        this.field7565 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field7612.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (this.field7612.indexOf("brian paul") != -1 || ~this.field7612.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class475.method2512(arg0 + -10608, var3.replace('.', ' '), ' ');
        if (~var4.length > -3) {
            var2 |= 4;
        } else {
            try {
                int var5 = class557.method3065(arg0 + -10377, var4[0]);
                int var6 = class557.method3065(128, var4[1]);
                this.field7547 = var5 * 10 - -var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (~this.field7547 > -13) {
            var2 |= 2;
        }
        if (!this.field7436.method3548("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field7436.method3548("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field7561 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        if (arg0 != 10505) {
            this.method3007(119, false);
        }
        this.field7529 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field7605 = var7[0];
        if (~this.field7561 > -3 || this.field7529 < 2 || this.field7605 < 2) {
            var2 |= 16;
        }
        this.field7579 = Stream.method3420();
        this.field7574 = this.field7436.arePbuffersAvailable();
        this.field7599 = this.field7436.method3548("GL_ARB_vertex_buffer_object");
        this.field7609 = this.field7436.method3548("GL_ARB_multisample");
        this.field7524 = this.field7436.method3548("GL_ARB_vertex_program");
        this.field7436.method3548("GL_ARB_fragment_program");
        this.field7592 = this.field7436.method3548("GL_ARB_vertex_shader");
        this.field7544 = this.field7436.method3548("GL_ARB_fragment_shader");
        this.field7598 = this.field7436.method3548("GL_EXT_texture3D");
        this.field7540 = this.field7436.method3548("GL_ARB_texture_rectangle");
        this.field7556 = this.field7436.method3548("GL_ARB_texture_cube_map");
        this.field7596 = this.field7436.method3548("GL_ARB_texture_float");
        this.field7586 = false;
        this.field7593 = this.field7436.method3548("GL_EXT_framebuffer_object");
        this.field7542 = this.field7436.method3548("GL_EXT_framebuffer_blit");
        this.field7607 = this.field7436.method3548("GL_EXT_framebuffer_multisample");
        this.field7566 = this.field7542 & this.field7607;
        OpenGL.glGetFloatv(2834, class4.field115, 0);
        this.field7604 = class4.field115[1];
        this.field7591 = class4.field115[0];
        return ~var2 != -1 ? var2 : 0;
    }

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "(B)V")
    private final void method3014(byte arg0) {
        if (~this.field7549 != -3) {
            this.field7549 = 2;
            this.method2956(692534472);
            this.method3019((byte) 29);
            this.field7508 &= -8;
        }
        ++field7441;
        if (arg0 != -45) {
            this.method1040(122);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIZ)V")
    public final void method3015(int arg0, int arg1, int arg2, boolean arg3) {
        OpenGL.glTexEnvi(8960, arg2 + 34184, arg0);
        if (arg3) {
            ++field7274;
            OpenGL.glTexEnvi(8960, 34200 - -arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "(I)V")
    public final void method3016(int arg0) {
        if (~this.field7549 != -1) {
            this.field7549 = 0;
            this.field7508 &= -32;
        }
        if (arg0 != -13) {
            this.field7520 = 0.29725137F;
        }
        ++field7315;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIII)V")
    public final void method1021(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7292;
        OpenGL.glLineWidth((float) arg5);
        this.method1065(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(IIIIII)Ljt;")
    public final class533 method990(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7321;
        return !this.field7556 ? null : new class44(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qj", name = "ja", descriptor = "(I)V")
    public final void method1028(int arg0) {
        ++field7399;
        this.method3017((byte) 72, 0);
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(BI)V")
    public final void method3017(byte arg0, int arg1) {
        if (arg0 <= 23) {
            this.method1007(-87, -4, -39, 16, -89, -45, (class600) null, 61, 106);
        }
        if (~this.field7506 != ~arg1) {
            byte var3;
            boolean var4;
            boolean var5;
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    var3 = 2;
                    var4 = true;
                    var5 = false;
                } else if (arg1 != 128) {
                    var3 = 0;
                    var5 = false;
                    var4 = true;
                } else {
                    var4 = true;
                    var3 = 3;
                    var5 = true;
                }
            } else {
                var3 = 1;
                var5 = true;
                var4 = true;
            }
            if (var4 == !this.field7510) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field7510 = var4;
            }
            if (this.field7511 != var5) {
                if (!var5) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field7511 = var5;
            }
            if (~this.field7512 != ~var3) {
                if (~var3 != -2) {
                    if (~var3 == -3) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    } else if (~var3 != -4) {
                        OpenGL.glDisable(3042);
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field7512 = var3;
            }
            this.field7506 = arg1;
            this.field7508 &= -29;
        }
        ++field7303;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II[I[I)Lua;")
    public final class600 method1080(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field7345;
        return class52.method335(arg0, arg1, this, (byte) 96, arg3, arg2);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIZ)Lf;")
    public final class536 method1071(int arg0, int arg1, boolean arg2) {
        ++field7427;
        return new class417(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "()Z")
    public final boolean method1006() {
        ++field7417;
        return this.field7466 != null && this.field7466.method1835(-16056);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILdw;)V")
    public final void method3018(int arg0, class125 arg1) {
        if (this.field7611 != arg1) {
            if (this.field7599) {
                OpenGL.glBindBufferARB(34963, arg1.method664(-22904));
            }
            this.field7611 = arg1;
        }
        int var3 = -48 % ((16 - arg0) / 52);
        ++field7385;
    }

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)V")
    public final void method1063(int arg0) {
        ++field7434;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "(B)V")
    private final void method3019(byte arg0) {
        OpenGL.glLoadIdentity();
        ++field7322;
        if (arg0 != 29) {
            this.field7519 = -66;
        }
        OpenGL.glMultMatrixf(this.field7515.method909(true), 0);
        if (this.field7557) {
            this.field7461.field8164.method928((byte) 82);
        }
        this.method2962(13211);
        this.method2994((byte) -16);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIB)V")
    public final synchronized void method3020(int arg0, int arg1, byte arg2) {
        ++field7391;
        class262 var4 = new class262(arg0);
        var4.field4199 = (long) arg1;
        if (arg2 < 77) {
            this.method2951((class607) null, (byte) -123);
        }
        this.field7503.method239(var4, (byte) 93);
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(Ljh;B)V")
    public final void method3021(class607 arg0, byte arg1) {
        ++field7308;
        if (~this.field7492 <= -1 && this.field7491[this.field7492] == arg0) {
            this.field7491[this.field7492--] = null;
            arg0.method104(16401);
            if (~this.field7492 <= -1) {
                this.field7493 = this.field7491[this.field7492];
                this.field7493.method101((byte) 89);
            } else {
                this.field7493 = null;
            }
            int var3 = 51 % ((arg1 - -10) / 43);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qj", name = "va", descriptor = "(I)V")
    public final void method1029(int arg0) {
        ++field7396;
        this.field7479 = 0;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field7479;
        }
        this.field7480 = 1 << this.field7479;
    }

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "(B)V")
    public final void method3022(byte arg0) {
        ++field7343;
        if (arg0 != 3) {
            this.method975();
        }
        if (this.field7508 != 2) {
            this.method2987(arg0 + 16029);
            this.method2971(false, (byte) -116);
            this.method3010((byte) 109, false);
            this.method3007(85, false);
            this.method2953(false, arg0 + -25);
            this.method2961(-2, (byte) -52);
            this.field7508 = 2;
        }
    }

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "(IIIIII)Z")
    public final boolean method982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7456;
        float var7 = (float) arg2 * this.field7507.field2086 + (float) arg0 * this.field7507.field2070 + (float) arg1 * this.field7507.field2058 + this.field7507.field2064;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field7507.field2086 + (float) arg3 * this.field7507.field2070 + (float) arg4 * this.field7507.field2058 + this.field7507.field2064;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field7554) || !(var8 < (float) this.field7554)) && (!((float) this.field7519 < var7) || !((float) this.field7519 < var8))) {
            int var9 = (int) (((float) arg2 * this.field7507.field2072 + (float) arg0 * this.field7507.field2075 + (float) arg1 * this.field7507.field2080 + this.field7507.field2084) * (float) this.field7572 / var7);
            int var10 = (int) (((float) arg5 * this.field7507.field2072 + (float) arg3 * this.field7507.field2075 + (float) arg4 * this.field7507.field2080 + this.field7507.field2084) * (float) this.field7572 / var8);
            if ((float) var9 < this.field7626 && (float) var10 < this.field7626 || (float) var9 > this.field7584 && this.field7584 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field7507.field2062 + (float) arg0 * this.field7507.field2066 + (float) arg1 * this.field7507.field2065 + this.field7507.field2071) * (float) this.field7575 / var7);
                int var12 = (int) (((float) arg5 * this.field7507.field2062 + (float) arg3 * this.field7507.field2066 + (float) arg4 * this.field7507.field2065 + this.field7507.field2071) * (float) this.field7575 / var8);
                return (!(this.field7582 > (float) var11) || !(this.field7582 > (float) var12)) && (!(this.field7560 < (float) var11) || !(this.field7560 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "GA", descriptor = "(II)V")
    public final void method1062(int arg0, int arg1) {
        if (this.field7554 != arg0 || this.field7519 != arg1) {
            this.field7554 = arg0;
            this.field7519 = arg1;
            this.method3025((byte) 35);
            this.method3011(true);
            if (~this.field7549 == -4) {
                this.method2957(5888);
            } else if (this.field7549 == 2) {
                this.method2956(692534472);
            }
        }
        ++field7379;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(BZ)V")
    public final void method3023(byte arg0, boolean arg1) {
        ++field7465;
        int var3 = 126 % ((-90 - arg0) / 35);
        if (arg1 == !this.field7590) {
            this.field7590 = arg1;
            this.method2968((byte) 125);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([BIZII)Lnl;")
    public final class585 method3024(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field7297;
        int var6 = 19 / ((-29 - arg4) / 49);
        return (class585) (!this.field7599 || arg2 && !this.field7583 ? new class225(this, arg3, arg0, arg1) : new class141(this, arg3, arg0, arg1, arg2));
    }

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "(B)V")
    private final void method3025(byte arg0) {
        ++field7433;
        float[] var2 = this.field7608;
        if (arg0 <= 13) {
            this.method1051(-37);
        }
        float var3 = (float) (-this.field7581 * this.field7554) / (float) this.field7572;
        float var4 = (float) ((-this.field7581 + this.field7430) * this.field7554) / (float) this.field7572;
        float var5 = (float) (this.field7571 * this.field7554) / (float) this.field7575;
        float var6 = (float) ((-this.field7320 + this.field7571) * this.field7554) / (float) this.field7575;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field7554 * 2.0F;
            var2[15] = 0.0F;
            var2[13] = 0.0F;
            var2[4] = 0.0F;
            var2[6] = 0.0F;
            var2[5] = var7 / (-var6 + var5);
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[7] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[12] = 0.0F;
            var2[10] = this.field7550 = (float) (-(this.field7554 + this.field7519)) / (float) (this.field7519 - this.field7554);
            var2[1] = 0.0F;
            var2[3] = 0.0F;
            var2[2] = 0.0F;
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[11] = -1.0F;
            var2[14] = this.field7546 = -((float) this.field7519 * var7) / (float) (-this.field7554 + this.field7519);
        } else {
            var2[9] = 0.0F;
            var2[3] = 0.0F;
            var2[13] = 0.0F;
            var2[6] = 0.0F;
            var2[2] = 0.0F;
            var2[12] = 0.0F;
            var2[5] = 1.0F;
            var2[10] = 1.0F;
            var2[0] = 1.0F;
            var2[8] = 0.0F;
            var2[14] = 0.0F;
            var2[7] = 0.0F;
            var2[1] = 0.0F;
            var2[4] = 0.0F;
            var2[11] = 0.0F;
            var2[15] = 1.0F;
        }
        this.method2973(-16543);
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(ILjh;)V")
    public final void method3026(int arg0, class607 arg1) {
        ++field7412;
        if (!this.field7542) {
            if (~this.field7486 <= -4) {
                throw new RuntimeException();
            }
            if (~this.field7486 <= -1) {
                this.field7490[this.field7486].method97(arg0 ^ -9885);
            }
            this.field7493 = this.field7483 = this.field7490[++this.field7486] = arg1;
            this.field7493.method92(-5908);
        } else {
            this.method2951(arg1, (byte) -20);
            this.method2952(arg1, (byte) 101);
        }
        if (arg0 != 255) {
            this.method2977((byte) -7, -0.0013043648F);
        }
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "()Z")
    public final boolean method1067() {
        ++field7348;
        return true;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(IZ)V")
    public final void method3027(int arg0, boolean arg1) {
        if (!arg1) {
            this.method1024(-12, (class332[]) null);
        }
        ++field7444;
        if (~this.field7563 != ~arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field7563 = arg0;
        }
    }
}
