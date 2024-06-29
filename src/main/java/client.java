import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sign.signlink;

@OriginalClass("client!client")
public class client extends class2 {

    @OriginalMember(owner = "client!client", name = "K", descriptor = "Z")
    private boolean field78 = false;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "[Ljava/lang/String;")
    private String[] field79 = new String[500];

    @OriginalMember(owner = "client!client", name = "M", descriptor = "Ljava/lang/String;")
    private String field80 = "";

    @OriginalMember(owner = "client!client", name = "O", descriptor = "Z")
    private boolean field82 = false;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "[Ljava/lang/String;")
    private String[] field84 = new String[200];

    @OriginalMember(owner = "client!client", name = "R", descriptor = "Z")
    private boolean field85 = true;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "[I")
    private int[] field86 = new int[2000];

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "[LQEHNWGKD;")
    private class48[] field93 = new class48[1000];

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Z")
    private volatile boolean field94 = false;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
    private int[] field96 = new int[5];

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Z")
    private boolean field97 = false;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Z")
    private boolean field98 = false;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
    private boolean field105 = false;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "[I")
    private int[] field108 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "B")
    private byte field109 = -48;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "[LQEHNWGKD;")
    private class48[] field110 = new class48[8];

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    private int field113 = 2;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "LIJOSTBQT;")
    private class25 field117 = new class25();

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "[[[LWOVRPCGT;")
    private class61[][][] field118 = new class61[4][104][104];

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "[LBVXAXAEI;")
    private class4[] field127 = new class4[13];

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "Ljava/lang/String;")
    private String field128 = "";

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "B")
    private byte field130 = 114;

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "Z")
    private boolean field131 = true;

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "Z")
    private boolean field133 = true;

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
    private int field134 = -430;

    @OriginalMember(owner = "client!client", name = "Wb", descriptor = "B")
    private byte field142 = -60;

    @OriginalMember(owner = "client!client", name = "Xb", descriptor = "Z")
    private boolean field143 = false;

    @OriginalMember(owner = "client!client", name = "Yb", descriptor = "[LBVXAXAEI;")
    private class4[] field144 = new class4[100];

    @OriginalMember(owner = "client!client", name = "bc", descriptor = "[J")
    private long[] field147 = new long[200];

    @OriginalMember(owner = "client!client", name = "cc", descriptor = "[LQEHNWGKD;")
    private class48[] field148 = new class48[32];

    @OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
    private int field149 = 969;

    @OriginalMember(owner = "client!client", name = "ec", descriptor = "Z")
    private boolean field150 = false;

    @OriginalMember(owner = "client!client", name = "gc", descriptor = "[I")
    private int[] field152 = new int[100];

    @OriginalMember(owner = "client!client", name = "hc", descriptor = "[Ljava/lang/String;")
    private String[] field153 = new String[100];

    @OriginalMember(owner = "client!client", name = "ic", descriptor = "[Ljava/lang/String;")
    private String[] field154 = new String[100];

    @OriginalMember(owner = "client!client", name = "jc", descriptor = "LWOVRPCGT;")
    private class61 field155 = new class61(-270);

    @OriginalMember(owner = "client!client", name = "lc", descriptor = "[I")
    private int[] field157 = new int[5];

    @OriginalMember(owner = "client!client", name = "pc", descriptor = "[I")
    private int[] field161 = new int[class72.field1753];

    @OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
    private int field162 = 10685;

    @OriginalMember(owner = "client!client", name = "rc", descriptor = "[I")
    private int[] field163 = new int[7];

    @OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
    private int field165 = 50;

    @OriginalMember(owner = "client!client", name = "uc", descriptor = "[I")
    private int[] field166 = new int[this.field165];

    @OriginalMember(owner = "client!client", name = "vc", descriptor = "[I")
    private int[] field167 = new int[this.field165];

    @OriginalMember(owner = "client!client", name = "wc", descriptor = "[I")
    private int[] field168 = new int[this.field165];

    @OriginalMember(owner = "client!client", name = "xc", descriptor = "[I")
    private int[] field169 = new int[this.field165];

    @OriginalMember(owner = "client!client", name = "yc", descriptor = "[I")
    private int[] field170 = new int[this.field165];

    @OriginalMember(owner = "client!client", name = "zc", descriptor = "[I")
    private int[] field171 = new int[this.field165];

    @OriginalMember(owner = "client!client", name = "Ac", descriptor = "[I")
    private int[] field172 = new int[this.field165];

    @OriginalMember(owner = "client!client", name = "Bc", descriptor = "[Ljava/lang/String;")
    private String[] field173 = new String[this.field165];

    @OriginalMember(owner = "client!client", name = "Cc", descriptor = "Z")
    private boolean field174 = false;

    @OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
    private int field175 = 186;

    @OriginalMember(owner = "client!client", name = "Kc", descriptor = "[I")
    private int[] field182 = new int[5];

    @OriginalMember(owner = "client!client", name = "Mc", descriptor = "I")
    private int field184 = 5063219;

    @OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
    private int field186 = -582;

    @OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
    private int field187 = 2301979;

    @OriginalMember(owner = "client!client", name = "Tc", descriptor = "[I")
    private int[] field191 = new int[151];

    @OriginalMember(owner = "client!client", name = "Uc", descriptor = "[I")
    private int[] field192 = new int[5];

    @OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
    private int field200 = 2;

    @OriginalMember(owner = "client!client", name = "od", descriptor = "I")
    private int field212 = -926;

    @OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
    private int field213 = 21302;

    @OriginalMember(owner = "client!client", name = "xd", descriptor = "I")
    private int field221 = 7759444;

    @OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
    private final int[] field222 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!client", name = "zd", descriptor = "I")
    private int field223 = 78;

    @OriginalMember(owner = "client!client", name = "Ad", descriptor = "I")
    private int field224 = 1;

    @OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
    private int field229 = -1;

    @OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
    private int field230 = -1;

    @OriginalMember(owner = "client!client", name = "Id", descriptor = "[I")
    private int[] field232 = new int[151];

    @OriginalMember(owner = "client!client", name = "Nd", descriptor = "LMNKDCXXG;")
    private class37 field237 = class37.method374((byte) 4, 1);

    @OriginalMember(owner = "client!client", name = "Od", descriptor = "Z")
    private boolean field238 = false;

    @OriginalMember(owner = "client!client", name = "Pd", descriptor = "I")
    private int field239 = -1;

    @OriginalMember(owner = "client!client", name = "Qd", descriptor = "I")
    private int field240 = 3353893;

    @OriginalMember(owner = "client!client", name = "Rd", descriptor = "[LQEHNWGKD;")
    private class48[] field241 = new class48[100];

    @OriginalMember(owner = "client!client", name = "Sd", descriptor = "Z")
    private boolean field242 = false;

    @OriginalMember(owner = "client!client", name = "Td", descriptor = "I")
    private int field243 = 503;

    @OriginalMember(owner = "client!client", name = "Wd", descriptor = "[LQEHNWGKD;")
    private class48[] field246 = new class48[20];

    @OriginalMember(owner = "client!client", name = "de", descriptor = "I")
    private int field253 = -494;

    @OriginalMember(owner = "client!client", name = "fe", descriptor = "[I")
    private int[] field255 = new int[500];

    @OriginalMember(owner = "client!client", name = "ge", descriptor = "[I")
    private int[] field256 = new int[500];

    @OriginalMember(owner = "client!client", name = "he", descriptor = "[I")
    private int[] field257 = new int[500];

    @OriginalMember(owner = "client!client", name = "ie", descriptor = "[I")
    private int[] field258 = new int[500];

    @OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
    private int field260 = 40071;

    @OriginalMember(owner = "client!client", name = "le", descriptor = "[[I")
    private int[][] field261 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "pe", descriptor = "Ljava/lang/String;")
    private String field265 = "";

    @OriginalMember(owner = "client!client", name = "qe", descriptor = "Ljava/lang/String;")
    private String field266 = "";

    @OriginalMember(owner = "client!client", name = "re", descriptor = "B")
    private byte field267 = 5;

    @OriginalMember(owner = "client!client", name = "se", descriptor = "Z")
    private boolean field268 = false;

    @OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
    private int field270 = 3;

    @OriginalMember(owner = "client!client", name = "Ae", descriptor = "Z")
    private boolean field276 = true;

    @OriginalMember(owner = "client!client", name = "Ce", descriptor = "[I")
    private int[] field278 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!client", name = "Je", descriptor = "[LQEHNWGKD;")
    private class48[] field285 = new class48[32];

    @OriginalMember(owner = "client!client", name = "Ke", descriptor = "Z")
    private boolean field286 = false;

    @OriginalMember(owner = "client!client", name = "Oe", descriptor = "I")
    private int field290 = 2048;

    @OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
    private int field291 = 2047;

    @OriginalMember(owner = "client!client", name = "Qe", descriptor = "[LCQCDOTXO;")
    private class6[] field292 = new class6[this.field290];

    @OriginalMember(owner = "client!client", name = "Se", descriptor = "[I")
    public int[] field294 = new int[this.field290];

    @OriginalMember(owner = "client!client", name = "Ue", descriptor = "[I")
    private int[] field296 = new int[this.field290];

    @OriginalMember(owner = "client!client", name = "Ve", descriptor = "[LMNKDCXXG;")
    private class37[] field297 = new class37[this.field290];

    @OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
    private int field299 = 586;

    @OriginalMember(owner = "client!client", name = "Ze", descriptor = "[I")
    private int[] field301 = new int[50];

    @OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
    private int field306 = -1;

    @OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
    private int field307 = -1;

    @OriginalMember(owner = "client!client", name = "qf", descriptor = "[I")
    private int[] field317 = new int[33];

    @OriginalMember(owner = "client!client", name = "sf", descriptor = "B")
    private byte field319 = -82;

    @OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
    private int field323 = -1;

    @OriginalMember(owner = "client!client", name = "xf", descriptor = "Z")
    private boolean field324 = false;

    @OriginalMember(owner = "client!client", name = "Ff", descriptor = "B")
    private byte field332 = -47;

    @OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
    private int field333 = -1;

    @OriginalMember(owner = "client!client", name = "Hf", descriptor = "[I")
    private int[] field334 = new int[50];

    @OriginalMember(owner = "client!client", name = "If", descriptor = "I")
    private int field335 = -617;

    @OriginalMember(owner = "client!client", name = "Jf", descriptor = "Z")
    private boolean field336 = false;

    @OriginalMember(owner = "client!client", name = "Kf", descriptor = "I")
    private int field337 = -1;

    @OriginalMember(owner = "client!client", name = "Of", descriptor = "[[[I")
    private int[][][] field341 = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "Wf", descriptor = "[I")
    private int[] field349 = new int[class72.field1753];

    @OriginalMember(owner = "client!client", name = "Xf", descriptor = "Z")
    private boolean field350 = false;

    @OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
    private int field352 = -1;

    @OriginalMember(owner = "client!client", name = "ag", descriptor = "B")
    private byte field353 = 114;

    @OriginalMember(owner = "client!client", name = "bg", descriptor = "[LQEHNWGKD;")
    private class48[] field354 = new class48[32];

    @OriginalMember(owner = "client!client", name = "cg", descriptor = "B")
    private byte field355 = 1;

    @OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
    private int field357 = -1;

    @OriginalMember(owner = "client!client", name = "lg", descriptor = "I")
    private int field364 = -16571;

    @OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
    private int field365 = -1;

    @OriginalMember(owner = "client!client", name = "ng", descriptor = "[[I")
    private int[][] field366 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "og", descriptor = "Z")
    private boolean field367 = false;

    @OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
    private int field368 = -1;

    @OriginalMember(owner = "client!client", name = "ug", descriptor = "Z")
    public boolean field373 = true;

    @OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
    private int field374 = 813;

    @OriginalMember(owner = "client!client", name = "wg", descriptor = "[I")
    private int[] field375 = new int[33];

    @OriginalMember(owner = "client!client", name = "yg", descriptor = "Z")
    private boolean field377 = false;

    @OriginalMember(owner = "client!client", name = "zg", descriptor = "Z")
    private boolean field378 = false;

    @OriginalMember(owner = "client!client", name = "Ag", descriptor = "[[I")
    private int[][] field379 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Bg", descriptor = "[Ljava/lang/String;")
    private String[] field380 = new String[5];

    @OriginalMember(owner = "client!client", name = "Cg", descriptor = "[Z")
    private boolean[] field381 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
    private int field382 = 802;

    @OriginalMember(owner = "client!client", name = "Jg", descriptor = "Z")
    private boolean field388 = false;

    @OriginalMember(owner = "client!client", name = "Pg", descriptor = "LMNKDCXXG;")
    private class37 field394 = new class37(new byte[5000], -670);

    @OriginalMember(owner = "client!client", name = "Qg", descriptor = "[LYQBVAFEO;")
    private class70[] field395 = new class70[16384];

    @OriginalMember(owner = "client!client", name = "Sg", descriptor = "[I")
    public int[] field397 = new int[16384];

    @OriginalMember(owner = "client!client", name = "Tg", descriptor = "B")
    private byte field398 = 5;

    @OriginalMember(owner = "client!client", name = "Ug", descriptor = "[I")
    private int[] field399 = new int[256];

    @OriginalMember(owner = "client!client", name = "ah", descriptor = "Z")
    public boolean field405 = false;

    @OriginalMember(owner = "client!client", name = "ch", descriptor = "[I")
    private int[] field407 = new int[200];

    @OriginalMember(owner = "client!client", name = "dh", descriptor = "Z")
    private boolean field408 = false;

    @OriginalMember(owner = "client!client", name = "qh", descriptor = "Z")
    private boolean field421 = true;

    @OriginalMember(owner = "client!client", name = "rh", descriptor = "Z")
    private volatile boolean field422 = false;

    @OriginalMember(owner = "client!client", name = "th", descriptor = "[I")
    private int[] field424 = new int[1000];

    @OriginalMember(owner = "client!client", name = "uh", descriptor = "[I")
    private int[] field425 = new int[1000];

    @OriginalMember(owner = "client!client", name = "vh", descriptor = "Z")
    private boolean field426 = false;

    @OriginalMember(owner = "client!client", name = "wh", descriptor = "Z")
    private volatile boolean field427 = false;

    @OriginalMember(owner = "client!client", name = "Ah", descriptor = "[I")
    private int[] field431 = new int[9];

    @OriginalMember(owner = "client!client", name = "Gh", descriptor = "LWOVRPCGT;")
    private class61 field437 = new class61(-270);

    @OriginalMember(owner = "client!client", name = "Th", descriptor = "I")
    private int field450 = 1;

    @OriginalMember(owner = "client!client", name = "Wh", descriptor = "LWOVRPCGT;")
    private class61 field453 = new class61(-270);

    @OriginalMember(owner = "client!client", name = "fi", descriptor = "LMNKDCXXG;")
    private class37 field462 = class37.method374((byte) 4, 1);

    @OriginalMember(owner = "client!client", name = "gi", descriptor = "[I")
    public int[] field463 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client!client", name = "ji", descriptor = "LMNKDCXXG;")
    private class37 field466 = class37.method374((byte) 4, 1);

    @OriginalMember(owner = "client!client", name = "ki", descriptor = "[LWSLQJCTU;")
    public class62[] field467 = new class62[5];

    @OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
    private int field471 = 2;

    @OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
    private int field472 = -1;

    @OriginalMember(owner = "client!client", name = "si", descriptor = "Z")
    private boolean field475 = false;

    @OriginalMember(owner = "client!client", name = "wi", descriptor = "[Z")
    private boolean[] field479 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Ci", descriptor = "[I")
    private int[] field485 = new int[class72.field1753];

    @OriginalMember(owner = "client!client", name = "Di", descriptor = "Z")
    private boolean field486 = false;

    @OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
    private int field496 = 6;

    @OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
    private int field497 = -1;

    @OriginalMember(owner = "client!client", name = "Pi", descriptor = "[I")
    public int[] field498 = new int[2000];

    @OriginalMember(owner = "client!client", name = "Qi", descriptor = "[I")
    private int[] field499 = new int[50];

    @OriginalMember(owner = "client!client", name = "Ri", descriptor = "I")
    private int field500 = -1;

    @OriginalMember(owner = "client!client", name = "Si", descriptor = "[LBVXAXAEI;")
    private class4[] field501 = new class4[2];

    @OriginalMember(owner = "client!client", name = "Wi", descriptor = "Ljava/lang/String;")
    private String field505 = "";

    @OriginalMember(owner = "client!client", name = "Xi", descriptor = "Ljava/lang/String;")
    private String field506 = "";

    @OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
    private int field507 = -16571;

    @OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
    private int field513 = 1;

    @OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
    private int field514 = 128;

    @OriginalMember(owner = "client!client", name = "kj", descriptor = "[J")
    private long[] field519 = new long[100];

    @OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
    private int field520 = 649;

    @OriginalMember(owner = "client!client", name = "mj", descriptor = "[B")
    private byte[] field521 = new byte[16384];

    @OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
    private int field522 = 503;

    @OriginalMember(owner = "client!client", name = "oj", descriptor = "Z")
    private boolean field523 = true;

    @OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
    private int field524 = -46103;

    @OriginalMember(owner = "client!client", name = "sj", descriptor = "Z")
    private boolean field527 = true;

    @OriginalMember(owner = "client!client", name = "vj", descriptor = "Z")
    private boolean field530 = false;

    @OriginalMember(owner = "client!client", name = "yj", descriptor = "[I")
    public int[] field533 = new int[1000];

    @OriginalMember(owner = "client!client", name = "zj", descriptor = "B")
    private byte field534 = 9;

    @OriginalMember(owner = "client!client", name = "Aj", descriptor = "Z")
    private boolean field535 = true;

    @OriginalMember(owner = "client!client", name = "Bj", descriptor = "Ljava/lang/String;")
    private String field536 = "";

    @OriginalMember(owner = "client!client", name = "Ej", descriptor = "Z")
    private boolean field539 = false;

    @OriginalMember(owner = "client!client", name = "Nj", descriptor = "Z")
    private boolean field548 = false;

    @OriginalMember(owner = "client!client", name = "Oj", descriptor = "B")
    private byte field549 = -63;

    @OriginalMember(owner = "client!client", name = "Rj", descriptor = "Ljava/lang/String;")
    private String field552 = "";

    @OriginalMember(owner = "client!client", name = "Tj", descriptor = "[Ljava/lang/String;")
    private String[] field554 = new String[100];

    @OriginalMember(owner = "client!client", name = "Uj", descriptor = "[I")
    private int[] field555 = new int[100];

    @OriginalMember(owner = "client!client", name = "Wj", descriptor = "Z")
    private boolean field557 = false;

    @OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
    private int field559 = 27382;

    @OriginalMember(owner = "client!client", name = "Zj", descriptor = "Z")
    private boolean field560 = true;

    @OriginalMember(owner = "client!client", name = "ak", descriptor = "I")
    private final int field561 = 100;

    @OriginalMember(owner = "client!client", name = "bk", descriptor = "[I")
    private int[] field562 = new int[100];

    @OriginalMember(owner = "client!client", name = "ck", descriptor = "[I")
    private int[] field563 = new int[4000];

    @OriginalMember(owner = "client!client", name = "dk", descriptor = "[I")
    private int[] field564 = new int[4000];

    @OriginalMember(owner = "client!client", name = "ek", descriptor = "I")
    private int field565 = -953;

    @OriginalMember(owner = "client!client", name = "fk", descriptor = "I")
    private int field566 = -46257;

    @OriginalMember(owner = "client!client", name = "gk", descriptor = "Ljava/lang/String;")
    private String field567 = "";

    @OriginalMember(owner = "client!client", name = "jk", descriptor = "Z")
    private boolean field570 = false;

    @OriginalMember(owner = "client!client", name = "kk", descriptor = "[LEKHWFCYP;")
    private class14[] field571 = new class14[4];

    @OriginalMember(owner = "client!client", name = "lk", descriptor = "I")
    private int field572 = -1;

    @OriginalMember(owner = "client!client", name = "mk", descriptor = "Ljava/lang/String;")
    private String field573 = "";

    @OriginalMember(owner = "client!client", name = "nk", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field574 = new CRC32();

    @OriginalMember(owner = "client!client", name = "sk", descriptor = "[I")
    private int[] field579 = new int[5];

    @OriginalMember(owner = "client!client", name = "mc", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field158 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!client", name = "nd", descriptor = "[I")
    public static final int[] field211 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client!client", name = "Ee", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field280 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!client", name = "Le", descriptor = "I")
    private static int field287 = 437;

    @OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
    private static int field289 = 8;

    @OriginalMember(owner = "client!client", name = "dg", descriptor = "[[I")
    public static final int[][] field356 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
    private static int field383 = 10;

    @OriginalMember(owner = "client!client", name = "Gg", descriptor = "Z")
    private static boolean field385 = true;

    @OriginalMember(owner = "client!client", name = "nh", descriptor = "Ljava/lang/String;")
    private static String field418 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client!client", name = "Rh", descriptor = "[I")
    public static int[] field448 = new int[32];

    @OriginalMember(owner = "client!client", name = "wj", descriptor = "[I")
    private static int[] field531;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    private int field102;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    private int field103;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    private int field107;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    private int field112;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    private int field114;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    private int field119;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    private int field121;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
    private int field122;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
    private int field123;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
    private int field124;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "I")
    private int field125;

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "I")
    private static int field126;

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "I")
    private int field129;

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
    private static int field135;

    @OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
    private int field136;

    @OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
    private int field137;

    @OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "client!client", name = "fc", descriptor = "I")
    private int field151;

    @OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
    private int field159;

    @OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
    private int field160;

    @OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
    private int field164;

    @OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
    private static int field181;

    @OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client!client", name = "Qc", descriptor = "I")
    private int field188;

    @OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
    private static int field189;

    @OriginalMember(owner = "client!client", name = "Sc", descriptor = "I")
    private int field190;

    @OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "client!client", name = "bd", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client!client", name = "id", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client!client", name = "kd", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client!client", name = "md", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
    private int field216;

    @OriginalMember(owner = "client!client", name = "ud", descriptor = "I")
    private int field218;

    @OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
    private int field225;

    @OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client!client", name = "Ed", descriptor = "I")
    private int field228;

    @OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
    private static int field247;

    @OriginalMember(owner = "client!client", name = "je", descriptor = "I")
    private static int field259;

    @OriginalMember(owner = "client!client", name = "me", descriptor = "I")
    private int field262;

    @OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
    private int field264;

    @OriginalMember(owner = "client!client", name = "De", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
    private static int field282;

    @OriginalMember(owner = "client!client", name = "He", descriptor = "I")
    private int field283;

    @OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
    private int field293;

    @OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "client!client", name = "We", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client!client", name = "af", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client!client", name = "df", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client!client", name = "uf", descriptor = "I")
    private int field321;

    @OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
    private static int field322;

    @OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client!client", name = "Cf", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client!client", name = "Lf", descriptor = "I")
    private int field338;

    @OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
    private int field339;

    @OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
    private static int field340;

    @OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client!client", name = "Sf", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
    private int field346;

    @OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "client!client", name = "Yf", descriptor = "I")
    public int field351;

    @OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "client!client", name = "sg", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
    private static int field400;

    @OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
    private int field401;

    @OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "client!client", name = "Yg", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client!client", name = "sh", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!client", name = "Fh", descriptor = "I")
    private int field436;

    @OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
    private int field438;

    @OriginalMember(owner = "client!client", name = "Ih", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client!client", name = "Sh", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client!client", name = "Uh", descriptor = "I")
    private static int field451;

    @OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client!client", name = "ai", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client!client", name = "ci", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client!client", name = "hi", descriptor = "I")
    private static int field464;

    @OriginalMember(owner = "client!client", name = "ii", descriptor = "I")
    private static int field465;

    @OriginalMember(owner = "client!client", name = "li", descriptor = "I")
    private int field468;

    @OriginalMember(owner = "client!client", name = "mi", descriptor = "I")
    private static int field469;

    @OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
    private static int field473;

    @OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
    private int field474;

    @OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "client!client", name = "yi", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "client!client", name = "zi", descriptor = "I")
    private int field482;

    @OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client!client", name = "Zi", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client!client", name = "aj", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client!client", name = "bj", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client!client", name = "cj", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
    private static int field528;

    @OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
    private int field532;

    @OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
    private int field538;

    @OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client!client", name = "Gj", descriptor = "I")
    private static int field541;

    @OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!client", name = "Ij", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "client!client", name = "Pj", descriptor = "I")
    private int field550;

    @OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
    private int field553;

    @OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client!client", name = "hk", descriptor = "I")
    private int field568;

    @OriginalMember(owner = "client!client", name = "ik", descriptor = "I")
    private int field569;

    @OriginalMember(owner = "client!client", name = "ok", descriptor = "I")
    private int field575;

    @OriginalMember(owner = "client!client", name = "pk", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client!client", name = "qk", descriptor = "I")
    private int field577;

    @OriginalMember(owner = "client!client", name = "rk", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client!client", name = "tk", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!client", name = "J", descriptor = "I")
    private int field77;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    private int field81;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    private int field83;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    private int field87;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    private int field88;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    private int field89;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    private int field90;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    private int field91;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    private int field92;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!client", name = "Ud", descriptor = "J")
    private long field244;

    @OriginalMember(owner = "client!client", name = "te", descriptor = "J")
    private long field269;

    @OriginalMember(owner = "client!client", name = "Pf", descriptor = "J")
    public long field342;

    @OriginalMember(owner = "client!client", name = "ei", descriptor = "J")
    private long field461;

    @OriginalMember(owner = "client!client", name = "jj", descriptor = "J")
    private long field518;

    @OriginalMember(owner = "client!client", name = "td", descriptor = "LHFSXIPFN;")
    private class23 field217;

    @OriginalMember(owner = "client!client", name = "Ec", descriptor = "LMEXICRKY;")
    private class35 field176;

    @OriginalMember(owner = "client!client", name = "Fc", descriptor = "LMEXICRKY;")
    private class35 field177;

    @OriginalMember(owner = "client!client", name = "Gc", descriptor = "LMEXICRKY;")
    private class35 field178;

    @OriginalMember(owner = "client!client", name = "Hc", descriptor = "LMEXICRKY;")
    private class35 field179;

    @OriginalMember(owner = "client!client", name = "gf", descriptor = "LMEXICRKY;")
    private class35 field308;

    @OriginalMember(owner = "client!client", name = "hf", descriptor = "LMEXICRKY;")
    private class35 field309;

    @OriginalMember(owner = "client!client", name = "jf", descriptor = "LMEXICRKY;")
    private class35 field310;

    @OriginalMember(owner = "client!client", name = "kf", descriptor = "LMEXICRKY;")
    private class35 field311;

    @OriginalMember(owner = "client!client", name = "lf", descriptor = "LMEXICRKY;")
    private class35 field312;

    @OriginalMember(owner = "client!client", name = "mf", descriptor = "LMEXICRKY;")
    private class35 field313;

    @OriginalMember(owner = "client!client", name = "nf", descriptor = "LMEXICRKY;")
    private class35 field314;

    @OriginalMember(owner = "client!client", name = "of", descriptor = "LMEXICRKY;")
    private class35 field315;

    @OriginalMember(owner = "client!client", name = "pf", descriptor = "LMEXICRKY;")
    private class35 field316;

    @OriginalMember(owner = "client!client", name = "eh", descriptor = "LMEXICRKY;")
    private class35 field409;

    @OriginalMember(owner = "client!client", name = "fh", descriptor = "LMEXICRKY;")
    private class35 field410;

    @OriginalMember(owner = "client!client", name = "gh", descriptor = "LMEXICRKY;")
    private class35 field411;

    @OriginalMember(owner = "client!client", name = "hh", descriptor = "LMEXICRKY;")
    private class35 field412;

    @OriginalMember(owner = "client!client", name = "ih", descriptor = "LMEXICRKY;")
    private class35 field413;

    @OriginalMember(owner = "client!client", name = "jh", descriptor = "LMEXICRKY;")
    private class35 field414;

    @OriginalMember(owner = "client!client", name = "kh", descriptor = "LMEXICRKY;")
    private class35 field415;

    @OriginalMember(owner = "client!client", name = "lh", descriptor = "LMEXICRKY;")
    private class35 field416;

    @OriginalMember(owner = "client!client", name = "mh", descriptor = "LMEXICRKY;")
    private class35 field417;

    @OriginalMember(owner = "client!client", name = "Kh", descriptor = "LMEXICRKY;")
    private class35 field441;

    @OriginalMember(owner = "client!client", name = "Lh", descriptor = "LMEXICRKY;")
    private class35 field442;

    @OriginalMember(owner = "client!client", name = "Mh", descriptor = "LMEXICRKY;")
    private class35 field443;

    @OriginalMember(owner = "client!client", name = "uj", descriptor = "LNXFIIFAD;")
    private class41 field529;

    @OriginalMember(owner = "client!client", name = "Qh", descriptor = "LOIFRHCSO;")
    public class43 field447;

    @OriginalMember(owner = "client!client", name = "Lc", descriptor = "LQEHNWGKD;")
    private class48 field183;

    @OriginalMember(owner = "client!client", name = "qd", descriptor = "LQEHNWGKD;")
    private class48 field214;

    @OriginalMember(owner = "client!client", name = "rd", descriptor = "LQEHNWGKD;")
    private class48 field215;

    @OriginalMember(owner = "client!client", name = "Md", descriptor = "LQEHNWGKD;")
    private class48 field236;

    @OriginalMember(owner = "client!client", name = "xh", descriptor = "LQEHNWGKD;")
    private class48 field428;

    @OriginalMember(owner = "client!client", name = "yh", descriptor = "LQEHNWGKD;")
    private class48 field429;

    @OriginalMember(owner = "client!client", name = "Jh", descriptor = "LQEHNWGKD;")
    private class48 field440;

    @OriginalMember(owner = "client!client", name = "Vh", descriptor = "LQEHNWGKD;")
    private class48 field452;

    @OriginalMember(owner = "client!client", name = "Ei", descriptor = "LQEHNWGKD;")
    private class48 field487;

    @OriginalMember(owner = "client!client", name = "Fi", descriptor = "LQEHNWGKD;")
    private class48 field488;

    @OriginalMember(owner = "client!client", name = "Gi", descriptor = "LQEHNWGKD;")
    private class48 field489;

    @OriginalMember(owner = "client!client", name = "Hi", descriptor = "LQEHNWGKD;")
    private class48 field490;

    @OriginalMember(owner = "client!client", name = "Ii", descriptor = "LQEHNWGKD;")
    private class48 field491;

    @OriginalMember(owner = "client!client", name = "Ji", descriptor = "LQEHNWGKD;")
    private class48 field492;

    @OriginalMember(owner = "client!client", name = "Ki", descriptor = "LQEHNWGKD;")
    private class48 field493;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "LBVXAXAEI;")
    private class4 field100;

    @OriginalMember(owner = "client!client", name = "ed", descriptor = "LBVXAXAEI;")
    private class4 field202;

    @OriginalMember(owner = "client!client", name = "fd", descriptor = "LBVXAXAEI;")
    private class4 field203;

    @OriginalMember(owner = "client!client", name = "gd", descriptor = "LBVXAXAEI;")
    private class4 field204;

    @OriginalMember(owner = "client!client", name = "Yd", descriptor = "LBVXAXAEI;")
    private class4 field248;

    @OriginalMember(owner = "client!client", name = "Zd", descriptor = "LBVXAXAEI;")
    private class4 field249;

    @OriginalMember(owner = "client!client", name = "ae", descriptor = "LBVXAXAEI;")
    private class4 field250;

    @OriginalMember(owner = "client!client", name = "be", descriptor = "LBVXAXAEI;")
    private class4 field251;

    @OriginalMember(owner = "client!client", name = "ce", descriptor = "LBVXAXAEI;")
    private class4 field252;

    @OriginalMember(owner = "client!client", name = "ve", descriptor = "LBVXAXAEI;")
    private class4 field271;

    @OriginalMember(owner = "client!client", name = "we", descriptor = "LBVXAXAEI;")
    private class4 field272;

    @OriginalMember(owner = "client!client", name = "xe", descriptor = "LBVXAXAEI;")
    private class4 field273;

    @OriginalMember(owner = "client!client", name = "ye", descriptor = "LBVXAXAEI;")
    private class4 field274;

    @OriginalMember(owner = "client!client", name = "ze", descriptor = "LBVXAXAEI;")
    private class4 field275;

    @OriginalMember(owner = "client!client", name = "Kg", descriptor = "LBVXAXAEI;")
    private class4 field389;

    @OriginalMember(owner = "client!client", name = "Lg", descriptor = "LBVXAXAEI;")
    private class4 field390;

    @OriginalMember(owner = "client!client", name = "Mg", descriptor = "LBVXAXAEI;")
    private class4 field391;

    @OriginalMember(owner = "client!client", name = "Ng", descriptor = "LBVXAXAEI;")
    private class4 field392;

    @OriginalMember(owner = "client!client", name = "Og", descriptor = "LBVXAXAEI;")
    private class4 field393;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "LBVXAXAEI;")
    private class4 field99;

    @OriginalMember(owner = "client!client", name = "kc", descriptor = "LUVSYUCDF;")
    private class55 field156;

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "LUWINSVPX;")
    private class56 field132;

    @OriginalMember(owner = "client!client", name = "Be", descriptor = "LXFJQTFBV;")
    private class64 field277;

    @OriginalMember(owner = "client!client", name = "Jj", descriptor = "LXZMPLIVN;")
    private class67 field544;

    @OriginalMember(owner = "client!client", name = "Kj", descriptor = "LXZMPLIVN;")
    private class67 field545;

    @OriginalMember(owner = "client!client", name = "Lj", descriptor = "LXZMPLIVN;")
    private class67 field546;

    @OriginalMember(owner = "client!client", name = "Mj", descriptor = "LXZMPLIVN;")
    private class67 field547;

    @OriginalMember(owner = "client!client", name = "ee", descriptor = "LCQCDOTXO;")
    public static class6 field254;

    @OriginalMember(owner = "client!client", name = "vd", descriptor = "Ljava/lang/String;")
    private String field219;

    @OriginalMember(owner = "client!client", name = "Ef", descriptor = "Ljava/lang/String;")
    public String field331;

    @OriginalMember(owner = "client!client", name = "Zg", descriptor = "Ljava/lang/String;")
    public String field404;

    @OriginalMember(owner = "client!client", name = "Qj", descriptor = "Ljava/lang/String;")
    private String field551;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Ljava/net/Socket;")
    private Socket field106;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Z")
    private static boolean field111;

    @OriginalMember(owner = "client!client", name = "Zb", descriptor = "Z")
    private static boolean field145;

    @OriginalMember(owner = "client!client", name = "dd", descriptor = "Z")
    private static boolean field201;

    @OriginalMember(owner = "client!client", name = "Ie", descriptor = "Z")
    public static boolean field284;

    @OriginalMember(owner = "client!client", name = "rf", descriptor = "Z")
    private static boolean field318;

    @OriginalMember(owner = "client!client", name = "Hg", descriptor = "Z")
    private static boolean field386;

    @OriginalMember(owner = "client!client", name = "ph", descriptor = "Z")
    public static boolean field420;

    @OriginalMember(owner = "client!client", name = "Ti", descriptor = "Z")
    private static boolean field502;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "[I")
    private int[] field115;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "[I")
    private int[] field116;

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "[I")
    private int[] field138;

    @OriginalMember(owner = "client!client", name = "Tb", descriptor = "[I")
    private int[] field139;

    @OriginalMember(owner = "client!client", name = "Ub", descriptor = "[I")
    private int[] field140;

    @OriginalMember(owner = "client!client", name = "Vb", descriptor = "[I")
    private int[] field141;

    @OriginalMember(owner = "client!client", name = "Vc", descriptor = "[I")
    private int[] field193;

    @OriginalMember(owner = "client!client", name = "Wc", descriptor = "[I")
    private int[] field194;

    @OriginalMember(owner = "client!client", name = "Xc", descriptor = "[I")
    private int[] field195;

    @OriginalMember(owner = "client!client", name = "Yc", descriptor = "[I")
    private int[] field196;

    @OriginalMember(owner = "client!client", name = "qg", descriptor = "[I")
    private int[] field369;

    @OriginalMember(owner = "client!client", name = "rg", descriptor = "[I")
    private int[] field370;

    @OriginalMember(owner = "client!client", name = "ti", descriptor = "[I")
    private int[] field476;

    @OriginalMember(owner = "client!client", name = "ui", descriptor = "[I")
    private int[] field477;

    @OriginalMember(owner = "client!client", name = "vi", descriptor = "[I")
    private int[] field478;

    @OriginalMember(owner = "client!client", name = "bf", descriptor = "[LBVXAXAEI;")
    private class4[] field303;

    @OriginalMember(owner = "client!client", name = "hd", descriptor = "[[B")
    private byte[][] field205;

    @OriginalMember(owner = "client!client", name = "Ph", descriptor = "[[B")
    private byte[][] field446;

    @OriginalMember(owner = "client!client", name = "di", descriptor = "[[[B")
    private byte[][][] field460;

    @OriginalMember(owner = "client!client", name = "Xj", descriptor = "[[[I")
    private int[][][] field558;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)V")
    public final void method27(int arg0, int arg1, boolean arg2) {
        int var4 = 0;
        if (!arg2) {
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field154[var5] != null) {
                    int var6 = this.field152[var5];
                    int var7 = 70 - var4 * 14 + this.field262 + 4;
                    if (var7 < -20) {
                        break;
                    }
                    String var8 = this.field153[var5];
                    boolean var9 = false;
                    if (var8 != null && var8.startsWith("@cr1@")) {
                        var8 = var8.substring(5);
                        boolean var10 = true;
                    }
                    if (var8 != null && var8.startsWith("@cr2@")) {
                        var8 = var8.substring(5);
                        boolean var11 = true;
                    }
                    if (var6 == 0) {
                        ++var4;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field185 == 0 || this.field185 == 1 && this.method30(426, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7 && !var8.equals(field254.field604)) {
                            if (this.field137 >= 1) {
                                this.field79[this.field537] = "Report abuse @whi@" + var8;
                                this.field257[this.field537] = 989;
                                ++this.field537;
                            }
                            this.field79[this.field537] = "Add ignore @whi@" + var8;
                            this.field257[this.field537] = 405;
                            ++this.field537;
                            this.field79[this.field537] = "Add friend @whi@" + var8;
                            this.field257[this.field537] = 9;
                            ++this.field537;
                        }
                        ++var4;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field136 == 0 && (var6 == 7 || this.field538 == 0 || this.field538 == 1 && this.method30(426, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            if (this.field137 >= 1) {
                                this.field79[this.field537] = "Report abuse @whi@" + var8;
                                this.field257[this.field537] = 989;
                                ++this.field537;
                            }
                            this.field79[this.field537] = "Add ignore @whi@" + var8;
                            this.field257[this.field537] = 405;
                            ++this.field537;
                            this.field79[this.field537] = "Add friend @whi@" + var8;
                            this.field257[this.field537] = 9;
                            ++this.field537;
                        }
                        ++var4;
                    }
                    if (var6 == 4 && (this.field129 == 0 || this.field129 == 1 && this.method30(426, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            this.field79[this.field537] = "Accept trade @whi@" + var8;
                            this.field257[this.field537] = 386;
                            ++this.field537;
                        }
                        ++var4;
                    }
                    if ((var6 == 5 || var6 == 6) && this.field136 == 0 && this.field538 < 2) {
                        ++var4;
                    }
                    if (var6 == 8 && (this.field129 == 0 || this.field129 == 1 && this.method30(426, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            this.field79[this.field537] = "Accept challenge @whi@" + var8;
                            this.field257[this.field537] = 679;
                            ++this.field537;
                        }
                        ++var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIILIJOSTBQT;II)V")
    public final void method28(int arg0, int arg1, int arg2, int arg3, int arg4, class25 arg5, int arg6, int arg7) {
        if (arg5.field957 == 0 && arg5.field945 != null && !arg5.field948) {
            if (arg6 >= arg4 && arg3 >= arg0 && arg6 <= arg5.field933 + arg4 && arg3 <= arg5.field960 + arg0) {
                int var9 = arg5.field945.length;
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg5.field912[var10] + arg4;
                    int var12 = arg5.field904[var10] + arg0 - arg7;
                    class25 var13 = class25.method276(arg5.field945[var10]);
                    int var14 = var13.field950 + var11;
                    int var15 = var13.field975 + var12;
                    if ((var13.field929 >= 0 || var13.field931 != 0) && arg6 >= var14 && arg3 >= var15 && arg6 < var13.field933 + var14 && arg3 < var13.field960 + var15) {
                        if (var13.field929 >= 0) {
                            this.field288 = var13.field929;
                        } else {
                            this.field288 = var13.field944;
                        }
                    }
                    if (var13.field957 == 8 && arg6 >= var14 && arg3 >= var15 && arg6 < var13.field933 + var14 && arg3 < var13.field960 + var15) {
                        this.field338 = var13.field944;
                    }
                    if (var13.field957 == 0) {
                        this.method28(var15, 4, arg2, arg3, var14, var13, arg6, var13.field906);
                        if (var13.field937 > var13.field960) {
                            this.method117(var13.field937, arg3, var13.field960, arg2, var15, var13, arg6, var13.field933 + var14, this.field216);
                        }
                    } else {
                        if (var13.field970 == 1 && arg6 >= var14 && arg3 >= var15 && arg6 < var13.field933 + var14 && arg3 < var13.field960 + var15) {
                            boolean var16 = false;
                            if (var13.field951 != 0) {
                                var16 = this.method55(var13, (byte) 0);
                            }
                            if (!var16) {
                                this.field79[this.field537] = var13.field921;
                                this.field257[this.field537] = 781;
                                this.field256[this.field537] = var13.field944;
                                ++this.field537;
                            }
                        }
                        if (var13.field970 == 2 && this.field401 == 0 && arg6 >= var14 && arg3 >= var15 && arg6 < var13.field933 + var14 && arg3 < var13.field960 + var15) {
                            String var17 = var13.field973;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field79[this.field537] = var17 + " @gre@" + var13.field964;
                            this.field257[this.field537] = 758;
                            this.field256[this.field537] = var13.field944;
                            ++this.field537;
                        }
                        if (var13.field970 == 3 && arg6 >= var14 && arg3 >= var15 && arg6 < var13.field933 + var14 && arg3 < var13.field960 + var15) {
                            this.field79[this.field537] = "Close";
                            if (arg2 == 3) {
                                this.field257[this.field537] = 720;
                            } else {
                                this.field257[this.field537] = 252;
                            }
                            this.field256[this.field537] = var13.field944;
                            ++this.field537;
                        }
                        if (var13.field970 == 4 && arg6 >= var14 && arg3 >= var15 && arg6 < var13.field933 + var14 && arg3 < var13.field960 + var15) {
                            this.field79[this.field537] = var13.field921;
                            this.field257[this.field537] = 392;
                            this.field256[this.field537] = var13.field944;
                            ++this.field537;
                        }
                        if (var13.field970 == 5 && arg6 >= var14 && arg3 >= var15 && arg6 < var13.field933 + var14 && arg3 < var13.field960 + var15) {
                            this.field79[this.field537] = var13.field921;
                            this.field257[this.field537] = 569;
                            this.field256[this.field537] = var13.field944;
                            ++this.field537;
                        }
                        if (var13.field970 == 6 && !this.field530 && arg6 >= var14 && arg3 >= var15 && arg6 < var13.field933 + var14 && arg3 < var13.field960 + var15) {
                            this.field79[this.field537] = var13.field921;
                            this.field257[this.field537] = 198;
                            this.field256[this.field537] = var13.field944;
                            ++this.field537;
                        }
                        if (var13.field957 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field960; ++var19) {
                                for (int var20 = 0; var20 < var13.field933; ++var20) {
                                    int var21 = (var13.field938 + 32) * var20 + var14;
                                    int var22 = (var13.field952 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field900[var18];
                                        var22 += var13.field955[var18];
                                    }
                                    if (arg6 >= var21 && arg3 >= var22 && arg6 < var21 + 32 && arg3 < var22 + 32) {
                                        this.field362 = var18;
                                        this.field363 = var13.field944;
                                        if (var13.field932[var18] > 0) {
                                            class50 var23 = class50.method475(var13.field932[var18] - 1);
                                            if (this.field327 == 1 && var13.field947) {
                                                if (this.field329 != var13.field944 || this.field328 != var18) {
                                                    this.field79[this.field537] = "Use " + this.field331 + " with @lre@" + var23.field1410;
                                                    this.field257[this.field537] = 858;
                                                    this.field258[this.field537] = var23.field1402;
                                                    this.field255[this.field537] = var18;
                                                    this.field256[this.field537] = var13.field944;
                                                    ++this.field537;
                                                }
                                            } else if (this.field401 == 1 && var13.field947) {
                                                if ((this.field403 & 16) == 16) {
                                                    this.field79[this.field537] = this.field404 + " @lre@" + var23.field1410;
                                                    this.field257[this.field537] = 308;
                                                    this.field258[this.field537] = var23.field1402;
                                                    this.field255[this.field537] = var18;
                                                    this.field256[this.field537] = var13.field944;
                                                    ++this.field537;
                                                }
                                            } else {
                                                if (var13.field947) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field1386 != null && var23.field1386[var24] != null) {
                                                            this.field79[this.field537] = var23.field1386[var24] + " @lre@" + var23.field1410;
                                                            if (var24 == 3) {
                                                                this.field257[this.field537] = 459;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field257[this.field537] = 257;
                                                            }
                                                            this.field258[this.field537] = var23.field1402;
                                                            this.field255[this.field537] = var18;
                                                            this.field256[this.field537] = var13.field944;
                                                            ++this.field537;
                                                        } else if (var24 == 4) {
                                                            this.field79[this.field537] = "Drop @lre@" + var23.field1410;
                                                            this.field257[this.field537] = 257;
                                                            this.field258[this.field537] = var23.field1402;
                                                            this.field255[this.field537] = var18;
                                                            this.field256[this.field537] = var13.field944;
                                                            ++this.field537;
                                                        }
                                                    }
                                                }
                                                if (var13.field942) {
                                                    this.field79[this.field537] = "Use @lre@" + var23.field1410;
                                                    this.field257[this.field537] = 108;
                                                    this.field258[this.field537] = var23.field1402;
                                                    this.field255[this.field537] = var18;
                                                    this.field256[this.field537] = var13.field944;
                                                    ++this.field537;
                                                }
                                                if (var13.field947 && var23.field1386 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field1386[var25] != null) {
                                                            this.field79[this.field537] = var23.field1386[var25] + " @lre@" + var23.field1410;
                                                            if (var25 == 0) {
                                                                this.field257[this.field537] = 524;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field257[this.field537] = 239;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field257[this.field537] = 518;
                                                            }
                                                            this.field258[this.field537] = var23.field1402;
                                                            this.field255[this.field537] = var18;
                                                            this.field256[this.field537] = var13.field944;
                                                            ++this.field537;
                                                        }
                                                    }
                                                }
                                                if (var13.field934 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field934[var26] != null) {
                                                            this.field79[this.field537] = var13.field934[var26] + " @lre@" + var23.field1410;
                                                            if (var26 == 0) {
                                                                this.field257[this.field537] = 627;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field257[this.field537] = 734;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field257[this.field537] = 304;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field257[this.field537] = 974;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field257[this.field537] = 380;
                                                            }
                                                            this.field258[this.field537] = var23.field1402;
                                                            this.field255[this.field537] = var18;
                                                            this.field256[this.field537] = var13.field944;
                                                            ++this.field537;
                                                        }
                                                    }
                                                }
                                                this.field79[this.field537] = "Examine @lre@" + var23.field1410;
                                                this.field257[this.field537] = 1194;
                                                this.field258[this.field537] = var23.field1402;
                                                this.field255[this.field537] = var18;
                                                this.field256[this.field537] = var13.field944;
                                                ++this.field537;
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        }
                    }
                }
                if (arg1 != 4) {
                    this.field466.method376(56);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method29(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method30(int arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field197; ++var3) {
                if (arg1.equalsIgnoreCase(this.field84[var3])) {
                    return true;
                }
            }
            int var4 = 96 / arg0;
            return arg1.equalsIgnoreCase(field254.field604);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method31(int arg0) {
        if (arg0 < 0) {
            if (this.field325 == 2) {
                for (class1 var2 = (class1) this.field155.method543(); var2 != null; var2 = (class1) this.field155.method545(907)) {
                    if (var2.field12 > 0) {
                        --var2.field12;
                    }
                    if (var2.field12 == 0) {
                        if (var2.field9 < 0 || class65.method574(var2.field9, var2.field11, 939)) {
                            this.method108(this.field335, var2.field3, var2.field4, var2.field2, var2.field9, var2.field10, var2.field11, var2.field5);
                            var2.method14();
                        }
                    } else {
                        if (var2.field1 > 0) {
                            --var2.field1;
                        }
                        if (var2.field1 == 0 && var2.field4 >= 1 && var2.field5 >= 1 && var2.field4 <= 102 && var2.field5 <= 102 && (var2.field6 < 0 || class65.method574(var2.field6, var2.field8, 939))) {
                            this.method108(this.field335, var2.field3, var2.field4, var2.field2, var2.field6, var2.field7, var2.field8, var2.field5);
                            var2.field1 = -1;
                            if (var2.field9 == var2.field6 && var2.field9 == -1) {
                                var2.method14();
                            } else if (var2.field9 == var2.field6 && var2.field7 == var2.field10 && var2.field8 == var2.field11) {
                                var2.method14();
                            }
                        }
                    }
                }
                ++field473;
                if (field473 > 1691) {
                    field473 = 0;
                    this.field466.method375(121, this.field496);
                    this.field466.method376(0);
                    int var3 = this.field466.field1212;
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field466.method377(39382);
                    }
                    this.field466.method376(22);
                    this.field466.method377(7771);
                    this.field466.method377(31532);
                    this.field466.method377(3548);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field466.method376(45);
                    }
                    this.field466.method377(19292);
                    this.field466.method376((int) (Math.random() * 256.0D));
                    this.field466.method376(208);
                    this.field466.method376(18);
                    this.field466.method385(true, this.field466.field1212 - var3);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method32(byte arg0) {
        if (arg0 == 87) {
            if (this.field107 == 0) {
                int var2 = super.field23 / 2 - 80;
                int var3 = super.field24 / 2 + 20;
                int var14 = var3 + 20;
                if (super.field39 == 1 && super.field40 >= var2 - 75 && super.field40 <= var2 + 75 && super.field41 >= var14 - 20 && super.field41 <= var14 + 20) {
                    this.field107 = 3;
                    this.field575 = 0;
                }
                int var4 = super.field23 / 2 + 80;
                if (super.field39 == 1 && super.field40 >= var4 - 75 && super.field40 <= var4 + 75 && super.field41 >= var14 - 20 && super.field41 <= var14 + 20) {
                    this.field505 = "";
                    this.field506 = "Enter your username & password.";
                    this.field107 = 2;
                    this.field575 = 0;
                }
            } else if (this.field107 == 2) {
                int var5 = super.field24 / 2 - 40;
                int var15 = var5 + 30;
                int var16 = var15 + 25;
                if (super.field39 == 1 && super.field41 >= var16 - 15 && super.field41 < var16) {
                    this.field575 = 0;
                }
                var5 = var16 + 15;
                if (super.field39 == 1 && super.field41 >= var5 - 15 && super.field41 < var5) {
                    this.field575 = 1;
                }
                var5 += 15;
                int var6 = super.field23 / 2 - 80;
                int var7 = super.field24 / 2 + 50;
                int var17 = var7 + 20;
                if (super.field39 == 1 && super.field40 >= var6 - 75 && super.field40 <= var6 + 75 && super.field41 >= var17 - 20 && super.field41 <= var17 + 20) {
                    this.field83 = 0;
                    this.method84(this.field265, this.field266, false);
                    if (this.field405) {
                        return;
                    }
                }
                int var8 = super.field23 / 2 + 80;
                if (super.field39 == 1 && super.field40 >= var8 - 75 && super.field40 <= var8 + 75 && super.field41 >= var17 - 20 && super.field41 <= var17 + 20) {
                    this.field107 = 0;
                    this.field265 = "";
                    this.field266 = "";
                }
                while (true) {
                    while (true) {
                        int var9 = this.method5(-36198);
                        if (var9 == -1) {
                            return;
                        }
                        boolean var10 = false;
                        for (int var11 = 0; var11 < field418.length(); ++var11) {
                            if (var9 == field418.charAt(var11)) {
                                var10 = true;
                                break;
                            }
                        }
                        if (this.field575 == 0) {
                            if (var9 == 8 && this.field265.length() > 0) {
                                this.field265 = this.field265.substring(0, this.field265.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field575 = 1;
                            }
                            if (var10) {
                                this.field265 = this.field265 + (char) var9;
                            }
                            if (this.field265.length() > 12) {
                                this.field265 = this.field265.substring(0, 12);
                            }
                        } else if (this.field575 == 1) {
                            if (var9 == 8 && this.field266.length() > 0) {
                                this.field266 = this.field266.substring(0, this.field266.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field575 = 0;
                            }
                            if (var10) {
                                this.field266 = this.field266 + (char) var9;
                            }
                            if (this.field266.length() > 20) {
                                this.field266 = this.field266.substring(0, 20);
                            }
                        }
                    }
                }
            } else {
                if (this.field107 == 3) {
                    int var12 = super.field23 / 2;
                    int var13 = super.field24 / 2 + 50;
                    int var18 = var13 + 20;
                    if (super.field39 == 1 && super.field40 >= var12 - 75 && super.field40 <= var12 + 75 && super.field41 >= var18 - 20 && super.field41 <= var18 + 20) {
                        this.field107 = 0;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method33(boolean arg0) {
        for (int var2 = 0; var2 < this.field406; ++var2) {
            if (this.field334[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field301[var2] == this.field497 && this.field499[var2] == this.field357) {
                        if (!this.method114(-23841)) {
                            var3 = true;
                        }
                    } else {
                        class37 var4 = class7.method172(this.field301[var2], this.field499[var2], (byte) 0);
                        if (System.currentTimeMillis() + (long) (var4.field1212 / 22) > (long) (this.field283 / 22) + this.field461) {
                            this.field283 = var4.field1212;
                            this.field461 = System.currentTimeMillis();
                            if (this.method122(this.field374, var4.field1212, var4.field1211)) {
                                this.field497 = this.field301[var2];
                                this.field357 = this.field499[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var8) {
                    if (signlink.reporterror) {
                        this.field466.method375(60, this.field496);
                        this.field466.method377(this.field301[var2] & 32767);
                    } else {
                        this.field466.method375(60, this.field496);
                        this.field466.method377(-1);
                    }
                }
                if (var3 && this.field334[var2] != -5) {
                    this.field334[var2] = -5;
                } else {
                    --this.field406;
                    for (int var6 = var2; var6 < this.field406; ++var6) {
                        this.field301[var6] = this.field301[var6 + 1];
                        this.field499[var6] = this.field499[var6 + 1];
                        this.field334[var6] = this.field334[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field334[var2]--;
            }
        }
        if (arg0) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        ++field528;
        if (field528 > 70) {
            field528 = 0;
            this.field466.method375(36, this.field496);
        }
        if (this.field540 > 0) {
            this.field540 -= 20;
            if (this.field540 < 0) {
                this.field540 = 0;
            }
            if (this.field540 == 0 && this.field560 && !field386) {
                this.field526 = this.field323;
                this.field527 = true;
                this.field132.method533(2, this.field526);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILMNKDCXXG;)V")
    private final void method34(int arg0, int arg1, class37 arg2) {
        int var4 = arg2.method397(8, 4);
        if (var4 < this.field293) {
            for (int var5 = var4; var5 < this.field293; ++var5) {
                this.field533[this.field532++] = this.field294[var5];
            }
        }
        if (var4 > this.field293) {
            signlink.reporterror(this.field265 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field293 = 0;
            int var6 = 45 / arg0;
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field294[var7];
                class6 var9 = this.field292[var8];
                int var10 = arg2.method397(1, 4);
                if (var10 == 0) {
                    this.field294[this.field293++] = var8;
                    var9.field699 = field542;
                } else {
                    int var11 = arg2.method397(2, 4);
                    if (var11 == 0) {
                        this.field294[this.field293++] = var8;
                        var9.field699 = field542;
                        this.field296[this.field295++] = var8;
                    } else if (var11 == 1) {
                        this.field294[this.field293++] = var8;
                        var9.field699 = field542;
                        int var12 = arg2.method397(3, 4);
                        var9.method206((byte) 8, var12, false);
                        int var13 = arg2.method397(1, 4);
                        if (var13 == 1) {
                            this.field296[this.field295++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field294[this.field293++] = var8;
                        var9.field699 = field542;
                        int var14 = arg2.method397(3, 4);
                        var9.method206((byte) 8, var14, true);
                        int var15 = arg2.method397(3, 4);
                        var9.method206((byte) 8, var15, true);
                        int var16 = arg2.method397(1, 4);
                        if (var16 == 1) {
                            this.field296[this.field295++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field533[this.field532++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILMNKDCXXG;I)V")
    private final void method35(int arg0, class37 arg1, int arg2) {
        for (int var4 = 0; var4 < this.field295; ++var4) {
            int var6 = this.field296[var4];
            class6 var7 = this.field292[var6];
            int var8 = arg1.method386();
            if ((var8 & 1) != 0) {
                var8 += arg1.method386() << 8;
            }
            this.method74(2, var7, var8, arg1, var6);
        }
        int var5 = 42 / arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLMNKDCXXG;I)V")
    private final void method36(boolean arg0, class37 arg1, int arg2) {
        while (true) {
            if (arg1.field1213 + 21 < arg2 * 8) {
                int var4 = arg1.method397(14, 4);
                if (var4 != 16383) {
                    if (this.field395[var4] == null) {
                        this.field395[var4] = new class70();
                    }
                    class70 var5 = this.field395[var4];
                    this.field397[this.field396++] = var4;
                    var5.field699 = field542;
                    int var6 = arg1.method397(1, 4);
                    int var7 = arg1.method397(5, 4);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg1.method397(1, 4);
                    if (var8 == 1) {
                        this.field296[this.field295++] = var4;
                    }
                    int var9 = arg1.method397(5, 4);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.field1736 = class45.method442(arg1.method397(13, 4));
                    var5.field678 = var5.field1736.field1300;
                    var5.field702 = var5.field1736.field1307;
                    var5.field684 = var5.field1736.field1289;
                    var5.field685 = var5.field1736.field1283;
                    var5.field686 = var5.field1736.field1308;
                    var5.field687 = var5.field1736.field1310;
                    var5.field716 = var5.field1736.field1319;
                    var5.method204(field254.field682[0] + var7, var6 == 1, field254.field681[0] + var9, true);
                    continue;
                }
            }
            arg1.method398(0);
            if (arg0) {
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method37(int arg0) {
        this.field344 += arg0;
        if (field386 && this.field325 == 2 && class65.field1652 != this.field459) {
            this.method119((String) null, this.field398, "Loading - please wait.");
            this.field325 = 1;
            this.field269 = System.currentTimeMillis();
        }
        if (this.field325 == 1) {
            int var2 = this.method38(false);
            if (var2 != 0 && System.currentTimeMillis() - this.field269 > 360000L) {
                signlink.reporterror(this.field265 + " glcfb " + this.field518 + "," + var2 + "," + field386 + "," + this.field467[0] + "," + this.field132.method526() + "," + this.field459 + "," + this.field577 + "," + this.field578);
                this.field269 = System.currentTimeMillis();
            }
        }
        if (this.field325 == 2 && this.field459 != this.field239) {
            this.field239 = this.field459;
            this.method87(this.field459, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)I")
    public final int method38(boolean arg0) {
        for (int var2 = 0; var2 < this.field446.length; ++var2) {
            if (this.field446[var2] == null && this.field477[var2] != -1) {
                return -1;
            }
            if (this.field205[var2] == null && this.field478[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        if (arg0) {
            this.field496 = -93;
        }
        for (int var4 = 0; var4 < this.field446.length; ++var4) {
            byte[] var5 = this.field205[var4];
            if (var5 != null) {
                int var6 = (this.field476[var4] >> 8) * 64 - this.field358;
                int var7 = (this.field476[var4] & 255) * 64 - this.field359;
                if (this.field82) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class65.method570(var7, var5, -479, var6);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field336) {
            return -4;
        } else {
            this.field325 = 2;
            class65.field1652 = this.field459;
            this.method58(false);
            this.field466.method375(95, this.field496);
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method39(int arg0) {
        ++field541;
        if (field541 > 170) {
            field541 = 0;
            this.field466.method375(127, this.field496);
            this.field466.method380(0);
        }
        for (int var2 = 0; var2 < this.field396; ++var2) {
            int var3 = this.field397[var2];
            class70 var4 = this.field395[var3];
            if (var4 != null) {
                this.method40(var4.field1736.field1300, -46103, var4);
            }
        }
        if (arg0 != -1632) {
            this.field466.method376(59);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILFHOAYGUJ;)V")
    public final void method40(int arg0, int arg1, class16 arg2) {
        if (arg2.field706 < 128 || arg2.field707 < 128 || arg2.field706 >= 13184 || arg2.field707 >= 13184) {
            arg2.field693 = -1;
            arg2.field710 = -1;
            arg2.field675 = 0;
            arg2.field676 = 0;
            arg2.field706 = arg2.field681[0] * 128 + arg2.field678 * 64;
            arg2.field707 = arg2.field682[0] * 128 + arg2.field678 * 64;
            arg2.method203((byte) -32);
        }
        if (field254 == arg2 && (arg2.field706 < 1536 || arg2.field707 < 1536 || arg2.field706 >= 11776 || arg2.field707 >= 11776)) {
            arg2.field693 = -1;
            arg2.field710 = -1;
            arg2.field675 = 0;
            arg2.field676 = 0;
            arg2.field706 = arg2.field681[0] * 128 + arg2.field678 * 64;
            arg2.field707 = arg2.field682[0] * 128 + arg2.field678 * 64;
            arg2.method203((byte) -32);
        }
        if (arg2.field675 > field542) {
            this.method41(-62, arg2);
        } else if (arg2.field676 >= field542) {
            this.method42(arg2, -907);
        } else {
            this.method43(arg2, (byte) 3);
        }
        this.method44(false, arg2);
        this.method45(arg2, this.field85);
        if (this.field524 != arg1) {
            this.method6();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILFHOAYGUJ;)V")
    public final void method41(int arg0, class16 arg1) {
        int var3 = arg1.field675 - field542;
        int var4 = arg1.field678 * 64 + arg1.field671 * 128;
        int var5 = arg1.field678 * 64 + arg1.field673 * 128;
        arg1.field706 += (var4 - arg1.field706) / var3;
        arg1.field707 += (var5 - arg1.field707) / var3;
        if (arg0 >= 0) {
            this.method6();
        }
        arg1.field666 = 0;
        if (arg1.field677 == 0) {
            arg1.field709 = 1024;
        }
        if (arg1.field677 == 1) {
            arg1.field709 = 1536;
        }
        if (arg1.field677 == 2) {
            arg1.field709 = 0;
        }
        if (arg1.field677 == 3) {
            arg1.field709 = 512;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LFHOAYGUJ;I)V")
    public final void method42(class16 arg0, int arg1) {
        if (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (field542 == arg0.field676 || arg0.field693 == -1 || arg0.field696 != 0 || arg0.field695 + 1 > class47.field1336[arg0.field693].method451(13126, arg0.field694)) {
            int var4 = arg0.field676 - arg0.field675;
            int var5 = field542 - arg0.field675;
            int var6 = arg0.field678 * 64 + arg0.field671 * 128;
            int var7 = arg0.field678 * 64 + arg0.field673 * 128;
            int var8 = arg0.field678 * 64 + arg0.field672 * 128;
            int var9 = arg0.field678 * 64 + arg0.field674 * 128;
            arg0.field706 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg0.field707 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg0.field666 = 0;
        if (arg0.field677 == 0) {
            arg0.field709 = 1024;
        }
        if (arg0.field677 == 1) {
            arg0.field709 = 1536;
        }
        if (arg0.field677 == 2) {
            arg0.field709 = 0;
        }
        if (arg0.field677 == 3) {
            arg0.field709 = 512;
        }
        arg0.field708 = arg0.field709;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LFHOAYGUJ;B)V")
    public final void method43(class16 arg0, byte arg1) {
        arg0.field668 = arg0.field716;
        if (arg0.field715 == 0) {
            arg0.field666 = 0;
        } else {
            if (arg0.field693 != -1 && arg0.field696 == 0) {
                class47 var3 = class47.field1336[arg0.field693];
                if (arg0.field692 > 0 && var3.field1348 == 0) {
                    ++arg0.field666;
                    return;
                }
                if (arg0.field692 <= 0 && var3.field1349 == 0) {
                    ++arg0.field666;
                    return;
                }
            }
            int var4 = arg0.field706;
            int var5 = arg0.field707;
            if (arg1 == 3) {
                int var6 = arg0.field681[arg0.field715 - 1] * 128 + arg0.field678 * 64;
                int var7 = arg0.field682[arg0.field715 - 1] * 128 + arg0.field678 * 64;
                if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                    if (var4 < var6) {
                        if (var5 < var7) {
                            arg0.field709 = 1280;
                        } else if (var5 > var7) {
                            arg0.field709 = 1792;
                        } else {
                            arg0.field709 = 1536;
                        }
                    } else if (var4 > var6) {
                        if (var5 < var7) {
                            arg0.field709 = 768;
                        } else if (var5 > var7) {
                            arg0.field709 = 256;
                        } else {
                            arg0.field709 = 512;
                        }
                    } else if (var5 < var7) {
                        arg0.field709 = 1024;
                    } else {
                        arg0.field709 = 0;
                    }
                    int var8 = arg0.field709 - arg0.field708 & 2047;
                    if (var8 > 1024) {
                        var8 -= 2048;
                    }
                    int var9 = arg0.field685;
                    if (var8 >= -256 && var8 <= 256) {
                        var9 = arg0.field684;
                    } else if (var8 >= 256 && var8 < 768) {
                        var9 = arg0.field687;
                    } else if (var8 >= -768 && var8 <= -256) {
                        var9 = arg0.field686;
                    }
                    if (var9 == -1) {
                        var9 = arg0.field684;
                    }
                    arg0.field668 = var9;
                    int var10 = 4;
                    if (arg0.field709 != arg0.field708 && arg0.field688 == -1 && arg0.field702 != 0) {
                        var10 = 2;
                    }
                    if (arg0.field715 > 2) {
                        var10 = 6;
                    }
                    if (arg0.field715 > 3) {
                        var10 = 8;
                    }
                    if (arg0.field666 > 0 && arg0.field715 > 1) {
                        var10 = 8;
                        --arg0.field666;
                    }
                    if (arg0.field718[arg0.field715 - 1]) {
                        var10 <<= 1;
                    }
                    if (var10 >= 8 && arg0.field684 == arg0.field668 && arg0.field683 != -1) {
                        arg0.field668 = arg0.field683;
                    }
                    if (var4 < var6) {
                        arg0.field706 += var10;
                        if (arg0.field706 > var6) {
                            arg0.field706 = var6;
                        }
                    } else if (var4 > var6) {
                        arg0.field706 -= var10;
                        if (arg0.field706 < var6) {
                            arg0.field706 = var6;
                        }
                    }
                    if (var5 < var7) {
                        arg0.field707 += var10;
                        if (arg0.field707 > var7) {
                            arg0.field707 = var7;
                        }
                    } else if (var5 > var7) {
                        arg0.field707 -= var10;
                        if (arg0.field707 < var7) {
                            arg0.field707 = var7;
                        }
                    }
                    if (arg0.field706 == var6 && arg0.field707 == var7) {
                        --arg0.field715;
                        if (arg0.field692 > 0) {
                            --arg0.field692;
                            return;
                        }
                    }
                } else {
                    arg0.field706 = var6;
                    arg0.field707 = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLFHOAYGUJ;)V")
    public final void method44(boolean arg0, class16 arg1) {
        if (arg0) {
            this.field243 = this.field156.method514();
        }
        if (arg1.field702 != 0) {
            if (arg1.field688 != -1 && arg1.field688 < 32768) {
                class70 var3 = this.field395[arg1.field688];
                if (var3 != null) {
                    int var4 = arg1.field706 - var3.field706;
                    int var5 = arg1.field707 - var3.field707;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field709 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field688 >= 32768) {
                int var6 = arg1.field688 - 32768;
                if (this.field365 == var6) {
                    var6 = this.field291;
                }
                class6 var7 = this.field292[var6];
                if (var7 != null) {
                    int var8 = arg1.field706 - var7.field706;
                    int var9 = arg1.field707 - var7.field707;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field709 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field700 != 0 || arg1.field701 != 0) && (arg1.field715 == 0 || arg1.field666 > 0)) {
                int var10 = arg1.field706 - (arg1.field700 - this.field358 - this.field358) * 64;
                int var11 = arg1.field707 - (arg1.field701 - this.field359 - this.field359) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field709 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field700 = 0;
                arg1.field701 = 0;
            }
            int var12 = arg1.field709 - arg1.field708 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field702 && var12 <= 2048 - arg1.field702) {
                    if (var12 > 1024) {
                        arg1.field708 -= arg1.field702;
                    } else {
                        arg1.field708 += arg1.field702;
                    }
                } else {
                    arg1.field708 = arg1.field709;
                }
                arg1.field708 &= 2047;
                if (arg1.field716 == arg1.field668 && arg1.field709 != arg1.field708) {
                    if (arg1.field717 != -1) {
                        arg1.field668 = arg1.field717;
                        return;
                    }
                    arg1.field668 = arg1.field684;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LFHOAYGUJ;Z)V")
    public final void method45(class16 arg0, boolean arg1) {
        this.field405 &= arg1;
        arg0.field698 = false;
        if (arg0.field668 != -1) {
            class47 var3 = class47.field1336[arg0.field668];
            ++arg0.field670;
            if (arg0.field669 < var3.field1337 && arg0.field670 > var3.method451(13126, arg0.field669)) {
                arg0.field670 = 0;
                ++arg0.field669;
            }
            if (arg0.field669 >= var3.field1337) {
                arg0.field670 = 0;
                arg0.field669 = 0;
            }
        }
        if (arg0.field710 != -1 && field542 >= arg0.field713) {
            if (arg0.field711 < 0) {
                arg0.field711 = 0;
            }
            class47 var4 = class44.field1269[arg0.field710].field1273;
            ++arg0.field712;
            while (arg0.field711 < var4.field1337 && arg0.field712 > var4.method451(13126, arg0.field711)) {
                arg0.field712 -= var4.method451(13126, arg0.field711);
                ++arg0.field711;
            }
            if (arg0.field711 >= var4.field1337 && (arg0.field711 < 0 || arg0.field711 >= var4.field1337)) {
                arg0.field710 = -1;
            }
        }
        if (arg0.field693 != -1 && arg0.field696 <= 1) {
            class47 var5 = class47.field1336[arg0.field693];
            if (var5.field1348 == 1 && arg0.field692 > 0 && arg0.field675 <= field542 && arg0.field676 < field542) {
                arg0.field696 = 1;
                return;
            }
        }
        if (arg0.field693 != -1 && arg0.field696 == 0) {
            class47 var6 = class47.field1336[arg0.field693];
            ++arg0.field695;
            while (arg0.field694 < var6.field1337 && arg0.field695 > var6.method451(13126, arg0.field694)) {
                arg0.field695 -= var6.method451(13126, arg0.field694);
                ++arg0.field694;
            }
            if (arg0.field694 >= var6.field1337) {
                arg0.field694 -= var6.field1341;
                ++arg0.field697;
                if (arg0.field697 >= var6.field1347) {
                    arg0.field693 = -1;
                }
                if (arg0.field694 < 0 || arg0.field694 >= var6.field1337) {
                    arg0.field693 = -1;
                }
            }
            arg0.field698 = var6.field1343;
        }
        if (arg0.field696 > 0) {
            --arg0.field696;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method46(byte arg0) {
        if (arg0 != 74) {
            this.field118 = null;
        }
        if (this.field472 != -1 && (this.field325 == 2 || super.field26 != null)) {
            if (this.field325 == 2) {
                this.method154(this.field321, this.field472, 494);
                if (this.field337 != -1) {
                    this.method154(this.field321, this.field337, 494);
                }
                this.field321 = 0;
                this.method53(this.field522);
                super.field26.method360(-921);
                class54.field1474 = this.field196;
                class52.method482(-837);
                this.field377 = true;
                class25 var2 = class25.method276(this.field472);
                if (var2.field933 == 512 && var2.field960 == 334 && var2.field957 == 0) {
                    var2.field933 = 765;
                    var2.field960 = 503;
                }
                this.method105(0, var2, 0, (byte) -21, 0);
                if (this.field337 != -1) {
                    class25 var3 = class25.method276(this.field337);
                    if (var3.field933 == 512 && var3.field960 == 334 && var3.field957 == 0) {
                        var3.field933 = 765;
                        var3.field960 = 503;
                    }
                    this.method105(0, var3, 0, (byte) -21, 0);
                }
                if (!this.field408) {
                    this.method128((byte) 4);
                    this.method100(this.field549);
                } else {
                    this.method60(0);
                }
            }
            super.field26.method361(super.field25, 0, 0, (byte) 1);
        } else {
            if (this.field377) {
                this.method142(0);
                this.field377 = false;
                this.field409.method361(super.field25, 0, 4, (byte) 1);
                this.field410.method361(super.field25, 0, 357, (byte) 1);
                this.field411.method361(super.field25, 722, 4, (byte) 1);
                this.field412.method361(super.field25, 743, 205, (byte) 1);
                this.field413.method361(super.field25, 0, 0, (byte) 1);
                this.field414.method361(super.field25, 516, 4, (byte) 1);
                this.field415.method361(super.field25, 516, 205, (byte) 1);
                this.field416.method361(super.field25, 496, 357, (byte) 1);
                this.field417.method361(super.field25, 0, 338, (byte) 1);
                this.field268 = true;
                this.field350 = true;
                this.field78 = true;
                this.field238 = true;
                if (this.field325 != 2) {
                    this.field178.method361(super.field25, 4, 4, (byte) 1);
                    this.field177.method361(super.field25, 550, 4, (byte) 1);
                }
            }
            if (this.field325 == 2) {
                this.method149(704);
            }
            if (this.field408 && this.field87 == 1) {
                this.field268 = true;
            }
            if (this.field229 != -1) {
                boolean var4 = this.method154(this.field321, this.field229, 494);
                if (var4) {
                    this.field268 = true;
                }
            }
            if (this.field511 == 2) {
                this.field268 = true;
            }
            if (this.field456 == 2) {
                this.field268 = true;
            }
            if (this.field268) {
                this.method104(0);
                this.field268 = false;
            }
            if (this.field352 == -1 && this.field160 == 0) {
                this.field117.field906 = this.field223 - this.field262 - 77;
                if (super.field33 > 448 && super.field33 < 560 && super.field34 > 332) {
                    this.method117(this.field223, super.field34 - 357, 77, -1, 0, this.field117, super.field33 - 17, 463, this.field216);
                }
                int var5 = this.field223 - 77 - this.field117.field906;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field223 - 77) {
                    var5 = this.field223 - 77;
                }
                if (this.field262 != var5) {
                    this.field262 = var5;
                    this.field350 = true;
                }
                ++field340;
                if (field340 > 1669) {
                    field340 = 0;
                    this.field466.method375(231, this.field496);
                    this.field466.method376(0);
                    int var6 = this.field466.field1212;
                    this.field466.method376((int) (Math.random() * 256.0D));
                    this.field466.method377(48380);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field466.method376(16);
                    }
                    this.field466.method377((int) (Math.random() * 65536.0D));
                    this.field466.method376(185);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field466.method376(239);
                    }
                    this.field466.method377(62945);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field466.method377(14921);
                    }
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field466.method377(5088);
                    }
                    this.field466.method377(14155);
                    this.field466.method385(true, this.field466.field1212 - var6);
                }
            }
            if (this.field352 == -1 && this.field160 == 3) {
                int var7 = this.field553 * 14 + 7;
                this.field117.field906 = this.field556;
                if (super.field33 > 448 && super.field33 < 560 && super.field34 > 332) {
                    this.method117(var7, super.field34 - 357, 77, -1, 0, this.field117, super.field33 - 17, 463, this.field216);
                }
                int var8 = this.field117.field906;
                if (var8 < 0) {
                    var8 = 0;
                }
                if (var8 > var7 - 77) {
                    var8 = var7 - 77;
                }
                if (this.field556 != var8) {
                    this.field556 = var8;
                    this.field350 = true;
                }
            }
            if (this.field352 != -1) {
                boolean var9 = this.method154(this.field321, this.field352, 494);
                if (var9) {
                    this.field350 = true;
                }
            }
            if (this.field511 == 3) {
                this.field350 = true;
            }
            if (this.field456 == 3) {
                this.field350 = true;
            }
            if (this.field219 != null) {
                this.field350 = true;
            }
            if (this.field408 && this.field87 == 2) {
                this.field350 = true;
            }
            if (this.field350) {
                this.method165(false);
                this.field350 = false;
            }
            if (this.field325 == 2) {
                this.method146((byte) 51);
                this.field177.method361(super.field25, 550, 4, (byte) 1);
            }
            if (this.field368 != -1) {
                this.field78 = true;
            }
            if (this.field78) {
                if (this.field368 != -1 && this.field368 == this.field270) {
                    this.field368 = -1;
                    this.field466.method375(244, this.field496);
                    this.field466.method376(this.field270);
                }
                this.field78 = false;
                this.field443.method360(-921);
                this.field252.method20(48946, 0, 0);
                if (this.field229 == -1) {
                    if (this.field278[this.field270] != -1) {
                        if (this.field270 == 0) {
                            this.field271.method20(48946, 10, 22);
                        }
                        if (this.field270 == 1) {
                            this.field272.method20(48946, 8, 54);
                        }
                        if (this.field270 == 2) {
                            this.field272.method20(48946, 8, 82);
                        }
                        if (this.field270 == 3) {
                            this.field273.method20(48946, 8, 110);
                        }
                        if (this.field270 == 4) {
                            this.field275.method20(48946, 8, 153);
                        }
                        if (this.field270 == 5) {
                            this.field275.method20(48946, 8, 181);
                        }
                        if (this.field270 == 6) {
                            this.field274.method20(48946, 9, 209);
                        }
                    }
                    if (this.field278[0] != -1 && (this.field368 != 0 || field542 % 20 < 10)) {
                        this.field127[0].method20(48946, 13, 29);
                    }
                    if (this.field278[1] != -1 && (this.field368 != 1 || field542 % 20 < 10)) {
                        this.field127[1].method20(48946, 11, 53);
                    }
                    if (this.field278[2] != -1 && (this.field368 != 2 || field542 % 20 < 10)) {
                        this.field127[2].method20(48946, 11, 82);
                    }
                    if (this.field278[3] != -1 && (this.field368 != 3 || field542 % 20 < 10)) {
                        this.field127[3].method20(48946, 12, 115);
                    }
                    if (this.field278[4] != -1 && (this.field368 != 4 || field542 % 20 < 10)) {
                        this.field127[4].method20(48946, 13, 153);
                    }
                    if (this.field278[5] != -1 && (this.field368 != 5 || field542 % 20 < 10)) {
                        this.field127[5].method20(48946, 11, 180);
                    }
                    if (this.field278[6] != -1 && (this.field368 != 6 || field542 % 20 < 10)) {
                        this.field127[6].method20(48946, 13, 208);
                    }
                }
                this.field443.method361(super.field25, 516, 160, (byte) 1);
                this.field442.method360(-921);
                this.field251.method20(48946, 0, 0);
                if (this.field229 == -1) {
                    if (this.field278[this.field270] != -1) {
                        if (this.field270 == 7) {
                            this.field389.method20(48946, 0, 42);
                        }
                        if (this.field270 == 8) {
                            this.field390.method20(48946, 0, 74);
                        }
                        if (this.field270 == 9) {
                            this.field390.method20(48946, 0, 102);
                        }
                        if (this.field270 == 10) {
                            this.field391.method20(48946, 1, 130);
                        }
                        if (this.field270 == 11) {
                            this.field393.method20(48946, 0, 173);
                        }
                        if (this.field270 == 12) {
                            this.field393.method20(48946, 0, 201);
                        }
                        if (this.field270 == 13) {
                            this.field392.method20(48946, 0, 229);
                        }
                    }
                    if (this.field278[8] != -1 && (this.field368 != 8 || field542 % 20 < 10)) {
                        this.field127[7].method20(48946, 2, 74);
                    }
                    if (this.field278[9] != -1 && (this.field368 != 9 || field542 % 20 < 10)) {
                        this.field127[8].method20(48946, 3, 102);
                    }
                    if (this.field278[10] != -1 && (this.field368 != 10 || field542 % 20 < 10)) {
                        this.field127[9].method20(48946, 4, 137);
                    }
                    if (this.field278[11] != -1 && (this.field368 != 11 || field542 % 20 < 10)) {
                        this.field127[10].method20(48946, 2, 174);
                    }
                    if (this.field278[12] != -1 && (this.field368 != 12 || field542 % 20 < 10)) {
                        this.field127[11].method20(48946, 2, 201);
                    }
                    if (this.field278[13] != -1 && (this.field368 != 13 || field542 % 20 < 10)) {
                        this.field127[12].method20(48946, 2, 226);
                    }
                }
                this.field442.method361(super.field25, 496, 466, (byte) 1);
                this.field178.method360(-921);
                class54.field1474 = this.field195;
            }
            if (this.field238) {
                this.field238 = false;
                this.field441.method360(-921);
                this.field250.method20(48946, 0, 0);
                this.field545.method586(16777215, true, 28, (byte) 5, 55, "Public chat");
                if (this.field185 == 0) {
                    this.field545.method586(65280, true, 41, (byte) 5, 55, "On");
                }
                if (this.field185 == 1) {
                    this.field545.method586(16776960, true, 41, (byte) 5, 55, "Friends");
                }
                if (this.field185 == 2) {
                    this.field545.method586(16711680, true, 41, (byte) 5, 55, "Off");
                }
                if (this.field185 == 3) {
                    this.field545.method586(65535, true, 41, (byte) 5, 55, "Hide");
                }
                this.field545.method586(16777215, true, 28, (byte) 5, 184, "Private chat");
                if (this.field538 == 0) {
                    this.field545.method586(65280, true, 41, (byte) 5, 184, "On");
                }
                if (this.field538 == 1) {
                    this.field545.method586(16776960, true, 41, (byte) 5, 184, "Friends");
                }
                if (this.field538 == 2) {
                    this.field545.method586(16711680, true, 41, (byte) 5, 184, "Off");
                }
                this.field545.method586(16777215, true, 28, (byte) 5, 324, "Trade/compete");
                if (this.field129 == 0) {
                    this.field545.method586(65280, true, 41, (byte) 5, 324, "On");
                }
                if (this.field129 == 1) {
                    this.field545.method586(16776960, true, 41, (byte) 5, 324, "Friends");
                }
                if (this.field129 == 2) {
                    this.field545.method586(16711680, true, 41, (byte) 5, 324, "Off");
                }
                this.field545.method586(16777215, true, 33, (byte) 5, 458, "Report abuse");
                this.field441.method361(super.field25, 0, 453, (byte) 1);
                this.field178.method360(-921);
                class54.field1474 = this.field195;
            }
            this.field321 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method47(byte arg0) {
        int var2 = this.field206 * 128 + 64;
        int var3 = this.field207 * 128 + 64;
        int var4 = this.method153(var3, var2, -926, this.field459) - this.field208;
        if (this.field480 < var2) {
            this.field480 += (var2 - this.field480) * this.field210 / 1000 + this.field209;
            if (this.field480 > var2) {
                this.field480 = var2;
            }
        }
        if (this.field480 > var2) {
            this.field480 -= (this.field480 - var2) * this.field210 / 1000 + this.field209;
            if (this.field480 < var2) {
                this.field480 = var2;
            }
        }
        if (this.field481 < var4) {
            this.field481 += (var4 - this.field481) * this.field210 / 1000 + this.field209;
            if (this.field481 > var4) {
                this.field481 = var4;
            }
        }
        if (this.field481 > var4) {
            this.field481 -= (this.field481 - var4) * this.field210 / 1000 + this.field209;
            if (this.field481 < var4) {
                this.field481 = var4;
            }
        }
        if (this.field482 < var3) {
            this.field482 += (var3 - this.field482) * this.field210 / 1000 + this.field209;
            if (this.field482 > var3) {
                this.field482 = var3;
            }
        }
        if (this.field482 > var3) {
            this.field482 -= (this.field482 - var3) * this.field210 / 1000 + this.field209;
            if (this.field482 < var3) {
                this.field482 = var3;
            }
        }
        int var5 = this.field432 * 128 + 64;
        int var6 = this.field433 * 128 + 64;
        int var7 = this.method153(var6, var5, -926, this.field459) - this.field434;
        int var8 = var5 - this.field480;
        int var9 = var7 - this.field481;
        int var10 = var6 - this.field482;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        if (this.field534 != arg0) {
            this.field345 = this.field462.method386();
        }
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field483 < var12) {
            this.field483 += (var12 - this.field483) * this.field436 / 1000 + this.field435;
            if (this.field483 > var12) {
                this.field483 = var12;
            }
        }
        if (this.field483 > var12) {
            this.field483 -= (this.field483 - var12) * this.field436 / 1000 + this.field435;
            if (this.field483 < var12) {
                this.field483 = var12;
            }
        }
        int var14 = var13 - this.field484;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field484 += this.field436 * var14 / 1000 + this.field435;
            this.field484 &= 2047;
        }
        if (var14 < 0) {
            this.field484 -= -var14 * this.field436 / 1000 + this.field435;
            this.field484 &= 2047;
        }
        int var15 = var13 - this.field484;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field484 = var13;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LIJOSTBQT;B)Z")
    public final boolean method48(class25 arg0, byte arg1) {
        int var3 = arg0.field951;
        if (arg1 != 56) {
            this.field345 = -1;
        }
        if (this.field198 == 2) {
            if (var3 == 201) {
                this.field350 = true;
                this.field160 = 0;
                this.field557 = true;
                this.field567 = "";
                this.field300 = 1;
                this.field536 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field350 = true;
                this.field160 = 0;
                this.field557 = true;
                this.field567 = "";
                this.field300 = 2;
                this.field536 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field348 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field350 = true;
                this.field160 = 0;
                this.field557 = true;
                this.field567 = "";
                this.field300 = 4;
                this.field536 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field350 = true;
                this.field160 = 0;
                this.field557 = true;
                this.field567 = "";
                this.field300 = 5;
                this.field536 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field163[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class46.field1325 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class46.field1325) {
                                var6 = 0;
                            }
                        }
                        if (!class46.field1326[var6].field1332 && class46.field1326[var6].field1327 == var4 + (this.field131 ? 0 : 7)) {
                            this.field163[var4] = var6;
                            this.field426 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field192[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field356[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field356[var7].length) {
                        var9 = 0;
                    }
                }
                this.field192[var7] = var9;
                this.field426 = true;
            }
            if (var3 == 324 && !this.field131) {
                this.field131 = true;
                this.method49(649);
            }
            if (var3 == 325 && this.field131) {
                this.field131 = false;
                this.method49(649);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field388 = !this.field388;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method52(927);
                    if (this.field573.length() > 0) {
                        this.field466.method375(153, this.field496);
                        this.field466.method382(class53.method491(this.field573), this.field253);
                        this.field466.method376(var3 - 601);
                        this.field466.method376(this.field388 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field466.method375(219, this.field496);
                this.field466.method376(this.field131 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field466.method376(this.field163[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field466.method376(this.field192[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public final void method49(int arg0) {
        this.field426 = true;
        int var2 = 28 / arg0;
        for (int var3 = 0; var3 < 7; ++var3) {
            this.field163[var3] = -1;
            for (int var4 = 0; var4 < class46.field1325; ++var4) {
                if (!class46.field1326[var4].field1332 && class46.field1326[var4].field1327 == var3 + (this.field131 ? 0 : 7)) {
                    this.field163[var3] = var4;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    public final void method50(int arg0, int arg1) {
        if (arg0 < field289 || arg0 > field289) {
            field111 = !field111;
        }
        class25.method275(8, arg1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
    public final void method51(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg1 & 2047;
        int var9 = 2048 - arg2 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg4;
        if (var8 != 0) {
            int var13 = class26.field1054[var8];
            int var14 = class26.field1055[var8];
            int var15 = var11 * var14 - arg4 * var13 >> 16;
            var12 = var11 * var13 + arg4 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class26.field1054[var9];
            int var17 = class26.field1055[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field480 = arg3 - var10;
        this.field481 = arg0 - var11;
        this.field482 = arg5 - var12;
        if (arg6 != 8) {
            this.field475 = !this.field475;
        }
        this.field483 = arg1;
        this.field484 = arg2;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public final void method52(int arg0) {
        if (arg0 <= 0) {
            this.field345 = -1;
        }
        this.field466.method375(232, this.field496);
        if (this.field229 != -1) {
            this.method50(8, this.field229);
            this.field229 = -1;
            this.field268 = true;
            this.field530 = false;
            this.field78 = true;
        }
        if (this.field352 != -1) {
            this.method50(8, this.field352);
            this.field352 = -1;
            this.field350 = true;
            this.field530 = false;
        }
        if (this.field472 != -1) {
            this.method50(8, this.field472);
            this.field472 = -1;
            this.field377 = true;
        }
        if (this.field337 != -1) {
            this.method50(8, this.field337);
            this.field337 = -1;
        }
        if (this.field572 != -1) {
            this.method50(8, this.field572);
            this.field572 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public final void method53(int arg0) {
        int var2 = 79 / arg0;
        if (super.field26 == null) {
            this.method115(true);
            this.field308 = null;
            this.field309 = null;
            this.field310 = null;
            this.field311 = null;
            this.field312 = null;
            this.field313 = null;
            this.field314 = null;
            this.field315 = null;
            this.field316 = null;
            this.field179 = null;
            this.field177 = null;
            this.field176 = null;
            this.field178 = null;
            this.field441 = null;
            this.field442 = null;
            this.field443 = null;
            super.field26 = new class35(503, 0, 765, this.method11(735));
            this.field377 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
    public final void method54(byte arg0, boolean arg1) {
        if (field254.field706 >> 7 == this.field438 && field254.field707 >> 7 == this.field439) {
            this.field438 = 0;
        }
        int var3 = this.field293;
        if (arg1) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class6 var5;
            int var6;
            if (arg1) {
                var5 = field254;
                var6 = this.field291 << 14;
            } else {
                var5 = this.field292[this.field294[var4]];
                var6 = this.field294[var4] << 14;
            }
            if (var5 != null && var5.method166(5)) {
                var5.field596 = false;
                if ((field386 && this.field293 > 50 || this.field293 > 200) && !arg1 && var5.field716 == var5.field668) {
                    var5.field596 = true;
                }
                int var7 = var5.field706 >> 7;
                int var8 = var5.field707 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field601 != null && field542 >= var5.field609 && field542 < var5.field610) {
                        var5.field596 = false;
                        var5.field597 = this.method153(var5.field707, var5.field706, -926, this.field459);
                        this.field217.method228(var5.field707, -42932, var5.field587, var5.field706, this.field459, var5.field584, var5.field585, 60, var5.field586, var6, var5.field597, var5.field708, var5);
                    } else {
                        if ((var5.field706 & 127) == 64 && (var5.field707 & 127) == 64) {
                            if (this.field366[var7][var8] == this.field302) {
                                continue;
                            }
                            this.field366[var7][var8] = this.field302;
                        }
                        var5.field597 = this.method153(var5.field707, var5.field706, -926, this.field459);
                        this.field217.method227(60, var5.field708, this.field459, var5.field698, var5.field706, (byte) 9, var5, var5.field597, var5.field707, var6);
                    }
                }
            }
        }
        if (arg0 != -82) {
            this.method6();
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LIJOSTBQT;B)Z")
    public final boolean method55(class25 arg0, byte arg1) {
        int var3 = arg0.field951;
        if (arg1 != 0) {
            this.method6();
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field79[this.field537] = "Remove @whi@" + arg0.field949;
                this.field257[this.field537] = 305;
                ++this.field537;
                return true;
            } else {
                return false;
            }
        } else {
            if (var3 >= 801) {
                var3 -= 701;
            } else if (var3 >= 701) {
                var3 -= 601;
            } else if (var3 >= 101) {
                var3 -= 101;
            } else {
                --var3;
            }
            this.field79[this.field537] = "Remove @whi@" + this.field84[var3];
            this.field257[this.field537] = 953;
            ++this.field537;
            this.field79[this.field537] = "Message @whi@" + this.field84[var3];
            this.field257[this.field537] = 503;
            ++this.field537;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Ljava/lang/String;")
    private static final String method56(int arg0, int arg1) {
        if (arg1 < 0) {
            if (arg0 < 100000) {
                return String.valueOf(arg0);
            } else {
                return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
    public final void method57(int arg0, int arg1) {
        class61 var3 = this.field118[this.field459][arg0][arg1];
        if (var3 == null) {
            this.field217.method237(this.field459, arg0, arg1);
        } else {
            int var4 = -99999999;
            class15 var5 = null;
            for (class15 var6 = (class15) var3.method543(); var6 != null; var6 = (class15) var3.method545(907)) {
                class50 var11 = class50.method475(var6.field665);
                int var12 = var11.field1380;
                if (var11.field1403) {
                    var12 = (var6.field664 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method541(this.field260, var5);
            class15 var7 = null;
            class15 var8 = null;
            for (class15 var9 = (class15) var3.method543(); var9 != null; var9 = (class15) var3.method545(907)) {
                if (var5.field665 != var9.field665 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field665 != var9.field665 && var7.field665 != var9.field665 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field217.method223(0, var7, this.field459, var8, var10, arg1, arg0, var5, this.method153(arg1 * 128 + 64, arg0 * 128 + 64, -926, this.field459));
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        try {
            this.field239 = -1;
            this.field453.method547();
            this.field437.method547();
            ++field400;
            if (field400 > 142) {
                field400 = 0;
                this.field466.method375(140, this.field496);
                this.field466.method376(232);
            }
            class54.method500(this.field174);
            this.method72((byte) 103);
            this.field217.method216(1785);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field571[var2].method191();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field460[var3][var4][var5] = 0;
                    }
                }
            }
            class65 var6 = new class65(this.field558, 104, this.field460, 104, true);
            int var7 = this.field446.length;
            this.field466.method375(71, this.field496);
            if (!this.field82) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field476[var8] >> 8) * 64 - this.field358;
                    int var10 = (this.field476[var8] & 255) * 64 - this.field359;
                    byte[] var11 = this.field446[var8];
                    if (var11 != null) {
                        var6.method565(var9, (this.field577 - 6) * 8, var11, this.field571, this.field224, (this.field578 - 6) * 8, var10);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field476[var12] >> 8) * 64 - this.field358;
                    int var14 = (this.field476[var12] & 255) * 64 - this.field359;
                    byte[] var15 = this.field446[var12];
                    if (var15 == null && this.field578 < 800) {
                        var6.method563(var14, 33376, 64, var13, 64);
                    }
                }
                this.field466.method375(71, this.field496);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field205[var16];
                    if (var17 != null) {
                        int var18 = (this.field476[var16] >> 8) * 64 - this.field358;
                        int var19 = (this.field476[var16] & 255) * 64 - this.field359;
                        var6.method564(var19, var17, true, this.field217, this.field571, var18);
                    }
                }
            }
            if (this.field82) {
                int var20 = 0;
                label265: while (true) {
                    if (var20 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field341[0][var31][var32];
                                if (var33 == -1) {
                                    var6.method563(var32 * 8, 33376, 8, var31 * 8, 8);
                                }
                            }
                        }
                        this.field466.method375(71, this.field496);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label265;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field341[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field476.length; ++var43) {
                                            if (this.field476[var43] == var42 && this.field205[var43] != null) {
                                                var6.method577(var36 * 8, this.field571, var35 * 8, (var40 & 7) * 8, var34, var38, (var41 & 7) * 8, this.field205[var43], this.field486, this.field217, var39);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            ++var34;
                        }
                    }
                    for (int var21 = 0; var21 < 13; ++var21) {
                        for (int var22 = 0; var22 < 13; ++var22) {
                            boolean var23 = false;
                            int var24 = this.field341[var20][var21][var22];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field476.length; ++var30) {
                                    if (this.field476[var30] == var29 && this.field446[var30] != null) {
                                        var6.method572(var20, var22 * 8, this.field571, this.field446[var30], var25, (var28 & 7) * 8, (var27 & 7) * 8, var21 * 8, var26, 8);
                                        var23 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var23) {
                                var6.method582(var21 * 8, var20, 2, var22 * 8);
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field466.method375(71, this.field496);
            var6.method567(this.field217, 7, this.field571);
            if (this.field178 != null) {
                this.field178.method360(-921);
                class54.field1474 = this.field195;
            }
            this.field466.method375(71, this.field496);
            int var44 = class65.field1662;
            if (var44 > this.field459) {
                var44 = this.field459;
            }
            if (var44 < this.field459 - 1) {
                int var45 = this.field459 - 1;
            }
            if (field386) {
                this.field217.method217(class65.field1662, 49618);
            } else {
                this.field217.method217(0, 49618);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method57(var46, var47);
                }
            }
            this.method65(this.field109);
        } catch (Exception var60) {
        }
        class36.field1152.method429();
        if (super.field28 != null) {
            this.field466.method375(63, this.field496);
            this.field466.method380(1057001181);
        }
        if (field386 && signlink.cache_dat != null) {
            int var49 = this.field132.method531((byte) 69, 0);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field132.method525(false, var50);
                if ((var51 & 121) == 0) {
                    class26.method280(var50, -5970);
                }
            }
        }
        System.gc();
        class54.method501(20, (byte) 2);
        this.field132.method517(0);
        int var52 = (this.field577 - 6) / 8 - 1;
        int var53 = (this.field577 + 6) / 8 + 1;
        int var54 = (this.field578 - 6) / 8 - 1;
        int var55 = (this.field578 + 6) / 8 + 1;
        if (arg0) {
            this.field475 = !this.field475;
        }
        if (this.field324) {
            var52 = 49;
            var53 = 50;
            var54 = 49;
            var55 = 50;
        }
        for (int var56 = var52; var56 <= var53; ++var56) {
            for (int var57 = var54; var57 <= var55; ++var57) {
                if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                    int var58 = this.field132.method519(var56, (byte) -105, var57, 0);
                    if (var58 != -1) {
                        this.field132.method527(var58, 3, 1);
                    }
                    int var59 = this.field132.method519(var56, (byte) -105, var57, 1);
                    if (var59 != -1) {
                        this.field132.method527(var59, 3, 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
    public final void method59(int arg0, boolean arg1) {
        if (arg0 > 0) {
            for (int var3 = 0; var3 < this.field396; ++var3) {
                class70 var4 = this.field395[this.field397[var3]];
                int var5 = (this.field397[var3] << 14) + 536870912;
                if (var4 != null && var4.method166(5) && var4.field1736.field1294 == arg1 && var4.field1736.method441(712)) {
                    int var6 = var4.field706 >> 7;
                    int var7 = var4.field707 >> 7;
                    if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                        if (var4.field678 == 1 && (var4.field706 & 127) == 64 && (var4.field707 & 127) == 64) {
                            if (this.field366[var6][var7] == this.field302) {
                                continue;
                            }
                            this.field366[var6][var7] = this.field302;
                        }
                        if (!var4.field1736.field1290) {
                            var5 += Integer.MIN_VALUE;
                        }
                        this.field217.method227((var4.field678 - 1) * 64 + 60, var4.field708, this.field459, var4.field698, var4.field706, (byte) 9, var4, this.method153(var4.field707, var4.field706, -926, this.field459), var4.field707, var5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public final void method60(int arg0) {
        int var2 = this.field88;
        int var3 = this.field89;
        int var4 = this.field90;
        int var5 = this.field91;
        int var6 = 6116423;
        class52.method484(var6, var2, 4, var3, var5, var4);
        if (arg0 != 0) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        class52.method484(0, var2 + 1, 4, var3 + 1, 16, var4 - 2);
        class52.method485(true, var3 + 18, var4 - 2, var2 + 1, 0, var5 - 19);
        this.field546.method589(var6, "Choose Option", var2 + 3, var3 + 14, -312);
        int var8 = super.field33;
        int var9 = super.field34;
        if (this.field87 == 0) {
            var8 -= 4;
            var9 -= 4;
        }
        if (this.field87 == 1) {
            var8 -= 553;
            var9 -= 205;
        }
        if (this.field87 == 2) {
            var8 -= 17;
            var9 -= 357;
        }
        for (int var10 = 0; var10 < this.field537; ++var10) {
            int var11 = (this.field537 - 1 - var10) * 15 + var3 + 31;
            int var12 = 16777215;
            if (var8 > var2 && var8 < var2 + var4 && var9 > var11 - 13 && var9 < var11 + 3) {
                var12 = 16776960;
            }
            this.field546.method593((byte) 104, var12, var2 + 3, true, var11, this.field79[var10]);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LMNKDCXXG;II)V")
    private final void method61(class37 arg0, int arg1, int arg2) {
        this.field532 = 0;
        this.field295 = 0;
        this.method113(arg1, (byte) -121, arg0);
        if (arg2 != -12171) {
            this.field85 = !this.field85;
        }
        this.method36(false, arg0, arg1);
        this.method91(arg1, 802, arg0);
        for (int var4 = 0; var4 < this.field532; ++var4) {
            int var6 = this.field533[var4];
            if (field542 != this.field395[var6].field699) {
                this.field395[var6].field1736 = null;
                this.field395[var6] = null;
            }
        }
        if (arg0.field1212 != arg1) {
            signlink.reporterror(this.field265 + " size mismatch in getnpcpos - pos:" + arg0.field1212 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field396; ++var5) {
                if (this.field395[this.field397[var5]] == null) {
                    signlink.reporterror(this.field265 + " null entry in npc list - pos:" + var5 + " size:" + this.field396);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    public final void method62(boolean arg0) {
        for (int var2 = -1; var2 < this.field293; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field291;
            } else {
                var6 = this.field294[var2];
            }
            class6 var7 = this.field292[var6];
            if (var7 != null && var7.field720 > 0) {
                --var7.field720;
                if (var7.field720 == 0) {
                    var7.field719 = null;
                }
            }
        }
        this.field405 &= arg0;
        for (int var3 = 0; var3 < this.field396; ++var3) {
            int var4 = this.field397[var3];
            class70 var5 = this.field395[var4];
            if (var5 != null && var5.field720 > 0) {
                --var5.field720;
                if (var5.field720 == 0) {
                    var5.field719 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public final void method63(int arg0) {
        short var2 = 256;
        if (this.field494 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field494 > 768) {
                    this.field138[var3] = this.method120(-750, 1024 - this.field494, this.field140[var3], this.field139[var3]);
                } else if (this.field494 > 256) {
                    this.field138[var3] = this.field140[var3];
                } else {
                    this.field138[var3] = this.method120(-750, 256 - this.field494, this.field139[var3], this.field140[var3]);
                }
            }
        } else if (this.field495 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field495 > 768) {
                    this.field138[var4] = this.method120(-750, 1024 - this.field495, this.field141[var4], this.field139[var4]);
                } else if (this.field495 > 256) {
                    this.field138[var4] = this.field141[var4];
                } else {
                    this.field138[var4] = this.method120(-750, 256 - this.field495, this.field139[var4], this.field141[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field138[var5] = this.field139[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field311.field1141[var6] = this.field492.field1361[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field399[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field369[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field138[var26];
                    int var30 = this.field311.field1141[var8];
                    this.field311.field1141[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field311.method361(super.field25, 0, 0, (byte) 1);
        if (arg0 < 3 || arg0 > 3) {
            this.field299 = 291;
        }
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field312.field1141[var10] = this.field493.field1361[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field399[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field369[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field138[var18];
                    int var22 = this.field312.field1141[var16];
                    this.field312.field1141[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field312.method361(super.field25, 637, 0, (byte) 1);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(II)Ljava/lang/String;")
    public final String method64(int arg0, int arg1) {
        if (arg1 != 38990) {
            throw new NullPointerException();
        } else {
            return arg0 < 999999999 ? String.valueOf(arg0) : "*";
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method65(byte arg0) {
        if (arg0 != -48) {
            this.field345 = -1;
        }
        for (class1 var2 = (class1) this.field155.method543(); var2 != null; var2 = (class1) this.field155.method545(907)) {
            if (var2.field12 == -1) {
                var2.field1 = 0;
                this.method129(this.field130, var2);
            } else {
                var2.method14();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public final void method66(int arg0) {
        if (this.field124 == 2) {
            this.method94((this.field119 - this.field358 << 7) + this.field122, true, this.field121 * 2, (this.field120 - this.field359 << 7) + this.field123);
            if (arg0 != 42137) {
                this.method6();
            }
            if (this.field306 > -1 && field542 % 20 < 10) {
                this.field354[0].method458(48946, this.field307 - 28, this.field306 - 12);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LBVXAXAEI;Z)V")
    public final void method67(class4 arg0, boolean arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field115.length; ++var4) {
            this.field115[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field115[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field116[var16] = (this.field115[var16 - 1] + this.field115[var16 + 1] + this.field115[var16 - 128] + this.field115[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field115;
            this.field115 = this.field116;
            this.field116 = var14;
        }
        if (!arg1) {
            if (arg0 != null) {
                int var7 = 0;
                for (int var8 = 0; var8 < arg0.field61; ++var8) {
                    for (int var9 = 0; var9 < arg0.field60; ++var9) {
                        if (arg0.field58[var7++] != 0) {
                            int var10 = var9 + 16 + arg0.field62;
                            int var11 = var8 + 16 + arg0.field63;
                            int var12 = (var11 << 7) + var10;
                            this.field115[var12] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method8(boolean arg0) {
        if (this.field132 != null) {
            this.field132.method529();
        }
        this.field132 = null;
        this.field558 = null;
        this.field460 = null;
        this.field217 = null;
        this.field571 = null;
        try {
            if (this.field277 != null) {
                this.field277.method556();
            }
        } catch (Exception var2) {
        }
        this.field277 = null;
        this.field311 = null;
        this.field312 = null;
        this.field308 = null;
        this.field309 = null;
        this.field310 = null;
        this.field521 = null;
        this.field441 = null;
        this.field442 = null;
        this.field443 = null;
        this.field409 = null;
        this.field410 = null;
        this.field411 = null;
        this.field412 = null;
        this.field176 = null;
        this.field177 = null;
        this.field178 = null;
        this.field179 = null;
        this.field389 = null;
        this.field390 = null;
        this.field391 = null;
        this.field392 = null;
        this.field393 = null;
        this.field452 = null;
        this.field292 = null;
        this.field294 = null;
        this.field296 = null;
        this.field297 = null;
        this.field533 = null;
        if (this.field447 != null) {
            this.field447.field1262 = false;
        }
        this.field447 = null;
        this.field413 = null;
        this.field414 = null;
        this.field415 = null;
        this.field416 = null;
        this.field417 = null;
        this.field144 = null;
        this.field241 = null;
        this.field250 = null;
        this.field251 = null;
        this.field252 = null;
        this.method141(0);
        this.field440 = null;
        this.field424 = null;
        this.field425 = null;
        this.field93 = null;
        this.field476 = null;
        this.field446 = null;
        this.field205 = null;
        this.field477 = null;
        this.field478 = null;
        this.field394 = null;
        this.field466 = null;
        this.field237 = null;
        this.field462 = null;
        this.field395 = null;
        this.field397 = null;
        this.field487 = null;
        this.field488 = null;
        this.field489 = null;
        this.field490 = null;
        this.field491 = null;
        this.field271 = null;
        this.field272 = null;
        this.field273 = null;
        this.field274 = null;
        this.field275 = null;
        this.field498 = null;
        this.field183 = null;
        this.field246 = null;
        this.field285 = null;
        this.field148 = null;
        this.field354 = null;
        this.field110 = null;
        this.field202 = null;
        this.field203 = null;
        this.field204 = null;
        this.field127 = null;
        this.field255 = null;
        this.field256 = null;
        this.field257 = null;
        this.field258 = null;
        this.field79 = null;
        this.field313 = null;
        this.field314 = null;
        this.field315 = null;
        this.field316 = null;
        this.field379 = null;
        this.field261 = null;
        if (!arg0) {
            this.field563 = null;
            this.field564 = null;
            this.field118 = null;
            this.field155 = null;
            this.field366 = null;
            this.field437 = null;
            this.field453 = null;
            this.field84 = null;
            this.field147 = null;
            this.field407 = null;
            this.method115(true);
            class36.method369(7);
            class45.method443(7);
            class50.method478(7);
            class25.method269(7);
            class13.field641 = null;
            class46.field1326 = null;
            class21.field796 = null;
            class47.field1336 = null;
            class44.field1269 = null;
            class44.field1281 = null;
            class22.field808 = null;
            super.field26 = null;
            class6.field589 = null;
            class54.method497(7);
            class23.method215(7);
            class26.method277(7);
            class17.method209(7);
            System.gc();
            if (class3.field51) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BIZ)V")
    public final void method68(byte[] arg0, int arg1, boolean arg2) {
        if (arg1 >= 0) {
            this.field566 = -119;
        }
        if (this.field560) {
            signlink.midifade = arg2 ? 1 : 0;
            signlink.midisave(arg0, arg0.length);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method69(byte arg0) {
        int var2 = this.field546.method587("Choose Option", -24375);
        for (int var3 = 0; var3 < this.field537; ++var3) {
            int var11 = this.field546.method587(this.field79[var3], -24375);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        if (arg0 == 7) {
            var2 += 8;
            int var4 = this.field537 * 15 + 21;
            if (super.field40 > 4 && super.field41 > 4 && super.field40 < 516 && super.field41 < 338) {
                int var5 = super.field40 - 4 - var2 / 2;
                if (var2 + var5 > 512) {
                    var5 = 512 - var2;
                }
                if (var5 < 0) {
                    var5 = 0;
                }
                int var6 = super.field41 - 4;
                if (var4 + var6 > 334) {
                    var6 = 334 - var4;
                }
                if (var6 < 0) {
                    var6 = 0;
                }
                this.field408 = true;
                this.field87 = 0;
                this.field88 = var5;
                this.field89 = var6;
                this.field90 = var2;
                this.field91 = this.field537 * 15 + 22;
            }
            if (super.field40 > 553 && super.field41 > 205 && super.field40 < 743 && super.field41 < 466) {
                int var7 = super.field40 - 553 - var2 / 2;
                if (var7 < 0) {
                    var7 = 0;
                } else if (var2 + var7 > 190) {
                    var7 = 190 - var2;
                }
                int var8 = super.field41 - 205;
                if (var8 < 0) {
                    var8 = 0;
                } else if (var4 + var8 > 261) {
                    var8 = 261 - var4;
                }
                this.field408 = true;
                this.field87 = 1;
                this.field88 = var7;
                this.field89 = var8;
                this.field90 = var2;
                this.field91 = this.field537 * 15 + 22;
            }
            if (super.field40 > 17 && super.field41 > 357 && super.field40 < 496 && super.field41 < 453) {
                int var9 = super.field40 - 17 - var2 / 2;
                if (var9 < 0) {
                    var9 = 0;
                } else if (var2 + var9 > 479) {
                    var9 = 479 - var2;
                }
                int var10 = super.field41 - 357;
                if (var10 < 0) {
                    var10 = 0;
                } else if (var4 + var10 > 96) {
                    var10 = 96 - var4;
                }
                this.field408 = true;
                this.field87 = 2;
                this.field88 = var9;
                this.field89 = var10;
                this.field90 = var2;
                this.field91 = this.field537 * 15 + 22;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
    public final void method70(int arg0) {
        if (arg0 <= 0) {
            this.field345 = -1;
        }
        for (int var2 = -1; var2 < this.field293; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field291;
            } else {
                var3 = this.field294[var2];
            }
            class6 var4 = this.field292[var3];
            if (var4 != null) {
                this.method40(1, -46103, var4);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BZ)V")
    public final void method71(byte arg0, boolean arg1) {
        this.method150((byte) -57);
        if (arg0 != 20) {
            this.field345 = this.field462.method386();
        }
        this.field310.method360(-921);
        this.field248.method20(48946, 0, 0);
        short var3 = 360;
        short var4 = 200;
        if (this.field107 == 0) {
            int var5 = var4 / 2 + 80;
            this.field544.method586(7711145, true, var5, (byte) 5, var3 / 2, this.field132.field1529);
            int var6 = var4 / 2 - 20;
            this.field546.method586(16776960, true, var6, (byte) 5, var3 / 2, "Welcome to RuneScape");
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field249.method20(48946, var8 - 20, var7 - 73);
            this.field546.method586(16777215, true, var8 + 5, (byte) 5, var7, "New User");
            int var9 = var3 / 2 + 80;
            this.field249.method20(48946, var8 - 20, var9 - 73);
            this.field546.method586(16777215, true, var8 + 5, (byte) 5, var9, "Existing User");
        }
        if (this.field107 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field505.length() > 0) {
                this.field546.method586(16776960, true, var10 - 15, (byte) 5, var3 / 2, this.field505);
                this.field546.method586(16776960, true, var10, (byte) 5, var3 / 2, this.field506);
                var10 += 30;
            } else {
                this.field546.method586(16776960, true, var10 - 7, (byte) 5, var3 / 2, this.field506);
                var10 += 30;
            }
            this.field546.method593((byte) 104, 16777215, var3 / 2 - 90, true, var10, "Username: " + this.field265 + (this.field575 == 0 & field542 % 40 < 20 ? "@yel@|" : ""));
            var10 += 15;
            this.field546.method593((byte) 104, 16777215, var3 / 2 - 88, true, var10, "Password: " + class53.method496(true, this.field266) + (this.field575 == 1 & field542 % 40 < 20 ? "@yel@|" : ""));
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field249.method20(48946, var12 - 20, var11 - 73);
                this.field546.method586(16777215, true, var12 + 5, (byte) 5, var11, "Login");
                int var13 = var3 / 2 + 80;
                this.field249.method20(48946, var12 - 20, var13 - 73);
                this.field546.method586(16777215, true, var12 + 5, (byte) 5, var13, "Cancel");
            }
        }
        if (this.field107 == 3) {
            this.field546.method586(16776960, true, var4 / 2 - 60, (byte) 5, var3 / 2, "Create a free account");
            int var14 = var4 / 2 - 35;
            this.field546.method586(16777215, true, var14, (byte) 5, var3 / 2, "To create a new account you need to");
            int var18 = var14 + 15;
            this.field546.method586(16777215, true, var18, (byte) 5, var3 / 2, "go back to the main RuneScape webpage");
            int var19 = var18 + 15;
            this.field546.method586(16777215, true, var19, (byte) 5, var3 / 2, "and choose the 'create account'");
            int var20 = var19 + 15;
            this.field546.method586(16777215, true, var20, (byte) 5, var3 / 2, "button near the top of that page.");
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field249.method20(48946, var16 - 20, var15 - 73);
            this.field546.method586(16777215, true, var16 + 5, (byte) 5, var15, "Cancel");
        }
        this.field310.method361(super.field25, 202, 171, (byte) 1);
        if (this.field377) {
            this.field377 = false;
            this.field308.method361(super.field25, 128, 0, (byte) 1);
            this.field309.method361(super.field25, 202, 371, (byte) 1);
            this.field313.method361(super.field25, 0, 265, (byte) 1);
            this.field314.method361(super.field25, 562, 265, (byte) 1);
            this.field315.method361(super.field25, 128, 171, (byte) 1);
            this.field316.method361(super.field25, 562, 171, (byte) 1);
        }
    }

    @OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field28 != null) {
                    return new URL("http://127.0.0.1:" + (field384 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method72(byte arg0) {
        class36.field1152.method429();
        class36.field1166.method429();
        class45.field1304.method429();
        class50.field1389.method429();
        class50.field1412.method429();
        class6.field589.method429();
        if (arg0 != 103) {
            this.field468 = 58;
        }
        class44.field1281.method429();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public final void method13(int arg0, byte arg1, String arg2) {
        this.field326 = arg0;
        this.field551 = arg2;
        this.method150((byte) -57);
        if (this.field529 == null) {
            super.method13(arg0, (byte) 6, arg2);
        } else {
            this.field310.method360(-921);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field546.method585(16777215, 5, var5 / 2 - 26 - var6, var4 / 2, "RuneScape is loading - please wait...");
            int var7 = var5 / 2 - 18 - var6;
            class52.method485(true, var7, 304, var4 / 2 - 152, 9179409, 34);
            if (arg1 == 6) {
                boolean var8 = false;
            } else {
                this.field466.method376(155);
            }
            class52.method485(true, var7 + 1, 302, var4 / 2 - 151, 0, 32);
            class52.method484(9179409, var4 / 2 - 150, 4, var7 + 2, 30, arg0 * 3);
            class52.method484(0, arg0 * 3 + (var4 / 2 - 150), 4, var7 + 2, 30, 300 - arg0 * 3);
            this.field546.method585(16777215, 5, var5 / 2 + 5 - var6, var4 / 2, arg2);
            this.field310.method361(super.field25, 202, 171, (byte) 1);
            if (this.field377) {
                this.field377 = false;
                if (!this.field427) {
                    this.field311.method361(super.field25, 0, 0, (byte) 1);
                    this.field312.method361(super.field25, 637, 0, (byte) 1);
                }
                this.field308.method361(super.field25, 128, 0, (byte) 1);
                this.field309.method361(super.field25, 202, 371, (byte) 1);
                this.field313.method361(super.field25, 0, 265, (byte) 1);
                this.field314.method361(super.field25, 562, 265, (byte) 1);
                this.field315.method361(super.field25, 128, 171, (byte) 1);
                this.field316.method361(super.field25, 562, 171, (byte) 1);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method73(String arg0) {
        System.out.println(arg0);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "loaderror_" + arg0 + ".html"));
        } catch (Exception var3) {
            var3.printStackTrace();
        }
        while (true) {
            while (true) {
                try {
                    Thread.sleep(1000L);
                } catch (Exception var4) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILCQCDOTXO;ILMNKDCXXG;I)V")
    private final void method74(int arg0, class6 arg1, int arg2, class37 arg3, int arg4) {
        if (arg0 != 2) {
            this.field299 = 359;
        }
        if ((arg2 & 4) != 0) {
            arg1.field688 = arg3.method414(-660);
            if (arg1.field688 == 65535) {
                arg1.field688 = -1;
            }
        }
        if ((arg2 & 64) != 0) {
            int var6 = arg3.method405(this.field134);
            byte[] var7 = new byte[var6];
            class37 var8 = new class37(var7, -670);
            arg3.method424(var7, this.field566, 0, var6);
            this.field297[arg4] = var8;
            arg1.method170(-802, var8);
        }
        if ((arg2 & 32) != 0) {
            arg1.field700 = arg3.method388();
            arg1.field701 = arg3.method388();
        }
        if ((arg2 & 8) != 0) {
            int var9 = arg3.method386();
            int var10 = arg3.method405(this.field134);
            arg1.method205(field542, -516, var10, var9);
            arg1.field703 = field542 + 300;
            arg1.field704 = arg3.method407((byte) 2);
            arg1.field705 = arg3.method405(this.field134);
        }
        if ((arg2 & 256) != 0) {
            arg1.field710 = arg3.method388();
            int var11 = arg3.method423(true);
            arg1.field714 = var11 >> 16;
            arg1.field713 = (var11 & 65535) + field542;
            arg1.field711 = 0;
            arg1.field712 = 0;
            if (arg1.field713 > field542) {
                arg1.field711 = -1;
            }
            if (arg1.field710 == 65535) {
                arg1.field710 = -1;
            }
        }
        if ((arg2 & 16) != 0) {
            int var12 = arg3.method414(-660);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = arg3.method386();
            if (arg1.field693 == var12 && var12 != -1) {
                int var14 = class47.field1336[var12].field1350;
                if (var14 == 1) {
                    arg1.field694 = 0;
                    arg1.field695 = 0;
                    arg1.field696 = var13;
                    arg1.field697 = 0;
                }
                if (var14 == 2) {
                    arg1.field697 = 0;
                }
            } else if (var12 == -1 || arg1.field693 == -1 || class47.field1336[var12].field1344 >= class47.field1336[arg1.field693].field1344) {
                arg1.field693 = var12;
                arg1.field694 = 0;
                arg1.field695 = 0;
                arg1.field696 = var13;
                arg1.field697 = 0;
                arg1.field692 = arg1.field715;
            }
        }
        if ((arg2 & 2) != 0) {
            int var15 = arg3.method414(-660);
            int var16 = arg3.method406(-584);
            int var17 = arg3.method406(-584);
            int var18 = arg3.field1212;
            if (arg1.field604 != null && arg1.field593) {
                long var19 = class53.method491(arg1.field604);
                boolean var21 = false;
                if (var16 <= 1) {
                    for (int var22 = 0; var22 < this.field339; ++var22) {
                        if (this.field519[var22] == var19) {
                            var21 = true;
                            break;
                        }
                    }
                }
                if (!var21 && this.field305 == 0) {
                    try {
                        this.field394.field1212 = 0;
                        arg3.method424(this.field394.field1211, this.field566, 0, var17);
                        this.field394.field1212 = 0;
                        String var23 = class69.method600(var17, true, this.field394);
                        String var24 = class33.method328(this.field213, var23);
                        arg1.field719 = var24;
                        arg1.field667 = var15 >> 8;
                        arg1.field679 = var15 & 255;
                        arg1.field720 = 150;
                        if (var16 != 2 && var16 != 3) {
                            if (var16 == 1) {
                                this.method121(var24, 1, "@cr1@" + arg1.field604, -212);
                            } else {
                                this.method121(var24, 2, arg1.field604, -212);
                            }
                        } else {
                            this.method121(var24, 1, "@cr2@" + arg1.field604, -212);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg3.field1212 = var17 + var18;
        }
        if ((arg2 & 512) != 0) {
            arg1.field671 = arg3.method405(this.field134);
            arg1.field673 = arg3.method405(this.field134);
            arg1.field672 = arg3.method386();
            arg1.field674 = arg3.method405(this.field134);
            arg1.field675 = arg3.method415((byte) -98) + field542;
            arg1.field676 = arg3.method415((byte) -98) + field542;
            arg1.field677 = arg3.method405(this.field134);
            arg1.method203((byte) -32);
        }
        if ((arg2 & 128) != 0) {
            arg1.field719 = arg3.method393();
            if (arg1.field719.charAt(0) == '~') {
                arg1.field719 = arg1.field719.substring(1);
                this.method121(arg1.field719, 2, arg1.field604, -212);
            } else if (field254 == arg1) {
                this.method121(arg1.field719, 2, arg1.field604, -212);
            }
            arg1.field667 = 0;
            arg1.field679 = 0;
            arg1.field720 = 150;
        }
        if ((arg2 & 1024) != 0) {
            int var26 = arg3.method407((byte) 2);
            int var27 = arg3.method386();
            arg1.method205(field542, -516, var27, var26);
            arg1.field703 = field542 + 300;
            arg1.field704 = arg3.method407((byte) 2);
            arg1.field705 = arg3.method406(-584);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
    public final void method75(int arg0, long arg1) {
        if (this.field364 != arg0) {
            this.field118 = null;
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field197; ++var4) {
                if (this.field147[var4] == arg1) {
                    --this.field197;
                    this.field268 = true;
                    for (int var5 = var4; var5 < this.field197; ++var5) {
                        this.field84[var5] = this.field84[var5 + 1];
                        this.field407[var5] = this.field407[var5 + 1];
                        this.field147[var5] = this.field147[var5 + 1];
                    }
                    this.field466.method375(230, this.field496);
                    this.field466.method382(arg1, this.field253);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method9(int arg0) {
        if (!this.field97 && !this.field539 && !this.field242) {
            ++field95;
            if (arg0 != 0) {
                this.field345 = this.field462.method386();
            }
            if (!this.field405) {
                this.method71((byte) 20, false);
            } else {
                this.method46((byte) 74);
            }
            this.field190 = 0;
        } else {
            this.method135(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZJ)V")
    public final void method76(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field197 >= 100 && this.field568 != 1) {
                this.method121("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "", -212);
            } else if (this.field197 >= 200) {
                this.method121("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "", -212);
            } else {
                String var4 = class53.method495(true, class53.method492(42220, arg1));
                if (arg0) {
                    this.method6();
                }
                for (int var5 = 0; var5 < this.field197; ++var5) {
                    if (this.field147[var5] == arg1) {
                        this.method121(var4 + " is already on your friend list", 0, "", -212);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field339; ++var6) {
                    if (this.field519[var6] == arg1) {
                        this.method121("Please remove " + var4 + " from your ignore list first", 0, "", -212);
                        return;
                    }
                }
                if (!var4.equals(field254.field604)) {
                    this.field84[this.field197] = var4;
                    this.field147[this.field197] = arg1;
                    this.field407[this.field197] = 0;
                    ++this.field197;
                    this.field268 = true;
                    this.field466.method375(40, this.field496);
                    this.field466.method382(arg1, this.field253);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
    public final void method77(boolean arg0) {
        if (!arg0) {
            this.method6();
        }
        this.method145(true);
        if (this.field228 == 1) {
            this.field110[this.field227 / 100].method458(48946, this.field226 - 8 - 4, this.field225 - 8 - 4);
        }
        if (this.field228 == 2) {
            this.field110[this.field227 / 100 + 4].method458(48946, this.field226 - 8 - 4, this.field225 - 8 - 4);
        }
        if (this.field230 != -1) {
            this.method154(this.field321, this.field230, 494);
            this.method105(0, class25.method276(this.field230), 0, (byte) -21, 0);
        }
        if (this.field572 != -1) {
            this.method154(this.field321, this.field572, 494);
            this.method105(0, class25.method276(this.field572), 0, (byte) -21, 0);
        }
        this.method97(186);
        if (!this.field408) {
            this.method128((byte) 4);
            this.method100(this.field549);
        } else if (this.field87 == 0) {
            this.method60(0);
        }
        if (this.field101 == 1) {
            this.field452.method458(48946, 296, 472);
        }
        if (field284) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field21 < 30 && field386) {
                var4 = 16711680;
            }
            if (super.field21 < 20 && !field386) {
                var4 = 16711680;
            }
            this.field545.method584(6, var3, "Fps:" + super.field21, var2, var4);
            int var13 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field386) {
                int var8 = 16711680;
            }
            if (var6 > 67108864 && !field386) {
                int var9 = 16711680;
            }
            this.field545.method584(6, var13, "Mem:" + var6 + "k", var2, 16776960);
            var13 += 15;
        }
        if (this.field231 != 0) {
            int var10 = this.field231 / 50;
            int var11 = var10 / 60;
            int var12 = var10 % 60;
            if (var12 < 10) {
                this.field545.method589(16776960, "System update in: " + var11 + ":0" + var12, 4, 329, -312);
            } else {
                this.field545.method589(16776960, "System update in: " + var11 + ":" + var12, 4, 329, -312);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZJ)V")
    public final void method78(boolean arg0, long arg1) {
        if (!arg0) {
            this.field345 = this.field462.method386();
        }
        if (arg1 != 0L) {
            if (this.field339 >= 100) {
                this.method121("Your ignore list is full. Max of 100 hit", 0, "", -212);
            } else {
                String var4 = class53.method495(true, class53.method492(42220, arg1));
                for (int var5 = 0; var5 < this.field339; ++var5) {
                    if (this.field519[var5] == arg1) {
                        this.method121(var4 + " is already on your ignore list", 0, "", -212);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field197; ++var6) {
                    if (this.field147[var6] == arg1) {
                        this.method121("Please remove " + var4 + " from your friend list first", 0, "", -212);
                        return;
                    }
                }
                this.field519[this.field339++] = arg1;
                this.field268 = true;
                this.field466.method375(226, this.field496);
                this.field466.method382(arg1, this.field253);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIZI)V")
    private final void method79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        class1 var11 = null;
        for (class1 var12 = (class1) this.field155.method543(); var12 != null; var12 = (class1) this.field155.method545(907)) {
            if (var12.field2 == arg7 && var12.field4 == arg4 && var12.field5 == arg1 && var12.field3 == arg9) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class1();
            var11.field2 = arg7;
            var11.field3 = arg9;
            var11.field4 = arg4;
            var11.field5 = arg1;
            this.method129(this.field130, var11);
            this.field155.method540(var11);
        }
        var11.field6 = arg5;
        var11.field8 = arg2;
        if (arg8) {
            this.field345 = this.field462.method386();
        }
        var11.field7 = arg0;
        var11.field1 = arg6;
        var11.field12 = arg3;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZII)V")
    public final void method80(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        this.field99.method20(48946, arg5, arg1);
        this.field100.method20(48946, arg2 + arg5 - 16, arg1);
        class52.method484(this.field187, arg1, 4, arg5 + 16, arg2 - 32, 16);
        int var7 = (arg2 - 32) * arg2 / arg0;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg2 - 32 - var7) * arg4 / (arg0 - arg2);
        class52.method484(this.field184, arg1, 4, arg5 + 16 + var8, var7, 16);
        class52.method489(this.field221, this.field332, arg1, var7, arg5 + 16 + var8);
        if (arg3) {
            this.field345 = -1;
        }
        class52.method489(this.field221, this.field332, arg1 + 1, var7, arg5 + 16 + var8);
        class52.method487(arg1, -115, this.field221, 16, arg5 + 16 + var8);
        class52.method487(arg1, -115, this.field221, 16, arg5 + 17 + var8);
        class52.method489(this.field240, this.field332, arg1 + 15, var7, arg5 + 16 + var8);
        class52.method489(this.field240, this.field332, arg1 + 14, var7 - 1, arg5 + 17 + var8);
        class52.method487(arg1, -115, this.field240, 16, arg5 + 15 + var8 + var7);
        class52.method487(arg1 + 1, -115, this.field240, 15, arg5 + 14 + var8 + var7);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LMNKDCXXG;BI)V")
    public final void method81(class37 arg0, byte arg1, int arg2) {
        if (arg1 != -77) {
            this.field507 = 219;
        }
        if (arg2 == 239) {
            int var4 = arg0.method386();
            int var5 = (var4 >> 4 & 7) + this.field444;
            int var6 = (var4 & 7) + this.field445;
            int var7 = var5 + arg0.method387();
            int var8 = var6 + arg0.method387();
            int var9 = arg0.method389();
            int var10 = arg0.method388();
            int var11 = arg0.method386() * 4;
            int var12 = arg0.method386() * 4;
            int var13 = arg0.method388();
            int var14 = arg0.method388();
            int var15 = arg0.method386();
            int var16 = arg0.method386();
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var10 != 65535) {
                int var17 = var5 * 128 + 64;
                int var18 = var6 * 128 + 64;
                int var19 = var7 * 128 + 64;
                int var20 = var8 * 128 + 64;
                class60 var21 = new class60(this.field459, field542 + var14, this.method153(var18, var17, -926, this.field459) - var11, var17, var16, var15, var12, var18, field542 + var13, -33265, var9, var10);
                var21.method538(-20299, var20, var19, field542 + var13, this.method153(var20, var19, -926, this.field459) - var12);
                this.field437.method540(var21);
            }
        } else if (arg2 == 197) {
            int var22 = arg0.method415((byte) -98);
            int var23 = arg0.method405(this.field134);
            int var24 = var23 >> 2;
            int var25 = var23 & 3;
            int var26 = this.field222[var24];
            int var27 = arg0.method407((byte) 2);
            int var28 = (var27 >> 4 & 7) + this.field444;
            int var29 = (var27 & 7) + this.field445;
            if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                this.method79(var25, var29, var24, -1, var28, var22, 0, this.field459, false, var26);
            }
        } else if (arg2 == 109) {
            int var30 = arg0.method386();
            int var31 = (var30 >> 4 & 7) + this.field444;
            int var32 = (var30 & 7) + this.field445;
            int var33 = arg0.method388();
            int var34 = arg0.method386();
            int var35 = arg0.method388();
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                int var36 = var31 * 128 + 64;
                int var37 = var32 * 128 + 64;
                class31 var38 = new class31(var33, var37, var36, this.method153(var37, var36, -926, this.field459) - var34, field542, this.field459, false, var35);
                this.field453.method540(var38);
            }
        } else {
            if (arg2 == 49) {
                int var39 = arg0.method388();
                byte var40 = arg0.method408(true);
                byte var41 = arg0.method409((byte) 4);
                int var42 = arg0.method407((byte) 2);
                int var43 = var42 >> 2;
                int var44 = var42 & 3;
                int var45 = this.field222[var43];
                int var46 = arg0.method413(-817);
                byte var47 = arg0.method409((byte) 4);
                int var48 = arg0.method413(-817);
                byte var49 = arg0.method387();
                int var50 = arg0.method405(this.field134);
                int var51 = (var50 >> 4 & 7) + this.field444;
                int var52 = (var50 & 7) + this.field445;
                int var53 = arg0.method414(-660);
                class6 var54;
                if (this.field365 == var39) {
                    var54 = field254;
                } else {
                    var54 = this.field292[var39];
                }
                if (var54 != null) {
                    class36 var55 = class36.method363(var53);
                    int var56 = this.field558[this.field459][var51][var52];
                    int var57 = this.field558[this.field459][var51 + 1][var52];
                    int var58 = this.field558[this.field459][var51 + 1][var52 + 1];
                    int var59 = this.field558[this.field459][var51][var52 + 1];
                    class26 var60 = var55.method365(var43, var44, var56, var57, var58, var59, -1);
                    if (var60 != null) {
                        this.method79(0, var52, 0, var46 + 1, var51, -1, var48 + 1, this.field459, false, var45);
                        var54.field609 = field542 + var48;
                        var54.field610 = field542 + var46;
                        var54.field601 = var60;
                        int var61 = var55.field1157;
                        int var62 = var55.field1160;
                        if (var44 == 1 || var44 == 3) {
                            var61 = var55.field1160;
                            var62 = var55.field1157;
                        }
                        var54.field598 = var51 * 128 + var61 * 64;
                        var54.field600 = var52 * 128 + var62 * 64;
                        var54.field599 = this.method153(var54.field600, var54.field598, -926, this.field459);
                        if (var41 > var40) {
                            byte var63 = var41;
                            var41 = var40;
                            var40 = var63;
                        }
                        if (var47 > var49) {
                            byte var64 = var47;
                            var47 = var49;
                            var49 = var64;
                        }
                        var54.field584 = var41 + var51;
                        var54.field586 = var40 + var51;
                        var54.field585 = var47 + var52;
                        var54.field587 = var49 + var52;
                    }
                }
            }
            if (arg2 == 150) {
                int var65 = arg0.method388();
                int var66 = arg0.method405(this.field134);
                int var67 = (var66 >> 4 & 7) + this.field444;
                int var68 = (var66 & 7) + this.field445;
                int var69 = arg0.method415((byte) -98);
                int var70 = arg0.method413(-817);
                if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104 && this.field365 != var69) {
                    class15 var71 = new class15();
                    var71.field665 = var65;
                    var71.field664 = var70;
                    if (this.field118[this.field459][var67][var68] == null) {
                        this.field118[this.field459][var67][var68] = new class61(-270);
                    }
                    this.field118[this.field459][var67][var68].method540(var71);
                    this.method57(var67, var68);
                }
            } else if (arg2 == 188) {
                int var72 = arg0.method386();
                int var73 = (var72 >> 4 & 7) + this.field444;
                int var74 = (var72 & 7) + this.field445;
                int var75 = arg0.method388();
                int var76 = arg0.method388();
                int var77 = arg0.method388();
                if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                    class61 var78 = this.field118[this.field459][var73][var74];
                    if (var78 != null) {
                        for (class15 var79 = (class15) var78.method543(); var79 != null; var79 = (class15) var78.method545(907)) {
                            if ((var75 & 32767) == var79.field665 && var79.field664 == var76) {
                                var79.field664 = var77;
                                break;
                            }
                        }
                        this.method57(var73, var74);
                    }
                }
            } else if (arg2 == 127) {
                int var80 = arg0.method407((byte) 2);
                int var81 = (var80 >> 4 & 7) + this.field444;
                int var82 = (var80 & 7) + this.field445;
                int var83 = arg0.method414(-660);
                int var84 = arg0.method415((byte) -98);
                if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104) {
                    class15 var85 = new class15();
                    var85.field665 = var83;
                    var85.field664 = var84;
                    if (this.field118[this.field459][var81][var82] == null) {
                        this.field118[this.field459][var81][var82] = new class61(-270);
                    }
                    this.field118[this.field459][var81][var82].method540(var85);
                    this.method57(var81, var82);
                }
            } else if (arg2 != 27) {
                if (arg2 == 113) {
                    int var92 = arg0.method406(-584);
                    int var93 = var92 >> 2;
                    int var94 = var92 & 3;
                    int var95 = this.field222[var93];
                    int var96 = arg0.method386();
                    int var97 = (var96 >> 4 & 7) + this.field444;
                    int var98 = (var96 & 7) + this.field445;
                    if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104) {
                        this.method79(var94, var98, var93, -1, var97, -1, 0, this.field459, false, var95);
                    }
                } else {
                    if (arg2 == 128) {
                        int var99 = arg0.method386();
                        int var100 = (var99 >> 4 & 7) + this.field444;
                        int var101 = (var99 & 7) + this.field445;
                        int var102 = arg0.method388();
                        int var103 = arg0.method386();
                        int var104 = var103 >> 4 & 15;
                        int var105 = var103 & 7;
                        if (field254.field681[0] >= var100 - var104 && field254.field681[0] <= var100 + var104 && field254.field682[0] >= var101 - var104 && field254.field682[0] <= var101 + var104 && this.field523 && !field386 && this.field406 < 50) {
                            this.field301[this.field406] = var102;
                            this.field499[this.field406] = var105;
                            this.field334[this.field406] = class7.field615[var102];
                            ++this.field406;
                        }
                    }
                    if (arg2 == 205) {
                        int var106 = arg0.method406(-584);
                        int var107 = var106 >> 2;
                        int var108 = var106 & 3;
                        int var109 = this.field222[var107];
                        int var110 = arg0.method414(-660);
                        int var111 = arg0.method405(this.field134);
                        int var112 = (var111 >> 4 & 7) + this.field444;
                        int var113 = (var111 & 7) + this.field445;
                        if (var112 >= 0 && var113 >= 0 && var112 < 103 && var113 < 103) {
                            int var114 = this.field558[this.field459][var112][var113];
                            int var115 = this.field558[this.field459][var112 + 1][var113];
                            int var116 = this.field558[this.field459][var112 + 1][var113 + 1];
                            int var117 = this.field558[this.field459][var112][var113 + 1];
                            if (var109 == 0) {
                                class32 var118 = this.field217.method238(var112, var113, (byte) -98, this.field459);
                                if (var118 != null) {
                                    int var119 = var118.field1101 >> 14 & 32767;
                                    if (var107 == 2) {
                                        var118.field1099 = new class71(2, var115, var110, var108 + 4, (byte) 116, var114, var116, var119, var117, false);
                                        var118.field1100 = new class71(2, var115, var110, var108 + 1 & 3, (byte) 116, var114, var116, var119, var117, false);
                                    } else {
                                        var118.field1099 = new class71(var107, var115, var110, var108, (byte) 116, var114, var116, var119, var117, false);
                                    }
                                }
                            }
                            if (var109 == 1) {
                                class51 var120 = this.field217.method239(var113, 0, this.field459, var112);
                                if (var120 != null) {
                                    var120.field1428 = new class71(4, var115, var110, 0, (byte) 116, var114, var116, var120.field1429 >> 14 & 32767, var117, false);
                                }
                            }
                            if (var109 == 2) {
                                class19 var121 = this.field217.method240(this.field459, var112, var113, 67);
                                if (var107 == 11) {
                                    var107 = 10;
                                }
                                if (var121 != null) {
                                    var121.field783 = new class71(var107, var115, var110, var108, (byte) 116, var114, var116, var121.field791 >> 14 & 32767, var117, false);
                                }
                            }
                            if (var109 == 3) {
                                class38 var122 = this.field217.method241(0, this.field459, var113, var112);
                                if (var122 != null) {
                                    var122.field1228 = new class71(22, var115, var110, var108, (byte) 116, var114, var116, var122.field1229 >> 14 & 32767, var117, false);
                                }
                            }
                        }
                    }
                }
            } else {
                int var86 = arg0.method406(-584);
                int var87 = (var86 >> 4 & 7) + this.field444;
                int var88 = (var86 & 7) + this.field445;
                int var89 = arg0.method415((byte) -98);
                if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
                    class61 var90 = this.field118[this.field459][var87][var88];
                    if (var90 != null) {
                        for (class15 var91 = (class15) var90.method543(); var91 != null; var91 = (class15) var90.method545(907)) {
                            if ((var89 & 32767) == var91.field665) {
                                var91.method14();
                                break;
                            }
                        }
                        if (var90.method543() == null) {
                            this.field118[this.field459][var87][var88] = null;
                        }
                        this.method57(var87, var88);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
    public final void method82(boolean arg0) {
        if (arg0) {
            field201 = !field201;
        }
        if (this.field456 == 0) {
            int var2 = super.field39;
            if (this.field401 == 1 && super.field40 >= 516 && super.field41 >= 160 && super.field40 <= 765 && super.field41 <= 205) {
                var2 = 0;
            }
            if (this.field408) {
                if (var2 != 1) {
                    int var3 = super.field33;
                    int var4 = super.field34;
                    if (this.field87 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field87 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field87 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field88 - 10 || var3 > this.field90 + this.field88 + 10 || var4 < this.field89 - 10 || var4 > this.field91 + this.field89 + 10) {
                        this.field408 = false;
                        if (this.field87 == 1) {
                            this.field268 = true;
                        }
                        if (this.field87 == 2) {
                            this.field350 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field88;
                    int var6 = this.field89;
                    int var7 = this.field90;
                    int var8 = super.field40;
                    int var9 = super.field41;
                    if (this.field87 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field87 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field87 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field537; ++var11) {
                        int var12 = (this.field537 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method148(var10, false);
                    }
                    this.field408 = false;
                    if (this.field87 == 1) {
                        this.field268 = true;
                    }
                    if (this.field87 == 2) {
                        this.field350 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field537 > 0) {
                    int var13 = this.field257[this.field537 - 1];
                    if (var13 == 627 || var13 == 734 || var13 == 304 || var13 == 974 || var13 == 380 || var13 == 524 || var13 == 239 || var13 == 518 || var13 == 459 || var13 == 257 || var13 == 108 || var13 == 1194) {
                        int var14 = this.field255[this.field537 - 1];
                        int var15 = this.field256[this.field537 - 1];
                        class25 var16 = class25.method276(var15);
                        if (var16.field909 || var16.field902) {
                            this.field286 = false;
                            this.field188 = 0;
                            this.field454 = var15;
                            this.field455 = var14;
                            this.field456 = 2;
                            this.field457 = super.field40;
                            this.field458 = super.field41;
                            if (class25.method276(var15).field974 == this.field572) {
                                this.field456 = 1;
                            }
                            if (class25.method276(var15).field974 == this.field352) {
                                this.field456 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field245 == 1 || this.method144(70, this.field537 - 1)) && this.field537 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field537 > 0) {
                    this.method148(this.field537 - 1, false);
                }
                if (var2 != 2 || this.field537 <= 0) {
                    return;
                }
                this.method69((byte) 7);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public final void method83(byte arg0) {
        int var2 = 5;
        this.field431[8] = 0;
        if (arg0 == 4) {
            boolean var3 = false;
        } else {
            field111 = !field111;
        }
        int var4 = 0;
        while (this.field431[8] == 0) {
            String var5 = "Unknown problem";
            this.method13(20, (byte) 6, "Connecting to web server");
            try {
                DataInputStream var6 = this.method155("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 368);
                class37 var7 = new class37(new byte[40], -670);
                var6.readFully(var7.field1211, 0, 40);
                var6.close();
                for (int var8 = 0; var8 < 9; ++var8) {
                    this.field431[var8] = var7.method391();
                }
                int var9 = var7.method391();
                int var10 = 1234;
                for (int var11 = 0; var11 < 9; ++var11) {
                    var10 = (var10 << 1) + this.field431[var11];
                }
                if (var9 != var10) {
                    var5 = "checksum problem";
                    this.field431[8] = 0;
                }
            } catch (EOFException var14) {
                var5 = "EOF problem";
                this.field431[8] = 0;
            } catch (IOException var15) {
                var5 = "connection problem";
                this.field431[8] = 0;
            } catch (Exception var16) {
                var5 = "logic problem";
                this.field431[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field431[8] == 0) {
                ++var4;
                for (int var12 = var2; var12 > 0; --var12) {
                    if (var4 >= 10) {
                        this.method13(10, (byte) 6, "Game updated - please reload page");
                        var12 = 10;
                    } else {
                        this.method13(10, (byte) 6, var5 + " - Will retry in " + var12 + " secs.");
                    }
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var13) {
                    }
                }
                var2 *= 2;
                if (var2 > 60) {
                    var2 = 60;
                }
                this.field378 = !this.field378;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method84(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field505 = "";
                this.field506 = "Connecting to server...";
                this.method71((byte) 20, true);
            }
            this.field277 = new class64(this.method29(field384 + 43594), this, true);
            long var4 = class53.method491(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field466.field1212 = 0;
            this.field466.method376(14);
            this.field466.method376(var6);
            this.field277.method560(0, true, this.field466.field1211, 2);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field277.method557();
            }
            int var8 = this.field277.method557();
            int var9 = var8;
            if (var8 == 0) {
                this.field277.method559(this.field462.field1211, 0, 8);
                this.field462.field1212 = 0;
                this.field518 = this.field462.method392((byte) -100);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field518 >> 32), (int) this.field518 };
                this.field466.field1212 = 0;
                this.field466.method376(10);
                this.field466.method380(var10[0]);
                this.field466.method380(var10[1]);
                this.field466.method380(var10[2]);
                this.field466.method380(var10[3]);
                this.field466.method380(signlink.uid);
                this.field466.method383(arg0);
                this.field466.method383(arg1);
                this.field466.method401(field158, 495, field280);
                this.field237.field1212 = 0;
                if (arg2) {
                    this.field237.method376(18);
                } else {
                    this.field237.method376(16);
                }
                this.field237.method376(this.field466.field1212 + 36 + 1 + 1 + 2);
                this.field237.method376(255);
                this.field237.method377(368);
                this.field237.method376(field386 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field237.method380(this.field431[var11]);
                }
                this.field237.method384(0, -249, this.field466.field1212, this.field466.field1211);
                this.field466.field1216 = new class55(false, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field156 = new class55(false, var10);
                this.field277.method560(0, true, this.field237.field1211, this.field237.field1212);
                var8 = this.field277.method557();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method84(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field137 = this.field277.method557();
                field420 = this.field277.method557() == 1;
                this.field342 = 0L;
                this.field351 = 0;
                this.field447.field1266 = 0;
                super.field30 = true;
                this.field373 = true;
                this.field405 = true;
                this.field466.field1212 = 0;
                this.field462.field1212 = 0;
                this.field345 = -1;
                this.field233 = -1;
                this.field234 = -1;
                this.field235 = -1;
                this.field344 = 0;
                this.field346 = 0;
                this.field231 = 0;
                this.field348 = 0;
                this.field124 = 0;
                this.field537 = 0;
                this.field408 = false;
                super.field31 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field154[var13] = null;
                }
                this.field327 = 0;
                this.field401 = 0;
                this.field325 = 0;
                this.field406 = 0;
                this.field112 = (int) (Math.random() * 100.0D) - 50;
                this.field470 = (int) (Math.random() * 110.0D) - 55;
                this.field512 = (int) (Math.random() * 80.0D) - 40;
                this.field199 = (int) (Math.random() * 120.0D) - 60;
                this.field449 = (int) (Math.random() * 30.0D) - 20;
                this.field515 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field543 = 0;
                this.field239 = -1;
                this.field438 = 0;
                this.field439 = 0;
                this.field293 = 0;
                this.field396 = 0;
                for (int var14 = 0; var14 < this.field290; ++var14) {
                    this.field292[var14] = null;
                    this.field297[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field395[var15] = null;
                }
                field254 = this.field292[this.field291] = new class6();
                this.field437.method547();
                this.field453.method547();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field118[var16][var17][var18] = null;
                        }
                    }
                }
                this.field155 = new class61(-270);
                this.field198 = 0;
                this.field197 = 0;
                this.method50(8, this.field500);
                this.field500 = -1;
                this.method50(8, this.field352);
                this.field352 = -1;
                this.method50(8, this.field572);
                this.field572 = -1;
                this.method50(8, this.field472);
                this.field472 = -1;
                this.method50(8, this.field337);
                this.field337 = -1;
                this.method50(8, this.field229);
                this.field229 = -1;
                this.method50(8, this.field230);
                this.field230 = -1;
                this.field530 = false;
                this.field270 = 3;
                this.field160 = 0;
                this.field408 = false;
                this.field557 = false;
                this.field219 = null;
                this.field101 = 0;
                this.field368 = -1;
                this.field131 = true;
                this.method49(649);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field192[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field380[var20] = null;
                    this.field381[var20] = false;
                }
                field469 = 0;
                field282 = 0;
                field451 = 0;
                field464 = 0;
                field259 = 0;
                field189 = 0;
                field247 = 0;
                field465 = 0;
                field181 = 0;
                field126 = 0;
                this.method142(0);
            } else if (var8 == 3) {
                this.field505 = "";
                this.field506 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field505 = "Your account has been disabled.";
                this.field506 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field505 = "Your account is already logged in.";
                this.field506 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field505 = "RuneScape has been updated!";
                this.field506 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field505 = "This world is full.";
                this.field506 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field505 = "Unable to connect.";
                this.field506 = "Login server offline.";
            } else if (var8 == 9) {
                this.field505 = "Login limit exceeded.";
                this.field506 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field505 = "Unable to connect.";
                this.field506 = "Bad session id.";
            } else if (var8 == 12) {
                this.field505 = "You need a members account to login to this world.";
                this.field506 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field505 = "Could not complete login.";
                this.field506 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field505 = "The server is being updated.";
                this.field506 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field405 = true;
                this.field466.field1212 = 0;
                this.field462.field1212 = 0;
                this.field345 = -1;
                this.field233 = -1;
                this.field234 = -1;
                this.field235 = -1;
                this.field344 = 0;
                this.field346 = 0;
                this.field231 = 0;
                this.field537 = 0;
                this.field408 = false;
                this.field269 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field505 = "Login attempts exceeded.";
                this.field506 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field505 = "You are standing in a members-only area.";
                this.field506 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field505 = "Invalid loginserver requested";
                this.field506 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field505 = "Malformed login packet.";
                    this.field506 = "Please try again.";
                } else if (var8 == 23) {
                    this.field505 = "No reply from loginserver.";
                    this.field506 = "Please try again.";
                } else if (var8 == 24) {
                    this.field505 = "Error loading your profile.";
                    this.field506 = "Please contact customer support.";
                } else if (var8 == 25) {
                    this.field505 = "Unexpected loginserver response.";
                    this.field506 = "Please try using a different world.";
                } else if (var8 == 26) {
                    this.field505 = "This computers address has been blocked";
                    this.field506 = "as it was used to break our rules";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field83 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field83;
                            this.method84(arg0, arg1, arg2);
                        } else {
                            this.field505 = "No response from loginserver";
                            this.field506 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field505 = "No response from server";
                        this.field506 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field505 = "Unexpected server response";
                    this.field506 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field277.method557();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field505 = "You have only just left another world";
                    this.field506 = "Your profile will be transferred in: " + var26;
                    this.method71((byte) 20, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method84(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field505 = "";
            this.field506 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILMNKDCXXG;Z)V")
    private final void method85(int arg0, class37 arg1, boolean arg2) {
        this.field405 &= arg2;
        arg1.method396((byte) 3);
        int var4 = arg1.method397(1, 4);
        if (var4 != 0) {
            int var5 = arg1.method397(2, 4);
            if (var5 == 0) {
                this.field296[this.field295++] = this.field291;
            } else if (var5 == 1) {
                int var6 = arg1.method397(3, 4);
                field254.method206((byte) 8, var6, false);
                int var7 = arg1.method397(1, 4);
                if (var7 == 1) {
                    this.field296[this.field295++] = this.field291;
                }
            } else if (var5 == 2) {
                int var8 = arg1.method397(3, 4);
                field254.method206((byte) 8, var8, true);
                int var9 = arg1.method397(3, 4);
                field254.method206((byte) 8, var9, true);
                int var10 = arg1.method397(1, 4);
                if (var10 == 1) {
                    this.field296[this.field295++] = this.field291;
                }
            } else if (var5 == 3) {
                int var11 = arg1.method397(7, 4);
                int var12 = arg1.method397(7, 4);
                int var13 = arg1.method397(1, 4);
                int var14 = arg1.method397(1, 4);
                if (var14 == 1) {
                    this.field296[this.field295++] = this.field291;
                }
                this.field459 = arg1.method397(2, 4);
                field254.method204(var12, var13 == 1, var11, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
    public final void method86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field217.method242(arg5, arg3, arg2);
        if (var7 != 0) {
            int var8 = this.field217.method246(arg5, arg3, arg2, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg4;
            if (var7 > 0) {
                var11 = arg1;
            }
            int[] var12 = this.field440.field1361;
            int var13 = (103 - arg2) * 512 * 4 + arg3 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class36 var15 = class36.method363(var14);
            if (var15.field1163 != -1) {
                class4 var16 = this.field144[var15.field1163];
                if (var16 != null) {
                    int var17 = (var15.field1157 * 4 - var16.field60) / 2;
                    int var18 = (var15.field1160 * 4 - var16.field61) / 2;
                    var16.method20(48946, (104 - arg2 - var15.field1160) * 4 + 48 + var18, arg3 * 4 + 48 + var17);
                }
            } else {
                if (var10 == 0 || var10 == 2) {
                    if (var9 == 0) {
                        var12[var13] = var11;
                        var12[var13 + 512] = var11;
                        var12[var13 + 1024] = var11;
                        var12[var13 + 1536] = var11;
                    } else if (var9 == 1) {
                        var12[var13] = var11;
                        var12[var13 + 1] = var11;
                        var12[var13 + 2] = var11;
                        var12[var13 + 3] = var11;
                    } else if (var9 == 2) {
                        var12[var13 + 3] = var11;
                        var12[var13 + 3 + 512] = var11;
                        var12[var13 + 3 + 1024] = var11;
                        var12[var13 + 3 + 1536] = var11;
                    } else if (var9 == 3) {
                        var12[var13 + 1536] = var11;
                        var12[var13 + 1536 + 1] = var11;
                        var12[var13 + 1536 + 2] = var11;
                        var12[var13 + 1536 + 3] = var11;
                    }
                }
                if (var10 == 3) {
                    if (var9 == 0) {
                        var12[var13] = var11;
                    } else if (var9 == 1) {
                        var12[var13 + 3] = var11;
                    } else if (var9 == 2) {
                        var12[var13 + 3 + 1536] = var11;
                    } else if (var9 == 3) {
                        var12[var13 + 1536] = var11;
                    }
                }
                if (var10 == 2) {
                    if (var9 == 3) {
                        var12[var13] = var11;
                        var12[var13 + 512] = var11;
                        var12[var13 + 1024] = var11;
                        var12[var13 + 1536] = var11;
                    } else if (var9 == 0) {
                        var12[var13] = var11;
                        var12[var13 + 1] = var11;
                        var12[var13 + 2] = var11;
                        var12[var13 + 3] = var11;
                    } else if (var9 == 1) {
                        var12[var13 + 3] = var11;
                        var12[var13 + 3 + 512] = var11;
                        var12[var13 + 3 + 1024] = var11;
                        var12[var13 + 3 + 1536] = var11;
                    } else if (var9 == 2) {
                        var12[var13 + 1536] = var11;
                        var12[var13 + 1536 + 1] = var11;
                        var12[var13 + 1536 + 2] = var11;
                        var12[var13 + 1536 + 3] = var11;
                    }
                }
            }
        }
        int var19 = this.field217.method244(arg5, arg3, arg2);
        if (var19 != 0) {
            int var20 = this.field217.method246(arg5, arg3, arg2, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class36 var24 = class36.method363(var23);
            if (var24.field1163 != -1) {
                class4 var25 = this.field144[var24.field1163];
                if (var25 != null) {
                    int var26 = (var24.field1157 * 4 - var25.field60) / 2;
                    int var27 = (var24.field1160 * 4 - var25.field61) / 2;
                    var25.method20(48946, (104 - arg2 - var24.field1160) * 4 + 48 + var27, arg3 * 4 + 48 + var26);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field440.field1361;
                int var30 = (103 - arg2) * 512 * 4 + arg3 * 4 + 24624;
                if (var21 != 0 && var21 != 2) {
                    var29[var30] = var28;
                    var29[var30 + 512 + 1] = var28;
                    var29[var30 + 1024 + 2] = var28;
                    var29[var30 + 1536 + 3] = var28;
                } else {
                    var29[var30 + 1536] = var28;
                    var29[var30 + 1024 + 1] = var28;
                    var29[var30 + 512 + 2] = var28;
                    var29[var30 + 3] = var28;
                }
            }
        }
        int var31 = this.field217.method245(arg5, arg3, arg2);
        int var32 = 16 / arg0;
        if (var31 != 0) {
            int var33 = var31 >> 14 & 32767;
            class36 var34 = class36.method363(var33);
            if (var34.field1163 != -1) {
                class4 var35 = this.field144[var34.field1163];
                if (var35 != null) {
                    int var36 = (var34.field1157 * 4 - var35.field60) / 2;
                    int var37 = (var34.field1160 * 4 - var35.field61) / 2;
                    var35.method20(48946, (104 - arg2 - var34.field1160) * 4 + 48 + var37, arg3 * 4 + 48 + var36);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
    public final void method87(int arg0, int arg1) {
        int[] var3 = this.field440.field1361;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field460[arg0][var24][var6] & 24) == 0) {
                    this.field217.method251(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field460[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field217.method251(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        if (arg1 != 0) {
            this.field345 = this.field462.method386();
        }
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field440.method453(-921);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field460[arg0][var22][var9] & 24) == 0) {
                    this.method86(120, var8, var9, var22, var7, arg0);
                }
                if (arg0 < 3 && (this.field460[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method86(120, var8, var9, var22, var7, arg0 + 1);
                }
            }
        }
        if (this.field178 != null) {
            this.field178.method360(-921);
            class54.field1474 = this.field195;
        }
        ++field322;
        if (field322 > 78) {
            field322 = 0;
            this.field466.method375(54, this.field496);
        }
        this.field423 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field217.method245(this.field459, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class36.method363(var13).field1161;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field571[this.field459].field663;
                            for (int var20 = 0; var20 < 10; ++var20) {
                                int var21 = (int) (Math.random() * 4.0D);
                                if (var21 == 0 && var15 > 0 && var15 > var10 - 3 && (var19[var15 - 1][var16] & 19398920) == 0) {
                                    --var15;
                                }
                                if (var21 == 1 && var15 < var17 - 1 && var15 < var10 + 3 && (var19[var15 + 1][var16] & 19399040) == 0) {
                                    ++var15;
                                }
                                if (var21 == 2 && var16 > 0 && var16 > var11 - 3 && (var19[var15][var16 - 1] & 19398914) == 0) {
                                    --var16;
                                }
                                if (var21 == 3 && var16 < var18 - 1 && var16 < var11 + 3 && (var19[var15][var16 + 1] & 19398944) == 0) {
                                    ++var16;
                                }
                            }
                        }
                        this.field93[this.field423] = this.field241[var14];
                        this.field424[this.field423] = var15;
                        this.field425[this.field423] = var16;
                        ++this.field423;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public final void method88(int arg0) {
        class60 var2 = (class60) this.field437.method543();
        if (arg0 < 2 || arg0 > 2) {
            this.method6();
        }
        while (var2 != null) {
            if (this.field459 == var2.field1571 && field542 <= var2.field1578) {
                if (field542 >= var2.field1577) {
                    if (var2.field1574 > 0) {
                        class70 var4 = this.field395[var2.field1574 - 1];
                        if (var4 != null && var4.field706 >= 0 && var4.field706 < 13312 && var4.field707 >= 0 && var4.field707 < 13312) {
                            var2.method538(-20299, var4.field707, var4.field706, field542, this.method153(var4.field707, var4.field706, -926, var2.field1571) - var2.field1570);
                        }
                    }
                    if (var2.field1574 < 0) {
                        int var5 = -var2.field1574 - 1;
                        class6 var6;
                        if (this.field365 == var5) {
                            var6 = field254;
                        } else {
                            var6 = this.field292[var5];
                        }
                        if (var6 != null && var6.field706 >= 0 && var6.field706 < 13312 && var6.field707 >= 0 && var6.field707 < 13312) {
                            var2.method538(-20299, var6.field707, var6.field706, field542, this.method153(var6.field707, var6.field706, -926, var2.field1571) - var2.field1570);
                        }
                    }
                    var2.method539(-590, this.field321);
                    this.field217.method227(60, var2.field1584, this.field459, false, (int) var2.field1590, (byte) 9, var2, (int) var2.field1592, (int) var2.field1591, -1);
                }
            } else {
                var2.method14();
            }
            var2 = (class60) this.field437.method545(907);
        }
        ++field135;
        if (field135 > 1651) {
            field135 = 0;
            this.field466.method375(53, this.field496);
            this.field466.method376(0);
            int var3 = this.field466.field1212;
            this.field466.method376(23);
            this.field466.method376((int) (Math.random() * 256.0D));
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field466.method377(20573);
            }
            this.field466.method377((int) (Math.random() * 65536.0D));
            this.field466.method377(6686);
            this.field466.method376(82);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field466.method376(58);
            }
            this.field466.method377(26100);
            this.field466.method377(64639);
            this.field466.method376(230);
            this.field466.method385(true, this.field466.field1212 - var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIZ)V")
    public final void method89(boolean arg0, int arg1, boolean arg2) {
        signlink.midivol = arg1;
        if (!arg2) {
            if (arg0) {
                signlink.midi = "voladjust";
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LPFWIJTDA;IIIZ)V")
    public final void method90(class45 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (this.field537 < 400) {
            if (arg0.field1292 != null) {
                arg0 = arg0.method437(505);
            }
            if (arg0 != null) {
                if (arg0.field1290) {
                    String var6 = arg0.field1316;
                    if (!arg4) {
                        if (arg0.field1311 != 0) {
                            var6 = var6 + method125(field254.field595, false, arg0.field1311) + " (level-" + arg0.field1311 + ")";
                        }
                        if (this.field327 == 1) {
                            this.field79[this.field537] = "Use " + this.field331 + " with @yel@" + var6;
                            this.field257[this.field537] = 540;
                            this.field258[this.field537] = arg1;
                            this.field255[this.field537] = arg2;
                            this.field256[this.field537] = arg3;
                            ++this.field537;
                        } else {
                            if (this.field401 == 1) {
                                if ((this.field403 & 2) == 2) {
                                    this.field79[this.field537] = this.field404 + " @yel@" + var6;
                                    this.field257[this.field537] = 85;
                                    this.field258[this.field537] = arg1;
                                    this.field255[this.field537] = arg2;
                                    this.field256[this.field537] = arg3;
                                    ++this.field537;
                                    return;
                                }
                            } else {
                                if (arg0.field1302 != null) {
                                    for (int var7 = 4; var7 >= 0; --var7) {
                                        if (arg0.field1302[var7] != null && !arg0.field1302[var7].equalsIgnoreCase("attack")) {
                                            this.field79[this.field537] = arg0.field1302[var7] + " @yel@" + var6;
                                            if (var7 == 0) {
                                                this.field257[this.field537] = 642;
                                            }
                                            if (var7 == 1) {
                                                this.field257[this.field537] = 418;
                                            }
                                            if (var7 == 2) {
                                                this.field257[this.field537] = 848;
                                            }
                                            if (var7 == 3) {
                                                this.field257[this.field537] = 462;
                                            }
                                            if (var7 == 4) {
                                                this.field257[this.field537] = 148;
                                            }
                                            this.field258[this.field537] = arg1;
                                            this.field255[this.field537] = arg2;
                                            this.field256[this.field537] = arg3;
                                            ++this.field537;
                                        }
                                    }
                                }
                                if (arg0.field1302 != null) {
                                    for (int var8 = 4; var8 >= 0; --var8) {
                                        if (arg0.field1302[var8] != null && arg0.field1302[var8].equalsIgnoreCase("attack")) {
                                            short var9 = 0;
                                            if (arg0.field1311 > field254.field595) {
                                                var9 = 2000;
                                            }
                                            this.field79[this.field537] = arg0.field1302[var8] + " @yel@" + var6;
                                            if (var8 == 0) {
                                                this.field257[this.field537] = var9 + 642;
                                            }
                                            if (var8 == 1) {
                                                this.field257[this.field537] = var9 + 418;
                                            }
                                            if (var8 == 2) {
                                                this.field257[this.field537] = var9 + 848;
                                            }
                                            if (var8 == 3) {
                                                this.field257[this.field537] = var9 + 462;
                                            }
                                            if (var8 == 4) {
                                                this.field257[this.field537] = var9 + 148;
                                            }
                                            this.field258[this.field537] = arg1;
                                            this.field255[this.field537] = arg2;
                                            this.field256[this.field537] = arg3;
                                            ++this.field537;
                                        }
                                    }
                                }
                                this.field79[this.field537] = "Examine @yel@" + var6;
                                this.field257[this.field537] = 1657;
                                this.field258[this.field537] = arg1;
                                this.field255[this.field537] = arg2;
                                this.field256[this.field537] = arg3;
                                ++this.field537;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IILMNKDCXXG;)V")
    private final void method91(int arg0, int arg1, class37 arg2) {
        if (arg1 <= 0) {
            this.field345 = arg2.method386();
        }
        for (int var4 = 0; var4 < this.field295; ++var4) {
            int var5 = this.field296[var4];
            class70 var6 = this.field395[var5];
            int var7 = arg2.method386();
            if ((var7 & 128) != 0) {
                var6.field688 = arg2.method414(-660);
                if (var6.field688 == 65535) {
                    var6.field688 = -1;
                }
            }
            if ((var7 & 1) != 0) {
                var6.field710 = arg2.method414(-660);
                int var8 = arg2.method391();
                var6.field714 = var8 >> 16;
                var6.field713 = (var8 & 65535) + field542;
                var6.field711 = 0;
                var6.field712 = 0;
                if (var6.field713 > field542) {
                    var6.field711 = -1;
                }
                if (var6.field710 == 65535) {
                    var6.field710 = -1;
                }
            }
            if ((var7 & 2) != 0) {
                int var9 = arg2.method386();
                int var10 = arg2.method407((byte) 2);
                var6.method205(field542, -516, var10, var9);
                var6.field703 = field542 + 300;
                var6.field704 = arg2.method405(this.field134);
                var6.field705 = arg2.method406(-584);
            }
            if ((var7 & 4) != 0) {
                var6.field1736 = class45.method442(arg2.method414(-660));
                var6.field678 = var6.field1736.field1300;
                var6.field702 = var6.field1736.field1307;
                var6.field684 = var6.field1736.field1289;
                var6.field685 = var6.field1736.field1283;
                var6.field686 = var6.field1736.field1308;
                var6.field687 = var6.field1736.field1310;
                var6.field716 = var6.field1736.field1319;
            }
            if ((var7 & 64) != 0) {
                var6.field719 = arg2.method393();
                var6.field720 = 100;
            }
            if ((var7 & 8) != 0) {
                int var11 = arg2.method415((byte) -98);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg2.method407((byte) 2);
                if (var6.field693 == var11 && var11 != -1) {
                    int var13 = class47.field1336[var11].field1350;
                    if (var13 == 1) {
                        var6.field694 = 0;
                        var6.field695 = 0;
                        var6.field696 = var12;
                        var6.field697 = 0;
                    }
                    if (var13 == 2) {
                        var6.field697 = 0;
                    }
                } else if (var11 == -1 || var6.field693 == -1 || class47.field1336[var11].field1344 >= class47.field1336[var6.field693].field1344) {
                    var6.field693 = var11;
                    var6.field694 = 0;
                    var6.field695 = 0;
                    var6.field696 = var12;
                    var6.field697 = 0;
                    var6.field692 = var6.field715;
                }
            }
            if ((var7 & 16) != 0) {
                int var14 = arg2.method406(-584);
                int var15 = arg2.method405(this.field134);
                var6.method205(field542, -516, var15, var14);
                var6.field703 = field542 + 300;
                var6.field704 = arg2.method405(this.field134);
                var6.field705 = arg2.method407((byte) 2);
            }
            if ((var7 & 32) != 0) {
                var6.field700 = arg2.method388();
                var6.field701 = arg2.method414(-660);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    public final void method92(byte arg0, int arg1) {
        class25 var3 = class25.method276(arg1);
        for (int var4 = 0; var4 < var3.field945.length && var3.field945[var4] != -1; ++var4) {
            class25 var5 = class25.method276(var3.field945[var4]);
            if (var5.field957 == 1) {
                this.method92((byte) 90, var5.field944);
            }
            var5.field935 = 0;
            var5.field927 = 0;
        }
        if (arg0 != 90) {
            this.field118 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field422) {
            this.method109(15226);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LFHOAYGUJ;II)V")
    public final void method93(class16 arg0, int arg1, int arg2) {
        if (arg2 != 4) {
            this.method6();
        }
        this.method94(arg0.field706, true, arg1, arg0.field707);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZII)V")
    public final void method94(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg0 >= 128 && arg3 >= 128 && arg0 <= 13056 && arg3 <= 13056) {
            int var5 = this.method153(arg3, arg0, -926, this.field459) - arg2;
            if (!arg1) {
                this.field186 = -371;
            }
            int var6 = arg0 - this.field480;
            int var7 = var5 - this.field481;
            int var8 = arg3 - this.field482;
            int var9 = class26.field1054[this.field483];
            int var10 = class26.field1055[this.field483];
            int var11 = class26.field1054[this.field484];
            int var12 = class26.field1055[this.field484];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field306 = (var13 << 9) / var17 + class54.field1468;
                this.field307 = (var16 << 9) / var17 + class54.field1469;
            } else {
                this.field306 = -1;
                this.field307 = -1;
            }
        } else {
            this.field306 = -1;
            this.field307 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    public final void method95(int arg0) {
        this.field164 = 0;
        for (int var2 = -1; var2 < this.field396 + this.field293; ++var2) {
            class16 var19;
            if (var2 == -1) {
                var19 = field254;
            } else if (var2 < this.field293) {
                var19 = this.field292[this.field294[var2]];
            } else {
                var19 = this.field395[this.field397[var2 - this.field293]];
            }
            if (var19 != null && var19.method166(5)) {
                if (var19 instanceof class70) {
                    class45 var20 = ((class70) var19).field1736;
                    if (var20.field1292 != null) {
                        var20 = var20.method437(505);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field293) {
                    class45 var23 = ((class70) var19).field1736;
                    if (var23.field1320 >= 0 && var23.field1320 < this.field148.length) {
                        this.method93(var19, var19.field680 + 15, 4);
                        if (this.field306 > -1) {
                            this.field148[var23.field1320].method458(48946, this.field307 - 30, this.field306 - 12);
                        }
                    }
                    if (this.field124 == 1 && this.field397[var2 - this.field293] == this.field81 && field542 % 20 < 10) {
                        this.method93(var19, var19.field680 + 15, 4);
                        if (this.field306 > -1) {
                            this.field354[0].method458(48946, this.field307 - 28, this.field306 - 12);
                        }
                    }
                } else {
                    int var21 = 30;
                    class6 var22 = (class6) var19;
                    if (var22.field581 != -1 || var22.field582 != -1) {
                        this.method93(var19, var19.field680 + 15, 4);
                        if (this.field306 > -1) {
                            if (var22.field581 != -1) {
                                this.field285[var22.field581].method458(48946, this.field307 - var21, this.field306 - 12);
                                var21 += 25;
                            }
                            if (var22.field582 != -1) {
                                this.field148[var22.field582].method458(48946, this.field307 - var21, this.field306 - 12);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field124 == 10 && this.field294[var2] == this.field125) {
                        this.method93(var19, var19.field680 + 15, 4);
                        if (this.field306 > -1) {
                            this.field354[1].method458(48946, this.field307 - var21, this.field306 - 12);
                        }
                    }
                }
                if (var19.field719 != null && (var2 >= this.field293 || this.field185 == 0 || this.field185 == 3 || this.field185 == 1 && this.method30(426, ((class6) var19).field604))) {
                    this.method93(var19, var19.field680, 4);
                    if (this.field306 > -1 && this.field164 < this.field165) {
                        this.field169[this.field164] = this.field546.method588(var19.field719, true) / 2;
                        this.field168[this.field164] = this.field546.field1708;
                        this.field166[this.field164] = this.field306;
                        this.field167[this.field164] = this.field307;
                        this.field170[this.field164] = var19.field667;
                        this.field171[this.field164] = var19.field679;
                        this.field172[this.field164] = var19.field720;
                        this.field173[this.field164++] = var19.field719;
                        if (this.field159 == 0 && var19.field679 >= 1 && var19.field679 <= 3) {
                            this.field168[this.field164] += 10;
                            this.field167[this.field164] += 5;
                        }
                        if (this.field159 == 0 && var19.field679 == 4) {
                            this.field169[this.field164] = 60;
                        }
                        if (this.field159 == 0 && var19.field679 == 5) {
                            this.field168[this.field164] += 5;
                        }
                    }
                }
                if (var19.field703 > field542) {
                    this.method93(var19, var19.field680 + 15, 4);
                    if (this.field306 > -1) {
                        int var24 = var19.field704 * 30 / var19.field705;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class52.method484(65280, this.field306 - 15, 4, this.field307 - 3, 5, var24);
                        class52.method484(16711680, this.field306 - 15 + var24, 4, this.field307 - 3, 5, 30 - var24);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field691[var25] > field542) {
                        this.method93(var19, var19.field680 / 2, 4);
                        if (this.field306 > -1) {
                            if (var25 == 1) {
                                this.field307 -= 20;
                            }
                            if (var25 == 2) {
                                this.field306 -= 15;
                                this.field307 -= 10;
                            }
                            if (var25 == 3) {
                                this.field306 += 15;
                                this.field307 -= 10;
                            }
                            this.field246[var19.field690[var25]].method458(48946, this.field307 - 12, this.field306 - 12);
                            this.field544.method585(0, 5, this.field307 + 4, this.field306, String.valueOf(var19.field689[var25]));
                            this.field544.method585(16777215, 5, this.field307 + 3, this.field306 - 1, String.valueOf(var19.field689[var25]));
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field164; ++var3) {
            int var4 = this.field166[var3];
            int var5 = this.field167[var3];
            int var6 = this.field169[var3];
            int var7 = this.field168[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field167[var18] - this.field168[var18] && var5 - var7 < this.field167[var18] + 2 && var4 - var6 < this.field169[var18] + this.field166[var18] && var4 + var6 > this.field166[var18] - this.field169[var18] && this.field167[var18] - this.field168[var18] < var5) {
                        var5 = this.field167[var18] - this.field168[var18];
                        var8 = true;
                    }
                }
            }
            this.field306 = this.field166[var3];
            this.field307 = this.field167[var3] = var5;
            String var9 = this.field173[var3];
            if (this.field159 == 0) {
                int var10 = 16776960;
                if (this.field170[var3] < 6) {
                    var10 = this.field108[this.field170[var3]];
                }
                if (this.field170[var3] == 6) {
                    var10 = this.field302 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field170[var3] == 7) {
                    var10 = this.field302 % 20 < 10 ? 255 : 65535;
                }
                if (this.field170[var3] == 8) {
                    var10 = this.field302 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field170[var3] == 9) {
                    int var11 = 150 - this.field172[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field170[var3] == 10) {
                    int var12 = 150 - this.field172[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field170[var3] == 11) {
                    int var13 = 150 - this.field172[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field171[var3] == 0) {
                    this.field546.method585(0, 5, this.field307 + 1, this.field306, var9);
                    this.field546.method585(var10, 5, this.field307, this.field306, var9);
                }
                if (this.field171[var3] == 1) {
                    this.field546.method590(this.field306, var9, 0, this.field302, 34, this.field307 + 1);
                    this.field546.method590(this.field306, var9, var10, this.field302, 34, this.field307);
                }
                if (this.field171[var3] == 2) {
                    this.field546.method591(this.field302, this.field306, false, 0, this.field307 + 1, var9);
                    this.field546.method591(this.field302, this.field306, false, var10, this.field307, var9);
                }
                if (this.field171[var3] == 3) {
                    this.field546.method592(0, 150 - this.field172[var3], this.field475, this.field307 + 1, this.field306, this.field302, var9);
                    this.field546.method592(var10, 150 - this.field172[var3], this.field475, this.field307, this.field306, this.field302, var9);
                }
                if (this.field171[var3] == 4) {
                    int var14 = this.field546.method588(var9, true);
                    int var15 = (150 - this.field172[var3]) * (var14 + 100) / 150;
                    class52.method481(this.field306 - 50, 0, 0, this.field306 + 50, 334);
                    this.field546.method589(0, var9, this.field306 + 50 - var15, this.field307 + 1, -312);
                    this.field546.method589(var10, var9, this.field306 + 50 - var15, this.field307, -312);
                    class52.method480((byte) 3);
                }
                if (this.field171[var3] == 5) {
                    int var16 = 150 - this.field172[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class52.method481(0, 0, this.field307 - this.field546.field1708 - 1, 512, this.field307 + 5);
                    this.field546.method585(0, 5, this.field307 + 1 + var17, this.field306, var9);
                    this.field546.method585(var10, 5, this.field307 + var17, this.field306, var9);
                    class52.method480((byte) 3);
                }
            } else {
                this.field546.method585(0, 5, this.field307 + 1, this.field306, var9);
                this.field546.method585(16776960, 5, this.field307, this.field306, var9);
            }
        }
        if (arg0 <= 0) {
            this.field345 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
    public final void method96(int arg0, long arg1) {
        if (arg0 != 20382) {
            this.field118 = null;
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field339; ++var4) {
                if (this.field519[var4] == arg1) {
                    --this.field339;
                    this.field268 = true;
                    for (int var5 = var4; var5 < this.field339; ++var5) {
                        this.field519[var5] = this.field519[var5 + 1];
                    }
                    this.field466.method375(115, this.field496);
                    this.field466.method382(arg1, this.field253);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
    public final void method97(int arg0) {
        if (arg0 <= 0) {
            this.method6();
        }
        this.field305 = 0;
        int var2 = (field254.field706 >> 7) + this.field358;
        int var3 = (field254.field707 >> 7) + this.field359;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field305 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field305 = 1;
        }
        if (this.field305 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field305 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)I")
    public final int method98(boolean arg0) {
        if (!arg0) {
            return 2;
        } else {
            int var2 = 3;
            if (this.field483 < 310) {
                int var3 = this.field480 >> 7;
                int var4 = this.field482 >> 7;
                int var5 = field254.field706 >> 7;
                int var6 = field254.field707 >> 7;
                if ((this.field460[this.field459][var3][var4] & 4) != 0) {
                    var2 = this.field459;
                }
                int var7;
                if (var5 > var3) {
                    var7 = var5 - var3;
                } else {
                    var7 = var3 - var5;
                }
                int var8;
                if (var6 > var4) {
                    var8 = var6 - var4;
                } else {
                    var8 = var4 - var6;
                }
                if (var7 > var8) {
                    int var9 = var8 * 65536 / var7;
                    int var10 = 32768;
                    while (var3 != var5) {
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field460[this.field459][var3][var4] & 4) != 0) {
                            var2 = this.field459;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field460[this.field459][var3][var4] & 4) != 0) {
                                var2 = this.field459;
                            }
                        }
                    }
                } else {
                    int var11 = var7 * 65536 / var8;
                    int var12 = 32768;
                    while (var4 != var6) {
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field460[this.field459][var3][var4] & 4) != 0) {
                            var2 = this.field459;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field460[this.field459][var3][var4] & 4) != 0) {
                                var2 = this.field459;
                            }
                        }
                    }
                }
            }
            if ((this.field460[this.field459][field254.field706 >> 7][field254.field707 >> 7] & 4) != 0) {
                var2 = this.field459;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(I)I")
    public final int method99(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        int var3 = this.method153(this.field482, this.field480, -926, this.field459);
        return var3 - this.field481 < 800 && (this.field460[this.field459][this.field480 >> 7][this.field482 >> 7] & 4) != 0 ? this.field459 : 3;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public final void method100(byte arg0) {
        if (this.field537 >= 2 || this.field327 != 0 || this.field401 != 0) {
            String var2;
            if (this.field327 == 1 && this.field537 < 2) {
                var2 = "Use " + this.field331 + " with...";
            } else if (this.field401 == 1 && this.field537 < 2) {
                var2 = this.field404 + "...";
            } else {
                var2 = this.field79[this.field537 - 1];
            }
            if (this.field537 > 2) {
                var2 = var2 + "@whi@ / " + (this.field537 - 2) + " more options";
            }
            this.field546.method594(true, 4, 8, var2, 16777215, field542 / 1000, 15);
            if (arg0 != -63) {
                this.field524 = 118;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method10(int arg0) {
        this.field377 = true;
        if (arg0 != 25399) {
            this.method6();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;IIILjava/lang/String;)LNXFIIFAD;")
    public final class41 method101(int arg0, String arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg3 != 4) {
            field287 = -344;
        }
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field467[0] != null) {
                var7 = this.field467[0].method548(arg0, 0);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field574.reset();
            this.field574.update(var7);
            int var9 = (int) this.field574.getValue();
            if (arg2 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class41(var7, this.field535);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method13(arg4, (byte) 6, "Requesting " + arg1);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method155(arg5 + arg2);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class37 var17 = new class37(var16, -670);
                    var17.field1212 = 3;
                    int var18 = var17.method390() + 6;
                    int var19 = 6;
                    var7 = new byte[var18];
                    for (int var20 = 0; var20 < 6; ++var20) {
                        var7[var20] = var16[var20];
                    }
                    while (var19 < var18) {
                        int var21 = var18 - var19;
                        if (var21 > 1000) {
                            var21 = 1000;
                        }
                        int var22 = var15.read(var7, var19, var21);
                        if (var22 < 0) {
                            (new StringBuffer("Length error: ")).append(var19).append("/").append(var18).toString();
                            throw new IOException("EOF");
                        }
                        var19 += var22;
                        int var23 = var19 * 100 / var18;
                        if (var14 != var23) {
                            this.method13(arg4, (byte) 6, "Loading " + arg1 + " - " + var23 + "%");
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field467[0] != null) {
                            this.field467[0].method549(var7, -27531, arg0, var7.length);
                        }
                    } catch (Exception var29) {
                        this.field467[0] = null;
                    }
                    if (var7 != null) {
                        this.field574.reset();
                        this.field574.update(var7);
                        int var24 = (int) this.field574.getValue();
                        if (arg2 != var24) {
                            var7 = null;
                            ++var11;
                            var12 = "Checksum error: " + var24;
                        }
                    }
                } catch (IOException var31) {
                    if (var12.equals("Unknown error")) {
                        var12 = "Connection error";
                    }
                    var7 = null;
                } catch (NullPointerException var32) {
                    var12 = "Null error";
                    var7 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                } catch (ArrayIndexOutOfBoundsException var33) {
                    var12 = "Bounds error";
                    var7 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                } catch (Exception var34) {
                    var12 = "Unexpected error";
                    var7 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                }
                if (var7 == null) {
                    for (int var26 = var8; var26 > 0; --var26) {
                        if (var11 >= 3) {
                            this.method13(arg4, (byte) 6, "Game updated - please reload page");
                            var26 = 10;
                        } else {
                            this.method13(arg4, (byte) 6, var12 + " - Retrying in " + var26);
                        }
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception var28) {
                        }
                    }
                    var8 *= 2;
                    if (var8 > 60) {
                        var8 = 60;
                    }
                    this.field378 = !this.field378;
                }
            }
            return new class41(var7, this.field535);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILIJOSTBQT;)Z")
    public final boolean method102(int arg0, class25 arg1) {
        if (arg1.field917 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field917.length; ++var3) {
                int var4 = this.method103(17208, var3, arg1);
                int var5 = arg1.field910[var3];
                if (arg1.field917[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field917[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field917[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (arg0 != 6) {
                throw new NullPointerException();
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILIJOSTBQT;)I")
    public final int method103(int arg0, int arg1, class25 arg2) {
        if (arg0 != 17208) {
            return 1;
        } else if (arg2.field925 != null && arg1 < arg2.field925.length) {
            try {
                int[] var4 = arg2.field925[arg1];
                int var5 = 0;
                int var6 = 0;
                byte var7 = 0;
                while (true) {
                    int var8 = var4[var6++];
                    int var9 = 0;
                    byte var10 = 0;
                    if (var8 == 0) {
                        return var5;
                    }
                    if (var8 == 1) {
                        var9 = this.field161[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field349[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field485[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class25 var11 = class25.method276(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class50.field1375 && (!class50.method475(var12).field1397 || field385)) {
                            for (int var13 = 0; var13 < var11.field932.length; ++var13) {
                                if (var12 + 1 == var11.field932[var13]) {
                                    var9 += var11.field919[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field498[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field531[this.field349[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field498[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field254.field595;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class72.field1753; ++var14) {
                            if (class72.field1755[var14]) {
                                var9 += this.field349[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class25 var15 = class25.method276(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class50.field1375 && (!class50.method475(var16).field1397 || field385)) {
                            for (int var17 = 0; var17 < var15.field932.length; ++var17) {
                                if (var15.field932[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field220;
                    }
                    if (var8 == 12) {
                        var9 = this.field281;
                    }
                    if (var8 == 13) {
                        int var18 = this.field498[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class39 var21 = class39.field1232[var20];
                        int var22 = var21.field1234;
                        int var23 = var21.field1235;
                        int var24 = var21.field1236;
                        int var25 = field448[var24 - var23];
                        var9 = this.field498[var22] >> var23 & var25;
                    }
                    if (var8 == 15) {
                        var10 = 1;
                    }
                    if (var8 == 16) {
                        var10 = 2;
                    }
                    if (var8 == 17) {
                        var10 = 3;
                    }
                    if (var8 == 18) {
                        var9 = (field254.field706 >> 7) + this.field358;
                    }
                    if (var8 == 19) {
                        var9 = (field254.field707 >> 7) + this.field359;
                    }
                    if (var8 == 20) {
                        var9 = var4[var6++];
                    }
                    if (var10 == 0) {
                        if (var7 == 0) {
                            var5 += var9;
                        }
                        if (var7 == 1) {
                            var5 -= var9;
                        }
                        if (var7 == 2 && var9 != 0) {
                            var5 /= var9;
                        }
                        if (var7 == 3) {
                            var5 *= var9;
                        }
                        var7 = 0;
                    } else {
                        var7 = var10;
                    }
                }
            } catch (Exception var26) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
    public final void method104(int arg0) {
        if (arg0 != 0) {
            this.method6();
        }
        this.field176.method360(-921);
        class54.field1474 = this.field194;
        this.field202.method20(48946, 0, 0);
        if (this.field229 != -1) {
            this.method105(0, class25.method276(this.field229), 0, (byte) -21, 0);
        } else if (this.field278[this.field270] != -1) {
            this.method105(0, class25.method276(this.field278[this.field270]), 0, (byte) -21, 0);
        }
        if (this.field408 && this.field87 == 1) {
            this.method60(0);
        }
        this.field176.method361(super.field25, 553, 205, (byte) 1);
        this.field178.method360(-921);
        class54.field1474 = this.field195;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILIJOSTBQT;IBI)V")
    public final void method105(int arg0, class25 arg1, int arg2, byte arg3, int arg4) {
        if (arg1.field957 == 0 && arg1.field945 != null) {
            if (!arg1.field948 || this.field576 == arg1.field944 || this.field146 == arg1.field944 || this.field504 == arg1.field944) {
                int var6 = class52.field1441;
                int var7 = class52.field1439;
                int var8 = class52.field1442;
                int var9 = class52.field1440;
                if (arg3 != -21) {
                    this.field118 = null;
                }
                class52.method481(arg0, 0, arg4, arg1.field933 + arg0, arg1.field960 + arg4);
                int var10 = arg1.field945.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg1.field912[var11] + arg0;
                    int var13 = arg1.field904[var11] + arg4 - arg2;
                    class25 var14 = class25.method276(arg1.field945[var11]);
                    int var15 = var14.field950 + var12;
                    int var16 = var14.field975 + var13;
                    if (var14.field951 > 0) {
                        this.method158(var14, 0);
                    }
                    if (var14.field957 == 0) {
                        if (var14.field906 > var14.field937 - var14.field960) {
                            var14.field906 = var14.field937 - var14.field960;
                        }
                        if (var14.field906 < 0) {
                            var14.field906 = 0;
                        }
                        this.method105(var15, var14, var14.field906, (byte) -21, var16);
                        if (var14.field937 > var14.field960) {
                            this.method80(var14.field937, var14.field933 + var15, var14.field960, this.field570, var14.field906, var16);
                        }
                    } else if (var14.field957 != 1) {
                        if (var14.field957 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field960; ++var18) {
                                for (int var19 = 0; var19 < var14.field933; ++var19) {
                                    int var20 = (var14.field938 + 32) * var19 + var15;
                                    int var21 = (var14.field952 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field900[var17];
                                        var21 += var14.field955[var17];
                                    }
                                    if (var14.field932[var17] <= 0) {
                                        if (var14.field966 != null && var17 < 20) {
                                            class48 var30 = var14.field966[var17];
                                            if (var30 != null) {
                                                var30.method458(48946, var21, var20);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field932[var17] - 1;
                                        if (var20 > class52.field1441 - 32 && var20 < class52.field1442 && var21 > class52.field1439 - 32 && var21 < class52.field1440 || this.field456 != 0 && this.field455 == var17) {
                                            int var25 = 0;
                                            if (this.field327 == 1 && this.field328 == var17 && this.field329 == var14.field944) {
                                                var25 = 16777215;
                                            }
                                            class48 var26 = class50.method468(var25, var14.field919[var17], var24, false);
                                            if (var26 != null) {
                                                if (this.field456 != 0 && this.field455 == var17 && this.field454 == var14.field944) {
                                                    var22 = super.field33 - this.field457;
                                                    var23 = super.field34 - this.field458;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field188 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method460(true, 128, var20 + var22, var21 + var23);
                                                    if (var21 + var23 < class52.field1439 && arg1.field906 > 0) {
                                                        int var27 = (class52.field1439 - var21 - var23) * this.field321 / 3;
                                                        if (var27 > this.field321 * 10) {
                                                            var27 = this.field321 * 10;
                                                        }
                                                        if (var27 > arg1.field906) {
                                                            var27 = arg1.field906;
                                                        }
                                                        arg1.field906 -= var27;
                                                        this.field458 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class52.field1440 && arg1.field906 < arg1.field937 - arg1.field960) {
                                                        int var28 = (var21 + var23 + 32 - class52.field1440) * this.field321 / 3;
                                                        if (var28 > this.field321 * 10) {
                                                            var28 = this.field321 * 10;
                                                        }
                                                        if (var28 > arg1.field937 - arg1.field960 - arg1.field906) {
                                                            var28 = arg1.field937 - arg1.field960 - arg1.field906;
                                                        }
                                                        arg1.field906 += var28;
                                                        this.field458 -= var28;
                                                    }
                                                } else if (this.field511 != 0 && this.field510 == var17 && this.field509 == var14.field944) {
                                                    var26.method460(true, 128, var20, var21);
                                                } else {
                                                    var26.method458(48946, var21, var20);
                                                }
                                                if (var26.field1366 == 33 || var14.field919[var17] != 1) {
                                                    int var29 = var14.field919[var17];
                                                    this.field544.method589(0, method56(var29, -419), var20 + 1 + var22, var21 + 10 + var23, -312);
                                                    this.field544.method589(16776960, method56(var29, -419), var20 + var22, var21 + 9 + var23, -312);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field957 == 3) {
                            boolean var31 = false;
                            if (this.field504 == var14.field944 || this.field146 == var14.field944 || this.field576 == var14.field944) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method102(6, var14)) {
                                var32 = var14.field936;
                                if (var31 && var14.field972 != 0) {
                                    var32 = var14.field972;
                                }
                            } else {
                                var32 = var14.field963;
                                if (var31 && var14.field931 != 0) {
                                    var32 = var14.field931;
                                }
                            }
                            if (var14.field905 == 0) {
                                if (var14.field911) {
                                    class52.method484(var32, var15, 4, var16, var14.field960, var14.field933);
                                } else {
                                    class52.method485(true, var16, var14.field933, var15, var32, var14.field960);
                                }
                            } else if (var14.field911) {
                                class52.method483((byte) -86, var14.field960, var16, var15, 256 - (var14.field905 & 255), var32, var14.field933);
                            } else {
                                class52.method486(var32, var15, 256 - (var14.field905 & 255), var16, var14.field960, var14.field933, false);
                            }
                        } else if (var14.field957 == 4) {
                            class67 var33 = var14.field971;
                            String var34 = var14.field949;
                            boolean var35 = false;
                            if (this.field504 == var14.field944 || this.field146 == var14.field944 || this.field576 == var14.field944) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method102(6, var14)) {
                                var36 = var14.field936;
                                if (var35 && var14.field972 != 0) {
                                    var36 = var14.field972;
                                }
                                if (var14.field920.length() > 0) {
                                    var34 = var14.field920;
                                }
                            } else {
                                var36 = var14.field963;
                                if (var35 && var14.field931 != 0) {
                                    var36 = var14.field931;
                                }
                            }
                            if (var14.field970 == 6 && this.field530) {
                                var34 = "Please wait...";
                                var36 = var14.field963;
                            }
                            if (class52.field1437 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field1708 + var16;
                            while (var34.length() > 0) {
                                if (var34.indexOf("%") != -1) {
                                    label393: while (true) {
                                        int var38 = var34.indexOf("%1");
                                        if (var38 == -1) {
                                            while (true) {
                                                int var39 = var34.indexOf("%2");
                                                if (var39 == -1) {
                                                    while (true) {
                                                        int var40 = var34.indexOf("%3");
                                                        if (var40 == -1) {
                                                            while (true) {
                                                                int var41 = var34.indexOf("%4");
                                                                if (var41 == -1) {
                                                                    while (true) {
                                                                        int var42 = var34.indexOf("%5");
                                                                        if (var42 == -1) {
                                                                            break label393;
                                                                        }
                                                                        var34 = var34.substring(0, var42) + this.method64(this.method103(17208, 4, var14), 38990) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method64(this.method103(17208, 3, var14), 38990) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method64(this.method103(17208, 2, var14), 38990) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method64(this.method103(17208, 1, var14), 38990) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method64(this.method103(17208, 0, var14), 38990) + var34.substring(var38 + 2);
                                    }
                                }
                                int var43 = var34.indexOf("\\n");
                                String var44;
                                if (var43 != -1) {
                                    var44 = var34.substring(0, var43);
                                    var34 = var34.substring(var43 + 2);
                                } else {
                                    var44 = var34;
                                    var34 = "";
                                }
                                if (var14.field965) {
                                    var33.method586(var36, var14.field941, var37, (byte) 5, var14.field933 / 2 + var15, var44);
                                } else {
                                    var33.method593((byte) 104, var36, var15, var14.field941, var37, var44);
                                }
                                var37 += var33.field1708;
                            }
                        } else if (var14.field957 == 5) {
                            class48 var45;
                            if (this.method102(6, var14)) {
                                var45 = var14.field913;
                            } else {
                                var45 = var14.field928;
                            }
                            if (var45 != null) {
                                var45.method458(48946, var16, var15);
                            }
                        } else if (var14.field957 == 6) {
                            int var46 = class54.field1468;
                            int var47 = class54.field1469;
                            class54.field1468 = var14.field933 / 2 + var15;
                            class54.field1469 = var14.field960 / 2 + var16;
                            int var48 = class54.field1472[var14.field915] * var14.field914 >> 16;
                            int var49 = class54.field1473[var14.field915] * var14.field914 >> 16;
                            boolean var50 = this.method102(6, var14);
                            int var51;
                            if (var50) {
                                var51 = var14.field940;
                            } else {
                                var51 = var14.field939;
                            }
                            class26 var52;
                            if (var51 == -1) {
                                var52 = var14.method268(var50, -1, -1, 670);
                            } else {
                                class47 var53 = class47.field1336[var51];
                                var52 = var14.method268(var50, var53.field1339[var14.field935], var53.field1338[var14.field935], 670);
                            }
                            if (var52 != null) {
                                var52.method302(0, var14.field916, 0, var14.field915, 0, var48, var49);
                            }
                            class54.field1468 = var46;
                            class54.field1469 = var47;
                        } else {
                            if (var14.field957 == 7) {
                                class67 var54 = var14.field971;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field960; ++var56) {
                                    for (int var57 = 0; var57 < var14.field933; ++var57) {
                                        if (var14.field932[var55] > 0) {
                                            class50 var58 = class50.method475(var14.field932[var55] - 1);
                                            String var59 = String.valueOf(var58.field1410);
                                            if (var58.field1403 || var14.field919[var55] != 1) {
                                                var59 = var59 + " x" + method134(var14.field919[var55], (byte) 113);
                                            }
                                            int var60 = (var14.field938 + 115) * var57 + var15;
                                            int var61 = (var14.field952 + 12) * var56 + var16;
                                            if (var14.field965) {
                                                var54.method586(var14.field963, var14.field941, var61, (byte) 5, var14.field933 / 2 + var60, var59);
                                            } else {
                                                var54.method593((byte) 104, var14.field963, var60, var14.field941, var61, var59);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                            if (var14.field957 == 8 && (this.field343 == var14.field944 || this.field430 == var14.field944 || this.field114 == var14.field944) && this.field264 == 100) {
                                int var62 = 0;
                                int var63 = 0;
                                class67 var64 = this.field545;
                                String var65 = var14.field949;
                                while (var65.length() > 0) {
                                    int var72 = var65.indexOf("\\n");
                                    String var73;
                                    if (var72 != -1) {
                                        var73 = var65.substring(0, var72);
                                        var65 = var65.substring(var72 + 2);
                                    } else {
                                        var73 = var65;
                                        var65 = "";
                                    }
                                    int var74 = var64.method587(var73, -24375);
                                    if (var74 > var62) {
                                        var62 = var74;
                                    }
                                    var63 += var64.field1708 + 1;
                                }
                                var62 += 6;
                                var63 += 7;
                                int var66 = var14.field933 + var15 - 5 - var62;
                                int var67 = var14.field960 + var16 + 5;
                                if (var66 < var15 + 5) {
                                    var66 = var15 + 5;
                                }
                                if (var62 + var66 > arg1.field933 + arg0) {
                                    var66 = arg1.field933 + arg0 - var62;
                                }
                                if (var63 + var67 > arg1.field960 + arg4) {
                                    var67 = arg1.field960 + arg4 - var63;
                                }
                                class52.method484(16777120, var66, 4, var67, var63, var62);
                                class52.method485(true, var67, var62, var66, 0, var63);
                                String var68 = var14.field949;
                                int var69 = var64.field1708 + var67 + 2;
                                while (var68.length() > 0) {
                                    int var70 = var68.indexOf("\\n");
                                    String var71;
                                    if (var70 != -1) {
                                        var71 = var68.substring(0, var70);
                                        var68 = var68.substring(var70 + 2);
                                    } else {
                                        var71 = var68;
                                        var68 = "";
                                    }
                                    var64.method593((byte) 104, 0, var66 + 3, false, var69, var71);
                                    var69 += var64.field1708 + 1;
                                }
                            }
                        }
                    }
                }
                class52.method481(var6, 0, var7, var8, var9);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILMNKDCXXG;B)V")
    private final void method106(int arg0, class37 arg1, byte arg2) {
        this.field532 = 0;
        this.field295 = 0;
        this.method85(arg0, arg1, true);
        this.method34(769, arg0, arg1);
        if (arg2 != 0) {
            this.field496 = 150;
        }
        this.method133(arg0, arg1, true);
        this.method35(143, arg1, arg0);
        for (int var4 = 0; var4 < this.field532; ++var4) {
            int var6 = this.field533[var4];
            if (field542 != this.field292[var6].field699) {
                this.field292[var6] = null;
            }
        }
        if (arg1.field1212 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1212 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field293; ++var5) {
                if (this.field292[this.field294[var5]] == null) {
                    signlink.reporterror(this.field265 + " null entry in pl list - pos:" + var5 + " size:" + this.field293);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LQEHNWGKD;III)V")
    public final void method107(class48 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 * arg1 + arg2 * arg2;
        if (arg3 != 13412) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        if (var5 > 4225 && var5 < 90000) {
            int var7 = this.field515 + this.field199 & 2047;
            int var8 = class26.field1054[var7];
            int var9 = class26.field1055[var7];
            int var10 = var8 * 256 / (this.field449 + 256);
            int var11 = var9 * 256 / (this.field449 + 256);
            int var12 = arg1 * var10 + arg2 * var11 >> 16;
            int var13 = arg1 * var11 - arg2 * var10 >> 16;
            double var14 = Math.atan2((double) var12, (double) var13);
            int var16 = (int) (Math.sin(var14) * 63.0D);
            int var17 = (int) (Math.cos(var14) * 57.0D);
            this.field236.method463(83 - var17 - 20, 20, 256, var16 + 94 + 4 - 10, 15, 20, var14, 0, 15);
        } else {
            this.method151(arg2, arg0, arg1, -46517);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= 0) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
        if (arg2 >= 1 && arg7 >= 1 && arg2 <= 102 && arg7 <= 102) {
            if (field386 && this.field459 != arg3) {
                return;
            }
            int var10 = 0;
            boolean var11 = true;
            boolean var12 = false;
            boolean var13 = false;
            if (arg1 == 0) {
                var10 = this.field217.method242(arg3, arg2, arg7);
            }
            if (arg1 == 1) {
                var10 = this.field217.method243(arg2, arg7, arg3, false);
            }
            if (arg1 == 2) {
                var10 = this.field217.method244(arg3, arg2, arg7);
            }
            if (arg1 == 3) {
                var10 = this.field217.method245(arg3, arg2, arg7);
            }
            if (var10 != 0) {
                int var14 = this.field217.method246(arg3, arg2, arg7, var10);
                int var15 = var10 >> 14 & 32767;
                int var16 = var14 & 31;
                int var17 = var14 >> 6;
                if (arg1 == 0) {
                    this.field217.method233(arg3, (byte) 8, arg7, arg2);
                    class36 var18 = class36.method363(var15);
                    if (var18.field1185) {
                        this.field571[arg3].method196(arg2, var16, (byte) 77, var17, arg7, var18.field1147);
                    }
                }
                if (arg1 == 1) {
                    this.field217.method234(arg7, arg2, 15817, arg3);
                }
                if (arg1 == 2) {
                    this.field217.method235(arg3, arg2, false, arg7);
                    class36 var19 = class36.method363(var15);
                    if (var19.field1157 + arg2 > 103 || var19.field1157 + arg7 > 103 || var19.field1160 + arg2 > 103 || var19.field1160 + arg7 > 103) {
                        return;
                    }
                    if (var19.field1185) {
                        this.field571[arg3].method197(arg2, 369, var17, var19.field1157, arg7, var19.field1160, var19.field1147);
                    }
                }
                if (arg1 == 3) {
                    this.field217.method236(arg2, arg3, (byte) 100, arg7);
                    class36 var20 = class36.method363(var15);
                    if (var20.field1185 && var20.field1155) {
                        this.field571[arg3].method199(0, arg7, arg2);
                    }
                }
            }
            if (arg4 >= 0) {
                int var21 = arg3;
                if (arg3 < 3 && (this.field460[1][arg2][arg7] & 2) == 2) {
                    var21 = arg3 + 1;
                }
                class65.method568(arg2, var21, -84, arg3, arg4, arg5, arg6, this.field571[arg3], this.field217, this.field558, arg7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
    public final void method109(int arg0) {
        this.field94 = true;
        if (arg0 != 15226) {
            this.field466.method376(23);
        }
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field427) {
                ++this.field304;
                this.method132((byte) 5);
                this.method132((byte) 5);
                this.method63(3);
                ++var4;
                if (var4 > 10) {
                    long var6 = System.currentTimeMillis();
                    int var8 = (int) (var6 - var2) / 10 - var5;
                    var5 = 40 - var8;
                    if (var5 < 5) {
                        var5 = 5;
                    }
                    var4 = 0;
                    var2 = var6;
                }
                try {
                    Thread.sleep((long) var5);
                } catch (Exception var9) {
                }
            }
        } catch (Exception var10) {
        }
        this.field94 = false;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method110(byte arg0, String arg1) {
        if (arg1 != null && arg1.length() != 0) {
            String var3 = arg1;
            String[] var4 = new String[100];
            int var5 = 0;
            while (true) {
                int var6 = var3.indexOf(" ");
                if (var6 == -1) {
                    String var8 = var3.trim();
                    if (var8.length() > 0) {
                        var4[var5++] = var8.toLowerCase();
                    }
                    this.field553 = 0;
                    if (arg0 != 7) {
                        this.field466.method376(151);
                    }
                    label51: for (int var9 = 0; var9 < class50.field1375; ++var9) {
                        class50 var10 = class50.method475(var9);
                        if (var10.field1381 == -1 && var10.field1410 != null) {
                            String var11 = var10.field1410.toLowerCase();
                            for (int var12 = 0; var12 < var5; ++var12) {
                                if (var11.indexOf(var4[var12]) == -1) {
                                    continue label51;
                                }
                            }
                            this.field554[this.field553] = var11;
                            this.field555[this.field553] = var9;
                            ++this.field553;
                            if (this.field553 >= this.field554.length) {
                                return;
                            }
                        }
                    }
                    return;
                }
                String var7 = var3.substring(0, var6).trim();
                if (var7.length() > 0) {
                    var4[var5++] = var7.toLowerCase();
                }
                var3 = var3.substring(var6 + 1);
            }
        } else {
            this.field553 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
    public final void method111(boolean arg0) {
        byte[] var2 = this.field529.method431("title.dat", (byte[]) null);
        class48 var3 = new class48(var2, this);
        this.field311.method360(-921);
        var3.method456((byte) -21, 0, 0);
        this.field312.method360(-921);
        var3.method456((byte) -21, -637, 0);
        this.field308.method360(-921);
        var3.method456((byte) -21, -128, 0);
        this.field309.method360(-921);
        var3.method456((byte) -21, -202, -371);
        this.field310.method360(-921);
        var3.method456((byte) -21, -202, -171);
        this.field313.method360(-921);
        var3.method456((byte) -21, 0, -265);
        this.field314.method360(-921);
        var3.method456((byte) -21, -562, -265);
        this.field315.method360(-921);
        var3.method456((byte) -21, -128, -171);
        this.field316.method360(-921);
        var3.method456((byte) -21, -562, -171);
        int[] var4 = new int[var3.field1362];
        for (int var5 = 0; var5 < var3.field1363; ++var5) {
            for (int var10 = 0; var10 < var3.field1362; ++var10) {
                var4[var10] = var3.field1361[var3.field1362 * var5 + (var3.field1362 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1362; ++var11) {
                var3.field1361[var3.field1362 * var5 + var11] = var4[var11];
            }
        }
        this.field311.method360(-921);
        if (arg0) {
            this.field299 = this.field156.method514();
        }
        var3.method456((byte) -21, 382, 0);
        this.field312.method360(-921);
        var3.method456((byte) -21, -255, 0);
        this.field308.method360(-921);
        var3.method456((byte) -21, 254, 0);
        this.field309.method360(-921);
        var3.method456((byte) -21, 180, -371);
        this.field310.method360(-921);
        var3.method456((byte) -21, 180, -171);
        this.field313.method360(-921);
        var3.method456((byte) -21, 382, -265);
        this.field314.method360(-921);
        var3.method456((byte) -21, -180, -265);
        this.field315.method360(-921);
        var3.method456((byte) -21, 254, -171);
        this.field316.method360(-921);
        var3.method456((byte) -21, -180, -171);
        class48 var6 = new class48(this.field529, "logo", 0);
        this.field308.method360(-921);
        var6.method458(48946, 18, 382 - var6.field1362 / 2 - 128);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
    public final boolean method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var39 = 0; var39 < var14; ++var39) {
                this.field379[var15][var39] = 0;
                this.field261[var15][var39] = 99999999;
            }
        }
        int var16 = arg1;
        int var17 = arg3;
        this.field379[arg1][arg3] = 99;
        this.field261[arg1][arg3] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field563[var18] = arg1;
        int var40 = var18 + 1;
        this.field564[var18] = arg3;
        boolean var20 = false;
        int var21 = this.field563.length;
        int[][] var22 = this.field571[this.field459].field663;
        if (arg9 <= 0) {
            this.field374 = this.field156.method514();
        }
        while (var40 != var19) {
            var16 = this.field563[var19];
            var17 = this.field564[var19];
            var19 = (var19 + 1) % var21;
            if (arg4 == var16 && arg7 == var17) {
                var20 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && this.field571[this.field459].method200(arg10 - 1, arg5, 6, var16, arg7, var17, arg4)) {
                    var20 = true;
                    break;
                }
                if (arg10 < 10 && this.field571[this.field459].method201(arg7, 20484, arg10 - 1, arg5, arg4, var16, var17)) {
                    var20 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg2 != 0 && this.field571[this.field459].method202(arg2, var17, var16, arg4, arg0, arg7, false, arg8)) {
                var20 = true;
                break;
            }
            int var38 = this.field261[var16][var17] + 1;
            if (var16 > 0 && this.field379[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field563[var40] = var16 - 1;
                this.field564[var40] = var17;
                var40 = (var40 + 1) % var21;
                this.field379[var16 - 1][var17] = 2;
                this.field261[var16 - 1][var17] = var38;
            }
            if (var16 < var13 - 1 && this.field379[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field563[var40] = var16 + 1;
                this.field564[var40] = var17;
                var40 = (var40 + 1) % var21;
                this.field379[var16 + 1][var17] = 8;
                this.field261[var16 + 1][var17] = var38;
            }
            if (var17 > 0 && this.field379[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field563[var40] = var16;
                this.field564[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field379[var16][var17 - 1] = 1;
                this.field261[var16][var17 - 1] = var38;
            }
            if (var17 < var14 - 1 && this.field379[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field563[var40] = var16;
                this.field564[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field379[var16][var17 + 1] = 4;
                this.field261[var16][var17 + 1] = var38;
            }
            if (var16 > 0 && var17 > 0 && this.field379[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field563[var40] = var16 - 1;
                this.field564[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field379[var16 - 1][var17 - 1] = 3;
                this.field261[var16 - 1][var17 - 1] = var38;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field379[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field563[var40] = var16 + 1;
                this.field564[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field379[var16 + 1][var17 - 1] = 9;
                this.field261[var16 + 1][var17 - 1] = var38;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field379[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field563[var40] = var16 - 1;
                this.field564[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field379[var16 - 1][var17 + 1] = 6;
                this.field261[var16 - 1][var17 + 1] = var38;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field379[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field563[var40] = var16 + 1;
                this.field564[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field379[var16 + 1][var17 + 1] = 12;
                this.field261[var16 + 1][var17 + 1] = var38;
            }
        }
        this.field387 = 0;
        if (!var20) {
            if (!arg11) {
                return false;
            }
            int var23 = 1000;
            int var24 = 100;
            byte var25 = 10;
            for (int var26 = arg4 - var25; var26 <= arg4 + var25; ++var26) {
                for (int var27 = arg7 - var25; var27 <= arg7 + var25; ++var27) {
                    if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field261[var26][var27] < 100) {
                        int var28 = 0;
                        if (var26 < arg4) {
                            var28 = arg4 - var26;
                        } else if (var26 > arg0 + arg4 - 1) {
                            var28 = var26 - (arg0 + arg4 - 1);
                        }
                        int var29 = 0;
                        if (var27 < arg7) {
                            var29 = arg7 - var27;
                        } else if (var27 > arg2 + arg7 - 1) {
                            var29 = var27 - (arg2 + arg7 - 1);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var23 || var23 == var30 && this.field261[var26][var27] < var24) {
                            var23 = var30;
                            var24 = this.field261[var26][var27];
                            var16 = var26;
                            var17 = var27;
                        }
                    }
                }
            }
            if (var23 == 1000) {
                return false;
            }
            if (arg1 == var16 && arg3 == var17) {
                return false;
            }
            this.field387 = 1;
        }
        byte var31 = 0;
        this.field563[var31] = var16;
        int var41 = var31 + 1;
        this.field564[var31] = var17;
        int var32;
        int var33 = var32 = this.field379[var16][var17];
        while (arg1 != var16 || arg3 != var17) {
            if (var32 != var33) {
                var32 = var33;
                this.field563[var41] = var16;
                this.field564[var41++] = var17;
            }
            if ((var33 & 2) != 0) {
                ++var16;
            } else if ((var33 & 8) != 0) {
                --var16;
            }
            if ((var33 & 1) != 0) {
                ++var17;
            } else if ((var33 & 4) != 0) {
                --var17;
            }
            var33 = this.field379[var16][var17];
        }
        if (var41 <= 0) {
            if (arg6 == 1) {
                return false;
            } else {
                return true;
            }
        } else {
            int var34 = var41;
            if (var41 > 25) {
                var34 = 25;
            }
            --var41;
            int var35 = this.field563[var41];
            int var36 = this.field564[var41];
            if (arg6 == 0) {
                this.field466.method375(100, this.field496);
                this.field466.method376(var34 + var34 + 3);
            }
            if (arg6 == 1) {
                this.field466.method375(158, this.field496);
                this.field466.method376(var34 + var34 + 3 + 14);
            }
            if (arg6 == 2) {
                this.field466.method375(55, this.field496);
                this.field466.method376(var34 + var34 + 3);
            }
            this.field466.method410(this.field359 + var36, false);
            this.field466.method377(this.field358 + var35);
            this.field438 = this.field563[0];
            this.field439 = this.field564[0];
            for (int var37 = 1; var37 < var34; ++var37) {
                --var41;
                this.field466.method403((byte) 117, this.field563[var41] - var35);
                this.field466.method404(false, this.field564[var41] - var36);
            }
            this.field466.method403((byte) 117, super.field43[5] == 1 ? 1 : 0);
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLMNKDCXXG;)V")
    private final void method113(int arg0, byte arg1, class37 arg2) {
        arg2.method396((byte) 3);
        if (arg1 != -121) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        int var5 = arg2.method397(8, 4);
        if (var5 < this.field396) {
            for (int var6 = var5; var6 < this.field396; ++var6) {
                this.field533[this.field532++] = this.field397[var6];
            }
        }
        if (var5 > this.field396) {
            signlink.reporterror(this.field265 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field396 = 0;
            for (int var7 = 0; var7 < var5; ++var7) {
                int var8 = this.field397[var7];
                class70 var9 = this.field395[var8];
                int var10 = arg2.method397(1, 4);
                if (var10 == 0) {
                    this.field397[this.field396++] = var8;
                    var9.field699 = field542;
                } else {
                    int var11 = arg2.method397(2, 4);
                    if (var11 == 0) {
                        this.field397[this.field396++] = var8;
                        var9.field699 = field542;
                        this.field296[this.field295++] = var8;
                    } else if (var11 == 1) {
                        this.field397[this.field396++] = var8;
                        var9.field699 = field542;
                        int var12 = arg2.method397(3, 4);
                        var9.method206((byte) 8, var12, false);
                        int var13 = arg2.method397(1, 4);
                        if (var13 == 1) {
                            this.field296[this.field295++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field397[this.field396++] = var8;
                        var9.field699 = field542;
                        int var14 = arg2.method397(3, 4);
                        var9.method206((byte) 8, var14, true);
                        int var15 = arg2.method397(3, 4);
                        var9.method206((byte) 8, var15, true);
                        int var16 = arg2.method397(1, 4);
                        if (var16 == 1) {
                            this.field296[this.field295++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field533[this.field532++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(I)Z")
    public final boolean method114(int arg0) {
        if (arg0 != -23841) {
            throw new NullPointerException();
        } else {
            return signlink.wavereplay();
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
    public final void method115(boolean arg0) {
        this.field427 = false;
        while (this.field94) {
            this.field427 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field248 = null;
        this.field249 = null;
        this.field303 = null;
        this.field138 = null;
        this.field139 = null;
        this.field140 = null;
        this.field141 = null;
        this.field115 = null;
        this.field116 = null;
        this.field369 = null;
        this.field405 &= arg0;
        this.field370 = null;
        this.field492 = null;
        this.field493 = null;
    }

    @OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
    public final void method116(int arg0) {
        label117: while (true) {
            if (arg0 >= 0) {
                int var2 = 1;
                while (true) {
                    if (var2 <= 0) {
                        continue label117;
                    }
                    ++var2;
                }
            }
            try {
                int var3 = field254.field706 + this.field112;
                int var4 = field254.field707 + this.field470;
                if (this.field102 - var3 < -500 || this.field102 - var3 > 500 || this.field103 - var4 < -500 || this.field103 - var4 > 500) {
                    this.field102 = var3;
                    this.field103 = var4;
                }
                if (this.field102 != var3) {
                    this.field102 += (var3 - this.field102) / 16;
                }
                if (this.field103 != var4) {
                    this.field103 += (var4 - this.field103) / 16;
                }
                if (super.field43[1] == 1) {
                    this.field516 += (-24 - this.field516) / 2;
                } else if (super.field43[2] == 1) {
                    this.field516 += (24 - this.field516) / 2;
                } else {
                    this.field516 /= 2;
                }
                if (super.field43[3] == 1) {
                    this.field517 += (12 - this.field517) / 2;
                } else if (super.field43[4] == 1) {
                    this.field517 += (-12 - this.field517) / 2;
                } else {
                    this.field517 /= 2;
                }
                this.field515 = this.field516 / 2 + this.field515 & 2047;
                this.field514 += this.field517 / 2;
                if (this.field514 < 128) {
                    this.field514 = 128;
                }
                if (this.field514 > 383) {
                    this.field514 = 383;
                }
                int var5 = this.field102 >> 7;
                int var6 = this.field103 >> 7;
                int var7 = this.method153(this.field103, this.field102, -926, this.field459);
                int var8 = 0;
                if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        for (int var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                            int var11 = this.field459;
                            if (var11 < 3 && (this.field460[1][var9][var10] & 2) == 2) {
                                ++var11;
                            }
                            int var12 = var7 - this.field558[var11][var9][var10];
                            if (var12 > var8) {
                                var8 = var12;
                            }
                        }
                    }
                }
                int var13 = var8 * 192;
                if (var13 > 98048) {
                    var13 = 98048;
                }
                if (var13 < 32768) {
                    var13 = 32768;
                }
                if (var13 > this.field320) {
                    this.field320 += (var13 - this.field320) / 24;
                    return;
                }
                if (var13 < this.field320) {
                    this.field320 += (var13 - this.field320) / 80;
                    return;
                }
                return;
            } catch (Exception var14) {
                signlink.reporterror("glfc_ex " + field254.field706 + "," + field254.field707 + "," + this.field102 + "," + this.field103 + "," + this.field577 + "," + this.field578 + "," + this.field358 + "," + this.field359);
                throw new RuntimeException("eek");
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIILIJOSTBQT;III)V")
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, class25 arg5, int arg6, int arg7, int arg8) {
        if (arg8 != 0) {
            this.field216 = this.field156.method514();
        }
        if (this.field150) {
            this.field151 = 32;
        } else {
            this.field151 = 0;
        }
        this.field150 = false;
        if (arg6 >= arg7 && arg6 < arg7 + 16 && arg1 >= arg4 && arg1 < arg4 + 16) {
            arg5.field906 -= this.field190 * 4;
            if (arg3 == 1) {
                this.field268 = true;
            }
            if (arg3 == 2 || arg3 == 3) {
                this.field350 = true;
            }
        } else if (arg6 >= arg7 && arg6 < arg7 + 16 && arg1 >= arg2 + arg4 - 16 && arg1 < arg2 + arg4) {
            arg5.field906 += this.field190 * 4;
            if (arg3 == 1) {
                this.field268 = true;
            }
            if (arg3 == 2 || arg3 == 3) {
                this.field350 = true;
            }
        } else if (arg6 >= arg7 - this.field151 && arg6 < arg7 + 16 + this.field151 && arg1 >= arg4 + 16 && arg1 < arg2 + arg4 - 16 && this.field190 > 0) {
            int var10 = (arg2 - 32) * arg2 / arg0;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg1 - arg4 - 16 - var10 / 2;
            int var12 = arg2 - 32 - var10;
            arg5.field906 = (arg0 - arg2) * var11 / var12;
            if (arg3 == 1) {
                this.field268 = true;
            }
            if (arg3 == 2 || arg3 == 3) {
                this.field350 = true;
            }
            this.field150 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
    public final void method118(boolean arg0) {
        try {
            if (this.field277 != null) {
                this.field277.method556();
            }
        } catch (Exception var3) {
        }
        this.field277 = null;
        this.field405 = false;
        this.field107 = 0;
        this.field265 = "";
        if (!arg0) {
            this.field299 = this.field156.method514();
        }
        this.field266 = "";
        this.method72((byte) 103);
        this.field217.method216(1785);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field571[var2].method191();
        }
        System.gc();
        this.method141(0);
        this.field323 = -1;
        this.field526 = -1;
        this.field540 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
    public final void method119(String arg0, byte arg1, String arg2) {
        if (arg1 == 5) {
            boolean var4 = false;
        } else {
            this.method6();
        }
        if (this.field178 != null) {
            this.field178.method360(-921);
            class54.field1474 = this.field195;
            int var5 = 151;
            if (arg0 != null) {
                var5 -= 7;
            }
            this.field545.method585(0, 5, var5, 257, arg2);
            this.field545.method585(16777215, 5, var5 - 1, 256, arg2);
            var5 += 15;
            if (arg0 != null) {
                this.field545.method585(0, 5, var5, 257, arg0);
                this.field545.method585(16777215, 5, var5 - 1, 256, arg0);
            }
            this.field178.method361(super.field25, 4, 4, (byte) 1);
        } else if (super.field26 != null) {
            super.field26.method360(-921);
            class54.field1474 = this.field196;
            int var6 = 251;
            short var7 = 300;
            byte var8 = 50;
            class52.method484(0, 383 - var7 / 2, 4, var6 - 5 - var8 / 2, var8, var7);
            class52.method485(true, var6 - 5 - var8 / 2, var7, 383 - var7 / 2, 16777215, var8);
            if (arg0 != null) {
                var6 -= 7;
            }
            this.field545.method585(0, 5, var6, 383, arg2);
            this.field545.method585(16777215, 5, var6 - 1, 382, arg2);
            var6 += 15;
            if (arg0 != null) {
                this.field545.method585(0, 5, var6, 383, arg0);
                this.field545.method585(16777215, 5, var6 - 1, 382, arg0);
            }
            super.field26.method361(super.field25, 0, 0, (byte) 1);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method12(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method12(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
    public final int method120(int arg0, int arg1, int arg2, int arg3) {
        while (arg0 >= 0) {
            this.field466.method376(46);
        }
        int var5 = 256 - arg1;
        return ((arg2 & 16711935) * arg1 + (arg3 & 16711935) * var5 & -16711936) + ((arg2 & 65280) * arg1 + (arg3 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
    public final void method121(String arg0, int arg1, String arg2, int arg3) {
        if (arg1 == 0 && this.field500 != -1) {
            this.field219 = arg0;
            super.field39 = 0;
        }
        if (this.field352 == -1) {
            this.field350 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field152[var5] = this.field152[var5 - 1];
            this.field153[var5] = this.field153[var5 - 1];
            this.field154[var5] = this.field154[var5 - 1];
        }
        this.field152[0] = arg1;
        this.field153[0] = arg2;
        this.field154[0] = arg0;
        if (arg3 >= 0) {
            this.method6();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II[B)Z")
    public final boolean method122(int arg0, int arg1, byte[] arg2) {
        int var4 = 31 / arg0;
        return arg2 == null ? true : signlink.wavesave(arg2, arg1);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (this.field162 == arg0) {
            if (!this.field97 && !this.field539 && !this.field242) {
                ++field542;
                if (!this.field405) {
                    this.method32((byte) 87);
                } else {
                    this.method162((byte) 45);
                }
                this.method160(true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
    public final void method123(boolean arg0, int arg1) {
        signlink.wavevol = arg1;
        if (!arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIILCQCDOTXO;I)V")
    public final void method124(boolean arg0, int arg1, int arg2, class6 arg3, int arg4) {
        this.field405 &= arg0;
        if (field254 != arg3) {
            if (this.field537 < 400) {
                String var6;
                if (arg3.field603 == 0) {
                    var6 = arg3.field604 + method125(field254.field595, false, arg3.field595) + " (level-" + arg3.field595 + ")";
                } else {
                    var6 = arg3.field604 + " (skill-" + arg3.field603 + ")";
                }
                if (this.field327 == 1) {
                    this.field79[this.field537] = "Use " + this.field331 + " with @whi@" + var6;
                    this.field257[this.field537] = 783;
                    this.field258[this.field537] = arg1;
                    this.field255[this.field537] = arg2;
                    this.field256[this.field537] = arg4;
                    ++this.field537;
                } else if (this.field401 == 1) {
                    if ((this.field403 & 8) == 8) {
                        this.field79[this.field537] = this.field404 + " @whi@" + var6;
                        this.field257[this.field537] = 359;
                        this.field258[this.field537] = arg1;
                        this.field255[this.field537] = arg2;
                        this.field256[this.field537] = arg4;
                        ++this.field537;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field380[var7] != null) {
                            this.field79[this.field537] = this.field380[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field380[var7].equalsIgnoreCase("attack")) {
                                if (arg3.field595 > field254.field595) {
                                    var9 = 2000;
                                }
                                if (field254.field588 != 0 && arg3.field588 != 0) {
                                    if (field254.field588 == arg3.field588) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field381[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field257[this.field537] = var9 + 197;
                            }
                            if (var7 == 1) {
                                this.field257[this.field537] = var9 + 2;
                            }
                            if (var7 == 2) {
                                this.field257[this.field537] = var9 + 309;
                            }
                            if (var7 == 3) {
                                this.field257[this.field537] = var9 + 471;
                            }
                            if (var7 == 4) {
                                this.field257[this.field537] = var9 + 217;
                            }
                            this.field258[this.field537] = arg1;
                            this.field255[this.field537] = arg2;
                            this.field256[this.field537] = arg4;
                            ++this.field537;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field537; ++var8) {
                    if (this.field257[var8] == 957) {
                        this.field79[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field383 = Integer.parseInt(this.getParameter("nodeid"));
        field384 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method164(0);
        } else {
            method156(field287);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field385 = false;
        } else {
            field385 = true;
        }
        this.method2(765, 503, (byte) -94);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method125(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field502 = !field502;
        }
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return "@red@";
        } else if (var3 < -6) {
            return "@or3@";
        } else if (var3 < -3) {
            return "@or2@";
        } else if (var3 < 0) {
            return "@or1@";
        } else if (var3 > 9) {
            return "@gre@";
        } else if (var3 > 6) {
            return "@gr3@";
        } else if (var3 > 3) {
            return "@gr2@";
        } else {
            return var3 > 0 ? "@gr1@" : "@yel@";
        }
    }

    @OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
    public final void method126(int arg0) {
        if (arg0 != 48267) {
            this.field224 = this.field156.method514();
        }
        if (this.field327 == 0 && this.field401 == 0) {
            this.field79[this.field537] = "Walk here";
            this.field257[this.field537] = 957;
            this.field255[this.field537] = super.field33;
            this.field256[this.field537] = super.field34;
            ++this.field537;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class26.field1052; ++var3) {
            int var4 = class26.field1053[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field217.method246(this.field459, var5, var6, var4) >= 0) {
                    class36 var9 = class36.method363(var8);
                    if (var9.field1148 != null) {
                        var9 = var9.method368(true);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field327 == 1) {
                        this.field79[this.field537] = "Use " + this.field331 + " with @cya@" + var9.field1165;
                        this.field257[this.field537] = 230;
                        this.field258[this.field537] = var4;
                        this.field255[this.field537] = var5;
                        this.field256[this.field537] = var6;
                        ++this.field537;
                    } else if (this.field401 == 1) {
                        if ((this.field403 & 4) == 4) {
                            this.field79[this.field537] = this.field404 + " @cya@" + var9.field1165;
                            this.field257[this.field537] = 370;
                            this.field258[this.field537] = var4;
                            this.field255[this.field537] = var5;
                            this.field256[this.field537] = var6;
                            ++this.field537;
                        }
                    } else {
                        if (var9.field1197 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field1197[var10] != null) {
                                    this.field79[this.field537] = var9.field1197[var10] + " @cya@" + var9.field1165;
                                    if (var10 == 0) {
                                        this.field257[this.field537] = 641;
                                    }
                                    if (var10 == 1) {
                                        this.field257[this.field537] = 204;
                                    }
                                    if (var10 == 2) {
                                        this.field257[this.field537] = 181;
                                    }
                                    if (var10 == 3) {
                                        this.field257[this.field537] = 929;
                                    }
                                    if (var10 == 4) {
                                        this.field257[this.field537] = 1129;
                                    }
                                    this.field258[this.field537] = var4;
                                    this.field255[this.field537] = var5;
                                    this.field256[this.field537] = var6;
                                    ++this.field537;
                                }
                            }
                        }
                        this.field79[this.field537] = "Examine @cya@" + var9.field1165;
                        this.field257[this.field537] = 1927;
                        this.field258[this.field537] = var9.field1183 << 14;
                        this.field255[this.field537] = var5;
                        this.field256[this.field537] = var6;
                        ++this.field537;
                    }
                }
                if (var7 == 1) {
                    class70 var11 = this.field395[var8];
                    if (var11.field1736.field1300 == 1 && (var11.field706 & 127) == 64 && (var11.field707 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field396; ++var12) {
                            class70 var15 = this.field395[this.field397[var12]];
                            if (var15 != null && var11 != var15 && var15.field1736.field1300 == 1 && var11.field706 == var15.field706 && var11.field707 == var15.field707) {
                                this.method90(var15.field1736, this.field397[var12], var5, var6, false);
                            }
                        }
                        for (int var13 = 0; var13 < this.field293; ++var13) {
                            class6 var14 = this.field292[this.field294[var13]];
                            if (var14 != null && var11.field706 == var14.field706 && var11.field707 == var14.field707) {
                                this.method124(true, this.field294[var13], var5, var14, var6);
                            }
                        }
                    }
                    this.method90(var11.field1736, var8, var5, var6, false);
                }
                if (var7 == 0) {
                    class6 var16 = this.field292[var8];
                    if ((var16.field706 & 127) == 64 && (var16.field707 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field396; ++var17) {
                            class70 var20 = this.field395[this.field397[var17]];
                            if (var20 != null && var20.field1736.field1300 == 1 && var16.field706 == var20.field706 && var16.field707 == var20.field707) {
                                this.method90(var20.field1736, this.field397[var17], var5, var6, false);
                            }
                        }
                        for (int var18 = 0; var18 < this.field293; ++var18) {
                            class6 var19 = this.field292[this.field294[var18]];
                            if (var19 != null && var16 != var19 && var16.field706 == var19.field706 && var16.field707 == var19.field707) {
                                this.method124(true, this.field294[var18], var5, var19, var6);
                            }
                        }
                    }
                    this.method124(true, var8, var5, var16, var6);
                }
                if (var7 == 3) {
                    class61 var21 = this.field118[this.field459][var5][var6];
                    if (var21 != null) {
                        for (class15 var22 = (class15) var21.method544(false); var22 != null; var22 = (class15) var21.method546(this.field559)) {
                            class50 var23 = class50.method475(var22.field665);
                            if (this.field327 == 1) {
                                this.field79[this.field537] = "Use " + this.field331 + " with @lre@" + var23.field1410;
                                this.field257[this.field537] = 271;
                                this.field258[this.field537] = var22.field665;
                                this.field255[this.field537] = var5;
                                this.field256[this.field537] = var6;
                                ++this.field537;
                            } else if (this.field401 == 1) {
                                if ((this.field403 & 1) == 1) {
                                    this.field79[this.field537] = this.field404 + " @lre@" + var23.field1410;
                                    this.field257[this.field537] = 602;
                                    this.field258[this.field537] = var22.field665;
                                    this.field255[this.field537] = var5;
                                    this.field256[this.field537] = var6;
                                    ++this.field537;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1395 != null && var23.field1395[var24] != null) {
                                        this.field79[this.field537] = var23.field1395[var24] + " @lre@" + var23.field1410;
                                        if (var24 == 0) {
                                            this.field257[this.field537] = 42;
                                        }
                                        if (var24 == 1) {
                                            this.field257[this.field537] = 895;
                                        }
                                        if (var24 == 2) {
                                            this.field257[this.field537] = 852;
                                        }
                                        if (var24 == 3) {
                                            this.field257[this.field537] = 172;
                                        }
                                        if (var24 == 4) {
                                            this.field257[this.field537] = 493;
                                        }
                                        this.field258[this.field537] = var22.field665;
                                        this.field255[this.field537] = var5;
                                        this.field256[this.field537] = var6;
                                        ++this.field537;
                                    } else if (var24 == 2) {
                                        this.field79[this.field537] = "Take @lre@" + var23.field1410;
                                        this.field257[this.field537] = 852;
                                        this.field258[this.field537] = var22.field665;
                                        this.field255[this.field537] = var5;
                                        this.field256[this.field537] = var6;
                                        ++this.field537;
                                    }
                                }
                                this.field79[this.field537] = "Examine @lre@" + var23.field1410;
                                this.field257[this.field537] = 1253;
                                this.field258[this.field537] = var22.field665;
                                this.field255[this.field537] = var5;
                                this.field256[this.field537] = var6;
                                ++this.field537;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(I)Ljava/lang/String;")
    public final String method127(int arg0) {
        while (arg0 >= 0) {
            this.field345 = -1;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else if (super.field28 != null) {
            return "runescape.com";
        } else {
            return super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    public final void method128(byte arg0) {
        if (this.field456 == 0) {
            this.field79[0] = "Cancel";
            this.field257[0] = 1086;
            this.field537 = 1;
            if (this.field472 != -1) {
                this.field288 = 0;
                this.field338 = 0;
                this.method28(0, 4, 0, super.field34, 0, class25.method276(this.field472), super.field33, 0);
                if (this.field576 != this.field288) {
                    this.field576 = this.field288;
                }
                if (this.field338 != this.field114) {
                    this.field114 = this.field338;
                }
            } else {
                this.method140(true);
                this.field288 = 0;
                this.field338 = 0;
                if (super.field33 > 4 && super.field34 > 4 && super.field33 < 516 && super.field34 < 338) {
                    if (this.field572 != -1) {
                        this.method28(4, 4, 0, super.field34, 4, class25.method276(this.field572), super.field33, 0);
                    } else {
                        this.method126(48267);
                    }
                }
                if (this.field576 != this.field288) {
                    this.field576 = this.field288;
                }
                if (this.field338 != this.field114) {
                    this.field114 = this.field338;
                }
                this.field288 = 0;
                this.field338 = 0;
                if (super.field33 > 553 && super.field34 > 205 && super.field33 < 743 && super.field34 < 466) {
                    if (this.field229 != -1) {
                        this.method28(205, 4, 1, super.field34, 553, class25.method276(this.field229), super.field33, 0);
                    } else if (this.field278[this.field270] != -1) {
                        this.method28(205, 4, 1, super.field34, 553, class25.method276(this.field278[this.field270]), super.field33, 0);
                    }
                }
                if (this.field288 != this.field146) {
                    this.field268 = true;
                    this.field146 = this.field288;
                }
                if (this.field430 != this.field338) {
                    this.field268 = true;
                    this.field430 = this.field338;
                }
                this.field288 = 0;
                this.field338 = 0;
                if (super.field33 > 17 && super.field34 > 357 && super.field33 < 496 && super.field34 < 453) {
                    if (this.field352 != -1) {
                        this.method28(357, 4, 2, super.field34, 17, class25.method276(this.field352), super.field33, 0);
                    } else if (this.field500 != -1) {
                        this.method28(357, 4, 3, super.field34, 17, class25.method276(this.field500), super.field33, 0);
                    } else if (super.field34 < 434 && super.field33 < 426 && this.field160 == 0) {
                        this.method27(super.field34 - 357, super.field33 - 17, false);
                    }
                }
                if ((this.field352 != -1 || this.field500 != -1) && this.field504 != this.field288) {
                    this.field350 = true;
                    this.field504 = this.field288;
                }
                if ((this.field352 != -1 || this.field500 != -1) && this.field343 != this.field338) {
                    this.field350 = true;
                    this.field343 = this.field338;
                }
                boolean var2 = false;
                if (arg0 == 4) {
                    boolean var3 = false;
                } else {
                    this.field345 = -1;
                }
                while (!var2) {
                    var2 = true;
                    for (int var4 = 0; var4 < this.field537 - 1; ++var4) {
                        if (this.field257[var4] < 1000 && this.field257[var4 + 1] > 1000) {
                            String var5 = this.field79[var4];
                            this.field79[var4] = this.field79[var4 + 1];
                            this.field79[var4 + 1] = var5;
                            int var6 = this.field257[var4];
                            this.field257[var4] = this.field257[var4 + 1];
                            this.field257[var4 + 1] = var6;
                            int var7 = this.field255[var4];
                            this.field255[var4] = this.field255[var4 + 1];
                            this.field255[var4 + 1] = var7;
                            int var8 = this.field256[var4];
                            this.field256[var4] = this.field256[var4 + 1];
                            this.field256[var4 + 1] = var8;
                            int var9 = this.field258[var4];
                            this.field258[var4] = this.field258[var4 + 1];
                            this.field258[var4 + 1] = var9;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLATHECRQB;)V")
    private final void method129(byte arg0, class1 arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field3 == 0) {
            var3 = this.field217.method242(arg1.field2, arg1.field4, arg1.field5);
        }
        if (arg1.field3 == 1) {
            var3 = this.field217.method243(arg1.field4, arg1.field5, arg1.field2, false);
        }
        if (arg1.field3 == 2) {
            var3 = this.field217.method244(arg1.field2, arg1.field4, arg1.field5);
        }
        if (arg1.field3 == 3) {
            var3 = this.field217.method245(arg1.field2, arg1.field4, arg1.field5);
        }
        if (var3 != 0) {
            int var7 = this.field217.method246(arg1.field2, arg1.field4, arg1.field5, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field9 = var4;
        arg1.field11 = var5;
        arg1.field10 = var6;
        if (this.field353 != arg0) {
            for (int var8 = 1; var8 > 0; ++var8) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    public final void method130(byte arg0) {
        class31 var2 = (class31) this.field453.method543();
        if (arg0 == 1) {
            boolean var3 = false;
            while (var2 != null) {
                if (this.field459 == var2.field1084 && !var2.field1089) {
                    if (field542 >= var2.field1088) {
                        var2.method317(this.field321, (byte) 3);
                        if (var2.field1089) {
                            var2.method14();
                        } else {
                            this.field217.method227(60, 0, var2.field1084, false, var2.field1085, (byte) 9, var2, var2.field1087, var2.field1086, -1);
                        }
                    }
                } else {
                    var2.method14();
                }
                var2 = (class31) this.field453.method545(907);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
    public final void method131(boolean arg0) {
        this.field248 = new class4(this.field529, "titlebox", 0);
        this.field249 = new class4(this.field529, "titlebutton", 0);
        if (arg0) {
            this.field345 = -1;
        }
        this.field303 = new class4[12];
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field303[var2] = new class4(this.field529, "runes", var2);
        }
        this.field492 = new class48(128, 265);
        this.field493 = new class48(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field492.field1361[var3] = this.field311.field1141[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field493.field1361[var4] = this.field312.field1141[var4];
        }
        this.field139 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field139[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field139[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field139[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field139[var8 + 192] = 16777215;
        }
        this.field140 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field140[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field140[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field140[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field140[var12 + 192] = 16777215;
        }
        this.field141 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field141[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field141[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field141[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field141[var16 + 192] = 16777215;
        }
        this.field138 = new int[256];
        this.field115 = new int[32768];
        this.field116 = new int[32768];
        this.method67((class4) null, false);
        this.field369 = new int[32768];
        this.field370 = new int[32768];
        this.method13(10, (byte) 6, "Connecting to fileserver");
        if (!this.field427) {
            this.field422 = true;
            this.field427 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
    public final void method132(byte arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var19 = (int) (Math.random() * 100.0D);
            if (var19 < 50) {
                this.field369[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var16 = (int) (Math.random() * 124.0D) + 2;
            int var17 = (int) (Math.random() * 128.0D) + 128;
            int var18 = (var17 << 7) + var16;
            this.field369[var18] = 192;
        }
        if (this.field267 == arg0) {
            boolean var5 = false;
            for (int var6 = 1; var6 < var2 - 1; ++var6) {
                for (int var14 = 1; var14 < 127; ++var14) {
                    int var15 = (var6 << 7) + var14;
                    this.field370[var15] = (this.field369[var15 - 1] + this.field369[var15 + 1] + this.field369[var15 - 128] + this.field369[var15 + 128]) / 4;
                }
            }
            this.field218 += 128;
            if (this.field218 > this.field115.length) {
                this.field218 -= this.field115.length;
                int var7 = (int) (Math.random() * 12.0D);
                this.method67(this.field303[var7], false);
            }
            for (int var8 = 1; var8 < var2 - 1; ++var8) {
                for (int var11 = 1; var11 < 127; ++var11) {
                    int var12 = (var8 << 7) + var11;
                    int var13 = this.field370[var12 + 128] - this.field115[this.field218 + var12 & this.field115.length - 1] / 5;
                    if (var13 < 0) {
                        var13 = 0;
                    }
                    this.field369[var12] = var13;
                }
            }
            for (int var9 = 0; var9 < var2 - 1; ++var9) {
                this.field399[var9] = this.field399[var9 + 1];
            }
            this.field399[var2 - 1] = (int) (Math.sin((double) field542 / 14.0D) * 16.0D + Math.sin((double) field542 / 15.0D) * 14.0D + Math.sin((double) field542 / 16.0D) * 12.0D);
            if (this.field494 > 0) {
                this.field494 -= 4;
            }
            if (this.field495 > 0) {
                this.field495 -= 4;
            }
            if (this.field494 == 0 && this.field495 == 0) {
                int var10 = (int) (Math.random() * 2000.0D);
                if (var10 == 0) {
                    this.field494 = 1024;
                }
                if (var10 == 1) {
                    this.field495 = 1024;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILMNKDCXXG;Z)V")
    private final void method133(int arg0, class37 arg1, boolean arg2) {
        this.field405 &= arg2;
        while (arg1.field1213 + 10 < arg0 * 8) {
            int var4 = arg1.method397(11, 4);
            if (var4 == 2047) {
                break;
            }
            if (this.field292[var4] == null) {
                this.field292[var4] = new class6();
                if (this.field297[var4] != null) {
                    this.field292[var4].method170(-802, this.field297[var4]);
                }
            }
            this.field294[this.field293++] = var4;
            class6 var5 = this.field292[var4];
            var5.field699 = field542;
            int var6 = arg1.method397(5, 4);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg1.method397(5, 4);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg1.method397(1, 4);
            int var9 = arg1.method397(1, 4);
            if (var9 == 1) {
                this.field296[this.field295++] = var4;
            }
            var5.method204(field254.field682[0] + var6, var8 == 1, field254.field681[0] + var7, true);
        }
        arg1.method398(0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Ljava/lang/String;")
    private static final String method134(int arg0, byte arg1) {
        String var2 = String.valueOf(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1 != 113) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
    public final void method135(boolean arg0) {
        Graphics var2 = this.method11(735).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method4(1, 1);
        if (arg0) {
            this.field118 = null;
        }
        if (this.field539) {
            this.field427 = false;
            var2.setFont(new Font("Helvetica", 1, 16));
            var2.setColor(Color.yellow);
            byte var3 = 35;
            var2.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var3);
            int var5 = var3 + 50;
            var2.setColor(Color.white);
            var2.drawString("To fix this try the following (in order):", 30, var5);
            int var6 = var5 + 50;
            var2.setColor(Color.white);
            var2.setFont(new Font("Helvetica", 1, 12));
            var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var6);
            int var7 = var6 + 30;
            var2.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var7);
            int var8 = var7 + 30;
            var2.drawString("3: Try using a different game-world", 30, var8);
            int var10 = var8 + 30;
            var2.drawString("4: Try rebooting your computer", 30, var10);
            int var12 = var10 + 30;
            var2.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var12);
        }
        if (this.field242) {
            this.field427 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field97) {
            this.field427 = false;
            var2.setColor(Color.yellow);
            byte var4 = 35;
            var2.drawString("Error a copy of RuneScape already appears to be loaded", 30, var4);
            int var9 = var4 + 50;
            var2.setColor(Color.white);
            var2.drawString("To fix this try the following (in order):", 30, var9);
            int var11 = var9 + 50;
            var2.setColor(Color.white);
            var2.setFont(new Font("Helvetica", 1, 12));
            var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var11);
            int var13 = var11 + 30;
            var2.drawString("2: Try rebooting your computer, and reloading", 30, var13);
            int var14 = var13 + 30;
        }
    }

    @OriginalMember(owner = "client!client", name = "A", descriptor = "(I)V")
    public final void method136(int arg0) {
        if (arg0 >= 0) {
            this.field468 = -136;
        }
        if (this.field543 == 0) {
            if (super.field39 == 1) {
                int var2 = super.field40 - 25 - 550;
                int var3 = super.field41 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field515 + this.field199 & 2047;
                    int var5 = class54.field1472[var4];
                    int var6 = class54.field1473[var4];
                    int var7 = (this.field449 + 256) * var5 >> 8;
                    int var8 = (this.field449 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field254.field706 + var9 >> 7;
                    int var12 = field254.field707 - var10 >> 7;
                    boolean var13 = this.method112(0, field254.field681[0], 0, field254.field682[0], var11, 0, 1, var12, 0, 988, 0, true);
                    if (var13) {
                        this.field466.method376(var2);
                        this.field466.method376(var3);
                        this.field466.method377(this.field515);
                        this.field466.method376(57);
                        this.field466.method376(this.field199);
                        this.field466.method376(this.field449);
                        this.field466.method376(89);
                        this.field466.method377(field254.field706);
                        this.field466.method377(field254.field707);
                        this.field466.method376(this.field387);
                        this.field466.method376(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
    public final void method137(boolean arg0, int arg1) {
        int var3 = class22.field808[arg1].field816;
        if (var3 != 0) {
            int var4 = this.field498[arg1];
            this.field405 &= arg0;
            if (var3 == 1) {
                if (var4 == 1) {
                    class54.method506(0.9D, -625);
                }
                if (var4 == 2) {
                    class54.method506(0.8D, -625);
                }
                if (var4 == 3) {
                    class54.method506(0.7D, -625);
                }
                if (var4 == 4) {
                    class54.method506(0.6D, -625);
                }
                class50.field1412.method429();
                this.field377 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field560;
                if (var4 == 0) {
                    this.method89(this.field560, 0, false);
                    this.field560 = true;
                }
                if (var4 == 1) {
                    this.method89(this.field560, -400, false);
                    this.field560 = true;
                }
                if (var4 == 2) {
                    this.method89(this.field560, -800, false);
                    this.field560 = true;
                }
                if (var4 == 3) {
                    this.method89(this.field560, -1200, false);
                    this.field560 = true;
                }
                if (var4 == 4) {
                    this.field560 = false;
                }
                if (this.field560 != var5 && !field386) {
                    if (this.field560) {
                        this.field526 = this.field323;
                        this.field527 = true;
                        this.field132.method533(2, this.field526);
                    } else {
                        this.method141(0);
                    }
                    this.field540 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field523 = true;
                    this.method123(this.field133, 0);
                }
                if (var4 == 1) {
                    this.field523 = true;
                    this.method123(this.field133, -400);
                }
                if (var4 == 2) {
                    this.field523 = true;
                    this.method123(this.field133, -800);
                }
                if (var4 == 3) {
                    this.field523 = true;
                    this.method123(this.field133, -1200);
                }
                if (var4 == 4) {
                    this.field523 = false;
                }
            }
            if (var3 == 5) {
                this.field245 = var4;
            }
            if (var3 == 6) {
                this.field159 = var4;
            }
            if (var3 == 8) {
                this.field136 = var4;
                this.field350 = true;
            }
            if (var3 == 9) {
                this.field298 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)Z")
    public final boolean method138(boolean arg0) {
        this.field405 &= arg0;
        if (this.field277 == null) {
            return false;
        } else {
            try {
                int var2 = this.field277.method558();
                if (var2 == 0) {
                    return false;
                }
                if (this.field345 == -1) {
                    this.field277.method559(this.field462.field1211, 0, 1);
                    this.field345 = this.field462.field1211[0] & 255;
                    if (this.field156 != null) {
                        this.field345 = this.field345 - this.field156.method514() & 255;
                    }
                    this.field344 = class8.field622[this.field345];
                    --var2;
                }
                if (this.field344 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field277.method559(this.field462.field1211, 0, 1);
                    this.field344 = this.field462.field1211[0] & 255;
                    --var2;
                }
                if (this.field344 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field277.method559(this.field462.field1211, 0, 2);
                    this.field462.field1212 = 0;
                    this.field344 = this.field462.method388();
                    var2 -= 2;
                }
                if (var2 < this.field344) {
                    return false;
                }
                this.field462.field1212 = 0;
                this.field277.method559(this.field462.field1211, 0, this.field344);
                this.field346 = 0;
                this.field235 = this.field234;
                this.field234 = this.field233;
                this.field233 = this.field345;
                if (this.field345 == 159) {
                    int var3 = this.field462.method413(-817);
                    int var4 = this.field462.method415((byte) -98);
                    class25.method276(var4).field907 = 2;
                    class25.method276(var4).field908 = var3;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 89) {
                    int var5 = this.field462.method417(867);
                    int var6 = this.field462.method418(-386);
                    int var7 = this.field462.method415((byte) -98);
                    class25 var8 = class25.method276(var7);
                    var8.field950 = var6;
                    var8.field975 = var5;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 123) {
                    int var9 = this.field462.method413(-817);
                    int var10 = this.field462.method423(true);
                    this.field86[var9] = var10;
                    if (this.field498[var9] != var10) {
                        this.field498[var9] = var10;
                        this.method137(true, var9);
                        this.field268 = true;
                        if (this.field500 != -1) {
                            this.field350 = true;
                        }
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 152) {
                    if (this.field229 != -1) {
                        this.method50(8, this.field229);
                        this.field229 = -1;
                        this.field268 = true;
                        this.field78 = true;
                    }
                    if (this.field352 != -1) {
                        this.method50(8, this.field352);
                        this.field352 = -1;
                        this.field350 = true;
                    }
                    if (this.field472 != -1) {
                        this.method50(8, this.field472);
                        this.field472 = -1;
                        this.field377 = true;
                    }
                    if (this.field337 != -1) {
                        this.method50(8, this.field337);
                        this.field337 = -1;
                    }
                    if (this.field572 != -1) {
                        this.method50(8, this.field572);
                        this.field572 = -1;
                    }
                    if (this.field160 != 0) {
                        this.field160 = 0;
                        this.field350 = true;
                    }
                    this.field530 = false;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 227) {
                    this.method61(this.field462, this.field344, -12171);
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 225) {
                    long var11 = this.field462.method392((byte) -100);
                    int var13 = this.field462.method391();
                    int var14 = this.field462.method386();
                    boolean var15 = false;
                    for (int var16 = 0; var16 < 100; ++var16) {
                        if (this.field562[var16] == var13) {
                            var15 = true;
                            break;
                        }
                    }
                    if (var14 <= 1) {
                        for (int var17 = 0; var17 < this.field339; ++var17) {
                            if (this.field519[var17] == var11) {
                                var15 = true;
                                break;
                            }
                        }
                    }
                    if (!var15 && this.field305 == 0) {
                        try {
                            this.field562[this.field525] = var13;
                            this.field525 = (this.field525 + 1) % 100;
                            String var18 = class69.method600(this.field344 - 13, true, this.field462);
                            if (var14 != 3) {
                                var18 = class33.method328(this.field213, var18);
                            }
                            if (var14 != 2 && var14 != 3) {
                                if (var14 == 1) {
                                    this.method121(var18, 7, "@cr1@" + class53.method495(true, class53.method492(42220, var11)), -212);
                                } else {
                                    this.method121(var18, 3, class53.method495(true, class53.method492(42220, var11)), -212);
                                }
                            } else {
                                this.method121(var18, 7, "@cr2@" + class53.method495(true, class53.method492(42220, var11)), -212);
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 85) {
                    this.field185 = this.field462.method386();
                    this.field538 = this.field462.method386();
                    this.field129 = this.field462.method386();
                    this.field238 = true;
                    this.field350 = true;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 107) {
                    boolean var20 = this.field462.method406(-584) == 1;
                    int var21 = this.field462.method388();
                    class25.method276(var21).field948 = var20;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 242) {
                    this.field124 = this.field462.method386();
                    if (this.field124 == 1) {
                        this.field81 = this.field462.method388();
                    }
                    if (this.field124 >= 2 && this.field124 <= 6) {
                        if (this.field124 == 2) {
                            this.field122 = 64;
                            this.field123 = 64;
                        }
                        if (this.field124 == 3) {
                            this.field122 = 0;
                            this.field123 = 64;
                        }
                        if (this.field124 == 4) {
                            this.field122 = 128;
                            this.field123 = 64;
                        }
                        if (this.field124 == 5) {
                            this.field122 = 64;
                            this.field123 = 0;
                        }
                        if (this.field124 == 6) {
                            this.field122 = 64;
                            this.field123 = 128;
                        }
                        this.field124 = 2;
                        this.field119 = this.field462.method388();
                        this.field120 = this.field462.method388();
                        this.field121 = this.field462.method386();
                    }
                    if (this.field124 == 10) {
                        this.field125 = this.field462.method388();
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 216) {
                    int var22 = this.field462.method388();
                    this.method92((byte) 90, var22);
                    if (this.field229 != -1) {
                        this.method50(8, this.field229);
                        this.field229 = -1;
                        this.field268 = true;
                        this.field78 = true;
                    }
                    if (this.field352 != -1) {
                        this.method50(8, this.field352);
                        this.field352 = -1;
                        this.field350 = true;
                    }
                    if (this.field472 != -1) {
                        this.method50(8, this.field472);
                        this.field472 = -1;
                        this.field377 = true;
                    }
                    if (this.field337 != -1) {
                        this.method50(8, this.field337);
                        this.field337 = -1;
                    }
                    if (this.field572 != var22) {
                        this.method50(8, this.field572);
                        this.field572 = var22;
                    }
                    if (this.field160 != 0) {
                        this.field160 = 0;
                        this.field350 = true;
                    }
                    this.field530 = false;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 50) {
                    this.field263 = this.field462.method414(-660);
                    this.field550 = this.field462.method388();
                    this.field569 = this.field462.method415((byte) -98);
                    this.field419 = this.field462.method422(6);
                    this.field462.method407((byte) 2);
                    this.field279 = this.field462.method415((byte) -98);
                    this.field77 = this.field462.method388();
                    this.field92 = this.field462.method413(-817);
                    this.field474 = this.field462.method414(-660);
                    this.field462.method415((byte) -98);
                    this.field503 = this.field462.method414(-660);
                    signlink.dnslookup(class53.method494((byte) -85, this.field419));
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 135) {
                    this.field101 = this.field462.method386();
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 163) {
                    this.field268 = true;
                    int var23 = this.field462.method388();
                    class25 var24 = class25.method276(var23);
                    while (this.field462.field1212 < this.field344) {
                        int var25 = this.field462.method400();
                        int var26 = this.field462.method388();
                        int var27 = this.field462.method386();
                        if (var27 == 255) {
                            var27 = this.field462.method391();
                        }
                        if (var25 >= 0 && var25 < var24.field932.length) {
                            var24.field932[var25] = var26;
                            var24.field919[var25] = var27;
                        }
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 3) {
                    this.field368 = this.field462.method406(-584);
                    if (this.field368 == this.field270) {
                        if (this.field368 == 3) {
                            this.field270 = 1;
                        } else {
                            this.field270 = 3;
                        }
                        this.field268 = true;
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 250) {
                    this.field445 = this.field462.method386();
                    this.field444 = this.field462.method405(this.field134);
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 10) {
                    int var28 = this.field462.method388();
                    int var29 = this.field462.method415((byte) -98);
                    if (this.field352 != -1) {
                        this.method50(8, this.field352);
                        this.field352 = -1;
                        this.field350 = true;
                    }
                    if (this.field472 != -1) {
                        this.method50(8, this.field472);
                        this.field472 = -1;
                        this.field377 = true;
                    }
                    if (this.field337 != -1) {
                        this.method50(8, this.field337);
                        this.field337 = -1;
                    }
                    if (this.field572 != var28) {
                        this.method50(8, this.field572);
                        this.field572 = var28;
                    }
                    if (this.field229 != var29) {
                        this.method50(8, this.field229);
                        this.field229 = var29;
                    }
                    if (this.field160 != 0) {
                        this.field160 = 0;
                        this.field350 = true;
                    }
                    this.field268 = true;
                    this.field78 = true;
                    this.field530 = false;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 38) {
                    int var30 = this.field462.method388();
                    this.method92((byte) 90, var30);
                    if (this.field352 != -1) {
                        this.method50(8, this.field352);
                        this.field352 = -1;
                        this.field350 = true;
                    }
                    if (this.field472 != -1) {
                        this.method50(8, this.field472);
                        this.field472 = -1;
                        this.field377 = true;
                    }
                    if (this.field337 != -1) {
                        this.method50(8, this.field337);
                        this.field337 = -1;
                    }
                    if (this.field572 != -1) {
                        this.method50(8, this.field572);
                        this.field572 = -1;
                    }
                    if (this.field229 != var30) {
                        this.method50(8, this.field229);
                        this.field229 = var30;
                    }
                    if (this.field160 != 0) {
                        this.field160 = 0;
                        this.field350 = true;
                    }
                    this.field268 = true;
                    this.field78 = true;
                    this.field530 = false;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 139) {
                    int var31 = this.field462.method413(-817);
                    class25 var32 = class25.method276(var31);
                    for (int var33 = 0; var33 < var32.field932.length; ++var33) {
                        var32.field932[var33] = -1;
                        var32.field932[var33] = 0;
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 128 || this.field345 == 188 || this.field345 == 49 || this.field345 == 150 || this.field345 == 109 || this.field345 == 239 || this.field345 == 27 || this.field345 == 127 || this.field345 == 205 || this.field345 == 113 || this.field345 == 197) {
                    this.method81(this.field462, (byte) -77, this.field345);
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 124) {
                    this.field231 = this.field462.method388() * 30;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 176) {
                    this.method106(this.field344, this.field462, (byte) 0);
                    this.field336 = false;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 16) {
                    int var34 = this.field462.method386();
                    int var35 = this.field462.method386();
                    int var36 = this.field462.method386();
                    int var37 = this.field462.method386();
                    this.field479[var34] = true;
                    this.field96[var34] = var35;
                    this.field579[var34] = var36;
                    this.field157[var34] = var37;
                    this.field182[var34] = 0;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 144) {
                    int var38 = this.field462.method413(-817);
                    class25.method276(var38).field907 = 3;
                    if (field254.field608 == null) {
                        class25.method276(var38).field908 = (field254.field590[11] << 5) + (field254.field590[8] << 10) + (field254.field590[0] << 15) + (field254.field606[0] << 25) + (field254.field606[4] << 20) + field254.field590[1];
                    } else {
                        class25.method276(var38).field908 = (int) (field254.field608.field1285 + 305419896L);
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 93) {
                    int var39 = this.field462.method416(this.field367);
                    if (var39 >= 0) {
                        this.method92((byte) 90, var39);
                    }
                    if (this.field230 != var39) {
                        this.method50(8, this.field230);
                        this.field230 = var39;
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 115) {
                    this.field557 = false;
                    this.field160 = 2;
                    this.field80 = "";
                    this.field350 = true;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 181) {
                    this.field543 = this.field462.method386();
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 96) {
                    int var40 = this.field462.method414(-660);
                    this.method92((byte) 90, var40);
                    if (this.field229 != -1) {
                        this.method50(8, this.field229);
                        this.field229 = -1;
                        this.field268 = true;
                        this.field78 = true;
                    }
                    if (this.field472 != -1) {
                        this.method50(8, this.field472);
                        this.field472 = -1;
                        this.field377 = true;
                    }
                    if (this.field337 != -1) {
                        this.method50(8, this.field337);
                        this.field337 = -1;
                    }
                    if (this.field572 != -1) {
                        this.method50(8, this.field572);
                        this.field572 = -1;
                    }
                    if (this.field352 != var40) {
                        this.method50(8, this.field352);
                        this.field352 = var40;
                    }
                    this.field530 = false;
                    this.field350 = true;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 90) {
                    int var41 = this.field462.method417(867);
                    if (this.field500 != var41) {
                        this.method50(8, this.field500);
                        this.field500 = var41;
                    }
                    this.field350 = true;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 6) {
                    int var42 = this.field462.method415((byte) -98);
                    if (var42 == 65535) {
                        var42 = -1;
                    }
                    if (this.field323 != var42 && this.field560 && !field386 && this.field540 == 0) {
                        this.field526 = var42;
                        this.field527 = true;
                        this.field132.method533(2, this.field526);
                    }
                    this.field323 = var42;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 147) {
                    int var43 = this.field462.method414(-660);
                    int var44 = this.field462.method419(-228);
                    if (this.field560 && !field386) {
                        this.field526 = var43;
                        this.field527 = false;
                        this.field132.method533(2, this.field526);
                        this.field540 = var44;
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 207) {
                    this.field268 = true;
                    int var45 = this.field462.method388();
                    class25 var46 = class25.method276(var45);
                    int var47 = this.field462.method388();
                    for (int var48 = 0; var48 < var47; ++var48) {
                        var46.field932[var48] = this.field462.method415((byte) -98);
                        int var49 = this.field462.method405(this.field134);
                        if (var49 == 255) {
                            var49 = this.field462.method423(true);
                        }
                        var46.field919[var48] = var49;
                    }
                    for (int var50 = var47; var50 < var46.field932.length; ++var50) {
                        var46.field932[var50] = 0;
                        var46.field919[var50] = 0;
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 232) {
                    this.field98 = true;
                    this.field432 = this.field462.method386();
                    this.field433 = this.field462.method386();
                    this.field434 = this.field462.method388();
                    this.field435 = this.field462.method386();
                    this.field436 = this.field462.method386();
                    if (this.field436 >= 100) {
                        int var51 = this.field432 * 128 + 64;
                        int var52 = this.field433 * 128 + 64;
                        int var53 = this.method153(var52, var51, -926, this.field459) - this.field434;
                        int var54 = var51 - this.field480;
                        int var55 = var53 - this.field481;
                        int var56 = var52 - this.field482;
                        int var57 = (int) Math.sqrt((double) (var54 * var54 + var56 * var56));
                        this.field483 = (int) (Math.atan2((double) var55, (double) var57) * 325.949D) & 2047;
                        this.field484 = (int) (Math.atan2((double) var54, (double) var56) * -325.949D) & 2047;
                        if (this.field483 < 128) {
                            this.field483 = 128;
                        }
                        if (this.field483 > 383) {
                            this.field483 = 383;
                        }
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 177) {
                    int var58 = this.field462.method414(-660);
                    int var59 = this.field462.method388();
                    int var60 = this.field462.method414(-660);
                    class25.method276(var59).field918 = (var58 << 16) + var60;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 28) {
                    int var61 = this.field462.method413(-817);
                    int var62 = this.field462.method406(-584);
                    if (var61 == 65535) {
                        var61 = -1;
                    }
                    if (this.field278[var62] != var61) {
                        this.method50(8, this.field278[var62]);
                        this.field278[var62] = var61;
                    }
                    this.field268 = true;
                    this.field78 = true;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 138) {
                    this.field557 = false;
                    this.field160 = 1;
                    this.field80 = "";
                    this.field350 = true;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 98) {
                    int var63 = this.field462.method388();
                    int var64 = this.field462.method386();
                    int var65 = this.field462.method388();
                    if (var65 == 65535) {
                        if (this.field406 < 50) {
                            this.field301[this.field406] = (short) var63;
                            this.field499[this.field406] = var64;
                            this.field334[this.field406] = 0;
                            ++this.field406;
                        }
                    } else if (this.field523 && !field386 && this.field406 < 50) {
                        this.field301[this.field406] = var63;
                        this.field499[this.field406] = var64;
                        this.field334[this.field406] = class7.field615[var63] + var65;
                        ++this.field406;
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 29) {
                    this.method118(true);
                    this.field345 = -1;
                    return false;
                }
                if (this.field345 == 208) {
                    int var66 = this.field462.method414(-660);
                    int var67 = this.field462.method415((byte) -98);
                    this.method92((byte) 90, var67);
                    if (var66 != -1) {
                        this.method92((byte) 90, var66);
                    }
                    if (this.field572 != -1) {
                        this.method50(8, this.field572);
                        this.field572 = -1;
                    }
                    if (this.field229 != -1) {
                        this.method50(8, this.field229);
                        this.field229 = -1;
                    }
                    if (this.field352 != -1) {
                        this.method50(8, this.field352);
                        this.field352 = -1;
                    }
                    if (this.field472 != var67) {
                        this.method50(8, this.field472);
                        this.field472 = var67;
                    }
                    if (this.field337 != var67) {
                        this.method50(8, this.field337);
                        this.field337 = var66;
                    }
                    this.field160 = 0;
                    this.field530 = false;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 212) {
                    String var68 = this.field462.method393();
                    int var69 = this.field462.method415((byte) -98);
                    class25.method276(var69).field949 = var68;
                    int var10001 = this.field278[this.field270];
                    if (class25.method276(var69).field974 == var10001) {
                        this.field268 = true;
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 221 || this.field345 == 164) {
                    int var70 = this.field577;
                    int var71 = this.field578;
                    if (this.field345 == 221) {
                        var71 = this.field462.method415((byte) -98);
                        var70 = this.field462.method414(-660);
                        this.field82 = false;
                    }
                    if (this.field345 == 164) {
                        this.field462.method396((byte) 3);
                        int var72 = 0;
                        while (true) {
                            if (var72 >= 4) {
                                this.field462.method398(0);
                                var71 = this.field462.method415((byte) -98);
                                var70 = this.field462.method415((byte) -98);
                                this.field82 = true;
                                break;
                            }
                            for (int var73 = 0; var73 < 13; ++var73) {
                                for (int var74 = 0; var74 < 13; ++var74) {
                                    int var75 = this.field462.method397(1, 4);
                                    if (var75 == 1) {
                                        this.field341[var72][var73][var74] = this.field462.method397(26, 4);
                                    } else {
                                        this.field341[var72][var73][var74] = -1;
                                    }
                                }
                            }
                            ++var72;
                        }
                    }
                    if (this.field577 == var70 && this.field578 == var71 && this.field325 == 2) {
                        this.field345 = -1;
                        return true;
                    }
                    this.field577 = var70;
                    this.field578 = var71;
                    this.field358 = (this.field577 - 6) * 8;
                    this.field359 = (this.field578 - 6) * 8;
                    this.field324 = false;
                    if ((this.field577 / 8 == 48 || this.field577 / 8 == 49) && this.field578 / 8 == 48) {
                        this.field324 = true;
                    }
                    if (this.field577 / 8 == 48 && this.field578 / 8 == 148) {
                        this.field324 = true;
                    }
                    this.field325 = 1;
                    this.field269 = System.currentTimeMillis();
                    this.method119((String) null, this.field398, "Loading - please wait.");
                    if (this.field345 == 221) {
                        int var76 = 0;
                        int var77 = (this.field577 - 6) / 8;
                        label1217: while (true) {
                            if (var77 > (this.field577 + 6) / 8) {
                                this.field446 = new byte[var76][];
                                this.field205 = new byte[var76][];
                                this.field476 = new int[var76];
                                this.field477 = new int[var76];
                                this.field478 = new int[var76];
                                int var79 = 0;
                                int var80 = (this.field577 - 6) / 8;
                                while (true) {
                                    if (var80 > (this.field577 + 6) / 8) {
                                        break label1217;
                                    }
                                    for (int var81 = (this.field578 - 6) / 8; var81 <= (this.field578 + 6) / 8; ++var81) {
                                        this.field476[var79] = (var80 << 8) + var81;
                                        if (!this.field324 || var81 != 49 && var81 != 149 && var81 != 147 && var80 != 50 && (var80 != 49 || var81 != 47)) {
                                            int var82 = this.field477[var79] = this.field132.method519(var80, (byte) -105, var81, 0);
                                            if (var82 != -1) {
                                                this.field132.method533(3, var82);
                                            }
                                            int var83 = this.field478[var79] = this.field132.method519(var80, (byte) -105, var81, 1);
                                            if (var83 != -1) {
                                                this.field132.method533(3, var83);
                                            }
                                            ++var79;
                                        } else {
                                            this.field477[var79] = -1;
                                            this.field478[var79] = -1;
                                            ++var79;
                                        }
                                    }
                                    ++var80;
                                }
                            }
                            for (int var78 = (this.field578 - 6) / 8; var78 <= (this.field578 + 6) / 8; ++var78) {
                                ++var76;
                            }
                            ++var77;
                        }
                    }
                    if (this.field345 == 164) {
                        int var84 = 0;
                        int[] var85 = new int[676];
                        int var86 = 0;
                        label1176: while (true) {
                            if (var86 >= 4) {
                                this.field446 = new byte[var84][];
                                this.field205 = new byte[var84][];
                                this.field476 = new int[var84];
                                this.field477 = new int[var84];
                                this.field478 = new int[var84];
                                int var94 = 0;
                                while (true) {
                                    if (var94 >= var84) {
                                        break label1176;
                                    }
                                    int var95 = this.field476[var94] = var85[var94];
                                    int var96 = var95 >> 8 & 255;
                                    int var97 = var95 & 255;
                                    int var98 = this.field477[var94] = this.field132.method519(var96, (byte) -105, var97, 0);
                                    if (var98 != -1) {
                                        this.field132.method533(3, var98);
                                    }
                                    int var99 = this.field478[var94] = this.field132.method519(var96, (byte) -105, var97, 1);
                                    if (var99 != -1) {
                                        this.field132.method533(3, var99);
                                    }
                                    ++var94;
                                }
                            }
                            for (int var87 = 0; var87 < 13; ++var87) {
                                for (int var88 = 0; var88 < 13; ++var88) {
                                    int var89 = this.field341[var86][var87][var88];
                                    if (var89 != -1) {
                                        int var90 = var89 >> 14 & 1023;
                                        int var91 = var89 >> 3 & 2047;
                                        int var92 = (var90 / 8 << 8) + var91 / 8;
                                        for (int var93 = 0; var93 < var84; ++var93) {
                                            if (var85[var93] == var92) {
                                                var92 = -1;
                                                break;
                                            }
                                        }
                                        if (var92 != -1) {
                                            var85[var84++] = var92;
                                        }
                                    }
                                }
                            }
                            ++var86;
                        }
                    }
                    int var100 = this.field358 - this.field360;
                    int var101 = this.field359 - this.field361;
                    this.field360 = this.field358;
                    this.field361 = this.field359;
                    for (int var102 = 0; var102 < 16384; ++var102) {
                        class70 var103 = this.field395[var102];
                        if (var103 != null) {
                            for (int var104 = 0; var104 < 10; ++var104) {
                                var103.field681[var104] -= var100;
                                var103.field682[var104] -= var101;
                            }
                            var103.field706 -= var100 * 128;
                            var103.field707 -= var101 * 128;
                        }
                    }
                    for (int var105 = 0; var105 < this.field290; ++var105) {
                        class6 var106 = this.field292[var105];
                        if (var106 != null) {
                            for (int var107 = 0; var107 < 10; ++var107) {
                                var106.field681[var107] -= var100;
                                var106.field682[var107] -= var101;
                            }
                            var106.field706 -= var100 * 128;
                            var106.field707 -= var101 * 128;
                        }
                    }
                    this.field336 = true;
                    byte var108 = 0;
                    byte var109 = 104;
                    byte var110 = 1;
                    if (var100 < 0) {
                        var108 = 103;
                        var109 = -1;
                        var110 = -1;
                    }
                    byte var111 = 0;
                    byte var112 = 104;
                    byte var113 = 1;
                    if (var101 < 0) {
                        var111 = 103;
                        var112 = -1;
                        var113 = -1;
                    }
                    for (int var114 = var108; var109 != var114; var114 += var110) {
                        for (int var115 = var111; var112 != var115; var115 += var113) {
                            int var116 = var100 + var114;
                            int var117 = var101 + var115;
                            for (int var118 = 0; var118 < 4; ++var118) {
                                if (var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104) {
                                    this.field118[var118][var114][var115] = this.field118[var118][var116][var117];
                                } else {
                                    this.field118[var118][var114][var115] = null;
                                }
                            }
                        }
                    }
                    for (class1 var119 = (class1) this.field155.method543(); var119 != null; var119 = (class1) this.field155.method545(907)) {
                        var119.field4 -= var100;
                        var119.field5 -= var101;
                        if (var119.field4 < 0 || var119.field5 < 0 || var119.field4 >= 104 || var119.field5 >= 104) {
                            var119.method14();
                        }
                    }
                    if (this.field438 != 0) {
                        this.field438 -= var100;
                        this.field439 -= var101;
                    }
                    this.field98 = false;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 120) {
                    this.field98 = true;
                    this.field206 = this.field462.method386();
                    this.field207 = this.field462.method386();
                    this.field208 = this.field462.method388();
                    this.field209 = this.field462.method386();
                    this.field210 = this.field462.method386();
                    if (this.field210 >= 100) {
                        this.field480 = this.field206 * 128 + 64;
                        this.field482 = this.field207 * 128 + 64;
                        this.field481 = this.method153(this.field482, this.field480, -926, this.field459) - this.field208;
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 61) {
                    int var120 = this.field462.method413(-817);
                    int var121 = this.field462.method416(this.field367);
                    class25 var122 = class25.method276(var120);
                    if (var122.field939 != var121 || var121 == -1) {
                        var122.field939 = var121;
                        var122.field935 = 0;
                        var122.field927 = 0;
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 254) {
                    if (this.field270 == 12) {
                        this.field268 = true;
                    }
                    this.field220 = this.field462.method386();
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 193) {
                    byte var123 = this.field462.method409((byte) 4);
                    int var124 = this.field462.method415((byte) -98);
                    this.field86[var124] = var123;
                    if (this.field498[var124] != var123) {
                        this.field498[var124] = var123;
                        this.method137(true, var124);
                        this.field268 = true;
                        if (this.field500 != -1) {
                            this.field350 = true;
                        }
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 52) {
                    long var125 = this.field462.method392((byte) -100);
                    int var127 = this.field462.method386();
                    String var128 = class53.method495(true, class53.method492(42220, var125));
                    for (int var129 = 0; var129 < this.field197; ++var129) {
                        if (this.field147[var129] == var125) {
                            if (this.field407[var129] != var127) {
                                this.field407[var129] = var127;
                                this.field268 = true;
                                if (var127 > 0) {
                                    this.method121(var128 + " has logged in.", 5, "", -212);
                                }
                                if (var127 == 0) {
                                    this.method121(var128 + " has logged out.", 5, "", -212);
                                }
                            }
                            var128 = null;
                            break;
                        }
                    }
                    if (var128 != null && this.field197 < 200) {
                        this.field147[this.field197] = var125;
                        this.field84[this.field197] = var128;
                        this.field407[this.field197] = var127;
                        ++this.field197;
                        this.field268 = true;
                    }
                    boolean var130 = false;
                    while (!var130) {
                        var130 = true;
                        for (int var131 = 0; var131 < this.field197 - 1; ++var131) {
                            if (this.field407[var131] != field383 && this.field407[var131 + 1] == field383 || this.field407[var131] == 0 && this.field407[var131 + 1] != 0) {
                                int var132 = this.field407[var131];
                                this.field407[var131] = this.field407[var131 + 1];
                                this.field407[var131 + 1] = var132;
                                String var133 = this.field84[var131];
                                this.field84[var131] = this.field84[var131 + 1];
                                this.field84[var131 + 1] = var133;
                                long var134 = this.field147[var131];
                                this.field147[var131] = this.field147[var131 + 1];
                                this.field147[var131 + 1] = var134;
                                this.field268 = true;
                                var130 = false;
                            }
                        }
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 105) {
                    this.field198 = this.field462.method386();
                    this.field268 = true;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 129) {
                    String var136 = this.field462.method393();
                    if (var136.endsWith(":tradereq:")) {
                        String var137 = var136.substring(0, var136.indexOf(":"));
                        long var138 = class53.method491(var137);
                        boolean var140 = false;
                        for (int var141 = 0; var141 < this.field339; ++var141) {
                            if (this.field519[var141] == var138) {
                                var140 = true;
                                break;
                            }
                        }
                        if (!var140 && this.field305 == 0) {
                            this.method121("wishes to trade with you.", 4, var137, -212);
                        }
                    } else if (var136.endsWith(":duelreq:")) {
                        String var142 = var136.substring(0, var136.indexOf(":"));
                        long var143 = class53.method491(var142);
                        boolean var145 = false;
                        for (int var146 = 0; var146 < this.field339; ++var146) {
                            if (this.field519[var146] == var143) {
                                var145 = true;
                                break;
                            }
                        }
                        if (!var145 && this.field305 == 0) {
                            this.method121("wishes to duel with you.", 8, var142, -212);
                        }
                    } else if (!var136.endsWith(":chalreq:")) {
                        this.method121(var136, 0, "", -212);
                    } else {
                        String var147 = var136.substring(0, var136.indexOf(":"));
                        long var148 = class53.method491(var147);
                        boolean var150 = false;
                        for (int var151 = 0; var151 < this.field339; ++var151) {
                            if (this.field519[var151] == var148) {
                                var150 = true;
                                break;
                            }
                        }
                        if (!var150 && this.field305 == 0) {
                            String var152 = var136.substring(var136.indexOf(":") + 1, var136.length() - 9);
                            this.method121(var152, 8, var147, -212);
                        }
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 230) {
                    this.field98 = false;
                    for (int var153 = 0; var153 < 5; ++var153) {
                        this.field479[var153] = false;
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 171) {
                    this.field268 = true;
                    int var154 = this.field462.method406(-584);
                    int var155 = this.field462.method421(-273);
                    int var156 = this.field462.method386();
                    this.field485[var156] = var155;
                    this.field161[var156] = var154;
                    this.field349[var156] = 1;
                    for (int var157 = 0; var157 < 98; ++var157) {
                        if (var155 >= field531[var157]) {
                            this.field349[var156] = var157 + 2;
                        }
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 116) {
                    int var158 = this.field462.method405(this.field134);
                    int var159 = this.field462.method406(-584);
                    String var160 = this.field462.method393();
                    if (var158 >= 1 && var158 <= 5) {
                        if (var160.equalsIgnoreCase("null")) {
                            var160 = null;
                        }
                        this.field380[var158 - 1] = var160;
                        this.field381[var158 - 1] = var159 == 0;
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 20) {
                    if (this.field270 == 12) {
                        this.field268 = true;
                    }
                    this.field281 = this.field462.method389();
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 194) {
                    this.field444 = this.field462.method407((byte) 2);
                    this.field445 = this.field462.method405(this.field134);
                    while (this.field462.field1212 < this.field344) {
                        int var161 = this.field462.method386();
                        this.method81(this.field462, (byte) -77, var161);
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 14) {
                    for (int var162 = 0; var162 < this.field498.length; ++var162) {
                        if (this.field86[var162] != this.field498[var162]) {
                            this.field498[var162] = this.field86[var162];
                            this.method137(true, var162);
                            this.field268 = true;
                        }
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 103) {
                    int var163 = this.field462.method388();
                    int var164 = this.field462.method388();
                    int var165 = var164 >> 10 & 31;
                    int var166 = var164 >> 5 & 31;
                    int var167 = var164 & 31;
                    class25.method276(var163).field963 = (var167 << 3) + (var165 << 19) + (var166 << 11);
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 168) {
                    this.field365 = this.field462.method415((byte) -98);
                    this.field568 = this.field462.method405(this.field134);
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 253) {
                    this.field438 = 0;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 173) {
                    int var168 = this.field462.method413(-817);
                    int var169 = this.field462.method388();
                    int var170 = this.field462.method413(-817);
                    if (var169 == 65535) {
                        class25.method276(var170).field907 = 0;
                        this.field345 = -1;
                        return true;
                    }
                    class50 var171 = class50.method475(var169);
                    class25.method276(var170).field907 = 4;
                    class25.method276(var170).field908 = var169;
                    class25.method276(var170).field915 = var171.field1413;
                    class25.method276(var170).field916 = var171.field1401;
                    class25.method276(var170).field914 = var171.field1383 * 100 / var168;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 59) {
                    this.field270 = this.field462.method407((byte) 2);
                    this.field268 = true;
                    this.field78 = true;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 32) {
                    for (int var172 = 0; var172 < this.field292.length; ++var172) {
                        if (this.field292[var172] != null) {
                            this.field292[var172].field693 = -1;
                        }
                    }
                    for (int var173 = 0; var173 < this.field395.length; ++var173) {
                        if (this.field395[var173] != null) {
                            this.field395[var173].field693 = -1;
                        }
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 40) {
                    int var174 = this.field462.method413(-817);
                    int var175 = this.field462.method415((byte) -98);
                    class25 var176 = class25.method276(var175);
                    if (var176 != null && var176.field957 == 0) {
                        if (var174 < 0) {
                            var174 = 0;
                        }
                        if (var174 > var176.field937 - var176.field960) {
                            var174 = var176.field937 - var176.field960;
                        }
                        var176.field906 = var174;
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 246) {
                    this.field339 = this.field344 / 8;
                    for (int var177 = 0; var177 < this.field339; ++var177) {
                        this.field519[var177] = this.field462.method392((byte) -100);
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 201) {
                    this.field445 = this.field462.method386();
                    this.field444 = this.field462.method407((byte) 2);
                    for (int var178 = this.field444; var178 < this.field444 + 8; ++var178) {
                        for (int var179 = this.field445; var179 < this.field445 + 8; ++var179) {
                            if (this.field118[this.field459][var178][var179] != null) {
                                this.field118[this.field459][var178][var179] = null;
                                this.method57(var178, var179);
                            }
                        }
                    }
                    for (class1 var180 = (class1) this.field155.method543(); var180 != null; var180 = (class1) this.field155.method545(907)) {
                        if (var180.field4 >= this.field444 && var180.field4 < this.field444 + 8 && var180.field5 >= this.field445 && var180.field5 < this.field445 + 8 && this.field459 == var180.field2) {
                            var180.field12 = 0;
                        }
                    }
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 80) {
                    int var181 = this.field462.method388();
                    int var182 = this.field462.method413(-817);
                    int var183 = this.field462.method413(-817);
                    int var184 = this.field462.method414(-660);
                    class25.method276(var182).field915 = var183;
                    class25.method276(var182).field916 = var184;
                    class25.method276(var182).field914 = var181;
                    this.field345 = -1;
                    return true;
                }
                if (this.field345 == 15) {
                    int var185 = this.field462.method388();
                    int var186 = this.field462.method413(-817);
                    class25.method276(var185).field907 = 1;
                    class25.method276(var185).field908 = var186;
                    this.field345 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field345 + "," + this.field344 + " - " + this.field234 + "," + this.field235);
                this.method118(true);
            } catch (IOException var191) {
                this.method161(253);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field345 + "," + this.field234 + "," + this.field235 + " - " + this.field344 + "," + (field254.field681[0] + this.field358) + "," + (field254.field682[0] + this.field359) + " - ";
                for (int var189 = 0; var189 < this.field344 && var189 < 50; ++var189) {
                    var188 = var188 + this.field462.field1211[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method118(true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public final void method6() {
        this.method13(20, (byte) 6, "Starting up");
        if (signlink.sunjava) {
            super.field19 = 5;
        }
        if (field145) {
            this.field97 = true;
        } else {
            field145 = true;
            boolean var1 = false;
            String var2 = this.method127(-133);
            if (var2.endsWith("jagex.com")) {
                var1 = true;
            }
            if (var2.endsWith("runescape.com")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.2")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.231")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.229")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.228")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.227")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.226")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.224")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.223")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.221")) {
                var1 = true;
            }
            if (var2.endsWith("127.0.0.1")) {
                var1 = true;
            }
            if (!var1) {
                this.field242 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field467[var3] = new class62(500000, signlink.cache_idx[var3], var3 + 1, false, signlink.cache_dat);
                    }
                }
                try {
                    this.method83((byte) 4);
                    this.field529 = this.method101(1, "title screen", this.field431[1], 4, 25, "title");
                    this.field544 = new class67(this.field529, false, 260, "p11_full");
                    this.field545 = new class67(this.field529, false, 260, "p12_full");
                    this.field546 = new class67(this.field529, false, 260, "b12_full");
                    this.field547 = new class67(this.field529, true, 260, "q8_full");
                    this.method111(field111);
                    this.method131(false);
                    class41 var4 = this.method101(2, "config", this.field431[2], 4, 30, "config");
                    class41 var5 = this.method101(3, "interface", this.field431[3], 4, 35, "interface");
                    class41 var6 = this.method101(4, "2d graphics", this.field431[4], 4, 40, "media");
                    class41 var7 = this.method101(6, "textures", this.field431[6], 4, 45, "textures");
                    class41 var8 = this.method101(7, "chat system", this.field431[7], 4, 50, "wordenc");
                    class41 var9 = this.method101(8, "sound effects", this.field431[8], 4, 55, "sounds");
                    this.field460 = new byte[4][104][104];
                    this.field558 = new int[4][105][105];
                    this.field217 = new class23(this.field558, 104, 4, 104, field201);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field571[var10] = new class14(104, 104, -18093);
                    }
                    this.field440 = new class48(512, 512);
                    class41 var11 = this.method101(5, "update list", this.field431[5], 4, 60, "versionlist");
                    this.method13(60, (byte) 6, "Connecting to update server");
                    this.field132 = new class56();
                    this.field132.method537(var11, this);
                    class17.method207(this.field132.method528(50));
                    class26.method278(this.field132.method531((byte) 69, 0), this.field132);
                    if (!field386) {
                        this.field526 = 0;
                        this.field527 = true;
                        this.field132.method533(2, this.field526);
                        while (this.field132.method526() > 0) {
                            this.method160(true);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field132.field1522 > 3) {
                                this.method73("ondemand");
                                return;
                            }
                        }
                    }
                    this.method13(65, (byte) 6, "Requesting animations");
                    int var12 = this.field132.method531((byte) 69, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field132.method533(1, var13);
                    }
                    while (this.field132.method526() > 0) {
                        int var14 = var12 - this.field132.method526();
                        if (var14 > 0) {
                            this.method13(65, (byte) 6, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method160(true);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field132.field1522 > 3) {
                            this.method73("ondemand");
                            return;
                        }
                    }
                    this.method13(70, (byte) 6, "Requesting models");
                    int var15 = this.field132.method531((byte) 69, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field132.method525(false, var16);
                        if ((var17 & 1) != 0) {
                            this.field132.method533(0, var16);
                        }
                    }
                    int var18 = this.field132.method526();
                    while (this.field132.method526() > 0) {
                        int var19 = var18 - this.field132.method526();
                        if (var19 > 0) {
                            this.method13(70, (byte) 6, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method160(true);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field467[0] != null) {
                        this.method13(75, (byte) 6, "Requesting maps");
                        this.field132.method533(3, this.field132.method519(47, (byte) -105, 48, 0));
                        this.field132.method533(3, this.field132.method519(47, (byte) -105, 48, 1));
                        this.field132.method533(3, this.field132.method519(48, (byte) -105, 48, 0));
                        this.field132.method533(3, this.field132.method519(48, (byte) -105, 48, 1));
                        this.field132.method533(3, this.field132.method519(49, (byte) -105, 48, 0));
                        this.field132.method533(3, this.field132.method519(49, (byte) -105, 48, 1));
                        this.field132.method533(3, this.field132.method519(47, (byte) -105, 47, 0));
                        this.field132.method533(3, this.field132.method519(47, (byte) -105, 47, 1));
                        this.field132.method533(3, this.field132.method519(48, (byte) -105, 47, 0));
                        this.field132.method533(3, this.field132.method519(48, (byte) -105, 47, 1));
                        this.field132.method533(3, this.field132.method519(48, (byte) -105, 148, 0));
                        this.field132.method533(3, this.field132.method519(48, (byte) -105, 148, 1));
                        int var20 = this.field132.method526();
                        while (this.field132.method526() > 0) {
                            int var21 = var20 - this.field132.method526();
                            if (var21 > 0) {
                                this.method13(75, (byte) 6, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method160(true);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field132.method531((byte) 69, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field132.method525(false, var23);
                        byte var25 = 0;
                        if ((var24 & 8) != 0) {
                            var25 = 10;
                        } else if ((var24 & 32) != 0) {
                            var25 = 9;
                        } else if ((var24 & 16) != 0) {
                            var25 = 8;
                        } else if ((var24 & 64) != 0) {
                            var25 = 7;
                        } else if ((var24 & 128) != 0) {
                            var25 = 6;
                        } else if ((var24 & 2) != 0) {
                            var25 = 5;
                        } else if ((var24 & 4) != 0) {
                            var25 = 4;
                        }
                        if ((var24 & 1) != 0) {
                            var25 = 3;
                        }
                        if (var25 != 0) {
                            this.field132.method536(0, var23, (byte) 0, var25);
                        }
                    }
                    this.field132.method532(field385, 170);
                    if (!field386) {
                        int var26 = this.field132.method531((byte) 69, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field132.method522(var27, 8884)) {
                                this.field132.method536(2, var27, (byte) 0, (byte) 1);
                            }
                        }
                    }
                    this.method13(80, (byte) 6, "Unpacking media");
                    this.field202 = new class4(var6, "invback", 0);
                    this.field204 = new class4(var6, "chatback", 0);
                    this.field203 = new class4(var6, "mapback", 0);
                    this.field250 = new class4(var6, "backbase1", 0);
                    this.field251 = new class4(var6, "backbase2", 0);
                    this.field252 = new class4(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field127[var28] = new class4(var6, "sideicons", var28);
                    }
                    this.field183 = new class48(var6, "compass", 0);
                    this.field236 = new class48(var6, "mapedge", 0);
                    this.field236.method455(false);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field144[var29] = new class4(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 70; ++var30) {
                        this.field241[var30] = new class48(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field246[var31] = new class48(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field285[var32] = new class48(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field148[var33] = new class48(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field354[var34] = new class48(var6, "headicons_hint", var34);
                    }
                    this.field452 = new class48(var6, "overlay_multiway", 0);
                    this.field428 = new class48(var6, "mapmarker", 0);
                    this.field429 = new class48(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field110[var35] = new class48(var6, "cross", var35);
                    }
                    this.field487 = new class48(var6, "mapdots", 0);
                    this.field488 = new class48(var6, "mapdots", 1);
                    this.field489 = new class48(var6, "mapdots", 2);
                    this.field490 = new class48(var6, "mapdots", 3);
                    this.field491 = new class48(var6, "mapdots", 4);
                    this.field99 = new class4(var6, "scrollbar", 0);
                    this.field100 = new class4(var6, "scrollbar", 1);
                    this.field271 = new class4(var6, "redstone1", 0);
                    this.field272 = new class4(var6, "redstone2", 0);
                    this.field273 = new class4(var6, "redstone3", 0);
                    this.field274 = new class4(var6, "redstone1", 0);
                    this.field274.method17((byte) 6);
                    this.field275 = new class4(var6, "redstone2", 0);
                    this.field275.method17((byte) 6);
                    this.field389 = new class4(var6, "redstone1", 0);
                    this.field389.method18(false);
                    this.field390 = new class4(var6, "redstone2", 0);
                    this.field390.method18(false);
                    this.field391 = new class4(var6, "redstone3", 0);
                    this.field391.method18(false);
                    this.field392 = new class4(var6, "redstone1", 0);
                    this.field392.method17((byte) 6);
                    this.field392.method18(false);
                    this.field393 = new class4(var6, "redstone2", 0);
                    this.field393.method17((byte) 6);
                    this.field393.method18(false);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field501[var36] = new class4(var6, "mod_icons", var36);
                    }
                    class48 var37 = new class48(var6, "backleft1", 0);
                    this.field409 = new class35(var37.field1363, 0, var37.field1362, this.method11(735));
                    var37.method456((byte) -21, 0, 0);
                    class48 var38 = new class48(var6, "backleft2", 0);
                    this.field410 = new class35(var38.field1363, 0, var38.field1362, this.method11(735));
                    var38.method456((byte) -21, 0, 0);
                    class48 var39 = new class48(var6, "backright1", 0);
                    this.field411 = new class35(var39.field1363, 0, var39.field1362, this.method11(735));
                    var39.method456((byte) -21, 0, 0);
                    class48 var40 = new class48(var6, "backright2", 0);
                    this.field412 = new class35(var40.field1363, 0, var40.field1362, this.method11(735));
                    var40.method456((byte) -21, 0, 0);
                    class48 var41 = new class48(var6, "backtop1", 0);
                    this.field413 = new class35(var41.field1363, 0, var41.field1362, this.method11(735));
                    var41.method456((byte) -21, 0, 0);
                    class48 var42 = new class48(var6, "backvmid1", 0);
                    this.field414 = new class35(var42.field1363, 0, var42.field1362, this.method11(735));
                    var42.method456((byte) -21, 0, 0);
                    class48 var43 = new class48(var6, "backvmid2", 0);
                    this.field415 = new class35(var43.field1363, 0, var43.field1362, this.method11(735));
                    var43.method456((byte) -21, 0, 0);
                    class48 var44 = new class48(var6, "backvmid3", 0);
                    this.field416 = new class35(var44.field1363, 0, var44.field1362, this.method11(735));
                    var44.method456((byte) -21, 0, 0);
                    class48 var45 = new class48(var6, "backhmid2", 0);
                    this.field417 = new class35(var45.field1363, 0, var45.field1362, this.method11(735));
                    var45.method456((byte) -21, 0, 0);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field241[var50] != null) {
                            this.field241[var50].method454(var47 + var49, var46 + var49, var48 + var49, true);
                        }
                        if (this.field144[var50] != null) {
                            this.field144[var50].method19(var47 + var49, var46 + var49, var48 + var49, true);
                        }
                    }
                    this.method13(83, (byte) 6, "Unpacking textures");
                    class54.method502(929, var7);
                    class54.method506(0.8D, -625);
                    class54.method501(20, (byte) 2);
                    this.method13(86, (byte) 6, "Unpacking config");
                    class47.method450(var4, 24570);
                    class36.method370(var4);
                    class13.method187(var4, 24570);
                    class50.method466(var4);
                    class45.method438(var4);
                    class46.method444(var4, 24570);
                    class44.method433(var4, 24570);
                    class22.method213(var4, 24570);
                    class39.method425(var4, 24570);
                    class50.field1422 = field385;
                    if (!field386) {
                        this.method13(90, (byte) 6, "Unpacking sounds");
                        byte[] var51 = var9.method431("sounds.dat", (byte[]) null);
                        class37 var52 = new class37(var51, -670);
                        class7.method171(var52, 24570);
                    }
                    this.method13(95, (byte) 6, "Unpacking interfaces");
                    class67[] var53 = new class67[] { this.field544, this.field545, this.field546, this.field547 };
                    class25.method274(var53, var5, var6, field318);
                    this.method13(100, (byte) 6, "Preparing game engine");
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field203.field58[this.field203.field60 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field375[var54] = var55;
                        this.field317[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field203.field58[this.field203.field60 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field232[var58 - 5] = var59 - 25;
                        this.field191[var58 - 5] = var60 - var59;
                    }
                    class54.method499(765, 5, 503);
                    this.field196 = class54.field1474;
                    class54.method499(479, 5, 96);
                    this.field193 = class54.field1474;
                    class54.method499(190, 5, 261);
                    this.field194 = class54.field1474;
                    class54.method499(512, 5, 334);
                    this.field195 = class54.field1474;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class54.field1472[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class23.method252(var62, 334, 500, 5, 800, 512);
                    class33.method318(var8);
                    this.field447 = new class43(474, this);
                    this.method12(this.field447, 10);
                    class71.field1749 = this;
                    class36.field1171 = this;
                    class45.field1288 = this;
                } catch (Exception var72) {
                    signlink.reporterror("loaderror " + this.field551 + " " + this.field326);
                    this.field539 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
    public final void method139(byte arg0) {
        if (arg0 != 4) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        while (true) {
            int var3;
            do {
                while (true) {
                    var3 = this.method5(-36198);
                    if (var3 == -1) {
                        return;
                    }
                    if (this.field572 != -1 && this.field572 == this.field333) {
                        if (var3 == 8 && this.field573.length() > 0) {
                            this.field573 = this.field573.substring(0, this.field573.length() - 1);
                        }
                        break;
                    }
                    if (this.field557) {
                        if (var3 >= 32 && var3 <= 122 && this.field567.length() < 80) {
                            this.field567 = this.field567 + (char) var3;
                            this.field350 = true;
                        }
                        if (var3 == 8 && this.field567.length() > 0) {
                            this.field567 = this.field567.substring(0, this.field567.length() - 1);
                            this.field350 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            this.field557 = false;
                            this.field350 = true;
                            if (this.field300 == 1) {
                                long var4 = class53.method491(this.field567);
                                this.method76(false, var4);
                            }
                            if (this.field300 == 2 && this.field197 > 0) {
                                long var6 = class53.method491(this.field567);
                                this.method75(this.field507, var6);
                            }
                            if (this.field300 == 3 && this.field567.length() > 0) {
                                this.field466.method375(21, this.field496);
                                this.field466.method376(0);
                                int var8 = this.field466.field1212;
                                this.field466.method382(this.field244, this.field253);
                                class69.method601(this.field567, (byte) -29, this.field466);
                                this.field466.method385(true, this.field466.field1212 - var8);
                                this.field567 = class69.method602(this.field213, this.field567);
                                this.field567 = class33.method328(this.field213, this.field567);
                                this.method121(this.field567, 6, class53.method495(true, class53.method492(42220, this.field244)), -212);
                                if (this.field538 == 2) {
                                    this.field538 = 1;
                                    this.field238 = true;
                                    this.field466.method375(34, this.field496);
                                    this.field466.method376(this.field185);
                                    this.field466.method376(this.field538);
                                    this.field466.method376(this.field129);
                                }
                            }
                            if (this.field300 == 4 && this.field339 < 100) {
                                long var9 = class53.method491(this.field567);
                                this.method78(true, var9);
                            }
                            if (this.field300 == 5 && this.field339 > 0) {
                                long var11 = class53.method491(this.field567);
                                this.method96(20382, var11);
                            }
                        }
                    } else if (this.field160 == 1) {
                        if (var3 >= 48 && var3 <= 57 && this.field80.length() < 10) {
                            this.field80 = this.field80 + (char) var3;
                            this.field350 = true;
                        }
                        if (var3 == 8 && this.field80.length() > 0) {
                            this.field80 = this.field80.substring(0, this.field80.length() - 1);
                            this.field350 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field80.length() > 0) {
                                int var13 = 0;
                                try {
                                    var13 = Integer.parseInt(this.field80);
                                } catch (Exception var23) {
                                }
                                this.field466.method375(227, this.field496);
                                this.field466.method380(var13);
                            }
                            this.field160 = 0;
                            this.field350 = true;
                        }
                    } else if (this.field160 == 2) {
                        if (var3 >= 32 && var3 <= 122 && this.field80.length() < 12) {
                            this.field80 = this.field80 + (char) var3;
                            this.field350 = true;
                        }
                        if (var3 == 8 && this.field80.length() > 0) {
                            this.field80 = this.field80.substring(0, this.field80.length() - 1);
                            this.field350 = true;
                        }
                        if (var3 == 13 || var3 == 10) {
                            if (this.field80.length() > 0) {
                                this.field466.method375(99, this.field496);
                                this.field466.method382(class53.method491(this.field80), this.field253);
                            }
                            this.field160 = 0;
                            this.field350 = true;
                        }
                    } else if (this.field160 == 3) {
                        if (var3 >= 32 && var3 <= 122 && this.field80.length() < 40) {
                            this.field80 = this.field80 + (char) var3;
                            this.field350 = true;
                        }
                        if (var3 == 8 && this.field80.length() > 0) {
                            this.field80 = this.field80.substring(0, this.field80.length() - 1);
                            this.field350 = true;
                        }
                    } else if (this.field352 == -1 && this.field472 == -1) {
                        if (var3 >= 32 && var3 <= 122 && this.field128.length() < 80) {
                            this.field128 = this.field128 + (char) var3;
                            this.field350 = true;
                        }
                        if (var3 == 8 && this.field128.length() > 0) {
                            this.field128 = this.field128.substring(0, this.field128.length() - 1);
                            this.field350 = true;
                        }
                        if ((var3 == 13 || var3 == 10) && this.field128.length() > 0) {
                            if (this.field137 == 2) {
                                if (this.field128.equals("::clientdrop")) {
                                    this.method161(253);
                                }
                                if (this.field128.equals("::lag")) {
                                    this.method147(969);
                                }
                                if (this.field128.equals("::prefetchmusic")) {
                                    for (int var14 = 0; var14 < this.field132.method531((byte) 69, 2); ++var14) {
                                        this.field132.method536(2, var14, (byte) 0, (byte) 1);
                                    }
                                }
                                if (this.field128.equals("::fpson")) {
                                    field284 = true;
                                }
                                if (this.field128.equals("::fpsoff")) {
                                    field284 = false;
                                }
                                if (this.field128.equals("::noclip")) {
                                    for (int var15 = 0; var15 < 4; ++var15) {
                                        for (int var16 = 1; var16 < 103; ++var16) {
                                            for (int var17 = 1; var17 < 103; ++var17) {
                                                this.field571[var15].field663[var16][var17] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field128.startsWith("::")) {
                                this.field466.method375(32, this.field496);
                                this.field466.method376(this.field128.length() - 1);
                                this.field466.method383(this.field128.substring(2));
                            } else {
                                String var18 = this.field128.toLowerCase();
                                byte var19 = 0;
                                if (var18.startsWith("yellow:")) {
                                    var19 = 0;
                                    this.field128 = this.field128.substring(7);
                                } else if (var18.startsWith("red:")) {
                                    var19 = 1;
                                    this.field128 = this.field128.substring(4);
                                } else if (var18.startsWith("green:")) {
                                    var19 = 2;
                                    this.field128 = this.field128.substring(6);
                                } else if (var18.startsWith("cyan:")) {
                                    var19 = 3;
                                    this.field128 = this.field128.substring(5);
                                } else if (var18.startsWith("purple:")) {
                                    var19 = 4;
                                    this.field128 = this.field128.substring(7);
                                } else if (var18.startsWith("white:")) {
                                    var19 = 5;
                                    this.field128 = this.field128.substring(6);
                                } else if (var18.startsWith("flash1:")) {
                                    var19 = 6;
                                    this.field128 = this.field128.substring(7);
                                } else if (var18.startsWith("flash2:")) {
                                    var19 = 7;
                                    this.field128 = this.field128.substring(7);
                                } else if (var18.startsWith("flash3:")) {
                                    var19 = 8;
                                    this.field128 = this.field128.substring(7);
                                } else if (var18.startsWith("glow1:")) {
                                    var19 = 9;
                                    this.field128 = this.field128.substring(6);
                                } else if (var18.startsWith("glow2:")) {
                                    var19 = 10;
                                    this.field128 = this.field128.substring(6);
                                } else if (var18.startsWith("glow3:")) {
                                    var19 = 11;
                                    this.field128 = this.field128.substring(6);
                                }
                                String var20 = this.field128.toLowerCase();
                                byte var21 = 0;
                                if (var20.startsWith("wave:")) {
                                    var21 = 1;
                                    this.field128 = this.field128.substring(5);
                                } else if (var20.startsWith("wave2:")) {
                                    var21 = 2;
                                    this.field128 = this.field128.substring(6);
                                } else if (var20.startsWith("shake:")) {
                                    var21 = 3;
                                    this.field128 = this.field128.substring(6);
                                } else if (var20.startsWith("scroll:")) {
                                    var21 = 4;
                                    this.field128 = this.field128.substring(7);
                                } else if (var20.startsWith("slide:")) {
                                    var21 = 5;
                                    this.field128 = this.field128.substring(6);
                                }
                                this.field466.method375(68, this.field496);
                                this.field466.method376(0);
                                int var22 = this.field466.field1212;
                                this.field466.method376(var19);
                                this.field466.method402(this.field142, var21);
                                this.field394.field1212 = 0;
                                class69.method601(this.field128, (byte) -29, this.field394);
                                this.field466.method384(0, -249, this.field394.field1212, this.field394.field1211);
                                this.field466.method385(true, this.field466.field1212 - var22);
                                this.field128 = class69.method602(this.field213, this.field128);
                                this.field128 = class33.method328(this.field213, this.field128);
                                field254.field719 = this.field128;
                                field254.field667 = var19;
                                field254.field679 = var21;
                                field254.field720 = 150;
                                if (this.field137 == 2) {
                                    this.method121(field254.field719, 2, "@cr2@" + field254.field604, -212);
                                } else if (this.field137 == 1) {
                                    this.method121(field254.field719, 2, "@cr1@" + field254.field604, -212);
                                } else {
                                    this.method121(field254.field719, 2, field254.field604, -212);
                                }
                                if (this.field185 == 2) {
                                    this.field185 = 3;
                                    this.field238 = true;
                                    this.field466.method375(34, this.field496);
                                    this.field466.method376(this.field185);
                                    this.field466.method376(this.field538);
                                    this.field466.method376(this.field129);
                                }
                            }
                            this.field128 = "";
                            this.field350 = true;
                        }
                    }
                }
            } while ((var3 < 97 || var3 > 122) && (var3 < 65 || var3 > 90) && (var3 < 48 || var3 > 57) && var3 != 32);
            if (this.field573.length() < 12) {
                this.field573 = this.field573 + (char) var3;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
    public final void method140(boolean arg0) {
        if (!arg0) {
            this.field243 = this.field156.method514();
        }
        if (this.field136 != 0) {
            int var2 = 0;
            if (this.field231 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field154[var3] != null) {
                    int var4 = this.field152[var3];
                    String var5 = this.field153[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field538 == 0 || this.field538 == 1 && this.method30(426, var5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field33 > 4 && super.field34 - 4 > var9 - 10 && super.field34 - 4 <= var9 + 3) {
                            int var10 = this.field545.method587("From:  " + var5 + this.field154[var3], -24375) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field33 < var10 + 4) {
                                if (this.field137 >= 1) {
                                    this.field79[this.field537] = "Report abuse @whi@" + var5;
                                    this.field257[this.field537] = 2989;
                                    ++this.field537;
                                }
                                this.field79[this.field537] = "Add ignore @whi@" + var5;
                                this.field257[this.field537] = 2405;
                                ++this.field537;
                                this.field79[this.field537] = "Add friend @whi@" + var5;
                                this.field257[this.field537] = 2009;
                                ++this.field537;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field538 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
    public final void method141(int arg0) {
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
        this.field344 += arg0;
    }

    @OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
    public final void method142(int arg0) {
        if (this.field179 == null) {
            this.method115(true);
            super.field26 = null;
            this.field308 = null;
            this.field309 = null;
            this.field310 = null;
            this.field311 = null;
            this.field312 = null;
            this.field313 = null;
            this.field314 = null;
            this.field315 = null;
            this.field316 = null;
            this.field179 = new class35(96, 0, 479, this.method11(735));
            this.field177 = new class35(156, 0, 172, this.method11(735));
            class52.method482(-837);
            this.field203.method20(48946, 0, 0);
            this.field344 += arg0;
            this.field176 = new class35(261, 0, 190, this.method11(735));
            this.field178 = new class35(334, 0, 512, this.method11(735));
            class52.method482(-837);
            this.field441 = new class35(50, 0, 496, this.method11(735));
            this.field442 = new class35(37, 0, 269, this.method11(735));
            this.field443 = new class35(45, 0, 249, this.method11(735));
            this.field377 = true;
            this.field178.method360(-921);
            class54.field1474 = this.field195;
        }
    }

    @OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
    public final void method143(int arg0) {
        this.field344 += arg0;
        if (super.field39 == 1) {
            if (super.field40 >= 539 && super.field40 <= 573 && super.field41 >= 169 && super.field41 < 205 && this.field278[0] != -1) {
                this.field268 = true;
                this.field270 = 0;
                this.field78 = true;
            }
            if (super.field40 >= 569 && super.field40 <= 599 && super.field41 >= 168 && super.field41 < 205 && this.field278[1] != -1) {
                this.field268 = true;
                this.field270 = 1;
                this.field78 = true;
            }
            if (super.field40 >= 597 && super.field40 <= 627 && super.field41 >= 168 && super.field41 < 205 && this.field278[2] != -1) {
                this.field268 = true;
                this.field270 = 2;
                this.field78 = true;
            }
            if (super.field40 >= 625 && super.field40 <= 669 && super.field41 >= 168 && super.field41 < 203 && this.field278[3] != -1) {
                this.field268 = true;
                this.field270 = 3;
                this.field78 = true;
            }
            if (super.field40 >= 666 && super.field40 <= 696 && super.field41 >= 168 && super.field41 < 205 && this.field278[4] != -1) {
                this.field268 = true;
                this.field270 = 4;
                this.field78 = true;
            }
            if (super.field40 >= 694 && super.field40 <= 724 && super.field41 >= 168 && super.field41 < 205 && this.field278[5] != -1) {
                this.field268 = true;
                this.field270 = 5;
                this.field78 = true;
            }
            if (super.field40 >= 722 && super.field40 <= 756 && super.field41 >= 169 && super.field41 < 205 && this.field278[6] != -1) {
                this.field268 = true;
                this.field270 = 6;
                this.field78 = true;
            }
            if (super.field40 >= 540 && super.field40 <= 574 && super.field41 >= 466 && super.field41 < 502 && this.field278[7] != -1) {
                this.field268 = true;
                this.field270 = 7;
                this.field78 = true;
            }
            if (super.field40 >= 572 && super.field40 <= 602 && super.field41 >= 466 && super.field41 < 503 && this.field278[8] != -1) {
                this.field268 = true;
                this.field270 = 8;
                this.field78 = true;
            }
            if (super.field40 >= 599 && super.field40 <= 629 && super.field41 >= 466 && super.field41 < 503 && this.field278[9] != -1) {
                this.field268 = true;
                this.field270 = 9;
                this.field78 = true;
            }
            if (super.field40 >= 627 && super.field40 <= 671 && super.field41 >= 467 && super.field41 < 502 && this.field278[10] != -1) {
                this.field268 = true;
                this.field270 = 10;
                this.field78 = true;
            }
            if (super.field40 >= 669 && super.field40 <= 699 && super.field41 >= 466 && super.field41 < 503 && this.field278[11] != -1) {
                this.field268 = true;
                this.field270 = 11;
                this.field78 = true;
            }
            if (super.field40 >= 696 && super.field40 <= 726 && super.field41 >= 466 && super.field41 < 503 && this.field278[12] != -1) {
                this.field268 = true;
                this.field270 = 12;
                this.field78 = true;
            }
            if (super.field40 >= 724 && super.field40 <= 758 && super.field41 >= 466 && super.field41 < 502 && this.field278[13] != -1) {
                this.field268 = true;
                this.field270 = 13;
                this.field78 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Z")
    public final boolean method144(int arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field257[arg1];
            int var4 = 97 / arg0;
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 9;
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
    public final void method145(boolean arg0) {
        if (this.field136 != 0) {
            class67 var2 = this.field545;
            this.field405 &= arg0;
            int var3 = 0;
            if (this.field231 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field154[var4] != null) {
                    int var5 = this.field152[var4];
                    String var6 = this.field153[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field538 == 0 || this.field538 == 1 && this.method30(426, var6))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method589(0, "From", var9, var8, -312);
                        var2.method589(65535, "From", var9, var8 - 1, -312);
                        int var10 = var9 + var2.method587("From ", -24375);
                        if (var7 == 1) {
                            this.field501[0].method20(48946, var8 - 12, var10);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field501[1].method20(48946, var8 - 12, var10);
                            var10 += 14;
                        }
                        var2.method589(0, var6 + ": " + this.field154[var4], var10, var8, -312);
                        var2.method589(65535, var6 + ": " + this.field154[var4], var10, var8 - 1, -312);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field538 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method589(0, this.field154[var4], 4, var11, -312);
                        var2.method589(65535, this.field154[var4], 4, var11 - 1, -312);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field538 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method589(0, "To " + var6 + ": " + this.field154[var4], 4, var12, -312);
                        var2.method589(65535, "To " + var6 + ": " + this.field154[var4], 4, var12 - 1, -312);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
    public final void method146(byte arg0) {
        this.field177.method360(-921);
        if (this.field543 == 2) {
            byte[] var2 = this.field203.field58;
            int[] var3 = class52.field1436;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field183.method462(33, 25, 25, true, 256, 0, this.field375, this.field515, this.field317, 33, 0);
            this.field178.method360(-921);
            class54.field1474 = this.field195;
        } else {
            int var6 = this.field515 + this.field199 & 2047;
            int var7 = field254.field706 / 32 + 48;
            int var8 = 464 - field254.field707 / 32;
            this.field440.method462(146, var7, var8, true, this.field449 + 256, 5, this.field232, var6, this.field191, 151, 25);
            this.field183.method462(33, 25, 25, true, 256, 0, this.field375, this.field515, this.field317, 33, 0);
            for (int var9 = 0; var9 < this.field423; ++var9) {
                int var39 = this.field424[var9] * 4 + 2 - field254.field706 / 32;
                int var40 = this.field425[var9] * 4 + 2 - field254.field707 / 32;
                this.method151(var39, this.field93[var9], var40, -46517);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class61 var36 = this.field118[this.field459][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field254.field706 / 32;
                        int var38 = var35 * 4 + 2 - field254.field707 / 32;
                        this.method151(var37, this.field487, var38, -46517);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field396; ++var11) {
                class70 var31 = this.field395[this.field397[var11]];
                if (var31 != null && var31.method166(5)) {
                    class45 var32 = var31.field1736;
                    if (var32.field1292 != null) {
                        var32 = var32.method437(505);
                    }
                    if (var32 != null && var32.field1295 && var32.field1290) {
                        int var33 = var31.field706 / 32 - field254.field706 / 32;
                        int var34 = var31.field707 / 32 - field254.field707 / 32;
                        this.method151(var33, this.field488, var34, -46517);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field293; ++var12) {
                class6 var23 = this.field292[this.field294[var12]];
                if (var23 != null && var23.method166(5)) {
                    int var24 = var23.field706 / 32 - field254.field706 / 32;
                    int var25 = var23.field707 / 32 - field254.field707 / 32;
                    boolean var26 = false;
                    long var27 = class53.method491(var23.field604);
                    for (int var29 = 0; var29 < this.field197; ++var29) {
                        if (this.field147[var29] == var27 && this.field407[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field254.field588 != 0 && var23.field588 != 0 && field254.field588 == var23.field588) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method151(var24, this.field490, var25, -46517);
                    } else if (var30) {
                        this.method151(var24, this.field491, var25, -46517);
                    } else {
                        this.method151(var24, this.field489, var25, -46517);
                    }
                }
            }
            if (this.field124 != 0 && field542 % 20 < 10) {
                if (this.field124 == 1 && this.field81 >= 0 && this.field81 < this.field395.length) {
                    class70 var13 = this.field395[this.field81];
                    if (var13 != null) {
                        int var14 = var13.field706 / 32 - field254.field706 / 32;
                        int var15 = var13.field707 / 32 - field254.field707 / 32;
                        this.method107(this.field429, var15, var14, 13412);
                    }
                }
                if (this.field124 == 2) {
                    int var16 = (this.field119 - this.field358) * 4 + 2 - field254.field706 / 32;
                    int var17 = (this.field120 - this.field359) * 4 + 2 - field254.field707 / 32;
                    this.method107(this.field429, var17, var16, 13412);
                }
                if (this.field124 == 10 && this.field125 >= 0 && this.field125 < this.field292.length) {
                    class6 var18 = this.field292[this.field125];
                    if (var18 != null) {
                        int var19 = var18.field706 / 32 - field254.field706 / 32;
                        int var20 = var18.field707 / 32 - field254.field707 / 32;
                        this.method107(this.field429, var20, var19, 13412);
                    }
                }
            }
            if (this.field438 != 0) {
                int var21 = this.field438 * 4 + 2 - field254.field706 / 32;
                int var22 = this.field439 * 4 + 2 - field254.field707 / 32;
                this.method151(var21, this.field428, var22, -46517);
            }
            class52.method484(16777215, 97, 4, 78, 3, 3);
            if (arg0 != 51) {
                this.field175 = this.field156.method514();
            }
            this.field178.method360(-921);
            class54.field1474 = this.field195;
        }
    }

    @OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
    public void method147(int arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field304);
        if (this.field132 != null) {
            System.out.println("Od-cycle:" + this.field132.field1503);
        }
        System.out.println("loop-cycle:" + field542);
        int var2 = 73 / arg0;
        System.out.println("draw-cycle:" + field95);
        System.out.println("ptype:" + this.field345);
        System.out.println("psize:" + this.field344);
        if (this.field277 != null) {
            this.field277.method561(969);
        }
        super.field22 = true;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public final Component method11(int arg0) {
        int var2 = 29 / arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field28 != null ? super.field28 : this;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
    public final void method148(int arg0, boolean arg1) {
        if (arg1) {
            field318 = !field318;
        }
        if (arg0 >= 0) {
            int var3 = this.field255[arg0];
            int var4 = this.field256[arg0];
            int var5 = this.field257[arg0];
            int var6 = this.field258[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (this.field160 != 0 && var5 != 1086) {
                this.field160 = 0;
                this.field350 = true;
            }
            if (var5 == 503) {
                String var7 = this.field79[arg0];
                int var8 = var7.indexOf("@whi@");
                if (var8 != -1) {
                    long var9 = class53.method491(var7.substring(var8 + 5).trim());
                    int var11 = -1;
                    for (int var12 = 0; var12 < this.field197; ++var12) {
                        if (this.field147[var12] == var9) {
                            var11 = var12;
                            break;
                        }
                    }
                    if (var11 != -1 && this.field407[var11] > 0) {
                        this.field350 = true;
                        this.field160 = 0;
                        this.field557 = true;
                        this.field567 = "";
                        this.field300 = 3;
                        this.field244 = this.field147[var11];
                        this.field536 = "Enter message to send to " + this.field84[var11];
                    }
                }
            }
            if (var5 == 230 && this.method152(var4, var6, var3, true)) {
                this.field466.method375(29, this.field496);
                this.field466.method410(this.field328, false);
                this.field466.method377(this.field359 + var4);
                this.field466.method410(var6 >> 14 & 32767, false);
                this.field466.method412(-963, this.field330);
                this.field466.method410(this.field358 + var3, false);
                this.field466.method377(this.field329);
            }
            if (var5 == 1253) {
                class50 var13 = class50.method475(var6);
                String var14;
                if (var13.field1398 != null) {
                    var14 = new String(var13.field1398);
                } else {
                    var14 = "It's a " + var13.field1410 + ".";
                }
                this.method121(var14, 0, "", -212);
            }
            if (var5 == 85) {
                class70 var15 = this.field395[var6];
                if (var15 != null) {
                    this.method112(1, field254.field681[0], 1, field254.field682[0], var15.field681[0], 0, 2, var15.field682[0], 0, 988, 0, false);
                    this.field225 = super.field40;
                    this.field226 = super.field41;
                    this.field228 = 2;
                    this.field227 = 0;
                    this.field466.method375(6, this.field496);
                    this.field466.method377(this.field402);
                    this.field466.method412(-963, var6);
                }
            }
            if (var5 == 42) {
                boolean var16 = this.method112(0, field254.field681[0], 0, field254.field682[0], var3, 0, 2, var4, 0, 988, 0, false);
                if (!var16) {
                    this.method112(1, field254.field681[0], 1, field254.field682[0], var3, 0, 2, var4, 0, 988, 0, false);
                }
                this.field225 = super.field40;
                this.field226 = super.field41;
                this.field228 = 2;
                this.field227 = 0;
                field469 += var4;
                if (field469 >= 120) {
                    this.field466.method375(83, this.field496);
                    field469 = 0;
                }
                this.field466.method375(125, this.field496);
                this.field466.method411(this.field358 + var3, false);
                this.field466.method410(var6, false);
                this.field466.method412(-963, this.field359 + var4);
            }
            if (var5 == 271) {
                boolean var18 = this.method112(0, field254.field681[0], 0, field254.field682[0], var3, 0, 2, var4, 0, 988, 0, false);
                if (!var18) {
                    this.method112(1, field254.field681[0], 1, field254.field682[0], var3, 0, 2, var4, 0, 988, 0, false);
                }
                this.field225 = super.field40;
                this.field226 = super.field41;
                this.field228 = 2;
                this.field227 = 0;
                this.field466.method375(134, this.field496);
                this.field466.method377(var6);
                this.field466.method411(this.field328, false);
                this.field466.method412(-963, this.field358 + var3);
                this.field466.method411(this.field329, false);
                this.field466.method410(this.field330, false);
                this.field466.method377(this.field359 + var4);
            }
            if (var5 == 217) {
                class6 var20 = this.field292[var6];
                if (var20 != null) {
                    this.method112(1, field254.field681[0], 1, field254.field682[0], var20.field681[0], 0, 2, var20.field682[0], 0, 988, 0, false);
                    this.field225 = super.field40;
                    this.field226 = super.field41;
                    this.field228 = 2;
                    this.field227 = 0;
                    field247 += var6;
                    if (field247 >= 143) {
                        this.field466.method375(1, this.field496);
                        field247 = 0;
                    }
                    this.field466.method375(234, this.field496);
                    this.field466.method410(var6, false);
                }
            }
            if (var5 == 781) {
                class25 var21 = class25.method276(var4);
                boolean var22 = true;
                if (var21.field951 > 0) {
                    var22 = this.method48(var21, (byte) 56);
                }
                if (var22) {
                    this.field466.method375(252, this.field496);
                    this.field466.method377(var4);
                }
            }
            if (var5 == 257) {
                this.field466.method375(155, this.field496);
                this.field466.method411(var3, false);
                this.field466.method412(-963, var4);
                this.field466.method377(var6);
                this.field508 = 0;
                this.field509 = var4;
                this.field510 = var3;
                this.field511 = 2;
                if (class25.method276(var4).field974 == this.field572) {
                    this.field511 = 1;
                }
                if (class25.method276(var4).field974 == this.field352) {
                    this.field511 = 3;
                }
            }
            if (var5 == 198 && !this.field530) {
                this.field466.method375(154, this.field496);
                this.field466.method377(var4);
                this.field530 = true;
            }
            if (var5 == 734) {
                this.field466.method375(128, this.field496);
                this.field466.method410(var3, false);
                this.field466.method377(var4);
                this.field466.method410(var6, false);
                this.field508 = 0;
                this.field509 = var4;
                this.field510 = var3;
                this.field511 = 2;
                if (class25.method276(var4).field974 == this.field572) {
                    this.field511 = 1;
                }
                if (class25.method276(var4).field974 == this.field352) {
                    this.field511 = 3;
                }
            }
            if (var5 == 204) {
                this.method152(var4, var6, var3, true);
                this.field466.method375(62, this.field496);
                this.field466.method377(var6 >> 14 & 32767);
                this.field466.method412(-963, this.field358 + var3);
                this.field466.method377(this.field359 + var4);
            }
            if (var5 == 642) {
                class70 var23 = this.field395[var6];
                if (var23 != null) {
                    this.method112(1, field254.field681[0], 1, field254.field682[0], var23.field681[0], 0, 2, var23.field682[0], 0, 988, 0, false);
                    this.field225 = super.field40;
                    this.field226 = super.field41;
                    this.field228 = 2;
                    this.field227 = 0;
                    field282 += var6;
                    if (field282 >= 149) {
                        this.field466.method375(89, this.field496);
                        this.field466.method380(0);
                        field282 = 0;
                    }
                    this.field466.method375(162, this.field496);
                    this.field466.method412(-963, var6);
                }
            }
            if (var5 == 386 || var5 == 679) {
                String var24 = this.field79[arg0];
                int var25 = var24.indexOf("@whi@");
                if (var25 != -1) {
                    String var26 = var24.substring(var25 + 5).trim();
                    String var27 = class53.method495(true, class53.method492(42220, class53.method491(var26)));
                    boolean var28 = false;
                    for (int var29 = 0; var29 < this.field293; ++var29) {
                        class6 var30 = this.field292[this.field294[var29]];
                        if (var30 != null && var30.field604 != null && var30.field604.equalsIgnoreCase(var27)) {
                            this.method112(1, field254.field681[0], 1, field254.field682[0], var30.field681[0], 0, 2, var30.field682[0], 0, 988, 0, false);
                            if (var5 == 386) {
                                this.field466.method375(119, this.field496);
                                this.field466.method412(-963, this.field294[var29]);
                            }
                            if (var5 == 679) {
                                this.field466.method375(151, this.field496);
                                this.field466.method411(this.field294[var29], false);
                            }
                            var28 = true;
                            break;
                        }
                    }
                    if (!var28) {
                        this.method121("Unable to find " + var27, 0, "", -212);
                    }
                }
            }
            if (var5 == 641) {
                field189 += var3;
                if (field189 >= 118) {
                    this.field466.method375(90, this.field496);
                    this.field466.method376(4);
                    field189 = 0;
                }
                this.method152(var4, var6, var3, true);
                this.field466.method375(194, this.field496);
                this.field466.method377(this.field359 + var4);
                this.field466.method411(var6 >> 14 & 32767, false);
                this.field466.method412(-963, this.field358 + var3);
            }
            if (var5 == 783) {
                class6 var31 = this.field292[var6];
                if (var31 != null) {
                    this.method112(1, field254.field681[0], 1, field254.field682[0], var31.field681[0], 0, 2, var31.field682[0], 0, 988, 0, false);
                    this.field225 = super.field40;
                    this.field226 = super.field41;
                    this.field228 = 2;
                    this.field227 = 0;
                    this.field466.method375(120, this.field496);
                    this.field466.method411(this.field329, false);
                    this.field466.method377(this.field328);
                    this.field466.method410(var6, false);
                    this.field466.method412(-963, this.field330);
                }
            }
            if (var5 == 108) {
                this.field327 = 1;
                this.field328 = var3;
                this.field329 = var4;
                this.field330 = var6;
                this.field331 = String.valueOf(class50.method475(var6).field1410);
                this.field401 = 0;
                this.field268 = true;
            } else {
                if (var5 == 858) {
                    this.field466.method375(8, this.field496);
                    this.field466.method377(this.field328);
                    this.field466.method377(var4);
                    this.field466.method411(this.field330, false);
                    this.field466.method410(var3, false);
                    this.field466.method377(this.field329);
                    this.field466.method411(var6, false);
                    this.field508 = 0;
                    this.field509 = var4;
                    this.field510 = var3;
                    this.field511 = 2;
                    if (class25.method276(var4).field974 == this.field572) {
                        this.field511 = 1;
                    }
                    if (class25.method276(var4).field974 == this.field352) {
                        this.field511 = 3;
                    }
                }
                if (var5 == 540) {
                    class70 var32 = this.field395[var6];
                    if (var32 != null) {
                        this.method112(1, field254.field681[0], 1, field254.field682[0], var32.field681[0], 0, 2, var32.field682[0], 0, 988, 0, false);
                        this.field225 = super.field40;
                        this.field226 = super.field41;
                        this.field228 = 2;
                        this.field227 = 0;
                        this.field466.method375(65, this.field496);
                        this.field466.method377(this.field328);
                        this.field466.method410(var6, false);
                        this.field466.method410(this.field330, false);
                        this.field466.method377(this.field329);
                    }
                }
                if (var5 == 252) {
                    this.method52(927);
                }
                if (var5 == 181) {
                    if ((var4 & 3) == 0) {
                        ++field451;
                    }
                    if (field451 >= 80) {
                        this.field466.method375(143, this.field496);
                        field451 = 0;
                    }
                    this.method152(var4, var6, var3, true);
                    this.field466.method375(61, this.field496);
                    this.field466.method377(this.field359 + var4);
                    this.field466.method410(var6 >> 14 & 32767, false);
                    this.field466.method411(this.field358 + var3, false);
                }
                if (var5 == 172) {
                    boolean var33 = this.method112(0, field254.field681[0], 0, field254.field682[0], var3, 0, 2, var4, 0, 988, 0, false);
                    if (!var33) {
                        this.method112(1, field254.field681[0], 1, field254.field682[0], var3, 0, 2, var4, 0, 988, 0, false);
                    }
                    this.field225 = super.field40;
                    this.field226 = super.field41;
                    this.field228 = 2;
                    this.field227 = 0;
                    this.field466.method375(103, this.field496);
                    this.field466.method410(this.field359 + var4, false);
                    this.field466.method411(var6, false);
                    this.field466.method377(this.field358 + var3);
                }
                if (var5 == 1927) {
                    int var35 = var6 >> 14 & 32767;
                    class36 var36 = class36.method363(var35);
                    String var37;
                    if (var36.field1186 != null) {
                        var37 = new String(var36.field1186);
                    } else {
                        var37 = "It's a " + var36.field1165 + ".";
                    }
                    this.method121(var37, 0, "", -212);
                }
                if (var5 == 957) {
                    if (!this.field408) {
                        this.field217.method254(super.field40 - 4, (byte) 7, super.field41 - 4);
                    } else {
                        this.field217.method254(var3 - 4, (byte) 7, var4 - 4);
                    }
                }
                if (var5 == 720) {
                    this.method50(8, this.field500);
                    this.field500 = -1;
                    this.field350 = true;
                }
                if (var5 == 1129) {
                    this.method152(var4, var6, var3, true);
                    this.field466.method375(85, this.field496);
                    this.field466.method410(this.field358 + var3, false);
                    this.field466.method412(-963, this.field359 + var4);
                    this.field466.method411(var6 >> 14 & 32767, false);
                }
                if (var5 == 148) {
                    class70 var38 = this.field395[var6];
                    if (var38 != null) {
                        this.method112(1, field254.field681[0], 1, field254.field682[0], var38.field681[0], 0, 2, var38.field682[0], 0, 988, 0, false);
                        this.field225 = super.field40;
                        this.field226 = super.field41;
                        this.field228 = 2;
                        this.field227 = 0;
                        this.field466.method375(255, this.field496);
                        this.field466.method410(var6, false);
                    }
                }
                if (var5 == 197) {
                    class6 var39 = this.field292[var6];
                    if (var39 != null) {
                        this.method112(1, field254.field681[0], 1, field254.field682[0], var39.field681[0], 0, 2, var39.field682[0], 0, 988, 0, false);
                        this.field225 = super.field40;
                        this.field226 = super.field41;
                        this.field228 = 2;
                        this.field227 = 0;
                        this.field466.method375(151, this.field496);
                        this.field466.method411(var6, false);
                    }
                }
                if (var5 == 974) {
                    this.field466.method375(192, this.field496);
                    this.field466.method410(var6, false);
                    this.field466.method411(var3, false);
                    this.field466.method411(var4, false);
                    this.field508 = 0;
                    this.field509 = var4;
                    this.field510 = var3;
                    this.field511 = 2;
                    if (class25.method276(var4).field974 == this.field572) {
                        this.field511 = 1;
                    }
                    if (class25.method276(var4).field974 == this.field352) {
                        this.field511 = 3;
                    }
                }
                if (var5 == 989) {
                    String var40 = this.field79[arg0];
                    int var41 = var40.indexOf("@whi@");
                    if (var41 != -1) {
                        if (this.field572 == -1) {
                            this.method52(927);
                            this.field573 = var40.substring(var41 + 5).trim();
                            this.field388 = false;
                            this.field333 = this.field572 = class25.field954;
                        } else {
                            this.method121("Please close the interface you have open before using 'report abuse'", 0, "", -212);
                        }
                    }
                }
                if (var5 == 309) {
                    class6 var42 = this.field292[var6];
                    if (var42 != null) {
                        this.method112(1, field254.field681[0], 1, field254.field682[0], var42.field681[0], 0, 2, var42.field682[0], 0, 988, 0, false);
                        this.field225 = super.field40;
                        this.field226 = super.field41;
                        this.field228 = 2;
                        this.field227 = 0;
                        this.field466.method375(132, this.field496);
                        this.field466.method410(var6, false);
                    }
                }
                if (var5 == 462) {
                    class70 var43 = this.field395[var6];
                    if (var43 != null) {
                        this.method112(1, field254.field681[0], 1, field254.field682[0], var43.field681[0], 0, 2, var43.field682[0], 0, 988, 0, false);
                        this.field225 = super.field40;
                        this.field226 = super.field41;
                        this.field228 = 2;
                        this.field227 = 0;
                        this.field466.method375(22, this.field496);
                        this.field466.method410(var6, false);
                    }
                }
                if (var5 == 758) {
                    class25 var44 = class25.method276(var4);
                    this.field401 = 1;
                    this.field402 = var4;
                    this.field403 = var44.field956;
                    this.field327 = 0;
                    this.field268 = true;
                    String var45 = var44.field973;
                    if (var45.indexOf(" ") != -1) {
                        var45 = var45.substring(0, var45.indexOf(" "));
                    }
                    String var46 = var44.field973;
                    if (var46.indexOf(" ") != -1) {
                        var46 = var46.substring(var46.indexOf(" ") + 1);
                    }
                    this.field404 = var45 + " " + var44.field964 + " " + var46;
                    if (this.field403 == 16) {
                        this.field268 = true;
                        this.field270 = 3;
                        this.field78 = true;
                    }
                } else {
                    if (var5 == 627) {
                        this.field466.method375(222, this.field496);
                        this.field466.method411(var6, false);
                        this.field466.method377(var3);
                        this.field466.method377(var4);
                        this.field508 = 0;
                        this.field509 = var4;
                        this.field510 = var3;
                        this.field511 = 2;
                        if (class25.method276(var4).field974 == this.field572) {
                            this.field511 = 1;
                        }
                        if (class25.method276(var4).field974 == this.field352) {
                            this.field511 = 3;
                        }
                    }
                    if (var5 == 304) {
                        this.field466.method375(204, this.field496);
                        this.field466.method412(-963, var4);
                        this.field466.method412(-963, var6);
                        this.field466.method377(var3);
                        this.field508 = 0;
                        this.field509 = var4;
                        this.field510 = var3;
                        this.field511 = 2;
                        if (class25.method276(var4).field974 == this.field572) {
                            this.field511 = 1;
                        }
                        if (class25.method276(var4).field974 == this.field352) {
                            this.field511 = 3;
                        }
                    }
                    if (var5 == 459) {
                        field181 += var3;
                        if (field181 >= 85) {
                            this.field466.method375(247, this.field496);
                            this.field466.method380(0);
                            field181 = 0;
                        }
                        this.field466.method375(16, this.field496);
                        this.field466.method412(-963, var6);
                        this.field466.method412(-963, var4);
                        this.field466.method412(-963, var3);
                        this.field508 = 0;
                        this.field509 = var4;
                        this.field510 = var3;
                        this.field511 = 2;
                        if (class25.method276(var4).field974 == this.field572) {
                            this.field511 = 1;
                        }
                        if (class25.method276(var4).field974 == this.field352) {
                            this.field511 = 3;
                        }
                    }
                    if (var5 == 602) {
                        boolean var47 = this.method112(0, field254.field681[0], 0, field254.field682[0], var3, 0, 2, var4, 0, 988, 0, false);
                        if (!var47) {
                            this.method112(1, field254.field681[0], 1, field254.field682[0], var3, 0, 2, var4, 0, 988, 0, false);
                        }
                        this.field225 = super.field40;
                        this.field226 = super.field41;
                        this.field228 = 2;
                        this.field227 = 0;
                        this.field466.method375(78, this.field496);
                        this.field466.method377(var6);
                        this.field466.method410(this.field402, false);
                        this.field466.method377(this.field358 + var3);
                        this.field466.method410(this.field359 + var4, false);
                    }
                    if (var5 == 493) {
                        boolean var49 = this.method112(0, field254.field681[0], 0, field254.field682[0], var3, 0, 2, var4, 0, 988, 0, false);
                        if (!var49) {
                            this.method112(1, field254.field681[0], 1, field254.field682[0], var3, 0, 2, var4, 0, 988, 0, false);
                        }
                        this.field225 = super.field40;
                        this.field226 = super.field41;
                        this.field228 = 2;
                        this.field227 = 0;
                        this.field466.method375(42, this.field496);
                        this.field466.method410(this.field359 + var4, false);
                        this.field466.method411(this.field358 + var3, false);
                        this.field466.method411(var6, false);
                    }
                    if (var5 == 1194) {
                        class50 var51 = class50.method475(var6);
                        class25 var52 = class25.method276(var4);
                        String var53;
                        if (var52 != null && var52.field919[var3] >= 100000) {
                            var53 = var52.field919[var3] + " x " + var51.field1410;
                        } else if (var51.field1398 != null) {
                            var53 = new String(var51.field1398);
                        } else {
                            var53 = "It's a " + var51.field1410 + ".";
                        }
                        this.method121(var53, 0, "", -212);
                    }
                    if (var5 == 929) {
                        this.method152(var4, var6, var3, true);
                        this.field466.method375(112, this.field496);
                        this.field466.method411(this.field359 + var4, false);
                        this.field466.method377(this.field358 + var3);
                        this.field466.method411(var6 >> 14 & 32767, false);
                    }
                    if (var5 == 370 && this.method152(var4, var6, var3, true)) {
                        this.field466.method375(146, this.field496);
                        this.field466.method412(-963, this.field402);
                        this.field466.method377(this.field359 + var4);
                        this.field466.method412(-963, this.field358 + var3);
                        this.field466.method377(var6 >> 14 & 32767);
                    }
                    if (var5 == 848) {
                        class70 var54 = this.field395[var6];
                        if (var54 != null) {
                            this.method112(1, field254.field681[0], 1, field254.field682[0], var54.field681[0], 0, 2, var54.field682[0], 0, 988, 0, false);
                            this.field225 = super.field40;
                            this.field226 = super.field41;
                            this.field228 = 2;
                            this.field227 = 0;
                            this.field466.method375(239, this.field496);
                            this.field466.method410(var6, false);
                        }
                    }
                    if (var5 == 524) {
                        this.field466.method375(174, this.field496);
                        this.field466.method377(var6);
                        this.field466.method410(var3, false);
                        this.field466.method410(var4, false);
                        this.field508 = 0;
                        this.field509 = var4;
                        this.field510 = var3;
                        this.field511 = 2;
                        if (class25.method276(var4).field974 == this.field572) {
                            this.field511 = 1;
                        }
                        if (class25.method276(var4).field974 == this.field352) {
                            this.field511 = 3;
                        }
                    }
                    if (var5 == 380) {
                        this.field466.method375(30, this.field496);
                        this.field466.method412(-963, var3);
                        this.field466.method410(var6, false);
                        this.field466.method411(var4, false);
                        this.field508 = 0;
                        this.field509 = var4;
                        this.field510 = var3;
                        this.field511 = 2;
                        if (class25.method276(var4).field974 == this.field572) {
                            this.field511 = 1;
                        }
                        if (class25.method276(var4).field974 == this.field352) {
                            this.field511 = 3;
                        }
                    }
                    if (var5 == 392) {
                        this.field466.method375(252, this.field496);
                        this.field466.method377(var4);
                        class25 var55 = class25.method276(var4);
                        if (var55.field925 != null && var55.field925[0][0] == 5) {
                            int var56 = var55.field925[0][1];
                            this.field498[var56] = 1 - this.field498[var56];
                            this.method137(true, var56);
                            this.field268 = true;
                        }
                    }
                    if (var5 == 569) {
                        this.field466.method375(252, this.field496);
                        this.field466.method377(var4);
                        class25 var57 = class25.method276(var4);
                        if (var57.field925 != null && var57.field925[0][0] == 5) {
                            int var58 = var57.field925[0][1];
                            if (this.field498[var58] != var57.field910[0]) {
                                this.field498[var58] = var57.field910[0];
                                this.method137(true, var58);
                                this.field268 = true;
                            }
                        }
                    }
                    if (var5 == 1657) {
                        class70 var59 = this.field395[var6];
                        if (var59 != null) {
                            class45 var60 = var59.field1736;
                            if (var60.field1292 != null) {
                                var60 = var60.method437(505);
                            }
                            if (var60 != null) {
                                String var61;
                                if (var60.field1306 != null) {
                                    var61 = new String(var60.field1306);
                                } else {
                                    var61 = "It's a " + var60.field1316 + ".";
                                }
                                this.method121(var61, 0, "", -212);
                            }
                        }
                    }
                    if (var5 == 518) {
                        this.field466.method375(136, this.field496);
                        this.field466.method411(var4, false);
                        this.field466.method411(var3, false);
                        this.field466.method377(var6);
                        this.field508 = 0;
                        this.field509 = var4;
                        this.field510 = var3;
                        this.field511 = 2;
                        if (class25.method276(var4).field974 == this.field572) {
                            this.field511 = 1;
                        }
                        if (class25.method276(var4).field974 == this.field352) {
                            this.field511 = 3;
                        }
                    }
                    if (var5 == 2) {
                        class6 var62 = this.field292[var6];
                        if (var62 != null) {
                            this.method112(1, field254.field681[0], 1, field254.field682[0], var62.field681[0], 0, 2, var62.field682[0], 0, 988, 0, false);
                            this.field225 = super.field40;
                            this.field226 = super.field41;
                            this.field228 = 2;
                            this.field227 = 0;
                            field259 += var6;
                            if (field259 >= 141) {
                                this.field466.method375(152, this.field496);
                                this.field466.method379(9316824);
                                field259 = 0;
                            }
                            this.field466.method375(184, this.field496);
                            this.field466.method411(var6, false);
                        }
                    }
                    if (var5 == 418) {
                        class70 var63 = this.field395[var6];
                        if (var63 != null) {
                            this.method112(1, field254.field681[0], 1, field254.field682[0], var63.field681[0], 0, 2, var63.field682[0], 0, 988, 0, false);
                            this.field225 = super.field40;
                            this.field226 = super.field41;
                            this.field228 = 2;
                            this.field227 = 0;
                            this.field466.method375(44, this.field496);
                            this.field466.method377(var6);
                        }
                    }
                    if (var5 == 308) {
                        this.field466.method375(173, this.field496);
                        this.field466.method412(-963, this.field402);
                        this.field466.method377(var6);
                        this.field466.method411(var3, false);
                        this.field466.method411(var4, false);
                        this.field508 = 0;
                        this.field509 = var4;
                        this.field510 = var3;
                        this.field511 = 2;
                        if (class25.method276(var4).field974 == this.field572) {
                            this.field511 = 1;
                        }
                        if (class25.method276(var4).field974 == this.field352) {
                            this.field511 = 3;
                        }
                    }
                    if (var5 == 852) {
                        boolean var64 = this.method112(0, field254.field681[0], 0, field254.field682[0], var3, 0, 2, var4, 0, 988, 0, false);
                        if (!var64) {
                            this.method112(1, field254.field681[0], 1, field254.field682[0], var3, 0, 2, var4, 0, 988, 0, false);
                        }
                        this.field225 = super.field40;
                        this.field226 = super.field41;
                        this.field228 = 2;
                        this.field227 = 0;
                        ++field464;
                        if (field464 >= 112) {
                            this.field466.method375(74, this.field496);
                            this.field466.method380(0);
                            field464 = 0;
                        }
                        this.field466.method375(23, this.field496);
                        this.field466.method410(var6, false);
                        this.field466.method412(-963, this.field359 + var4);
                        this.field466.method410(this.field358 + var3, false);
                    }
                    if (var5 == 471) {
                        class6 var66 = this.field292[var6];
                        if (var66 != null) {
                            this.method112(1, field254.field681[0], 1, field254.field682[0], var66.field681[0], 0, 2, var66.field682[0], 0, 988, 0, false);
                            this.field225 = super.field40;
                            this.field226 = super.field41;
                            this.field228 = 2;
                            this.field227 = 0;
                            this.field466.method375(119, this.field496);
                            this.field466.method412(-963, var6);
                        }
                    }
                    if (var5 == 9 || var5 == 405 || var5 == 953 || var5 == 305) {
                        String var67 = this.field79[arg0];
                        int var68 = var67.indexOf("@whi@");
                        if (var68 != -1) {
                            long var69 = class53.method491(var67.substring(var68 + 5).trim());
                            if (var5 == 9) {
                                this.method76(false, var69);
                            }
                            if (var5 == 405) {
                                this.method78(true, var69);
                            }
                            if (var5 == 953) {
                                this.method75(this.field507, var69);
                            }
                            if (var5 == 305) {
                                this.method96(20382, var69);
                            }
                        }
                    }
                    if (var5 == 239) {
                        this.field466.method375(215, this.field496);
                        this.field466.method410(var6, false);
                        this.field466.method410(var4, false);
                        this.field466.method410(var3, false);
                        this.field508 = 0;
                        this.field509 = var4;
                        this.field510 = var3;
                        this.field511 = 2;
                        if (class25.method276(var4).field974 == this.field572) {
                            this.field511 = 1;
                        }
                        if (class25.method276(var4).field974 == this.field352) {
                            this.field511 = 3;
                        }
                    }
                    if (var5 == 359) {
                        class6 var71 = this.field292[var6];
                        if (var71 != null) {
                            this.method112(1, field254.field681[0], 1, field254.field682[0], var71.field681[0], 0, 2, var71.field682[0], 0, 988, 0, false);
                            this.field225 = super.field40;
                            this.field226 = super.field41;
                            this.field228 = 2;
                            this.field227 = 0;
                            this.field466.method375(228, this.field496);
                            this.field466.method377(this.field402);
                            this.field466.method411(var6, false);
                        }
                    }
                    if (var5 == 895) {
                        boolean var72 = this.method112(0, field254.field681[0], 0, field254.field682[0], var3, 0, 2, var4, 0, 988, 0, false);
                        if (!var72) {
                            this.method112(1, field254.field681[0], 1, field254.field682[0], var3, 0, 2, var4, 0, 988, 0, false);
                        }
                        this.field225 = super.field40;
                        this.field226 = super.field41;
                        this.field228 = 2;
                        this.field227 = 0;
                        field465 += this.field359;
                        if (field465 >= 124) {
                            this.field466.method375(212, this.field496);
                            this.field466.method376(253);
                            field465 = 0;
                        }
                        this.field466.method375(59, this.field496);
                        this.field466.method377(this.field358 + var3);
                        this.field466.method377(var6);
                        this.field466.method412(-963, this.field359 + var4);
                    }
                    this.field327 = 0;
                    this.field401 = 0;
                    this.field268 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
    public final void method149(int arg0) {
        ++this.field302;
        this.method54(this.field319, true);
        this.method59(599, true);
        this.method54(this.field319, false);
        this.method59(599, false);
        this.method88(2);
        this.method130(this.field355);
        int var2 = 10 / arg0;
        if (!this.field98) {
            int var3 = this.field514;
            if (this.field320 / 256 > var3) {
                var3 = this.field320 / 256;
            }
            if (this.field479[4] && this.field579[4] + 128 > var3) {
                var3 = this.field579[4] + 128;
            }
            int var4 = this.field515 + this.field512 & 2047;
            this.method51(this.method153(field254.field707, field254.field706, -926, this.field459) - 50, var3, var4, this.field102, var3 * 3 + 600, this.field103, 8);
        }
        int var5;
        if (!this.field98) {
            var5 = this.method98(true);
        } else {
            var5 = this.method99(0);
        }
        int var6 = this.field480;
        int var7 = this.field481;
        int var8 = this.field482;
        int var9 = this.field483;
        int var10 = this.field484;
        for (int var11 = 0; var11 < 5; ++var11) {
            if (this.field479[var11]) {
                int var13 = (int) (Math.random() * (double) (this.field96[var11] * 2 + 1) - (double) this.field96[var11] + Math.sin((double) this.field157[var11] / 100.0D * (double) this.field182[var11]) * (double) this.field579[var11]);
                if (var11 == 0) {
                    this.field480 += var13;
                }
                if (var11 == 1) {
                    this.field481 += var13;
                }
                if (var11 == 2) {
                    this.field482 += var13;
                }
                if (var11 == 3) {
                    this.field484 = this.field484 + var13 & 2047;
                }
                if (var11 == 4) {
                    this.field483 += var13;
                    if (this.field483 < 128) {
                        this.field483 = 128;
                    }
                    if (this.field483 > 383) {
                        this.field483 = 383;
                    }
                }
            }
        }
        int var12 = class54.field1483;
        class26.field1049 = true;
        class26.field1052 = 0;
        class26.field1050 = super.field33 - 4;
        class26.field1051 = super.field34 - 4;
        class52.method482(-837);
        this.field217.method255(true, this.field481, this.field484, this.field482, this.field480, var5, this.field483);
        this.field217.method230(-575);
        this.method95(979);
        this.method66(42137);
        this.method163(var12, (byte) 126);
        this.method77(true);
        this.field178.method361(super.field25, 4, 4, (byte) 1);
        this.field480 = var6;
        this.field481 = var7;
        this.field482 = var8;
        this.field483 = var9;
        this.field484 = var10;
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
    public final void method150(byte arg0) {
        if (this.field308 == null) {
            super.field26 = null;
            this.field179 = null;
            this.field177 = null;
            this.field176 = null;
            this.field178 = null;
            this.field441 = null;
            this.field442 = null;
            this.field443 = null;
            this.field311 = new class35(265, 0, 128, this.method11(735));
            class52.method482(-837);
            this.field312 = new class35(265, 0, 128, this.method11(735));
            class52.method482(-837);
            this.field308 = new class35(171, 0, 509, this.method11(735));
            class52.method482(-837);
            this.field309 = new class35(132, 0, 360, this.method11(735));
            class52.method482(-837);
            this.field310 = new class35(200, 0, 360, this.method11(735));
            class52.method482(-837);
            if (arg0 == -57) {
                this.field313 = new class35(238, 0, 202, this.method11(735));
                class52.method482(-837);
                this.field314 = new class35(238, 0, 203, this.method11(735));
                class52.method482(-837);
                this.field315 = new class35(94, 0, 74, this.method11(735));
                class52.method482(-837);
                this.field316 = new class35(94, 0, 75, this.method11(735));
                class52.method482(-837);
                if (this.field529 != null) {
                    this.method111(field111);
                    this.method131(false);
                }
                this.field377 = true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILQEHNWGKD;II)V")
    public final void method151(int arg0, class48 arg1, int arg2, int arg3) {
        if (arg1 != null) {
            int var5 = this.field515 + this.field199 & 2047;
            int var6 = arg0 * arg0 + arg2 * arg2;
            if (var6 <= 6400) {
                int var7 = class26.field1054[var5];
                int var8 = class26.field1055[var5];
                int var9 = var7 * 256 / (this.field449 + 256);
                if (arg3 != -46517) {
                    this.field345 = this.field462.method386();
                }
                int var10 = var8 * 256 / (this.field449 + 256);
                int var11 = arg0 * var10 + arg2 * var9 >> 16;
                int var12 = arg2 * var10 - arg0 * var9 >> 16;
                if (var6 > 2500) {
                    arg1.method464(this.field203, var11 + 94 - arg1.field1366 / 2 + 4, 83 - var12 - arg1.field1367 / 2 - 4, this.field421);
                } else {
                    arg1.method458(48946, 83 - var12 - arg1.field1367 / 2 - 4, var11 + 94 - arg1.field1366 / 2 + 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZ)Z")
    public final boolean method152(int arg0, int arg1, int arg2, boolean arg3) {
        int var5 = arg1 >> 14 & 32767;
        int var6 = this.field217.method246(this.field459, arg2, arg0, arg1);
        this.field405 &= arg3;
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method112(0, field254.field681[0], 0, field254.field682[0], arg2, var8, 2, arg0, 0, 988, var7 + 1, true);
            } else {
                class36 var9 = class36.method363(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1160;
                    var11 = var9.field1157;
                } else {
                    var10 = var9.field1157;
                    var11 = var9.field1160;
                }
                int var12 = var9.field1192;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method112(var10, field254.field681[0], var11, field254.field682[0], arg2, 0, 2, arg0, var12, 988, 0, true);
            }
            this.field225 = super.field40;
            this.field226 = super.field41;
            this.field228 = 2;
            this.field227 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
    public final int method153(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 >> 7;
        int var6 = arg0 >> 7;
        if (arg2 >= 0) {
            this.method6();
        }
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg3;
            if (arg3 < 3 && (this.field460[1][var5][var6] & 2) == 2) {
                var7 = arg3 + 1;
            }
            int var8 = arg1 & 127;
            int var9 = arg0 & 127;
            int var10 = (128 - var8) * this.field558[var7][var5][var6] + this.field558[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field558[var7][var5][var6 + 1] + this.field558[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Z")
    public final boolean method154(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        if (arg2 <= 0) {
            throw new NullPointerException();
        } else {
            class25 var5 = class25.method276(arg1);
            for (int var6 = 0; var6 < var5.field945.length && var5.field945[var6] != -1; ++var6) {
                class25 var7 = class25.method276(var5.field945[var6]);
                if (var7.field957 == 0) {
                    var4 |= this.method154(arg0, var7.field944, 494);
                }
                if (var7.field957 == 6 && (var7.field939 != -1 || var7.field940 != -1)) {
                    boolean var8 = this.method102(6, var7);
                    int var9;
                    if (var8) {
                        var9 = var7.field940;
                    } else {
                        var9 = var7.field939;
                    }
                    if (var9 != -1) {
                        class47 var10 = class47.field1336[var9];
                        var7.field927 += arg0;
                        while (var7.field927 > var10.method451(13126, var7.field935)) {
                            var7.field927 -= var10.method451(13126, var7.field935) + 1;
                            ++var7.field935;
                            if (var7.field935 >= var10.field1337) {
                                var7.field935 -= var10.field1341;
                                if (var7.field935 < 0 || var7.field935 >= var10.field1337) {
                                    var7.field935 = 0;
                                }
                            }
                            var4 = true;
                        }
                    }
                }
                if (var7.field957 == 6 && var7.field918 != 0) {
                    int var11 = var7.field918 >> 16;
                    int var12 = var7.field918 << 16 >> 16;
                    int var13 = arg0 * var11;
                    int var14 = arg0 * var12;
                    var7.field915 = var7.field915 + var13 & 2047;
                    var7.field916 = var7.field916 + var14 & 2047;
                    var4 = true;
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method155(String arg0) throws IOException {
        if (!this.field378) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field106 != null) {
                try {
                    this.field106.close();
                } catch (Exception var4) {
                }
                this.field106 = null;
            }
            this.field106 = this.method29(43595);
            this.field106.setSoTimeout(10000);
            InputStream var2 = this.field106.getInputStream();
            OutputStream var3 = this.field106.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
    public static final void method156(int arg0) {
        class23.field829 = false;
        class54.field1463 = false;
        field386 = false;
        int var1 = 5 / arg0;
        class65.field1648 = false;
        class36.field1195 = false;
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
    public final void method157(byte arg0) {
        if (arg0 != -117) {
            this.field535 = !this.field535;
        }
        if (super.field39 == 1) {
            if (super.field40 >= 6 && super.field40 <= 106 && super.field41 >= 467 && super.field41 <= 499) {
                this.field185 = (this.field185 + 1) % 4;
                this.field238 = true;
                this.field350 = true;
                this.field466.method375(34, this.field496);
                this.field466.method376(this.field185);
                this.field466.method376(this.field538);
                this.field466.method376(this.field129);
            }
            if (super.field40 >= 135 && super.field40 <= 235 && super.field41 >= 467 && super.field41 <= 499) {
                this.field538 = (this.field538 + 1) % 3;
                this.field238 = true;
                this.field350 = true;
                this.field466.method375(34, this.field496);
                this.field466.method376(this.field185);
                this.field466.method376(this.field538);
                this.field466.method376(this.field129);
            }
            if (super.field40 >= 273 && super.field40 <= 373 && super.field41 >= 467 && super.field41 <= 499) {
                this.field129 = (this.field129 + 1) % 3;
                this.field238 = true;
                this.field350 = true;
                this.field466.method375(34, this.field496);
                this.field466.method376(this.field185);
                this.field466.method376(this.field538);
                this.field466.method376(this.field129);
            }
            if (super.field40 >= 412 && super.field40 <= 512 && super.field41 >= 467 && super.field41 <= 499) {
                if (this.field572 == -1) {
                    this.method52(927);
                    this.field573 = "";
                    this.field388 = false;
                    this.field333 = this.field572 = class25.field954;
                    return;
                }
                this.method121("Please close the interface you have open before using 'report abuse'", 0, "", -212);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LIJOSTBQT;I)V")
    public final void method158(class25 arg0, int arg1) {
        int var3 = arg0.field951;
        this.field344 += arg1;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field197;
                if (this.field198 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg0.field949 = "";
                    arg0.field970 = 0;
                } else {
                    if (this.field407[var3] == 0) {
                        arg0.field949 = "@red@Offline";
                    } else if (this.field407[var3] < 200) {
                        if (this.field407[var3] == field383) {
                            arg0.field949 = "@gre@World" + (this.field407[var3] - 9);
                        } else {
                            arg0.field949 = "@yel@World" + (this.field407[var3] - 9);
                        }
                    } else if (this.field407[var3] == field383) {
                        arg0.field949 = "@gre@Classic" + (this.field407[var3] - 219);
                    } else {
                        arg0.field949 = "@yel@Classic" + (this.field407[var3] - 219);
                    }
                    arg0.field970 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field197;
                if (this.field198 != 2) {
                    var6 = 0;
                }
                arg0.field937 = var6 * 15 + 20;
                if (arg0.field937 <= arg0.field960) {
                    arg0.field937 = arg0.field960 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field198 == 0) {
                    arg0.field949 = "Loading ignore list";
                    arg0.field970 = 0;
                } else if (var3 == 1 && this.field198 == 0) {
                    arg0.field949 = "Please wait...";
                    arg0.field970 = 0;
                } else {
                    int var7 = this.field339;
                    if (this.field198 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg0.field949 = "";
                        arg0.field970 = 0;
                    } else {
                        arg0.field949 = class53.method495(true, class53.method492(42220, this.field519[var3]));
                        arg0.field970 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg0.field937 = this.field339 * 15 + 20;
                if (arg0.field937 <= arg0.field960) {
                    arg0.field937 = arg0.field960 + 1;
                }
            } else if (var3 == 327) {
                arg0.field915 = 150;
                arg0.field916 = (int) (Math.sin((double) field542 / 40.0D) * 256.0D) & 2047;
                if (this.field426) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field163[var8];
                        if (var15 >= 0 && !class46.field1326[var15].method446(0)) {
                            return;
                        }
                    }
                    this.field426 = false;
                    class26[] var9 = new class26[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field163[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class46.field1326[var14].method447(0);
                        }
                    }
                    class26 var12 = new class26(var10, 473, var9);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field192[var13] != 0) {
                            var12.method295(field356[var13][0], field356[var13][this.field192[var13]]);
                            if (var13 == 1) {
                                var12.method295(field211[0], field211[this.field192[var13]]);
                            }
                        }
                    }
                    var12.method288(49427);
                    var12.method289(class47.field1336[field254.field716].field1338[0], true);
                    var12.method298(64, 850, -30, -50, -30, true);
                    arg0.field907 = 5;
                    arg0.field908 = 0;
                    class25.method270(true, 5, 0, var12);
                }
            } else if (var3 == 324) {
                if (this.field214 == null) {
                    this.field214 = arg0.field928;
                    this.field215 = arg0.field913;
                }
                if (this.field131) {
                    arg0.field928 = this.field215;
                } else {
                    arg0.field928 = this.field214;
                }
            } else if (var3 == 325) {
                if (this.field214 == null) {
                    this.field214 = arg0.field928;
                    this.field215 = arg0.field913;
                }
                if (this.field131) {
                    arg0.field928 = this.field214;
                } else {
                    arg0.field928 = this.field215;
                }
            } else if (var3 == 600) {
                arg0.field949 = this.field573;
                if (field542 % 20 < 10) {
                    arg0.field949 = arg0.field949 + "|";
                } else {
                    arg0.field949 = arg0.field949 + " ";
                }
            } else {
                if (var3 == 620) {
                    if (this.field137 >= 1) {
                        if (this.field388) {
                            arg0.field963 = 16711680;
                            arg0.field949 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg0.field963 = 16777215;
                            arg0.field949 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg0.field949 = "";
                    }
                }
                if (var3 == 660) {
                    int var16 = this.field474 - this.field550;
                    String var17;
                    if (var16 <= 0) {
                        var17 = "earlier today";
                    } else if (var16 == 1) {
                        var17 = "yesterday";
                    } else {
                        var17 = var16 + " days ago";
                    }
                    arg0.field949 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
                }
                if (var3 == 661) {
                    if (this.field77 == 0) {
                        arg0.field949 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                    } else if (this.field77 <= this.field474) {
                        arg0.field949 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method159(this.field77, -7282);
                    } else {
                        int var18 = this.field474 + 14 - this.field77;
                        String var19;
                        if (var18 <= 0) {
                            var19 = "Earlier today";
                        } else if (var18 == 1) {
                            var19 = "Yesterday";
                        } else {
                            var19 = var18 + " days ago";
                        }
                        arg0.field949 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method159(this.field77, -7282) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                    }
                }
                if (var3 == 662) {
                    String var20;
                    if (this.field92 == 0) {
                        var20 = "@yel@0 unread messages";
                    } else if (this.field92 == 1) {
                        var20 = "@gre@1 unread message";
                    } else {
                        var20 = "@gre@" + this.field92 + " unread messages";
                    }
                    arg0.field949 = "You have " + var20 + "\\nin your message centre.";
                }
                if (var3 == 663) {
                    if (this.field503 > 0 && this.field503 <= this.field474 + 10) {
                        arg0.field949 = "Last password change:\\n@gre@" + this.method159(this.field503, -7282);
                    } else {
                        arg0.field949 = "Last password change:\\n@gre@Never changed";
                    }
                }
                if (var3 == 665) {
                    if (this.field263 > 2 && !field385) {
                        arg0.field949 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                    } else if (this.field263 > 2) {
                        arg0.field949 = "\\n\\nYou have @gre@" + this.field263 + "@yel@ days of\\nmember credit remaining.";
                    } else if (this.field263 > 0) {
                        arg0.field949 = "You have @gre@" + this.field263 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                    } else {
                        arg0.field949 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                    }
                }
                if (var3 == 667) {
                    if (this.field263 > 2 && !field385) {
                        arg0.field949 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                    } else if (this.field263 > 0) {
                        arg0.field949 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                    } else {
                        arg0.field949 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                    }
                }
                if (var3 == 668) {
                    if (this.field77 > this.field474) {
                        arg0.field949 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                    } else {
                        arg0.field949 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                    }
                }
            }
        } else if (var3 == 1 && this.field198 == 0) {
            arg0.field949 = "Loading friend list";
            arg0.field970 = 0;
        } else if (var3 == 1 && this.field198 == 1) {
            arg0.field949 = "Connecting to friendserver";
            arg0.field970 = 0;
        } else if (var3 == 2 && this.field198 != 2) {
            arg0.field949 = "Please wait...";
            arg0.field970 = 0;
        } else {
            int var4 = this.field197;
            if (this.field198 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg0.field949 = "";
                arg0.field970 = 0;
            } else {
                arg0.field949 = this.field84[var3];
                arg0.field970 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(II)Ljava/lang/String;")
    public final String method159(int arg0, int arg1) {
        if (arg0 > this.field474 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg0 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            var5.setTime(new Date(var3));
            if (arg1 != -7282) {
                this.method6();
            }
            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            return var6 + "-" + var9[var7] + "-" + var8;
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(Z)V")
    public final void method160(boolean arg0) {
        this.field405 &= arg0;
        while (true) {
            class59 var2 = this.field132.method534();
            if (var2 == null) {
                return;
            }
            if (var2.field1564 == 0) {
                class26.method279(true, var2.field1562, var2.field1563);
                if ((this.field132.method525(false, var2.field1562) & 98) != 0) {
                    this.field268 = true;
                    if (this.field352 != -1 || this.field500 != -1) {
                        this.field350 = true;
                    }
                }
            }
            if (var2.field1564 == 1 && var2.field1563 != null) {
                class17.method208(var2.field1563, (byte) 1);
            }
            if (var2.field1564 == 2 && this.field526 == var2.field1562 && var2.field1563 != null) {
                this.method68(var2.field1563, this.field565, this.field527);
            }
            if (var2.field1564 == 3 && this.field325 == 1) {
                for (int var3 = 0; var3 < this.field446.length; ++var3) {
                    if (this.field477[var3] == var2.field1562) {
                        this.field446[var3] = var2.field1563;
                        if (var2.field1563 == null) {
                            this.field477[var3] = -1;
                        }
                        break;
                    }
                    if (this.field478[var3] == var2.field1562) {
                        this.field205[var3] = var2.field1563;
                        if (var2.field1563 == null) {
                            this.field478[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field1564 == 93 && this.field132.method521(-13551, var2.field1562)) {
                class65.method579(new class37(var2.field1563, -670), 0, this.field132);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
    public final void method161(int arg0) {
        if (this.field348 > 0) {
            this.method118(true);
        } else {
            this.method119("Please wait - attempting to reestablish", this.field398, "Connection lost");
            this.field543 = 0;
            this.field438 = 0;
            class64 var2 = this.field277;
            this.field405 = false;
            this.field83 = 0;
            this.method84(this.field265, this.field266, true);
            int var3 = 38 / arg0;
            if (!this.field405) {
                this.method118(true);
            }
            try {
                var2.method556();
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
    public final void method162(byte arg0) {
        if (this.field231 > 1) {
            --this.field231;
        }
        if (this.field348 > 0) {
            --this.field348;
        }
        for (int var2 = 0; var2 < 5 && this.method138(true); ++var2) {
        }
        if (this.field405) {
            Object var3 = this.field447.field1263;
            synchronized (this.field447.field1263) {
                if (!field420) {
                    this.field447.field1266 = 0;
                } else if (super.field39 != 0 || this.field447.field1266 >= 40) {
                    this.field466.method375(13, this.field496);
                    this.field466.method376(0);
                    int var4 = this.field466.field1212;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field447.field1266 && var4 - this.field466.field1212 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field447.field1267[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field447.field1264[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field447.field1267[var6] == -1 && this.field447.field1264[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field371 == var8 && this.field372 == var7) {
                            if (this.field351 < 2047) {
                                ++this.field351;
                            }
                        } else {
                            int var10 = var8 - this.field371;
                            this.field371 = var8;
                            int var11 = var7 - this.field372;
                            this.field372 = var7;
                            if (this.field351 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field466.method377((this.field351 << 12) + (var10 << 6) + var11);
                                this.field351 = 0;
                            } else if (this.field351 < 8) {
                                this.field466.method379((this.field351 << 19) + 8388608 + var9);
                                this.field351 = 0;
                            } else {
                                this.field466.method380((this.field351 << 19) + -1073741824 + var9);
                                this.field351 = 0;
                            }
                        }
                    }
                    this.field466.method385(true, this.field466.field1212 - var4);
                    if (var5 >= this.field447.field1266) {
                        this.field447.field1266 = 0;
                    } else {
                        this.field447.field1266 -= var5;
                        for (int var12 = 0; var12 < this.field447.field1266; ++var12) {
                            this.field447.field1264[var12] = this.field447.field1264[var5 + var12];
                            this.field447.field1267[var12] = this.field447.field1267[var5 + var12];
                        }
                    }
                }
            }
            if (super.field39 != 0) {
                long var13 = (super.field42 - this.field342) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field342 = super.field42;
                int var15 = super.field41;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field40;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field39 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field466.method375(209, this.field496);
                this.field466.method420((var18 << 19) + (var19 << 20) + var17, (byte) 7);
            }
            if (this.field104 > 0) {
                --this.field104;
            }
            if (super.field43[1] == 1 || super.field43[2] == 1 || super.field43[3] == 1 || super.field43[4] == 1) {
                this.field105 = true;
            }
            if (this.field105 && this.field104 <= 0) {
                this.field104 = 20;
                this.field105 = false;
                this.field466.method375(107, this.field496);
                this.field466.method411(this.field514, false);
                this.field466.method411(this.field515, false);
            }
            if (super.field30 && !this.field373) {
                this.field373 = true;
                this.field466.method375(12, this.field496);
                this.field466.method376(1);
            }
            if (!super.field30 && this.field373) {
                this.field373 = false;
                this.field466.method375(12, this.field496);
                this.field466.method376(0);
            }
            this.method37(0);
            this.method31(this.field186);
            this.method33(false);
            ++this.field346;
            if (this.field346 > 750) {
                this.method161(253);
            }
            this.method70(321);
            this.method39(-1632);
            this.method62(true);
            ++this.field321;
            if (this.field228 != 0) {
                this.field227 += 20;
                if (this.field227 >= 400) {
                    this.field228 = 0;
                }
            }
            if (this.field511 != 0) {
                ++this.field508;
                if (this.field508 >= 15) {
                    if (this.field511 == 2) {
                        this.field268 = true;
                    }
                    if (this.field511 == 3) {
                        this.field350 = true;
                    }
                    this.field511 = 0;
                }
            }
            if (this.field456 != 0) {
                ++this.field188;
                if (super.field33 > this.field457 + 5 || super.field33 < this.field457 - 5 || super.field34 > this.field458 + 5 || super.field34 < this.field458 - 5) {
                    this.field286 = true;
                }
                if (super.field32 == 0) {
                    if (this.field456 == 2) {
                        this.field268 = true;
                    }
                    if (this.field456 == 3) {
                        this.field350 = true;
                    }
                    this.field456 = 0;
                    if (this.field286 && this.field188 >= 5) {
                        this.field363 = -1;
                        this.method128((byte) 4);
                        if (this.field454 == this.field363 && this.field455 != this.field362) {
                            class25 var20 = class25.method276(this.field454);
                            byte var21 = 0;
                            if (this.field298 == 1 && var20.field951 == 206) {
                                var21 = 1;
                            }
                            if (var20.field932[this.field362] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field902) {
                                int var22 = this.field455;
                                int var23 = this.field362;
                                var20.field932[var23] = var20.field932[var22];
                                var20.field919[var23] = var20.field919[var22];
                                var20.field932[var22] = -1;
                                var20.field919[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field455;
                                int var25 = this.field362;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method272((byte) -99, var24 - 1, var24);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method272((byte) -99, var24 + 1, var24);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method272((byte) -99, this.field362, this.field455);
                            }
                            this.field466.method375(216, this.field496);
                            this.field466.method412(-963, this.field455);
                            this.field466.method377(this.field362);
                            this.field466.method404(false, var21);
                            this.field466.method410(this.field454, false);
                        }
                    } else if ((this.field245 == 1 || this.method144(70, this.field537 - 1)) && this.field537 > 2) {
                        this.method69((byte) 7);
                    } else if (this.field537 > 0) {
                        this.method148(this.field537 - 1, false);
                    }
                    this.field508 = 10;
                    super.field39 = 0;
                }
            }
            if (class23.field863 != -1) {
                int var26 = class23.field863;
                int var27 = class23.field864;
                boolean var28 = this.method112(0, field254.field681[0], 0, field254.field682[0], var26, 0, 0, var27, 0, 988, 0, true);
                class23.field863 = -1;
                if (var28) {
                    this.field225 = super.field40;
                    this.field226 = super.field41;
                    this.field228 = 1;
                    this.field227 = 0;
                }
            }
            if (super.field39 == 1 && this.field219 != null) {
                this.field219 = null;
                this.field350 = true;
                super.field39 = 0;
            }
            this.method82(false);
            if (arg0 != 45) {
                for (int var29 = 1; var29 > 0; ++var29) {
                }
            }
            if (this.field472 == -1) {
                this.method136(-723);
                this.method143(0);
                this.method157((byte) -117);
            }
            if (super.field32 == 1 || super.field39 == 1) {
                ++this.field190;
            }
            if (this.field343 == 0 && this.field430 == 0 && this.field114 == 0) {
                if (this.field264 > 0) {
                    --this.field264;
                }
            } else if (this.field264 < 100) {
                ++this.field264;
                if (this.field264 == 100) {
                    if (this.field343 != 0) {
                        this.field350 = true;
                    }
                    if (this.field430 != 0) {
                        this.field268 = true;
                    }
                }
            }
            if (this.field325 == 2) {
                this.method116(-39);
            }
            if (this.field325 == 2 && this.field98) {
                this.method47((byte) 9);
            }
            for (int var30 = 0; var30 < 5; ++var30) {
                int var10002 = this.field182[var30]++;
            }
            this.method139((byte) 4);
            ++super.field31;
            if (super.field31 > 4500) {
                this.field348 = 250;
                super.field31 -= 500;
                this.field466.method375(224, this.field496);
            }
            ++this.field180;
            if (this.field180 > 500) {
                this.field180 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field112 += this.field113;
                }
                if ((var31 & 2) == 2) {
                    this.field470 += this.field471;
                }
                if ((var31 & 4) == 4) {
                    this.field512 += this.field513;
                }
            }
            if (this.field112 < -50) {
                this.field113 = 2;
            }
            if (this.field112 > 50) {
                this.field113 = -2;
            }
            if (this.field470 < -55) {
                this.field471 = 2;
            }
            if (this.field470 > 55) {
                this.field471 = -2;
            }
            if (this.field512 < -40) {
                this.field513 = 1;
            }
            if (this.field512 > 40) {
                this.field513 = -1;
            }
            ++this.field376;
            if (this.field376 > 500) {
                this.field376 = 0;
                int var32 = (int) (Math.random() * 8.0D);
                if ((var32 & 1) == 1) {
                    this.field199 += this.field200;
                }
                if ((var32 & 2) == 2) {
                    this.field449 += this.field450;
                }
            }
            if (this.field199 < -60) {
                this.field200 = 2;
            }
            if (this.field199 > 60) {
                this.field200 = -2;
            }
            if (this.field449 < -20) {
                this.field450 = 1;
            }
            if (this.field449 > 10) {
                this.field450 = -1;
            }
            ++this.field347;
            if (this.field347 > 50) {
                this.field466.method375(71, this.field496);
            }
            try {
                if (this.field277 != null && this.field466.field1212 > 0) {
                    this.field277.method560(0, true, this.field466.field1211, this.field466.field1212);
                    this.field466.field1212 = 0;
                    this.field347 = 0;
                }
            } catch (IOException var34) {
                this.method161(253);
            } catch (Exception var35) {
                this.method118(true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
    public final void method163(int arg0, byte arg1) {
        if (arg1 != 126) {
            this.field345 = -1;
        }
        if (!field386) {
            for (int var3 = 0; var3 < this.field463.length; ++var3) {
                int var4 = this.field463[var3];
                if (class54.field1482[var4] >= arg0) {
                    class4 var5 = class54.field1476[var4];
                    int var6 = var5.field61 * var5.field60 - 1;
                    int var7 = this.field321 * var5.field60 * 2;
                    byte[] var8 = var5.field58;
                    byte[] var9 = this.field521;
                    for (int var10 = 0; var10 <= var6; ++var10) {
                        var9[var10] = var8[var10 - var7 & var6];
                    }
                    var5.field58 = var9;
                    this.field521 = var8;
                    class54.method504(var4, 735);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
    public static final void method164(int arg0) {
        class23.field829 = true;
        class54.field1463 = true;
        field386 = true;
        class65.field1648 = true;
        if (arg0 == 0) {
            class36.field1195 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 368);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field383 = Integer.parseInt(arg0[0]);
                field384 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method164(0);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method156(field287);
                }
                if (arg0[3].equals("free")) {
                    field385 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field385 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(765, true, 503);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(Z)V")
    public final void method165(boolean arg0) {
        this.field179.method360(-921);
        if (arg0) {
            this.field466.method376(30);
        }
        class54.field1474 = this.field193;
        this.field204.method20(48946, 0, 0);
        if (this.field557) {
            this.field546.method585(0, 5, 40, 239, this.field536);
            this.field546.method585(128, 5, 60, 239, this.field567 + "*");
        } else if (this.field160 == 1) {
            this.field546.method585(0, 5, 40, 239, "Enter amount:");
            this.field546.method585(128, 5, 60, 239, this.field80 + "*");
        } else if (this.field160 == 2) {
            this.field546.method585(0, 5, 40, 239, "Enter name:");
            this.field546.method585(128, 5, 60, 239, this.field80 + "*");
        } else if (this.field160 == 3) {
            if (this.field80 != this.field552) {
                this.method110((byte) 7, this.field80);
                this.field552 = this.field80;
            }
            class67 var2 = this.field545;
            class52.method481(0, 0, 0, 463, 77);
            for (int var3 = 0; var3 < this.field553; ++var3) {
                int var4 = var3 * 14 + 18 - this.field556;
                if (var4 > 0 && var4 < 110) {
                    var2.method585(0, 5, var4, 239, this.field554[var3]);
                }
            }
            class52.method480((byte) 3);
            if (this.field553 > 5) {
                this.method80(this.field553 * 14 + 7, 463, 77, this.field570, this.field556, 0);
            }
            if (this.field80.length() == 0) {
                this.field546.method585(255, 5, 40, 239, "Enter object name");
            } else if (this.field553 == 0) {
                this.field546.method585(0, 5, 40, 239, "No matching objects found, please shorten search");
            }
            var2.method585(0, 5, 90, 239, this.field80 + "*");
            class52.method487(0, -115, 0, 479, 77);
        } else if (this.field219 != null) {
            this.field546.method585(0, 5, 40, 239, this.field219);
            this.field546.method585(128, 5, 60, 239, "Click to continue");
        } else if (this.field352 != -1) {
            this.method105(0, class25.method276(this.field352), 0, (byte) -21, 0);
        } else if (this.field500 != -1) {
            this.method105(0, class25.method276(this.field500), 0, (byte) -21, 0);
        } else {
            class67 var5 = this.field545;
            int var6 = 0;
            class52.method481(0, 0, 0, 463, 77);
            for (int var7 = 0; var7 < 100; ++var7) {
                if (this.field154[var7] != null) {
                    int var9 = this.field152[var7];
                    int var10 = 70 - var6 * 14 + this.field262;
                    String var11 = this.field153[var7];
                    byte var12 = 0;
                    if (var11 != null && var11.startsWith("@cr1@")) {
                        var11 = var11.substring(5);
                        var12 = 1;
                    }
                    if (var11 != null && var11.startsWith("@cr2@")) {
                        var11 = var11.substring(5);
                        var12 = 2;
                    }
                    if (var9 == 0) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method589(0, this.field154[var7], 4, var10, -312);
                        }
                        ++var6;
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || this.field185 == 0 || this.field185 == 1 && this.method30(426, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                this.field501[0].method20(48946, var10 - 12, var13);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                this.field501[1].method20(48946, var10 - 12, var13);
                                var13 += 14;
                            }
                            var5.method589(0, var11 + ":", var13, var10, -312);
                            int var14 = var13 + var5.method587(var11, -24375) + 8;
                            var5.method589(255, this.field154[var7], var14, var10, -312);
                        }
                        ++var6;
                    }
                    if ((var9 == 3 || var9 == 7) && this.field136 == 0 && (var9 == 7 || this.field538 == 0 || this.field538 == 1 && this.method30(426, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            byte var15 = 4;
                            var5.method589(0, "From", var15, var10, -312);
                            int var16 = var15 + var5.method587("From ", -24375);
                            if (var12 == 1) {
                                this.field501[0].method20(48946, var10 - 12, var16);
                                var16 += 14;
                            }
                            if (var12 == 2) {
                                this.field501[1].method20(48946, var10 - 12, var16);
                                var16 += 14;
                            }
                            var5.method589(0, var11 + ":", var16, var10, -312);
                            int var17 = var16 + var5.method587(var11, -24375) + 8;
                            var5.method589(8388608, this.field154[var7], var17, var10, -312);
                        }
                        ++var6;
                    }
                    if (var9 == 4 && (this.field129 == 0 || this.field129 == 1 && this.method30(426, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method589(8388736, var11 + " " + this.field154[var7], 4, var10, -312);
                        }
                        ++var6;
                    }
                    if (var9 == 5 && this.field136 == 0 && this.field538 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method589(8388608, this.field154[var7], 4, var10, -312);
                        }
                        ++var6;
                    }
                    if (var9 == 6 && this.field136 == 0 && this.field538 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method589(0, "To " + var11 + ":", 4, var10, -312);
                            var5.method589(8388608, this.field154[var7], 12 + var5.method587("To " + var11, -24375), var10, -312);
                        }
                        ++var6;
                    }
                    if (var9 == 8 && (this.field129 == 0 || this.field129 == 1 && this.method30(426, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method589(8270336, var11 + " " + this.field154[var7], 4, var10, -312);
                        }
                        ++var6;
                    }
                }
            }
            class52.method480((byte) 3);
            this.field223 = var6 * 14 + 7;
            if (this.field223 < 78) {
                this.field223 = 78;
            }
            this.method80(this.field223, 463, 77, this.field570, this.field223 - this.field262 - 77, 0);
            String var8;
            if (field254 != null && field254.field604 != null) {
                var8 = field254.field604;
            } else {
                var8 = class53.method495(true, this.field265);
            }
            var5.method589(0, var8 + ":", 4, 90, -312);
            var5.method589(255, this.field128 + "*", 6 + var5.method587(var8 + ": ", -24375), 90, -312);
            class52.method487(0, -115, 0, 479, 77);
        }
        if (this.field408 && this.field87 == 2) {
            this.method60(0);
        }
        this.field179.method361(super.field25, 17, 357, (byte) 1);
        this.field178.method360(-921);
        class54.field1474 = this.field195;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field448[var1] = var0 - 1;
            var0 += var0;
        }
        field531 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field531[var3] = var2 / 4;
        }
    }
}
