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

@OriginalClass("client!mh")
public class class537 extends class206 {

    @OriginalMember(owner = "client!mh", name = "fd", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field7669 = new Hashtable();

    @OriginalMember(owner = "client!mh", name = "de", descriptor = "I")
    public int field7719 = 128;

    @OriginalMember(owner = "client!mh", name = "je", descriptor = "Log;")
    private class553 field7725 = new class553();

    @OriginalMember(owner = "client!mh", name = "le", descriptor = "Lkc;")
    private class113 field7727 = new class113();

    @OriginalMember(owner = "client!mh", name = "me", descriptor = "Lkc;")
    public class113 field7728 = new class113();

    @OriginalMember(owner = "client!mh", name = "ne", descriptor = "I")
    public int field7729 = 8;

    @OriginalMember(owner = "client!mh", name = "se", descriptor = "Z")
    private boolean field7734 = false;

    @OriginalMember(owner = "client!mh", name = "qe", descriptor = "I")
    public int field7732 = 3;

    @OriginalMember(owner = "client!mh", name = "pe", descriptor = "Lui;")
    private class193 field7731 = new class193();

    @OriginalMember(owner = "client!mh", name = "ue", descriptor = "I")
    private int field7736 = -1;

    @OriginalMember(owner = "client!mh", name = "we", descriptor = "[Ltu;")
    private class291[] field7738 = new class291[4];

    @OriginalMember(owner = "client!mh", name = "ve", descriptor = "[Ltu;")
    private class291[] field7737 = new class291[4];

    @OriginalMember(owner = "client!mh", name = "ye", descriptor = "[Ltu;")
    private class291[] field7740 = new class291[4];

    @OriginalMember(owner = "client!mh", name = "Be", descriptor = "I")
    private int field7743 = -1;

    @OriginalMember(owner = "client!mh", name = "Ae", descriptor = "I")
    private int field7742 = -1;

    @OriginalMember(owner = "client!mh", name = "Fe", descriptor = "Lui;")
    private class193 field7747;

    @OriginalMember(owner = "client!mh", name = "Ge", descriptor = "Lui;")
    private class193 field7748;

    @OriginalMember(owner = "client!mh", name = "He", descriptor = "Lui;")
    private class193 field7749;

    @OriginalMember(owner = "client!mh", name = "Ie", descriptor = "Lui;")
    private class193 field7750;

    @OriginalMember(owner = "client!mh", name = "Je", descriptor = "Lui;")
    private class193 field7751;

    @OriginalMember(owner = "client!mh", name = "Ke", descriptor = "Lui;")
    private class193 field7752;

    @OriginalMember(owner = "client!mh", name = "Le", descriptor = "Lui;")
    private class193 field7753;

    @OriginalMember(owner = "client!mh", name = "Pe", descriptor = "[F")
    private float[] field7757;

    @OriginalMember(owner = "client!mh", name = "ff", descriptor = "I")
    public int field7773;

    @OriginalMember(owner = "client!mh", name = "zf", descriptor = "I")
    public int field7792;

    @OriginalMember(owner = "client!mh", name = "Mf", descriptor = "F")
    public float field7805;

    @OriginalMember(owner = "client!mh", name = "We", descriptor = "F")
    private float field7764;

    @OriginalMember(owner = "client!mh", name = "Pf", descriptor = "I")
    private int field7808;

    @OriginalMember(owner = "client!mh", name = "Qf", descriptor = "F")
    public float field7809;

    @OriginalMember(owner = "client!mh", name = "bf", descriptor = "I")
    public int field7769;

    @OriginalMember(owner = "client!mh", name = "tf", descriptor = "I")
    private int field7786;

    @OriginalMember(owner = "client!mh", name = "pg", descriptor = "[Lcba;")
    private class469[] field7834;

    @OriginalMember(owner = "client!mh", name = "mg", descriptor = "[F")
    private float[] field7831;

    @OriginalMember(owner = "client!mh", name = "kg", descriptor = "I")
    public int field7829;

    @OriginalMember(owner = "client!mh", name = "ng", descriptor = "I")
    public int field7832;

    @OriginalMember(owner = "client!mh", name = "cg", descriptor = "[F")
    private float[] field7821;

    @OriginalMember(owner = "client!mh", name = "ig", descriptor = "Z")
    private boolean field7827;

    @OriginalMember(owner = "client!mh", name = "Lf", descriptor = "F")
    public float field7804;

    @OriginalMember(owner = "client!mh", name = "Ff", descriptor = "I")
    private int field7798;

    @OriginalMember(owner = "client!mh", name = "Ye", descriptor = "I")
    private int field7766;

    @OriginalMember(owner = "client!mh", name = "vg", descriptor = "I")
    public int field7840;

    @OriginalMember(owner = "client!mh", name = "Uf", descriptor = "F")
    private float field7813;

    @OriginalMember(owner = "client!mh", name = "Bg", descriptor = "I")
    private int field7846;

    @OriginalMember(owner = "client!mh", name = "Ig", descriptor = "I")
    public int field7853;

    @OriginalMember(owner = "client!mh", name = "tg", descriptor = "F")
    private float field7838;

    @OriginalMember(owner = "client!mh", name = "ug", descriptor = "F")
    public float field7839;

    @OriginalMember(owner = "client!mh", name = "dg", descriptor = "I")
    public int field7822;

    @OriginalMember(owner = "client!mh", name = "Bf", descriptor = "I")
    public int field7794;

    @OriginalMember(owner = "client!mh", name = "vf", descriptor = "F")
    public float field7788;

    @OriginalMember(owner = "client!mh", name = "Qg", descriptor = "I")
    private int field7861;

    @OriginalMember(owner = "client!mh", name = "Dg", descriptor = "F")
    private float field7848;

    @OriginalMember(owner = "client!mh", name = "Pg", descriptor = "F")
    public float field7860;

    @OriginalMember(owner = "client!mh", name = "Lg", descriptor = "I")
    private int field7856;

    @OriginalMember(owner = "client!mh", name = "gf", descriptor = "F")
    public float field7774;

    @OriginalMember(owner = "client!mh", name = "Tg", descriptor = "I")
    public int field7864;

    @OriginalMember(owner = "client!mh", name = "og", descriptor = "I")
    public int field7833;

    @OriginalMember(owner = "client!mh", name = "Yf", descriptor = "I")
    private int field7817;

    @OriginalMember(owner = "client!mh", name = "Xg", descriptor = "I")
    private int field7868;

    @OriginalMember(owner = "client!mh", name = "Og", descriptor = "[F")
    public float[] field7859;

    @OriginalMember(owner = "client!mh", name = "Yg", descriptor = "F")
    private float field7869;

    @OriginalMember(owner = "client!mh", name = "ah", descriptor = "I")
    private int field7871;

    @OriginalMember(owner = "client!mh", name = "ch", descriptor = "[F")
    private float[] field7873;

    @OriginalMember(owner = "client!mh", name = "Fg", descriptor = "F")
    public float field7850;

    @OriginalMember(owner = "client!mh", name = "Hg", descriptor = "Lgt;")
    public class385 field7852;

    @OriginalMember(owner = "client!mh", name = "eh", descriptor = "[I")
    public int[] field7875;

    @OriginalMember(owner = "client!mh", name = "dh", descriptor = "[I")
    public int[] field7874;

    @OriginalMember(owner = "client!mh", name = "gh", descriptor = "[B")
    public byte[] field7877;

    @OriginalMember(owner = "client!mh", name = "ih", descriptor = "[I")
    public int[] field7879;

    @OriginalMember(owner = "client!mh", name = "Rb", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7603;

    @OriginalMember(owner = "client!mh", name = "Jd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7699;

    @OriginalMember(owner = "client!mh", name = "he", descriptor = "I")
    public int field7723;

    @OriginalMember(owner = "client!mh", name = "jb", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field7569;

    @OriginalMember(owner = "client!mh", name = "kd", descriptor = "J")
    private long field7674;

    @OriginalMember(owner = "client!mh", name = "sd", descriptor = "J")
    private long field7682;

    @OriginalMember(owner = "client!mh", name = "Me", descriptor = "Z")
    public boolean field7754;

    @OriginalMember(owner = "client!mh", name = "jf", descriptor = "I")
    public int field7776;

    @OriginalMember(owner = "client!mh", name = "rf", descriptor = "Ljava/lang/String;")
    private String field7784;

    @OriginalMember(owner = "client!mh", name = "cf", descriptor = "Z")
    public boolean field7770;

    @OriginalMember(owner = "client!mh", name = "eg", descriptor = "Z")
    private boolean field7823;

    @OriginalMember(owner = "client!mh", name = "Ze", descriptor = "Z")
    public boolean field7767;

    @OriginalMember(owner = "client!mh", name = "Cf", descriptor = "Z")
    public boolean field7795;

    @OriginalMember(owner = "client!mh", name = "Kg", descriptor = "Z")
    private boolean field7855;

    @OriginalMember(owner = "client!mh", name = "Vf", descriptor = "Z")
    public boolean field7814;

    @OriginalMember(owner = "client!mh", name = "Wg", descriptor = "Ljava/lang/String;")
    private String field7867;

    @OriginalMember(owner = "client!mh", name = "bh", descriptor = "Z")
    public boolean field7872;

    @OriginalMember(owner = "client!mh", name = "fg", descriptor = "Z")
    private boolean field7824;

    @OriginalMember(owner = "client!mh", name = "ee", descriptor = "Lqd;")
    private class380 field7720;

    @OriginalMember(owner = "client!mh", name = "te", descriptor = "Lar;")
    public class583 field7735;

    @OriginalMember(owner = "client!mh", name = "ge", descriptor = "Lbba;")
    private class95 field7722;

    @OriginalMember(owner = "client!mh", name = "fe", descriptor = "Llv;")
    private class376 field7721;

    @OriginalMember(owner = "client!mh", name = "be", descriptor = "Lsl;")
    private class387 field7717;

    @OriginalMember(owner = "client!mh", name = "Hc", descriptor = "S")
    public static short field7645 = 256;

    @OriginalMember(owner = "client!mh", name = "tc", descriptor = "[I")
    public static int[] field7631 = new int[2048];

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "Lih;")
    public static class597 field7555 = new class597();

    @OriginalMember(owner = "client!mh", name = "Qd", descriptor = "Ljr;")
    public static class92 field7706 = new class92("", 14);

    @OriginalMember(owner = "client!mh", name = "Yd", descriptor = "Lrg;")
    public static class548 field7714 = new class548(13, 3);

    @OriginalMember(owner = "client!mh", name = "ke", descriptor = "Lvj;")
    public static class373 field7726 = new class373(90, 6);

    @OriginalMember(owner = "client!mh", name = "Ne", descriptor = "F")
    public float field7755;

    @OriginalMember(owner = "client!mh", name = "Se", descriptor = "F")
    private float field7760;

    @OriginalMember(owner = "client!mh", name = "af", descriptor = "F")
    public float field7768;

    @OriginalMember(owner = "client!mh", name = "hf", descriptor = "F")
    private float field7775;

    @OriginalMember(owner = "client!mh", name = "Kf", descriptor = "F")
    public float field7803;

    @OriginalMember(owner = "client!mh", name = "Zf", descriptor = "F")
    public float field7818;

    @OriginalMember(owner = "client!mh", name = "jg", descriptor = "F")
    public float field7828;

    @OriginalMember(owner = "client!mh", name = "xg", descriptor = "F")
    public float field7842;

    @OriginalMember(owner = "client!mh", name = "Jg", descriptor = "F")
    public float field7854;

    @OriginalMember(owner = "client!mh", name = "Vg", descriptor = "F")
    private float field7866;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
    public static int field7530;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public int field7549;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!mh", name = "ab", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!mh", name = "bb", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!mh", name = "cb", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!mh", name = "db", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!mh", name = "eb", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!mh", name = "fb", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!mh", name = "gb", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!mh", name = "hb", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!mh", name = "ib", descriptor = "I")
    public int field7568;

    @OriginalMember(owner = "client!mh", name = "kb", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!mh", name = "lb", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!mh", name = "mb", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!mh", name = "nb", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!mh", name = "ob", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!mh", name = "pb", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!mh", name = "qb", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!mh", name = "rb", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!mh", name = "sb", descriptor = "I")
    private int field7578;

    @OriginalMember(owner = "client!mh", name = "tb", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!mh", name = "ub", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!mh", name = "vb", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!mh", name = "wb", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!mh", name = "xb", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!mh", name = "yb", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!mh", name = "zb", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!mh", name = "Ab", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!mh", name = "Bb", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!mh", name = "Cb", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!mh", name = "Db", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!mh", name = "Eb", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!mh", name = "Fb", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!mh", name = "Gb", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!mh", name = "Hb", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!mh", name = "Ib", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!mh", name = "Jb", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!mh", name = "Kb", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!mh", name = "Lb", descriptor = "I")
    public static int field7597;

    @OriginalMember(owner = "client!mh", name = "Mb", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!mh", name = "Nb", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!mh", name = "Ob", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!mh", name = "Pb", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!mh", name = "Qb", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!mh", name = "Sb", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!mh", name = "Tb", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!mh", name = "Ub", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!mh", name = "Vb", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!mh", name = "Wb", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!mh", name = "Xb", descriptor = "I")
    public static int field7609;

    @OriginalMember(owner = "client!mh", name = "Yb", descriptor = "I")
    public static int field7610;

    @OriginalMember(owner = "client!mh", name = "Zb", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!mh", name = "ac", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!mh", name = "bc", descriptor = "I")
    public static int field7613;

    @OriginalMember(owner = "client!mh", name = "cc", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!mh", name = "dc", descriptor = "I")
    public static int field7615;

    @OriginalMember(owner = "client!mh", name = "ec", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!mh", name = "fc", descriptor = "I")
    public static int field7617;

    @OriginalMember(owner = "client!mh", name = "gc", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!mh", name = "hc", descriptor = "I")
    public static int field7619;

    @OriginalMember(owner = "client!mh", name = "ic", descriptor = "I")
    public static int field7620;

    @OriginalMember(owner = "client!mh", name = "jc", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!mh", name = "kc", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!mh", name = "lc", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!mh", name = "mc", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!mh", name = "nc", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!mh", name = "oc", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!mh", name = "pc", descriptor = "I")
    public static int field7627;

    @OriginalMember(owner = "client!mh", name = "qc", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!mh", name = "rc", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!mh", name = "sc", descriptor = "I")
    public static int field7630;

    @OriginalMember(owner = "client!mh", name = "uc", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!mh", name = "vc", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!mh", name = "wc", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!mh", name = "xc", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!mh", name = "yc", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!mh", name = "zc", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!mh", name = "Ac", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!mh", name = "Bc", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!mh", name = "Cc", descriptor = "I")
    public static int field7640;

    @OriginalMember(owner = "client!mh", name = "Dc", descriptor = "I")
    public static int field7641;

    @OriginalMember(owner = "client!mh", name = "Ec", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!mh", name = "Fc", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!mh", name = "Gc", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!mh", name = "Ic", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!mh", name = "Jc", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!mh", name = "Kc", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!mh", name = "Lc", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!mh", name = "Mc", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!mh", name = "Nc", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!mh", name = "Oc", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!mh", name = "Pc", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!mh", name = "Qc", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!mh", name = "Rc", descriptor = "I")
    public static int field7655;

    @OriginalMember(owner = "client!mh", name = "Sc", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!mh", name = "Tc", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!mh", name = "Uc", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!mh", name = "Vc", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!mh", name = "Wc", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!mh", name = "Xc", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!mh", name = "Yc", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!mh", name = "Zc", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!mh", name = "ad", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!mh", name = "bd", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!mh", name = "cd", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!mh", name = "dd", descriptor = "I")
    public static int field7667;

    @OriginalMember(owner = "client!mh", name = "ed", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!mh", name = "gd", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!mh", name = "hd", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!mh", name = "id", descriptor = "I")
    public static int field7672;

    @OriginalMember(owner = "client!mh", name = "jd", descriptor = "I")
    public static int field7673;

    @OriginalMember(owner = "client!mh", name = "ld", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!mh", name = "md", descriptor = "I")
    public static int field7676;

    @OriginalMember(owner = "client!mh", name = "nd", descriptor = "I")
    public static int field7677;

    @OriginalMember(owner = "client!mh", name = "od", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!mh", name = "pd", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!mh", name = "qd", descriptor = "I")
    public static int field7680;

    @OriginalMember(owner = "client!mh", name = "rd", descriptor = "I")
    public static int field7681;

    @OriginalMember(owner = "client!mh", name = "td", descriptor = "I")
    public static int field7683;

    @OriginalMember(owner = "client!mh", name = "ud", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!mh", name = "vd", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!mh", name = "wd", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!mh", name = "xd", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!mh", name = "yd", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!mh", name = "zd", descriptor = "I")
    public static int field7689;

    @OriginalMember(owner = "client!mh", name = "Ad", descriptor = "I")
    public static int field7690;

    @OriginalMember(owner = "client!mh", name = "Bd", descriptor = "I")
    public static int field7691;

    @OriginalMember(owner = "client!mh", name = "Cd", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!mh", name = "Dd", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!mh", name = "Ed", descriptor = "I")
    public static int field7694;

    @OriginalMember(owner = "client!mh", name = "Fd", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!mh", name = "Gd", descriptor = "I")
    public static int field7696;

    @OriginalMember(owner = "client!mh", name = "Hd", descriptor = "I")
    public static int field7697;

    @OriginalMember(owner = "client!mh", name = "Id", descriptor = "I")
    private int field7698;

    @OriginalMember(owner = "client!mh", name = "Kd", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!mh", name = "Ld", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!mh", name = "Md", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!mh", name = "Nd", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!mh", name = "Od", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!mh", name = "Pd", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!mh", name = "Rd", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!mh", name = "Sd", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!mh", name = "Td", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!mh", name = "Ud", descriptor = "I")
    public static int field7710;

    @OriginalMember(owner = "client!mh", name = "Vd", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!mh", name = "Wd", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!mh", name = "Xd", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!mh", name = "Zd", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!mh", name = "ae", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!mh", name = "ce", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!mh", name = "ie", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!mh", name = "oe", descriptor = "I")
    public int field7730;

    @OriginalMember(owner = "client!mh", name = "Ce", descriptor = "I")
    private int field7744;

    @OriginalMember(owner = "client!mh", name = "De", descriptor = "I")
    public int field7745;

    @OriginalMember(owner = "client!mh", name = "Ee", descriptor = "I")
    public int field7746;

    @OriginalMember(owner = "client!mh", name = "Qe", descriptor = "I")
    private int field7758;

    @OriginalMember(owner = "client!mh", name = "Re", descriptor = "I")
    public int field7759;

    @OriginalMember(owner = "client!mh", name = "lf", descriptor = "I")
    private int field7778;

    @OriginalMember(owner = "client!mh", name = "of", descriptor = "I")
    private int field7781;

    @OriginalMember(owner = "client!mh", name = "wf", descriptor = "I")
    private int field7789;

    @OriginalMember(owner = "client!mh", name = "Df", descriptor = "I")
    private int field7796;

    @OriginalMember(owner = "client!mh", name = "Hf", descriptor = "I")
    public int field7800;

    @OriginalMember(owner = "client!mh", name = "Of", descriptor = "I")
    private int field7807;

    @OriginalMember(owner = "client!mh", name = "hg", descriptor = "I")
    public int field7826;

    @OriginalMember(owner = "client!mh", name = "qg", descriptor = "I")
    public int field7835;

    @OriginalMember(owner = "client!mh", name = "sg", descriptor = "I")
    private int field7837;

    @OriginalMember(owner = "client!mh", name = "wg", descriptor = "I")
    private int field7841;

    @OriginalMember(owner = "client!mh", name = "Gg", descriptor = "I")
    private int field7851;

    @OriginalMember(owner = "client!mh", name = "Mg", descriptor = "I")
    private int field7857;

    @OriginalMember(owner = "client!mh", name = "Zg", descriptor = "I")
    private int field7870;

    @OriginalMember(owner = "client!mh", name = "fh", descriptor = "I")
    private int field7876;

    @OriginalMember(owner = "client!mh", name = "hh", descriptor = "I")
    private int field7878;

    @OriginalMember(owner = "client!mh", name = "Cg", descriptor = "J")
    private long field7847;

    @OriginalMember(owner = "client!mh", name = "Ue", descriptor = "Lkc;")
    public class113 field7762;

    @OriginalMember(owner = "client!mh", name = "qf", descriptor = "Lkc;")
    public class113 field7783;

    @OriginalMember(owner = "client!mh", name = "bg", descriptor = "Lgca;")
    private class208 field7820;

    @OriginalMember(owner = "client!mh", name = "xf", descriptor = "Lqo;")
    private class21 field7790;

    @OriginalMember(owner = "client!mh", name = "Rg", descriptor = "Lqo;")
    private class21 field7862;

    @OriginalMember(owner = "client!mh", name = "pf", descriptor = "Lsb;")
    public class242 field7782;

    @OriginalMember(owner = "client!mh", name = "uf", descriptor = "Lsb;")
    public class242 field7787;

    @OriginalMember(owner = "client!mh", name = "yf", descriptor = "Lsb;")
    public class242 field7791;

    @OriginalMember(owner = "client!mh", name = "Af", descriptor = "Lsb;")
    public class242 field7793;

    @OriginalMember(owner = "client!mh", name = "Gf", descriptor = "Lsb;")
    public class242 field7799;

    @OriginalMember(owner = "client!mh", name = "Nf", descriptor = "Lsb;")
    public class242 field7806;

    @OriginalMember(owner = "client!mh", name = "Wf", descriptor = "Lsb;")
    public class242 field7815;

    @OriginalMember(owner = "client!mh", name = "yg", descriptor = "Lsb;")
    public class242 field7843;

    @OriginalMember(owner = "client!mh", name = "Ag", descriptor = "Lsb;")
    public class242 field7845;

    @OriginalMember(owner = "client!mh", name = "Eg", descriptor = "Lsb;")
    public class242 field7849;

    @OriginalMember(owner = "client!mh", name = "xe", descriptor = "Ltu;")
    private class291 field7739;

    @OriginalMember(owner = "client!mh", name = "ze", descriptor = "Ltu;")
    private class291 field7741;

    @OriginalMember(owner = "client!mh", name = "sf", descriptor = "Lro;")
    public class2 field7785;

    @OriginalMember(owner = "client!mh", name = "Rf", descriptor = "Lro;")
    public class2 field7810;

    @OriginalMember(owner = "client!mh", name = "Jf", descriptor = "Lrr;")
    public class303 field7802;

    @OriginalMember(owner = "client!mh", name = "Ef", descriptor = "Lwj;")
    private class332 field7797;

    @OriginalMember(owner = "client!mh", name = "Ug", descriptor = "Lwo;")
    private class632 field7865;

    @OriginalMember(owner = "client!mh", name = "rg", descriptor = "Ler;")
    public class88 field7836;

    @OriginalMember(owner = "client!mh", name = "re", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field7733;

    @OriginalMember(owner = "client!mh", name = "Oe", descriptor = "Z")
    private boolean field7756;

    @OriginalMember(owner = "client!mh", name = "Te", descriptor = "Z")
    private boolean field7761;

    @OriginalMember(owner = "client!mh", name = "Ve", descriptor = "Z")
    public boolean field7763;

    @OriginalMember(owner = "client!mh", name = "Xe", descriptor = "Z")
    private boolean field7765;

    @OriginalMember(owner = "client!mh", name = "df", descriptor = "Z")
    private boolean field7771;

    @OriginalMember(owner = "client!mh", name = "ef", descriptor = "Z")
    public boolean field7772;

    @OriginalMember(owner = "client!mh", name = "kf", descriptor = "Z")
    public boolean field7777;

    @OriginalMember(owner = "client!mh", name = "mf", descriptor = "Z")
    private boolean field7779;

    @OriginalMember(owner = "client!mh", name = "nf", descriptor = "Z")
    public boolean field7780;

    @OriginalMember(owner = "client!mh", name = "If", descriptor = "Z")
    private boolean field7801;

    @OriginalMember(owner = "client!mh", name = "Sf", descriptor = "Z")
    public boolean field7811;

    @OriginalMember(owner = "client!mh", name = "Tf", descriptor = "Z")
    private boolean field7812;

    @OriginalMember(owner = "client!mh", name = "ag", descriptor = "Z")
    private boolean field7819;

    @OriginalMember(owner = "client!mh", name = "gg", descriptor = "Z")
    public boolean field7825;

    @OriginalMember(owner = "client!mh", name = "lg", descriptor = "Z")
    private boolean field7830;

    @OriginalMember(owner = "client!mh", name = "zg", descriptor = "Z")
    private boolean field7844;

    @OriginalMember(owner = "client!mh", name = "Ng", descriptor = "Z")
    public boolean field7858;

    @OriginalMember(owner = "client!mh", name = "Sg", descriptor = "Z")
    public boolean field7863;

    @OriginalMember(owner = "client!mh", name = "Xf", descriptor = "[Luu;")
    private class238[] field7816;

    @OriginalMember(owner = "client!mh", name = "IA", descriptor = "(III[I)V", line = 3)
    public final void method1112(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7683;
        float var5 = (float) arg2 * this.field7762.field1409 + (float) arg0 * this.field7762.field1383 + (float) arg1 * this.field7762.field1381 + this.field7762.field1396;
        if (!((float) this.field7833 > var5) && !(var5 > (float) this.field7829)) {
            int var6 = (int) (((float) arg2 * this.field7762.field1394 + (float) arg0 * this.field7762.field1412 + (float) arg1 * this.field7762.field1404 + this.field7762.field1389) * (float) this.field7864 / var5);
            int var7 = (int) (((float) arg2 * this.field7762.field1399 + (float) arg0 * this.field7762.field1377 + (float) arg1 * this.field7762.field1379 + this.field7762.field1392) * (float) this.field7773 / var5);
            if (this.field7818 <= (float) var6 && (float) var6 <= this.field7803 && this.field7768 <= (float) var7 && (float) var7 <= this.field7755) {
                arg3[1] = (int) ((float) var7 - this.field7768);
                arg3[2] = (int) var5;
                arg3[0] = (int) ((float) var6 + -this.field7818);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lr;Lka;Lm;Lcf;I)V", line = 34)
    public final void method1177(class157 arg0, class400 arg1, class163 arg2, class517 arg3, int arg4) {
        arg0.method69(arg2, arg3, arg4);
        ++field7573;
        this.method1140(arg1);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lqo;I)V", line = 47)
    public final void method3057(class21 arg0, int arg1) {
        if (this.field7862 != arg0) {
            if (this.field7823) {
                OpenGL.glBindBufferARB(34962, arg0.method134(106));
            }
            this.field7862 = arg0;
        }
        ++field7548;
        if (arg1 <= 7) {
            this.field7865 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)V", line = 67)
    public final void method3058(byte arg0, int arg1) {
        if (this.field7807 != arg1) {
            boolean var3;
            byte var4;
            boolean var5;
            if (~arg1 == -2) {
                var3 = true;
                var4 = 1;
                var5 = true;
            } else if (arg1 == 2) {
                var4 = 2;
                var5 = false;
                var3 = true;
            } else if (arg1 == 128) {
                var5 = true;
                var4 = 3;
                var3 = true;
            } else {
                var5 = false;
                var4 = 0;
                var3 = true;
            }
            if (this.field7830 != var3) {
                OpenGL.glColorMask(var3, var3, var3, true);
                this.field7830 = var3;
            }
            if (!this.field7779 == var5) {
                if (var5) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field7779 = var5;
            }
            if (~this.field7758 != ~var4) {
                if (var4 != 1) {
                    if (var4 == 2) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    } else if (~var4 == -4) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    } else {
                        OpenGL.glDisable(3042);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field7758 = var4;
            }
            this.field7778 &= -29;
            this.field7807 = arg1;
        }
        if (arg0 >= -112) {
            this.method1165(0.4033299F);
        }
        ++field7705;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lmv;Lmv;FLmv;)Lmv;", line = 160)
    public final class313 method1162(class313 arg0, class313 arg1, float arg2, class313 arg3) {
        ++field7692;
        if (arg0 != null && arg1 != null && this.field7772 && this.field7872) {
            class522 var5 = null;
            class208 var6 = (class208) arg0;
            class208 var7 = (class208) arg1;
            class15 var8 = var6.method1201((byte) 51);
            class15 var9 = var7.method1201((byte) 51);
            if (var8 != null && var9 != null) {
                int var10 = var8.field117 > var9.field117 ? var8.field117 : var9.field117;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class522) {
                    class522 var11 = (class522) arg3;
                    if (~var10 == ~var11.method2970((byte) 36)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class522(this, var10);
                }
                if (var5.method2972(arg2, (byte) 65, var9, var8)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)V", line = 206)
    public final void method3059(int arg0, int arg1) {
        ++field7662;
        class126.field1548[0] = (float) class288.method1624(arg1, 16711680) / 1.671168E7F;
        class126.field1548[3] = (float) (arg1 >>> 24) / 255.0F;
        class126.field1548[2] = (float) class288.method1624(255, arg1) / 255.0F;
        class126.field1548[1] = (float) class288.method1624(arg0, arg1) / 65280.0F;
        OpenGL.glTexEnvfv(8960, 8705, class126.field1548, 0);
    }

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "(I)V", line = 221)
    private final void method3060(int arg0) {
        int var2 = -78 % ((arg0 - 78) / 32);
        if (this.field7699 != null) {
            Dimension var3 = this.field7699.getSize();
            this.field7698 = var3.width;
            this.field7578 = var3.height;
        } else {
            this.field7698 = this.field7578 = 0;
        }
        ++field7701;
        if (this.field7739 == null) {
            this.field7568 = this.field7698;
            this.field7549 = this.field7578;
            this.method3095(-110);
        }
        this.method3079((byte) 81);
        this.method1182();
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZII)V", line = 256)
    public final void method3061(boolean arg0, int arg1, int arg2) {
        if (arg1 == 6401) {
            this.method3067(-27210, arg2, arg0, true);
            ++field7574;
        }
    }

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "(I)V", line = 267)
    private final void method3062(int arg0) {
        ++field7710;
        if (~this.field7786 <= ~this.field7868 && ~this.field7871 >= ~this.field7808) {
            OpenGL.glScissor(this.field7868 + this.field7856, this.field7861 + this.field7549 + -this.field7808, -this.field7868 + this.field7786, -this.field7871 + this.field7808);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        if (arg0 != 0) {
            this.method1122();
        }
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(I)Lu;", line = 282)
    public final class64 method1191(int arg0) {
        ++field7718;
        class336 var2 = new class336(arg0);
        this.field7731.method1040(var2, -120);
        return var2;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)V", line = 301)
    public final void method3063(int arg0, byte arg1) {
        if (~arg0 != -2) {
            if (arg0 != 0) {
                if (arg0 == 2) {
                    this.method3099(7681, 34165, 8);
                } else if (arg0 == 3) {
                    this.method3099(8448, 260, 8);
                } else if (arg0 == 4) {
                    this.method3099(34023, 34023, 8);
                }
            } else {
                this.method3099(8448, 8448, 8);
            }
        } else {
            this.method3099(7681, 7681, 8);
        }
        ++field7584;
        if (arg1 != -107) {
            this.method3127((class291) null, 31);
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIIIZ)Lha;", line = 332)
    public final class52 method1161(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field7526;
        return new class162(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "()V", line = 341)
    public final void method1131() {
        ++field7570;
        if (this.field7824 && ~this.field7568 < -1 && this.field7549 > 0) {
            int var1 = this.field7868;
            int var2 = this.field7786;
            int var3 = this.field7871;
            int var4 = this.field7808;
            this.method1182();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3079((byte) 111);
            this.method3103((byte) -55, false);
            this.method3106(true, false);
            this.method3074((byte) -127, false);
            this.method3101(false, 8);
            this.method3083((byte) 91, (class238) null);
            this.method3071(59, -2);
            this.method3063(1, (byte) -107);
            this.method3058((byte) -127, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field7568, this.field7549, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method1107(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "()Z", line = 384)
    public final boolean method1108() {
        ++field7620;
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "(IIII)V", line = 393)
    public final void method1107(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (~this.field7549 > ~arg3) {
            arg3 = this.field7549;
        }
        ++field7634;
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (this.field7568 < arg2) {
            arg2 = this.field7568;
        }
        this.field7868 = arg0;
        this.field7808 = arg3;
        this.field7871 = arg1;
        this.field7786 = arg2;
        OpenGL.glEnable(3089);
        this.method3105(-19);
        this.method3062(0);
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(II)I", line = 422)
    public final int method3064(int arg0, int arg1) {
        if (arg1 != -1) {
            this.method3095(112);
        }
        ++field7702;
        if (arg0 != 5121 && ~arg0 != -5121) {
            if (~arg0 != -5124 && ~arg0 != -5123) {
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

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "(IIIII)V", line = 446)
    public final void method1124(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7605;
        if (~arg2 > -1) {
            arg2 = -arg2;
        }
        if (this.field7868 <= arg0 + arg2 && ~(-arg2 + arg0) >= ~this.field7786 && ~this.field7871 >= ~(arg1 + arg2) && ~this.field7808 <= ~(arg1 - arg2)) {
            this.method3117(-2);
            this.method3058((byte) -126, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field7838) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if ((float) var8 <= this.field7869) {
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
                int var10 = class308.method1711((byte) -66, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class462.field6371[var11] * (float) arg2 + var6, class462.field6380[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V", line = 519)
    public final synchronized void method3065(int arg0, int arg1, int arg2) {
        ++field7716;
        if (arg0 != 16) {
            this.method265(31, 127, (int[][]) null, (int[][]) null, -91, 54, 119);
        }
        class171 var4 = new class171(arg2);
        var4.field7967 = (long) arg1;
        this.field7751.method1040(var4, -106);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V", line = 533)
    private final void method3066(byte arg0) {
        if (arg0 < 74) {
            this.field7813 = 0.8847437F;
        }
        ++field7599;
        OpenGL.glDepthMask(this.field7819 && this.field7827);
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(IIIIII)V", line = 545)
    public final void method1133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7617;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method3117(-2);
        this.method3058((byte) -122, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7756) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7756) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!mh", name = "la", descriptor = "(FF)V", line = 578)
    public final void method1106(float arg0, float arg1) {
        if (this.field7839 != arg0 || this.field7854 != arg1) {
            this.field7839 = arg0;
            this.field7854 = arg1;
            this.method3076((byte) -50);
            if (this.field7837 != 3) {
                if (~this.field7837 == -3) {
                    this.method3072(-31343);
                }
            } else {
                this.method3089((byte) -110);
            }
        }
        ++field7668;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIZZ)V", line = 602)
    public final void method3067(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (~this.field7841 != ~arg1) {
            if (arg1 < 0) {
                this.method3136(arg0 ^ -19274);
                this.method3083((byte) 110, (class238) null);
                this.method3063(0, (byte) -107);
                if (!this.field7811) {
                    this.field7717.method2231(0, (byte) -101, arg3, 0, 0, arg2);
                }
            } else {
                class303 var5 = this.field7720.method2202(arg1, 105);
                class217 var6 = super.field2481.method119(-120, arg1);
                if (~var6.field2651 == -1 && ~var6.field2660 == -1) {
                    this.method3136(arg0 + 35658);
                } else {
                    int var7 = !var6.field2642 ? 128 : 64;
                    int var8 = var7 * 50;
                    this.method3119((float) (this.field7730 % var8 * var6.field2660) / (float) var8, 0.0F, (float) (this.field7730 % var8 * var6.field2651) / (float) var8, 5890);
                }
                if (this.field7811) {
                    this.method3083((byte) 94, var5);
                    this.method3063(var6.field2658, (byte) -107);
                } else {
                    this.field7717.method2231(var6.field2643, (byte) -101, arg3, var6.field2657, var6.field2648, arg2);
                    if (!this.field7717.method2230(14754, var5, var6.field2658)) {
                        this.method3083((byte) 85, var5);
                        this.method3063(var6.field2658, (byte) -107);
                    }
                }
            }
            this.field7841 = arg1;
        }
        ++field7608;
        this.field7778 &= -8;
        if (arg0 != -27210) {
            this.field7813 = 1.2471874F;
        }
    }

    @OriginalMember(owner = "client!mh", name = "JA", descriptor = "(IIII)V", line = 664)
    public final void method1159(int arg0, int arg1, int arg2, int arg3) {
        ++field7546;
        if (!this.field7811) {
            throw new RuntimeException("");
        } else {
            this.field7853 = arg3;
            this.field7798 = arg1;
            this.field7840 = arg2;
            this.field7835 = arg0;
            this.field7717.field5103.method3437((byte) -45);
            this.method3130((byte) 108);
        }
    }

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "()V", line = 683)
    public final void method1137() {
        ++field7582;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIIIII)V", line = 692)
    public final void method1142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7658;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method3117(-2);
        this.method3058((byte) -118, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7756) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7756) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "()F", line = 728)
    public final float method1167() {
        ++field7557;
        return this.field7839;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(B)V", line = 736)
    private final void method3068(byte arg0) {
        if (this.field7812 && this.field7811 | this.field7794 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        ++field7675;
        if (arg0 <= 5) {
            this.method1157();
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZIII)V", line = 753)
    public final void method3069(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            this.method1139((Rectangle[]) null, 6);
        }
        OpenGL.glDrawArrays(arg2, arg1, arg3);
        ++field7583;
    }

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "(I)V", line = 767)
    private final void method3070(int arg0) {
        ++field7697;
        float[] var2 = this.field7757;
        float var3 = (float) (-this.field7832 * this.field7833) / (float) this.field7864;
        float var4 = (float) ((-this.field7832 + this.field7568) * this.field7833) / (float) this.field7864;
        if (arg0 > -96) {
            this.method1107(111, 39, 67, 53);
        }
        float var5 = (float) (this.field7833 * this.field7792) / (float) this.field7773;
        float var6 = (float) ((-this.field7549 + this.field7792) * this.field7833) / (float) this.field7773;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field7833 * 2.0F;
            var2[6] = 0.0F;
            var2[1] = 0.0F;
            var2[7] = 0.0F;
            var2[3] = 0.0F;
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[11] = -1.0F;
            var2[14] = this.field7760 = -((float) this.field7829 * var7) / (float) (-this.field7833 + this.field7829);
            var2[4] = 0.0F;
            var2[15] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[10] = this.field7775 = (float) (-(this.field7833 + this.field7829)) / (float) (-this.field7833 + this.field7829);
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[2] = 0.0F;
            var2[12] = 0.0F;
            var2[13] = 0.0F;
            var2[5] = var7 / (var5 - var6);
        } else {
            var2[15] = 1.0F;
            var2[0] = 1.0F;
            var2[2] = 0.0F;
            var2[8] = 0.0F;
            var2[11] = 0.0F;
            var2[6] = 0.0F;
            var2[10] = 1.0F;
            var2[14] = 0.0F;
            var2[12] = 0.0F;
            var2[4] = 0.0F;
            var2[13] = 0.0F;
            var2[3] = 0.0F;
            var2[5] = 1.0F;
            var2[7] = 0.0F;
            var2[9] = 0.0F;
            var2[1] = 0.0F;
        }
        this.method3076((byte) -50);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIILpa;II)V", line = 829)
    public final void method1178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class309 arg6, int arg7, int arg8) {
        ++field7639;
        class33 var10 = (class33) arg6;
        class632 var11 = var10.field257;
        this.method3100(5196);
        this.method3083((byte) 84, var10.field257);
        this.method3058((byte) -119, arg5);
        this.method3099(8448, 7681, 8);
        this.method3126(false, 0, 768, 34167);
        float var12 = var11.field9100 / (float) var11.field9109;
        float var13 = var11.field9101 / (float) var11.field9099;
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
        this.method3126(false, 0, 768, 5890);
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(II)V", line = 868)
    public final void method3071(int arg0, int arg1) {
        this.method3061(true, 6401, arg1);
        ++field7672;
        if (arg0 <= 50) {
            this.field7749 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "(I)V", line = 879)
    private final void method3072(int arg0) {
        OpenGL.glMatrixMode(5889);
        ++field7563;
        OpenGL.glLoadMatrixf(this.field7757, 0);
        if (arg0 != -31343) {
            this.method3104(-24, 2, -63);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(B)V", line = 892)
    private final void method3073(byte arg0) {
        ++field7693;
        int var2;
        for (var2 = 0; ~this.field7789 < ~var2; ++var2) {
            class469 var3 = this.field7834[var2];
            int var4 = var2 + 16386;
            class617.field8933[0] = (float) var3.method2731((byte) -96);
            class617.field8933[1] = (float) var3.method2730(-1);
            class617.field8933[2] = (float) var3.method2737((byte) -86);
            class617.field8933[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class617.field8933, 0);
            int var5 = var3.method2736((byte) -60);
            float var6 = var3.method2734((byte) -37) / 255.0F;
            class617.field8933[2] = var6 * (float) class288.method1624(255, var5);
            class617.field8933[0] = var6 * (float) class288.method1624(255, var5 >> 16);
            class617.field8933[1] = var6 * (float) (class288.method1624(65521, var5) >> 8);
            OpenGL.glLightfv(var4, 4609, class617.field8933, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method2735((byte) 90) * var3.method2735((byte) 126)));
            OpenGL.glEnable(var4);
        }
        if (arg0 <= 60) {
            this.field7778 = -56;
        }
        while (~var2 > ~this.field7870) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        this.field7870 = this.field7789;
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "()V", line = 938)
    public final void method1109() {
        ++field7607;
        if (this.field7721 != null && this.field7721.method938(106)) {
            this.field7722.method589(this.field7721, (byte) 74);
            this.field7720.method2205((byte) 30);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BZ)V", line = 953)
    public final void method3074(byte arg0, boolean arg1) {
        ++field7581;
        if (this.field7771 != arg1) {
            if (!arg1) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field7771 = arg1;
            this.field7778 &= -32;
        }
        if (arg0 > -3) {
            this.field7876 = -47;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(FFF)V", line = 978)
    public final void method1171(float arg0, float arg1, float arg2) {
        ++field7694;
        class237.field2947 = arg2;
        class76.field895 = arg0;
        class184.field2229 = arg1;
    }

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "()Lm;", line = 991)
    public final class163 method1150() {
        ++field7611;
        return new class113();
    }

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "(I)V", line = 1002)
    private final void method3075(int arg0) {
        ++field7628;
        this.method3071(70, -2);
        for (int var2 = this.field7759 + -1; ~var2 <= -1; --var2) {
            this.method3078(arg0 ^ -38944, var2);
            this.method3083((byte) 124, (class238) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method3099(8448, 8448, 8);
        this.method3126(false, 2, 770, 34168);
        this.method3136(arg0 + 15840);
        this.field7807 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field7758 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field7779 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field7830 = true;
        this.method3103((byte) -55, true);
        this.method3106(true, true);
        this.method3074((byte) -120, true);
        if (arg0 != -7392) {
            this.method3102((class291) null, 37);
        }
        this.method3101(true, arg0 ^ -7384);
        this.method3079((byte) 122);
        this.field7569.setSwapInterval(0);
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
        this.field7817 = this.field7822 = -1;
        this.method1182();
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(B)V", line = 1074)
    private final void method3076(byte arg0) {
        ++field7561;
        if (this.field7854 == 0.0F) {
            this.field7757[10] = this.field7775;
            this.field7757[14] = this.field7760;
        } else {
            float var2 = this.field7839 / (this.field7854 + this.field7839);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field7760 * (-var2 + 1.0F) / this.field7854;
            this.field7757[10] = this.field7775 + var4;
            this.field7757[14] = this.field7760 * var3;
        }
        if (arg0 != -50) {
            this.field7860 = 0.44934914F;
        }
        this.field7850 = (this.field7757[14] - (float) this.field7829) / this.field7757[10];
        this.field7809 = (float) this.field7829 + -this.field7854;
    }

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "(IIII)V", line = 1107)
    public final void method1119(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field7786 < ~arg2) {
            this.field7786 = arg2;
        }
        if (this.field7808 > arg3) {
            this.field7808 = arg3;
        }
        ++field7689;
        if (arg0 > this.field7868) {
            this.field7868 = arg0;
        }
        if (this.field7871 < arg1) {
            this.field7871 = arg1;
        }
        OpenGL.glEnable(3089);
        this.method3105(-68);
        this.method3062(0);
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)V", line = 1136)
    public final void method278(int arg0) {
        ++field7566;
        this.method3077(109);
    }

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "()Z", line = 1146)
    public final boolean method1143() {
        ++field7673;
        return this.field7721 != null && this.field7721.method938(122);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 1154)
    public final synchronized void method1138(int arg0) {
        ++field7597;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field7748.method1043(true)) {
            class171 var12 = (class171) this.field7748.method1054((byte) -105);
            class114.field1414[var2++] = (int) var12.field7967;
            this.field7745 -= var12.field2081;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class114.field1414, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class114.field1414, 0);
            var2 = 0;
        }
        while (!this.field7749.method1043(true)) {
            class171 var11 = (class171) this.field7749.method1054((byte) -105);
            class114.field1414[var2++] = (int) var11.field7967;
            this.field7746 -= var11.field2081;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class114.field1414, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteTextures(var2, class114.field1414, 0);
            var2 = 0;
        }
        while (!this.field7750.method1043(true)) {
            class171 var10 = (class171) this.field7750.method1054((byte) -105);
            class114.field1414[var2++] = var10.field2081;
            if (~var2 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var2, class114.field1414, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class114.field1414, 0);
            var2 = 0;
        }
        while (!this.field7751.method1043(true)) {
            class171 var9 = (class171) this.field7751.method1054((byte) -105);
            class114.field1414[var2++] = (int) var9.field7967;
            this.field7744 -= var9.field2081;
            if (var2 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class114.field1414, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class114.field1414, 0);
            boolean var4 = false;
        }
        while (!this.field7747.method1043(true)) {
            class171 var8 = (class171) this.field7747.method1054((byte) -105);
            OpenGL.glDeleteLists((int) var8.field7967, var8.field2081);
        }
        while (!this.field7752.method1043(true)) {
            class544 var7 = this.field7752.method1054((byte) -105);
            OpenGL.glDeleteProgramARB((int) var7.field7967);
        }
        while (!this.field7753.method1043(true)) {
            class544 var6 = this.field7753.method1054((byte) -105);
            OpenGL.glDeleteObjectARB(var6.field7967);
        }
        while (!this.field7747.method1043(true)) {
            class171 var5 = (class171) this.field7747.method1054((byte) -105);
            OpenGL.glDeleteLists((int) var5.field7967, var5.field2081);
        }
        this.field7720.method2201((byte) -111);
        if (~this.method1127() < -100663297 && this.field7847 + 60000L < class190.method1030(false)) {
            System.gc();
            this.field7847 = class190.method1030(false);
        }
        this.field7730 = var3;
    }

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "(I)V", line = 1321)
    private final void method3077(int arg0) {
        int var2 = 64 % ((arg0 - -23) / 59);
        ++field7530;
        int var3 = 0;
        while (!this.field7569.method3024()) {
            if (var3++ > 5) {
                throw new RuntimeException("");
            }
            class462.method2688(1000L, (byte) 110);
        }
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(II)V", line = 1342)
    public final void method3078(int arg0, int arg1) {
        if (arg0 != 33984) {
            this.method1166();
        }
        ++field7545;
        if (~this.field7796 != ~arg1) {
            OpenGL.glActiveTexture(33984 - -arg1);
            this.field7796 = arg1;
        }
    }

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "()I", line = 1361)
    public final int method1127() {
        ++field7635;
        return this.field7746 + this.field7744 + this.field7745;
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(B)V", line = 1369)
    public final void method3079(byte arg0) {
        if (~this.field7837 != -1) {
            this.field7778 &= -32;
            this.field7837 = 0;
        }
        if (arg0 > 59) {
            ++field7642;
        }
    }

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "(I)V", line = 1385)
    public final void method3080(int arg0) {
        ++field7621;
        OpenGL.glPopMatrix();
        if (arg0 != 34167) {
            this.field7855 = true;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)V", line = 1397)
    public final void method1181(boolean arg0) {
        ++field7643;
        this.field7827 = arg0;
        this.method3066((byte) 82);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(BI)V", line = 1408)
    public final synchronized void method3081(byte arg0, int arg1) {
        ++field7577;
        if (arg0 == -57) {
            class544 var3 = new class544();
            var3.field7967 = (long) arg1;
            this.field7752.method1040(var3, arg0 ^ 98);
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "()Z", line = 1422)
    public final boolean method1105() {
        ++field7651;
        return false;
    }

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "(I)V", line = 1432)
    public final void method3082(int arg0) {
        ++field7536;
        if (arg0 != 34162) {
            this.field7782 = null;
        }
        if (this.field7778 != 4) {
            this.method3138(-104);
            this.method3103((byte) -55, false);
            this.method3106(true, false);
            this.method3074((byte) -6, false);
            this.method3101(false, 8);
            this.method3071(101, -2);
            this.method3058((byte) -124, 1);
            this.field7778 = 4;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLuu;)V", line = 1455)
    public final void method3083(byte arg0, class238 arg1) {
        ++field7558;
        class238 var3 = this.field7816[this.field7796];
        if (arg0 < 68) {
            this.method3133(20, 119);
        }
        if (arg1 != var3) {
            if (arg1 == null) {
                OpenGL.glDisable(var3.field2973);
            } else {
                if (var3 == null) {
                    OpenGL.glEnable(arg1.field2973);
                } else if (arg1.field2973 != var3.field2973) {
                    OpenGL.glDisable(var3.field2973);
                    OpenGL.glEnable(arg1.field2973);
                }
                OpenGL.glBindTexture(arg1.field2973, arg1.method1355(10240));
            }
            this.field7816[this.field7796] = arg1;
        }
        this.field7778 &= -2;
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(B)V", line = 1496)
    public final void method3084(byte arg0) {
        ++field7535;
        if (this.field7778 != 16) {
            this.method3114(32);
            this.method3103((byte) -55, true);
            this.method3074((byte) -102, true);
            this.method3101(true, 8);
            this.method3058((byte) -118, 1);
            this.field7778 = 16;
        }
        if (arg0 < 81) {
            this.method3126(false, -85, -17, 78);
        }
    }

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "()Z", line = 1522)
    public final boolean method1194() {
        ++field7539;
        return false;
    }

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "(IIIIII)Z", line = 1530)
    public final boolean method1102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7691;
        float var7 = (float) arg2 * this.field7762.field1409 + (float) arg0 * this.field7762.field1383 + (float) arg1 * this.field7762.field1381 + this.field7762.field1396;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field7762.field1409 + (float) arg3 * this.field7762.field1383 + (float) arg4 * this.field7762.field1381 + this.field7762.field1396;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field7833) || !(var8 < (float) this.field7833)) && (!((float) this.field7829 < var7) || !((float) this.field7829 < var8))) {
            int var9 = (int) (((float) arg2 * this.field7762.field1394 + (float) arg0 * this.field7762.field1412 + (float) arg1 * this.field7762.field1404 + this.field7762.field1389) * (float) this.field7864 / var7);
            int var10 = (int) (((float) arg5 * this.field7762.field1394 + (float) arg3 * this.field7762.field1412 + (float) arg4 * this.field7762.field1404 + this.field7762.field1389) * (float) this.field7864 / var8);
            if ((float) var9 < this.field7818 && (float) var10 < this.field7818 || this.field7803 < (float) var9 && this.field7803 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field7762.field1399 + (float) arg0 * this.field7762.field1377 + (float) arg1 * this.field7762.field1379 + this.field7762.field1392) * (float) this.field7773 / var7);
                int var12 = (int) (((float) arg5 * this.field7762.field1399 + (float) arg3 * this.field7762.field1377 + (float) arg4 * this.field7762.field1379 + this.field7762.field1392) * (float) this.field7773 / var8);
                return (!(this.field7768 > (float) var11) || !((float) var12 < this.field7768)) && (!((float) var11 > this.field7755) || !((float) var12 > this.field7755));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lmv;)V", line = 1567)
    public final void method1189(class313 arg0) {
        this.field7820 = (class208) arg0;
        ++field7541;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZF)V", line = 1579)
    public final void method3085(boolean arg0, float arg1) {
        if (this.field7813 != arg1) {
            this.field7813 = arg1;
            if (this.field7837 == 3) {
                this.method3089((byte) 75);
            }
        }
        if (!arg0) {
            this.field7786 = -66;
        }
        ++field7641;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBZLjaclib/memory/Buffer;I)Lqo;", line = 1598)
    public final class21 method3086(int arg0, byte arg1, boolean arg2, Buffer arg3, int arg4) {
        if (arg1 > -4) {
            this.method3133(80, 94);
        }
        ++field7615;
        return (class21) (!this.field7823 || arg2 && !this.field7855 ? new class357(this, arg4, arg3) : new class637(this, arg4, arg3, arg0, arg2));
    }

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "()Z", line = 1614)
    public final boolean method1169() {
        ++field7604;
        if (this.field7721 != null) {
            if (!this.field7721.method938(116)) {
                if (!this.field7722.method594((byte) -106, this.field7721)) {
                    return false;
                }
                this.field7720.method2205((byte) -85);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "()V", line = 1642)
    public final void method1158() {
        for (class544 var1 = this.field7731.method1050((byte) 73); var1 != null; var1 = this.field7731.method1047(-7962)) {
            ((class336) var1).method1893(-91);
        }
        ++field7625;
        if (this.field7722 != null) {
            this.field7722.method591((byte) -106);
        }
        if (this.field7569 != null) {
            this.method3123((byte) -96);
            Enumeration var2 = this.field7669.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field7669.get(var3);
                this.field7569.releaseSurface(var3, var4);
            }
            this.field7569.release();
            this.field7569 = null;
        }
        if (this.field7734) {
            class475.method2774(true, false, -1);
            this.field7734 = false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "ra", descriptor = "()F", line = 1688)
    public final float method1186() {
        ++field7640;
        return this.field7854;
    }

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "()Z", line = 1696)
    public final boolean method271() {
        ++field7588;
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "(I)V", line = 1711)
    public final void method3087(int arg0) {
        ++field7587;
        if (this.field7778 != 8) {
            this.method3124((byte) -64);
            this.method3103((byte) -55, true);
            this.method3074((byte) -103, true);
            this.method3101(true, 8);
            this.method3058((byte) -116, 1);
            this.field7778 = 8;
        }
        if (arg0 > -51) {
            this.method1171(-0.015678493F, 1.1727688F, -1.4083921F);
        }
    }

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "()I", line = 1732)
    public final int method1122() {
        ++field7661;
        return 4;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIII)Lmv;", line = 1741)
    public final class313 method1136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7589;
        return this.field7772 ? new class256(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "()V", line = 1750)
    public final void method1182() {
        this.field7871 = 0;
        this.field7808 = this.field7549;
        this.field7868 = 0;
        ++field7579;
        this.field7786 = this.field7568;
        OpenGL.glDisable(3089);
        this.method3105(-65);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(JI)V", line = 1775)
    public final synchronized void method3088(long arg0, int arg1) {
        ++field7680;
        class544 var4 = new class544();
        var4.field7967 = arg0;
        this.field7753.method1040(var4, arg1 + -100);
        if (arg1 != 0) {
            this.method3129(-65, 0.8013793F, 0.40748197F, -0.19910552F, 0.32502827F);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ldp;Z)Lha;", line = 1789)
    public final class52 method1101(class3 arg0, boolean arg1) {
        ++field7667;
        int[] var3 = new int[arg0.field15 * arg0.field14];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field9 != null) {
            for (int var6 = 0; ~var6 > ~arg0.field14; ++var6) {
                for (int var7 = 0; ~var7 > ~arg0.field15; ++var7) {
                    var3[var5++] = class42.method223(arg0.field13[class288.method1624(arg0.field11[var4], 255)], arg0.field9[var4] << 24);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; arg0.field14 > var8; ++var8) {
                for (int var10 = 0; ~arg0.field15 < ~var10; ++var10) {
                    int var11 = arg0.field13[arg0.field11[var4++] & 255];
                    var3[var5++] = ~var11 != -1 ? class42.method223(-16777216, var11) : 0;
                }
            }
        }
        class52 var9 = this.method1114(var3, 0, arg0.field15, arg0.field15, arg0.field14);
        var9.method297(arg0.field12, arg0.field10, arg0.field17, arg0.field16);
        return var9;
    }

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "(B)V", line = 1850)
    private final void method3089(byte arg0) {
        ++field7540;
        float var2 = (float) (-this.field7832) * this.field7813 / (float) this.field7864;
        float var3 = (float) (-this.field7792) * this.field7813 / (float) this.field7773;
        int var4 = 12 / ((arg0 - 10) / 60);
        float var5 = (float) (this.field7568 - this.field7832) * this.field7813 / (float) this.field7864;
        float var6 = (float) (-this.field7792 + this.field7549) * this.field7813 / (float) this.field7773;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var5 && var3 != var6) {
            OpenGL.glOrtho((double) var2, (double) var5, (double) (-var6), (double) (-var3), (double) ((float) this.field7833 - this.field7854), (double) ((float) this.field7829 + -this.field7854));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLkc;)V", line = 1874)
    public final void method3090(byte arg0, class113 arg1) {
        ++field7592;
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg1.method673(-19660), 0);
        if (arg0 <= 95) {
            this.method1148(43, 43, (int[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BFF)V", line = 1888)
    public final void method3091(byte arg0, float arg1, float arg2) {
        this.field7764 = arg2;
        ++field7663;
        this.field7848 = arg1;
        if (!this.field7811) {
            this.method3130((byte) 117);
        }
        if (arg0 != 105) {
            method3121(42);
        }
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)V", line = 1904)
    public final void method275(int arg0) {
        ++field7671;
        this.method3123((byte) -96);
    }

    @OriginalMember(owner = "client!mh", name = "CA", descriptor = "()I", line = 1914)
    public final int method1129() {
        ++field7700;
        return this.field7829;
    }

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "(I)V", line = 1922)
    private final void method3092(int arg0) {
        ++field7624;
        this.field7762 = new class113();
        this.field7783 = new class113();
        this.field7816 = new class238[this.field7759];
        this.field7802 = new class303(this, arg0, 6408, 1, 1);
        new class303(this, 3553, 6408, 1, 1);
        new class303(this, 3553, 6408, 1, 1);
        this.field7845 = new class242(this);
        this.field7791 = new class242(this);
        this.field7843 = new class242(this);
        this.field7793 = new class242(this);
        this.field7799 = new class242(this);
        this.field7815 = new class242(this);
        this.field7849 = new class242(this);
        this.field7787 = new class242(this);
        this.field7782 = new class242(this);
        this.field7806 = new class242(this);
        if (this.field7872) {
            this.field7836 = new class88(this);
            new class88(this);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lu;)V", line = 1958)
    public final void method1176(class64 arg0) {
        ++field7544;
        this.field7733 = ((class336) arg0).field4379;
        if (this.field7790 == null) {
            class385 var2 = new class385(80);
            if (!this.field7754) {
                var2.method2220(-62, -1.0F);
                var2.method2220(-115, -1.0F);
                var2.method2220(-68, 0.0F);
                var2.method2220(-87, 0.0F);
                var2.method2220(-117, 1.0F);
                var2.method2220(-87, 1.0F);
                var2.method2220(-117, -1.0F);
                var2.method2220(-110, 0.0F);
                var2.method2220(-54, 1.0F);
                var2.method2220(-108, 1.0F);
                var2.method2220(-111, 1.0F);
                var2.method2220(-63, 1.0F);
                var2.method2220(-66, 0.0F);
                var2.method2220(-90, 1.0F);
                var2.method2220(-109, 0.0F);
                var2.method2220(-92, -1.0F);
                var2.method2220(-72, 1.0F);
                var2.method2220(-89, 0.0F);
                var2.method2220(-57, 0.0F);
                var2.method2220(-64, 0.0F);
            } else {
                var2.method2221(-128, -1.0F);
                var2.method2221(-128, -1.0F);
                var2.method2221(-128, 0.0F);
                var2.method2221(-128, 0.0F);
                var2.method2221(-128, 1.0F);
                var2.method2221(-128, 1.0F);
                var2.method2221(-128, -1.0F);
                var2.method2221(-128, 0.0F);
                var2.method2221(-128, 1.0F);
                var2.method2221(-128, 1.0F);
                var2.method2221(-128, 1.0F);
                var2.method2221(-128, 1.0F);
                var2.method2221(-128, 0.0F);
                var2.method2221(-128, 1.0F);
                var2.method2221(-128, 0.0F);
                var2.method2221(-128, -1.0F);
                var2.method2221(-128, 1.0F);
                var2.method2221(-128, 0.0F);
                var2.method2221(-128, 0.0F);
                var2.method2221(-128, 0.0F);
            }
            this.field7790 = this.method3132(var2.field4966, 20, 1365, var2.field4929, false);
            this.field7810 = new class2(this.field7790, 5126, 3, 0);
            this.field7785 = new class2(this.field7790, 5126, 2, 12);
            this.field7725.method3234(this, (byte) -95);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZB)V", line = 2025)
    public final void method3093(boolean arg0, byte arg1) {
        int var3 = 123 % ((arg1 - 72) / 48);
        if (this.field7761 != arg0) {
            this.field7761 = arg0;
            this.method3134(1);
        }
        ++field7708;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIB)V", line = 2042)
    public final synchronized void method3094(int arg0, int arg1, byte arg2) {
        if (arg2 != -22) {
            this.method3093(true, (byte) 91);
        }
        ++field7654;
        class171 var4 = new class171(arg0);
        var4.field7967 = (long) arg1;
        this.field7748.method1040(var4, arg2 + -100);
    }

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "(F)V", line = 2056)
    public final void method1165(float arg0) {
        if (this.field7828 != arg0) {
            this.field7828 = arg0;
            this.method3115((byte) -127);
        }
        ++field7616;
    }

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "()Z", line = 2074)
    public final boolean method1173() {
        ++field7690;
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "()Z", line = 2084)
    public final boolean method1174() {
        ++field7655;
        return this.field7721 != null && (~this.field7723 >= -2 || this.field7765);
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)V", line = 2093)
    public final void method1163(int arg0) {
        ++field7703;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field7719 = arg0;
            this.field7720.method2205((byte) 81);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "(I)V", line = 2106)
    private final void method3095(int arg0) {
        ++field7565;
        OpenGL.glViewport(this.field7856, this.field7861, this.field7568, this.field7549);
        if (arg0 >= -95) {
            this.field7816 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II[I[I)Lpa;", line = 2117)
    public final class309 method1148(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field7576;
        return class509.method2923(arg0, arg2, arg1, this, arg3, (byte) -121);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II[[I[[IIII)Lsa;", line = 2133)
    public final class174 method265(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field7656;
        return new class209(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "()I", line = 2143)
    public final int method1175() {
        ++field7657;
        return this.field7833;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ltu;I)V", line = 2152)
    public final void method3096(class291 arg0, int arg1) {
        if (arg1 > -126) {
            this.field7865 = null;
        }
        ++field7619;
        if (!this.field7858) {
            if (~this.field7742 <= -4) {
                throw new RuntimeException();
            } else {
                if (~this.field7742 <= -1) {
                    this.field7740[this.field7742].method514((byte) -42);
                }
                this.field7741 = this.field7739 = this.field7740[++this.field7742] = arg0;
                this.field7741.method530(15558);
            }
        } else {
            this.method3102(arg0, -90);
            this.method3110(arg0, true);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BII)V", line = 2188)
    public final void method3097(byte arg0, int arg1, int arg2) {
        if (arg0 <= -73) {
            this.field7861 = arg2;
            this.field7856 = arg1;
            ++field7529;
            this.method3095(-98);
            this.method3062(0);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([Lr;Lm;[Lcf;I)V", line = 2202)
    public final void method273(class157[] arg0, class163 arg1, class517[] arg2, int arg3) {
        for (int var5 = 0; ~var5 > ~arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method69(arg1, arg2 != null ? arg2[var5] : null, arg3);
            }
        }
        ++field7711;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)I", line = 2224)
    public final int method1145(int arg0, int arg1) {
        ++field7622;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!mh", name = "UA", descriptor = "(IIIII)V", line = 2232)
    public final void method1130(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7627;
        this.method3117(-2);
        this.method3058((byte) -117, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIBI)V", line = 2252)
    public final void method3098(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == 14) {
            OpenGL.glTexEnvi(8960, arg1 + 34184, arg3);
            ++field7688;
            OpenGL.glTexEnvi(8960, arg1 + 34200, arg0);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "()Z", line = 2264)
    public final boolean method1100() {
        ++field7595;
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(III)V", line = 2274)
    public final void method3099(int arg0, int arg1, int arg2) {
        if (arg2 != 8) {
            this.field7802 = null;
        }
        ++field7572;
        if (~this.field7796 != -1) {
            OpenGL.glTexEnvi(8960, 34161, arg1);
            OpenGL.glTexEnvi(8960, 34162, arg0);
        } else {
            boolean var4 = false;
            if (~this.field7766 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                this.field7766 = arg1;
                var4 = true;
            }
            if (this.field7846 != arg0) {
                OpenGL.glTexEnvi(8960, 34162, arg0);
                var4 = true;
                this.field7846 = arg0;
            }
            if (var4) {
                this.field7778 &= -30;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lm;)V", line = 2316)
    public final void method1160(class163 arg0) {
        ++field7586;
        this.field7762 = (class113) arg0;
        this.field7783.method670(this.field7762, 0);
        if (this.field7837 != 1) {
            this.method3107((byte) -119);
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 2332)
    public final void method1149(Canvas arg0) {
        ++field7598;
        if (this.field7603 == arg0) {
            throw new RuntimeException();
        } else if (this.field7669.containsKey(arg0)) {
            Long var2 = (Long) this.field7669.get(arg0);
            this.field7569.releaseSurface(arg0, var2);
            this.field7669.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "(I)V", line = 2355)
    public final void method3100(int arg0) {
        if (arg0 != 5196) {
            this.field7831 = null;
        }
        if (~this.field7778 != -3) {
            this.method3138(-36);
            this.method3103((byte) -55, false);
            this.method3106(true, false);
            this.method3074((byte) -18, false);
            this.method3101(false, 8);
            this.method3071(74, -2);
            this.field7778 = 2;
        }
        ++field7525;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZI)V", line = 2376)
    public final void method3101(boolean arg0, int arg1) {
        if (!this.field7819 != !arg0) {
            this.field7819 = arg0;
            this.method3066((byte) 106);
            this.field7778 &= -32;
        }
        ++field7707;
        if (arg1 != 8) {
            this.field7789 = -22;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(IIIIII)V", line = 2394)
    public final void method1168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7580;
        this.method3117(-2);
        this.method3058((byte) -125, arg5);
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) arg3 - (float) arg1;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var7 * var9;
        float var11 = var8 * var9;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var10 + 0.35F, (float) arg3 + var11 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "(IFFFFF)V", line = 2418)
    public final void method1188(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field7724;
        boolean var7 = ~this.field7817 != ~arg0;
        if (var7 || this.field7788 != arg1 || this.field7805 != arg2) {
            this.field7817 = arg0;
            this.field7805 = arg2;
            this.field7788 = arg1;
            if (var7) {
                this.field7774 = (float) (65280 & this.field7817) / 65280.0F;
                this.field7804 = (float) (this.field7817 & 255) / 255.0F;
                this.field7860 = (float) (16711680 & this.field7817) / 1.671168E7F;
                this.method3115((byte) -113);
            }
            this.method3135(32668);
        }
        if (this.field7873[0] != arg3 || this.field7873[1] != arg4 || this.field7873[2] != arg5) {
            this.field7873[1] = arg4;
            this.field7873[2] = arg5;
            this.field7873[0] = arg3;
            this.field7831[0] = -arg3;
            this.field7831[1] = -arg4;
            this.field7831[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field7859[1] = arg4 * var8;
            this.field7859[0] = arg3 * var8;
            this.field7859[2] = arg5 * var8;
            this.field7821[2] = -this.field7859[2];
            this.field7821[0] = -this.field7859[0];
            this.field7821[1] = -this.field7859[1];
            this.method3116(true);
            this.field7800 = (int) (arg5 * 256.0F / arg4);
            this.field7826 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "()Z", line = 2467)
    public final boolean method1144() {
        ++field7648;
        return this.field7756 && (!this.method1143() || this.field7765);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Ltu;I)V", line = 2475)
    public final void method3102(class291 arg0, int arg1) {
        ++field7678;
        if (this.field7736 >= 3) {
            throw new RuntimeException();
        } else {
            if (arg1 >= -58) {
                this.field7740 = null;
            }
            if (~this.field7736 <= -1) {
                this.field7738[this.field7736].method523(-4799);
            }
            this.field7741 = this.field7738[++this.field7736] = arg0;
            this.field7741.method529(9440);
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(BZ)V", line = 2497)
    public final void method3103(byte arg0, boolean arg1) {
        if (this.field7812 == !arg1) {
            this.field7812 = arg1;
            this.method3068((byte) 29);
            this.field7778 &= -32;
        }
        if (arg0 == -55) {
            ++field7538;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(Z)V", line = 2516)
    public final void method1185(boolean arg0) {
        ++field7653;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(III)V", line = 2526)
    public final synchronized void method3104(int arg0, int arg1, int arg2) {
        if (arg1 < -58) {
            ++field7562;
            class171 var4 = new class171(arg0);
            var4.field7967 = (long) arg2;
            this.field7749.method1040(var4, -113);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)I", line = 2541)
    public final int method1128(int arg0, int arg1) {
        ++field7602;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lka;)V", line = 2550)
    public final void method1140(class400 arg0) {
        this.field7725.method3238(this, arg0, (byte) 105);
        ++field7551;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "([I)V", line = 2561)
    public final void method1183(int[] arg0) {
        arg0[0] = this.field7868;
        arg0[3] = this.field7808;
        arg0[1] = this.field7871;
        ++field7567;
        arg0[2] = this.field7786;
    }

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "(I)V", line = 2572)
    private final void method3105(int arg0) {
        this.field7803 = (float) (-this.field7832 + this.field7786);
        ++field7550;
        this.field7768 = (float) (this.field7871 - this.field7792);
        this.field7818 = (float) (this.field7868 - this.field7832);
        if (arg0 > -7) {
            this.field7806 = null;
        }
        this.field7755 = (float) (-this.field7792 + this.field7808);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZZ)V", line = 2589)
    public final void method3106(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.field7858 = false;
        }
        ++field7664;
        if (this.field7844 == !arg1) {
            this.field7844 = arg1;
            this.method3134(1);
            this.field7778 &= -8;
        }
    }

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "(B)V", line = 2610)
    private final void method3107(byte arg0) {
        OpenGL.glLoadIdentity();
        ++field7564;
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg0 > -47) {
            this.field7735 = null;
        }
        OpenGL.glMultMatrixf(this.field7762.method673(-19660), 0);
        if (this.field7811) {
            this.field7717.field5103.method3437((byte) 105);
        }
        this.method3116(true);
        this.method3073((byte) 116);
    }

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "(I)I", line = 2630)
    private final int method3108(int arg0) {
        ++field7684;
        this.field7867 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field7784 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field7867.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (~this.field7867.indexOf("brian paul") != 0 || this.field7867.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class220.method1267(var3.replace('.', ' '), ' ', (byte) 117);
        if (var4.length < 2) {
            var2 |= 4;
        } else {
            try {
                int var5 = class232.method1325(var4[0], 0);
                int var6 = class232.method1325(var4[1], 0);
                this.field7851 = var5 * 10 + var6;
            } catch (NumberFormatException var9) {
                var2 |= 4;
            }
        }
        if (~this.field7851 > -13) {
            var2 |= 2;
        }
        if (!this.field7569.method3023("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field7569.method3023("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field7759 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field7857 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field7781 = var7[0];
        if (~this.field7759 > -3 || this.field7857 < 2 || this.field7781 < 2) {
            var2 |= 16;
        }
        this.field7754 = Stream.method3340();
        this.field7569.arePbuffersAvailable();
        this.field7823 = this.field7569.method3023("GL_ARB_vertex_buffer_object");
        this.field7756 = this.field7569.method3023("GL_ARB_multisample");
        this.field7780 = this.field7569.method3023("GL_ARB_vertex_program");
        this.field7569.method3023("GL_ARB_fragment_program");
        this.field7863 = this.field7569.method3023("GL_ARB_vertex_shader");
        int var8 = 15 % ((40 - arg0) / 50);
        this.field7763 = this.field7569.method3023("GL_ARB_fragment_shader");
        this.field7770 = this.field7569.method3023("GL_EXT_texture3D");
        this.field7795 = this.field7569.method3023("GL_ARB_texture_rectangle");
        this.field7772 = this.field7569.method3023("GL_ARB_texture_cube_map");
        this.field7767 = this.field7569.method3023("GL_ARB_texture_float");
        this.field7777 = false;
        this.field7872 = this.field7569.method3023("GL_EXT_framebuffer_object");
        this.field7858 = this.field7569.method3023("GL_EXT_framebuffer_blit");
        this.field7825 = this.field7569.method3023("GL_EXT_framebuffer_multisample");
        this.field7765 = this.field7858 & this.field7825;
        OpenGL.glGetFloatv(2834, class126.field1548, 0);
        this.field7869 = class126.field1548[1];
        this.field7838 = class126.field1548[0];
        return var2 != 0 ? var2 : 0;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 2718)
    public final void method1187(Canvas arg0) {
        ++field7660;
        if (this.field7603 == arg0) {
            throw new RuntimeException();
        } else if (!this.field7669.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field7569.prepareSurface(arg0);
                if (var4 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field7669.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "(I)V", line = 2753)
    public final void method1156(int arg0) {
        ++field7713;
        this.method3058((byte) -119, 0);
        OpenGL.glClearColor((float) (arg0 & 16711680) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLtu;)V", line = 2767)
    public final void method3109(byte arg0, class291 arg1) {
        ++field7571;
        if (this.field7858) {
            this.method3113(arg0 + 46, arg1);
            this.method3127(arg1, 109);
        } else {
            if (this.field7742 < 0 || this.field7740[this.field7742] != arg1) {
                throw new RuntimeException();
            }
            this.field7740[this.field7742--] = null;
            arg1.method514((byte) -42);
            if (this.field7742 < 0) {
                this.field7741 = this.field7739 = null;
            } else {
                this.field7741 = this.field7739 = this.field7740[this.field7742];
                this.field7741.method530(15558);
            }
        }
        if (arg0 != -108) {
            this.field7800 = 79;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V", line = 2801)
    public final void method272(int arg0) {
        ++field7633;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "(III)V", line = 2813)
    public final void method1120(int arg0, int arg1, int arg2) {
        ++field7560;
        if (~this.field7822 != ~arg0 || ~this.field7794 != ~arg1 || this.field7769 != arg2) {
            this.field7794 = arg1;
            this.field7822 = arg0;
            this.field7769 = arg2;
            if (this.field7811) {
                return;
            }
            this.method3130((byte) 124);
            this.method3068((byte) 79);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 2836)
    public final void method268(Canvas arg0) {
        ++field7600;
        long var2 = 0L;
        if (arg0 != null && this.field7603 != arg0) {
            if (this.field7669.containsKey(arg0)) {
                Long var4 = (Long) this.field7669.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field7674;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field7569.surfaceResized(var2);
            if (this.field7699 == arg0) {
                this.method3060(35);
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[Lcba;)V", line = 2867)
    public final void method1193(int arg0, class469[] arg1) {
        for (int var3 = 0; ~var3 > ~arg0; ++var3) {
            this.field7834[var3] = arg1[var3];
        }
        ++field7585;
        this.field7789 = arg0;
        if (~this.field7837 != -2) {
            this.method3073((byte) 118);
        }
    }

    @OriginalMember(owner = "client!mh", name = "xa", descriptor = "()V", line = 2888)
    public final void method1146() {
        this.field7811 = false;
        ++field7709;
        this.field7717.method2231(0, (byte) -101, false, 0, 0, false);
        this.method3130((byte) 108);
        this.method3068((byte) 14);
    }

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "(ILpa;II)V", line = 2902)
    public final void method1180(int arg0, class309 arg1, int arg2, int arg3) {
        ++field7528;
        class33 var5 = (class33) arg1;
        class632 var6 = var5.field257;
        this.method3100(5196);
        this.method3083((byte) 90, var5.field257);
        this.method3058((byte) -128, 1);
        this.method3099(8448, 7681, 8);
        this.method3126(false, 0, 768, 34167);
        float var7 = var6.field9100 / (float) var6.field9109;
        float var8 = var6.field9101 / (float) var6.field9099;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7868) * var7, (float) (-arg3 + this.field7871) * var8);
        OpenGL.glVertex2i(this.field7868, this.field7871);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7868) * var7, (float) (-arg3 + this.field7808) * var8);
        OpenGL.glVertex2i(this.field7868, this.field7808);
        OpenGL.glTexCoord2f((float) (this.field7786 - arg2) * var7, (float) (-arg3 + this.field7808) * var8);
        OpenGL.glVertex2i(this.field7786, this.field7808);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7786) * var7, (float) (-arg3 + this.field7871) * var8);
        OpenGL.glVertex2i(this.field7786, this.field7871);
        OpenGL.glEnd();
        this.method3126(false, 0, 768, 5890);
    }

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "(I)V", line = 2937)
    public final void method1121(int arg0) {
        this.field7732 = 0;
        ++field7695;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field7732;
        }
        this.field7729 = 1 << this.field7732;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIII)V", line = 2953)
    public final void method1132(int arg0, int arg1, int arg2, int arg3) {
        this.field7722.method588(arg0, arg3, arg1, arg2, 21724);
        ++field7636;
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "()V", line = 2963)
    public final void method1117() {
        ++field7670;
        this.field7722.method590((byte) -59);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lei;IIII)Lr;", line = 2973)
    public final class157 method277(class152 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7552;
        return new class242(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ltu;Z)V", line = 2982)
    public final void method3110(class291 arg0, boolean arg1) {
        ++field7601;
        if (this.field7743 >= 3) {
            throw new RuntimeException();
        } else if (arg1) {
            if (~this.field7743 <= -1) {
                this.field7737[this.field7743].method513((byte) -42);
            }
            this.field7739 = this.field7737[++this.field7743] = arg0;
            this.field7739.method511(12890);
        }
    }

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "(I)Lkh;", line = 3001)
    public final class15 method3111(int arg0) {
        int var2 = -76 % ((arg0 - -32) / 48);
        ++field7610;
        return this.field7820 == null ? null : this.field7820.method1201((byte) 51);
    }

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "(I)V", line = 3011)
    public final void method3112(int arg0) {
        ++field7647;
        OpenGL.glPushMatrix();
        if (arg0 < 81) {
            this.method3080(-18);
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;I)V", line = 3022)
    public class537(Canvas arg0, class17 arg1, int arg2) {
        super(arg1);
        new class369();
        new class451(16);
        this.field7747 = new class193();
        this.field7748 = new class193();
        this.field7749 = new class193();
        this.field7750 = new class193();
        this.field7751 = new class193();
        this.field7752 = new class193();
        this.field7753 = new class193();
        this.field7757 = new float[16];
        this.field7773 = 512;
        this.field7792 = 0;
        this.field7805 = -1.0F;
        this.field7764 = 0.0F;
        this.field7808 = 0;
        this.field7809 = 3584.0F;
        this.field7769 = 0;
        this.field7786 = 0;
        this.field7834 = new class469[class530.field7449];
        this.field7831 = new float[4];
        this.field7829 = 3584;
        this.field7832 = 0;
        this.field7821 = new float[4];
        this.field7827 = true;
        this.field7804 = 1.0F;
        this.field7798 = -1;
        this.field7766 = 8448;
        this.field7840 = -1;
        this.field7813 = 1.0F;
        this.field7846 = 8448;
        this.field7853 = 0;
        this.field7838 = -1.0F;
        this.field7839 = 3000.0F;
        this.field7822 = -1;
        this.field7794 = -1;
        this.field7788 = -1.0F;
        this.field7861 = 0;
        this.field7848 = 1.0F;
        this.field7860 = 1.0F;
        this.field7856 = 0;
        this.field7774 = 1.0F;
        this.field7864 = 512;
        this.field7833 = 50;
        this.field7817 = -1;
        this.field7868 = 0;
        this.field7859 = new float[4];
        this.field7869 = -1.0F;
        this.field7871 = 0;
        this.field7873 = new float[4];
        this.field7850 = 3584.0F;
        this.field7852 = new class385(8192);
        this.field7875 = new int[1];
        this.field7874 = new int[1];
        this.field7877 = new byte[16384];
        this.field7879 = new int[1];
        this.field7699 = this.field7603 = arg0;
        this.field7723 = arg2;
        if (!class136.method757(0, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class136.method757(0, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field7569 = new OpenGL();
                this.field7682 = this.field7674 = this.field7569.init(arg0, 8, 8, 8, 24, 0, this.field7723);
                if (this.field7674 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method3077(50);
                    int var4 = this.method3108(-49);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field7776 = this.field7754 ? 33639 : 5121;
                        if (this.field7784.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class220.method1267(this.field7784.replace('/', ' '), ' ', (byte) -108);
                            for (int var9 = 0; var8.length > var9; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (var10.charAt(0) == 'x' && var10.length() >= 3 && class398.method2284((byte) 119, var10.substring(1, 3))) {
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
                                            if (var10.length() >= 4 && class398.method2284((byte) 72, var10.substring(0, 4))) {
                                                var5 = class232.method1325(var10.substring(0, 4), 0);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var16) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && ~var5 >= -9251) {
                                    this.field7770 = false;
                                }
                                if (var5 >= 7000 && ~var5 >= -8000) {
                                    this.field7823 = false;
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field7767 = false;
                            }
                            this.field7795 &= this.field7569.method3023("GL_ARB_half_float_pixel");
                            this.field7855 = this.field7823;
                            this.field7814 = true;
                        }
                        if (this.field7867.indexOf("intel") != -1) {
                            this.field7872 = false;
                        }
                        this.field7824 = !this.field7867.equals("s3 graphics");
                        if (this.field7823) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var14) {
                                throw new RuntimeException("");
                            }
                        }
                        class355.method1997(false, (byte) -79, true);
                        this.field7734 = true;
                        this.field7720 = new class380(this, super.field2481);
                        this.method3092(3553);
                        this.field7735 = new class583(this);
                        this.field7722 = new class95(this);
                        if (this.field7722.method587((byte) 56)) {
                            this.field7721 = new class376(this);
                            if (!this.field7721.method2192(28764)) {
                                this.field7721.method932(false);
                                this.field7721 = null;
                            }
                        }
                        this.field7717 = new class387(this);
                        this.method3075(-7392);
                        this.method3060(118);
                        OpenGL.glClear(16640);
                        int var12 = 0;
                        while (true) {
                            try {
                                this.field7569.swapBuffers();
                                break;
                            } catch (Exception var15) {
                                if (~(var12++) < -6) {
                                    throw new RuntimeException("");
                                }
                                class462.method2688(100L, (byte) 110);
                            }
                        }
                        OpenGL.glClear(16384);
                    }
                }
            } catch (Throwable var17) {
                var17.printStackTrace();
                this.method1158();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILtu;)V", line = 3189)
    public final void method3113(int arg0, class291 arg1) {
        ++field7687;
        if (~this.field7736 <= -1 && this.field7738[this.field7736] == arg1) {
            if (arg0 >= -53) {
                this.method3085(true, 1.6670703F);
            }
            this.field7738[this.field7736--] = null;
            arg1.method523(-4799);
            if (~this.field7736 > -1) {
                this.field7741 = null;
            } else {
                this.field7741 = this.field7738[this.field7736];
                this.field7741.method529(9440);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "(I)V", line = 3212)
    private final void method3114(int arg0) {
        if (~this.field7837 != -4) {
            this.field7837 = 3;
            this.method3089((byte) 92);
            this.method3107((byte) -115);
            this.field7778 &= -8;
        }
        if (arg0 != 32) {
            this.method3102((class291) null, 21);
        }
        ++field7606;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 3231)
    public final void method274(Canvas arg0) {
        this.field7699 = null;
        this.field7682 = 0L;
        ++field7531;
        if (arg0 != null && this.field7603 != arg0) {
            if (this.field7669.containsKey(arg0)) {
                Long var2 = (Long) this.field7669.get(arg0);
                this.field7682 = var2;
                this.field7699 = arg0;
            }
        } else {
            this.field7682 = this.field7674;
            this.field7699 = this.field7603;
        }
        if (this.field7699 != null && ~this.field7682 != -1L) {
            this.field7569.setSurface(this.field7682);
            this.method3060(-100);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "(B)V", line = 3260)
    private final void method3115(byte arg0) {
        class126.field1548[0] = this.field7860 * this.field7828;
        ++field7629;
        int var2 = 44 % ((-26 - arg0) / 61);
        class126.field1548[2] = this.field7828 * this.field7804;
        class126.field1548[1] = this.field7828 * this.field7774;
        class126.field1548[3] = 1.0F;
        OpenGL.glLightModelfv(2899, class126.field1548, 0);
    }

    @OriginalMember(owner = "client!mh", name = "ta", descriptor = "(II)V", line = 3274)
    public final void method1184(int arg0, int arg1) {
        if (this.field7833 != arg0 || ~this.field7829 != ~arg1) {
            this.field7829 = arg1;
            this.field7833 = arg0;
            this.method3070(-106);
            this.method3130((byte) 122);
            if (this.field7837 == 3) {
                this.method3089((byte) 111);
            } else if (~this.field7837 == -3) {
                this.method3072(-31343);
            }
        }
        ++field7547;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(Z)V", line = 3300)
    public final void method3116(boolean arg0) {
        if (!arg0) {
            this.method1143();
        }
        OpenGL.glLightfv(16384, 4611, this.field7859, 0);
        ++field7665;
        OpenGL.glLightfv(16385, 4611, this.field7821, 0);
    }

    @OriginalMember(owner = "client!mh", name = "za", descriptor = "(IIIIII[BII)V", line = 3313)
    public final void method1125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field7527;
        float var10;
        float var11;
        if (this.field7865 != null && ~this.field7865.field3869 <= ~arg2 && ~this.field7865.field3862 <= ~arg3) {
            this.field7865.method1673(false, 6406, arg6, 0, arg3, 0, 0, arg2, false, 0);
            var10 = (float) arg2 * this.field7865.field9100 / (float) this.field7865.field3869;
            var11 = (float) arg3 * this.field7865.field9101 / (float) this.field7865.field3862;
        } else {
            this.field7865 = class638.method3658((byte) -106, 6406, this, arg3, false, 6406, arg6, arg2);
            this.field7865.method1671((byte) -46, false, false);
            var11 = this.field7865.field9101;
            var10 = this.field7865.field9100;
        }
        this.method3100(5196);
        this.method3083((byte) 97, this.field7865);
        this.method3058((byte) -124, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method3059(65280, arg5);
        this.method3099(34165, 34165, 8);
        this.method3126(false, 0, 768, 34166);
        this.method3126(false, 2, 770, 5890);
        this.method3098(770, 0, (byte) 14, 34166);
        this.method3098(770, 2, (byte) 14, 5890);
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
        this.method3126(false, 0, 768, 5890);
        this.method3126(false, 2, 770, 34166);
        this.method3098(770, 0, (byte) 14, 5890);
        this.method3098(770, 2, (byte) 14, 34166);
    }

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "(I)V", line = 3372)
    private final void method3117(int arg0) {
        ++field7646;
        if (~this.field7778 != arg0) {
            this.method3138(-51);
            this.method3103((byte) -55, false);
            this.method3106(true, false);
            this.method3074((byte) -56, false);
            this.method3101(false, 8);
            this.method3083((byte) 78, (class238) null);
            this.method3071(55, -2);
            this.method3063(1, (byte) -107);
            this.field7778 = 1;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lkc;I)V", line = 3395)
    public final void method3118(class113 arg0, int arg1) {
        if (arg1 == -25810) {
            ++field7712;
            OpenGL.glLoadMatrixf(arg0.method673(arg1 ^ 10266), 0);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(FFFI)V", line = 3406)
    private final void method3119(float arg0, float arg1, float arg2, int arg3) {
        ++field7534;
        OpenGL.glMatrixMode(arg3);
        if (this.field7801) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg2, arg0, arg1);
        OpenGL.glMatrixMode(5888);
        this.field7801 = true;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIILwj;I)V", line = 3421)
    public final void method3120(int arg0, int arg1, int arg2, class332 arg3, int arg4) {
        if (arg0 != -5727) {
            this.field7740 = null;
        }
        ++field7542;
        int var6 = arg3.method1863(-22966);
        int var7 = arg4 * this.method3064(var6, -1);
        this.method3125((byte) 89, arg3);
        OpenGL.glDrawElements(arg2, arg1, var6, (long) var7 + arg3.method1864(-12077));
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "()Z", line = 3439)
    public final boolean method1104() {
        ++field7686;
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "(I)V", line = 3447)
    public static void method3121(int arg0) {
        field7706 = null;
        field7631 = null;
        field7714 = null;
        field7555 = null;
        if (arg0 == 1) {
            field7726 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "()Lm;", line = 3467)
    public final class163 method1126() {
        ++field7704;
        return this.field7727;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IB)V", line = 3479)
    public final synchronized void method3122(int arg0, byte arg1) {
        if (arg1 != 91) {
            this.field7879 = null;
        }
        ++field7715;
        class171 var3 = new class171(arg0);
        this.field7750.method1040(var3, -96);
    }

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "()Lfd;", line = 3492)
    public final class448 method1172() {
        ++field7554;
        int var1 = -1;
        if (this.field7867.indexOf("nvidia") != -1) {
            var1 = 4318;
        } else if (~this.field7867.indexOf("intel") != 0) {
            var1 = 32902;
        } else if (this.field7867.indexOf("ati") != -1) {
            var1 = 4098;
        }
        return new class448(var1, "OpenGL", this.field7851, this.field7784, 0L);
    }

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "()Z", line = 3514)
    public final boolean method1141() {
        ++field7524;
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "()Z", line = 3522)
    public final boolean method1190() {
        ++field7556;
        return this.field7717.method2228(-31210, 3);
    }

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "()V", line = 3531)
    public final void method1192() {
        ++field7543;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "(IIII)V", line = 3541)
    public final void method1164(int arg0, int arg1, int arg2, int arg3) {
        ++field7638;
        this.field7835 = arg0;
        this.field7853 = arg3;
        this.field7811 = true;
        this.field7798 = arg1;
        this.field7840 = arg2;
        this.field7717.method2231(0, (byte) -101, false, 3, 0, false);
        this.field7717.field5103.method3437((byte) -108);
        this.method3130((byte) 122);
        this.method3068((byte) 70);
    }

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "()V", line = 3563)
    public final void method1123() {
        try {
            this.field7569.swapBuffers();
        } catch (Exception var1) {
        }
        ++field7613;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIIIIII)V", line = 3581)
    public final void method264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method3117(-2);
        ++field7676;
        this.method3058((byte) -127, arg9);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIII)V", line = 3600)
    public final void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field7630;
        this.method1168(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lfc;[Ldp;Z)Lra;", line = 3614)
    public final class90 method1153(class216 arg0, class3[] arg1, boolean arg2) {
        ++field7623;
        return new class581(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "(B)V", line = 3625)
    private final void method3123(byte arg0) {
        this.field7569.method3022();
        if (arg0 != -96) {
            this.field7866 = 1.2183794F;
        }
        ++field7626;
    }

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "(B)V", line = 3637)
    private final void method3124(byte arg0) {
        if (this.field7837 != 2) {
            this.field7837 = 2;
            this.method3072(-31343);
            this.method3107((byte) -72);
            this.field7778 &= -8;
        }
        ++field7632;
        if (arg0 > -59) {
            this.field7674 = -122L;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLwj;)V", line = 3657)
    public final void method3125(byte arg0, class332 arg1) {
        if (arg0 != 89) {
            this.method264(-125, -94, 49, -80, -35, -125, -82, 86, 113, -23);
        }
        ++field7596;
        if (this.field7797 != arg1) {
            if (this.field7823) {
                OpenGL.glBindBufferARB(34963, arg1.method1861(23554));
            }
            this.field7797 = arg1;
        }
    }

    @OriginalMember(owner = "client!mh", name = "ba", descriptor = "()I", line = 3677)
    public final int method1147() {
        ++field7677;
        int var1 = this.field7878;
        this.field7878 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(ZIII)V", line = 3688)
    public final void method3126(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            this.field7803 = 1.2862183F;
        }
        ++field7593;
        OpenGL.glTexEnvi(8960, arg1 + 34176, arg3);
        OpenGL.glTexEnvi(8960, arg1 + 34192, arg2);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([Lr;Lka;Lm;[Lcf;I)V", line = 3701)
    public final void method270(class157[] arg0, class400 arg1, class163 arg2, class517[] arg3, int arg4) {
        this.method273(arg0, arg2, arg3, arg4);
        ++field7685;
        this.method1140(arg1);
    }

    @OriginalMember(owner = "client!mh", name = "YA", descriptor = "()I", line = 3712)
    public final int method1157() {
        ++field7537;
        int var1 = this.field7876;
        this.field7876 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "()V", line = 3724)
    public final void method1166() {
        ++field7618;
        this.method3101(true, 8);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(Ltu;I)V", line = 3736)
    public final void method3127(class291 arg0, int arg1) {
        ++field7533;
        if (~this.field7743 <= -1 && this.field7737[this.field7743] == arg0) {
            if (arg1 > 82) {
                this.field7737[this.field7743--] = null;
                arg0.method513((byte) -42);
                if (this.field7743 >= 0) {
                    this.field7739 = this.field7737[this.field7743];
                    this.field7739.method511(12890);
                } else {
                    this.field7739 = null;
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(IB)I", line = 3765)
    public final int method3128(int arg0, byte arg1) {
        ++field7559;
        if (~arg0 != -6407 && arg0 != 6409) {
            if (arg0 != 6410 && arg0 != 34846 && arg0 != 34844) {
                if (~arg0 != -6408) {
                    if (arg0 != 6408 && arg0 != 34847) {
                        if (~arg0 == -34844) {
                            return 6;
                        } else if (arg0 != 34842) {
                            if (arg0 != 6402) {
                                if (arg0 == 6401) {
                                    return 1;
                                } else {
                                    if (arg1 != 10) {
                                        this.field7865 = null;
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

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IFFFF)V", line = 3807)
    public final void method3129(int arg0, float arg1, float arg2, float arg3, float arg4) {
        class126.field1548[0] = arg2;
        class126.field1548[1] = arg4;
        class126.field1548[3] = arg1;
        class126.field1548[2] = arg3;
        ++field7637;
        OpenGL.glTexEnvfv(8960, arg0, class126.field1548, 0);
    }

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "(IIII)[I", line = 3819)
    public final int[] method1111(int arg0, int arg1, int arg2, int arg3) {
        ++field7679;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + -var6 + this.field7549, arg2, 1, 32993, this.field7776, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(IIIII)V", line = 3844)
    public final void method1110(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method3117(-2);
        ++field7594;
        this.method3058((byte) -126, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "(B)V", line = 3868)
    private final void method3130(byte arg0) {
        ++field7590;
        int var2;
        if (this.field7811) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field7798;
        } else {
            this.field7866 = (float) (-this.field7769 + this.field7829) - this.field7764;
            this.field7842 = this.field7866 - (float) this.field7794 * this.field7848;
            if (this.field7842 < (float) this.field7833) {
                this.field7842 = (float) this.field7833;
            }
            OpenGL.glFogf(2915, this.field7842);
            OpenGL.glFogf(2916, this.field7866);
            var2 = this.field7822;
        }
        if (arg0 <= 103) {
            this.field7795 = false;
        }
        class126.field1548[1] = (float) class288.method1624(65280, var2) / 65280.0F;
        class126.field1548[2] = (float) class288.method1624(255, var2) / 255.0F;
        class126.field1548[0] = (float) class288.method1624(16711680, var2) / 1.671168E7F;
        OpenGL.glFogfv(2918, class126.field1548, 0);
        if (this.field7811) {
            this.field7717.field5103.method3436(false);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lro;Lro;BLro;Lro;)V", line = 3906)
    public final void method3131(class2 arg0, class2 arg1, byte arg2, class2 arg3, class2 arg4) {
        if (arg3 != null) {
            this.method3057(arg3.field2, 10);
            OpenGL.glVertexPointer(arg3.field6, arg3.field4, this.field7862.method137((byte) 127), this.field7862.method135(-29959) - -((long) arg3.field3));
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        ++field7532;
        if (arg4 != null) {
            this.method3057(arg4.field2, 57);
            OpenGL.glNormalPointer(arg4.field4, this.field7862.method137((byte) 104), this.field7862.method135(-29959) - -((long) arg4.field3));
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg2 > -103) {
            this.field7751 = null;
        }
        if (arg1 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method3057(arg1.field2, 38);
            OpenGL.glColorPointer(arg1.field6, arg1.field4, this.field7862.method137((byte) 82), this.field7862.method135(-29959) - -((long) arg1.field3));
            OpenGL.glEnableClientState(32886);
        }
        if (arg0 != null) {
            this.method3057(arg0.field2, 67);
            OpenGL.glTexCoordPointer(arg0.field6, arg0.field4, this.field7862.method137((byte) 93), this.field7862.method135(-29959) + (long) arg0.field3);
            OpenGL.glEnableClientState(32888);
        } else {
            OpenGL.glDisableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III[BZ)Lqo;", line = 3955)
    public final class21 method3132(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4) {
        ++field7612;
        if (!this.field7823 || arg4 && !this.field7855) {
            if (arg2 != 1365) {
                this.method1107(-102, -115, -78, 30);
            }
            return new class357(this, arg1, arg3, arg0);
        } else {
            return new class637(this, arg1, arg3, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(II)I", line = 3973)
    public final int method3133(int arg0, int arg1) {
        ++field7659;
        if (arg1 != 3790) {
            this.method1107(-79, 110, -8, 107);
        }
        if (arg0 != 1) {
            if (~arg0 != -1) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        return 260;
                    } else if (~arg0 == -5) {
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

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 4005)
    public final void method1139(Rectangle[] arg0, int arg1) {
        ++field7609;
        this.method1123();
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIII)V", line = 4014)
    public final void method1179(int arg0, int arg1, int arg2, int arg3) {
        this.field7832 = arg0;
        this.field7773 = arg3;
        ++field7553;
        this.field7792 = arg1;
        this.field7864 = arg2;
        this.method3070(-120);
        this.method3105(-127);
        if (~this.field7837 != -4) {
            if (this.field7837 == 2) {
                this.method3072(-31343);
                return;
            }
        } else {
            this.method3089((byte) -82);
        }
    }

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "(I)V", line = 4036)
    private final void method3134(int arg0) {
        if (arg0 != 1) {
            this.method1124(-107, -111, 19, 78, 53);
        }
        ++field7591;
        if (this.field7844 && !this.field7761) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([IIIII)Lha;", line = 4054)
    public final class52 method1114(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7652;
        return new class162(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "(I)V", line = 4067)
    private final void method3135(int arg0) {
        ++field7575;
        class126.field1548[2] = this.field7804 * this.field7788;
        class126.field1548[3] = 1.0F;
        if (arg0 != 32668) {
            this.method271();
        }
        class126.field1548[1] = this.field7788 * this.field7774;
        class126.field1548[0] = this.field7860 * this.field7788;
        OpenGL.glLightfv(16384, 4609, class126.field1548, 0);
        class126.field1548[0] = -this.field7805 * this.field7860;
        class126.field1548[3] = 1.0F;
        class126.field1548[2] = -this.field7805 * this.field7804;
        class126.field1548[1] = -this.field7805 * this.field7774;
        OpenGL.glLightfv(16385, 4609, class126.field1548, 0);
    }

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "(I)V", line = 4087)
    private final void method3136(int arg0) {
        ++field7666;
        if (this.field7801) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field7801 = false;
        }
        if (arg0 != 8448) {
            this.method1168(74, -3, -80, -103, -14, -49);
        }
    }

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "()Z", line = 4110)
    public final boolean method1135() {
        ++field7681;
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIF)Lcba;", line = 4121)
    public final class469 method1134(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field7614;
        return new class596(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([BIIZI)Lwj;", line = 4129)
    public final class332 method3137(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field7650;
        if (!this.field7823 || arg3 && !this.field7855) {
            if (arg2 > -15) {
                this.field7759 = -47;
            }
            return new class482(this, arg1, arg0, arg4);
        } else {
            return new class516(this, arg1, arg0, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "()Z", line = 4147)
    public final boolean method1155() {
        ++field7696;
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V", line = 4159)
    public final void method1116(boolean arg0) {
        ++field7649;
    }

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "(I)V", line = 4170)
    private final void method3138(int arg0) {
        if (arg0 <= -5) {
            if (this.field7837 != 1) {
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadIdentity();
                if (this.field7568 > 0 && this.field7549 > 0) {
                    OpenGL.glOrtho(0.0D, (double) this.field7568, (double) this.field7549, 0.0D, -1.0D, 1.0D);
                }
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadIdentity();
                this.field7837 = 1;
                this.field7778 &= -25;
            }
            ++field7644;
        }
    }
}
