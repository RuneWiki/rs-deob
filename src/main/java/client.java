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
public class client extends class65 {

    @OriginalMember(owner = "client", name = "L", descriptor = "Z")
    private boolean field91 = false;

    @OriginalMember(owner = "client", name = "M", descriptor = "Z")
    private boolean field92 = true;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private int field93 = 3353893;

    @OriginalMember(owner = "client", name = "O", descriptor = "[[I")
    private int[][] field94 = new int[104][104];

    @OriginalMember(owner = "client", name = "Q", descriptor = "[LCUKAGIIJ;")
    private class10[] field96 = new class10[20];

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private int field97 = 3;

    @OriginalMember(owner = "client", name = "U", descriptor = "[I")
    private int[] field100 = new int[100];

    @OriginalMember(owner = "client", name = "V", descriptor = "[Ljava/lang/String;")
    private String[] field101 = new String[100];

    @OriginalMember(owner = "client", name = "W", descriptor = "[Ljava/lang/String;")
    private String[] field102 = new String[100];

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private int field103 = 2048;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field104 = 2047;

    @OriginalMember(owner = "client", name = "Z", descriptor = "[LFHQGDDHF;")
    private class23[] field105 = new class23[this.field103];

    @OriginalMember(owner = "client", name = "bb", descriptor = "[I")
    public int[] field107 = new int[this.field103];

    @OriginalMember(owner = "client", name = "db", descriptor = "[I")
    private int[] field109 = new int[this.field103];

    @OriginalMember(owner = "client", name = "eb", descriptor = "[LCFARFRSG;")
    private class8[] field110 = new class8[this.field103];

    @OriginalMember(owner = "client", name = "fb", descriptor = "[[[LCLCMCMIN;")
    private class9[][][] field111 = new class9[4][104][104];

    @OriginalMember(owner = "client", name = "rb", descriptor = "Z")
    private boolean field123 = false;

    @OriginalMember(owner = "client", name = "yb", descriptor = "[I")
    private int[] field130 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "zb", descriptor = "[Ljava/lang/String;")
    private String[] field131 = new String[200];

    @OriginalMember(owner = "client", name = "Ab", descriptor = "[I")
    private int[] field132 = new int[50];

    @OriginalMember(owner = "client", name = "Bb", descriptor = "LCLCMCMIN;")
    private class9 field133 = new class9(field329);

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field134 = 232;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field135 = -1;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "[I")
    private int[] field138 = new int[151];

    @OriginalMember(owner = "client", name = "Hb", descriptor = "[I")
    private int[] field139 = new int[5];

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field154 = 4;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field158 = -1;

    @OriginalMember(owner = "client", name = "dc", descriptor = "[I")
    private int[] field161 = new int[1000];

    @OriginalMember(owner = "client", name = "ec", descriptor = "[I")
    private int[] field162 = new int[1000];

    @OriginalMember(owner = "client", name = "fc", descriptor = "[Ljava/lang/String;")
    private String[] field163 = new String[5];

    @OriginalMember(owner = "client", name = "gc", descriptor = "[Z")
    private boolean[] field164 = new boolean[5];

    @OriginalMember(owner = "client", name = "kc", descriptor = "Z")
    private boolean field168 = false;

    @OriginalMember(owner = "client", name = "lc", descriptor = "Ljava/lang/String;")
    private String field169 = "";

    @OriginalMember(owner = "client", name = "mc", descriptor = "[LCUKAGIIJ;")
    private class10[] field170 = new class10[1000];

    @OriginalMember(owner = "client", name = "nc", descriptor = "[I")
    private int[] field171 = new int[5];

    @OriginalMember(owner = "client", name = "sc", descriptor = "Z")
    private boolean field176 = false;

    @OriginalMember(owner = "client", name = "tc", descriptor = "[[[I")
    private int[][][] field177 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "xc", descriptor = "[I")
    public int[] field181 = new int[1000];

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field182 = 394;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "[I")
    private int[] field188 = new int[class36.field951];

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field190 = -3381;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "Ljava/lang/String;")
    private String field193 = "";

    @OriginalMember(owner = "client", name = "Oc", descriptor = "Z")
    private boolean field198 = false;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "[I")
    private int[] field204 = new int[200];

    @OriginalMember(owner = "client", name = "Wc", descriptor = "LOPFNUBIN;")
    private class48 field206 = new class48();

    @OriginalMember(owner = "client", name = "Yc", descriptor = "Z")
    private boolean field208 = false;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "[I")
    private int[] field209 = new int[151];

    @OriginalMember(owner = "client", name = "qd", descriptor = "Z")
    private boolean field226 = false;

    @OriginalMember(owner = "client", name = "sd", descriptor = "Ljava/lang/String;")
    private String field228 = "";

    @OriginalMember(owner = "client", name = "td", descriptor = "Ljava/lang/String;")
    private String field229 = "";

    @OriginalMember(owner = "client", name = "Bd", descriptor = "[I")
    private int[] field237 = new int[7];

    @OriginalMember(owner = "client", name = "Cd", descriptor = "[B")
    private byte[] field238 = new byte[16384];

    @OriginalMember(owner = "client", name = "Dd", descriptor = "Z")
    public boolean field239 = true;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "[I")
    private int[] field240 = new int[class36.field951];

    @OriginalMember(owner = "client", name = "Fd", descriptor = "Z")
    private boolean field241 = false;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field242 = 17845;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field244 = -1;

    @OriginalMember(owner = "client", name = "Od", descriptor = "[LFDCAWVRL;")
    private class21[] field250 = new class21[13];

    @OriginalMember(owner = "client", name = "Rd", descriptor = "Z")
    private boolean field253 = false;

    @OriginalMember(owner = "client", name = "be", descriptor = "[I")
    private int[] field263 = new int[5];

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field276 = 9177;

    @OriginalMember(owner = "client", name = "we", descriptor = "Z")
    private boolean field284 = true;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field286 = 1;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "Z")
    private boolean field288 = false;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field289 = -1;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "Z")
    private boolean field290 = false;

    @OriginalMember(owner = "client", name = "De", descriptor = "Z")
    private volatile boolean field291 = false;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "Z")
    private boolean field294 = false;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "Z")
    private boolean field296 = true;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "B")
    private byte field298 = 1;

    @OriginalMember(owner = "client", name = "Le", descriptor = "[I")
    private int[] field299 = new int[5];

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field301 = -1;

    @OriginalMember(owner = "client", name = "af", descriptor = "[I")
    private int[] field314 = new int[33];

    @OriginalMember(owner = "client", name = "bf", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field315 = new CRC32();

    @OriginalMember(owner = "client", name = "cf", descriptor = "Z")
    private volatile boolean field316 = false;

    @OriginalMember(owner = "client", name = "ef", descriptor = "[J")
    private long[] field318 = new long[100];

    @OriginalMember(owner = "client", name = "ff", descriptor = "Z")
    private boolean field319 = true;

    @OriginalMember(owner = "client", name = "hf", descriptor = "[I")
    private int[] field321 = new int[50];

    @OriginalMember(owner = "client", name = "kf", descriptor = "[LFDCAWVRL;")
    private class21[] field323 = new class21[2];

    @OriginalMember(owner = "client", name = "lf", descriptor = "[LPJMJGLFE;")
    public class50[] field324 = new class50[5];

    @OriginalMember(owner = "client", name = "sf", descriptor = "[J")
    private long[] field331 = new long[200];

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private int field333 = 2;

    @OriginalMember(owner = "client", name = "Af", descriptor = "[I")
    private int[] field339 = new int[5];

    @OriginalMember(owner = "client", name = "Bf", descriptor = "[LCUKAGIIJ;")
    private class10[] field340 = new class10[8];

    @OriginalMember(owner = "client", name = "Cf", descriptor = "B")
    private byte field341 = 23;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Z")
    private volatile boolean field343 = false;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field345 = -1;

    @OriginalMember(owner = "client", name = "If", descriptor = "Z")
    private boolean field347 = true;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field348 = 128;

    @OriginalMember(owner = "client", name = "Of", descriptor = "LCFARFRSG;")
    private class8 field353 = new class8(new byte[5000], 792);

    @OriginalMember(owner = "client", name = "Pf", descriptor = "[LADGLALPC;")
    private class1[] field354 = new class1[16384];

    @OriginalMember(owner = "client", name = "Rf", descriptor = "[I")
    public int[] field356 = new int[16384];

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field357 = -962;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field359 = -1;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "[LFDCAWVRL;")
    private class21[] field361 = new class21[100];

    @OriginalMember(owner = "client", name = "Yf", descriptor = "Z")
    private boolean field363 = false;

    @OriginalMember(owner = "client", name = "ag", descriptor = "I")
    private int field365 = 2301979;

    @OriginalMember(owner = "client", name = "bg", descriptor = "Z")
    private boolean field366 = false;

    @OriginalMember(owner = "client", name = "cg", descriptor = "[Z")
    private boolean[] field367 = new boolean[5];

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private final int field370 = 100;

    @OriginalMember(owner = "client", name = "gg", descriptor = "[I")
    private int[] field371 = new int[100];

    @OriginalMember(owner = "client", name = "hg", descriptor = "[LCUKAGIIJ;")
    private class10[] field372 = new class10[20];

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field380 = -1;

    @OriginalMember(owner = "client", name = "ug", descriptor = "[I")
    private int[] field385 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "wg", descriptor = "B")
    private byte field387 = -17;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field388 = -1;

    @OriginalMember(owner = "client", name = "yg", descriptor = "[I")
    private int[] field389 = new int[9];

    @OriginalMember(owner = "client", name = "zg", descriptor = "[I")
    private int[] field390 = new int[33];

    @OriginalMember(owner = "client", name = "Hg", descriptor = "[I")
    private int[] field398 = new int[2000];

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field400 = -631;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "Ljava/lang/String;")
    private String field413 = "";

    @OriginalMember(owner = "client", name = "Xg", descriptor = "[I")
    public int[] field414 = new int[2000];

    @OriginalMember(owner = "client", name = "Yg", descriptor = "B")
    private byte field415 = 2;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "I")
    private int field416 = 190;

    @OriginalMember(owner = "client", name = "ah", descriptor = "I")
    private int field417 = 5063219;

    @OriginalMember(owner = "client", name = "bh", descriptor = "B")
    private byte field418 = 6;

    @OriginalMember(owner = "client", name = "ch", descriptor = "I")
    private int field419 = -1;

    @OriginalMember(owner = "client", name = "dh", descriptor = "I")
    private int field420 = -1;

    @OriginalMember(owner = "client", name = "ih", descriptor = "Z")
    private boolean field425 = false;

    @OriginalMember(owner = "client", name = "lh", descriptor = "Z")
    private boolean field428 = false;

    @OriginalMember(owner = "client", name = "nh", descriptor = "Z")
    private boolean field430 = false;

    @OriginalMember(owner = "client", name = "oh", descriptor = "[Ljava/lang/String;")
    private String[] field431 = new String[500];

    @OriginalMember(owner = "client", name = "ph", descriptor = "LCFARFRSG;")
    private class8 field432 = class8.method18(1, 5);

    @OriginalMember(owner = "client", name = "qh", descriptor = "Ljava/lang/String;")
    private String field433 = "";

    @OriginalMember(owner = "client", name = "rh", descriptor = "Z")
    private boolean field434 = false;

    @OriginalMember(owner = "client", name = "uh", descriptor = "[I")
    private int[] field437 = new int[256];

    @OriginalMember(owner = "client", name = "Ch", descriptor = "Z")
    private boolean field445 = false;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field447 = 1;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "Z")
    private boolean field448 = false;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field452 = -68;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "Z")
    private boolean field457 = true;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "Ljava/lang/String;")
    private String field460 = "";

    @OriginalMember(owner = "client", name = "Sh", descriptor = "Ljava/lang/String;")
    private String field461 = "";

    @OriginalMember(owner = "client", name = "Yh", descriptor = "Z")
    private boolean field467 = false;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "B")
    private byte field468 = 19;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field469 = -1;

    @OriginalMember(owner = "client", name = "di", descriptor = "[I")
    private int[] field472 = new int[500];

    @OriginalMember(owner = "client", name = "ei", descriptor = "[I")
    private int[] field473 = new int[500];

    @OriginalMember(owner = "client", name = "fi", descriptor = "[I")
    private int[] field474 = new int[500];

    @OriginalMember(owner = "client", name = "gi", descriptor = "[I")
    private int[] field475 = new int[500];

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field476 = 78;

    @OriginalMember(owner = "client", name = "ii", descriptor = "LCFARFRSG;")
    private class8 field477 = class8.method18(1, 5);

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private int field481 = -1;

    @OriginalMember(owner = "client", name = "ni", descriptor = "[I")
    private int[] field482 = new int[50];

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field483 = -3747;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field485 = 50;

    @OriginalMember(owner = "client", name = "ri", descriptor = "[I")
    private int[] field486 = new int[this.field485];

    @OriginalMember(owner = "client", name = "si", descriptor = "[I")
    private int[] field487 = new int[this.field485];

    @OriginalMember(owner = "client", name = "ti", descriptor = "[I")
    private int[] field488 = new int[this.field485];

    @OriginalMember(owner = "client", name = "ui", descriptor = "[I")
    private int[] field489 = new int[this.field485];

    @OriginalMember(owner = "client", name = "vi", descriptor = "[I")
    private int[] field490 = new int[this.field485];

    @OriginalMember(owner = "client", name = "wi", descriptor = "[I")
    private int[] field491 = new int[this.field485];

    @OriginalMember(owner = "client", name = "xi", descriptor = "[I")
    private int[] field492 = new int[this.field485];

    @OriginalMember(owner = "client", name = "yi", descriptor = "[Ljava/lang/String;")
    private String[] field493 = new String[this.field485];

    @OriginalMember(owner = "client", name = "zi", descriptor = "Ljava/lang/String;")
    private String field494 = "";

    @OriginalMember(owner = "client", name = "Ai", descriptor = "[[I")
    private int[][] field495 = new int[104][104];

    @OriginalMember(owner = "client", name = "Bi", descriptor = "Z")
    private boolean field496 = false;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "[LCUKAGIIJ;")
    private class10[] field497 = new class10[100];

    @OriginalMember(owner = "client", name = "Gi", descriptor = "Z")
    public boolean field501 = false;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "[I")
    private final int[] field502 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "Ri", descriptor = "LCLCMCMIN;")
    private class9 field512 = new class9(field329);

    @OriginalMember(owner = "client", name = "Ui", descriptor = "[I")
    private int[] field515 = new int[4000];

    @OriginalMember(owner = "client", name = "Vi", descriptor = "[I")
    private int[] field516 = new int[4000];

    @OriginalMember(owner = "client", name = "bj", descriptor = "I")
    private int field522 = -1;

    @OriginalMember(owner = "client", name = "cj", descriptor = "LCLCMCMIN;")
    private class9 field523 = new class9(field329);

    @OriginalMember(owner = "client", name = "dj", descriptor = "Z")
    private boolean field524 = false;

    @OriginalMember(owner = "client", name = "hj", descriptor = "[[I")
    private int[][] field528 = new int[104][104];

    @OriginalMember(owner = "client", name = "ij", descriptor = "[LHQFIXEZL;")
    private class28[] field529 = new class28[4];

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private int field530 = -7889;

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    private int field531 = -1;

    @OriginalMember(owner = "client", name = "oj", descriptor = "Z")
    private boolean field535 = false;

    @OriginalMember(owner = "client", name = "pj", descriptor = "Z")
    private boolean field536 = true;

    @OriginalMember(owner = "client", name = "wj", descriptor = "I")
    private int field543 = 7759444;

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private int field545 = 2;

    @OriginalMember(owner = "client", name = "zj", descriptor = "Z")
    private boolean field546 = false;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "[I")
    private int[] field547 = new int[class36.field951];

    @OriginalMember(owner = "client", name = "Bj", descriptor = "I")
    private int field548 = -71;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "Z")
    private boolean field550 = false;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "LCFARFRSG;")
    private class8 field551 = class8.method18(1, 5);

    @OriginalMember(owner = "client", name = "Gj", descriptor = "I")
    private int field553 = 2;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "I")
    private int field555 = 47773;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "Z")
    private boolean field556 = false;

    @OriginalMember(owner = "client", name = "wb", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field128 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "xb", descriptor = "[I")
    private static int[] field129 = new int[99];

    @OriginalMember(owner = "client", name = "Bc", descriptor = "B")
    private static byte field185;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "Ljava/lang/String;")
    private static String field186;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "Z")
    private static boolean field192;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private static int field249;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "B")
    private static byte field252;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private static int field260;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "Z")
    private static boolean field293;

    @OriginalMember(owner = "client", name = "df", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field317;

    @OriginalMember(owner = "client", name = "mf", descriptor = "I")
    private static int field325;

    @OriginalMember(owner = "client", name = "of", descriptor = "Z")
    private static boolean field327;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private static int field329;

    @OriginalMember(owner = "client", name = "eg", descriptor = "[I")
    public static final int[] field369;

    @OriginalMember(owner = "client", name = "ng", descriptor = "Z")
    private static boolean field378;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "[[I")
    public static final int[][] field449;

    @OriginalMember(owner = "client", name = "nj", descriptor = "[I")
    public static int[] field534;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "I")
    private static int field549;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field106;

    @OriginalMember(owner = "client", name = "cb", descriptor = "I")
    private int field108;

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field121;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field122;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field124;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field125;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private static int field126;

    @OriginalMember(owner = "client", name = "vb", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private static int field140;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    private int field142;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field143;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private int field145;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field149;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field152;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private static int field153;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field155;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private static int field156;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field160;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field175;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field189;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "I")
    private int field191;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private static int field201;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private static int field202;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    public int field203;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client", name = "nd", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private int field225;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client", name = "wd", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field234;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field251;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private static int field254;

    @OriginalMember(owner = "client", name = "Td", descriptor = "I")
    private static int field255;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "I")
    private int field258;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field264;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field265;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private static int field268;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private static int field274;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field282;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private int field292;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field306;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field311;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field313;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "client", name = "yf", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field338;

    @OriginalMember(owner = "client", name = "Df", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field350;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private int field351;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "I")
    private static int field352;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private static int field358;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field364;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "client", name = "kg", descriptor = "I")
    private int field375;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private static int field386;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private int field391;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field393;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field401;

    @OriginalMember(owner = "client", name = "eh", descriptor = "I")
    private int field421;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field436;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field438;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client", name = "Th", descriptor = "I")
    private int field462;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "I")
    private int field463;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "I")
    private int field464;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "I")
    private int field465;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client", name = "ci", descriptor = "I")
    private int field471;

    @OriginalMember(owner = "client", name = "ji", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field479;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private static int field498;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private static int field513;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "client", name = "lj", descriptor = "I")
    private int field532;

    @OriginalMember(owner = "client", name = "mj", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client", name = "tj", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client", name = "xj", descriptor = "I")
    private int field544;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "I")
    private static int field554;

    @OriginalMember(owner = "client", name = "Oj", descriptor = "I")
    private int field561;

    @OriginalMember(owner = "client", name = "Pj", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field90;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private static int field95;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private int field98;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field99;

    @OriginalMember(owner = "client", name = "vc", descriptor = "J")
    private long field179;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "J")
    private long field184;

    @OriginalMember(owner = "client", name = "ze", descriptor = "J")
    public long field287;

    @OriginalMember(owner = "client", name = "Me", descriptor = "J")
    private long field300;

    @OriginalMember(owner = "client", name = "gj", descriptor = "J")
    private long field527;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "LCUKAGIIJ;")
    private class10 field136;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "LCUKAGIIJ;")
    private class10 field137;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "LCUKAGIIJ;")
    private class10 field150;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "LCUKAGIIJ;")
    private class10 field199;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "LCUKAGIIJ;")
    private class10 field261;

    @OriginalMember(owner = "client", name = "ae", descriptor = "LCUKAGIIJ;")
    private class10 field262;

    @OriginalMember(owner = "client", name = "og", descriptor = "LCUKAGIIJ;")
    private class10 field379;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "LCUKAGIIJ;")
    private class10 field507;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "LCUKAGIIJ;")
    private class10 field508;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "LCUKAGIIJ;")
    private class10 field509;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "LCUKAGIIJ;")
    private class10 field510;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "LCUKAGIIJ;")
    private class10 field511;

    @OriginalMember(owner = "client", name = "ej", descriptor = "LCUKAGIIJ;")
    private class10 field525;

    @OriginalMember(owner = "client", name = "fj", descriptor = "LCUKAGIIJ;")
    private class10 field526;

    @OriginalMember(owner = "client", name = "gb", descriptor = "LEDCVNWGU;")
    private class17 field112;

    @OriginalMember(owner = "client", name = "hb", descriptor = "LEDCVNWGU;")
    private class17 field113;

    @OriginalMember(owner = "client", name = "ib", descriptor = "LEDCVNWGU;")
    private class17 field114;

    @OriginalMember(owner = "client", name = "jb", descriptor = "LEDCVNWGU;")
    private class17 field115;

    @OriginalMember(owner = "client", name = "kb", descriptor = "LEDCVNWGU;")
    private class17 field116;

    @OriginalMember(owner = "client", name = "lb", descriptor = "LEDCVNWGU;")
    private class17 field117;

    @OriginalMember(owner = "client", name = "mb", descriptor = "LEDCVNWGU;")
    private class17 field118;

    @OriginalMember(owner = "client", name = "nb", descriptor = "LEDCVNWGU;")
    private class17 field119;

    @OriginalMember(owner = "client", name = "ob", descriptor = "LEDCVNWGU;")
    private class17 field120;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "LEDCVNWGU;")
    private class17 field195;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "LEDCVNWGU;")
    private class17 field196;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "LEDCVNWGU;")
    private class17 field197;

    @OriginalMember(owner = "client", name = "cd", descriptor = "LEDCVNWGU;")
    private class17 field212;

    @OriginalMember(owner = "client", name = "dd", descriptor = "LEDCVNWGU;")
    private class17 field213;

    @OriginalMember(owner = "client", name = "ed", descriptor = "LEDCVNWGU;")
    private class17 field214;

    @OriginalMember(owner = "client", name = "fd", descriptor = "LEDCVNWGU;")
    private class17 field215;

    @OriginalMember(owner = "client", name = "gd", descriptor = "LEDCVNWGU;")
    private class17 field216;

    @OriginalMember(owner = "client", name = "hd", descriptor = "LEDCVNWGU;")
    private class17 field217;

    @OriginalMember(owner = "client", name = "id", descriptor = "LEDCVNWGU;")
    private class17 field218;

    @OriginalMember(owner = "client", name = "jd", descriptor = "LEDCVNWGU;")
    private class17 field219;

    @OriginalMember(owner = "client", name = "kd", descriptor = "LEDCVNWGU;")
    private class17 field220;

    @OriginalMember(owner = "client", name = "Te", descriptor = "LEDCVNWGU;")
    private class17 field307;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "LEDCVNWGU;")
    private class17 field308;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "LEDCVNWGU;")
    private class17 field309;

    @OriginalMember(owner = "client", name = "We", descriptor = "LEDCVNWGU;")
    private class17 field310;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "LEIPZGSZT;")
    public class19 field243;

    @OriginalMember(owner = "client", name = "oc", descriptor = "LFDCAWVRL;")
    private class21 field172;

    @OriginalMember(owner = "client", name = "pc", descriptor = "LFDCAWVRL;")
    private class21 field173;

    @OriginalMember(owner = "client", name = "qc", descriptor = "LFDCAWVRL;")
    private class21 field174;

    @OriginalMember(owner = "client", name = "sg", descriptor = "LFDCAWVRL;")
    private class21 field383;

    @OriginalMember(owner = "client", name = "tg", descriptor = "LFDCAWVRL;")
    private class21 field384;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "LFDCAWVRL;")
    private class21 field402;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "LFDCAWVRL;")
    private class21 field403;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "LFDCAWVRL;")
    private class21 field404;

    @OriginalMember(owner = "client", name = "Og", descriptor = "LFDCAWVRL;")
    private class21 field405;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "LFDCAWVRL;")
    private class21 field406;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "LFDCAWVRL;")
    private class21 field408;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "LFDCAWVRL;")
    private class21 field409;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "LFDCAWVRL;")
    private class21 field410;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "LFDCAWVRL;")
    private class21 field411;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "LFDCAWVRL;")
    private class21 field412;

    @OriginalMember(owner = "client", name = "qj", descriptor = "LFDCAWVRL;")
    private class21 field537;

    @OriginalMember(owner = "client", name = "rj", descriptor = "LFDCAWVRL;")
    private class21 field538;

    @OriginalMember(owner = "client", name = "sj", descriptor = "LFDCAWVRL;")
    private class21 field539;

    @OriginalMember(owner = "client", name = "uj", descriptor = "LFDCAWVRL;")
    private class21 field541;

    @OriginalMember(owner = "client", name = "vj", descriptor = "LFDCAWVRL;")
    private class21 field542;

    @OriginalMember(owner = "client", name = "ie", descriptor = "LFDMAFIMR;")
    private class22 field270;

    @OriginalMember(owner = "client", name = "je", descriptor = "LFDMAFIMR;")
    private class22 field271;

    @OriginalMember(owner = "client", name = "ke", descriptor = "LFDMAFIMR;")
    private class22 field272;

    @OriginalMember(owner = "client", name = "le", descriptor = "LFDMAFIMR;")
    private class22 field273;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "LFHQGDDHF;")
    public static class23 field157;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "LOBRIXRSB;")
    private class45 field346;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "LQHZQTTDB;")
    private class52 field312;

    @OriginalMember(owner = "client", name = "bi", descriptor = "LQKKVGPGN;")
    private class53 field470;

    @OriginalMember(owner = "client", name = "bc", descriptor = "LSIPXLNWG;")
    private class57 field159;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "LVSUYIIVA;")
    private class62 field560;

    @OriginalMember(owner = "client", name = "rd", descriptor = "Ljava/lang/String;")
    private String field227;

    @OriginalMember(owner = "client", name = "fe", descriptor = "Ljava/lang/String;")
    public String field267;

    @OriginalMember(owner = "client", name = "he", descriptor = "Ljava/lang/String;")
    private String field269;

    @OriginalMember(owner = "client", name = "ve", descriptor = "Ljava/lang/String;")
    public String field283;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "Ljava/net/Socket;")
    private Socket field141;

    @OriginalMember(owner = "client", name = "uc", descriptor = "Z")
    public static boolean field178;

    @OriginalMember(owner = "client", name = "ne", descriptor = "Z")
    private static boolean field275;

    @OriginalMember(owner = "client", name = "pf", descriptor = "Z")
    private static boolean field328;

    @OriginalMember(owner = "client", name = "rf", descriptor = "Z")
    private static boolean field330;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "Z")
    public static boolean field450;

    @OriginalMember(owner = "client", name = "ad", descriptor = "[I")
    private int[] field210;

    @OriginalMember(owner = "client", name = "bd", descriptor = "[I")
    private int[] field211;

    @OriginalMember(owner = "client", name = "fh", descriptor = "[I")
    private int[] field422;

    @OriginalMember(owner = "client", name = "gh", descriptor = "[I")
    private int[] field423;

    @OriginalMember(owner = "client", name = "hh", descriptor = "[I")
    private int[] field424;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "[I")
    private int[] field499;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "[I")
    private int[] field500;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "[I")
    private int[] field517;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "[I")
    private int[] field518;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "[I")
    private int[] field519;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "[I")
    private int[] field520;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "[I")
    private int[] field557;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "[I")
    private int[] field558;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "[I")
    private int[] field559;

    @OriginalMember(owner = "client", name = "li", descriptor = "[LFDCAWVRL;")
    private class21[] field480;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "[[B")
    private byte[][] field151;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "[[B")
    private byte[][] field407;

    @OriginalMember(owner = "client", name = "dg", descriptor = "[[[B")
    private byte[][][] field368;

    @OriginalMember(owner = "client", name = "kh", descriptor = "[[[I")
    private int[][][] field427;

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method76(String arg0) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (this.field276 != arg2) {
            this.field111 = null;
        }
        if (arg5 >= 1 && arg3 >= 1 && arg5 <= 102 && arg3 <= 102) {
            if (field328 && this.field302 != arg0) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg7 == 0) {
                var9 = this.field159.method522(arg0, arg5, arg3);
            }
            if (arg7 == 1) {
                var9 = this.field159.method523(arg3, -601, arg0, arg5);
            }
            if (arg7 == 2) {
                var9 = this.field159.method524(arg0, arg5, arg3);
            }
            if (arg7 == 3) {
                var9 = this.field159.method525(arg0, arg5, arg3);
            }
            if (var9 != 0) {
                int var13 = this.field159.method526(arg0, arg5, arg3, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg7 == 0) {
                    this.field159.method513(arg0, arg3, true, arg5);
                    class54 var17 = class54.method486(var14);
                    if (var17.field1365) {
                        this.field529[arg0].method305(var17.field1354, (byte) 2, var15, var16, arg5, arg3);
                    }
                }
                if (arg7 == 1) {
                    this.field159.method514(-24120, arg3, arg0, arg5);
                }
                if (arg7 == 2) {
                    this.field159.method515(arg5, 6, arg0, arg3);
                    class54 var18 = class54.method486(var14);
                    if (var18.field1380 + arg5 > 103 || var18.field1380 + arg3 > 103 || var18.field1339 + arg5 > 103 || var18.field1339 + arg3 > 103) {
                        return;
                    }
                    if (var18.field1365) {
                        this.field529[arg0].method306((byte) 2, var18.field1380, var18.field1354, var16, arg5, arg3, var18.field1339);
                    }
                }
                if (arg7 == 3) {
                    this.field159.method516(arg3, -210, arg5, arg0);
                    class54 var19 = class54.method486(var14);
                    if (var19.field1365 && var19.field1353) {
                        this.field529[arg0].method308(arg5, -984, arg3);
                    }
                }
            }
            if (arg1 >= 0) {
                int var20 = arg0;
                if (arg0 < 3 && (this.field368[1][arg5][arg3] & 2) == 2) {
                    var20 = arg0 + 1;
                }
                class14.method242(arg6, arg1, this.field427, arg3, arg5, arg0, var20, this.field529[arg0], arg4, this.field159, true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method78(byte arg0) {
        if (arg0 == 81) {
            signlink.midiplay = false;
            signlink.midifade = 0;
            signlink.midi = "stop";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LIFXJSFHR;I)V")
    private final void method79(class29 arg0, int arg1) {
        if (arg1 == 41195) {
            int var3 = 0;
            int var4 = -1;
            int var5 = 0;
            int var6 = 0;
            if (arg0.field805 == 0) {
                var3 = this.field159.method522(arg0.field804, arg0.field806, arg0.field807);
            }
            if (arg0.field805 == 1) {
                var3 = this.field159.method523(arg0.field807, -601, arg0.field804, arg0.field806);
            }
            if (arg0.field805 == 2) {
                var3 = this.field159.method524(arg0.field804, arg0.field806, arg0.field807);
            }
            if (arg0.field805 == 3) {
                var3 = this.field159.method525(arg0.field804, arg0.field806, arg0.field807);
            }
            if (var3 != 0) {
                int var7 = this.field159.method526(arg0.field804, arg0.field806, arg0.field807, var3);
                var4 = var3 >> 14 & 32767;
                var5 = var7 & 31;
                var6 = var7 >> 6;
            }
            arg0.field801 = var4;
            arg0.field803 = var5;
            arg0.field802 = var6;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)V")
    public final void method80(byte arg0, int arg1) {
        if (arg0 == 7) {
            if (arg1 >= 0) {
                if (this.field235 != 0) {
                    this.field235 = 0;
                    this.field226 = true;
                }
                int var3 = this.field472[arg1];
                int var4 = this.field473[arg1];
                int var5 = this.field474[arg1];
                int var6 = this.field475[arg1];
                if (var5 >= 2000) {
                    var5 -= 2000;
                }
                if (var5 == 534) {
                    this.field477.method19(176, 687);
                    this.field477.method21(var4);
                    this.field477.method21(var6);
                    this.field477.method54(var3, true);
                    this.field503 = 0;
                    this.field504 = var4;
                    this.field505 = var3;
                    this.field506 = 2;
                    if (class48.field1221[var4].field1229 == this.field481) {
                        this.field506 = 1;
                    }
                    if (class48.field1221[var4].field1229 == this.field522) {
                        this.field506 = 3;
                    }
                }
                if (var5 == 500) {
                    this.field477.method19(198, 687);
                    this.field477.method55(0, var6);
                    this.field477.method56(var3, 599);
                    this.field477.method55(0, var4);
                    this.field503 = 0;
                    this.field504 = var4;
                    this.field505 = var3;
                    this.field506 = 2;
                    if (class48.field1221[var4].field1229 == this.field481) {
                        this.field506 = 1;
                    }
                    if (class48.field1221[var4].field1229 == this.field522) {
                        this.field506 = 3;
                    }
                }
                if (var5 == 343) {
                    boolean var7 = this.method192(var3, 0, field157.field1535[0], 0, 0, var4, 2, 0, false, 0, field157.field1536[0], this.field154);
                    if (!var7) {
                        this.method192(var3, 1, field157.field1535[0], 0, 0, var4, 2, 1, false, 0, field157.field1536[0], this.field154);
                    }
                    this.field303 = super.field1637;
                    this.field304 = super.field1638;
                    this.field306 = 2;
                    this.field305 = 0;
                    this.field477.method19(106, 687);
                    this.field477.method55(0, var6);
                    this.field477.method56(this.field454 + var4, 599);
                    this.field477.method54(this.field453 + var3, true);
                    this.field477.method56(this.field280, 599);
                    this.field477.method55(0, this.field281);
                    this.field477.method55(0, this.field282);
                }
                if (var5 == 31) {
                    class1 var9 = this.field354[var6];
                    if (var9 != null) {
                        this.method192(var9.field1535[0], 1, field157.field1535[0], 0, 0, var9.field1536[0], 2, 1, false, 0, field157.field1536[0], this.field154);
                        this.field303 = super.field1637;
                        this.field304 = super.field1638;
                        this.field306 = 2;
                        this.field305 = 0;
                        this.field477.method19(7, 687);
                        this.field477.method54(this.field265, true);
                        this.field477.method54(var6, true);
                    }
                }
                if (var5 == 751) {
                    this.field477.method19(133, 687);
                    this.field477.method54(this.field280, true);
                    this.field477.method56(this.field282, 599);
                    this.field477.method55(0, var3);
                    this.field477.method54(this.field281, true);
                    this.field477.method55(0, var4);
                    this.field477.method56(var6, 599);
                    this.field503 = 0;
                    this.field504 = var4;
                    this.field505 = var3;
                    this.field506 = 2;
                    if (class48.field1221[var4].field1229 == this.field481) {
                        this.field506 = 1;
                    }
                    if (class48.field1221[var4].field1229 == this.field522) {
                        this.field506 = 3;
                    }
                }
                if (var5 == 137) {
                    class23 var10 = this.field105[var6];
                    if (var10 != null) {
                        this.method192(var10.field1535[0], 1, field157.field1535[0], 0, 0, var10.field1536[0], 2, 1, false, 0, field157.field1536[0], this.field154);
                        this.field303 = super.field1637;
                        this.field304 = super.field1638;
                        this.field306 = 2;
                        this.field305 = 0;
                        this.field477.method19(39, 687);
                        this.field477.method55(0, var6);
                    }
                }
                if (var5 == 694) {
                    this.field477.method19(148, 687);
                    this.field477.method21(var4);
                    this.field477.method54(var3, true);
                    this.field477.method21(var6);
                    this.field503 = 0;
                    this.field504 = var4;
                    this.field505 = var3;
                    this.field506 = 2;
                    if (class48.field1221[var4].field1229 == this.field481) {
                        this.field506 = 1;
                    }
                    if (class48.field1221[var4].field1229 == this.field522) {
                        this.field506 = 3;
                    }
                }
                if (var5 == 390) {
                    class23 var11 = this.field105[var6];
                    if (var11 != null) {
                        this.method192(var11.field1535[0], 1, field157.field1535[0], 0, 0, var11.field1536[0], 2, 1, false, 0, field157.field1536[0], this.field154);
                        this.field303 = super.field1637;
                        this.field304 = super.field1638;
                        this.field306 = 2;
                        this.field305 = 0;
                        this.field477.method19(25, 687);
                        this.field477.method21(var6);
                    }
                }
                if (var5 == 800) {
                    class1 var12 = this.field354[var6];
                    if (var12 != null) {
                        this.method192(var12.field1535[0], 1, field157.field1535[0], 0, 0, var12.field1536[0], 2, 1, false, 0, field157.field1536[0], this.field154);
                        this.field303 = super.field1637;
                        this.field304 = super.field1638;
                        this.field306 = 2;
                        this.field305 = 0;
                        this.field477.method19(242, 687);
                        this.field477.method21(var6);
                    }
                }
                if (var5 == 248) {
                    boolean var13 = this.method192(var3, 0, field157.field1535[0], 0, 0, var4, 2, 0, false, 0, field157.field1536[0], this.field154);
                    if (!var13) {
                        this.method192(var3, 1, field157.field1535[0], 0, 0, var4, 2, 1, false, 0, field157.field1536[0], this.field154);
                    }
                    this.field303 = super.field1637;
                    this.field304 = super.field1638;
                    this.field306 = 2;
                    this.field305 = 0;
                    this.field477.method19(119, 687);
                    this.field477.method54(this.field454 + var4, true);
                    this.field477.method56(this.field453 + var3, 599);
                    this.field477.method54(var6, true);
                }
                if (var5 == 184) {
                    class23 var15 = this.field105[var6];
                    if (var15 != null) {
                        this.method192(var15.field1535[0], 1, field157.field1535[0], 0, 0, var15.field1536[0], 2, 1, false, 0, field157.field1536[0], this.field154);
                        this.field303 = super.field1637;
                        this.field304 = super.field1638;
                        this.field306 = 2;
                        this.field305 = 0;
                        field554 += var6;
                        if (field554 >= 88) {
                            this.field477.method19(91, 687);
                            this.field477.method23(12777488);
                            field554 = 0;
                        }
                        this.field477.method19(126, 687);
                        this.field477.method55(0, var6);
                    }
                }
                if (var5 == 1561) {
                    class1 var16 = this.field354[var6];
                    if (var16 != null) {
                        class47 var17 = var16.field2;
                        if (var17.field1175 != null) {
                            var17 = var17.method446(223);
                        }
                        if (var17 != null) {
                            String var18;
                            if (var17.field1211 != null) {
                                var18 = new String(var17.field1211);
                            } else {
                                var18 = "It's a " + var17.field1199 + ".";
                            }
                            this.method120(var18, "", 2, 0);
                        }
                    }
                }
                if (var5 == 766) {
                    this.field477.method19(44, 687);
                    this.field477.method21(var6);
                    this.field477.method54(var3, true);
                    this.field477.method55(0, var4);
                    this.field503 = 0;
                    this.field504 = var4;
                    this.field505 = var3;
                    this.field506 = 2;
                    if (class48.field1221[var4].field1229 == this.field481) {
                        this.field506 = 1;
                    }
                    if (class48.field1221[var4].field1229 == this.field522) {
                        this.field506 = 3;
                    }
                }
                if (var5 == 293) {
                    this.field477.method19(200, 687);
                    this.field477.method21(var4);
                    class48 var19 = class48.field1221[var4];
                    if (var19.field1219 != null && var19.field1219[0][0] == 5) {
                        int var20 = var19.field1219[0][1];
                        this.field414[var20] = 1 - this.field414[var20];
                        this.method202(var20, 0);
                        this.field91 = true;
                    }
                }
                if (var5 == 668) {
                    class1 var21 = this.field354[var6];
                    if (var21 != null) {
                        this.method192(var21.field1535[0], 1, field157.field1535[0], 0, 0, var21.field1536[0], 2, 1, false, 0, field157.field1536[0], this.field154);
                        this.field303 = super.field1637;
                        this.field304 = super.field1638;
                        this.field306 = 2;
                        this.field305 = 0;
                        this.field477.method19(76, 687);
                        this.field477.method21(var6);
                    }
                }
                if (var5 == 401) {
                    boolean var22 = this.method192(var3, 0, field157.field1535[0], 0, 0, var4, 2, 0, false, 0, field157.field1536[0], this.field154);
                    if (!var22) {
                        this.method192(var3, 1, field157.field1535[0], 0, 0, var4, 2, 1, false, 0, field157.field1536[0], this.field154);
                    }
                    this.field303 = super.field1637;
                    this.field304 = super.field1638;
                    this.field306 = 2;
                    this.field305 = 0;
                    this.field477.method19(83, 687);
                    this.field477.method55(0, this.field454 + var4);
                    this.field477.method21(this.field453 + var3);
                    this.field477.method54(var6, true);
                }
                if (var5 == 233) {
                    this.field477.method19(102, 687);
                    this.field477.method21(var4);
                    this.field477.method56(var6, 599);
                    this.field477.method56(var3, 599);
                    this.field477.method54(this.field265, true);
                    this.field503 = 0;
                    this.field504 = var4;
                    this.field505 = var3;
                    this.field506 = 2;
                    if (class48.field1221[var4].field1229 == this.field481) {
                        this.field506 = 1;
                    }
                    if (class48.field1221[var4].field1229 == this.field522) {
                        this.field506 = 3;
                    }
                }
                if (var5 == 220) {
                    class1 var24 = this.field354[var6];
                    if (var24 != null) {
                        this.method192(var24.field1535[0], 1, field157.field1535[0], 0, 0, var24.field1536[0], 2, 1, false, 0, field157.field1536[0], this.field154);
                        this.field303 = super.field1637;
                        this.field304 = super.field1638;
                        this.field306 = 2;
                        this.field305 = 0;
                        field352 += var6;
                        if (field352 >= 92) {
                            this.field477.method19(161, 687);
                            this.field477.method21(64442);
                            field352 = 0;
                        }
                        this.field477.method19(183, 687);
                        this.field477.method55(0, var6);
                    }
                }
                if (var5 == 406) {
                    this.field477.method19(27, 687);
                    this.field477.method21(var4);
                    this.field477.method54(var6, true);
                    this.field477.method21(var3);
                    this.field503 = 0;
                    this.field504 = var4;
                    this.field505 = var3;
                    this.field506 = 2;
                    if (class48.field1221[var4].field1229 == this.field481) {
                        this.field506 = 1;
                    }
                    if (class48.field1221[var4].field1229 == this.field522) {
                        this.field506 = 3;
                    }
                }
                if (var5 == 542) {
                    class48 var25 = class48.field1221[var4];
                    this.field264 = 1;
                    this.field265 = var4;
                    this.field266 = var25.field1259;
                    this.field279 = 0;
                    this.field91 = true;
                    String var26 = var25.field1253;
                    if (var26.indexOf(" ") != -1) {
                        var26 = var26.substring(0, var26.indexOf(" "));
                    }
                    String var27 = var25.field1253;
                    if (var27.indexOf(" ") != -1) {
                        var27 = var27.substring(var27.indexOf(" ") + 1);
                    }
                    this.field267 = var26 + " " + var25.field1248 + " " + var27;
                    if (this.field266 == 16) {
                        this.field91 = true;
                        this.field97 = 3;
                        this.field430 = true;
                    }
                } else if (var5 == 34) {
                    this.field279 = 1;
                    this.field280 = var3;
                    this.field281 = var4;
                    this.field282 = var6;
                    this.field283 = class34.method329(var6).field904;
                    this.field264 = 0;
                    this.field91 = true;
                } else {
                    if (var5 == 1741) {
                        int var28 = var6 >> 14 & 32767;
                        class54 var29 = class54.method486(var28);
                        String var30;
                        if (var29.field1382 != null) {
                            var30 = new String(var29.field1382);
                        } else {
                            var30 = "It's a " + var29.field1377 + ".";
                        }
                        this.method120(var30, "", 2, 0);
                    }
                    if (var5 == 921) {
                        this.method195(394, var4, var3, var6);
                        this.field477.method19(246, 687);
                        this.field477.method55(0, var6 >> 14 & 32767);
                        this.field477.method55(0, this.field453 + var3);
                        this.field477.method55(0, this.field454 + var4);
                    }
                    if (var5 == 277) {
                        this.method195(394, var4, var3, var6);
                        this.field477.method19(4, 687);
                        this.field477.method55(0, this.field454 + var4);
                        this.field477.method55(0, this.field453 + var3);
                        this.field477.method54(var6 >> 14 & 32767, true);
                    }
                    if (var5 == 635) {
                        this.method179(true);
                    }
                    if (var5 == 754) {
                        this.field477.method19(200, 687);
                        this.field477.method21(var4);
                        class48 var31 = class48.field1221[var4];
                        if (var31.field1219 != null && var31.field1219[0][0] == 5) {
                            int var32 = var31.field1219[0][1];
                            if (this.field414[var32] != var31.field1276[0]) {
                                this.field414[var32] = var31.field1276[0];
                                this.method202(var32, 0);
                                this.field91 = true;
                            }
                        }
                    }
                    if (var5 == 189) {
                        if (!this.field448) {
                            this.field159.method534((byte) 7, super.field1638 - 4, super.field1637 - 4);
                        } else {
                            this.field159.method534((byte) 7, var4 - 4, var3 - 4);
                        }
                    }
                    if (var5 == 1491) {
                        class34 var33 = class34.method329(var6);
                        String var34;
                        if (var33.field927 != null) {
                            var34 = new String(var33.field927);
                        } else {
                            var34 = "It's a " + var33.field904 + ".";
                        }
                        this.method120(var34, "", 2, 0);
                    }
                    if (var5 == 803) {
                        class1 var35 = this.field354[var6];
                        if (var35 != null) {
                            this.method192(var35.field1535[0], 1, field157.field1535[0], 0, 0, var35.field1536[0], 2, 1, false, 0, field157.field1536[0], this.field154);
                            this.field303 = super.field1637;
                            this.field304 = super.field1638;
                            this.field306 = 2;
                            this.field305 = 0;
                            this.field477.method19(164, 687);
                            this.field477.method56(var6, 599);
                        }
                    }
                    if (var5 == 4) {
                        boolean var36 = this.method192(var3, 0, field157.field1535[0], 0, 0, var4, 2, 0, false, 0, field157.field1536[0], this.field154);
                        if (!var36) {
                            this.method192(var3, 1, field157.field1535[0], 0, 0, var4, 2, 1, false, 0, field157.field1536[0], this.field154);
                        }
                        this.field303 = super.field1637;
                        this.field304 = super.field1638;
                        this.field306 = 2;
                        this.field305 = 0;
                        this.field477.method19(235, 687);
                        this.field477.method54(this.field454 + var4, true);
                        this.field477.method21(var6);
                        this.field477.method55(0, this.field265);
                        this.field477.method55(0, this.field453 + var3);
                    }
                    if (var5 == 1881) {
                        class34 var38 = class34.method329(var6);
                        class48 var39 = class48.field1221[var4];
                        String var40;
                        if (var39 != null && var39.field1275[var3] >= 100000) {
                            var40 = var39.field1275[var3] + " x " + var38.field904;
                        } else if (var38.field927 != null) {
                            var40 = new String(var38.field927);
                        } else {
                            var40 = "It's a " + var38.field904 + ".";
                        }
                        this.method120(var40, "", 2, 0);
                    }
                    if (var5 == 371) {
                        class23 var41 = this.field105[var6];
                        if (var41 != null) {
                            this.method192(var41.field1535[0], 1, field157.field1535[0], 0, 0, var41.field1536[0], 2, 1, false, 0, field157.field1536[0], this.field154);
                            this.field303 = super.field1637;
                            this.field304 = super.field1638;
                            this.field306 = 2;
                            this.field305 = 0;
                            this.field477.method19(201, 687);
                            this.field477.method54(var6, true);
                        }
                    }
                    if (var5 == 995) {
                        class23 var42 = this.field105[var6];
                        if (var42 != null) {
                            this.method192(var42.field1535[0], 1, field157.field1535[0], 0, 0, var42.field1536[0], 2, 1, false, 0, field157.field1536[0], this.field154);
                            this.field303 = super.field1637;
                            this.field304 = super.field1638;
                            this.field306 = 2;
                            this.field305 = 0;
                            this.field477.method19(16, 687);
                            this.field477.method54(this.field280, true);
                            this.field477.method56(this.field282, 599);
                            this.field477.method56(this.field281, 599);
                            this.field477.method55(0, var6);
                        }
                    }
                    if (var5 == 604) {
                        boolean var43 = this.method192(var3, 0, field157.field1535[0], 0, 0, var4, 2, 0, false, 0, field157.field1536[0], this.field154);
                        if (!var43) {
                            this.method192(var3, 1, field157.field1535[0], 0, 0, var4, 2, 1, false, 0, field157.field1536[0], this.field154);
                        }
                        this.field303 = super.field1637;
                        this.field304 = super.field1638;
                        this.field306 = 2;
                        this.field305 = 0;
                        this.field477.method19(63, 687);
                        this.field477.method55(0, var6);
                        this.field477.method21(this.field453 + var3);
                        this.field477.method55(0, this.field454 + var4);
                    }
                    if (var5 == 82) {
                        class48 var45 = class48.field1221[var4];
                        boolean var46 = true;
                        if (var45.field1258 > 0) {
                            var46 = this.method151(var45, (byte) -105);
                        }
                        if (var46) {
                            this.field477.method19(200, 687);
                            this.field477.method21(var4);
                        }
                    }
                    if (var5 == 615) {
                        this.field477.method19(193, 687);
                        this.field477.method56(var6, 599);
                        this.field477.method55(0, var4);
                        this.field477.method55(0, var3);
                        this.field503 = 0;
                        this.field504 = var4;
                        this.field505 = var3;
                        this.field506 = 2;
                        if (class48.field1221[var4].field1229 == this.field481) {
                            this.field506 = 1;
                        }
                        if (class48.field1221[var4].field1229 == this.field522) {
                            this.field506 = 3;
                        }
                    }
                    if (var5 == 63) {
                        boolean var47 = this.method192(var3, 0, field157.field1535[0], 0, 0, var4, 2, 0, false, 0, field157.field1536[0], this.field154);
                        if (!var47) {
                            this.method192(var3, 1, field157.field1535[0], 0, 0, var4, 2, 1, false, 0, field157.field1536[0], this.field154);
                        }
                        this.field303 = super.field1637;
                        this.field304 = super.field1638;
                        this.field306 = 2;
                        this.field305 = 0;
                        this.field477.method19(90, 687);
                        this.field477.method54(this.field453 + var3, true);
                        this.field477.method54(this.field454 + var4, true);
                        this.field477.method55(0, var6);
                    }
                    if (var5 == 860) {
                        if ((this.field453 & 3) == 0) {
                            ++field358;
                        }
                        if (field358 >= 93) {
                            this.field477.method19(204, 687);
                            this.field477.method23(160113);
                            field358 = 0;
                        }
                        this.method195(394, var4, var3, var6);
                        this.field477.method19(169, 687);
                        this.field477.method56(this.field454 + var4, 599);
                        this.field477.method54(this.field453 + var3, true);
                        this.field477.method56(var6 >> 14 & 32767, 599);
                    }
                    if (var5 == 71 && !this.field434) {
                        this.field477.method19(236, 687);
                        this.field477.method21(var4);
                        this.field434 = true;
                    }
                    if (var5 == 263) {
                        this.field477.method19(105, 687);
                        this.field477.method21(var4);
                        this.field477.method56(var3, 599);
                        this.field477.method21(var6);
                        this.field503 = 0;
                        this.field504 = var4;
                        this.field505 = var3;
                        this.field506 = 2;
                        if (class48.field1221[var4].field1229 == this.field481) {
                            this.field506 = 1;
                        }
                        if (class48.field1221[var4].field1229 == this.field522) {
                            this.field506 = 3;
                        }
                    }
                    if (var5 == 255) {
                        class1 var49 = this.field354[var6];
                        if (var49 != null) {
                            this.method192(var49.field1535[0], 1, field157.field1535[0], 0, 0, var49.field1536[0], 2, 1, false, 0, field157.field1536[0], this.field154);
                            this.field303 = super.field1637;
                            this.field304 = super.field1638;
                            this.field306 = 2;
                            this.field305 = 0;
                            this.field477.method19(47, 687);
                            this.field477.method56(var6, 599);
                        }
                    }
                    if (var5 == 382) {
                        String var50 = this.field431[arg1];
                        int var51 = var50.indexOf("@whi@");
                        if (var51 != -1) {
                            long var52 = class71.method587(var50.substring(var51 + 5).trim());
                            int var54 = -1;
                            for (int var55 = 0; var55 < this.field376; ++var55) {
                                if (this.field331[var55] == var52) {
                                    var54 = var55;
                                    break;
                                }
                            }
                            if (var54 != -1 && this.field204[var54] > 0) {
                                this.field226 = true;
                                this.field235 = 0;
                                this.field123 = true;
                                this.field494 = "";
                                this.field236 = 3;
                                this.field527 = this.field331[var54];
                                this.field169 = "Enter message to send to " + this.field131[var54];
                            }
                        }
                    }
                    if (var5 == 279) {
                        boolean var56 = this.method192(var3, 0, field157.field1535[0], 0, 0, var4, 2, 0, false, 0, field157.field1536[0], this.field154);
                        if (!var56) {
                            this.method192(var3, 1, field157.field1535[0], 0, 0, var4, 2, 1, false, 0, field157.field1536[0], this.field154);
                        }
                        this.field303 = super.field1637;
                        this.field304 = super.field1638;
                        this.field306 = 2;
                        this.field305 = 0;
                        this.field477.method19(220, 687);
                        this.field477.method56(this.field453 + var3, 599);
                        this.field477.method55(0, var6);
                        this.field477.method56(this.field454 + var4, 599);
                    }
                    if (var5 == 475) {
                        class23 var58 = this.field105[var6];
                        if (var58 != null) {
                            this.method192(var58.field1535[0], 1, field157.field1535[0], 0, 0, var58.field1536[0], 2, 1, false, 0, field157.field1536[0], this.field154);
                            this.field303 = super.field1637;
                            this.field304 = super.field1638;
                            this.field306 = 2;
                            this.field305 = 0;
                            this.field477.method19(115, 687);
                            this.field477.method55(0, var6);
                            this.field477.method56(this.field265, 599);
                        }
                    }
                    if (var5 == 28 && this.method195(394, var4, var3, var6)) {
                        this.field477.method19(167, 687);
                        this.field477.method56(this.field454 + var4, 599);
                        this.field477.method54(var6 >> 14 & 32767, true);
                        this.field477.method21(this.field281);
                        this.field477.method54(this.field453 + var3, true);
                        this.field477.method55(0, this.field282);
                        this.field477.method54(this.field280, true);
                    }
                    if (var5 == 917 || var5 == 235) {
                        String var59 = this.field431[arg1];
                        int var60 = var59.indexOf("@whi@");
                        if (var60 != -1) {
                            String var61 = var59.substring(var60 + 5).trim();
                            String var62 = class71.method591(1, class71.method588(class71.method587(var61), (byte) -66));
                            boolean var63 = false;
                            for (int var64 = 0; var64 < this.field106; ++var64) {
                                class23 var65 = this.field105[this.field107[var64]];
                                if (var65 != null && var65.field733 != null && var65.field733.equalsIgnoreCase(var62)) {
                                    this.method192(var65.field1535[0], 1, field157.field1535[0], 0, 0, var65.field1536[0], 2, 1, false, 0, field157.field1536[0], this.field154);
                                    if (var5 == 917) {
                                        this.field477.method19(39, 687);
                                        this.field477.method55(0, this.field107[var64]);
                                    }
                                    if (var5 == 235) {
                                        this.field477.method19(201, 687);
                                        this.field477.method54(this.field107[var64], true);
                                    }
                                    var63 = true;
                                    break;
                                }
                            }
                            if (!var63) {
                                this.method120("Unable to find " + var62, "", 2, 0);
                            }
                        }
                    }
                    if (var5 == 471) {
                        this.field477.method19(226, 687);
                        this.field477.method54(var3, true);
                        this.field477.method55(0, var6);
                        this.field477.method55(0, var4);
                        this.field503 = 0;
                        this.field504 = var4;
                        this.field505 = var3;
                        this.field506 = 2;
                        if (class48.field1221[var4].field1229 == this.field481) {
                            this.field506 = 1;
                        }
                        if (class48.field1221[var4].field1229 == this.field522) {
                            this.field506 = 3;
                        }
                    }
                    if (var5 == 1485) {
                        ++field202;
                        if (field202 >= 136) {
                            this.field477.method19(103, 687);
                            this.field477.method20(183);
                            field202 = 0;
                        }
                        this.method195(394, var4, var3, var6);
                        this.field477.method19(36, 687);
                        this.field477.method55(0, this.field453 + var3);
                        this.field477.method55(0, this.field454 + var4);
                        this.field477.method55(0, var6 >> 14 & 32767);
                    }
                    if (var5 == 101) {
                        class23 var66 = this.field105[var6];
                        if (var66 != null) {
                            this.method192(var66.field1535[0], 1, field157.field1535[0], 0, 0, var66.field1536[0], 2, 1, false, 0, field157.field1536[0], this.field154);
                            this.field303 = super.field1637;
                            this.field304 = super.field1638;
                            this.field306 = 2;
                            this.field305 = 0;
                            this.field477.method19(12, 687);
                            this.field477.method21(var6);
                        }
                    }
                    if (var5 == 48) {
                        field254 += var6;
                        if (field254 >= 90) {
                            this.field477.method19(243, 687);
                            this.field477.method21(8335);
                            field254 = 0;
                        }
                        this.field477.method19(94, 687);
                        this.field477.method56(var3, 599);
                        this.field477.method21(var4);
                        this.field477.method56(var6, 599);
                        this.field503 = 0;
                        this.field504 = var4;
                        this.field505 = var3;
                        this.field506 = 2;
                        if (class48.field1221[var4].field1229 == this.field481) {
                            this.field506 = 1;
                        }
                        if (class48.field1221[var4].field1229 == this.field522) {
                            this.field506 = 3;
                        }
                    }
                    if (var5 == 693) {
                        class1 var67 = this.field354[var6];
                        if (var67 != null) {
                            this.method192(var67.field1535[0], 1, field157.field1535[0], 0, 0, var67.field1536[0], 2, 1, false, 0, field157.field1536[0], this.field154);
                            this.field303 = super.field1637;
                            this.field304 = super.field1638;
                            this.field306 = 2;
                            this.field305 = 0;
                            this.field477.method19(223, 687);
                            this.field477.method54(this.field282, true);
                            this.field477.method56(var6, 599);
                            this.field477.method55(0, this.field280);
                            this.field477.method54(this.field281, true);
                        }
                    }
                    if (var5 == 50 || var5 == 992 || var5 == 748 || var5 == 806) {
                        String var68 = this.field431[arg1];
                        int var69 = var68.indexOf("@whi@");
                        if (var69 != -1) {
                            long var70 = class71.method587(var68.substring(var69 + 5).trim());
                            if (var5 == 50) {
                                this.method200(var70, 858);
                            }
                            if (var5 == 992) {
                                this.method116(4, var70);
                            }
                            if (var5 == 748) {
                                this.method117(var70, 44593);
                            }
                            if (var5 == 806) {
                                this.method215(var70, 0);
                            }
                        }
                    }
                    if (var5 == 464 && this.method195(394, var4, var3, var6)) {
                        this.field477.method19(51, 687);
                        this.field477.method54(var6 >> 14 & 32767, true);
                        this.field477.method55(0, this.field454 + var4);
                        this.field477.method56(this.field453 + var3, 599);
                        this.field477.method56(this.field265, 599);
                    }
                    if (var5 == 215) {
                        this.method195(394, var4, var3, var6);
                        this.field477.method19(245, 687);
                        this.field477.method21(this.field453 + var3);
                        this.field477.method55(0, this.field454 + var4);
                        this.field477.method56(var6 >> 14 & 32767, 599);
                    }
                    if (var5 == 853) {
                        String var72 = this.field431[arg1];
                        int var73 = var72.indexOf("@whi@");
                        if (var73 != -1) {
                            if (this.field481 == -1) {
                                this.method179(true);
                                this.field433 = var72.substring(var73 + 5).trim();
                                this.field363 = false;
                                for (int var74 = 0; var74 < class48.field1221.length; ++var74) {
                                    if (class48.field1221[var74] != null && class48.field1221[var74].field1258 == 600) {
                                        this.field158 = this.field481 = class48.field1221[var74].field1229;
                                        break;
                                    }
                                }
                            } else {
                                this.method120("Please close the interface you have open before using 'report abuse'", "", 2, 0);
                            }
                        }
                    }
                    if (var5 == 607) {
                        this.field477.method19(233, 687);
                        this.field477.method55(0, var4);
                        this.field477.method55(0, var6);
                        this.field477.method56(var3, 599);
                        this.field503 = 0;
                        this.field504 = var4;
                        this.field505 = var3;
                        this.field506 = 2;
                        if (class48.field1221[var4].field1229 == this.field481) {
                            this.field506 = 1;
                        }
                        if (class48.field1221[var4].field1229 == this.field522) {
                            this.field506 = 3;
                        }
                    }
                    this.field279 = 0;
                    this.field264 = 0;
                    this.field91 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method81(int arg0) {
        int var2 = this.field222;
        int var3 = this.field223;
        int var4 = this.field224;
        int var5 = this.field225;
        int var6 = 6116423;
        class46.method436(var2, var3, 2, var6, var4, var5);
        if (arg0 != -14011) {
            this.method178();
        }
        class46.method436(var2 + 1, var3 + 1, 2, 0, var4 - 2, 16);
        class46.method437(7, var5 - 19, var3 + 18, var2 + 1, 0, var4 - 2);
        this.field272.method282("Choose Option", var2 + 3, var6, 619, var3 + 14);
        int var7 = super.field1630;
        int var8 = super.field1631;
        if (this.field221 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field221 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field221 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field278; ++var9) {
            int var10 = (this.field278 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field272.method286(var11, this.field431[var9], var2 + 3, true, var10, 0);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method82(boolean arg0) {
        if (arg0) {
            this.field111 = null;
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method581(true);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field481 != -1 && this.field481 == this.field158) {
                        if (var2 == 8 && this.field433.length() > 0) {
                            this.field433 = this.field433.substring(0, this.field433.length() - 1);
                        }
                        break;
                    }
                    if (this.field123) {
                        if (var2 >= 32 && var2 <= 122 && this.field494.length() < 80) {
                            this.field494 = this.field494 + (char) var2;
                            this.field226 = true;
                        }
                        if (var2 == 8 && this.field494.length() > 0) {
                            this.field494 = this.field494.substring(0, this.field494.length() - 1);
                            this.field226 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field123 = false;
                            this.field226 = true;
                            if (this.field236 == 1) {
                                long var3 = class71.method587(this.field494);
                                this.method200(var3, 858);
                            }
                            if (this.field236 == 2 && this.field376 > 0) {
                                long var5 = class71.method587(this.field494);
                                this.method117(var5, 44593);
                            }
                            if (this.field236 == 3 && this.field494.length() > 0) {
                                this.field477.method19(74, 687);
                                this.field477.method20(0);
                                int var7 = this.field477.field72;
                                this.field477.method26((byte) 9, this.field527);
                                class18.method268(this.field494, (byte) 6, this.field477);
                                this.field477.method29(this.field477.field72 - var7, false);
                                this.field494 = class18.method269(-211, this.field494);
                                this.field494 = class43.method382(-211, this.field494);
                                this.method120(this.field494, class71.method591(1, class71.method588(this.field527, (byte) -66)), 2, 6);
                                if (this.field175 == 2) {
                                    this.field175 = 1;
                                    this.field550 = true;
                                    this.field477.method19(55, 687);
                                    this.field477.method20(this.field438);
                                    this.field477.method20(this.field175);
                                    this.field477.method20(this.field155);
                                }
                            }
                            if (this.field236 == 4 && this.field382 < 100) {
                                long var8 = class71.method587(this.field494);
                                this.method116(4, var8);
                            }
                            if (this.field236 == 5 && this.field382 > 0) {
                                long var10 = class71.method587(this.field494);
                                this.method215(var10, 0);
                            }
                        }
                    } else if (this.field235 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field193.length() < 10) {
                            this.field193 = this.field193 + (char) var2;
                            this.field226 = true;
                        }
                        if (var2 == 8 && this.field193.length() > 0) {
                            this.field193 = this.field193.substring(0, this.field193.length() - 1);
                            this.field226 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field193.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field193);
                                } catch (Exception var22) {
                                }
                                this.field477.method19(116, 687);
                                this.field477.method24(var12);
                            }
                            this.field235 = 0;
                            this.field226 = true;
                        }
                    } else if (this.field235 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field193.length() < 12) {
                            this.field193 = this.field193 + (char) var2;
                            this.field226 = true;
                        }
                        if (var2 == 8 && this.field193.length() > 0) {
                            this.field193 = this.field193.substring(0, this.field193.length() - 1);
                            this.field226 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field193.length() > 0) {
                                this.field477.method19(209, 687);
                                this.field477.method26((byte) 9, class71.method587(this.field193));
                            }
                            this.field235 = 0;
                            this.field226 = true;
                        }
                    } else if (this.field522 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field413.length() < 80) {
                            this.field413 = this.field413 + (char) var2;
                            this.field226 = true;
                        }
                        if (var2 == 8 && this.field413.length() > 0) {
                            this.field413 = this.field413.substring(0, this.field413.length() - 1);
                            this.field226 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field413.length() > 0) {
                            if (this.field344 == 2) {
                                if (this.field413.equals("::clientdrop")) {
                                    this.method88(true);
                                }
                                if (this.field413.equals("::lag")) {
                                    this.method148(true);
                                }
                                if (this.field413.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field346.method419(2, field275); ++var13) {
                                        this.field346.method413(true, (byte) 1, 2, var13);
                                    }
                                }
                                if (this.field413.equals("::fpson")) {
                                    field178 = true;
                                }
                                if (this.field413.equals("::fpsoff")) {
                                    field178 = false;
                                }
                                if (this.field413.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field529[var14].field797[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field413.startsWith("::")) {
                                this.field477.method19(221, 687);
                                this.field477.method20(this.field413.length() - 1);
                                this.field477.method27(this.field413.substring(2));
                            } else {
                                String var17 = this.field413.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field413 = this.field413.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field413 = this.field413.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field413 = this.field413.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field413 = this.field413.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field413 = this.field413.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field413 = this.field413.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field413 = this.field413.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field413 = this.field413.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field413 = this.field413.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field413 = this.field413.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field413 = this.field413.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field413 = this.field413.substring(6);
                                }
                                String var19 = this.field413.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field413 = this.field413.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field413 = this.field413.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field413 = this.field413.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field413 = this.field413.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field413 = this.field413.substring(6);
                                }
                                this.field477.method19(92, 687);
                                this.field477.method20(0);
                                int var21 = this.field477.field72;
                                this.field353.field72 = 0;
                                class18.method268(this.field413, (byte) 6, this.field353);
                                this.field477.method66(this.field353.field72, this.field353.field71, 0, false);
                                this.field477.method47(var20, (byte) 3);
                                this.field477.method46(var18, 0);
                                this.field477.method29(this.field477.field72 - var21, false);
                                this.field413 = class18.method269(-211, this.field413);
                                this.field413 = class43.method382(-211, this.field413);
                                field157.field1564 = this.field413;
                                field157.field1532 = var18;
                                field157.field1525 = var20;
                                field157.field1558 = 150;
                                if (this.field344 == 2) {
                                    this.method120(field157.field1564, "@cr2@" + field157.field733, 2, 2);
                                } else if (this.field344 == 1) {
                                    this.method120(field157.field1564, "@cr1@" + field157.field733, 2, 2);
                                } else {
                                    this.method120(field157.field1564, field157.field733, 2, 2);
                                }
                                if (this.field438 == 2) {
                                    this.field438 = 3;
                                    this.field550 = true;
                                    this.field477.method19(55, 687);
                                    this.field477.method20(this.field438);
                                    this.field477.method20(this.field175);
                                    this.field477.method20(this.field155);
                                }
                            }
                            this.field413 = "";
                            this.field226 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field433.length() < 12) {
                this.field433 = this.field433 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LOMIIKHIV;IIII)V")
    public final void method83(class47 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 76 / arg2;
        if (this.field278 < 400) {
            if (arg0.field1175 != null) {
                arg0 = arg0.method446(223);
            }
            if (arg0 != null) {
                if (arg0.field1210) {
                    String var7 = arg0.field1199;
                    if (arg0.field1174 != 0) {
                        var7 = var7 + method189(arg0.field1174, field157.field726, 0) + " (level-" + arg0.field1174 + ")";
                    }
                    if (this.field279 == 1) {
                        this.field431[this.field278] = "Use " + this.field283 + " with @yel@" + var7;
                        this.field474[this.field278] = 693;
                        this.field475[this.field278] = arg3;
                        this.field472[this.field278] = arg1;
                        this.field473[this.field278] = arg4;
                        ++this.field278;
                    } else {
                        if (this.field264 == 1) {
                            if ((this.field266 & 2) == 2) {
                                this.field431[this.field278] = this.field267 + " @yel@" + var7;
                                this.field474[this.field278] = 31;
                                this.field475[this.field278] = arg3;
                                this.field472[this.field278] = arg1;
                                this.field473[this.field278] = arg4;
                                ++this.field278;
                                return;
                            }
                        } else {
                            if (arg0.field1204 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg0.field1204[var8] != null && !arg0.field1204[var8].equalsIgnoreCase("attack")) {
                                        this.field431[this.field278] = arg0.field1204[var8] + " @yel@" + var7;
                                        if (var8 == 0) {
                                            this.field474[this.field278] = 803;
                                        }
                                        if (var8 == 1) {
                                            this.field474[this.field278] = 220;
                                        }
                                        if (var8 == 2) {
                                            this.field474[this.field278] = 668;
                                        }
                                        if (var8 == 3) {
                                            this.field474[this.field278] = 800;
                                        }
                                        if (var8 == 4) {
                                            this.field474[this.field278] = 255;
                                        }
                                        this.field475[this.field278] = arg3;
                                        this.field472[this.field278] = arg1;
                                        this.field473[this.field278] = arg4;
                                        ++this.field278;
                                    }
                                }
                            }
                            if (arg0.field1204 != null) {
                                for (int var9 = 4; var9 >= 0; --var9) {
                                    if (arg0.field1204[var9] != null && arg0.field1204[var9].equalsIgnoreCase("attack")) {
                                        short var10 = 0;
                                        if (arg0.field1174 > field157.field726) {
                                            var10 = 2000;
                                        }
                                        this.field431[this.field278] = arg0.field1204[var9] + " @yel@" + var7;
                                        if (var9 == 0) {
                                            this.field474[this.field278] = var10 + 803;
                                        }
                                        if (var9 == 1) {
                                            this.field474[this.field278] = var10 + 220;
                                        }
                                        if (var9 == 2) {
                                            this.field474[this.field278] = var10 + 668;
                                        }
                                        if (var9 == 3) {
                                            this.field474[this.field278] = var10 + 800;
                                        }
                                        if (var9 == 4) {
                                            this.field474[this.field278] = var10 + 255;
                                        }
                                        this.field475[this.field278] = arg3;
                                        this.field472[this.field278] = arg1;
                                        this.field473[this.field278] = arg4;
                                        ++this.field278;
                                    }
                                }
                            }
                            this.field431[this.field278] = "Examine @yel@" + var7;
                            this.field474[this.field278] = 1561;
                            this.field475[this.field278] = arg3;
                            this.field472[this.field278] = arg1;
                            this.field473[this.field278] = arg4;
                            ++this.field278;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZII)V")
    public final void method84(boolean arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field231 = -1;
        }
        signlink.midivol = arg2;
        if (arg0) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method85(byte arg0) {
        this.field291 = false;
        while (this.field316) {
            this.field291 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var3) {
            }
        }
        this.field383 = null;
        this.field384 = null;
        this.field480 = null;
        this.field517 = null;
        if (arg0 == 4) {
            boolean var2 = false;
            this.field518 = null;
            this.field519 = null;
            this.field520 = null;
            this.field210 = null;
            this.field211 = null;
            this.field499 = null;
            this.field500 = null;
            this.field261 = null;
            this.field262 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILFDCAWVRL;)V")
    public final void method86(int arg0, class21 arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field210.length; ++var4) {
            this.field210[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field210[var17] = (int) (Math.random() * 256.0D);
        }
        this.field230 += arg0;
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field211[var16] = (this.field210[var16 - 1] + this.field210[var16 + 1] + this.field210[var16 - 128] + this.field210[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field210;
            this.field210 = this.field211;
            this.field211 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field706; ++var8) {
                for (int var9 = 0; var9 < arg1.field705; ++var9) {
                    if (arg1.field703[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field707;
                        int var11 = var8 + 16 + arg1.field708;
                        int var12 = (var11 << 7) + var10;
                        this.field210[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method87(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method88(boolean arg0) {
        if (this.field234 > 0) {
            this.method154(190);
        } else {
            this.field309.method264(this.field483);
            this.field271.method278(144, "Connection lost", 0, 257, 2);
            this.field271.method278(143, "Connection lost", 16777215, 256, 2);
            this.field271.method278(159, "Please wait - attempting to reestablish", 0, 257, 2);
            if (!arg0) {
                this.field231 = this.field432.method30();
            }
            this.field271.method278(158, "Please wait - attempting to reestablish", 16777215, 256, 2);
            this.field309.method265(4, 4, super.field1622, 0);
            this.field514 = 0;
            this.field148 = 0;
            class52 var2 = this.field312;
            this.field501 = false;
            this.field200 = 0;
            this.method114(this.field460, this.field461, true);
            if (!this.field501) {
                this.method154(190);
            }
            try {
                var2.method469();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field325 = Integer.parseInt(this.getParameter("nodeid"));
        field326 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method214(field274);
        } else {
            method122(-296);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field327 = false;
        } else {
            field327 = true;
        }
        this.method578(503, 4, 765);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public final String method89(int arg0, boolean arg1) {
        this.field501 &= arg1;
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Z")
    public final boolean method90(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        if (arg2 != 44494) {
            this.field357 = 475;
        }
        class48 var5 = class48.field1221[arg1];
        for (int var6 = 0; var6 < var5.field1240.length && var5.field1240[var6] != -1; ++var6) {
            class48 var7 = class48.field1221[var5.field1240[var6]];
            if (var7.field1273 == 1) {
                var4 |= this.method90(arg0, var7.field1215, 44494);
            }
            if (var7.field1273 == 6 && (var7.field1261 != -1 || var7.field1262 != -1)) {
                boolean var8 = this.method204(var7, 232);
                int var9;
                if (var8) {
                    var9 = var7.field1262;
                } else {
                    var9 = var7.field1261;
                }
                if (var9 != -1) {
                    class32 var10 = class32.field816[var9];
                    var7.field1238 += arg0;
                    while (var7.field1238 > var10.method322((byte) 5, var7.field1274)) {
                        var7.field1238 -= var10.method322((byte) 5, var7.field1274) + 1;
                        ++var7.field1274;
                        if (var7.field1274 >= var10.field817) {
                            var7.field1274 -= var10.field821;
                            if (var7.field1274 < 0 || var7.field1274 >= var10.field817) {
                                var7.field1274 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field1273 == 6 && var7.field1236 != 0) {
                int var11 = var7.field1236 >> 16;
                int var12 = var7.field1236 << 16 >> 16;
                int var13 = arg0 * var11;
                int var14 = arg0 * var12;
                var7.field1244 = var7.field1244 + var13 & 2047;
                var7.field1245 = var7.field1245 + var14 & 2047;
                var4 = true;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method91(boolean arg0) {
        try {
            this.field531 = -1;
            this.field133.method75();
            this.field512.method75();
            class59.method550(942);
            this.method203((byte) 56);
            this.field159.method496(0);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field529[var2].method300();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field368[var3][var4][var5] = 0;
                    }
                }
            }
            class14 var6 = new class14(104, 104, this.field427, 123, this.field368);
            int var7 = this.field407.length;
            this.field477.method19(241, 687);
            if (!this.field467) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field557[var8] >> 8) * 64 - this.field453;
                    int var10 = (this.field557[var8] & 255) * 64 - this.field454;
                    byte[] var11 = this.field407[var8];
                    if (var11 != null) {
                        var6.method246(var9, var11, (this.field435 - 6) * 8, false, (this.field436 - 6) * 8, var10, this.field529);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field557[var12] >> 8) * 64 - this.field453;
                    int var14 = (this.field557[var12] & 255) * 64 - this.field454;
                    byte[] var15 = this.field407[var12];
                    if (var15 == null && this.field436 < 800) {
                        var6.method236(var14, true, 64, 64, var13);
                    }
                }
                ++field156;
                if (field156 > 138) {
                    field156 = 0;
                    this.field477.method19(180, 687);
                    this.field477.method23(13980256);
                }
                this.field477.method19(241, 687);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field151[var16];
                    if (var17 != null) {
                        int var18 = (this.field557[var16] >> 8) * 64 - this.field453;
                        int var19 = (this.field557[var16] & 255) * 64 - this.field454;
                        var6.method253(this.field159, this.field529, var17, -267, var19, var18);
                    }
                }
            }
            if (this.field467) {
                int var20 = 0;
                label248: while (true) {
                    if (var20 >= 4) {
                        for (int var30 = 0; var30 < 13; ++var30) {
                            for (int var31 = 0; var31 < 13; ++var31) {
                                int var32 = this.field177[0][var30][var31];
                                if (var32 == -1) {
                                    var6.method236(var31 * 8, true, 8, 8, var30 * 8);
                                }
                            }
                        }
                        this.field477.method19(241, 687);
                        int var33 = 0;
                        while (true) {
                            if (var33 >= 4) {
                                break label248;
                            }
                            for (int var34 = 0; var34 < 13; ++var34) {
                                for (int var35 = 0; var35 < 13; ++var35) {
                                    int var36 = this.field177[var33][var34][var35];
                                    if (var36 != -1) {
                                        int var37 = var36 >> 24 & 3;
                                        int var38 = var36 >> 1 & 3;
                                        int var39 = var36 >> 14 & 1023;
                                        int var40 = var36 >> 3 & 2047;
                                        int var41 = (var39 / 8 << 8) + var40 / 8;
                                        for (int var42 = 0; var42 < this.field557.length; ++var42) {
                                            if (this.field557[var42] == var41 && this.field151[var42] != null) {
                                                var6.method251(this.field151[var42], (var40 & 7) * 8, this.field529, var33, true, var37, var34 * 8, this.field159, var35 * 8, var38, (var39 & 7) * 8);
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
                            int var23 = this.field177[var20][var21][var22];
                            if (var23 != -1) {
                                int var24 = var23 >> 24 & 3;
                                int var25 = var23 >> 1 & 3;
                                int var26 = var23 >> 14 & 1023;
                                int var27 = var23 >> 3 & 2047;
                                int var28 = (var26 / 8 << 8) + var27 / 8;
                                for (int var29 = 0; var29 < this.field557.length; ++var29) {
                                    if (this.field557[var29] == var28 && this.field407[var29] != null) {
                                        var6.method252(var24, 868, (var27 & 7) * 8, this.field407[var29], var20, (var26 & 7) * 8, this.field529, var25, var21 * 8, var22 * 8);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field477.method19(241, 687);
            var6.method247(this.field159, this.field529, this.field468);
            this.field309.method264(this.field483);
            this.field477.method19(241, 687);
            int var43 = class14.field619;
            if (var43 > this.field302) {
                var43 = this.field302;
            }
            if (var43 < this.field302 - 1) {
                int var44 = this.field302 - 1;
            }
            if (field328) {
                this.field159.method497(class14.field619, true);
            } else {
                this.field159.method497(0, true);
            }
            for (int var45 = 0; var45 < 104; ++var45) {
                for (int var46 = 0; var46 < 104; ++var46) {
                    this.method150(var45, var46);
                }
            }
            this.method167(true);
        } catch (Exception var59) {
        }
        class54.field1362.method371();
        if (super.field1625 != null) {
            this.field477.method19(128, 687);
            this.field477.method24(1057001181);
        }
        if (field328 && signlink.cache_dat != null) {
            int var48 = this.field346.method419(0, field275);
            for (int var49 = 0; var49 < var48; ++var49) {
                int var50 = this.field346.method422(0, var49);
                if ((var50 & 121) == 0) {
                    class37.method340(var49, -36868);
                }
            }
        }
        System.gc();
        class59.method551(-41007, 20);
        this.field346.method425((byte) 50);
        int var51 = (this.field435 - 6) / 8 - 1;
        int var52 = (this.field435 + 6) / 8 + 1;
        int var53 = (this.field436 - 6) / 8 - 1;
        int var54 = (this.field436 + 6) / 8 + 1;
        this.field501 &= arg0;
        if (this.field524) {
            var51 = 49;
            var52 = 50;
            var53 = 49;
            var54 = 50;
        }
        for (int var55 = var51; var55 <= var52; ++var55) {
            for (int var56 = var53; var56 <= var54; ++var56) {
                if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
                    int var57 = this.field346.method424(0, var56, var55, (byte) 5);
                    if (var57 != -1) {
                        this.field346.method421(var57, -212, 3);
                    }
                    int var58 = this.field346.method424(1, var56, var55, (byte) 5);
                    if (var58 != -1) {
                        this.field346.method421(var58, -212, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBILCUKAGIIJ;)V")
    public final void method92(int arg0, byte arg1, int arg2, class10 arg3) {
        if (arg1 == 4) {
            boolean var5 = false;
        } else {
            this.field231 = this.field432.method30();
        }
        int var6 = arg0 * arg0 + arg2 * arg2;
        if (var6 > 4225 && var6 < 90000) {
            int var7 = this.field349 + this.field332 & 2047;
            int var8 = class37.field1030[var7];
            int var9 = class37.field1031[var7];
            int var10 = var8 * 256 / (this.field285 + 256);
            int var11 = var9 * 256 / (this.field285 + 256);
            int var12 = arg0 * var11 + arg2 * var10 >> 16;
            int var13 = arg2 * var11 - arg0 * var10 >> 16;
            double var14 = Math.atan2((double) var12, (double) var13);
            int var16 = (int) (Math.sin(var14) * 63.0D);
            int var17 = (int) (Math.cos(var14) * 57.0D);
            this.field379.method228(20, 83 - var17 - 20, 20, var14, 15, 256, 0, 15, var16 + 94 + 4 - 10);
        } else {
            this.method159(610, arg0, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method93(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class29 var11 = null;
        for (class29 var12 = (class29) this.field523.method71(); var12 != null; var12 = (class29) this.field523.method73(67)) {
            if (var12.field804 == arg7 && var12.field806 == arg2 && var12.field807 == arg5 && var12.field805 == arg3) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class29();
            var11.field804 = arg7;
            var11.field805 = arg3;
            var11.field806 = arg2;
            var11.field807 = arg5;
            this.method79(var11, 41195);
            this.field523.method68(var11);
        }
        var11.field798 = arg6;
        var11.field800 = arg0;
        var11.field799 = arg1;
        var11.field809 = arg9;
        if (arg8 <= 0) {
            field260 = this.field470.method475();
        }
        var11.field808 = arg4;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)I")
    public final int method94(int arg0) {
        int var2 = 3;
        if (arg0 != 26935) {
            this.field191 = 135;
        }
        if (this.field443 < 310) {
            int var3 = this.field440 >> 7;
            int var4 = this.field442 >> 7;
            int var5 = field157.field1555 >> 7;
            int var6 = field157.field1556 >> 7;
            if ((this.field368[this.field302][var3][var4] & 4) != 0) {
                var2 = this.field302;
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
                    if ((this.field368[this.field302][var3][var4] & 4) != 0) {
                        var2 = this.field302;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field368[this.field302][var3][var4] & 4) != 0) {
                            var2 = this.field302;
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
                    if ((this.field368[this.field302][var3][var4] & 4) != 0) {
                        var2 = this.field302;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field368[this.field302][var3][var4] & 4) != 0) {
                            var2 = this.field302;
                        }
                    }
                }
            }
        }
        if ((this.field368[this.field302][field157.field1555 >> 7][field157.field1556 >> 7] & 4) != 0) {
            var2 = this.field302;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)I")
    public final int method95(int arg0) {
        int var2 = this.method197(this.field440, this.field302, this.field442, -235);
        if (arg0 != 651) {
            return this.field555;
        } else {
            return var2 - this.field441 < 800 && (this.field368[this.field302][this.field440 >> 7][this.field442 >> 7] & 4) != 0 ? this.field302 : 3;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LOPFNUBIN;Z)Z")
    public final boolean method96(class48 arg0, boolean arg1) {
        this.field501 &= arg1;
        int var3 = arg0.field1258;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field431[this.field278] = "Remove @whi@" + arg0.field1269;
                this.field474[this.field278] = 806;
                ++this.field278;
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
            this.field431[this.field278] = "Remove @whi@" + this.field131[var3];
            this.field474[this.field278] = 748;
            ++this.field278;
            this.field431[this.field278] = "Message @whi@" + this.field131[var3];
            this.field474[this.field278] = 382;
            ++this.field278;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method97(boolean arg0) {
        if (arg0) {
            field293 = !field293;
        }
        while (true) {
            class44 var2 = this.field346.method417();
            if (var2 == null) {
                return;
            }
            if (var2.field1106 == 0) {
                class37.method339(var2.field1107, var2.field1104, (byte) 3);
                if ((this.field346.method422(0, var2.field1107) & 98) != 0) {
                    this.field91 = true;
                    if (this.field522 != -1) {
                        this.field226 = true;
                    }
                }
            }
            if (var2.field1106 == 1 && var2.field1104 != null) {
                class7.method14(444, var2.field1104);
            }
            if (var2.field1106 == 2 && this.field295 == var2.field1107 && var2.field1104 != null) {
                this.method100(var2.field1104, 49435, this.field296);
            }
            if (var2.field1106 == 3 && this.field311 == 1) {
                for (int var3 = 0; var3 < this.field407.length; ++var3) {
                    if (this.field558[var3] == var2.field1107) {
                        this.field407[var3] = var2.field1104;
                        if (var2.field1104 == null) {
                            this.field558[var3] = -1;
                        }
                        break;
                    }
                    if (this.field559[var3] == var2.field1107) {
                        this.field151[var3] = var2.field1104;
                        if (var2.field1104 == null) {
                            this.field559[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field1106 == 93 && this.field346.method414((byte) 9, var2.field1107)) {
                class14.method244(new class8(var2.field1104, 792), this.field346, 8);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method98(int arg0) {
        if (arg0 != 8) {
            this.field231 = this.field432.method30();
        }
        try {
            int var2 = field157.field1555 + this.field544;
            int var3 = field157.field1556 + this.field552;
            if (this.field165 - var2 < -500 || this.field165 - var2 > 500 || this.field166 - var3 < -500 || this.field166 - var3 > 500) {
                this.field165 = var2;
                this.field166 = var3;
            }
            if (this.field165 != var2) {
                this.field165 += (var2 - this.field165) / 16;
            }
            if (this.field166 != var3) {
                this.field166 += (var3 - this.field166) / 16;
            }
            if (super.field1640[1] == 1) {
                this.field350 += (-24 - this.field350) / 2;
            } else if (super.field1640[2] == 1) {
                this.field350 += (24 - this.field350) / 2;
            } else {
                this.field350 /= 2;
            }
            if (super.field1640[3] == 1) {
                this.field351 += (12 - this.field351) / 2;
            } else if (super.field1640[4] == 1) {
                this.field351 += (-12 - this.field351) / 2;
            } else {
                this.field351 /= 2;
            }
            this.field349 = this.field350 / 2 + this.field349 & 2047;
            this.field348 += this.field351 / 2;
            if (this.field348 < 128) {
                this.field348 = 128;
            }
            if (this.field348 > 383) {
                this.field348 = 383;
            }
            ++field498;
            if (field498 > 60) {
                field498 = 0;
                this.field477.method19(64, 687);
            }
            int var4 = this.field165 >> 7;
            int var5 = this.field166 >> 7;
            int var6 = this.method197(this.field165, this.field302, this.field166, -235);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field302;
                        if (var10 < 3 && (this.field368[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field427[var10][var8][var9];
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
            if (var12 > this.field320) {
                this.field320 += (var12 - this.field320) / 24;
            } else if (var12 < this.field320) {
                this.field320 += (var12 - this.field320) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field157.field1555 + "," + field157.field1556 + "," + this.field165 + "," + this.field166 + "," + this.field435 + "," + this.field436 + "," + this.field453 + "," + this.field454);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method99(int arg0) {
        if (!this.field253 && !this.field241 && !this.field428) {
            ++field259;
            int var2 = 23 / arg0;
            if (!this.field501) {
                this.method211((byte) -128, false);
            } else {
                this.method175(this.field400);
            }
            this.field540 = 0;
        } else {
            this.method165(true);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BIZ)V")
    public final void method100(byte[] arg0, int arg1, boolean arg2) {
        if (arg1 == 49435) {
            if (this.field347) {
                signlink.midifade = arg2 ? 1 : 0;
                signlink.midisave(arg0, arg0.length);
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method101(int arg0) {
        if (arg0 == -24513) {
            if (this.field278 >= 2 || this.field279 != 0 || this.field264 != 0) {
                String var2;
                if (this.field279 == 1 && this.field278 < 2) {
                    var2 = "Use " + this.field283 + " with...";
                } else if (this.field264 == 1 && this.field278 < 2) {
                    var2 = this.field267 + "...";
                } else {
                    var2 = this.field431[this.field278 - 1];
                }
                if (this.field278 > 2) {
                    var2 = var2 + "@whi@ / " + (this.field278 - 2) + " more options";
                }
                this.field272.method287(0, var2, 15, field183 / 1000, 16777215, true, 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method102(byte arg0) {
        if (this.field415 == arg0) {
            boolean var2 = false;
        } else {
            field329 = this.field470.method475();
        }
        if (super.field1636 == 1) {
            if (super.field1637 >= 539 && super.field1637 <= 573 && super.field1638 >= 169 && super.field1638 < 205 && this.field130[0] != -1) {
                this.field91 = true;
                this.field97 = 0;
                this.field430 = true;
            }
            if (super.field1637 >= 569 && super.field1637 <= 599 && super.field1638 >= 168 && super.field1638 < 205 && this.field130[1] != -1) {
                this.field91 = true;
                this.field97 = 1;
                this.field430 = true;
            }
            if (super.field1637 >= 597 && super.field1637 <= 627 && super.field1638 >= 168 && super.field1638 < 205 && this.field130[2] != -1) {
                this.field91 = true;
                this.field97 = 2;
                this.field430 = true;
            }
            if (super.field1637 >= 625 && super.field1637 <= 669 && super.field1638 >= 168 && super.field1638 < 203 && this.field130[3] != -1) {
                this.field91 = true;
                this.field97 = 3;
                this.field430 = true;
            }
            if (super.field1637 >= 666 && super.field1637 <= 696 && super.field1638 >= 168 && super.field1638 < 205 && this.field130[4] != -1) {
                this.field91 = true;
                this.field97 = 4;
                this.field430 = true;
            }
            if (super.field1637 >= 694 && super.field1637 <= 724 && super.field1638 >= 168 && super.field1638 < 205 && this.field130[5] != -1) {
                this.field91 = true;
                this.field97 = 5;
                this.field430 = true;
            }
            if (super.field1637 >= 722 && super.field1637 <= 756 && super.field1638 >= 169 && super.field1638 < 205 && this.field130[6] != -1) {
                this.field91 = true;
                this.field97 = 6;
                this.field430 = true;
            }
            if (super.field1637 >= 540 && super.field1637 <= 574 && super.field1638 >= 466 && super.field1638 < 502 && this.field130[7] != -1) {
                this.field91 = true;
                this.field97 = 7;
                this.field430 = true;
            }
            if (super.field1637 >= 572 && super.field1637 <= 602 && super.field1638 >= 466 && super.field1638 < 503 && this.field130[8] != -1) {
                this.field91 = true;
                this.field97 = 8;
                this.field430 = true;
            }
            if (super.field1637 >= 599 && super.field1637 <= 629 && super.field1638 >= 466 && super.field1638 < 503 && this.field130[9] != -1) {
                this.field91 = true;
                this.field97 = 9;
                this.field430 = true;
            }
            if (super.field1637 >= 627 && super.field1637 <= 671 && super.field1638 >= 467 && super.field1638 < 502 && this.field130[10] != -1) {
                this.field91 = true;
                this.field97 = 10;
                this.field430 = true;
            }
            if (super.field1637 >= 669 && super.field1637 <= 699 && super.field1638 >= 466 && super.field1638 < 503 && this.field130[11] != -1) {
                this.field91 = true;
                this.field97 = 11;
                this.field430 = true;
            }
            if (super.field1637 >= 696 && super.field1637 <= 726 && super.field1638 >= 466 && super.field1638 < 503 && this.field130[12] != -1) {
                this.field91 = true;
                this.field97 = 12;
                this.field430 = true;
            }
            if (super.field1637 >= 724 && super.field1637 <= 758 && super.field1638 >= 466 && super.field1638 < 502 && this.field130[13] != -1) {
                this.field91 = true;
                this.field97 = 13;
                this.field430 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method103(int arg0) {
        if (arg0 != -47591) {
            this.field231 = -1;
        }
        if (this.field342 != 0) {
            int var2 = 0;
            if (this.field479 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field102[var3] != null) {
                    int var4 = this.field100[var3];
                    String var5 = this.field101[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field175 == 0 || this.field175 == 1 && this.method158(this.field366, var5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field1630 > 4 && super.field1631 - 4 > var9 - 10 && super.field1631 - 4 <= var9 + 3) {
                            int var10 = this.field271.method280(498, "From:  " + var5 + this.field102[var3]) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field1630 < var10 + 4) {
                                if (this.field344 >= 1) {
                                    this.field431[this.field278] = "Report abuse @whi@" + var5;
                                    this.field474[this.field278] = 2853;
                                    ++this.field278;
                                }
                                this.field431[this.field278] = "Add ignore @whi@" + var5;
                                this.field474[this.field278] = 2992;
                                ++this.field278;
                                this.field431[this.field278] = "Add friend @whi@" + var5;
                                this.field474[this.field278] = 2050;
                                ++this.field278;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field175 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method104(boolean arg0) {
        this.field501 &= arg0;
        if (this.field142 == 0) {
            int var2 = super.field1620 / 2 - 80;
            int var3 = super.field1621 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field1636 == 1 && super.field1637 >= var2 - 75 && super.field1637 <= var2 + 75 && super.field1638 >= var14 - 20 && super.field1638 <= var14 + 20) {
                this.field142 = 3;
                this.field362 = 0;
            }
            int var4 = super.field1620 / 2 + 80;
            if (super.field1636 == 1 && super.field1637 >= var4 - 75 && super.field1637 <= var4 + 75 && super.field1638 >= var14 - 20 && super.field1638 <= var14 + 20) {
                this.field228 = "";
                this.field229 = "Enter your username & password.";
                this.field142 = 2;
                this.field362 = 0;
            }
        } else if (this.field142 == 2) {
            int var5 = super.field1621 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field1636 == 1 && super.field1638 >= var16 - 15 && super.field1638 < var16) {
                this.field362 = 0;
            }
            var5 = var16 + 15;
            if (super.field1636 == 1 && super.field1638 >= var5 - 15 && super.field1638 < var5) {
                this.field362 = 1;
            }
            var5 += 15;
            int var6 = super.field1620 / 2 - 80;
            int var7 = super.field1621 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field1636 == 1 && super.field1637 >= var6 - 75 && super.field1637 <= var6 + 75 && super.field1638 >= var17 - 20 && super.field1638 <= var17 + 20) {
                this.field200 = 0;
                this.method114(this.field460, this.field461, false);
                if (this.field501) {
                    return;
                }
            }
            int var8 = super.field1620 / 2 + 80;
            if (super.field1636 == 1 && super.field1637 >= var8 - 75 && super.field1637 <= var8 + 75 && super.field1638 >= var17 - 20 && super.field1638 <= var17 + 20) {
                this.field142 = 0;
                this.field460 = "";
                this.field461 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method581(true);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field186.length(); ++var11) {
                        if (var9 == field186.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field362 == 0) {
                        if (var9 == 8 && this.field460.length() > 0) {
                            this.field460 = this.field460.substring(0, this.field460.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field362 = 1;
                        }
                        if (var10) {
                            this.field460 = this.field460 + (char) var9;
                        }
                        if (this.field460.length() > 12) {
                            this.field460 = this.field460.substring(0, 12);
                        }
                    } else if (this.field362 == 1) {
                        if (var9 == 8 && this.field461.length() > 0) {
                            this.field461 = this.field461.substring(0, this.field461.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field362 = 0;
                        }
                        if (var10) {
                            this.field461 = this.field461 + (char) var9;
                        }
                        if (this.field461.length() > 20) {
                            this.field461 = this.field461.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field142 == 3) {
                int var12 = super.field1620 / 2;
                int var13 = super.field1621 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field1636 == 1 && super.field1637 >= var12 - 75 && super.field1637 <= var12 + 75 && super.field1638 >= var18 - 20 && super.field1638 <= var18 + 20) {
                    this.field142 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILVNAWUDPP;I)V")
    public final void method105(int arg0, class61 arg1, int arg2) {
        this.method106(0, arg1.field1555, arg0, arg1.field1556);
        while (arg2 >= 0) {
            this.field190 = -480;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)V")
    public final void method106(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 128 && arg3 >= 128 && arg1 <= 13056 && arg3 <= 13056) {
            int var5 = this.method197(arg1, this.field302, arg3, -235) - arg2;
            int var6 = arg1 - this.field440;
            int var7 = var5 - this.field441;
            int var8 = arg3 - this.field442;
            int var9 = class37.field1030[this.field443];
            int var10 = class37.field1031[this.field443];
            int var11 = class37.field1030[this.field444];
            int var12 = class37.field1031[this.field444];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (arg0 >= 0 && arg0 <= 0) {
                if (var17 >= 50) {
                    this.field419 = (var13 << 9) / var17 + class59.field1503;
                    this.field420 = (var16 << 9) / var17 + class59.field1504;
                } else {
                    this.field419 = -1;
                    this.field420 = -1;
                }
            }
        } else {
            this.field419 = -1;
            this.field420 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method107(boolean arg0, boolean arg1) {
        for (int var3 = 0; var3 < this.field355; ++var3) {
            class1 var4 = this.field354[this.field356[var3]];
            int var5 = (this.field356[var3] << 14) + 536870912;
            if (var4 != null && var4.method2(false) && var4.field2.field1188 == arg0 && var4.field2.method447(0)) {
                int var6 = var4.field1555 >> 7;
                int var7 = var4.field1556 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field1565 == 1 && (var4.field1555 & 127) == 64 && (var4.field1556 & 127) == 64) {
                        if (this.field94[var6][var7] == this.field451) {
                            continue;
                        }
                        this.field94[var6][var7] = this.field451;
                    }
                    if (!var4.field2.field1210) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field159.method507((byte) -13, var4, var4.field1557, var4.field1559, var4.field1555, this.field302, (var4.field1565 - 1) * 64 + 60, var4.field1556, var5, this.method197(var4.field1555, this.field302, var4.field1556, -235));
                }
            }
        }
        this.field501 &= arg1;
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method108(int arg0) {
        if (arg0 > 0) {
            if (field328 && this.field311 == 2 && class14.field606 != this.field302) {
                this.field309.method264(this.field483);
                this.field271.method278(151, "Loading - please wait.", 0, 257, 2);
                this.field271.method278(150, "Loading - please wait.", 16777215, 256, 2);
                this.field309.method265(4, 4, super.field1622, 0);
                this.field311 = 1;
                this.field184 = System.currentTimeMillis();
            }
            if (this.field311 == 1) {
                int var2 = this.method109(this.field341);
                if (var2 != 0 && System.currentTimeMillis() - this.field184 > 360000L) {
                    signlink.reporterror(this.field460 + " glcfb " + this.field179 + "," + var2 + "," + field328 + "," + this.field324[0] + "," + this.field346.method410() + "," + this.field302 + "," + this.field435 + "," + this.field436);
                    this.field184 = System.currentTimeMillis();
                }
            }
            if (this.field311 == 2 && this.field531 != this.field302) {
                this.field531 = this.field302;
                this.method136(-893, this.field302);
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)I")
    public final int method109(byte arg0) {
        if (arg0 != 23) {
            this.method178();
        }
        for (int var2 = 0; var2 < this.field407.length; ++var2) {
            if (this.field407[var2] == null && this.field558[var2] != -1) {
                return -1;
            }
            if (this.field151[var2] == null && this.field559[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field407.length; ++var4) {
            byte[] var5 = this.field151[var4];
            if (var5 != null) {
                int var6 = (this.field557[var4] >> 8) * 64 - this.field453;
                int var7 = (this.field557[var4] & 255) * 64 - this.field454;
                if (this.field467) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class14.method240(var7, this.field536, var6, var5);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field556) {
            return -4;
        } else {
            this.field311 = 2;
            class14.field606 = this.field302;
            this.method91(true);
            this.field477.method19(212, 687);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILCFARFRSG;)V")
    private final void method110(int arg0, int arg1, class8 arg2) {
        this.field180 = 0;
        this.field108 = 0;
        this.method128(-428, arg1, arg2);
        this.method184(623, arg1, arg2);
        this.method127(arg1, arg2, true);
        this.method147(-695, arg2, arg1);
        for (int var4 = 0; var4 < this.field180; ++var4) {
            int var7 = this.field181[var4];
            if (field183 != this.field105[var7].field1537) {
                this.field105[var7] = null;
            }
        }
        int var5 = arg0 + arg1;
        if (arg2.field72 != var5) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field72 + " psize:" + var5);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field106; ++var6) {
                if (this.field105[this.field107[var6]] == null) {
                    signlink.reporterror(this.field460 + " null entry in pl list - pos:" + var6 + " size:" + this.field106);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method111(int arg0) {
        int var2 = 61 / arg0;
        if (super.field1636 == 1) {
            if (super.field1637 >= 6 && super.field1637 <= 106 && super.field1638 >= 467 && super.field1638 <= 499) {
                this.field438 = (this.field438 + 1) % 4;
                this.field550 = true;
                this.field226 = true;
                this.field477.method19(55, 687);
                this.field477.method20(this.field438);
                this.field477.method20(this.field175);
                this.field477.method20(this.field155);
            }
            if (super.field1637 >= 135 && super.field1637 <= 235 && super.field1638 >= 467 && super.field1638 <= 499) {
                this.field175 = (this.field175 + 1) % 3;
                this.field550 = true;
                this.field226 = true;
                this.field477.method19(55, 687);
                this.field477.method20(this.field438);
                this.field477.method20(this.field175);
                this.field477.method20(this.field155);
            }
            if (super.field1637 >= 273 && super.field1637 <= 373 && super.field1638 >= 467 && super.field1638 <= 499) {
                this.field155 = (this.field155 + 1) % 3;
                this.field550 = true;
                this.field226 = true;
                this.field477.method19(55, 687);
                this.field477.method20(this.field438);
                this.field477.method20(this.field175);
                this.field477.method20(this.field155);
            }
            if (super.field1637 >= 412 && super.field1637 <= 512 && super.field1638 >= 467 && super.field1638 <= 499) {
                if (this.field481 == -1) {
                    this.method179(true);
                    this.field433 = "";
                    this.field363 = false;
                    for (int var3 = 0; var3 < class48.field1221.length; ++var3) {
                        if (class48.field1221[var3] != null && class48.field1221[var3].field1258 == 600) {
                            this.field158 = this.field481 = class48.field1221[var3].field1229;
                            return;
                        }
                    }
                    return;
                }
                this.method120("Please close the interface you have open before using 'report abuse'", "", 2, 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method112(int arg0) {
        if (this.field112 == null) {
            super.field1623 = null;
            this.field310 = null;
            this.field308 = null;
            this.field307 = null;
            if (arg0 < 5 || arg0 > 5) {
                field275 = !field275;
            }
            this.field309 = null;
            this.field195 = null;
            this.field196 = null;
            this.field197 = null;
            this.field115 = new class17(this.method149(true), -4368, 265, 128);
            class46.method434(-327);
            this.field116 = new class17(this.method149(true), -4368, 265, 128);
            class46.method434(-327);
            this.field112 = new class17(this.method149(true), -4368, 171, 509);
            class46.method434(-327);
            this.field113 = new class17(this.method149(true), -4368, 132, 360);
            class46.method434(-327);
            this.field114 = new class17(this.method149(true), -4368, 200, 360);
            class46.method434(-327);
            this.field117 = new class17(this.method149(true), -4368, 238, 202);
            class46.method434(-327);
            this.field118 = new class17(this.method149(true), -4368, 238, 203);
            class46.method434(-327);
            this.field119 = new class17(this.method149(true), -4368, 94, 74);
            class46.method434(-327);
            this.field120 = new class17(this.method149(true), -4368, 94, 75);
            class46.method434(-327);
            if (this.field560 != null) {
                this.method164(624);
                this.method166(-21557);
            }
            this.field208 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method113(int arg0, int arg1) {
        if (arg1 <= 0) {
            this.field477.method20(60);
        }
        class48 var3 = class48.field1221[arg0];
        for (int var4 = 0; var4 < var3.field1240.length && var3.field1240[var4] != -1; ++var4) {
            class48 var5 = class48.field1221[var3.field1240[var4]];
            if (var5.field1273 == 1) {
                this.method113(var5.field1215, 314);
            }
            var5.field1274 = 0;
            var5.field1238 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method114(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field228 = "";
                this.field229 = "Connecting to server...";
                this.method211((byte) -128, true);
            }
            this.field312 = new class52(this.method87(field326 + 43594), this, this.field418);
            long var4 = class71.method587(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field477.field72 = 0;
            this.field477.method20(14);
            this.field477.method20(var6);
            this.field312.method473(this.field477.field71, 0, 2, this.field190);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field312.method470();
            }
            int var8 = this.field312.method470();
            int var9 = var8;
            if (var8 == 0) {
                this.field312.method472(this.field432.field71, 0, 8);
                this.field432.field72 = 0;
                this.field179 = this.field432.method36((byte) -111);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field179 >> 32), (int) this.field179 };
                this.field477.field72 = 0;
                this.field477.method20(10);
                this.field477.method24(var10[0]);
                this.field477.method24(var10[1]);
                this.field477.method24(var10[2]);
                this.field477.method24(var10[3]);
                this.field477.method24(signlink.uid);
                this.field477.method27(arg0);
                this.field477.method27(arg1);
                this.field477.method45(field128, (byte) 3, field317);
                this.field551.field72 = 0;
                if (arg2) {
                    this.field551.method20(18);
                } else {
                    this.field551.method20(16);
                }
                this.field551.method20(this.field477.field72 + 36 + 1 + 1 + 2);
                this.field551.method20(255);
                this.field551.method21(332);
                this.field551.method20(field328 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field551.method24(this.field389[var11]);
                }
                this.field551.method28(0, this.field477.field72, -11820, this.field477.field71);
                this.field477.field76 = new class53(var10, true);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field470 = new class53(var10, true);
                this.field312.method473(this.field551.field71, 0, this.field551.field72, this.field190);
                var8 = this.field312.method470();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method114(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field344 = this.field312.method470();
                field450 = this.field312.method470() == 1;
                this.field287 = 0L;
                this.field203 = 0;
                this.field243.field671 = 0;
                super.field1627 = true;
                this.field239 = true;
                this.field501 = true;
                this.field477.field72 = 0;
                this.field432.field72 = 0;
                this.field231 = -1;
                this.field256 = -1;
                this.field257 = -1;
                this.field258 = -1;
                this.field230 = 0;
                this.field232 = 0;
                this.field479 = 0;
                this.field234 = 0;
                this.field429 = 0;
                this.field278 = 0;
                this.field448 = false;
                super.field1628 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field102[var13] = null;
                }
                this.field279 = 0;
                this.field264 = 0;
                this.field311 = 0;
                this.field187 = 0;
                this.field544 = (int) (Math.random() * 100.0D) - 50;
                this.field552 = (int) (Math.random() * 110.0D) - 55;
                this.field446 = (int) (Math.random() * 80.0D) - 40;
                this.field332 = (int) (Math.random() * 120.0D) - 60;
                this.field285 = (int) (Math.random() * 30.0D) - 20;
                this.field349 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field514 = 0;
                this.field531 = -1;
                this.field148 = 0;
                this.field149 = 0;
                this.field106 = 0;
                this.field355 = 0;
                for (int var14 = 0; var14 < this.field103; ++var14) {
                    this.field105[var14] = null;
                    this.field110[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field354[var15] = null;
                }
                field157 = this.field105[this.field104] = new class23();
                this.field512.method75();
                this.field133.method75();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field111[var16][var17][var18] = null;
                        }
                    }
                }
                this.field523 = new class9(field329);
                this.field377 = 0;
                this.field376 = 0;
                this.field345 = -1;
                this.field522 = -1;
                this.field481 = -1;
                this.field301 = -1;
                this.field388 = -1;
                this.field244 = -1;
                this.field434 = false;
                this.field97 = 3;
                this.field235 = 0;
                this.field448 = false;
                this.field123 = false;
                this.field227 = null;
                this.field471 = 0;
                this.field469 = -1;
                this.field457 = true;
                this.method138(932);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field299[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field163[var20] = null;
                    this.field164[var20] = false;
                }
                field202 = 0;
                field254 = 0;
                field554 = 0;
                field352 = 0;
                field358 = 0;
                field255 = 0;
                field513 = 0;
                field153 = 0;
                field268 = 0;
                field201 = 0;
                this.method186(this.field425);
            } else if (var8 == 3) {
                this.field228 = "";
                this.field229 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field228 = "Your account has been disabled.";
                this.field229 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field228 = "Your account is already logged in.";
                this.field229 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field228 = "RuneScape has been updated!";
                this.field229 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field228 = "This world is full.";
                this.field229 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field228 = "Unable to connect.";
                this.field229 = "Login server offline.";
            } else if (var8 == 9) {
                this.field228 = "Login limit exceeded.";
                this.field229 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field228 = "Unable to connect.";
                this.field229 = "Bad session id.";
            } else if (var8 == 11) {
                this.field228 = "Login server rejected session.";
                this.field229 = "Please try again.";
            } else if (var8 == 12) {
                this.field228 = "You need a members account to login to this world.";
                this.field229 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field228 = "Could not complete login.";
                this.field229 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field228 = "The server is being updated.";
                this.field229 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field501 = true;
                this.field477.field72 = 0;
                this.field432.field72 = 0;
                this.field231 = -1;
                this.field256 = -1;
                this.field257 = -1;
                this.field258 = -1;
                this.field230 = 0;
                this.field232 = 0;
                this.field479 = 0;
                this.field278 = 0;
                this.field448 = false;
                this.field184 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field228 = "Login attempts exceeded.";
                this.field229 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field228 = "You are standing in a members-only area.";
                this.field229 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field228 = "Invalid loginserver requested";
                this.field229 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field228 = "Malformed login packet.";
                    this.field229 = "Please try again.";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field200 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field200;
                            this.method114(arg0, arg1, arg2);
                        } else {
                            this.field228 = "No response from loginserver";
                            this.field229 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field228 = "No response from server";
                        this.field229 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field228 = "Unexpected server response";
                    this.field229 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field312.method470();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field228 = "You have only just left another world";
                    this.field229 = "Your profile will be transferred in: " + var26;
                    this.method211((byte) -128, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method114(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field228 = "";
            this.field229 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method115(int arg0) {
        for (int var2 = -1; var2 < this.field106; ++var2) {
            int var4;
            if (var2 == -1) {
                var4 = this.field104;
            } else {
                var4 = this.field107[var2];
            }
            class23 var5 = this.field105[var4];
            if (var5 != null) {
                this.method169(1, var5, -68);
            }
        }
        ++field386;
        int var3 = 72 / arg0;
        if (field386 > 198) {
            field386 = 0;
            this.field477.method19(152, 687);
            this.field477.method20(137);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method116(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field382 >= 100) {
                this.method120("Your ignore list is full. Max of 100 hit", "", 2, 0);
            } else {
                String var4 = class71.method591(1, class71.method588(arg1, (byte) -66));
                for (int var5 = 0; var5 < this.field382; ++var5) {
                    if (this.field318[var5] == arg1) {
                        this.method120(var4 + " is already on your ignore list", "", 2, 0);
                        return;
                    }
                }
                if (arg0 != 4) {
                    this.field231 = this.field432.method30();
                }
                for (int var6 = 0; var6 < this.field376; ++var6) {
                    if (this.field331[var6] == arg1) {
                        this.method120("Please remove " + var4 + " from your friend list first", "", 2, 0);
                        return;
                    }
                }
                this.field318[this.field382++] = arg1;
                this.field91 = true;
                this.field477.method19(35, 687);
                this.field477.method26((byte) 9, arg1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method117(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field376; ++var4) {
                if (this.field331[var4] == arg0) {
                    --this.field376;
                    this.field91 = true;
                    for (int var5 = var4; var5 < this.field376; ++var5) {
                        this.field131[var5] = this.field131[var5 + 1];
                        this.field204[var5] = this.field204[var5 + 1];
                        this.field331[var5] = this.field331[var5 + 1];
                    }
                    this.field477.method19(215, 687);
                    this.field477.method26((byte) 9, arg0);
                    break;
                }
            }
            if (arg1 != 44593) {
                this.field276 = this.field470.method475();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method118(byte arg0) {
        if (!this.field253 && !this.field241 && !this.field428) {
            ++field183;
            if (!this.field501) {
                this.method104(true);
            } else {
                this.method193(0);
            }
            this.method97(false);
            if (arg0 != 4) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    private final void method119(int arg0) {
        if (arg0 != -44524) {
            this.field190 = -333;
        }
        if (this.field311 == 2) {
            for (class29 var2 = (class29) this.field523.method71(); var2 != null; var2 = (class29) this.field523.method73(67)) {
                if (var2.field808 > 0) {
                    --var2.field808;
                }
                if (var2.field808 == 0) {
                    if (var2.field801 < 0 || class14.method243(var2.field801, true, var2.field803)) {
                        this.method77(var2.field804, var2.field801, 9177, var2.field807, var2.field803, var2.field806, var2.field802, var2.field805);
                        var2.method582();
                    }
                } else {
                    if (var2.field809 > 0) {
                        --var2.field809;
                    }
                    if (var2.field809 == 0 && var2.field806 >= 1 && var2.field807 >= 1 && var2.field806 <= 102 && var2.field807 <= 102 && (var2.field798 < 0 || class14.method243(var2.field798, true, var2.field800))) {
                        this.method77(var2.field804, var2.field798, 9177, var2.field807, var2.field800, var2.field806, var2.field799, var2.field805);
                        var2.field809 = -1;
                        if (var2.field801 == var2.field798 && var2.field801 == -1) {
                            var2.method582();
                        } else if (var2.field801 == var2.field798 && var2.field802 == var2.field799 && var2.field803 == var2.field800) {
                            var2.method582();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
    public final void method120(String arg0, String arg1, int arg2, int arg3) {
        if (arg3 == 0 && this.field345 != -1) {
            this.field227 = arg0;
            super.field1636 = 0;
        }
        if (this.field522 == -1) {
            this.field226 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field100[var5] = this.field100[var5 - 1];
            this.field101[var5] = this.field101[var5 - 1];
            this.field102[var5] = this.field102[var5 - 1];
        }
        this.field100[0] = arg3;
        if (arg2 >= 2 && arg2 <= 2) {
            this.field101[0] = arg1;
            this.field102[0] = arg0;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method121(int arg0) {
        int var2 = this.field391 * 128 + 64;
        int var3 = this.field392 * 128 + 64;
        int var4 = this.method197(var2, this.field302, var3, -235) - this.field393;
        if (arg0 != 31346) {
            this.field176 = !this.field176;
        }
        if (this.field440 < var2) {
            this.field440 += (var2 - this.field440) * this.field395 / 1000 + this.field394;
            if (this.field440 > var2) {
                this.field440 = var2;
            }
        }
        if (this.field440 > var2) {
            this.field440 -= (this.field440 - var2) * this.field395 / 1000 + this.field394;
            if (this.field440 < var2) {
                this.field440 = var2;
            }
        }
        if (this.field441 < var4) {
            this.field441 += (var4 - this.field441) * this.field395 / 1000 + this.field394;
            if (this.field441 > var4) {
                this.field441 = var4;
            }
        }
        if (this.field441 > var4) {
            this.field441 -= (this.field441 - var4) * this.field395 / 1000 + this.field394;
            if (this.field441 < var4) {
                this.field441 = var4;
            }
        }
        if (this.field442 < var3) {
            this.field442 += (var3 - this.field442) * this.field395 / 1000 + this.field394;
            if (this.field442 > var3) {
                this.field442 = var3;
            }
        }
        if (this.field442 > var3) {
            this.field442 -= (this.field442 - var3) * this.field395 / 1000 + this.field394;
            if (this.field442 < var3) {
                this.field442 = var3;
            }
        }
        int var5 = this.field462 * 128 + 64;
        int var6 = this.field463 * 128 + 64;
        int var7 = this.method197(var5, this.field302, var6, -235) - this.field464;
        int var8 = var5 - this.field440;
        int var9 = var7 - this.field441;
        int var10 = var6 - this.field442;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field443 < var12) {
            this.field443 += (var12 - this.field443) * this.field466 / 1000 + this.field465;
            if (this.field443 > var12) {
                this.field443 = var12;
            }
        }
        if (this.field443 > var12) {
            this.field443 -= (this.field443 - var12) * this.field466 / 1000 + this.field465;
            if (this.field443 < var12) {
                this.field443 = var12;
            }
        }
        int var14 = var13 - this.field444;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field444 += this.field466 * var14 / 1000 + this.field465;
            this.field444 &= 2047;
        }
        if (var14 < 0) {
            this.field444 -= -var14 * this.field466 / 1000 + this.field465;
            this.field444 &= 2047;
        }
        int var15 = var13 - this.field444;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field444 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public static final void method122(int arg0) {
        class57.field1424 = false;
        class59.field1498 = false;
        field328 = false;
        class14.field618 = false;
        class54.field1345 = false;
        while (arg0 >= 0) {
            field329 = -270;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method123(boolean arg0) {
        if (arg0) {
            this.field231 = -1;
        }
        this.field316 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field291) {
                ++this.field121;
                this.method180((byte) 114);
                this.method180((byte) 114);
                this.method205(7);
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
        this.field316 = false;
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method124(int arg0) {
        if (this.field342 != 0) {
            class22 var2 = this.field271;
            int var3 = 0;
            if (arg0 < 0) {
                if (this.field479 != 0) {
                    var3 = 1;
                }
                for (int var4 = 0; var4 < 100; ++var4) {
                    if (this.field102[var4] != null) {
                        int var5 = this.field100[var4];
                        String var6 = this.field101[var4];
                        byte var7 = 0;
                        if (var6 != null && var6.startsWith("@cr1@")) {
                            var6 = var6.substring(5);
                            var7 = 1;
                        }
                        if (var6 != null && var6.startsWith("@cr2@")) {
                            var6 = var6.substring(5);
                            var7 = 2;
                        }
                        if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field175 == 0 || this.field175 == 1 && this.method158(this.field366, var6))) {
                            int var8 = 329 - var3 * 13;
                            byte var9 = 4;
                            var2.method282("From", var9, 0, 619, var8);
                            var2.method282("From", var9, 65535, 619, var8 - 1);
                            int var10 = var9 + var2.method280(498, "From ");
                            if (var7 == 1) {
                                this.field323[0].method275(var10, var8 - 12, 9);
                                var10 += 14;
                            }
                            if (var7 == 2) {
                                this.field323[1].method275(var10, var8 - 12, 9);
                                var10 += 14;
                            }
                            var2.method282(var6 + ": " + this.field102[var4], var10, 0, 619, var8);
                            var2.method282(var6 + ": " + this.field102[var4], var10, 65535, 619, var8 - 1);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 5 && this.field175 < 2) {
                            int var11 = 329 - var3 * 13;
                            var2.method282(this.field102[var4], 4, 0, 619, var11);
                            var2.method282(this.field102[var4], 4, 65535, 619, var11 - 1);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 6 && this.field175 < 2) {
                            int var12 = 329 - var3 * 13;
                            var2.method282("To " + var6 + ": " + this.field102[var4], 4, 0, 619, var12);
                            var2.method282("To " + var6 + ": " + this.field102[var4], 4, 65535, 619, var12 - 1);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILOPFNUBIN;IIIII)V")
    public final void method125(int arg0, int arg1, class48 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2.field1273 == 0 && arg2.field1240 != null && !arg2.field1266) {
            if (arg3 >= arg1 && arg7 >= arg6 && arg3 <= arg2.field1230 + arg1 && arg7 <= arg2.field1242 + arg6) {
                int var9 = arg2.field1240.length;
                this.field230 += arg5;
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg2.field1280[var10] + arg1;
                    int var12 = arg2.field1252[var10] + arg6 - arg4;
                    class48 var13 = class48.field1221[arg2.field1240[var10]];
                    int var14 = var13.field1271 + var11;
                    int var15 = var13.field1270 + var12;
                    if ((var13.field1216 >= 0 || var13.field1239 != 0) && arg3 >= var14 && arg7 >= var15 && arg3 < var13.field1230 + var14 && arg7 < var13.field1242 + var15) {
                        if (var13.field1216 >= 0) {
                            this.field364 = var13.field1216;
                        } else {
                            this.field364 = var13.field1215;
                        }
                    }
                    if (var13.field1273 == 8 && arg3 >= var14 && arg7 >= var15 && arg3 < var13.field1230 + var14 && arg7 < var13.field1242 + var15) {
                        this.field401 = var13.field1215;
                    }
                    if (var13.field1273 == 0) {
                        this.method125(arg0, var14, var13, arg3, var13.field1267, 0, var15, arg7);
                        if (var13.field1263 > var13.field1242) {
                            this.method155(var13, arg3, var15, -720, var13.field1242, var13.field1230 + var14, arg0, arg7, var13.field1263);
                        }
                    } else {
                        if (var13.field1257 == 1 && arg3 >= var14 && arg7 >= var15 && arg3 < var13.field1230 + var14 && arg7 < var13.field1242 + var15) {
                            boolean var16 = false;
                            if (var13.field1258 != 0) {
                                var16 = this.method96(var13, this.field92);
                            }
                            if (!var16) {
                                this.field431[this.field278] = var13.field1225;
                                this.field474[this.field278] = 82;
                                this.field473[this.field278] = var13.field1215;
                                ++this.field278;
                            }
                        }
                        if (var13.field1257 == 2 && this.field264 == 0 && arg3 >= var14 && arg7 >= var15 && arg3 < var13.field1230 + var14 && arg7 < var13.field1242 + var15) {
                            String var17 = var13.field1253;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field431[this.field278] = var17 + " @gre@" + var13.field1248;
                            this.field474[this.field278] = 542;
                            this.field473[this.field278] = var13.field1215;
                            ++this.field278;
                        }
                        if (var13.field1257 == 3 && arg3 >= var14 && arg7 >= var15 && arg3 < var13.field1230 + var14 && arg7 < var13.field1242 + var15) {
                            this.field431[this.field278] = "Close";
                            this.field474[this.field278] = 635;
                            this.field473[this.field278] = var13.field1215;
                            ++this.field278;
                        }
                        if (var13.field1257 == 4 && arg3 >= var14 && arg7 >= var15 && arg3 < var13.field1230 + var14 && arg7 < var13.field1242 + var15) {
                            this.field431[this.field278] = var13.field1225;
                            this.field474[this.field278] = 293;
                            this.field473[this.field278] = var13.field1215;
                            ++this.field278;
                        }
                        if (var13.field1257 == 5 && arg3 >= var14 && arg7 >= var15 && arg3 < var13.field1230 + var14 && arg7 < var13.field1242 + var15) {
                            this.field431[this.field278] = var13.field1225;
                            this.field474[this.field278] = 754;
                            this.field473[this.field278] = var13.field1215;
                            ++this.field278;
                        }
                        if (var13.field1257 == 6 && !this.field434 && arg3 >= var14 && arg7 >= var15 && arg3 < var13.field1230 + var14 && arg7 < var13.field1242 + var15) {
                            this.field431[this.field278] = var13.field1225;
                            this.field474[this.field278] = 71;
                            this.field473[this.field278] = var13.field1215;
                            ++this.field278;
                        }
                        if (var13.field1273 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field1242; ++var19) {
                                for (int var20 = 0; var20 < var13.field1230; ++var20) {
                                    int var21 = (var13.field1233 + 32) * var20 + var14;
                                    int var22 = (var13.field1226 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field1217[var18];
                                        var22 += var13.field1265[var18];
                                    }
                                    if (arg3 >= var21 && arg7 >= var22 && arg3 < var21 + 32 && arg7 < var22 + 32) {
                                        this.field458 = var18;
                                        this.field459 = var13.field1215;
                                        if (var13.field1251[var18] > 0) {
                                            class34 var23 = class34.method329(var13.field1251[var18] - 1);
                                            if (this.field279 == 1 && var13.field1218) {
                                                if (this.field281 != var13.field1215 || this.field280 != var18) {
                                                    this.field431[this.field278] = "Use " + this.field283 + " with @lre@" + var23.field904;
                                                    this.field474[this.field278] = 751;
                                                    this.field475[this.field278] = var23.field901;
                                                    this.field472[this.field278] = var18;
                                                    this.field473[this.field278] = var13.field1215;
                                                    ++this.field278;
                                                }
                                            } else if (this.field264 == 1 && var13.field1218) {
                                                if ((this.field266 & 16) == 16) {
                                                    this.field431[this.field278] = this.field267 + " @lre@" + var23.field904;
                                                    this.field474[this.field278] = 233;
                                                    this.field475[this.field278] = var23.field901;
                                                    this.field472[this.field278] = var18;
                                                    this.field473[this.field278] = var13.field1215;
                                                    ++this.field278;
                                                }
                                            } else {
                                                if (var13.field1218) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field905 != null && var23.field905[var24] != null) {
                                                            this.field431[this.field278] = var23.field905[var24] + " @lre@" + var23.field904;
                                                            if (var24 == 3) {
                                                                this.field474[this.field278] = 471;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field474[this.field278] = 694;
                                                            }
                                                            this.field475[this.field278] = var23.field901;
                                                            this.field472[this.field278] = var18;
                                                            this.field473[this.field278] = var13.field1215;
                                                            ++this.field278;
                                                        } else if (var24 == 4) {
                                                            this.field431[this.field278] = "Drop @lre@" + var23.field904;
                                                            this.field474[this.field278] = 694;
                                                            this.field475[this.field278] = var23.field901;
                                                            this.field472[this.field278] = var18;
                                                            this.field473[this.field278] = var13.field1215;
                                                            ++this.field278;
                                                        }
                                                    }
                                                }
                                                if (var13.field1255) {
                                                    this.field431[this.field278] = "Use @lre@" + var23.field904;
                                                    this.field474[this.field278] = 34;
                                                    this.field475[this.field278] = var23.field901;
                                                    this.field472[this.field278] = var18;
                                                    this.field473[this.field278] = var13.field1215;
                                                    ++this.field278;
                                                }
                                                if (var13.field1218 && var23.field905 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field905[var25] != null) {
                                                            this.field431[this.field278] = var23.field905[var25] + " @lre@" + var23.field904;
                                                            if (var25 == 0) {
                                                                this.field474[this.field278] = 766;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field474[this.field278] = 406;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field474[this.field278] = 263;
                                                            }
                                                            this.field475[this.field278] = var23.field901;
                                                            this.field472[this.field278] = var18;
                                                            this.field473[this.field278] = var13.field1215;
                                                            ++this.field278;
                                                        }
                                                    }
                                                }
                                                if (var13.field1277 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field1277[var26] != null) {
                                                            this.field431[this.field278] = var13.field1277[var26] + " @lre@" + var23.field904;
                                                            if (var26 == 0) {
                                                                this.field474[this.field278] = 607;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field474[this.field278] = 48;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field474[this.field278] = 615;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field474[this.field278] = 500;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field474[this.field278] = 534;
                                                            }
                                                            this.field475[this.field278] = var23.field901;
                                                            this.field472[this.field278] = var18;
                                                            this.field473[this.field278] = var13.field1215;
                                                            ++this.field278;
                                                        }
                                                    }
                                                }
                                                this.field431[this.field278] = "Examine @lre@" + var23.field904;
                                                this.field474[this.field278] = 1881;
                                                this.field475[this.field278] = var23.field901;
                                                this.field472[this.field278] = var18;
                                                this.field473[this.field278] = var13.field1215;
                                                ++this.field278;
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILOPFNUBIN;B)V")
    public final void method126(int arg0, int arg1, int arg2, class48 arg3, byte arg4) {
        if (arg3.field1273 == 0 && arg3.field1240 != null) {
            if (!arg3.field1266 || this.field521 == arg3.field1215 || this.field99 == arg3.field1215 || this.field533 == arg3.field1215) {
                int var6 = class46.field1166;
                int var7 = class46.field1164;
                int var8 = class46.field1167;
                int var9 = class46.field1165;
                class46.method433(arg3.field1230 + arg0, arg3.field1242 + arg2, arg0, -42775, arg2);
                if (arg4 != -125) {
                    this.method178();
                }
                int var10 = arg3.field1240.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg3.field1280[var11] + arg0;
                    int var13 = arg3.field1252[var11] + arg2 - arg1;
                    class48 var14 = class48.field1221[arg3.field1240[var11]];
                    int var15 = var14.field1271 + var12;
                    int var16 = var14.field1270 + var13;
                    if (var14.field1258 > 0) {
                        this.method176(var14, (byte) -35);
                    }
                    if (var14.field1273 == 0) {
                        if (var14.field1267 > var14.field1263 - var14.field1242) {
                            var14.field1267 = var14.field1263 - var14.field1242;
                        }
                        if (var14.field1267 < 0) {
                            var14.field1267 = 0;
                        }
                        this.method126(var15, var14.field1267, var16, var14, (byte) -125);
                        if (var14.field1263 > var14.field1242) {
                            this.method161(var16, var14.field1263, var14.field1267, var14.field1230 + var15, var14.field1242, true);
                        }
                    } else if (var14.field1273 != 1) {
                        if (var14.field1273 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field1242; ++var18) {
                                for (int var19 = 0; var19 < var14.field1230; ++var19) {
                                    int var20 = (var14.field1233 + 32) * var19 + var15;
                                    int var21 = (var14.field1226 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field1217[var17];
                                        var21 += var14.field1265[var17];
                                    }
                                    if (var14.field1251[var17] <= 0) {
                                        if (var14.field1231 != null && var17 < 20) {
                                            class10 var30 = var14.field1231[var17];
                                            if (var30 != null) {
                                                var30.method223(var20, var21, 9);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field1251[var17] - 1;
                                        if (var20 > class46.field1166 - 32 && var20 < class46.field1167 && var21 > class46.field1164 - 32 && var21 < class46.field1165 || this.field145 != 0 && this.field144 == var17) {
                                            int var25 = 0;
                                            if (this.field279 == 1 && this.field280 == var17 && this.field281 == var14.field1215) {
                                                var25 = 16777215;
                                            }
                                            class10 var26 = class34.method336(var25, var24, var14.field1275[var17], (byte) 7);
                                            if (var26 != null) {
                                                if (this.field145 != 0 && this.field144 == var17 && this.field143 == var14.field1215) {
                                                    var22 = super.field1630 - this.field146;
                                                    var23 = super.field1631 - this.field147;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field127 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method225(var21 + var23, var20 + var22, 128, 593);
                                                    if (var21 + var23 < class46.field1164 && arg3.field1267 > 0) {
                                                        int var27 = (class46.field1164 - var21 - var23) * this.field381 / 3;
                                                        if (var27 > this.field381 * 10) {
                                                            var27 = this.field381 * 10;
                                                        }
                                                        if (var27 > arg3.field1267) {
                                                            var27 = arg3.field1267;
                                                        }
                                                        arg3.field1267 -= var27;
                                                        this.field147 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class46.field1165 && arg3.field1267 < arg3.field1263 - arg3.field1242) {
                                                        int var28 = (var21 + var23 + 32 - class46.field1165) * this.field381 / 3;
                                                        if (var28 > this.field381 * 10) {
                                                            var28 = this.field381 * 10;
                                                        }
                                                        if (var28 > arg3.field1263 - arg3.field1242 - arg3.field1267) {
                                                            var28 = arg3.field1263 - arg3.field1242 - arg3.field1267;
                                                        }
                                                        arg3.field1267 += var28;
                                                        this.field147 -= var28;
                                                    }
                                                } else if (this.field506 != 0 && this.field505 == var17 && this.field504 == var14.field1215) {
                                                    var26.method225(var21, var20, 128, 593);
                                                } else {
                                                    var26.method223(var20, var21, 9);
                                                }
                                                if (var26.field577 == 33 || var14.field1275[var17] != 1) {
                                                    int var29 = var14.field1275[var17];
                                                    this.field270.method282(method201(var29, 7), var20 + 1 + var22, 0, 619, var21 + 10 + var23);
                                                    this.field270.method282(method201(var29, 7), var20 + var22, 16776960, 619, var21 + 9 + var23);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field1273 == 3) {
                            boolean var31 = false;
                            if (this.field533 == var14.field1215 || this.field99 == var14.field1215 || this.field521 == var14.field1215) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method204(var14, 232)) {
                                var32 = var14.field1260;
                                if (var31 && var14.field1279 != 0) {
                                    var32 = var14.field1279;
                                }
                            } else {
                                var32 = var14.field1256;
                                if (var31 && var14.field1239 != 0) {
                                    var32 = var14.field1239;
                                }
                            }
                            if (var14.field1234 == 0) {
                                if (var14.field1264) {
                                    class46.method436(var15, var16, 2, var32, var14.field1230, var14.field1242);
                                } else {
                                    class46.method437(7, var14.field1242, var16, var15, var32, var14.field1230);
                                }
                            } else if (var14.field1264) {
                                class46.method435(var14.field1242, this.field298, var32, var15, var14.field1230, var16, 256 - (var14.field1234 & 255));
                            } else {
                                class46.method438(var16, var15, var32, 256 - (var14.field1234 & 255), var14.field1230, var14.field1242, 509);
                            }
                        } else if (var14.field1273 == 4) {
                            class22 var33 = var14.field1232;
                            String var34 = var14.field1269;
                            boolean var35 = false;
                            if (this.field533 == var14.field1215 || this.field99 == var14.field1215 || this.field521 == var14.field1215) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method204(var14, 232)) {
                                var36 = var14.field1260;
                                if (var35 && var14.field1279 != 0) {
                                    var36 = var14.field1279;
                                }
                                if (var14.field1241.length() > 0) {
                                    var34 = var14.field1241;
                                }
                            } else {
                                var36 = var14.field1256;
                                if (var35 && var14.field1239 != 0) {
                                    var36 = var14.field1239;
                                }
                            }
                            if (var14.field1257 == 6 && this.field434) {
                                var34 = "Please wait...";
                                var36 = var14.field1256;
                            }
                            if (class46.field1162 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field723 + var16;
                            while (var34.length() > 0) {
                                if (var34.indexOf("%") != -1) {
                                    label382: while (true) {
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
                                                                            break label382;
                                                                        }
                                                                        var34 = var34.substring(0, var42) + this.method89(this.method194(4, var14, 353), true) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method89(this.method194(3, var14, 353), true) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method89(this.method194(2, var14, 353), true) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method89(this.method194(1, var14, 353), true) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method89(this.method194(0, var14, 353), true) + var34.substring(var38 + 2);
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
                                if (var14.field1282) {
                                    var33.method279(var36, var44, 744, var37, var14.field1223, var14.field1230 / 2 + var15);
                                } else {
                                    var33.method286(var36, var44, var15, var14.field1223, var37, 0);
                                }
                                var37 += var33.field723;
                            }
                        } else if (var14.field1273 == 5) {
                            class10 var45;
                            if (this.method204(var14, 232)) {
                                var45 = var14.field1222;
                            } else {
                                var45 = var14.field1281;
                            }
                            if (var45 != null) {
                                var45.method223(var15, var16, 9);
                            }
                        } else if (var14.field1273 == 6) {
                            int var46 = class59.field1503;
                            int var47 = class59.field1504;
                            class59.field1503 = var14.field1230 / 2 + var15;
                            class59.field1504 = var14.field1242 / 2 + var16;
                            int var48 = class59.field1507[var14.field1244] * var14.field1243 >> 16;
                            int var49 = class59.field1508[var14.field1244] * var14.field1243 >> 16;
                            boolean var50 = this.method204(var14, 232);
                            int var51;
                            if (var50) {
                                var51 = var14.field1262;
                            } else {
                                var51 = var14.field1261;
                            }
                            class37 var52;
                            if (var51 == -1) {
                                var52 = var14.method453(var50, true, -1, -1);
                            } else {
                                class32 var53 = class32.field816[var51];
                                var52 = var14.method453(var50, true, var53.field819[var14.field1274], var53.field818[var14.field1274]);
                            }
                            if (var52 != null) {
                                var52.method361(0, var14.field1245, 0, var14.field1244, 0, var48, var49);
                            }
                            class59.field1503 = var46;
                            class59.field1504 = var47;
                        } else {
                            if (var14.field1273 == 7) {
                                class22 var54 = var14.field1232;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field1242; ++var56) {
                                    for (int var57 = 0; var57 < var14.field1230; ++var57) {
                                        if (var14.field1251[var55] > 0) {
                                            class34 var58 = class34.method329(var14.field1251[var55] - 1);
                                            String var59 = var58.field904;
                                            if (var58.field933 || var14.field1275[var55] != 1) {
                                                var59 = var59 + " x" + method188(var14.field1275[var55], (byte) 3);
                                            }
                                            int var60 = (var14.field1233 + 115) * var57 + var15;
                                            int var61 = (var14.field1226 + 12) * var56 + var16;
                                            if (var14.field1282) {
                                                var54.method279(var14.field1256, var59, 744, var61, var14.field1223, var14.field1230 / 2 + var60);
                                            } else {
                                                var54.method286(var14.field1256, var59, var60, var14.field1223, var61, 0);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                            if (var14.field1273 == 8 && (this.field426 == var14.field1215 || this.field292 == var14.field1215 || this.field152 == var14.field1215)) {
                                int var62 = 0;
                                int var63 = 0;
                                class22 var64 = this.field271;
                                String var65 = var14.field1269;
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
                                    int var74 = var64.method280(498, var73);
                                    if (var74 > var62) {
                                        var62 = var74;
                                    }
                                    var63 += var64.field723 + 1;
                                }
                                var62 += 6;
                                var63 += 7;
                                int var66 = var14.field1230 + var15 - 5 - var62;
                                int var67 = var14.field1242 + var16 + 5;
                                if (var66 < var15 + 5) {
                                    var66 = this.field280 + 5;
                                }
                                class46.method436(var66, var67, 2, 16777120, var62, var63);
                                class46.method437(7, var63, var67, var66, 0, var62);
                                String var68 = var14.field1269;
                                int var69 = var64.field723 + var67 + 2;
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
                                    var64.method286(0, var71, var66 + 3, false, var69, 0);
                                    var69 += var64.field723 + 1;
                                }
                            }
                        }
                    }
                }
                class46.method433(var8, var9, var6, -42775, var7);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILCFARFRSG;Z)V")
    private final void method127(int arg0, class8 arg1, boolean arg2) {
        while (true) {
            if (arg1.field73 + 10 < arg0 * 8) {
                int var4 = arg1.method41(881, 11);
                if (var4 != 2047) {
                    if (this.field105[var4] == null) {
                        this.field105[var4] = new class23();
                        if (this.field110[var4] != null) {
                            this.field105[var4].method295(this.field110[var4], -54);
                        }
                    }
                    this.field107[this.field106++] = var4;
                    class23 var5 = this.field105[var4];
                    var5.field1537 = field183;
                    int var6 = arg1.method41(881, 1);
                    if (var6 == 1) {
                        this.field109[this.field108++] = var4;
                    }
                    int var7 = arg1.method41(881, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg1.method41(881, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = arg1.method41(881, 1);
                    var5.method565(var9 == 1, field157.field1536[0] + var7, -623, field157.field1535[0] + var8);
                    continue;
                }
            }
            arg1.method42(0);
            this.field501 &= arg2;
            return;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILCFARFRSG;)V")
    private final void method128(int arg0, int arg1, class8 arg2) {
        arg2.method40(2);
        if (arg0 < 0) {
            int var4 = arg2.method41(881, 1);
            if (var4 != 0) {
                int var5 = arg2.method41(881, 2);
                if (var5 == 0) {
                    this.field109[this.field108++] = this.field104;
                } else if (var5 == 1) {
                    int var6 = arg2.method41(881, 3);
                    field157.method566(var6, (byte) -62, false);
                    int var7 = arg2.method41(881, 1);
                    if (var7 == 1) {
                        this.field109[this.field108++] = this.field104;
                    }
                } else if (var5 == 2) {
                    int var8 = arg2.method41(881, 3);
                    field157.method566(var8, (byte) -62, true);
                    int var9 = arg2.method41(881, 3);
                    field157.method566(var9, (byte) -62, true);
                    int var10 = arg2.method41(881, 1);
                    if (var10 == 1) {
                        this.field109[this.field108++] = this.field104;
                    }
                } else if (var5 == 3) {
                    int var11 = arg2.method41(881, 1);
                    int var12 = arg2.method41(881, 7);
                    int var13 = arg2.method41(881, 7);
                    int var14 = arg2.method41(881, 1);
                    if (var14 == 1) {
                        this.field109[this.field108++] = this.field104;
                    }
                    this.field302 = arg2.method41(881, 2);
                    field157.method565(var11 == 1, var13, -623, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method129(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method129(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method130(boolean arg0, int arg1) {
        this.field501 &= arg0;
        if (!field328) {
            if (class59.field1517[17] >= arg1) {
                class21 var3 = class59.field1511[17];
                int var4 = var3.field706 * var3.field705 - 1;
                int var5 = this.field381 * var3.field705 * 2;
                byte[] var6 = var3.field703;
                byte[] var7 = this.field238;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field703 = var7;
                this.field238 = var6;
                class59.method554(17, true);
            }
            if (class59.field1517[24] >= arg1) {
                class21 var9 = class59.field1511[24];
                int var10 = var9.field706 * var9.field705 - 1;
                int var11 = this.field381 * var9.field705 * 2;
                byte[] var12 = var9.field703;
                byte[] var13 = this.field238;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field703 = var13;
                this.field238 = var12;
                class59.method554(24, true);
            }
            if (class59.field1517[34] >= arg1) {
                class21 var15 = class59.field1511[34];
                int var16 = var15.field706 * var15.field705 - 1;
                int var17 = this.field381 * var15.field705 * 2;
                byte[] var18 = var15.field703;
                byte[] var19 = this.field238;
                for (int var20 = 0; var20 <= var16; ++var20) {
                    var19[var20] = var18[var20 - var17 & var16];
                }
                var15.field703 = var19;
                this.field238 = var18;
                class59.method554(34, true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LCFARFRSG;ZI)V")
    private final void method131(class8 arg0, boolean arg1, int arg2) {
        this.field180 = 0;
        this.field108 = 0;
        this.method144(false, arg2, arg0);
        this.method212(arg0, arg2, 684);
        this.method183(true, arg0, arg2);
        if (arg1) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        for (int var5 = 0; var5 < this.field180; ++var5) {
            int var7 = this.field181[var5];
            if (field183 != this.field354[var7].field1537) {
                this.field354[var7].field2 = null;
                this.field354[var7] = null;
            }
        }
        if (arg0.field72 != arg2) {
            signlink.reporterror(this.field460 + " size mismatch in getnpcpos - pos:" + arg0.field72 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field355; ++var6) {
                if (this.field354[this.field356[var6]] == null) {
                    signlink.reporterror(this.field460 + " null entry in npc list - pos:" + var6 + " size:" + this.field355);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method132(int arg0) {
        this.method124(-893);
        if (arg0 != 1915) {
            field249 = this.field470.method475();
        }
        if (this.field306 == 1) {
            this.field340[this.field305 / 100].method223(this.field303 - 8 - 4, this.field304 - 8 - 4, 9);
        }
        if (this.field306 == 2) {
            this.field340[this.field305 / 100 + 4].method223(this.field303 - 8 - 4, this.field304 - 8 - 4, 9);
            ++field95;
            if (field95 > 64) {
                field95 = 0;
                this.field477.method19(109, 687);
            }
        }
        if (this.field244 != -1) {
            this.method90(this.field381, this.field244, 44494);
            this.method126(0, 0, 0, class48.field1221[this.field244], (byte) -125);
        }
        if (this.field481 != -1) {
            this.method90(this.field381, this.field481, 44494);
            this.method126(0, 0, 0, class48.field1221[this.field481], (byte) -125);
        }
        this.method133((byte) 7);
        if (!this.field448) {
            this.method134(0);
            this.method101(-24513);
        } else if (this.field221 == 0) {
            this.method81(-14011);
        }
        if (this.field471 == 1) {
            this.field372[1].method223(472, 296, 9);
        }
        if (field178) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field1618 < 15) {
                var4 = 16711680;
            }
            this.field271.method277(var3, "Fps:" + super.field1618, var2, false, var4);
            int var13 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field328) {
                int var8 = 16711680;
            }
            if (var6 > 67108864 && !field328) {
                int var9 = 16711680;
            }
            this.field271.method277(var13, "Mem:" + var6 + "k", var2, false, 16776960);
            var13 += 15;
        }
        if (this.field479 != 0) {
            int var10 = this.field479 / 50;
            int var11 = var10 / 60;
            int var12 = var10 % 60;
            if (var12 < 10) {
                this.field271.method282("System update in: " + var11 + ":0" + var12, 4, 16776960, 619, 329);
            } else {
                this.field271.method282("System update in: " + var11 + ":" + var12, 4, 16776960, 619, 329);
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method133(byte arg0) {
        this.field397 = 0;
        int var2 = (field157.field1555 >> 7) + this.field453;
        int var3 = (field157.field1556 >> 7) + this.field454;
        if (arg0 != 7) {
            this.field477.method20(212);
        }
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field397 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field397 = 1;
        }
        if (this.field397 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field397 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method134(int arg0) {
        if (arg0 != 0) {
            this.method178();
        }
        if (this.field145 == 0) {
            this.field431[0] = "Cancel";
            this.field474[0] = 1822;
            this.field278 = 1;
            this.method103(-47591);
            this.field364 = 0;
            this.field401 = 0;
            if (super.field1630 > 4 && super.field1631 > 4 && super.field1630 < 516 && super.field1631 < 338) {
                if (this.field481 != -1) {
                    this.method125(0, 4, class48.field1221[this.field481], super.field1630, 0, 0, 4, super.field1631);
                } else {
                    this.method182(111);
                }
            }
            if (this.field521 != this.field364) {
                this.field521 = this.field364;
            }
            if (this.field401 != this.field152) {
                this.field152 = this.field401;
            }
            this.field364 = 0;
            this.field401 = 0;
            if (super.field1630 > 553 && super.field1631 > 205 && super.field1630 < 743 && super.field1631 < 466) {
                if (this.field388 != -1) {
                    this.method125(1, 553, class48.field1221[this.field388], super.field1630, 0, 0, 205, super.field1631);
                } else if (this.field130[this.field97] != -1) {
                    this.method125(1, 553, class48.field1221[this.field130[this.field97]], super.field1630, 0, 0, 205, super.field1631);
                }
            }
            if (this.field99 != this.field364) {
                this.field91 = true;
                this.field99 = this.field364;
            }
            if (this.field401 != this.field292) {
                this.field91 = true;
                this.field292 = this.field401;
            }
            this.field364 = 0;
            this.field401 = 0;
            if (super.field1630 > 17 && super.field1631 > 357 && super.field1630 < 496 && super.field1631 < 453) {
                if (this.field522 != -1) {
                    this.method125(2, 17, class48.field1221[this.field522], super.field1630, 0, 0, 357, super.field1631);
                } else if (this.field345 != -1) {
                    this.method125(2, 17, class48.field1221[this.field345], super.field1630, 0, 0, 357, super.field1631);
                } else if (super.field1631 < 434 && super.field1630 < 426) {
                    this.method181(0, super.field1631 - 357, super.field1630 - 17);
                }
            }
            if (this.field522 != -1 && this.field533 != this.field364) {
                this.field226 = true;
                this.field533 = this.field364;
            }
            if (this.field522 != -1 && this.field426 != this.field401) {
                this.field226 = true;
                this.field426 = this.field401;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field278 - 1; ++var3) {
                    if (this.field474[var3] < 1000 && this.field474[var3 + 1] > 1000) {
                        String var4 = this.field431[var3];
                        this.field431[var3] = this.field431[var3 + 1];
                        this.field431[var3 + 1] = var4;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;II)LVSUYIIVA;")
    public final class62 method135(int arg0, int arg1, String arg2, String arg3, int arg4, int arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field324[0] != null) {
                var7 = this.field324[0].method459(arg0, 22486);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field315.reset();
            this.field315.update(var7);
            int var9 = (int) this.field315.getValue();
            if (arg4 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class62(var7, false);
        } else {
            int var11 = 0;
            if (arg1 != 0) {
                field274 = this.field470.method475();
            }
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method206(9, arg5, "Requesting " + arg2);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method140(arg3 + arg4);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class8 var17 = new class8(var16, 792);
                    var17.field72 = 3;
                    int var18 = var17.method34() + 6;
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
                            this.method206(9, arg5, "Loading " + arg2 + " - " + var23 + "%");
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field324[0] != null) {
                            this.field324[0].method460(arg0, var7.length, var7, field378);
                        }
                    } catch (Exception var29) {
                        this.field324[0] = null;
                    }
                    if (var7 != null) {
                        this.field315.reset();
                        this.field315.update(var7);
                        int var24 = (int) this.field315.getValue();
                        if (arg4 != var24) {
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
                            this.method206(9, arg5, "Game updated - please reload page");
                            var26 = 10;
                        } else {
                            this.method206(9, arg5, var12 + " - Retrying in " + var26);
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
                    this.field294 = !this.field294;
                }
            }
            return new class62(var7, false);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method136(int arg0, int arg1) {
        int[] var3 = this.field150.field572;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field368[arg1][var24][var6] & 24) == 0) {
                    this.field159.method531(var3, var23, 512, arg1, var24, var6);
                }
                if (arg1 < 3 && (this.field368[arg1 + 1][var24][var6] & 8) != 0) {
                    this.field159.method531(var3, var23, 512, arg1 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field150.method218(this.field483);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field368[arg1][var22][var9] & 24) == 0) {
                    this.method190(arg1, var7, var22, false, var8, var9);
                }
                if (arg1 < 3 && (this.field368[arg1 + 1][var22][var9] & 8) != 0) {
                    this.method190(arg1 + 1, var7, var22, false, var8, var9);
                }
            }
        }
        this.field309.method264(this.field483);
        this.field160 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field159.method525(this.field302, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class54.method486(var13).field1366;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field529[this.field302].field797;
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
                        this.field170[this.field160] = this.field497[var14];
                        this.field161[this.field160] = var15;
                        this.field162[this.field160] = var16;
                        ++this.field160;
                    }
                }
            }
        }
        if (arg0 >= 0) {
            this.field477.method20(70);
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 332);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field325 = Integer.parseInt(arg0[0]);
                field326 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method214(field274);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method122(-296);
                }
                if (arg0[3].equals("free")) {
                    field327 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field327 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method577(503, -572, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)Ljava/lang/String;")
    public final String method137(int arg0) {
        if (arg0 >= 7 && arg0 <= 7) {
            if (signlink.mainapp != null) {
                return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
            } else {
                return super.field1625 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method138(int arg0) {
        this.field290 = true;
        int var2 = 60 / arg0;
        for (int var3 = 0; var3 < 7; ++var3) {
            this.field237[var3] = -1;
            for (int var4 = 0; var4 < class51.field1310; ++var4) {
                if (!class51.field1311[var4].field1317 && class51.field1311[var4].field1312 == var3 + (this.field457 ? 0 : 7)) {
                    this.field237[var3] = var4;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 == 26554) {
            int var8 = 2048 - arg2 & 2047;
            int var9 = 2048 - arg4 & 2047;
            int var10 = 0;
            int var11 = 0;
            int var12 = arg3;
            if (var8 != 0) {
                int var13 = class37.field1030[var8];
                int var14 = class37.field1031[var8];
                int var15 = var11 * var14 - arg3 * var13 >> 16;
                var12 = var11 * var13 + arg3 * var14 >> 16;
                var11 = var15;
            }
            if (var9 != 0) {
                int var16 = class37.field1030[var9];
                int var17 = class37.field1031[var9];
                int var18 = var10 * var17 + var12 * var16 >> 16;
                var12 = var12 * var17 - var10 * var16 >> 16;
                var10 = var18;
            }
            this.field440 = arg6 - var10;
            this.field441 = arg1 - var11;
            this.field442 = arg0 - var12;
            this.field443 = arg2;
            this.field444 = arg4;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method140(String arg0) throws IOException {
        if (!this.field294) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field141 != null) {
                try {
                    this.field141.close();
                } catch (Exception var4) {
                }
                this.field141 = null;
            }
            this.field141 = this.method87(43595);
            this.field141.setSoTimeout(10000);
            InputStream var2 = this.field141.getInputStream();
            OutputStream var3 = this.field141.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method141(int arg0) {
        int var2 = 23 / arg0;
        for (class55 var3 = (class55) this.field512.method71(); var3 != null; var3 = (class55) this.field512.method73(67)) {
            if (this.field302 == var3.field1408 && field183 <= var3.field1395) {
                if (field183 >= var3.field1394) {
                    if (var3.field1390 > 0) {
                        class1 var4 = this.field354[var3.field1390 - 1];
                        if (var4 != null && var4.field1555 >= 0 && var4.field1555 < 13312 && var4.field1556 >= 0 && var4.field1556 < 13312) {
                            var3.method490(var4.field1556, var4.field1555, field183, (byte) 9, this.method197(var4.field1555, var3.field1408, var4.field1556, -235) - var3.field1412);
                        }
                    }
                    if (var3.field1390 < 0) {
                        int var5 = -var3.field1390 - 1;
                        class23 var6;
                        if (this.field380 == var5) {
                            var6 = field157;
                        } else {
                            var6 = this.field105[var5];
                        }
                        if (var6 != null && var6.field1555 >= 0 && var6.field1555 < 13312 && var6.field1556 >= 0 && var6.field1556 < 13312) {
                            var3.method490(var6.field1556, var6.field1555, field183, (byte) 9, this.method197(var6.field1555, var3.field1408, var6.field1556, -235) - var3.field1412);
                        }
                    }
                    var3.method489(true, this.field381);
                    this.field159.method507((byte) -13, var3, var3.field1391, false, (int) var3.field1398, this.field302, 60, (int) var3.field1399, -1, (int) var3.field1400);
                }
            } else {
                var3.method582();
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IILCFARFRSG;)V")
    public final void method142(int arg0, int arg1, class8 arg2) {
        if (arg1 < 2 || arg1 > 2) {
            this.field111 = null;
        }
        if (arg0 == 128) {
            int var4 = arg2.method50((byte) 70);
            int var5 = (var4 >> 4 & 7) + this.field247;
            int var6 = (var4 & 7) + this.field248;
            int var7 = arg2.method59(this.field548);
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                class9 var8 = this.field111[this.field302][var5][var6];
                if (var8 != null) {
                    for (class11 var9 = (class11) var8.method71(); var9 != null; var9 = (class11) var8.method73(67)) {
                        if ((var7 & 32767) == var9.field579) {
                            var9.method582();
                            break;
                        }
                    }
                    if (var8.method71() == null) {
                        this.field111[this.field302][var5][var6] = null;
                    }
                    this.method150(var5, var6);
                }
            }
        } else if (arg0 == 160) {
            int var10 = arg2.method49(887);
            int var11 = var10 >> 2;
            int var12 = var10 & 3;
            int var13 = this.field502[var11];
            int var14 = arg2.method50((byte) 70);
            int var15 = (var14 >> 4 & 7) + this.field247;
            int var16 = (var14 & 7) + this.field248;
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                this.method93(var11, var12, var15, var13, -1, var16, -1, this.field302, 918, 0);
            }
        } else if (arg0 == 82) {
            int var17 = arg2.method32();
            int var18 = arg2.method51(11818);
            int var19 = (var18 >> 4 & 7) + this.field247;
            int var20 = (var18 & 7) + this.field248;
            int var21 = arg2.method30();
            int var22 = var21 >> 2;
            int var23 = var21 & 3;
            int var24 = this.field502[var22];
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                this.method93(var22, var23, var19, var24, -1, var20, var17, this.field302, 918, 0);
            }
        } else {
            if (arg0 == 202) {
                int var25 = arg2.method59(this.field548);
                byte var26 = arg2.method53((byte) 4);
                byte var27 = arg2.method31();
                int var28 = arg2.method32();
                int var29 = arg2.method59(this.field548);
                byte var30 = arg2.method53((byte) 4);
                byte var31 = arg2.method52(true);
                int var32 = arg2.method58(405);
                int var33 = arg2.method30();
                int var34 = (var33 >> 4 & 7) + this.field247;
                int var35 = (var33 & 7) + this.field248;
                int var36 = arg2.method51(11818);
                int var37 = var36 >> 2;
                int var38 = var36 & 3;
                int var39 = this.field502[var37];
                class23 var40;
                if (this.field380 == var29) {
                    var40 = field157;
                } else {
                    var40 = this.field105[var29];
                }
                if (var40 != null) {
                    class54 var41 = class54.method486(var25);
                    int var42 = this.field427[this.field302][var34][var35];
                    int var43 = this.field427[this.field302][var34 + 1][var35];
                    int var44 = this.field427[this.field302][var34 + 1][var35 + 1];
                    int var45 = this.field427[this.field302][var34][var35 + 1];
                    class37 var46 = var41.method478(var37, var38, var42, var43, var44, var45, -1);
                    if (var46 != null) {
                        this.method93(0, 0, var34, var39, var28 + 1, var35, -1, this.field302, 918, var32 + 1);
                        var40.field745 = field183 + var32;
                        var40.field746 = field183 + var28;
                        var40.field732 = var46;
                        int var47 = var41.field1380;
                        int var48 = var41.field1339;
                        if (var38 == 1 || var38 == 3) {
                            var47 = var41.field1339;
                            var48 = var41.field1380;
                        }
                        var40.field729 = var34 * 128 + var47 * 64;
                        var40.field731 = var35 * 128 + var48 * 64;
                        var40.field730 = this.method197(var40.field729, this.field302, var40.field731, -235);
                        if (var31 > var26) {
                            byte var49 = var31;
                            var31 = var26;
                            var26 = var49;
                        }
                        if (var27 > var30) {
                            byte var50 = var27;
                            var27 = var30;
                            var30 = var50;
                        }
                        var40.field737 = var31 + var34;
                        var40.field739 = var26 + var34;
                        var40.field738 = var27 + var35;
                        var40.field740 = var30 + var35;
                    }
                }
            }
            if (arg0 == 177) {
                int var51 = arg2.method30();
                int var52 = (var51 >> 4 & 7) + this.field247;
                int var53 = (var51 & 7) + this.field248;
                int var54 = var52 + arg2.method31();
                int var55 = var53 + arg2.method31();
                int var56 = arg2.method33();
                int var57 = arg2.method32();
                int var58 = arg2.method30() * 4;
                int var59 = arg2.method30() * 4;
                int var60 = arg2.method32();
                int var61 = arg2.method32();
                int var62 = arg2.method30();
                int var63 = arg2.method30();
                if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104 && var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104 && var57 != 65535) {
                    int var64 = var52 * 128 + 64;
                    int var65 = var53 * 128 + 64;
                    int var66 = var54 * 128 + 64;
                    int var67 = var55 * 128 + 64;
                    class55 var68 = new class55(var57, var64, this.method197(var64, this.field302, var65, -235) - var58, var65, -578, var56, var59, var62, this.field302, field183 + var61, var63, field183 + var60);
                    var68.method490(var67, var66, field183 + var60, (byte) 9, this.method197(var66, this.field302, var67, -235) - var59);
                    this.field512.method68(var68);
                }
            } else if (arg0 == 176) {
                int var69 = arg2.method59(this.field548);
                int var70 = arg2.method51(11818);
                int var71 = var70 >> 2;
                int var72 = var70 & 3;
                int var73 = this.field502[var71];
                int var74 = arg2.method30();
                int var75 = (var74 >> 4 & 7) + this.field247;
                int var76 = (var74 & 7) + this.field248;
                if (var75 >= 0 && var76 >= 0 && var75 < 103 && var76 < 103) {
                    int var77 = this.field427[this.field302][var75][var76];
                    int var78 = this.field427[this.field302][var75 + 1][var76];
                    int var79 = this.field427[this.field302][var75 + 1][var76 + 1];
                    int var80 = this.field427[this.field302][var75][var76 + 1];
                    if (var73 == 0) {
                        class72 var81 = this.field159.method518(var76, this.field302, (byte) 9, var75);
                        if (var81 != null) {
                            int var82 = var81.field1739 >> 14 & 32767;
                            if (var71 == 2) {
                                var81.field1737 = new class41((byte) 1, false, var80, var77, var78, var82, 2, var72 + 4, var79, var69);
                                var81.field1738 = new class41((byte) 1, false, var80, var77, var78, var82, 2, var72 + 1 & 3, var79, var69);
                            } else {
                                var81.field1737 = new class41((byte) 1, false, var80, var77, var78, var82, var71, var72, var79, var69);
                            }
                        }
                    }
                    if (var73 == 1) {
                        class40 var83 = this.field159.method519(var75, var76, 3, this.field302);
                        if (var83 != null) {
                            var83.field1055 = new class41((byte) 1, false, var80, var77, var78, var83.field1056 >> 14 & 32767, 4, 0, var79, var69);
                        }
                    }
                    if (var73 == 2) {
                        class69 var84 = this.field159.method520(this.field302, var76, var75, (byte) 6);
                        if (var71 == 11) {
                            var71 = 10;
                        }
                        if (var84 != null) {
                            var84.field1698 = new class41((byte) 1, false, var80, var77, var78, var84.field1706 >> 14 & 32767, var71, var72, var79, var69);
                        }
                    }
                    if (var73 == 3) {
                        class24 var85 = this.field159.method521(var76, this.field302, var75, -731);
                        if (var85 != null) {
                            var85.field755 = new class41((byte) 1, false, var80, var77, var78, var85.field756 >> 14 & 32767, 22, var72, var79, var69);
                        }
                    }
                }
            } else {
                if (arg0 == 244) {
                    int var86 = arg2.method30();
                    int var87 = (var86 >> 4 & 7) + this.field247;
                    int var88 = (var86 & 7) + this.field248;
                    int var89 = arg2.method32();
                    int var90 = arg2.method30();
                    int var91 = var90 >> 4 & 15;
                    int var92 = var90 & 7;
                    if (field157.field1535[0] >= var87 - var91 && field157.field1535[0] <= var87 + var91 && field157.field1536[0] >= var88 - var91 && field157.field1536[0] <= var88 + var91 && this.field319 && !field328 && this.field187 < 50) {
                        this.field321[this.field187] = var89;
                        this.field132[this.field187] = var92;
                        this.field482[this.field187] = class63.field1595[var89];
                        ++this.field187;
                    }
                }
                if (arg0 != 230) {
                    if (arg0 == 95) {
                        int var101 = arg2.method30();
                        int var102 = (var101 >> 4 & 7) + this.field247;
                        int var103 = (var101 & 7) + this.field248;
                        int var104 = arg2.method32();
                        int var105 = arg2.method30();
                        int var106 = arg2.method32();
                        if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                            int var107 = var102 * 128 + 64;
                            int var108 = var103 * 128 + 64;
                            class6 var109 = new class6(0, this.method197(var107, this.field302, var108, -235) - var105, var108, var104, var107, var106, field183, this.field302);
                            this.field133.method68(var109);
                        }
                    } else if (arg0 == 1) {
                        int var110 = arg2.method50((byte) 70);
                        int var111 = (var110 >> 4 & 7) + this.field247;
                        int var112 = (var110 & 7) + this.field248;
                        int var113 = arg2.method57((byte) 1);
                        int var114 = arg2.method57((byte) 1);
                        int var115 = arg2.method57((byte) 1);
                        if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104 && this.field380 != var113) {
                            class11 var116 = new class11();
                            var116.field579 = var115;
                            var116.field580 = var114;
                            if (this.field111[this.field302][var111][var112] == null) {
                                this.field111[this.field302][var111][var112] = new class9(field329);
                            }
                            this.field111[this.field302][var111][var112].method68(var116);
                            this.method150(var111, var112);
                        }
                    } else if (arg0 == 55) {
                        int var117 = arg2.method30();
                        int var118 = (var117 >> 4 & 7) + this.field247;
                        int var119 = (var117 & 7) + this.field248;
                        int var120 = arg2.method57((byte) 1);
                        int var121 = arg2.method58(405);
                        if (var118 >= 0 && var119 >= 0 && var118 < 104 && var119 < 104) {
                            class11 var122 = new class11();
                            var122.field579 = var120;
                            var122.field580 = var121;
                            if (this.field111[this.field302][var118][var119] == null) {
                                this.field111[this.field302][var118][var119] = new class9(field329);
                            }
                            this.field111[this.field302][var118][var119].method68(var122);
                            this.method150(var118, var119);
                        }
                    }
                } else {
                    int var93 = arg2.method30();
                    int var94 = (var93 >> 4 & 7) + this.field247;
                    int var95 = (var93 & 7) + this.field248;
                    int var96 = arg2.method32();
                    int var97 = arg2.method32();
                    int var98 = arg2.method32();
                    if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                        class9 var99 = this.field111[this.field302][var94][var95];
                        if (var99 != null) {
                            for (class11 var100 = (class11) var99.method71(); var100 != null; var100 = (class11) var99.method73(67)) {
                                if ((var96 & 32767) == var100.field579 && var100.field580 == var97) {
                                    var100.field580 = var98;
                                    break;
                                }
                            }
                            this.method150(var94, var95);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method143(int arg0) {
        for (int var2 = -1; var2 < this.field106; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field104;
            } else {
                var6 = this.field107[var2];
            }
            class23 var7 = this.field105[var6];
            if (var7 != null && var7.field1558 > 0) {
                --var7.field1558;
                if (var7.field1558 == 0) {
                    var7.field1564 = null;
                }
            }
        }
        if (arg0 < 0) {
            for (int var3 = 0; var3 < this.field355; ++var3) {
                int var4 = this.field356[var3];
                class1 var5 = this.field354[var4];
                if (var5 != null && var5.field1558 > 0) {
                    --var5.field1558;
                    if (var5.field1558 == 0) {
                        var5.field1564 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILCFARFRSG;)V")
    private final void method144(boolean arg0, int arg1, class8 arg2) {
        arg2.method40(2);
        int var4 = arg2.method41(881, 8);
        if (arg0) {
            this.field477.method20(51);
        }
        if (var4 < this.field355) {
            for (int var5 = var4; var5 < this.field355; ++var5) {
                this.field181[this.field180++] = this.field356[var5];
            }
        }
        if (var4 > this.field355) {
            signlink.reporterror(this.field460 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field355 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field356[var6];
                class1 var8 = this.field354[var7];
                int var9 = arg2.method41(881, 1);
                if (var9 == 0) {
                    this.field356[this.field355++] = var7;
                    var8.field1537 = field183;
                } else {
                    int var10 = arg2.method41(881, 2);
                    if (var10 == 0) {
                        this.field356[this.field355++] = var7;
                        var8.field1537 = field183;
                        this.field109[this.field108++] = var7;
                    } else if (var10 == 1) {
                        this.field356[this.field355++] = var7;
                        var8.field1537 = field183;
                        int var11 = arg2.method41(881, 3);
                        var8.method566(var11, (byte) -62, false);
                        int var12 = arg2.method41(881, 1);
                        if (var12 == 1) {
                            this.field109[this.field108++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field356[this.field355++] = var7;
                        var8.field1537 = field183;
                        int var13 = arg2.method41(881, 3);
                        var8.method566(var13, (byte) -62, true);
                        int var14 = arg2.method41(881, 3);
                        var8.method566(var14, (byte) -62, true);
                        int var15 = arg2.method41(881, 1);
                        if (var15 == 1) {
                            this.field109[this.field108++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field181[this.field180++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method145(byte arg0) {
        for (int var2 = 0; var2 < this.field187; ++var2) {
            if (this.field482[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field321[var2] == this.field289 && this.field132[var2] == this.field359) {
                        if (!this.method210(106)) {
                            var3 = true;
                        }
                    } else {
                        class8 var4 = class63.method572(this.field321[var2], this.field132[var2], -29127);
                        if (System.currentTimeMillis() + (long) (var4.field72 / 22) > (long) (this.field205 / 22) + this.field300) {
                            this.field205 = var4.field72;
                            this.field300 = System.currentTimeMillis();
                            if (this.method198(0, var4.field71, var4.field72)) {
                                this.field289 = this.field321[var2];
                                this.field359 = this.field132[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field482[var2] != -5) {
                    this.field482[var2] = -5;
                } else {
                    --this.field187;
                    for (int var6 = var2; var6 < this.field187; ++var6) {
                        this.field321[var6] = this.field321[var6 + 1];
                        this.field132[var6] = this.field132[var6 + 1];
                        this.field482[var6] = this.field482[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field482[var2]--;
            }
        }
        if (arg0 == -17) {
            if (this.field399 > 0) {
                this.field399 -= 20;
                if (this.field399 < 0) {
                    this.field399 = 0;
                }
                if (this.field399 == 0 && this.field347 && !field328) {
                    this.field295 = this.field135;
                    this.field296 = true;
                    this.field346.method426(2, this.field295);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LFHQGDDHF;IIII)V")
    public final void method146(class23 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field157 != arg0) {
            if (this.field278 < 400) {
                if (arg2 == 0) {
                    String var6;
                    if (arg0.field728 == 0) {
                        var6 = arg0.field733 + method189(arg0.field726, field157.field726, 0) + " (level-" + arg0.field726 + ")";
                    } else {
                        var6 = arg0.field733 + " (skill-" + arg0.field728 + ")";
                    }
                    if (this.field279 == 1) {
                        this.field431[this.field278] = "Use " + this.field283 + " with @whi@" + var6;
                        this.field474[this.field278] = 995;
                        this.field475[this.field278] = arg4;
                        this.field472[this.field278] = arg1;
                        this.field473[this.field278] = arg3;
                        ++this.field278;
                    } else if (this.field264 == 1) {
                        if ((this.field266 & 8) == 8) {
                            this.field431[this.field278] = this.field267 + " @whi@" + var6;
                            this.field474[this.field278] = 475;
                            this.field475[this.field278] = arg4;
                            this.field472[this.field278] = arg1;
                            this.field473[this.field278] = arg3;
                            ++this.field278;
                        }
                    } else {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (this.field163[var7] != null) {
                                this.field431[this.field278] = this.field163[var7] + " @whi@" + var6;
                                short var9 = 0;
                                if (this.field163[var7].equalsIgnoreCase("attack")) {
                                    if (arg0.field726 > field157.field726) {
                                        var9 = 2000;
                                    }
                                    if (field157.field749 != 0 && arg0.field749 != 0) {
                                        if (field157.field749 == arg0.field749) {
                                            var9 = 2000;
                                        } else {
                                            var9 = 0;
                                        }
                                    }
                                } else if (this.field164[var7]) {
                                    var9 = 2000;
                                }
                                if (var7 == 0) {
                                    this.field474[this.field278] = var9 + 371;
                                }
                                if (var7 == 1) {
                                    this.field474[this.field278] = var9 + 101;
                                }
                                if (var7 == 2) {
                                    this.field474[this.field278] = var9 + 184;
                                }
                                if (var7 == 3) {
                                    this.field474[this.field278] = var9 + 137;
                                }
                                if (var7 == 4) {
                                    this.field474[this.field278] = var9 + 390;
                                }
                                this.field475[this.field278] = arg4;
                                this.field472[this.field278] = arg1;
                                this.field473[this.field278] = arg3;
                                ++this.field278;
                            }
                        }
                    }
                    for (int var8 = 0; var8 < this.field278; ++var8) {
                        if (this.field474[var8] == 189) {
                            this.field431[var8] = "Walk here @whi@" + var6;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILCFARFRSG;I)V")
    private final void method147(int arg0, class8 arg1, int arg2) {
        for (int var4 = 0; var4 < this.field108; ++var4) {
            int var5 = this.field109[var4];
            class23 var6 = this.field105[var5];
            int var7 = arg1.method30();
            if ((var7 & 4) != 0) {
                var7 += arg1.method30() << 8;
            }
            this.method217(this.field242, var5, var7, arg1, var6);
        }
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public void method148(boolean arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field121);
        if (this.field346 != null) {
            System.out.println("Od-cycle:" + this.field346.field1140);
        }
        System.out.println("loop-cycle:" + field183);
        System.out.println("draw-cycle:" + field259);
        System.out.println("ptype:" + this.field231);
        System.out.println("psize:" + this.field230);
        if (this.field312 != null) {
            this.field312.method474(true);
        }
        super.field1619 = true;
        this.field501 &= arg0;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)Ljava/awt/Component;")
    public final Component method149(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        } else if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field1625 != null ? super.field1625 : this;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method150(int arg0, int arg1) {
        class9 var3 = this.field111[this.field302][arg0][arg1];
        if (var3 == null) {
            this.field159.method517(this.field302, arg0, arg1);
        } else {
            int var4 = -99999999;
            class11 var5 = null;
            for (class11 var6 = (class11) var3.method71(); var6 != null; var6 = (class11) var3.method73(67)) {
                class34 var11 = class34.method329(var6.field579);
                int var12 = var11.field882;
                if (var11.field933) {
                    var12 = (var6.field580 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method69(-33985, var5);
            class11 var7 = null;
            class11 var8 = null;
            for (class11 var9 = (class11) var3.method71(); var9 != null; var9 = (class11) var3.method73(67)) {
                if (var5.field579 != var9.field579 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field579 != var9.field579 && var7.field579 != var9.field579 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field159.method503(var7, arg0, var8, var10, this.method197(arg0 * 128 + 64, this.field302, arg1 * 128 + 64, -235), arg1, var5, this.field302, 0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LOPFNUBIN;B)Z")
    public final boolean method151(class48 arg0, byte arg1) {
        if (arg1 != -105) {
            throw new NullPointerException();
        } else {
            int var3 = arg0.field1258;
            if (this.field377 == 2) {
                if (var3 == 201) {
                    this.field226 = true;
                    this.field235 = 0;
                    this.field123 = true;
                    this.field494 = "";
                    this.field236 = 1;
                    this.field169 = "Enter name of friend to add to list";
                }
                if (var3 == 202) {
                    this.field226 = true;
                    this.field235 = 0;
                    this.field123 = true;
                    this.field494 = "";
                    this.field236 = 2;
                    this.field169 = "Enter name of friend to delete from list";
                }
            }
            if (var3 == 205) {
                this.field234 = 250;
                return true;
            } else {
                if (var3 == 501) {
                    this.field226 = true;
                    this.field235 = 0;
                    this.field123 = true;
                    this.field494 = "";
                    this.field236 = 4;
                    this.field169 = "Enter name of player to add to list";
                }
                if (var3 == 502) {
                    this.field226 = true;
                    this.field235 = 0;
                    this.field123 = true;
                    this.field494 = "";
                    this.field236 = 5;
                    this.field169 = "Enter name of player to delete from list";
                }
                if (var3 >= 300 && var3 <= 313) {
                    int var4 = (var3 - 300) / 2;
                    int var5 = var3 & 1;
                    int var6 = this.field237[var4];
                    if (var6 != -1) {
                        while (true) {
                            if (var5 == 0) {
                                --var6;
                                if (var6 < 0) {
                                    var6 = class51.field1310 - 1;
                                }
                            }
                            if (var5 == 1) {
                                ++var6;
                                if (var6 >= class51.field1310) {
                                    var6 = 0;
                                }
                            }
                            if (!class51.field1311[var6].field1317 && class51.field1311[var6].field1312 == var4 + (this.field457 ? 0 : 7)) {
                                this.field237[var4] = var6;
                                this.field290 = true;
                                break;
                            }
                        }
                    }
                }
                if (var3 >= 314 && var3 <= 323) {
                    int var7 = (var3 - 314) / 2;
                    int var8 = var3 & 1;
                    int var9 = this.field299[var7];
                    if (var8 == 0) {
                        --var9;
                        if (var9 < 0) {
                            var9 = field449[var7].length - 1;
                        }
                    }
                    if (var8 == 1) {
                        ++var9;
                        if (var9 >= field449[var7].length) {
                            var9 = 0;
                        }
                    }
                    this.field299[var7] = var9;
                    this.field290 = true;
                }
                if (var3 == 324 && !this.field457) {
                    this.field457 = true;
                    this.method138(932);
                }
                if (var3 == 325 && this.field457) {
                    this.field457 = false;
                    this.method138(932);
                }
                if (var3 != 326) {
                    if (var3 == 620) {
                        this.field363 = !this.field363;
                    }
                    if (var3 >= 601 && var3 <= 613) {
                        this.method179(true);
                        if (this.field433.length() > 0) {
                            this.field477.method19(38, 687);
                            this.field477.method26((byte) 9, class71.method587(this.field433));
                            this.field477.method20(var3 - 601);
                            this.field477.method20(this.field363 ? 1 : 0);
                        }
                    }
                    return false;
                } else {
                    this.field477.method19(251, 687);
                    this.field477.method20(this.field457 ? 0 : 1);
                    for (int var10 = 0; var10 < 7; ++var10) {
                        this.field477.method20(this.field237[var10]);
                    }
                    for (int var11 = 0; var11 < 5; ++var11) {
                        this.field477.method20(this.field299[var11]);
                    }
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)Z")
    public final boolean method152(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (this.field312 == null) {
            return false;
        } else {
            try {
                int var2 = this.field312.method471();
                if (var2 == 0) {
                    return false;
                }
                if (this.field231 == -1) {
                    this.field312.method472(this.field432.field71, 0, 1);
                    this.field231 = this.field432.field71[0] & 255;
                    if (this.field470 != null) {
                        this.field231 = this.field231 - this.field470.method475() & 255;
                    }
                    this.field230 = class27.field787[this.field231];
                    --var2;
                }
                if (this.field230 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field312.method472(this.field432.field71, 0, 1);
                    this.field230 = this.field432.field71[0] & 255;
                    --var2;
                }
                if (this.field230 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field312.method472(this.field432.field71, 0, 2);
                    this.field432.field72 = 0;
                    this.field230 = this.field432.method32();
                    var2 -= 2;
                }
                if (var2 < this.field230) {
                    return false;
                }
                this.field432.field72 = 0;
                this.field312.method472(this.field432.field71, 0, this.field230);
                this.field232 = 0;
                this.field258 = this.field257;
                this.field257 = this.field256;
                this.field256 = this.field231;
                if (this.field231 == 117) {
                    int var3 = this.field432.method59(this.field548);
                    int var4 = this.field432.method32();
                    int var5 = this.field432.method32();
                    class48.field1221[var4].field1236 = (var5 << 16) + var3;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 58) {
                    this.field377 = this.field432.method30();
                    this.field91 = true;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 70) {
                    this.field123 = false;
                    this.field235 = 2;
                    this.field193 = "";
                    this.field226 = true;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 153) {
                    int var6 = this.field432.method57((byte) 1);
                    class48 var7 = class48.field1221[var6];
                    for (int var8 = 0; var8 < var7.field1251.length; ++var8) {
                        var7.field1251[var8] = -1;
                        var7.field1251[var8] = 0;
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 17) {
                    String var9 = this.field432.method37();
                    if (var9.endsWith(":tradereq:")) {
                        String var10 = var9.substring(0, var9.indexOf(":"));
                        long var11 = class71.method587(var10);
                        boolean var13 = false;
                        for (int var14 = 0; var14 < this.field382; ++var14) {
                            if (this.field318[var14] == var11) {
                                var13 = true;
                                break;
                            }
                        }
                        if (!var13 && this.field397 == 0) {
                            this.method120("wishes to trade with you.", var10, 2, 4);
                        }
                    } else if (var9.endsWith(":duelreq:")) {
                        String var15 = var9.substring(0, var9.indexOf(":"));
                        long var16 = class71.method587(var15);
                        boolean var18 = false;
                        for (int var19 = 0; var19 < this.field382; ++var19) {
                            if (this.field318[var19] == var16) {
                                var18 = true;
                                break;
                            }
                        }
                        if (!var18 && this.field397 == 0) {
                            this.method120("wishes to duel with you.", var15, 2, 8);
                        }
                    } else if (!var9.endsWith(":chalreq:")) {
                        this.method120(var9, "", 2, 0);
                    } else {
                        String var20 = var9.substring(0, var9.indexOf(":"));
                        long var21 = class71.method587(var20);
                        boolean var23 = false;
                        for (int var24 = 0; var24 < this.field382; ++var24) {
                            if (this.field318[var24] == var21) {
                                var23 = true;
                                break;
                            }
                        }
                        if (!var23 && this.field397 == 0) {
                            String var25 = var9.substring(var9.indexOf(":") + 1, var9.length() - 9);
                            this.method120(var25, var20, 2, 8);
                        }
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 166) {
                    this.field479 = this.field432.method58(405) * 30;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 113) {
                    this.method154(190);
                    this.field231 = -1;
                    return false;
                }
                if (this.field231 == 143) {
                    int var26 = this.field432.method61(9);
                    int var27 = this.field432.method59(this.field548);
                    int var28 = this.field432.method61(9);
                    class48 var29 = class48.field1221[var27];
                    var29.field1271 = var28;
                    var29.field1270 = var26;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 253) {
                    int var30 = this.field432.method57((byte) 1);
                    int var31 = this.field432.method57((byte) 1);
                    class48.field1221[var31].field1246 = 2;
                    class48.field1221[var31].field1247 = var30;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 228) {
                    this.field248 = this.field432.method51(11818);
                    this.field247 = this.field432.method50((byte) 70);
                    while (this.field432.field72 < this.field230) {
                        int var32 = this.field432.method30();
                        this.method142(var32, 2, this.field432);
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 251) {
                    long var33 = this.field432.method36((byte) -111);
                    int var35 = this.field432.method30();
                    String var36 = class71.method591(1, class71.method588(var33, (byte) -66));
                    for (int var37 = 0; var37 < this.field376; ++var37) {
                        if (this.field331[var37] == var33) {
                            if (this.field204[var37] != var35) {
                                this.field204[var37] = var35;
                                this.field91 = true;
                                if (var35 > 0) {
                                    this.method120(var36 + " has logged in.", "", 2, 5);
                                }
                                if (var35 == 0) {
                                    this.method120(var36 + " has logged out.", "", 2, 5);
                                }
                            }
                            var36 = null;
                            break;
                        }
                    }
                    if (var36 != null && this.field376 < 200) {
                        this.field331[this.field376] = var33;
                        this.field131[this.field376] = var36;
                        this.field204[this.field376] = var35;
                        ++this.field376;
                        this.field91 = true;
                    }
                    boolean var38 = false;
                    while (!var38) {
                        var38 = true;
                        for (int var39 = 0; var39 < this.field376 - 1; ++var39) {
                            if (this.field204[var39] != field325 && this.field204[var39 + 1] == field325 || this.field204[var39] == 0 && this.field204[var39 + 1] != 0) {
                                int var40 = this.field204[var39];
                                this.field204[var39] = this.field204[var39 + 1];
                                this.field204[var39 + 1] = var40;
                                String var41 = this.field131[var39];
                                this.field131[var39] = this.field131[var39 + 1];
                                this.field131[var39 + 1] = var41;
                                long var42 = this.field331[var39];
                                this.field331[var39] = this.field331[var39 + 1];
                                this.field331[var39 + 1] = var42;
                                this.field91 = true;
                                var38 = false;
                            }
                        }
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 59) {
                    int var44 = this.field432.method60(true);
                    this.field345 = var44;
                    this.field226 = true;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 181) {
                    int var45 = this.field432.method59(this.field548);
                    int var46 = this.field432.method30();
                    if (var45 == 65535) {
                        var45 = -1;
                    }
                    this.field130[var46] = var45;
                    this.field91 = true;
                    this.field430 = true;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 86) {
                    this.field438 = this.field432.method30();
                    this.field175 = this.field432.method30();
                    this.field155 = this.field432.method30();
                    this.field550 = true;
                    this.field226 = true;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 66) {
                    for (int var47 = 0; var47 < this.field105.length; ++var47) {
                        if (this.field105[var47] != null) {
                            this.field105[var47].field1571 = -1;
                        }
                    }
                    for (int var48 = 0; var48 < this.field354.length; ++var48) {
                        if (this.field354[var48] != null) {
                            this.field354[var48].field1571 = -1;
                        }
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 88) {
                    long var49 = this.field432.method36((byte) -111);
                    int var51 = this.field432.method35();
                    int var52 = this.field432.method30();
                    boolean var53 = false;
                    for (int var54 = 0; var54 < 100; ++var54) {
                        if (this.field371[var54] == var51) {
                            var53 = true;
                            break;
                        }
                    }
                    if (var52 <= 1) {
                        for (int var55 = 0; var55 < this.field382; ++var55) {
                            if (this.field318[var55] == var49) {
                                var53 = true;
                                break;
                            }
                        }
                    }
                    if (!var53 && this.field397 == 0) {
                        try {
                            this.field371[this.field375] = var51;
                            this.field375 = (this.field375 + 1) % 100;
                            String var56 = class18.method267(-916, this.field230 - 13, this.field432);
                            if (var52 != 3) {
                                var56 = class43.method382(-211, var56);
                            }
                            if (var52 != 2 && var52 != 3) {
                                if (var52 == 1) {
                                    this.method120(var56, "@cr1@" + class71.method591(1, class71.method588(var49, (byte) -66)), 2, 7);
                                } else {
                                    this.method120(var56, class71.method591(1, class71.method588(var49, (byte) -66)), 2, 3);
                                }
                            } else {
                                this.method120(var56, "@cr2@" + class71.method591(1, class71.method588(var49, (byte) -66)), 2, 7);
                            }
                        } catch (Exception var191) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 216) {
                    int var58 = this.field432.method60(true);
                    if (var58 >= 0) {
                        this.method113(var58, 314);
                    }
                    this.field244 = var58;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 129) {
                    int var59 = this.field432.method57((byte) 1);
                    this.method113(var59, 314);
                    if (this.field388 != -1) {
                        this.field388 = -1;
                        this.field91 = true;
                        this.field430 = true;
                    }
                    if (this.field522 != -1) {
                        this.field522 = -1;
                        this.field226 = true;
                    }
                    if (this.field301 != -1) {
                        this.field301 = -1;
                        this.field208 = true;
                    }
                    if (this.field235 != 0) {
                        this.field235 = 0;
                        this.field226 = true;
                    }
                    this.field481 = var59;
                    this.field434 = false;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 18) {
                    int var60 = this.field432.method57((byte) 1);
                    int var61 = this.field432.method32();
                    class48.field1221[var60].field1246 = 1;
                    class48.field1221[var60].field1247 = var61;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 3) {
                    int var62 = this.field432.method58(405);
                    int var63 = this.field432.method59(this.field548);
                    int var64 = this.field432.method58(405);
                    int var65 = this.field432.method58(405);
                    class48.field1221[var62].field1244 = var63;
                    class48.field1221[var62].field1245 = var65;
                    class48.field1221[var62].field1243 = var64;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 65) {
                    this.field97 = this.field432.method50((byte) 70);
                    this.field91 = true;
                    this.field430 = true;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 101) {
                    this.field91 = true;
                    int var66 = this.field432.method30();
                    int var67 = this.field432.method35();
                    int var68 = this.field432.method30();
                    this.field547[var68] = var67;
                    this.field188[var68] = var66;
                    this.field240[var68] = 1;
                    for (int var69 = 0; var69 < 98; ++var69) {
                        if (var67 >= field129[var69]) {
                            this.field240[var68] = var69 + 2;
                        }
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 27) {
                    int var70 = this.field432.method57((byte) 1);
                    int var71 = this.field432.method57((byte) 1);
                    int var72 = this.field432.method59(this.field548);
                    if (var71 == 65535) {
                        class48.field1221[var72].field1246 = 0;
                        this.field231 = -1;
                        return true;
                    }
                    class34 var73 = class34.method329(var71);
                    class48.field1221[var72].field1246 = 4;
                    class48.field1221[var72].field1247 = var71;
                    class48.field1221[var72].field1244 = var73.field920;
                    class48.field1221[var72].field1245 = var73.field895;
                    class48.field1221[var72].field1243 = var73.field916 * 100 / var70;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 126) {
                    int var74 = this.field432.method58(405);
                    int var75 = this.field432.method60(true);
                    class48 var76 = class48.field1221[var74];
                    var76.field1261 = var75;
                    if (var75 == -1) {
                        var76.field1274 = 0;
                        var76.field1238 = 0;
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 246) {
                    this.field251 = this.field432.method50((byte) 70);
                    this.field380 = this.field432.method32();
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 208) {
                    int var77 = this.field432.method32();
                    this.method113(var77, 314);
                    this.field481 = -1;
                    this.field388 = -1;
                    this.field522 = -1;
                    this.field235 = 0;
                    this.field434 = false;
                    this.field301 = var77;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 223) {
                    boolean var78 = this.field432.method30() == 1;
                    int var79 = this.field432.method57((byte) 1);
                    class48.field1221[var79].field1266 = var78;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 94) {
                    int var80 = this.field432.method50((byte) 70);
                    String var81 = this.field432.method37();
                    int var82 = this.field432.method50((byte) 70);
                    if (var80 >= 1 && var80 <= 5) {
                        if (var81.equalsIgnoreCase("null")) {
                            var81 = null;
                        }
                        this.field163[var80 - 1] = var81;
                        this.field164[var80 - 1] = var82 == 0;
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 155) {
                    int var83 = this.field432.method59(this.field548);
                    this.method113(var83, 314);
                    if (this.field388 != -1) {
                        this.field388 = -1;
                        this.field91 = true;
                        this.field430 = true;
                    }
                    if (this.field301 != -1) {
                        this.field301 = -1;
                        this.field208 = true;
                    }
                    this.field522 = var83;
                    this.field226 = true;
                    this.field481 = -1;
                    this.field434 = false;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 179) {
                    this.method110(0, this.field230, this.field432);
                    this.field556 = false;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 111) {
                    int var84 = this.field432.method57((byte) 1);
                    int var85 = this.field432.method59(this.field548);
                    if (this.field522 != -1) {
                        this.field522 = -1;
                        this.field226 = true;
                    }
                    if (this.field235 != 0) {
                        this.field235 = 0;
                        this.field226 = true;
                    }
                    this.field481 = var84;
                    this.field388 = var85;
                    this.field91 = true;
                    this.field430 = true;
                    this.field434 = false;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 52) {
                    if (this.field97 == 12) {
                        this.field91 = true;
                    }
                    this.field532 = this.field432.method30();
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 109) {
                    this.field288 = false;
                    for (int var86 = 0; var86 < 5; ++var86) {
                        this.field367[var86] = false;
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 241) {
                    this.field123 = false;
                    this.field235 = 1;
                    this.field193 = "";
                    this.field226 = true;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 4) {
                    int var87 = this.field432.method35();
                    int var88 = this.field432.method59(this.field548);
                    this.field398[var88] = var87;
                    if (this.field414[var88] != var87) {
                        this.field414[var88] = var87;
                        this.method202(var88, 0);
                        this.field91 = true;
                        if (this.field345 != -1) {
                            this.field226 = true;
                        }
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 244 || this.field231 == 230 || this.field231 == 202 || this.field231 == 1 || this.field231 == 95 || this.field231 == 177 || this.field231 == 128 || this.field231 == 55 || this.field231 == 176 || this.field231 == 160 || this.field231 == 82) {
                    this.method142(this.field231, 2, this.field432);
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 235) {
                    this.field247 = this.field432.method49(887);
                    this.field248 = this.field432.method30();
                    for (int var89 = this.field247; var89 < this.field247 + 8; ++var89) {
                        for (int var90 = this.field248; var90 < this.field248 + 8; ++var90) {
                            if (this.field111[this.field302][var89][var90] != null) {
                                this.field111[this.field302][var89][var90] = null;
                                this.method150(var89, var90);
                            }
                        }
                    }
                    for (class29 var91 = (class29) this.field523.method71(); var91 != null; var91 = (class29) this.field523.method73(67)) {
                        if (var91.field806 >= this.field247 && var91.field806 < this.field247 + 8 && var91.field807 >= this.field248 && var91.field807 < this.field248 + 8 && this.field302 == var91.field804) {
                            var91.field808 = 0;
                        }
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 130) {
                    if (this.field388 != -1) {
                        this.field388 = -1;
                        this.field91 = true;
                        this.field430 = true;
                    }
                    if (this.field522 != -1) {
                        this.field522 = -1;
                        this.field226 = true;
                    }
                    if (this.field301 != -1) {
                        this.field301 = -1;
                        this.field208 = true;
                    }
                    if (this.field235 != 0) {
                        this.field235 = 0;
                        this.field226 = true;
                    }
                    this.field481 = -1;
                    this.field434 = false;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 192) {
                    String var92 = this.field432.method37();
                    int var93 = this.field432.method59(this.field548);
                    class48.field1221[var93].field1269 = var92;
                    if (this.field130[this.field97] == class48.field1221[var93].field1229) {
                        this.field91 = true;
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 60) {
                    int var94 = this.field432.method32();
                    byte var95 = this.field432.method52(true);
                    this.field398[var94] = var95;
                    if (this.field414[var94] != var95) {
                        this.field414[var94] = var95;
                        this.method202(var94, 0);
                        this.field91 = true;
                        if (this.field345 != -1) {
                            this.field226 = true;
                        }
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 28) {
                    int var96 = this.field432.method58(405);
                    class48.field1221[var96].field1246 = 3;
                    if (field157.field748 == null) {
                        class48.field1221[var96].field1247 = (field157.field747[11] << 5) + (field157.field747[8] << 10) + (field157.field747[0] << 15) + (field157.field744[0] << 25) + (field157.field744[4] << 20) + field157.field747[1];
                    } else {
                        class48.field1221[var96].field1247 = (int) (field157.field748.field1181 + 305419896L);
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 201) {
                    this.field248 = this.field432.method50((byte) 70);
                    this.field247 = this.field432.method49(887);
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 110) {
                    for (int var97 = 0; var97 < this.field414.length; ++var97) {
                        if (this.field414[var97] != this.field398[var97]) {
                            this.field414[var97] = this.field398[var97];
                            this.method202(var97, 0);
                            this.field91 = true;
                        }
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 87) {
                    this.field471 = this.field432.method30();
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 24) {
                    this.field91 = true;
                    int var98 = this.field432.method32();
                    class48 var99 = class48.field1221[var98];
                    int var100 = this.field432.method32();
                    for (int var101 = 0; var101 < var100; ++var101) {
                        int var102 = this.field432.method50((byte) 70);
                        if (var102 == 255) {
                            var102 = this.field432.method35();
                        }
                        var99.field1251[var101] = this.field432.method57((byte) 1);
                        var99.field1275[var101] = var102;
                    }
                    for (int var103 = var100; var103 < var99.field1251.length; ++var103) {
                        var99.field1251[var103] = 0;
                        var99.field1275[var103] = 0;
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 212) {
                    this.field469 = this.field432.method49(887);
                    if (this.field97 == this.field469) {
                        if (this.field469 == 3) {
                            this.field97 = 1;
                        } else {
                            this.field97 = 3;
                        }
                        this.field91 = true;
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 9) {
                    int var104 = this.field432.method58(405);
                    int var105 = this.field432.method57((byte) 1);
                    int var106 = var105 >> 10 & 31;
                    int var107 = var105 >> 5 & 31;
                    int var108 = var105 & 31;
                    class48.field1221[var104].field1256 = (var108 << 3) + (var106 << 19) + (var107 << 11);
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 78) {
                    this.field148 = 0;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 236) {
                    int var109 = this.field432.method32();
                    int var110 = this.field432.method30();
                    int var111 = this.field432.method32();
                    if (this.field319 && !field328 && this.field187 < 50) {
                        this.field321[this.field187] = var109;
                        this.field132[this.field187] = var110;
                        this.field482[this.field187] = class63.field1595[var109] + var111;
                        ++this.field187;
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 89) {
                    if (this.field97 == 12) {
                        this.field91 = true;
                    }
                    this.field313 = this.field432.method33();
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 168) {
                    int var112 = this.field432.method57((byte) 1);
                    if (var112 == 65535) {
                        var112 = -1;
                    }
                    if (this.field135 != var112 && this.field347 && !field328 && this.field399 == 0) {
                        this.field295 = var112;
                        this.field296 = true;
                        this.field346.method426(2, this.field295);
                    }
                    this.field135 = var112;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 83) {
                    int var113 = this.field432.method59(this.field548);
                    int var114 = this.field432.method62(-642);
                    if (this.field347 && !field328) {
                        this.field295 = var113;
                        this.field296 = false;
                        this.field346.method426(2, this.field295);
                        this.field399 = var114;
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 249) {
                    this.method131(this.field432, false, this.field230);
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 96 || this.field231 == 44) {
                    int var115 = this.field435;
                    int var116 = this.field436;
                    if (this.field231 == 96) {
                        var115 = this.field432.method32();
                        var116 = this.field432.method59(this.field548);
                        this.field467 = false;
                    }
                    if (this.field231 == 44) {
                        var116 = this.field432.method59(this.field548);
                        this.field432.method40(2);
                        int var117 = 0;
                        while (true) {
                            if (var117 >= 4) {
                                this.field432.method42(0);
                                var115 = this.field432.method58(405);
                                this.field467 = true;
                                break;
                            }
                            for (int var118 = 0; var118 < 13; ++var118) {
                                for (int var119 = 0; var119 < 13; ++var119) {
                                    int var120 = this.field432.method41(881, 1);
                                    if (var120 == 1) {
                                        this.field177[var117][var118][var119] = this.field432.method41(881, 26);
                                    } else {
                                        this.field177[var117][var118][var119] = -1;
                                    }
                                }
                            }
                            ++var117;
                        }
                    }
                    if (this.field435 == var115 && this.field436 == var116 && this.field311 == 2) {
                        this.field231 = -1;
                        return true;
                    }
                    this.field435 = var115;
                    this.field436 = var116;
                    this.field453 = (this.field435 - 6) * 8;
                    this.field454 = (this.field436 - 6) * 8;
                    this.field524 = false;
                    if ((this.field435 / 8 == 48 || this.field435 / 8 == 49) && this.field436 / 8 == 48) {
                        this.field524 = true;
                    }
                    if (this.field435 / 8 == 48 && this.field436 / 8 == 148) {
                        this.field524 = true;
                    }
                    this.field311 = 1;
                    this.field184 = System.currentTimeMillis();
                    this.field309.method264(this.field483);
                    this.field271.method278(151, "Loading - please wait.", 0, 257, 2);
                    this.field271.method278(150, "Loading - please wait.", 16777215, 256, 2);
                    this.field309.method265(4, 4, super.field1622, 0);
                    if (this.field231 == 96) {
                        int var121 = 0;
                        int var122 = (this.field435 - 6) / 8;
                        label1127: while (true) {
                            if (var122 > (this.field435 + 6) / 8) {
                                this.field407 = new byte[var121][];
                                this.field151 = new byte[var121][];
                                this.field557 = new int[var121];
                                this.field558 = new int[var121];
                                this.field559 = new int[var121];
                                int var124 = 0;
                                int var125 = (this.field435 - 6) / 8;
                                while (true) {
                                    if (var125 > (this.field435 + 6) / 8) {
                                        break label1127;
                                    }
                                    for (int var126 = (this.field436 - 6) / 8; var126 <= (this.field436 + 6) / 8; ++var126) {
                                        this.field557[var124] = (var125 << 8) + var126;
                                        if (!this.field524 || var126 != 49 && var126 != 149 && var126 != 147 && var125 != 50 && (var125 != 49 || var126 != 47)) {
                                            int var127 = this.field558[var124] = this.field346.method424(0, var126, var125, (byte) 5);
                                            if (var127 != -1) {
                                                this.field346.method426(3, var127);
                                            }
                                            int var128 = this.field559[var124] = this.field346.method424(1, var126, var125, (byte) 5);
                                            if (var128 != -1) {
                                                this.field346.method426(3, var128);
                                            }
                                            ++var124;
                                        } else {
                                            this.field558[var124] = -1;
                                            this.field559[var124] = -1;
                                            ++var124;
                                        }
                                    }
                                    ++var125;
                                }
                            }
                            for (int var123 = (this.field436 - 6) / 8; var123 <= (this.field436 + 6) / 8; ++var123) {
                                ++var121;
                            }
                            ++var122;
                        }
                    }
                    if (this.field231 == 44) {
                        int var129 = 0;
                        int[] var130 = new int[676];
                        int var131 = 0;
                        label1086: while (true) {
                            if (var131 >= 4) {
                                this.field407 = new byte[var129][];
                                this.field151 = new byte[var129][];
                                this.field557 = new int[var129];
                                this.field558 = new int[var129];
                                this.field559 = new int[var129];
                                int var139 = 0;
                                while (true) {
                                    if (var139 >= var129) {
                                        break label1086;
                                    }
                                    int var140 = this.field557[var139] = var130[var139];
                                    int var141 = var140 >> 8 & 255;
                                    int var142 = var140 & 255;
                                    int var143 = this.field558[var139] = this.field346.method424(0, var142, var141, (byte) 5);
                                    if (var143 != -1) {
                                        this.field346.method426(3, var143);
                                    }
                                    int var144 = this.field559[var139] = this.field346.method424(1, var142, var141, (byte) 5);
                                    if (var144 != -1) {
                                        this.field346.method426(3, var144);
                                    }
                                    ++var139;
                                }
                            }
                            for (int var132 = 0; var132 < 13; ++var132) {
                                for (int var133 = 0; var133 < 13; ++var133) {
                                    int var134 = this.field177[var131][var132][var133];
                                    if (var134 != -1) {
                                        int var135 = var134 >> 14 & 1023;
                                        int var136 = var134 >> 3 & 2047;
                                        int var137 = (var135 / 8 << 8) + var136 / 8;
                                        for (int var138 = 0; var138 < var129; ++var138) {
                                            if (var130[var138] == var137) {
                                                var137 = -1;
                                                break;
                                            }
                                        }
                                        if (var137 != -1) {
                                            var130[var129++] = var137;
                                        }
                                    }
                                }
                            }
                            ++var131;
                        }
                    }
                    int var145 = this.field453 - this.field455;
                    int var146 = this.field454 - this.field456;
                    this.field455 = this.field453;
                    this.field456 = this.field454;
                    for (int var147 = 0; var147 < 16384; ++var147) {
                        class1 var148 = this.field354[var147];
                        if (var148 != null) {
                            for (int var149 = 0; var149 < 10; ++var149) {
                                var148.field1535[var149] -= var145;
                                var148.field1536[var149] -= var146;
                            }
                            var148.field1555 -= var145 * 128;
                            var148.field1556 -= var146 * 128;
                        }
                    }
                    for (int var150 = 0; var150 < this.field103; ++var150) {
                        class23 var151 = this.field105[var150];
                        if (var151 != null) {
                            for (int var152 = 0; var152 < 10; ++var152) {
                                var151.field1535[var152] -= var145;
                                var151.field1536[var152] -= var146;
                            }
                            var151.field1555 -= var145 * 128;
                            var151.field1556 -= var146 * 128;
                        }
                    }
                    this.field556 = true;
                    byte var153 = 0;
                    byte var154 = 104;
                    byte var155 = 1;
                    if (var145 < 0) {
                        var153 = 103;
                        var154 = -1;
                        var155 = -1;
                    }
                    byte var156 = 0;
                    byte var157 = 104;
                    byte var158 = 1;
                    if (var146 < 0) {
                        var156 = 103;
                        var157 = -1;
                        var158 = -1;
                    }
                    for (int var159 = var153; var154 != var159; var159 += var155) {
                        for (int var160 = var156; var157 != var160; var160 += var158) {
                            int var161 = var145 + var159;
                            int var162 = var146 + var160;
                            for (int var163 = 0; var163 < 4; ++var163) {
                                if (var161 >= 0 && var162 >= 0 && var161 < 104 && var162 < 104) {
                                    this.field111[var163][var159][var160] = this.field111[var163][var161][var162];
                                } else {
                                    this.field111[var163][var159][var160] = null;
                                }
                            }
                        }
                    }
                    for (class29 var164 = (class29) this.field523.method71(); var164 != null; var164 = (class29) this.field523.method73(67)) {
                        var164.field806 -= var145;
                        var164.field807 -= var146;
                        if (var164.field806 < 0 || var164.field807 < 0 || var164.field806 >= 104 || var164.field807 >= 104) {
                            var164.method582();
                        }
                    }
                    if (this.field148 != 0) {
                        this.field148 -= var145;
                        this.field149 -= var146;
                    }
                    this.field288 = false;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 150) {
                    this.field382 = this.field230 / 8;
                    for (int var165 = 0; var165 < this.field382; ++var165) {
                        this.field318[var165] = this.field432.method36((byte) -111);
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 145) {
                    this.field288 = true;
                    this.field391 = this.field432.method30();
                    this.field392 = this.field432.method30();
                    this.field393 = this.field432.method32();
                    this.field394 = this.field432.method30();
                    this.field395 = this.field432.method30();
                    if (this.field395 >= 100) {
                        this.field440 = this.field391 * 128 + 64;
                        this.field442 = this.field392 * 128 + 64;
                        this.field441 = this.method197(this.field440, this.field302, this.field442, -235) - this.field393;
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 206) {
                    int var166 = this.field432.method59(this.field548);
                    int var167 = this.field432.method58(405);
                    class48 var168 = class48.field1221[var166];
                    if (var168 != null && var168.field1273 == 0) {
                        if (var167 < 0) {
                            var167 = 0;
                        }
                        if (var167 > var168.field1263 - var168.field1242) {
                            var167 = var168.field1263 - var168.field1242;
                        }
                        var168.field1267 = var167;
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 106) {
                    int var169 = this.field432.method30();
                    int var170 = this.field432.method30();
                    int var171 = this.field432.method30();
                    int var172 = this.field432.method30();
                    this.field367[var169] = true;
                    this.field171[var169] = var170;
                    this.field263[var169] = var171;
                    this.field339[var169] = var172;
                    this.field139[var169] = 0;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 156) {
                    this.field122 = this.field432.method30();
                    this.field90 = this.field432.method49(887);
                    this.field478 = this.field432.method58(405);
                    this.field98 = this.field432.method59(this.field548);
                    this.field189 = this.field432.method64(false);
                    if (this.field189 != 0 && this.field481 == -1) {
                        signlink.dnslookup(class71.method590(this.field189, true));
                        this.method179(true);
                        short var173 = 650;
                        if (this.field122 != 201 || this.field90 == 1) {
                            var173 = 655;
                        }
                        this.field433 = "";
                        this.field363 = false;
                        for (int var174 = 0; var174 < class48.field1221.length; ++var174) {
                            if (class48.field1221[var174] != null && class48.field1221[var174].field1258 == var173) {
                                this.field481 = class48.field1221[var174].field1229;
                                break;
                            }
                        }
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 172) {
                    this.field288 = true;
                    this.field462 = this.field432.method30();
                    this.field463 = this.field432.method30();
                    this.field464 = this.field432.method32();
                    this.field465 = this.field432.method30();
                    this.field466 = this.field432.method30();
                    if (this.field466 >= 100) {
                        int var175 = this.field462 * 128 + 64;
                        int var176 = this.field463 * 128 + 64;
                        int var177 = this.method197(var175, this.field302, var176, -235) - this.field464;
                        int var178 = var175 - this.field440;
                        int var179 = var177 - this.field441;
                        int var180 = var176 - this.field442;
                        int var181 = (int) Math.sqrt((double) (var178 * var178 + var180 * var180));
                        this.field443 = (int) (Math.atan2((double) var179, (double) var181) * 325.949D) & 2047;
                        this.field444 = (int) (Math.atan2((double) var178, (double) var180) * -325.949D) & 2047;
                        if (this.field443 < 128) {
                            this.field443 = 128;
                        }
                        if (this.field443 > 383) {
                            this.field443 = 383;
                        }
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 40) {
                    this.field91 = true;
                    int var182 = this.field432.method32();
                    class48 var183 = class48.field1221[var182];
                    while (this.field432.field72 < this.field230) {
                        int var184 = this.field432.method44();
                        int var185 = this.field432.method32();
                        int var186 = this.field432.method30();
                        if (var186 == 255) {
                            var186 = this.field432.method35();
                        }
                        if (var184 >= 0 && var184 < var183.field1251.length) {
                            var183.field1251[var184] = var185;
                            var183.field1275[var184] = var186;
                        }
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 154) {
                    this.field429 = this.field432.method30();
                    if (this.field429 == 1) {
                        this.field396 = this.field432.method32();
                    }
                    if (this.field429 >= 2 && this.field429 <= 6) {
                        if (this.field429 == 2) {
                            this.field337 = 64;
                            this.field338 = 64;
                        }
                        if (this.field429 == 3) {
                            this.field337 = 0;
                            this.field338 = 64;
                        }
                        if (this.field429 == 4) {
                            this.field337 = 128;
                            this.field338 = 64;
                        }
                        if (this.field429 == 5) {
                            this.field337 = 64;
                            this.field338 = 0;
                        }
                        if (this.field429 == 6) {
                            this.field337 = 64;
                            this.field338 = 128;
                        }
                        this.field429 = 2;
                        this.field334 = this.field432.method32();
                        this.field335 = this.field432.method32();
                        this.field336 = this.field432.method30();
                    }
                    if (this.field429 == 10) {
                        this.field125 = this.field432.method32();
                    }
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 90) {
                    int var187 = this.field432.method59(this.field548);
                    this.method113(var187, 314);
                    if (this.field522 != -1) {
                        this.field522 = -1;
                        this.field226 = true;
                    }
                    if (this.field235 != 0) {
                        this.field235 = 0;
                        this.field226 = true;
                    }
                    if (this.field301 != -1) {
                        this.field301 = -1;
                        this.field208 = true;
                    }
                    this.field388 = var187;
                    this.field91 = true;
                    this.field430 = true;
                    this.field481 = -1;
                    this.field434 = false;
                    this.field231 = -1;
                    return true;
                }
                if (this.field231 == 173) {
                    this.field514 = this.field432.method30();
                    this.field231 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field231 + "," + this.field230 + " - " + this.field257 + "," + this.field258);
                this.method154(190);
            } catch (IOException var192) {
                this.method88(true);
            } catch (Exception var193) {
                String var189 = "T2 - " + this.field231 + "," + this.field257 + "," + this.field258 + " - " + this.field230 + "," + (field157.field1535[0] + this.field453) + "," + (field157.field1536[0] + this.field454) + " - ";
                for (int var190 = 0; var190 < this.field230 && var190 < 50; ++var190) {
                    var189 = var189 + this.field432.field71[var190] + ",";
                }
                signlink.reporterror(var189);
                this.method154(190);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method153(byte arg0) {
        this.field307.method264(this.field483);
        class59.field1509 = this.field423;
        this.field172.method275(0, 0, 9);
        if (this.field388 != -1) {
            this.method126(0, 0, 0, class48.field1221[this.field388], (byte) -125);
        } else if (this.field130[this.field97] != -1) {
            this.method126(0, 0, 0, class48.field1221[this.field130[this.field97]], (byte) -125);
        }
        if (this.field448 && this.field221 == 1) {
            this.method81(-14011);
        }
        this.field307.method265(205, 553, super.field1622, 0);
        this.field309.method264(this.field483);
        class59.field1509 = this.field424;
        if (arg0 == -96) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method154(int arg0) {
        try {
            if (this.field312 != null) {
                this.field312.method469();
            }
        } catch (Exception var3) {
        }
        this.field312 = null;
        this.field501 = false;
        this.field142 = 0;
        this.field460 = "";
        this.field461 = "";
        if (arg0 <= 0) {
            this.field425 = !this.field425;
        }
        this.method203((byte) 56);
        this.field159.method496(0);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field529[var2].method300();
        }
        System.gc();
        this.method78((byte) 81);
        this.field135 = -1;
        this.field295 = -1;
        this.field399 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LOPFNUBIN;IIIIIIII)V")
    public final void method155(class48 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field535) {
            this.field277 = 32;
        } else {
            this.field277 = 0;
        }
        this.field535 = false;
        while (arg3 >= 0) {
            this.field536 = !this.field536;
        }
        if (arg1 >= arg5 && arg1 < arg5 + 16 && arg7 >= arg2 && arg7 < arg2 + 16) {
            arg0.field1267 -= this.field540 * 4;
            if (arg6 == 1) {
                this.field91 = true;
            }
            if (arg6 == 2) {
                this.field226 = true;
                return;
            }
        } else if (arg1 >= arg5 && arg1 < arg5 + 16 && arg7 >= arg2 + arg4 - 16 && arg7 < arg2 + arg4) {
            arg0.field1267 += this.field540 * 4;
            if (arg6 == 1) {
                this.field91 = true;
            }
            if (arg6 == 2) {
                this.field226 = true;
                return;
            }
        } else {
            if (arg1 < arg5 - this.field277 || arg1 >= arg5 + 16 + this.field277 || arg7 < arg2 + 16 || arg7 >= arg2 + arg4 - 16 || this.field540 <= 0) {
                return;
            }
            int var10 = (arg4 - 32) * arg4 / arg8;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg7 - arg2 - 16 - var10 / 2;
            int var12 = arg4 - 32 - var10;
            arg0.field1267 = (arg8 - arg4) * var11 / var12;
            if (arg6 == 1) {
                this.field91 = true;
            }
            if (arg6 == 2) {
                this.field226 = true;
            }
            this.field535 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)Z")
    public final boolean method156(int arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        } else if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field474[arg0];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 50;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method157(boolean arg0, int arg1) {
        if (field157.field1555 >> 7 == this.field148 && field157.field1556 >> 7 == this.field149) {
            this.field148 = 0;
        }
        int var3 = this.field106;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class23 var5;
            int var6;
            if (arg0) {
                var5 = field157;
                var6 = this.field104 << 14;
            } else {
                var5 = this.field105[this.field107[var4]];
                var6 = this.field107[var4] << 14;
            }
            if (var5 != null && var5.method2(false)) {
                var5.field734 = false;
                if ((field328 && this.field106 > 50 || this.field106 > 200) && !arg0 && var5.field1578 == var5.field1566) {
                    var5.field734 = true;
                }
                int var7 = var5.field1555 >> 7;
                int var8 = var5.field1556 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field732 != null && field183 >= var5.field745 && field183 < var5.field746) {
                        var5.field734 = false;
                        var5.field741 = this.method197(var5.field1555, this.field302, var5.field1556, -235);
                        this.field159.method508((byte) -3, var5.field739, var6, var5, var5.field1555, 60, var5.field1556, this.field302, var5.field738, var5.field1557, var5.field741, var5.field737, var5.field740);
                    } else {
                        if ((var5.field1555 & 127) == 64 && (var5.field1556 & 127) == 64) {
                            if (this.field94[var7][var8] == this.field451) {
                                continue;
                            }
                            this.field94[var7][var8] = this.field451;
                        }
                        var5.field741 = this.method197(var5.field1555, this.field302, var5.field1556, -235);
                        this.field159.method507((byte) -13, var5, var5.field1557, var5.field1559, var5.field1555, this.field302, 60, var5.field1556, var6, var5.field741);
                    }
                }
            }
        }
        this.field230 += arg1;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method158(boolean arg0, String arg1) {
        if (arg0) {
            this.field548 = 0;
        }
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field376; ++var3) {
                if (arg1.equalsIgnoreCase(this.field131[var3])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(field157.field733);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILCUKAGIIJ;I)V")
    public final void method159(int arg0, int arg1, class10 arg2, int arg3) {
        int var5 = this.field349 + this.field332 & 2047;
        if (arg0 > 0) {
            int var6 = arg1 * arg1 + arg3 * arg3;
            if (var6 <= 6400) {
                int var7 = class37.field1030[var5];
                int var8 = class37.field1031[var5];
                int var9 = var7 * 256 / (this.field285 + 256);
                int var10 = var8 * 256 / (this.field285 + 256);
                int var11 = arg1 * var10 + arg3 * var9 >> 16;
                int var12 = arg3 * var10 - arg1 * var9 >> 16;
                if (var6 > 2500) {
                    arg2.method229(this.field173, 83 - var12 - arg2.field578 / 2 - 4, 0, var11 + 94 - arg2.field577 / 2 + 4);
                } else {
                    arg2.method223(var11 + 94 - arg2.field577 / 2 + 4, 83 - var12 - arg2.field578 / 2 - 4, 9);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method160(int arg0) {
        if (arg0 != 47759) {
            this.field231 = -1;
        }
        if (this.field514 == 0) {
            if (super.field1636 == 1) {
                int var2 = super.field1637 - 25 - 550;
                int var3 = super.field1638 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field349 + this.field332 & 2047;
                    int var5 = class59.field1507[var4];
                    int var6 = class59.field1508[var4];
                    int var7 = (this.field285 + 256) * var5 >> 8;
                    int var8 = (this.field285 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field157.field1555 + var9 >> 7;
                    int var12 = field157.field1556 - var10 >> 7;
                    boolean var13 = this.method192(var11, 0, field157.field1535[0], 0, 0, var12, 1, 0, true, 0, field157.field1536[0], this.field154);
                    if (var13) {
                        this.field477.method20(var2);
                        this.field477.method20(var3);
                        this.field477.method21(this.field349);
                        this.field477.method20(57);
                        this.field477.method20(this.field332);
                        this.field477.method20(this.field285);
                        this.field477.method20(89);
                        this.field477.method21(field157.field1555);
                        this.field477.method21(field157.field1556);
                        this.field477.method20(this.field421);
                        this.field477.method20(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIZ)V")
    public final void method161(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field501 &= arg5;
        this.field541.method275(arg3, arg0, 9);
        this.field542.method275(arg3, arg0 + arg4 - 16, 9);
        class46.method436(arg3, arg0 + 16, 2, this.field365, 16, arg4 - 32);
        int var7 = (arg4 - 32) * arg4 / arg1;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg4 - 32 - var7) * arg2 / (arg1 - arg4);
        class46.method436(arg3, arg0 + 16 + var8, 2, this.field417, 16, var7);
        class46.method441(arg3, 185, arg0 + 16 + var8, this.field543, var7);
        class46.method441(arg3 + 1, 185, arg0 + 16 + var8, this.field543, var7);
        class46.method439(16, arg0 + 16 + var8, true, this.field543, arg3);
        class46.method439(16, arg0 + 17 + var8, true, this.field543, arg3);
        class46.method441(arg3 + 15, 185, arg0 + 16 + var8, this.field93, var7);
        class46.method441(arg3 + 14, 185, arg0 + 17 + var8, this.field93, var7 - 1);
        class46.method439(16, arg0 + 15 + var8 + var7, true, this.field93, arg3);
        class46.method439(15, arg0 + 14 + var8 + var7, true, this.field93, arg3 + 1);
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method162(boolean arg0) {
        int var2 = this.field272.method280(498, "Choose Option");
        for (int var3 = 0; var3 < this.field278; ++var3) {
            int var11 = this.field272.method280(498, this.field431[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        if (arg0) {
            this.field231 = this.field432.method30();
        }
        var2 += 8;
        int var4 = this.field278 * 15 + 21;
        if (super.field1637 > 4 && super.field1638 > 4 && super.field1637 < 516 && super.field1638 < 338) {
            int var5 = super.field1637 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field1638 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field448 = true;
            this.field221 = 0;
            this.field222 = var5;
            this.field223 = var6;
            this.field224 = var2;
            this.field225 = this.field278 * 15 + 22;
        }
        if (super.field1637 > 553 && super.field1638 > 205 && super.field1637 < 743 && super.field1638 < 466) {
            int var7 = super.field1637 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field1638 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field448 = true;
            this.field221 = 1;
            this.field222 = var7;
            this.field223 = var8;
            this.field224 = var2;
            this.field225 = this.field278 * 15 + 22;
        }
        if (super.field1637 > 17 && super.field1638 > 357 && super.field1637 < 496 && super.field1638 < 453) {
            int var9 = super.field1637 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field1638 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field448 = true;
            this.field221 = 2;
            this.field222 = var9;
            this.field223 = var10;
            this.field224 = var2;
            this.field225 = this.field278 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method163(byte arg0) {
        signlink.reporterror = false;
        try {
            if (this.field312 != null) {
                this.field312.method469();
            }
        } catch (Exception var2) {
        }
        this.field312 = null;
        this.method78((byte) 81);
        if (this.field243 != null) {
            this.field243.field670 = false;
        }
        this.field243 = null;
        this.field346.method418();
        this.field346 = null;
        this.field353 = null;
        this.field477 = null;
        this.field551 = null;
        this.field432 = null;
        this.field557 = null;
        this.field407 = null;
        this.field151 = null;
        this.field558 = null;
        this.field559 = null;
        this.field427 = null;
        this.field368 = null;
        this.field159 = null;
        this.field529 = null;
        this.field528 = null;
        this.field495 = null;
        this.field515 = null;
        this.field516 = null;
        this.field238 = null;
        this.field307 = null;
        this.field308 = null;
        this.field309 = null;
        this.field310 = null;
        this.field195 = null;
        this.field196 = null;
        this.field197 = null;
        this.field212 = null;
        this.field213 = null;
        this.field214 = null;
        this.field215 = null;
        this.field216 = null;
        this.field217 = null;
        this.field218 = null;
        this.field219 = null;
        this.field220 = null;
        this.field172 = null;
        this.field173 = null;
        this.field174 = null;
        this.field537 = null;
        this.field538 = null;
        this.field539 = null;
        this.field250 = null;
        this.field402 = null;
        this.field403 = null;
        this.field404 = null;
        this.field405 = null;
        this.field406 = null;
        this.field408 = null;
        this.field409 = null;
        this.field410 = null;
        this.field411 = null;
        this.field412 = null;
        this.field199 = null;
        this.field96 = null;
        this.field372 = null;
        this.field340 = null;
        this.field507 = null;
        this.field508 = null;
        this.field509 = null;
        this.field510 = null;
        this.field511 = null;
        this.field361 = null;
        this.field497 = null;
        this.field94 = null;
        this.field105 = null;
        this.field107 = null;
        this.field109 = null;
        this.field110 = null;
        this.field181 = null;
        this.field354 = null;
        this.field356 = null;
        this.field111 = null;
        this.field523 = null;
        this.field512 = null;
        this.field133 = null;
        this.field472 = null;
        this.field473 = null;
        this.field474 = null;
        this.field475 = null;
        this.field431 = null;
        this.field414 = null;
        this.field161 = null;
        this.field162 = null;
        this.field170 = null;
        this.field150 = null;
        this.field131 = null;
        this.field331 = null;
        this.field204 = null;
        this.field115 = null;
        this.field116 = null;
        this.field112 = null;
        this.field113 = null;
        this.field114 = null;
        this.field117 = null;
        this.field118 = null;
        this.field119 = null;
        this.field120 = null;
        if (arg0 != 1) {
            field293 = !field293;
        }
        this.method85((byte) 4);
        class54.method484(true);
        class47.method450(true);
        class34.method333(true);
        class70.field1711 = null;
        class51.field1311 = null;
        class48.field1221 = null;
        class39.field1040 = null;
        class32.field816 = null;
        class4.field15 = null;
        class4.field27 = null;
        class49.field1285 = null;
        super.field1623 = null;
        class23.field750 = null;
        class59.method547(true);
        class57.method495(true);
        class37.method337(true);
        class7.method15(true);
        System.gc();
        if (class67.field1668) {
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method164(int arg0) {
        byte[] var2 = this.field560.method570("title.dat", (byte[]) null);
        class10 var3 = new class10(var2, this);
        this.field115.method264(this.field483);
        var3.method221((byte) 3, 0, 0);
        this.field116.method264(this.field483);
        var3.method221((byte) 3, 0, -637);
        this.field112.method264(this.field483);
        var3.method221((byte) 3, 0, -128);
        this.field113.method264(this.field483);
        var3.method221((byte) 3, -371, -202);
        this.field114.method264(this.field483);
        var3.method221((byte) 3, -171, -202);
        this.field117.method264(this.field483);
        var3.method221((byte) 3, -265, 0);
        this.field118.method264(this.field483);
        var3.method221((byte) 3, -265, -562);
        this.field119.method264(this.field483);
        var3.method221((byte) 3, -171, -128);
        if (arg0 <= 0) {
            field549 = -127;
        }
        this.field120.method264(this.field483);
        var3.method221((byte) 3, -171, -562);
        int[] var4 = new int[var3.field573];
        for (int var5 = 0; var5 < var3.field574; ++var5) {
            for (int var10 = 0; var10 < var3.field573; ++var10) {
                var4[var10] = var3.field572[var3.field573 * var5 + (var3.field573 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field573; ++var11) {
                var3.field572[var3.field573 * var5 + var11] = var4[var11];
            }
        }
        this.field115.method264(this.field483);
        var3.method221((byte) 3, 0, 382);
        this.field116.method264(this.field483);
        var3.method221((byte) 3, 0, -255);
        this.field112.method264(this.field483);
        var3.method221((byte) 3, 0, 254);
        this.field113.method264(this.field483);
        var3.method221((byte) 3, -371, 180);
        this.field114.method264(this.field483);
        var3.method221((byte) 3, -171, 180);
        this.field117.method264(this.field483);
        var3.method221((byte) 3, -265, 382);
        this.field118.method264(this.field483);
        var3.method221((byte) 3, -265, -180);
        this.field119.method264(this.field483);
        var3.method221((byte) 3, -171, 254);
        this.field120.method264(this.field483);
        var3.method221((byte) 3, -171, -180);
        class10 var6 = new class10(this.field560, "logo", 0);
        this.field112.method264(this.field483);
        var6.method223(382 - var6.field573 / 2 - 128, 18, 9);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method165(boolean arg0) {
        Graphics var2 = this.method149(true).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method580(1, -604);
        this.field501 &= arg0;
        if (this.field241) {
            this.field291 = false;
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
        if (this.field428) {
            this.field291 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field253) {
            this.field291 = false;
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

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method166(int arg0) {
        this.field383 = new class21(this.field560, "titlebox", 0);
        this.field384 = new class21(this.field560, "titlebutton", 0);
        this.field480 = new class21[12];
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field480[var3] = new class21(this.field560, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field480[var4] = new class21(this.field560, "runes", (var4 & 3) + 12);
            }
        }
        this.field261 = new class10(128, 265);
        this.field262 = new class10(128, 265);
        if (arg0 != -21557) {
            this.field477.method20(28);
        }
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field261.field572[var5] = this.field115.field656[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field262.field572[var6] = this.field116.field656[var6];
        }
        this.field518 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field518[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field518[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field518[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field518[var10 + 192] = 16777215;
        }
        this.field519 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field519[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field519[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field519[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field519[var14 + 192] = 16777215;
        }
        this.field520 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field520[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field520[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field520[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field520[var18 + 192] = 16777215;
        }
        this.field517 = new int[256];
        this.field210 = new int[32768];
        this.field211 = new int[32768];
        this.method86(0, (class21) null);
        this.field499 = new int[32768];
        this.field500 = new int[32768];
        this.method206(9, 10, "Connecting to fileserver");
        if (!this.field291) {
            this.field343 = true;
            this.field291 = true;
            this.method129(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    private final void method167(boolean arg0) {
        class29 var2 = (class29) this.field523.method71();
        if (!arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        while (var2 != null) {
            if (var2.field808 == -1) {
                var2.field809 = 0;
                this.method79(var2, 41195);
            } else {
                var2.method582();
            }
            var2 = (class29) this.field523.method73(67);
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method168(boolean arg0) {
        for (int var2 = 0; var2 < this.field355; ++var2) {
            int var3 = this.field356[var2];
            class1 var4 = this.field354[var3];
            if (var4 != null) {
                this.method169(var4.field2.field1190, var4, -68);
            }
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILVNAWUDPP;I)V")
    public final void method169(int arg0, class61 arg1, int arg2) {
        if (arg1.field1555 < 128 || arg1.field1556 < 128 || arg1.field1555 >= 13184 || arg1.field1556 >= 13184) {
            arg1.field1571 = -1;
            arg1.field1527 = -1;
            arg1.field1547 = 0;
            arg1.field1548 = 0;
            arg1.field1555 = arg1.field1535[0] * 128 + arg1.field1565 * 64;
            arg1.field1556 = arg1.field1536[0] * 128 + arg1.field1565 * 64;
            arg1.method567(true);
        }
        if (field157 == arg1 && (arg1.field1555 < 1536 || arg1.field1556 < 1536 || arg1.field1555 >= 11776 || arg1.field1556 >= 11776)) {
            arg1.field1571 = -1;
            arg1.field1527 = -1;
            arg1.field1547 = 0;
            arg1.field1548 = 0;
            arg1.field1555 = arg1.field1535[0] * 128 + arg1.field1565 * 64;
            arg1.field1556 = arg1.field1536[0] * 128 + arg1.field1565 * 64;
            arg1.method567(true);
        }
        if (arg1.field1547 > field183) {
            this.method170(arg1, 11544);
        } else if (arg1.field1548 >= field183) {
            this.method171(true, arg1);
        } else {
            this.method172((byte) 7, arg1);
        }
        this.method173((byte) -120, arg1);
        while (arg2 >= 0) {
            field329 = -472;
        }
        this.method174(9, arg1);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LVNAWUDPP;I)V")
    public final void method170(class61 arg0, int arg1) {
        int var3 = arg0.field1547 - field183;
        int var4 = arg0.field1565 * 64 + arg0.field1543 * 128;
        int var5 = arg0.field1565 * 64 + arg0.field1545 * 128;
        arg0.field1555 += (var4 - arg0.field1555) / var3;
        arg0.field1556 += (var5 - arg0.field1556) / var3;
        arg0.field1577 = 0;
        if (arg1 != 11544) {
            this.field111 = null;
        }
        if (arg0.field1549 == 0) {
            arg0.field1561 = 1024;
        }
        if (arg0.field1549 == 1) {
            arg0.field1561 = 1536;
        }
        if (arg0.field1549 == 2) {
            arg0.field1561 = 0;
        }
        if (arg0.field1549 == 3) {
            arg0.field1561 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLVNAWUDPP;)V")
    public final void method171(boolean arg0, class61 arg1) {
        if (field183 == arg1.field1548 || arg1.field1571 == -1 || arg1.field1574 != 0 || arg1.field1573 + 1 > class32.field816[arg1.field1571].method322((byte) 5, arg1.field1572)) {
            int var3 = arg1.field1548 - arg1.field1547;
            int var4 = field183 - arg1.field1547;
            int var5 = arg1.field1565 * 64 + arg1.field1543 * 128;
            int var6 = arg1.field1565 * 64 + arg1.field1545 * 128;
            int var7 = arg1.field1565 * 64 + arg1.field1544 * 128;
            int var8 = arg1.field1565 * 64 + arg1.field1546 * 128;
            arg1.field1555 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field1556 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field1577 = 0;
        if (arg1.field1549 == 0) {
            arg1.field1561 = 1024;
        }
        if (arg1.field1549 == 1) {
            arg1.field1561 = 1536;
        }
        if (arg1.field1549 == 2) {
            arg1.field1561 = 0;
        }
        if (arg1.field1549 == 3) {
            arg1.field1561 = 512;
        }
        arg1.field1557 = arg1.field1561;
        if (!arg0) {
            this.method178();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLVNAWUDPP;)V")
    public final void method172(byte arg0, class61 arg1) {
        arg1.field1578 = arg1.field1566;
        if (arg0 == 7) {
            boolean var3 = false;
        } else {
            this.field477.method20(148);
        }
        if (arg1.field1550 == 0) {
            arg1.field1577 = 0;
        } else {
            if (arg1.field1571 != -1 && arg1.field1574 == 0) {
                class32 var4 = class32.field816[arg1.field1571];
                if (arg1.field1560 > 0 && var4.field828 == 0) {
                    ++arg1.field1577;
                    return;
                }
                if (arg1.field1560 <= 0 && var4.field829 == 0) {
                    ++arg1.field1577;
                    return;
                }
            }
            int var5 = arg1.field1555;
            int var6 = arg1.field1556;
            int var7 = arg1.field1535[arg1.field1550 - 1] * 128 + arg1.field1565 * 64;
            int var8 = arg1.field1536[arg1.field1550 - 1] * 128 + arg1.field1565 * 64;
            if (var7 - var5 <= 256 && var7 - var5 >= -256 && var8 - var6 <= 256 && var8 - var6 >= -256) {
                if (var5 < var7) {
                    if (var6 < var8) {
                        arg1.field1561 = 1280;
                    } else if (var6 > var8) {
                        arg1.field1561 = 1792;
                    } else {
                        arg1.field1561 = 1536;
                    }
                } else if (var5 > var7) {
                    if (var6 < var8) {
                        arg1.field1561 = 768;
                    } else if (var6 > var8) {
                        arg1.field1561 = 256;
                    } else {
                        arg1.field1561 = 512;
                    }
                } else if (var6 < var8) {
                    arg1.field1561 = 1024;
                } else {
                    arg1.field1561 = 0;
                }
                int var9 = arg1.field1561 - arg1.field1557 & 2047;
                if (var9 > 1024) {
                    var9 -= 2048;
                }
                int var10 = arg1.field1539;
                if (var9 >= -256 && var9 <= 256) {
                    var10 = arg1.field1538;
                } else if (var9 >= 256 && var9 < 768) {
                    var10 = arg1.field1541;
                } else if (var9 >= -768 && var9 <= -256) {
                    var10 = arg1.field1540;
                }
                if (var10 == -1) {
                    var10 = arg1.field1538;
                }
                arg1.field1578 = var10;
                int var11 = 4;
                if (arg1.field1561 != arg1.field1557 && arg1.field1576 == -1 && arg1.field1526 != 0) {
                    var11 = 2;
                }
                if (arg1.field1550 > 2) {
                    var11 = 6;
                }
                if (arg1.field1550 > 3) {
                    var11 = 8;
                }
                if (arg1.field1577 > 0 && arg1.field1550 > 1) {
                    var11 = 8;
                    --arg1.field1577;
                }
                if (arg1.field1562[arg1.field1550 - 1]) {
                    var11 <<= 1;
                }
                if (var11 >= 8 && arg1.field1578 == arg1.field1538 && arg1.field1542 != -1) {
                    arg1.field1578 = arg1.field1542;
                }
                if (var5 < var7) {
                    arg1.field1555 += var11;
                    if (arg1.field1555 > var7) {
                        arg1.field1555 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field1555 -= var11;
                    if (arg1.field1555 < var7) {
                        arg1.field1555 = var7;
                    }
                }
                if (var6 < var8) {
                    arg1.field1556 += var11;
                    if (arg1.field1556 > var8) {
                        arg1.field1556 = var8;
                    }
                } else if (var6 > var8) {
                    arg1.field1556 -= var11;
                    if (arg1.field1556 < var8) {
                        arg1.field1556 = var8;
                    }
                }
                if (arg1.field1555 == var7 && arg1.field1556 == var8) {
                    --arg1.field1550;
                    if (arg1.field1560 > 0) {
                        --arg1.field1560;
                        return;
                    }
                }
            } else {
                arg1.field1555 = var7;
                arg1.field1556 = var8;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BLVNAWUDPP;)V")
    public final void method173(byte arg0, class61 arg1) {
        if (arg0 != -120) {
            field274 = this.field470.method475();
        }
        if (arg1.field1526 != 0) {
            if (arg1.field1576 != -1 && arg1.field1576 < 32768) {
                class1 var3 = this.field354[arg1.field1576];
                if (var3 != null) {
                    int var4 = arg1.field1555 - var3.field1555;
                    int var5 = arg1.field1556 - var3.field1556;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field1561 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field1576 >= 32768) {
                int var6 = arg1.field1576 - 32768;
                if (this.field380 == var6) {
                    var6 = this.field104;
                }
                class23 var7 = this.field105[var6];
                if (var7 != null) {
                    int var8 = arg1.field1555 - var7.field1555;
                    int var9 = arg1.field1556 - var7.field1556;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field1561 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field1533 != 0 || arg1.field1534 != 0) && (arg1.field1550 == 0 || arg1.field1577 > 0)) {
                int var10 = arg1.field1555 - (arg1.field1533 - this.field453 - this.field453) * 64;
                int var11 = arg1.field1556 - (arg1.field1534 - this.field454 - this.field454) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field1561 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field1533 = 0;
                arg1.field1534 = 0;
            }
            int var12 = arg1.field1561 - arg1.field1557 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field1526 && var12 <= 2048 - arg1.field1526) {
                    if (var12 > 1024) {
                        arg1.field1557 -= arg1.field1526;
                    } else {
                        arg1.field1557 += arg1.field1526;
                    }
                } else {
                    arg1.field1557 = arg1.field1561;
                }
                arg1.field1557 &= 2047;
                if (arg1.field1578 == arg1.field1566 && arg1.field1561 != arg1.field1557) {
                    if (arg1.field1567 != -1) {
                        arg1.field1578 = arg1.field1567;
                        return;
                    }
                    arg1.field1578 = arg1.field1538;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILVNAWUDPP;)V")
    public final void method174(int arg0, class61 arg1) {
        if (arg0 != 9) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        arg1.field1559 = false;
        if (arg1.field1578 != -1) {
            class32 var4 = class32.field816[arg1.field1578];
            ++arg1.field1580;
            if (arg1.field1579 < var4.field817 && arg1.field1580 > var4.method322((byte) 5, arg1.field1579)) {
                arg1.field1580 = 0;
                ++arg1.field1579;
            }
            if (arg1.field1579 >= var4.field817) {
                arg1.field1580 = 0;
                arg1.field1579 = 0;
            }
        }
        if (arg1.field1527 != -1 && field183 >= arg1.field1530) {
            if (arg1.field1528 < 0) {
                arg1.field1528 = 0;
            }
            class32 var5 = class4.field15[arg1.field1527].field19;
            ++arg1.field1529;
            while (arg1.field1528 < var5.field817 && arg1.field1529 > var5.method322((byte) 5, arg1.field1528)) {
                arg1.field1529 -= var5.method322((byte) 5, arg1.field1528);
                ++arg1.field1528;
            }
            if (arg1.field1528 >= var5.field817 && (arg1.field1528 < 0 || arg1.field1528 >= var5.field817)) {
                arg1.field1527 = -1;
            }
        }
        if (arg1.field1571 != -1 && arg1.field1574 <= 1) {
            class32 var6 = class32.field816[arg1.field1571];
            if (var6.field828 == 1 && arg1.field1560 > 0 && arg1.field1547 <= field183 && arg1.field1548 < field183) {
                arg1.field1574 = 1;
                return;
            }
        }
        if (arg1.field1571 != -1 && arg1.field1574 == 0) {
            class32 var7 = class32.field816[arg1.field1571];
            ++arg1.field1573;
            while (arg1.field1572 < var7.field817 && arg1.field1573 > var7.method322((byte) 5, arg1.field1572)) {
                arg1.field1573 -= var7.method322((byte) 5, arg1.field1572);
                ++arg1.field1572;
            }
            if (arg1.field1572 >= var7.field817) {
                arg1.field1572 -= var7.field821;
                ++arg1.field1575;
                if (arg1.field1575 >= var7.field827) {
                    arg1.field1571 = -1;
                }
                if (arg1.field1572 < 0 || arg1.field1572 >= var7.field817) {
                    arg1.field1571 = -1;
                }
            }
            arg1.field1559 = var7.field823;
        }
        if (arg1.field1574 > 0) {
            --arg1.field1574;
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method175(int arg0) {
        if (this.field208) {
            this.field208 = false;
            this.field212.method265(4, 0, super.field1622, 0);
            this.field213.method265(357, 0, super.field1622, 0);
            this.field214.method265(4, 722, super.field1622, 0);
            this.field215.method265(205, 743, super.field1622, 0);
            this.field216.method265(0, 0, super.field1622, 0);
            this.field217.method265(4, 516, super.field1622, 0);
            this.field218.method265(205, 516, super.field1622, 0);
            this.field219.method265(357, 496, super.field1622, 0);
            this.field220.method265(338, 0, super.field1622, 0);
            this.field91 = true;
            this.field226 = true;
            this.field430 = true;
            this.field550 = true;
            if (this.field311 != 2) {
                this.field309.method265(4, 4, super.field1622, 0);
                this.field308.method265(4, 550, super.field1622, 0);
            }
        }
        if (this.field311 == 2) {
            this.method207(-7889);
        }
        if (this.field448 && this.field221 == 1) {
            this.field91 = true;
        }
        if (this.field388 != -1) {
            boolean var2 = this.method90(this.field381, this.field388, 44494);
            if (var2) {
                this.field91 = true;
            }
        }
        if (this.field506 == 2) {
            this.field91 = true;
        }
        if (this.field145 == 2) {
            this.field91 = true;
        }
        if (this.field91) {
            this.method153((byte) -96);
            this.field91 = false;
        }
        if (this.field522 == -1) {
            this.field206.field1267 = this.field476 - this.field439 - 77;
            if (super.field1630 > 448 && super.field1630 < 560 && super.field1631 > 332) {
                this.method155(this.field206, super.field1630 - 17, 0, -720, 77, 463, -1, super.field1631 - 357, this.field476);
            }
            int var3 = this.field476 - 77 - this.field206.field1267;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field476 - 77) {
                var3 = this.field476 - 77;
            }
            if (this.field439 != var3) {
                this.field439 = var3;
                this.field226 = true;
            }
        }
        if (this.field522 != -1) {
            boolean var4 = this.method90(this.field381, this.field522, 44494);
            if (var4) {
                this.field226 = true;
            }
        }
        if (this.field506 == 3) {
            this.field226 = true;
        }
        if (this.field145 == 3) {
            this.field226 = true;
        }
        if (this.field227 != null) {
            this.field226 = true;
        }
        if (this.field448 && this.field221 == 2) {
            this.field226 = true;
        }
        if (this.field226) {
            this.method191(1);
            this.field226 = false;
        }
        if (this.field311 == 2) {
            this.method213(26351);
            this.field308.method265(4, 550, super.field1622, 0);
        }
        if (this.field469 != -1) {
            this.field430 = true;
        }
        if (this.field430) {
            if (this.field469 != -1 && this.field97 == this.field469) {
                this.field469 = -1;
                this.field477.method19(211, 687);
                this.field477.method20(this.field97);
            }
            this.field430 = false;
            this.field197.method264(this.field483);
            this.field539.method275(0, 0, 9);
            if (this.field388 == -1) {
                if (this.field130[this.field97] != -1) {
                    if (this.field97 == 0) {
                        this.field402.method275(22, 10, 9);
                    }
                    if (this.field97 == 1) {
                        this.field403.method275(54, 8, 9);
                    }
                    if (this.field97 == 2) {
                        this.field403.method275(82, 8, 9);
                    }
                    if (this.field97 == 3) {
                        this.field404.method275(110, 8, 9);
                    }
                    if (this.field97 == 4) {
                        this.field406.method275(153, 8, 9);
                    }
                    if (this.field97 == 5) {
                        this.field406.method275(181, 8, 9);
                    }
                    if (this.field97 == 6) {
                        this.field405.method275(209, 9, 9);
                    }
                }
                if (this.field130[0] != -1 && (this.field469 != 0 || field183 % 20 < 10)) {
                    this.field250[0].method275(29, 13, 9);
                }
                if (this.field130[1] != -1 && (this.field469 != 1 || field183 % 20 < 10)) {
                    this.field250[1].method275(53, 11, 9);
                }
                if (this.field130[2] != -1 && (this.field469 != 2 || field183 % 20 < 10)) {
                    this.field250[2].method275(82, 11, 9);
                }
                if (this.field130[3] != -1 && (this.field469 != 3 || field183 % 20 < 10)) {
                    this.field250[3].method275(115, 12, 9);
                }
                if (this.field130[4] != -1 && (this.field469 != 4 || field183 % 20 < 10)) {
                    this.field250[4].method275(153, 13, 9);
                }
                if (this.field130[5] != -1 && (this.field469 != 5 || field183 % 20 < 10)) {
                    this.field250[5].method275(180, 11, 9);
                }
                if (this.field130[6] != -1 && (this.field469 != 6 || field183 % 20 < 10)) {
                    this.field250[6].method275(208, 13, 9);
                }
            }
            this.field197.method265(160, 516, super.field1622, 0);
            this.field196.method264(this.field483);
            this.field538.method275(0, 0, 9);
            if (this.field388 == -1) {
                if (this.field130[this.field97] != -1) {
                    if (this.field97 == 7) {
                        this.field408.method275(42, 0, 9);
                    }
                    if (this.field97 == 8) {
                        this.field409.method275(74, 0, 9);
                    }
                    if (this.field97 == 9) {
                        this.field409.method275(102, 0, 9);
                    }
                    if (this.field97 == 10) {
                        this.field410.method275(130, 1, 9);
                    }
                    if (this.field97 == 11) {
                        this.field412.method275(173, 0, 9);
                    }
                    if (this.field97 == 12) {
                        this.field412.method275(201, 0, 9);
                    }
                    if (this.field97 == 13) {
                        this.field411.method275(229, 0, 9);
                    }
                }
                if (this.field130[8] != -1 && (this.field469 != 8 || field183 % 20 < 10)) {
                    this.field250[7].method275(74, 2, 9);
                }
                if (this.field130[9] != -1 && (this.field469 != 9 || field183 % 20 < 10)) {
                    this.field250[8].method275(102, 3, 9);
                }
                if (this.field130[10] != -1 && (this.field469 != 10 || field183 % 20 < 10)) {
                    this.field250[9].method275(137, 4, 9);
                }
                if (this.field130[11] != -1 && (this.field469 != 11 || field183 % 20 < 10)) {
                    this.field250[10].method275(174, 2, 9);
                }
                if (this.field130[12] != -1 && (this.field469 != 12 || field183 % 20 < 10)) {
                    this.field250[11].method275(201, 2, 9);
                }
                if (this.field130[13] != -1 && (this.field469 != 13 || field183 % 20 < 10)) {
                    this.field250[12].method275(226, 2, 9);
                }
            }
            this.field196.method265(466, 496, super.field1622, 0);
            this.field309.method264(this.field483);
        }
        if (this.field550) {
            this.field550 = false;
            this.field195.method264(this.field483);
            this.field537.method275(0, 0, 9);
            this.field271.method279(16777215, "Public chat", 744, 28, true, 55);
            if (this.field438 == 0) {
                this.field271.method279(65280, "On", 744, 41, true, 55);
            }
            if (this.field438 == 1) {
                this.field271.method279(16776960, "Friends", 744, 41, true, 55);
            }
            if (this.field438 == 2) {
                this.field271.method279(16711680, "Off", 744, 41, true, 55);
            }
            if (this.field438 == 3) {
                this.field271.method279(65535, "Hide", 744, 41, true, 55);
            }
            this.field271.method279(16777215, "Private chat", 744, 28, true, 184);
            if (this.field175 == 0) {
                this.field271.method279(65280, "On", 744, 41, true, 184);
            }
            if (this.field175 == 1) {
                this.field271.method279(16776960, "Friends", 744, 41, true, 184);
            }
            if (this.field175 == 2) {
                this.field271.method279(16711680, "Off", 744, 41, true, 184);
            }
            this.field271.method279(16777215, "Trade/compete", 744, 28, true, 324);
            if (this.field155 == 0) {
                this.field271.method279(65280, "On", 744, 41, true, 324);
            }
            if (this.field155 == 1) {
                this.field271.method279(16776960, "Friends", 744, 41, true, 324);
            }
            if (this.field155 == 2) {
                this.field271.method279(16711680, "Off", 744, 41, true, 324);
            }
            this.field271.method279(16777215, "Report abuse", 744, 33, true, 458);
            this.field195.method265(453, 0, super.field1622, 0);
            this.field309.method264(this.field483);
        }
        this.field381 = 0;
        if (arg0 >= 0) {
            field329 = 267;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LOPFNUBIN;B)V")
    public final void method176(class48 arg0, byte arg1) {
        int var3 = arg0.field1258;
        if (arg1 != -35) {
            this.field530 = -212;
        }
        if (var3 >= 1 && var3 <= 100 || var3 >= 701 && var3 <= 800) {
            if (var3 == 1 && this.field377 == 0) {
                arg0.field1269 = "Loading friend list";
                arg0.field1257 = 0;
            } else if (var3 == 1 && this.field377 == 1) {
                arg0.field1269 = "Connecting to friendserver";
                arg0.field1257 = 0;
            } else if (var3 == 2 && this.field377 != 2) {
                arg0.field1269 = "Please wait...";
                arg0.field1257 = 0;
            } else {
                int var4 = this.field376;
                if (this.field377 != 2) {
                    var4 = 0;
                }
                if (var3 > 700) {
                    var3 -= 601;
                } else {
                    --var3;
                }
                if (var3 >= var4) {
                    arg0.field1269 = "";
                    arg0.field1257 = 0;
                } else {
                    arg0.field1269 = this.field131[var3];
                    arg0.field1257 = 1;
                }
            }
        } else if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
            int var5 = this.field376;
            if (this.field377 != 2) {
                var5 = 0;
            }
            if (var3 > 800) {
                var3 -= 701;
            } else {
                var3 -= 101;
            }
            if (var3 >= var5) {
                arg0.field1269 = "";
                arg0.field1257 = 0;
            } else {
                if (this.field204[var3] == 0) {
                    arg0.field1269 = "@red@Offline";
                } else if (this.field204[var3] < 200) {
                    if (this.field204[var3] == field325) {
                        arg0.field1269 = "@gre@World-" + (this.field204[var3] - 9);
                    } else {
                        arg0.field1269 = "@yel@World-" + (this.field204[var3] - 9);
                    }
                } else if (this.field204[var3] == field325) {
                    arg0.field1269 = "@gre@Classic" + (this.field204[var3] - 219);
                } else {
                    arg0.field1269 = "@yel@Classic" + (this.field204[var3] - 219);
                }
                arg0.field1257 = 1;
            }
        } else if (var3 == 203) {
            int var6 = this.field376;
            if (this.field377 != 2) {
                var6 = 0;
            }
            arg0.field1263 = var6 * 15 + 20;
            if (arg0.field1263 <= arg0.field1242) {
                arg0.field1263 = arg0.field1242 + 1;
            }
        } else if (var3 >= 401 && var3 <= 500) {
            var3 -= 401;
            if (var3 == 0 && this.field377 == 0) {
                arg0.field1269 = "Loading ignore list";
                arg0.field1257 = 0;
            } else if (var3 == 1 && this.field377 == 0) {
                arg0.field1269 = "Please wait...";
                arg0.field1257 = 0;
            } else {
                int var7 = this.field382;
                if (this.field377 == 0) {
                    var7 = 0;
                }
                if (var3 >= var7) {
                    arg0.field1269 = "";
                    arg0.field1257 = 0;
                } else {
                    arg0.field1269 = class71.method591(1, class71.method588(this.field318[var3], (byte) -66));
                    arg0.field1257 = 1;
                }
            }
        } else if (var3 == 503) {
            arg0.field1263 = this.field382 * 15 + 20;
            if (arg0.field1263 <= arg0.field1242) {
                arg0.field1263 = arg0.field1242 + 1;
            }
        } else if (var3 == 327) {
            arg0.field1244 = 150;
            arg0.field1245 = (int) (Math.sin((double) field183 / 40.0D) * 256.0D) & 2047;
            if (this.field290) {
                for (int var8 = 0; var8 < 7; ++var8) {
                    int var15 = this.field237[var8];
                    if (var15 >= 0 && !class51.field1311[var15].method465(506)) {
                        return;
                    }
                }
                this.field290 = false;
                class37[] var9 = new class37[7];
                int var10 = 0;
                for (int var11 = 0; var11 < 7; ++var11) {
                    int var14 = this.field237[var11];
                    if (var14 >= 0) {
                        var9[var10++] = class51.field1311[var14].method466(18165);
                    }
                }
                class37 var12 = new class37(var10, 698, var9);
                for (int var13 = 0; var13 < 5; ++var13) {
                    if (this.field299[var13] != 0) {
                        var12.method355(field449[var13][0], field449[var13][this.field299[var13]]);
                        if (var13 == 1) {
                            var12.method355(field369[0], field369[this.field299[var13]]);
                        }
                    }
                }
                var12.method348(false);
                var12.method349(class32.field816[field157.field1566].field818[0], (byte) 89);
                var12.method358(64, 850, -30, -50, -30, true);
                arg0.field1246 = 5;
                arg0.field1247 = 0;
                class48.method451(0, 0, var12, 5);
            }
        } else if (var3 == 324) {
            if (this.field525 == null) {
                this.field525 = arg0.field1281;
                this.field526 = arg0.field1222;
            }
            if (this.field457) {
                arg0.field1281 = this.field526;
            } else {
                arg0.field1281 = this.field525;
            }
        } else if (var3 == 325) {
            if (this.field525 == null) {
                this.field525 = arg0.field1281;
                this.field526 = arg0.field1222;
            }
            if (this.field457) {
                arg0.field1281 = this.field525;
            } else {
                arg0.field1281 = this.field526;
            }
        } else if (var3 == 600) {
            arg0.field1269 = this.field433;
            if (field183 % 20 < 10) {
                arg0.field1269 = arg0.field1269 + "|";
            } else {
                arg0.field1269 = arg0.field1269 + " ";
            }
        } else {
            if (var3 == 620) {
                if (this.field344 >= 1) {
                    if (this.field363) {
                        arg0.field1256 = 16711680;
                        arg0.field1269 = "Moderator option: Mute player for 48 hours: <ON>";
                    } else {
                        arg0.field1256 = 16777215;
                        arg0.field1269 = "Moderator option: Mute player for 48 hours: <OFF>";
                    }
                } else {
                    arg0.field1269 = "";
                }
            }
            if (var3 == 650 || var3 == 655) {
                if (this.field189 != 0) {
                    String var16;
                    if (this.field98 == 0) {
                        var16 = "earlier today";
                    } else if (this.field98 == 1) {
                        var16 = "yesterday";
                    } else {
                        var16 = this.field98 + " days ago";
                    }
                    arg0.field1269 = "You last logged in " + var16 + " from: " + signlink.dns;
                } else {
                    arg0.field1269 = "";
                }
            }
            if (var3 == 651) {
                if (this.field478 == 0) {
                    arg0.field1269 = "0 unread messages";
                    arg0.field1256 = 16776960;
                }
                if (this.field478 == 1) {
                    arg0.field1269 = "1 unread message";
                    arg0.field1256 = 65280;
                }
                if (this.field478 > 1) {
                    arg0.field1269 = this.field478 + " unread messages";
                    arg0.field1256 = 65280;
                }
            }
            if (var3 == 652) {
                if (this.field122 == 201) {
                    if (this.field90 == 1) {
                        arg0.field1269 = "@yel@This is a non-members world: @whi@Since you are a member we";
                    } else {
                        arg0.field1269 = "";
                    }
                } else if (this.field122 == 200) {
                    arg0.field1269 = "You have not yet set any password recovery questions.";
                } else {
                    String var17;
                    if (this.field122 == 0) {
                        var17 = "Earlier today";
                    } else if (this.field122 == 1) {
                        var17 = "Yesterday";
                    } else {
                        var17 = this.field122 + " days ago";
                    }
                    arg0.field1269 = var17 + " you changed your recovery questions";
                }
            }
            if (var3 == 653) {
                if (this.field122 == 201) {
                    if (this.field90 == 1) {
                        arg0.field1269 = "@whi@recommend you use a members world instead. You may use";
                    } else {
                        arg0.field1269 = "";
                    }
                } else if (this.field122 == 200) {
                    arg0.field1269 = "We strongly recommend you do so now to secure your account.";
                } else {
                    arg0.field1269 = "If you do not remember making this change then cancel it immediately";
                }
            }
            if (var3 == 654) {
                if (this.field122 == 201) {
                    if (this.field90 == 1) {
                        arg0.field1269 = "@whi@this world but member benefits are unavailable whilst here.";
                    } else {
                        arg0.field1269 = "";
                    }
                } else if (this.field122 == 200) {
                    arg0.field1269 = "Do this from the 'account management' area on our front webpage";
                } else {
                    arg0.field1269 = "Do this from the 'account management' area on our front webpage";
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method177(int arg0) {
        this.field208 = true;
        this.field230 += arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method178() {
        this.method206(9, 20, "Starting up");
        if (signlink.sunjava) {
            super.field1616 = 5;
        }
        if (field330) {
            this.field253 = true;
        } else {
            field330 = true;
            boolean var1 = false;
            String var2 = this.method137(7);
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
            if (var2.endsWith("192.168.1.224")) {
                var1 = true;
            }
            if (var2.endsWith("127.0.0.1")) {
                var1 = true;
            }
            if (!var1) {
                this.field428 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field324[var3] = new class50(0, 500000, signlink.cache_idx[var3], var3 + 1, signlink.cache_dat);
                    }
                }
                try {
                    this.method216((byte) -17);
                    this.field560 = this.method135(1, 0, "title screen", "title", this.field389[1], 25);
                    this.field270 = new class22(this.field560, "p11_full", false, true);
                    this.field271 = new class22(this.field560, "p12_full", false, true);
                    this.field272 = new class22(this.field560, "b12_full", false, true);
                    this.field273 = new class22(this.field560, "q8_full", true, true);
                    this.method164(624);
                    this.method166(-21557);
                    class62 var4 = this.method135(2, 0, "config", "config", this.field389[2], 30);
                    class62 var5 = this.method135(3, 0, "interface", "interface", this.field389[3], 35);
                    class62 var6 = this.method135(4, 0, "2d graphics", "media", this.field389[4], 40);
                    class62 var7 = this.method135(6, 0, "textures", "textures", this.field389[6], 45);
                    class62 var8 = this.method135(7, 0, "chat system", "wordenc", this.field389[7], 50);
                    class62 var9 = this.method135(8, 0, "sound effects", "sounds", this.field389[8], 55);
                    this.field368 = new byte[4][104][104];
                    this.field427 = new int[4][105][105];
                    this.field159 = new class57(104, (byte) -97, 104, 4, this.field427);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field529[var10] = new class28(104, 104, true);
                    }
                    this.field150 = new class10(512, 512);
                    class62 var11 = this.method135(5, 0, "update list", "versionlist", this.field389[5], 60);
                    this.method206(9, 60, "Connecting to update server");
                    this.field346 = new class45();
                    this.field346.method429(var11, this);
                    class7.method13(this.field346.method415(138));
                    class37.method338(this.field346.method419(0, field275), this.field346);
                    if (!field328) {
                        this.field295 = 0;
                        try {
                            this.field295 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field296 = true;
                        this.field346.method426(2, this.field295);
                        while (this.field346.method410() > 0) {
                            this.method97(false);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field346.field1129 > 3) {
                                this.method76("ondemand");
                                return;
                            }
                        }
                    }
                    this.method206(9, 65, "Requesting animations");
                    int var12 = this.field346.method419(1, field275);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field346.method426(1, var13);
                    }
                    while (this.field346.method410() > 0) {
                        int var14 = var12 - this.field346.method410();
                        if (var14 > 0) {
                            this.method206(9, 65, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method97(false);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field346.field1129 > 3) {
                            this.method76("ondemand");
                            return;
                        }
                    }
                    this.method206(9, 70, "Requesting models");
                    int var15 = this.field346.method419(0, field275);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field346.method422(0, var16);
                        if ((var17 & 1) != 0) {
                            this.field346.method426(0, var16);
                        }
                    }
                    int var18 = this.field346.method410();
                    while (this.field346.method410() > 0) {
                        int var19 = var18 - this.field346.method410();
                        if (var19 > 0) {
                            this.method206(9, 70, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method97(false);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field324[0] != null) {
                        this.method206(9, 75, "Requesting maps");
                        this.field346.method426(3, this.field346.method424(0, 48, 47, (byte) 5));
                        this.field346.method426(3, this.field346.method424(1, 48, 47, (byte) 5));
                        this.field346.method426(3, this.field346.method424(0, 48, 48, (byte) 5));
                        this.field346.method426(3, this.field346.method424(1, 48, 48, (byte) 5));
                        this.field346.method426(3, this.field346.method424(0, 48, 49, (byte) 5));
                        this.field346.method426(3, this.field346.method424(1, 48, 49, (byte) 5));
                        this.field346.method426(3, this.field346.method424(0, 47, 47, (byte) 5));
                        this.field346.method426(3, this.field346.method424(1, 47, 47, (byte) 5));
                        this.field346.method426(3, this.field346.method424(0, 47, 48, (byte) 5));
                        this.field346.method426(3, this.field346.method424(1, 47, 48, (byte) 5));
                        this.field346.method426(3, this.field346.method424(0, 148, 48, (byte) 5));
                        this.field346.method426(3, this.field346.method424(1, 148, 48, (byte) 5));
                        int var20 = this.field346.method410();
                        while (this.field346.method410() > 0) {
                            int var21 = var20 - this.field346.method410();
                            if (var21 > 0) {
                                this.method206(9, 75, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method97(false);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field346.method419(0, field275);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field346.method422(0, var23);
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
                            this.field346.method413(true, var25, 0, var23);
                        }
                    }
                    this.field346.method428(field327, true);
                    if (!field328) {
                        int var26 = this.field346.method419(2, field275);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field346.method423(field260, var27)) {
                                this.field346.method413(true, (byte) 1, 2, var27);
                            }
                        }
                    }
                    this.method206(9, 80, "Unpacking media");
                    this.field172 = new class21(var6, "invback", 0);
                    this.field174 = new class21(var6, "chatback", 0);
                    this.field173 = new class21(var6, "mapback", 0);
                    this.field537 = new class21(var6, "backbase1", 0);
                    this.field538 = new class21(var6, "backbase2", 0);
                    this.field539 = new class21(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field250[var28] = new class21(var6, "sideicons", var28);
                    }
                    this.field199 = new class10(var6, "compass", 0);
                    this.field379 = new class10(var6, "mapedge", 0);
                    this.field379.method220(-229);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field361[var29] = new class21(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field497[var30] = new class10(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field96[var31] = new class10(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field372[var32] = new class10(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field136 = new class10(var6, "mapmarker", 0);
                    this.field137 = new class10(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field340[var33] = new class10(var6, "cross", var33);
                    }
                    this.field507 = new class10(var6, "mapdots", 0);
                    this.field508 = new class10(var6, "mapdots", 1);
                    this.field509 = new class10(var6, "mapdots", 2);
                    this.field510 = new class10(var6, "mapdots", 3);
                    this.field511 = new class10(var6, "mapdots", 4);
                    this.field541 = new class21(var6, "scrollbar", 0);
                    this.field542 = new class21(var6, "scrollbar", 1);
                    this.field402 = new class21(var6, "redstone1", 0);
                    this.field403 = new class21(var6, "redstone2", 0);
                    this.field404 = new class21(var6, "redstone3", 0);
                    this.field405 = new class21(var6, "redstone1", 0);
                    this.field405.method272(field549);
                    this.field406 = new class21(var6, "redstone2", 0);
                    this.field406.method272(field549);
                    this.field408 = new class21(var6, "redstone1", 0);
                    this.field408.method273(field249);
                    this.field409 = new class21(var6, "redstone2", 0);
                    this.field409.method273(field249);
                    this.field410 = new class21(var6, "redstone3", 0);
                    this.field410.method273(field249);
                    this.field411 = new class21(var6, "redstone1", 0);
                    this.field411.method272(field549);
                    this.field411.method273(field249);
                    this.field412 = new class21(var6, "redstone2", 0);
                    this.field412.method272(field549);
                    this.field412.method273(field249);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field323[var34] = new class21(var6, "mod_icons", var34);
                    }
                    class10 var35 = new class10(var6, "backleft1", 0);
                    this.field212 = new class17(this.method149(true), -4368, var35.field574, var35.field573);
                    var35.method221((byte) 3, 0, 0);
                    class10 var36 = new class10(var6, "backleft2", 0);
                    this.field213 = new class17(this.method149(true), -4368, var36.field574, var36.field573);
                    var36.method221((byte) 3, 0, 0);
                    class10 var37 = new class10(var6, "backright1", 0);
                    this.field214 = new class17(this.method149(true), -4368, var37.field574, var37.field573);
                    var37.method221((byte) 3, 0, 0);
                    class10 var38 = new class10(var6, "backright2", 0);
                    this.field215 = new class17(this.method149(true), -4368, var38.field574, var38.field573);
                    var38.method221((byte) 3, 0, 0);
                    class10 var39 = new class10(var6, "backtop1", 0);
                    this.field216 = new class17(this.method149(true), -4368, var39.field574, var39.field573);
                    var39.method221((byte) 3, 0, 0);
                    class10 var40 = new class10(var6, "backvmid1", 0);
                    this.field217 = new class17(this.method149(true), -4368, var40.field574, var40.field573);
                    var40.method221((byte) 3, 0, 0);
                    class10 var41 = new class10(var6, "backvmid2", 0);
                    this.field218 = new class17(this.method149(true), -4368, var41.field574, var41.field573);
                    var41.method221((byte) 3, 0, 0);
                    class10 var42 = new class10(var6, "backvmid3", 0);
                    this.field219 = new class17(this.method149(true), -4368, var42.field574, var42.field573);
                    var42.method221((byte) 3, 0, 0);
                    class10 var43 = new class10(var6, "backhmid2", 0);
                    this.field220 = new class17(this.method149(true), -4368, var43.field574, var43.field573);
                    var43.method221((byte) 3, 0, 0);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field497[var48] != null) {
                            this.field497[var48].method219(var46 + var47, var44 + var47, field252, var45 + var47);
                        }
                        if (this.field361[var48] != null) {
                            this.field361[var48].method274(var46 + var47, var44 + var47, field252, var45 + var47);
                        }
                    }
                    this.method206(9, 83, "Unpacking textures");
                    class59.method552(var7, false);
                    class59.method556(0.8D, (byte) 1);
                    class59.method551(-41007, 20);
                    this.method206(9, 86, "Unpacking config");
                    class32.method321(var4, 236);
                    class54.method485(var4);
                    class70.method583(var4, 236);
                    class34.method334(var4);
                    class47.method448(var4);
                    class51.method463(var4, 236);
                    class4.method9(var4, 236);
                    class49.method457(var4, 236);
                    class13.method232(var4, 236);
                    class34.field906 = field327;
                    if (!field328) {
                        this.method206(9, 90, "Unpacking sounds");
                        byte[] var49 = var9.method570("sounds.dat", (byte[]) null);
                        class8 var50 = new class8(var49, 792);
                        class63.method571(var50, 236);
                    }
                    this.method206(9, 95, "Unpacking interfaces");
                    class22[] var51 = new class22[] { this.field270, this.field271, this.field272, this.field273 };
                    class48.method452(5, var6, var5, var51);
                    this.method206(9, 100, "Preparing game engine");
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field173.field703[this.field173.field705 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field314[var52] = var53;
                        this.field390[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field173.field703[this.field173.field705 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
                                if (var57 == 999) {
                                    var57 = var59;
                                }
                            } else if (var57 != 999) {
                                var58 = var59;
                                break;
                            }
                        }
                        this.field209[var56 - 5] = var57 - 25;
                        this.field138[var56 - 5] = var58 - var57;
                    }
                    class59.method549(true, 96, 479);
                    this.field422 = class59.field1509;
                    class59.method549(true, 261, 190);
                    this.field423 = class59.field1509;
                    class59.method549(true, 334, 512);
                    this.field424 = class59.field1509;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = class59.field1507[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    class57.method532(var60, 500, 512, 334, 636, 800);
                    class43.method372(var8);
                    this.field243 = new class19(this, -13743);
                    this.method129(this.field243, 10);
                    class41.field1069 = this;
                    class54.field1383 = this;
                    class47.field1196 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field269 + " " + this.field194);
                    this.field241 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method179(boolean arg0) {
        this.field477.method19(31, 687);
        if (arg0) {
            if (this.field388 != -1) {
                this.field388 = -1;
                this.field91 = true;
                this.field434 = false;
                this.field430 = true;
            }
            if (this.field522 != -1) {
                this.field522 = -1;
                this.field226 = true;
                this.field434 = false;
            }
            if (this.field301 != -1) {
                this.field301 = -1;
                this.field208 = true;
            }
            this.field481 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method180(byte arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field499[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field499[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field500[var14] = (this.field499[var14 - 1] + this.field499[var14 + 1] + this.field499[var14 - 128] + this.field499[var14 + 128]) / 4;
            }
        }
        this.field561 += 128;
        if (this.field561 > this.field210.length) {
            this.field561 -= this.field210.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method86(0, this.field480[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field500[var11 + 128] - this.field210[this.field561 + var11 & this.field210.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field499[var11] = var12;
            }
        }
        if (arg0 != 114) {
            field549 = -134;
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field437[var8] = this.field437[var8 + 1];
        }
        this.field437[var2 - 1] = (int) (Math.sin((double) field183 / 14.0D) * 16.0D + Math.sin((double) field183 / 15.0D) * 14.0D + Math.sin((double) field183 / 16.0D) * 12.0D);
        if (this.field245 > 0) {
            this.field245 -= 4;
        }
        if (this.field246 > 0) {
            this.field246 -= 4;
        }
        if (this.field245 == 0 && this.field246 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field245 = 1024;
            }
            if (var9 == 1) {
                this.field246 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)V")
    public final void method181(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.field400 = 172;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field102[var5] != null) {
                int var6 = this.field100[var5];
                int var7 = 70 - var4 * 14 + this.field439 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field101[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field438 == 0 || this.field438 == 1 && this.method158(this.field366, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(field157.field733)) {
                        if (this.field344 >= 1) {
                            this.field431[this.field278] = "Report abuse @whi@" + var8;
                            this.field474[this.field278] = 853;
                            ++this.field278;
                        }
                        this.field431[this.field278] = "Add ignore @whi@" + var8;
                        this.field474[this.field278] = 992;
                        ++this.field278;
                        this.field431[this.field278] = "Add friend @whi@" + var8;
                        this.field474[this.field278] = 50;
                        ++this.field278;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field342 == 0 && (var6 == 7 || this.field175 == 0 || this.field175 == 1 && this.method158(this.field366, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        if (this.field344 >= 1) {
                            this.field431[this.field278] = "Report abuse @whi@" + var8;
                            this.field474[this.field278] = 853;
                            ++this.field278;
                        }
                        this.field431[this.field278] = "Add ignore @whi@" + var8;
                        this.field474[this.field278] = 992;
                        ++this.field278;
                        this.field431[this.field278] = "Add friend @whi@" + var8;
                        this.field474[this.field278] = 50;
                        ++this.field278;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field155 == 0 || this.field155 == 1 && this.method158(this.field366, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field431[this.field278] = "Accept trade @whi@" + var8;
                        this.field474[this.field278] = 917;
                        ++this.field278;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field342 == 0 && this.field175 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field155 == 0 || this.field155 == 1 && this.method158(this.field366, var8))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field431[this.field278] = "Accept challenge @whi@" + var8;
                        this.field474[this.field278] = 235;
                        ++this.field278;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method182(int arg0) {
        int var2 = 42 / arg0;
        if (this.field279 == 0 && this.field264 == 0) {
            this.field431[this.field278] = "Walk here";
            this.field474[this.field278] = 189;
            this.field472[this.field278] = super.field1630;
            this.field473[this.field278] = super.field1631;
            ++this.field278;
        }
        int var3 = -1;
        for (int var4 = 0; var4 < class37.field1028; ++var4) {
            int var5 = class37.field1029[var4];
            int var6 = var5 & 127;
            int var7 = var5 >> 7 & 127;
            int var8 = var5 >> 29 & 3;
            int var9 = var5 >> 14 & 32767;
            if (var3 != var5) {
                var3 = var5;
                if (var8 == 2 && this.field159.method526(this.field302, var6, var7, var5) >= 0) {
                    class54 var10 = class54.method486(var9);
                    if (var10.field1340 != null) {
                        var10 = var10.method487((byte) 35);
                    }
                    if (var10 == null) {
                        continue;
                    }
                    if (this.field279 == 1) {
                        this.field431[this.field278] = "Use " + this.field283 + " with @cya@" + var10.field1377;
                        this.field474[this.field278] = 28;
                        this.field475[this.field278] = var5;
                        this.field472[this.field278] = var6;
                        this.field473[this.field278] = var7;
                        ++this.field278;
                    } else if (this.field264 == 1) {
                        if ((this.field266 & 4) == 4) {
                            this.field431[this.field278] = this.field267 + " @cya@" + var10.field1377;
                            this.field474[this.field278] = 464;
                            this.field475[this.field278] = var5;
                            this.field472[this.field278] = var6;
                            this.field473[this.field278] = var7;
                            ++this.field278;
                        }
                    } else {
                        if (var10.field1374 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var10.field1374[var11] != null) {
                                    this.field431[this.field278] = var10.field1374[var11] + " @cya@" + var10.field1377;
                                    if (var11 == 0) {
                                        this.field474[this.field278] = 921;
                                    }
                                    if (var11 == 1) {
                                        this.field474[this.field278] = 215;
                                    }
                                    if (var11 == 2) {
                                        this.field474[this.field278] = 860;
                                    }
                                    if (var11 == 3) {
                                        this.field474[this.field278] = 277;
                                    }
                                    if (var11 == 4) {
                                        this.field474[this.field278] = 1485;
                                    }
                                    this.field475[this.field278] = var5;
                                    this.field472[this.field278] = var6;
                                    this.field473[this.field278] = var7;
                                    ++this.field278;
                                }
                            }
                        }
                        this.field431[this.field278] = "Examine @cya@" + var10.field1377;
                        this.field474[this.field278] = 1741;
                        this.field475[this.field278] = var10.field1378 << 14;
                        this.field472[this.field278] = var6;
                        this.field473[this.field278] = var7;
                        ++this.field278;
                    }
                }
                if (var8 == 1) {
                    class1 var12 = this.field354[var9];
                    if (var12.field2.field1190 == 1 && (var12.field1555 & 127) == 64 && (var12.field1556 & 127) == 64) {
                        for (int var13 = 0; var13 < this.field355; ++var13) {
                            class1 var16 = this.field354[this.field356[var13]];
                            if (var16 != null && var12 != var16 && var16.field2.field1190 == 1 && var12.field1555 == var16.field1555 && var12.field1556 == var16.field1556) {
                                this.method83(var16.field2, var6, 318, this.field356[var13], var7);
                            }
                        }
                        for (int var14 = 0; var14 < this.field106; ++var14) {
                            class23 var15 = this.field105[this.field107[var14]];
                            if (var15 != null && var12.field1555 == var15.field1555 && var12.field1556 == var15.field1556) {
                                this.method146(var15, var6, 0, var7, this.field107[var14]);
                            }
                        }
                    }
                    this.method83(var12.field2, var6, 318, var9, var7);
                }
                if (var8 == 0) {
                    class23 var17 = this.field105[var9];
                    if ((var17.field1555 & 127) == 64 && (var17.field1556 & 127) == 64) {
                        for (int var18 = 0; var18 < this.field355; ++var18) {
                            class1 var21 = this.field354[this.field356[var18]];
                            if (var21 != null && var21.field2.field1190 == 1 && var17.field1555 == var21.field1555 && var17.field1556 == var21.field1556) {
                                this.method83(var21.field2, var6, 318, this.field356[var18], var7);
                            }
                        }
                        for (int var19 = 0; var19 < this.field106; ++var19) {
                            class23 var20 = this.field105[this.field107[var19]];
                            if (var20 != null && var17 != var20 && var17.field1555 == var20.field1555 && var17.field1556 == var20.field1556) {
                                this.method146(var20, var6, 0, var7, this.field107[var19]);
                            }
                        }
                    }
                    this.method146(var17, var6, 0, var7, var9);
                }
                if (var8 == 3) {
                    class9 var22 = this.field111[this.field302][var6][var7];
                    if (var22 != null) {
                        for (class11 var23 = (class11) var22.method72((byte) 0); var23 != null; var23 = (class11) var22.method74(-529)) {
                            class34 var24 = class34.method329(var23.field579);
                            if (this.field279 == 1) {
                                this.field431[this.field278] = "Use " + this.field283 + " with @lre@" + var24.field904;
                                this.field474[this.field278] = 343;
                                this.field475[this.field278] = var23.field579;
                                this.field472[this.field278] = var6;
                                this.field473[this.field278] = var7;
                                ++this.field278;
                            } else if (this.field264 == 1) {
                                if ((this.field266 & 1) == 1) {
                                    this.field431[this.field278] = this.field267 + " @lre@" + var24.field904;
                                    this.field474[this.field278] = 4;
                                    this.field475[this.field278] = var23.field579;
                                    this.field472[this.field278] = var6;
                                    this.field473[this.field278] = var7;
                                    ++this.field278;
                                }
                            } else {
                                for (int var25 = 4; var25 >= 0; --var25) {
                                    if (var24.field903 != null && var24.field903[var25] != null) {
                                        this.field431[this.field278] = var24.field903[var25] + " @lre@" + var24.field904;
                                        if (var25 == 0) {
                                            this.field474[this.field278] = 279;
                                        }
                                        if (var25 == 1) {
                                            this.field474[this.field278] = 604;
                                        }
                                        if (var25 == 2) {
                                            this.field474[this.field278] = 248;
                                        }
                                        if (var25 == 3) {
                                            this.field474[this.field278] = 63;
                                        }
                                        if (var25 == 4) {
                                            this.field474[this.field278] = 401;
                                        }
                                        this.field475[this.field278] = var23.field579;
                                        this.field472[this.field278] = var6;
                                        this.field473[this.field278] = var7;
                                        ++this.field278;
                                    } else if (var25 == 2) {
                                        this.field431[this.field278] = "Take @lre@" + var24.field904;
                                        this.field474[this.field278] = 248;
                                        this.field475[this.field278] = var23.field579;
                                        this.field472[this.field278] = var6;
                                        this.field473[this.field278] = var7;
                                        ++this.field278;
                                    }
                                }
                                this.field431[this.field278] = "Examine @lre@" + var24.field904;
                                this.field474[this.field278] = 1491;
                                this.field475[this.field278] = var23.field579;
                                this.field472[this.field278] = var6;
                                this.field473[this.field278] = var7;
                                ++this.field278;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLCFARFRSG;I)V")
    private final void method183(boolean arg0, class8 arg1, int arg2) {
        this.field501 &= arg0;
        for (int var4 = 0; var4 < this.field108; ++var4) {
            int var5 = this.field109[var4];
            class1 var6 = this.field354[var5];
            int var7 = arg1.method30();
            if ((var7 & 8) != 0) {
                int var8 = arg1.method59(this.field548);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = arg1.method50((byte) 70);
                if (var6.field1571 == var8 && var8 != -1) {
                    int var10 = class32.field816[var8].field830;
                    if (var10 == 1) {
                        var6.field1572 = 0;
                        var6.field1573 = 0;
                        var6.field1574 = var9;
                        var6.field1575 = 0;
                    }
                    if (var10 == 2) {
                        var6.field1575 = 0;
                    }
                } else if (var8 == -1 || var6.field1571 == -1 || class32.field816[var8].field824 >= class32.field816[var6.field1571].field824) {
                    var6.field1571 = var8;
                    var6.field1572 = 0;
                    var6.field1573 = 0;
                    var6.field1574 = var9;
                    var6.field1575 = 0;
                    var6.field1560 = var6.field1550;
                }
            }
            if ((var7 & 32) != 0) {
                int var11 = arg1.method50((byte) 70);
                int var12 = arg1.method51(11818);
                var6.method568(var11, var12, field183, 491);
                var6.field1568 = field183 + 300;
                var6.field1569 = arg1.method49(887);
                var6.field1570 = arg1.method51(11818);
            }
            if ((var7 & 1) != 0) {
                var6.field2 = class47.method444(arg1.method59(this.field548));
                var6.field1565 = var6.field2.field1190;
                var6.field1526 = var6.field2.field1206;
                var6.field1538 = var6.field2.field1186;
                var6.field1539 = var6.field2.field1212;
                var6.field1540 = var6.field2.field1182;
                var6.field1541 = var6.field2.field1194;
                var6.field1566 = var6.field2.field1197;
            }
            if ((var7 & 16) != 0) {
                var6.field1576 = arg1.method32();
                if (var6.field1576 == 65535) {
                    var6.field1576 = -1;
                }
            }
            if ((var7 & 2) != 0) {
                var6.field1564 = arg1.method37();
                var6.field1558 = 100;
            }
            if ((var7 & 64) != 0) {
                var6.field1533 = arg1.method58(405);
                var6.field1534 = arg1.method32();
            }
            if ((var7 & 4) != 0) {
                var6.field1527 = arg1.method32();
                int var13 = arg1.method65(this.field357);
                var6.field1531 = var13 >> 16;
                var6.field1530 = (var13 & 65535) + field183;
                var6.field1528 = 0;
                var6.field1529 = 0;
                if (var6.field1530 > field183) {
                    var6.field1528 = -1;
                }
                if (var6.field1527 == 65535) {
                    var6.field1527 = -1;
                }
            }
            if ((var7 & 128) != 0) {
                int var14 = arg1.method49(887);
                int var15 = arg1.method50((byte) 70);
                var6.method568(var14, var15, field183, 491);
                var6.field1568 = field183 + 300;
                var6.field1569 = arg1.method30();
                var6.field1570 = arg1.method30();
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(IILCFARFRSG;)V")
    private final void method184(int arg0, int arg1, class8 arg2) {
        int var4 = arg2.method41(881, 8);
        if (var4 < this.field106) {
            for (int var5 = var4; var5 < this.field106; ++var5) {
                this.field181[this.field180++] = this.field107[var5];
            }
        }
        if (var4 > this.field106) {
            signlink.reporterror(this.field460 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field106 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field107[var6];
                class23 var8 = this.field105[var7];
                int var9 = arg2.method41(881, 1);
                if (var9 == 0) {
                    this.field107[this.field106++] = var7;
                    var8.field1537 = field183;
                } else {
                    int var10 = arg2.method41(881, 2);
                    if (var10 == 0) {
                        this.field107[this.field106++] = var7;
                        var8.field1537 = field183;
                        this.field109[this.field108++] = var7;
                    } else if (var10 == 1) {
                        this.field107[this.field106++] = var7;
                        var8.field1537 = field183;
                        int var11 = arg2.method41(881, 3);
                        var8.method566(var11, (byte) -62, false);
                        int var12 = arg2.method41(881, 1);
                        if (var12 == 1) {
                            this.field109[this.field108++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field107[this.field106++] = var7;
                        var8.field1537 = field183;
                        int var13 = arg2.method41(881, 3);
                        var8.method566(var13, (byte) -62, true);
                        int var14 = arg2.method41(881, 3);
                        var8.method566(var14, (byte) -62, true);
                        int var15 = arg2.method41(881, 1);
                        if (var15 == 1) {
                            this.field109[this.field108++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field181[this.field180++] = var7;
                    }
                }
            }
            if (arg0 <= 0) {
                this.field530 = this.field470.method475();
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method185(byte arg0) {
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            this.field231 = this.field432.method30();
        }
        if (this.field429 == 2) {
            this.method106(0, (this.field334 - this.field453 << 7) + this.field337, this.field336 * 2, (this.field335 - this.field454 << 7) + this.field338);
            if (this.field419 > -1 && field183 % 20 < 10) {
                this.field372[2].method223(this.field419 - 12, this.field420 - 28, 9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method186(boolean arg0) {
        if (this.field310 == null) {
            this.method85((byte) 4);
            super.field1623 = null;
            this.field112 = null;
            this.field113 = null;
            this.field114 = null;
            this.field115 = null;
            this.field116 = null;
            this.field117 = null;
            this.field118 = null;
            if (arg0) {
                this.field400 = 129;
            }
            this.field119 = null;
            this.field120 = null;
            this.field310 = new class17(this.method149(true), -4368, 96, 479);
            this.field308 = new class17(this.method149(true), -4368, 156, 172);
            class46.method434(-327);
            this.field173.method275(0, 0, 9);
            this.field307 = new class17(this.method149(true), -4368, 261, 190);
            this.field309 = new class17(this.method149(true), -4368, 334, 512);
            class46.method434(-327);
            this.field195 = new class17(this.method149(true), -4368, 50, 496);
            this.field196 = new class17(this.method149(true), -4368, 37, 269);
            this.field197 = new class17(this.method149(true), -4368, 45, 249);
            this.field208 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)I")
    public final int method187(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg1;
        if (arg2 != 47773) {
            this.method178();
        }
        return ((arg0 & 16711935) * arg1 + (arg3 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg1 + (arg3 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)Ljava/lang/String;")
    private static final String method188(int arg0, byte arg1) {
        String var2 = String.valueOf(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (field185 != arg1) {
            field378 = !field378;
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(III)Ljava/lang/String;")
    public static final String method189(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            throw new NullPointerException();
        } else {
            int var3 = arg1 - arg0;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIZII)V")
    public final void method190(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = this.field159.method522(arg0, arg2, arg5);
        if (arg3) {
            this.field231 = -1;
        }
        if (var7 != 0) {
            int var8 = this.field159.method526(arg0, arg2, arg5, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg1;
            if (var7 > 0) {
                var11 = arg4;
            }
            int[] var12 = this.field150.field572;
            int var13 = (103 - arg5) * 512 * 4 + arg2 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class54 var15 = class54.method486(var14);
            if (var15.field1337 != -1) {
                class21 var16 = this.field361[var15.field1337];
                if (var16 != null) {
                    int var17 = (var15.field1380 * 4 - var16.field705) / 2;
                    int var18 = (var15.field1339 * 4 - var16.field706) / 2;
                    var16.method275(arg2 * 4 + 48 + var17, (104 - arg5 - var15.field1339) * 4 + 48 + var18, 9);
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
        int var19 = this.field159.method524(arg0, arg2, arg5);
        if (var19 != 0) {
            int var20 = this.field159.method526(arg0, arg2, arg5, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class54 var24 = class54.method486(var23);
            if (var24.field1337 != -1) {
                class21 var25 = this.field361[var24.field1337];
                if (var25 != null) {
                    int var26 = (var24.field1380 * 4 - var25.field705) / 2;
                    int var27 = (var24.field1339 * 4 - var25.field706) / 2;
                    var25.method275(arg2 * 4 + 48 + var26, (104 - arg5 - var24.field1339) * 4 + 48 + var27, 9);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field150.field572;
                int var30 = (103 - arg5) * 512 * 4 + arg2 * 4 + 24624;
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
        int var31 = this.field159.method525(arg0, arg2, arg5);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class54 var33 = class54.method486(var32);
            if (var33.field1337 != -1) {
                class21 var34 = this.field361[var33.field1337];
                if (var34 != null) {
                    int var35 = (var33.field1380 * 4 - var34.field705) / 2;
                    int var36 = (var33.field1339 * 4 - var34.field706) / 2;
                    var34.method275(arg2 * 4 + 48 + var35, (104 - arg5 - var33.field1339) * 4 + 48 + var36, 9);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method191(int arg0) {
        this.field310.method264(this.field483);
        class59.field1509 = this.field422;
        this.field174.method275(0, 0, 9);
        if (this.field123) {
            this.field272.method278(40, this.field169, 0, 239, 2);
            this.field272.method278(60, this.field494 + "*", 128, 239, 2);
        } else if (this.field235 == 1) {
            this.field272.method278(40, "Enter amount:", 0, 239, 2);
            this.field272.method278(60, this.field193 + "*", 128, 239, 2);
        } else if (this.field235 == 2) {
            this.field272.method278(40, "Enter name:", 0, 239, 2);
            this.field272.method278(60, this.field193 + "*", 128, 239, 2);
        } else if (this.field227 != null) {
            this.field272.method278(40, this.field227, 0, 239, 2);
            this.field272.method278(60, "Click to continue", 128, 239, 2);
        } else if (this.field522 != -1) {
            this.method126(0, 0, 0, class48.field1221[this.field522], (byte) -125);
        } else if (this.field345 != -1) {
            this.method126(0, 0, 0, class48.field1221[this.field345], (byte) -125);
        } else {
            class22 var2 = this.field271;
            int var3 = 0;
            class46.method433(463, 77, 0, -42775, 0);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field102[var4] != null) {
                    int var7 = this.field100[var4];
                    int var8 = 70 - var3 * 14 + this.field439;
                    String var9 = this.field101[var4];
                    byte var10 = 0;
                    if (var9 != null && var9.startsWith("@cr1@")) {
                        var9 = var9.substring(5);
                        var10 = 1;
                    }
                    if (var9 != null && var9.startsWith("@cr2@")) {
                        var9 = var9.substring(5);
                        var10 = 2;
                    }
                    if (var7 == 0) {
                        if (var8 > 0 && var8 < 110) {
                            var2.method282(this.field102[var4], 4, 0, 619, var8);
                        }
                        ++var3;
                    }
                    if ((var7 == 1 || var7 == 2) && (var7 == 1 || this.field438 == 0 || this.field438 == 1 && this.method158(this.field366, var9))) {
                        if (var8 > 0 && var8 < 110) {
                            int var11 = 4;
                            if (var10 == 1) {
                                this.field323[0].method275(var11, var8 - 12, 9);
                                var11 += 14;
                            }
                            if (var10 == 2) {
                                this.field323[1].method275(var11, var8 - 12, 9);
                                var11 += 14;
                            }
                            var2.method282(var9 + ":", var11, 0, 619, var8);
                            int var12 = var11 + var2.method280(498, var9) + 8;
                            var2.method282(this.field102[var4], var12, 255, 619, var8);
                        }
                        ++var3;
                    }
                    if ((var7 == 3 || var7 == 7) && this.field342 == 0 && (var7 == 7 || this.field175 == 0 || this.field175 == 1 && this.method158(this.field366, var9))) {
                        if (var8 > 0 && var8 < 110) {
                            byte var13 = 4;
                            var2.method282("From", var13, 0, 619, var8);
                            int var14 = var13 + var2.method280(498, "From ");
                            if (var10 == 1) {
                                this.field323[0].method275(var14, var8 - 12, 9);
                                var14 += 14;
                            }
                            if (var10 == 2) {
                                this.field323[1].method275(var14, var8 - 12, 9);
                                var14 += 14;
                            }
                            var2.method282(var9 + ":", var14, 0, 619, var8);
                            int var15 = var14 + var2.method280(498, var9) + 8;
                            var2.method282(this.field102[var4], var15, 8388608, 619, var8);
                        }
                        ++var3;
                    }
                    if (var7 == 4 && (this.field155 == 0 || this.field155 == 1 && this.method158(this.field366, var9))) {
                        if (var8 > 0 && var8 < 110) {
                            var2.method282(var9 + " " + this.field102[var4], 4, 8388736, 619, var8);
                        }
                        ++var3;
                    }
                    if (var7 == 5 && this.field342 == 0 && this.field175 < 2) {
                        if (var8 > 0 && var8 < 110) {
                            var2.method282(this.field102[var4], 4, 8388608, 619, var8);
                        }
                        ++var3;
                    }
                    if (var7 == 6 && this.field342 == 0 && this.field175 < 2) {
                        if (var8 > 0 && var8 < 110) {
                            var2.method282("To " + var9 + ":", 4, 0, 619, var8);
                            var2.method282(this.field102[var4], 12 + var2.method280(498, "To " + var9), 8388608, 619, var8);
                        }
                        ++var3;
                    }
                    if (var7 == 8 && (this.field155 == 0 || this.field155 == 1 && this.method158(this.field366, var9))) {
                        if (var8 > 0 && var8 < 110) {
                            var2.method282(var9 + " " + this.field102[var4], 4, 8270336, 619, var8);
                        }
                        ++var3;
                    }
                }
            }
            class46.method432((byte) 75);
            this.field476 = var3 * 14 + 7;
            if (this.field476 < 78) {
                this.field476 = 78;
            }
            this.method161(0, this.field476, this.field476 - this.field439 - 77, 463, 77, true);
            String var5;
            if (field157 != null && field157.field733 != null) {
                var5 = field157.field733;
            } else {
                var5 = class71.method591(1, this.field460);
            }
            var2.method282(var5 + ":", 4, 0, 619, 90);
            var2.method282(this.field413 + "*", 6 + var2.method280(498, var5 + ": "), 255, 619, 90);
            class46.method439(479, 77, true, 0, 0);
        }
        if (this.field448 && this.field221 == 2) {
            this.method81(-14011);
        }
        this.field310.method265(357, 17, super.field1622, 0);
        this.field309.method264(this.field483);
        class59.field1509 = this.field424;
        if (arg0 != 1) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIZIII)Z")
    public final boolean method192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field528[var15][var35] = 0;
                this.field495[var15][var35] = 99999999;
            }
        }
        int var16 = arg2;
        int var17 = arg10;
        this.field528[arg2][arg10] = 99;
        this.field495[arg2][arg10] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field515[var18] = arg2;
        if (arg11 >= 4 && arg11 <= 4) {
            int var36 = var18 + 1;
            this.field516[var18] = arg10;
            boolean var20 = false;
            int var21 = this.field515.length;
            int[][] var22 = this.field529[this.field302].field797;
            while (var36 != var19) {
                var16 = this.field515[var19];
                var17 = this.field516[var19];
                var19 = (var19 + 1) % var21;
                if (arg0 == var16 && arg5 == var17) {
                    var20 = true;
                    break;
                }
                if (arg4 != 0) {
                    if ((arg4 < 5 || arg4 == 10) && this.field529[this.field302].method309(arg4 - 1, var16, arg3, arg5, arg0, -41150, var17)) {
                        var20 = true;
                        break;
                    }
                    if (arg4 < 10 && this.field529[this.field302].method310(var16, 0, arg0, arg3, var17, arg4 - 1, arg5)) {
                        var20 = true;
                        break;
                    }
                }
                if (arg7 != 0 && arg1 != 0 && this.field529[this.field302].method311(arg5, arg1, 0, arg9, arg7, var17, var16, arg0)) {
                    var20 = true;
                    break;
                }
                int var34 = this.field495[var16][var17] + 1;
                if (var16 > 0 && this.field528[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                    this.field515[var36] = var16 - 1;
                    this.field516[var36] = var17;
                    var36 = (var36 + 1) % var21;
                    this.field528[var16 - 1][var17] = 2;
                    this.field495[var16 - 1][var17] = var34;
                }
                if (var16 < var13 - 1 && this.field528[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                    this.field515[var36] = var16 + 1;
                    this.field516[var36] = var17;
                    var36 = (var36 + 1) % var21;
                    this.field528[var16 + 1][var17] = 8;
                    this.field495[var16 + 1][var17] = var34;
                }
                if (var17 > 0 && this.field528[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                    this.field515[var36] = var16;
                    this.field516[var36] = var17 - 1;
                    var36 = (var36 + 1) % var21;
                    this.field528[var16][var17 - 1] = 1;
                    this.field495[var16][var17 - 1] = var34;
                }
                if (var17 < var14 - 1 && this.field528[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                    this.field515[var36] = var16;
                    this.field516[var36] = var17 + 1;
                    var36 = (var36 + 1) % var21;
                    this.field528[var16][var17 + 1] = 4;
                    this.field495[var16][var17 + 1] = var34;
                }
                if (var16 > 0 && var17 > 0 && this.field528[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                    this.field515[var36] = var16 - 1;
                    this.field516[var36] = var17 - 1;
                    var36 = (var36 + 1) % var21;
                    this.field528[var16 - 1][var17 - 1] = 3;
                    this.field495[var16 - 1][var17 - 1] = var34;
                }
                if (var16 < var13 - 1 && var17 > 0 && this.field528[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                    this.field515[var36] = var16 + 1;
                    this.field516[var36] = var17 - 1;
                    var36 = (var36 + 1) % var21;
                    this.field528[var16 + 1][var17 - 1] = 9;
                    this.field495[var16 + 1][var17 - 1] = var34;
                }
                if (var16 > 0 && var17 < var14 - 1 && this.field528[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                    this.field515[var36] = var16 - 1;
                    this.field516[var36] = var17 + 1;
                    var36 = (var36 + 1) % var21;
                    this.field528[var16 - 1][var17 + 1] = 6;
                    this.field495[var16 - 1][var17 + 1] = var34;
                }
                if (var16 < var13 - 1 && var17 < var14 - 1 && this.field528[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                    this.field515[var36] = var16 + 1;
                    this.field516[var36] = var17 + 1;
                    var36 = (var36 + 1) % var21;
                    this.field528[var16 + 1][var17 + 1] = 12;
                    this.field495[var16 + 1][var17 + 1] = var34;
                }
            }
            this.field421 = 0;
            if (!var20) {
                if (arg8) {
                    int var23 = 100;
                    for (int var24 = 1; var24 < 2; ++var24) {
                        for (int var25 = arg0 - var24; var25 <= arg0 + var24; ++var25) {
                            for (int var26 = arg5 - var24; var26 <= arg5 + var24; ++var26) {
                                if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field495[var25][var26] < var23) {
                                    var23 = this.field495[var25][var26];
                                    var16 = var25;
                                    var17 = var26;
                                    this.field421 = 1;
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
            this.field515[var27] = var16;
            int var37 = var27 + 1;
            this.field516[var27] = var17;
            int var28;
            int var29 = var28 = this.field528[var16][var17];
            while (arg2 != var16 || arg10 != var17) {
                if (var28 != var29) {
                    var28 = var29;
                    this.field515[var37] = var16;
                    this.field516[var37++] = var17;
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
                var29 = this.field528[var16][var17];
            }
            if (var37 <= 0) {
                if (arg6 == 1) {
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
                int var31 = this.field515[var37];
                int var32 = this.field516[var37];
                if (arg6 == 0) {
                    this.field477.method19(48, 687);
                    this.field477.method20(var30 + var30 + 3);
                }
                if (arg6 == 1) {
                    this.field477.method19(72, 687);
                    this.field477.method20(var30 + var30 + 3 + 14);
                }
                if (arg6 == 2) {
                    this.field477.method19(213, 687);
                    this.field477.method20(var30 + var30 + 3);
                }
                this.field148 = this.field515[0];
                this.field149 = this.field516[0];
                for (int var33 = 1; var33 < var30; ++var33) {
                    --var37;
                    this.field477.method20(this.field515[var37] - var31);
                    this.field477.method48(215, this.field516[var37] - var32);
                }
                this.field477.method20(super.field1640[5] == 1 ? 1 : 0);
                this.field477.method54(this.field453 + var31, true);
                this.field477.method56(this.field454 + var32, 599);
                return true;
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method193(int arg0) {
        if (this.field479 > 1) {
            --this.field479;
        }
        if (this.field234 > 0) {
            --this.field234;
        }
        for (int var2 = 0; var2 < 5 && this.method152(0); ++var2) {
        }
        if (this.field501) {
            Object var3 = this.field243.field668;
            synchronized (this.field243.field668) {
                if (!field450) {
                    this.field243.field671 = 0;
                } else if (super.field1636 != 0 || this.field243.field671 >= 40) {
                    this.field477.method19(78, 687);
                    this.field477.method20(0);
                    int var4 = this.field477.field72;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field243.field671 && var4 - this.field477.field72 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field243.field666[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field243.field667[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field243.field666[var6] == -1 && this.field243.field667[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field373 == var8 && this.field374 == var7) {
                            if (this.field203 < 2047) {
                                ++this.field203;
                            }
                        } else {
                            int var10 = var8 - this.field373;
                            this.field373 = var8;
                            int var11 = var7 - this.field374;
                            this.field374 = var7;
                            if (this.field203 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field477.method21((this.field203 << 12) + (var10 << 6) + var11);
                                this.field203 = 0;
                            } else if (this.field203 < 8) {
                                this.field477.method23((this.field203 << 19) + 8388608 + var9);
                                this.field203 = 0;
                            } else {
                                this.field477.method24((this.field203 << 19) + -1073741824 + var9);
                                this.field203 = 0;
                            }
                        }
                    }
                    this.field477.method29(this.field477.field72 - var4, false);
                    if (var5 >= this.field243.field671) {
                        this.field243.field671 = 0;
                    } else {
                        this.field243.field671 -= var5;
                        for (int var12 = 0; var12 < this.field243.field671; ++var12) {
                            this.field243.field667[var12] = this.field243.field667[var5 + var12];
                            this.field243.field666[var12] = this.field243.field666[var5 + var12];
                        }
                    }
                }
            }
            if (super.field1636 != 0) {
                long var13 = (super.field1639 - this.field287) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field287 = super.field1639;
                int var15 = super.field1638;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field1637;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field1636 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field477.method19(97, 687);
                this.field477.method63(-504, (var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field167 > 0) {
                --this.field167;
            }
            if (super.field1640[1] == 1 || super.field1640[2] == 1 || super.field1640[3] == 1 || super.field1640[4] == 1) {
                this.field168 = true;
            }
            if (this.field168 && this.field167 <= 0) {
                this.field167 = 20;
                this.field168 = false;
                this.field477.method19(13, 687);
                this.field477.method54(this.field349, true);
                this.field477.method21(this.field348);
            }
            if (super.field1627 && !this.field239) {
                this.field239 = true;
                this.field477.method19(96, 687);
                this.field477.method20(1);
            }
            if (!super.field1627 && this.field239) {
                this.field239 = false;
                this.field477.method19(96, 687);
                this.field477.method20(0);
            }
            this.method108(699);
            this.method119(-44524);
            this.method145((byte) -17);
            ++this.field232;
            if (this.field232 > 750) {
                this.method88(true);
            }
            this.method115(364);
            this.method168(true);
            this.method143(-87);
            ++field126;
            if (field126 > 1741) {
                field126 = 0;
                this.field477.method19(114, 687);
                this.field477.method20(0);
                int var20 = this.field477.field72;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field477.method20(35);
                }
                this.field477.method20((int) (Math.random() * 256.0D));
                this.field477.method21(35712);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field477.method20(61);
                }
                this.field477.method21(49891);
                this.field477.method21(38132);
                this.field477.method20(66);
                this.field477.method21(64387);
                this.field477.method20(66);
                this.field477.method21(1665);
                this.field477.method29(this.field477.field72 - var20, false);
            }
            ++this.field381;
            if (this.field306 != 0) {
                this.field305 += 20;
                if (this.field305 >= 400) {
                    this.field306 = 0;
                }
            }
            if (this.field506 != 0) {
                ++this.field503;
                if (this.field503 >= 15) {
                    if (this.field506 == 2) {
                        this.field91 = true;
                    }
                    if (this.field506 == 3) {
                        this.field226 = true;
                    }
                    this.field506 = 0;
                }
            }
            if (this.field145 != 0) {
                ++this.field127;
                if (super.field1630 > this.field146 + 5 || super.field1630 < this.field146 - 5 || super.field1631 > this.field147 + 5 || super.field1631 < this.field147 - 5) {
                    this.field445 = true;
                }
                if (super.field1629 == 0) {
                    if (this.field145 == 2) {
                        this.field91 = true;
                    }
                    if (this.field145 == 3) {
                        this.field226 = true;
                    }
                    this.field145 = 0;
                    if (this.field445 && this.field127 >= 5) {
                        this.field459 = -1;
                        this.method134(0);
                        if (this.field459 == this.field143 && this.field458 != this.field144) {
                            class48 var21 = class48.field1221[this.field143];
                            byte var22 = 0;
                            if (this.field124 == 1 && var21.field1258 == 206) {
                                var22 = 1;
                            }
                            if (var21.field1251[this.field458] <= 0) {
                                var22 = 0;
                            }
                            if (var21.field1235) {
                                int var23 = this.field144;
                                int var24 = this.field458;
                                var21.field1251[var24] = var21.field1251[var23];
                                var21.field1275[var24] = var21.field1275[var23];
                                var21.field1251[var23] = -1;
                                var21.field1275[var23] = 0;
                            } else if (var22 == 1) {
                                int var25 = this.field144;
                                int var26 = this.field458;
                                while (var25 != var26) {
                                    if (var25 > var26) {
                                        var21.method456(980, var25, var25 - 1);
                                        --var25;
                                    } else if (var25 < var26) {
                                        var21.method456(980, var25, var25 + 1);
                                        ++var25;
                                    }
                                }
                            } else {
                                var21.method456(980, this.field144, this.field458);
                            }
                            this.field477.method19(175, 687);
                            this.field477.method55(0, this.field458);
                            this.field477.method54(this.field143, true);
                            this.field477.method48(215, var22);
                            this.field477.method55(0, this.field144);
                        }
                    } else if ((this.field322 == 1 || this.method156(this.field278 - 1, true)) && this.field278 > 2) {
                        this.method162(false);
                    } else if (this.field278 > 0) {
                        this.method80((byte) 7, this.field278 - 1);
                    }
                    this.field503 = 10;
                    super.field1636 = 0;
                }
            }
            if (class57.field1458 != -1) {
                int var27 = class57.field1458;
                int var28 = class57.field1459;
                boolean var29 = this.method192(var27, 0, field157.field1535[0], 0, 0, var28, 0, 0, true, 0, field157.field1536[0], this.field154);
                class57.field1458 = -1;
                if (var29) {
                    this.field303 = super.field1637;
                    this.field304 = super.field1638;
                    this.field306 = 1;
                    this.field305 = 0;
                }
            }
            if (super.field1636 == 1 && this.field227 != null) {
                this.field227 = null;
                this.field226 = true;
                super.field1636 = 0;
            }
            this.method196(false);
            this.method160(47759);
            this.method102((byte) 2);
            this.method111(682);
            if (super.field1629 == 1 || super.field1636 == 1) {
                ++this.field540;
            }
            if (this.field311 == 2) {
                this.method98(8);
            }
            if (this.field311 == 2 && this.field288) {
                this.method121(31346);
            }
            for (int var30 = 0; var30 < 5; ++var30) {
                int var10002 = this.field139[var30]++;
            }
            this.method82(this.field176);
            ++super.field1628;
            if (super.field1628 > 4500) {
                this.field234 = 250;
                super.field1628 -= 500;
                this.field477.method19(40, 687);
            }
            ++this.field360;
            if (this.field360 > 500) {
                this.field360 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field544 += this.field545;
                }
                if ((var31 & 2) == 2) {
                    this.field552 += this.field553;
                }
                if ((var31 & 4) == 4) {
                    this.field446 += this.field447;
                }
            }
            if (this.field544 < -50) {
                this.field545 = 2;
            }
            if (this.field544 > 50) {
                this.field545 = -2;
            }
            if (this.field552 < -55) {
                this.field553 = 2;
            }
            if (this.field552 > 55) {
                this.field553 = -2;
            }
            if (this.field446 < -40) {
                this.field447 = 1;
            }
            if (this.field446 > 40) {
                this.field447 = -1;
            }
            ++this.field207;
            if (this.field207 > 500) {
                this.field207 = 0;
                int var32 = (int) (Math.random() * 8.0D);
                if ((var32 & 1) == 1) {
                    this.field332 += this.field333;
                }
                if ((var32 & 2) == 2) {
                    this.field285 += this.field286;
                }
            }
            if (this.field332 < -60) {
                this.field333 = 2;
            }
            if (this.field332 > 60) {
                this.field333 = -2;
            }
            if (this.field285 < -20) {
                this.field286 = 1;
            }
            if (this.field285 > 10) {
                this.field286 = -1;
            }
            ++this.field233;
            if (arg0 == 0) {
                if (this.field233 > 50) {
                    this.field477.method19(241, 687);
                }
                try {
                    if (this.field312 != null && this.field477.field72 > 0) {
                        this.field312.method473(this.field477.field71, 0, this.field477.field72, this.field190);
                        this.field477.field72 = 0;
                        this.field233 = 0;
                    }
                } catch (IOException var34) {
                    this.method88(true);
                } catch (Exception var35) {
                    this.method154(190);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILOPFNUBIN;I)I")
    public final int method194(int arg0, class48 arg1, int arg2) {
        int var4 = 63 / arg2;
        if (arg1.field1219 != null && arg0 < arg1.field1219.length) {
            try {
                int[] var5 = arg1.field1219[arg0];
                int var6 = 0;
                int var7 = 0;
                byte var8 = 0;
                while (true) {
                    int var9 = var5[var7++];
                    int var10 = 0;
                    byte var11 = 0;
                    if (var9 == 0) {
                        return var6;
                    }
                    if (var9 == 1) {
                        var10 = this.field188[var5[var7++]];
                    }
                    if (var9 == 2) {
                        var10 = this.field240[var5[var7++]];
                    }
                    if (var9 == 3) {
                        var10 = this.field547[var5[var7++]];
                    }
                    if (var9 == 4) {
                        class48 var12 = class48.field1221[var5[var7++]];
                        int var13 = var5[var7++];
                        if (var13 >= 0 && var13 < class34.field894 && (!class34.method329(var13).field902 || field327)) {
                            for (int var14 = 0; var14 < var12.field1251.length; ++var14) {
                                if (var13 + 1 == var12.field1251[var14]) {
                                    var10 += var12.field1275[var14];
                                }
                            }
                        }
                    }
                    if (var9 == 5) {
                        var10 = this.field414[var5[var7++]];
                    }
                    if (var9 == 6) {
                        var10 = field129[this.field240[var5[var7++]] - 1];
                    }
                    if (var9 == 7) {
                        var10 = this.field414[var5[var7++]] * 100 / 46875;
                    }
                    if (var9 == 8) {
                        var10 = field157.field726;
                    }
                    if (var9 == 9) {
                        for (int var15 = 0; var15 < class36.field951; ++var15) {
                            if (class36.field953[var15]) {
                                var10 += this.field240[var15];
                            }
                        }
                    }
                    if (var9 == 10) {
                        class48 var16 = class48.field1221[var5[var7++]];
                        int var17 = var5[var7++] + 1;
                        if (var17 >= 0 && var17 < class34.field894 && (!class34.method329(var17).field902 || field327)) {
                            for (int var18 = 0; var18 < var16.field1251.length; ++var18) {
                                if (var16.field1251[var18] == var17) {
                                    var10 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var9 == 11) {
                        var10 = this.field532;
                    }
                    if (var9 == 12) {
                        var10 = this.field313;
                    }
                    if (var9 == 13) {
                        int var19 = this.field414[var5[var7++]];
                        int var20 = var5[var7++];
                        var10 = (var19 & 1 << var20) != 0 ? 1 : 0;
                    }
                    if (var9 == 14) {
                        int var21 = var5[var7++];
                        class13 var22 = class13.field586[var21];
                        int var23 = var22.field588;
                        int var24 = var22.field589;
                        int var25 = var22.field590;
                        int var26 = field534[var25 - var24];
                        var10 = this.field414[var23] >> var24 & var26;
                    }
                    if (var9 == 15) {
                        var11 = 1;
                    }
                    if (var9 == 16) {
                        var11 = 2;
                    }
                    if (var9 == 17) {
                        var11 = 3;
                    }
                    if (var9 == 18) {
                        var10 = (field157.field1555 >> 7) + this.field453;
                    }
                    if (var9 == 19) {
                        var10 = (field157.field1556 >> 7) + this.field454;
                    }
                    if (var9 == 20) {
                        var10 = var5[var7++];
                    }
                    if (var11 == 0) {
                        if (var8 == 0) {
                            var6 += var10;
                        }
                        if (var8 == 1) {
                            var6 -= var10;
                        }
                        if (var8 == 2 && var10 != 0) {
                            var6 /= var10;
                        }
                        if (var8 == 3) {
                            var6 *= var10;
                        }
                        var8 = 0;
                    } else {
                        var8 = var11;
                    }
                }
            } catch (Exception var27) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1625 != null) {
                    return new URL("http://127.0.0.1:" + (field326 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IIII)Z")
    public final boolean method195(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 14 & 32767;
        int var6 = this.field159.method526(this.field302, arg2, arg1, arg3);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method192(arg2, 0, field157.field1535[0], var8, var7 + 1, arg1, 2, 0, false, 0, field157.field1536[0], this.field154);
            } else {
                class54 var9 = class54.method486(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1339;
                    var11 = var9.field1380;
                } else {
                    var10 = var9.field1380;
                    var11 = var9.field1339;
                }
                int var12 = var9.field1373;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method192(arg2, var11, field157.field1535[0], 0, 0, arg1, 2, var10, false, var12, field157.field1536[0], this.field154);
            }
            this.field303 = super.field1637;
            if (arg0 <= 0) {
                throw new NullPointerException();
            } else {
                this.field304 = super.field1638;
                this.field306 = 2;
                this.field305 = 0;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method196(boolean arg0) {
        if (this.field145 == 0) {
            int var2 = super.field1636;
            if (arg0) {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            if (this.field264 == 1 && super.field1637 >= 516 && super.field1638 >= 160 && super.field1637 <= 765 && super.field1638 <= 205) {
                var2 = 0;
            }
            if (this.field448) {
                if (var2 != 1) {
                    int var4 = super.field1630;
                    int var5 = super.field1631;
                    if (this.field221 == 0) {
                        var4 -= 4;
                        var5 -= 4;
                    }
                    if (this.field221 == 1) {
                        var4 -= 553;
                        var5 -= 205;
                    }
                    if (this.field221 == 2) {
                        var4 -= 17;
                        var5 -= 357;
                    }
                    if (var4 < this.field222 - 10 || var4 > this.field224 + this.field222 + 10 || var5 < this.field223 - 10 || var5 > this.field225 + this.field223 + 10) {
                        this.field448 = false;
                        if (this.field221 == 1) {
                            this.field91 = true;
                        }
                        if (this.field221 == 2) {
                            this.field226 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var6 = this.field222;
                    int var7 = this.field223;
                    int var8 = this.field224;
                    int var9 = super.field1637;
                    int var10 = super.field1638;
                    if (this.field221 == 0) {
                        var9 -= 4;
                        var10 -= 4;
                    }
                    if (this.field221 == 1) {
                        var9 -= 553;
                        var10 -= 205;
                    }
                    if (this.field221 == 2) {
                        var9 -= 17;
                        var10 -= 357;
                    }
                    int var11 = -1;
                    for (int var12 = 0; var12 < this.field278; ++var12) {
                        int var13 = (this.field278 - 1 - var12) * 15 + var7 + 31;
                        if (var9 > var6 && var9 < var6 + var8 && var10 > var13 - 13 && var10 < var13 + 3) {
                            var11 = var12;
                        }
                    }
                    if (var11 != -1) {
                        this.method80((byte) 7, var11);
                    }
                    this.field448 = false;
                    if (this.field221 == 1) {
                        this.field91 = true;
                    }
                    if (this.field221 == 2) {
                        this.field226 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field278 > 0) {
                    int var14 = this.field474[this.field278 - 1];
                    if (var14 == 607 || var14 == 48 || var14 == 615 || var14 == 500 || var14 == 534 || var14 == 766 || var14 == 406 || var14 == 263 || var14 == 471 || var14 == 694 || var14 == 34 || var14 == 1881) {
                        int var15 = this.field472[this.field278 - 1];
                        int var16 = this.field473[this.field278 - 1];
                        class48 var17 = class48.field1221[var16];
                        if (var17.field1250 || var17.field1235) {
                            this.field445 = false;
                            this.field127 = 0;
                            this.field143 = var16;
                            this.field144 = var15;
                            this.field145 = 2;
                            this.field146 = super.field1637;
                            this.field147 = super.field1638;
                            if (class48.field1221[var16].field1229 == this.field481) {
                                this.field145 = 1;
                            }
                            if (class48.field1221[var16].field1229 == this.field522) {
                                this.field145 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field322 == 1 || this.method156(this.field278 - 1, true)) && this.field278 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field278 > 0) {
                    this.method80((byte) 7, this.field278 - 1);
                }
                if (var2 != 2 || this.field278 <= 0) {
                    return;
                }
                this.method162(false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(IIII)I")
    public final int method197(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 >> 7;
        int var6 = arg2 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg1;
            if (arg1 < 3 && (this.field368[1][var5][var6] & 2) == 2) {
                var7 = arg1 + 1;
            }
            int var8 = arg0 & 127;
            int var9 = arg2 & 127;
            if (arg3 >= 0) {
                return 3;
            } else {
                int var10 = (128 - var8) * this.field427[var7][var5][var6] + this.field427[var7][var5 + 1][var6] * var8 >> 7;
                int var11 = (128 - var8) * this.field427[var7][var5][var6 + 1] + this.field427[var7][var5 + 1][var6 + 1] * var8 >> 7;
                return (128 - var9) * var10 + var9 * var11 >> 7;
            }
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I[BI)Z")
    public final boolean method198(int arg0, byte[] arg1, int arg2) {
        if (arg0 != 0) {
            this.field231 = this.field432.method30();
        }
        return arg1 == null ? true : signlink.wavesave(arg1, arg2);
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method199(int arg0) {
        class6 var2 = (class6) this.field133.method71();
        if (this.field191 != arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        while (var2 != null) {
            if (this.field302 == var2.field32 && !var2.field38) {
                if (field183 >= var2.field40) {
                    var2.method12(false, this.field381);
                    if (var2.field38) {
                        var2.method582();
                    } else {
                        this.field159.method507((byte) -13, var2, 0, false, var2.field33, var2.field32, 60, var2.field34, -1, var2.field35);
                    }
                }
            } else {
                var2.method582();
            }
            var2 = (class6) this.field133.method73(67);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JI)V")
    public final void method200(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field376 >= 100 && this.field251 != 1) {
                this.method120("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 2, 0);
            } else if (this.field376 >= 200) {
                this.method120("Your friendlist is full. Max of 100 for free users, and 200 for members", "", 2, 0);
            } else {
                String var4 = class71.method591(1, class71.method588(arg0, (byte) -66));
                for (int var5 = 0; var5 < this.field376; ++var5) {
                    if (this.field331[var5] == arg0) {
                        this.method120(var4 + " is already on your friend list", "", 2, 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field382; ++var6) {
                    if (this.field318[var6] == arg0) {
                        this.method120("Please remove " + var4 + " from your ignore list first", "", 2, 0);
                        return;
                    }
                }
                if (!var4.equals(field157.field733)) {
                    this.field131[this.field376] = var4;
                    this.field331[this.field376] = arg0;
                    this.field204[this.field376] = 0;
                    ++this.field376;
                    this.field91 = true;
                    this.field477.method19(118, 687);
                    this.field477.method26((byte) 9, arg0);
                    if (arg1 <= 0) {
                        this.field242 = this.field470.method475();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)Ljava/lang/String;")
    private static final String method201(int arg0, int arg1) {
        if (arg1 != 7) {
            field192 = !field192;
        }
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method202(int arg0, int arg1) {
        int var3 = class49.field1285[arg0].field1293;
        if (arg1 != 0) {
            this.field191 = -59;
        }
        if (var3 != 0) {
            int var4 = this.field414[arg0];
            if (var3 == 1) {
                if (var4 == 1) {
                    class59.method556(0.9D, (byte) 1);
                }
                if (var4 == 2) {
                    class59.method556(0.8D, (byte) 1);
                }
                if (var4 == 3) {
                    class59.method556(0.7D, (byte) 1);
                }
                if (var4 == 4) {
                    class59.method556(0.6D, (byte) 1);
                }
                class34.field917.method371();
                this.field208 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field347;
                if (var4 == 0) {
                    this.method84(this.field347, 0, 0);
                    this.field347 = true;
                }
                if (var4 == 1) {
                    this.method84(this.field347, 0, -400);
                    this.field347 = true;
                }
                if (var4 == 2) {
                    this.method84(this.field347, 0, -800);
                    this.field347 = true;
                }
                if (var4 == 3) {
                    this.method84(this.field347, 0, -1200);
                    this.field347 = true;
                }
                if (var4 == 4) {
                    this.field347 = false;
                }
                if (this.field347 != var5 && !field328) {
                    if (this.field347) {
                        this.field295 = this.field135;
                        this.field296 = true;
                        this.field346.method426(2, this.field295);
                    } else {
                        this.method78((byte) 81);
                    }
                    this.field399 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field319 = true;
                    this.method208(0, 12065);
                }
                if (var4 == 1) {
                    this.field319 = true;
                    this.method208(-400, 12065);
                }
                if (var4 == 2) {
                    this.field319 = true;
                    this.method208(-800, 12065);
                }
                if (var4 == 3) {
                    this.field319 = true;
                    this.method208(-1200, 12065);
                }
                if (var4 == 4) {
                    this.field319 = false;
                }
            }
            if (var3 == 5) {
                this.field322 = var4;
            }
            if (var3 == 6) {
                this.field297 = var4;
            }
            if (var3 == 8) {
                this.field342 = var4;
                this.field226 = true;
            }
            if (var3 == 9) {
                this.field124 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method203(byte arg0) {
        class54.field1362.method371();
        class54.field1352.method371();
        class47.field1209.method371();
        class34.field915.method371();
        class34.field917.method371();
        if (arg0 != 56) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        class23.field750.method371();
        class4.field27.method371();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LOPFNUBIN;I)Z")
    public final boolean method204(class48 arg0, int arg1) {
        int var3 = 33 / arg1;
        if (arg0.field1220 == null) {
            return false;
        } else {
            for (int var4 = 0; var4 < arg0.field1220.length; ++var4) {
                int var5 = this.method194(var4, arg0, 353);
                int var6 = arg0.field1276[var4];
                if (arg0.field1220[var4] == 2) {
                    if (var5 >= var6) {
                        return false;
                    }
                } else if (arg0.field1220[var4] == 3) {
                    if (var5 <= var6) {
                        return false;
                    }
                } else if (arg0.field1220[var4] == 4) {
                    if (var5 == var6) {
                        return false;
                    }
                } else if (var5 != var6) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method205(int arg0) {
        short var2 = 256;
        if (this.field245 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field245 > 768) {
                    this.field517[var3] = this.method187(this.field519[var3], 1024 - this.field245, this.field555, this.field518[var3]);
                } else if (this.field245 > 256) {
                    this.field517[var3] = this.field519[var3];
                } else {
                    this.field517[var3] = this.method187(this.field518[var3], 256 - this.field245, this.field555, this.field519[var3]);
                }
            }
        } else if (this.field246 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field246 > 768) {
                    this.field517[var4] = this.method187(this.field520[var4], 1024 - this.field246, this.field555, this.field518[var4]);
                } else if (this.field246 > 256) {
                    this.field517[var4] = this.field520[var4];
                } else {
                    this.field517[var4] = this.method187(this.field518[var4], 256 - this.field246, this.field555, this.field520[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field517[var5] = this.field518[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field115.field656[var6] = this.field261.field572[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field437[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field499[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field517[var26];
                    int var30 = this.field115.field656[var8];
                    this.field115.field656[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field115.method265(0, 0, super.field1622, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field116.field656[var10] = this.field262.field572[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field437[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field499[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field517[var18];
                    int var22 = this.field116.field656[var16];
                    this.field116.field656[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field116.method265(0, 637, super.field1622, 0);
        if (arg0 != 7) {
            this.field190 = -487;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;)V")
    public final void method206(int arg0, int arg1, String arg2) {
        this.field194 = arg1;
        this.field269 = arg2;
        this.method112(5);
        if (this.field560 == null) {
            super.method206(9, arg1, arg2);
        } else {
            this.field114.method264(this.field483);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field272.method278(var5 / 2 - 26 - var6, "RuneScape is loading - please wait...", 16777215, var4 / 2, 2);
            if (arg0 == 9) {
                int var7 = var5 / 2 - 18 - var6;
                class46.method437(7, 34, var7, var4 / 2 - 152, 9179409, 304);
                class46.method437(7, 32, var7 + 1, var4 / 2 - 151, 0, 302);
                class46.method436(var4 / 2 - 150, var7 + 2, 2, 9179409, arg1 * 3, 30);
                class46.method436(arg1 * 3 + (var4 / 2 - 150), var7 + 2, 2, 0, 300 - arg1 * 3, 30);
                this.field272.method278(var5 / 2 + 5 - var6, arg2, 16777215, var4 / 2, 2);
                this.field114.method265(171, 202, super.field1622, 0);
                if (this.field208) {
                    this.field208 = false;
                    if (!this.field291) {
                        this.field115.method265(0, 0, super.field1622, 0);
                        this.field116.method265(0, 637, super.field1622, 0);
                    }
                    this.field112.method265(0, 128, super.field1622, 0);
                    this.field113.method265(371, 202, super.field1622, 0);
                    this.field117.method265(265, 0, super.field1622, 0);
                    this.field118.method265(265, 562, super.field1622, 0);
                    this.field119.method265(171, 128, super.field1622, 0);
                    this.field120.method265(171, 562, super.field1622, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method207(int arg0) {
        ++this.field451;
        this.method157(true, 0);
        this.method107(true, true);
        this.method157(false, 0);
        this.method107(false, true);
        this.method141(508);
        if (this.field530 != arg0) {
            this.field231 = this.field432.method30();
        }
        this.method199(0);
        if (!this.field288) {
            int var2 = this.field348;
            if (this.field320 / 256 > var2) {
                var2 = this.field320 / 256;
            }
            if (this.field367[4] && this.field263[4] + 128 > var2) {
                var2 = this.field263[4] + 128;
            }
            int var3 = this.field446 + this.field349 & 2047;
            this.method139(this.field166, this.method197(field157.field1555, this.field302, field157.field1556, -235) - 50, var2, var2 * 3 + 600, var3, 26554, this.field165);
            ++field140;
            if (field140 > 158) {
                field140 = 0;
                this.field477.method19(23, 687);
                this.field477.method23(2661924);
            }
        }
        int var4;
        if (!this.field288) {
            var4 = this.method94(26935);
        } else {
            var4 = this.method95(651);
        }
        int var5 = this.field440;
        int var6 = this.field441;
        int var7 = this.field442;
        int var8 = this.field443;
        int var9 = this.field444;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field367[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field171[var10] * 2 + 1) - (double) this.field171[var10] + Math.sin((double) this.field339[var10] / 100.0D * (double) this.field139[var10]) * (double) this.field263[var10]);
                if (var10 == 0) {
                    this.field440 += var12;
                }
                if (var10 == 1) {
                    this.field441 += var12;
                }
                if (var10 == 2) {
                    this.field442 += var12;
                }
                if (var10 == 3) {
                    this.field444 = this.field444 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field443 += var12;
                    if (this.field443 < 128) {
                        this.field443 = 128;
                    }
                    if (this.field443 > 383) {
                        this.field443 = 383;
                    }
                }
            }
        }
        int var11 = class59.field1518;
        class37.field1025 = true;
        class37.field1028 = 0;
        class37.field1026 = super.field1630 - 4;
        class37.field1027 = super.field1631 - 4;
        class46.method434(-327);
        this.field159.method535(-965, this.field443, var4, this.field441, this.field442, this.field444, this.field440);
        this.field159.method510(0);
        this.method209((byte) 92);
        this.method185((byte) 5);
        this.method130(this.field284, var11);
        this.method132(1915);
        this.field309.method265(4, 4, super.field1622, 0);
        this.field440 = var5;
        this.field441 = var6;
        this.field442 = var7;
        this.field443 = var8;
        this.field444 = var9;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method208(int arg0, int arg1) {
        signlink.wavevol = arg0;
        if (arg1 != 12065) {
            this.field242 = this.field470.method475();
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method209(byte arg0) {
        if (arg0 != 92) {
            this.field231 = -1;
        }
        this.field484 = 0;
        for (int var2 = -1; var2 < this.field355 + this.field106; ++var2) {
            class61 var19;
            if (var2 == -1) {
                var19 = field157;
            } else if (var2 < this.field106) {
                var19 = this.field105[this.field107[var2]];
            } else {
                var19 = this.field354[this.field356[var2 - this.field106]];
            }
            if (var19 != null && var19.method2(false)) {
                if (var19 instanceof class1) {
                    class47 var20 = ((class1) var19).field2;
                    if (var20.field1175 != null) {
                        var20 = var20.method446(223);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field106) {
                    class47 var24 = ((class1) var19).field2;
                    if (var24.field1193 >= 0 && var24.field1193 < this.field372.length) {
                        this.method105(var19.field1563 + 15, var19, -90);
                        if (this.field419 > -1) {
                            this.field372[var24.field1193].method223(this.field419 - 12, this.field420 - 30, 9);
                        }
                    }
                    if (this.field429 == 1 && this.field356[var2 - this.field106] == this.field396 && field183 % 20 < 10) {
                        this.method105(var19.field1563 + 15, var19, -90);
                        if (this.field419 > -1) {
                            this.field372[2].method223(this.field419 - 12, this.field420 - 28, 9);
                        }
                    }
                } else {
                    int var21 = 30;
                    class23 var22 = (class23) var19;
                    if (var22.field743 != 0) {
                        this.method105(var19.field1563 + 15, var19, -90);
                        if (this.field419 > -1) {
                            for (int var23 = 0; var23 < 8; ++var23) {
                                if ((var22.field743 & 1 << var23) != 0) {
                                    this.field372[var23].method223(this.field419 - 12, this.field420 - var21, 9);
                                    var21 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field429 == 10 && this.field107[var2] == this.field125) {
                        this.method105(var19.field1563 + 15, var19, -90);
                        if (this.field419 > -1) {
                            this.field372[7].method223(this.field419 - 12, this.field420 - var21, 9);
                        }
                    }
                }
                if (var19.field1564 != null && (var2 >= this.field106 || this.field438 == 0 || this.field438 == 3 || this.field438 == 1 && this.method158(this.field366, ((class23) var19).field733))) {
                    this.method105(var19.field1563, var19, -90);
                    if (this.field419 > -1 && this.field484 < this.field485) {
                        this.field489[this.field484] = this.field272.method281(var19.field1564, 987) / 2;
                        this.field488[this.field484] = this.field272.field723;
                        this.field486[this.field484] = this.field419;
                        this.field487[this.field484] = this.field420;
                        this.field490[this.field484] = var19.field1532;
                        this.field491[this.field484] = var19.field1525;
                        this.field492[this.field484] = var19.field1558;
                        this.field493[this.field484++] = var19.field1564;
                        if (this.field297 == 0 && var19.field1525 >= 1 && var19.field1525 <= 3) {
                            this.field488[this.field484] += 10;
                            this.field487[this.field484] += 5;
                        }
                        if (this.field297 == 0 && var19.field1525 == 4) {
                            this.field489[this.field484] = 60;
                        }
                        if (this.field297 == 0 && var19.field1525 == 5) {
                            this.field488[this.field484] += 5;
                        }
                    }
                }
                if (var19.field1568 > field183) {
                    this.method105(var19.field1563 + 15, var19, -90);
                    if (this.field419 > -1) {
                        int var25 = var19.field1569 * 30 / var19.field1570;
                        if (var25 > 30) {
                            var25 = 30;
                        }
                        class46.method436(this.field419 - 15, this.field420 - 3, 2, 65280, var25, 5);
                        class46.method436(this.field419 - 15 + var25, this.field420 - 3, 2, 16711680, 30 - var25, 5);
                    }
                }
                for (int var26 = 0; var26 < 4; ++var26) {
                    if (var19.field1554[var26] > field183) {
                        this.method105(var19.field1563 / 2, var19, -90);
                        if (this.field419 > -1) {
                            if (var26 == 1) {
                                this.field420 -= 20;
                            }
                            if (var26 == 2) {
                                this.field419 -= 15;
                                this.field420 -= 10;
                            }
                            if (var26 == 3) {
                                this.field419 += 15;
                                this.field420 -= 10;
                            }
                            this.field96[var19.field1553[var26]].method223(this.field419 - 12, this.field420 - 12, 9);
                            this.field270.method278(this.field420 + 4, String.valueOf(var19.field1552[var26]), 0, this.field419, 2);
                            this.field270.method278(this.field420 + 3, String.valueOf(var19.field1552[var26]), 16777215, this.field419 - 1, 2);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field484; ++var3) {
            int var4 = this.field486[var3];
            int var5 = this.field487[var3];
            int var6 = this.field489[var3];
            int var7 = this.field488[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field487[var18] - this.field488[var18] && var5 - var7 < this.field487[var18] + 2 && var4 - var6 < this.field489[var18] + this.field486[var18] && var4 + var6 > this.field486[var18] - this.field489[var18] && this.field487[var18] - this.field488[var18] < var5) {
                        var5 = this.field487[var18] - this.field488[var18];
                        var8 = true;
                    }
                }
            }
            this.field419 = this.field486[var3];
            this.field420 = this.field487[var3] = var5;
            String var9 = this.field493[var3];
            if (this.field297 == 0) {
                int var10 = 16776960;
                if (this.field490[var3] < 6) {
                    var10 = this.field385[this.field490[var3]];
                }
                if (this.field490[var3] == 6) {
                    var10 = this.field451 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field490[var3] == 7) {
                    var10 = this.field451 % 20 < 10 ? 255 : 65535;
                }
                if (this.field490[var3] == 8) {
                    var10 = this.field451 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field490[var3] == 9) {
                    int var11 = 150 - this.field492[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field490[var3] == 10) {
                    int var12 = 150 - this.field492[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field490[var3] == 11) {
                    int var13 = 150 - this.field492[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field491[var3] == 0) {
                    this.field272.method278(this.field420 + 1, var9, 0, this.field419, 2);
                    this.field272.method278(this.field420, var9, var10, this.field419, 2);
                }
                if (this.field491[var3] == 1) {
                    this.field272.method283(var9, 0, this.field419, this.field451, this.field420 + 1, (byte) 39);
                    this.field272.method283(var9, var10, this.field419, this.field451, this.field420, (byte) 39);
                }
                if (this.field491[var3] == 2) {
                    this.field272.method284(var9, this.field419, 0, 9, this.field420 + 1, this.field451);
                    this.field272.method284(var9, this.field419, var10, 9, this.field420, this.field451);
                }
                if (this.field491[var3] == 3) {
                    this.field272.method285(this.field419, 0, 0, 150 - this.field492[var3], this.field451, this.field420 + 1, var9);
                    this.field272.method285(this.field419, 0, var10, 150 - this.field492[var3], this.field451, this.field420, var9);
                }
                if (this.field491[var3] == 4) {
                    int var14 = this.field272.method281(var9, 987);
                    int var15 = (150 - this.field492[var3]) * (var14 + 100) / 150;
                    class46.method433(this.field419 + 50, 334, this.field419 - 50, -42775, 0);
                    this.field272.method282(var9, this.field419 + 50 - var15, 0, 619, this.field420 + 1);
                    this.field272.method282(var9, this.field419 + 50 - var15, var10, 619, this.field420);
                    class46.method432((byte) 75);
                }
                if (this.field491[var3] == 5) {
                    int var16 = 150 - this.field492[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class46.method433(512, this.field420 + 5, 0, -42775, this.field420 - this.field272.field723 - 1);
                    this.field272.method278(this.field420 + 1 + var17, var9, 0, this.field419, 2);
                    this.field272.method278(this.field420 + var17, var9, var10, this.field419, 2);
                    class46.method432((byte) 75);
                }
            } else {
                this.field272.method278(this.field420 + 1, var9, 0, this.field419, 2);
                this.field272.method278(this.field420, var9, 16776960, this.field419, 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)Z")
    public final boolean method210(int arg0) {
        if (arg0 <= 0) {
            this.field477.method20(56);
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZ)V")
    public final void method211(byte arg0, boolean arg1) {
        this.method112(5);
        this.field114.method264(this.field483);
        this.field383.method275(0, 0, 9);
        short var3 = 360;
        short var4 = 200;
        if (this.field142 == 0) {
            int var5 = var4 / 2 + 80;
            this.field270.method279(7711145, this.field346.field1115, 744, var5, true, var3 / 2);
            int var6 = var4 / 2 - 20;
            this.field272.method279(16776960, "Welcome to RuneScape", 744, var6, true, var3 / 2);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field384.method275(var7 - 73, var8 - 20, 9);
            this.field272.method279(16777215, "New User", 744, var8 + 5, true, var7);
            int var9 = var3 / 2 + 80;
            this.field384.method275(var9 - 73, var8 - 20, 9);
            this.field272.method279(16777215, "Existing User", 744, var8 + 5, true, var9);
        }
        if (this.field142 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field228.length() > 0) {
                this.field272.method279(16776960, this.field228, 744, var10 - 15, true, var3 / 2);
                this.field272.method279(16776960, this.field229, 744, var10, true, var3 / 2);
                var10 += 30;
            } else {
                this.field272.method279(16776960, this.field229, 744, var10 - 7, true, var3 / 2);
                var10 += 30;
            }
            this.field272.method286(16777215, "Username: " + this.field460 + (this.field362 == 0 & field183 % 40 < 20 ? "@yel@|" : ""), var3 / 2 - 90, true, var10, 0);
            var10 += 15;
            this.field272.method286(16777215, "Password: " + class71.method592(this.field461, 323) + (this.field362 == 1 & field183 % 40 < 20 ? "@yel@|" : ""), var3 / 2 - 88, true, var10, 0);
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field384.method275(var11 - 73, var12 - 20, 9);
                this.field272.method279(16777215, "Login", 744, var12 + 5, true, var11);
                int var13 = var3 / 2 + 80;
                this.field384.method275(var13 - 73, var12 - 20, 9);
                this.field272.method279(16777215, "Cancel", 744, var12 + 5, true, var13);
            }
        }
        if (this.field142 == 3) {
            this.field272.method279(16776960, "Create a free account", 744, var4 / 2 - 60, true, var3 / 2);
            int var14 = var4 / 2 - 35;
            this.field272.method279(16777215, "To create a new account you need to", 744, var14, true, var3 / 2);
            int var18 = var14 + 15;
            this.field272.method279(16777215, "go back to the main RuneScape webpage", 744, var18, true, var3 / 2);
            int var19 = var18 + 15;
            this.field272.method279(16777215, "and choose the red 'create account'", 744, var19, true, var3 / 2);
            int var20 = var19 + 15;
            this.field272.method279(16777215, "button at the top right of that page.", 744, var20, true, var3 / 2);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field384.method275(var15 - 73, var16 - 20, 9);
            this.field272.method279(16777215, "Cancel", 744, var16 + 5, true, var15);
        }
        this.field114.method265(171, 202, super.field1622, 0);
        if (arg0 != -128) {
            field378 = !field378;
        }
        if (this.field208) {
            this.field208 = false;
            this.field112.method265(0, 128, super.field1622, 0);
            this.field113.method265(371, 202, super.field1622, 0);
            this.field117.method265(265, 0, super.field1622, 0);
            this.field118.method265(265, 562, super.field1622, 0);
            this.field119.method265(171, 128, super.field1622, 0);
            this.field120.method265(171, 562, super.field1622, 0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LCFARFRSG;II)V")
    private final void method212(class8 arg0, int arg1, int arg2) {
        while (true) {
            if (arg0.field73 + 21 < arg1 * 8) {
                int var4 = arg0.method41(881, 14);
                if (var4 != 16383) {
                    if (this.field354[var4] == null) {
                        this.field354[var4] = new class1();
                    }
                    class1 var5 = this.field354[var4];
                    this.field356[this.field355++] = var4;
                    var5.field1537 = field183;
                    var5.field2 = class47.method444(arg0.method41(881, 12));
                    int var6 = arg0.method41(881, 1);
                    if (var6 == 1) {
                        this.field109[this.field108++] = var4;
                    }
                    int var7 = arg0.method41(881, 1);
                    int var8 = arg0.method41(881, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = arg0.method41(881, 5);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.field1565 = var5.field2.field1190;
                    var5.field1526 = var5.field2.field1206;
                    var5.field1538 = var5.field2.field1186;
                    var5.field1539 = var5.field2.field1212;
                    var5.field1540 = var5.field2.field1182;
                    var5.field1541 = var5.field2.field1194;
                    var5.field1566 = var5.field2.field1197;
                    var5.method565(var7 == 1, field157.field1536[0] + var8, -623, field157.field1535[0] + var9);
                    continue;
                }
            }
            arg0.method42(0);
            if (arg2 <= 0) {
                this.field111 = null;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method213(int arg0) {
        this.field308.method264(this.field483);
        if (this.field514 == 2) {
            byte[] var2 = this.field173.field703;
            int[] var3 = class46.field1161;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field199.method227(this.field390, 7, 25, this.field314, 0, 256, this.field349, 25, 33, 33, 0);
            this.field309.method264(this.field483);
        } else {
            int var6 = this.field349 + this.field332 & 2047;
            int var7 = field157.field1555 / 32 + 48;
            int var8 = 464 - field157.field1556 / 32;
            this.field150.method227(this.field138, 7, var7, this.field209, 25, this.field285 + 256, var6, var8, 151, 146, 5);
            this.field199.method227(this.field390, 7, 25, this.field314, 0, 256, this.field349, 25, 33, 33, 0);
            for (int var9 = 0; var9 < this.field160; ++var9) {
                int var39 = this.field161[var9] * 4 + 2 - field157.field1555 / 32;
                int var40 = this.field162[var9] * 4 + 2 - field157.field1556 / 32;
                this.method159(610, var39, this.field170[var9], var40);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class9 var36 = this.field111[this.field302][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field157.field1555 / 32;
                        int var38 = var35 * 4 + 2 - field157.field1556 / 32;
                        this.method159(610, var37, this.field507, var38);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field355; ++var11) {
                class1 var31 = this.field354[this.field356[var11]];
                if (var31 != null && var31.method2(false)) {
                    class47 var32 = var31.field2;
                    if (var32.field1175 != null) {
                        var32 = var32.method446(223);
                    }
                    if (var32 != null && var32.field1191 && var32.field1210) {
                        int var33 = var31.field1555 / 32 - field157.field1555 / 32;
                        int var34 = var31.field1556 / 32 - field157.field1556 / 32;
                        this.method159(610, var33, this.field508, var34);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field106; ++var12) {
                class23 var23 = this.field105[this.field107[var12]];
                if (var23 != null && var23.method2(false)) {
                    int var24 = var23.field1555 / 32 - field157.field1555 / 32;
                    int var25 = var23.field1556 / 32 - field157.field1556 / 32;
                    boolean var26 = false;
                    long var27 = class71.method587(var23.field733);
                    for (int var29 = 0; var29 < this.field376; ++var29) {
                        if (this.field331[var29] == var27 && this.field204[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field157.field749 != 0 && var23.field749 != 0 && field157.field749 == var23.field749) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method159(610, var24, this.field510, var25);
                    } else if (var30) {
                        this.method159(610, var24, this.field511, var25);
                    } else {
                        this.method159(610, var24, this.field509, var25);
                    }
                }
            }
            if (this.field429 != 0 && field183 % 20 < 10) {
                if (this.field429 == 1 && this.field396 >= 0 && this.field396 < this.field354.length) {
                    class1 var13 = this.field354[this.field396];
                    if (var13 != null) {
                        int var14 = var13.field1555 / 32 - field157.field1555 / 32;
                        int var15 = var13.field1556 / 32 - field157.field1556 / 32;
                        this.method92(var14, (byte) 4, var15, this.field137);
                    }
                }
                if (this.field429 == 2) {
                    int var16 = (this.field334 - this.field453) * 4 + 2 - field157.field1555 / 32;
                    int var17 = (this.field335 - this.field454) * 4 + 2 - field157.field1556 / 32;
                    this.method92(var16, (byte) 4, var17, this.field137);
                }
                if (this.field429 == 10 && this.field125 >= 0 && this.field125 < this.field105.length) {
                    class23 var18 = this.field105[this.field125];
                    if (var18 != null) {
                        int var19 = var18.field1555 / 32 - field157.field1555 / 32;
                        int var20 = var18.field1556 / 32 - field157.field1556 / 32;
                        this.method92(var19, (byte) 4, var20, this.field137);
                    }
                }
            }
            if (this.field148 != 0) {
                int var21 = this.field148 * 4 + 2 - field157.field1555 / 32;
                int var22 = this.field149 * 4 + 2 - field157.field1556 / 32;
                this.method159(610, var21, this.field136, var22);
            }
            class46.method436(97, 78, 2, 16777215, 3, 3);
            if (arg0 == 26351) {
                this.field309.method264(this.field483);
            }
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    public static final void method214(int arg0) {
        class57.field1424 = true;
        class59.field1498 = true;
        if (arg0 != 0) {
            field293 = !field293;
        }
        field328 = true;
        class14.field618 = true;
        class54.field1345 = true;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(JI)V")
    public final void method215(long arg0, int arg1) {
        if (arg1 != 0) {
            this.field546 = !this.field546;
        }
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field382; ++var4) {
                if (this.field318[var4] == arg0) {
                    --this.field382;
                    this.field91 = true;
                    for (int var5 = var4; var5 < this.field382; ++var5) {
                        this.field318[var5] = this.field318[var5 + 1];
                    }
                    this.field477.method19(5, 687);
                    this.field477.method26((byte) 9, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method216(byte arg0) {
        int var2 = 5;
        this.field389[8] = 0;
        if (this.field387 != arg0) {
            this.field111 = null;
        }
        int var3 = 0;
        while (this.field389[8] == 0) {
            String var4 = "Unknown problem";
            this.method206(9, 20, "Connecting to web server");
            try {
                DataInputStream var5 = this.method140("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 332);
                class8 var6 = new class8(new byte[40], 792);
                var5.readFully(var6.field71, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field389[var7] = var6.method35();
                }
                int var8 = var6.method35();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field389[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field389[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field389[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field389[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field389[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field389[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method206(9, 10, "Game updated - please reload page");
                        var11 = 10;
                    } else {
                        this.method206(9, 10, var4 + " - Will retry in " + var11 + " secs.");
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
                this.field294 = !this.field294;
            }
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field343) {
            this.method123(false);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILCFARFRSG;LFHQGDDHF;)V")
    private final void method217(int arg0, int arg1, int arg2, class8 arg3, class23 arg4) {
        if (arg0 != 17845) {
            this.field536 = !this.field536;
        }
        if ((arg2 & 128) != 0) {
            int var6 = arg3.method51(11818);
            int var7 = arg3.method49(887);
            arg4.method568(var6, var7, field183, 491);
            arg4.field1568 = field183 + 300;
            arg4.field1569 = arg3.method30();
            arg4.field1570 = arg3.method51(11818);
        }
        if ((arg2 & 16) != 0) {
            arg4.field1564 = arg3.method37();
            if (arg4.field1564.charAt(0) == '~') {
                arg4.field1564 = arg4.field1564.substring(1);
                this.method120(arg4.field1564, arg4.field733, 2, 2);
            } else if (field157 == arg4) {
                this.method120(arg4.field1564, arg4.field733, 2, 2);
            }
            arg4.field1532 = 0;
            arg4.field1525 = 0;
            arg4.field1558 = 150;
        }
        if ((arg2 & 64) != 0) {
            int var8 = arg3.method57((byte) 1);
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg3.method30();
            if (arg4.field1571 == var8 && var8 != -1) {
                int var10 = class32.field816[var8].field830;
                if (var10 == 1) {
                    arg4.field1572 = 0;
                    arg4.field1573 = 0;
                    arg4.field1574 = var9;
                    arg4.field1575 = 0;
                }
                if (var10 == 2) {
                    arg4.field1575 = 0;
                }
            } else if (var8 == -1 || arg4.field1571 == -1 || class32.field816[var8].field824 >= class32.field816[arg4.field1571].field824) {
                arg4.field1571 = var8;
                arg4.field1572 = 0;
                arg4.field1573 = 0;
                arg4.field1574 = var9;
                arg4.field1575 = 0;
                arg4.field1560 = arg4.field1550;
            }
        }
        if ((arg2 & 256) != 0) {
            arg4.field1527 = arg3.method32();
            int var11 = arg3.method35();
            arg4.field1531 = var11 >> 16;
            arg4.field1530 = (var11 & 65535) + field183;
            arg4.field1528 = 0;
            arg4.field1529 = 0;
            if (arg4.field1530 > field183) {
                arg4.field1528 = -1;
            }
            if (arg4.field1527 == 65535) {
                arg4.field1527 = -1;
            }
        }
        if ((arg2 & 32) != 0) {
            arg4.field1576 = arg3.method57((byte) 1);
            if (arg4.field1576 == 65535) {
                arg4.field1576 = -1;
            }
        }
        if ((arg2 & 512) != 0) {
            int var12 = arg3.method30();
            int var13 = arg3.method49(887);
            arg4.method568(var12, var13, field183, 491);
            arg4.field1568 = field183 + 300;
            arg4.field1569 = arg3.method51(11818);
            arg4.field1570 = arg3.method50((byte) 70);
        }
        if ((arg2 & 8) != 0) {
            arg4.field1533 = arg3.method57((byte) 1);
            arg4.field1534 = arg3.method32();
        }
        if ((arg2 & 1) != 0) {
            int var14 = arg3.method30();
            byte[] var15 = new byte[var14];
            class8 var16 = new class8(var15, 792);
            arg3.method67(var15, 0, var14, 0);
            this.field110[arg1] = var16;
            arg4.method295(var16, -54);
        }
        if ((arg2 & 2) != 0) {
            int var17 = arg3.method32();
            int var18 = arg3.method50((byte) 70);
            int var19 = arg3.method51(11818);
            int var20 = arg3.field72;
            if (arg4.field733 != null && arg4.field751) {
                long var21 = class71.method587(arg4.field733);
                boolean var23 = false;
                if (var18 <= 1) {
                    for (int var24 = 0; var24 < this.field382; ++var24) {
                        if (this.field318[var24] == var21) {
                            var23 = true;
                            break;
                        }
                    }
                }
                if (!var23 && this.field397 == 0) {
                    try {
                        this.field353.field72 = 0;
                        arg3.method39(var19, 0, 0, this.field353.field71);
                        this.field353.field72 = 0;
                        String var25 = class18.method267(-916, var19, this.field353);
                        String var26 = class43.method382(-211, var25);
                        arg4.field1564 = var26;
                        arg4.field1532 = var17 >> 8;
                        arg4.field1525 = var17 & 255;
                        arg4.field1558 = 150;
                        if (var18 != 2 && var18 != 3) {
                            if (var18 == 1) {
                                this.method120(var26, "@cr1@" + arg4.field733, 2, 1);
                            } else {
                                this.method120(var26, arg4.field733, 2, 2);
                            }
                        } else {
                            this.method120(var26, "@cr2@" + arg4.field733, 2, 1);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg3.field72 = var19 + var20;
        }
        if ((arg2 & 1024) != 0) {
            arg4.field1543 = arg3.method51(11818);
            arg4.field1545 = arg3.method51(11818);
            arg4.field1544 = arg3.method51(11818);
            arg4.field1546 = arg3.method30();
            arg4.field1547 = arg3.method57((byte) 1) + field183;
            arg4.field1548 = arg3.method59(this.field548) + field183;
            arg4.field1549 = arg3.method49(887);
            arg4.method567(true);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field129[var1] = var0 / 4;
        }
        field185 = 3;
        field186 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field192 = true;
        field249 = -731;
        field252 = 3;
        field260 = 687;
        field293 = true;
        field317 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field325 = 10;
        field327 = true;
        field329 = -524;
        field369 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field378 = true;
        field449 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field534 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field534[var3] = var2 - 1;
            var2 += var2;
        }
        field549 = -288;
    }
}
