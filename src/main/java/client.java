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
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sign.signlink;

@OriginalClass("client")
public class client extends class7 {

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private int field89 = 78;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private int field91 = -210;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field92 = 224;

    @OriginalMember(owner = "client", name = "U", descriptor = "[I")
    private int[] field93 = new int[33];

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    private int field94 = -1;

    @OriginalMember(owner = "client", name = "X", descriptor = "Z")
    private boolean field96 = false;

    @OriginalMember(owner = "client", name = "ab", descriptor = "[I")
    private int[] field99 = new int[7];

    @OriginalMember(owner = "client", name = "cb", descriptor = "B")
    private byte field101 = 1;

    @OriginalMember(owner = "client", name = "db", descriptor = "I")
    private int field102 = -1;

    @OriginalMember(owner = "client", name = "eb", descriptor = "Z")
    private boolean field103 = false;

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field104 = 5;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private int field112 = -1;

    @OriginalMember(owner = "client", name = "ob", descriptor = "[I")
    private int[] field113 = new int[33];

    @OriginalMember(owner = "client", name = "tb", descriptor = "Z")
    private volatile boolean field118 = false;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field119 = -1;

    @OriginalMember(owner = "client", name = "vb", descriptor = "I")
    private int field120 = 101;

    @OriginalMember(owner = "client", name = "yb", descriptor = "[LEYTQJNEM;")
    private class12[] field123 = new class12[1000];

    @OriginalMember(owner = "client", name = "zb", descriptor = "Ljava/lang/String;")
    private String field124 = "";

    @OriginalMember(owner = "client", name = "Ab", descriptor = "Ljava/lang/String;")
    private String field125 = "";

    @OriginalMember(owner = "client", name = "Eb", descriptor = "Z")
    private boolean field129 = false;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "Ljava/lang/String;")
    private String field130 = "";

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field133 = 1;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "Z")
    private boolean field134 = false;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "[Ljava/lang/String;")
    private String[] field135 = new String[200];

    @OriginalMember(owner = "client", name = "Mb", descriptor = "Z")
    public boolean field137 = false;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "[J")
    private long[] field140 = new long[100];

    @OriginalMember(owner = "client", name = "Qb", descriptor = "Z")
    private boolean field141 = true;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "Z")
    private boolean field143 = false;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "Z")
    private boolean field144 = false;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field145 = 1;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "Z")
    private boolean field146 = true;

    @OriginalMember(owner = "client", name = "bc", descriptor = "LSWVPDERM;")
    private class56 field152 = new class56(306);

    @OriginalMember(owner = "client", name = "cc", descriptor = "[I")
    private int[] field153 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "ic", descriptor = "LMUKVLYLC;")
    private class33 field159 = new class33(field371, new byte[5000]);

    @OriginalMember(owner = "client", name = "jc", descriptor = "[LPNBDNSXO;")
    private class43[] field160 = new class43[16384];

    @OriginalMember(owner = "client", name = "lc", descriptor = "[I")
    public int[] field162 = new int[16384];

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field174 = -1;

    @OriginalMember(owner = "client", name = "yc", descriptor = "[I")
    private int[] field175 = new int[200];

    @OriginalMember(owner = "client", name = "Gc", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field183 = new CRC32();

    @OriginalMember(owner = "client", name = "Hc", descriptor = "I")
    private int field184 = 393;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "[LTOROBAKX;")
    private class59[] field185 = new class59[100];

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private int field190 = 5;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field191 = -10223;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "Z")
    private boolean field192 = true;

    @OriginalMember(owner = "client", name = "bd", descriptor = "Z")
    private boolean field204 = false;

    @OriginalMember(owner = "client", name = "fd", descriptor = "[I")
    private int[] field208 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "gd", descriptor = "Z")
    private boolean field209 = false;

    @OriginalMember(owner = "client", name = "id", descriptor = "B")
    private byte field211 = 4;

    @OriginalMember(owner = "client", name = "md", descriptor = "Ljava/lang/String;")
    private String field215 = "";

    @OriginalMember(owner = "client", name = "nd", descriptor = "B")
    private byte field216 = 4;

    @OriginalMember(owner = "client", name = "td", descriptor = "[LTOROBAKX;")
    private class59[] field222 = new class59[13];

    @OriginalMember(owner = "client", name = "ud", descriptor = "Z")
    private boolean field223 = false;

    @OriginalMember(owner = "client", name = "wd", descriptor = "Z")
    private boolean field225 = false;

    @OriginalMember(owner = "client", name = "yd", descriptor = "LSWVPDERM;")
    private class56 field227 = new class56(306);

    @OriginalMember(owner = "client", name = "Ad", descriptor = "I")
    private int field229 = -514;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field235 = -1;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "[Ljava/lang/String;")
    private String[] field246 = new String[500];

    @OriginalMember(owner = "client", name = "Zd", descriptor = "Z")
    private boolean field254 = false;

    @OriginalMember(owner = "client", name = "ae", descriptor = "[Z")
    private boolean[] field255 = new boolean[5];

    @OriginalMember(owner = "client", name = "be", descriptor = "Z")
    private boolean field256 = false;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private int field260 = 9561;

    @OriginalMember(owner = "client", name = "he", descriptor = "Z")
    private boolean field262 = true;

    @OriginalMember(owner = "client", name = "ie", descriptor = "[I")
    private int[] field263 = new int[class68.field1662];

    @OriginalMember(owner = "client", name = "je", descriptor = "[I")
    private int[] field264 = new int[151];

    @OriginalMember(owner = "client", name = "le", descriptor = "Z")
    private boolean field266 = true;

    @OriginalMember(owner = "client", name = "ne", descriptor = "[I")
    public int[] field268 = new int[2000];

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field269 = 7759444;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field271 = 9;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field275 = 50;

    @OriginalMember(owner = "client", name = "ve", descriptor = "[I")
    private int[] field276 = new int[this.field275];

    @OriginalMember(owner = "client", name = "we", descriptor = "[I")
    private int[] field277 = new int[this.field275];

    @OriginalMember(owner = "client", name = "xe", descriptor = "[I")
    private int[] field278 = new int[this.field275];

    @OriginalMember(owner = "client", name = "ye", descriptor = "[I")
    private int[] field279 = new int[this.field275];

    @OriginalMember(owner = "client", name = "ze", descriptor = "[I")
    private int[] field280 = new int[this.field275];

    @OriginalMember(owner = "client", name = "Ae", descriptor = "[I")
    private int[] field281 = new int[this.field275];

    @OriginalMember(owner = "client", name = "Be", descriptor = "[I")
    private int[] field282 = new int[this.field275];

    @OriginalMember(owner = "client", name = "Ce", descriptor = "[Ljava/lang/String;")
    private String[] field283 = new String[this.field275];

    @OriginalMember(owner = "client", name = "De", descriptor = "[I")
    private int[] field284 = new int[4000];

    @OriginalMember(owner = "client", name = "Ee", descriptor = "[I")
    private int[] field285 = new int[4000];

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field286 = -1;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "Z")
    private boolean field289 = false;

    @OriginalMember(owner = "client", name = "Je", descriptor = "Ljava/lang/String;")
    private String field290 = "";

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field301 = -1;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field302 = 679;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field304 = 362;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "LMUKVLYLC;")
    private class33 field306 = class33.method280(true, 1);

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field314 = -606;

    @OriginalMember(owner = "client", name = "jf", descriptor = "Z")
    private boolean field315 = false;

    @OriginalMember(owner = "client", name = "kf", descriptor = "[I")
    private int[] field316 = new int[5];

    @OriginalMember(owner = "client", name = "tf", descriptor = "[LTOROBAKX;")
    private class59[] field325 = new class59[2];

    @OriginalMember(owner = "client", name = "uf", descriptor = "Ljava/lang/String;")
    private String field326 = "";

    @OriginalMember(owner = "client", name = "wf", descriptor = "Z")
    public boolean field328 = true;

    @OriginalMember(owner = "client", name = "xf", descriptor = "[LDQPGJUSB;")
    public class8[] field329 = new class8[5];

    @OriginalMember(owner = "client", name = "yf", descriptor = "[I")
    private int[] field330 = new int[50];

    @OriginalMember(owner = "client", name = "zf", descriptor = "[I")
    private int[] field331 = new int[50];

    @OriginalMember(owner = "client", name = "Af", descriptor = "[I")
    private int[] field332 = new int[256];

    @OriginalMember(owner = "client", name = "Bf", descriptor = "[I")
    private int[] field333 = new int[100];

    @OriginalMember(owner = "client", name = "Cf", descriptor = "[Ljava/lang/String;")
    private String[] field334 = new String[100];

    @OriginalMember(owner = "client", name = "Df", descriptor = "[Ljava/lang/String;")
    private String[] field335 = new String[100];

    @OriginalMember(owner = "client", name = "Ef", descriptor = "LSWVPDERM;")
    private class56 field336 = new class56(306);

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private int field337 = -19634;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "[I")
    private int[] field338 = new int[5];

    @OriginalMember(owner = "client", name = "Hf", descriptor = "I")
    private int field339 = -868;

    @OriginalMember(owner = "client", name = "If", descriptor = "Z")
    private boolean field340 = false;

    @OriginalMember(owner = "client", name = "Of", descriptor = "[[I")
    private int[][] field346 = new int[104][104];

    @OriginalMember(owner = "client", name = "Xf", descriptor = "Z")
    private boolean field355 = false;

    @OriginalMember(owner = "client", name = "ag", descriptor = "Z")
    private boolean field358 = true;

    @OriginalMember(owner = "client", name = "gg", descriptor = "[I")
    private int[] field364 = new int[50];

    @OriginalMember(owner = "client", name = "hg", descriptor = "Z")
    private boolean field365 = false;

    @OriginalMember(owner = "client", name = "ig", descriptor = "[[I")
    private int[][] field366 = new int[104][104];

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field369 = 2;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field373 = 128;

    @OriginalMember(owner = "client", name = "vg", descriptor = "[I")
    private final int[] field379 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field394 = 2;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "Z")
    private boolean field395 = false;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private int field400 = 3353893;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field401 = -1;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field403 = 1;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "Z")
    private boolean field404 = false;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "[[I")
    private int[][] field405 = new int[104][104];

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private int field408 = 734;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "[B")
    private byte[] field409 = new byte[16384];

    @OriginalMember(owner = "client", name = "ah", descriptor = "[LEYTQJNEM;")
    private class12[] field410 = new class12[100];

    @OriginalMember(owner = "client", name = "ch", descriptor = "LMUKVLYLC;")
    private class33 field412 = class33.method280(true, 1);

    @OriginalMember(owner = "client", name = "dh", descriptor = "I")
    private int field413 = 2048;

    @OriginalMember(owner = "client", name = "eh", descriptor = "I")
    private int field414 = 2047;

    @OriginalMember(owner = "client", name = "fh", descriptor = "[LHPYXKOFA;")
    private class21[] field415 = new class21[this.field413];

    @OriginalMember(owner = "client", name = "hh", descriptor = "[I")
    public int[] field417 = new int[this.field413];

    @OriginalMember(owner = "client", name = "jh", descriptor = "[I")
    private int[] field419 = new int[this.field413];

    @OriginalMember(owner = "client", name = "kh", descriptor = "[LMUKVLYLC;")
    private class33[] field420 = new class33[this.field413];

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field421 = -1;

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private final int field422 = 100;

    @OriginalMember(owner = "client", name = "nh", descriptor = "[I")
    private int[] field423 = new int[100];

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field424 = 9;

    @OriginalMember(owner = "client", name = "ph", descriptor = "[Ljava/lang/String;")
    private String[] field425 = new String[5];

    @OriginalMember(owner = "client", name = "qh", descriptor = "[Z")
    private boolean[] field426 = new boolean[5];

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field427 = -1;

    @OriginalMember(owner = "client", name = "sh", descriptor = "[I")
    private int[] field428 = new int[2000];

    @OriginalMember(owner = "client", name = "yh", descriptor = "[I")
    private int[] field434 = new int[5];

    @OriginalMember(owner = "client", name = "Mh", descriptor = "[I")
    private int[] field448 = new int[1000];

    @OriginalMember(owner = "client", name = "Nh", descriptor = "[I")
    private int[] field449 = new int[1000];

    @OriginalMember(owner = "client", name = "Qh", descriptor = "LMUKVLYLC;")
    private class33 field452 = class33.method280(true, 1);

    @OriginalMember(owner = "client", name = "Sh", descriptor = "Z")
    private boolean field454 = false;

    @OriginalMember(owner = "client", name = "Th", descriptor = "Ljava/lang/String;")
    private String field455 = "";

    @OriginalMember(owner = "client", name = "Uh", descriptor = "Ljava/lang/String;")
    private String field456 = "";

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Z")
    private boolean field457 = false;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "[[[I")
    private int[][][] field459 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "Yh", descriptor = "[LEYTQJNEM;")
    private class12[] field460 = new class12[20];

    @OriginalMember(owner = "client", name = "ai", descriptor = "LUKJEXUVU;")
    private class61 field462 = new class61();

    @OriginalMember(owner = "client", name = "ei", descriptor = "Z")
    private boolean field466 = true;

    @OriginalMember(owner = "client", name = "fi", descriptor = "Z")
    private boolean field467 = true;

    @OriginalMember(owner = "client", name = "mi", descriptor = "[LMNHXSMWL;")
    private class31[] field474 = new class31[4];

    @OriginalMember(owner = "client", name = "oi", descriptor = "[I")
    public int[] field476 = new int[1000];

    @OriginalMember(owner = "client", name = "xi", descriptor = "Z")
    private boolean field485 = false;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field493 = 2;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field495 = 5063219;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field496 = 2301979;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "[I")
    private int[] field497 = new int[500];

    @OriginalMember(owner = "client", name = "Ki", descriptor = "[I")
    private int[] field498 = new int[500];

    @OriginalMember(owner = "client", name = "Li", descriptor = "[I")
    private int[] field499 = new int[500];

    @OriginalMember(owner = "client", name = "Mi", descriptor = "[I")
    private int[] field500 = new int[500];

    @OriginalMember(owner = "client", name = "Ni", descriptor = "[I")
    private int[] field501 = new int[9];

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field503 = -38452;

    @OriginalMember(owner = "client", name = "Si", descriptor = "Z")
    private volatile boolean field506 = false;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field508 = 993;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "Ljava/lang/String;")
    private String field509 = "";

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field511 = -1;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "Z")
    private boolean field513 = false;

    @OriginalMember(owner = "client", name = "bj", descriptor = "[LEYTQJNEM;")
    private class12[] field515 = new class12[8];

    @OriginalMember(owner = "client", name = "cj", descriptor = "[LEYTQJNEM;")
    private class12[] field516 = new class12[20];

    @OriginalMember(owner = "client", name = "dj", descriptor = "[I")
    private int[] field517 = new int[151];

    @OriginalMember(owner = "client", name = "ej", descriptor = "Z")
    private boolean field518 = false;

    @OriginalMember(owner = "client", name = "gj", descriptor = "Z")
    private boolean field520 = false;

    @OriginalMember(owner = "client", name = "hj", descriptor = "[[[LSWVPDERM;")
    private class56[][][] field521 = new class56[4][104][104];

    @OriginalMember(owner = "client", name = "jj", descriptor = "Z")
    private boolean field523 = false;

    @OriginalMember(owner = "client", name = "lj", descriptor = "I")
    private int field525 = 2;

    @OriginalMember(owner = "client", name = "mj", descriptor = "[I")
    private int[] field526 = new int[5];

    @OriginalMember(owner = "client", name = "nj", descriptor = "I")
    private int field527 = -1;

    @OriginalMember(owner = "client", name = "oj", descriptor = "I")
    private int field528 = -1;

    @OriginalMember(owner = "client", name = "pj", descriptor = "[I")
    private int[] field529 = new int[class68.field1662];

    @OriginalMember(owner = "client", name = "vj", descriptor = "I")
    private int field535 = 3;

    @OriginalMember(owner = "client", name = "wj", descriptor = "B")
    private byte field536 = -45;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "[I")
    private int[] field544 = new int[5];

    @OriginalMember(owner = "client", name = "Fj", descriptor = "Z")
    private volatile boolean field545 = false;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "[I")
    private int[] field546 = new int[class68.field1662];

    @OriginalMember(owner = "client", name = "Hj", descriptor = "[J")
    private long[] field547 = new long[200];

    @OriginalMember(owner = "client", name = "Jj", descriptor = "I")
    private int field549 = -4488;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "Z")
    private boolean field551 = false;

    @OriginalMember(owner = "client", name = "Z", descriptor = "Ljava/lang/String;")
    private static String field98 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "Lb", descriptor = "[I")
    public static int[] field136 = new int[32];

    @OriginalMember(owner = "client", name = "Ob", descriptor = "[I")
    private static int[] field139;

    @OriginalMember(owner = "client", name = "ld", descriptor = "[I")
    public static final int[] field214;

    @OriginalMember(owner = "client", name = "Me", descriptor = "[[I")
    public static final int[][] field293;

    @OriginalMember(owner = "client", name = "ng", descriptor = "I")
    private static int field371;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private static int field378;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private static int field389;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "Z")
    private static boolean field391;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field406;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field458;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "B")
    private static byte field147;

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    private int field105;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field106;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field107;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private int field108;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private int field109;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field110;

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private int field111;

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field114;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field115;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field116;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field117;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private int field122;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field126;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field128;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field131;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field132;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private int field138;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private static int field142;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field149;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field151;

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private int field161;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field169;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field170;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field176;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field177;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private int field178;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private static int field226;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field228;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private static int field238;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    public int field240;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field241;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private int field242;

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field244;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private static int field257;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field258;

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private static int field265;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private int field273;

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private static int field288;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field291;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client", name = "af", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field308;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field309;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field311;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field313;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client", name = "pf", descriptor = "I")
    private int field321;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private static int field327;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "client", name = "kg", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private static int field372;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field375;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field393;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field416;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field418;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private int field450;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private static int field451;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private static int field463;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field465;

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    private static int field473;

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private int field475;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field477;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field479;

    @OriginalMember(owner = "client", name = "si", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private static int field486;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private static int field502;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "I")
    private static int field507;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client", name = "fj", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client", name = "qj", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client", name = "rj", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "client", name = "sj", descriptor = "I")
    private int field532;

    @OriginalMember(owner = "client", name = "tj", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client", name = "uj", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "I")
    private int field541;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "I")
    private int field550;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client", name = "J", descriptor = "I")
    private static int field82;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field83;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private static int field84;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field85;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private int field86;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field87;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private static int field88;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private int field95;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field97;

    @OriginalMember(owner = "client", name = "bb", descriptor = "J")
    private long field100;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "J")
    private long field193;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "J")
    public long field399;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "J")
    private long field407;

    @OriginalMember(owner = "client", name = "ci", descriptor = "J")
    private long field464;

    @OriginalMember(owner = "client", name = "wb", descriptor = "LEYTQJNEM;")
    private class12 field121;

    @OriginalMember(owner = "client", name = "jd", descriptor = "LEYTQJNEM;")
    private class12 field212;

    @OriginalMember(owner = "client", name = "kd", descriptor = "LEYTQJNEM;")
    private class12 field213;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "LEYTQJNEM;")
    private class12 field250;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "LEYTQJNEM;")
    private class12 field251;

    @OriginalMember(owner = "client", name = "sf", descriptor = "LEYTQJNEM;")
    private class12 field324;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "LEYTQJNEM;")
    private class12 field396;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "LEYTQJNEM;")
    private class12 field397;

    @OriginalMember(owner = "client", name = "Og", descriptor = "LEYTQJNEM;")
    private class12 field398;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "LEYTQJNEM;")
    private class12 field488;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "LEYTQJNEM;")
    private class12 field489;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "LEYTQJNEM;")
    private class12 field490;

    @OriginalMember(owner = "client", name = "Di", descriptor = "LEYTQJNEM;")
    private class12 field491;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "LEYTQJNEM;")
    private class12 field492;

    @OriginalMember(owner = "client", name = "pd", descriptor = "LFIGUVTWB;")
    private class15 field218;

    @OriginalMember(owner = "client", name = "Td", descriptor = "LFLUCRVAS;")
    private class16 field248;

    @OriginalMember(owner = "client", name = "od", descriptor = "LFRNMNGGN;")
    private class17 field217;

    @OriginalMember(owner = "client", name = "R", descriptor = "LHPYXKOFA;")
    public static class21 field90;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "LARAKDHLD;")
    private class2 field186;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "LARAKDHLD;")
    private class2 field187;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "LARAKDHLD;")
    private class2 field188;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "LARAKDHLD;")
    private class2 field189;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "LARAKDHLD;")
    private class2 field195;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "LARAKDHLD;")
    private class2 field196;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "LARAKDHLD;")
    private class2 field197;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "LARAKDHLD;")
    private class2 field198;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "LARAKDHLD;")
    private class2 field199;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "LARAKDHLD;")
    private class2 field200;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "LARAKDHLD;")
    private class2 field201;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "LARAKDHLD;")
    private class2 field202;

    @OriginalMember(owner = "client", name = "ad", descriptor = "LARAKDHLD;")
    private class2 field203;

    @OriginalMember(owner = "client", name = "wg", descriptor = "LARAKDHLD;")
    private class2 field380;

    @OriginalMember(owner = "client", name = "xg", descriptor = "LARAKDHLD;")
    private class2 field381;

    @OriginalMember(owner = "client", name = "yg", descriptor = "LARAKDHLD;")
    private class2 field382;

    @OriginalMember(owner = "client", name = "zg", descriptor = "LARAKDHLD;")
    private class2 field383;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "LARAKDHLD;")
    private class2 field384;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "LARAKDHLD;")
    private class2 field385;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "LARAKDHLD;")
    private class2 field386;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "LARAKDHLD;")
    private class2 field387;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "LARAKDHLD;")
    private class2 field388;

    @OriginalMember(owner = "client", name = "uh", descriptor = "LARAKDHLD;")
    private class2 field430;

    @OriginalMember(owner = "client", name = "vh", descriptor = "LARAKDHLD;")
    private class2 field431;

    @OriginalMember(owner = "client", name = "wh", descriptor = "LARAKDHLD;")
    private class2 field432;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "LLUUCVUQY;")
    private class30 field249;

    @OriginalMember(owner = "client", name = "vc", descriptor = "LTOROBAKX;")
    private class59 field172;

    @OriginalMember(owner = "client", name = "wc", descriptor = "LTOROBAKX;")
    private class59 field173;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "LTOROBAKX;")
    private class59 field252;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "LTOROBAKX;")
    private class59 field253;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "LTOROBAKX;")
    private class59 field352;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "LTOROBAKX;")
    private class59 field353;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "LTOROBAKX;")
    private class59 field354;

    @OriginalMember(owner = "client", name = "dg", descriptor = "LTOROBAKX;")
    private class59 field361;

    @OriginalMember(owner = "client", name = "eg", descriptor = "LTOROBAKX;")
    private class59 field362;

    @OriginalMember(owner = "client", name = "fg", descriptor = "LTOROBAKX;")
    private class59 field363;

    @OriginalMember(owner = "client", name = "zh", descriptor = "LTOROBAKX;")
    private class59 field435;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "LTOROBAKX;")
    private class59 field436;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "LTOROBAKX;")
    private class59 field437;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "LTOROBAKX;")
    private class59 field438;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "LTOROBAKX;")
    private class59 field439;

    @OriginalMember(owner = "client", name = "gi", descriptor = "LTOROBAKX;")
    private class59 field468;

    @OriginalMember(owner = "client", name = "hi", descriptor = "LTOROBAKX;")
    private class59 field469;

    @OriginalMember(owner = "client", name = "ii", descriptor = "LTOROBAKX;")
    private class59 field470;

    @OriginalMember(owner = "client", name = "ji", descriptor = "LTOROBAKX;")
    private class59 field471;

    @OriginalMember(owner = "client", name = "ki", descriptor = "LTOROBAKX;")
    private class59 field472;

    @OriginalMember(owner = "client", name = "jg", descriptor = "LUWQNYVPL;")
    private class62 field367;

    @OriginalMember(owner = "client", name = "xj", descriptor = "LYZXOZYLM;")
    private class70 field537;

    @OriginalMember(owner = "client", name = "yj", descriptor = "LYZXOZYLM;")
    private class70 field538;

    @OriginalMember(owner = "client", name = "zj", descriptor = "LYZXOZYLM;")
    private class70 field539;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "LYZXOZYLM;")
    private class70 field540;

    @OriginalMember(owner = "client", name = "me", descriptor = "LZZMUCPQP;")
    public class72 field267;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "Ljava/lang/String;")
    public String field179;

    @OriginalMember(owner = "client", name = "qd", descriptor = "Ljava/lang/String;")
    private String field219;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "Ljava/lang/String;")
    private String field305;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "Ljava/lang/String;")
    public String field446;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "Ljava/net/Socket;")
    private Socket field504;

    @OriginalMember(owner = "client", name = "gc", descriptor = "Z")
    private static boolean field157;

    @OriginalMember(owner = "client", name = "hc", descriptor = "Z")
    private static boolean field158;

    @OriginalMember(owner = "client", name = "ee", descriptor = "Z")
    private static boolean field259;

    @OriginalMember(owner = "client", name = "mf", descriptor = "Z")
    public static boolean field318;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "Z")
    private static boolean field392;

    @OriginalMember(owner = "client", name = "ij", descriptor = "Z")
    public static boolean field522;

    @OriginalMember(owner = "client", name = "dc", descriptor = "[I")
    private int[] field154;

    @OriginalMember(owner = "client", name = "ec", descriptor = "[I")
    private int[] field155;

    @OriginalMember(owner = "client", name = "fc", descriptor = "[I")
    private int[] field156;

    @OriginalMember(owner = "client", name = "rd", descriptor = "[I")
    private int[] field220;

    @OriginalMember(owner = "client", name = "sd", descriptor = "[I")
    private int[] field221;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "[I")
    private int[] field342;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "[I")
    private int[] field343;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "[I")
    private int[] field344;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "[I")
    private int[] field345;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "[I")
    private int[] field349;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "[I")
    private int[] field350;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "[I")
    private int[] field351;

    @OriginalMember(owner = "client", name = "ui", descriptor = "[I")
    private int[] field482;

    @OriginalMember(owner = "client", name = "vi", descriptor = "[I")
    private int[] field483;

    @OriginalMember(owner = "client", name = "oc", descriptor = "[LTOROBAKX;")
    private class59[] field165;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "[[B")
    private byte[][] field236;

    @OriginalMember(owner = "client", name = "bh", descriptor = "[[B")
    private byte[][] field411;

    @OriginalMember(owner = "client", name = "cd", descriptor = "[[[B")
    private byte[][][] field205;

    @OriginalMember(owner = "client", name = "mg", descriptor = "[[[I")
    private int[][][] field370;

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method31(byte arg0) {
        signlink.reporterror = false;
        try {
            if (this.field248 != null) {
                this.field248.method210();
            }
        } catch (Exception var2) {
        }
        this.field248 = null;
        this.method136(0);
        if (this.field267 != null) {
            this.field267.field1729 = false;
        }
        this.field267 = null;
        this.field217.method227();
        this.field217 = null;
        this.field159 = null;
        this.field306 = null;
        this.field412 = null;
        this.field452 = null;
        this.field349 = null;
        this.field411 = null;
        this.field236 = null;
        this.field350 = null;
        this.field351 = null;
        this.field370 = null;
        this.field205 = null;
        this.field367 = null;
        this.field474 = null;
        this.field346 = null;
        this.field405 = null;
        this.field284 = null;
        this.field285 = null;
        if (arg0 != -111) {
            this.method62();
        }
        this.field409 = null;
        this.field186 = null;
        this.field187 = null;
        this.field188 = null;
        this.field189 = null;
        this.field430 = null;
        this.field431 = null;
        this.field432 = null;
        this.field380 = null;
        this.field381 = null;
        this.field382 = null;
        this.field383 = null;
        this.field384 = null;
        this.field385 = null;
        this.field386 = null;
        this.field387 = null;
        this.field388 = null;
        this.field361 = null;
        this.field362 = null;
        this.field363 = null;
        this.field352 = null;
        this.field353 = null;
        this.field354 = null;
        this.field222 = null;
        this.field435 = null;
        this.field436 = null;
        this.field437 = null;
        this.field438 = null;
        this.field439 = null;
        this.field468 = null;
        this.field469 = null;
        this.field470 = null;
        this.field471 = null;
        this.field472 = null;
        this.field121 = null;
        this.field516 = null;
        this.field460 = null;
        this.field515 = null;
        this.field488 = null;
        this.field489 = null;
        this.field490 = null;
        this.field491 = null;
        this.field492 = null;
        this.field185 = null;
        this.field410 = null;
        this.field366 = null;
        this.field415 = null;
        this.field417 = null;
        this.field419 = null;
        this.field420 = null;
        this.field476 = null;
        this.field160 = null;
        this.field162 = null;
        this.field521 = null;
        this.field336 = null;
        this.field227 = null;
        this.field152 = null;
        this.field497 = null;
        this.field498 = null;
        this.field499 = null;
        this.field500 = null;
        this.field246 = null;
        this.field268 = null;
        this.field448 = null;
        this.field449 = null;
        this.field123 = null;
        this.field324 = null;
        this.field135 = null;
        this.field547 = null;
        this.field175 = null;
        this.field198 = null;
        this.field199 = null;
        this.field195 = null;
        this.field196 = null;
        this.field197 = null;
        this.field200 = null;
        this.field201 = null;
        this.field202 = null;
        this.field203 = null;
        this.method93(true);
        class42.method410(0);
        class5.method27(0);
        class45.method422(0);
        class69.field1669 = null;
        class6.field559 = null;
        class61.field1518 = null;
        class10.field614 = null;
        class58.field1453 = null;
        class55.field1422 = null;
        class55.field1434 = null;
        class38.field1086 = null;
        super.field579 = null;
        class21.field764 = null;
        class48.method433(0);
        class62.method508(0);
        class35.method330(0);
        class57.method489(0);
        System.gc();
        if (class37.field1083) {
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method32(int arg0) {
        int var2 = this.field539.method575(true, "Choose Option");
        if (arg0 != 0) {
            this.field146 = !this.field146;
        }
        for (int var3 = 0; var3 < this.field341; ++var3) {
            int var11 = this.field539.method575(true, this.field246[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field341 * 15 + 21;
        if (super.field593 > 4 && super.field594 > 4 && super.field593 < 516 && super.field594 < 338) {
            int var5 = super.field593 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field594 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field523 = true;
            this.field230 = 0;
            this.field231 = var5;
            this.field232 = var6;
            this.field233 = var2;
            this.field234 = this.field341 * 15 + 22;
        }
        if (super.field593 > 553 && super.field594 > 205 && super.field593 < 743 && super.field594 < 466) {
            int var7 = super.field593 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field594 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field523 = true;
            this.field230 = 1;
            this.field231 = var7;
            this.field232 = var8;
            this.field233 = var2;
            this.field234 = this.field341 * 15 + 22;
        }
        if (super.field593 > 17 && super.field594 > 357 && super.field593 < 496 && super.field594 < 453) {
            int var9 = super.field593 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field594 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field523 = true;
            this.field230 = 2;
            this.field231 = var9;
            this.field232 = var10;
            this.field233 = var2;
            this.field234 = this.field341 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method33(byte arg0) {
        class47 var2 = (class47) this.field152.method482();
        if (arg0 == 8) {
            boolean var3 = false;
            while (var2 != null) {
                if (this.field360 == var2.field1263 && !var2.field1270) {
                    if (field237 >= var2.field1261) {
                        var2.method432(this.field131, true);
                        if (var2.field1270) {
                            var2.method397();
                        } else {
                            this.field367.method520(var2, -1, 60, 0, var2.field1266, 7, var2.field1263, var2.field1264, var2.field1265, false);
                        }
                    }
                } else {
                    var2.method397();
                }
                var2 = (class47) this.field152.method484(this.field493);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method34(int arg0) {
        if (this.field503 != arg0) {
            this.field521 = null;
        }
        if (this.field505 == 0) {
            int var2 = super.field576 / 2 - 80;
            int var3 = super.field577 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field592 == 1 && super.field593 >= var2 - 75 && super.field593 <= var2 + 75 && super.field594 >= var14 - 20 && super.field594 <= var14 + 20) {
                this.field505 = 3;
                this.field273 = 0;
            }
            int var4 = super.field576 / 2 + 80;
            if (super.field592 == 1 && super.field593 >= var4 - 75 && super.field593 <= var4 + 75 && super.field594 >= var14 - 20 && super.field594 <= var14 + 20) {
                this.field124 = "";
                this.field125 = "Enter your username & password.";
                this.field505 = 2;
                this.field273 = 0;
            }
        } else if (this.field505 == 2) {
            int var5 = super.field577 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field592 == 1 && super.field594 >= var16 - 15 && super.field594 < var16) {
                this.field273 = 0;
            }
            var5 = var16 + 15;
            if (super.field592 == 1 && super.field594 >= var5 - 15 && super.field594 < var5) {
                this.field273 = 1;
            }
            var5 += 15;
            int var6 = super.field576 / 2 - 80;
            int var7 = super.field577 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field592 == 1 && super.field593 >= var6 - 75 && super.field593 <= var6 + 75 && super.field594 >= var17 - 20 && super.field594 <= var17 + 20) {
                this.field484 = 0;
                this.method44(this.field455, this.field456, false);
                if (this.field137) {
                    return;
                }
            }
            int var8 = super.field576 / 2 + 80;
            if (super.field592 == 1 && super.field593 >= var8 - 75 && super.field593 <= var8 + 75 && super.field594 >= var17 - 20 && super.field594 <= var17 + 20) {
                this.field505 = 0;
                this.field455 = "";
                this.field456 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method183(0);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field98.length(); ++var11) {
                        if (var9 == field98.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field273 == 0) {
                        if (var9 == 8 && this.field455.length() > 0) {
                            this.field455 = this.field455.substring(0, this.field455.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field273 = 1;
                        }
                        if (var10) {
                            this.field455 = this.field455 + (char) var9;
                        }
                        if (this.field455.length() > 12) {
                            this.field455 = this.field455.substring(0, 12);
                        }
                    } else if (this.field273 == 1) {
                        if (var9 == 8 && this.field456.length() > 0) {
                            this.field456 = this.field456.substring(0, this.field456.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field273 = 0;
                        }
                        if (var10) {
                            this.field456 = this.field456 + (char) var9;
                        }
                        if (this.field456.length() > 20) {
                            this.field456 = this.field456.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field505 == 3) {
                int var12 = super.field576 / 2;
                int var13 = super.field577 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field592 == 1 && super.field593 >= var12 - 75 && super.field593 <= var12 + 75 && super.field594 >= var18 - 20 && super.field594 <= var18 + 20) {
                    this.field505 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method35(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (field392 && this.field319 == 2 && class54.field1398 != this.field360) {
            this.field188.method13((byte) -36);
            this.field538.method573("Loading - please wait.", 151, 257, -193, 0);
            this.field538.method573("Loading - please wait.", 150, 256, -193, 16777215);
            this.field188.method14(super.field578, 4, 4, 0);
            this.field319 = 1;
            this.field100 = System.currentTimeMillis();
        }
        if (this.field319 == 1) {
            int var3 = this.method36(true);
            if (var3 != 0 && System.currentTimeMillis() - this.field100 > 360000L) {
                signlink.reporterror(this.field455 + " glcfb " + this.field464 + "," + var3 + "," + field392 + "," + this.field329[0] + "," + this.field217.method219() + "," + this.field360 + "," + this.field180 + "," + this.field181);
                this.field100 = System.currentTimeMillis();
            }
        }
        if (this.field319 == 2 && this.field360 != this.field102) {
            this.field102 = this.field360;
            this.method172(this.field360, -210);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)I")
    public final int method36(boolean arg0) {
        for (int var2 = 0; var2 < this.field411.length; ++var2) {
            if (this.field411[var2] == null && this.field350[var2] != -1) {
                return -1;
            }
            if (this.field236[var2] == null && this.field351[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field411.length; ++var4) {
            byte[] var5 = this.field236[var4];
            if (var5 != null) {
                int var6 = (this.field349[var4] >> 8) * 64 - this.field148;
                int var7 = (this.field349[var4] & 255) * 64 - this.field149;
                if (this.field103) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class54.method460(var5, var7, (byte) -96, var6);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field485) {
            return -4;
        } else {
            this.field319 = 2;
            if (!arg0) {
                this.field108 = this.field452.method292();
            }
            class54.field1398 = this.field360;
            this.method158(101);
            this.field306.method281(52, this.field549);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    private final void method37(byte arg0) {
        if (arg0 != 1) {
            this.field521 = null;
        }
        if (this.field319 == 2) {
            for (class34 var2 = (class34) this.field336.method482(); var2 != null; var2 = (class34) this.field336.method484(this.field493)) {
                if (var2.field967 > 0) {
                    --var2.field967;
                }
                if (var2.field967 == 0) {
                    if (var2.field968 < 0 || class54.method471(var2.field968, var2.field970, -45657)) {
                        this.method61(var2.field974, var2.field971, var2.field973, 8, var2.field968, var2.field970, var2.field969, var2.field972);
                        var2.method397();
                    }
                } else {
                    if (var2.field975 > 0) {
                        --var2.field975;
                    }
                    if (var2.field975 == 0 && var2.field973 >= 1 && var2.field974 >= 1 && var2.field973 <= 102 && var2.field974 <= 102 && (var2.field976 < 0 || class54.method471(var2.field976, var2.field978, -45657))) {
                        this.method61(var2.field974, var2.field971, var2.field973, 8, var2.field976, var2.field978, var2.field977, var2.field972);
                        var2.field975 = -1;
                        if (var2.field976 == var2.field968 && var2.field968 == -1) {
                            var2.method397();
                        } else if (var2.field976 == var2.field968 && var2.field977 == var2.field969 && var2.field978 == var2.field970) {
                            var2.method397();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)I")
    public final int method38(byte arg0) {
        if (arg0 != 77) {
            this.field549 = -196;
        }
        int var2 = 3;
        if (this.field310 < 310) {
            int var3 = this.field307 >> 7;
            int var4 = this.field309 >> 7;
            int var5 = field90.field815 >> 7;
            int var6 = field90.field816 >> 7;
            if ((this.field205[this.field360][var3][var4] & 4) != 0) {
                var2 = this.field360;
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
                    if ((this.field205[this.field360][var3][var4] & 4) != 0) {
                        var2 = this.field360;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field205[this.field360][var3][var4] & 4) != 0) {
                            var2 = this.field360;
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
                    if ((this.field205[this.field360][var3][var4] & 4) != 0) {
                        var2 = this.field360;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field205[this.field360][var3][var4] & 4) != 0) {
                            var2 = this.field360;
                        }
                    }
                }
            }
        }
        if ((this.field205[this.field360][field90.field815 >> 7][field90.field816 >> 7] & 4) != 0) {
            var2 = this.field360;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)I")
    public final int method39(byte arg0) {
        if (arg0 != 5) {
            this.field549 = 301;
        }
        int var2 = this.method114(this.field360, this.field309, (byte) 64, this.field307);
        return var2 - this.field308 < 800 && (this.field205[this.field360][this.field307 >> 7][this.field309 >> 7] & 4) != 0 ? this.field360 : 3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method40(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field548 >= 100) {
                this.method139("Your ignore list is full. Max of 100 hit", true, 0, "");
            } else {
                String var4 = class44.method417((byte) 97, class44.method414((byte) 9, arg0));
                for (int var5 = 0; var5 < this.field548; ++var5) {
                    if (this.field140[var5] == arg0) {
                        this.method139(var4 + " is already on your ignore list", true, 0, "");
                        return;
                    }
                }
                if (arg1 != 0) {
                    this.field91 = -141;
                }
                for (int var6 = 0; var6 < this.field299; ++var6) {
                    if (this.field547[var6] == arg0) {
                        this.method139("Please remove " + var4 + " from your friend list first", true, 0, "");
                        return;
                    }
                }
                this.field140[this.field548++] = arg0;
                this.field134 = true;
                this.field306.method281(232, this.field549);
                this.field306.method288(arg0, (byte) 7);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILITPGSHXV;Z)V")
    public final void method41(int arg0, class23 arg1, boolean arg2) {
        this.method42(arg0, true, arg1.field816, arg1.field815);
        if (arg2) {
            this.field306.method282(156);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZII)V")
    public final void method42(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg3 >= 128 && arg2 >= 128 && arg3 <= 13056 && arg2 <= 13056) {
            int var5 = this.method114(this.field360, arg2, (byte) 64, arg3) - arg0;
            int var6 = arg3 - this.field307;
            int var7 = var5 - this.field308;
            int var8 = arg2 - this.field309;
            int var9 = class35.field1056[this.field310];
            int var10 = class35.field1057[this.field310];
            int var11 = class35.field1056[this.field311];
            int var12 = class35.field1057[this.field311];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            this.field137 &= arg1;
            if (var17 >= 50) {
                this.field527 = (var13 << 9) / var17 + class48.field1281;
                this.field528 = (var16 << 9) / var17 + class48.field1282;
            } else {
                this.field527 = -1;
                this.field528 = -1;
            }
        } else {
            this.field527 = -1;
            this.field528 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method43(boolean arg0) {
        short var2 = 256;
        if (this.field347 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field347 > 768) {
                    this.field342[var3] = this.method168(3, this.field343[var3], this.field344[var3], 1024 - this.field347);
                } else if (this.field347 > 256) {
                    this.field342[var3] = this.field344[var3];
                } else {
                    this.field342[var3] = this.method168(3, this.field344[var3], this.field343[var3], 256 - this.field347);
                }
            }
        } else if (this.field348 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field348 > 768) {
                    this.field342[var4] = this.method168(3, this.field343[var4], this.field345[var4], 1024 - this.field348);
                } else if (this.field348 > 256) {
                    this.field342[var4] = this.field345[var4];
                } else {
                    this.field342[var4] = this.method168(3, this.field345[var4], this.field343[var4], 256 - this.field348);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field342[var5] = this.field343[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field198.field21[var6] = this.field250.field633[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field332[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field482[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field342[var26];
                    int var30 = this.field198.field21[var8];
                    this.field198.field21[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field198.method14(super.field578, 0, 0, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field199.field21[var10] = this.field251.field633[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field332[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field482[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field342[var18];
                    int var22 = this.field199.field21[var16];
                    this.field199.field21[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        if (!arg0) {
            this.field199.method14(super.field578, 637, 0, 0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method44(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field124 = "";
                this.field125 = "Connecting to server...";
                this.method59(false, true);
            }
            this.field248 = new class16(this, this.method167(field390 + 43594), (byte) 56);
            long var4 = class44.method413(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field306.field954 = 0;
            this.field306.method282(14);
            this.field306.method282(var6);
            this.field248.method214(0, 2, this.field306.field953, false);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field248.method211();
            }
            int var8 = this.field248.method211();
            int var9 = var8;
            if (var8 == 0) {
                this.field248.method213(this.field452.field953, 0, 8);
                this.field452.field954 = 0;
                this.field464 = this.field452.method298(3);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field464 >> 32), (int) this.field464 };
                this.field306.field954 = 0;
                this.field306.method282(10);
                this.field306.method286(var10[0]);
                this.field306.method286(var10[1]);
                this.field306.method286(var10[2]);
                this.field306.method286(var10[3]);
                this.field306.method286(signlink.uid);
                this.field306.method289(arg0);
                this.field306.method289(arg1);
                this.field306.method307(field406, 948, field458);
                this.field412.field954 = 0;
                if (arg2) {
                    this.field412.method282(18);
                } else {
                    this.field412.method282(16);
                }
                this.field412.method282(this.field306.field954 + 36 + 1 + 1 + 2);
                this.field412.method282(255);
                this.field412.method283(311);
                this.field412.method282(field392 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field412.method286(this.field501[var11]);
                }
                this.field412.method290(20417, this.field306.field953, 0, this.field306.field954);
                this.field306.field958 = new class30(var10, false);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field249 = new class30(var10, false);
                this.field248.method214(0, this.field412.field954, this.field412.field953, false);
                var8 = this.field248.method211();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method44(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field87 = this.field248.method211();
                field522 = this.field248.method211() == 1;
                this.field399 = 0L;
                this.field440 = 0;
                this.field267.field1730 = 0;
                super.field583 = true;
                this.field328 = true;
                this.field137 = true;
                this.field306.field954 = 0;
                this.field452.field954 = 0;
                this.field108 = -1;
                this.field541 = -1;
                this.field542 = -1;
                this.field543 = -1;
                this.field107 = 0;
                this.field109 = 0;
                this.field210 = 0;
                this.field111 = 0;
                this.field487 = 0;
                this.field341 = 0;
                this.field523 = false;
                super.field584 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field335[var13] = null;
                }
                this.field442 = 0;
                this.field176 = 0;
                this.field319 = 0;
                this.field461 = 0;
                this.field524 = (int) (Math.random() * 100.0D) - 50;
                this.field393 = (int) (Math.random() * 110.0D) - 55;
                this.field402 = (int) (Math.random() * 80.0D) - 40;
                this.field368 = (int) (Math.random() * 120.0D) - 60;
                this.field132 = (int) (Math.random() * 30.0D) - 20;
                this.field374 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field97 = 0;
                this.field102 = -1;
                this.field322 = 0;
                this.field323 = 0;
                this.field416 = 0;
                this.field161 = 0;
                for (int var14 = 0; var14 < this.field413; ++var14) {
                    this.field415[var14] = null;
                    this.field420[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field160[var15] = null;
                }
                field90 = this.field415[this.field414] = new class21();
                this.field227.method486();
                this.field152.method486();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field521[var16][var17][var18] = null;
                        }
                    }
                }
                this.field336 = new class56(306);
                this.field300 = 0;
                this.field299 = 0;
                this.field286 = -1;
                this.field119 = -1;
                this.field112 = -1;
                this.field511 = -1;
                this.field427 = -1;
                this.field144 = false;
                this.field535 = 3;
                this.field166 = 0;
                this.field523 = false;
                this.field365 = false;
                this.field305 = null;
                this.field514 = 0;
                this.field235 = -1;
                this.field467 = true;
                this.method95(0);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field544[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field425[var20] = null;
                    this.field426[var20] = false;
                }
                field142 = 0;
                field226 = 0;
                field463 = 0;
                field84 = 0;
                field82 = 0;
                field486 = 0;
                field507 = 0;
                field257 = 0;
                field502 = 0;
                field372 = 0;
                this.method63((byte) 1);
            } else if (var8 == 3) {
                this.field124 = "";
                this.field125 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field124 = "Your account has been disabled.";
                this.field125 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field124 = "Your account is already logged in.";
                this.field125 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field124 = "RuneScape has been updated!";
                this.field125 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field124 = "This world is full.";
                this.field125 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field124 = "Unable to connect.";
                this.field125 = "Login server offline.";
            } else if (var8 == 9) {
                this.field124 = "Login limit exceeded.";
                this.field125 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field124 = "Unable to connect.";
                this.field125 = "Bad session id.";
            } else if (var8 == 11) {
                this.field125 = "Login server rejected session.";
                this.field125 = "Please try again.";
            } else if (var8 == 12) {
                this.field124 = "You need a members account to login to this world.";
                this.field125 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field124 = "Could not complete login.";
                this.field125 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field124 = "The server is being updated.";
                this.field125 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field137 = true;
                this.field306.field954 = 0;
                this.field452.field954 = 0;
                this.field108 = -1;
                this.field541 = -1;
                this.field542 = -1;
                this.field543 = -1;
                this.field107 = 0;
                this.field109 = 0;
                this.field210 = 0;
                this.field341 = 0;
                this.field523 = false;
                this.field100 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field124 = "Login attempts exceeded.";
                this.field125 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field124 = "You are standing in a members-only area.";
                this.field125 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field124 = "Invalid loginserver requested";
                this.field125 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field484 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field484;
                            this.method44(arg0, arg1, arg2);
                        } else {
                            this.field124 = "No response from loginserver";
                            this.field125 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field124 = "No response from server";
                        this.field125 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field124 = "Unexpected server response";
                    this.field125 = "Please try using a different world.";
                }
            } else {
                for (int var21 = this.field248.method211(); var21 >= 0; --var21) {
                    this.field124 = "You have only just left another world";
                    this.field125 = "Your profile will be transferred in: " + var21 + " seconds";
                    this.method59(false, true);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var23) {
                    }
                }
                this.method44(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field124 = "";
            this.field125 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method45(int arg0) {
        byte[] var2 = this.field218.method209("title.dat", (byte[]) null);
        class12 var3 = new class12(var2, this);
        this.field198.method13((byte) -36);
        var3.method191(-711, 0, 0);
        this.field199.method13((byte) -36);
        var3.method191(-711, 0, -637);
        this.field195.method13((byte) -36);
        var3.method191(-711, 0, -128);
        this.field196.method13((byte) -36);
        var3.method191(-711, -371, -202);
        this.field197.method13((byte) -36);
        var3.method191(-711, -171, -202);
        this.field200.method13((byte) -36);
        var3.method191(-711, -265, 0);
        this.field201.method13((byte) -36);
        var3.method191(-711, -265, -562);
        this.field202.method13((byte) -36);
        var3.method191(-711, -171, -128);
        this.field203.method13((byte) -36);
        var3.method191(-711, -171, -562);
        int[] var4 = new int[var3.field634];
        for (int var5 = 0; var5 < var3.field635; ++var5) {
            for (int var10 = 0; var10 < var3.field634; ++var10) {
                var4[var10] = var3.field633[var3.field634 * var5 + (var3.field634 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field634; ++var11) {
                var3.field633[var3.field634 * var5 + var11] = var4[var11];
            }
        }
        this.field198.method13((byte) -36);
        var3.method191(-711, 0, 382);
        this.field199.method13((byte) -36);
        var3.method191(-711, 0, -255);
        this.field195.method13((byte) -36);
        var3.method191(-711, 0, 254);
        this.field196.method13((byte) -36);
        var3.method191(-711, -371, 180);
        this.field197.method13((byte) -36);
        var3.method191(-711, -171, 180);
        this.field200.method13((byte) -36);
        var3.method191(-711, -265, 382);
        this.field201.method13((byte) -36);
        var3.method191(-711, -265, -180);
        this.field202.method13((byte) -36);
        var3.method191(-711, -171, 254);
        this.field203.method13((byte) -36);
        var3.method191(-711, -171, -180);
        class12 var6 = new class12(this.field218, "logo", 0);
        this.field195.method13((byte) -36);
        if (arg0 != 4) {
            field371 = -384;
        }
        var6.method193(382 - var6.field634 / 2 - 128, this.field408, 18);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method46(int arg0) {
        if (this.field85 != 0) {
            int var2 = 0;
            if (arg0 != -19634) {
                this.method62();
            }
            if (this.field210 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field335[var3] != null) {
                    int var4 = this.field333[var3];
                    String var5 = this.field334[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field228 == 0 || this.field228 == 1 && this.method82(var5, (byte) 0))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field586 > 4 && super.field587 - 4 > var9 - 10 && super.field587 - 4 <= var9 + 3) {
                            int var10 = this.field538.method575(true, "From:  " + var5 + this.field335[var3]) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field586 < var10 + 4) {
                                if (this.field87 >= 1) {
                                    this.field246[this.field341] = "Report abuse @whi@" + var5;
                                    this.field499[this.field341] = 2529;
                                    ++this.field341;
                                }
                                this.field246[this.field341] = "Add ignore @whi@" + var5;
                                this.field499[this.field341] = 2176;
                                ++this.field341;
                                this.field246[this.field341] = "Add friend @whi@" + var5;
                                this.field499[this.field341] = 2521;
                                ++this.field341;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field228 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public static final void method47(byte arg0) {
        class62.field1577 = true;
        class48.field1276 = true;
        field392 = true;
        class54.field1407 = true;
        class42.field1152 = true;
        if (arg0 != 5) {
            field371 = -292;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method48(byte arg0) {
        if (arg0 == 0) {
            boolean var2 = false;
        } else {
            field371 = this.field249.method265();
        }
        this.field118 = true;
        try {
            long var3 = System.currentTimeMillis();
            int var5 = 0;
            int var6 = 20;
            while (this.field506) {
                ++this.field287;
                this.method129(6);
                this.method129(6);
                this.method43(false);
                ++var5;
                if (var5 > 10) {
                    long var7 = System.currentTimeMillis();
                    int var9 = (int) (var7 - var3) / 10 - var6;
                    var6 = 40 - var9;
                    if (var6 < 5) {
                        var6 = 5;
                    }
                    var5 = 0;
                    var3 = var7;
                }
                try {
                    Thread.sleep((long) var6);
                } catch (Exception var10) {
                }
            }
        } catch (Exception var11) {
        }
        this.field118 = false;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method49(boolean arg0) {
        if (this.field341 >= 2 || this.field442 != 0 || this.field176 != 0) {
            if (!arg0) {
                this.method62();
            }
            String var2;
            if (this.field442 == 1 && this.field341 < 2) {
                var2 = "Use " + this.field446 + " with...";
            } else if (this.field176 == 1 && this.field341 < 2) {
                var2 = this.field179 + "...";
            } else {
                var2 = this.field246[this.field341 - 1];
            }
            if (this.field341 > 2) {
                var2 = var2 + "@whi@ / " + (this.field341 - 2) + " more options";
            }
            this.field539.method582(field237 / 1000, 16777215, var2, 4, (byte) 1, 15, true);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILMUKVLYLC;I)V")
    private final void method50(int arg0, class33 arg1, int arg2) {
        while (arg0 >= 0) {
            this.field503 = 326;
        }
        arg1.method302(false);
        int var4 = arg1.method303((byte) 8, 8);
        if (var4 < this.field161) {
            for (int var5 = var4; var5 < this.field161; ++var5) {
                this.field476[this.field475++] = this.field162[var5];
            }
        }
        if (var4 > this.field161) {
            signlink.reporterror(this.field455 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field161 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field162[var6];
                class43 var8 = this.field160[var7];
                int var9 = arg1.method303((byte) 8, 1);
                if (var9 == 0) {
                    this.field162[this.field161++] = var7;
                    var8.field844 = field237;
                } else {
                    int var10 = arg1.method303((byte) 8, 2);
                    if (var10 == 0) {
                        this.field162[this.field161++] = var7;
                        var8.field844 = field237;
                        this.field419[this.field418++] = var7;
                    } else if (var10 == 1) {
                        this.field162[this.field161++] = var7;
                        var8.field844 = field237;
                        int var11 = arg1.method303((byte) 8, 3);
                        var8.method247(var11, false, -634);
                        int var12 = arg1.method303((byte) 8, 1);
                        if (var12 == 1) {
                            this.field419[this.field418++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field162[this.field161++] = var7;
                        var8.field844 = field237;
                        int var13 = arg1.method303((byte) 8, 3);
                        var8.method247(var13, true, -634);
                        int var14 = arg1.method303((byte) 8, 3);
                        var8.method247(var14, true, -634);
                        int var15 = arg1.method303((byte) 8, 1);
                        if (var15 == 1) {
                            this.field419[this.field418++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field476[this.field475++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method51(int arg0, long arg1) {
        if (arg0 >= 5 && arg0 <= 5) {
            if (arg1 != 0L) {
                for (int var4 = 0; var4 < this.field548; ++var4) {
                    if (this.field140[var4] == arg1) {
                        --this.field548;
                        this.field134 = true;
                        for (int var5 = var4; var5 < this.field548; ++var5) {
                            this.field140[var5] = this.field140[var5 + 1];
                        }
                        this.field306.method281(165, this.field549);
                        this.field306.method288(arg1, (byte) 7);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BZZ)V")
    public final void method52(byte[] arg0, boolean arg1, boolean arg2) {
        this.field137 &= arg1;
        signlink.midifade = arg2 ? 1 : 0;
        signlink.midisave(arg0, arg0.length);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method53(int arg0, int arg1) {
        int var3 = class38.field1086[arg0].field1094;
        if (var3 != 0) {
            int var4 = this.field268[arg0];
            if (arg1 != 35758) {
                this.field108 = -1;
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    class48.method442(1, 0.9D);
                }
                if (var4 == 2) {
                    class48.method442(1, 0.8D);
                }
                if (var4 == 3) {
                    class48.method442(1, 0.7D);
                }
                if (var4 == 4) {
                    class48.method442(1, 0.6D);
                }
                class45.field1209.method452();
                this.field96 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field192;
                if (var4 == 0) {
                    this.method111(this.field192, 0, (byte) 20);
                    this.field192 = true;
                }
                if (var4 == 1) {
                    this.method111(this.field192, -400, (byte) 20);
                    this.field192 = true;
                }
                if (var4 == 2) {
                    this.method111(this.field192, -800, (byte) 20);
                    this.field192 = true;
                }
                if (var4 == 3) {
                    this.method111(this.field192, -1200, (byte) 20);
                    this.field192 = true;
                }
                if (var4 == 4) {
                    this.field192 = false;
                }
                if (this.field192 != var5 && !field392) {
                    if (this.field192) {
                        this.field465 = this.field401;
                        this.field466 = true;
                        this.field217.method229(2, this.field465);
                    } else {
                        this.method136(0);
                    }
                    this.field313 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field358 = true;
                    this.method153(-39163, 0);
                }
                if (var4 == 1) {
                    this.field358 = true;
                    this.method153(-39163, -400);
                }
                if (var4 == 2) {
                    this.field358 = true;
                    this.method153(-39163, -800);
                }
                if (var4 == 3) {
                    this.field358 = true;
                    this.method153(-39163, -1200);
                }
                if (var4 == 4) {
                    this.field358 = false;
                }
            }
            if (var3 == 5) {
                this.field494 = var4;
            }
            if (var3 == 6) {
                this.field441 = var4;
            }
            if (var3 == 8) {
                this.field85 = var4;
                this.field256 = true;
            }
            if (var3 == 9) {
                this.field207 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method54(boolean arg0) {
        class42.field1128.method452();
        class42.field1130.method452();
        class5.field64.method452();
        class45.field1220.method452();
        class45.field1209.method452();
        class21.field764.method452();
        if (arg0) {
            this.method62();
        }
        class55.field1434.method452();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILHPYXKOFA;III)V")
    public final void method55(int arg0, class21 arg1, int arg2, int arg3, int arg4) {
        if (field90 != arg1) {
            if (this.field341 < 400) {
                int var6 = 70 / arg3;
                String var7;
                if (arg1.field785 == 0) {
                    var7 = arg1.field774 + method169(arg1.field765, (byte) 29, field90.field765) + " (level-" + arg1.field765 + ")";
                } else {
                    var7 = arg1.field774 + " (skill-" + arg1.field785 + ")";
                }
                if (this.field442 == 1) {
                    this.field246[this.field341] = "Use " + this.field446 + " with @whi@" + var7;
                    this.field499[this.field341] = 636;
                    this.field500[this.field341] = arg2;
                    this.field497[this.field341] = arg0;
                    this.field498[this.field341] = arg4;
                    ++this.field341;
                } else if (this.field176 == 1) {
                    if ((this.field178 & 8) == 8) {
                        this.field246[this.field341] = this.field179 + " @whi@" + var7;
                        this.field499[this.field341] = 926;
                        this.field500[this.field341] = arg2;
                        this.field497[this.field341] = arg0;
                        this.field498[this.field341] = arg4;
                        ++this.field341;
                    }
                } else {
                    for (int var8 = 4; var8 >= 0; --var8) {
                        if (this.field425[var8] != null) {
                            this.field246[this.field341] = this.field425[var8] + " @whi@" + var7;
                            short var10 = 0;
                            if (this.field425[var8].equalsIgnoreCase("attack")) {
                                if (arg1.field765 > field90.field765) {
                                    var10 = 2000;
                                }
                                if (field90.field771 != 0 && arg1.field771 != 0) {
                                    if (field90.field771 == arg1.field771) {
                                        var10 = 2000;
                                    } else {
                                        var10 = 0;
                                    }
                                }
                            } else if (this.field426[var8]) {
                                var10 = 2000;
                            }
                            if (var8 == 0) {
                                this.field499[this.field341] = var10 + 359;
                            }
                            if (var8 == 1) {
                                this.field499[this.field341] = var10 + 967;
                            }
                            if (var8 == 2) {
                                this.field499[this.field341] = var10 + 591;
                            }
                            if (var8 == 3) {
                                this.field499[this.field341] = var10 + 52;
                            }
                            if (var8 == 4) {
                                this.field499[this.field341] = var10 + 549;
                            }
                            this.field500[this.field341] = arg2;
                            this.field497[this.field341] = arg0;
                            this.field498[this.field341] = arg4;
                            ++this.field341;
                        }
                    }
                }
                for (int var9 = 0; var9 < this.field341; ++var9) {
                    if (this.field499[var9] == 387) {
                        this.field246[var9] = "Walk here @whi@" + var7;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JI)V")
    public final void method56(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field299; ++var4) {
                if (this.field547[var4] == arg0) {
                    --this.field299;
                    this.field134 = true;
                    for (int var5 = var4; var5 < this.field299; ++var5) {
                        this.field135[var5] = this.field135[var5 + 1];
                        this.field175[var5] = this.field175[var5 + 1];
                        this.field547[var5] = this.field547[var5 + 1];
                    }
                    this.field306.method281(151, this.field549);
                    this.field306.method288(arg0, (byte) 7);
                    break;
                }
            }
            if (arg1 != -30736) {
                this.field108 = this.field452.method292();
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method57(boolean arg0) {
        this.field252 = new class59(this.field218, "titlebox", 0);
        if (arg0) {
            this.field108 = this.field452.method292();
        }
        this.field253 = new class59(this.field218, "titlebutton", 0);
        this.field165 = new class59[12];
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field165[var3] = new class59(this.field218, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field165[var4] = new class59(this.field218, "runes", (var4 & 3) + 12);
            }
        }
        this.field250 = new class12(128, 265);
        this.field251 = new class12(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field250.field633[var5] = this.field198.field21[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field251.field633[var6] = this.field199.field21[var6];
        }
        this.field343 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field343[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field343[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field343[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field343[var10 + 192] = 16777215;
        }
        this.field344 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field344[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field344[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field344[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field344[var14 + 192] = 16777215;
        }
        this.field345 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field345[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field345[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field345[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field345[var18 + 192] = 16777215;
        }
        this.field342 = new int[256];
        this.field220 = new int[32768];
        this.field221 = new int[32768];
        this.method140(this.field266, (class59) null);
        this.field482 = new int[32768];
        this.field483 = new int[32768];
        this.method79(3, "Connecting to fileserver", 10);
        if (!this.field506) {
            this.field545 = true;
            this.field506 = true;
            this.method101(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method58(int arg0) {
        int var2 = this.field241 * 128 + 64;
        int var3 = this.field242 * 128 + 64;
        int var4 = this.method114(this.field360, var3, (byte) 64, var2) - this.field243;
        if (this.field307 < var2) {
            this.field307 += (var2 - this.field307) * this.field245 / 1000 + this.field244;
            if (this.field307 > var2) {
                this.field307 = var2;
            }
        }
        if (this.field307 > var2) {
            this.field307 -= (this.field307 - var2) * this.field245 / 1000 + this.field244;
            if (this.field307 < var2) {
                this.field307 = var2;
            }
        }
        if (this.field308 < var4) {
            this.field308 += (var4 - this.field308) * this.field245 / 1000 + this.field244;
            if (this.field308 > var4) {
                this.field308 = var4;
            }
        }
        if (this.field308 > var4) {
            this.field308 -= (this.field308 - var4) * this.field245 / 1000 + this.field244;
            if (this.field308 < var4) {
                this.field308 = var4;
            }
        }
        if (this.field309 < var3) {
            this.field309 += (var3 - this.field309) * this.field245 / 1000 + this.field244;
            if (this.field309 > var3) {
                this.field309 = var3;
            }
        }
        if (this.field309 > var3) {
            this.field309 -= (this.field309 - var3) * this.field245 / 1000 + this.field244;
            if (this.field309 < var3) {
                this.field309 = var3;
            }
        }
        ++field288;
        if (field288 > 81) {
            field288 = 0;
            this.field306.method281(225, this.field549);
        }
        int var5 = this.field530 * 128 + 64;
        int var6 = this.field531 * 128 + 64;
        int var7 = this.method114(this.field360, var6, (byte) 64, var5) - this.field532;
        if (arg0 != 1951) {
            this.field92 = this.field249.method265();
        }
        int var8 = var5 - this.field307;
        int var9 = var7 - this.field308;
        int var10 = var6 - this.field309;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field310 < var12) {
            this.field310 += (var12 - this.field310) * this.field534 / 1000 + this.field533;
            if (this.field310 > var12) {
                this.field310 = var12;
            }
        }
        if (this.field310 > var12) {
            this.field310 -= (this.field310 - var12) * this.field534 / 1000 + this.field533;
            if (this.field310 < var12) {
                this.field310 = var12;
            }
        }
        int var14 = var13 - this.field311;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field311 += this.field534 * var14 / 1000 + this.field533;
            this.field311 &= 2047;
        }
        if (var14 < 0) {
            this.field311 -= -var14 * this.field534 / 1000 + this.field533;
            this.field311 &= 2047;
        }
        int var15 = var13 - this.field311;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field311 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method59(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.method151(-16108);
            this.field197.method13((byte) -36);
            this.field252.method500(0, this.field408, 0);
            short var3 = 360;
            short var4 = 200;
            if (this.field505 == 0) {
                int var5 = var4 / 2 + 80;
                this.field537.method574(7711145, var3 / 2, this.field217.field708, var5, 6, true);
                int var6 = var4 / 2 - 20;
                this.field539.method574(16776960, var3 / 2, "Welcome to RuneScape", var6, 6, true);
                int var17 = var6 + 30;
                int var7 = var3 / 2 - 80;
                int var8 = var4 / 2 + 20;
                this.field253.method500(var7 - 73, this.field408, var8 - 20);
                this.field539.method574(16777215, var7, "New User", var8 + 5, 6, true);
                int var9 = var3 / 2 + 80;
                this.field253.method500(var9 - 73, this.field408, var8 - 20);
                this.field539.method574(16777215, var9, "Existing User", var8 + 5, 6, true);
            }
            if (this.field505 == 2) {
                int var10 = var4 / 2 - 40;
                if (this.field124.length() > 0) {
                    this.field539.method574(16776960, var3 / 2, this.field124, var10 - 15, 6, true);
                    this.field539.method574(16776960, var3 / 2, this.field125, var10, 6, true);
                    var10 += 30;
                } else {
                    this.field539.method574(16776960, var3 / 2, this.field125, var10 - 7, 6, true);
                    var10 += 30;
                }
                this.field539.method581(this.field260, var10, var3 / 2 - 90, 16777215, true, "Username: " + this.field455 + (this.field273 == 0 & field237 % 40 < 20 ? "@yel@|" : ""));
                var10 += 15;
                this.field539.method581(this.field260, var10, var3 / 2 - 88, 16777215, true, "Password: " + class44.method418(this.field456, (byte) 7) + (this.field273 == 1 & field237 % 40 < 20 ? "@yel@|" : ""));
                var10 += 15;
                if (!arg1) {
                    int var11 = var3 / 2 - 80;
                    int var12 = var4 / 2 + 50;
                    this.field253.method500(var11 - 73, this.field408, var12 - 20);
                    this.field539.method574(16777215, var11, "Login", var12 + 5, 6, true);
                    int var13 = var3 / 2 + 80;
                    this.field253.method500(var13 - 73, this.field408, var12 - 20);
                    this.field539.method574(16777215, var13, "Cancel", var12 + 5, 6, true);
                }
            }
            if (this.field505 == 3) {
                this.field539.method574(16776960, var3 / 2, "Create a free account", var4 / 2 - 60, 6, true);
                int var14 = var4 / 2 - 35;
                this.field539.method574(16777215, var3 / 2, "To create a new account you need to", var14, 6, true);
                int var18 = var14 + 15;
                this.field539.method574(16777215, var3 / 2, "go back to the main RuneScape webpage", var18, 6, true);
                int var19 = var18 + 15;
                this.field539.method574(16777215, var3 / 2, "and choose the red 'create account'", var19, 6, true);
                int var20 = var19 + 15;
                this.field539.method574(16777215, var3 / 2, "button at the top right of that page.", var20, 6, true);
                int var21 = var20 + 15;
                int var15 = var3 / 2;
                int var16 = var4 / 2 + 50;
                this.field253.method500(var15 - 73, this.field408, var16 - 20);
                this.field539.method574(16777215, var15, "Cancel", var16 + 5, 6, true);
            }
            this.field197.method14(super.field578, 202, 171, 0);
            if (this.field96) {
                this.field96 = false;
                this.field195.method14(super.field578, 128, 0, 0);
                this.field196.method14(super.field578, 202, 371, 0);
                this.field200.method14(super.field578, 0, 265, 0);
                this.field201.method14(super.field578, 562, 265, 0);
                this.field202.method14(super.field578, 128, 171, 0);
                this.field203.method14(super.field578, 562, 171, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method60(byte arg0) {
        if (arg0 != -14) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field97 == 0) {
            if (super.field592 == 1) {
                int var3 = super.field593 - 25 - 550;
                int var4 = super.field594 - 5 - 4;
                if (var3 >= 0 && var4 >= 0 && var3 < 146 && var4 < 151) {
                    var3 -= 73;
                    var4 -= 75;
                    int var5 = this.field374 + this.field368 & 2047;
                    int var6 = class48.field1285[var5];
                    int var7 = class48.field1286[var5];
                    int var8 = (this.field132 + 256) * var6 >> 8;
                    int var9 = (this.field132 + 256) * var7 >> 8;
                    int var10 = var3 * var9 + var4 * var8 >> 11;
                    int var11 = var4 * var9 - var3 * var8 >> 11;
                    int var12 = field90.field815 + var10 >> 7;
                    int var13 = field90.field816 - var11 >> 7;
                    boolean var14 = this.method66(8, 1, 0, 0, 0, var13, 0, true, 0, field90.field855[0], field90.field856[0], var12);
                    if (var14) {
                        this.field306.method282(var3);
                        this.field306.method282(var4);
                        this.field306.method283(this.field374);
                        this.field306.method282(57);
                        this.field306.method282(this.field368);
                        this.field306.method282(this.field132);
                        this.field306.method282(89);
                        this.field306.method283(field90.field815);
                        this.field306.method283(field90.field816);
                        this.field306.method282(this.field291);
                        this.field306.method282(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method61(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 8) {
            this.method62();
        }
        if (arg2 >= 1 && arg0 >= 1 && arg2 <= 102 && arg0 <= 102) {
            if (field392 && this.field360 != arg1) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg7 == 0) {
                var9 = this.field367.method535(arg1, arg2, arg0);
            }
            if (arg7 == 1) {
                var9 = this.field367.method536(arg1, arg0, 677, arg2);
            }
            if (arg7 == 2) {
                var9 = this.field367.method537(arg1, arg2, arg0);
            }
            if (arg7 == 3) {
                var9 = this.field367.method538(arg1, arg2, arg0);
            }
            if (var9 != 0) {
                int var13 = this.field367.method539(arg1, arg2, arg0, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg7 == 0) {
                    this.field367.method526(arg2, arg1, arg0, (byte) 37);
                    class42 var17 = class42.method405(var14);
                    if (var17.field1143) {
                        this.field474[arg1].method273(false, var16, arg2, arg0, var15, var17.field1172);
                    }
                }
                if (arg7 == 1) {
                    this.field367.method527(0, arg1, arg2, arg0);
                }
                if (arg7 == 2) {
                    this.field367.method528(-300, arg1, arg0, arg2);
                    class42 var18 = class42.method405(var14);
                    if (var18.field1134 + arg2 > 103 || var18.field1134 + arg0 > 103 || var18.field1166 + arg2 > 103 || var18.field1166 + arg0 > 103) {
                        return;
                    }
                    if (var18.field1143) {
                        this.field474[arg1].method274(var18.field1172, arg2, arg0, var18.field1134, var16, (byte) -78, var18.field1166);
                    }
                }
                if (arg7 == 3) {
                    this.field367.method529(arg1, (byte) 9, arg0, arg2);
                    class42 var19 = class42.method405(var14);
                    if (var19.field1143 && var19.field1153) {
                        this.field474[arg1].method276(arg2, arg0, 0);
                    }
                }
            }
            if (arg4 >= 0) {
                int var20 = arg1;
                if (arg1 < 3 && (this.field205[1][arg2][arg0] & 2) == 2) {
                    var20 = arg1 + 1;
                }
                class54.method475(this.field367, this.field370, arg5, arg6, arg1, 2, arg0, this.field474[arg1], var20, arg4, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method62() {
        this.method79(3, "Starting up", 20);
        if (signlink.sunjava) {
            super.field572 = 5;
        }
        if (field158) {
            this.field223 = true;
        } else {
            field158 = true;
            boolean var1 = false;
            String var2 = this.method113(true);
            if (var2.endsWith("jagex.com")) {
                var1 = true;
            }
            if (var2.endsWith("runescape.com")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.2")) {
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
            if (var2.endsWith("127.0.0.1")) {
                var1 = true;
            }
            if (!var1) {
                this.field457 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field329[var3] = new class8((byte) 3, 500000, signlink.cache_dat, signlink.cache_idx[var3], var3 + 1);
                    }
                }
                try {
                    this.method94(field147);
                    this.field218 = this.method97((byte) 9, this.field501[1], 1, "title", 25, "title screen");
                    this.field537 = new class70(this.field218, (byte) -52, "p11_full", false);
                    this.field538 = new class70(this.field218, (byte) -52, "p12_full", false);
                    this.field539 = new class70(this.field218, (byte) -52, "b12_full", false);
                    this.field540 = new class70(this.field218, (byte) -52, "q8_full", true);
                    this.method45(4);
                    this.method57(false);
                    class15 var4 = this.method97((byte) 9, this.field501[2], 2, "config", 30, "config");
                    class15 var5 = this.method97((byte) 9, this.field501[3], 3, "interface", 35, "interface");
                    class15 var6 = this.method97((byte) 9, this.field501[4], 4, "media", 40, "2d graphics");
                    class15 var7 = this.method97((byte) 9, this.field501[6], 6, "textures", 45, "textures");
                    class15 var8 = this.method97((byte) 9, this.field501[7], 7, "wordenc", 50, "chat system");
                    class15 var9 = this.method97((byte) 9, this.field501[8], 8, "sounds", 55, "sound effects");
                    this.field205 = new byte[4][104][104];
                    this.field370 = new int[4][105][105];
                    this.field367 = new class62(104, 104, this.field370, 4, 28192);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field474[var10] = new class31(104, field259, 104);
                    }
                    this.field324 = new class12(512, 512);
                    class15 var11 = this.method97((byte) 9, this.field501[5], 5, "versionlist", 60, "update list");
                    this.method79(3, "Connecting to update server", 60);
                    this.field217 = new class17();
                    this.field217.method225(var11, this);
                    class57.method487(this.field217.method226(false));
                    class35.method331(this.field217.method216(489, 0), this.field217);
                    if (!field392) {
                        this.field465 = 0;
                        try {
                            this.field465 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field466 = true;
                        this.field217.method229(2, this.field465);
                        while (this.field217.method219() > 0) {
                            this.method145(167);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field217.field725 > 3) {
                                this.method154("ondemand");
                                return;
                            }
                        }
                    }
                    this.method79(3, "Requesting animations", 65);
                    int var12 = this.field217.method216(489, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field217.method229(1, var13);
                    }
                    while (this.field217.method219() > 0) {
                        int var14 = var12 - this.field217.method219();
                        if (var14 > 0) {
                            this.method79(3, "Loading animations - " + var14 * 100 / var12 + "%", 65);
                        }
                        this.method145(167);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field217.field725 > 3) {
                            this.method154("ondemand");
                            return;
                        }
                    }
                    this.method79(3, "Requesting models", 70);
                    int var15 = this.field217.method216(489, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field217.method220(699, var16);
                        if ((var17 & 1) != 0) {
                            this.field217.method229(0, var16);
                        }
                    }
                    int var18 = this.field217.method219();
                    while (this.field217.method219() > 0) {
                        int var19 = var18 - this.field217.method219();
                        if (var19 > 0) {
                            this.method79(3, "Loading models - " + var19 * 100 / var18 + "%", 70);
                        }
                        this.method145(167);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field329[0] != null) {
                        this.method79(3, "Requesting maps", 75);
                        this.field217.method229(3, this.field217.method236(0, 47, true, 48));
                        this.field217.method229(3, this.field217.method236(1, 47, true, 48));
                        this.field217.method229(3, this.field217.method236(0, 48, true, 48));
                        this.field217.method229(3, this.field217.method236(1, 48, true, 48));
                        this.field217.method229(3, this.field217.method236(0, 49, true, 48));
                        this.field217.method229(3, this.field217.method236(1, 49, true, 48));
                        this.field217.method229(3, this.field217.method236(0, 47, true, 47));
                        this.field217.method229(3, this.field217.method236(1, 47, true, 47));
                        this.field217.method229(3, this.field217.method236(0, 48, true, 47));
                        this.field217.method229(3, this.field217.method236(1, 48, true, 47));
                        this.field217.method229(3, this.field217.method236(0, 48, true, 148));
                        this.field217.method229(3, this.field217.method236(1, 48, true, 148));
                        int var20 = this.field217.method219();
                        while (this.field217.method219() > 0) {
                            int var21 = var20 - this.field217.method219();
                            if (var21 > 0) {
                                this.method79(3, "Loading maps - " + var21 * 100 / var20 + "%", 75);
                            }
                            this.method145(167);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field217.method216(489, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field217.method220(699, var23);
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
                            this.field217.method217(0, var25, var23, 803);
                        }
                    }
                    this.field217.method234(true, field391);
                    if (!field392) {
                        int var26 = this.field217.method216(489, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field217.method218(true, var27)) {
                                this.field217.method217(2, (byte) 1, var27, 803);
                            }
                        }
                    }
                    this.method79(3, "Unpacking media", 80);
                    this.field361 = new class59(var6, "invback", 0);
                    this.field363 = new class59(var6, "chatback", 0);
                    this.field362 = new class59(var6, "mapback", 0);
                    this.field352 = new class59(var6, "backbase1", 0);
                    this.field353 = new class59(var6, "backbase2", 0);
                    this.field354 = new class59(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field222[var28] = new class59(var6, "sideicons", var28);
                    }
                    this.field121 = new class12(var6, "compass", 0);
                    this.field398 = new class12(var6, "mapedge", 0);
                    this.field398.method190(-71);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field185[var29] = new class59(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field410[var30] = new class12(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field516[var31] = new class12(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field460[var32] = new class12(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field396 = new class12(var6, "mapmarker", 0);
                    this.field397 = new class12(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field515[var33] = new class12(var6, "cross", var33);
                    }
                    this.field488 = new class12(var6, "mapdots", 0);
                    this.field489 = new class12(var6, "mapdots", 1);
                    this.field490 = new class12(var6, "mapdots", 2);
                    this.field491 = new class12(var6, "mapdots", 3);
                    this.field492 = new class12(var6, "mapdots", 4);
                    this.field172 = new class59(var6, "scrollbar", 0);
                    this.field173 = new class59(var6, "scrollbar", 1);
                    this.field435 = new class59(var6, "redstone1", 0);
                    this.field436 = new class59(var6, "redstone2", 0);
                    this.field437 = new class59(var6, "redstone3", 0);
                    this.field438 = new class59(var6, "redstone1", 0);
                    this.field438.method497(5);
                    this.field439 = new class59(var6, "redstone2", 0);
                    this.field439.method497(5);
                    this.field468 = new class59(var6, "redstone1", 0);
                    this.field468.method498(0);
                    this.field469 = new class59(var6, "redstone2", 0);
                    this.field469.method498(0);
                    this.field470 = new class59(var6, "redstone3", 0);
                    this.field470.method498(0);
                    this.field471 = new class59(var6, "redstone1", 0);
                    this.field471.method497(5);
                    this.field471.method498(0);
                    this.field472 = new class59(var6, "redstone2", 0);
                    this.field472.method497(5);
                    this.field472.method498(0);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field325[var34] = new class59(var6, "mod_icons", var34);
                    }
                    class12 var35 = new class12(var6, "backleft1", 0);
                    this.field380 = new class2(var35.field635, this.method135(8), 2, var35.field634);
                    var35.method191(-711, 0, 0);
                    class12 var36 = new class12(var6, "backleft2", 0);
                    this.field381 = new class2(var36.field635, this.method135(8), 2, var36.field634);
                    var36.method191(-711, 0, 0);
                    class12 var37 = new class12(var6, "backright1", 0);
                    this.field382 = new class2(var37.field635, this.method135(8), 2, var37.field634);
                    var37.method191(-711, 0, 0);
                    class12 var38 = new class12(var6, "backright2", 0);
                    this.field383 = new class2(var38.field635, this.method135(8), 2, var38.field634);
                    var38.method191(-711, 0, 0);
                    class12 var39 = new class12(var6, "backtop1", 0);
                    this.field384 = new class2(var39.field635, this.method135(8), 2, var39.field634);
                    var39.method191(-711, 0, 0);
                    class12 var40 = new class12(var6, "backvmid1", 0);
                    this.field385 = new class2(var40.field635, this.method135(8), 2, var40.field634);
                    var40.method191(-711, 0, 0);
                    class12 var41 = new class12(var6, "backvmid2", 0);
                    this.field386 = new class2(var41.field635, this.method135(8), 2, var41.field634);
                    var41.method191(-711, 0, 0);
                    class12 var42 = new class12(var6, "backvmid3", 0);
                    this.field387 = new class2(var42.field635, this.method135(8), 2, var42.field634);
                    var42.method191(-711, 0, 0);
                    class12 var43 = new class12(var6, "backhmid2", 0);
                    this.field388 = new class2(var43.field635, this.method135(8), 2, var43.field634);
                    var43.method191(-711, 0, 0);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field410[var48] != null) {
                            this.field410[var48].method189(var44 + var47, var46 + var47, true, var45 + var47);
                        }
                        if (this.field185[var48] != null) {
                            this.field185[var48].method499(var44 + var47, var46 + var47, true, var45 + var47);
                        }
                    }
                    this.method79(3, "Unpacking textures", 83);
                    class48.method438(var7, 0);
                    class48.method442(1, 0.8D);
                    class48.method437(20, 0);
                    this.method79(3, "Unpacking config", 86);
                    class58.method492(var4, false);
                    class42.method407(var4);
                    class69.method568(var4, false);
                    class45.method420(var4);
                    class5.method29(var4);
                    class6.method173(var4, false);
                    class55.method476(var4, false);
                    class38.method398(var4, false);
                    class18.method238(var4, false);
                    class45.field1194 = field391;
                    if (!field392) {
                        this.method79(3, "Unpacking sounds", 90);
                        byte[] var49 = var9.method209("sounds.dat", (byte[]) null);
                        class33 var50 = new class33(field371, var49);
                        class25.method254(var50, false);
                    }
                    this.method79(3, "Unpacking interfaces", 95);
                    class70[] var51 = new class70[] { this.field537, this.field538, this.field539, this.field540 };
                    class61.method506(true, var51, var5, var6);
                    this.method79(3, "Preparing game engine", 100);
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field362.field1474[this.field362.field1476 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field113[var52] = var53;
                        this.field93[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field362.field1474[this.field362.field1476 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
                                if (var57 == 999) {
                                    var57 = var59;
                                }
                            } else if (var57 != 999) {
                                var58 = var59;
                                break;
                            }
                        }
                        this.field517[var56 - 5] = var57 - 25;
                        this.field264[var56 - 5] = var58 - var57;
                    }
                    class48.method435(479, 96, false);
                    this.field154 = class48.field1287;
                    class48.method435(190, 261, false);
                    this.field155 = class48.field1287;
                    class48.method435(512, 334, false);
                    this.field156 = class48.field1287;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = class48.field1285[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    class62.method545(800, 334, 500, 0, 512, var60);
                    class36.method359(var8);
                    this.field267 = new class72(field378, this);
                    this.method101(this.field267, 10);
                    class22.field795 = this;
                    class42.field1157 = this;
                    class5.field70 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field219 + " " + this.field550);
                    this.field204 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method63(byte arg0) {
        if (this.field189 == null) {
            this.method93(true);
            if (arg0 != 1) {
                field378 = -54;
            }
            super.field579 = null;
            this.field195 = null;
            this.field196 = null;
            this.field197 = null;
            this.field198 = null;
            this.field199 = null;
            this.field200 = null;
            this.field201 = null;
            this.field202 = null;
            this.field203 = null;
            this.field189 = new class2(96, this.method135(8), 2, 479);
            this.field187 = new class2(156, this.method135(8), 2, 172);
            class1.method4(-679);
            this.field362.method500(0, this.field408, 0);
            this.field186 = new class2(261, this.method135(8), 2, 190);
            this.field188 = new class2(334, this.method135(8), 2, 512);
            class1.method4(-679);
            this.field430 = new class2(50, this.method135(8), 2, 496);
            this.field431 = new class2(37, this.method135(8), 2, 269);
            this.field432 = new class2(45, this.method135(8), 2, 249);
            this.field96 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILMUKVLYLC;I)V")
    private final void method64(int arg0, class33 arg1, int arg2) {
        this.field475 = 0;
        this.field418 = 0;
        this.method84(true, arg1, arg2);
        this.method137(arg2, arg1, 393);
        this.method88((byte) 0, arg1, arg2);
        if (arg0 < 7 || arg0 > 7) {
            this.field395 = !this.field395;
        }
        this.method67(false, arg1, arg2);
        for (int var4 = 0; var4 < this.field475; ++var4) {
            int var6 = this.field476[var4];
            if (field237 != this.field415[var6].field844) {
                this.field415[var6] = null;
            }
        }
        if (arg1.field954 != arg2) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field954 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field416; ++var5) {
                if (this.field415[this.field417[var5]] == null) {
                    signlink.reporterror(this.field455 + " null entry in pl list - pos:" + var5 + " size:" + this.field416);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIILUKJEXUVU;)V")
    public final void method65(int arg0, boolean arg1, int arg2, int arg3, class61 arg4) {
        if (arg4.field1537 == 0 && arg4.field1529 != null) {
            if (!arg4.field1550 || this.field261 == arg4.field1519 || this.field433 == arg4.field1519 || this.field292 == arg4.field1519) {
                int var6 = class1.field14;
                int var7 = class1.field12;
                int var8 = class1.field15;
                int var9 = class1.field13;
                if (arg1) {
                    this.field184 = -262;
                }
                class1.method3(arg0, arg4.field1562 + arg3, false, arg3, arg4.field1556 + arg0);
                int var10 = arg4.field1529.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg4.field1505[var11] + arg3;
                    int var13 = arg4.field1553[var11] + arg0 - arg2;
                    class61 var14 = class61.field1518[arg4.field1529[var11]];
                    int var15 = var14.field1520 + var12;
                    int var16 = var14.field1514 + var13;
                    if (var14.field1512 > 0) {
                        this.method161(var14, (byte) -111);
                    }
                    if (var14.field1537 == 0) {
                        if (var14.field1547 > var14.field1506 - var14.field1556) {
                            var14.field1547 = var14.field1506 - var14.field1556;
                        }
                        if (var14.field1547 < 0) {
                            var14.field1547 = 0;
                        }
                        this.method65(var16, false, var14.field1547, var15, var14);
                        if (var14.field1506 > var14.field1556) {
                            this.method121(var16, var14.field1562 + var15, var14.field1506, var14.field1556, -390, var14.field1547);
                        }
                    } else if (var14.field1537 != 1) {
                        if (var14.field1537 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field1556; ++var18) {
                                for (int var19 = 0; var19 < var14.field1562; ++var19) {
                                    int var20 = (var14.field1542 + 32) * var19 + var15;
                                    int var21 = (var14.field1565 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field1501[var17];
                                        var21 += var14.field1510[var17];
                                    }
                                    if (var14.field1504[var17] <= 0) {
                                        if (var14.field1526 != null && var17 < 20) {
                                            class12 var30 = var14.field1526[var17];
                                            if (var30 != null) {
                                                var30.method193(var20, this.field408, var21);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field1504[var17] - 1;
                                        if (var20 > class1.field14 - 32 && var20 < class1.field15 && var21 > class1.field12 - 32 && var21 < class1.field13 || this.field169 != 0 && this.field168 == var17) {
                                            int var25 = 0;
                                            if (this.field442 == 1 && this.field443 == var17 && this.field444 == var14.field1519) {
                                                var25 = 16777215;
                                            }
                                            class12 var26 = class45.method424(var14.field1559[var17], var25, this.field481, var24);
                                            if (var26 != null) {
                                                if (this.field169 != 0 && this.field168 == var17 && this.field167 == var14.field1519) {
                                                    var22 = super.field586 - this.field170;
                                                    var23 = super.field587 - this.field171;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field519 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method195(var20 + var22, var21 + var23, 821, 128);
                                                    if (var21 + var23 < class1.field12 && arg4.field1547 > 0) {
                                                        int var27 = (class1.field12 - var21 - var23) * this.field131 / 3;
                                                        if (var27 > this.field131 * 10) {
                                                            var27 = this.field131 * 10;
                                                        }
                                                        if (var27 > arg4.field1547) {
                                                            var27 = arg4.field1547;
                                                        }
                                                        arg4.field1547 -= var27;
                                                        this.field171 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class1.field13 && arg4.field1547 < arg4.field1506 - arg4.field1556) {
                                                        int var28 = (var21 + var23 + 32 - class1.field13) * this.field131 / 3;
                                                        if (var28 > this.field131 * 10) {
                                                            var28 = this.field131 * 10;
                                                        }
                                                        if (var28 > arg4.field1506 - arg4.field1556 - arg4.field1547) {
                                                            var28 = arg4.field1506 - arg4.field1556 - arg4.field1547;
                                                        }
                                                        arg4.field1547 += var28;
                                                        this.field171 -= var28;
                                                    }
                                                } else if (this.field480 != 0 && this.field479 == var17 && this.field478 == var14.field1519) {
                                                    var26.method195(var20, var21, 821, 128);
                                                } else {
                                                    var26.method193(var20, this.field408, var21);
                                                }
                                                if (var26.field638 == 33 || var14.field1559[var17] != 1) {
                                                    int var29 = var14.field1559[var17];
                                                    this.field537.method577(var21 + 10 + var23, method90(8, var29), var20 + 1 + var22, 0, this.field340);
                                                    this.field537.method577(var21 + 9 + var23, method90(8, var29), var20 + var22, 16776960, this.field340);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field1537 == 3) {
                            boolean var31 = false;
                            if (this.field292 == var14.field1519 || this.field433 == var14.field1519 || this.field261 == var14.field1519) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method148((byte) 9, var14)) {
                                var32 = var14.field1507;
                                if (var31 && var14.field1521 != 0) {
                                    var32 = var14.field1521;
                                }
                            } else {
                                var32 = var14.field1563;
                                if (var31 && var14.field1549 != 0) {
                                    var32 = var14.field1549;
                                }
                            }
                            if (var14.field1502 == 0) {
                                if (var14.field1534) {
                                    class1.method6(var14.field1562, var14.field1556, var16, -19550, var32, var15);
                                } else {
                                    class1.method7(var15, var16, var32, var14.field1562, 0, var14.field1556);
                                }
                            } else if (var14.field1534) {
                                class1.method5(256 - (var14.field1502 & 255), (byte) -92, var15, var14.field1556, var32, var14.field1562, var16);
                            } else {
                                class1.method8(var15, var32, 331, var14.field1562, 256 - (var14.field1502 & 255), var14.field1556, var16);
                            }
                        } else if (var14.field1537 == 4) {
                            class70 var33 = var14.field1551;
                            String var34 = var14.field1522;
                            boolean var35 = false;
                            if (this.field292 == var14.field1519 || this.field433 == var14.field1519 || this.field261 == var14.field1519) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method148((byte) 9, var14)) {
                                var36 = var14.field1507;
                                if (var35 && var14.field1521 != 0) {
                                    var36 = var14.field1521;
                                }
                                if (var14.field1560.length() > 0) {
                                    var34 = var14.field1560;
                                }
                            } else {
                                var36 = var14.field1563;
                                if (var35 && var14.field1549 != 0) {
                                    var36 = var14.field1549;
                                }
                            }
                            if (var14.field1532 == 6 && this.field144) {
                                var34 = "Please wait...";
                                var36 = var14.field1563;
                            }
                            if (class1.field10 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field1695 + var16;
                            while (var34.length() > 0) {
                                if (var34.indexOf("%") != -1) {
                                    label350: while (true) {
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
                                                                            break label350;
                                                                        }
                                                                        var34 = var34.substring(0, var42) + this.method125(this.method147(true, var14, 4), this.field145) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method125(this.method147(true, var14, 3), this.field145) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method125(this.method147(true, var14, 2), this.field145) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method125(this.method147(true, var14, 1), this.field145) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method125(this.method147(true, var14, 0), this.field145) + var34.substring(var38 + 2);
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
                                if (var14.field1558) {
                                    var33.method574(var36, var14.field1562 / 2 + var15, var44, var37, 6, var14.field1564);
                                } else {
                                    var33.method581(this.field260, var37, var15, var36, var14.field1564, var44);
                                }
                                var37 += var33.field1695;
                            }
                        } else if (var14.field1537 == 5) {
                            class12 var45;
                            if (this.method148((byte) 9, var14)) {
                                var45 = var14.field1555;
                            } else {
                                var45 = var14.field1535;
                            }
                            if (var45 != null) {
                                var45.method193(var15, this.field408, var16);
                            }
                        } else if (var14.field1537 == 6) {
                            int var46 = class48.field1281;
                            int var47 = class48.field1282;
                            class48.field1281 = var14.field1562 / 2 + var15;
                            class48.field1282 = var14.field1556 / 2 + var16;
                            int var48 = class48.field1285[var14.field1516] * var14.field1515 >> 16;
                            int var49 = class48.field1286[var14.field1516] * var14.field1515 >> 16;
                            boolean var50 = this.method148((byte) 9, var14);
                            int var51;
                            if (var50) {
                                var51 = var14.field1528;
                            } else {
                                var51 = var14.field1527;
                            }
                            class35 var52;
                            if (var51 == -1) {
                                var52 = var14.method504(var50, -1, -1, 3);
                            } else {
                                class58 var53 = class58.field1453[var51];
                                var52 = var14.method504(var50, var53.field1456[var14.field1536], var53.field1455[var14.field1536], 3);
                            }
                            if (var52 != null) {
                                var52.method354(0, var14.field1517, 0, var14.field1516, 0, var48, var49);
                            }
                            class48.field1281 = var46;
                            class48.field1282 = var47;
                        } else if (var14.field1537 == 7) {
                            class70 var54 = var14.field1551;
                            int var55 = 0;
                            for (int var56 = 0; var56 < var14.field1556; ++var56) {
                                for (int var57 = 0; var57 < var14.field1562; ++var57) {
                                    if (var14.field1504[var55] > 0) {
                                        class45 var58 = class45.method428(var14.field1504[var55] - 1);
                                        String var59 = var58.field1225;
                                        if (var58.field1216 || var14.field1559[var55] != 1) {
                                            var59 = var59 + " x" + method96((byte) -16, var14.field1559[var55]);
                                        }
                                        int var60 = (var14.field1542 + 115) * var57 + var15;
                                        int var61 = (var14.field1565 + 12) * var56 + var16;
                                        if (var14.field1558) {
                                            var54.method574(var14.field1563, var14.field1562 / 2 + var60, var59, var61, 6, var14.field1564);
                                        } else {
                                            var54.method581(this.field260, var61, var60, var14.field1563, var14.field1564, var59);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                class1.method3(var7, var8, false, var6, var9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIZIIII)Z")
    public final boolean method66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field346[var15][var35] = 0;
                this.field405[var15][var35] = 99999999;
            }
        }
        int var16 = arg9;
        int var17 = arg10;
        this.field346[arg9][arg10] = 99;
        this.field405[arg9][arg10] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field284[var18] = arg9;
        int var36 = var18 + 1;
        this.field285[var18] = arg10;
        boolean var20 = false;
        int var21 = this.field284.length;
        int[][] var22 = this.field474[this.field360].field919;
        while (var36 != var19) {
            var16 = this.field284[var19];
            var17 = this.field285[var19];
            var19 = (var19 + 1) % var21;
            if (arg11 == var16 && arg5 == var17) {
                var20 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && this.field474[this.field360].method277((byte) 7, arg11, arg5, var17, arg8, var16, arg3 - 1)) {
                    var20 = true;
                    break;
                }
                if (arg3 < 10 && this.field474[this.field360].method278(arg3 - 1, var16, arg11, arg8, arg5, this.field551, var17)) {
                    var20 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg2 != 0 && this.field474[this.field360].method279(arg6, arg5, var16, var17, arg11, arg4, arg2, 7)) {
                var20 = true;
                break;
            }
            int var34 = this.field405[var16][var17] + 1;
            if (var16 > 0 && this.field346[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field284[var36] = var16 - 1;
                this.field285[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field346[var16 - 1][var17] = 2;
                this.field405[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field346[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field284[var36] = var16 + 1;
                this.field285[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field346[var16 + 1][var17] = 8;
                this.field405[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field346[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field284[var36] = var16;
                this.field285[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field346[var16][var17 - 1] = 1;
                this.field405[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field346[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field284[var36] = var16;
                this.field285[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field346[var16][var17 + 1] = 4;
                this.field405[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field346[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field284[var36] = var16 - 1;
                this.field285[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field346[var16 - 1][var17 - 1] = 3;
                this.field405[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field346[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field284[var36] = var16 + 1;
                this.field285[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field346[var16 + 1][var17 - 1] = 9;
                this.field405[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field346[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field284[var36] = var16 - 1;
                this.field285[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field346[var16 - 1][var17 + 1] = 6;
                this.field405[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field346[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field284[var36] = var16 + 1;
                this.field285[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field346[var16 + 1][var17 + 1] = 12;
                this.field405[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field291 = 0;
        if (!var20) {
            if (arg7) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg11 - var24; var25 <= arg11 + var24; ++var25) {
                        for (int var26 = arg5 - var24; var26 <= arg5 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field405[var25][var26] < var23) {
                                var23 = this.field405[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field291 = 1;
                                var20 = true;
                            }
                        }
                    }
                    if (var20) {
                        break;
                    }
                }
            }
            if (!var20) {
                return false;
            }
        }
        byte var27 = 0;
        if (arg0 < 8 || arg0 > 8) {
            this.field108 = -1;
        }
        this.field284[var27] = var16;
        int var37 = var27 + 1;
        this.field285[var27] = var17;
        int var28;
        int var29 = var28 = this.field346[var16][var17];
        while (arg9 != var16 || arg10 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field284[var37] = var16;
                this.field285[var37++] = var17;
            }
            if ((var29 & 2) != 0) {
                ++var16;
            } else if ((var29 & 8) != 0) {
                --var16;
            }
            if ((var29 & 1) != 0) {
                ++var17;
            } else if ((var29 & 4) != 0) {
                --var17;
            }
            var29 = this.field346[var16][var17];
        }
        if (var37 <= 0) {
            if (arg1 == 1) {
                return false;
            } else {
                return true;
            }
        } else {
            int var30 = var37;
            if (var37 > 25) {
                var30 = 25;
            }
            --var37;
            int var31 = this.field284[var37];
            int var32 = this.field285[var37];
            if (arg1 == 0) {
                this.field306.method281(67, this.field549);
                this.field306.method282(var30 + var30 + 3);
            }
            if (arg1 == 1) {
                this.field306.method281(93, this.field549);
                this.field306.method282(var30 + var30 + 3 + 14);
            }
            if (arg1 == 2) {
                this.field306.method281(255, this.field549);
                this.field306.method282(var30 + var30 + 3);
            }
            this.field322 = this.field284[0];
            this.field323 = this.field285[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field306.method309(this.field284[var37] - var31, (byte) 6);
                this.field306.method282(this.field285[var37] - var32);
            }
            this.field306.method316((byte) 3, this.field148 + var31);
            this.field306.method317(this.field149 + var32, (byte) -34);
            this.field306.method282(super.field596[5] == 1 ? 1 : 0);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLMUKVLYLC;I)V")
    private final void method67(boolean arg0, class33 arg1, int arg2) {
        if (!arg0) {
            for (int var4 = 0; var4 < this.field418; ++var4) {
                int var5 = this.field419[var4];
                class21 var6 = this.field415[var5];
                int var7 = arg1.method292();
                if ((var7 & 128) != 0) {
                    var7 += arg1.method292() << 8;
                }
                this.method143(false, var7, arg1, var6, var5);
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method68(boolean arg0) {
        if (this.field111 > 0) {
            this.method171(-308);
        } else {
            this.field188.method13((byte) -36);
            this.field538.method573("Connection lost", 144, 257, -193, 0);
            this.field538.method573("Connection lost", 143, 256, -193, 16777215);
            this.field538.method573("Please wait - attempting to reestablish", 159, 257, -193, 0);
            this.field538.method573("Please wait - attempting to reestablish", 158, 256, -193, 16777215);
            this.field188.method14(super.field578, 4, 4, 0);
            this.field97 = 0;
            this.field322 = 0;
            class16 var2 = this.field248;
            if (!arg0) {
                this.field108 = -1;
            }
            this.field137 = false;
            this.field484 = 0;
            this.method44(this.field455, this.field456, true);
            if (!this.field137) {
                this.method171(-308);
            }
            try {
                var2.method210();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method69(int arg0) {
        for (int var2 = 0; var2 < this.field161; ++var2) {
            int var3 = this.field162[var2];
            class43 var4 = this.field160[var3];
            if (var4 != null) {
                this.method70(var4.field1177.field57, var4, -13011);
            }
        }
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILITPGSHXV;I)V")
    public final void method70(int arg0, class23 arg1, int arg2) {
        if (arg2 != -13011) {
            this.field108 = -1;
        }
        if (arg1.field815 < 128 || arg1.field816 < 128 || arg1.field815 >= 13184 || arg1.field816 >= 13184) {
            arg1.field808 = -1;
            arg1.field845 = -1;
            arg1.field841 = 0;
            arg1.field842 = 0;
            arg1.field815 = arg1.field855[0] * 128 + arg1.field858 * 64;
            arg1.field816 = arg1.field856[0] * 128 + arg1.field858 * 64;
            arg1.method246((byte) 2);
        }
        if (field90 == arg1 && (arg1.field815 < 1536 || arg1.field816 < 1536 || arg1.field815 >= 11776 || arg1.field816 >= 11776)) {
            arg1.field808 = -1;
            arg1.field845 = -1;
            arg1.field841 = 0;
            arg1.field842 = 0;
            arg1.field815 = arg1.field855[0] * 128 + arg1.field858 * 64;
            arg1.field816 = arg1.field856[0] * 128 + arg1.field858 * 64;
            arg1.method246((byte) 2);
        }
        if (arg1.field841 > field237) {
            this.method71(arg1, 47312);
        } else if (arg1.field842 >= field237) {
            this.method72(arg1, -373);
        } else {
            this.method73(-49197, arg1);
        }
        this.method74(arg1, 0);
        this.method75(5, arg1);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LITPGSHXV;I)V")
    public final void method71(class23 arg0, int arg1) {
        if (arg1 != 47312) {
            this.field266 = !this.field266;
        }
        int var3 = arg0.field841 - field237;
        int var4 = arg0.field858 * 64 + arg0.field837 * 128;
        int var5 = arg0.field858 * 64 + arg0.field839 * 128;
        arg0.field815 += (var4 - arg0.field815) / var3;
        arg0.field816 += (var5 - arg0.field816) / var3;
        arg0.field832 = 0;
        if (arg0.field843 == 0) {
            arg0.field807 = 1024;
        }
        if (arg0.field843 == 1) {
            arg0.field807 = 1536;
        }
        if (arg0.field843 == 2) {
            arg0.field807 = 0;
        }
        if (arg0.field843 == 3) {
            arg0.field807 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LITPGSHXV;I)V")
    public final void method72(class23 arg0, int arg1) {
        if (field237 == arg0.field842 || arg0.field808 == -1 || arg0.field811 != 0 || arg0.field810 + 1 > class58.field1453[arg0.field808].method493(arg0.field809, (byte) 2)) {
            int var3 = arg0.field842 - arg0.field841;
            int var4 = field237 - arg0.field841;
            int var5 = arg0.field858 * 64 + arg0.field837 * 128;
            int var6 = arg0.field858 * 64 + arg0.field839 * 128;
            int var7 = arg0.field858 * 64 + arg0.field838 * 128;
            int var8 = arg0.field858 * 64 + arg0.field840 * 128;
            arg0.field815 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field816 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field832 = 0;
        if (arg0.field843 == 0) {
            arg0.field807 = 1024;
        }
        if (arg0.field843 == 1) {
            arg0.field807 = 1536;
        }
        if (arg0.field843 == 2) {
            arg0.field807 = 0;
        }
        if (arg0.field843 == 3) {
            arg0.field807 = 512;
        }
        arg0.field817 = arg0.field807;
        if (arg1 >= 0) {
            this.method62();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILITPGSHXV;)V")
    public final void method73(int arg0, class23 arg1) {
        arg1.field821 = arg1.field835;
        if (arg0 == -49197) {
            if (arg1.field824 == 0) {
                arg1.field832 = 0;
            } else {
                if (arg1.field808 != -1 && arg1.field811 == 0) {
                    class58 var3 = class58.field1453[arg1.field808];
                    if (arg1.field857 > 0 && var3.field1465 == 0) {
                        ++arg1.field832;
                        return;
                    }
                    if (arg1.field857 <= 0 && var3.field1466 == 0) {
                        ++arg1.field832;
                        return;
                    }
                }
                int var4 = arg1.field815;
                int var5 = arg1.field816;
                int var6 = arg1.field855[arg1.field824 - 1] * 128 + arg1.field858 * 64;
                int var7 = arg1.field856[arg1.field824 - 1] * 128 + arg1.field858 * 64;
                if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                    if (var4 < var6) {
                        if (var5 < var7) {
                            arg1.field807 = 1280;
                        } else if (var5 > var7) {
                            arg1.field807 = 1792;
                        } else {
                            arg1.field807 = 1536;
                        }
                    } else if (var4 > var6) {
                        if (var5 < var7) {
                            arg1.field807 = 768;
                        } else if (var5 > var7) {
                            arg1.field807 = 256;
                        } else {
                            arg1.field807 = 512;
                        }
                    } else if (var5 < var7) {
                        arg1.field807 = 1024;
                    } else {
                        arg1.field807 = 0;
                    }
                    int var8 = arg1.field807 - arg1.field817 & 2047;
                    if (var8 > 1024) {
                        var8 -= 2048;
                    }
                    int var9 = arg1.field851;
                    if (var8 >= -256 && var8 <= 256) {
                        var9 = arg1.field850;
                    } else if (var8 >= 256 && var8 < 768) {
                        var9 = arg1.field853;
                    } else if (var8 >= -768 && var8 <= -256) {
                        var9 = arg1.field852;
                    }
                    if (var9 == -1) {
                        var9 = arg1.field850;
                    }
                    arg1.field821 = var9;
                    int var10 = 4;
                    if (arg1.field817 != arg1.field807 && arg1.field830 == -1 && arg1.field854 != 0) {
                        var10 = 2;
                    }
                    if (arg1.field824 > 2) {
                        var10 = 6;
                    }
                    if (arg1.field824 > 3) {
                        var10 = 8;
                    }
                    if (arg1.field832 > 0 && arg1.field824 > 1) {
                        var10 = 8;
                        --arg1.field832;
                    }
                    if (arg1.field825[arg1.field824 - 1]) {
                        var10 <<= 1;
                    }
                    if (var10 >= 8 && arg1.field850 == arg1.field821 && arg1.field820 != -1) {
                        arg1.field821 = arg1.field820;
                    }
                    if (var4 < var6) {
                        arg1.field815 += var10;
                        if (arg1.field815 > var6) {
                            arg1.field815 = var6;
                        }
                    } else if (var4 > var6) {
                        arg1.field815 -= var10;
                        if (arg1.field815 < var6) {
                            arg1.field815 = var6;
                        }
                    }
                    if (var5 < var7) {
                        arg1.field816 += var10;
                        if (arg1.field816 > var7) {
                            arg1.field816 = var7;
                        }
                    } else if (var5 > var7) {
                        arg1.field816 -= var10;
                        if (arg1.field816 < var7) {
                            arg1.field816 = var7;
                        }
                    }
                    if (arg1.field815 == var6 && arg1.field816 == var7) {
                        --arg1.field824;
                        if (arg1.field857 > 0) {
                            --arg1.field857;
                            return;
                        }
                    }
                } else {
                    arg1.field815 = var6;
                    arg1.field816 = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(LITPGSHXV;I)V")
    public final void method74(class23 arg0, int arg1) {
        if (arg1 == 0) {
            if (arg0.field854 != 0) {
                if (arg0.field830 != -1 && arg0.field830 < 32768) {
                    class43 var3 = this.field160[arg0.field830];
                    if (var3 != null) {
                        int var4 = arg0.field815 - var3.field815;
                        int var5 = arg0.field816 - var3.field816;
                        if (var4 != 0 || var5 != 0) {
                            arg0.field807 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                        }
                    }
                }
                if (arg0.field830 >= 32768) {
                    int var6 = arg0.field830 - 32768;
                    if (this.field301 == var6) {
                        var6 = this.field414;
                    }
                    class21 var7 = this.field415[var6];
                    if (var7 != null) {
                        int var8 = arg0.field815 - var7.field815;
                        int var9 = arg0.field816 - var7.field816;
                        if (var8 != 0 || var9 != 0) {
                            arg0.field807 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                        }
                    }
                }
                if ((arg0.field833 != 0 || arg0.field834 != 0) && (arg0.field824 == 0 || arg0.field832 > 0)) {
                    int var10 = arg0.field815 - (arg0.field833 - this.field148 - this.field148) * 64;
                    int var11 = arg0.field816 - (arg0.field834 - this.field149 - this.field149) * 64;
                    if (var10 != 0 || var11 != 0) {
                        arg0.field807 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                    }
                    arg0.field833 = 0;
                    arg0.field834 = 0;
                }
                int var12 = arg0.field807 - arg0.field817 & 2047;
                if (var12 != 0) {
                    if (var12 >= arg0.field854 && var12 <= 2048 - arg0.field854) {
                        if (var12 > 1024) {
                            arg0.field817 -= arg0.field854;
                        } else {
                            arg0.field817 += arg0.field854;
                        }
                    } else {
                        arg0.field817 = arg0.field807;
                    }
                    arg0.field817 &= 2047;
                    if (arg0.field835 == arg0.field821 && arg0.field817 != arg0.field807) {
                        if (arg0.field836 != -1) {
                            arg0.field821 = arg0.field836;
                            return;
                        }
                        arg0.field821 = arg0.field850;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILITPGSHXV;)V")
    public final void method75(int arg0, class23 arg1) {
        if (arg0 >= 5 && arg0 <= 5) {
            arg1.field826 = false;
            if (arg1.field821 != -1) {
                class58 var3 = class58.field1453[arg1.field821];
                ++arg1.field823;
                if (arg1.field822 < var3.field1454 && arg1.field823 > var3.method493(arg1.field822, (byte) 2)) {
                    arg1.field823 = 0;
                    ++arg1.field822;
                }
                if (arg1.field822 >= var3.field1454) {
                    arg1.field823 = 0;
                    arg1.field822 = 0;
                }
            }
            if (arg1.field845 != -1 && field237 >= arg1.field848) {
                if (arg1.field846 < 0) {
                    arg1.field846 = 0;
                }
                class58 var4 = class55.field1422[arg1.field845].field1426;
                ++arg1.field847;
                while (arg1.field846 < var4.field1454 && arg1.field847 > var4.method493(arg1.field846, (byte) 2)) {
                    arg1.field847 -= var4.method493(arg1.field846, (byte) 2);
                    ++arg1.field846;
                }
                if (arg1.field846 >= var4.field1454 && (arg1.field846 < 0 || arg1.field846 >= var4.field1454)) {
                    arg1.field845 = -1;
                }
            }
            if (arg1.field808 != -1 && arg1.field811 <= 1) {
                class58 var5 = class58.field1453[arg1.field808];
                if (var5.field1465 == 1 && arg1.field857 > 0 && arg1.field841 <= field237 && arg1.field842 < field237) {
                    arg1.field811 = 1;
                    return;
                }
            }
            if (arg1.field808 != -1 && arg1.field811 == 0) {
                class58 var6 = class58.field1453[arg1.field808];
                ++arg1.field810;
                while (arg1.field809 < var6.field1454 && arg1.field810 > var6.method493(arg1.field809, (byte) 2)) {
                    arg1.field810 -= var6.method493(arg1.field809, (byte) 2);
                    ++arg1.field809;
                }
                if (arg1.field809 >= var6.field1454) {
                    arg1.field809 -= var6.field1458;
                    ++arg1.field812;
                    if (arg1.field812 >= var6.field1464) {
                        arg1.field808 = -1;
                    }
                    if (arg1.field809 < 0 || arg1.field809 >= var6.field1454) {
                        arg1.field808 = -1;
                    }
                }
                arg1.field826 = var6.field1460;
            }
            if (arg1.field811 > 0) {
                --arg1.field811;
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method76(byte arg0) {
        if (arg0 != -54) {
            this.field408 = this.field249.method265();
        }
        if (this.field96) {
            this.field96 = false;
            this.field380.method14(super.field578, 0, 4, 0);
            this.field381.method14(super.field578, 0, 357, 0);
            this.field382.method14(super.field578, 722, 4, 0);
            this.field383.method14(super.field578, 743, 205, 0);
            this.field384.method14(super.field578, 0, 0, 0);
            this.field385.method14(super.field578, 516, 4, 0);
            this.field386.method14(super.field578, 516, 205, 0);
            this.field387.method14(super.field578, 496, 357, 0);
            this.field388.method14(super.field578, 0, 338, 0);
            this.field134 = true;
            this.field256 = true;
            this.field143 = true;
            this.field315 = true;
            if (this.field319 != 2) {
                this.field188.method14(super.field578, 4, 4, 0);
                this.field187.method14(super.field578, 550, 4, 0);
            }
        }
        if (this.field319 == 2) {
            this.method109(true);
        }
        if (this.field523 && this.field230 == 1) {
            this.field134 = true;
        }
        if (this.field511 != -1) {
            boolean var2 = this.method81(this.field131, this.field511, true);
            if (var2) {
                this.field134 = true;
            }
        }
        if (this.field480 == 2) {
            this.field134 = true;
        }
        if (this.field169 == 2) {
            this.field134 = true;
        }
        if (this.field134) {
            this.method89(false);
            this.field134 = false;
        }
        ++field238;
        if (field238 > 197) {
            field238 = 0;
            this.field306.method281(214, this.field549);
            this.field306.method286(0);
        }
        if (this.field119 == -1) {
            this.field462.field1547 = this.field89 - this.field321 - 77;
            if (super.field586 > 448 && super.field586 < 560 && super.field587 > 332) {
                this.method115(false, 0, this.field462, this.field89, 463, this.field518, super.field587 - 357, 77, super.field586 - 17);
            }
            int var3 = this.field89 - 77 - this.field462.field1547;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field89 - 77) {
                var3 = this.field89 - 77;
            }
            if (this.field321 != var3) {
                this.field321 = var3;
                this.field256 = true;
            }
        }
        if (this.field119 != -1) {
            boolean var4 = this.method81(this.field131, this.field119, true);
            if (var4) {
                this.field256 = true;
            }
        }
        if (this.field480 == 3) {
            this.field256 = true;
        }
        if (this.field169 == 3) {
            this.field256 = true;
        }
        if (this.field305 != null) {
            this.field256 = true;
        }
        if (this.field523 && this.field230 == 2) {
            this.field256 = true;
        }
        if (this.field256) {
            this.method165(true);
            this.field256 = false;
        }
        if (this.field319 == 2) {
            this.method91(-206);
            this.field187.method14(super.field578, 550, 4, 0);
        }
        if (this.field235 != -1) {
            this.field143 = true;
        }
        if (this.field143) {
            if (this.field235 != -1 && this.field535 == this.field235) {
                this.field235 = -1;
                this.field306.method281(46, this.field549);
                this.field306.method282(this.field535);
            }
            this.field143 = false;
            this.field432.method13((byte) -36);
            this.field354.method500(0, this.field408, 0);
            if (this.field511 == -1) {
                if (this.field153[this.field535] != -1) {
                    if (this.field535 == 0) {
                        this.field435.method500(22, this.field408, 10);
                    }
                    if (this.field535 == 1) {
                        this.field436.method500(54, this.field408, 8);
                    }
                    if (this.field535 == 2) {
                        this.field436.method500(82, this.field408, 8);
                    }
                    if (this.field535 == 3) {
                        this.field437.method500(110, this.field408, 8);
                    }
                    if (this.field535 == 4) {
                        this.field439.method500(153, this.field408, 8);
                    }
                    if (this.field535 == 5) {
                        this.field439.method500(181, this.field408, 8);
                    }
                    if (this.field535 == 6) {
                        this.field438.method500(209, this.field408, 9);
                    }
                }
                if (this.field153[0] != -1 && (this.field235 != 0 || field237 % 20 < 10)) {
                    this.field222[0].method500(29, this.field408, 13);
                }
                if (this.field153[1] != -1 && (this.field235 != 1 || field237 % 20 < 10)) {
                    this.field222[1].method500(53, this.field408, 11);
                }
                if (this.field153[2] != -1 && (this.field235 != 2 || field237 % 20 < 10)) {
                    this.field222[2].method500(82, this.field408, 11);
                }
                if (this.field153[3] != -1 && (this.field235 != 3 || field237 % 20 < 10)) {
                    this.field222[3].method500(115, this.field408, 12);
                }
                if (this.field153[4] != -1 && (this.field235 != 4 || field237 % 20 < 10)) {
                    this.field222[4].method500(153, this.field408, 13);
                }
                if (this.field153[5] != -1 && (this.field235 != 5 || field237 % 20 < 10)) {
                    this.field222[5].method500(180, this.field408, 11);
                }
                if (this.field153[6] != -1 && (this.field235 != 6 || field237 % 20 < 10)) {
                    this.field222[6].method500(208, this.field408, 13);
                }
            }
            this.field432.method14(super.field578, 516, 160, 0);
            this.field431.method13((byte) -36);
            this.field353.method500(0, this.field408, 0);
            if (this.field511 == -1) {
                if (this.field153[this.field535] != -1) {
                    if (this.field535 == 7) {
                        this.field468.method500(42, this.field408, 0);
                    }
                    if (this.field535 == 8) {
                        this.field469.method500(74, this.field408, 0);
                    }
                    if (this.field535 == 9) {
                        this.field469.method500(102, this.field408, 0);
                    }
                    if (this.field535 == 10) {
                        this.field470.method500(130, this.field408, 1);
                    }
                    if (this.field535 == 11) {
                        this.field472.method500(173, this.field408, 0);
                    }
                    if (this.field535 == 12) {
                        this.field472.method500(201, this.field408, 0);
                    }
                    if (this.field535 == 13) {
                        this.field471.method500(229, this.field408, 0);
                    }
                }
                if (this.field153[8] != -1 && (this.field235 != 8 || field237 % 20 < 10)) {
                    this.field222[7].method500(74, this.field408, 2);
                }
                if (this.field153[9] != -1 && (this.field235 != 9 || field237 % 20 < 10)) {
                    this.field222[8].method500(102, this.field408, 3);
                }
                if (this.field153[10] != -1 && (this.field235 != 10 || field237 % 20 < 10)) {
                    this.field222[9].method500(137, this.field408, 4);
                }
                if (this.field153[11] != -1 && (this.field235 != 11 || field237 % 20 < 10)) {
                    this.field222[10].method500(174, this.field408, 2);
                }
                if (this.field153[12] != -1 && (this.field235 != 12 || field237 % 20 < 10)) {
                    this.field222[11].method500(201, this.field408, 2);
                }
                if (this.field153[13] != -1 && (this.field235 != 13 || field237 % 20 < 10)) {
                    this.field222[12].method500(226, this.field408, 2);
                }
            }
            this.field431.method14(super.field578, 496, 466, 0);
            this.field188.method13((byte) -36);
        }
        if (this.field315) {
            this.field315 = false;
            this.field430.method13((byte) -36);
            this.field352.method500(0, this.field408, 0);
            this.field538.method574(16777215, 55, "Public chat", 28, 6, true);
            if (this.field194 == 0) {
                this.field538.method574(65280, 55, "On", 41, 6, true);
            }
            if (this.field194 == 1) {
                this.field538.method574(16776960, 55, "Friends", 41, 6, true);
            }
            if (this.field194 == 2) {
                this.field538.method574(16711680, 55, "Off", 41, 6, true);
            }
            if (this.field194 == 3) {
                this.field538.method574(65535, 55, "Hide", 41, 6, true);
            }
            this.field538.method574(16777215, 184, "Private chat", 28, 6, true);
            if (this.field228 == 0) {
                this.field538.method574(65280, 184, "On", 41, 6, true);
            }
            if (this.field228 == 1) {
                this.field538.method574(16776960, 184, "Friends", 41, 6, true);
            }
            if (this.field228 == 2) {
                this.field538.method574(16711680, 184, "Off", 41, 6, true);
            }
            this.field538.method574(16777215, 324, "Trade/compete", 28, 6, true);
            if (this.field258 == 0) {
                this.field538.method574(65280, 324, "On", 41, 6, true);
            }
            if (this.field258 == 1) {
                this.field538.method574(16776960, 324, "Friends", 41, 6, true);
            }
            if (this.field258 == 2) {
                this.field538.method574(16711680, 324, "Off", 41, 6, true);
            }
            this.field538.method574(16777215, 458, "Report abuse", 33, 6, true);
            this.field430.method14(super.field578, 0, 453, 0);
            this.field188.method13((byte) -36);
        }
        this.field131 = 0;
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)Z")
    public final boolean method77(int arg0) {
        while (arg0 >= 0) {
            this.field306.method282(88);
        }
        if (this.field248 == null) {
            return false;
        } else {
            try {
                int var2 = this.field248.method212();
                if (var2 == 0) {
                    return false;
                }
                if (this.field108 == -1) {
                    this.field248.method213(this.field452.field953, 0, 1);
                    this.field108 = this.field452.field953[0] & 255;
                    if (this.field249 != null) {
                        this.field108 = this.field108 - this.field249.method265() & 255;
                    }
                    this.field107 = class67.field1661[this.field108];
                    --var2;
                }
                if (this.field107 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field248.method213(this.field452.field953, 0, 1);
                    this.field107 = this.field452.field953[0] & 255;
                    --var2;
                }
                if (this.field107 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field248.method213(this.field452.field953, 0, 2);
                    this.field452.field954 = 0;
                    this.field107 = this.field452.method294();
                    var2 -= 2;
                }
                if (var2 < this.field107) {
                    return false;
                }
                this.field452.field954 = 0;
                this.field248.method213(this.field452.field953, 0, this.field107);
                this.field109 = 0;
                this.field543 = this.field542;
                this.field542 = this.field541;
                this.field541 = this.field108;
                if (this.field108 == 109) {
                    this.field134 = true;
                    int var3 = this.field452.method297();
                    int var4 = this.field452.method310(46155);
                    int var5 = this.field452.method311((byte) -93);
                    this.field529[var5] = var3;
                    this.field546[var5] = var4;
                    this.field263[var5] = 1;
                    for (int var6 = 0; var6 < 98; ++var6) {
                        if (var3 >= field139[var6]) {
                            this.field263[var5] = var6 + 2;
                        }
                    }
                    this.field108 = -1;
                    return true;
                }
                if (this.field108 == 67) {
                    int var7 = this.field452.method311((byte) -93);
                    String var8 = this.field452.method299();
                    int var9 = this.field452.method311((byte) -93);
                    if (var7 >= 1 && var7 <= 5) {
                        if (var8.equalsIgnoreCase("null")) {
                            var8 = null;
                        }
                        this.field425[var7 - 1] = var8;
                        this.field426[var7 - 1] = var9 == 0;
                    }
                    this.field108 = -1;
                    return true;
                }
                if (this.field108 == 117) {
                    int var10 = this.field452.method294();
                    int var11 = this.field452.method319(-206);
                    int var12 = this.field452.method320((byte) 1);
                    int var13 = this.field452.method319(-206);
                    class61.field1518[var13].field1516 = var11;
                    class61.field1518[var13].field1517 = var10;
                    class61.field1518[var13].field1515 = var12;
                    this.field108 = -1;
                    return true;
                }
                if (this.field108 == 84) {
                    this.field225 = true;
                    this.field530 = this.field452.method292();
                    this.field531 = this.field452.method292();
                    this.field532 = this.field452.method294();
                    this.field533 = this.field452.method292();
                    this.field534 = this.field452.method292();
                    if (this.field534 >= 100) {
                        int var14 = this.field530 * 128 + 64;
                        int var15 = this.field531 * 128 + 64;
                        int var16 = this.method114(this.field360, var15, (byte) 64, var14) - this.field532;
                        int var17 = var14 - this.field307;
                        int var18 = var16 - this.field308;
                        int var19 = var15 - this.field309;
                        int var20 = (int) Math.sqrt((double) (var17 * var17 + var19 * var19));
                        this.field310 = (int) (Math.atan2((double) var18, (double) var20) * 325.949D) & 2047;
                        this.field311 = (int) (Math.atan2((double) var17, (double) var19) * -325.949D) & 2047;
                        if (this.field310 < 128) {
                            this.field310 = 128;
                        }
                        if (this.field310 > 383) {
                            this.field310 = 383;
                        }
                    }
                    this.field108 = -1;
                    return true;
                }
                if (this.field108 == 209) {
                    int var21 = this.field452.method294();
                    int var22 = this.field452.method294();
                    if (this.field119 != -1) {
                        this.field119 = -1;
                        this.field256 = true;
                    }
                    if (this.field166 != 0) {
                        this.field166 = 0;
                        this.field256 = true;
                    }
                    this.field112 = var22;
                    this.field511 = var21;
                    this.field134 = true;
                    this.field143 = true;
                    this.field144 = false;
                    this.field108 = -1;
                    return true;
                }
                if (this.field108 == 93) {
                    if (this.field535 == 12) {
                        this.field134 = true;
                    }
                    this.field182 = this.field452.method292();
                    this.field108 = -1;
                    return true;
                }
                if (this.field108 == 167) {
                    this.field225 = false;
                    for (int var23 = 0; var23 < 5; ++var23) {
                        this.field255[var23] = false;
                    }
                    this.field108 = -1;
                    return true;
                }
                if (this.field108 == 100) {
                    for (int var24 = 0; var24 < this.field268.length; ++var24) {
                        if (this.field428[var24] != this.field268[var24]) {
                            this.field268[var24] = this.field428[var24];
                            this.method53(var24, 35758);
                            this.field134 = true;
                        }
                    }
                    this.field108 = -1;
                    return true;
                }
                if (this.field108 == 119) {
                    String var25 = this.field452.method299();
                    if (var25.endsWith(":tradereq:")) {
                        String var26 = var25.substring(0, var25.indexOf(":"));
                        long var27 = class44.method413(var26);
                        boolean var29 = false;
                        for (int var30 = 0; var30 < this.field548; ++var30) {
                            if (this.field140[var30] == var27) {
                                var29 = true;
                                break;
                            }
                        }
                        if (!var29 && this.field450 == 0) {
                            this.method139("wishes to trade with you.", true, 4, var26);
                        }
                    } else if (var25.endsWith(":duelreq:")) {
                        String var31 = var25.substring(0, var25.indexOf(":"));
                        long var32 = class44.method413(var31);
                        boolean var34 = false;
                        for (int var35 = 0; var35 < this.field548; ++var35) {
                            if (this.field140[var35] == var32) {
                                var34 = true;
                                break;
                            }
                        }
                        if (!var34 && this.field450 == 0) {
                            this.method139("wishes to duel with you.", true, 8, var31);
                        }
                    } else if (!var25.endsWith(":chalreq:")) {
                        this.method139(var25, true, 0, "");
                    } else {
                        String var36 = var25.substring(0, var25.indexOf(":"));
                        long var37 = class44.method413(var36);
                        boolean var39 = false;
                        for (int var40 = 0; var40 < this.field548; ++var40) {
                            if (this.field140[var40] == var37) {
                                var39 = true;
                                break;
                            }
                        }
                        if (!var39 && this.field450 == 0) {
                            String var41 = var25.substring(var25.indexOf(":") + 1, var25.length() - 9);
                            this.method139(var41, true, 8, var36);
                        }
                    }
                    this.field108 = -1;
                    return true;
                }
                if (this.field108 == 83) {
                    byte var42 = this.field452.method293();
                    int var43 = this.field452.method294();
                    this.field428[var43] = var42;
                    if (this.field268[var43] != var42) {
                        this.field268[var43] = var42;
                        this.method53(var43, 35758);
                        this.field134 = true;
                        if (this.field286 != -1) {
                            this.field256 = true;
                        }
                    }
                    this.field108 = -1;
                    return true;
                }
                if (this.field108 == 180) {
                    int var44 = this.field452.method320((byte) 1);
                    this.method122(this.field536, var44);
                    if (this.field511 != -1) {
                        this.field511 = -1;
                        this.field134 = true;
                        this.field143 = true;
                    }
                    this.field119 = var44;
                    this.field256 = true;
                    this.field112 = -1;
                    this.field144 = false;
                    this.field108 = -1;
                    return true;
                }
                if (this.field108 != 26 && this.field108 != 80) {
                    if (this.field108 == 128) {
                        int var95 = this.field452.method320((byte) 1);
                        int var96 = this.field452.method292();
                        if (var95 == 65535) {
                            var95 = -1;
                        }
                        this.field153[var96] = var95;
                        this.field134 = true;
                        this.field143 = true;
                        this.field108 = -1;
                        return true;
                    }
                    if (this.field108 == 218) {
                        int var97 = this.field452.method318((byte) 2);
                        this.method122(this.field536, var97);
                        if (this.field119 != -1) {
                            this.field119 = -1;
                            this.field256 = true;
                        }
                        if (this.field166 != 0) {
                            this.field166 = 0;
                            this.field256 = true;
                        }
                        this.field511 = var97;
                        this.field134 = true;
                        this.field143 = true;
                        this.field112 = -1;
                        this.field144 = false;
                        this.field108 = -1;
                        return true;
                    }
                    if (this.field108 == 210) {
                        this.method78((byte) 2, this.field452, this.field107);
                        this.field108 = -1;
                        return true;
                    }
                    if (this.field108 != 58) {
                        if (this.field108 == 27) {
                            this.field134 = true;
                            int var107 = this.field452.method294();
                            class61 var108 = class61.field1518[var107];
                            int var109 = this.field452.method294();
                            for (int var110 = 0; var110 < var109; ++var110) {
                                var108.field1504[var110] = this.field452.method319(-206);
                                int var111 = this.field452.method292();
                                if (var111 == 255) {
                                    var111 = this.field452.method326(5419);
                                }
                                var108.field1559[var110] = var111;
                            }
                            for (int var112 = var109; var112 < var108.field1504.length; ++var112) {
                                var108.field1504[var112] = 0;
                                var108.field1559[var112] = 0;
                            }
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 77) {
                            this.field210 = this.field452.method320((byte) 1) * 30;
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 183) {
                            int var113 = this.field452.method294();
                            int var114 = this.field452.method323(this.field146);
                            int var115 = this.field452.method322((byte) -55);
                            class61 var116 = class61.field1518[var113];
                            var116.field1520 = var114;
                            var116.field1514 = var115;
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 2) {
                            this.field235 = this.field452.method292();
                            if (this.field535 == this.field235) {
                                if (this.field235 == 3) {
                                    this.field535 = 1;
                                } else {
                                    this.field535 = 3;
                                }
                                this.field134 = true;
                            }
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 81) {
                            int var117 = this.field452.method318((byte) 2);
                            int var118 = this.field452.method294();
                            class61 var119 = class61.field1518[var118];
                            if (var119 != null && var119.field1537 == 0) {
                                if (var117 < 0) {
                                    var117 = 0;
                                }
                                if (var117 > var119.field1506 - var119.field1556) {
                                    var117 = var119.field1506 - var119.field1556;
                                }
                                var119.field1547 = var117;
                            }
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 129) {
                            this.field134 = true;
                            int var120 = this.field452.method294();
                            class61 var121 = class61.field1518[var120];
                            while (this.field452.field954 < this.field107) {
                                int var122 = this.field452.method306();
                                int var123 = this.field452.method294();
                                int var124 = this.field452.method292();
                                if (var124 == 255) {
                                    var124 = this.field452.method297();
                                }
                                if (var122 >= 0 && var122 < var121.field1504.length) {
                                    var121.field1504[var122] = var123;
                                    var121.field1559[var122] = var124;
                                }
                            }
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 169) {
                            this.field548 = this.field107 / 8;
                            for (int var125 = 0; var125 < this.field548; ++var125) {
                                this.field140[var125] = this.field452.method298(3);
                            }
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 137) {
                            if (this.field511 != -1) {
                                this.field511 = -1;
                                this.field134 = true;
                                this.field143 = true;
                            }
                            if (this.field119 != -1) {
                                this.field119 = -1;
                                this.field256 = true;
                            }
                            if (this.field166 != 0) {
                                this.field166 = 0;
                                this.field256 = true;
                            }
                            this.field112 = -1;
                            this.field144 = false;
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 160) {
                            this.field300 = this.field452.method292();
                            this.field134 = true;
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 101) {
                            for (int var126 = 0; var126 < this.field415.length; ++var126) {
                                if (this.field415[var126] != null) {
                                    this.field415[var126].field808 = -1;
                                }
                            }
                            for (int var127 = 0; var127 < this.field160.length; ++var127) {
                                if (this.field160[var127] != null) {
                                    this.field160[var127].field808 = -1;
                                }
                            }
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 97) {
                            int var128 = this.field452.method295();
                            int var129 = this.field452.method318((byte) 2);
                            class61 var130 = class61.field1518[var129];
                            var130.field1527 = var128;
                            if (var128 == -1) {
                                var130.field1536 = 0;
                                var130.field1539 = 0;
                            }
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 123) {
                            int var131 = this.field452.method292();
                            int var132 = this.field452.method292();
                            int var133 = this.field452.method292();
                            int var134 = this.field452.method292();
                            this.field255[var131] = true;
                            this.field434[var131] = var132;
                            this.field526[var131] = var133;
                            this.field338[var131] = var134;
                            this.field316[var131] = 0;
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 75) {
                            int var135 = this.field452.method320((byte) 1);
                            int var136 = this.field452.method318((byte) 2);
                            int var137 = this.field452.method294();
                            if (var137 == 65535) {
                                class61.field1518[var136].field1566 = 0;
                                this.field108 = -1;
                                return true;
                            }
                            class45 var138 = class45.method428(var137);
                            class61.field1518[var136].field1566 = 4;
                            class61.field1518[var136].field1567 = var137;
                            class61.field1518[var136].field1516 = var138.field1210;
                            class61.field1518[var136].field1517 = var138.field1189;
                            class61.field1518[var136].field1515 = var138.field1231 * 100 / var135;
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 206) {
                            this.field535 = this.field452.method292();
                            this.field134 = true;
                            this.field143 = true;
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 203) {
                            if (this.field535 == 12) {
                                this.field134 = true;
                            }
                            this.field247 = this.field452.method295();
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 171) {
                            this.field487 = this.field452.method292();
                            if (this.field487 == 1) {
                                this.field83 = this.field452.method294();
                            }
                            if (this.field487 >= 2 && this.field487 <= 6) {
                                if (this.field487 == 2) {
                                    this.field297 = 64;
                                    this.field298 = 64;
                                }
                                if (this.field487 == 3) {
                                    this.field297 = 0;
                                    this.field298 = 64;
                                }
                                if (this.field487 == 4) {
                                    this.field297 = 128;
                                    this.field298 = 64;
                                }
                                if (this.field487 == 5) {
                                    this.field297 = 64;
                                    this.field298 = 0;
                                }
                                if (this.field487 == 6) {
                                    this.field297 = 64;
                                    this.field298 = 128;
                                }
                                this.field487 = 2;
                                this.field294 = this.field452.method294();
                                this.field295 = this.field452.method294();
                                this.field296 = this.field452.method292();
                            }
                            if (this.field487 == 10) {
                                this.field359 = this.field452.method294();
                            }
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 53) {
                            this.field86 = this.field452.method310(46155);
                            this.field122 = this.field452.method320((byte) 1);
                            this.field270 = this.field452.method310(46155);
                            this.field512 = this.field452.method297();
                            this.field377 = this.field452.method319(-206);
                            if (this.field512 != 0 && this.field112 == -1) {
                                signlink.dnslookup(class44.method416((byte) -74, this.field512));
                                this.method142(938);
                                short var139 = 650;
                                if (this.field270 != 201 || this.field86 == 1) {
                                    var139 = 655;
                                }
                                this.field509 = "";
                                this.field289 = false;
                                for (int var140 = 0; var140 < class61.field1518.length; ++var140) {
                                    if (class61.field1518[var140] != null && class61.field1518[var140].field1512 == var139) {
                                        this.field112 = class61.field1518[var140].field1541;
                                        break;
                                    }
                                }
                            }
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 184) {
                            int var141 = this.field452.method294();
                            String var142 = this.field452.method299();
                            class61.field1518[var141].field1522 = var142;
                            if (this.field153[this.field535] == class61.field1518[var141].field1541) {
                                this.field134 = true;
                            }
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 71) {
                            int var143 = this.field452.method318((byte) 2);
                            int var144 = this.field452.method320((byte) 1);
                            class61.field1518[var143].field1566 = 2;
                            class61.field1518[var143].field1567 = var144;
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 49) {
                            this.method171(-308);
                            this.field108 = -1;
                            return false;
                        }
                        if (this.field108 == 139) {
                            long var145 = this.field452.method298(3);
                            int var147 = this.field452.method292();
                            String var148 = class44.method417((byte) 97, class44.method414((byte) 9, var145));
                            for (int var149 = 0; var149 < this.field299; ++var149) {
                                if (this.field547[var149] == var145) {
                                    if (this.field175[var149] != var147) {
                                        this.field175[var149] = var147;
                                        this.field134 = true;
                                        if (var147 > 0) {
                                            this.method139(var148 + " has logged in.", true, 5, "");
                                        }
                                        if (var147 == 0) {
                                            this.method139(var148 + " has logged out.", true, 5, "");
                                        }
                                    }
                                    var148 = null;
                                    break;
                                }
                            }
                            if (var148 != null && this.field299 < 200) {
                                this.field547[this.field299] = var145;
                                this.field135[this.field299] = var148;
                                this.field175[this.field299] = var147;
                                ++this.field299;
                                this.field134 = true;
                            }
                            boolean var150 = false;
                            while (!var150) {
                                var150 = true;
                                for (int var151 = 0; var151 < this.field299 - 1; ++var151) {
                                    if (this.field175[var151] != field389 && this.field175[var151 + 1] == field389 || this.field175[var151] == 0 && this.field175[var151 + 1] != 0) {
                                        int var152 = this.field175[var151];
                                        this.field175[var151] = this.field175[var151 + 1];
                                        this.field175[var151 + 1] = var152;
                                        String var153 = this.field135[var151];
                                        this.field135[var151] = this.field135[var151 + 1];
                                        this.field135[var151 + 1] = var153;
                                        long var154 = this.field547[var151];
                                        this.field547[var151] = this.field547[var151 + 1];
                                        this.field547[var151 + 1] = var154;
                                        this.field134 = true;
                                        var150 = false;
                                    }
                                }
                            }
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 246) {
                            this.field106 = this.field452.method310(46155);
                            this.field105 = this.field452.method310(46155);
                            while (this.field452.field954 < this.field107) {
                                int var156 = this.field452.method292();
                                this.method159(43111, var156, this.field452);
                            }
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 78) {
                            this.field225 = true;
                            this.field241 = this.field452.method292();
                            this.field242 = this.field452.method292();
                            this.field243 = this.field452.method294();
                            this.field244 = this.field452.method292();
                            this.field245 = this.field452.method292();
                            if (this.field245 >= 100) {
                                this.field307 = this.field241 * 128 + 64;
                                this.field309 = this.field242 * 128 + 64;
                                this.field308 = this.method114(this.field360, this.field309, (byte) 64, this.field307) - this.field243;
                            }
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 90) {
                            this.method64(7, this.field452, this.field107);
                            this.field485 = false;
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 21) {
                            this.field105 = this.field452.method312(0);
                            this.field106 = this.field452.method312(0);
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 146) {
                            int var157 = this.field452.method319(-206);
                            class61.field1518[var157].field1566 = 3;
                            if (field90.field763 == null) {
                                class61.field1518[var157].field1567 = (field90.field786[11] << 5) + (field90.field786[8] << 10) + (field90.field786[0] << 15) + (field90.field759[0] << 25) + (field90.field759[4] << 20) + field90.field786[1];
                            } else {
                                class61.field1518[var157].field1567 = (int) (field90.field763.field66 + 305419896L);
                            }
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 28 || this.field108 == 85 || this.field108 == 186 || this.field108 == 87 || this.field108 == 0 || this.field108 == 107 || this.field108 == 150 || this.field108 == 219 || this.field108 == 254 || this.field108 == 54 || this.field108 == 245) {
                            this.method159(43111, this.field108, this.field452);
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 5) {
                            int var158 = this.field452.method318((byte) 2);
                            if (var158 == 65535) {
                                var158 = -1;
                            }
                            if (this.field401 != var158 && this.field192 && !field392 && this.field313 == 0) {
                                this.field465 = var158;
                                this.field466 = true;
                                this.field217.method229(2, this.field465);
                            }
                            this.field401 = var158;
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 44) {
                            int var159 = this.field452.method320((byte) 1);
                            int var160 = this.field452.method318((byte) 2);
                            if (this.field192 && !field392) {
                                this.field465 = var160;
                                this.field466 = false;
                                this.field217.method229(2, this.field465);
                                this.field313 = var159;
                            }
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 102) {
                            int var161 = this.field452.method318((byte) 2);
                            this.method122(this.field536, var161);
                            if (this.field511 != -1) {
                                this.field511 = -1;
                                this.field134 = true;
                                this.field143 = true;
                            }
                            if (this.field119 != -1) {
                                this.field119 = -1;
                                this.field256 = true;
                            }
                            if (this.field166 != 0) {
                                this.field166 = 0;
                                this.field256 = true;
                            }
                            this.field112 = var161;
                            this.field144 = false;
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 36) {
                            int var162 = this.field452.method294();
                            int var163 = this.field452.method292();
                            int var164 = this.field452.method294();
                            if (this.field358 && !field392 && this.field461 < 50) {
                                this.field364[this.field461] = var162;
                                this.field331[this.field461] = var163;
                                this.field330[this.field461] = class25.field867[var162] + var164;
                                ++this.field461;
                            }
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 7) {
                            this.field365 = false;
                            this.field166 = 1;
                            this.field130 = "";
                            this.field256 = true;
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 189) {
                            int var165 = this.field452.method294();
                            int var166 = this.field452.method320((byte) 1);
                            int var167 = var165 >> 10 & 31;
                            int var168 = var165 >> 5 & 31;
                            int var169 = var165 & 31;
                            class61.field1518[var166].field1563 = (var169 << 3) + (var167 << 19) + (var168 << 11);
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 126) {
                            int var170 = this.field452.method294();
                            boolean var171 = this.field452.method292() == 1;
                            class61.field1518[var170].field1550 = var171;
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 43) {
                            this.field106 = this.field452.method310(46155);
                            this.field105 = this.field452.method312(0);
                            for (int var172 = this.field105; var172 < this.field105 + 8; ++var172) {
                                for (int var173 = this.field106; var173 < this.field106 + 8; ++var173) {
                                    if (this.field521[this.field360][var172][var173] != null) {
                                        this.field521[this.field360][var172][var173] = null;
                                        this.method133(var172, var173);
                                    }
                                }
                            }
                            for (class34 var174 = (class34) this.field336.method482(); var174 != null; var174 = (class34) this.field336.method484(this.field493)) {
                                if (var174.field973 >= this.field105 && var174.field973 < this.field105 + 8 && var174.field974 >= this.field106 && var174.field974 < this.field106 + 8 && this.field360 == var174.field971) {
                                    var174.field967 = 0;
                                }
                            }
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 98) {
                            this.field322 = 0;
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 13) {
                            int var175 = this.field452.method325(2);
                            int var176 = this.field452.method294();
                            this.field428[var176] = var175;
                            if (this.field268[var176] != var175) {
                                this.field268[var176] = var175;
                                this.method53(var176, 35758);
                                this.field134 = true;
                                if (this.field286 != -1) {
                                    this.field256 = true;
                                }
                            }
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 178) {
                            int var177 = this.field452.method321((byte) 104);
                            if (var177 >= 0) {
                                this.method122(this.field536, var177);
                            }
                            this.field427 = var177;
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 99) {
                            int var178 = this.field452.method321((byte) 104);
                            this.field286 = var178;
                            this.field256 = true;
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 154) {
                            this.field97 = this.field452.method292();
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 111) {
                            int var179 = this.field452.method318((byte) 2);
                            int var180 = this.field452.method318((byte) 2);
                            class61.field1518[var180].field1566 = 1;
                            class61.field1518[var180].field1567 = var179;
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 144) {
                            this.field514 = this.field452.method292();
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 121) {
                            this.field301 = this.field452.method294();
                            this.field317 = this.field452.method311((byte) -93);
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 168) {
                            this.field365 = false;
                            this.field166 = 2;
                            this.field130 = "";
                            this.field256 = true;
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 230) {
                            this.field194 = this.field452.method292();
                            this.field228 = this.field452.method292();
                            this.field258 = this.field452.method292();
                            this.field315 = true;
                            this.field256 = true;
                            this.field108 = -1;
                            return true;
                        }
                        if (this.field108 == 241) {
                            int var181 = this.field452.method294();
                            class61 var182 = class61.field1518[var181];
                            for (int var183 = 0; var183 < var182.field1504.length; ++var183) {
                                var182.field1504[var183] = -1;
                                var182.field1504[var183] = 0;
                            }
                            this.field108 = -1;
                            return true;
                        }
                        signlink.reporterror("T1 - " + this.field108 + "," + this.field107 + " - " + this.field542 + "," + this.field543);
                        this.method171(-308);
                        return true;
                    }
                    long var98 = this.field452.method298(3);
                    int var100 = this.field452.method297();
                    int var101 = this.field452.method292();
                    boolean var102 = false;
                    for (int var103 = 0; var103 < 100; ++var103) {
                        if (this.field423[var103] == var100) {
                            var102 = true;
                            break;
                        }
                    }
                    if (var101 <= 1) {
                        for (int var104 = 0; var104 < this.field548; ++var104) {
                            if (this.field140[var104] == var98) {
                                var102 = true;
                                break;
                            }
                        }
                    }
                    if (!var102 && this.field450 == 0) {
                        try {
                            this.field423[this.field272] = var100;
                            this.field272 = (this.field272 + 1) % 100;
                            String var105 = class4.method21(this.field452, 534, this.field107 - 13);
                            if (var101 != 3) {
                                var105 = class36.method369(var105, this.field395);
                            }
                            if (var101 != 2 && var101 != 3) {
                                if (var101 == 1) {
                                    this.method139(var105, true, 7, "@cr1@" + class44.method417((byte) 97, class44.method414((byte) 9, var98)));
                                } else {
                                    this.method139(var105, true, 3, class44.method417((byte) 97, class44.method414((byte) 9, var98)));
                                }
                            } else {
                                this.method139(var105, true, 7, "@cr2@" + class44.method417((byte) 97, class44.method414((byte) 9, var98)));
                            }
                        } catch (Exception var187) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field108 = -1;
                    return true;
                }
                int var45 = this.field180;
                int var46 = this.field181;
                if (this.field108 == 26) {
                    var46 = this.field452.method318((byte) 2);
                    var45 = this.field452.method294();
                    this.field103 = false;
                }
                if (this.field108 == 80) {
                    var46 = this.field452.method294();
                    this.field452.method302(false);
                    int var47 = 0;
                    while (true) {
                        if (var47 >= 4) {
                            this.field452.method304(8);
                            var45 = this.field452.method319(-206);
                            this.field103 = true;
                            break;
                        }
                        for (int var48 = 0; var48 < 13; ++var48) {
                            for (int var49 = 0; var49 < 13; ++var49) {
                                int var50 = this.field452.method303((byte) 8, 1);
                                if (var50 == 1) {
                                    this.field459[var47][var48][var49] = this.field452.method303((byte) 8, 26);
                                } else {
                                    this.field459[var47][var48][var49] = -1;
                                }
                            }
                        }
                        ++var47;
                    }
                }
                if (this.field180 == var45 && this.field181 == var46 && this.field319 == 2) {
                    this.field108 = -1;
                    return true;
                }
                this.field180 = var45;
                this.field181 = var46;
                this.field148 = (this.field180 - 6) * 8;
                this.field149 = (this.field181 - 6) * 8;
                this.field355 = false;
                if ((this.field180 / 8 == 48 || this.field180 / 8 == 49) && this.field181 / 8 == 48) {
                    this.field355 = true;
                }
                if (this.field180 / 8 == 48 && this.field181 / 8 == 148) {
                    this.field355 = true;
                }
                this.field319 = 1;
                this.field100 = System.currentTimeMillis();
                this.field188.method13((byte) -36);
                this.field538.method573("Loading - please wait.", 151, 257, -193, 0);
                this.field538.method573("Loading - please wait.", 150, 256, -193, 16777215);
                this.field188.method14(super.field578, 4, 4, 0);
                if (this.field108 == 26) {
                    int var51 = 0;
                    int var52 = (this.field180 - 6) / 8;
                    label1117: while (true) {
                        if (var52 > (this.field180 + 6) / 8) {
                            this.field411 = new byte[var51][];
                            this.field236 = new byte[var51][];
                            this.field349 = new int[var51];
                            this.field350 = new int[var51];
                            this.field351 = new int[var51];
                            int var54 = 0;
                            int var55 = (this.field180 - 6) / 8;
                            while (true) {
                                if (var55 > (this.field180 + 6) / 8) {
                                    break label1117;
                                }
                                for (int var56 = (this.field181 - 6) / 8; var56 <= (this.field181 + 6) / 8; ++var56) {
                                    this.field349[var54] = (var55 << 8) + var56;
                                    if (!this.field355 || var56 != 49 && var56 != 149 && var56 != 147 && var55 != 50 && (var55 != 49 || var56 != 47)) {
                                        int var57 = this.field350[var54] = this.field217.method236(0, var55, true, var56);
                                        if (var57 != -1) {
                                            this.field217.method229(3, var57);
                                        }
                                        int var58 = this.field351[var54] = this.field217.method236(1, var55, true, var56);
                                        if (var58 != -1) {
                                            this.field217.method229(3, var58);
                                        }
                                        ++var54;
                                    } else {
                                        this.field350[var54] = -1;
                                        this.field351[var54] = -1;
                                        ++var54;
                                    }
                                }
                                ++var55;
                            }
                        }
                        for (int var53 = (this.field181 - 6) / 8; var53 <= (this.field181 + 6) / 8; ++var53) {
                            ++var51;
                        }
                        ++var52;
                    }
                }
                if (this.field108 == 80) {
                    int var59 = 0;
                    int[] var60 = new int[676];
                    int var61 = 0;
                    label1076: while (true) {
                        if (var61 >= 4) {
                            this.field411 = new byte[var59][];
                            this.field236 = new byte[var59][];
                            this.field349 = new int[var59];
                            this.field350 = new int[var59];
                            this.field351 = new int[var59];
                            int var69 = 0;
                            while (true) {
                                if (var69 >= var59) {
                                    break label1076;
                                }
                                int var70 = this.field349[var69] = var60[var69];
                                int var71 = var70 >> 8 & 255;
                                int var72 = var70 & 255;
                                int var73 = this.field350[var69] = this.field217.method236(0, var71, true, var72);
                                if (var73 != -1) {
                                    this.field217.method229(3, var73);
                                }
                                int var74 = this.field351[var69] = this.field217.method236(1, var71, true, var72);
                                if (var74 != -1) {
                                    this.field217.method229(3, var74);
                                }
                                ++var69;
                            }
                        }
                        for (int var62 = 0; var62 < 13; ++var62) {
                            for (int var63 = 0; var63 < 13; ++var63) {
                                int var64 = this.field459[var61][var62][var63];
                                if (var64 != -1) {
                                    int var65 = var64 >> 14 & 1023;
                                    int var66 = var64 >> 3 & 2047;
                                    int var67 = (var65 / 8 << 8) + var66 / 8;
                                    for (int var68 = 0; var68 < var59; ++var68) {
                                        if (var60[var68] == var67) {
                                            var67 = -1;
                                            break;
                                        }
                                    }
                                    if (var67 != -1) {
                                        var60[var59++] = var67;
                                    }
                                }
                            }
                        }
                        ++var61;
                    }
                }
                int var75 = this.field148 - this.field150;
                int var76 = this.field149 - this.field151;
                this.field150 = this.field148;
                this.field151 = this.field149;
                for (int var77 = 0; var77 < 16384; ++var77) {
                    class43 var78 = this.field160[var77];
                    if (var78 != null) {
                        for (int var79 = 0; var79 < 10; ++var79) {
                            var78.field855[var79] -= var75;
                            var78.field856[var79] -= var76;
                        }
                        var78.field815 -= var75 * 128;
                        var78.field816 -= var76 * 128;
                    }
                }
                for (int var80 = 0; var80 < this.field413; ++var80) {
                    class21 var81 = this.field415[var80];
                    if (var81 != null) {
                        for (int var82 = 0; var82 < 10; ++var82) {
                            var81.field855[var82] -= var75;
                            var81.field856[var82] -= var76;
                        }
                        var81.field815 -= var75 * 128;
                        var81.field816 -= var76 * 128;
                    }
                }
                this.field485 = true;
                byte var83 = 0;
                byte var84 = 104;
                byte var85 = 1;
                if (var75 < 0) {
                    var83 = 103;
                    var84 = -1;
                    var85 = -1;
                }
                byte var86 = 0;
                byte var87 = 104;
                byte var88 = 1;
                if (var76 < 0) {
                    var86 = 103;
                    var87 = -1;
                    var88 = -1;
                }
                for (int var89 = var83; var84 != var89; var89 += var85) {
                    for (int var90 = var86; var87 != var90; var90 += var88) {
                        int var91 = var75 + var89;
                        int var92 = var76 + var90;
                        for (int var93 = 0; var93 < 4; ++var93) {
                            if (var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104) {
                                this.field521[var93][var89][var90] = this.field521[var93][var91][var92];
                            } else {
                                this.field521[var93][var89][var90] = null;
                            }
                        }
                    }
                }
                for (class34 var94 = (class34) this.field336.method482(); var94 != null; var94 = (class34) this.field336.method484(this.field493)) {
                    var94.field973 -= var75;
                    var94.field974 -= var76;
                    if (var94.field973 < 0 || var94.field974 < 0 || var94.field973 >= 104 || var94.field974 >= 104) {
                        var94.method397();
                    }
                }
                if (this.field322 != 0) {
                    this.field322 -= var75;
                    this.field323 -= var76;
                }
                this.field225 = false;
                this.field108 = -1;
                return true;
            } catch (IOException var188) {
                this.method68(true);
            } catch (Exception var189) {
                String var185 = "T2 - " + this.field108 + "," + this.field542 + "," + this.field543 + " - " + this.field107 + "," + (field90.field855[0] + this.field148) + "," + (field90.field856[0] + this.field149) + " - ";
                for (int var186 = 0; var186 < this.field107 && var186 < 50; ++var186) {
                    var185 = var185 + this.field452.field953[var186] + ",";
                }
                signlink.reporterror(var185);
                this.method171(-308);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLMUKVLYLC;I)V")
    private final void method78(byte arg0, class33 arg1, int arg2) {
        if (arg0 != 2) {
            this.field551 = !this.field551;
        }
        this.field475 = 0;
        this.field418 = 0;
        this.method50(this.field314, arg1, arg2);
        this.method156(135, arg2, arg1);
        this.method106(arg2, (byte) 4, arg1);
        for (int var4 = 0; var4 < this.field475; ++var4) {
            int var6 = this.field476[var4];
            if (field237 != this.field160[var6].field844) {
                this.field160[var6].field1177 = null;
                this.field160[var6] = null;
            }
        }
        if (arg1.field954 != arg2) {
            signlink.reporterror(this.field455 + " size mismatch in getnpcpos - pos:" + arg1.field954 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field161; ++var5) {
                if (this.field160[this.field162[var5]] == null) {
                    signlink.reporterror(this.field455 + " null entry in npc list - pos:" + var5 + " size:" + this.field161);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public final void method79(int arg0, String arg1, int arg2) {
        this.field550 = arg2;
        if (arg0 < 3 || arg0 > 3) {
            this.field108 = -1;
        }
        this.field219 = arg1;
        this.method151(-16108);
        if (this.field218 == null) {
            super.method79(3, arg1, arg2);
        } else {
            this.field197.method13((byte) -36);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field539.method573("RuneScape is loading - please wait...", var5 / 2 - 26 - var6, var4 / 2, -193, 16777215);
            int var7 = var5 / 2 - 18 - var6;
            class1.method7(var4 / 2 - 152, var7, 9179409, 304, 0, 34);
            class1.method7(var4 / 2 - 151, var7 + 1, 0, 302, 0, 32);
            class1.method6(arg2 * 3, 30, var7 + 2, -19550, 9179409, var4 / 2 - 150);
            class1.method6(300 - arg2 * 3, 30, var7 + 2, -19550, 0, arg2 * 3 + (var4 / 2 - 150));
            this.field539.method573(arg1, var5 / 2 + 5 - var6, var4 / 2, -193, 16777215);
            this.field197.method14(super.field578, 202, 171, 0);
            if (this.field96) {
                this.field96 = false;
                if (!this.field506) {
                    this.field198.method14(super.field578, 0, 0, 0);
                    this.field199.method14(super.field578, 637, 0, 0);
                }
                this.field195.method14(super.field578, 128, 0, 0);
                this.field196.method14(super.field578, 202, 371, 0);
                this.field200.method14(super.field578, 0, 265, 0);
                this.field201.method14(super.field578, 562, 265, 0);
                this.field202.method14(super.field578, 128, 171, 0);
                this.field203.method14(super.field578, 562, 171, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method80(boolean arg0) {
        if (this.field169 == 0) {
            this.field246[0] = "Cancel";
            this.field499[0] = 1078;
            this.field341 = 1;
            this.method46(this.field337);
            this.field320 = 0;
            if (super.field586 > 4 && super.field587 > 4 && super.field586 < 516 && super.field587 < 338) {
                if (this.field112 != -1) {
                    this.method99(4, class61.field1518[this.field112], super.field586, 4, 0, (byte) 9, super.field587);
                } else {
                    this.method164(false);
                }
            }
            if (this.field320 != this.field261) {
                this.field261 = this.field320;
            }
            this.field320 = 0;
            if (super.field586 > 553 && super.field587 > 205 && super.field586 < 743 && super.field587 < 466) {
                if (this.field511 != -1) {
                    this.method99(205, class61.field1518[this.field511], super.field586, 553, 0, (byte) 9, super.field587);
                } else if (this.field153[this.field535] != -1) {
                    this.method99(205, class61.field1518[this.field153[this.field535]], super.field586, 553, 0, (byte) 9, super.field587);
                }
            }
            if (this.field433 != this.field320) {
                this.field134 = true;
                this.field433 = this.field320;
            }
            this.field320 = 0;
            this.field137 &= arg0;
            if (super.field586 > 17 && super.field587 > 357 && super.field586 < 496 && super.field587 < 453) {
                if (this.field119 != -1) {
                    this.method99(357, class61.field1518[this.field119], super.field586, 17, 0, (byte) 9, super.field587);
                } else if (super.field587 < 434 && super.field586 < 426) {
                    this.method146(super.field587 - 357, 0, super.field586 - 17);
                }
            }
            if (this.field119 != -1 && this.field320 != this.field292) {
                this.field256 = true;
                this.field292 = this.field320;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field341 - 1; ++var3) {
                    if (this.field499[var3] < 1000 && this.field499[var3 + 1] > 1000) {
                        String var4 = this.field246[var3];
                        this.field246[var3] = this.field246[var3 + 1];
                        this.field246[var3 + 1] = var4;
                        int var5 = this.field499[var3];
                        this.field499[var3] = this.field499[var3 + 1];
                        this.field499[var3 + 1] = var5;
                        int var6 = this.field497[var3];
                        this.field497[var3] = this.field497[var3 + 1];
                        this.field497[var3 + 1] = var6;
                        int var7 = this.field498[var3];
                        this.field498[var3] = this.field498[var3 + 1];
                        this.field498[var3 + 1] = var7;
                        int var8 = this.field500[var3];
                        this.field500[var3] = this.field500[var3 + 1];
                        this.field500[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZ)Z")
    public final boolean method81(int arg0, int arg1, boolean arg2) {
        boolean var4 = false;
        class61 var5 = class61.field1518[arg1];
        for (int var6 = 0; var6 < var5.field1529.length && var5.field1529[var6] != -1; ++var6) {
            class61 var7 = class61.field1518[var5.field1529[var6]];
            if (var7.field1537 == 1) {
                var4 |= this.method81(arg0, var7.field1519, true);
            }
            if (var7.field1537 == 6 && (var7.field1527 != -1 || var7.field1528 != -1)) {
                boolean var8 = this.method148((byte) 9, var7);
                int var9;
                if (var8) {
                    var9 = var7.field1528;
                } else {
                    var9 = var7.field1527;
                }
                if (var9 != -1) {
                    class58 var10 = class58.field1453[var9];
                    var7.field1539 += arg0;
                    while (var7.field1539 > var10.method493(var7.field1536, (byte) 2)) {
                        var7.field1539 -= var10.method493(var7.field1536, (byte) 2) + 1;
                        ++var7.field1536;
                        if (var7.field1536 >= var10.field1454) {
                            var7.field1536 -= var10.field1458;
                            if (var7.field1536 < 0 || var7.field1536 >= var10.field1454) {
                                var7.field1536 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        this.field137 &= arg2;
        return var4;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method82(String arg0, byte arg1) {
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field299; ++var3) {
                if (arg0.equalsIgnoreCase(this.field135[var3])) {
                    return true;
                }
            }
            if (arg1 != 0) {
                this.field108 = -1;
            }
            return arg0.equalsIgnoreCase(field90.field774);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method83(boolean arg0) {
        this.field137 &= arg0;
        for (int var2 = 0; var2 < this.field461; ++var2) {
            if (this.field330[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field364[var2] == this.field174 && this.field331[var2] == this.field421) {
                        if (!this.method117((byte) 1)) {
                            var3 = true;
                        }
                    } else {
                        class33 var4 = class25.method255(this.field424, this.field331[var2], this.field364[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field954 / 22) > (long) (this.field138 / 22) + this.field193) {
                            this.field138 = var4.field954;
                            this.field193 = System.currentTimeMillis();
                            if (this.method124(var4.field953, 0, var4.field954)) {
                                this.field174 = this.field364[var2];
                                this.field421 = this.field331[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field330[var2] != -5) {
                    this.field330[var2] = -5;
                } else {
                    --this.field461;
                    for (int var6 = var2; var6 < this.field461; ++var6) {
                        this.field364[var6] = this.field364[var6 + 1];
                        this.field331[var6] = this.field331[var6 + 1];
                        this.field330[var6] = this.field330[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field330[var2]--;
            }
        }
        if (this.field313 > 0) {
            this.field313 -= 20;
            if (this.field313 < 0) {
                this.field313 = 0;
            }
            if (this.field313 == 0 && this.field192 && !field392) {
                this.field465 = this.field401;
                this.field466 = true;
                this.field217.method229(2, this.field465);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZLMUKVLYLC;I)V")
    private final void method84(boolean arg0, class33 arg1, int arg2) {
        arg1.method302(false);
        if (!arg0) {
            this.field108 = arg1.method292();
        }
        int var4 = arg1.method303((byte) 8, 1);
        if (var4 != 0) {
            int var5 = arg1.method303((byte) 8, 2);
            if (var5 == 0) {
                this.field419[this.field418++] = this.field414;
            } else if (var5 == 1) {
                int var6 = arg1.method303((byte) 8, 3);
                field90.method247(var6, false, -634);
                int var7 = arg1.method303((byte) 8, 1);
                if (var7 == 1) {
                    this.field419[this.field418++] = this.field414;
                }
            } else if (var5 == 2) {
                int var8 = arg1.method303((byte) 8, 3);
                field90.method247(var8, true, -634);
                int var9 = arg1.method303((byte) 8, 3);
                field90.method247(var9, true, -634);
                int var10 = arg1.method303((byte) 8, 1);
                if (var10 == 1) {
                    this.field419[this.field418++] = this.field414;
                }
            } else if (var5 == 3) {
                int var11 = arg1.method303((byte) 8, 7);
                int var12 = arg1.method303((byte) 8, 1);
                int var13 = arg1.method303((byte) 8, 7);
                int var14 = arg1.method303((byte) 8, 1);
                if (var14 == 1) {
                    this.field419[this.field418++] = this.field414;
                }
                this.field360 = arg1.method303((byte) 8, 2);
                field90.method245(var11, var12 == 1, false, var13);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field367.method535(arg4, arg5, arg3);
        if (var7 != 0) {
            int var8 = this.field367.method539(arg4, arg5, arg3, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg1;
            if (var7 > 0) {
                var11 = arg2;
            }
            int[] var12 = this.field324.field633;
            int var13 = (103 - arg3) * 512 * 4 + arg5 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class42 var15 = class42.method405(var14);
            if (var15.field1170 != -1) {
                class59 var16 = this.field185[var15.field1170];
                if (var16 != null) {
                    int var17 = (var15.field1134 * 4 - var16.field1476) / 2;
                    int var18 = (var15.field1166 * 4 - var16.field1477) / 2;
                    var16.method500(arg5 * 4 + 48 + var17, this.field408, (104 - arg3 - var15.field1166) * 4 + 48 + var18);
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
        int var19 = this.field367.method537(arg4, arg5, arg3);
        if (arg0 != 0) {
            this.field521 = null;
        }
        if (var19 != 0) {
            int var20 = this.field367.method539(arg4, arg5, arg3, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class42 var24 = class42.method405(var23);
            if (var24.field1170 != -1) {
                class59 var25 = this.field185[var24.field1170];
                if (var25 != null) {
                    int var26 = (var24.field1134 * 4 - var25.field1476) / 2;
                    int var27 = (var24.field1166 * 4 - var25.field1477) / 2;
                    var25.method500(arg5 * 4 + 48 + var26, this.field408, (104 - arg3 - var24.field1166) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field324.field633;
                int var30 = (103 - arg3) * 512 * 4 + arg5 * 4 + 24624;
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
        int var31 = this.field367.method538(arg4, arg5, arg3);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class42 var33 = class42.method405(var32);
            if (var33.field1170 != -1) {
                class59 var34 = this.field185[var33.field1170];
                if (var34 != null) {
                    int var35 = (var33.field1134 * 4 - var34.field1476) / 2;
                    int var36 = (var33.field1166 * 4 - var34.field1477) / 2;
                    var34.method500(arg5 * 4 + 48 + var35, this.field408, (104 - arg3 - var33.field1166) * 4 + 48 + var36);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field581 != null) {
                    return new URL("http://127.0.0.1:" + (field390 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method86(int arg0) {
        if (arg0 != 0) {
            this.field521 = null;
        }
        if (this.field210 > 1) {
            --this.field210;
        }
        if (this.field111 > 0) {
            --this.field111;
        }
        for (int var2 = 0; var2 < 5 && this.method77(-631); ++var2) {
        }
        if (this.field137) {
            Object var3 = this.field267.field1728;
            synchronized (this.field267.field1728) {
                if (!field522) {
                    this.field267.field1730 = 0;
                } else if (super.field592 != 0 || this.field267.field1730 >= 40) {
                    this.field306.method281(127, this.field549);
                    this.field306.method282(0);
                    int var4 = this.field306.field954;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field267.field1730 && var4 - this.field306.field954 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field267.field1724[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field267.field1727[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field267.field1724[var6] == -1 && this.field267.field1727[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field239 == var8 && this.field240 == var7) {
                            if (this.field440 < 2047) {
                                ++this.field440;
                            }
                        } else {
                            int var10 = var8 - this.field239;
                            this.field239 = var8;
                            int var11 = var7 - this.field240;
                            this.field240 = var7;
                            if (this.field440 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field306.method283((this.field440 << 12) + (var10 << 6) + var11);
                                this.field440 = 0;
                            } else if (this.field440 < 8) {
                                this.field306.method285((this.field440 << 19) + 8388608 + var9);
                                this.field440 = 0;
                            } else {
                                this.field306.method286((this.field440 << 19) + -1073741824 + var9);
                                this.field440 = 0;
                            }
                        }
                    }
                    this.field306.method291(this.field306.field954 - var4, 960);
                    if (var5 >= this.field267.field1730) {
                        this.field267.field1730 = 0;
                    } else {
                        this.field267.field1730 -= var5;
                        for (int var12 = 0; var12 < this.field267.field1730; ++var12) {
                            this.field267.field1727[var12] = this.field267.field1727[var5 + var12];
                            this.field267.field1724[var12] = this.field267.field1724[var5 + var12];
                        }
                    }
                }
            }
            if (super.field592 != 0) {
                long var13 = (super.field595 - this.field399) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field399 = super.field595;
                int var15 = super.field594;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field593;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field592 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field306.method281(150, this.field549);
                this.field306.method324((var18 << 19) + (var19 << 20) + var17, this.field92);
            }
            if (this.field128 > 0) {
                --this.field128;
            }
            if (super.field596[1] == 1 || super.field596[2] == 1 || super.field596[3] == 1 || super.field596[4] == 1) {
                this.field129 = true;
            }
            if (this.field129 && this.field128 <= 0) {
                this.field128 = 20;
                this.field129 = false;
                this.field306.method281(16, this.field549);
                this.field306.method317(this.field373, (byte) -34);
                this.field306.method283(this.field374);
            }
            if (super.field583 && !this.field328) {
                this.field328 = true;
                this.field306.method281(10, this.field549);
                this.field306.method282(1);
            }
            if (!super.field583 && this.field328) {
                this.field328 = false;
                this.field306.method281(10, this.field549);
                this.field306.method282(0);
            }
            this.method35(false);
            this.method37(this.field101);
            this.method83(true);
            ++this.field109;
            if (this.field109 > 750) {
                this.method68(true);
            }
            this.method166(false);
            this.method69(463);
            this.method103(false);
            ++this.field131;
            if (this.field117 != 0) {
                this.field116 += 20;
                if (this.field116 >= 400) {
                    this.field117 = 0;
                }
            }
            if (this.field480 != 0) {
                ++this.field477;
                if (this.field477 >= 15) {
                    if (this.field480 == 2) {
                        this.field134 = true;
                    }
                    if (this.field480 == 3) {
                        this.field256 = true;
                    }
                    this.field480 = 0;
                }
            }
            if (this.field169 != 0) {
                ++this.field519;
                if (super.field586 > this.field170 + 5 || super.field586 < this.field170 - 5 || super.field587 > this.field171 + 5 || super.field587 < this.field171 - 5) {
                    this.field209 = true;
                }
                if (super.field585 == 0) {
                    if (this.field169 == 2) {
                        this.field134 = true;
                    }
                    if (this.field169 == 3) {
                        this.field256 = true;
                    }
                    this.field169 = 0;
                    if (this.field209 && this.field519 >= 5) {
                        this.field357 = -1;
                        this.method80(true);
                        if (this.field357 == this.field167 && this.field356 != this.field168) {
                            class61 var20 = class61.field1518[this.field167];
                            byte var21 = 0;
                            if (this.field207 == 1 && var20.field1512 == 206) {
                                var21 = 1;
                            }
                            if (var20.field1504[this.field356] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1508) {
                                int var22 = this.field168;
                                int var23 = this.field356;
                                var20.field1504[var23] = var20.field1504[var22];
                                var20.field1559[var23] = var20.field1559[var22];
                                var20.field1504[var22] = -1;
                                var20.field1559[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field168;
                                int var25 = this.field356;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method507(true, var24, var24 - 1);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method507(true, var24, var24 + 1);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method507(true, this.field168, this.field356);
                            }
                            this.field306.method281(13, this.field549);
                            this.field306.method317(this.field168, (byte) -34);
                            this.field306.method283(this.field167);
                            this.field306.method309(var21, (byte) 6);
                            this.field306.method316((byte) 3, this.field356);
                        }
                    } else if ((this.field494 == 1 || this.method157(this.field341 - 1, (byte) 75)) && this.field341 > 2) {
                        this.method32(0);
                    } else if (this.field341 > 0) {
                        this.method162(false, this.field341 - 1);
                    }
                    this.field477 = 10;
                    super.field592 = 0;
                }
            }
            if (class62.field1611 != -1) {
                int var26 = class62.field1611;
                int var27 = class62.field1612;
                boolean var28 = this.method66(8, 0, 0, 0, 0, var27, 0, true, 0, field90.field855[0], field90.field856[0], var26);
                class62.field1611 = -1;
                if (var28) {
                    this.field114 = super.field593;
                    this.field115 = super.field594;
                    this.field117 = 1;
                    this.field116 = 0;
                }
            }
            if (super.field592 == 1 && this.field305 != null) {
                this.field305 = null;
                this.field256 = true;
                super.field592 = 0;
            }
            this.method130(this.field302);
            this.method60((byte) -14);
            this.method105(-683);
            this.method98(126);
            if (super.field585 == 1 || super.field592 == 1) {
                ++this.field303;
            }
            if (this.field319 == 2) {
                this.method100(false);
            }
            if (this.field319 == 2 && this.field225) {
                this.method58(1951);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field316[var29]++;
            }
            this.method152(0);
            ++super.field584;
            if (super.field584 > 4500) {
                this.field111 = 250;
                super.field584 -= 500;
                this.field306.method281(77, this.field549);
            }
            ++this.field453;
            if (this.field453 > 500) {
                this.field453 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field524 += this.field525;
                }
                if ((var30 & 2) == 2) {
                    this.field393 += this.field394;
                }
                if ((var30 & 4) == 4) {
                    this.field402 += this.field403;
                }
            }
            if (this.field524 < -50) {
                this.field525 = 2;
            }
            if (this.field524 > 50) {
                this.field525 = -2;
            }
            if (this.field393 < -55) {
                this.field394 = 2;
            }
            if (this.field393 > 55) {
                this.field394 = -2;
            }
            if (this.field402 < -40) {
                this.field403 = 1;
            }
            if (this.field402 > 40) {
                this.field403 = -1;
            }
            ++this.field95;
            if (this.field95 > 500) {
                this.field95 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field368 += this.field369;
                }
                if ((var31 & 2) == 2) {
                    this.field132 += this.field133;
                }
            }
            if (this.field368 < -60) {
                this.field369 = 2;
            }
            if (this.field368 > 60) {
                this.field369 = -2;
            }
            if (this.field132 < -20) {
                this.field133 = 1;
            }
            if (this.field132 > 10) {
                this.field133 = -1;
            }
            ++this.field110;
            if (this.field110 > 50) {
                this.field306.method281(253, this.field549);
            }
            try {
                if (this.field248 != null && this.field306.field954 > 0) {
                    this.field248.method214(0, this.field306.field954, this.field306.field953, false);
                    this.field306.field954 = 0;
                    this.field110 = 0;
                }
            } catch (IOException var33) {
                this.method68(true);
            } catch (Exception var34) {
                this.method171(-308);
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method87(int arg0) {
        this.method128(331);
        if (this.field117 == 1) {
            this.field515[this.field116 / 100].method193(this.field114 - 8 - 4, this.field408, this.field115 - 8 - 4);
        }
        if (this.field117 == 2) {
            this.field515[this.field116 / 100 + 4].method193(this.field114 - 8 - 4, this.field408, this.field115 - 8 - 4);
        }
        if (this.field427 != -1) {
            this.method81(this.field131, this.field427, true);
            this.method65(0, false, 0, 0, class61.field1518[this.field427]);
        }
        if (this.field112 != -1) {
            this.method81(this.field131, this.field112, true);
            this.method65(0, false, 0, 0, class61.field1518[this.field112]);
        }
        this.method116(3);
        if (arg0 <= 0) {
            this.field108 = this.field452.method292();
        }
        if (!this.field523) {
            this.method80(true);
            this.method49(true);
        } else if (this.field230 == 0) {
            this.method149(38352);
        }
        if (this.field514 == 1) {
            this.field460[1].method193(472, this.field408, 296);
        }
        if (field318) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field574 < 15) {
                var4 = 16711680;
            }
            this.field538.method572(var2, var4, "Fps:" + super.field574, var3, -6285);
            int var12 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field392) {
                int var8 = 16711680;
            }
            this.field538.method572(var2, 16776960, "Mem:" + var6 + "k", var12, -6285);
            var12 += 15;
        }
        if (this.field210 != 0) {
            int var9 = this.field210 / 50;
            int var10 = var9 / 60;
            int var11 = var9 % 60;
            if (var11 < 10) {
                this.field538.method577(329, "System update in: " + var10 + ":0" + var11, 4, 16776960, this.field340);
            } else {
                this.field538.method577(329, "System update in: " + var10 + ":" + var11, 4, 16776960, this.field340);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BLMUKVLYLC;I)V")
    private final void method88(byte arg0, class33 arg1, int arg2) {
        while (true) {
            if (arg1.field955 + 10 < arg2 * 8) {
                int var4 = arg1.method303((byte) 8, 11);
                if (var4 != 2047) {
                    if (this.field415[var4] == null) {
                        this.field415[var4] = new class21();
                        if (this.field420[var4] != null) {
                            this.field415[var4].method243(0, this.field420[var4]);
                        }
                    }
                    this.field417[this.field416++] = var4;
                    class21 var5 = this.field415[var4];
                    var5.field844 = field237;
                    int var6 = arg1.method303((byte) 8, 1);
                    if (var6 == 1) {
                        this.field419[this.field418++] = var4;
                    }
                    int var7 = arg1.method303((byte) 8, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg1.method303((byte) 8, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = arg1.method303((byte) 8, 1);
                    var5.method245(field90.field856[0] + var8, var9 == 1, false, field90.field855[0] + var7);
                    continue;
                }
            }
            arg1.method304(8);
            if (arg0 == 0) {
                boolean var10 = false;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method89(boolean arg0) {
        if (arg0) {
            this.field108 = -1;
        }
        this.field186.method13((byte) -36);
        class48.field1287 = this.field155;
        this.field361.method500(0, this.field408, 0);
        if (this.field511 != -1) {
            this.method65(0, false, 0, 0, class61.field1518[this.field511]);
        } else if (this.field153[this.field535] != -1) {
            this.method65(0, false, 0, 0, class61.field1518[this.field153[this.field535]]);
        }
        if (this.field523 && this.field230 == 1) {
            this.method149(38352);
        }
        this.field186.method14(super.field578, 553, 205, 0);
        this.field188.method13((byte) -36);
        class48.field1287 = this.field156;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)Ljava/lang/String;")
    private static final String method90(int arg0, int arg1) {
        if (arg0 < 8 || arg0 > 8) {
            field259 = !field259;
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method91(int arg0) {
        this.field187.method13((byte) -36);
        if (this.field97 == 2) {
            byte[] var2 = this.field362.field1474;
            int[] var3 = class1.field9;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field121.method197(0, this.field113, 0, 33, this.field93, 25, 0, 256, 25, this.field374, 33);
            this.field188.method13((byte) -36);
        } else {
            int var6 = this.field374 + this.field368 & 2047;
            int var7 = field90.field815 / 32 + 48;
            int var8 = 464 - field90.field816 / 32;
            this.field324.method197(0, this.field517, 5, 146, this.field264, var8, 25, this.field132 + 256, var7, var6, 151);
            this.field121.method197(0, this.field113, 0, 33, this.field93, 25, 0, 256, 25, this.field374, 33);
            for (int var9 = 0; var9 < this.field447; ++var9) {
                int var39 = this.field448[var9] * 4 + 2 - field90.field815 / 32;
                int var40 = this.field449[var9] * 4 + 2 - field90.field816 / 32;
                this.method170(var40, this.field123[var9], var39, -18243);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class56 var36 = this.field521[this.field360][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field90.field815 / 32;
                        int var38 = var35 * 4 + 2 - field90.field816 / 32;
                        this.method170(var38, this.field488, var37, -18243);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field161; ++var11) {
                class43 var31 = this.field160[this.field162[var11]];
                if (var31 != null && var31.method241(105)) {
                    class5 var32 = var31.field1177;
                    if (var32.field50 != null) {
                        var32 = var32.method26((byte) 2);
                    }
                    if (var32 != null && var32.field68 && var32.field48) {
                        int var33 = var31.field815 / 32 - field90.field815 / 32;
                        int var34 = var31.field816 / 32 - field90.field816 / 32;
                        this.method170(var34, this.field489, var33, -18243);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field416; ++var12) {
                class21 var23 = this.field415[this.field417[var12]];
                if (var23 != null && var23.method241(105)) {
                    int var24 = var23.field815 / 32 - field90.field815 / 32;
                    int var25 = var23.field816 / 32 - field90.field816 / 32;
                    boolean var26 = false;
                    long var27 = class44.method413(var23.field774);
                    for (int var29 = 0; var29 < this.field299; ++var29) {
                        if (this.field547[var29] == var27 && this.field175[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field90.field771 != 0 && var23.field771 != 0 && field90.field771 == var23.field771) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method170(var25, this.field491, var24, -18243);
                    } else if (var30) {
                        this.method170(var25, this.field492, var24, -18243);
                    } else {
                        this.method170(var25, this.field490, var24, -18243);
                    }
                }
            }
            if (arg0 >= 0) {
                this.field108 = this.field452.method292();
            }
            if (this.field487 != 0 && field237 % 20 < 10) {
                if (this.field487 == 1 && this.field83 >= 0 && this.field83 < this.field160.length) {
                    class43 var13 = this.field160[this.field83];
                    if (var13 != null) {
                        int var14 = var13.field815 / 32 - field90.field815 / 32;
                        int var15 = var13.field816 / 32 - field90.field816 / 32;
                        this.method163(var15, this.field397, -677, var14);
                    }
                }
                if (this.field487 == 2) {
                    int var16 = (this.field294 - this.field148) * 4 + 2 - field90.field815 / 32;
                    int var17 = (this.field295 - this.field149) * 4 + 2 - field90.field816 / 32;
                    this.method163(var17, this.field397, -677, var16);
                }
                if (this.field487 == 10 && this.field359 >= 0 && this.field359 < this.field415.length) {
                    class21 var18 = this.field415[this.field359];
                    if (var18 != null) {
                        int var19 = var18.field815 / 32 - field90.field815 / 32;
                        int var20 = var18.field816 / 32 - field90.field816 / 32;
                        this.method163(var20, this.field397, -677, var19);
                    }
                }
            }
            if (this.field322 != 0) {
                int var21 = this.field322 * 4 + 2 - field90.field815 / 32;
                int var22 = this.field323 * 4 + 2 - field90.field816 / 32;
                this.method170(var22, this.field396, var21, -18243);
            }
            class1.method6(3, 3, 78, -19550, 16777215, 97);
            this.field188.method13((byte) -36);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method92(int arg0, int arg1) {
        if (arg1 > 0) {
            if (!field392) {
                if (class48.field1295[17] >= arg0) {
                    class59 var3 = class48.field1289[17];
                    int var4 = var3.field1477 * var3.field1476 - 1;
                    int var5 = this.field131 * var3.field1476 * 2;
                    byte[] var6 = var3.field1474;
                    byte[] var7 = this.field409;
                    for (int var8 = 0; var8 <= var4; ++var8) {
                        var7[var8] = var6[var8 - var5 & var4];
                    }
                    var3.field1474 = var7;
                    this.field409 = var6;
                    class48.method440(false, 17);
                }
                if (class48.field1295[24] >= arg0) {
                    class59 var9 = class48.field1289[24];
                    int var10 = var9.field1477 * var9.field1476 - 1;
                    int var11 = this.field131 * var9.field1476 * 2;
                    byte[] var12 = var9.field1474;
                    byte[] var13 = this.field409;
                    for (int var14 = 0; var14 <= var10; ++var14) {
                        var13[var14] = var12[var14 - var11 & var10];
                    }
                    var9.field1474 = var13;
                    this.field409 = var12;
                    class48.method440(false, 24);
                    ++field327;
                    if (field327 > 197) {
                        field327 = 0;
                        this.field306.method281(32, this.field549);
                        this.field306.method286(0);
                    }
                }
                if (class48.field1295[34] >= arg0) {
                    class59 var15 = class48.field1289[34];
                    int var16 = var15.field1477 * var15.field1476 - 1;
                    int var17 = this.field131 * var15.field1476 * 2;
                    byte[] var18 = var15.field1474;
                    byte[] var19 = this.field409;
                    for (int var20 = 0; var20 <= var16; ++var20) {
                        var19[var20] = var18[var20 - var17 & var16];
                    }
                    var15.field1474 = var19;
                    this.field409 = var18;
                    class48.method440(false, 34);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method93(boolean arg0) {
        this.field137 &= arg0;
        this.field506 = false;
        while (this.field118) {
            this.field506 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field252 = null;
        this.field253 = null;
        this.field165 = null;
        this.field342 = null;
        this.field343 = null;
        this.field344 = null;
        this.field345 = null;
        this.field220 = null;
        this.field221 = null;
        this.field482 = null;
        this.field483 = null;
        this.field250 = null;
        this.field251 = null;
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method94(byte arg0) {
        int var2 = 5;
        this.field501[8] = 0;
        int var3 = 0;
        if (arg0 == 0) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        while (this.field501[8] == 0) {
            String var6 = "Unknown problem";
            this.method79(3, "Connecting to web server", 20);
            try {
                DataInputStream var7 = this.method107("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 311);
                class33 var8 = new class33(field371, new byte[40]);
                var7.readFully(var8.field953, 0, 40);
                var7.close();
                for (int var9 = 0; var9 < 9; ++var9) {
                    this.field501[var9] = var8.method297();
                }
                int var10 = var8.method297();
                int var11 = 1234;
                for (int var12 = 0; var12 < 9; ++var12) {
                    var11 = (var11 << 1) + this.field501[var12];
                }
                if (var10 != var11) {
                    var6 = "checksum problem";
                    this.field501[8] = 0;
                }
            } catch (EOFException var15) {
                var6 = "EOF problem";
                this.field501[8] = 0;
            } catch (IOException var16) {
                var6 = "connection problem";
                this.field501[8] = 0;
            } catch (Exception var17) {
                var6 = "logic problem";
                this.field501[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field501[8] == 0) {
                ++var3;
                for (int var13 = var2; var13 > 0; --var13) {
                    if (var3 >= 10) {
                        this.method79(3, "Game updated - please reload page", 10);
                        var13 = 10;
                    } else {
                        this.method79(3, var6 + " - Will retry in " + var13 + " secs.", 10);
                    }
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var14) {
                    }
                }
                var2 *= 2;
                if (var2 > 60) {
                    var2 = 60;
                }
                this.field513 = !this.field513;
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method95(int arg0) {
        this.field107 += arg0;
        this.field254 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field99[var2] = -1;
            for (int var3 = 0; var3 < class6.field558; ++var3) {
                if (!class6.field559[var3].field565 && class6.field559[var3].field560 == var2 + (this.field467 ? 0 : 7)) {
                    this.field99[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)Ljava/lang/String;")
    private static final String method96(byte arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg0 != -16) {
            field157 = !field157;
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIILjava/lang/String;ILjava/lang/String;)LFIGUVTWB;")
    public final class15 method97(byte arg0, int arg1, int arg2, String arg3, int arg4, String arg5) {
        byte[] var7 = null;
        if (arg0 == 9) {
            boolean var8 = false;
        } else {
            this.method62();
        }
        int var9 = 5;
        try {
            if (this.field329[0] != null) {
                var7 = this.field329[0].method184(arg2, false);
            }
        } catch (Exception var31) {
        }
        if (var7 != null) {
            this.field183.reset();
            this.field183.update(var7);
            int var10 = (int) this.field183.getValue();
            if (arg1 != var10) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class15(false, var7);
        } else {
            int var12 = 0;
            while (var7 == null) {
                String var13 = "Unknown error";
                this.method79(3, "Requesting " + arg5, arg4);
                Object var14 = null;
                try {
                    int var15 = 0;
                    DataInputStream var16 = this.method107(arg3 + arg1);
                    byte[] var17 = new byte[6];
                    var16.readFully(var17, 0, 6);
                    class33 var18 = new class33(field371, var17);
                    var18.field954 = 3;
                    int var19 = var18.method296() + 6;
                    int var20 = 6;
                    var7 = new byte[var19];
                    for (int var21 = 0; var21 < 6; ++var21) {
                        var7[var21] = var17[var21];
                    }
                    while (var20 < var19) {
                        int var22 = var19 - var20;
                        if (var22 > 1000) {
                            var22 = 1000;
                        }
                        int var23 = var16.read(var7, var20, var22);
                        if (var23 < 0) {
                            (new StringBuffer("Length error: ")).append(var20).append("/").append(var19).toString();
                            throw new IOException("EOF");
                        }
                        var20 += var23;
                        int var24 = var20 * 100 / var19;
                        if (var15 != var24) {
                            this.method79(3, "Loading " + arg5 + " - " + var24 + "%", arg4);
                        }
                        var15 = var24;
                    }
                    var16.close();
                    try {
                        if (this.field329[0] != null) {
                            this.field329[0].method185(0, arg2, var7, var7.length);
                        }
                    } catch (Exception var30) {
                        this.field329[0] = null;
                    }
                    if (var7 != null) {
                        this.field183.reset();
                        this.field183.update(var7);
                        int var25 = (int) this.field183.getValue();
                        if (arg1 != var25) {
                            var7 = null;
                            ++var12;
                            var13 = "Checksum error: " + var25;
                        }
                    }
                } catch (IOException var32) {
                    if (var13.equals("Unknown error")) {
                        var13 = "Connection error";
                    }
                    var7 = null;
                } catch (NullPointerException var33) {
                    var13 = "Null error";
                    var7 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                } catch (ArrayIndexOutOfBoundsException var34) {
                    var13 = "Bounds error";
                    var7 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                } catch (Exception var35) {
                    var13 = "Unexpected error";
                    var7 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                }
                if (var7 == null) {
                    for (int var27 = var9; var27 > 0; --var27) {
                        if (var12 >= 3) {
                            this.method79(3, "Game updated - please reload page", arg4);
                            var27 = 10;
                        } else {
                            this.method79(3, var13 + " - Retrying in " + var27, arg4);
                        }
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception var29) {
                        }
                    }
                    var9 *= 2;
                    if (var9 > 60) {
                        var9 = 60;
                    }
                    this.field513 = !this.field513;
                }
            }
            return new class15(false, var7);
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field389 = Integer.parseInt(this.getParameter("nodeid"));
        field390 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method47((byte) 5);
        } else {
            method127(0);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field391 = false;
        } else {
            field391 = true;
        }
        this.method180(765, -478, 503);
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method98(int arg0) {
        int var2 = 14 / arg0;
        if (super.field592 == 1) {
            if (super.field593 >= 6 && super.field593 <= 106 && super.field594 >= 467 && super.field594 <= 499) {
                this.field194 = (this.field194 + 1) % 4;
                this.field315 = true;
                this.field256 = true;
                this.field306.method281(58, this.field549);
                this.field306.method282(this.field194);
                this.field306.method282(this.field228);
                this.field306.method282(this.field258);
            }
            if (super.field593 >= 135 && super.field593 <= 235 && super.field594 >= 467 && super.field594 <= 499) {
                this.field228 = (this.field228 + 1) % 3;
                this.field315 = true;
                this.field256 = true;
                this.field306.method281(58, this.field549);
                this.field306.method282(this.field194);
                this.field306.method282(this.field228);
                this.field306.method282(this.field258);
            }
            if (super.field593 >= 273 && super.field593 <= 373 && super.field594 >= 467 && super.field594 <= 499) {
                this.field258 = (this.field258 + 1) % 3;
                this.field315 = true;
                this.field256 = true;
                this.field306.method281(58, this.field549);
                this.field306.method282(this.field194);
                this.field306.method282(this.field228);
                this.field306.method282(this.field258);
            }
            if (super.field593 >= 412 && super.field593 <= 512 && super.field594 >= 467 && super.field594 <= 499) {
                if (this.field112 == -1) {
                    this.method142(938);
                    this.field509 = "";
                    this.field289 = false;
                    for (int var3 = 0; var3 < class61.field1518.length; ++var3) {
                        if (class61.field1518[var3] != null && class61.field1518[var3].field1512 == 600) {
                            this.field94 = this.field112 = class61.field1518[var3].field1541;
                            return;
                        }
                    }
                    return;
                }
                this.method139("Please close the interface you have open before using 'report abuse'", true, 0, "");
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field545) {
            this.method48((byte) 0);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILUKJEXUVU;IIIBI)V")
    public final void method99(int arg0, class61 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg5 == 9) {
            if (arg1.field1537 == 0 && arg1.field1529 != null && !arg1.field1550) {
                if (arg2 >= arg3 && arg6 >= arg0 && arg2 <= arg1.field1562 + arg3 && arg6 <= arg1.field1556 + arg0) {
                    int var8 = arg1.field1529.length;
                    for (int var9 = 0; var9 < var8; ++var9) {
                        int var10 = arg1.field1505[var9] + arg3;
                        int var11 = arg1.field1553[var9] + arg0 - arg4;
                        class61 var12 = class61.field1518[arg1.field1529[var9]];
                        int var13 = var12.field1520 + var10;
                        int var14 = var12.field1514 + var11;
                        if ((var12.field1525 >= 0 || var12.field1549 != 0) && arg2 >= var13 && arg6 >= var14 && arg2 < var12.field1562 + var13 && arg6 < var12.field1556 + var14) {
                            if (var12.field1525 >= 0) {
                                this.field320 = var12.field1525;
                            } else {
                                this.field320 = var12.field1519;
                            }
                        }
                        if (var12.field1537 == 0) {
                            this.method99(var14, var12, arg2, var13, var12.field1547, (byte) 9, arg6);
                            if (var12.field1506 > var12.field1556) {
                                this.method115(true, var14, var12, var12.field1506, var12.field1562 + var13, this.field518, arg6, var12.field1556, arg2);
                            }
                        } else {
                            if (var12.field1532 == 1 && arg2 >= var13 && arg6 >= var14 && arg2 < var12.field1562 + var13 && arg6 < var12.field1556 + var14) {
                                boolean var15 = false;
                                if (var12.field1512 != 0) {
                                    var15 = this.method104(var12, -10223);
                                }
                                if (!var15) {
                                    this.field246[this.field341] = var12.field1561;
                                    this.field499[this.field341] = 415;
                                    this.field498[this.field341] = var12.field1519;
                                    ++this.field341;
                                }
                            }
                            if (var12.field1532 == 2 && this.field176 == 0 && arg2 >= var13 && arg6 >= var14 && arg2 < var12.field1562 + var13 && arg6 < var12.field1556 + var14) {
                                String var16 = var12.field1530;
                                if (var16.indexOf(" ") != -1) {
                                    var16 = var16.substring(0, var16.indexOf(" "));
                                }
                                this.field246[this.field341] = var16 + " @gre@" + var12.field1503;
                                this.field499[this.field341] = 301;
                                this.field498[this.field341] = var12.field1519;
                                ++this.field341;
                            }
                            if (var12.field1532 == 3 && arg2 >= var13 && arg6 >= var14 && arg2 < var12.field1562 + var13 && arg6 < var12.field1556 + var14) {
                                this.field246[this.field341] = "Close";
                                this.field499[this.field341] = 913;
                                this.field498[this.field341] = var12.field1519;
                                ++this.field341;
                            }
                            if (var12.field1532 == 4 && arg2 >= var13 && arg6 >= var14 && arg2 < var12.field1562 + var13 && arg6 < var12.field1556 + var14) {
                                this.field246[this.field341] = var12.field1561;
                                this.field499[this.field341] = 212;
                                this.field498[this.field341] = var12.field1519;
                                ++this.field341;
                            }
                            if (var12.field1532 == 5 && arg2 >= var13 && arg6 >= var14 && arg2 < var12.field1562 + var13 && arg6 < var12.field1556 + var14) {
                                this.field246[this.field341] = var12.field1561;
                                this.field499[this.field341] = 938;
                                this.field498[this.field341] = var12.field1519;
                                ++this.field341;
                            }
                            if (var12.field1532 == 6 && !this.field144 && arg2 >= var13 && arg6 >= var14 && arg2 < var12.field1562 + var13 && arg6 < var12.field1556 + var14) {
                                this.field246[this.field341] = var12.field1561;
                                this.field499[this.field341] = 799;
                                this.field498[this.field341] = var12.field1519;
                                ++this.field341;
                            }
                            if (var12.field1537 == 2) {
                                int var17 = 0;
                                for (int var18 = 0; var18 < var12.field1556; ++var18) {
                                    for (int var19 = 0; var19 < var12.field1562; ++var19) {
                                        int var20 = (var12.field1542 + 32) * var19 + var13;
                                        int var21 = (var12.field1565 + 32) * var18 + var14;
                                        if (var17 < 20) {
                                            var20 += var12.field1501[var17];
                                            var21 += var12.field1510[var17];
                                        }
                                        if (arg2 >= var20 && arg6 >= var21 && arg2 < var20 + 32 && arg6 < var21 + 32) {
                                            this.field356 = var17;
                                            this.field357 = var12.field1519;
                                            if (var12.field1504[var17] > 0) {
                                                class45 var22 = class45.method428(var12.field1504[var17] - 1);
                                                if (this.field442 == 1 && var12.field1552) {
                                                    if (this.field444 != var12.field1519 || this.field443 != var17) {
                                                        this.field246[this.field341] = "Use " + this.field446 + " with @lre@" + var22.field1225;
                                                        this.field499[this.field341] = 192;
                                                        this.field500[this.field341] = var22.field1193;
                                                        this.field497[this.field341] = var17;
                                                        this.field498[this.field341] = var12.field1519;
                                                        ++this.field341;
                                                    }
                                                } else if (this.field176 == 1 && var12.field1552) {
                                                    if ((this.field178 & 16) == 16) {
                                                        this.field246[this.field341] = this.field179 + " @lre@" + var22.field1225;
                                                        this.field499[this.field341] = 445;
                                                        this.field500[this.field341] = var22.field1193;
                                                        this.field497[this.field341] = var17;
                                                        this.field498[this.field341] = var12.field1519;
                                                        ++this.field341;
                                                    }
                                                } else {
                                                    if (var12.field1552) {
                                                        for (int var23 = 4; var23 >= 3; --var23) {
                                                            if (var22.field1232 != null && var22.field1232[var23] != null) {
                                                                this.field246[this.field341] = var22.field1232[var23] + " @lre@" + var22.field1225;
                                                                if (var23 == 3) {
                                                                    this.field499[this.field341] = 107;
                                                                }
                                                                if (var23 == 4) {
                                                                    this.field499[this.field341] = 634;
                                                                }
                                                                this.field500[this.field341] = var22.field1193;
                                                                this.field497[this.field341] = var17;
                                                                this.field498[this.field341] = var12.field1519;
                                                                ++this.field341;
                                                            } else if (var23 == 4) {
                                                                this.field246[this.field341] = "Drop @lre@" + var22.field1225;
                                                                this.field499[this.field341] = 634;
                                                                this.field500[this.field341] = var22.field1193;
                                                                this.field497[this.field341] = var17;
                                                                this.field498[this.field341] = var12.field1519;
                                                                ++this.field341;
                                                            }
                                                        }
                                                    }
                                                    if (var12.field1554) {
                                                        this.field246[this.field341] = "Use @lre@" + var22.field1225;
                                                        this.field499[this.field341] = 236;
                                                        this.field500[this.field341] = var22.field1193;
                                                        this.field497[this.field341] = var17;
                                                        this.field498[this.field341] = var12.field1519;
                                                        ++this.field341;
                                                    }
                                                    if (var12.field1552 && var22.field1232 != null) {
                                                        for (int var24 = 2; var24 >= 0; --var24) {
                                                            if (var22.field1232[var24] != null) {
                                                                this.field246[this.field341] = var22.field1232[var24] + " @lre@" + var22.field1225;
                                                                if (var24 == 0) {
                                                                    this.field499[this.field341] = 615;
                                                                }
                                                                if (var24 == 1) {
                                                                    this.field499[this.field341] = 898;
                                                                }
                                                                if (var24 == 2) {
                                                                    this.field499[this.field341] = 754;
                                                                }
                                                                this.field500[this.field341] = var22.field1193;
                                                                this.field497[this.field341] = var17;
                                                                this.field498[this.field341] = var12.field1519;
                                                                ++this.field341;
                                                            }
                                                        }
                                                    }
                                                    if (var12.field1513 != null) {
                                                        for (int var25 = 4; var25 >= 0; --var25) {
                                                            if (var12.field1513[var25] != null) {
                                                                this.field246[this.field341] = var12.field1513[var25] + " @lre@" + var22.field1225;
                                                                if (var25 == 0) {
                                                                    this.field499[this.field341] = 431;
                                                                }
                                                                if (var25 == 1) {
                                                                    this.field499[this.field341] = 262;
                                                                }
                                                                if (var25 == 2) {
                                                                    this.field499[this.field341] = 892;
                                                                }
                                                                if (var25 == 3) {
                                                                    this.field499[this.field341] = 983;
                                                                }
                                                                if (var25 == 4) {
                                                                    this.field499[this.field341] = 650;
                                                                }
                                                                this.field500[this.field341] = var22.field1193;
                                                                this.field497[this.field341] = var17;
                                                                this.field498[this.field341] = var12.field1519;
                                                                ++this.field341;
                                                            }
                                                        }
                                                    }
                                                    this.field246[this.field341] = "Examine @lre@" + var22.field1225;
                                                    this.field499[this.field341] = 1072;
                                                    this.field500[this.field341] = var22.field1193;
                                                    this.field497[this.field341] = var17;
                                                    this.field498[this.field341] = var12.field1519;
                                                    ++this.field341;
                                                }
                                            }
                                        }
                                        ++var17;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method100(boolean arg0) {
        if (!arg0) {
            try {
                int var2 = field90.field815 + this.field524;
                int var3 = field90.field816 + this.field393;
                if (this.field126 - var2 < -500 || this.field126 - var2 > 500 || this.field127 - var3 < -500 || this.field127 - var3 > 500) {
                    this.field126 = var2;
                    this.field127 = var3;
                }
                if (this.field126 != var2) {
                    this.field126 += (var2 - this.field126) / 16;
                }
                if (this.field127 != var3) {
                    this.field127 += (var3 - this.field127) / 16;
                }
                if (super.field596[1] == 1) {
                    this.field375 += (-24 - this.field375) / 2;
                } else if (super.field596[2] == 1) {
                    this.field375 += (24 - this.field375) / 2;
                } else {
                    this.field375 /= 2;
                }
                if (super.field596[3] == 1) {
                    this.field376 += (12 - this.field376) / 2;
                } else if (super.field596[4] == 1) {
                    this.field376 += (-12 - this.field376) / 2;
                } else {
                    this.field376 /= 2;
                }
                this.field374 = this.field375 / 2 + this.field374 & 2047;
                this.field373 += this.field376 / 2;
                if (this.field373 < 128) {
                    this.field373 = 128;
                }
                if (this.field373 > 383) {
                    this.field373 = 383;
                }
                int var4 = this.field126 >> 7;
                int var5 = this.field127 >> 7;
                int var6 = this.method114(this.field360, this.field127, (byte) 64, this.field126);
                int var7 = 0;
                if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                    for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                        for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                            int var10 = this.field360;
                            if (var10 < 3 && (this.field205[1][var8][var9] & 2) == 2) {
                                ++var10;
                            }
                            int var11 = var6 - this.field370[var10][var8][var9];
                            if (var11 > var7) {
                                var7 = var11;
                            }
                        }
                    }
                }
                int var12 = var7 * 192;
                if (var12 > 98048) {
                    var12 = 98048;
                }
                if (var12 < 32768) {
                    var12 = 32768;
                }
                if (var12 > this.field312) {
                    this.field312 += (var12 - this.field312) / 24;
                } else if (var12 < this.field312) {
                    this.field312 += (var12 - this.field312) / 80;
                }
            } catch (Exception var13) {
                signlink.reporterror("glfc_ex " + field90.field815 + "," + field90.field816 + "," + this.field126 + "," + this.field127 + "," + this.field180 + "," + this.field181 + "," + this.field148 + "," + this.field149);
                throw new RuntimeException("eek");
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method101(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method101(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class34 var11 = null;
        for (class34 var12 = (class34) this.field336.method482(); var12 != null; var12 = (class34) this.field336.method484(this.field493)) {
            if (var12.field971 == arg5 && var12.field973 == arg9 && var12.field974 == arg6 && var12.field972 == arg4) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class34();
            var11.field971 = arg5;
            var11.field972 = arg4;
            var11.field973 = arg9;
            var11.field974 = arg6;
            this.method150(var11, -513);
            this.field336.method479(var11);
        }
        var11.field976 = arg8;
        var11.field978 = arg7;
        var11.field977 = arg1;
        var11.field975 = arg3;
        if (arg2 != 5293) {
            this.field521 = null;
        }
        var11.field967 = arg0;
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method103(boolean arg0) {
        for (int var2 = -1; var2 < this.field416; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field414;
            } else {
                var6 = this.field417[var2];
            }
            class21 var7 = this.field415[var6];
            if (var7 != null && var7.field819 > 0) {
                --var7.field819;
                if (var7.field819 == 0) {
                    var7.field806 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field161; ++var3) {
            int var4 = this.field162[var3];
            class43 var5 = this.field160[var4];
            if (var5 != null && var5.field819 > 0) {
                --var5.field819;
                if (var5.field819 == 0) {
                    var5.field806 = null;
                }
            }
        }
        if (arg0) {
            this.method62();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LUKJEXUVU;I)Z")
    public final boolean method104(class61 arg0, int arg1) {
        if (this.field191 != arg1) {
            this.field337 = 153;
        }
        int var3 = arg0.field1512;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field246[this.field341] = "Remove @whi@" + arg0.field1522;
                this.field499[this.field341] = 813;
                ++this.field341;
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
            this.field246[this.field341] = "Remove @whi@" + this.field135[var3];
            this.field499[this.field341] = 129;
            ++this.field341;
            this.field246[this.field341] = "Message @whi@" + this.field135[var3];
            this.field499[this.field341] = 936;
            ++this.field341;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method105(int arg0) {
        while (arg0 >= 0) {
            this.field108 = this.field452.method292();
        }
        if (super.field592 == 1) {
            if (super.field593 >= 539 && super.field593 <= 573 && super.field594 >= 169 && super.field594 < 205 && this.field153[0] != -1) {
                this.field134 = true;
                this.field535 = 0;
                this.field143 = true;
            }
            if (super.field593 >= 569 && super.field593 <= 599 && super.field594 >= 168 && super.field594 < 205 && this.field153[1] != -1) {
                this.field134 = true;
                this.field535 = 1;
                this.field143 = true;
            }
            if (super.field593 >= 597 && super.field593 <= 627 && super.field594 >= 168 && super.field594 < 205 && this.field153[2] != -1) {
                this.field134 = true;
                this.field535 = 2;
                this.field143 = true;
            }
            if (super.field593 >= 625 && super.field593 <= 669 && super.field594 >= 168 && super.field594 < 203 && this.field153[3] != -1) {
                this.field134 = true;
                this.field535 = 3;
                this.field143 = true;
            }
            if (super.field593 >= 666 && super.field593 <= 696 && super.field594 >= 168 && super.field594 < 205 && this.field153[4] != -1) {
                this.field134 = true;
                this.field535 = 4;
                this.field143 = true;
            }
            if (super.field593 >= 694 && super.field593 <= 724 && super.field594 >= 168 && super.field594 < 205 && this.field153[5] != -1) {
                this.field134 = true;
                this.field535 = 5;
                this.field143 = true;
            }
            if (super.field593 >= 722 && super.field593 <= 756 && super.field594 >= 169 && super.field594 < 205 && this.field153[6] != -1) {
                this.field134 = true;
                this.field535 = 6;
                this.field143 = true;
            }
            if (super.field593 >= 540 && super.field593 <= 574 && super.field594 >= 466 && super.field594 < 502 && this.field153[7] != -1) {
                this.field134 = true;
                this.field535 = 7;
                this.field143 = true;
            }
            if (super.field593 >= 572 && super.field593 <= 602 && super.field594 >= 466 && super.field594 < 503 && this.field153[8] != -1) {
                this.field134 = true;
                this.field535 = 8;
                this.field143 = true;
            }
            if (super.field593 >= 599 && super.field593 <= 629 && super.field594 >= 466 && super.field594 < 503 && this.field153[9] != -1) {
                this.field134 = true;
                this.field535 = 9;
                this.field143 = true;
            }
            if (super.field593 >= 627 && super.field593 <= 671 && super.field594 >= 467 && super.field594 < 502 && this.field153[10] != -1) {
                this.field134 = true;
                this.field535 = 10;
                this.field143 = true;
            }
            if (super.field593 >= 669 && super.field593 <= 699 && super.field594 >= 466 && super.field594 < 503 && this.field153[11] != -1) {
                this.field134 = true;
                this.field535 = 11;
                this.field143 = true;
            }
            if (super.field593 >= 696 && super.field593 <= 726 && super.field594 >= 466 && super.field594 < 503 && this.field153[12] != -1) {
                this.field134 = true;
                this.field535 = 12;
                this.field143 = true;
            }
            if (super.field593 >= 724 && super.field593 <= 758 && super.field594 >= 466 && super.field594 < 502 && this.field153[13] != -1) {
                this.field134 = true;
                this.field535 = 13;
                this.field143 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLMUKVLYLC;)V")
    private final void method106(int arg0, byte arg1, class33 arg2) {
        for (int var4 = 0; var4 < this.field418; ++var4) {
            int var6 = this.field419[var4];
            class43 var7 = this.field160[var6];
            int var8 = arg2.method292();
            if ((var8 & 4) != 0) {
                var7.field806 = arg2.method299();
                var7.field819 = 100;
            }
            if ((var8 & 16) != 0) {
                int var9 = arg2.method312(0);
                int var10 = arg2.method310(46155);
                var7.method248(var9, -343, field237, var10);
                var7.field827 = field237 + 300;
                var7.field828 = arg2.method292();
                var7.field829 = arg2.method311((byte) -93);
            }
            if ((var8 & 8) != 0) {
                var7.field833 = arg2.method318((byte) 2);
                var7.field834 = arg2.method318((byte) 2);
            }
            if ((var8 & 32) != 0) {
                var7.field1177 = class5.method24(arg2.method319(-206));
                var7.field858 = var7.field1177.field57;
                var7.field854 = var7.field1177.field65;
                var7.field850 = var7.field1177.field73;
                var7.field851 = var7.field1177.field58;
                var7.field852 = var7.field1177.field60;
                var7.field853 = var7.field1177.field61;
                var7.field835 = var7.field1177.field53;
            }
            if ((var8 & 1) != 0) {
                int var11 = arg2.method294();
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg2.method310(46155);
                if (var7.field808 == var11 && var11 != -1) {
                    int var13 = class58.field1453[var11].field1467;
                    if (var13 == 1) {
                        var7.field809 = 0;
                        var7.field810 = 0;
                        var7.field811 = var12;
                        var7.field812 = 0;
                    }
                    if (var13 == 2) {
                        var7.field812 = 0;
                    }
                } else if (var11 == -1 || var7.field808 == -1 || class58.field1453[var11].field1461 >= class58.field1453[var7.field808].field1461) {
                    var7.field808 = var11;
                    var7.field809 = 0;
                    var7.field810 = 0;
                    var7.field811 = var12;
                    var7.field812 = 0;
                    var7.field857 = var7.field824;
                }
            }
            if ((var8 & 64) != 0) {
                int var14 = arg2.method312(0);
                int var15 = arg2.method310(46155);
                var7.method248(var14, -343, field237, var15);
                var7.field827 = field237 + 300;
                var7.field828 = arg2.method311((byte) -93);
                var7.field829 = arg2.method312(0);
            }
            if ((var8 & 128) != 0) {
                var7.field830 = arg2.method320((byte) 1);
                if (var7.field830 == 65535) {
                    var7.field830 = -1;
                }
            }
            if ((var8 & 2) != 0) {
                var7.field845 = arg2.method294();
                int var16 = arg2.method325(2);
                var7.field849 = var16 >> 16;
                var7.field848 = (var16 & 65535) + field237;
                var7.field846 = 0;
                var7.field847 = 0;
                if (var7.field848 > field237) {
                    var7.field846 = -1;
                }
                if (var7.field845 == 65535) {
                    var7.field845 = -1;
                }
            }
        }
        if (this.field216 == arg1) {
            boolean var5 = false;
        } else {
            this.field306.method282(221);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method107(String arg0) throws IOException {
        if (!this.field513) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field504 != null) {
                try {
                    this.field504.close();
                } catch (Exception var4) {
                }
                this.field504 = null;
            }
            this.field504 = this.method167(43595);
            this.field504.setSoTimeout(10000);
            InputStream var2 = this.field504.getInputStream();
            OutputStream var3 = this.field504.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method108(byte arg0) {
        this.field274 = 0;
        for (int var2 = -1; var2 < this.field416 + this.field161; ++var2) {
            class23 var19;
            if (var2 == -1) {
                var19 = field90;
            } else if (var2 < this.field416) {
                var19 = this.field415[this.field417[var2]];
            } else {
                var19 = this.field160[this.field162[var2 - this.field416]];
            }
            if (var19 != null && var19.method241(105)) {
                if (var19 instanceof class43) {
                    class5 var20 = ((class43) var19).field1177;
                    if (var20.field50 != null) {
                        var20 = var20.method26((byte) 2);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field416) {
                    class5 var24 = ((class43) var19).field1177;
                    if (var24.field45 >= 0 && var24.field45 < this.field460.length) {
                        this.method41(var19.field818 + 15, var19, false);
                        if (this.field527 > -1) {
                            this.field460[var24.field45].method193(this.field527 - 12, this.field408, this.field528 - 30);
                        }
                    }
                    if (this.field487 == 1 && this.field162[var2 - this.field416] == this.field83 && field237 % 20 < 10) {
                        this.method41(var19.field818 + 15, var19, false);
                        if (this.field527 > -1) {
                            this.field460[2].method193(this.field527 - 12, this.field408, this.field528 - 28);
                        }
                    }
                } else {
                    int var21 = 30;
                    class21 var22 = (class21) var19;
                    if (var22.field782 != 0) {
                        this.method41(var19.field818 + 15, var19, false);
                        if (this.field527 > -1) {
                            for (int var23 = 0; var23 < 8; ++var23) {
                                if ((var22.field782 & 1 << var23) != 0) {
                                    this.field460[var23].method193(this.field527 - 12, this.field408, this.field528 - var21);
                                    var21 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field487 == 10 && this.field417[var2] == this.field359) {
                        this.method41(var19.field818 + 15, var19, false);
                        if (this.field527 > -1) {
                            this.field460[7].method193(this.field527 - 12, this.field408, this.field528 - var21);
                        }
                    }
                }
                if (var19.field806 != null && (var2 >= this.field416 || this.field194 == 0 || this.field194 == 3 || this.field194 == 1 && this.method82(((class21) var19).field774, (byte) 0))) {
                    this.method41(var19.field818, var19, false);
                    if (this.field527 > -1 && this.field274 < this.field275) {
                        this.field279[this.field274] = this.field539.method576(-4, var19.field806) / 2;
                        this.field278[this.field274] = this.field539.field1695;
                        this.field276[this.field274] = this.field527;
                        this.field277[this.field274] = this.field528;
                        this.field280[this.field274] = var19.field831;
                        this.field281[this.field274] = var19.field814;
                        this.field282[this.field274] = var19.field819;
                        this.field283[this.field274++] = var19.field806;
                        if (this.field441 == 0 && var19.field814 >= 1 && var19.field814 <= 3) {
                            this.field278[this.field274] += 10;
                            this.field277[this.field274] += 5;
                        }
                        if (this.field441 == 0 && var19.field814 == 4) {
                            this.field279[this.field274] = 60;
                        }
                        if (this.field441 == 0 && var19.field814 == 5) {
                            this.field278[this.field274] += 5;
                        }
                    }
                }
                if (var19.field827 > field237) {
                    this.method41(var19.field818 + 15, var19, false);
                    if (this.field527 > -1) {
                        int var25 = var19.field828 * 30 / var19.field829;
                        if (var25 > 30) {
                            var25 = 30;
                        }
                        class1.method6(var25, 5, this.field528 - 3, -19550, 65280, this.field527 - 15);
                        class1.method6(30 - var25, 5, this.field528 - 3, -19550, 16711680, this.field527 - 15 + var25);
                    }
                }
                for (int var26 = 0; var26 < 4; ++var26) {
                    if (var19.field805[var26] > field237) {
                        this.method41(var19.field818 / 2, var19, false);
                        if (this.field527 > -1) {
                            if (var26 == 1) {
                                this.field528 -= 20;
                            }
                            if (var26 == 2) {
                                this.field527 -= 15;
                                this.field528 -= 10;
                            }
                            if (var26 == 3) {
                                this.field527 += 15;
                                this.field528 -= 10;
                            }
                            this.field516[var19.field804[var26]].method193(this.field527 - 12, this.field408, this.field528 - 12);
                            this.field537.method573(String.valueOf(var19.field803[var26]), this.field528 + 4, this.field527, -193, 0);
                            this.field537.method573(String.valueOf(var19.field803[var26]), this.field528 + 3, this.field527 - 1, -193, 16777215);
                        }
                    }
                }
            }
        }
        ++field473;
        if (field473 > 58) {
            field473 = 0;
            this.field306.method281(245, this.field549);
        }
        for (int var3 = 0; var3 < this.field274; ++var3) {
            int var4 = this.field276[var3];
            int var5 = this.field277[var3];
            int var6 = this.field279[var3];
            int var7 = this.field278[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field277[var18] - this.field278[var18] && var5 - var7 < this.field277[var18] + 2 && var4 - var6 < this.field279[var18] + this.field276[var18] && var4 + var6 > this.field276[var18] - this.field279[var18] && this.field277[var18] - this.field278[var18] < var5) {
                        var5 = this.field277[var18] - this.field278[var18];
                        var8 = true;
                    }
                }
            }
            this.field527 = this.field276[var3];
            this.field528 = this.field277[var3] = var5;
            String var9 = this.field283[var3];
            if (this.field441 == 0) {
                int var10 = 16776960;
                if (this.field280[var3] < 6) {
                    var10 = this.field208[this.field280[var3]];
                }
                if (this.field280[var3] == 6) {
                    var10 = this.field429 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field280[var3] == 7) {
                    var10 = this.field429 % 20 < 10 ? 255 : 65535;
                }
                if (this.field280[var3] == 8) {
                    var10 = this.field429 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field280[var3] == 9) {
                    int var11 = 150 - this.field282[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field280[var3] == 10) {
                    int var12 = 150 - this.field282[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field280[var3] == 11) {
                    int var13 = 150 - this.field282[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field281[var3] == 0) {
                    this.field539.method573(var9, this.field528 + 1, this.field527, -193, 0);
                    this.field539.method573(var9, this.field528, this.field527, -193, var10);
                }
                if (this.field281[var3] == 1) {
                    this.field539.method578(0, this.field527, this.field429, 0, var9, this.field528 + 1);
                    this.field539.method578(var10, this.field527, this.field429, 0, var9, this.field528);
                }
                if (this.field281[var3] == 2) {
                    this.field539.method579(var9, this.field429, 0, this.field528 + 1, false, this.field527);
                    this.field539.method579(var9, this.field429, var10, this.field528, false, this.field527);
                }
                if (this.field281[var3] == 3) {
                    this.field539.method580(this.field429, 0, this.field527, this.field528 + 1, 150 - this.field282[var3], (byte) 8, var9);
                    this.field539.method580(this.field429, var10, this.field527, this.field528, 150 - this.field282[var3], (byte) 8, var9);
                }
                if (this.field281[var3] == 4) {
                    int var14 = this.field539.method576(-4, var9);
                    int var15 = (150 - this.field282[var3]) * (var14 + 100) / 150;
                    class1.method3(0, this.field527 + 50, false, this.field527 - 50, 334);
                    this.field539.method577(this.field528 + 1, var9, this.field527 + 50 - var15, 0, this.field340);
                    this.field539.method577(this.field528, var9, this.field527 + 50 - var15, var10, this.field340);
                    class1.method2((byte) -82);
                }
                if (this.field281[var3] == 5) {
                    int var16 = 150 - this.field282[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class1.method3(this.field528 - this.field539.field1695 - 1, 512, false, 0, this.field528 + 5);
                    this.field539.method573(var9, this.field528 + 1 + var17, this.field527, -193, 0);
                    this.field539.method573(var9, this.field528 + var17, this.field527, -193, var10);
                    class1.method2((byte) -82);
                }
            } else {
                this.field539.method573(var9, this.field528 + 1, this.field527, -193, 0);
                this.field539.method573(var9, this.field528, this.field527, -193, 16776960);
            }
        }
        if (arg0 != -27) {
            this.field306.method282(95);
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method109(boolean arg0) {
        ++this.field429;
        this.method110(769, true);
        this.method138(362, true);
        this.method110(769, false);
        this.method138(362, false);
        this.method112(161);
        this.method33((byte) 8);
        if (!this.field225) {
            int var2 = this.field373;
            if (this.field312 / 256 > var2) {
                var2 = this.field312 / 256;
            }
            if (this.field255[4] && this.field526[4] + 128 > var2) {
                var2 = this.field526[4] + 128;
            }
            int var3 = this.field402 + this.field374 & 2047;
            this.method144(this.field127, this.field126, var3, var2, this.method114(this.field360, field90.field816, (byte) 64, field90.field815) - 50, var2 * 3 + 600, -263);
        }
        int var4;
        if (!this.field225) {
            var4 = this.method38((byte) 77);
        } else {
            var4 = this.method39((byte) 5);
        }
        int var5 = this.field307;
        int var6 = this.field308;
        int var7 = this.field309;
        int var8 = this.field310;
        int var9 = this.field311;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field255[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field434[var10] * 2 + 1) - (double) this.field434[var10] + Math.sin((double) this.field338[var10] / 100.0D * (double) this.field316[var10]) * (double) this.field526[var10]);
                if (var10 == 0) {
                    this.field307 += var12;
                }
                if (var10 == 1) {
                    this.field308 += var12;
                }
                if (var10 == 2) {
                    this.field309 += var12;
                }
                if (var10 == 3) {
                    this.field311 = this.field311 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field310 += var12;
                    if (this.field310 < 128) {
                        this.field310 = 128;
                    }
                    if (this.field310 > 383) {
                        this.field310 = 383;
                    }
                }
            }
        }
        int var11 = class48.field1296;
        class35.field1051 = true;
        class35.field1054 = 0;
        class35.field1052 = super.field586 - 4;
        class35.field1053 = super.field587 - 4;
        class1.method4(-679);
        this.field367.method548(this.field307, var4, this.field310, this.field308, this.field311, this.field309, -23337);
        if (arg0) {
            this.field367.method523((byte) 3);
            this.method108((byte) -27);
            this.method120(993);
            this.method92(var11, 957);
            this.method87(634);
            this.field188.method14(super.field578, 4, 4, 0);
            this.field307 = var5;
            this.field308 = var6;
            this.field309 = var7;
            this.field310 = var8;
            this.field311 = var9;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method110(int arg0, boolean arg1) {
        if (field90.field815 >> 7 == this.field322 && field90.field816 >> 7 == this.field323) {
            this.field322 = 0;
        }
        int var3 = this.field416;
        int var4 = 12 / arg0;
        if (arg1) {
            var3 = 1;
        }
        for (int var5 = 0; var5 < var3; ++var5) {
            class21 var6;
            int var7;
            if (arg1) {
                var6 = field90;
                var7 = this.field414 << 14;
            } else {
                var6 = this.field415[this.field417[var5]];
                var7 = this.field417[var5] << 14;
            }
            if (var6 != null && var6.method241(105)) {
                var6.field773 = false;
                if ((field392 && this.field416 > 50 || this.field416 > 200) && !arg1 && var6.field835 == var6.field821) {
                    var6.field773 = true;
                }
                int var8 = var6.field815 >> 7;
                int var9 = var6.field816 >> 7;
                if (var8 >= 0 && var8 < 104 && var9 >= 0 && var9 < 104) {
                    if (var6.field770 != null && field237 >= var6.field783 && field237 < var6.field784) {
                        var6.field773 = false;
                        var6.field779 = this.method114(this.field360, var6.field816, (byte) 64, var6.field815);
                        this.field367.method521(var6.field816, var7, var6.field776, var6.field778, var6.field779, 60, var6.field775, var6.field777, this.field454, var6.field817, this.field360, var6, var6.field815);
                    } else {
                        if ((var6.field815 & 127) == 64 && (var6.field816 & 127) == 64) {
                            if (this.field366[var8][var9] == this.field429) {
                                continue;
                            }
                            this.field366[var8][var9] = this.field429;
                        }
                        var6.field779 = this.method114(this.field360, var6.field816, (byte) 64, var6.field815);
                        this.field367.method520(var6, var7, 60, var6.field817, var6.field779, 7, this.field360, var6.field815, var6.field816, var6.field826);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIB)V")
    public final void method111(boolean arg0, int arg1, byte arg2) {
        if (arg2 != 20) {
            this.field339 = -177;
        }
        signlink.midivol = arg1;
        if (arg0) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method112(int arg0) {
        class14 var2 = (class14) this.field227.method482();
        int var3 = 12 / arg0;
        while (var2 != null) {
            if (this.field360 == var2.field652 && field237 <= var2.field648) {
                if (field237 >= var2.field647) {
                    if (var2.field651 > 0) {
                        class43 var4 = this.field160[var2.field651 - 1];
                        if (var4 != null && var4.field815 >= 0 && var4.field815 < 13312 && var4.field816 >= 0 && var4.field816 < 13312) {
                            var2.method207(this.method114(var2.field652, var4.field816, (byte) 64, var4.field815) - var2.field661, var4.field816, false, var4.field815, field237);
                        }
                    }
                    if (var2.field651 < 0) {
                        int var5 = -var2.field651 - 1;
                        class21 var6;
                        if (this.field301 == var5) {
                            var6 = field90;
                        } else {
                            var6 = this.field415[var5];
                        }
                        if (var6 != null && var6.field815 >= 0 && var6.field815 < 13312 && var6.field816 >= 0 && var6.field816 < 13312) {
                            var2.method207(this.method114(var2.field652, var6.field816, (byte) 64, var6.field815) - var2.field661, var6.field816, false, var6.field815, field237);
                        }
                    }
                    var2.method205(0, this.field131);
                    this.field367.method520(var2, -1, 60, var2.field644, (int) var2.field666, 7, this.field360, (int) var2.field664, (int) var2.field665, false);
                }
            } else {
                var2.method397();
            }
            var2 = (class14) this.field227.method484(this.field493);
        }
        ++field265;
        if (field265 > 88) {
            field265 = 0;
            this.field306.method281(162, this.field549);
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(Z)Ljava/lang/String;")
    public final String method113(boolean arg0) {
        if (!arg0) {
            this.field306.method282(160);
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field581 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBI)I")
    public final int method114(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = arg3 >> 7;
        int var6 = arg1 >> 7;
        if (arg2 != 64) {
            this.field424 = -275;
        }
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg0;
            if (arg0 < 3 && (this.field205[1][var5][var6] & 2) == 2) {
                var7 = arg0 + 1;
            }
            int var8 = arg3 & 127;
            int var9 = arg1 & 127;
            int var10 = (128 - var8) * this.field370[var7][var5][var6] + this.field370[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field370[var7][var5][var6 + 1] + this.field370[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILUKJEXUVU;IIZIII)V")
    public final void method115(boolean arg0, int arg1, class61 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        if (this.field520) {
            this.field163 = 32;
        } else {
            this.field163 = 0;
        }
        this.field520 = false;
        if (arg5) {
            this.field549 = this.field249.method265();
        }
        if (arg8 >= arg4 && arg8 < arg4 + 16 && arg6 >= arg1 && arg6 < arg1 + 16) {
            arg2.field1547 -= this.field303 * 4;
            if (arg0) {
                this.field134 = true;
                return;
            }
        } else if (arg8 >= arg4 && arg8 < arg4 + 16 && arg6 >= arg1 + arg7 - 16 && arg6 < arg1 + arg7) {
            arg2.field1547 += this.field303 * 4;
            if (arg0) {
                this.field134 = true;
                return;
            }
        } else {
            if (arg8 < arg4 - this.field163 || arg8 >= arg4 + 16 + this.field163 || arg6 < arg1 + 16 || arg6 >= arg1 + arg7 - 16 || this.field303 <= 0) {
                return;
            }
            int var10 = (arg7 - 32) * arg7 / arg3;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg6 - arg1 - 16 - var10 / 2;
            int var12 = arg7 - 32 - var10;
            arg2.field1547 = (arg3 - arg7) * var11 / var12;
            if (arg0) {
                this.field134 = true;
            }
            this.field520 = true;
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method116(int arg0) {
        this.field450 = 0;
        int var2 = (field90.field815 >> 7) + this.field148;
        int var3 = (field90.field816 >> 7) + this.field149;
        if (arg0 < 3 || arg0 > 3) {
            field371 = 259;
        }
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field450 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field450 = 1;
        }
        if (this.field450 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field450 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)Z")
    public final boolean method117(byte arg0) {
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            this.field141 = !this.field141;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILUKJEXUVU;)Z")
    public final boolean method118(int arg0, class61 arg1) {
        int var3 = arg1.field1512;
        if (arg0 != 9) {
            this.method62();
        }
        if (this.field300 == 2) {
            if (var3 == 201) {
                this.field256 = true;
                this.field166 = 0;
                this.field365 = true;
                this.field290 = "";
                this.field206 = 1;
                this.field326 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field256 = true;
                this.field166 = 0;
                this.field365 = true;
                this.field290 = "";
                this.field206 = 2;
                this.field326 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field111 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field256 = true;
                this.field166 = 0;
                this.field365 = true;
                this.field290 = "";
                this.field206 = 4;
                this.field326 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field256 = true;
                this.field166 = 0;
                this.field365 = true;
                this.field290 = "";
                this.field206 = 5;
                this.field326 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field99[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class6.field558 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class6.field558) {
                                var6 = 0;
                            }
                        }
                        if (!class6.field559[var6].field565 && class6.field559[var6].field560 == var4 + (this.field467 ? 0 : 7)) {
                            this.field99[var4] = var6;
                            this.field254 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field544[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field293[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field293[var7].length) {
                        var9 = 0;
                    }
                }
                this.field544[var7] = var9;
                this.field254 = true;
            }
            if (var3 == 324 && !this.field467) {
                this.field467 = true;
                this.method95(0);
            }
            if (var3 == 325 && this.field467) {
                this.field467 = false;
                this.method95(0);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field289 = !this.field289;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method142(938);
                    if (this.field509.length() > 0) {
                        this.field306.method281(223, this.field549);
                        this.field306.method288(class44.method413(this.field509), (byte) 7);
                        this.field306.method282(var3 - 601);
                        this.field306.method282(this.field289 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field306.method281(66, this.field549);
                this.field306.method282(this.field467 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field306.method282(this.field99[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field306.method282(this.field544[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)Z")
    public final boolean method119(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 14 & 32767;
        int var6 = this.field367.method539(this.field360, arg2, arg0, arg3);
        int var7 = 62 / arg1;
        if (var6 == -1) {
            return false;
        } else {
            int var8 = var6 & 31;
            int var9 = var6 >> 6 & 3;
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method66(8, 2, 0, var8 + 1, 0, arg0, 0, false, var9, field90.field855[0], field90.field856[0], arg2);
            } else {
                class42 var10 = class42.method405(var5);
                int var11;
                int var12;
                if (var9 != 0 && var9 != 2) {
                    var11 = var10.field1166;
                    var12 = var10.field1134;
                } else {
                    var11 = var10.field1134;
                    var12 = var10.field1166;
                }
                int var13 = var10.field1127;
                if (var9 != 0) {
                    var13 = (var13 >> 4 - var9) + (var13 << var9 & 15);
                }
                this.method66(8, 2, var12, 0, var11, arg0, var13, false, 0, field90.field855[0], field90.field856[0], arg2);
            }
            this.field114 = super.field593;
            this.field115 = super.field594;
            this.field117 = 2;
            this.field116 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method120(int arg0) {
        if (arg0 <= 0) {
            this.field306.method282(97);
        }
        if (this.field487 == 2) {
            this.method42(this.field296 * 2, true, (this.field295 - this.field149 << 7) + this.field298, (this.field294 - this.field148 << 7) + this.field297);
            if (this.field527 > -1 && field237 % 20 < 10) {
                this.field460[2].method193(this.field527 - 12, this.field408, this.field528 - 28);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIIIII)V")
    public final void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field172.method500(arg1, this.field408, arg0);
        this.field173.method500(arg1, this.field408, arg0 + arg3 - 16);
        class1.method6(16, arg3 - 32, arg0 + 16, -19550, this.field496, arg1);
        int var7 = (arg3 - 32) * arg3 / arg2;
        if (arg4 >= 0) {
            this.field108 = this.field452.method292();
        }
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg3 - 32 - var7) * arg5 / (arg2 - arg3);
        class1.method6(16, var7, arg0 + 16 + var8, -19550, this.field495, arg1);
        class1.method11(arg1, arg0 + 16 + var8, var7, (byte) 4, this.field269);
        class1.method11(arg1 + 1, arg0 + 16 + var8, var7, (byte) 4, this.field269);
        class1.method9(this.field269, arg1, this.field224, arg0 + 16 + var8, 16);
        class1.method9(this.field269, arg1, this.field224, arg0 + 17 + var8, 16);
        class1.method11(arg1 + 15, arg0 + 16 + var8, var7, (byte) 4, this.field400);
        class1.method11(arg1 + 14, arg0 + 17 + var8, var7 - 1, (byte) 4, this.field400);
        class1.method9(this.field400, arg1, this.field224, arg0 + 15 + var8 + var7, 16);
        class1.method9(this.field400, arg1 + 1, this.field224, arg0 + 14 + var8 + var7, 15);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)V")
    public final void method122(byte arg0, int arg1) {
        if (arg0 != -45) {
            this.method62();
        }
        class61 var3 = class61.field1518[arg1];
        for (int var4 = 0; var4 < var3.field1529.length && var3.field1529[var4] != -1; ++var4) {
            class61 var5 = class61.field1518[var3.field1529[var4]];
            if (var5.field1537 == 1) {
                this.method122(this.field536, var5.field1519);
            }
            var5.field1536 = 0;
            var5.field1539 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method123(boolean arg0) {
        if (!arg0) {
            field378 = -147;
        }
        if (!this.field223 && !this.field204 && !this.field457) {
            ++field164;
            if (!this.field137) {
                this.method59(false, false);
            } else {
                this.method76((byte) -54);
            }
            this.field303 = 0;
        } else {
            this.method131((byte) 4);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BII)Z")
    public final boolean method124(byte[] arg0, int arg1, int arg2) {
        this.field107 += arg1;
        return arg0 == null ? true : signlink.wavesave(arg0, arg2);
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)Ljava/lang/String;")
    public final String method125(int arg0, int arg1) {
        if (arg1 < 1 || arg1 > 1) {
            this.method62();
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method126(byte arg0) {
        if (!this.field223 && !this.field204 && !this.field457) {
            ++field237;
            if (arg0 != -44) {
                field371 = this.field249.method265();
            }
            if (!this.field137) {
                this.method34(this.field503);
            } else {
                this.method86(0);
            }
            this.method145(167);
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public static final void method127(int arg0) {
        class62.field1577 = false;
        class48.field1276 = false;
        field392 = false;
        if (arg0 != 0) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
        class54.field1407 = false;
        class42.field1152 = false;
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method128(int arg0) {
        if (this.field85 != 0) {
            class70 var2 = this.field538;
            int var3 = 0;
            if (this.field210 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field335[var4] != null) {
                    int var5 = this.field333[var4];
                    String var6 = this.field334[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field228 == 0 || this.field228 == 1 && this.method82(var6, (byte) 0))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method577(var8, "From", var9, 0, this.field340);
                        var2.method577(var8 - 1, "From", var9, 65535, this.field340);
                        int var10 = var9 + var2.method575(true, "From ");
                        if (var7 == 1) {
                            this.field325[0].method500(var10, this.field408, var8 - 12);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field325[1].method500(var10, this.field408, var8 - 12);
                            var10 += 14;
                        }
                        var2.method577(var8, var6 + ": " + this.field335[var4], var10, 0, this.field340);
                        var2.method577(var8 - 1, var6 + ": " + this.field335[var4], var10, 65535, this.field340);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field228 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method577(var11, this.field335[var4], 4, 0, this.field340);
                        var2.method577(var11 - 1, this.field335[var4], 4, 65535, this.field340);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field228 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method577(var12, "To " + var6 + ": " + this.field335[var4], 4, 0, this.field340);
                        var2.method577(var12 - 1, "To " + var6 + ": " + this.field335[var4], 4, 65535, this.field340);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 <= 0) {
                this.field521 = null;
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method129(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field482[(var2 - 2 << 7) + var3] = 255;
            }
        }
        if (arg0 != 6) {
            this.field306.method282(125);
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field482[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field483[var14] = (this.field482[var14 - 1] + this.field482[var14 + 1] + this.field482[var14 - 128] + this.field482[var14 + 128]) / 4;
            }
        }
        this.field510 += 128;
        if (this.field510 > this.field220.length) {
            this.field510 -= this.field220.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method140(this.field266, this.field165[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field483[var11 + 128] - this.field220[this.field510 + var11 & this.field220.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field482[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field332[var8] = this.field332[var8 + 1];
        }
        this.field332[var2 - 1] = (int) (Math.sin((double) field237 / 14.0D) * 16.0D + Math.sin((double) field237 / 15.0D) * 14.0D + Math.sin((double) field237 / 16.0D) * 12.0D);
        if (this.field347 > 0) {
            this.field347 -= 4;
        }
        if (this.field348 > 0) {
            this.field348 -= 4;
        }
        if (this.field347 == 0 && this.field348 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field347 = 1024;
            }
            if (var9 == 1) {
                this.field348 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method130(int arg0) {
        int var2 = 21 / arg0;
        if (this.field169 == 0) {
            int var3 = super.field592;
            if (this.field176 == 1 && super.field593 >= 516 && super.field594 >= 160 && super.field593 <= 765 && super.field594 <= 205) {
                var3 = 0;
            }
            if (this.field523) {
                if (var3 != 1) {
                    int var4 = super.field586;
                    int var5 = super.field587;
                    if (this.field230 == 0) {
                        var4 -= 4;
                        var5 -= 4;
                    }
                    if (this.field230 == 1) {
                        var4 -= 553;
                        var5 -= 205;
                    }
                    if (this.field230 == 2) {
                        var4 -= 17;
                        var5 -= 357;
                    }
                    if (var4 < this.field231 - 10 || var4 > this.field233 + this.field231 + 10 || var5 < this.field232 - 10 || var5 > this.field234 + this.field232 + 10) {
                        this.field523 = false;
                        if (this.field230 == 1) {
                            this.field134 = true;
                        }
                        if (this.field230 == 2) {
                            this.field256 = true;
                        }
                    }
                }
                if (var3 == 1) {
                    int var6 = this.field231;
                    int var7 = this.field232;
                    int var8 = this.field233;
                    int var9 = super.field593;
                    int var10 = super.field594;
                    if (this.field230 == 0) {
                        var9 -= 4;
                        var10 -= 4;
                    }
                    if (this.field230 == 1) {
                        var9 -= 553;
                        var10 -= 205;
                    }
                    if (this.field230 == 2) {
                        var9 -= 17;
                        var10 -= 357;
                    }
                    int var11 = -1;
                    for (int var12 = 0; var12 < this.field341; ++var12) {
                        int var13 = (this.field341 - 1 - var12) * 15 + var7 + 31;
                        if (var9 > var6 && var9 < var6 + var8 && var10 > var13 - 13 && var10 < var13 + 3) {
                            var11 = var12;
                        }
                    }
                    if (var11 != -1) {
                        this.method162(false, var11);
                    }
                    this.field523 = false;
                    if (this.field230 == 1) {
                        this.field134 = true;
                    }
                    if (this.field230 == 2) {
                        this.field256 = true;
                        return;
                    }
                }
            } else {
                if (var3 == 1 && this.field341 > 0) {
                    int var14 = this.field499[this.field341 - 1];
                    if (var14 == 431 || var14 == 262 || var14 == 892 || var14 == 983 || var14 == 650 || var14 == 615 || var14 == 898 || var14 == 754 || var14 == 107 || var14 == 634 || var14 == 236 || var14 == 1072) {
                        int var15 = this.field497[this.field341 - 1];
                        int var16 = this.field498[this.field341 - 1];
                        class61 var17 = class61.field1518[var16];
                        if (var17.field1540 || var17.field1508) {
                            this.field209 = false;
                            this.field519 = 0;
                            this.field167 = var16;
                            this.field168 = var15;
                            this.field169 = 2;
                            this.field170 = super.field593;
                            this.field171 = super.field594;
                            if (class61.field1518[var16].field1541 == this.field112) {
                                this.field169 = 1;
                            }
                            if (class61.field1518[var16].field1541 == this.field119) {
                                this.field169 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var3 == 1 && (this.field494 == 1 || this.method157(this.field341 - 1, (byte) 75)) && this.field341 > 2) {
                    var3 = 2;
                }
                if (var3 == 1 && this.field341 > 0) {
                    this.method162(false, this.field341 - 1);
                }
                if (var3 != 2 || this.field341 <= 0) {
                    return;
                }
                this.method32(0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method131(byte arg0) {
        Graphics var2 = this.method135(8).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        if (arg0 == 4) {
            boolean var3 = false;
            this.method182(-266, 1);
            if (this.field204) {
                this.field506 = false;
                var2.setFont(new Font("Helvetica", 1, 16));
                var2.setColor(Color.yellow);
                byte var4 = 35;
                var2.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var4);
                int var6 = var4 + 50;
                var2.setColor(Color.white);
                var2.drawString("To fix this try the following (in order):", 30, var6);
                int var7 = var6 + 50;
                var2.setColor(Color.white);
                var2.setFont(new Font("Helvetica", 1, 12));
                var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var7);
                int var8 = var7 + 30;
                var2.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var8);
                int var9 = var8 + 30;
                var2.drawString("3: Try using a different game-world", 30, var9);
                int var11 = var9 + 30;
                var2.drawString("4: Try rebooting your computer", 30, var11);
                int var13 = var11 + 30;
                var2.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var13);
            }
            if (this.field457) {
                this.field506 = false;
                var2.setFont(new Font("Helvetica", 1, 20));
                var2.setColor(Color.white);
                var2.drawString("Error - unable to load game!", 50, 50);
                var2.drawString("To play RuneScape make sure you play from", 50, 100);
                var2.drawString("http://www.runescape.com", 50, 150);
            }
            if (this.field223) {
                this.field506 = false;
                var2.setColor(Color.yellow);
                byte var5 = 35;
                var2.drawString("Error a copy of RuneScape already appears to be loaded", 30, var5);
                int var10 = var5 + 50;
                var2.setColor(Color.white);
                var2.drawString("To fix this try the following (in order):", 30, var10);
                int var12 = var10 + 50;
                var2.setColor(Color.white);
                var2.setFont(new Font("Helvetica", 1, 12));
                var2.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var12);
                int var14 = var12 + 30;
                var2.drawString("2: Try rebooting your computer, and reloading", 30, var14);
                int var15 = var14 + 30;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILBYABUZFP;III)V")
    public final void method132(int arg0, class5 arg1, int arg2, int arg3, int arg4) {
        if (this.field341 < 400) {
            if (arg1.field50 != null) {
                arg1 = arg1.method26((byte) 2);
            }
            if (arg1 != null) {
                if (arg1.field48) {
                    String var6 = arg1.field69;
                    if (arg4 != 6) {
                        this.field340 = !this.field340;
                    }
                    if (arg1.field47 != 0) {
                        var6 = var6 + method169(arg1.field47, (byte) 29, field90.field765) + " (level-" + arg1.field47 + ")";
                    }
                    if (this.field442 == 1) {
                        this.field246[this.field341] = "Use " + this.field446 + " with @yel@" + var6;
                        this.field499[this.field341] = 900;
                        this.field500[this.field341] = arg3;
                        this.field497[this.field341] = arg0;
                        this.field498[this.field341] = arg2;
                        ++this.field341;
                    } else {
                        if (this.field176 == 1) {
                            if ((this.field178 & 2) == 2) {
                                this.field246[this.field341] = this.field179 + " @yel@" + var6;
                                this.field499[this.field341] = 384;
                                this.field500[this.field341] = arg3;
                                this.field497[this.field341] = arg0;
                                this.field498[this.field341] = arg2;
                                ++this.field341;
                                return;
                            }
                        } else {
                            if (arg1.field72 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg1.field72[var7] != null && !arg1.field72[var7].equalsIgnoreCase("attack")) {
                                        this.field246[this.field341] = arg1.field72[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field499[this.field341] = 648;
                                        }
                                        if (var7 == 1) {
                                            this.field499[this.field341] = 641;
                                        }
                                        if (var7 == 2) {
                                            this.field499[this.field341] = 495;
                                        }
                                        if (var7 == 3) {
                                            this.field499[this.field341] = 312;
                                        }
                                        if (var7 == 4) {
                                            this.field499[this.field341] = 837;
                                        }
                                        this.field500[this.field341] = arg3;
                                        this.field497[this.field341] = arg0;
                                        this.field498[this.field341] = arg2;
                                        ++this.field341;
                                    }
                                }
                            }
                            if (arg1.field72 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg1.field72[var8] != null && arg1.field72[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg1.field47 > field90.field765) {
                                            var9 = 2000;
                                        }
                                        this.field246[this.field341] = arg1.field72[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field499[this.field341] = var9 + 648;
                                        }
                                        if (var8 == 1) {
                                            this.field499[this.field341] = var9 + 641;
                                        }
                                        if (var8 == 2) {
                                            this.field499[this.field341] = var9 + 495;
                                        }
                                        if (var8 == 3) {
                                            this.field499[this.field341] = var9 + 312;
                                        }
                                        if (var8 == 4) {
                                            this.field499[this.field341] = var9 + 837;
                                        }
                                        this.field500[this.field341] = arg3;
                                        this.field497[this.field341] = arg0;
                                        this.field498[this.field341] = arg2;
                                        ++this.field341;
                                    }
                                }
                            }
                            this.field246[this.field341] = "Examine @yel@" + var6;
                            this.field499[this.field341] = 1235;
                            this.field500[this.field341] = arg3;
                            this.field497[this.field341] = arg0;
                            this.field498[this.field341] = arg2;
                            ++this.field341;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method133(int arg0, int arg1) {
        class56 var3 = this.field521[this.field360][arg0][arg1];
        if (var3 == null) {
            this.field367.method530(this.field360, arg0, arg1);
        } else {
            int var4 = -99999999;
            class26 var5 = null;
            for (class26 var6 = (class26) var3.method482(); var6 != null; var6 = (class26) var3.method484(this.field493)) {
                class45 var11 = class45.method428(var6.field873);
                int var12 = var11.field1212;
                if (var11.field1216) {
                    var12 = (var6.field874 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method480(this.field211, var5);
            class26 var7 = null;
            class26 var8 = null;
            for (class26 var9 = (class26) var3.method482(); var9 != null; var9 = (class26) var3.method484(this.field493)) {
                if (var5.field873 != var9.field873 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field873 != var9.field873 && var7.field873 != var9.field873 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field367.method516(var8, arg1, var10, (byte) 6, var5, var7, arg0, this.field360, this.method114(this.field360, arg1 * 128 + 64, (byte) 64, arg0 * 128 + 64));
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public void method134(int arg0) {
        System.out.println("============");
        if (arg0 != 0) {
            this.method62();
        }
        System.out.println("flame-cycle:" + this.field287);
        if (this.field217 != null) {
            System.out.println("Od-cycle:" + this.field217.field728);
        }
        System.out.println("loop-cycle:" + field237);
        System.out.println("draw-cycle:" + field164);
        System.out.println("ptype:" + this.field108);
        System.out.println("psize:" + this.field107);
        if (this.field248 != null) {
            this.field248.method215(0);
        }
        super.field575 = true;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)Ljava/awt/Component;")
    public final Component method135(int arg0) {
        if (arg0 < 8 || arg0 > 8) {
            this.field306.method282(241);
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field581 != null ? super.field581 : this;
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method136(int arg0) {
        if (arg0 == 0) {
            signlink.midifade = 0;
            signlink.midi = "stop";
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ILMUKVLYLC;I)V")
    private final void method137(int arg0, class33 arg1, int arg2) {
        int var4 = arg1.method303((byte) 8, 8);
        if (arg2 <= 0) {
            this.method62();
        }
        if (var4 < this.field416) {
            for (int var5 = var4; var5 < this.field416; ++var5) {
                this.field476[this.field475++] = this.field417[var5];
            }
        }
        if (var4 > this.field416) {
            signlink.reporterror(this.field455 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field416 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field417[var6];
                class21 var8 = this.field415[var7];
                int var9 = arg1.method303((byte) 8, 1);
                if (var9 == 0) {
                    this.field417[this.field416++] = var7;
                    var8.field844 = field237;
                } else {
                    int var10 = arg1.method303((byte) 8, 2);
                    if (var10 == 0) {
                        this.field417[this.field416++] = var7;
                        var8.field844 = field237;
                        this.field419[this.field418++] = var7;
                    } else if (var10 == 1) {
                        this.field417[this.field416++] = var7;
                        var8.field844 = field237;
                        int var11 = arg1.method303((byte) 8, 3);
                        var8.method247(var11, false, -634);
                        int var12 = arg1.method303((byte) 8, 1);
                        if (var12 == 1) {
                            this.field419[this.field418++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field417[this.field416++] = var7;
                        var8.field844 = field237;
                        int var13 = arg1.method303((byte) 8, 3);
                        var8.method247(var13, true, -634);
                        int var14 = arg1.method303((byte) 8, 3);
                        var8.method247(var14, true, -634);
                        int var15 = arg1.method303((byte) 8, 1);
                        if (var15 == 1) {
                            this.field419[this.field418++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field476[this.field475++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)V")
    public final void method138(int arg0, boolean arg1) {
        if (arg0 <= 0) {
            this.field521 = null;
        }
        for (int var3 = 0; var3 < this.field161; ++var3) {
            class43 var4 = this.field160[this.field162[var3]];
            int var5 = (this.field162[var3] << 14) + 536870912;
            if (var4 != null && var4.method241(105) && var4.field1177.field77 == arg1) {
                int var6 = var4.field815 >> 7;
                int var7 = var4.field816 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field858 == 1 && (var4.field815 & 127) == 64 && (var4.field816 & 127) == 64) {
                        if (this.field366[var6][var7] == this.field429) {
                            continue;
                        }
                        this.field366[var6][var7] = this.field429;
                    }
                    if (!var4.field1177.field48) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field367.method520(var4, var5, (var4.field858 - 1) * 64 + 60, var4.field817, this.method114(this.field360, var4.field816, (byte) 64, var4.field815), 7, this.field360, var4.field815, var4.field816, var4.field826);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 311);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field389 = Integer.parseInt(arg0[0]);
                field390 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method47((byte) 5);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method127(0);
                }
                if (arg0[3].equals("free")) {
                    field391 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field391 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method179(true, 503, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;)V")
    public final void method139(String arg0, boolean arg1, int arg2, String arg3) {
        if (arg2 == 0 && this.field286 != -1) {
            this.field305 = arg0;
            super.field592 = 0;
        }
        if (this.field119 == -1) {
            this.field256 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field333[var5] = this.field333[var5 - 1];
            this.field334[var5] = this.field334[var5 - 1];
            this.field335[var5] = this.field335[var5 - 1];
        }
        this.field333[0] = arg2;
        this.field334[0] = arg3;
        this.field137 &= arg1;
        this.field335[0] = arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLTOROBAKX;)V")
    public final void method140(boolean arg0, class59 arg1) {
        short var3 = 256;
        if (!arg0) {
            field259 = !field259;
        }
        for (int var4 = 0; var4 < this.field220.length; ++var4) {
            this.field220[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field220[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field221[var16] = (this.field220[var16 - 1] + this.field220[var16 + 1] + this.field220[var16 - 128] + this.field220[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field220;
            this.field220 = this.field221;
            this.field221 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field1477; ++var8) {
                for (int var9 = 0; var9 < arg1.field1476; ++var9) {
                    if (arg1.field1474[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field1478;
                        int var11 = var8 + 16 + arg1.field1479;
                        int var12 = (var11 << 7) + var10;
                        this.field220[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method141(boolean arg0) {
        if (!arg0) {
            this.method62();
        }
        this.field96 = true;
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method142(int arg0) {
        this.field306.method281(71, this.field549);
        int var2 = 32 / arg0;
        if (this.field511 != -1) {
            this.field511 = -1;
            this.field134 = true;
            this.field144 = false;
            this.field143 = true;
        }
        if (this.field119 != -1) {
            this.field119 = -1;
            this.field256 = true;
            this.field144 = false;
        }
        this.field112 = -1;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILMUKVLYLC;LHPYXKOFA;I)V")
    private final void method143(boolean arg0, int arg1, class33 arg2, class21 arg3, int arg4) {
        if (arg0) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        if ((arg1 & 256) != 0) {
            int var7 = arg2.method312(0);
            int var8 = arg2.method311((byte) -93);
            arg3.method248(var7, -343, field237, var8);
            arg3.field827 = field237 + 300;
            arg3.field828 = arg2.method312(0);
            arg3.field829 = arg2.method312(0);
        }
        if ((arg1 & 1024) != 0) {
            arg3.field845 = arg2.method320((byte) 1);
            int var9 = arg2.method325(2);
            arg3.field849 = var9 >> 16;
            arg3.field848 = (var9 & 65535) + field237;
            arg3.field846 = 0;
            arg3.field847 = 0;
            if (arg3.field848 > field237) {
                arg3.field846 = -1;
            }
            if (arg3.field845 == 65535) {
                arg3.field845 = -1;
            }
        }
        if ((arg1 & 16) != 0) {
            int var10 = arg2.method294();
            if (var10 == 65535) {
                var10 = -1;
            }
            int var11 = arg2.method312(0);
            if (arg3.field808 == var10 && var10 != -1) {
                int var12 = class58.field1453[var10].field1467;
                if (var12 == 1) {
                    arg3.field809 = 0;
                    arg3.field810 = 0;
                    arg3.field811 = var11;
                    arg3.field812 = 0;
                }
                if (var12 == 2) {
                    arg3.field812 = 0;
                }
            } else if (var10 == -1 || arg3.field808 == -1 || class58.field1453[var10].field1461 >= class58.field1453[arg3.field808].field1461) {
                arg3.field808 = var10;
                arg3.field809 = 0;
                arg3.field810 = 0;
                arg3.field811 = var11;
                arg3.field812 = 0;
                arg3.field857 = arg3.field824;
            }
        }
        if ((arg1 & 1) != 0) {
            arg3.field830 = arg2.method319(-206);
            if (arg3.field830 == 65535) {
                arg3.field830 = -1;
            }
        }
        if ((arg1 & 64) != 0) {
            arg3.field806 = arg2.method299();
            if (arg3.field806.charAt(0) == '~') {
                arg3.field806 = arg3.field806.substring(1);
                this.method139(arg3.field806, true, 2, arg3.field774);
            } else if (field90 == arg3) {
                this.method139(arg3.field806, true, 2, arg3.field774);
            }
            arg3.field831 = 0;
            arg3.field814 = 0;
            arg3.field819 = 150;
        }
        if ((arg1 & 512) != 0) {
            arg3.field837 = arg2.method312(0);
            arg3.field839 = arg2.method310(46155);
            arg3.field838 = arg2.method292();
            arg3.field840 = arg2.method311((byte) -93);
            arg3.field841 = arg2.method294() + field237;
            arg3.field842 = arg2.method320((byte) 1) + field237;
            arg3.field843 = arg2.method311((byte) -93);
            arg3.method246((byte) 2);
        }
        if ((arg1 & 8) != 0) {
            int var13 = arg2.method320((byte) 1);
            int var14 = arg2.method310(46155);
            int var15 = arg2.method311((byte) -93);
            int var16 = arg2.field954;
            if (arg3.field774 != null && arg3.field772) {
                long var17 = class44.method413(arg3.field774);
                boolean var19 = false;
                if (var14 <= 1) {
                    for (int var20 = 0; var20 < this.field548; ++var20) {
                        if (this.field140[var20] == var17) {
                            var19 = true;
                            break;
                        }
                    }
                }
                if (!var19 && this.field450 == 0) {
                    try {
                        this.field159.field954 = 0;
                        arg2.method329(0, var15, this.field159.field953, (byte) 8);
                        this.field159.field954 = 0;
                        String var21 = class4.method21(this.field159, 534, var15);
                        String var22 = class36.method369(var21, this.field395);
                        arg3.field806 = var22;
                        arg3.field831 = var13 >> 8;
                        arg3.field814 = var13 & 255;
                        arg3.field819 = 150;
                        if (var14 != 2 && var14 != 3) {
                            if (var14 == 1) {
                                this.method139(var22, true, 1, "@cr1@" + arg3.field774);
                            } else {
                                this.method139(var22, true, 2, arg3.field774);
                            }
                        } else {
                            this.method139(var22, true, 1, "@cr2@" + arg3.field774);
                        }
                    } catch (Exception var29) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg2.field954 = var15 + var16;
        }
        if ((arg1 & 4) != 0) {
            arg3.field833 = arg2.method318((byte) 2);
            arg3.field834 = arg2.method318((byte) 2);
        }
        if ((arg1 & 32) != 0) {
            int var24 = arg2.method312(0);
            byte[] var25 = new byte[var24];
            class33 var26 = new class33(field371, var25);
            arg2.method328(var25, this.field104, 0, var24);
            this.field420[arg4] = var26;
            arg3.method243(0, var26);
        }
        if ((arg1 & 2) != 0) {
            int var27 = arg2.method312(0);
            int var28 = arg2.method312(0);
            arg3.method248(var27, -343, field237, var28);
            arg3.field827 = field237 + 300;
            arg3.field828 = arg2.method312(0);
            arg3.field829 = arg2.method292();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg3 & 2047;
        int var9 = 2048 - arg2 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg5;
        if (var8 != 0) {
            int var13 = class35.field1056[var8];
            int var14 = class35.field1057[var8];
            int var15 = var11 * var14 - arg5 * var13 >> 16;
            var12 = var11 * var13 + arg5 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class35.field1056[var9];
            int var17 = class35.field1057[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field307 = arg1 - var10;
        this.field308 = arg4 - var11;
        if (arg6 == -263) {
            this.field309 = arg0 - var12;
            this.field310 = arg3;
            this.field311 = arg2;
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method145(int arg0) {
        int var2 = 48 / arg0;
        while (true) {
            class9 var3 = this.field217.method232();
            if (var3 == null) {
                return;
            }
            if (var3.field607 == 0) {
                class35.method332(1, var3.field611, var3.field609);
                if ((this.field217.method220(699, var3.field611) & 98) != 0) {
                    this.field134 = true;
                    if (this.field119 != -1) {
                        this.field256 = true;
                    }
                }
            }
            if (var3.field607 == 1 && var3.field609 != null) {
                class57.method488(0, var3.field609);
            }
            if (var3.field607 == 2 && this.field465 == var3.field611 && var3.field609 != null) {
                this.method52(var3.field609, true, this.field466);
            }
            if (var3.field607 == 3 && this.field319 == 1) {
                for (int var4 = 0; var4 < this.field411.length; ++var4) {
                    if (this.field350[var4] == var3.field611) {
                        this.field411[var4] = var3.field609;
                        if (var3.field609 == null) {
                            this.field350[var4] = -1;
                        }
                        break;
                    }
                    if (this.field351[var4] == var3.field611) {
                        this.field236[var4] = var3.field609;
                        if (var3.field609 == null) {
                            this.field351[var4] = -1;
                        }
                        break;
                    }
                }
            }
            if (var3.field607 == 93 && this.field217.method228(var3.field611, 26)) {
                class54.method464(6, new class33(field371, var3.field609), this.field217);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)V")
    public final void method146(int arg0, int arg1, int arg2) {
        int var4 = 0;
        this.field107 += arg1;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field335[var5] != null) {
                int var6 = this.field333[var5];
                int var7 = 70 - var4 * 14 + this.field321 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field334[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field194 == 0 || this.field194 == 1 && this.method82(var8, (byte) 0))) {
                    if (arg0 > var7 - 14 && arg0 <= var7 && !var8.equals(field90.field774)) {
                        if (this.field87 >= 1) {
                            this.field246[this.field341] = "Report abuse @whi@" + var8;
                            this.field499[this.field341] = 529;
                            ++this.field341;
                        }
                        this.field246[this.field341] = "Add ignore @whi@" + var8;
                        this.field499[this.field341] = 176;
                        ++this.field341;
                        this.field246[this.field341] = "Add friend @whi@" + var8;
                        this.field499[this.field341] = 521;
                        ++this.field341;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field85 == 0 && (var6 == 7 || this.field228 == 0 || this.field228 == 1 && this.method82(var8, (byte) 0))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        if (this.field87 >= 1) {
                            this.field246[this.field341] = "Report abuse @whi@" + var8;
                            this.field499[this.field341] = 529;
                            ++this.field341;
                        }
                        this.field246[this.field341] = "Add ignore @whi@" + var8;
                        this.field499[this.field341] = 176;
                        ++this.field341;
                        this.field246[this.field341] = "Add friend @whi@" + var8;
                        this.field499[this.field341] = 521;
                        ++this.field341;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field258 == 0 || this.field258 == 1 && this.method82(var8, (byte) 0))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field246[this.field341] = "Accept trade @whi@" + var8;
                        this.field499[this.field341] = 374;
                        ++this.field341;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field85 == 0 && this.field228 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field258 == 0 || this.field258 == 1 && this.method82(var8, (byte) 0))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field246[this.field341] = "Accept challenge @whi@" + var8;
                        this.field499[this.field341] = 35;
                        ++this.field341;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLUKJEXUVU;I)I")
    public final int method147(boolean arg0, class61 arg1, int arg2) {
        this.field137 &= arg0;
        if (arg1.field1538 != null && arg2 < arg1.field1538.length) {
            try {
                int[] var4 = arg1.field1538[arg2];
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
                        var9 = this.field546[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field263[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field529[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class61 var11 = class61.field1518[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class45.field1217 && (!class45.method428(var12).field1211 || field391)) {
                            for (int var13 = 0; var13 < var11.field1504.length; ++var13) {
                                if (var12 + 1 == var11.field1504[var13]) {
                                    var9 += var11.field1559[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field268[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field139[this.field263[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field268[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field90.field765;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class68.field1662; ++var14) {
                            if (class68.field1664[var14]) {
                                var9 += this.field263[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class61 var15 = class61.field1518[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class45.field1217 && (!class45.method428(var16).field1211 || field391)) {
                            for (int var17 = 0; var17 < var15.field1504.length; ++var17) {
                                if (var15.field1504[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field182;
                    }
                    if (var8 == 12) {
                        var9 = this.field247;
                    }
                    if (var8 == 13) {
                        int var18 = this.field268[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class18 var21 = class18.field741[var20];
                        int var22 = var21.field743;
                        int var23 = var21.field744;
                        int var24 = var21.field745;
                        int var25 = field136[var24 - var23];
                        var9 = this.field268[var22] >> var23 & var25;
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
                        var9 = (field90.field815 >> 7) + this.field148;
                    }
                    if (var8 == 19) {
                        var9 = (field90.field816 >> 7) + this.field149;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLUKJEXUVU;)Z")
    public final boolean method148(byte arg0, class61 arg1) {
        if (arg1.field1511 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field1511.length; ++var3) {
                int var5 = this.method147(true, arg1, var3);
                int var6 = arg1.field1557[var3];
                if (arg1.field1511[var3] == 2) {
                    if (var5 >= var6) {
                        return false;
                    }
                } else if (arg1.field1511[var3] == 3) {
                    if (var5 <= var6) {
                        return false;
                    }
                } else if (arg1.field1511[var3] == 4) {
                    if (var5 == var6) {
                        return false;
                    }
                } else if (var5 != var6) {
                    return false;
                }
            }
            if (arg0 != 9) {
                for (int var4 = 1; var4 > 0; ++var4) {
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method149(int arg0) {
        int var2 = this.field231;
        int var3 = this.field232;
        int var4 = this.field233;
        int var5 = this.field234;
        int var6 = 6116423;
        class1.method6(var4, var5, var3, -19550, var6, var2);
        class1.method6(var4 - 2, 16, var3 + 1, -19550, 0, var2 + 1);
        class1.method7(var2 + 1, var3 + 18, 0, var4 - 2, 0, var5 - 19);
        if (arg0 != 38352) {
            this.field454 = !this.field454;
        }
        this.field539.method577(var3 + 14, "Choose Option", var2 + 3, var6, this.field340);
        int var7 = super.field586;
        int var8 = super.field587;
        if (this.field230 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field230 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field230 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field341; ++var9) {
            int var10 = (this.field341 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field539.method581(this.field260, var10, var2 + 3, var11, true, this.field246[var9]);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LMWTZCFMC;I)V")
    private final void method150(class34 arg0, int arg1) {
        if (arg1 < 0) {
            int var3 = 0;
            int var4 = -1;
            int var5 = 0;
            int var6 = 0;
            if (arg0.field972 == 0) {
                var3 = this.field367.method535(arg0.field971, arg0.field973, arg0.field974);
            }
            if (arg0.field972 == 1) {
                var3 = this.field367.method536(arg0.field971, arg0.field974, 677, arg0.field973);
            }
            if (arg0.field972 == 2) {
                var3 = this.field367.method537(arg0.field971, arg0.field973, arg0.field974);
            }
            if (arg0.field972 == 3) {
                var3 = this.field367.method538(arg0.field971, arg0.field973, arg0.field974);
            }
            if (var3 != 0) {
                int var7 = this.field367.method539(arg0.field971, arg0.field973, arg0.field974, var3);
                var4 = var3 >> 14 & 32767;
                var5 = var7 & 31;
                var6 = var7 >> 6;
            }
            arg0.field968 = var4;
            arg0.field970 = var5;
            arg0.field969 = var6;
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method151(int arg0) {
        if (this.field195 == null) {
            super.field579 = null;
            this.field189 = null;
            this.field187 = null;
            this.field186 = null;
            this.field188 = null;
            this.field430 = null;
            this.field431 = null;
            this.field432 = null;
            this.field198 = new class2(265, this.method135(8), 2, 128);
            class1.method4(-679);
            this.field199 = new class2(265, this.method135(8), 2, 128);
            class1.method4(-679);
            this.field195 = new class2(171, this.method135(8), 2, 509);
            class1.method4(-679);
            this.field196 = new class2(132, this.method135(8), 2, 360);
            class1.method4(-679);
            this.field197 = new class2(200, this.method135(8), 2, 360);
            class1.method4(-679);
            this.field200 = new class2(238, this.method135(8), 2, 202);
            class1.method4(-679);
            this.field201 = new class2(238, this.method135(8), 2, 203);
            if (arg0 != -16108) {
                field378 = this.field249.method265();
            }
            class1.method4(-679);
            this.field202 = new class2(94, this.method135(8), 2, 74);
            class1.method4(-679);
            this.field203 = new class2(94, this.method135(8), 2, 75);
            class1.method4(-679);
            if (this.field218 != null) {
                this.method45(4);
                this.method57(false);
            }
            this.field96 = true;
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method152(int arg0) {
        this.field107 += arg0;
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method183(0);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field112 != -1 && this.field94 == this.field112) {
                        if (var2 == 8 && this.field509.length() > 0) {
                            this.field509 = this.field509.substring(0, this.field509.length() - 1);
                        }
                        break;
                    }
                    if (this.field365) {
                        if (var2 >= 32 && var2 <= 122 && this.field290.length() < 80) {
                            this.field290 = this.field290 + (char) var2;
                            this.field256 = true;
                        }
                        if (var2 == 8 && this.field290.length() > 0) {
                            this.field290 = this.field290.substring(0, this.field290.length() - 1);
                            this.field256 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field365 = false;
                            this.field256 = true;
                            if (this.field206 == 1) {
                                long var3 = class44.method413(this.field290);
                                this.method155(0, var3);
                            }
                            if (this.field206 == 2 && this.field299 > 0) {
                                long var5 = class44.method413(this.field290);
                                this.method56(var5, -30736);
                            }
                            if (this.field206 == 3 && this.field290.length() > 0) {
                                this.field306.method281(48, this.field549);
                                this.field306.method282(0);
                                int var7 = this.field306.field954;
                                this.field306.method288(this.field407, (byte) 7);
                                class4.method22(this.field306, -27732, this.field290);
                                this.field306.method291(this.field306.field954 - var7, 960);
                                this.field290 = class4.method23(this.field290, this.field395);
                                this.field290 = class36.method369(this.field290, this.field395);
                                this.method139(this.field290, true, 6, class44.method417((byte) 97, class44.method414((byte) 9, this.field407)));
                                if (this.field228 == 2) {
                                    this.field228 = 1;
                                    this.field315 = true;
                                    this.field306.method281(58, this.field549);
                                    this.field306.method282(this.field194);
                                    this.field306.method282(this.field228);
                                    this.field306.method282(this.field258);
                                }
                            }
                            if (this.field206 == 4 && this.field548 < 100) {
                                long var8 = class44.method413(this.field290);
                                this.method40(var8, 0);
                            }
                            if (this.field206 == 5 && this.field548 > 0) {
                                long var10 = class44.method413(this.field290);
                                this.method51(this.field190, var10);
                            }
                        }
                    } else if (this.field166 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field130.length() < 10) {
                            this.field130 = this.field130 + (char) var2;
                            this.field256 = true;
                        }
                        if (var2 == 8 && this.field130.length() > 0) {
                            this.field130 = this.field130.substring(0, this.field130.length() - 1);
                            this.field256 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field130.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field130);
                                } catch (Exception var22) {
                                }
                                this.field306.method281(55, this.field549);
                                this.field306.method286(var12);
                            }
                            this.field166 = 0;
                            this.field256 = true;
                        }
                    } else if (this.field166 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field130.length() < 12) {
                            this.field130 = this.field130 + (char) var2;
                            this.field256 = true;
                        }
                        if (var2 == 8 && this.field130.length() > 0) {
                            this.field130 = this.field130.substring(0, this.field130.length() - 1);
                            this.field256 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field130.length() > 0) {
                                this.field306.method281(244, this.field549);
                                this.field306.method288(class44.method413(this.field130), (byte) 7);
                            }
                            this.field166 = 0;
                            this.field256 = true;
                        }
                    } else if (this.field119 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field215.length() < 80) {
                            this.field215 = this.field215 + (char) var2;
                            this.field256 = true;
                        }
                        if (var2 == 8 && this.field215.length() > 0) {
                            this.field215 = this.field215.substring(0, this.field215.length() - 1);
                            this.field256 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field215.length() > 0) {
                            if (this.field87 == 2) {
                                if (this.field215.equals("::clientdrop")) {
                                    this.method68(true);
                                }
                                if (this.field215.equals("::lag")) {
                                    this.method134(0);
                                }
                                if (this.field215.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field217.method216(489, 2); ++var13) {
                                        this.field217.method217(2, (byte) 1, var13, 803);
                                    }
                                }
                                if (this.field215.equals("::fpson")) {
                                    field318 = true;
                                }
                                if (this.field215.equals("::fpsoff")) {
                                    field318 = false;
                                }
                                if (this.field215.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field474[var14].field919[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field215.startsWith("::")) {
                                this.field306.method281(7, this.field549);
                                this.field306.method282(this.field215.length() - 1);
                                this.field306.method289(this.field215.substring(2));
                            } else {
                                String var17 = this.field215.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field215 = this.field215.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field215 = this.field215.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field215 = this.field215.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field215 = this.field215.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field215 = this.field215.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field215 = this.field215.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field215 = this.field215.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field215 = this.field215.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field215 = this.field215.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field215 = this.field215.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field215 = this.field215.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field215 = this.field215.substring(6);
                                }
                                String var19 = this.field215.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field215 = this.field215.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field215 = this.field215.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field215 = this.field215.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field215 = this.field215.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field215 = this.field215.substring(6);
                                }
                                this.field306.method281(39, this.field549);
                                this.field306.method282(0);
                                int var21 = this.field306.field954;
                                this.field306.method282(var20);
                                this.field159.field954 = 0;
                                class4.method22(this.field159, -27732, this.field215);
                                this.field306.method327(false, this.field159.field953, this.field159.field954, 0);
                                this.field306.method308(405, var18);
                                this.field306.method291(this.field306.field954 - var21, 960);
                                this.field215 = class4.method23(this.field215, this.field395);
                                this.field215 = class36.method369(this.field215, this.field395);
                                field90.field806 = this.field215;
                                field90.field831 = var18;
                                field90.field814 = var20;
                                field90.field819 = 150;
                                if (this.field87 == 2) {
                                    this.method139(field90.field806, true, 2, "@cr2@" + field90.field774);
                                } else if (this.field87 == 1) {
                                    this.method139(field90.field806, true, 2, "@cr1@" + field90.field774);
                                } else {
                                    this.method139(field90.field806, true, 2, field90.field774);
                                }
                                if (this.field194 == 2) {
                                    this.field194 = 3;
                                    this.field315 = true;
                                    this.field306.method281(58, this.field549);
                                    this.field306.method282(this.field194);
                                    this.field306.method282(this.field228);
                                    this.field306.method282(this.field258);
                                }
                            }
                            this.field215 = "";
                            this.field256 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field509.length() < 12) {
                this.field509 = this.field509 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method153(int arg0, int arg1) {
        signlink.wavevol = arg1;
        if (arg0 != -39163) {
            this.field104 = this.field249.method265();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method154(String arg0) {
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(IJ)V")
    public final void method155(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field299 >= 100 && this.field317 != 1) {
                this.method139("Your friendlist is full. Max of 100 for free users, and 200 for members", true, 0, "");
            } else if (this.field299 >= 200) {
                this.method139("Your friendlist is full. Max of 100 for free users, and 200 for members", true, 0, "");
            } else {
                String var4 = class44.method417((byte) 97, class44.method414((byte) 9, arg1));
                if (arg0 != 0) {
                    this.field521 = null;
                }
                for (int var5 = 0; var5 < this.field299; ++var5) {
                    if (this.field547[var5] == arg1) {
                        this.method139(var4 + " is already on your friend list", true, 0, "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field548; ++var6) {
                    if (this.field140[var6] == arg1) {
                        this.method139("Please remove " + var4 + " from your ignore list first", true, 0, "");
                        return;
                    }
                }
                if (!var4.equals(field90.field774)) {
                    this.field135[this.field299] = var4;
                    this.field547[this.field299] = arg1;
                    this.field175[this.field299] = 0;
                    ++this.field299;
                    this.field134 = true;
                    this.field306.method281(233, this.field549);
                    this.field306.method288(arg1, (byte) 7);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILMUKVLYLC;)V")
    private final void method156(int arg0, int arg1, class33 arg2) {
        while (true) {
            if (arg2.field955 + 21 < arg1 * 8) {
                int var4 = arg2.method303((byte) 8, 14);
                if (var4 != 16383) {
                    if (this.field160[var4] == null) {
                        this.field160[var4] = new class43();
                    }
                    class43 var5 = this.field160[var4];
                    this.field162[this.field161++] = var4;
                    var5.field844 = field237;
                    int var6 = arg2.method303((byte) 8, 1);
                    int var7 = arg2.method303((byte) 8, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg2.method303((byte) 8, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = arg2.method303((byte) 8, 1);
                    if (var9 == 1) {
                        this.field419[this.field418++] = var4;
                    }
                    var5.field1177 = class5.method24(arg2.method303((byte) 8, 12));
                    var5.field858 = var5.field1177.field57;
                    var5.field854 = var5.field1177.field65;
                    var5.field850 = var5.field1177.field73;
                    var5.field851 = var5.field1177.field58;
                    var5.field852 = var5.field1177.field60;
                    var5.field853 = var5.field1177.field61;
                    var5.field835 = var5.field1177.field53;
                    var5.method245(field90.field856[0] + var8, var6 == 1, false, field90.field855[0] + var7);
                    continue;
                }
            }
            arg2.method304(8);
            int var10 = 34 / arg0;
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)Z")
    public final boolean method157(int arg0, byte arg1) {
        if (arg1 != 75) {
            throw new NullPointerException();
        } else if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field499[arg0];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 521;
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method158(int arg0) {
        try {
            this.field102 = -1;
            this.field152.method486();
            this.field227.method486();
            class48.method436(this.field271);
            this.method54(false);
            this.field367.method509((byte) 0);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field474[var2].method268();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field205[var3][var4][var5] = 0;
                    }
                }
            }
            class54 var6 = new class54(this.field205, 104, 104, this.field370, -360);
            int var7 = this.field411.length;
            this.field306.method281(253, this.field549);
            if (!this.field103) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field349[var8] >> 8) * 64 - this.field148;
                    int var10 = (this.field349[var8] & 255) * 64 - this.field149;
                    byte[] var11 = this.field411[var8];
                    if (var11 != null) {
                        var6.method455(var10, this.field474, (this.field180 - 6) * 8, 17521, (this.field181 - 6) * 8, var11, var9);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field349[var12] >> 8) * 64 - this.field148;
                    int var14 = (this.field349[var12] & 255) * 64 - this.field149;
                    byte[] var15 = this.field411[var12];
                    if (var15 == null && this.field181 < 800) {
                        var6.method457(false, 64, var13, var14, 64);
                    }
                }
                this.field306.method281(253, this.field549);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field236[var16];
                    if (var17 != null) {
                        int var18 = (this.field349[var16] >> 8) * 64 - this.field148;
                        int var19 = (this.field349[var16] & 255) * 64 - this.field149;
                        var6.method469(var19, this.field474, var17, (byte) 107, var18, this.field367);
                    }
                }
            }
            if (this.field103) {
                int var20 = 0;
                label248: while (true) {
                    if (var20 >= 4) {
                        for (int var30 = 0; var30 < 13; ++var30) {
                            for (int var31 = 0; var31 < 13; ++var31) {
                                int var32 = this.field459[0][var30][var31];
                                if (var32 == -1) {
                                    var6.method457(false, 8, var30 * 8, var31 * 8, 8);
                                }
                            }
                        }
                        this.field306.method281(253, this.field549);
                        int var33 = 0;
                        while (true) {
                            if (var33 >= 4) {
                                break label248;
                            }
                            for (int var34 = 0; var34 < 13; ++var34) {
                                for (int var35 = 0; var35 < 13; ++var35) {
                                    int var36 = this.field459[var33][var34][var35];
                                    if (var36 != -1) {
                                        int var37 = var36 >> 24 & 3;
                                        int var38 = var36 >> 1 & 3;
                                        int var39 = var36 >> 14 & 1023;
                                        int var40 = var36 >> 3 & 2047;
                                        int var41 = (var39 / 8 << 8) + var40 / 8;
                                        for (int var42 = 0; var42 < this.field349.length; ++var42) {
                                            if (this.field349[var42] == var41 && this.field236[var42] != null) {
                                                var6.method463(this.field339, var35 * 8, (var39 & 7) * 8, var38, this.field474, this.field367, var34 * 8, var33, var37, (var40 & 7) * 8, this.field236[var42]);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            ++var33;
                        }
                    }
                    for (int var21 = 0; var21 < 13; ++var21) {
                        for (int var22 = 0; var22 < 13; ++var22) {
                            int var23 = this.field459[var20][var21][var22];
                            if (var23 != -1) {
                                int var24 = var23 >> 24 & 3;
                                int var25 = var23 >> 1 & 3;
                                int var26 = var23 >> 14 & 1023;
                                int var27 = var23 >> 3 & 2047;
                                int var28 = (var26 / 8 << 8) + var27 / 8;
                                for (int var29 = 0; var29 < this.field349.length; ++var29) {
                                    if (this.field349[var29] == var28 && this.field411[var29] != null) {
                                        var6.method465(this.field411[var29], var21 * 8, var20, (var27 & 7) * 8, (var26 & 7) * 8, var24, false, this.field474, var22 * 8, var25);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field306.method281(253, this.field549);
            var6.method461(true, this.field367, this.field474);
            this.field188.method13((byte) -36);
            this.field306.method281(253, this.field549);
            int var43 = class54.field1413;
            if (var43 > this.field360) {
                var43 = this.field360;
            }
            if (var43 < this.field360 - 1) {
                int var44 = this.field360 - 1;
            }
            if (field392) {
                this.field367.method510(class54.field1413, 0);
            } else {
                this.field367.method510(0, 0);
            }
            for (int var45 = 0; var45 < 104; ++var45) {
                for (int var46 = 0; var46 < 104; ++var46) {
                    this.method133(var45, var46);
                }
            }
            ++field451;
            if (field451 > 115) {
                field451 = 0;
                this.field306.method281(189, this.field549);
                this.field306.method283(44029);
            }
            this.method160(-514);
        } catch (Exception var60) {
        }
        class42.field1128.method452();
        if (super.field581 != null) {
            this.field306.method281(211, this.field549);
            this.field306.method286(1057001181);
        }
        if (field392 && signlink.cache_dat != null) {
            int var48 = this.field217.method216(489, 0);
            for (int var49 = 0; var49 < var48; ++var49) {
                int var50 = this.field217.method220(699, var49);
                if ((var50 & 121) == 0) {
                    class35.method333(var49, (byte) 11);
                }
            }
        }
        System.gc();
        class48.method437(20, 0);
        int var51 = 49 / arg0;
        this.field217.method231((byte) 3);
        int var52 = (this.field180 - 6) / 8 - 1;
        int var53 = (this.field180 + 6) / 8 + 1;
        int var54 = (this.field181 - 6) / 8 - 1;
        int var55 = (this.field181 + 6) / 8 + 1;
        if (this.field355) {
            var52 = 49;
            var53 = 50;
            var54 = 49;
            var55 = 50;
        }
        for (int var56 = var52; var56 <= var53; ++var56) {
            for (int var57 = var54; var57 <= var55; ++var57) {
                if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                    int var58 = this.field217.method236(0, var56, true, var57);
                    if (var58 != -1) {
                        this.field217.method222(991, var58, 3);
                    }
                    int var59 = this.field217.method236(1, var56, true, var57);
                    if (var59 != -1) {
                        this.field217.method222(991, var59, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILMUKVLYLC;)V")
    public final void method159(int arg0, int arg1, class33 arg2) {
        if (arg0 == 43111) {
            if (arg1 == 254) {
                int var4 = arg2.method310(46155);
                int var5 = var4 >> 2;
                int var6 = var4 & 3;
                int var7 = this.field379[var5];
                int var8 = arg2.method294();
                int var9 = arg2.method312(0);
                int var10 = (var9 >> 4 & 7) + this.field105;
                int var11 = (var9 & 7) + this.field106;
                if (var10 >= 0 && var11 >= 0 && var10 < 103 && var11 < 103) {
                    int var12 = this.field370[this.field360][var10][var11];
                    int var13 = this.field370[this.field360][var10 + 1][var11];
                    int var14 = this.field370[this.field360][var10 + 1][var11 + 1];
                    int var15 = this.field370[this.field360][var10][var11 + 1];
                    if (var7 == 0) {
                        class27 var16 = this.field367.method531(this.field360, var11, var10, 3);
                        if (var16 != null) {
                            int var17 = var16.field883 >> 14 & 32767;
                            if (var5 == 2) {
                                var16.field881 = new class22(var8, var15, var13, 2, var14, var6 + 4, false, var12, (byte) 39, var17);
                                var16.field882 = new class22(var8, var15, var13, 2, var14, var6 + 1 & 3, false, var12, (byte) 39, var17);
                            } else {
                                var16.field881 = new class22(var8, var15, var13, var5, var14, var6, false, var12, (byte) 39, var17);
                            }
                        }
                    }
                    if (var7 == 1) {
                        class65 var18 = this.field367.method532(var11, 364, this.field360, var10);
                        if (var18 != null) {
                            var18.field1656 = new class22(var8, var15, var13, 4, var14, 0, false, var12, (byte) 39, var18.field1657 >> 14 & 32767);
                        }
                    }
                    if (var7 == 2) {
                        class39 var19 = this.field367.method533(var10, 458, this.field360, var11);
                        if (var5 == 11) {
                            var5 = 10;
                        }
                        if (var19 != null) {
                            var19.field1104 = new class22(var8, var15, var13, var5, var14, var6, false, var12, (byte) 39, var19.field1112 >> 14 & 32767);
                        }
                    }
                    if (var7 == 3) {
                        class41 var20 = this.field367.method534(-213, var10, this.field360, var11);
                        if (var20 != null) {
                            var20.field1121 = new class22(var8, var15, var13, 22, var14, var6, false, var12, (byte) 39, var20.field1122 >> 14 & 32767);
                        }
                    }
                }
            } else if (arg1 == 0) {
                int var21 = arg2.method292();
                int var22 = (var21 >> 4 & 7) + this.field105;
                int var23 = (var21 & 7) + this.field106;
                int var24 = arg2.method294();
                int var25 = arg2.method292();
                int var26 = arg2.method294();
                if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                    int var27 = var22 * 128 + 64;
                    int var28 = var23 * 128 + 64;
                    class47 var29 = new class47(this.method114(this.field360, var28, (byte) 64, var27) - var25, field237, (byte) 121, var24, var26, var27, this.field360, var28);
                    this.field152.method479(var29);
                }
            } else {
                if (arg1 == 28) {
                    int var30 = arg2.method292();
                    int var31 = (var30 >> 4 & 7) + this.field105;
                    int var32 = (var30 & 7) + this.field106;
                    int var33 = arg2.method294();
                    int var34 = arg2.method292();
                    int var35 = var34 >> 4 & 15;
                    int var36 = var34 & 7;
                    if (field90.field855[0] >= var31 - var35 && field90.field855[0] <= var31 + var35 && field90.field856[0] >= var32 - var35 && field90.field856[0] <= var32 + var35 && this.field358 && !field392 && this.field461 < 50) {
                        this.field364[this.field461] = var33;
                        this.field331[this.field461] = var36;
                        this.field330[this.field461] = class25.field867[var33];
                        ++this.field461;
                    }
                }
                if (arg1 == 54) {
                    int var37 = arg2.method311((byte) -93);
                    int var38 = (var37 >> 4 & 7) + this.field105;
                    int var39 = (var37 & 7) + this.field106;
                    int var40 = arg2.method312(0);
                    int var41 = var40 >> 2;
                    int var42 = var40 & 3;
                    int var43 = this.field379[var41];
                    if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                        this.method102(-1, var42, 5293, 0, var43, this.field360, var39, var41, -1, var38);
                    }
                } else if (arg1 == 85) {
                    int var44 = arg2.method292();
                    int var45 = (var44 >> 4 & 7) + this.field105;
                    int var46 = (var44 & 7) + this.field106;
                    int var47 = arg2.method294();
                    int var48 = arg2.method294();
                    int var49 = arg2.method294();
                    if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                        class56 var50 = this.field521[this.field360][var45][var46];
                        if (var50 != null) {
                            for (class26 var51 = (class26) var50.method482(); var51 != null; var51 = (class26) var50.method484(this.field493)) {
                                if ((var47 & 32767) == var51.field873 && var51.field874 == var48) {
                                    var51.field874 = var49;
                                    break;
                                }
                            }
                            this.method133(var45, var46);
                        }
                    }
                } else if (arg1 == 107) {
                    int var52 = arg2.method292();
                    int var53 = (var52 >> 4 & 7) + this.field105;
                    int var54 = (var52 & 7) + this.field106;
                    int var55 = var53 + arg2.method293();
                    int var56 = var54 + arg2.method293();
                    int var57 = arg2.method295();
                    int var58 = arg2.method294();
                    int var59 = arg2.method292() * 4;
                    int var60 = arg2.method292() * 4;
                    int var61 = arg2.method294();
                    int var62 = arg2.method294();
                    int var63 = arg2.method292();
                    int var64 = arg2.method292();
                    if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104 && var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104 && var58 != 65535) {
                        int var65 = var53 * 128 + 64;
                        int var66 = var54 * 128 + 64;
                        int var67 = var55 * 128 + 64;
                        int var68 = var56 * 128 + 64;
                        class14 var69 = new class14(field237 + var61, var57, this.field360, field237 + var62, -22512, var58, var65, var60, var64, this.method114(this.field360, var66, (byte) 64, var65) - var59, var63, var66);
                        var69.method207(this.method114(this.field360, var68, (byte) 64, var67) - var60, var68, false, var67, field237 + var61);
                        this.field227.method479(var69);
                    }
                } else if (arg1 == 245) {
                    int var70 = arg2.method310(46155);
                    int var71 = (var70 >> 4 & 7) + this.field105;
                    int var72 = (var70 & 7) + this.field106;
                    int var73 = arg2.method311((byte) -93);
                    int var74 = var73 >> 2;
                    int var75 = var73 & 3;
                    int var76 = this.field379[var74];
                    int var77 = arg2.method320((byte) 1);
                    if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104) {
                        this.method102(-1, var75, 5293, 0, var76, this.field360, var72, var74, var77, var71);
                    }
                } else if (arg1 == 219) {
                    int var78 = arg2.method319(-206);
                    int var79 = arg2.method311((byte) -93);
                    int var80 = (var79 >> 4 & 7) + this.field105;
                    int var81 = (var79 & 7) + this.field106;
                    int var82 = arg2.method318((byte) 2);
                    if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
                        class26 var83 = new class26();
                        var83.field873 = var82;
                        var83.field874 = var78;
                        if (this.field521[this.field360][var80][var81] == null) {
                            this.field521[this.field360][var80][var81] = new class56(306);
                        }
                        this.field521[this.field360][var80][var81].method479(var83);
                        this.method133(var80, var81);
                    }
                } else if (arg1 == 87) {
                    int var84 = arg2.method318((byte) 2);
                    int var85 = arg2.method320((byte) 1);
                    int var86 = arg2.method311((byte) -93);
                    int var87 = (var86 >> 4 & 7) + this.field105;
                    int var88 = (var86 & 7) + this.field106;
                    int var89 = arg2.method320((byte) 1);
                    if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104 && this.field301 != var84) {
                        class26 var90 = new class26();
                        var90.field873 = var85;
                        var90.field874 = var89;
                        if (this.field521[this.field360][var87][var88] == null) {
                            this.field521[this.field360][var87][var88] = new class56(306);
                        }
                        this.field521[this.field360][var87][var88].method479(var90);
                        this.method133(var87, var88);
                    }
                } else {
                    if (arg1 == 186) {
                        int var91 = arg2.method312(0);
                        int var92 = (var91 >> 4 & 7) + this.field105;
                        int var93 = (var91 & 7) + this.field106;
                        byte var94 = arg2.method314(33314);
                        byte var95 = arg2.method313(false);
                        byte var96 = arg2.method313(false);
                        int var97 = arg2.method320((byte) 1);
                        int var98 = arg2.method318((byte) 2);
                        int var99 = arg2.method292();
                        int var100 = var99 >> 2;
                        int var101 = var99 & 3;
                        int var102 = this.field379[var100];
                        int var103 = arg2.method294();
                        byte var104 = arg2.method313(false);
                        int var105 = arg2.method294();
                        class21 var106;
                        if (this.field301 == var97) {
                            var106 = field90;
                        } else {
                            var106 = this.field415[var97];
                        }
                        if (var106 != null) {
                            class42 var107 = class42.method405(var98);
                            int var108 = this.field370[this.field360][var92][var93];
                            int var109 = this.field370[this.field360][var92 + 1][var93];
                            int var110 = this.field370[this.field360][var92 + 1][var93 + 1];
                            int var111 = this.field370[this.field360][var92][var93 + 1];
                            class35 var112 = var107.method406(var100, var101, var108, var109, var110, var111, -1);
                            if (var112 != null) {
                                this.method102(var105 + 1, 0, 5293, var103 + 1, var102, this.field360, var93, 0, -1, var92);
                                var106.field783 = field237 + var103;
                                var106.field784 = field237 + var105;
                                var106.field770 = var112;
                                int var113 = var107.field1134;
                                int var114 = var107.field1166;
                                if (var101 == 1 || var101 == 3) {
                                    var113 = var107.field1166;
                                    var114 = var107.field1134;
                                }
                                var106.field767 = var92 * 128 + var113 * 64;
                                var106.field769 = var93 * 128 + var114 * 64;
                                var106.field768 = this.method114(this.field360, var106.field769, (byte) 64, var106.field767);
                                if (var104 > var96) {
                                    byte var115 = var104;
                                    var104 = var96;
                                    var96 = var115;
                                }
                                if (var94 > var95) {
                                    byte var116 = var94;
                                    var94 = var95;
                                    var95 = var116;
                                }
                                var106.field775 = var92 + var104;
                                var106.field777 = var92 + var96;
                                var106.field776 = var93 + var94;
                                var106.field778 = var93 + var95;
                            }
                        }
                    }
                    if (arg1 == 150) {
                        int var117 = arg2.method310(46155);
                        int var118 = (var117 >> 4 & 7) + this.field105;
                        int var119 = (var117 & 7) + this.field106;
                        int var120 = arg2.method319(-206);
                        if (var118 >= 0 && var119 >= 0 && var118 < 104 && var119 < 104) {
                            class56 var121 = this.field521[this.field360][var118][var119];
                            if (var121 != null) {
                                for (class26 var122 = (class26) var121.method482(); var122 != null; var122 = (class26) var121.method484(this.field493)) {
                                    if ((var120 & 32767) == var122.field873) {
                                        var122.method397();
                                        break;
                                    }
                                }
                                if (var121.method482() == null) {
                                    this.field521[this.field360][var118][var119] = null;
                                }
                                this.method133(var118, var119);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    private final void method160(int arg0) {
        if (arg0 >= 0) {
            this.method62();
        }
        for (class34 var2 = (class34) this.field336.method482(); var2 != null; var2 = (class34) this.field336.method484(this.field493)) {
            if (var2.field967 == -1) {
                var2.field975 = 0;
                this.method150(var2, -513);
            } else {
                var2.method397();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LUKJEXUVU;B)V")
    public final void method161(class61 arg0, byte arg1) {
        if (arg1 != -111) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int var4 = arg0.field1512;
        if (var4 >= 1 && var4 <= 100 || var4 >= 701 && var4 <= 800) {
            if (var4 == 1 && this.field300 == 0) {
                arg0.field1522 = "Loading friend list";
                arg0.field1532 = 0;
            } else if (var4 == 1 && this.field300 == 1) {
                arg0.field1522 = "Connecting to friendserver";
                arg0.field1532 = 0;
            } else if (var4 == 2 && this.field300 != 2) {
                arg0.field1522 = "Please wait...";
                arg0.field1532 = 0;
            } else {
                int var5 = this.field299;
                if (this.field300 != 2) {
                    var5 = 0;
                }
                if (var4 > 700) {
                    var4 -= 601;
                } else {
                    --var4;
                }
                if (var4 >= var5) {
                    arg0.field1522 = "";
                    arg0.field1532 = 0;
                } else {
                    arg0.field1522 = this.field135[var4];
                    arg0.field1532 = 1;
                }
            }
        } else if (var4 >= 101 && var4 <= 200 || var4 >= 801 && var4 <= 900) {
            int var6 = this.field299;
            if (this.field300 != 2) {
                var6 = 0;
            }
            if (var4 > 800) {
                var4 -= 701;
            } else {
                var4 -= 101;
            }
            if (var4 >= var6) {
                arg0.field1522 = "";
                arg0.field1532 = 0;
            } else {
                if (this.field175[var4] == 0) {
                    arg0.field1522 = "@red@Offline";
                } else if (this.field175[var4] == field389) {
                    arg0.field1522 = "@gre@World-" + (this.field175[var4] - 9);
                } else {
                    arg0.field1522 = "@yel@World-" + (this.field175[var4] - 9);
                }
                arg0.field1532 = 1;
            }
        } else if (var4 == 203) {
            int var7 = this.field299;
            if (this.field300 != 2) {
                var7 = 0;
            }
            arg0.field1506 = var7 * 15 + 20;
            if (arg0.field1506 <= arg0.field1556) {
                arg0.field1506 = arg0.field1556 + 1;
            }
        } else if (var4 >= 401 && var4 <= 500) {
            var4 -= 401;
            if (var4 == 0 && this.field300 == 0) {
                arg0.field1522 = "Loading ignore list";
                arg0.field1532 = 0;
            } else if (var4 == 1 && this.field300 == 0) {
                arg0.field1522 = "Please wait...";
                arg0.field1532 = 0;
            } else {
                int var8 = this.field548;
                if (this.field300 == 0) {
                    var8 = 0;
                }
                if (var4 >= var8) {
                    arg0.field1522 = "";
                    arg0.field1532 = 0;
                } else {
                    arg0.field1522 = class44.method417((byte) 97, class44.method414((byte) 9, this.field140[var4]));
                    arg0.field1532 = 1;
                }
            }
        } else if (var4 == 503) {
            arg0.field1506 = this.field548 * 15 + 20;
            if (arg0.field1506 <= arg0.field1556) {
                arg0.field1506 = arg0.field1556 + 1;
            }
        } else if (var4 == 327) {
            arg0.field1516 = 150;
            arg0.field1517 = (int) (Math.sin((double) field237 / 40.0D) * 256.0D) & 2047;
            if (this.field254) {
                for (int var9 = 0; var9 < 7; ++var9) {
                    int var16 = this.field99[var9];
                    if (var16 >= 0 && !class6.field559[var16].method175(this.field262)) {
                        return;
                    }
                }
                this.field254 = false;
                class35[] var10 = new class35[7];
                int var11 = 0;
                for (int var12 = 0; var12 < 7; ++var12) {
                    int var15 = this.field99[var12];
                    if (var15 >= 0) {
                        var10[var11++] = class6.field559[var15].method176(false);
                    }
                }
                class35 var13 = new class35(var10, 230, var11);
                for (int var14 = 0; var14 < 5; ++var14) {
                    if (this.field544[var14] != 0) {
                        var13.method348(field293[var14][0], field293[var14][this.field544[var14]]);
                        if (var14 == 1) {
                            var13.method348(field214[0], field214[this.field544[var14]]);
                        }
                    }
                }
                var13.method341(9566);
                var13.method342(true, class58.field1453[field90.field835].field1455[0]);
                var13.method351(64, 850, -30, -50, -30, true);
                arg0.field1566 = 5;
                arg0.field1567 = 0;
                class61.method503(893, var13, 0, 5);
            }
        } else if (var4 == 324) {
            if (this.field212 == null) {
                this.field212 = arg0.field1535;
                this.field213 = arg0.field1555;
            }
            if (this.field467) {
                arg0.field1535 = this.field213;
            } else {
                arg0.field1535 = this.field212;
            }
        } else if (var4 == 325) {
            if (this.field212 == null) {
                this.field212 = arg0.field1535;
                this.field213 = arg0.field1555;
            }
            if (this.field467) {
                arg0.field1535 = this.field212;
            } else {
                arg0.field1535 = this.field213;
            }
        } else if (var4 == 600) {
            arg0.field1522 = this.field509;
            if (field237 % 20 < 10) {
                arg0.field1522 = arg0.field1522 + "|";
            } else {
                arg0.field1522 = arg0.field1522 + " ";
            }
        } else {
            if (var4 == 613) {
                if (this.field87 >= 1) {
                    if (this.field289) {
                        arg0.field1563 = 16711680;
                        arg0.field1522 = "Moderator option: Mute player for 48 hours: <ON>";
                    } else {
                        arg0.field1563 = 16777215;
                        arg0.field1522 = "Moderator option: Mute player for 48 hours: <OFF>";
                    }
                } else {
                    arg0.field1522 = "";
                }
            }
            if (var4 == 650 || var4 == 655) {
                if (this.field512 != 0) {
                    String var17;
                    if (this.field122 == 0) {
                        var17 = "earlier today";
                    } else if (this.field122 == 1) {
                        var17 = "yesterday";
                    } else {
                        var17 = this.field122 + " days ago";
                    }
                    arg0.field1522 = "You last logged in " + var17 + " from: " + signlink.dns;
                } else {
                    arg0.field1522 = "";
                }
            }
            if (var4 == 651) {
                if (this.field377 == 0) {
                    arg0.field1522 = "0 unread messages";
                    arg0.field1563 = 16776960;
                }
                if (this.field377 == 1) {
                    arg0.field1522 = "1 unread message";
                    arg0.field1563 = 65280;
                }
                if (this.field377 > 1) {
                    arg0.field1522 = this.field377 + " unread messages";
                    arg0.field1563 = 65280;
                }
            }
            if (var4 == 652) {
                if (this.field270 == 201) {
                    if (this.field86 == 1) {
                        arg0.field1522 = "@yel@This is a non-members world: @whi@Since you are a member we";
                    } else {
                        arg0.field1522 = "";
                    }
                } else if (this.field270 == 200) {
                    arg0.field1522 = "You have not yet set any password recovery questions.";
                } else {
                    String var18;
                    if (this.field270 == 0) {
                        var18 = "Earlier today";
                    } else if (this.field270 == 1) {
                        var18 = "Yesterday";
                    } else {
                        var18 = this.field270 + " days ago";
                    }
                    arg0.field1522 = var18 + " you changed your recovery questions";
                }
            }
            if (var4 == 653) {
                if (this.field270 == 201) {
                    if (this.field86 == 1) {
                        arg0.field1522 = "@whi@recommend you use a members world instead. You may use";
                    } else {
                        arg0.field1522 = "";
                    }
                } else if (this.field270 == 200) {
                    arg0.field1522 = "We strongly recommend you do so now to secure your account.";
                } else {
                    arg0.field1522 = "If you do not remember making this change then cancel it immediately";
                }
            }
            if (var4 == 654) {
                if (this.field270 == 201) {
                    if (this.field86 == 1) {
                        arg0.field1522 = "@whi@this world but member benefits are unavailable whilst here.";
                    } else {
                        arg0.field1522 = "";
                    }
                } else if (this.field270 == 200) {
                    arg0.field1522 = "Do this from the 'account management' area on our front webpage";
                } else {
                    arg0.field1522 = "Do this from the 'account management' area on our front webpage";
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method162(boolean arg0, int arg1) {
        if (arg1 >= 0) {
            if (this.field166 != 0) {
                this.field166 = 0;
                this.field256 = true;
            }
            int var3 = this.field497[arg1];
            int var4 = this.field498[arg1];
            int var5 = this.field499[arg1];
            int var6 = this.field500[arg1];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 36) {
                this.method119(var4, 257, var3, var6);
                this.field306.method281(96, this.field549);
                this.field306.method317(this.field149 + var4, (byte) -34);
                this.field306.method283(var6 >> 14 & 32767);
                this.field306.method283(this.field148 + var3);
            }
            if (var5 == 1072) {
                class45 var7 = class45.method428(var6);
                class61 var8 = class61.field1518[var4];
                String var9;
                if (var8 != null && var8.field1559[var3] >= 100000) {
                    var9 = var8.field1559[var3] + " x " + var7.field1225;
                } else if (var7.field1214 != null) {
                    var9 = new String(var7.field1214);
                } else {
                    var9 = "It's a " + var7.field1225 + ".";
                }
                this.method139(var9, true, 0, "");
            }
            if (var5 == 1830) {
                int var10 = var6 >> 14 & 32767;
                class42 var11 = class42.method405(var10);
                String var12;
                if (var11.field1129 != null) {
                    var12 = new String(var11.field1129);
                } else {
                    var12 = "It's a " + var11.field1156 + ".";
                }
                this.method139(var12, true, 0, "");
            }
            if (var5 == 32) {
                boolean var13 = this.method66(8, 2, 0, 0, 0, var4, 0, false, 0, field90.field855[0], field90.field856[0], var3);
                if (!var13) {
                    this.method66(8, 2, 1, 0, 1, var4, 0, false, 0, field90.field855[0], field90.field856[0], var3);
                }
                this.field114 = super.field593;
                this.field115 = super.field594;
                this.field117 = 2;
                this.field116 = 0;
                this.field306.method281(236, this.field549);
                this.field306.method316((byte) 3, this.field149 + var4);
                this.field306.method316((byte) 3, var6);
                this.field306.method283(this.field148 + var3);
            }
            if (var5 == 192) {
                this.field306.method281(142, this.field549);
                this.field306.method317(var3, (byte) -34);
                this.field306.method315(var4, (byte) -118);
                this.field306.method317(this.field443, (byte) -34);
                this.field306.method283(this.field445);
                this.field306.method317(this.field444, (byte) -34);
                this.field306.method283(var6);
                this.field477 = 0;
                this.field478 = var4;
                this.field479 = var3;
                this.field480 = 2;
                if (class61.field1518[var4].field1541 == this.field112) {
                    this.field480 = 1;
                }
                if (class61.field1518[var4].field1541 == this.field119) {
                    this.field480 = 3;
                }
            }
            if (var5 == 634) {
                ++field463;
                if (field463 >= 139) {
                    this.field306.method281(143, this.field549);
                    this.field306.method282(249);
                    field463 = 0;
                }
                this.field306.method281(130, this.field549);
                this.field306.method315(var3, (byte) -118);
                this.field306.method315(var6, (byte) -118);
                this.field306.method315(var4, (byte) -118);
                this.field477 = 0;
                this.field478 = var4;
                this.field479 = var3;
                this.field480 = 2;
                if (class61.field1518[var4].field1541 == this.field112) {
                    this.field480 = 1;
                }
                if (class61.field1518[var4].field1541 == this.field119) {
                    this.field480 = 3;
                }
            }
            if (var5 == 512) {
                this.method119(var4, 257, var3, var6);
                this.field306.method281(27, this.field549);
                this.field306.method315(this.field148 + var3, (byte) -118);
                this.field306.method283(this.field149 + var4);
                this.field306.method317(var6 >> 14 & 32767, (byte) -34);
            }
            if (var5 == 52) {
                class21 var15 = this.field415[var6];
                if (var15 != null) {
                    this.method66(8, 2, 1, 0, 1, var15.field856[0], 0, false, 0, field90.field855[0], field90.field856[0], var15.field855[0]);
                    this.field114 = super.field593;
                    this.field115 = super.field594;
                    this.field117 = 2;
                    this.field116 = 0;
                    this.field306.method281(5, this.field549);
                    this.field306.method315(var6, (byte) -118);
                }
            }
            if (var5 == 495) {
                class43 var16 = this.field160[var6];
                if (var16 != null) {
                    this.method66(8, 2, 1, 0, 1, var16.field856[0], 0, false, 0, field90.field855[0], field90.field856[0], var16.field855[0]);
                    this.field114 = super.field593;
                    this.field115 = super.field594;
                    this.field117 = 2;
                    this.field116 = 0;
                    this.field306.method281(38, this.field549);
                    this.field306.method316((byte) 3, var6);
                }
            }
            if (var5 == 301) {
                class61 var17 = class61.field1518[var4];
                this.field176 = 1;
                this.field177 = var4;
                this.field178 = var17.field1546;
                this.field442 = 0;
                this.field134 = true;
                String var18 = var17.field1530;
                if (var18.indexOf(" ") != -1) {
                    var18 = var18.substring(0, var18.indexOf(" "));
                }
                String var19 = var17.field1530;
                if (var19.indexOf(" ") != -1) {
                    var19 = var19.substring(var19.indexOf(" ") + 1);
                }
                this.field179 = var18 + " " + var17.field1503 + " " + var19;
                if (this.field178 == 16) {
                    this.field134 = true;
                    this.field535 = 3;
                    this.field143 = true;
                }
            } else {
                if (var5 == 936) {
                    String var20 = this.field246[arg1];
                    int var21 = var20.indexOf("@whi@");
                    if (var21 != -1) {
                        long var22 = class44.method413(var20.substring(var21 + 5).trim());
                        int var24 = -1;
                        for (int var25 = 0; var25 < this.field299; ++var25) {
                            if (this.field547[var25] == var22) {
                                var24 = var25;
                                break;
                            }
                        }
                        if (var24 != -1 && this.field175[var24] > 0) {
                            this.field256 = true;
                            this.field166 = 0;
                            this.field365 = true;
                            this.field290 = "";
                            this.field206 = 3;
                            this.field407 = this.field547[var24];
                            this.field326 = "Enter message to send to " + this.field135[var24];
                        }
                    }
                }
                if (var5 == 212) {
                    this.field306.method281(57, this.field549);
                    this.field306.method283(var4);
                    class61 var26 = class61.field1518[var4];
                    if (var26.field1538 != null && var26.field1538[0][0] == 5) {
                        int var27 = var26.field1538[0][1];
                        this.field268[var27] = 1 - this.field268[var27];
                        this.method53(var27, 35758);
                        this.field134 = true;
                    }
                }
                if (var5 == 830) {
                    boolean var28 = this.method66(8, 2, 0, 0, 0, var4, 0, false, 0, field90.field855[0], field90.field856[0], var3);
                    if (!var28) {
                        this.method66(8, 2, 1, 0, 1, var4, 0, false, 0, field90.field855[0], field90.field856[0], var3);
                    }
                    this.field114 = super.field593;
                    this.field115 = super.field594;
                    this.field117 = 2;
                    this.field116 = 0;
                    this.field306.method281(182, this.field549);
                    this.field306.method316((byte) 3, this.field149 + var4);
                    this.field306.method317(this.field148 + var3, (byte) -34);
                    this.field306.method316((byte) 3, var6);
                }
                if (var5 == 107) {
                    this.field306.method281(208, this.field549);
                    this.field306.method315(var6, (byte) -118);
                    this.field306.method316((byte) 3, var3);
                    this.field306.method316((byte) 3, var4);
                    this.field477 = 0;
                    this.field478 = var4;
                    this.field479 = var3;
                    this.field480 = 2;
                    if (class61.field1518[var4].field1541 == this.field112) {
                        this.field480 = 1;
                    }
                    if (class61.field1518[var4].field1541 == this.field119) {
                        this.field480 = 3;
                    }
                }
                if (var5 == 420) {
                    boolean var30 = this.method66(8, 2, 0, 0, 0, var4, 0, false, 0, field90.field855[0], field90.field856[0], var3);
                    if (!var30) {
                        this.method66(8, 2, 1, 0, 1, var4, 0, false, 0, field90.field855[0], field90.field856[0], var3);
                    }
                    this.field114 = super.field593;
                    this.field115 = super.field594;
                    this.field117 = 2;
                    this.field116 = 0;
                    this.field306.method281(160, this.field549);
                    this.field306.method317(this.field148 + var3, (byte) -34);
                    this.field306.method316((byte) 3, var6);
                    this.field306.method316((byte) 3, this.field149 + var4);
                }
                if (var5 == 415) {
                    class61 var32 = class61.field1518[var4];
                    boolean var33 = true;
                    if (var32.field1512 > 0) {
                        var33 = this.method118(9, var32);
                    }
                    if (var33) {
                        this.field306.method281(57, this.field549);
                        this.field306.method283(var4);
                    }
                }
                if (var5 == 387) {
                    if (!this.field523) {
                        this.field367.method547(super.field594 - 4, super.field593 - 4, 4);
                    } else {
                        this.field367.method547(var4 - 4, var3 - 4, 4);
                    }
                }
                if (var5 == 374 || var5 == 35) {
                    String var34 = this.field246[arg1];
                    int var35 = var34.indexOf("@whi@");
                    if (var35 != -1) {
                        String var36 = var34.substring(var35 + 5).trim();
                        String var37 = class44.method417((byte) 97, class44.method414((byte) 9, class44.method413(var36)));
                        boolean var38 = false;
                        for (int var39 = 0; var39 < this.field416; ++var39) {
                            class21 var40 = this.field415[this.field417[var39]];
                            if (var40 != null && var40.field774 != null && var40.field774.equalsIgnoreCase(var37)) {
                                this.method66(8, 2, 1, 0, 1, var40.field856[0], 0, false, 0, field90.field855[0], field90.field856[0], var40.field855[0]);
                                if (var5 == 374) {
                                    this.field306.method281(5, this.field549);
                                    this.field306.method315(this.field417[var39], (byte) -118);
                                }
                                if (var5 == 35) {
                                    this.field306.method281(107, this.field549);
                                    this.field306.method317(this.field417[var39], (byte) -34);
                                }
                                var38 = true;
                                break;
                            }
                        }
                        if (!var38) {
                            this.method139("Unable to find " + var37, true, 0, "");
                        }
                    }
                }
                if (var5 == 591) {
                    class21 var41 = this.field415[var6];
                    if (var41 != null) {
                        this.method66(8, 2, 1, 0, 1, var41.field856[0], 0, false, 0, field90.field855[0], field90.field856[0], var41.field855[0]);
                        this.field114 = super.field593;
                        this.field115 = super.field594;
                        this.field117 = 2;
                        this.field116 = 0;
                        field257 += var6;
                        if (field257 >= 58) {
                            this.field306.method281(17, this.field549);
                            this.field306.method282(38);
                            field257 = 0;
                        }
                        this.field306.method281(204, this.field549);
                        this.field306.method315(var6, (byte) -118);
                    }
                }
                if (var5 == 321) {
                    boolean var42 = this.method66(8, 2, 0, 0, 0, var4, 0, false, 0, field90.field855[0], field90.field856[0], var3);
                    if (!var42) {
                        this.method66(8, 2, 1, 0, 1, var4, 0, false, 0, field90.field855[0], field90.field856[0], var3);
                    }
                    this.field114 = super.field593;
                    this.field115 = super.field594;
                    this.field117 = 2;
                    this.field116 = 0;
                    field507 += var3;
                    if (field507 >= 53) {
                        this.field306.method281(132, this.field549);
                        field507 = 0;
                    }
                    this.field306.method281(203, this.field549);
                    this.field306.method317(this.field149 + var4, (byte) -34);
                    this.field306.method317(var6, (byte) -34);
                    this.field306.method317(this.field148 + var3, (byte) -34);
                }
                if (var5 == 944 && this.method119(var4, 257, var3, var6)) {
                    this.field306.method281(54, this.field549);
                    this.field306.method315(this.field148 + var3, (byte) -118);
                    this.field306.method316((byte) 3, this.field177);
                    this.field306.method283(var6 >> 14 & 32767);
                    this.field306.method283(this.field149 + var4);
                }
                if (var5 == 786) {
                    this.method119(var4, 257, var3, var6);
                    this.field306.method281(133, this.field549);
                    this.field306.method316((byte) 3, this.field148 + var3);
                    this.field306.method283(this.field149 + var4);
                    this.field306.method315(var6 >> 14 & 32767, (byte) -118);
                }
                if (var5 == 602) {
                    this.method119(var4, 257, var3, var6);
                    this.field306.method281(4, this.field549);
                    this.field306.method283(this.field148 + var3);
                    this.field306.method316((byte) 3, var6 >> 14 & 32767);
                    this.field306.method316((byte) 3, this.field149 + var4);
                }
                if (var5 == 648) {
                    class43 var44 = this.field160[var6];
                    if (var44 != null) {
                        this.method66(8, 2, 1, 0, 1, var44.field856[0], 0, false, 0, field90.field855[0], field90.field856[0], var44.field855[0]);
                        this.field114 = super.field593;
                        this.field115 = super.field594;
                        this.field117 = 2;
                        this.field116 = 0;
                        if ((var6 & 3) == 0) {
                            ++field486;
                        }
                        if (field486 >= 76) {
                            this.field306.method281(169, this.field549);
                            field486 = 0;
                        }
                        this.field306.method281(139, this.field549);
                        this.field306.method317(var6, (byte) -34);
                    }
                }
                if (var5 == 754) {
                    this.field306.method281(238, this.field549);
                    this.field306.method317(var6, (byte) -34);
                    this.field306.method316((byte) 3, var3);
                    this.field306.method315(var4, (byte) -118);
                    this.field477 = 0;
                    this.field478 = var4;
                    this.field479 = var3;
                    this.field480 = 2;
                    if (class61.field1518[var4].field1541 == this.field112) {
                        this.field480 = 1;
                    }
                    if (class61.field1518[var4].field1541 == this.field119) {
                        this.field480 = 3;
                    }
                }
                if (var5 == 926) {
                    class21 var45 = this.field415[var6];
                    if (var45 != null) {
                        this.method66(8, 2, 1, 0, 1, var45.field856[0], 0, false, 0, field90.field855[0], field90.field856[0], var45.field855[0]);
                        this.field114 = super.field593;
                        this.field115 = super.field594;
                        this.field117 = 2;
                        this.field116 = 0;
                        this.field306.method281(243, this.field549);
                        this.field306.method283(this.field177);
                        this.field306.method315(var6, (byte) -118);
                    }
                }
                if (var5 == 384) {
                    class43 var46 = this.field160[var6];
                    if (var46 != null) {
                        this.method66(8, 2, 1, 0, 1, var46.field856[0], 0, false, 0, field90.field855[0], field90.field856[0], var46.field855[0]);
                        this.field114 = super.field593;
                        this.field115 = super.field594;
                        this.field117 = 2;
                        this.field116 = 0;
                        this.field306.method281(75, this.field549);
                        this.field306.method283(this.field177);
                        this.field306.method283(var6);
                    }
                }
                if (var5 == 799 && !this.field144) {
                    this.field306.method281(28, this.field549);
                    this.field306.method283(var4);
                    this.field144 = true;
                }
                if (var5 == 1118) {
                    class45 var47 = class45.method428(var6);
                    String var48;
                    if (var47.field1214 != null) {
                        var48 = new String(var47.field1214);
                    } else {
                        var48 = "It's a " + var47.field1225 + ".";
                    }
                    this.method139(var48, true, 0, "");
                }
                if (var5 == 615) {
                    this.field306.method281(85, this.field549);
                    this.field306.method315(var6, (byte) -118);
                    this.field306.method315(var4, (byte) -118);
                    this.field306.method317(var3, (byte) -34);
                    this.field477 = 0;
                    this.field478 = var4;
                    this.field479 = var3;
                    this.field480 = 2;
                    if (class61.field1518[var4].field1541 == this.field112) {
                        this.field480 = 1;
                    }
                    if (class61.field1518[var4].field1541 == this.field119) {
                        this.field480 = 3;
                    }
                }
                if (var5 == 521 || var5 == 176 || var5 == 129 || var5 == 813) {
                    String var49 = this.field246[arg1];
                    int var50 = var49.indexOf("@whi@");
                    if (var50 != -1) {
                        long var51 = class44.method413(var49.substring(var50 + 5).trim());
                        if (var5 == 521) {
                            this.method155(0, var51);
                        }
                        if (var5 == 176) {
                            this.method40(var51, 0);
                        }
                        if (var5 == 129) {
                            this.method56(var51, -30736);
                        }
                        if (var5 == 813) {
                            this.method51(this.field190, var51);
                        }
                    }
                }
                if (var5 == 967) {
                    class21 var53 = this.field415[var6];
                    if (var53 != null) {
                        this.method66(8, 2, 1, 0, 1, var53.field856[0], 0, false, 0, field90.field855[0], field90.field856[0], var53.field855[0]);
                        this.field114 = super.field593;
                        this.field115 = super.field594;
                        this.field117 = 2;
                        this.field116 = 0;
                        this.field306.method281(82, this.field549);
                        this.field306.method283(var6);
                    }
                }
                if (var5 == 892) {
                    this.field306.method281(74, this.field549);
                    this.field306.method315(var6, (byte) -118);
                    this.field306.method283(var3);
                    this.field306.method317(var4, (byte) -34);
                    this.field477 = 0;
                    this.field478 = var4;
                    this.field479 = var3;
                    this.field480 = 2;
                    if (class61.field1518[var4].field1541 == this.field112) {
                        this.field480 = 1;
                    }
                    if (class61.field1518[var4].field1541 == this.field119) {
                        this.field480 = 3;
                    }
                }
                if (var5 == 549) {
                    class21 var54 = this.field415[var6];
                    if (var54 != null) {
                        this.method66(8, 2, 1, 0, 1, var54.field856[0], 0, false, 0, field90.field855[0], field90.field856[0], var54.field855[0]);
                        this.field114 = super.field593;
                        this.field115 = super.field594;
                        this.field117 = 2;
                        this.field116 = 0;
                        this.field306.method281(51, this.field549);
                        this.field306.method283(var6);
                    }
                }
                if (var5 == 529) {
                    String var55 = this.field246[arg1];
                    int var56 = var55.indexOf("@whi@");
                    if (var56 != -1) {
                        if (this.field112 == -1) {
                            this.method142(938);
                            this.field509 = var55.substring(var56 + 5).trim();
                            this.field289 = false;
                            for (int var57 = 0; var57 < class61.field1518.length; ++var57) {
                                if (class61.field1518[var57] != null && class61.field1518[var57].field1512 == 600) {
                                    this.field94 = this.field112 = class61.field1518[var57].field1541;
                                    break;
                                }
                            }
                        } else {
                            this.method139("Please close the interface you have open before using 'report abuse'", true, 0, "");
                        }
                    }
                }
                if (var5 == 641) {
                    class43 var58 = this.field160[var6];
                    if (var58 != null) {
                        this.method66(8, 2, 1, 0, 1, var58.field856[0], 0, false, 0, field90.field855[0], field90.field856[0], var58.field855[0]);
                        this.field114 = super.field593;
                        this.field115 = super.field594;
                        this.field117 = 2;
                        this.field116 = 0;
                        this.field306.method281(197, this.field549);
                        this.field306.method283(var6);
                    }
                }
                if (var5 == 837) {
                    class43 var59 = this.field160[var6];
                    if (var59 != null) {
                        this.method66(8, 2, 1, 0, 1, var59.field856[0], 0, false, 0, field90.field855[0], field90.field856[0], var59.field855[0]);
                        this.field114 = super.field593;
                        this.field115 = super.field594;
                        this.field117 = 2;
                        this.field116 = 0;
                        this.field306.method281(206, this.field549);
                        this.field306.method283(var6);
                    }
                }
                if (var5 == 900) {
                    class43 var60 = this.field160[var6];
                    if (var60 != null) {
                        this.method66(8, 2, 1, 0, 1, var60.field856[0], 0, false, 0, field90.field855[0], field90.field856[0], var60.field855[0]);
                        this.field114 = super.field593;
                        this.field115 = super.field594;
                        this.field117 = 2;
                        this.field116 = 0;
                        this.field306.method281(181, this.field549);
                        this.field306.method316((byte) 3, this.field444);
                        this.field306.method316((byte) 3, var6);
                        this.field306.method283(this.field445);
                        this.field306.method316((byte) 3, this.field443);
                    }
                }
                if (var5 == 262) {
                    this.field306.method281(72, this.field549);
                    this.field306.method315(var3, (byte) -118);
                    this.field306.method317(var6, (byte) -34);
                    this.field306.method283(var4);
                    this.field477 = 0;
                    this.field478 = var4;
                    this.field479 = var3;
                    this.field480 = 2;
                    if (class61.field1518[var4].field1541 == this.field112) {
                        this.field480 = 1;
                    }
                    if (class61.field1518[var4].field1541 == this.field119) {
                        this.field480 = 3;
                    }
                }
                if (var5 == 312) {
                    class43 var61 = this.field160[var6];
                    if (var61 != null) {
                        this.method66(8, 2, 1, 0, 1, var61.field856[0], 0, false, 0, field90.field855[0], field90.field856[0], var61.field855[0]);
                        this.field114 = super.field593;
                        this.field115 = super.field594;
                        this.field117 = 2;
                        this.field116 = 0;
                        field226 += var6;
                        if (field226 >= 95) {
                            this.field306.method281(50, this.field549);
                            field226 = 0;
                        }
                        this.field306.method281(183, this.field549);
                        this.field306.method316((byte) 3, var6);
                    }
                }
                if (var5 == 650) {
                    this.field306.method281(157, this.field549);
                    this.field306.method315(var3, (byte) -118);
                    this.field306.method315(var6, (byte) -118);
                    this.field306.method315(var4, (byte) -118);
                    this.field477 = 0;
                    this.field478 = var4;
                    this.field479 = var3;
                    this.field480 = 2;
                    if (class61.field1518[var4].field1541 == this.field112) {
                        this.field480 = 1;
                    }
                    if (class61.field1518[var4].field1541 == this.field119) {
                        this.field480 = 3;
                    }
                }
                if (var5 == 445) {
                    this.field306.method281(145, this.field549);
                    this.field306.method316((byte) 3, var4);
                    this.field306.method315(this.field177, (byte) -118);
                    this.field306.method315(var6, (byte) -118);
                    this.field306.method283(var3);
                    this.field477 = 0;
                    this.field478 = var4;
                    this.field479 = var3;
                    this.field480 = 2;
                    if (class61.field1518[var4].field1541 == this.field112) {
                        this.field480 = 1;
                    }
                    if (class61.field1518[var4].field1541 == this.field119) {
                        this.field480 = 3;
                    }
                }
                if (var5 == 636) {
                    class21 var62 = this.field415[var6];
                    if (var62 != null) {
                        this.method66(8, 2, 1, 0, 1, var62.field856[0], 0, false, 0, field90.field855[0], field90.field856[0], var62.field855[0]);
                        this.field114 = super.field593;
                        this.field115 = super.field594;
                        this.field117 = 2;
                        this.field116 = 0;
                        this.field306.method281(198, this.field549);
                        this.field306.method283(this.field445);
                        this.field306.method316((byte) 3, var6);
                        this.field306.method317(this.field444, (byte) -34);
                        this.field306.method316((byte) 3, this.field443);
                    }
                }
                if (var5 == 913) {
                    this.method142(938);
                }
                if (var5 == 236) {
                    this.field442 = 1;
                    this.field443 = var3;
                    this.field444 = var4;
                    this.field445 = var6;
                    this.field446 = class45.method428(var6).field1225;
                    this.field176 = 0;
                    this.field134 = true;
                } else {
                    if (var5 == 359) {
                        class21 var63 = this.field415[var6];
                        if (var63 != null) {
                            this.method66(8, 2, 1, 0, 1, var63.field856[0], 0, false, 0, field90.field855[0], field90.field856[0], var63.field855[0]);
                            this.field114 = super.field593;
                            this.field115 = super.field594;
                            this.field117 = 2;
                            this.field116 = 0;
                            this.field306.method281(107, this.field549);
                            this.field306.method317(var6, (byte) -34);
                        }
                    }
                    if (var5 == 938) {
                        this.field306.method281(57, this.field549);
                        this.field306.method283(var4);
                        class61 var64 = class61.field1518[var4];
                        if (var64.field1538 != null && var64.field1538[0][0] == 5) {
                            int var65 = var64.field1538[0][1];
                            if (this.field268[var65] != var64.field1557[0]) {
                                this.field268[var65] = var64.field1557[0];
                                this.method53(var65, 35758);
                                this.field134 = true;
                            }
                        }
                    }
                    if (var5 == 84) {
                        boolean var66 = this.method66(8, 2, 0, 0, 0, var4, 0, false, 0, field90.field855[0], field90.field856[0], var3);
                        if (!var66) {
                            this.method66(8, 2, 1, 0, 1, var4, 0, false, 0, field90.field855[0], field90.field856[0], var3);
                        }
                        this.field114 = super.field593;
                        this.field115 = super.field594;
                        this.field117 = 2;
                        this.field116 = 0;
                        this.field306.method281(121, this.field549);
                        this.field306.method316((byte) 3, this.field149 + var4);
                        this.field306.method283(var6);
                        this.field306.method317(this.field148 + var3, (byte) -34);
                        this.field306.method283(this.field177);
                    }
                    if (var5 == 983) {
                        if ((var4 & 3) == 0) {
                            ++field84;
                        }
                        if (field84 >= 130) {
                            this.field306.method281(12, this.field549);
                            field84 = 0;
                        }
                        this.field306.method281(168, this.field549);
                        this.field306.method317(var3, (byte) -34);
                        this.field306.method315(var6, (byte) -118);
                        this.field306.method283(var4);
                        this.field477 = 0;
                        this.field478 = var4;
                        this.field479 = var3;
                        this.field480 = 2;
                        if (class61.field1518[var4].field1541 == this.field112) {
                            this.field480 = 1;
                        }
                        if (class61.field1518[var4].field1541 == this.field119) {
                            this.field480 = 3;
                        }
                    }
                    if (var5 == 345) {
                        boolean var68 = this.method66(8, 2, 0, 0, 0, var4, 0, false, 0, field90.field855[0], field90.field856[0], var3);
                        if (!var68) {
                            this.method66(8, 2, 1, 0, 1, var4, 0, false, 0, field90.field855[0], field90.field856[0], var3);
                        }
                        this.field114 = super.field593;
                        this.field115 = super.field594;
                        this.field117 = 2;
                        this.field116 = 0;
                        this.field306.method281(254, this.field549);
                        this.field306.method283(this.field148 + var3);
                        this.field306.method317(var6, (byte) -34);
                        this.field306.method315(this.field444, (byte) -118);
                        this.field306.method316((byte) 3, this.field443);
                        this.field306.method283(this.field445);
                        this.field306.method317(this.field149 + var4, (byte) -34);
                    }
                    if (var5 == 63 && this.method119(var4, 257, var3, var6)) {
                        this.field306.method281(179, this.field549);
                        this.field306.method317(this.field443, (byte) -34);
                        this.field306.method283(this.field445);
                        this.field306.method316((byte) 3, var6 >> 14 & 32767);
                        this.field306.method283(this.field444);
                        this.field306.method316((byte) 3, this.field149 + var4);
                        this.field306.method317(this.field148 + var3, (byte) -34);
                    }
                    if (var5 == 898) {
                        ++field82;
                        if (field82 >= 79) {
                            this.field306.method281(247, this.field549);
                            this.field306.method283(31844);
                            field82 = 0;
                        }
                        this.field306.method281(60, this.field549);
                        this.field306.method315(var3, (byte) -118);
                        this.field306.method316((byte) 3, var6);
                        this.field306.method283(var4);
                        this.field477 = 0;
                        this.field478 = var4;
                        this.field479 = var3;
                        this.field480 = 2;
                        if (class61.field1518[var4].field1541 == this.field112) {
                            this.field480 = 1;
                        }
                        if (class61.field1518[var4].field1541 == this.field119) {
                            this.field480 = 3;
                        }
                    }
                    if (var5 == 431) {
                        if ((var3 & 3) == 0) {
                            ++field142;
                        }
                        if (field142 >= 82) {
                            this.field306.method281(126, this.field549);
                            this.field306.method285(5222059);
                            field142 = 0;
                        }
                        this.field306.method281(219, this.field549);
                        this.field306.method315(var3, (byte) -118);
                        this.field306.method315(var6, (byte) -118);
                        this.field306.method315(var4, (byte) -118);
                        this.field477 = 0;
                        this.field478 = var4;
                        this.field479 = var3;
                        this.field480 = 2;
                        if (class61.field1518[var4].field1541 == this.field112) {
                            this.field480 = 1;
                        }
                        if (class61.field1518[var4].field1541 == this.field119) {
                            this.field480 = 3;
                        }
                    }
                    if (var5 == 134) {
                        boolean var70 = this.method66(8, 2, 0, 0, 0, var4, 0, false, 0, field90.field855[0], field90.field856[0], var3);
                        if (!var70) {
                            this.method66(8, 2, 1, 0, 1, var4, 0, false, 0, field90.field855[0], field90.field856[0], var3);
                        }
                        this.field114 = super.field593;
                        this.field115 = super.field594;
                        this.field117 = 2;
                        this.field116 = 0;
                        this.field306.method281(94, this.field549);
                        this.field306.method316((byte) 3, this.field148 + var3);
                        this.field306.method283(var6);
                        this.field306.method316((byte) 3, this.field149 + var4);
                    }
                    if (var5 == 1019) {
                        this.method119(var4, 257, var3, var6);
                        this.field306.method281(109, this.field549);
                        this.field306.method283(this.field148 + var3);
                        this.field306.method283(this.field149 + var4);
                        this.field306.method283(var6 >> 14 & 32767);
                    }
                    if (var5 == 1235) {
                        class43 var72 = this.field160[var6];
                        if (var72 != null) {
                            class5 var73 = var72.field1177;
                            if (var73.field50 != null) {
                                var73 = var73.method26((byte) 2);
                            }
                            if (var73 != null) {
                                String var74;
                                if (var73.field52 != null) {
                                    var74 = new String(var73.field52);
                                } else {
                                    var74 = "It's a " + var73.field69 + ".";
                                }
                                this.method139(var74, true, 0, "");
                            }
                        }
                    }
                    this.field442 = 0;
                    this.field176 = 0;
                    if (arg0) {
                        for (int var75 = 1; var75 > 0; ++var75) {
                        }
                    }
                    this.field134 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILEYTQJNEM;II)V")
    public final void method163(int arg0, class12 arg1, int arg2, int arg3) {
        int var5 = arg0 * arg0 + arg3 * arg3;
        if (arg2 < 0) {
            if (var5 > 4225 && var5 < 90000) {
                int var6 = this.field374 + this.field368 & 2047;
                int var7 = class35.field1056[var6];
                int var8 = class35.field1057[var6];
                int var9 = var7 * 256 / (this.field132 + 256);
                int var10 = var8 * 256 / (this.field132 + 256);
                int var11 = arg0 * var9 + arg3 * var10 >> 16;
                int var12 = arg0 * var10 - arg3 * var9 >> 16;
                double var13 = Math.atan2((double) var11, (double) var12);
                int var15 = (int) (Math.sin(var13) * 63.0D);
                int var16 = (int) (Math.cos(var13) * 57.0D);
                this.field398.method198(var15 + 94 + 4 - 10, 256, 15, var13, 15, 83 - var16 - 20, 6, 20, 20);
            } else {
                this.method170(arg0, arg1, arg3, -18243);
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(Z)V")
    public final void method164(boolean arg0) {
        if (this.field442 == 0 && this.field176 == 0) {
            this.field246[this.field341] = "Walk here";
            this.field499[this.field341] = 387;
            this.field497[this.field341] = super.field586;
            this.field498[this.field341] = super.field587;
            ++this.field341;
        }
        int var2 = -1;
        if (arg0) {
            this.method62();
        }
        for (int var3 = 0; var3 < class35.field1054; ++var3) {
            int var4 = class35.field1055[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field367.method539(this.field360, var5, var6, var4) >= 0) {
                    class42 var9 = class42.method405(var8);
                    if (var9.field1133 != null) {
                        var9 = var9.method403(174);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field442 == 1) {
                        this.field246[this.field341] = "Use " + this.field446 + " with @cya@" + var9.field1156;
                        this.field499[this.field341] = 63;
                        this.field500[this.field341] = var4;
                        this.field497[this.field341] = var5;
                        this.field498[this.field341] = var6;
                        ++this.field341;
                    } else if (this.field176 == 1) {
                        if ((this.field178 & 4) == 4) {
                            this.field246[this.field341] = this.field179 + " @cya@" + var9.field1156;
                            this.field499[this.field341] = 944;
                            this.field500[this.field341] = var4;
                            this.field497[this.field341] = var5;
                            this.field498[this.field341] = var6;
                            ++this.field341;
                        }
                    } else {
                        if (var9.field1167 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field1167[var10] != null) {
                                    this.field246[this.field341] = var9.field1167[var10] + " @cya@" + var9.field1156;
                                    if (var10 == 0) {
                                        this.field499[this.field341] = 786;
                                    }
                                    if (var10 == 1) {
                                        this.field499[this.field341] = 512;
                                    }
                                    if (var10 == 2) {
                                        this.field499[this.field341] = 602;
                                    }
                                    if (var10 == 3) {
                                        this.field499[this.field341] = 36;
                                    }
                                    if (var10 == 4) {
                                        this.field499[this.field341] = 1019;
                                    }
                                    this.field500[this.field341] = var4;
                                    this.field497[this.field341] = var5;
                                    this.field498[this.field341] = var6;
                                    ++this.field341;
                                }
                            }
                        }
                        this.field246[this.field341] = "Examine @cya@" + var9.field1156;
                        this.field499[this.field341] = 1830;
                        this.field500[this.field341] = var9.field1149 << 14;
                        this.field497[this.field341] = var5;
                        this.field498[this.field341] = var6;
                        ++this.field341;
                    }
                }
                if (var7 == 1) {
                    class43 var11 = this.field160[var8];
                    if (var11.field1177.field57 == 1 && (var11.field815 & 127) == 64 && (var11.field816 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field161; ++var12) {
                            class43 var15 = this.field160[this.field162[var12]];
                            if (var15 != null && var11 != var15 && var15.field1177.field57 == 1 && var11.field815 == var15.field815 && var11.field816 == var15.field816) {
                                this.method132(var5, var15.field1177, var6, this.field162[var12], 6);
                            }
                        }
                        for (int var13 = 0; var13 < this.field416; ++var13) {
                            class21 var14 = this.field415[this.field417[var13]];
                            if (var14 != null && var11.field815 == var14.field815 && var11.field816 == var14.field816) {
                                this.method55(var5, var14, this.field417[var13], 191, var6);
                            }
                        }
                    }
                    this.method132(var5, var11.field1177, var6, var8, 6);
                }
                if (var7 == 0) {
                    class21 var16 = this.field415[var8];
                    if ((var16.field815 & 127) == 64 && (var16.field816 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field161; ++var17) {
                            class43 var20 = this.field160[this.field162[var17]];
                            if (var20 != null && var20.field1177.field57 == 1 && var16.field815 == var20.field815 && var16.field816 == var20.field816) {
                                this.method132(var5, var20.field1177, var6, this.field162[var17], 6);
                            }
                        }
                        for (int var18 = 0; var18 < this.field416; ++var18) {
                            class21 var19 = this.field415[this.field417[var18]];
                            if (var19 != null && var16 != var19 && var16.field815 == var19.field815 && var16.field816 == var19.field816) {
                                this.method55(var5, var19, this.field417[var18], 191, var6);
                            }
                        }
                    }
                    this.method55(var5, var16, var8, 191, var6);
                }
                if (var7 == 3) {
                    class56 var21 = this.field521[this.field360][var5][var6];
                    if (var21 != null) {
                        for (class26 var22 = (class26) var21.method483((byte) 1); var22 != null; var22 = (class26) var21.method485(20429)) {
                            class45 var23 = class45.method428(var22.field873);
                            if (this.field442 == 1) {
                                this.field246[this.field341] = "Use " + this.field446 + " with @lre@" + var23.field1225;
                                this.field499[this.field341] = 345;
                                this.field500[this.field341] = var22.field873;
                                this.field497[this.field341] = var5;
                                this.field498[this.field341] = var6;
                                ++this.field341;
                            } else if (this.field176 == 1) {
                                if ((this.field178 & 1) == 1) {
                                    this.field246[this.field341] = this.field179 + " @lre@" + var23.field1225;
                                    this.field499[this.field341] = 84;
                                    this.field500[this.field341] = var22.field873;
                                    this.field497[this.field341] = var5;
                                    this.field498[this.field341] = var6;
                                    ++this.field341;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1206 != null && var23.field1206[var24] != null) {
                                        this.field246[this.field341] = var23.field1206[var24] + " @lre@" + var23.field1225;
                                        if (var24 == 0) {
                                            this.field499[this.field341] = 32;
                                        }
                                        if (var24 == 1) {
                                            this.field499[this.field341] = 134;
                                        }
                                        if (var24 == 2) {
                                            this.field499[this.field341] = 321;
                                        }
                                        if (var24 == 3) {
                                            this.field499[this.field341] = 830;
                                        }
                                        if (var24 == 4) {
                                            this.field499[this.field341] = 420;
                                        }
                                        this.field500[this.field341] = var22.field873;
                                        this.field497[this.field341] = var5;
                                        this.field498[this.field341] = var6;
                                        ++this.field341;
                                    } else if (var24 == 2) {
                                        this.field246[this.field341] = "Take @lre@" + var23.field1225;
                                        this.field499[this.field341] = 321;
                                        this.field500[this.field341] = var22.field873;
                                        this.field497[this.field341] = var5;
                                        this.field498[this.field341] = var6;
                                        ++this.field341;
                                    }
                                }
                                this.field246[this.field341] = "Examine @lre@" + var23.field1225;
                                this.field499[this.field341] = 1118;
                                this.field500[this.field341] = var22.field873;
                                this.field497[this.field341] = var5;
                                this.field498[this.field341] = var6;
                                ++this.field341;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(Z)V")
    public final void method165(boolean arg0) {
        this.field189.method13((byte) -36);
        this.field137 &= arg0;
        class48.field1287 = this.field154;
        this.field363.method500(0, this.field408, 0);
        if (this.field365) {
            this.field539.method573(this.field326, 40, 239, -193, 0);
            this.field539.method573(this.field290 + "*", 60, 239, -193, 128);
        } else if (this.field166 == 1) {
            this.field539.method573("Enter amount:", 40, 239, -193, 0);
            this.field539.method573(this.field130 + "*", 60, 239, -193, 128);
        } else if (this.field166 == 2) {
            this.field539.method573("Enter name:", 40, 239, -193, 0);
            this.field539.method573(this.field130 + "*", 60, 239, -193, 128);
        } else if (this.field305 != null) {
            this.field539.method573(this.field305, 40, 239, -193, 0);
            this.field539.method573("Click to continue", 60, 239, -193, 128);
        } else if (this.field119 != -1) {
            this.method65(0, false, 0, 0, class61.field1518[this.field119]);
        } else if (this.field286 != -1) {
            this.method65(0, false, 0, 0, class61.field1518[this.field286]);
        } else {
            class70 var2 = this.field538;
            int var3 = 0;
            class1.method3(0, 463, false, 0, 77);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field335[var4] != null) {
                    int var6 = this.field333[var4];
                    int var7 = 70 - var3 * 14 + this.field321;
                    String var8 = this.field334[var4];
                    byte var9 = 0;
                    if (var8 != null && var8.startsWith("@cr1@")) {
                        var8 = var8.substring(5);
                        var9 = 1;
                    }
                    if (var8 != null && var8.startsWith("@cr2@")) {
                        var8 = var8.substring(5);
                        var9 = 2;
                    }
                    if (var6 == 0) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method577(var7, this.field335[var4], 4, 0, this.field340);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field194 == 0 || this.field194 == 1 && this.method82(var8, (byte) 0))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field325[0].method500(var10, this.field408, var7 - 12);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field325[1].method500(var10, this.field408, var7 - 12);
                                var10 += 14;
                            }
                            var2.method577(var7, var8 + ":", var10, 0, this.field340);
                            int var11 = var10 + var2.method575(true, var8) + 8;
                            var2.method577(var7, this.field335[var4], var11, 255, this.field340);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field85 == 0 && (var6 == 7 || this.field228 == 0 || this.field228 == 1 && this.method82(var8, (byte) 0))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method577(var7, "From", var12, 0, this.field340);
                            int var13 = var12 + var2.method575(true, "From ");
                            if (var9 == 1) {
                                this.field325[0].method500(var13, this.field408, var7 - 12);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field325[1].method500(var13, this.field408, var7 - 12);
                                var13 += 14;
                            }
                            var2.method577(var7, var8 + ":", var13, 0, this.field340);
                            int var14 = var13 + var2.method575(true, var8) + 8;
                            var2.method577(var7, this.field335[var4], var14, 8388608, this.field340);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field258 == 0 || this.field258 == 1 && this.method82(var8, (byte) 0))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method577(var7, var8 + " " + this.field335[var4], 4, 8388736, this.field340);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field85 == 0 && this.field228 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method577(var7, this.field335[var4], 4, 8388608, this.field340);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field85 == 0 && this.field228 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method577(var7, "To " + var8 + ":", 4, 0, this.field340);
                            var2.method577(var7, this.field335[var4], 12 + var2.method575(true, "To " + var8), 8388608, this.field340);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field258 == 0 || this.field258 == 1 && this.method82(var8, (byte) 0))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method577(var7, var8 + " " + this.field335[var4], 4, 8270336, this.field340);
                        }
                        ++var3;
                    }
                }
            }
            class1.method2((byte) -82);
            this.field89 = var3 * 14 + 7;
            if (this.field89 < 78) {
                this.field89 = 78;
            }
            this.method121(0, 463, this.field89, 77, -390, this.field89 - this.field321 - 77);
            String var5;
            if (field90 != null && field90.field774 != null) {
                var5 = field90.field774;
            } else {
                var5 = class44.method417((byte) 97, this.field455);
            }
            var2.method577(90, var5 + ":", 4, 0, this.field340);
            var2.method577(90, this.field215 + "*", 6 + var2.method575(true, var5 + ": "), 255, this.field340);
            class1.method9(0, 0, this.field224, 77, 479);
        }
        if (this.field523 && this.field230 == 2) {
            this.method149(38352);
        }
        this.field189.method14(super.field578, 17, 357, 0);
        this.field188.method13((byte) -36);
        class48.field1287 = this.field156;
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(Z)V")
    public final void method166(boolean arg0) {
        if (arg0) {
            this.field302 = 72;
        }
        for (int var2 = -1; var2 < this.field416; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field414;
            } else {
                var3 = this.field417[var2];
            }
            class21 var4 = this.field415[var3];
            if (var4 != null) {
                this.method70(1, var4, -13011);
            }
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method167(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)I")
    public final int method168(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg3;
        return arg0 != 3 ? 1 : ((arg1 & 16711935) * var5 + (arg2 & 16711935) * arg3 & -16711936) + ((arg1 & 65280) * var5 + (arg2 & 65280) * arg3 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBI)Ljava/lang/String;")
    public static final String method169(int arg0, byte arg1, int arg2) {
        if (arg1 != 29) {
            field378 = 216;
        }
        int var3 = arg2 - arg0;
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILEYTQJNEM;II)V")
    public final void method170(int arg0, class12 arg1, int arg2, int arg3) {
        int var5 = this.field374 + this.field368 & 2047;
        int var6 = arg0 * arg0 + arg2 * arg2;
        if (arg3 == -18243) {
            if (var6 <= 6400) {
                int var7 = class35.field1056[var5];
                int var8 = class35.field1057[var5];
                int var9 = var7 * 256 / (this.field132 + 256);
                int var10 = var8 * 256 / (this.field132 + 256);
                int var11 = arg0 * var9 + arg2 * var10 >> 16;
                int var12 = arg0 * var10 - arg2 * var9 >> 16;
                if (var6 > 2500) {
                    arg1.method199(89, this.field362, var11 + 94 - arg1.field638 / 2 + 4, 83 - var12 - arg1.field639 / 2 - 4);
                } else {
                    arg1.method193(var11 + 94 - arg1.field638 / 2 + 4, this.field408, 83 - var12 - arg1.field639 / 2 - 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method171(int arg0) {
        try {
            if (this.field248 != null) {
                this.field248.method210();
            }
        } catch (Exception var3) {
        }
        this.field248 = null;
        while (arg0 >= 0) {
            this.field521 = null;
        }
        this.field137 = false;
        this.field505 = 0;
        this.field455 = "";
        this.field456 = "";
        this.method54(false);
        this.field367.method509((byte) 0);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field474[var2].method268();
        }
        System.gc();
        this.method136(0);
        this.field401 = -1;
        this.field465 = -1;
        this.field313 = 0;
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)V")
    public final void method172(int arg0, int arg1) {
        int[] var3 = this.field324.field633;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field205[arg0][var24][var6] & 24) == 0) {
                    this.field367.method544(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field205[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field367.method544(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        while (arg1 >= 0) {
            this.field549 = this.field249.method265();
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field324.method188((byte) -36);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field205[arg0][var22][var9] & 24) == 0) {
                    this.method85(0, var7, var8, var9, arg0, var22);
                }
                if (arg0 < 3 && (this.field205[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method85(0, var7, var8, var9, arg0 + 1, var22);
                }
            }
        }
        this.field188.method13((byte) -36);
        this.field447 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field367.method538(this.field360, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class42.method405(var13).field1155;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field474[this.field360].field919;
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
                        this.field123[this.field447] = this.field410[var14];
                        this.field448[this.field447] = var15;
                        this.field449[this.field447] = var16;
                        ++this.field447;
                    }
                }
            }
        }
        ++field88;
        if (field88 > 72) {
            field88 = 0;
            this.field306.method281(146, this.field549);
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field136[var1] = var0 - 1;
            var0 += var0;
        }
        field139 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field139[var3] = var2 / 4;
        }
        field214 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field293 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field371 = 8;
        field378 = 17029;
        field389 = 10;
        field391 = true;
        field406 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field458 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
    }
}
