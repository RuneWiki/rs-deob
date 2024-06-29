import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeHeap;
import jaggl.memory.NativeStream;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class511 extends class162 {

    @OriginalMember(owner = "client!bo", name = "Id", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field7366 = new Hashtable();

    @OriginalMember(owner = "client!bo", name = "fe", descriptor = "I")
    public int field7389 = 128;

    @OriginalMember(owner = "client!bo", name = "he", descriptor = "Ltg;")
    private class153 field7391 = new class153();

    @OriginalMember(owner = "client!bo", name = "ne", descriptor = "Lik;")
    private class138 field7397 = new class138();

    @OriginalMember(owner = "client!bo", name = "oe", descriptor = "Lik;")
    public class138 field7398 = new class138();

    @OriginalMember(owner = "client!bo", name = "re", descriptor = "I")
    public int field7401 = 8;

    @OriginalMember(owner = "client!bo", name = "te", descriptor = "I")
    public int field7403 = 3;

    @OriginalMember(owner = "client!bo", name = "ve", descriptor = "Z")
    private boolean field7405 = false;

    @OriginalMember(owner = "client!bo", name = "qe", descriptor = "Lwl;")
    private class280 field7400 = new class280();

    @OriginalMember(owner = "client!bo", name = "xe", descriptor = "I")
    private int field7407 = -1;

    @OriginalMember(owner = "client!bo", name = "ze", descriptor = "[Leg;")
    private class69[] field7409 = new class69[4];

    @OriginalMember(owner = "client!bo", name = "ye", descriptor = "[Leg;")
    private class69[] field7408 = new class69[4];

    @OriginalMember(owner = "client!bo", name = "Be", descriptor = "[Leg;")
    private class69[] field7411 = new class69[4];

    @OriginalMember(owner = "client!bo", name = "Ce", descriptor = "I")
    private int field7412 = -1;

    @OriginalMember(owner = "client!bo", name = "Ae", descriptor = "I")
    private int field7410 = -1;

    @OriginalMember(owner = "client!bo", name = "Ge", descriptor = "Lwl;")
    private class280 field7416;

    @OriginalMember(owner = "client!bo", name = "Ie", descriptor = "Lwl;")
    private class280 field7418;

    @OriginalMember(owner = "client!bo", name = "Je", descriptor = "Lwl;")
    private class280 field7419;

    @OriginalMember(owner = "client!bo", name = "Ke", descriptor = "Lwl;")
    private class280 field7420;

    @OriginalMember(owner = "client!bo", name = "Le", descriptor = "Lwl;")
    private class280 field7421;

    @OriginalMember(owner = "client!bo", name = "Me", descriptor = "Lwl;")
    private class280 field7422;

    @OriginalMember(owner = "client!bo", name = "Ne", descriptor = "Lwl;")
    private class280 field7423;

    @OriginalMember(owner = "client!bo", name = "We", descriptor = "I")
    public int field7432;

    @OriginalMember(owner = "client!bo", name = "df", descriptor = "I")
    public int field7439;

    @OriginalMember(owner = "client!bo", name = "ff", descriptor = "Z")
    private boolean field7441;

    @OriginalMember(owner = "client!bo", name = "nf", descriptor = "I")
    public int field7448;

    @OriginalMember(owner = "client!bo", name = "uf", descriptor = "I")
    private int field7455;

    @OriginalMember(owner = "client!bo", name = "Qe", descriptor = "I")
    private int field7426;

    @OriginalMember(owner = "client!bo", name = "jf", descriptor = "F")
    public float field7444;

    @OriginalMember(owner = "client!bo", name = "If", descriptor = "I")
    public int field7469;

    @OriginalMember(owner = "client!bo", name = "Df", descriptor = "F")
    public float field7464;

    @OriginalMember(owner = "client!bo", name = "Xe", descriptor = "I")
    public int field7433;

    @OriginalMember(owner = "client!bo", name = "Kf", descriptor = "I")
    private int field7471;

    @OriginalMember(owner = "client!bo", name = "Ef", descriptor = "F")
    private float field7465;

    @OriginalMember(owner = "client!bo", name = "Nf", descriptor = "I")
    private int field7474;

    @OriginalMember(owner = "client!bo", name = "Zf", descriptor = "I")
    public int field7486;

    @OriginalMember(owner = "client!bo", name = "Pe", descriptor = "[F")
    private float[] field7425;

    @OriginalMember(owner = "client!bo", name = "qg", descriptor = "[F")
    private float[] field7503;

    @OriginalMember(owner = "client!bo", name = "yf", descriptor = "F")
    private float field7459;

    @OriginalMember(owner = "client!bo", name = "pg", descriptor = "I")
    public int field7502;

    @OriginalMember(owner = "client!bo", name = "Xf", descriptor = "I")
    public int field7484;

    @OriginalMember(owner = "client!bo", name = "Cf", descriptor = "[F")
    public float[] field7463;

    @OriginalMember(owner = "client!bo", name = "Re", descriptor = "[F")
    private float[] field7427;

    @OriginalMember(owner = "client!bo", name = "xf", descriptor = "I")
    public int field7458;

    @OriginalMember(owner = "client!bo", name = "bf", descriptor = "F")
    public float field7437;

    @OriginalMember(owner = "client!bo", name = "tf", descriptor = "F")
    public float field7454;

    @OriginalMember(owner = "client!bo", name = "jg", descriptor = "F")
    public float field7496;

    @OriginalMember(owner = "client!bo", name = "Tg", descriptor = "F")
    private float field7532;

    @OriginalMember(owner = "client!bo", name = "hg", descriptor = "F")
    public float field7494;

    @OriginalMember(owner = "client!bo", name = "kg", descriptor = "I")
    private int field7497;

    @OriginalMember(owner = "client!bo", name = "Ng", descriptor = "I")
    public int field7526;

    @OriginalMember(owner = "client!bo", name = "Dg", descriptor = "I")
    private int field7516;

    @OriginalMember(owner = "client!bo", name = "Yf", descriptor = "[F")
    private float[] field7485;

    @OriginalMember(owner = "client!bo", name = "Ve", descriptor = "I")
    private int field7431;

    @OriginalMember(owner = "client!bo", name = "Fg", descriptor = "F")
    public float field7518;

    @OriginalMember(owner = "client!bo", name = "Qg", descriptor = "[Lor;")
    private class451[] field7529;

    @OriginalMember(owner = "client!bo", name = "mg", descriptor = "F")
    public float field7499;

    @OriginalMember(owner = "client!bo", name = "Ig", descriptor = "I")
    private int field7521;

    @OriginalMember(owner = "client!bo", name = "Hg", descriptor = "I")
    private int field7520;

    @OriginalMember(owner = "client!bo", name = "eh", descriptor = "I")
    private int field7543;

    @OriginalMember(owner = "client!bo", name = "fh", descriptor = "I")
    public int field7544;

    @OriginalMember(owner = "client!bo", name = "ge", descriptor = "I")
    public int field7390;

    @OriginalMember(owner = "client!bo", name = "Zc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7331;

    @OriginalMember(owner = "client!bo", name = "G", descriptor = "Ljava/awt/Canvas;")
    private Canvas field7208;

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field7199;

    @OriginalMember(owner = "client!bo", name = "zd", descriptor = "J")
    private long field7357;

    @OriginalMember(owner = "client!bo", name = "Pc", descriptor = "J")
    private long field7321;

    @OriginalMember(owner = "client!bo", name = "gg", descriptor = "Z")
    public boolean field7493;

    @OriginalMember(owner = "client!bo", name = "gf", descriptor = "I")
    public int field7442;

    @OriginalMember(owner = "client!bo", name = "bg", descriptor = "Ljava/lang/String;")
    private String field7488;

    @OriginalMember(owner = "client!bo", name = "Pg", descriptor = "Z")
    public boolean field7528;

    @OriginalMember(owner = "client!bo", name = "Gg", descriptor = "Z")
    public boolean field7519;

    @OriginalMember(owner = "client!bo", name = "Wf", descriptor = "Z")
    private boolean field7483;

    @OriginalMember(owner = "client!bo", name = "zf", descriptor = "Z")
    public boolean field7460;

    @OriginalMember(owner = "client!bo", name = "af", descriptor = "Z")
    private boolean field7436;

    @OriginalMember(owner = "client!bo", name = "Ff", descriptor = "Ljava/lang/String;")
    private String field7466;

    @OriginalMember(owner = "client!bo", name = "xg", descriptor = "Z")
    public boolean field7510;

    @OriginalMember(owner = "client!bo", name = "vf", descriptor = "Z")
    private boolean field7456;

    @OriginalMember(owner = "client!bo", name = "ie", descriptor = "Luj;")
    public class259 field7392;

    @OriginalMember(owner = "client!bo", name = "pe", descriptor = "Lal;")
    public class65 field7399;

    @OriginalMember(owner = "client!bo", name = "me", descriptor = "Lmq;")
    private class351 field7396;

    @OriginalMember(owner = "client!bo", name = "le", descriptor = "Lvr;")
    private class89 field7395;

    @OriginalMember(owner = "client!bo", name = "je", descriptor = "Lho;")
    private class101 field7393;

    @OriginalMember(owner = "client!bo", name = "Xb", descriptor = "I")
    public static int field7277 = 1;

    @OriginalMember(owner = "client!bo", name = "Fc", descriptor = "I")
    public static int field7311 = 0;

    @OriginalMember(owner = "client!bo", name = "oc", descriptor = "Lwl;")
    public static class280 field7294 = new class280();

    @OriginalMember(owner = "client!bo", name = "Ye", descriptor = "F")
    public float field7434;

    @OriginalMember(owner = "client!bo", name = "rf", descriptor = "F")
    public float field7452;

    @OriginalMember(owner = "client!bo", name = "dg", descriptor = "F")
    public float field7490;

    @OriginalMember(owner = "client!bo", name = "ig", descriptor = "F")
    private float field7495;

    @OriginalMember(owner = "client!bo", name = "Cg", descriptor = "F")
    public float field7515;

    @OriginalMember(owner = "client!bo", name = "Lg", descriptor = "F")
    public float field7524;

    @OriginalMember(owner = "client!bo", name = "Og", descriptor = "F")
    private float field7527;

    @OriginalMember(owner = "client!bo", name = "Sg", descriptor = "F")
    private float field7531;

    @OriginalMember(owner = "client!bo", name = "Ug", descriptor = "F")
    public float field7533;

    @OriginalMember(owner = "client!bo", name = "Vg", descriptor = "F")
    public float field7534;

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!bo", name = "B", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!bo", name = "D", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!bo", name = "E", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!bo", name = "F", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!bo", name = "H", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!bo", name = "I", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!bo", name = "J", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!bo", name = "K", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!bo", name = "L", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!bo", name = "M", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!bo", name = "N", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!bo", name = "O", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!bo", name = "P", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!bo", name = "Q", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!bo", name = "R", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!bo", name = "S", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!bo", name = "T", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!bo", name = "U", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!bo", name = "V", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!bo", name = "W", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!bo", name = "X", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!bo", name = "Y", descriptor = "I")
    public int field7226;

    @OriginalMember(owner = "client!bo", name = "Z", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!bo", name = "ab", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!bo", name = "bb", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!bo", name = "cb", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!bo", name = "db", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!bo", name = "eb", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!bo", name = "fb", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!bo", name = "gb", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!bo", name = "hb", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!bo", name = "ib", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!bo", name = "jb", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!bo", name = "kb", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!bo", name = "lb", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!bo", name = "mb", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!bo", name = "nb", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!bo", name = "ob", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!bo", name = "pb", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!bo", name = "qb", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!bo", name = "rb", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!bo", name = "sb", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!bo", name = "tb", descriptor = "I")
    public static int field7247;

    @OriginalMember(owner = "client!bo", name = "ub", descriptor = "I")
    public static int field7248;

    @OriginalMember(owner = "client!bo", name = "vb", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!bo", name = "wb", descriptor = "I")
    public int field7250;

    @OriginalMember(owner = "client!bo", name = "xb", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!bo", name = "yb", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!bo", name = "zb", descriptor = "I")
    private int field7253;

    @OriginalMember(owner = "client!bo", name = "Ab", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!bo", name = "Bb", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!bo", name = "Cb", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!bo", name = "Db", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!bo", name = "Eb", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!bo", name = "Fb", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!bo", name = "Gb", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!bo", name = "Hb", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!bo", name = "Ib", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!bo", name = "Jb", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!bo", name = "Kb", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!bo", name = "Lb", descriptor = "I")
    public static int field7265;

    @OriginalMember(owner = "client!bo", name = "Mb", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!bo", name = "Nb", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!bo", name = "Ob", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!bo", name = "Pb", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!bo", name = "Qb", descriptor = "I")
    public static int field7270;

    @OriginalMember(owner = "client!bo", name = "Rb", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!bo", name = "Sb", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!bo", name = "Tb", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!bo", name = "Ub", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!bo", name = "Vb", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!bo", name = "Wb", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!bo", name = "Yb", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!bo", name = "Zb", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!bo", name = "ac", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!bo", name = "bc", descriptor = "I")
    public static int field7281;

    @OriginalMember(owner = "client!bo", name = "cc", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!bo", name = "dc", descriptor = "I")
    private int field7283;

    @OriginalMember(owner = "client!bo", name = "ec", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!bo", name = "fc", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!bo", name = "gc", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!bo", name = "hc", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!bo", name = "ic", descriptor = "I")
    public static int field7288;

    @OriginalMember(owner = "client!bo", name = "jc", descriptor = "I")
    public static int field7289;

    @OriginalMember(owner = "client!bo", name = "kc", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!bo", name = "lc", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!bo", name = "mc", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!bo", name = "nc", descriptor = "I")
    public static int field7293;

    @OriginalMember(owner = "client!bo", name = "pc", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!bo", name = "qc", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!bo", name = "rc", descriptor = "I")
    public static int field7297;

    @OriginalMember(owner = "client!bo", name = "sc", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!bo", name = "tc", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!bo", name = "uc", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!bo", name = "vc", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!bo", name = "wc", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!bo", name = "xc", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!bo", name = "yc", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!bo", name = "zc", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!bo", name = "Ac", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!bo", name = "Bc", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!bo", name = "Cc", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!bo", name = "Dc", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!bo", name = "Ec", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!bo", name = "Gc", descriptor = "I")
    public static int field7312;

    @OriginalMember(owner = "client!bo", name = "Hc", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!bo", name = "Ic", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!bo", name = "Jc", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!bo", name = "Kc", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!bo", name = "Lc", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!bo", name = "Mc", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!bo", name = "Nc", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!bo", name = "Oc", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!bo", name = "Qc", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!bo", name = "Rc", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!bo", name = "Sc", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!bo", name = "Tc", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!bo", name = "Uc", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!bo", name = "Vc", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!bo", name = "Wc", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!bo", name = "Xc", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!bo", name = "Yc", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!bo", name = "ad", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!bo", name = "bd", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!bo", name = "cd", descriptor = "I")
    public static int field7334;

    @OriginalMember(owner = "client!bo", name = "dd", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!bo", name = "ed", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!bo", name = "fd", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!bo", name = "gd", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!bo", name = "hd", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!bo", name = "id", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!bo", name = "jd", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!bo", name = "kd", descriptor = "I")
    public static int field7342;

    @OriginalMember(owner = "client!bo", name = "ld", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!bo", name = "md", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!bo", name = "nd", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!bo", name = "od", descriptor = "I")
    public static int field7346;

    @OriginalMember(owner = "client!bo", name = "pd", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!bo", name = "qd", descriptor = "I")
    public static int field7348;

    @OriginalMember(owner = "client!bo", name = "rd", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!bo", name = "sd", descriptor = "I")
    public static int field7350;

    @OriginalMember(owner = "client!bo", name = "td", descriptor = "I")
    public static int field7351;

    @OriginalMember(owner = "client!bo", name = "ud", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!bo", name = "vd", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!bo", name = "wd", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!bo", name = "xd", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!bo", name = "yd", descriptor = "I")
    public static int field7356;

    @OriginalMember(owner = "client!bo", name = "Ad", descriptor = "I")
    public static int field7358;

    @OriginalMember(owner = "client!bo", name = "Bd", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!bo", name = "Cd", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!bo", name = "Dd", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!bo", name = "Ed", descriptor = "I")
    public static int field7362;

    @OriginalMember(owner = "client!bo", name = "Fd", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!bo", name = "Gd", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!bo", name = "Hd", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!bo", name = "Jd", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!bo", name = "Kd", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!bo", name = "Ld", descriptor = "I")
    public static int field7369;

    @OriginalMember(owner = "client!bo", name = "Md", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!bo", name = "Nd", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!bo", name = "Od", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!bo", name = "Pd", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!bo", name = "Qd", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!bo", name = "Rd", descriptor = "I")
    public static int field7375;

    @OriginalMember(owner = "client!bo", name = "Sd", descriptor = "I")
    public static int field7376;

    @OriginalMember(owner = "client!bo", name = "Td", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!bo", name = "Ud", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!bo", name = "Vd", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!bo", name = "Wd", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!bo", name = "Xd", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!bo", name = "Yd", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!bo", name = "Zd", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!bo", name = "ae", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!bo", name = "be", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!bo", name = "ce", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!bo", name = "de", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!bo", name = "ee", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!bo", name = "ke", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!bo", name = "ue", descriptor = "I")
    public int field7404;

    @OriginalMember(owner = "client!bo", name = "Ee", descriptor = "I")
    private int field7414;

    @OriginalMember(owner = "client!bo", name = "Fe", descriptor = "I")
    public int field7415;

    @OriginalMember(owner = "client!bo", name = "He", descriptor = "I")
    public int field7417;

    @OriginalMember(owner = "client!bo", name = "Oe", descriptor = "I")
    private int field7424;

    @OriginalMember(owner = "client!bo", name = "Ze", descriptor = "I")
    public int field7435;

    @OriginalMember(owner = "client!bo", name = "kf", descriptor = "I")
    private int field7445;

    @OriginalMember(owner = "client!bo", name = "of", descriptor = "I")
    private int field7449;

    @OriginalMember(owner = "client!bo", name = "Gf", descriptor = "I")
    private int field7467;

    @OriginalMember(owner = "client!bo", name = "Mf", descriptor = "I")
    private int field7473;

    @OriginalMember(owner = "client!bo", name = "Pf", descriptor = "I")
    private int field7476;

    @OriginalMember(owner = "client!bo", name = "Vf", descriptor = "I")
    private int field7482;

    @OriginalMember(owner = "client!bo", name = "ag", descriptor = "I")
    private int field7487;

    @OriginalMember(owner = "client!bo", name = "eg", descriptor = "I")
    private int field7491;

    @OriginalMember(owner = "client!bo", name = "og", descriptor = "I")
    private int field7501;

    @OriginalMember(owner = "client!bo", name = "vg", descriptor = "I")
    private int field7508;

    @OriginalMember(owner = "client!bo", name = "Eg", descriptor = "I")
    private int field7517;

    @OriginalMember(owner = "client!bo", name = "Jg", descriptor = "I")
    public int field7522;

    @OriginalMember(owner = "client!bo", name = "Xg", descriptor = "I")
    private int field7536;

    @OriginalMember(owner = "client!bo", name = "Yg", descriptor = "I")
    public int field7537;

    @OriginalMember(owner = "client!bo", name = "dh", descriptor = "I")
    public int field7542;

    @OriginalMember(owner = "client!bo", name = "Sf", descriptor = "J")
    private long field7479;

    @OriginalMember(owner = "client!bo", name = "Ue", descriptor = "Lik;")
    public class138 field7430;

    @OriginalMember(owner = "client!bo", name = "Jf", descriptor = "Lik;")
    public class138 field7470;

    @OriginalMember(owner = "client!bo", name = "wf", descriptor = "Lgb;")
    private class142 field7457;

    @OriginalMember(owner = "client!bo", name = "cf", descriptor = "Lwr;")
    public class316 field7438;

    @OriginalMember(owner = "client!bo", name = "rg", descriptor = "Lwr;")
    public class316 field7504;

    @OriginalMember(owner = "client!bo", name = "Mg", descriptor = "Lwr;")
    public class316 field7525;

    @OriginalMember(owner = "client!bo", name = "wg", descriptor = "Lgk;")
    private class330 field7509;

    @OriginalMember(owner = "client!bo", name = "Se", descriptor = "Lve;")
    public class347 field7428;

    @OriginalMember(owner = "client!bo", name = "pf", descriptor = "Lve;")
    public class347 field7450;

    @OriginalMember(owner = "client!bo", name = "Af", descriptor = "Lve;")
    public class347 field7461;

    @OriginalMember(owner = "client!bo", name = "Bf", descriptor = "Lve;")
    public class347 field7462;

    @OriginalMember(owner = "client!bo", name = "Of", descriptor = "Lve;")
    public class347 field7475;

    @OriginalMember(owner = "client!bo", name = "Tf", descriptor = "Lve;")
    public class347 field7480;

    @OriginalMember(owner = "client!bo", name = "Uf", descriptor = "Lve;")
    public class347 field7481;

    @OriginalMember(owner = "client!bo", name = "ug", descriptor = "Lve;")
    public class347 field7507;

    @OriginalMember(owner = "client!bo", name = "Bg", descriptor = "Lve;")
    public class347 field7514;

    @OriginalMember(owner = "client!bo", name = "Zg", descriptor = "Lve;")
    public class347 field7538;

    @OriginalMember(owner = "client!bo", name = "zg", descriptor = "Lgs;")
    public class34 field7512;

    @OriginalMember(owner = "client!bo", name = "ah", descriptor = "Lgs;")
    public class34 field7539;

    @OriginalMember(owner = "client!bo", name = "cg", descriptor = "Lbf;")
    private class372 field7489;

    @OriginalMember(owner = "client!bo", name = "lg", descriptor = "Lrg;")
    private class453 field7498;

    @OriginalMember(owner = "client!bo", name = "ch", descriptor = "Lrg;")
    private class453 field7541;

    @OriginalMember(owner = "client!bo", name = "Lf", descriptor = "Lqh;")
    public class48 field7472;

    @OriginalMember(owner = "client!bo", name = "Rf", descriptor = "Lqh;")
    public class48 field7478;

    @OriginalMember(owner = "client!bo", name = "we", descriptor = "Leg;")
    private class69 field7406;

    @OriginalMember(owner = "client!bo", name = "De", descriptor = "Leg;")
    private class69 field7413;

    @OriginalMember(owner = "client!bo", name = "se", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field7402;

    @OriginalMember(owner = "client!bo", name = "Te", descriptor = "Z")
    public boolean field7429;

    @OriginalMember(owner = "client!bo", name = "ef", descriptor = "Z")
    public boolean field7440;

    @OriginalMember(owner = "client!bo", name = "hf", descriptor = "Z")
    private boolean field7443;

    @OriginalMember(owner = "client!bo", name = "lf", descriptor = "Z")
    public boolean field7446;

    @OriginalMember(owner = "client!bo", name = "mf", descriptor = "Z")
    public boolean field7447;

    @OriginalMember(owner = "client!bo", name = "qf", descriptor = "Z")
    public boolean field7451;

    @OriginalMember(owner = "client!bo", name = "sf", descriptor = "Z")
    private boolean field7453;

    @OriginalMember(owner = "client!bo", name = "Hf", descriptor = "Z")
    private boolean field7468;

    @OriginalMember(owner = "client!bo", name = "Qf", descriptor = "Z")
    private boolean field7477;

    @OriginalMember(owner = "client!bo", name = "ng", descriptor = "Z")
    private boolean field7500;

    @OriginalMember(owner = "client!bo", name = "sg", descriptor = "Z")
    public boolean field7505;

    @OriginalMember(owner = "client!bo", name = "tg", descriptor = "Z")
    private boolean field7506;

    @OriginalMember(owner = "client!bo", name = "yg", descriptor = "Z")
    public boolean field7511;

    @OriginalMember(owner = "client!bo", name = "Ag", descriptor = "Z")
    public boolean field7513;

    @OriginalMember(owner = "client!bo", name = "Kg", descriptor = "Z")
    private boolean field7523;

    @OriginalMember(owner = "client!bo", name = "Rg", descriptor = "Z")
    private boolean field7530;

    @OriginalMember(owner = "client!bo", name = "Wg", descriptor = "Z")
    private boolean field7535;

    @OriginalMember(owner = "client!bo", name = "bh", descriptor = "Z")
    private boolean field7540;

    @OriginalMember(owner = "client!bo", name = "fg", descriptor = "[Lnk;")
    private class501[] field7492;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(II)I", line = 5)
    public final int method2932(int arg0, int arg1) {
        ++field7365;
        if (arg1 != 8448) {
            this.method572(-126, -62, 125, -127);
        }
        if (~arg0 == -2) {
            return 7681;
        } else if (arg0 == 0) {
            return 8448;
        } else if (~arg0 != -3) {
            if (arg0 == 3) {
                return 260;
            } else if (arg0 == 4) {
                return 34023;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            return 34165;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V", line = 37)
    public final void method620(int arg0) {
        ++field7287;
        this.method2979((byte) 20);
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 46)
    public final void method595(Canvas arg0) {
        ++field7268;
        long var2 = 0L;
        if (arg0 != null && this.field7331 != arg0) {
            if (this.field7366.containsKey(arg0)) {
                Long var4 = (Long) this.field7366.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field7357;
        }
        if (~var2 == -1L) {
            throw new RuntimeException();
        } else {
            this.field7199.surfaceResized(var2);
            if (this.field7208 == arg0) {
                this.method2972(-14534);
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "da", descriptor = "(IIIII)V", line = 78)
    public final void method616(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7271;
        this.method2963((byte) -88);
        this.method2978(arg4, (byte) -77);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lwp;IIII)Lc;", line = 100)
    public final class121 method531(class118 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7276;
        return new class347(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)I", line = 115)
    private final int method2933(byte arg0) {
        ++field7308;
        this.field7466 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field7488 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field7466.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (~this.field7466.indexOf("brian paul") != 0 || ~this.field7466.indexOf("mesa") != 0) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class482.method2781(var3.replace('.', ' '), -22005, ' ');
        if (var4.length >= 2) {
            try {
                int var5 = class300.method1752(true, var4[0]);
                int var6 = class300.method1752(true, var4[1]);
                this.field7536 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (~this.field7536 > -13) {
            var2 |= 2;
        }
        if (!this.field7199.isExtensionAvailable("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field7199.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field7522 = var7[0];
        if (arg0 >= -64) {
            this.field7541 = null;
        }
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field7501 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field7467 = var7[0];
        if (this.field7522 < 2 || ~this.field7501 > -3 || ~this.field7467 > -3) {
            var2 |= 16;
        }
        this.field7493 = NativeStream.method2527();
        this.field7199.arePbuffersAvailable();
        this.field7483 = this.field7199.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        this.field7468 = this.field7199.isExtensionAvailable("GL_ARB_multisample");
        this.field7511 = this.field7199.isExtensionAvailable("GL_ARB_vertex_program");
        this.field7199.isExtensionAvailable("GL_ARB_fragment_program");
        this.field7440 = this.field7199.isExtensionAvailable("GL_ARB_vertex_shader");
        this.field7429 = this.field7199.isExtensionAvailable("GL_ARB_fragment_shader");
        this.field7519 = this.field7199.isExtensionAvailable("GL_EXT_texture3D");
        this.field7460 = this.field7199.isExtensionAvailable("GL_ARB_texture_rectangle");
        this.field7447 = this.field7199.isExtensionAvailable("GL_ARB_texture_cube_map");
        this.field7528 = this.field7199.isExtensionAvailable("GL_ARB_texture_float");
        this.field7505 = false;
        this.field7510 = this.field7199.isExtensionAvailable("GL_EXT_framebuffer_object");
        this.field7513 = this.field7199.isExtensionAvailable("GL_EXT_framebuffer_blit");
        this.field7446 = this.field7199.isExtensionAvailable("GL_EXT_framebuffer_multisample");
        this.field7477 = this.field7513 & this.field7446;
        return ~var2 == -1 ? 0 : var2;
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(II)V", line = 200)
    public final synchronized void method2934(int arg0, int arg1) {
        ++field7329;
        class387 var3 = new class387(arg1);
        if (arg0 <= 113) {
            this.method525(false);
        }
        this.field7420.method1666((byte) -53, var3);
    }

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "(II)V", line = 213)
    public final void method2935(int arg0, int arg1) {
        this.method2985(true, (byte) 122, arg1);
        if (arg0 == 47) {
            ++field7227;
        }
    }

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "(I)Lef;", line = 225)
    public final class336 method2936(int arg0) {
        if (arg0 != 0) {
            this.method545((class121[]) null, (class411) null, (class414) null, (class357[]) null, -99);
        }
        ++field7204;
        return this.field7489 == null ? null : this.field7489.method1904((byte) -34);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIZ)Lf;", line = 236)
    public final class529 method618(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field7330;
        return new class324(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)Ll;", line = 245)
    public final class16 method533(int arg0) {
        ++field7328;
        class204 var2 = new class204(arg0);
        this.field7400.method1666((byte) -50, var2);
        return var2;
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(Z)V", line = 257)
    public final void method2937(boolean arg0) {
        if (!arg0) {
            this.method536();
        }
        ++field7218;
        if (~this.field7487 != -3) {
            this.method3005(-15011);
            this.method2945(false, (byte) -80);
            this.method2969(false, 4940);
            this.method2982(false, 2929);
            this.method2951(false, 34018);
            this.method2935(47, -2);
            this.field7487 = 2;
        }
    }

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "()F", line = 279)
    public final float method584() {
        ++field7355;
        return this.field7534;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Leg;I)V", line = 288)
    public final void method2938(class69 arg0, int arg1) {
        if (arg1 == 10) {
            ++field7379;
            if (!this.field7513) {
                if (this.field7410 >= 3) {
                    throw new RuntimeException();
                } else {
                    if (this.field7410 >= 0) {
                        this.field7408[this.field7410].method359(-6728);
                    }
                    this.field7406 = this.field7413 = this.field7408[++this.field7410] = arg0;
                    this.field7406.method369(90);
                }
            } else {
                this.method3010((byte) -84, arg0);
                this.method2991(arg0, false);
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "(I)V", line = 316)
    private final void method2939(int arg0) {
        if (arg0 != 1833) {
            this.method570();
        }
        ++field7213;
        int var2 = 0;
        while (!this.field7199.attach()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class94.method674(1000L, 1);
        }
    }

    @OriginalMember(owner = "client!bo", name = "M", descriptor = "(I)V", line = 340)
    public final void method550(int arg0) {
        this.method2978(0, (byte) -105);
        ++field7275;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (arg0 & 255) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "(I)V", line = 352)
    private final void method2940(int arg0) {
        ++field7200;
        if (this.field7500 && this.field7451 | this.field7526 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        int var2 = -110 / ((-25 - arg0) / 63);
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "()I", line = 366)
    public final int method560() {
        ++field7367;
        return this.field7544;
    }

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "()V", line = 384)
    public final void method574() {
        ++field7211;
    }

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "(I)V", line = 392)
    private final void method2941(int arg0) {
        class177.field2572[3] = 1.0F;
        class177.field2572[0] = this.field7524 * this.field7518;
        ++field7359;
        class177.field2572[1] = this.field7524 * this.field7499;
        class177.field2572[2] = this.field7524 * this.field7496;
        OpenGL.glLightModelfv(2899, class177.field2572, 0);
        if (arg0 != -13474) {
            this.field7504 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "Z", descriptor = "(IIII)V", line = 411)
    public final void method590(int arg0, int arg1, int arg2, int arg3) {
        ++field7368;
        if (arg3 < this.field7474) {
            this.field7474 = arg3;
        }
        if (~this.field7543 > ~arg0) {
            this.field7543 = arg0;
        }
        if (~this.field7426 > ~arg1) {
            this.field7426 = arg1;
        }
        if (~this.field7521 < ~arg2) {
            this.field7521 = arg2;
        }
        OpenGL.glEnable(3089);
        this.method2992((byte) -39);
        this.method2996(0);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILeg;)V", line = 438)
    public final void method2942(int arg0, class69 arg1) {
        ++field7364;
        if (arg0 != 2) {
            this.field7517 = -100;
        }
        if (this.field7513) {
            this.method2983(arg1, (byte) 53);
            this.method2988(2, arg1);
        } else if (this.field7410 >= 0 && this.field7408[this.field7410] == arg1) {
            this.field7408[this.field7410--] = null;
            arg1.method359(-6728);
            if (this.field7410 < 0) {
                this.field7406 = this.field7413 = null;
            } else {
                this.field7406 = this.field7413 = this.field7408[this.field7410];
                this.field7406.method369(127);
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(FFZ)V", line = 475)
    public final void method2943(float arg0, float arg1, boolean arg2) {
        if (!arg2) {
            this.field7465 = arg0;
            ++field7318;
            this.field7532 = arg1;
            if (!this.field7451) {
                this.method2997((byte) -87);
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "W", descriptor = "()I", line = 491)
    public final int method607() {
        ++field7385;
        return this.field7433;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "()Lia;", line = 503)
    public final class414 method611() {
        ++field7300;
        return this.field7397;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(BII)V", line = 512)
    public final synchronized void method2944(byte arg0, int arg1, int arg2) {
        if (arg0 >= -70) {
            this.method2947(-0.5718979F, -101, -0.10588476F, 1.9099685F);
        }
        ++field7223;
        class387 var4 = new class387(arg2);
        var4.field622 = (long) arg1;
        this.field7418.method1666((byte) 104, var4);
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)V", line = 526)
    public final synchronized void method575(int arg0) {
        ++field7303;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field7418.method1664((byte) -123)) {
            class387 var12 = (class387) this.field7418.method1662((byte) 98);
            class261.field3465[var3++] = (int) var12.field622;
            this.field7417 -= var12.field5264;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class261.field3465, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class261.field3465, 0);
            var3 = 0;
        }
        while (!this.field7419.method1664((byte) -74)) {
            class387 var11 = (class387) this.field7419.method1662((byte) 98);
            class261.field3465[var3++] = (int) var11.field622;
            this.field7415 -= var11.field5264;
            if (~var3 == -1001) {
                OpenGL.glDeleteTextures(var3, class261.field3465, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteTextures(var3, class261.field3465, 0);
            var3 = 0;
        }
        while (!this.field7420.method1664((byte) -115)) {
            class387 var10 = (class387) this.field7420.method1662((byte) 96);
            class261.field3465[var3++] = var10.field5264;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class261.field3465, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var3, class261.field3465, 0);
            var3 = 0;
        }
        while (!this.field7421.method1664((byte) -63)) {
            class387 var9 = (class387) this.field7421.method1662((byte) 120);
            class261.field3465[var3++] = (int) var9.field622;
            this.field7414 -= var9.field5264;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class261.field3465, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class261.field3465, 0);
            boolean var4 = false;
        }
        while (!this.field7416.method1664((byte) -122)) {
            class387 var8 = (class387) this.field7416.method1662((byte) 94);
            OpenGL.glDeleteLists((int) var8.field622, var8.field5264);
        }
        while (!this.field7422.method1664((byte) -69)) {
            class42 var7 = this.field7422.method1662((byte) 113);
            OpenGL.glDeleteProgramARB((int) var7.field622);
        }
        while (!this.field7423.method1664((byte) -47)) {
            class42 var6 = this.field7423.method1662((byte) 125);
            OpenGL.glDeleteObjectARB(var6.field622);
        }
        while (!this.field7416.method1664((byte) -60)) {
            class387 var5 = (class387) this.field7416.method1662((byte) 108);
            OpenGL.glDeleteLists((int) var5.field622, var5.field5264);
        }
        this.field7392.method1565((byte) -84);
        if (this.method518() > 100663296 && this.field7479 - -60000L < class498.method2854(-116)) {
            System.gc();
            this.field7479 = class498.method2854(-119);
        }
        this.field7404 = var2;
    }

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "(FF)V", line = 689)
    public final void method568(float arg0, float arg1) {
        if (this.field7494 != arg0 || this.field7534 != arg1) {
            this.field7494 = arg0;
            this.field7534 = arg1;
            this.method2977((byte) -122);
            if (~this.field7445 == -4) {
                this.method2994(5889);
            } else if (~this.field7445 == -3) {
                this.method2984((byte) -79);
            }
        }
        ++field7229;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZB)V", line = 713)
    public final void method2945(boolean arg0, byte arg1) {
        if (arg1 > -66) {
            this.field7460 = true;
        }
        if (this.field7500 == !arg0) {
            this.field7500 = arg0;
            this.method2940(93);
            this.field7487 &= -32;
        }
        ++field7205;
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "()Z", line = 730)
    public final boolean method558() {
        ++field7374;
        return this.field7393.method712(true, 3);
    }

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "(I)V", line = 738)
    private final void method2946(int arg0) {
        ++field7306;
        if (this.field7445 != 2) {
            this.field7445 = 2;
            this.method2984((byte) -64);
            this.method2998(-6545);
            this.field7487 &= -8;
        }
        int var2 = 124 / ((arg0 - -13) / 36);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(FIFF)V", line = 757)
    private final void method2947(float arg0, int arg1, float arg2, float arg3) {
        OpenGL.glMatrixMode(5890);
        ++field7302;
        if (this.field7535) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg0, arg3, arg2);
        OpenGL.glMatrixMode(5888);
        if (arg1 <= -74) {
            this.field7535 = true;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 780)
    public final void method547(Canvas arg0) {
        ++field7197;
        if (this.field7331 == arg0) {
            throw new RuntimeException();
        } else if (!this.field7366.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field7199.prepareSurface(arg0);
                if (var4 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field7366.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "(I)V", line = 819)
    private final void method2948(int arg0) {
        ++field7242;
        if (this.field7540 && !this.field7453) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        if (arg0 != 2896) {
            this.field7511 = true;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILik;)V", line = 836)
    public final void method2949(int arg0, class138 arg1) {
        OpenGL.glLoadMatrixf(arg1.method984((byte) -70), 0);
        ++field7335;
        if (arg0 != -22822) {
            this.method2941(53);
        }
    }

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "(Lia;)V", line = 847)
    public final void method603(class414 arg0) {
        this.field7430 = (class138) arg0;
        ++field7378;
        this.field7470.method982(0, this.field7430);
        if (this.field7445 != 1) {
            this.method2998(-6545);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BIII)V", line = 864)
    public final void method2950(byte arg0, int arg1, int arg2, int arg3) {
        ++field7375;
        if (arg0 == -34) {
            OpenGL.glTexEnvi(8960, arg2 + 34184, arg3);
            OpenGL.glTexEnvi(8960, arg2 + 34200, arg1);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)V", line = 878)
    public final void method2951(boolean arg0, int arg1) {
        ++field7334;
        if (this.field7443 != arg0) {
            this.field7443 = arg0;
            this.method3008((byte) -38);
            this.field7487 &= -32;
        }
        if (arg1 != 34018) {
            this.field7544 = -81;
        }
    }

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "(I)V", line = 895)
    public final void method2952(int arg0) {
        ++field7247;
        if (arg0 == 1) {
            if (this.field7487 != 16) {
                this.method3001(arg0 ^ 2);
                this.method2945(true, (byte) -85);
                this.method2982(true, 2929);
                this.method2951(true, 34018);
                this.method2978(1, (byte) -65);
                this.method2976((byte) 40, 0);
                this.field7487 = 16;
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "()Z", line = 916)
    public final boolean method519() {
        ++field7301;
        return true;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IBII)V", line = 925)
    public final void method2953(int arg0, byte arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, 34176 - -arg0, arg3);
        ++field7291;
        if (arg1 <= 55) {
            this.method574();
        }
        OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
    }

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "(I)V", line = 937)
    private final void method2954(int arg0) {
        if (arg0 == 5890) {
            ++field7217;
            if (this.field7535) {
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5888);
                this.field7535 = false;
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "()V", line = 959)
    public final void method621() {
        if (this.field7395 != null && this.field7395.method1989(16777215)) {
            this.field7396.method2052(12259, this.field7395);
            this.field7392.method1567(114);
        }
        ++field7350;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIZILjaggl/memory/NativeBuffer;)Lrg;", line = 977)
    public final class453 method2955(int arg0, int arg1, boolean arg2, int arg3, NativeBuffer arg4) {
        if (arg0 != 34165) {
            this.field7482 = -90;
        }
        ++field7202;
        return (class453) (!this.field7483 || arg2 && !this.field7436 ? new class105(this, arg3, arg4) : new class184(this, arg3, arg4, arg1, arg2));
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(IIIIII)V", line = 998)
    public final void method614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7314;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method2963((byte) -88);
        this.method2978(arg5, (byte) -80);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7468) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7468) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lrg;B)V", line = 1030)
    public final void method2956(class453 arg0, byte arg1) {
        ++field7232;
        if (arg1 != -16) {
            this.method2978(-31, (byte) -96);
        }
        if (this.field7498 != arg0) {
            if (this.field7483) {
                OpenGL.glBindBufferARB(34962, arg0.method734(121));
            }
            this.field7498 = arg0;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z[BIIZ)Lgb;", line = 1049)
    public final class142 method2957(boolean arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        ++field7386;
        if (!arg0) {
            this.field7470 = null;
        }
        return (class142) (!this.field7483 || arg4 && !this.field7436 ? new class366(this, arg3, arg1, arg2) : new class171(this, arg3, arg1, arg2, arg4));
    }

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "(I)V", line = 1066)
    private final void method2958(int arg0) {
        this.field7430 = new class138();
        ++field7288;
        this.field7470 = new class138();
        this.field7492 = new class501[this.field7522];
        this.field7438 = new class316(this, 3553, 6408, 1, 1);
        this.field7504 = new class316(this, 3553, 6408, 1, 1);
        this.field7525 = new class316(this, 3553, 6408, arg0, 1);
        this.field7475 = new class347(this);
        this.field7480 = new class347(this);
        this.field7450 = new class347(this);
        this.field7461 = new class347(this);
        this.field7507 = new class347(this);
        this.field7514 = new class347(this);
        this.field7428 = new class347(this);
        this.field7538 = new class347(this);
        this.field7481 = new class347(this);
        this.field7462 = new class347(this);
        if (this.field7510) {
            this.field7478 = new class48(this);
            this.field7472 = new class48(this);
        }
    }

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "()V", line = 1095)
    public final void method615() {
        ++field7286;
        if (this.field7456 && ~this.field7226 < -1 && ~this.field7250 < -1) {
            int var1 = this.field7543;
            int var2 = this.field7521;
            int var3 = this.field7426;
            int var4 = this.field7474;
            this.method539();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method2995((byte) 36);
            this.method2945(false, (byte) -94);
            this.method2969(false, 4940);
            this.method2982(false, 2929);
            this.method2951(false, 34018);
            this.method2980((class501) null, 109);
            this.method2935(47, -2);
            this.method2976((byte) 42, 1);
            this.method2978(0, (byte) -35);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field7226, this.field7250, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method572(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IZIZ)V", line = 1139)
    public final void method2959(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (this.field7424 != arg0) {
            if (arg0 < 0) {
                this.method2954(5890);
                this.method2980((class501) null, 123);
                this.method2976((byte) 71, 0);
                if (!this.field7451) {
                    this.field7393.method715(false, arg1, arg3, 0);
                }
            } else {
                class316 var5 = this.field7392.method1566(arg0, (byte) 56);
                class278 var6 = super.field2375.method677(2459, arg0);
                if (~var6.field3648 == -1 && var6.field3643 == 0) {
                    this.method2954(5890);
                } else {
                    int var7 = var6.field3632 ? 64 : 128;
                    int var8 = var7 * 50;
                    this.method2947((float) (this.field7404 % var8 * var6.field3648) / (float) var8, -83, 0.0F, (float) (this.field7404 % var8 * var6.field3643) / (float) var8);
                }
                if (this.field7451) {
                    this.field7393.method715(false, arg1, arg3, 3);
                    this.method2980(var5, arg2 ^ -108);
                    this.method2976((byte) 35, var6.field3642);
                } else {
                    this.field7393.method715(false, arg1, arg3, var6.field3651);
                    this.field7393.method714(arg2 + 110, var6.field3634, var6.field3639);
                    if (!this.field7393.method713(var6.field3642, var5, (byte) 97)) {
                        this.method2980(var5, 117);
                        this.method2976((byte) 50, var6.field3642);
                    }
                }
            }
            this.field7424 = arg0;
        }
        ++field7267;
        this.field7487 &= arg2;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 1202)
    public final void method535(int arg0) {
        ++field7273;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "(I)V", line = 1212)
    private final void method2960(int arg0) {
        ++field7203;
        OpenGL.glViewport(this.field7520, this.field7471, this.field7226, this.field7250);
        if (arg0 != 18356) {
            this.field7331 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "()Z", line = 1223)
    public final boolean method557() {
        ++field7358;
        return true;
    }

    @OriginalMember(owner = "client!bo", name = "IA", descriptor = "(IIII)[I", line = 1231)
    public final int[] method562(int arg0, int arg1, int arg2, int arg3) {
        ++field7336;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; arg3 > var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + -var6 + this.field7250, arg2, 1, 32993, this.field7442, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bo", name = "fa", descriptor = "(IIII)V", line = 1253)
    public final void method521(int arg0, int arg1, int arg2, int arg3) {
        ++field7280;
        this.field7458 = arg2;
        this.field7451 = true;
        this.field7516 = arg1;
        this.field7542 = arg0;
        this.field7486 = arg3;
        this.field7393.method715(false, false, false, 3);
        this.field7393.field1495.method1657(2);
        this.method2997((byte) -113);
        this.method2940(123);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)I", line = 1271)
    public final int method564(int arg0, int arg1) {
        ++field7296;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)V", line = 1280)
    public final void method2961(byte arg0) {
        OpenGL.glPopMatrix();
        if (arg0 < 50) {
            this.method543();
        }
        ++field7261;
    }

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "(I)V", line = 1297)
    public static final void method2962(int arg0) {
        ++field7236;
        if (class127.field1854 != arg0) {
            try {
                if (~(++class234.field3149) < -1501) {
                    if (class304.field4004 != null) {
                        class304.field4004.method1886(-1);
                        class304.field4004 = null;
                    }
                    if (~class112.field1610 <= -2) {
                        class458.field6312 = -5;
                        class127.field1854 = 0;
                        return;
                    }
                    ++class112.field1610;
                    class127.field1854 = 1;
                    class234.field3149 = 0;
                    if (~class231.field3112 != ~class203.field2817) {
                        class231.field3112 = class203.field2817;
                    } else {
                        class231.field3112 = class330.field4351;
                    }
                }
                if (~class127.field1854 == -2) {
                    class354.field4786 = class389.field5281.method1376(arg0 + 1, class231.field3112, class356.field4806);
                    class127.field1854 = 2;
                }
                if (class127.field1854 == 2) {
                    if (~class354.field4786.field6100 == -3) {
                        throw new IOException();
                    }
                    if (class354.field4786.field6100 != 1) {
                        return;
                    }
                    class304.field4004 = new class326((Socket) class354.field4786.field6104, class389.field5281);
                    class354.field4786 = null;
                    class304.field4004.method1880(class193.field2708.field5152, 127, 0, class193.field2708.field5173);
                    class242.method1488((byte) 81);
                    int var1 = class304.field4004.method1887((byte) -123);
                    class242.method1488((byte) 81);
                    if (var1 != 101) {
                        class127.field1854 = 0;
                        class458.field6312 = var1;
                        class304.field4004.method1886(-1);
                        class304.field4004 = null;
                        return;
                    }
                    class127.field1854 = 3;
                }
                if (~class127.field1854 == -4) {
                    if (~class304.field4004.method1879(0) <= -3) {
                        int var2 = class304.field4004.method1887((byte) -121) << 8 | class304.field4004.method1887((byte) -122);
                        class163.method1102((byte) -115, var2);
                        if (class145.field2063 == -1) {
                            class458.field6312 = 6;
                            class127.field1854 = 0;
                            class304.field4004.method1886(-1);
                            class304.field4004 = null;
                        } else {
                            class127.field1854 = 0;
                            class304.field4004.method1886(~arg0);
                            class304.field4004 = null;
                            class99.method706((byte) -97);
                        }
                    }
                }
            } catch (IOException var3) {
                if (class304.field4004 != null) {
                    class304.field4004.method1886(-1);
                    class304.field4004 = null;
                }
                if (class112.field1610 < 1) {
                    if (~class231.field3112 != ~class203.field2817) {
                        class231.field3112 = class203.field2817;
                    } else {
                        class231.field3112 = class330.field4351;
                    }
                    ++class112.field1610;
                    class234.field3149 = 0;
                    class127.field1854 = 1;
                } else {
                    class127.field1854 = 0;
                    class458.field6312 = -4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)I", line = 1433)
    public final int method565(int arg0, int arg1) {
        ++field7353;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lc;Lpm;Lia;Lfo;I)V", line = 1441)
    public final void method534(class121 arg0, class411 arg1, class414 arg2, class357 arg3, int arg4) {
        ++field7312;
        arg0.method853(arg2, arg3, arg4);
        this.method582(arg1);
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)V", line = 1452)
    private final void method2963(byte arg0) {
        if (arg0 == -88) {
            ++field7215;
            if (this.field7487 != 1) {
                this.method3005(-15011);
                this.method2945(false, (byte) -120);
                this.method2969(false, arg0 ^ -4892);
                this.method2982(false, 2929);
                this.method2951(false, 34018);
                this.method2980((class501) null, arg0 + 198);
                this.method2935(47, -2);
                this.method2976((byte) 83, 1);
                this.field7487 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "()Z", line = 1478)
    public final boolean method569() {
        ++field7394;
        return true;
    }

    @OriginalMember(owner = "client!bo", name = "O", descriptor = "(IIIII)V", line = 1489)
    public final void method622(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7381;
        throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)I", line = 1501)
    public final int method2964(byte arg0, int arg1) {
        ++field7263;
        if (arg1 != 5121 && arg1 != 5120) {
            if (~arg1 != -5124 && arg1 != 5122) {
                if (arg0 <= 7) {
                    this.method2972(37);
                }
                if (~arg1 != -5126 && arg1 != 5124 && arg1 != 5126) {
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

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ll;)V", line = 1523)
    public final void method617(class16 arg0) {
        ++field7295;
        this.field7402 = ((class204) arg0).field2822;
        if (this.field7541 == null) {
            class182 var2 = new class182(80);
            if (!this.field7493) {
                var2.method1197(1495637648, -1.0F);
                var2.method1197(1495637648, -1.0F);
                var2.method1197(1495637648, 0.0F);
                var2.method1197(1495637648, 0.0F);
                var2.method1197(1495637648, 1.0F);
                var2.method1197(1495637648, 1.0F);
                var2.method1197(1495637648, -1.0F);
                var2.method1197(1495637648, 0.0F);
                var2.method1197(1495637648, 1.0F);
                var2.method1197(1495637648, 1.0F);
                var2.method1197(1495637648, 1.0F);
                var2.method1197(1495637648, 1.0F);
                var2.method1197(1495637648, 0.0F);
                var2.method1197(1495637648, 1.0F);
                var2.method1197(1495637648, 0.0F);
                var2.method1197(1495637648, -1.0F);
                var2.method1197(1495637648, 1.0F);
                var2.method1197(1495637648, 0.0F);
                var2.method1197(1495637648, 0.0F);
                var2.method1197(1495637648, 0.0F);
            } else {
                var2.method1194((byte) -86, -1.0F);
                var2.method1194((byte) -126, -1.0F);
                var2.method1194((byte) -77, 0.0F);
                var2.method1194((byte) 82, 0.0F);
                var2.method1194((byte) 98, 1.0F);
                var2.method1194((byte) 92, 1.0F);
                var2.method1194((byte) -56, -1.0F);
                var2.method1194((byte) 110, 0.0F);
                var2.method1194((byte) 105, 1.0F);
                var2.method1194((byte) -32, 1.0F);
                var2.method1194((byte) -103, 1.0F);
                var2.method1194((byte) 80, 1.0F);
                var2.method1194((byte) 126, 0.0F);
                var2.method1194((byte) 97, 1.0F);
                var2.method1194((byte) 111, 0.0F);
                var2.method1194((byte) -110, -1.0F);
                var2.method1194((byte) 79, 1.0F);
                var2.method1194((byte) -40, 0.0F);
                var2.method1194((byte) 78, 0.0F);
                var2.method1194((byte) -36, 0.0F);
            }
            this.field7541 = this.method2999(20, -126, false, var2.field5173, var2.field5152);
            this.field7539 = new class34(this, this.field7541, 5126, 3, 0);
            this.field7512 = new class34(this, this.field7541, 5126, 2, 12);
            this.field7391.method1051(this, 6411);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "([Lc;Lia;[Lfo;I)V", line = 1588)
    public final void method537(class121[] arg0, class414 arg1, class357[] arg2, int arg3) {
        ++field7290;
        for (int var5 = 0; var5 < arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method853(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lfq;Z)Lf;", line = 1606)
    public final class529 method596(class134 arg0, boolean arg1) {
        ++field7220;
        int[] var3 = new int[arg0.field1926 * arg0.field1925];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1920 != null) {
            for (int var6 = 0; ~arg0.field1925 < ~var6; ++var6) {
                for (int var7 = 0; var7 < arg0.field1926; ++var7) {
                    var3[var5++] = class191.method1230(arg0.field1921[class494.method2839(arg0.field1923[var4], 255)], arg0.field1920[var4] << 24);
                    ++var4;
                }
            }
        } else {
            for (int var8 = 0; ~var8 > ~arg0.field1925; ++var8) {
                for (int var10 = 0; ~var10 > ~arg0.field1926; ++var10) {
                    int var11 = arg0.field1921[arg0.field1923[var4++] & 255];
                    var3[var5++] = var11 != 0 ? class191.method1230(-16777216, var11) : 0;
                }
            }
        }
        class529 var9 = this.method598(var3, 0, arg0.field1926, arg0.field1926, arg0.field1925);
        var9.method152(arg0.field1919, arg0.field1922, arg0.field1924, arg0.field1918);
        return var9;
    }

    @OriginalMember(owner = "client!bo", name = "GA", descriptor = "(IIII)V", line = 1673)
    public final void method573(int arg0, int arg1, int arg2, int arg3) {
        this.field7469 = arg0;
        this.field7432 = arg1;
        this.field7502 = arg2;
        this.field7448 = arg3;
        ++field7297;
        this.method2974((byte) -97);
        this.method2992((byte) -39);
        if (this.field7445 == 3) {
            this.method2994(5889);
        } else if (this.field7445 == 2) {
            this.method2984((byte) -123);
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(III)V", line = 1697)
    public final synchronized void method2965(int arg0, int arg1, int arg2) {
        ++field7216;
        if (arg2 != 1) {
            this.field7503 = null;
        }
        class387 var4 = new class387(arg1);
        var4.field622 = (long) arg0;
        this.field7419.method1666((byte) 125, var4);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(FFFFI)V", line = 1713)
    public final void method2966(float arg0, float arg1, float arg2, float arg3, int arg4) {
        ++field7266;
        class177.field2572[0] = arg3;
        if (arg4 >= 68) {
            class177.field2572[3] = arg1;
            class177.field2572[1] = arg2;
            class177.field2572[2] = arg0;
            OpenGL.glTexEnvfv(8960, 8705, class177.field2572, 0);
        }
    }

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "([I)V", line = 1728)
    public final void method613(int[] arg0) {
        arg0[2] = this.field7521;
        ++field7383;
        arg0[0] = this.field7543;
        arg0[1] = this.field7426;
        arg0[3] = this.field7474;
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(IIIIII)Lto;", line = 1740)
    public final class8 method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7239;
        return !this.field7447 ? null : new class421(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZZB)V", line = 1751)
    public static final void method2967(boolean arg0, boolean arg1, byte arg2) {
        ++field7257;
        if (arg2 > -87) {
            field7277 = -81;
        }
        if (arg1) {
            ++class318.field4172;
            class336.method1923((byte) 51);
        }
        if (arg0) {
            ++class119.field1742;
            class217.method1382(-14730);
        }
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(B)V", line = 1775)
    public final void method2968(byte arg0) {
        OpenGL.glLightfv(16384, 4611, this.field7463, 0);
        ++field7338;
        OpenGL.glLightfv(16385, 4611, this.field7485, 0);
        int var2 = -40 / ((arg0 - -26) / 61);
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(ZI)V", line = 1786)
    public final void method2969(boolean arg0, int arg1) {
        ++field7372;
        if (arg1 != 4940) {
            this.field7482 = -59;
        }
        if (arg0 == !this.field7540) {
            this.field7540 = arg0;
            this.method2948(2896);
            this.field7487 &= -8;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(JI)V", line = 1806)
    public final synchronized void method2970(long arg0, int arg1) {
        ++field7339;
        class42 var4 = new class42();
        if (arg1 != 1) {
            this.field7486 = -20;
        }
        var4.field622 = arg0;
        this.field7423.method1666((byte) -112, var4);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IILgb;II)V", line = 1820)
    public final void method2971(int arg0, int arg1, class142 arg2, int arg3, int arg4) {
        ++field7382;
        if (arg3 == 7629) {
            int var6 = arg2.method998(-20737);
            int var7 = arg0 * this.method2964((byte) 99, var6);
            this.method3009((byte) 111, arg2);
            OpenGL.glDrawElements(arg4, arg1, var6, (long) var7 + arg2.method997(arg3 ^ -20932));
        }
    }

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "(I)V", line = 1837)
    private final void method2972(int arg0) {
        ++field7356;
        if (this.field7208 == null) {
            this.field7283 = this.field7253 = 0;
        } else {
            Dimension var2 = this.field7208.getSize();
            this.field7283 = var2.width;
            this.field7253 = var2.height;
        }
        if (this.field7413 == null) {
            this.field7226 = this.field7283;
            this.field7250 = this.field7253;
            this.method2960(18356);
        }
        if (arg0 == -14534) {
            this.method2995((byte) 36);
            this.method539();
        }
    }

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "()V", line = 1866)
    public final void method600() {
        this.method2951(true, 34018);
        ++field7313;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "(B)V", line = 1877)
    public final void method2973(byte arg0) {
        if (arg0 < 43) {
            this.field7420 = null;
        }
        ++field7293;
        if (this.field7487 != 8) {
            this.method2946(-56);
            this.method2945(true, (byte) -95);
            this.method2982(true, 2929);
            this.method2951(true, 34018);
            this.method2978(1, (byte) -125);
            this.method2976((byte) 103, 0);
            this.field7487 = 8;
        }
    }

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "(B)V", line = 1905)
    private final void method2974(byte arg0) {
        ++field7370;
        float[] var2 = this.field7427;
        float var3 = (float) (-this.field7469 * this.field7544) / (float) this.field7502;
        float var4 = (float) ((-this.field7469 + this.field7226) * this.field7544) / (float) this.field7502;
        if (arg0 <= -40) {
            float var5 = (float) (this.field7544 * this.field7432) / (float) this.field7448;
            float var6 = (float) ((this.field7432 - this.field7250) * this.field7544) / (float) this.field7448;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field7544 * 2.0F;
                var2[4] = 0.0F;
                var2[8] = (var3 + var4) / (var4 - var3);
                var2[10] = this.field7527 = (float) (-(this.field7433 - -this.field7544)) / (float) (this.field7433 - this.field7544);
                var2[15] = 0.0F;
                var2[13] = 0.0F;
                var2[11] = -1.0F;
                var2[12] = 0.0F;
                var2[0] = var7 / (-var3 + var4);
                var2[14] = this.field7495 = -((float) this.field7433 * var7) / (float) (-this.field7544 + this.field7433);
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[6] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[3] = 0.0F;
                var2[1] = 0.0F;
            } else {
                var2[0] = 1.0F;
                var2[3] = 0.0F;
                var2[14] = 0.0F;
                var2[6] = 0.0F;
                var2[13] = 0.0F;
                var2[1] = 0.0F;
                var2[10] = 1.0F;
                var2[4] = 0.0F;
                var2[2] = 0.0F;
                var2[15] = 1.0F;
                var2[9] = 0.0F;
                var2[5] = 1.0F;
                var2[12] = 0.0F;
                var2[7] = 0.0F;
                var2[8] = 0.0F;
                var2[11] = 0.0F;
            }
            this.method2977((byte) -121);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lgs;Lgs;Lgs;Lgs;I)V", line = 1967)
    public final void method2975(class34 arg0, class34 arg1, class34 arg2, class34 arg3, int arg4) {
        int var6 = 116 % ((arg4 - 2) / 45);
        if (arg1 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method2956(arg1.field546, (byte) -16);
            OpenGL.glVertexPointer(arg1.field550, arg1.field545, this.field7498.method736((byte) -19), this.field7498.method732(-7561) - -((long) arg1.field548));
            OpenGL.glEnableClientState(32884);
        }
        ++field7259;
        if (arg2 != null) {
            this.method2956(arg2.field546, (byte) -16);
            OpenGL.glNormalPointer(arg2.field545, this.field7498.method736((byte) -19), this.field7498.method732(-7561) - -((long) arg2.field548));
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg3 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method2956(arg3.field546, (byte) -16);
            OpenGL.glColorPointer(arg3.field550, arg3.field545, this.field7498.method736((byte) -19), this.field7498.method732(-7561) + (long) arg3.field548);
            OpenGL.glEnableClientState(32886);
        }
        if (arg0 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method2956(arg0.field546, (byte) -16);
            OpenGL.glTexCoordPointer(arg0.field550, arg0.field545, this.field7498.method736((byte) -19), this.field7498.method732(-7561) + (long) arg0.field548);
            OpenGL.glEnableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "()Z", line = 2012)
    public final boolean method554() {
        ++field7333;
        return this.field7395 != null && (this.field7390 <= 1 || this.field7477);
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(BI)V", line = 2021)
    public final void method2976(byte arg0, int arg1) {
        if (arg0 < 34) {
            this.method609(-78, (class451[]) null);
        }
        if (~arg1 != -2) {
            if (arg1 == 0) {
                this.method3002((byte) -87, 8448, 8448);
            } else if (arg1 != 2) {
                if (arg1 != 3) {
                    if (arg1 == 4) {
                        this.method3002((byte) -89, 34023, 34023);
                    }
                } else {
                    this.method3002((byte) -71, 260, 8448);
                }
            } else {
                this.method3002((byte) -82, 34165, 7681);
            }
        } else {
            this.method3002((byte) -127, 7681, 7681);
        }
        ++field7212;
    }

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "(B)V", line = 2050)
    private final void method2977(byte arg0) {
        ++field7377;
        if (arg0 < -117) {
            if (this.field7534 == 0.0F) {
                this.field7427[10] = this.field7527;
                this.field7427[14] = this.field7495;
            } else {
                float var2 = this.field7494 / (this.field7534 + this.field7494);
                float var3 = var2 * var2;
                float var4 = (1.0F - var2) * -this.field7495 * (1.0F - var2) / this.field7534;
                this.field7427[14] = this.field7495 * var3;
                this.field7427[10] = this.field7527 + var4;
            }
            this.field7437 = (float) this.field7433 + -this.field7534;
            this.field7444 = (this.field7427[14] - (float) this.field7433) / this.field7427[10];
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIIIIIII)V", line = 2083)
    public final void method552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field7345;
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(Z)V", line = 2095)
    public final void method624(boolean arg0) {
        ++field7279;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IB)V", line = 2102)
    public final void method2978(int arg0, byte arg1) {
        if (~this.field7476 != ~arg0) {
            byte var3;
            boolean var4;
            boolean var5;
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -129) {
                        var3 = 0;
                        var4 = true;
                        var5 = false;
                    } else {
                        var5 = true;
                        var3 = 3;
                        var4 = true;
                    }
                } else {
                    var4 = true;
                    var5 = false;
                    var3 = 2;
                }
            } else {
                var5 = true;
                var3 = 1;
                var4 = true;
            }
            if (!this.field7523 != !var4) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field7523 = var4;
            }
            if (this.field7506 == !var5) {
                if (var5) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field7506 = var5;
            }
            if (~this.field7473 != ~var3) {
                if (var3 != 1) {
                    if (var3 == 2) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    } else if (var3 == 3) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    } else {
                        OpenGL.glDisable(3042);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field7473 = var3;
            }
            this.field7476 = arg0;
            this.field7487 &= -29;
        }
        if (arg1 >= -34) {
            this.field7479 = -109L;
        }
        ++field7265;
    }

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "()Z", line = 2196)
    public final boolean method520() {
        ++field7369;
        return true;
    }

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "(B)V", line = 2204)
    private final void method2979(byte arg0) {
        if (arg0 != 20) {
            this.field7415 = -3;
        }
        ++field7351;
        this.field7199.detach();
    }

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "()Z", line = 2215)
    public final boolean method604() {
        ++field7388;
        return this.field7468 && (!this.method581() || this.field7477);
    }

    @OriginalMember(owner = "client!bo", name = "na", descriptor = "(I)V", line = 2223)
    public final void method626(int arg0) {
        ++field7309;
        this.field7403 = 0;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field7403;
        }
        this.field7401 = 1 << this.field7403;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lnk;I)V", line = 2240)
    public final void method2980(class501 arg0, int arg1) {
        ++field7274;
        class501 var3 = this.field7492[this.field7517];
        if (arg1 >= 107) {
            if (arg0 != var3) {
                if (arg0 == null) {
                    OpenGL.glDisable(var3.field6920);
                } else {
                    if (var3 == null) {
                        OpenGL.glEnable(arg0.field6920);
                    } else if (arg0.field6920 != var3.field6920) {
                        OpenGL.glDisable(var3.field6920);
                        OpenGL.glEnable(arg0.field6920);
                    }
                    OpenGL.glBindTexture(arg0.field6920, arg0.method2864((byte) 119));
                }
                this.field7492[this.field7517] = arg0;
            }
            this.field7487 &= -2;
        }
    }

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "(II)I", line = 2278)
    public final int method2981(int arg0, int arg1) {
        int var3 = -93 % ((arg0 - 52) / 42);
        ++field7332;
        if (arg1 != 6406 && arg1 != 6409) {
            if (arg1 != 6410 && ~arg1 != -34847 && ~arg1 != -34845) {
                if (arg1 == 6407) {
                    return 3;
                } else if (arg1 != 6408 && arg1 != 34847) {
                    if (arg1 != 34843) {
                        if (~arg1 != -34843) {
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

    @OriginalMember(owner = "client!bo", name = "ba", descriptor = "(IIII)V", line = 2319)
    public final void method540(int arg0, int arg1, int arg2, int arg3) {
        ++field7341;
        if (!this.field7451) {
            throw new RuntimeException("");
        } else {
            this.field7486 = arg3;
            this.field7458 = arg2;
            this.field7516 = arg1;
            this.field7542 = arg0;
            this.field7393.field1495.method1657(2);
            this.method2997((byte) 126);
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(ZI)V", line = 2338)
    public final void method2982(boolean arg0, int arg1) {
        if (arg1 == 2929) {
            if (arg0 == !this.field7530) {
                if (!arg0) {
                    OpenGL.glDisable(2929);
                } else {
                    OpenGL.glEnable(2929);
                }
                this.field7530 = arg0;
                this.field7487 &= -32;
            }
            ++field7248;
        }
    }

    @OriginalMember(owner = "client!bo", name = "ia", descriptor = "(III[I)V", line = 2362)
    public final void method526(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7228;
        float var5 = (float) arg2 * this.field7430.field1963 + (float) arg0 * this.field7430.field1988 + (float) arg1 * this.field7430.field1975 + this.field7430.field1980;
        if (!((float) this.field7544 > var5) && !(var5 > (float) this.field7433)) {
            int var6 = (int) (((float) arg2 * this.field7430.field1987 + (float) arg0 * this.field7430.field1977 + (float) arg1 * this.field7430.field1979 + this.field7430.field1964) * (float) this.field7502 / var5);
            int var7 = (int) (((float) arg2 * this.field7430.field1965 + (float) arg0 * this.field7430.field1973 + (float) arg1 * this.field7430.field1970 + this.field7430.field1993) * (float) this.field7448 / var5);
            if (this.field7515 <= (float) var6 && (float) var6 <= this.field7434 && this.field7490 <= (float) var7 && (float) var7 <= this.field7533) {
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 - this.field7490);
                arg3[0] = (int) ((float) var6 + -this.field7515);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Leg;B)V", line = 2392)
    public final void method2983(class69 arg0, byte arg1) {
        ++field7251;
        if (this.field7412 >= 0 && this.field7411[this.field7412] == arg0) {
            this.field7411[this.field7412--] = null;
            arg0.method368(54);
            if (arg1 < 38) {
                this.field7463 = null;
            }
            if (~this.field7412 <= -1) {
                this.field7406 = this.field7411[this.field7412];
                this.field7406.method356(7797);
            } else {
                this.field7406 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "()I", line = 2419)
    public final int method523() {
        ++field7278;
        int var1 = this.field7491;
        this.field7491 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "(B)V", line = 2430)
    private final void method2984(byte arg0) {
        int var2 = 65 % ((-5 - arg0) / 56);
        ++field7262;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadMatrixf(this.field7427, 0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "()Z", line = 2444)
    public final boolean method543() {
        ++field7289;
        return true;
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(IIIIII)V", line = 2452)
    public final void method563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2963((byte) -88);
        ++field7224;
        this.method2978(arg5, (byte) -54);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lto;)V", line = 2468)
    public final void method527(class8 arg0) {
        ++field7240;
        this.field7489 = (class372) arg0;
    }

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "()V", line = 2476)
    public final void method579() {
        this.field7396.method2059((byte) 5);
        ++field7198;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZBI)V", line = 2489)
    public final void method2985(boolean arg0, byte arg1, int arg2) {
        ++field7258;
        int var4 = -98 / ((62 - arg1) / 41);
        this.method2959(arg2, true, -8, arg0);
    }

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "()V", line = 2499)
    public final void method571() {
        ++field7326;
        for (class42 var1 = this.field7400.method1672((byte) -100); var1 != null; var1 = this.field7400.method1668(-1)) {
            ((class204) var1).method1308(-257);
        }
        if (this.field7396 != null) {
            this.field7396.method2051(-23245);
        }
        if (this.field7199 != null) {
            this.method2979((byte) 20);
            Enumeration var2 = this.field7366.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field7366.get(var3);
                this.field7199.releaseSurface(var3, var4);
            }
            this.field7199.release();
            this.field7199 = null;
        }
        if (this.field7405) {
            class298.method1743(true, true, 69);
            this.field7405 = false;
        }
    }

    @OriginalMember(owner = "client!bo", name = "xa", descriptor = "()I", line = 2545)
    public final int method619() {
        ++field7207;
        int var1 = this.field7449;
        this.field7449 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(IB)V", line = 2556)
    public final void method2986(int arg0, byte arg1) {
        if (arg1 != -58) {
            this.method2997((byte) 2);
        }
        ++field7387;
        class177.field2572[1] = (float) class494.method2839(arg0, 65280) / 65280.0F;
        class177.field2572[2] = (float) class494.method2839(arg0, 255) / 255.0F;
        class177.field2572[0] = (float) class494.method2839(16711680, arg0) / 1.671168E7F;
        class177.field2572[3] = (float) (arg0 >>> 24) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class177.field2572, 0);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(FB)V", line = 2575)
    public final void method2987(float arg0, byte arg1) {
        if (arg1 <= 105) {
            this.method2987(-0.11749051F, (byte) 7);
        }
        ++field7327;
        if (this.field7459 != arg0) {
            this.field7459 = arg0;
            if (this.field7445 == 3) {
                this.method2994(5889);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(ILeg;)V", line = 2593)
    public final void method2988(int arg0, class69 arg1) {
        ++field7196;
        if (~this.field7407 <= -1 && this.field7409[this.field7407] == arg1) {
            this.field7409[this.field7407--] = null;
            arg1.method367((byte) 46);
            if (arg0 != 2) {
                this.method610(69, -40, -41, -57, 52, -22);
            }
            if (~this.field7407 <= -1) {
                this.field7413 = this.field7409[this.field7407];
                this.field7413.method351(false);
            } else {
                this.field7413 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "(I)V", line = 2617)
    private final void method2989(int arg0) {
        if (arg0 == 8448) {
            ++field7272;
            int var2;
            for (var2 = 0; ~var2 > ~this.field7508; ++var2) {
                class451 var3 = this.field7529[var2];
                int var4 = var2 + 16386;
                class46.field696[0] = (float) var3.method2577((byte) -106);
                class46.field696[1] = (float) var3.method2581(class106.method743(arg0, 8476));
                class46.field696[2] = (float) var3.method2582((byte) 70);
                class46.field696[3] = 1.0F;
                OpenGL.glLightfv(var4, 4611, class46.field696, 0);
                int var5 = var3.method2579(105);
                float var6 = var3.method2580((byte) -117) / 255.0F;
                class46.field696[1] = (float) (class494.method2839(65412, var5) >> 8) * var6;
                class46.field696[2] = (float) class494.method2839(var5, 255) * var6;
                class46.field696[0] = (float) (class494.method2839(16735372, var5) >> 16) * var6;
                OpenGL.glLightfv(var4, 4609, class46.field696, 0);
                OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method2578(arg0 + 14029) * var3.method2578(22477)));
                OpenGL.glEnable(var4);
            }
            while (this.field7482 > var2) {
                OpenGL.glDisable(var2 + 16386);
                ++var2;
            }
            this.field7482 = this.field7508;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIII)V", line = 2662)
    public final void method602(int arg0, int arg1, int arg2, int arg3) {
        this.field7396.method2060(60, arg0, arg3, arg1, arg2);
        ++field7254;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 2672)
    public final void method623(Canvas arg0) {
        this.field7321 = 0L;
        ++field7363;
        this.field7208 = null;
        if (arg0 != null && this.field7331 != arg0) {
            if (this.field7366.containsKey(arg0)) {
                Long var2 = (Long) this.field7366.get(arg0);
                this.field7321 = var2;
                this.field7208 = arg0;
            }
        } else {
            this.field7321 = this.field7357;
            this.field7208 = this.field7331;
        }
        if (this.field7208 != null && this.field7321 != 0L) {
            this.field7199.setSurface(this.field7321);
            this.method2972(-14534);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bo", name = "JA", descriptor = "(II)V", line = 2709)
    public final void method577(int arg0, int arg1) {
        if (this.field7544 != arg0 || ~this.field7433 != ~arg1) {
            this.field7433 = arg1;
            this.field7544 = arg0;
            this.method2974((byte) -101);
            this.method2997((byte) 123);
            if (~this.field7445 != -4) {
                if (~this.field7445 == -3) {
                    this.method2984((byte) -102);
                }
            } else {
                this.method2994(5889);
            }
        }
        ++field7322;
    }

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "()Z", line = 2735)
    public final boolean method581() {
        ++field7285;
        return this.field7395 != null && this.field7395.method1989(16777215);
    }

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "()I", line = 2744)
    public final int method597() {
        ++field7352;
        return 4;
    }

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "(I)V", line = 2752)
    public final void method2990(int arg0) {
        if (~this.field7487 != -5) {
            this.method3005(arg0 ^ -23565);
            this.method2945(false, (byte) -89);
            this.method2969(false, 4940);
            this.method2982(false, arg0 + -23357);
            this.method2951(false, 34018);
            this.method2935(47, -2);
            this.method2978(1, (byte) -50);
            this.method2976((byte) 101, 0);
            this.field7487 = 4;
        }
        if (arg0 == 26286) {
            ++field7316;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "([IIIII)Lf;", line = 2775)
    public final class529 method598(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7384;
        return new class324(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "()Z", line = 2788)
    public final boolean method627() {
        ++field7221;
        return true;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II[I[I)Lea;", line = 2796)
    public final class381 method612(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field7210;
        return class470.method2673(arg0, arg1, 1296, this, arg2, arg3);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Leg;Z)V", line = 2808)
    public final void method2991(class69 arg0, boolean arg1) {
        ++field7343;
        if (this.field7407 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field7407 <= -1) {
                this.field7409[this.field7407].method367((byte) 54);
            }
            this.field7413 = this.field7409[++this.field7407] = arg0;
            this.field7413.method351(arg1);
        }
    }

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "(B)V", line = 2824)
    private final void method2992(byte arg0) {
        this.field7490 = (float) (-this.field7432 + this.field7426);
        this.field7434 = (float) (this.field7521 - this.field7469);
        if (arg0 != -39) {
            this.method561(0.5973972F, -0.030780898F, 2.4977221F);
        }
        ++field7371;
        this.field7515 = (float) (-this.field7469 + this.field7543);
        this.field7533 = (float) (-this.field7432 + this.field7474);
    }

    @OriginalMember(owner = "client!bo", name = "pa", descriptor = "(IIII)V", line = 2841)
    public final void method572(int arg0, int arg1, int arg2, int arg3) {
        if (~arg0 > -1) {
            arg0 = 0;
        }
        if (arg2 > this.field7226) {
            arg2 = this.field7226;
        }
        if (~arg3 < ~this.field7250) {
            arg3 = this.field7250;
        }
        if (~arg1 > -1) {
            arg1 = 0;
        }
        ++field7234;
        this.field7474 = arg3;
        this.field7521 = arg2;
        this.field7543 = arg0;
        this.field7426 = arg1;
        OpenGL.glEnable(3089);
        this.method2992((byte) -39);
        this.method2996(0);
    }

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "(I)V", line = 2870)
    private final void method2993(int arg0) {
        ++field7270;
        this.method2935(47, -2);
        for (int var2 = this.field7522 + -1; var2 >= 0; --var2) {
            this.method3003(var2, 68);
            this.method2980((class501) null, 124);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method3002((byte) -92, 8448, 8448);
        this.method2953(2, (byte) 59, 770, 34168);
        this.method2954(5890);
        this.field7476 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field7473 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field7506 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field7523 = true;
        this.method2945(true, (byte) -81);
        this.method2969(true, 4940);
        this.method2982(true, 2929);
        this.method2951(true, 34018);
        this.method2995((byte) 36);
        this.field7199.setSwapInterval(0);
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
        if (arg0 < 37) {
            this.field7489 = null;
        }
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
        this.field7455 = this.field7484 = -1;
        this.method539();
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "([Lc;Lpm;Lia;[Lfo;I)V", line = 2943)
    public final void method545(class121[] arg0, class411 arg1, class414 arg2, class357[] arg3, int arg4) {
        ++field7230;
        this.method537(arg0, arg2, arg3, arg4);
        this.method582(arg1);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(FFF)V", line = 2956)
    public final void method561(float arg0, float arg1, float arg2) {
        class289.field3783 = arg2;
        class49.field762 = arg0;
        ++field7243;
        class401.field5376 = arg1;
    }

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "(I)V", line = 2969)
    private final void method2994(int arg0) {
        ++field7231;
        float var2 = (float) (-this.field7469) * this.field7459 / (float) this.field7502;
        float var3 = (float) (-this.field7432) * this.field7459 / (float) this.field7448;
        float var4 = (float) (-this.field7469 + this.field7226) * this.field7459 / (float) this.field7502;
        float var5 = (float) (-this.field7432 + this.field7250) * this.field7459 / (float) this.field7448;
        OpenGL.glMatrixMode(arg0);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field7544 + -this.field7534), (double) ((float) this.field7433 + -this.field7534));
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "(B)V", line = 2992)
    public final void method2995(byte arg0) {
        ++field7310;
        if (~this.field7445 != -1) {
            this.field7445 = 0;
            this.field7487 &= -32;
        }
        if (arg0 != 36) {
            this.field7455 = 93;
        }
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lm;ILjs;)V", line = 3008)
    public class511(int arg0, Canvas arg1, class126 arg2, int arg3, class216 arg4) {
        super(arg0, arg2);
        new class114();
        new class18(16);
        this.field7416 = new class280();
        this.field7418 = new class280();
        this.field7419 = new class280();
        this.field7420 = new class280();
        this.field7421 = new class280();
        this.field7422 = new class280();
        this.field7423 = new class280();
        this.field7432 = 0;
        this.field7439 = 0;
        this.field7441 = true;
        this.field7448 = 512;
        this.field7455 = -1;
        this.field7426 = 0;
        this.field7444 = 3584.0F;
        this.field7469 = 0;
        this.field7464 = -1.0F;
        this.field7433 = 3584;
        this.field7471 = 0;
        this.field7465 = 0.0F;
        this.field7474 = 0;
        this.field7486 = 0;
        this.field7425 = new float[4];
        this.field7503 = new float[4];
        this.field7459 = 1.0F;
        this.field7502 = 512;
        this.field7484 = -1;
        this.field7463 = new float[4];
        this.field7427 = new float[16];
        this.field7458 = -1;
        this.field7437 = 3584.0F;
        this.field7454 = -1.0F;
        this.field7496 = 1.0F;
        this.field7532 = 1.0F;
        this.field7494 = 3000.0F;
        this.field7497 = 8448;
        this.field7526 = -1;
        this.field7516 = -1;
        this.field7485 = new float[4];
        this.field7431 = 8448;
        this.field7518 = 1.0F;
        this.field7529 = new class451[class282.field3707];
        this.field7499 = 1.0F;
        this.field7521 = 0;
        this.field7520 = 0;
        this.field7543 = 0;
        this.field7544 = 50;
        this.field7390 = arg3;
        this.field7208 = this.field7331 = arg1;
        try {
            if (class470.field6477 == null || !class470.field6477) {
                if (arg4 != null) {
                    String var6 = System.getProperty("os.name").toLowerCase();
                    if (!var6.startsWith("mac")) {
                        System.loadLibrary("jawt");
                    }
                    if (!var6.startsWith("linux") && !var6.startsWith("sunos")) {
                        if (var6.startsWith("mac")) {
                            System.load(arg4.method1373((byte) 91, "libjaggl.jnilib").toString());
                        } else {
                            if (!var6.startsWith("win")) {
                                throw new RuntimeException("");
                            }
                            System.load(arg4.method1373((byte) 91, "jaggl.dll").toString());
                        }
                    } else {
                        System.load(arg4.method1373((byte) 91, "libjaggl.so").toString());
                    }
                    class470.field6477 = Boolean.TRUE;
                } else {
                    System.loadLibrary("jawt");
                    System.loadLibrary("jaggl");
                    class470.field6477 = Boolean.TRUE;
                }
            }
            if (class470.field6477 != null && class470.field6477) {
                this.field7199 = new OpenGL();
                this.field7321 = this.field7357 = this.field7199.init(arg1, 8, 8, 8, 24, 0, this.field7390);
                if (~this.field7357 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method2939(1833);
                    int var7 = this.method2933((byte) -96);
                    if (~var7 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field7442 = !this.field7493 ? 5121 : 33639;
                        if (this.field7488.indexOf("radeon") != -1) {
                            int var8 = 0;
                            boolean var9 = false;
                            boolean var10 = false;
                            String[] var11 = class482.method2781(this.field7488.replace('/', ' '), -22005, ' ');
                            for (int var12 = 0; ~var11.length < ~var12; ++var12) {
                                String var13 = var11[var12];
                                try {
                                    if (~var13.length() < -1) {
                                        if (var13.charAt(0) == 'x' && var13.length() >= 3 && class80.method495(var13.substring(1, 3), (byte) 114)) {
                                            var10 = true;
                                            var13 = var13.substring(1);
                                        }
                                        if (var13.equals("hd")) {
                                            var9 = true;
                                        } else {
                                            if (var13.startsWith("hd")) {
                                                var9 = true;
                                                var13 = var13.substring(2);
                                            }
                                            if (var13.length() >= 4 && class80.method495(var13.substring(0, 4), (byte) 100)) {
                                                var8 = class300.method1752(true, var13.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var19) {
                                }
                            }
                            if (!var9 || ~var8 > -4001) {
                                this.field7528 = false;
                            }
                            if (!var10 && !var9) {
                                if (var8 >= 7000 && var8 <= 9250) {
                                    this.field7519 = false;
                                }
                                if (var8 >= 7000 && var8 <= 7999) {
                                    this.field7483 = false;
                                }
                            }
                            this.field7460 &= this.field7199.isExtensionAvailable("GL_ARB_half_float_pixel");
                            this.field7436 = this.field7483;
                        }
                        if (this.field7466.indexOf("intel") != -1) {
                            this.field7510 = false;
                        }
                        this.field7456 = !this.field7466.equals("s3 graphics");
                        if (this.field7483) {
                            try {
                                int[] var14 = new int[1];
                                OpenGL.glGenBuffersARB(1, var14, 0);
                            } catch (Throwable var17) {
                                throw new RuntimeException("");
                            }
                        }
                        method2967(true, true, (byte) -108);
                        this.field7405 = true;
                        this.field7392 = new class259(this, super.field2375);
                        this.method2958(1);
                        this.field7399 = new class65(this);
                        this.field7396 = new class351(this);
                        if (this.field7396.method2053(8167)) {
                            this.field7395 = new class89(this);
                            if (!this.field7395.method650(-126)) {
                                this.field7395.method651(-5254);
                                this.field7395 = null;
                            }
                        }
                        this.field7393 = new class101(this);
                        this.method2993(108);
                        this.method2972(-14534);
                        OpenGL.glClear(16640);
                        int var15 = 0;
                        while (true) {
                            try {
                                this.field7199.swapBuffers();
                                break;
                            } catch (Exception var18) {
                                if (var15++ > 5) {
                                    throw new RuntimeException("");
                                }
                                class94.method674(100L, 1);
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
            this.method571();
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!bo", name = "aa", descriptor = "(IIIIII[BII)V", line = 3206)
    public final void method530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field7360;
        float var10;
        float var11;
        if (this.field7509 != null && ~this.field7509.field4144 <= ~arg2 && arg3 <= this.field7509.field4143) {
            this.field7509.method1832(0, false, (byte) -128, arg6, 0, arg3, arg2, 6406, 0, 0);
            var10 = (float) arg2 * this.field7509.field4349 / (float) this.field7509.field4144;
            var11 = (float) arg3 * this.field7509.field4352 / (float) this.field7509.field4143;
        } else {
            this.field7509 = class449.method2571(6406, arg6, this, arg2, 6406, -2182, arg3, false);
            this.field7509.method1831(true, false, false);
            var10 = this.field7509.field4349;
            var11 = this.field7509.field4352;
        }
        this.method2937(true);
        this.method2980(this.field7509, 116);
        this.method2978(arg8, (byte) -80);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method2986(arg5, (byte) -58);
        this.method3002((byte) -64, 34165, 34165);
        this.method2953(0, (byte) 103, 768, 34166);
        this.method2953(2, (byte) 105, 770, 5890);
        this.method2950((byte) -34, 770, 0, 34166);
        this.method2950((byte) -34, 770, 2, 5890);
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
        this.method2953(0, (byte) 76, 768, 5890);
        this.method2953(2, (byte) 117, 770, 34166);
        this.method2950((byte) -34, 770, 0, 5890);
        this.method2950((byte) -34, 770, 2, 34166);
    }

    @OriginalMember(owner = "client!bo", name = "V", descriptor = "(III)V", line = 3267)
    public final void method606(int arg0, int arg1, int arg2) {
        ++field7235;
        if (~this.field7484 != ~arg0 || this.field7526 != arg1 || this.field7439 != arg2) {
            this.field7439 = arg2;
            this.field7484 = arg0;
            this.field7526 = arg1;
            if (this.field7451) {
                return;
            }
            this.method2997((byte) 124);
            this.method2940(-91);
        }
    }

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "(I)V", line = 3290)
    private final void method2996(int arg0) {
        ++field7307;
        if (this.field7543 <= this.field7521 && this.field7426 <= this.field7474) {
            OpenGL.glScissor(this.field7543 + this.field7520, -this.field7474 + this.field7471 + this.field7250, -this.field7543 + this.field7521, this.field7474 - this.field7426);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        if (arg0 != 0) {
            this.method2982(false, -21);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIIILea;II)V", line = 3306)
    public final void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8) {
        ++field7237;
        class160 var10 = (class160) arg6;
        class330 var11 = var10.field2361;
        this.method2937(true);
        this.method2980(var10.field2361, 114);
        this.method2978(arg5, (byte) -60);
        this.method3002((byte) -90, 7681, 8448);
        this.method2953(0, (byte) 101, 768, 34167);
        float var12 = var11.field4349 / (float) var11.field4345;
        float var13 = var11.field4352 / (float) var11.field4346;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glEnd();
        this.method2953(0, (byte) 100, 768, 5890);
    }

    @OriginalMember(owner = "client!bo", name = "U", descriptor = "(IIIII)V", line = 3337)
    public final void method542(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7325;
        this.method2963((byte) -88);
        this.method2978(arg4, (byte) -102);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "(B)V", line = 3357)
    private final void method2997(byte arg0) {
        ++field7299;
        int var2;
        if (!this.field7451) {
            this.field7531 = (float) (-this.field7439 + this.field7433) - this.field7465;
            this.field7452 = this.field7531 - (float) this.field7526 * this.field7532;
            if (this.field7452 < (float) this.field7544) {
                this.field7452 = (float) this.field7544;
            }
            OpenGL.glFogf(2915, this.field7452);
            OpenGL.glFogf(2916, this.field7531);
            var2 = this.field7484;
        } else {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field7516;
        }
        class177.field2572[2] = (float) class494.method2839(255, var2) / 255.0F;
        class177.field2572[1] = (float) class494.method2839(65280, var2) / 65280.0F;
        class177.field2572[0] = (float) class494.method2839(var2, 16711680) / 1.671168E7F;
        OpenGL.glFogfv(2918, class177.field2572, 0);
        int var3 = -63 % ((73 - arg0) / 40);
        if (this.field7451) {
            this.field7393.field1495.method1655(34820);
        }
    }

    @OriginalMember(owner = "client!bo", name = "ua", descriptor = "(F)V", line = 3393)
    public final void method559(float arg0) {
        if (this.field7524 != arg0) {
            this.field7524 = arg0;
            this.method2941(-13474);
        }
        ++field7324;
    }

    @OriginalMember(owner = "client!bo", name = "NA", descriptor = "(IIIIII)V", line = 3409)
    public final void method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7269;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method2963((byte) -88);
        this.method2978(arg5, (byte) -104);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field7468) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field7468) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 3442)
    public final void method594(Canvas arg0) {
        ++field7292;
        if (this.field7331 == arg0) {
            throw new RuntimeException();
        } else if (this.field7366.containsKey(arg0)) {
            Long var2 = (Long) this.field7366.get(arg0);
            this.field7199.releaseSurface(arg0, var2);
            this.field7366.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)V", line = 3462)
    public final void method625(int arg0) {
        this.method2939(1833);
        ++field7344;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "()V", line = 3478)
    public final void method529() {
        try {
            this.field7199.swapBuffers();
        } catch (Exception var1) {
        }
        ++field7244;
    }

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "()Z", line = 3501)
    public final boolean method555() {
        ++field7348;
        return false;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(Z)V", line = 3512)
    public final void method525(boolean arg0) {
        ++field7195;
        this.field7441 = arg0;
        this.method3008((byte) -38);
    }

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "()Z", line = 3525)
    public final boolean method570() {
        ++field7255;
        return true;
    }

    @OriginalMember(owner = "client!bo", name = "SA", descriptor = "(IIIIII)Z", line = 3537)
    public final boolean method610(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7260;
        float var7 = (float) arg2 * this.field7430.field1963 + (float) arg0 * this.field7430.field1988 + (float) arg1 * this.field7430.field1975 + this.field7430.field1980;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field7430.field1963 + (float) arg3 * this.field7430.field1988 + (float) arg4 * this.field7430.field1975 + this.field7430.field1980;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field7544) || !((float) this.field7544 > var8)) && (!(var7 > (float) this.field7433) || !(var8 > (float) this.field7433))) {
            int var9 = (int) (((float) arg2 * this.field7430.field1987 + (float) arg0 * this.field7430.field1977 + (float) arg1 * this.field7430.field1979 + this.field7430.field1964) * (float) this.field7502 / var7);
            int var10 = (int) (((float) arg5 * this.field7430.field1987 + (float) arg3 * this.field7430.field1977 + (float) arg4 * this.field7430.field1979 + this.field7430.field1964) * (float) this.field7502 / var8);
            if ((float) var9 < this.field7515 && this.field7515 > (float) var10 || (float) var9 > this.field7434 && (float) var10 > this.field7434) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field7430.field1965 + (float) arg0 * this.field7430.field1973 + (float) arg1 * this.field7430.field1970 + this.field7430.field1993) * (float) this.field7448 / var7);
                int var12 = (int) (((float) arg5 * this.field7430.field1965 + (float) arg3 * this.field7430.field1973 + (float) arg4 * this.field7430.field1970 + this.field7430.field1993) * (float) this.field7448 / var8);
                return (!(this.field7490 > (float) var11) || !((float) var12 < this.field7490)) && (!(this.field7533 < (float) var11) || !((float) var12 > this.field7533));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "(I)V", line = 3575)
    private final void method2998(int arg0) {
        OpenGL.glLoadIdentity();
        ++field7320;
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMultMatrixf(this.field7430.method984((byte) -109), 0);
        if (arg0 == -6545) {
            if (this.field7451) {
                this.field7393.field1495.method1657(arg0 ^ -6547);
            }
            this.method2968((byte) -120);
            this.method2989(8448);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIZI[B)Lrg;", line = 3594)
    public final class453 method2999(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        if (arg1 >= -118) {
            this.method2969(false, -27);
        }
        ++field7284;
        return (class453) (!this.field7483 || arg2 && !this.field7436 ? new class105(this, arg0, arg4, arg3) : new class184(this, arg0, arg4, arg3, arg2));
    }

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "()Z", line = 3614)
    public final boolean method587() {
        ++field7304;
        if (this.field7395 != null) {
            if (!this.field7395.method1989(16777215)) {
                if (!this.field7396.method2057(-1, this.field7395)) {
                    return false;
                }
                this.field7392.method1567(-17);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "()Z", line = 3641)
    public final boolean method578() {
        ++field7362;
        return true;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I[Lor;)V", line = 3650)
    public final void method609(int arg0, class451[] arg1) {
        ++field7233;
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field7529[var3] = arg1[var3];
        }
        this.field7508 = arg0;
        if (~this.field7445 != -2) {
            this.method2989(8448);
        }
    }

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "(I)V", line = 3670)
    public static void method3000(int arg0) {
        field7294 = null;
        if (arg0 != 32) {
            field7311 = -93;
        }
    }

    @OriginalMember(owner = "client!bo", name = "B", descriptor = "(I)V", line = 3682)
    private final void method3001(int arg0) {
        if (this.field7445 != arg0) {
            this.field7445 = 3;
            this.method2994(5889);
            this.method2998(-6545);
            this.field7487 &= -8;
        }
        ++field7206;
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(BII)V", line = 3699)
    public final void method3002(byte arg0, int arg1, int arg2) {
        if (~this.field7517 != -1) {
            OpenGL.glTexEnvi(8960, 34161, arg1);
            OpenGL.glTexEnvi(8960, 34162, arg2);
        } else {
            boolean var4 = false;
            if (this.field7497 != arg1) {
                OpenGL.glTexEnvi(8960, 34161, arg1);
                var4 = true;
                this.field7497 = arg1;
            }
            if (~this.field7431 != ~arg2) {
                OpenGL.glTexEnvi(8960, 34162, arg2);
                this.field7431 = arg2;
                var4 = true;
            }
            if (var4) {
                this.field7487 &= -30;
            }
        }
        if (arg0 > -19) {
            this.field7389 = -79;
        }
        ++field7214;
    }

    @OriginalMember(owner = "client!bo", name = "va", descriptor = "()V", line = 3741)
    public final void method539() {
        this.field7474 = this.field7250;
        ++field7246;
        this.field7426 = 0;
        this.field7521 = this.field7226;
        this.field7543 = 0;
        OpenGL.glDisable(3089);
        this.method2992((byte) -39);
    }

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "(II)V", line = 3759)
    public final void method3003(int arg0, int arg1) {
        ++field7315;
        if (~this.field7517 != ~arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field7517 = arg0;
        }
        if (arg1 < 2) {
            this.field7454 = 0.4918151F;
        }
    }

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "()Lia;", line = 3776)
    public final class414 method538() {
        ++field7201;
        return new class138();
    }

    @OriginalMember(owner = "client!bo", name = "la", descriptor = "()F", line = 3784)
    public final float method524() {
        ++field7298;
        return this.field7494;
    }

    @OriginalMember(owner = "client!bo", name = "S", descriptor = "()V", line = 3793)
    public final void method536() {
        this.field7451 = false;
        ++field7342;
        this.field7393.method715(false, false, false, 0);
        this.method2997((byte) 15);
        this.method2940(-126);
    }

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "(ILea;II)V", line = 3806)
    public final void method576(int arg0, class381 arg1, int arg2, int arg3) {
        ++field7380;
        class160 var5 = (class160) arg1;
        class330 var6 = var5.field2361;
        this.method2937(true);
        this.method2980(var5.field2361, 121);
        this.method2978(1, (byte) -118);
        this.method3002((byte) -52, 7681, 8448);
        this.method2953(0, (byte) 96, 768, 34167);
        float var7 = var6.field4349 / (float) var6.field4345;
        float var8 = var6.field4352 / (float) var6.field4346;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (this.field7543 - arg2) * var7, (float) (-arg3 + this.field7426) * var8);
        OpenGL.glVertex2i(this.field7543, this.field7426);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7543) * var7, (float) (this.field7474 - arg3) * var8);
        OpenGL.glVertex2i(this.field7543, this.field7474);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field7521) * var7, (float) (-arg3 + this.field7474) * var8);
        OpenGL.glVertex2i(this.field7521, this.field7474);
        OpenGL.glTexCoord2f((float) (this.field7521 - arg2) * var7, (float) (-arg3 + this.field7426) * var8);
        OpenGL.glVertex2i(this.field7521, this.field7426);
        OpenGL.glEnd();
        this.method2953(0, (byte) 121, 768, 5890);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lik;I)V", line = 3838)
    public final void method3004(class138 arg0, int arg1) {
        OpenGL.glPushMatrix();
        ++field7337;
        OpenGL.glMultMatrixf(arg0.method984((byte) -34), arg1);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lpm;)V", line = 3847)
    public final void method582(class411 arg0) {
        this.field7391.method1052(this, arg0, 108);
        ++field7347;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V", line = 3857)
    public final void method532(boolean arg0) {
        ++field7354;
    }

    @OriginalMember(owner = "client!bo", name = "XA", descriptor = "(IFFFFF)V", line = 3868)
    public final void method592(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field7238;
        boolean var7 = this.field7455 != arg0;
        if (var7 || this.field7464 != arg1 || this.field7454 != arg2) {
            this.field7464 = arg1;
            this.field7454 = arg2;
            this.field7455 = arg0;
            if (var7) {
                this.field7499 = (float) (65280 & this.field7455) / 65280.0F;
                this.field7518 = (float) (16711680 & this.field7455) / 1.671168E7F;
                this.field7496 = (float) (this.field7455 & 255) / 255.0F;
                this.method2941(-13474);
            }
            this.method3013(-4056);
        }
        if (this.field7503[0] != arg3 || this.field7503[1] != arg4 || this.field7503[2] != arg5) {
            this.field7503[1] = arg4;
            this.field7503[2] = arg5;
            this.field7503[0] = arg3;
            this.field7425[2] = -arg5;
            this.field7425[1] = -arg4;
            this.field7425[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field7463[0] = arg3 * var8;
            this.field7463[2] = arg5 * var8;
            this.field7463[1] = arg4 * var8;
            this.field7485[1] = -this.field7463[1];
            this.field7485[0] = -this.field7463[0];
            this.field7485[2] = -this.field7463[2];
            this.method2968((byte) 71);
            this.field7435 = (int) (arg3 * 256.0F / arg4);
            this.field7537 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "(I)V", line = 3920)
    public final void method593(int arg0) {
        ++field7281;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field7389 = arg0;
            this.field7392.method1567(119);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "(I)V", line = 3940)
    private final void method3005(int arg0) {
        if (this.field7445 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field7226 > 0 && ~this.field7250 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field7226, (double) this.field7250, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field7487 &= -25;
            this.field7445 = 1;
        }
        ++field7340;
        if (arg0 != -15011) {
            this.method594((Canvas) null);
        }
    }

    @OriginalMember(owner = "client!bo", name = "D", descriptor = "(I)V", line = 3965)
    public final void method3006(int arg0) {
        int var2 = 75 % ((arg0 - -28) / 44);
        ++field7346;
        OpenGL.glPushMatrix();
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIIF)Lor;", line = 3977)
    public final class451 method588(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field7256;
        return new class176(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "(II)V", line = 3989)
    public final synchronized void method3007(int arg0, int arg1) {
        ++field7225;
        class42 var3 = new class42();
        var3.field622 = (long) arg0;
        this.field7422.method1666((byte) -77, var3);
        if (arg1 != 8960) {
            this.field7531 = 0.068916075F;
        }
    }

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "(B)V", line = 4003)
    private final void method3008(byte arg0) {
        ++field7222;
        OpenGL.glDepthMask(this.field7443 && this.field7441);
        if (arg0 != -38) {
            this.method2979((byte) 109);
        }
    }

    @OriginalMember(owner = "client!bo", name = "FA", descriptor = "()I", line = 4015)
    public final int method518() {
        ++field7219;
        return this.field7417 + this.field7414 - -this.field7415;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLgb;)V", line = 4024)
    public final void method3009(byte arg0, class142 arg1) {
        ++field7241;
        if (arg0 != 111) {
            this.field7483 = true;
        }
        if (this.field7457 != arg1) {
            if (this.field7483) {
                OpenGL.glBindBufferARB(34963, arg1.method995((byte) -40));
            }
            this.field7457 = arg1;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II[[I[[IIII)Lna;", line = 4046)
    public final class35 method556(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field7319;
        return new class151(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLeg;)V", line = 4054)
    public final void method3010(byte arg0, class69 arg1) {
        ++field7317;
        if (arg0 >= -24) {
            this.method2992((byte) -46);
        }
        if (~this.field7412 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field7412 <= -1) {
                this.field7411[this.field7412].method368(68);
            }
            this.field7406 = this.field7411[++this.field7412] = arg1;
            this.field7406.method356(7797);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lto;Lto;FLto;)Lto;", line = 4073)
    public final class8 method566(class8 arg0, class8 arg1, float arg2, class8 arg3) {
        ++field7209;
        if (arg0 != null && arg1 != null && this.field7447 && this.field7510 && this.field7513) {
            class331 var5 = null;
            class372 var6 = (class372) arg0;
            class372 var7 = (class372) arg1;
            class336 var8 = var6.method1904((byte) -34);
            class336 var9 = var7.method1904((byte) -34);
            if (var8 != null && var9 != null) {
                int var10 = ~var8.field4404 >= ~var9.field4404 ? var9.field4404 : var8.field4404;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class331) {
                    class331 var11 = (class331) arg3;
                    if (~var11.method1907((byte) 111) == ~var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class331(this, var10);
                }
                if (var5.method1903(7013, var8, arg2, var9)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(III)V", line = 4120)
    public final void method3011(int arg0, int arg1, int arg2) {
        if (arg2 != -9019) {
            this.field7460 = false;
        }
        ++field7249;
        this.field7471 = arg0;
        this.field7520 = arg1;
        this.method2960(18356);
        this.method2996(0);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lre;[Lfq;Z)Loa;", line = 4134)
    public final class489 method589(class425 arg0, class134[] arg1, boolean arg2) {
        ++field7282;
        return new class396(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(III)V", line = 4142)
    public final synchronized void method3012(int arg0, int arg1, int arg2) {
        ++field7373;
        if (arg2 != 1) {
            this.method619();
        }
        class387 var4 = new class387(arg0);
        var4.field622 = (long) arg1;
        this.field7421.method1666((byte) 124, var4);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIIII)V", line = 4156)
    public final void method580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        OpenGL.glLineWidth((float) arg5);
        ++field7252;
        this.method563(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!bo", name = "E", descriptor = "(I)V", line = 4168)
    private final void method3013(int arg0) {
        class177.field2572[2] = this.field7496 * this.field7464;
        class177.field2572[3] = 1.0F;
        class177.field2572[1] = this.field7499 * this.field7464;
        class177.field2572[0] = this.field7518 * this.field7464;
        ++field7245;
        if (arg0 == -4056) {
            OpenGL.glLightfv(16384, 4609, class177.field2572, 0);
            class177.field2572[2] = -this.field7454 * this.field7496;
            class177.field2572[3] = 1.0F;
            class177.field2572[1] = -this.field7454 * this.field7499;
            class177.field2572[0] = -this.field7454 * this.field7518;
            OpenGL.glLightfv(16385, 4609, class177.field2572, 0);
        }
    }

    @OriginalMember(owner = "client!bo", name = "B", descriptor = "()Z", line = 4193)
    public final boolean method567() {
        ++field7305;
        return false;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(IIII)V", line = 4206)
    public final void method3014(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 768) {
            ++field7376;
            OpenGL.glDrawArrays(arg0, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IZ)V", line = 4219)
    public final void method3015(int arg0, boolean arg1) {
        ++field7323;
        if (this.field7453 == !arg1) {
            this.field7453 = arg1;
            this.method2948(arg0 + -4785);
        }
        if (arg0 != 7681) {
            this.field7404 = -33;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 4237)
    public final void method601(Rectangle[] arg0, int arg1) {
        ++field7264;
        this.method529();
    }
}
