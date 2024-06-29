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

@OriginalClass("client!jaa")
public class class576 extends class650 {

    @OriginalMember(owner = "client!jaa", name = "wd", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field7545 = new Hashtable();

    @OriginalMember(owner = "client!jaa", name = "Yd", descriptor = "I")
    public int field7573 = 128;

    @OriginalMember(owner = "client!jaa", name = "he", descriptor = "Lpt;")
    private class496 field7582 = new class496();

    @OriginalMember(owner = "client!jaa", name = "le", descriptor = "Lkl;")
    private class73 field7586 = new class73();

    @OriginalMember(owner = "client!jaa", name = "me", descriptor = "Lkl;")
    public class73 field7587 = new class73();

    @OriginalMember(owner = "client!jaa", name = "oe", descriptor = "I")
    public int field7589 = 8;

    @OriginalMember(owner = "client!jaa", name = "te", descriptor = "Z")
    private boolean field7594 = false;

    @OriginalMember(owner = "client!jaa", name = "re", descriptor = "I")
    public int field7592 = 3;

    @OriginalMember(owner = "client!jaa", name = "pe", descriptor = "Lws;")
    private class333 field7590 = new class333();

    @OriginalMember(owner = "client!jaa", name = "Ae", descriptor = "I")
    private int field7601 = -1;

    @OriginalMember(owner = "client!jaa", name = "xe", descriptor = "[Lqh;")
    private class63[] field7598 = new class63[4];

    @OriginalMember(owner = "client!jaa", name = "Ce", descriptor = "I")
    private int field7603 = -1;

    @OriginalMember(owner = "client!jaa", name = "Ee", descriptor = "[Lqh;")
    private class63[] field7605 = new class63[4];

    @OriginalMember(owner = "client!jaa", name = "De", descriptor = "[Lqh;")
    private class63[] field7604 = new class63[4];

    @OriginalMember(owner = "client!jaa", name = "Fe", descriptor = "I")
    private int field7606 = -1;

    @OriginalMember(owner = "client!jaa", name = "Ge", descriptor = "Lkp;")
    private class456 field7607 = new class456();

    @OriginalMember(owner = "client!jaa", name = "He", descriptor = "Lhd;")
    private class694 field7608 = new class694(16);

    @OriginalMember(owner = "client!jaa", name = "Je", descriptor = "Lws;")
    private class333 field7610 = new class333();

    @OriginalMember(owner = "client!jaa", name = "Ne", descriptor = "Lws;")
    private class333 field7614 = new class333();

    @OriginalMember(owner = "client!jaa", name = "Oe", descriptor = "Lws;")
    private class333 field7615 = new class333();

    @OriginalMember(owner = "client!jaa", name = "Pe", descriptor = "Lws;")
    private class333 field7616 = new class333();

    @OriginalMember(owner = "client!jaa", name = "Qe", descriptor = "Lws;")
    private class333 field7617 = new class333();

    @OriginalMember(owner = "client!jaa", name = "Re", descriptor = "Lws;")
    private class333 field7618 = new class333();

    @OriginalMember(owner = "client!jaa", name = "Se", descriptor = "Lws;")
    private class333 field7619 = new class333();

    @OriginalMember(owner = "client!jaa", name = "Te", descriptor = "I")
    private int field7620 = 0;

    @OriginalMember(owner = "client!jaa", name = "Xe", descriptor = "[F")
    public float[] field7624 = new float[4];

    @OriginalMember(owner = "client!jaa", name = "jf", descriptor = "F")
    private float field7635 = 1.0F;

    @OriginalMember(owner = "client!jaa", name = "Jf", descriptor = "I")
    private int field7661 = 0;

    @OriginalMember(owner = "client!jaa", name = "Rf", descriptor = "[Lbj;")
    private class227[] field7669 = new class227[class204.field2366];

    @OriginalMember(owner = "client!jaa", name = "Gf", descriptor = "I")
    public int field7658 = 0;

    @OriginalMember(owner = "client!jaa", name = "lf", descriptor = "I")
    public int field7637 = -1;

    @OriginalMember(owner = "client!jaa", name = "cg", descriptor = "[F")
    private float[] field7680 = new float[4];

    @OriginalMember(owner = "client!jaa", name = "Ue", descriptor = "I")
    public int field7621 = 512;

    @OriginalMember(owner = "client!jaa", name = "fg", descriptor = "I")
    private int field7683 = 0;

    @OriginalMember(owner = "client!jaa", name = "of", descriptor = "F")
    private float field7640 = -1.0F;

    @OriginalMember(owner = "client!jaa", name = "uf", descriptor = "I")
    public int field7646 = 3584;

    @OriginalMember(owner = "client!jaa", name = "og", descriptor = "F")
    public float field7692 = 3584.0F;

    @OriginalMember(owner = "client!jaa", name = "Mf", descriptor = "I")
    public int field7664 = -1;

    @OriginalMember(owner = "client!jaa", name = "tg", descriptor = "I")
    public int field7697 = 0;

    @OriginalMember(owner = "client!jaa", name = "mf", descriptor = "I")
    public int field7638 = 0;

    @OriginalMember(owner = "client!jaa", name = "Kg", descriptor = "F")
    private float field7714 = -1.0F;

    @OriginalMember(owner = "client!jaa", name = "Hg", descriptor = "F")
    public float field7711 = 1.0F;

    @OriginalMember(owner = "client!jaa", name = "Tf", descriptor = "F")
    private float field7671 = 1.0F;

    @OriginalMember(owner = "client!jaa", name = "ug", descriptor = "I")
    private int field7698 = -1;

    @OriginalMember(owner = "client!jaa", name = "eg", descriptor = "F")
    public float field7682 = 3584.0F;

    @OriginalMember(owner = "client!jaa", name = "Vg", descriptor = "I")
    private int field7725 = 8448;

    @OriginalMember(owner = "client!jaa", name = "dg", descriptor = "[F")
    private float[] field7681 = new float[16];

    @OriginalMember(owner = "client!jaa", name = "hg", descriptor = "I")
    private int field7685 = 0;

    @OriginalMember(owner = "client!jaa", name = "wg", descriptor = "I")
    private int field7700 = 0;

    @OriginalMember(owner = "client!jaa", name = "gf", descriptor = "I")
    public int field7633 = 512;

    @OriginalMember(owner = "client!jaa", name = "yf", descriptor = "F")
    public float field7650 = 1.0F;

    @OriginalMember(owner = "client!jaa", name = "xg", descriptor = "I")
    public int field7701 = -1;

    @OriginalMember(owner = "client!jaa", name = "Dg", descriptor = "Z")
    private boolean field7707 = true;

    @OriginalMember(owner = "client!jaa", name = "sg", descriptor = "I")
    public int field7696 = 50;

    @OriginalMember(owner = "client!jaa", name = "Zg", descriptor = "F")
    public float field7729 = -1.0F;

    @OriginalMember(owner = "client!jaa", name = "Lf", descriptor = "I")
    private int field7663 = 0;

    @OriginalMember(owner = "client!jaa", name = "Bf", descriptor = "F")
    private float field7653 = 3000.0F;

    @OriginalMember(owner = "client!jaa", name = "Yg", descriptor = "F")
    public float field7728 = -1.0F;

    @OriginalMember(owner = "client!jaa", name = "dh", descriptor = "F")
    public float field7733 = 1.0F;

    @OriginalMember(owner = "client!jaa", name = "ag", descriptor = "I")
    private int field7678 = -1;

    @OriginalMember(owner = "client!jaa", name = "hh", descriptor = "F")
    private float field7737 = 0.0F;

    @OriginalMember(owner = "client!jaa", name = "gh", descriptor = "[F")
    private float[] field7736 = new float[4];

    @OriginalMember(owner = "client!jaa", name = "kh", descriptor = "I")
    private int field7740 = 8448;

    @OriginalMember(owner = "client!jaa", name = "jh", descriptor = "I")
    public int field7739 = 0;

    @OriginalMember(owner = "client!jaa", name = "Eg", descriptor = "[F")
    private float[] field7708 = new float[4];

    @OriginalMember(owner = "client!jaa", name = "ih", descriptor = "Lgm;")
    public class113 field7738 = new class113(8192);

    @OriginalMember(owner = "client!jaa", name = "lh", descriptor = "[I")
    public int[] field7741 = new int[1];

    @OriginalMember(owner = "client!jaa", name = "qh", descriptor = "[I")
    public int[] field7746 = new int[1];

    @OriginalMember(owner = "client!jaa", name = "ph", descriptor = "[I")
    public int[] field7745 = new int[1];

    @OriginalMember(owner = "client!jaa", name = "oh", descriptor = "[B")
    public byte[] field7744 = new byte[16384];

    @OriginalMember(owner = "client!jaa", name = "gd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7529;

    @OriginalMember(owner = "client!jaa", name = "qc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7487;

    @OriginalMember(owner = "client!jaa", name = "Ld", descriptor = "I")
    public int field7560;

    @OriginalMember(owner = "client!jaa", name = "xb", descriptor = "Ljaggl/OpenGL;")
    public OpenGL field7442;

    @OriginalMember(owner = "client!jaa", name = "Rb", descriptor = "J")
    private long field7462;

    @OriginalMember(owner = "client!jaa", name = "sc", descriptor = "J")
    private long field7489;

    @OriginalMember(owner = "client!jaa", name = "rf", descriptor = "Z")
    public boolean field7643;

    @OriginalMember(owner = "client!jaa", name = "Wg", descriptor = "I")
    public int field7726;

    @OriginalMember(owner = "client!jaa", name = "Hf", descriptor = "Ljava/lang/String;")
    private String field7659;

    @OriginalMember(owner = "client!jaa", name = "Bg", descriptor = "Z")
    private boolean field7705;

    @OriginalMember(owner = "client!jaa", name = "ah", descriptor = "Z")
    public boolean field7730;

    @OriginalMember(owner = "client!jaa", name = "Og", descriptor = "Z")
    public boolean field7718;

    @OriginalMember(owner = "client!jaa", name = "zf", descriptor = "Z")
    public boolean field7651;

    @OriginalMember(owner = "client!jaa", name = "Wf", descriptor = "Z")
    public boolean field7674;

    @OriginalMember(owner = "client!jaa", name = "Zf", descriptor = "Z")
    private boolean field7677;

    @OriginalMember(owner = "client!jaa", name = "Ef", descriptor = "Ljava/lang/String;")
    private String field7656;

    @OriginalMember(owner = "client!jaa", name = "Pf", descriptor = "Z")
    public boolean field7667;

    @OriginalMember(owner = "client!jaa", name = "Pg", descriptor = "Z")
    private boolean field7719;

    @OriginalMember(owner = "client!jaa", name = "ie", descriptor = "Lqc;")
    private class695 field7583;

    @OriginalMember(owner = "client!jaa", name = "se", descriptor = "Loj;")
    public class353 field7593;

    @OriginalMember(owner = "client!jaa", name = "Ud", descriptor = "Lmw;")
    private class459 field7569;

    @OriginalMember(owner = "client!jaa", name = "Nd", descriptor = "Leu;")
    private class447 field7562;

    @OriginalMember(owner = "client!jaa", name = "Td", descriptor = "Lsca;")
    private class42 field7568;

    @OriginalMember(owner = "client!jaa", name = "T", descriptor = "I")
    public static int field7412 = -1;

    @OriginalMember(owner = "client!jaa", name = "fe", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!jaa", name = "Wd", descriptor = "Lra;")
    public static class98 field7571;

    @OriginalMember(owner = "client!jaa", name = "Ve", descriptor = "F")
    public float field7622;

    @OriginalMember(owner = "client!jaa", name = "sf", descriptor = "F")
    public float field7644;

    @OriginalMember(owner = "client!jaa", name = "tf", descriptor = "F")
    private float field7645;

    @OriginalMember(owner = "client!jaa", name = "xf", descriptor = "F")
    private float field7649;

    @OriginalMember(owner = "client!jaa", name = "Cf", descriptor = "F")
    public float field7654;

    @OriginalMember(owner = "client!jaa", name = "If", descriptor = "F")
    private float field7660;

    @OriginalMember(owner = "client!jaa", name = "Of", descriptor = "F")
    public float field7666;

    @OriginalMember(owner = "client!jaa", name = "Yf", descriptor = "F")
    public float field7676;

    @OriginalMember(owner = "client!jaa", name = "zg", descriptor = "F")
    private float field7703;

    @OriginalMember(owner = "client!jaa", name = "Tg", descriptor = "F")
    public float field7723;

    @OriginalMember(owner = "client!jaa", name = "r", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!jaa", name = "s", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!jaa", name = "t", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!jaa", name = "u", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!jaa", name = "v", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!jaa", name = "w", descriptor = "I")
    public static int field7389;

    @OriginalMember(owner = "client!jaa", name = "x", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!jaa", name = "y", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!jaa", name = "z", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!jaa", name = "A", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!jaa", name = "B", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!jaa", name = "C", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!jaa", name = "D", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!jaa", name = "E", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!jaa", name = "F", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!jaa", name = "G", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!jaa", name = "H", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!jaa", name = "I", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!jaa", name = "J", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!jaa", name = "K", descriptor = "I")
    public int field7403;

    @OriginalMember(owner = "client!jaa", name = "L", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!jaa", name = "M", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!jaa", name = "N", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!jaa", name = "O", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!jaa", name = "P", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!jaa", name = "Q", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!jaa", name = "R", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!jaa", name = "S", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!jaa", name = "U", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!jaa", name = "V", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!jaa", name = "W", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!jaa", name = "X", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!jaa", name = "Y", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!jaa", name = "Z", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!jaa", name = "ab", descriptor = "I")
    public static int field7419;

    @OriginalMember(owner = "client!jaa", name = "bb", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!jaa", name = "cb", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!jaa", name = "db", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!jaa", name = "eb", descriptor = "I")
    public static int field7423;

    @OriginalMember(owner = "client!jaa", name = "fb", descriptor = "I")
    public static int field7424;

    @OriginalMember(owner = "client!jaa", name = "gb", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!jaa", name = "hb", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!jaa", name = "ib", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!jaa", name = "jb", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!jaa", name = "kb", descriptor = "I")
    public static int field7429;

    @OriginalMember(owner = "client!jaa", name = "lb", descriptor = "I")
    private int field7430;

    @OriginalMember(owner = "client!jaa", name = "mb", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!jaa", name = "nb", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!jaa", name = "ob", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!jaa", name = "pb", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!jaa", name = "qb", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!jaa", name = "rb", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!jaa", name = "sb", descriptor = "I")
    public static int field7437;

    @OriginalMember(owner = "client!jaa", name = "tb", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!jaa", name = "ub", descriptor = "I")
    public static int field7439;

    @OriginalMember(owner = "client!jaa", name = "vb", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!jaa", name = "wb", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!jaa", name = "yb", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!jaa", name = "zb", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!jaa", name = "Ab", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!jaa", name = "Bb", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!jaa", name = "Cb", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!jaa", name = "Db", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!jaa", name = "Eb", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!jaa", name = "Fb", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!jaa", name = "Gb", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!jaa", name = "Hb", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!jaa", name = "Ib", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!jaa", name = "Jb", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!jaa", name = "Kb", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!jaa", name = "Lb", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!jaa", name = "Mb", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!jaa", name = "Nb", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!jaa", name = "Ob", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!jaa", name = "Pb", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!jaa", name = "Qb", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!jaa", name = "Sb", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!jaa", name = "Tb", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!jaa", name = "Ub", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!jaa", name = "Vb", descriptor = "I")
    public int field7466;

    @OriginalMember(owner = "client!jaa", name = "Wb", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!jaa", name = "Xb", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!jaa", name = "Yb", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!jaa", name = "Zb", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!jaa", name = "ac", descriptor = "I")
    public static int field7471;

    @OriginalMember(owner = "client!jaa", name = "bc", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!jaa", name = "cc", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!jaa", name = "dc", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!jaa", name = "ec", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!jaa", name = "fc", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!jaa", name = "gc", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!jaa", name = "hc", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!jaa", name = "ic", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!jaa", name = "jc", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!jaa", name = "kc", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!jaa", name = "lc", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!jaa", name = "mc", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!jaa", name = "nc", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!jaa", name = "oc", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!jaa", name = "pc", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!jaa", name = "rc", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!jaa", name = "tc", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!jaa", name = "uc", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!jaa", name = "vc", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!jaa", name = "wc", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!jaa", name = "xc", descriptor = "I")
    public static int field7494;

    @OriginalMember(owner = "client!jaa", name = "yc", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!jaa", name = "zc", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!jaa", name = "Ac", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!jaa", name = "Bc", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!jaa", name = "Cc", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!jaa", name = "Dc", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!jaa", name = "Ec", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!jaa", name = "Fc", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!jaa", name = "Gc", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!jaa", name = "Hc", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!jaa", name = "Ic", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!jaa", name = "Jc", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!jaa", name = "Kc", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!jaa", name = "Lc", descriptor = "I")
    public static int field7508;

    @OriginalMember(owner = "client!jaa", name = "Mc", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!jaa", name = "Nc", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!jaa", name = "Oc", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!jaa", name = "Pc", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!jaa", name = "Qc", descriptor = "I")
    public static int field7513;

    @OriginalMember(owner = "client!jaa", name = "Rc", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!jaa", name = "Sc", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!jaa", name = "Tc", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!jaa", name = "Uc", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!jaa", name = "Vc", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!jaa", name = "Wc", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!jaa", name = "Xc", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!jaa", name = "Yc", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!jaa", name = "Zc", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!jaa", name = "ad", descriptor = "I")
    private int field7523;

    @OriginalMember(owner = "client!jaa", name = "bd", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!jaa", name = "cd", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!jaa", name = "dd", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!jaa", name = "ed", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!jaa", name = "fd", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!jaa", name = "hd", descriptor = "I")
    public static int field7530;

    @OriginalMember(owner = "client!jaa", name = "id", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!jaa", name = "jd", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!jaa", name = "kd", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!jaa", name = "ld", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!jaa", name = "md", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!jaa", name = "nd", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!jaa", name = "od", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!jaa", name = "pd", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!jaa", name = "qd", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!jaa", name = "rd", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!jaa", name = "sd", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!jaa", name = "td", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!jaa", name = "ud", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!jaa", name = "vd", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!jaa", name = "xd", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!jaa", name = "yd", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!jaa", name = "zd", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!jaa", name = "Ad", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!jaa", name = "Bd", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!jaa", name = "Cd", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!jaa", name = "Dd", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!jaa", name = "Ed", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!jaa", name = "Fd", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!jaa", name = "Gd", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!jaa", name = "Hd", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!jaa", name = "Id", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!jaa", name = "Jd", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!jaa", name = "Kd", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!jaa", name = "Md", descriptor = "I")
    public static int field7561;

    @OriginalMember(owner = "client!jaa", name = "Pd", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!jaa", name = "Qd", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!jaa", name = "Rd", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!jaa", name = "Sd", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!jaa", name = "Vd", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!jaa", name = "Xd", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!jaa", name = "Zd", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!jaa", name = "ae", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!jaa", name = "be", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!jaa", name = "ce", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!jaa", name = "de", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!jaa", name = "ee", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!jaa", name = "ge", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!jaa", name = "je", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!jaa", name = "ke", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!jaa", name = "ne", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!jaa", name = "ue", descriptor = "I")
    public int field7595;

    @OriginalMember(owner = "client!jaa", name = "ve", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!jaa", name = "Ie", descriptor = "I")
    public int field7609;

    @OriginalMember(owner = "client!jaa", name = "Ke", descriptor = "I")
    public int field7611;

    @OriginalMember(owner = "client!jaa", name = "Le", descriptor = "I")
    private int field7612;

    @OriginalMember(owner = "client!jaa", name = "Me", descriptor = "I")
    private int field7613;

    @OriginalMember(owner = "client!jaa", name = "cf", descriptor = "I")
    private int field7629;

    @OriginalMember(owner = "client!jaa", name = "ff", descriptor = "I")
    private int field7632;

    @OriginalMember(owner = "client!jaa", name = "kf", descriptor = "I")
    private int field7636;

    @OriginalMember(owner = "client!jaa", name = "Af", descriptor = "I")
    private int field7652;

    @OriginalMember(owner = "client!jaa", name = "Ff", descriptor = "I")
    private int field7657;

    @OriginalMember(owner = "client!jaa", name = "Kf", descriptor = "I")
    private int field7662;

    @OriginalMember(owner = "client!jaa", name = "Qf", descriptor = "I")
    private int field7668;

    @OriginalMember(owner = "client!jaa", name = "Vf", descriptor = "I")
    public int field7673;

    @OriginalMember(owner = "client!jaa", name = "jg", descriptor = "I")
    public int field7687;

    @OriginalMember(owner = "client!jaa", name = "vg", descriptor = "I")
    private int field7699;

    @OriginalMember(owner = "client!jaa", name = "Gg", descriptor = "I")
    public int field7710;

    @OriginalMember(owner = "client!jaa", name = "Lg", descriptor = "I")
    private int field7715;

    @OriginalMember(owner = "client!jaa", name = "Ng", descriptor = "I")
    public int field7717;

    @OriginalMember(owner = "client!jaa", name = "Qg", descriptor = "I")
    private int field7720;

    @OriginalMember(owner = "client!jaa", name = "eh", descriptor = "I")
    private int field7734;

    @OriginalMember(owner = "client!jaa", name = "mh", descriptor = "I")
    private int field7742;

    @OriginalMember(owner = "client!jaa", name = "nh", descriptor = "I")
    private int field7743;

    @OriginalMember(owner = "client!jaa", name = "vf", descriptor = "J")
    private long field7647;

    @OriginalMember(owner = "client!jaa", name = "wf", descriptor = "Lco;")
    public class109 field7648;

    @OriginalMember(owner = "client!jaa", name = "Cg", descriptor = "Lhq;")
    private class148 field7706;

    @OriginalMember(owner = "client!jaa", name = "we", descriptor = "Lds;")
    private class14 field7597;

    @OriginalMember(owner = "client!jaa", name = "pf", descriptor = "Lds;")
    public class14 field7641;

    @OriginalMember(owner = "client!jaa", name = "rg", descriptor = "Lce;")
    public class288 field7695;

    @OriginalMember(owner = "client!jaa", name = "Jg", descriptor = "Lce;")
    public class288 field7713;

    @OriginalMember(owner = "client!jaa", name = "mg", descriptor = "Lwb;")
    private class308 field7690;

    @OriginalMember(owner = "client!jaa", name = "Ye", descriptor = "Lad;")
    private class393 field7625;

    @OriginalMember(owner = "client!jaa", name = "lg", descriptor = "Lad;")
    private class393 field7689;

    @OriginalMember(owner = "client!jaa", name = "fh", descriptor = "Lbd;")
    private class58 field7735;

    @OriginalMember(owner = "client!jaa", name = "ze", descriptor = "Lqh;")
    private class63 field7600;

    @OriginalMember(owner = "client!jaa", name = "Be", descriptor = "Lqh;")
    private class63 field7602;

    @OriginalMember(owner = "client!jaa", name = "df", descriptor = "Lmo;")
    public class700 field7630;

    @OriginalMember(owner = "client!jaa", name = "ef", descriptor = "Lmo;")
    public class700 field7631;

    @OriginalMember(owner = "client!jaa", name = "qf", descriptor = "Lmo;")
    public class700 field7642;

    @OriginalMember(owner = "client!jaa", name = "Uf", descriptor = "Lmo;")
    public class700 field7672;

    @OriginalMember(owner = "client!jaa", name = "gg", descriptor = "Lmo;")
    public class700 field7684;

    @OriginalMember(owner = "client!jaa", name = "kg", descriptor = "Lmo;")
    public class700 field7688;

    @OriginalMember(owner = "client!jaa", name = "ng", descriptor = "Lmo;")
    public class700 field7691;

    @OriginalMember(owner = "client!jaa", name = "pg", descriptor = "Lmo;")
    public class700 field7693;

    @OriginalMember(owner = "client!jaa", name = "Rg", descriptor = "Lmo;")
    public class700 field7721;

    @OriginalMember(owner = "client!jaa", name = "Sg", descriptor = "Lmo;")
    public class700 field7722;

    @OriginalMember(owner = "client!jaa", name = "ye", descriptor = "Llr;")
    private class703 field7599;

    @OriginalMember(owner = "client!jaa", name = "Sf", descriptor = "Lkl;")
    public class73 field7670;

    @OriginalMember(owner = "client!jaa", name = "qg", descriptor = "Lkl;")
    public class73 field7694;

    @OriginalMember(owner = "client!jaa", name = "qe", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field7591;

    @OriginalMember(owner = "client!jaa", name = "We", descriptor = "Z")
    private boolean field7623;

    @OriginalMember(owner = "client!jaa", name = "Ze", descriptor = "Z")
    public boolean field7626;

    @OriginalMember(owner = "client!jaa", name = "af", descriptor = "Z")
    private boolean field7627;

    @OriginalMember(owner = "client!jaa", name = "bf", descriptor = "Z")
    public boolean field7628;

    @OriginalMember(owner = "client!jaa", name = "hf", descriptor = "Z")
    private boolean field7634;

    @OriginalMember(owner = "client!jaa", name = "nf", descriptor = "Z")
    private boolean field7639;

    @OriginalMember(owner = "client!jaa", name = "Df", descriptor = "Z")
    private boolean field7655;

    @OriginalMember(owner = "client!jaa", name = "Nf", descriptor = "Z")
    private boolean field7665;

    @OriginalMember(owner = "client!jaa", name = "Xf", descriptor = "Z")
    private boolean field7675;

    @OriginalMember(owner = "client!jaa", name = "bg", descriptor = "Z")
    private boolean field7679;

    @OriginalMember(owner = "client!jaa", name = "ig", descriptor = "Z")
    public boolean field7686;

    @OriginalMember(owner = "client!jaa", name = "yg", descriptor = "Z")
    public boolean field7702;

    @OriginalMember(owner = "client!jaa", name = "Fg", descriptor = "Z")
    public boolean field7709;

    @OriginalMember(owner = "client!jaa", name = "Ig", descriptor = "Z")
    private boolean field7712;

    @OriginalMember(owner = "client!jaa", name = "Mg", descriptor = "Z")
    private boolean field7716;

    @OriginalMember(owner = "client!jaa", name = "Ug", descriptor = "Z")
    public boolean field7724;

    @OriginalMember(owner = "client!jaa", name = "Xg", descriptor = "Z")
    public boolean field7727;

    @OriginalMember(owner = "client!jaa", name = "bh", descriptor = "Z")
    private boolean field7731;

    @OriginalMember(owner = "client!jaa", name = "ch", descriptor = "Z")
    public boolean field7732;

    @OriginalMember(owner = "client!jaa", name = "Od", descriptor = "[I")
    public static int[] field7563;

    @OriginalMember(owner = "client!jaa", name = "Ag", descriptor = "[Ltj;")
    private class185[] field7704;

    @OriginalMember(owner = "client!jaa", name = "ya", descriptor = "(IIIII)V")
    public final void method437(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7555;
        this.method3181((byte) 58);
        this.method3146(7261, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "(II)V")
    public final void method3111(int arg0, int arg1) {
        class624.field8475[0] = (float) class109.method762(arg1, 16711680) / 1.671168E7F;
        if (arg0 != -15361) {
            this.field7646 = 10;
        }
        ++field7422;
        class624.field8475[2] = (float) class109.method762(255, arg1) / 255.0F;
        class624.field8475[3] = (float) (arg1 >>> 24) / 255.0F;
        class624.field8475[1] = (float) class109.method762(65280, arg1) / 65280.0F;
        OpenGL.glTexEnvfv(8960, 8705, class624.field8475, 0);
    }

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "(B)V")
    private final void method3112(byte arg0) {
        ++field7431;
        int var2;
        for (var2 = 0; var2 < this.field7652; ++var2) {
            class227 var3 = this.field7669[var2];
            int var4 = var2 + 16386;
            class705.field9859[0] = (float) var3.method1374((byte) 75);
            class705.field9859[1] = (float) var3.method1373((byte) 96);
            class705.field9859[2] = (float) var3.method1370((byte) -5);
            class705.field9859[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class705.field9859, 0);
            int var5 = var3.method1372(arg0 ^ -93);
            float var6 = var3.method1368(128) / 255.0F;
            class705.field9859[1] = var6 * (float) class109.method762(255, var5 >> 8);
            class705.field9859[0] = (float) class109.method762(255, var5 >> 16) * var6;
            class705.field9859[2] = var6 * (float) class109.method762(255, var5);
            OpenGL.glLightfv(var4, 4609, class705.field9859, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method1367(127) * var3.method1367(arg0 ^ -93)));
            OpenGL.glEnable(var4);
        }
        if (arg0 == -36) {
            while (var2 < this.field7636) {
                OpenGL.glDisable(16386 - -var2);
                ++var2;
            }
            this.field7636 = this.field7652;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "(I)V")
    private final void method3113(int arg0) {
        ++field7510;
        int var2;
        if (this.field7702) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field7678;
        } else {
            this.field7649 = (float) (-this.field7697 + this.field7646) - this.field7737;
            this.field7723 = this.field7649 - (float) this.field7701 * this.field7671;
            if (this.field7723 < (float) this.field7696) {
                this.field7723 = (float) this.field7696;
            }
            OpenGL.glFogf(2915, this.field7723);
            OpenGL.glFogf(2916, this.field7649);
            var2 = this.field7664;
        }
        class624.field8475[2] = (float) class109.method762(var2, 255) / 255.0F;
        class624.field8475[1] = (float) class109.method762(65280, var2) / 65280.0F;
        class624.field8475[arg0] = (float) class109.method762(16711680, var2) / 1.671168E7F;
        OpenGL.glFogfv(2918, class624.field8475, 0);
        if (this.field7702) {
            this.field7568.field584.method245(arg0 + -9246);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "y", descriptor = "()Z")
    public final boolean method466() {
        ++field7404;
        return true;
    }

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "(B)V")
    private final void method3114(byte arg0) {
        ++field7501;
        OpenGL.glDepthMask(this.field7675 && this.field7707);
        if (arg0 > -28) {
            this.field7640 = -0.8518051F;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)V")
    public final void method476(int arg0) {
        ++field7494;
        this.method3147(4616);
    }

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "(B)V")
    public final void method3115(byte arg0) {
        ++field7402;
        if (this.field7662 != 2) {
            this.method3193(-105);
            this.method3154(-4221, false);
            this.method3130(3156, false);
            this.method3168(-19170, false);
            this.method3174(false, -32);
            this.method3171(111, -2);
            this.field7662 = 2;
        }
        if (arg0 <= 4) {
            this.field7635 = 0.30363068F;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILkl;)V")
    public final void method3116(int arg0, class73 arg1) {
        OpenGL.glPushMatrix();
        ++field7490;
        if (arg0 != 5924) {
            this.method3131((byte) 2);
        }
        OpenGL.glMultMatrixf(arg1.method577(9), 0);
    }

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "()V")
    public final void method392() {
        for (class263 var1 = this.field7590.method1909(true); var1 != null; var1 = this.field7590.method1916((byte) 100)) {
            ((class336) var1).method1922((byte) -4);
        }
        ++field7440;
        if (this.field7569 != null) {
            this.field7569.method2528(-5);
        }
        if (this.field7442 != null) {
            this.method3147(4616);
            Enumeration var2 = this.field7545.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field7545.get(var3);
                this.field7442.releaseSurface(var3, var4);
            }
            this.field7442.release();
            this.field7442 = null;
        }
        if (this.field7594) {
            class465.method2536(true, false, 0);
            this.field7594 = false;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(Z)V")
    public final void method388(boolean arg0) {
        ++field7558;
    }

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "(B)V")
    public final void method3117(byte arg0) {
        ++field7391;
        if (arg0 < 19) {
            this.field7727 = true;
        }
        if (~this.field7662 != -17) {
            this.method3142((byte) -31);
            this.method3154(-4221, true);
            this.method3168(-19170, true);
            this.method3174(true, -32);
            this.method3146(7261, 1);
            this.field7662 = 16;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(JI)V")
    public final synchronized void method3118(long arg0, int arg1) {
        ++field7550;
        class263 var4 = new class263();
        if (arg1 != -29131) {
            this.field7691 = null;
        }
        var4.field3321 = arg0;
        this.field7619.method1904(var4, -93);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lqh;I)V")
    public final void method3119(class63 arg0, int arg1) {
        if (arg1 != -2015) {
            this.field7620 = 87;
        }
        ++field7483;
        if (this.field7686) {
            this.method3176(arg1 + 1910, arg0);
            this.method3157(arg0, false);
        } else if (this.field7601 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field7601 <= -1) {
                this.field7598[this.field7601].method71(-18741);
            }
            this.field7600 = this.field7602 = this.field7598[++this.field7601] = arg0;
            this.field7600.method82((byte) 69);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(IIII)V")
    public final void method3120(int arg0, int arg1, int arg2, int arg3) {
        ++field7503;
        OpenGL.glDrawArrays(arg3, arg1, arg2);
        if (arg0 > -49) {
            this.method493(38, 84);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "(Z)V")
    private final void method3121(boolean arg0) {
        if (arg0) {
            this.method423();
        }
        ++field7436;
        if (this.field7734 != 2) {
            this.field7734 = 2;
            this.method3152(6673);
            this.method3167(180);
            this.field7662 &= -8;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "IA", descriptor = "()I")
    public final int method461() {
        ++field7537;
        return this.field7646;
    }

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "(I)V")
    public final void method3122(int arg0) {
        ++field7508;
        if (this.field7662 != 8) {
            this.method3121(false);
            this.method3154(-4221, true);
            this.method3168(-19170, true);
            this.method3174(true, -32);
            this.method3146(7261, 1);
            this.field7662 = 8;
        }
        if (arg0 < 112) {
            method3189(-42);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lkl;I)V")
    public final void method3123(class73 arg0, int arg1) {
        ++field7520;
        OpenGL.glLoadMatrixf(arg0.method577(9), 0);
        if (arg1 != -7270) {
            this.method3113(-57);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "(I)V")
    public final void method494(int arg0) {
        this.method3124(3);
        ++field7446;
    }

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "()Z")
    public final boolean method488() {
        ++field7409;
        return true;
    }

    @OriginalMember(owner = "client!jaa", name = "z", descriptor = "()Z")
    public final boolean method393() {
        ++field7477;
        return this.field7562 != null && this.field7562.method2381(1);
    }

    @OriginalMember(owner = "client!jaa", name = "i", descriptor = "(I)V")
    private final void method3124(int arg0) {
        if (arg0 != 3) {
            this.field7631 = null;
        }
        ++field7574;
        int var2 = 0;
        while (!this.field7442.method3236()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class700.method3867(arg0 + 29276, 1000L);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "j", descriptor = "(I)V")
    private final void method3125(int arg0) {
        ++field7405;
        this.method3171(arg0 ^ 105, -2);
        for (int var2 = this.field7717 + -1; ~var2 <= -1; --var2) {
            this.method3126(var2, arg0 ^ -118);
            this.method3194((byte) 75, (class185) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method3185(8448, 8448, (byte) -43);
        this.method3175(34168, arg0 ^ 3, arg0, 770);
        this.method3133((byte) 44);
        this.field7699 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field7629 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field7627 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field7623 = true;
        this.method3154(-4221, true);
        this.method3130(arg0 ^ 3158, true);
        this.method3168(-19170, true);
        this.method3174(true, -32);
        this.method3192(false);
        this.field7442.setSwapInterval(0);
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
        this.field7698 = this.field7664 = -1;
        this.method410();
    }

    @OriginalMember(owner = "client!jaa", name = "n", descriptor = "()I")
    public final int method430() {
        ++field7549;
        return 4;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "([Lba;Lq;[Lpo;I)V")
    public final void method491(class359[] arg0, class396 arg1, class524[] arg2, int arg3) {
        for (int var5 = 0; ~var5 > ~arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method2049(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
        ++field7533;
    }

    @OriginalMember(owner = "client!jaa", name = "ca", descriptor = "(IIII)V")
    public final void method403(int arg0, int arg1, int arg2, int arg3) {
        if (this.field7403 < arg3) {
            arg3 = this.field7403;
        }
        ++field7413;
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field7466) {
            arg2 = this.field7466;
        }
        this.field7661 = arg0;
        this.field7663 = arg2;
        this.field7685 = arg3;
        this.field7620 = arg1;
        OpenGL.glEnable(3089);
        this.method3169(true);
        this.method3163((byte) 90);
    }

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "(II)V")
    public final void method3126(int arg0, int arg1) {
        ++field7486;
        if (arg1 > -27) {
            this.method445(-54, -0.38443878F, 0.5702478F, -0.13325821F, -1.579082F, 0.45914012F);
        }
        if (~this.field7668 != ~arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field7668 = arg0;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "(IIII)V")
    public final void method3127(int arg0, int arg1, int arg2, int arg3) {
        ++field7471;
        if (arg3 != 17111) {
            this.method402((class495) null, true);
        }
        OpenGL.glTexEnvi(8960, 34184 - -arg0, arg2);
        OpenGL.glTexEnvi(8960, 34200 - -arg0, arg1);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(FFF)V")
    public final void method391(float arg0, float arg1, float arg2) {
        ++field7524;
        class532.field6723 = arg1;
        class78.field1018 = arg0;
        class555.field6942 = arg2;
    }

    @OriginalMember(owner = "client!jaa", name = "k", descriptor = "()V")
    public final void method409() {
        this.field7702 = false;
        ++field7547;
        this.field7568.method261(0, false, (byte) -128, 0, 0, false);
        this.method3113(0);
        this.method3158((byte) -106);
    }

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "(Z)V")
    public final void method3128(boolean arg0) {
        if (arg0) {
            OpenGL.glLightfv(16384, 4611, this.field7624, 0);
            ++field7521;
            OpenGL.glLightfv(16385, 4611, this.field7736, 0);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lwb;IIII)V")
    public final void method3129(class308 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7468;
        int var6 = arg0.method1827(57);
        int var7 = arg2 * this.method3173(var6, 1252738544);
        this.method3135(arg0, 25913);
        int var8 = -26 / ((arg1 - -10) / 33);
        OpenGL.glDrawElements(arg4, arg3, var6, arg0.method1824((byte) -80) - -((long) var7));
    }

    @OriginalMember(owner = "client!jaa", name = "D", descriptor = "()Z")
    public final boolean method492() {
        ++field7579;
        return true;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IZ)V")
    public final void method3130(int arg0, boolean arg1) {
        if (this.field7716 == !arg1) {
            this.field7716 = arg1;
            this.method3156(false);
            this.field7662 &= -8;
        }
        ++field7512;
        if (arg0 != 3156) {
            this.method3122(-103);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "(B)V")
    private final void method3131(byte arg0) {
        ++field7401;
        this.field7694 = new class73();
        this.field7670 = new class73();
        this.field7704 = new class185[this.field7717];
        if (arg0 <= -47) {
            this.field7648 = new class109(this, 3553, 6408, 1, 1);
            new class109(this, 3553, 6408, 1, 1);
            new class109(this, 3553, 6408, 1, 1);
            this.field7722 = new class700(this);
            this.field7693 = new class700(this);
            this.field7688 = new class700(this);
            this.field7672 = new class700(this);
            this.field7630 = new class700(this);
            this.field7684 = new class700(this);
            this.field7721 = new class700(this);
            this.field7642 = new class700(this);
            this.field7631 = new class700(this);
            this.field7691 = new class700(this);
            if (this.field7667) {
                this.field7641 = new class14(this);
                new class14(this);
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lqh;B)V")
    public final void method3132(class63 arg0, byte arg1) {
        ++field7437;
        if (~this.field7606 <= -1 && this.field7604[this.field7606] == arg0) {
            this.field7604[this.field7606--] = null;
            arg0.method66(120);
            if (this.field7606 >= 0) {
                this.field7602 = this.field7604[this.field7606];
                this.field7602.method80(92);
            } else {
                this.field7602 = null;
            }
            if (arg1 != -44) {
                this.method3161(false);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaa", name = "i", descriptor = "(B)V")
    private final void method3133(byte arg0) {
        if (this.field7679) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field7679 = false;
        }
        if (arg0 != 44) {
            this.method388(false);
        }
        ++field7400;
    }

    @OriginalMember(owner = "client!jaa", name = "YA", descriptor = "(IFFFFF)V")
    public final void method445(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field7465;
        boolean var7 = this.field7698 != arg0;
        if (var7 || this.field7728 != arg1 || this.field7729 != arg2) {
            this.field7728 = arg1;
            this.field7698 = arg0;
            this.field7729 = arg2;
            if (var7) {
                this.field7650 = (float) (this.field7698 & 65280) / 65280.0F;
                this.field7711 = (float) (16711680 & this.field7698) / 1.671168E7F;
                this.field7733 = (float) (255 & this.field7698) / 255.0F;
                this.method3151(103);
            }
            this.method3184(3);
        }
        if (this.field7708[0] != arg3 || this.field7708[1] != arg4 || this.field7708[2] != arg5) {
            this.field7708[1] = arg4;
            this.field7708[0] = arg3;
            this.field7708[2] = arg5;
            this.field7680[2] = -arg5;
            this.field7680[1] = -arg4;
            this.field7680[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field7624[1] = arg4 * var8;
            this.field7624[0] = arg3 * var8;
            this.field7624[2] = arg5 * var8;
            this.field7736[2] = -this.field7624[2];
            this.field7736[1] = -this.field7624[1];
            this.field7736[0] = -this.field7624[0];
            this.method3128(true);
            this.field7673 = (int) (arg3 * 256.0F / arg4);
            this.field7710 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "(I)Li;")
    public final class37 method468(int arg0) {
        ++field7532;
        class336 var2 = new class336(arg0);
        this.field7590.method1904(var2, -33);
        return var2;
    }

    @OriginalMember(owner = "client!jaa", name = "x", descriptor = "()Lq;")
    public final class396 method431() {
        ++field7425;
        return new class73();
    }

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "(II)V")
    public final void method3134(int arg0, int arg1) {
        if (~arg1 != -2) {
            if (arg1 == 0) {
                this.method3185(8448, 8448, (byte) 103);
            } else if (~arg1 == -3) {
                this.method3185(34165, 7681, (byte) 45);
            } else if (arg1 != 3) {
                if (arg1 == 4) {
                    this.method3185(34023, 34023, (byte) 93);
                }
            } else {
                this.method3185(260, 8448, (byte) 62);
            }
        } else {
            this.method3185(7681, 7681, (byte) -74);
        }
        ++field7584;
        int var3 = -102 / ((31 - arg0) / 55);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lwb;I)V")
    public final void method3135(class308 arg0, int arg1) {
        ++field7461;
        if (arg1 != 25913) {
            this.field7710 = -73;
        }
        if (this.field7690 != arg0) {
            if (this.field7705) {
                OpenGL.glBindBufferARB(34963, arg0.method1825((byte) -109));
            }
            this.field7690 = arg0;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lig;)V")
    public final void method485(class228 arg0) {
        ++field7390;
        this.field7582.method2707(this, (byte) -56, arg0);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I[BIIZ)Lad;")
    public final class393 method3136(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 != 0) {
            this.method422();
        }
        ++field7542;
        return (class393) (!this.field7705 || arg4 && !this.field7677 ? new class691(this, arg3, arg1, arg2) : new class482(this, arg3, arg1, arg2, arg4));
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIZ)Lxa;")
    public final class468 method433(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field7551;
        return new class703(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Liba;Z)Lxa;")
    public final class468 method402(class495 arg0, boolean arg1) {
        ++field7455;
        int[] var3 = new int[arg0.field6195 * arg0.field6193];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field6189 != null) {
            for (int var6 = 0; var6 < arg0.field6195; ++var6) {
                for (int var7 = 0; var7 < arg0.field6193; ++var7) {
                    var3[var5++] = class364.method2113(arg0.field6189[var4] << 24, arg0.field6187[class109.method762(arg0.field6191[var4], 255)]);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; arg0.field6195 > var8; ++var8) {
                for (int var10 = 0; ~arg0.field6193 < ~var10; ++var10) {
                    int var11 = arg0.field6187[arg0.field6191[var4++] & 255];
                    var3[var5++] = ~var11 != -1 ? class364.method2113(var11, -16777216) : 0;
                }
            }
        }
        class468 var9 = this.method428(var3, 0, arg0.field6193, arg0.field6193, arg0.field6195);
        var9.method1559(arg0.field6190, arg0.field6192, arg0.field6188, arg0.field6194);
        return var9;
    }

    @OriginalMember(owner = "client!jaa", name = "D", descriptor = "(I)V")
    public final void method315(int arg0) {
        this.method3146(7261, 0);
        ++field7454;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method345(Rectangle[] arg0, int arg1) throws class202 {
        this.method318();
        ++field7434;
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;I)V")
    public class576(Canvas arg0, class498 arg1, int arg2) {
        super(arg1);
        this.field7487 = this.field7529 = arg0;
        this.field7560 = arg2;
        if (!class362.method2099(34167, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class362.method2099(34167, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field7442 = new OpenGL();
                this.field7489 = this.field7462 = this.field7442.init(arg0, 8, 8, 8, 24, 0, this.field7560);
                if (this.field7462 == 0L) {
                    throw new RuntimeException("");
                } else {
                    this.method3124(3);
                    int var4 = this.method3141(22545);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field7726 = !this.field7643 ? 5121 : 33639;
                        if (~this.field7659.indexOf("radeon") != 0) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class112.method774(' ', 1, this.field7659.replace('/', ' '));
                            for (int var9 = 0; ~var9 > ~var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (~var10.length() < -1) {
                                        if (~var10.charAt(0) == -121 && ~var10.length() <= -4 && class485.method2639(var10.substring(1, 3), true)) {
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
                                            if (~var10.length() <= -5 && class485.method2639(var10.substring(0, 4), true)) {
                                                var5 = class504.method2750(var10.substring(0, 4), 10);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var16) {
                                }
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && ~var5 >= -8000) {
                                    this.field7705 = false;
                                }
                                if (var5 >= 7000 && var5 <= 9250) {
                                    this.field7730 = false;
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field7718 = false;
                            }
                            this.field7651 &= this.field7442.method3238("GL_ARB_half_float_pixel");
                            this.field7674 = true;
                            this.field7677 = this.field7705;
                        }
                        if (this.field7656.indexOf("intel") != -1) {
                            this.field7667 = false;
                        }
                        this.field7719 = !this.field7656.equals("s3 graphics");
                        if (this.field7705) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var14) {
                                throw new RuntimeException("");
                            }
                        }
                        class536.method2886(true, (byte) -105, false);
                        this.field7594 = true;
                        this.field7583 = new class695(this, super.field8781);
                        this.method3131((byte) -90);
                        this.field7593 = new class353(this);
                        this.field7569 = new class459(this);
                        if (this.field7569.method2530(90)) {
                            this.field7562 = new class447(this);
                            if (!this.field7562.method2443(122)) {
                                this.field7562.method2385(1);
                                this.field7562 = null;
                            }
                        }
                        this.field7568 = new class42(this);
                        this.method3125(2);
                        this.method3144(0);
                        OpenGL.glClear(16640);
                        int var12 = 0;
                        while (true) {
                            try {
                                this.field7442.swapBuffers();
                                break;
                            } catch (Exception var15) {
                                if (~(var12++) < -6) {
                                    throw new RuntimeException("");
                                }
                                class700.method3867(29279, 100L);
                            }
                        }
                        OpenGL.glClear(16384);
                    }
                }
            } catch (Throwable var17) {
                var17.printStackTrace();
                this.method392();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(IIZ)V")
    public final synchronized void method3137(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field7632 = -4;
        }
        ++field7449;
        class319 var4 = new class319(arg1);
        var4.field3321 = (long) arg0;
        this.field7615.method1904(var4, -8);
    }

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "(I)V")
    public final void method413(int arg0) {
        ++field7432;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method405(Canvas arg0) {
        ++field7421;
        long var2 = 0L;
        if (arg0 != null && this.field7529 != arg0) {
            if (this.field7545.containsKey(arg0)) {
                Long var4 = (Long) this.field7545.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field7462;
        }
        if (var2 == 0L) {
            throw new RuntimeException();
        } else {
            this.field7442.surfaceResized(var2);
            if (this.field7487 == arg0) {
                this.method3144(0);
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "L", descriptor = "(ILfa;II)V")
    public final void method426(int arg0, class219 arg1, int arg2, int arg3) {
        ++field7511;
        class257 var5 = (class257) arg1;
        class148 var6 = var5.field3291;
        this.method3115((byte) 15);
        this.method3194((byte) 75, var5.field3291);
        this.method3146(7261, 1);
        this.method3185(7681, 8448, (byte) 46);
        this.method3175(34167, 1, 0, 768);
        float var7 = var6.field1768 / (float) var6.field1767;
        float var8 = var6.field1762 / (float) var6.field1769;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7661) * var7, (float) (-arg3 + this.field7620) * var8);
        OpenGL.glVertex2i(this.field7661, this.field7620);
        OpenGL.glTexCoord2f((float) (this.field7661 - arg2) * var7, (float) (this.field7685 - arg3) * var8);
        OpenGL.glVertex2i(this.field7661, this.field7685);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7663) * var7, (float) (-arg3 + this.field7685) * var8);
        OpenGL.glVertex2i(this.field7663, this.field7685);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7663) * var7, (float) (this.field7620 - arg3) * var8);
        OpenGL.glVertex2i(this.field7663, this.field7620);
        OpenGL.glEnd();
        this.method3175(5890, 1, 0, 768);
    }

    @OriginalMember(owner = "client!jaa", name = "s", descriptor = "()F")
    public final float method3138() {
        ++field7541;
        return this.field7653;
    }

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "(III)V")
    public final synchronized void method3139(int arg0, int arg1, int arg2) {
        ++field7561;
        if (arg2 == 2) {
            class319 var4 = new class319(arg1);
            var4.field3321 = (long) arg0;
            this.field7617.method1904(var4, arg2 ^ -77);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(IZ)V")
    public final void method3140(int arg0, boolean arg1) {
        ++field7458;
        if (arg0 != 1) {
            this.field7545 = null;
        }
        if (this.field7731 != arg1) {
            this.field7731 = arg1;
            this.method3156(false);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "q", descriptor = "()Lq;")
    public final class396 method470() {
        ++field7526;
        return this.field7586;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIIII)V")
    public final void method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field7474;
        this.method497(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method417(Canvas arg0) {
        ++field7481;
        if (this.field7529 == arg0) {
            throw new RuntimeException();
        } else if (!this.field7545.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field7442.prepareSurface(arg0);
                if (~var4 == 0L) {
                    throw new RuntimeException();
                } else {
                    this.field7545.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "k", descriptor = "(I)I")
    private final int method3141(int arg0) {
        ++field7499;
        this.field7656 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field7659 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field7656.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (~this.field7656.indexOf("brian paul") != 0 || this.field7656.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class112.method774(' ', arg0 + -22544, var3.replace('.', ' '));
        if (var4.length >= 2) {
            try {
                int var5 = class504.method2750(var4[0], 10);
                int var6 = class504.method2750(var4[1], 10);
                this.field7632 = var5 * 10 - -var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (this.field7632 < 12) {
            var2 |= 2;
        }
        if (!this.field7442.method3238("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field7442.method3238("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field7717 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field7720 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field7657 = var7[0];
        if (~this.field7717 > -3 || this.field7720 < 2 || this.field7657 < 2) {
            var2 |= 16;
        }
        this.field7643 = Stream.method3525();
        this.field7634 = this.field7442.arePbuffersAvailable();
        this.field7705 = this.field7442.method3238("GL_ARB_vertex_buffer_object");
        this.field7655 = this.field7442.method3238("GL_ARB_multisample");
        this.field7626 = this.field7442.method3238("GL_ARB_vertex_program");
        this.field7442.method3238("GL_ARB_fragment_program");
        this.field7724 = this.field7442.method3238("GL_ARB_vertex_shader");
        this.field7732 = this.field7442.method3238("GL_ARB_fragment_shader");
        this.field7730 = this.field7442.method3238("GL_EXT_texture3D");
        this.field7651 = this.field7442.method3238("GL_ARB_texture_rectangle");
        this.field7628 = this.field7442.method3238("GL_ARB_texture_cube_map");
        this.field7718 = this.field7442.method3238("GL_ARB_texture_float");
        this.field7709 = false;
        if (arg0 != 22545) {
            this.field7621 = -43;
        }
        this.field7667 = this.field7442.method3238("GL_EXT_framebuffer_object");
        this.field7686 = this.field7442.method3238("GL_EXT_framebuffer_blit");
        this.field7727 = this.field7442.method3238("GL_EXT_framebuffer_multisample");
        this.field7712 = this.field7686 & this.field7727;
        OpenGL.glGetFloatv(2834, class624.field8475, 0);
        this.field7714 = class624.field8475[0];
        this.field7640 = class624.field8475[1];
        return var2 == 0 ? 0 : var2;
    }

    @OriginalMember(owner = "client!jaa", name = "j", descriptor = "(B)V")
    private final void method3142(byte arg0) {
        if (this.field7734 != 3) {
            this.field7734 = 3;
            this.method3161(false);
            this.method3167(180);
            this.field7662 &= -8;
        }
        ++field7553;
        if (arg0 > -19) {
            this.field7703 = -0.5931696F;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "m", descriptor = "()Z")
    public final boolean method361() {
        ++field7504;
        if (this.field7562 != null) {
            if (!this.field7562.method2381(1)) {
                if (!this.field7569.method2527(this.field7562, (byte) 74)) {
                    return false;
                }
                this.field7583.method3843(-122);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(Lqh;I)V")
    public final void method3143(class63 arg0, int arg1) {
        ++field7408;
        if (this.field7603 >= 0 && this.field7605[this.field7603] == arg0) {
            this.field7605[this.field7603--] = null;
            arg0.method63(-99);
            if (this.field7603 < 0) {
                this.field7600 = null;
            } else {
                this.field7600 = this.field7605[this.field7603];
                this.field7600.method68((byte) -127);
            }
            if (arg1 != -3) {
                this.field7652 = -122;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIIF)Lbj;")
    public final class227 method436(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field7399;
        return new class294(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!jaa", name = "l", descriptor = "(I)V")
    private final void method3144(int arg0) {
        ++field7570;
        if (this.field7487 != null) {
            Dimension var2 = this.field7487.getSize();
            this.field7430 = var2.width;
            this.field7523 = var2.height;
        } else {
            this.field7430 = this.field7523 = 0;
        }
        if (this.field7602 == null) {
            this.field7466 = this.field7430;
            this.field7403 = this.field7523;
            this.method3165(13686);
        }
        if (arg0 != 0) {
            this.method3136(-75, (byte[]) null, -66, 89, true);
        }
        this.method3192(false);
        this.method410();
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(II[I[I)Lfa;")
    public final class219 method400(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field7398;
        return class30.method204(arg1, (byte) 22, arg3, this, arg2, arg0);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIZLjaclib/memory/Buffer;)Lad;")
    public final class393 method3145(int arg0, int arg1, int arg2, boolean arg3, Buffer arg4) {
        ++field7498;
        if (arg0 != -4) {
            this.field7679 = true;
        }
        return (class393) (!this.field7705 || arg3 && !this.field7677 ? new class691(this, arg1, arg4) : new class482(this, arg1, arg4, arg2, arg3));
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "([IIIII)Lxa;")
    public final class468 method428(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7387;
        return new class703(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "(II)V")
    public final void method3146(int arg0, int arg1) {
        ++field7397;
        if (~this.field7699 != ~arg1) {
            boolean var3;
            byte var4;
            boolean var5;
            if (~arg1 == -2) {
                var3 = true;
                var4 = 1;
                var5 = true;
            } else if (~arg1 != -3) {
                if (arg1 != 128) {
                    var5 = true;
                    var3 = false;
                    var4 = 0;
                } else {
                    var3 = true;
                    var4 = 3;
                    var5 = true;
                }
            } else {
                var3 = false;
                var5 = true;
                var4 = 2;
            }
            if (!var5 != !this.field7623) {
                OpenGL.glColorMask(var5, var5, var5, true);
                this.field7623 = var5;
            }
            if (var3 == !this.field7627) {
                if (!var3) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field7627 = var3;
            }
            if (this.field7629 != var4) {
                if (~var4 == -2) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (~var4 == -3) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                } else if (~var4 == -4) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(774, 1);
                } else {
                    OpenGL.glDisable(3042);
                }
                this.field7629 = var4;
            }
            this.field7662 &= -29;
            this.field7699 = arg1;
        }
        if (arg0 != 7261) {
            this.field7612 = 2;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "m", descriptor = "(I)V")
    private final void method3147(int arg0) {
        if (arg0 != 4616) {
            this.method3178(-59, 50);
        }
        ++field7469;
        this.field7442.method3237();
    }

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method411(Canvas arg0) {
        ++field7513;
        this.field7489 = 0L;
        this.field7487 = null;
        if (arg0 != null && this.field7529 != arg0) {
            if (this.field7545.containsKey(arg0)) {
                Long var2 = (Long) this.field7545.get(arg0);
                this.field7489 = var2;
                this.field7487 = arg0;
            }
        } else {
            this.field7489 = this.field7462;
            this.field7487 = this.field7529;
        }
        if (this.field7487 != null && this.field7489 != 0L) {
            this.field7442.setSurface(this.field7489);
            this.method3144(0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "()Z")
    public final boolean method432() {
        ++field7491;
        return true;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lnj;IIII)Lba;")
    public final class359 method408(class229 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7456;
        return new class700(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!jaa", name = "U", descriptor = "()I")
    public final int method423() {
        ++field7460;
        return this.field7696;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZBIZ)V")
    public final void method3148(boolean arg0, byte arg1, int arg2, boolean arg3) {
        if (this.field7715 != arg2) {
            if (arg2 < 0) {
                this.method3133((byte) 44);
                this.method3194((byte) 75, (class185) null);
                this.method3134(-82, 0);
                if (!this.field7702) {
                    this.field7568.method261(0, arg0, (byte) -39, 0, 0, arg3);
                }
            } else {
                class109 var5 = this.field7583.method3845((byte) 69, arg2);
                class152 var6 = super.field8781.method2718(arg2, (byte) 72);
                if (~var6.field1806 == -1 && var6.field1821 == 0) {
                    this.method3133((byte) 44);
                } else {
                    int var7 = !var6.field1826 ? 128 : 64;
                    int var8 = var7 * 50;
                    this.method3182(0.0F, (float) (this.field7595 % var8 * var6.field1806) / (float) var8, (float) (this.field7595 % var8 * var6.field1821) / (float) var8, 123);
                }
                if (this.field7702) {
                    this.method3194((byte) 75, var5);
                    this.method3134(arg1 + -13, var6.field1805);
                } else {
                    this.field7568.method261(var6.field1822, arg0, (byte) -88, var6.field1815, var6.field1809, arg3);
                    if (!this.field7568.method259(var6.field1805, var5, (byte) 94)) {
                        this.method3194((byte) 75, var5);
                        this.method3134(arg1 ^ 75, var6.field1805);
                    }
                }
            }
            this.field7715 = arg2;
        }
        ++field7445;
        if (arg1 == -104) {
            this.field7662 &= -8;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "(II)V")
    public final synchronized void method3149(int arg0, int arg1) {
        ++field7395;
        if (arg0 > -82) {
            this.field7638 = -124;
        }
        class319 var3 = new class319(arg1);
        this.field7616.method1904(var3, -27);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "([BIIBZ)Lwb;")
    public final class308 method3150(byte[] arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        if (arg3 < 23) {
            this.field7673 = 65;
        }
        ++field7472;
        return (class308) (!this.field7705 || arg4 && !this.field7677 ? new class512(this, arg1, arg0, arg2) : new class583(this, arg1, arg0, arg2, arg4));
    }

    @OriginalMember(owner = "client!jaa", name = "n", descriptor = "(I)V")
    private final void method3151(int arg0) {
        class624.field8475[3] = 1.0F;
        class624.field8475[2] = this.field7733 * this.field7644;
        class624.field8475[1] = this.field7650 * this.field7644;
        ++field7463;
        if (arg0 < 94) {
            this.field7703 = -0.048700444F;
        }
        class624.field8475[0] = this.field7711 * this.field7644;
        OpenGL.glLightModelfv(2899, class624.field8475, 0);
    }

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "(I)V")
    public final synchronized void method354(int arg0) {
        ++field7420;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field7614.method1908((byte) -91)) {
            class319 var12 = (class319) this.field7614.method1906(83);
            class408.field5240[var3++] = (int) var12.field3321;
            this.field7611 -= var12.field3990;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class408.field5240, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class408.field5240, 0);
            var3 = 0;
        }
        while (!this.field7615.method1908((byte) -69)) {
            class319 var11 = (class319) this.field7615.method1906(125);
            class408.field5240[var3++] = (int) var11.field3321;
            this.field7609 -= var11.field3990;
            if (~var3 == -1001) {
                OpenGL.glDeleteTextures(var3, class408.field5240, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class408.field5240, 0);
            var3 = 0;
        }
        while (!this.field7616.method1908((byte) -87)) {
            class319 var10 = (class319) this.field7616.method1906(92);
            class408.field5240[var3++] = var10.field3990;
            if (var3 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var3, class408.field5240, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class408.field5240, 0);
            var3 = 0;
        }
        while (!this.field7617.method1908((byte) -117)) {
            class319 var9 = (class319) this.field7617.method1906(96);
            class408.field5240[var3++] = (int) var9.field3321;
            this.field7612 -= var9.field3990;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class408.field5240, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class408.field5240, 0);
            boolean var4 = false;
        }
        while (!this.field7610.method1908((byte) -95)) {
            class319 var8 = (class319) this.field7610.method1906(66);
            OpenGL.glDeleteLists((int) var8.field3321, var8.field3990);
        }
        while (!this.field7618.method1908((byte) -122)) {
            class263 var7 = this.field7618.method1906(73);
            OpenGL.glDeleteProgramARB((int) var7.field3321);
        }
        while (!this.field7619.method1908((byte) -128)) {
            class263 var6 = this.field7619.method1906(106);
            OpenGL.glDeleteObjectARB(var6.field3321);
        }
        while (!this.field7610.method1908((byte) -84)) {
            class319 var5 = (class319) this.field7610.method1906(108);
            OpenGL.glDeleteLists((int) var5.field3321, var5.field3990);
        }
        this.field7583.method3842(-125);
        if (this.method429() > 100663296 && class321.method1854(-118) > this.field7647 + 60000L) {
            System.gc();
            this.field7647 = class321.method1854(-111);
        }
        this.field7595 = var2;
    }

    @OriginalMember(owner = "client!jaa", name = "o", descriptor = "(I)V")
    private final void method3152(int arg0) {
        OpenGL.glMatrixMode(5889);
        ++field7548;
        OpenGL.glLoadMatrixf(this.field7681, 0);
        OpenGL.glMatrixMode(5888);
        if (arg0 != 6673) {
            this.field7604 = null;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "sa", descriptor = "(II)V")
    public final void method438(int arg0, int arg1) {
        ++field7577;
        if (~this.field7696 != ~arg0 || ~this.field7646 != ~arg1) {
            this.field7646 = arg1;
            this.field7696 = arg0;
            this.method3186(-100);
            this.method3113(0);
            if (~this.field7734 != -4) {
                if (this.field7734 == 2) {
                    this.method3152(6673);
                    return;
                }
            } else {
                this.method3161(false);
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "v", descriptor = "()I")
    public final int method429() {
        ++field7478;
        return this.field7611 + this.field7609 + this.field7612;
    }

    @OriginalMember(owner = "client!jaa", name = "G", descriptor = "()F")
    public final float method3153() {
        ++field7540;
        return this.field7703;
    }

    @OriginalMember(owner = "client!jaa", name = "X", descriptor = "(III)V")
    public final void method418(int arg0, int arg1, int arg2) {
        ++field7556;
        if (this.field7664 != arg0 || this.field7701 != arg1 || ~this.field7697 != ~arg2) {
            this.field7701 = arg1;
            this.field7697 = arg2;
            this.field7664 = arg0;
            if (this.field7702) {
                return;
            }
            this.method3113(0);
            this.method3158((byte) -90);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "(IZ)V")
    public final void method3154(int arg0, boolean arg1) {
        if (this.field7639 != arg1) {
            this.field7639 = arg1;
            this.method3158((byte) -91);
            this.field7662 &= -32;
        }
        if (arg0 == -4221) {
            ++field7500;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "w", descriptor = "()V")
    public final void method327() {
        ++field7516;
        if (this.field7562 != null && this.field7562.method2381(1)) {
            this.field7569.method2523(0, this.field7562);
            this.field7583.method3843(-127);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "Q", descriptor = "(IIII)V")
    public final void method451(int arg0, int arg1, int arg2, int arg3) {
        ++field7585;
        if (~arg1 < ~this.field7620) {
            this.field7620 = arg1;
        }
        if (arg0 > this.field7661) {
            this.field7661 = arg0;
        }
        if (this.field7663 > arg2) {
            this.field7663 = arg2;
        }
        if (this.field7685 > arg3) {
            this.field7685 = arg3;
        }
        OpenGL.glEnable(3089);
        this.method3169(true);
        this.method3163((byte) 92);
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(Li;)V")
    public final void method489(class37 arg0) {
        ++field7596;
        this.field7591 = ((class336) arg0).field4146;
        if (this.field7689 == null) {
            class113 var2 = new class113(80);
            if (!this.field7643) {
                var2.method782(367967696, -1.0F);
                var2.method782(367967696, -1.0F);
                var2.method782(367967696, 0.0F);
                var2.method782(367967696, 0.0F);
                var2.method782(367967696, 1.0F);
                var2.method782(367967696, 1.0F);
                var2.method782(367967696, -1.0F);
                var2.method782(367967696, 0.0F);
                var2.method782(367967696, 1.0F);
                var2.method782(367967696, 1.0F);
                var2.method782(367967696, 1.0F);
                var2.method782(367967696, 1.0F);
                var2.method782(367967696, 0.0F);
                var2.method782(367967696, 1.0F);
                var2.method782(367967696, 0.0F);
                var2.method782(367967696, -1.0F);
                var2.method782(367967696, 1.0F);
                var2.method782(367967696, 0.0F);
                var2.method782(367967696, 0.0F);
                var2.method782(367967696, 0.0F);
            } else {
                var2.method784(-1585528400, -1.0F);
                var2.method784(-1585528400, -1.0F);
                var2.method784(-1585528400, 0.0F);
                var2.method784(-1585528400, 0.0F);
                var2.method784(-1585528400, 1.0F);
                var2.method784(-1585528400, 1.0F);
                var2.method784(-1585528400, -1.0F);
                var2.method784(-1585528400, 0.0F);
                var2.method784(-1585528400, 1.0F);
                var2.method784(-1585528400, 1.0F);
                var2.method784(-1585528400, 1.0F);
                var2.method784(-1585528400, 1.0F);
                var2.method784(-1585528400, 0.0F);
                var2.method784(-1585528400, 1.0F);
                var2.method784(-1585528400, 0.0F);
                var2.method784(-1585528400, -1.0F);
                var2.method784(-1585528400, 1.0F);
                var2.method784(-1585528400, 0.0F);
                var2.method784(-1585528400, 0.0F);
                var2.method784(-1585528400, 0.0F);
            }
            this.field7689 = this.method3136(0, var2.field7318, var2.field7313, 20, false);
            this.field7713 = new class288(this.field7689, 5126, 3, 0);
            this.field7695 = new class288(this.field7689, 5126, 2, 12);
            this.field7582.method2703(7453, this);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "ha", descriptor = "(F)V")
    public final void method449(float arg0) {
        ++field7406;
        if (this.field7644 != arg0) {
            this.field7644 = arg0;
            this.method3151(123);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "C", descriptor = "(IIIIII)V")
    public final void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7557;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method3181((byte) 58);
        float var10 = (float) arg3 + var8;
        this.method3146(7261, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7655) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7655) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
    public final void method444(int arg0) {
        ++field7509;
        if (~arg0 <= -129 && arg0 <= 1024) {
            this.field7573 = arg0;
            this.field7583.method3843(-120);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lip;Lip;FLip;)Lip;")
    public final class662 method351(class662 arg0, class662 arg1, float arg2, class662 arg3) {
        ++field7539;
        if (arg0 != null && arg1 != null && this.field7628 && this.field7667) {
            class127 var5 = null;
            class58 var6 = (class58) arg0;
            class58 var7 = (class58) arg1;
            class51 var8 = var6.method499(-20699);
            class51 var9 = var7.method499(-20699);
            if (var8 != null && var9 != null) {
                int var10 = ~var8.field653 < ~var9.field653 ? var8.field653 : var9.field653;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class127) {
                    class127 var11 = (class127) arg3;
                    if (~var10 == ~var11.method830(-65535)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class127(this, var10);
                }
                if (var5.method831(arg2, var9, var8, false)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!jaa", name = "AA", descriptor = "(IIII)V")
    public final void method484(int arg0, int arg1, int arg2, int arg3) {
        this.field7658 = arg3;
        this.field7702 = true;
        this.field7678 = arg1;
        ++field7536;
        this.field7687 = arg0;
        this.field7637 = arg2;
        this.field7568.method261(0, false, (byte) -107, 0, 3, false);
        this.field7568.field584.method243(false);
        this.method3113(0);
        this.method3158((byte) -90);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public final class140 method412(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field7527;
        return new class30(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "(IZ)I")
    public final int method3155(int arg0, boolean arg1) {
        ++field7443;
        if (arg1) {
            this.field7607 = null;
        }
        if (~arg0 != -2) {
            if (~arg0 != -1) {
                if (~arg0 == -3) {
                    return 34165;
                } else if (arg0 == 3) {
                    return 260;
                } else if (arg0 == 4) {
                    return 34023;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                return 8448;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "(Z)V")
    private final void method3156(boolean arg0) {
        if (!arg0) {
            ++field7519;
            if (this.field7716 && !this.field7731) {
                OpenGL.glEnable(2896);
            } else {
                OpenGL.glDisable(2896);
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIIILfa;II)V")
    public final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class219 arg6, int arg7, int arg8) {
        ++field7448;
        class257 var10 = (class257) arg6;
        class148 var11 = var10.field3291;
        this.method3115((byte) 15);
        this.method3194((byte) 75, var10.field3291);
        this.method3146(7261, arg5);
        this.method3185(7681, 8448, (byte) 60);
        this.method3175(34167, 1, 0, 768);
        float var12 = var11.field1768 / (float) var11.field1767;
        float var13 = var11.field1762 / (float) var11.field1769;
        float var14 = (float) (-arg0) + (float) arg2;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var14 * var16;
        float var18 = var15 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (arg3 - arg8) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method3175(5890, 1, 0, 768);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lqh;Z)V")
    public final void method3157(class63 arg0, boolean arg1) {
        ++field7476;
        if (this.field7606 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field7606 <= -1) {
                this.field7604[this.field7606].method66(89);
            }
            this.field7602 = this.field7604[++this.field7606] = arg0;
            if (!arg1) {
                this.field7602.method80(115);
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIII)V")
    public final void method379(int arg0, int arg1, int arg2, int arg3) {
        ++field7410;
        this.field7569.method2529(arg2, arg0, 31, arg3, arg1);
    }

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "(IIIII)V")
    public final void method453(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        ++field7485;
        if (~this.field7661 >= ~(arg0 + arg2) && -arg2 + arg0 <= this.field7663 && ~this.field7620 >= ~(arg1 + arg2) && ~this.field7685 <= ~(arg1 - arg2)) {
            this.method3181((byte) 58);
            this.method3146(7261, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if (this.field7714 > (float) var8) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field7640 >= (float) var8) {
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
                int var10 = class217.method1256((byte) -64, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = 16384 - var10; var11 > 0; var11 -= var10) {
                    OpenGL.glVertex2f(class280.field3550[var11] * (float) arg2 + var6, class280.field3548[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "i", descriptor = "()V")
    public final void method401() {
        ++field7578;
    }

    @OriginalMember(owner = "client!jaa", name = "k", descriptor = "(B)V")
    private final void method3158(byte arg0) {
        if (this.field7639 && this.field7702 | ~this.field7701 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 > -88) {
            this.field7696 = 5;
        }
        ++field7459;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IF)V")
    public final void method3159(int arg0, float arg1) {
        if (this.field7635 != arg1) {
            this.field7635 = arg1;
            if (this.field7734 == 3) {
                this.method3161(false);
            }
        }
        ++field7451;
        if (arg0 != -4189) {
            this.method3152(56);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(II)I")
    public final int method469(int arg0, int arg1) {
        ++field7428;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(II)I")
    public final int method493(int arg0, int arg1) {
        ++field7505;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIII)V")
    public final void method435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7544;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        this.method3181((byte) 58);
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method3146(7261, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7655) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7655) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "()V")
    public final void method374() {
        this.field7569.method2526((byte) 71);
        ++field7565;
    }

    @OriginalMember(owner = "client!jaa", name = "l", descriptor = "(B)V")
    public final void method3160(byte arg0) {
        if (arg0 > -34) {
            this.field7695 = null;
        }
        if (~this.field7662 != -5) {
            this.method3193(-120);
            this.method3154(-4221, false);
            this.method3130(3156, false);
            this.method3168(-19170, false);
            this.method3174(false, -32);
            this.method3171(123, -2);
            this.method3146(7261, 1);
            this.field7662 = 4;
        }
        ++field7444;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I[Lbj;)V")
    public final void method473(int arg0, class227[] arg1) {
        for (int var3 = 0; ~var3 > ~arg0; ++var3) {
            this.field7669[var3] = arg1[var3];
        }
        ++field7470;
        this.field7652 = arg0;
        if (this.field7734 != 1) {
            this.method3112((byte) -36);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "(Z)V")
    private final void method3161(boolean arg0) {
        ++field7423;
        float var2 = (float) (-this.field7739) * this.field7635 / (float) this.field7633;
        float var3 = (float) (-this.field7638) * this.field7635 / (float) this.field7621;
        float var4 = (float) (-this.field7739 + this.field7466) * this.field7635 / (float) this.field7633;
        if (!arg0) {
            float var5 = (float) (-this.field7638 + this.field7403) * this.field7635 / (float) this.field7621;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (var2 != var4 && var3 != var5) {
                OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field7696 - this.field7703), (double) ((float) this.field7646 - this.field7703));
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IB)I")
    public final int method3162(int arg0, byte arg1) {
        if (arg1 != 89) {
            return 27;
        } else {
            ++field7416;
            if (arg0 != 6406 && ~arg0 != -6410) {
                if (~arg0 != -6411 && ~arg0 != -34847 && arg0 != 34844) {
                    if (~arg0 == -6408) {
                        return 3;
                    } else if (arg0 != 6408 && arg0 != 34847) {
                        if (arg0 != 34843) {
                            if (~arg0 != -34843) {
                                if (arg0 == 6402) {
                                    return 3;
                                } else if (~arg0 == -6402) {
                                    return 1;
                                } else {
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
                    return 2;
                }
            } else {
                return 1;
            }
        }
    }

    @OriginalMember(owner = "client!jaa", name = "l", descriptor = "()V")
    public final void method325() {
        ++field7531;
        if (this.field7719 && ~this.field7466 < -1 && ~this.field7403 < -1) {
            int var1 = this.field7661;
            int var2 = this.field7663;
            int var3 = this.field7620;
            int var4 = this.field7685;
            this.method410();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3192(false);
            this.method3154(-4221, false);
            this.method3130(3156, false);
            this.method3168(-19170, false);
            this.method3174(false, -32);
            this.method3194((byte) 75, (class185) null);
            this.method3171(122, -2);
            this.method3134(-101, 1);
            this.method3146(7261, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field7466, this.field7403, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method403(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "A", descriptor = "([I)V")
    public final void method478(int[] arg0) {
        arg0[1] = this.field7620;
        arg0[2] = this.field7663;
        ++field7488;
        arg0[3] = this.field7685;
        arg0[0] = this.field7661;
    }

    @OriginalMember(owner = "client!jaa", name = "SA", descriptor = "()I")
    public final int method380() {
        ++field7457;
        int var1 = this.field7743;
        this.field7743 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!jaa", name = "p", descriptor = "()Z")
    public final boolean method465() {
        ++field7426;
        return true;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method3181((byte) 58);
        ++field7543;
        this.method3146(7261, arg9);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "([Lba;Lig;Lq;[Lpo;I)V")
    public final void method480(class359[] arg0, class228 arg1, class396 arg2, class524[] arg3, int arg4) {
        ++field7528;
        this.method491(arg0, arg2, arg3, arg4);
        this.method485(arg1);
    }

    @OriginalMember(owner = "client!jaa", name = "m", descriptor = "(B)V")
    private final void method3163(byte arg0) {
        if (~this.field7661 >= ~this.field7663 && this.field7620 <= this.field7685) {
            OpenGL.glScissor(this.field7683 - -this.field7661, -this.field7685 + this.field7403 + this.field7700, this.field7663 - this.field7661, -this.field7620 + this.field7685);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        if (arg0 >= 67) {
            ++field7467;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILqh;)V")
    public final void method3164(int arg0, class63 arg1) {
        ++field7415;
        if (this.field7686) {
            this.method3143(arg1, -3);
            this.method3132(arg1, (byte) -44);
        } else {
            if (~this.field7601 > -1 || this.field7598[this.field7601] != arg1) {
                throw new RuntimeException();
            }
            this.field7598[this.field7601--] = null;
            arg1.method71(-18741);
            if (~this.field7601 > -1) {
                this.field7600 = this.field7602 = null;
            } else {
                this.field7600 = this.field7602 = this.field7598[this.field7601];
                this.field7600.method82((byte) 124);
            }
        }
        if (arg0 >= -38) {
            this.method3147(127);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "JA", descriptor = "(I)V")
    public final void method442(int arg0) {
        ++field7464;
        this.field7592 = 0;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field7592;
        }
        this.field7589 = 1 << this.field7592;
    }

    @OriginalMember(owner = "client!jaa", name = "p", descriptor = "(I)V")
    private final void method3165(int arg0) {
        ++field7407;
        if (arg0 == 13686) {
            OpenGL.glViewport(this.field7683, this.field7700, this.field7466, this.field7403);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "()Z")
    public final boolean method477() {
        ++field7435;
        return false;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IFF)V")
    public final void method3166(int arg0, float arg1, float arg2) {
        this.field7671 = arg1;
        ++field7564;
        this.field7737 = arg2;
        if (arg0 != 0) {
            this.method3164(-32, (class63) null);
        }
        if (!this.field7702) {
            this.method3113(0);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "q", descriptor = "(I)V")
    private final void method3167(int arg0) {
        ++field7497;
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef((float) arg0, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field7694.method577(arg0 + -171), 0);
        if (this.field7702) {
            this.field7568.field584.method243(false);
        }
        this.method3128(true);
        this.method3112((byte) -36);
    }

    @OriginalMember(owner = "client!jaa", name = "o", descriptor = "()V")
    public final void method318() throws class202 {
        ++field7552;
        try {
            this.field7442.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "(IZ)V")
    public final void method3168(int arg0, boolean arg1) {
        if (!arg1 != !this.field7665) {
            if (!arg1) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field7665 = arg1;
            this.field7662 &= -32;
        }
        if (arg0 != -19170) {
            this.method419();
        }
        ++field7473;
    }

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "(IIIIII)V")
    public final void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7518;
        this.method3181((byte) 58);
        this.method3146(7261, arg5);
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) arg3 - (float) arg1;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var10 = var8 * var9;
        float var11 = var7 * var9;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var11 + 0.35F, (float) arg3 + var10 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!jaa", name = "j", descriptor = "()Z")
    public final boolean method434() {
        ++field7427;
        return true;
    }

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "(Z)V")
    private final void method3169(boolean arg0) {
        if (arg0) {
            this.field7622 = (float) (this.field7661 - this.field7739);
            this.field7666 = (float) (this.field7685 - this.field7638);
            ++field7414;
            this.field7654 = (float) (-this.field7739 + this.field7663);
            this.field7676 = (float) (this.field7620 - this.field7638);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZZI)V")
    public final void method3170(boolean arg0, boolean arg1, int arg2) {
        this.method3148(arg1, (byte) -104, arg2, true);
        if (arg0) {
            this.method423();
        }
        ++field7515;
    }

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "(II)V")
    public final void method3171(int arg0, int arg1) {
        if (arg0 > 91) {
            this.method3170(false, true, arg1);
            ++field7567;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "E", descriptor = "()Z")
    public final boolean method404() {
        ++field7393;
        return true;
    }

    @OriginalMember(owner = "client!jaa", name = "FA", descriptor = "(IIIIII)Z")
    public final boolean method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7394;
        float var7 = (float) arg2 * this.field7694.field968 + (float) arg0 * this.field7694.field961 + (float) arg1 * this.field7694.field958 + this.field7694.field957;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field7694.field968 + (float) arg3 * this.field7694.field961 + (float) arg4 * this.field7694.field958 + this.field7694.field957;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field7696 > var7) || !((float) this.field7696 > var8)) && (!(var7 > (float) this.field7646) || !((float) this.field7646 < var8))) {
            int var9 = (int) (((float) arg2 * this.field7694.field954 + (float) arg0 * this.field7694.field967 + (float) arg1 * this.field7694.field955 + this.field7694.field972) * (float) this.field7633 / var7);
            int var10 = (int) (((float) arg5 * this.field7694.field954 + (float) arg3 * this.field7694.field967 + (float) arg4 * this.field7694.field955 + this.field7694.field972) * (float) this.field7633 / var8);
            if ((float) var9 < this.field7622 && (float) var10 < this.field7622 || this.field7654 < (float) var9 && this.field7654 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field7694.field962 + (float) arg0 * this.field7694.field966 + (float) arg1 * this.field7694.field973 + this.field7694.field944) * (float) this.field7621 / var7);
                int var12 = (int) (((float) arg5 * this.field7694.field962 + (float) arg3 * this.field7694.field966 + (float) arg4 * this.field7694.field973 + this.field7694.field944) * (float) this.field7621 / var8);
                return (!(this.field7676 > (float) var11) || !(this.field7676 > (float) var12)) && (!(this.field7666 < (float) var11) || !((float) var12 > this.field7666));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method439(Canvas arg0) {
        ++field7546;
        if (this.field7529 == arg0) {
            throw new RuntimeException();
        } else if (this.field7545.containsKey(arg0)) {
            Long var2 = (Long) this.field7545.get(arg0);
            this.field7442.releaseSurface(arg0, var2);
            this.field7545.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "(IIIII)V")
    public final void method454(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7453;
        this.method3181((byte) 58);
        this.method3146(7261, arg4);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIZ)Lxa;")
    public final class468 method441(int arg0, int arg1, boolean arg2) {
        ++field7495;
        return new class703(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaa", name = "n", descriptor = "(B)V")
    public final void method3172(byte arg0) {
        OpenGL.glPopMatrix();
        ++field7385;
        int var2 = -113 / ((78 - arg0) / 37);
    }

    @OriginalMember(owner = "client!jaa", name = "i", descriptor = "(II)I")
    public final int method3173(int arg0, int arg1) {
        if (arg1 != 1252738544) {
            return -77;
        } else {
            ++field7419;
            if (~arg0 != -5122 && ~arg0 != -5121) {
                if (~arg0 != -5124 && arg0 != 5122) {
                    if (~arg0 != -5126 && arg0 != 5124 && arg0 != 5126) {
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
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZI)V")
    public final void method3174(boolean arg0, int arg1) {
        if (arg1 != -32) {
            this.field7694 = null;
        }
        ++field7411;
        if (this.field7675 == !arg0) {
            this.field7675 = arg0;
            this.method3114((byte) -40);
            this.field7662 &= -32;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lub;[Liba;Z)Lta;")
    public final class201 method414(class20 arg0, class495[] arg1, boolean arg2) {
        ++field7572;
        return new class548(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "(IIII)V")
    public final void method3175(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
        if (arg1 != 1) {
            this.method3178(-94, 96);
        }
        ++field7576;
        OpenGL.glTexEnvi(8960, arg2 + 34192, arg3);
    }

    @OriginalMember(owner = "client!jaa", name = "F", descriptor = "()V")
    public final void method410() {
        this.field7663 = this.field7466;
        this.field7620 = 0;
        this.field7661 = 0;
        this.field7685 = this.field7403;
        ++field7441;
        OpenGL.glDisable(3089);
        this.method3169(true);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "()Z")
    public final boolean method471() {
        ++field7538;
        return this.field7562 != null && (~this.field7560 >= -2 || this.field7712);
    }

    @OriginalMember(owner = "client!jaa", name = "B", descriptor = "()V")
    public final void method322() {
        this.method3174(true, -32);
        ++field7492;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!jaa", name = "ma", descriptor = "(IIIIII[BII)V")
    public final void method443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field7507;
        float var10;
        float var11;
        if (this.field7706 != null && ~arg2 >= ~this.field7706.field1360 && ~this.field7706.field1361 <= ~arg3) {
            this.field7706.method765(arg2, 6406, 0, false, arg6, true, 0, arg3, 0, 0);
            var10 = (float) arg2 * this.field7706.field1768 / (float) this.field7706.field1360;
            var11 = (float) arg3 * this.field7706.field1762 / (float) this.field7706.field1361;
        } else {
            this.field7706 = class383.method2204(false, arg6, false, arg2, 6406, 6406, arg3, this);
            this.field7706.method758(48, false, false);
            var10 = this.field7706.field1768;
            var11 = this.field7706.field1762;
        }
        this.method3115((byte) 35);
        this.method3194((byte) 75, this.field7706);
        this.method3146(7261, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method3111(-15361, arg5);
        this.method3185(34165, 34165, (byte) 67);
        this.method3175(34166, 1, 0, 768);
        this.method3175(5890, 1, 2, 770);
        this.method3127(0, 770, 34166, 17111);
        this.method3127(2, 770, 5890, 17111);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        OpenGL.glBegin(7);
        float var15 = (float) arg3 + var13;
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var10);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var11, var10);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var11, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method3175(5890, 1, 0, 768);
        this.method3175(34166, 1, 2, 770);
        this.method3127(0, 770, 5890, 17111);
        this.method3127(2, 770, 34166, 17111);
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(IIIIII)Lip;")
    public final class662 method483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7418;
        return this.field7628 ? new class373(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
    }

    @OriginalMember(owner = "client!jaa", name = "LA", descriptor = "(IIII)V")
    public final void method456(int arg0, int arg1, int arg2, int arg3) {
        ++field7496;
        if (!this.field7702) {
            throw new RuntimeException("");
        } else {
            this.field7687 = arg0;
            this.field7658 = arg3;
            this.field7678 = arg1;
            this.field7637 = arg2;
            this.field7568.field584.method243(false);
            this.method3113(0);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(ILqh;)V")
    public final void method3176(int arg0, class63 arg1) {
        ++field7517;
        if (~this.field7603 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field7603 <= -1) {
                this.field7605[this.field7603].method63(-128);
            }
            if (arg0 > -98) {
                this.method3136(-39, (byte[]) null, -23, -107, false);
            }
            this.field7600 = this.field7605[++this.field7603] = arg1;
            this.field7600.method68((byte) -128);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIB)V")
    public final synchronized void method3177(int arg0, int arg1, byte arg2) {
        ++field7433;
        if (arg2 < 44) {
            this.field7654 = -0.8288919F;
        }
        class319 var4 = new class319(arg1);
        var4.field3321 = (long) arg0;
        this.field7614.method1904(var4, -90);
    }

    @OriginalMember(owner = "client!jaa", name = "j", descriptor = "(II)V")
    public final synchronized void method3178(int arg0, int arg1) {
        ++field7535;
        class263 var3 = new class263();
        var3.field3321 = (long) arg1;
        int var4 = -92 / ((arg0 - -88) / 35);
        this.field7618.method1904(var3, -16);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILad;)V")
    public final void method3179(int arg0, class393 arg1) {
        ++field7522;
        if (this.field7625 != arg1) {
            if (this.field7705) {
                OpenGL.glBindBufferARB(34962, arg1.method2233(84));
            }
            this.field7625 = arg1;
        }
        if (arg0 >= -49) {
            this.method475(-13, -8, 124, 0, -36, -34);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "r", descriptor = "(I)V")
    public final void method3180(int arg0) {
        OpenGL.glPushMatrix();
        ++field7439;
        if (arg0 >= -111) {
            this.method484(79, -20, 76, 107);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "KA", descriptor = "(IIII)[I")
    public final int[] method396(int arg0, int arg1, int arg2, int arg3) {
        ++field7554;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~var6 > ~arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field7403 + -var6, arg2, 1, 32993, this.field7726, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!jaa", name = "t", descriptor = "()Ltaa;")
    public final class379 method317() {
        ++field7475;
        int var1 = -1;
        if (this.field7656.indexOf("nvidia") != -1) {
            var1 = 4318;
        } else if (this.field7656.indexOf("intel") == -1) {
            if (~this.field7656.indexOf("ati") != 0) {
                var1 = 4098;
            }
        } else {
            var1 = 32902;
        }
        return new class379(var1, "OpenGL", this.field7632, this.field7659, 0L);
    }

    @OriginalMember(owner = "client!jaa", name = "aa", descriptor = "()I")
    public final int method460() {
        ++field7514;
        int var1 = this.field7742;
        this.field7742 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!jaa", name = "m", descriptor = "(IIII)V")
    public final void method450(int arg0, int arg1, int arg2, int arg3) {
        this.field7638 = arg1;
        this.field7621 = arg3;
        this.field7633 = arg2;
        ++field7438;
        this.field7739 = arg0;
        this.method3186(102);
        this.method3169(true);
        if (this.field7734 != 3) {
            if (~this.field7734 == -3) {
                this.method3152(6673);
                return;
            }
        } else {
            this.method3161(false);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "()Z")
    public final boolean method422() {
        ++field7392;
        return this.field7655 && (!this.method393() || this.field7712);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lip;)V")
    public final void method458(class662 arg0) {
        this.field7735 = (class58) arg0;
        ++field7506;
    }

    @OriginalMember(owner = "client!jaa", name = "o", descriptor = "(B)V")
    private final void method3181(byte arg0) {
        ++field7384;
        if (~this.field7662 != -2) {
            this.method3193(arg0 + -185);
            this.method3154(-4221, false);
            this.method3130(3156, false);
            this.method3168(-19170, false);
            this.method3174(false, arg0 + -90);
            this.method3194((byte) 75, (class185) null);
            this.method3171(102, -2);
            this.method3134(-51, 1);
            this.field7662 = 1;
        }
        if (arg0 != 58) {
            this.method405((Canvas) null);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "C", descriptor = "()Z")
    public final boolean method424() {
        ++field7484;
        return false;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)V")
    public final void method482(boolean arg0) {
        ++field7559;
    }

    @OriginalMember(owner = "client!jaa", name = "ka", descriptor = "(FF)V")
    public final void method406(float arg0, float arg1) {
        ++field7480;
        if (this.field7653 != arg0 || this.field7703 != arg1) {
            this.field7653 = arg0;
            this.field7703 = arg1;
            this.method3183(0);
            if (this.field7734 == 3) {
                this.method3161(false);
                return;
            }
            if (~this.field7734 != -3) {
                return;
            }
            this.method3152(6673);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(FFFI)V")
    private final void method3182(float arg0, float arg1, float arg2, int arg3) {
        OpenGL.glMatrixMode(5890);
        ++field7450;
        if (this.field7679) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg1, arg2, arg0);
        OpenGL.glMatrixMode(5888);
        this.field7679 = true;
        int var5 = 22 % ((88 - arg3) / 35);
    }

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "()Z")
    public final boolean method481() {
        ++field7479;
        return this.field7568.method260(Integer.MAX_VALUE, 3);
    }

    @OriginalMember(owner = "client!jaa", name = "na", descriptor = "(III[I)V")
    public final void method420(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7502;
        float var5 = (float) arg2 * this.field7694.field968 + (float) arg0 * this.field7694.field961 + (float) arg1 * this.field7694.field958 + this.field7694.field957;
        if (!(var5 < (float) this.field7696) && !((float) this.field7646 < var5)) {
            int var6 = (int) (((float) arg2 * this.field7694.field954 + (float) arg0 * this.field7694.field967 + (float) arg1 * this.field7694.field955 + this.field7694.field972) * (float) this.field7633 / var5);
            int var7 = (int) (((float) arg2 * this.field7694.field962 + (float) arg0 * this.field7694.field966 + (float) arg1 * this.field7694.field973 + this.field7694.field944) * (float) this.field7621 / var5);
            if (this.field7622 <= (float) var6 && this.field7654 >= (float) var6 && this.field7676 <= (float) var7 && (float) var7 <= this.field7666) {
                arg3[0] = (int) ((float) var6 + -this.field7622);
                arg3[1] = (int) ((float) var7 - this.field7676);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "r", descriptor = "()V")
    public final void method336() {
        ++field7566;
        if (this.field7667) {
            if (this.field7602 != this.field7597) {
                throw new RuntimeException();
            }
            this.field7597.method81(0, (byte) -112);
            this.field7597.method81(8, (byte) -70);
            this.method3164(-72, this.field7597);
        } else {
            if (!this.field7634) {
                throw new RuntimeException("");
            }
            this.field7599.method1546(0, 0, this.field7466, this.field7403, 0, 0);
            this.field7442.setSurface(this.field7489);
        }
        this.field7599 = null;
        this.field7403 = this.field7523;
        this.field7466 = this.field7430;
        this.method3192(false);
        this.method3165(13686);
        this.method410();
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lba;Lig;Lq;Lpo;I)V")
    public final void method427(class359 arg0, class228 arg1, class396 arg2, class524 arg3, int arg4) {
        arg0.method2049(arg2, arg3, arg4);
        ++field7525;
        this.method485(arg1);
    }

    @OriginalMember(owner = "client!jaa", name = "s", descriptor = "(I)V")
    private final void method3183(int arg0) {
        ++field7452;
        if ((float) arg0 == this.field7703) {
            this.field7681[14] = this.field7645;
            this.field7681[10] = this.field7660;
        } else {
            float var2 = this.field7653 / (this.field7703 + this.field7653);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field7645 * (1.0F - var2) / this.field7703;
            this.field7681[14] = this.field7645 * var3;
            this.field7681[10] = this.field7660 + var4;
        }
        this.field7682 = (this.field7681[14] - (float) this.field7646) / this.field7681[10];
        this.field7692 = (float) this.field7646 + -this.field7703;
    }

    @OriginalMember(owner = "client!jaa", name = "t", descriptor = "(I)V")
    private final void method3184(int arg0) {
        class624.field8475[arg0] = 1.0F;
        class624.field8475[2] = this.field7733 * this.field7728;
        class624.field8475[0] = this.field7728 * this.field7711;
        class624.field8475[1] = this.field7728 * this.field7650;
        ++field7530;
        OpenGL.glLightfv(16384, 4609, class624.field8475, 0);
        class624.field8475[1] = -this.field7729 * this.field7650;
        class624.field8475[0] = -this.field7729 * this.field7711;
        class624.field8475[2] = -this.field7729 * this.field7733;
        class624.field8475[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class624.field8475, 0);
    }

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(IIB)V")
    public final void method3185(int arg0, int arg1, byte arg2) {
        ++field7389;
        if (this.field7668 != 0) {
            OpenGL.glTexEnvi(8960, 34161, arg0);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        } else {
            boolean var4 = false;
            if (this.field7725 != arg0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                var4 = true;
                this.field7725 = arg0;
            }
            if (~this.field7740 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                var4 = true;
                this.field7740 = arg1;
            }
            if (var4) {
                this.field7662 &= -30;
            }
        }
        int var5 = -78 % ((arg2 - 4) / 39);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lxa;Z)V")
    public final void method369(class468 arg0, boolean arg1) {
        ++field7482;
        this.field7599 = (class703) arg0;
        if (!this.field7667) {
            if (!this.field7634) {
                throw new RuntimeException("");
            }
            class577 var3 = (class577) this.field7608.method3828((long) (this.field7599.method1556() << 16 | this.field7599.method1544()), (byte) -91);
            if (var3 == null) {
                var3 = new class577(this, this.field7599.method1556(), this.field7599.method1544());
                class577 var5;
                for (this.field7613 += var3.field7747 * 4; this.field7613 > 2097152; this.field7613 -= var5.field7747) {
                    class363 var4 = this.field7607.method2508(-6680);
                    if (var4 == null) {
                        break;
                    }
                    var5 = (class577) var4;
                    var5.method2110(115);
                    var5.method1566(-59);
                    this.field7442.releasePbuffer(var5.method3195(false));
                }
                this.field7608.method3832(var3, (long) (this.field7599.method1556() << 16 | this.field7599.method1544()), 67);
            }
            this.field7607.method2506(0, var3);
            this.field7442.setPbuffer(var3.method3195(false));
        } else {
            if (this.field7597 == null) {
                this.field7597 = new class14(this);
            }
            if (this.field7602 == this.field7597) {
                throw new RuntimeException();
            }
            this.method3119(this.field7597, -2015);
            if (arg1) {
                class130 var6 = (class130) this.field7608.method3828((long) (this.field7599.method1556() << 16 | this.field7599.method1544()), (byte) -91);
                if (var6 == null) {
                    var6 = new class130(this, 6402, this.field7599.method1556(), this.field7599.method1544());
                    class130 var8;
                    for (this.field7613 += var6.field1570; ~this.field7613 < -2097153; this.field7613 -= var8.field1570) {
                        class363 var7 = this.field7607.method2508(-6680);
                        if (var7 == null) {
                            break;
                        }
                        var8 = (class130) var7;
                        var8.method2110(93);
                        var8.method1566(-77);
                        var8.method841(0);
                    }
                    this.field7608.method3832(var6, (long) (this.field7599.method1556() << 16 | this.field7599.method1544()), 122);
                }
                this.field7607.method2506(0, var6);
                this.field7597.method64(8, 1, var6);
            }
            this.field7597.method72(-27902, 0, this.field7599.field9841);
        }
        this.field7466 = arg0.method1556();
        this.field7403 = arg0.method1544();
        this.method3192(false);
        this.method3165(13686);
        this.method410();
    }

    @OriginalMember(owner = "client!jaa", name = "u", descriptor = "()Z")
    public final boolean method419() {
        ++field7534;
        return true;
    }

    @OriginalMember(owner = "client!jaa", name = "u", descriptor = "(I)V")
    private final void method3186(int arg0) {
        ++field7424;
        float[] var2 = this.field7681;
        int var3 = -97 / ((arg0 - 36) / 42);
        float var4 = (float) (-this.field7739 * this.field7696) / (float) this.field7633;
        float var5 = (float) ((-this.field7739 + this.field7466) * this.field7696) / (float) this.field7633;
        float var6 = (float) (this.field7696 * this.field7638) / (float) this.field7621;
        float var7 = (float) ((-this.field7403 + this.field7638) * this.field7696) / (float) this.field7621;
        if (var4 != var5 && var6 != var7) {
            float var8 = (float) this.field7696 * 2.0F;
            var2[8] = (var4 + var5) / (var5 - var4);
            var2[4] = 0.0F;
            var2[11] = -1.0F;
            var2[7] = 0.0F;
            var2[2] = 0.0F;
            var2[5] = var8 / (-var7 + var6);
            var2[9] = (var6 + var7) / (-var7 + var6);
            var2[13] = 0.0F;
            var2[0] = var8 / (-var4 + var5);
            var2[12] = 0.0F;
            var2[3] = 0.0F;
            var2[14] = this.field7645 = -((float) this.field7646 * var8) / (float) (-this.field7696 + this.field7646);
            var2[10] = this.field7660 = (float) (-(this.field7696 + this.field7646)) / (float) (-this.field7696 + this.field7646);
            var2[1] = 0.0F;
            var2[15] = 0.0F;
            var2[6] = 0.0F;
        } else {
            var2[3] = 0.0F;
            var2[12] = 0.0F;
            var2[11] = 0.0F;
            var2[9] = 0.0F;
            var2[1] = 0.0F;
            var2[7] = 0.0F;
            var2[10] = 1.0F;
            var2[5] = 1.0F;
            var2[13] = 0.0F;
            var2[15] = 1.0F;
            var2[0] = 1.0F;
            var2[14] = 0.0F;
            var2[6] = 0.0F;
            var2[8] = 0.0F;
            var2[4] = 0.0F;
            var2[2] = 0.0F;
        }
        this.method3183(0);
    }

    @OriginalMember(owner = "client!jaa", name = "p", descriptor = "(B)Lgda;")
    public final class51 method3187(byte arg0) {
        int var2 = -92 % ((arg0 - 72) / 35);
        ++field7447;
        return this.field7735 != null ? this.field7735.method499(-20699) : null;
    }

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "(III)V")
    public final void method3188(int arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            this.field7625 = null;
        }
        this.field7700 = arg1;
        ++field7396;
        this.field7683 = arg0;
        this.method3165(13686);
        this.method3163((byte) 113);
    }

    @OriginalMember(owner = "client!jaa", name = "v", descriptor = "(I)V")
    public static void method3189(int arg0) {
        field7571 = null;
        field7563 = null;
        int var1 = -104 % ((-9 - arg0) / 50);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lq;)V")
    public final void method490(class396 arg0) {
        this.field7694 = (class73) arg0;
        ++field7588;
        this.field7670.method590(this.field7694, true);
        if (~this.field7734 != -2) {
            this.method3167(180);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "(Z)V")
    public final void method455(boolean arg0) {
        this.field7707 = arg0;
        ++field7493;
        this.method3114((byte) -43);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lce;ILce;Lce;Lce;)V")
    public final void method3190(class288 arg0, int arg1, class288 arg2, class288 arg3, class288 arg4) {
        ++field7429;
        if (arg3 != null) {
            this.method3179(-88, arg3.field3645);
            OpenGL.glVertexPointer(arg3.field3640, arg3.field3643, this.field7625.method2232((byte) -32), this.field7625.method2234((byte) -116) + (long) arg3.field3644);
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        if (arg4 != null) {
            this.method3179(arg1 ^ -32839, arg4.field3645);
            OpenGL.glNormalPointer(arg4.field3643, this.field7625.method2232((byte) -34), this.field7625.method2234((byte) -94) + (long) arg4.field3644);
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg2 != null) {
            this.method3179(-71, arg2.field3645);
            OpenGL.glColorPointer(arg2.field3640, arg2.field3643, this.field7625.method2232((byte) -38), this.field7625.method2234((byte) -91) + (long) arg2.field3644);
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg0 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method3179(arg1 + -32970, arg0.field3645);
            OpenGL.glTexCoordPointer(arg0.field3640, arg0.field3643, this.field7625.method2232((byte) 121), this.field7625.method2234((byte) -108) + (long) arg0.field3644);
            OpenGL.glEnableClientState(32888);
        }
        if (arg1 != 32885) {
            this.field7560 = -76;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(FFIFF)V")
    public final void method3191(float arg0, float arg1, int arg2, float arg3, float arg4) {
        class624.field8475[3] = arg0;
        class624.field8475[2] = arg4;
        ++field7581;
        class624.field8475[0] = arg1;
        if (arg2 != 32521) {
            this.field7725 = -20;
        }
        class624.field8475[1] = arg3;
        OpenGL.glTexEnvfv(8960, 8705, class624.field8475, 0);
    }

    @OriginalMember(owner = "client!jaa", name = "i", descriptor = "(Z)V")
    public final void method3192(boolean arg0) {
        if (~this.field7734 != -1) {
            this.field7734 = 0;
            this.field7662 &= -32;
        }
        if (!arg0) {
            ++field7417;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "A", descriptor = "()V")
    public final void method312() {
        ++field7575;
        OpenGL.glFinish();
    }

    @OriginalMember(owner = "client!jaa", name = "w", descriptor = "(I)V")
    private final void method3193(int arg0) {
        ++field7388;
        if (arg0 >= -93) {
            this.field7744 = null;
        }
        if (this.field7734 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field7466 < -1 && this.field7403 > 0) {
                OpenGL.glOrtho(0.0D, (double) this.field7466, (double) this.field7403, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field7734 = 1;
            this.field7662 &= -25;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BLtj;)V")
    public final void method3194(byte arg0, class185 arg1) {
        ++field7386;
        class185 var3 = this.field7704[this.field7668];
        if (arg1 != var3) {
            if (arg1 == null) {
                OpenGL.glDisable(var3.field2169);
            } else {
                if (var3 != null) {
                    if (~arg1.field2169 != ~var3.field2169) {
                        OpenGL.glDisable(var3.field2169);
                        OpenGL.glEnable(arg1.field2169);
                    }
                } else {
                    OpenGL.glEnable(arg1.field2169);
                }
                OpenGL.glBindTexture(arg1.field2169, arg1.method1099((byte) -123));
            }
            this.field7704[this.field7668] = arg1;
        }
        this.field7662 &= -2;
        if (arg0 != 75) {
            this.field7742 = 24;
        }
    }

    static {
        new class661("", 73);
        field7580 = 0;
        field7571 = new class98();
    }
}
