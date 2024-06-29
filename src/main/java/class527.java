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

@OriginalClass("client!te")
public class class527 extends class208 {

    @OriginalMember(owner = "client!te", name = "Lc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field7660 = new Hashtable();

    @OriginalMember(owner = "client!te", name = "fe", descriptor = "I")
    public int field7732 = 128;

    @OriginalMember(owner = "client!te", name = "he", descriptor = "Lor;")
    private class549 field7734 = new class549();

    @OriginalMember(owner = "client!te", name = "me", descriptor = "Lda;")
    private class54 field7739 = new class54();

    @OriginalMember(owner = "client!te", name = "ne", descriptor = "Lda;")
    public class54 field7740 = new class54();

    @OriginalMember(owner = "client!te", name = "pe", descriptor = "I")
    public int field7742 = 3;

    @OriginalMember(owner = "client!te", name = "oe", descriptor = "Z")
    private boolean field7741 = false;

    @OriginalMember(owner = "client!te", name = "te", descriptor = "I")
    public int field7746 = 8;

    @OriginalMember(owner = "client!te", name = "se", descriptor = "Lbu;")
    private class19 field7745 = new class19();

    @OriginalMember(owner = "client!te", name = "we", descriptor = "I")
    private int field7749 = -1;

    @OriginalMember(owner = "client!te", name = "ze", descriptor = "I")
    private int field7752 = -1;

    @OriginalMember(owner = "client!te", name = "ye", descriptor = "I")
    private int field7751 = -1;

    @OriginalMember(owner = "client!te", name = "ve", descriptor = "[Lnp;")
    private class419[] field7748 = new class419[4];

    @OriginalMember(owner = "client!te", name = "Be", descriptor = "[Lnp;")
    private class419[] field7754 = new class419[4];

    @OriginalMember(owner = "client!te", name = "Ce", descriptor = "[Lnp;")
    private class419[] field7755 = new class419[4];

    @OriginalMember(owner = "client!te", name = "De", descriptor = "Lbu;")
    private class19 field7756;

    @OriginalMember(owner = "client!te", name = "He", descriptor = "Lbu;")
    private class19 field7760;

    @OriginalMember(owner = "client!te", name = "Ie", descriptor = "Lbu;")
    private class19 field7761;

    @OriginalMember(owner = "client!te", name = "Je", descriptor = "Lbu;")
    private class19 field7762;

    @OriginalMember(owner = "client!te", name = "Ke", descriptor = "Lbu;")
    private class19 field7763;

    @OriginalMember(owner = "client!te", name = "Le", descriptor = "Lbu;")
    private class19 field7764;

    @OriginalMember(owner = "client!te", name = "Me", descriptor = "Lbu;")
    private class19 field7765;

    @OriginalMember(owner = "client!te", name = "Oe", descriptor = "F")
    public float field7767;

    @OriginalMember(owner = "client!te", name = "Ye", descriptor = "I")
    public int field7777;

    @OriginalMember(owner = "client!te", name = "ff", descriptor = "I")
    public int field7784;

    @OriginalMember(owner = "client!te", name = "If", descriptor = "I")
    private int field7812;

    @OriginalMember(owner = "client!te", name = "Se", descriptor = "I")
    private int field7771;

    @OriginalMember(owner = "client!te", name = "cf", descriptor = "F")
    public float field7781;

    @OriginalMember(owner = "client!te", name = "of", descriptor = "[F")
    private float[] field7792;

    @OriginalMember(owner = "client!te", name = "Zf", descriptor = "I")
    public int field7829;

    @OriginalMember(owner = "client!te", name = "Rf", descriptor = "F")
    private float field7821;

    @OriginalMember(owner = "client!te", name = "Wf", descriptor = "I")
    private int field7826;

    @OriginalMember(owner = "client!te", name = "Lf", descriptor = "[F")
    private float[] field7815;

    @OriginalMember(owner = "client!te", name = "jg", descriptor = "F")
    private float field7839;

    @OriginalMember(owner = "client!te", name = "hg", descriptor = "I")
    public int field7837;

    @OriginalMember(owner = "client!te", name = "ef", descriptor = "F")
    private float field7783;

    @OriginalMember(owner = "client!te", name = "Pf", descriptor = "F")
    public float field7819;

    @OriginalMember(owner = "client!te", name = "ig", descriptor = "F")
    private float field7838;

    @OriginalMember(owner = "client!te", name = "ag", descriptor = "I")
    public int field7830;

    @OriginalMember(owner = "client!te", name = "Yf", descriptor = "F")
    public float field7828;

    @OriginalMember(owner = "client!te", name = "dg", descriptor = "[F")
    private float[] field7833;

    @OriginalMember(owner = "client!te", name = "kg", descriptor = "F")
    public float field7840;

    @OriginalMember(owner = "client!te", name = "tf", descriptor = "I")
    private int field7797;

    @OriginalMember(owner = "client!te", name = "Xe", descriptor = "F")
    private float field7776;

    @OriginalMember(owner = "client!te", name = "Af", descriptor = "I")
    public int field7804;

    @OriginalMember(owner = "client!te", name = "Cg", descriptor = "I")
    public int field7858;

    @OriginalMember(owner = "client!te", name = "Fg", descriptor = "I")
    public int field7861;

    @OriginalMember(owner = "client!te", name = "rg", descriptor = "I")
    private int field7847;

    @OriginalMember(owner = "client!te", name = "wf", descriptor = "[F")
    public float[] field7800;

    @OriginalMember(owner = "client!te", name = "tg", descriptor = "F")
    public float field7849;

    @OriginalMember(owner = "client!te", name = "vg", descriptor = "I")
    private int field7851;

    @OriginalMember(owner = "client!te", name = "Kg", descriptor = "Z")
    private boolean field7866;

    @OriginalMember(owner = "client!te", name = "mf", descriptor = "[F")
    private float[] field7790;

    @OriginalMember(owner = "client!te", name = "Ig", descriptor = "I")
    public int field7864;

    @OriginalMember(owner = "client!te", name = "Jg", descriptor = "F")
    public float field7865;

    @OriginalMember(owner = "client!te", name = "Rg", descriptor = "I")
    private int field7873;

    @OriginalMember(owner = "client!te", name = "yg", descriptor = "I")
    private int field7854;

    @OriginalMember(owner = "client!te", name = "Ne", descriptor = "I")
    public int field7766;

    @OriginalMember(owner = "client!te", name = "Ug", descriptor = "I")
    public int field7876;

    @OriginalMember(owner = "client!te", name = "lf", descriptor = "I")
    private int field7789;

    @OriginalMember(owner = "client!te", name = "ah", descriptor = "F")
    public float field7882;

    @OriginalMember(owner = "client!te", name = "bh", descriptor = "I")
    private int field7883;

    @OriginalMember(owner = "client!te", name = "ch", descriptor = "[Lnm;")
    private class405[] field7884;

    @OriginalMember(owner = "client!te", name = "gg", descriptor = "Leo;")
    public class247 field7836;

    @OriginalMember(owner = "client!te", name = "fh", descriptor = "[I")
    public int[] field7887;

    @OriginalMember(owner = "client!te", name = "ih", descriptor = "[I")
    public int[] field7890;

    @OriginalMember(owner = "client!te", name = "hh", descriptor = "[I")
    public int[] field7889;

    @OriginalMember(owner = "client!te", name = "jh", descriptor = "[B")
    public byte[] field7891;

    @OriginalMember(owner = "client!te", name = "zd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7700;

    @OriginalMember(owner = "client!te", name = "jb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7580;

    @OriginalMember(owner = "client!te", name = "ie", descriptor = "I")
    public int field7735;

    @OriginalMember(owner = "client!te", name = "bb", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field7572;

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "J")
    private long field7569;

    @OriginalMember(owner = "client!te", name = "Ab", descriptor = "J")
    private long field7597;

    @OriginalMember(owner = "client!te", name = "mg", descriptor = "Z")
    public boolean field7842;

    @OriginalMember(owner = "client!te", name = "Ng", descriptor = "I")
    public int field7869;

    @OriginalMember(owner = "client!te", name = "ug", descriptor = "Ljava/lang/String;")
    private String field7850;

    @OriginalMember(owner = "client!te", name = "pf", descriptor = "Z")
    private boolean field7793;

    @OriginalMember(owner = "client!te", name = "Uf", descriptor = "Z")
    public boolean field7824;

    @OriginalMember(owner = "client!te", name = "dh", descriptor = "Z")
    public boolean field7885;

    @OriginalMember(owner = "client!te", name = "Kf", descriptor = "Z")
    public boolean field7814;

    @OriginalMember(owner = "client!te", name = "Vg", descriptor = "Z")
    public boolean field7877;

    @OriginalMember(owner = "client!te", name = "Sf", descriptor = "Z")
    private boolean field7822;

    @OriginalMember(owner = "client!te", name = "kf", descriptor = "Ljava/lang/String;")
    private String field7788;

    @OriginalMember(owner = "client!te", name = "Ag", descriptor = "Z")
    public boolean field7856;

    @OriginalMember(owner = "client!te", name = "Qg", descriptor = "Z")
    private boolean field7872;

    @OriginalMember(owner = "client!te", name = "be", descriptor = "Ltj;")
    private class170 field7728;

    @OriginalMember(owner = "client!te", name = "qe", descriptor = "Loaa;")
    public class242 field7743;

    @OriginalMember(owner = "client!te", name = "le", descriptor = "Lkf;")
    private class213 field7738;

    @OriginalMember(owner = "client!te", name = "je", descriptor = "Lrj;")
    private class512 field7736;

    @OriginalMember(owner = "client!te", name = "ge", descriptor = "Lcm;")
    private class622 field7733;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field7535 = 0;

    @OriginalMember(owner = "client!te", name = "Pc", descriptor = "I")
    public static int field7664 = 0;

    @OriginalMember(owner = "client!te", name = "gd", descriptor = "[[Z")
    public static boolean[][] field7681 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!te", name = "Qd", descriptor = "I")
    public static int field7717 = 0;

    @OriginalMember(owner = "client!te", name = "Ic", descriptor = "Ljava/lang/String;")
    public static String field7657 = "";

    @OriginalMember(owner = "client!te", name = "ce", descriptor = "I")
    public static int field7729 = 1;

    @OriginalMember(owner = "client!te", name = "Qe", descriptor = "F")
    public float field7769;

    @OriginalMember(owner = "client!te", name = "Ue", descriptor = "F")
    public float field7773;

    @OriginalMember(owner = "client!te", name = "Ze", descriptor = "F")
    public float field7778;

    @OriginalMember(owner = "client!te", name = "bf", descriptor = "F")
    private float field7780;

    @OriginalMember(owner = "client!te", name = "gf", descriptor = "F")
    public float field7785;

    @OriginalMember(owner = "client!te", name = "Ff", descriptor = "F")
    private float field7809;

    @OriginalMember(owner = "client!te", name = "Gf", descriptor = "F")
    public float field7810;

    @OriginalMember(owner = "client!te", name = "bg", descriptor = "F")
    public float field7831;

    @OriginalMember(owner = "client!te", name = "Dg", descriptor = "F")
    private float field7859;

    @OriginalMember(owner = "client!te", name = "Yg", descriptor = "F")
    public float field7880;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    private int field7546;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!te", name = "O", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!te", name = "P", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    private int field7561;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!te", name = "S", descriptor = "I")
    public int field7563;

    @OriginalMember(owner = "client!te", name = "T", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!te", name = "U", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!te", name = "V", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!te", name = "W", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!te", name = "ab", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!te", name = "cb", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!te", name = "db", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!te", name = "eb", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!te", name = "fb", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!te", name = "gb", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!te", name = "hb", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!te", name = "ib", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!te", name = "kb", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!te", name = "lb", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!te", name = "mb", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!te", name = "nb", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!te", name = "ob", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!te", name = "pb", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!te", name = "qb", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!te", name = "rb", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!te", name = "sb", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!te", name = "tb", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!te", name = "ub", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!te", name = "vb", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!te", name = "wb", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!te", name = "xb", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!te", name = "yb", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!te", name = "zb", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!te", name = "Bb", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!te", name = "Cb", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!te", name = "Db", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!te", name = "Eb", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!te", name = "Fb", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!te", name = "Gb", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!te", name = "Hb", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!te", name = "Ib", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!te", name = "Jb", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!te", name = "Kb", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!te", name = "Lb", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!te", name = "Mb", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!te", name = "Nb", descriptor = "I")
    public static int field7610;

    @OriginalMember(owner = "client!te", name = "Ob", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!te", name = "Pb", descriptor = "I")
    public int field7612;

    @OriginalMember(owner = "client!te", name = "Qb", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!te", name = "Rb", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!te", name = "Sb", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!te", name = "Tb", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!te", name = "Ub", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!te", name = "Vb", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!te", name = "Wb", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!te", name = "Xb", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!te", name = "Yb", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!te", name = "Zb", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!te", name = "ac", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!te", name = "bc", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!te", name = "cc", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!te", name = "dc", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!te", name = "ec", descriptor = "I")
    public static int field7627;

    @OriginalMember(owner = "client!te", name = "fc", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!te", name = "gc", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!te", name = "hc", descriptor = "I")
    public static int field7630;

    @OriginalMember(owner = "client!te", name = "ic", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!te", name = "jc", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!te", name = "kc", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!te", name = "lc", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!te", name = "mc", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!te", name = "nc", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!te", name = "oc", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!te", name = "pc", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!te", name = "qc", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!te", name = "rc", descriptor = "I")
    public static int field7640;

    @OriginalMember(owner = "client!te", name = "sc", descriptor = "I")
    public static int field7641;

    @OriginalMember(owner = "client!te", name = "tc", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!te", name = "uc", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!te", name = "vc", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!te", name = "wc", descriptor = "I")
    public static int field7645;

    @OriginalMember(owner = "client!te", name = "xc", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!te", name = "yc", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!te", name = "zc", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!te", name = "Ac", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!te", name = "Bc", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!te", name = "Cc", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!te", name = "Dc", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!te", name = "Ec", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!te", name = "Fc", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!te", name = "Gc", descriptor = "I")
    public static int field7655;

    @OriginalMember(owner = "client!te", name = "Hc", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!te", name = "Jc", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!te", name = "Kc", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!te", name = "Mc", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!te", name = "Nc", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!te", name = "Oc", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!te", name = "Qc", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!te", name = "Rc", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!te", name = "Sc", descriptor = "I")
    public static int field7667;

    @OriginalMember(owner = "client!te", name = "Tc", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!te", name = "Uc", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!te", name = "Vc", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!te", name = "Wc", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!te", name = "Xc", descriptor = "I")
    public static int field7672;

    @OriginalMember(owner = "client!te", name = "Yc", descriptor = "I")
    public static int field7673;

    @OriginalMember(owner = "client!te", name = "Zc", descriptor = "I")
    public static int field7674;

    @OriginalMember(owner = "client!te", name = "ad", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!te", name = "bd", descriptor = "I")
    public static int field7676;

    @OriginalMember(owner = "client!te", name = "cd", descriptor = "I")
    public static int field7677;

    @OriginalMember(owner = "client!te", name = "dd", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!te", name = "ed", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!te", name = "fd", descriptor = "I")
    public static int field7680;

    @OriginalMember(owner = "client!te", name = "hd", descriptor = "I")
    public static int field7682;

    @OriginalMember(owner = "client!te", name = "id", descriptor = "I")
    public static int field7683;

    @OriginalMember(owner = "client!te", name = "jd", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!te", name = "kd", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!te", name = "ld", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!te", name = "md", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!te", name = "nd", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!te", name = "od", descriptor = "I")
    public static int field7689;

    @OriginalMember(owner = "client!te", name = "pd", descriptor = "I")
    public static int field7690;

    @OriginalMember(owner = "client!te", name = "qd", descriptor = "I")
    public static int field7691;

    @OriginalMember(owner = "client!te", name = "rd", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!te", name = "sd", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!te", name = "td", descriptor = "I")
    public static int field7694;

    @OriginalMember(owner = "client!te", name = "ud", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!te", name = "vd", descriptor = "I")
    public static int field7696;

    @OriginalMember(owner = "client!te", name = "wd", descriptor = "I")
    public static int field7697;

    @OriginalMember(owner = "client!te", name = "xd", descriptor = "I")
    public static int field7698;

    @OriginalMember(owner = "client!te", name = "yd", descriptor = "I")
    public static int field7699;

    @OriginalMember(owner = "client!te", name = "Ad", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!te", name = "Bd", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!te", name = "Cd", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!te", name = "Dd", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!te", name = "Ed", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!te", name = "Fd", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!te", name = "Gd", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!te", name = "Hd", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!te", name = "Id", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!te", name = "Jd", descriptor = "I")
    public static int field7710;

    @OriginalMember(owner = "client!te", name = "Kd", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!te", name = "Ld", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!te", name = "Md", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!te", name = "Nd", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!te", name = "Od", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!te", name = "Pd", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!te", name = "Rd", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!te", name = "Sd", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!te", name = "Td", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!te", name = "Ud", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!te", name = "Vd", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!te", name = "Wd", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!te", name = "Xd", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!te", name = "Yd", descriptor = "I")
    public static int field7725;

    @OriginalMember(owner = "client!te", name = "Zd", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!te", name = "ae", descriptor = "I")
    public static int field7727;

    @OriginalMember(owner = "client!te", name = "de", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!te", name = "ee", descriptor = "I")
    public static int field7731;

    @OriginalMember(owner = "client!te", name = "ke", descriptor = "I")
    public static int field7737;

    @OriginalMember(owner = "client!te", name = "ue", descriptor = "I")
    public int field7747;

    @OriginalMember(owner = "client!te", name = "Ee", descriptor = "I")
    private int field7757;

    @OriginalMember(owner = "client!te", name = "Fe", descriptor = "I")
    public int field7758;

    @OriginalMember(owner = "client!te", name = "Ge", descriptor = "I")
    public int field7759;

    @OriginalMember(owner = "client!te", name = "Te", descriptor = "I")
    private int field7772;

    @OriginalMember(owner = "client!te", name = "uf", descriptor = "I")
    private int field7798;

    @OriginalMember(owner = "client!te", name = "vf", descriptor = "I")
    private int field7799;

    @OriginalMember(owner = "client!te", name = "yf", descriptor = "I")
    private int field7802;

    @OriginalMember(owner = "client!te", name = "Df", descriptor = "I")
    public int field7807;

    @OriginalMember(owner = "client!te", name = "Jf", descriptor = "I")
    private int field7813;

    @OriginalMember(owner = "client!te", name = "lg", descriptor = "I")
    private int field7841;

    @OriginalMember(owner = "client!te", name = "ng", descriptor = "I")
    private int field7843;

    @OriginalMember(owner = "client!te", name = "qg", descriptor = "I")
    private int field7846;

    @OriginalMember(owner = "client!te", name = "zg", descriptor = "I")
    private int field7855;

    @OriginalMember(owner = "client!te", name = "Hg", descriptor = "I")
    public int field7863;

    @OriginalMember(owner = "client!te", name = "Lg", descriptor = "I")
    public int field7867;

    @OriginalMember(owner = "client!te", name = "Og", descriptor = "I")
    private int field7870;

    @OriginalMember(owner = "client!te", name = "Pg", descriptor = "I")
    public int field7871;

    @OriginalMember(owner = "client!te", name = "Zg", descriptor = "I")
    private int field7881;

    @OriginalMember(owner = "client!te", name = "eh", descriptor = "I")
    private int field7886;

    @OriginalMember(owner = "client!te", name = "gh", descriptor = "I")
    private int field7888;

    @OriginalMember(owner = "client!te", name = "wg", descriptor = "J")
    private long field7852;

    @OriginalMember(owner = "client!te", name = "af", descriptor = "Lmg;")
    private class130 field7779;

    @OriginalMember(owner = "client!te", name = "Nf", descriptor = "Lne;")
    public class266 field7817;

    @OriginalMember(owner = "client!te", name = "Xf", descriptor = "Lrp;")
    private class371 field7827;

    @OriginalMember(owner = "client!te", name = "Ve", descriptor = "Lmaa;")
    public class403 field7774;

    @OriginalMember(owner = "client!te", name = "Bf", descriptor = "Lmaa;")
    public class403 field7805;

    @OriginalMember(owner = "client!te", name = "xe", descriptor = "Lnp;")
    private class419 field7750;

    @OriginalMember(owner = "client!te", name = "Ae", descriptor = "Lnp;")
    private class419 field7753;

    @OriginalMember(owner = "client!te", name = "sf", descriptor = "Lea;")
    public class468 field7796;

    @OriginalMember(owner = "client!te", name = "Mf", descriptor = "Lsp;")
    private class544 field7816;

    @OriginalMember(owner = "client!te", name = "Bg", descriptor = "Lsp;")
    private class544 field7857;

    @OriginalMember(owner = "client!te", name = "xf", descriptor = "Lda;")
    public class54 field7801;

    @OriginalMember(owner = "client!te", name = "Tg", descriptor = "Lda;")
    public class54 field7875;

    @OriginalMember(owner = "client!te", name = "Re", descriptor = "Lmj;")
    private class562 field7770;

    @OriginalMember(owner = "client!te", name = "jf", descriptor = "Lqu;")
    public class82 field7787;

    @OriginalMember(owner = "client!te", name = "qf", descriptor = "Lqu;")
    public class82 field7794;

    @OriginalMember(owner = "client!te", name = "zf", descriptor = "Lqu;")
    public class82 field7803;

    @OriginalMember(owner = "client!te", name = "Hf", descriptor = "Lqu;")
    public class82 field7811;

    @OriginalMember(owner = "client!te", name = "Qf", descriptor = "Lqu;")
    public class82 field7820;

    @OriginalMember(owner = "client!te", name = "eg", descriptor = "Lqu;")
    public class82 field7834;

    @OriginalMember(owner = "client!te", name = "sg", descriptor = "Lqu;")
    public class82 field7848;

    @OriginalMember(owner = "client!te", name = "Eg", descriptor = "Lqu;")
    public class82 field7860;

    @OriginalMember(owner = "client!te", name = "Wg", descriptor = "Lqu;")
    public class82 field7878;

    @OriginalMember(owner = "client!te", name = "Xg", descriptor = "Lqu;")
    public class82 field7879;

    @OriginalMember(owner = "client!te", name = "re", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field7744;

    @OriginalMember(owner = "client!te", name = "Pe", descriptor = "Z")
    private boolean field7768;

    @OriginalMember(owner = "client!te", name = "We", descriptor = "Z")
    private boolean field7775;

    @OriginalMember(owner = "client!te", name = "df", descriptor = "Z")
    public boolean field7782;

    @OriginalMember(owner = "client!te", name = "nf", descriptor = "Z")
    private boolean field7791;

    @OriginalMember(owner = "client!te", name = "rf", descriptor = "Z")
    private boolean field7795;

    @OriginalMember(owner = "client!te", name = "Cf", descriptor = "Z")
    public boolean field7806;

    @OriginalMember(owner = "client!te", name = "Ef", descriptor = "Z")
    public boolean field7808;

    @OriginalMember(owner = "client!te", name = "Of", descriptor = "Z")
    public boolean field7818;

    @OriginalMember(owner = "client!te", name = "Tf", descriptor = "Z")
    private boolean field7823;

    @OriginalMember(owner = "client!te", name = "Vf", descriptor = "Z")
    public boolean field7825;

    @OriginalMember(owner = "client!te", name = "cg", descriptor = "Z")
    private boolean field7832;

    @OriginalMember(owner = "client!te", name = "fg", descriptor = "Z")
    private boolean field7835;

    @OriginalMember(owner = "client!te", name = "og", descriptor = "Z")
    private boolean field7844;

    @OriginalMember(owner = "client!te", name = "pg", descriptor = "Z")
    private boolean field7845;

    @OriginalMember(owner = "client!te", name = "xg", descriptor = "Z")
    public boolean field7853;

    @OriginalMember(owner = "client!te", name = "Gg", descriptor = "Z")
    public boolean field7862;

    @OriginalMember(owner = "client!te", name = "Mg", descriptor = "Z")
    private boolean field7868;

    @OriginalMember(owner = "client!te", name = "Sg", descriptor = "Z")
    public boolean field7874;

    @OriginalMember(owner = "client!te", name = "hf", descriptor = "[Ljl;")
    private class228[] field7786;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "(IIII)V")
    public final void method510(int arg0, int arg1, int arg2, int arg3) {
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (arg3 > this.field7563) {
            arg3 = this.field7563;
        }
        ++field7566;
        if (~this.field7612 > ~arg2) {
            arg2 = this.field7612;
        }
        if (~arg1 > -1) {
            arg1 = 0;
        }
        this.field7789 = arg3;
        this.field7883 = arg1;
        this.field7826 = arg2;
        this.field7847 = arg0;
        OpenGL.glEnable(3089);
        this.method3179((byte) -16);
        this.method3117((byte) -38);
    }

    @OriginalMember(owner = "client!te", name = "P", descriptor = "()F")
    public final float method450() {
        ++field7636;
        return this.field7819;
    }

    @OriginalMember(owner = "client!te", name = "p", descriptor = "()Z")
    public final boolean method434() {
        ++field7654;
        return false;
    }

    @OriginalMember(owner = "client!te", name = "ta", descriptor = "(II)V")
    public final void method451(int arg0, int arg1) {
        if (~this.field7829 != ~arg0 || this.field7766 != arg1) {
            this.field7766 = arg1;
            this.field7829 = arg0;
            this.method3168(103);
            this.method3108(-121);
            if (~this.field7802 == -4) {
                this.method3110(-112);
            } else if (this.field7802 == 2) {
                this.method3119(-31190);
            }
        }
        ++field7651;
    }

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "(I)V")
    public final void method421(int arg0) {
        this.method3105(0, 2);
        ++field7626;
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(II)I")
    public static final int method3103(int arg0, int arg1) {
        ++field7726;
        return arg1 != 768 ? -4 : arg0 >>> 7;
    }

    @OriginalMember(owner = "client!te", name = "i", descriptor = "(I)V")
    private final void method3104(int arg0) {
        ++field7590;
        if (arg0 == -29526) {
            int var2 = 0;
            while (!this.field7572.method3216()) {
                if (~(var2++) < -6) {
                    throw new RuntimeException("");
                }
                class236.method1513(true, 1000L);
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "ra", descriptor = "()F")
    public final float method472() {
        ++field7730;
        return this.field7810;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIII)V")
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7663;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        this.method3109(1);
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method3105(arg5, 2);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7845) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7845) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!te", name = "x", descriptor = "()V")
    public final void method485() {
        ++field7551;
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(II)V")
    public final void method3105(int arg0, int arg1) {
        if (arg1 == 2) {
            if (~this.field7843 != ~arg0) {
                boolean var3;
                boolean var4;
                byte var5;
                if (arg0 != 1) {
                    if (~arg0 != -3) {
                        if (~arg0 != -129) {
                            var3 = true;
                            var4 = false;
                            var5 = 0;
                        } else {
                            var5 = 3;
                            var3 = true;
                            var4 = true;
                        }
                    } else {
                        var3 = true;
                        var4 = false;
                        var5 = 2;
                    }
                } else {
                    var4 = true;
                    var3 = true;
                    var5 = 1;
                }
                if (!var3 != !this.field7844) {
                    OpenGL.glColorMask(var3, var3, var3, true);
                    this.field7844 = var3;
                }
                if (!this.field7868 != !var4) {
                    if (var4) {
                        OpenGL.glEnable(3008);
                    } else {
                        OpenGL.glDisable(3008);
                    }
                    this.field7868 = var4;
                }
                if (~this.field7799 != ~var5) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (var5 != 3) {
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
                    this.field7799 = var5;
                }
                this.field7772 &= -29;
                this.field7843 = arg0;
            }
            ++field7698;
        }
    }

    @OriginalMember(owner = "client!te", name = "la", descriptor = "(FF)V")
    public final void method422(float arg0, float arg1) {
        if (this.field7819 != arg0 || this.field7810 != arg1) {
            this.field7810 = arg1;
            this.field7819 = arg0;
            this.method3162(10);
            if (this.field7802 == 3) {
                this.method3110(-27);
            } else if (this.field7802 == 2) {
                this.method3119(-31190);
            }
        }
        ++field7608;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)V")
    public final void method3106(boolean arg0, int arg1) {
        if (!arg0 == this.field7795) {
            this.field7795 = arg0;
            this.method3125(2912);
            this.field7772 &= -32;
        }
        ++field7644;
        if (arg1 > -94) {
            this.method487();
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IBII)V")
    public final void method3107(int arg0, byte arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg3 + 34184, arg0);
        if (arg1 > -8) {
            this.method3137(-99, 45, -38);
        }
        ++field7536;
        OpenGL.glTexEnvi(8960, arg3 + 34200, arg2);
    }

    @OriginalMember(owner = "client!te", name = "j", descriptor = "(I)V")
    private final void method3108(int arg0) {
        ++field7646;
        int var2;
        if (this.field7818) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field7854;
        } else {
            this.field7809 = (float) (-this.field7777 + this.field7766) - this.field7776;
            this.field7785 = -((float) this.field7784 * this.field7821) + this.field7809;
            if (this.field7785 < (float) this.field7829) {
                this.field7785 = (float) this.field7829;
            }
            OpenGL.glFogf(2915, this.field7785);
            OpenGL.glFogf(2916, this.field7809);
            var2 = this.field7858;
        }
        class588.field8725[0] = (float) class37.method245(var2, 16711680) / 1.671168E7F;
        class588.field8725[1] = (float) class37.method245(var2, 65280) / 65280.0F;
        class588.field8725[2] = (float) class37.method245(255, var2) / 255.0F;
        OpenGL.glFogfv(2918, class588.field8725, 0);
        if (this.field7818) {
            this.field7733.field9163.method153(-16597);
        }
        if (arg0 > -119) {
            this.method451(-39, 6);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lqba;)V")
    public final void method426(class345 arg0) {
        ++field7674;
        this.field7779 = (class130) arg0;
    }

    @OriginalMember(owner = "client!te", name = "k", descriptor = "(I)V")
    private final void method3109(int arg0) {
        if (this.field7772 != arg0) {
            this.method3178(-25);
            this.method3106(false, -119);
            this.method3184(true, false);
            this.method3156(false, true);
            this.method3142(false, (byte) 89);
            this.method3152(-2, (class228) null);
            this.method3123(-2, false);
            this.method3121(-27745, 1);
            this.field7772 = 1;
        }
        ++field7720;
    }

    @OriginalMember(owner = "client!te", name = "l", descriptor = "(I)V")
    private final void method3110(int arg0) {
        ++field7575;
        float var2 = (float) (-this.field7876) * this.field7783 / (float) this.field7804;
        float var3 = (float) (-this.field7861) * this.field7783 / (float) this.field7864;
        float var4 = (float) (-this.field7876 + this.field7612) * this.field7783 / (float) this.field7804;
        float var5 = (float) (-this.field7861 + this.field7563) * this.field7783 / (float) this.field7864;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field7829 - this.field7810), (double) ((float) this.field7766 + -this.field7810));
        }
        if (arg0 >= -9) {
            this.method3152(-72, (class228) null);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(II)V")
    public final void method3111(int arg0, int arg1) {
        ++field7592;
        if (arg0 != 33984) {
            this.method528(-89, 85);
        }
        if (~this.field7881 != ~arg1) {
            OpenGL.glActiveTexture(33984 - -arg1);
            this.field7881 = arg1;
        }
    }

    @OriginalMember(owner = "client!te", name = "h", descriptor = "()Z")
    public final boolean method486() {
        ++field7665;
        return true;
    }

    @OriginalMember(owner = "client!te", name = "q", descriptor = "(IIII)V")
    public final void method443(int arg0, int arg1, int arg2, int arg3) {
        ++field7582;
        this.field7830 = arg2;
        this.field7863 = arg0;
        this.field7854 = arg1;
        this.field7818 = true;
        this.field7837 = arg3;
        this.field7733.method3637(0, 3, (byte) 32, false, false, 0);
        this.field7733.field9163.method152(0);
        this.method3108(-127);
        this.method3125(2912);
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(Z)V")
    public static void method3112(boolean arg0) {
        field7657 = null;
        if (!arg0) {
            method3112(false);
        }
        field7681 = null;
    }

    @OriginalMember(owner = "client!te", name = "A", descriptor = "(IIIII)V")
    public final void method482(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~arg2 > -1) {
            arg2 = -arg2;
        }
        ++field7558;
        if (~this.field7847 >= ~(arg0 + arg2) && -arg2 + arg0 <= this.field7826 && ~this.field7883 >= ~(arg1 + arg2) && ~this.field7789 <= ~(-arg2 + arg1)) {
            this.method3109(1);
            this.method3105(arg4, 2);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field7838 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if ((float) var8 <= this.field7839) {
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
                if (~var9 >= -65) {
                    var9 = 64;
                } else if (var9 > 512) {
                    var9 = 512;
                }
                int var10 = class496.method2959(var9, -124);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = 16384 - var10; var11 > 0; var11 -= var10) {
                    OpenGL.glVertex2f(class323.field4454[var11] * (float) arg2 + var6, class323.field4445[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "([I)V")
    public final void method431(int[] arg0) {
        arg0[1] = this.field7883;
        arg0[3] = this.field7789;
        arg0[0] = this.field7847;
        arg0[2] = this.field7826;
        ++field7544;
    }

    @OriginalMember(owner = "client!te", name = "g", descriptor = "()Z")
    public final boolean method437() {
        ++field7587;
        return true;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)V")
    public final void method3113(int arg0, boolean arg1) {
        ++field7679;
        if (arg0 != 442822664) {
            this.method445(2, -19, 122, 9, -41, -100);
        }
        if (!arg1 != !this.field7823) {
            this.field7823 = arg1;
            this.method3176(-11310);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lqba;Lqba;FLqba;)Lqba;")
    public final class345 method439(class345 arg0, class345 arg1, float arg2, class345 arg3) {
        ++field7710;
        if (arg0 != null && arg1 != null && this.field7853 && this.field7856) {
            class569 var5 = null;
            class130 var6 = (class130) arg0;
            class130 var7 = (class130) arg1;
            class384 var8 = var6.method909(18511);
            class384 var9 = var7.method909(18511);
            if (var8 != null && var9 != null) {
                int var10 = ~var8.field5280 < ~var9.field5280 ? var8.field5280 : var9.field5280;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class569) {
                    class569 var11 = (class569) arg3;
                    if (var10 == var11.method3396((byte) 18)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class569(this, var10);
                }
                if (var5.method3394(false, var9, var8, arg2)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!te", name = "m", descriptor = "(I)Lci;")
    public final class384 method3114(int arg0) {
        if (arg0 != 31095) {
            this.method470(-1.007741F, 0.86258465F, 0.83801687F);
        }
        ++field7607;
        return this.field7779 != null ? this.field7779.method909(18511) : null;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(ZI)V")
    public final void method3115(boolean arg0, int arg1) {
        class588.field8725[3] = (float) (arg1 >>> 24) / 255.0F;
        class588.field8725[0] = (float) class37.method245(16711680, arg1) / 1.671168E7F;
        ++field7559;
        class588.field8725[2] = (float) class37.method245(arg1, 255) / 255.0F;
        if (arg0) {
            class588.field8725[1] = (float) class37.method245(arg1, 65280) / 65280.0F;
            OpenGL.glTexEnvfv(8960, 8705, class588.field8725, 0);
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
    public final void method449(boolean arg0) {
        ++field7554;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLnp;)V")
    public final void method3116(byte arg0, class419 arg1) {
        ++field7697;
        if (this.field7752 >= 0 && this.field7755[this.field7752] == arg1) {
            this.field7755[this.field7752--] = null;
            arg1.method1686((byte) -9);
            if (this.field7752 < 0) {
                this.field7753 = null;
            } else {
                this.field7753 = this.field7755[this.field7752];
                this.field7753.method1683((byte) 56);
            }
            int var3 = 43 / ((arg0 - 40) / 41);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!te", name = "UA", descriptor = "(IIIII)V")
    public final void method432(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3109(1);
        ++field7640;
        this.method3105(arg4, 2);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
    private final void method3117(byte arg0) {
        ++field7586;
        if (arg0 == -38) {
            if (this.field7847 <= this.field7826 && ~this.field7789 <= ~this.field7883) {
                OpenGL.glScissor(this.field7771 - -this.field7847, this.field7812 + this.field7563 + -this.field7789, -this.field7847 + this.field7826, -this.field7883 + this.field7789);
            } else {
                OpenGL.glScissor(0, 0, 0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "z", descriptor = "()Z")
    public final boolean method471() {
        ++field7647;
        return true;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)I")
    public final int method478(int arg0, int arg1) {
        ++field7658;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!te", name = "n", descriptor = "(I)V")
    private final void method3118(int arg0) {
        ++field7706;
        int var2;
        for (var2 = 0; var2 < this.field7798; ++var2) {
            class405 var3 = this.field7884[var2];
            int var4 = var2 + 16386;
            class210.field3108[0] = (float) var3.method2388((byte) -117);
            class210.field3108[1] = (float) var3.method2383(2039035457);
            class210.field3108[2] = (float) var3.method2389(-10161);
            class210.field3108[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class210.field3108, 0);
            int var5 = var3.method2384(630);
            float var6 = var3.method2382(0) / 255.0F;
            class210.field3108[1] = var6 * (float) (class37.method245(65523, var5) >> 8);
            class210.field3108[0] = (float) (class37.method245(var5, 16724067) >> 16) * var6;
            class210.field3108[2] = var6 * (float) class37.method245(255, var5);
            OpenGL.glLightfv(var4, 4609, class210.field3108, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method2390(6042) * var3.method2390(6042)));
            OpenGL.glEnable(var4);
        }
        while (~var2 > ~this.field7813) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        if (arg0 <= -123) {
            this.field7813 = this.field7798;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II[I[I)Lpa;")
    public final class311 method526(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field7653;
        return class200.method1344(-39, this, arg2, arg3, arg0, arg1);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)V")
    public final void method506(int arg0, int arg1, int arg2, int arg3) {
        this.field7738.method1401(arg1, -122, arg2, arg0, arg3);
        ++field7638;
    }

    @OriginalMember(owner = "client!te", name = "o", descriptor = "(I)V")
    private final void method3119(int arg0) {
        if (arg0 != -31190) {
            this.method465();
        }
        ++field7537;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field7815, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!te", name = "p", descriptor = "(I)I")
    private final int method3120(int arg0) {
        ++field7645;
        int var2 = 0;
        this.field7788 = OpenGL.glGetString(7936).toLowerCase();
        this.field7850 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field7788.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field7788.indexOf("brian paul") != -1 || this.field7788.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class587.method3490(' ', arg0 + 1792, var3.replace('.', ' '));
        if (var4.length >= 2) {
            try {
                int var5 = class197.method1327(var4[0], -47);
                int var6 = class197.method1327(var4[1], -98);
                this.field7855 = var5 * 10 - -var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (this.field7855 < 12) {
            var2 |= 2;
        }
        if (!this.field7572.method3217("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field7572.method3217("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field7807 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field7870 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field7841 = var7[0];
        if (this.field7807 < 2 || ~this.field7870 > -3 || ~this.field7841 > -3) {
            var2 |= 16;
        }
        this.field7842 = Stream.method3454();
        this.field7572.arePbuffersAvailable();
        this.field7793 = this.field7572.method3217("GL_ARB_vertex_buffer_object");
        this.field7845 = this.field7572.method3217("GL_ARB_multisample");
        this.field7862 = this.field7572.method3217("GL_ARB_vertex_program");
        this.field7572.method3217("GL_ARB_fragment_program");
        this.field7874 = this.field7572.method3217("GL_ARB_vertex_shader");
        this.field7825 = this.field7572.method3217("GL_ARB_fragment_shader");
        this.field7824 = this.field7572.method3217("GL_EXT_texture3D");
        this.field7814 = this.field7572.method3217("GL_ARB_texture_rectangle");
        this.field7853 = this.field7572.method3217("GL_ARB_texture_cube_map");
        this.field7885 = this.field7572.method3217("GL_ARB_texture_float");
        this.field7806 = false;
        this.field7856 = this.field7572.method3217("GL_EXT_framebuffer_object");
        this.field7782 = this.field7572.method3217("GL_EXT_framebuffer_blit");
        this.field7808 = this.field7572.method3217("GL_EXT_framebuffer_multisample");
        if (arg0 != -1700) {
            this.method502(15);
        }
        this.field7832 = this.field7808 & this.field7782;
        OpenGL.glGetFloatv(2834, class588.field8725, 0);
        this.field7838 = class588.field8725[0];
        this.field7839 = class588.field8725[1];
        return ~var2 == -1 ? 0 : var2;
    }

    @OriginalMember(owner = "client!te", name = "C", descriptor = "()Lm;")
    public final class165 method428() {
        ++field7707;
        return this.field7739;
    }

    @OriginalMember(owner = "client!te", name = "g", descriptor = "(II)V")
    public final void method3121(int arg0, int arg1) {
        ++field7691;
        if (~arg1 == -2) {
            this.method3183(7681, arg0 ^ 27678, 7681);
        } else if (~arg1 != -1) {
            if (~arg1 != -3) {
                if (~arg1 == -4) {
                    this.method3183(260, -125, 8448);
                } else if (arg1 == 4) {
                    this.method3183(34023, arg0 + 27620, 34023);
                }
            } else {
                this.method3183(34165, -125, 7681);
            }
        } else {
            this.method3183(8448, -128, 8448);
        }
        if (arg0 != -27745) {
            this.method435();
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
    public final void method459(int arg0) {
        ++field7616;
        this.method3104(-29526);
    }

    @OriginalMember(owner = "client!te", name = "q", descriptor = "(I)V")
    private final void method3122(int arg0) {
        ++field7613;
        if (this.field7580 == null) {
            this.field7561 = this.field7546 = 0;
        } else {
            Dimension var2 = this.field7580.getSize();
            this.field7546 = var2.height;
            this.field7561 = var2.width;
        }
        if (this.field7753 == null) {
            this.field7563 = this.field7546;
            this.field7612 = this.field7561;
            this.method3129((byte) 6);
        }
        this.method3141(false);
        this.method479();
        if (arg0 != 1) {
            this.method522();
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(IZ)V")
    public final void method3123(int arg0, boolean arg1) {
        this.method3146((byte) 47, arg0, true);
        ++field7571;
        if (arg1) {
            this.method486();
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(IIIII)V")
    public final void method446(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7705;
        this.method3109(1);
        this.method3105(arg4, 2);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILnp;)V")
    public final void method3124(int arg0, class419 arg1) {
        int var3 = -105 % ((2 - arg0) / 57);
        ++field7627;
        if (~this.field7751 <= -1 && this.field7754[this.field7751] == arg1) {
            this.field7754[this.field7751--] = null;
            arg1.method1691(6706);
            if (~this.field7751 <= -1) {
                this.field7750 = this.field7754[this.field7751];
                this.field7750.method1673(-78);
            } else {
                this.field7750 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!te", name = "r", descriptor = "(I)V")
    private final void method3125(int arg0) {
        ++field7584;
        if (arg0 == 2912) {
            if (this.field7795 && this.field7784 >= 0 | this.field7818) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V")
    private final void method3126(byte arg0) {
        OpenGL.glDepthMask(this.field7791 && this.field7866);
        if (arg0 != -101) {
            this.method431((int[]) null);
        }
        ++field7599;
    }

    @OriginalMember(owner = "client!te", name = "E", descriptor = "(III)V")
    public final void method489(int arg0, int arg1, int arg2) {
        ++field7650;
        if (~this.field7858 != ~arg0 || this.field7784 != arg1 || ~this.field7777 != ~arg2) {
            this.field7784 = arg1;
            this.field7858 = arg0;
            this.field7777 = arg2;
            if (this.field7818) {
                return;
            }
            this.method3108(-121);
            this.method3125(2912);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public final class176 method458(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field7680;
        return new class244(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lnp;I)V")
    public final void method3127(class419 arg0, int arg1) {
        ++field7712;
        if (arg1 < 98) {
            this.method3113(-1, false);
        }
        if (this.field7752 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field7752 <= -1) {
                this.field7755[this.field7752].method1686((byte) -9);
            }
            this.field7753 = this.field7755[++this.field7752] = arg0;
            this.field7753.method1683((byte) 56);
        }
    }

    @OriginalMember(owner = "client!te", name = "s", descriptor = "(I)V")
    private final void method3128(int arg0) {
        ++field7637;
        if (this.field7768) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field7768 = false;
        }
        if (arg0 != -1) {
            this.field7858 = -123;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
    public final void method460(boolean arg0) {
        ++field7724;
        this.field7866 = arg0;
        this.method3126((byte) -101);
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(B)V")
    private final void method3129(byte arg0) {
        if (arg0 != 6) {
            this.method466((int[]) null, -118, 52, 90, 85);
        }
        ++field7591;
        OpenGL.glViewport(this.field7771, this.field7812, this.field7612, this.field7563);
    }

    @OriginalMember(owner = "client!te", name = "t", descriptor = "(I)V")
    public final void method3130(int arg0) {
        if (this.field7772 != 8) {
            this.method3174(1);
            this.method3106(true, -104);
            this.method3156(true, true);
            this.method3142(true, (byte) 83);
            this.method3105(1, 2);
            this.field7772 = 8;
        }
        if (arg0 <= 38) {
            this.method3157(37, 110, true, -20);
        }
        ++field7635;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lrd;)V")
    public final void method488(class283 arg0) {
        this.field7734.method3333(arg0, -65, this);
        ++field7598;
    }

    @OriginalMember(owner = "client!te", name = "u", descriptor = "(I)V")
    private final void method3131(int arg0) {
        ++field7565;
        class588.field8725[3] = 1.0F;
        class588.field8725[0] = this.field7849 * this.field7840;
        class588.field8725[1] = this.field7849 * this.field7828;
        class588.field8725[2] = this.field7865 * this.field7849;
        OpenGL.glLightfv(16384, 4609, class588.field8725, 0);
        class588.field8725[2] = -this.field7882 * this.field7865;
        if (arg0 > -41) {
            this.field7778 = 1.1900977F;
        }
        class588.field8725[0] = -this.field7882 * this.field7840;
        class588.field8725[1] = -this.field7882 * this.field7828;
        class588.field8725[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class588.field8725, 0);
    }

    @OriginalMember(owner = "client!te", name = "k", descriptor = "()V")
    public final void method433() {
        ++field7594;
        if (this.field7872 && ~this.field7612 < -1 && ~this.field7563 < -1) {
            int var1 = this.field7847;
            int var2 = this.field7826;
            int var3 = this.field7883;
            int var4 = this.field7789;
            this.method479();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3141(false);
            this.method3106(false, -115);
            this.method3184(true, false);
            this.method3156(false, true);
            this.method3142(false, (byte) 103);
            this.method3152(-2, (class228) null);
            this.method3123(-2, false);
            this.method3121(-27745, 1);
            this.method3105(0, 2);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field7612, this.field7563, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method510(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method515(Canvas arg0) {
        ++field7721;
        if (this.field7700 == arg0) {
            throw new RuntimeException();
        } else if (!this.field7660.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field7572.prepareSurface(arg0);
                if (var4 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field7660.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "v", descriptor = "(I)V")
    private final void method3132(int arg0) {
        ++field7703;
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(180.0F, (float) arg0, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field7875.method334(14), 0);
        if (this.field7818) {
            this.field7733.field9163.method152(0);
        }
        this.method3182((byte) 73);
        this.method3118(-125);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
    public final void method3133(int arg0, int arg1, int arg2) {
        if (arg1 >= 96) {
            this.field7812 = arg0;
            ++field7542;
            this.field7771 = arg2;
            this.method3129((byte) 6);
            this.method3117((byte) -38);
        }
    }

    @OriginalMember(owner = "client!te", name = "h", descriptor = "(II)V")
    public final synchronized void method3134(int arg0, int arg1) {
        ++field7713;
        if (arg0 <= 9) {
            this.method420();
        }
        class417 var3 = new class417();
        var3.field5651 = (long) arg1;
        this.field7764.method131(var3, 0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IF)V")
    public final void method3135(int arg0, float arg1) {
        ++field7737;
        if (arg0 != 29573) {
            this.field7851 = -74;
        }
        if (this.field7783 != arg1) {
            this.field7783 = arg1;
            if (~this.field7802 == -4) {
                this.method3110(arg0 + -29670);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(III)V")
    public final synchronized void method3136(int arg0, int arg1, int arg2) {
        ++field7694;
        class556 var4 = new class556(arg1);
        var4.field5651 = (long) arg2;
        if (arg0 != 1325362984) {
            this.method3123(70, false);
        }
        this.field7763.method131(var4, 0);
    }

    @OriginalMember(owner = "client!te", name = "U", descriptor = "()I")
    public final int method454() {
        ++field7625;
        return this.field7759 + this.field7758 - -this.field7757;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I[Lnm;)V")
    public final void method429(int arg0, class405[] arg1) {
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field7884[var3] = arg1[var3];
        }
        ++field7619;
        this.field7798 = arg0;
        if (this.field7802 != 1) {
            this.method3118(-124);
        }
    }

    @OriginalMember(owner = "client!te", name = "L", descriptor = "(I)V")
    public final void method463(int arg0) {
        ++field7631;
        this.field7742 = 0;
        while (arg0 > 1) {
            ++this.field7742;
            arg0 >>= 1;
        }
        this.field7746 = 1 << this.field7742;
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "()V")
    public final void method504() {
        OpenGL.glFinish();
        ++field7695;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(III)V")
    public final synchronized void method3137(int arg0, int arg1, int arg2) {
        ++field7649;
        class556 var4 = new class556(arg0);
        var4.field5651 = (long) arg1;
        this.field7760.method131(var4, arg2);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public final void method461(int arg0) {
        this.method3150(false);
        ++field7596;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([BIBIZ)Lmj;")
    public final class562 method3138(byte[] arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        ++field7622;
        int var6 = 59 % ((-22 - arg2) / 62);
        return (class562) (!this.field7793 || arg4 && !this.field7822 ? new class172(this, arg3, arg0, arg1) : new class246(this, arg3, arg0, arg1, arg4));
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lfd;IIII)Lr;")
    public final class159 method491(class451 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7581;
        return new class82(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(IIIIII)V")
    public final void method498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7656;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method3109(1);
        float var10 = (float) arg3 + var8;
        this.method3105(arg5, 2);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7845) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7845) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!te", name = "s", descriptor = "()V")
    public final void method501() {
        this.field7738.method1398(94);
        ++field7704;
    }

    @OriginalMember(owner = "client!te", name = "A", descriptor = "()V")
    public final void method493() throws class416 {
        try {
            this.field7572.swapBuffers();
        } catch (Exception var1) {
        }
        ++field7659;
    }

    @OriginalMember(owner = "client!te", name = "l", descriptor = "()Z")
    public final boolean method423() {
        ++field7725;
        return this.field7736 != null && this.field7736.method2166(122);
    }

    @OriginalMember(owner = "client!te", name = "i", descriptor = "(II)I")
    public final int method3139(int arg0, int arg1) {
        if (arg0 != -30575) {
            this.method453(69, 98, 82, -46);
        }
        ++field7549;
        if (~arg1 != -2) {
            if (arg1 != 0) {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        return 260;
                    } else if (~arg1 == -5) {
                        return 34023;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    return 34165;
                }
            } else {
                return 8448;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lda;B)V")
    public final void method3140(class54 arg0, byte arg1) {
        ++field7642;
        OpenGL.glLoadMatrixf(arg0.method334(14), 0);
        if (arg1 <= 71) {
            this.field7888 = -125;
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(Z)V")
    public final void method3141(boolean arg0) {
        if (!arg0) {
            ++field7579;
            if (this.field7802 != 0) {
                this.field7802 = 0;
                this.field7772 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZB)V")
    public final void method3142(boolean arg0, byte arg1) {
        ++field7550;
        if (arg1 <= 74) {
            this.method420();
        }
        if (this.field7791 == !arg0) {
            this.field7791 = arg0;
            this.method3126((byte) -101);
            this.field7772 &= -32;
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(B)V")
    private final void method3143(byte arg0) {
        ++field7702;
        this.field7875 = new class54();
        this.field7801 = new class54();
        this.field7786 = new class228[this.field7807];
        this.field7796 = new class468(this, 3553, 6408, 1, 1);
        new class468(this, 3553, 6408, 1, 1);
        new class468(this, 3553, 6408, 1, 1);
        this.field7848 = new class82(this);
        this.field7878 = new class82(this);
        this.field7879 = new class82(this);
        this.field7803 = new class82(this);
        if (arg0 > -44) {
            this.method487();
        }
        this.field7860 = new class82(this);
        this.field7820 = new class82(this);
        this.field7794 = new class82(this);
        this.field7811 = new class82(this);
        this.field7787 = new class82(this);
        this.field7834 = new class82(this);
        if (this.field7856) {
            this.field7817 = new class266(this);
            new class266(this);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IBI)V")
    public final synchronized void method3144(int arg0, byte arg1, int arg2) {
        ++field7548;
        if (arg1 == -51) {
            class556 var4 = new class556(arg2);
            var4.field5651 = (long) arg0;
            this.field7761.method131(var4, 0);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLda;)V")
    public final void method3145(byte arg0, class54 arg1) {
        if (arg0 < 97) {
            this.field7867 = -66;
        }
        OpenGL.glPushMatrix();
        ++field7583;
        OpenGL.glMultMatrixf(arg1.method334(14), 0);
    }

    @OriginalMember(owner = "client!te", name = "YA", descriptor = "()I")
    public final int method420() {
        ++field7570;
        int var1 = this.field7886;
        this.field7886 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BIZ)V")
    public final void method3146(byte arg0, int arg1, boolean arg2) {
        this.method3169(true, 39, arg2, arg1);
        if (arg0 < 26) {
            this.method3181((class544) null, -48);
        }
        ++field7534;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(IIIIII)V")
    public final void method481(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3109(1);
        ++field7662;
        this.method3105(arg5, 2);
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var10 = var8 * var9;
        float var11 = var7 * var9;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var11 + 0.35F, (float) arg3 + var10 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lnp;B)V")
    public final void method3147(class419 arg0, byte arg1) {
        if (arg1 < 38) {
            this.method466((int[]) null, -2, -37, 82, -78);
        }
        ++field7620;
        if (~this.field7751 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field7751 <= -1) {
                this.field7754[this.field7751].method1691(6706);
            }
            this.field7750 = this.field7754[++this.field7751] = arg0;
            this.field7750.method1673(-74);
        }
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(Z)V")
    private final void method3148(boolean arg0) {
        if (~this.field7802 != -4) {
            this.field7802 = 3;
            this.method3110(-20);
            this.method3132(1);
            this.field7772 &= -8;
        }
        if (!arg0) {
            this.field7857 = null;
        }
        ++field7723;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([IIIII)Lha;")
    public final class53 method466(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7689;
        return new class125(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(ILnp;)V")
    public final void method3149(int arg0, class419 arg1) {
        if (arg0 != 1) {
            field7600 = -73;
        }
        ++field7539;
        if (this.field7782) {
            this.method3147(arg1, (byte) 85);
            this.method3127(arg1, 115);
        } else if (this.field7749 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field7749 <= -1) {
                this.field7748[this.field7749].method1687(arg0 ^ -6761);
            }
            this.field7750 = this.field7753 = this.field7748[++this.field7749] = arg1;
            this.field7750.method1680(30918);
        }
    }

    @OriginalMember(owner = "client!te", name = "g", descriptor = "(Z)V")
    private final void method3150(boolean arg0) {
        ++field7633;
        if (arg0) {
            this.method502(-20);
        }
        this.field7572.method3215();
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(IIII)V")
    public final void method3151(int arg0, int arg1, int arg2, int arg3) {
        ++field7684;
        int var5 = -124 / ((arg2 - -23) / 42);
        OpenGL.glDrawArrays(arg0, arg1, arg3);
    }

    @OriginalMember(owner = "client!te", name = "h", descriptor = "(I)V")
    public final void method502(int arg0) {
        ++field7541;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjl;)V")
    public final void method3152(int arg0, class228 arg1) {
        ++field7668;
        class228 var3 = this.field7786[this.field7881];
        if (arg1 != var3) {
            if (arg1 == null) {
                OpenGL.glDisable(var3.field3333);
            } else {
                if (var3 == null) {
                    OpenGL.glEnable(arg1.field3333);
                } else if (~arg1.field3333 != ~var3.field3333) {
                    OpenGL.glDisable(var3.field3333);
                    OpenGL.glEnable(arg1.field3333);
                }
                OpenGL.glBindTexture(arg1.field3333, arg1.method1470((byte) 25));
            }
            this.field7786[this.field7881] = arg1;
        }
        this.field7772 &= arg0;
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(B)V")
    private final void method3153(byte arg0) {
        class588.field8725[3] = 1.0F;
        class588.field8725[1] = this.field7828 * this.field7778;
        ++field7719;
        class588.field8725[0] = this.field7840 * this.field7778;
        class588.field8725[2] = this.field7865 * this.field7778;
        if (arg0 != 64) {
            this.method440();
        }
        OpenGL.glLightModelfv(2899, class588.field8725, 0);
    }

    @OriginalMember(owner = "client!te", name = "m", descriptor = "(IFFFFF)V")
    public final void method520(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field7560;
        boolean var7 = ~this.field7873 != ~arg0;
        if (var7 || this.field7849 != arg1 || this.field7882 != arg2) {
            this.field7849 = arg1;
            this.field7882 = arg2;
            this.field7873 = arg0;
            if (var7) {
                this.field7840 = (float) (this.field7873 & 16711680) / 1.671168E7F;
                this.field7828 = (float) (65280 & this.field7873) / 65280.0F;
                this.field7865 = (float) (this.field7873 & 255) / 255.0F;
                this.method3153((byte) 64);
            }
            this.method3131(-63);
        }
        if (this.field7833[0] != arg3 || this.field7833[1] != arg4 || this.field7833[2] != arg5) {
            this.field7833[2] = arg5;
            this.field7833[0] = arg3;
            this.field7833[1] = arg4;
            this.field7790[2] = -arg5;
            this.field7790[1] = -arg4;
            this.field7790[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field7800[2] = arg5 * var8;
            this.field7800[1] = arg4 * var8;
            this.field7800[0] = arg3 * var8;
            this.field7792[0] = -this.field7800[0];
            this.field7792[2] = -this.field7800[2];
            this.field7792[1] = -this.field7800[1];
            this.method3182((byte) 72);
            this.field7867 = (int) (arg5 * 256.0F / arg4);
            this.field7871 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!te", name = "B", descriptor = "(IIIIII)Z")
    public final boolean method496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7628;
        float var7 = (float) arg2 * this.field7875.field642 + (float) arg0 * this.field7875.field619 + (float) arg1 * this.field7875.field643 + this.field7875.field616;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field7875.field642 + (float) arg3 * this.field7875.field619 + (float) arg4 * this.field7875.field643 + this.field7875.field616;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field7829) || !(var8 < (float) this.field7829)) && (!(var7 > (float) this.field7766) || !((float) this.field7766 < var8))) {
            int var9 = (int) (((float) arg2 * this.field7875.field622 + (float) arg0 * this.field7875.field645 + (float) arg1 * this.field7875.field623 + this.field7875.field629) * (float) this.field7804 / var7);
            int var10 = (int) (((float) arg5 * this.field7875.field622 + (float) arg3 * this.field7875.field645 + (float) arg4 * this.field7875.field623 + this.field7875.field629) * (float) this.field7804 / var8);
            if ((float) var9 < this.field7880 && (float) var10 < this.field7880 || this.field7769 < (float) var9 && (float) var10 > this.field7769) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field7875.field627 + (float) arg0 * this.field7875.field634 + (float) arg1 * this.field7875.field624 + this.field7875.field612) * (float) this.field7864 / var7);
                int var12 = (int) (((float) arg5 * this.field7875.field627 + (float) arg3 * this.field7875.field634 + (float) arg4 * this.field7875.field624 + this.field7875.field612) * (float) this.field7864 / var8);
                return (!((float) var11 < this.field7831) || !((float) var12 < this.field7831)) && (!((float) var11 > this.field7773) || !((float) var12 > this.field7773));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "()V")
    public final void method473() {
        ++field7576;
        for (class417 var1 = this.field7745.method124((byte) 42); var1 != null; var1 = this.field7745.method120(-121)) {
            ((class218) var1).method1419(0);
        }
        if (this.field7738 != null) {
            this.field7738.method1397((byte) 100);
        }
        if (this.field7572 != null) {
            this.method3150(false);
            Enumeration var2 = this.field7660.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field7660.get(var3);
                this.field7572.releaseSurface(var3, var4);
            }
            this.field7572.release();
            this.field7572 = null;
        }
        if (this.field7741) {
            class437.method2550(true, false, 19357);
            this.field7741 = false;
        }
    }

    @OriginalMember(owner = "client!te", name = "r", descriptor = "()Z")
    public final boolean method527() {
        ++field7629;
        return true;
    }

    @OriginalMember(owner = "client!te", name = "t", descriptor = "()Z")
    public final boolean method497() {
        ++field7722;
        return true;
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
    public final synchronized void method484(int arg0) {
        ++field7545;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field7760.method119(true)) {
            class556 var12 = (class556) this.field7760.method128(936);
            class463.field6517[var2++] = (int) var12.field5651;
            this.field7759 -= var12.field8278;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class463.field6517, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteBuffersARB(var2, class463.field6517, 0);
            var2 = 0;
        }
        while (!this.field7761.method119(true)) {
            class556 var11 = (class556) this.field7761.method128(936);
            class463.field6517[var2++] = (int) var11.field5651;
            this.field7758 -= var11.field8278;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class463.field6517, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class463.field6517, 0);
            var2 = 0;
        }
        while (!this.field7762.method119(true)) {
            class556 var10 = (class556) this.field7762.method128(936);
            class463.field6517[var2++] = var10.field8278;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class463.field6517, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class463.field6517, 0);
            var2 = 0;
        }
        while (!this.field7763.method119(true)) {
            class556 var9 = (class556) this.field7763.method128(936);
            class463.field6517[var2++] = (int) var9.field5651;
            this.field7757 -= var9.field8278;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class463.field6517, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class463.field6517, 0);
            boolean var4 = false;
        }
        while (!this.field7756.method119(true)) {
            class556 var8 = (class556) this.field7756.method128(936);
            OpenGL.glDeleteLists((int) var8.field5651, var8.field8278);
        }
        while (!this.field7764.method119(true)) {
            class417 var7 = this.field7764.method128(936);
            OpenGL.glDeleteProgramARB((int) var7.field5651);
        }
        while (!this.field7765.method119(true)) {
            class417 var6 = this.field7765.method128(936);
            OpenGL.glDeleteObjectARB(var6.field5651);
        }
        while (!this.field7756.method119(true)) {
            class556 var5 = (class556) this.field7756.method128(936);
            OpenGL.glDeleteLists((int) var5.field5651, var5.field8278);
        }
        this.field7728.method1211(1975);
        if (this.method454() > 100663296 && class598.method3538(true) > this.field7852 + 60000L) {
            System.gc();
            this.field7852 = class598.method3538(true);
        }
        this.field7747 = var3;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field7652;
        this.method3109(1);
        this.method3105(arg9, 2);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!te", name = "g", descriptor = "(I)Lu;")
    public final class65 method455(int arg0) {
        ++field7683;
        class218 var2 = new class218(arg0);
        this.field7745.method131(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lmj;I)V")
    public final void method3154(class562 arg0, int arg1) {
        if (arg1 == 34963) {
            if (this.field7770 != arg0) {
                if (this.field7793) {
                    OpenGL.glBindBufferARB(34963, arg0.method1219((byte) -124));
                }
                this.field7770 = arg0;
            }
            ++field7611;
        }
    }

    @OriginalMember(owner = "client!te", name = "h", descriptor = "(Z)V")
    private final void method3155(boolean arg0) {
        this.method3123(-2, false);
        ++field7708;
        for (int var2 = this.field7807 + -1; ~var2 <= -1; --var2) {
            this.method3111(33984, var2);
            this.method3152(-2, (class228) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method3183(8448, -127, 8448);
        this.method3157(34168, 2, true, 770);
        this.method3128(-1);
        this.field7843 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field7799 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field7868 = true;
        OpenGL.glColorMask(arg0, true, true, true);
        this.field7844 = true;
        this.method3106(true, -128);
        this.method3184(true, true);
        this.method3156(true, true);
        this.method3142(true, (byte) 82);
        this.method3141(!arg0);
        this.field7572.setSwapInterval(0);
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
        this.field7873 = this.field7858 = -1;
        this.method479();
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZZ)V")
    public final void method3156(boolean arg0, boolean arg1) {
        if (!arg1) {
            this.field7782 = false;
        }
        if (!this.field7775 == arg0) {
            if (!arg0) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field7775 = arg0;
            this.field7772 &= -32;
        }
        ++field7669;
    }

    @OriginalMember(owner = "client!te", name = "ba", descriptor = "()I")
    public final int method525() {
        ++field7686;
        int var1 = this.field7888;
        this.field7888 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIZI)V")
    public final void method3157(int arg0, int arg1, boolean arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
        ++field7564;
        if (arg2) {
            OpenGL.glTexEnvi(8960, arg1 + 34192, arg3);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Llg;[Lqm;Z)Lra;")
    public final class92 method492(class352 arg0, class126[] arg1, boolean arg2) {
        ++field7615;
        return new class362(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!te", name = "v", descriptor = "()V")
    public final void method465() {
        this.method3142(true, (byte) 106);
        ++field7617;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method477(Canvas arg0) {
        ++field7676;
        if (this.field7700 == arg0) {
            throw new RuntimeException();
        } else if (this.field7660.containsKey(arg0)) {
            Long var2 = (Long) this.field7660.get(arg0);
            this.field7572.releaseSurface(arg0, var2);
            this.field7660.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(IIII)V")
    public final void method516(int arg0, int arg1, int arg2, int arg3) {
        this.field7804 = arg2;
        ++field7643;
        this.field7864 = arg3;
        this.field7876 = arg0;
        this.field7861 = arg1;
        this.method3168(103);
        this.method3179((byte) -16);
        if (this.field7802 != 3) {
            if (this.field7802 == 2) {
                this.method3119(-31190);
                return;
            }
        } else {
            this.method3110(-112);
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(ILnp;)V")
    public final void method3158(int arg0, class419 arg1) {
        ++field7655;
        if (arg0 != 255) {
            this.method3137(-126, 110, -105);
        }
        if (!this.field7782) {
            if (this.field7749 >= 0 && this.field7748[this.field7749] == arg1) {
                this.field7748[this.field7749--] = null;
                arg1.method1687(-6762);
                if (~this.field7749 <= -1) {
                    this.field7750 = this.field7753 = this.field7748[this.field7749];
                    this.field7750.method1680(30918);
                } else {
                    this.field7750 = this.field7753 = null;
                }
            } else {
                throw new RuntimeException();
            }
        } else {
            this.method3124(arg0 + -144, arg1);
            this.method3116((byte) 83, arg1);
        }
    }

    @OriginalMember(owner = "client!te", name = "g", descriptor = "(B)V")
    public final void method3159(byte arg0) {
        if (this.field7772 != 2) {
            this.method3178(-25);
            this.method3106(false, -105);
            this.method3184(true, false);
            this.method3156(false, true);
            this.method3142(false, (byte) 112);
            this.method3123(-2, false);
            this.field7772 = 2;
        }
        if (arg0 < 88) {
            this.field7869 = 80;
        }
        ++field7540;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(FFFFB)V")
    public final void method3160(float arg0, float arg1, float arg2, float arg3, byte arg4) {
        if (arg4 != 26) {
            this.field7783 = -0.52047914F;
        }
        class588.field8725[2] = arg0;
        class588.field8725[3] = arg2;
        class588.field8725[1] = arg3;
        class588.field8725[0] = arg1;
        ++field7693;
        OpenGL.glTexEnvfv(8960, 8705, class588.field8725, 0);
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "()Z")
    public final boolean method430() {
        ++field7711;
        return true;
    }

    @OriginalMember(owner = "client!te", name = "IA", descriptor = "(III[I)V")
    public final void method475(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7715;
        float var5 = (float) arg2 * this.field7875.field642 + (float) arg0 * this.field7875.field619 + (float) arg1 * this.field7875.field643 + this.field7875.field616;
        if (!((float) this.field7829 > var5) && !((float) this.field7766 < var5)) {
            int var6 = (int) (((float) arg2 * this.field7875.field622 + (float) arg0 * this.field7875.field645 + (float) arg1 * this.field7875.field623 + this.field7875.field629) * (float) this.field7804 / var5);
            int var7 = (int) (((float) arg2 * this.field7875.field627 + (float) arg0 * this.field7875.field634 + (float) arg1 * this.field7875.field624 + this.field7875.field612) * (float) this.field7864 / var5);
            if (this.field7880 <= (float) var6 && this.field7769 >= (float) var6 && this.field7831 <= (float) var7 && (float) var7 <= this.field7773) {
                arg3[1] = (int) ((float) var7 + -this.field7831);
                arg3[0] = (int) ((float) var6 - this.field7880);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!te", name = "j", descriptor = "(II)I")
    public final int method3161(int arg0, int arg1) {
        ++field7567;
        if (~arg0 != -6407 && arg0 != 6409) {
            if (~arg0 != -6411 && arg0 != 34846 && ~arg0 != -34845) {
                if (arg0 == 6407) {
                    return 3;
                } else if (arg0 != 6408 && ~arg0 != -34848) {
                    if (~arg0 != -34844) {
                        if (~arg0 != -34843) {
                            if (arg0 != 6402) {
                                if (~arg0 == -6402) {
                                    return 1;
                                } else {
                                    if (arg1 != 0) {
                                        this.method440();
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
                        return 6;
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

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lr;Lrd;Lm;Lpr;I)V")
    public final void method511(class159 arg0, class283 arg1, class165 arg2, class381 arg3, int arg4) {
        arg0.method93(arg2, arg3, arg4);
        ++field7610;
        this.method488(arg1);
    }

    @OriginalMember(owner = "client!te", name = "D", descriptor = "()Lm;")
    public final class165 method522() {
        ++field7632;
        return new class54();
    }

    @OriginalMember(owner = "client!te", name = "n", descriptor = "()V")
    public final void method479() {
        ++field7696;
        this.field7847 = 0;
        this.field7826 = this.field7612;
        this.field7789 = this.field7563;
        this.field7883 = 0;
        OpenGL.glDisable(3089);
        this.method3179((byte) -16);
    }

    @OriginalMember(owner = "client!te", name = "w", descriptor = "(I)V")
    private final void method3162(int arg0) {
        ++field7623;
        if (this.field7810 == 0.0F) {
            this.field7815[10] = this.field7859;
            this.field7815[14] = this.field7780;
        } else {
            float var2 = this.field7819 / (this.field7819 + this.field7810);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field7780 * (-var2 + 1.0F) / this.field7810;
            this.field7815[14] = this.field7780 * var3;
            this.field7815[10] = this.field7859 + var4;
        }
        this.field7781 = (float) this.field7766 + -this.field7810;
        this.field7767 = (this.field7815[14] - (float) this.field7766) / this.field7815[arg0];
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIZ)Lha;")
    public final class53 method442(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field7552;
        return new class125(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(FFF)V")
    public final void method470(float arg0, float arg1, float arg2) {
        class343.field4737 = arg1;
        class180.field2734 = arg2;
        ++field7677;
        class39.field471 = arg0;
    }

    @OriginalMember(owner = "client!te", name = "za", descriptor = "(IIIIII[BII)V")
    public final void method517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field7630;
        float var10;
        float var11;
        if (this.field7827 != null && this.field7827.field6587 >= arg2 && this.field7827.field6589 >= arg3) {
            this.field7827.method2821(arg3, arg2, 10242, 0, 0, false, 0, 0, arg6, 6406);
            var10 = (float) arg2 * this.field7827.field5100 / (float) this.field7827.field6587;
            var11 = (float) arg3 * this.field7827.field5101 / (float) this.field7827.field6589;
        } else {
            this.field7827 = class153.method1114(this, arg2, false, arg6, 6406, false, arg3, 6406);
            this.field7827.method2824((byte) -111, false, false);
            var11 = this.field7827.field5101;
            var10 = this.field7827.field5100;
        }
        this.method3159((byte) 96);
        this.method3152(-2, this.field7827);
        this.method3105(arg8, 2);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method3115(true, arg5);
        this.method3183(34165, -127, 34165);
        this.method3157(34166, 0, true, 768);
        this.method3157(5890, 2, true, 770);
        this.method3107(34166, (byte) -91, 770, 0);
        this.method3107(5890, (byte) -11, 770, 2);
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
        this.method3157(5890, 0, true, 768);
        this.method3157(34166, 2, true, 770);
        this.method3107(5890, (byte) -61, 770, 0);
        this.method3107(34166, (byte) -35, 770, 2);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIILpa;II)V")
    public final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class311 arg6, int arg7, int arg8) {
        ++field7557;
        class97 var10 = (class97) arg6;
        class371 var11 = var10.field1412;
        this.method3159((byte) 106);
        this.method3152(-2, var10.field1412);
        this.method3105(arg5, 2);
        this.method3183(7681, -124, 8448);
        this.method3157(34167, 0, true, 768);
        float var12 = var11.field5100 / (float) var11.field5095;
        float var13 = var11.field5101 / (float) var11.field5099;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var15 * var16;
        float var18 = var14 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var18 + 0.35F, (float) arg3 + var17 + 0.35F);
        OpenGL.glEnd();
        this.method3157(5890, 0, true, 768);
    }

    @OriginalMember(owner = "client!te", name = "x", descriptor = "(I)V")
    public final void method3163(int arg0) {
        if (this.field7772 != 16) {
            this.method3148(true);
            this.method3106(true, -101);
            this.method3156(true, true);
            this.method3142(true, (byte) 78);
            this.method3105(1, 2);
            this.field7772 = 16;
        }
        if (arg0 > -12) {
            this.field7828 = -1.6400815F;
        }
        ++field7588;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lmaa;BLmaa;Lmaa;Lmaa;)V")
    public final void method3164(class403 arg0, byte arg1, class403 arg2, class403 arg3, class403 arg4) {
        if (arg2 != null) {
            this.method3181(arg2.field5515, 34962);
            OpenGL.glVertexPointer(arg2.field5507, arg2.field5508, this.field7816.method3315((byte) -78), this.field7816.method3314((byte) -38) + (long) arg2.field5511);
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        ++field7609;
        if (arg1 < -35) {
            if (arg3 != null) {
                this.method3181(arg3.field5515, 34962);
                OpenGL.glNormalPointer(arg3.field5508, this.field7816.method3315((byte) -112), this.field7816.method3314((byte) -38) + (long) arg3.field5511);
                OpenGL.glEnableClientState(32885);
            } else {
                OpenGL.glDisableClientState(32885);
            }
            if (arg4 != null) {
                this.method3181(arg4.field5515, 34962);
                OpenGL.glColorPointer(arg4.field5507, arg4.field5508, this.field7816.method3315((byte) -103), this.field7816.method3314((byte) -38) - -((long) arg4.field5511));
                OpenGL.glEnableClientState(32886);
            } else {
                OpenGL.glDisableClientState(32886);
            }
            if (arg0 != null) {
                this.method3181(arg0.field5515, 34962);
                OpenGL.glTexCoordPointer(arg0.field5507, arg0.field5508, this.field7816.method3315((byte) -91), this.field7816.method3314((byte) -38) - -((long) arg0.field5511));
                OpenGL.glEnableClientState(32888);
            } else {
                OpenGL.glDisableClientState(32888);
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "k", descriptor = "(II)I")
    public final int method3165(int arg0, int arg1) {
        ++field7602;
        if (arg0 != 5121 && ~arg0 != -5121) {
            if (~arg0 != -5124 && ~arg0 != -5123) {
                int var3 = 126 % ((11 - arg1) / 60);
                if (arg0 != 5125 && arg0 != 5124 && arg0 != 5126) {
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

    @OriginalMember(owner = "client!te", name = "j", descriptor = "()Z")
    public final boolean method487() {
        ++field7731;
        if (this.field7736 != null) {
            if (!this.field7736.method2166(119)) {
                if (!this.field7738.method1400(this.field7736, (byte) -52)) {
                    return false;
                }
                this.field7728.method1206(64);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "()I")
    public final int method524() {
        ++field7682;
        return this.field7829;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method444(Canvas arg0) {
        this.field7580 = null;
        this.field7597 = 0L;
        ++field7614;
        if (arg0 != null && this.field7700 != arg0) {
            if (this.field7660.containsKey(arg0)) {
                Long var2 = (Long) this.field7660.get(arg0);
                this.field7597 = var2;
                this.field7580 = arg0;
            }
        } else {
            this.field7597 = this.field7569;
            this.field7580 = this.field7700;
        }
        if (this.field7580 != null && ~this.field7597 != -1L) {
            this.field7572.setSurface(this.field7597);
            this.method3122(1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!te", name = "JA", descriptor = "(IIII)V")
    public final void method453(int arg0, int arg1, int arg2, int arg3) {
        ++field7675;
        if (!this.field7818) {
            throw new RuntimeException("");
        } else {
            this.field7837 = arg3;
            this.field7854 = arg1;
            this.field7863 = arg0;
            this.field7830 = arg2;
            this.field7733.field9163.method152(0);
            this.method3108(-124);
        }
    }

    @OriginalMember(owner = "client!te", name = "G", descriptor = "(ILpa;II)V")
    public final void method462(int arg0, class311 arg1, int arg2, int arg3) {
        ++field7595;
        class97 var5 = (class97) arg1;
        class371 var6 = var5.field1412;
        this.method3159((byte) 96);
        this.method3152(-2, var5.field1412);
        this.method3105(1, 2);
        this.method3183(7681, -128, 8448);
        this.method3157(34167, 0, true, 768);
        float var7 = var6.field5100 / (float) var6.field5095;
        float var8 = var6.field5101 / (float) var6.field5099;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7847) * var7, (float) (this.field7883 - arg3) * var8);
        OpenGL.glVertex2i(this.field7847, this.field7883);
        OpenGL.glTexCoord2f((float) (this.field7847 - arg2) * var7, (float) (this.field7789 - arg3) * var8);
        OpenGL.glVertex2i(this.field7847, this.field7789);
        OpenGL.glTexCoord2f((float) (this.field7826 - arg2) * var7, (float) (-arg3 + this.field7789) * var8);
        OpenGL.glVertex2i(this.field7826, this.field7789);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7826) * var7, (float) (-arg3 + this.field7883) * var8);
        OpenGL.glVertex2i(this.field7826, this.field7883);
        OpenGL.glEnd();
        this.method3157(5890, 0, true, 768);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)I")
    public final int method528(int arg0, int arg1) {
        ++field7709;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!te", name = "F", descriptor = "(IIII)V")
    public final void method512(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field7826 < ~arg2) {
            this.field7826 = arg2;
        }
        if (~this.field7789 < ~arg3) {
            this.field7789 = arg3;
        }
        if (~this.field7847 > ~arg0) {
            this.field7847 = arg0;
        }
        if (~arg1 < ~this.field7883) {
            this.field7883 = arg1;
        }
        ++field7555;
        OpenGL.glEnable(3089);
        this.method3179((byte) -16);
        this.method3117((byte) -38);
    }

    @OriginalMember(owner = "client!te", name = "y", descriptor = "(I)V")
    public final void method3166(int arg0) {
        OpenGL.glPopMatrix();
        ++field7670;
        if (arg0 != -18072) {
            this.field7754 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IJ)V")
    public final synchronized void method3167(int arg0, long arg1) {
        ++field7585;
        class417 var4 = new class417();
        int var5 = -84 / ((41 - arg0) / 43);
        var4.field5651 = arg1;
        this.field7765.method131(var4, 0);
    }

    @OriginalMember(owner = "client!te", name = "z", descriptor = "(I)V")
    private final void method3168(int arg0) {
        if (arg0 <= 98) {
            this.method3185((byte) -33);
        }
        ++field7641;
        float[] var2 = this.field7815;
        float var3 = (float) (-this.field7876 * this.field7829) / (float) this.field7804;
        float var4 = (float) ((-this.field7876 + this.field7612) * this.field7829) / (float) this.field7804;
        float var5 = (float) (this.field7861 * this.field7829) / (float) this.field7864;
        float var6 = (float) ((-this.field7563 + this.field7861) * this.field7829) / (float) this.field7864;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field7829 * 2.0F;
            var2[6] = 0.0F;
            var2[3] = 0.0F;
            var2[2] = 0.0F;
            var2[15] = 0.0F;
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[4] = 0.0F;
            var2[10] = this.field7859 = (float) (-(this.field7766 - -this.field7829)) / (float) (-this.field7829 + this.field7766);
            var2[1] = 0.0F;
            var2[5] = var7 / (-var6 + var5);
            var2[0] = var7 / (var4 - var3);
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[11] = -1.0F;
            var2[12] = 0.0F;
            var2[13] = 0.0F;
            var2[14] = this.field7780 = -((float) this.field7766 * var7) / (float) (-this.field7829 + this.field7766);
            var2[7] = 0.0F;
        } else {
            var2[12] = 0.0F;
            var2[4] = 0.0F;
            var2[3] = 0.0F;
            var2[15] = 1.0F;
            var2[5] = 1.0F;
            var2[8] = 0.0F;
            var2[6] = 0.0F;
            var2[9] = 0.0F;
            var2[11] = 0.0F;
            var2[2] = 0.0F;
            var2[0] = 1.0F;
            var2[7] = 0.0F;
            var2[14] = 0.0F;
            var2[1] = 0.0F;
            var2[13] = 0.0F;
            var2[10] = 1.0F;
        }
        this.method3162(10);
    }

    @OriginalMember(owner = "client!te", name = "M", descriptor = "(F)V")
    public final void method500(float arg0) {
        ++field7562;
        if (this.field7778 != arg0) {
            this.field7778 = arg0;
            this.method3153((byte) 64);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZIZI)V")
    public final void method3169(boolean arg0, int arg1, boolean arg2, int arg3) {
        if (this.field7846 != arg3) {
            if (arg3 < 0) {
                this.method3128(-1);
                this.method3152(-2, (class228) null);
                this.method3121(-27745, 0);
                if (!this.field7818) {
                    this.field7733.method3637(0, 0, (byte) 32, arg0, arg2, 0);
                }
            } else {
                class468 var5 = this.field7728.method1209(arg3, 115);
                class471 var6 = super.field3092.method110(arg3, (byte) 116);
                if (var6.field6656 == 0 && var6.field6661 == 0) {
                    this.method3128(-1);
                } else {
                    int var7 = !var6.field6651 ? 128 : 64;
                    int var8 = var7 * 50;
                    this.method3173((byte) 22, 0.0F, (float) (this.field7747 % var8 * var6.field6661) / (float) var8, (float) (this.field7747 % var8 * var6.field6656) / (float) var8);
                }
                if (!this.field7818) {
                    this.field7733.method3637(var6.field6649, var6.field6646, (byte) 32, arg0, arg2, var6.field6650);
                    if (!this.field7733.method3634(var5, (byte) 120, var6.field6643)) {
                        this.method3152(-2, var5);
                        this.method3121(-27745, var6.field6643);
                    }
                } else {
                    this.method3152(-2, var5);
                    this.method3121(-27745, var6.field6643);
                }
            }
            this.field7846 = arg3;
        }
        if (arg1 > 12) {
            ++field7601;
            this.field7772 &= -8;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIF)Lnm;")
    public final class405 method469(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field7718;
        return new class431(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;I)V")
    public class527(Canvas arg0, class17 arg1, int arg2) {
        super(arg1);
        new class589();
        new class465(16);
        this.field7756 = new class19();
        this.field7760 = new class19();
        this.field7761 = new class19();
        this.field7762 = new class19();
        this.field7763 = new class19();
        this.field7764 = new class19();
        this.field7765 = new class19();
        this.field7767 = 3584.0F;
        this.field7777 = 0;
        this.field7784 = -1;
        this.field7812 = 0;
        this.field7771 = 0;
        this.field7781 = 3584.0F;
        this.field7792 = new float[4];
        this.field7829 = 50;
        this.field7821 = 1.0F;
        this.field7826 = 0;
        this.field7815 = new float[16];
        this.field7839 = -1.0F;
        this.field7837 = 0;
        this.field7783 = 1.0F;
        this.field7819 = 3000.0F;
        this.field7838 = -1.0F;
        this.field7830 = -1;
        this.field7828 = 1.0F;
        this.field7833 = new float[4];
        this.field7840 = 1.0F;
        this.field7797 = 8448;
        this.field7776 = 0.0F;
        this.field7804 = 512;
        this.field7858 = -1;
        this.field7861 = 0;
        this.field7847 = 0;
        this.field7800 = new float[4];
        this.field7849 = -1.0F;
        this.field7851 = 8448;
        this.field7866 = true;
        this.field7790 = new float[4];
        this.field7864 = 512;
        this.field7865 = 1.0F;
        this.field7873 = -1;
        this.field7854 = -1;
        this.field7766 = 3584;
        this.field7876 = 0;
        this.field7789 = 0;
        this.field7882 = -1.0F;
        this.field7883 = 0;
        this.field7884 = new class405[class133.field1821];
        this.field7836 = new class247(8192);
        this.field7887 = new int[1];
        this.field7890 = new int[1];
        this.field7889 = new int[1];
        this.field7891 = new byte[16384];
        this.field7580 = this.field7700 = arg0;
        this.field7735 = arg2;
        if (!class230.method1488(111, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class230.method1488(61, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field7572 = new OpenGL();
                this.field7597 = this.field7569 = this.field7572.init(arg0, 8, 8, 8, 24, 0, this.field7735);
                if (~this.field7569 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method3104(-29526);
                    int var4 = this.method3120(-1700);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field7869 = this.field7842 ? 33639 : 5121;
                        if (this.field7850.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class587.method3490(' ', 122, this.field7850.replace('/', ' '));
                            for (int var9 = 0; var9 < var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (var10.charAt(0) == 'x' && ~var10.length() <= -4 && class631.method3673(var10.substring(1, 3), 10)) {
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
                                            if (~var10.length() <= -5 && class631.method3673(var10.substring(0, 4), 10)) {
                                                var5 = class197.method1327(var10.substring(0, 4), -85);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var16) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && ~var5 >= -8000) {
                                    this.field7793 = false;
                                }
                                if (~var5 <= -7001 && ~var5 >= -9251) {
                                    this.field7824 = false;
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field7885 = false;
                            }
                            this.field7814 &= this.field7572.method3217("GL_ARB_half_float_pixel");
                            this.field7877 = true;
                            this.field7822 = this.field7793;
                        }
                        if (this.field7788.indexOf("intel") != -1) {
                            this.field7856 = false;
                        }
                        this.field7872 = !this.field7788.equals("s3 graphics");
                        if (this.field7793) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var14) {
                                throw new RuntimeException("");
                            }
                        }
                        class582.method3473(false, true, -3);
                        this.field7741 = true;
                        this.field7728 = new class170(this, super.field3092);
                        this.method3143((byte) -91);
                        this.field7743 = new class242(this);
                        this.field7738 = new class213(this);
                        if (this.field7738.method1406((byte) 43)) {
                            this.field7736 = new class512(this);
                            if (!this.field7736.method3042((byte) 127)) {
                                this.field7736.method2165((byte) 2);
                                this.field7736 = null;
                            }
                        }
                        this.field7733 = new class622(this);
                        this.method3155(true);
                        this.method3122(1);
                        OpenGL.glClear(16640);
                        int var12 = 0;
                        while (true) {
                            try {
                                this.field7572.swapBuffers();
                                break;
                            } catch (Exception var15) {
                                if (~(var12++) < -6) {
                                    throw new RuntimeException("");
                                }
                                class236.method1513(true, 100L);
                            }
                        }
                        OpenGL.glClear(16384);
                    }
                }
            } catch (Throwable var17) {
                var17.printStackTrace();
                this.method473();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lu;)V")
    public final void method448(class65 arg0) {
        ++field7621;
        this.field7744 = ((class218) arg0).field3185;
        if (this.field7857 == null) {
            class247 var2 = new class247(80);
            if (this.field7842) {
                var2.method1564(0, -1.0F);
                var2.method1564(0, -1.0F);
                var2.method1564(0, 0.0F);
                var2.method1564(0, 0.0F);
                var2.method1564(0, 1.0F);
                var2.method1564(0, 1.0F);
                var2.method1564(0, -1.0F);
                var2.method1564(0, 0.0F);
                var2.method1564(0, 1.0F);
                var2.method1564(0, 1.0F);
                var2.method1564(0, 1.0F);
                var2.method1564(0, 1.0F);
                var2.method1564(0, 0.0F);
                var2.method1564(0, 1.0F);
                var2.method1564(0, 0.0F);
                var2.method1564(0, -1.0F);
                var2.method1564(0, 1.0F);
                var2.method1564(0, 0.0F);
                var2.method1564(0, 0.0F);
                var2.method1564(0, 0.0F);
            } else {
                var2.method1563(true, -1.0F);
                var2.method1563(true, -1.0F);
                var2.method1563(true, 0.0F);
                var2.method1563(true, 0.0F);
                var2.method1563(true, 1.0F);
                var2.method1563(true, 1.0F);
                var2.method1563(true, -1.0F);
                var2.method1563(true, 0.0F);
                var2.method1563(true, 1.0F);
                var2.method1563(true, 1.0F);
                var2.method1563(true, 1.0F);
                var2.method1563(true, 1.0F);
                var2.method1563(true, 0.0F);
                var2.method1563(true, 1.0F);
                var2.method1563(true, 0.0F);
                var2.method1563(true, -1.0F);
                var2.method1563(true, 1.0F);
                var2.method1563(true, 0.0F);
                var2.method1563(true, 0.0F);
                var2.method1563(true, 0.0F);
            }
            this.field7857 = this.method3180(var2.field2146, false, (byte) 126, var2.field2177, 20);
            this.field7774 = new class403(this.field7857, 5126, 3, 0);
            this.field7805 = new class403(this.field7857, 5126, 2, 12);
            this.field7734.method3332(this, (byte) -87);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIILmj;)V")
    public final void method3170(int arg0, int arg1, int arg2, int arg3, class562 arg4) {
        if (arg1 > 19) {
            ++field7624;
            int var6 = arg4.method1218(-108);
            int var7 = arg0 * this.method3165(var6, -77);
            this.method3154(arg4, 34963);
            OpenGL.glDrawElements(arg2, arg3, var6, arg4.method1217((byte) 125) - -((long) var7));
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method503(Canvas arg0) {
        ++field7547;
        long var2 = 0L;
        if (arg0 != null && this.field7700 != arg0) {
            if (this.field7660.containsKey(arg0)) {
                Long var4 = (Long) this.field7660.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field7569;
        }
        if (var2 == 0L) {
            throw new RuntimeException();
        } else {
            this.field7572.surfaceResized(var2);
            if (this.field7580 == arg0) {
                this.method3122(1);
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "v", descriptor = "(IIII)[I")
    public final int[] method456(int arg0, int arg1, int arg2, int arg3) {
        ++field7639;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + this.field7563 + -arg1, arg2, 1, 32993, this.field7869, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([Lr;Lm;[Lpr;I)V")
    public final void method507(class159[] arg0, class165 arg1, class381[] arg2, int arg3) {
        for (int var5 = 0; ~arg0.length < ~var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method93(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
        ++field7556;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(FZF)V")
    public final void method3171(float arg0, boolean arg1, float arg2) {
        this.field7821 = arg0;
        if (!arg1) {
            this.method478(-3, -44);
        }
        ++field7727;
        this.field7776 = arg2;
        if (!this.field7818) {
            this.method3108(-120);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZIZLjaclib/memory/Buffer;)Lsp;")
    public final class544 method3172(int arg0, boolean arg1, int arg2, boolean arg3, Buffer arg4) {
        ++field7666;
        if (!this.field7793 || arg1 && !this.field7822) {
            if (arg3) {
                this.field7840 = 0.35817143F;
            }
            return new class630(this, arg2, arg4);
        } else {
            return new class545(this, arg2, arg4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lm;)V")
    public final void method483(class165 arg0) {
        this.field7875 = (class54) arg0;
        ++field7648;
        this.field7801.method340(this.field7875, 13359);
        if (~this.field7802 != -2) {
            this.method3132(1);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BFFF)V")
    private final void method3173(byte arg0, float arg1, float arg2, float arg3) {
        OpenGL.glMatrixMode(5890);
        ++field7672;
        if (this.field7768) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg3, arg2, arg1);
        OpenGL.glMatrixMode(5888);
        this.field7768 = true;
        if (arg0 != 22) {
            this.field7561 = 86;
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "()Z")
    public final boolean method508() {
        ++field7603;
        return this.field7845 && (!this.method423() || this.field7832);
    }

    @OriginalMember(owner = "client!te", name = "A", descriptor = "(I)V")
    private final void method3174(int arg0) {
        if (~this.field7802 != -3) {
            this.field7802 = 2;
            this.method3119(-31190);
            this.method3132(1);
            this.field7772 &= -8;
        }
        if (arg0 != 1) {
            this.field7876 = -40;
        }
        ++field7701;
    }

    @OriginalMember(owner = "client!te", name = "h", descriptor = "(B)V")
    public final void method3175(byte arg0) {
        ++field7577;
        if (arg0 >= 55) {
            OpenGL.glPushMatrix();
        }
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(IIIIII)Lqba;")
    public final class345 method424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7606;
        return !this.field7853 ? null : new class588(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!te", name = "B", descriptor = "(I)V")
    private final void method3176(int arg0) {
        if (arg0 == -11310) {
            if (this.field7835 && !this.field7823) {
                OpenGL.glEnable(2896);
            } else {
                OpenGL.glDisable(2896);
            }
            ++field7543;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lqm;Z)Lha;")
    public final class53 method474(class126 arg0, boolean arg1) {
        ++field7634;
        int[] var3 = new int[arg0.field1771 * arg0.field1767];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1769 != null) {
            for (int var6 = 0; ~arg0.field1771 < ~var6; ++var6) {
                for (int var7 = 0; ~arg0.field1767 < ~var7; ++var7) {
                    var3[var5++] = class473.method2847(arg0.field1769[var4] << 24, arg0.field1772[class37.method245(arg0.field1773[var4], 255)]);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; ~arg0.field1771 < ~var8; ++var8) {
                for (int var10 = 0; var10 < arg0.field1767; ++var10) {
                    int var11 = arg0.field1772[arg0.field1773[var4++] & 255];
                    var3[var5++] = var11 == 0 ? 0 : class473.method2847(-16777216, var11);
                }
            }
        }
        class53 var9 = this.method466(var3, 0, arg0.field1767, arg0.field1767, arg0.field1771);
        var9.method324(arg0.field1766, arg0.field1770, arg0.field1765, arg0.field1768);
        return var9;
    }

    @OriginalMember(owner = "client!te", name = "xa", descriptor = "()V")
    public final void method440() {
        this.field7818 = false;
        ++field7568;
        this.field7733.method3637(0, 0, (byte) 32, false, false, 0);
        this.method3108(-121);
        this.method3125(2912);
    }

    @OriginalMember(owner = "client!te", name = "q", descriptor = "()Z")
    public final boolean method457() {
        ++field7688;
        return true;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "()Z")
    public final boolean method438() {
        ++field7604;
        return false;
    }

    @OriginalMember(owner = "client!te", name = "i", descriptor = "()I")
    public final int method513() {
        ++field7667;
        return 4;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)V")
    public final synchronized void method3177(int arg0, byte arg1) {
        ++field7678;
        if (arg1 >= 122) {
            class556 var3 = new class556(arg0);
            this.field7762.method131(var3, 0);
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
    public final void method419(int arg0) {
        ++field7714;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field7732 = arg0;
            this.field7728.method1206(64);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!te", name = "y", descriptor = "()Lcr;")
    public final class493 method480() {
        ++field7589;
        int var1 = -1;
        if (~this.field7788.indexOf("nvidia") == 0) {
            if (this.field7788.indexOf("intel") != -1) {
                var1 = 32902;
            } else if (~this.field7788.indexOf("ati") != 0) {
                var1 = 4098;
            }
        } else {
            var1 = 4318;
        }
        return new class493(var1, "OpenGL", this.field7855, this.field7850, 0L);
    }

    @OriginalMember(owner = "client!te", name = "CA", descriptor = "()I")
    public final int method435() {
        ++field7538;
        return this.field7766;
    }

    @OriginalMember(owner = "client!te", name = "C", descriptor = "(I)V")
    private final void method3178(int arg0) {
        ++field7692;
        if (~this.field7802 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field7612 < -1 && this.field7563 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field7612, (double) this.field7563, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field7772 &= -25;
            this.field7802 = 1;
        }
        if (arg0 != -25) {
            this.method3166(102);
        }
    }

    @OriginalMember(owner = "client!te", name = "i", descriptor = "(B)V")
    private final void method3179(byte arg0) {
        this.field7831 = (float) (-this.field7861 + this.field7883);
        this.field7773 = (float) (this.field7789 - this.field7861);
        ++field7661;
        if (arg0 != -16) {
            this.field7868 = false;
        }
        this.field7769 = (float) (-this.field7876 + this.field7826);
        this.field7880 = (float) (-this.field7876 + this.field7847);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([BZBII)Lsp;")
    public final class544 method3180(byte[] arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        if (arg2 < 121) {
            this.method3150(false);
        }
        ++field7699;
        return (class544) (!this.field7793 || arg1 && !this.field7822 ? new class630(this, arg4, arg0, arg3) : new class545(this, arg4, arg0, arg3, arg1));
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(Z)V")
    public final void method495(boolean arg0) {
        ++field7593;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method529(Rectangle[] arg0, int arg1) throws class416 {
        this.method493();
        ++field7687;
    }

    @OriginalMember(owner = "client!te", name = "B", descriptor = "()Z")
    public final boolean method499() {
        ++field7578;
        return true;
    }

    @OriginalMember(owner = "client!te", name = "o", descriptor = "()V")
    public final void method436() {
        ++field7690;
        if (this.field7736 != null && this.field7736.method2166(118)) {
            this.field7738.method1399(true, this.field7736);
            this.field7728.method1206(64);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lsp;I)V")
    public final void method3181(class544 arg0, int arg1) {
        ++field7553;
        if (arg1 != 34962) {
            this.field7741 = false;
        }
        if (this.field7816 != arg0) {
            if (this.field7793) {
                OpenGL.glBindBufferARB(34962, arg0.method3313((byte) 91));
            }
            this.field7816 = arg0;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([Lr;Lrd;Lm;[Lpr;I)V")
    public final void method452(class159[] arg0, class283 arg1, class165 arg2, class381[] arg3, int arg4) {
        ++field7716;
        this.method507(arg0, arg2, arg3, arg4);
        this.method488(arg1);
    }

    @OriginalMember(owner = "client!te", name = "m", descriptor = "()Z")
    public final boolean method530() {
        ++field7573;
        return this.field7736 != null && (~this.field7735 >= -2 || this.field7832);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIII)V")
    public final void method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7605;
        OpenGL.glLineWidth((float) arg5);
        this.method481(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!te", name = "u", descriptor = "()Z")
    public final boolean method464() {
        ++field7671;
        return this.field7733.method3635(Integer.MAX_VALUE, 3);
    }

    @OriginalMember(owner = "client!te", name = "j", descriptor = "(B)V")
    public final void method3182(byte arg0) {
        ++field7618;
        if (arg0 <= 53) {
            this.method503((Canvas) null);
        }
        OpenGL.glLightfv(16384, 4611, this.field7800, 0);
        OpenGL.glLightfv(16385, 4611, this.field7792, 0);
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(III)V")
    public final void method3183(int arg0, int arg1, int arg2) {
        if (arg1 <= -123) {
            ++field7685;
            if (this.field7881 != 0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                OpenGL.glTexEnvi(8960, 34162, arg2);
            } else {
                boolean var4 = false;
                if (this.field7851 != arg0) {
                    OpenGL.glTexEnvi(8960, 34161, arg0);
                    var4 = true;
                    this.field7851 = arg0;
                }
                if (this.field7797 != arg2) {
                    OpenGL.glTexEnvi(8960, 34162, arg2);
                    var4 = true;
                    this.field7797 = arg2;
                }
                if (var4) {
                    this.field7772 &= -30;
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(ZZ)V")
    public final void method3184(boolean arg0, boolean arg1) {
        if (!arg1 != !this.field7835) {
            this.field7835 = arg1;
            this.method3176(-11310);
            this.field7772 &= -8;
        }
        ++field7574;
        if (!arg0) {
            this.field7862 = true;
        }
    }

    @OriginalMember(owner = "client!te", name = "k", descriptor = "(B)V")
    public final void method3185(byte arg0) {
        if (this.field7772 != 4) {
            this.method3178(-25);
            this.method3106(false, -100);
            this.method3184(true, false);
            this.method3156(false, true);
            this.method3142(false, (byte) 81);
            this.method3123(-2, false);
            this.method3105(1, 2);
            this.field7772 = 4;
        }
        if (arg0 == 81) {
            ++field7673;
        }
    }
}
