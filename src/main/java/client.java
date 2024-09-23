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

    @OriginalMember(owner = "client", name = "O", descriptor = "[I")
    private int[] field123 = new int[33];

    @OriginalMember(owner = "client", name = "P", descriptor = "[I")
    private int[] field124 = new int[7];

    @OriginalMember(owner = "client", name = "S", descriptor = "[I")
    private int[] field127 = new int[50];

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private final int field128 = 100;

    @OriginalMember(owner = "client", name = "U", descriptor = "[I")
    private int[] field129 = new int[100];

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field140 = -9534;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field142 = 2301979;

    @OriginalMember(owner = "client", name = "jb", descriptor = "[I")
    public int[] field144 = new int[1000];

    @OriginalMember(owner = "client", name = "ob", descriptor = "B")
    private byte field149 = -32;

    @OriginalMember(owner = "client", name = "pb", descriptor = "Z")
    private boolean field150 = false;

    @OriginalMember(owner = "client", name = "qb", descriptor = "[I")
    private int[] field151 = new int[5];

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private int field158 = 78;

    @OriginalMember(owner = "client", name = "yb", descriptor = "Z")
    private boolean field159 = false;

    @OriginalMember(owner = "client", name = "zb", descriptor = "Z")
    private boolean field160 = false;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "Ljava/lang/String;")
    private String field162 = "";

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field170 = -1;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "LJHKSAGUC;")
    private class31 field175 = class31.method294(-37580, 1);

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field178 = -1;

    @OriginalMember(owner = "client", name = "ac", descriptor = "[LDLNMSHLT;")
    private class12[] field187 = new class12[100];

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field188 = 21057;

    @OriginalMember(owner = "client", name = "dc", descriptor = "[[[I")
    private int[][][] field190 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "fc", descriptor = "Z")
    private boolean field192 = false;

    @OriginalMember(owner = "client", name = "gc", descriptor = "[I")
    private int[] field193 = new int[50];

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field195 = 2;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field196 = 3353893;

    @OriginalMember(owner = "client", name = "kc", descriptor = "Z")
    private boolean field197 = false;

    @OriginalMember(owner = "client", name = "lc", descriptor = "B")
    private byte field198 = 1;

    @OriginalMember(owner = "client", name = "mc", descriptor = "[I")
    private int[] field199 = new int[5];

    @OriginalMember(owner = "client", name = "oc", descriptor = "Z")
    private boolean field201 = false;

    @OriginalMember(owner = "client", name = "pc", descriptor = "Z")
    private boolean field202 = false;

    @OriginalMember(owner = "client", name = "qc", descriptor = "B")
    private byte field203 = -91;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field206 = 42086;

    @OriginalMember(owner = "client", name = "vc", descriptor = "[I")
    private int[] field208 = new int[1000];

    @OriginalMember(owner = "client", name = "wc", descriptor = "[I")
    private int[] field209 = new int[1000];

    @OriginalMember(owner = "client", name = "Hc", descriptor = "Z")
    private boolean field220 = false;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "[B")
    private byte[] field224 = new byte[16384];

    @OriginalMember(owner = "client", name = "Pc", descriptor = "Z")
    private boolean field228 = false;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field229 = -1;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "LOUZUCGGU;")
    private class48 field230 = new class48(-392);

    @OriginalMember(owner = "client", name = "Sc", descriptor = "[I")
    private final int[] field231 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field232 = 7759444;

    @OriginalMember(owner = "client", name = "bd", descriptor = "Ljava/lang/String;")
    private String field240 = "";

    @OriginalMember(owner = "client", name = "cd", descriptor = "Ljava/lang/String;")
    private String field241 = "";

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field242 = 6;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field245 = -1;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field246 = 2048;

    @OriginalMember(owner = "client", name = "id", descriptor = "I")
    private int field247 = 2047;

    @OriginalMember(owner = "client", name = "jd", descriptor = "[LFVFJZZXQ;")
    private class21[] field248 = new class21[this.field246];

    @OriginalMember(owner = "client", name = "ld", descriptor = "[I")
    public int[] field250 = new int[this.field246];

    @OriginalMember(owner = "client", name = "nd", descriptor = "[I")
    private int[] field252 = new int[this.field246];

    @OriginalMember(owner = "client", name = "od", descriptor = "[LJHKSAGUC;")
    private class31[] field253 = new class31[this.field246];

    @OriginalMember(owner = "client", name = "pd", descriptor = "LJHKSAGUC;")
    private class31 field254 = class31.method294(-37580, 1);

    @OriginalMember(owner = "client", name = "vd", descriptor = "Z")
    private volatile boolean field260 = false;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field270 = -1;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "Z")
    private boolean field272 = false;

    @OriginalMember(owner = "client", name = "Id", descriptor = "B")
    private byte field273 = 3;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "Z")
    private boolean field274 = false;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private int field278 = 405;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "Z")
    private boolean field281 = false;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "[I")
    private int[] field283 = new int[class15.field647];

    @OriginalMember(owner = "client", name = "Vd", descriptor = "Z")
    private boolean field286 = true;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "LTNOPEJNZ;")
    private class63 field287 = new class63();

    @OriginalMember(owner = "client", name = "Xd", descriptor = "[I")
    private int[] field288 = new int[5];

    @OriginalMember(owner = "client", name = "Yd", descriptor = "[I")
    private int[] field289 = new int[9];

    @OriginalMember(owner = "client", name = "Zd", descriptor = "[I")
    private int[] field290 = new int[33];

    @OriginalMember(owner = "client", name = "be", descriptor = "Z")
    private boolean field292 = false;

    @OriginalMember(owner = "client", name = "ce", descriptor = "[I")
    private int[] field293 = new int[151];

    @OriginalMember(owner = "client", name = "de", descriptor = "Z")
    private boolean field294 = true;

    @OriginalMember(owner = "client", name = "ee", descriptor = "Z")
    public boolean field295 = false;

    @OriginalMember(owner = "client", name = "fe", descriptor = "Z")
    private boolean field296 = false;

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private int field297 = -1;

    @OriginalMember(owner = "client", name = "oe", descriptor = "Z")
    private boolean field305 = false;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field311 = -1;

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    private int field312 = 573;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private int field313 = 788;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field315 = 2;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "Z")
    private boolean field317 = false;

    @OriginalMember(owner = "client", name = "Be", descriptor = "Ljava/lang/String;")
    private String field318 = "";

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field323 = -40997;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "[I")
    private int[] field325 = new int[256];

    @OriginalMember(owner = "client", name = "Le", descriptor = "LJHKSAGUC;")
    private class31 field328 = class31.method294(-37580, 1);

    @OriginalMember(owner = "client", name = "Re", descriptor = "[I")
    private int[] field334 = new int[2000];

    @OriginalMember(owner = "client", name = "Se", descriptor = "Ljava/lang/String;")
    private String field335 = "";

    @OriginalMember(owner = "client", name = "Te", descriptor = "Ljava/lang/String;")
    private String field336 = "";

    @OriginalMember(owner = "client", name = "Xe", descriptor = "[Ljava/lang/String;")
    private String[] field340 = new String[200];

    @OriginalMember(owner = "client", name = "cf", descriptor = "[[I")
    private int[][] field345 = new int[104][104];

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field347 = 5;

    @OriginalMember(owner = "client", name = "ff", descriptor = "[LKQOBJHBO;")
    public class34[] field348 = new class34[5];

    @OriginalMember(owner = "client", name = "mf", descriptor = "[LDLNMSHLT;")
    private class12[] field354 = new class12[1000];

    @OriginalMember(owner = "client", name = "sf", descriptor = "Z")
    public boolean field360 = true;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private int field362 = 50;

    @OriginalMember(owner = "client", name = "vf", descriptor = "[I")
    private int[] field363 = new int[this.field362];

    @OriginalMember(owner = "client", name = "wf", descriptor = "[I")
    private int[] field364 = new int[this.field362];

    @OriginalMember(owner = "client", name = "xf", descriptor = "[I")
    private int[] field365 = new int[this.field362];

    @OriginalMember(owner = "client", name = "yf", descriptor = "[I")
    private int[] field366 = new int[this.field362];

    @OriginalMember(owner = "client", name = "zf", descriptor = "[I")
    private int[] field367 = new int[this.field362];

    @OriginalMember(owner = "client", name = "Af", descriptor = "[I")
    private int[] field368 = new int[this.field362];

    @OriginalMember(owner = "client", name = "Bf", descriptor = "[I")
    private int[] field369 = new int[this.field362];

    @OriginalMember(owner = "client", name = "Cf", descriptor = "[Ljava/lang/String;")
    private String[] field370 = new String[this.field362];

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private int field373 = -374;

    @OriginalMember(owner = "client", name = "Of", descriptor = "[LYAPSNHGU;")
    private class71[] field382 = new class71[2];

    @OriginalMember(owner = "client", name = "Qf", descriptor = "Z")
    private boolean field384 = false;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "[LYAPSNHGU;")
    private class71[] field385 = new class71[13];

    @OriginalMember(owner = "client", name = "Xf", descriptor = "[I")
    private int[] field391 = new int[class15.field647];

    @OriginalMember(owner = "client", name = "Yf", descriptor = "[I")
    private int[] field392 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field393 = 5063219;

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    private int field400 = -1;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private int field401 = -1;

    @OriginalMember(owner = "client", name = "ig", descriptor = "Z")
    private boolean field402 = true;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field405 = 3;

    @OriginalMember(owner = "client", name = "rg", descriptor = "[I")
    private int[] field411 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "wg", descriptor = "B")
    private byte field416 = -73;

    @OriginalMember(owner = "client", name = "xg", descriptor = "[I")
    private int[] field417 = new int[50];

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field419 = -1;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "[J")
    private long[] field420 = new long[100];

    @OriginalMember(owner = "client", name = "Hg", descriptor = "B")
    private byte field427 = 1;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field428 = 2;

    @OriginalMember(owner = "client", name = "Og", descriptor = "Z")
    private boolean field434 = true;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field435 = 1;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "[I")
    private int[] field436 = new int[5];

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field437 = 6;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field438 = -375;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "LJHKSAGUC;")
    private class31 field439 = new class31(new byte[5000], 8);

    @OriginalMember(owner = "client", name = "Ug", descriptor = "[LNLPNWUNL;")
    private class44[] field440 = new class44[16384];

    @OriginalMember(owner = "client", name = "Wg", descriptor = "[I")
    public int[] field442 = new int[16384];

    @OriginalMember(owner = "client", name = "Zg", descriptor = "I")
    private int field445 = 431;

    @OriginalMember(owner = "client", name = "ah", descriptor = "[LYAPSNHGU;")
    private class71[] field446 = new class71[100];

    @OriginalMember(owner = "client", name = "dh", descriptor = "I")
    private int field449 = 1;

    @OriginalMember(owner = "client", name = "eh", descriptor = "[Ljava/lang/String;")
    private String[] field450 = new String[500];

    @OriginalMember(owner = "client", name = "fh", descriptor = "Z")
    private volatile boolean field451 = false;

    @OriginalMember(owner = "client", name = "kh", descriptor = "I")
    private int field456 = 70;

    @OriginalMember(owner = "client", name = "oh", descriptor = "Z")
    private boolean field460 = false;

    @OriginalMember(owner = "client", name = "qh", descriptor = "LOUZUCGGU;")
    private class48 field462 = new class48(-392);

    @OriginalMember(owner = "client", name = "rh", descriptor = "Z")
    private boolean field463 = false;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "[I")
    private int[] field472 = new int[500];

    @OriginalMember(owner = "client", name = "Bh", descriptor = "[I")
    private int[] field473 = new int[500];

    @OriginalMember(owner = "client", name = "Ch", descriptor = "[I")
    private int[] field474 = new int[500];

    @OriginalMember(owner = "client", name = "Dh", descriptor = "[I")
    private int[] field475 = new int[500];

    @OriginalMember(owner = "client", name = "Gh", descriptor = "[I")
    public int[] field478 = new int[2000];

    @OriginalMember(owner = "client", name = "Jh", descriptor = "Z")
    private boolean field481 = true;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "[LDLNMSHLT;")
    private class12[] field484 = new class12[8];

    @OriginalMember(owner = "client", name = "Nh", descriptor = "[I")
    private int[] field485 = new int[class15.field647];

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private int field486 = 128;

    @OriginalMember(owner = "client", name = "Th", descriptor = "[I")
    private int[] field491 = new int[5];

    @OriginalMember(owner = "client", name = "Uh", descriptor = "[LDLNMSHLT;")
    private class12[] field492 = new class12[20];

    @OriginalMember(owner = "client", name = "Vh", descriptor = "B")
    private byte field493 = 122;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "Z")
    private boolean field494 = false;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "[I")
    private int[] field495 = new int[151];

    @OriginalMember(owner = "client", name = "Yh", descriptor = "[[[LOUZUCGGU;")
    private class48[][][] field496 = new class48[4][104][104];

    @OriginalMember(owner = "client", name = "Zh", descriptor = "[LKFLNJHKB;")
    private class33[] field497 = new class33[4];

    @OriginalMember(owner = "client", name = "hi", descriptor = "Z")
    private boolean field505 = false;

    @OriginalMember(owner = "client", name = "ii", descriptor = "Ljava/lang/String;")
    private String field506 = "";

    @OriginalMember(owner = "client", name = "ji", descriptor = "[I")
    private int[] field507 = new int[200];

    @OriginalMember(owner = "client", name = "ki", descriptor = "[LDLNMSHLT;")
    private class12[] field508 = new class12[20];

    @OriginalMember(owner = "client", name = "li", descriptor = "[J")
    private long[] field509 = new long[200];

    @OriginalMember(owner = "client", name = "mi", descriptor = "B")
    private byte field510 = -32;

    @OriginalMember(owner = "client", name = "ni", descriptor = "Z")
    private boolean field511 = false;

    @OriginalMember(owner = "client", name = "oi", descriptor = "Z")
    private boolean field512 = false;

    @OriginalMember(owner = "client", name = "pi", descriptor = "Z")
    private boolean field513 = true;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field514 = -1;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field515 = -1;

    @OriginalMember(owner = "client", name = "ui", descriptor = "[I")
    private int[] field518 = new int[100];

    @OriginalMember(owner = "client", name = "vi", descriptor = "[Ljava/lang/String;")
    private String[] field519 = new String[100];

    @OriginalMember(owner = "client", name = "wi", descriptor = "[Ljava/lang/String;")
    private String[] field520 = new String[100];

    @OriginalMember(owner = "client", name = "Bi", descriptor = "[[I")
    private int[][] field525 = new int[104][104];

    @OriginalMember(owner = "client", name = "Di", descriptor = "B")
    private byte field527 = 20;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field532 = 2;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "[[I")
    private int[][] field538 = new int[104][104];

    @OriginalMember(owner = "client", name = "Pi", descriptor = "Ljava/lang/String;")
    private String field539 = "";

    @OriginalMember(owner = "client", name = "Qi", descriptor = "[I")
    private int[] field540 = new int[4000];

    @OriginalMember(owner = "client", name = "Ri", descriptor = "[I")
    private int[] field541 = new int[4000];

    @OriginalMember(owner = "client", name = "Ti", descriptor = "Z")
    private volatile boolean field543 = false;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field545 = new CRC32();

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private int field550 = -1;

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field554 = 1;

    @OriginalMember(owner = "client", name = "kj", descriptor = "Ljava/lang/String;")
    private String field560 = "";

    @OriginalMember(owner = "client", name = "mj", descriptor = "[Z")
    private boolean[] field562 = new boolean[5];

    @OriginalMember(owner = "client", name = "nj", descriptor = "Z")
    private boolean field563 = false;

    @OriginalMember(owner = "client", name = "oj", descriptor = "I")
    private int field564 = -984;

    @OriginalMember(owner = "client", name = "pj", descriptor = "Z")
    private boolean field565 = false;

    @OriginalMember(owner = "client", name = "tj", descriptor = "I")
    private int field569 = -1;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "Z")
    private boolean field579 = false;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "[Ljava/lang/String;")
    private String[] field580 = new String[5];

    @OriginalMember(owner = "client", name = "Fj", descriptor = "[Z")
    private boolean[] field581 = new boolean[5];

    @OriginalMember(owner = "client", name = "Hj", descriptor = "LOUZUCGGU;")
    private class48 field583 = new class48(-392);

    @OriginalMember(owner = "client", name = "Ij", descriptor = "I")
    private int field584 = -499;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "Z")
    private boolean field585 = false;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "Z")
    private boolean field586 = false;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private static int field125 = 4;

    @OriginalMember(owner = "client", name = "Md", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field277 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "ze", descriptor = "[[I")
    public static final int[][] field316 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "Ue", descriptor = "Ljava/lang/String;")
    private static String field337 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "Ye", descriptor = "[I")
    private static int[] field341 = new int[99];

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private static int field423;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "Z")
    private static boolean field425;

    @OriginalMember(owner = "client", name = "jh", descriptor = "B")
    private static byte field455;

    @OriginalMember(owner = "client", name = "ph", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field461;

    @OriginalMember(owner = "client", name = "sh", descriptor = "[I")
    public static final int[] field464;

    @OriginalMember(owner = "client", name = "rj", descriptor = "[I")
    public static int[] field567;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field121;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private static int field122;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private int field126;

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    private int field141;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field143;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private static int field145;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field155;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field161;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field169;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field172;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "I")
    private int field173;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field179;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field189;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "I")
    private int field225;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private static int field233;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field244;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field249;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field251;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private int field255;

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client", name = "sd", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private int field259;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    public int field268;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    public int field269;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private static int field276;

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private static int field279;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private static int field303;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    public int field306;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private int field309;

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field324;

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private static int field338;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client", name = "af", descriptor = "I")
    private int field343;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field346;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private static int field374;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field378;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "I")
    private static int field381;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private static int field383;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field388;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private static int field390;

    @OriginalMember(owner = "client", name = "ag", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client", name = "dg", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private static int field412;

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field414;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private static int field418;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field421;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client", name = "bh", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client", name = "ch", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field452;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private static int field453;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field465;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field467;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field477;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field479;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private static int field526;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private int field535;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field536;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private static int field544;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private int field546;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private int field549;

    @OriginalMember(owner = "client", name = "bj", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client", name = "dj", descriptor = "I")
    private int field553;

    @OriginalMember(owner = "client", name = "fj", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client", name = "gj", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client", name = "hj", descriptor = "I")
    private int field557;

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private int field558;

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private int field559;

    @OriginalMember(owner = "client", name = "lj", descriptor = "I")
    private static int field561;

    @OriginalMember(owner = "client", name = "qj", descriptor = "I")
    private int field566;

    @OriginalMember(owner = "client", name = "sj", descriptor = "I")
    private int field568;

    @OriginalMember(owner = "client", name = "uj", descriptor = "I")
    private int field570;

    @OriginalMember(owner = "client", name = "vj", descriptor = "I")
    private int field571;

    @OriginalMember(owner = "client", name = "wj", descriptor = "I")
    private int field572;

    @OriginalMember(owner = "client", name = "xj", descriptor = "I")
    private int field573;

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private int field574;

    @OriginalMember(owner = "client", name = "zj", descriptor = "I")
    private int field575;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client", name = "Bj", descriptor = "I")
    private int field577;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client", name = "ec", descriptor = "J")
    private long field191;

    @OriginalMember(owner = "client", name = "nc", descriptor = "J")
    public long field200;

    @OriginalMember(owner = "client", name = "xc", descriptor = "J")
    private long field210;

    @OriginalMember(owner = "client", name = "wd", descriptor = "J")
    private long field261;

    @OriginalMember(owner = "client", name = "We", descriptor = "J")
    private long field339;

    @OriginalMember(owner = "client", name = "vb", descriptor = "LDLNMSHLT;")
    private class12 field156;

    @OriginalMember(owner = "client", name = "wb", descriptor = "LDLNMSHLT;")
    private class12 field157;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "LDLNMSHLT;")
    private class12 field163;

    @OriginalMember(owner = "client", name = "Df", descriptor = "LDLNMSHLT;")
    private class12 field371;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "LDLNMSHLT;")
    private class12 field372;

    @OriginalMember(owner = "client", name = "jg", descriptor = "LDLNMSHLT;")
    private class12 field403;

    @OriginalMember(owner = "client", name = "kg", descriptor = "LDLNMSHLT;")
    private class12 field404;

    @OriginalMember(owner = "client", name = "mg", descriptor = "LDLNMSHLT;")
    private class12 field406;

    @OriginalMember(owner = "client", name = "ng", descriptor = "LDLNMSHLT;")
    private class12 field407;

    @OriginalMember(owner = "client", name = "og", descriptor = "LDLNMSHLT;")
    private class12 field408;

    @OriginalMember(owner = "client", name = "pg", descriptor = "LDLNMSHLT;")
    private class12 field409;

    @OriginalMember(owner = "client", name = "qg", descriptor = "LDLNMSHLT;")
    private class12 field410;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "LDLNMSHLT;")
    private class12 field480;

    @OriginalMember(owner = "client", name = "fi", descriptor = "LDLNMSHLT;")
    private class12 field503;

    @OriginalMember(owner = "client", name = "ih", descriptor = "LFVFJZZXQ;")
    public static class21 field454;

    @OriginalMember(owner = "client", name = "re", descriptor = "LHRXSNEYZ;")
    private class26 field308;

    @OriginalMember(owner = "client", name = "of", descriptor = "LQJBJRTJO;")
    private class54 field356;

    @OriginalMember(owner = "client", name = "pf", descriptor = "LQJBJRTJO;")
    private class54 field357;

    @OriginalMember(owner = "client", name = "qf", descriptor = "LQJBJRTJO;")
    private class54 field358;

    @OriginalMember(owner = "client", name = "rf", descriptor = "LQJBJRTJO;")
    private class54 field359;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "LQLBHZVFC;")
    private class55 field322;

    @OriginalMember(owner = "client", name = "xi", descriptor = "LUMYAUCNU;")
    private class65 field521;

    @OriginalMember(owner = "client", name = "nb", descriptor = "LVCAZMAEX;")
    public class66 field148;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "LVCPXACGS;")
    private class67 field234;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "LYAPSNHGU;")
    private class71 field176;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "LYAPSNHGU;")
    private class71 field177;

    @OriginalMember(owner = "client", name = "he", descriptor = "LYAPSNHGU;")
    private class71 field298;

    @OriginalMember(owner = "client", name = "ie", descriptor = "LYAPSNHGU;")
    private class71 field299;

    @OriginalMember(owner = "client", name = "je", descriptor = "LYAPSNHGU;")
    private class71 field300;

    @OriginalMember(owner = "client", name = "ke", descriptor = "LYAPSNHGU;")
    private class71 field301;

    @OriginalMember(owner = "client", name = "le", descriptor = "LYAPSNHGU;")
    private class71 field302;

    @OriginalMember(owner = "client", name = "gf", descriptor = "LYAPSNHGU;")
    private class71 field349;

    @OriginalMember(owner = "client", name = "hf", descriptor = "LYAPSNHGU;")
    private class71 field350;

    @OriginalMember(owner = "client", name = "jf", descriptor = "LYAPSNHGU;")
    private class71 field351;

    @OriginalMember(owner = "client", name = "kf", descriptor = "LYAPSNHGU;")
    private class71 field352;

    @OriginalMember(owner = "client", name = "lf", descriptor = "LYAPSNHGU;")
    private class71 field353;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "LYAPSNHGU;")
    private class71 field482;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "LYAPSNHGU;")
    private class71 field483;

    @OriginalMember(owner = "client", name = "ai", descriptor = "LYAPSNHGU;")
    private class71 field498;

    @OriginalMember(owner = "client", name = "bi", descriptor = "LYAPSNHGU;")
    private class71 field499;

    @OriginalMember(owner = "client", name = "ci", descriptor = "LYAPSNHGU;")
    private class71 field500;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "LYAPSNHGU;")
    private class71 field528;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "LYAPSNHGU;")
    private class71 field529;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "LYAPSNHGU;")
    private class71 field530;

    @OriginalMember(owner = "client", name = "Td", descriptor = "LZPIYFABJ;")
    private class72 field284;

    @OriginalMember(owner = "client", name = "W", descriptor = "LCMFQLMCT;")
    private class9 field131;

    @OriginalMember(owner = "client", name = "X", descriptor = "LCMFQLMCT;")
    private class9 field132;

    @OriginalMember(owner = "client", name = "Y", descriptor = "LCMFQLMCT;")
    private class9 field133;

    @OriginalMember(owner = "client", name = "Z", descriptor = "LCMFQLMCT;")
    private class9 field134;

    @OriginalMember(owner = "client", name = "ab", descriptor = "LCMFQLMCT;")
    private class9 field135;

    @OriginalMember(owner = "client", name = "bb", descriptor = "LCMFQLMCT;")
    private class9 field136;

    @OriginalMember(owner = "client", name = "cb", descriptor = "LCMFQLMCT;")
    private class9 field137;

    @OriginalMember(owner = "client", name = "db", descriptor = "LCMFQLMCT;")
    private class9 field138;

    @OriginalMember(owner = "client", name = "eb", descriptor = "LCMFQLMCT;")
    private class9 field139;

    @OriginalMember(owner = "client", name = "yc", descriptor = "LCMFQLMCT;")
    private class9 field211;

    @OriginalMember(owner = "client", name = "zc", descriptor = "LCMFQLMCT;")
    private class9 field212;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "LCMFQLMCT;")
    private class9 field213;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "LCMFQLMCT;")
    private class9 field214;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "LCMFQLMCT;")
    private class9 field215;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "LCMFQLMCT;")
    private class9 field216;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "LCMFQLMCT;")
    private class9 field217;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "LCMFQLMCT;")
    private class9 field218;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "LCMFQLMCT;")
    private class9 field219;

    @OriginalMember(owner = "client", name = "zd", descriptor = "LCMFQLMCT;")
    private class9 field264;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "LCMFQLMCT;")
    private class9 field265;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "LCMFQLMCT;")
    private class9 field266;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "LCMFQLMCT;")
    private class9 field267;

    @OriginalMember(owner = "client", name = "yi", descriptor = "LCMFQLMCT;")
    private class9 field522;

    @OriginalMember(owner = "client", name = "zi", descriptor = "LCMFQLMCT;")
    private class9 field523;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "LCMFQLMCT;")
    private class9 field524;

    @OriginalMember(owner = "client", name = "Db", descriptor = "Ljava/lang/String;")
    private String field164;

    @OriginalMember(owner = "client", name = "td", descriptor = "Ljava/lang/String;")
    public String field258;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "Ljava/lang/String;")
    private String field375;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "Ljava/lang/String;")
    public String field537;

    @OriginalMember(owner = "client", name = "si", descriptor = "Ljava/net/Socket;")
    private Socket field516;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "Z")
    public static boolean field282;

    @OriginalMember(owner = "client", name = "ae", descriptor = "Z")
    private static boolean field291;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "Z")
    private static boolean field321;

    @OriginalMember(owner = "client", name = "bg", descriptor = "Z")
    public static boolean field395;

    @OriginalMember(owner = "client", name = "vg", descriptor = "Z")
    private static boolean field415;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "Z")
    private static boolean field426;

    @OriginalMember(owner = "client", name = "rb", descriptor = "[I")
    private int[] field152;

    @OriginalMember(owner = "client", name = "sb", descriptor = "[I")
    private int[] field153;

    @OriginalMember(owner = "client", name = "tb", descriptor = "[I")
    private int[] field154;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "[I")
    private int[] field184;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "[I")
    private int[] field185;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "[I")
    private int[] field186;

    @OriginalMember(owner = "client", name = "xd", descriptor = "[I")
    private int[] field262;

    @OriginalMember(owner = "client", name = "yd", descriptor = "[I")
    private int[] field263;

    @OriginalMember(owner = "client", name = "wh", descriptor = "[I")
    private int[] field468;

    @OriginalMember(owner = "client", name = "xh", descriptor = "[I")
    private int[] field469;

    @OriginalMember(owner = "client", name = "yh", descriptor = "[I")
    private int[] field470;

    @OriginalMember(owner = "client", name = "zh", descriptor = "[I")
    private int[] field471;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "[I")
    private int[] field587;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "[I")
    private int[] field588;

    @OriginalMember(owner = "client", name = "V", descriptor = "[LYAPSNHGU;")
    private class71[] field130;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "[[B")
    private byte[][] field171;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "[[B")
    private byte[][] field443;

    @OriginalMember(owner = "client", name = "rc", descriptor = "[[[B")
    private byte[][][] field204;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "[[[I")
    private int[][][] field389;

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLTNOPEJNZ;)Z")
    public final boolean method62(boolean arg0, class63 arg1) {
        if (!arg0) {
            this.method52();
        }
        int var3 = arg1.field1529;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field450[this.field327] = "Remove @whi@" + arg1.field1545;
                this.field474[this.field327] = 281;
                ++this.field327;
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
            this.field450[this.field327] = "Remove @whi@" + this.field340[var3];
            this.field474[this.field327] = 47;
            ++this.field327;
            this.field450[this.field327] = "Message @whi@" + this.field340[var3];
            this.field474[this.field327] = 904;
            ++this.field327;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class11 var11 = null;
        int var12 = 17 / arg0;
        for (class11 var13 = (class11) this.field583.method393(); var13 != null; var13 = (class11) this.field583.method395(true)) {
            if (var13.field601 == arg2 && var13.field603 == arg4 && var13.field604 == arg5 && var13.field602 == arg1) {
                var11 = var13;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class11();
            var11.field601 = arg2;
            var11.field602 = arg1;
            var11.field603 = arg4;
            var11.field604 = arg5;
            this.method102((byte) 107, var11);
            this.field583.method390(var11);
        }
        var11.field608 = arg7;
        var11.field610 = arg6;
        var11.field609 = arg9;
        var11.field600 = arg8;
        var11.field611 = arg3;
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field98 != null) {
                    return new URL("http://127.0.0.1:" + (field424 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method64(boolean arg0) {
        class61.field1435.method388();
        class61.field1402.method388();
        if (!arg0) {
            this.field175.method296(152);
        }
        class58.field1261.method388();
        class41.field1042.method388();
        class41.field1021.method388();
        class21.field724.method388();
        class64.field1569.method388();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILJHKSAGUC;)V")
    private final void method65(boolean arg0, int arg1, class31 arg2) {
        if (!arg0) {
            this.field236 = -1;
        }
        for (int var4 = 0; var4 < this.field251; ++var4) {
            int var5 = this.field252[var4];
            class21 var6 = this.field248[var5];
            int var7 = arg2.method306();
            if ((var7 & 16) != 0) {
                var7 += arg2.method306() << 8;
            }
            this.method85(-28163, var5, arg2, var7, var6);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method66(int arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field413; ++var4) {
                if (this.field420[var4] == arg1) {
                    --this.field413;
                    this.field494 = true;
                    for (int var5 = var4; var5 < this.field413; ++var5) {
                        this.field420[var5] = this.field420[var5 + 1];
                    }
                    this.field175.method295(203, 1);
                    this.field175.method302(arg1, (byte) -65);
                    break;
                }
            }
            while (arg0 >= 0) {
                this.field496 = null;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method67(int arg0) {
        if (arg0 != 0) {
            this.field236 = -1;
        }
        ++field418;
        if (field418 > 121) {
            field418 = 0;
            this.field175.method295(55, 1);
            this.field175.method300(0);
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method51(46308);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field245 != -1 && this.field569 == this.field245) {
                        if (var2 == 8 && this.field318.length() > 0) {
                            this.field318 = this.field318.substring(0, this.field318.length() - 1);
                        }
                        break;
                    }
                    if (this.field296) {
                        if (var2 >= 32 && var2 <= 122 && this.field506.length() < 80) {
                            this.field506 = this.field506 + (char) var2;
                            this.field586 = true;
                        }
                        if (var2 == 8 && this.field506.length() > 0) {
                            this.field506 = this.field506.substring(0, this.field506.length() - 1);
                            this.field586 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field296 = false;
                            this.field586 = true;
                            if (this.field444 == 1) {
                                long var3 = class70.method576(this.field506);
                                this.method108(-47898, var3);
                            }
                            if (this.field444 == 2 && this.field309 > 0) {
                                long var5 = class70.method576(this.field506);
                                this.method106(653, var5);
                            }
                            if (this.field444 == 3 && this.field506.length() > 0) {
                                this.field175.method295(204, 1);
                                this.field175.method296(0);
                                int var7 = this.field175.field901;
                                this.field175.method302(this.field261, (byte) -65);
                                class30.method292(this.field175, 10246, this.field506);
                                this.field175.method305((byte) 103, this.field175.field901 - var7);
                                this.field506 = class30.method293(861, this.field506);
                                this.field506 = class22.method257(861, this.field506);
                                this.method111(6, this.field506, class70.method580((byte) 86, class70.method577(this.field261, -642)), (byte) 4);
                                if (this.field280 == 2) {
                                    this.field280 = 1;
                                    this.field192 = true;
                                    this.field175.method295(36, 1);
                                    this.field175.method296(this.field126);
                                    this.field175.method296(this.field280);
                                    this.field175.method296(this.field542);
                                }
                            }
                            if (this.field444 == 4 && this.field413 < 100) {
                                long var8 = class70.method576(this.field506);
                                this.method73(var8, (byte) 3);
                            }
                            if (this.field444 == 5 && this.field413 > 0) {
                                long var10 = class70.method576(this.field506);
                                this.method66(-121, var10);
                            }
                        }
                    } else if (this.field568 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field539.length() < 10) {
                            this.field539 = this.field539 + (char) var2;
                            this.field586 = true;
                        }
                        if (var2 == 8 && this.field539.length() > 0) {
                            this.field539 = this.field539.substring(0, this.field539.length() - 1);
                            this.field586 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field539.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field539);
                                } catch (Exception var22) {
                                }
                                this.field175.method295(20, 1);
                                this.field175.method300(var12);
                            }
                            this.field568 = 0;
                            this.field586 = true;
                        }
                    } else if (this.field568 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field539.length() < 12) {
                            this.field539 = this.field539 + (char) var2;
                            this.field586 = true;
                        }
                        if (var2 == 8 && this.field539.length() > 0) {
                            this.field539 = this.field539.substring(0, this.field539.length() - 1);
                            this.field586 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field539.length() > 0) {
                                this.field175.method295(14, 1);
                                this.field175.method302(class70.method576(this.field539), (byte) -65);
                            }
                            this.field568 = 0;
                            this.field586 = true;
                        }
                    } else if (this.field297 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field162.length() < 80) {
                            this.field162 = this.field162 + (char) var2;
                            this.field586 = true;
                        }
                        if (var2 == 8 && this.field162.length() > 0) {
                            this.field162 = this.field162.substring(0, this.field162.length() - 1);
                            this.field586 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field162.length() > 0) {
                            if (this.field479 == 2) {
                                if (this.field162.equals("::clientdrop")) {
                                    this.method140(-984);
                                }
                                if (this.field162.equals("::lag")) {
                                    this.method183(this.field149);
                                }
                                if (this.field162.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field234.method557(true, 2); ++var13) {
                                        this.field234.method564((byte) 1, 9, var13, 2);
                                    }
                                }
                                if (this.field162.equals("::fpson")) {
                                    field282 = true;
                                }
                                if (this.field162.equals("::fpsoff")) {
                                    field282 = false;
                                }
                                if (this.field162.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field497[var14].field942[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field162.startsWith("::")) {
                                this.field175.method295(212, 1);
                                this.field175.method296(this.field162.length() - 1);
                                this.field175.method303(this.field162.substring(2));
                            } else {
                                String var17 = this.field162.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field162 = this.field162.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field162 = this.field162.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field162 = this.field162.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field162 = this.field162.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field162 = this.field162.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field162 = this.field162.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field162 = this.field162.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field162 = this.field162.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field162 = this.field162.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field162 = this.field162.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field162 = this.field162.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field162 = this.field162.substring(6);
                                }
                                String var19 = this.field162.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field162 = this.field162.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field162 = this.field162.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field162 = this.field162.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field162 = this.field162.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field162 = this.field162.substring(6);
                                }
                                this.field175.method295(172, 1);
                                this.field175.method296(0);
                                int var21 = this.field175.field901;
                                this.field175.method324(var20, 0);
                                this.field175.method324(var18, 0);
                                this.field439.field901 = 0;
                                class30.method292(this.field439, 10246, this.field162);
                                this.field175.method304(0, this.field439.field901, this.field439.field900, true);
                                this.field175.method305((byte) 103, this.field175.field901 - var21);
                                this.field162 = class30.method293(861, this.field162);
                                this.field162 = class22.method257(861, this.field162);
                                field454.field1189 = this.field162;
                                field454.field1221 = var18;
                                field454.field1212 = var20;
                                field454.field1218 = 150;
                                if (this.field479 == 2) {
                                    this.method111(2, field454.field1189, "@cr2@" + field454.field698, (byte) 4);
                                } else if (this.field479 == 1) {
                                    this.method111(2, field454.field1189, "@cr1@" + field454.field698, (byte) 4);
                                } else {
                                    this.method111(2, field454.field1189, field454.field698, (byte) 4);
                                }
                                if (this.field126 == 2) {
                                    this.field126 = 3;
                                    this.field192 = true;
                                    this.field175.method295(36, 1);
                                    this.field175.method296(this.field126);
                                    this.field175.method296(this.field280);
                                    this.field175.method296(this.field542);
                                }
                            }
                            this.field162 = "";
                            this.field586 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field318.length() < 12) {
                this.field318 = this.field318 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method68(byte arg0) {
        if (arg0 != 7) {
            this.field188 = this.field284.method589();
        }
        for (class52 var2 = (class52) this.field462.method393(); var2 != null; var2 = (class52) this.field462.method395(true)) {
            if (this.field146 == var2.field1122 && !var2.field1127) {
                if (field271 >= var2.field1121) {
                    var2.method412(4, this.field121);
                    if (var2.field1127) {
                        var2.method290();
                    } else {
                        this.field521.method515(var2.field1125, -1, 60, false, var2.field1122, var2.field1123, var2, var2.field1124, (byte) -48, 0);
                    }
                }
            } else {
                var2.method290();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILQQAAMZPI;)V")
    public final void method69(int arg0, int arg1, class56 arg2) {
        if (arg0 != 45917) {
            this.field175.method296(151);
        }
        this.method70(arg1, arg2.field1215, this.field312, arg2.field1214);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)V")
    public final void method70(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 128 && arg1 >= 128 && arg3 <= 13056 && arg1 <= 13056) {
            int var5 = this.method173(arg1, arg3, this.field146, 1) - arg0;
            int var6 = arg3 - this.field555;
            int var7 = 0 / arg2;
            int var8 = var5 - this.field556;
            int var9 = arg1 - this.field557;
            int var10 = class59.field1367[this.field558];
            int var11 = class59.field1368[this.field558];
            int var12 = class59.field1367[this.field559];
            int var13 = class59.field1368[this.field559];
            int var14 = var6 * var13 + var9 * var12 >> 16;
            int var15 = var9 * var13 - var6 * var12 >> 16;
            int var17 = var8 * var11 - var10 * var15 >> 16;
            int var18 = var8 * var10 + var11 * var15 >> 16;
            if (var18 >= 50) {
                this.field514 = (var14 << 9) / var18 + class5.field59;
                this.field515 = (var17 << 9) / var18 + class5.field60;
            } else {
                this.field514 = -1;
                this.field515 = -1;
            }
        } else {
            this.field514 = -1;
            this.field515 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method71(String arg0) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public final void method59(String arg0, int arg1, byte arg2) {
        this.field205 = arg1;
        this.field375 = arg0;
        this.method133(-9534);
        if (this.field308 == null) {
            super.method59(arg0, arg1, (byte) 3);
        } else {
            this.field213.method196(true);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field358.method418(var5 / 2 - 26 - var6, var4 / 2, "RuneScape is loading - please wait...", 16777215, 5);
            int var7 = var5 / 2 - 18 - var6;
            class19.method236(3, 34, var4 / 2 - 152, 304, 9179409, var7);
            class19.method236(3, 32, var4 / 2 - 151, 302, 0, var7 + 1);
            class19.method235(false, 30, arg1 * 3, var7 + 2, 9179409, var4 / 2 - 150);
            if (this.field273 == arg2) {
                boolean var8 = false;
            } else {
                this.method52();
            }
            class19.method235(false, 30, 300 - arg1 * 3, var7 + 2, 0, arg1 * 3 + (var4 / 2 - 150));
            this.field358.method418(var5 / 2 + 5 - var6, var4 / 2, arg0, 16777215, 5);
            this.field213.method197(super.field95, 171, true, 202);
            if (this.field505) {
                this.field505 = false;
                if (!this.field543) {
                    this.field214.method197(super.field95, 0, true, 0);
                    this.field215.method197(super.field95, 0, true, 637);
                }
                this.field211.method197(super.field95, 0, true, 128);
                this.field212.method197(super.field95, 371, true, 202);
                this.field216.method197(super.field95, 265, true, 0);
                this.field217.method197(super.field95, 265, true, 562);
                this.field218.method197(super.field95, 171, true, 128);
                this.field219.method197(super.field95, 171, true, 562);
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method72(int arg0) {
        this.field235 += arg0;
        int var2 = 5;
        this.field289[8] = 0;
        int var3 = 0;
        while (this.field289[8] == 0) {
            String var4 = "Unknown problem";
            this.method59("Connecting to web server", 20, (byte) 3);
            try {
                DataInputStream var5 = this.method94("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 318);
                class31 var6 = new class31(new byte[40], 8);
                var5.readFully(var6.field900, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field289[var7] = var6.method311();
                }
                int var8 = var6.method311();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field289[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field289[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field289[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field289[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field289[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field289[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method59("Game updated - please reload page", 10, (byte) 3);
                        var11 = 10;
                    } else {
                        this.method59(var4 + " - Will retry in " + var11 + " secs.", 10, (byte) 3);
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
                this.field463 = !this.field463;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JB)V")
    public final void method73(long arg0, byte arg1) {
        if (arg0 != 0L) {
            if (this.field413 >= 100) {
                this.method111(0, "Your ignore list is full. Max of 100 hit", "", (byte) 4);
            } else {
                String var4 = class70.method580((byte) 86, class70.method577(arg0, -642));
                for (int var5 = 0; var5 < this.field413; ++var5) {
                    if (this.field420[var5] == arg0) {
                        this.method111(0, var4 + " is already on your ignore list", "", (byte) 4);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field309; ++var6) {
                    if (this.field509[var6] == arg0) {
                        this.method111(0, "Please remove " + var4 + " from your friend list first", "", (byte) 4);
                        return;
                    }
                }
                this.field420[this.field413++] = arg0;
                if (arg1 != 3) {
                    this.method52();
                }
                this.field494 = true;
                this.field175.method295(105, 1);
                this.field175.method302(arg0, (byte) -65);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)Z")
    public final boolean method74(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 >> 14 & 32767;
        int var6 = this.field521.method534(this.field146, arg2, arg1, arg0);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method171(arg2, 0, 0, 2, field454.field1200[0], var7 + 1, false, var8, (byte) 4, field454.field1201[0], 0, arg1);
            } else {
                class61 var9 = class61.method491(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1394;
                    var11 = var9.field1418;
                } else {
                    var10 = var9.field1418;
                    var11 = var9.field1394;
                }
                int var12 = var9.field1425;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method171(arg2, var12, var11, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], var10, arg1);
            }
            this.field396 = super.field110;
            this.field397 = super.field111;
            this.field399 = 2;
            this.field398 = 0;
            if (arg3 != 0) {
                this.field236 = this.field254.method306();
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method53(int arg0) {
        if (!this.field585 && !this.field281 && !this.field579) {
            ++field271;
            if (!this.field295) {
                this.method93(true);
            } else {
                this.method144(-499);
            }
            this.method149(field125);
            this.field235 += arg0;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method75(int arg0) {
        this.field235 += arg0;
        if (this.field167 == 0) {
            int var2 = super.field109;
            if (this.field255 == 1 && super.field110 >= 516 && super.field111 >= 160 && super.field110 <= 765 && super.field111 <= 205) {
                var2 = 0;
            }
            if (this.field305) {
                if (var2 != 1) {
                    int var3 = super.field103;
                    int var4 = super.field104;
                    if (this.field179 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field179 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field179 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field180 - 10 || var3 > this.field182 + this.field180 + 10 || var4 < this.field181 - 10 || var4 > this.field183 + this.field181 + 10) {
                        this.field305 = false;
                        if (this.field179 == 1) {
                            this.field494 = true;
                        }
                        if (this.field179 == 2) {
                            this.field586 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field180;
                    int var6 = this.field181;
                    int var7 = this.field182;
                    int var8 = super.field110;
                    int var9 = super.field111;
                    if (this.field179 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field179 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field179 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field327; ++var11) {
                        int var12 = (this.field327 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method101(var10, 16655);
                    }
                    this.field305 = false;
                    if (this.field179 == 1) {
                        this.field494 = true;
                    }
                    if (this.field179 == 2) {
                        this.field586 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field327 > 0) {
                    int var13 = this.field474[this.field327 - 1];
                    if (var13 == 3 || var13 == 743 || var13 == 705 || var13 == 947 || var13 == 760 || var13 == 723 || var13 == 22 || var13 == 300 || var13 == 863 || var13 == 196 || var13 == 146 || var13 == 1752) {
                        int var14 = this.field472[this.field327 - 1];
                        int var15 = this.field473[this.field327 - 1];
                        class63 var16 = class63.field1490[var15];
                        if (var16.field1538 || var16.field1496) {
                            this.field563 = false;
                            this.field226 = 0;
                            this.field165 = var15;
                            this.field166 = var14;
                            this.field167 = 2;
                            this.field168 = super.field110;
                            this.field169 = super.field111;
                            if (class63.field1490[var15].field1514 == this.field245) {
                                this.field167 = 1;
                            }
                            if (class63.field1490[var15].field1514 == this.field297) {
                                this.field167 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field566 == 1 || this.method115(true, this.field327 - 1)) && this.field327 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field327 > 0) {
                    this.method101(this.field327 - 1, 16655);
                }
                if (var2 != 2 || this.field327 <= 0) {
                    return;
                }
                this.method98(16143);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method76(int arg0, int arg1) {
        if (arg0 <= 0) {
            this.field236 = -1;
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I[BZ)V")
    public final void method77(int arg0, byte[] arg1, boolean arg2) {
        signlink.midifade = arg2 ? 1 : 0;
        signlink.midisave(arg1, arg1.length);
        this.field235 += arg0;
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field260) {
            this.method153((byte) 0);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)Z")
    public final boolean method78(boolean arg0) {
        this.field295 &= arg0;
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)V")
    public final void method79(int arg0, int arg1, int arg2) {
        int var4 = 0;
        if (arg1 != 45905) {
            this.field496 = null;
        }
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field520[var5] != null) {
                int var6 = this.field518[var5];
                int var7 = 70 - var4 * 14 + this.field223 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field519[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field126 == 0 || this.field126 == 1 && this.method174(var8, -39869))) {
                    if (arg2 > var7 - 14 && arg2 <= var7 && !var8.equals(field454.field698)) {
                        if (this.field479 >= 1) {
                            this.field450[this.field327] = "Report abuse @whi@" + var8;
                            this.field474[this.field327] = 953;
                            ++this.field327;
                        }
                        this.field450[this.field327] = "Add ignore @whi@" + var8;
                        this.field474[this.field327] = 13;
                        ++this.field327;
                        this.field450[this.field327] = "Add friend @whi@" + var8;
                        this.field474[this.field327] = 217;
                        ++this.field327;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field173 == 0 && (var6 == 7 || this.field280 == 0 || this.field280 == 1 && this.method174(var8, -39869))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        if (this.field479 >= 1) {
                            this.field450[this.field327] = "Report abuse @whi@" + var8;
                            this.field474[this.field327] = 953;
                            ++this.field327;
                        }
                        this.field450[this.field327] = "Add ignore @whi@" + var8;
                        this.field474[this.field327] = 13;
                        ++this.field327;
                        this.field450[this.field327] = "Add friend @whi@" + var8;
                        this.field474[this.field327] = 217;
                        ++this.field327;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field542 == 0 || this.field542 == 1 && this.method174(var8, -39869))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field450[this.field327] = "Accept trade @whi@" + var8;
                        this.field474[this.field327] = 15;
                        ++this.field327;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field173 == 0 && this.field280 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field542 == 0 || this.field542 == 1 && this.method174(var8, -39869))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field450[this.field327] = "Accept challenge @whi@" + var8;
                        this.field474[this.field327] = 84;
                        ++this.field327;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    private final void method80(int arg0) {
        if (arg0 < 2 || arg0 > 2) {
            this.field584 = this.field284.method589();
        }
        if (this.field275 == 2) {
            for (class11 var2 = (class11) this.field583.method393(); var2 != null; var2 = (class11) this.field583.method395(true)) {
                if (var2.field611 > 0) {
                    --var2.field611;
                }
                if (var2.field611 == 0) {
                    if (var2.field605 < 0 || class3.method8(946, var2.field607, var2.field605)) {
                        this.method117(var2.field606, var2.field605, var2.field601, var2.field607, var2.field604, this.field511, var2.field602, var2.field603);
                        var2.method290();
                    }
                } else {
                    if (var2.field600 > 0) {
                        --var2.field600;
                    }
                    if (var2.field600 == 0 && var2.field603 >= 1 && var2.field604 >= 1 && var2.field603 <= 102 && var2.field604 <= 102 && (var2.field608 < 0 || class3.method8(946, var2.field610, var2.field608))) {
                        this.method117(var2.field609, var2.field608, var2.field601, var2.field610, var2.field604, this.field511, var2.field602, var2.field603);
                        var2.field600 = -1;
                        if (var2.field608 == var2.field605 && var2.field605 == -1) {
                            var2.method290();
                        } else if (var2.field608 == var2.field605 && var2.field609 == var2.field606 && var2.field610 == var2.field607) {
                            var2.method290();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method81(int arg0) {
        this.field482 = new class71(this.field308, "titlebox", 0);
        this.field483 = new class71(this.field308, "titlebutton", 0);
        this.field130 = new class71[12];
        while (arg0 >= 0) {
            this.field236 = -1;
        }
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field130[var3] = new class71(this.field308, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field130[var4] = new class71(this.field308, "runes", (var4 & 3) + 12);
            }
        }
        this.field403 = new class12(128, 265);
        this.field404 = new class12(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field403.field620[var5] = this.field214.field591[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field404.field620[var6] = this.field215.field591[var6];
        }
        this.field469 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field469[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field469[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field469[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field469[var10 + 192] = 16777215;
        }
        this.field470 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field470[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field470[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field470[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field470[var14 + 192] = 16777215;
        }
        this.field471 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field471[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field471[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field471[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field471[var18 + 192] = 16777215;
        }
        this.field468 = new int[256];
        this.field587 = new int[32768];
        this.field588 = new int[32768];
        this.method128(4, (class71) null);
        this.field262 = new int[32768];
        this.field263 = new int[32768];
        this.method59("Connecting to fileserver", 10, (byte) 3);
        if (!this.field543) {
            this.field260 = true;
            this.field543 = true;
            this.method58(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LJHKSAGUC;II)V")
    private final void method82(class31 arg0, int arg1, int arg2) {
        if (arg2 <= 0) {
            this.field175.method296(236);
        }
        arg0.method316(0);
        int var4 = arg0.method317((byte) 9, 8);
        if (var4 < this.field441) {
            for (int var5 = var4; var5 < this.field441; ++var5) {
                this.field144[this.field143++] = this.field442[var5];
            }
        }
        if (var4 > this.field441) {
            signlink.reporterror(this.field335 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field441 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field442[var6];
                class44 var8 = this.field440[var7];
                int var9 = arg0.method317((byte) 9, 1);
                if (var9 == 0) {
                    this.field442[this.field441++] = var7;
                    var8.field1217 = field271;
                } else {
                    int var10 = arg0.method317((byte) 9, 2);
                    if (var10 == 0) {
                        this.field442[this.field441++] = var7;
                        var8.field1217 = field271;
                        this.field252[this.field251++] = var7;
                    } else if (var10 == 1) {
                        this.field442[this.field441++] = var7;
                        var8.field1217 = field271;
                        int var11 = arg0.method317((byte) 9, 3);
                        var8.method439((byte) -49, var11, false);
                        int var12 = arg0.method317((byte) 9, 1);
                        if (var12 == 1) {
                            this.field252[this.field251++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field442[this.field441++] = var7;
                        var8.field1217 = field271;
                        int var13 = arg0.method317((byte) 9, 3);
                        var8.method439((byte) -49, var13, true);
                        int var14 = arg0.method317((byte) 9, 3);
                        var8.method439((byte) -49, var14, true);
                        int var15 = arg0.method317((byte) 9, 1);
                        if (var15 == 1) {
                            this.field252[this.field251++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field144[this.field143++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method58(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method58(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method83(int arg0) {
        this.field265.method196(true);
        if (arg0 != 44975) {
            field321 = !field321;
        }
        if (this.field324 == 2) {
            byte[] var2 = this.field529.field1727;
            int[] var3 = class19.field684;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field163.method209(25, this.field123, 33, 0, -876, 25, 256, this.field290, 33, 0, this.field487);
            this.field266.method196(true);
        } else {
            int var6 = this.field531 + this.field487 & 2047;
            int var7 = field454.field1214 / 32 + 48;
            int var8 = 464 - field454.field1215 / 32;
            this.field503.method209(var7, this.field495, 151, 5, -876, var8, this.field553 + 256, this.field293, 146, 25, var6);
            this.field163.method209(25, this.field123, 33, 0, -876, 25, 256, this.field290, 33, 0, this.field487);
            for (int var9 = 0; var9 < this.field207; ++var9) {
                int var39 = this.field208[var9] * 4 + 2 - field454.field1214 / 32;
                int var40 = this.field209[var9] * 4 + 2 - field454.field1215 / 32;
                this.method137((byte) 8, var39, this.field354[var9], var40);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class48 var36 = this.field496[this.field146][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field454.field1214 / 32;
                        int var38 = var35 * 4 + 2 - field454.field1215 / 32;
                        this.method137((byte) 8, var37, this.field406, var38);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field441; ++var11) {
                class44 var31 = this.field440[this.field442[var11]];
                if (var31 != null && var31.method244(true)) {
                    class58 var32 = var31.field1080;
                    if (var32.field1276 != null) {
                        var32 = var32.method448(true);
                    }
                    if (var32 != null && var32.field1268 && var32.field1270) {
                        int var33 = var31.field1214 / 32 - field454.field1214 / 32;
                        int var34 = var31.field1215 / 32 - field454.field1215 / 32;
                        this.method137((byte) 8, var33, this.field407, var34);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field249; ++var12) {
                class21 var23 = this.field248[this.field250[var12]];
                if (var23 != null && var23.method244(true)) {
                    int var24 = var23.field1214 / 32 - field454.field1214 / 32;
                    int var25 = var23.field1215 / 32 - field454.field1215 / 32;
                    boolean var26 = false;
                    long var27 = class70.method576(var23.field698);
                    for (int var29 = 0; var29 < this.field309; ++var29) {
                        if (this.field509[var29] == var27 && this.field507[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field454.field714 != 0 && var23.field714 != 0 && field454.field714 == var23.field714) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method137((byte) 8, var24, this.field409, var25);
                    } else if (var30) {
                        this.method137((byte) 8, var24, this.field410, var25);
                    } else {
                        this.method137((byte) 8, var24, this.field408, var25);
                    }
                }
            }
            if (this.field141 != 0 && field271 % 20 < 10) {
                if (this.field141 == 1 && this.field386 >= 0 && this.field386 < this.field440.length) {
                    class44 var13 = this.field440[this.field386];
                    if (var13 != null) {
                        int var14 = var13.field1214 / 32 - field454.field1214 / 32;
                        int var15 = var13.field1215 / 32 - field454.field1215 / 32;
                        this.method176(var15, 0, var14, this.field157);
                    }
                }
                if (this.field141 == 2) {
                    int var16 = (this.field574 - this.field570) * 4 + 2 - field454.field1214 / 32;
                    int var17 = (this.field575 - this.field571) * 4 + 2 - field454.field1215 / 32;
                    this.method176(var17, 0, var16, this.field157);
                }
                if (this.field141 == 10 && this.field452 >= 0 && this.field452 < this.field248.length) {
                    class21 var18 = this.field248[this.field452];
                    if (var18 != null) {
                        int var19 = var18.field1214 / 32 - field454.field1214 / 32;
                        int var20 = var18.field1215 / 32 - field454.field1215 / 32;
                        this.method176(var20, 0, var19, this.field157);
                    }
                }
            }
            if (this.field501 != 0) {
                int var21 = this.field501 * 4 + 2 - field454.field1214 / 32;
                int var22 = this.field502 * 4 + 2 - field454.field1215 / 32;
                this.method137((byte) 8, var21, this.field156, var22);
            }
            class19.method235(false, 3, 3, 78, 16777215, 97);
            this.field266.method196(true);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBII)I")
    public final int method84(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = 256 - arg3;
        if (arg1 != -45) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        return ((arg0 & 16711935) * arg3 + (arg2 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg3 + (arg2 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILJHKSAGUC;ILFVFJZZXQ;)V")
    private final void method85(int arg0, int arg1, class31 arg2, int arg3, class21 arg4) {
        if (arg0 != -28163) {
            this.field496 = null;
        }
        if ((arg3 & 32) != 0) {
            int var6 = arg2.method308();
            int var7 = arg2.method306();
            int var8 = arg2.method326((byte) -15);
            int var9 = arg2.field901;
            if (arg4.field698 != null && arg4.field701) {
                long var10 = class70.method576(arg4.field698);
                boolean var12 = false;
                if (var7 <= 1) {
                    for (int var13 = 0; var13 < this.field413; ++var13) {
                        if (this.field420[var13] == var10) {
                            var12 = true;
                            break;
                        }
                    }
                }
                if (!var12 && this.field355 == 0) {
                    try {
                        this.field439.field901 = 0;
                        arg2.method343((byte) 80, var8, this.field439.field900, 0);
                        this.field439.field901 = 0;
                        String var14 = class30.method291(var8, true, this.field439);
                        String var15 = class22.method257(861, var14);
                        arg4.field1189 = var15;
                        arg4.field1221 = var6 >> 8;
                        arg4.field1212 = var6 & 255;
                        arg4.field1218 = 150;
                        if (var7 != 2 && var7 != 3) {
                            if (var7 == 1) {
                                this.method111(1, var15, "@cr1@" + arg4.field698, (byte) 4);
                            } else {
                                this.method111(2, var15, arg4.field698, (byte) 4);
                            }
                        } else {
                            this.method111(1, var15, "@cr2@" + arg4.field698, (byte) 4);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg2.field901 = var8 + var9;
        }
        if ((arg3 & 4) != 0) {
            int var17 = arg2.method325(-35277);
            byte[] var18 = new byte[var17];
            class31 var19 = new class31(var18, 8);
            arg2.method343((byte) 80, var17, var18, 0);
            this.field253[arg1] = var19;
            arg4.method243(var19, 809);
        }
        if ((arg3 & 1) != 0) {
            arg4.field1205 = arg2.method308();
            arg4.field1206 = arg2.method308();
        }
        if ((arg3 & 2) != 0) {
            int var20 = arg2.method308();
            if (var20 == 65535) {
                var20 = -1;
            }
            int var21 = arg2.method327(8);
            if (arg4.field1231 == var20 && var20 != -1) {
                int var22 = class36.field953[var20].field967;
                if (var22 == 1) {
                    arg4.field1232 = 0;
                    arg4.field1233 = 0;
                    arg4.field1234 = var21;
                    arg4.field1235 = 0;
                }
                if (var22 == 2) {
                    arg4.field1235 = 0;
                }
            } else if (var20 == -1 || arg4.field1231 == -1 || class36.field953[var20].field961 >= class36.field953[arg4.field1231].field961) {
                arg4.field1231 = var20;
                arg4.field1232 = 0;
                arg4.field1233 = 0;
                arg4.field1234 = var21;
                arg4.field1235 = 0;
                arg4.field1210 = arg4.field1198;
            }
        }
        if ((arg3 & 1024) != 0) {
            arg4.field1191 = arg2.method326((byte) -15);
            arg4.field1193 = arg2.method327(8);
            arg4.field1192 = arg2.method326((byte) -15);
            arg4.field1194 = arg2.method325(-35277);
            arg4.field1195 = arg2.method336((byte) 87) + field271;
            arg4.field1196 = arg2.method308() + field271;
            arg4.field1197 = arg2.method326((byte) -15);
            arg4.method441(900);
        }
        if ((arg3 & 256) != 0) {
            arg4.field1184 = arg2.method308();
            int var23 = arg2.method311();
            arg4.field1188 = var23 >> 16;
            arg4.field1187 = (var23 & 65535) + field271;
            arg4.field1185 = 0;
            arg4.field1186 = 0;
            if (arg4.field1187 > field271) {
                arg4.field1185 = -1;
            }
            if (arg4.field1184 == 65535) {
                arg4.field1184 = -1;
            }
        }
        if ((arg3 & 512) != 0) {
            int var24 = arg2.method327(8);
            int var25 = arg2.method327(8);
            arg4.method442(var24, 49176, var25, field271);
            arg4.field1225 = field271 + 300;
            arg4.field1226 = arg2.method326((byte) -15);
            arg4.field1227 = arg2.method325(-35277);
        }
        if ((arg3 & 8) != 0) {
            arg4.field1223 = arg2.method334((byte) -45);
            if (arg4.field1223 == 65535) {
                arg4.field1223 = -1;
            }
        }
        if ((arg3 & 128) != 0) {
            int var26 = arg2.method306();
            int var27 = arg2.method326((byte) -15);
            arg4.method442(var26, 49176, var27, field271);
            arg4.field1225 = field271 + 300;
            arg4.field1226 = arg2.method326((byte) -15);
            arg4.field1227 = arg2.method306();
        }
        if ((arg3 & 64) != 0) {
            arg4.field1189 = arg2.method313();
            if (arg4.field1189.charAt(0) == '~') {
                arg4.field1189 = arg4.field1189.substring(1);
                this.method111(2, arg4.field1189, arg4.field698, (byte) 4);
            } else if (field454 == arg4) {
                this.method111(2, arg4.field1189, arg4.field698, (byte) 4);
            }
            arg4.field1221 = 0;
            arg4.field1212 = 0;
            arg4.field1218 = 150;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method86(boolean arg0) {
        this.field264.method196(true);
        this.field295 &= arg0;
        class5.field65 = this.field185;
        this.field528.method587(0, 0, (byte) 122);
        if (this.field270 != -1) {
            this.method185(0, 0, class63.field1490[this.field270], 0, 0);
        } else if (this.field392[this.field405] != -1) {
            this.method185(0, 0, class63.field1490[this.field392[this.field405]], 0, 0);
        }
        if (this.field305 && this.field179 == 1) {
            this.method92((byte) 0);
        }
        this.field264.method197(super.field95, 205, true, 553);
        this.field266.method196(true);
        class5.field65 = this.field186;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method87(int arg0, int arg1) {
        int[] var3 = this.field503.field620;
        this.field235 += arg0;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field204[arg1][var24][var6] & 24) == 0) {
                    this.field521.method539(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field204[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field521.method539(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field503.method200(true);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field204[arg1][var22][var9] & 24) == 0) {
                    this.method135(3, var9, var22, arg1, var7, var8);
                }
                if (arg1 < 3 && (this.field204[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method135(3, var9, var22, arg1 + 1, var7, var8);
                }
            }
        }
        this.field266.method196(true);
        this.field207 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field521.method533(this.field146, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class61.method491(var13).field1400;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field497[this.field146].field942;
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
                        this.field354[this.field207] = this.field187[var14];
                        this.field208[this.field207] = var15;
                        this.field209[this.field207] = var16;
                        ++this.field207;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method88(int arg0, int arg1) {
        this.field235 += arg0;
        if (!field426) {
            if (class5.field73[17] >= arg1) {
                class71 var3 = class5.field67[17];
                int var4 = var3.field1730 * var3.field1729 - 1;
                int var5 = this.field121 * var3.field1729 * 2;
                byte[] var6 = var3.field1727;
                byte[] var7 = this.field224;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field1727 = var7;
                this.field224 = var6;
                class5.method32(-13842, 17);
                ++field526;
                if (field526 > 132) {
                    field526 = 0;
                    this.field175.method295(60, 1);
                    this.field175.method296(4);
                }
            }
            if (class5.field73[24] >= arg1) {
                class71 var9 = class5.field67[24];
                int var10 = var9.field1730 * var9.field1729 - 1;
                int var11 = this.field121 * var9.field1729 * 2;
                byte[] var12 = var9.field1727;
                byte[] var13 = this.field224;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field1727 = var13;
                this.field224 = var12;
                class5.method32(-13842, 24);
            }
            if (class5.field73[34] >= arg1) {
                class71 var15 = class5.field67[34];
                int var16 = var15.field1730 * var15.field1729 - 1;
                int var17 = this.field121 * var15.field1729 * 2;
                byte[] var18 = var15.field1727;
                byte[] var19 = this.field224;
                for (int var20 = 0; var20 <= var16; ++var20) {
                    var19[var20] = var18[var20 - var17 & var16];
                }
                var15.field1727 = var19;
                this.field224 = var18;
                class5.method32(-13842, 34);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method89(byte arg0) {
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (arg0 != 2) {
            this.field175.method296(157);
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public static final void method90(int arg0) {
        class65.field1581 = false;
        class5.field54 = false;
        field426 = false;
        class3.field42 = false;
        if (arg0 >= 2 && arg0 <= 2) {
            class61.field1410 = false;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method91(byte arg0) {
        if (this.field267 == null) {
            this.method178(9);
            super.field96 = null;
            this.field211 = null;
            this.field212 = null;
            this.field213 = null;
            this.field214 = null;
            this.field215 = null;
            this.field216 = null;
            this.field217 = null;
            this.field218 = null;
            this.field219 = null;
            this.field267 = new class9(479, this.method57(field455), 96, 912);
            this.field265 = new class9(172, this.method57(field455), 156, 912);
            class19.method233(this.field220);
            this.field529.method587(0, 0, (byte) 122);
            this.field264 = new class9(190, this.method57(field455), 261, 912);
            this.field266 = new class9(512, this.method57(field455), 334, 912);
            if (arg0 != -26) {
                this.field175.method296(254);
            }
            class19.method233(this.field220);
            this.field522 = new class9(496, this.method57(field455), 50, 912);
            this.field523 = new class9(269, this.method57(field455), 37, 912);
            this.field524 = new class9(249, this.method57(field455), 45, 912);
            this.field505 = true;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method92(byte arg0) {
        int var2 = this.field180;
        int var3 = this.field181;
        int var4 = this.field182;
        int var5 = this.field183;
        int var6 = 6116423;
        if (arg0 == 0) {
            boolean var7 = false;
            class19.method235(false, var5, var4, var3, var6, var2);
            class19.method235(false, 16, var4 - 2, var3 + 1, 0, var2 + 1);
            class19.method236(3, var5 - 19, var2 + 1, var4 - 2, 0, var3 + 18);
            this.field358.method422(var6, (byte) 2, "Choose Option", var2 + 3, var3 + 14);
            int var8 = super.field103;
            int var9 = super.field104;
            if (this.field179 == 0) {
                var8 -= 4;
                var9 -= 4;
            }
            if (this.field179 == 1) {
                var8 -= 553;
                var9 -= 205;
            }
            if (this.field179 == 2) {
                var8 -= 17;
                var9 -= 357;
            }
            for (int var10 = 0; var10 < this.field327; ++var10) {
                int var11 = (this.field327 - 1 - var10) * 15 + var3 + 31;
                int var12 = 16777215;
                if (var8 > var2 && var8 < var2 + var4 && var9 > var11 - 13 && var9 < var11 + 3) {
                    var12 = 16776960;
                }
                this.field358.method426(this.field450[var10], true, true, var2 + 3, var12, var11);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method93(boolean arg0) {
        this.field295 &= arg0;
        if (this.field517 == 0) {
            int var2 = super.field93 / 2 - 80;
            int var3 = super.field94 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field109 == 1 && super.field110 >= var2 - 75 && super.field110 <= var2 + 75 && super.field111 >= var14 - 20 && super.field111 <= var14 + 20) {
                this.field517 = 3;
                this.field477 = 0;
            }
            int var4 = super.field93 / 2 + 80;
            if (super.field109 == 1 && super.field110 >= var4 - 75 && super.field110 <= var4 + 75 && super.field111 >= var14 - 20 && super.field111 <= var14 + 20) {
                this.field240 = "";
                this.field241 = "Enter your username & password.";
                this.field517 = 2;
                this.field477 = 0;
            }
        } else if (this.field517 == 2) {
            int var5 = super.field94 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field109 == 1 && super.field111 >= var16 - 15 && super.field111 < var16) {
                this.field477 = 0;
            }
            var5 = var16 + 15;
            if (super.field109 == 1 && super.field111 >= var5 - 15 && super.field111 < var5) {
                this.field477 = 1;
            }
            var5 += 15;
            int var6 = super.field93 / 2 - 80;
            int var7 = super.field94 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field109 == 1 && super.field110 >= var6 - 75 && super.field110 <= var6 + 75 && super.field111 >= var17 - 20 && super.field111 <= var17 + 20) {
                this.field422 = 0;
                this.method187(this.field335, this.field336, false);
                if (this.field295) {
                    return;
                }
            }
            int var8 = super.field93 / 2 + 80;
            if (super.field109 == 1 && super.field110 >= var8 - 75 && super.field110 <= var8 + 75 && super.field111 >= var17 - 20 && super.field111 <= var17 + 20) {
                this.field517 = 0;
                this.field335 = "";
                this.field336 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method51(46308);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field337.length(); ++var11) {
                        if (var9 == field337.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field477 == 0) {
                        if (var9 == 8 && this.field335.length() > 0) {
                            this.field335 = this.field335.substring(0, this.field335.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field477 = 1;
                        }
                        if (var10) {
                            this.field335 = this.field335 + (char) var9;
                        }
                        if (this.field335.length() > 12) {
                            this.field335 = this.field335.substring(0, 12);
                        }
                    } else if (this.field477 == 1) {
                        if (var9 == 8 && this.field336.length() > 0) {
                            this.field336 = this.field336.substring(0, this.field336.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field477 = 0;
                        }
                        if (var10) {
                            this.field336 = this.field336 + (char) var9;
                        }
                        if (this.field336.length() > 20) {
                            this.field336 = this.field336.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field517 == 3) {
                int var12 = super.field93 / 2;
                int var13 = super.field94 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field109 == 1 && super.field110 >= var12 - 75 && super.field110 <= var12 + 75 && super.field111 >= var18 - 20 && super.field111 <= var18 + 20) {
                    this.field517 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method94(String arg0) throws IOException {
        if (!this.field463) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field516 != null) {
                try {
                    this.field516.close();
                } catch (Exception var4) {
                }
                this.field516 = null;
            }
            this.field516 = this.method143(43595);
            this.field516.setSoTimeout(10000);
            InputStream var2 = this.field516.getInputStream();
            OutputStream var3 = this.field516.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILTNOPEJNZ;ZIII)V")
    public final void method95(int arg0, int arg1, class63 arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg2.field1525 == 0 && arg2.field1544 != null && !arg2.field1493) {
            if (arg1 >= arg4 && arg5 >= arg6 && arg1 <= arg2.field1509 + arg4 && arg5 <= arg2.field1524 + arg6) {
                int var8 = arg2.field1544.length;
                this.field295 &= arg3;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg2.field1535[var9] + arg4;
                    int var11 = arg2.field1547[var9] + arg6 - arg0;
                    class63 var12 = class63.field1490[arg2.field1544[var9]];
                    int var13 = var12.field1513 + var10;
                    int var14 = var12.field1534 + var11;
                    if ((var12.field1541 >= 0 || var12.field1494 != 0) && arg1 >= var13 && arg5 >= var14 && arg1 < var12.field1509 + var13 && arg5 < var12.field1524 + var14) {
                        if (var12.field1541 >= 0) {
                            this.field346 = var12.field1541;
                        } else {
                            this.field346 = var12.field1500;
                        }
                    }
                    if (var12.field1525 == 0) {
                        this.method95(var12.field1546, arg1, var12, true, var13, arg5, var14);
                        if (var12.field1512 > var12.field1524) {
                            this.method180(true, var12.field1524, var12.field1512, var12.field1509 + var13, arg1, -15719, var12, arg5, var14);
                        }
                    } else {
                        if (var12.field1528 == 1 && arg1 >= var13 && arg5 >= var14 && arg1 < var12.field1509 + var13 && arg5 < var12.field1524 + var14) {
                            boolean var15 = false;
                            if (var12.field1529 != 0) {
                                var15 = this.method62(true, var12);
                            }
                            if (!var15) {
                                this.field450[this.field327] = var12.field1492;
                                this.field474[this.field327] = 640;
                                this.field473[this.field327] = var12.field1500;
                                ++this.field327;
                            }
                        }
                        if (var12.field1528 == 2 && this.field255 == 0 && arg1 >= var13 && arg5 >= var14 && arg1 < var12.field1509 + var13 && arg5 < var12.field1524 + var14) {
                            String var16 = var12.field1506;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field450[this.field327] = var16 + " @gre@" + var12.field1536;
                            this.field474[this.field327] = 877;
                            this.field473[this.field327] = var12.field1500;
                            ++this.field327;
                        }
                        if (var12.field1528 == 3 && arg1 >= var13 && arg5 >= var14 && arg1 < var12.field1509 + var13 && arg5 < var12.field1524 + var14) {
                            this.field450[this.field327] = "Close";
                            this.field474[this.field327] = 590;
                            this.field473[this.field327] = var12.field1500;
                            ++this.field327;
                        }
                        if (var12.field1528 == 4 && arg1 >= var13 && arg5 >= var14 && arg1 < var12.field1509 + var13 && arg5 < var12.field1524 + var14) {
                            this.field450[this.field327] = var12.field1492;
                            this.field474[this.field327] = 450;
                            this.field473[this.field327] = var12.field1500;
                            ++this.field327;
                        }
                        if (var12.field1528 == 5 && arg1 >= var13 && arg5 >= var14 && arg1 < var12.field1509 + var13 && arg5 < var12.field1524 + var14) {
                            this.field450[this.field327] = var12.field1492;
                            this.field474[this.field327] = 46;
                            this.field473[this.field327] = var12.field1500;
                            ++this.field327;
                        }
                        if (var12.field1528 == 6 && !this.field159 && arg1 >= var13 && arg5 >= var14 && arg1 < var12.field1509 + var13 && arg5 < var12.field1524 + var14) {
                            this.field450[this.field327] = var12.field1492;
                            this.field474[this.field327] = 924;
                            this.field473[this.field327] = var12.field1500;
                            ++this.field327;
                        }
                        if (var12.field1525 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field1524; ++var18) {
                                for (int var19 = 0; var19 < var12.field1509; ++var19) {
                                    int var20 = (var12.field1503 + 32) * var19 + var13;
                                    int var21 = (var12.field1539 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field1491[var17];
                                        var21 += var12.field1551[var17];
                                    }
                                    if (arg1 >= var20 && arg5 >= var21 && arg1 < var20 + 32 && arg5 < var21 + 32) {
                                        this.field319 = var17;
                                        this.field320 = var12.field1500;
                                        if (var12.field1540[var17] > 0) {
                                            class41 var22 = class41.method374(var12.field1540[var17] - 1);
                                            if (this.field533 == 1 && var12.field1495) {
                                                if (this.field535 != var12.field1500 || this.field534 != var17) {
                                                    this.field450[this.field327] = "Use " + this.field537 + " with @lre@" + var22.field1028;
                                                    this.field474[this.field327] = 571;
                                                    this.field475[this.field327] = var22.field1050;
                                                    this.field472[this.field327] = var17;
                                                    this.field473[this.field327] = var12.field1500;
                                                    ++this.field327;
                                                }
                                            } else if (this.field255 == 1 && var12.field1495) {
                                                if ((this.field257 & 16) == 16) {
                                                    this.field450[this.field327] = this.field258 + " @lre@" + var22.field1028;
                                                    this.field474[this.field327] = 24;
                                                    this.field475[this.field327] = var22.field1050;
                                                    this.field472[this.field327] = var17;
                                                    this.field473[this.field327] = var12.field1500;
                                                    ++this.field327;
                                                }
                                            } else {
                                                if (var12.field1495) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field1051 != null && var22.field1051[var23] != null) {
                                                            this.field450[this.field327] = var22.field1051[var23] + " @lre@" + var22.field1028;
                                                            if (var23 == 3) {
                                                                this.field474[this.field327] = 863;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field474[this.field327] = 196;
                                                            }
                                                            this.field475[this.field327] = var22.field1050;
                                                            this.field472[this.field327] = var17;
                                                            this.field473[this.field327] = var12.field1500;
                                                            ++this.field327;
                                                        } else if (var23 == 4) {
                                                            this.field450[this.field327] = "Drop @lre@" + var22.field1028;
                                                            this.field474[this.field327] = 196;
                                                            this.field475[this.field327] = var22.field1050;
                                                            this.field472[this.field327] = var17;
                                                            this.field473[this.field327] = var12.field1500;
                                                            ++this.field327;
                                                        }
                                                    }
                                                }
                                                if (var12.field1542) {
                                                    this.field450[this.field327] = "Use @lre@" + var22.field1028;
                                                    this.field474[this.field327] = 146;
                                                    this.field475[this.field327] = var22.field1050;
                                                    this.field472[this.field327] = var17;
                                                    this.field473[this.field327] = var12.field1500;
                                                    ++this.field327;
                                                }
                                                if (var12.field1495 && var22.field1051 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field1051[var24] != null) {
                                                            this.field450[this.field327] = var22.field1051[var24] + " @lre@" + var22.field1028;
                                                            if (var24 == 0) {
                                                                this.field474[this.field327] = 723;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field474[this.field327] = 22;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field474[this.field327] = 300;
                                                            }
                                                            this.field475[this.field327] = var22.field1050;
                                                            this.field472[this.field327] = var17;
                                                            this.field473[this.field327] = var12.field1500;
                                                            ++this.field327;
                                                        }
                                                    }
                                                }
                                                if (var12.field1504 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field1504[var25] != null) {
                                                            this.field450[this.field327] = var12.field1504[var25] + " @lre@" + var22.field1028;
                                                            if (var25 == 0) {
                                                                this.field474[this.field327] = 3;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field474[this.field327] = 743;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field474[this.field327] = 705;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field474[this.field327] = 947;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field474[this.field327] = 760;
                                                            }
                                                            this.field475[this.field327] = var22.field1050;
                                                            this.field472[this.field327] = var17;
                                                            this.field473[this.field327] = var12.field1500;
                                                            ++this.field327;
                                                        }
                                                    }
                                                }
                                                this.field450[this.field327] = "Examine @lre@" + var22.field1028;
                                                this.field474[this.field327] = 1752;
                                                this.field475[this.field327] = var22.field1050;
                                                this.field472[this.field327] = var17;
                                                this.field473[this.field327] = var12.field1500;
                                                ++this.field327;
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

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method96(byte arg0) {
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            this.field236 = -1;
        }
        this.field228 = true;
        for (int var3 = 0; var3 < 7; ++var3) {
            this.field124[var3] = -1;
            for (int var4 = 0; var4 < class13.field631; ++var4) {
                if (!class13.field632[var4].field638 && class13.field632[var4].field633 == var3 + (this.field481 ? 0 : 7)) {
                    this.field124[var3] = var4;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method97(int arg0) {
        if (this.field173 != 0) {
            int var2 = 0;
            if (arg0 <= 0) {
                this.field236 = -1;
            }
            if (this.field582 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field520[var3] != null) {
                    int var4 = this.field518[var3];
                    String var5 = this.field519[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field280 == 0 || this.field280 == 1 && this.method174(var5, -39869))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field103 > 4 && super.field104 - 4 > var9 - 10 && super.field104 - 4 <= var9 + 3) {
                            int var10 = this.field357.method420("From:  " + var5 + this.field520[var3], this.field206) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field103 < var10 + 4) {
                                if (this.field479 >= 1) {
                                    this.field450[this.field327] = "Report abuse @whi@" + var5;
                                    this.field474[this.field327] = 2953;
                                    ++this.field327;
                                }
                                this.field450[this.field327] = "Add ignore @whi@" + var5;
                                this.field474[this.field327] = 2013;
                                ++this.field327;
                                this.field450[this.field327] = "Add friend @whi@" + var5;
                                this.field474[this.field327] = 2217;
                                ++this.field327;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field280 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method98(int arg0) {
        int var2 = this.field358.method420("Choose Option", this.field206);
        for (int var3 = 0; var3 < this.field327; ++var3) {
            int var12 = this.field358.method420(this.field450[var3], this.field206);
            if (var12 > var2) {
                var2 = var12;
            }
        }
        var2 += 8;
        if (arg0 != 16143) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        int var5 = this.field327 * 15 + 21;
        if (super.field110 > 4 && super.field111 > 4 && super.field110 < 516 && super.field111 < 338) {
            int var6 = super.field110 - 4 - var2 / 2;
            if (var2 + var6 > 512) {
                var6 = 512 - var2;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field111 - 4;
            if (var5 + var7 > 334) {
                var7 = 334 - var5;
            }
            if (var7 < 0) {
                var7 = 0;
            }
            this.field305 = true;
            this.field179 = 0;
            this.field180 = var6;
            this.field181 = var7;
            this.field182 = var2;
            this.field183 = this.field327 * 15 + 22;
        }
        if (super.field110 > 553 && super.field111 > 205 && super.field110 < 743 && super.field111 < 466) {
            int var8 = super.field110 - 553 - var2 / 2;
            if (var8 < 0) {
                var8 = 0;
            } else if (var2 + var8 > 190) {
                var8 = 190 - var2;
            }
            int var9 = super.field111 - 205;
            if (var9 < 0) {
                var9 = 0;
            } else if (var5 + var9 > 261) {
                var9 = 261 - var5;
            }
            this.field305 = true;
            this.field179 = 1;
            this.field180 = var8;
            this.field181 = var9;
            this.field182 = var2;
            this.field183 = this.field327 * 15 + 22;
        }
        if (super.field110 > 17 && super.field111 > 357 && super.field110 < 496 && super.field111 < 453) {
            int var10 = super.field110 - 17 - var2 / 2;
            if (var10 < 0) {
                var10 = 0;
            } else if (var2 + var10 > 479) {
                var10 = 479 - var2;
            }
            int var11 = super.field111 - 357;
            if (var11 < 0) {
                var11 = 0;
            } else if (var5 + var11 > 96) {
                var11 = 96 - var5;
            }
            this.field305 = true;
            this.field179 = 2;
            this.field180 = var10;
            this.field181 = var11;
            this.field182 = var2;
            this.field183 = this.field327 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public static final void method99(int arg0) {
        if (arg0 != 7) {
            field561 = 264;
        }
        class65.field1581 = true;
        class5.field54 = true;
        field426 = true;
        class3.field42 = true;
        class61.field1410 = true;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method100(boolean arg0) {
        for (int var2 = 0; var2 < this.field307; ++var2) {
            if (this.field417[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field127[var2] == this.field170 && this.field193[var2] == this.field419) {
                        if (!this.method78(true)) {
                            var3 = true;
                        }
                    } else {
                        class31 var4 = class50.method399(this.field127[var2], -164, this.field193[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field901 / 22) > (long) (this.field221 / 22) + this.field210) {
                            this.field221 = var4.field901;
                            this.field210 = System.currentTimeMillis();
                            if (this.method150(var4.field901, -259, var4.field900)) {
                                this.field170 = this.field127[var2];
                                this.field419 = this.field193[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field417[var2] != -5) {
                    this.field417[var2] = -5;
                } else {
                    --this.field307;
                    for (int var6 = var2; var6 < this.field307; ++var6) {
                        this.field127[var6] = this.field127[var6 + 1];
                        this.field193[var6] = this.field193[var6 + 1];
                        this.field417[var6] = this.field417[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field417[var2]--;
            }
        }
        this.field295 &= arg0;
        if (this.field120 > 0) {
            this.field120 -= 20;
            if (this.field120 < 0) {
                this.field120 = 0;
            }
            if (this.field120 == 0 && this.field402 && !field426) {
                this.field285 = this.field178;
                this.field286 = true;
                this.field234.method567(2, this.field285);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method52() {
        this.method59("Starting up", 20, (byte) 3);
        if (signlink.sunjava) {
            super.field89 = 5;
        }
        if (field291) {
            this.field585 = true;
        } else {
            field291 = true;
            boolean var1 = false;
            String var2 = this.method120((byte) 5);
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
                this.field579 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field348[var3] = new class34(var3 + 1, signlink.cache_dat, signlink.cache_idx[var3], 500000, -36202);
                    }
                }
                try {
                    this.method72(field303);
                    this.field308 = this.method114("title", "title screen", true, 1, 25, this.field289[1]);
                    this.field356 = new class54(9, this.field308, "p11_full", false);
                    this.field357 = new class54(9, this.field308, "p12_full", false);
                    this.field358 = new class54(9, this.field308, "b12_full", false);
                    this.field359 = new class54(9, this.field308, "q8_full", true);
                    this.method155(505);
                    this.method81(-375);
                    class26 var4 = this.method114("config", "config", true, 2, 30, this.field289[2]);
                    class26 var5 = this.method114("interface", "interface", true, 3, 35, this.field289[3]);
                    class26 var6 = this.method114("media", "2d graphics", true, 4, 40, this.field289[4]);
                    class26 var7 = this.method114("textures", "textures", true, 6, 45, this.field289[6]);
                    class26 var8 = this.method114("wordenc", "chat system", true, 7, 50, this.field289[7]);
                    class26 var9 = this.method114("sounds", "sound effects", true, 8, 55, this.field289[8]);
                    this.field204 = new byte[4][104][104];
                    this.field389 = new int[4][105][105];
                    this.field521 = new class65(4, 104, this.field389, (byte) 1, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field497[var10] = new class33((byte) -72, 104, 104);
                    }
                    this.field503 = new class12(512, 512);
                    class26 var11 = this.method114("versionlist", "update list", true, 5, 60, this.field289[5]);
                    this.method59("Connecting to update server", 60, (byte) 3);
                    this.field234 = new class67();
                    this.field234.method560(var11, this);
                    class18.method225(this.field234.method561(93));
                    class59.method451(this.field234.method557(true, 0), this.field234);
                    if (!field426) {
                        this.field285 = 0;
                        try {
                            this.field285 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field286 = true;
                        this.field234.method567(2, this.field285);
                        while (this.field234.method571() > 0) {
                            this.method149(field125);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field234.field1680 > 3) {
                                this.method71("ondemand");
                                return;
                            }
                        }
                    }
                    this.method59("Requesting animations", 65, (byte) 3);
                    int var12 = this.field234.method557(true, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field234.method567(1, var13);
                    }
                    while (this.field234.method571() > 0) {
                        int var14 = var12 - this.field234.method571();
                        if (var14 > 0) {
                            this.method59("Loading animations - " + var14 * 100 / var12 + "%", 65, (byte) 3);
                        }
                        this.method149(field125);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field234.field1680 > 3) {
                            this.method71("ondemand");
                            return;
                        }
                    }
                    this.method59("Requesting models", 70, (byte) 3);
                    int var15 = this.field234.method557(true, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field234.method558((byte) 63, var16);
                        if ((var17 & 1) != 0) {
                            this.field234.method567(0, var16);
                        }
                    }
                    int var18 = this.field234.method571();
                    while (this.field234.method571() > 0) {
                        int var19 = var18 - this.field234.method571();
                        if (var19 > 0) {
                            this.method59("Loading models - " + var19 * 100 / var18 + "%", 70, (byte) 3);
                        }
                        this.method149(field125);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field348[0] != null) {
                        this.method59("Requesting maps", 75, (byte) 3);
                        this.field234.method567(3, this.field234.method563(0, 47, 48, true));
                        this.field234.method567(3, this.field234.method563(1, 47, 48, true));
                        this.field234.method567(3, this.field234.method563(0, 48, 48, true));
                        this.field234.method567(3, this.field234.method563(1, 48, 48, true));
                        this.field234.method567(3, this.field234.method563(0, 49, 48, true));
                        this.field234.method567(3, this.field234.method563(1, 49, 48, true));
                        this.field234.method567(3, this.field234.method563(0, 47, 47, true));
                        this.field234.method567(3, this.field234.method563(1, 47, 47, true));
                        this.field234.method567(3, this.field234.method563(0, 48, 47, true));
                        this.field234.method567(3, this.field234.method563(1, 48, 47, true));
                        this.field234.method567(3, this.field234.method563(0, 48, 148, true));
                        this.field234.method567(3, this.field234.method563(1, 48, 148, true));
                        int var20 = this.field234.method571();
                        while (this.field234.method571() > 0) {
                            int var21 = var20 - this.field234.method571();
                            if (var21 > 0) {
                                this.method59("Loading maps - " + var21 * 100 / var20 + "%", 75, (byte) 3);
                            }
                            this.method149(field125);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field234.method557(true, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field234.method558((byte) 63, var23);
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
                            this.field234.method564(var25, 9, var23, 0);
                        }
                    }
                    this.field234.method570(-328, field425);
                    if (!field426) {
                        int var26 = this.field234.method557(true, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field234.method566((byte) -6, var27)) {
                                this.field234.method564((byte) 1, 9, var27, 2);
                            }
                        }
                    }
                    this.method59("Unpacking media", 80, (byte) 3);
                    this.field528 = new class71(var6, "invback", 0);
                    this.field530 = new class71(var6, "chatback", 0);
                    this.field529 = new class71(var6, "mapback", 0);
                    this.field498 = new class71(var6, "backbase1", 0);
                    this.field499 = new class71(var6, "backbase2", 0);
                    this.field500 = new class71(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field385[var28] = new class71(var6, "sideicons", var28);
                    }
                    this.field163 = new class12(var6, "compass", 0);
                    this.field480 = new class12(var6, "mapedge", 0);
                    this.field480.method202(true);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field446[var29] = new class71(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field187[var30] = new class12(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field492[var31] = new class12(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field508[var32] = new class12(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field156 = new class12(var6, "mapmarker", 0);
                    this.field157 = new class12(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field484[var33] = new class12(var6, "cross", var33);
                    }
                    this.field406 = new class12(var6, "mapdots", 0);
                    this.field407 = new class12(var6, "mapdots", 1);
                    this.field408 = new class12(var6, "mapdots", 2);
                    this.field409 = new class12(var6, "mapdots", 3);
                    this.field410 = new class12(var6, "mapdots", 4);
                    this.field176 = new class71(var6, "scrollbar", 0);
                    this.field177 = new class71(var6, "scrollbar", 1);
                    this.field298 = new class71(var6, "redstone1", 0);
                    this.field299 = new class71(var6, "redstone2", 0);
                    this.field300 = new class71(var6, "redstone3", 0);
                    this.field301 = new class71(var6, "redstone1", 0);
                    this.field301.method584(false);
                    this.field302 = new class71(var6, "redstone2", 0);
                    this.field302.method584(false);
                    this.field349 = new class71(var6, "redstone1", 0);
                    this.field349.method585(-25299);
                    this.field350 = new class71(var6, "redstone2", 0);
                    this.field350.method585(-25299);
                    this.field351 = new class71(var6, "redstone3", 0);
                    this.field351.method585(-25299);
                    this.field352 = new class71(var6, "redstone1", 0);
                    this.field352.method584(false);
                    this.field352.method585(-25299);
                    this.field353 = new class71(var6, "redstone2", 0);
                    this.field353.method584(false);
                    this.field353.method585(-25299);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field382[var34] = new class71(var6, "mod_icons", var34);
                    }
                    class12 var35 = new class12(var6, "backleft1", 0);
                    this.field131 = new class9(var35.field621, this.method57(field455), var35.field622, 912);
                    var35.method203(0, 0, false);
                    class12 var36 = new class12(var6, "backleft2", 0);
                    this.field132 = new class9(var36.field621, this.method57(field455), var36.field622, 912);
                    var36.method203(0, 0, false);
                    class12 var37 = new class12(var6, "backright1", 0);
                    this.field133 = new class9(var37.field621, this.method57(field455), var37.field622, 912);
                    var37.method203(0, 0, false);
                    class12 var38 = new class12(var6, "backright2", 0);
                    this.field134 = new class9(var38.field621, this.method57(field455), var38.field622, 912);
                    var38.method203(0, 0, false);
                    class12 var39 = new class12(var6, "backtop1", 0);
                    this.field135 = new class9(var39.field621, this.method57(field455), var39.field622, 912);
                    var39.method203(0, 0, false);
                    class12 var40 = new class12(var6, "backvmid1", 0);
                    this.field136 = new class9(var40.field621, this.method57(field455), var40.field622, 912);
                    var40.method203(0, 0, false);
                    class12 var41 = new class12(var6, "backvmid2", 0);
                    this.field137 = new class9(var41.field621, this.method57(field455), var41.field622, 912);
                    var41.method203(0, 0, false);
                    class12 var42 = new class12(var6, "backvmid3", 0);
                    this.field138 = new class9(var42.field621, this.method57(field455), var42.field622, 912);
                    var42.method203(0, 0, false);
                    class12 var43 = new class12(var6, "backhmid2", 0);
                    this.field139 = new class9(var43.field621, this.method57(field455), var43.field622, 912);
                    var43.method203(0, 0, false);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field187[var48] != null) {
                            this.field187[var48].method201(var45 + var47, var44 + var47, 0, var46 + var47);
                        }
                        if (this.field446[var48] != null) {
                            this.field446[var48].method586(var45 + var47, var44 + var47, 0, var46 + var47);
                        }
                    }
                    this.method59("Unpacking textures", 83, (byte) 3);
                    class5.method30(false, var7);
                    class5.method34(0.8D, 932);
                    class5.method29((byte) 4, 20);
                    this.method59("Unpacking config", 86, (byte) 3);
                    class36.method360(309, var4);
                    class61.method484(var4);
                    class43.method381(309, var4);
                    class41.method369(var4);
                    class58.method445(var4);
                    class13.method213(309, var4);
                    class64.method500(309, var4);
                    class17.method223(309, var4);
                    class2.method2(309, var4);
                    class41.field1047 = field425;
                    if (!field426) {
                        this.method59("Unpacking sounds", 90, (byte) 3);
                        byte[] var49 = var9.method289("sounds.dat", (byte[]) null);
                        class31 var50 = new class31(var49, 8);
                        class50.method398(309, var50);
                    }
                    this.method59("Unpacking interfaces", 95, (byte) 3);
                    class54[] var51 = new class54[] { this.field356, this.field357, this.field358, this.field359 };
                    class63.method497(true, var51, var5, var6);
                    this.method59("Preparing game engine", 100, (byte) 3);
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field529.field1727[this.field529.field1729 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field290[var52] = var53;
                        this.field123[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field529.field1727[this.field529.field1729 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
                                if (var57 == 999) {
                                    var57 = var59;
                                }
                            } else if (var57 != 999) {
                                var58 = var59;
                                break;
                            }
                        }
                        this.field293[var56 - 5] = var57 - 25;
                        this.field495[var56 - 5] = var58 - var57;
                    }
                    class5.method27(96, 479, field415);
                    this.field184 = class5.field65;
                    class5.method27(261, 190, field415);
                    this.field185 = class5.field65;
                    class5.method27(334, 512, field415);
                    this.field186 = class5.field65;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = class5.field63[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    class65.method540(0, 800, 512, var60, 334, 500);
                    class22.method247(var8);
                    this.field148 = new class66(true, this);
                    this.method58(this.field148, 10);
                    class23.field755 = this;
                    class61.field1390 = this;
                    class58.field1277 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field375 + " " + this.field205);
                    this.field281 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method101(int arg0, int arg1) {
        if (arg0 >= 0) {
            if (this.field568 != 0) {
                this.field568 = 0;
                this.field586 = true;
            }
            int var3 = this.field472[arg0];
            int var4 = this.field473[arg0];
            int var5 = this.field474[arg0];
            int var6 = this.field475[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 629) {
                boolean var7 = this.method171(var3, 0, 0, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 0, var4);
                if (!var7) {
                    this.method171(var3, 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var4);
                }
                this.field396 = super.field110;
                this.field397 = super.field111;
                this.field399 = 2;
                this.field398 = 0;
                this.field175.method295(254, 1);
                this.field175.method297(this.field570 + var3);
                this.field175.method332(var6, -79);
                this.field175.method332(this.field571 + var4, -79);
            }
            if (var5 == 412) {
                this.method74(var6, var4, var3, 0);
                this.field175.method295(87, 1);
                this.field175.method332(this.field571 + var4, -79);
                this.field175.method333(var6 >> 14 & 32767, 508);
                this.field175.method331(this.field570 + var3, (byte) 81);
            }
            if (var5 == 505) {
                if (!this.field305) {
                    this.field521.method542(super.field110 - 4, super.field111 - 4, 6);
                } else {
                    this.field521.method542(var3 - 4, var4 - 4, 6);
                }
            }
            if (var5 == 562) {
                class21 var9 = this.field248[var6];
                if (var9 != null) {
                    this.method171(var9.field1200[0], 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var9.field1201[0]);
                    this.field396 = super.field110;
                    this.field397 = super.field111;
                    this.field399 = 2;
                    this.field398 = 0;
                    this.field175.method295(33, 1);
                    this.field175.method331(var6, (byte) 81);
                }
            }
            if (var5 == 209) {
                class44 var10 = this.field440[var6];
                if (var10 != null) {
                    this.method171(var10.field1200[0], 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var10.field1201[0]);
                    this.field396 = super.field110;
                    this.field397 = super.field111;
                    this.field399 = 2;
                    this.field398 = 0;
                    this.field175.method295(236, 1);
                    this.field175.method332(var6, -79);
                    this.field175.method297(this.field256);
                }
            }
            if (var5 == 1912) {
                int var11 = var6 >> 14 & 32767;
                class61 var12 = class61.method491(var11);
                String var13;
                if (var12.field1420 != null) {
                    var13 = new String(var12.field1420);
                } else {
                    var13 = "It's a " + var12.field1424 + ".";
                }
                this.method111(0, var13, "", (byte) 4);
            }
            if (var5 == 640) {
                class63 var14 = class63.field1490[var4];
                boolean var15 = true;
                if (var14.field1529 > 0) {
                    var15 = this.method121((byte) -2, var14);
                }
                if (var15) {
                    this.field175.method295(131, 1);
                    this.field175.method297(var4);
                }
            }
            if (var5 == 124) {
                boolean var16 = this.method171(var3, 0, 0, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 0, var4);
                if (!var16) {
                    this.method171(var3, 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var4);
                }
                this.field396 = super.field110;
                this.field397 = super.field111;
                this.field399 = 2;
                this.field398 = 0;
                this.field175.method295(13, 1);
                this.field175.method331(this.field570 + var3, (byte) 81);
                this.field175.method297(this.field571 + var4);
                this.field175.method332(var6, -79);
            }
            if (var5 == 81) {
                boolean var18 = this.method171(var3, 0, 0, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 0, var4);
                if (!var18) {
                    this.method171(var3, 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var4);
                }
                this.field396 = super.field110;
                this.field397 = super.field111;
                this.field399 = 2;
                this.field398 = 0;
                field412 += var4;
                if (field412 >= 75) {
                    this.field175.method295(246, 1);
                    this.field175.method296(242);
                    field412 = 0;
                }
                this.field175.method295(239, 1);
                this.field175.method331(this.field571 + var4, (byte) 81);
                this.field175.method297(this.field570 + var3);
                this.field175.method333(var6, 508);
            }
            if (var5 == 801) {
                class21 var20 = this.field248[var6];
                if (var20 != null) {
                    this.method171(var20.field1200[0], 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var20.field1201[0]);
                    this.field396 = super.field110;
                    this.field397 = super.field111;
                    this.field399 = 2;
                    this.field398 = 0;
                    this.field175.method295(129, 1);
                    this.field175.method297(var6);
                }
            }
            if (var5 == 217 || var5 == 13 || var5 == 47 || var5 == 281) {
                String var21 = this.field450[arg0];
                int var22 = var21.indexOf("@whi@");
                if (var22 != -1) {
                    long var23 = class70.method576(var21.substring(var22 + 5).trim());
                    if (var5 == 217) {
                        this.method108(-47898, var23);
                    }
                    if (var5 == 13) {
                        this.method73(var23, (byte) 3);
                    }
                    if (var5 == 47) {
                        this.method106(653, var23);
                    }
                    if (var5 == 281) {
                        this.method66(-121, var23);
                    }
                }
            }
            if (var5 == 760) {
                this.field175.method295(247, 1);
                this.field175.method332(var6, -79);
                this.field175.method297(var4);
                this.field175.method333(var3, 508);
                this.field546 = 0;
                this.field547 = var4;
                this.field548 = var3;
                this.field549 = 2;
                if (class63.field1490[var4].field1514 == this.field245) {
                    this.field549 = 1;
                }
                if (class63.field1490[var4].field1514 == this.field297) {
                    this.field549 = 3;
                }
            }
            if (var5 == 667) {
                class44 var25 = this.field440[var6];
                if (var25 != null) {
                    this.method171(var25.field1200[0], 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var25.field1201[0]);
                    this.field396 = super.field110;
                    this.field397 = super.field111;
                    this.field399 = 2;
                    this.field398 = 0;
                    this.field175.method295(180, 1);
                    this.field175.method331(var6, (byte) 81);
                }
            }
            if (var5 == 590) {
                this.method145((byte) 7);
            }
            if (var5 == 22) {
                this.field175.method295(47, 1);
                this.field175.method331(var3, (byte) 81);
                this.field175.method297(var6);
                this.field175.method297(var4);
                this.field546 = 0;
                this.field547 = var4;
                this.field548 = var3;
                this.field549 = 2;
                if (class63.field1490[var4].field1514 == this.field245) {
                    this.field549 = 1;
                }
                if (class63.field1490[var4].field1514 == this.field297) {
                    this.field549 = 3;
                }
            }
            if (var5 == 146) {
                this.field533 = 1;
                this.field534 = var3;
                this.field535 = var4;
                this.field536 = var6;
                this.field537 = class41.method374(var6).field1028;
                this.field255 = 0;
                this.field494 = true;
            } else {
                if (var5 == 196) {
                    this.field175.method295(25, 1);
                    this.field175.method332(var4, -79);
                    this.field175.method333(var3, 508);
                    this.field175.method297(var6);
                    this.field546 = 0;
                    this.field547 = var4;
                    this.field548 = var3;
                    this.field549 = 2;
                    if (class63.field1490[var4].field1514 == this.field245) {
                        this.field549 = 1;
                    }
                    if (class63.field1490[var4].field1514 == this.field297) {
                        this.field549 = 3;
                    }
                }
                if (var5 == 1842) {
                    class44 var26 = this.field440[var6];
                    if (var26 != null) {
                        class58 var27 = var26.field1080;
                        if (var27.field1276 != null) {
                            var27 = var27.method448(true);
                        }
                        if (var27 != null) {
                            String var28;
                            if (var27.field1290 != null) {
                                var28 = new String(var27.field1290);
                            } else {
                                var28 = "It's a " + var27.field1252 + ".";
                            }
                            this.method111(0, var28, "", (byte) 4);
                        }
                    }
                }
                if (var5 == 953) {
                    String var29 = this.field450[arg0];
                    int var30 = var29.indexOf("@whi@");
                    if (var30 != -1) {
                        if (this.field245 == -1) {
                            this.method145((byte) 7);
                            this.field318 = var29.substring(var30 + 5).trim();
                            this.field317 = false;
                            for (int var31 = 0; var31 < class63.field1490.length; ++var31) {
                                if (class63.field1490[var31] != null && class63.field1490[var31].field1529 == 600) {
                                    this.field569 = this.field245 = class63.field1490[var31].field1514;
                                    break;
                                }
                            }
                        } else {
                            this.method111(0, "Please close the interface you have open before using 'report abuse'", "", (byte) 4);
                        }
                    }
                }
                if (var5 == 450) {
                    this.field175.method295(131, 1);
                    this.field175.method297(var4);
                    class63 var32 = class63.field1490[var4];
                    if (var32.field1553 != null && var32.field1553[0][0] == 5) {
                        int var33 = var32.field1553[0][1];
                        this.field478[var33] = 1 - this.field478[var33];
                        this.method116(var33, true);
                        this.field494 = true;
                    }
                }
                if (var5 == 270) {
                    class44 var34 = this.field440[var6];
                    if (var34 != null) {
                        this.method171(var34.field1200[0], 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var34.field1201[0]);
                        this.field396 = super.field110;
                        this.field397 = super.field111;
                        this.field399 = 2;
                        this.field398 = 0;
                        this.field175.method295(77, 1);
                        this.field175.method297(var6);
                    }
                }
                if (var5 == 863) {
                    ++field276;
                    if (field276 >= 135) {
                        this.field175.method295(38, 1);
                        this.field175.method296(167);
                        field276 = 0;
                    }
                    this.field175.method295(8, 1);
                    this.field175.method333(var4, 508);
                    this.field175.method333(var6, 508);
                    this.field175.method332(var3, -79);
                    this.field546 = 0;
                    this.field547 = var4;
                    this.field548 = var3;
                    this.field549 = 2;
                    if (class63.field1490[var4].field1514 == this.field245) {
                        this.field549 = 1;
                    }
                    if (class63.field1490[var4].field1514 == this.field297) {
                        this.field549 = 3;
                    }
                }
                if (var5 == 24) {
                    this.field175.method295(85, 1);
                    this.field175.method297(var6);
                    this.field175.method297(var3);
                    this.field175.method297(this.field256);
                    this.field175.method331(var4, (byte) 81);
                    this.field546 = 0;
                    this.field547 = var4;
                    this.field548 = var3;
                    this.field549 = 2;
                    if (class63.field1490[var4].field1514 == this.field245) {
                        this.field549 = 1;
                    }
                    if (class63.field1490[var4].field1514 == this.field297) {
                        this.field549 = 3;
                    }
                }
                if (var5 == 15 || var5 == 84) {
                    String var35 = this.field450[arg0];
                    int var36 = var35.indexOf("@whi@");
                    if (var36 != -1) {
                        String var37 = var35.substring(var36 + 5).trim();
                        String var38 = class70.method580((byte) 86, class70.method577(class70.method576(var37), -642));
                        boolean var39 = false;
                        for (int var40 = 0; var40 < this.field249; ++var40) {
                            class21 var41 = this.field248[this.field250[var40]];
                            if (var41 != null && var41.field698 != null && var41.field698.equalsIgnoreCase(var38)) {
                                this.method171(var41.field1200[0], 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var41.field1201[0]);
                                if (var5 == 15) {
                                    this.field175.method295(177, 1);
                                    this.field175.method297(this.field250[var40]);
                                }
                                if (var5 == 84) {
                                    field145 += var6;
                                    if (field145 >= 78) {
                                        this.field175.method295(15, 1);
                                        this.field175.method300(0);
                                        field145 = 0;
                                    }
                                    this.field175.method295(113, 1);
                                    this.field175.method297(this.field250[var40]);
                                }
                                var39 = true;
                                break;
                            }
                        }
                        if (!var39) {
                            this.method111(0, "Unable to find " + var38, "", (byte) 4);
                        }
                    }
                }
                if (var5 == 745) {
                    ++field374;
                    if (field374 >= 142) {
                        this.field175.method295(170, 1);
                        field374 = 0;
                    }
                    this.method74(var6, var4, var3, 0);
                    this.field175.method295(175, 1);
                    this.field175.method331(this.field570 + var3, (byte) 81);
                    this.field175.method331(var6 >> 14 & 32767, (byte) 81);
                    this.field175.method331(this.field571 + var4, (byte) 81);
                }
                if (var5 == 571) {
                    this.field175.method295(238, 1);
                    this.field175.method297(var3);
                    this.field175.method297(var4);
                    this.field175.method297(this.field536);
                    this.field175.method333(this.field535, 508);
                    this.field175.method333(var6, 508);
                    this.field175.method331(this.field534, (byte) 81);
                    this.field546 = 0;
                    this.field547 = var4;
                    this.field548 = var3;
                    this.field549 = 2;
                    if (class63.field1490[var4].field1514 == this.field245) {
                        this.field549 = 1;
                    }
                    if (class63.field1490[var4].field1514 == this.field297) {
                        this.field549 = 3;
                    }
                }
                if (var5 == 46) {
                    this.field175.method295(131, 1);
                    this.field175.method297(var4);
                    class63 var42 = class63.field1490[var4];
                    if (var42.field1553 != null && var42.field1553[0][0] == 5) {
                        int var43 = var42.field1553[0][1];
                        if (this.field478[var43] != var42.field1521[0]) {
                            this.field478[var43] = var42.field1521[0];
                            this.method116(var43, true);
                            this.field494 = true;
                        }
                    }
                }
                if (var5 == 705) {
                    if ((var4 & 3) == 0) {
                        ++field544;
                    }
                    if (field544 >= 100) {
                        this.field175.method295(24, 1);
                        this.field175.method296(71);
                        field544 = 0;
                    }
                    this.field175.method295(221, 1);
                    this.field175.method333(var4, 508);
                    this.field175.method331(var6, (byte) 81);
                    this.field175.method331(var3, (byte) 81);
                    this.field546 = 0;
                    this.field547 = var4;
                    this.field548 = var3;
                    this.field549 = 2;
                    if (class63.field1490[var4].field1514 == this.field245) {
                        this.field549 = 1;
                    }
                    if (class63.field1490[var4].field1514 == this.field297) {
                        this.field549 = 3;
                    }
                }
                if (var5 == 572) {
                    boolean var44 = this.method171(var3, 0, 0, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 0, var4);
                    if (!var44) {
                        this.method171(var3, 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var4);
                    }
                    this.field396 = super.field110;
                    this.field397 = super.field111;
                    this.field399 = 2;
                    this.field398 = 0;
                    this.field175.method295(142, 1);
                    this.field175.method332(var6, -79);
                    this.field175.method297(this.field256);
                    this.field175.method297(this.field570 + var3);
                    this.field175.method331(this.field571 + var4, (byte) 81);
                }
                if (var5 == 1859) {
                    class41 var46 = class41.method374(var6);
                    String var47;
                    if (var46.field1031 != null) {
                        var47 = new String(var46.field1031);
                    } else {
                        var47 = "It's a " + var46.field1028 + ".";
                    }
                    this.method111(0, var47, "", (byte) 4);
                }
                if (var5 == 464) {
                    class44 var48 = this.field440[var6];
                    if (var48 != null) {
                        this.method171(var48.field1200[0], 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var48.field1201[0]);
                        this.field396 = super.field110;
                        this.field397 = super.field111;
                        this.field399 = 2;
                        this.field398 = 0;
                        this.field175.method295(156, 1);
                        this.field175.method297(var6);
                    }
                }
                if (var5 == 964) {
                    class21 var49 = this.field248[var6];
                    if (var49 != null) {
                        this.method171(var49.field1200[0], 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var49.field1201[0]);
                        this.field396 = super.field110;
                        this.field397 = super.field111;
                        this.field399 = 2;
                        this.field398 = 0;
                        this.field175.method295(45, 1);
                        this.field175.method332(this.field256, -79);
                        this.field175.method297(var6);
                    }
                }
                if (var5 == 296) {
                    class44 var50 = this.field440[var6];
                    if (var50 != null) {
                        this.method171(var50.field1200[0], 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var50.field1201[0]);
                        this.field396 = super.field110;
                        this.field397 = super.field111;
                        this.field399 = 2;
                        this.field398 = 0;
                        if ((var6 & 3) == 0) {
                            ++field453;
                        }
                        if (field453 >= 103) {
                            this.field175.method295(17, 1);
                            this.field175.method296(3);
                            field453 = 0;
                        }
                        this.field175.method295(89, 1);
                        this.field175.method297(var6);
                    }
                }
                if (var5 == 128) {
                    class21 var51 = this.field248[var6];
                    if (var51 != null) {
                        this.method171(var51.field1200[0], 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var51.field1201[0]);
                        this.field396 = super.field110;
                        this.field397 = super.field111;
                        this.field399 = 2;
                        this.field398 = 0;
                        this.field175.method295(240, 1);
                        this.field175.method297(this.field534);
                        this.field175.method332(var6, -79);
                        this.field175.method332(this.field535, -79);
                        this.field175.method331(this.field536, (byte) 81);
                    }
                }
                if (var5 == 919) {
                    this.method74(var6, var4, var3, 0);
                    this.field175.method295(111, 1);
                    this.field175.method331(this.field571 + var4, (byte) 81);
                    this.field175.method332(this.field570 + var3, -79);
                    this.field175.method333(var6 >> 14 & 32767, 508);
                }
                if (var5 == 90) {
                    class21 var52 = this.field248[var6];
                    if (var52 != null) {
                        this.method171(var52.field1200[0], 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var52.field1201[0]);
                        this.field396 = super.field110;
                        this.field397 = super.field111;
                        this.field399 = 2;
                        this.field398 = 0;
                        field122 += var6;
                        if (field122 >= 108) {
                            this.field175.method295(67, 1);
                            this.field175.method297(59871);
                            field122 = 0;
                        }
                        this.field175.method295(7, 1);
                        this.field175.method297(var6);
                    }
                }
                if (var5 == 723) {
                    this.field175.method295(140, 1);
                    this.field175.method332(var6, -79);
                    this.field175.method297(var4);
                    this.field175.method333(var3, 508);
                    this.field546 = 0;
                    this.field547 = var4;
                    this.field548 = var3;
                    this.field549 = 2;
                    if (class63.field1490[var4].field1514 == this.field245) {
                        this.field549 = 1;
                    }
                    if (class63.field1490[var4].field1514 == this.field297) {
                        this.field549 = 3;
                    }
                }
                if (var5 == 901) {
                    class21 var53 = this.field248[var6];
                    if (var53 != null) {
                        this.method171(var53.field1200[0], 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var53.field1201[0]);
                        this.field396 = super.field110;
                        this.field397 = super.field111;
                        this.field399 = 2;
                        this.field398 = 0;
                        field145 += var6;
                        if (field145 >= 78) {
                            this.field175.method295(15, 1);
                            this.field175.method300(0);
                            field145 = 0;
                        }
                        this.field175.method295(113, 1);
                        this.field175.method297(var6);
                    }
                }
                if (var5 == 633) {
                    boolean var54 = this.method171(var3, 0, 0, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 0, var4);
                    if (!var54) {
                        this.method171(var3, 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var4);
                    }
                    this.field396 = super.field110;
                    this.field397 = super.field111;
                    this.field399 = 2;
                    this.field398 = 0;
                    if ((this.field571 & 3) == 0) {
                        ++field381;
                    }
                    if (field381 >= 105) {
                        this.field175.method295(35, 1);
                        this.field175.method296(54);
                        field381 = 0;
                    }
                    this.field175.method295(34, 1);
                    this.field175.method332(this.field571 + var4, -79);
                    this.field175.method333(var6, 508);
                    this.field175.method333(this.field570 + var3, 508);
                }
                if (var5 == 924 && !this.field159) {
                    this.field175.method295(184, 1);
                    this.field175.method297(var4);
                    this.field159 = true;
                }
                if (var5 == 338) {
                    class21 var56 = this.field248[var6];
                    if (var56 != null) {
                        this.method171(var56.field1200[0], 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var56.field1201[0]);
                        this.field396 = super.field110;
                        this.field397 = super.field111;
                        this.field399 = 2;
                        this.field398 = 0;
                        this.field175.method295(177, 1);
                        this.field175.method297(var6);
                    }
                }
                if (var5 == 187) {
                    class44 var57 = this.field440[var6];
                    if (var57 != null) {
                        this.method171(var57.field1200[0], 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var57.field1201[0]);
                        this.field396 = super.field110;
                        this.field397 = super.field111;
                        this.field399 = 2;
                        this.field398 = 0;
                        this.field175.method295(152, 1);
                        this.field175.method331(var6, (byte) 81);
                    }
                }
                if (var5 == 770 && this.method74(var6, var4, var3, 0)) {
                    this.field175.method295(216, 1);
                    this.field175.method333(this.field256, 508);
                    this.field175.method331(this.field571 + var4, (byte) 81);
                    this.field175.method333(var6 >> 14 & 32767, 508);
                    this.field175.method332(this.field570 + var3, -79);
                }
                if (var5 == 3) {
                    this.field175.method295(255, 1);
                    this.field175.method332(var6, -79);
                    this.field175.method332(var4, -79);
                    this.field175.method332(var3, -79);
                    this.field546 = 0;
                    this.field547 = var4;
                    this.field548 = var3;
                    this.field549 = 2;
                    if (class63.field1490[var4].field1514 == this.field245) {
                        this.field549 = 1;
                    }
                    if (class63.field1490[var4].field1514 == this.field297) {
                        this.field549 = 3;
                    }
                }
                if (var5 == 943) {
                    boolean var58 = this.method171(var3, 0, 0, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 0, var4);
                    if (!var58) {
                        this.method171(var3, 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var4);
                    }
                    this.field396 = super.field110;
                    this.field397 = super.field111;
                    this.field399 = 2;
                    this.field398 = 0;
                    this.field175.method295(124, 1);
                    this.field175.method331(this.field570 + var3, (byte) 81);
                    this.field175.method297(this.field571 + var4);
                    this.field175.method332(var6, -79);
                }
                if (var5 == 743) {
                    this.field175.method295(100, 1);
                    this.field175.method297(var6);
                    this.field175.method333(var3, 508);
                    this.field175.method332(var4, -79);
                    this.field546 = 0;
                    this.field547 = var4;
                    this.field548 = var3;
                    this.field549 = 2;
                    if (class63.field1490[var4].field1514 == this.field245) {
                        this.field549 = 1;
                    }
                    if (class63.field1490[var4].field1514 == this.field297) {
                        this.field549 = 3;
                    }
                }
                if (var5 == 1752) {
                    class41 var60 = class41.method374(var6);
                    class63 var61 = class63.field1490[var4];
                    String var62;
                    if (var61 != null && var61.field1517[var3] >= 100000) {
                        var62 = var61.field1517[var3] + " x " + var60.field1028;
                    } else if (var60.field1031 != null) {
                        var62 = new String(var60.field1031);
                    } else {
                        var62 = "It's a " + var60.field1028 + ".";
                    }
                    this.method111(0, var62, "", (byte) 4);
                }
                if (var5 == 237) {
                    class44 var63 = this.field440[var6];
                    if (var63 != null) {
                        this.method171(var63.field1200[0], 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var63.field1201[0]);
                        this.field396 = super.field110;
                        this.field397 = super.field111;
                        this.field399 = 2;
                        this.field398 = 0;
                        this.field175.method295(252, 1);
                        this.field175.method333(this.field535, 508);
                        this.field175.method297(this.field534);
                        this.field175.method297(this.field536);
                        this.field175.method297(var6);
                    }
                }
                if (var5 == 947) {
                    this.field175.method295(207, 1);
                    this.field175.method297(var4);
                    this.field175.method331(var3, (byte) 81);
                    this.field175.method333(var6, 508);
                    this.field546 = 0;
                    this.field547 = var4;
                    this.field548 = var3;
                    this.field549 = 2;
                    if (class63.field1490[var4].field1514 == this.field245) {
                        this.field549 = 1;
                    }
                    if (class63.field1490[var4].field1514 == this.field297) {
                        this.field549 = 3;
                    }
                }
                if (var5 == 904) {
                    String var64 = this.field450[arg0];
                    int var65 = var64.indexOf("@whi@");
                    if (var65 != -1) {
                        long var66 = class70.method576(var64.substring(var65 + 5).trim());
                        int var68 = -1;
                        for (int var69 = 0; var69 < this.field309; ++var69) {
                            if (this.field509[var69] == var66) {
                                var68 = var69;
                                break;
                            }
                        }
                        if (var68 != -1 && this.field507[var68] > 0) {
                            this.field586 = true;
                            this.field568 = 0;
                            this.field296 = true;
                            this.field506 = "";
                            this.field444 = 3;
                            this.field261 = this.field509[var68];
                            this.field560 = "Enter message to send to " + this.field340[var68];
                        }
                    }
                }
                if (var5 == 877) {
                    class63 var70 = class63.field1490[var4];
                    this.field255 = 1;
                    this.field256 = var4;
                    this.field257 = var70.field1498;
                    this.field533 = 0;
                    this.field494 = true;
                    String var71 = var70.field1506;
                    if (var71.indexOf(" ") != -1) {
                        var71 = var71.substring(0, var71.indexOf(" "));
                    }
                    String var72 = var70.field1506;
                    if (var72.indexOf(" ") != -1) {
                        var72 = var72.substring(var72.indexOf(" ") + 1);
                    }
                    this.field258 = var71 + " " + var70.field1536 + " " + var72;
                    if (this.field257 == 16) {
                        this.field494 = true;
                        this.field405 = 3;
                        this.field292 = true;
                    }
                } else {
                    if (var5 == 701 && this.method74(var6, var4, var3, 0)) {
                        this.field175.method295(29, 1);
                        this.field175.method297(this.field570 + var3);
                        this.field175.method331(var6 >> 14 & 32767, (byte) 81);
                        this.field175.method331(this.field535, (byte) 81);
                        this.field175.method297(this.field536);
                        this.field175.method333(this.field534, 508);
                        this.field175.method297(this.field571 + var4);
                    }
                    if (var5 == 1043) {
                        this.method74(var6, var4, var3, 0);
                        this.field175.method295(185, 1);
                        this.field175.method297(var6 >> 14 & 32767);
                        this.field175.method332(this.field571 + var4, -79);
                        this.field175.method297(this.field570 + var3);
                    }
                    if (var5 == 707) {
                        this.method74(var6, var4, var3, 0);
                        this.field175.method295(208, 1);
                        this.field175.method331(this.field570 + var3, (byte) 81);
                        this.field175.method331(var6 >> 14 & 32767, (byte) 81);
                        this.field175.method331(this.field571 + var4, (byte) 81);
                    }
                    if (var5 == 389) {
                        boolean var73 = this.method171(var3, 0, 0, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 0, var4);
                        if (!var73) {
                            this.method171(var3, 0, 1, 2, field454.field1200[0], 0, false, 0, (byte) 4, field454.field1201[0], 1, var4);
                        }
                        this.field396 = super.field110;
                        this.field397 = super.field111;
                        this.field399 = 2;
                        this.field398 = 0;
                        this.field175.method295(120, 1);
                        this.field175.method331(this.field570 + var3, (byte) 81);
                        this.field175.method331(this.field536, (byte) 81);
                        this.field175.method297(this.field535);
                        this.field175.method332(this.field534, -79);
                        this.field175.method333(var6, 508);
                        this.field175.method297(this.field571 + var4);
                    }
                    if (var5 == 300) {
                        this.field175.method295(40, 1);
                        this.field175.method297(var6);
                        this.field175.method332(var3, -79);
                        this.field175.method332(var4, -79);
                        this.field546 = 0;
                        this.field547 = var4;
                        this.field548 = var3;
                        this.field549 = 2;
                        if (class63.field1490[var4].field1514 == this.field245) {
                            this.field549 = 1;
                        }
                        if (class63.field1490[var4].field1514 == this.field297) {
                            this.field549 = 3;
                        }
                    }
                    this.field533 = 0;
                    if (arg1 != 16655) {
                        this.field496 = null;
                    }
                    this.field255 = 0;
                    this.field494 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLDHMMFTZG;)V")
    private final void method102(byte arg0, class11 arg1) {
        if (arg0 != 107) {
            this.field236 = -1;
        }
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field602 == 0) {
            var3 = this.field521.method530(arg1.field601, arg1.field603, arg1.field604);
        }
        if (arg1.field602 == 1) {
            var3 = this.field521.method531(-45819, arg1.field604, arg1.field601, arg1.field603);
        }
        if (arg1.field602 == 2) {
            var3 = this.field521.method532(arg1.field601, arg1.field603, arg1.field604);
        }
        if (arg1.field602 == 3) {
            var3 = this.field521.method533(arg1.field601, arg1.field603, arg1.field604);
        }
        if (var3 != 0) {
            int var7 = this.field521.method534(arg1.field601, arg1.field603, arg1.field604, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field605 = var4;
        arg1.field607 = var5;
        arg1.field606 = var6;
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method103(byte arg0) {
        class25 var2 = (class25) this.field230.method393();
        if (arg0 == 0) {
            boolean var3 = false;
            while (var2 != null) {
                if (this.field146 == var2.field806 && field271 <= var2.field799) {
                    if (field271 >= var2.field798) {
                        if (var2.field814 > 0) {
                            class44 var4 = this.field440[var2.field814 - 1];
                            if (var4 != null && var4.field1214 >= 0 && var4.field1214 < 13312 && var4.field1215 >= 0 && var4.field1215 < 13312) {
                                var2.method287(this.method173(var4.field1215, var4.field1214, var2.field806, 1) - var2.field810, var4.field1214, var4.field1215, field271, true);
                            }
                        }
                        if (var2.field814 < 0) {
                            int var5 = -var2.field814 - 1;
                            class21 var6;
                            if (this.field401 == var5) {
                                var6 = field454;
                            } else {
                                var6 = this.field248[var5];
                            }
                            if (var6 != null && var6.field1214 >= 0 && var6.field1214 < 13312 && var6.field1215 >= 0 && var6.field1215 < 13312) {
                                var2.method287(this.method173(var6.field1215, var6.field1214, var2.field806, 1) - var2.field810, var6.field1214, var6.field1215, field271, true);
                            }
                        }
                        var2.method286(this.field456, this.field121);
                        this.field521.method515((int) var2.field803, -1, 60, false, this.field146, (int) var2.field801, var2, (int) var2.field802, (byte) -48, var2.field816);
                    }
                } else {
                    var2.method290();
                }
                var2 = (class25) this.field230.method395(true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method104(byte arg0) {
        if (arg0 != 21) {
            this.field160 = !this.field160;
        }
        if (field426 && this.field275 == 2 && class3.field38 != this.field146) {
            this.field266.method196(true);
            this.field357.method418(151, 257, "Loading - please wait.", 0, 5);
            this.field357.method418(150, 256, "Loading - please wait.", 16777215, 5);
            this.field266.method197(super.field95, 4, true, 4);
            this.field275 = 1;
            this.field339 = System.currentTimeMillis();
        }
        if (this.field275 == 1) {
            int var2 = this.method105(0);
            if (var2 != 0 && System.currentTimeMillis() - this.field339 > 360000L) {
                signlink.reporterror(this.field335 + " glcfb " + this.field191 + "," + var2 + "," + field426 + "," + this.field348[0] + "," + this.field234.method571() + "," + this.field146 + "," + this.field342 + "," + this.field343);
                this.field339 = System.currentTimeMillis();
            }
        }
        if (this.field275 == 2 && this.field550 != this.field146) {
            this.field550 = this.field146;
            this.method87(0, this.field146);
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)I")
    public final int method105(int arg0) {
        for (int var2 = 0; var2 < this.field443.length; ++var2) {
            if (this.field443[var2] == null && this.field153[var2] != -1) {
                return -1;
            }
            if (this.field171[var2] == null && this.field154[var2] != -1) {
                return -2;
            }
        }
        this.field235 += arg0;
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field443.length; ++var4) {
            byte[] var5 = this.field171[var4];
            if (var5 != null) {
                int var6 = (this.field152[var4] >> 8) * 64 - this.field570;
                int var7 = (this.field152[var4] & 255) * 64 - this.field571;
                if (this.field384) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class3.method24(var7, false, var5, var6);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field202) {
            return -4;
        } else {
            this.field275 = 2;
            class3.field38 = this.field146;
            this.method131(595);
            this.field175.method295(88, 1);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IJ)V")
    public final void method106(int arg0, long arg1) {
        if (arg0 > 0) {
            if (arg1 != 0L) {
                for (int var4 = 0; var4 < this.field309; ++var4) {
                    if (this.field509[var4] == arg1) {
                        --this.field309;
                        this.field494 = true;
                        for (int var5 = var4; var5 < this.field309; ++var5) {
                            this.field340[var5] = this.field340[var5 + 1];
                            this.field507[var5] = this.field507[var5 + 1];
                            this.field509[var5] = this.field509[var5 + 1];
                        }
                        this.field175.method295(193, 1);
                        this.field175.method302(arg1, (byte) -65);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method107(int arg0) {
        this.field355 = 0;
        if (arg0 != -34462) {
            this.field496 = null;
        }
        int var2 = (field454.field1214 >> 7) + this.field570;
        int var3 = (field454.field1215 >> 7) + this.field571;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field355 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field355 = 1;
        }
        if (this.field355 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field355 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IJ)V")
    public final void method108(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field309 >= 100 && this.field244 != 1) {
                this.method111(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "", (byte) 4);
            } else if (this.field309 >= 200) {
                this.method111(0, "Your friendlist is full. Max of 100 for free users, and 200 for members", "", (byte) 4);
            } else {
                String var4 = class70.method580((byte) 86, class70.method577(arg1, -642));
                for (int var5 = 0; var5 < this.field309; ++var5) {
                    if (this.field509[var5] == arg1) {
                        this.method111(0, var4 + " is already on your friend list", "", (byte) 4);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field413; ++var6) {
                    if (this.field420[var6] == arg1) {
                        this.method111(0, "Please remove " + var4 + " from your ignore list first", "", (byte) 4);
                        return;
                    }
                }
                if (arg0 == -47898) {
                    if (!var4.equals(field454.field698)) {
                        this.field340[this.field309] = var4;
                        this.field509[this.field309] = arg1;
                        this.field507[this.field309] = 0;
                        ++this.field309;
                        this.field494 = true;
                        this.field175.method295(217, 1);
                        this.field175.method302(arg1, (byte) -65);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method109(int arg0) {
        ++this.field147;
        this.method132(237, true);
        this.method170(true, (byte) 101);
        this.method132(237, false);
        this.method170(false, (byte) 101);
        this.method103((byte) 0);
        this.method68((byte) 7);
        if (!this.field274) {
            int var2 = this.field486;
            if (this.field172 / 256 > var2) {
                var2 = this.field172 / 256;
            }
            if (this.field562[4] && this.field151[4] + 128 > var2) {
                var2 = this.field151[4] + 128;
            }
            int var3 = this.field487 + this.field448 & 2047;
            this.method119(this.method173(field454.field1215, field454.field1214, this.field146, 1) - 50, var2 * 3 + 600, this.field457, var3, this.field458, 0, var2);
        }
        int var4;
        if (!this.field274) {
            var4 = this.method190(this.field416);
        } else {
            var4 = this.method191(-40997);
        }
        int var5 = this.field555;
        int var6 = this.field556;
        int var7 = this.field557;
        int var8 = this.field558;
        int var9 = this.field559;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field562[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field436[var10] * 2 + 1) - (double) this.field436[var10] + Math.sin((double) this.field491[var10] / 100.0D * (double) this.field288[var10]) * (double) this.field151[var10]);
                if (var10 == 0) {
                    this.field555 += var12;
                }
                if (var10 == 1) {
                    this.field556 += var12;
                }
                if (var10 == 2) {
                    this.field557 += var12;
                }
                if (var10 == 3) {
                    this.field559 = this.field559 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field558 += var12;
                    if (this.field558 < 128) {
                        this.field558 = 128;
                    }
                    if (this.field558 > 383) {
                        this.field558 = 383;
                    }
                }
            }
        }
        int var11 = class5.field74;
        class59.field1362 = true;
        class59.field1365 = 0;
        class59.field1363 = super.field103 - 4;
        class59.field1364 = super.field104 - 4;
        class19.method233(this.field220);
        this.field521.method543(var4, this.field557, (byte) 6, this.field558, this.field559, this.field555, this.field556);
        this.field521.method518((byte) 8);
        this.method158(true);
        this.method141(0);
        this.method88(0, var11);
        this.method184(0);
        this.field266.method197(super.field95, 4, true, 4);
        this.field555 = var5;
        this.field556 = var6;
        this.field557 = var7;
        this.field558 = var8;
        if (arg0 >= 0) {
            this.field496 = null;
        }
        this.field559 = var9;
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LTNOPEJNZ;II)I")
    public final int method110(class63 arg0, int arg1, int arg2) {
        if (arg1 >= 0) {
            this.method52();
        }
        if (arg0.field1553 != null && arg2 < arg0.field1553.length) {
            try {
                int[] var4 = arg0.field1553[arg2];
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
                        var9 = this.field391[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field485[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field283[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class63 var11 = class63.field1490[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class41.field1026 && (!class41.method374(var12).field1037 || field425)) {
                            for (int var13 = 0; var13 < var11.field1540.length; ++var13) {
                                if (var12 + 1 == var11.field1540[var13]) {
                                    var9 += var11.field1517[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field478[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field341[this.field485[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field478[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field454.field730;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class15.field647; ++var14) {
                            if (class15.field649[var14]) {
                                var9 += this.field485[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class63 var15 = class63.field1490[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class41.field1026 && (!class41.method374(var16).field1037 || field425)) {
                            for (int var17 = 0; var17 < var15.field1540.length; ++var17) {
                                if (var15.field1540[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field429;
                    }
                    if (var8 == 12) {
                        var9 = this.field227;
                    }
                    if (var8 == 13) {
                        int var18 = this.field478[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class2 var21 = class2.field6[var20];
                        int var22 = var21.field8;
                        int var23 = var21.field9;
                        int var24 = var21.field10;
                        int var25 = field567[var24 - var23];
                        var9 = this.field478[var22] >> var23 & var25;
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
                        var9 = (field454.field1214 >> 7) + this.field570;
                    }
                    if (var8 == 19) {
                        var9 = (field454.field1215 >> 7) + this.field571;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)V")
    public final void method111(int arg0, String arg1, String arg2, byte arg3) {
        if (arg0 == 0 && this.field400 != -1) {
            this.field164 = arg1;
            super.field109 = 0;
        }
        if (this.field297 == -1) {
            this.field586 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field518[var5] = this.field518[var5 - 1];
            this.field519[var5] = this.field519[var5 - 1];
            this.field520[var5] = this.field520[var5 - 1];
        }
        this.field518[0] = arg0;
        this.field519[0] = arg2;
        if (arg3 == 4) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        this.field520[0] = arg1;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method112(boolean arg0, int arg1) {
        if (arg0) {
            this.field236 = this.field254.method306();
        }
        class63 var3 = class63.field1490[arg1];
        for (int var4 = 0; var4 < var3.field1544.length && var3.field1544[var4] != -1; ++var4) {
            class63 var5 = class63.field1490[var3.field1544[var4]];
            if (var5.field1525 == 1) {
                this.method112(false, var5.field1500);
            }
            var5.field1510 = 0;
            var5.field1526 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method113(boolean arg0) {
        this.field295 &= arg0;
        try {
            int var2 = field454.field1214 + this.field314;
            int var3 = field454.field1215 + this.field194;
            if (this.field457 - var2 < -500 || this.field457 - var2 > 500 || this.field458 - var3 < -500 || this.field458 - var3 > 500) {
                this.field457 = var2;
                this.field458 = var3;
            }
            if (this.field457 != var2) {
                this.field457 += (var2 - this.field457) / 16;
            }
            if (this.field458 != var3) {
                this.field458 += (var3 - this.field458) / 16;
            }
            if (super.field113[1] == 1) {
                this.field488 += (-24 - this.field488) / 2;
            } else if (super.field113[2] == 1) {
                this.field488 += (24 - this.field488) / 2;
            } else {
                this.field488 /= 2;
            }
            if (super.field113[3] == 1) {
                this.field489 += (12 - this.field489) / 2;
            } else if (super.field113[4] == 1) {
                this.field489 += (-12 - this.field489) / 2;
            } else {
                this.field489 /= 2;
            }
            this.field487 = this.field488 / 2 + this.field487 & 2047;
            this.field486 += this.field489 / 2;
            if (this.field486 < 128) {
                this.field486 = 128;
            }
            if (this.field486 > 383) {
                this.field486 = 383;
            }
            int var4 = this.field457 >> 7;
            int var5 = this.field458 >> 7;
            int var6 = this.method173(this.field458, this.field457, this.field146, 1);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field146;
                        if (var10 < 3 && (this.field204[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field389[var10][var8][var9];
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
            if (var12 > this.field172) {
                this.field172 += (var12 - this.field172) / 24;
            } else if (var12 < this.field172) {
                this.field172 += (var12 - this.field172) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field454.field1214 + "," + field454.field1215 + "," + this.field457 + "," + this.field458 + "," + this.field342 + "," + this.field343 + "," + this.field570 + "," + this.field571);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZIII)LHRXSNEYZ;")
    public final class26 method114(String arg0, String arg1, boolean arg2, int arg3, int arg4, int arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field348[0] != null) {
                var7 = this.field348[0].method356(arg3, 0);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field545.reset();
            this.field545.update(var7);
            int var9 = (int) this.field545.getValue();
            if (arg5 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class26(var7, (byte) 6);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method59("Requesting " + arg1, arg4, (byte) 3);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method94(arg0 + arg5);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class31 var17 = new class31(var16, 8);
                    var17.field901 = 3;
                    int var18 = var17.method310() + 6;
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
                            this.method59("Loading " + arg1 + " - " + var23 + "%", arg4, (byte) 3);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field348[0] != null) {
                            this.field348[0].method357(var7, arg3, var7.length, 0);
                        }
                    } catch (Exception var29) {
                        this.field348[0] = null;
                    }
                    if (var7 != null) {
                        this.field545.reset();
                        this.field545.update(var7);
                        int var24 = (int) this.field545.getValue();
                        if (arg5 != var24) {
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
                            this.method59("Game updated - please reload page", arg4, (byte) 3);
                            var26 = 10;
                        } else {
                            this.method59(var12 + " - Retrying in " + var26, arg4, (byte) 3);
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
                    this.field463 = !this.field463;
                }
            }
            class26 var27 = new class26(var7, (byte) 6);
            this.field295 &= arg2;
            return var27;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)Z")
    public final boolean method115(boolean arg0, int arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (arg1 < 0) {
            return false;
        } else {
            int var4 = this.field474[arg1];
            if (var4 >= 2000) {
                var4 -= 2000;
            }
            return var4 == 217;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method116(int arg0, boolean arg1) {
        if (!arg1) {
            this.method52();
        }
        int var3 = class17.field654[arg0].field662;
        if (var3 != 0) {
            int var4 = this.field478[arg0];
            if (var3 == 1) {
                if (var4 == 1) {
                    class5.method34(0.9D, 932);
                }
                if (var4 == 2) {
                    class5.method34(0.8D, 932);
                }
                if (var4 == 3) {
                    class5.method34(0.7D, 932);
                }
                if (var4 == 4) {
                    class5.method34(0.6D, 932);
                }
                class41.field1021.method388();
                this.field505 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field402;
                if (var4 == 0) {
                    this.method177(false, this.field402, 0);
                    this.field402 = true;
                }
                if (var4 == 1) {
                    this.method177(false, this.field402, -400);
                    this.field402 = true;
                }
                if (var4 == 2) {
                    this.method177(false, this.field402, -800);
                    this.field402 = true;
                }
                if (var4 == 3) {
                    this.method177(false, this.field402, -1200);
                    this.field402 = true;
                }
                if (var4 == 4) {
                    this.field402 = false;
                }
                if (this.field402 != var5 && !field426) {
                    if (this.field402) {
                        this.field285 = this.field178;
                        this.field286 = true;
                        this.field234.method567(2, this.field285);
                    } else {
                        this.method89((byte) 2);
                    }
                    this.field120 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field513 = true;
                    this.method151(0, 0);
                }
                if (var4 == 1) {
                    this.field513 = true;
                    this.method151(-400, 0);
                }
                if (var4 == 2) {
                    this.field513 = true;
                    this.method151(-800, 0);
                }
                if (var4 == 3) {
                    this.field513 = true;
                    this.method151(-1200, 0);
                }
                if (var4 == 4) {
                    this.field513 = false;
                }
            }
            if (var3 == 5) {
                this.field566 = var4;
            }
            if (var3 == 6) {
                this.field447 = var4;
            }
            if (var3 == 8) {
                this.field173 = var4;
                this.field586 = true;
            }
            if (var3 == 9) {
                this.field490 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIZII)V")
    private final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg5) {
            this.field323 = this.field284.method589();
        }
        if (arg7 >= 1 && arg4 >= 1 && arg7 <= 102 && arg4 <= 102) {
            if (field426 && this.field146 != arg2) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg6 == 0) {
                var9 = this.field521.method530(arg2, arg7, arg4);
            }
            if (arg6 == 1) {
                var9 = this.field521.method531(-45819, arg4, arg2, arg7);
            }
            if (arg6 == 2) {
                var9 = this.field521.method532(arg2, arg7, arg4);
            }
            if (arg6 == 3) {
                var9 = this.field521.method533(arg2, arg7, arg4);
            }
            if (var9 != 0) {
                int var13 = this.field521.method534(arg2, arg7, arg4, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg6 == 0) {
                    this.field521.method521(-225, arg2, arg7, arg4);
                    class61 var17 = class61.method491(var14);
                    if (var17.field1434) {
                        this.field497[arg2].method349(arg4, var15, var16, var17.field1386, 210, arg7);
                    }
                }
                if (arg6 == 1) {
                    this.field521.method522(arg7, arg2, arg4, -20499);
                }
                if (arg6 == 2) {
                    this.field521.method523(arg2, arg7, this.field160, arg4);
                    class61 var18 = class61.method491(var14);
                    if (var18.field1418 + arg7 > 103 || var18.field1418 + arg4 > 103 || var18.field1394 + arg7 > 103 || var18.field1394 + arg4 > 103) {
                        return;
                    }
                    if (var18.field1434) {
                        this.field497[arg2].method350(var18.field1418, arg4, arg7, var16, var18.field1386, this.field527, var18.field1394);
                    }
                }
                if (arg6 == 3) {
                    this.field521.method524(false, arg7, arg2, arg4);
                    class61 var19 = class61.method491(var14);
                    if (var19.field1434 && var19.field1412) {
                        this.field497[arg2].method352(arg7, (byte) 58, arg4);
                    }
                }
            }
            if (arg1 >= 0) {
                int var20 = arg2;
                if (arg2 < 3 && (this.field204[1][arg7][arg4] & 2) == 2) {
                    var20 = arg2 + 1;
                }
                class3.method19(arg7, 43310, arg2, this.field389, this.field497[arg2], arg1, arg0, arg3, arg4, this.field521, var20);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)Z")
    public final boolean method118(byte arg0) {
        if (arg0 == 8) {
            boolean var2 = false;
            if (this.field322 == null) {
                return false;
            } else {
                try {
                    int var3 = this.field322.method435();
                    if (var3 == 0) {
                        return false;
                    }
                    if (this.field236 == -1) {
                        this.field322.method436(this.field254.field900, 0, 1);
                        this.field236 = this.field254.field900[0] & 255;
                        if (this.field284 != null) {
                            this.field236 = this.field236 - this.field284.method589() & 255;
                        }
                        this.field235 = class35.field950[this.field236];
                        --var3;
                    }
                    if (this.field235 == -1) {
                        if (var3 <= 0) {
                            return false;
                        }
                        this.field322.method436(this.field254.field900, 0, 1);
                        this.field235 = this.field254.field900[0] & 255;
                        --var3;
                    }
                    if (this.field235 == -2) {
                        if (var3 <= 1) {
                            return false;
                        }
                        this.field322.method436(this.field254.field900, 0, 2);
                        this.field254.field901 = 0;
                        this.field235 = this.field254.method308();
                        var3 -= 2;
                    }
                    if (var3 < this.field235) {
                        return false;
                    }
                    this.field254.field901 = 0;
                    this.field322.method436(this.field254.field900, 0, this.field235);
                    this.field237 = 0;
                    this.field433 = this.field432;
                    this.field432 = this.field431;
                    this.field431 = this.field236;
                    if (this.field236 == 233) {
                        this.field274 = true;
                        this.field376 = this.field254.method306();
                        this.field377 = this.field254.method306();
                        this.field378 = this.field254.method308();
                        this.field379 = this.field254.method306();
                        this.field380 = this.field254.method306();
                        if (this.field380 >= 100) {
                            int var4 = this.field376 * 128 + 64;
                            int var5 = this.field377 * 128 + 64;
                            int var6 = this.method173(var5, var4, this.field146, 1) - this.field378;
                            int var7 = var4 - this.field555;
                            int var8 = var6 - this.field556;
                            int var9 = var5 - this.field557;
                            int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
                            this.field558 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 2047;
                            this.field559 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 2047;
                            if (this.field558 < 128) {
                                this.field558 = 128;
                            }
                            if (this.field558 > 383) {
                                this.field558 = 383;
                            }
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 122) {
                        this.field388 = this.field254.method335(true);
                        this.field465 = this.field254.method308();
                        this.field326 = this.field254.method342(false);
                        this.field430 = this.field254.method325(-35277);
                        this.field222 = this.field254.method327(8);
                        if (this.field326 != 0 && this.field245 == -1) {
                            signlink.dnslookup(class70.method579(this.field326, (byte) 0));
                            this.method145((byte) 7);
                            short var11 = 650;
                            if (this.field430 != 201 || this.field222 == 1) {
                                var11 = 655;
                            }
                            this.field318 = "";
                            this.field317 = false;
                            for (int var12 = 0; var12 < class63.field1490.length; ++var12) {
                                if (class63.field1490[var12] != null && class63.field1490[var12].field1529 == var11) {
                                    this.field245 = class63.field1490[var12].field1514;
                                    break;
                                }
                            }
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 136) {
                        this.field413 = this.field235 / 8;
                        for (int var13 = 0; var13 < this.field413; ++var13) {
                            this.field420[var13] = this.field254.method312(217);
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 165) {
                        int var14 = this.field254.method340(false);
                        int var15 = this.field254.method308();
                        this.field334[var15] = var14;
                        if (this.field478[var15] != var14) {
                            this.field478[var15] = var14;
                            this.method116(var15, true);
                            this.field494 = true;
                            if (this.field400 != -1) {
                                this.field586 = true;
                            }
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 91) {
                        for (int var16 = 0; var16 < this.field478.length; ++var16) {
                            if (this.field478[var16] != this.field334[var16]) {
                                this.field478[var16] = this.field334[var16];
                                this.method116(var16, true);
                                this.field494 = true;
                            }
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 20) {
                        if (this.field405 == 12) {
                            this.field494 = true;
                        }
                        this.field429 = this.field254.method306();
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 63) {
                        this.field229 = this.field254.method326((byte) -15);
                        if (this.field405 == this.field229) {
                            if (this.field229 == 3) {
                                this.field405 = 1;
                            } else {
                                this.field405 = 3;
                            }
                            this.field494 = true;
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 227) {
                        int var17 = this.field254.method336((byte) 87);
                        int var18 = this.field254.method325(-35277);
                        if (var17 == 65535) {
                            var17 = -1;
                        }
                        this.field392[var18] = var17;
                        this.field494 = true;
                        this.field292 = true;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 192) {
                        int var19 = this.field254.method306();
                        int var20 = this.field254.method306();
                        int var21 = this.field254.method306();
                        int var22 = this.field254.method306();
                        this.field562[var19] = true;
                        this.field436[var19] = var20;
                        this.field151[var19] = var21;
                        this.field491[var19] = var22;
                        this.field288[var19] = 0;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 18) {
                        int var23 = this.field254.method334((byte) -45);
                        int var24 = this.field254.method335(true);
                        class63 var25 = class63.field1490[var23];
                        if (var25 != null && var25.field1525 == 0) {
                            if (var24 < 0) {
                                var24 = 0;
                            }
                            if (var24 > var25.field1512 - var25.field1524) {
                                var24 = var25.field1512 - var25.field1524;
                            }
                            var25.field1546 = var24;
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 25) {
                        int var26 = this.field254.method308();
                        int var27 = this.field254.method334((byte) -45);
                        int var28 = this.field254.method308();
                        int var29 = this.field254.method334((byte) -45);
                        class63.field1490[var28].field1531 = var29;
                        class63.field1490[var28].field1532 = var27;
                        class63.field1490[var28].field1530 = var26;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 217) {
                        this.field126 = this.field254.method306();
                        this.field280 = this.field254.method306();
                        this.field542 = this.field254.method306();
                        this.field192 = true;
                        this.field586 = true;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 232) {
                        this.field296 = false;
                        this.field568 = 1;
                        this.field539 = "";
                        this.field586 = true;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 250) {
                        this.method168(this.field254, 0, this.field235);
                        this.field202 = false;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 245) {
                        int var30 = this.field254.method337(0);
                        this.field400 = var30;
                        this.field586 = true;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 178) {
                        int var31 = this.field254.method308();
                        int var32 = this.field254.method335(true);
                        class63.field1490[var31].field1487 = 1;
                        class63.field1490[var31].field1488 = var32;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 133) {
                        int var33 = this.field254.method308();
                        if (var33 == 65535) {
                            var33 = -1;
                        }
                        if (this.field178 != var33 && this.field402 && !field426 && this.field120 == 0) {
                            this.field285 = var33;
                            this.field286 = true;
                            this.field234.method567(2, this.field285);
                        }
                        this.field178 = var33;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 24) {
                        int var34 = this.field254.method339(48759);
                        int var35 = this.field254.method334((byte) -45);
                        if (this.field402 && !field426) {
                            this.field285 = var35;
                            this.field286 = false;
                            this.field234.method567(2, this.field285);
                            this.field120 = var34;
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 163) {
                        int var36 = this.field254.method308();
                        int var37 = this.field254.method306();
                        int var38 = this.field254.method308();
                        if (this.field513 && !field426 && this.field307 < 50) {
                            this.field127[this.field307] = var36;
                            this.field193[this.field307] = var37;
                            this.field417[this.field307] = class50.field1111[var36] + var38;
                            ++this.field307;
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 252) {
                        this.field582 = this.field254.method336((byte) 87) * 30;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 11) {
                        this.field344 = this.field254.method306();
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 42) {
                        long var39 = this.field254.method312(217);
                        int var41 = this.field254.method311();
                        int var42 = this.field254.method306();
                        boolean var43 = false;
                        for (int var44 = 0; var44 < 100; ++var44) {
                            if (this.field129[var44] == var41) {
                                var43 = true;
                                break;
                            }
                        }
                        if (var42 <= 1) {
                            for (int var45 = 0; var45 < this.field413; ++var45) {
                                if (this.field420[var45] == var39) {
                                    var43 = true;
                                    break;
                                }
                            }
                        }
                        if (!var43 && this.field355 == 0) {
                            try {
                                this.field129[this.field225] = var41;
                                this.field225 = (this.field225 + 1) % 100;
                                String var46 = class30.method291(this.field235 - 13, true, this.field254);
                                if (var42 != 3) {
                                    var46 = class22.method257(861, var46);
                                }
                                if (var42 != 2 && var42 != 3) {
                                    if (var42 == 1) {
                                        this.method111(7, var46, "@cr1@" + class70.method580((byte) 86, class70.method577(var39, -642)), (byte) 4);
                                    } else {
                                        this.method111(3, var46, class70.method580((byte) 86, class70.method577(var39, -642)), (byte) 4);
                                    }
                                } else {
                                    this.method111(7, var46, "@cr2@" + class70.method580((byte) 86, class70.method577(var39, -642)), (byte) 4);
                                }
                            } catch (Exception var188) {
                                signlink.reporterror("cde1");
                            }
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 243) {
                        for (int var48 = 0; var48 < this.field248.length; ++var48) {
                            if (this.field248[var48] != null) {
                                this.field248[var48].field1231 = -1;
                            }
                        }
                        for (int var49 = 0; var49 < this.field440.length; ++var49) {
                            if (this.field440[var49] != null) {
                                this.field440[var49].field1231 = -1;
                            }
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 214) {
                        this.method181(0, this.field254, this.field235);
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 100) {
                        int var50 = this.field254.method308();
                        boolean var51 = this.field254.method306() == 1;
                        class63.field1490[var50].field1493 = var51;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 191) {
                        int var52 = this.field254.method308();
                        int var53 = this.field254.method336((byte) 87);
                        int var54 = this.field254.method308();
                        if (var52 == 65535) {
                            class63.field1490[var53].field1487 = 0;
                            this.field236 = -1;
                            return true;
                        }
                        class41 var55 = class41.method374(var52);
                        class63.field1490[var53].field1487 = 4;
                        class63.field1490[var53].field1488 = var52;
                        class63.field1490[var53].field1531 = var55.field1056;
                        class63.field1490[var53].field1532 = var55.field1030;
                        class63.field1490[var53].field1530 = var55.field1012 * 100 / var54;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 221) {
                        int var56 = this.field254.method308();
                        class63 var57 = class63.field1490[var56];
                        for (int var58 = 0; var58 < var57.field1540.length; ++var58) {
                            var57.field1540[var58] = -1;
                            var57.field1540[var58] = 0;
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 6) {
                        int var59 = this.field254.method334((byte) -45);
                        this.method112(false, var59);
                        if (this.field297 != -1) {
                            this.field297 = -1;
                            this.field586 = true;
                        }
                        if (this.field568 != 0) {
                            this.field568 = 0;
                            this.field586 = true;
                        }
                        this.field270 = var59;
                        this.field494 = true;
                        this.field292 = true;
                        this.field245 = -1;
                        this.field159 = false;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 224) {
                        this.field466 = this.field254.method327(8);
                        this.field467 = this.field254.method326((byte) -15);
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 196) {
                        if (this.field270 != -1) {
                            this.field270 = -1;
                            this.field494 = true;
                            this.field292 = true;
                        }
                        if (this.field297 != -1) {
                            this.field297 = -1;
                            this.field586 = true;
                        }
                        if (this.field568 != 0) {
                            this.field568 = 0;
                            this.field586 = true;
                        }
                        this.field245 = -1;
                        this.field159 = false;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 53) {
                        int var60 = this.field254.method335(true);
                        this.method112(false, var60);
                        if (this.field270 != -1) {
                            this.field270 = -1;
                            this.field494 = true;
                            this.field292 = true;
                        }
                        if (this.field297 != -1) {
                            this.field297 = -1;
                            this.field586 = true;
                        }
                        if (this.field568 != 0) {
                            this.field568 = 0;
                            this.field586 = true;
                        }
                        this.field245 = var60;
                        this.field159 = false;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 198) {
                        int var61 = this.field254.method335(true);
                        int var62 = this.field254.method336((byte) 87);
                        int var63 = var61 >> 10 & 31;
                        int var64 = var61 >> 5 & 31;
                        int var65 = var61 & 31;
                        class63.field1490[var62].field1554 = (var65 << 3) + (var63 << 19) + (var64 << 11);
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 104) {
                        byte var66 = this.field254.method328(3);
                        int var67 = this.field254.method335(true);
                        this.field334[var67] = var66;
                        if (this.field478[var67] != var66) {
                            this.field478[var67] = var66;
                            this.method116(var67, true);
                            this.field494 = true;
                            if (this.field400 != -1) {
                                this.field586 = true;
                            }
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 228) {
                        int var68 = this.field254.method308();
                        this.method112(false, var68);
                        if (this.field270 != -1) {
                            this.field270 = -1;
                            this.field494 = true;
                            this.field292 = true;
                        }
                        this.field297 = var68;
                        this.field586 = true;
                        this.field245 = -1;
                        this.field159 = false;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 12) {
                        int var69 = this.field254.method335(true);
                        String var70 = this.field254.method313();
                        class63.field1490[var69].field1545 = var70;
                        if (this.field392[this.field405] == class63.field1490[var69].field1514) {
                            this.field494 = true;
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 151) {
                        this.field494 = true;
                        int var71 = this.field254.method325(-35277);
                        int var72 = this.field254.method340(false);
                        int var73 = this.field254.method327(8);
                        this.field283[var73] = var72;
                        this.field391[var73] = var71;
                        this.field485[var73] = 1;
                        for (int var74 = 0; var74 < 98; ++var74) {
                            if (var72 >= field341[var74]) {
                                this.field485[var73] = var74 + 2;
                            }
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 213) {
                        this.field310 = this.field254.method306();
                        this.field494 = true;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 118) {
                        int var75 = this.field254.method334((byte) -45);
                        class63.field1490[var75].field1487 = 3;
                        if (field454.field705 == null) {
                            class63.field1490[var75].field1488 = (field454.field703[11] << 5) + (field454.field703[8] << 10) + (field454.field703[0] << 15) + (field454.field728[0] << 25) + (field454.field728[4] << 20) + field454.field703[1];
                        } else {
                            class63.field1490[var75].field1488 = (int) (field454.field705.field1259 + 305419896L);
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 123) {
                        this.field401 = this.field254.method334((byte) -45);
                        this.field244 = this.field254.method326((byte) -15);
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 41) {
                        this.field324 = this.field254.method306();
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 116) {
                        this.field405 = this.field254.method327(8);
                        this.field494 = true;
                        this.field292 = true;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 3) {
                        int var76 = this.field254.method337(0);
                        if (var76 >= 0) {
                            this.method112(false, var76);
                        }
                        this.field311 = var76;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 242) {
                        this.field274 = false;
                        for (int var77 = 0; var77 < 5; ++var77) {
                            this.field562[var77] = false;
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 23) {
                        this.field494 = true;
                        int var78 = this.field254.method308();
                        class63 var79 = class63.field1490[var78];
                        while (this.field254.field901 < this.field235) {
                            int var80 = this.field254.method320();
                            int var81 = this.field254.method308();
                            int var82 = this.field254.method306();
                            if (var82 == 255) {
                                var82 = this.field254.method311();
                            }
                            if (var80 >= 0 && var80 < var79.field1540.length) {
                                var79.field1540[var80] = var81;
                                var79.field1517[var80] = var82;
                            }
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 92) {
                        this.field274 = true;
                        this.field329 = this.field254.method306();
                        this.field330 = this.field254.method306();
                        this.field331 = this.field254.method308();
                        this.field332 = this.field254.method306();
                        this.field333 = this.field254.method306();
                        if (this.field333 >= 100) {
                            this.field555 = this.field329 * 128 + 64;
                            this.field557 = this.field330 * 128 + 64;
                            this.field556 = this.method173(this.field557, this.field555, this.field146, 1) - this.field331;
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 102) {
                        String var83 = this.field254.method313();
                        if (var83.endsWith(":tradereq:")) {
                            String var84 = var83.substring(0, var83.indexOf(":"));
                            long var85 = class70.method576(var84);
                            boolean var87 = false;
                            for (int var88 = 0; var88 < this.field413; ++var88) {
                                if (this.field420[var88] == var85) {
                                    var87 = true;
                                    break;
                                }
                            }
                            if (!var87 && this.field355 == 0) {
                                this.method111(4, "wishes to trade with you.", var84, (byte) 4);
                            }
                        } else if (var83.endsWith(":duelreq:")) {
                            String var89 = var83.substring(0, var83.indexOf(":"));
                            long var90 = class70.method576(var89);
                            boolean var92 = false;
                            for (int var93 = 0; var93 < this.field413; ++var93) {
                                if (this.field420[var93] == var90) {
                                    var92 = true;
                                    break;
                                }
                            }
                            if (!var92 && this.field355 == 0) {
                                this.method111(8, "wishes to duel with you.", var89, (byte) 4);
                            }
                        } else if (!var83.endsWith(":chalreq:")) {
                            this.method111(0, var83, "", (byte) 4);
                        } else {
                            String var94 = var83.substring(0, var83.indexOf(":"));
                            long var95 = class70.method576(var94);
                            boolean var97 = false;
                            for (int var98 = 0; var98 < this.field413; ++var98) {
                                if (this.field420[var98] == var95) {
                                    var97 = true;
                                    break;
                                }
                            }
                            if (!var97 && this.field355 == 0) {
                                String var99 = var83.substring(var83.indexOf(":") + 1, var83.length() - 9);
                                this.method111(8, var99, var94, (byte) 4);
                            }
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 0) {
                        this.field466 = this.field254.method325(-35277);
                        this.field467 = this.field254.method326((byte) -15);
                        for (int var100 = this.field466; var100 < this.field466 + 8; ++var100) {
                            for (int var101 = this.field467; var101 < this.field467 + 8; ++var101) {
                                if (this.field496[this.field146][var100][var101] != null) {
                                    this.field496[this.field146][var100][var101] = null;
                                    this.method148(var100, var101);
                                }
                            }
                        }
                        for (class11 var102 = (class11) this.field583.method393(); var102 != null; var102 = (class11) this.field583.method395(true)) {
                            if (var102.field603 >= this.field466 && var102.field603 < this.field466 + 8 && var102.field604 >= this.field467 && var102.field604 < this.field467 + 8 && this.field146 == var102.field601) {
                                var102.field611 = 0;
                            }
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 94) {
                        this.field466 = this.field254.method306();
                        this.field467 = this.field254.method327(8);
                        while (this.field254.field901 < this.field235) {
                            int var103 = this.field254.method306();
                            this.method154(this.field254, 0, var103);
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 159 || this.field236 == 32 || this.field236 == 65 || this.field236 == 78 || this.field236 == 183 || this.field236 == 223 || this.field236 == 4 || this.field236 == 19 || this.field236 == 189 || this.field236 == 101 || this.field236 == 27) {
                        this.method154(this.field254, 0, this.field236);
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 157) {
                        this.field501 = 0;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 38 || this.field236 == 154) {
                        int var104 = this.field342;
                        int var105 = this.field343;
                        if (this.field236 == 38) {
                            var104 = this.field254.method335(true);
                            var105 = this.field254.method308();
                            this.field384 = false;
                        }
                        if (this.field236 == 154) {
                            var105 = this.field254.method308();
                            this.field254.method316(0);
                            int var106 = 0;
                            while (true) {
                                if (var106 >= 4) {
                                    this.field254.method318((byte) -66);
                                    var104 = this.field254.method334((byte) -45);
                                    this.field384 = true;
                                    break;
                                }
                                for (int var107 = 0; var107 < 13; ++var107) {
                                    for (int var108 = 0; var108 < 13; ++var108) {
                                        int var109 = this.field254.method317((byte) 9, 1);
                                        if (var109 == 1) {
                                            this.field190[var106][var107][var108] = this.field254.method317((byte) 9, 26);
                                        } else {
                                            this.field190[var106][var107][var108] = -1;
                                        }
                                    }
                                }
                                ++var106;
                            }
                        }
                        if (this.field342 == var104 && this.field343 == var105 && this.field275 == 2) {
                            this.field236 = -1;
                            return true;
                        }
                        this.field342 = var104;
                        this.field343 = var105;
                        this.field570 = (this.field342 - 6) * 8;
                        this.field571 = (this.field343 - 6) * 8;
                        this.field512 = false;
                        if ((this.field342 / 8 == 48 || this.field342 / 8 == 49) && this.field343 / 8 == 48) {
                            this.field512 = true;
                        }
                        if (this.field342 / 8 == 48 && this.field343 / 8 == 148) {
                            this.field512 = true;
                        }
                        this.field275 = 1;
                        this.field339 = System.currentTimeMillis();
                        this.field266.method196(true);
                        this.field357.method418(151, 257, "Loading - please wait.", 0, 5);
                        this.field357.method418(150, 256, "Loading - please wait.", 16777215, 5);
                        this.field266.method197(super.field95, 4, true, 4);
                        if (this.field236 == 38) {
                            int var110 = 0;
                            int var111 = (this.field342 - 6) / 8;
                            label1112: while (true) {
                                if (var111 > (this.field342 + 6) / 8) {
                                    this.field443 = new byte[var110][];
                                    this.field171 = new byte[var110][];
                                    this.field152 = new int[var110];
                                    this.field153 = new int[var110];
                                    this.field154 = new int[var110];
                                    int var113 = 0;
                                    int var114 = (this.field342 - 6) / 8;
                                    while (true) {
                                        if (var114 > (this.field342 + 6) / 8) {
                                            break label1112;
                                        }
                                        for (int var115 = (this.field343 - 6) / 8; var115 <= (this.field343 + 6) / 8; ++var115) {
                                            this.field152[var113] = (var114 << 8) + var115;
                                            if (!this.field512 || var115 != 49 && var115 != 149 && var115 != 147 && var114 != 50 && (var114 != 49 || var115 != 47)) {
                                                int var116 = this.field153[var113] = this.field234.method563(0, var114, var115, true);
                                                if (var116 != -1) {
                                                    this.field234.method567(3, var116);
                                                }
                                                int var117 = this.field154[var113] = this.field234.method563(1, var114, var115, true);
                                                if (var117 != -1) {
                                                    this.field234.method567(3, var117);
                                                }
                                                ++var113;
                                            } else {
                                                this.field153[var113] = -1;
                                                this.field154[var113] = -1;
                                                ++var113;
                                            }
                                        }
                                        ++var114;
                                    }
                                }
                                for (int var112 = (this.field343 - 6) / 8; var112 <= (this.field343 + 6) / 8; ++var112) {
                                    ++var110;
                                }
                                ++var111;
                            }
                        }
                        if (this.field236 == 154) {
                            int var118 = 0;
                            int[] var119 = new int[676];
                            int var120 = 0;
                            label1071: while (true) {
                                if (var120 >= 4) {
                                    this.field443 = new byte[var118][];
                                    this.field171 = new byte[var118][];
                                    this.field152 = new int[var118];
                                    this.field153 = new int[var118];
                                    this.field154 = new int[var118];
                                    int var128 = 0;
                                    while (true) {
                                        if (var128 >= var118) {
                                            break label1071;
                                        }
                                        int var129 = this.field152[var128] = var119[var128];
                                        int var130 = var129 >> 8 & 255;
                                        int var131 = var129 & 255;
                                        int var132 = this.field153[var128] = this.field234.method563(0, var130, var131, true);
                                        if (var132 != -1) {
                                            this.field234.method567(3, var132);
                                        }
                                        int var133 = this.field154[var128] = this.field234.method563(1, var130, var131, true);
                                        if (var133 != -1) {
                                            this.field234.method567(3, var133);
                                        }
                                        ++var128;
                                    }
                                }
                                for (int var121 = 0; var121 < 13; ++var121) {
                                    for (int var122 = 0; var122 < 13; ++var122) {
                                        int var123 = this.field190[var120][var121][var122];
                                        if (var123 != -1) {
                                            int var124 = var123 >> 14 & 1023;
                                            int var125 = var123 >> 3 & 2047;
                                            int var126 = (var124 / 8 << 8) + var125 / 8;
                                            for (int var127 = 0; var127 < var118; ++var127) {
                                                if (var119[var127] == var126) {
                                                    var126 = -1;
                                                    break;
                                                }
                                            }
                                            if (var126 != -1) {
                                                var119[var118++] = var126;
                                            }
                                        }
                                    }
                                }
                                ++var120;
                            }
                        }
                        int var134 = this.field570 - this.field572;
                        int var135 = this.field571 - this.field573;
                        this.field572 = this.field570;
                        this.field573 = this.field571;
                        for (int var136 = 0; var136 < 16384; ++var136) {
                            class44 var137 = this.field440[var136];
                            if (var137 != null) {
                                for (int var138 = 0; var138 < 10; ++var138) {
                                    var137.field1200[var138] -= var134;
                                    var137.field1201[var138] -= var135;
                                }
                                var137.field1214 -= var134 * 128;
                                var137.field1215 -= var135 * 128;
                            }
                        }
                        for (int var139 = 0; var139 < this.field246; ++var139) {
                            class21 var140 = this.field248[var139];
                            if (var140 != null) {
                                for (int var141 = 0; var141 < 10; ++var141) {
                                    var140.field1200[var141] -= var134;
                                    var140.field1201[var141] -= var135;
                                }
                                var140.field1214 -= var134 * 128;
                                var140.field1215 -= var135 * 128;
                            }
                        }
                        this.field202 = true;
                        byte var142 = 0;
                        byte var143 = 104;
                        byte var144 = 1;
                        if (var134 < 0) {
                            var142 = 103;
                            var143 = -1;
                            var144 = -1;
                        }
                        byte var145 = 0;
                        byte var146 = 104;
                        byte var147 = 1;
                        if (var135 < 0) {
                            var145 = 103;
                            var146 = -1;
                            var147 = -1;
                        }
                        for (int var148 = var142; var143 != var148; var148 += var144) {
                            for (int var149 = var145; var146 != var149; var149 += var147) {
                                int var150 = var134 + var148;
                                int var151 = var135 + var149;
                                for (int var152 = 0; var152 < 4; ++var152) {
                                    if (var150 >= 0 && var151 >= 0 && var150 < 104 && var151 < 104) {
                                        this.field496[var152][var148][var149] = this.field496[var152][var150][var151];
                                    } else {
                                        this.field496[var152][var148][var149] = null;
                                    }
                                }
                            }
                        }
                        for (class11 var153 = (class11) this.field583.method393(); var153 != null; var153 = (class11) this.field583.method395(true)) {
                            var153.field603 -= var134;
                            var153.field604 -= var135;
                            if (var153.field603 < 0 || var153.field604 < 0 || var153.field603 >= 104 || var153.field604 >= 104) {
                                var153.method290();
                            }
                        }
                        if (this.field501 != 0) {
                            this.field501 -= var134;
                            this.field502 -= var135;
                        }
                        this.field274 = false;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 182) {
                        this.field494 = true;
                        int var154 = this.field254.method308();
                        class63 var155 = class63.field1490[var154];
                        int var156 = this.field254.method308();
                        for (int var157 = 0; var157 < var156; ++var157) {
                            int var158 = this.field254.method327(8);
                            if (var158 == 255) {
                                var158 = this.field254.method342(false);
                            }
                            var155.field1540[var157] = this.field254.method335(true);
                            var155.field1517[var157] = var158;
                        }
                        for (int var159 = var156; var159 < var155.field1540.length; ++var159) {
                            var155.field1540[var159] = 0;
                            var155.field1517[var159] = 0;
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 90) {
                        this.method179(8);
                        this.field236 = -1;
                        return false;
                    }
                    if (this.field236 == 229) {
                        this.field296 = false;
                        this.field568 = 2;
                        this.field539 = "";
                        this.field586 = true;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 51) {
                        this.field141 = this.field254.method306();
                        if (this.field141 == 1) {
                            this.field386 = this.field254.method308();
                        }
                        if (this.field141 >= 2 && this.field141 <= 6) {
                            if (this.field141 == 2) {
                                this.field577 = 64;
                                this.field578 = 64;
                            }
                            if (this.field141 == 3) {
                                this.field577 = 0;
                                this.field578 = 64;
                            }
                            if (this.field141 == 4) {
                                this.field577 = 128;
                                this.field578 = 64;
                            }
                            if (this.field141 == 5) {
                                this.field577 = 64;
                                this.field578 = 0;
                            }
                            if (this.field141 == 6) {
                                this.field577 = 64;
                                this.field578 = 128;
                            }
                            this.field141 = 2;
                            this.field574 = this.field254.method308();
                            this.field575 = this.field254.method308();
                            this.field576 = this.field254.method306();
                        }
                        if (this.field141 == 10) {
                            this.field452 = this.field254.method308();
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 75) {
                        long var160 = this.field254.method312(217);
                        int var162 = this.field254.method306();
                        String var163 = class70.method580((byte) 86, class70.method577(var160, -642));
                        for (int var164 = 0; var164 < this.field309; ++var164) {
                            if (this.field509[var164] == var160) {
                                if (this.field507[var164] != var162) {
                                    this.field507[var164] = var162;
                                    this.field494 = true;
                                    if (var162 > 0) {
                                        this.method111(5, var163 + " has logged in.", "", (byte) 4);
                                    }
                                    if (var162 == 0) {
                                        this.method111(5, var163 + " has logged out.", "", (byte) 4);
                                    }
                                }
                                var163 = null;
                                break;
                            }
                        }
                        if (var163 != null && this.field309 < 200) {
                            this.field509[this.field309] = var160;
                            this.field340[this.field309] = var163;
                            this.field507[this.field309] = var162;
                            ++this.field309;
                            this.field494 = true;
                        }
                        boolean var165 = false;
                        while (!var165) {
                            var165 = true;
                            for (int var166 = 0; var166 < this.field309 - 1; ++var166) {
                                if (this.field507[var166] != field423 && this.field507[var166 + 1] == field423 || this.field507[var166] == 0 && this.field507[var166 + 1] != 0) {
                                    int var167 = this.field507[var166];
                                    this.field507[var166] = this.field507[var166 + 1];
                                    this.field507[var166 + 1] = var167;
                                    String var168 = this.field340[var166];
                                    this.field340[var166] = this.field340[var166 + 1];
                                    this.field340[var166 + 1] = var168;
                                    long var169 = this.field509[var166];
                                    this.field509[var166] = this.field509[var166 + 1];
                                    this.field509[var166 + 1] = var169;
                                    this.field494 = true;
                                    var165 = false;
                                }
                            }
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 255) {
                        int var171 = this.field254.method306();
                        String var172 = this.field254.method313();
                        int var173 = this.field254.method306();
                        if (var173 >= 1 && var173 <= 5) {
                            if (var172.equalsIgnoreCase("null")) {
                                var172 = null;
                            }
                            this.field580[var173 - 1] = var172;
                            this.field581[var173 - 1] = var171 == 0;
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 211) {
                        if (this.field405 == 12) {
                            this.field494 = true;
                        }
                        this.field227 = this.field254.method309();
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 111) {
                        int var174 = this.field254.method338(this.field313);
                        int var175 = this.field254.method334((byte) -45);
                        class63 var176 = class63.field1490[var175];
                        var176.field1507 = var174;
                        if (var174 == -1) {
                            var176.field1510 = 0;
                            var176.field1526 = 0;
                        }
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 10) {
                        int var177 = this.field254.method335(true);
                        int var178 = this.field254.method334((byte) -45);
                        if (this.field297 != -1) {
                            this.field297 = -1;
                            this.field586 = true;
                        }
                        if (this.field568 != 0) {
                            this.field568 = 0;
                            this.field586 = true;
                        }
                        this.field245 = var177;
                        this.field270 = var178;
                        this.field494 = true;
                        this.field292 = true;
                        this.field159 = false;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 206) {
                        int var179 = this.field254.method309();
                        int var180 = this.field254.method338(this.field313);
                        int var181 = this.field254.method308();
                        class63 var182 = class63.field1490[var181];
                        var182.field1513 = var179;
                        var182.field1534 = var180;
                        this.field236 = -1;
                        return true;
                    }
                    if (this.field236 == 68) {
                        int var183 = this.field254.method308();
                        int var184 = this.field254.method308();
                        class63.field1490[var183].field1487 = 2;
                        class63.field1490[var183].field1488 = var184;
                        this.field236 = -1;
                        return true;
                    }
                    signlink.reporterror("T1 - " + this.field236 + "," + this.field235 + " - " + this.field432 + "," + this.field433);
                    this.method179(8);
                } catch (IOException var189) {
                    this.method140(-984);
                } catch (Exception var190) {
                    String var186 = "T2 - " + this.field236 + "," + this.field432 + "," + this.field433 + " - " + this.field235 + "," + (field454.field1200[0] + this.field570) + "," + (field454.field1201[0] + this.field571) + " - ";
                    for (int var187 = 0; var187 < this.field235 && var187 < 50; ++var187) {
                        var186 = var186 + this.field254.field900[var187] + ",";
                    }
                    signlink.reporterror(var186);
                    this.method179(8);
                }
                return true;
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg6 & 2047;
        int var9 = 2048 - arg3 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg1;
        if (var8 != 0) {
            int var13 = class59.field1367[var8];
            int var14 = class59.field1368[var8];
            int var15 = var11 * var14 - arg1 * var13 >> 16;
            var12 = var11 * var13 + arg1 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class59.field1367[var9];
            int var17 = class59.field1368[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field555 = arg2 - var10;
        this.field556 = arg0 - var11;
        this.field557 = arg4 - var12;
        this.field558 = arg6;
        this.field559 = arg3;
        if (arg5 != 0) {
            for (int var19 = 1; var19 > 0; ++var19) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)Ljava/lang/String;")
    public final String method120(byte arg0) {
        if (arg0 == 5) {
            boolean var2 = false;
            if (signlink.mainapp != null) {
                return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
            } else {
                return super.field98 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLTNOPEJNZ;)Z")
    public final boolean method121(byte arg0, class63 arg1) {
        if (arg0 != -2) {
            this.field565 = !this.field565;
        }
        int var3 = arg1.field1529;
        if (this.field310 == 2) {
            if (var3 == 201) {
                this.field586 = true;
                this.field568 = 0;
                this.field296 = true;
                this.field506 = "";
                this.field444 = 1;
                this.field560 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field586 = true;
                this.field568 = 0;
                this.field296 = true;
                this.field506 = "";
                this.field444 = 2;
                this.field560 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field239 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field586 = true;
                this.field568 = 0;
                this.field296 = true;
                this.field506 = "";
                this.field444 = 4;
                this.field560 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field586 = true;
                this.field568 = 0;
                this.field296 = true;
                this.field506 = "";
                this.field444 = 5;
                this.field560 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field124[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class13.field631 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class13.field631) {
                                var6 = 0;
                            }
                        }
                        if (!class13.field632[var6].field638 && class13.field632[var6].field633 == var4 + (this.field481 ? 0 : 7)) {
                            this.field124[var4] = var6;
                            this.field228 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field199[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field316[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field316[var7].length) {
                        var9 = 0;
                    }
                }
                this.field199[var7] = var9;
                this.field228 = true;
            }
            if (var3 == 324 && !this.field481) {
                this.field481 = true;
                this.method96((byte) 3);
            }
            if (var3 == 325 && this.field481) {
                this.field481 = false;
                this.method96((byte) 3);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field317 = !this.field317;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method145((byte) 7);
                    if (this.field318.length() > 0) {
                        this.field175.method295(19, 1);
                        this.field175.method302(class70.method576(this.field318), (byte) -65);
                        this.field175.method296(var3 - 601);
                        this.field175.method296(this.field317 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field175.method295(253, 1);
                this.field175.method296(this.field481 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field175.method296(this.field124[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field175.method296(this.field199[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method122(int arg0) {
        for (int var2 = -1; var2 < this.field249; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field247;
            } else {
                var3 = this.field250[var2];
            }
            class21 var4 = this.field248[var3];
            if (var4 != null) {
                this.method161(var4, 1, 40656);
            }
        }
        if (arg0 != 21057) {
            this.field272 = !this.field272;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLJHKSAGUC;)V")
    private final void method123(int arg0, boolean arg1, class31 arg2) {
        arg2.method316(0);
        int var4 = arg2.method317((byte) 9, 1);
        if (arg1) {
            this.field175.method296(51);
        }
        if (var4 != 0) {
            int var5 = arg2.method317((byte) 9, 2);
            if (var5 == 0) {
                this.field252[this.field251++] = this.field247;
            } else if (var5 == 1) {
                int var6 = arg2.method317((byte) 9, 3);
                field454.method439((byte) -49, var6, false);
                int var7 = arg2.method317((byte) 9, 1);
                if (var7 == 1) {
                    this.field252[this.field251++] = this.field247;
                }
            } else if (var5 == 2) {
                int var8 = arg2.method317((byte) 9, 3);
                field454.method439((byte) -49, var8, true);
                int var9 = arg2.method317((byte) 9, 3);
                field454.method439((byte) -49, var9, true);
                int var10 = arg2.method317((byte) 9, 1);
                if (var10 == 1) {
                    this.field252[this.field251++] = this.field247;
                }
            } else if (var5 == 3) {
                int var11 = arg2.method317((byte) 9, 1);
                if (var11 == 1) {
                    this.field252[this.field251++] = this.field247;
                }
                this.field146 = arg2.method317((byte) 9, 2);
                int var12 = arg2.method317((byte) 9, 1);
                int var13 = arg2.method317((byte) 9, 7);
                int var14 = arg2.method317((byte) 9, 7);
                field454.method440(var13, var12 == 1, var14, 9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method124(byte arg0) {
        if (this.field327 >= 2 || this.field533 != 0 || this.field255 != 0) {
            if (arg0 == 8) {
                boolean var2 = false;
            } else {
                this.field236 = this.field254.method306();
            }
            String var3;
            if (this.field533 == 1 && this.field327 < 2) {
                var3 = "Use " + this.field537 + " with...";
            } else if (this.field255 == 1 && this.field327 < 2) {
                var3 = this.field258 + "...";
            } else {
                var3 = this.field450[this.field327 - 1];
            }
            if (this.field327 > 2) {
                var3 = var3 + "@whi@ / " + (this.field327 - 2) + " more options";
            }
            this.field358.method427(true, var3, 15, (byte) -13, field271 / 1000, 16777215, 4);
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method125(int arg0) {
        if (this.field533 == 0 && this.field255 == 0) {
            this.field450[this.field327] = "Walk here";
            this.field474[this.field327] = 505;
            this.field472[this.field327] = super.field103;
            this.field473[this.field327] = super.field104;
            ++this.field327;
        }
        int var2 = -1;
        if (arg0 >= 6 && arg0 <= 6) {
            for (int var3 = 0; var3 < class59.field1365; ++var3) {
                int var4 = class59.field1366[var3];
                int var5 = var4 & 127;
                int var6 = var4 >> 7 & 127;
                int var7 = var4 >> 29 & 3;
                int var8 = var4 >> 14 & 32767;
                if (var2 != var4) {
                    var2 = var4;
                    if (var7 == 2 && this.field521.method534(this.field146, var5, var6, var4) >= 0) {
                        class61 var9 = class61.method491(var8);
                        if (var9.field1395 != null) {
                            var9 = var9.method490(false);
                        }
                        if (var9 == null) {
                            continue;
                        }
                        if (this.field533 == 1) {
                            this.field450[this.field327] = "Use " + this.field537 + " with @cya@" + var9.field1424;
                            this.field474[this.field327] = 701;
                            this.field475[this.field327] = var4;
                            this.field472[this.field327] = var5;
                            this.field473[this.field327] = var6;
                            ++this.field327;
                        } else if (this.field255 == 1) {
                            if ((this.field257 & 4) == 4) {
                                this.field450[this.field327] = this.field258 + " @cya@" + var9.field1424;
                                this.field474[this.field327] = 770;
                                this.field475[this.field327] = var4;
                                this.field472[this.field327] = var5;
                                this.field473[this.field327] = var6;
                                ++this.field327;
                            }
                        } else {
                            if (var9.field1409 != null) {
                                for (int var10 = 4; var10 >= 0; --var10) {
                                    if (var9.field1409[var10] != null) {
                                        this.field450[this.field327] = var9.field1409[var10] + " @cya@" + var9.field1424;
                                        if (var10 == 0) {
                                            this.field474[this.field327] = 707;
                                        }
                                        if (var10 == 1) {
                                            this.field474[this.field327] = 919;
                                        }
                                        if (var10 == 2) {
                                            this.field474[this.field327] = 745;
                                        }
                                        if (var10 == 3) {
                                            this.field474[this.field327] = 412;
                                        }
                                        if (var10 == 4) {
                                            this.field474[this.field327] = 1043;
                                        }
                                        this.field475[this.field327] = var4;
                                        this.field472[this.field327] = var5;
                                        this.field473[this.field327] = var6;
                                        ++this.field327;
                                    }
                                }
                            }
                            this.field450[this.field327] = "Examine @cya@" + var9.field1424;
                            this.field474[this.field327] = 1912;
                            this.field475[this.field327] = var9.field1399 << 14;
                            this.field472[this.field327] = var5;
                            this.field473[this.field327] = var6;
                            ++this.field327;
                        }
                    }
                    if (var7 == 1) {
                        class44 var11 = this.field440[var8];
                        if (var11.field1080.field1250 == 1 && (var11.field1214 & 127) == 64 && (var11.field1215 & 127) == 64) {
                            for (int var12 = 0; var12 < this.field441; ++var12) {
                                class44 var15 = this.field440[this.field442[var12]];
                                if (var15 != null && var11 != var15 && var15.field1080.field1250 == 1 && var11.field1214 == var15.field1214 && var11.field1215 == var15.field1215) {
                                    this.method169(var15.field1080, this.field442[var12], false, var5, var6);
                                }
                            }
                            for (int var13 = 0; var13 < this.field249; ++var13) {
                                class21 var14 = this.field248[this.field250[var13]];
                                if (var14 != null && var11.field1214 == var14.field1214 && var11.field1215 == var14.field1215) {
                                    this.method142(var5, var6, this.field250[var13], var14, this.field278);
                                }
                            }
                        }
                        this.method169(var11.field1080, var8, false, var5, var6);
                    }
                    if (var7 == 0) {
                        class21 var16 = this.field248[var8];
                        if ((var16.field1214 & 127) == 64 && (var16.field1215 & 127) == 64) {
                            for (int var17 = 0; var17 < this.field441; ++var17) {
                                class44 var20 = this.field440[this.field442[var17]];
                                if (var20 != null && var20.field1080.field1250 == 1 && var16.field1214 == var20.field1214 && var16.field1215 == var20.field1215) {
                                    this.method169(var20.field1080, this.field442[var17], false, var5, var6);
                                }
                            }
                            for (int var18 = 0; var18 < this.field249; ++var18) {
                                class21 var19 = this.field248[this.field250[var18]];
                                if (var19 != null && var16 != var19 && var16.field1214 == var19.field1214 && var16.field1215 == var19.field1215) {
                                    this.method142(var5, var6, this.field250[var18], var19, this.field278);
                                }
                            }
                        }
                        this.method142(var5, var6, var8, var16, this.field278);
                    }
                    if (var7 == 3) {
                        class48 var21 = this.field496[this.field146][var5][var6];
                        if (var21 != null) {
                            for (class10 var22 = (class10) var21.method394(true); var22 != null; var22 = (class10) var21.method396(1837)) {
                                class41 var23 = class41.method374(var22.field599);
                                if (this.field533 == 1) {
                                    this.field450[this.field327] = "Use " + this.field537 + " with @lre@" + var23.field1028;
                                    this.field474[this.field327] = 389;
                                    this.field475[this.field327] = var22.field599;
                                    this.field472[this.field327] = var5;
                                    this.field473[this.field327] = var6;
                                    ++this.field327;
                                } else if (this.field255 == 1) {
                                    if ((this.field257 & 1) == 1) {
                                        this.field450[this.field327] = this.field258 + " @lre@" + var23.field1028;
                                        this.field474[this.field327] = 572;
                                        this.field475[this.field327] = var22.field599;
                                        this.field472[this.field327] = var5;
                                        this.field473[this.field327] = var6;
                                        ++this.field327;
                                    }
                                } else {
                                    for (int var24 = 4; var24 >= 0; --var24) {
                                        if (var23.field1024 != null && var23.field1024[var24] != null) {
                                            this.field450[this.field327] = var23.field1024[var24] + " @lre@" + var23.field1028;
                                            if (var24 == 0) {
                                                this.field474[this.field327] = 81;
                                            }
                                            if (var24 == 1) {
                                                this.field474[this.field327] = 633;
                                            }
                                            if (var24 == 2) {
                                                this.field474[this.field327] = 943;
                                            }
                                            if (var24 == 3) {
                                                this.field474[this.field327] = 629;
                                            }
                                            if (var24 == 4) {
                                                this.field474[this.field327] = 124;
                                            }
                                            this.field475[this.field327] = var22.field599;
                                            this.field472[this.field327] = var5;
                                            this.field473[this.field327] = var6;
                                            ++this.field327;
                                        } else if (var24 == 2) {
                                            this.field450[this.field327] = "Take @lre@" + var23.field1028;
                                            this.field474[this.field327] = 943;
                                            this.field475[this.field327] = var22.field599;
                                            this.field472[this.field327] = var5;
                                            this.field473[this.field327] = var6;
                                            ++this.field327;
                                        }
                                    }
                                    this.field450[this.field327] = "Examine @lre@" + var23.field1028;
                                    this.field474[this.field327] = 1859;
                                    this.field475[this.field327] = var22.field599;
                                    this.field472[this.field327] = var5;
                                    this.field473[this.field327] = var6;
                                    ++this.field327;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method126(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field262[(var2 - 2 << 7) + var3] = 255;
            }
        }
        if (arg0 != 29434) {
            this.field496 = null;
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field262[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field263[var14] = (this.field262[var14 - 1] + this.field262[var14 + 1] + this.field262[var14 - 128] + this.field262[var14 + 128]) / 4;
            }
        }
        this.field414 += 128;
        if (this.field414 > this.field587.length) {
            this.field414 -= this.field587.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method128(4, this.field130[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field263[var11 + 128] - this.field587[this.field414 + var11 & this.field587.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field262[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field325[var8] = this.field325[var8 + 1];
        }
        this.field325[var2 - 1] = (int) (Math.sin((double) field271 / 14.0D) * 16.0D + Math.sin((double) field271 / 15.0D) * 14.0D + Math.sin((double) field271 / 16.0D) * 12.0D);
        if (this.field551 > 0) {
            this.field551 -= 4;
        }
        if (this.field552 > 0) {
            this.field552 -= 4;
        }
        if (this.field551 == 0 && this.field552 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field551 = 1024;
            }
            if (var9 == 1) {
                this.field552 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Ljava/lang/String;")
    public static final String method127(int arg0, int arg1, int arg2) {
        if (arg0 != 5) {
            throw new NullPointerException();
        } else {
            int var3 = arg2 - arg1;
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
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILYAPSNHGU;)V")
    public final void method128(int arg0, class71 arg1) {
        short var3 = 256;
        if (arg0 < 4 || arg0 > 4) {
            this.method52();
        }
        for (int var4 = 0; var4 < this.field587.length; ++var4) {
            this.field587[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field587[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field588[var16] = (this.field587[var16 - 1] + this.field587[var16 + 1] + this.field587[var16 - 128] + this.field587[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field587;
            this.field587 = this.field588;
            this.field588 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field1730; ++var8) {
                for (int var9 = 0; var9 < arg1.field1729; ++var9) {
                    if (arg1.field1727[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field1731;
                        int var11 = var8 + 16 + arg1.field1732;
                        int var12 = (var11 << 7) + var10;
                        this.field587[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method129(byte arg0) {
        if (arg0 != 40) {
            this.field206 = this.field284.method589();
        }
        this.field267.method196(true);
        class5.field65 = this.field184;
        this.field530.method587(0, 0, (byte) 122);
        if (this.field296) {
            this.field358.method418(40, 239, this.field560, 0, 5);
            this.field358.method418(60, 239, this.field506 + "*", 128, 5);
        } else if (this.field568 == 1) {
            this.field358.method418(40, 239, "Enter amount:", 0, 5);
            this.field358.method418(60, 239, this.field539 + "*", 128, 5);
        } else if (this.field568 == 2) {
            this.field358.method418(40, 239, "Enter name:", 0, 5);
            this.field358.method418(60, 239, this.field539 + "*", 128, 5);
        } else if (this.field164 != null) {
            this.field358.method418(40, 239, this.field164, 0, 5);
            this.field358.method418(60, 239, "Click to continue", 128, 5);
        } else if (this.field297 != -1) {
            this.method185(0, 0, class63.field1490[this.field297], 0, 0);
        } else if (this.field400 != -1) {
            this.method185(0, 0, class63.field1490[this.field400], 0, 0);
        } else {
            class54 var2 = this.field357;
            int var3 = 0;
            class19.method232(463, 0, (byte) -87, 77, 0);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field520[var4] != null) {
                    int var6 = this.field518[var4];
                    int var7 = 70 - var3 * 14 + this.field223;
                    String var8 = this.field519[var4];
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
                            var2.method422(0, (byte) 2, this.field520[var4], 4, var7);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field126 == 0 || this.field126 == 1 && this.method174(var8, -39869))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field382[0].method587(var7 - 12, var10, (byte) 122);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field382[1].method587(var7 - 12, var10, (byte) 122);
                                var10 += 14;
                            }
                            var2.method422(0, (byte) 2, var8 + ":", var10, var7);
                            int var11 = var10 + var2.method420(var8, this.field206) + 8;
                            var2.method422(255, (byte) 2, this.field520[var4], var11, var7);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field173 == 0 && (var6 == 7 || this.field280 == 0 || this.field280 == 1 && this.method174(var8, -39869))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method422(0, (byte) 2, "From", var12, var7);
                            int var13 = var12 + var2.method420("From ", this.field206);
                            if (var9 == 1) {
                                this.field382[0].method587(var7 - 12, var13, (byte) 122);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field382[1].method587(var7 - 12, var13, (byte) 122);
                                var13 += 14;
                            }
                            var2.method422(0, (byte) 2, var8 + ":", var13, var7);
                            int var14 = var13 + var2.method420(var8, this.field206) + 8;
                            var2.method422(8388608, (byte) 2, this.field520[var4], var14, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field542 == 0 || this.field542 == 1 && this.method174(var8, -39869))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method422(8388736, (byte) 2, var8 + " " + this.field520[var4], 4, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field173 == 0 && this.field280 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method422(8388608, (byte) 2, this.field520[var4], 4, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field173 == 0 && this.field280 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method422(0, (byte) 2, "To " + var8 + ":", 4, var7);
                            var2.method422(8388608, (byte) 2, this.field520[var4], 12 + var2.method420("To " + var8, this.field206), var7);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field542 == 0 || this.field542 == 1 && this.method174(var8, -39869))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method422(8270336, (byte) 2, var8 + " " + this.field520[var4], 4, var7);
                        }
                        ++var3;
                    }
                }
            }
            class19.method231(false);
            this.field158 = var3 * 14 + 7;
            if (this.field158 < 78) {
                this.field158 = 78;
            }
            this.method146(this.field158 - this.field223 - 77, 77, this.field158, 0, true, 463);
            String var5;
            if (field454 != null && field454.field698 != null) {
                var5 = field454.field698;
            } else {
                var5 = class70.method580((byte) 86, this.field335);
            }
            var2.method422(0, (byte) 2, var5 + ":", 4, 90);
            var2.method422(255, (byte) 2, this.field162 + "*", 6 + var2.method420(var5 + ": ", this.field206), 90);
            class19.method238(479, 0, -518, 0, 77);
        }
        if (this.field305 && this.field179 == 2) {
            this.method92((byte) 0);
        }
        this.field267.method197(super.field95, 357, true, 17);
        this.field266.method196(true);
        class5.field65 = this.field186;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZB)V")
    public final void method130(boolean arg0, byte arg1) {
        this.method133(-9534);
        this.field213.method196(true);
        this.field482.method587(0, 0, (byte) 122);
        short var3 = 360;
        short var4 = 200;
        if (arg1 != 68) {
            this.field236 = this.field254.method306();
        }
        if (this.field517 == 0) {
            int var5 = var4 / 2 + 80;
            this.field356.method419(true, this.field234.field1691, 0, var3 / 2, 7711145, var5);
            int var6 = var4 / 2 - 20;
            this.field358.method419(true, "Welcome to RuneScape", 0, var3 / 2, 16776960, var6);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field483.method587(var8 - 20, var7 - 73, (byte) 122);
            this.field358.method419(true, "New User", 0, var7, 16777215, var8 + 5);
            int var9 = var3 / 2 + 80;
            this.field483.method587(var8 - 20, var9 - 73, (byte) 122);
            this.field358.method419(true, "Existing User", 0, var9, 16777215, var8 + 5);
        }
        if (this.field517 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field240.length() > 0) {
                this.field358.method419(true, this.field240, 0, var3 / 2, 16776960, var10 - 15);
                this.field358.method419(true, this.field241, 0, var3 / 2, 16776960, var10);
                var10 += 30;
            } else {
                this.field358.method419(true, this.field241, 0, var3 / 2, 16776960, var10 - 7);
                var10 += 30;
            }
            this.field358.method426("Username: " + this.field335 + (this.field477 == 0 & field271 % 40 < 20 ? "@yel@|" : ""), true, true, var3 / 2 - 90, 16777215, var10);
            var10 += 15;
            this.field358.method426("Password: " + class70.method581((byte) 4, this.field336) + (this.field477 == 1 & field271 % 40 < 20 ? "@yel@|" : ""), true, true, var3 / 2 - 88, 16777215, var10);
            var10 += 15;
            if (!arg0) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field483.method587(var12 - 20, var11 - 73, (byte) 122);
                this.field358.method419(true, "Login", 0, var11, 16777215, var12 + 5);
                int var13 = var3 / 2 + 80;
                this.field483.method587(var12 - 20, var13 - 73, (byte) 122);
                this.field358.method419(true, "Cancel", 0, var13, 16777215, var12 + 5);
            }
        }
        if (this.field517 == 3) {
            this.field358.method419(true, "Create a free account", 0, var3 / 2, 16776960, var4 / 2 - 60);
            int var14 = var4 / 2 - 35;
            this.field358.method419(true, "To create a new account you need to", 0, var3 / 2, 16777215, var14);
            int var18 = var14 + 15;
            this.field358.method419(true, "go back to the main RuneScape webpage", 0, var3 / 2, 16777215, var18);
            int var19 = var18 + 15;
            this.field358.method419(true, "and choose the red 'create account'", 0, var3 / 2, 16777215, var19);
            int var20 = var19 + 15;
            this.field358.method419(true, "button at the top right of that page.", 0, var3 / 2, 16777215, var20);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field483.method587(var16 - 20, var15 - 73, (byte) 122);
            this.field358.method419(true, "Cancel", 0, var15, 16777215, var16 + 5);
        }
        this.field213.method197(super.field95, 171, true, 202);
        if (this.field505) {
            this.field505 = false;
            this.field211.method197(super.field95, 0, true, 128);
            this.field212.method197(super.field95, 371, true, 202);
            this.field216.method197(super.field95, 265, true, 0);
            this.field217.method197(super.field95, 265, true, 562);
            this.field218.method197(super.field95, 171, true, 128);
            this.field219.method197(super.field95, 171, true, 562);
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method131(int arg0) {
        try {
            this.field550 = -1;
            this.field462.method397();
            this.field230.method397();
            class5.method28(-47631);
            this.method64(true);
            this.field521.method504(6);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field497[var2].method344();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field204[var3][var4][var5] = 0;
                    }
                }
            }
            class3 var6 = new class3(104, this.field389, this.field197, this.field204, 104);
            int var7 = this.field443.length;
            this.field175.method295(166, 1);
            if (!this.field384) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field152[var8] >> 8) * 64 - this.field570;
                    int var10 = (this.field152[var8] & 255) * 64 - this.field571;
                    byte[] var11 = this.field443[var8];
                    if (var11 != null) {
                        var6.method7(true, var11, var9, var10, this.field497, (this.field343 - 6) * 8, (this.field342 - 6) * 8);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field152[var12] >> 8) * 64 - this.field570;
                    int var14 = (this.field152[var12] & 255) * 64 - this.field571;
                    byte[] var15 = this.field443[var12];
                    if (var15 == null && this.field343 < 800) {
                        var6.method6(var14, var13, 64, (byte) 7, 64);
                    }
                }
                this.field175.method295(166, 1);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field171[var16];
                    if (var17 != null) {
                        int var18 = (this.field152[var16] >> 8) * 64 - this.field570;
                        int var19 = (this.field152[var16] & 255) * 64 - this.field571;
                        var6.method16(var19, this.field521, var18, 2, this.field497, var17);
                    }
                }
            }
            if (this.field384) {
                int var20 = 0;
                label248: while (true) {
                    if (var20 >= 4) {
                        for (int var30 = 0; var30 < 13; ++var30) {
                            for (int var31 = 0; var31 < 13; ++var31) {
                                int var32 = this.field190[0][var30][var31];
                                if (var32 == -1) {
                                    var6.method6(var31 * 8, var30 * 8, 8, (byte) 7, 8);
                                }
                            }
                        }
                        this.field175.method295(166, 1);
                        int var33 = 0;
                        while (true) {
                            if (var33 >= 4) {
                                break label248;
                            }
                            for (int var34 = 0; var34 < 13; ++var34) {
                                for (int var35 = 0; var35 < 13; ++var35) {
                                    int var36 = this.field190[var33][var34][var35];
                                    if (var36 != -1) {
                                        int var37 = var36 >> 24 & 3;
                                        int var38 = var36 >> 1 & 3;
                                        int var39 = var36 >> 14 & 1023;
                                        int var40 = var36 >> 3 & 2047;
                                        int var41 = (var39 / 8 << 8) + var40 / 8;
                                        for (int var42 = 0; var42 < this.field152.length; ++var42) {
                                            if (this.field152[var42] == var41 && this.field171[var42] != null) {
                                                var6.method15(var35 * 8, 0, this.field171[var42], this.field497, var37, var34 * 8, (var39 & 7) * 8, var33, var38, this.field521, (var40 & 7) * 8);
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
                            int var23 = this.field190[var20][var21][var22];
                            if (var23 != -1) {
                                int var24 = var23 >> 24 & 3;
                                int var25 = var23 >> 1 & 3;
                                int var26 = var23 >> 14 & 1023;
                                int var27 = var23 >> 3 & 2047;
                                int var28 = (var26 / 8 << 8) + var27 / 8;
                                for (int var29 = 0; var29 < this.field152.length; ++var29) {
                                    if (this.field152[var29] == var28 && this.field443[var29] != null) {
                                        var6.method13(true, var24, this.field497, var22 * 8, (var26 & 7) * 8, var25, this.field443[var29], var20, var21 * 8, (var27 & 7) * 8);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field175.method295(166, 1);
            var6.method12(27029, this.field521, this.field497);
            this.field266.method196(true);
            this.field175.method295(166, 1);
            int var43 = class3.field39;
            if (var43 > this.field146) {
                var43 = this.field146;
            }
            if (var43 < this.field146 - 1) {
                int var44 = this.field146 - 1;
            }
            if (field426) {
                this.field521.method505(class3.field39, (byte) 6);
            } else {
                this.field521.method505(0, (byte) 6);
            }
            for (int var45 = 0; var45 < 104; ++var45) {
                for (int var46 = 0; var46 < 104; ++var46) {
                    this.method148(var45, var46);
                }
            }
            this.method172(-402);
        } catch (Exception var59) {
        }
        class61.field1435.method388();
        if (super.field98 != null) {
            this.field175.method295(53, 1);
            this.field175.method300(1057001181);
        }
        if (field426 && signlink.cache_dat != null) {
            int var48 = this.field234.method557(true, 0);
            for (int var49 = 0; var49 < var48; ++var49) {
                int var50 = this.field234.method558((byte) 63, var49);
                if ((var50 & 121) == 0) {
                    class59.method453(var49, 0);
                }
            }
        }
        System.gc();
        class5.method29((byte) 4, 20);
        this.field234.method573(0);
        int var51 = (this.field342 - 6) / 8 - 1;
        int var52 = (this.field342 + 6) / 8 + 1;
        if (arg0 <= 0) {
            this.field438 = 180;
        }
        int var53 = (this.field343 - 6) / 8 - 1;
        int var54 = (this.field343 + 6) / 8 + 1;
        if (this.field512) {
            var51 = 49;
            var52 = 50;
            var53 = 49;
            var54 = 50;
        }
        for (int var55 = var51; var55 <= var52; ++var55) {
            for (int var56 = var53; var56 <= var54; ++var56) {
                if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
                    int var57 = this.field234.method563(0, var55, var56, true);
                    if (var57 != -1) {
                        this.field234.method565(-198, var57, 3);
                    }
                    int var58 = this.field234.method563(1, var55, var56, true);
                    if (var58 != -1) {
                        this.field234.method565(-198, var58, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)V")
    public final void method132(int arg0, boolean arg1) {
        if (field454.field1214 >> 7 == this.field501 && field454.field1215 >> 7 == this.field502) {
            this.field501 = 0;
        }
        int var3 = this.field249;
        int var4 = 90 / arg0;
        if (arg1) {
            var3 = 1;
        }
        for (int var5 = 0; var5 < var3; ++var5) {
            class21 var6;
            int var7;
            if (arg1) {
                var6 = field454;
                var7 = this.field247 << 14;
            } else {
                var6 = this.field248[this.field250[var5]];
                var7 = this.field250[var5] << 14;
            }
            if (var6 != null && var6.method244(true)) {
                var6.field727 = false;
                if ((field426 && this.field249 > 50 || this.field249 > 200) && !arg1 && var6.field1207 == var6.field1202) {
                    var6.field727 = true;
                }
                int var8 = var6.field1214 >> 7;
                int var9 = var6.field1215 >> 7;
                if (var8 >= 0 && var8 < 104 && var9 >= 0 && var9 < 104) {
                    if (var6.field712 != null && field271 >= var6.field717 && field271 < var6.field718) {
                        var6.field727 = false;
                        var6.field708 = this.method173(var6.field1215, var6.field1214, this.field146, 1);
                        this.field521.method516(this.field146, 60, var6.field720, var6.field722, var6.field1214, false, var6.field708, var6, var6.field1216, var7, var6.field723, var6.field1215, var6.field721);
                    } else {
                        if ((var6.field1214 & 127) == 64 && (var6.field1215 & 127) == 64) {
                            if (this.field538[var8][var9] == this.field147) {
                                continue;
                            }
                            this.field538[var8][var9] = this.field147;
                        }
                        var6.field708 = this.method173(var6.field1215, var6.field1214, this.field146, 1);
                        this.field521.method515(var6.field708, var7, 60, var6.field1236, this.field146, var6.field1214, var6, var6.field1215, (byte) -48, var6.field1216);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method133(int arg0) {
        if (this.field211 == null) {
            super.field96 = null;
            this.field267 = null;
            this.field265 = null;
            this.field264 = null;
            this.field266 = null;
            this.field522 = null;
            this.field523 = null;
            this.field524 = null;
            this.field214 = new class9(128, this.method57(field455), 265, 912);
            class19.method233(this.field220);
            this.field215 = new class9(128, this.method57(field455), 265, 912);
            class19.method233(this.field220);
            this.field211 = new class9(509, this.method57(field455), 171, 912);
            class19.method233(this.field220);
            this.field212 = new class9(360, this.method57(field455), 132, 912);
            class19.method233(this.field220);
            this.field213 = new class9(360, this.method57(field455), 200, 912);
            class19.method233(this.field220);
            this.field216 = new class9(202, this.method57(field455), 238, 912);
            if (this.field140 != arg0) {
                field415 = !field415;
            }
            class19.method233(this.field220);
            this.field217 = new class9(203, this.method57(field455), 238, 912);
            class19.method233(this.field220);
            this.field218 = new class9(74, this.method57(field455), 94, 912);
            class19.method233(this.field220);
            this.field219 = new class9(75, this.method57(field455), 94, 912);
            class19.method233(this.field220);
            if (this.field308 != null) {
                this.method155(505);
                this.method81(-375);
            }
            this.field505 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LTNOPEJNZ;I)Z")
    public final boolean method134(class63 arg0, int arg1) {
        if (arg1 != 18875) {
            this.field155 = 465;
        }
        if (arg0.field1499 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field1499.length; ++var3) {
                int var4 = this.method110(arg0, -66, var3);
                int var5 = arg0.field1521[var3];
                if (arg0.field1499[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field1499[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field1499[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field521.method530(arg3, arg2, arg1);
        if (var7 != 0) {
            int var8 = this.field521.method534(arg3, arg2, arg1, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg4;
            if (var7 > 0) {
                var11 = arg5;
            }
            int[] var12 = this.field503.field620;
            int var13 = (103 - arg1) * 512 * 4 + arg2 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class61 var15 = class61.method491(var14);
            if (var15.field1416 != -1) {
                class71 var16 = this.field446[var15.field1416];
                if (var16 != null) {
                    int var17 = (var15.field1418 * 4 - var16.field1729) / 2;
                    int var18 = (var15.field1394 * 4 - var16.field1730) / 2;
                    var16.method587((104 - arg1 - var15.field1394) * 4 + 48 + var18, arg2 * 4 + 48 + var17, (byte) 122);
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
        int var19 = this.field521.method532(arg3, arg2, arg1);
        if (var19 != 0) {
            int var20 = this.field521.method534(arg3, arg2, arg1, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class61 var24 = class61.method491(var23);
            if (var24.field1416 != -1) {
                class71 var25 = this.field446[var24.field1416];
                if (var25 != null) {
                    int var26 = (var24.field1418 * 4 - var25.field1729) / 2;
                    int var27 = (var24.field1394 * 4 - var25.field1730) / 2;
                    var25.method587((104 - arg1 - var24.field1394) * 4 + 48 + var27, arg2 * 4 + 48 + var26, (byte) 122);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field503.field620;
                int var30 = (103 - arg1) * 512 * 4 + arg2 * 4 + 24624;
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
        int var31 = this.field521.method533(arg3, arg2, arg1);
        if (arg0 != 3) {
            this.field323 = this.field284.method589();
        }
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class61 var33 = class61.method491(var32);
            if (var33.field1416 != -1) {
                class71 var34 = this.field446[var33.field1416];
                if (var34 != null) {
                    int var35 = (var33.field1418 * 4 - var34.field1729) / 2;
                    int var36 = (var33.field1394 * 4 - var34.field1730) / 2;
                    var34.method587((104 - arg1 - var33.field1394) * 4 + 48 + var36, arg2 * 4 + 48 + var35, (byte) 122);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method136(int arg0) {
        if (this.field173 != 0) {
            class54 var2 = this.field357;
            if (arg0 <= 0) {
                this.field496 = null;
            }
            int var3 = 0;
            if (this.field582 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field520[var4] != null) {
                    int var5 = this.field518[var4];
                    String var6 = this.field519[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field280 == 0 || this.field280 == 1 && this.method174(var6, -39869))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method422(0, (byte) 2, "From", var9, var8);
                        var2.method422(65535, (byte) 2, "From", var9, var8 - 1);
                        int var10 = var9 + var2.method420("From ", this.field206);
                        if (var7 == 1) {
                            this.field382[0].method587(var8 - 12, var10, (byte) 122);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field382[1].method587(var8 - 12, var10, (byte) 122);
                            var10 += 14;
                        }
                        var2.method422(0, (byte) 2, var6 + ": " + this.field520[var4], var10, var8);
                        var2.method422(65535, (byte) 2, var6 + ": " + this.field520[var4], var10, var8 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field280 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method422(0, (byte) 2, this.field520[var4], 4, var11);
                        var2.method422(65535, (byte) 2, this.field520[var4], 4, var11 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field280 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method422(0, (byte) 2, "To " + var6 + ": " + this.field520[var4], 4, var12);
                        var2.method422(65535, (byte) 2, "To " + var6 + ": " + this.field520[var4], 4, var12 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILDLNMSHLT;I)V")
    public final void method137(byte arg0, int arg1, class12 arg2, int arg3) {
        if (arg0 != 8) {
            this.field294 = !this.field294;
        }
        int var5 = this.field531 + this.field487 & 2047;
        int var6 = arg1 * arg1 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = class59.field1367[var5];
            int var8 = class59.field1368[var5];
            int var9 = var7 * 256 / (this.field553 + 256);
            int var10 = var8 * 256 / (this.field553 + 256);
            int var11 = arg1 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg1 * var9 >> 16;
            if (var6 > 2500) {
                arg2.method211(this.field529, var11 + 94 - arg2.field625 / 2 + 4, 1, 83 - var12 - arg2.field626 / 2 - 4);
            } else {
                arg2.method205(83 - var12 - arg2.field626 / 2 - 4, var11 + 94 - arg2.field625 / 2 + 4, (byte) 122);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)Ljava/lang/String;")
    private static final String method138(int arg0, byte arg1) {
        String var2 = String.valueOf(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1 != 3) {
            field321 = !field321;
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)Ljava/lang/String;")
    private static final String method139(int arg0, int arg1) {
        if (arg0 >= 1 && arg0 <= 1) {
            if (arg1 < 100000) {
                return String.valueOf(arg1);
            } else {
                return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method140(int arg0) {
        if (this.field239 > 0) {
            this.method179(8);
        } else {
            this.field266.method196(true);
            this.field357.method418(144, 257, "Connection lost", 0, 5);
            this.field357.method418(143, 256, "Connection lost", 16777215, 5);
            this.field357.method418(159, 257, "Please wait - attempting to reestablish", 0, 5);
            this.field357.method418(158, 256, "Please wait - attempting to reestablish", 16777215, 5);
            this.field266.method197(super.field95, 4, true, 4);
            if (arg0 >= 0) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            this.field324 = 0;
            this.field501 = 0;
            class55 var3 = this.field322;
            this.field295 = false;
            this.field422 = 0;
            this.method187(this.field335, this.field336, true);
            if (!this.field295) {
                this.method179(8);
            }
            try {
                var3.method433();
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method141(int arg0) {
        if (this.field141 == 2) {
            this.method70(this.field576 * 2, (this.field575 - this.field571 << 7) + this.field578, this.field312, (this.field574 - this.field570 << 7) + this.field577);
            this.field235 += arg0;
            if (this.field514 > -1 && field271 % 20 < 10) {
                this.field508[2].method205(this.field515 - 28, this.field514 - 12, (byte) 122);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILFVFJZZXQ;I)V")
    public final void method142(int arg0, int arg1, int arg2, class21 arg3, int arg4) {
        if (field454 != arg3) {
            if (this.field327 < 400) {
                String var6;
                if (arg3.field700 == 0) {
                    var6 = arg3.field698 + method127(5, arg3.field730, field454.field730) + " (level-" + arg3.field730 + ")";
                } else {
                    var6 = arg3.field698 + " (skill-" + arg3.field700 + ")";
                }
                if (this.field533 == 1) {
                    this.field450[this.field327] = "Use " + this.field537 + " with @whi@" + var6;
                    this.field474[this.field327] = 128;
                    this.field475[this.field327] = arg2;
                    this.field472[this.field327] = arg0;
                    this.field473[this.field327] = arg1;
                    ++this.field327;
                } else if (this.field255 == 1) {
                    if ((this.field257 & 8) == 8) {
                        this.field450[this.field327] = this.field258 + " @whi@" + var6;
                        this.field474[this.field327] = 964;
                        this.field475[this.field327] = arg2;
                        this.field472[this.field327] = arg0;
                        this.field473[this.field327] = arg1;
                        ++this.field327;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field580[var7] != null) {
                            this.field450[this.field327] = this.field580[var7] + " @whi@" + var6;
                            short var10 = 0;
                            if (this.field580[var7].equalsIgnoreCase("attack")) {
                                if (arg3.field730 > field454.field730) {
                                    var10 = 2000;
                                }
                                if (field454.field714 != 0 && arg3.field714 != 0) {
                                    if (field454.field714 == arg3.field714) {
                                        var10 = 2000;
                                    } else {
                                        var10 = 0;
                                    }
                                }
                            } else if (this.field581[var7]) {
                                var10 = 2000;
                            }
                            if (var7 == 0) {
                                this.field474[this.field327] = var10 + 901;
                            }
                            if (var7 == 1) {
                                this.field474[this.field327] = var10 + 562;
                            }
                            if (var7 == 2) {
                                this.field474[this.field327] = var10 + 801;
                            }
                            if (var7 == 3) {
                                this.field474[this.field327] = var10 + 338;
                            }
                            if (var7 == 4) {
                                this.field474[this.field327] = var10 + 90;
                            }
                            this.field475[this.field327] = arg2;
                            this.field472[this.field327] = arg0;
                            this.field473[this.field327] = arg1;
                            ++this.field327;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field327; ++var8) {
                    if (this.field474[var8] == 505) {
                        this.field450[var8] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                int var9 = 92 / arg4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method143(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method144(int arg0) {
        if (this.field582 > 1) {
            --this.field582;
        }
        if (this.field239 > 0) {
            --this.field239;
        }
        for (int var2 = 0; var2 < 5 && this.method118((byte) 8); ++var2) {
        }
        if (this.field295) {
            Object var3 = this.field148.field1651;
            synchronized (this.field148.field1651) {
                if (!field395) {
                    this.field148.field1650 = 0;
                } else if (super.field109 != 0 || this.field148.field1650 >= 40) {
                    this.field175.method295(22, 1);
                    this.field175.method296(0);
                    int var4 = this.field175.field901;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field148.field1650 && var4 - this.field175.field901 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field148.field1645[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field148.field1647[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field148.field1645[var6] == -1 && this.field148.field1647[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field268 == var8 && this.field269 == var7) {
                            if (this.field306 < 2047) {
                                ++this.field306;
                            }
                        } else {
                            int var10 = var8 - this.field268;
                            this.field268 = var8;
                            int var11 = var7 - this.field269;
                            this.field269 = var7;
                            if (this.field306 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field175.method297((this.field306 << 12) + (var10 << 6) + var11);
                                this.field306 = 0;
                            } else if (this.field306 < 8) {
                                this.field175.method299((this.field306 << 19) + 8388608 + var9);
                                this.field306 = 0;
                            } else {
                                this.field175.method300((this.field306 << 19) + -1073741824 + var9);
                                this.field306 = 0;
                            }
                        }
                    }
                    this.field175.method305((byte) 103, this.field175.field901 - var4);
                    if (var5 >= this.field148.field1650) {
                        this.field148.field1650 = 0;
                    } else {
                        this.field148.field1650 -= var5;
                        for (int var12 = 0; var12 < this.field148.field1650; ++var12) {
                            this.field148.field1647[var12] = this.field148.field1647[var5 + var12];
                            this.field148.field1645[var12] = this.field148.field1645[var5 + var12];
                        }
                    }
                }
            }
            if (super.field109 != 0) {
                long var13 = (super.field112 - this.field200) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field200 = super.field112;
                int var15 = super.field111;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field110;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field109 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field175.method295(160, 1);
                this.field175.method300((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field459 > 0) {
                --this.field459;
            }
            if (super.field113[1] == 1 || super.field113[2] == 1 || super.field113[3] == 1 || super.field113[4] == 1) {
                this.field460 = true;
            }
            if (this.field460 && this.field459 <= 0) {
                this.field459 = 20;
                this.field460 = false;
                this.field175.method295(188, 1);
                this.field175.method332(this.field487, -79);
                this.field175.method331(this.field486, (byte) 81);
            }
            if (super.field100 && !this.field360) {
                this.field360 = true;
                this.field175.method295(136, 1);
                this.field175.method296(1);
            }
            if (!super.field100 && this.field360) {
                this.field360 = false;
                this.field175.method295(136, 1);
                this.field175.method296(0);
            }
            this.method104((byte) 21);
            this.method80(2);
            this.method100(true);
            ++this.field237;
            if (this.field237 > 750) {
                this.method140(-984);
            }
            this.method122(this.field188);
            this.method160(0);
            this.method194(true);
            ++field279;
            if (field279 > 85) {
                field279 = 0;
                this.field175.method295(245, 1);
            }
            ++this.field121;
            if (this.field399 != 0) {
                this.field398 += 20;
                if (this.field398 >= 400) {
                    this.field399 = 0;
                }
            }
            if (this.field549 != 0) {
                ++this.field546;
                if (this.field546 >= 15) {
                    if (this.field549 == 2) {
                        this.field494 = true;
                    }
                    if (this.field549 == 3) {
                        this.field586 = true;
                    }
                    this.field549 = 0;
                }
            }
            if (this.field167 != 0) {
                ++this.field226;
                if (super.field103 > this.field168 + 5 || super.field103 < this.field168 - 5 || super.field104 > this.field169 + 5 || super.field104 < this.field169 - 5) {
                    this.field563 = true;
                }
                if (super.field102 == 0) {
                    if (this.field167 == 2) {
                        this.field494 = true;
                    }
                    if (this.field167 == 3) {
                        this.field586 = true;
                    }
                    this.field167 = 0;
                    if (this.field563 && this.field226 >= 5) {
                        this.field320 = -1;
                        this.method157(-346);
                        if (this.field320 == this.field165 && this.field319 != this.field166) {
                            class63 var20 = class63.field1490[this.field165];
                            byte var21 = 0;
                            if (this.field490 == 1 && var20.field1529 == 206) {
                                var21 = 1;
                            }
                            if (var20.field1540[this.field319] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1496) {
                                int var22 = this.field166;
                                int var23 = this.field319;
                                var20.field1540[var23] = var20.field1540[var22];
                                var20.field1517[var23] = var20.field1517[var22];
                                var20.field1540[var22] = -1;
                                var20.field1517[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field166;
                                int var25 = this.field319;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method498(false, var24, var24 - 1);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method498(false, var24, var24 + 1);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method498(false, this.field166, this.field319);
                            }
                            this.field175.method295(228, 1);
                            this.field175.method322((byte) 99, var21);
                            this.field175.method297(this.field165);
                            this.field175.method333(this.field166, 508);
                            this.field175.method297(this.field319);
                        }
                    } else if ((this.field566 == 1 || this.method115(true, this.field327 - 1)) && this.field327 > 2) {
                        this.method98(16143);
                    } else if (this.field327 > 0) {
                        this.method101(this.field327 - 1, 16655);
                    }
                    this.field546 = 10;
                    super.field109 = 0;
                }
            }
            if (class65.field1615 != -1) {
                int var26 = class65.field1615;
                int var27 = class65.field1616;
                boolean var28 = this.method171(var26, 0, 0, 0, field454.field1200[0], 0, true, 0, (byte) 4, field454.field1201[0], 0, var27);
                class65.field1615 = -1;
                if (var28) {
                    this.field396 = super.field110;
                    this.field397 = super.field111;
                    this.field399 = 1;
                    this.field398 = 0;
                }
            }
            if (super.field109 == 1 && this.field164 != null) {
                this.field164 = null;
                this.field586 = true;
                super.field109 = 0;
            }
            this.method75(0);
            this.method189(this.field347);
            this.method147(49818);
            this.method175(this.field493);
            while (arg0 >= 0) {
                this.field236 = this.field254.method306();
            }
            if (super.field102 == 1 || super.field109 == 1) {
                ++this.field259;
            }
            if (this.field275 == 2) {
                this.method113(true);
            }
            if (this.field275 == 2 && this.field274) {
                this.method182(217);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field288[var29]++;
            }
            this.method67(0);
            ++super.field101;
            if (super.field101 > 4500) {
                this.field239 = 250;
                super.field101 -= 500;
                this.field175.method295(243, 1);
            }
            ++this.field421;
            if (this.field421 > 500) {
                this.field421 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field314 += this.field315;
                }
                if ((var30 & 2) == 2) {
                    this.field194 += this.field195;
                }
                if ((var30 & 4) == 4) {
                    this.field448 += this.field449;
                }
            }
            if (this.field314 < -50) {
                this.field315 = 2;
            }
            if (this.field314 > 50) {
                this.field315 = -2;
            }
            if (this.field194 < -55) {
                this.field195 = 2;
            }
            if (this.field194 > 55) {
                this.field195 = -2;
            }
            if (this.field448 < -40) {
                this.field449 = 1;
            }
            if (this.field448 > 40) {
                this.field449 = -1;
            }
            ++this.field504;
            if (this.field504 > 500) {
                this.field504 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field531 += this.field532;
                }
                if ((var31 & 2) == 2) {
                    this.field553 += this.field554;
                }
            }
            if (this.field531 < -60) {
                this.field532 = 2;
            }
            if (this.field531 > 60) {
                this.field532 = -2;
            }
            if (this.field553 < -20) {
                this.field554 = 1;
            }
            if (this.field553 > 10) {
                this.field554 = -1;
            }
            ++this.field238;
            if (this.field238 > 50) {
                this.field175.method295(166, 1);
            }
            try {
                if (this.field322 != null && this.field175.field901 > 0) {
                    this.field322.method437(this.field175.field900, this.field175.field901, 0, -4632);
                    this.field175.field901 = 0;
                    this.field238 = 0;
                }
            } catch (IOException var33) {
                this.method140(-984);
            } catch (Exception var34) {
                this.method179(8);
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method145(byte arg0) {
        if (arg0 != 7) {
            this.field155 = -189;
        }
        this.field175.method295(70, 1);
        if (this.field270 != -1) {
            this.field270 = -1;
            this.field494 = true;
            this.field159 = false;
            this.field292 = true;
        }
        if (this.field297 != -1) {
            this.field297 = -1;
            this.field586 = true;
            this.field159 = false;
        }
        this.field245 = -1;
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 318);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field423 = Integer.parseInt(arg0[0]);
                field424 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method99(7);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method90(2);
                }
                if (arg0[3].equals("free")) {
                    field425 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field425 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method47(503, 765, 0);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIZI)V")
    public final void method146(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.field176.method587(arg3, arg5, (byte) 122);
        this.field177.method587(arg1 + arg3 - 16, arg5, (byte) 122);
        class19.method235(false, arg1 - 32, 16, arg3 + 16, this.field142, arg5);
        int var7 = (arg1 - 32) * arg1 / arg2;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg1 - 32 - var7) * arg0 / (arg2 - arg1);
        class19.method235(false, var7, 16, arg3 + 16 + var8, this.field393, arg5);
        class19.method240(arg5, arg3 + 16 + var8, this.field232, var7, 0);
        class19.method240(arg5 + 1, arg3 + 16 + var8, this.field232, var7, 0);
        class19.method238(16, this.field232, -518, arg5, arg3 + 16 + var8);
        class19.method238(16, this.field232, -518, arg5, arg3 + 17 + var8);
        if (!arg4) {
            this.field236 = this.field254.method306();
        }
        class19.method240(arg5 + 15, arg3 + 16 + var8, this.field196, var7, 0);
        class19.method240(arg5 + 14, arg3 + 17 + var8, this.field196, var7 - 1, 0);
        class19.method238(16, this.field196, -518, arg5, arg3 + 15 + var8 + var7);
        class19.method238(15, this.field196, -518, arg5 + 1, arg3 + 14 + var8 + var7);
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method147(int arg0) {
        if (arg0 == 49818) {
            if (super.field109 == 1) {
                if (super.field110 >= 539 && super.field110 <= 573 && super.field111 >= 169 && super.field111 < 205 && this.field392[0] != -1) {
                    this.field494 = true;
                    this.field405 = 0;
                    this.field292 = true;
                }
                if (super.field110 >= 569 && super.field110 <= 599 && super.field111 >= 168 && super.field111 < 205 && this.field392[1] != -1) {
                    this.field494 = true;
                    this.field405 = 1;
                    this.field292 = true;
                }
                if (super.field110 >= 597 && super.field110 <= 627 && super.field111 >= 168 && super.field111 < 205 && this.field392[2] != -1) {
                    this.field494 = true;
                    this.field405 = 2;
                    this.field292 = true;
                }
                if (super.field110 >= 625 && super.field110 <= 669 && super.field111 >= 168 && super.field111 < 203 && this.field392[3] != -1) {
                    this.field494 = true;
                    this.field405 = 3;
                    this.field292 = true;
                }
                if (super.field110 >= 666 && super.field110 <= 696 && super.field111 >= 168 && super.field111 < 205 && this.field392[4] != -1) {
                    this.field494 = true;
                    this.field405 = 4;
                    this.field292 = true;
                }
                if (super.field110 >= 694 && super.field110 <= 724 && super.field111 >= 168 && super.field111 < 205 && this.field392[5] != -1) {
                    this.field494 = true;
                    this.field405 = 5;
                    this.field292 = true;
                }
                if (super.field110 >= 722 && super.field110 <= 756 && super.field111 >= 169 && super.field111 < 205 && this.field392[6] != -1) {
                    this.field494 = true;
                    this.field405 = 6;
                    this.field292 = true;
                }
                if (super.field110 >= 540 && super.field110 <= 574 && super.field111 >= 466 && super.field111 < 502 && this.field392[7] != -1) {
                    this.field494 = true;
                    this.field405 = 7;
                    this.field292 = true;
                }
                if (super.field110 >= 572 && super.field110 <= 602 && super.field111 >= 466 && super.field111 < 503 && this.field392[8] != -1) {
                    this.field494 = true;
                    this.field405 = 8;
                    this.field292 = true;
                }
                if (super.field110 >= 599 && super.field110 <= 629 && super.field111 >= 466 && super.field111 < 503 && this.field392[9] != -1) {
                    this.field494 = true;
                    this.field405 = 9;
                    this.field292 = true;
                }
                if (super.field110 >= 627 && super.field110 <= 671 && super.field111 >= 467 && super.field111 < 502 && this.field392[10] != -1) {
                    this.field494 = true;
                    this.field405 = 10;
                    this.field292 = true;
                }
                if (super.field110 >= 669 && super.field110 <= 699 && super.field111 >= 466 && super.field111 < 503 && this.field392[11] != -1) {
                    this.field494 = true;
                    this.field405 = 11;
                    this.field292 = true;
                }
                if (super.field110 >= 696 && super.field110 <= 726 && super.field111 >= 466 && super.field111 < 503 && this.field392[12] != -1) {
                    this.field494 = true;
                    this.field405 = 12;
                    this.field292 = true;
                }
                if (super.field110 >= 724 && super.field110 <= 758 && super.field111 >= 466 && super.field111 < 502 && this.field392[13] != -1) {
                    this.field494 = true;
                    this.field405 = 13;
                    this.field292 = true;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method148(int arg0, int arg1) {
        class48 var3 = this.field496[this.field146][arg0][arg1];
        if (var3 == null) {
            this.field521.method525(this.field146, arg0, arg1);
        } else {
            int var4 = -99999999;
            class10 var5 = null;
            for (class10 var6 = (class10) var3.method393(); var6 != null; var6 = (class10) var3.method395(true)) {
                class41 var11 = class41.method374(var6.field599);
                int var12 = var11.field1025;
                if (var11.field1046) {
                    var12 = (var6.field598 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method391(var5, -15393);
            class10 var7 = null;
            class10 var8 = null;
            for (class10 var9 = (class10) var3.method393(); var9 != null; var9 = (class10) var3.method395(true)) {
                if (var5.field599 != var9.field599 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field599 != var9.field599 && var7.field599 != var9.field599 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field521.method511(var10, var7, this.method173(arg1 * 128 + 64, arg0 * 128 + 64, this.field146, 1), var5, arg0, this.field146, arg1, var8, false);
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method149(int arg0) {
        if (arg0 < 4 || arg0 > 4) {
            this.field188 = this.field284.method589();
        }
        while (true) {
            class37 var2 = this.field234.method568();
            if (var2 == null) {
                return;
            }
            if (var2.field974 == 0) {
                class59.method452(var2.field970, (byte) -103, var2.field972);
                if ((this.field234.method558((byte) 63, var2.field970) & 98) != 0) {
                    this.field494 = true;
                    if (this.field297 != -1) {
                        this.field586 = true;
                    }
                }
            }
            if (var2.field974 == 1 && var2.field972 != null) {
                class18.method226(var2.field972, 0);
            }
            if (var2.field974 == 2 && this.field285 == var2.field970 && var2.field972 != null) {
                this.method77(this.field155, var2.field972, this.field286);
            }
            if (var2.field974 == 3 && this.field275 == 1) {
                for (int var3 = 0; var3 < this.field443.length; ++var3) {
                    if (this.field153[var3] == var2.field970) {
                        this.field443[var3] = var2.field972;
                        if (var2.field972 == null) {
                            this.field153[var3] = -1;
                        }
                        break;
                    }
                    if (this.field154[var3] == var2.field970) {
                        this.field171[var3] = var2.field972;
                        if (var2.field972 == null) {
                            this.field154[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field974 == 93 && this.field234.method575((byte) -93, var2.field970)) {
                class3.method11(new class31(var2.field972, 8), this.field234, (byte) 36);
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II[B)Z")
    public final boolean method150(int arg0, int arg1, byte[] arg2) {
        while (arg1 >= 0) {
            this.field175.method296(96);
        }
        if (arg2 == null) {
            return true;
        } else {
            return signlink.wavesave(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)V")
    public final void method151(int arg0, int arg1) {
        this.field235 += arg1;
        signlink.wavevol = arg0;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LTNOPEJNZ;I)V")
    public final void method152(class63 arg0, int arg1) {
        int var3 = 0 / arg1;
        int var4 = arg0.field1529;
        if ((var4 < 1 || var4 > 100) && (var4 < 701 || var4 > 800)) {
            if (var4 >= 101 && var4 <= 200 || var4 >= 801 && var4 <= 900) {
                int var6 = this.field309;
                if (this.field310 != 2) {
                    var6 = 0;
                }
                if (var4 > 800) {
                    var4 -= 701;
                } else {
                    var4 -= 101;
                }
                if (var4 >= var6) {
                    arg0.field1545 = "";
                    arg0.field1528 = 0;
                } else {
                    if (this.field507[var4] == 0) {
                        arg0.field1545 = "@red@Offline";
                    } else if (this.field507[var4] == field423) {
                        arg0.field1545 = "@gre@World-" + (this.field507[var4] - 9);
                    } else {
                        arg0.field1545 = "@yel@World-" + (this.field507[var4] - 9);
                    }
                    arg0.field1528 = 1;
                }
            } else if (var4 == 203) {
                int var7 = this.field309;
                if (this.field310 != 2) {
                    var7 = 0;
                }
                arg0.field1512 = var7 * 15 + 20;
                if (arg0.field1512 <= arg0.field1524) {
                    arg0.field1512 = arg0.field1524 + 1;
                }
            } else if (var4 >= 401 && var4 <= 500) {
                var4 -= 401;
                if (var4 == 0 && this.field310 == 0) {
                    arg0.field1545 = "Loading ignore list";
                    arg0.field1528 = 0;
                } else if (var4 == 1 && this.field310 == 0) {
                    arg0.field1545 = "Please wait...";
                    arg0.field1528 = 0;
                } else {
                    int var8 = this.field413;
                    if (this.field310 == 0) {
                        var8 = 0;
                    }
                    if (var4 >= var8) {
                        arg0.field1545 = "";
                        arg0.field1528 = 0;
                    } else {
                        arg0.field1545 = class70.method580((byte) 86, class70.method577(this.field420[var4], -642));
                        arg0.field1528 = 1;
                    }
                }
            } else if (var4 == 503) {
                arg0.field1512 = this.field413 * 15 + 20;
                if (arg0.field1512 <= arg0.field1524) {
                    arg0.field1512 = arg0.field1524 + 1;
                }
            } else if (var4 == 327) {
                arg0.field1531 = 150;
                arg0.field1532 = (int) (Math.sin((double) field271 / 40.0D) * 256.0D) & 2047;
                if (this.field228) {
                    for (int var9 = 0; var9 < 7; ++var9) {
                        int var16 = this.field124[var9];
                        if (var16 >= 0 && !class13.field632[var16].method215(false)) {
                            return;
                        }
                    }
                    this.field228 = false;
                    class59[] var10 = new class59[7];
                    int var11 = 0;
                    for (int var12 = 0; var12 < 7; ++var12) {
                        int var15 = this.field124[var12];
                        if (var15 >= 0) {
                            var10[var11++] = class13.field632[var15].method216(23345);
                        }
                    }
                    class59 var13 = new class59(var11, var10, this.field387);
                    for (int var14 = 0; var14 < 5; ++var14) {
                        if (this.field199[var14] != 0) {
                            var13.method468(field316[var14][0], field316[var14][this.field199[var14]]);
                            if (var14 == 1) {
                                var13.method468(field464[0], field464[this.field199[var14]]);
                            }
                        }
                    }
                    var13.method461(this.field373);
                    var13.method462(class36.field953[field454.field1202].field955[0], this.field198);
                    var13.method471(64, 850, -30, -50, -30, true);
                    arg0.field1487 = 5;
                    arg0.field1488 = 0;
                    class63.method496(5, true, 0, var13);
                }
            } else if (var4 == 324) {
                if (this.field371 == null) {
                    this.field371 = arg0.field1549;
                    this.field372 = arg0.field1501;
                }
                if (this.field481) {
                    arg0.field1549 = this.field372;
                } else {
                    arg0.field1549 = this.field371;
                }
            } else if (var4 == 325) {
                if (this.field371 == null) {
                    this.field371 = arg0.field1549;
                    this.field372 = arg0.field1501;
                }
                if (this.field481) {
                    arg0.field1549 = this.field371;
                } else {
                    arg0.field1549 = this.field372;
                }
            } else if (var4 == 600) {
                arg0.field1545 = this.field318;
                if (field271 % 20 < 10) {
                    arg0.field1545 = arg0.field1545 + "|";
                } else {
                    arg0.field1545 = arg0.field1545 + " ";
                }
            } else {
                if (var4 == 613) {
                    if (this.field479 >= 1) {
                        if (this.field317) {
                            arg0.field1554 = 16711680;
                            arg0.field1545 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg0.field1554 = 16777215;
                            arg0.field1545 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg0.field1545 = "";
                    }
                }
                if (var4 == 650 || var4 == 655) {
                    if (this.field326 != 0) {
                        String var17;
                        if (this.field388 == 0) {
                            var17 = "earlier today";
                        } else if (this.field388 == 1) {
                            var17 = "yesterday";
                        } else {
                            var17 = this.field388 + " days ago";
                        }
                        arg0.field1545 = "You last logged in " + var17 + " from: " + signlink.dns;
                    } else {
                        arg0.field1545 = "";
                    }
                }
                if (var4 == 651) {
                    if (this.field465 == 0) {
                        arg0.field1545 = "0 unread messages";
                        arg0.field1554 = 16776960;
                    }
                    if (this.field465 == 1) {
                        arg0.field1545 = "1 unread message";
                        arg0.field1554 = 65280;
                    }
                    if (this.field465 > 1) {
                        arg0.field1545 = this.field465 + " unread messages";
                        arg0.field1554 = 65280;
                    }
                }
                if (var4 == 652) {
                    if (this.field430 == 201) {
                        if (this.field222 == 1) {
                            arg0.field1545 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg0.field1545 = "";
                        }
                    } else if (this.field430 == 200) {
                        arg0.field1545 = "You have not yet set any password recovery questions.";
                    } else {
                        String var18;
                        if (this.field430 == 0) {
                            var18 = "Earlier today";
                        } else if (this.field430 == 1) {
                            var18 = "Yesterday";
                        } else {
                            var18 = this.field430 + " days ago";
                        }
                        arg0.field1545 = var18 + " you changed your recovery questions";
                    }
                }
                if (var4 == 653) {
                    if (this.field430 == 201) {
                        if (this.field222 == 1) {
                            arg0.field1545 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg0.field1545 = "";
                        }
                    } else if (this.field430 == 200) {
                        arg0.field1545 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg0.field1545 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var4 == 654) {
                    if (this.field430 == 201) {
                        if (this.field222 == 1) {
                            arg0.field1545 = "@whi@this world but member benefits are unavailable whilst here.";
                        } else {
                            arg0.field1545 = "";
                        }
                    } else if (this.field430 == 200) {
                        arg0.field1545 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg0.field1545 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var4 == 1 && this.field310 == 0) {
            arg0.field1545 = "Loading friend list";
            arg0.field1528 = 0;
        } else if (var4 == 1 && this.field310 == 1) {
            arg0.field1545 = "Connecting to friendserver";
            arg0.field1528 = 0;
        } else if (var4 == 2 && this.field310 != 2) {
            arg0.field1545 = "Please wait...";
            arg0.field1528 = 0;
        } else {
            int var5 = this.field309;
            if (this.field310 != 2) {
                var5 = 0;
            }
            if (var4 > 700) {
                var4 -= 601;
            } else {
                --var4;
            }
            if (var4 >= var5) {
                arg0.field1545 = "";
                arg0.field1528 = 0;
            } else {
                arg0.field1545 = this.field340[var4];
                arg0.field1528 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method153(byte arg0) {
        this.field451 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field543) {
                ++this.field394;
                this.method126(29434);
                this.method126(29434);
                this.method156(4);
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
                } catch (Exception var11) {
                }
            }
        } catch (Exception var12) {
        }
        this.field451 = false;
        if (arg0 == 0) {
            boolean var9 = false;
        } else {
            for (int var10 = 1; var10 > 0; ++var10) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LJHKSAGUC;II)V")
    public final void method154(class31 arg0, int arg1, int arg2) {
        this.field235 += arg1;
        if (arg2 == 189) {
            int var4 = arg0.method326((byte) -15);
            int var5 = var4 >> 2;
            int var6 = var4 & 3;
            int var7 = this.field231[var5];
            int var8 = arg0.method325(-35277);
            int var9 = (var8 >> 4 & 7) + this.field466;
            int var10 = (var8 & 7) + this.field467;
            int var11 = arg0.method335(true);
            if (var9 >= 0 && var10 >= 0 && var9 < 103 && var10 < 103) {
                int var12 = this.field389[this.field146][var9][var10];
                int var13 = this.field389[this.field146][var9 + 1][var10];
                int var14 = this.field389[this.field146][var9 + 1][var10 + 1];
                int var15 = this.field389[this.field146][var9][var10 + 1];
                if (var7 == 0) {
                    class49 var16 = this.field521.method526(var10, var9, -19900, this.field146);
                    if (var16 != null) {
                        int var17 = var16.field1105 >> 14 & 32767;
                        if (var5 == 2) {
                            var16.field1103 = new class23(2, var6 + 4, var13, var17, -611, var11, var15, var14, false, var12);
                            var16.field1104 = new class23(2, var6 + 1 & 3, var13, var17, -611, var11, var15, var14, false, var12);
                        } else {
                            var16.field1103 = new class23(var5, var6, var13, var17, -611, var11, var15, var14, false, var12);
                        }
                    }
                }
                if (var7 == 1) {
                    class39 var18 = this.field521.method527(var10, this.field146, var9, 297);
                    if (var18 != null) {
                        var18.field990 = new class23(4, 0, var13, var18.field991 >> 14 & 32767, -611, var11, var15, var14, false, var12);
                    }
                }
                if (var7 == 2) {
                    class40 var19 = this.field521.method528(var10, -163, this.field146, var9);
                    if (var5 == 11) {
                        var5 = 10;
                    }
                    if (var19 != null) {
                        var19.field997 = new class23(var5, var6, var13, var19.field1005 >> 14 & 32767, -611, var11, var15, var14, false, var12);
                    }
                }
                if (var7 == 3) {
                    class57 var20 = this.field521.method529(-870, var9, var10, this.field146);
                    if (var20 != null) {
                        var20.field1245 = new class23(22, var6, var13, var20.field1246 >> 14 & 32767, -611, var11, var15, var14, false, var12);
                    }
                }
            }
        } else if (arg2 == 19) {
            int var21 = arg0.method335(true);
            int var22 = arg0.method336((byte) 87);
            int var23 = arg0.method326((byte) -15);
            int var24 = (var23 >> 4 & 7) + this.field466;
            int var25 = (var23 & 7) + this.field467;
            if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104) {
                class10 var26 = new class10();
                var26.field599 = var21;
                var26.field598 = var22;
                if (this.field496[this.field146][var24][var25] == null) {
                    this.field496[this.field146][var24][var25] = new class48(-392);
                }
                this.field496[this.field146][var24][var25].method390(var26);
                this.method148(var24, var25);
            }
        } else if (arg2 == 78) {
            int var27 = arg0.method335(true);
            int var28 = arg0.method336((byte) 87);
            int var29 = arg0.method336((byte) 87);
            int var30 = arg0.method306();
            int var31 = (var30 >> 4 & 7) + this.field466;
            int var32 = (var30 & 7) + this.field467;
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && this.field401 != var29) {
                class10 var33 = new class10();
                var33.field599 = var28;
                var33.field598 = var27;
                if (this.field496[this.field146][var31][var32] == null) {
                    this.field496[this.field146][var31][var32] = new class48(-392);
                }
                this.field496[this.field146][var31][var32].method390(var33);
                this.method148(var31, var32);
            }
        } else if (arg2 == 32) {
            int var34 = arg0.method306();
            int var35 = (var34 >> 4 & 7) + this.field466;
            int var36 = (var34 & 7) + this.field467;
            int var37 = arg0.method308();
            int var38 = arg0.method308();
            int var39 = arg0.method308();
            if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                class48 var40 = this.field496[this.field146][var35][var36];
                if (var40 != null) {
                    for (class10 var41 = (class10) var40.method393(); var41 != null; var41 = (class10) var40.method395(true)) {
                        if ((var37 & 32767) == var41.field599 && var41.field598 == var38) {
                            var41.field598 = var39;
                            break;
                        }
                    }
                    this.method148(var35, var36);
                }
            }
        } else {
            if (arg2 == 65) {
                int var42 = arg0.method308();
                byte var43 = arg0.method330(false);
                byte var44 = arg0.method329((byte) 57);
                byte var45 = arg0.method329((byte) 57);
                int var46 = arg0.method327(8);
                int var47 = var46 >> 2;
                int var48 = var46 & 3;
                int var49 = this.field231[var47];
                int var50 = arg0.method326((byte) -15);
                int var51 = (var50 >> 4 & 7) + this.field466;
                int var52 = (var50 & 7) + this.field467;
                int var53 = arg0.method335(true);
                int var54 = arg0.method335(true);
                byte var55 = arg0.method330(false);
                int var56 = arg0.method334((byte) -45);
                class21 var57;
                if (this.field401 == var56) {
                    var57 = field454;
                } else {
                    var57 = this.field248[var56];
                }
                if (var57 != null) {
                    class61 var58 = class61.method491(var53);
                    int var59 = this.field389[this.field146][var51][var52];
                    int var60 = this.field389[this.field146][var51 + 1][var52];
                    int var61 = this.field389[this.field146][var51 + 1][var52 + 1];
                    int var62 = this.field389[this.field146][var51][var52 + 1];
                    class59 var63 = var58.method486(var47, var48, var59, var60, var61, var62, -1);
                    if (var63 != null) {
                        this.method63(431, var49, this.field146, var42 + 1, var51, var52, 0, -1, var54 + 1, 0);
                        var57.field717 = field271 + var54;
                        var57.field718 = field271 + var42;
                        var57.field712 = var63;
                        int var64 = var58.field1418;
                        int var65 = var58.field1394;
                        if (var48 == 1 || var48 == 3) {
                            var64 = var58.field1394;
                            var65 = var58.field1418;
                        }
                        var57.field709 = var51 * 128 + var64 * 64;
                        var57.field711 = var52 * 128 + var65 * 64;
                        var57.field710 = this.method173(var57.field711, var57.field709, this.field146, 1);
                        if (var45 > var43) {
                            byte var66 = var45;
                            var45 = var43;
                            var43 = var66;
                        }
                        if (var55 > var44) {
                            byte var67 = var55;
                            var55 = var44;
                            var44 = var67;
                        }
                        var57.field720 = var45 + var51;
                        var57.field722 = var43 + var51;
                        var57.field721 = var52 + var55;
                        var57.field723 = var44 + var52;
                    }
                }
            }
            if (arg2 == 159) {
                int var68 = arg0.method306();
                int var69 = (var68 >> 4 & 7) + this.field466;
                int var70 = (var68 & 7) + this.field467;
                int var71 = arg0.method308();
                int var72 = arg0.method306();
                int var73 = var72 >> 4 & 15;
                int var74 = var72 & 7;
                if (field454.field1200[0] >= var69 - var73 && field454.field1200[0] <= var69 + var73 && field454.field1201[0] >= var70 - var73 && field454.field1201[0] <= var70 + var73 && this.field513 && !field426 && this.field307 < 50) {
                    this.field127[this.field307] = var71;
                    this.field193[this.field307] = var74;
                    this.field417[this.field307] = class50.field1111[var71];
                    ++this.field307;
                }
            }
            if (arg2 == 27) {
                int var75 = arg0.method306();
                int var76 = (var75 >> 4 & 7) + this.field466;
                int var77 = (var75 & 7) + this.field467;
                int var78 = arg0.method326((byte) -15);
                int var79 = var78 >> 2;
                int var80 = var78 & 3;
                int var81 = this.field231[var79];
                int var82 = arg0.method308();
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                    this.method63(431, var81, this.field146, -1, var76, var77, var79, var82, 0, var80);
                }
            } else if (arg2 == 101) {
                int var83 = arg0.method306();
                int var84 = (var83 >> 4 & 7) + this.field466;
                int var85 = (var83 & 7) + this.field467;
                int var86 = arg0.method327(8);
                int var87 = var86 >> 2;
                int var88 = var86 & 3;
                int var89 = this.field231[var87];
                if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
                    this.method63(431, var89, this.field146, -1, var84, var85, var87, -1, 0, var88);
                }
            } else if (arg2 == 183) {
                int var90 = arg0.method306();
                int var91 = (var90 >> 4 & 7) + this.field466;
                int var92 = (var90 & 7) + this.field467;
                int var93 = arg0.method308();
                int var94 = arg0.method306();
                int var95 = arg0.method308();
                if (var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104) {
                    int var96 = var91 * 128 + 64;
                    int var97 = var92 * 128 + 64;
                    class52 var98 = new class52(var97, field271, this.method173(var97, var96, this.field146, 1) - var94, var96, (byte) -112, var93, var95, this.field146);
                    this.field462.method390(var98);
                }
            } else if (arg2 != 4) {
                if (arg2 == 223) {
                    int var105 = arg0.method306();
                    int var106 = (var105 >> 4 & 7) + this.field466;
                    int var107 = (var105 & 7) + this.field467;
                    int var108 = var106 + arg0.method307();
                    int var109 = var107 + arg0.method307();
                    int var110 = arg0.method309();
                    int var111 = arg0.method308();
                    int var112 = arg0.method306() * 4;
                    int var113 = arg0.method306() * 4;
                    int var114 = arg0.method308();
                    int var115 = arg0.method308();
                    int var116 = arg0.method306();
                    int var117 = arg0.method306();
                    if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104 && var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104 && var111 != 65535) {
                        int var118 = var106 * 128 + 64;
                        int var119 = var107 * 128 + 64;
                        int var120 = var108 * 128 + 64;
                        int var121 = var109 * 128 + 64;
                        class25 var122 = new class25(var111, field271 + var114, var118, var110, var117, 0, this.method173(var119, var118, this.field146, 1) - var112, var119, field271 + var115, var113, var116, this.field146);
                        var122.method287(this.method173(var121, var120, this.field146, 1) - var113, var120, var121, field271 + var114, true);
                        this.field230.method390(var122);
                    }
                }
            } else {
                int var99 = arg0.method335(true);
                int var100 = arg0.method326((byte) -15);
                int var101 = (var100 >> 4 & 7) + this.field466;
                int var102 = (var100 & 7) + this.field467;
                if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
                    class48 var103 = this.field496[this.field146][var101][var102];
                    if (var103 != null) {
                        for (class10 var104 = (class10) var103.method393(); var104 != null; var104 = (class10) var103.method395(true)) {
                            if ((var99 & 32767) == var104.field599) {
                                var104.method290();
                                break;
                            }
                        }
                        if (var103.method393() == null) {
                            this.field496[this.field146][var101][var102] = null;
                        }
                        this.method148(var101, var102);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method155(int arg0) {
        byte[] var2 = this.field308.method289("title.dat", (byte[]) null);
        class12 var3 = new class12(var2, this);
        this.field214.method196(true);
        var3.method203(0, 0, false);
        this.field215.method196(true);
        var3.method203(-637, 0, false);
        this.field211.method196(true);
        var3.method203(-128, 0, false);
        this.field212.method196(true);
        var3.method203(-202, -371, false);
        this.field213.method196(true);
        var3.method203(-202, -171, false);
        this.field216.method196(true);
        var3.method203(0, -265, false);
        this.field217.method196(true);
        var3.method203(-562, -265, false);
        this.field218.method196(true);
        var3.method203(-128, -171, false);
        this.field219.method196(true);
        var3.method203(-562, -171, false);
        int[] var4 = new int[var3.field621];
        for (int var5 = 0; var5 < var3.field622; ++var5) {
            for (int var11 = 0; var11 < var3.field621; ++var11) {
                var4[var11] = var3.field620[var3.field621 * var5 + (var3.field621 - var11 - 1)];
            }
            for (int var12 = 0; var12 < var3.field621; ++var12) {
                var3.field620[var3.field621 * var5 + var12] = var4[var12];
            }
        }
        this.field214.method196(true);
        var3.method203(382, 0, false);
        this.field215.method196(true);
        var3.method203(-255, 0, false);
        this.field211.method196(true);
        var3.method203(254, 0, false);
        this.field212.method196(true);
        var3.method203(180, -371, false);
        this.field213.method196(true);
        var3.method203(180, -171, false);
        this.field216.method196(true);
        var3.method203(382, -265, false);
        this.field217.method196(true);
        var3.method203(-180, -265, false);
        this.field218.method196(true);
        var3.method203(254, -171, false);
        this.field219.method196(true);
        var3.method203(-180, -171, false);
        class12 var6 = new class12(this.field308, "logo", 0);
        this.field211.method196(true);
        var6.method205(18, 382 - var6.field621 / 2 - 128, (byte) 122);
        Object var7 = null;
        Object var8 = null;
        int var9 = 76 / arg0;
        Object var10 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method156(int arg0) {
        if (arg0 != 4) {
            field415 = !field415;
        }
        short var2 = 256;
        if (this.field551 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field551 > 768) {
                    this.field468[var3] = this.method84(this.field470[var3], (byte) -45, this.field469[var3], 1024 - this.field551);
                } else if (this.field551 > 256) {
                    this.field468[var3] = this.field470[var3];
                } else {
                    this.field468[var3] = this.method84(this.field469[var3], (byte) -45, this.field470[var3], 256 - this.field551);
                }
            }
        } else if (this.field552 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field552 > 768) {
                    this.field468[var4] = this.method84(this.field471[var4], (byte) -45, this.field469[var4], 1024 - this.field552);
                } else if (this.field552 > 256) {
                    this.field468[var4] = this.field471[var4];
                } else {
                    this.field468[var4] = this.method84(this.field469[var4], (byte) -45, this.field471[var4], 256 - this.field552);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field468[var5] = this.field469[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field214.field591[var6] = this.field403.field620[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field325[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field262[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field468[var26];
                    int var30 = this.field214.field591[var8];
                    this.field214.field591[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field214.method197(super.field95, 0, true, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field215.field591[var10] = this.field404.field620[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field325[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field262[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field468[var18];
                    int var22 = this.field215.field591[var16];
                    this.field215.field591[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field215.method197(super.field95, 0, true, 637);
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method157(int arg0) {
        if (this.field167 == 0) {
            this.field450[0] = "Cancel";
            this.field474[0] = 1540;
            while (arg0 >= 0) {
                for (int var9 = 1; var9 > 0; ++var9) {
                }
            }
            this.field327 = 1;
            this.method97(110);
            this.field346 = 0;
            if (super.field103 > 4 && super.field104 > 4 && super.field103 < 516 && super.field104 < 338) {
                if (this.field245 != -1) {
                    this.method95(0, super.field103, class63.field1490[this.field245], true, 4, super.field104, 4);
                } else {
                    this.method125(this.field437);
                }
            }
            if (this.field346 != this.field161) {
                this.field161 = this.field346;
            }
            this.field346 = 0;
            if (super.field103 > 553 && super.field104 > 205 && super.field103 < 743 && super.field104 < 466) {
                if (this.field270 != -1) {
                    this.method95(0, super.field103, class63.field1490[this.field270], true, 553, super.field104, 205);
                } else if (this.field392[this.field405] != -1) {
                    this.method95(0, super.field103, class63.field1490[this.field392[this.field405]], true, 553, super.field104, 205);
                }
            }
            if (this.field476 != this.field346) {
                this.field494 = true;
                this.field476 = this.field346;
            }
            this.field346 = 0;
            if (super.field103 > 17 && super.field104 > 357 && super.field103 < 496 && super.field104 < 453) {
                if (this.field297 != -1) {
                    this.method95(0, super.field103, class63.field1490[this.field297], true, 17, super.field104, 357);
                } else if (super.field104 < 434 && super.field103 < 426) {
                    this.method79(super.field103 - 17, 45905, super.field104 - 357);
                }
            }
            if (this.field297 != -1 && this.field346 != this.field174) {
                this.field586 = true;
                this.field174 = this.field346;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field327 - 1; ++var3) {
                    if (this.field474[var3] < 1000 && this.field474[var3 + 1] > 1000) {
                        String var4 = this.field450[var3];
                        this.field450[var3] = this.field450[var3 + 1];
                        this.field450[var3 + 1] = var4;
                        int var5 = this.field474[var3];
                        this.field474[var3] = this.field474[var3 + 1];
                        this.field474[var3 + 1] = var5;
                        int var6 = this.field472[var3];
                        this.field472[var3] = this.field472[var3 + 1];
                        this.field472[var3 + 1] = var6;
                        int var7 = this.field473[var3];
                        this.field473[var3] = this.field473[var3 + 1];
                        this.field473[var3 + 1] = var7;
                        int var8 = this.field475[var3];
                        this.field475[var3] = this.field475[var3 + 1];
                        this.field475[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method55(int arg0) {
        if (!this.field585 && !this.field281 && !this.field579) {
            ++field304;
            if (arg0 == -31159) {
                if (!this.field295) {
                    this.method130(false, (byte) 68);
                } else {
                    this.method167(8);
                }
                this.field259 = 0;
            }
        } else {
            this.method188(this.field428);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method158(boolean arg0) {
        this.field361 = 0;
        for (int var2 = -1; var2 < this.field441 + this.field249; ++var2) {
            class56 var19;
            if (var2 == -1) {
                var19 = field454;
            } else if (var2 < this.field249) {
                var19 = this.field248[this.field250[var2]];
            } else {
                var19 = this.field440[this.field442[var2 - this.field249]];
            }
            if (var19 != null && var19.method244(true)) {
                if (var19 instanceof class44) {
                    class58 var20 = ((class44) var19).field1080;
                    if (var20.field1276 != null) {
                        var20 = var20.method448(true);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field249) {
                    class58 var24 = ((class44) var19).field1080;
                    if (var24.field1266 >= 0 && var24.field1266 < this.field508.length) {
                        this.method69(45917, var19.field1220 + 15, var19);
                        if (this.field514 > -1) {
                            this.field508[var24.field1266].method205(this.field515 - 30, this.field514 - 12, (byte) 122);
                        }
                    }
                    if (this.field141 == 1 && this.field442[var2 - this.field249] == this.field386 && field271 % 20 < 10) {
                        this.method69(45917, var19.field1220 + 15, var19);
                        if (this.field514 > -1) {
                            this.field508[2].method205(this.field515 - 28, this.field514 - 12, (byte) 122);
                        }
                    }
                } else {
                    int var21 = 30;
                    class21 var22 = (class21) var19;
                    if (var22.field702 != 0) {
                        this.method69(45917, var19.field1220 + 15, var19);
                        if (this.field514 > -1) {
                            for (int var23 = 0; var23 < 8; ++var23) {
                                if ((var22.field702 & 1 << var23) != 0) {
                                    this.field508[var23].method205(this.field515 - var21, this.field514 - 12, (byte) 122);
                                    var21 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field141 == 10 && this.field250[var2] == this.field452) {
                        this.method69(45917, var19.field1220 + 15, var19);
                        if (this.field514 > -1) {
                            this.field508[7].method205(this.field515 - var21, this.field514 - 12, (byte) 122);
                        }
                    }
                }
                if (var19.field1189 != null && (var2 >= this.field249 || this.field126 == 0 || this.field126 == 3 || this.field126 == 1 && this.method174(((class21) var19).field698, -39869))) {
                    this.method69(45917, var19.field1220, var19);
                    if (this.field514 > -1 && this.field361 < this.field362) {
                        this.field366[this.field361] = this.field358.method421(510, var19.field1189) / 2;
                        this.field365[this.field361] = this.field358.field1170;
                        this.field363[this.field361] = this.field514;
                        this.field364[this.field361] = this.field515;
                        this.field367[this.field361] = var19.field1221;
                        this.field368[this.field361] = var19.field1212;
                        this.field369[this.field361] = var19.field1218;
                        this.field370[this.field361++] = var19.field1189;
                        if (this.field447 == 0 && var19.field1212 >= 1 && var19.field1212 <= 3) {
                            this.field365[this.field361] += 10;
                            this.field364[this.field361] += 5;
                        }
                        if (this.field447 == 0 && var19.field1212 == 4) {
                            this.field366[this.field361] = 60;
                        }
                        if (this.field447 == 0 && var19.field1212 == 5) {
                            this.field365[this.field361] += 5;
                        }
                    }
                }
                if (var19.field1225 > field271) {
                    this.method69(45917, var19.field1220 + 15, var19);
                    if (this.field514 > -1) {
                        int var25 = var19.field1226 * 30 / var19.field1227;
                        if (var25 > 30) {
                            var25 = 30;
                        }
                        class19.method235(false, 5, var25, this.field515 - 3, 65280, this.field514 - 15);
                        class19.method235(false, 5, 30 - var25, this.field515 - 3, 16711680, this.field514 - 15 + var25);
                    }
                }
                for (int var26 = 0; var26 < 4; ++var26) {
                    if (var19.field1230[var26] > field271) {
                        this.method69(45917, var19.field1220 / 2, var19);
                        if (this.field514 > -1) {
                            if (var26 == 1) {
                                this.field515 -= 20;
                            }
                            if (var26 == 2) {
                                this.field514 -= 15;
                                this.field515 -= 10;
                            }
                            if (var26 == 3) {
                                this.field514 += 15;
                                this.field515 -= 10;
                            }
                            this.field492[var19.field1229[var26]].method205(this.field515 - 12, this.field514 - 12, (byte) 122);
                            this.field356.method418(this.field515 + 4, this.field514, String.valueOf(var19.field1228[var26]), 0, 5);
                            this.field356.method418(this.field515 + 3, this.field514 - 1, String.valueOf(var19.field1228[var26]), 16777215, 5);
                        }
                    }
                }
            }
        }
        if (!arg0) {
            this.field236 = this.field254.method306();
        }
        for (int var3 = 0; var3 < this.field361; ++var3) {
            int var4 = this.field363[var3];
            int var5 = this.field364[var3];
            int var6 = this.field366[var3];
            int var7 = this.field365[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field364[var18] - this.field365[var18] && var5 - var7 < this.field364[var18] + 2 && var4 - var6 < this.field366[var18] + this.field363[var18] && var4 + var6 > this.field363[var18] - this.field366[var18] && this.field364[var18] - this.field365[var18] < var5) {
                        var5 = this.field364[var18] - this.field365[var18];
                        var8 = true;
                    }
                }
            }
            this.field514 = this.field363[var3];
            this.field515 = this.field364[var3] = var5;
            String var9 = this.field370[var3];
            if (this.field447 == 0) {
                int var10 = 16776960;
                if (this.field367[var3] < 6) {
                    var10 = this.field411[this.field367[var3]];
                }
                if (this.field367[var3] == 6) {
                    var10 = this.field147 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field367[var3] == 7) {
                    var10 = this.field147 % 20 < 10 ? 255 : 65535;
                }
                if (this.field367[var3] == 8) {
                    var10 = this.field147 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field367[var3] == 9) {
                    int var11 = 150 - this.field369[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field367[var3] == 10) {
                    int var12 = 150 - this.field369[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field367[var3] == 11) {
                    int var13 = 150 - this.field369[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field368[var3] == 0) {
                    this.field358.method418(this.field515 + 1, this.field514, var9, 0, 5);
                    this.field358.method418(this.field515, this.field514, var9, var10, 5);
                }
                if (this.field368[var3] == 1) {
                    this.field358.method423(0, this.field515 + 1, var9, this.field147, this.field514, false);
                    this.field358.method423(var10, this.field515, var9, this.field147, this.field514, false);
                }
                if (this.field368[var3] == 2) {
                    this.field358.method424(this.field515 + 1, this.field514, 0, this.field147, 0, var9);
                    this.field358.method424(this.field515, this.field514, var10, this.field147, 0, var9);
                }
                if (this.field368[var3] == 3) {
                    this.field358.method425(0, this.field514, this.field515 + 1, 150 - this.field369[var3], this.field147, var9, 5);
                    this.field358.method425(var10, this.field514, this.field515, 150 - this.field369[var3], this.field147, var9, 5);
                }
                if (this.field368[var3] == 4) {
                    int var14 = this.field358.method421(510, var9);
                    int var15 = (150 - this.field369[var3]) * (var14 + 100) / 150;
                    class19.method232(this.field514 + 50, this.field514 - 50, (byte) -87, 334, 0);
                    this.field358.method422(0, (byte) 2, var9, this.field514 + 50 - var15, this.field515 + 1);
                    this.field358.method422(var10, (byte) 2, var9, this.field514 + 50 - var15, this.field515);
                    class19.method231(false);
                }
                if (this.field368[var3] == 5) {
                    int var16 = 150 - this.field369[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class19.method232(512, 0, (byte) -87, this.field515 + 5, this.field515 - this.field358.field1170 - 1);
                    this.field358.method418(this.field515 + 1 + var17, this.field514, var9, 0, 5);
                    this.field358.method418(this.field515 + var17, this.field514, var9, var10, 5);
                    class19.method231(false);
                }
            } else {
                this.field358.method418(this.field515 + 1, this.field514, var9, 0, 5);
                this.field358.method418(this.field515, this.field514, var9, 16776960, 5);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILJHKSAGUC;B)V")
    private final void method159(int arg0, class31 arg1, byte arg2) {
        while (true) {
            if (arg1.field902 + 10 < arg0 * 8) {
                int var4 = arg1.method317((byte) 9, 11);
                if (var4 != 2047) {
                    if (this.field248[var4] == null) {
                        this.field248[var4] = new class21();
                        if (this.field253[var4] != null) {
                            this.field248[var4].method243(this.field253[var4], 809);
                        }
                    }
                    this.field250[this.field249++] = var4;
                    class21 var5 = this.field248[var4];
                    var5.field1217 = field271;
                    int var6 = arg1.method317((byte) 9, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg1.method317((byte) 9, 1);
                    int var8 = arg1.method317((byte) 9, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = arg1.method317((byte) 9, 1);
                    if (var9 == 1) {
                        this.field252[this.field251++] = var4;
                    }
                    var5.method440(field454.field1201[0] + var6, var7 == 1, field454.field1200[0] + var8, 9);
                    continue;
                }
            }
            arg1.method318((byte) -66);
            if (arg2 != 1) {
                this.method52();
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method160(int arg0) {
        if (arg0 != 0) {
            this.field175.method296(132);
        }
        for (int var2 = 0; var2 < this.field441; ++var2) {
            int var3 = this.field442[var2];
            class44 var4 = this.field440[var3];
            if (var4 != null) {
                this.method161(var4, var4.field1080.field1250, 40656);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LQQAAMZPI;II)V")
    public final void method161(class56 arg0, int arg1, int arg2) {
        if (arg0.field1214 < 128 || arg0.field1215 < 128 || arg0.field1214 >= 13184 || arg0.field1215 >= 13184) {
            arg0.field1231 = -1;
            arg0.field1184 = -1;
            arg0.field1195 = 0;
            arg0.field1196 = 0;
            arg0.field1214 = arg0.field1200[0] * 128 + arg0.field1199 * 64;
            arg0.field1215 = arg0.field1201[0] * 128 + arg0.field1199 * 64;
            arg0.method441(900);
        }
        if (field454 == arg0 && (arg0.field1214 < 1536 || arg0.field1215 < 1536 || arg0.field1214 >= 11776 || arg0.field1215 >= 11776)) {
            arg0.field1231 = -1;
            arg0.field1184 = -1;
            arg0.field1195 = 0;
            arg0.field1196 = 0;
            arg0.field1214 = arg0.field1200[0] * 128 + arg0.field1199 * 64;
            arg0.field1215 = arg0.field1201[0] * 128 + arg0.field1199 * 64;
            arg0.method441(900);
        }
        if (arg0.field1195 > field271) {
            this.method162((byte) 44, arg0);
        } else if (arg0.field1196 >= field271) {
            this.method163(this.field294, arg0);
        } else {
            this.method164((byte) -65, arg0);
        }
        this.method165(0, arg0);
        if (arg2 != 40656) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        this.method166(arg0, 131);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLQQAAMZPI;)V")
    public final void method162(byte arg0, class56 arg1) {
        int var3 = arg1.field1195 - field271;
        if (arg0 == 44) {
            int var4 = arg1.field1199 * 64 + arg1.field1191 * 128;
            int var5 = arg1.field1199 * 64 + arg1.field1193 * 128;
            arg1.field1214 += (var4 - arg1.field1214) / var3;
            arg1.field1215 += (var5 - arg1.field1215) / var3;
            arg1.field1213 = 0;
            if (arg1.field1197 == 0) {
                arg1.field1190 = 1024;
            }
            if (arg1.field1197 == 1) {
                arg1.field1190 = 1536;
            }
            if (arg1.field1197 == 2) {
                arg1.field1190 = 0;
            }
            if (arg1.field1197 == 3) {
                arg1.field1190 = 512;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLQQAAMZPI;)V")
    public final void method163(boolean arg0, class56 arg1) {
        if (field271 == arg1.field1196 || arg1.field1231 == -1 || arg1.field1234 != 0 || arg1.field1233 + 1 > class36.field953[arg1.field1231].method361(this.field242, arg1.field1232)) {
            int var3 = arg1.field1196 - arg1.field1195;
            int var4 = field271 - arg1.field1195;
            int var5 = arg1.field1199 * 64 + arg1.field1191 * 128;
            int var6 = arg1.field1199 * 64 + arg1.field1193 * 128;
            int var7 = arg1.field1199 * 64 + arg1.field1192 * 128;
            int var8 = arg1.field1199 * 64 + arg1.field1194 * 128;
            arg1.field1214 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field1215 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field1213 = 0;
        if (arg1.field1197 == 0) {
            arg1.field1190 = 1024;
        }
        if (arg1.field1197 == 1) {
            arg1.field1190 = 1536;
        }
        if (arg1.field1197 == 2) {
            arg1.field1190 = 0;
        }
        if (arg1.field1197 == 3) {
            arg1.field1190 = 512;
        }
        arg1.field1216 = arg1.field1190;
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BLQQAAMZPI;)V")
    public final void method164(byte arg0, class56 arg1) {
        arg1.field1207 = arg1.field1202;
        if (arg1.field1198 == 0) {
            arg1.field1213 = 0;
        } else {
            if (arg1.field1231 != -1 && arg1.field1234 == 0) {
                class36 var3 = class36.field953[arg1.field1231];
                if (arg1.field1210 > 0 && var3.field965 == 0) {
                    ++arg1.field1213;
                    return;
                }
                if (arg1.field1210 <= 0 && var3.field966 == 0) {
                    ++arg1.field1213;
                    return;
                }
            }
            int var4 = arg1.field1214;
            int var5 = arg1.field1215;
            int var6 = arg1.field1200[arg1.field1198 - 1] * 128 + arg1.field1199 * 64;
            int var7 = arg1.field1201[arg1.field1198 - 1] * 128 + arg1.field1199 * 64;
            if (arg0 != -65) {
                field125 = this.field284.method589();
            }
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field1190 = 1280;
                    } else if (var5 > var7) {
                        arg1.field1190 = 1792;
                    } else {
                        arg1.field1190 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field1190 = 768;
                    } else if (var5 > var7) {
                        arg1.field1190 = 256;
                    } else {
                        arg1.field1190 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field1190 = 1024;
                } else {
                    arg1.field1190 = 0;
                }
                int var8 = arg1.field1190 - arg1.field1216 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field1238;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field1237;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field1240;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field1239;
                }
                if (var9 == -1) {
                    var9 = arg1.field1237;
                }
                arg1.field1207 = var9;
                int var10 = 4;
                if (arg1.field1216 != arg1.field1190 && arg1.field1223 == -1 && arg1.field1241 != 0) {
                    var10 = 2;
                }
                if (arg1.field1198 > 2) {
                    var10 = 6;
                }
                if (arg1.field1198 > 3) {
                    var10 = 8;
                }
                if (arg1.field1213 > 0 && arg1.field1198 > 1) {
                    var10 = 8;
                    --arg1.field1213;
                }
                if (arg1.field1222[arg1.field1198 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field1237 == arg1.field1207 && arg1.field1224 != -1) {
                    arg1.field1207 = arg1.field1224;
                }
                if (var4 < var6) {
                    arg1.field1214 += var10;
                    if (arg1.field1214 > var6) {
                        arg1.field1214 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field1214 -= var10;
                    if (arg1.field1214 < var6) {
                        arg1.field1214 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field1215 += var10;
                    if (arg1.field1215 > var7) {
                        arg1.field1215 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field1215 -= var10;
                    if (arg1.field1215 < var7) {
                        arg1.field1215 = var7;
                    }
                }
                if (arg1.field1214 == var6 && arg1.field1215 == var7) {
                    --arg1.field1198;
                    if (arg1.field1210 > 0) {
                        --arg1.field1210;
                        return;
                    }
                }
            } else {
                arg1.field1214 = var6;
                arg1.field1215 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILQQAAMZPI;)V")
    public final void method165(int arg0, class56 arg1) {
        this.field235 += arg0;
        if (arg1.field1241 != 0) {
            if (arg1.field1223 != -1 && arg1.field1223 < 32768) {
                class44 var3 = this.field440[arg1.field1223];
                if (var3 != null) {
                    int var4 = arg1.field1214 - var3.field1214;
                    int var5 = arg1.field1215 - var3.field1215;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field1190 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field1223 >= 32768) {
                int var6 = arg1.field1223 - 32768;
                if (this.field401 == var6) {
                    var6 = this.field247;
                }
                class21 var7 = this.field248[var6];
                if (var7 != null) {
                    int var8 = arg1.field1214 - var7.field1214;
                    int var9 = arg1.field1215 - var7.field1215;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field1190 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field1205 != 0 || arg1.field1206 != 0) && (arg1.field1198 == 0 || arg1.field1213 > 0)) {
                int var10 = arg1.field1214 - (arg1.field1205 - this.field570 - this.field570) * 64;
                int var11 = arg1.field1215 - (arg1.field1206 - this.field571 - this.field571) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field1190 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field1205 = 0;
                arg1.field1206 = 0;
            }
            int var12 = arg1.field1190 - arg1.field1216 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field1241 && var12 <= 2048 - arg1.field1241) {
                    if (var12 > 1024) {
                        arg1.field1216 -= arg1.field1241;
                    } else {
                        arg1.field1216 += arg1.field1241;
                    }
                } else {
                    arg1.field1216 = arg1.field1190;
                }
                arg1.field1216 &= 2047;
                if (arg1.field1207 == arg1.field1202 && arg1.field1216 != arg1.field1190) {
                    if (arg1.field1203 != -1) {
                        arg1.field1207 = arg1.field1203;
                        return;
                    }
                    arg1.field1207 = arg1.field1237;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LQQAAMZPI;I)V")
    public final void method166(class56 arg0, int arg1) {
        if (arg1 <= 0) {
            this.field496 = null;
        }
        arg0.field1236 = false;
        if (arg0.field1207 != -1) {
            class36 var3 = class36.field953[arg0.field1207];
            ++arg0.field1209;
            if (arg0.field1208 < var3.field954 && arg0.field1209 > var3.method361(this.field242, arg0.field1208)) {
                arg0.field1209 = 0;
                ++arg0.field1208;
            }
            if (arg0.field1208 >= var3.field954) {
                arg0.field1209 = 0;
                arg0.field1208 = 0;
            }
        }
        if (arg0.field1184 != -1 && field271 >= arg0.field1187) {
            if (arg0.field1185 < 0) {
                arg0.field1185 = 0;
            }
            class36 var4 = class64.field1557[arg0.field1184].field1561;
            ++arg0.field1186;
            while (arg0.field1185 < var4.field954 && arg0.field1186 > var4.method361(this.field242, arg0.field1185)) {
                arg0.field1186 -= var4.method361(this.field242, arg0.field1185);
                ++arg0.field1185;
            }
            if (arg0.field1185 >= var4.field954 && (arg0.field1185 < 0 || arg0.field1185 >= var4.field954)) {
                arg0.field1184 = -1;
            }
        }
        if (arg0.field1231 != -1 && arg0.field1234 <= 1) {
            class36 var5 = class36.field953[arg0.field1231];
            if (var5.field965 == 1 && arg0.field1210 > 0 && arg0.field1195 <= field271 && arg0.field1196 < field271) {
                arg0.field1234 = 1;
                return;
            }
        }
        if (arg0.field1231 != -1 && arg0.field1234 == 0) {
            class36 var6 = class36.field953[arg0.field1231];
            ++arg0.field1233;
            while (arg0.field1232 < var6.field954 && arg0.field1233 > var6.method361(this.field242, arg0.field1232)) {
                arg0.field1233 -= var6.method361(this.field242, arg0.field1232);
                ++arg0.field1232;
            }
            if (arg0.field1232 >= var6.field954) {
                arg0.field1232 -= var6.field958;
                ++arg0.field1235;
                if (arg0.field1235 >= var6.field964) {
                    arg0.field1231 = -1;
                }
                if (arg0.field1232 < 0 || arg0.field1232 >= var6.field954) {
                    arg0.field1231 = -1;
                }
            }
            arg0.field1236 = var6.field960;
        }
        if (arg0.field1234 > 0) {
            --arg0.field1234;
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method167(int arg0) {
        if (this.field505) {
            this.field505 = false;
            this.field131.method197(super.field95, 4, true, 0);
            this.field132.method197(super.field95, 357, true, 0);
            this.field133.method197(super.field95, 4, true, 722);
            this.field134.method197(super.field95, 205, true, 743);
            this.field135.method197(super.field95, 0, true, 0);
            this.field136.method197(super.field95, 4, true, 516);
            this.field137.method197(super.field95, 205, true, 516);
            this.field138.method197(super.field95, 357, true, 496);
            this.field139.method197(super.field95, 338, true, 0);
            this.field494 = true;
            this.field586 = true;
            this.field292 = true;
            this.field192 = true;
            if (this.field275 != 2) {
                this.field266.method197(super.field95, 4, true, 4);
                this.field265.method197(super.field95, 4, true, 550);
            }
        }
        if (this.field275 == 2) {
            this.method109(-830);
        }
        if (this.field305 && this.field179 == 1) {
            this.field494 = true;
        }
        if (this.field270 != -1) {
            boolean var2 = this.method193(this.field270, -63, this.field121);
            if (var2) {
                this.field494 = true;
            }
        }
        if (this.field549 == 2) {
            this.field494 = true;
        }
        if (this.field167 == 2) {
            this.field494 = true;
        }
        if (this.field494) {
            this.method86(true);
            this.field494 = false;
        }
        if (this.field297 == -1) {
            this.field287.field1546 = this.field158 - this.field223 - 77;
            if (super.field103 > 448 && super.field103 < 560 && super.field104 > 332) {
                this.method180(false, 77, this.field158, 463, super.field103 - 17, -15719, this.field287, super.field104 - 357, 0);
            }
            int var3 = this.field158 - 77 - this.field287.field1546;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field158 - 77) {
                var3 = this.field158 - 77;
            }
            if (this.field223 != var3) {
                this.field223 = var3;
                this.field586 = true;
            }
        }
        if (this.field297 != -1) {
            boolean var4 = this.method193(this.field297, -63, this.field121);
            if (var4) {
                this.field586 = true;
            }
        }
        if (this.field549 == 3) {
            this.field586 = true;
        }
        if (this.field167 == 3) {
            this.field586 = true;
        }
        if (this.field164 != null) {
            this.field586 = true;
        }
        if (this.field305 && this.field179 == 2) {
            this.field586 = true;
        }
        if (this.field586) {
            this.method129((byte) 40);
            this.field586 = false;
        }
        if (this.field275 == 2) {
            this.method83(44975);
            this.field265.method197(super.field95, 4, true, 550);
        }
        if (this.field229 != -1) {
            this.field292 = true;
        }
        if (this.field292) {
            if (this.field229 != -1 && this.field405 == this.field229) {
                this.field229 = -1;
                this.field175.method295(86, 1);
                this.field175.method296(this.field405);
            }
            this.field292 = false;
            this.field524.method196(true);
            this.field500.method587(0, 0, (byte) 122);
            if (this.field270 == -1) {
                if (this.field392[this.field405] != -1) {
                    if (this.field405 == 0) {
                        this.field298.method587(10, 22, (byte) 122);
                    }
                    if (this.field405 == 1) {
                        this.field299.method587(8, 54, (byte) 122);
                    }
                    if (this.field405 == 2) {
                        this.field299.method587(8, 82, (byte) 122);
                    }
                    if (this.field405 == 3) {
                        this.field300.method587(8, 110, (byte) 122);
                    }
                    if (this.field405 == 4) {
                        this.field302.method587(8, 153, (byte) 122);
                    }
                    if (this.field405 == 5) {
                        this.field302.method587(8, 181, (byte) 122);
                    }
                    if (this.field405 == 6) {
                        this.field301.method587(9, 209, (byte) 122);
                    }
                }
                if (this.field392[0] != -1 && (this.field229 != 0 || field271 % 20 < 10)) {
                    this.field385[0].method587(13, 29, (byte) 122);
                }
                if (this.field392[1] != -1 && (this.field229 != 1 || field271 % 20 < 10)) {
                    this.field385[1].method587(11, 53, (byte) 122);
                }
                if (this.field392[2] != -1 && (this.field229 != 2 || field271 % 20 < 10)) {
                    this.field385[2].method587(11, 82, (byte) 122);
                }
                if (this.field392[3] != -1 && (this.field229 != 3 || field271 % 20 < 10)) {
                    this.field385[3].method587(12, 115, (byte) 122);
                }
                if (this.field392[4] != -1 && (this.field229 != 4 || field271 % 20 < 10)) {
                    this.field385[4].method587(13, 153, (byte) 122);
                }
                if (this.field392[5] != -1 && (this.field229 != 5 || field271 % 20 < 10)) {
                    this.field385[5].method587(11, 180, (byte) 122);
                }
                if (this.field392[6] != -1 && (this.field229 != 6 || field271 % 20 < 10)) {
                    this.field385[6].method587(13, 208, (byte) 122);
                }
            }
            this.field524.method197(super.field95, 160, true, 516);
            this.field523.method196(true);
            this.field499.method587(0, 0, (byte) 122);
            if (this.field270 == -1) {
                if (this.field392[this.field405] != -1) {
                    if (this.field405 == 7) {
                        this.field349.method587(0, 42, (byte) 122);
                    }
                    if (this.field405 == 8) {
                        this.field350.method587(0, 74, (byte) 122);
                    }
                    if (this.field405 == 9) {
                        this.field350.method587(0, 102, (byte) 122);
                    }
                    if (this.field405 == 10) {
                        this.field351.method587(1, 130, (byte) 122);
                    }
                    if (this.field405 == 11) {
                        this.field353.method587(0, 173, (byte) 122);
                    }
                    if (this.field405 == 12) {
                        this.field353.method587(0, 201, (byte) 122);
                    }
                    if (this.field405 == 13) {
                        this.field352.method587(0, 229, (byte) 122);
                    }
                }
                if (this.field392[8] != -1 && (this.field229 != 8 || field271 % 20 < 10)) {
                    this.field385[7].method587(2, 74, (byte) 122);
                }
                if (this.field392[9] != -1 && (this.field229 != 9 || field271 % 20 < 10)) {
                    this.field385[8].method587(3, 102, (byte) 122);
                }
                if (this.field392[10] != -1 && (this.field229 != 10 || field271 % 20 < 10)) {
                    this.field385[9].method587(4, 137, (byte) 122);
                }
                if (this.field392[11] != -1 && (this.field229 != 11 || field271 % 20 < 10)) {
                    this.field385[10].method587(2, 174, (byte) 122);
                }
                if (this.field392[12] != -1 && (this.field229 != 12 || field271 % 20 < 10)) {
                    this.field385[11].method587(2, 201, (byte) 122);
                }
                if (this.field392[13] != -1 && (this.field229 != 13 || field271 % 20 < 10)) {
                    this.field385[12].method587(2, 226, (byte) 122);
                }
            }
            this.field523.method197(super.field95, 466, true, 496);
            this.field266.method196(true);
        }
        if (this.field192) {
            this.field192 = false;
            this.field522.method196(true);
            this.field498.method587(0, 0, (byte) 122);
            this.field357.method419(true, "Public chat", 0, 55, 16777215, 28);
            if (this.field126 == 0) {
                this.field357.method419(true, "On", 0, 55, 65280, 41);
            }
            if (this.field126 == 1) {
                this.field357.method419(true, "Friends", 0, 55, 16776960, 41);
            }
            if (this.field126 == 2) {
                this.field357.method419(true, "Off", 0, 55, 16711680, 41);
            }
            if (this.field126 == 3) {
                this.field357.method419(true, "Hide", 0, 55, 65535, 41);
            }
            this.field357.method419(true, "Private chat", 0, 184, 16777215, 28);
            if (this.field280 == 0) {
                this.field357.method419(true, "On", 0, 184, 65280, 41);
            }
            if (this.field280 == 1) {
                this.field357.method419(true, "Friends", 0, 184, 16776960, 41);
            }
            if (this.field280 == 2) {
                this.field357.method419(true, "Off", 0, 184, 16711680, 41);
            }
            this.field357.method419(true, "Trade/compete", 0, 324, 16777215, 28);
            if (this.field542 == 0) {
                this.field357.method419(true, "On", 0, 324, 65280, 41);
            }
            if (this.field542 == 1) {
                this.field357.method419(true, "Friends", 0, 324, 16776960, 41);
            }
            if (this.field542 == 2) {
                this.field357.method419(true, "Off", 0, 324, 16711680, 41);
            }
            this.field357.method419(true, "Report abuse", 0, 458, 16777215, 33);
            this.field522.method197(super.field95, 453, true, 0);
            this.field266.method196(true);
        }
        this.field121 = 0;
        if (arg0 != 8) {
            this.field236 = this.field254.method306();
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(LJHKSAGUC;II)V")
    private final void method168(class31 arg0, int arg1, int arg2) {
        this.field143 = 0;
        this.field251 = 0;
        this.method123(arg2, false, arg0);
        this.method192(arg2, arg0, 655);
        if (arg1 < 0 || arg1 > 0) {
            this.field312 = this.field284.method589();
        }
        this.method159(arg2, arg0, this.field427);
        this.method65(true, arg2, arg0);
        for (int var4 = 0; var4 < this.field143; ++var4) {
            int var6 = this.field144[var4];
            if (field271 != this.field248[var6].field1217) {
                this.field248[var6] = null;
            }
        }
        if (arg0.field901 != arg2) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field901 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field249; ++var5) {
                if (this.field248[this.field250[var5]] == null) {
                    signlink.reporterror(this.field335 + " null entry in pl list - pos:" + var5 + " size:" + this.field249);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LRBTWCHLG;IZII)V")
    public final void method169(class58 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            if (this.field327 < 400) {
                if (arg0.field1276 != null) {
                    arg0 = arg0.method448(true);
                }
                if (arg0 != null) {
                    if (arg0.field1270) {
                        String var6 = arg0.field1252;
                        if (arg0.field1256 != 0) {
                            var6 = var6 + method127(5, arg0.field1256, field454.field730) + " (level-" + arg0.field1256 + ")";
                        }
                        if (this.field533 == 1) {
                            this.field450[this.field327] = "Use " + this.field537 + " with @yel@" + var6;
                            this.field474[this.field327] = 237;
                            this.field475[this.field327] = arg1;
                            this.field472[this.field327] = arg3;
                            this.field473[this.field327] = arg4;
                            ++this.field327;
                        } else {
                            if (this.field255 == 1) {
                                if ((this.field257 & 2) == 2) {
                                    this.field450[this.field327] = this.field258 + " @yel@" + var6;
                                    this.field474[this.field327] = 209;
                                    this.field475[this.field327] = arg1;
                                    this.field472[this.field327] = arg3;
                                    this.field473[this.field327] = arg4;
                                    ++this.field327;
                                    return;
                                }
                            } else {
                                if (arg0.field1248 != null) {
                                    for (int var7 = 4; var7 >= 0; --var7) {
                                        if (arg0.field1248[var7] != null && !arg0.field1248[var7].equalsIgnoreCase("attack")) {
                                            this.field450[this.field327] = arg0.field1248[var7] + " @yel@" + var6;
                                            if (var7 == 0) {
                                                this.field474[this.field327] = 296;
                                            }
                                            if (var7 == 1) {
                                                this.field474[this.field327] = 187;
                                            }
                                            if (var7 == 2) {
                                                this.field474[this.field327] = 464;
                                            }
                                            if (var7 == 3) {
                                                this.field474[this.field327] = 667;
                                            }
                                            if (var7 == 4) {
                                                this.field474[this.field327] = 270;
                                            }
                                            this.field475[this.field327] = arg1;
                                            this.field472[this.field327] = arg3;
                                            this.field473[this.field327] = arg4;
                                            ++this.field327;
                                        }
                                    }
                                }
                                if (arg0.field1248 != null) {
                                    for (int var8 = 4; var8 >= 0; --var8) {
                                        if (arg0.field1248[var8] != null && arg0.field1248[var8].equalsIgnoreCase("attack")) {
                                            short var9 = 0;
                                            if (arg0.field1256 > field454.field730) {
                                                var9 = 2000;
                                            }
                                            this.field450[this.field327] = arg0.field1248[var8] + " @yel@" + var6;
                                            if (var8 == 0) {
                                                this.field474[this.field327] = var9 + 296;
                                            }
                                            if (var8 == 1) {
                                                this.field474[this.field327] = var9 + 187;
                                            }
                                            if (var8 == 2) {
                                                this.field474[this.field327] = var9 + 464;
                                            }
                                            if (var8 == 3) {
                                                this.field474[this.field327] = var9 + 667;
                                            }
                                            if (var8 == 4) {
                                                this.field474[this.field327] = var9 + 270;
                                            }
                                            this.field475[this.field327] = arg1;
                                            this.field472[this.field327] = arg3;
                                            this.field473[this.field327] = arg4;
                                            ++this.field327;
                                        }
                                    }
                                }
                                this.field450[this.field327] = "Examine @yel@" + var6;
                                this.field474[this.field327] = 1842;
                                this.field475[this.field327] = arg1;
                                this.field472[this.field327] = arg3;
                                this.field473[this.field327] = arg4;
                                ++this.field327;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method56(int arg0) {
        if (arg0 == 0) {
            this.field505 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZB)V")
    public final void method170(boolean arg0, byte arg1) {
        for (int var3 = 0; var3 < this.field441; ++var3) {
            class44 var5 = this.field440[this.field442[var3]];
            int var6 = (this.field442[var3] << 14) + 536870912;
            if (var5 != null && var5.method244(true) && var5.field1080.field1251 == arg0) {
                int var7 = var5.field1214 >> 7;
                int var8 = var5.field1215 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1199 == 1 && (var5.field1214 & 127) == 64 && (var5.field1215 & 127) == 64) {
                        if (this.field538[var7][var8] == this.field147) {
                            continue;
                        }
                        this.field538[var7][var8] = this.field147;
                    }
                    if (!var5.field1080.field1270) {
                        var6 += Integer.MIN_VALUE;
                    }
                    this.field521.method515(this.method173(var5.field1215, var5.field1214, this.field146, 1), var6, (var5.field1199 - 1) * 64 + 60, var5.field1236, this.field146, var5.field1214, var5, var5.field1215, (byte) -48, var5.field1216);
                }
            }
        }
        if (arg1 != 101) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIZIBIII)Z")
    public final boolean method171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, byte arg8, int arg9, int arg10, int arg11) {
        if (arg8 != 4) {
            this.field236 = this.field254.method306();
        }
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field525[var15][var35] = 0;
                this.field345[var15][var35] = 99999999;
            }
        }
        int var16 = arg4;
        int var17 = arg9;
        this.field525[arg4][arg9] = 99;
        this.field345[arg4][arg9] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field540[var18] = arg4;
        int var36 = var18 + 1;
        this.field541[var18] = arg9;
        boolean var20 = false;
        int var21 = this.field540.length;
        int[][] var22 = this.field497[this.field146].field942;
        while (var36 != var19) {
            var16 = this.field540[var19];
            var17 = this.field541[var19];
            var19 = (var19 + 1) % var21;
            if (arg0 == var16 && arg11 == var17) {
                var20 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && this.field497[this.field146].method353(var16, false, arg5 - 1, arg7, var17, arg0, arg11)) {
                    var20 = true;
                    break;
                }
                if (arg5 < 10 && this.field497[this.field146].method354(arg0, var16, true, arg7, var17, arg11, arg5 - 1)) {
                    var20 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg2 != 0 && this.field497[this.field146].method355(arg1, arg2, arg0, arg10, var17, var16, arg11, (byte) -30)) {
                var20 = true;
                break;
            }
            int var34 = this.field345[var16][var17] + 1;
            if (var16 > 0 && this.field525[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field540[var36] = var16 - 1;
                this.field541[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field525[var16 - 1][var17] = 2;
                this.field345[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field525[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field540[var36] = var16 + 1;
                this.field541[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field525[var16 + 1][var17] = 8;
                this.field345[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field525[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field540[var36] = var16;
                this.field541[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field525[var16][var17 - 1] = 1;
                this.field345[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field525[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field540[var36] = var16;
                this.field541[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field525[var16][var17 + 1] = 4;
                this.field345[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field525[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field540[var36] = var16 - 1;
                this.field541[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field525[var16 - 1][var17 - 1] = 3;
                this.field345[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field525[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field540[var36] = var16 + 1;
                this.field541[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field525[var16 + 1][var17 - 1] = 9;
                this.field345[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field525[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field540[var36] = var16 - 1;
                this.field541[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field525[var16 - 1][var17 + 1] = 6;
                this.field345[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field525[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field540[var36] = var16 + 1;
                this.field541[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field525[var16 + 1][var17 + 1] = 12;
                this.field345[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field189 = 0;
        if (!var20) {
            if (arg6) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg0 - var24; var25 <= arg0 + var24; ++var25) {
                        for (int var26 = arg11 - var24; var26 <= arg11 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field345[var25][var26] < var23) {
                                var23 = this.field345[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field189 = 1;
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
        this.field540[var27] = var16;
        int var37 = var27 + 1;
        this.field541[var27] = var17;
        int var28;
        int var29 = var28 = this.field525[var16][var17];
        while (arg4 != var16 || arg9 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field540[var37] = var16;
                this.field541[var37++] = var17;
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
            var29 = this.field525[var16][var17];
        }
        if (var37 <= 0) {
            if (arg3 == 1) {
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
            int var31 = this.field540[var37];
            int var32 = this.field541[var37];
            if (arg3 == 0) {
                this.field175.method295(146, 1);
                this.field175.method296(var30 + var30 + 3);
            }
            if (arg3 == 1) {
                this.field175.method295(130, 1);
                this.field175.method296(var30 + var30 + 3 + 14);
            }
            if (arg3 == 2) {
                this.field175.method295(106, 1);
                this.field175.method296(var30 + var30 + 3);
            }
            this.field501 = this.field540[0];
            this.field502 = this.field541[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field175.method323(this.field540[var37] - var31, this.field434);
                this.field175.method322((byte) 99, this.field541[var37] - var32);
            }
            this.field175.method322((byte) 99, super.field113[5] == 1 ? 1 : 0);
            this.field175.method331(this.field570 + var31, (byte) 81);
            this.field175.method333(this.field571 + var32, 508);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    private final void method172(int arg0) {
        while (arg0 >= 0) {
            this.method52();
        }
        for (class11 var2 = (class11) this.field583.method393(); var2 != null; var2 = (class11) this.field583.method395(true)) {
            if (var2.field611 == -1) {
                var2.field600 = 0;
                this.method102((byte) 107, var2);
            } else {
                var2.method290();
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IIII)I")
    public final int method173(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 >> 7;
        int var6 = arg0 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg2;
            if (this.field435 != arg3) {
                this.field496 = null;
            }
            if (arg2 < 3 && (this.field204[1][var5][var6] & 2) == 2) {
                var7 = arg2 + 1;
            }
            int var8 = arg1 & 127;
            int var9 = arg0 & 127;
            int var10 = (128 - var8) * this.field389[var7][var5][var6] + this.field389[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field389[var7][var5][var6 + 1] + this.field389[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method174(String arg0, int arg1) {
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field309; ++var3) {
                if (arg0.equalsIgnoreCase(this.field340[var3])) {
                    return true;
                }
            }
            if (arg1 != -39869) {
                field303 = -181;
            }
            return arg0.equalsIgnoreCase(field454.field698);
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method175(byte arg0) {
        if (arg0 != 122) {
            this.field496 = null;
        }
        if (super.field109 == 1) {
            if (super.field110 >= 6 && super.field110 <= 106 && super.field111 >= 467 && super.field111 <= 499) {
                this.field126 = (this.field126 + 1) % 4;
                this.field192 = true;
                this.field586 = true;
                this.field175.method295(36, 1);
                this.field175.method296(this.field126);
                this.field175.method296(this.field280);
                this.field175.method296(this.field542);
            }
            if (super.field110 >= 135 && super.field110 <= 235 && super.field111 >= 467 && super.field111 <= 499) {
                this.field280 = (this.field280 + 1) % 3;
                this.field192 = true;
                this.field586 = true;
                this.field175.method295(36, 1);
                this.field175.method296(this.field126);
                this.field175.method296(this.field280);
                this.field175.method296(this.field542);
            }
            if (super.field110 >= 273 && super.field110 <= 373 && super.field111 >= 467 && super.field111 <= 499) {
                this.field542 = (this.field542 + 1) % 3;
                this.field192 = true;
                this.field586 = true;
                this.field175.method295(36, 1);
                this.field175.method296(this.field126);
                this.field175.method296(this.field280);
                this.field175.method296(this.field542);
            }
            if (super.field110 >= 412 && super.field110 <= 512 && super.field111 >= 467 && super.field111 <= 499) {
                if (this.field245 == -1) {
                    this.method145((byte) 7);
                    this.field318 = "";
                    this.field317 = false;
                    for (int var2 = 0; var2 < class63.field1490.length; ++var2) {
                        if (class63.field1490[var2] != null && class63.field1490[var2].field1529 == 600) {
                            this.field569 = this.field245 = class63.field1490[var2].field1514;
                            break;
                        }
                    }
                } else {
                    this.method111(0, "Please close the interface you have open before using 'report abuse'", "", (byte) 4);
                }
            }
            ++field233;
            if (field233 > 1671) {
                field233 = 0;
                this.field175.method295(50, 1);
                this.field175.method296(0);
                int var3 = this.field175.field901;
                this.field175.method296((int) (Math.random() * 256.0D));
                this.field175.method297((int) (Math.random() * 65536.0D));
                this.field175.method296(198);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field175.method296(116);
                }
                this.field175.method297((int) (Math.random() * 65536.0D));
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field175.method297(63782);
                }
                this.field175.method297((int) (Math.random() * 65536.0D));
                this.field175.method296((int) (Math.random() * 256.0D));
                this.field175.method296(1);
                this.field175.method297(18724);
                this.field175.method305((byte) 103, this.field175.field901 - var3);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILDLNMSHLT;)V")
    public final void method176(int arg0, int arg1, int arg2, class12 arg3) {
        this.field235 += arg1;
        int var5 = arg0 * arg0 + arg2 * arg2;
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field531 + this.field487 & 2047;
            int var7 = class59.field1367[var6];
            int var8 = class59.field1368[var6];
            int var9 = var7 * 256 / (this.field553 + 256);
            int var10 = var8 * 256 / (this.field553 + 256);
            int var11 = arg0 * var9 + arg2 * var10 >> 16;
            int var12 = arg0 * var10 - arg2 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field480.method210(var13, 20, 15, 256, 20, 0, 15, 83 - var16 - 20, var15 + 94 + 4 - 10);
        } else {
            this.method137((byte) 8, arg2, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZI)V")
    public final void method177(boolean arg0, boolean arg1, int arg2) {
        signlink.midivol = arg2;
        if (!arg0) {
            if (arg1) {
                signlink.midi = "voladjust";
            }
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method178(int arg0) {
        this.field543 = false;
        while (this.field451) {
            this.field543 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field482 = null;
        this.field483 = null;
        this.field130 = null;
        this.field468 = null;
        this.field469 = null;
        if (arg0 >= 9 && arg0 <= 9) {
            this.field470 = null;
            this.field471 = null;
            this.field587 = null;
            this.field588 = null;
            this.field262 = null;
            this.field263 = null;
            this.field403 = null;
            this.field404 = null;
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method179(int arg0) {
        if (arg0 != 8) {
            this.field428 = this.field284.method589();
        }
        try {
            if (this.field322 != null) {
                this.field322.method433();
            }
        } catch (Exception var3) {
        }
        this.field322 = null;
        this.field295 = false;
        this.field517 = 0;
        this.field335 = "";
        this.field336 = "";
        this.method64(true);
        this.field521.method504(6);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field497[var2].method344();
        }
        System.gc();
        this.method89((byte) 2);
        this.field178 = -1;
        this.field285 = -1;
        this.field120 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIIIIILTNOPEJNZ;II)V")
    public final void method180(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class63 arg6, int arg7, int arg8) {
        if (arg5 != -15719) {
            this.field565 = !this.field565;
        }
        if (this.field201) {
            this.field243 = 32;
        } else {
            this.field243 = 0;
        }
        this.field201 = false;
        if (arg4 >= arg3 && arg4 < arg3 + 16 && arg7 >= arg8 && arg7 < arg8 + 16) {
            arg6.field1546 -= this.field259 * 4;
            if (arg0) {
                this.field494 = true;
                return;
            }
        } else if (arg4 >= arg3 && arg4 < arg3 + 16 && arg7 >= arg1 + arg8 - 16 && arg7 < arg1 + arg8) {
            arg6.field1546 += this.field259 * 4;
            if (arg0) {
                this.field494 = true;
                return;
            }
        } else {
            if (arg4 < arg3 - this.field243 || arg4 >= arg3 + 16 + this.field243 || arg7 < arg8 + 16 || arg7 >= arg1 + arg8 - 16 || this.field259 <= 0) {
                return;
            }
            int var10 = (arg1 - 32) * arg1 / arg2;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg7 - arg8 - 16 - var10 / 2;
            int var12 = arg1 - 32 - var10;
            arg6.field1546 = (arg2 - arg1) * var11 / var12;
            if (arg0) {
                this.field494 = true;
            }
            this.field201 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILJHKSAGUC;I)V")
    private final void method181(int arg0, class31 arg1, int arg2) {
        this.field143 = 0;
        this.field251 = 0;
        this.method82(arg1, arg2, 8);
        this.method186(this.field203, arg2, arg1);
        this.method195(false, arg1, arg2);
        for (int var4 = 0; var4 < this.field143; ++var4) {
            int var7 = this.field144[var4];
            if (field271 != this.field440[var7].field1217) {
                this.field440[var7].field1080 = null;
                this.field440[var7] = null;
            }
        }
        int var5 = arg0 + arg2;
        if (arg1.field901 != var5) {
            signlink.reporterror(this.field335 + " size mismatch in getnpcpos - pos:" + arg1.field901 + " psize:" + var5);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field441; ++var6) {
                if (this.field440[this.field442[var6]] == null) {
                    signlink.reporterror(this.field335 + " null entry in npc list - pos:" + var6 + " size:" + this.field441);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    public final void method182(int arg0) {
        int var2 = this.field329 * 128 + 64;
        int var3 = this.field330 * 128 + 64;
        int var4 = this.method173(var3, var2, this.field146, 1) - this.field331;
        if (this.field555 < var2) {
            this.field555 += (var2 - this.field555) * this.field333 / 1000 + this.field332;
            if (this.field555 > var2) {
                this.field555 = var2;
            }
        }
        if (this.field555 > var2) {
            this.field555 -= (this.field555 - var2) * this.field333 / 1000 + this.field332;
            if (this.field555 < var2) {
                this.field555 = var2;
            }
        }
        if (this.field556 < var4) {
            this.field556 += (var4 - this.field556) * this.field333 / 1000 + this.field332;
            if (this.field556 > var4) {
                this.field556 = var4;
            }
        }
        if (this.field556 > var4) {
            this.field556 -= (this.field556 - var4) * this.field333 / 1000 + this.field332;
            if (this.field556 < var4) {
                this.field556 = var4;
            }
        }
        if (this.field557 < var3) {
            this.field557 += (var3 - this.field557) * this.field333 / 1000 + this.field332;
            if (this.field557 > var3) {
                this.field557 = var3;
            }
        }
        if (this.field557 > var3) {
            this.field557 -= (this.field557 - var3) * this.field333 / 1000 + this.field332;
            if (this.field557 < var3) {
                this.field557 = var3;
            }
        }
        int var5 = this.field376 * 128 + 64;
        int var6 = this.field377 * 128 + 64;
        int var7 = this.method173(var6, var5, this.field146, 1) - this.field378;
        int var8 = var5 - this.field555;
        int var9 = var7 - this.field556;
        int var10 = var6 - this.field557;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        int var14 = 19 / arg0;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field558 < var12) {
            this.field558 += (var12 - this.field558) * this.field380 / 1000 + this.field379;
            if (this.field558 > var12) {
                this.field558 = var12;
            }
        }
        if (this.field558 > var12) {
            this.field558 -= (this.field558 - var12) * this.field380 / 1000 + this.field379;
            if (this.field558 < var12) {
                this.field558 = var12;
            }
        }
        int var15 = var13 - this.field559;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 > 0) {
            this.field559 += this.field380 * var15 / 1000 + this.field379;
            this.field559 &= 2047;
        }
        if (var15 < 0) {
            this.field559 -= -var15 * this.field380 / 1000 + this.field379;
            this.field559 &= 2047;
        }
        int var16 = var13 - this.field559;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 < 0 && var15 > 0 || var16 > 0 && var15 < 0) {
            this.field559 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method54(byte arg0) {
        signlink.reporterror = false;
        try {
            if (this.field322 != null) {
                this.field322.method433();
            }
        } catch (Exception var2) {
        }
        this.field322 = null;
        this.method89((byte) 2);
        if (this.field148 != null) {
            this.field148.field1648 = false;
        }
        this.field148 = null;
        this.field234.method574();
        this.field234 = null;
        this.field439 = null;
        this.field175 = null;
        this.field328 = null;
        this.field254 = null;
        this.field152 = null;
        this.field443 = null;
        this.field171 = null;
        this.field153 = null;
        this.field154 = null;
        this.field389 = null;
        this.field204 = null;
        this.field521 = null;
        this.field497 = null;
        this.field525 = null;
        this.field345 = null;
        this.field540 = null;
        this.field541 = null;
        this.field224 = null;
        this.field264 = null;
        this.field265 = null;
        this.field266 = null;
        this.field267 = null;
        this.field522 = null;
        this.field523 = null;
        this.field524 = null;
        this.field131 = null;
        this.field132 = null;
        this.field133 = null;
        this.field134 = null;
        this.field135 = null;
        this.field136 = null;
        this.field137 = null;
        this.field138 = null;
        this.field139 = null;
        this.field528 = null;
        this.field529 = null;
        this.field530 = null;
        this.field498 = null;
        this.field499 = null;
        this.field500 = null;
        this.field385 = null;
        this.field298 = null;
        this.field299 = null;
        this.field300 = null;
        if (this.field510 != arg0) {
            this.field175.method296(232);
        }
        this.field301 = null;
        this.field302 = null;
        this.field349 = null;
        this.field350 = null;
        this.field351 = null;
        this.field352 = null;
        this.field353 = null;
        this.field163 = null;
        this.field492 = null;
        this.field508 = null;
        this.field484 = null;
        this.field406 = null;
        this.field407 = null;
        this.field408 = null;
        this.field409 = null;
        this.field410 = null;
        this.field446 = null;
        this.field187 = null;
        this.field538 = null;
        this.field248 = null;
        this.field250 = null;
        this.field252 = null;
        this.field253 = null;
        this.field144 = null;
        this.field440 = null;
        this.field442 = null;
        this.field496 = null;
        this.field583 = null;
        this.field230 = null;
        this.field462 = null;
        this.field472 = null;
        this.field473 = null;
        this.field474 = null;
        this.field475 = null;
        this.field450 = null;
        this.field478 = null;
        this.field208 = null;
        this.field209 = null;
        this.field354 = null;
        this.field503 = null;
        this.field340 = null;
        this.field509 = null;
        this.field507 = null;
        this.field214 = null;
        this.field215 = null;
        this.field211 = null;
        this.field212 = null;
        this.field213 = null;
        this.field216 = null;
        this.field217 = null;
        this.field218 = null;
        this.field219 = null;
        this.method178(9);
        class61.method483(1);
        class58.method446(1);
        class41.method380(1);
        class43.field1064 = null;
        class13.field632 = null;
        class63.field1490 = null;
        class68.field1699 = null;
        class36.field953 = null;
        class64.field1557 = null;
        class64.field1569 = null;
        class17.field654 = null;
        super.field96 = null;
        class21.field724 = null;
        class5.method25(1);
        class65.method503(1);
        class59.method450(1);
        class18.method227(1);
        System.gc();
        if (class29.field878) {
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(B)V")
    public void method183(byte arg0) {
        System.out.println("============");
        if (arg0 != -32) {
            this.field294 = !this.field294;
        }
        System.out.println("flame-cycle:" + this.field394);
        if (this.field234 != null) {
            System.out.println("Od-cycle:" + this.field234.field1672);
        }
        System.out.println("loop-cycle:" + field271);
        System.out.println("draw-cycle:" + field304);
        System.out.println("ptype:" + this.field236);
        System.out.println("psize:" + this.field235);
        if (this.field322 != null) {
            this.field322.method438(this.field149);
        }
        super.field92 = true;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)Ljava/awt/Component;")
    public final Component method57(byte arg0) {
        if (field455 != arg0) {
            this.method52();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field98 != null ? super.field98 : this;
        }
    }

    @OriginalMember(owner = "client", name = "N", descriptor = "(I)V")
    public final void method184(int arg0) {
        this.method136(636);
        this.field235 += arg0;
        if (this.field399 == 1) {
            this.field484[this.field398 / 100].method205(this.field397 - 8 - 4, this.field396 - 8 - 4, (byte) 122);
            ++field383;
            if (field383 > 161) {
                field383 = 0;
                this.field175.method295(196, 1);
                this.field175.method299(1545697);
            }
        }
        if (this.field399 == 2) {
            this.field484[this.field398 / 100 + 4].method205(this.field397 - 8 - 4, this.field396 - 8 - 4, (byte) 122);
        }
        if (this.field311 != -1) {
            this.method193(this.field311, -63, this.field121);
            this.method185(0, 0, class63.field1490[this.field311], 0, 0);
        }
        if (this.field245 != -1) {
            this.method193(this.field245, -63, this.field121);
            this.method185(0, 0, class63.field1490[this.field245], 0, 0);
        }
        this.method107(-34462);
        if (!this.field305) {
            this.method157(-346);
            this.method124((byte) 8);
        } else if (this.field179 == 0) {
            this.method92((byte) 0);
        }
        if (this.field344 == 1) {
            this.field508[1].method205(296, 472, (byte) 122);
        }
        if (field282) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field91 < 15) {
                var4 = 16711680;
            }
            this.field357.method417(var2, -720, "Fps:" + super.field91, var3, var4);
            int var12 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field426) {
                int var8 = 16711680;
            }
            this.field357.method417(var2, -720, "Mem:" + var6 + "k", var12, 16776960);
            var12 += 15;
        }
        if (this.field582 != 0) {
            int var9 = this.field582 / 50;
            int var10 = var9 / 60;
            int var11 = var9 % 60;
            if (var11 < 10) {
                this.field357.method422(16776960, (byte) 2, "System update in: " + var10 + ":0" + var11, 4, 329);
            } else {
                this.field357.method422(16776960, (byte) 2, "System update in: " + var10 + ":" + var11, 4, 329);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILTNOPEJNZ;II)V")
    public final void method185(int arg0, int arg1, class63 arg2, int arg3, int arg4) {
        if (arg2.field1525 == 0 && arg2.field1544 != null) {
            if (!arg2.field1493 || this.field161 == arg2.field1500 || this.field476 == arg2.field1500 || this.field174 == arg2.field1500) {
                int var6 = class19.field689;
                int var7 = class19.field687;
                int var8 = class19.field690;
                int var9 = class19.field688;
                class19.method232(arg2.field1509 + arg3, arg3, (byte) -87, arg2.field1524 + arg0, arg0);
                int var10 = arg2.field1544.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg2.field1535[var11] + arg3;
                    int var13 = arg2.field1547[var11] + arg0 - arg4;
                    class63 var14 = class63.field1490[arg2.field1544[var11]];
                    int var15 = var14.field1513 + var12;
                    int var16 = var14.field1534 + var13;
                    if (var14.field1529 > 0) {
                        this.method152(var14, 716);
                    }
                    if (var14.field1525 == 0) {
                        if (var14.field1546 > var14.field1512 - var14.field1524) {
                            var14.field1546 = var14.field1512 - var14.field1524;
                        }
                        if (var14.field1546 < 0) {
                            var14.field1546 = 0;
                        }
                        this.method185(var16, 0, var14, var15, var14.field1546);
                        if (var14.field1512 > var14.field1524) {
                            this.method146(var14.field1546, var14.field1524, var14.field1512, var16, true, var14.field1509 + var15);
                        }
                    } else if (var14.field1525 != 1) {
                        if (var14.field1525 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field1524; ++var18) {
                                for (int var19 = 0; var19 < var14.field1509; ++var19) {
                                    int var20 = (var14.field1503 + 32) * var19 + var15;
                                    int var21 = (var14.field1539 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field1491[var17];
                                        var21 += var14.field1551[var17];
                                    }
                                    if (var14.field1540[var17] <= 0) {
                                        if (var14.field1523 != null && var17 < 20) {
                                            class12 var30 = var14.field1523[var17];
                                            if (var30 != null) {
                                                var30.method205(var21, var20, (byte) 122);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field1540[var17] - 1;
                                        if (var20 > class19.field689 - 32 && var20 < class19.field690 && var21 > class19.field687 - 32 && var21 < class19.field688 || this.field167 != 0 && this.field166 == var17) {
                                            int var25 = 0;
                                            if (this.field533 == 1 && this.field534 == var17 && this.field535 == var14.field1500) {
                                                var25 = 16777215;
                                            }
                                            class12 var26 = class41.method375(var14.field1517[var17], true, var24, var25);
                                            if (var26 != null) {
                                                if (this.field167 != 0 && this.field166 == var17 && this.field165 == var14.field1500) {
                                                    var22 = super.field103 - this.field168;
                                                    var23 = super.field104 - this.field169;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field226 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method207(var20 + var22, var21 + var23, 128, 0);
                                                    if (var21 + var23 < class19.field687 && arg2.field1546 > 0) {
                                                        int var27 = (class19.field687 - var21 - var23) * this.field121 / 3;
                                                        if (var27 > this.field121 * 10) {
                                                            var27 = this.field121 * 10;
                                                        }
                                                        if (var27 > arg2.field1546) {
                                                            var27 = arg2.field1546;
                                                        }
                                                        arg2.field1546 -= var27;
                                                        this.field169 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class19.field688 && arg2.field1546 < arg2.field1512 - arg2.field1524) {
                                                        int var28 = (var21 + var23 + 32 - class19.field688) * this.field121 / 3;
                                                        if (var28 > this.field121 * 10) {
                                                            var28 = this.field121 * 10;
                                                        }
                                                        if (var28 > arg2.field1512 - arg2.field1524 - arg2.field1546) {
                                                            var28 = arg2.field1512 - arg2.field1524 - arg2.field1546;
                                                        }
                                                        arg2.field1546 += var28;
                                                        this.field169 -= var28;
                                                    }
                                                } else if (this.field549 != 0 && this.field548 == var17 && this.field547 == var14.field1500) {
                                                    var26.method207(var20, var21, 128, 0);
                                                } else {
                                                    var26.method205(var21, var20, (byte) 122);
                                                }
                                                if (var26.field625 == 33 || var14.field1517[var17] != 1) {
                                                    int var29 = var14.field1517[var17];
                                                    this.field356.method422(0, (byte) 2, method139(1, var29), var20 + 1 + var22, var21 + 10 + var23);
                                                    this.field356.method422(16776960, (byte) 2, method139(1, var29), var20 + var22, var21 + 9 + var23);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field1525 == 3) {
                            boolean var31 = false;
                            if (this.field174 == var14.field1500 || this.field476 == var14.field1500 || this.field161 == var14.field1500) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method134(var14, 18875)) {
                                var32 = var14.field1543;
                                if (var31 && var14.field1489 != 0) {
                                    var32 = var14.field1489;
                                }
                            } else {
                                var32 = var14.field1554;
                                if (var31 && var14.field1494 != 0) {
                                    var32 = var14.field1494;
                                }
                            }
                            if (var14.field1519 == 0) {
                                if (var14.field1522) {
                                    class19.method235(false, var14.field1524, var14.field1509, var16, var32, var15);
                                } else {
                                    class19.method236(3, var14.field1524, var15, var14.field1509, var32, var16);
                                }
                            } else if (var14.field1522) {
                                class19.method234(var16, var15, 256 - (var14.field1519 & 255), var14.field1509, false, var14.field1524, var32);
                            } else {
                                class19.method237(256 - (var14.field1519 & 255), var16, var14.field1524, var32, var14.field1509, var15, false);
                            }
                        } else if (var14.field1525 == 4) {
                            class54 var33 = var14.field1486;
                            String var34 = var14.field1545;
                            boolean var35 = false;
                            if (this.field174 == var14.field1500 || this.field476 == var14.field1500 || this.field161 == var14.field1500) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method134(var14, 18875)) {
                                var36 = var14.field1543;
                                if (var35 && var14.field1489 != 0) {
                                    var36 = var14.field1489;
                                }
                                if (var14.field1520.length() > 0) {
                                    var34 = var14.field1520;
                                }
                            } else {
                                var36 = var14.field1554;
                                if (var35 && var14.field1494 != 0) {
                                    var36 = var14.field1494;
                                }
                            }
                            if (var14.field1528 == 6 && this.field159) {
                                var34 = "Please wait...";
                                var36 = var14.field1554;
                            }
                            if (class19.field685 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field1170 + var16;
                            while (var34.length() > 0) {
                                if (var34.indexOf("%") != -1) {
                                    label346: while (true) {
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
                                                                            break label346;
                                                                        }
                                                                        var34 = var34.substring(0, var42) + this.method76(49, this.method110(var14, -66, 4)) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method76(49, this.method110(var14, -66, 3)) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method76(49, this.method110(var14, -66, 2)) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method76(49, this.method110(var14, -66, 1)) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method76(49, this.method110(var14, -66, 0)) + var34.substring(var38 + 2);
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
                                if (var14.field1548) {
                                    var33.method419(var14.field1511, var44, 0, var14.field1509 / 2 + var15, var36, var37);
                                } else {
                                    var33.method426(var44, var14.field1511, true, var15, var36, var37);
                                }
                                var37 += var33.field1170;
                            }
                        } else if (var14.field1525 == 5) {
                            class12 var45;
                            if (this.method134(var14, 18875)) {
                                var45 = var14.field1501;
                            } else {
                                var45 = var14.field1549;
                            }
                            if (var45 != null) {
                                var45.method205(var16, var15, (byte) 122);
                            }
                        } else if (var14.field1525 == 6) {
                            int var46 = class5.field59;
                            int var47 = class5.field60;
                            class5.field59 = var14.field1509 / 2 + var15;
                            class5.field60 = var14.field1524 / 2 + var16;
                            int var48 = class5.field63[var14.field1531] * var14.field1530 >> 16;
                            int var49 = class5.field64[var14.field1531] * var14.field1530 >> 16;
                            boolean var50 = this.method134(var14, 18875);
                            int var51;
                            if (var50) {
                                var51 = var14.field1508;
                            } else {
                                var51 = var14.field1507;
                            }
                            class59 var52;
                            if (var51 == -1) {
                                var52 = var14.method499(var50, -1, 856, -1);
                            } else {
                                class36 var53 = class36.field953[var51];
                                var52 = var14.method499(var50, var53.field956[var14.field1510], 856, var53.field955[var14.field1510]);
                            }
                            if (var52 != null) {
                                var52.method474(0, var14.field1532, 0, var14.field1531, 0, var48, var49);
                            }
                            class5.field59 = var46;
                            class5.field60 = var47;
                        } else if (var14.field1525 == 7) {
                            class54 var54 = var14.field1486;
                            int var55 = 0;
                            for (int var56 = 0; var56 < var14.field1524; ++var56) {
                                for (int var57 = 0; var57 < var14.field1509; ++var57) {
                                    if (var14.field1540[var55] > 0) {
                                        class41 var58 = class41.method374(var14.field1540[var55] - 1);
                                        String var59 = var58.field1028;
                                        if (var58.field1046 || var14.field1517[var55] != 1) {
                                            var59 = var59 + " x" + method138(var14.field1517[var55], (byte) 3);
                                        }
                                        int var60 = (var14.field1503 + 115) * var57 + var15;
                                        int var61 = (var14.field1539 + 12) * var56 + var16;
                                        if (var14.field1548) {
                                            var54.method419(var14.field1511, var59, 0, var14.field1509 / 2 + var60, var14.field1554, var61);
                                        } else {
                                            var54.method426(var59, var14.field1511, true, var60, var14.field1554, var61);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                this.field235 += arg1;
                class19.method232(var8, var6, (byte) -87, var9, var7);
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field423 = Integer.parseInt(this.getParameter("nodeid"));
        field424 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method99(7);
        } else {
            method90(2);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field425 = false;
        } else {
            field425 = true;
        }
        this.method48(true, 503, 765);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILJHKSAGUC;)V")
    private final void method186(byte arg0, int arg1, class31 arg2) {
        while (true) {
            if (arg2.field902 + 21 < arg1 * 8) {
                int var4 = arg2.method317((byte) 9, 14);
                if (var4 != 16383) {
                    if (this.field440[var4] == null) {
                        this.field440[var4] = new class44();
                    }
                    class44 var5 = this.field440[var4];
                    this.field442[this.field441++] = var4;
                    var5.field1217 = field271;
                    int var6 = arg2.method317((byte) 9, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg2.method317((byte) 9, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg2.method317((byte) 9, 1);
                    var5.field1080 = class58.method449(arg2.method317((byte) 9, 12));
                    int var9 = arg2.method317((byte) 9, 1);
                    if (var9 == 1) {
                        this.field252[this.field251++] = var4;
                    }
                    var5.field1199 = var5.field1080.field1250;
                    var5.field1241 = var5.field1080.field1269;
                    var5.field1237 = var5.field1080.field1284;
                    var5.field1238 = var5.field1080.field1278;
                    var5.field1239 = var5.field1080.field1273;
                    var5.field1240 = var5.field1080.field1258;
                    var5.field1202 = var5.field1080.field1280;
                    var5.method440(field454.field1201[0] + var6, var8 == 1, field454.field1200[0] + var7, 9);
                    continue;
                }
            }
            arg2.method318((byte) -66);
            if (this.field203 != arg0) {
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method187(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field240 = "";
                this.field241 = "Connecting to server...";
                this.method130(true, (byte) 68);
            }
            this.field322 = new class55(this, 0, this.method143(field424 + 43594));
            long var4 = class70.method576(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field175.field901 = 0;
            this.field175.method296(14);
            this.field175.method296(var6);
            this.field322.method437(this.field175.field900, 2, 0, -4632);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field322.method434();
            }
            int var8 = this.field322.method434();
            int var9 = var8;
            if (var8 == 0) {
                this.field322.method436(this.field254.field900, 0, 8);
                this.field254.field901 = 0;
                this.field191 = this.field254.method312(217);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field191 >> 32), (int) this.field191 };
                this.field175.field901 = 0;
                this.field175.method296(10);
                this.field175.method300(var10[0]);
                this.field175.method300(var10[1]);
                this.field175.method300(var10[2]);
                this.field175.method300(var10[3]);
                this.field175.method300(signlink.uid);
                this.field175.method303(arg0);
                this.field175.method303(arg1);
                this.field175.method321(0, field461, field277);
                this.field328.field901 = 0;
                if (arg2) {
                    this.field328.method296(18);
                } else {
                    this.field328.method296(16);
                }
                this.field328.method296(this.field175.field901 + 36 + 1 + 1 + 2);
                this.field328.method296(255);
                this.field328.method297(318);
                this.field328.method296(field426 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field328.method300(this.field289[var11]);
                }
                this.field328.method304(0, this.field175.field901, this.field175.field900, true);
                this.field175.field905 = new class72(-48131, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field284 = new class72(-48131, var10);
                this.field322.method437(this.field328.field900, this.field328.field901, 0, -4632);
                var8 = this.field322.method434();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method187(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field479 = this.field322.method434();
                field395 = this.field322.method434() == 1;
                this.field200 = 0L;
                this.field306 = 0;
                this.field148.field1650 = 0;
                super.field100 = true;
                this.field360 = true;
                this.field295 = true;
                this.field175.field901 = 0;
                this.field254.field901 = 0;
                this.field236 = -1;
                this.field431 = -1;
                this.field432 = -1;
                this.field433 = -1;
                this.field235 = 0;
                this.field237 = 0;
                this.field582 = 0;
                this.field239 = 0;
                this.field141 = 0;
                this.field327 = 0;
                this.field305 = false;
                super.field101 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field520[var13] = null;
                }
                this.field533 = 0;
                this.field255 = 0;
                this.field275 = 0;
                this.field307 = 0;
                this.field314 = (int) (Math.random() * 100.0D) - 50;
                this.field194 = (int) (Math.random() * 110.0D) - 55;
                this.field448 = (int) (Math.random() * 80.0D) - 40;
                this.field531 = (int) (Math.random() * 120.0D) - 60;
                this.field553 = (int) (Math.random() * 30.0D) - 20;
                this.field487 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field324 = 0;
                this.field550 = -1;
                this.field501 = 0;
                this.field502 = 0;
                this.field249 = 0;
                this.field441 = 0;
                for (int var14 = 0; var14 < this.field246; ++var14) {
                    this.field248[var14] = null;
                    this.field253[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field440[var15] = null;
                }
                field454 = this.field248[this.field247] = new class21();
                this.field230.method397();
                this.field462.method397();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field496[var16][var17][var18] = null;
                        }
                    }
                }
                this.field583 = new class48(-392);
                this.field310 = 0;
                this.field309 = 0;
                this.field400 = -1;
                this.field297 = -1;
                this.field245 = -1;
                this.field270 = -1;
                this.field311 = -1;
                this.field159 = false;
                this.field405 = 3;
                this.field568 = 0;
                this.field305 = false;
                this.field296 = false;
                this.field164 = null;
                this.field344 = 0;
                this.field229 = -1;
                this.field481 = true;
                this.method96((byte) 3);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field199[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field580[var20] = null;
                    this.field581[var20] = false;
                }
                field453 = 0;
                field544 = 0;
                field381 = 0;
                field122 = 0;
                field412 = 0;
                field276 = 0;
                field374 = 0;
                field145 = 0;
                field338 = 0;
                field390 = 0;
                this.method91((byte) -26);
            } else if (var8 == 3) {
                this.field240 = "";
                this.field241 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field240 = "Your account has been disabled.";
                this.field241 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field240 = "Your account is already logged in.";
                this.field241 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field240 = "RuneScape has been updated!";
                this.field241 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field240 = "This world is full.";
                this.field241 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field240 = "Unable to connect.";
                this.field241 = "Login server offline.";
            } else if (var8 == 9) {
                this.field240 = "Login limit exceeded.";
                this.field241 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field240 = "Unable to connect.";
                this.field241 = "Bad session id.";
            } else if (var8 == 11) {
                this.field241 = "Login server rejected session.";
                this.field241 = "Please try again.";
            } else if (var8 == 12) {
                this.field240 = "You need a members account to login to this world.";
                this.field241 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field240 = "Could not complete login.";
                this.field241 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field240 = "The server is being updated.";
                this.field241 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field295 = true;
                this.field175.field901 = 0;
                this.field254.field901 = 0;
                this.field236 = -1;
                this.field431 = -1;
                this.field432 = -1;
                this.field433 = -1;
                this.field235 = 0;
                this.field237 = 0;
                this.field582 = 0;
                this.field327 = 0;
                this.field305 = false;
                this.field339 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field240 = "Login attempts exceeded.";
                this.field241 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field240 = "You are standing in a members-only area.";
                this.field241 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field240 = "Invalid loginserver requested";
                this.field241 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field422 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field422;
                            this.method187(arg0, arg1, arg2);
                        } else {
                            this.field240 = "No response from loginserver";
                            this.field241 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field240 = "No response from server";
                        this.field241 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field240 = "Unexpected server response";
                    this.field241 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field322.method434();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field240 = "You have only just left another world";
                    this.field241 = "Your profile will be transferred in: " + var26;
                    this.method130(true, (byte) 68);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method187(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field240 = "";
            this.field241 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "O", descriptor = "(I)V")
    public final void method188(int arg0) {
        Graphics var2 = this.method57(field455).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        if (arg0 < 2 || arg0 > 2) {
            field561 = 193;
        }
        this.method50(1, 0);
        if (this.field281) {
            this.field543 = false;
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
        if (this.field579) {
            this.field543 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field585) {
            this.field543 = false;
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

    @OriginalMember(owner = "client", name = "P", descriptor = "(I)V")
    public final void method189(int arg0) {
        if (arg0 < 5 || arg0 > 5) {
            this.field584 = this.field284.method589();
        }
        if (this.field324 == 0) {
            if (super.field109 == 1) {
                int var2 = super.field110 - 25 - 550;
                int var3 = super.field111 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field531 + this.field487 & 2047;
                    int var5 = class5.field63[var4];
                    int var6 = class5.field64[var4];
                    int var7 = (this.field553 + 256) * var5 >> 8;
                    int var8 = (this.field553 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field454.field1214 + var9 >> 7;
                    int var12 = field454.field1215 - var10 >> 7;
                    boolean var13 = this.method171(var11, 0, 0, 1, field454.field1200[0], 0, true, 0, (byte) 4, field454.field1201[0], 0, var12);
                    if (var13) {
                        this.field175.method296(var2);
                        this.field175.method296(var3);
                        this.field175.method297(this.field487);
                        this.field175.method296(57);
                        this.field175.method296(this.field531);
                        this.field175.method296(this.field553);
                        this.field175.method296(89);
                        this.field175.method297(field454.field1214);
                        this.field175.method297(field454.field1215);
                        this.field175.method296(this.field189);
                        this.field175.method296(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(B)I")
    public final int method190(byte arg0) {
        int var2 = 3;
        if (this.field416 != arg0) {
            return this.field140;
        } else {
            if (this.field558 < 310) {
                int var3 = this.field555 >> 7;
                int var4 = this.field557 >> 7;
                int var5 = field454.field1214 >> 7;
                int var6 = field454.field1215 >> 7;
                if ((this.field204[this.field146][var3][var4] & 4) != 0) {
                    var2 = this.field146;
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
                        if ((this.field204[this.field146][var3][var4] & 4) != 0) {
                            var2 = this.field146;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field204[this.field146][var3][var4] & 4) != 0) {
                                var2 = this.field146;
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
                        if ((this.field204[this.field146][var3][var4] & 4) != 0) {
                            var2 = this.field146;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field204[this.field146][var3][var4] & 4) != 0) {
                                var2 = this.field146;
                            }
                        }
                    }
                }
            }
            if ((this.field204[this.field146][field454.field1214 >> 7][field454.field1215 >> 7] & 4) != 0) {
                var2 = this.field146;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client", name = "Q", descriptor = "(I)I")
    public final int method191(int arg0) {
        if (this.field323 != arg0) {
            this.field236 = -1;
        }
        int var2 = this.method173(this.field557, this.field555, this.field146, 1);
        return var2 - this.field556 < 800 && (this.field204[this.field146][this.field555 >> 7][this.field557 >> 7] & 4) != 0 ? this.field146 : 3;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILJHKSAGUC;I)V")
    private final void method192(int arg0, class31 arg1, int arg2) {
        int var4 = arg1.method317((byte) 9, 8);
        if (arg2 <= 0) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (var4 < this.field249) {
            for (int var6 = var4; var6 < this.field249; ++var6) {
                this.field144[this.field143++] = this.field250[var6];
            }
        }
        if (var4 > this.field249) {
            signlink.reporterror(this.field335 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field249 = 0;
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field250[var7];
                class21 var9 = this.field248[var8];
                int var10 = arg1.method317((byte) 9, 1);
                if (var10 == 0) {
                    this.field250[this.field249++] = var8;
                    var9.field1217 = field271;
                } else {
                    int var11 = arg1.method317((byte) 9, 2);
                    if (var11 == 0) {
                        this.field250[this.field249++] = var8;
                        var9.field1217 = field271;
                        this.field252[this.field251++] = var8;
                    } else if (var11 == 1) {
                        this.field250[this.field249++] = var8;
                        var9.field1217 = field271;
                        int var12 = arg1.method317((byte) 9, 3);
                        var9.method439((byte) -49, var12, false);
                        int var13 = arg1.method317((byte) 9, 1);
                        if (var13 == 1) {
                            this.field252[this.field251++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field250[this.field249++] = var8;
                        var9.field1217 = field271;
                        int var14 = arg1.method317((byte) 9, 3);
                        var9.method439((byte) -49, var14, true);
                        int var15 = arg1.method317((byte) 9, 3);
                        var9.method439((byte) -49, var15, true);
                        int var16 = arg1.method317((byte) 9, 1);
                        if (var16 == 1) {
                            this.field252[this.field251++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field144[this.field143++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)Z")
    public final boolean method193(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        class63 var5 = class63.field1490[arg0];
        for (int var6 = 0; var6 < var5.field1544.length && var5.field1544[var6] != -1; ++var6) {
            class63 var7 = class63.field1490[var5.field1544[var6]];
            if (var7.field1525 == 1) {
                var4 |= this.method193(var7.field1500, -63, arg2);
            }
            if (var7.field1525 == 6 && (var7.field1507 != -1 || var7.field1508 != -1)) {
                boolean var8 = this.method134(var7, 18875);
                int var9;
                if (var8) {
                    var9 = var7.field1508;
                } else {
                    var9 = var7.field1507;
                }
                if (var9 != -1) {
                    class36 var10 = class36.field953[var9];
                    var7.field1526 += arg2;
                    while (var7.field1526 > var10.method361(this.field242, var7.field1510)) {
                        var7.field1526 -= var10.method361(this.field242, var7.field1510) + 1;
                        ++var7.field1510;
                        if (var7.field1510 >= var10.field954) {
                            var7.field1510 -= var10.field958;
                            if (var7.field1510 < 0 || var7.field1510 >= var10.field954) {
                                var7.field1510 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        if (arg1 >= 0) {
            throw new NullPointerException();
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method194(boolean arg0) {
        for (int var2 = -1; var2 < this.field249; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field247;
            } else {
                var6 = this.field250[var2];
            }
            class21 var7 = this.field248[var6];
            if (var7 != null && var7.field1218 > 0) {
                --var7.field1218;
                if (var7.field1218 == 0) {
                    var7.field1189 = null;
                }
            }
        }
        this.field295 &= arg0;
        for (int var3 = 0; var3 < this.field441; ++var3) {
            int var4 = this.field442[var3];
            class44 var5 = this.field440[var4];
            if (var5 != null && var5.field1218 > 0) {
                --var5.field1218;
                if (var5.field1218 == 0) {
                    var5.field1189 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLJHKSAGUC;I)V")
    private final void method195(boolean arg0, class31 arg1, int arg2) {
        if (arg0) {
            this.field565 = !this.field565;
        }
        for (int var4 = 0; var4 < this.field251; ++var4) {
            int var5 = this.field252[var4];
            class44 var6 = this.field440[var5];
            int var7 = arg1.method306();
            if ((var7 & 64) != 0) {
                int var8 = arg1.method306();
                int var9 = arg1.method306();
                var6.method442(var8, 49176, var9, field271);
                var6.field1225 = field271 + 300;
                var6.field1226 = arg1.method325(-35277);
                var6.field1227 = arg1.method327(8);
            }
            if ((var7 & 8) != 0) {
                int var10 = arg1.method336((byte) 87);
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = arg1.method325(-35277);
                if (var6.field1231 == var10 && var10 != -1) {
                    int var12 = class36.field953[var10].field967;
                    if (var12 == 1) {
                        var6.field1232 = 0;
                        var6.field1233 = 0;
                        var6.field1234 = var11;
                        var6.field1235 = 0;
                    }
                    if (var12 == 2) {
                        var6.field1235 = 0;
                    }
                } else if (var10 == -1 || var6.field1231 == -1 || class36.field953[var10].field961 >= class36.field953[var6.field1231].field961) {
                    var6.field1231 = var10;
                    var6.field1232 = 0;
                    var6.field1233 = 0;
                    var6.field1234 = var11;
                    var6.field1235 = 0;
                    var6.field1210 = var6.field1198;
                }
            }
            if ((var7 & 16) != 0) {
                int var13 = arg1.method327(8);
                int var14 = arg1.method325(-35277);
                var6.method442(var13, 49176, var14, field271);
                var6.field1225 = field271 + 300;
                var6.field1226 = arg1.method325(-35277);
                var6.field1227 = arg1.method306();
            }
            if ((var7 & 1) != 0) {
                var6.field1080 = class58.method449(arg1.method308());
                var6.field1199 = var6.field1080.field1250;
                var6.field1241 = var6.field1080.field1269;
                var6.field1237 = var6.field1080.field1284;
                var6.field1238 = var6.field1080.field1278;
                var6.field1239 = var6.field1080.field1273;
                var6.field1240 = var6.field1080.field1258;
                var6.field1202 = var6.field1080.field1280;
            }
            if ((var7 & 32) != 0) {
                var6.field1184 = arg1.method308();
                int var15 = arg1.method341(true);
                var6.field1188 = var15 >> 16;
                var6.field1187 = (var15 & 65535) + field271;
                var6.field1185 = 0;
                var6.field1186 = 0;
                if (var6.field1187 > field271) {
                    var6.field1185 = -1;
                }
                if (var6.field1184 == 65535) {
                    var6.field1184 = -1;
                }
            }
            if ((var7 & 4) != 0) {
                var6.field1205 = arg1.method334((byte) -45);
                var6.field1206 = arg1.method335(true);
            }
            if ((var7 & 2) != 0) {
                var6.field1189 = arg1.method313();
                var6.field1218 = 100;
            }
            if ((var7 & 128) != 0) {
                var6.field1223 = arg1.method335(true);
                if (var6.field1223 == 65535) {
                    var6.field1223 = -1;
                }
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field341[var1] = var0 / 4;
        }
        field423 = 10;
        field425 = true;
        field455 = 93;
        field461 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field464 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field567 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field567[var3] = var2 - 1;
            var2 += var2;
        }
    }
}
