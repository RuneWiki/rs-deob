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
public class client extends class22 {

    @OriginalMember(owner = "client", name = "N", descriptor = "Z")
    private boolean field106 = false;

    @OriginalMember(owner = "client", name = "O", descriptor = "[[[I")
    private int[][][] field107 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field108 = 830;

    @OriginalMember(owner = "client", name = "R", descriptor = "[I")
    private int[] field110 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "S", descriptor = "[J")
    private long[] field111 = new long[200];

    @OriginalMember(owner = "client", name = "eb", descriptor = "[I")
    private int[] field123 = new int[200];

    @OriginalMember(owner = "client", name = "fb", descriptor = "[I")
    private int[] field124 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "gb", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field125 = new CRC32();

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field126 = -5909;

    @OriginalMember(owner = "client", name = "ib", descriptor = "Z")
    private boolean field127 = false;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field135 = 1;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field136 = -5909;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field139 = -1;

    @OriginalMember(owner = "client", name = "vb", descriptor = "I")
    private int field140 = 5063219;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field145 = 1;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "Ljava/lang/String;")
    private String field146 = "";

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field151 = -1;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field153 = -337;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "Z")
    private boolean field154 = false;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "[I")
    private int[] field157 = new int[2000];

    @OriginalMember(owner = "client", name = "Nb", descriptor = "[I")
    private int[] field158 = new int[50];

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field163 = 3353893;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "[[I")
    private int[][] field164 = new int[104][104];

    @OriginalMember(owner = "client", name = "Vb", descriptor = "Z")
    private boolean field166 = true;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "[Z")
    private boolean[] field169 = new boolean[5];

    @OriginalMember(owner = "client", name = "ac", descriptor = "[I")
    public int[] field171 = new int[1000];

    @OriginalMember(owner = "client", name = "gc", descriptor = "[I")
    private int[] field177 = new int[50];

    @OriginalMember(owner = "client", name = "tc", descriptor = "Z")
    private boolean field190 = true;

    @OriginalMember(owner = "client", name = "vc", descriptor = "[Ljava/lang/String;")
    private String[] field192 = new String[5];

    @OriginalMember(owner = "client", name = "wc", descriptor = "[Z")
    private boolean[] field193 = new boolean[5];

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private int field200 = 49048;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "Z")
    private boolean field211 = false;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "Ljava/lang/String;")
    private String field213 = "";

    @OriginalMember(owner = "client", name = "Xc", descriptor = "[I")
    private int[] field220 = new int[4000];

    @OriginalMember(owner = "client", name = "Yc", descriptor = "[I")
    private int[] field221 = new int[4000];

    @OriginalMember(owner = "client", name = "dd", descriptor = "Z")
    private boolean field226 = true;

    @OriginalMember(owner = "client", name = "id", descriptor = "Z")
    private boolean field231 = true;

    @OriginalMember(owner = "client", name = "nd", descriptor = "I")
    private int field236 = -1;

    @OriginalMember(owner = "client", name = "od", descriptor = "Z")
    private boolean field237 = false;

    @OriginalMember(owner = "client", name = "qd", descriptor = "[I")
    private int[] field239 = new int[5];

    @OriginalMember(owner = "client", name = "rd", descriptor = "Z")
    private boolean field240 = false;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    private int field244 = 7;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field248 = -1;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private int field250 = -1;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "Z")
    private boolean field251 = false;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "Z")
    private boolean field252 = false;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "B")
    private byte field254 = 50;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "[I")
    private int[] field255 = new int[50];

    @OriginalMember(owner = "client", name = "Hd", descriptor = "Z")
    private boolean field256 = false;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private int field258 = 50;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "[I")
    private int[] field259 = new int[this.field258];

    @OriginalMember(owner = "client", name = "Ld", descriptor = "[I")
    private int[] field260 = new int[this.field258];

    @OriginalMember(owner = "client", name = "Md", descriptor = "[I")
    private int[] field261 = new int[this.field258];

    @OriginalMember(owner = "client", name = "Nd", descriptor = "[I")
    private int[] field262 = new int[this.field258];

    @OriginalMember(owner = "client", name = "Od", descriptor = "[I")
    private int[] field263 = new int[this.field258];

    @OriginalMember(owner = "client", name = "Pd", descriptor = "[I")
    private int[] field264 = new int[this.field258];

    @OriginalMember(owner = "client", name = "Qd", descriptor = "[I")
    private int[] field265 = new int[this.field258];

    @OriginalMember(owner = "client", name = "Rd", descriptor = "[Ljava/lang/String;")
    private String[] field266 = new String[this.field258];

    @OriginalMember(owner = "client", name = "Xd", descriptor = "I")
    private int field272 = -1;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "[LTAIXVIBM;")
    private class47[] field273 = new class47[2];

    @OriginalMember(owner = "client", name = "be", descriptor = "Z")
    private boolean field276 = false;

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private int field285 = 265;

    @OriginalMember(owner = "client", name = "le", descriptor = "Z")
    private boolean field286 = false;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field287 = 7;

    @OriginalMember(owner = "client", name = "pe", descriptor = "LYSGENUJE;")
    private class66 field290 = new class66(-41036);

    @OriginalMember(owner = "client", name = "re", descriptor = "LZOMNSJJM;")
    private class69 field292 = class69.method535(1, 0);

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private int field293 = -472;

    @OriginalMember(owner = "client", name = "te", descriptor = "[I")
    private int[] field294 = new int[7];

    @OriginalMember(owner = "client", name = "ve", descriptor = "[LLXRBRCRX;")
    private class30[] field296 = new class30[20];

    @OriginalMember(owner = "client", name = "we", descriptor = "Z")
    private boolean field297 = false;

    @OriginalMember(owner = "client", name = "xe", descriptor = "[I")
    private int[] field298 = new int[100];

    @OriginalMember(owner = "client", name = "ye", descriptor = "[Ljava/lang/String;")
    private String[] field299 = new String[100];

    @OriginalMember(owner = "client", name = "ze", descriptor = "[Ljava/lang/String;")
    private String[] field300 = new String[100];

    @OriginalMember(owner = "client", name = "Ae", descriptor = "B")
    private byte field301 = 5;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "Z")
    private boolean field305 = false;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "[LNXLHMSCV;")
    private class35[] field306 = new class35[4];

    @OriginalMember(owner = "client", name = "Ge", descriptor = "[J")
    private long[] field307 = new long[100];

    @OriginalMember(owner = "client", name = "Me", descriptor = "[I")
    private int[] field313 = new int[class51.field1450];

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field315 = 2;

    @OriginalMember(owner = "client", name = "af", descriptor = "Z")
    private boolean field327 = true;

    @OriginalMember(owner = "client", name = "ff", descriptor = "[I")
    private int[] field332 = new int[1000];

    @OriginalMember(owner = "client", name = "gf", descriptor = "[I")
    private int[] field333 = new int[1000];

    @OriginalMember(owner = "client", name = "hf", descriptor = "Z")
    private boolean field334 = true;

    @OriginalMember(owner = "client", name = "jf", descriptor = "Z")
    private boolean field335 = false;

    @OriginalMember(owner = "client", name = "mf", descriptor = "I")
    private int field338 = -37951;

    @OriginalMember(owner = "client", name = "nf", descriptor = "Z")
    private boolean field339 = false;

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private int field340 = 128;

    @OriginalMember(owner = "client", name = "uf", descriptor = "Ljava/lang/String;")
    private String field346 = "";

    @OriginalMember(owner = "client", name = "vf", descriptor = "[I")
    private int[] field347 = new int[256];

    @OriginalMember(owner = "client", name = "wf", descriptor = "[LLXRBRCRX;")
    private class30[] field348 = new class30[20];

    @OriginalMember(owner = "client", name = "xf", descriptor = "Z")
    private boolean field349 = true;

    @OriginalMember(owner = "client", name = "yf", descriptor = "I")
    private int field350 = -1;

    @OriginalMember(owner = "client", name = "zf", descriptor = "B")
    private byte field351 = 25;

    @OriginalMember(owner = "client", name = "Af", descriptor = "Ljava/lang/String;")
    private String field352 = "";

    @OriginalMember(owner = "client", name = "Bf", descriptor = "Ljava/lang/String;")
    private String field353 = "";

    @OriginalMember(owner = "client", name = "Df", descriptor = "LZOMNSJJM;")
    private class69 field355 = class69.method535(1, 0);

    @OriginalMember(owner = "client", name = "Ff", descriptor = "Z")
    private boolean field357 = true;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field358 = 777;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "I")
    private int field359 = 2301979;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private final int field360 = 100;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "[I")
    private int[] field361 = new int[100];

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field367 = -1;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field369 = 1;

    @OriginalMember(owner = "client", name = "ag", descriptor = "[B")
    private byte[] field378 = new byte[16384];

    @OriginalMember(owner = "client", name = "bg", descriptor = "[Ljava/lang/String;")
    private String[] field379 = new String[200];

    @OriginalMember(owner = "client", name = "dg", descriptor = "I")
    private int field381 = -1;

    @OriginalMember(owner = "client", name = "eg", descriptor = "[I")
    private int[] field382 = new int[5];

    @OriginalMember(owner = "client", name = "fg", descriptor = "[I")
    private int[] field383 = new int[class51.field1450];

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private int field385 = 2;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field386 = 3;

    @OriginalMember(owner = "client", name = "pg", descriptor = "[LLXRBRCRX;")
    private class30[] field393 = new class30[8];

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field395 = 7759444;

    @OriginalMember(owner = "client", name = "xg", descriptor = "Z")
    private boolean field401 = false;

    @OriginalMember(owner = "client", name = "yg", descriptor = "Z")
    private boolean field402 = false;

    @OriginalMember(owner = "client", name = "zg", descriptor = "[I")
    private int[] field403 = new int[33];

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private int field404 = -1;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "LYSGENUJE;")
    private class66 field406 = new class66(-41036);

    @OriginalMember(owner = "client", name = "Dg", descriptor = "[I")
    private int[] field407 = new int[500];

    @OriginalMember(owner = "client", name = "Eg", descriptor = "[I")
    private int[] field408 = new int[500];

    @OriginalMember(owner = "client", name = "Fg", descriptor = "[I")
    private int[] field409 = new int[500];

    @OriginalMember(owner = "client", name = "Gg", descriptor = "[I")
    private int[] field410 = new int[500];

    @OriginalMember(owner = "client", name = "Ig", descriptor = "[I")
    private int[] field412 = new int[9];

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field413 = 613;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "LYSGENUJE;")
    private class66 field414 = new class66(-41036);

    @OriginalMember(owner = "client", name = "Sg", descriptor = "Z")
    public boolean field422 = true;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "Z")
    private boolean field423 = false;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "Z")
    private boolean field426 = false;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "Z")
    private boolean field427 = false;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "[LTAIXVIBM;")
    private class47[] field429 = new class47[100];

    @OriginalMember(owner = "client", name = "kh", descriptor = "Z")
    private volatile boolean field440 = false;

    @OriginalMember(owner = "client", name = "mh", descriptor = "Z")
    private boolean field442 = true;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field445 = 78;

    @OriginalMember(owner = "client", name = "th", descriptor = "Z")
    private boolean field449 = true;

    @OriginalMember(owner = "client", name = "uh", descriptor = "[Ljava/lang/String;")
    private String[] field450 = new String[500];

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field454 = -1;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field455 = -1;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "[LTGFFTNFO;")
    public class50[] field456 = new class50[5];

    @OriginalMember(owner = "client", name = "Jh", descriptor = "Z")
    private boolean field465 = false;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field467 = -1;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "Z")
    private boolean field468 = true;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "LCPNGZAUN;")
    private class9 field470 = new class9();

    @OriginalMember(owner = "client", name = "Rh", descriptor = "Z")
    private boolean field473 = true;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "Z")
    private boolean field474 = true;

    @OriginalMember(owner = "client", name = "Th", descriptor = "Z")
    private boolean field475 = false;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "[[I")
    private int[][] field477 = new int[104][104];

    @OriginalMember(owner = "client", name = "Wh", descriptor = "Ljava/lang/String;")
    private String field478 = "";

    @OriginalMember(owner = "client", name = "Xh", descriptor = "Ljava/lang/String;")
    private String field479 = "";

    @OriginalMember(owner = "client", name = "ai", descriptor = "[LTAIXVIBM;")
    private class47[] field482 = new class47[13];

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field489 = 2048;

    @OriginalMember(owner = "client", name = "ii", descriptor = "I")
    private int field490 = 2047;

    @OriginalMember(owner = "client", name = "ji", descriptor = "[LQIVQUKBA;")
    private class39[] field491 = new class39[this.field489];

    @OriginalMember(owner = "client", name = "li", descriptor = "[I")
    public int[] field493 = new int[this.field489];

    @OriginalMember(owner = "client", name = "ni", descriptor = "[I")
    private int[] field495 = new int[this.field489];

    @OriginalMember(owner = "client", name = "oi", descriptor = "[LZOMNSJJM;")
    private class69[] field496 = new class69[this.field489];

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field504 = 8;

    @OriginalMember(owner = "client", name = "xi", descriptor = "[LLXRBRCRX;")
    private class30[] field505 = new class30[1000];

    @OriginalMember(owner = "client", name = "zi", descriptor = "Z")
    private volatile boolean field507 = false;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "Z")
    private boolean field508 = true;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field513 = 2;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field514 = -1;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "[I")
    private int[] field515 = new int[33];

    @OriginalMember(owner = "client", name = "Ji", descriptor = "[[I")
    private int[][] field517 = new int[104][104];

    @OriginalMember(owner = "client", name = "Ki", descriptor = "Z")
    private volatile boolean field518 = false;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "Z")
    private boolean field524 = false;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "[I")
    public int[] field530 = new int[2000];

    @OriginalMember(owner = "client", name = "Yi", descriptor = "[I")
    private int[] field532 = new int[151];

    @OriginalMember(owner = "client", name = "Zi", descriptor = "Ljava/lang/String;")
    private String field533 = "";

    @OriginalMember(owner = "client", name = "aj", descriptor = "[LLXRBRCRX;")
    private class30[] field534 = new class30[100];

    @OriginalMember(owner = "client", name = "bj", descriptor = "Z")
    public boolean field535 = false;

    @OriginalMember(owner = "client", name = "dj", descriptor = "[I")
    private final int[] field537 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "mj", descriptor = "I")
    private int field546 = 3;

    @OriginalMember(owner = "client", name = "oj", descriptor = "[I")
    private int[] field548 = new int[5];

    @OriginalMember(owner = "client", name = "sj", descriptor = "LZOMNSJJM;")
    private class69 field552 = class69.method535(1, 0);

    @OriginalMember(owner = "client", name = "tj", descriptor = "LZOMNSJJM;")
    private class69 field553 = new class69(new byte[5000], field428);

    @OriginalMember(owner = "client", name = "uj", descriptor = "[LTEBIXSCV;")
    private class49[] field554 = new class49[16384];

    @OriginalMember(owner = "client", name = "wj", descriptor = "[I")
    public int[] field556 = new int[16384];

    @OriginalMember(owner = "client", name = "xj", descriptor = "[I")
    private int[] field557 = new int[151];

    @OriginalMember(owner = "client", name = "Bj", descriptor = "Z")
    private boolean field561 = true;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "Z")
    private boolean field563 = false;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "[I")
    private int[] field564 = new int[5];

    @OriginalMember(owner = "client", name = "Gj", descriptor = "[I")
    private int[] field566 = new int[5];

    @OriginalMember(owner = "client", name = "Kj", descriptor = "[I")
    private int[] field570 = new int[class51.field1450];

    @OriginalMember(owner = "client", name = "Lj", descriptor = "Z")
    private boolean field571 = false;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "[[[LYSGENUJE;")
    private class66[][][] field572 = new class66[4][104][104];

    @OriginalMember(owner = "client", name = "Oj", descriptor = "Ljava/lang/String;")
    private String field574 = "";

    @OriginalMember(owner = "client", name = "Pj", descriptor = "I")
    private int field575 = 97;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private static int field109 = 6;

    @OriginalMember(owner = "client", name = "hd", descriptor = "[[I")
    public static final int[][] field230 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "jd", descriptor = "Ljava/lang/String;")
    private static String field232 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "kf", descriptor = "[I")
    private static int[] field336 = new int[99];

    @OriginalMember(owner = "client", name = "Mf", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field364;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private static int field389;

    @OriginalMember(owner = "client", name = "ng", descriptor = "Z")
    private static boolean field391;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "[I")
    public static int[] field405;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private static int field428;

    @OriginalMember(owner = "client", name = "sh", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field448;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "B")
    private static byte field466;

    @OriginalMember(owner = "client", name = "fi", descriptor = "B")
    private static byte field487;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private static int field503;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private static int field516;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "Z")
    private static boolean field525;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "[I")
    public static final int[] field527;

    @OriginalMember(owner = "client", name = "Qj", descriptor = "B")
    private static byte field576;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private int field128;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private int field129;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field130;

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private int field131;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private int field132;

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    private int field133;

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field134;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    public int field155;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private static int field165;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private static int field167;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private int field170;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field178;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field186;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field188;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field189;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private static int field191;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field216;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field218;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client", name = "cd", descriptor = "I")
    private static int field225;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field228;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field229;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private static int field234;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private static int field235;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private static int field238;

    @OriginalMember(owner = "client", name = "sd", descriptor = "I")
    private int field241;

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private int field242;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "I")
    private static int field249;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field253;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "client", name = "Td", descriptor = "I")
    private int field268;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "I")
    private int field269;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "I")
    private int field271;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private static int field277;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field282;

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private static int field283;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private static int field295;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field308;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private int field309;

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client", name = "pf", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private static int field344;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field345;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private static int field354;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "I")
    private static int field356;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private static int field362;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field371;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field372;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field373;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client", name = "kg", descriptor = "I")
    private static int field388;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field415;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field416;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "I")
    private int field417;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field418;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private int field420;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field421;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client", name = "ah", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client", name = "bh", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client", name = "ch", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client", name = "dh", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client", name = "eh", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field436;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field437;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field438;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private static int field443;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field462;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field463;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field469;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "client", name = "ci", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field520;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private static int field528;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "I")
    private int field529;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field536;

    @OriginalMember(owner = "client", name = "gj", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client", name = "hj", descriptor = "I")
    private int field541;

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    private int field544;

    @OriginalMember(owner = "client", name = "lj", descriptor = "I")
    private int field545;

    @OriginalMember(owner = "client", name = "nj", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client", name = "qj", descriptor = "I")
    private int field550;

    @OriginalMember(owner = "client", name = "rj", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client", name = "vj", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private int field558;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "I")
    private int field562;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "I")
    private static int field565;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "I")
    private int field573;

    @OriginalMember(owner = "client", name = "Rj", descriptor = "I")
    private int field577;

    @OriginalMember(owner = "client", name = "Sj", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client", name = "Tj", descriptor = "I")
    private int field579;

    @OriginalMember(owner = "client", name = "Uj", descriptor = "I")
    private int field580;

    @OriginalMember(owner = "client", name = "Vj", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client", name = "Wj", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "J")
    private long field152;

    @OriginalMember(owner = "client", name = "kd", descriptor = "J")
    private long field233;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "J")
    public long field377;

    @OriginalMember(owner = "client", name = "qg", descriptor = "J")
    private long field394;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "J")
    private long field481;

    @OriginalMember(owner = "client", name = "U", descriptor = "LECAKBTRA;")
    private class16 field113;

    @OriginalMember(owner = "client", name = "V", descriptor = "LECAKBTRA;")
    private class16 field114;

    @OriginalMember(owner = "client", name = "W", descriptor = "LECAKBTRA;")
    private class16 field115;

    @OriginalMember(owner = "client", name = "X", descriptor = "LECAKBTRA;")
    private class16 field116;

    @OriginalMember(owner = "client", name = "Y", descriptor = "LECAKBTRA;")
    private class16 field117;

    @OriginalMember(owner = "client", name = "Z", descriptor = "LECAKBTRA;")
    private class16 field118;

    @OriginalMember(owner = "client", name = "ab", descriptor = "LECAKBTRA;")
    private class16 field119;

    @OriginalMember(owner = "client", name = "bb", descriptor = "LECAKBTRA;")
    private class16 field120;

    @OriginalMember(owner = "client", name = "cb", descriptor = "LECAKBTRA;")
    private class16 field121;

    @OriginalMember(owner = "client", name = "wb", descriptor = "LECAKBTRA;")
    private class16 field141;

    @OriginalMember(owner = "client", name = "xb", descriptor = "LECAKBTRA;")
    private class16 field142;

    @OriginalMember(owner = "client", name = "yb", descriptor = "LECAKBTRA;")
    private class16 field143;

    @OriginalMember(owner = "client", name = "zb", descriptor = "LECAKBTRA;")
    private class16 field144;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "LECAKBTRA;")
    private class16 field317;

    @OriginalMember(owner = "client", name = "Re", descriptor = "LECAKBTRA;")
    private class16 field318;

    @OriginalMember(owner = "client", name = "Se", descriptor = "LECAKBTRA;")
    private class16 field319;

    @OriginalMember(owner = "client", name = "Te", descriptor = "LECAKBTRA;")
    private class16 field320;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "LECAKBTRA;")
    private class16 field321;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "LECAKBTRA;")
    private class16 field322;

    @OriginalMember(owner = "client", name = "We", descriptor = "LECAKBTRA;")
    private class16 field323;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "LECAKBTRA;")
    private class16 field324;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "LECAKBTRA;")
    private class16 field325;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "LECAKBTRA;")
    private class16 field509;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "LECAKBTRA;")
    private class16 field510;

    @OriginalMember(owner = "client", name = "Di", descriptor = "LECAKBTRA;")
    private class16 field511;

    @OriginalMember(owner = "client", name = "wg", descriptor = "LHFNJDDXC;")
    public class18 field400;

    @OriginalMember(owner = "client", name = "ri", descriptor = "LJQUNTFOC;")
    private class23 field499;

    @OriginalMember(owner = "client", name = "si", descriptor = "LJQUNTFOC;")
    private class23 field500;

    @OriginalMember(owner = "client", name = "ti", descriptor = "LJQUNTFOC;")
    private class23 field501;

    @OriginalMember(owner = "client", name = "ui", descriptor = "LJQUNTFOC;")
    private class23 field502;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "LLXRBRCRX;")
    private class30 field159;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "LLXRBRCRX;")
    private class30 field160;

    @OriginalMember(owner = "client", name = "bc", descriptor = "LLXRBRCRX;")
    private class30 field172;

    @OriginalMember(owner = "client", name = "cc", descriptor = "LLXRBRCRX;")
    private class30 field173;

    @OriginalMember(owner = "client", name = "dc", descriptor = "LLXRBRCRX;")
    private class30 field174;

    @OriginalMember(owner = "client", name = "ec", descriptor = "LLXRBRCRX;")
    private class30 field175;

    @OriginalMember(owner = "client", name = "fc", descriptor = "LLXRBRCRX;")
    private class30 field176;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "LLXRBRCRX;")
    private class30 field222;

    @OriginalMember(owner = "client", name = "wd", descriptor = "LLXRBRCRX;")
    private class30 field245;

    @OriginalMember(owner = "client", name = "xd", descriptor = "LLXRBRCRX;")
    private class30 field246;

    @OriginalMember(owner = "client", name = "qe", descriptor = "LLXRBRCRX;")
    private class30 field291;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "LLXRBRCRX;")
    private class30 field464;

    @OriginalMember(owner = "client", name = "ej", descriptor = "LLXRBRCRX;")
    private class30 field538;

    @OriginalMember(owner = "client", name = "fj", descriptor = "LLXRBRCRX;")
    private class30 field539;

    @OriginalMember(owner = "client", name = "db", descriptor = "LLYZBHNJP;")
    private class31 field122;

    @OriginalMember(owner = "client", name = "jj", descriptor = "LNCUAQOFM;")
    private class32 field543;

    @OriginalMember(owner = "client", name = "qh", descriptor = "LQIVQUKBA;")
    public static class39 field446;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "LBJGZFSFX;")
    private class3 field212;

    @OriginalMember(owner = "client", name = "ei", descriptor = "LSMQPXRFY;")
    private class44 field486;

    @OriginalMember(owner = "client", name = "Db", descriptor = "LTAIXVIBM;")
    private class47 field148;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "LTAIXVIBM;")
    private class47 field149;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "LTAIXVIBM;")
    private class47 field150;

    @OriginalMember(owner = "client", name = "jc", descriptor = "LTAIXVIBM;")
    private class47 field180;

    @OriginalMember(owner = "client", name = "kc", descriptor = "LTAIXVIBM;")
    private class47 field181;

    @OriginalMember(owner = "client", name = "lc", descriptor = "LTAIXVIBM;")
    private class47 field182;

    @OriginalMember(owner = "client", name = "mc", descriptor = "LTAIXVIBM;")
    private class47 field183;

    @OriginalMember(owner = "client", name = "nc", descriptor = "LTAIXVIBM;")
    private class47 field184;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "LTAIXVIBM;")
    private class47 field201;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "LTAIXVIBM;")
    private class47 field202;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "LTAIXVIBM;")
    private class47 field203;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "LTAIXVIBM;")
    private class47 field204;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "LTAIXVIBM;")
    private class47 field205;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "LTAIXVIBM;")
    private class47 field208;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "LTAIXVIBM;")
    private class47 field209;

    @OriginalMember(owner = "client", name = "vh", descriptor = "LTAIXVIBM;")
    private class47 field451;

    @OriginalMember(owner = "client", name = "wh", descriptor = "LTAIXVIBM;")
    private class47 field452;

    @OriginalMember(owner = "client", name = "xh", descriptor = "LTAIXVIBM;")
    private class47 field453;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "LTAIXVIBM;")
    private class47 field567;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "LTAIXVIBM;")
    private class47 field568;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "LZQADNJCF;")
    private class70 field560;

    @OriginalMember(owner = "client", name = "ae", descriptor = "Ljava/lang/String;")
    private String field275;

    @OriginalMember(owner = "client", name = "ge", descriptor = "Ljava/lang/String;")
    private String field281;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "Ljava/lang/String;")
    public String field311;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "Ljava/lang/String;")
    public String field523;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "Ljava/net/Socket;")
    private Socket field375;

    @OriginalMember(owner = "client", name = "T", descriptor = "Z")
    private static boolean field112;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "Z")
    public static boolean field363;

    @OriginalMember(owner = "client", name = "og", descriptor = "Z")
    private static boolean field392;

    @OriginalMember(owner = "client", name = "pi", descriptor = "Z")
    public static boolean field497;

    @OriginalMember(owner = "client", name = "zj", descriptor = "Z")
    private static boolean field559;

    @OriginalMember(owner = "client", name = "sb", descriptor = "[I")
    private int[] field137;

    @OriginalMember(owner = "client", name = "tb", descriptor = "[I")
    private int[] field138;

    @OriginalMember(owner = "client", name = "de", descriptor = "[I")
    private int[] field278;

    @OriginalMember(owner = "client", name = "ee", descriptor = "[I")
    private int[] field279;

    @OriginalMember(owner = "client", name = "fe", descriptor = "[I")
    private int[] field280;

    @OriginalMember(owner = "client", name = "bf", descriptor = "[I")
    private int[] field328;

    @OriginalMember(owner = "client", name = "cf", descriptor = "[I")
    private int[] field329;

    @OriginalMember(owner = "client", name = "df", descriptor = "[I")
    private int[] field330;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "[I")
    private int[] field365;

    @OriginalMember(owner = "client", name = "Of", descriptor = "[I")
    private int[] field366;

    @OriginalMember(owner = "client", name = "sg", descriptor = "[I")
    private int[] field396;

    @OriginalMember(owner = "client", name = "tg", descriptor = "[I")
    private int[] field397;

    @OriginalMember(owner = "client", name = "ug", descriptor = "[I")
    private int[] field398;

    @OriginalMember(owner = "client", name = "vg", descriptor = "[I")
    private int[] field399;

    @OriginalMember(owner = "client", name = "oh", descriptor = "[LTAIXVIBM;")
    private class47[] field444;

    @OriginalMember(owner = "client", name = "ic", descriptor = "[[B")
    private byte[][] field179;

    @OriginalMember(owner = "client", name = "oe", descriptor = "[[B")
    private byte[][] field289;

    @OriginalMember(owner = "client", name = "pj", descriptor = "[[[B")
    private byte[][][] field549;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "[[[I")
    private int[][][] field161;

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    private final void method38(int arg0) {
        class27 var2 = (class27) this.field406.method523();
        if (arg0 == -13725) {
            while (var2 != null) {
                if (var2.field988 == -1) {
                    var2.field987 = 0;
                    this.method72(this.field488, var2);
                } else {
                    var2.method591();
                }
                var2 = (class27) this.field406.method525(-687);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method39(boolean arg0) {
        class61 var2 = (class61) this.field290.method523();
        if (!arg0) {
            field559 = !field559;
        }
        while (var2 != null) {
            if (this.field210 == var2.field1566 && !var2.field1573) {
                if (field441 >= var2.field1570) {
                    var2.method496(this.field526, 0);
                    if (var2.field1573) {
                        var2.method591();
                    } else {
                        this.field543.method303(var2.field1568, 0, -1, var2.field1567, var2, -177, 60, var2.field1566, var2.field1569, false);
                    }
                }
            } else {
                var2.method591();
            }
            var2 = (class61) this.field290.method525(-687);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method40(int arg0) {
        short var2 = 256;
        if (arg0 != 34435) {
            field516 = 193;
        }
        if (this.field228 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field228 > 768) {
                    this.field396[var3] = this.method145(this.field397[var3], this.field398[var3], (byte) 44, 1024 - this.field228);
                } else if (this.field228 > 256) {
                    this.field396[var3] = this.field398[var3];
                } else {
                    this.field396[var3] = this.method145(this.field398[var3], this.field397[var3], (byte) 44, 256 - this.field228);
                }
            }
        } else if (this.field229 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field229 > 768) {
                    this.field396[var4] = this.method145(this.field397[var4], this.field399[var4], (byte) 44, 1024 - this.field229);
                } else if (this.field229 > 256) {
                    this.field396[var4] = this.field399[var4];
                } else {
                    this.field396[var4] = this.method145(this.field399[var4], this.field397[var4], (byte) 44, 256 - this.field229);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field396[var5] = this.field397[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field320.field832[var6] = this.field538.field1024[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field347[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field365[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field396[var26];
                    int var30 = this.field320.field832[var8];
                    this.field320.field832[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field320.method213(9, 0, super.field917, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field321.field832[var10] = this.field539.field1024[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field347[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field365[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field396[var18];
                    int var22 = this.field321.field832[var16];
                    this.field321.field832[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field321.method213(9, 637, super.field917, 0);
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method41(int arg0) {
        this.field457 += arg0;
        for (int var2 = 0; var2 < this.field435; ++var2) {
            if (this.field158[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field255[var2] == this.field248 && this.field177[var2] == this.field151) {
                        if (!this.method60(true)) {
                            var3 = true;
                        }
                    } else {
                        class69 var4 = class55.method449(this.field177[var2], (byte) 15, this.field255[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field1700 / 22) > (long) (this.field573 / 22) + this.field481) {
                            this.field573 = var4.field1700;
                            this.field481 = System.currentTimeMillis();
                            if (this.method143(var4.field1699, var4.field1700, 0)) {
                                this.field248 = this.field255[var2];
                                this.field151 = this.field177[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field158[var2] != -5) {
                    this.field158[var2] = -5;
                } else {
                    --this.field435;
                    for (int var6 = var2; var6 < this.field435; ++var6) {
                        this.field255[var6] = this.field255[var6 + 1];
                        this.field177[var6] = this.field177[var6 + 1];
                        this.field158[var6] = this.field158[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field158[var2]--;
            }
        }
        ++field362;
        if (field362 > 117) {
            field362 = 0;
            this.field552.method536(237, true);
            this.field552.method541(0);
        }
        if (this.field247 > 0) {
            this.field247 -= 20;
            if (this.field247 < 0) {
                this.field247 = 0;
            }
            if (this.field247 == 0 && this.field349 && !field392) {
                this.field326 = this.field404;
                this.field327 = true;
                this.field486.method409(2, this.field326);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method42(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field458 = -1;
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILQIVQUKBA;I)V")
    public final void method43(int arg0, int arg1, int arg2, class39 arg3, int arg4) {
        if (arg1 > 0) {
            if (field446 != arg3) {
                if (this.field484 < 400) {
                    String var6;
                    if (arg3.field1260 == 0) {
                        var6 = arg3.field1271 + method80(field446.field1269, arg3.field1269, 330) + " (level-" + arg3.field1269 + ")";
                    } else {
                        var6 = arg3.field1271 + " (skill-" + arg3.field1260 + ")";
                    }
                    if (this.field519 == 1) {
                        this.field450[this.field484] = "Use " + this.field523 + " with @whi@" + var6;
                        this.field409[this.field484] = 647;
                        this.field410[this.field484] = arg4;
                        this.field407[this.field484] = arg2;
                        this.field408[this.field484] = arg0;
                        ++this.field484;
                    } else if (this.field308 == 1) {
                        if ((this.field310 & 8) == 8) {
                            this.field450[this.field484] = this.field311 + " @whi@" + var6;
                            this.field409[this.field484] = 834;
                            this.field410[this.field484] = arg4;
                            this.field407[this.field484] = arg2;
                            this.field408[this.field484] = arg0;
                            ++this.field484;
                        }
                    } else {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (this.field192[var7] != null) {
                                this.field450[this.field484] = this.field192[var7] + " @whi@" + var6;
                                short var9 = 0;
                                if (this.field192[var7].equalsIgnoreCase("attack")) {
                                    if (arg3.field1269 > field446.field1269) {
                                        var9 = 2000;
                                    }
                                    if (field446.field1254 != 0 && arg3.field1254 != 0) {
                                        if (field446.field1254 == arg3.field1254) {
                                            var9 = 2000;
                                        } else {
                                            var9 = 0;
                                        }
                                    }
                                } else if (this.field193[var7]) {
                                    var9 = 2000;
                                }
                                if (var7 == 0) {
                                    this.field409[this.field484] = var9 + 787;
                                }
                                if (var7 == 1) {
                                    this.field409[this.field484] = var9 + 253;
                                }
                                if (var7 == 2) {
                                    this.field409[this.field484] = var9 + 808;
                                }
                                if (var7 == 3) {
                                    this.field409[this.field484] = var9 + 98;
                                }
                                if (var7 == 4) {
                                    this.field409[this.field484] = var9 + 248;
                                }
                                this.field410[this.field484] = arg4;
                                this.field407[this.field484] = arg2;
                                this.field408[this.field484] = arg0;
                                ++this.field484;
                            }
                        }
                    }
                    for (int var8 = 0; var8 < this.field484; ++var8) {
                        if (this.field409[var8] == 760) {
                            this.field450[var8] = "Walk here @whi@" + var6;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method44(int arg0) {
        this.field208 = new class47(this.field122, "titlebox", 0);
        this.field209 = new class47(this.field122, "titlebutton", 0);
        this.field444 = new class47[12];
        while (arg0 >= 0) {
            this.field458 = -1;
        }
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field444[var3] = new class47(this.field122, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field444[var4] = new class47(this.field122, "runes", (var4 & 3) + 12);
            }
        }
        this.field538 = new class30(128, 265);
        this.field539 = new class30(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field538.field1024[var5] = this.field320.field832[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field539.field1024[var6] = this.field321.field832[var6];
        }
        this.field397 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field397[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field397[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field397[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field397[var10 + 192] = 16777215;
        }
        this.field398 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field398[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field398[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field398[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field398[var14 + 192] = 16777215;
        }
        this.field399 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field399[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field399[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field399[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field399[var18 + 192] = 16777215;
        }
        this.field396 = new int[256];
        this.field137 = new int[32768];
        this.field138 = new int[32768];
        this.method138((class47) null, false);
        this.field365 = new int[32768];
        this.field366 = new int[32768];
        this.method81(10, -947, "Connecting to fileserver");
        if (!this.field518) {
            this.field440 = true;
            this.field518 = true;
            this.method124(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILCPNGZAUN;I)V")
    public final void method45(int arg0, int arg1, int arg2, class9 arg3, int arg4) {
        if (arg3.field638 == 0 && arg3.field671 != null) {
            if (!arg3.field647 || this.field485 == arg3.field649 || this.field447 == arg3.field649 || this.field420 == arg3.field649) {
                int var6 = class29.field1007;
                int var7 = class29.field1005;
                int var8 = class29.field1008;
                int var9 = class29.field1006;
                class29.method266(arg1, arg4, (byte) -109, arg3.field666 + arg4, arg3.field642 + arg1);
                int var10 = arg3.field671.length;
                if (arg0 < 7 || arg0 > 7) {
                    this.field552.method537(148);
                }
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg3.field692[var11] + arg4;
                    int var13 = arg3.field700[var11] + arg1 - arg2;
                    class9 var14 = class9.field645[arg3.field671[var11]];
                    int var15 = var14.field678 + var12;
                    int var16 = var14.field701 + var13;
                    if (var14.field677 > 0) {
                        this.method83(var14, false);
                    }
                    if (var14.field638 == 0) {
                        if (var14.field639 > var14.field685 - var14.field642) {
                            var14.field639 = var14.field685 - var14.field642;
                        }
                        if (var14.field639 < 0) {
                            var14.field639 = 0;
                        }
                        this.method45(7, var16, var14.field639, var14, var15);
                        if (var14.field685 > var14.field642) {
                            this.method87(-337, var14.field685, var16, var14.field666 + var15, var14.field639, var14.field642);
                        }
                    } else if (var14.field638 != 1) {
                        if (var14.field638 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field642; ++var18) {
                                for (int var19 = 0; var19 < var14.field666; ++var19) {
                                    int var20 = (var14.field691 + 32) * var19 + var15;
                                    int var21 = (var14.field664 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field689[var17];
                                        var21 += var14.field688[var17];
                                    }
                                    if (var14.field693[var17] <= 0) {
                                        if (var14.field673 != null && var17 < 20) {
                                            class30 var30 = var14.field673[var17];
                                            if (var30 != null) {
                                                var30.method281(3, var21, var20);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field693[var17] - 1;
                                        if (var20 > class29.field1007 - 32 && var20 < class29.field1008 && var21 > class29.field1005 - 32 && var21 < class29.field1006 || this.field269 != 0 && this.field268 == var17) {
                                            int var25 = 0;
                                            if (this.field519 == 1 && this.field520 == var17 && this.field521 == var14.field649) {
                                                var25 = 16777215;
                                            }
                                            class30 var26 = class46.method412((byte) -87, var14.field637[var17], var25, var24);
                                            if (var26 != null) {
                                                if (this.field269 != 0 && this.field268 == var17 && this.field267 == var14.field649) {
                                                    var22 = super.field925 - this.field270;
                                                    var23 = super.field926 - this.field271;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field227 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method283(128, var21 + var23, var20 + var22, 0);
                                                    if (var21 + var23 < class29.field1005 && arg3.field639 > 0) {
                                                        int var27 = (class29.field1005 - var21 - var23) * this.field526 / 3;
                                                        if (var27 > this.field526 * 10) {
                                                            var27 = this.field526 * 10;
                                                        }
                                                        if (var27 > arg3.field639) {
                                                            var27 = arg3.field639;
                                                        }
                                                        arg3.field639 -= var27;
                                                        this.field271 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class29.field1006 && arg3.field639 < arg3.field685 - arg3.field642) {
                                                        int var28 = (var21 + var23 + 32 - class29.field1006) * this.field526 / 3;
                                                        if (var28 > this.field526 * 10) {
                                                            var28 = this.field526 * 10;
                                                        }
                                                        if (var28 > arg3.field685 - arg3.field642 - arg3.field639) {
                                                            var28 = arg3.field685 - arg3.field642 - arg3.field639;
                                                        }
                                                        arg3.field639 += var28;
                                                        this.field271 -= var28;
                                                    }
                                                } else if (this.field217 != 0 && this.field216 == var17 && this.field215 == var14.field649) {
                                                    var26.method283(128, var21, var20, 0);
                                                } else {
                                                    var26.method281(3, var21, var20);
                                                }
                                                if (var26.field1029 == 33 || var14.field637[var17] != 1) {
                                                    int var29 = var14.field637[var17];
                                                    this.field499.method241(0, method175(false, var29), 3, var21 + 10 + var23, var20 + 1 + var22);
                                                    this.field499.method241(16776960, method175(false, var29), 3, var21 + 9 + var23, var20 + var22);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field638 == 3) {
                            boolean var31 = false;
                            if (this.field420 == var14.field649 || this.field447 == var14.field649 || this.field485 == var14.field649) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method122(var14, (byte) 3)) {
                                var32 = var14.field680;
                                if (var31 && var14.field643 != 0) {
                                    var32 = var14.field643;
                                }
                            } else {
                                var32 = var14.field679;
                                if (var31 && var14.field706 != 0) {
                                    var32 = var14.field706;
                                }
                            }
                            if (var14.field650 == 0) {
                                if (var14.field670) {
                                    class29.method269(var32, var14.field666, var14.field642, var16, var15, -48531);
                                } else {
                                    class29.method270(var16, true, var14.field642, var14.field666, var15, var32);
                                }
                            } else if (var14.field670) {
                                class29.method268(var14.field642, 256 - (var14.field650 & 255), this.field480, var14.field666, var15, var16, var32);
                            } else {
                                class29.method271(256 - (var14.field650 & 255), var16, var14.field642, (byte) 8, var32, var14.field666, var15);
                            }
                        } else if (var14.field638 == 4) {
                            class23 var33 = var14.field672;
                            String var34 = var14.field665;
                            boolean var35 = false;
                            if (this.field420 == var14.field649 || this.field447 == var14.field649 || this.field485 == var14.field649) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method122(var14, (byte) 3)) {
                                var36 = var14.field680;
                                if (var35 && var14.field643 != 0) {
                                    var36 = var14.field643;
                                }
                                if (var14.field661.length() > 0) {
                                    var34 = var14.field661;
                                }
                            } else {
                                var36 = var14.field679;
                                if (var35 && var14.field706 != 0) {
                                    var36 = var14.field706;
                                }
                            }
                            if (var14.field667 == 6 && this.field524) {
                                var34 = "Please wait...";
                                var36 = var14.field679;
                            }
                            if (class29.field1003 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field952 + var16;
                            while (var34.length() > 0) {
                                if (var34.indexOf("%") != -1) {
                                    label348: while (true) {
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
                                                                            break label348;
                                                                        }
                                                                        var34 = var34.substring(0, var42) + this.method42(0, this.method178(true, var14, 4)) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method42(0, this.method178(true, var14, 3)) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method42(0, this.method178(true, var14, 2)) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method42(0, this.method178(true, var14, 1)) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method42(0, this.method178(true, var14, 0)) + var34.substring(var38 + 2);
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
                                if (var14.field675) {
                                    var33.method238(var36, var37, -502, var44, var14.field666 / 2 + var15, var14.field651);
                                } else {
                                    var33.method245(var15, -224, var44, var14.field651, var37, var36);
                                }
                                var37 += var33.field952;
                            }
                        } else if (var14.field638 == 5) {
                            class30 var45;
                            if (this.method122(var14, (byte) 3)) {
                                var45 = var14.field656;
                            } else {
                                var45 = var14.field662;
                            }
                            if (var45 != null) {
                                var45.method281(3, var16, var15);
                            }
                        } else if (var14.field638 == 6) {
                            int var46 = class8.field619;
                            int var47 = class8.field620;
                            class8.field619 = var14.field666 / 2 + var15;
                            class8.field620 = var14.field642 / 2 + var16;
                            int var48 = class8.field623[var14.field658] * var14.field657 >> 16;
                            int var49 = class8.field624[var14.field658] * var14.field657 >> 16;
                            boolean var50 = this.method122(var14, (byte) 3);
                            int var51;
                            if (var50) {
                                var51 = var14.field682;
                            } else {
                                var51 = var14.field681;
                            }
                            class4 var52;
                            if (var51 == -1) {
                                var52 = var14.method204(-1, -1, var50, 7);
                            } else {
                                class20 var53 = class20.field875[var51];
                                var52 = var14.method204(var53.field878[var14.field646], var53.field877[var14.field646], var50, 7);
                            }
                            if (var52 != null) {
                                var52.method31(0, var14.field659, 0, var14.field658, 0, var48, var49);
                            }
                            class8.field619 = var46;
                            class8.field620 = var47;
                        } else if (var14.field638 == 7) {
                            class23 var54 = var14.field672;
                            int var55 = 0;
                            for (int var56 = 0; var56 < var14.field642; ++var56) {
                                for (int var57 = 0; var57 < var14.field666; ++var57) {
                                    if (var14.field693[var55] > 0) {
                                        class46 var58 = class46.method416(var14.field693[var55] - 1);
                                        String var59 = var58.field1382;
                                        if (var58.field1417 || var14.field637[var55] != 1) {
                                            var59 = var59 + " x" + method118(var14.field637[var55], false);
                                        }
                                        int var60 = (var14.field691 + 115) * var57 + var15;
                                        int var61 = (var14.field664 + 12) * var56 + var16;
                                        if (var14.field675) {
                                            var54.method238(var14.field679, var61, -502, var59, var14.field666 / 2 + var60, var14.field651);
                                        } else {
                                            var54.method245(var60, -224, var59, var14.field651, var61, var14.field679);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                class29.method266(var7, var6, (byte) -109, var8, var9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method46(int arg0) {
        if (arg0 < 1 || arg0 > 1) {
            this.field449 = !this.field449;
        }
        if (this.field551 != 0) {
            class23 var2 = this.field500;
            int var3 = 0;
            if (this.field581 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field300[var4] != null) {
                    int var5 = this.field298[var4];
                    String var6 = this.field299[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field421 == 0 || this.field421 == 1 && this.method123(765, var6))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method241(0, "From", 3, var8, var9);
                        var2.method241(65535, "From", 3, var8 - 1, var9);
                        int var10 = var9 + var2.method239(false, "From ");
                        if (var7 == 1) {
                            this.field273[0].method428(3, var8 - 12, var10);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field273[1].method428(3, var8 - 12, var10);
                            var10 += 14;
                        }
                        var2.method241(0, var6 + ": " + this.field300[var4], 3, var8, var10);
                        var2.method241(65535, var6 + ": " + this.field300[var4], 3, var8 - 1, var10);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field421 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method241(0, this.field300[var4], 3, var11, 4);
                        var2.method241(65535, this.field300[var4], 3, var11 - 1, 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field421 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method241(0, "To " + var6 + ": " + this.field300[var4], 3, var12, 4);
                        var2.method241(65535, "To " + var6 + ": " + this.field300[var4], 3, var12 - 1, 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Z")
    public final boolean method47(int arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field409[arg1];
            if (arg0 != 0) {
                for (int var4 = 1; var4 > 0; ++var4) {
                }
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 858;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public void method48(byte arg0) {
        if (arg0 != 5) {
            this.field488 = this.field560.method585();
        }
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field189);
        if (this.field486 != null) {
            System.out.println("Od-cycle:" + this.field486.field1364);
        }
        System.out.println("loop-cycle:" + field441);
        System.out.println("draw-cycle:" + field569);
        System.out.println("ptype:" + this.field458);
        System.out.println("psize:" + this.field457);
        if (this.field212 != null) {
            this.field212.method6((byte) 5);
        }
        super.field914 = true;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public final Component method49(int arg0) {
        if (arg0 < this.field504 || arg0 > this.field504) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field920 != null ? super.field920 : this;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method50(boolean arg0) {
        if (arg0) {
            try {
                int var2 = field446.field1233 + this.field512;
                int var3 = field446.field1234 + this.field384;
                if (this.field302 - var2 < -500 || this.field302 - var2 > 500 || this.field303 - var3 < -500 || this.field303 - var3 > 500) {
                    this.field302 = var2;
                    this.field303 = var3;
                }
                if (this.field302 != var2) {
                    this.field302 += (var2 - this.field302) / 16;
                }
                if (this.field303 != var3) {
                    this.field303 += (var3 - this.field303) / 16;
                }
                if (super.field935[1] == 1) {
                    this.field342 += (-24 - this.field342) / 2;
                } else if (super.field935[2] == 1) {
                    this.field342 += (24 - this.field342) / 2;
                } else {
                    this.field342 /= 2;
                }
                if (super.field935[3] == 1) {
                    this.field343 += (12 - this.field343) / 2;
                } else if (super.field935[4] == 1) {
                    this.field343 += (-12 - this.field343) / 2;
                } else {
                    this.field343 /= 2;
                }
                this.field341 = this.field342 / 2 + this.field341 & 2047;
                this.field340 += this.field343 / 2;
                if (this.field340 < 128) {
                    this.field340 = 128;
                }
                if (this.field340 > 383) {
                    this.field340 = 383;
                }
                int var4 = this.field302 >> 7;
                int var5 = this.field303 >> 7;
                int var6 = this.method151(this.field210, false, this.field303, this.field302);
                int var7 = 0;
                if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                    for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                        for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                            int var10 = this.field210;
                            if (var10 < 3 && (this.field549[1][var8][var9] & 2) == 2) {
                                ++var10;
                            }
                            int var11 = var6 - this.field161[var10][var8][var9];
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
                if (var12 > this.field387) {
                    this.field387 += (var12 - this.field387) / 24;
                } else if (var12 < this.field387) {
                    this.field387 += (var12 - this.field387) / 80;
                }
            } catch (Exception var13) {
                signlink.reporterror("glfc_ex " + field446.field1233 + "," + field446.field1234 + "," + this.field302 + "," + this.field303 + "," + this.field241 + "," + this.field242 + "," + this.field185 + "," + this.field186);
                throw new RuntimeException("eek");
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method51(int arg0) {
        class33.field1158.method230();
        class33.field1122.method230();
        class68.field1678.method230();
        class46.field1412.method230();
        if (arg0 <= 0) {
            this.field473 = !this.field473;
        }
        class46.field1381.method230();
        class39.field1266.method230();
        class71.field1733.method230();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILZOMNSJJM;I)V")
    private final void method52(int arg0, class69 arg1, int arg2) {
        if (arg0 < 0) {
            while (arg1.field1701 + 10 < arg2 * 8) {
                int var4 = arg1.method558(11, true);
                if (var4 == 2047) {
                    break;
                }
                if (this.field491[var4] == null) {
                    this.field491[var4] = new class39();
                    if (this.field496[var4] != null) {
                        this.field491[var4].method374(false, this.field496[var4]);
                    }
                }
                this.field493[this.field492++] = var4;
                class39 var5 = this.field491[var4];
                var5.field1231 = field441;
                int var6 = arg1.method558(5, true);
                if (var6 > 15) {
                    var6 -= 32;
                }
                int var7 = arg1.method558(5, true);
                if (var7 > 15) {
                    var7 -= 32;
                }
                int var8 = arg1.method558(1, true);
                if (var8 == 1) {
                    this.field495[this.field494++] = var4;
                }
                int var9 = arg1.method558(1, true);
                var5.method373(var9 == 1, field446.field1251[0] + var6, this.field286, field446.field1250[0] + var7);
            }
            arg1.method559(221);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method53(boolean arg0) {
        if (!arg0) {
            this.method173();
        }
        if (this.field519 == 0 && this.field308 == 0) {
            this.field450[this.field484] = "Walk here";
            this.field409[this.field484] = 760;
            this.field407[this.field484] = super.field925;
            this.field408[this.field484] = super.field926;
            ++this.field484;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class4.field94; ++var3) {
            int var4 = class4.field95[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field543.method322(this.field210, var5, var6, var4) >= 0) {
                    class33 var9 = class33.method350(var8);
                    if (var9.field1155 != null) {
                        var9 = var9.method345(this.field200);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field519 == 1) {
                        this.field450[this.field484] = "Use " + this.field523 + " with @cya@" + var9.field1132;
                        this.field409[this.field484] = 916;
                        this.field410[this.field484] = var4;
                        this.field407[this.field484] = var5;
                        this.field408[this.field484] = var6;
                        ++this.field484;
                    } else if (this.field308 == 1) {
                        if ((this.field310 & 4) == 4) {
                            this.field450[this.field484] = this.field311 + " @cya@" + var9.field1132;
                            this.field409[this.field484] = 969;
                            this.field410[this.field484] = var4;
                            this.field407[this.field484] = var5;
                            this.field408[this.field484] = var6;
                            ++this.field484;
                        }
                    } else {
                        if (var9.field1144 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field1144[var10] != null) {
                                    this.field450[this.field484] = var9.field1144[var10] + " @cya@" + var9.field1132;
                                    if (var10 == 0) {
                                        this.field409[this.field484] = 390;
                                    }
                                    if (var10 == 1) {
                                        this.field409[this.field484] = 115;
                                    }
                                    if (var10 == 2) {
                                        this.field409[this.field484] = 587;
                                    }
                                    if (var10 == 3) {
                                        this.field409[this.field484] = 429;
                                    }
                                    if (var10 == 4) {
                                        this.field409[this.field484] = 1275;
                                    }
                                    this.field410[this.field484] = var4;
                                    this.field407[this.field484] = var5;
                                    this.field408[this.field484] = var6;
                                    ++this.field484;
                                }
                            }
                        }
                        this.field450[this.field484] = "Examine @cya@" + var9.field1132;
                        this.field409[this.field484] = 1661;
                        this.field410[this.field484] = var9.field1159 << 14;
                        this.field407[this.field484] = var5;
                        this.field408[this.field484] = var6;
                        ++this.field484;
                    }
                }
                if (var7 == 1) {
                    class49 var11 = this.field554[var8];
                    if (var11.field1441.field1669 == 1 && (var11.field1233 & 127) == 64 && (var11.field1234 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field555; ++var12) {
                            class49 var15 = this.field554[this.field556[var12]];
                            if (var15 != null && var11 != var15 && var15.field1441.field1669 == 1 && var11.field1233 == var15.field1233 && var11.field1234 == var15.field1234) {
                                this.method96(this.field556[var12], var5, var6, var15.field1441, 164);
                            }
                        }
                        for (int var13 = 0; var13 < this.field492; ++var13) {
                            class39 var14 = this.field491[this.field493[var13]];
                            if (var14 != null && var11.field1233 == var14.field1233 && var11.field1234 == var14.field1234) {
                                this.method43(var6, 225, var5, var14, this.field493[var13]);
                            }
                        }
                    }
                    this.method96(var8, var5, var6, var11.field1441, 164);
                }
                if (var7 == 0) {
                    class39 var16 = this.field491[var8];
                    if ((var16.field1233 & 127) == 64 && (var16.field1234 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field555; ++var17) {
                            class49 var20 = this.field554[this.field556[var17]];
                            if (var20 != null && var20.field1441.field1669 == 1 && var16.field1233 == var20.field1233 && var16.field1234 == var20.field1234) {
                                this.method96(this.field556[var17], var5, var6, var20.field1441, 164);
                            }
                        }
                        for (int var18 = 0; var18 < this.field492; ++var18) {
                            class39 var19 = this.field491[this.field493[var18]];
                            if (var19 != null && var16 != var19 && var16.field1233 == var19.field1233 && var16.field1234 == var19.field1234) {
                                this.method43(var6, 225, var5, var19, this.field493[var18]);
                            }
                        }
                    }
                    this.method43(var6, 225, var5, var16, var8);
                }
                if (var7 == 3) {
                    class66 var21 = this.field572[this.field210][var5][var6];
                    if (var21 != null) {
                        for (class25 var22 = (class25) var21.method524(0); var22 != null; var22 = (class25) var21.method526(6)) {
                            class46 var23 = class46.method416(var22.field972);
                            if (this.field519 == 1) {
                                this.field450[this.field484] = "Use " + this.field523 + " with @lre@" + var23.field1382;
                                this.field409[this.field484] = 668;
                                this.field410[this.field484] = var22.field972;
                                this.field407[this.field484] = var5;
                                this.field408[this.field484] = var6;
                                ++this.field484;
                            } else if (this.field308 == 1) {
                                if ((this.field310 & 1) == 1) {
                                    this.field450[this.field484] = this.field311 + " @lre@" + var23.field1382;
                                    this.field409[this.field484] = 18;
                                    this.field410[this.field484] = var22.field972;
                                    this.field407[this.field484] = var5;
                                    this.field408[this.field484] = var6;
                                    ++this.field484;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1394 != null && var23.field1394[var24] != null) {
                                        this.field450[this.field484] = var23.field1394[var24] + " @lre@" + var23.field1382;
                                        if (var24 == 0) {
                                            this.field409[this.field484] = 242;
                                        }
                                        if (var24 == 1) {
                                            this.field409[this.field484] = 172;
                                        }
                                        if (var24 == 2) {
                                            this.field409[this.field484] = 746;
                                        }
                                        if (var24 == 3) {
                                            this.field409[this.field484] = 258;
                                        }
                                        if (var24 == 4) {
                                            this.field409[this.field484] = 229;
                                        }
                                        this.field410[this.field484] = var22.field972;
                                        this.field407[this.field484] = var5;
                                        this.field408[this.field484] = var6;
                                        ++this.field484;
                                    } else if (var24 == 2) {
                                        this.field450[this.field484] = "Take @lre@" + var23.field1382;
                                        this.field409[this.field484] = 746;
                                        this.field410[this.field484] = var22.field972;
                                        this.field407[this.field484] = var5;
                                        this.field408[this.field484] = var6;
                                        ++this.field484;
                                    }
                                }
                                this.field450[this.field484] = "Examine @lre@" + var23.field1382;
                                this.field409[this.field484] = 1731;
                                this.field410[this.field484] = var22.field972;
                                this.field407[this.field484] = var5;
                                this.field408[this.field484] = var6;
                                ++this.field484;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method54(int arg0) {
        int var2 = this.field128 * 128 + 64;
        int var3 = this.field129 * 128 + 64;
        int var4 = this.method151(this.field210, false, var3, var2) - this.field130;
        if (arg0 != 4) {
            this.field293 = 340;
        }
        if (this.field195 < var2) {
            this.field195 += (var2 - this.field195) * this.field132 / 1000 + this.field131;
            if (this.field195 > var2) {
                this.field195 = var2;
            }
        }
        if (this.field195 > var2) {
            this.field195 -= (this.field195 - var2) * this.field132 / 1000 + this.field131;
            if (this.field195 < var2) {
                this.field195 = var2;
            }
        }
        if (this.field196 < var4) {
            this.field196 += (var4 - this.field196) * this.field132 / 1000 + this.field131;
            if (this.field196 > var4) {
                this.field196 = var4;
            }
        }
        if (this.field196 > var4) {
            this.field196 -= (this.field196 - var4) * this.field132 / 1000 + this.field131;
            if (this.field196 < var4) {
                this.field196 = var4;
            }
        }
        if (this.field197 < var3) {
            this.field197 += (var3 - this.field197) * this.field132 / 1000 + this.field131;
            if (this.field197 > var3) {
                this.field197 = var3;
            }
        }
        if (this.field197 > var3) {
            this.field197 -= (this.field197 - var3) * this.field132 / 1000 + this.field131;
            if (this.field197 < var3) {
                this.field197 = var3;
            }
        }
        int var5 = this.field430 * 128 + 64;
        int var6 = this.field431 * 128 + 64;
        int var7 = this.method151(this.field210, false, var6, var5) - this.field432;
        int var8 = var5 - this.field195;
        int var9 = var7 - this.field196;
        int var10 = var6 - this.field197;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field198 < var12) {
            this.field198 += (var12 - this.field198) * this.field434 / 1000 + this.field433;
            if (this.field198 > var12) {
                this.field198 = var12;
            }
        }
        if (this.field198 > var12) {
            this.field198 -= (this.field198 - var12) * this.field434 / 1000 + this.field433;
            if (this.field198 < var12) {
                this.field198 = var12;
            }
        }
        int var14 = var13 - this.field199;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field199 += this.field434 * var14 / 1000 + this.field433;
            this.field199 &= 2047;
        }
        if (var14 < 0) {
            this.field199 -= -var14 * this.field434 / 1000 + this.field433;
            this.field199 &= 2047;
        }
        int var15 = var13 - this.field199;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field199 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (arg0 != 6) {
            this.field166 = !this.field166;
        }
        Graphics var2 = this.method49(8).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method234(1, true);
        if (this.field106) {
            this.field518 = false;
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
        if (this.field423) {
            this.field518 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field475) {
            this.field518 = false;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(JB)V")
    public final void method56(long arg0, byte arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field483; ++var4) {
                if (this.field307[var4] == arg0) {
                    --this.field483;
                    this.field426 = true;
                    for (int var5 = var4; var5 < this.field483; ++var5) {
                        this.field307[var5] = this.field307[var5 + 1];
                    }
                    this.field552.method536(245, true);
                    this.field552.method543(arg0, (byte) 5);
                    break;
                }
            }
            if (arg1 == 2) {
                boolean var6 = false;
            } else {
                this.field338 = -432;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILLXRBRCRX;II)V")
    public final void method57(int arg0, class30 arg1, int arg2, int arg3) {
        int var5 = 74 / arg2;
        int var6 = this.field341 + this.field314 & 2047;
        int var7 = arg0 * arg0 + arg3 * arg3;
        if (var7 <= 6400) {
            int var8 = class4.field96[var6];
            int var9 = class4.field97[var6];
            int var10 = var8 * 256 / (this.field134 + 256);
            int var11 = var9 * 256 / (this.field134 + 256);
            int var12 = arg0 * var10 + arg3 * var11 >> 16;
            int var13 = arg0 * var11 - arg3 * var10 >> 16;
            if (var7 > 2500) {
                arg1.method287((byte) 1, this.field149, var12 + 94 - arg1.field1029 / 2 + 4, 83 - var13 - arg1.field1030 / 2 - 4);
            } else {
                arg1.method281(3, 83 - var13 - arg1.field1030 / 2 - 4, var12 + 94 - arg1.field1029 / 2 + 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        try {
            if (this.field212 != null) {
                this.field212.method1();
            }
        } catch (Exception var3) {
        }
        this.field212 = null;
        if (arg0) {
            this.field535 = false;
            this.field376 = 0;
            this.field478 = "";
            this.field479 = "";
            this.method51(this.field108);
            this.field543.method292(-49777);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field306[var2].method354();
            }
            System.gc();
            this.method168(9);
            this.field404 = -1;
            this.field326 = -1;
            this.field247 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method59(int arg0) {
        while (arg0 >= 0) {
            this.field572 = null;
        }
        while (true) {
            class45 var2 = this.field486.method391();
            if (var2 == null) {
                return;
            }
            if (var2.field1370 == 0) {
                class4.method9(var2.field1374, (byte) 6, var2.field1373);
                if ((this.field486.method395(true, var2.field1373) & 98) != 0) {
                    this.field426 = true;
                    if (this.field350 != -1) {
                        this.field252 = true;
                    }
                }
            }
            if (var2.field1370 == 1 && var2.field1374 != null) {
                class41.method380(var2.field1374, this.field226);
            }
            if (var2.field1370 == 2 && this.field326 == var2.field1373 && var2.field1374 != null) {
                this.method137(var2.field1374, this.field327, false);
            }
            if (var2.field1370 == 3 && this.field312 == 1) {
                for (int var3 = 0; var3 < this.field289.length; ++var3) {
                    if (this.field279[var3] == var2.field1373) {
                        this.field289[var3] = var2.field1374;
                        if (var2.field1374 == null) {
                            this.field279[var3] = -1;
                        }
                        break;
                    }
                    if (this.field280[var3] == var2.field1373) {
                        this.field179[var3] = var2.field1374;
                        if (var2.field1374 == null) {
                            this.field280[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field1370 == 93 && this.field486.method408(var2.field1373, true)) {
                class63.method513(1, this.field486, new class69(var2.field1374, field428));
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)Z")
    public final boolean method60(boolean arg0) {
        this.field535 &= arg0;
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method61(int arg0) {
        if (this.field551 != 0) {
            int var2 = 0;
            if (this.field581 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field300[var3] != null) {
                    int var4 = this.field298[var3];
                    String var5 = this.field299[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field421 == 0 || this.field421 == 1 && this.method123(765, var5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field925 > 4 && super.field926 - 4 > var9 - 10 && super.field926 - 4 <= var9 + 3) {
                            int var10 = this.field500.method239(false, "From:  " + var5 + this.field300[var3]) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field925 < var10 + 4) {
                                if (this.field282 >= 1) {
                                    this.field450[this.field484] = "Report abuse @whi@" + var5;
                                    this.field409[this.field484] = 2036;
                                    ++this.field484;
                                }
                                this.field450[this.field484] = "Add ignore @whi@" + var5;
                                this.field409[this.field484] = 2380;
                                ++this.field484;
                                this.field450[this.field484] = "Add friend @whi@" + var5;
                                this.field409[this.field484] = 2858;
                                ++this.field484;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field421 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            this.field457 += arg0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILZOMNSJJM;)V")
    private final void method62(boolean arg0, int arg1, class69 arg2) {
        int var4 = arg2.method558(8, true);
        if (var4 < this.field492) {
            for (int var5 = var4; var5 < this.field492; ++var5) {
                this.field171[this.field170++] = this.field493[var5];
            }
        }
        if (var4 > this.field492) {
            signlink.reporterror(this.field478 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field492 = 0;
            this.field535 &= arg0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field493[var6];
                class39 var8 = this.field491[var7];
                int var9 = arg2.method558(1, true);
                if (var9 == 0) {
                    this.field493[this.field492++] = var7;
                    var8.field1231 = field441;
                } else {
                    int var10 = arg2.method558(2, true);
                    if (var10 == 0) {
                        this.field493[this.field492++] = var7;
                        var8.field1231 = field441;
                        this.field495[this.field494++] = var7;
                    } else if (var10 == 1) {
                        this.field493[this.field492++] = var7;
                        var8.field1231 = field441;
                        int var11 = arg2.method558(3, true);
                        var8.method371(var11, (byte) -107, false);
                        int var12 = arg2.method558(1, true);
                        if (var12 == 1) {
                            this.field495[this.field494++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field493[this.field492++] = var7;
                        var8.field1231 = field441;
                        int var13 = arg2.method558(3, true);
                        var8.method371(var13, (byte) -107, true);
                        int var14 = arg2.method558(3, true);
                        var8.method371(var14, (byte) -107, true);
                        int var15 = arg2.method558(1, true);
                        if (var15 == 1) {
                            this.field495[this.field494++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field171[this.field170++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIIIIII)V")
    private final void method63(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field535 &= arg1;
        if (arg6 >= 1 && arg2 >= 1 && arg6 <= 102 && arg2 <= 102) {
            if (field392 && this.field210 != arg7) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg3 == 0) {
                var9 = this.field543.method318(arg7, arg6, arg2);
            }
            if (arg3 == 1) {
                var9 = this.field543.method319(arg7, -974, arg6, arg2);
            }
            if (arg3 == 2) {
                var9 = this.field543.method320(arg7, arg6, arg2);
            }
            if (arg3 == 3) {
                var9 = this.field543.method321(arg7, arg6, arg2);
            }
            if (var9 != 0) {
                int var13 = this.field543.method322(arg7, arg6, arg2, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg3 == 0) {
                    this.field543.method309(arg7, arg2, (byte) 73, arg6);
                    class33 var17 = class33.method350(var14);
                    if (var17.field1127) {
                        this.field306[arg7].method359(var15, true, arg6, var17.field1164, var16, arg2);
                    }
                }
                if (arg3 == 1) {
                    this.field543.method310(true, arg2, arg6, arg7);
                }
                if (arg3 == 2) {
                    this.field543.method311(arg6, false, arg2, arg7);
                    class33 var18 = class33.method350(var14);
                    if (var18.field1116 + arg6 > 103 || var18.field1116 + arg2 > 103 || var18.field1136 + arg6 > 103 || var18.field1136 + arg2 > 103) {
                        return;
                    }
                    if (var18.field1127) {
                        this.field306[arg7].method360(var18.field1136, 1, arg2, var18.field1164, var16, var18.field1116, arg6);
                    }
                }
                if (arg3 == 3) {
                    this.field543.method312(arg7, 8, arg6, arg2);
                    class33 var19 = class33.method350(var14);
                    if (var19.field1127 && var19.field1148) {
                        this.field306[arg7].method362(arg2, false, arg6);
                    }
                }
            }
            if (arg5 >= 0) {
                int var20 = arg7;
                if (arg7 < 3 && (this.field549[1][arg6][arg2] & 2) == 2) {
                    var20 = arg7 + 1;
                }
                class63.method504(arg0, this.field543, this.field161, arg4, var20, true, arg5, arg7, this.field306[arg7], arg6, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method64(boolean arg0) {
        if (!arg0) {
            this.field552.method537(244);
        }
        ++field283;
        if (field283 > 157) {
            field283 = 0;
            this.field552.method536(169, true);
            this.field552.method538(60877);
        }
        for (int var2 = 0; var2 < this.field555; ++var2) {
            int var3 = this.field556[var2];
            class49 var4 = this.field554[var3];
            if (var4 != null) {
                this.method65(var4.field1441.field1669, -29048, var4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILOVZHBYZU;)V")
    public final void method65(int arg0, int arg1, class38 arg2) {
        if (arg1 != -29048) {
            this.field166 = !this.field166;
        }
        if (arg2.field1233 < 128 || arg2.field1234 < 128 || arg2.field1233 >= 13184 || arg2.field1234 >= 13184) {
            arg2.field1245 = -1;
            arg2.field1200 = -1;
            arg2.field1240 = 0;
            arg2.field1241 = 0;
            arg2.field1233 = arg2.field1250[0] * 128 + arg2.field1214 * 64;
            arg2.field1234 = arg2.field1251[0] * 128 + arg2.field1214 * 64;
            arg2.method372(false);
        }
        if (field446 == arg2 && (arg2.field1233 < 1536 || arg2.field1234 < 1536 || arg2.field1233 >= 11776 || arg2.field1234 >= 11776)) {
            arg2.field1245 = -1;
            arg2.field1200 = -1;
            arg2.field1240 = 0;
            arg2.field1241 = 0;
            arg2.field1233 = arg2.field1250[0] * 128 + arg2.field1214 * 64;
            arg2.field1234 = arg2.field1251[0] * 128 + arg2.field1214 * 64;
            arg2.method372(false);
        }
        if (arg2.field1240 > field441) {
            this.method66(arg2, this.field357);
        } else if (arg2.field1241 >= field441) {
            this.method67(-689, arg2);
        } else {
            this.method68((byte) 5, arg2);
        }
        this.method69(arg2, (byte) -114);
        this.method70(arg2, 0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LOVZHBYZU;Z)V")
    public final void method66(class38 arg0, boolean arg1) {
        int var3 = arg0.field1240 - field441;
        int var4 = arg0.field1236 * 128 + arg0.field1214 * 64;
        int var5 = arg0.field1238 * 128 + arg0.field1214 * 64;
        arg0.field1233 += (var4 - arg0.field1233) / var3;
        this.field535 &= arg1;
        arg0.field1234 += (var5 - arg0.field1234) / var3;
        arg0.field1230 = 0;
        if (arg0.field1242 == 0) {
            arg0.field1228 = 1024;
        }
        if (arg0.field1242 == 1) {
            arg0.field1228 = 1536;
        }
        if (arg0.field1242 == 2) {
            arg0.field1228 = 0;
        }
        if (arg0.field1242 == 3) {
            arg0.field1228 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILOVZHBYZU;)V")
    public final void method67(int arg0, class38 arg1) {
        if (field441 == arg1.field1241 || arg1.field1245 == -1 || arg1.field1248 != 0 || arg1.field1247 + 1 > class20.field875[arg1.field1245].method226((byte) 6, arg1.field1246)) {
            int var3 = arg1.field1241 - arg1.field1240;
            int var4 = field441 - arg1.field1240;
            int var5 = arg1.field1236 * 128 + arg1.field1214 * 64;
            int var6 = arg1.field1238 * 128 + arg1.field1214 * 64;
            int var7 = arg1.field1237 * 128 + arg1.field1214 * 64;
            int var8 = arg1.field1239 * 128 + arg1.field1214 * 64;
            arg1.field1233 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field1234 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field1230 = 0;
        if (arg1.field1242 == 0) {
            arg1.field1228 = 1024;
        }
        if (arg1.field1242 == 1) {
            arg1.field1228 = 1536;
        }
        if (arg1.field1242 == 2) {
            arg1.field1228 = 0;
        }
        if (arg1.field1242 == 3) {
            arg1.field1228 = 512;
        }
        arg1.field1235 = arg1.field1228;
        if (arg0 >= 0) {
            field503 = -213;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLOVZHBYZU;)V")
    public final void method68(byte arg0, class38 arg1) {
        arg1.field1197 = arg1.field1210;
        if (arg1.field1220 == 0) {
            arg1.field1230 = 0;
        } else {
            if (arg1.field1245 != -1 && arg1.field1248 == 0) {
                class20 var3 = class20.field875[arg1.field1245];
                if (arg1.field1215 > 0 && var3.field887 == 0) {
                    ++arg1.field1230;
                    return;
                }
                if (arg1.field1215 <= 0 && var3.field888 == 0) {
                    ++arg1.field1230;
                    return;
                }
            }
            int var4 = arg1.field1233;
            int var5 = arg1.field1234;
            int var6 = arg1.field1250[arg1.field1220 - 1] * 128 + arg1.field1214 * 64;
            int var7 = arg1.field1251[arg1.field1220 - 1] * 128 + arg1.field1214 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field1228 = 1280;
                    } else if (var5 > var7) {
                        arg1.field1228 = 1792;
                    } else {
                        arg1.field1228 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field1228 = 768;
                    } else if (var5 > var7) {
                        arg1.field1228 = 256;
                    } else {
                        arg1.field1228 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field1228 = 1024;
                } else {
                    arg1.field1228 = 0;
                }
                int var8 = arg1.field1228 - arg1.field1235 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field1206;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field1205;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field1208;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field1207;
                }
                if (var9 == -1) {
                    var9 = arg1.field1205;
                }
                arg1.field1197 = var9;
                int var10 = 4;
                if (this.field301 != arg0) {
                    this.field572 = null;
                }
                if (arg1.field1235 != arg1.field1228 && arg1.field1252 == -1 && arg1.field1222 != 0) {
                    var10 = 2;
                }
                if (arg1.field1220 > 2) {
                    var10 = 6;
                }
                if (arg1.field1220 > 3) {
                    var10 = 8;
                }
                if (arg1.field1230 > 0 && arg1.field1220 > 1) {
                    var10 = 8;
                    --arg1.field1230;
                }
                if (arg1.field1219[arg1.field1220 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field1205 == arg1.field1197 && arg1.field1223 != -1) {
                    arg1.field1197 = arg1.field1223;
                }
                if (var4 < var6) {
                    arg1.field1233 += var10;
                    if (arg1.field1233 > var6) {
                        arg1.field1233 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field1233 -= var10;
                    if (arg1.field1233 < var6) {
                        arg1.field1233 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field1234 += var10;
                    if (arg1.field1234 > var7) {
                        arg1.field1234 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field1234 -= var10;
                    if (arg1.field1234 < var7) {
                        arg1.field1234 = var7;
                    }
                }
                if (arg1.field1233 == var6 && arg1.field1234 == var7) {
                    --arg1.field1220;
                    if (arg1.field1215 > 0) {
                        --arg1.field1215;
                        return;
                    }
                }
            } else {
                arg1.field1233 = var6;
                arg1.field1234 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LOVZHBYZU;B)V")
    public final void method69(class38 arg0, byte arg1) {
        if (arg1 != -114) {
            field516 = this.field560.method585();
        }
        if (arg0.field1222 != 0) {
            if (arg0.field1252 != -1 && arg0.field1252 < 32768) {
                class49 var3 = this.field554[arg0.field1252];
                if (var3 != null) {
                    int var4 = arg0.field1233 - var3.field1233;
                    int var5 = arg0.field1234 - var3.field1234;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field1228 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field1252 >= 32768) {
                int var6 = arg0.field1252 - 32768;
                if (this.field514 == var6) {
                    var6 = this.field490;
                }
                class39 var7 = this.field491[var6];
                if (var7 != null) {
                    int var8 = arg0.field1233 - var7.field1233;
                    int var9 = arg0.field1234 - var7.field1234;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field1228 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field1243 != 0 || arg0.field1244 != 0) && (arg0.field1220 == 0 || arg0.field1230 > 0)) {
                int var10 = arg0.field1233 - (arg0.field1243 - this.field185 - this.field185) * 64;
                int var11 = arg0.field1234 - (arg0.field1244 - this.field186 - this.field186) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field1228 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field1243 = 0;
                arg0.field1244 = 0;
            }
            int var12 = arg0.field1228 - arg0.field1235 & 2047;
            if (var12 != 0) {
                if (var12 >= arg0.field1222 && var12 <= 2048 - arg0.field1222) {
                    if (var12 > 1024) {
                        arg0.field1235 -= arg0.field1222;
                    } else {
                        arg0.field1235 += arg0.field1222;
                    }
                } else {
                    arg0.field1235 = arg0.field1228;
                }
                arg0.field1235 &= 2047;
                if (arg0.field1210 == arg0.field1197 && arg0.field1235 != arg0.field1228) {
                    if (arg0.field1211 != -1) {
                        arg0.field1197 = arg0.field1211;
                        return;
                    }
                    arg0.field1197 = arg0.field1205;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LOVZHBYZU;I)V")
    public final void method70(class38 arg0, int arg1) {
        if (arg1 == 0) {
            arg0.field1221 = false;
            if (arg0.field1197 != -1) {
                class20 var3 = class20.field875[arg0.field1197];
                ++arg0.field1199;
                if (arg0.field1198 < var3.field876 && arg0.field1199 > var3.method226((byte) 6, arg0.field1198)) {
                    arg0.field1199 = 0;
                    ++arg0.field1198;
                }
                if (arg0.field1198 >= var3.field876) {
                    arg0.field1199 = 0;
                    arg0.field1198 = 0;
                }
            }
            if (arg0.field1200 != -1 && field441 >= arg0.field1203) {
                if (arg0.field1201 < 0) {
                    arg0.field1201 = 0;
                }
                class20 var4 = class71.field1721[arg0.field1200].field1725;
                ++arg0.field1202;
                while (arg0.field1201 < var4.field876 && arg0.field1202 > var4.method226((byte) 6, arg0.field1201)) {
                    arg0.field1202 -= var4.method226((byte) 6, arg0.field1201);
                    ++arg0.field1201;
                }
                if (arg0.field1201 >= var4.field876 && (arg0.field1201 < 0 || arg0.field1201 >= var4.field876)) {
                    arg0.field1200 = -1;
                }
            }
            if (arg0.field1245 != -1 && arg0.field1248 <= 1) {
                class20 var5 = class20.field875[arg0.field1245];
                if (var5.field887 == 1 && arg0.field1215 > 0 && arg0.field1240 <= field441 && arg0.field1241 < field441) {
                    arg0.field1248 = 1;
                    return;
                }
            }
            if (arg0.field1245 != -1 && arg0.field1248 == 0) {
                class20 var6 = class20.field875[arg0.field1245];
                ++arg0.field1247;
                while (arg0.field1246 < var6.field876 && arg0.field1247 > var6.method226((byte) 6, arg0.field1246)) {
                    arg0.field1247 -= var6.method226((byte) 6, arg0.field1246);
                    ++arg0.field1246;
                }
                if (arg0.field1246 >= var6.field876) {
                    arg0.field1246 -= var6.field880;
                    ++arg0.field1249;
                    if (arg0.field1249 >= var6.field886) {
                        arg0.field1245 = -1;
                    }
                    if (arg0.field1246 < 0 || arg0.field1246 >= var6.field876) {
                        arg0.field1245 = -1;
                    }
                }
                arg0.field1221 = var6.field882;
            }
            if (arg0.field1248 > 0) {
                --arg0.field1248;
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method71(int arg0) {
        if (this.field563) {
            this.field563 = false;
            this.field113.method213(9, 0, super.field917, 4);
            this.field114.method213(9, 0, super.field917, 357);
            this.field115.method213(9, 722, super.field917, 4);
            this.field116.method213(9, 743, super.field917, 205);
            this.field117.method213(9, 0, super.field917, 0);
            this.field118.method213(9, 516, super.field917, 4);
            this.field119.method213(9, 516, super.field917, 205);
            this.field120.method213(9, 496, super.field917, 357);
            this.field121.method213(9, 0, super.field917, 338);
            this.field426 = true;
            this.field252 = true;
            this.field251 = true;
            this.field237 = true;
            if (this.field312 != 2) {
                this.field143.method213(9, 4, super.field917, 4);
                this.field142.method213(9, 550, super.field917, 4);
            }
        }
        if (this.field312 == 2) {
            this.method100((byte) 2);
        }
        if (this.field211 && this.field370 == 1) {
            this.field426 = true;
        }
        if (this.field367 != -1) {
            boolean var2 = this.method148(false, this.field526, this.field367);
            if (var2) {
                this.field426 = true;
            }
        }
        if (this.field217 == 2) {
            this.field426 = true;
        }
        if (this.field269 == 2) {
            this.field426 = true;
        }
        if (this.field426) {
            this.method179(true);
            this.field426 = false;
        }
        if (this.field350 == -1) {
            this.field470.field639 = this.field445 - this.field316 - 77;
            if (super.field925 > 448 && super.field925 < 560 && super.field926 > 332) {
                this.method89(0, super.field926 - 357, false, this.field445, 77, this.field338, 463, super.field925 - 17, this.field470);
            }
            int var3 = this.field445 - 77 - this.field470.field639;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field445 - 77) {
                var3 = this.field445 - 77;
            }
            if (this.field316 != var3) {
                this.field316 = var3;
                this.field252 = true;
            }
        }
        if (this.field350 != -1) {
            boolean var4 = this.method148(false, this.field526, this.field350);
            if (var4) {
                this.field252 = true;
            }
        }
        if (this.field217 == 3) {
            this.field252 = true;
        }
        if (this.field269 == 3) {
            this.field252 = true;
        }
        if (this.field275 != null) {
            this.field252 = true;
        }
        if (this.field211 && this.field370 == 2) {
            this.field252 = true;
        }
        if (this.field252) {
            this.method116(this.field244);
            this.field252 = false;
        }
        if (this.field312 == 2) {
            this.method166(this.field136);
            this.field142.method213(9, 550, super.field917, 4);
        }
        if (this.field467 != -1) {
            this.field251 = true;
        }
        if (this.field251) {
            if (this.field467 != -1 && this.field546 == this.field467) {
                this.field467 = -1;
                this.field552.method536(87, true);
                this.field552.method537(this.field546);
            }
            this.field251 = false;
            this.field511.method212(2);
            this.field453.method428(3, 0, 0);
            if (this.field367 == -1) {
                if (this.field124[this.field546] != -1) {
                    if (this.field546 == 0) {
                        this.field201.method428(3, 10, 22);
                    }
                    if (this.field546 == 1) {
                        this.field202.method428(3, 8, 54);
                    }
                    if (this.field546 == 2) {
                        this.field202.method428(3, 8, 82);
                    }
                    if (this.field546 == 3) {
                        this.field203.method428(3, 8, 110);
                    }
                    if (this.field546 == 4) {
                        this.field205.method428(3, 8, 153);
                    }
                    if (this.field546 == 5) {
                        this.field205.method428(3, 8, 181);
                    }
                    if (this.field546 == 6) {
                        this.field204.method428(3, 9, 209);
                    }
                }
                if (this.field124[0] != -1 && (this.field467 != 0 || field441 % 20 < 10)) {
                    this.field482[0].method428(3, 13, 29);
                }
                if (this.field124[1] != -1 && (this.field467 != 1 || field441 % 20 < 10)) {
                    this.field482[1].method428(3, 11, 53);
                }
                if (this.field124[2] != -1 && (this.field467 != 2 || field441 % 20 < 10)) {
                    this.field482[2].method428(3, 11, 82);
                }
                if (this.field124[3] != -1 && (this.field467 != 3 || field441 % 20 < 10)) {
                    this.field482[3].method428(3, 12, 115);
                }
                if (this.field124[4] != -1 && (this.field467 != 4 || field441 % 20 < 10)) {
                    this.field482[4].method428(3, 13, 153);
                }
                if (this.field124[5] != -1 && (this.field467 != 5 || field441 % 20 < 10)) {
                    this.field482[5].method428(3, 11, 180);
                }
                if (this.field124[6] != -1 && (this.field467 != 6 || field441 % 20 < 10)) {
                    this.field482[6].method428(3, 13, 208);
                }
            }
            this.field511.method213(9, 516, super.field917, 160);
            ++field167;
            if (field167 > 102) {
                field167 = 0;
                this.field552.method536(26, true);
                this.field552.method540(16517615);
            }
            this.field510.method212(2);
            this.field452.method428(3, 0, 0);
            if (this.field367 == -1) {
                if (this.field124[this.field546] != -1) {
                    if (this.field546 == 7) {
                        this.field180.method428(3, 0, 42);
                    }
                    if (this.field546 == 8) {
                        this.field181.method428(3, 0, 74);
                    }
                    if (this.field546 == 9) {
                        this.field181.method428(3, 0, 102);
                    }
                    if (this.field546 == 10) {
                        this.field182.method428(3, 1, 130);
                    }
                    if (this.field546 == 11) {
                        this.field184.method428(3, 0, 173);
                    }
                    if (this.field546 == 12) {
                        this.field184.method428(3, 0, 201);
                    }
                    if (this.field546 == 13) {
                        this.field183.method428(3, 0, 229);
                    }
                }
                if (this.field124[8] != -1 && (this.field467 != 8 || field441 % 20 < 10)) {
                    this.field482[7].method428(3, 2, 74);
                }
                if (this.field124[9] != -1 && (this.field467 != 9 || field441 % 20 < 10)) {
                    this.field482[8].method428(3, 3, 102);
                }
                if (this.field124[10] != -1 && (this.field467 != 10 || field441 % 20 < 10)) {
                    this.field482[9].method428(3, 4, 137);
                }
                if (this.field124[11] != -1 && (this.field467 != 11 || field441 % 20 < 10)) {
                    this.field482[10].method428(3, 2, 174);
                }
                if (this.field124[12] != -1 && (this.field467 != 12 || field441 % 20 < 10)) {
                    this.field482[11].method428(3, 2, 201);
                }
                if (this.field124[13] != -1 && (this.field467 != 13 || field441 % 20 < 10)) {
                    this.field482[12].method428(3, 2, 226);
                }
            }
            this.field510.method213(9, 496, super.field917, 466);
            this.field143.method212(2);
        }
        if (this.field237) {
            this.field237 = false;
            this.field509.method212(2);
            this.field451.method428(3, 0, 0);
            this.field500.method238(16777215, 28, -502, "Public chat", 55, true);
            if (this.field162 == 0) {
                this.field500.method238(65280, 41, -502, "On", 55, true);
            }
            if (this.field162 == 1) {
                this.field500.method238(16776960, 41, -502, "Friends", 55, true);
            }
            if (this.field162 == 2) {
                this.field500.method238(16711680, 41, -502, "Off", 55, true);
            }
            if (this.field162 == 3) {
                this.field500.method238(65535, 41, -502, "Hide", 55, true);
            }
            this.field500.method238(16777215, 28, -502, "Private chat", 184, true);
            if (this.field421 == 0) {
                this.field500.method238(65280, 41, -502, "On", 184, true);
            }
            if (this.field421 == 1) {
                this.field500.method238(16776960, 41, -502, "Friends", 184, true);
            }
            if (this.field421 == 2) {
                this.field500.method238(16711680, 41, -502, "Off", 184, true);
            }
            this.field500.method238(16777215, 28, -502, "Trade/compete", 324, true);
            if (this.field253 == 0) {
                this.field500.method238(65280, 41, -502, "On", 324, true);
            }
            if (this.field253 == 1) {
                this.field500.method238(16776960, 41, -502, "Friends", 324, true);
            }
            if (this.field253 == 2) {
                this.field500.method238(16711680, 41, -502, "Off", 324, true);
            }
            this.field500.method238(16777215, 33, -502, "Report abuse", 458, true);
            this.field509.method213(9, 0, super.field917, 453);
            this.field143.method212(2);
        }
        this.field526 = 0;
        if (arg0 < 1 || arg0 > 1) {
            this.field145 = 449;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILLCCAHTIM;)V")
    private final void method72(int arg0, class27 arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field981 == 0) {
            var3 = this.field543.method318(arg1.field980, arg1.field982, arg1.field983);
        }
        if (arg1.field981 == 1) {
            var3 = this.field543.method319(arg1.field980, -974, arg1.field982, arg1.field983);
        }
        if (arg1.field981 == 2) {
            var3 = this.field543.method320(arg1.field980, arg1.field982, arg1.field983);
        }
        if (arg1.field981 == 3) {
            var3 = this.field543.method321(arg1.field980, arg1.field982, arg1.field983);
        }
        if (var3 != 0) {
            int var7 = this.field543.method322(arg1.field980, arg1.field982, arg1.field983, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field984 = var4;
        arg1.field986 = var5;
        this.field457 += arg0;
        arg1.field985 = var6;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method73(int arg0, int arg1) {
        int[] var3 = this.field464.field1024;
        this.field457 += arg1;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field549[arg0][var24][var6] & 24) == 0) {
                    this.field543.method327(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field549[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field543.method327(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field464.method276(2);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field549[arg0][var22][var9] & 24) == 0) {
                    this.method86(arg0, var7, var8, -719, var9, var22);
                }
                if (arg0 < 3 && (this.field549[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method86(arg0 + 1, var7, var8, -719, var9, var22);
                }
            }
        }
        this.field143.method212(2);
        this.field331 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field543.method321(this.field210, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class33.method350(var13).field1161;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field306[this.field210].field1182;
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
                        this.field505[this.field331] = this.field534[var14];
                        this.field332[this.field331] = var15;
                        this.field333[this.field331] = var16;
                        ++this.field331;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method74(int arg0) {
        if (this.field461 > 0) {
            this.method58(true);
        } else {
            this.field143.method212(2);
            this.field500.method237(144, 0, "Connection lost", true, 257);
            int var2 = 0 / arg0;
            this.field500.method237(143, 16777215, "Connection lost", true, 256);
            this.field500.method237(159, 0, "Please wait - attempting to reestablish", true, 257);
            this.field500.method237(158, 16777215, "Please wait - attempting to reestablish", true, 256);
            this.field143.method213(9, 4, super.field917, 4);
            this.field345 = 0;
            this.field462 = 0;
            class3 var3 = this.field212;
            this.field535 = false;
            this.field207 = 0;
            this.method91(this.field478, this.field479, true);
            if (!this.field535) {
                this.method58(true);
            }
            try {
                var3.method1();
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZI)V")
    public final void method75(byte arg0, boolean arg1, int arg2) {
        if (arg0 != 9) {
            this.field572 = null;
        }
        signlink.midivol = arg2;
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method76(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field572 = null;
        }
        if (arg0 >= 0) {
            if (this.field476 != 0) {
                this.field476 = 0;
                this.field252 = true;
            }
            int var3 = this.field407[arg0];
            int var4 = this.field408[arg0];
            int var5 = this.field409[arg0];
            int var6 = this.field410[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 248) {
                class39 var7 = this.field491[var6];
                if (var7 != null) {
                    this.method90(var7.field1251[0], false, field446.field1251[0], true, 0, var7.field1250[0], 0, 1, 1, 2, field446.field1250[0], 0);
                    this.field577 = super.field932;
                    this.field578 = super.field933;
                    this.field580 = 2;
                    this.field579 = 0;
                    if ((var6 & 3) == 0) {
                        ++field528;
                    }
                    if (field528 >= 60) {
                        this.field552.method536(126, true);
                        field528 = 0;
                    }
                    this.field552.method536(82, true);
                    this.field552.method571(var6, true);
                }
            }
            if (var5 == 1176) {
                class46 var8 = class46.method416(var6);
                class9 var9 = class9.field645[var4];
                String var10;
                if (var9 != null && var9.field637[var3] >= 100000) {
                    var10 = var9.field637[var3] + " x " + var8.field1382;
                } else if (var8.field1396 != null) {
                    var10 = new String(var8.field1396);
                } else {
                    var10 = "It's a " + var8.field1382 + ".";
                }
                this.method131((byte) 5, 0, "", var10);
            }
            if (var5 == 1661) {
                int var11 = var6 >> 14 & 32767;
                class33 var12 = class33.method350(var11);
                String var13;
                if (var12.field1138 != null) {
                    var13 = new String(var12.field1138);
                } else {
                    var13 = "It's a " + var12.field1132 + ".";
                }
                this.method131((byte) 5, 0, "", var13);
            }
            if (var5 == 320) {
                this.field552.method536(67, true);
                this.field552.method570(var4, 0);
                this.field552.method570(var6, 0);
                this.field552.method572(0, var3);
                this.field552.method570(this.field309, 0);
                this.field214 = 0;
                this.field215 = var4;
                this.field216 = var3;
                this.field217 = 2;
                if (class9.field645[var4].field690 == this.field381) {
                    this.field217 = 1;
                }
                if (class9.field645[var4].field690 == this.field350) {
                    this.field217 = 3;
                }
            }
            if (var5 == 805 && !this.field524) {
                this.field552.method536(18, true);
                this.field552.method538(var4);
                this.field524 = true;
            }
            if (var5 == 867) {
                this.field552.method536(144, true);
                this.field552.method538(var4);
                class9 var14 = class9.field645[var4];
                if (var14.field648 != null && var14.field648[0][0] == 5) {
                    int var15 = var14.field648[0][1];
                    if (this.field530[var15] != var14.field640[0]) {
                        this.field530[var15] = var14.field640[0];
                        this.method171(var15, false);
                        this.field426 = true;
                    }
                }
            }
            if (var5 == 587) {
                this.method130(var4, -632, var3, var6);
                this.field552.method536(113, true);
                this.field552.method570(this.field185 + var3, 0);
                this.field552.method538(this.field186 + var4);
                this.field552.method570(var6 >> 14 & 32767, 0);
            }
            if (var5 == 646) {
                if ((var3 & 3) == 0) {
                    ++field388;
                }
                if (field388 >= 75) {
                    this.field552.method536(28, true);
                    this.field552.method537(116);
                    field388 = 0;
                }
                this.field552.method536(202, true);
                this.field552.method538(var4);
                this.field552.method538(var6);
                this.field552.method570(var3, 0);
                this.field214 = 0;
                this.field215 = var4;
                this.field216 = var3;
                this.field217 = 2;
                if (class9.field645[var4].field690 == this.field381) {
                    this.field217 = 1;
                }
                if (class9.field645[var4].field690 == this.field350) {
                    this.field217 = 3;
                }
            }
            if (var5 == 98) {
                class39 var16 = this.field491[var6];
                if (var16 != null) {
                    this.method90(var16.field1251[0], false, field446.field1251[0], true, 0, var16.field1250[0], 0, 1, 1, 2, field446.field1250[0], 0);
                    this.field577 = super.field932;
                    this.field578 = super.field933;
                    this.field580 = 2;
                    this.field579 = 0;
                    this.field552.method536(203, true);
                    this.field552.method572(0, var6);
                }
            }
            if (var5 == 787) {
                class39 var17 = this.field491[var6];
                if (var17 != null) {
                    this.method90(var17.field1251[0], false, field446.field1251[0], true, 0, var17.field1250[0], 0, 1, 1, 2, field446.field1250[0], 0);
                    this.field577 = super.field932;
                    this.field578 = super.field933;
                    this.field580 = 2;
                    this.field579 = 0;
                    this.field552.method536(162, true);
                    this.field552.method538(var6);
                }
            }
            if (var5 == 808) {
                class39 var18 = this.field491[var6];
                if (var18 != null) {
                    this.method90(var18.field1251[0], false, field446.field1251[0], true, 0, var18.field1250[0], 0, 1, 1, 2, field446.field1250[0], 0);
                    this.field577 = super.field932;
                    this.field578 = super.field933;
                    this.field580 = 2;
                    this.field579 = 0;
                    this.field552.method536(242, true);
                    this.field552.method571(var6, true);
                }
            }
            if (var5 == 18) {
                boolean var19 = this.method90(var4, false, field446.field1251[0], true, 0, var3, 0, 0, 0, 2, field446.field1250[0], 0);
                if (!var19) {
                    this.method90(var4, false, field446.field1251[0], true, 0, var3, 0, 1, 1, 2, field446.field1250[0], 0);
                }
                this.field577 = super.field932;
                this.field578 = super.field933;
                this.field580 = 2;
                this.field579 = 0;
                this.field552.method536(189, true);
                this.field552.method572(0, this.field309);
                this.field552.method538(this.field186 + var4);
                this.field552.method571(var6, true);
                this.field552.method570(this.field185 + var3, 0);
            }
            if (var5 == 36) {
                String var21 = this.field450[arg0];
                int var22 = var21.indexOf("@whi@");
                if (var22 != -1) {
                    if (this.field381 == -1) {
                        this.method146(true);
                        this.field346 = var21.substring(var22 + 5).trim();
                        this.field276 = false;
                        for (int var23 = 0; var23 < class9.field645.length; ++var23) {
                            if (class9.field645[var23] != null && class9.field645[var23].field677 == 600) {
                                this.field272 = this.field381 = class9.field645[var23].field690;
                                break;
                            }
                        }
                    } else {
                        this.method131((byte) 5, 0, "", "Please close the interface you have open before using 'report abuse'");
                    }
                }
            }
            if (var5 == 916 && this.method130(var4, -632, var3, var6)) {
                this.field552.method536(217, true);
                this.field552.method570(this.field521, 0);
                this.field552.method538(var6 >> 14 & 32767);
                this.field552.method571(this.field185 + var3, true);
                this.field552.method538(this.field522);
                this.field552.method572(0, this.field186 + var4);
                this.field552.method538(this.field520);
            }
            if (var5 == 668) {
                boolean var24 = this.method90(var4, false, field446.field1251[0], true, 0, var3, 0, 0, 0, 2, field446.field1250[0], 0);
                if (!var24) {
                    this.method90(var4, false, field446.field1251[0], true, 0, var3, 0, 1, 1, 2, field446.field1250[0], 0);
                }
                this.field577 = super.field932;
                this.field578 = super.field933;
                this.field580 = 2;
                this.field579 = 0;
                this.field552.method536(61, true);
                this.field552.method571(this.field186 + var4, true);
                this.field552.method572(0, this.field522);
                this.field552.method538(var6);
                this.field552.method571(this.field520, true);
                this.field552.method572(0, this.field521);
                this.field552.method571(this.field185 + var3, true);
            }
            if (var5 == 413) {
                class49 var26 = this.field554[var6];
                if (var26 != null) {
                    this.method90(var26.field1251[0], false, field446.field1251[0], true, 0, var26.field1250[0], 0, 1, 1, 2, field446.field1250[0], 0);
                    this.field577 = super.field932;
                    this.field578 = super.field933;
                    this.field580 = 2;
                    this.field579 = 0;
                    this.field552.method536(37, true);
                    this.field552.method572(0, var6);
                }
            }
            if (var5 == 965) {
                this.field552.method536(246, true);
                this.field552.method538(var3);
                this.field552.method572(0, this.field522);
                this.field552.method571(var6, true);
                this.field552.method570(var4, 0);
                this.field552.method571(this.field521, true);
                this.field552.method570(this.field520, 0);
                this.field214 = 0;
                this.field215 = var4;
                this.field216 = var3;
                this.field217 = 2;
                if (class9.field645[var4].field690 == this.field381) {
                    this.field217 = 1;
                }
                if (class9.field645[var4].field690 == this.field350) {
                    this.field217 = 3;
                }
            }
            if (var5 == 858 || var5 == 380 || var5 == 125 || var5 == 935) {
                String var27 = this.field450[arg0];
                int var28 = var27.indexOf("@whi@");
                if (var28 != -1) {
                    long var29 = class26.method253(var27.substring(var28 + 5).trim());
                    if (var5 == 858) {
                        this.method106(-989, var29);
                    }
                    if (var5 == 380) {
                        this.method78(true, var29);
                    }
                    if (var5 == 125) {
                        this.method88(var29, 0);
                    }
                    if (var5 == 935) {
                        this.method56(var29, (byte) 2);
                    }
                }
            }
            if (var5 == 258) {
                boolean var31 = this.method90(var4, false, field446.field1251[0], true, 0, var3, 0, 0, 0, 2, field446.field1250[0], 0);
                if (!var31) {
                    this.method90(var4, false, field446.field1251[0], true, 0, var3, 0, 1, 1, 2, field446.field1250[0], 0);
                }
                this.field577 = super.field932;
                this.field578 = super.field933;
                this.field580 = 2;
                this.field579 = 0;
                field565 += this.field185;
                if (field565 >= 117) {
                    this.field552.method536(235, true);
                    this.field552.method541(0);
                    field565 = 0;
                }
                this.field552.method536(33, true);
                this.field552.method538(this.field185 + var3);
                this.field552.method570(var6, 0);
                this.field552.method572(0, this.field186 + var4);
            }
            if (var5 == 293) {
                this.method146(true);
            }
            if (var5 == 885) {
                String var33 = this.field450[arg0];
                int var34 = var33.indexOf("@whi@");
                if (var34 != -1) {
                    long var35 = class26.method253(var33.substring(var34 + 5).trim());
                    int var37 = -1;
                    for (int var38 = 0; var38 < this.field424; ++var38) {
                        if (this.field111[var38] == var35) {
                            var37 = var38;
                            break;
                        }
                    }
                    if (var37 != -1 && this.field123[var37] > 0) {
                        this.field252 = true;
                        this.field476 = 0;
                        this.field240 = true;
                        this.field146 = "";
                        this.field206 = 3;
                        this.field152 = this.field111[var37];
                        this.field213 = "Enter message to send to " + this.field379[var37];
                    }
                }
            }
            if (var5 == 242) {
                boolean var39 = this.method90(var4, false, field446.field1251[0], true, 0, var3, 0, 0, 0, 2, field446.field1250[0], 0);
                if (!var39) {
                    this.method90(var4, false, field446.field1251[0], true, 0, var3, 0, 1, 1, 2, field446.field1250[0], 0);
                }
                this.field577 = super.field932;
                this.field578 = super.field933;
                this.field580 = 2;
                this.field579 = 0;
                ++field443;
                if (field443 >= 140) {
                    this.field552.method536(204, true);
                    this.field552.method537(177);
                    field443 = 0;
                }
                this.field552.method536(175, true);
                this.field552.method572(0, var6);
                this.field552.method570(this.field185 + var3, 0);
                this.field552.method570(this.field186 + var4, 0);
            }
            if (var5 == 1731) {
                class46 var41 = class46.method416(var6);
                String var42;
                if (var41.field1396 != null) {
                    var42 = new String(var41.field1396);
                } else {
                    var42 = "It's a " + var41.field1382 + ".";
                }
                this.method131((byte) 5, 0, "", var42);
            }
            if (var5 == 421) {
                this.field552.method536(55, true);
                this.field552.method572(0, var4);
                this.field552.method571(var3, true);
                this.field552.method538(var6);
                this.field214 = 0;
                this.field215 = var4;
                this.field216 = var3;
                this.field217 = 2;
                if (class9.field645[var4].field690 == this.field381) {
                    this.field217 = 1;
                }
                if (class9.field645[var4].field690 == this.field350) {
                    this.field217 = 3;
                }
            }
            if (var5 == 228) {
                this.field552.method536(144, true);
                this.field552.method538(var4);
                class9 var43 = class9.field645[var4];
                if (var43.field648 != null && var43.field648[0][0] == 5) {
                    int var44 = var43.field648[0][1];
                    this.field530[var44] = 1 - this.field530[var44];
                    this.method171(var44, false);
                    this.field426 = true;
                }
            }
            if (var5 == 115) {
                this.method130(var4, -632, var3, var6);
                this.field552.method536(72, true);
                this.field552.method538(this.field186 + var4);
                this.field552.method571(var6 >> 14 & 32767, true);
                this.field552.method571(this.field185 + var3, true);
            }
            if (var5 == 536) {
                class49 var45 = this.field554[var6];
                if (var45 != null) {
                    this.method90(var45.field1251[0], false, field446.field1251[0], true, 0, var45.field1250[0], 0, 1, 1, 2, field446.field1250[0], 0);
                    this.field577 = super.field932;
                    this.field578 = super.field933;
                    this.field580 = 2;
                    this.field579 = 0;
                    this.field552.method536(220, true);
                    this.field552.method538(var6);
                }
            }
            if (var5 == 1468) {
                class49 var46 = this.field554[var6];
                if (var46 != null) {
                    class68 var47 = var46.field1441;
                    if (var47.field1682 != null) {
                        var47 = var47.method528(-863);
                    }
                    if (var47 != null) {
                        String var48;
                        if (var47.field1672 != null) {
                            var48 = new String(var47.field1672);
                        } else {
                            var48 = "It's a " + var47.field1674 + ".";
                        }
                        this.method131((byte) 5, 0, "", var48);
                    }
                }
            }
            if (var5 == 647) {
                class39 var49 = this.field491[var6];
                if (var49 != null) {
                    this.method90(var49.field1251[0], false, field446.field1251[0], true, 0, var49.field1250[0], 0, 1, 1, 2, field446.field1250[0], 0);
                    this.field577 = super.field932;
                    this.field578 = super.field933;
                    this.field580 = 2;
                    this.field579 = 0;
                    this.field552.method536(179, true);
                    this.field552.method538(this.field521);
                    this.field552.method538(this.field520);
                    this.field552.method570(var6, 0);
                    this.field552.method571(this.field522, true);
                }
            }
            if (var5 == 993) {
                this.field552.method536(43, true);
                this.field552.method538(var4);
                this.field552.method572(0, var6);
                this.field552.method570(var3, 0);
                this.field214 = 0;
                this.field215 = var4;
                this.field216 = var3;
                this.field217 = 2;
                if (class9.field645[var4].field690 == this.field381) {
                    this.field217 = 1;
                }
                if (class9.field645[var4].field690 == this.field350) {
                    this.field217 = 3;
                }
            }
            if (var5 == 583) {
                this.field552.method536(114, true);
                this.field552.method571(var6, true);
                this.field552.method572(0, var4);
                this.field552.method572(0, var3);
                this.field214 = 0;
                this.field215 = var4;
                this.field216 = var3;
                this.field217 = 2;
                if (class9.field645[var4].field690 == this.field381) {
                    this.field217 = 1;
                }
                if (class9.field645[var4].field690 == this.field350) {
                    this.field217 = 3;
                }
            }
            if (var5 == 534) {
                this.field519 = 1;
                this.field520 = var3;
                this.field521 = var4;
                this.field522 = var6;
                this.field523 = class46.method416(var6).field1382;
                this.field308 = 0;
                this.field426 = true;
            } else {
                if (var5 == 723) {
                    class49 var50 = this.field554[var6];
                    if (var50 != null) {
                        this.method90(var50.field1251[0], false, field446.field1251[0], true, 0, var50.field1250[0], 0, 1, 1, 2, field446.field1250[0], 0);
                        this.field577 = super.field932;
                        this.field578 = super.field933;
                        this.field580 = 2;
                        this.field579 = 0;
                        this.field552.method536(17, true);
                        this.field552.method571(var6, true);
                    }
                }
                if (var5 == 882) {
                    class49 var51 = this.field554[var6];
                    if (var51 != null) {
                        this.method90(var51.field1251[0], false, field446.field1251[0], true, 0, var51.field1250[0], 0, 1, 1, 2, field446.field1250[0], 0);
                        this.field577 = super.field932;
                        this.field578 = super.field933;
                        this.field580 = 2;
                        this.field579 = 0;
                        this.field552.method536(69, true);
                        this.field552.method538(var6);
                    }
                }
                if (var5 == 542) {
                    class49 var52 = this.field554[var6];
                    if (var52 != null) {
                        this.method90(var52.field1251[0], false, field446.field1251[0], true, 0, var52.field1250[0], 0, 1, 1, 2, field446.field1250[0], 0);
                        this.field577 = super.field932;
                        this.field578 = super.field933;
                        this.field580 = 2;
                        this.field579 = 0;
                        this.field552.method536(247, true);
                        this.field552.method572(0, var6);
                        this.field552.method570(this.field521, 0);
                        this.field552.method570(this.field520, 0);
                        this.field552.method571(this.field522, true);
                    }
                }
                if (var5 == 290) {
                    this.field552.method536(230, true);
                    this.field552.method571(var3, true);
                    this.field552.method571(var6, true);
                    this.field552.method538(var4);
                    this.field214 = 0;
                    this.field215 = var4;
                    this.field216 = var3;
                    this.field217 = 2;
                    if (class9.field645[var4].field690 == this.field381) {
                        this.field217 = 1;
                    }
                    if (class9.field645[var4].field690 == this.field350) {
                        this.field217 = 3;
                    }
                }
                if (var5 == 429) {
                    this.method130(var4, -632, var3, var6);
                    this.field552.method536(159, true);
                    this.field552.method571(var6 >> 14 & 32767, true);
                    this.field552.method572(0, this.field185 + var3);
                    this.field552.method538(this.field186 + var4);
                }
                if (var5 == 834) {
                    class39 var53 = this.field491[var6];
                    if (var53 != null) {
                        this.method90(var53.field1251[0], false, field446.field1251[0], true, 0, var53.field1250[0], 0, 1, 1, 2, field446.field1250[0], 0);
                        this.field577 = super.field932;
                        this.field578 = super.field933;
                        this.field580 = 2;
                        this.field579 = 0;
                        this.field552.method536(12, true);
                        this.field552.method538(var6);
                        this.field552.method571(this.field309, true);
                    }
                }
                if (var5 == 239) {
                    this.field552.method536(248, true);
                    this.field552.method538(var3);
                    this.field552.method538(var4);
                    this.field552.method571(var6, true);
                    this.field214 = 0;
                    this.field215 = var4;
                    this.field216 = var3;
                    this.field217 = 2;
                    if (class9.field645[var4].field690 == this.field381) {
                        this.field217 = 1;
                    }
                    if (class9.field645[var4].field690 == this.field350) {
                        this.field217 = 3;
                    }
                }
                if (var5 == 763) {
                    class9 var54 = class9.field645[var4];
                    this.field308 = 1;
                    this.field309 = var4;
                    this.field310 = var54.field660;
                    this.field519 = 0;
                    this.field426 = true;
                    String var55 = var54.field644;
                    if (var55.indexOf(" ") != -1) {
                        var55 = var55.substring(0, var55.indexOf(" "));
                    }
                    String var56 = var54.field644;
                    if (var56.indexOf(" ") != -1) {
                        var56 = var56.substring(var56.indexOf(" ") + 1);
                    }
                    this.field311 = var55 + " " + var54.field698 + " " + var56;
                    if (this.field310 == 16) {
                        this.field426 = true;
                        this.field546 = 3;
                        this.field251 = true;
                    }
                } else {
                    if (var5 == 975 || var5 == 326) {
                        String var57 = this.field450[arg0];
                        int var58 = var57.indexOf("@whi@");
                        if (var58 != -1) {
                            String var59 = var57.substring(var58 + 5).trim();
                            String var60 = class26.method257(0, class26.method254(0, class26.method253(var59)));
                            boolean var61 = false;
                            for (int var62 = 0; var62 < this.field492; ++var62) {
                                class39 var63 = this.field491[this.field493[var62]];
                                if (var63 != null && var63.field1271 != null && var63.field1271.equalsIgnoreCase(var60)) {
                                    this.method90(var63.field1251[0], false, field446.field1251[0], true, 0, var63.field1250[0], 0, 1, 1, 2, field446.field1250[0], 0);
                                    if (var5 == 975) {
                                        this.field552.method536(203, true);
                                        this.field552.method572(0, this.field493[var62]);
                                    }
                                    if (var5 == 326) {
                                        this.field552.method536(162, true);
                                        this.field552.method538(this.field493[var62]);
                                    }
                                    var61 = true;
                                    break;
                                }
                            }
                            if (!var61) {
                                this.method131((byte) 5, 0, "", "Unable to find " + var60);
                            }
                        }
                    }
                    if (var5 == 362) {
                        class49 var64 = this.field554[var6];
                        if (var64 != null) {
                            this.method90(var64.field1251[0], false, field446.field1251[0], true, 0, var64.field1250[0], 0, 1, 1, 2, field446.field1250[0], 0);
                            this.field577 = super.field932;
                            this.field578 = super.field933;
                            this.field580 = 2;
                            this.field579 = 0;
                            this.field552.method536(79, true);
                            this.field552.method570(var6, 0);
                        }
                    }
                    if (var5 == 135) {
                        this.field552.method536(1, true);
                        this.field552.method570(var3, 0);
                        this.field552.method538(var6);
                        this.field552.method571(var4, true);
                        this.field214 = 0;
                        this.field215 = var4;
                        this.field216 = var3;
                        this.field217 = 2;
                        if (class9.field645[var4].field690 == this.field381) {
                            this.field217 = 1;
                        }
                        if (class9.field645[var4].field690 == this.field350) {
                            this.field217 = 3;
                        }
                    }
                    if (var5 == 253) {
                        class39 var65 = this.field491[var6];
                        if (var65 != null) {
                            this.method90(var65.field1251[0], false, field446.field1251[0], true, 0, var65.field1250[0], 0, 1, 1, 2, field446.field1250[0], 0);
                            this.field577 = super.field932;
                            this.field578 = super.field933;
                            this.field580 = 2;
                            this.field579 = 0;
                            this.field552.method536(78, true);
                            this.field552.method571(var6, true);
                        }
                    }
                    if (var5 == 760) {
                        if (!this.field211) {
                            this.field543.method330(395, super.field933 - 4, super.field932 - 4);
                        } else {
                            this.field543.method330(395, var4 - 4, var3 - 4);
                        }
                    }
                    if (var5 == 914) {
                        class49 var66 = this.field554[var6];
                        if (var66 != null) {
                            this.method90(var66.field1251[0], false, field446.field1251[0], true, 0, var66.field1250[0], 0, 1, 1, 2, field446.field1250[0], 0);
                            this.field577 = super.field932;
                            this.field578 = super.field933;
                            this.field580 = 2;
                            this.field579 = 0;
                            this.field552.method536(44, true);
                            this.field552.method572(0, this.field309);
                            this.field552.method572(0, var6);
                        }
                    }
                    if (var5 == 969 && this.method130(var4, -632, var3, var6)) {
                        this.field552.method536(73, true);
                        this.field552.method571(this.field186 + var4, true);
                        this.field552.method572(0, this.field185 + var3);
                        this.field552.method570(this.field309, 0);
                        this.field552.method571(var6 >> 14 & 32767, true);
                    }
                    if (var5 == 931) {
                        class9 var67 = class9.field645[var4];
                        boolean var68 = true;
                        if (var67.field677 > 0) {
                            var68 = this.method136(false, var67);
                        }
                        if (var68) {
                            this.field552.method536(144, true);
                            this.field552.method538(var4);
                        }
                    }
                    if (var5 == 1275) {
                        this.method130(var4, -632, var3, var6);
                        this.field552.method536(38, true);
                        this.field552.method538(this.field186 + var4);
                        this.field552.method572(0, var6 >> 14 & 32767);
                        this.field552.method572(0, this.field185 + var3);
                    }
                    if (var5 == 580) {
                        this.field552.method536(137, true);
                        this.field552.method538(var6);
                        this.field552.method538(var3);
                        this.field552.method538(var4);
                        this.field214 = 0;
                        this.field215 = var4;
                        this.field216 = var3;
                        this.field217 = 2;
                        if (class9.field645[var4].field690 == this.field381) {
                            this.field217 = 1;
                        }
                        if (class9.field645[var4].field690 == this.field350) {
                            this.field217 = 3;
                        }
                    }
                    if (var5 == 172) {
                        boolean var69 = this.method90(var4, false, field446.field1251[0], true, 0, var3, 0, 0, 0, 2, field446.field1250[0], 0);
                        if (!var69) {
                            this.method90(var4, false, field446.field1251[0], true, 0, var3, 0, 1, 1, 2, field446.field1250[0], 0);
                        }
                        this.field577 = super.field932;
                        this.field578 = super.field933;
                        this.field580 = 2;
                        this.field579 = 0;
                        this.field552.method536(22, true);
                        this.field552.method570(var6, 0);
                        this.field552.method572(0, this.field185 + var3);
                        this.field552.method570(this.field186 + var4, 0);
                    }
                    if (var5 == 550) {
                        if ((var6 & 3) == 0) {
                            ++field238;
                        }
                        if (field238 >= 98) {
                            this.field552.method536(117, true);
                            this.field552.method541(0);
                            field238 = 0;
                        }
                        this.field552.method536(99, true);
                        this.field552.method572(0, var4);
                        this.field552.method572(0, var3);
                        this.field552.method570(var6, 0);
                        this.field214 = 0;
                        this.field215 = var4;
                        this.field216 = var3;
                        this.field217 = 2;
                        if (class9.field645[var4].field690 == this.field381) {
                            this.field217 = 1;
                        }
                        if (class9.field645[var4].field690 == this.field350) {
                            this.field217 = 3;
                        }
                    }
                    if (var5 == 746) {
                        boolean var71 = this.method90(var4, false, field446.field1251[0], true, 0, var3, 0, 0, 0, 2, field446.field1250[0], 0);
                        if (!var71) {
                            this.method90(var4, false, field446.field1251[0], true, 0, var3, 0, 1, 1, 2, field446.field1250[0], 0);
                        }
                        this.field577 = super.field932;
                        this.field578 = super.field933;
                        this.field580 = 2;
                        this.field579 = 0;
                        ++field295;
                        if (field295 >= 90) {
                            this.field552.method536(130, true);
                            this.field552.method541(0);
                            field295 = 0;
                        }
                        this.field552.method536(97, true);
                        this.field552.method572(0, this.field185 + var3);
                        this.field552.method572(0, var6);
                        this.field552.method571(this.field186 + var4, true);
                    }
                    if (var5 == 390) {
                        if ((var6 & 3) == 0) {
                            ++field277;
                        }
                        if (field277 >= 63) {
                            this.field552.method536(164, true);
                            this.field552.method537(89);
                            field277 = 0;
                        }
                        this.method130(var4, -632, var3, var6);
                        this.field552.method536(76, true);
                        this.field552.method571(this.field185 + var3, true);
                        this.field552.method570(var6 >> 14 & 32767, 0);
                        this.field552.method571(this.field186 + var4, true);
                    }
                    if (var5 == 919) {
                        this.field552.method536(127, true);
                        this.field552.method571(var4, true);
                        this.field552.method572(0, var6);
                        this.field552.method538(var3);
                        this.field214 = 0;
                        this.field215 = var4;
                        this.field216 = var3;
                        this.field217 = 2;
                        if (class9.field645[var4].field690 == this.field381) {
                            this.field217 = 1;
                        }
                        if (class9.field645[var4].field690 == this.field350) {
                            this.field217 = 3;
                        }
                    }
                    if (var5 == 229) {
                        boolean var73 = this.method90(var4, false, field446.field1251[0], true, 0, var3, 0, 0, 0, 2, field446.field1250[0], 0);
                        if (!var73) {
                            this.method90(var4, false, field446.field1251[0], true, 0, var3, 0, 1, 1, 2, field446.field1250[0], 0);
                        }
                        this.field577 = super.field932;
                        this.field578 = super.field933;
                        this.field580 = 2;
                        this.field579 = 0;
                        this.field552.method536(115, true);
                        this.field552.method538(var6);
                        this.field552.method538(this.field186 + var4);
                        this.field552.method538(this.field185 + var3);
                    }
                    this.field519 = 0;
                    this.field308 = 0;
                    this.field426 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method77(int arg0) {
        this.field457 += arg0;
        if (this.field269 == 0) {
            int var2 = super.field931;
            if (this.field308 == 1 && super.field932 >= 516 && super.field933 >= 160 && super.field932 <= 765 && super.field933 <= 205) {
                var2 = 0;
            }
            if (this.field211) {
                if (var2 != 1) {
                    int var3 = super.field925;
                    int var4 = super.field926;
                    if (this.field370 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field370 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field370 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field371 - 10 || var3 > this.field373 + this.field371 + 10 || var4 < this.field372 - 10 || var4 > this.field374 + this.field372 + 10) {
                        this.field211 = false;
                        if (this.field370 == 1) {
                            this.field426 = true;
                        }
                        if (this.field370 == 2) {
                            this.field252 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field371;
                    int var6 = this.field372;
                    int var7 = this.field373;
                    int var8 = super.field932;
                    int var9 = super.field933;
                    if (this.field370 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field370 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field370 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field484; ++var11) {
                        int var12 = (this.field484 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method76(var10, 0);
                    }
                    this.field211 = false;
                    if (this.field370 == 1) {
                        this.field426 = true;
                    }
                    if (this.field370 == 2) {
                        this.field252 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field484 > 0) {
                    int var13 = this.field409[this.field484 - 1];
                    if (var13 == 993 || var13 == 583 || var13 == 646 || var13 == 239 || var13 == 290 || var13 == 550 || var13 == 135 || var13 == 580 || var13 == 919 || var13 == 421 || var13 == 534 || var13 == 1176) {
                        int var14 = this.field407[this.field484 - 1];
                        int var15 = this.field408[this.field484 - 1];
                        class9 var16 = class9.field645[var15];
                        if (var16.field669 || var16.field705) {
                            this.field256 = false;
                            this.field227 = 0;
                            this.field267 = var15;
                            this.field268 = var14;
                            this.field269 = 2;
                            this.field270 = super.field932;
                            this.field271 = super.field933;
                            if (class9.field645[var15].field690 == this.field381) {
                                this.field269 = 1;
                            }
                            if (class9.field645[var15].field690 == this.field350) {
                                this.field269 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field498 == 1 || this.method47(0, this.field484 - 1)) && this.field484 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field484 > 0) {
                    this.method76(this.field484 - 1, 0);
                }
                if (var2 != 2 || this.field484 <= 0) {
                    return;
                }
                this.method110((byte) 8);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZJ)V")
    public final void method78(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field483 >= 100) {
                this.method131((byte) 5, 0, "", "Your ignore list is full. Max of 100 hit");
            } else {
                String var4 = class26.method257(0, class26.method254(0, arg1));
                this.field535 &= arg0;
                for (int var5 = 0; var5 < this.field483; ++var5) {
                    if (this.field307[var5] == arg1) {
                        this.method131((byte) 5, 0, "", var4 + " is already on your ignore list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field424; ++var6) {
                    if (this.field111[var6] == arg1) {
                        this.method131((byte) 5, 0, "", "Please remove " + var4 + " from your friend list first");
                        return;
                    }
                }
                this.field307[this.field483++] = arg1;
                this.field426 = true;
                this.field552.method536(70, true);
                this.field552.method543(arg1, (byte) 5);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method79(byte arg0) {
        this.field563 = true;
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field440) {
            this.method161(9);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Ljava/lang/String;")
    public static final String method80(int arg0, int arg1, int arg2) {
        if (arg2 <= 0) {
            field109 = -298;
        }
        int var3 = arg0 - arg1;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;)V")
    public final void method81(int arg0, int arg1, String arg2) {
        this.field224 = arg0;
        this.field281 = arg2;
        this.method164(true);
        if (this.field122 == null) {
            super.method81(arg0, -947, arg2);
        } else {
            this.field319.method212(2);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field501.method237(var5 / 2 - 26 - var6, 16777215, "RuneScape is loading - please wait...", true, var4 / 2);
            int var7 = var5 / 2 - 18 - var6;
            class29.method270(var7, true, 34, 304, var4 / 2 - 152, 9179409);
            class29.method270(var7 + 1, true, 32, 302, var4 / 2 - 151, 0);
            class29.method269(9179409, arg0 * 3, 30, var7 + 2, var4 / 2 - 150, -48531);
            class29.method269(0, 300 - arg0 * 3, 30, var7 + 2, arg0 * 3 + (var4 / 2 - 150), -48531);
            this.field501.method237(var5 / 2 + 5 - var6, 16777215, arg2, true, var4 / 2);
            this.field319.method213(9, 202, super.field917, 171);
            while (arg1 >= 0) {
                for (int var8 = 1; var8 > 0; ++var8) {
                }
            }
            if (this.field563) {
                this.field563 = false;
                if (!this.field518) {
                    this.field320.method213(9, 0, super.field917, 0);
                    this.field321.method213(9, 637, super.field917, 0);
                }
                this.field317.method213(9, 128, super.field917, 0);
                this.field318.method213(9, 202, super.field917, 371);
                this.field322.method213(9, 0, super.field917, 265);
                this.field323.method213(9, 562, super.field917, 265);
                this.field324.method213(9, 128, super.field917, 171);
                this.field325.method213(9, 562, super.field917, 171);
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method82(int arg0) {
        if (this.field550 == 2) {
            this.method128((this.field416 - this.field186 << 7) + this.field419, this.field417 * 2, (this.field415 - this.field185 << 7) + this.field418, this.field334);
            if (arg0 <= 0) {
                this.field458 = -1;
            }
            if (this.field454 > -1 && field441 % 20 < 10) {
                this.field348[2].method281(3, this.field455 - 28, this.field454 - 12);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LCPNGZAUN;Z)V")
    public final void method83(class9 arg0, boolean arg1) {
        if (arg1) {
            this.field458 = this.field292.method547();
        }
        int var3 = arg0.field677;
        if (var3 >= 1 && var3 <= 100 || var3 >= 701 && var3 <= 800) {
            if (var3 == 1 && this.field425 == 0) {
                arg0.field665 = "Loading friend list";
                arg0.field667 = 0;
            } else if (var3 == 1 && this.field425 == 1) {
                arg0.field665 = "Connecting to friendserver";
                arg0.field667 = 0;
            } else if (var3 == 2 && this.field425 != 2) {
                arg0.field665 = "Please wait...";
                arg0.field667 = 0;
            } else {
                int var4 = this.field424;
                if (this.field425 != 2) {
                    var4 = 0;
                }
                if (var3 > 700) {
                    var3 -= 601;
                } else {
                    --var3;
                }
                if (var3 >= var4) {
                    arg0.field665 = "";
                    arg0.field667 = 0;
                } else {
                    arg0.field665 = this.field379[var3];
                    arg0.field667 = 1;
                }
            }
        } else if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
            int var5 = this.field424;
            if (this.field425 != 2) {
                var5 = 0;
            }
            if (var3 > 800) {
                var3 -= 701;
            } else {
                var3 -= 101;
            }
            if (var3 >= var5) {
                arg0.field665 = "";
                arg0.field667 = 0;
            } else {
                if (this.field123[var3] == 0) {
                    arg0.field665 = "@red@Offline";
                } else if (this.field123[var3] < 200) {
                    if (this.field123[var3] == field389) {
                        arg0.field665 = "@gre@World-" + (this.field123[var3] - 9);
                    } else {
                        arg0.field665 = "@yel@World-" + (this.field123[var3] - 9);
                    }
                } else if (this.field123[var3] == field389) {
                    arg0.field665 = "@gre@Classic" + (this.field123[var3] - 219);
                } else {
                    arg0.field665 = "@yel@Classic" + (this.field123[var3] - 219);
                }
                arg0.field667 = 1;
            }
        } else if (var3 == 203) {
            int var6 = this.field424;
            if (this.field425 != 2) {
                var6 = 0;
            }
            arg0.field685 = var6 * 15 + 20;
            if (arg0.field685 <= arg0.field642) {
                arg0.field685 = arg0.field642 + 1;
            }
        } else if (var3 >= 401 && var3 <= 500) {
            var3 -= 401;
            if (var3 == 0 && this.field425 == 0) {
                arg0.field665 = "Loading ignore list";
                arg0.field667 = 0;
            } else if (var3 == 1 && this.field425 == 0) {
                arg0.field665 = "Please wait...";
                arg0.field667 = 0;
            } else {
                int var7 = this.field483;
                if (this.field425 == 0) {
                    var7 = 0;
                }
                if (var3 >= var7) {
                    arg0.field665 = "";
                    arg0.field667 = 0;
                } else {
                    arg0.field665 = class26.method257(0, class26.method254(0, this.field307[var3]));
                    arg0.field667 = 1;
                }
            }
        } else if (var3 == 503) {
            arg0.field685 = this.field483 * 15 + 20;
            if (arg0.field685 <= arg0.field642) {
                arg0.field685 = arg0.field642 + 1;
            }
        } else if (var3 == 327) {
            arg0.field658 = 150;
            arg0.field659 = (int) (Math.sin((double) field441 / 40.0D) * 256.0D) & 2047;
            if (this.field402) {
                for (int var8 = 0; var8 < 7; ++var8) {
                    int var15 = this.field294[var8];
                    if (var15 >= 0 && !class17.field844[var15].method217((byte) 6)) {
                        return;
                    }
                }
                this.field402 = false;
                class4[] var9 = new class4[7];
                int var10 = 0;
                for (int var11 = 0; var11 < 7; ++var11) {
                    int var14 = this.field294[var11];
                    if (var14 >= 0) {
                        var9[var10++] = class17.field844[var14].method218(0);
                    }
                }
                class4 var12 = new class4(var9, 990, var10);
                for (int var13 = 0; var13 < 5; ++var13) {
                    if (this.field566[var13] != 0) {
                        var12.method25(field230[var13][0], field230[var13][this.field566[var13]]);
                        if (var13 == 1) {
                            var12.method25(field527[0], field527[this.field566[var13]]);
                        }
                    }
                }
                var12.method18(true);
                var12.method19(class20.field875[field446.field1210].field877[0], (byte) 106);
                var12.method28(64, 850, -30, -50, -30, true);
                arg0.field694 = 5;
                arg0.field695 = 0;
                class9.method200(var12, (byte) 8, 0, 5);
            }
        } else if (var3 == 324) {
            if (this.field159 == null) {
                this.field159 = arg0.field662;
                this.field160 = arg0.field656;
            }
            if (this.field474) {
                arg0.field662 = this.field160;
            } else {
                arg0.field662 = this.field159;
            }
        } else if (var3 == 325) {
            if (this.field159 == null) {
                this.field159 = arg0.field662;
                this.field160 = arg0.field656;
            }
            if (this.field474) {
                arg0.field662 = this.field159;
            } else {
                arg0.field662 = this.field160;
            }
        } else if (var3 == 600) {
            arg0.field665 = this.field346;
            if (field441 % 20 < 10) {
                arg0.field665 = arg0.field665 + "|";
            } else {
                arg0.field665 = arg0.field665 + " ";
            }
        } else {
            if (var3 == 613) {
                if (this.field282 >= 1) {
                    if (this.field276) {
                        arg0.field679 = 16711680;
                        arg0.field665 = "Moderator option: Mute player for 48 hours: <ON>";
                    } else {
                        arg0.field679 = 16777215;
                        arg0.field665 = "Moderator option: Mute player for 48 hours: <OFF>";
                    }
                } else {
                    arg0.field665 = "";
                }
            }
            if (var3 == 650 || var3 == 655) {
                if (this.field531 != 0) {
                    String var16;
                    if (this.field243 == 0) {
                        var16 = "earlier today";
                    } else if (this.field243 == 1) {
                        var16 = "yesterday";
                    } else {
                        var16 = this.field243 + " days ago";
                    }
                    arg0.field665 = "You last logged in " + var16 + " from: " + signlink.dns;
                } else {
                    arg0.field665 = "";
                }
            }
            if (var3 == 651) {
                if (this.field274 == 0) {
                    arg0.field665 = "0 unread messages";
                    arg0.field679 = 16776960;
                }
                if (this.field274 == 1) {
                    arg0.field665 = "1 unread message";
                    arg0.field679 = 65280;
                }
                if (this.field274 > 1) {
                    arg0.field665 = this.field274 + " unread messages";
                    arg0.field679 = 65280;
                }
            }
            if (var3 == 652) {
                if (this.field156 == 201) {
                    if (this.field178 == 1) {
                        arg0.field665 = "@yel@This is a non-members world: @whi@Since you are a member we";
                    } else {
                        arg0.field665 = "";
                    }
                } else if (this.field156 == 200) {
                    arg0.field665 = "You have not yet set any password recovery questions.";
                } else {
                    String var17;
                    if (this.field156 == 0) {
                        var17 = "Earlier today";
                    } else if (this.field156 == 1) {
                        var17 = "Yesterday";
                    } else {
                        var17 = this.field156 + " days ago";
                    }
                    arg0.field665 = var17 + " you changed your recovery questions";
                }
            }
            if (var3 == 653) {
                if (this.field156 == 201) {
                    if (this.field178 == 1) {
                        arg0.field665 = "@whi@recommend you use a members world instead. You may use";
                    } else {
                        arg0.field665 = "";
                    }
                } else if (this.field156 == 200) {
                    arg0.field665 = "We strongly recommend you do so now to secure your account.";
                } else {
                    arg0.field665 = "If you do not remember making this change then cancel it immediately";
                }
            }
            if (var3 == 654) {
                if (this.field156 == 201) {
                    if (this.field178 == 1) {
                        arg0.field665 = "@whi@this world but member benefits are unavailable whilst here.";
                    } else {
                        arg0.field665 = "";
                    }
                } else if (this.field156 == 200) {
                    arg0.field665 = "Do this from the 'account management' area on our front webpage";
                } else {
                    arg0.field665 = "Do this from the 'account management' area on our front webpage";
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILZOMNSJJM;)V")
    private final void method84(int arg0, int arg1, class69 arg2) {
        arg2.method557((byte) -108);
        int var4 = arg2.method558(1, true);
        if (var4 != 0) {
            int var5 = arg2.method558(2, true);
            if (arg0 != 38025) {
                this.method173();
            }
            if (var5 == 0) {
                this.field495[this.field494++] = this.field490;
            } else if (var5 == 1) {
                int var6 = arg2.method558(3, true);
                field446.method371(var6, (byte) -107, false);
                int var7 = arg2.method558(1, true);
                if (var7 == 1) {
                    this.field495[this.field494++] = this.field490;
                }
            } else if (var5 == 2) {
                int var8 = arg2.method558(3, true);
                field446.method371(var8, (byte) -107, true);
                int var9 = arg2.method558(3, true);
                field446.method371(var9, (byte) -107, true);
                int var10 = arg2.method558(1, true);
                if (var10 == 1) {
                    this.field495[this.field494++] = this.field490;
                }
            } else if (var5 == 3) {
                int var11 = arg2.method558(7, true);
                this.field210 = arg2.method558(2, true);
                int var12 = arg2.method558(7, true);
                int var13 = arg2.method558(1, true);
                int var14 = arg2.method558(1, true);
                if (var14 == 1) {
                    this.field495[this.field494++] = this.field490;
                }
                field446.method373(var13 == 1, var12, this.field286, var11);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LZOMNSJJM;II)V")
    private final void method85(class69 arg0, int arg1, int arg2) {
        this.field170 = 0;
        this.field494 = 0;
        int var4 = arg1 + arg2;
        this.method84(38025, var4, arg0);
        this.method62(true, var4, arg0);
        this.method52(-838, arg0, var4);
        this.method139(var4, -31498, arg0);
        for (int var5 = 0; var5 < this.field170; ++var5) {
            int var7 = this.field171[var5];
            if (field441 != this.field491[var7].field1231) {
                this.field491[var7] = null;
            }
        }
        if (arg0.field1700 != var4) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field1700 + " psize:" + var4);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field492; ++var6) {
                if (this.field491[this.field493[var6]] == null) {
                    signlink.reporterror(this.field478 + " null entry in pl list - pos:" + var6 + " size:" + this.field492);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field543.method318(arg0, arg5, arg4);
        if (var7 != 0) {
            int var8 = this.field543.method322(arg0, arg5, arg4, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg1;
            if (var7 > 0) {
                var11 = arg2;
            }
            int[] var12 = this.field464.field1024;
            int var13 = (103 - arg4) * 512 * 4 + arg5 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class33 var15 = class33.method350(var14);
            if (var15.field1143 != -1) {
                class47 var16 = this.field429[var15.field1143];
                if (var16 != null) {
                    int var17 = (var15.field1116 * 4 - var16.field1434) / 2;
                    int var18 = (var15.field1136 * 4 - var16.field1435) / 2;
                    var16.method428(3, (104 - arg4 - var15.field1136) * 4 + 48 + var18, arg5 * 4 + 48 + var17);
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
        int var19 = this.field543.method320(arg0, arg5, arg4);
        if (var19 != 0) {
            int var20 = this.field543.method322(arg0, arg5, arg4, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class33 var24 = class33.method350(var23);
            if (var24.field1143 != -1) {
                class47 var25 = this.field429[var24.field1143];
                if (var25 != null) {
                    int var26 = (var24.field1116 * 4 - var25.field1434) / 2;
                    int var27 = (var24.field1136 * 4 - var25.field1435) / 2;
                    var25.method428(3, (104 - arg4 - var24.field1136) * 4 + 48 + var27, arg5 * 4 + 48 + var26);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field464.field1024;
                int var30 = (103 - arg4) * 512 * 4 + arg5 * 4 + 24624;
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
        int var31 = this.field543.method321(arg0, arg5, arg4);
        while (arg3 >= 0) {
            this.field147 = 400;
        }
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class33 var33 = class33.method350(var32);
            if (var33.field1143 != -1) {
                class47 var34 = this.field429[var33.field1143];
                if (var34 != null) {
                    int var35 = (var33.field1116 * 4 - var34.field1434) / 2;
                    int var36 = (var33.field1136 * 4 - var34.field1435) / 2;
                    var34.method428(3, (104 - arg4 - var33.field1136) * 4 + 48 + var36, arg5 * 4 + 48 + var35);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIIIII)V")
    public final void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 0) {
            this.field567.method428(3, arg2, arg3);
            this.field568.method428(3, arg2 + arg5 - 16, arg3);
            class29.method269(this.field359, 16, arg5 - 32, arg2 + 16, arg3, -48531);
            int var7 = (arg5 - 32) * arg5 / arg1;
            if (var7 < 8) {
                var7 = 8;
            }
            int var8 = (arg5 - 32 - var7) * arg4 / (arg1 - arg5);
            class29.method269(this.field140, 16, var7, arg2 + 16 + var8, arg3, -48531);
            class29.method274(var7, this.field395, true, arg2 + 16 + var8, arg3);
            class29.method274(var7, this.field395, true, arg2 + 16 + var8, arg3 + 1);
            class29.method272(this.field395, -399, 16, arg3, arg2 + 16 + var8);
            class29.method272(this.field395, -399, 16, arg3, arg2 + 17 + var8);
            class29.method274(var7, this.field163, true, arg2 + 16 + var8, arg3 + 15);
            class29.method274(var7 - 1, this.field163, true, arg2 + 17 + var8, arg3 + 14);
            class29.method272(this.field163, -399, 16, arg3, arg2 + 15 + var8 + var7);
            class29.method272(this.field163, -399, 15, arg3 + 1, arg2 + 14 + var8 + var7);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method88(long arg0, int arg1) {
        if (arg1 < 0 || arg1 > 0) {
            this.field458 = -1;
        }
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field424; ++var4) {
                if (this.field111[var4] == arg0) {
                    --this.field424;
                    this.field426 = true;
                    for (int var5 = var4; var5 < this.field424; ++var5) {
                        this.field379[var5] = this.field379[var5 + 1];
                        this.field123[var5] = this.field123[var5 + 1];
                        this.field111[var5] = this.field111[var5 + 1];
                    }
                    this.field552.method536(31, true);
                    this.field552.method543(arg0, (byte) 5);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZIIIIILCPNGZAUN;)V")
    public final void method89(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class9 arg8) {
        if (this.field154) {
            this.field529 = 32;
        } else {
            this.field529 = 0;
        }
        this.field154 = false;
        if (arg5 != -37951) {
            for (int var10 = 1; var10 > 0; ++var10) {
            }
        }
        if (arg7 >= arg6 && arg7 < arg6 + 16 && arg1 >= arg0 && arg1 < arg0 + 16) {
            arg8.field639 -= this.field540 * 4;
            if (arg2) {
                this.field426 = true;
                return;
            }
        } else if (arg7 >= arg6 && arg7 < arg6 + 16 && arg1 >= arg0 + arg4 - 16 && arg1 < arg0 + arg4) {
            arg8.field639 += this.field540 * 4;
            if (arg2) {
                this.field426 = true;
                return;
            }
        } else {
            if (arg7 < arg6 - this.field529 || arg7 >= arg6 + 16 + this.field529 || arg1 < arg0 + 16 || arg1 >= arg0 + arg4 - 16 || this.field540 <= 0) {
                return;
            }
            int var11 = (arg4 - 32) * arg4 / arg3;
            if (var11 < 8) {
                var11 = 8;
            }
            int var12 = arg1 - arg0 - 16 - var11 / 2;
            int var13 = arg4 - 32 - var11;
            arg8.field639 = (arg3 - arg4) * var12 / var13;
            if (arg2) {
                this.field426 = true;
            }
            this.field154 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIZIIIIIIII)Z")
    public final boolean method90(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var36 = 0; var36 < var14; ++var36) {
                this.field477[var15][var36] = 0;
                this.field164[var15][var36] = 99999999;
            }
        }
        int var16 = arg10;
        int var17 = arg2;
        this.field477[arg10][arg2] = 99;
        this.field164[arg10][arg2] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field220[var18] = arg10;
        int var37 = var18 + 1;
        this.field221[var18] = arg2;
        boolean var20 = false;
        int var21 = this.field220.length;
        int[][] var22 = this.field306[this.field210].field1182;
        while (var37 != var19) {
            var16 = this.field220[var19];
            var17 = this.field221[var19];
            var19 = (var19 + 1) % var21;
            if (arg5 == var16 && arg0 == var17) {
                var20 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && this.field306[this.field210].method363(var16, 0, arg4 - 1, arg0, var17, arg5, arg6)) {
                    var20 = true;
                    break;
                }
                if (arg4 < 10 && this.field306[this.field210].method364(arg6, var16, var17, this.field558, arg0, arg4 - 1, arg5)) {
                    var20 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg7 != 0 && this.field306[this.field210].method365(arg5, arg0, arg8, arg11, var17, true, var16, arg7)) {
                var20 = true;
                break;
            }
            int var35 = this.field164[var16][var17] + 1;
            if (var16 > 0 && this.field477[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field220[var37] = var16 - 1;
                this.field221[var37] = var17;
                var37 = (var37 + 1) % var21;
                this.field477[var16 - 1][var17] = 2;
                this.field164[var16 - 1][var17] = var35;
            }
            if (var16 < var13 - 1 && this.field477[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field220[var37] = var16 + 1;
                this.field221[var37] = var17;
                var37 = (var37 + 1) % var21;
                this.field477[var16 + 1][var17] = 8;
                this.field164[var16 + 1][var17] = var35;
            }
            if (var17 > 0 && this.field477[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field220[var37] = var16;
                this.field221[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field477[var16][var17 - 1] = 1;
                this.field164[var16][var17 - 1] = var35;
            }
            if (var17 < var14 - 1 && this.field477[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field220[var37] = var16;
                this.field221[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field477[var16][var17 + 1] = 4;
                this.field164[var16][var17 + 1] = var35;
            }
            if (var16 > 0 && var17 > 0 && this.field477[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field220[var37] = var16 - 1;
                this.field221[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field477[var16 - 1][var17 - 1] = 3;
                this.field164[var16 - 1][var17 - 1] = var35;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field477[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field220[var37] = var16 + 1;
                this.field221[var37] = var17 - 1;
                var37 = (var37 + 1) % var21;
                this.field477[var16 + 1][var17 - 1] = 9;
                this.field164[var16 + 1][var17 - 1] = var35;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field477[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field220[var37] = var16 - 1;
                this.field221[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field477[var16 - 1][var17 + 1] = 6;
                this.field164[var16 - 1][var17 + 1] = var35;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field477[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field220[var37] = var16 + 1;
                this.field221[var37] = var17 + 1;
                var37 = (var37 + 1) % var21;
                this.field477[var16 + 1][var17 + 1] = 12;
                this.field164[var16 + 1][var17 + 1] = var35;
            }
        }
        this.field288 = 0;
        if (!var20) {
            if (arg1) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg5 - var24; var25 <= arg5 + var24; ++var25) {
                        for (int var26 = arg0 - var24; var26 <= arg0 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field164[var25][var26] < var23) {
                                var23 = this.field164[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field288 = 1;
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
        this.field220[var27] = var16;
        int var38 = var27 + 1;
        this.field221[var27] = var17;
        if (!arg3) {
            for (int var28 = 1; var28 > 0; ++var28) {
            }
        }
        int var29;
        int var30 = var29 = this.field477[var16][var17];
        while (arg10 != var16 || arg2 != var17) {
            if (var29 != var30) {
                var29 = var30;
                this.field220[var38] = var16;
                this.field221[var38++] = var17;
            }
            if ((var30 & 2) != 0) {
                ++var16;
            } else if ((var30 & 8) != 0) {
                --var16;
            }
            if ((var30 & 1) != 0) {
                ++var17;
            } else if ((var30 & 4) != 0) {
                --var17;
            }
            var30 = this.field477[var16][var17];
        }
        if (var38 <= 0) {
            if (arg9 == 1) {
                return false;
            } else {
                return true;
            }
        } else {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            --var38;
            int var32 = this.field220[var38];
            int var33 = this.field221[var38];
            if (arg9 == 0) {
                this.field552.method536(109, true);
                this.field552.method537(var31 + var31 + 3);
            }
            if (arg9 == 1) {
                this.field552.method536(90, true);
                this.field552.method537(var31 + var31 + 3 + 14);
            }
            if (arg9 == 2) {
                this.field552.method536(54, true);
                this.field552.method537(var31 + var31 + 3);
            }
            this.field462 = this.field220[0];
            this.field463 = this.field221[0];
            for (int var34 = 1; var34 < var31; ++var34) {
                --var38;
                this.field552.method563(false, this.field220[var38] - var32);
                this.field552.method563(false, this.field221[var38] - var33);
            }
            this.field552.method570(this.field186 + var33, 0);
            this.field552.method537(super.field935[5] == 1 ? 1 : 0);
            this.field552.method538(this.field185 + var32);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method91(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field352 = "";
                this.field353 = "Connecting to server...";
                this.method113((byte) 9, true);
            }
            this.field212 = new class3(this, false, this.method162(field390 + 43594));
            long var4 = class26.method253(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field552.field1700 = 0;
            this.field552.method537(14);
            this.field552.method537(var6);
            this.field212.method5(this.field552.field1699, 0, 2, true);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field212.method2();
            }
            int var8 = this.field212.method2();
            int var9 = var8;
            if (var8 == 0) {
                this.field212.method4(this.field292.field1699, 0, 8);
                this.field292.field1700 = 0;
                this.field233 = this.field292.method553(false);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field233 >> 32), (int) this.field233 };
                this.field552.field1700 = 0;
                this.field552.method537(10);
                this.field552.method541(var10[0]);
                this.field552.method541(var10[1]);
                this.field552.method541(var10[2]);
                this.field552.method541(var10[3]);
                this.field552.method541(signlink.uid);
                this.field552.method544(arg0);
                this.field552.method544(arg1);
                this.field552.method562(field364, (byte) 6, field448);
                this.field355.field1700 = 0;
                if (arg2) {
                    this.field355.method537(18);
                } else {
                    this.field355.method537(16);
                }
                this.field355.method537(this.field552.field1700 + 36 + 1 + 1 + 2);
                this.field355.method537(255);
                this.field355.method538(328);
                this.field355.method537(field392 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field355.method541(this.field412[var11]);
                }
                this.field355.method545(0, this.field552.field1700, 4, this.field552.field1699);
                this.field552.field1704 = new class70(var10, 620);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field560 = new class70(var10, 620);
                this.field212.method5(this.field355.field1699, 0, this.field355.field1700, true);
                var8 = this.field212.method2();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method91(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field282 = this.field212.method2();
                field363 = this.field212.method2() == 1;
                this.field377 = 0L;
                this.field155 = 0;
                this.field400.field851 = 0;
                super.field922 = true;
                this.field422 = true;
                this.field535 = true;
                this.field552.field1700 = 0;
                this.field292.field1700 = 0;
                this.field458 = -1;
                this.field437 = -1;
                this.field438 = -1;
                this.field439 = -1;
                this.field457 = 0;
                this.field459 = 0;
                this.field581 = 0;
                this.field461 = 0;
                this.field550 = 0;
                this.field484 = 0;
                this.field211 = false;
                super.field923 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field300[var13] = null;
                }
                this.field519 = 0;
                this.field308 = 0;
                this.field312 = 0;
                this.field435 = 0;
                this.field512 = (int) (Math.random() * 100.0D) - 50;
                this.field384 = (int) (Math.random() * 110.0D) - 55;
                this.field368 = (int) (Math.random() * 80.0D) - 40;
                this.field314 = (int) (Math.random() * 120.0D) - 60;
                this.field134 = (int) (Math.random() * 30.0D) - 20;
                this.field341 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field345 = 0;
                this.field236 = -1;
                this.field462 = 0;
                this.field463 = 0;
                this.field492 = 0;
                this.field555 = 0;
                for (int var14 = 0; var14 < this.field489; ++var14) {
                    this.field491[var14] = null;
                    this.field496[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field554[var15] = null;
                }
                field446 = this.field491[this.field490] = new class39();
                this.field414.method527();
                this.field290.method527();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field572[var16][var17][var18] = null;
                        }
                    }
                }
                this.field406 = new class66(-41036);
                this.field425 = 0;
                this.field424 = 0;
                this.field139 = -1;
                this.field350 = -1;
                this.field381 = -1;
                this.field367 = -1;
                this.field250 = -1;
                this.field524 = false;
                this.field546 = 3;
                this.field476 = 0;
                this.field211 = false;
                this.field240 = false;
                this.field275 = null;
                this.field436 = 0;
                this.field467 = -1;
                this.field474 = true;
                this.method154((byte) 6);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field566[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field192[var20] = null;
                    this.field193[var20] = false;
                }
                field528 = 0;
                field277 = 0;
                field388 = 0;
                field238 = 0;
                field565 = 0;
                field443 = 0;
                field295 = 0;
                field225 = 0;
                field354 = 0;
                field234 = 0;
                this.method176(false);
            } else if (var8 == 3) {
                this.field352 = "";
                this.field353 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field352 = "Your account has been disabled.";
                this.field353 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field352 = "Your account is already logged in.";
                this.field353 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field352 = "RuneScape has been updated!";
                this.field353 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field352 = "This world is full.";
                this.field353 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field352 = "Unable to connect.";
                this.field353 = "Login server offline.";
            } else if (var8 == 9) {
                this.field352 = "Login limit exceeded.";
                this.field353 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field352 = "Unable to connect.";
                this.field353 = "Bad session id.";
            } else if (var8 == 11) {
                this.field353 = "Login server rejected session.";
                this.field353 = "Please try again.";
            } else if (var8 == 12) {
                this.field352 = "You need a members account to login to this world.";
                this.field353 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field352 = "Could not complete login.";
                this.field353 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field352 = "The server is being updated.";
                this.field353 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field535 = true;
                this.field552.field1700 = 0;
                this.field292.field1700 = 0;
                this.field458 = -1;
                this.field437 = -1;
                this.field438 = -1;
                this.field439 = -1;
                this.field457 = 0;
                this.field459 = 0;
                this.field581 = 0;
                this.field484 = 0;
                this.field211 = false;
                this.field394 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field352 = "Login attempts exceeded.";
                this.field353 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field352 = "You are standing in a members-only area.";
                this.field353 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field352 = "Invalid loginserver requested";
                this.field353 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field207 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field207;
                            this.method91(arg0, arg1, arg2);
                        } else {
                            this.field352 = "No response from loginserver";
                            this.field353 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field352 = "No response from server";
                        this.field353 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field352 = "Unexpected server response";
                    this.field353 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field212.method2();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field352 = "You have only just left another world";
                    this.field353 = "Your profile will be transferred in: " + var26;
                    this.method113((byte) 9, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method91(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field352 = "";
            this.field353 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method92(int arg0) {
        this.field257 = 0;
        while (arg0 >= 0) {
            this.field285 = this.field560.method585();
        }
        for (int var2 = -1; var2 < this.field555 + this.field492; ++var2) {
            class38 var19;
            if (var2 == -1) {
                var19 = field446;
            } else if (var2 < this.field492) {
                var19 = this.field491[this.field493[var2]];
            } else {
                var19 = this.field554[this.field556[var2 - this.field492]];
            }
            if (var19 != null && var19.method369(false)) {
                if (var19 instanceof class49) {
                    class68 var20 = ((class49) var19).field1441;
                    if (var20.field1682 != null) {
                        var20 = var20.method528(-863);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field492) {
                    class68 var24 = ((class49) var19).field1441;
                    if (var24.field1668 >= 0 && var24.field1668 < this.field348.length) {
                        this.method127(var19.field1212 + 15, this.field147, var19);
                        if (this.field454 > -1) {
                            this.field348[var24.field1668].method281(3, this.field455 - 30, this.field454 - 12);
                        }
                    }
                    if (this.field550 == 1 && this.field556[var2 - this.field492] == this.field168 && field441 % 20 < 10) {
                        this.method127(var19.field1212 + 15, this.field147, var19);
                        if (this.field454 > -1) {
                            this.field348[2].method281(3, this.field455 - 28, this.field454 - 12);
                        }
                    }
                } else {
                    int var21 = 30;
                    class39 var22 = (class39) var19;
                    if (var22.field1255 != 0) {
                        this.method127(var19.field1212 + 15, this.field147, var19);
                        if (this.field454 > -1) {
                            for (int var23 = 0; var23 < 8; ++var23) {
                                if ((var22.field1255 & 1 << var23) != 0) {
                                    this.field348[var23].method281(3, this.field455 - var21, this.field454 - 12);
                                    var21 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field550 == 10 && this.field493[var2] == this.field284) {
                        this.method127(var19.field1212 + 15, this.field147, var19);
                        if (this.field454 > -1) {
                            this.field348[7].method281(3, this.field455 - var21, this.field454 - 12);
                        }
                    }
                }
                if (var19.field1209 != null && (var2 >= this.field492 || this.field162 == 0 || this.field162 == 3 || this.field162 == 1 && this.method123(765, ((class39) var19).field1271))) {
                    this.method127(var19.field1212, this.field147, var19);
                    if (this.field454 > -1 && this.field257 < this.field258) {
                        this.field262[this.field257] = this.field501.method240((byte) 63, var19.field1209) / 2;
                        this.field261[this.field257] = this.field501.field952;
                        this.field259[this.field257] = this.field454;
                        this.field260[this.field257] = this.field455;
                        this.field263[this.field257] = var19.field1227;
                        this.field264[this.field257] = var19.field1232;
                        this.field265[this.field257] = var19.field1229;
                        this.field266[this.field257++] = var19.field1209;
                        if (this.field380 == 0 && var19.field1232 >= 1 && var19.field1232 <= 3) {
                            this.field261[this.field257] += 10;
                            this.field260[this.field257] += 5;
                        }
                        if (this.field380 == 0 && var19.field1232 == 4) {
                            this.field262[this.field257] = 60;
                        }
                        if (this.field380 == 0 && var19.field1232 == 5) {
                            this.field261[this.field257] += 5;
                        }
                    }
                }
                if (var19.field1224 > field441) {
                    this.method127(var19.field1212 + 15, this.field147, var19);
                    if (this.field454 > -1) {
                        int var25 = var19.field1225 * 30 / var19.field1226;
                        if (var25 > 30) {
                            var25 = 30;
                        }
                        class29.method269(65280, var25, 5, this.field455 - 3, this.field454 - 15, -48531);
                        class29.method269(16711680, 30 - var25, 5, this.field455 - 3, this.field454 - 15 + var25, -48531);
                    }
                }
                for (int var26 = 0; var26 < 4; ++var26) {
                    if (var19.field1218[var26] > field441) {
                        this.method127(var19.field1212 / 2, this.field147, var19);
                        if (this.field454 > -1) {
                            if (var26 == 1) {
                                this.field455 -= 20;
                            }
                            if (var26 == 2) {
                                this.field454 -= 15;
                                this.field455 -= 10;
                            }
                            if (var26 == 3) {
                                this.field454 += 15;
                                this.field455 -= 10;
                            }
                            this.field296[var19.field1217[var26]].method281(3, this.field455 - 12, this.field454 - 12);
                            this.field499.method237(this.field455 + 4, 0, String.valueOf(var19.field1216[var26]), true, this.field454);
                            this.field499.method237(this.field455 + 3, 16777215, String.valueOf(var19.field1216[var26]), true, this.field454 - 1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field257; ++var3) {
            int var4 = this.field259[var3];
            int var5 = this.field260[var3];
            int var6 = this.field262[var3];
            int var7 = this.field261[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field260[var18] - this.field261[var18] && var5 - var7 < this.field260[var18] + 2 && var4 - var6 < this.field262[var18] + this.field259[var18] && var4 + var6 > this.field259[var18] - this.field262[var18] && this.field260[var18] - this.field261[var18] < var5) {
                        var5 = this.field260[var18] - this.field261[var18];
                        var8 = true;
                    }
                }
            }
            this.field454 = this.field259[var3];
            this.field455 = this.field260[var3] = var5;
            String var9 = this.field266[var3];
            if (this.field380 == 0) {
                int var10 = 16776960;
                if (this.field263[var3] < 6) {
                    var10 = this.field110[this.field263[var3]];
                }
                if (this.field263[var3] == 6) {
                    var10 = this.field536 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field263[var3] == 7) {
                    var10 = this.field536 % 20 < 10 ? 255 : 65535;
                }
                if (this.field263[var3] == 8) {
                    var10 = this.field536 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field263[var3] == 9) {
                    int var11 = 150 - this.field265[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field263[var3] == 10) {
                    int var12 = 150 - this.field265[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field263[var3] == 11) {
                    int var13 = 150 - this.field265[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field264[var3] == 0) {
                    this.field501.method237(this.field455 + 1, 0, var9, true, this.field454);
                    this.field501.method237(this.field455, var10, var9, true, this.field454);
                }
                if (this.field264[var3] == 1) {
                    this.field501.method242(false, var9, this.field454, this.field536, 0, this.field455 + 1);
                    this.field501.method242(false, var9, this.field454, this.field536, var10, this.field455);
                }
                if (this.field264[var3] == 2) {
                    this.field501.method243(this.field454, var9, true, this.field536, this.field455 + 1, 0);
                    this.field501.method243(this.field454, var9, true, this.field536, this.field455, var10);
                }
                if (this.field264[var3] == 3) {
                    this.field501.method244(305, this.field454, this.field455 + 1, var9, 0, this.field536, 150 - this.field265[var3]);
                    this.field501.method244(305, this.field454, this.field455, var9, var10, this.field536, 150 - this.field265[var3]);
                }
                if (this.field264[var3] == 4) {
                    int var14 = this.field501.method240((byte) 63, var9);
                    int var15 = (150 - this.field265[var3]) * (var14 + 100) / 150;
                    class29.method266(0, this.field454 - 50, (byte) -109, this.field454 + 50, 334);
                    this.field501.method241(0, var9, 3, this.field455 + 1, this.field454 + 50 - var15);
                    this.field501.method241(var10, var9, 3, this.field455, this.field454 + 50 - var15);
                    class29.method265((byte) 88);
                }
                if (this.field264[var3] == 5) {
                    int var16 = 150 - this.field265[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class29.method266(this.field455 - this.field501.field952 - 1, 0, (byte) -109, 512, this.field455 + 5);
                    this.field501.method237(this.field455 + 1 + var17, 0, var9, true, this.field454);
                    this.field501.method237(this.field455 + var17, var10, var9, true, this.field454);
                    class29.method265((byte) 88);
                }
            } else {
                this.field501.method237(this.field455 + 1, 0, var9, true, this.field454);
                this.field501.method237(this.field455, 16776960, var9, true, this.field454);
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method93(int arg0) {
        this.method46(1);
        while (arg0 >= 0) {
            field559 = !field559;
        }
        if (this.field580 == 1) {
            this.field393[this.field579 / 100].method281(3, this.field578 - 8 - 4, this.field577 - 8 - 4);
            ++field191;
            if (field191 > 139) {
                field191 = 0;
                this.field552.method536(165, true);
                this.field552.method537(114);
            }
        }
        if (this.field580 == 2) {
            this.field393[this.field579 / 100 + 4].method281(3, this.field578 - 8 - 4, this.field577 - 8 - 4);
            ++field356;
            if (field356 > 136) {
                field356 = 0;
                this.field552.method536(104, true);
                this.field552.method540(11866938);
            }
        }
        if (this.field250 != -1) {
            this.method148(false, this.field526, this.field250);
            this.method45(7, 0, 0, class9.field645[this.field250], 0);
        }
        if (this.field381 != -1) {
            this.method148(false, this.field526, this.field381);
            this.method45(7, 0, 0, class9.field645[this.field381], 0);
        }
        this.method155(this.field254);
        if (!this.field211) {
            this.method114(0);
            this.method125((byte) 5);
        } else if (this.field370 == 0) {
            this.method126(false);
        }
        if (this.field436 == 1) {
            this.field348[1].method281(3, 296, 472);
        }
        if (field497) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field913 < 15) {
                var4 = 16711680;
            }
            this.field500.method236("Fps:" + super.field913, var3, var2, false, var4);
            int var12 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field392) {
                int var8 = 16711680;
            }
            this.field500.method236("Mem:" + var6 + "k", var12, var2, false, 16776960);
            var12 += 15;
        }
        if (this.field581 != 0) {
            int var9 = this.field581 / 50;
            int var10 = var9 / 60;
            int var11 = var9 % 60;
            if (var11 < 10) {
                this.field500.method241(16776960, "System update in: " + var10 + ":0" + var11, 3, 329, 4);
            } else {
                this.field500.method241(16776960, "System update in: " + var10 + ":" + var11, 3, 329, 4);
            }
            ++field249;
            if (field249 > 95) {
                field249 = 0;
                this.field552.method536(51, true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)V")
    public final void method94(int arg0, byte arg1) {
        if (arg1 != 3) {
            this.field458 = this.field292.method547();
        }
        if (!field392) {
            if (class8.field633[17] >= arg0) {
                class47 var3 = class8.field627[17];
                int var4 = var3.field1435 * var3.field1434 - 1;
                int var5 = this.field526 * var3.field1434 * 2;
                byte[] var6 = var3.field1432;
                byte[] var7 = this.field378;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field1432 = var7;
                this.field378 = var6;
                class8.method190(false, 17);
                ++field165;
                if (field165 > 94) {
                    field165 = 0;
                    this.field552.method536(143, true);
                }
            }
            if (class8.field633[24] >= arg0) {
                class47 var9 = class8.field627[24];
                int var10 = var9.field1435 * var9.field1434 - 1;
                int var11 = this.field526 * var9.field1434 * 2;
                byte[] var12 = var9.field1432;
                byte[] var13 = this.field378;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field1432 = var13;
                this.field378 = var12;
                class8.method190(false, 24);
            }
            if (class8.field633[34] >= arg0) {
                class47 var15 = class8.field627[34];
                int var16 = var15.field1435 * var15.field1434 - 1;
                int var17 = this.field526 * var15.field1434 * 2;
                byte[] var18 = var15.field1432;
                byte[] var19 = this.field378;
                for (int var20 = 0; var20 <= var16; ++var20) {
                    var19[var20] = var18[var20 - var17 & var16];
                }
                var15.field1432 = var19;
                this.field378 = var18;
                class8.method190(false, 34);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method95(boolean arg0) {
        if (!arg0) {
            int var2 = 5;
            this.field412[8] = 0;
            int var3 = 0;
            while (this.field412[8] == 0) {
                String var4 = "Unknown problem";
                this.method81(20, -947, "Connecting to web server");
                try {
                    DataInputStream var5 = this.method167("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 328);
                    class69 var6 = new class69(new byte[40], field428);
                    var5.readFully(var6.field1699, 0, 40);
                    var5.close();
                    for (int var7 = 0; var7 < 9; ++var7) {
                        this.field412[var7] = var6.method552();
                    }
                    int var8 = var6.method552();
                    int var9 = 1234;
                    for (int var10 = 0; var10 < 9; ++var10) {
                        var9 = (var9 << 1) + this.field412[var10];
                    }
                    if (var8 != var9) {
                        var4 = "checksum problem";
                        this.field412[8] = 0;
                    }
                } catch (EOFException var13) {
                    var4 = "EOF problem";
                    this.field412[8] = 0;
                } catch (IOException var14) {
                    var4 = "connection problem";
                    this.field412[8] = 0;
                } catch (Exception var15) {
                    var4 = "logic problem";
                    this.field412[8] = 0;
                    if (!signlink.reporterror) {
                        return;
                    }
                }
                if (this.field412[8] == 0) {
                    ++var3;
                    for (int var11 = var2; var11 > 0; --var11) {
                        if (var3 >= 10) {
                            this.method81(10, -947, "Game updated - please reload page");
                            var11 = 10;
                        } else {
                            this.method81(10, -947, var4 + " - Will retry in " + var11 + " secs.");
                        }
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception var12) {
                        }
                    }
                    var2 *= 2;
                    if (var2 > 60) {
                        var2 = 60;
                    }
                    this.field427 = !this.field427;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILZDMOUFDZ;I)V")
    public final void method96(int arg0, int arg1, int arg2, class68 arg3, int arg4) {
        if (arg4 <= 0) {
            this.field572 = null;
        }
        if (this.field484 < 400) {
            if (arg3.field1682 != null) {
                arg3 = arg3.method528(-863);
            }
            if (arg3 != null) {
                if (arg3.field1654) {
                    String var6 = arg3.field1674;
                    if (arg3.field1648 != 0) {
                        var6 = var6 + method80(field446.field1269, arg3.field1648, 330) + " (level-" + arg3.field1648 + ")";
                    }
                    if (this.field519 == 1) {
                        this.field450[this.field484] = "Use " + this.field523 + " with @yel@" + var6;
                        this.field409[this.field484] = 542;
                        this.field410[this.field484] = arg0;
                        this.field407[this.field484] = arg1;
                        this.field408[this.field484] = arg2;
                        ++this.field484;
                    } else {
                        if (this.field308 == 1) {
                            if ((this.field310 & 2) == 2) {
                                this.field450[this.field484] = this.field311 + " @yel@" + var6;
                                this.field409[this.field484] = 914;
                                this.field410[this.field484] = arg0;
                                this.field407[this.field484] = arg1;
                                this.field408[this.field484] = arg2;
                                ++this.field484;
                                return;
                            }
                        } else {
                            if (arg3.field1658 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg3.field1658[var7] != null && !arg3.field1658[var7].equalsIgnoreCase("attack")) {
                                        this.field450[this.field484] = arg3.field1658[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field409[this.field484] = 723;
                                        }
                                        if (var7 == 1) {
                                            this.field409[this.field484] = 536;
                                        }
                                        if (var7 == 2) {
                                            this.field409[this.field484] = 413;
                                        }
                                        if (var7 == 3) {
                                            this.field409[this.field484] = 882;
                                        }
                                        if (var7 == 4) {
                                            this.field409[this.field484] = 362;
                                        }
                                        this.field410[this.field484] = arg0;
                                        this.field407[this.field484] = arg1;
                                        this.field408[this.field484] = arg2;
                                        ++this.field484;
                                    }
                                }
                            }
                            if (arg3.field1658 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg3.field1658[var8] != null && arg3.field1658[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg3.field1648 > field446.field1269) {
                                            var9 = 2000;
                                        }
                                        this.field450[this.field484] = arg3.field1658[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field409[this.field484] = var9 + 723;
                                        }
                                        if (var8 == 1) {
                                            this.field409[this.field484] = var9 + 536;
                                        }
                                        if (var8 == 2) {
                                            this.field409[this.field484] = var9 + 413;
                                        }
                                        if (var8 == 3) {
                                            this.field409[this.field484] = var9 + 882;
                                        }
                                        if (var8 == 4) {
                                            this.field409[this.field484] = var9 + 362;
                                        }
                                        this.field410[this.field484] = arg0;
                                        this.field407[this.field484] = arg1;
                                        this.field408[this.field484] = arg2;
                                        ++this.field484;
                                    }
                                }
                            }
                            this.field450[this.field484] = "Examine @yel@" + var6;
                            this.field409[this.field484] = 1468;
                            this.field410[this.field484] = arg0;
                            this.field407[this.field484] = arg1;
                            this.field408[this.field484] = arg2;
                            ++this.field484;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LQIVQUKBA;ILZOMNSJJM;ZI)V")
    private final void method97(class39 arg0, int arg1, class69 arg2, boolean arg3, int arg4) {
        if (arg3) {
            this.field552.method537(226);
        }
        if ((arg1 & 128) != 0) {
            int var6 = arg2.method565(38);
            int var7 = arg2.method566(1474);
            arg0.method370(field441, var7, var6, 8);
            arg0.field1224 = field441 + 300;
            arg0.field1225 = arg2.method567(3);
            arg0.field1226 = arg2.method565(38);
        }
        if ((arg1 & 16) != 0) {
            arg0.field1252 = arg2.method574((byte) 3);
            if (arg0.field1252 == 65535) {
                arg0.field1252 = -1;
            }
        }
        if ((arg1 & 32) != 0) {
            arg0.field1209 = arg2.method554();
            if (arg0.field1209.charAt(0) == '~') {
                arg0.field1209 = arg0.field1209.substring(1);
                this.method131((byte) 5, 2, arg0.field1271, arg0.field1209);
            } else if (field446 == arg0) {
                this.method131((byte) 5, 2, arg0.field1271, arg0.field1209);
            }
            arg0.field1227 = 0;
            arg0.field1232 = 0;
            arg0.field1229 = 150;
        }
        if ((arg1 & 256) != 0) {
            arg0.field1236 = arg2.method547();
            arg0.field1238 = arg2.method547();
            arg0.field1237 = arg2.method547();
            arg0.field1239 = arg2.method566(1474);
            arg0.field1240 = arg2.method575(263) + field441;
            arg0.field1241 = arg2.method573(7) + field441;
            arg0.field1242 = arg2.method565(38);
            arg0.method372(false);
        }
        if ((arg1 & 8) != 0) {
            int var8 = arg2.method565(38);
            byte[] var9 = new byte[var8];
            class69 var10 = new class69(var9, field428);
            arg2.method584(0, var9, this.field575, var8);
            this.field496[arg4] = var10;
            arg0.method374(false, var10);
        }
        if ((arg1 & 64) != 0) {
            arg0.field1243 = arg2.method575(263);
            arg0.field1244 = arg2.method574((byte) 3);
        }
        if ((arg1 & 1024) != 0) {
            int var11 = arg2.method567(3);
            int var12 = arg2.method566(1474);
            arg0.method370(field441, var12, var11, 8);
            arg0.field1224 = field441 + 300;
            arg0.field1225 = arg2.method566(1474);
            arg0.field1226 = arg2.method566(1474);
        }
        if ((arg1 & 4) != 0) {
            int var13 = arg2.method573(7);
            int var14 = arg2.method567(3);
            int var15 = arg2.method547();
            int var16 = arg2.field1700;
            if (arg0.field1271 != null && arg0.field1276) {
                long var17 = class26.method253(arg0.field1271);
                boolean var19 = false;
                if (var14 <= 1) {
                    for (int var20 = 0; var20 < this.field483; ++var20) {
                        if (this.field307[var20] == var17) {
                            var19 = true;
                            break;
                        }
                    }
                }
                if (!var19 && this.field223 == 0) {
                    try {
                        this.field553.field1700 = 0;
                        arg2.method556(0, this.field553.field1699, var15, 9);
                        this.field553.field1700 = 0;
                        String var21 = class36.method366(this.field553, var15, this.field561);
                        String var22 = class60.method468(var21, (byte) -88);
                        arg0.field1209 = var22;
                        arg0.field1227 = var13 >> 8;
                        arg0.field1232 = var13 & 255;
                        arg0.field1229 = 150;
                        if (var14 != 2 && var14 != 3) {
                            if (var14 == 1) {
                                this.method131((byte) 5, 1, "@cr1@" + arg0.field1271, var22);
                            } else {
                                this.method131((byte) 5, 2, arg0.field1271, var22);
                            }
                        } else {
                            this.method131((byte) 5, 1, "@cr2@" + arg0.field1271, var22);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg2.field1700 = var15 + var16;
        }
        if ((arg1 & 512) != 0) {
            arg0.field1200 = arg2.method549();
            int var24 = arg2.method582(true);
            arg0.field1204 = var24 >> 16;
            arg0.field1203 = (var24 & 65535) + field441;
            arg0.field1201 = 0;
            arg0.field1202 = 0;
            if (arg0.field1203 > field441) {
                arg0.field1201 = -1;
            }
            if (arg0.field1200 == 65535) {
                arg0.field1200 = -1;
            }
        }
        if ((arg1 & 2) != 0) {
            int var25 = arg2.method574((byte) 3);
            if (var25 == 65535) {
                var25 = -1;
            }
            int var26 = arg2.method565(38);
            if (arg0.field1245 == var25 && var25 != -1) {
                int var27 = class20.field875[var25].field889;
                if (var27 == 1) {
                    arg0.field1246 = 0;
                    arg0.field1247 = 0;
                    arg0.field1248 = var26;
                    arg0.field1249 = 0;
                }
                if (var27 == 2) {
                    arg0.field1249 = 0;
                    return;
                }
            } else if (var25 == -1 || arg0.field1245 == -1 || class20.field875[var25].field883 >= class20.field875[arg0.field1245].field883) {
                arg0.field1245 = var25;
                arg0.field1246 = 0;
                arg0.field1247 = 0;
                arg0.field1248 = var26;
                arg0.field1249 = 0;
                arg0.field1215 = arg0.field1220;
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field389 = Integer.parseInt(this.getParameter("nodeid"));
        field390 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method149(0);
        } else {
            method158(false);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field391 = false;
        } else {
            field391 = true;
        }
        this.method232(-499, 765, 503);
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)Ljava/lang/String;")
    public final String method98(byte arg0) {
        if (arg0 != -39) {
            this.field334 = !this.field334;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field920 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;IB)LLYZBHNJP;")
    public final class31 method99(int arg0, String arg1, int arg2, String arg3, int arg4, byte arg5) {
        if (arg5 != -118) {
            field516 = -490;
        }
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field456[0] != null) {
                var7 = this.field456[0].method439(arg0, (byte) 5);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field125.reset();
            this.field125.update(var7);
            int var9 = (int) this.field125.getValue();
            if (arg2 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class31(5, var7);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method81(arg4, -947, "Requesting " + arg3);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method167(arg1 + arg2);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class69 var17 = new class69(var16, field428);
                    var17.field1700 = 3;
                    int var18 = var17.method551() + 6;
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
                            this.method81(arg4, -947, "Loading " + arg3 + " - " + var23 + "%");
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field456[0] != null) {
                            this.field456[0].method440(-34312, var7, var7.length, arg0);
                        }
                    } catch (Exception var29) {
                        this.field456[0] = null;
                    }
                    if (var7 != null) {
                        this.field125.reset();
                        this.field125.update(var7);
                        int var24 = (int) this.field125.getValue();
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
                            this.method81(arg4, -947, "Game updated - please reload page");
                            var26 = 10;
                        } else {
                            this.method81(arg4, -947, var12 + " - Retrying in " + var26);
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
                    this.field427 = !this.field427;
                }
            }
            return new class31(5, var7);
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method100(byte arg0) {
        ++this.field536;
        this.method153(true, (byte) 19);
        this.method152(true, false);
        this.method153(false, (byte) 19);
        this.method152(false, false);
        this.method101(-807);
        this.method39(true);
        if (!this.field465) {
            int var2 = this.field340;
            if (this.field387 / 256 > var2) {
                var2 = this.field387 / 256;
            }
            if (this.field169[4] && this.field382[4] + 128 > var2) {
                var2 = this.field382[4] + 128;
            }
            int var3 = this.field368 + this.field341 & 2047;
            this.method102(this.field468, this.method151(this.field210, false, field446.field1234, field446.field1233) - 50, this.field303, var2, this.field302, var3, var2 * 3 + 600);
        }
        int var4;
        if (!this.field465) {
            var4 = this.method132(true);
        } else {
            var4 = this.method133(5);
        }
        int var5 = this.field195;
        int var6 = this.field196;
        int var7 = this.field197;
        int var8 = this.field198;
        int var9 = this.field199;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field169[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field564[var10] * 2 + 1) - (double) this.field564[var10] + Math.sin((double) this.field548[var10] / 100.0D * (double) this.field239[var10]) * (double) this.field382[var10]);
                if (var10 == 0) {
                    this.field195 += var12;
                }
                if (var10 == 1) {
                    this.field196 += var12;
                }
                if (var10 == 2) {
                    this.field197 += var12;
                }
                if (var10 == 3) {
                    this.field199 = this.field199 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field198 += var12;
                    if (this.field198 < 128) {
                        this.field198 = 128;
                    }
                    if (this.field198 > 383) {
                        this.field198 = 383;
                    }
                }
            }
        }
        int var11 = class8.field634;
        class4.field91 = true;
        class4.field94 = 0;
        class4.field92 = super.field925 - 4;
        class4.field93 = super.field926 - 4;
        class29.method267(7);
        this.field543.method331(var4, this.field199, this.field198, this.field195, this.field197, (byte) -120, this.field196);
        this.field543.method306(this.field351);
        if (arg0 != 2) {
            this.method173();
        }
        this.method92(-669);
        this.method82(265);
        this.method94(var11, (byte) 3);
        this.method93(-728);
        this.field143.method213(9, 4, super.field917, 4);
        this.field195 = var5;
        this.field196 = var6;
        this.field197 = var7;
        this.field198 = var8;
        this.field199 = var9;
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method101(int arg0) {
        while (arg0 >= 0) {
            this.field226 = !this.field226;
        }
        for (class7 var2 = (class7) this.field414.method523(); var2 != null; var2 = (class7) this.field414.method525(-687)) {
            if (this.field210 == var2.field583 && field441 <= var2.field604) {
                if (field441 >= var2.field603) {
                    if (var2.field607 > 0) {
                        class49 var3 = this.field554[var2.field607 - 1];
                        if (var3 != null && var3.field1233 >= 0 && var3.field1233 < 13312 && var3.field1234 >= 0 && var3.field1234 < 13312) {
                            var2.method182(var3.field1234, this.method151(var2.field583, false, var3.field1234, var3.field1233) - var2.field590, var3.field1233, field441, (byte) -56);
                        }
                    }
                    if (var2.field607 < 0) {
                        int var4 = -var2.field607 - 1;
                        class39 var5;
                        if (this.field514 == var4) {
                            var5 = field446;
                        } else {
                            var5 = this.field491[var4];
                        }
                        if (var5 != null && var5.field1233 >= 0 && var5.field1233 < 13312 && var5.field1234 >= 0 && var5.field1234 < 13312) {
                            var2.method182(var5.field1234, this.method151(var2.field583, false, var5.field1234, var5.field1233) - var2.field590, var5.field1233, field441, (byte) -56);
                        }
                    }
                    var2.method180(this.field526, 0);
                    this.field543.method303((int) var2.field593, var2.field595, -1, (int) var2.field592, var2, -177, 60, this.field210, (int) var2.field594, false);
                }
            } else {
                var2.method591();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIIIIII)V")
    public final void method102(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg3 & 2047;
        int var9 = 2048 - arg5 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg6;
        if (var8 != 0) {
            int var13 = class4.field96[var8];
            int var14 = class4.field97[var8];
            int var15 = var11 * var14 - arg6 * var13 >> 16;
            var12 = var11 * var13 + arg6 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class4.field96[var9];
            int var17 = class4.field97[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field195 = arg4 - var10;
        this.field196 = arg1 - var11;
        this.field197 = arg2 - var12;
        this.field198 = arg3;
        if (!arg0) {
            this.field572 = null;
        }
        this.field199 = arg5;
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method103(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var19 = (int) (Math.random() * 100.0D);
            if (var19 < 50) {
                this.field365[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var16 = (int) (Math.random() * 124.0D) + 2;
            int var17 = (int) (Math.random() * 128.0D) + 128;
            int var18 = (var17 << 7) + var16;
            this.field365[var18] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var14 = 1; var14 < 127; ++var14) {
                int var15 = (var5 << 7) + var14;
                this.field366[var15] = (this.field365[var15 - 1] + this.field365[var15 + 1] + this.field365[var15 - 128] + this.field365[var15 + 128]) / 4;
            }
        }
        this.field547 += 128;
        if (this.field547 > this.field137.length) {
            this.field547 -= this.field137.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method138(this.field444[var6], false);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var11 = 1; var11 < 127; ++var11) {
                int var12 = (var7 << 7) + var11;
                int var13 = this.field366[var12 + 128] - this.field137[this.field547 + var12 & this.field137.length - 1] / 5;
                if (var13 < 0) {
                    var13 = 0;
                }
                this.field365[var12] = var13;
            }
        }
        int var8 = 11 / arg0;
        for (int var9 = 0; var9 < var2 - 1; ++var9) {
            this.field347[var9] = this.field347[var9 + 1];
        }
        this.field347[var2 - 1] = (int) (Math.sin((double) field441 / 14.0D) * 16.0D + Math.sin((double) field441 / 15.0D) * 14.0D + Math.sin((double) field441 / 16.0D) * 12.0D);
        if (this.field228 > 0) {
            this.field228 -= 4;
        }
        if (this.field229 > 0) {
            this.field229 -= 4;
        }
        if (this.field228 == 0 && this.field229 == 0) {
            int var10 = (int) (Math.random() * 2000.0D);
            if (var10 == 0) {
                this.field228 = 1024;
            }
            if (var10 == 1) {
                this.field229 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method104(int arg0) {
        if (arg0 >= 0) {
            this.field293 = this.field560.method585();
        }
        for (int var2 = -1; var2 < this.field492; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field490;
            } else {
                var6 = this.field493[var2];
            }
            class39 var7 = this.field491[var6];
            if (var7 != null && var7.field1229 > 0) {
                --var7.field1229;
                if (var7.field1229 == 0) {
                    var7.field1209 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field555; ++var3) {
            int var4 = this.field556[var3];
            class49 var5 = this.field554[var4];
            if (var5 != null && var5.field1229 > 0) {
                --var5.field1229;
                if (var5.field1229 == 0) {
                    var5.field1209 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLZOMNSJJM;I)V")
    private final void method105(boolean arg0, class69 arg1, int arg2) {
        while (true) {
            if (arg1.field1701 + 21 < arg2 * 8) {
                int var4 = arg1.method558(14, true);
                if (var4 != 16383) {
                    if (this.field554[var4] == null) {
                        this.field554[var4] = new class49();
                    }
                    class49 var5 = this.field554[var4];
                    this.field556[this.field555++] = var4;
                    var5.field1231 = field441;
                    int var6 = arg1.method558(5, true);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg1.method558(1, true);
                    int var8 = arg1.method558(5, true);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = arg1.method558(1, true);
                    if (var9 == 1) {
                        this.field495[this.field494++] = var4;
                    }
                    var5.field1441 = class68.method529(arg1.method558(12, true));
                    var5.field1214 = var5.field1441.field1669;
                    var5.field1222 = var5.field1441.field1670;
                    var5.field1205 = var5.field1441.field1663;
                    var5.field1206 = var5.field1441.field1676;
                    var5.field1207 = var5.field1441.field1644;
                    var5.field1208 = var5.field1441.field1650;
                    var5.field1210 = var5.field1441.field1677;
                    var5.method373(var7 == 1, field446.field1251[0] + var6, this.field286, field446.field1250[0] + var8);
                    continue;
                }
            }
            arg1.method559(221);
            if (!arg0) {
                return;
            }
            for (int var10 = 1; var10 > 0; ++var10) {
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method106(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field424 >= 100 && this.field133 != 1) {
                this.method131((byte) 5, 0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else if (this.field424 >= 200) {
                this.method131((byte) 5, 0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else {
                String var4 = class26.method257(0, class26.method254(0, arg1));
                for (int var5 = 0; var5 < this.field424; ++var5) {
                    if (this.field111[var5] == arg1) {
                        this.method131((byte) 5, 0, "", var4 + " is already on your friend list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field483; ++var6) {
                    if (this.field307[var6] == arg1) {
                        this.method131((byte) 5, 0, "", "Please remove " + var4 + " from your ignore list first");
                        return;
                    }
                }
                if (!var4.equals(field446.field1271)) {
                    this.field379[this.field424] = var4;
                    this.field111[this.field424] = arg1;
                    this.field123[this.field424] = 0;
                    while (arg0 >= 0) {
                        this.method173();
                    }
                    ++this.field424;
                    this.field426 = true;
                    this.field552.method536(233, true);
                    this.field552.method543(arg1, (byte) 5);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILCPNGZAUN;)Z")
    public final boolean method107(int arg0, class9 arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else {
            int var3 = arg1.field677;
            if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
                if (var3 >= 401 && var3 <= 500) {
                    this.field450[this.field484] = "Remove @whi@" + arg1.field665;
                    this.field409[this.field484] = 935;
                    ++this.field484;
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
                this.field450[this.field484] = "Remove @whi@" + this.field379[var3];
                this.field409[this.field484] = 125;
                ++this.field484;
                this.field450[this.field484] = "Message @whi@" + this.field379[var3];
                this.field409[this.field484] = 885;
                ++this.field484;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method108(byte arg0) {
        if (arg0 != -25) {
            this.field552.method537(63);
        }
        for (int var2 = -1; var2 < this.field492; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field490;
            } else {
                var3 = this.field493[var2];
            }
            class39 var4 = this.field491[var3];
            if (var4 != null) {
                this.method65(1, -29048, var4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method109(boolean arg0) {
        if (this.field581 > 1) {
            --this.field581;
        }
        if (this.field461 > 0) {
            --this.field461;
        }
        for (int var2 = 0; var2 < 5 && this.method140(-27638); ++var2) {
        }
        if (this.field535) {
            Object var3 = this.field400.field856;
            synchronized (this.field400.field856) {
                if (!field363) {
                    this.field400.field851 = 0;
                } else if (super.field931 != 0 || this.field400.field851 >= 40) {
                    this.field552.method536(15, true);
                    this.field552.method537(0);
                    int var4 = this.field552.field1700;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field400.field851 && var4 - this.field552.field1700 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field400.field854[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field400.field855[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field400.field854[var6] == -1 && this.field400.field855[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field471 == var8 && this.field472 == var7) {
                            if (this.field155 < 2047) {
                                ++this.field155;
                            }
                        } else {
                            int var10 = var8 - this.field471;
                            this.field471 = var8;
                            int var11 = var7 - this.field472;
                            this.field472 = var7;
                            if (this.field155 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field552.method538((this.field155 << 12) + (var10 << 6) + var11);
                                this.field155 = 0;
                            } else if (this.field155 < 8) {
                                this.field552.method540((this.field155 << 19) + 8388608 + var9);
                                this.field155 = 0;
                            } else {
                                this.field552.method541((this.field155 << 19) + -1073741824 + var9);
                                this.field155 = 0;
                            }
                        }
                    }
                    this.field552.method546(true, this.field552.field1700 - var4);
                    if (var5 >= this.field400.field851) {
                        this.field400.field851 = 0;
                    } else {
                        this.field400.field851 -= var5;
                        for (int var12 = 0; var12 < this.field400.field851; ++var12) {
                            this.field400.field855[var12] = this.field400.field855[var5 + var12];
                            this.field400.field854[var12] = this.field400.field854[var5 + var12];
                        }
                    }
                }
            }
            if (super.field931 != 0) {
                long var13 = (super.field934 - this.field377) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field377 = super.field934;
                int var15 = super.field933;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field932;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field931 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field552.method536(139, true);
                this.field552.method579((var18 << 19) + (var19 << 20) + var17, -309);
            }
            if (this.field304 > 0) {
                --this.field304;
            }
            if (super.field935[1] == 1 || super.field935[2] == 1 || super.field935[3] == 1 || super.field935[4] == 1) {
                this.field305 = true;
            }
            if (this.field305 && this.field304 <= 0) {
                this.field304 = 20;
                this.field305 = false;
                this.field552.method536(187, true);
                this.field552.method571(this.field340, true);
                this.field552.method538(this.field341);
            }
            if (super.field922 && !this.field422) {
                this.field422 = true;
                this.field552.method536(178, true);
                this.field552.method537(1);
            }
            if (!super.field922 && this.field422) {
                this.field422 = false;
                this.field552.method536(178, true);
                this.field552.method537(0);
            }
            this.method119((byte) 7);
            this.method115(0);
            this.method41(0);
            ++this.field459;
            if (this.field459 > 750) {
                this.method74(564);
            }
            this.method108((byte) -25);
            this.method64(true);
            this.method104(-396);
            ++this.field526;
            if (this.field580 != 0) {
                this.field579 += 20;
                if (this.field579 >= 400) {
                    this.field580 = 0;
                }
            }
            if (this.field217 != 0) {
                ++this.field214;
                if (this.field214 >= 15) {
                    if (this.field217 == 2) {
                        this.field426 = true;
                    }
                    if (this.field217 == 3) {
                        this.field252 = true;
                    }
                    this.field217 = 0;
                }
            }
            if (this.field269 != 0) {
                ++this.field227;
                if (super.field925 > this.field270 + 5 || super.field925 < this.field270 - 5 || super.field926 > this.field271 + 5 || super.field926 < this.field271 - 5) {
                    this.field256 = true;
                }
                if (super.field924 == 0) {
                    if (this.field269 == 2) {
                        this.field426 = true;
                    }
                    if (this.field269 == 3) {
                        this.field252 = true;
                    }
                    this.field269 = 0;
                    if (this.field256 && this.field227 >= 5) {
                        this.field542 = -1;
                        this.method114(0);
                        if (this.field542 == this.field267 && this.field541 != this.field268) {
                            class9 var20 = class9.field645[this.field267];
                            byte var21 = 0;
                            if (this.field544 == 1 && var20.field677 == 206) {
                                var21 = 1;
                            }
                            if (var20.field693[this.field541] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field705) {
                                int var22 = this.field268;
                                int var23 = this.field541;
                                var20.field693[var23] = var20.field693[var22];
                                var20.field637[var23] = var20.field637[var22];
                                var20.field693[var22] = -1;
                                var20.field637[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field268;
                                int var25 = this.field541;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method202(var24 - 1, (byte) 4, var24);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method202(var24 + 1, (byte) 4, var24);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method202(this.field541, (byte) 4, this.field268);
                            }
                            this.field552.method536(36, true);
                            this.field552.method571(this.field541, true);
                            this.field552.method572(0, this.field268);
                            this.field552.method570(this.field267, 0);
                            this.field552.method563(false, var21);
                        }
                    } else if ((this.field498 == 1 || this.method47(0, this.field484 - 1)) && this.field484 > 2) {
                        this.method110((byte) 8);
                    } else if (this.field484 > 0) {
                        this.method76(this.field484 - 1, 0);
                    }
                    this.field214 = 10;
                    super.field931 = 0;
                }
            }
            if (class32.field1087 != -1) {
                int var26 = class32.field1087;
                int var27 = class32.field1088;
                boolean var28 = this.method90(var27, true, field446.field1251[0], true, 0, var26, 0, 0, 0, 0, field446.field1250[0], 0);
                class32.field1087 = -1;
                if (var28) {
                    this.field577 = super.field932;
                    this.field578 = super.field933;
                    this.field580 = 1;
                    this.field579 = 0;
                }
            }
            if (super.field931 == 1 && this.field275 != null) {
                this.field275 = null;
                this.field252 = true;
                super.field931 = 0;
            }
            this.method77(0);
            this.method117(true);
            this.method111((byte) 2);
            if (!arg0) {
                for (int var29 = 1; var29 > 0; ++var29) {
                }
            }
            this.method144(field525);
            if (super.field924 == 1 || super.field931 == 1) {
                ++this.field540;
            }
            if (this.field312 == 2) {
                this.method50(this.field449);
            }
            if (this.field312 == 2 && this.field465) {
                this.method54(4);
            }
            for (int var30 = 0; var30 < 5; ++var30) {
                int var10002 = this.field239[var30]++;
            }
            this.method159(true);
            ++super.field923;
            if (super.field923 > 4500) {
                this.field461 = 250;
                super.field923 -= 500;
                this.field552.method536(156, true);
            }
            ++this.field506;
            if (this.field506 > 500) {
                this.field506 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field512 += this.field513;
                }
                if ((var31 & 2) == 2) {
                    this.field384 += this.field385;
                }
                if ((var31 & 4) == 4) {
                    this.field368 += this.field369;
                }
            }
            if (this.field512 < -50) {
                this.field513 = 2;
            }
            if (this.field512 > 50) {
                this.field513 = -2;
            }
            if (this.field384 < -55) {
                this.field385 = 2;
            }
            if (this.field384 > 55) {
                this.field385 = -2;
            }
            if (this.field368 < -40) {
                this.field369 = 1;
            }
            if (this.field368 > 40) {
                this.field369 = -1;
            }
            ++this.field562;
            if (this.field562 > 500) {
                this.field562 = 0;
                int var32 = (int) (Math.random() * 8.0D);
                if ((var32 & 1) == 1) {
                    this.field314 += this.field315;
                }
                if ((var32 & 2) == 2) {
                    this.field134 += this.field135;
                }
            }
            if (this.field314 < -60) {
                this.field315 = 2;
            }
            if (this.field314 > 60) {
                this.field315 = -2;
            }
            if (this.field134 < -20) {
                this.field135 = 1;
            }
            if (this.field134 > 10) {
                this.field135 = -1;
            }
            ++this.field460;
            if (this.field460 > 50) {
                this.field552.method536(200, true);
            }
            try {
                if (this.field212 != null && this.field552.field1700 > 0) {
                    this.field212.method5(this.field552.field1699, 0, this.field552.field1700, true);
                    this.field552.field1700 = 0;
                    this.field460 = 0;
                }
            } catch (IOException var34) {
                this.method74(564);
            } catch (Exception var35) {
                this.method58(true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method110(byte arg0) {
        int var2 = this.field501.method239(false, "Choose Option");
        for (int var3 = 0; var3 < this.field484; ++var3) {
            int var12 = this.field501.method239(false, this.field450[var3]);
            if (var12 > var2) {
                var2 = var12;
            }
        }
        var2 += 8;
        int var4 = this.field484 * 15 + 21;
        if (arg0 == 8) {
            boolean var5 = false;
        } else {
            this.field136 = this.field560.method585();
        }
        if (super.field932 > 4 && super.field933 > 4 && super.field932 < 516 && super.field933 < 338) {
            int var6 = super.field932 - 4 - var2 / 2;
            if (var2 + var6 > 512) {
                var6 = 512 - var2;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field933 - 4;
            if (var4 + var7 > 334) {
                var7 = 334 - var4;
            }
            if (var7 < 0) {
                var7 = 0;
            }
            this.field211 = true;
            this.field370 = 0;
            this.field371 = var6;
            this.field372 = var7;
            this.field373 = var2;
            this.field374 = this.field484 * 15 + 22;
        }
        if (super.field932 > 553 && super.field933 > 205 && super.field932 < 743 && super.field933 < 466) {
            int var8 = super.field932 - 553 - var2 / 2;
            if (var8 < 0) {
                var8 = 0;
            } else if (var2 + var8 > 190) {
                var8 = 190 - var2;
            }
            int var9 = super.field933 - 205;
            if (var9 < 0) {
                var9 = 0;
            } else if (var4 + var9 > 261) {
                var9 = 261 - var4;
            }
            this.field211 = true;
            this.field370 = 1;
            this.field371 = var8;
            this.field372 = var9;
            this.field373 = var2;
            this.field374 = this.field484 * 15 + 22;
        }
        if (super.field932 > 17 && super.field933 > 357 && super.field932 < 496 && super.field933 < 453) {
            int var10 = super.field932 - 17 - var2 / 2;
            if (var10 < 0) {
                var10 = 0;
            } else if (var2 + var10 > 479) {
                var10 = 479 - var2;
            }
            int var11 = super.field933 - 357;
            if (var11 < 0) {
                var11 = 0;
            } else if (var4 + var11 > 96) {
                var11 = 96 - var4;
            }
            this.field211 = true;
            this.field370 = 2;
            this.field371 = var10;
            this.field372 = var11;
            this.field373 = var2;
            this.field374 = this.field484 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method111(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
            if (super.field931 == 1) {
                if (super.field932 >= 539 && super.field932 <= 573 && super.field933 >= 169 && super.field933 < 205 && this.field124[0] != -1) {
                    this.field426 = true;
                    this.field546 = 0;
                    this.field251 = true;
                }
                if (super.field932 >= 569 && super.field932 <= 599 && super.field933 >= 168 && super.field933 < 205 && this.field124[1] != -1) {
                    this.field426 = true;
                    this.field546 = 1;
                    this.field251 = true;
                }
                if (super.field932 >= 597 && super.field932 <= 627 && super.field933 >= 168 && super.field933 < 205 && this.field124[2] != -1) {
                    this.field426 = true;
                    this.field546 = 2;
                    this.field251 = true;
                }
                if (super.field932 >= 625 && super.field932 <= 669 && super.field933 >= 168 && super.field933 < 203 && this.field124[3] != -1) {
                    this.field426 = true;
                    this.field546 = 3;
                    this.field251 = true;
                }
                if (super.field932 >= 666 && super.field932 <= 696 && super.field933 >= 168 && super.field933 < 205 && this.field124[4] != -1) {
                    this.field426 = true;
                    this.field546 = 4;
                    this.field251 = true;
                }
                if (super.field932 >= 694 && super.field932 <= 724 && super.field933 >= 168 && super.field933 < 205 && this.field124[5] != -1) {
                    this.field426 = true;
                    this.field546 = 5;
                    this.field251 = true;
                }
                if (super.field932 >= 722 && super.field932 <= 756 && super.field933 >= 169 && super.field933 < 205 && this.field124[6] != -1) {
                    this.field426 = true;
                    this.field546 = 6;
                    this.field251 = true;
                }
                if (super.field932 >= 540 && super.field932 <= 574 && super.field933 >= 466 && super.field933 < 502 && this.field124[7] != -1) {
                    this.field426 = true;
                    this.field546 = 7;
                    this.field251 = true;
                }
                if (super.field932 >= 572 && super.field932 <= 602 && super.field933 >= 466 && super.field933 < 503 && this.field124[8] != -1) {
                    this.field426 = true;
                    this.field546 = 8;
                    this.field251 = true;
                }
                if (super.field932 >= 599 && super.field932 <= 629 && super.field933 >= 466 && super.field933 < 503 && this.field124[9] != -1) {
                    this.field426 = true;
                    this.field546 = 9;
                    this.field251 = true;
                }
                if (super.field932 >= 627 && super.field932 <= 671 && super.field933 >= 467 && super.field933 < 502 && this.field124[10] != -1) {
                    this.field426 = true;
                    this.field546 = 10;
                    this.field251 = true;
                }
                if (super.field932 >= 669 && super.field932 <= 699 && super.field933 >= 466 && super.field933 < 503 && this.field124[11] != -1) {
                    this.field426 = true;
                    this.field546 = 11;
                    this.field251 = true;
                }
                if (super.field932 >= 696 && super.field932 <= 726 && super.field933 >= 466 && super.field933 < 503 && this.field124[12] != -1) {
                    this.field426 = true;
                    this.field546 = 12;
                    this.field251 = true;
                }
                if (super.field932 >= 724 && super.field932 <= 758 && super.field933 >= 466 && super.field933 < 502 && this.field124[13] != -1) {
                    this.field426 = true;
                    this.field546 = 13;
                    this.field251 = true;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method112(int arg0) {
        if (arg0 != 3) {
            this.field552.method537(41);
        }
        this.field518 = false;
        while (this.field507) {
            this.field518 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field208 = null;
        this.field209 = null;
        this.field444 = null;
        this.field396 = null;
        this.field397 = null;
        this.field398 = null;
        this.field399 = null;
        this.field137 = null;
        this.field138 = null;
        this.field365 = null;
        this.field366 = null;
        this.field538 = null;
        this.field539 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZ)V")
    public final void method113(byte arg0, boolean arg1) {
        this.method164(true);
        this.field319.method212(2);
        this.field208.method428(3, 0, 0);
        if (arg0 != 9) {
            this.field552.method537(4);
        }
        short var3 = 360;
        short var4 = 200;
        if (this.field376 == 0) {
            int var5 = var4 / 2 + 80;
            this.field499.method238(7711145, var5, -502, this.field486.field1347, var3 / 2, true);
            int var6 = var4 / 2 - 20;
            this.field501.method238(16776960, var6, -502, "Welcome to RuneScape", var3 / 2, true);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field209.method428(3, var8 - 20, var7 - 73);
            this.field501.method238(16777215, var8 + 5, -502, "New User", var7, true);
            int var9 = var3 / 2 + 80;
            this.field209.method428(3, var8 - 20, var9 - 73);
            this.field501.method238(16777215, var8 + 5, -502, "Existing User", var9, true);
        }
        if (this.field376 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field352.length() > 0) {
                this.field501.method238(16776960, var10 - 15, -502, this.field352, var3 / 2, true);
                this.field501.method238(16776960, var10, -502, this.field353, var3 / 2, true);
                var10 += 30;
            } else {
                this.field501.method238(16776960, var10 - 7, -502, this.field353, var3 / 2, true);
                var10 += 30;
            }
            this.field501.method245(var3 / 2 - 90, -224, "Username: " + this.field478 + (this.field337 == 0 & field441 % 40 < 20 ? "@yel@|" : ""), true, var10, 16777215);
            var10 += 15;
            this.field501.method245(var3 / 2 - 88, -224, "Password: " + class26.method258(this.field479, 98) + (this.field337 == 1 & field441 % 40 < 20 ? "@yel@|" : ""), true, var10, 16777215);
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field209.method428(3, var12 - 20, var11 - 73);
                this.field501.method238(16777215, var12 + 5, -502, "Login", var11, true);
                int var13 = var3 / 2 + 80;
                this.field209.method428(3, var12 - 20, var13 - 73);
                this.field501.method238(16777215, var12 + 5, -502, "Cancel", var13, true);
            }
        }
        if (this.field376 == 3) {
            this.field501.method238(16776960, var4 / 2 - 60, -502, "Create a free account", var3 / 2, true);
            int var14 = var4 / 2 - 35;
            this.field501.method238(16777215, var14, -502, "To create a new account you need to", var3 / 2, true);
            int var18 = var14 + 15;
            this.field501.method238(16777215, var18, -502, "go back to the main RuneScape webpage", var3 / 2, true);
            int var19 = var18 + 15;
            this.field501.method238(16777215, var19, -502, "and choose the red 'create account'", var3 / 2, true);
            int var20 = var19 + 15;
            this.field501.method238(16777215, var20, -502, "button at the top right of that page.", var3 / 2, true);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field209.method428(3, var16 - 20, var15 - 73);
            this.field501.method238(16777215, var16 + 5, -502, "Cancel", var15, true);
        }
        this.field319.method213(9, 202, super.field917, 171);
        if (this.field563) {
            this.field563 = false;
            this.field317.method213(9, 128, super.field917, 0);
            this.field318.method213(9, 202, super.field917, 371);
            this.field322.method213(9, 0, super.field917, 265);
            this.field323.method213(9, 562, super.field917, 265);
            this.field324.method213(9, 128, super.field917, 171);
            this.field325.method213(9, 562, super.field917, 171);
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method114(int arg0) {
        if (this.field269 == 0) {
            this.field450[0] = "Cancel";
            this.field409[0] = 1889;
            this.field484 = 1;
            this.field457 += arg0;
            this.method61(0);
            this.field411 = 0;
            if (super.field925 > 4 && super.field926 > 4 && super.field925 < 516 && super.field926 < 338) {
                if (this.field381 != -1) {
                    this.method170(4, super.field926, super.field925, class9.field645[this.field381], 0, 0, 4);
                } else {
                    this.method53(true);
                }
            }
            if (this.field485 != this.field411) {
                this.field485 = this.field411;
            }
            this.field411 = 0;
            if (super.field925 > 553 && super.field926 > 205 && super.field925 < 743 && super.field926 < 466) {
                if (this.field367 != -1) {
                    this.method170(205, super.field926, super.field925, class9.field645[this.field367], 0, 0, 553);
                } else if (this.field124[this.field546] != -1) {
                    this.method170(205, super.field926, super.field925, class9.field645[this.field124[this.field546]], 0, 0, 553);
                }
            }
            if (this.field447 != this.field411) {
                this.field426 = true;
                this.field447 = this.field411;
            }
            this.field411 = 0;
            if (super.field925 > 17 && super.field926 > 357 && super.field925 < 496 && super.field926 < 453) {
                if (this.field350 != -1) {
                    this.method170(357, super.field926, super.field925, class9.field645[this.field350], 0, 0, 17);
                } else if (super.field926 < 434 && super.field925 < 426) {
                    this.method147(super.field926 - 357, 0, super.field925 - 17);
                }
            }
            if (this.field350 != -1 && this.field420 != this.field411) {
                this.field252 = true;
                this.field420 = this.field411;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field484 - 1; ++var3) {
                    if (this.field409[var3] < 1000 && this.field409[var3 + 1] > 1000) {
                        String var4 = this.field450[var3];
                        this.field450[var3] = this.field450[var3 + 1];
                        this.field450[var3 + 1] = var4;
                        int var5 = this.field409[var3];
                        this.field409[var3] = this.field409[var3 + 1];
                        this.field409[var3 + 1] = var5;
                        int var6 = this.field407[var3];
                        this.field407[var3] = this.field407[var3 + 1];
                        this.field407[var3 + 1] = var6;
                        int var7 = this.field408[var3];
                        this.field408[var3] = this.field408[var3 + 1];
                        this.field408[var3 + 1] = var7;
                        int var8 = this.field410[var3];
                        this.field410[var3] = this.field410[var3 + 1];
                        this.field410[var3 + 1] = var8;
                        var2 = false;
                    }
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
                if (super.field920 != null) {
                    return new URL("http://127.0.0.1:" + (field390 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    private final void method115(int arg0) {
        this.field457 += arg0;
        if (this.field312 == 2) {
            for (class27 var2 = (class27) this.field406.method523(); var2 != null; var2 = (class27) this.field406.method525(-687)) {
                if (var2.field988 > 0) {
                    --var2.field988;
                }
                if (var2.field988 == 0) {
                    if (var2.field984 < 0 || class63.method500(var2.field986, true, var2.field984)) {
                        this.method63(var2.field985, true, var2.field983, var2.field981, var2.field986, var2.field984, var2.field982, var2.field980);
                        var2.method591();
                    }
                } else {
                    if (var2.field987 > 0) {
                        --var2.field987;
                    }
                    if (var2.field987 == 0 && var2.field982 >= 1 && var2.field983 >= 1 && var2.field982 <= 102 && var2.field983 <= 102 && (var2.field989 < 0 || class63.method500(var2.field991, true, var2.field989))) {
                        this.method63(var2.field990, true, var2.field983, var2.field981, var2.field991, var2.field989, var2.field982, var2.field980);
                        var2.field987 = -1;
                        if (var2.field989 == var2.field984 && var2.field984 == -1) {
                            var2.method591();
                        } else if (var2.field989 == var2.field984 && var2.field990 == var2.field985 && var2.field991 == var2.field986) {
                            var2.method591();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method116(int arg0) {
        this.field144.method212(2);
        class8.field625 = this.field328;
        this.field150.method428(3, 0, 0);
        if (this.field240) {
            this.field501.method237(40, 0, this.field213, true, 239);
            this.field501.method237(60, 128, this.field146 + "*", true, 239);
        } else if (this.field476 == 1) {
            this.field501.method237(40, 0, "Enter amount:", true, 239);
            this.field501.method237(60, 128, this.field574 + "*", true, 239);
        } else if (this.field476 == 2) {
            this.field501.method237(40, 0, "Enter name:", true, 239);
            this.field501.method237(60, 128, this.field574 + "*", true, 239);
        } else if (this.field275 != null) {
            this.field501.method237(40, 0, this.field275, true, 239);
            this.field501.method237(60, 128, "Click to continue", true, 239);
        } else if (this.field350 != -1) {
            this.method45(7, 0, 0, class9.field645[this.field350], 0);
        } else if (this.field139 != -1) {
            this.method45(7, 0, 0, class9.field645[this.field139], 0);
        } else {
            class23 var2 = this.field500;
            int var3 = 0;
            class29.method266(0, 0, (byte) -109, 463, 77);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field300[var4] != null) {
                    int var6 = this.field298[var4];
                    int var7 = 70 - var3 * 14 + this.field316;
                    String var8 = this.field299[var4];
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
                            var2.method241(0, this.field300[var4], 3, var7, 4);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field162 == 0 || this.field162 == 1 && this.method123(765, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field273[0].method428(3, var7 - 12, var10);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field273[1].method428(3, var7 - 12, var10);
                                var10 += 14;
                            }
                            var2.method241(0, var8 + ":", 3, var7, var10);
                            int var11 = var10 + var2.method239(false, var8) + 8;
                            var2.method241(255, this.field300[var4], 3, var7, var11);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field551 == 0 && (var6 == 7 || this.field421 == 0 || this.field421 == 1 && this.method123(765, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method241(0, "From", 3, var7, var12);
                            int var13 = var12 + var2.method239(false, "From ");
                            if (var9 == 1) {
                                this.field273[0].method428(3, var7 - 12, var13);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field273[1].method428(3, var7 - 12, var13);
                                var13 += 14;
                            }
                            var2.method241(0, var8 + ":", 3, var7, var13);
                            int var14 = var13 + var2.method239(false, var8) + 8;
                            var2.method241(8388608, this.field300[var4], 3, var7, var14);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field253 == 0 || this.field253 == 1 && this.method123(765, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method241(8388736, var8 + " " + this.field300[var4], 3, var7, 4);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field551 == 0 && this.field421 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method241(8388608, this.field300[var4], 3, var7, 4);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field551 == 0 && this.field421 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method241(0, "To " + var8 + ":", 3, var7, 4);
                            var2.method241(8388608, this.field300[var4], 3, var7, 12 + var2.method239(false, "To " + var8));
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field253 == 0 || this.field253 == 1 && this.method123(765, var8))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method241(8270336, var8 + " " + this.field300[var4], 3, var7, 4);
                        }
                        ++var3;
                    }
                }
            }
            class29.method265((byte) 88);
            this.field445 = var3 * 14 + 7;
            if (this.field445 < 78) {
                this.field445 = 78;
            }
            this.method87(-337, this.field445, 0, 463, this.field445 - this.field316 - 77, 77);
            String var5;
            if (field446 != null && field446.field1271 != null) {
                var5 = field446.field1271;
            } else {
                var5 = class26.method257(0, this.field478);
            }
            var2.method241(0, var5 + ":", 3, 90, 4);
            var2.method241(255, this.field533 + "*", 3, 90, 6 + var2.method239(false, var5 + ": "));
            class29.method272(0, -399, 479, 0, 77);
        }
        if (this.field211 && this.field370 == 2) {
            this.method126(false);
        }
        this.field144.method213(9, 17, super.field917, 357);
        this.field143.method212(2);
        class8.field625 = this.field330;
        if (this.field287 != arg0) {
            this.method173();
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method117(boolean arg0) {
        this.field535 &= arg0;
        if (this.field345 == 0) {
            if (super.field931 == 1) {
                int var2 = super.field932 - 25 - 550;
                int var3 = super.field933 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field341 + this.field314 & 2047;
                    int var5 = class8.field623[var4];
                    int var6 = class8.field624[var4];
                    int var7 = (this.field134 + 256) * var5 >> 8;
                    int var8 = (this.field134 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field446.field1233 + var9 >> 7;
                    int var12 = field446.field1234 - var10 >> 7;
                    boolean var13 = this.method90(var12, true, field446.field1251[0], true, 0, var11, 0, 0, 0, 1, field446.field1250[0], 0);
                    if (var13) {
                        this.field552.method537(var2);
                        this.field552.method537(var3);
                        this.field552.method538(this.field341);
                        this.field552.method537(57);
                        this.field552.method537(this.field314);
                        this.field552.method537(this.field134);
                        this.field552.method537(89);
                        this.field552.method538(field446.field1233);
                        this.field552.method538(field446.field1234);
                        this.field552.method537(this.field288);
                        this.field552.method537(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)Ljava/lang/String;")
    private static final String method118(int arg0, boolean arg1) {
        if (arg1) {
            field525 = !field525;
        }
        String var2 = String.valueOf(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method119(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (field392 && this.field312 == 2 && class63.field1605 != this.field210) {
            this.field143.method212(2);
            this.field500.method237(151, 0, "Loading - please wait.", true, 257);
            this.field500.method237(150, 16777215, "Loading - please wait.", true, 256);
            this.field143.method213(9, 4, super.field917, 4);
            this.field312 = 1;
            this.field394 = System.currentTimeMillis();
        }
        if (this.field312 == 1) {
            int var4 = this.method120((byte) 29);
            if (var4 != 0 && System.currentTimeMillis() - this.field394 > 360000L) {
                signlink.reporterror(this.field478 + " glcfb " + this.field233 + "," + var4 + "," + field392 + "," + this.field456[0] + "," + this.field486.method405() + "," + this.field210 + "," + this.field241 + "," + this.field242);
                this.field394 = System.currentTimeMillis();
            }
        }
        if (this.field312 == 2 && this.field236 != this.field210) {
            this.field236 = this.field210;
            this.method73(this.field210, 0);
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)I")
    public final int method120(byte arg0) {
        for (int var2 = 0; var2 < this.field289.length; ++var2) {
            if (this.field289[var2] == null && this.field279[var2] != -1) {
                return -1;
            }
            if (this.field179[var2] == null && this.field280[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field289.length; ++var4) {
            byte[] var5 = this.field179[var4];
            if (var5 != null) {
                int var6 = (this.field278[var4] >> 8) * 64 - this.field185;
                int var7 = (this.field278[var4] & 255) * 64 - this.field186;
                if (this.field571) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class63.method508(var7, var5, var6, 6);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field297) {
            return -4;
        } else {
            this.field312 = 2;
            class63.field1605 = this.field210;
            if (arg0 != 29) {
                field503 = -243;
            }
            this.method135(true);
            this.field552.method536(116, true);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILLXRBRCRX;I)V")
    public final void method121(int arg0, int arg1, class30 arg2, int arg3) {
        int var5 = arg0 * arg0 + arg1 * arg1;
        int var6 = 63 / arg3;
        if (var5 > 4225 && var5 < 90000) {
            int var7 = this.field341 + this.field314 & 2047;
            int var8 = class4.field96[var7];
            int var9 = class4.field97[var7];
            int var10 = var8 * 256 / (this.field134 + 256);
            int var11 = var9 * 256 / (this.field134 + 256);
            int var12 = arg0 * var11 + arg1 * var10 >> 16;
            int var13 = arg1 * var11 - arg0 * var10 >> 16;
            double var14 = Math.atan2((double) var12, (double) var13);
            int var16 = (int) (Math.sin(var14) * 63.0D);
            int var17 = (int) (Math.cos(var14) * 57.0D);
            this.field222.method286(var14, 0, 256, var16 + 94 + 4 - 10, 83 - var17 - 20, 15, 15, 20, 20);
        } else {
            this.method57(arg1, arg2, 121, arg0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LCPNGZAUN;B)Z")
    public final boolean method122(class9 arg0, byte arg1) {
        if (arg0.field668 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field668.length; ++var3) {
                int var4 = this.method178(true, arg0, var3);
                int var5 = arg0.field640[var3];
                if (arg0.field668[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field668[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field668[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (arg1 != 3) {
                this.field572 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method123(int arg0, String arg1) {
        int var3 = 82 / arg0;
        if (arg1 == null) {
            return false;
        } else {
            for (int var4 = 0; var4 < this.field424; ++var4) {
                if (arg1.equalsIgnoreCase(this.field379[var4])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(field446.field1271);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method124(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method124(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method125(byte arg0) {
        if (this.field484 >= 2 || this.field519 != 0 || this.field308 != 0) {
            if (arg0 == 5) {
                boolean var2 = false;
            } else {
                this.field572 = null;
            }
            String var3;
            if (this.field519 == 1 && this.field484 < 2) {
                var3 = "Use " + this.field523 + " with...";
            } else if (this.field308 == 1 && this.field484 < 2) {
                var3 = this.field311 + "...";
            } else {
                var3 = this.field450[this.field484 - 1];
            }
            if (this.field484 > 2) {
                var3 = var3 + "@whi@ / " + (this.field484 - 2) + " more options";
            }
            this.field501.method246(-19642, 4, 16777215, true, 15, var3, field441 / 1000);
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method126(boolean arg0) {
        int var2 = this.field371;
        int var3 = this.field372;
        int var4 = this.field373;
        int var5 = this.field374;
        int var6 = 6116423;
        class29.method269(var6, var4, var5, var3, var2, -48531);
        class29.method269(0, var4 - 2, 16, var3 + 1, var2 + 1, -48531);
        class29.method270(var3 + 18, true, var5 - 19, var4 - 2, var2 + 1, 0);
        this.field501.method241(var6, "Choose Option", 3, var3 + 14, var2 + 3);
        if (arg0) {
            this.field552.method537(16);
        }
        int var7 = super.field925;
        int var8 = super.field926;
        if (this.field370 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field370 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field370 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field484; ++var9) {
            int var10 = (this.field484 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field501.method245(var2 + 3, -224, this.field450[var9], true, var10, var11);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILOVZHBYZU;)V")
    public final void method127(int arg0, int arg1, class38 arg2) {
        this.method128(arg2.field1234, arg0, arg2.field1233, this.field334);
        this.field457 += arg1;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIZ)V")
    public final void method128(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
            int var5 = this.method151(this.field210, false, arg0, arg2) - arg1;
            int var6 = arg2 - this.field195;
            int var7 = var5 - this.field196;
            if (!arg3) {
                this.field458 = this.field292.method547();
            }
            int var8 = arg0 - this.field197;
            int var9 = class4.field96[this.field198];
            int var10 = class4.field97[this.field198];
            int var11 = class4.field96[this.field199];
            int var12 = class4.field97[this.field199];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field454 = (var13 << 9) / var17 + class8.field619;
                this.field455 = (var16 << 9) / var17 + class8.field620;
            } else {
                this.field454 = -1;
                this.field455 = -1;
            }
        } else {
            this.field454 = -1;
            this.field455 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 328);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field389 = Integer.parseInt(arg0[0]);
                field390 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method149(0);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method158(false);
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
                var1.method231(-19353, 765, 503);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LZOMNSJJM;II)V")
    public final void method129(class69 arg0, int arg1, int arg2) {
        if (this.field386 == arg2) {
            if (arg1 == 235) {
                int var4 = arg0.method566(1474);
                int var5 = (var4 >> 4 & 7) + this.field218;
                int var6 = (var4 & 7) + this.field219;
                int var7 = arg0.method547();
                int var8 = var7 >> 2;
                int var9 = var7 & 3;
                int var10 = this.field537[var8];
                if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                    this.method156(var9, var5, var8, var6, -1, this.field210, 0, var10, (byte) 8, -1);
                }
            } else if (arg1 == 93) {
                int var11 = arg0.method567(3);
                int var12 = (var11 >> 4 & 7) + this.field218;
                int var13 = (var11 & 7) + this.field219;
                int var14 = arg0.method549();
                int var15 = arg0.method573(7);
                int var16 = arg0.method575(263);
                if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104 && this.field514 != var14) {
                    class25 var17 = new class25();
                    var17.field972 = var16;
                    var17.field971 = var15;
                    if (this.field572[this.field210][var12][var13] == null) {
                        this.field572[this.field210][var12][var13] = new class66(-41036);
                    }
                    this.field572[this.field210][var12][var13].method520(var17);
                    this.method177(var12, var13);
                }
            } else if (arg1 == 45) {
                int var18 = arg0.method573(7);
                int var19 = arg0.method566(1474);
                int var20 = (var19 >> 4 & 7) + this.field218;
                int var21 = (var19 & 7) + this.field219;
                int var22 = arg0.method575(263);
                if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                    class25 var23 = new class25();
                    var23.field972 = var18;
                    var23.field971 = var22;
                    if (this.field572[this.field210][var20][var21] == null) {
                        this.field572[this.field210][var20][var21] = new class66(-41036);
                    }
                    this.field572[this.field210][var20][var21].method520(var23);
                    this.method177(var20, var21);
                }
            } else if (arg1 == 54) {
                int var24 = arg0.method547();
                int var25 = (var24 >> 4 & 7) + this.field218;
                int var26 = (var24 & 7) + this.field219;
                int var27 = arg0.method549();
                int var28 = arg0.method549();
                int var29 = arg0.method549();
                if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                    class66 var30 = this.field572[this.field210][var25][var26];
                    if (var30 != null) {
                        for (class25 var31 = (class25) var30.method523(); var31 != null; var31 = (class25) var30.method525(-687)) {
                            if ((var27 & 32767) == var31.field972 && var31.field971 == var28) {
                                var31.field971 = var29;
                                break;
                            }
                        }
                        this.method177(var25, var26);
                    }
                }
            } else if (arg1 == 80) {
                int var32 = arg0.method565(38);
                int var33 = var32 >> 2;
                int var34 = var32 & 3;
                int var35 = this.field537[var33];
                int var36 = arg0.method549();
                int var37 = arg0.method565(38);
                int var38 = (var37 >> 4 & 7) + this.field218;
                int var39 = (var37 & 7) + this.field219;
                if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                    this.method156(var34, var38, var33, var39, -1, this.field210, 0, var35, (byte) 8, var36);
                }
            } else if (arg1 == 89) {
                int var40 = arg0.method547();
                int var41 = (var40 >> 4 & 7) + this.field218;
                int var42 = (var40 & 7) + this.field219;
                int var43 = arg0.method549();
                int var44 = arg0.method547();
                int var45 = arg0.method549();
                if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                    int var46 = var41 * 128 + 64;
                    int var47 = var42 * 128 + 64;
                    class61 var48 = new class61(this.field210, var43, var46, var45, this.method151(this.field210, false, var47, var46) - var44, -11, var47, field441);
                    this.field290.method520(var48);
                }
            } else if (arg1 == 248) {
                int var49 = arg0.method565(38);
                int var50 = (var49 >> 4 & 7) + this.field218;
                int var51 = (var49 & 7) + this.field219;
                int var52 = arg0.method573(7);
                if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                    class66 var53 = this.field572[this.field210][var50][var51];
                    if (var53 != null) {
                        for (class25 var54 = (class25) var53.method523(); var54 != null; var54 = (class25) var53.method525(-687)) {
                            if ((var52 & 32767) == var54.field972) {
                                var54.method591();
                                break;
                            }
                        }
                        if (var53.method523() == null) {
                            this.field572[this.field210][var50][var51] = null;
                        }
                        this.method177(var50, var51);
                    }
                }
            } else {
                if (arg1 == 143) {
                    int var55 = arg0.method547();
                    int var56 = (var55 >> 4 & 7) + this.field218;
                    int var57 = (var55 & 7) + this.field219;
                    int var58 = arg0.method549();
                    int var59 = arg0.method547();
                    int var60 = var59 >> 4 & 15;
                    int var61 = var59 & 7;
                    if (field446.field1250[0] >= var56 - var60 && field446.field1250[0] <= var56 + var60 && field446.field1251[0] >= var57 - var60 && field446.field1251[0] <= var57 + var60 && this.field508 && !field392 && this.field435 < 50) {
                        this.field255[this.field435] = var58;
                        this.field177[this.field435] = var61;
                        this.field158[this.field435] = class55.field1489[var58];
                        ++this.field435;
                    }
                }
                if (arg1 == 201) {
                    int var62 = arg0.method566(1474);
                    int var63 = (var62 >> 4 & 7) + this.field218;
                    int var64 = (var62 & 7) + this.field219;
                    int var65 = arg0.method549();
                    int var66 = arg0.method547();
                    int var67 = var66 >> 2;
                    int var68 = var66 & 3;
                    int var69 = this.field537[var67];
                    if (var63 >= 0 && var64 >= 0 && var63 < 103 && var64 < 103) {
                        int var70 = this.field161[this.field210][var63][var64];
                        int var71 = this.field161[this.field210][var63 + 1][var64];
                        int var72 = this.field161[this.field210][var63 + 1][var64 + 1];
                        int var73 = this.field161[this.field210][var63][var64 + 1];
                        if (var69 == 0) {
                            class37 var74 = this.field543.method314(this.field210, -6281, var64, var63);
                            if (var74 != null) {
                                int var75 = var74.field1195 >> 14 & 32767;
                                if (var67 == 2) {
                                    var74.field1193 = new class24(var65, false, var75, 2, var71, var73, (byte) -120, var72, var70, var68 + 4);
                                    var74.field1194 = new class24(var65, false, var75, 2, var71, var73, (byte) -120, var72, var70, var68 + 1 & 3);
                                } else {
                                    var74.field1193 = new class24(var65, false, var75, var67, var71, var73, (byte) -120, var72, var70, var68);
                                }
                            }
                        }
                        if (var69 == 1) {
                            class58 var76 = this.field543.method315(var64, this.field210, var63, (byte) 1);
                            if (var76 != null) {
                                var76.field1532 = new class24(var65, false, var76.field1533 >> 14 & 32767, 4, var71, var73, (byte) -120, var72, var70, 0);
                            }
                        }
                        if (var69 == 2) {
                            class53 var77 = this.field543.method316(8, var63, var64, this.field210);
                            if (var67 == 11) {
                                var67 = 10;
                            }
                            if (var77 != null) {
                                var77.field1471 = new class24(var65, false, var77.field1479 >> 14 & 32767, var67, var71, var73, (byte) -120, var72, var70, var68);
                            }
                        }
                        if (var69 == 3) {
                            class57 var78 = this.field543.method317((byte) 7, this.field210, var63, var64);
                            if (var78 != null) {
                                var78.field1524 = new class24(var65, false, var78.field1525 >> 14 & 32767, 22, var71, var73, (byte) -120, var72, var70, var68);
                            }
                        }
                    }
                } else if (arg1 == 81) {
                    int var79 = arg0.method547();
                    int var80 = (var79 >> 4 & 7) + this.field218;
                    int var81 = (var79 & 7) + this.field219;
                    int var82 = var80 + arg0.method548();
                    int var83 = var81 + arg0.method548();
                    int var84 = arg0.method550();
                    int var85 = arg0.method549();
                    int var86 = arg0.method547() * 4;
                    int var87 = arg0.method547() * 4;
                    int var88 = arg0.method549();
                    int var89 = arg0.method549();
                    int var90 = arg0.method547();
                    int var91 = arg0.method547();
                    if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104 && var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104 && var85 != 65535) {
                        int var92 = var80 * 128 + 64;
                        int var93 = var81 * 128 + 64;
                        int var94 = var82 * 128 + 64;
                        int var95 = var83 * 128 + 64;
                        class7 var96 = new class7(this.method151(this.field210, false, var93, var92) - var86, var90, this.field210, field441 + var88, var93, var92, field441 + var89, var91, var87, var84, var85, (byte) -5);
                        var96.method182(var95, this.method151(this.field210, false, var95, var94) - var87, var94, field441 + var88, (byte) -56);
                        this.field414.method520(var96);
                    }
                } else {
                    if (arg1 == 92) {
                        byte var97 = arg0.method569(false);
                        int var98 = arg0.method549();
                        int var99 = arg0.method574((byte) 3);
                        int var100 = arg0.method547();
                        int var101 = (var100 >> 4 & 7) + this.field218;
                        int var102 = (var100 & 7) + this.field219;
                        int var103 = arg0.method575(263);
                        int var104 = arg0.method574((byte) 3);
                        byte var105 = arg0.method568(false);
                        int var106 = arg0.method566(1474);
                        int var107 = var106 >> 2;
                        int var108 = var106 & 3;
                        int var109 = this.field537[var107];
                        byte var110 = arg0.method548();
                        byte var111 = arg0.method568(false);
                        class39 var112;
                        if (this.field514 == var99) {
                            var112 = field446;
                        } else {
                            var112 = this.field491[var99];
                        }
                        if (var112 != null) {
                            class33 var113 = class33.method350(var104);
                            int var114 = this.field161[this.field210][var101][var102];
                            int var115 = this.field161[this.field210][var101 + 1][var102];
                            int var116 = this.field161[this.field210][var101 + 1][var102 + 1];
                            int var117 = this.field161[this.field210][var101][var102 + 1];
                            class4 var118 = var113.method344(var107, var108, var114, var115, var116, var117, -1);
                            if (var118 != null) {
                                this.method156(0, var101, 0, var102, var103 + 1, this.field210, var98 + 1, var109, (byte) 8, -1);
                                var112.field1272 = field441 + var98;
                                var112.field1273 = field441 + var103;
                                var112.field1264 = var118;
                                int var119 = var113.field1116;
                                int var120 = var113.field1136;
                                if (var108 == 1 || var108 == 3) {
                                    var119 = var113.field1136;
                                    var120 = var113.field1116;
                                }
                                var112.field1261 = var101 * 128 + var119 * 64;
                                var112.field1263 = var102 * 128 + var120 * 64;
                                var112.field1262 = this.method151(this.field210, false, var112.field1263, var112.field1261);
                                if (var111 > var110) {
                                    byte var121 = var111;
                                    var111 = var110;
                                    var110 = var121;
                                }
                                if (var105 > var97) {
                                    byte var122 = var105;
                                    var105 = var97;
                                    var97 = var122;
                                }
                                var112.field1256 = var101 + var111;
                                var112.field1258 = var101 + var110;
                                var112.field1257 = var102 + var105;
                                var112.field1259 = var97 + var102;
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)Z")
    public final boolean method130(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 14 & 32767;
        int var6 = this.field543.method322(this.field210, arg2, arg0, arg3);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            ++field344;
            if (field344 > 1496) {
                field344 = 0;
                this.field552.method536(148, true);
                this.field552.method537(0);
                int var9 = this.field552.field1700;
                this.field552.method538(28830);
                this.field552.method538(29704);
                this.field552.method538((int) (Math.random() * 65536.0D));
                this.field552.method537(8);
                this.field552.method538((int) (Math.random() * 65536.0D));
                this.field552.method538(48228);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field552.method537(63);
                }
                this.field552.method538((int) (Math.random() * 65536.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field552.method537(132);
                }
                this.field552.method538(12470);
                this.field552.method546(true, this.field552.field1700 - var9);
            }
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method90(arg0, false, field446.field1251[0], true, var7 + 1, arg2, var8, 0, 0, 2, field446.field1250[0], 0);
            } else {
                class33 var10 = class33.method350(var5);
                int var11;
                int var12;
                if (var8 != 0 && var8 != 2) {
                    var11 = var10.field1136;
                    var12 = var10.field1116;
                } else {
                    var11 = var10.field1116;
                    var12 = var10.field1136;
                }
                int var13 = var10.field1120;
                if (var8 != 0) {
                    var13 = (var13 >> 4 - var8) + (var13 << var8 & 15);
                }
                this.method90(arg0, false, field446.field1251[0], true, 0, arg2, 0, var12, var11, 2, field446.field1250[0], var13);
            }
            this.field577 = super.field932;
            this.field578 = super.field933;
            this.field580 = 2;
            this.field579 = 0;
            while (arg1 >= 0) {
                this.field458 = -1;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)V")
    public final void method131(byte arg0, int arg1, String arg2, String arg3) {
        if (arg0 == 5) {
            boolean var5 = false;
        } else {
            this.field147 = 320;
        }
        if (arg1 == 0 && this.field139 != -1) {
            this.field275 = arg3;
            super.field931 = 0;
        }
        if (this.field350 == -1) {
            this.field252 = true;
        }
        for (int var6 = 99; var6 > 0; --var6) {
            this.field298[var6] = this.field298[var6 - 1];
            this.field299[var6] = this.field299[var6 - 1];
            this.field300[var6] = this.field300[var6 - 1];
        }
        this.field298[0] = arg1;
        this.field299[0] = arg2;
        this.field300[0] = arg3;
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)I")
    public final int method132(boolean arg0) {
        this.field535 &= arg0;
        int var2 = 3;
        if (this.field198 < 310) {
            int var3 = this.field195 >> 7;
            int var4 = this.field197 >> 7;
            int var5 = field446.field1233 >> 7;
            int var6 = field446.field1234 >> 7;
            if ((this.field549[this.field210][var3][var4] & 4) != 0) {
                var2 = this.field210;
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
                    if ((this.field549[this.field210][var3][var4] & 4) != 0) {
                        var2 = this.field210;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field549[this.field210][var3][var4] & 4) != 0) {
                            var2 = this.field210;
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
                    if ((this.field549[this.field210][var3][var4] & 4) != 0) {
                        var2 = this.field210;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field549[this.field210][var3][var4] & 4) != 0) {
                            var2 = this.field210;
                        }
                    }
                }
            }
        }
        if ((this.field549[this.field210][field446.field1233 >> 7][field446.field1234 >> 7] & 4) != 0) {
            var2 = this.field210;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)I")
    public final int method133(int arg0) {
        if (arg0 != 5) {
            return 3;
        } else {
            int var2 = this.method151(this.field210, false, this.field197, this.field195);
            return var2 - this.field196 < 800 && (this.field549[this.field210][this.field195 >> 7][this.field197 >> 7] & 4) != 0 ? this.field210 : 3;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method134(byte arg0) {
        byte[] var2 = this.field122.method290("title.dat", (byte[]) null);
        class30 var3 = new class30(var2, this);
        this.field320.method212(2);
        var3.method279(0, 607, 0);
        this.field321.method212(2);
        var3.method279(-637, 607, 0);
        this.field317.method212(2);
        var3.method279(-128, 607, 0);
        if (arg0 != -120) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        this.field318.method212(2);
        var3.method279(-202, 607, -371);
        this.field319.method212(2);
        var3.method279(-202, 607, -171);
        this.field322.method212(2);
        var3.method279(0, 607, -265);
        this.field323.method212(2);
        var3.method279(-562, 607, -265);
        this.field324.method212(2);
        var3.method279(-128, 607, -171);
        this.field325.method212(2);
        var3.method279(-562, 607, -171);
        int[] var5 = new int[var3.field1025];
        for (int var6 = 0; var6 < var3.field1026; ++var6) {
            for (int var11 = 0; var11 < var3.field1025; ++var11) {
                var5[var11] = var3.field1024[var3.field1025 * var6 + (var3.field1025 - var11 - 1)];
            }
            for (int var12 = 0; var12 < var3.field1025; ++var12) {
                var3.field1024[var3.field1025 * var6 + var12] = var5[var12];
            }
        }
        this.field320.method212(2);
        var3.method279(382, 607, 0);
        this.field321.method212(2);
        var3.method279(-255, 607, 0);
        this.field317.method212(2);
        var3.method279(254, 607, 0);
        this.field318.method212(2);
        var3.method279(180, 607, -371);
        this.field319.method212(2);
        var3.method279(180, 607, -171);
        this.field322.method212(2);
        var3.method279(382, 607, -265);
        this.field323.method212(2);
        var3.method279(-180, 607, -265);
        this.field324.method212(2);
        var3.method279(254, 607, -171);
        this.field325.method212(2);
        var3.method279(-180, 607, -171);
        class30 var7 = new class30(this.field122, "logo", 0);
        this.field317.method212(2);
        var7.method281(3, 18, 382 - var7.field1025 / 2 - 128);
        Object var8 = null;
        Object var9 = null;
        Object var10 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method135(boolean arg0) {
        this.field535 &= arg0;
        try {
            this.field236 = -1;
            this.field290.method527();
            this.field414.method527();
            class8.method186((byte) 8);
            this.method51(this.field108);
            this.field543.method292(-49777);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field306[var2].method354();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field549[var3][var4][var5] = 0;
                    }
                }
            }
            class63 var6 = new class63(104, this.field161, this.field549, 104, (byte) 4);
            int var7 = this.field289.length;
            this.field552.method536(200, true);
            if (!this.field571) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field278[var8] >> 8) * 64 - this.field185;
                    int var10 = (this.field278[var8] & 255) * 64 - this.field186;
                    byte[] var11 = this.field289[var8];
                    if (var11 != null) {
                        var6.method510(var9, this.field306, (this.field242 - 6) * 8, (this.field241 - 6) * 8, 33722, var10, var11);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field278[var12] >> 8) * 64 - this.field185;
                    int var14 = (this.field278[var12] & 255) * 64 - this.field186;
                    byte[] var15 = this.field289[var12];
                    if (var15 == null && this.field242 < 800) {
                        var6.method507(var14, var13, 64, 64, true);
                    }
                }
                this.field552.method536(200, true);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field179[var16];
                    if (var17 != null) {
                        int var18 = (this.field278[var16] >> 8) * 64 - this.field185;
                        int var19 = (this.field278[var16] & 255) * 64 - this.field186;
                        var6.method506(var19, var18, this.field543, 856, var17, this.field306);
                    }
                }
            }
            if (this.field571) {
                int var20 = 0;
                label249: while (true) {
                    if (var20 >= 4) {
                        for (int var30 = 0; var30 < 13; ++var30) {
                            for (int var31 = 0; var31 < 13; ++var31) {
                                int var32 = this.field107[0][var30][var31];
                                if (var32 == -1) {
                                    var6.method507(var31 * 8, var30 * 8, 8, 8, true);
                                }
                            }
                        }
                        this.field552.method536(200, true);
                        int var33 = 0;
                        while (true) {
                            if (var33 >= 4) {
                                break label249;
                            }
                            for (int var34 = 0; var34 < 13; ++var34) {
                                for (int var35 = 0; var35 < 13; ++var35) {
                                    int var36 = this.field107[var33][var34][var35];
                                    if (var36 != -1) {
                                        int var37 = var36 >> 24 & 3;
                                        int var38 = var36 >> 1 & 3;
                                        int var39 = var36 >> 14 & 1023;
                                        int var40 = var36 >> 3 & 2047;
                                        int var41 = (var39 / 8 << 8) + var40 / 8;
                                        for (int var42 = 0; var42 < this.field278.length; ++var42) {
                                            if (this.field278[var42] == var41 && this.field179[var42] != null) {
                                                var6.method512(this.field306, (var39 & 7) * 8, var35 * 8, this.field543, var33, var38, true, (var40 & 7) * 8, var34 * 8, var37, this.field179[var42]);
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
                            int var23 = this.field107[var20][var21][var22];
                            if (var23 != -1) {
                                int var24 = var23 >> 24 & 3;
                                int var25 = var23 >> 1 & 3;
                                int var26 = var23 >> 14 & 1023;
                                int var27 = var23 >> 3 & 2047;
                                int var28 = (var26 / 8 << 8) + var27 / 8;
                                for (int var29 = 0; var29 < this.field278.length; ++var29) {
                                    if (this.field278[var29] == var28 && this.field289[var29] != null) {
                                        var6.method515((var27 & 7) * 8, var22 * 8, var21 * 8, (var26 & 7) * 8, var25, var20, var24, this.field289[var29], this.field306, -46155);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field552.method536(200, true);
            var6.method497(this.field543, false, this.field306);
            this.field143.method212(2);
            this.field552.method536(200, true);
            int var43 = class63.field1600;
            if (var43 > this.field210) {
                var43 = this.field210;
            }
            if (var43 < this.field210 - 1) {
                int var44 = this.field210 - 1;
            }
            if (field392) {
                this.field543.method293((byte) 9, class63.field1600);
            } else {
                this.field543.method293((byte) 9, 0);
            }
            for (int var45 = 0; var45 < 104; ++var45) {
                for (int var46 = 0; var46 < 104; ++var46) {
                    this.method177(var45, var46);
                }
            }
            ++field235;
            if (field235 > 63) {
                field235 = 0;
                this.field552.method536(151, true);
            }
            this.method38(-13725);
        } catch (Exception var59) {
        }
        class33.field1158.method230();
        if (super.field920 != null) {
            this.field552.method536(207, true);
            this.field552.method541(1057001181);
        }
        if (field392 && signlink.cache_dat != null) {
            int var48 = this.field486.method402(179, 0);
            for (int var49 = 0; var49 < var48; ++var49) {
                int var50 = this.field486.method395(true, var49);
                if ((var50 & 121) == 0) {
                    class4.method10(var49, 804);
                }
            }
        }
        System.gc();
        class8.method187(20, 590);
        this.field486.method393(false);
        int var51 = (this.field241 - 6) / 8 - 1;
        int var52 = (this.field241 + 6) / 8 + 1;
        int var53 = (this.field242 - 6) / 8 - 1;
        int var54 = (this.field242 + 6) / 8 + 1;
        if (this.field339) {
            var51 = 49;
            var52 = 50;
            var53 = 49;
            var54 = 50;
        }
        for (int var55 = var51; var55 <= var52; ++var55) {
            for (int var56 = var53; var56 <= var54; ++var56) {
                if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
                    int var57 = this.field486.method388(0, 5, var55, var56);
                    if (var57 != -1) {
                        this.field486.method390(var57, 3, 7);
                    }
                    int var58 = this.field486.method388(1, 5, var55, var56);
                    if (var58 != -1) {
                        this.field486.method390(var58, 3, 7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLCPNGZAUN;)Z")
    public final boolean method136(boolean arg0, class9 arg1) {
        if (arg0) {
            throw new NullPointerException();
        } else {
            int var3 = arg1.field677;
            if (this.field425 == 2) {
                if (var3 == 201) {
                    this.field252 = true;
                    this.field476 = 0;
                    this.field240 = true;
                    this.field146 = "";
                    this.field206 = 1;
                    this.field213 = "Enter name of friend to add to list";
                }
                if (var3 == 202) {
                    this.field252 = true;
                    this.field476 = 0;
                    this.field240 = true;
                    this.field146 = "";
                    this.field206 = 2;
                    this.field213 = "Enter name of friend to delete from list";
                }
            }
            if (var3 == 205) {
                this.field461 = 250;
                return true;
            } else {
                if (var3 == 501) {
                    this.field252 = true;
                    this.field476 = 0;
                    this.field240 = true;
                    this.field146 = "";
                    this.field206 = 4;
                    this.field213 = "Enter name of player to add to list";
                }
                if (var3 == 502) {
                    this.field252 = true;
                    this.field476 = 0;
                    this.field240 = true;
                    this.field146 = "";
                    this.field206 = 5;
                    this.field213 = "Enter name of player to delete from list";
                }
                if (var3 >= 300 && var3 <= 313) {
                    int var4 = (var3 - 300) / 2;
                    int var5 = var3 & 1;
                    int var6 = this.field294[var4];
                    if (var6 != -1) {
                        while (true) {
                            if (var5 == 0) {
                                --var6;
                                if (var6 < 0) {
                                    var6 = class17.field843 - 1;
                                }
                            }
                            if (var5 == 1) {
                                ++var6;
                                if (var6 >= class17.field843) {
                                    var6 = 0;
                                }
                            }
                            if (!class17.field844[var6].field850 && class17.field844[var6].field845 == var4 + (this.field474 ? 0 : 7)) {
                                this.field294[var4] = var6;
                                this.field402 = true;
                                break;
                            }
                        }
                    }
                }
                if (var3 >= 314 && var3 <= 323) {
                    int var7 = (var3 - 314) / 2;
                    int var8 = var3 & 1;
                    int var9 = this.field566[var7];
                    if (var8 == 0) {
                        --var9;
                        if (var9 < 0) {
                            var9 = field230[var7].length - 1;
                        }
                    }
                    if (var8 == 1) {
                        ++var9;
                        if (var9 >= field230[var7].length) {
                            var9 = 0;
                        }
                    }
                    this.field566[var7] = var9;
                    this.field402 = true;
                }
                if (var3 == 324 && !this.field474) {
                    this.field474 = true;
                    this.method154((byte) 6);
                }
                if (var3 == 325 && this.field474) {
                    this.field474 = false;
                    this.method154((byte) 6);
                }
                if (var3 != 326) {
                    if (var3 == 613) {
                        this.field276 = !this.field276;
                    }
                    if (var3 >= 601 && var3 <= 612) {
                        this.method146(true);
                        if (this.field346.length() > 0) {
                            this.field552.method536(216, true);
                            this.field552.method543(class26.method253(this.field346), (byte) 5);
                            this.field552.method537(var3 - 601);
                            this.field552.method537(this.field276 ? 1 : 0);
                        }
                    }
                    return false;
                } else {
                    this.field552.method536(91, true);
                    this.field552.method537(this.field474 ? 0 : 1);
                    for (int var10 = 0; var10 < 7; ++var10) {
                        this.field552.method537(this.field294[var10]);
                    }
                    for (int var11 = 0; var11 < 5; ++var11) {
                        this.field552.method537(this.field566[var11]);
                    }
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BZZ)V")
    public final void method137(byte[] arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            this.field153 = this.field560.method585();
        }
        if (this.field349) {
            signlink.midifade = arg1 ? 1 : 0;
            signlink.midisave(arg0, arg0.length);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LTAIXVIBM;Z)V")
    public final void method138(class47 arg0, boolean arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field137.length; ++var4) {
            this.field137[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field137[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field138[var16] = (this.field137[var16 - 1] + this.field137[var16 + 1] + this.field137[var16 - 128] + this.field137[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field137;
            this.field137 = this.field138;
            this.field138 = var14;
        }
        if (arg1) {
            field109 = this.field560.method585();
        }
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field1435; ++var8) {
                for (int var9 = 0; var9 < arg0.field1434; ++var9) {
                    if (arg0.field1432[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field1436;
                        int var11 = var8 + 16 + arg0.field1437;
                        int var12 = (var11 << 7) + var10;
                        this.field137[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILZOMNSJJM;)V")
    private final void method139(int arg0, int arg1, class69 arg2) {
        for (int var4 = 0; var4 < this.field494; ++var4) {
            int var5 = this.field495[var4];
            class39 var6 = this.field491[var5];
            int var7 = arg2.method547();
            if ((var7 & 1) != 0) {
                var7 += arg2.method547() << 8;
            }
            this.method97(var6, var7, arg2, false, var5);
        }
        if (arg1 == -31498) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)Z")
    public final boolean method140(int arg0) {
        if (arg0 != -27638) {
            field428 = -170;
        }
        if (this.field212 == null) {
            return false;
        } else {
            try {
                int var2 = this.field212.method3();
                if (var2 == 0) {
                    return false;
                }
                if (this.field458 == -1) {
                    this.field212.method4(this.field292.field1699, 0, 1);
                    this.field458 = this.field292.field1699[0] & 255;
                    if (this.field560 != null) {
                        this.field458 = this.field458 - this.field560.method585() & 255;
                    }
                    this.field457 = class1.field2[this.field458];
                    --var2;
                }
                if (this.field457 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field212.method4(this.field292.field1699, 0, 1);
                    this.field457 = this.field292.field1699[0] & 255;
                    --var2;
                }
                if (this.field457 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field212.method4(this.field292.field1699, 0, 2);
                    this.field292.field1700 = 0;
                    this.field457 = this.field292.method549();
                    var2 -= 2;
                }
                if (var2 < this.field457) {
                    return false;
                }
                this.field292.field1700 = 0;
                this.field212.method4(this.field292.field1699, 0, this.field457);
                this.field459 = 0;
                this.field439 = this.field438;
                this.field438 = this.field437;
                this.field437 = this.field458;
                if (this.field458 == 67) {
                    int var3 = this.field292.method576(true);
                    int var4 = this.field292.method573(7);
                    int var5 = this.field292.method550();
                    class9 var6 = class9.field645[var4];
                    var6.field678 = var3;
                    var6.field701 = var5;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 202) {
                    int var7 = this.field292.method575(263);
                    this.method172(0, var7);
                    if (this.field367 != -1) {
                        this.field367 = -1;
                        this.field426 = true;
                        this.field251 = true;
                    }
                    if (this.field350 != -1) {
                        this.field350 = -1;
                        this.field252 = true;
                    }
                    if (this.field476 != 0) {
                        this.field476 = 0;
                        this.field252 = true;
                    }
                    this.field381 = var7;
                    this.field524 = false;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 123) {
                    int var8 = this.field292.method549();
                    this.method172(0, var8);
                    if (this.field367 != -1) {
                        this.field367 = -1;
                        this.field426 = true;
                        this.field251 = true;
                    }
                    this.field350 = var8;
                    this.field252 = true;
                    this.field381 = -1;
                    this.field524 = false;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 158) {
                    this.field465 = true;
                    this.field128 = this.field292.method547();
                    this.field129 = this.field292.method547();
                    this.field130 = this.field292.method549();
                    this.field131 = this.field292.method547();
                    this.field132 = this.field292.method547();
                    if (this.field132 >= 100) {
                        this.field195 = this.field128 * 128 + 64;
                        this.field197 = this.field129 * 128 + 64;
                        this.field196 = this.method151(this.field210, false, this.field197, this.field195) - this.field130;
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 69) {
                    this.field240 = false;
                    this.field476 = 2;
                    this.field574 = "";
                    this.field252 = true;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 100) {
                    for (int var9 = 0; var9 < this.field491.length; ++var9) {
                        if (this.field491[var9] != null) {
                            this.field491[var9].field1245 = -1;
                        }
                    }
                    for (int var10 = 0; var10 < this.field554.length; ++var10) {
                        if (this.field554[var10] != null) {
                            this.field554[var10].field1245 = -1;
                        }
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 222) {
                    this.field426 = true;
                    int var11 = this.field292.method581(this.field413);
                    int var12 = this.field292.method567(3);
                    int var13 = this.field292.method566(1474);
                    this.field313[var12] = var11;
                    this.field383[var12] = var13;
                    this.field570[var12] = 1;
                    for (int var14 = 0; var14 < 98; ++var14) {
                        if (var11 >= field336[var14]) {
                            this.field570[var12] = var14 + 2;
                        }
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 172) {
                    for (int var15 = 0; var15 < this.field530.length; ++var15) {
                        if (this.field530[var15] != this.field157[var15]) {
                            this.field530[var15] = this.field157[var15];
                            this.method171(var15, false);
                            this.field426 = true;
                        }
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 11) {
                    this.method85(this.field292, this.field457, 0);
                    this.field297 = false;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 44) {
                    int var16 = this.field292.method574((byte) 3);
                    int var17 = this.field292.method549();
                    class9.field645[var17].field694 = 2;
                    class9.field645[var17].field695 = var16;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 193) {
                    this.field345 = this.field292.method547();
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 163) {
                    int var18 = this.field292.method574((byte) 3);
                    int var19 = this.field292.method573(7);
                    int var20 = this.field292.method575(263);
                    if (var19 == 65535) {
                        class9.field645[var18].field694 = 0;
                        this.field458 = -1;
                        return true;
                    }
                    class46 var21 = class46.method416(var19);
                    class9.field645[var18].field694 = 4;
                    class9.field645[var18].field695 = var19;
                    class9.field645[var18].field658 = var21.field1395;
                    class9.field645[var18].field659 = var21.field1380;
                    class9.field645[var18].field657 = var21.field1414 * 100 / var20;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 18) {
                    this.field218 = this.field292.method567(3);
                    this.field219 = this.field292.method547();
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 20) {
                    this.field581 = this.field292.method575(263) * 30;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 178) {
                    this.field425 = this.field292.method547();
                    this.field426 = true;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 84) {
                    if (this.field546 == 12) {
                        this.field426 = true;
                    }
                    this.field194 = this.field292.method550();
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 244) {
                    this.field465 = true;
                    this.field430 = this.field292.method547();
                    this.field431 = this.field292.method547();
                    this.field432 = this.field292.method549();
                    this.field433 = this.field292.method547();
                    this.field434 = this.field292.method547();
                    if (this.field434 >= 100) {
                        int var22 = this.field430 * 128 + 64;
                        int var23 = this.field431 * 128 + 64;
                        int var24 = this.method151(this.field210, false, var23, var22) - this.field432;
                        int var25 = var22 - this.field195;
                        int var26 = var24 - this.field196;
                        int var27 = var23 - this.field197;
                        int var28 = (int) Math.sqrt((double) (var25 * var25 + var27 * var27));
                        this.field198 = (int) (Math.atan2((double) var26, (double) var28) * 325.949D) & 2047;
                        this.field199 = (int) (Math.atan2((double) var25, (double) var27) * -325.949D) & 2047;
                        if (this.field198 < 128) {
                            this.field198 = 128;
                        }
                        if (this.field198 > 383) {
                            this.field198 = 383;
                        }
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 52) {
                    this.method58(true);
                    this.field458 = -1;
                    return false;
                }
                if (this.field458 == 196) {
                    int var29 = this.field292.method549();
                    boolean var30 = this.field292.method547() == 1;
                    class9.field645[var29].field647 = var30;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 110) {
                    int var31 = this.field292.method574((byte) 3);
                    int var32 = this.field292.method575(263);
                    class9 var33 = class9.field645[var32];
                    if (var33 != null && var33.field638 == 0) {
                        if (var31 < 0) {
                            var31 = 0;
                        }
                        if (var31 > var33.field685 - var33.field642) {
                            var31 = var33.field685 - var33.field642;
                        }
                        var33.field639 = var31;
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 128) {
                    this.field550 = this.field292.method547();
                    if (this.field550 == 1) {
                        this.field168 = this.field292.method549();
                    }
                    if (this.field550 >= 2 && this.field550 <= 6) {
                        if (this.field550 == 2) {
                            this.field418 = 64;
                            this.field419 = 64;
                        }
                        if (this.field550 == 3) {
                            this.field418 = 0;
                            this.field419 = 64;
                        }
                        if (this.field550 == 4) {
                            this.field418 = 128;
                            this.field419 = 64;
                        }
                        if (this.field550 == 5) {
                            this.field418 = 64;
                            this.field419 = 0;
                        }
                        if (this.field550 == 6) {
                            this.field418 = 64;
                            this.field419 = 128;
                        }
                        this.field550 = 2;
                        this.field415 = this.field292.method549();
                        this.field416 = this.field292.method549();
                        this.field417 = this.field292.method547();
                    }
                    if (this.field550 == 10) {
                        this.field284 = this.field292.method549();
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 39) {
                    String var34 = this.field292.method554();
                    if (var34.endsWith(":tradereq:")) {
                        String var35 = var34.substring(0, var34.indexOf(":"));
                        long var36 = class26.method253(var35);
                        boolean var38 = false;
                        for (int var39 = 0; var39 < this.field483; ++var39) {
                            if (this.field307[var39] == var36) {
                                var38 = true;
                                break;
                            }
                        }
                        if (!var38 && this.field223 == 0) {
                            this.method131((byte) 5, 4, var35, "wishes to trade with you.");
                        }
                    } else if (var34.endsWith(":duelreq:")) {
                        String var40 = var34.substring(0, var34.indexOf(":"));
                        long var41 = class26.method253(var40);
                        boolean var43 = false;
                        for (int var44 = 0; var44 < this.field483; ++var44) {
                            if (this.field307[var44] == var41) {
                                var43 = true;
                                break;
                            }
                        }
                        if (!var43 && this.field223 == 0) {
                            this.method131((byte) 5, 8, var40, "wishes to duel with you.");
                        }
                    } else if (!var34.endsWith(":chalreq:")) {
                        this.method131((byte) 5, 0, "", var34);
                    } else {
                        String var45 = var34.substring(0, var34.indexOf(":"));
                        long var46 = class26.method253(var45);
                        boolean var48 = false;
                        for (int var49 = 0; var49 < this.field483; ++var49) {
                            if (this.field307[var49] == var46) {
                                var48 = true;
                                break;
                            }
                        }
                        if (!var48 && this.field223 == 0) {
                            String var50 = var34.substring(var34.indexOf(":") + 1, var34.length() - 9);
                            this.method131((byte) 5, 8, var45, var50);
                        }
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 177) {
                    this.field219 = this.field292.method547();
                    this.field218 = this.field292.method565(38);
                    for (int var51 = this.field218; var51 < this.field218 + 8; ++var51) {
                        for (int var52 = this.field219; var52 < this.field219 + 8; ++var52) {
                            if (this.field572[this.field210][var51][var52] != null) {
                                this.field572[this.field210][var51][var52] = null;
                                this.method177(var51, var52);
                            }
                        }
                    }
                    for (class27 var53 = (class27) this.field406.method523(); var53 != null; var53 = (class27) this.field406.method525(-687)) {
                        if (var53.field982 >= this.field218 && var53.field982 < this.field218 + 8 && var53.field983 >= this.field219 && var53.field983 < this.field219 + 8 && this.field210 == var53.field980) {
                            var53.field988 = 0;
                        }
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 171 || this.field458 == 255) {
                    int var54 = this.field241;
                    int var55 = this.field242;
                    if (this.field458 == 171) {
                        var54 = this.field292.method573(7);
                        var55 = this.field292.method573(7);
                        this.field571 = false;
                    }
                    if (this.field458 == 255) {
                        var55 = this.field292.method549();
                        this.field292.method557((byte) -108);
                        int var56 = 0;
                        while (true) {
                            if (var56 >= 4) {
                                this.field292.method559(221);
                                var54 = this.field292.method574((byte) 3);
                                this.field571 = true;
                                break;
                            }
                            for (int var57 = 0; var57 < 13; ++var57) {
                                for (int var58 = 0; var58 < 13; ++var58) {
                                    int var59 = this.field292.method558(1, true);
                                    if (var59 == 1) {
                                        this.field107[var56][var57][var58] = this.field292.method558(26, true);
                                    } else {
                                        this.field107[var56][var57][var58] = -1;
                                    }
                                }
                            }
                            ++var56;
                        }
                    }
                    if (this.field241 == var54 && this.field242 == var55 && this.field312 == 2) {
                        this.field458 = -1;
                        return true;
                    }
                    this.field241 = var54;
                    this.field242 = var55;
                    this.field185 = (this.field241 - 6) * 8;
                    this.field186 = (this.field242 - 6) * 8;
                    this.field339 = false;
                    if ((this.field241 / 8 == 48 || this.field241 / 8 == 49) && this.field242 / 8 == 48) {
                        this.field339 = true;
                    }
                    if (this.field241 / 8 == 48 && this.field242 / 8 == 148) {
                        this.field339 = true;
                    }
                    this.field312 = 1;
                    this.field394 = System.currentTimeMillis();
                    this.field143.method212(2);
                    this.field500.method237(151, 0, "Loading - please wait.", true, 257);
                    this.field500.method237(150, 16777215, "Loading - please wait.", true, 256);
                    this.field143.method213(9, 4, super.field917, 4);
                    if (this.field458 == 171) {
                        int var60 = 0;
                        int var61 = (this.field241 - 6) / 8;
                        label1121: while (true) {
                            if (var61 > (this.field241 + 6) / 8) {
                                this.field289 = new byte[var60][];
                                this.field179 = new byte[var60][];
                                this.field278 = new int[var60];
                                this.field279 = new int[var60];
                                this.field280 = new int[var60];
                                int var63 = 0;
                                int var64 = (this.field241 - 6) / 8;
                                while (true) {
                                    if (var64 > (this.field241 + 6) / 8) {
                                        break label1121;
                                    }
                                    for (int var65 = (this.field242 - 6) / 8; var65 <= (this.field242 + 6) / 8; ++var65) {
                                        this.field278[var63] = (var64 << 8) + var65;
                                        if (!this.field339 || var65 != 49 && var65 != 149 && var65 != 147 && var64 != 50 && (var64 != 49 || var65 != 47)) {
                                            int var66 = this.field279[var63] = this.field486.method388(0, 5, var64, var65);
                                            if (var66 != -1) {
                                                this.field486.method409(3, var66);
                                            }
                                            int var67 = this.field280[var63] = this.field486.method388(1, 5, var64, var65);
                                            if (var67 != -1) {
                                                this.field486.method409(3, var67);
                                            }
                                            ++var63;
                                        } else {
                                            this.field279[var63] = -1;
                                            this.field280[var63] = -1;
                                            ++var63;
                                        }
                                    }
                                    ++var64;
                                }
                            }
                            for (int var62 = (this.field242 - 6) / 8; var62 <= (this.field242 + 6) / 8; ++var62) {
                                ++var60;
                            }
                            ++var61;
                        }
                    }
                    if (this.field458 == 255) {
                        int var68 = 0;
                        int[] var69 = new int[676];
                        int var70 = 0;
                        label1080: while (true) {
                            if (var70 >= 4) {
                                this.field289 = new byte[var68][];
                                this.field179 = new byte[var68][];
                                this.field278 = new int[var68];
                                this.field279 = new int[var68];
                                this.field280 = new int[var68];
                                int var78 = 0;
                                while (true) {
                                    if (var78 >= var68) {
                                        break label1080;
                                    }
                                    int var79 = this.field278[var78] = var69[var78];
                                    int var80 = var79 >> 8 & 255;
                                    int var81 = var79 & 255;
                                    int var82 = this.field279[var78] = this.field486.method388(0, 5, var80, var81);
                                    if (var82 != -1) {
                                        this.field486.method409(3, var82);
                                    }
                                    int var83 = this.field280[var78] = this.field486.method388(1, 5, var80, var81);
                                    if (var83 != -1) {
                                        this.field486.method409(3, var83);
                                    }
                                    ++var78;
                                }
                            }
                            for (int var71 = 0; var71 < 13; ++var71) {
                                for (int var72 = 0; var72 < 13; ++var72) {
                                    int var73 = this.field107[var70][var71][var72];
                                    if (var73 != -1) {
                                        int var74 = var73 >> 14 & 1023;
                                        int var75 = var73 >> 3 & 2047;
                                        int var76 = (var74 / 8 << 8) + var75 / 8;
                                        for (int var77 = 0; var77 < var68; ++var77) {
                                            if (var69[var77] == var76) {
                                                var76 = -1;
                                                break;
                                            }
                                        }
                                        if (var76 != -1) {
                                            var69[var68++] = var76;
                                        }
                                    }
                                }
                            }
                            ++var70;
                        }
                    }
                    int var84 = this.field185 - this.field187;
                    int var85 = this.field186 - this.field188;
                    this.field187 = this.field185;
                    this.field188 = this.field186;
                    for (int var86 = 0; var86 < 16384; ++var86) {
                        class49 var87 = this.field554[var86];
                        if (var87 != null) {
                            for (int var88 = 0; var88 < 10; ++var88) {
                                var87.field1250[var88] -= var84;
                                var87.field1251[var88] -= var85;
                            }
                            var87.field1233 -= var84 * 128;
                            var87.field1234 -= var85 * 128;
                        }
                    }
                    for (int var89 = 0; var89 < this.field489; ++var89) {
                        class39 var90 = this.field491[var89];
                        if (var90 != null) {
                            for (int var91 = 0; var91 < 10; ++var91) {
                                var90.field1250[var91] -= var84;
                                var90.field1251[var91] -= var85;
                            }
                            var90.field1233 -= var84 * 128;
                            var90.field1234 -= var85 * 128;
                        }
                    }
                    this.field297 = true;
                    byte var92 = 0;
                    byte var93 = 104;
                    byte var94 = 1;
                    if (var84 < 0) {
                        var92 = 103;
                        var93 = -1;
                        var94 = -1;
                    }
                    byte var95 = 0;
                    byte var96 = 104;
                    byte var97 = 1;
                    if (var85 < 0) {
                        var95 = 103;
                        var96 = -1;
                        var97 = -1;
                    }
                    for (int var98 = var92; var93 != var98; var98 += var94) {
                        for (int var99 = var95; var96 != var99; var99 += var97) {
                            int var100 = var84 + var98;
                            int var101 = var85 + var99;
                            for (int var102 = 0; var102 < 4; ++var102) {
                                if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                                    this.field572[var102][var98][var99] = this.field572[var102][var100][var101];
                                } else {
                                    this.field572[var102][var98][var99] = null;
                                }
                            }
                        }
                    }
                    for (class27 var103 = (class27) this.field406.method523(); var103 != null; var103 = (class27) this.field406.method525(-687)) {
                        var103.field982 -= var84;
                        var103.field983 -= var85;
                        if (var103.field982 < 0 || var103.field983 < 0 || var103.field982 >= 104 || var103.field983 >= 104) {
                            var103.method591();
                        }
                    }
                    if (this.field462 != 0) {
                        this.field462 -= var84;
                        this.field463 -= var85;
                    }
                    this.field465 = false;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 121) {
                    this.field426 = true;
                    int var104 = this.field292.method549();
                    class9 var105 = class9.field645[var104];
                    int var106 = this.field292.method549();
                    for (int var107 = 0; var107 < var106; ++var107) {
                        var105.field693[var107] = this.field292.method574((byte) 3);
                        int var108 = this.field292.method567(3);
                        if (var108 == 255) {
                            var108 = this.field292.method582(true);
                        }
                        var105.field637[var107] = var108;
                    }
                    for (int var109 = var106; var109 < var105.field693.length; ++var109) {
                        var105.field693[var109] = 0;
                        var105.field637[var109] = 0;
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 161) {
                    this.field546 = this.field292.method547();
                    this.field426 = true;
                    this.field251 = true;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 138) {
                    int var110 = this.field292.method549();
                    if (var110 == 65535) {
                        var110 = -1;
                    }
                    if (this.field404 != var110 && this.field349 && !field392 && this.field247 == 0) {
                        this.field326 = var110;
                        this.field327 = true;
                        this.field486.method409(2, this.field326);
                    }
                    this.field404 = var110;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 6) {
                    int var111 = this.field292.method578(true);
                    int var112 = this.field292.method573(7);
                    if (this.field349 && !field392) {
                        this.field326 = var112;
                        this.field327 = false;
                        this.field486.method409(2, this.field326);
                        this.field247 = var111;
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 150) {
                    this.field162 = this.field292.method547();
                    this.field421 = this.field292.method547();
                    this.field253 = this.field292.method547();
                    this.field237 = true;
                    this.field252 = true;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 200) {
                    this.field243 = this.field292.method549();
                    this.field156 = this.field292.method566(1474);
                    this.field274 = this.field292.method573(7);
                    this.field178 = this.field292.method567(3);
                    this.field531 = this.field292.method582(true);
                    if (this.field531 != 0 && this.field381 == -1) {
                        signlink.dnslookup(class26.method256(this.field531, -37537));
                        this.method146(true);
                        short var113 = 650;
                        if (this.field156 != 201 || this.field178 == 1) {
                            var113 = 655;
                        }
                        this.field346 = "";
                        this.field276 = false;
                        for (int var114 = 0; var114 < class9.field645.length; ++var114) {
                            if (class9.field645[var114] != null && class9.field645[var114].field677 == var113) {
                                this.field381 = class9.field645[var114].field690;
                                break;
                            }
                        }
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 21) {
                    int var115 = this.field292.method573(7);
                    int var116 = this.field292.method575(263);
                    int var117 = this.field292.method549();
                    int var118 = this.field292.method574((byte) 3);
                    class9.field645[var115].field658 = var116;
                    class9.field645[var115].field659 = var118;
                    class9.field645[var115].field657 = var117;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 243) {
                    int var119 = this.field292.method575(263);
                    this.method172(0, var119);
                    if (this.field350 != -1) {
                        this.field350 = -1;
                        this.field252 = true;
                    }
                    if (this.field476 != 0) {
                        this.field476 = 0;
                        this.field252 = true;
                    }
                    this.field367 = var119;
                    this.field426 = true;
                    this.field251 = true;
                    this.field381 = -1;
                    this.field524 = false;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 210) {
                    this.field240 = false;
                    this.field476 = 1;
                    this.field574 = "";
                    this.field252 = true;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 76) {
                    this.field426 = true;
                    int var120 = this.field292.method549();
                    class9 var121 = class9.field645[var120];
                    while (this.field292.field1700 < this.field457) {
                        int var122 = this.field292.method561();
                        int var123 = this.field292.method549();
                        int var124 = this.field292.method547();
                        if (var124 == 255) {
                            var124 = this.field292.method552();
                        }
                        if (var122 >= 0 && var122 < var121.field693.length) {
                            var121.field693[var122] = var123;
                            var121.field637[var122] = var124;
                        }
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 155) {
                    int var125 = this.field292.method549();
                    class9.field645[var125].field694 = 3;
                    if (field446.field1278 == null) {
                        class9.field645[var125].field695 = (field446.field1274[11] << 5) + (field446.field1274[8] << 10) + (field446.field1274[0] << 15) + (field446.field1253[0] << 25) + (field446.field1253[4] << 20) + field446.field1274[1];
                    } else {
                        class9.field645[var125].field695 = (int) (field446.field1278.field1667 + 305419896L);
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 64) {
                    int var126 = this.field292.method549();
                    int var127 = this.field292.method574((byte) 3);
                    int var128 = this.field292.method573(7);
                    class9.field645[var127].field702 = (var126 << 16) + var128;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 3) {
                    int var129 = this.field292.method573(7);
                    int var130 = this.field292.method575(263);
                    int var131 = var129 >> 10 & 31;
                    int var132 = var129 >> 5 & 31;
                    int var133 = var129 & 31;
                    class9.field645[var130].field679 = (var133 << 3) + (var131 << 19) + (var132 << 11);
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 26) {
                    this.field436 = this.field292.method547();
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 229) {
                    int var134 = this.field292.method575(263);
                    int var135 = this.field292.method580(-21852);
                    this.field157[var134] = var135;
                    if (this.field530[var134] != var135) {
                        this.field530[var134] = var135;
                        this.method171(var134, false);
                        this.field426 = true;
                        if (this.field139 != -1) {
                            this.field252 = true;
                        }
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 19) {
                    String var136 = this.field292.method554();
                    int var137 = this.field292.method573(7);
                    class9.field645[var137].field665 = var136;
                    if (this.field124[this.field546] == class9.field645[var137].field690) {
                        this.field426 = true;
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 143 || this.field458 == 54 || this.field458 == 92 || this.field458 == 93 || this.field458 == 89 || this.field458 == 81 || this.field458 == 248 || this.field458 == 45 || this.field458 == 201 || this.field458 == 235 || this.field458 == 80) {
                    this.method129(this.field292, this.field458, 3);
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 239) {
                    int var138 = this.field292.method574((byte) 3);
                    int var139 = this.field292.method574((byte) 3);
                    if (this.field350 != -1) {
                        this.field350 = -1;
                        this.field252 = true;
                    }
                    if (this.field476 != 0) {
                        this.field476 = 0;
                        this.field252 = true;
                    }
                    this.field381 = var138;
                    this.field367 = var139;
                    this.field426 = true;
                    this.field251 = true;
                    this.field524 = false;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 122) {
                    if (this.field367 != -1) {
                        this.field367 = -1;
                        this.field426 = true;
                        this.field251 = true;
                    }
                    if (this.field350 != -1) {
                        this.field350 = -1;
                        this.field252 = true;
                    }
                    if (this.field476 != 0) {
                        this.field476 = 0;
                        this.field252 = true;
                    }
                    this.field381 = -1;
                    this.field524 = false;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 144) {
                    long var140 = this.field292.method553(false);
                    int var142 = this.field292.method552();
                    int var143 = this.field292.method547();
                    boolean var144 = false;
                    for (int var145 = 0; var145 < 100; ++var145) {
                        if (this.field361[var145] == var142) {
                            var144 = true;
                            break;
                        }
                    }
                    if (var143 <= 1) {
                        for (int var146 = 0; var146 < this.field483; ++var146) {
                            if (this.field307[var146] == var140) {
                                var144 = true;
                                break;
                            }
                        }
                    }
                    if (!var144 && this.field223 == 0) {
                        try {
                            this.field361[this.field545] = var142;
                            this.field545 = (this.field545 + 1) % 100;
                            String var147 = class36.method366(this.field292, this.field457 - 13, this.field561);
                            if (var143 != 3) {
                                var147 = class60.method468(var147, (byte) -88);
                            }
                            if (var143 != 2 && var143 != 3) {
                                if (var143 == 1) {
                                    this.method131((byte) 5, 7, "@cr1@" + class26.method257(0, class26.method254(0, var140)), var147);
                                } else {
                                    this.method131((byte) 5, 3, class26.method257(0, class26.method254(0, var140)), var147);
                                }
                            } else {
                                this.method131((byte) 5, 7, "@cr2@" + class26.method257(0, class26.method254(0, var140)), var147);
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 66) {
                    byte var149 = this.field292.method568(false);
                    int var150 = this.field292.method549();
                    this.field157[var150] = var149;
                    if (this.field530[var150] != var149) {
                        this.field530[var150] = var149;
                        this.method171(var150, false);
                        this.field426 = true;
                        if (this.field139 != -1) {
                            this.field252 = true;
                        }
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 43) {
                    int var151 = this.field292.method573(7);
                    int var152 = this.field292.method573(7);
                    class9.field645[var152].field694 = 1;
                    class9.field645[var152].field695 = var151;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 29) {
                    int var153 = this.field292.method577(0);
                    this.field139 = var153;
                    this.field252 = true;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 191) {
                    int var154 = this.field292.method575(263);
                    int var155 = this.field292.method550();
                    class9 var156 = class9.field645[var154];
                    var156.field681 = var155;
                    if (var155 == -1) {
                        var156.field646 = 0;
                        var156.field641 = 0;
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 220) {
                    int var157 = this.field292.method576(true);
                    if (var157 >= 0) {
                        this.method172(0, var157);
                    }
                    this.field250 = var157;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 162) {
                    int var158 = this.field292.method549();
                    int var159 = this.field292.method566(1474);
                    if (var158 == 65535) {
                        var158 = -1;
                    }
                    this.field124[var159] = var158;
                    this.field426 = true;
                    this.field251 = true;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 232) {
                    this.field219 = this.field292.method566(1474);
                    this.field218 = this.field292.method566(1474);
                    while (this.field292.field1700 < this.field457) {
                        int var160 = this.field292.method547();
                        this.method129(this.field292, var160, 3);
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 147) {
                    this.field514 = this.field292.method574((byte) 3);
                    this.field133 = this.field292.method547();
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 157) {
                    int var161 = this.field292.method549();
                    int var162 = this.field292.method547();
                    int var163 = this.field292.method549();
                    if (this.field508 && !field392 && this.field435 < 50) {
                        this.field255[this.field435] = var161;
                        this.field177[this.field435] = var162;
                        this.field158[this.field435] = class55.field1489[var161] + var163;
                        ++this.field435;
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 218) {
                    int var164 = this.field292.method575(263);
                    class9 var165 = class9.field645[var164];
                    for (int var166 = 0; var166 < var165.field693.length; ++var166) {
                        var165.field693[var166] = -1;
                        var165.field693[var166] = 0;
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 71) {
                    this.field462 = 0;
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 141) {
                    this.field483 = this.field457 / 8;
                    for (int var167 = 0; var167 < this.field483; ++var167) {
                        this.field307[var167] = this.field292.method553(false);
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 112) {
                    this.field465 = false;
                    for (int var168 = 0; var168 < 5; ++var168) {
                        this.field169[var168] = false;
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 91) {
                    if (this.field546 == 12) {
                        this.field426 = true;
                    }
                    this.field469 = this.field292.method547();
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 30) {
                    this.method150(this.field292, 646, this.field457);
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 176) {
                    long var169 = this.field292.method553(false);
                    int var171 = this.field292.method547();
                    String var172 = class26.method257(0, class26.method254(0, var169));
                    for (int var173 = 0; var173 < this.field424; ++var173) {
                        if (this.field111[var173] == var169) {
                            if (this.field123[var173] != var171) {
                                this.field123[var173] = var171;
                                this.field426 = true;
                                if (var171 > 0) {
                                    this.method131((byte) 5, 5, "", var172 + " has logged in.");
                                }
                                if (var171 == 0) {
                                    this.method131((byte) 5, 5, "", var172 + " has logged out.");
                                }
                            }
                            var172 = null;
                            break;
                        }
                    }
                    if (var172 != null && this.field424 < 200) {
                        this.field111[this.field424] = var169;
                        this.field379[this.field424] = var172;
                        this.field123[this.field424] = var171;
                        ++this.field424;
                        this.field426 = true;
                    }
                    boolean var174 = false;
                    while (!var174) {
                        var174 = true;
                        for (int var175 = 0; var175 < this.field424 - 1; ++var175) {
                            if (this.field123[var175] != field389 && this.field123[var175 + 1] == field389 || this.field123[var175] == 0 && this.field123[var175 + 1] != 0) {
                                int var176 = this.field123[var175];
                                this.field123[var175] = this.field123[var175 + 1];
                                this.field123[var175 + 1] = var176;
                                String var177 = this.field379[var175];
                                this.field379[var175] = this.field379[var175 + 1];
                                this.field379[var175 + 1] = var177;
                                long var178 = this.field111[var175];
                                this.field111[var175] = this.field111[var175 + 1];
                                this.field111[var175 + 1] = var178;
                                this.field426 = true;
                                var174 = false;
                            }
                        }
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 165) {
                    this.field467 = this.field292.method567(3);
                    if (this.field546 == this.field467) {
                        if (this.field467 == 3) {
                            this.field546 = 1;
                        } else {
                            this.field546 = 3;
                        }
                        this.field426 = true;
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 68) {
                    int var180 = this.field292.method547();
                    String var181 = this.field292.method554();
                    int var182 = this.field292.method567(3);
                    if (var182 >= 1 && var182 <= 5) {
                        if (var181.equalsIgnoreCase("null")) {
                            var181 = null;
                        }
                        this.field192[var182 - 1] = var181;
                        this.field193[var182 - 1] = var180 == 0;
                    }
                    this.field458 = -1;
                    return true;
                }
                if (this.field458 == 148) {
                    int var183 = this.field292.method547();
                    int var184 = this.field292.method547();
                    int var185 = this.field292.method547();
                    int var186 = this.field292.method547();
                    this.field169[var183] = true;
                    this.field564[var183] = var184;
                    this.field382[var183] = var185;
                    this.field548[var183] = var186;
                    this.field239[var183] = 0;
                    this.field458 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field458 + "," + this.field457 + " - " + this.field438 + "," + this.field439);
                this.method58(true);
            } catch (IOException var191) {
                this.method74(564);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field458 + "," + this.field438 + "," + this.field439 + " - " + this.field457 + "," + (field446.field1250[0] + this.field185) + "," + (field446.field1251[0] + this.field186) + " - ";
                for (int var189 = 0; var189 < this.field457 && var189 < 50; ++var189) {
                    var188 = var188 + this.field292.field1699[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method58(true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method141(byte arg0) {
        signlink.reporterror = false;
        try {
            if (this.field212 != null) {
                this.field212.method1();
            }
        } catch (Exception var3) {
        }
        this.field212 = null;
        this.method168(9);
        if (this.field400 != null) {
            this.field400.field853 = false;
        }
        this.field400 = null;
        this.field486.method398();
        this.field486 = null;
        this.field553 = null;
        this.field552 = null;
        this.field355 = null;
        this.field292 = null;
        this.field278 = null;
        this.field289 = null;
        this.field179 = null;
        this.field279 = null;
        this.field280 = null;
        this.field161 = null;
        this.field549 = null;
        this.field543 = null;
        this.field306 = null;
        this.field477 = null;
        this.field164 = null;
        this.field220 = null;
        this.field221 = null;
        this.field378 = null;
        this.field141 = null;
        this.field142 = null;
        this.field143 = null;
        this.field144 = null;
        this.field509 = null;
        this.field510 = null;
        this.field511 = null;
        this.field113 = null;
        this.field114 = null;
        this.field115 = null;
        this.field116 = null;
        this.field117 = null;
        this.field118 = null;
        this.field119 = null;
        this.field120 = null;
        this.field121 = null;
        this.field148 = null;
        this.field149 = null;
        this.field150 = null;
        this.field451 = null;
        this.field452 = null;
        this.field453 = null;
        this.field482 = null;
        this.field201 = null;
        this.field202 = null;
        this.field203 = null;
        this.field204 = null;
        this.field205 = null;
        this.field180 = null;
        this.field181 = null;
        this.field182 = null;
        this.field183 = null;
        this.field184 = null;
        this.field291 = null;
        this.field296 = null;
        this.field348 = null;
        this.field393 = null;
        this.field172 = null;
        this.field173 = null;
        this.field174 = null;
        this.field175 = null;
        this.field176 = null;
        this.field429 = null;
        this.field534 = null;
        this.field517 = null;
        this.field491 = null;
        this.field493 = null;
        this.field495 = null;
        this.field496 = null;
        this.field171 = null;
        this.field554 = null;
        this.field556 = null;
        this.field572 = null;
        this.field406 = null;
        this.field414 = null;
        this.field290 = null;
        this.field407 = null;
        this.field408 = null;
        this.field409 = null;
        this.field410 = null;
        this.field450 = null;
        this.field530 = null;
        this.field332 = null;
        this.field333 = null;
        this.field505 = null;
        this.field464 = null;
        this.field379 = null;
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            field559 = !field559;
        }
        this.field111 = null;
        this.field123 = null;
        this.field320 = null;
        this.field321 = null;
        this.field317 = null;
        this.field318 = null;
        this.field319 = null;
        this.field322 = null;
        this.field323 = null;
        this.field324 = null;
        this.field325 = null;
        this.method112(3);
        class33.method347((byte) 46);
        class68.method534((byte) 46);
        class46.method422((byte) 46);
        class19.field861 = null;
        class17.field844 = null;
        class9.field645 = null;
        class67.field1634 = null;
        class20.field875 = null;
        class71.field1721 = null;
        class71.field1733 = null;
        class40.field1281 = null;
        super.field918 = null;
        class39.field1266 = null;
        class8.method183((byte) 46);
        class32.method291((byte) 46);
        class4.method7((byte) 46);
        class41.method381((byte) 46);
        System.gc();
        if (class72.field1737) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method142(String arg0) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "([BII)Z")
    public final boolean method143(byte[] arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field293 = -284;
        }
        return arg0 == null ? true : signlink.wavesave(arg0, arg1);
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method144(boolean arg0) {
        if (arg0) {
            if (super.field931 == 1) {
                if (super.field932 >= 6 && super.field932 <= 106 && super.field933 >= 467 && super.field933 <= 499) {
                    this.field162 = (this.field162 + 1) % 4;
                    this.field237 = true;
                    this.field252 = true;
                    this.field552.method536(174, true);
                    this.field552.method537(this.field162);
                    this.field552.method537(this.field421);
                    this.field552.method537(this.field253);
                }
                if (super.field932 >= 135 && super.field932 <= 235 && super.field933 >= 467 && super.field933 <= 499) {
                    this.field421 = (this.field421 + 1) % 3;
                    this.field237 = true;
                    this.field252 = true;
                    this.field552.method536(174, true);
                    this.field552.method537(this.field162);
                    this.field552.method537(this.field421);
                    this.field552.method537(this.field253);
                }
                if (super.field932 >= 273 && super.field932 <= 373 && super.field933 >= 467 && super.field933 <= 499) {
                    this.field253 = (this.field253 + 1) % 3;
                    this.field237 = true;
                    this.field252 = true;
                    this.field552.method536(174, true);
                    this.field552.method537(this.field162);
                    this.field552.method537(this.field421);
                    this.field552.method537(this.field253);
                }
                if (super.field932 >= 412 && super.field932 <= 512 && super.field933 >= 467 && super.field933 <= 499) {
                    if (this.field381 == -1) {
                        this.method146(true);
                        this.field346 = "";
                        this.field276 = false;
                        for (int var2 = 0; var2 < class9.field645.length; ++var2) {
                            if (class9.field645[var2] != null && class9.field645[var2].field677 == 600) {
                                this.field272 = this.field381 = class9.field645[var2].field690;
                                return;
                            }
                        }
                        return;
                    }
                    this.method131((byte) 5, 0, "", "Please close the interface you have open before using 'report abuse'");
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBI)I")
    public final int method145(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 44) {
            this.method173();
        }
        int var5 = 256 - arg3;
        return ((arg0 & 16711935) * var5 + (arg1 & 16711935) * arg3 & -16711936) + ((arg0 & 65280) * var5 + (arg1 & 65280) * arg3 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method146(boolean arg0) {
        this.field535 &= arg0;
        this.field552.method536(47, true);
        if (this.field367 != -1) {
            this.field367 = -1;
            this.field426 = true;
            this.field524 = false;
            this.field251 = true;
        }
        if (this.field350 != -1) {
            this.field350 = -1;
            this.field252 = true;
            this.field524 = false;
        }
        this.field381 = -1;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)V")
    public final void method147(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            int var4 = 0;
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field300[var5] != null) {
                    int var6 = this.field298[var5];
                    int var7 = 70 - var4 * 14 + this.field316 + 4;
                    if (var7 < -20) {
                        break;
                    }
                    String var8 = this.field299[var5];
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
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field162 == 0 || this.field162 == 1 && this.method123(765, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7 && !var8.equals(field446.field1271)) {
                            if (this.field282 >= 1) {
                                this.field450[this.field484] = "Report abuse @whi@" + var8;
                                this.field409[this.field484] = 36;
                                ++this.field484;
                            }
                            this.field450[this.field484] = "Add ignore @whi@" + var8;
                            this.field409[this.field484] = 380;
                            ++this.field484;
                            this.field450[this.field484] = "Add friend @whi@" + var8;
                            this.field409[this.field484] = 858;
                            ++this.field484;
                        }
                        ++var4;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field551 == 0 && (var6 == 7 || this.field421 == 0 || this.field421 == 1 && this.method123(765, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            if (this.field282 >= 1) {
                                this.field450[this.field484] = "Report abuse @whi@" + var8;
                                this.field409[this.field484] = 36;
                                ++this.field484;
                            }
                            this.field450[this.field484] = "Add ignore @whi@" + var8;
                            this.field409[this.field484] = 380;
                            ++this.field484;
                            this.field450[this.field484] = "Add friend @whi@" + var8;
                            this.field409[this.field484] = 858;
                            ++this.field484;
                        }
                        ++var4;
                    }
                    if (var6 == 4 && (this.field253 == 0 || this.field253 == 1 && this.method123(765, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            this.field450[this.field484] = "Accept trade @whi@" + var8;
                            this.field409[this.field484] = 975;
                            ++this.field484;
                        }
                        ++var4;
                    }
                    if ((var6 == 5 || var6 == 6) && this.field551 == 0 && this.field421 < 2) {
                        ++var4;
                    }
                    if (var6 == 8 && (this.field253 == 0 || this.field253 == 1 && this.method123(765, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            this.field450[this.field484] = "Accept challenge @whi@" + var8;
                            this.field409[this.field484] = 326;
                            ++this.field484;
                        }
                        ++var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZII)Z")
    public final boolean method148(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        boolean var5 = false;
        class9 var6 = class9.field645[arg2];
        for (int var7 = 0; var7 < var6.field671.length && var6.field671[var7] != -1; ++var7) {
            class9 var8 = class9.field645[var6.field671[var7]];
            if (var8.field638 == 1) {
                var5 |= this.method148(false, arg1, var8.field649);
            }
            if (var8.field638 == 6 && (var8.field681 != -1 || var8.field682 != -1)) {
                boolean var9 = this.method122(var8, (byte) 3);
                int var10;
                if (var9) {
                    var10 = var8.field682;
                } else {
                    var10 = var8.field681;
                }
                if (var10 != -1) {
                    class20 var11 = class20.field875[var10];
                    var8.field641 += arg1;
                    while (var8.field641 > var11.method226((byte) 6, var8.field646)) {
                        var8.field641 -= var11.method226((byte) 6, var8.field646) + 1;
                        ++var8.field646;
                        if (var8.field646 >= var11.field876) {
                            var8.field646 -= var11.field880;
                            if (var8.field646 < 0 || var8.field646 >= var11.field876) {
                                var8.field646 = 0;
                            }
                        }
                        var5 = true;
                    }
                }
            }
            if (var8.field638 == 6 && var8.field702 != 0) {
                int var12 = var8.field702 >> 16;
                int var13 = var8.field702 << 16 >> 16;
                int var14 = arg1 * var12;
                int var15 = arg1 * var13;
                var8.field658 = var8.field658 + var14 & 2047;
                var8.field659 = var8.field659 + var15 & 2047;
                var5 = true;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public static final void method149(int arg0) {
        class32.field1053 = true;
        class8.field614 = true;
        field392 = true;
        class63.field1595 = true;
        if (arg0 != 0) {
            field428 = 427;
        }
        class33.field1147 = true;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(LZOMNSJJM;II)V")
    private final void method150(class69 arg0, int arg1, int arg2) {
        this.field170 = 0;
        this.field494 = 0;
        if (arg1 <= 0) {
            this.field334 = !this.field334;
        }
        this.method157(arg2, arg0, false);
        this.method105(false, arg0, arg2);
        this.method174(arg2, 795, arg0);
        for (int var4 = 0; var4 < this.field170; ++var4) {
            int var6 = this.field171[var4];
            if (field441 != this.field554[var6].field1231) {
                this.field554[var6].field1441 = null;
                this.field554[var6] = null;
            }
        }
        if (arg0.field1700 != arg2) {
            signlink.reporterror(this.field478 + " size mismatch in getnpcpos - pos:" + arg0.field1700 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field555; ++var5) {
                if (this.field554[this.field556[var5]] == null) {
                    signlink.reporterror(this.field478 + " null entry in npc list - pos:" + var5 + " size:" + this.field555);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZII)I")
    public final int method151(int arg0, boolean arg1, int arg2, int arg3) {
        int var5 = arg3 >> 7;
        int var6 = arg2 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg0;
            if (arg0 < 3 && (this.field549[1][var5][var6] & 2) == 2) {
                var7 = arg0 + 1;
            }
            int var8 = arg3 & 127;
            int var9 = arg2 & 127;
            int var10 = (128 - var8) * this.field161[var7][var5][var6] + this.field161[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field161[var7][var5][var6 + 1] + this.field161[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return arg1 ? field516 : (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method152(boolean arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        for (int var4 = 0; var4 < this.field555; ++var4) {
            class49 var5 = this.field554[this.field556[var4]];
            int var6 = (this.field556[var4] << 14) + 536870912;
            if (var5 != null && var5.method369(false) && var5.field1441.field1646 == arg0) {
                int var7 = var5.field1233 >> 7;
                int var8 = var5.field1234 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1214 == 1 && (var5.field1233 & 127) == 64 && (var5.field1234 & 127) == 64) {
                        if (this.field517[var7][var8] == this.field536) {
                            continue;
                        }
                        this.field517[var7][var8] = this.field536;
                    }
                    if (!var5.field1441.field1654) {
                        var6 += Integer.MIN_VALUE;
                    }
                    this.field543.method303(var5.field1234, var5.field1235, var6, var5.field1233, var5, -177, (var5.field1214 - 1) * 64 + 60, this.field210, this.method151(this.field210, false, var5.field1234, var5.field1233), var5.field1221);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZB)V")
    public final void method153(boolean arg0, byte arg1) {
        if (arg1 != 19) {
            this.field572 = null;
        }
        if (field446.field1233 >> 7 == this.field462 && field446.field1234 >> 7 == this.field463) {
            this.field462 = 0;
        }
        int var3 = this.field492;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class39 var5;
            int var6;
            if (arg0) {
                var5 = field446;
                var6 = this.field490 << 14;
            } else {
                var5 = this.field491[this.field493[var4]];
                var6 = this.field493[var4] << 14;
            }
            if (var5 != null && var5.method369(false)) {
                var5.field1277 = false;
                if ((field392 && this.field492 > 50 || this.field492 > 200) && !arg0 && var5.field1210 == var5.field1197) {
                    var5.field1277 = true;
                }
                int var7 = var5.field1233 >> 7;
                int var8 = var5.field1234 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1264 != null && field441 >= var5.field1272 && field441 < var5.field1273) {
                        var5.field1277 = false;
                        var5.field1270 = this.method151(this.field210, false, var5.field1234, var5.field1233);
                        this.field543.method304(var5.field1270, var5.field1256, var5.field1235, var5.field1257, var5, var5.field1258, 60, var5.field1233, true, this.field210, var5.field1259, var5.field1234, var6);
                    } else {
                        if ((var5.field1233 & 127) == 64 && (var5.field1234 & 127) == 64) {
                            if (this.field517[var7][var8] == this.field536) {
                                continue;
                            }
                            this.field517[var7][var8] = this.field536;
                        }
                        var5.field1270 = this.method151(this.field210, false, var5.field1234, var5.field1233);
                        this.field543.method303(var5.field1234, var5.field1235, var6, var5.field1233, var5, -177, 60, this.field210, var5.field1270, var5.field1221);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method154(byte arg0) {
        this.field402 = true;
        if (arg0 != 6) {
            this.field552.method537(27);
        }
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field294[var2] = -1;
            for (int var3 = 0; var3 < class17.field843; ++var3) {
                if (!class17.field844[var3].field850 && class17.field844[var3].field845 == var2 + (this.field474 ? 0 : 7)) {
                    this.field294[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method155(byte arg0) {
        if (arg0 == 50) {
            this.field223 = 0;
            int var2 = (field446.field1233 >> 7) + this.field185;
            int var3 = (field446.field1234 >> 7) + this.field186;
            if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
                this.field223 = 1;
            }
            if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
                this.field223 = 1;
            }
            if (this.field223 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
                this.field223 = 0;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIBI)V")
    private final void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        class27 var11 = null;
        for (class27 var12 = (class27) this.field406.method523(); var12 != null; var12 = (class27) this.field406.method525(-687)) {
            if (var12.field980 == arg5 && var12.field982 == arg1 && var12.field983 == arg3 && var12.field981 == arg7) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class27();
            var11.field980 = arg5;
            var11.field981 = arg7;
            var11.field982 = arg1;
            var11.field983 = arg3;
            this.method72(this.field488, var11);
            this.field406.method520(var11);
        }
        var11.field989 = arg9;
        var11.field991 = arg2;
        var11.field990 = arg0;
        if (arg8 == 8) {
            var11.field987 = arg6;
            var11.field988 = arg4;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILZOMNSJJM;Z)V")
    private final void method157(int arg0, class69 arg1, boolean arg2) {
        arg1.method557((byte) -108);
        int var4 = arg1.method558(8, true);
        if (var4 < this.field555) {
            for (int var5 = var4; var5 < this.field555; ++var5) {
                this.field171[this.field170++] = this.field556[var5];
            }
        }
        if (var4 > this.field555) {
            signlink.reporterror(this.field478 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field555 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field556[var6];
                class49 var8 = this.field554[var7];
                int var9 = arg1.method558(1, true);
                if (var9 == 0) {
                    this.field556[this.field555++] = var7;
                    var8.field1231 = field441;
                } else {
                    int var10 = arg1.method558(2, true);
                    if (var10 == 0) {
                        this.field556[this.field555++] = var7;
                        var8.field1231 = field441;
                        this.field495[this.field494++] = var7;
                    } else if (var10 == 1) {
                        this.field556[this.field555++] = var7;
                        var8.field1231 = field441;
                        int var11 = arg1.method558(3, true);
                        var8.method371(var11, (byte) -107, false);
                        int var12 = arg1.method558(1, true);
                        if (var12 == 1) {
                            this.field495[this.field494++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field556[this.field555++] = var7;
                        var8.field1231 = field441;
                        int var13 = arg1.method558(3, true);
                        var8.method371(var13, (byte) -107, true);
                        int var14 = arg1.method558(3, true);
                        var8.method371(var14, (byte) -107, true);
                        int var15 = arg1.method558(1, true);
                        if (var15 == 1) {
                            this.field495[this.field494++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field171[this.field170++] = var7;
                    }
                }
            }
            if (arg2) {
                this.field401 = !this.field401;
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public static final void method158(boolean arg0) {
        class32.field1053 = false;
        if (!arg0) {
            class8.field614 = false;
            field392 = false;
            class63.field1595 = false;
            class33.field1147 = false;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method159(boolean arg0) {
        if (!arg0) {
            field109 = -363;
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method235(47275);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field381 != -1 && this.field381 == this.field272) {
                        if (var2 == 8 && this.field346.length() > 0) {
                            this.field346 = this.field346.substring(0, this.field346.length() - 1);
                        }
                        break;
                    }
                    if (this.field240) {
                        if (var2 >= 32 && var2 <= 122 && this.field146.length() < 80) {
                            this.field146 = this.field146 + (char) var2;
                            this.field252 = true;
                        }
                        if (var2 == 8 && this.field146.length() > 0) {
                            this.field146 = this.field146.substring(0, this.field146.length() - 1);
                            this.field252 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field240 = false;
                            this.field252 = true;
                            if (this.field206 == 1) {
                                long var3 = class26.method253(this.field146);
                                this.method106(-989, var3);
                            }
                            if (this.field206 == 2 && this.field424 > 0) {
                                long var5 = class26.method253(this.field146);
                                this.method88(var5, 0);
                            }
                            if (this.field206 == 3 && this.field146.length() > 0) {
                                this.field552.method536(140, true);
                                this.field552.method537(0);
                                int var7 = this.field552.field1700;
                                this.field552.method543(this.field152, (byte) 5);
                                class36.method367(this.field146, this.field552, false);
                                this.field552.method546(true, this.field552.field1700 - var7);
                                this.field146 = class36.method368(this.field146, (byte) -88);
                                this.field146 = class60.method468(this.field146, (byte) -88);
                                this.method131((byte) 5, 6, class26.method257(0, class26.method254(0, this.field152)), this.field146);
                                if (this.field421 == 2) {
                                    this.field421 = 1;
                                    this.field237 = true;
                                    this.field552.method536(174, true);
                                    this.field552.method537(this.field162);
                                    this.field552.method537(this.field421);
                                    this.field552.method537(this.field253);
                                }
                            }
                            if (this.field206 == 4 && this.field483 < 100) {
                                long var8 = class26.method253(this.field146);
                                this.method78(true, var8);
                            }
                            if (this.field206 == 5 && this.field483 > 0) {
                                long var10 = class26.method253(this.field146);
                                this.method56(var10, (byte) 2);
                            }
                        }
                    } else if (this.field476 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field574.length() < 10) {
                            this.field574 = this.field574 + (char) var2;
                            this.field252 = true;
                        }
                        if (var2 == 8 && this.field574.length() > 0) {
                            this.field574 = this.field574.substring(0, this.field574.length() - 1);
                            this.field252 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field574.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field574);
                                } catch (Exception var22) {
                                }
                                this.field552.method536(64, true);
                                this.field552.method541(var12);
                            }
                            this.field476 = 0;
                            this.field252 = true;
                        }
                    } else if (this.field476 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field574.length() < 12) {
                            this.field574 = this.field574 + (char) var2;
                            this.field252 = true;
                        }
                        if (var2 == 8 && this.field574.length() > 0) {
                            this.field574 = this.field574.substring(0, this.field574.length() - 1);
                            this.field252 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field574.length() > 0) {
                                this.field552.method536(112, true);
                                this.field552.method543(class26.method253(this.field574), (byte) 5);
                            }
                            this.field476 = 0;
                            this.field252 = true;
                        }
                    } else if (this.field350 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field533.length() < 80) {
                            this.field533 = this.field533 + (char) var2;
                            this.field252 = true;
                        }
                        if (var2 == 8 && this.field533.length() > 0) {
                            this.field533 = this.field533.substring(0, this.field533.length() - 1);
                            this.field252 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field533.length() > 0) {
                            if (this.field282 == 2) {
                                if (this.field533.equals("::clientdrop")) {
                                    this.method74(564);
                                }
                                if (this.field533.equals("::lag")) {
                                    this.method48((byte) 5);
                                }
                                if (this.field533.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field486.method402(179, 2); ++var13) {
                                        this.field486.method389(false, 2, var13, (byte) 1);
                                    }
                                }
                                if (this.field533.equals("::fpson")) {
                                    field497 = true;
                                }
                                if (this.field533.equals("::fpsoff")) {
                                    field497 = false;
                                }
                                if (this.field533.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field306[var14].field1182[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field533.startsWith("::")) {
                                this.field552.method536(205, true);
                                this.field552.method537(this.field533.length() - 1);
                                this.field552.method544(this.field533.substring(2));
                            } else {
                                String var17 = this.field533.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field533 = this.field533.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field533 = this.field533.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field533 = this.field533.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field533 = this.field533.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field533 = this.field533.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field533 = this.field533.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field533 = this.field533.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field533 = this.field533.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field533 = this.field533.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field533 = this.field533.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field533 = this.field533.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field533 = this.field533.substring(6);
                                }
                                String var19 = this.field533.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field533 = this.field533.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field533 = this.field533.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field533 = this.field533.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field533 = this.field533.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field533 = this.field533.substring(6);
                                }
                                this.field552.method536(222, true);
                                this.field552.method537(0);
                                int var21 = this.field552.field1700;
                                this.field553.field1700 = 0;
                                class36.method367(this.field533, this.field553, false);
                                this.field552.method583(this.field553.field1699, 0, 0, this.field553.field1700);
                                this.field552.method563(false, var20);
                                this.field552.method564((byte) 2, var18);
                                this.field552.method546(true, this.field552.field1700 - var21);
                                this.field533 = class36.method368(this.field533, (byte) -88);
                                this.field533 = class60.method468(this.field533, (byte) -88);
                                field446.field1209 = this.field533;
                                field446.field1227 = var18;
                                field446.field1232 = var20;
                                field446.field1229 = 150;
                                if (this.field282 == 2) {
                                    this.method131((byte) 5, 2, "@cr2@" + field446.field1271, field446.field1209);
                                } else if (this.field282 == 1) {
                                    this.method131((byte) 5, 2, "@cr1@" + field446.field1271, field446.field1209);
                                } else {
                                    this.method131((byte) 5, 2, field446.field1271, field446.field1209);
                                }
                                if (this.field162 == 2) {
                                    this.field162 = 3;
                                    this.field237 = true;
                                    this.field552.method536(174, true);
                                    this.field552.method537(this.field162);
                                    this.field552.method537(this.field421);
                                    this.field552.method537(this.field253);
                                }
                            }
                            this.field533 = "";
                            this.field252 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field346.length() < 12) {
                this.field346 = this.field346 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method160(int arg0) {
        if (!this.field475 && !this.field106 && !this.field423) {
            ++field569;
            if (!this.field535) {
                this.method113((byte) 9, false);
            } else {
                this.method71(1);
            }
            this.field540 = 0;
            this.field457 += arg0;
        } else {
            this.method55(field109);
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method161(int arg0) {
        this.field507 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field518) {
                ++this.field189;
                this.method103(this.field358);
                this.method103(this.field358);
                this.method40(34435);
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
                } catch (Exception var10) {
                }
            }
        } catch (Exception var11) {
        }
        this.field507 = false;
        if (arg0 < 9 || arg0 > 9) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method162(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method163(int arg0) {
        if (arg0 != 1) {
            this.method173();
        }
        if (this.field376 == 0) {
            int var2 = super.field915 / 2 - 80;
            int var3 = super.field916 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field931 == 1 && super.field932 >= var2 - 75 && super.field932 <= var2 + 75 && super.field933 >= var14 - 20 && super.field933 <= var14 + 20) {
                this.field376 = 3;
                this.field337 = 0;
            }
            int var4 = super.field915 / 2 + 80;
            if (super.field931 == 1 && super.field932 >= var4 - 75 && super.field932 <= var4 + 75 && super.field933 >= var14 - 20 && super.field933 <= var14 + 20) {
                this.field352 = "";
                this.field353 = "Enter your username & password.";
                this.field376 = 2;
                this.field337 = 0;
            }
        } else if (this.field376 == 2) {
            int var5 = super.field916 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field931 == 1 && super.field933 >= var16 - 15 && super.field933 < var16) {
                this.field337 = 0;
            }
            var5 = var16 + 15;
            if (super.field931 == 1 && super.field933 >= var5 - 15 && super.field933 < var5) {
                this.field337 = 1;
            }
            var5 += 15;
            int var6 = super.field915 / 2 - 80;
            int var7 = super.field916 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field931 == 1 && super.field932 >= var6 - 75 && super.field932 <= var6 + 75 && super.field933 >= var17 - 20 && super.field933 <= var17 + 20) {
                this.field207 = 0;
                this.method91(this.field478, this.field479, false);
                if (this.field535) {
                    return;
                }
            }
            int var8 = super.field915 / 2 + 80;
            if (super.field931 == 1 && super.field932 >= var8 - 75 && super.field932 <= var8 + 75 && super.field933 >= var17 - 20 && super.field933 <= var17 + 20) {
                this.field376 = 0;
                this.field478 = "";
                this.field479 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method235(47275);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field232.length(); ++var11) {
                        if (var9 == field232.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field337 == 0) {
                        if (var9 == 8 && this.field478.length() > 0) {
                            this.field478 = this.field478.substring(0, this.field478.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field337 = 1;
                        }
                        if (var10) {
                            this.field478 = this.field478 + (char) var9;
                        }
                        if (this.field478.length() > 12) {
                            this.field478 = this.field478.substring(0, 12);
                        }
                    } else if (this.field337 == 1) {
                        if (var9 == 8 && this.field479.length() > 0) {
                            this.field479 = this.field479.substring(0, this.field479.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field337 = 0;
                        }
                        if (var10) {
                            this.field479 = this.field479 + (char) var9;
                        }
                        if (this.field479.length() > 20) {
                            this.field479 = this.field479.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field376 == 3) {
                int var12 = super.field915 / 2;
                int var13 = super.field916 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field931 == 1 && super.field932 >= var12 - 75 && super.field932 <= var12 + 75 && super.field933 >= var18 - 20 && super.field933 <= var18 + 20) {
                    this.field376 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(Z)V")
    public final void method164(boolean arg0) {
        if (this.field317 == null) {
            super.field918 = null;
            this.field144 = null;
            this.field142 = null;
            this.field141 = null;
            this.field143 = null;
            this.field509 = null;
            this.field510 = null;
            this.field511 = null;
            this.field320 = new class16(265, this.method49(8), true, 128);
            if (!arg0) {
                this.field166 = !this.field166;
            }
            class29.method267(7);
            this.field321 = new class16(265, this.method49(8), true, 128);
            class29.method267(7);
            this.field317 = new class16(171, this.method49(8), true, 509);
            class29.method267(7);
            this.field318 = new class16(132, this.method49(8), true, 360);
            class29.method267(7);
            this.field319 = new class16(200, this.method49(8), true, 360);
            class29.method267(7);
            this.field322 = new class16(238, this.method49(8), true, 202);
            class29.method267(7);
            this.field323 = new class16(238, this.method49(8), true, 203);
            class29.method267(7);
            this.field324 = new class16(94, this.method49(8), true, 74);
            class29.method267(7);
            this.field325 = new class16(94, this.method49(8), true, 75);
            class29.method267(7);
            if (this.field122 != null) {
                this.method134(field466);
                this.method44(-183);
            }
            this.field563 = true;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method165(int arg0, int arg1) {
        if (arg0 < 3 || arg0 > 3) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        signlink.wavevol = arg1;
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method166(int arg0) {
        if (this.field126 != arg0) {
            this.field413 = -87;
        }
        this.field142.method212(2);
        if (this.field345 == 2) {
            byte[] var2 = this.field149.field1432;
            int[] var3 = class29.field1002;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field291.method285(25, 33, 25, this.field515, this.field341, 256, 33, 0, 0, this.field403, 0);
            this.field143.method212(2);
        } else {
            int var6 = this.field341 + this.field314 & 2047;
            int var7 = field446.field1233 / 32 + 48;
            int var8 = 464 - field446.field1234 / 32;
            this.field464.method285(var7, 146, var8, this.field557, var6, this.field134 + 256, 151, 0, 5, this.field532, 25);
            this.field291.method285(25, 33, 25, this.field515, this.field341, 256, 33, 0, 0, this.field403, 0);
            for (int var9 = 0; var9 < this.field331; ++var9) {
                int var39 = this.field332[var9] * 4 + 2 - field446.field1233 / 32;
                int var40 = this.field333[var9] * 4 + 2 - field446.field1234 / 32;
                this.method57(var40, this.field505[var9], 121, var39);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class66 var36 = this.field572[this.field210][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field446.field1233 / 32;
                        int var38 = var35 * 4 + 2 - field446.field1234 / 32;
                        this.method57(var38, this.field172, 121, var37);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field555; ++var11) {
                class49 var31 = this.field554[this.field556[var11]];
                if (var31 != null && var31.method369(false)) {
                    class68 var32 = var31.field1441;
                    if (var32.field1682 != null) {
                        var32 = var32.method528(-863);
                    }
                    if (var32 != null && var32.field1681 && var32.field1654) {
                        int var33 = var31.field1233 / 32 - field446.field1233 / 32;
                        int var34 = var31.field1234 / 32 - field446.field1234 / 32;
                        this.method57(var34, this.field173, 121, var33);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field492; ++var12) {
                class39 var23 = this.field491[this.field493[var12]];
                if (var23 != null && var23.method369(false)) {
                    int var24 = var23.field1233 / 32 - field446.field1233 / 32;
                    int var25 = var23.field1234 / 32 - field446.field1234 / 32;
                    boolean var26 = false;
                    long var27 = class26.method253(var23.field1271);
                    for (int var29 = 0; var29 < this.field424; ++var29) {
                        if (this.field111[var29] == var27 && this.field123[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field446.field1254 != 0 && var23.field1254 != 0 && field446.field1254 == var23.field1254) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method57(var25, this.field175, 121, var24);
                    } else if (var30) {
                        this.method57(var25, this.field176, 121, var24);
                    } else {
                        this.method57(var25, this.field174, 121, var24);
                    }
                }
            }
            if (this.field550 != 0 && field441 % 20 < 10) {
                if (this.field550 == 1 && this.field168 >= 0 && this.field168 < this.field554.length) {
                    class49 var13 = this.field554[this.field168];
                    if (var13 != null) {
                        int var14 = var13.field1233 / 32 - field446.field1233 / 32;
                        int var15 = var13.field1234 / 32 - field446.field1234 / 32;
                        this.method121(var14, var15, this.field246, 730);
                    }
                }
                if (this.field550 == 2) {
                    int var16 = (this.field415 - this.field185) * 4 + 2 - field446.field1233 / 32;
                    int var17 = (this.field416 - this.field186) * 4 + 2 - field446.field1234 / 32;
                    this.method121(var16, var17, this.field246, 730);
                }
                if (this.field550 == 10 && this.field284 >= 0 && this.field284 < this.field491.length) {
                    class39 var18 = this.field491[this.field284];
                    if (var18 != null) {
                        int var19 = var18.field1233 / 32 - field446.field1233 / 32;
                        int var20 = var18.field1234 / 32 - field446.field1234 / 32;
                        this.method121(var19, var20, this.field246, 730);
                    }
                }
            }
            if (this.field462 != 0) {
                int var21 = this.field462 * 4 + 2 - field446.field1233 / 32;
                int var22 = this.field463 * 4 + 2 - field446.field1234 / 32;
                this.method57(var22, this.field245, 121, var21);
            }
            class29.method269(16777215, 3, 3, 78, 97, -48531);
            this.field143.method212(2);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method167(String arg0) throws IOException {
        if (!this.field427) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field375 != null) {
                try {
                    this.field375.close();
                } catch (Exception var4) {
                }
                this.field375 = null;
            }
            this.field375 = this.method162(43595);
            this.field375.setSoTimeout(10000);
            InputStream var2 = this.field375.getInputStream();
            OutputStream var3 = this.field375.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method168(int arg0) {
        if (arg0 < 9 || arg0 > 9) {
            this.field458 = -1;
        }
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method169(int arg0) {
        if (!this.field475 && !this.field106 && !this.field423) {
            ++field441;
            if (arg0 < 0) {
                if (!this.field535) {
                    this.method163(this.field145);
                } else {
                    this.method109(true);
                }
                this.method59(-472);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILCPNGZAUN;III)V")
    public final void method170(int arg0, int arg1, int arg2, class9 arg3, int arg4, int arg5, int arg6) {
        if (arg3.field638 == 0 && arg3.field671 != null && !arg3.field647) {
            if (arg2 >= arg6 && arg1 >= arg0 && arg2 <= arg3.field666 + arg6 && arg1 <= arg3.field642 + arg0) {
                int var8 = arg3.field671.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg3.field692[var9] + arg6;
                    int var11 = arg3.field700[var9] + arg0 - arg4;
                    class9 var12 = class9.field645[arg3.field671[var9]];
                    int var13 = var12.field678 + var10;
                    int var14 = var12.field701 + var11;
                    if ((var12.field674 >= 0 || var12.field706 != 0) && arg2 >= var13 && arg1 >= var14 && arg2 < var12.field666 + var13 && arg1 < var12.field642 + var14) {
                        if (var12.field674 >= 0) {
                            this.field411 = var12.field674;
                        } else {
                            this.field411 = var12.field649;
                        }
                    }
                    if (var12.field638 == 0) {
                        this.method170(var14, arg1, arg2, var12, var12.field639, 0, var13);
                        if (var12.field685 > var12.field642) {
                            this.method89(var14, arg1, true, var12.field685, var12.field642, this.field338, var12.field666 + var13, arg2, var12);
                        }
                    } else {
                        if (var12.field667 == 1 && arg2 >= var13 && arg1 >= var14 && arg2 < var12.field666 + var13 && arg1 < var12.field642 + var14) {
                            boolean var15 = false;
                            if (var12.field677 != 0) {
                                var15 = this.method107(511, var12);
                            }
                            if (!var15) {
                                this.field450[this.field484] = var12.field704;
                                this.field409[this.field484] = 931;
                                this.field408[this.field484] = var12.field649;
                                ++this.field484;
                            }
                        }
                        if (var12.field667 == 2 && this.field308 == 0 && arg2 >= var13 && arg1 >= var14 && arg2 < var12.field666 + var13 && arg1 < var12.field642 + var14) {
                            String var16 = var12.field644;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field450[this.field484] = var16 + " @gre@" + var12.field698;
                            this.field409[this.field484] = 763;
                            this.field408[this.field484] = var12.field649;
                            ++this.field484;
                        }
                        if (var12.field667 == 3 && arg2 >= var13 && arg1 >= var14 && arg2 < var12.field666 + var13 && arg1 < var12.field642 + var14) {
                            this.field450[this.field484] = "Close";
                            this.field409[this.field484] = 293;
                            this.field408[this.field484] = var12.field649;
                            ++this.field484;
                        }
                        if (var12.field667 == 4 && arg2 >= var13 && arg1 >= var14 && arg2 < var12.field666 + var13 && arg1 < var12.field642 + var14) {
                            this.field450[this.field484] = var12.field704;
                            this.field409[this.field484] = 228;
                            this.field408[this.field484] = var12.field649;
                            ++this.field484;
                        }
                        if (var12.field667 == 5 && arg2 >= var13 && arg1 >= var14 && arg2 < var12.field666 + var13 && arg1 < var12.field642 + var14) {
                            this.field450[this.field484] = var12.field704;
                            this.field409[this.field484] = 867;
                            this.field408[this.field484] = var12.field649;
                            ++this.field484;
                        }
                        if (var12.field667 == 6 && !this.field524 && arg2 >= var13 && arg1 >= var14 && arg2 < var12.field666 + var13 && arg1 < var12.field642 + var14) {
                            this.field450[this.field484] = var12.field704;
                            this.field409[this.field484] = 805;
                            this.field408[this.field484] = var12.field649;
                            ++this.field484;
                        }
                        if (var12.field638 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field642; ++var18) {
                                for (int var19 = 0; var19 < var12.field666; ++var19) {
                                    int var20 = (var12.field691 + 32) * var19 + var13;
                                    int var21 = (var12.field664 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field689[var17];
                                        var21 += var12.field688[var17];
                                    }
                                    if (arg2 >= var20 && arg1 >= var21 && arg2 < var20 + 32 && arg1 < var21 + 32) {
                                        this.field541 = var17;
                                        this.field542 = var12.field649;
                                        if (var12.field693[var17] > 0) {
                                            class46 var22 = class46.method416(var12.field693[var17] - 1);
                                            if (this.field519 == 1 && var12.field684) {
                                                if (this.field521 != var12.field649 || this.field520 != var17) {
                                                    this.field450[this.field484] = "Use " + this.field523 + " with @lre@" + var22.field1382;
                                                    this.field409[this.field484] = 965;
                                                    this.field410[this.field484] = var22.field1409;
                                                    this.field407[this.field484] = var17;
                                                    this.field408[this.field484] = var12.field649;
                                                    ++this.field484;
                                                }
                                            } else if (this.field308 == 1 && var12.field684) {
                                                if ((this.field310 & 16) == 16) {
                                                    this.field450[this.field484] = this.field311 + " @lre@" + var22.field1382;
                                                    this.field409[this.field484] = 320;
                                                    this.field410[this.field484] = var22.field1409;
                                                    this.field407[this.field484] = var17;
                                                    this.field408[this.field484] = var12.field649;
                                                    ++this.field484;
                                                }
                                            } else {
                                                if (var12.field684) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field1410 != null && var22.field1410[var23] != null) {
                                                            this.field450[this.field484] = var22.field1410[var23] + " @lre@" + var22.field1382;
                                                            if (var23 == 3) {
                                                                this.field409[this.field484] = 919;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field409[this.field484] = 421;
                                                            }
                                                            this.field410[this.field484] = var22.field1409;
                                                            this.field407[this.field484] = var17;
                                                            this.field408[this.field484] = var12.field649;
                                                            ++this.field484;
                                                        } else if (var23 == 4) {
                                                            this.field450[this.field484] = "Drop @lre@" + var22.field1382;
                                                            this.field409[this.field484] = 421;
                                                            this.field410[this.field484] = var22.field1409;
                                                            this.field407[this.field484] = var17;
                                                            this.field408[this.field484] = var12.field649;
                                                            ++this.field484;
                                                        }
                                                    }
                                                }
                                                if (var12.field687) {
                                                    this.field450[this.field484] = "Use @lre@" + var22.field1382;
                                                    this.field409[this.field484] = 534;
                                                    this.field410[this.field484] = var22.field1409;
                                                    this.field407[this.field484] = var17;
                                                    this.field408[this.field484] = var12.field649;
                                                    ++this.field484;
                                                }
                                                if (var12.field684 && var22.field1410 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field1410[var24] != null) {
                                                            this.field450[this.field484] = var22.field1410[var24] + " @lre@" + var22.field1382;
                                                            if (var24 == 0) {
                                                                this.field409[this.field484] = 550;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field409[this.field484] = 135;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field409[this.field484] = 580;
                                                            }
                                                            this.field410[this.field484] = var22.field1409;
                                                            this.field407[this.field484] = var17;
                                                            this.field408[this.field484] = var12.field649;
                                                            ++this.field484;
                                                        }
                                                    }
                                                }
                                                if (var12.field655 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field655[var25] != null) {
                                                            this.field450[this.field484] = var12.field655[var25] + " @lre@" + var22.field1382;
                                                            if (var25 == 0) {
                                                                this.field409[this.field484] = 993;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field409[this.field484] = 583;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field409[this.field484] = 646;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field409[this.field484] = 239;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field409[this.field484] = 290;
                                                            }
                                                            this.field410[this.field484] = var22.field1409;
                                                            this.field407[this.field484] = var17;
                                                            this.field408[this.field484] = var12.field649;
                                                            ++this.field484;
                                                        }
                                                    }
                                                }
                                                this.field450[this.field484] = "Examine @lre@" + var22.field1382;
                                                this.field409[this.field484] = 1176;
                                                this.field410[this.field484] = var22.field1409;
                                                this.field407[this.field484] = var17;
                                                this.field408[this.field484] = var12.field649;
                                                ++this.field484;
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        }
                    }
                }
                if (arg5 != 0) {
                    this.method173();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IZ)V")
    public final void method171(int arg0, boolean arg1) {
        int var3 = class40.field1281[arg0].field1289;
        if (!arg1) {
            if (var3 != 0) {
                int var4 = this.field530[arg0];
                if (var3 == 1) {
                    if (var4 == 1) {
                        class8.method192(false, 0.9D);
                    }
                    if (var4 == 2) {
                        class8.method192(false, 0.8D);
                    }
                    if (var4 == 3) {
                        class8.method192(false, 0.7D);
                    }
                    if (var4 == 4) {
                        class8.method192(false, 0.6D);
                    }
                    class46.field1381.method230();
                    this.field563 = true;
                }
                if (var3 == 3) {
                    boolean var5 = this.field349;
                    if (var4 == 0) {
                        this.method75((byte) 9, this.field349, 0);
                        this.field349 = true;
                    }
                    if (var4 == 1) {
                        this.method75((byte) 9, this.field349, -400);
                        this.field349 = true;
                    }
                    if (var4 == 2) {
                        this.method75((byte) 9, this.field349, -800);
                        this.field349 = true;
                    }
                    if (var4 == 3) {
                        this.method75((byte) 9, this.field349, -1200);
                        this.field349 = true;
                    }
                    if (var4 == 4) {
                        this.field349 = false;
                    }
                    if (this.field349 != var5 && !field392) {
                        if (this.field349) {
                            this.field326 = this.field404;
                            this.field327 = true;
                            this.field486.method409(2, this.field326);
                        } else {
                            this.method168(9);
                        }
                        this.field247 = 0;
                    }
                }
                if (var3 == 4) {
                    if (var4 == 0) {
                        this.field508 = true;
                        this.method165(3, 0);
                    }
                    if (var4 == 1) {
                        this.field508 = true;
                        this.method165(3, -400);
                    }
                    if (var4 == 2) {
                        this.field508 = true;
                        this.method165(3, -800);
                    }
                    if (var4 == 3) {
                        this.field508 = true;
                        this.method165(3, -1200);
                    }
                    if (var4 == 4) {
                        this.field508 = false;
                    }
                }
                if (var3 == 5) {
                    this.field498 = var4;
                }
                if (var3 == 6) {
                    this.field380 = var4;
                }
                if (var3 == 8) {
                    this.field551 = var4;
                    this.field252 = true;
                }
                if (var3 == 9) {
                    this.field544 = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method172(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field357 = !this.field357;
        }
        class9 var3 = class9.field645[arg1];
        for (int var4 = 0; var4 < var3.field671.length && var3.field671[var4] != -1; ++var4) {
            class9 var5 = class9.field645[var3.field671[var4]];
            if (var5.field638 == 1) {
                this.method172(0, var5.field649);
            }
            var5.field646 = 0;
            var5.field641 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method173() {
        this.method81(20, -947, "Starting up");
        if (signlink.sunjava) {
            super.field911 = 5;
        }
        if (field112) {
            this.field475 = true;
        } else {
            field112 = true;
            boolean var1 = false;
            String var2 = this.method98((byte) -39);
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
                this.field423 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field456[var3] = new class50(var3 + 1, 500000, signlink.cache_dat, 3, signlink.cache_idx[var3]);
                    }
                }
                try {
                    this.method95(false);
                    this.field122 = this.method99(1, "title", this.field412[1], "title screen", 25, field576);
                    this.field499 = new class23(this.field122, false, -864, "p11_full");
                    this.field500 = new class23(this.field122, false, -864, "p12_full");
                    this.field501 = new class23(this.field122, false, -864, "b12_full");
                    this.field502 = new class23(this.field122, true, -864, "q8_full");
                    this.method134(field466);
                    this.method44(-183);
                    class31 var4 = this.method99(2, "config", this.field412[2], "config", 30, field576);
                    class31 var5 = this.method99(3, "interface", this.field412[3], "interface", 35, field576);
                    class31 var6 = this.method99(4, "media", this.field412[4], "2d graphics", 40, field576);
                    class31 var7 = this.method99(6, "textures", this.field412[6], "textures", 45, field576);
                    class31 var8 = this.method99(7, "wordenc", this.field412[7], "chat system", 50, field576);
                    class31 var9 = this.method99(8, "sounds", this.field412[8], "sound effects", 55, field576);
                    this.field549 = new byte[4][104][104];
                    this.field161 = new int[4][105][105];
                    this.field543 = new class32(this.field161, 4, 104, 104, 22428);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field306[var10] = new class35(104, 104, -652);
                    }
                    this.field464 = new class30(512, 512);
                    class31 var11 = this.method99(5, "versionlist", this.field412[5], "update list", 60, field576);
                    this.method81(60, -947, "Connecting to update server");
                    this.field486 = new class44();
                    this.field486.method399(var11, this);
                    class41.method379(this.field486.method407(473));
                    class4.method8(this.field486.method402(179, 0), this.field486);
                    if (!field392) {
                        this.field326 = 0;
                        try {
                            this.field326 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field327 = true;
                        this.field486.method409(2, this.field326);
                        while (this.field486.method405() > 0) {
                            this.method59(-472);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field486.field1356 > 3) {
                                this.method142("ondemand");
                                return;
                            }
                        }
                    }
                    this.method81(65, -947, "Requesting animations");
                    int var12 = this.field486.method402(179, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field486.method409(1, var13);
                    }
                    while (this.field486.method405() > 0) {
                        int var14 = var12 - this.field486.method405();
                        if (var14 > 0) {
                            this.method81(65, -947, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method59(-472);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field486.field1356 > 3) {
                            this.method142("ondemand");
                            return;
                        }
                    }
                    this.method81(70, -947, "Requesting models");
                    int var15 = this.field486.method402(179, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field486.method395(true, var16);
                        if ((var17 & 1) != 0) {
                            this.field486.method409(0, var16);
                        }
                    }
                    int var18 = this.field486.method405();
                    while (this.field486.method405() > 0) {
                        int var19 = var18 - this.field486.method405();
                        if (var19 > 0) {
                            this.method81(70, -947, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method59(-472);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field456[0] != null) {
                        this.method81(75, -947, "Requesting maps");
                        this.field486.method409(3, this.field486.method388(0, 5, 47, 48));
                        this.field486.method409(3, this.field486.method388(1, 5, 47, 48));
                        this.field486.method409(3, this.field486.method388(0, 5, 48, 48));
                        this.field486.method409(3, this.field486.method388(1, 5, 48, 48));
                        this.field486.method409(3, this.field486.method388(0, 5, 49, 48));
                        this.field486.method409(3, this.field486.method388(1, 5, 49, 48));
                        this.field486.method409(3, this.field486.method388(0, 5, 47, 47));
                        this.field486.method409(3, this.field486.method388(1, 5, 47, 47));
                        this.field486.method409(3, this.field486.method388(0, 5, 48, 47));
                        this.field486.method409(3, this.field486.method388(1, 5, 48, 47));
                        this.field486.method409(3, this.field486.method388(0, 5, 48, 148));
                        this.field486.method409(3, this.field486.method388(1, 5, 48, 148));
                        int var20 = this.field486.method405();
                        while (this.field486.method405() > 0) {
                            int var21 = var20 - this.field486.method405();
                            if (var21 > 0) {
                                this.method81(75, -947, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method59(-472);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field486.method402(179, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field486.method395(true, var23);
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
                            this.field486.method389(false, 0, var23, var25);
                        }
                    }
                    this.field486.method403(field391, (byte) -44);
                    if (!field392) {
                        int var26 = this.field486.method402(179, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field486.method397(true, var27)) {
                                this.field486.method389(false, 2, var27, (byte) 1);
                            }
                        }
                    }
                    this.method81(80, -947, "Unpacking media");
                    this.field148 = new class47(var6, "invback", 0);
                    this.field150 = new class47(var6, "chatback", 0);
                    this.field149 = new class47(var6, "mapback", 0);
                    this.field451 = new class47(var6, "backbase1", 0);
                    this.field452 = new class47(var6, "backbase2", 0);
                    this.field453 = new class47(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field482[var28] = new class47(var6, "sideicons", var28);
                    }
                    this.field291 = new class30(var6, "compass", 0);
                    this.field222 = new class30(var6, "mapedge", 0);
                    this.field222.method278(field516);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field429[var29] = new class47(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field534[var30] = new class30(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field296[var31] = new class30(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field348[var32] = new class30(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field245 = new class30(var6, "mapmarker", 0);
                    this.field246 = new class30(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field393[var33] = new class30(var6, "cross", var33);
                    }
                    this.field172 = new class30(var6, "mapdots", 0);
                    this.field173 = new class30(var6, "mapdots", 1);
                    this.field174 = new class30(var6, "mapdots", 2);
                    this.field175 = new class30(var6, "mapdots", 3);
                    this.field176 = new class30(var6, "mapdots", 4);
                    this.field567 = new class47(var6, "scrollbar", 0);
                    this.field568 = new class47(var6, "scrollbar", 1);
                    this.field201 = new class47(var6, "redstone1", 0);
                    this.field202 = new class47(var6, "redstone2", 0);
                    this.field203 = new class47(var6, "redstone3", 0);
                    this.field204 = new class47(var6, "redstone1", 0);
                    this.field204.method425(field503);
                    this.field205 = new class47(var6, "redstone2", 0);
                    this.field205.method425(field503);
                    this.field180 = new class47(var6, "redstone1", 0);
                    this.field180.method426(false);
                    this.field181 = new class47(var6, "redstone2", 0);
                    this.field181.method426(false);
                    this.field182 = new class47(var6, "redstone3", 0);
                    this.field182.method426(false);
                    this.field183 = new class47(var6, "redstone1", 0);
                    this.field183.method425(field503);
                    this.field183.method426(false);
                    this.field184 = new class47(var6, "redstone2", 0);
                    this.field184.method425(field503);
                    this.field184.method426(false);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field273[var34] = new class47(var6, "mod_icons", var34);
                    }
                    class30 var35 = new class30(var6, "backleft1", 0);
                    this.field113 = new class16(var35.field1026, this.method49(8), true, var35.field1025);
                    var35.method279(0, 607, 0);
                    class30 var36 = new class30(var6, "backleft2", 0);
                    this.field114 = new class16(var36.field1026, this.method49(8), true, var36.field1025);
                    var36.method279(0, 607, 0);
                    class30 var37 = new class30(var6, "backright1", 0);
                    this.field115 = new class16(var37.field1026, this.method49(8), true, var37.field1025);
                    var37.method279(0, 607, 0);
                    class30 var38 = new class30(var6, "backright2", 0);
                    this.field116 = new class16(var38.field1026, this.method49(8), true, var38.field1025);
                    var38.method279(0, 607, 0);
                    class30 var39 = new class30(var6, "backtop1", 0);
                    this.field117 = new class16(var39.field1026, this.method49(8), true, var39.field1025);
                    var39.method279(0, 607, 0);
                    class30 var40 = new class30(var6, "backvmid1", 0);
                    this.field118 = new class16(var40.field1026, this.method49(8), true, var40.field1025);
                    var40.method279(0, 607, 0);
                    class30 var41 = new class30(var6, "backvmid2", 0);
                    this.field119 = new class16(var41.field1026, this.method49(8), true, var41.field1025);
                    var41.method279(0, 607, 0);
                    class30 var42 = new class30(var6, "backvmid3", 0);
                    this.field120 = new class16(var42.field1026, this.method49(8), true, var42.field1025);
                    var42.method279(0, 607, 0);
                    class30 var43 = new class30(var6, "backhmid2", 0);
                    this.field121 = new class16(var43.field1026, this.method49(8), true, var43.field1025);
                    var43.method279(0, 607, 0);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field534[var48] != null) {
                            this.field534[var48].method277(var44 + var47, true, var45 + var47, var46 + var47);
                        }
                        if (this.field429[var48] != null) {
                            this.field429[var48].method427(var44 + var47, true, var45 + var47, var46 + var47);
                        }
                    }
                    this.method81(83, -947, "Unpacking textures");
                    class8.method188(var7, 7);
                    class8.method192(false, 0.8D);
                    class8.method187(20, 590);
                    this.method81(86, -947, "Unpacking config");
                    class20.method225(var4, 0);
                    class33.method346(var4);
                    class19.method221(var4, 0);
                    class46.method421(var4);
                    class68.method532(var4);
                    class17.method215(var4, 0);
                    class71.method588(var4, 0);
                    class40.method377(var4, 0);
                    class14.method206(var4, 0);
                    class46.field1390 = field391;
                    if (!field392) {
                        this.method81(90, -947, "Unpacking sounds");
                        byte[] var49 = var9.method290("sounds.dat", (byte[]) null);
                        class69 var50 = new class69(var49, field428);
                        class55.method448(var50, 0);
                    }
                    this.method81(95, -947, "Unpacking interfaces");
                    class23[] var51 = new class23[] { this.field499, this.field500, this.field501, this.field502 };
                    class9.method205(var51, field487, var6, var5);
                    this.method81(100, -947, "Preparing game engine");
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field149.field1432[this.field149.field1434 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field515[var52] = var53;
                        this.field403[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field149.field1432[this.field149.field1434 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
                                if (var57 == 999) {
                                    var57 = var59;
                                }
                            } else if (var57 != 999) {
                                var58 = var59;
                                break;
                            }
                        }
                        this.field557[var56 - 5] = var57 - 25;
                        this.field532[var56 - 5] = var58 - var57;
                    }
                    class8.method185(479, (byte) 4, 96);
                    this.field328 = class8.field625;
                    class8.method185(190, (byte) 4, 261);
                    this.field329 = class8.field625;
                    class8.method185(512, (byte) 4, 334);
                    this.field330 = class8.field625;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = class8.field623[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    class32.method328(334, 274, 500, 512, 800, var60);
                    class60.method458(var8);
                    this.field400 = new class18(1, this);
                    this.method124(this.field400, 10);
                    class24.field966 = this;
                    class33.field1146 = this;
                    class68.field1656 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field281 + " " + this.field224);
                    this.field106 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IILZOMNSJJM;)V")
    private final void method174(int arg0, int arg1, class69 arg2) {
        for (int var4 = 0; var4 < this.field494; ++var4) {
            int var6 = this.field495[var4];
            class49 var7 = this.field554[var6];
            int var8 = arg2.method547();
            if ((var8 & 2) != 0) {
                var7.field1209 = arg2.method554();
                var7.field1229 = 100;
            }
            if ((var8 & 64) != 0) {
                var7.field1441 = class68.method529(arg2.method574((byte) 3));
                var7.field1214 = var7.field1441.field1669;
                var7.field1222 = var7.field1441.field1670;
                var7.field1205 = var7.field1441.field1663;
                var7.field1206 = var7.field1441.field1676;
                var7.field1207 = var7.field1441.field1644;
                var7.field1208 = var7.field1441.field1650;
                var7.field1210 = var7.field1441.field1677;
            }
            if ((var8 & 8) != 0) {
                int var9 = arg2.method567(3);
                int var10 = arg2.method567(3);
                var7.method370(field441, var10, var9, 8);
                var7.field1224 = field441 + 300;
                var7.field1225 = arg2.method567(3);
                var7.field1226 = arg2.method567(3);
            }
            if ((var8 & 16) != 0) {
                var7.field1252 = arg2.method575(263);
                if (var7.field1252 == 65535) {
                    var7.field1252 = -1;
                }
            }
            if ((var8 & 32) != 0) {
                int var11 = arg2.method573(7);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg2.method567(3);
                if (var7.field1245 == var11 && var11 != -1) {
                    int var13 = class20.field875[var11].field889;
                    if (var13 == 1) {
                        var7.field1246 = 0;
                        var7.field1247 = 0;
                        var7.field1248 = var12;
                        var7.field1249 = 0;
                    }
                    if (var13 == 2) {
                        var7.field1249 = 0;
                    }
                } else if (var11 == -1 || var7.field1245 == -1 || class20.field875[var11].field883 >= class20.field875[var7.field1245].field883) {
                    var7.field1245 = var11;
                    var7.field1246 = 0;
                    var7.field1247 = 0;
                    var7.field1248 = var12;
                    var7.field1249 = 0;
                    var7.field1215 = var7.field1220;
                }
            }
            if ((var8 & 128) != 0) {
                var7.field1200 = arg2.method573(7);
                int var14 = arg2.method552();
                var7.field1204 = var14 >> 16;
                var7.field1203 = (var14 & 65535) + field441;
                var7.field1201 = 0;
                var7.field1202 = 0;
                if (var7.field1203 > field441) {
                    var7.field1201 = -1;
                }
                if (var7.field1200 == 65535) {
                    var7.field1200 = -1;
                }
            }
            if ((var8 & 1) != 0) {
                var7.field1243 = arg2.method575(263);
                var7.field1244 = arg2.method574((byte) 3);
            }
            if ((var8 & 4) != 0) {
                int var15 = arg2.method565(38);
                int var16 = arg2.method547();
                var7.method370(field441, var16, var15, 8);
                var7.field1224 = field441 + 300;
                var7.field1225 = arg2.method565(38);
                var7.field1226 = arg2.method547();
            }
        }
        int var5 = 34 / arg1;
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    private static final String method175(boolean arg0, int arg1) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(Z)V")
    public final void method176(boolean arg0) {
        if (arg0) {
            this.method173();
        }
        if (this.field144 == null) {
            this.method112(3);
            super.field918 = null;
            this.field317 = null;
            this.field318 = null;
            this.field319 = null;
            this.field320 = null;
            this.field321 = null;
            this.field322 = null;
            this.field323 = null;
            this.field324 = null;
            this.field325 = null;
            this.field144 = new class16(96, this.method49(8), true, 479);
            this.field142 = new class16(156, this.method49(8), true, 172);
            class29.method267(7);
            this.field149.method428(3, 0, 0);
            this.field141 = new class16(261, this.method49(8), true, 190);
            this.field143 = new class16(334, this.method49(8), true, 512);
            class29.method267(7);
            this.field509 = new class16(50, this.method49(8), true, 496);
            this.field510 = new class16(37, this.method49(8), true, 269);
            this.field511 = new class16(45, this.method49(8), true, 249);
            this.field563 = true;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method177(int arg0, int arg1) {
        class66 var3 = this.field572[this.field210][arg0][arg1];
        if (var3 == null) {
            this.field543.method313(this.field210, arg0, arg1);
        } else {
            int var4 = -99999999;
            class25 var5 = null;
            for (class25 var6 = (class25) var3.method523(); var6 != null; var6 = (class25) var3.method525(-687)) {
                class46 var11 = class46.method416(var6.field972);
                int var12 = var11.field1423;
                if (var11.field1417) {
                    var12 = (var6.field971 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method521(var5, (byte) 6);
            class25 var7 = null;
            class25 var8 = null;
            for (class25 var9 = (class25) var3.method523(); var9 != null; var9 = (class25) var3.method525(-687)) {
                if (var5.field972 != var9.field972 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field972 != var9.field972 && var7.field972 != var9.field972 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field543.method299(var7, this.method151(this.field210, false, arg1 * 128 + 64, arg0 * 128 + 64), (byte) 6, arg0, var10, var8, var5, arg1, this.field210);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLCPNGZAUN;I)I")
    public final int method178(boolean arg0, class9 arg1, int arg2) {
        if (!arg0) {
            return 1;
        } else if (arg1.field648 != null && arg2 < arg1.field648.length) {
            try {
                int[] var4 = arg1.field648[arg2];
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
                        var9 = this.field383[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field570[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field313[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class9 var11 = class9.field645[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class46.field1376 && (!class46.method416(var12).field1383 || field391)) {
                            for (int var13 = 0; var13 < var11.field693.length; ++var13) {
                                if (var12 + 1 == var11.field693[var13]) {
                                    var9 += var11.field637[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field530[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field336[this.field570[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field530[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field446.field1269;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class51.field1450; ++var14) {
                            if (class51.field1452[var14]) {
                                var9 += this.field570[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class9 var15 = class9.field645[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class46.field1376 && (!class46.method416(var16).field1383 || field391)) {
                            for (int var17 = 0; var17 < var15.field693.length; ++var17) {
                                if (var15.field693[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field469;
                    }
                    if (var8 == 12) {
                        var9 = this.field194;
                    }
                    if (var8 == 13) {
                        int var18 = this.field530[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class14 var21 = class14.field795[var20];
                        int var22 = var21.field797;
                        int var23 = var21.field798;
                        int var24 = var21.field799;
                        int var25 = field405[var24 - var23];
                        var9 = this.field530[var22] >> var23 & var25;
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
                        var9 = (field446.field1233 >> 7) + this.field185;
                    }
                    if (var8 == 19) {
                        var9 = (field446.field1234 >> 7) + this.field186;
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

    @OriginalMember(owner = "client", name = "s", descriptor = "(Z)V")
    public final void method179(boolean arg0) {
        this.field141.method212(2);
        class8.field625 = this.field329;
        this.field148.method428(3, 0, 0);
        if (this.field367 != -1) {
            this.method45(7, 0, 0, class9.field645[this.field367], 0);
        } else if (this.field124[this.field546] != -1) {
            this.method45(7, 0, 0, class9.field645[this.field124[this.field546]], 0);
        }
        if (this.field211 && this.field370 == 1) {
            this.method126(false);
        }
        this.field141.method213(9, 553, super.field917, 205);
        this.field143.method212(2);
        if (!arg0) {
            this.field358 = 469;
        }
        class8.field625 = this.field330;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field336[var1] = var0 / 4;
        }
        field364 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field389 = 10;
        field391 = true;
        field405 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field405[var3] = var2 - 1;
            var2 += var2;
        }
        field428 = -302;
        field448 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field466 = -120;
        field487 = -118;
        field503 = 7;
        field516 = -253;
        field525 = true;
        field527 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field576 = -118;
    }
}
