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

@OriginalClass("client!oea")
public class class594 extends class58 {

    @OriginalMember(owner = "client!oea", name = "Cd", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field8483 = new Hashtable();

    @OriginalMember(owner = "client!oea", name = "ve", descriptor = "I")
    public int field8528 = 128;

    @OriginalMember(owner = "client!oea", name = "Ge", descriptor = "Lnv;")
    private class415 field8539 = new class415();

    @OriginalMember(owner = "client!oea", name = "Ie", descriptor = "Laca;")
    private class724 field8541 = new class724();

    @OriginalMember(owner = "client!oea", name = "Je", descriptor = "Laca;")
    public class724 field8542 = new class724();

    @OriginalMember(owner = "client!oea", name = "Me", descriptor = "I")
    public int field8545 = 3;

    @OriginalMember(owner = "client!oea", name = "Ne", descriptor = "I")
    public int field8546 = 8;

    @OriginalMember(owner = "client!oea", name = "Pe", descriptor = "Z")
    private boolean field8548 = false;

    @OriginalMember(owner = "client!oea", name = "Oe", descriptor = "Lnt;")
    private class220 field8547 = new class220();

    @OriginalMember(owner = "client!oea", name = "Re", descriptor = "I")
    private int field8550 = -1;

    @OriginalMember(owner = "client!oea", name = "Te", descriptor = "[Lpw;")
    private class703[] field8552 = new class703[4];

    @OriginalMember(owner = "client!oea", name = "Ye", descriptor = "[Lpw;")
    private class703[] field8557 = new class703[4];

    @OriginalMember(owner = "client!oea", name = "af", descriptor = "[Lpw;")
    private class703[] field8559 = new class703[4];

    @OriginalMember(owner = "client!oea", name = "Ze", descriptor = "I")
    private int field8558 = -1;

    @OriginalMember(owner = "client!oea", name = "Xe", descriptor = "I")
    private int field8556 = -1;

    @OriginalMember(owner = "client!oea", name = "bf", descriptor = "Lnt;")
    private class220 field8560;

    @OriginalMember(owner = "client!oea", name = "ff", descriptor = "Lnt;")
    private class220 field8564;

    @OriginalMember(owner = "client!oea", name = "gf", descriptor = "Lnt;")
    private class220 field8565;

    @OriginalMember(owner = "client!oea", name = "hf", descriptor = "Lnt;")
    private class220 field8566;

    @OriginalMember(owner = "client!oea", name = "jf", descriptor = "Lnt;")
    private class220 field8567;

    @OriginalMember(owner = "client!oea", name = "kf", descriptor = "Lnt;")
    private class220 field8568;

    @OriginalMember(owner = "client!oea", name = "lf", descriptor = "Lnt;")
    private class220 field8569;

    @OriginalMember(owner = "client!oea", name = "sf", descriptor = "Laca;")
    public class724 field8576;

    @OriginalMember(owner = "client!oea", name = "vf", descriptor = "Laca;")
    public class724 field8579;

    @OriginalMember(owner = "client!oea", name = "wf", descriptor = "Laca;")
    public class724 field8580;

    @OriginalMember(owner = "client!oea", name = "zf", descriptor = "I")
    public int field8583;

    @OriginalMember(owner = "client!oea", name = "Lf", descriptor = "[F")
    private float[] field8595;

    @OriginalMember(owner = "client!oea", name = "ag", descriptor = "I")
    private int field8610;

    @OriginalMember(owner = "client!oea", name = "eg", descriptor = "I")
    private int field8614;

    @OriginalMember(owner = "client!oea", name = "xf", descriptor = "I")
    public int field8581;

    @OriginalMember(owner = "client!oea", name = "Vf", descriptor = "I")
    public int field8605;

    @OriginalMember(owner = "client!oea", name = "If", descriptor = "F")
    public float field8592;

    @OriginalMember(owner = "client!oea", name = "tg", descriptor = "I")
    public int field8629;

    @OriginalMember(owner = "client!oea", name = "Gf", descriptor = "F")
    private float field8590;

    @OriginalMember(owner = "client!oea", name = "jg", descriptor = "I")
    private int field8619;

    @OriginalMember(owner = "client!oea", name = "lg", descriptor = "I")
    public int field8621;

    @OriginalMember(owner = "client!oea", name = "Uf", descriptor = "[F")
    public float[] field8604;

    @OriginalMember(owner = "client!oea", name = "Fg", descriptor = "F")
    public float field8641;

    @OriginalMember(owner = "client!oea", name = "Hg", descriptor = "F")
    public float field8643;

    @OriginalMember(owner = "client!oea", name = "Bg", descriptor = "F")
    public float field8637;

    @OriginalMember(owner = "client!oea", name = "wg", descriptor = "F")
    private float field8632;

    @OriginalMember(owner = "client!oea", name = "qg", descriptor = "[F")
    private float[] field8626;

    @OriginalMember(owner = "client!oea", name = "Rg", descriptor = "I")
    public int field8653;

    @OriginalMember(owner = "client!oea", name = "Zg", descriptor = "I")
    private int field8661;

    @OriginalMember(owner = "client!oea", name = "Pf", descriptor = "I")
    private int field8599;

    @OriginalMember(owner = "client!oea", name = "Sg", descriptor = "I")
    private int field8654;

    @OriginalMember(owner = "client!oea", name = "Dg", descriptor = "[F")
    private float[] field8639;

    @OriginalMember(owner = "client!oea", name = "bh", descriptor = "F")
    public float field8663;

    @OriginalMember(owner = "client!oea", name = "yg", descriptor = "I")
    private int field8634;

    @OriginalMember(owner = "client!oea", name = "Og", descriptor = "Z")
    private boolean field8650;

    @OriginalMember(owner = "client!oea", name = "Cf", descriptor = "Z")
    private boolean field8586;

    @OriginalMember(owner = "client!oea", name = "bg", descriptor = "F")
    public float field8611;

    @OriginalMember(owner = "client!oea", name = "ng", descriptor = "F")
    public float field8623;

    @OriginalMember(owner = "client!oea", name = "Gg", descriptor = "F")
    private float field8642;

    @OriginalMember(owner = "client!oea", name = "fh", descriptor = "F")
    private float field8667;

    @OriginalMember(owner = "client!oea", name = "rh", descriptor = "I")
    public int field8679;

    @OriginalMember(owner = "client!oea", name = "pg", descriptor = "F")
    private float field8625;

    @OriginalMember(owner = "client!oea", name = "mh", descriptor = "I")
    public int field8674;

    @OriginalMember(owner = "client!oea", name = "sh", descriptor = "I")
    private int field8680;

    @OriginalMember(owner = "client!oea", name = "jh", descriptor = "I")
    public int field8671;

    @OriginalMember(owner = "client!oea", name = "dh", descriptor = "I")
    public int field8665;

    @OriginalMember(owner = "client!oea", name = "rg", descriptor = "[F")
    private float[] field8627;

    @OriginalMember(owner = "client!oea", name = "qh", descriptor = "I")
    public int field8678;

    @OriginalMember(owner = "client!oea", name = "Kg", descriptor = "I")
    private int field8646;

    @OriginalMember(owner = "client!oea", name = "Cg", descriptor = "I")
    private int field8638;

    @OriginalMember(owner = "client!oea", name = "Ch", descriptor = "[Lbh;")
    private class36[] field8690;

    @OriginalMember(owner = "client!oea", name = "Ah", descriptor = "Lmea;")
    public class427 field8688;

    @OriginalMember(owner = "client!oea", name = "Dh", descriptor = "[I")
    public int[] field8691;

    @OriginalMember(owner = "client!oea", name = "Hh", descriptor = "[I")
    public int[] field8695;

    @OriginalMember(owner = "client!oea", name = "Fh", descriptor = "[B")
    public byte[] field8693;

    @OriginalMember(owner = "client!oea", name = "Eh", descriptor = "[I")
    public int[] field8692;

    @OriginalMember(owner = "client!oea", name = "Db", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8380;

    @OriginalMember(owner = "client!oea", name = "Td", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8500;

    @OriginalMember(owner = "client!oea", name = "Fe", descriptor = "I")
    public int field8538;

    @OriginalMember(owner = "client!oea", name = "ob", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field8365;

    @OriginalMember(owner = "client!oea", name = "Cb", descriptor = "J")
    private long field8379;

    @OriginalMember(owner = "client!oea", name = "ld", descriptor = "J")
    private long field8466;

    @OriginalMember(owner = "client!oea", name = "uh", descriptor = "Z")
    public boolean field8682;

    @OriginalMember(owner = "client!oea", name = "Pg", descriptor = "I")
    public int field8651;

    @OriginalMember(owner = "client!oea", name = "cg", descriptor = "Ljava/lang/String;")
    private String field8612;

    @OriginalMember(owner = "client!oea", name = "Mf", descriptor = "Z")
    public boolean field8596;

    @OriginalMember(owner = "client!oea", name = "Rf", descriptor = "Z")
    public boolean field8601;

    @OriginalMember(owner = "client!oea", name = "yf", descriptor = "Z")
    private boolean field8582;

    @OriginalMember(owner = "client!oea", name = "Df", descriptor = "Z")
    public boolean field8587;

    @OriginalMember(owner = "client!oea", name = "xg", descriptor = "Z")
    public boolean field8633;

    @OriginalMember(owner = "client!oea", name = "Eg", descriptor = "Z")
    private boolean field8640;

    @OriginalMember(owner = "client!oea", name = "th", descriptor = "Ljava/lang/String;")
    private String field8681;

    @OriginalMember(owner = "client!oea", name = "og", descriptor = "Z")
    public boolean field8624;

    @OriginalMember(owner = "client!oea", name = "Ef", descriptor = "Z")
    private boolean field8588;

    @OriginalMember(owner = "client!oea", name = "Ae", descriptor = "Lvga;")
    private class85 field8533;

    @OriginalMember(owner = "client!oea", name = "Qe", descriptor = "Ltha;")
    public class292 field8549;

    @OriginalMember(owner = "client!oea", name = "Be", descriptor = "Lsi;")
    private class556 field8534;

    @OriginalMember(owner = "client!oea", name = "we", descriptor = "Luba;")
    private class428 field8529;

    @OriginalMember(owner = "client!oea", name = "xe", descriptor = "Luu;")
    private class285 field8530;

    @OriginalMember(owner = "client!oea", name = "ed", descriptor = "Ljj;")
    public static class118 field8459 = class262.method1774((byte) 127);

    @OriginalMember(owner = "client!oea", name = "yd", descriptor = "[I")
    public static int[] field8479 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!oea", name = "ue", descriptor = "Lsn;")
    public static class628 field8527 = new class628();

    @OriginalMember(owner = "client!oea", name = "Kf", descriptor = "F")
    public float field8594;

    @OriginalMember(owner = "client!oea", name = "Nf", descriptor = "F")
    public float field8597;

    @OriginalMember(owner = "client!oea", name = "Sf", descriptor = "F")
    private float field8602;

    @OriginalMember(owner = "client!oea", name = "ig", descriptor = "F")
    public float field8618;

    @OriginalMember(owner = "client!oea", name = "kg", descriptor = "F")
    public float field8620;

    @OriginalMember(owner = "client!oea", name = "sg", descriptor = "F")
    public float field8628;

    @OriginalMember(owner = "client!oea", name = "eh", descriptor = "F")
    public float field8666;

    @OriginalMember(owner = "client!oea", name = "oh", descriptor = "F")
    private float field8676;

    @OriginalMember(owner = "client!oea", name = "ph", descriptor = "F")
    private float field8677;

    @OriginalMember(owner = "client!oea", name = "z", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!oea", name = "A", descriptor = "I")
    public static int field8326;

    @OriginalMember(owner = "client!oea", name = "B", descriptor = "I")
    public static int field8327;

    @OriginalMember(owner = "client!oea", name = "C", descriptor = "I")
    public static int field8328;

    @OriginalMember(owner = "client!oea", name = "D", descriptor = "I")
    public static int field8329;

    @OriginalMember(owner = "client!oea", name = "E", descriptor = "I")
    public static int field8330;

    @OriginalMember(owner = "client!oea", name = "F", descriptor = "I")
    public static int field8331;

    @OriginalMember(owner = "client!oea", name = "H", descriptor = "I")
    public static int field8332;

    @OriginalMember(owner = "client!oea", name = "I", descriptor = "I")
    public static int field8333;

    @OriginalMember(owner = "client!oea", name = "J", descriptor = "I")
    public static int field8334;

    @OriginalMember(owner = "client!oea", name = "K", descriptor = "I")
    public static int field8335;

    @OriginalMember(owner = "client!oea", name = "L", descriptor = "I")
    public static int field8336;

    @OriginalMember(owner = "client!oea", name = "M", descriptor = "I")
    public static int field8337;

    @OriginalMember(owner = "client!oea", name = "N", descriptor = "I")
    public static int field8338;

    @OriginalMember(owner = "client!oea", name = "O", descriptor = "I")
    public static int field8339;

    @OriginalMember(owner = "client!oea", name = "P", descriptor = "I")
    public static int field8340;

    @OriginalMember(owner = "client!oea", name = "Q", descriptor = "I")
    public static int field8341;

    @OriginalMember(owner = "client!oea", name = "R", descriptor = "I")
    public static int field8342;

    @OriginalMember(owner = "client!oea", name = "S", descriptor = "I")
    public static int field8343;

    @OriginalMember(owner = "client!oea", name = "T", descriptor = "I")
    public static int field8344;

    @OriginalMember(owner = "client!oea", name = "U", descriptor = "I")
    public static int field8345;

    @OriginalMember(owner = "client!oea", name = "V", descriptor = "I")
    public static int field8346;

    @OriginalMember(owner = "client!oea", name = "W", descriptor = "I")
    public static int field8347;

    @OriginalMember(owner = "client!oea", name = "X", descriptor = "I")
    public static int field8348;

    @OriginalMember(owner = "client!oea", name = "Y", descriptor = "I")
    public static int field8349;

    @OriginalMember(owner = "client!oea", name = "Z", descriptor = "I")
    public static int field8350;

    @OriginalMember(owner = "client!oea", name = "ab", descriptor = "I")
    public static int field8351;

    @OriginalMember(owner = "client!oea", name = "bb", descriptor = "I")
    public static int field8352;

    @OriginalMember(owner = "client!oea", name = "cb", descriptor = "I")
    public static int field8353;

    @OriginalMember(owner = "client!oea", name = "db", descriptor = "I")
    public static int field8354;

    @OriginalMember(owner = "client!oea", name = "eb", descriptor = "I")
    public static int field8355;

    @OriginalMember(owner = "client!oea", name = "fb", descriptor = "I")
    public static int field8356;

    @OriginalMember(owner = "client!oea", name = "gb", descriptor = "I")
    public static int field8357;

    @OriginalMember(owner = "client!oea", name = "hb", descriptor = "I")
    public static int field8358;

    @OriginalMember(owner = "client!oea", name = "ib", descriptor = "I")
    public static int field8359;

    @OriginalMember(owner = "client!oea", name = "jb", descriptor = "I")
    public static int field8360;

    @OriginalMember(owner = "client!oea", name = "kb", descriptor = "I")
    public static int field8361;

    @OriginalMember(owner = "client!oea", name = "lb", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!oea", name = "mb", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!oea", name = "nb", descriptor = "I")
    public static int field8364;

    @OriginalMember(owner = "client!oea", name = "pb", descriptor = "I")
    public static int field8366;

    @OriginalMember(owner = "client!oea", name = "qb", descriptor = "I")
    public static int field8367;

    @OriginalMember(owner = "client!oea", name = "rb", descriptor = "I")
    public static int field8368;

    @OriginalMember(owner = "client!oea", name = "sb", descriptor = "I")
    public static int field8369;

    @OriginalMember(owner = "client!oea", name = "tb", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!oea", name = "ub", descriptor = "I")
    public static int field8371;

    @OriginalMember(owner = "client!oea", name = "vb", descriptor = "I")
    public static int field8372;

    @OriginalMember(owner = "client!oea", name = "wb", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!oea", name = "xb", descriptor = "I")
    public static int field8374;

    @OriginalMember(owner = "client!oea", name = "yb", descriptor = "I")
    public static int field8375;

    @OriginalMember(owner = "client!oea", name = "zb", descriptor = "I")
    public static int field8376;

    @OriginalMember(owner = "client!oea", name = "Ab", descriptor = "I")
    public static int field8377;

    @OriginalMember(owner = "client!oea", name = "Bb", descriptor = "I")
    public static int field8378;

    @OriginalMember(owner = "client!oea", name = "Eb", descriptor = "I")
    public static int field8381;

    @OriginalMember(owner = "client!oea", name = "Fb", descriptor = "I")
    public static int field8382;

    @OriginalMember(owner = "client!oea", name = "Gb", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!oea", name = "Hb", descriptor = "I")
    public static int field8384;

    @OriginalMember(owner = "client!oea", name = "Ib", descriptor = "I")
    public static int field8385;

    @OriginalMember(owner = "client!oea", name = "Jb", descriptor = "I")
    public static int field8386;

    @OriginalMember(owner = "client!oea", name = "Kb", descriptor = "I")
    public static int field8387;

    @OriginalMember(owner = "client!oea", name = "Lb", descriptor = "I")
    public static int field8388;

    @OriginalMember(owner = "client!oea", name = "Mb", descriptor = "I")
    public static int field8389;

    @OriginalMember(owner = "client!oea", name = "Nb", descriptor = "I")
    public static int field8390;

    @OriginalMember(owner = "client!oea", name = "Ob", descriptor = "I")
    public static int field8391;

    @OriginalMember(owner = "client!oea", name = "Pb", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!oea", name = "Qb", descriptor = "I")
    public static int field8393;

    @OriginalMember(owner = "client!oea", name = "Rb", descriptor = "I")
    public static int field8394;

    @OriginalMember(owner = "client!oea", name = "Sb", descriptor = "I")
    public static int field8395;

    @OriginalMember(owner = "client!oea", name = "Tb", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!oea", name = "Ub", descriptor = "I")
    public static int field8397;

    @OriginalMember(owner = "client!oea", name = "Vb", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!oea", name = "Wb", descriptor = "I")
    public static int field8399;

    @OriginalMember(owner = "client!oea", name = "Xb", descriptor = "I")
    public static int field8400;

    @OriginalMember(owner = "client!oea", name = "Yb", descriptor = "I")
    public static int field8401;

    @OriginalMember(owner = "client!oea", name = "Zb", descriptor = "I")
    public static int field8402;

    @OriginalMember(owner = "client!oea", name = "ac", descriptor = "I")
    public static int field8403;

    @OriginalMember(owner = "client!oea", name = "bc", descriptor = "I")
    public static int field8404;

    @OriginalMember(owner = "client!oea", name = "cc", descriptor = "I")
    public static int field8405;

    @OriginalMember(owner = "client!oea", name = "dc", descriptor = "I")
    public static int field8406;

    @OriginalMember(owner = "client!oea", name = "ec", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!oea", name = "fc", descriptor = "I")
    public static int field8408;

    @OriginalMember(owner = "client!oea", name = "gc", descriptor = "I")
    public static int field8409;

    @OriginalMember(owner = "client!oea", name = "hc", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!oea", name = "ic", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!oea", name = "jc", descriptor = "I")
    public static int field8412;

    @OriginalMember(owner = "client!oea", name = "kc", descriptor = "I")
    public static int field8413;

    @OriginalMember(owner = "client!oea", name = "lc", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!oea", name = "mc", descriptor = "I")
    public static int field8415;

    @OriginalMember(owner = "client!oea", name = "nc", descriptor = "I")
    public static int field8416;

    @OriginalMember(owner = "client!oea", name = "oc", descriptor = "I")
    public static int field8417;

    @OriginalMember(owner = "client!oea", name = "pc", descriptor = "I")
    public static int field8418;

    @OriginalMember(owner = "client!oea", name = "qc", descriptor = "I")
    public static int field8419;

    @OriginalMember(owner = "client!oea", name = "rc", descriptor = "I")
    public static int field8420;

    @OriginalMember(owner = "client!oea", name = "sc", descriptor = "I")
    public static int field8421;

    @OriginalMember(owner = "client!oea", name = "tc", descriptor = "I")
    public static int field8422;

    @OriginalMember(owner = "client!oea", name = "uc", descriptor = "I")
    public static int field8423;

    @OriginalMember(owner = "client!oea", name = "vc", descriptor = "I")
    public static int field8424;

    @OriginalMember(owner = "client!oea", name = "wc", descriptor = "I")
    public static int field8425;

    @OriginalMember(owner = "client!oea", name = "xc", descriptor = "I")
    public static int field8426;

    @OriginalMember(owner = "client!oea", name = "yc", descriptor = "I")
    public static int field8427;

    @OriginalMember(owner = "client!oea", name = "zc", descriptor = "I")
    public static int field8428;

    @OriginalMember(owner = "client!oea", name = "Ac", descriptor = "I")
    public static int field8429;

    @OriginalMember(owner = "client!oea", name = "Bc", descriptor = "I")
    public static int field8430;

    @OriginalMember(owner = "client!oea", name = "Cc", descriptor = "I")
    public static int field8431;

    @OriginalMember(owner = "client!oea", name = "Dc", descriptor = "I")
    public static int field8432;

    @OriginalMember(owner = "client!oea", name = "Ec", descriptor = "I")
    public static int field8433;

    @OriginalMember(owner = "client!oea", name = "Fc", descriptor = "I")
    public static int field8434;

    @OriginalMember(owner = "client!oea", name = "Gc", descriptor = "I")
    public static int field8435;

    @OriginalMember(owner = "client!oea", name = "Hc", descriptor = "I")
    public static int field8436;

    @OriginalMember(owner = "client!oea", name = "Ic", descriptor = "I")
    public static int field8437;

    @OriginalMember(owner = "client!oea", name = "Jc", descriptor = "I")
    public static int field8438;

    @OriginalMember(owner = "client!oea", name = "Kc", descriptor = "I")
    public static int field8439;

    @OriginalMember(owner = "client!oea", name = "Lc", descriptor = "I")
    public static int field8440;

    @OriginalMember(owner = "client!oea", name = "Mc", descriptor = "I")
    public static int field8441;

    @OriginalMember(owner = "client!oea", name = "Nc", descriptor = "I")
    public static int field8442;

    @OriginalMember(owner = "client!oea", name = "Oc", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!oea", name = "Pc", descriptor = "I")
    public static int field8444;

    @OriginalMember(owner = "client!oea", name = "Qc", descriptor = "I")
    public static int field8445;

    @OriginalMember(owner = "client!oea", name = "Rc", descriptor = "I")
    public static int field8446;

    @OriginalMember(owner = "client!oea", name = "Sc", descriptor = "I")
    public static int field8447;

    @OriginalMember(owner = "client!oea", name = "Tc", descriptor = "I")
    public static int field8448;

    @OriginalMember(owner = "client!oea", name = "Uc", descriptor = "I")
    public static int field8449;

    @OriginalMember(owner = "client!oea", name = "Vc", descriptor = "I")
    public static int field8450;

    @OriginalMember(owner = "client!oea", name = "Wc", descriptor = "I")
    public static int field8451;

    @OriginalMember(owner = "client!oea", name = "Xc", descriptor = "I")
    public static int field8452;

    @OriginalMember(owner = "client!oea", name = "Yc", descriptor = "I")
    public static int field8453;

    @OriginalMember(owner = "client!oea", name = "Zc", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!oea", name = "ad", descriptor = "I")
    public static int field8455;

    @OriginalMember(owner = "client!oea", name = "bd", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!oea", name = "cd", descriptor = "I")
    public static int field8457;

    @OriginalMember(owner = "client!oea", name = "dd", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!oea", name = "fd", descriptor = "I")
    public static int field8460;

    @OriginalMember(owner = "client!oea", name = "gd", descriptor = "I")
    public static int field8461;

    @OriginalMember(owner = "client!oea", name = "hd", descriptor = "I")
    public static int field8462;

    @OriginalMember(owner = "client!oea", name = "id", descriptor = "I")
    public static int field8463;

    @OriginalMember(owner = "client!oea", name = "jd", descriptor = "I")
    public static int field8464;

    @OriginalMember(owner = "client!oea", name = "kd", descriptor = "I")
    public static int field8465;

    @OriginalMember(owner = "client!oea", name = "md", descriptor = "I")
    public static int field8467;

    @OriginalMember(owner = "client!oea", name = "nd", descriptor = "I")
    public static int field8468;

    @OriginalMember(owner = "client!oea", name = "od", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!oea", name = "pd", descriptor = "I")
    private int field8470;

    @OriginalMember(owner = "client!oea", name = "qd", descriptor = "I")
    public static int field8471;

    @OriginalMember(owner = "client!oea", name = "rd", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!oea", name = "sd", descriptor = "I")
    public static int field8473;

    @OriginalMember(owner = "client!oea", name = "td", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!oea", name = "ud", descriptor = "I")
    public static int field8475;

    @OriginalMember(owner = "client!oea", name = "vd", descriptor = "I")
    public static int field8476;

    @OriginalMember(owner = "client!oea", name = "wd", descriptor = "I")
    public static int field8477;

    @OriginalMember(owner = "client!oea", name = "xd", descriptor = "I")
    public static int field8478;

    @OriginalMember(owner = "client!oea", name = "zd", descriptor = "I")
    public static int field8480;

    @OriginalMember(owner = "client!oea", name = "Ad", descriptor = "I")
    public static int field8481;

    @OriginalMember(owner = "client!oea", name = "Bd", descriptor = "I")
    public static int field8482;

    @OriginalMember(owner = "client!oea", name = "Dd", descriptor = "I")
    public static int field8484;

    @OriginalMember(owner = "client!oea", name = "Ed", descriptor = "I")
    public static int field8485;

    @OriginalMember(owner = "client!oea", name = "Gd", descriptor = "I")
    public static int field8487;

    @OriginalMember(owner = "client!oea", name = "Hd", descriptor = "I")
    public static int field8488;

    @OriginalMember(owner = "client!oea", name = "Id", descriptor = "I")
    public static int field8489;

    @OriginalMember(owner = "client!oea", name = "Jd", descriptor = "I")
    public static int field8490;

    @OriginalMember(owner = "client!oea", name = "Kd", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!oea", name = "Ld", descriptor = "I")
    public static int field8492;

    @OriginalMember(owner = "client!oea", name = "Md", descriptor = "I")
    public static int field8493;

    @OriginalMember(owner = "client!oea", name = "Nd", descriptor = "I")
    public static int field8494;

    @OriginalMember(owner = "client!oea", name = "Od", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!oea", name = "Pd", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!oea", name = "Qd", descriptor = "I")
    public static int field8497;

    @OriginalMember(owner = "client!oea", name = "Rd", descriptor = "I")
    public static int field8498;

    @OriginalMember(owner = "client!oea", name = "Sd", descriptor = "I")
    public static int field8499;

    @OriginalMember(owner = "client!oea", name = "Ud", descriptor = "I")
    public static int field8501;

    @OriginalMember(owner = "client!oea", name = "Vd", descriptor = "I")
    public static int field8502;

    @OriginalMember(owner = "client!oea", name = "Wd", descriptor = "I")
    public static int field8503;

    @OriginalMember(owner = "client!oea", name = "Xd", descriptor = "I")
    public static int field8504;

    @OriginalMember(owner = "client!oea", name = "Zd", descriptor = "I")
    public static int field8506;

    @OriginalMember(owner = "client!oea", name = "ae", descriptor = "I")
    public static int field8507;

    @OriginalMember(owner = "client!oea", name = "be", descriptor = "I")
    public static int field8508;

    @OriginalMember(owner = "client!oea", name = "ce", descriptor = "I")
    public static int field8509;

    @OriginalMember(owner = "client!oea", name = "de", descriptor = "I")
    public static int field8510;

    @OriginalMember(owner = "client!oea", name = "ee", descriptor = "I")
    public static int field8511;

    @OriginalMember(owner = "client!oea", name = "fe", descriptor = "I")
    public static int field8512;

    @OriginalMember(owner = "client!oea", name = "ge", descriptor = "I")
    public static int field8513;

    @OriginalMember(owner = "client!oea", name = "he", descriptor = "I")
    private int field8514;

    @OriginalMember(owner = "client!oea", name = "ie", descriptor = "I")
    public static int field8515;

    @OriginalMember(owner = "client!oea", name = "je", descriptor = "I")
    public static int field8516;

    @OriginalMember(owner = "client!oea", name = "ke", descriptor = "I")
    public static int field8517;

    @OriginalMember(owner = "client!oea", name = "le", descriptor = "I")
    public static int field8518;

    @OriginalMember(owner = "client!oea", name = "me", descriptor = "I")
    public static int field8519;

    @OriginalMember(owner = "client!oea", name = "ne", descriptor = "I")
    public int field8520;

    @OriginalMember(owner = "client!oea", name = "oe", descriptor = "I")
    public static int field8521;

    @OriginalMember(owner = "client!oea", name = "pe", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!oea", name = "qe", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!oea", name = "re", descriptor = "I")
    public static int field8524;

    @OriginalMember(owner = "client!oea", name = "se", descriptor = "I")
    public static int field8525;

    @OriginalMember(owner = "client!oea", name = "te", descriptor = "I")
    public int field8526;

    @OriginalMember(owner = "client!oea", name = "ye", descriptor = "I")
    public static int field8531;

    @OriginalMember(owner = "client!oea", name = "ze", descriptor = "I")
    public static int field8532;

    @OriginalMember(owner = "client!oea", name = "Ce", descriptor = "I")
    public static int field8535;

    @OriginalMember(owner = "client!oea", name = "De", descriptor = "I")
    public static int field8536;

    @OriginalMember(owner = "client!oea", name = "Ee", descriptor = "I")
    public static int field8537;

    @OriginalMember(owner = "client!oea", name = "Le", descriptor = "I")
    public int field8544;

    @OriginalMember(owner = "client!oea", name = "cf", descriptor = "I")
    public int field8561;

    @OriginalMember(owner = "client!oea", name = "df", descriptor = "I")
    private int field8562;

    @OriginalMember(owner = "client!oea", name = "ef", descriptor = "I")
    public int field8563;

    @OriginalMember(owner = "client!oea", name = "mf", descriptor = "I")
    private int field8570;

    @OriginalMember(owner = "client!oea", name = "rf", descriptor = "I")
    private int field8575;

    @OriginalMember(owner = "client!oea", name = "uf", descriptor = "I")
    private int field8578;

    @OriginalMember(owner = "client!oea", name = "Bf", descriptor = "I")
    public int field8585;

    @OriginalMember(owner = "client!oea", name = "Hf", descriptor = "I")
    public int field8591;

    @OriginalMember(owner = "client!oea", name = "Jf", descriptor = "I")
    private int field8593;

    @OriginalMember(owner = "client!oea", name = "mg", descriptor = "I")
    public int field8622;

    @OriginalMember(owner = "client!oea", name = "zg", descriptor = "I")
    public int field8635;

    @OriginalMember(owner = "client!oea", name = "Ng", descriptor = "I")
    private int field8649;

    @OriginalMember(owner = "client!oea", name = "Vg", descriptor = "I")
    private int field8657;

    @OriginalMember(owner = "client!oea", name = "Xg", descriptor = "I")
    private int field8659;

    @OriginalMember(owner = "client!oea", name = "gh", descriptor = "I")
    private int field8668;

    @OriginalMember(owner = "client!oea", name = "hh", descriptor = "I")
    private int field8669;

    @OriginalMember(owner = "client!oea", name = "nh", descriptor = "I")
    private int field8675;

    @OriginalMember(owner = "client!oea", name = "vh", descriptor = "I")
    private int field8683;

    @OriginalMember(owner = "client!oea", name = "Gh", descriptor = "I")
    private int field8694;

    @OriginalMember(owner = "client!oea", name = "Ih", descriptor = "I")
    private int field8696;

    @OriginalMember(owner = "client!oea", name = "qf", descriptor = "J")
    private long field8574;

    @OriginalMember(owner = "client!oea", name = "He", descriptor = "Luaa;")
    public static class116 field8540;

    @OriginalMember(owner = "client!oea", name = "yh", descriptor = "Laq;")
    private class159 field8686;

    @OriginalMember(owner = "client!oea", name = "Ve", descriptor = "Lkh;")
    private class15 field8554;

    @OriginalMember(owner = "client!oea", name = "Wg", descriptor = "Lm;")
    private class189 field8658;

    @OriginalMember(owner = "client!oea", name = "Tf", descriptor = "Lme;")
    public class192 field8603;

    @OriginalMember(owner = "client!oea", name = "Of", descriptor = "Ldda;")
    public class379 field8598;

    @OriginalMember(owner = "client!oea", name = "gg", descriptor = "Ldda;")
    public class379 field8616;

    @OriginalMember(owner = "client!oea", name = "We", descriptor = "Lij;")
    private class419 field8555;

    @OriginalMember(owner = "client!oea", name = "kh", descriptor = "Lij;")
    public class419 field8672;

    @OriginalMember(owner = "client!oea", name = "Ff", descriptor = "Ltda;")
    private class635 field8589;

    @OriginalMember(owner = "client!oea", name = "Qf", descriptor = "Ltda;")
    private class635 field8600;

    @OriginalMember(owner = "client!oea", name = "Fd", descriptor = "Lwc;")
    public static class66 field8486;

    @OriginalMember(owner = "client!oea", name = "Se", descriptor = "Lpw;")
    private class703 field8551;

    @OriginalMember(owner = "client!oea", name = "Ue", descriptor = "Lpw;")
    private class703 field8553;

    @OriginalMember(owner = "client!oea", name = "Af", descriptor = "Lgea;")
    public class74 field8584;

    @OriginalMember(owner = "client!oea", name = "Zf", descriptor = "Lgea;")
    public class74 field8609;

    @OriginalMember(owner = "client!oea", name = "hg", descriptor = "Lgea;")
    public class74 field8617;

    @OriginalMember(owner = "client!oea", name = "Ag", descriptor = "Lgea;")
    public class74 field8636;

    @OriginalMember(owner = "client!oea", name = "Tg", descriptor = "Lgea;")
    public class74 field8655;

    @OriginalMember(owner = "client!oea", name = "ah", descriptor = "Lgea;")
    public class74 field8662;

    @OriginalMember(owner = "client!oea", name = "ch", descriptor = "Lgea;")
    public class74 field8664;

    @OriginalMember(owner = "client!oea", name = "ih", descriptor = "Lgea;")
    public class74 field8670;

    @OriginalMember(owner = "client!oea", name = "xh", descriptor = "Lgea;")
    public class74 field8685;

    @OriginalMember(owner = "client!oea", name = "Bh", descriptor = "Lgea;")
    public class74 field8689;

    @OriginalMember(owner = "client!oea", name = "vg", descriptor = "Lff;")
    private class9 field8631;

    @OriginalMember(owner = "client!oea", name = "Ke", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field8543;

    @OriginalMember(owner = "client!oea", name = "nf", descriptor = "Z")
    private boolean field8571;

    @OriginalMember(owner = "client!oea", name = "of", descriptor = "Z")
    private boolean field8572;

    @OriginalMember(owner = "client!oea", name = "pf", descriptor = "Z")
    private boolean field8573;

    @OriginalMember(owner = "client!oea", name = "tf", descriptor = "Z")
    private boolean field8577;

    @OriginalMember(owner = "client!oea", name = "Wf", descriptor = "Z")
    public boolean field8606;

    @OriginalMember(owner = "client!oea", name = "Xf", descriptor = "Z")
    private boolean field8607;

    @OriginalMember(owner = "client!oea", name = "dg", descriptor = "Z")
    public boolean field8613;

    @OriginalMember(owner = "client!oea", name = "fg", descriptor = "Z")
    private boolean field8615;

    @OriginalMember(owner = "client!oea", name = "ug", descriptor = "Z")
    private boolean field8630;

    @OriginalMember(owner = "client!oea", name = "Ig", descriptor = "Z")
    public boolean field8644;

    @OriginalMember(owner = "client!oea", name = "Jg", descriptor = "Z")
    public boolean field8645;

    @OriginalMember(owner = "client!oea", name = "Lg", descriptor = "Z")
    private boolean field8647;

    @OriginalMember(owner = "client!oea", name = "Mg", descriptor = "Z")
    private boolean field8648;

    @OriginalMember(owner = "client!oea", name = "Qg", descriptor = "Z")
    public boolean field8652;

    @OriginalMember(owner = "client!oea", name = "Ug", descriptor = "Z")
    public boolean field8656;

    @OriginalMember(owner = "client!oea", name = "Yg", descriptor = "Z")
    public boolean field8660;

    @OriginalMember(owner = "client!oea", name = "lh", descriptor = "Z")
    private boolean field8673;

    @OriginalMember(owner = "client!oea", name = "wh", descriptor = "Z")
    public boolean field8684;

    @OriginalMember(owner = "client!oea", name = "zh", descriptor = "Z")
    private boolean field8687;

    @OriginalMember(owner = "client!oea", name = "Yd", descriptor = "[I")
    public static int[] field8505;

    @OriginalMember(owner = "client!oea", name = "Yf", descriptor = "[Liia;")
    private class87[] field8608;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "([IIIIIZ)Lkr;")
    public final class743 method620(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8353;
        return new class15(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!oea", name = "K", descriptor = "([I)V")
    public final void method624(int[] arg0) {
        arg0[3] = this.field8680;
        ++field8480;
        arg0[2] = this.field8619;
        arg0[1] = this.field8646;
        arg0[0] = this.field8610;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Ltda;I)V")
    public final void method3403(class635 arg0, int arg1) {
        if (this.field8589 != arg0) {
            if (this.field8582) {
                OpenGL.glBindBufferARB(34962, arg0.method2158((byte) -118));
            }
            this.field8589 = arg0;
        }
        ++field8388;
        if (arg1 < 63) {
            this.method3409((class379) null, (class379) null, (class379) null, (class379) null, (byte) 71);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "([I)V")
    public final void method524(int[] arg0) {
        ++field8381;
        arg0[1] = this.field8520;
        arg0[0] = this.field8526;
    }

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "(I)V")
    public final void method3404(int arg0) {
        if (this.field8575 != 8) {
            this.method3472((byte) 65);
            this.method3414(true, -32);
            this.method3475(true, true);
            this.method3483(119, true);
            this.method3454(1, arg0 + 92);
            this.field8575 = 8;
        }
        if (arg0 == 0) {
            ++field8332;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lpw;Z)V")
    public final void method3405(class703 arg0, boolean arg1) {
        ++field8326;
        if (~this.field8558 <= -4) {
            throw new RuntimeException();
        } else {
            if (this.field8558 >= 0) {
                this.field8557[this.field8558].method2566((byte) 64);
            }
            if (!arg1) {
                this.field8553 = this.field8557[++this.field8558] = arg0;
                this.field8553.method2558(26754);
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method529(Canvas arg0) {
        ++field8423;
        this.field8466 = 0L;
        this.field8500 = null;
        if (arg0 != null && this.field8380 != arg0) {
            if (this.field8483.containsKey(arg0)) {
                Long var2 = (Long) this.field8483.get(arg0);
                this.field8466 = var2;
                this.field8500 = arg0;
            }
        } else {
            this.field8500 = this.field8380;
            this.field8466 = this.field8379;
        }
        if (this.field8500 != null && this.field8466 != 0L) {
            this.field8365.setSurface(this.field8466);
            this.method3484((byte) -93);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oea", name = "l", descriptor = "(I)V")
    public static final void method3406(int arg0) {
        class372.method2342();
        ++field8357;
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class630.field9041[var1].method3994(false);
        }
        class615.method3536((byte) 102);
        class114.method941(arg0 ^ arg0);
        class50.method455(92);
        System.gc();
        class359.field5046.method619();
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(B)V")
    public final void method3407(byte arg0) {
        ++field8371;
        OpenGL.glPopMatrix();
        if (arg0 <= 49) {
            this.field8648 = false;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIB)V")
    public final synchronized void method3408(int arg0, int arg1, byte arg2) {
        if (arg2 == -15) {
            ++field8384;
            class528 var4 = new class528(arg1);
            var4.field8991 = (long) arg0;
            this.field8565.method1526(var4, arg2 + -74);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Ldda;Ldda;Ldda;Ldda;B)V")
    public final void method3409(class379 arg0, class379 arg1, class379 arg2, class379 arg3, byte arg4) {
        if (arg0 != null) {
            this.method3403(arg0.field5288, 68);
            OpenGL.glVertexPointer(arg0.field5291, arg0.field5289, this.field8589.method2162(true), this.field8589.method2160((byte) -104) - -((long) arg0.field5286));
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        ++field8405;
        if (arg4 <= 117) {
            this.field8606 = true;
        }
        if (arg1 != null) {
            this.method3403(arg1.field5288, 92);
            OpenGL.glNormalPointer(arg1.field5289, this.field8589.method2162(true), this.field8589.method2160((byte) -104) + (long) arg1.field5286);
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg2 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method3403(arg2.field5288, 65);
            OpenGL.glColorPointer(arg2.field5291, arg2.field5289, this.field8589.method2162(true), this.field8589.method2160((byte) -104) + (long) arg2.field5286);
            OpenGL.glEnableClientState(32886);
        }
        if (arg3 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method3403(arg3.field5288, 127);
            OpenGL.glTexCoordPointer(arg3.field5291, arg3.field5289, this.field8589.method2162(true), this.field8589.method2160((byte) -104) - -((long) arg3.field5286));
            OpenGL.glEnableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(BI)V")
    public final synchronized void method3410(byte arg0, int arg1) {
        ++field8519;
        class528 var3 = new class528(arg1);
        if (arg0 < 103) {
            this.method3431(68L, (byte) 6);
        }
        this.field8566.method1526(var3, -125);
    }

    @OriginalMember(owner = "client!oea", name = "Y", descriptor = "()[I")
    public final int[] method547() {
        ++field8477;
        return new int[] { this.field8678, this.field8583, this.field8679, this.field8605 };
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Laca;B)V")
    public final void method3411(class724 arg0, byte arg1) {
        if (arg1 >= -69) {
            this.field8556 = -27;
        }
        ++field8506;
        OpenGL.glLoadMatrixf(arg0.method4026(5963), 0);
    }

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "(II)V")
    public final void method556(int arg0, int arg1) {
        if (this.field8653 != arg0 || ~this.field8661 != ~arg1) {
            this.field8661 = arg1;
            this.field8653 = arg0;
            this.method3449(-861579832);
            this.method3480(255);
            if (~this.field8659 == -4) {
                this.method3471(-28248);
            } else if (this.field8659 == 2) {
                this.method3437(false);
            }
        }
        ++field8398;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIZ)Lkr;")
    public final class743 method576(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field8490;
        return new class15(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!oea", name = "C", descriptor = "(Z)V")
    public final void method539(boolean arg0) {
        this.field8650 = arg0;
        ++field8373;
        this.method3479((byte) 49);
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "()V")
    public final void method533() {
        ++field8474;
        this.field8534.method3259(34836);
    }

    @OriginalMember(owner = "client!oea", name = "E", descriptor = "()I")
    public final int method641() {
        ++field8374;
        return this.field8563 + this.field8561 + this.field8562;
    }

    @OriginalMember(owner = "client!oea", name = "A", descriptor = "()V")
    public final void method638() {
        for (class626 var1 = this.field8547.method1522(true); var1 != null; var1 = this.field8547.method1527((byte) 60)) {
            ((class211) var1).method1484(false);
        }
        ++field8344;
        if (this.field8534 != null) {
            this.field8534.method3257(false);
        }
        if (this.field8365 != null) {
            this.method3452((byte) -74);
            Enumeration var2 = this.field8483.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field8483.get(var3);
                this.field8365.releaseSurface(var3, var4);
            }
            this.field8365.release();
            this.field8365 = null;
        }
        if (this.field8548) {
            class372.method2334(0, false, true);
            this.field8548 = false;
        }
    }

    @OriginalMember(owner = "client!oea", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field8375;
        float var10;
        float var11;
        if (this.field8658 != null && arg2 <= this.field8658.field2756 && arg3 <= this.field8658.field2753) {
            this.field8658.method1345(0, 0, 0, false, arg2, 0, 6406, 0, arg6, arg3);
            var10 = (float) arg3 * this.field8658.field2719 / (float) this.field8658.field2753;
            var11 = (float) arg2 * this.field8658.field2722 / (float) this.field8658.field2756;
        } else {
            this.field8658 = class41.method379(6406, 6406, arg6, arg2, arg3, this, false, 3553);
            this.field8658.method1346((byte) -102, false, false);
            var11 = this.field8658.field2722;
            var10 = this.field8658.field2719;
        }
        this.method3455(-110);
        this.method3425(this.field8658, 85);
        this.method3454(arg8, 102);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method3461((byte) 116, arg5);
        this.method3485(34165, (byte) 90, 34165);
        this.method3464(0, 768, false, 34166);
        this.method3464(2, 770, false, 5890);
        this.method3453(7482, 34166, 0, 770);
        this.method3453(7482, 5890, 2, 770);
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
        this.method3464(0, 768, false, 5890);
        this.method3464(2, 770, false, 34166);
        this.method3453(7482, 5890, 0, 770);
        this.method3453(7482, 34166, 2, 770);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I")
    public static final int method3412(int arg0, String arg1, int arg2, String arg3) {
        ++field8331;
        int var4 = arg3.length();
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > -var8 + var6 || ~(-var9 + var7) > ~var5) {
            if (~(-var8 + var6) <= ~var4) {
                return -1;
            }
            if (~(var7 - var9) <= ~var5) {
                return 1;
            }
            char var22;
            if (~var8 == -1) {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == 0) {
                var24 = arg1.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class445.method2661((byte) 104, var22);
            var9 = class445.method2661((byte) 104, var24);
            char var26 = class110.method935(arg2, (byte) -73, var22);
            char var27 = class110.method935(arg2, (byte) -73, var24);
            if (var26 != var27 && ~Character.toUpperCase(var26) != ~Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class679.method3839(var28, arg2, (byte) 28) + -class679.method3839(var29, arg2, (byte) 126);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var10 > var11; ++var11) {
            int var16;
            int var17;
            if (arg2 != 2) {
                var16 = var11;
                var17 = var11;
            } else {
                var16 = var5 + -1 + -var11;
                var17 = var4 + -1 - var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg1.charAt(var16);
            if (~var18 != ~var19 && ~Character.toUpperCase(var18) != ~Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class679.method3839(var20, arg2, (byte) 97) - class679.method3839(var21, arg2, (byte) 106);
                }
            }
        }
        int var12 = -var5 + var4;
        if (arg0 != -8322) {
            return 62;
        } else if (var12 != 0) {
            return var12;
        } else {
            for (int var13 = 0; var13 < var10; ++var13) {
                char var14 = arg3.charAt(var13);
                char var15 = arg1.charAt(var13);
                if (var14 != var15) {
                    return class679.method3839(var14, arg2, (byte) 62) + -class679.method3839(var15, arg2, (byte) 31);
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!oea", name = "g", descriptor = "(II)V")
    public final void method3413(int arg0, int arg1) {
        if (this.field8657 != arg0) {
            OpenGL.glActiveTexture(arg0 + 33984);
            this.field8657 = arg0;
        }
        if (arg1 != 33984) {
            this.method565();
        }
        ++field8335;
    }

    @OriginalMember(owner = "client!oea", name = "GA", descriptor = "(I)V")
    public final void method617(int arg0) {
        this.method3454(0, -57);
        ++field8443;
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (65280 & arg0) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZI)V")
    public final void method3414(boolean arg0, int arg1) {
        if (arg0 == !this.field8615) {
            this.field8615 = arg0;
            this.method3447(-1);
            this.field8575 &= -32;
        }
        if (arg1 != -32) {
            this.field8561 = 23;
        }
        ++field8468;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.method3478(770);
        ++field8351;
        this.method3454(arg12, 114);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg9 >> 16), (byte) (arg9 >> 8), (byte) arg9, (byte) (arg9 >> 24));
        OpenGL.glVertex3f((float) arg0 + 0.35F, (float) arg1 + 0.35F, (float) arg2);
        OpenGL.glColor4ub((byte) (arg10 >> 16), (byte) (arg10 >> 8), (byte) arg10, (byte) (arg10 >> 24));
        OpenGL.glVertex3f((float) arg3 + 0.35F, (float) arg4 + 0.35F, (float) arg5);
        OpenGL.glColor4ub((byte) (arg11 >> 16), (byte) (arg11 >> 8), (byte) arg11, (byte) (arg11 >> 24));
        OpenGL.glVertex3f((float) arg6 + 0.35F, (float) arg7 + 0.35F, (float) arg8);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Loo;)V")
    public final void method593(class624 arg0) {
        this.field8539.method2528(this, -1, arg0, -14075);
        ++field8461;
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(IIIIII)V")
    public final void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3478(770);
        ++field8523;
        this.method3454(arg5, 98);
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

    @OriginalMember(owner = "client!oea", name = "ra", descriptor = "(IIII)V")
    public final void method639(int arg0, int arg1, int arg2, int arg3) {
        this.field8585 = arg0;
        this.field8665 = arg2;
        this.field8656 = true;
        this.field8629 = arg3;
        ++field8417;
        this.field8674 = arg1;
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(IIIID)V")
    public final void method532(int arg0, int arg1, int arg2, int arg3, double arg4) {
        ++field8428;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIZ[B)Lff;")
    public final class9 method3415(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        ++field8328;
        if (!this.field8582 || arg3 && !this.field8640) {
            if (arg1 != 4) {
                this.field8543 = null;
            }
            return new class335(this, arg2, arg4, arg0);
        } else {
            return new class666(this, arg2, arg4, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!oea", name = "z", descriptor = "()Z")
    public final boolean method635() {
        ++field8467;
        return true;
    }

    @OriginalMember(owner = "client!oea", name = "g", descriptor = "(I)V")
    public final void method570(int arg0) {
        this.method3452((byte) -74);
        ++field8435;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(III)V")
    public final synchronized void method3416(int arg0, int arg1, int arg2) {
        int var4 = 5 % ((58 - arg1) / 53);
        ++field8429;
        class528 var5 = new class528(arg2);
        var5.field8991 = (long) arg0;
        this.field8564.method1526(var5, -110);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lza;)V")
    public final void method578(class411 arg0) {
        this.field8543 = ((class211) arg0).field3043;
        ++field8498;
        if (this.field8600 == null) {
            class427 var2 = new class427(80);
            if (!this.field8682) {
                var2.method2596(125, -1.0F);
                var2.method2596(74, -1.0F);
                var2.method2596(106, 0.0F);
                var2.method2596(99, 0.0F);
                var2.method2596(71, 1.0F);
                var2.method2596(67, 1.0F);
                var2.method2596(93, -1.0F);
                var2.method2596(61, 0.0F);
                var2.method2596(85, 1.0F);
                var2.method2596(67, 1.0F);
                var2.method2596(126, 1.0F);
                var2.method2596(91, 1.0F);
                var2.method2596(72, 0.0F);
                var2.method2596(68, 1.0F);
                var2.method2596(99, 0.0F);
                var2.method2596(60, -1.0F);
                var2.method2596(94, 1.0F);
                var2.method2596(60, 0.0F);
                var2.method2596(97, 0.0F);
                var2.method2596(91, 0.0F);
            } else {
                var2.method2597((byte) 46, -1.0F);
                var2.method2597((byte) 46, -1.0F);
                var2.method2597((byte) 46, 0.0F);
                var2.method2597((byte) 46, 0.0F);
                var2.method2597((byte) 46, 1.0F);
                var2.method2597((byte) 46, 1.0F);
                var2.method2597((byte) 46, -1.0F);
                var2.method2597((byte) 46, 0.0F);
                var2.method2597((byte) 46, 1.0F);
                var2.method2597((byte) 46, 1.0F);
                var2.method2597((byte) 46, 1.0F);
                var2.method2597((byte) 46, 1.0F);
                var2.method2597((byte) 46, 0.0F);
                var2.method2597((byte) 46, 1.0F);
                var2.method2597((byte) 46, 0.0F);
                var2.method2597((byte) 46, -1.0F);
                var2.method2597((byte) 46, 1.0F);
                var2.method2597((byte) 46, 0.0F);
                var2.method2597((byte) 46, 0.0F);
                var2.method2597((byte) 46, 0.0F);
            }
            this.field8600 = this.method3418(false, var2.field483, -2, 20, var2.field469);
            this.field8616 = new class379(this.field8600, 5126, 3, 0);
            this.field8598 = new class379(this.field8600, 5126, 2, 12);
            this.field8539.method2527(-122, this);
        }
    }

    @OriginalMember(owner = "client!oea", name = "h", descriptor = "(II)V")
    public final void method3417(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field8514 = -82;
        }
        if (~arg0 == -2) {
            this.method3485(7681, (byte) 78, 7681);
        } else if (arg0 == 0) {
            this.method3485(8448, (byte) 115, 8448);
        } else if (~arg0 != -3) {
            if (~arg0 != -4) {
                if (arg0 == 4) {
                    this.method3485(34023, (byte) 42, 34023);
                }
            } else {
                this.method3485(260, (byte) 50, 8448);
            }
        } else {
            this.method3485(34165, (byte) 86, 7681);
        }
        ++field8475;
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ld;I)V")
    public class594(Canvas arg0, class149 arg1, int arg2) {
        super(arg1);
        new class158();
        new class758(16);
        this.field8560 = new class220();
        this.field8564 = new class220();
        this.field8565 = new class220();
        this.field8566 = new class220();
        this.field8567 = new class220();
        this.field8568 = new class220();
        this.field8569 = new class220();
        this.field8576 = new class724();
        this.field8579 = new class724();
        this.field8580 = new class724();
        this.field8583 = 0;
        this.field8595 = new float[4];
        this.field8610 = 0;
        this.field8614 = 8448;
        this.field8581 = -1;
        this.field8605 = 512;
        this.field8592 = -1.0F;
        this.field8629 = 0;
        this.field8590 = 0.0F;
        this.field8619 = 0;
        this.field8621 = 0;
        this.field8604 = new float[4];
        this.field8641 = -1.0F;
        this.field8643 = 1.0F;
        this.field8637 = 1.0F;
        this.field8632 = 1.0F;
        this.field8626 = new float[4];
        this.field8653 = 50;
        this.field8661 = 3584;
        this.field8599 = -1;
        this.field8654 = 0;
        this.field8639 = new float[16];
        this.field8663 = 1.0F;
        this.field8634 = 8448;
        this.field8650 = true;
        this.field8586 = false;
        this.field8611 = 3584.0F;
        this.field8623 = 3584.0F;
        this.field8642 = -1.0F;
        this.field8667 = -1.0F;
        this.field8679 = 512;
        this.field8625 = 1.0F;
        this.field8674 = -1;
        this.field8680 = 0;
        this.field8671 = -1;
        this.field8665 = -1;
        this.field8627 = new float[4];
        this.field8678 = 0;
        this.field8646 = 0;
        this.field8638 = 0;
        this.field8690 = new class36[class255.field3700];
        this.field8688 = new class427(8192);
        this.field8691 = new int[1];
        this.field8695 = new int[1];
        this.field8693 = new byte[16384];
        this.field8692 = new int[1];
        this.field8500 = this.field8380 = arg0;
        this.field8538 = arg2;
        if (!class96.method870(0, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class96.method870(0, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field8365 = new OpenGL();
                this.field8466 = this.field8379 = this.field8365.init(arg0, 8, 8, 8, 24, 0, this.field8538);
                if (~this.field8379 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method3474(120);
                    int var4 = this.method3448(true);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field8651 = this.field8682 ? 33639 : 5121;
                        if (this.field8612.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class327.method2091(' ', 26911, this.field8612.replace('/', ' '));
                            for (int var9 = 0; var9 < var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (~var10.length() < -1) {
                                        if (~var10.charAt(0) == -121 && ~var10.length() <= -4 && class395.method2450(var10.substring(1, 3), 10)) {
                                            var10 = var10.substring(1);
                                            var7 = true;
                                        }
                                        if (var10.equals("hd")) {
                                            var6 = true;
                                        } else {
                                            if (var10.startsWith("hd")) {
                                                var10 = var10.substring(2);
                                                var6 = true;
                                            }
                                            if (~var10.length() <= -5 && class395.method2450(var10.substring(0, 4), 10)) {
                                                var5 = class547.method3226((byte) -123, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field8596 = false;
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && var5 <= 9250) {
                                    this.field8601 = false;
                                }
                                if (~var5 <= -7001 && ~var5 >= -8000) {
                                    this.field8582 = false;
                                }
                            }
                            this.field8587 &= this.field8365.method3599("GL_ARB_half_float_pixel");
                            this.field8633 = true;
                            this.field8640 = this.field8582;
                        }
                        if (~this.field8681.indexOf("intel") != 0) {
                            this.field8624 = false;
                        }
                        this.field8588 = !this.field8681.equals("s3 graphics");
                        if (this.field8582) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class419.method2564(false, -55, true);
                        this.field8548 = true;
                        this.field8533 = new class85(this, super.field1084);
                        this.method3469(-114);
                        this.field8549 = new class292(this);
                        this.field8534 = new class556(this);
                        if (this.field8534.method3255((byte) 23)) {
                            this.field8529 = new class428(this);
                            if (!this.field8529.method2600((byte) 69)) {
                                this.field8529.method1363((byte) 106);
                                this.field8529 = null;
                            }
                        }
                        this.field8530 = new class285(this);
                        this.method3456(16385);
                        this.method3484((byte) -116);
                        this.method567();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method638();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "r", descriptor = "()Z")
    public final boolean method600() {
        ++field8450;
        return this.field8647 && (!this.method562() || this.field8673);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Z)V")
    public final void method548(boolean arg0) {
        ++field8376;
    }

    @OriginalMember(owner = "client!oea", name = "xa", descriptor = "(F)V")
    public final void method552(float arg0) {
        if (this.field8628 != arg0) {
            this.field8628 = arg0;
            this.method3429((byte) 104);
        }
        ++field8348;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Z[BIII)Ltda;")
    public final class635 method3418(boolean arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        ++field8521;
        if (arg2 != -2) {
            return null;
        } else {
            return (class635) (!this.field8582 || arg0 && !this.field8640 ? new class341(this, arg3, arg1, arg4) : new class516(this, arg3, arg1, arg4, arg0));
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ILpw;)V")
    public final void method3419(int arg0, class703 arg1) {
        if (arg0 == 24178) {
            ++field8481;
            if (this.field8556 >= 3) {
                throw new RuntimeException();
            } else {
                if (~this.field8556 <= -1) {
                    this.field8552[this.field8556].method2568(5961);
                }
                this.field8551 = this.field8552[++this.field8556] = arg1;
                this.field8551.method2570((byte) 30);
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "ya", descriptor = "()V")
    public final void method619() {
        this.method3483(94, true);
        ++field8491;
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!oea", name = "T", descriptor = "(IIII)V")
    public final void method583(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field8610 > ~arg0) {
            this.field8610 = arg0;
        }
        if (~this.field8619 < ~arg2) {
            this.field8619 = arg2;
        }
        if (~this.field8646 > ~arg1) {
            this.field8646 = arg1;
        }
        if (this.field8680 > arg3) {
            this.field8680 = arg3;
        }
        ++field8366;
        OpenGL.glEnable(3089);
        this.method3434(-2068671888);
        this.method3438(83);
    }

    @OriginalMember(owner = "client!oea", name = "k", descriptor = "()V")
    public final void method565() {
        ++field8407;
    }

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "(II)I")
    public final int method614(int arg0, int arg1) {
        ++field8496;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!oea", name = "A", descriptor = "(ILaa;II)V")
    public final void method523(int arg0, class484 arg1, int arg2, int arg3) {
        ++field8434;
        class277 var5 = (class277) arg1;
        class189 var6 = var5.field3912;
        this.method3455(56);
        this.method3425(var5.field3912, -47);
        this.method3454(1, -117);
        this.method3485(7681, (byte) 116, 8448);
        this.method3464(0, 768, false, 34167);
        float var7 = var6.field2722 / (float) var6.field2720;
        float var8 = var6.field2719 / (float) var6.field2725;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field8610) * var7, (float) (this.field8646 - arg3) * var8);
        OpenGL.glVertex2i(this.field8610, this.field8646);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field8610) * var7, (float) (-arg3 + this.field8680) * var8);
        OpenGL.glVertex2i(this.field8610, this.field8680);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field8619) * var7, (float) (-arg3 + this.field8680) * var8);
        OpenGL.glVertex2i(this.field8619, this.field8680);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field8619) * var7, (float) (-arg3 + this.field8646) * var8);
        OpenGL.glVertex2i(this.field8619, this.field8646);
        OpenGL.glEnd();
        this.method3464(0, 768, false, 5890);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(BILff;II)V")
    public final void method3420(byte arg0, int arg1, class9 arg2, int arg3, int arg4) {
        ++field8531;
        int var6 = arg2.method51(-29868);
        int var7 = arg3 * this.method3422(var6, -129);
        this.method3423(arg2, true);
        OpenGL.glDrawElements(arg4, arg1, var6, (long) var7 + arg2.method52((byte) 123));
        if (arg0 >= -40) {
            this.field8648 = true;
        }
    }

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "(I)Lza;")
    public final class411 method568(int arg0) {
        ++field8476;
        class211 var2 = new class211(arg0);
        this.field8547.method1526(var2, 79);
        return var2;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I[Lbh;)V")
    public final void method575(int arg0, class36[] arg1) {
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field8690[var3] = arg1[var3];
        }
        ++field8456;
        this.field8593 = arg0;
        if (this.field8659 != 1) {
            this.method3435((byte) 59);
        }
    }

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "(B)V")
    private final void method3421(byte arg0) {
        if (arg0 >= 104) {
            ++field8436;
            if (this.field8607) {
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5888);
                this.field8607 = false;
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(II[I[I)Laa;")
    public final class484 method573(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field8378;
        return class681.method3845(this, arg2, arg0, arg3, arg1, 7);
    }

    @OriginalMember(owner = "client!oea", name = "i", descriptor = "(II)I")
    public final int method3422(int arg0, int arg1) {
        ++field8431;
        if (arg0 != 5121 && arg0 != 5120) {
            if (arg1 != -129) {
                return 124;
            } else if (arg0 != 5123 && arg0 != 5122) {
                if (~arg0 != -5126 && ~arg0 != -5125 && ~arg0 != -5127) {
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

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lff;Z)V")
    public final void method3423(class9 arg0, boolean arg1) {
        ++field8536;
        if (!arg1) {
            this.field8582 = false;
        }
        if (this.field8631 != arg0) {
            if (this.field8582) {
                OpenGL.glBindBufferARB(34963, arg0.method50(!arg1));
            }
            this.field8631 = arg0;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(FFF)V")
    public final void method606(float arg0, float arg1, float arg2) {
        class345.field4859 = arg1;
        class539.field7588 = arg2;
        ++field8391;
        class455.field6583 = arg0;
    }

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "(IIIIII)V")
    public final void method616(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8416;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        this.method3478(770);
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method3454(arg5, -126);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field8647) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field8647) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(FI)V")
    public final void method3424(float arg0, int arg1) {
        if (this.field8625 != arg0) {
            this.field8625 = arg0;
            if (this.field8659 == 3) {
                this.method3471(arg1 ^ -28245);
            }
        }
        ++field8478;
        if (arg1 != 3) {
            this.field8628 = -0.6249769F;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Liia;I)V")
    public final void method3425(class87 arg0, int arg1) {
        ++field8404;
        int var3 = 54 / ((18 - arg1) / 45);
        class87 var4 = this.field8608[this.field8657];
        if (arg0 != var4) {
            if (arg0 == null) {
                OpenGL.glDisable(var4.field1567);
            } else {
                if (var4 != null) {
                    if (~arg0.field1567 != ~var4.field1567) {
                        OpenGL.glDisable(var4.field1567);
                        OpenGL.glEnable(arg0.field1567);
                    }
                } else {
                    OpenGL.glEnable(arg0.field1567);
                }
                OpenGL.glBindTexture(arg0.field1567, arg0.method826(true));
            }
            this.field8608[this.field8657] = arg0;
        }
        this.field8575 &= -2;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class484 arg6, int arg7, int arg8) {
        ++field8341;
        class277 var10 = (class277) arg6;
        class189 var11 = var10.field3912;
        this.method3455(20);
        this.method3425(var10.field3912, 79);
        this.method3454(arg5, -34);
        this.method3485(7681, (byte) 105, 8448);
        this.method3464(0, 768, false, 34167);
        float var12 = var11.field2722 / (float) var11.field2720;
        float var13 = var11.field2719 / (float) var11.field2725;
        float var14 = (float) arg2 - (float) arg0;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var15 * var16;
        float var18 = var14 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (arg1 - arg8) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (arg2 - arg7) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var18 + 0.35F, (float) arg3 + var17 + 0.35F);
        OpenGL.glEnd();
        this.method3464(0, 768, false, 5890);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IB)V")
    public final synchronized void method3426(int arg0, byte arg1) {
        ++field8449;
        class626 var3 = new class626();
        int var4 = 83 % ((arg1 - 77) / 33);
        var3.field8991 = (long) arg0;
        this.field8568.method1526(var3, 87);
    }

    @OriginalMember(owner = "client!oea", name = "da", descriptor = "(III[I)V")
    public final void method537(int arg0, int arg1, int arg2, int[] arg3) {
        ++field8444;
        float var5 = (float) arg2 * this.field8576.field10107 + (float) arg0 * this.field8576.field10114 + (float) arg1 * this.field8576.field10120 + this.field8576.field10135;
        if (!((float) this.field8653 > var5) && !((float) this.field8661 < var5)) {
            int var6 = (int) (((float) arg2 * this.field8576.field10126 + (float) arg0 * this.field8576.field10116 + (float) arg1 * this.field8576.field10125 + this.field8576.field10133) * (float) this.field8679 / var5);
            int var7 = (int) (((float) arg2 * this.field8576.field10137 + (float) arg0 * this.field8576.field10131 + (float) arg1 * this.field8576.field10119 + this.field8576.field10128) * (float) this.field8605 / var5);
            if ((float) var6 >= this.field8666 && this.field8620 >= (float) var6 && this.field8597 <= (float) var7 && this.field8618 >= (float) var7) {
                arg3[0] = (int) ((float) var6 - this.field8666);
                arg3[1] = (int) ((float) var7 + -this.field8597);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "(B)V")
    public final void method3427(byte arg0) {
        ++field8402;
        if (~this.field8575 != -17) {
            this.method3473((byte) 90);
            this.method3414(true, -32);
            this.method3475(true, true);
            this.method3483(70, true);
            this.method3454(1, 105);
            this.field8575 = 16;
        }
        if (arg0 < 6) {
            this.field8528 = -81;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(BFF)V")
    public final void method3428(byte arg0, float arg1, float arg2) {
        this.field8632 = arg2;
        this.field8590 = arg1;
        ++field8363;
        if (arg0 < 114) {
            this.method584(-39, 24, -69, -14);
        }
        this.method3480(255);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Loo;I)V")
    public final void method643(class624 arg0, int arg1) {
        this.field8539.method2528(this, arg1, arg0, -14075);
        ++field8503;
    }

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "(B)V")
    private final void method3429(byte arg0) {
        class117.field1852[3] = 1.0F;
        class117.field1852[1] = this.field8663 * this.field8628;
        int var2 = 0 / ((arg0 - 5) / 46);
        ++field8518;
        class117.field1852[0] = this.field8637 * this.field8628;
        class117.field1852[2] = this.field8643 * this.field8628;
        OpenGL.glLightModelfv(2899, class117.field1852, 0);
    }

    @OriginalMember(owner = "client!oea", name = "L", descriptor = "(III)V")
    public final void method636(int arg0, int arg1, int arg2) {
        ++field8362;
        if (~this.field8581 != ~arg0 || ~this.field8671 != ~arg1 || ~this.field8621 != ~arg2) {
            this.field8621 = arg2;
            this.field8581 = arg0;
            this.field8671 = arg1;
            this.method3480(255);
            this.method3447(-1);
        }
    }

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "(B)V")
    public final void method3430(byte arg0) {
        ++field8448;
        if (arg0 < 81) {
            this.method621(43, -69, (int[][]) null, (int[][]) null, 122, 14, 14);
        }
        if (~this.field8575 != -5) {
            this.method3433(121);
            this.method3414(false, -32);
            this.method3463(false, (byte) 3);
            this.method3475(true, false);
            this.method3483(64, false);
            this.method3486((byte) 127, -2);
            this.method3454(1, -36);
            this.field8575 = 4;
        }
    }

    @OriginalMember(owner = "client!oea", name = "h", descriptor = "()Z")
    public final boolean method562() {
        ++field8410;
        return this.field8529 != null && this.field8529.method1360(-1);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIIII)V")
    public final void method626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8495;
        OpenGL.glLineWidth((float) arg5);
        this.method553(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(JB)V")
    public final synchronized void method3431(long arg0, byte arg1) {
        ++field8438;
        int var4 = -17 % ((61 - arg1) / 40);
        class626 var5 = new class626();
        var5.field8991 = arg0;
        this.field8569.method1526(var5, 127);
    }

    @OriginalMember(owner = "client!oea", name = "v", descriptor = "()Z")
    public final boolean method618() {
        ++field8460;
        if (this.field8529 != null) {
            if (!this.field8529.method1360(-1)) {
                if (!this.field8534.method3258((byte) 5, this.field8529)) {
                    return false;
                }
                this.field8533.method810(-3);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "(II)Lc;")
    public final class185 method644(int arg0, int arg1) {
        ++field8325;
        return null;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIIF)Lbh;")
    public final class36 method577(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field8513;
        return new class23(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oea", name = "m", descriptor = "(I)Lni;")
    public final class518 method3432(int arg0) {
        ++field8447;
        if (arg0 >= -108) {
            this.field8613 = false;
        }
        return this.field8686 != null ? this.field8686.method201((byte) 96) : null;
    }

    @OriginalMember(owner = "client!oea", name = "x", descriptor = "()Z")
    public final boolean method627() {
        ++field8427;
        return this.field8530.method1860(3, 108);
    }

    @OriginalMember(owner = "client!oea", name = "n", descriptor = "(I)V")
    private final void method3433(int arg0) {
        if (arg0 <= 113) {
            this.method3441(-84, 73);
        }
        ++field8350;
        if (~this.field8659 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field8526 > 0 && ~this.field8520 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field8526, (double) this.field8520, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field8575 &= -25;
            this.field8659 = 1;
        }
    }

    @OriginalMember(owner = "client!oea", name = "o", descriptor = "(I)V")
    private final void method3434(int arg0) {
        this.field8620 = (float) (-this.field8678 + this.field8619);
        this.field8597 = (float) (-this.field8583 + this.field8646);
        ++field8422;
        this.field8618 = (float) (-this.field8583 + this.field8680);
        if (arg0 == -2068671888) {
            this.field8666 = (float) (this.field8610 - this.field8678);
        }
    }

    @OriginalMember(owner = "client!oea", name = "i", descriptor = "()I")
    public final int method534() {
        ++field8389;
        return this.field8653;
    }

    @OriginalMember(owner = "client!oea", name = "p", descriptor = "()V")
    public final void method595() {
        ++field8342;
        if (this.field8529 != null && this.field8529.method1360(-1)) {
            this.field8534.method3254(this.field8529, -32);
            this.field8533.method810(-3);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIZ)Lkr;")
    public final class743 method581(int arg0, int arg1, boolean arg2) {
        ++field8338;
        return new class15(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!oea", name = "F", descriptor = "(II)V")
    public final void method580(int arg0, int arg1) {
        ++field8340;
    }

    @OriginalMember(owner = "client!oea", name = "P", descriptor = "(IIIII)V")
    public final void method541(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8336;
        this.method3478(770);
        this.method3454(arg4, -78);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!oea", name = "g", descriptor = "(B)V")
    private final void method3435(byte arg0) {
        if (arg0 < 48) {
            this.method602(47, 124, -110, 111, -8, -97);
        }
        ++field8358;
        int var2;
        for (var2 = 0; ~this.field8593 < ~var2; ++var2) {
            class36 var3 = this.field8690[var2];
            class67.field1206[0] = (float) var3.method290((byte) -104);
            int var4 = var2 + 16386;
            class67.field1206[1] = (float) var3.method298(false);
            class67.field1206[2] = (float) var3.method291(0);
            class67.field1206[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class67.field1206, 0);
            int var5 = var3.method292(6865);
            float var6 = var3.method296((byte) 3) / 255.0F;
            class67.field1206[1] = (float) (class555.method3246(65489, var5) >> 8) * var6;
            class67.field1206[0] = var6 * (float) class555.method3246(255, var5 >> 16);
            class67.field1206[2] = (float) class555.method3246(var5, 255) * var6;
            OpenGL.glLightfv(var4, 4609, class67.field1206, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method294(87) * var3.method294(30)));
            OpenGL.glEnable(var4);
        }
        while (~var2 > ~this.field8668) {
            OpenGL.glDisable(16386 - -var2);
            ++var2;
        }
        this.field8668 = this.field8593;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class484 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field8473;
        if (arg0 != arg2 || arg1 != arg3) {
            class277 var13 = (class277) arg6;
            class189 var14 = var13.field3912;
            this.method3455(-78);
            this.method3425(var13.field3912, 94);
            this.method3454(arg5, -94);
            this.method3485(7681, (byte) 125, 8448);
            this.method3464(0, 768, false, 34167);
            float var15 = var14.field2722 / (float) var14.field2720;
            float var16 = var14.field2719 / (float) var14.field2725;
            float var17 = (float) arg2 - (float) arg0;
            float var18 = (float) (-arg1) + (float) arg3;
            float var19 = (float) (1.0D / Math.sqrt((double) (var17 * var17 + var18 * var18)));
            int var20 = arg11 % (arg10 - -arg9);
            float var21 = var17 * var19;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var22 = var18 * var19;
            float var23 = (float) arg9 * var21;
            float var24 = (float) arg9 * var22;
            float var25 = 0.0F;
            float var26 = 0.0F;
            float var27 = var23;
            float var28 = var24;
            if (~arg9 > ~var20) {
                var26 = (float) (arg9 + arg10 - var20) * var22;
                var25 = (float) (arg9 + arg10 + -var20) * var21;
            } else {
                var28 = (float) (-var20 + arg9) * var22;
                var27 = (float) (-var20 + arg9) * var21;
            }
            float var29 = (float) arg0 + 0.35F + var25;
            float var30 = (float) arg1 + 0.35F + var26;
            float var31 = (float) arg10 * var21;
            float var32 = (float) arg10 * var22;
            while (true) {
                if (~arg0 <= ~arg2) {
                    if ((float) arg2 + 0.35F > var29) {
                        break;
                    }
                    if (var27 + var29 < (float) arg2) {
                        var27 = (float) arg2 - var29;
                    }
                } else {
                    if (var29 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var27 + var29 > (float) arg2) {
                        var27 = (float) arg2 - var29;
                    }
                }
                if (arg3 <= arg1) {
                    if (var30 < (float) arg3 + 0.35F) {
                        break;
                    }
                    if (var28 + var30 < (float) arg3) {
                        var28 = (float) arg3 - var30;
                    }
                } else {
                    if (var30 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if (var28 + var30 > (float) arg3) {
                        var28 = (float) arg3 - var30;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glTexCoord2f(((float) (-arg7) + var29) * var15, (var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var29, var30);
                OpenGL.glTexCoord2f((var27 + var29 + (float) (-arg7)) * var15, (var28 + var30 - (float) arg8) * var16);
                OpenGL.glVertex2f(var27 + var29, var28 + var30);
                OpenGL.glEnd();
                var30 += var28 + var32;
                var29 += var27 + var31;
                var27 = var23;
                var28 = var24;
            }
            this.method3464(0, 768, false, 5890);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIII)V")
    public final void method625(int arg0, int arg1, int arg2, int arg3) {
        this.field8534.method3251(arg3, arg1, arg2, true, arg0);
        ++field8394;
    }

    @OriginalMember(owner = "client!oea", name = "h", descriptor = "(B)V")
    private final void method3436(byte arg0) {
        OpenGL.glViewport(this.field8654, this.field8638, this.field8526, this.field8520);
        ++field8501;
        int var2 = 123 / ((36 - arg0) / 41);
    }

    @OriginalMember(owner = "client!oea", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method522(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field8368;
        boolean var7 = ~this.field8599 != ~arg0;
        if (var7 || this.field8641 != arg1 || this.field8592 != arg2) {
            this.field8599 = arg0;
            this.field8592 = arg2;
            this.field8641 = arg1;
            if (var7) {
                this.field8663 = (float) (65280 & this.field8599) / 65280.0F;
                this.field8637 = (float) (this.field8599 & 16711680) / 1.671168E7F;
                this.field8643 = (float) (255 & this.field8599) / 255.0F;
                this.method3429((byte) 87);
            }
            this.method3462(115);
        }
        if (this.field8595[0] != arg3 || this.field8595[1] != arg4 || this.field8595[2] != arg5) {
            this.field8595[2] = arg5;
            this.field8595[1] = arg4;
            this.field8595[0] = arg3;
            this.field8626[0] = -arg3;
            this.field8626[1] = -arg4;
            this.field8626[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field8604[0] = arg3 * var8;
            this.field8604[1] = arg4 * var8;
            this.field8604[2] = arg5 * var8;
            this.field8627[2] = -this.field8604[2];
            this.field8627[1] = -this.field8604[1];
            this.field8627[0] = -this.field8604[0];
            this.method3477(true);
            this.field8591 = (int) (arg5 * 256.0F / arg4);
            this.field8635 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "(Z)V")
    private final void method3437(boolean arg0) {
        OpenGL.glMatrixMode(5889);
        ++field8499;
        OpenGL.glLoadMatrixf(this.field8639, 0);
        OpenGL.glMatrixMode(5888);
        if (arg0) {
            this.field8628 = 0.6390078F;
        }
    }

    @OriginalMember(owner = "client!oea", name = "j", descriptor = "(I)V")
    public final void method608(int arg0) {
        ++field8369;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lsfa;Lsfa;FLsfa;)Lsfa;")
    public final class693 method571(class693 arg0, class693 arg1, float arg2, class693 arg3) {
        ++field8504;
        if (arg0 != null && arg1 != null && this.field8606 && this.field8624) {
            class178 var5 = null;
            class159 var6 = (class159) arg0;
            class159 var7 = (class159) arg1;
            class518 var8 = var6.method201((byte) 125);
            class518 var9 = var7.method201((byte) -47);
            if (var8 != null && var9 != null) {
                int var10 = ~var8.field7358 < ~var9.field7358 ? var8.field7358 : var9.field7358;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class178) {
                    class178 var11 = (class178) arg3;
                    if (var11.method1286(false) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class178(this, var10);
                }
                if (var5.method1287(false, arg2, var8, var9)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!oea", name = "p", descriptor = "(I)V")
    private final void method3438(int arg0) {
        ++field8469;
        int var2 = -114 / ((arg0 - -69) / 48);
        if (this.field8619 >= this.field8610 && ~this.field8646 >= ~this.field8680) {
            OpenGL.glScissor(this.field8654 - -this.field8610, -this.field8680 + this.field8638 - -this.field8520, -this.field8610 + this.field8619, this.field8680 - this.field8646);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!oea", name = "q", descriptor = "(I)V")
    public final void method3439(int arg0) {
        if (this.field8659 != arg0) {
            this.field8659 = 0;
            this.field8575 &= -32;
        }
        ++field8445;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lpw;I)V")
    public final void method3440(class703 arg0, int arg1) {
        ++field8512;
        if (~this.field8556 <= -1 && this.field8552[this.field8556] == arg0) {
            this.field8552[this.field8556--] = null;
            if (arg1 >= -24) {
                this.method645((Canvas) null, 100, 11);
            }
            arg0.method2568(5961);
            if (this.field8556 >= 0) {
                this.field8551 = this.field8552[this.field8556];
                this.field8551.method2570((byte) 30);
            } else {
                this.field8551 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oea", name = "j", descriptor = "()Z")
    public final boolean method563() {
        ++field8472;
        return true;
    }

    @OriginalMember(owner = "client!oea", name = "j", descriptor = "(II)I")
    public final int method3441(int arg0, int arg1) {
        ++field8349;
        if (~arg1 != -6407 && ~arg1 != -6410) {
            if (~arg1 != -6411 && arg1 != 34846 && ~arg1 != -34845) {
                if (~arg1 != -6408) {
                    if (~arg1 != -6409 && arg1 != 34847) {
                        if (arg1 == 34843) {
                            return 6;
                        } else if (arg1 == 34842) {
                            return 8;
                        } else if (arg1 == 6402) {
                            return 3;
                        } else if (arg1 == 6401) {
                            return 1;
                        } else {
                            int var3 = -66 % ((-64 - arg0) / 41);
                            throw new IllegalArgumentException("");
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

    @OriginalMember(owner = "client!oea", name = "w", descriptor = "()Z")
    public final boolean method622() {
        ++field8451;
        return false;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(BLpw;)V")
    public final void method3442(byte arg0, class703 arg1) {
        ++field8395;
        if (this.field8660) {
            this.method3440(arg1, -80);
            this.method3481(arg1, -1);
        } else {
            if (this.field8550 < 0 || this.field8559[this.field8550] != arg1) {
                throw new RuntimeException();
            }
            this.field8559[this.field8550--] = null;
            arg1.method2559(126);
            if (~this.field8550 > -1) {
                this.field8551 = this.field8553 = null;
            } else {
                this.field8551 = this.field8553 = this.field8559[this.field8550];
                this.field8551.method2550(-14943);
            }
        }
        if (arg0 > -58) {
            this.method3403((class635) null, -90);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(FFFFZ)V")
    public final void method3443(float arg0, float arg1, float arg2, float arg3, boolean arg4) {
        class117.field1852[1] = arg3;
        ++field8413;
        if (arg4) {
            this.field8654 = 51;
        }
        class117.field1852[3] = arg2;
        class117.field1852[0] = arg0;
        class117.field1852[2] = arg1;
        OpenGL.glTexEnvfv(8960, 8705, class117.field1852, 0);
    }

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "()Lkd;")
    public final class280 method558() {
        ++field8509;
        return new class724();
    }

    @OriginalMember(owner = "client!oea", name = "U", descriptor = "(IIIII)V")
    public final void method528(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8532;
        this.method3478(770);
        this.method3454(arg4, 110);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!oea", name = "HA", descriptor = "(IIII[I)V")
    public final void method631(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field8339;
        float var6 = (float) arg2 * this.field8576.field10107 + (float) arg0 * this.field8576.field10114 + (float) arg1 * this.field8576.field10120 + this.field8576.field10135;
        if (!(var6 < (float) this.field8653) && !((float) this.field8661 < var6)) {
            int var7 = (int) (((float) arg2 * this.field8576.field10126 + (float) arg0 * this.field8576.field10116 + (float) arg1 * this.field8576.field10125 + this.field8576.field10133) * (float) this.field8679 / (float) arg3);
            int var8 = (int) (((float) arg2 * this.field8576.field10137 + (float) arg0 * this.field8576.field10131 + (float) arg1 * this.field8576.field10119 + this.field8576.field10128) * (float) this.field8605 / (float) arg3);
            if (this.field8666 <= (float) var7 && this.field8620 >= (float) var7 && (float) var8 >= this.field8597 && this.field8618 >= (float) var8) {
                arg4[0] = (int) ((float) var7 - this.field8666);
                arg4[2] = (int) var6;
                arg4[1] = (int) ((float) var8 + -this.field8597);
            } else {
                arg4[0] = arg4[1] = arg4[2] = -1;
            }
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "()Lkd;")
    public final class280 method530() {
        ++field8356;
        return this.field8541;
    }

    @OriginalMember(owner = "client!oea", name = "r", descriptor = "(I)V")
    public final void method3444(int arg0) {
        ++field8492;
        OpenGL.glPushMatrix();
        if (arg0 != -25826) {
            this.field8529 = null;
        }
    }

    @OriginalMember(owner = "client!oea", name = "H", descriptor = "(III[I)V")
    public final void method592(int arg0, int arg1, int arg2, int[] arg3) {
        ++field8359;
        float var5 = (float) arg2 * this.field8576.field10107 + (float) arg0 * this.field8576.field10114 + (float) arg1 * this.field8576.field10120 + this.field8576.field10135;
        if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
        } else {
            int var6 = (int) (((float) arg2 * this.field8576.field10126 + (float) arg0 * this.field8576.field10116 + (float) arg1 * this.field8576.field10125 + this.field8576.field10133) * (float) this.field8679 / var5);
            arg3[0] = (int) ((float) var6 - this.field8666);
            int var7 = (int) (((float) arg2 * this.field8576.field10137 + (float) arg0 * this.field8576.field10131 + (float) arg1 * this.field8576.field10119 + this.field8576.field10128) * (float) this.field8605 / var5);
            arg3[2] = (int) var5;
            arg3[1] = (int) ((float) var7 + -this.field8597);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Laca;I)V")
    public final void method3445(class724 arg0, int arg1) {
        ++field8457;
        if (arg1 == 3553) {
            OpenGL.glPushMatrix();
            OpenGL.glMultMatrixf(arg0.method4026(5963), 0);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lc;Lvi;)Luaa;")
    public final class116 method544(class185 arg0, class536 arg1) {
        ++field8383;
        return null;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lpw;B)V")
    public final void method3446(class703 arg0, byte arg1) {
        ++field8425;
        if (arg1 <= 1) {
            this.field8625 = 0.42523926F;
        }
        if (this.field8660) {
            this.method3419(24178, arg0);
            this.method3405(arg0, false);
        } else if (~this.field8550 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field8550 <= -1) {
                this.field8559[this.field8550].method2559(112);
            }
            this.field8551 = this.field8553 = this.field8559[++this.field8550] = arg0;
            this.field8551.method2550(-14943);
        }
    }

    @OriginalMember(owner = "client!oea", name = "s", descriptor = "(I)V")
    private final void method3447(int arg0) {
        if (this.field8615 && ~this.field8671 <= -1) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
        if (arg0 == -1) {
            ++field8411;
        }
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method607(Canvas arg0) {
        ++field8390;
        if (this.field8380 == arg0) {
            throw new RuntimeException();
        } else if (this.field8483.containsKey(arg0)) {
            Long var2 = (Long) this.field8483.get(arg0);
            this.field8365.releaseSurface(arg0, var2);
            this.field8483.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "(Z)I")
    private final int method3448(boolean arg0) {
        ++field8355;
        int var2 = 0;
        this.field8681 = OpenGL.glGetString(7936).toLowerCase();
        this.field8612 = OpenGL.glGetString(7937).toLowerCase();
        if (~this.field8681.indexOf("microsoft") != 0) {
            var2 |= 1;
        }
        if (this.field8681.indexOf("brian paul") != -1 || this.field8681.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class327.method2091(' ', 26911, var3.replace('.', ' '));
        if (~var4.length <= -3) {
            try {
                int var5 = class547.method3226((byte) -1, var4[0]);
                int var6 = class547.method3226((byte) -88, var4[1]);
                this.field8669 = var5 * 10 - -var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (this.field8669 < 12) {
            var2 |= 2;
        }
        if (!this.field8365.method3599("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field8365.method3599("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field8622 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field8649 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field8675 = var7[0];
        if (~this.field8622 > -3 || ~this.field8649 > -3 || this.field8675 < 2) {
            var2 |= 16;
        }
        this.field8682 = Stream.method3762();
        this.field8630 = this.field8365.arePbuffersAvailable();
        this.field8582 = this.field8365.method3599("GL_ARB_vertex_buffer_object");
        if (!arg0) {
            return 84;
        } else {
            this.field8647 = this.field8365.method3599("GL_ARB_multisample");
            this.field8652 = this.field8365.method3599("GL_ARB_vertex_program");
            this.field8365.method3599("GL_ARB_fragment_program");
            this.field8613 = this.field8365.method3599("GL_ARB_vertex_shader");
            this.field8684 = this.field8365.method3599("GL_ARB_fragment_shader");
            this.field8601 = this.field8365.method3599("GL_EXT_texture3D");
            this.field8587 = this.field8365.method3599("GL_ARB_texture_rectangle");
            this.field8606 = this.field8365.method3599("GL_ARB_texture_cube_map");
            this.field8596 = this.field8365.method3599("GL_ARB_texture_float");
            this.field8644 = false;
            this.field8624 = this.field8365.method3599("GL_EXT_framebuffer_object");
            this.field8660 = this.field8365.method3599("GL_EXT_framebuffer_blit");
            this.field8645 = this.field8365.method3599("GL_EXT_framebuffer_multisample");
            this.field8673 = this.field8645 & this.field8660;
            OpenGL.glGetFloatv(2834, class117.field1852, 0);
            this.field8642 = class117.field1852[1];
            this.field8667 = class117.field1852[0];
            return ~var2 != -1 ? var2 : 0;
        }
    }

    @OriginalMember(owner = "client!oea", name = "t", descriptor = "(I)V")
    private final void method3449(int arg0) {
        ++field8343;
        float[] var2 = this.field8639;
        float var3 = (float) (-this.field8678 * this.field8653) / (float) this.field8679;
        float var4 = (float) ((-this.field8678 + this.field8526) * this.field8653) / (float) this.field8679;
        if (arg0 != -861579832) {
            this.method573(49, -108, (int[]) null, (int[]) null);
        }
        float var5 = (float) (this.field8653 * this.field8583) / (float) this.field8605;
        float var6 = (float) ((-this.field8520 + this.field8583) * this.field8653) / (float) this.field8605;
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field8653 * 2.0F;
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[4] = 0.0F;
            var2[10] = this.field8677 = (float) (-(this.field8661 + this.field8653)) / (float) (-this.field8653 + this.field8661);
            var2[0] = var7 / (-var3 + var4);
            var2[6] = 0.0F;
            var2[13] = 0.0F;
            var2[7] = 0.0F;
            var2[14] = this.field8676 = -((float) this.field8661 * var7) / (float) (-this.field8653 + this.field8661);
            var2[3] = 0.0F;
            var2[5] = var7 / (var5 - var6);
            var2[12] = 0.0F;
            var2[2] = 0.0F;
            var2[15] = 0.0F;
            var2[11] = -1.0F;
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[1] = 0.0F;
        } else {
            var2[4] = 0.0F;
            var2[11] = 0.0F;
            var2[9] = 0.0F;
            var2[0] = 1.0F;
            var2[7] = 0.0F;
            var2[12] = 0.0F;
            var2[2] = 0.0F;
            var2[6] = 0.0F;
            var2[15] = 1.0F;
            var2[1] = 0.0F;
            var2[8] = 0.0F;
            var2[10] = 1.0F;
            var2[3] = 0.0F;
            var2[13] = 0.0F;
            var2[5] = 1.0F;
            var2[14] = 0.0F;
        }
        this.method3476(arg0 ^ -861579834);
    }

    @OriginalMember(owner = "client!oea", name = "k", descriptor = "(II)I")
    public final int method3450(int arg0, int arg1) {
        if (arg0 <= 115) {
            return -9;
        } else {
            ++field8424;
            if (~arg1 == -2) {
                return 7681;
            } else if (~arg1 == -1) {
                return 8448;
            } else if (~arg1 == -3) {
                return 34165;
            } else if (arg1 != 3) {
                if (arg1 == 4) {
                    return 34023;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                return 260;
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IZI)V")
    public final void method3451(int arg0, boolean arg1, int arg2) {
        ++field8392;
        this.method3465(-91, arg1, true, arg0);
        if (arg2 != -29464) {
            this.method3487(true, true);
        }
    }

    @OriginalMember(owner = "client!oea", name = "EA", descriptor = "(IIII)V")
    public final void method596(int arg0, int arg1, int arg2, int arg3) {
        ++field8372;
        if (!this.field8656) {
            throw new RuntimeException("");
        } else {
            this.field8674 = arg1;
            this.field8665 = arg2;
            this.field8629 = arg3;
            this.field8585 = arg0;
            if (this.field8586) {
                this.field8530.field4047.method708((byte) -86);
                this.field8530.field4047.method701((byte) 1);
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "M", descriptor = "()I")
    public final int method598() {
        ++field8430;
        int var1 = this.field8694;
        this.field8694 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!oea", name = "i", descriptor = "(B)V")
    private final void method3452(byte arg0) {
        this.field8365.method3601();
        ++field8408;
        if (arg0 != -74) {
            this.method583(41, -32, -122, 27);
        }
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(IIII)V")
    public final void method3453(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 7482) {
            OpenGL.glTexEnvi(8960, arg2 + 34184, arg1);
            ++field8393;
            OpenGL.glTexEnvi(8960, arg2 + 34200, arg3);
        }
    }

    @OriginalMember(owner = "client!oea", name = "l", descriptor = "(II)V")
    public final void method3454(int arg0, int arg1) {
        ++field8535;
        int var3 = 48 / ((arg1 - 48) / 43);
        if (this.field8578 != arg0) {
            boolean var4;
            boolean var5;
            byte var6;
            if (arg0 == 1) {
                var4 = true;
                var5 = true;
                var6 = 1;
            } else if (~arg0 == -3) {
                var6 = 2;
                var5 = false;
                var4 = true;
            } else if (arg0 != 128) {
                var5 = false;
                var6 = 0;
                var4 = true;
            } else {
                var4 = true;
                var5 = true;
                var6 = 3;
            }
            if (!this.field8571 != !var4) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field8571 = var4;
            }
            if (!this.field8577 != !var5) {
                if (!var5) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field8577 = var5;
            }
            if (this.field8570 != var6) {
                if (var6 == 1) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (~var6 == -3) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                } else if (var6 == 3) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(774, 1);
                } else {
                    OpenGL.glDisable(3042);
                }
                this.field8570 = var6;
            }
            this.field8578 = arg0;
            this.field8575 &= -29;
        }
    }

    @OriginalMember(owner = "client!oea", name = "u", descriptor = "(I)V")
    public final void method3455(int arg0) {
        int var2 = -8 / ((-29 - arg0) / 40);
        ++field8442;
        if (this.field8575 != 2) {
            this.method3433(116);
            this.method3414(false, -32);
            this.method3463(false, (byte) 3);
            this.method3475(true, false);
            this.method3483(73, false);
            this.method3486((byte) 124, -2);
            this.field8575 = 2;
        }
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(II)V")
    public final void method554(int arg0, int arg1) throws class701 {
        try {
            this.field8365.swapBuffers();
        } catch (Exception var3) {
        }
        ++field8396;
    }

    @OriginalMember(owner = "client!oea", name = "v", descriptor = "(I)V")
    private final void method3456(int arg0) {
        this.method3486((byte) -42, -2);
        ++field8418;
        for (int var2 = this.field8622 - 1; ~var2 <= -1; --var2) {
            this.method3413(var2, 33984);
            this.method3425((class87) null, -90);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method3485(8448, (byte) 88, 8448);
        this.method3464(2, 770, false, 34168);
        this.method3421((byte) 119);
        this.field8578 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field8570 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field8577 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field8571 = true;
        this.method3414(true, arg0 + -16417);
        this.method3463(true, (byte) 3);
        this.method3475(true, true);
        this.method3483(47, true);
        this.method3439(arg0 ^ arg0);
        this.field8365.setSwapInterval(0);
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
        this.field8599 = this.field8581 = -1;
        this.method601();
    }

    @OriginalMember(owner = "client!oea", name = "j", descriptor = "(B)V")
    private final void method3457(byte arg0) {
        ++field8511;
        if (arg0 < 1) {
            this.method640(-115, 94, -66, 4, -111);
        }
        if (this.field8687 && !this.field8648) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method572(Canvas arg0, int arg1, int arg2) {
        ++field8352;
        long var4 = 0L;
        if (arg0 != null && this.field8380 != arg0) {
            if (this.field8483.containsKey(arg0)) {
                Long var6 = (Long) this.field8483.get(arg0);
                var4 = var6;
            }
        } else {
            var4 = this.field8379;
        }
        if (~var4 == -1L) {
            throw new RuntimeException();
        } else {
            this.field8365.surfaceResized(var4);
            if (this.field8500 == arg0) {
                this.method3484((byte) -108);
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "(Z)V")
    private final void method3458(boolean arg0) {
        ++field8465;
        OpenGL.glLoadIdentity();
        OpenGL.glMultMatrixf(this.field8579.method4026(5963), 0);
        if (this.field8586) {
            this.field8530.field4047.method708((byte) 104);
        }
        this.method3477(!arg0);
        this.method3435((byte) 60);
        if (arg0) {
            this.method526(-71, 91, -124, -56, 70, 109, (class484) null, -114, 17, -126, -67, 5);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(FFFI)V")
    private final void method3459(float arg0, float arg1, float arg2, int arg3) {
        ++field8370;
        OpenGL.glMatrixMode(5890);
        if (this.field8607) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg2, arg0, arg1);
        OpenGL.glMatrixMode(5888);
        if (arg3 > -86) {
            this.field8694 = -91;
        }
        this.field8607 = true;
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(III)V")
    public final synchronized void method3460(int arg0, int arg1, int arg2) {
        ++field8458;
        class528 var4 = new class528(arg2);
        if (arg0 != 512) {
            this.field8666 = 0.4529269F;
        }
        var4.field8991 = (long) arg1;
        this.field8567.method1526(var4, arg0 + -431);
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(BI)V")
    public final void method3461(byte arg0, int arg1) {
        class117.field1852[3] = (float) (arg1 >>> 24) / 255.0F;
        class117.field1852[1] = (float) class555.method3246(arg1, 65280) / 65280.0F;
        class117.field1852[2] = (float) class555.method3246(arg1, 255) / 255.0F;
        ++field8502;
        class117.field1852[0] = (float) class555.method3246(16711680, arg1) / 1.671168E7F;
        if (arg0 <= 76) {
            this.field8563 = 97;
        }
        OpenGL.glTexEnvfv(8960, 8705, class117.field1852, 0);
    }

    @OriginalMember(owner = "client!oea", name = "n", descriptor = "()Z")
    public final boolean method589() {
        ++field8421;
        return true;
    }

    @OriginalMember(owner = "client!oea", name = "w", descriptor = "(I)V")
    private final void method3462(int arg0) {
        class117.field1852[0] = this.field8641 * this.field8637;
        class117.field1852[2] = this.field8643 * this.field8641;
        class117.field1852[3] = 1.0F;
        class117.field1852[1] = this.field8663 * this.field8641;
        ++field8522;
        OpenGL.glLightfv(16384, 4609, class117.field1852, 0);
        class117.field1852[1] = -this.field8592 * this.field8663;
        class117.field1852[2] = -this.field8592 * this.field8643;
        if (arg0 <= 107) {
            this.method3417(126, -127);
        }
        class117.field1852[3] = 1.0F;
        class117.field1852[0] = -this.field8592 * this.field8637;
        OpenGL.glLightfv(16385, 4609, class117.field1852, 0);
    }

    @OriginalMember(owner = "client!oea", name = "la", descriptor = "()V")
    public final void method601() {
        this.field8619 = this.field8526;
        this.field8680 = this.field8520;
        ++field8409;
        this.field8646 = 0;
        this.field8610 = 0;
        OpenGL.glDisable(3089);
        this.method3434(-2068671888);
    }

    @OriginalMember(owner = "client!oea", name = "r", descriptor = "(IIIIIII)I")
    public final int method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8440;
        float var8 = (float) arg2 * this.field8576.field10107 + (float) arg0 * this.field8576.field10114 + (float) arg1 * this.field8576.field10120 + this.field8576.field10135;
        float var9 = (float) arg5 * this.field8576.field10107 + (float) arg3 * this.field8576.field10114 + (float) arg4 * this.field8576.field10120 + this.field8576.field10135;
        int var10 = 0;
        if (var8 < (float) this.field8653 && var9 < (float) this.field8653) {
            var10 |= 16;
        } else if ((float) this.field8661 < var8 && (float) this.field8661 < var9) {
            var10 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field8576.field10126 + (float) arg0 * this.field8576.field10116 + (float) arg1 * this.field8576.field10125 + this.field8576.field10133) * (float) this.field8679 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field8576.field10126 + (float) arg3 * this.field8576.field10116 + (float) arg4 * this.field8576.field10125 + this.field8576.field10133) * (float) this.field8679 / (float) arg6);
        if (this.field8666 > (float) var11 && this.field8666 > (float) var12) {
            var10 |= 1;
        } else if (this.field8620 < (float) var11 && this.field8620 < (float) var12) {
            var10 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field8576.field10137 + (float) arg0 * this.field8576.field10131 + (float) arg1 * this.field8576.field10119 + this.field8576.field10128) * (float) this.field8605 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field8576.field10137 + (float) arg3 * this.field8576.field10131 + (float) arg4 * this.field8576.field10119 + this.field8576.field10128) * (float) this.field8605 / (float) arg6);
        if ((float) var13 < this.field8597 && this.field8597 > (float) var14) {
            var10 |= 4;
        } else if (this.field8618 < (float) var13 && (float) var14 > this.field8618) {
            var10 |= 8;
        }
        return var10;
    }

    @OriginalMember(owner = "client!oea", name = "u", descriptor = "()I")
    public final int method615() {
        ++field8510;
        return 4;
    }

    @OriginalMember(owner = "client!oea", name = "na", descriptor = "(IIII)[I")
    public final int[] method574(int arg0, int arg1, int arg2, int arg3) {
        ++field8493;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, this.field8520 - arg1 - var6, arg2, 1, 32993, this.field8651, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!oea", name = "q", descriptor = "()Lsia;")
    public final class732 method599() {
        ++field8420;
        int var1 = -1;
        if (~this.field8681.indexOf("nvidia") != 0) {
            var1 = 4318;
        } else if (this.field8681.indexOf("intel") != -1) {
            var1 = 32902;
        } else if (~this.field8681.indexOf("ati") != 0) {
            var1 = 4098;
        }
        return new class732(var1, "OpenGL", this.field8669, this.field8612, 0L);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lfw;Z)Lkr;")
    public final class743 method637(class55 arg0, boolean arg1) {
        ++field8433;
        int[] var3 = new int[arg0.field1044 * arg0.field1038];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1040 == null) {
            for (int var6 = 0; var6 < arg0.field1038; ++var6) {
                for (int var7 = 0; ~arg0.field1044 < ~var7; ++var7) {
                    int var8 = arg0.field1039[arg0.field1041[var4++] & 255];
                    var3[var5++] = var8 != 0 ? class164.method1221(-16777216, var8) : 0;
                }
            }
        } else {
            for (int var9 = 0; ~var9 > ~arg0.field1038; ++var9) {
                for (int var11 = 0; ~arg0.field1044 < ~var11; ++var11) {
                    var3[var5++] = class164.method1221(arg0.field1039[class555.method3246(255, arg0.field1041[var4])], arg0.field1040[var4] << 24);
                    ++var4;
                }
            }
        }
        class743 var10 = this.method561(arg0.field1044, var3, 0, arg0.field1044, 41, arg0.field1038);
        var10.method87(arg0.field1042, arg0.field1036, arg0.field1037, arg0.field1043);
        return var10;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZB)V")
    public final void method3463(boolean arg0, byte arg1) {
        ++field8452;
        if (!this.field8687 != !arg0) {
            this.field8687 = arg0;
            this.method3457((byte) 18);
            this.field8575 &= -8;
        }
        if (arg1 != 3) {
            this.field8655 = null;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIZI)V")
    public final void method3464(int arg0, int arg1, boolean arg2, int arg3) {
        ++field8360;
        OpenGL.glTexEnvi(8960, arg0 + 34176, arg3);
        if (arg2) {
            this.method580(-71, -42);
        }
        OpenGL.glTexEnvi(8960, arg0 + 34192, arg1);
    }

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "(II)I")
    public final int method611(int arg0, int arg1) {
        ++field8346;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lsfa;)V")
    public final void method587(class693 arg0) {
        ++field8412;
        this.field8686 = (class159) arg0;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IZZI)V")
    public final void method3465(int arg0, boolean arg1, boolean arg2, int arg3) {
        ++field8439;
        if (~this.field8683 != ~arg3 || this.field8656 != this.field8586) {
            class192 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field8656 ? 0 : 3;
            if (~arg3 > -1) {
                this.method3421((byte) 124);
            } else {
                var5 = this.field8533.method814(127, arg3);
                class546 var10 = super.field1084.method1154(-105, arg3);
                if (var10.field7714 == 0 && ~var10.field7712 == -1) {
                    this.method3421((byte) 116);
                } else {
                    int var11 = !var10.field7706 ? 128 : 64;
                    int var12 = var11 * 50;
                    this.method3459((float) (this.field8544 % var12 * var10.field7712) / (float) var12, 0.0F, (float) (this.field8544 % var12 * var10.field7714) / (float) var12, -103);
                }
                if (!this.field8656) {
                    var9 = var10.field7711;
                    var7 = var10.field7694;
                    var8 = var10.field7697;
                }
                var6 = var10.field7695;
            }
            this.field8530.method1859(arg1, var9, arg2, (byte) 123, var8, var7);
            if (!this.field8530.method1862((byte) -118, var5, var6)) {
                this.method3425(var5, -108);
                this.method3417(var6, 0);
            }
            this.field8586 = this.field8656;
            this.field8683 = arg3;
        }
        this.field8575 &= -8;
        if (arg0 > -8) {
            this.method3470(53, 105, 88, 25);
        }
    }

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "(III)V")
    public final void method3466(int arg0, int arg1, int arg2) {
        this.field8654 = arg2;
        if (arg0 != 1) {
            this.method591(-6);
        }
        this.field8638 = arg1;
        ++field8482;
        this.method3436((byte) 116);
        this.method3438(arg0 ^ -125);
    }

    @OriginalMember(owner = "client!oea", name = "za", descriptor = "(IIIII)V")
    public final void method640(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8334;
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        if (~this.field8610 >= ~(arg0 - -arg2) && this.field8619 >= -arg2 + arg0 && arg1 + arg2 >= this.field8646 && this.field8680 >= -arg2 + arg1) {
            this.method3478(770);
            this.method3454(arg4, 3);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field8667) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if ((float) var8 <= this.field8642) {
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
                int var10 = class271.method1797(2864, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; var11 > 0; var11 -= var10) {
                    OpenGL.glVertex2f(class526.field7470[var11] * (float) arg2 + var6, class526.field7471[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "y", descriptor = "()Z")
    public final boolean method634() {
        ++field8406;
        return this.field8529 != null && (~this.field8538 >= -2 || this.field8673);
    }

    @OriginalMember(owner = "client!oea", name = "DA", descriptor = "(IIII)V")
    public final void method545(int arg0, int arg1, int arg2, int arg3) {
        this.field8583 = arg1;
        this.field8605 = arg3;
        this.field8678 = arg0;
        ++field8432;
        this.field8679 = arg2;
        this.method3449(-861579832);
        this.method3434(-2068671888);
        if (this.field8659 != 3) {
            if (~this.field8659 == -3) {
                this.method3437(false);
                return;
            }
        } else {
            this.method3471(-28248);
        }
    }

    @OriginalMember(owner = "client!oea", name = "k", descriptor = "(B)V")
    public static final void method3467(byte arg0) {
        class262.method1776(0, class755.field10512);
        ++field8537;
        ++class593.field8316;
        if (class394.field5523 && class34.field454) {
            int var1 = 112 % ((-34 - arg0) / 33);
            int var2 = 0;
            int var3 = 0;
            if (class200.field2876) {
                var2 = class228.method1570((byte) 73);
                var3 = class252.method1712((byte) 37);
            }
            int var4 = class422.field5917.method1597(123) - -var2;
            int var5 = var3 + class422.field5917.method1592(true);
            int var6 = var5 - class128.field1933;
            int var7 = var4 - class404.field5633;
            if (~class113.field1808 < ~var7) {
                var7 = class113.field1808;
            }
            if (class274.field3907 > var6) {
                var6 = class274.field3907;
            }
            if (var7 - -class755.field10512.field783 > class113.field1808 + class148.field2266.field783) {
                var7 = -class755.field10512.field783 + class113.field1808 + class148.field2266.field783;
            }
            if (~(class274.field3907 - -class148.field2266.field830) > ~(class755.field10512.field830 + var6)) {
                var6 = -class755.field10512.field830 + class148.field2266.field830 + class274.field3907;
            }
            int var8 = -class113.field1808 + var7 + class148.field2266.field790;
            int var9 = -class274.field3907 + class148.field2266.field869 + var6;
            if (class422.field5917.method1593(8)) {
                if (class593.field8316 > class755.field10512.field799) {
                    int var10 = -class704.field9862 + var7;
                    int var11 = -class178.field2561 + var6;
                    if (~class755.field10512.field846 > ~var10 || ~var10 > ~(-class755.field10512.field846) || ~var11 < ~class755.field10512.field846 || ~var11 > ~(-class755.field10512.field846)) {
                        class246.field3441 = true;
                    }
                }
                if (class755.field10512.field836 != null && class246.field3441) {
                    class604 var12 = new class604();
                    var12.field8772 = var8;
                    var12.field8782 = class755.field10512;
                    var12.field8773 = class755.field10512.field836;
                    var12.field8778 = var9;
                    class357.method2223(var12);
                    return;
                }
            } else {
                if (class246.field3441) {
                    class249.method1662((byte) 122);
                    if (class755.field10512.field852 != null) {
                        class604 var13 = new class604();
                        var13.field8778 = var9;
                        var13.field8773 = class755.field10512.field852;
                        var13.field8772 = var8;
                        var13.field8782 = class755.field10512;
                        var13.field8774 = class755.field10515;
                        class357.method2223(var13);
                    }
                    if (class755.field10515 != null && client.method1933(class755.field10512) != null) {
                        class470.method2854(-1439001556, class755.field10512, class755.field10515);
                    }
                } else if ((~class552.field7737 == -2 || class98.method878((byte) 53)) && ~class409.field5682 < -3) {
                    class256.method1740((byte) 84, class128.field1933 - -class178.field2561, class704.field9862 + class404.field5633);
                } else if (class547.method3227(-83)) {
                    class256.method1740((byte) 84, class178.field2561 + class128.field1933, class404.field5633 - -class704.field9862);
                }
                class755.field10512 = null;
            }
        } else {
            if (~class593.field8316 < -2) {
                class755.field10512 = null;
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "t", descriptor = "()Lkd;")
    public final class280 method612() {
        ++field8347;
        return this.field8576;
    }

    @OriginalMember(owner = "client!oea", name = "l", descriptor = "()V")
    public final void method567() {
        ++field8345;
        if (this.field8588 && ~this.field8526 < -1 && ~this.field8520 < -1) {
            int var1 = this.field8610;
            int var2 = this.field8619;
            int var3 = this.field8646;
            int var4 = this.field8680;
            this.method601();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method3439(0);
            this.method3414(false, -32);
            this.method3463(false, (byte) 3);
            this.method3475(true, false);
            this.method3483(54, false);
            this.method3425((class87) null, 69);
            this.method3486((byte) 126, -2);
            this.method3417(1, 0);
            this.method3454(0, -31);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field8526, this.field8520, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method584(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!oea", name = "x", descriptor = "(I)V")
    public static void method3468(int arg0) {
        field8479 = null;
        field8540 = null;
        field8505 = null;
        field8459 = null;
        if (arg0 == 260) {
            field8527 = null;
            field8486 = null;
        }
    }

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "(I)V")
    public final synchronized void method566(int arg0) {
        ++field8387;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field8564.method1528(65)) {
            class528 var12 = (class528) this.field8564.method1521(115);
            class336.field4749[var2++] = (int) var12.field8991;
            this.field8563 -= var12.field7502;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class336.field4749, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteBuffersARB(var2, class336.field4749, 0);
            var2 = 0;
        }
        while (!this.field8565.method1528(65)) {
            class528 var11 = (class528) this.field8565.method1521(113);
            class336.field4749[var2++] = (int) var11.field8991;
            this.field8561 -= var11.field7502;
            if (~var2 == -1001) {
                OpenGL.glDeleteTextures(var2, class336.field4749, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class336.field4749, 0);
            var2 = 0;
        }
        while (!this.field8566.method1528(65)) {
            class528 var10 = (class528) this.field8566.method1521(126);
            class336.field4749[var2++] = var10.field7502;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class336.field4749, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteFramebuffersEXT(var2, class336.field4749, 0);
            var2 = 0;
        }
        while (!this.field8567.method1528(65)) {
            class528 var9 = (class528) this.field8567.method1521(112);
            class336.field4749[var2++] = (int) var9.field8991;
            this.field8562 -= var9.field7502;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class336.field4749, 0);
                var2 = 0;
            }
        }
        if (var2 > 0) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class336.field4749, 0);
            boolean var4 = false;
        }
        while (!this.field8560.method1528(65)) {
            class528 var8 = (class528) this.field8560.method1521(112);
            OpenGL.glDeleteLists((int) var8.field8991, var8.field7502);
        }
        while (!this.field8568.method1528(65)) {
            class626 var7 = this.field8568.method1521(126);
            OpenGL.glDeleteProgramARB((int) var7.field8991);
        }
        while (!this.field8569.method1528(65)) {
            class626 var6 = this.field8569.method1521(110);
            OpenGL.glDeleteObjectARB(var6.field8991);
        }
        while (!this.field8560.method1528(65)) {
            class528 var5 = (class528) this.field8560.method1521(123);
            OpenGL.glDeleteLists((int) var5.field8991, var5.field7502);
        }
        this.field8533.method811(-28153);
        if (~this.method641() < -100663297 && this.field8574 + 60000L < class742.method4128(1)) {
            System.gc();
            this.field8574 = class742.method4128(1);
        }
        this.field8544 = var3;
    }

    @OriginalMember(owner = "client!oea", name = "y", descriptor = "(I)V")
    private final void method3469(int arg0) {
        this.field8608 = new class87[this.field8622];
        ++field8454;
        this.field8603 = new class192(this, 3553, 6408, 1, 1);
        new class192(this, 3553, 6408, 1, 1);
        new class192(this, 3553, 6408, 1, 1);
        this.field8609 = new class74(this);
        this.field8685 = new class74(this);
        this.field8617 = new class74(this);
        this.field8655 = new class74(this);
        this.field8662 = new class74(this);
        this.field8689 = new class74(this);
        this.field8664 = new class74(this);
        this.field8584 = new class74(this);
        this.field8636 = new class74(this);
        this.field8670 = new class74(this);
        if (this.field8624) {
            this.field8672 = new class419(this);
            new class419(this);
        }
        if (arg0 > -5) {
            this.field8554 = null;
        }
    }

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "(IIII)V")
    public final void method3470(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 8) {
            ++field8508;
            OpenGL.glDrawArrays(arg0, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "()Z")
    public final boolean method550() {
        ++field8453;
        return true;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lww;IIII)Lka;")
    public final class469 method646(class729 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8463;
        return new class74(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "()V")
    public final void method536() {
        ++field8455;
        if (!this.field8624) {
            if (!this.field8630) {
                throw new RuntimeException("");
            }
            this.field8554.method88(0, 0, this.field8526, this.field8520, 0, 0);
            this.field8365.setSurface(this.field8466);
        } else {
            if (this.field8553 != this.field8555) {
                throw new RuntimeException();
            }
            this.field8555.method2555(0, (byte) 82);
            this.field8555.method2555(8, (byte) 118);
            this.method3442((byte) -88, this.field8555);
        }
        this.field8554 = null;
        this.field8526 = this.field8470;
        this.field8520 = this.field8514;
        this.method3439(0);
        this.method3436((byte) -50);
        this.method601();
    }

    @OriginalMember(owner = "client!oea", name = "z", descriptor = "(I)V")
    private final void method3471(int arg0) {
        if (arg0 != -28248) {
            this.field8593 = 110;
        }
        ++field8494;
        float var2 = (float) (-this.field8678) * this.field8625 / (float) this.field8679;
        float var3 = (float) (-this.field8583) * this.field8625 / (float) this.field8605;
        float var4 = (float) (-this.field8678 + this.field8526) * this.field8625 / (float) this.field8679;
        float var5 = (float) (-this.field8583 + this.field8520) * this.field8625 / (float) this.field8605;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var4 && var3 != var5) {
            OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) this.field8653, (double) this.field8661);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!oea", name = "l", descriptor = "(B)V")
    private final void method3472(byte arg0) {
        ++field8489;
        if (this.field8659 != 2) {
            this.field8659 = 2;
            this.method3437(false);
            this.method3458(false);
            this.field8575 &= -8;
        }
        int var2 = 116 / (arg0 / 54);
    }

    @OriginalMember(owner = "client!oea", name = "o", descriptor = "()V")
    public final void method590() {
        OpenGL.glFinish();
        ++field8333;
    }

    @OriginalMember(owner = "client!oea", name = "m", descriptor = "(B)V")
    private final void method3473(byte arg0) {
        int var2 = 97 % ((arg0 - 43) / 38);
        ++field8471;
        if (~this.field8659 != -4) {
            this.field8659 = 3;
            this.method3471(-28248);
            this.method3458(false);
            this.field8575 &= -8;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Luaa;)V")
    public final void method610(class116 arg0) {
        ++field8397;
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method645(Canvas arg0, int arg1, int arg2) {
        ++field8516;
        if (this.field8380 == arg0) {
            throw new RuntimeException();
        } else if (!this.field8483.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var8) {
                }
                long var6 = this.field8365.prepareSurface(arg0);
                if (var6 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field8483.put(arg0, new Long(var6));
                }
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "A", descriptor = "(I)V")
    private final void method3474(int arg0) {
        if (arg0 <= 93) {
            this.method593((class624) null);
        }
        ++field8385;
        int var2 = 0;
        while (!this.field8365.method3600()) {
            if (~(var2++) < -6) {
                throw new RuntimeException("");
            }
            class246.method1639(1000L, (byte) -88);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZZ)V")
    public final void method3475(boolean arg0, boolean arg1) {
        if (!this.field8572 != !arg1) {
            if (arg1) {
                OpenGL.glEnable(2929);
            } else {
                OpenGL.glDisable(2929);
            }
            this.field8572 = arg1;
            this.field8575 &= -32;
        }
        if (!arg0) {
            this.field8664 = null;
        }
        ++field8525;
    }

    @OriginalMember(owner = "client!oea", name = "B", descriptor = "(I)V")
    private final void method3476(int arg0) {
        this.field8639[arg0] = this.field8676;
        ++field8330;
        this.field8639[10] = this.field8677;
        this.field8623 = (float) this.field8661;
        this.field8611 = (this.field8639[14] - (float) this.field8661) / this.field8639[10];
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(Z)V")
    public final void method564(boolean arg0) {
        ++field8367;
    }

    @OriginalMember(owner = "client!oea", name = "s", descriptor = "()Z")
    public final boolean method605() {
        ++field8507;
        return true;
    }

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "(Z)V")
    public final void method3477(boolean arg0) {
        OpenGL.glLightfv(16384, 4611, this.field8604, 0);
        ++field8403;
        if (!arg0) {
            this.method3478(85);
        }
        OpenGL.glLightfv(16385, 4611, this.field8627, 0);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(II)Lvi;")
    public final class536 method551(int arg0, int arg1) {
        ++field8414;
        return null;
    }

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "(IIIIII)Lsfa;")
    public final class693 method609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8419;
        return !this.field8606 ? null : new class28(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!oea", name = "pa", descriptor = "()V")
    public final void method613() {
        this.field8656 = false;
        ++field8415;
    }

    @OriginalMember(owner = "client!oea", name = "C", descriptor = "(I)V")
    private final void method3478(int arg0) {
        if (this.field8575 != 1) {
            this.method3433(122);
            this.method3414(false, -32);
            this.method3463(false, (byte) 3);
            this.method3475(true, false);
            this.method3483(66, false);
            this.method3425((class87) null, 73);
            this.method3486((byte) 123, -2);
            this.method3417(1, 0);
            this.field8575 = 1;
        }
        if (arg0 == 770) {
            ++field8497;
        }
    }

    @OriginalMember(owner = "client!oea", name = "JA", descriptor = "(IIIIII)I")
    public final int method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8377;
        int var7 = 0;
        float var8 = (float) arg2 * this.field8576.field10107 + (float) arg0 * this.field8576.field10114 + (float) arg1 * this.field8576.field10120 + this.field8576.field10135;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field8576.field10107 + (float) arg3 * this.field8576.field10114 + (float) arg4 * this.field8576.field10120 + this.field8576.field10135;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if (var8 < (float) this.field8653 && (float) this.field8653 > var9) {
            var7 |= 16;
        } else if ((float) this.field8661 < var8 && (float) this.field8661 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field8576.field10126 + (float) arg0 * this.field8576.field10116 + (float) arg1 * this.field8576.field10125 + this.field8576.field10133) * (float) this.field8679 / var8);
        int var11 = (int) (((float) arg5 * this.field8576.field10126 + (float) arg3 * this.field8576.field10116 + (float) arg4 * this.field8576.field10125 + this.field8576.field10133) * (float) this.field8679 / var9);
        if ((float) var10 < this.field8666 && (float) var11 < this.field8666) {
            var7 |= 1;
        } else if (this.field8620 < (float) var10 && this.field8620 < (float) var11) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field8576.field10137 + (float) arg0 * this.field8576.field10131 + (float) arg1 * this.field8576.field10119 + this.field8576.field10128) * (float) this.field8605 / var8);
        int var13 = (int) (((float) arg5 * this.field8576.field10137 + (float) arg3 * this.field8576.field10131 + (float) arg4 * this.field8576.field10119 + this.field8576.field10128) * (float) this.field8605 / var9);
        if ((float) var12 < this.field8597 && this.field8597 > (float) var13) {
            var7 |= 4;
        } else if ((float) var12 > this.field8618 && this.field8618 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!oea", name = "n", descriptor = "(B)V")
    private final void method3479(byte arg0) {
        ++field8437;
        OpenGL.glDepthMask(this.field8573 && this.field8650);
        if (arg0 != 49) {
            this.method3457((byte) -115);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lkd;)V")
    public final void method538(class280 arg0) {
        this.field8576.method160(arg0);
        ++field8464;
        this.field8579.method160(this.field8576);
        this.field8579.method4028(115);
        this.field8580.method4024(0, this.field8579);
        if (~this.field8659 != -2) {
            this.method3458(false);
        }
    }

    @OriginalMember(owner = "client!oea", name = "D", descriptor = "(I)V")
    private final void method3480(int arg0) {
        ++field8488;
        this.field8602 = (float) (-this.field8621 + this.field8661) + -this.field8590;
        this.field8594 = this.field8602 - (float) this.field8671 * this.field8632;
        if (this.field8594 < (float) this.field8653) {
            this.field8594 = (float) this.field8653;
        }
        OpenGL.glFogf(2915, this.field8594);
        OpenGL.glFogf(2916, this.field8602);
        class117.field1852[2] = (float) class555.method3246(arg0, this.field8581) / 255.0F;
        class117.field1852[1] = (float) class555.method3246(65280, this.field8581) / 65280.0F;
        class117.field1852[0] = (float) class555.method3246(16711680, this.field8581) / 1.671168E7F;
        OpenGL.glFogfv(2918, class117.field1852, 0);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class278 method621(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field8361;
        return new class315(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lfp;[Lfw;Z)Lda;")
    public final class59 method632(class323 arg0, class55[] arg1, boolean arg2) {
        ++field8401;
        return new class600(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(Lpw;I)V")
    public final void method3481(class703 arg0, int arg1) {
        ++field8354;
        if (arg1 >= ~this.field8558 && this.field8557[this.field8558] == arg0) {
            this.field8557[this.field8558--] = null;
            arg0.method2566((byte) 66);
            if (this.field8558 >= 0) {
                this.field8553 = this.field8557[this.field8558];
                this.field8553.method2558(arg1 + 26755);
            } else {
                this.field8553 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method647(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field8337;
        if (~arg0 != ~arg2 || ~arg1 != ~arg3) {
            this.method3478(770);
            this.method3454(arg5, 125);
            float var10 = (float) (-arg0) + (float) arg2;
            float var11 = (float) arg3 - (float) arg1;
            float var12 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            float var13 = var11 * var12;
            OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
            float var14 = var10 * var12;
            int var15 = arg8 % (arg6 + arg7);
            float var16 = (float) arg6 * var14;
            float var17 = (float) arg6 * var13;
            float var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = var16;
            float var21 = var17;
            if (~var15 >= ~arg6) {
                var20 = (float) (-var15 + arg6) * var14;
                var21 = (float) (-var15 + arg6) * var13;
            } else {
                var18 = (float) (arg6 - -arg7 + -var15) * var14;
                var19 = (float) (-var15 + arg7 + arg6) * var13;
            }
            float var22 = (float) arg0 + 0.35F + var18;
            float var23 = (float) arg1 + 0.35F + var19;
            float var24 = (float) arg7 * var14;
            float var25 = (float) arg7 * var13;
            while (true) {
                if (~arg0 <= ~arg2) {
                    if (var22 < (float) arg2 + 0.35F) {
                        break;
                    }
                    if (var20 + var22 < (float) arg2) {
                        var20 = (float) arg2 + -var22;
                    }
                } else {
                    if (var22 > (float) arg2 + 0.35F) {
                        break;
                    }
                    if ((float) arg2 < var20 + var22) {
                        var20 = (float) arg2 + -var22;
                    }
                }
                if (arg1 < arg3) {
                    if (var23 > (float) arg3 + 0.35F) {
                        break;
                    }
                    if (var21 + var23 > (float) arg3) {
                        var21 = (float) arg3 - var23;
                    }
                } else {
                    if (var23 < (float) arg3 + 0.35F) {
                        break;
                    }
                    if ((float) arg3 > var21 + var23) {
                        var21 = (float) arg3 + -var23;
                    }
                }
                OpenGL.glBegin(1);
                OpenGL.glVertex2f(var22, var23);
                OpenGL.glVertex2f(var20 + var22, var21 + var23);
                var22 += var20 + var24;
                var23 += var21 + var25;
                OpenGL.glEnd();
                var21 = var17;
                var20 = var16;
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "(I)V")
    public final void method559(int arg0) {
        ++field8524;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            this.field8528 = arg0;
            this.field8533.method810(-3);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Ljaclib/memory/Buffer;ZIIB)Ltda;")
    public final class635 method3482(Buffer arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        ++field8426;
        if (!this.field8582 || arg1 && !this.field8640) {
            if (arg4 != 42) {
                this.field8553 = null;
            }
            return new class341(this, arg3, arg0);
        } else {
            return new class516(this, arg3, arg0, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IZ)V")
    public final void method3483(int arg0, boolean arg1) {
        if (arg0 <= 45) {
            this.field8592 = -1.4993085F;
        }
        ++field8446;
        if (arg1 == !this.field8573) {
            this.field8573 = arg1;
            this.method3479((byte) 49);
            this.field8575 &= -32;
        }
    }

    @OriginalMember(owner = "client!oea", name = "X", descriptor = "(I)V")
    public final void method604(int arg0) {
        ++field8364;
        this.field8545 = 0;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field8545;
        }
        this.field8546 = 1 << this.field8545;
    }

    @OriginalMember(owner = "client!oea", name = "aa", descriptor = "(IIIIII)V")
    public final void method630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8399;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        float var10 = (float) arg3 + var8;
        this.method3478(770);
        this.method3454(arg5, -87);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field8647) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field8647) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "()Z")
    public final boolean method560() {
        ++field8462;
        return true;
    }

    @OriginalMember(owner = "client!oea", name = "o", descriptor = "(B)V")
    private final void method3484(byte arg0) {
        ++field8515;
        if (this.field8500 != null) {
            Dimension var2 = this.field8500.getSize();
            this.field8514 = var2.height;
            this.field8470 = var2.width;
        } else {
            this.field8470 = this.field8514 = 0;
        }
        if (this.field8553 == null) {
            this.field8520 = this.field8514;
            this.field8526 = this.field8470;
            this.method3436((byte) -11);
        }
        this.method3439(0);
        if (arg0 < -65) {
            this.method601();
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IBI)V")
    public final void method3485(int arg0, byte arg1, int arg2) {
        if (arg1 >= 37) {
            if (this.field8657 != 0) {
                OpenGL.glTexEnvi(8960, 34161, arg0);
                OpenGL.glTexEnvi(8960, 34162, arg2);
            } else {
                boolean var4 = false;
                if (~this.field8634 != ~arg0) {
                    OpenGL.glTexEnvi(8960, 34161, arg0);
                    this.field8634 = arg0;
                    var4 = true;
                }
                if (~this.field8614 != ~arg2) {
                    OpenGL.glTexEnvi(8960, 34162, arg2);
                    this.field8614 = arg2;
                    var4 = true;
                }
                if (var4) {
                    this.field8575 &= -30;
                }
            }
            ++field8400;
        }
    }

    @OriginalMember(owner = "client!oea", name = "I", descriptor = "()I")
    public final int method594() {
        ++field8386;
        int var1 = this.field8696;
        this.field8696 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V")
    public final void method527(int arg0) {
        this.method3474(104);
        ++field8441;
    }

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "(BI)V")
    public final void method3486(byte arg0, int arg1) {
        ++field8517;
        int var3 = 121 / ((75 - arg0) / 47);
        this.method3451(arg1, true, -29464);
    }

    @OriginalMember(owner = "client!oea", name = "XA", descriptor = "()I")
    public final int method531() {
        ++field8487;
        return this.field8661;
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(ZZ)V")
    public final void method3487(boolean arg0, boolean arg1) {
        if (arg0) {
            this.field8611 = 0.47139847F;
        }
        if (!arg1 != !this.field8648) {
            this.field8648 = arg1;
            this.method3457((byte) 17);
        }
        ++field8485;
    }

    @OriginalMember(owner = "client!oea", name = "KA", descriptor = "(IIII)V")
    public final void method584(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field8520 > ~arg3) {
            arg3 = this.field8520;
        }
        if (~this.field8526 > ~arg2) {
            arg2 = this.field8526;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (~arg1 > -1) {
            arg1 = 0;
        }
        ++field8329;
        this.field8610 = arg0;
        this.field8646 = arg1;
        this.field8619 = arg2;
        this.field8680 = arg3;
        OpenGL.glEnable(3089);
        this.method3434(-2068671888);
        this.method3438(-122);
    }

    @OriginalMember(owner = "client!oea", name = "i", descriptor = "(I)V")
    public final void method591(int arg0) {
        ++field8484;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!oea", name = "m", descriptor = "()Z")
    public final boolean method579() {
        ++field8382;
        return false;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public final void method628(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class701 {
        this.method554(arg2, arg3);
        ++field8327;
    }
}
